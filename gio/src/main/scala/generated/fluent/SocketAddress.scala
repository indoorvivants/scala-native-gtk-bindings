package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class SocketAddress(private[fluent] val raw: Ptr[GSocketAddress]) extends sn.gnome.gobject.fluent.Object, sn.gnome.gio.fluent.SocketConnectable:
  def getFamily(): GSocketFamily = g_socket_address_get_family(this.raw)

  def getNativeSize(): Any /* Some(gssize): gssize*/ = g_socket_address_get_native_size(this.raw)

  def toNative(dest : Ptr[Byte], destlen : Any /* Some(gsize): gsize*/): Boolean = g_socket_address_to_native(this.raw, dest, destlen)

end SocketAddress

object SocketAddress:
  def fromNative(native : Ptr[Byte], len : Any /* Some(gsize): gsize*/): SocketAddress = SocketAddress(g_socket_address_new_from_native(native, len))

end SocketAddress
