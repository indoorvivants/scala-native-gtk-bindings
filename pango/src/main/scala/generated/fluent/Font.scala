package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.GBytes
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.pango.fluent.Coverage
import sn.gnome.pango.fluent.FontFace
import sn.gnome.pango.fluent.FontMap
import sn.gnome.pango.internal.PangoFont
import sn.gnome.pango.internal.PangoFontDescription
import sn.gnome.pango.internal.PangoFontMetrics
import sn.gnome.pango.internal.PangoGlyph
import sn.gnome.pango.internal.PangoLanguage
import sn.gnome.pango.internal.PangoRectangle

class Font(raw: Ptr[PangoFont]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def describe(): Ptr[PangoFontDescription] = pango_font_describe(
    this.raw.asInstanceOf
  )

  def describeWithAbsoluteSize(): Ptr[PangoFontDescription] =
    pango_font_describe_with_absolute_size(this.raw.asInstanceOf)

  def getCoverage(language: Ptr[PangoLanguage]): Coverage = new Coverage(
    pango_font_get_coverage(this.raw.asInstanceOf, language).asInstanceOf
  )

  def getFace(): FontFace = new FontFace(
    pango_font_get_face(this.raw.asInstanceOf).asInstanceOf
  )

  def getFeatures(
      features: Any /* Some(gconstpointer): `gconstpointer` */,
      len: UInt,
      num_features: Ptr[UInt]
  ): Unit = pango_font_get_features(
    this.raw.asInstanceOf,
    features,
    guint(len),
    num_features.asInstanceOf[Ptr[guint]]
  )

  def getFontMap(): FontMap = new FontMap(
    pango_font_get_font_map(this.raw.asInstanceOf).asInstanceOf
  )

  def getGlyphExtents(
      glyph: PangoGlyph,
      ink_rect: Ptr[PangoRectangle],
      logical_rect: Ptr[PangoRectangle]
  ): Unit = pango_font_get_glyph_extents(
    this.raw.asInstanceOf,
    glyph,
    ink_rect,
    logical_rect
  )

  def getHbFont(): Any /* Some(HarfBuzz.font_t): `gconstpointer` */ =
    pango_font_get_hb_font(this.raw.asInstanceOf)

  def getMetrics(language: Ptr[PangoLanguage]): Ptr[PangoFontMetrics] =
    pango_font_get_metrics(this.raw.asInstanceOf, language)

  def hasChar(wc: Any /* Some(gunichar): `gunichar` */ ): Boolean =
    pango_font_has_char(this.raw.asInstanceOf, wc).value.!=(0)

  def serialize(): Ptr[GBytes] = pango_font_serialize(this.raw.asInstanceOf)

end Font
