package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.internal.GTlsPassword
import sn.gnome.gio.internal.GTlsPasswordFlags
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gsize
import sn.gnome.glib.internal.gssize
import sn.gnome.glib.internal.guchar
import sn.gnome.gobject.fluent.Object

class TlsPassword(raw: Ptr[GTlsPassword]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getDescription()(using Zone): String = fromCString(
    g_tls_password_get_description(this.raw.asInstanceOf).asInstanceOf
  )

  def getFlags(): GTlsPasswordFlags = g_tls_password_get_flags(
    this.raw.asInstanceOf
  )

  def getValue(length: Ptr[ULong]): Ptr[UByte] = g_tls_password_get_value(
    this.raw.asInstanceOf,
    length.asInstanceOf[Ptr[gsize]]
  )

  def getWarning()(using Zone): String = fromCString(
    g_tls_password_get_warning(this.raw.asInstanceOf).asInstanceOf
  )

  def setDescription(description: String | CString)(using Zone): Unit =
    g_tls_password_set_description(
      this.raw.asInstanceOf,
      __sn_extract_string(description).asInstanceOf[Ptr[gchar]]
    )

  def setFlags(flags: GTlsPasswordFlags): Unit =
    g_tls_password_set_flags(this.raw.asInstanceOf, flags)

  def setValue(value: Ptr[UByte], length: ULong): Unit =
    g_tls_password_set_value(this.raw.asInstanceOf, value, gssize(length))

  def setValueFull(
      value: Ptr[UByte],
      length: ULong,
      destroy: GDestroyNotify
  ): Unit = g_tls_password_set_value_full(
    this.raw.asInstanceOf,
    value,
    gssize(length),
    destroy
  )

  def setWarning(warning: String | CString)(using Zone): Unit =
    g_tls_password_set_warning(
      this.raw.asInstanceOf,
      __sn_extract_string(warning).asInstanceOf[Ptr[gchar]]
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end TlsPassword

object TlsPassword:
  def apply(flags: GTlsPasswordFlags, description: String | CString)(using
      Zone
  ): TlsPassword = new TlsPassword(
    g_tls_password_new(
      flags,
      __sn_extract_string(description).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end TlsPassword
