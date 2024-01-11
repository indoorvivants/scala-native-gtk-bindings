package sn.gnome.gdkpixbuf.fluent

import sn.gnome.gdkpixbuf.internal.*

class PixbufLoader(private[fluent] val raw: Ptr[GdkPixbufLoader]) extends GObject.Object:
  def close(): Boolean = gdk_pixbuf_loader_close(this.raw)

  def getAnimation(): sn.gnome.gdkpixbuf.fluent.PixbufAnimation = gdk_pixbuf_loader_get_animation(this.raw)

  def getFormat(): Any /* Some(PixbufFormat): GdkPixbufFormat**/ = gdk_pixbuf_loader_get_format(this.raw)

  def getPixbuf(): sn.gnome.gdkpixbuf.fluent.Pixbuf = gdk_pixbuf_loader_get_pixbuf(this.raw)

  def setSize(width : Int, height : Int): Unit = gdk_pixbuf_loader_set_size(this.raw, width, height)

  def write(buf : Array[Byte], count : Any /* Some(gsize): gsize*/): Boolean = gdk_pixbuf_loader_write(this.raw, buf, count)

  def writeBytes(buffer : Any /* Some(GLib.Bytes): GBytes**/): Boolean = gdk_pixbuf_loader_write_bytes(this.raw, buffer)

end PixbufLoader

object PixbufLoader:
  def apply(): PixbufLoader = PixbufLoader(gdk_pixbuf_loader_new())

  def withMimeType(mime_type : String): PixbufLoader = PixbufLoader(gdk_pixbuf_loader_new_with_mime_type(mime_type))

  def withType(image_type : String): PixbufLoader = PixbufLoader(gdk_pixbuf_loader_new_with_type(image_type))

end PixbufLoader
