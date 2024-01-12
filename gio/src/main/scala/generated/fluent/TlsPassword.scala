package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class TlsPassword(private[fluent] val raw: Ptr[GTlsPassword]) extends sn.gnome.gobject.fluent.Object:
  def getDescription(): String = g_tls_password_get_description(this.raw)

  def getFlags(): Any /* Some(TlsPasswordFlags): GTlsPasswordFlags*/ = g_tls_password_get_flags(this.raw)

  def getValue(length : Any /* Some(gsize): gsize**/): Array[Byte] = g_tls_password_get_value(this.raw, length)

  def getWarning(): String = g_tls_password_get_warning(this.raw)

  def setDescription(description : String): Unit = g_tls_password_set_description(this.raw, description)

  def setFlags(flags : Any /* Some(TlsPasswordFlags): GTlsPasswordFlags*/): Unit = g_tls_password_set_flags(this.raw, flags)

  def setValue(value : Array[Byte], length : Any /* Some(gssize): gssize*/): Unit = g_tls_password_set_value(this.raw, value, length)

  def setValueFull(value : Array[Byte], length : Any /* Some(gssize): gssize*/, destroy : Any /* Some(GLib.DestroyNotify): GDestroyNotify*/): Unit = g_tls_password_set_value_full(this.raw, value, length, destroy)

  def setWarning(warning : String): Unit = g_tls_password_set_warning(this.raw, warning)

end TlsPassword

object TlsPassword:
  def apply(flags : Any /* Some(TlsPasswordFlags): GTlsPasswordFlags*/, description : String): TlsPassword = TlsPassword(g_tls_password_new(flags, description))

end TlsPassword
