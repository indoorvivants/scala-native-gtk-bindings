package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class IOStream(private[fluent] val raw: Ptr[GIOStream]) extends GObject.Object:
  def clearPending(): Unit = g_io_stream_clear_pending(this.raw)

  def close(cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_io_stream_close(this.raw, cancellable.raw)

  def closeAsync(io_priority : Int, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_io_stream_close_async(this.raw, io_priority, cancellable.raw, callback, user_data)

  def closeFinish(result : sn.gnome.gio.fluent.AsyncResult): Boolean = g_io_stream_close_finish(this.raw, result.raw)

  def getInputStream(): sn.gnome.gio.fluent.InputStream = g_io_stream_get_input_stream(this.raw)

  def getOutputStream(): sn.gnome.gio.fluent.OutputStream = g_io_stream_get_output_stream(this.raw)

  def hasPending(): Boolean = g_io_stream_has_pending(this.raw)

  def isClosed(): Boolean = g_io_stream_is_closed(this.raw)

  def setPending(): Boolean = g_io_stream_set_pending(this.raw)

  def spliceAsync(stream2 : sn.gnome.gio.fluent.IOStream, flags : Any /* Some(IOStreamSpliceFlags): GIOStreamSpliceFlags*/, io_priority : Int, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_io_stream_splice_async(this.raw, stream2.raw, flags, io_priority, cancellable.raw, callback, user_data)

end IOStream

