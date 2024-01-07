import com.indoorvivants.gnome.gir_schema.*
import java.nio.file.Paths
import scala.xml.XML
import scalaxb.fromXML
import java.nio.file.Path
import java.nio.file.Files
import scala.jdk.CollectionConverters.*
import rendition.*
import scala.util.boundary, boundary.break

@main def hello(girFilesPath: String) =
  val root = Paths.get(girFilesPath).toAbsolutePath()
  val includeResolver = IncludeResolver(root)
  val reader = Reader(includeResolver)
  val newValue = reader("gdkpixbuf-2.0").namespace.get

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

    def extensions(parent: Option[String], impl: Seq[Implements]) =
      val ext = parent.toSeq ++ impl.map(_.name)
      if ext.nonEmpty then " extends " + ext.mkString(", ")
      else ""

    ns.interfaces.map: iface =>
      line(s"trait ${iface.name}${extensions(None, iface.implements)}")

    ns.classes.map: cls =>
      val skippedBecause =
        boundary:
          val cTypeName = cls.attributes.get("@type").map(_.as[String])
          val cType = qualifyCType(cTypeName.getOrElse(break("c:type missing")))
          val data = s"(raw: Ptr[$cType])"
          block(
            s"class ${cls.name}$data${extensions(cls.parent, cls.implements)}:",
            s"end ${cls.name}"
          ):
            cls.methods.foreach: meth =>
              boundary:
                val camelName = camelify(meth.name)
                val cMethod = meth.identifier
                val params =
                  meth.parameters
                    .map: param =>
                      param.name.get + " : " + renderType(
                        param.tpe.getOrElse(
                          break(
                            s"method ${meth.name}, param: ${param.name}: type is empty"
                          )
                        )
                      )
                    .mkString(", ")
                line(s"def $camelName($params) = ??? /*$cMethod*/")

          block(s"object ${cls.name}", s"end ${cls.name}"):
            cls.constructors.foreach: constructor =>
              val cConstructor = constructor.identifier
              val sanitisedName = constructor.name match
                case "new" => "apply"
                case s"new_$rest" =>
                  camelify(rest)
              val params =
                constructor.parameters
                  .map: param =>
                    param.name.get + " : " + renderType(
                      param.tpe.getOrElse(
                        break(
                          s"constructor ${constructor.name}, param: ${param.name}: type is empty"
                        )
                      )
                    )
                  .mkString(", ")
              line(
                s"def $sanitisedName($params): ${cls.name} = ??? /*$cConstructor*/"
              )

      skippedBecause match
        case msg: String =>
          scribe.warn(s"${cls.name} is broken: `$msg`")
        case _ =>

def camelify(name: String) =
  val els = name.split("_").map(_.capitalize)
  els(0) = els(0).toLowerCase()
  els.mkString

def qualifyCType(name: String) = s"???.$name"

def renderType(tpe: Type | ArrayType) =
  tpe match
    case tpe: Type =>
      tpe.name.getOrElse(tpe.typeValue)
    case ar: ArrayType =>
      "Array[Byte]"
