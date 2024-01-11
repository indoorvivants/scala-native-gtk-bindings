package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class DataInputStream(private[fluent] val raw: Ptr[GDataInputStream]) extends BufferedInputStream, Seekable:
  def getByteOrder(): GDataStreamByteOrder = g_data_input_stream_get_byte_order(this.raw)

  def getNewlineType(): GDataStreamNewlineType = g_data_input_stream_get_newline_type(this.raw)

  def readByte(cancellable : sn.gnome.gio.fluent.Cancellable): UByte = g_data_input_stream_read_byte(this.raw, cancellable.raw)

  def readInt16(cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(gint16): gint16*/ = g_data_input_stream_read_int16(this.raw, cancellable.raw)

  def readInt32(cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(gint32): gint32*/ = g_data_input_stream_read_int32(this.raw, cancellable.raw)

  def readInt64(cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(gint64): gint64*/ = g_data_input_stream_read_int64(this.raw, cancellable.raw)

  def readLine(length : Any /* Some(gsize): gsize**/, cancellable : sn.gnome.gio.fluent.Cancellable): Array[Byte] = g_data_input_stream_read_line(this.raw, length, cancellable.raw)

  def readLineAsync(io_priority : Int, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_data_input_stream_read_line_async(this.raw, io_priority, cancellable.raw, callback, user_data)

  def readLineFinish(result : sn.gnome.gio.fluent.AsyncResult, length : Any /* Some(gsize): gsize**/): Array[Byte] = g_data_input_stream_read_line_finish(this.raw, result.raw, length)

  def readLineFinishUtf8(result : sn.gnome.gio.fluent.AsyncResult, length : Any /* Some(gsize): gsize**/): Any /* Some(utf8): char**/ = g_data_input_stream_read_line_finish_utf8(this.raw, result.raw, length)

  def readLineUtf8(length : Any /* Some(gsize): gsize**/, cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(utf8): char**/ = g_data_input_stream_read_line_utf8(this.raw, length, cancellable.raw)

  def readUint16(cancellable : sn.gnome.gio.fluent.Cancellable): UShort = g_data_input_stream_read_uint16(this.raw, cancellable.raw)

  def readUint32(cancellable : sn.gnome.gio.fluent.Cancellable): UInt = g_data_input_stream_read_uint32(this.raw, cancellable.raw)

  def readUint64(cancellable : sn.gnome.gio.fluent.Cancellable): ULong = g_data_input_stream_read_uint64(this.raw, cancellable.raw)

  def readUntil(stop_chars : String, length : Any /* Some(gsize): gsize**/, cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(utf8): char**/ = g_data_input_stream_read_until(this.raw, stop_chars, length, cancellable.raw)

  def readUntilAsync(stop_chars : String, io_priority : Int, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_data_input_stream_read_until_async(this.raw, stop_chars, io_priority, cancellable.raw, callback, user_data)

  def readUntilFinish(result : sn.gnome.gio.fluent.AsyncResult, length : Any /* Some(gsize): gsize**/): Any /* Some(utf8): char**/ = g_data_input_stream_read_until_finish(this.raw, result.raw, length)

  def readUpto(stop_chars : String, stop_chars_len : Any /* Some(gssize): gssize*/, length : Any /* Some(gsize): gsize**/, cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(utf8): char**/ = g_data_input_stream_read_upto(this.raw, stop_chars, stop_chars_len, length, cancellable.raw)

  def readUptoAsync(stop_chars : String, stop_chars_len : Any /* Some(gssize): gssize*/, io_priority : Int, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_data_input_stream_read_upto_async(this.raw, stop_chars, stop_chars_len, io_priority, cancellable.raw, callback, user_data)

  def readUptoFinish(result : sn.gnome.gio.fluent.AsyncResult, length : Any /* Some(gsize): gsize**/): Any /* Some(utf8): char**/ = g_data_input_stream_read_upto_finish(this.raw, result.raw, length)

  def setByteOrder(order : GDataStreamByteOrder): Unit = g_data_input_stream_set_byte_order(this.raw, order)

  def setNewlineType(`type` : GDataStreamNewlineType): Unit = g_data_input_stream_set_newline_type(this.raw, `type`)

end DataInputStream

object DataInputStream:
  def apply(base_stream : sn.gnome.gio.fluent.InputStream): DataInputStream = DataInputStream(g_data_input_stream_new(base_stream.raw))

end DataInputStream
