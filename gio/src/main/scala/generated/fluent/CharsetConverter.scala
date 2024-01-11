package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class CharsetConverter(private[fluent] val raw: Ptr[GCharsetConverter]) extends GObject.Object, Converter, Initable:
  def getNumFallbacks(): Any /* Some(guint): guint*/ = g_charset_converter_get_num_fallbacks(this.raw)

  def getUseFallback(): Boolean = g_charset_converter_get_use_fallback(this.raw)

  def setUseFallback(use_fallback : Boolean): Unit = g_charset_converter_set_use_fallback(this.raw, use_fallback)

end CharsetConverter

object CharsetConverter:
  def apply(to_charset : String, from_charset : String): CharsetConverter = CharsetConverter(g_charset_converter_new(to_charset, from_charset))

end CharsetConverter
