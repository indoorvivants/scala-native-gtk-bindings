package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class BufferedOutputStream(private[fluent] val raw: Ptr[GBufferedOutputStream]) extends FilterOutputStream, Seekable:
  def getAutoGrow(): Boolean = g_buffered_output_stream_get_auto_grow(this.raw)

  def getBufferSize(): Any /* Some(gsize): gsize*/ = g_buffered_output_stream_get_buffer_size(this.raw)

  def setAutoGrow(auto_grow : Boolean): Unit = g_buffered_output_stream_set_auto_grow(this.raw, auto_grow)

  def setBufferSize(size : Any /* Some(gsize): gsize*/): Unit = g_buffered_output_stream_set_buffer_size(this.raw, size)

end BufferedOutputStream

object BufferedOutputStream:
  def apply(base_stream : sn.gnome.gio.fluent.OutputStream): BufferedOutputStream = BufferedOutputStream(g_buffered_output_stream_new(base_stream.raw))

  def sized(base_stream : sn.gnome.gio.fluent.OutputStream, size : Any /* Some(gsize): gsize*/): BufferedOutputStream = BufferedOutputStream(g_buffered_output_stream_new_sized(base_stream.raw, size))

end BufferedOutputStream
