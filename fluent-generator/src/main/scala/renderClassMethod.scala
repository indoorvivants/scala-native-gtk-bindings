import rendition.*

import com.indoorvivants.gnome.gir_schema.*
import util.boundary.*

def renderClassMethod(cls: AugmentedClass, meth: Method)(using
    RenderingContext,
    GlobalKnowledge,
    NamingPolicy,
    Label[String]
) =
  val effects = List.newBuilder[Effect]
  val camelName = camelify(meth.name)
  val cMethod = meth.identifier

  val ((params, arguments), paramEffects) =
    renderParameters(meth.parameters, s"method: ${meth.name}")

  effects ++= paramEffects

  scribe.info(s"Class: ${cls.name} method ${meth.name}")

  val returnType = renderType(
    meth.returnType.getOrElse(
      break(s"return type missing")
    ),
    position = TypePosition.ReturnType
  )

  effects ++= returnType.effects

  val effectsSoFar = effects.result.distinct

  val requiresZone = Option
    .when(effectsSoFar.contains(Effect.RequiresZone))("(using Zone)")
    .getOrElse("")

  val serialisedParams = params.flatten
    .mkString(", ")
  val serialisedArguments = arguments.mkString(", ")

  val body = s"$cMethod(${serialisedArguments})"

  val massagedBody = returnType.fromUnsafeForm(body)

  line(
    s"def $camelName(${serialisedParams})$requiresZone: ${returnType.scalaRepr} = $massagedBody"
  )
  emptyLine()

  effectsSoFar

end renderClassMethod
