package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class MenuLinkIter(private[fluent] val raw: Ptr[GMenuLinkIter]) extends GObject.Object:
  def getName(): String = g_menu_link_iter_get_name(this.raw)

  def getNext(out_link : Any /* Some(utf8): const gchar***/, value : sn.gnome.gio.fluent.MenuModel): Boolean = g_menu_link_iter_get_next(this.raw, out_link, value.raw)

  def getValue(): sn.gnome.gio.fluent.MenuModel = g_menu_link_iter_get_value(this.raw)

  def next(): Boolean = g_menu_link_iter_next(this.raw)

end MenuLinkIter

