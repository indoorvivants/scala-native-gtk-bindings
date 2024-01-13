enum WithEffects[+A]:
  case EffectsOnly(effects: List[Effect])
  case ValueAndEffects(value: A, effects: List[Effect])

  def getValue = this match
    case EffectsOnly(effects)            => None
    case ValueAndEffects(value, effects) => Some(value)

  def getEffects = this match
    case EffectsOnly(effects)            => effects
    case ValueAndEffects(value, effects) => effects
end WithEffects

object WithEffects:
  class EffectCollector:
    private val col = List.newBuilder[Effect]
    def add(eff: Effect*): Unit = col.addAll(eff)
    def addAll(eff: Seq[Effect]): Unit = col.addAll(eff)

    def effectsSoFar() = col.result()

  def collectWithValue[A](
      f: EffectCollector => A
  ): WithEffects[A] =
    val coll = EffectCollector()
    val result = f(coll)
    WithEffects.ValueAndEffects(result, coll.effectsSoFar())

  def collect(f: EffectCollector => Unit): WithEffects[Nothing] =
    val coll = EffectCollector()
    f(coll)
    WithEffects.EffectsOnly(coll.effectsSoFar())
end WithEffects
