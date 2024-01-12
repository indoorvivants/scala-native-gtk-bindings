package sn.gnome.gdkpixbuf.fluent

import _root_.sn.gnome.gdkpixbuf.internal.*

import _root_.scala.scalanative.unsafe.*

class PixbufAnimationIter(private[fluent] val raw: Ptr[GdkPixbufAnimationIter]) extends sn.gnome.gobject.fluent.Object:
  def advance(current_time : Any /* Some(GLib.TimeVal): const GTimeVal**/): Boolean = gdk_pixbuf_animation_iter_advance(this.raw, current_time)

  def getDelayTime(): Int = gdk_pixbuf_animation_iter_get_delay_time(this.raw)

  def getPixbuf(): sn.gnome.gdkpixbuf.fluent.Pixbuf = gdk_pixbuf_animation_iter_get_pixbuf(this.raw)

  def onCurrentlyLoadingFrame(): Boolean = gdk_pixbuf_animation_iter_on_currently_loading_frame(this.raw)

end PixbufAnimationIter

