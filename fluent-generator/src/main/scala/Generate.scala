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
import scribe.LogFeature
import scribe.LogRecord

case class CLI(
    girFiles: Path,
    out: Path,
    module: String
)

val config =
  import com.monovore.decline.*
  val userOpt =
    Opts.option[Path]("gir-files", help = "Location of GIR files")

  val out = Opts.option[Path]("out", help = "Where to output generated files")
  val module = Opts
    .option[String]("module", help = "Module to render (e.g. gdkpixbuf-2.0)")

  Command("generate", "?")((userOpt, out, module).mapN(CLI.apply))
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
        ns = repository.namespace.get,
        global = globalKnowledge,
        policy = policy
      )

      streams
        .renderMapping()
        .foreach: (relative, contents) =>
          val filePath = target / relative
          scribe.info(s"Rendering ${filePath}")
          os.write.over(filePath, contents)

end hello

case class NamingPolicy(
    namespaceToPackage: String => String
):
  def namespaceToFluentPackage(name: String) =
    namespaceToPackage(name) + ".fluent"
  def namespaceToInternalPackage(name: String) =
    namespaceToPackage(name) + ".internal"

enum NameType:
  case Class, Interface, Enumeration

def renderNamespace(
    r: RenderingStreams,
    ns: AugmentedNamespace,
    global: GlobalKnowledge,
    policy: NamingPolicy
) =
  def extensions(parent: Option[String], impl: Seq[Implements]) =
    val ext = parent.toSeq ++ impl.map(_.name)
    if ext.nonEmpty then " extends " + ext.mkString(", ")
    else ""

  val fluentPackageName = policy.namespaceToFluentPackage(ns.name.get)
  val internalPackageName = policy.namespaceToInternalPackage(ns.name.get)

  ns.interfaces.map: iface =>
    r.in(iface.name + ".scala"): rend =>
      import rend.*
      rend.use:
        line(s"package $fluentPackageName")
        emptyLine()
        line(s"import $internalPackageName.all.*")
        emptyLine()

        emptyLine()
        line(s"trait ${iface.name}${extensions(None, iface.implements)}")

  given GlobalKnowledge = global

  def renderParameters(
      params: Seq[Parameter | Instanceu45parameter],
      methodLabel: String
  )(using
      boundary.Label[String]
  ) =
    params
      .map:
        case param: Parameter =>
          val paramType = renderType(
            param.tpe.getOrElse(
              break(
                s"$methodLabel, param: ${param.name}: type is empty"
              )
            )
          )

          val paramName = escape(param.name.get)

          val parameter = paramName + " : " + paramType.scalaRepr

          val argument = paramType.finalForm(paramName)

          (Some(parameter), argument)

        case param: Instanceu45parameter =>
          (None, "this.raw")
      .unzip

  ns.classes.map: cls =>
    r.in(cls.name + ".scala"): rend =>
      import rend.*
      rend.use:
        line(s"package $fluentPackageName")
        emptyLine()
        line(s"import $internalPackageName.all.*")
        emptyLine()

        val skippedBecause =
          boundary:
            val cTypeName = cls.attributes.get("@type").map(_.as[String])
            val cType =
              cTypeName.getOrElse(break("c:type missing"))
            val data = s"(private[fluent] val raw: Ptr[$cType])"
            block(
              s"class ${cls.name}$data${extensions(cls.parent, cls.implements)}:",
              s"end ${cls.name}"
            ):
              cls.methods.foreach: meth =>
                boundary:
                  val camelName = camelify(meth.name)
                  val cMethod = meth.identifier
                  val (params, arguments) =
                    renderParameters(meth.parameters, s"method: ${meth.name}")
                  val returnType = renderType(
                    meth.returnType.getOrElse(
                      break(s"method: ${meth.name}, return type missing")
                    )
                  )
                  val serialisedParams = params.flatten
                    .mkString(", ")
                  val serialisedArguments = arguments.mkString(", ")

                  line(
                    s"def $camelName(${serialisedParams}): ${returnType.scalaRepr} = $cMethod(${serialisedArguments})"
                  )
                  emptyLine()

            emptyLine()

            block(s"object ${cls.name}:", s"end ${cls.name}"):
              cls.constructors.foreach: constructor =>
                val cConstructor = constructor.identifier
                val sanitisedName = constructor.name match
                  case "new" => "apply"
                  case s"new_$rest" =>
                    camelify(rest)
                val (params, arguments) =
                  renderParameters(
                    constructor.parameters,
                    s"constructor: ${constructor.name}"
                  )
                val serialisedParams = params.flatten
                  .mkString(", ")
                val serialisedArguments = arguments.mkString(", ")
                line(
                  s"def $sanitisedName($serialisedParams): ${cls.name} = ${cls.name}(${cConstructor}($serialisedArguments))"
                )
                emptyLine()

        skippedBecause match
          case msg: String =>
            scribe.warn(s"${cls.name} is broken: `$msg`")
          case _ =>
