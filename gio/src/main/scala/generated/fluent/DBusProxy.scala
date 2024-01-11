package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class DBusProxy(private[fluent] val raw: Ptr[GDBusProxy]) extends GObject.Object, AsyncInitable, DBusInterface, Initable:
  def call(method_name : String, parameters : Any /* Some(GLib.Variant): GVariant**/, flags : Any /* Some(DBusCallFlags): GDBusCallFlags*/, timeout_msec : Int, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_dbus_proxy_call(this.raw, method_name, parameters, flags, timeout_msec, cancellable.raw, callback, user_data)

  def callFinish(res : sn.gnome.gio.fluent.AsyncResult): Any /* Some(GLib.Variant): GVariant**/ = g_dbus_proxy_call_finish(this.raw, res.raw)

  def callSync(method_name : String, parameters : Any /* Some(GLib.Variant): GVariant**/, flags : Any /* Some(DBusCallFlags): GDBusCallFlags*/, timeout_msec : Int, cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(GLib.Variant): GVariant**/ = g_dbus_proxy_call_sync(this.raw, method_name, parameters, flags, timeout_msec, cancellable.raw)

  def callWithUnixFdList(method_name : String, parameters : Any /* Some(GLib.Variant): GVariant**/, flags : Any /* Some(DBusCallFlags): GDBusCallFlags*/, timeout_msec : Int, fd_list : sn.gnome.gio.fluent.UnixFDList, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_dbus_proxy_call_with_unix_fd_list(this.raw, method_name, parameters, flags, timeout_msec, fd_list.raw, cancellable.raw, callback, user_data)

  def callWithUnixFdListFinish(out_fd_list : sn.gnome.gio.fluent.UnixFDList, res : sn.gnome.gio.fluent.AsyncResult): Any /* Some(GLib.Variant): GVariant**/ = g_dbus_proxy_call_with_unix_fd_list_finish(this.raw, out_fd_list.raw, res.raw)

  def callWithUnixFdListSync(method_name : String, parameters : Any /* Some(GLib.Variant): GVariant**/, flags : Any /* Some(DBusCallFlags): GDBusCallFlags*/, timeout_msec : Int, fd_list : sn.gnome.gio.fluent.UnixFDList, out_fd_list : sn.gnome.gio.fluent.UnixFDList, cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(GLib.Variant): GVariant**/ = g_dbus_proxy_call_with_unix_fd_list_sync(this.raw, method_name, parameters, flags, timeout_msec, fd_list.raw, out_fd_list.raw, cancellable.raw)

  def getCachedProperty(property_name : String): Any /* Some(GLib.Variant): GVariant**/ = g_dbus_proxy_get_cached_property(this.raw, property_name)

  def getCachedPropertyNames(): Array[Byte] = g_dbus_proxy_get_cached_property_names(this.raw)

  def getConnection(): sn.gnome.gio.fluent.DBusConnection = g_dbus_proxy_get_connection(this.raw)

  def getDefaultTimeout(): Int = g_dbus_proxy_get_default_timeout(this.raw)

  def getFlags(): Any /* Some(DBusProxyFlags): GDBusProxyFlags*/ = g_dbus_proxy_get_flags(this.raw)

  def getInterfaceInfo(): Any /* Some(DBusInterfaceInfo): GDBusInterfaceInfo**/ = g_dbus_proxy_get_interface_info(this.raw)

  def getInterfaceName(): String = g_dbus_proxy_get_interface_name(this.raw)

  def getName(): String = g_dbus_proxy_get_name(this.raw)

  def getNameOwner(): Any /* Some(utf8): gchar**/ = g_dbus_proxy_get_name_owner(this.raw)

  def getObjectPath(): String = g_dbus_proxy_get_object_path(this.raw)

  def setCachedProperty(property_name : String, value : Any /* Some(GLib.Variant): GVariant**/): Unit = g_dbus_proxy_set_cached_property(this.raw, property_name, value)

  def setDefaultTimeout(timeout_msec : Int): Unit = g_dbus_proxy_set_default_timeout(this.raw, timeout_msec)

  def setInterfaceInfo(info : Any /* Some(DBusInterfaceInfo): GDBusInterfaceInfo**/): Unit = g_dbus_proxy_set_interface_info(this.raw, info)

end DBusProxy

object DBusProxy:
  def finish(res : sn.gnome.gio.fluent.AsyncResult): DBusProxy = DBusProxy(g_dbus_proxy_new_finish(res.raw))

  def forBusFinish(res : sn.gnome.gio.fluent.AsyncResult): DBusProxy = DBusProxy(g_dbus_proxy_new_for_bus_finish(res.raw))

  def forBusSync(bus_type : GBusType, flags : Any /* Some(DBusProxyFlags): GDBusProxyFlags*/, info : Any /* Some(DBusInterfaceInfo): GDBusInterfaceInfo**/, name : String, object_path : String, interface_name : String, cancellable : sn.gnome.gio.fluent.Cancellable): DBusProxy = DBusProxy(g_dbus_proxy_new_for_bus_sync(bus_type, flags, info, name, object_path, interface_name, cancellable.raw))

  def sync(connection : sn.gnome.gio.fluent.DBusConnection, flags : Any /* Some(DBusProxyFlags): GDBusProxyFlags*/, info : Any /* Some(DBusInterfaceInfo): GDBusInterfaceInfo**/, name : String, object_path : String, interface_name : String, cancellable : sn.gnome.gio.fluent.Cancellable): DBusProxy = DBusProxy(g_dbus_proxy_new_sync(connection.raw, flags, info, name, object_path, interface_name, cancellable.raw))

end DBusProxy
