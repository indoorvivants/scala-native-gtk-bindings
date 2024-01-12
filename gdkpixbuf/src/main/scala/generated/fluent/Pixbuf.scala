package sn.gnome.gdkpixbuf.fluent

import _root_.sn.gnome.gdkpixbuf.internal.*

import _root_.scala.scalanative.unsafe.*

class Pixbuf(private[fluent] val raw: Ptr[GdkPixbuf]) extends sn.gnome.gobject.fluent.Object, sn.gnome.gio.fluent.Icon, sn.gnome.gio.fluent.LoadableIcon:
  def addAlpha(substitute_color : Boolean, r : UByte, g : UByte, b : UByte): sn.gnome.gdkpixbuf.fluent.Pixbuf = gdk_pixbuf_add_alpha(this.raw, substitute_color, r, g, b)

  def applyEmbeddedOrientation(): sn.gnome.gdkpixbuf.fluent.Pixbuf = gdk_pixbuf_apply_embedded_orientation(this.raw)

  def composite(dest : sn.gnome.gdkpixbuf.fluent.Pixbuf, dest_x : Int, dest_y : Int, dest_width : Int, dest_height : Int, offset_x : Double, offset_y : Double, scale_x : Double, scale_y : Double, interp_type : GdkInterpType, overall_alpha : Int): Unit = gdk_pixbuf_composite(this.raw, dest.raw, dest_x, dest_y, dest_width, dest_height, offset_x, offset_y, scale_x, scale_y, interp_type, overall_alpha)

  def compositeColor(dest : sn.gnome.gdkpixbuf.fluent.Pixbuf, dest_x : Int, dest_y : Int, dest_width : Int, dest_height : Int, offset_x : Double, offset_y : Double, scale_x : Double, scale_y : Double, interp_type : GdkInterpType, overall_alpha : Int, check_x : Int, check_y : Int, check_size : Int, color1 : UInt, color2 : UInt): Unit = gdk_pixbuf_composite_color(this.raw, dest.raw, dest_x, dest_y, dest_width, dest_height, offset_x, offset_y, scale_x, scale_y, interp_type, overall_alpha, check_x, check_y, check_size, color1, color2)

  def compositeColorSimple(dest_width : Int, dest_height : Int, interp_type : GdkInterpType, overall_alpha : Int, check_size : Int, color1 : UInt, color2 : UInt): sn.gnome.gdkpixbuf.fluent.Pixbuf = gdk_pixbuf_composite_color_simple(this.raw, dest_width, dest_height, interp_type, overall_alpha, check_size, color1, color2)

  def copy(): sn.gnome.gdkpixbuf.fluent.Pixbuf = gdk_pixbuf_copy(this.raw)

  def copyArea(src_x : Int, src_y : Int, width : Int, height : Int, dest_pixbuf : sn.gnome.gdkpixbuf.fluent.Pixbuf, dest_x : Int, dest_y : Int): Unit = gdk_pixbuf_copy_area(this.raw, src_x, src_y, width, height, dest_pixbuf.raw, dest_x, dest_y)

  def copyOptions(dest_pixbuf : sn.gnome.gdkpixbuf.fluent.Pixbuf): Boolean = gdk_pixbuf_copy_options(this.raw, dest_pixbuf.raw)

  def fill(pixel : UInt): Unit = gdk_pixbuf_fill(this.raw, pixel)

  def flip(horizontal : Boolean): sn.gnome.gdkpixbuf.fluent.Pixbuf = gdk_pixbuf_flip(this.raw, horizontal)

  def getBitsPerSample(): Int = gdk_pixbuf_get_bits_per_sample(this.raw)

  def getByteLength(): Any /* Some(gsize): gsize*/ = gdk_pixbuf_get_byte_length(this.raw)

  def getColorspace(): GdkColorspace = gdk_pixbuf_get_colorspace(this.raw)

  def getHasAlpha(): Boolean = gdk_pixbuf_get_has_alpha(this.raw)

  def getHeight(): Int = gdk_pixbuf_get_height(this.raw)

  def getNChannels(): Int = gdk_pixbuf_get_n_channels(this.raw)

  def getOption(key : String): String = gdk_pixbuf_get_option(this.raw, key)

  def getOptions(): Any /* Some(GLib.HashTable): GHashTable**/ = gdk_pixbuf_get_options(this.raw)

  def getPixels(): Array[Byte] = gdk_pixbuf_get_pixels(this.raw)

  def getPixelsWithLength(length : Any /* Some(guint): guint**/): Array[Byte] = gdk_pixbuf_get_pixels_with_length(this.raw, length)

  def getRowstride(): Int = gdk_pixbuf_get_rowstride(this.raw)

  def getWidth(): Int = gdk_pixbuf_get_width(this.raw)

  def newSubpixbuf(src_x : Int, src_y : Int, width : Int, height : Int): sn.gnome.gdkpixbuf.fluent.Pixbuf = gdk_pixbuf_new_subpixbuf(this.raw, src_x, src_y, width, height)

  def readPixelBytes(): Any /* Some(GLib.Bytes): GBytes**/ = gdk_pixbuf_read_pixel_bytes(this.raw)

  def readPixels(): Any /* Some(guint8): const guint8**/ = gdk_pixbuf_read_pixels(this.raw)

  def ref(): sn.gnome.gdkpixbuf.fluent.Pixbuf = gdk_pixbuf_ref(this.raw)

  def removeOption(key : String): Boolean = gdk_pixbuf_remove_option(this.raw, key)

  def rotateSimple(angle : GdkPixbufRotation): sn.gnome.gdkpixbuf.fluent.Pixbuf = gdk_pixbuf_rotate_simple(this.raw, angle)

  def saturateAndPixelate(dest : sn.gnome.gdkpixbuf.fluent.Pixbuf, saturation : Float, pixelate : Boolean): Unit = gdk_pixbuf_saturate_and_pixelate(this.raw, dest.raw, saturation, pixelate)

  def saveToBufferv(buffer : Array[Byte], buffer_size : Any /* Some(gsize): gsize**/, `type` : String, option_keys : Array[Byte], option_values : Array[Byte]): Boolean = gdk_pixbuf_save_to_bufferv(this.raw, buffer, buffer_size, `type`, option_keys, option_values)

  def saveToCallbackv(save_func : Any /* Some(PixbufSaveFunc): GdkPixbufSaveFunc*/, user_data : Ptr[Byte], `type` : String, option_keys : Array[Byte], option_values : Array[Byte]): Boolean = gdk_pixbuf_save_to_callbackv(this.raw, save_func, user_data, `type`, option_keys, option_values)

  def saveToStreamv(stream : sn.gnome.gio.fluent.OutputStream, `type` : String, option_keys : Array[Byte], option_values : Array[Byte], cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = gdk_pixbuf_save_to_streamv(this.raw, stream.raw, `type`, option_keys, option_values, cancellable.raw)

  def saveToStreamvAsync(stream : sn.gnome.gio.fluent.OutputStream, `type` : String, option_keys : Array[Byte], option_values : Array[Byte], cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(Gio.AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = gdk_pixbuf_save_to_streamv_async(this.raw, stream.raw, `type`, option_keys, option_values, cancellable.raw, callback, user_data)

  def savev(filename : String, `type` : String, option_keys : Array[Byte], option_values : Array[Byte]): Boolean = gdk_pixbuf_savev(this.raw, filename, `type`, option_keys, option_values)

  def scale(dest : sn.gnome.gdkpixbuf.fluent.Pixbuf, dest_x : Int, dest_y : Int, dest_width : Int, dest_height : Int, offset_x : Double, offset_y : Double, scale_x : Double, scale_y : Double, interp_type : GdkInterpType): Unit = gdk_pixbuf_scale(this.raw, dest.raw, dest_x, dest_y, dest_width, dest_height, offset_x, offset_y, scale_x, scale_y, interp_type)

  def scaleSimple(dest_width : Int, dest_height : Int, interp_type : GdkInterpType): sn.gnome.gdkpixbuf.fluent.Pixbuf = gdk_pixbuf_scale_simple(this.raw, dest_width, dest_height, interp_type)

  def setOption(key : String, value : String): Boolean = gdk_pixbuf_set_option(this.raw, key, value)

  def unref(): Unit = gdk_pixbuf_unref(this.raw)

end Pixbuf

object Pixbuf:
  def apply(colorspace : GdkColorspace, has_alpha : Boolean, bits_per_sample : Int, width : Int, height : Int): Pixbuf = Pixbuf(gdk_pixbuf_new(colorspace, has_alpha, bits_per_sample, width, height))

  def fromBytes(data : Any /* Some(GLib.Bytes): GBytes**/, colorspace : GdkColorspace, has_alpha : Boolean, bits_per_sample : Int, width : Int, height : Int, rowstride : Int): Pixbuf = Pixbuf(gdk_pixbuf_new_from_bytes(data, colorspace, has_alpha, bits_per_sample, width, height, rowstride))

  def fromData(data : Array[Byte], colorspace : GdkColorspace, has_alpha : Boolean, bits_per_sample : Int, width : Int, height : Int, rowstride : Int, destroy_fn : Any /* Some(PixbufDestroyNotify): GdkPixbufDestroyNotify*/, destroy_fn_data : Ptr[Byte]): Pixbuf = Pixbuf(gdk_pixbuf_new_from_data(data, colorspace, has_alpha, bits_per_sample, width, height, rowstride, destroy_fn, destroy_fn_data))

  def fromFile(filename : String): Pixbuf = Pixbuf(gdk_pixbuf_new_from_file(filename))

  def fromFileAtScale(filename : String, width : Int, height : Int, preserve_aspect_ratio : Boolean): Pixbuf = Pixbuf(gdk_pixbuf_new_from_file_at_scale(filename, width, height, preserve_aspect_ratio))

  def fromFileAtSize(filename : String, width : Int, height : Int): Pixbuf = Pixbuf(gdk_pixbuf_new_from_file_at_size(filename, width, height))

  def fromInline(data_length : Int, data : Array[Byte], copy_pixels : Boolean): Pixbuf = Pixbuf(gdk_pixbuf_new_from_inline(data_length, data, copy_pixels))

  def fromResource(resource_path : String): Pixbuf = Pixbuf(gdk_pixbuf_new_from_resource(resource_path))

  def fromResourceAtScale(resource_path : String, width : Int, height : Int, preserve_aspect_ratio : Boolean): Pixbuf = Pixbuf(gdk_pixbuf_new_from_resource_at_scale(resource_path, width, height, preserve_aspect_ratio))

  def fromStream(stream : sn.gnome.gio.fluent.InputStream, cancellable : sn.gnome.gio.fluent.Cancellable): Pixbuf = Pixbuf(gdk_pixbuf_new_from_stream(stream.raw, cancellable.raw))

  def fromStreamAtScale(stream : sn.gnome.gio.fluent.InputStream, width : Int, height : Int, preserve_aspect_ratio : Boolean, cancellable : sn.gnome.gio.fluent.Cancellable): Pixbuf = Pixbuf(gdk_pixbuf_new_from_stream_at_scale(stream.raw, width, height, preserve_aspect_ratio, cancellable.raw))

  def fromStreamFinish(async_result : sn.gnome.gio.fluent.AsyncResult): Pixbuf = Pixbuf(gdk_pixbuf_new_from_stream_finish(async_result.raw))

  def fromXpmData(data : Array[Byte]): Pixbuf = Pixbuf(gdk_pixbuf_new_from_xpm_data(data))

end Pixbuf
