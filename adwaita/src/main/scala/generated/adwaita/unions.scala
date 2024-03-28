package adwaita
package unions

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

import _root_.adwaita.enumerations.*
import _root_.adwaita.aliases.*
import _root_.adwaita.structs.*
import _root_.adwaita.unions.*

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
*/
opaque type GDoubleIEEE754 = CArray[Byte, Nat.Digit2[Nat._1, Nat._6]]
object GDoubleIEEE754:
  /**
   * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
  */
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
  given _tag: Tag[GDoubleIEEE754] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
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

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
*/
opaque type GFloatIEEE754 = CArray[Byte, Nat.Digit2[Nat._1, Nat._2]]
object GFloatIEEE754:
  /**
   * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
  */
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
  given _tag: Tag[GFloatIEEE754] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._2]](Tag.Byte, Tag.Digit2[Nat._1, Nat._2](Tag.Nat1, Tag.Nat2))
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

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gthread.h
*/
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

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gscanner.h
*/
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

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
opaque type GTypeCValue = CArray[Byte, Nat._1]
object GTypeCValue:
  given _tag: Tag[GTypeCValue] = Tag.CArray[CChar, Nat._1](Tag.Byte, Tag.Nat1)

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
*/
opaque type _GDoubleIEEE754 = CArray[Byte, Nat.Digit2[Nat._1, Nat._6]]
object _GDoubleIEEE754:
  /**
   * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
  */
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
  given _tag: Tag[_GDoubleIEEE754] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
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

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
*/
opaque type _GFloatIEEE754 = CArray[Byte, Nat.Digit2[Nat._1, Nat._2]]
object _GFloatIEEE754:
  /**
   * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
  */
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
  given _tag: Tag[_GFloatIEEE754] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._2]](Tag.Byte, Tag.Digit2[Nat._1, Nat._2](Tag.Nat1, Tag.Nat2))
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

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gthread.h
*/
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

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gscanner.h
*/
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

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
opaque type _GTypeCValue = CArray[Byte, Nat._1]
object _GTypeCValue:
  given _tag: Tag[_GTypeCValue] = Tag.CArray[CChar, Nat._1](Tag.Byte, Tag.Nat1)

/**
 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type _cairo_path_data_t = CArray[Byte, Nat.Digit2[Nat._1, Nat._6]]
object _cairo_path_data_t:
  /**
   * [bindgen] header: /usr/include/cairo/cairo.h
  */
  opaque type Struct0 = CStruct2[cairo_path_data_type_t, CInt]
  object Struct0:
    given _tag: Tag[Struct0] = Tag.materializeCStruct2Tag[cairo_path_data_type_t, CInt]
    def apply()(using Zone): Ptr[Struct0] = scala.scalanative.unsafe.alloc[Struct0](1)
    def apply(`type` : cairo_path_data_type_t, length : CInt)(using Zone): Ptr[Struct0] = 
      val ____ptr = apply()
      (!____ptr).`type` = `type`
      (!____ptr).length = length
      ____ptr
    extension (struct: Struct0)
      def `type` : cairo_path_data_type_t = struct._1
      def type_=(value: cairo_path_data_type_t): Unit = !struct.at1 = value
      def length : CInt = struct._2
      def length_=(value: CInt): Unit = !struct.at2 = value
  /**
   * [bindgen] header: /usr/include/cairo/cairo.h
  */
  opaque type Struct1 = CStruct2[Double, Double]
  object Struct1:
    given _tag: Tag[Struct1] = Tag.materializeCStruct2Tag[Double, Double]
    def apply()(using Zone): Ptr[Struct1] = scala.scalanative.unsafe.alloc[Struct1](1)
    def apply(x : Double, y : Double)(using Zone): Ptr[Struct1] = 
      val ____ptr = apply()
      (!____ptr).x = x
      (!____ptr).y = y
      ____ptr
    extension (struct: Struct1)
      def x : Double = struct._1
      def x_=(value: Double): Unit = !struct.at1 = value
      def y : Double = struct._2
      def y_=(value: Double): Unit = !struct.at2 = value
  given _tag: Tag[_cairo_path_data_t] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
  def apply()(using Zone): Ptr[_cairo_path_data_t] = 
    val ___ptr = alloc[_cairo_path_data_t](1)
    ___ptr
  @scala.annotation.targetName("apply_header")
  def apply(header: _cairo_path_data_t.Struct0)(using Zone): Ptr[_cairo_path_data_t] =
    val ___ptr = alloc[_cairo_path_data_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_cairo_path_data_t.Struct0]].update(0, header)
    ___ptr
  @scala.annotation.targetName("apply_point")
  def apply(point: _cairo_path_data_t.Struct1)(using Zone): Ptr[_cairo_path_data_t] =
    val ___ptr = alloc[_cairo_path_data_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_cairo_path_data_t.Struct1]].update(0, point)
    ___ptr
  extension (struct: _cairo_path_data_t)
    def header : _cairo_path_data_t.Struct0 = !struct.at(0).asInstanceOf[Ptr[_cairo_path_data_t.Struct0]]
    def header_=(value: _cairo_path_data_t.Struct0): Unit = !struct.at(0).asInstanceOf[Ptr[_cairo_path_data_t.Struct0]] = value
    def point : _cairo_path_data_t.Struct1 = !struct.at(0).asInstanceOf[Ptr[_cairo_path_data_t.Struct1]]
    def point_=(value: _cairo_path_data_t.Struct1): Unit = !struct.at(0).asInstanceOf[Ptr[_cairo_path_data_t.Struct1]] = value

