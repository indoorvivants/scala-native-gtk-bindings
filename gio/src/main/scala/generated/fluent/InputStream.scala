package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GInputStream
import sn.gnome.glib.internal.GBytes
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.gsize
import sn.gnome.glib.internal.gssize
import sn.gnome.gobject.fluent.Object

class InputStream(raw: Ptr[GInputStream]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def clearPending(): Unit = g_input_stream_clear_pending(this.raw.asInstanceOf)

  def close(cancellable: Cancellable): Boolean = g_input_stream_close(
    this.raw.asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  def closeAsync(
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_input_stream_close_async(
    this.raw.asInstanceOf,
    io_priority,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def closeFinish(result: AsyncResult): Boolean = g_input_stream_close_finish(
    this.raw.asInstanceOf,
    result.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  def hasPending(): Boolean =
    g_input_stream_has_pending(this.raw.asInstanceOf).value.!=(0)

  def isClosed(): Boolean =
    g_input_stream_is_closed(this.raw.asInstanceOf).value.!=(0)

  def readAllFinish(result: AsyncResult, bytes_read: Ptr[ULong]): Boolean =
    g_input_stream_read_all_finish(
      this.raw.asInstanceOf,
      result.getUnsafeRawPointer().asInstanceOf,
      bytes_read.asInstanceOf[Ptr[gsize]]
    ).value.!=(0)

  def readBytes(count: ULong, cancellable: Cancellable): Ptr[GBytes] =
    g_input_stream_read_bytes(
      this.raw.asInstanceOf,
      gsize(count),
      cancellable.getUnsafeRawPointer().asInstanceOf
    )

  def readBytesAsync(
      count: ULong,
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_input_stream_read_bytes_async(
    this.raw.asInstanceOf,
    gsize(count),
    io_priority,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def readBytesFinish(result: AsyncResult): Ptr[GBytes] =
    g_input_stream_read_bytes_finish(
      this.raw.asInstanceOf,
      result.getUnsafeRawPointer().asInstanceOf
    )

  def readFinish(result: AsyncResult): ULong = g_input_stream_read_finish(
    this.raw.asInstanceOf,
    result.getUnsafeRawPointer().asInstanceOf
  ).value

  def setPending(): Boolean =
    g_input_stream_set_pending(this.raw.asInstanceOf).value.!=(0)

  def skip(count: ULong, cancellable: Cancellable): ULong = g_input_stream_skip(
    this.raw.asInstanceOf,
    gsize(count),
    cancellable.getUnsafeRawPointer().asInstanceOf
  ).value

  def skipAsync(
      count: ULong,
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_input_stream_skip_async(
    this.raw.asInstanceOf,
    gsize(count),
    io_priority,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def skipFinish(result: AsyncResult): ULong = g_input_stream_skip_finish(
    this.raw.asInstanceOf,
    result.getUnsafeRawPointer().asInstanceOf
  ).value

end InputStream
