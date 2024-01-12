package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class FilterOutputStream(private[fluent] val raw: Ptr[GFilterOutputStream]) extends sn.gnome.gio.fluent.OutputStream:
  def getBaseStream(): sn.gnome.gio.fluent.OutputStream = g_filter_output_stream_get_base_stream(this.raw)

  def getCloseBaseStream(): Boolean = g_filter_output_stream_get_close_base_stream(this.raw)

  def setCloseBaseStream(close_base : Boolean): Unit = g_filter_output_stream_set_close_base_stream(this.raw, close_base)

end FilterOutputStream

