package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class UnixOutputStream(private[fluent] val raw: Ptr[GUnixOutputStream]) extends OutputStream, FileDescriptorBased, PollableOutputStream:
  def getCloseFd(): Boolean = g_unix_output_stream_get_close_fd(this.raw)

  def getFd(): Int = g_unix_output_stream_get_fd(this.raw)

  def setCloseFd(close_fd : Boolean): Unit = g_unix_output_stream_set_close_fd(this.raw, close_fd)

end UnixOutputStream

object UnixOutputStream:
  def apply(fd : Int, close_fd : Boolean): UnixOutputStream = UnixOutputStream(g_unix_output_stream_new(fd, close_fd))

end UnixOutputStream
