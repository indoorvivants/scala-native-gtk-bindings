package sn.gnome.glib.internal

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDoubleIEEE754 = CArray[Byte, Nat._8]
object GDoubleIEEE754:
  opaque type Struct0 = CStruct4[guint, guint, guint, guint]
  object Struct0:
    given _tag: Tag[Struct0] = Tag.materializeCStruct4Tag[guint, guint, guint, guint]
    def apply()(using Zone): Ptr[Struct0] = scala.scalanative.unsafe.alloc[Struct0](1)
    def apply(mantissa_low : guint, mantissa_high : guint, biased_exponent : guint, sign : guint)(using Zone): Ptr[Struct0] = 
      val ____ptr = apply()
      (!____ptr).mantissa_low = mantissa_low
      (!____ptr).mantissa_high = mantissa_high
      (!____ptr).biased_exponent = biased_exponent
      (!____ptr).sign = sign
      ____ptr
    extension (struct: Struct0)
      def mantissa_low : guint = struct._1
      def mantissa_low_=(value: guint): Unit = !struct.at1 = value
      def mantissa_high : guint = struct._2
      def mantissa_high_=(value: guint): Unit = !struct.at2 = value
      def biased_exponent : guint = struct._3
      def biased_exponent_=(value: guint): Unit = !struct.at3 = value
      def sign : guint = struct._4
      def sign_=(value: guint): Unit = !struct.at4 = value
  given _tag: Tag[GDoubleIEEE754] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
  def apply()(using Zone): Ptr[GDoubleIEEE754] = 
    val ___ptr = alloc[GDoubleIEEE754](1)
    ___ptr
  @scala.annotation.targetName("apply_v_double")
  def apply(v_double: gdouble)(using Zone): Ptr[GDoubleIEEE754] =
    val ___ptr = alloc[GDoubleIEEE754](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[gdouble]].update(0, v_double)
    ___ptr
  @scala.annotation.targetName("apply_mpn")
  def apply(mpn: GDoubleIEEE754.Struct0)(using Zone): Ptr[GDoubleIEEE754] =
    val ___ptr = alloc[GDoubleIEEE754](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[GDoubleIEEE754.Struct0]].update(0, mpn)
    ___ptr
  extension (struct: GDoubleIEEE754)
    def v_double : gdouble = !struct.at(0).asInstanceOf[Ptr[gdouble]]
    def v_double_=(value: gdouble): Unit = !struct.at(0).asInstanceOf[Ptr[gdouble]] = value
    def mpn : GDoubleIEEE754.Struct0 = !struct.at(0).asInstanceOf[Ptr[GDoubleIEEE754.Struct0]]
    def mpn_=(value: GDoubleIEEE754.Struct0): Unit = !struct.at(0).asInstanceOf[Ptr[GDoubleIEEE754.Struct0]] = value

opaque type GFloatIEEE754 = CArray[Byte, Nat._4]
object GFloatIEEE754:
  opaque type Struct0 = CStruct3[guint, guint, guint]
  object Struct0:
    given _tag: Tag[Struct0] = Tag.materializeCStruct3Tag[guint, guint, guint]
    def apply()(using Zone): Ptr[Struct0] = scala.scalanative.unsafe.alloc[Struct0](1)
    def apply(mantissa : guint, biased_exponent : guint, sign : guint)(using Zone): Ptr[Struct0] = 
      val ____ptr = apply()
      (!____ptr).mantissa = mantissa
      (!____ptr).biased_exponent = biased_exponent
      (!____ptr).sign = sign
      ____ptr
    extension (struct: Struct0)
      def mantissa : guint = struct._1
      def mantissa_=(value: guint): Unit = !struct.at1 = value
      def biased_exponent : guint = struct._2
      def biased_exponent_=(value: guint): Unit = !struct.at2 = value
      def sign : guint = struct._3
      def sign_=(value: guint): Unit = !struct.at3 = value
  given _tag: Tag[GFloatIEEE754] = Tag.CArray[CChar, Nat._4](Tag.Byte, Tag.Nat4)
  def apply()(using Zone): Ptr[GFloatIEEE754] = 
    val ___ptr = alloc[GFloatIEEE754](1)
    ___ptr
  @scala.annotation.targetName("apply_v_float")
  def apply(v_float: gfloat)(using Zone): Ptr[GFloatIEEE754] =
    val ___ptr = alloc[GFloatIEEE754](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[gfloat]].update(0, v_float)
    ___ptr
  @scala.annotation.targetName("apply_mpn")
  def apply(mpn: GFloatIEEE754.Struct0)(using Zone): Ptr[GFloatIEEE754] =
    val ___ptr = alloc[GFloatIEEE754](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[GFloatIEEE754.Struct0]].update(0, mpn)
    ___ptr
  extension (struct: GFloatIEEE754)
    def v_float : gfloat = !struct.at(0).asInstanceOf[Ptr[gfloat]]
    def v_float_=(value: gfloat): Unit = !struct.at(0).asInstanceOf[Ptr[gfloat]] = value
    def mpn : GFloatIEEE754.Struct0 = !struct.at(0).asInstanceOf[Ptr[GFloatIEEE754.Struct0]]
    def mpn_=(value: GFloatIEEE754.Struct0): Unit = !struct.at(0).asInstanceOf[Ptr[GFloatIEEE754.Struct0]] = value

