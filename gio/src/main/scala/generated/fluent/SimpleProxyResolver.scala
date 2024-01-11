package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class SimpleProxyResolver(private[fluent] val raw: Ptr[GSimpleProxyResolver]) extends GObject.Object, ProxyResolver:
  def setDefaultProxy(default_proxy : String): Unit = g_simple_proxy_resolver_set_default_proxy(this.raw, default_proxy)

  def setIgnoreHosts(ignore_hosts : Array[Byte]): Unit = g_simple_proxy_resolver_set_ignore_hosts(this.raw, ignore_hosts)

  def setUriProxy(uri_scheme : String, proxy : String): Unit = g_simple_proxy_resolver_set_uri_proxy(this.raw, uri_scheme, proxy)

end SimpleProxyResolver

