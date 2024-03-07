package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.InputStream
import sn.gnome.gio.internal.GFilterInputStream

class FilterInputStream(raw: Ptr[GFilterInputStream])
    extends InputStream(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getBaseStream(): InputStream = new InputStream(
    g_filter_input_stream_get_base_stream(this.raw.asInstanceOf).asInstanceOf
  )

  def getCloseBaseStream(): Boolean =
    g_filter_input_stream_get_close_base_stream(this.raw.asInstanceOf).value
      .!=(0)

  def setCloseBaseStream(close_base: Boolean): Unit =
    g_filter_input_stream_set_close_base_stream(
      this.raw.asInstanceOf,
      close_base
    )

end FilterInputStream
