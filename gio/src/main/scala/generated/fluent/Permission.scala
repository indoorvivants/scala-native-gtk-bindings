package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GPermission
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object

class Permission(raw: Ptr[GPermission]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def acquire(cancellable: Cancellable): Boolean = g_permission_acquire(
    this.raw.asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  def acquireAsync(
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_permission_acquire_async(
    this.raw.asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def acquireFinish(result: AsyncResult): Boolean = g_permission_acquire_finish(
    this.raw.asInstanceOf,
    result.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  def getAllowed(): Boolean =
    g_permission_get_allowed(this.raw.asInstanceOf).value.!=(0)

  def getCanAcquire(): Boolean =
    g_permission_get_can_acquire(this.raw.asInstanceOf).value.!=(0)

  def getCanRelease(): Boolean =
    g_permission_get_can_release(this.raw.asInstanceOf).value.!=(0)

  def implUpdate(
      allowed: Boolean,
      can_acquire: Boolean,
      can_release: Boolean
  ): Unit = g_permission_impl_update(
    this.raw.asInstanceOf,
    allowed,
    can_acquire,
    can_release
  )

  def release(cancellable: Cancellable): Boolean = g_permission_release(
    this.raw.asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  def releaseAsync(
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_permission_release_async(
    this.raw.asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def releaseFinish(result: AsyncResult): Boolean = g_permission_release_finish(
    this.raw.asInstanceOf,
    result.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

end Permission
