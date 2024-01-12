package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class Credentials(private[fluent] val raw: Ptr[GCredentials]) extends sn.gnome.gobject.fluent.Object:
  def getNative(native_type : GCredentialsType): Ptr[Byte] = g_credentials_get_native(this.raw, native_type)

  def getUnixPid(): Any /* Some(gint): pid_t*/ = g_credentials_get_unix_pid(this.raw)

  def getUnixUser(): Any /* Some(guint): uid_t*/ = g_credentials_get_unix_user(this.raw)

  def isSameUser(other_credentials : sn.gnome.gio.fluent.Credentials): Boolean = g_credentials_is_same_user(this.raw, other_credentials.raw)

  def setNative(native_type : GCredentialsType, native : Ptr[Byte]): Unit = g_credentials_set_native(this.raw, native_type, native)

  def setUnixUser(uid : Any /* Some(guint): uid_t*/): Boolean = g_credentials_set_unix_user(this.raw, uid)

  def toString(): Any /* Some(utf8): gchar**/ = g_credentials_to_string(this.raw)

end Credentials

object Credentials:
  def apply(): Credentials = Credentials(g_credentials_new())

end Credentials
