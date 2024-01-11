package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class InputStream(private[fluent] val raw: Ptr[GInputStream]) extends GObject.Object:
  def clearPending(): Unit = g_input_stream_clear_pending(this.raw)

  def close(cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_input_stream_close(this.raw, cancellable.raw)

  def closeAsync(io_priority : Int, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_input_stream_close_async(this.raw, io_priority, cancellable.raw, callback, user_data)

  def closeFinish(result : sn.gnome.gio.fluent.AsyncResult): Boolean = g_input_stream_close_finish(this.raw, result.raw)

  def hasPending(): Boolean = g_input_stream_has_pending(this.raw)

  def isClosed(): Boolean = g_input_stream_is_closed(this.raw)

  def read(buffer : Array[Byte], count : Any /* Some(gsize): gsize*/, cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(gssize): gssize*/ = g_input_stream_read(this.raw, buffer, count, cancellable.raw)

  def readAll(buffer : Array[Byte], count : Any /* Some(gsize): gsize*/, bytes_read : Any /* Some(gsize): gsize**/, cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_input_stream_read_all(this.raw, buffer, count, bytes_read, cancellable.raw)

  def readAllAsync(buffer : Array[Byte], count : Any /* Some(gsize): gsize*/, io_priority : Int, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_input_stream_read_all_async(this.raw, buffer, count, io_priority, cancellable.raw, callback, user_data)

  def readAllFinish(result : sn.gnome.gio.fluent.AsyncResult, bytes_read : Any /* Some(gsize): gsize**/): Boolean = g_input_stream_read_all_finish(this.raw, result.raw, bytes_read)

  def readAsync(buffer : Array[Byte], count : Any /* Some(gsize): gsize*/, io_priority : Int, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_input_stream_read_async(this.raw, buffer, count, io_priority, cancellable.raw, callback, user_data)

  def readBytes(count : Any /* Some(gsize): gsize*/, cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(GLib.Bytes): GBytes**/ = g_input_stream_read_bytes(this.raw, count, cancellable.raw)

  def readBytesAsync(count : Any /* Some(gsize): gsize*/, io_priority : Int, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_input_stream_read_bytes_async(this.raw, count, io_priority, cancellable.raw, callback, user_data)

  def readBytesFinish(result : sn.gnome.gio.fluent.AsyncResult): Any /* Some(GLib.Bytes): GBytes**/ = g_input_stream_read_bytes_finish(this.raw, result.raw)

  def readFinish(result : sn.gnome.gio.fluent.AsyncResult): Any /* Some(gssize): gssize*/ = g_input_stream_read_finish(this.raw, result.raw)

  def setPending(): Boolean = g_input_stream_set_pending(this.raw)

  def skip(count : Any /* Some(gsize): gsize*/, cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(gssize): gssize*/ = g_input_stream_skip(this.raw, count, cancellable.raw)

  def skipAsync(count : Any /* Some(gsize): gsize*/, io_priority : Int, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_input_stream_skip_async(this.raw, count, io_priority, cancellable.raw, callback, user_data)

  def skipFinish(result : sn.gnome.gio.fluent.AsyncResult): Any /* Some(gssize): gssize*/ = g_input_stream_skip_finish(this.raw, result.raw)

end InputStream

