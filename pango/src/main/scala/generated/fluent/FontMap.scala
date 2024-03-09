package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.pango.fluent.Context
import sn.gnome.pango.fluent.Font
import sn.gnome.pango.fluent.FontFamily
import sn.gnome.pango.fluent.Fontset
import sn.gnome.pango.internal.PangoFontDescription
import sn.gnome.pango.internal.PangoFontMap
import sn.gnome.pango.internal.PangoLanguage

class FontMap(raw: Ptr[PangoFontMap])
    extends Object(raw.asInstanceOf),
      ListModel:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def changed(): Unit = pango_font_map_changed(this.raw.asInstanceOf)

  def createContext(): Context = new Context(
    pango_font_map_create_context(this.raw.asInstanceOf).asInstanceOf
  )

  def getFamily(name: String | CString)(using Zone): FontFamily =
    new FontFamily(
      pango_font_map_get_family(
        this.raw.asInstanceOf,
        __sn_extract_string(name)
      ).asInstanceOf
    )

  def getSerial(): UInt = pango_font_map_get_serial(this.raw.asInstanceOf).value

  def listFamilies(families: Ptr[FontFamily], n_families: Ptr[Int]): Unit =
    pango_font_map_list_families(
      this.raw.asInstanceOf,
      families,
      n_families.asInstanceOf[Ptr[int]]
    )

  def loadFont(context: Context, desc: Ptr[PangoFontDescription]): Font =
    new Font(
      pango_font_map_load_font(
        this.raw.asInstanceOf,
        context.getUnsafeRawPointer().asInstanceOf,
        desc
      ).asInstanceOf
    )

  def loadFontset(
      context: Context,
      desc: Ptr[PangoFontDescription],
      language: Ptr[PangoLanguage]
  ): Fontset = new Fontset(
    pango_font_map_load_fontset(
      this.raw.asInstanceOf,
      context.getUnsafeRawPointer().asInstanceOf,
      desc,
      language
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end FontMap
