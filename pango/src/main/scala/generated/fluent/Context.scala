package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

class Context(private[fluent] val raw: Ptr[PangoContext]) extends sn.gnome.gobject.fluent.Object:
  def changed(): Unit = pango_context_changed(this.raw)

  def getBaseDir(): PangoDirection = pango_context_get_base_dir(this.raw)

  def getBaseGravity(): PangoGravity = pango_context_get_base_gravity(this.raw)

  def getFontDescription(): Any /* Some(FontDescription): PangoFontDescription**/ = pango_context_get_font_description(this.raw)

  def getFontMap(): sn.gnome.pango.fluent.FontMap = pango_context_get_font_map(this.raw)

  def getGravity(): PangoGravity = pango_context_get_gravity(this.raw)

  def getGravityHint(): PangoGravityHint = pango_context_get_gravity_hint(this.raw)

  def getLanguage(): Any /* Some(Language): PangoLanguage**/ = pango_context_get_language(this.raw)

  def getMatrix(): Any /* Some(Matrix): const PangoMatrix**/ = pango_context_get_matrix(this.raw)

  def getMetrics(desc : Any /* Some(FontDescription): const PangoFontDescription**/, language : Any /* Some(Language): PangoLanguage**/): Any /* Some(FontMetrics): PangoFontMetrics**/ = pango_context_get_metrics(this.raw, desc, language)

  def getRoundGlyphPositions(): Boolean = pango_context_get_round_glyph_positions(this.raw)

  def getSerial(): Any /* Some(guint): guint*/ = pango_context_get_serial(this.raw)

  def listFamilies(families : Array[Byte], n_families : Any /* Some(gint): int**/): Unit = pango_context_list_families(this.raw, families, n_families)

  def loadFont(desc : Any /* Some(FontDescription): const PangoFontDescription**/): sn.gnome.pango.fluent.Font = pango_context_load_font(this.raw, desc)

  def loadFontset(desc : Any /* Some(FontDescription): const PangoFontDescription**/, language : Any /* Some(Language): PangoLanguage**/): sn.gnome.pango.fluent.Fontset = pango_context_load_fontset(this.raw, desc, language)

  def setBaseDir(direction : PangoDirection): Unit = pango_context_set_base_dir(this.raw, direction)

  def setBaseGravity(gravity : PangoGravity): Unit = pango_context_set_base_gravity(this.raw, gravity)

  def setFontDescription(desc : Any /* Some(FontDescription): const PangoFontDescription**/): Unit = pango_context_set_font_description(this.raw, desc)

  def setFontMap(font_map : sn.gnome.pango.fluent.FontMap): Unit = pango_context_set_font_map(this.raw, font_map.raw)

  def setGravityHint(hint : PangoGravityHint): Unit = pango_context_set_gravity_hint(this.raw, hint)

  def setLanguage(language : Any /* Some(Language): PangoLanguage**/): Unit = pango_context_set_language(this.raw, language)

  def setMatrix(matrix : Any /* Some(Matrix): const PangoMatrix**/): Unit = pango_context_set_matrix(this.raw, matrix)

  def setRoundGlyphPositions(round_positions : Boolean): Unit = pango_context_set_round_glyph_positions(this.raw, round_positions)

end Context

object Context:
  def apply(): Context = Context(pango_context_new())

end Context
