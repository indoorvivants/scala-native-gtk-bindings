package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class DataOutputStream(private[fluent] val raw: Ptr[GDataOutputStream]) extends FilterOutputStream, Seekable:
  def getByteOrder(): GDataStreamByteOrder = g_data_output_stream_get_byte_order(this.raw)

  def putByte(data : UByte, cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_data_output_stream_put_byte(this.raw, data, cancellable.raw)

  def putInt16(data : Any /* Some(gint16): gint16*/, cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_data_output_stream_put_int16(this.raw, data, cancellable.raw)

  def putInt32(data : Any /* Some(gint32): gint32*/, cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_data_output_stream_put_int32(this.raw, data, cancellable.raw)

  def putInt64(data : Any /* Some(gint64): gint64*/, cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_data_output_stream_put_int64(this.raw, data, cancellable.raw)

  def putString(str : String, cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_data_output_stream_put_string(this.raw, str, cancellable.raw)

  def putUint16(data : UShort, cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_data_output_stream_put_uint16(this.raw, data, cancellable.raw)

  def putUint32(data : UInt, cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_data_output_stream_put_uint32(this.raw, data, cancellable.raw)

  def putUint64(data : ULong, cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_data_output_stream_put_uint64(this.raw, data, cancellable.raw)

  def setByteOrder(order : GDataStreamByteOrder): Unit = g_data_output_stream_set_byte_order(this.raw, order)

end DataOutputStream

object DataOutputStream:
  def apply(base_stream : sn.gnome.gio.fluent.OutputStream): DataOutputStream = DataOutputStream(g_data_output_stream_new(base_stream.raw))

end DataOutputStream
