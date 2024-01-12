package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class UnixMountMonitor(private[fluent] val raw: Ptr[GUnixMountMonitor]) extends sn.gnome.gobject.fluent.Object:
  def setRateLimit(limit_msec : Int): Unit = g_unix_mount_monitor_set_rate_limit(this.raw, limit_msec)

end UnixMountMonitor

object UnixMountMonitor:
  def apply(): UnixMountMonitor = UnixMountMonitor(g_unix_mount_monitor_new())

end UnixMountMonitor
