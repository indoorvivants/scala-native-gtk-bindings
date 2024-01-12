package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class NativeSocketAddress(private[fluent] val raw: Ptr[GNativeSocketAddress]) extends sn.gnome.gio.fluent.SocketAddress, sn.gnome.gio.fluent.SocketConnectable

object NativeSocketAddress:
  def apply(native : Ptr[Byte], len : Any /* Some(gsize): gsize*/): NativeSocketAddress = NativeSocketAddress(g_native_socket_address_new(native, len))

end NativeSocketAddress
