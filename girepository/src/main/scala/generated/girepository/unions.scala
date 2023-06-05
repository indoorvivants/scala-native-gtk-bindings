package girepository
package unions

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

import _root_.girepository.enumerations.*
import _root_.girepository.aliases.*
import _root_.girepository.structs.*
import _root_.girepository.unions.*

/**
 * [bindgen] header: /usr/include/gobject-introspection-1.0/gitypes.h
*/
opaque type GIArgument = CArray[Byte, Nat._8]
object GIArgument:
  given _tag: Tag[GIArgument] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
  def apply()(using Zone): Ptr[GIArgument] = 
    val ___ptr = alloc[GIArgument](1)
    ___ptr
  @scala.annotation.targetName("apply_v_boolean")
  def apply(v_boolean: _root_.glib.all.gboolean)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.gboolean]].update(0, v_boolean)
    ___ptr
  @scala.annotation.targetName("apply_v_int8")
  def apply(v_int8: _root_.glib.all.gint8)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.gint8]].update(0, v_int8)
    ___ptr
  @scala.annotation.targetName("apply_v_uint8")
  def apply(v_uint8: _root_.glib.all.guint8)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.guint8]].update(0, v_uint8)
    ___ptr
  @scala.annotation.targetName("apply_v_int16")
  def apply(v_int16: _root_.glib.all.gint16)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.gint16]].update(0, v_int16)
    ___ptr
  @scala.annotation.targetName("apply_v_uint16")
  def apply(v_uint16: _root_.glib.all.guint16)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.guint16]].update(0, v_uint16)
    ___ptr
  @scala.annotation.targetName("apply_v_int32")
  def apply(v_int32: _root_.glib.all.gint32)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.gint32]].update(0, v_int32)
    ___ptr
  @scala.annotation.targetName("apply_v_uint32")
  def apply(v_uint32: _root_.glib.all.guint32)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.guint32]].update(0, v_uint32)
    ___ptr
  @scala.annotation.targetName("apply_v_int64")
  def apply(v_int64: _root_.glib.all.gint64)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.gint64]].update(0, v_int64)
    ___ptr
  @scala.annotation.targetName("apply_v_uint64")
  def apply(v_uint64: _root_.glib.all.guint64)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.guint64]].update(0, v_uint64)
    ___ptr
  @scala.annotation.targetName("apply_v_float")
  def apply(v_float: _root_.glib.all.gfloat)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.gfloat]].update(0, v_float)
    ___ptr
  @scala.annotation.targetName("apply_v_double")
  def apply(v_double: _root_.glib.all.gdouble)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.gdouble]].update(0, v_double)
    ___ptr
  @scala.annotation.targetName("apply_v_short")
  def apply(v_short: _root_.glib.all.gshort)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.gshort]].update(0, v_short)
    ___ptr
  @scala.annotation.targetName("apply_v_ushort")
  def apply(v_ushort: _root_.glib.all.gushort)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.gushort]].update(0, v_ushort)
    ___ptr
  @scala.annotation.targetName("apply_v_int")
  def apply(v_int: _root_.glib.all.gint)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.gint]].update(0, v_int)
    ___ptr
  @scala.annotation.targetName("apply_v_uint")
  def apply(v_uint: _root_.glib.all.guint)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.guint]].update(0, v_uint)
    ___ptr
  @scala.annotation.targetName("apply_v_long")
  def apply(v_long: _root_.glib.all.glong)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.glong]].update(0, v_long)
    ___ptr
  @scala.annotation.targetName("apply_v_ulong")
  def apply(v_ulong: _root_.glib.all.gulong)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.gulong]].update(0, v_ulong)
    ___ptr
  @scala.annotation.targetName("apply_v_ssize")
  def apply(v_ssize: _root_.glib.all.gssize)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.gssize]].update(0, v_ssize)
    ___ptr
  @scala.annotation.targetName("apply_v_size")
  def apply(v_size: _root_.glib.all.gsize)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.gsize]].update(0, v_size)
    ___ptr
  @scala.annotation.targetName("apply_v_string")
  def apply(v_string: Ptr[_root_.glib.all.gchar])(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[Ptr[_root_.glib.all.gchar]]].update(0, v_string)
    ___ptr
  @scala.annotation.targetName("apply_v_pointer")
  def apply(v_pointer: _root_.glib.all.gpointer)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.gpointer]].update(0, v_pointer)
    ___ptr
  extension (struct: GIArgument)
    def v_boolean : _root_.glib.all.gboolean = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gboolean]]
    def v_boolean_=(value: _root_.glib.all.gboolean): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gboolean]] = value
    def v_int8 : _root_.glib.all.gint8 = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gint8]]
    def v_int8_=(value: _root_.glib.all.gint8): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gint8]] = value
    def v_uint8 : _root_.glib.all.guint8 = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.guint8]]
    def v_uint8_=(value: _root_.glib.all.guint8): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.guint8]] = value
    def v_int16 : _root_.glib.all.gint16 = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gint16]]
    def v_int16_=(value: _root_.glib.all.gint16): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gint16]] = value
    def v_uint16 : _root_.glib.all.guint16 = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.guint16]]
    def v_uint16_=(value: _root_.glib.all.guint16): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.guint16]] = value
    def v_int32 : _root_.glib.all.gint32 = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gint32]]
    def v_int32_=(value: _root_.glib.all.gint32): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gint32]] = value
    def v_uint32 : _root_.glib.all.guint32 = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.guint32]]
    def v_uint32_=(value: _root_.glib.all.guint32): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.guint32]] = value
    def v_int64 : _root_.glib.all.gint64 = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gint64]]
    def v_int64_=(value: _root_.glib.all.gint64): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gint64]] = value
    def v_uint64 : _root_.glib.all.guint64 = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.guint64]]
    def v_uint64_=(value: _root_.glib.all.guint64): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.guint64]] = value
    def v_float : _root_.glib.all.gfloat = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gfloat]]
    def v_float_=(value: _root_.glib.all.gfloat): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gfloat]] = value
    def v_double : _root_.glib.all.gdouble = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gdouble]]
    def v_double_=(value: _root_.glib.all.gdouble): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gdouble]] = value
    def v_short : _root_.glib.all.gshort = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gshort]]
    def v_short_=(value: _root_.glib.all.gshort): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gshort]] = value
    def v_ushort : _root_.glib.all.gushort = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gushort]]
    def v_ushort_=(value: _root_.glib.all.gushort): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gushort]] = value
    def v_int : _root_.glib.all.gint = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gint]]
    def v_int_=(value: _root_.glib.all.gint): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gint]] = value
    def v_uint : _root_.glib.all.guint = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.guint]]
    def v_uint_=(value: _root_.glib.all.guint): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.guint]] = value
    def v_long : _root_.glib.all.glong = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.glong]]
    def v_long_=(value: _root_.glib.all.glong): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.glong]] = value
    def v_ulong : _root_.glib.all.gulong = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gulong]]
    def v_ulong_=(value: _root_.glib.all.gulong): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gulong]] = value
    def v_ssize : _root_.glib.all.gssize = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gssize]]
    def v_ssize_=(value: _root_.glib.all.gssize): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gssize]] = value
    def v_size : _root_.glib.all.gsize = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gsize]]
    def v_size_=(value: _root_.glib.all.gsize): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gsize]] = value
    def v_string : Ptr[_root_.glib.all.gchar] = !struct.at(0).asInstanceOf[Ptr[Ptr[_root_.glib.all.gchar]]]
    def v_string_=(value: Ptr[_root_.glib.all.gchar]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[_root_.glib.all.gchar]]] = value
    def v_pointer : _root_.glib.all.gpointer = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gpointer]]
    def v_pointer_=(value: _root_.glib.all.gpointer): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gpointer]] = value

