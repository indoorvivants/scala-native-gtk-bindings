package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class DBusAuthObserver(private[fluent] val raw: Ptr[GDBusAuthObserver]) extends GObject.Object:
  def allowMechanism(mechanism : String): Boolean = g_dbus_auth_observer_allow_mechanism(this.raw, mechanism)

  def authorizeAuthenticatedPeer(stream : sn.gnome.gio.fluent.IOStream, credentials : sn.gnome.gio.fluent.Credentials): Boolean = g_dbus_auth_observer_authorize_authenticated_peer(this.raw, stream.raw, credentials.raw)

end DBusAuthObserver

object DBusAuthObserver:
  def apply(): DBusAuthObserver = DBusAuthObserver(g_dbus_auth_observer_new())

end DBusAuthObserver
