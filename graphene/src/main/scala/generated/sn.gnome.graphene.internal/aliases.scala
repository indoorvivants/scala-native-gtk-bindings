package sn.gnome.graphene.internal

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type float32_t = Float
object float32_t: 
  given _tag: Tag[float32_t] = Tag.Float
  inline def apply(inline o: Float): float32_t = o
  extension (v: float32_t)
    inline def value: Float = v

opaque type float32x2_t = CStruct2[float32_t, float32_t]
object float32x2_t: 
  given _tag: Tag[float32x2_t] = Tag.materializeCStruct2Tag[float32_t, float32_t]
  inline def apply(inline o: CStruct2[float32_t, float32_t]): float32x2_t = o
  extension (v: float32x2_t)
    inline def value: CStruct2[float32_t, float32_t] = v

opaque type float32x4_t = CStruct4[float32_t, float32_t, float32_t, float32_t]
object float32x4_t: 
  given _tag: Tag[float32x4_t] = Tag.materializeCStruct4Tag[float32_t, float32_t, float32_t, float32_t]
  inline def apply(inline o: CStruct4[float32_t, float32_t, float32_t, float32_t]): float32x4_t = o
  extension (v: float32x4_t)
    inline def value: CStruct4[float32_t, float32_t, float32_t, float32_t] = v

type graphene_simd2f_t = float32x2_t
object graphene_simd2f_t: 
  given _tag: Tag[graphene_simd2f_t] = float32x2_t._tag
  inline def apply(inline o: float32x2_t): graphene_simd2f_t = o
  extension (v: graphene_simd2f_t)
    inline def value: float32x2_t = v

type graphene_simd4f_t = float32x4_t
object graphene_simd4f_t: 
  given _tag: Tag[graphene_simd4f_t] = float32x4_t._tag
  inline def apply(inline o: float32x4_t): graphene_simd4f_t = o
  extension (v: graphene_simd4f_t)
    inline def value: float32x4_t = v