/**
 * [bindgen] header: /usr/include/harfbuzz/hb-common.h
*/
opaque type _hb_var_int_t = CArray[Byte, Nat._4]
object _hb_var_int_t:
  given _tag: Tag[_hb_var_int_t] = Tag.CArray[CChar, Nat._4](Tag.Byte, Tag.Nat4)
  def apply()(using Zone): Ptr[_hb_var_int_t] = 
    val ___ptr = alloc[_hb_var_int_t](1)
    ___ptr
  @scala.annotation.targetName("apply_u32")
  def apply(u32: uint32_t)(using Zone): Ptr[_hb_var_int_t] =
    val ___ptr = alloc[_hb_var_int_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[uint32_t]].update(0, u32)
    ___ptr
  @scala.annotation.targetName("apply_i32")
  def apply(i32: int32_t)(using Zone): Ptr[_hb_var_int_t] =
    val ___ptr = alloc[_hb_var_int_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[int32_t]].update(0, i32)
    ___ptr
  @scala.annotation.targetName("apply_u16")
  def apply(u16: CArray[uint16_t, Nat._2])(using Zone): Ptr[_hb_var_int_t] =
    val ___ptr = alloc[_hb_var_int_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[CArray[uint16_t, Nat._2]]].update(0, u16)
    ___ptr
  @scala.annotation.targetName("apply_i16")
  def apply(i16: CArray[int16_t, Nat._2])(using Zone): Ptr[_hb_var_int_t] =
    val ___ptr = alloc[_hb_var_int_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[CArray[int16_t, Nat._2]]].update(0, i16)
    ___ptr
  @scala.annotation.targetName("apply_u8")
  def apply(u8: CArray[uint8_t, Nat._4])(using Zone): Ptr[_hb_var_int_t] =
    val ___ptr = alloc[_hb_var_int_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[CArray[uint8_t, Nat._4]]].update(0, u8)
    ___ptr
  @scala.annotation.targetName("apply_i8")
  def apply(i8: CArray[int8_t, Nat._4])(using Zone): Ptr[_hb_var_int_t] =
    val ___ptr = alloc[_hb_var_int_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[CArray[int8_t, Nat._4]]].update(0, i8)
    ___ptr
  extension (struct: _hb_var_int_t)
    def u32 : uint32_t = !struct.at(0).asInstanceOf[Ptr[uint32_t]]
    def u32_=(value: uint32_t): Unit = !struct.at(0).asInstanceOf[Ptr[uint32_t]] = value
    def i32 : int32_t = !struct.at(0).asInstanceOf[Ptr[int32_t]]
    def i32_=(value: int32_t): Unit = !struct.at(0).asInstanceOf[Ptr[int32_t]] = value
    def u16 : CArray[uint16_t, Nat._2] = !struct.at(0).asInstanceOf[Ptr[CArray[uint16_t, Nat._2]]]
    def u16_=(value: CArray[uint16_t, Nat._2]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[uint16_t, Nat._2]]] = value
    def i16 : CArray[int16_t, Nat._2] = !struct.at(0).asInstanceOf[Ptr[CArray[int16_t, Nat._2]]]
    def i16_=(value: CArray[int16_t, Nat._2]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[int16_t, Nat._2]]] = value
    def u8 : CArray[uint8_t, Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[uint8_t, Nat._4]]]
    def u8_=(value: CArray[uint8_t, Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[uint8_t, Nat._4]]] = value
    def i8 : CArray[int8_t, Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[int8_t, Nat._4]]]
    def i8_=(value: CArray[int8_t, Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[int8_t, Nat._4]]] = value

