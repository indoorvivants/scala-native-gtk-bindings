package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.Credentials
import sn.gnome.gio.fluent.DatagramBased
import sn.gnome.gio.fluent.InetAddress
import sn.gnome.gio.fluent.Initable
import sn.gnome.gio.fluent.Socket
import sn.gnome.gio.fluent.SocketAddress
import sn.gnome.gio.fluent.SocketConnection
import sn.gnome.gio.fluent.SocketControlMessage
import sn.gnome.gio.internal.GInputMessage
import sn.gnome.gio.internal.GInputVector
import sn.gnome.gio.internal.GOutputMessage
import sn.gnome.gio.internal.GOutputVector
import sn.gnome.gio.internal.GPollableReturn
import sn.gnome.gio.internal.GSocketFamily
import sn.gnome.gio.internal.GSocketProtocol
import sn.gnome.gio.internal.GSocketType
import sn.gnome.glib.internal.GIOCondition
import sn.gnome.glib.internal.GSource
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object

class Socket(raw: Ptr[GSocket]) extends Object(raw.asInstanceOf), DatagramBased, Initable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def accept(cancellable : Cancellable): Socket = new Socket(g_socket_accept(this.raw.asInstanceOf, cancellable.getUnsafeRawPointer().asInstanceOf).asInstanceOf)

  def bind(address : SocketAddress, allow_reuse : Boolean): Boolean = g_socket_bind(this.raw.asInstanceOf, address.getUnsafeRawPointer().asInstanceOf, allow_reuse).value.!=(0)

  def checkConnectResult(): Boolean = g_socket_check_connect_result(this.raw.asInstanceOf).value.!=(0)

  def close(): Boolean = g_socket_close(this.raw.asInstanceOf).value.!=(0)

  def conditionCheck(condition : GIOCondition): GIOCondition = g_socket_condition_check(this.raw.asInstanceOf, condition)

  def conditionTimedWait(condition : GIOCondition, timeout_us : Any /* Some(gint64): `gint64` */, cancellable : Cancellable): Boolean = g_socket_condition_timed_wait(this.raw.asInstanceOf, condition, timeout_us, cancellable.getUnsafeRawPointer().asInstanceOf).value.!=(0)

  def conditionWait(condition : GIOCondition, cancellable : Cancellable): Boolean = g_socket_condition_wait(this.raw.asInstanceOf, condition, cancellable.getUnsafeRawPointer().asInstanceOf).value.!=(0)

  def connect(address : SocketAddress, cancellable : Cancellable): Boolean = g_socket_connect(this.raw.asInstanceOf, address.getUnsafeRawPointer().asInstanceOf, cancellable.getUnsafeRawPointer().asInstanceOf).value.!=(0)

  def connectionFactoryCreateConnection(): SocketConnection = new SocketConnection(g_socket_connection_factory_create_connection(this.raw.asInstanceOf).asInstanceOf)

  def createSource(condition : GIOCondition, cancellable : Cancellable): Ptr[GSource] = g_socket_create_source(this.raw.asInstanceOf, condition, cancellable.getUnsafeRawPointer().asInstanceOf)

  def getAvailableBytes(): Any /* Some(gssize): `gssize` */ = g_socket_get_available_bytes(this.raw.asInstanceOf)

  def getBlocking(): Boolean = g_socket_get_blocking(this.raw.asInstanceOf).value.!=(0)

  def getBroadcast(): Boolean = g_socket_get_broadcast(this.raw.asInstanceOf).value.!=(0)

  def getCredentials(): Credentials = new Credentials(g_socket_get_credentials(this.raw.asInstanceOf).asInstanceOf)

  def getFamily(): GSocketFamily = g_socket_get_family(this.raw.asInstanceOf)

  def getFd(): Int = g_socket_get_fd(this.raw.asInstanceOf)

  def getKeepalive(): Boolean = g_socket_get_keepalive(this.raw.asInstanceOf).value.!=(0)

  def getListenBacklog(): Int = g_socket_get_listen_backlog(this.raw.asInstanceOf).value

  def getLocalAddress(): SocketAddress = new SocketAddress(g_socket_get_local_address(this.raw.asInstanceOf).asInstanceOf)

  def getMulticastLoopback(): Boolean = g_socket_get_multicast_loopback(this.raw.asInstanceOf).value.!=(0)

  def getMulticastTtl(): UInt = g_socket_get_multicast_ttl(this.raw.asInstanceOf).value

  def getOption(level : Int, optname : Int, value : Any /* Some(gint): `gint*` */): Boolean = g_socket_get_option(this.raw.asInstanceOf, gint(level), gint(optname), value).value.!=(0)

  def getProtocol(): GSocketProtocol = g_socket_get_protocol(this.raw.asInstanceOf)

  def getRemoteAddress(): SocketAddress = new SocketAddress(g_socket_get_remote_address(this.raw.asInstanceOf).asInstanceOf)

  def getSocketType(): GSocketType = g_socket_get_socket_type(this.raw.asInstanceOf)

  def getTimeout(): UInt = g_socket_get_timeout(this.raw.asInstanceOf).value

  def getTtl(): UInt = g_socket_get_ttl(this.raw.asInstanceOf).value

  def isClosed(): Boolean = g_socket_is_closed(this.raw.asInstanceOf).value.!=(0)

  def isConnected(): Boolean = g_socket_is_connected(this.raw.asInstanceOf).value.!=(0)

  def joinMulticastGroup(group : InetAddress, source_specific : Boolean, iface : String | CString)(using Zone): Boolean = g_socket_join_multicast_group(this.raw.asInstanceOf, group.getUnsafeRawPointer().asInstanceOf, source_specific, __sn_extract_string(iface).asInstanceOf[Ptr[gchar]]).value.!=(0)

  def joinMulticastGroupSsm(group : InetAddress, source_specific : InetAddress, iface : String | CString)(using Zone): Boolean = g_socket_join_multicast_group_ssm(this.raw.asInstanceOf, group.getUnsafeRawPointer().asInstanceOf, source_specific.getUnsafeRawPointer().asInstanceOf, __sn_extract_string(iface).asInstanceOf[Ptr[gchar]]).value.!=(0)

  def leaveMulticastGroup(group : InetAddress, source_specific : Boolean, iface : String | CString)(using Zone): Boolean = g_socket_leave_multicast_group(this.raw.asInstanceOf, group.getUnsafeRawPointer().asInstanceOf, source_specific, __sn_extract_string(iface).asInstanceOf[Ptr[gchar]]).value.!=(0)

  def leaveMulticastGroupSsm(group : InetAddress, source_specific : InetAddress, iface : String | CString)(using Zone): Boolean = g_socket_leave_multicast_group_ssm(this.raw.asInstanceOf, group.getUnsafeRawPointer().asInstanceOf, source_specific.getUnsafeRawPointer().asInstanceOf, __sn_extract_string(iface).asInstanceOf[Ptr[gchar]]).value.!=(0)

  def listen(): Boolean = g_socket_listen(this.raw.asInstanceOf).value.!=(0)

  def receiveMessage(address : SocketAddress, vectors : Ptr[GInputVector], num_vectors : Int, messages : Ptr[SocketControlMessage], num_messages : Any /* Some(gint): `gint*` */, flags : Any /* Some(gint): `gint*` */, cancellable : Cancellable): Any /* Some(gssize): `gssize` */ = g_socket_receive_message(this.raw.asInstanceOf, address.getUnsafeRawPointer().asInstanceOf, vectors, gint(num_vectors), messages, num_messages, flags, cancellable.getUnsafeRawPointer().asInstanceOf)

  def receiveMessages(messages : Ptr[GInputMessage], num_messages : UInt, flags : Int, cancellable : Cancellable): Int = g_socket_receive_messages(this.raw.asInstanceOf, messages, guint(num_messages), gint(flags), cancellable.getUnsafeRawPointer().asInstanceOf).value

  def sendMessage(address : SocketAddress, vectors : Ptr[GOutputVector], num_vectors : Int, messages : Ptr[SocketControlMessage], num_messages : Int, flags : Int, cancellable : Cancellable): Any /* Some(gssize): `gssize` */ = g_socket_send_message(this.raw.asInstanceOf, address.getUnsafeRawPointer().asInstanceOf, vectors, gint(num_vectors), messages, gint(num_messages), gint(flags), cancellable.getUnsafeRawPointer().asInstanceOf)

  def sendMessageWithTimeout(address : SocketAddress, vectors : Ptr[GOutputVector], num_vectors : Int, messages : Ptr[SocketControlMessage], num_messages : Int, flags : Int, timeout_us : Any /* Some(gint64): `gint64` */, bytes_written : Any /* Some(gsize): `gsize*` */, cancellable : Cancellable): GPollableReturn = g_socket_send_message_with_timeout(this.raw.asInstanceOf, address.getUnsafeRawPointer().asInstanceOf, vectors, gint(num_vectors), messages, gint(num_messages), gint(flags), timeout_us, bytes_written, cancellable.getUnsafeRawPointer().asInstanceOf)

  def sendMessages(messages : Ptr[GOutputMessage], num_messages : UInt, flags : Int, cancellable : Cancellable): Int = g_socket_send_messages(this.raw.asInstanceOf, messages, guint(num_messages), gint(flags), cancellable.getUnsafeRawPointer().asInstanceOf).value

  def setBlocking(blocking : Boolean): Unit = g_socket_set_blocking(this.raw.asInstanceOf, blocking)

  def setBroadcast(broadcast : Boolean): Unit = g_socket_set_broadcast(this.raw.asInstanceOf, broadcast)

  def setKeepalive(keepalive : Boolean): Unit = g_socket_set_keepalive(this.raw.asInstanceOf, keepalive)

  def setListenBacklog(backlog : Int): Unit = g_socket_set_listen_backlog(this.raw.asInstanceOf, gint(backlog))

  def setMulticastLoopback(loopback : Boolean): Unit = g_socket_set_multicast_loopback(this.raw.asInstanceOf, loopback)

  def setMulticastTtl(ttl : UInt): Unit = g_socket_set_multicast_ttl(this.raw.asInstanceOf, guint(ttl))

  def setOption(level : Int, optname : Int, value : Int): Boolean = g_socket_set_option(this.raw.asInstanceOf, gint(level), gint(optname), gint(value)).value.!=(0)

  def setTimeout(timeout : UInt): Unit = g_socket_set_timeout(this.raw.asInstanceOf, guint(timeout))

  def setTtl(ttl : UInt): Unit = g_socket_set_ttl(this.raw.asInstanceOf, guint(ttl))

  def shutdown(shutdown_read : Boolean, shutdown_write : Boolean): Boolean = g_socket_shutdown(this.raw.asInstanceOf, shutdown_read, shutdown_write).value.!=(0)

  def speaksIpv4(): Boolean = g_socket_speaks_ipv4(this.raw.asInstanceOf).value.!=(0)


  private inline def __sn_extract_string(str: String | CString)(using Zone): CString = 
    str match
      case s: String => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Socket

object Socket:
  def apply(family : GSocketFamily, `type` : GSocketType, protocol : GSocketProtocol): Socket = new Socket(g_socket_new(family, `type`, protocol).asInstanceOf)
  def fromFd(fd : Int): Socket = new Socket(g_socket_new_from_fd(gint(fd)).asInstanceOf)
end Socket
