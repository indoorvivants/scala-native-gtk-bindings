package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.InetAddress
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GResolver
import sn.gnome.gio.internal.GResolverNameLookupFlags
import sn.gnome.gio.internal.GResolverRecordType
import sn.gnome.glib.internal.GList
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object

class Resolver(raw: Ptr[GResolver]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getTimeout(): Any /* Some(guint): `unsigned` */ = g_resolver_get_timeout(
    this.raw.asInstanceOf
  )

  def lookupByAddress(address: InetAddress, cancellable: Cancellable)(using
      Zone
  ): String = fromCString(
    g_resolver_lookup_by_address(
      this.raw.asInstanceOf,
      address.getUnsafeRawPointer().asInstanceOf,
      cancellable.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  def lookupByAddressAsync(
      address: InetAddress,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_resolver_lookup_by_address_async(
    this.raw.asInstanceOf,
    address.getUnsafeRawPointer().asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def lookupByAddressFinish(result: AsyncResult)(using Zone): String =
    fromCString(
      g_resolver_lookup_by_address_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )

  def lookupByName(hostname: String | CString, cancellable: Cancellable)(using
      Zone
  ): Ptr[GList] = g_resolver_lookup_by_name(
    this.raw.asInstanceOf,
    __sn_extract_string(hostname).asInstanceOf[Ptr[gchar]],
    cancellable.getUnsafeRawPointer().asInstanceOf
  )

  def lookupByNameAsync(
      hostname: String | CString,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  )(using Zone): Unit = g_resolver_lookup_by_name_async(
    this.raw.asInstanceOf,
    __sn_extract_string(hostname).asInstanceOf[Ptr[gchar]],
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def lookupByNameFinish(result: AsyncResult): Ptr[GList] =
    g_resolver_lookup_by_name_finish(
      this.raw.asInstanceOf,
      result.getUnsafeRawPointer().asInstanceOf
    )

  def lookupByNameWithFlags(
      hostname: String | CString,
      flags: GResolverNameLookupFlags,
      cancellable: Cancellable
  )(using Zone): Ptr[GList] = g_resolver_lookup_by_name_with_flags(
    this.raw.asInstanceOf,
    __sn_extract_string(hostname).asInstanceOf[Ptr[gchar]],
    flags,
    cancellable.getUnsafeRawPointer().asInstanceOf
  )

  def lookupByNameWithFlagsAsync(
      hostname: String | CString,
      flags: GResolverNameLookupFlags,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  )(using Zone): Unit = g_resolver_lookup_by_name_with_flags_async(
    this.raw.asInstanceOf,
    __sn_extract_string(hostname).asInstanceOf[Ptr[gchar]],
    flags,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def lookupByNameWithFlagsFinish(result: AsyncResult): Ptr[GList] =
    g_resolver_lookup_by_name_with_flags_finish(
      this.raw.asInstanceOf,
      result.getUnsafeRawPointer().asInstanceOf
    )

  def lookupRecords(
      rrname: String | CString,
      record_type: GResolverRecordType,
      cancellable: Cancellable
  )(using Zone): Ptr[GList] = g_resolver_lookup_records(
    this.raw.asInstanceOf,
    __sn_extract_string(rrname).asInstanceOf[Ptr[gchar]],
    record_type,
    cancellable.getUnsafeRawPointer().asInstanceOf
  )

  def lookupRecordsAsync(
      rrname: String | CString,
      record_type: GResolverRecordType,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  )(using Zone): Unit = g_resolver_lookup_records_async(
    this.raw.asInstanceOf,
    __sn_extract_string(rrname).asInstanceOf[Ptr[gchar]],
    record_type,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def lookupRecordsFinish(result: AsyncResult): Ptr[GList] =
    g_resolver_lookup_records_finish(
      this.raw.asInstanceOf,
      result.getUnsafeRawPointer().asInstanceOf
    )

  def lookupService(
      service: String | CString,
      protocol: String | CString,
      domain: String | CString,
      cancellable: Cancellable
  )(using Zone): Ptr[GList] = g_resolver_lookup_service(
    this.raw.asInstanceOf,
    __sn_extract_string(service).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(protocol).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(domain).asInstanceOf[Ptr[gchar]],
    cancellable.getUnsafeRawPointer().asInstanceOf
  )

  def lookupServiceAsync(
      service: String | CString,
      protocol: String | CString,
      domain: String | CString,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  )(using Zone): Unit = g_resolver_lookup_service_async(
    this.raw.asInstanceOf,
    __sn_extract_string(service).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(protocol).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(domain).asInstanceOf[Ptr[gchar]],
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def lookupServiceFinish(result: AsyncResult): Ptr[GList] =
    g_resolver_lookup_service_finish(
      this.raw.asInstanceOf,
      result.getUnsafeRawPointer().asInstanceOf
    )

  def setDefault(): Unit = g_resolver_set_default(this.raw.asInstanceOf)

  def setTimeout(timeout_ms: Any /* Some(guint): `unsigned` */ ): Unit =
    g_resolver_set_timeout(this.raw.asInstanceOf, timeout_ms)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Resolver
