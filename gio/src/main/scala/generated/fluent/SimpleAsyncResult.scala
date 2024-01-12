package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class SimpleAsyncResult(private[fluent] val raw: Ptr[GSimpleAsyncResult]) extends sn.gnome.gobject.fluent.Object, sn.gnome.gio.fluent.AsyncResult:
  def complete(): Unit = g_simple_async_result_complete(this.raw)

  def completeInIdle(): Unit = g_simple_async_result_complete_in_idle(this.raw)

  def getOpResGboolean(): Boolean = g_simple_async_result_get_op_res_gboolean(this.raw)

  def getOpResGpointer(): Ptr[Byte] = g_simple_async_result_get_op_res_gpointer(this.raw)

  def getOpResGssize(): Any /* Some(gssize): gssize*/ = g_simple_async_result_get_op_res_gssize(this.raw)

  def getSourceTag(): Ptr[Byte] = g_simple_async_result_get_source_tag(this.raw)

  def propagateError(): Boolean = g_simple_async_result_propagate_error(this.raw)

  def runInThread(func : Any /* Some(SimpleAsyncThreadFunc): GSimpleAsyncThreadFunc*/, io_priority : Int, cancellable : sn.gnome.gio.fluent.Cancellable): Unit = g_simple_async_result_run_in_thread(this.raw, func, io_priority, cancellable.raw)

  def setCheckCancellable(check_cancellable : sn.gnome.gio.fluent.Cancellable): Unit = g_simple_async_result_set_check_cancellable(this.raw, check_cancellable.raw)

  def setErrorVa(domain : Any /* Some(GLib.Quark): GQuark*/, code : Int, format : String, args : Any /* Some(va_list): va_list*/): Unit = g_simple_async_result_set_error_va(this.raw, domain, code, format, args)

  def setFromError(error : Any /* Some(GLib.Error): const GError**/): Unit = g_simple_async_result_set_from_error(this.raw, error)

  def setHandleCancellation(handle_cancellation : Boolean): Unit = g_simple_async_result_set_handle_cancellation(this.raw, handle_cancellation)

  def setOpResGboolean(op_res : Boolean): Unit = g_simple_async_result_set_op_res_gboolean(this.raw, op_res)

  def setOpResGpointer(op_res : Ptr[Byte], destroy_op_res : Any /* Some(GLib.DestroyNotify): GDestroyNotify*/): Unit = g_simple_async_result_set_op_res_gpointer(this.raw, op_res, destroy_op_res)

  def setOpResGssize(op_res : Any /* Some(gssize): gssize*/): Unit = g_simple_async_result_set_op_res_gssize(this.raw, op_res)

  def takeError(error : Any /* Some(GLib.Error): GError**/): Unit = g_simple_async_result_take_error(this.raw, error)

end SimpleAsyncResult

object SimpleAsyncResult:
  def apply(source_object : sn.gnome.gobject.fluent.Object, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte], source_tag : Ptr[Byte]): SimpleAsyncResult = SimpleAsyncResult(g_simple_async_result_new(source_object.raw, callback, user_data, source_tag))

