package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.Credentials
import sn.gnome.gio.fluent.SocketConnection
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GUnixConnection
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer

class UnixConnection(raw: Ptr[GUnixConnection])
    extends SocketConnection(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def receiveCredentials(cancellable: Cancellable): Credentials =
    new Credentials(
      g_unix_connection_receive_credentials(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )

  def receiveCredentialsAsync(
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_unix_connection_receive_credentials_async(
    this.raw.asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def receiveCredentialsFinish(result: AsyncResult): Credentials =
    new Credentials(
      g_unix_connection_receive_credentials_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )

  def receiveFd(cancellable: Cancellable): Int = g_unix_connection_receive_fd(
    this.raw.asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf
  ).value

  def sendCredentials(cancellable: Cancellable): Boolean =
    g_unix_connection_send_credentials(
      this.raw.asInstanceOf,
      cancellable.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)

  def sendCredentialsAsync(
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_unix_connection_send_credentials_async(
    this.raw.asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def sendCredentialsFinish(result: AsyncResult): Boolean =
    g_unix_connection_send_credentials_finish(
      this.raw.asInstanceOf,
      result.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)

  def sendFd(fd: Int, cancellable: Cancellable): Boolean =
    g_unix_connection_send_fd(
      this.raw.asInstanceOf,
      gint(fd),
      cancellable.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)

end UnixConnection
