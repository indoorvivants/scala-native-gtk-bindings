package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class MemoryInputStream(private[fluent] val raw: Ptr[GMemoryInputStream]) extends InputStream, PollableInputStream, Seekable:
  def addBytes(bytes : Any /* Some(GLib.Bytes): GBytes**/): Unit = g_memory_input_stream_add_bytes(this.raw, bytes)

  def addData(data : Array[Byte], len : Any /* Some(gssize): gssize*/, destroy : Any /* Some(GLib.DestroyNotify): GDestroyNotify*/): Unit = g_memory_input_stream_add_data(this.raw, data, len, destroy)

end MemoryInputStream

object MemoryInputStream:
  def apply(): MemoryInputStream = MemoryInputStream(g_memory_input_stream_new())

  def fromBytes(bytes : Any /* Some(GLib.Bytes): GBytes**/): MemoryInputStream = MemoryInputStream(g_memory_input_stream_new_from_bytes(bytes))

  def fromData(data : Array[Byte], len : Any /* Some(gssize): gssize*/, destroy : Any /* Some(GLib.DestroyNotify): GDestroyNotify*/): MemoryInputStream = MemoryInputStream(g_memory_input_stream_new_from_data(data, len, destroy))

end MemoryInputStream
