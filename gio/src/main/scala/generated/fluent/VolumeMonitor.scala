package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Mount
import sn.gnome.gio.fluent.Volume
import sn.gnome.glib.internal.GList
import sn.gnome.gobject.fluent.Object

class VolumeMonitor(raw: Ptr[GVolumeMonitor]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getConnectedDrives(): Ptr[GList] = g_volume_monitor_get_connected_drives(this.raw.asInstanceOf)

  def getMountForUuid(uuid : String | CString)(using Zone): Mount = g_volume_monitor_get_mount_for_uuid(this.raw.asInstanceOf, __sn_extract_string(uuid))

  def getMounts(): Ptr[GList] = g_volume_monitor_get_mounts(this.raw.asInstanceOf)

  def getVolumeForUuid(uuid : String | CString)(using Zone): Volume = g_volume_monitor_get_volume_for_uuid(this.raw.asInstanceOf, __sn_extract_string(uuid))

  def getVolumes(): Ptr[GList] = g_volume_monitor_get_volumes(this.raw.asInstanceOf)


  private inline def __sn_extract_string(str: String | CString)(using Zone): CString = 
    str match
      case s: String => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end VolumeMonitor
