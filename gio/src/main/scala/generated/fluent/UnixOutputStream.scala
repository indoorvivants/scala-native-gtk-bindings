package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.FileDescriptorBased
import sn.gnome.gio.fluent.OutputStream
import sn.gnome.gio.fluent.PollableOutputStream
import sn.gnome.gio.internal.GUnixOutputStream
import sn.gnome.glib.internal.gint

class UnixOutputStream(raw: Ptr[GUnixOutputStream])
    extends OutputStream(raw.asInstanceOf),
      FileDescriptorBased,
      PollableOutputStream:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getCloseFd(): Boolean =
    g_unix_output_stream_get_close_fd(this.raw.asInstanceOf).value.!=(0)

  def getFd(): Int = g_unix_output_stream_get_fd(this.raw.asInstanceOf).value

  def setCloseFd(close_fd: Boolean): Unit =
    g_unix_output_stream_set_close_fd(this.raw.asInstanceOf, close_fd)

end UnixOutputStream

object UnixOutputStream:
  def apply(fd: Int, close_fd: Boolean): UnixOutputStream =
    new UnixOutputStream(
      g_unix_output_stream_new(gint(fd), close_fd).asInstanceOf
    )
end UnixOutputStream
