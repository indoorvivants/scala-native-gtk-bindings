package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class ConverterInputStream(private[fluent] val raw: Ptr[GConverterInputStream]) extends FilterInputStream, PollableInputStream:
  def getConverter(): sn.gnome.gio.fluent.Converter = g_converter_input_stream_get_converter(this.raw)

end ConverterInputStream

object ConverterInputStream:
  def apply(base_stream : sn.gnome.gio.fluent.InputStream, converter : sn.gnome.gio.fluent.Converter): ConverterInputStream = ConverterInputStream(g_converter_input_stream_new(base_stream.raw, converter.raw))

end ConverterInputStream
