import com.indoorvivants.gnome.gir_schema.*

import rendition.*
import util.boundary.*

def renderClassExtensions(parent: Option[String], impl: Seq[Implements])(using
    Label[Outcome[String]],
    GlobalKnowledge
) =
  val parentExt = parent.map: name =>
    val isClass =
      summon[GlobalKnowledge].names.get(name).exists(_.tpe == NameType.Class)

    if isClass then s"$name(raw.asInstanceOf)" else name

  val ext = parentExt.toSeq ++ impl.map(_.name)
    .map(name =>
      summon[GlobalKnowledge].names
        .get(name)
        .getOrElse(
          break(
            Outcome.Fail("Could not find a global name for extension $name")
          )
        )
    )
    .map(_._1)

  if ext.nonEmpty then " extends " + ext.mkString(", ")
  else ""
end renderClassExtensions
