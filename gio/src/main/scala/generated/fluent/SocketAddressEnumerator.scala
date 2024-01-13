package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.SocketAddress
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object

class SocketAddressEnumerator(raw: Ptr[GSocketAddressEnumerator]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def next(cancellable : Cancellable): SocketAddress = new SocketAddress(g_socket_address_enumerator_next(this.raw.asInstanceOf, cancellable.getUnsafeRawPointer().asInstanceOf).asInstanceOf)

  def nextAsync(cancellable : Cancellable, callback : GAsyncReadyCallback, user_data : Ptr[Byte]): Unit = g_socket_address_enumerator_next_async(this.raw.asInstanceOf, cancellable.getUnsafeRawPointer().asInstanceOf, callback, gpointer(user_data))

  def nextFinish(result : AsyncResult): SocketAddress = new SocketAddress(g_socket_address_enumerator_next_finish(this.raw.asInstanceOf, result.getUnsafeRawPointer().asInstanceOf).asInstanceOf)

end SocketAddressEnumerator
