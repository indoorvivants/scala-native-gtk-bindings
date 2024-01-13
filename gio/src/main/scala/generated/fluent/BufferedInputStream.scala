package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.FilterInputStream
import sn.gnome.gio.fluent.Seekable
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.glib.internal.gpointer

class BufferedInputStream(raw: Ptr[GBufferedInputStream]) extends FilterInputStream(raw.asInstanceOf), Seekable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def fill(count : Any /* Some(gssize): `gssize` */, cancellable : Cancellable): Any /* Some(gssize): `gssize` */ = g_buffered_input_stream_fill(this.raw.asInstanceOf, count, cancellable.getUnsafeRawPointer().asInstanceOf)

  def fillAsync(count : Any /* Some(gssize): `gssize` */, io_priority : Int, cancellable : Cancellable, callback : GAsyncReadyCallback, user_data : Ptr[Byte]): Unit = g_buffered_input_stream_fill_async(this.raw.asInstanceOf, count, io_priority, cancellable.getUnsafeRawPointer().asInstanceOf, callback, gpointer(user_data))

  def fillFinish(result : AsyncResult): Any /* Some(gssize): `gssize` */ = g_buffered_input_stream_fill_finish(this.raw.asInstanceOf, result.getUnsafeRawPointer().asInstanceOf)

  def getAvailable(): Any /* Some(gsize): `gsize` */ = g_buffered_input_stream_get_available(this.raw.asInstanceOf)

  def getBufferSize(): Any /* Some(gsize): `gsize` */ = g_buffered_input_stream_get_buffer_size(this.raw.asInstanceOf)

  def readByte(cancellable : Cancellable): Int = g_buffered_input_stream_read_byte(this.raw.asInstanceOf, cancellable.getUnsafeRawPointer().asInstanceOf)

  def setBufferSize(size : Any /* Some(gsize): `gsize` */): Unit = g_buffered_input_stream_set_buffer_size(this.raw.asInstanceOf, size)

end BufferedInputStream

object BufferedInputStream:
  def apply(base_stream : InputStream): BufferedInputStream = new BufferedInputStream(g_buffered_input_stream_new(base_stream.getUnsafeRawPointer().asInstanceOf).asInstanceOf)
  def sized(base_stream : InputStream, size : Any /* Some(gsize): `gsize` */): BufferedInputStream = new BufferedInputStream(g_buffered_input_stream_new_sized(base_stream.getUnsafeRawPointer().asInstanceOf, size).asInstanceOf)
end BufferedInputStream
