package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class TestDBus(private[fluent] val raw: Ptr[GTestDBus]) extends GObject.Object:
  def addServiceDir(path : String): Unit = g_test_dbus_add_service_dir(this.raw, path)

  def down(): Unit = g_test_dbus_down(this.raw)

  def getBusAddress(): String = g_test_dbus_get_bus_address(this.raw)

  def getFlags(): Any /* Some(TestDBusFlags): GTestDBusFlags*/ = g_test_dbus_get_flags(this.raw)

  def stop(): Unit = g_test_dbus_stop(this.raw)

  def up(): Unit = g_test_dbus_up(this.raw)

end TestDBus

object TestDBus:
  def apply(flags : Any /* Some(TestDBusFlags): GTestDBusFlags*/): TestDBus = TestDBus(g_test_dbus_new(flags))

end TestDBus
