package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class FileMonitor(private[fluent] val raw: Ptr[GFileMonitor]) extends sn.gnome.gobject.fluent.Object:
  def cancel(): Boolean = g_file_monitor_cancel(this.raw)

  def emitEvent(child : sn.gnome.gio.fluent.File, other_file : sn.gnome.gio.fluent.File, event_type : GFileMonitorEvent): Unit = g_file_monitor_emit_event(this.raw, child.raw, other_file.raw, event_type)

  def isCancelled(): Boolean = g_file_monitor_is_cancelled(this.raw)

  def setRateLimit(limit_msecs : Int): Unit = g_file_monitor_set_rate_limit(this.raw, limit_msecs)

end FileMonitor

