package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GUnixMountMonitor
import sn.gnome.gobject.fluent.Object

class UnixMountMonitor(raw: Ptr[GUnixMountMonitor])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def setRateLimit(limit_msec: Int): Unit =
    g_unix_mount_monitor_set_rate_limit(this.raw.asInstanceOf, limit_msec)

end UnixMountMonitor

object UnixMountMonitor:
  def apply(): UnixMountMonitor = new UnixMountMonitor(
    g_unix_mount_monitor_new().asInstanceOf
  )
end UnixMountMonitor
