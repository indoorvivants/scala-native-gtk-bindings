import com.indoorvivants.gnome.gir_schema.*
import java.nio.file.Paths
import scala.xml.XML
import scalaxb.fromXML
import java.nio.file.Path
import java.nio.file.Files
import scala.jdk.CollectionConverters.*

case class AugmentedRepository(r: Repository):
  export r.*

  lazy val dependencies: Seq[String] =
    r.repositoryoption
      .map(_.value)
      .collect:
        case i @ Include(_) =>
          i.name + "-" + i.version.get
      .map(_.toLowerCase())

  lazy val namespace: Option[Namespace] =
    r.repositoryoption
      .map(_.value)
      .collectFirst:
        case i: Namespace => i
end AugmentedRepository
