package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class UnixFDList(private[fluent] val raw: Ptr[GUnixFDList]) extends GObject.Object:
  def append(fd : Int): Int = g_unix_fd_list_append(this.raw, fd)

  def get(`index_` : Int): Int = g_unix_fd_list_get(this.raw, `index_`)

  def getLength(): Int = g_unix_fd_list_get_length(this.raw)

  def peekFds(length : Any /* Some(gint): gint**/): Array[Byte] = g_unix_fd_list_peek_fds(this.raw, length)

  def stealFds(length : Any /* Some(gint): gint**/): Array[Byte] = g_unix_fd_list_steal_fds(this.raw, length)

end UnixFDList

object UnixFDList:
  def apply(): UnixFDList = UnixFDList(g_unix_fd_list_new())

  def fromArray(fds : Array[Byte], n_fds : Int): UnixFDList = UnixFDList(g_unix_fd_list_new_from_array(fds, n_fds))

end UnixFDList
