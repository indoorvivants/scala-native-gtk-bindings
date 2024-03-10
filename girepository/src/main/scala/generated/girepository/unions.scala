package girepository

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GIArgument = CArray[Byte, Nat._8]
object GIArgument:
  given _tag: Tag[GIArgument] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
  def apply()(using Zone): Ptr[GIArgument] = 
    val ___ptr = alloc[GIArgument](1)
    ___ptr
  @scala.annotation.targetName("apply_v_boolean")
  def apply(v_boolean: _root_.sn.gnome.glib.internal.gboolean)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gboolean]].update(0, v_boolean)
    ___ptr
  @scala.annotation.targetName("apply_v_int8")
  def apply(v_int8: _root_.sn.gnome.glib.internal.gint8)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint8]].update(0, v_int8)
    ___ptr
  @scala.annotation.targetName("apply_v_uint8")
  def apply(v_uint8: _root_.sn.gnome.glib.internal.guint8)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint8]].update(0, v_uint8)
    ___ptr
  @scala.annotation.targetName("apply_v_int16")
  def apply(v_int16: _root_.sn.gnome.glib.internal.gint16)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint16]].update(0, v_int16)
    ___ptr
  @scala.annotation.targetName("apply_v_uint16")
  def apply(v_uint16: _root_.sn.gnome.glib.internal.guint16)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint16]].update(0, v_uint16)
    ___ptr
  @scala.annotation.targetName("apply_v_int32")
  def apply(v_int32: _root_.sn.gnome.glib.internal.gint32)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint32]].update(0, v_int32)
    ___ptr
  @scala.annotation.targetName("apply_v_uint32")
  def apply(v_uint32: _root_.sn.gnome.glib.internal.guint32)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint32]].update(0, v_uint32)
    ___ptr
  @scala.annotation.targetName("apply_v_int64")
  def apply(v_int64: _root_.sn.gnome.glib.internal.gint64)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint64]].update(0, v_int64)
    ___ptr
  @scala.annotation.targetName("apply_v_uint64")
  def apply(v_uint64: _root_.sn.gnome.glib.internal.guint64)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint64]].update(0, v_uint64)
    ___ptr
  @scala.annotation.targetName("apply_v_float")
  def apply(v_float: _root_.sn.gnome.glib.internal.gfloat)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gfloat]].update(0, v_float)
    ___ptr
  @scala.annotation.targetName("apply_v_double")
  def apply(v_double: _root_.sn.gnome.glib.internal.gdouble)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gdouble]].update(0, v_double)
    ___ptr
  @scala.annotation.targetName("apply_v_short")
  def apply(v_short: _root_.sn.gnome.glib.internal.gshort)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gshort]].update(0, v_short)
    ___ptr
  @scala.annotation.targetName("apply_v_ushort")
  def apply(v_ushort: _root_.sn.gnome.glib.internal.gushort)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gushort]].update(0, v_ushort)
    ___ptr
  @scala.annotation.targetName("apply_v_int")
  def apply(v_int: _root_.sn.gnome.glib.internal.gint)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint]].update(0, v_int)
    ___ptr
  @scala.annotation.targetName("apply_v_uint")
  def apply(v_uint: _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint]].update(0, v_uint)
    ___ptr
  @scala.annotation.targetName("apply_v_long")
  def apply(v_long: _root_.sn.gnome.glib.internal.glong)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.glong]].update(0, v_long)
    ___ptr
  @scala.annotation.targetName("apply_v_ulong")
  def apply(v_ulong: _root_.sn.gnome.glib.internal.gulong)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gulong]].update(0, v_ulong)
    ___ptr
  @scala.annotation.targetName("apply_v_ssize")
  def apply(v_ssize: _root_.sn.gnome.glib.internal.gssize)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gssize]].update(0, v_ssize)
    ___ptr
  @scala.annotation.targetName("apply_v_size")
  def apply(v_size: _root_.sn.gnome.glib.internal.gsize)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gsize]].update(0, v_size)
    ___ptr
  @scala.annotation.targetName("apply_v_string")
  def apply(v_string: Ptr[_root_.sn.gnome.glib.internal.gchar])(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]].update(0, v_string)
    ___ptr
  @scala.annotation.targetName("apply_v_pointer")
  def apply(v_pointer: _root_.sn.gnome.glib.internal.gpointer)(using Zone): Ptr[GIArgument] =
    val ___ptr = alloc[GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]].update(0, v_pointer)
    ___ptr
  extension (struct: GIArgument)
    def v_boolean : _root_.sn.gnome.glib.internal.gboolean = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gboolean]]
    def v_boolean_=(value: _root_.sn.gnome.glib.internal.gboolean): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gboolean]] = value
    def v_int8 : _root_.sn.gnome.glib.internal.gint8 = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint8]]
    def v_int8_=(value: _root_.sn.gnome.glib.internal.gint8): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint8]] = value
    def v_uint8 : _root_.sn.gnome.glib.internal.guint8 = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint8]]
    def v_uint8_=(value: _root_.sn.gnome.glib.internal.guint8): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint8]] = value
    def v_int16 : _root_.sn.gnome.glib.internal.gint16 = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint16]]
    def v_int16_=(value: _root_.sn.gnome.glib.internal.gint16): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint16]] = value
    def v_uint16 : _root_.sn.gnome.glib.internal.guint16 = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint16]]
    def v_uint16_=(value: _root_.sn.gnome.glib.internal.guint16): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint16]] = value
    def v_int32 : _root_.sn.gnome.glib.internal.gint32 = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint32]]
    def v_int32_=(value: _root_.sn.gnome.glib.internal.gint32): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint32]] = value
    def v_uint32 : _root_.sn.gnome.glib.internal.guint32 = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint32]]
    def v_uint32_=(value: _root_.sn.gnome.glib.internal.guint32): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint32]] = value
    def v_int64 : _root_.sn.gnome.glib.internal.gint64 = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint64]]
    def v_int64_=(value: _root_.sn.gnome.glib.internal.gint64): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint64]] = value
    def v_uint64 : _root_.sn.gnome.glib.internal.guint64 = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint64]]
    def v_uint64_=(value: _root_.sn.gnome.glib.internal.guint64): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint64]] = value
    def v_float : _root_.sn.gnome.glib.internal.gfloat = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gfloat]]
    def v_float_=(value: _root_.sn.gnome.glib.internal.gfloat): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gfloat]] = value
    def v_double : _root_.sn.gnome.glib.internal.gdouble = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gdouble]]
    def v_double_=(value: _root_.sn.gnome.glib.internal.gdouble): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gdouble]] = value
    def v_short : _root_.sn.gnome.glib.internal.gshort = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gshort]]
    def v_short_=(value: _root_.sn.gnome.glib.internal.gshort): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gshort]] = value
    def v_ushort : _root_.sn.gnome.glib.internal.gushort = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gushort]]
    def v_ushort_=(value: _root_.sn.gnome.glib.internal.gushort): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gushort]] = value
    def v_int : _root_.sn.gnome.glib.internal.gint = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint]]
    def v_int_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint]] = value
    def v_uint : _root_.sn.gnome.glib.internal.guint = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint]]
    def v_uint_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint]] = value
    def v_long : _root_.sn.gnome.glib.internal.glong = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.glong]]
    def v_long_=(value: _root_.sn.gnome.glib.internal.glong): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.glong]] = value
    def v_ulong : _root_.sn.gnome.glib.internal.gulong = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gulong]]
    def v_ulong_=(value: _root_.sn.gnome.glib.internal.gulong): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gulong]] = value
    def v_ssize : _root_.sn.gnome.glib.internal.gssize = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gssize]]
    def v_ssize_=(value: _root_.sn.gnome.glib.internal.gssize): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gssize]] = value
    def v_size : _root_.sn.gnome.glib.internal.gsize = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gsize]]
    def v_size_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gsize]] = value
    def v_string : Ptr[_root_.sn.gnome.glib.internal.gchar] = !struct.at(0).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]
    def v_string_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]] = value
    def v_pointer : _root_.sn.gnome.glib.internal.gpointer = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]]
    def v_pointer_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]] = value

