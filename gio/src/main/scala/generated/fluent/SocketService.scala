package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.SocketListener

class SocketService(raw: Ptr[GSocketService]) extends SocketListener(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def isActive(): Boolean = g_socket_service_is_active(this.raw.asInstanceOf).value.!=(0)

  def start(): Unit = g_socket_service_start(this.raw.asInstanceOf)

  def stop(): Unit = g_socket_service_stop(this.raw.asInstanceOf)

end SocketService

object SocketService:
  def apply(): SocketService = new SocketService(g_socket_service_new().asInstanceOf)
end SocketService
