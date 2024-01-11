package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

class Coverage(private[fluent] val raw: Ptr[PangoCoverage]) extends sn.gnome.gobject.fluent.Object:
  def copy(): sn.gnome.pango.fluent.Coverage = pango_coverage_copy(this.raw)

  def get(`index_` : Int): PangoCoverageLevel = pango_coverage_get(this.raw, `index_`)

  def max(other : sn.gnome.pango.fluent.Coverage): Unit = pango_coverage_max(this.raw, other.raw)

  def ref(): sn.gnome.pango.fluent.Coverage = pango_coverage_ref(this.raw)

  def set(`index_` : Int, level : PangoCoverageLevel): Unit = pango_coverage_set(this.raw, `index_`, level)

  def toBytes(bytes : Array[Byte], n_bytes : Any /* Some(gint): int**/): Unit = pango_coverage_to_bytes(this.raw, bytes, n_bytes)

  def unref(): Unit = pango_coverage_unref(this.raw)

end Coverage

object Coverage:
  def apply(): Coverage = Coverage(pango_coverage_new())

end Coverage
