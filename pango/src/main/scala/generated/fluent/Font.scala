package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

class Font(private[fluent] val raw: Ptr[PangoFont]) extends sn.gnome.gobject.fluent.Object:
  def describe(): Any /* Some(FontDescription): PangoFontDescription**/ = pango_font_describe(this.raw)

  def describeWithAbsoluteSize(): Any /* Some(FontDescription): PangoFontDescription**/ = pango_font_describe_with_absolute_size(this.raw)

  def getCoverage(language : Any /* Some(Language): PangoLanguage**/): sn.gnome.pango.fluent.Coverage = pango_font_get_coverage(this.raw, language)

  def getFace(): sn.gnome.pango.fluent.FontFace = pango_font_get_face(this.raw)

  def getFeatures(features : Any /* Some(gconstpointer): gconstpointer*/, len : Any /* Some(guint): guint*/, num_features : Any /* Some(guint): guint**/): Unit = pango_font_get_features(this.raw, features, len, num_features)

  def getFontMap(): sn.gnome.pango.fluent.FontMap = pango_font_get_font_map(this.raw)

  def getGlyphExtents(glyph : Any /* Some(Glyph): PangoGlyph*/, ink_rect : Any /* Some(Rectangle): PangoRectangle**/, logical_rect : Any /* Some(Rectangle): PangoRectangle**/): Unit = pango_font_get_glyph_extents(this.raw, glyph, ink_rect, logical_rect)

  def getHbFont(): Any /* Some(HarfBuzz.font_t): gconstpointer*/ = pango_font_get_hb_font(this.raw)

  def getLanguages(): Array[Byte] = pango_font_get_languages(this.raw)

  def getMetrics(language : Any /* Some(Language): PangoLanguage**/): Any /* Some(FontMetrics): PangoFontMetrics**/ = pango_font_get_metrics(this.raw, language)

  def hasChar(wc : Any /* Some(gunichar): gunichar*/): Boolean = pango_font_has_char(this.raw, wc)

  def serialize(): Any /* Some(GLib.Bytes): GBytes**/ = pango_font_serialize(this.raw)

end Font

