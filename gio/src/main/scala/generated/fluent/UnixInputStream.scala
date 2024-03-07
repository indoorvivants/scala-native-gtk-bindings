package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.FileDescriptorBased
import sn.gnome.gio.fluent.InputStream
import sn.gnome.gio.fluent.PollableInputStream
import sn.gnome.gio.internal.GUnixInputStream
import sn.gnome.glib.internal.gint

class UnixInputStream(raw: Ptr[GUnixInputStream])
    extends InputStream(raw.asInstanceOf),
      FileDescriptorBased,
      PollableInputStream:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getCloseFd(): Boolean =
    g_unix_input_stream_get_close_fd(this.raw.asInstanceOf).value.!=(0)

  def getFd(): Int = g_unix_input_stream_get_fd(this.raw.asInstanceOf).value

  def setCloseFd(close_fd: Boolean): Unit =
    g_unix_input_stream_set_close_fd(this.raw.asInstanceOf, close_fd)

end UnixInputStream

object UnixInputStream:
  def apply(fd: Int, close_fd: Boolean): UnixInputStream = new UnixInputStream(
    g_unix_input_stream_new(gint(fd), close_fd).asInstanceOf
  )
end UnixInputStream
