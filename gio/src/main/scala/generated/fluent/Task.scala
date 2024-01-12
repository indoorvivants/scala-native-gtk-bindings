package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class Task(private[fluent] val raw: Ptr[GTask]) extends sn.gnome.gobject.fluent.Object, sn.gnome.gio.fluent.AsyncResult:
  def attachSource(source : Any /* Some(GLib.Source): GSource**/, callback : Any /* Some(GLib.SourceFunc): GSourceFunc*/): Unit = g_task_attach_source(this.raw, source, callback)

  def getCancellable(): sn.gnome.gio.fluent.Cancellable = g_task_get_cancellable(this.raw)

  def getCheckCancellable(): Boolean = g_task_get_check_cancellable(this.raw)

  def getCompleted(): Boolean = g_task_get_completed(this.raw)

  def getContext(): Any /* Some(GLib.MainContext): GMainContext**/ = g_task_get_context(this.raw)

  def getName(): String = g_task_get_name(this.raw)

  def getPriority(): Int = g_task_get_priority(this.raw)

  def getReturnOnCancel(): Boolean = g_task_get_return_on_cancel(this.raw)

  def getSourceObject(): sn.gnome.gobject.fluent.Object = g_task_get_source_object(this.raw)

  def getSourceTag(): Ptr[Byte] = g_task_get_source_tag(this.raw)

  def getTaskData(): Ptr[Byte] = g_task_get_task_data(this.raw)

  def hadError(): Boolean = g_task_had_error(this.raw)

  def propagateBoolean(): Boolean = g_task_propagate_boolean(this.raw)

  def propagateInt(): Any /* Some(gssize): gssize*/ = g_task_propagate_int(this.raw)

  def propagatePointer(): Ptr[Byte] = g_task_propagate_pointer(this.raw)

  def propagateValue(value : Any /* Some(GObject.Value): GValue**/): Boolean = g_task_propagate_value(this.raw, value)

  def returnBoolean(result : Boolean): Unit = g_task_return_boolean(this.raw, result)

  def returnError(error : Any /* Some(GLib.Error): GError**/): Unit = g_task_return_error(this.raw, error)

  def returnErrorIfCancelled(): Boolean = g_task_return_error_if_cancelled(this.raw)

  def returnInt(result : Any /* Some(gssize): gssize*/): Unit = g_task_return_int(this.raw, result)

  def returnPointer(result : Ptr[Byte], result_destroy : Any /* Some(GLib.DestroyNotify): GDestroyNotify*/): Unit = g_task_return_pointer(this.raw, result, result_destroy)

  def returnValue(result : Any /* Some(GObject.Value): GValue**/): Unit = g_task_return_value(this.raw, result)

  def runInThread(task_func : Any /* Some(TaskThreadFunc): GTaskThreadFunc*/): Unit = g_task_run_in_thread(this.raw, task_func)

  def runInThreadSync(task_func : Any /* Some(TaskThreadFunc): GTaskThreadFunc*/): Unit = g_task_run_in_thread_sync(this.raw, task_func)

  def setCheckCancellable(check_cancellable : Boolean): Unit = g_task_set_check_cancellable(this.raw, check_cancellable)

  def setName(name : String): Unit = g_task_set_name(this.raw, name)

  def setPriority(priority : Int): Unit = g_task_set_priority(this.raw, priority)

  def setReturnOnCancel(return_on_cancel : Boolean): Boolean = g_task_set_return_on_cancel(this.raw, return_on_cancel)

  def setSourceTag(source_tag : Ptr[Byte]): Unit = g_task_set_source_tag(this.raw, source_tag)

  def setStaticName(name : String): Unit = g_task_set_static_name(this.raw, name)

  def setTaskData(task_data : Ptr[Byte], task_data_destroy : Any /* Some(GLib.DestroyNotify): GDestroyNotify*/): Unit = g_task_set_task_data(this.raw, task_data, task_data_destroy)

end Task

object Task:
  def apply(source_object : sn.gnome.gobject.fluent.Object, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, callback_data : Ptr[Byte]): Task = Task(g_task_new(source_object.raw, cancellable.raw, callback, callback_data))

end Task
