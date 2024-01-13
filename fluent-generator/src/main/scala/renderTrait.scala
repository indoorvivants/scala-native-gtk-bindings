import rendition.*
import util.boundary.*

def renderTrait(ns: AugmentedNamespace, iface: AugmentedInterface)(using
    GlobalKnowledge,
    NamingPolicy,
    RenderingContext,
    Label[String]
) =
  WithEffects.collect: coll =>
    val extensions = renderClassExtensions(None, iface.implements)
    transact[String]:
      block(
        s"trait ${iface.name}${extensions.getValue.getOrElse("")}:",
        s"end ${iface.name}"
      ):
        line("def getUnsafeRawPointer(): Ptr[Byte]")
end renderTrait
