import rendition.*

import com.indoorvivants.gnome.gir_schema.*
import util.boundary.*

def renderClassMethod(cls: AugmentedClass, meth: Method)(using
    RenderingContext,
    GlobalKnowledge,
    NamingPolicy,
    Label[String]
) =
  WithEffects.collect: coll =>
    val camelName = camelify(meth.name)
    val cMethod = meth.identifier

    scribe.info(s"Method: ${meth.name} ${meth.isThrowing}")

    if meth.isThrowing then coll.add(importGResultEffect)

    val renderedParameters =
      coll.observe(renderParameters(meth.parameters, s"method: ${meth.name}"))

    val returnType = renderType(
      meth.returnType.getOrElse(
        break(s"return type missing")
      ),
      position = TypePosition.ReturnType
    )

    coll.addAll(returnType.effects)

    val requiresZone = Option
      .when(coll.effectsSoFar().contains(Effect.RequiresZone))("(using Zone)")
      .getOrElse("")

    val serialisedParams = renderedParameters.paramSpecs
      .mkString(", ")

    val arguments =
      if meth.isThrowing then renderedParameters.arguments :+ "__errorPtr"
      else renderedParameters.arguments

    val serialisedArguments = arguments.mkString(", ")

    val body = s"$cMethod(${serialisedArguments})"

    val massagedBody = returnType.fromUnsafeForm(body)
    scribe.info(s"Method: ${meth.name}, ${returnType.massageFromUnsafe}")

    val returnTypeRepr =
      if meth.isThrowing then s"GResult[${returnType.scalaRepr}]"
      else returnType.scalaRepr

    val finalBody =
      if meth.isThrowing then s"GResult.wrap(__errorPtr => $massagedBody)"
      else massagedBody

    line(
      s"def ${escape(camelName)}(${serialisedParams})$requiresZone: ${returnTypeRepr} = $finalBody"
    )
    emptyLine()

end renderClassMethod
