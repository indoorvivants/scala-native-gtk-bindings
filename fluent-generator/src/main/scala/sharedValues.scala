def importGResultEffect(using ns: NamingPolicy) = Effect.RequiresImport(
  ns.namespaceToFluentPackage("glib"),
  "GResult"
)
