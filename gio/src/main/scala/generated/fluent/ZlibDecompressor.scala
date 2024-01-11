package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class ZlibDecompressor(private[fluent] val raw: Ptr[GZlibDecompressor]) extends GObject.Object, Converter:
  def getFileInfo(): sn.gnome.gio.fluent.FileInfo = g_zlib_decompressor_get_file_info(this.raw)

end ZlibDecompressor

object ZlibDecompressor:
  def apply(format : GZlibCompressorFormat): ZlibDecompressor = ZlibDecompressor(g_zlib_decompressor_new(format))

end ZlibDecompressor
