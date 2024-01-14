package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.SocketConnectable
import sn.gnome.gio.internal.GSocketFamily
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.gsize
import sn.gnome.glib.internal.gssize
import sn.gnome.gobject.fluent.Object

class SocketAddress(raw: Ptr[GSocketAddress]) extends Object(raw.asInstanceOf), SocketConnectable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getFamily(): GSocketFamily = g_socket_address_get_family(this.raw.asInstanceOf)

  def getNativeSize(): ULong = g_socket_address_get_native_size(this.raw.asInstanceOf).value

  def toNative(dest : Ptr[Byte], destlen : ULong): Boolean = g_socket_address_to_native(this.raw.asInstanceOf, gpointer(dest), gsize(destlen)).value.!=(0)

end SocketAddress

object SocketAddress:
  def fromNative(native : Ptr[Byte], len : ULong): SocketAddress = new SocketAddress(g_socket_address_new_from_native(gpointer(native), gsize(len)).asInstanceOf)
end SocketAddress
