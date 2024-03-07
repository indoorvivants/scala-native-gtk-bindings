package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.SocketControlMessage
import sn.gnome.gio.fluent.UnixFDList
import sn.gnome.gio.internal.GUnixFDMessage
import sn.gnome.glib.internal.gint

class UnixFDMessage(raw: Ptr[GUnixFDMessage])
    extends SocketControlMessage(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def appendFd(fd: Int): Boolean =
    g_unix_fd_message_append_fd(this.raw.asInstanceOf, gint(fd)).value.!=(0)

  def getFdList(): UnixFDList = new UnixFDList(
    g_unix_fd_message_get_fd_list(this.raw.asInstanceOf).asInstanceOf
  )

  def stealFds(length: Any /* Some(gint): `gint*` */ ): Ptr[Int] =
    g_unix_fd_message_steal_fds(this.raw.asInstanceOf, length)

end UnixFDMessage

object UnixFDMessage:
  def apply(): UnixFDMessage = new UnixFDMessage(
    g_unix_fd_message_new().asInstanceOf
  )
  def withFdList(fd_list: UnixFDList): UnixFDMessage = new UnixFDMessage(
    g_unix_fd_message_new_with_fd_list(
      fd_list.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end UnixFDMessage
