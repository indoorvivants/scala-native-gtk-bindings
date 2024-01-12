package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class TcpConnection(private[fluent] val raw: Ptr[GTcpConnection]) extends sn.gnome.gio.fluent.SocketConnection:
  def getGracefulDisconnect(): Boolean = g_tcp_connection_get_graceful_disconnect(this.raw)

  def setGracefulDisconnect(graceful_disconnect : Boolean): Unit = g_tcp_connection_set_graceful_disconnect(this.raw, graceful_disconnect)

end TcpConnection

