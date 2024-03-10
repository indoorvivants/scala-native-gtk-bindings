import rendition.*

def renderEffects(effects: List[Effect])(using RenderingContext) =
  effects.distinct
    .collect:
      case a @ Effect.RequiresImport(namespace, what) =>
        a
    .sortBy(i => i.namespace -> i.definition)
    .foreach: i =>
      line(s"import ${i.namespace}.${i.definition}")
