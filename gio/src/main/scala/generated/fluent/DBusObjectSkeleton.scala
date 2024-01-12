package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class DBusObjectSkeleton(private[fluent] val raw: Ptr[GDBusObjectSkeleton]) extends sn.gnome.gobject.fluent.Object, sn.gnome.gio.fluent.DBusObject:
  def addInterface(`interface_` : sn.gnome.gio.fluent.DBusInterfaceSkeleton): Unit = g_dbus_object_skeleton_add_interface(this.raw, `interface_`.raw)

  def flush(): Unit = g_dbus_object_skeleton_flush(this.raw)

  def removeInterface(`interface_` : sn.gnome.gio.fluent.DBusInterfaceSkeleton): Unit = g_dbus_object_skeleton_remove_interface(this.raw, `interface_`.raw)

  def removeInterfaceByName(interface_name : String): Unit = g_dbus_object_skeleton_remove_interface_by_name(this.raw, interface_name)

  def setObjectPath(object_path : String): Unit = g_dbus_object_skeleton_set_object_path(this.raw, object_path)

end DBusObjectSkeleton

object DBusObjectSkeleton:
  def apply(object_path : String): DBusObjectSkeleton = DBusObjectSkeleton(g_dbus_object_skeleton_new(object_path))

end DBusObjectSkeleton
