import rendition.*

def renderNamespace(
    r: RenderingStreams,
    ns: AugmentedNamespace,
    global: GlobalKnowledge,
    policy: NamingPolicy
) =

  given GlobalKnowledge = global
  given NamingPolicy = policy

  val fluentPackageName = policy.namespaceToFluentPackage(ns.name.get)
  val internalPackageName = policy.namespaceToInternalPackage(ns.name.get)

  ns.interfaces.map: iface =>
    r.in(iface.name + ".scala"):
      val newLB = LineBuilder()
      var error = Option.empty[String]

      val effects = WithEffects.collect: coll =>
        newLB.use:
          error = transact[String]:
            coll.observe(renderTrait(ns, iface))

      error match
        case None =>
          line(s"package $fluentPackageName")
          emptyLine()
          line(s"import _root_.$internalPackageName.*")
          emptyLine()
          line(s"import _root_.scala.scalanative.unsafe.*")
          emptyLine()

          renderEffects(effects.effects)

          emptyLine()

          append(newLB)

        case Some(msg) =>
          scribe.warn(s"Failed to render class ${iface.name}: `$msg`")
      end match

  ns.classes.map: cls =>
    r.in(cls.name + ".scala"):
      val newLB = LineBuilder()
      var error = Option.empty[String]

      val effects = WithEffects.collect: coll =>
        newLB.use:
          error = transact[String]:
            coll.observe(renderClass(ns, cls))

      error match
        case None =>
          line(s"package $fluentPackageName")
          emptyLine()
          line(s"import _root_.$internalPackageName.*")
          emptyLine()
          line(s"import _root_.scala.scalanative.unsafe.*")
          emptyLine()

          renderEffects(effects.effects)

          emptyLine()

          append(newLB)

        case Some(msg) =>
          scribe.warn(s"Failed to render class ${cls.name}: `$msg`")
      end match

end renderNamespace
