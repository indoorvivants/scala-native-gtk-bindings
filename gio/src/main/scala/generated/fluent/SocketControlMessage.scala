package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class SocketControlMessage(private[fluent] val raw: Ptr[GSocketControlMessage]) extends sn.gnome.gobject.fluent.Object:
  def getLevel(): Int = g_socket_control_message_get_level(this.raw)

  def getMsgType(): Int = g_socket_control_message_get_msg_type(this.raw)

  def getSize(): Any /* Some(gsize): gsize*/ = g_socket_control_message_get_size(this.raw)

  def serialize(data : Ptr[Byte]): Unit = g_socket_control_message_serialize(this.raw, data)

end SocketControlMessage

