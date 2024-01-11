package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class ConverterOutputStream(private[fluent] val raw: Ptr[GConverterOutputStream]) extends FilterOutputStream, PollableOutputStream:
  def getConverter(): sn.gnome.gio.fluent.Converter = g_converter_output_stream_get_converter(this.raw)

end ConverterOutputStream

object ConverterOutputStream:
  def apply(base_stream : sn.gnome.gio.fluent.OutputStream, converter : sn.gnome.gio.fluent.Converter): ConverterOutputStream = ConverterOutputStream(g_converter_output_stream_new(base_stream.raw, converter.raw))

end ConverterOutputStream
