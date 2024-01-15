package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GBindingFlags

class Binding(raw: Ptr[GBinding]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def dupSource(): Object = new Object(
    g_binding_dup_source(this.raw.asInstanceOf).asInstanceOf
  )

  def dupTarget(): Object = new Object(
    g_binding_dup_target(this.raw.asInstanceOf).asInstanceOf
  )

  def getFlags(): GBindingFlags = g_binding_get_flags(this.raw.asInstanceOf)

  def getSource(): Object = new Object(
    g_binding_get_source(this.raw.asInstanceOf).asInstanceOf
  )

  def getSourceProperty()(using Zone): String = fromCString(
    g_binding_get_source_property(this.raw.asInstanceOf).asInstanceOf
  )

  def getTarget(): Object = new Object(
    g_binding_get_target(this.raw.asInstanceOf).asInstanceOf
  )

  def getTargetProperty()(using Zone): String = fromCString(
    g_binding_get_target_property(this.raw.asInstanceOf).asInstanceOf
  )

  def unbind(): Unit = g_binding_unbind(this.raw.asInstanceOf)

end Binding
