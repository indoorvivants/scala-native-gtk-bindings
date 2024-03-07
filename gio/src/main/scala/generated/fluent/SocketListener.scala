package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.Socket
import sn.gnome.gio.fluent.SocketAddress
import sn.gnome.gio.fluent.SocketConnection
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GSocketListener
import sn.gnome.gio.internal.GSocketProtocol
import sn.gnome.gio.internal.GSocketType
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.guint16
import sn.gnome.gobject.fluent.Object

class SocketListener(raw: Ptr[GSocketListener])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def accept(
      source_object: Object,
      cancellable: Cancellable
  ): SocketConnection = new SocketConnection(
    g_socket_listener_accept(
      this.raw.asInstanceOf,
      source_object.getUnsafeRawPointer().asInstanceOf,
      cancellable.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  def acceptAsync(
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_socket_listener_accept_async(
    this.raw.asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def acceptFinish(
      result: AsyncResult,
      source_object: Object
  ): SocketConnection = new SocketConnection(
    g_socket_listener_accept_finish(
      this.raw.asInstanceOf,
      result.getUnsafeRawPointer().asInstanceOf,
      source_object.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  def acceptSocket(source_object: Object, cancellable: Cancellable): Socket =
    new Socket(
      g_socket_listener_accept_socket(
        this.raw.asInstanceOf,
        source_object.getUnsafeRawPointer().asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )

  def acceptSocketAsync(
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_socket_listener_accept_socket_async(
    this.raw.asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def acceptSocketFinish(result: AsyncResult, source_object: Object): Socket =
    new Socket(
      g_socket_listener_accept_socket_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        source_object.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )

  def addAddress(
      address: SocketAddress,
      `type`: GSocketType,
      protocol: GSocketProtocol,
      source_object: Object,
      effective_address: SocketAddress
  ): Boolean = g_socket_listener_add_address(
    this.raw.asInstanceOf,
    address.getUnsafeRawPointer().asInstanceOf,
    `type`,
    protocol,
    source_object.getUnsafeRawPointer().asInstanceOf,
    effective_address.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  def addAnyInetPort(source_object: Object): UShort =
    g_socket_listener_add_any_inet_port(
      this.raw.asInstanceOf,
      source_object.getUnsafeRawPointer().asInstanceOf
    ).value

  def addInetPort(port: UShort, source_object: Object): Boolean =
    g_socket_listener_add_inet_port(
      this.raw.asInstanceOf,
      guint16(port),
      source_object.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)

  def addSocket(socket: Socket, source_object: Object): Boolean =
    g_socket_listener_add_socket(
      this.raw.asInstanceOf,
      socket.getUnsafeRawPointer().asInstanceOf,
      source_object.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)

  def close(): Unit = g_socket_listener_close(this.raw.asInstanceOf)

  def setBacklog(listen_backlog: Int): Unit =
    g_socket_listener_set_backlog(this.raw.asInstanceOf, listen_backlog)

end SocketListener

object SocketListener:
  def apply(): SocketListener = new SocketListener(
    g_socket_listener_new().asInstanceOf
  )
end SocketListener