/**
 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type cairo_path_data_t = CArray[Byte, Nat.Digit2[Nat._1, Nat._6]]
object cairo_path_data_t:
  /**
   * [bindgen] header: /usr/include/cairo/cairo.h
  */
  opaque type Struct0 = CStruct2[cairo_path_data_type_t, CInt]
  object Struct0:
    given _tag: Tag[Struct0] = Tag.materializeCStruct2Tag[cairo_path_data_type_t, CInt]
    def apply()(using Zone): Ptr[Struct0] = scala.scalanative.unsafe.alloc[Struct0](1)
    def apply(`type` : cairo_path_data_type_t, length : CInt)(using Zone): Ptr[Struct0] = 
      val ____ptr = apply()
      (!____ptr).`type` = `type`
      (!____ptr).length = length
      ____ptr
    extension (struct: Struct0)
      def `type` : cairo_path_data_type_t = struct._1
      def type_=(value: cairo_path_data_type_t): Unit = !struct.at1 = value
      def length : CInt = struct._2
      def length_=(value: CInt): Unit = !struct.at2 = value
  /**
   * [bindgen] header: /usr/include/cairo/cairo.h
  */
  opaque type Struct1 = CStruct2[Double, Double]
  object Struct1:
    given _tag: Tag[Struct1] = Tag.materializeCStruct2Tag[Double, Double]
    def apply()(using Zone): Ptr[Struct1] = scala.scalanative.unsafe.alloc[Struct1](1)
    def apply(x : Double, y : Double)(using Zone): Ptr[Struct1] = 
      val ____ptr = apply()
      (!____ptr).x = x
      (!____ptr).y = y
      ____ptr
    extension (struct: Struct1)
      def x : Double = struct._1
      def x_=(value: Double): Unit = !struct.at1 = value
      def y : Double = struct._2
      def y_=(value: Double): Unit = !struct.at2 = value
  given _tag: Tag[cairo_path_data_t] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
  def apply()(using Zone): Ptr[cairo_path_data_t] = 
    val ___ptr = alloc[cairo_path_data_t](1)
    ___ptr
  @scala.annotation.targetName("apply_header")
  def apply(header: cairo_path_data_t.Struct0)(using Zone): Ptr[cairo_path_data_t] =
    val ___ptr = alloc[cairo_path_data_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[cairo_path_data_t.Struct0]].update(0, header)
    ___ptr
  @scala.annotation.targetName("apply_point")
  def apply(point: cairo_path_data_t.Struct1)(using Zone): Ptr[cairo_path_data_t] =
    val ___ptr = alloc[cairo_path_data_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[cairo_path_data_t.Struct1]].update(0, point)
    ___ptr
  extension (struct: cairo_path_data_t)
    def header : cairo_path_data_t.Struct0 = !struct.at(0).asInstanceOf[Ptr[cairo_path_data_t.Struct0]]
    def header_=(value: cairo_path_data_t.Struct0): Unit = !struct.at(0).asInstanceOf[Ptr[cairo_path_data_t.Struct0]] = value
    def point : cairo_path_data_t.Struct1 = !struct.at(0).asInstanceOf[Ptr[cairo_path_data_t.Struct1]]
    def point_=(value: cairo_path_data_t.Struct1): Unit = !struct.at(0).asInstanceOf[Ptr[cairo_path_data_t.Struct1]] = value

/**
 * [bindgen] header: /usr/include/graphene-1.0/graphene-simd4f.h
*/
opaque type graphene_simd4f_uif_t = CArray[Byte, Nat.Digit2[Nat._1, Nat._6]]
object graphene_simd4f_uif_t:
  given _tag: Tag[graphene_simd4f_uif_t] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
  def apply()(using Zone): Ptr[graphene_simd4f_uif_t] = 
    val ___ptr = alloc[graphene_simd4f_uif_t](1)
    ___ptr
  @scala.annotation.targetName("apply_ui")
  def apply(ui: CArray[CUnsignedInt, Nat._4])(using Zone): Ptr[graphene_simd4f_uif_t] =
    val ___ptr = alloc[graphene_simd4f_uif_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[CArray[CUnsignedInt, Nat._4]]].update(0, ui)
    ___ptr
  @scala.annotation.targetName("apply_f")
  def apply(f: CArray[Float, Nat._4])(using Zone): Ptr[graphene_simd4f_uif_t] =
    val ___ptr = alloc[graphene_simd4f_uif_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[CArray[Float, Nat._4]]].update(0, f)
    ___ptr
  extension (struct: graphene_simd4f_uif_t)
    def ui : CArray[CUnsignedInt, Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[CUnsignedInt, Nat._4]]]
    def ui_=(value: CArray[CUnsignedInt, Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[CUnsignedInt, Nat._4]]] = value
    def f : CArray[Float, Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Float, Nat._4]]]
    def f_=(value: CArray[Float, Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Float, Nat._4]]] = value