opaque type GMutex = CArray[Byte, Nat._8]
object GMutex:
  given _tag: Tag[GMutex] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
  def apply()(using Zone): Ptr[GMutex] = 
    val ___ptr = alloc[GMutex](1)
    ___ptr
  @scala.annotation.targetName("apply_p")
  def apply(p: gpointer)(using Zone): Ptr[GMutex] =
    val ___ptr = alloc[GMutex](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[gpointer]].update(0, p)
    ___ptr
  @scala.annotation.targetName("apply_i")
  def apply(i: CArray[guint, Nat._2])(using Zone): Ptr[GMutex] =
    val ___ptr = alloc[GMutex](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[CArray[guint, Nat._2]]].update(0, i)
    ___ptr
  extension (struct: GMutex)
    def p : gpointer = !struct.at(0).asInstanceOf[Ptr[gpointer]]
    def p_=(value: gpointer): Unit = !struct.at(0).asInstanceOf[Ptr[gpointer]] = value
    def i : CArray[guint, Nat._2] = !struct.at(0).asInstanceOf[Ptr[CArray[guint, Nat._2]]]
    def i_=(value: CArray[guint, Nat._2]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[guint, Nat._2]]] = value

opaque type GTokenValue = CArray[Byte, Nat._8]
object GTokenValue:
  given _tag: Tag[GTokenValue] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
  def apply()(using Zone): Ptr[GTokenValue] = 
    val ___ptr = alloc[GTokenValue](1)
    ___ptr
  @scala.annotation.targetName("apply_v_symbol")
  def apply(v_symbol: gpointer)(using Zone): Ptr[GTokenValue] =
    val ___ptr = alloc[GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[gpointer]].update(0, v_symbol)
    ___ptr
  @scala.annotation.targetName("apply_v_identifier")
  def apply(v_identifier: Ptr[gchar])(using Zone): Ptr[GTokenValue] =
    val ___ptr = alloc[GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[Ptr[gchar]]].update(0, v_identifier)
    ___ptr
  @scala.annotation.targetName("apply_v_binary")
  def apply(v_binary: gulong)(using Zone): Ptr[GTokenValue] =
    val ___ptr = alloc[GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[gulong]].update(0, v_binary)
    ___ptr
  @scala.annotation.targetName("apply_v_octal")
  def apply(v_octal: gulong)(using Zone): Ptr[GTokenValue] =
    val ___ptr = alloc[GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[gulong]].update(0, v_octal)
    ___ptr
  @scala.annotation.targetName("apply_v_int")
  def apply(v_int: gulong)(using Zone): Ptr[GTokenValue] =
    val ___ptr = alloc[GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[gulong]].update(0, v_int)
    ___ptr
  @scala.annotation.targetName("apply_v_int64")
  def apply(v_int64: guint64)(using Zone): Ptr[GTokenValue] =
    val ___ptr = alloc[GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[guint64]].update(0, v_int64)
    ___ptr
  @scala.annotation.targetName("apply_v_float")
  def apply(v_float: gdouble)(using Zone): Ptr[GTokenValue] =
    val ___ptr = alloc[GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[gdouble]].update(0, v_float)
    ___ptr
  @scala.annotation.targetName("apply_v_hex")
  def apply(v_hex: gulong)(using Zone): Ptr[GTokenValue] =
    val ___ptr = alloc[GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[gulong]].update(0, v_hex)
    ___ptr
  @scala.annotation.targetName("apply_v_string")
  def apply(v_string: Ptr[gchar])(using Zone): Ptr[GTokenValue] =
    val ___ptr = alloc[GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[Ptr[gchar]]].update(0, v_string)
    ___ptr
  @scala.annotation.targetName("apply_v_comment")
  def apply(v_comment: Ptr[gchar])(using Zone): Ptr[GTokenValue] =
    val ___ptr = alloc[GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[Ptr[gchar]]].update(0, v_comment)
    ___ptr
  @scala.annotation.targetName("apply_v_char")
  def apply(v_char: guchar)(using Zone): Ptr[GTokenValue] =
    val ___ptr = alloc[GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[guchar]].update(0, v_char)
    ___ptr
  @scala.annotation.targetName("apply_v_error")
  def apply(v_error: guint)(using Zone): Ptr[GTokenValue] =
    val ___ptr = alloc[GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[guint]].update(0, v_error)
    ___ptr
  extension (struct: GTokenValue)
    def v_symbol : gpointer = !struct.at(0).asInstanceOf[Ptr[gpointer]]
    def v_symbol_=(value: gpointer): Unit = !struct.at(0).asInstanceOf[Ptr[gpointer]] = value
    def v_identifier : Ptr[gchar] = !struct.at(0).asInstanceOf[Ptr[Ptr[gchar]]]
    def v_identifier_=(value: Ptr[gchar]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[gchar]]] = value
    def v_binary : gulong = !struct.at(0).asInstanceOf[Ptr[gulong]]
    def v_binary_=(value: gulong): Unit = !struct.at(0).asInstanceOf[Ptr[gulong]] = value
    def v_octal : gulong = !struct.at(0).asInstanceOf[Ptr[gulong]]
    def v_octal_=(value: gulong): Unit = !struct.at(0).asInstanceOf[Ptr[gulong]] = value
    def v_int : gulong = !struct.at(0).asInstanceOf[Ptr[gulong]]
    def v_int_=(value: gulong): Unit = !struct.at(0).asInstanceOf[Ptr[gulong]] = value
    def v_int64 : guint64 = !struct.at(0).asInstanceOf[Ptr[guint64]]
    def v_int64_=(value: guint64): Unit = !struct.at(0).asInstanceOf[Ptr[guint64]] = value
    def v_float : gdouble = !struct.at(0).asInstanceOf[Ptr[gdouble]]
    def v_float_=(value: gdouble): Unit = !struct.at(0).asInstanceOf[Ptr[gdouble]] = value
    def v_hex : gulong = !struct.at(0).asInstanceOf[Ptr[gulong]]
    def v_hex_=(value: gulong): Unit = !struct.at(0).asInstanceOf[Ptr[gulong]] = value
    def v_string : Ptr[gchar] = !struct.at(0).asInstanceOf[Ptr[Ptr[gchar]]]
    def v_string_=(value: Ptr[gchar]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[gchar]]] = value
    def v_comment : Ptr[gchar] = !struct.at(0).asInstanceOf[Ptr[Ptr[gchar]]]
    def v_comment_=(value: Ptr[gchar]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[gchar]]] = value
    def v_char : guchar = !struct.at(0).asInstanceOf[Ptr[guchar]]
    def v_char_=(value: guchar): Unit = !struct.at(0).asInstanceOf[Ptr[guchar]] = value
    def v_error : guint = !struct.at(0).asInstanceOf[Ptr[guint]]
    def v_error_=(value: guint): Unit = !struct.at(0).asInstanceOf[Ptr[guint]] = value

