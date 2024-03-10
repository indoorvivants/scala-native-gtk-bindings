package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object
import sn.gnome.pango.fluent.FontFamily
import sn.gnome.pango.internal.PangoFontDescription
import sn.gnome.pango.internal.PangoFontFace

class FontFace(raw: Ptr[PangoFontFace]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def describe(): Ptr[PangoFontDescription] = pango_font_face_describe(
    this.raw.asInstanceOf
  )

  def getFaceName()(using Zone): String = pango_font_face_get_face_name(
    this.raw.asInstanceOf
  )

  def getFamily(): FontFamily = new FontFamily(
    pango_font_face_get_family(this.raw.asInstanceOf).asInstanceOf
  )

  def isSynthesized(): Boolean =
    pango_font_face_is_synthesized(this.raw.asInstanceOf).value.!=(0)

  def listSizes(sizes: Ptr[Ptr[Int]], n_sizes: Ptr[Int]): Unit =
    pango_font_face_list_sizes(
      this.raw.asInstanceOf,
      sizes,
      n_sizes.asInstanceOf[Ptr[int]]
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end FontFace
