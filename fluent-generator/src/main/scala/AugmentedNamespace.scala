import com.indoorvivants.gnome.gir_schema.*
import java.nio.file.Paths
import scala.xml.XML
import scalaxb.fromXML
import java.nio.file.Path
import java.nio.file.Files
import scala.jdk.CollectionConverters.*
import scala.reflect.ClassTag

case class AugmentedNamespace(n: Namespace):
  export n.*

  def collect[T: scala.reflect.ClassTag] =
    val ct = summon[ClassTag[T]]
    n.namespaceoption.collect:
      case d if ct.unapply(d.value).isDefined => d.as[T]

  lazy val interfaces: Seq[Interface] =
    collect[Interface]

  lazy val classes: Seq[Class] =
    collect[Class]
end AugmentedNamespace