opaque type _GDoubleIEEE754 = CArray[Byte, Nat._8]
object _GDoubleIEEE754:
  opaque type Struct0 = CStruct4[guint, guint, guint, guint]
  object Struct0:
    given _tag: Tag[Struct0] = Tag.materializeCStruct4Tag[guint, guint, guint, guint]
    def apply()(using Zone): Ptr[Struct0] = scala.scalanative.unsafe.alloc[Struct0](1)
    def apply(mantissa_low : guint, mantissa_high : guint, biased_exponent : guint, sign : guint)(using Zone): Ptr[Struct0] = 
      val ____ptr = apply()
      (!____ptr).mantissa_low = mantissa_low
      (!____ptr).mantissa_high = mantissa_high
      (!____ptr).biased_exponent = biased_exponent
      (!____ptr).sign = sign
      ____ptr
    extension (struct: Struct0)
      def mantissa_low : guint = struct._1
      def mantissa_low_=(value: guint): Unit = !struct.at1 = value
      def mantissa_high : guint = struct._2
      def mantissa_high_=(value: guint): Unit = !struct.at2 = value
      def biased_exponent : guint = struct._3
      def biased_exponent_=(value: guint): Unit = !struct.at3 = value
      def sign : guint = struct._4
      def sign_=(value: guint): Unit = !struct.at4 = value
  given _tag: Tag[_GDoubleIEEE754] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
  def apply()(using Zone): Ptr[_GDoubleIEEE754] = 
    val ___ptr = alloc[_GDoubleIEEE754](1)
    ___ptr
  @scala.annotation.targetName("apply_v_double")
  def apply(v_double: gdouble)(using Zone): Ptr[_GDoubleIEEE754] =
    val ___ptr = alloc[_GDoubleIEEE754](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[gdouble]].update(0, v_double)
    ___ptr
  @scala.annotation.targetName("apply_mpn")
  def apply(mpn: _GDoubleIEEE754.Struct0)(using Zone): Ptr[_GDoubleIEEE754] =
    val ___ptr = alloc[_GDoubleIEEE754](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_GDoubleIEEE754.Struct0]].update(0, mpn)
    ___ptr
  extension (struct: _GDoubleIEEE754)
    def v_double : gdouble = !struct.at(0).asInstanceOf[Ptr[gdouble]]
    def v_double_=(value: gdouble): Unit = !struct.at(0).asInstanceOf[Ptr[gdouble]] = value
    def mpn : _GDoubleIEEE754.Struct0 = !struct.at(0).asInstanceOf[Ptr[_GDoubleIEEE754.Struct0]]
    def mpn_=(value: _GDoubleIEEE754.Struct0): Unit = !struct.at(0).asInstanceOf[Ptr[_GDoubleIEEE754.Struct0]] = value

