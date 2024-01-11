package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class Resolver(private[fluent] val raw: Ptr[GResolver]) extends GObject.Object:
  def getTimeout(): Any /* Some(guint): unsigned*/ = g_resolver_get_timeout(this.raw)

  def lookupByAddress(address : sn.gnome.gio.fluent.InetAddress, cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(utf8): gchar**/ = g_resolver_lookup_by_address(this.raw, address.raw, cancellable.raw)

  def lookupByAddressAsync(address : sn.gnome.gio.fluent.InetAddress, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_resolver_lookup_by_address_async(this.raw, address.raw, cancellable.raw, callback, user_data)

  def lookupByAddressFinish(result : sn.gnome.gio.fluent.AsyncResult): Any /* Some(utf8): gchar**/ = g_resolver_lookup_by_address_finish(this.raw, result.raw)

  def lookupByName(hostname : String, cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(GLib.List): GList**/ = g_resolver_lookup_by_name(this.raw, hostname, cancellable.raw)

  def lookupByNameAsync(hostname : String, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_resolver_lookup_by_name_async(this.raw, hostname, cancellable.raw, callback, user_data)

  def lookupByNameFinish(result : sn.gnome.gio.fluent.AsyncResult): Any /* Some(GLib.List): GList**/ = g_resolver_lookup_by_name_finish(this.raw, result.raw)

  def lookupByNameWithFlags(hostname : String, flags : Any /* Some(ResolverNameLookupFlags): GResolverNameLookupFlags*/, cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(GLib.List): GList**/ = g_resolver_lookup_by_name_with_flags(this.raw, hostname, flags, cancellable.raw)

  def lookupByNameWithFlagsAsync(hostname : String, flags : Any /* Some(ResolverNameLookupFlags): GResolverNameLookupFlags*/, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_resolver_lookup_by_name_with_flags_async(this.raw, hostname, flags, cancellable.raw, callback, user_data)

  def lookupByNameWithFlagsFinish(result : sn.gnome.gio.fluent.AsyncResult): Any /* Some(GLib.List): GList**/ = g_resolver_lookup_by_name_with_flags_finish(this.raw, result.raw)

  def lookupRecords(rrname : String, record_type : GResolverRecordType, cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(GLib.List): GList**/ = g_resolver_lookup_records(this.raw, rrname, record_type, cancellable.raw)

  def lookupRecordsAsync(rrname : String, record_type : GResolverRecordType, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_resolver_lookup_records_async(this.raw, rrname, record_type, cancellable.raw, callback, user_data)

  def lookupRecordsFinish(result : sn.gnome.gio.fluent.AsyncResult): Any /* Some(GLib.List): GList**/ = g_resolver_lookup_records_finish(this.raw, result.raw)

  def lookupService(service : String, protocol : String, domain : String, cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(GLib.List): GList**/ = g_resolver_lookup_service(this.raw, service, protocol, domain, cancellable.raw)

  def lookupServiceAsync(service : String, protocol : String, domain : String, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_resolver_lookup_service_async(this.raw, service, protocol, domain, cancellable.raw, callback, user_data)

  def lookupServiceFinish(result : sn.gnome.gio.fluent.AsyncResult): Any /* Some(GLib.List): GList**/ = g_resolver_lookup_service_finish(this.raw, result.raw)

  def setDefault(): Unit = g_resolver_set_default(this.raw)

  def setTimeout(timeout_ms : Any /* Some(guint): unsigned*/): Unit = g_resolver_set_timeout(this.raw, timeout_ms)

end Resolver

