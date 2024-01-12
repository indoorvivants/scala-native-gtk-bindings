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

case class GlobalName(
    short: String,
    effects: List[Effect],
    tpe: NameType
)

object GlobalName:
  def internal(short: String, namespace: String, tpe: NameType)(using
      NamingPolicy
  ) =
    GlobalName(
      short,
      List(
        Effect.RequiresImport(
          summon[NamingPolicy].namespaceToInternalPackage(namespace),
          short
        )
      ),
      tpe
    )
  def fluent(short: String, namespace: String, tpe: NameType)(using
      NamingPolicy
  ) =
    GlobalName(
      short,
      List(
        Effect.RequiresImport(
          summon[NamingPolicy].namespaceToFluentPackage(namespace),
          short
        )
      ),
      tpe
    )
end GlobalName

case class GlobalKnowledge(
    reader: Reader,
    repository: AugmentedRepository,
    policy: NamingPolicy
):

  given NamingPolicy = policy

  lazy val names =
    @tailrec
    def go(
        repos: Seq[AugmentedRepository],
        res: Map[String, GlobalName],
        visited: Set[String]
    ): Map[String, GlobalName] =
      boundary:
        if repos.isEmpty then boundary.break(res)

        scribe.info(s"Traversing ${repos.map(_.id)}")
        val names = Map.newBuilder[String, GlobalName]
        val deps = Set.newBuilder[String]

        repos.foreach: repo =>
          if !visited.contains(repo.id) then
            val namespace = repo.namespace.get

            val namespaceName = namespace.name.get
            scribe.info(s"Processing $namespaceName")
            deps.addAll(repo.dependencies)

            val fluentPackage =
              policy.namespaceToPackage(namespaceName) + ".fluent"

            val internalPackage =
              policy.namespaceToPackage(namespaceName) + ".internal"

            val variants: Seq[String => String] =
              if repo.id == repository.id then
                Seq(c => namespaceName + "." + c, identity)
              else Seq(namespaceName + "." + _)

            val allVariants: Seq[String => String] =
              Seq(c => namespaceName + "." + c, identity)

            import GlobalName.*

            namespace.classes
              .foreach: cls =>
                names ++= variants.map(v =>
                  v(
                    cls.name
                  ) -> fluent(
                    cls.name,
                    namespaceName,
                    NameType.Class
                  ) // (fluentPackage + "." + cls.name, NameType.Class)
                )

            namespace.interfaces
              .foreach: iface =>
                names ++= variants.map(v =>
                  v(
                    iface.name
                  ) -> fluent(
                    iface.name,
                    namespaceName,
                    NameType.Interface
                  )
                )

            namespace.enumerations
              .foreach: enumeration =>
                names ++= variants.map(v =>
                  v(
                    enumeration.name
                  ) -> internal(
                    enumeration.typeValue,
                    namespaceName,
                    NameType.Enumeration
                  )
                )

            namespace.bitfields
              .foreach: bitfield =>
                names ++= variants.map(v =>
                  v(
                    bitfield.name
                  ) -> internal(
                    bitfield.typeValue,
                    namespaceName,
                    NameType.Bitfield
                  )
                )
            namespace.callbacks
              .foreach: callback =>
                names ++= allVariants.map(v =>
                  v(
                    callback.name
                  ) -> internal(
                    callback.typeValue,
                    namespaceName,
                    NameType.Callback
                  )
                )

                names ++= allVariants.map(v =>
                  v(
                    callback.typeValue
                  ) -> internal(
                    callback.typeValue,
                    namespaceName,
                    NameType.Callback
                  )
                )
            namespace.aliases
              .foreach: alias =>
                names ++= allVariants.map(v =>
                  v(
                    alias.typeValue
                  ) -> internal(alias.typeValue, namespaceName, NameType.Alias)
                )

            namespace.records
              .foreach: record =>
                names ++= allVariants.map(v =>
                  v(
                    record.typeValue
                  ) -> internal(
                    record.typeValue,
                    namespaceName,
                    NameType.Record
                  )
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
