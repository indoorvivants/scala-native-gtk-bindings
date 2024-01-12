package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class TlsCertificate(private[fluent] val raw: Ptr[GTlsCertificate]) extends sn.gnome.gobject.fluent.Object:
  def getDnsNames(): Array[Byte] = g_tls_certificate_get_dns_names(this.raw)

  def getIpAddresses(): Array[Byte] = g_tls_certificate_get_ip_addresses(this.raw)

  def getIssuer(): sn.gnome.gio.fluent.TlsCertificate = g_tls_certificate_get_issuer(this.raw)

  def getIssuerName(): Any /* Some(utf8): gchar**/ = g_tls_certificate_get_issuer_name(this.raw)

  def getNotValidAfter(): Any /* Some(GLib.DateTime): GDateTime**/ = g_tls_certificate_get_not_valid_after(this.raw)

  def getNotValidBefore(): Any /* Some(GLib.DateTime): GDateTime**/ = g_tls_certificate_get_not_valid_before(this.raw)

  def getSubjectName(): Any /* Some(utf8): gchar**/ = g_tls_certificate_get_subject_name(this.raw)

  def isSame(cert_two : sn.gnome.gio.fluent.TlsCertificate): Boolean = g_tls_certificate_is_same(this.raw, cert_two.raw)

  def verify(identity : sn.gnome.gio.fluent.SocketConnectable, trusted_ca : sn.gnome.gio.fluent.TlsCertificate): Any /* Some(TlsCertificateFlags): GTlsCertificateFlags*/ = g_tls_certificate_verify(this.raw, identity.raw, trusted_ca.raw)

end TlsCertificate

object TlsCertificate:
  def fromFile(file : Any /* Some(filename): const gchar**/): TlsCertificate = TlsCertificate(g_tls_certificate_new_from_file(file))

  def fromFileWithPassword(file : Any /* Some(filename): const gchar**/, password : String): TlsCertificate = TlsCertificate(g_tls_certificate_new_from_file_with_password(file, password))

  def fromFiles(cert_file : Any /* Some(filename): const gchar**/, key_file : Any /* Some(filename): const gchar**/): TlsCertificate = TlsCertificate(g_tls_certificate_new_from_files(cert_file, key_file))

  def fromPem(data : String, length : Any /* Some(gssize): gssize*/): TlsCertificate = TlsCertificate(g_tls_certificate_new_from_pem(data, length))

  def fromPkcs11Uris(pkcs11_uri : String, private_key_pkcs11_uri : String): TlsCertificate = TlsCertificate(g_tls_certificate_new_from_pkcs11_uris(pkcs11_uri, private_key_pkcs11_uri))

  def fromPkcs12(data : Array[Byte], length : Any /* Some(gsize): gsize*/, password : String): TlsCertificate = TlsCertificate(g_tls_certificate_new_from_pkcs12(data, length, password))

end TlsCertificate
