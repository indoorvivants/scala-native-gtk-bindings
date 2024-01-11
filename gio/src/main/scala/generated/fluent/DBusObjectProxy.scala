package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class DBusObjectProxy(private[fluent] val raw: Ptr[GDBusObjectProxy]) extends GObject.Object, DBusObject:
  def getConnection(): sn.gnome.gio.fluent.DBusConnection = g_dbus_object_proxy_get_connection(this.raw)

end DBusObjectProxy

object DBusObjectProxy:
  def apply(connection : sn.gnome.gio.fluent.DBusConnection, object_path : String): DBusObjectProxy = DBusObjectProxy(g_dbus_object_proxy_new(connection.raw, object_path))

end DBusObjectProxy
