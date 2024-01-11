package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class MenuAttributeIter(private[fluent] val raw: Ptr[GMenuAttributeIter]) extends GObject.Object:
  def getName(): String = g_menu_attribute_iter_get_name(this.raw)

  def getNext(out_name : Any /* Some(utf8): const gchar***/, value : Any /* Some(GLib.Variant): GVariant***/): Boolean = g_menu_attribute_iter_get_next(this.raw, out_name, value)

  def getValue(): Any /* Some(GLib.Variant): GVariant**/ = g_menu_attribute_iter_get_value(this.raw)

  def next(): Boolean = g_menu_attribute_iter_next(this.raw)

end MenuAttributeIter