opaque type _GIArgument = CArray[Byte, Nat._8]
object _GIArgument:
  given _tag: Tag[_GIArgument] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
  def apply()(using Zone): Ptr[_GIArgument] = 
    val ___ptr = alloc[_GIArgument](1)
    ___ptr
  @scala.annotation.targetName("apply_v_boolean")
  def apply(v_boolean: _root_.sn.gnome.glib.internal.gboolean)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gboolean]].update(0, v_boolean)
    ___ptr
  @scala.annotation.targetName("apply_v_int8")
  def apply(v_int8: _root_.sn.gnome.glib.internal.gint8)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint8]].update(0, v_int8)
    ___ptr
  @scala.annotation.targetName("apply_v_uint8")
  def apply(v_uint8: _root_.sn.gnome.glib.internal.guint8)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint8]].update(0, v_uint8)
    ___ptr
  @scala.annotation.targetName("apply_v_int16")
  def apply(v_int16: _root_.sn.gnome.glib.internal.gint16)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint16]].update(0, v_int16)
    ___ptr
  @scala.annotation.targetName("apply_v_uint16")
  def apply(v_uint16: _root_.sn.gnome.glib.internal.guint16)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint16]].update(0, v_uint16)
    ___ptr
  @scala.annotation.targetName("apply_v_int32")
  def apply(v_int32: _root_.sn.gnome.glib.internal.gint32)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint32]].update(0, v_int32)
    ___ptr
  @scala.annotation.targetName("apply_v_uint32")
  def apply(v_uint32: _root_.sn.gnome.glib.internal.guint32)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint32]].update(0, v_uint32)
    ___ptr
  @scala.annotation.targetName("apply_v_int64")
  def apply(v_int64: _root_.sn.gnome.glib.internal.gint64)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint64]].update(0, v_int64)
    ___ptr
  @scala.annotation.targetName("apply_v_uint64")
  def apply(v_uint64: _root_.sn.gnome.glib.internal.guint64)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint64]].update(0, v_uint64)
    ___ptr
  @scala.annotation.targetName("apply_v_float")
  def apply(v_float: _root_.sn.gnome.glib.internal.gfloat)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gfloat]].update(0, v_float)
    ___ptr
  @scala.annotation.targetName("apply_v_double")
  def apply(v_double: _root_.sn.gnome.glib.internal.gdouble)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gdouble]].update(0, v_double)
    ___ptr
  @scala.annotation.targetName("apply_v_short")
  def apply(v_short: _root_.sn.gnome.glib.internal.gshort)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gshort]].update(0, v_short)
    ___ptr
  @scala.annotation.targetName("apply_v_ushort")
  def apply(v_ushort: _root_.sn.gnome.glib.internal.gushort)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gushort]].update(0, v_ushort)
    ___ptr
  @scala.annotation.targetName("apply_v_int")
  def apply(v_int: _root_.sn.gnome.glib.internal.gint)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint]].update(0, v_int)
    ___ptr
  @scala.annotation.targetName("apply_v_uint")
  def apply(v_uint: _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint]].update(0, v_uint)
    ___ptr
  @scala.annotation.targetName("apply_v_long")
  def apply(v_long: _root_.sn.gnome.glib.internal.glong)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.glong]].update(0, v_long)
    ___ptr
  @scala.annotation.targetName("apply_v_ulong")
  def apply(v_ulong: _root_.sn.gnome.glib.internal.gulong)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gulong]].update(0, v_ulong)
    ___ptr
  @scala.annotation.targetName("apply_v_ssize")
  def apply(v_ssize: _root_.sn.gnome.glib.internal.gssize)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gssize]].update(0, v_ssize)
    ___ptr
  @scala.annotation.targetName("apply_v_size")
  def apply(v_size: _root_.sn.gnome.glib.internal.gsize)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gsize]].update(0, v_size)
    ___ptr
  @scala.annotation.targetName("apply_v_string")
  def apply(v_string: Ptr[_root_.sn.gnome.glib.internal.gchar])(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]].update(0, v_string)
    ___ptr
  @scala.annotation.targetName("apply_v_pointer")
  def apply(v_pointer: _root_.sn.gnome.glib.internal.gpointer)(using Zone): Ptr[_GIArgument] =
    val ___ptr = alloc[_GIArgument](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]].update(0, v_pointer)
    ___ptr
  extension (struct: _GIArgument)
    def v_boolean : _root_.sn.gnome.glib.internal.gboolean = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gboolean]]
    def v_boolean_=(value: _root_.sn.gnome.glib.internal.gboolean): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gboolean]] = value
    def v_int8 : _root_.sn.gnome.glib.internal.gint8 = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint8]]
    def v_int8_=(value: _root_.sn.gnome.glib.internal.gint8): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint8]] = value
    def v_uint8 : _root_.sn.gnome.glib.internal.guint8 = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint8]]
    def v_uint8_=(value: _root_.sn.gnome.glib.internal.guint8): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint8]] = value
    def v_int16 : _root_.sn.gnome.glib.internal.gint16 = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint16]]
    def v_int16_=(value: _root_.sn.gnome.glib.internal.gint16): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint16]] = value
    def v_uint16 : _root_.sn.gnome.glib.internal.guint16 = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint16]]
    def v_uint16_=(value: _root_.sn.gnome.glib.internal.guint16): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint16]] = value
    def v_int32 : _root_.sn.gnome.glib.internal.gint32 = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint32]]
    def v_int32_=(value: _root_.sn.gnome.glib.internal.gint32): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint32]] = value
    def v_uint32 : _root_.sn.gnome.glib.internal.guint32 = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint32]]
    def v_uint32_=(value: _root_.sn.gnome.glib.internal.guint32): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint32]] = value
    def v_int64 : _root_.sn.gnome.glib.internal.gint64 = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint64]]
    def v_int64_=(value: _root_.sn.gnome.glib.internal.gint64): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint64]] = value
    def v_uint64 : _root_.sn.gnome.glib.internal.guint64 = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint64]]
    def v_uint64_=(value: _root_.sn.gnome.glib.internal.guint64): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint64]] = value
    def v_float : _root_.sn.gnome.glib.internal.gfloat = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gfloat]]
    def v_float_=(value: _root_.sn.gnome.glib.internal.gfloat): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gfloat]] = value
    def v_double : _root_.sn.gnome.glib.internal.gdouble = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gdouble]]
    def v_double_=(value: _root_.sn.gnome.glib.internal.gdouble): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gdouble]] = value
    def v_short : _root_.sn.gnome.glib.internal.gshort = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gshort]]
    def v_short_=(value: _root_.sn.gnome.glib.internal.gshort): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gshort]] = value
    def v_ushort : _root_.sn.gnome.glib.internal.gushort = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gushort]]
    def v_ushort_=(value: _root_.sn.gnome.glib.internal.gushort): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gushort]] = value
    def v_int : _root_.sn.gnome.glib.internal.gint = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint]]
    def v_int_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint]] = value
    def v_uint : _root_.sn.gnome.glib.internal.guint = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint]]
    def v_uint_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint]] = value
    def v_long : _root_.sn.gnome.glib.internal.glong = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.glong]]
    def v_long_=(value: _root_.sn.gnome.glib.internal.glong): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.glong]] = value
    def v_ulong : _root_.sn.gnome.glib.internal.gulong = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gulong]]
    def v_ulong_=(value: _root_.sn.gnome.glib.internal.gulong): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gulong]] = value
    def v_ssize : _root_.sn.gnome.glib.internal.gssize = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gssize]]
    def v_ssize_=(value: _root_.sn.gnome.glib.internal.gssize): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gssize]] = value
    def v_size : _root_.sn.gnome.glib.internal.gsize = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gsize]]
    def v_size_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gsize]] = value
    def v_string : Ptr[_root_.sn.gnome.glib.internal.gchar] = !struct.at(0).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]
    def v_string_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]] = value
    def v_pointer : _root_.sn.gnome.glib.internal.gpointer = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]]
    def v_pointer_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]] = value