package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class DBusInterfaceSkeleton(private[fluent] val raw: Ptr[GDBusInterfaceSkeleton]) extends GObject.Object, DBusInterface:
  def export(connection : sn.gnome.gio.fluent.DBusConnection, object_path : String): Boolean = g_dbus_interface_skeleton_export(this.raw, connection.raw, object_path)

  def flush(): Unit = g_dbus_interface_skeleton_flush(this.raw)

  def getConnection(): sn.gnome.gio.fluent.DBusConnection = g_dbus_interface_skeleton_get_connection(this.raw)

  def getConnections(): Any /* Some(GLib.List): GList**/ = g_dbus_interface_skeleton_get_connections(this.raw)

  def getFlags(): Any /* Some(DBusInterfaceSkeletonFlags): GDBusInterfaceSkeletonFlags*/ = g_dbus_interface_skeleton_get_flags(this.raw)

  def getInfo(): Any /* Some(DBusInterfaceInfo): GDBusInterfaceInfo**/ = g_dbus_interface_skeleton_get_info(this.raw)

  def getObjectPath(): String = g_dbus_interface_skeleton_get_object_path(this.raw)

  def getProperties(): Any /* Some(GLib.Variant): GVariant**/ = g_dbus_interface_skeleton_get_properties(this.raw)

  def getVtable(): Any /* Some(DBusInterfaceVTable): GDBusInterfaceVTable**/ = g_dbus_interface_skeleton_get_vtable(this.raw)

  def hasConnection(connection : sn.gnome.gio.fluent.DBusConnection): Boolean = g_dbus_interface_skeleton_has_connection(this.raw, connection.raw)

  def setFlags(flags : Any /* Some(DBusInterfaceSkeletonFlags): GDBusInterfaceSkeletonFlags*/): Unit = g_dbus_interface_skeleton_set_flags(this.raw, flags)

  def unexport(): Unit = g_dbus_interface_skeleton_unexport(this.raw)

  def unexportFromConnection(connection : sn.gnome.gio.fluent.DBusConnection): Unit = g_dbus_interface_skeleton_unexport_from_connection(this.raw, connection.raw)

end DBusInterfaceSkeleton

