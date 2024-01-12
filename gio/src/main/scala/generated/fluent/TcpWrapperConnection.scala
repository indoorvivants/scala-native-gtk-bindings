package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class TcpWrapperConnection(private[fluent] val raw: Ptr[GTcpWrapperConnection]) extends sn.gnome.gio.fluent.TcpConnection:
  def getBaseIoStream(): sn.gnome.gio.fluent.IOStream = g_tcp_wrapper_connection_get_base_io_stream(this.raw)

end TcpWrapperConnection

object TcpWrapperConnection:
  def apply(base_io_stream : sn.gnome.gio.fluent.IOStream, socket : sn.gnome.gio.fluent.Socket): TcpWrapperConnection = TcpWrapperConnection(g_tcp_wrapper_connection_new(base_io_stream.raw, socket.raw))

end TcpWrapperConnection
