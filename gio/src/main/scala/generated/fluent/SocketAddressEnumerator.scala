package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class SocketAddressEnumerator(private[fluent] val raw: Ptr[GSocketAddressEnumerator]) extends sn.gnome.gobject.fluent.Object:
  def next(cancellable : sn.gnome.gio.fluent.Cancellable): sn.gnome.gio.fluent.SocketAddress = g_socket_address_enumerator_next(this.raw, cancellable.raw)

  def nextAsync(cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_socket_address_enumerator_next_async(this.raw, cancellable.raw, callback, user_data)

  def nextFinish(result : sn.gnome.gio.fluent.AsyncResult): sn.gnome.gio.fluent.SocketAddress = g_socket_address_enumerator_next_finish(this.raw, result.raw)

end SocketAddressEnumerator

