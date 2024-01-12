package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class SimpleIOStream(private[fluent] val raw: Ptr[GSimpleIOStream]) extends sn.gnome.gio.fluent.IOStream

object SimpleIOStream:
  def apply(input_stream : sn.gnome.gio.fluent.InputStream, output_stream : sn.gnome.gio.fluent.OutputStream): SimpleIOStream = SimpleIOStream(g_simple_io_stream_new(input_stream.raw, output_stream.raw))

end SimpleIOStream
