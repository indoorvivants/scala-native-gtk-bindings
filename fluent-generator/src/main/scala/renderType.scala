import com.indoorvivants.gnome.gir_schema.*
import rendition.*

val stringExtractor =
  val name = "__sn_extract_string"

  val f: () => RenderingContext ?=> Unit = () =>
    block(
      s"private inline def $name(str: String | CString)(using Zone): CString = ",
      s"end $name"
    ):
      block("str match", "end match"):
        line("case s: String => toCString(s)")
        line("case s: CString => s")
  name -> Effect.RequiresDefinition(f)
end stringExtractor

enum TypePosition:
  case ParameterType, ReturnType

def renderType(
    tpe: Type | ArrayType,
    position: TypePosition = TypePosition.ParameterType
)(using
    global: GlobalKnowledge,
    policy: NamingPolicy
): TypeMapping =
  val importUnsigned =
    Effect.RequiresImport("_root_.scala.scalanative.unsigned", "*")
  val importGPointer =
    Effect.RequiresImport(policy.namespaceToInternalPackage("glib"), "gpointer")

  def requiresStringExtractor(mapping: TypeMapping) =
    mapping
      .withEffect(stringExtractor._2)
      .withMassageIntoUnsafe(Massage.Apply(stringExtractor._1))

  def deconstructCType(name: String): Option[TypeMapping] =
    val original = name
    def go(name: String, level: Int): Option[TypeMapping] =
      name match
        case s"$rest*" =>
          go(rest, level + 1)
        case s"const $rest" =>
          go(rest, level)
        case other =>
          global.names
            .get(other)
            .map: name =>
              val newValue = ("Ptr[" * level) + name.short + ("]" * level)
              TypeMapping(newValue).withEffect(name.effects*)
            .orElse:
              val ct = getCType(other)
              ct.map: tm =>
                val goodName = ("Ptr[" * level) + tm.scalaRepr + ("]" * level)
                val rawName = ("Ptr[" * level) + other + ("]" * level)
                val massage = Massage.Cast(rawName)

                TypeMapping(
                  goodName,
                  effects = tm.effects,
                  massageIntoUnsafe = List(massage),
                  massageFromUnsafe = Nil
                )

      end match
    end go
    go(name, 0)

  end deconstructCType

  def getCType(typeValue: String) =
    def whenTypeValue(cName: String)(result: String) =
      Option
        .when(typeValue.trim == cName)(
          TypeMapping(result)
        )

    def unsignedAlias(glib: String, sn: String) =
      whenTypeValue(glib)(sn)
        .map(_.withEffect(importUnsigned))
        .map(_.withMassageFromUnsafe(Massage.Field("value")))
        .map(_.withMassageIntoUnsafe(Massage.Apply(glib)))
        .map(
          _.withEffect(
            Effect.RequiresImport(
              policy.namespaceToInternalPackage("glib"),
              glib
            )
          )
        )

    val (stringType, stringTypeWrap) =
      position match
        case TypePosition.ParameterType =>
          ("String | CString", requiresStringExtractor(_))
        case TypePosition.ReturnType =>
          (
            "String",
            (tm: TypeMapping) =>
              tm.withEffect(Effect.RequiresZone)
                .withMassageFromUnsafe(
                  Massage.InferredCast,
                  Massage.Apply("fromCString")
                )
          )

    List(
      whenTypeValue("const char*")(stringType)
        .map(
          _.withEffect(Effect.RequiresZone)
        )
        .map(requiresStringExtractor),
      whenTypeValue("const gchar*")(stringType)
        .map(stringTypeWrap)
        .map(
          _.withEffect(
            Effect.RequiresZone,
            Effect.RequiresImport(
              policy.namespaceToInternalPackage("glib"),
              "gchar"
            )
          )
            .withMassageIntoUnsafe(
              Massage.Cast("Ptr[gchar]")
            )
        ),
      whenTypeValue("char*")(stringType)
        .map(
          _.withEffect(Effect.RequiresZone)
        )
        .map(stringTypeWrap),
      whenTypeValue("gchar*")(stringType)
        .map(
          _.withEffect(
            Effect.RequiresZone,
            Effect.RequiresImport(
              policy.namespaceToInternalPackage("glib"),
              "gchar"
            )
          )
            .withMassageIntoUnsafe(
              Massage.Cast("Ptr[gchar]")
            )
        )
        .map(stringTypeWrap),
      whenTypeValue("const char*")(stringType)
        .map(
          _.withEffect(Effect.RequiresZone).withMassageIntoUnsafe(
            Massage.Apply("toCString")
          )
        )
        .map(stringTypeWrap),
      whenTypeValue("gfloat")("Float"),
      whenTypeValue("gint")("Int"),
      whenTypeValue("int")("Int"),
      whenTypeValue("gboolean")("Boolean").map(
        _.withMassageFromUnsafe(Massage.Field("value.!=(0)"))
      ),
      whenTypeValue("double")("Double"),
      whenTypeValue("va_list")("CVarArgList"),
      whenTypeValue("gpointer")("Ptr[Byte]").map(
        _.withMassageIntoUnsafe(Massage.Apply("gpointer"))
          .withMassageFromUnsafe(Massage.Field("value"))
          .withEffect(importGPointer)
      ),
      unsignedAlias("guint8", "UByte"),
      unsignedAlias("guchar", "UByte"),
      unsignedAlias("guint16", "UShort"),
      unsignedAlias("guint", "UInt"),
      unsignedAlias("guint32", "UInt"),
      unsignedAlias("guint64", "ULong"),
      unsignedAlias("gulong", "ULong"),
      whenTypeValue("void")("Unit")
    ).reduce(_ orElse _)
  end getCType

  tpe match
    case tpe: Type =>
      tpe.name
        .flatMap(global.names.get)
        .filterNot(n => n.tpe == NameType.Record || n.tpe == NameType.Callback)
        .map:
          case name if name.tpe == NameType.Class =>
            val base =
              TypeMapping(name.short)
                .withMassageIntoUnsafe(
                  Massage.Field("getUnsafeRawPointer()"),
                  Massage.InferredCast
                )
                .withMassageFromUnsafe(
                  Massage.InferredCast,
                  Massage.New(name.short)
                )
                .withEffect(name.effects*)

            tpe.typeValue match
              case "gpointer" =>
                base
                  .withMassageIntoUnsafe(Massage.Cast("Ptr[Byte]"))
                  .withMassageIntoUnsafe(Massage.Apply("gpointer"))
                  .withEffect(importGPointer)
              case _ => base
          case other =>
            TypeMapping(other.short).withEffect(other.effects*)
        .orElse(getCType(tpe.typeValue))
        .orElse(deconstructCType(tpe.typeValue))
        .getOrElse(TypeMapping(s"Any /* ${tpe.name}: `${tpe.typeValue}` */"))

    case ar: ArrayType =>
      val elementType = ar.AnyType.as[Type]
      val renderedElementType = renderType(elementType)
      if elementType.typeValue.endsWith("gchar*") then
        TypeMapping(s"Ptr[CString]", effects = renderedElementType.effects)
          .withMassageIntoUnsafe(Massage.InferredCast)
      else if elementType.typeValue.endsWith("char*") then
        TypeMapping(s"Ptr[CString]", effects = renderedElementType.effects)
      else
        TypeMapping(
          s"Ptr[${renderedElementType.scalaRepr}]",
          effects = renderedElementType.effects
        )
      end if
  end match
end renderType
