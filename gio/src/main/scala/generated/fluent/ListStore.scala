package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class ListStore(private[fluent] val raw: Ptr[GListStore]) extends GObject.Object, ListModel:
  def append(item : sn.gnome.gobject.fluent.Object): Unit = g_list_store_append(this.raw, item.raw)

  def find(item : sn.gnome.gobject.fluent.Object, position : Any /* Some(guint): guint**/): Boolean = g_list_store_find(this.raw, item.raw, position)

  def findWithEqualFunc(item : sn.gnome.gobject.fluent.Object, equal_func : Any /* Some(GLib.EqualFunc): GEqualFunc*/, position : Any /* Some(guint): guint**/): Boolean = g_list_store_find_with_equal_func(this.raw, item.raw, equal_func, position)

  def findWithEqualFuncFull(item : sn.gnome.gobject.fluent.Object, equal_func : Any /* Some(GLib.EqualFuncFull): GEqualFuncFull*/, user_data : Ptr[Byte], position : Any /* Some(guint): guint**/): Boolean = g_list_store_find_with_equal_func_full(this.raw, item.raw, equal_func, user_data, position)

  def insert(position : Any /* Some(guint): guint*/, item : sn.gnome.gobject.fluent.Object): Unit = g_list_store_insert(this.raw, position, item.raw)

  def insertSorted(item : sn.gnome.gobject.fluent.Object, compare_func : Any /* Some(GLib.CompareDataFunc): GCompareDataFunc*/, user_data : Ptr[Byte]): Any /* Some(guint): guint*/ = g_list_store_insert_sorted(this.raw, item.raw, compare_func, user_data)

  def remove(position : Any /* Some(guint): guint*/): Unit = g_list_store_remove(this.raw, position)

  def removeAll(): Unit = g_list_store_remove_all(this.raw)

  def sort(compare_func : Any /* Some(GLib.CompareDataFunc): GCompareDataFunc*/, user_data : Ptr[Byte]): Unit = g_list_store_sort(this.raw, compare_func, user_data)

  def splice(position : Any /* Some(guint): guint*/, n_removals : Any /* Some(guint): guint*/, additions : Array[Byte], n_additions : Any /* Some(guint): guint*/): Unit = g_list_store_splice(this.raw, position, n_removals, additions, n_additions)

end ListStore

object ListStore:
  def apply(item_type : Any /* Some(GType): GType*/): ListStore = ListStore(g_list_store_new(item_type))

end ListStore
