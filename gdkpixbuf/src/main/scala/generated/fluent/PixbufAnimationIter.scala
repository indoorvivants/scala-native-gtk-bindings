package sn.gnome.gdkpixbuf.fluent

import sn.gnome.gdkpixbuf.internal.*

class PixbufAnimationIter(private[fluent] val raw: Ptr[GdkPixbufAnimationIter]) extends GObject.Object:
  def advance(current_time : Any /* Some(GLib.TimeVal): const GTimeVal**/): Boolean = gdk_pixbuf_animation_iter_advance(this.raw, current_time)

  def getDelayTime(): Int = gdk_pixbuf_animation_iter_get_delay_time(this.raw)

  def getPixbuf(): sn.gnome.gdkpixbuf.fluent.Pixbuf = gdk_pixbuf_animation_iter_get_pixbuf(this.raw)

  def onCurrentlyLoadingFrame(): Boolean = gdk_pixbuf_animation_iter_on_currently_loading_frame(this.raw)

end PixbufAnimationIter

object PixbufAnimationIter:
end PixbufAnimationIter
