import com.indoorvivants.gnome.gir_schema.*
import scala.util.boundary, boundary.*
import rendition.*

def renderParameters(
    params: Seq[Parameter | Instanceu45parameter],
    methodLabel: String
)(using
    Label[Outcome[String]],
    GlobalKnowledge,
    NamingPolicy
) =
  val effects = List.newBuilder[Effect]

  params
    .map:
      case param: Parameter =>
        val paramType = renderType(
          param.tpe.getOrElse(
            break(
              Outcome.Fail(
                s"$methodLabel, param: ${param.name}: type is empty"
              )
            )
          )
        )

        effects ++= paramType.effects

        val paramName = escape(param.name.get)

        val parameter = paramName + " : " + paramType.scalaRepr

        val argument = paramType.intoUnsafeForm(paramName)

        (Some(parameter), argument)

      case param: Instanceu45parameter =>
        (None, "this.raw.asInstanceOf")
    .unzip -> effects.result()
end renderParameters
