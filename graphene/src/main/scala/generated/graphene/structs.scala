package graphene

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/graphene-1.0/include/graphene-config.h
*/
opaque type graphene_simd4x4f_t = CStruct4[graphene_simd4f_t, graphene_simd4f_t, graphene_simd4f_t, graphene_simd4f_t]
object graphene_simd4x4f_t:
  given _tag: Tag[graphene_simd4x4f_t] = Tag.materializeCStruct4Tag[graphene_simd4f_t, graphene_simd4f_t, graphene_simd4f_t, graphene_simd4f_t]
  def apply()(using Zone): Ptr[graphene_simd4x4f_t] = scala.scalanative.unsafe.alloc[graphene_simd4x4f_t](1)
  def apply(x : graphene_simd4f_t, y : graphene_simd4f_t, z : graphene_simd4f_t, w : graphene_simd4f_t)(using Zone): Ptr[graphene_simd4x4f_t] = 
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).z = z
    (!____ptr).w = w
    ____ptr
  extension (struct: graphene_simd4x4f_t)
    def x : graphene_simd4f_t = struct._1
    def x_=(value: graphene_simd4f_t): Unit = !struct.at1 = value
    def y : graphene_simd4f_t = struct._2
    def y_=(value: graphene_simd4f_t): Unit = !struct.at2 = value
    def z : graphene_simd4f_t = struct._3
    def z_=(value: graphene_simd4f_t): Unit = !struct.at3 = value
    def w : graphene_simd4f_t = struct._4
    def w_=(value: graphene_simd4f_t): Unit = !struct.at4 = value