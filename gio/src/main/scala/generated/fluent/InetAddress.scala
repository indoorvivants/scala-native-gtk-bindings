package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class InetAddress(private[fluent] val raw: Ptr[GInetAddress]) extends GObject.Object:
  def equal(other_address : sn.gnome.gio.fluent.InetAddress): Boolean = g_inet_address_equal(this.raw, other_address.raw)

  def getFamily(): GSocketFamily = g_inet_address_get_family(this.raw)

  def getIsAny(): Boolean = g_inet_address_get_is_any(this.raw)

  def getIsLinkLocal(): Boolean = g_inet_address_get_is_link_local(this.raw)

  def getIsLoopback(): Boolean = g_inet_address_get_is_loopback(this.raw)

  def getIsMcGlobal(): Boolean = g_inet_address_get_is_mc_global(this.raw)

  def getIsMcLinkLocal(): Boolean = g_inet_address_get_is_mc_link_local(this.raw)

  def getIsMcNodeLocal(): Boolean = g_inet_address_get_is_mc_node_local(this.raw)

  def getIsMcOrgLocal(): Boolean = g_inet_address_get_is_mc_org_local(this.raw)

  def getIsMcSiteLocal(): Boolean = g_inet_address_get_is_mc_site_local(this.raw)

  def getIsMulticast(): Boolean = g_inet_address_get_is_multicast(this.raw)

  def getIsSiteLocal(): Boolean = g_inet_address_get_is_site_local(this.raw)

  def getNativeSize(): Any /* Some(gsize): gsize*/ = g_inet_address_get_native_size(this.raw)

  def toBytes(): Any /* Some(guint8): const guint8**/ = g_inet_address_to_bytes(this.raw)

  def toString(): Any /* Some(utf8): gchar**/ = g_inet_address_to_string(this.raw)

end InetAddress

object InetAddress:
  def any(family : GSocketFamily): InetAddress = InetAddress(g_inet_address_new_any(family))

  def fromBytes(bytes : Array[Byte], family : GSocketFamily): InetAddress = InetAddress(g_inet_address_new_from_bytes(bytes, family))

  def fromString(string : String): InetAddress = InetAddress(g_inet_address_new_from_string(string))

  def loopback(family : GSocketFamily): InetAddress = InetAddress(g_inet_address_new_loopback(family))

end InetAddress
