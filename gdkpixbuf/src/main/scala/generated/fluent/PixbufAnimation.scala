package sn.gnome.gdkpixbuf.fluent

import sn.gnome.gdkpixbuf.internal.*

class PixbufAnimation(private[fluent] val raw: Ptr[GdkPixbufAnimation]) extends GObject.Object:
  def getHeight(): Int = gdk_pixbuf_animation_get_height(this.raw)

  def getIter(start_time : Any /* Some(GLib.TimeVal): const GTimeVal**/): sn.gnome.gdkpixbuf.fluent.PixbufAnimationIter = gdk_pixbuf_animation_get_iter(this.raw, start_time)

  def getStaticImage(): sn.gnome.gdkpixbuf.fluent.Pixbuf = gdk_pixbuf_animation_get_static_image(this.raw)

  def getWidth(): Int = gdk_pixbuf_animation_get_width(this.raw)

  def isStaticImage(): Boolean = gdk_pixbuf_animation_is_static_image(this.raw)

  def ref(): sn.gnome.gdkpixbuf.fluent.PixbufAnimation = gdk_pixbuf_animation_ref(this.raw)

  def unref(): Unit = gdk_pixbuf_animation_unref(this.raw)

end PixbufAnimation

object PixbufAnimation:
  def fromFile(filename : String): PixbufAnimation = PixbufAnimation(gdk_pixbuf_animation_new_from_file(filename))

  def fromResource(resource_path : String): PixbufAnimation = PixbufAnimation(gdk_pixbuf_animation_new_from_resource(resource_path))

  def fromStream(stream : sn.gnome.gio.fluent.InputStream, cancellable : sn.gnome.gio.fluent.Cancellable): PixbufAnimation = PixbufAnimation(gdk_pixbuf_animation_new_from_stream(stream.raw, cancellable.raw))

  def fromStreamFinish(async_result : sn.gnome.gio.fluent.AsyncResult): PixbufAnimation = PixbufAnimation(gdk_pixbuf_animation_new_from_stream_finish(async_result.raw))

end PixbufAnimation
