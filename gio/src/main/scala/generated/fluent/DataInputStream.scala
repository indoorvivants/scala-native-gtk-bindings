package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.BufferedInputStream
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.InputStream
import sn.gnome.gio.fluent.Seekable
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GDataInputStream
import sn.gnome.gio.internal.GDataStreamByteOrder
import sn.gnome.gio.internal.GDataStreamNewlineType
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.gsize
import sn.gnome.glib.internal.gssize
import sn.gnome.glib.internal.guchar
import sn.gnome.glib.internal.guint16
import sn.gnome.glib.internal.guint32
import sn.gnome.glib.internal.guint64

class DataInputStream(raw: Ptr[GDataInputStream])
    extends BufferedInputStream(raw.asInstanceOf),
      Seekable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getByteOrder(): GDataStreamByteOrder = g_data_input_stream_get_byte_order(
    this.raw.asInstanceOf
  )

  def getNewlineType(): GDataStreamNewlineType =
    g_data_input_stream_get_newline_type(this.raw.asInstanceOf)

  def readByte(cancellable: Cancellable): GResult[UByte] =
    GResult.wrap(__errorPtr =>
      g_data_input_stream_read_byte(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value
    )

  def readInt16(
      cancellable: Cancellable
  ): GResult[Any /* Some(gint16): `gint16` */ ] = GResult.wrap(__errorPtr =>
    g_data_input_stream_read_int16(
      this.raw.asInstanceOf,
      cancellable.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    )
  )

  def readInt32(
      cancellable: Cancellable
  ): GResult[Any /* Some(gint32): `gint32` */ ] = GResult.wrap(__errorPtr =>
    g_data_input_stream_read_int32(
      this.raw.asInstanceOf,
      cancellable.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    )
  )

  def readInt64(
      cancellable: Cancellable
  ): GResult[Any /* Some(gint64): `gint64` */ ] = GResult.wrap(__errorPtr =>
    g_data_input_stream_read_int64(
      this.raw.asInstanceOf,
      cancellable.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    )
  )

  def readLineAsync(
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_data_input_stream_read_line_async(
    this.raw.asInstanceOf,
    gint(io_priority),
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def readLineFinishUtf8(result: AsyncResult, length: Ptr[CUnsignedLongInt])(
      using Zone
  ): GResult[String] = GResult.wrap(__errorPtr =>
    fromCString(
      g_data_input_stream_read_line_finish_utf8(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        length.asInstanceOf[Ptr[gsize]],
        __errorPtr
      ).asInstanceOf
    )
  )

  def readLineUtf8(length: Ptr[CUnsignedLongInt], cancellable: Cancellable)(
      using Zone
  ): GResult[String] = GResult.wrap(__errorPtr =>
    fromCString(
      g_data_input_stream_read_line_utf8(
        this.raw.asInstanceOf,
        length.asInstanceOf[Ptr[gsize]],
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  def readUint16(cancellable: Cancellable): GResult[UShort] =
    GResult.wrap(__errorPtr =>
      g_data_input_stream_read_uint16(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value
    )

  def readUint32(cancellable: Cancellable): GResult[UInt] =
    GResult.wrap(__errorPtr =>
      g_data_input_stream_read_uint32(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value
    )

  def readUint64(cancellable: Cancellable): GResult[ULong] =
    GResult.wrap(__errorPtr =>
      g_data_input_stream_read_uint64(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value
    )

  def readUntil(
      stop_chars: String | CString,
      length: Ptr[CUnsignedLongInt],
      cancellable: Cancellable
  )(using Zone): GResult[String] = GResult.wrap(__errorPtr =>
    fromCString(
      g_data_input_stream_read_until(
        this.raw.asInstanceOf,
        __sn_extract_string(stop_chars).asInstanceOf[Ptr[gchar]],
        length.asInstanceOf[Ptr[gsize]],
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  def readUntilAsync(
      stop_chars: String | CString,
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  )(using Zone): Unit = g_data_input_stream_read_until_async(
    this.raw.asInstanceOf,
    __sn_extract_string(stop_chars).asInstanceOf[Ptr[gchar]],
    gint(io_priority),
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def readUntilFinish(result: AsyncResult, length: Ptr[CUnsignedLongInt])(using
      Zone
  ): GResult[String] = GResult.wrap(__errorPtr =>
    fromCString(
      g_data_input_stream_read_until_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        length.asInstanceOf[Ptr[gsize]],
        __errorPtr
      ).asInstanceOf
    )
  )

  def readUpto(
      stop_chars: String | CString,
      stop_chars_len: CLongInt,
      length: Ptr[CUnsignedLongInt],
      cancellable: Cancellable
  )(using Zone): GResult[String] = GResult.wrap(__errorPtr =>
    fromCString(
      g_data_input_stream_read_upto(
        this.raw.asInstanceOf,
        __sn_extract_string(stop_chars).asInstanceOf[Ptr[gchar]],
        gssize(stop_chars_len),
        length.asInstanceOf[Ptr[gsize]],
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  def readUptoAsync(
      stop_chars: String | CString,
      stop_chars_len: CLongInt,
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  )(using Zone): Unit = g_data_input_stream_read_upto_async(
    this.raw.asInstanceOf,
    __sn_extract_string(stop_chars).asInstanceOf[Ptr[gchar]],
    gssize(stop_chars_len),
    gint(io_priority),
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def readUptoFinish(result: AsyncResult, length: Ptr[CUnsignedLongInt])(using
      Zone
  ): GResult[String] = GResult.wrap(__errorPtr =>
    fromCString(
      g_data_input_stream_read_upto_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        length.asInstanceOf[Ptr[gsize]],
        __errorPtr
      ).asInstanceOf
    )
  )

  def setByteOrder(order: GDataStreamByteOrder): Unit =
    g_data_input_stream_set_byte_order(this.raw.asInstanceOf, order)

  def setNewlineType(`type`: GDataStreamNewlineType): Unit =
    g_data_input_stream_set_newline_type(this.raw.asInstanceOf, `type`)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end DataInputStream

object DataInputStream:
  def apply(base_stream: InputStream): DataInputStream = new DataInputStream(
    g_data_input_stream_new(
      base_stream.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end DataInputStream