opaque type _GFloatIEEE754 = CArray[Byte, Nat._4]
object _GFloatIEEE754:
  opaque type Struct0 = CStruct3[guint, guint, guint]
  object Struct0:
    given _tag: Tag[Struct0] = Tag.materializeCStruct3Tag[guint, guint, guint]
    def apply()(using Zone): Ptr[Struct0] = scala.scalanative.unsafe.alloc[Struct0](1)
    def apply(mantissa : guint, biased_exponent : guint, sign : guint)(using Zone): Ptr[Struct0] = 
      val ____ptr = apply()
      (!____ptr).mantissa = mantissa
      (!____ptr).biased_exponent = biased_exponent
      (!____ptr).sign = sign
      ____ptr
    extension (struct: Struct0)
      def mantissa : guint = struct._1
      def mantissa_=(value: guint): Unit = !struct.at1 = value
      def biased_exponent : guint = struct._2
      def biased_exponent_=(value: guint): Unit = !struct.at2 = value
      def sign : guint = struct._3
      def sign_=(value: guint): Unit = !struct.at3 = value
  given _tag: Tag[_GFloatIEEE754] = Tag.CArray[CChar, Nat._4](Tag.Byte, Tag.Nat4)
  def apply()(using Zone): Ptr[_GFloatIEEE754] = 
    val ___ptr = alloc[_GFloatIEEE754](1)
    ___ptr
  @scala.annotation.targetName("apply_v_float")
  def apply(v_float: gfloat)(using Zone): Ptr[_GFloatIEEE754] =
    val ___ptr = alloc[_GFloatIEEE754](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[gfloat]].update(0, v_float)
    ___ptr
  @scala.annotation.targetName("apply_mpn")
  def apply(mpn: _GFloatIEEE754.Struct0)(using Zone): Ptr[_GFloatIEEE754] =
    val ___ptr = alloc[_GFloatIEEE754](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_GFloatIEEE754.Struct0]].update(0, mpn)
    ___ptr
  extension (struct: _GFloatIEEE754)
    def v_float : gfloat = !struct.at(0).asInstanceOf[Ptr[gfloat]]
    def v_float_=(value: gfloat): Unit = !struct.at(0).asInstanceOf[Ptr[gfloat]] = value
    def mpn : _GFloatIEEE754.Struct0 = !struct.at(0).asInstanceOf[Ptr[_GFloatIEEE754.Struct0]]
    def mpn_=(value: _GFloatIEEE754.Struct0): Unit = !struct.at(0).asInstanceOf[Ptr[_GFloatIEEE754.Struct0]] = value

