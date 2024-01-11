package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class NetworkAddress(private[fluent] val raw: Ptr[GNetworkAddress]) extends GObject.Object, SocketConnectable:
  def getHostname(): String = g_network_address_get_hostname(this.raw)

  def getPort(): UShort = g_network_address_get_port(this.raw)

  def getScheme(): String = g_network_address_get_scheme(this.raw)

end NetworkAddress

object NetworkAddress:
  def apply(hostname : String, port : UShort): NetworkAddress = NetworkAddress(g_network_address_new(hostname, port))

  def loopback(port : UShort): NetworkAddress = NetworkAddress(g_network_address_new_loopback(port))

end NetworkAddress
