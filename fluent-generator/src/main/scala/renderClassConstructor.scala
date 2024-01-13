import rendition.*

import com.indoorvivants.gnome.gir_schema.*
import util.boundary.*

def renderClassConstructor(cls: AugmentedClass, constructor: Constructor)(using
    GlobalKnowledge,
    NamingPolicy,
    RenderingContext,
    Label[String]
): List[Effect] =
  val effects = List.newBuilder[Effect]
  val cConstructor = constructor.identifier
  val sanitisedName = constructor.name match
    case "new" => "apply"
    case s"new_$rest" =>
      camelify(rest)
    case other =>
      camelify(other)

  val ((params, arguments), paramEffects) =
    renderParameters(
      constructor.parameters,
      s"constructor: ${constructor.name}"
    )

  effects ++= paramEffects

  val effectsSoFar = effects.result.distinct

  val requiresZone = Option
    .when(effectsSoFar.contains(Effect.RequiresZone))("(using Zone)")
    .getOrElse("")

  val serialisedParams = params.flatten
    .mkString(", ")
  val serialisedArguments = arguments.mkString(", ")
  val instantiation = s"${cConstructor}($serialisedArguments)"
  val massagedInstantiation = s"${instantiation}.asInstanceOf"
  val body = s"new ${cls.name}($massagedInstantiation)"

  line(
    s"def $sanitisedName($serialisedParams)$requiresZone: ${cls.name} = $body"
  )

  effectsSoFar
end renderClassConstructor
