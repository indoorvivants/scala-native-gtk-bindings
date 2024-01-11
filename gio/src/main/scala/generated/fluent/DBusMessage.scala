package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class DBusMessage(private[fluent] val raw: Ptr[GDBusMessage]) extends GObject.Object:
  def copy(): sn.gnome.gio.fluent.DBusMessage = g_dbus_message_copy(this.raw)

  def getArg0(): String = g_dbus_message_get_arg0(this.raw)

  def getBody(): Any /* Some(GLib.Variant): GVariant**/ = g_dbus_message_get_body(this.raw)

  def getByteOrder(): GDBusMessageByteOrder = g_dbus_message_get_byte_order(this.raw)

  def getDestination(): String = g_dbus_message_get_destination(this.raw)

  def getErrorName(): String = g_dbus_message_get_error_name(this.raw)

  def getFlags(): Any /* Some(DBusMessageFlags): GDBusMessageFlags*/ = g_dbus_message_get_flags(this.raw)

  def getHeader(header_field : GDBusMessageHeaderField): Any /* Some(GLib.Variant): GVariant**/ = g_dbus_message_get_header(this.raw, header_field)

  def getHeaderFields(): Array[Byte] = g_dbus_message_get_header_fields(this.raw)

  def getInterface(): String = g_dbus_message_get_interface(this.raw)

  def getLocked(): Boolean = g_dbus_message_get_locked(this.raw)

  def getMember(): String = g_dbus_message_get_member(this.raw)

  def getMessageType(): GDBusMessageType = g_dbus_message_get_message_type(this.raw)

  def getNumUnixFds(): UInt = g_dbus_message_get_num_unix_fds(this.raw)

  def getPath(): String = g_dbus_message_get_path(this.raw)

  def getReplySerial(): UInt = g_dbus_message_get_reply_serial(this.raw)

  def getSender(): String = g_dbus_message_get_sender(this.raw)

  def getSerial(): UInt = g_dbus_message_get_serial(this.raw)

  def getSignature(): String = g_dbus_message_get_signature(this.raw)

  def getUnixFdList(): sn.gnome.gio.fluent.UnixFDList = g_dbus_message_get_unix_fd_list(this.raw)

  def lock(): Unit = g_dbus_message_lock(this.raw)

  def newMethodErrorLiteral(error_name : String, error_message : String): sn.gnome.gio.fluent.DBusMessage = g_dbus_message_new_method_error_literal(this.raw, error_name, error_message)

  def newMethodErrorValist(error_name : String, error_message_format : String, var_args : Any /* Some(va_list): va_list*/): sn.gnome.gio.fluent.DBusMessage = g_dbus_message_new_method_error_valist(this.raw, error_name, error_message_format, var_args)

  def newMethodReply(): sn.gnome.gio.fluent.DBusMessage = g_dbus_message_new_method_reply(this.raw)

  def print(indent : Any /* Some(guint): guint*/): Any /* Some(utf8): gchar**/ = g_dbus_message_print(this.raw, indent)

  def setBody(body : Any /* Some(GLib.Variant): GVariant**/): Unit = g_dbus_message_set_body(this.raw, body)

  def setByteOrder(byte_order : GDBusMessageByteOrder): Unit = g_dbus_message_set_byte_order(this.raw, byte_order)

  def setDestination(value : String): Unit = g_dbus_message_set_destination(this.raw, value)

  def setErrorName(value : String): Unit = g_dbus_message_set_error_name(this.raw, value)

  def setFlags(flags : Any /* Some(DBusMessageFlags): GDBusMessageFlags*/): Unit = g_dbus_message_set_flags(this.raw, flags)

  def setHeader(header_field : GDBusMessageHeaderField, value : Any /* Some(GLib.Variant): GVariant**/): Unit = g_dbus_message_set_header(this.raw, header_field, value)

  def setInterface(value : String): Unit = g_dbus_message_set_interface(this.raw, value)

  def setMember(value : String): Unit = g_dbus_message_set_member(this.raw, value)

  def setMessageType(`type` : GDBusMessageType): Unit = g_dbus_message_set_message_type(this.raw, `type`)

  def setNumUnixFds(value : UInt): Unit = g_dbus_message_set_num_unix_fds(this.raw, value)

  def setPath(value : String): Unit = g_dbus_message_set_path(this.raw, value)

  def setReplySerial(value : UInt): Unit = g_dbus_message_set_reply_serial(this.raw, value)

  def setSender(value : String): Unit = g_dbus_message_set_sender(this.raw, value)

  def setSerial(serial : UInt): Unit = g_dbus_message_set_serial(this.raw, serial)

  def setSignature(value : String): Unit = g_dbus_message_set_signature(this.raw, value)

  def setUnixFdList(fd_list : sn.gnome.gio.fluent.UnixFDList): Unit = g_dbus_message_set_unix_fd_list(this.raw, fd_list.raw)

  def toBlob(out_size : Any /* Some(gsize): gsize**/, capabilities : Any /* Some(DBusCapabilityFlags): GDBusCapabilityFlags*/): Array[Byte] = g_dbus_message_to_blob(this.raw, out_size, capabilities)

  def toGerror(): Boolean = g_dbus_message_to_gerror(this.raw)

end DBusMessage

object DBusMessage:
  def apply(): DBusMessage = DBusMessage(g_dbus_message_new())

  def fromBlob(blob : Array[Byte], blob_len : Any /* Some(gsize): gsize*/, capabilities : Any /* Some(DBusCapabilityFlags): GDBusCapabilityFlags*/): DBusMessage = DBusMessage(g_dbus_message_new_from_blob(blob, blob_len, capabilities))

  def methodCall(name : String, path : String, `interface_` : String, method : String): DBusMessage = DBusMessage(g_dbus_message_new_method_call(name, path, `interface_`, method))

  def signal(path : String, `interface_` : String, signal : String): DBusMessage = DBusMessage(g_dbus_message_new_signal(path, `interface_`, signal))

end DBusMessage
