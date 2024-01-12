package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class MenuItem(private[fluent] val raw: Ptr[GMenuItem]) extends sn.gnome.gobject.fluent.Object:
  def getAttributeValue(attribute : String, expected_type : Any /* Some(GLib.VariantType): const GVariantType**/): Any /* Some(GLib.Variant): GVariant**/ = g_menu_item_get_attribute_value(this.raw, attribute, expected_type)

  def getLink(link : String): sn.gnome.gio.fluent.MenuModel = g_menu_item_get_link(this.raw, link)

  def setActionAndTargetValue(action : String, target_value : Any /* Some(GLib.Variant): GVariant**/): Unit = g_menu_item_set_action_and_target_value(this.raw, action, target_value)

  def setAttributeValue(attribute : String, value : Any /* Some(GLib.Variant): GVariant**/): Unit = g_menu_item_set_attribute_value(this.raw, attribute, value)

  def setDetailedAction(detailed_action : String): Unit = g_menu_item_set_detailed_action(this.raw, detailed_action)

  def setIcon(icon : sn.gnome.gio.fluent.Icon): Unit = g_menu_item_set_icon(this.raw, icon.raw)

  def setLabel(label : String): Unit = g_menu_item_set_label(this.raw, label)

  def setLink(link : String, model : sn.gnome.gio.fluent.MenuModel): Unit = g_menu_item_set_link(this.raw, link, model.raw)

  def setSection(section : sn.gnome.gio.fluent.MenuModel): Unit = g_menu_item_set_section(this.raw, section.raw)

  def setSubmenu(submenu : sn.gnome.gio.fluent.MenuModel): Unit = g_menu_item_set_submenu(this.raw, submenu.raw)

end MenuItem

object MenuItem:
  def apply(label : String, detailed_action : String): MenuItem = MenuItem(g_menu_item_new(label, detailed_action))

  def fromModel(model : sn.gnome.gio.fluent.MenuModel, item_index : Int): MenuItem = MenuItem(g_menu_item_new_from_model(model.raw, item_index))

  def section(label : String, section : sn.gnome.gio.fluent.MenuModel): MenuItem = MenuItem(g_menu_item_new_section(label, section.raw))

  def submenu(label : String, submenu : sn.gnome.gio.fluent.MenuModel): MenuItem = MenuItem(g_menu_item_new_submenu(label, submenu.raw))

end MenuItem
