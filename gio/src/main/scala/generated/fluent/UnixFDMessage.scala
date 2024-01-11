package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class UnixFDMessage(private[fluent] val raw: Ptr[GUnixFDMessage]) extends SocketControlMessage:
  def appendFd(fd : Int): Boolean = g_unix_fd_message_append_fd(this.raw, fd)

  def getFdList(): sn.gnome.gio.fluent.UnixFDList = g_unix_fd_message_get_fd_list(this.raw)

  def stealFds(length : Any /* Some(gint): gint**/): Array[Byte] = g_unix_fd_message_steal_fds(this.raw, length)

end UnixFDMessage

object UnixFDMessage:
  def apply(): UnixFDMessage = UnixFDMessage(g_unix_fd_message_new())

  def withFdList(fd_list : sn.gnome.gio.fluent.UnixFDList): UnixFDMessage = UnixFDMessage(g_unix_fd_message_new_with_fd_list(fd_list.raw))

end UnixFDMessage
