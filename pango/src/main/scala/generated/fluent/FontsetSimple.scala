package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

class FontsetSimple(private[fluent] val raw: Ptr[PangoFontsetSimple]) extends sn.gnome.pango.fluent.Fontset:
  def append(font : sn.gnome.pango.fluent.Font): Unit = pango_fontset_simple_append(this.raw, font.raw)

  def size(): Int = pango_fontset_simple_size(this.raw)

end FontsetSimple

object FontsetSimple:
  def apply(language : Any /* Some(Language): PangoLanguage**/): FontsetSimple = FontsetSimple(pango_fontset_simple_new(language))

end FontsetSimple
