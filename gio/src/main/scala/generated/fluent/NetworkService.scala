package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class NetworkService(private[fluent] val raw: Ptr[GNetworkService]) extends sn.gnome.gobject.fluent.Object, sn.gnome.gio.fluent.SocketConnectable:
  def getDomain(): String = g_network_service_get_domain(this.raw)

  def getProtocol(): String = g_network_service_get_protocol(this.raw)

  def getScheme(): String = g_network_service_get_scheme(this.raw)

  def getService(): String = g_network_service_get_service(this.raw)

  def setScheme(scheme : String): Unit = g_network_service_set_scheme(this.raw, scheme)

end NetworkService

object NetworkService:
  def apply(service : String, protocol : String, domain : String): NetworkService = NetworkService(g_network_service_new(service, protocol, domain))

end NetworkService
