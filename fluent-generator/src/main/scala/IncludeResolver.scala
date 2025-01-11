import com.indoorvivants.gnome.gir_schema.*
import java.nio.file.Paths
import scala.xml.XML
import scalaxb.fromXML
import java.nio.file.Path
import java.nio.file.Files
import scala.jdk.CollectionConverters.*

case class IncludeResolver(private val mapping: Map[String, Path]):
  def apply(name: String): Path = mapping(name.toLowerCase())

object IncludeResolver:
  def apply(root: Path) =
    val files = Files
      .walk(root)
      .filter: p =>
        p.toFile().isFile() && p.getFileName().toString().endsWith(".gir")
      .toList
      .asScala
      .map: p =>
        p.getFileName().toString().stripSuffix(".gir").toLowerCase() -> p
      .toMap

    new IncludeResolver(files)
  end apply
end IncludeResolver
