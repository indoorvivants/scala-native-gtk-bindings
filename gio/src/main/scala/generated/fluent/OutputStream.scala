package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class OutputStream(private[fluent] val raw: Ptr[GOutputStream]) extends GObject.Object:
  def clearPending(): Unit = g_output_stream_clear_pending(this.raw)

  def close(cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_output_stream_close(this.raw, cancellable.raw)

  def closeAsync(io_priority : Int, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_output_stream_close_async(this.raw, io_priority, cancellable.raw, callback, user_data)

  def closeFinish(result : sn.gnome.gio.fluent.AsyncResult): Boolean = g_output_stream_close_finish(this.raw, result.raw)

  def flush(cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_output_stream_flush(this.raw, cancellable.raw)

  def flushAsync(io_priority : Int, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_output_stream_flush_async(this.raw, io_priority, cancellable.raw, callback, user_data)

  def flushFinish(result : sn.gnome.gio.fluent.AsyncResult): Boolean = g_output_stream_flush_finish(this.raw, result.raw)

  def hasPending(): Boolean = g_output_stream_has_pending(this.raw)

  def isClosed(): Boolean = g_output_stream_is_closed(this.raw)

  def isClosing(): Boolean = g_output_stream_is_closing(this.raw)

  def setPending(): Boolean = g_output_stream_set_pending(this.raw)

  def splice(source : sn.gnome.gio.fluent.InputStream, flags : Any /* Some(OutputStreamSpliceFlags): GOutputStreamSpliceFlags*/, cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(gssize): gssize*/ = g_output_stream_splice(this.raw, source.raw, flags, cancellable.raw)

  def spliceAsync(source : sn.gnome.gio.fluent.InputStream, flags : Any /* Some(OutputStreamSpliceFlags): GOutputStreamSpliceFlags*/, io_priority : Int, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_output_stream_splice_async(this.raw, source.raw, flags, io_priority, cancellable.raw, callback, user_data)

  def spliceFinish(result : sn.gnome.gio.fluent.AsyncResult): Any /* Some(gssize): gssize*/ = g_output_stream_splice_finish(this.raw, result.raw)

  def vprintf(bytes_written : Any /* Some(gsize): gsize**/, cancellable : sn.gnome.gio.fluent.Cancellable, error : Any /* Some(GLib.Error): GError***/, format : String, args : Any /* Some(va_list): va_list*/): Boolean = g_output_stream_vprintf(this.raw, bytes_written, cancellable.raw, error, format, args)

  def write(buffer : Array[Byte], count : Any /* Some(gsize): gsize*/, cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(gssize): gssize*/ = g_output_stream_write(this.raw, buffer, count, cancellable.raw)

  def writeAll(buffer : Array[Byte], count : Any /* Some(gsize): gsize*/, bytes_written : Any /* Some(gsize): gsize**/, cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_output_stream_write_all(this.raw, buffer, count, bytes_written, cancellable.raw)

  def writeAllAsync(buffer : Array[Byte], count : Any /* Some(gsize): gsize*/, io_priority : Int, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_output_stream_write_all_async(this.raw, buffer, count, io_priority, cancellable.raw, callback, user_data)

  def writeAllFinish(result : sn.gnome.gio.fluent.AsyncResult, bytes_written : Any /* Some(gsize): gsize**/): Boolean = g_output_stream_write_all_finish(this.raw, result.raw, bytes_written)

  def writeAsync(buffer : Array[Byte], count : Any /* Some(gsize): gsize*/, io_priority : Int, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_output_stream_write_async(this.raw, buffer, count, io_priority, cancellable.raw, callback, user_data)

  def writeBytes(bytes : Any /* Some(GLib.Bytes): GBytes**/, cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(gssize): gssize*/ = g_output_stream_write_bytes(this.raw, bytes, cancellable.raw)

  def writeBytesAsync(bytes : Any /* Some(GLib.Bytes): GBytes**/, io_priority : Int, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_output_stream_write_bytes_async(this.raw, bytes, io_priority, cancellable.raw, callback, user_data)

  def writeBytesFinish(result : sn.gnome.gio.fluent.AsyncResult): Any /* Some(gssize): gssize*/ = g_output_stream_write_bytes_finish(this.raw, result.raw)

  def writeFinish(result : sn.gnome.gio.fluent.AsyncResult): Any /* Some(gssize): gssize*/ = g_output_stream_write_finish(this.raw, result.raw)

  def writev(vectors : Array[Byte], n_vectors : Any /* Some(gsize): gsize*/, bytes_written : Any /* Some(gsize): gsize**/, cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_output_stream_writev(this.raw, vectors, n_vectors, bytes_written, cancellable.raw)

  def writevAll(vectors : Array[Byte], n_vectors : Any /* Some(gsize): gsize*/, bytes_written : Any /* Some(gsize): gsize**/, cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_output_stream_writev_all(this.raw, vectors, n_vectors, bytes_written, cancellable.raw)

  def writevAllAsync(vectors : Array[Byte], n_vectors : Any /* Some(gsize): gsize*/, io_priority : Int, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_output_stream_writev_all_async(this.raw, vectors, n_vectors, io_priority, cancellable.raw, callback, user_data)

  def writevAllFinish(result : sn.gnome.gio.fluent.AsyncResult, bytes_written : Any /* Some(gsize): gsize**/): Boolean = g_output_stream_writev_all_finish(this.raw, result.raw, bytes_written)

  def writevAsync(vectors : Array[Byte], n_vectors : Any /* Some(gsize): gsize*/, io_priority : Int, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_output_stream_writev_async(this.raw, vectors, n_vectors, io_priority, cancellable.raw, callback, user_data)

  def writevFinish(result : sn.gnome.gio.fluent.AsyncResult, bytes_written : Any /* Some(gsize): gsize**/): Boolean = g_output_stream_writev_finish(this.raw, result.raw, bytes_written)

end OutputStream

