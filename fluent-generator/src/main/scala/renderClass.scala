import com.indoorvivants.gnome.gir_schema.*
import rendition.*

import scala.util.boundary, boundary.*

def renderClass(
    ns: AugmentedNamespace,
    cls: AugmentedClass
)(using
    RenderingContext,
    GlobalKnowledge,
    NamingPolicy,
    Label[Outcome[String]]
): List[Effect] =
  val effects = List.newBuilder[Effect]

  val cTypeName = cls.attributes.get("@type").map(_.as[String])
  val cType =
    cTypeName.getOrElse(break(Outcome.Fail("c:type missing")))
  val data = s"(raw: Ptr[$cType])"

  val classHeader =
    s"class ${cls.name}$data${renderClassExtensions(cls.parent, cls.implements)}"
  val classHasAnyMembers =
    cls.methods.nonEmpty

  block(
    classHeader + ":",
    s"end ${cls.name}"
  ):
    val overrides = if cls.parent.nonEmpty then "override " else ""
    line(
      s"${overrides}def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf"
    )
    emptyLine()
    cls.methods.foreach: meth =>
      filterDefinitions(
        namespace = Some(ns),
        cls = Some(cls),
        method = Some(meth)
      ) match
        case None =>
          val result =
            transact[String]:
              effects ++= renderClassMethod(cls, meth)
              Outcome.Ok
          result.foreach: msg =>
            scribe.warn(s"Failed to render method ${meth.name}: `$msg`")
        case Some(value) =>
          line("// " + value)

    effects
      .result()
      .distinct
      .collect:
        case Effect.RequiresDefinition(df) =>
          emptyLine()
          df()

  renderClassCompanionObject(cls)

  effects.result.distinct
end renderClass

def renderClassCompanionObject(
    cls: AugmentedClass
)(using
    RenderingContext,
    GlobalKnowledge,
    NamingPolicy,
    Label[Outcome[String]]
): List[Effect] =
  val effects = List.newBuilder[Effect]

  val objectHeader = s"object ${cls.name}"
  val objectHasAnyMembers = cls.constructors.nonEmpty

  if objectHasAnyMembers then
    emptyLine()
    block(objectHeader + ":", s"end ${cls.name}"):
      cls.constructors.foreach: constructor =>
        val result =
          transact[String]:
            effects ++= renderClassConstructor(cls, constructor)
            Outcome.Ok
        result.foreach: msg =>
          scribe.warn(
            s"Failed to render constructor for class ${cls.name}, ${constructor.name}: `$msg`"
          )
      effects
        .result()
        .distinct
        .collect:
          case Effect.RequiresDefinition(df) =>
            emptyLine()
            df()

  end if

  effects.result().distinct
end renderClassCompanionObject
