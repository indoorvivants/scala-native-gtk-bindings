package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class MemoryOutputStream(private[fluent] val raw: Ptr[GMemoryOutputStream]) extends sn.gnome.gio.fluent.OutputStream, sn.gnome.gio.fluent.PollableOutputStream, sn.gnome.gio.fluent.Seekable:
  def getData(): Ptr[Byte] = g_memory_output_stream_get_data(this.raw)

  def getDataSize(): Any /* Some(gsize): gsize*/ = g_memory_output_stream_get_data_size(this.raw)

  def getSize(): Any /* Some(gsize): gsize*/ = g_memory_output_stream_get_size(this.raw)

  def stealAsBytes(): Any /* Some(GLib.Bytes): GBytes**/ = g_memory_output_stream_steal_as_bytes(this.raw)

  def stealData(): Ptr[Byte] = g_memory_output_stream_steal_data(this.raw)

end MemoryOutputStream

object MemoryOutputStream:
  def apply(data : Ptr[Byte], size : Any /* Some(gsize): gsize*/, realloc_function : Any /* Some(ReallocFunc): GReallocFunc*/, destroy_function : Any /* Some(GLib.DestroyNotify): GDestroyNotify*/): MemoryOutputStream = MemoryOutputStream(g_memory_output_stream_new(data, size, realloc_function, destroy_function))

  def resizable(): MemoryOutputStream = MemoryOutputStream(g_memory_output_stream_new_resizable())

end MemoryOutputStream
