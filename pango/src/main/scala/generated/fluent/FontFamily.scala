package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

class FontFamily(private[fluent] val raw: Ptr[PangoFontFamily]) extends sn.gnome.gobject.fluent.Object, sn.gnome.gio.fluent.ListModel:
  def getFace(name : String): sn.gnome.pango.fluent.FontFace = pango_font_family_get_face(this.raw, name)

  def getName(): String = pango_font_family_get_name(this.raw)

  def isMonospace(): Boolean = pango_font_family_is_monospace(this.raw)

  def isVariable(): Boolean = pango_font_family_is_variable(this.raw)

  def listFaces(faces : Array[Byte], n_faces : Any /* Some(gint): int**/): Unit = pango_font_family_list_faces(this.raw, faces, n_faces)

end FontFamily

