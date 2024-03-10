package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.gio.internal.GListStore
import sn.gnome.glib.internal.GCompareDataFunc
import sn.gnome.glib.internal.GEqualFunc
import sn.gnome.glib.internal.GEqualFuncFull
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GType

class ListStore(raw: Ptr[GListStore])
    extends Object(raw.asInstanceOf),
      ListModel:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def append(item: Object): Unit = g_list_store_append(
    this.raw.asInstanceOf,
    gpointer(item.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]])
  )

  def find(item: Object, position: Ptr[UInt]): Boolean = g_list_store_find(
    this.raw.asInstanceOf,
    gpointer(item.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]),
    position.asInstanceOf[Ptr[guint]]
  ).value.!=(0)

  def findWithEqualFunc(
      item: Object,
      equal_func: GEqualFunc,
      position: Ptr[UInt]
  ): Boolean = g_list_store_find_with_equal_func(
    this.raw.asInstanceOf,
    gpointer(item.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]),
    equal_func,
    position.asInstanceOf[Ptr[guint]]
  ).value.!=(0)

  def findWithEqualFuncFull(
      item: Object,
      equal_func: GEqualFuncFull,
      user_data: Ptr[Byte],
      position: Ptr[UInt]
  ): Boolean = g_list_store_find_with_equal_func_full(
    this.raw.asInstanceOf,
    gpointer(item.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]),
    equal_func,
    gpointer(user_data),
    position.asInstanceOf[Ptr[guint]]
  ).value.!=(0)

  def insert(position: UInt, item: Object): Unit = g_list_store_insert(
    this.raw.asInstanceOf,
    guint(position),
    gpointer(item.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]])
  )

  def insertSorted(
      item: Object,
      compare_func: GCompareDataFunc,
      user_data: Ptr[Byte]
  ): UInt = g_list_store_insert_sorted(
    this.raw.asInstanceOf,
    gpointer(item.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]),
    compare_func,
    gpointer(user_data)
  ).value

  def remove(position: UInt): Unit =
    g_list_store_remove(this.raw.asInstanceOf, guint(position))

  def removeAll(): Unit = g_list_store_remove_all(this.raw.asInstanceOf)

  def sort(compare_func: GCompareDataFunc, user_data: Ptr[Byte]): Unit =
    g_list_store_sort(this.raw.asInstanceOf, compare_func, gpointer(user_data))

end ListStore

object ListStore:
  def apply(item_type: GType): ListStore = new ListStore(
    g_list_store_new(item_type).asInstanceOf
  )
end ListStore
