package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class TlsInteraction(private[fluent] val raw: Ptr[GTlsInteraction]) extends sn.gnome.gobject.fluent.Object:
  def askPassword(password : sn.gnome.gio.fluent.TlsPassword, cancellable : sn.gnome.gio.fluent.Cancellable): GTlsInteractionResult = g_tls_interaction_ask_password(this.raw, password.raw, cancellable.raw)

  def askPasswordAsync(password : sn.gnome.gio.fluent.TlsPassword, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_tls_interaction_ask_password_async(this.raw, password.raw, cancellable.raw, callback, user_data)

  def askPasswordFinish(result : sn.gnome.gio.fluent.AsyncResult): GTlsInteractionResult = g_tls_interaction_ask_password_finish(this.raw, result.raw)

  def invokeAskPassword(password : sn.gnome.gio.fluent.TlsPassword, cancellable : sn.gnome.gio.fluent.Cancellable): GTlsInteractionResult = g_tls_interaction_invoke_ask_password(this.raw, password.raw, cancellable.raw)

  def invokeRequestCertificate(connection : sn.gnome.gio.fluent.TlsConnection, flags : GTlsCertificateRequestFlags, cancellable : sn.gnome.gio.fluent.Cancellable): GTlsInteractionResult = g_tls_interaction_invoke_request_certificate(this.raw, connection.raw, flags, cancellable.raw)

  def requestCertificate(connection : sn.gnome.gio.fluent.TlsConnection, flags : GTlsCertificateRequestFlags, cancellable : sn.gnome.gio.fluent.Cancellable): GTlsInteractionResult = g_tls_interaction_request_certificate(this.raw, connection.raw, flags, cancellable.raw)

  def requestCertificateAsync(connection : sn.gnome.gio.fluent.TlsConnection, flags : GTlsCertificateRequestFlags, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_tls_interaction_request_certificate_async(this.raw, connection.raw, flags, cancellable.raw, callback, user_data)

  def requestCertificateFinish(result : sn.gnome.gio.fluent.AsyncResult): GTlsInteractionResult = g_tls_interaction_request_certificate_finish(this.raw, result.raw)

end TlsInteraction

