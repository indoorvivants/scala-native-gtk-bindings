case class WithEffects[A](value: A, effects: List[Effect])

object WithEffects:
  class EffectCollector:
    private val col = List.newBuilder[Effect]
    def add(eff: Effect*): Unit = col.addAll(eff)
    def addAll(eff: Seq[Effect]): Unit = col.addAll(eff)

    def effectsSoFar() = col.result()
    def observe[A](f: => WithEffects[A]) =
      val result = f
      addAll(result.effects)
      result.value
  end EffectCollector

  def collect[A](
      f: EffectCollector => A
  ): WithEffects[A] =
    val coll = EffectCollector()
    val result = f(coll)
    WithEffects(result, coll.effectsSoFar())

end WithEffects
