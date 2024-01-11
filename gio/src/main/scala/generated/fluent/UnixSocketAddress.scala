package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class UnixSocketAddress(private[fluent] val raw: Ptr[GUnixSocketAddress]) extends SocketAddress, SocketConnectable:
  def getAddressType(): GUnixSocketAddressType = g_unix_socket_address_get_address_type(this.raw)

  def getIsAbstract(): Boolean = g_unix_socket_address_get_is_abstract(this.raw)

  def getPath(): String = g_unix_socket_address_get_path(this.raw)

  def getPathLen(): Any /* Some(gsize): gsize*/ = g_unix_socket_address_get_path_len(this.raw)

end UnixSocketAddress

object UnixSocketAddress:
  def apply(path : String): UnixSocketAddress = UnixSocketAddress(g_unix_socket_address_new(path))

  def abstract(path : Array[Byte], path_len : Int): UnixSocketAddress = UnixSocketAddress(g_unix_socket_address_new_abstract(path, path_len))

  def withType(path : Array[Byte], path_len : Int, `type` : GUnixSocketAddressType): UnixSocketAddress = UnixSocketAddress(g_unix_socket_address_new_with_type(path, path_len, `type`))

end UnixSocketAddress
