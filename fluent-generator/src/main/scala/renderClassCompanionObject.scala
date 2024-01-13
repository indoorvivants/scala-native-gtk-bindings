import rendition.*
import util.boundary.*

def renderClassCompanionObject(
    cls: AugmentedClass
)(using
    RenderingContext,
    GlobalKnowledge,
    NamingPolicy,
    Label[String]
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
            try effects ++= renderClassConstructor(cls, constructor)
            catch case exc => break(exc.toString)

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
