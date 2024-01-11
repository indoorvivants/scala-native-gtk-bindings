package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class BufferedInputStream(private[fluent] val raw: Ptr[GBufferedInputStream]) extends FilterInputStream, Seekable:
  def fill(count : Any /* Some(gssize): gssize*/, cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(gssize): gssize*/ = g_buffered_input_stream_fill(this.raw, count, cancellable.raw)

  def fillAsync(count : Any /* Some(gssize): gssize*/, io_priority : Int, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_buffered_input_stream_fill_async(this.raw, count, io_priority, cancellable.raw, callback, user_data)

  def fillFinish(result : sn.gnome.gio.fluent.AsyncResult): Any /* Some(gssize): gssize*/ = g_buffered_input_stream_fill_finish(this.raw, result.raw)

  def getAvailable(): Any /* Some(gsize): gsize*/ = g_buffered_input_stream_get_available(this.raw)

  def getBufferSize(): Any /* Some(gsize): gsize*/ = g_buffered_input_stream_get_buffer_size(this.raw)

  def peek(buffer : Array[Byte], offset : Any /* Some(gsize): gsize*/, count : Any /* Some(gsize): gsize*/): Any /* Some(gsize): gsize*/ = g_buffered_input_stream_peek(this.raw, buffer, offset, count)

  def peekBuffer(count : Any /* Some(gsize): gsize**/): Array[Byte] = g_buffered_input_stream_peek_buffer(this.raw, count)

  def readByte(cancellable : sn.gnome.gio.fluent.Cancellable): Int = g_buffered_input_stream_read_byte(this.raw, cancellable.raw)

  def setBufferSize(size : Any /* Some(gsize): gsize*/): Unit = g_buffered_input_stream_set_buffer_size(this.raw, size)

end BufferedInputStream

object BufferedInputStream:
  def apply(base_stream : sn.gnome.gio.fluent.InputStream): BufferedInputStream = BufferedInputStream(g_buffered_input_stream_new(base_stream.raw))

  def sized(base_stream : sn.gnome.gio.fluent.InputStream, size : Any /* Some(gsize): gsize*/): BufferedInputStream = BufferedInputStream(g_buffered_input_stream_new_sized(base_stream.raw, size))

end BufferedInputStream
