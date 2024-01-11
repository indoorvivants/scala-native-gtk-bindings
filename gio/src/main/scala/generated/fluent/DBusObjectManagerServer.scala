package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class DBusObjectManagerServer(private[fluent] val raw: Ptr[GDBusObjectManagerServer]) extends GObject.Object, DBusObjectManager:
  def export(`object` : sn.gnome.gio.fluent.DBusObjectSkeleton): Unit = g_dbus_object_manager_server_export(this.raw, `object`.raw)

  def exportUniquely(`object` : sn.gnome.gio.fluent.DBusObjectSkeleton): Unit = g_dbus_object_manager_server_export_uniquely(this.raw, `object`.raw)

  def getConnection(): sn.gnome.gio.fluent.DBusConnection = g_dbus_object_manager_server_get_connection(this.raw)

  def isExported(`object` : sn.gnome.gio.fluent.DBusObjectSkeleton): Boolean = g_dbus_object_manager_server_is_exported(this.raw, `object`.raw)

  def setConnection(connection : sn.gnome.gio.fluent.DBusConnection): Unit = g_dbus_object_manager_server_set_connection(this.raw, connection.raw)

  def unexport(object_path : String): Boolean = g_dbus_object_manager_server_unexport(this.raw, object_path)

end DBusObjectManagerServer

object DBusObjectManagerServer:
  def apply(object_path : String): DBusObjectManagerServer = DBusObjectManagerServer(g_dbus_object_manager_server_new(object_path))

end DBusObjectManagerServer
