package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.InputStream
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GOutputStreamSpliceFlags
import sn.gnome.gio.internal.GOutputVector
import sn.gnome.glib.internal.GBytes
import sn.gnome.glib.internal.GError
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.gsize
import sn.gnome.glib.internal.gssize
import sn.gnome.gobject.fluent.Object

class OutputStream(raw: Ptr[GOutputStream]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def clearPending(): Unit = g_output_stream_clear_pending(this.raw.asInstanceOf)

  def close(cancellable : Cancellable): Boolean = g_output_stream_close(this.raw.asInstanceOf, cancellable.getUnsafeRawPointer().asInstanceOf).value.!=(0)

  def closeAsync(io_priority : Int, cancellable : Cancellable, callback : GAsyncReadyCallback, user_data : Ptr[Byte]): Unit = g_output_stream_close_async(this.raw.asInstanceOf, io_priority, cancellable.getUnsafeRawPointer().asInstanceOf, callback, gpointer(user_data))

  def closeFinish(result : AsyncResult): Boolean = g_output_stream_close_finish(this.raw.asInstanceOf, result.getUnsafeRawPointer().asInstanceOf).value.!=(0)

  def flush(cancellable : Cancellable): Boolean = g_output_stream_flush(this.raw.asInstanceOf, cancellable.getUnsafeRawPointer().asInstanceOf).value.!=(0)

  def flushAsync(io_priority : Int, cancellable : Cancellable, callback : GAsyncReadyCallback, user_data : Ptr[Byte]): Unit = g_output_stream_flush_async(this.raw.asInstanceOf, io_priority, cancellable.getUnsafeRawPointer().asInstanceOf, callback, gpointer(user_data))

  def flushFinish(result : AsyncResult): Boolean = g_output_stream_flush_finish(this.raw.asInstanceOf, result.getUnsafeRawPointer().asInstanceOf).value.!=(0)

  def hasPending(): Boolean = g_output_stream_has_pending(this.raw.asInstanceOf).value.!=(0)

  def isClosed(): Boolean = g_output_stream_is_closed(this.raw.asInstanceOf).value.!=(0)

  def isClosing(): Boolean = g_output_stream_is_closing(this.raw.asInstanceOf).value.!=(0)

  def setPending(): Boolean = g_output_stream_set_pending(this.raw.asInstanceOf).value.!=(0)

  def splice(source : InputStream, flags : GOutputStreamSpliceFlags, cancellable : Cancellable): ULong = g_output_stream_splice(this.raw.asInstanceOf, source.getUnsafeRawPointer().asInstanceOf, flags, cancellable.getUnsafeRawPointer().asInstanceOf).value

  def spliceAsync(source : InputStream, flags : GOutputStreamSpliceFlags, io_priority : Int, cancellable : Cancellable, callback : GAsyncReadyCallback, user_data : Ptr[Byte]): Unit = g_output_stream_splice_async(this.raw.asInstanceOf, source.getUnsafeRawPointer().asInstanceOf, flags, io_priority, cancellable.getUnsafeRawPointer().asInstanceOf, callback, gpointer(user_data))

  def spliceFinish(result : AsyncResult): ULong = g_output_stream_splice_finish(this.raw.asInstanceOf, result.getUnsafeRawPointer().asInstanceOf).value

  def vprintf(bytes_written : Ptr[ULong], cancellable : Cancellable, error : Ptr[Ptr[GError]], format : String | CString, args : CVarArgList)(using Zone): Boolean = g_output_stream_vprintf(this.raw.asInstanceOf, bytes_written.asInstanceOf[Ptr[gsize]], cancellable.getUnsafeRawPointer().asInstanceOf, error, __sn_extract_string(format).asInstanceOf[Ptr[gchar]], args).value.!=(0)

  def writeAllFinish(result : AsyncResult, bytes_written : Ptr[ULong]): Boolean = g_output_stream_write_all_finish(this.raw.asInstanceOf, result.getUnsafeRawPointer().asInstanceOf, bytes_written.asInstanceOf[Ptr[gsize]]).value.!=(0)

  def writeBytes(bytes : Ptr[GBytes], cancellable : Cancellable): ULong = g_output_stream_write_bytes(this.raw.asInstanceOf, bytes, cancellable.getUnsafeRawPointer().asInstanceOf).value

  def writeBytesAsync(bytes : Ptr[GBytes], io_priority : Int, cancellable : Cancellable, callback : GAsyncReadyCallback, user_data : Ptr[Byte]): Unit = g_output_stream_write_bytes_async(this.raw.asInstanceOf, bytes, io_priority, cancellable.getUnsafeRawPointer().asInstanceOf, callback, gpointer(user_data))

  def writeBytesFinish(result : AsyncResult): ULong = g_output_stream_write_bytes_finish(this.raw.asInstanceOf, result.getUnsafeRawPointer().asInstanceOf).value

  def writeFinish(result : AsyncResult): ULong = g_output_stream_write_finish(this.raw.asInstanceOf, result.getUnsafeRawPointer().asInstanceOf).value

  def writev(vectors : Ptr[GOutputVector], n_vectors : ULong, bytes_written : Ptr[ULong], cancellable : Cancellable): Boolean = g_output_stream_writev(this.raw.asInstanceOf, vectors, gsize(n_vectors), bytes_written.asInstanceOf[Ptr[gsize]], cancellable.getUnsafeRawPointer().asInstanceOf).value.!=(0)

  def writevAll(vectors : Ptr[GOutputVector], n_vectors : ULong, bytes_written : Ptr[ULong], cancellable : Cancellable): Boolean = g_output_stream_writev_all(this.raw.asInstanceOf, vectors, gsize(n_vectors), bytes_written.asInstanceOf[Ptr[gsize]], cancellable.getUnsafeRawPointer().asInstanceOf).value.!=(0)

  def writevAllAsync(vectors : Ptr[GOutputVector], n_vectors : ULong, io_priority : Int, cancellable : Cancellable, callback : GAsyncReadyCallback, user_data : Ptr[Byte]): Unit = g_output_stream_writev_all_async(this.raw.asInstanceOf, vectors, gsize(n_vectors), io_priority, cancellable.getUnsafeRawPointer().asInstanceOf, callback, gpointer(user_data))

  def writevAllFinish(result : AsyncResult, bytes_written : Ptr[ULong]): Boolean = g_output_stream_writev_all_finish(this.raw.asInstanceOf, result.getUnsafeRawPointer().asInstanceOf, bytes_written.asInstanceOf[Ptr[gsize]]).value.!=(0)

  def writevAsync(vectors : Ptr[GOutputVector], n_vectors : ULong, io_priority : Int, cancellable : Cancellable, callback : GAsyncReadyCallback, user_data : Ptr[Byte]): Unit = g_output_stream_writev_async(this.raw.asInstanceOf, vectors, gsize(n_vectors), io_priority, cancellable.getUnsafeRawPointer().asInstanceOf, callback, gpointer(user_data))

  def writevFinish(result : AsyncResult, bytes_written : Ptr[ULong]): Boolean = g_output_stream_writev_finish(this.raw.asInstanceOf, result.getUnsafeRawPointer().asInstanceOf, bytes_written.asInstanceOf[Ptr[gsize]]).value.!=(0)


  private inline def __sn_extract_string(str: String | CString)(using Zone): CString = 
    str match
      case s: String => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end OutputStream
