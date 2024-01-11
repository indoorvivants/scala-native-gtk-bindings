package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class ZlibCompressor(private[fluent] val raw: Ptr[GZlibCompressor]) extends GObject.Object, Converter:
  def getFileInfo(): sn.gnome.gio.fluent.FileInfo = g_zlib_compressor_get_file_info(this.raw)

  def setFileInfo(file_info : sn.gnome.gio.fluent.FileInfo): Unit = g_zlib_compressor_set_file_info(this.raw, file_info.raw)

end ZlibCompressor

object ZlibCompressor:
  def apply(format : GZlibCompressorFormat, level : Int): ZlibCompressor = ZlibCompressor(g_zlib_compressor_new(format, level))

end ZlibCompressor
