package sn.gnome.cairo.internal

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
*/
opaque type _cairo_path_data_t = CArray[Byte, Nat.Digit2[Nat._1, Nat._6]]
object _cairo_path_data_t:
  /**
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
*/
opaque type cairo_path_data_t = CArray[Byte, Nat.Digit2[Nat._1, Nat._6]]
object cairo_path_data_t:
  /**
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