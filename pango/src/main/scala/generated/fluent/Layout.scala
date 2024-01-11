package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

class Layout(private[fluent] val raw: Ptr[PangoLayout]) extends sn.gnome.gobject.fluent.Object:
  def contextChanged(): Unit = pango_layout_context_changed(this.raw)

  def copy(): sn.gnome.pango.fluent.Layout = pango_layout_copy(this.raw)

  def getAlignment(): PangoAlignment = pango_layout_get_alignment(this.raw)

  def getAttributes(): Any /* Some(AttrList): PangoAttrList**/ = pango_layout_get_attributes(this.raw)

  def getAutoDir(): Boolean = pango_layout_get_auto_dir(this.raw)

  def getBaseline(): Int = pango_layout_get_baseline(this.raw)

  def getCaretPos(`index_` : Int, strong_pos : Any /* Some(Rectangle): PangoRectangle**/, weak_pos : Any /* Some(Rectangle): PangoRectangle**/): Unit = pango_layout_get_caret_pos(this.raw, `index_`, strong_pos, weak_pos)

  def getCharacterCount(): Int = pango_layout_get_character_count(this.raw)

  def getContext(): sn.gnome.pango.fluent.Context = pango_layout_get_context(this.raw)

  def getCursorPos(`index_` : Int, strong_pos : Any /* Some(Rectangle): PangoRectangle**/, weak_pos : Any /* Some(Rectangle): PangoRectangle**/): Unit = pango_layout_get_cursor_pos(this.raw, `index_`, strong_pos, weak_pos)

  def getDirection(index : Int): PangoDirection = pango_layout_get_direction(this.raw, index)

  def getEllipsize(): PangoEllipsizeMode = pango_layout_get_ellipsize(this.raw)

  def getExtents(ink_rect : Any /* Some(Rectangle): PangoRectangle**/, logical_rect : Any /* Some(Rectangle): PangoRectangle**/): Unit = pango_layout_get_extents(this.raw, ink_rect, logical_rect)

  def getFontDescription(): Any /* Some(FontDescription): const PangoFontDescription**/ = pango_layout_get_font_description(this.raw)

  def getHeight(): Int = pango_layout_get_height(this.raw)

  def getIndent(): Int = pango_layout_get_indent(this.raw)

  def getIter(): Any /* Some(LayoutIter): PangoLayoutIter**/ = pango_layout_get_iter(this.raw)

  def getJustify(): Boolean = pango_layout_get_justify(this.raw)

  def getJustifyLastLine(): Boolean = pango_layout_get_justify_last_line(this.raw)

  def getLine(line : Int): Any /* Some(LayoutLine): PangoLayoutLine**/ = pango_layout_get_line(this.raw, line)

  def getLineCount(): Int = pango_layout_get_line_count(this.raw)

  def getLineReadonly(line : Int): Any /* Some(LayoutLine): PangoLayoutLine**/ = pango_layout_get_line_readonly(this.raw, line)

  def getLineSpacing(): Any /* Some(gfloat): float*/ = pango_layout_get_line_spacing(this.raw)

  def getLines(): Any /* Some(GLib.SList): GSList**/ = pango_layout_get_lines(this.raw)

  def getLinesReadonly(): Any /* Some(GLib.SList): GSList**/ = pango_layout_get_lines_readonly(this.raw)

  def getLogAttrs(attrs : Array[Byte], n_attrs : Any /* Some(gint): gint**/): Unit = pango_layout_get_log_attrs(this.raw, attrs, n_attrs)

  def getLogAttrsReadonly(n_attrs : Any /* Some(gint): gint**/): Array[Byte] = pango_layout_get_log_attrs_readonly(this.raw, n_attrs)

  def getPixelExtents(ink_rect : Any /* Some(Rectangle): PangoRectangle**/, logical_rect : Any /* Some(Rectangle): PangoRectangle**/): Unit = pango_layout_get_pixel_extents(this.raw, ink_rect, logical_rect)

  def getPixelSize(width : Any /* Some(gint): int**/, height : Any /* Some(gint): int**/): Unit = pango_layout_get_pixel_size(this.raw, width, height)

  def getSerial(): Any /* Some(guint): guint*/ = pango_layout_get_serial(this.raw)

  def getSingleParagraphMode(): Boolean = pango_layout_get_single_paragraph_mode(this.raw)

  def getSize(width : Any /* Some(gint): int**/, height : Any /* Some(gint): int**/): Unit = pango_layout_get_size(this.raw, width, height)

  def getSpacing(): Int = pango_layout_get_spacing(this.raw)

  def getTabs(): Any /* Some(TabArray): PangoTabArray**/ = pango_layout_get_tabs(this.raw)

  def getText(): String = pango_layout_get_text(this.raw)

  def getUnknownGlyphsCount(): Int = pango_layout_get_unknown_glyphs_count(this.raw)

  def getWidth(): Int = pango_layout_get_width(this.raw)

  def getWrap(): PangoWrapMode = pango_layout_get_wrap(this.raw)

  def indexToLineX(`index_` : Int, trailing : Boolean, line : Any /* Some(gint): int**/, x_pos : Any /* Some(gint): int**/): Unit = pango_layout_index_to_line_x(this.raw, `index_`, trailing, line, x_pos)

  def indexToPos(`index_` : Int, pos : Any /* Some(Rectangle): PangoRectangle**/): Unit = pango_layout_index_to_pos(this.raw, `index_`, pos)

  def isEllipsized(): Boolean = pango_layout_is_ellipsized(this.raw)

  def isWrapped(): Boolean = pango_layout_is_wrapped(this.raw)

  def moveCursorVisually(strong : Boolean, old_index : Int, old_trailing : Int, direction : Int, new_index : Any /* Some(gint): int**/, new_trailing : Any /* Some(gint): int**/): Unit = pango_layout_move_cursor_visually(this.raw, strong, old_index, old_trailing, direction, new_index, new_trailing)

  def serialize(flags : Any /* Some(LayoutSerializeFlags): PangoLayoutSerializeFlags*/): Any /* Some(GLib.Bytes): GBytes**/ = pango_layout_serialize(this.raw, flags)

  def setAlignment(alignment : PangoAlignment): Unit = pango_layout_set_alignment(this.raw, alignment)

  def setAttributes(attrs : Any /* Some(AttrList): PangoAttrList**/): Unit = pango_layout_set_attributes(this.raw, attrs)

  def setAutoDir(auto_dir : Boolean): Unit = pango_layout_set_auto_dir(this.raw, auto_dir)

  def setEllipsize(ellipsize : PangoEllipsizeMode): Unit = pango_layout_set_ellipsize(this.raw, ellipsize)

  def setFontDescription(desc : Any /* Some(FontDescription): const PangoFontDescription**/): Unit = pango_layout_set_font_description(this.raw, desc)

  def setHeight(height : Int): Unit = pango_layout_set_height(this.raw, height)

  def setIndent(indent : Int): Unit = pango_layout_set_indent(this.raw, indent)

  def setJustify(justify : Boolean): Unit = pango_layout_set_justify(this.raw, justify)

  def setJustifyLastLine(justify : Boolean): Unit = pango_layout_set_justify_last_line(this.raw, justify)

  def setLineSpacing(factor : Any /* Some(gfloat): float*/): Unit = pango_layout_set_line_spacing(this.raw, factor)

  def setMarkup(markup : String, length : Int): Unit = pango_layout_set_markup(this.raw, markup, length)

  def setMarkupWithAccel(markup : String, length : Int, accel_marker : Any /* Some(gunichar): gunichar*/, accel_char : Any /* Some(gunichar): gunichar**/): Unit = pango_layout_set_markup_with_accel(this.raw, markup, length, accel_marker, accel_char)

  def setSingleParagraphMode(setting : Boolean): Unit = pango_layout_set_single_paragraph_mode(this.raw, setting)

  def setSpacing(spacing : Int): Unit = pango_layout_set_spacing(this.raw, spacing)

  def setTabs(tabs : Any /* Some(TabArray): PangoTabArray**/): Unit = pango_layout_set_tabs(this.raw, tabs)

  def setText(text : String, length : Int): Unit = pango_layout_set_text(this.raw, text, length)

  def setWidth(width : Int): Unit = pango_layout_set_width(this.raw, width)

  def setWrap(wrap : PangoWrapMode): Unit = pango_layout_set_wrap(this.raw, wrap)

  def writeToFile(flags : Any /* Some(LayoutSerializeFlags): PangoLayoutSerializeFlags*/, filename : String): Boolean = pango_layout_write_to_file(this.raw, flags, filename)

  def xyToIndex(x : Int, y : Int, `index_` : Any /* Some(gint): int**/, trailing : Any /* Some(gint): int**/): Boolean = pango_layout_xy_to_index(this.raw, x, y, `index_`, trailing)

end Layout

object Layout:
  def apply(context : sn.gnome.pango.fluent.Context): Layout = Layout(pango_layout_new(context.raw))

end Layout
