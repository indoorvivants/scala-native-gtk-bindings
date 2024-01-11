package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class FileOutputStream(private[fluent] val raw: Ptr[GFileOutputStream]) extends OutputStream, Seekable:
  def getEtag(): Any /* Some(utf8): char**/ = g_file_output_stream_get_etag(this.raw)

  def queryInfo(attributes : String, cancellable : sn.gnome.gio.fluent.Cancellable): sn.gnome.gio.fluent.FileInfo = g_file_output_stream_query_info(this.raw, attributes, cancellable.raw)

  def queryInfoAsync(attributes : String, io_priority : Int, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_file_output_stream_query_info_async(this.raw, attributes, io_priority, cancellable.raw, callback, user_data)

  def queryInfoFinish(result : sn.gnome.gio.fluent.AsyncResult): sn.gnome.gio.fluent.FileInfo = g_file_output_stream_query_info_finish(this.raw, result.raw)

end FileOutputStream

