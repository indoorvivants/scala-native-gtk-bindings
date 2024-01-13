import com.indoorvivants.gnome.gir_schema.*

import rendition.*
import util.boundary.*

def renderClassExtensions(parent: Option[String], impl: Seq[Implements])(using
    Label[String],
    GlobalKnowledge
): WithEffects[String] =
  WithEffects.collectWithValue: coll =>
    val parentExt = parent.map: name =>
      summon[GlobalKnowledge].names.get(name) match
        case None => break(s"Could not find a global name for ${name}")
        case Some(value) =>
          value.tpe match
            case NameType.Class =>
              coll.addAll(value.effects)
              s"${value.short}(raw.asInstanceOf)"
            case other =>
              break(s"unexpected parent: $value")

    val ext = parentExt.toSeq ++ impl
      .map(_.name)
      .map: name =>
        val gname = summon[GlobalKnowledge].names
          .get(name)
          .getOrElse(
            break(
              s"Could not find a global name for extension $name"
            )
          )
        coll.addAll(gname.effects)
        gname.short

    if ext.nonEmpty then " extends " + ext.mkString(", ")
    else ""
end renderClassExtensions
