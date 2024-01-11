package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

class FontFace(private[fluent] val raw: Ptr[PangoFontFace]) extends sn.gnome.gobject.fluent.Object:
  def describe(): Any /* Some(FontDescription): PangoFontDescription**/ = pango_font_face_describe(this.raw)

  def getFaceName(): String = pango_font_face_get_face_name(this.raw)

  def getFamily(): sn.gnome.pango.fluent.FontFamily = pango_font_face_get_family(this.raw)

  def isSynthesized(): Boolean = pango_font_face_is_synthesized(this.raw)

  def listSizes(sizes : Array[Byte], n_sizes : Any /* Some(gint): int**/): Unit = pango_font_face_list_sizes(this.raw, sizes, n_sizes)

end FontFace

