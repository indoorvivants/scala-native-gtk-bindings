package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

class FontMap(private[fluent] val raw: Ptr[PangoFontMap]) extends sn.gnome.gobject.fluent.Object, sn.gnome.gio.fluent.ListModel:
  def changed(): Unit = pango_font_map_changed(this.raw)

  def createContext(): sn.gnome.pango.fluent.Context = pango_font_map_create_context(this.raw)

  def getFamily(name : String): sn.gnome.pango.fluent.FontFamily = pango_font_map_get_family(this.raw, name)

  def getSerial(): Any /* Some(guint): guint*/ = pango_font_map_get_serial(this.raw)

  def listFamilies(families : Array[Byte], n_families : Any /* Some(gint): int**/): Unit = pango_font_map_list_families(this.raw, families, n_families)

  def loadFont(context : sn.gnome.pango.fluent.Context, desc : Any /* Some(FontDescription): const PangoFontDescription**/): sn.gnome.pango.fluent.Font = pango_font_map_load_font(this.raw, context.raw, desc)

  def loadFontset(context : sn.gnome.pango.fluent.Context, desc : Any /* Some(FontDescription): const PangoFontDescription**/, language : Any /* Some(Language): PangoLanguage**/): sn.gnome.pango.fluent.Fontset = pango_font_map_load_fontset(this.raw, context.raw, desc, language)

end FontMap

