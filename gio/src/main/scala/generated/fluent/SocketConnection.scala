package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class SocketConnection(private[fluent] val raw: Ptr[GSocketConnection]) extends IOStream:
  def connect(address : sn.gnome.gio.fluent.SocketAddress, cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_socket_connection_connect(this.raw, address.raw, cancellable.raw)

  def connectAsync(address : sn.gnome.gio.fluent.SocketAddress, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_socket_connection_connect_async(this.raw, address.raw, cancellable.raw, callback, user_data)

  def connectFinish(result : sn.gnome.gio.fluent.AsyncResult): Boolean = g_socket_connection_connect_finish(this.raw, result.raw)

  def getLocalAddress(): sn.gnome.gio.fluent.SocketAddress = g_socket_connection_get_local_address(this.raw)

  def getRemoteAddress(): sn.gnome.gio.fluent.SocketAddress = g_socket_connection_get_remote_address(this.raw)

  def getSocket(): sn.gnome.gio.fluent.Socket = g_socket_connection_get_socket(this.raw)

  def isConnected(): Boolean = g_socket_connection_is_connected(this.raw)

end SocketConnection

