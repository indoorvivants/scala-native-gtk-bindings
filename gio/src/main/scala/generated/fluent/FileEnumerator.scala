package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.File
import sn.gnome.gio.fluent.FileInfo
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.glib.internal.GList
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object

class FileEnumerator(raw: Ptr[GFileEnumerator]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def close(cancellable : Cancellable): Boolean = g_file_enumerator_close(this.raw.asInstanceOf, cancellable.getUnsafeRawPointer().asInstanceOf).value.!=(0)

  def closeAsync(io_priority : Int, cancellable : Cancellable, callback : GAsyncReadyCallback, user_data : Ptr[Byte]): Unit = g_file_enumerator_close_async(this.raw.asInstanceOf, io_priority, cancellable.getUnsafeRawPointer().asInstanceOf, callback, gpointer(user_data))

  def closeFinish(result : AsyncResult): Boolean = g_file_enumerator_close_finish(this.raw.asInstanceOf, result.getUnsafeRawPointer().asInstanceOf).value.!=(0)

  def getChild(info : FileInfo): File = g_file_enumerator_get_child(this.raw.asInstanceOf, info.getUnsafeRawPointer().asInstanceOf)

  def getContainer(): File = g_file_enumerator_get_container(this.raw.asInstanceOf)

  def hasPending(): Boolean = g_file_enumerator_has_pending(this.raw.asInstanceOf).value.!=(0)

  def isClosed(): Boolean = g_file_enumerator_is_closed(this.raw.asInstanceOf).value.!=(0)

  def iterate(out_info : FileInfo, out_child : File, cancellable : Cancellable): Boolean = g_file_enumerator_iterate(this.raw.asInstanceOf, out_info.getUnsafeRawPointer().asInstanceOf, out_child.getUnsafeRawPointer().asInstanceOf, cancellable.getUnsafeRawPointer().asInstanceOf).value.!=(0)

  def nextFile(cancellable : Cancellable): FileInfo = new FileInfo(g_file_enumerator_next_file(this.raw.asInstanceOf, cancellable.getUnsafeRawPointer().asInstanceOf).asInstanceOf)

  def nextFilesAsync(num_files : Int, io_priority : Int, cancellable : Cancellable, callback : GAsyncReadyCallback, user_data : Ptr[Byte]): Unit = g_file_enumerator_next_files_async(this.raw.asInstanceOf, num_files, io_priority, cancellable.getUnsafeRawPointer().asInstanceOf, callback, gpointer(user_data))

  def nextFilesFinish(result : AsyncResult): Ptr[GList] = g_file_enumerator_next_files_finish(this.raw.asInstanceOf, result.getUnsafeRawPointer().asInstanceOf)

  def setPending(pending : Boolean): Unit = g_file_enumerator_set_pending(this.raw.asInstanceOf, pending)

end FileEnumerator
