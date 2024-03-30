package graphene
package aliases

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

import _root_.graphene.enumerations.*
import _root_.graphene.aliases.*
import _root_.graphene.structs.*
import _root_.graphene.unions.*

/**
 * [bindgen] header: /usr/lib/llvm-14/lib/clang/14.0.0/include/xmmintrin.h
*/
opaque type __m128 = CStruct4[Float, Float, Float, Float]
object __m128: 
  given _tag: Tag[__m128] = Tag.materializeCStruct4Tag[Float, Float, Float, Float]
  inline def apply(inline o: CStruct4[Float, Float, Float, Float]): __m128 = o
  extension (v: __m128)
    inline def value: CStruct4[Float, Float, Float, Float] = v

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/graphene-1.0/include/graphene-config.h
*/
type graphene_simd4f_t = __m128
object graphene_simd4f_t: 
  given _tag: Tag[graphene_simd4f_t] = __m128._tag
  inline def apply(inline o: __m128): graphene_simd4f_t = o
  extension (v: graphene_simd4f_t)
    inline def value: __m128 = v

