package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class SocketListener(private[fluent] val raw: Ptr[GSocketListener]) extends sn.gnome.gobject.fluent.Object:
  def accept(source_object : sn.gnome.gobject.fluent.Object, cancellable : sn.gnome.gio.fluent.Cancellable): sn.gnome.gio.fluent.SocketConnection = g_socket_listener_accept(this.raw, source_object.raw, cancellable.raw)

  def acceptAsync(cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_socket_listener_accept_async(this.raw, cancellable.raw, callback, user_data)

  def acceptFinish(result : sn.gnome.gio.fluent.AsyncResult, source_object : sn.gnome.gobject.fluent.Object): sn.gnome.gio.fluent.SocketConnection = g_socket_listener_accept_finish(this.raw, result.raw, source_object.raw)

  def acceptSocket(source_object : sn.gnome.gobject.fluent.Object, cancellable : sn.gnome.gio.fluent.Cancellable): sn.gnome.gio.fluent.Socket = g_socket_listener_accept_socket(this.raw, source_object.raw, cancellable.raw)

  def acceptSocketAsync(cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_socket_listener_accept_socket_async(this.raw, cancellable.raw, callback, user_data)

  def acceptSocketFinish(result : sn.gnome.gio.fluent.AsyncResult, source_object : sn.gnome.gobject.fluent.Object): sn.gnome.gio.fluent.Socket = g_socket_listener_accept_socket_finish(this.raw, result.raw, source_object.raw)

  def addAddress(address : sn.gnome.gio.fluent.SocketAddress, `type` : GSocketType, protocol : GSocketProtocol, source_object : sn.gnome.gobject.fluent.Object, effective_address : sn.gnome.gio.fluent.SocketAddress): Boolean = g_socket_listener_add_address(this.raw, address.raw, `type`, protocol, source_object.raw, effective_address.raw)

  def addAnyInetPort(source_object : sn.gnome.gobject.fluent.Object): UShort = g_socket_listener_add_any_inet_port(this.raw, source_object.raw)

  def addInetPort(port : UShort, source_object : sn.gnome.gobject.fluent.Object): Boolean = g_socket_listener_add_inet_port(this.raw, port, source_object.raw)

  def addSocket(socket : sn.gnome.gio.fluent.Socket, source_object : sn.gnome.gobject.fluent.Object): Boolean = g_socket_listener_add_socket(this.raw, socket.raw, source_object.raw)

  def close(): Unit = g_socket_listener_close(this.raw)

  def setBacklog(listen_backlog : Int): Unit = g_socket_listener_set_backlog(this.raw, listen_backlog)

end SocketListener

object SocketListener:
  def apply(): SocketListener = SocketListener(g_socket_listener_new())

end SocketListener
