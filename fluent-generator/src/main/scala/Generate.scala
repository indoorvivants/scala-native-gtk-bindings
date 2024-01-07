import com.indoorvivants.gnome.gir_schema.*
import java.nio.file.Paths
import scala.xml.XML
import scalaxb.fromXML
import java.nio.file.Path
import java.nio.file.Files
import scala.jdk.CollectionConverters.*
import rendition.*

@main def hello(girFilesPath: String) =
  val root = Paths.get(girFilesPath).toAbsolutePath()
  val includeResolver = IncludeResolver(root)
  val reader = Reader(includeResolver)
  val newValue = reader("gio-2.0").namespace.get

  val lb = LineBuilder()

  lb.render { r =>
    import r.*

    renderNamespace(r, newValue)

  }

  println(lb.result)

end hello

def renderNamespace(r: Rendering, ns: AugmentedNamespace) =
  r.use:
    import r.*
    ns.interfaces.map: iface =>
      line(s"trait ${iface.name}")
