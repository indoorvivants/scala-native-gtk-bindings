package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.FilterOutputStream
import sn.gnome.gio.fluent.Seekable
import sn.gnome.glib.internal.gsize

class BufferedOutputStream(raw: Ptr[GBufferedOutputStream]) extends FilterOutputStream(raw.asInstanceOf), Seekable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getAutoGrow(): Boolean = g_buffered_output_stream_get_auto_grow(this.raw.asInstanceOf).value.!=(0)

  def getBufferSize(): ULong = g_buffered_output_stream_get_buffer_size(this.raw.asInstanceOf).value

  def setAutoGrow(auto_grow : Boolean): Unit = g_buffered_output_stream_set_auto_grow(this.raw.asInstanceOf, auto_grow)

  def setBufferSize(size : ULong): Unit = g_buffered_output_stream_set_buffer_size(this.raw.asInstanceOf, gsize(size))

end BufferedOutputStream

object BufferedOutputStream:
  def apply(base_stream : OutputStream): BufferedOutputStream = new BufferedOutputStream(g_buffered_output_stream_new(base_stream.getUnsafeRawPointer().asInstanceOf).asInstanceOf)
  def sized(base_stream : OutputStream, size : ULong): BufferedOutputStream = new BufferedOutputStream(g_buffered_output_stream_new_sized(base_stream.getUnsafeRawPointer().asInstanceOf, gsize(size)).asInstanceOf)
end BufferedOutputStream
