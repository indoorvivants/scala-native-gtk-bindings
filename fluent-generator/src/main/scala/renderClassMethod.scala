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
    val serialisedArguments = renderedParameters.arguments.mkString(", ")

    val body = s"$cMethod(${serialisedArguments})"

    val massagedBody = returnType.fromUnsafeForm(body)

    line(
      s"def ${escape(camelName)}(${serialisedParams})$requiresZone: ${returnType.scalaRepr} = $massagedBody"
    )
    emptyLine()

end renderClassMethod
