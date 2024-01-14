import rendition.*

import com.indoorvivants.gnome.gir_schema.*
import util.boundary.*

def renderClassConstructor(cls: AugmentedClass, constructor: Constructor)(using
    GlobalKnowledge,
    NamingPolicy,
    RenderingContext,
    Label[String]
) =
  WithEffects.collect: coll =>
    val cConstructor = constructor.identifier
    val sanitisedName = constructor.name match
      case "new" => "apply"
      case s"new_$rest" =>
        camelify(rest)
      case other =>
        camelify(other)

    val renderedParameters =
      coll.observe(
        renderParameters(
          constructor.parameters,
          s"constructor: ${constructor.name}"
        )
      )

    val requiresZone = Option
      .when(coll.effectsSoFar().contains(Effect.RequiresZone))("(using Zone)")
      .getOrElse("")

    val serialisedParams = renderedParameters.paramSpecs
      .mkString(", ")
    val serialisedArguments = renderedParameters.arguments.mkString(", ")
    val instantiation = s"${cConstructor}($serialisedArguments)"
    val massagedInstantiation = s"${instantiation}.asInstanceOf"
    val body = s"new ${cls.name}($massagedInstantiation)"

    line(
      s"def $sanitisedName($serialisedParams)$requiresZone: ${cls.name} = $body"
    )

end renderClassConstructor
