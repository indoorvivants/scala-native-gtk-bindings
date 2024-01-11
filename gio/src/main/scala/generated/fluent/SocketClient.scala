package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class SocketClient(private[fluent] val raw: Ptr[GSocketClient]) extends GObject.Object:
  def addApplicationProxy(protocol : String): Unit = g_socket_client_add_application_proxy(this.raw, protocol)

  def connect(connectable : sn.gnome.gio.fluent.SocketConnectable, cancellable : sn.gnome.gio.fluent.Cancellable): sn.gnome.gio.fluent.SocketConnection = g_socket_client_connect(this.raw, connectable.raw, cancellable.raw)

  def connectAsync(connectable : sn.gnome.gio.fluent.SocketConnectable, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_socket_client_connect_async(this.raw, connectable.raw, cancellable.raw, callback, user_data)

  def connectFinish(result : sn.gnome.gio.fluent.AsyncResult): sn.gnome.gio.fluent.SocketConnection = g_socket_client_connect_finish(this.raw, result.raw)

  def connectToHost(host_and_port : String, default_port : UShort, cancellable : sn.gnome.gio.fluent.Cancellable): sn.gnome.gio.fluent.SocketConnection = g_socket_client_connect_to_host(this.raw, host_and_port, default_port, cancellable.raw)

  def connectToHostAsync(host_and_port : String, default_port : UShort, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_socket_client_connect_to_host_async(this.raw, host_and_port, default_port, cancellable.raw, callback, user_data)

  def connectToHostFinish(result : sn.gnome.gio.fluent.AsyncResult): sn.gnome.gio.fluent.SocketConnection = g_socket_client_connect_to_host_finish(this.raw, result.raw)

  def connectToService(domain : String, service : String, cancellable : sn.gnome.gio.fluent.Cancellable): sn.gnome.gio.fluent.SocketConnection = g_socket_client_connect_to_service(this.raw, domain, service, cancellable.raw)

  def connectToServiceAsync(domain : String, service : String, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_socket_client_connect_to_service_async(this.raw, domain, service, cancellable.raw, callback, user_data)

  def connectToServiceFinish(result : sn.gnome.gio.fluent.AsyncResult): sn.gnome.gio.fluent.SocketConnection = g_socket_client_connect_to_service_finish(this.raw, result.raw)

  def connectToUri(uri : String, default_port : UShort, cancellable : sn.gnome.gio.fluent.Cancellable): sn.gnome.gio.fluent.SocketConnection = g_socket_client_connect_to_uri(this.raw, uri, default_port, cancellable.raw)

  def connectToUriAsync(uri : String, default_port : UShort, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_socket_client_connect_to_uri_async(this.raw, uri, default_port, cancellable.raw, callback, user_data)

  def connectToUriFinish(result : sn.gnome.gio.fluent.AsyncResult): sn.gnome.gio.fluent.SocketConnection = g_socket_client_connect_to_uri_finish(this.raw, result.raw)

  def getEnableProxy(): Boolean = g_socket_client_get_enable_proxy(this.raw)

  def getFamily(): GSocketFamily = g_socket_client_get_family(this.raw)

  def getLocalAddress(): sn.gnome.gio.fluent.SocketAddress = g_socket_client_get_local_address(this.raw)

  def getProtocol(): GSocketProtocol = g_socket_client_get_protocol(this.raw)

  def getProxyResolver(): sn.gnome.gio.fluent.ProxyResolver = g_socket_client_get_proxy_resolver(this.raw)

  def getSocketType(): GSocketType = g_socket_client_get_socket_type(this.raw)

  def getTimeout(): Any /* Some(guint): guint*/ = g_socket_client_get_timeout(this.raw)

  def getTls(): Boolean = g_socket_client_get_tls(this.raw)

  def getTlsValidationFlags(): Any /* Some(TlsCertificateFlags): GTlsCertificateFlags*/ = g_socket_client_get_tls_validation_flags(this.raw)

  def setEnableProxy(enable : Boolean): Unit = g_socket_client_set_enable_proxy(this.raw, enable)

  def setFamily(family : GSocketFamily): Unit = g_socket_client_set_family(this.raw, family)

  def setLocalAddress(address : sn.gnome.gio.fluent.SocketAddress): Unit = g_socket_client_set_local_address(this.raw, address.raw)

  def setProtocol(protocol : GSocketProtocol): Unit = g_socket_client_set_protocol(this.raw, protocol)

  def setProxyResolver(proxy_resolver : sn.gnome.gio.fluent.ProxyResolver): Unit = g_socket_client_set_proxy_resolver(this.raw, proxy_resolver.raw)

  def setSocketType(`type` : GSocketType): Unit = g_socket_client_set_socket_type(this.raw, `type`)

  def setTimeout(timeout : Any /* Some(guint): guint*/): Unit = g_socket_client_set_timeout(this.raw, timeout)

  def setTls(tls : Boolean): Unit = g_socket_client_set_tls(this.raw, tls)

  def setTlsValidationFlags(flags : Any /* Some(TlsCertificateFlags): GTlsCertificateFlags*/): Unit = g_socket_client_set_tls_validation_flags(this.raw, flags)

end SocketClient

object SocketClient:
  def apply(): SocketClient = SocketClient(g_socket_client_new())

end SocketClient
