package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class Menu(private[fluent] val raw: Ptr[GMenu]) extends MenuModel:
  def append(label : String, detailed_action : String): Unit = g_menu_append(this.raw, label, detailed_action)

  def appendItem(item : sn.gnome.gio.fluent.MenuItem): Unit = g_menu_append_item(this.raw, item.raw)

  def appendSection(label : String, section : sn.gnome.gio.fluent.MenuModel): Unit = g_menu_append_section(this.raw, label, section.raw)

  def appendSubmenu(label : String, submenu : sn.gnome.gio.fluent.MenuModel): Unit = g_menu_append_submenu(this.raw, label, submenu.raw)

  def freeze(): Unit = g_menu_freeze(this.raw)

  def insert(position : Int, label : String, detailed_action : String): Unit = g_menu_insert(this.raw, position, label, detailed_action)

  def insertItem(position : Int, item : sn.gnome.gio.fluent.MenuItem): Unit = g_menu_insert_item(this.raw, position, item.raw)

  def insertSection(position : Int, label : String, section : sn.gnome.gio.fluent.MenuModel): Unit = g_menu_insert_section(this.raw, position, label, section.raw)

  def insertSubmenu(position : Int, label : String, submenu : sn.gnome.gio.fluent.MenuModel): Unit = g_menu_insert_submenu(this.raw, position, label, submenu.raw)

  def prepend(label : String, detailed_action : String): Unit = g_menu_prepend(this.raw, label, detailed_action)

  def prependItem(item : sn.gnome.gio.fluent.MenuItem): Unit = g_menu_prepend_item(this.raw, item.raw)

  def prependSection(label : String, section : sn.gnome.gio.fluent.MenuModel): Unit = g_menu_prepend_section(this.raw, label, section.raw)

  def prependSubmenu(label : String, submenu : sn.gnome.gio.fluent.MenuModel): Unit = g_menu_prepend_submenu(this.raw, label, submenu.raw)

  def remove(position : Int): Unit = g_menu_remove(this.raw, position)

  def removeAll(): Unit = g_menu_remove_all(this.raw)

end Menu

object Menu:
  def apply(): Menu = Menu(g_menu_new())

end Menu
