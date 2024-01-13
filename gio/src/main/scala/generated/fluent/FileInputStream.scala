package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.FileInfo
import sn.gnome.gio.fluent.InputStream
import sn.gnome.gio.fluent.Seekable
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.glib.internal.gpointer

class FileInputStream(raw: Ptr[GFileInputStream]) extends InputStream(raw.asInstanceOf), Seekable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def queryInfo(attributes : String | CString, cancellable : Cancellable)(using Zone): FileInfo = new FileInfo(g_file_input_stream_query_info(this.raw.asInstanceOf, __sn_extract_string(attributes), cancellable.getUnsafeRawPointer().asInstanceOf).asInstanceOf)

  def queryInfoAsync(attributes : String | CString, io_priority : Int, cancellable : Cancellable, callback : GAsyncReadyCallback, user_data : Ptr[Byte])(using Zone): Unit = g_file_input_stream_query_info_async(this.raw.asInstanceOf, __sn_extract_string(attributes), io_priority, cancellable.getUnsafeRawPointer().asInstanceOf, callback, gpointer(user_data))

  def queryInfoFinish(result : AsyncResult): FileInfo = new FileInfo(g_file_input_stream_query_info_finish(this.raw.asInstanceOf, result.getUnsafeRawPointer().asInstanceOf).asInstanceOf)


  private inline def __sn_extract_string(str: String | CString)(using Zone): CString = 
    str match
      case s: String => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end FileInputStream
