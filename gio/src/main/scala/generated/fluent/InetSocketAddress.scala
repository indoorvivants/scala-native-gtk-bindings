package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class InetSocketAddress(private[fluent] val raw: Ptr[GInetSocketAddress]) extends SocketAddress, SocketConnectable:
  def getAddress(): sn.gnome.gio.fluent.InetAddress = g_inet_socket_address_get_address(this.raw)

  def getFlowinfo(): UInt = g_inet_socket_address_get_flowinfo(this.raw)

  def getPort(): UShort = g_inet_socket_address_get_port(this.raw)

  def getScopeId(): UInt = g_inet_socket_address_get_scope_id(this.raw)

end InetSocketAddress

object InetSocketAddress:
  def apply(address : sn.gnome.gio.fluent.InetAddress, port : UShort): InetSocketAddress = InetSocketAddress(g_inet_socket_address_new(address.raw, port))

  def fromString(address : String, port : Any /* Some(guint): guint*/): InetSocketAddress = InetSocketAddress(g_inet_socket_address_new_from_string(address, port))

end InetSocketAddress
