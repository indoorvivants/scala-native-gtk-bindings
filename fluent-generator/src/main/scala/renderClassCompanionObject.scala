import rendition.*
import util.boundary.*

def renderClassCompanionObject(
    cls: AugmentedClass
)(using
    RenderingContext,
    GlobalKnowledge,
    NamingPolicy,
    Label[String]
) =
  WithEffects.collect: coll =>
    val objectHeader = s"object ${cls.name}"
    val objectHasAnyMembers = cls.constructors.nonEmpty

    if objectHasAnyMembers then
      emptyLine()
      block(objectHeader + ":", s"end ${cls.name}"):
        cls.constructors.foreach: constructor =>
          val result =
            transact[String]:
              try coll.observe(renderClassConstructor(cls, constructor))
              catch case exc => break(exc.toString)

          result.foreach: msg =>
            scribe.warn(
              s"Failed to render constructor for class ${cls.name}, ${constructor.name}: `$msg`"
            )

        coll
          .effectsSoFar()
          .distinct
          .collect:
            case Effect.RequiresDefinition(df) =>
              emptyLine()
              df()

    end if

end renderClassCompanionObject
