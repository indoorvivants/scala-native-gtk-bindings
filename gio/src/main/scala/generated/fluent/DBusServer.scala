package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class DBusServer(private[fluent] val raw: Ptr[GDBusServer]) extends sn.gnome.gobject.fluent.Object, sn.gnome.gio.fluent.Initable:
  def getClientAddress(): String = g_dbus_server_get_client_address(this.raw)

  def getFlags(): Any /* Some(DBusServerFlags): GDBusServerFlags*/ = g_dbus_server_get_flags(this.raw)

  def getGuid(): String = g_dbus_server_get_guid(this.raw)

  def isActive(): Boolean = g_dbus_server_is_active(this.raw)

  def start(): Unit = g_dbus_server_start(this.raw)

  def stop(): Unit = g_dbus_server_stop(this.raw)

end DBusServer

object DBusServer:
  def sync(address : String, flags : Any /* Some(DBusServerFlags): GDBusServerFlags*/, guid : String, observer : sn.gnome.gio.fluent.DBusAuthObserver, cancellable : sn.gnome.gio.fluent.Cancellable): DBusServer = DBusServer(g_dbus_server_new_sync(address, flags, guid, observer.raw, cancellable.raw))

end DBusServer
