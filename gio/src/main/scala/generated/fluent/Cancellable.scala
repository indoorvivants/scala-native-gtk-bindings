package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class Cancellable(private[fluent] val raw: Ptr[GCancellable]) extends GObject.Object:
  def cancel(): Unit = g_cancellable_cancel(this.raw)

  def connect(callback : Any /* Some(GObject.Callback): GCallback*/, data : Ptr[Byte], data_destroy_func : Any /* Some(GLib.DestroyNotify): GDestroyNotify*/): ULong = g_cancellable_connect(this.raw, callback, data, data_destroy_func)

  def disconnect(handler_id : ULong): Unit = g_cancellable_disconnect(this.raw, handler_id)

  def getFd(): Int = g_cancellable_get_fd(this.raw)

  def isCancelled(): Boolean = g_cancellable_is_cancelled(this.raw)

  def makePollfd(pollfd : Any /* Some(GLib.PollFD): GPollFD**/): Boolean = g_cancellable_make_pollfd(this.raw, pollfd)

  def popCurrent(): Unit = g_cancellable_pop_current(this.raw)

  def pushCurrent(): Unit = g_cancellable_push_current(this.raw)

  def releaseFd(): Unit = g_cancellable_release_fd(this.raw)

  def reset(): Unit = g_cancellable_reset(this.raw)

  def setErrorIfCancelled(): Boolean = g_cancellable_set_error_if_cancelled(this.raw)

  def sourceNew(): Any /* Some(GLib.Source): GSource**/ = g_cancellable_source_new(this.raw)

end Cancellable

object Cancellable:
  def apply(): Cancellable = Cancellable(g_cancellable_new())

end Cancellable
