package sn.gnome.gdkpixbuf.fluent

import _root_.sn.gnome.gdkpixbuf.internal.*

import _root_.scala.scalanative.unsafe.*

class PixbufSimpleAnim(private[fluent] val raw: Ptr[GdkPixbufSimpleAnim]) extends sn.gnome.gdkpixbuf.fluent.PixbufAnimation:
  def addFrame(pixbuf : sn.gnome.gdkpixbuf.fluent.Pixbuf): Unit = gdk_pixbuf_simple_anim_add_frame(this.raw, pixbuf.raw)

  def getLoop(): Boolean = gdk_pixbuf_simple_anim_get_loop(this.raw)

  def setLoop(loop : Boolean): Unit = gdk_pixbuf_simple_anim_set_loop(this.raw, loop)

end PixbufSimpleAnim

object PixbufSimpleAnim:
  def apply(width : Int, height : Int, rate : Float): PixbufSimpleAnim = PixbufSimpleAnim(gdk_pixbuf_simple_anim_new(width, height, rate))

end PixbufSimpleAnim
