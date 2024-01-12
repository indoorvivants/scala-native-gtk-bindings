package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class UnixInputStream(private[fluent] val raw: Ptr[GUnixInputStream]) extends sn.gnome.gio.fluent.InputStream, sn.gnome.gio.fluent.FileDescriptorBased, sn.gnome.gio.fluent.PollableInputStream:
  def getCloseFd(): Boolean = g_unix_input_stream_get_close_fd(this.raw)

  def getFd(): Int = g_unix_input_stream_get_fd(this.raw)

  def setCloseFd(close_fd : Boolean): Unit = g_unix_input_stream_set_close_fd(this.raw, close_fd)

end UnixInputStream

object UnixInputStream:
  def apply(fd : Int, close_fd : Boolean): UnixInputStream = UnixInputStream(g_unix_input_stream_new(fd, close_fd))

end UnixInputStream