end renderNamespace

def camelify(name: String) =
  val els = name.split("_").map(_.capitalize)
  els(0) = els(0).toLowerCase()
  els.mkString

def context(args: (String, String)*) =
  args.map(_ + "=" + _).mkString(", ")

case class TypeMapping(
    scalaRepr: String,
    effects: List[Effect],
    massage: List[Massage]
):
  def finalForm(ref: String) =
    massage.foldLeft(ref): (cur, m) =>
      m.render(cur)

  def withMassage(m: Massage) = copy(massage = massage :+ m)
  def withEffect(e: Effect) = copy(effects = effects :+ e)
end TypeMapping

object TypeMapping:
  def apply(rer: String): TypeMapping = TypeMapping(rer, Nil, Nil)

enum Massage:
  case Apply(what: String)
  case Field(what: String)
  case Cast(toWhat: String)

  def render(around: String) =
    this match
      case Apply(what) => s"$what($around)"
      case Field(what) => s"$around.$what"
      case Cast(what)  => s"$around.asInstanceOf[$what]"
end Massage

enum Effect:
  case RequiresZone
  case RequiresImport(namespace: String, definition: String)

def renderType(tpe: Type | ArrayType)(using
    global: GlobalKnowledge
): TypeMapping =
  def knownCType(tpe: Type) =
    def whenFull(name: String, cName: String)(result: String) =
      Option
        .when(tpe.name.contains(name) && tpe.typeValue.trim == cName)(
          TypeMapping(result)
        )
    def whenTypeValue(cName: String)(result: String) =
      Option
        .when(tpe.typeValue.trim == cName)(
          TypeMapping(result)
        )

    List(
      whenFull("utf8", "const char*")("String"),
      whenFull("utf8", "const gchar*")("String"),
      whenFull("gfloat", "gfloat")("Float"),
      whenFull("gint", "gint")("Int"),
      whenFull("gint", "int")("Int"),
      whenFull("gboolean", "gboolean")("Boolean"),
      whenFull("gdouble", "double")("Double"),
      whenFull("filename", "const char*")("String"),
      whenFull("gpointer", "gpointer")("Ptr[Byte]"),
      whenFull("gpointer", "gpointer")("Ptr[Byte]"),
      whenFull("guint8", "guint8")("UByte"),
      whenFull("guint8", "guchar")("UByte"),
      whenFull("guint16", "guint16")("UShort"),
      whenFull("guint32", "guint32")("UInt"),
      whenFull("guint64", "guint64")("ULong"),
      whenFull("gulong", "gulong")("ULong"),
      whenTypeValue("void")("Unit")
    ).reduce(_ orElse _) match
      case None =>
        scribe.warn(
          "Unknown fallback type: ",
          context("name" -> tpe.name.toString, "typeValue" -> tpe.typeValue)
        )
        None
      case other => other
    end match
  end knownCType

  tpe match
    case tpe: Type =>
      tpe.name
        .flatMap(global.names.get)
        .map:
          case (n, NameType.Class) =>
            TypeMapping(n).withMassage(Massage.Field("raw"))
          case (n, NameType.Interface) =>
            TypeMapping(n)
          case (n, NameType.Enumeration) =>
            TypeMapping(n)
        .orElse(knownCType(tpe))
        .getOrElse(TypeMapping(s"Any /* ${tpe.name}: ${tpe.typeValue}*/"))

    case ar: ArrayType =>
      TypeMapping("Array[Byte]")
  end match
end renderType
