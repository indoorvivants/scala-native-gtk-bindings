package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.MenuModel
import sn.gnome.gio.internal.GMenuLinkIter
import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.fluent.Object

class MenuLinkIter(raw: Ptr[GMenuLinkIter]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getName()(using Zone): String = fromCString(
    g_menu_link_iter_get_name(this.raw.asInstanceOf).asInstanceOf
  )

  def getNext(
      out_link: Any /* Some(utf8): `const gchar**` */,
      value: MenuModel
  ): Boolean = g_menu_link_iter_get_next(
    this.raw.asInstanceOf,
    out_link,
    value.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  def getValue(): MenuModel = new MenuModel(
    g_menu_link_iter_get_value(this.raw.asInstanceOf).asInstanceOf
  )

  def next(): Boolean = g_menu_link_iter_next(this.raw.asInstanceOf).value.!=(0)

end MenuLinkIter
