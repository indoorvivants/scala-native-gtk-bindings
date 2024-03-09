package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.fluent.TypePlugin
import sn.gnome.gobject.internal.GEnumValue
import sn.gnome.gobject.internal.GFlagsValue
import sn.gnome.gobject.internal.GInterfaceInfo
import sn.gnome.gobject.internal.GType
import sn.gnome.gobject.internal.GTypeFlags
import sn.gnome.gobject.internal.GTypeInfo
import sn.gnome.gobject.internal.GTypeModule

class TypeModule(raw: Ptr[GTypeModule])
    extends Object(raw.asInstanceOf),
      TypePlugin:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addInterface(
      instance_type: GType,
      interface_type: GType,
      interface_info: Ptr[GInterfaceInfo]
  ): Unit = g_type_module_add_interface(
    this.raw.asInstanceOf,
    instance_type,
    interface_type,
    interface_info
  )

  def registerEnum(
      name: String | CString,
      const_static_values: Ptr[GEnumValue]
  )(using Zone): GType = g_type_module_register_enum(
    this.raw.asInstanceOf,
    __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
    const_static_values
  )

  def registerFlags(
      name: String | CString,
      const_static_values: Ptr[GFlagsValue]
  )(using Zone): GType = g_type_module_register_flags(
    this.raw.asInstanceOf,
    __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
    const_static_values
  )

  def registerType(
      parent_type: GType,
      type_name: String | CString,
      type_info: Ptr[GTypeInfo],
      flags: GTypeFlags
  )(using Zone): GType = g_type_module_register_type(
    this.raw.asInstanceOf,
    parent_type,
    __sn_extract_string(type_name).asInstanceOf[Ptr[gchar]],
    type_info,
    flags
  )

  def setName(name: String | CString)(using Zone): Unit =
    g_type_module_set_name(
      this.raw.asInstanceOf,
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]]
    )

  def unuse(): Unit = g_type_module_unuse(this.raw.asInstanceOf)

  def use(): Boolean = g_type_module_use(this.raw.asInstanceOf).value.!=(0)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end TypeModule
