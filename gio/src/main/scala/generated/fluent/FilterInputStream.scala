package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class FilterInputStream(private[fluent] val raw: Ptr[GFilterInputStream]) extends sn.gnome.gio.fluent.InputStream:
  def getBaseStream(): sn.gnome.gio.fluent.InputStream = g_filter_input_stream_get_base_stream(this.raw)

  def getCloseBaseStream(): Boolean = g_filter_input_stream_get_close_base_stream(this.raw)

  def setCloseBaseStream(close_base : Boolean): Unit = g_filter_input_stream_set_close_base_stream(this.raw, close_base)

end FilterInputStream

