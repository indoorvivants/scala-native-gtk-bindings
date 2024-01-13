import com.indoorvivants.gnome.gir_schema.*
import rendition.*

import scala.util.boundary, boundary.*

def renderClass(
    ns: AugmentedNamespace,
    cls: AugmentedClass
)(using
    RenderingContext,
    GlobalKnowledge,
    NamingPolicy,
    Label[String]
): WithEffects[Nothing] =
  WithEffects.collect: coll =>
    val cTypeName = cls.attributes.get("@type").map(_.as[String])
    val cType =
      cTypeName.getOrElse(break("c:type missing"))
    val data = s"(raw: Ptr[$cType])"

    val extensions =
      renderClassExtensions(cls.parent, cls.implements)

    coll.addAll(extensions.getEffects)

    val classHeader =
      s"class ${cls.name}$data${extensions.getValue.getOrElse("")}"

    val classHasAnyMembers =
      cls.methods.nonEmpty

    block(
      classHeader + ":",
      s"end ${cls.name}"
    ):
      val overrides = if cls.parent.nonEmpty then "override " else ""
      line(
        s"${overrides}def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf"
      )
      emptyLine()
      cls.methods.foreach: meth =>
        filterDefinitions(
          namespace = Some(ns),
          cls = Some(cls),
          method = Some(meth)
        ) match
          case None =>
            val result =
              transact[String]:
                try coll.addAll(renderClassMethod(cls, meth))
                catch
                  case exc =>
                    break(exc.toString())

            result.foreach: msg =>
              scribe.warn(s"Failed to render method ${meth.name}: `$msg`")
          case Some(value) =>
            line("// " + value)

      coll
        .effectsSoFar()
        .distinct
        .collect:
          case Effect.RequiresDefinition(df) =>
            emptyLine()
            df()

    renderClassCompanionObject(cls)
end renderClass
