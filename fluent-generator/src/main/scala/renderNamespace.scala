import rendition.*

def renderNamespace(
    r: RenderingStreams,
    ns: AugmentedNamespace,
    global: GlobalKnowledge,
    policy: NamingPolicy
) =

  val fluentPackageName = policy.namespaceToFluentPackage(ns.name.get)
  val internalPackageName = policy.namespaceToInternalPackage(ns.name.get)

  ns.interfaces.map: iface =>
    r.in(iface.name + ".scala"):
      val outcome =
        transact[String]:
          line(s"package $fluentPackageName")
          emptyLine()
          line(s"import $internalPackageName.*")
          emptyLine()

          emptyLine()
          line(
            s"trait ${iface.name}${renderClassExtensions(None, iface.implements)}"
          )
          Outcome.Ok

  given GlobalKnowledge = global
  given NamingPolicy = policy

  ns.classes.map: cls =>
    r.in(cls.name + ".scala"):
      val newLB = LineBuilder()
      val effects = List.newBuilder[Effect]
      var error = Option.empty[String]

      newLB.use:
        error = transact[String]:
          effects ++= renderClass(ns, cls)
          Outcome.Ok

      error match
        case None =>
          line(s"package $fluentPackageName")
          emptyLine()
          line(s"import _root_.$internalPackageName.*")
          emptyLine()
          line(s"import _root_.scala.scalanative.unsafe.*")
          emptyLine()

          renderEffects(effects.result())

          emptyLine()

          append(newLB)

        case Some(msg) =>
          scribe.warn(s"Failed to render class ${cls.name}: `$msg`")
      end match

end renderNamespace
