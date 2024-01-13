package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.SocketConnectable
import sn.gnome.gio.internal.GSocketFamily
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object

class SocketAddress(raw: Ptr[GSocketAddress]) extends Object(raw.asInstanceOf), SocketConnectable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getFamily(): GSocketFamily = g_socket_address_get_family(this.raw.asInstanceOf)

  def getNativeSize(): Any /* Some(gssize): `gssize` */ = g_socket_address_get_native_size(this.raw.asInstanceOf)

  def toNative(dest : Ptr[Byte], destlen : Any /* Some(gsize): `gsize` */): Boolean = g_socket_address_to_native(this.raw.asInstanceOf, gpointer(dest), destlen).value.!=(0)

end SocketAddress

object SocketAddress:
  def fromNative(native : Ptr[Byte], len : Any /* Some(gsize): `gsize` */): SocketAddress = new SocketAddress(g_socket_address_new_from_native(gpointer(native), len).asInstanceOf)
end SocketAddress
