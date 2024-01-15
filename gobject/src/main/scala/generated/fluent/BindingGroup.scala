package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GBindingFlags
import sn.gnome.gobject.internal.GBindingTransformFunc
import sn.gnome.gobject.internal.GClosure

class BindingGroup(raw: Ptr[GBindingGroup]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def bind(
      source_property: String | CString,
      target: Object,
      target_property: String | CString,
      flags: GBindingFlags
  )(using Zone): Unit = g_binding_group_bind(
    this.raw.asInstanceOf,
    __sn_extract_string(source_property).asInstanceOf[Ptr[gchar]],
    gpointer(target.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]),
    __sn_extract_string(target_property).asInstanceOf[Ptr[gchar]],
    flags
  )

  def bindFull(
      source_property: String | CString,
      target: Object,
      target_property: String | CString,
      flags: GBindingFlags,
      transform_to: GBindingTransformFunc,
      transform_from: GBindingTransformFunc,
      user_data: Ptr[Byte],
      user_data_destroy: GDestroyNotify
  )(using Zone): Unit = g_binding_group_bind_full(
    this.raw.asInstanceOf,
    __sn_extract_string(source_property).asInstanceOf[Ptr[gchar]],
    gpointer(target.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]),
    __sn_extract_string(target_property).asInstanceOf[Ptr[gchar]],
    flags,
    transform_to,
    transform_from,
    gpointer(user_data),
    user_data_destroy
  )

  def bindWithClosures(
      source_property: String | CString,
      target: Object,
      target_property: String | CString,
      flags: GBindingFlags,
      transform_to: Ptr[GClosure],
      transform_from: Ptr[GClosure]
  )(using Zone): Unit = g_binding_group_bind_with_closures(
    this.raw.asInstanceOf,
    __sn_extract_string(source_property).asInstanceOf[Ptr[gchar]],
    gpointer(target.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]),
    __sn_extract_string(target_property).asInstanceOf[Ptr[gchar]],
    flags,
    transform_to,
    transform_from
  )

  def dupSource(): Object = new Object(
    g_binding_group_dup_source(this.raw.asInstanceOf).asInstanceOf
  )

  def setSource(source: Object): Unit = g_binding_group_set_source(
    this.raw.asInstanceOf,
    gpointer(source.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]])
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end BindingGroup

object BindingGroup:
  def apply(): BindingGroup = new BindingGroup(
    g_binding_group_new().asInstanceOf
  )
end BindingGroup
