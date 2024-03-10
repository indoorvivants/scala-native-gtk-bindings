import cats.syntax.all.*
import com.indoorvivants.gnome.gir_schema.*
import rendition.*
import scalaxb.fromXML

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import scala.jdk.CollectionConverters.*
import scala.util.boundary, boundary.*
import scala.xml.XML

import scala.annotation.tailrec
import scribe.LogFeature
import scribe.LogRecord

case class CLI(
    girFiles: Path,
    out: Path,
    module: String,
    dumpFileList: Option[Path]
)

val config =
  import com.monovore.decline.*
  val userOpt =
    Opts.option[Path]("gir-files", help = "Location of GIR files")

  val out = Opts.option[Path]("out", help = "Where to output generated files")
  val dumpFileList = Opts
    .option[Path](
      "dump-files-list",
      help = "Dump list of generated files into some location"
    )
    .orNone
  val module = Opts
    .option[String]("module", help = "Module to render (e.g. gdkpixbuf-2.0)")

  Command("generate", "?")((userOpt, out, module, dumpFileList).mapN(CLI.apply))
end config

@main def hello(args: String*) =
  config.parse(args) match
    case Left(value) =>
      System.err.println(value)
      if value.errors.nonEmpty then sys.exit(1)

    case Right(value) =>
      val root = os.Path(value.girFiles.toAbsolutePath())
      val target = os.Path(value.out.toAbsolutePath())
      os.makeDir.all(target)
      val includeResolver = IncludeResolver(root.toNIO)
      val reader = Reader(includeResolver)

      val repository = reader(value.module)
      val policy = NamingPolicy(
        namespaceToPackage = nm => s"sn.gnome.${nm.toLowerCase()}"
      )

      val streams = RenderingStreams()
      val globalKnowledge = GlobalKnowledge(reader, repository, policy)

      renderNamespace(
        r = streams,
        namespace = repository.namespace.get,
        global = globalKnowledge,
        policy = policy
      )

      val nonEmptyFiles = List.newBuilder[os.Path]

      streams
        .renderMapping()
        .foreach: (relative, contents) =>
          val filePath = target / relative
          if contents.trim.nonEmpty then
            scribe.debug(s"Rendering ${relative}")
            os.write.over(filePath, contents)
            nonEmptyFiles += filePath
          else scribe.warn(s"Filepath $filePath was empty, not writing to disk")

      value.dumpFileList.foreach: path =>
        os.write.over(
          os.Path(path),
          nonEmptyFiles.result().map(_.toNIO.toString).mkString(System.lineSeparator()),
          createFolders = true
        )
        scribe.info(s"List of rendered files was dumped into `$path`")

end hello

def camelify(name: String) =
  val els = name.split("_").map(_.capitalize)
  els(0) = els(0).toLowerCase()
  els.mkString

def context(args: (String, String)*) =
  args.map(_ + "=" + _).mkString(", ")
