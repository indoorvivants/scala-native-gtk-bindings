package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class TlsConnection(private[fluent] val raw: Ptr[GTlsConnection]) extends IOStream:
  def emitAcceptCertificate(peer_cert : sn.gnome.gio.fluent.TlsCertificate, errors : Any /* Some(TlsCertificateFlags): GTlsCertificateFlags*/): Boolean = g_tls_connection_emit_accept_certificate(this.raw, peer_cert.raw, errors)

  def getCertificate(): sn.gnome.gio.fluent.TlsCertificate = g_tls_connection_get_certificate(this.raw)

  def getChannelBindingData(`type` : GTlsChannelBindingType, data : Array[Byte]): Boolean = g_tls_connection_get_channel_binding_data(this.raw, `type`, data)

  def getCiphersuiteName(): Any /* Some(utf8): gchar**/ = g_tls_connection_get_ciphersuite_name(this.raw)

  def getDatabase(): sn.gnome.gio.fluent.TlsDatabase = g_tls_connection_get_database(this.raw)

  def getInteraction(): sn.gnome.gio.fluent.TlsInteraction = g_tls_connection_get_interaction(this.raw)

  def getNegotiatedProtocol(): String = g_tls_connection_get_negotiated_protocol(this.raw)

  def getPeerCertificate(): sn.gnome.gio.fluent.TlsCertificate = g_tls_connection_get_peer_certificate(this.raw)

  def getPeerCertificateErrors(): Any /* Some(TlsCertificateFlags): GTlsCertificateFlags*/ = g_tls_connection_get_peer_certificate_errors(this.raw)

  def getProtocolVersion(): GTlsProtocolVersion = g_tls_connection_get_protocol_version(this.raw)

  def getRehandshakeMode(): GTlsRehandshakeMode = g_tls_connection_get_rehandshake_mode(this.raw)

  def getRequireCloseNotify(): Boolean = g_tls_connection_get_require_close_notify(this.raw)

  def getUseSystemCertdb(): Boolean = g_tls_connection_get_use_system_certdb(this.raw)

  def handshake(cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_tls_connection_handshake(this.raw, cancellable.raw)

  def handshakeAsync(io_priority : Int, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_tls_connection_handshake_async(this.raw, io_priority, cancellable.raw, callback, user_data)

  def handshakeFinish(result : sn.gnome.gio.fluent.AsyncResult): Boolean = g_tls_connection_handshake_finish(this.raw, result.raw)

  def setAdvertisedProtocols(protocols : Array[Byte]): Unit = g_tls_connection_set_advertised_protocols(this.raw, protocols)

  def setCertificate(certificate : sn.gnome.gio.fluent.TlsCertificate): Unit = g_tls_connection_set_certificate(this.raw, certificate.raw)

  def setDatabase(database : sn.gnome.gio.fluent.TlsDatabase): Unit = g_tls_connection_set_database(this.raw, database.raw)

  def setInteraction(interaction : sn.gnome.gio.fluent.TlsInteraction): Unit = g_tls_connection_set_interaction(this.raw, interaction.raw)

  def setRehandshakeMode(mode : GTlsRehandshakeMode): Unit = g_tls_connection_set_rehandshake_mode(this.raw, mode)

  def setRequireCloseNotify(require_close_notify : Boolean): Unit = g_tls_connection_set_require_close_notify(this.raw, require_close_notify)

  def setUseSystemCertdb(use_system_certdb : Boolean): Unit = g_tls_connection_set_use_system_certdb(this.raw, use_system_certdb)

end TlsConnection