/**
 * [bindgen] header: /usr/include/gobject-introspection-1.0/gitypes.h
*/
opaque type _GIArgument = CArray[Byte, Nat._8]
object _GIArgument:
  given _tag: Tag[_GIArgument] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
  def apply()(using Zone): Ptr[_GIArgument] = 
    val ___ptr = alloc[_GIArgument](1)
    ___ptr
  @scala.annotation.targetName("apply_v_boolean")
  def apply(v_boolean: _root_.glib.all.gboolean)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.gboolean]].update(0, v_boolean)
    ___ptr
  @scala.annotation.targetName("apply_v_int8")
  def apply(v_int8: _root_.glib.all.gint8)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.gint8]].update(0, v_int8)
    ___ptr
  @scala.annotation.targetName("apply_v_uint8")
  def apply(v_uint8: _root_.glib.all.guint8)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.guint8]].update(0, v_uint8)
    ___ptr
  @scala.annotation.targetName("apply_v_int16")
  def apply(v_int16: _root_.glib.all.gint16)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.gint16]].update(0, v_int16)
    ___ptr
  @scala.annotation.targetName("apply_v_uint16")
  def apply(v_uint16: _root_.glib.all.guint16)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.guint16]].update(0, v_uint16)
    ___ptr
  @scala.annotation.targetName("apply_v_int32")
  def apply(v_int32: _root_.glib.all.gint32)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.gint32]].update(0, v_int32)
    ___ptr
  @scala.annotation.targetName("apply_v_uint32")
  def apply(v_uint32: _root_.glib.all.guint32)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.guint32]].update(0, v_uint32)
    ___ptr
  @scala.annotation.targetName("apply_v_int64")
  def apply(v_int64: _root_.glib.all.gint64)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.gint64]].update(0, v_int64)
    ___ptr
  @scala.annotation.targetName("apply_v_uint64")
  def apply(v_uint64: _root_.glib.all.guint64)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.guint64]].update(0, v_uint64)
    ___ptr
  @scala.annotation.targetName("apply_v_float")
  def apply(v_float: _root_.glib.all.gfloat)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.gfloat]].update(0, v_float)
    ___ptr
  @scala.annotation.targetName("apply_v_double")
  def apply(v_double: _root_.glib.all.gdouble)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.gdouble]].update(0, v_double)
    ___ptr
  @scala.annotation.targetName("apply_v_short")
  def apply(v_short: _root_.glib.all.gshort)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.gshort]].update(0, v_short)
    ___ptr
  @scala.annotation.targetName("apply_v_ushort")
  def apply(v_ushort: _root_.glib.all.gushort)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.gushort]].update(0, v_ushort)
    ___ptr
  @scala.annotation.targetName("apply_v_int")
  def apply(v_int: _root_.glib.all.gint)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.gint]].update(0, v_int)
    ___ptr
  @scala.annotation.targetName("apply_v_uint")
  def apply(v_uint: _root_.glib.all.guint)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.guint]].update(0, v_uint)
    ___ptr
  @scala.annotation.targetName("apply_v_long")
  def apply(v_long: _root_.glib.all.glong)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.glong]].update(0, v_long)
    ___ptr
  @scala.annotation.targetName("apply_v_ulong")
  def apply(v_ulong: _root_.glib.all.gulong)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.gulong]].update(0, v_ulong)
    ___ptr
  @scala.annotation.targetName("apply_v_ssize")
  def apply(v_ssize: _root_.glib.all.gssize)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.gssize]].update(0, v_ssize)
    ___ptr
  @scala.annotation.targetName("apply_v_size")
  def apply(v_size: _root_.glib.all.gsize)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.gsize]].update(0, v_size)
    ___ptr
  @scala.annotation.targetName("apply_v_string")
  def apply(v_string: Ptr[_root_.glib.all.gchar])(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[Ptr[_root_.glib.all.gchar]]].update(0, v_string)
    ___ptr
  @scala.annotation.targetName("apply_v_pointer")
  def apply(v_pointer: _root_.glib.all.gpointer)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.glib.all.gpointer]].update(0, v_pointer)
    ___ptr
  extension (struct: _GIArgument)
    def v_boolean : _root_.glib.all.gboolean = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gboolean]]
    def v_boolean_=(value: _root_.glib.all.gboolean): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gboolean]] = value
    def v_int8 : _root_.glib.all.gint8 = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gint8]]
    def v_int8_=(value: _root_.glib.all.gint8): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gint8]] = value
    def v_uint8 : _root_.glib.all.guint8 = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.guint8]]
    def v_uint8_=(value: _root_.glib.all.guint8): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.guint8]] = value
    def v_int16 : _root_.glib.all.gint16 = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gint16]]
    def v_int16_=(value: _root_.glib.all.gint16): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gint16]] = value
    def v_uint16 : _root_.glib.all.guint16 = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.guint16]]
    def v_uint16_=(value: _root_.glib.all.guint16): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.guint16]] = value
    def v_int32 : _root_.glib.all.gint32 = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gint32]]
    def v_int32_=(value: _root_.glib.all.gint32): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gint32]] = value
    def v_uint32 : _root_.glib.all.guint32 = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.guint32]]
    def v_uint32_=(value: _root_.glib.all.guint32): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.guint32]] = value
    def v_int64 : _root_.glib.all.gint64 = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gint64]]
    def v_int64_=(value: _root_.glib.all.gint64): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gint64]] = value
    def v_uint64 : _root_.glib.all.guint64 = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.guint64]]
    def v_uint64_=(value: _root_.glib.all.guint64): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.guint64]] = value
    def v_float : _root_.glib.all.gfloat = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gfloat]]
    def v_float_=(value: _root_.glib.all.gfloat): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gfloat]] = value
    def v_double : _root_.glib.all.gdouble = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gdouble]]
    def v_double_=(value: _root_.glib.all.gdouble): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gdouble]] = value
    def v_short : _root_.glib.all.gshort = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gshort]]
    def v_short_=(value: _root_.glib.all.gshort): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gshort]] = value
    def v_ushort : _root_.glib.all.gushort = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gushort]]
    def v_ushort_=(value: _root_.glib.all.gushort): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gushort]] = value
    def v_int : _root_.glib.all.gint = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gint]]
    def v_int_=(value: _root_.glib.all.gint): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gint]] = value
    def v_uint : _root_.glib.all.guint = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.guint]]
    def v_uint_=(value: _root_.glib.all.guint): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.guint]] = value
    def v_long : _root_.glib.all.glong = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.glong]]
    def v_long_=(value: _root_.glib.all.glong): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.glong]] = value
    def v_ulong : _root_.glib.all.gulong = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gulong]]
    def v_ulong_=(value: _root_.glib.all.gulong): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gulong]] = value
    def v_ssize : _root_.glib.all.gssize = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gssize]]
    def v_ssize_=(value: _root_.glib.all.gssize): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gssize]] = value
    def v_size : _root_.glib.all.gsize = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gsize]]
    def v_size_=(value: _root_.glib.all.gsize): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gsize]] = value
    def v_string : Ptr[_root_.glib.all.gchar] = !struct.at(0).asInstanceOf[Ptr[Ptr[_root_.glib.all.gchar]]]
    def v_string_=(value: Ptr[_root_.glib.all.gchar]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[_root_.glib.all.gchar]]] = value
    def v_pointer : _root_.glib.all.gpointer = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gpointer]]
    def v_pointer_=(value: _root_.glib.all.gpointer): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gpointer]] = value

