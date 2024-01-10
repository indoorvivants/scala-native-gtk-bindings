import cats.syntax.all.*
import com.indoorvivants.gnome.gir_schema.*
import rendition.*
import scalaxb.fromXML
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import scala.jdk.CollectionConverters.*
import scala.util.boundary
import scala.xml.XML
import boundary.break
import scala.annotation.tailrec

case class GlobalKnowledge(
    reader: Reader,
    repository: AugmentedRepository,
    policy: NamingPolicy
):
  lazy val names =
    @tailrec
    def go(
        repos: Seq[AugmentedRepository],
        res: Map[String, (String, NameType)],
        visited: Set[String]
    ): Map[String, (String, NameType)] =
      boundary:
        if repos.isEmpty then boundary.break(res)

        scribe.info(s"Traversing ${repos.map(_.id)}")
        val names = Map.newBuilder[String, (String, NameType)]
        val deps = Set.newBuilder[String]

        repos.foreach: repo =>
          if !visited.contains(repo.id) then
            val namespace = repo.namespace.get

            val namespaceName = namespace.name.get
            scribe.info(s"Processing $namespaceName")
            deps.addAll(repo.dependencies)
            val fluentPackage = policy.namespaceToPackage(namespaceName) + ".fluent"
            val internalPackage = policy.namespaceToPackage(namespaceName) + ".internal"

            val variants: Seq[String => String] =
              if repo.id == repository.id then
                Seq(c => namespaceName + "." + c, identity)
              else Seq(namespaceName + "." + _)

            namespace.classes
              .foreach: cls =>
                names ++= variants.map(v =>
                  v(
                    cls.name
                  ) -> (fluentPackage + "." + cls.name, NameType.Class)
                )

            namespace.interfaces
              .foreach: iface =>
                names ++= variants.map(v =>
                  v(
                    iface.name
                  ) -> (fluentPackage + "." + iface.name, NameType.Class)
                )

            namespace.enumerations
              .foreach: enumeration =>
                names ++= variants.map(v =>
                  v(
                    enumeration.name
                  ) -> (enumeration.typeValue, NameType.Enumeration)
                )

        go(
          deps.result().filterNot(visited.contains).map(reader(_)).toSeq,
          names.result() ++ res,
          visited ++ repos.map(_.id)
        )
    end go

    go(Seq(repository), Map.empty, Set.empty)
  end names
end GlobalKnowledge

