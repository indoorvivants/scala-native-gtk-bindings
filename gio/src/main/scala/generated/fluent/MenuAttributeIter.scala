package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GVariant
import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.fluent.Object

class MenuAttributeIter(raw: Ptr[GMenuAttributeIter]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getName()(using Zone): String = fromCString(g_menu_attribute_iter_get_name(this.raw.asInstanceOf).asInstanceOf)

  def getNext(out_name : Any /* Some(utf8): `const gchar**` */, value : Ptr[Ptr[GVariant]]): Boolean = g_menu_attribute_iter_get_next(this.raw.asInstanceOf, out_name, value).value.!=(0)

  def getValue(): Ptr[GVariant] = g_menu_attribute_iter_get_value(this.raw.asInstanceOf)

  def next(): Boolean = g_menu_attribute_iter_next(this.raw.asInstanceOf).value.!=(0)

end MenuAttributeIter
