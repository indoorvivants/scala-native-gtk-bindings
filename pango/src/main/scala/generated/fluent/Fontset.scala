package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

class Fontset(private[fluent] val raw: Ptr[PangoFontset]) extends sn.gnome.gobject.fluent.Object:
  def foreach(func : Any /* Some(FontsetForeachFunc): PangoFontsetForeachFunc*/, data : Ptr[Byte]): Unit = pango_fontset_foreach(this.raw, func, data)

  def getFont(wc : Any /* Some(guint): guint*/): sn.gnome.pango.fluent.Font = pango_fontset_get_font(this.raw, wc)

  def getMetrics(): Any /* Some(FontMetrics): PangoFontMetrics**/ = pango_fontset_get_metrics(this.raw)

end Fontset

