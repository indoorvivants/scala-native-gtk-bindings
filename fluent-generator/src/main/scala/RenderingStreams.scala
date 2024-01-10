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

case class RenderingStreams():
  private val streams = collection.mutable.Map.empty[String, LineBuilder]
  def get(name: String) =
    streams.getOrElseUpdate(name, LineBuilder())

  def in(name: String)(f: Rendering => Unit) =
    f(get(name).rendering())

  def renderMapping() =
    streams.toMap.map((k, v) => k -> v.result)
end RenderingStreams
