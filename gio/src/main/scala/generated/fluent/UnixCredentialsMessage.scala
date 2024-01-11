package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class UnixCredentialsMessage(private[fluent] val raw: Ptr[GUnixCredentialsMessage]) extends SocketControlMessage:
  def getCredentials(): sn.gnome.gio.fluent.Credentials = g_unix_credentials_message_get_credentials(this.raw)

end UnixCredentialsMessage

object UnixCredentialsMessage:
  def apply(): UnixCredentialsMessage = UnixCredentialsMessage(g_unix_credentials_message_new())

  def withCredentials(credentials : sn.gnome.gio.fluent.Credentials): UnixCredentialsMessage = UnixCredentialsMessage(g_unix_credentials_message_new_with_credentials(credentials.raw))

end UnixCredentialsMessage
