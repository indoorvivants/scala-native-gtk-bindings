import com.indoorvivants.gnome.gir_schema.*
import java.nio.file.Paths
import scala.xml.XML
import scalaxb.fromXML
import java.nio.file.Path
import java.nio.file.Files
import scala.jdk.CollectionConverters.*

case class Reader(resolver: IncludeResolver):
  private val cache = collection.mutable.Map.empty[String, AugmentedRepository]
  def apply(name: String) =
    cache.getOrElseUpdate(
      name.toLowerCase(), {
        val path = resolver(name).toFile()
        scribe.info(s"Reading module $name from $path")
        val xml = XML.loadFile(path)
        AugmentedRepository(name.toLowerCase(), fromXML[Repository](xml))
      }
    )

  def fromPackage(name: String, version: String) = apply(name + "-" + version)
end Reader
