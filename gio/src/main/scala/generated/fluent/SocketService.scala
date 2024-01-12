package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class SocketService(private[fluent] val raw: Ptr[GSocketService]) extends sn.gnome.gio.fluent.SocketListener:
  def isActive(): Boolean = g_socket_service_is_active(this.raw)

  def start(): Unit = g_socket_service_start(this.raw)

  def stop(): Unit = g_socket_service_stop(this.raw)

end SocketService

object SocketService:
  def apply(): SocketService = SocketService(g_socket_service_new())

end SocketService
