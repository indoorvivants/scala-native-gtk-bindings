package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class UnixConnection(private[fluent] val raw: Ptr[GUnixConnection]) extends sn.gnome.gio.fluent.SocketConnection:
  def receiveCredentials(cancellable : sn.gnome.gio.fluent.Cancellable): sn.gnome.gio.fluent.Credentials = g_unix_connection_receive_credentials(this.raw, cancellable.raw)

  def receiveCredentialsAsync(cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_unix_connection_receive_credentials_async(this.raw, cancellable.raw, callback, user_data)

  def receiveCredentialsFinish(result : sn.gnome.gio.fluent.AsyncResult): sn.gnome.gio.fluent.Credentials = g_unix_connection_receive_credentials_finish(this.raw, result.raw)

  def receiveFd(cancellable : sn.gnome.gio.fluent.Cancellable): Int = g_unix_connection_receive_fd(this.raw, cancellable.raw)

  def sendCredentials(cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_unix_connection_send_credentials(this.raw, cancellable.raw)

  def sendCredentialsAsync(cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_unix_connection_send_credentials_async(this.raw, cancellable.raw, callback, user_data)

  def sendCredentialsFinish(result : sn.gnome.gio.fluent.AsyncResult): Boolean = g_unix_connection_send_credentials_finish(this.raw, result.raw)

  def sendFd(fd : Int, cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_unix_connection_send_fd(this.raw, fd, cancellable.raw)

end UnixConnection

