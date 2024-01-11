package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class Permission(private[fluent] val raw: Ptr[GPermission]) extends GObject.Object:
  def acquire(cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_permission_acquire(this.raw, cancellable.raw)

  def acquireAsync(cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_permission_acquire_async(this.raw, cancellable.raw, callback, user_data)

  def acquireFinish(result : sn.gnome.gio.fluent.AsyncResult): Boolean = g_permission_acquire_finish(this.raw, result.raw)

  def getAllowed(): Boolean = g_permission_get_allowed(this.raw)

  def getCanAcquire(): Boolean = g_permission_get_can_acquire(this.raw)

  def getCanRelease(): Boolean = g_permission_get_can_release(this.raw)

  def implUpdate(allowed : Boolean, can_acquire : Boolean, can_release : Boolean): Unit = g_permission_impl_update(this.raw, allowed, can_acquire, can_release)

  def release(cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_permission_release(this.raw, cancellable.raw)

  def releaseAsync(cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_permission_release_async(this.raw, cancellable.raw, callback, user_data)

  def releaseFinish(result : sn.gnome.gio.fluent.AsyncResult): Boolean = g_permission_release_finish(this.raw, result.raw)

end Permission

