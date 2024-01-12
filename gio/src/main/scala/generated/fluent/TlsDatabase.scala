package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class TlsDatabase(private[fluent] val raw: Ptr[GTlsDatabase]) extends sn.gnome.gobject.fluent.Object:
  def createCertificateHandle(certificate : sn.gnome.gio.fluent.TlsCertificate): Any /* Some(utf8): gchar**/ = g_tls_database_create_certificate_handle(this.raw, certificate.raw)

  def lookupCertificateForHandle(handle : String, interaction : sn.gnome.gio.fluent.TlsInteraction, flags : GTlsDatabaseLookupFlags, cancellable : sn.gnome.gio.fluent.Cancellable): sn.gnome.gio.fluent.TlsCertificate = g_tls_database_lookup_certificate_for_handle(this.raw, handle, interaction.raw, flags, cancellable.raw)

  def lookupCertificateForHandleAsync(handle : String, interaction : sn.gnome.gio.fluent.TlsInteraction, flags : GTlsDatabaseLookupFlags, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_tls_database_lookup_certificate_for_handle_async(this.raw, handle, interaction.raw, flags, cancellable.raw, callback, user_data)

  def lookupCertificateForHandleFinish(result : sn.gnome.gio.fluent.AsyncResult): sn.gnome.gio.fluent.TlsCertificate = g_tls_database_lookup_certificate_for_handle_finish(this.raw, result.raw)

  def lookupCertificateIssuer(certificate : sn.gnome.gio.fluent.TlsCertificate, interaction : sn.gnome.gio.fluent.TlsInteraction, flags : GTlsDatabaseLookupFlags, cancellable : sn.gnome.gio.fluent.Cancellable): sn.gnome.gio.fluent.TlsCertificate = g_tls_database_lookup_certificate_issuer(this.raw, certificate.raw, interaction.raw, flags, cancellable.raw)

  def lookupCertificateIssuerAsync(certificate : sn.gnome.gio.fluent.TlsCertificate, interaction : sn.gnome.gio.fluent.TlsInteraction, flags : GTlsDatabaseLookupFlags, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_tls_database_lookup_certificate_issuer_async(this.raw, certificate.raw, interaction.raw, flags, cancellable.raw, callback, user_data)

  def lookupCertificateIssuerFinish(result : sn.gnome.gio.fluent.AsyncResult): sn.gnome.gio.fluent.TlsCertificate = g_tls_database_lookup_certificate_issuer_finish(this.raw, result.raw)

  def lookupCertificatesIssuedBy(issuer_raw_dn : Array[Byte], interaction : sn.gnome.gio.fluent.TlsInteraction, flags : GTlsDatabaseLookupFlags, cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(GLib.List): GList**/ = g_tls_database_lookup_certificates_issued_by(this.raw, issuer_raw_dn, interaction.raw, flags, cancellable.raw)

  def lookupCertificatesIssuedByAsync(issuer_raw_dn : Array[Byte], interaction : sn.gnome.gio.fluent.TlsInteraction, flags : GTlsDatabaseLookupFlags, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_tls_database_lookup_certificates_issued_by_async(this.raw, issuer_raw_dn, interaction.raw, flags, cancellable.raw, callback, user_data)

  def lookupCertificatesIssuedByFinish(result : sn.gnome.gio.fluent.AsyncResult): Any /* Some(GLib.List): GList**/ = g_tls_database_lookup_certificates_issued_by_finish(this.raw, result.raw)

  def verifyChain(chain : sn.gnome.gio.fluent.TlsCertificate, purpose : String, identity : sn.gnome.gio.fluent.SocketConnectable, interaction : sn.gnome.gio.fluent.TlsInteraction, flags : Any /* Some(TlsDatabaseVerifyFlags): GTlsDatabaseVerifyFlags*/, cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(TlsCertificateFlags): GTlsCertificateFlags*/ = g_tls_database_verify_chain(this.raw, chain.raw, purpose, identity.raw, interaction.raw, flags, cancellable.raw)

  def verifyChainAsync(chain : sn.gnome.gio.fluent.TlsCertificate, purpose : String, identity : sn.gnome.gio.fluent.SocketConnectable, interaction : sn.gnome.gio.fluent.TlsInteraction, flags : Any /* Some(TlsDatabaseVerifyFlags): GTlsDatabaseVerifyFlags*/, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_tls_database_verify_chain_async(this.raw, chain.raw, purpose, identity.raw, interaction.raw, flags, cancellable.raw, callback, user_data)

  def verifyChainFinish(result : sn.gnome.gio.fluent.AsyncResult): Any /* Some(TlsCertificateFlags): GTlsCertificateFlags*/ = g_tls_database_verify_chain_finish(this.raw, result.raw)

end TlsDatabase

