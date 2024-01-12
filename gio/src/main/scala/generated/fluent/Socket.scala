package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class Socket(private[fluent] val raw: Ptr[GSocket]) extends sn.gnome.gobject.fluent.Object, sn.gnome.gio.fluent.DatagramBased, sn.gnome.gio.fluent.Initable:
  def accept(cancellable : sn.gnome.gio.fluent.Cancellable): sn.gnome.gio.fluent.Socket = g_socket_accept(this.raw, cancellable.raw)

  def bind(address : sn.gnome.gio.fluent.SocketAddress, allow_reuse : Boolean): Boolean = g_socket_bind(this.raw, address.raw, allow_reuse)

  def checkConnectResult(): Boolean = g_socket_check_connect_result(this.raw)

  def close(): Boolean = g_socket_close(this.raw)

  def conditionCheck(condition : Any /* Some(GLib.IOCondition): GIOCondition*/): Any /* Some(GLib.IOCondition): GIOCondition*/ = g_socket_condition_check(this.raw, condition)

  def conditionTimedWait(condition : Any /* Some(GLib.IOCondition): GIOCondition*/, timeout_us : Any /* Some(gint64): gint64*/, cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_socket_condition_timed_wait(this.raw, condition, timeout_us, cancellable.raw)

  def conditionWait(condition : Any /* Some(GLib.IOCondition): GIOCondition*/, cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_socket_condition_wait(this.raw, condition, cancellable.raw)

  def connect(address : sn.gnome.gio.fluent.SocketAddress, cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_socket_connect(this.raw, address.raw, cancellable.raw)

  def connectionFactoryCreateConnection(): sn.gnome.gio.fluent.SocketConnection = g_socket_connection_factory_create_connection(this.raw)

  def createSource(condition : Any /* Some(GLib.IOCondition): GIOCondition*/, cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(GLib.Source): GSource**/ = g_socket_create_source(this.raw, condition, cancellable.raw)

  def getAvailableBytes(): Any /* Some(gssize): gssize*/ = g_socket_get_available_bytes(this.raw)

  def getBlocking(): Boolean = g_socket_get_blocking(this.raw)

  def getBroadcast(): Boolean = g_socket_get_broadcast(this.raw)

  def getCredentials(): sn.gnome.gio.fluent.Credentials = g_socket_get_credentials(this.raw)

  def getFamily(): GSocketFamily = g_socket_get_family(this.raw)

  def getFd(): Int = g_socket_get_fd(this.raw)

  def getKeepalive(): Boolean = g_socket_get_keepalive(this.raw)

  def getListenBacklog(): Int = g_socket_get_listen_backlog(this.raw)

  def getLocalAddress(): sn.gnome.gio.fluent.SocketAddress = g_socket_get_local_address(this.raw)

  def getMulticastLoopback(): Boolean = g_socket_get_multicast_loopback(this.raw)

  def getMulticastTtl(): Any /* Some(guint): guint*/ = g_socket_get_multicast_ttl(this.raw)

  def getOption(level : Int, optname : Int, value : Any /* Some(gint): gint**/): Boolean = g_socket_get_option(this.raw, level, optname, value)

  def getProtocol(): GSocketProtocol = g_socket_get_protocol(this.raw)

  def getRemoteAddress(): sn.gnome.gio.fluent.SocketAddress = g_socket_get_remote_address(this.raw)

  def getSocketType(): GSocketType = g_socket_get_socket_type(this.raw)

  def getTimeout(): Any /* Some(guint): guint*/ = g_socket_get_timeout(this.raw)

  def getTtl(): Any /* Some(guint): guint*/ = g_socket_get_ttl(this.raw)

  def isClosed(): Boolean = g_socket_is_closed(this.raw)

  def isConnected(): Boolean = g_socket_is_connected(this.raw)

  def joinMulticastGroup(group : sn.gnome.gio.fluent.InetAddress, source_specific : Boolean, iface : String): Boolean = g_socket_join_multicast_group(this.raw, group.raw, source_specific, iface)

  def joinMulticastGroupSsm(group : sn.gnome.gio.fluent.InetAddress, source_specific : sn.gnome.gio.fluent.InetAddress, iface : String): Boolean = g_socket_join_multicast_group_ssm(this.raw, group.raw, source_specific.raw, iface)

  def leaveMulticastGroup(group : sn.gnome.gio.fluent.InetAddress, source_specific : Boolean, iface : String): Boolean = g_socket_leave_multicast_group(this.raw, group.raw, source_specific, iface)

  def leaveMulticastGroupSsm(group : sn.gnome.gio.fluent.InetAddress, source_specific : sn.gnome.gio.fluent.InetAddress, iface : String): Boolean = g_socket_leave_multicast_group_ssm(this.raw, group.raw, source_specific.raw, iface)

  def listen(): Boolean = g_socket_listen(this.raw)

  def receive(buffer : Array[Byte], size : Any /* Some(gsize): gsize*/, cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(gssize): gssize*/ = g_socket_receive(this.raw, buffer, size, cancellable.raw)

  def receiveFrom(address : sn.gnome.gio.fluent.SocketAddress, buffer : Array[Byte], size : Any /* Some(gsize): gsize*/, cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(gssize): gssize*/ = g_socket_receive_from(this.raw, address.raw, buffer, size, cancellable.raw)

  def receiveMessage(address : sn.gnome.gio.fluent.SocketAddress, vectors : Array[Byte], num_vectors : Int, messages : Array[Byte], num_messages : Any /* Some(gint): gint**/, flags : Any /* Some(gint): gint**/, cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(gssize): gssize*/ = g_socket_receive_message(this.raw, address.raw, vectors, num_vectors, messages, num_messages, flags, cancellable.raw)

  def receiveMessages(messages : Array[Byte], num_messages : Any /* Some(guint): guint*/, flags : Int, cancellable : sn.gnome.gio.fluent.Cancellable): Int = g_socket_receive_messages(this.raw, messages, num_messages, flags, cancellable.raw)

  def receiveWithBlocking(buffer : Array[Byte], size : Any /* Some(gsize): gsize*/, blocking : Boolean, cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(gssize): gssize*/ = g_socket_receive_with_blocking(this.raw, buffer, size, blocking, cancellable.raw)

  def send(buffer : Array[Byte], size : Any /* Some(gsize): gsize*/, cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(gssize): gssize*/ = g_socket_send(this.raw, buffer, size, cancellable.raw)

  def sendMessage(address : sn.gnome.gio.fluent.SocketAddress, vectors : Array[Byte], num_vectors : Int, messages : Array[Byte], num_messages : Int, flags : Int, cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(gssize): gssize*/ = g_socket_send_message(this.raw, address.raw, vectors, num_vectors, messages, num_messages, flags, cancellable.raw)

  def sendMessageWithTimeout(address : sn.gnome.gio.fluent.SocketAddress, vectors : Array[Byte], num_vectors : Int, messages : Array[Byte], num_messages : Int, flags : Int, timeout_us : Any /* Some(gint64): gint64*/, bytes_written : Any /* Some(gsize): gsize**/, cancellable : sn.gnome.gio.fluent.Cancellable): GPollableReturn = g_socket_send_message_with_timeout(this.raw, address.raw, vectors, num_vectors, messages, num_messages, flags, timeout_us, bytes_written, cancellable.raw)

  def sendMessages(messages : Array[Byte], num_messages : Any /* Some(guint): guint*/, flags : Int, cancellable : sn.gnome.gio.fluent.Cancellable): Int = g_socket_send_messages(this.raw, messages, num_messages, flags, cancellable.raw)

  def sendTo(address : sn.gnome.gio.fluent.SocketAddress, buffer : Array[Byte], size : Any /* Some(gsize): gsize*/, cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(gssize): gssize*/ = g_socket_send_to(this.raw, address.raw, buffer, size, cancellable.raw)

  def sendWithBlocking(buffer : Array[Byte], size : Any /* Some(gsize): gsize*/, blocking : Boolean, cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(gssize): gssize*/ = g_socket_send_with_blocking(this.raw, buffer, size, blocking, cancellable.raw)

  def setBlocking(blocking : Boolean): Unit = g_socket_set_blocking(this.raw, blocking)

  def setBroadcast(broadcast : Boolean): Unit = g_socket_set_broadcast(this.raw, broadcast)

  def setKeepalive(keepalive : Boolean): Unit = g_socket_set_keepalive(this.raw, keepalive)

  def setListenBacklog(backlog : Int): Unit = g_socket_set_listen_backlog(this.raw, backlog)

  def setMulticastLoopback(loopback : Boolean): Unit = g_socket_set_multicast_loopback(this.raw, loopback)

  def setMulticastTtl(ttl : Any /* Some(guint): guint*/): Unit = g_socket_set_multicast_ttl(this.raw, ttl)

  def setOption(level : Int, optname : Int, value : Int): Boolean = g_socket_set_option(this.raw, level, optname, value)

  def setTimeout(timeout : Any /* Some(guint): guint*/): Unit = g_socket_set_timeout(this.raw, timeout)

  def setTtl(ttl : Any /* Some(guint): guint*/): Unit = g_socket_set_ttl(this.raw, ttl)

  def shutdown(shutdown_read : Boolean, shutdown_write : Boolean): Boolean = g_socket_shutdown(this.raw, shutdown_read, shutdown_write)

  def speaksIpv4(): Boolean = g_socket_speaks_ipv4(this.raw)

end Socket

object Socket:
  def apply(family : GSocketFamily, `type` : GSocketType, protocol : GSocketProtocol): Socket = Socket(g_socket_new(family, `type`, protocol))

  def fromFd(fd : Int): Socket = Socket(g_socket_new_from_fd(fd))

end Socket