opaque type _GMutex = CArray[Byte, Nat._8]
object _GMutex:
  given _tag: Tag[_GMutex] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
  def apply()(using Zone): Ptr[_GMutex] = 
    val ___ptr = alloc[_GMutex](1)
    ___ptr
  @scala.annotation.targetName("apply_p")
  def apply(p: gpointer)(using Zone): Ptr[_GMutex] =
    val ___ptr = alloc[_GMutex](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[gpointer]].update(0, p)
    ___ptr
  @scala.annotation.targetName("apply_i")
  def apply(i: CArray[guint, Nat._2])(using Zone): Ptr[_GMutex] =
    val ___ptr = alloc[_GMutex](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[CArray[guint, Nat._2]]].update(0, i)
    ___ptr
  extension (struct: _GMutex)
    def p : gpointer = !struct.at(0).asInstanceOf[Ptr[gpointer]]
    def p_=(value: gpointer): Unit = !struct.at(0).asInstanceOf[Ptr[gpointer]] = value
    def i : CArray[guint, Nat._2] = !struct.at(0).asInstanceOf[Ptr[CArray[guint, Nat._2]]]
    def i_=(value: CArray[guint, Nat._2]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[guint, Nat._2]]] = value

opaque type _GTokenValue = CArray[Byte, Nat._8]
object _GTokenValue:
  given _tag: Tag[_GTokenValue] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
  def apply()(using Zone): Ptr[_GTokenValue] = 
    val ___ptr = alloc[_GTokenValue](1)
    ___ptr
  @scala.annotation.targetName("apply_v_symbol")
  def apply(v_symbol: gpointer)(using Zone): Ptr[_GTokenValue] =
    val ___ptr = alloc[_GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[gpointer]].update(0, v_symbol)
    ___ptr
  @scala.annotation.targetName("apply_v_identifier")
  def apply(v_identifier: Ptr[gchar])(using Zone): Ptr[_GTokenValue] =
    val ___ptr = alloc[_GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[Ptr[gchar]]].update(0, v_identifier)
    ___ptr
  @scala.annotation.targetName("apply_v_binary")
  def apply(v_binary: gulong)(using Zone): Ptr[_GTokenValue] =
    val ___ptr = alloc[_GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[gulong]].update(0, v_binary)
    ___ptr
  @scala.annotation.targetName("apply_v_octal")
  def apply(v_octal: gulong)(using Zone): Ptr[_GTokenValue] =
    val ___ptr = alloc[_GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[gulong]].update(0, v_octal)
    ___ptr
  @scala.annotation.targetName("apply_v_int")
  def apply(v_int: gulong)(using Zone): Ptr[_GTokenValue] =
    val ___ptr = alloc[_GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[gulong]].update(0, v_int)
    ___ptr
  @scala.annotation.targetName("apply_v_int64")
  def apply(v_int64: guint64)(using Zone): Ptr[_GTokenValue] =
    val ___ptr = alloc[_GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[guint64]].update(0, v_int64)
    ___ptr
  @scala.annotation.targetName("apply_v_float")
  def apply(v_float: gdouble)(using Zone): Ptr[_GTokenValue] =
    val ___ptr = alloc[_GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[gdouble]].update(0, v_float)
    ___ptr
  @scala.annotation.targetName("apply_v_hex")
  def apply(v_hex: gulong)(using Zone): Ptr[_GTokenValue] =
    val ___ptr = alloc[_GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[gulong]].update(0, v_hex)
    ___ptr
  @scala.annotation.targetName("apply_v_string")
  def apply(v_string: Ptr[gchar])(using Zone): Ptr[_GTokenValue] =
    val ___ptr = alloc[_GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[Ptr[gchar]]].update(0, v_string)
    ___ptr
  @scala.annotation.targetName("apply_v_comment")
  def apply(v_comment: Ptr[gchar])(using Zone): Ptr[_GTokenValue] =
    val ___ptr = alloc[_GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[Ptr[gchar]]].update(0, v_comment)
    ___ptr
  @scala.annotation.targetName("apply_v_char")
  def apply(v_char: guchar)(using Zone): Ptr[_GTokenValue] =
    val ___ptr = alloc[_GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[guchar]].update(0, v_char)
    ___ptr
  @scala.annotation.targetName("apply_v_error")
  def apply(v_error: guint)(using Zone): Ptr[_GTokenValue] =
    val ___ptr = alloc[_GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[guint]].update(0, v_error)
    ___ptr
  extension (struct: _GTokenValue)
    def v_symbol : gpointer = !struct.at(0).asInstanceOf[Ptr[gpointer]]
    def v_symbol_=(value: gpointer): Unit = !struct.at(0).asInstanceOf[Ptr[gpointer]] = value
    def v_identifier : Ptr[gchar] = !struct.at(0).asInstanceOf[Ptr[Ptr[gchar]]]
    def v_identifier_=(value: Ptr[gchar]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[gchar]]] = value
    def v_binary : gulong = !struct.at(0).asInstanceOf[Ptr[gulong]]
    def v_binary_=(value: gulong): Unit = !struct.at(0).asInstanceOf[Ptr[gulong]] = value
    def v_octal : gulong = !struct.at(0).asInstanceOf[Ptr[gulong]]
    def v_octal_=(value: gulong): Unit = !struct.at(0).asInstanceOf[Ptr[gulong]] = value
    def v_int : gulong = !struct.at(0).asInstanceOf[Ptr[gulong]]
    def v_int_=(value: gulong): Unit = !struct.at(0).asInstanceOf[Ptr[gulong]] = value
    def v_int64 : guint64 = !struct.at(0).asInstanceOf[Ptr[guint64]]
    def v_int64_=(value: guint64): Unit = !struct.at(0).asInstanceOf[Ptr[guint64]] = value
    def v_float : gdouble = !struct.at(0).asInstanceOf[Ptr[gdouble]]
    def v_float_=(value: gdouble): Unit = !struct.at(0).asInstanceOf[Ptr[gdouble]] = value
    def v_hex : gulong = !struct.at(0).asInstanceOf[Ptr[gulong]]
    def v_hex_=(value: gulong): Unit = !struct.at(0).asInstanceOf[Ptr[gulong]] = value
    def v_string : Ptr[gchar] = !struct.at(0).asInstanceOf[Ptr[Ptr[gchar]]]
    def v_string_=(value: Ptr[gchar]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[gchar]]] = value
    def v_comment : Ptr[gchar] = !struct.at(0).asInstanceOf[Ptr[Ptr[gchar]]]
    def v_comment_=(value: Ptr[gchar]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[gchar]]] = value
    def v_char : guchar = !struct.at(0).asInstanceOf[Ptr[guchar]]
    def v_char_=(value: guchar): Unit = !struct.at(0).asInstanceOf[Ptr[guchar]] = value
    def v_error : guint = !struct.at(0).asInstanceOf[Ptr[guint]]
    def v_error_=(value: guint): Unit = !struct.at(0).asInstanceOf[Ptr[guint]] = value