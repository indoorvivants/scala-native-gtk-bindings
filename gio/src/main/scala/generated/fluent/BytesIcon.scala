package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class BytesIcon(private[fluent] val raw: Ptr[GBytesIcon]) extends sn.gnome.gobject.fluent.Object, sn.gnome.gio.fluent.Icon, sn.gnome.gio.fluent.LoadableIcon:
  def getBytes(): Any /* Some(GLib.Bytes): GBytes**/ = g_bytes_icon_get_bytes(this.raw)

end BytesIcon

object BytesIcon:
  def apply(bytes : Any /* Some(GLib.Bytes): GBytes**/): BytesIcon = BytesIcon(g_bytes_icon_new(bytes))

end BytesIcon
