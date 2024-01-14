package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.FilterInputStream
import sn.gnome.gio.fluent.Seekable
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.gsize
import sn.gnome.glib.internal.gssize

class BufferedInputStream(raw: Ptr[GBufferedInputStream]) extends FilterInputStream(raw.asInstanceOf), Seekable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def fill(count : ULong, cancellable : Cancellable): ULong = g_buffered_input_stream_fill(this.raw.asInstanceOf, gssize(count), cancellable.getUnsafeRawPointer().asInstanceOf).value

  def fillAsync(count : ULong, io_priority : Int, cancellable : Cancellable, callback : GAsyncReadyCallback, user_data : Ptr[Byte]): Unit = g_buffered_input_stream_fill_async(this.raw.asInstanceOf, gssize(count), io_priority, cancellable.getUnsafeRawPointer().asInstanceOf, callback, gpointer(user_data))

  def fillFinish(result : AsyncResult): ULong = g_buffered_input_stream_fill_finish(this.raw.asInstanceOf, result.getUnsafeRawPointer().asInstanceOf).value

  def getAvailable(): ULong = g_buffered_input_stream_get_available(this.raw.asInstanceOf).value

  def getBufferSize(): ULong = g_buffered_input_stream_get_buffer_size(this.raw.asInstanceOf).value

  def readByte(cancellable : Cancellable): Int = g_buffered_input_stream_read_byte(this.raw.asInstanceOf, cancellable.getUnsafeRawPointer().asInstanceOf)

  def setBufferSize(size : ULong): Unit = g_buffered_input_stream_set_buffer_size(this.raw.asInstanceOf, gsize(size))

end BufferedInputStream

object BufferedInputStream:
  def apply(base_stream : InputStream): BufferedInputStream = new BufferedInputStream(g_buffered_input_stream_new(base_stream.getUnsafeRawPointer().asInstanceOf).asInstanceOf)
  def sized(base_stream : InputStream, size : ULong): BufferedInputStream = new BufferedInputStream(g_buffered_input_stream_new_sized(base_stream.getUnsafeRawPointer().asInstanceOf, gsize(size)).asInstanceOf)
end BufferedInputStream
