import com.indoorvivants.gnome.gir_schema.*
import java.nio.file.Paths
import scala.xml.XML
import scalaxb.fromXML
import java.nio.file.Path
import java.nio.file.Files
import scala.jdk.CollectionConverters.*

@main def hello(girFilesPath: String) =
  val root = Paths.get(girFilesPath).toAbsolutePath()
  val includeResolver = IncludeResolver(root)
  val reader = Reader(includeResolver)
  println(reader("gdkwayland-4.0").dependencies)
  println(reader("gdkwayland-4.0").namespace.get.name)
end hello
