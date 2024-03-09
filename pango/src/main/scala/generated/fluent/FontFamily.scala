package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.ListModel
import sn.gnome.gobject.fluent.Object
import sn.gnome.pango.fluent.FontFace
import sn.gnome.pango.internal.PangoFontFamily

class FontFamily(raw: Ptr[PangoFontFamily])
    extends Object(raw.asInstanceOf),
      ListModel:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getFace(name: String | CString)(using Zone): FontFace = new FontFace(
    pango_font_family_get_face(
      this.raw.asInstanceOf,
      __sn_extract_string(name)
    ).asInstanceOf
  )

  def getName()(using Zone): String = pango_font_family_get_name(
    this.raw.asInstanceOf
  )

  def isMonospace(): Boolean =
    pango_font_family_is_monospace(this.raw.asInstanceOf).value.!=(0)

  def isVariable(): Boolean =
    pango_font_family_is_variable(this.raw.asInstanceOf).value.!=(0)

  def listFaces(faces: Ptr[FontFace], n_faces: Ptr[Int]): Unit =
    pango_font_family_list_faces(
      this.raw.asInstanceOf,
      faces,
      n_faces.asInstanceOf[Ptr[int]]
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end FontFamily
