package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GBytes
import sn.gnome.glib.internal.GSList
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.pango.fluent.Context
import sn.gnome.pango.fluent.Layout
import sn.gnome.pango.internal.PangoAlignment
import sn.gnome.pango.internal.PangoAttrList
import sn.gnome.pango.internal.PangoDirection
import sn.gnome.pango.internal.PangoEllipsizeMode
import sn.gnome.pango.internal.PangoFontDescription
import sn.gnome.pango.internal.PangoLayout
import sn.gnome.pango.internal.PangoLayoutIter
import sn.gnome.pango.internal.PangoLayoutLine
import sn.gnome.pango.internal.PangoLayoutSerializeFlags
import sn.gnome.pango.internal.PangoLogAttr
import sn.gnome.pango.internal.PangoRectangle
import sn.gnome.pango.internal.PangoTabArray
import sn.gnome.pango.internal.PangoWrapMode

class Layout(raw: Ptr[PangoLayout]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def contextChanged(): Unit = pango_layout_context_changed(
    this.raw.asInstanceOf
  )

  def copy(): Layout = new Layout(
    pango_layout_copy(this.raw.asInstanceOf).asInstanceOf
  )

  def getAlignment(): PangoAlignment = pango_layout_get_alignment(
    this.raw.asInstanceOf
  )

  def getAttributes(): Ptr[PangoAttrList] = pango_layout_get_attributes(
    this.raw.asInstanceOf
  )

  def getAutoDir(): Boolean =
    pango_layout_get_auto_dir(this.raw.asInstanceOf).value.!=(0)

  def getBaseline(): Int = pango_layout_get_baseline(this.raw.asInstanceOf)

  def getCaretPos(
      `index_`: Int,
      strong_pos: Ptr[PangoRectangle],
      weak_pos: Ptr[PangoRectangle]
  ): Unit = pango_layout_get_caret_pos(
    this.raw.asInstanceOf,
    `index_`,
    strong_pos,
    weak_pos
  )

  def getCharacterCount(): Int = pango_layout_get_character_count(
    this.raw.asInstanceOf
  ).value

  def getContext(): Context = new Context(
    pango_layout_get_context(this.raw.asInstanceOf).asInstanceOf
  )

  def getCursorPos(
      `index_`: Int,
      strong_pos: Ptr[PangoRectangle],
      weak_pos: Ptr[PangoRectangle]
  ): Unit = pango_layout_get_cursor_pos(
    this.raw.asInstanceOf,
    `index_`,
    strong_pos,
    weak_pos
  )

  def getDirection(index: Int): PangoDirection =
    pango_layout_get_direction(this.raw.asInstanceOf, index)

  def getEllipsize(): PangoEllipsizeMode = pango_layout_get_ellipsize(
    this.raw.asInstanceOf
  )

  def getExtents(
      ink_rect: Ptr[PangoRectangle],
      logical_rect: Ptr[PangoRectangle]
  ): Unit =
    pango_layout_get_extents(this.raw.asInstanceOf, ink_rect, logical_rect)

  def getFontDescription(): Ptr[PangoFontDescription] =
    pango_layout_get_font_description(this.raw.asInstanceOf)

  def getHeight(): Int = pango_layout_get_height(this.raw.asInstanceOf)

  def getIndent(): Int = pango_layout_get_indent(this.raw.asInstanceOf)

  def getIter(): Ptr[PangoLayoutIter] = pango_layout_get_iter(
    this.raw.asInstanceOf
  )

  def getJustify(): Boolean =
    pango_layout_get_justify(this.raw.asInstanceOf).value.!=(0)

  def getJustifyLastLine(): Boolean =
    pango_layout_get_justify_last_line(this.raw.asInstanceOf).value.!=(0)

  def getLine(line: Int): Ptr[PangoLayoutLine] =
    pango_layout_get_line(this.raw.asInstanceOf, line)

  def getLineCount(): Int = pango_layout_get_line_count(this.raw.asInstanceOf)

  def getLineReadonly(line: Int): Ptr[PangoLayoutLine] =
    pango_layout_get_line_readonly(this.raw.asInstanceOf, line)

  def getLineSpacing(): Any /* Some(gfloat): `float` */ =
    pango_layout_get_line_spacing(this.raw.asInstanceOf)

  def getLines(): Ptr[GSList] = pango_layout_get_lines(this.raw.asInstanceOf)

  def getLinesReadonly(): Ptr[GSList] = pango_layout_get_lines_readonly(
    this.raw.asInstanceOf
  )

  def getLogAttrs(
      attrs: Ptr[Ptr[PangoLogAttr]],
      n_attrs: Any /* Some(gint): `gint*` */
  ): Unit = pango_layout_get_log_attrs(this.raw.asInstanceOf, attrs, n_attrs)

  def getLogAttrsReadonly(
      n_attrs: Any /* Some(gint): `gint*` */
  ): Ptr[PangoLogAttr] =
    pango_layout_get_log_attrs_readonly(this.raw.asInstanceOf, n_attrs)

  def getPixelExtents(
      ink_rect: Ptr[PangoRectangle],
      logical_rect: Ptr[PangoRectangle]
  ): Unit = pango_layout_get_pixel_extents(
    this.raw.asInstanceOf,
    ink_rect,
    logical_rect
  )

  def getPixelSize(width: Ptr[Int], height: Ptr[Int]): Unit =
    pango_layout_get_pixel_size(
      this.raw.asInstanceOf,
      width.asInstanceOf[Ptr[int]],
      height.asInstanceOf[Ptr[int]]
    )

  def getSerial(): UInt = pango_layout_get_serial(this.raw.asInstanceOf).value

  def getSingleParagraphMode(): Boolean =
    pango_layout_get_single_paragraph_mode(this.raw.asInstanceOf).value.!=(0)

  def getSize(width: Ptr[Int], height: Ptr[Int]): Unit = pango_layout_get_size(
    this.raw.asInstanceOf,
    width.asInstanceOf[Ptr[int]],
    height.asInstanceOf[Ptr[int]]
  )

  def getSpacing(): Int = pango_layout_get_spacing(this.raw.asInstanceOf)

  def getTabs(): Ptr[PangoTabArray] = pango_layout_get_tabs(
    this.raw.asInstanceOf
  )

  def getText()(using Zone): String = pango_layout_get_text(
    this.raw.asInstanceOf
  )

  def getUnknownGlyphsCount(): Int = pango_layout_get_unknown_glyphs_count(
    this.raw.asInstanceOf
  )

  def getWidth(): Int = pango_layout_get_width(this.raw.asInstanceOf)

  def getWrap(): PangoWrapMode = pango_layout_get_wrap(this.raw.asInstanceOf)

  def indexToLineX(
      `index_`: Int,
      trailing: Boolean,
      line: Ptr[Int],
      x_pos: Ptr[Int]
  ): Unit = pango_layout_index_to_line_x(
    this.raw.asInstanceOf,
    `index_`,
    gboolean(gint((if trailing == true then 1 else 0))),
    line.asInstanceOf[Ptr[int]],
    x_pos.asInstanceOf[Ptr[int]]
  )

  def indexToPos(`index_`: Int, pos: Ptr[PangoRectangle]): Unit =
    pango_layout_index_to_pos(this.raw.asInstanceOf, `index_`, pos)

  def isEllipsized(): Boolean =
    pango_layout_is_ellipsized(this.raw.asInstanceOf).value.!=(0)

  def isWrapped(): Boolean =
    pango_layout_is_wrapped(this.raw.asInstanceOf).value.!=(0)

  def moveCursorVisually(
      strong: Boolean,
      old_index: Int,
      old_trailing: Int,
      direction: Int,
      new_index: Ptr[Int],
      new_trailing: Ptr[Int]
  ): Unit = pango_layout_move_cursor_visually(
    this.raw.asInstanceOf,
    gboolean(gint((if strong == true then 1 else 0))),
    old_index,
    old_trailing,
    direction,
    new_index.asInstanceOf[Ptr[int]],
    new_trailing.asInstanceOf[Ptr[int]]
  )

  def serialize(flags: PangoLayoutSerializeFlags): Ptr[GBytes] =
    pango_layout_serialize(this.raw.asInstanceOf, flags)

  def setAlignment(alignment: PangoAlignment): Unit =
    pango_layout_set_alignment(this.raw.asInstanceOf, alignment)

  def setAttributes(attrs: Ptr[PangoAttrList]): Unit =
    pango_layout_set_attributes(this.raw.asInstanceOf, attrs)

  def setAutoDir(auto_dir: Boolean): Unit = pango_layout_set_auto_dir(
    this.raw.asInstanceOf,
    gboolean(gint((if auto_dir == true then 1 else 0)))
  )

  def setEllipsize(ellipsize: PangoEllipsizeMode): Unit =
    pango_layout_set_ellipsize(this.raw.asInstanceOf, ellipsize)

  def setFontDescription(desc: Ptr[PangoFontDescription]): Unit =
    pango_layout_set_font_description(this.raw.asInstanceOf, desc)

  def setHeight(height: Int): Unit =
    pango_layout_set_height(this.raw.asInstanceOf, height)

  def setIndent(indent: Int): Unit =
    pango_layout_set_indent(this.raw.asInstanceOf, indent)

  def setJustify(justify: Boolean): Unit = pango_layout_set_justify(
    this.raw.asInstanceOf,
    gboolean(gint((if justify == true then 1 else 0)))
  )

  def setJustifyLastLine(justify: Boolean): Unit =
    pango_layout_set_justify_last_line(
      this.raw.asInstanceOf,
      gboolean(gint((if justify == true then 1 else 0)))
    )

  def setLineSpacing(factor: Any /* Some(gfloat): `float` */ ): Unit =
    pango_layout_set_line_spacing(this.raw.asInstanceOf, factor)

  def setMarkup(markup: String | CString, length: Int)(using Zone): Unit =
    pango_layout_set_markup(
      this.raw.asInstanceOf,
      __sn_extract_string(markup),
      length
    )

  def setMarkupWithAccel(
      markup: String | CString,
      length: Int,
      accel_marker: Any /* Some(gunichar): `gunichar` */,
      accel_char: Any /* Some(gunichar): `gunichar*` */
  )(using Zone): Unit = pango_layout_set_markup_with_accel(
    this.raw.asInstanceOf,
    __sn_extract_string(markup),
    length,
    accel_marker,
    accel_char
  )

  def setSingleParagraphMode(setting: Boolean): Unit =
    pango_layout_set_single_paragraph_mode(
      this.raw.asInstanceOf,
      gboolean(gint((if setting == true then 1 else 0)))
    )

  def setSpacing(spacing: Int): Unit =
    pango_layout_set_spacing(this.raw.asInstanceOf, spacing)

  def setTabs(tabs: Ptr[PangoTabArray]): Unit =
    pango_layout_set_tabs(this.raw.asInstanceOf, tabs)

  def setText(text: String | CString, length: Int)(using Zone): Unit =
    pango_layout_set_text(
      this.raw.asInstanceOf,
      __sn_extract_string(text),
      length
    )

  def setWidth(width: Int): Unit =
    pango_layout_set_width(this.raw.asInstanceOf, width)

  def setWrap(wrap: PangoWrapMode): Unit =
    pango_layout_set_wrap(this.raw.asInstanceOf, wrap)

  def writeToFile(flags: PangoLayoutSerializeFlags, filename: String | CString)(
      using Zone
  ): GResult[Boolean] = GResult.wrap(__errorPtr =>
    pango_layout_write_to_file(
      this.raw.asInstanceOf,
      flags,
      __sn_extract_string(filename),
      __errorPtr
    ).value.!=(0)
  )

  def xyToIndex(
      x: Int,
      y: Int,
      `index_`: Ptr[Int],
      trailing: Ptr[Int]
  ): Boolean = pango_layout_xy_to_index(
    this.raw.asInstanceOf,
    x,
    y,
    `index_`.asInstanceOf[Ptr[int]],
    trailing.asInstanceOf[Ptr[int]]
  ).value.!=(0)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Layout

object Layout:
  def apply(context: Context): Layout = new Layout(
    pango_layout_new(context.getUnsafeRawPointer().asInstanceOf).asInstanceOf
  )
end Layout
