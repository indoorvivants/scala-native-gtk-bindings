package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class VolumeMonitor(private[fluent] val raw: Ptr[GVolumeMonitor]) extends GObject.Object:
  def getConnectedDrives(): Any /* Some(GLib.List): GList**/ = g_volume_monitor_get_connected_drives(this.raw)

  def getMountForUuid(uuid : String): sn.gnome.gio.fluent.Mount = g_volume_monitor_get_mount_for_uuid(this.raw, uuid)

  def getMounts(): Any /* Some(GLib.List): GList**/ = g_volume_monitor_get_mounts(this.raw)

  def getVolumeForUuid(uuid : String): sn.gnome.gio.fluent.Volume = g_volume_monitor_get_volume_for_uuid(this.raw, uuid)

  def getVolumes(): Any /* Some(GLib.List): GList**/ = g_volume_monitor_get_volumes(this.raw)

end VolumeMonitor