/**
 * [bindgen] header: /usr/include/graphene-1.0/graphene-simd4f.h
*/
opaque type graphene_simd4f_union_t = CArray[Byte, Nat.Digit2[Nat._1, Nat._6]]
object graphene_simd4f_union_t:
  given _tag: Tag[graphene_simd4f_union_t] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
  def apply()(using Zone): Ptr[graphene_simd4f_union_t] = 
    val ___ptr = alloc[graphene_simd4f_union_t](1)
    ___ptr
  @scala.annotation.targetName("apply_s")
  def apply(s: graphene_simd4f_t)(using Zone): Ptr[graphene_simd4f_union_t] =
    val ___ptr = alloc[graphene_simd4f_union_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[graphene_simd4f_t]].update(0, s)
    ___ptr
  @scala.annotation.targetName("apply_f")
  def apply(f: CArray[Float, Nat._4])(using Zone): Ptr[graphene_simd4f_union_t] =
    val ___ptr = alloc[graphene_simd4f_union_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[CArray[Float, Nat._4]]].update(0, f)
    ___ptr
  extension (struct: graphene_simd4f_union_t)
    def s : graphene_simd4f_t = !struct.at(0).asInstanceOf[Ptr[graphene_simd4f_t]]
    def s_=(value: graphene_simd4f_t): Unit = !struct.at(0).asInstanceOf[Ptr[graphene_simd4f_t]] = value
    def f : CArray[Float, Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Float, Nat._4]]]
    def f_=(value: CArray[Float, Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Float, Nat._4]]] = value

/**
 * [bindgen] header: /usr/include/harfbuzz/hb-common.h
*/
opaque type hb_var_int_t = CArray[Byte, Nat._4]
object hb_var_int_t:
  given _tag: Tag[hb_var_int_t] = Tag.CArray[CChar, Nat._4](Tag.Byte, Tag.Nat4)
  def apply()(using Zone): Ptr[hb_var_int_t] = 
    val ___ptr = alloc[hb_var_int_t](1)
    ___ptr
  @scala.annotation.targetName("apply_u32")
  def apply(u32: uint32_t)(using Zone): Ptr[hb_var_int_t] =
    val ___ptr = alloc[hb_var_int_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[uint32_t]].update(0, u32)
    ___ptr
  @scala.annotation.targetName("apply_i32")
  def apply(i32: int32_t)(using Zone): Ptr[hb_var_int_t] =
    val ___ptr = alloc[hb_var_int_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[int32_t]].update(0, i32)
    ___ptr
  @scala.annotation.targetName("apply_u16")
  def apply(u16: CArray[uint16_t, Nat._2])(using Zone): Ptr[hb_var_int_t] =
    val ___ptr = alloc[hb_var_int_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[CArray[uint16_t, Nat._2]]].update(0, u16)
    ___ptr
  @scala.annotation.targetName("apply_i16")
  def apply(i16: CArray[int16_t, Nat._2])(using Zone): Ptr[hb_var_int_t] =
    val ___ptr = alloc[hb_var_int_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[CArray[int16_t, Nat._2]]].update(0, i16)
    ___ptr
  @scala.annotation.targetName("apply_u8")
  def apply(u8: CArray[uint8_t, Nat._4])(using Zone): Ptr[hb_var_int_t] =
    val ___ptr = alloc[hb_var_int_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[CArray[uint8_t, Nat._4]]].update(0, u8)
    ___ptr
  @scala.annotation.targetName("apply_i8")
  def apply(i8: CArray[int8_t, Nat._4])(using Zone): Ptr[hb_var_int_t] =
    val ___ptr = alloc[hb_var_int_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[CArray[int8_t, Nat._4]]].update(0, i8)
    ___ptr
  extension (struct: hb_var_int_t)
    def u32 : uint32_t = !struct.at(0).asInstanceOf[Ptr[uint32_t]]
    def u32_=(value: uint32_t): Unit = !struct.at(0).asInstanceOf[Ptr[uint32_t]] = value
    def i32 : int32_t = !struct.at(0).asInstanceOf[Ptr[int32_t]]
    def i32_=(value: int32_t): Unit = !struct.at(0).asInstanceOf[Ptr[int32_t]] = value
    def u16 : CArray[uint16_t, Nat._2] = !struct.at(0).asInstanceOf[Ptr[CArray[uint16_t, Nat._2]]]
    def u16_=(value: CArray[uint16_t, Nat._2]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[uint16_t, Nat._2]]] = value
    def i16 : CArray[int16_t, Nat._2] = !struct.at(0).asInstanceOf[Ptr[CArray[int16_t, Nat._2]]]
    def i16_=(value: CArray[int16_t, Nat._2]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[int16_t, Nat._2]]] = value
    def u8 : CArray[uint8_t, Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[uint8_t, Nat._4]]]
    def u8_=(value: CArray[uint8_t, Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[uint8_t, Nat._4]]] = value
    def i8 : CArray[int8_t, Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[int8_t, Nat._4]]]
    def i8_=(value: CArray[int8_t, Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[int8_t, Nat._4]]] = value

