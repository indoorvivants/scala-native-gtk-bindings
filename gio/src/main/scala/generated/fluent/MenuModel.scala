package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class MenuModel(private[fluent] val raw: Ptr[GMenuModel]) extends sn.gnome.gobject.fluent.Object:
  def getItemAttributeValue(item_index : Int, attribute : String, expected_type : Any /* Some(GLib.VariantType): const GVariantType**/): Any /* Some(GLib.Variant): GVariant**/ = g_menu_model_get_item_attribute_value(this.raw, item_index, attribute, expected_type)

  def getItemLink(item_index : Int, link : String): sn.gnome.gio.fluent.MenuModel = g_menu_model_get_item_link(this.raw, item_index, link)

  def getNItems(): Int = g_menu_model_get_n_items(this.raw)

  def isMutable(): Boolean = g_menu_model_is_mutable(this.raw)

  def itemsChanged(position : Int, removed : Int, added : Int): Unit = g_menu_model_items_changed(this.raw, position, removed, added)

  def iterateItemAttributes(item_index : Int): sn.gnome.gio.fluent.MenuAttributeIter = g_menu_model_iterate_item_attributes(this.raw, item_index)

  def iterateItemLinks(item_index : Int): sn.gnome.gio.fluent.MenuLinkIter = g_menu_model_iterate_item_links(this.raw, item_index)

end MenuModel

