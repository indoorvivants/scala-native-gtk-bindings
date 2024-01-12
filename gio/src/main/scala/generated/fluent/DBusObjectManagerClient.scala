package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class DBusObjectManagerClient(private[fluent] val raw: Ptr[GDBusObjectManagerClient]) extends sn.gnome.gobject.fluent.Object, sn.gnome.gio.fluent.AsyncInitable, sn.gnome.gio.fluent.DBusObjectManager, sn.gnome.gio.fluent.Initable:
  def getConnection(): sn.gnome.gio.fluent.DBusConnection = g_dbus_object_manager_client_get_connection(this.raw)

  def getFlags(): Any /* Some(DBusObjectManagerClientFlags): GDBusObjectManagerClientFlags*/ = g_dbus_object_manager_client_get_flags(this.raw)

  def getName(): String = g_dbus_object_manager_client_get_name(this.raw)

  def getNameOwner(): Any /* Some(utf8): gchar**/ = g_dbus_object_manager_client_get_name_owner(this.raw)

end DBusObjectManagerClient

object DBusObjectManagerClient:
  def finish(res : sn.gnome.gio.fluent.AsyncResult): DBusObjectManagerClient = DBusObjectManagerClient(g_dbus_object_manager_client_new_finish(res.raw))

  def forBusFinish(res : sn.gnome.gio.fluent.AsyncResult): DBusObjectManagerClient = DBusObjectManagerClient(g_dbus_object_manager_client_new_for_bus_finish(res.raw))

  def forBusSync(bus_type : GBusType, flags : Any /* Some(DBusObjectManagerClientFlags): GDBusObjectManagerClientFlags*/, name : String, object_path : String, get_proxy_type_func : Any /* Some(DBusProxyTypeFunc): GDBusProxyTypeFunc*/, get_proxy_type_user_data : Ptr[Byte], get_proxy_type_destroy_notify : Any /* Some(GLib.DestroyNotify): GDestroyNotify*/, cancellable : sn.gnome.gio.fluent.Cancellable): DBusObjectManagerClient = DBusObjectManagerClient(g_dbus_object_manager_client_new_for_bus_sync(bus_type, flags, name, object_path, get_proxy_type_func, get_proxy_type_user_data, get_proxy_type_destroy_notify, cancellable.raw))

  def sync(connection : sn.gnome.gio.fluent.DBusConnection, flags : Any /* Some(DBusObjectManagerClientFlags): GDBusObjectManagerClientFlags*/, name : String, object_path : String, get_proxy_type_func : Any /* Some(DBusProxyTypeFunc): GDBusProxyTypeFunc*/, get_proxy_type_user_data : Ptr[Byte], get_proxy_type_destroy_notify : Any /* Some(GLib.DestroyNotify): GDestroyNotify*/, cancellable : sn.gnome.gio.fluent.Cancellable): DBusObjectManagerClient = DBusObjectManagerClient(g_dbus_object_manager_client_new_sync(connection.raw, flags, name, object_path, get_proxy_type_func, get_proxy_type_user_data, get_proxy_type_destroy_notify, cancellable.raw))

end DBusObjectManagerClient
