package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.IOStream

class SimpleIOStream(raw: Ptr[GSimpleIOStream]) extends IOStream(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end SimpleIOStream

object SimpleIOStream:
  def apply(input_stream : InputStream, output_stream : OutputStream): SimpleIOStream = new SimpleIOStream(g_simple_io_stream_new(input_stream.getUnsafeRawPointer().asInstanceOf, output_stream.getUnsafeRawPointer().asInstanceOf).asInstanceOf)
end SimpleIOStream
