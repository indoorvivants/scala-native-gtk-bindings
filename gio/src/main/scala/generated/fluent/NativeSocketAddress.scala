package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.SocketAddress
import sn.gnome.gio.fluent.SocketConnectable

class NativeSocketAddress(raw: Ptr[GNativeSocketAddress]) extends SocketAddress(raw.asInstanceOf), SocketConnectable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end NativeSocketAddress

object NativeSocketAddress:
  def apply(native : Ptr[Byte], len : ULong): NativeSocketAddress = new NativeSocketAddress(g_native_socket_address_new(gpointer(native), gsize(len)).asInstanceOf)
end NativeSocketAddress
