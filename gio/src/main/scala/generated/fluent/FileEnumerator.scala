package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class FileEnumerator(private[fluent] val raw: Ptr[GFileEnumerator]) extends GObject.Object:
  def close(cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_file_enumerator_close(this.raw, cancellable.raw)

  def closeAsync(io_priority : Int, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_file_enumerator_close_async(this.raw, io_priority, cancellable.raw, callback, user_data)

  def closeFinish(result : sn.gnome.gio.fluent.AsyncResult): Boolean = g_file_enumerator_close_finish(this.raw, result.raw)

  def getChild(info : sn.gnome.gio.fluent.FileInfo): sn.gnome.gio.fluent.File = g_file_enumerator_get_child(this.raw, info.raw)

  def getContainer(): sn.gnome.gio.fluent.File = g_file_enumerator_get_container(this.raw)

  def hasPending(): Boolean = g_file_enumerator_has_pending(this.raw)

  def isClosed(): Boolean = g_file_enumerator_is_closed(this.raw)

  def iterate(out_info : sn.gnome.gio.fluent.FileInfo, out_child : sn.gnome.gio.fluent.File, cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_file_enumerator_iterate(this.raw, out_info.raw, out_child.raw, cancellable.raw)

  def nextFile(cancellable : sn.gnome.gio.fluent.Cancellable): sn.gnome.gio.fluent.FileInfo = g_file_enumerator_next_file(this.raw, cancellable.raw)

  def nextFilesAsync(num_files : Int, io_priority : Int, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_file_enumerator_next_files_async(this.raw, num_files, io_priority, cancellable.raw, callback, user_data)

  def nextFilesFinish(result : sn.gnome.gio.fluent.AsyncResult): Any /* Some(GLib.List): GList**/ = g_file_enumerator_next_files_finish(this.raw, result.raw)

  def setPending(pending : Boolean): Unit = g_file_enumerator_set_pending(this.raw, pending)

end FileEnumerator

