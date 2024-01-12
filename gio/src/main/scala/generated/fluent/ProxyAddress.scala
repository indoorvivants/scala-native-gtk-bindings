package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class ProxyAddress(private[fluent] val raw: Ptr[GProxyAddress]) extends sn.gnome.gio.fluent.InetSocketAddress, sn.gnome.gio.fluent.SocketConnectable:
  def getDestinationHostname(): String = g_proxy_address_get_destination_hostname(this.raw)

  def getDestinationPort(): UShort = g_proxy_address_get_destination_port(this.raw)

  def getDestinationProtocol(): String = g_proxy_address_get_destination_protocol(this.raw)

  def getPassword(): String = g_proxy_address_get_password(this.raw)

  def getProtocol(): String = g_proxy_address_get_protocol(this.raw)

  def getUri(): String = g_proxy_address_get_uri(this.raw)

  def getUsername(): String = g_proxy_address_get_username(this.raw)

end ProxyAddress

object ProxyAddress:
  def apply(inetaddr : sn.gnome.gio.fluent.InetAddress, port : UShort, protocol : String, dest_hostname : String, dest_port : UShort, username : String, password : String): ProxyAddress = ProxyAddress(g_proxy_address_new(inetaddr.raw, port, protocol, dest_hostname, dest_port, username, password))

end ProxyAddress
