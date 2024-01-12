package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class DebugControllerDBus(private[fluent] val raw: Ptr[GDebugControllerDBus]) extends sn.gnome.gobject.fluent.Object, sn.gnome.gio.fluent.DebugController, sn.gnome.gio.fluent.Initable:
  def stop(): Unit = g_debug_controller_dbus_stop(this.raw)

end DebugControllerDBus

object DebugControllerDBus:
  def apply(connection : sn.gnome.gio.fluent.DBusConnection, cancellable : sn.gnome.gio.fluent.Cancellable): DebugControllerDBus = DebugControllerDBus(g_debug_controller_dbus_new(connection.raw, cancellable.raw))

end DebugControllerDBus
