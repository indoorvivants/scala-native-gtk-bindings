package sn.gnome.graphene.internal

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

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