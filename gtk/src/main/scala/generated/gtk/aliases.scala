package gtk

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/lib/llvm-14/lib/clang/14.0.0/include/xmmintrin.h
*/
opaque type __m128 = CStruct4[Float, Float, Float, Float]
object __m128: 
  given _tag: Tag[__m128] = Tag.materializeCStruct4Tag[Float, Float, Float, Float]
  inline def apply(inline o: CStruct4[Float, Float, Float, Float]): __m128 = o
  extension (v: __m128)
    inline def value: CStruct4[Float, Float, Float, Float] = v