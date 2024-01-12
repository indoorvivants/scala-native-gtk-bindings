package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class InetAddressMask(private[fluent] val raw: Ptr[GInetAddressMask]) extends sn.gnome.gobject.fluent.Object, sn.gnome.gio.fluent.Initable:
  def equal(mask2 : sn.gnome.gio.fluent.InetAddressMask): Boolean = g_inet_address_mask_equal(this.raw, mask2.raw)

  def getAddress(): sn.gnome.gio.fluent.InetAddress = g_inet_address_mask_get_address(this.raw)

  def getFamily(): GSocketFamily = g_inet_address_mask_get_family(this.raw)

  def getLength(): Any /* Some(guint): guint*/ = g_inet_address_mask_get_length(this.raw)

  def matches(address : sn.gnome.gio.fluent.InetAddress): Boolean = g_inet_address_mask_matches(this.raw, address.raw)

  def toString(): Any /* Some(utf8): gchar**/ = g_inet_address_mask_to_string(this.raw)

end InetAddressMask

object InetAddressMask:
  def apply(addr : sn.gnome.gio.fluent.InetAddress, length : Any /* Some(guint): guint*/): InetAddressMask = InetAddressMask(g_inet_address_mask_new(addr.raw, length))

  def fromString(mask_string : String): InetAddressMask = InetAddressMask(g_inet_address_mask_new_from_string(mask_string))

end InetAddressMask
