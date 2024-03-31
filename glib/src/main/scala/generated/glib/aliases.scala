package glib

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/glib-2.0/include/glibconfig.h
*/
opaque type GPid = CInt
object GPid: 
  given _tag: Tag[GPid] = Tag.Int
  inline def apply(inline o: CInt): GPid = o
  extension (v: GPid)
    inline def value: CInt = v

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/glib-2.0/include/glibconfig.h
*/
opaque type gint16 = CShort
object gint16: 
  given _tag: Tag[gint16] = Tag.Short
  inline def apply(inline o: CShort): gint16 = o
  extension (v: gint16)
    inline def value: CShort = v

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/glib-2.0/include/glibconfig.h
*/
opaque type gint32 = CInt
object gint32: 
  given _tag: Tag[gint32] = Tag.Int
  inline def apply(inline o: CInt): gint32 = o
  extension (v: gint32)
    inline def value: CInt = v

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/glib-2.0/include/glibconfig.h
*/
opaque type gint64 = CLongInt
object gint64: 
  given _tag: Tag[gint64] = Tag.Long
  inline def apply(inline o: CLongInt): gint64 = o
  extension (v: gint64)
    inline def value: CLongInt = v

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/glib-2.0/include/glibconfig.h
*/
opaque type gint8 = CChar
object gint8: 
  given _tag: Tag[gint8] = Tag.Byte
  inline def apply(inline o: CChar): gint8 = o
  extension (v: gint8)
    inline def value: CChar = v

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/glib-2.0/include/glibconfig.h
*/
opaque type gintptr = CLongInt
object gintptr: 
  given _tag: Tag[gintptr] = Tag.Long
  inline def apply(inline o: CLongInt): gintptr = o
  extension (v: gintptr)
    inline def value: CLongInt = v

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/glib-2.0/include/glibconfig.h
*/
type goffset = gint64
object goffset: 
  given _tag: Tag[goffset] = gint64._tag
  inline def apply(inline o: gint64): goffset = o
  extension (v: goffset)
    inline def value: gint64 = v

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/glib-2.0/include/glibconfig.h
*/
opaque type gsize = CUnsignedLongInt
object gsize: 
  given _tag: Tag[gsize] = Tag.ULong
  inline def apply(inline o: CUnsignedLongInt): gsize = o
  extension (v: gsize)
    inline def value: CUnsignedLongInt = v

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/glib-2.0/include/glibconfig.h
*/
opaque type gssize = CLongInt
object gssize: 
  given _tag: Tag[gssize] = Tag.Long
  inline def apply(inline o: CLongInt): gssize = o
  extension (v: gssize)
    inline def value: CLongInt = v

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/glib-2.0/include/glibconfig.h
*/
opaque type guint16 = CUnsignedShort
object guint16: 
  given _tag: Tag[guint16] = Tag.UShort
  inline def apply(inline o: CUnsignedShort): guint16 = o
  extension (v: guint16)
    inline def value: CUnsignedShort = v

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/glib-2.0/include/glibconfig.h
*/
opaque type guint32 = CUnsignedInt
object guint32: 
  given _tag: Tag[guint32] = Tag.UInt
  inline def apply(inline o: CUnsignedInt): guint32 = o
  extension (v: guint32)
    inline def value: CUnsignedInt = v

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/glib-2.0/include/glibconfig.h
*/
opaque type guint64 = CUnsignedLongInt
object guint64: 
  given _tag: Tag[guint64] = Tag.ULong
  inline def apply(inline o: CUnsignedLongInt): guint64 = o
  extension (v: guint64)
    inline def value: CUnsignedLongInt = v

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/glib-2.0/include/glibconfig.h
*/
opaque type guint8 = CUnsignedChar
object guint8: 
  given _tag: Tag[guint8] = Tag.UByte
  inline def apply(inline o: CUnsignedChar): guint8 = o
  extension (v: guint8)
    inline def value: CUnsignedChar = v

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/glib-2.0/include/glibconfig.h
*/
opaque type guintptr = CUnsignedLongInt
object guintptr: 
  given _tag: Tag[guintptr] = Tag.ULong
  inline def apply(inline o: CUnsignedLongInt): guintptr = o
  extension (v: guintptr)
    inline def value: CUnsignedLongInt = v