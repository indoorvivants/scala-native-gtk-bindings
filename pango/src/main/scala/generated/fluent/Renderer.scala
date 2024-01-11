package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

class Renderer(private[fluent] val raw: Ptr[PangoRenderer]) extends sn.gnome.gobject.fluent.Object:
  def activate(): Unit = pango_renderer_activate(this.raw)

  def deactivate(): Unit = pango_renderer_deactivate(this.raw)

  def drawErrorUnderline(x : Int, y : Int, width : Int, height : Int): Unit = pango_renderer_draw_error_underline(this.raw, x, y, width, height)

  def drawGlyph(font : sn.gnome.pango.fluent.Font, glyph : Any /* Some(Glyph): PangoGlyph*/, x : Double, y : Double): Unit = pango_renderer_draw_glyph(this.raw, font.raw, glyph, x, y)

  def drawGlyphItem(text : String, glyph_item : Any /* Some(GlyphItem): PangoGlyphItem**/, x : Int, y : Int): Unit = pango_renderer_draw_glyph_item(this.raw, text, glyph_item, x, y)

  def drawGlyphs(font : sn.gnome.pango.fluent.Font, glyphs : Any /* Some(GlyphString): PangoGlyphString**/, x : Int, y : Int): Unit = pango_renderer_draw_glyphs(this.raw, font.raw, glyphs, x, y)

  def drawLayout(layout : sn.gnome.pango.fluent.Layout, x : Int, y : Int): Unit = pango_renderer_draw_layout(this.raw, layout.raw, x, y)

  def drawLayoutLine(line : Any /* Some(LayoutLine): PangoLayoutLine**/, x : Int, y : Int): Unit = pango_renderer_draw_layout_line(this.raw, line, x, y)

  def drawRectangle(part : PangoRenderPart, x : Int, y : Int, width : Int, height : Int): Unit = pango_renderer_draw_rectangle(this.raw, part, x, y, width, height)

  def drawTrapezoid(part : PangoRenderPart, `y1_` : Double, x11 : Double, x21 : Double, y2 : Double, x12 : Double, x22 : Double): Unit = pango_renderer_draw_trapezoid(this.raw, part, `y1_`, x11, x21, y2, x12, x22)

  def getAlpha(part : PangoRenderPart): UShort = pango_renderer_get_alpha(this.raw, part)

  def getColor(part : PangoRenderPart): Any /* Some(Color): PangoColor**/ = pango_renderer_get_color(this.raw, part)

  def getLayout(): sn.gnome.pango.fluent.Layout = pango_renderer_get_layout(this.raw)

  def getLayoutLine(): Any /* Some(LayoutLine): PangoLayoutLine**/ = pango_renderer_get_layout_line(this.raw)

  def getMatrix(): Any /* Some(Matrix): const PangoMatrix**/ = pango_renderer_get_matrix(this.raw)

  def partChanged(part : PangoRenderPart): Unit = pango_renderer_part_changed(this.raw, part)

  def setAlpha(part : PangoRenderPart, alpha : UShort): Unit = pango_renderer_set_alpha(this.raw, part, alpha)

  def setColor(part : PangoRenderPart, color : Any /* Some(Color): const PangoColor**/): Unit = pango_renderer_set_color(this.raw, part, color)

  def setMatrix(matrix : Any /* Some(Matrix): const PangoMatrix**/): Unit = pango_renderer_set_matrix(this.raw, matrix)

end Renderer

