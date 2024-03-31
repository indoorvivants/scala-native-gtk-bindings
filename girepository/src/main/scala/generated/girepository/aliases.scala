package girepository

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GIEnumInfo:

 * [bindgen] header: /usr/include/gobject-introspection-1.0/gitypes.h
*/
type GIEnumInfo = GIBaseInfo
object GIEnumInfo: 
  given _tag: Tag[GIEnumInfo] = GIBaseInfo._tag
  inline def apply(inline o: GIBaseInfo): GIEnumInfo = o
  extension (v: GIEnumInfo)
    inline def value: GIBaseInfo = v

/**
 * GIInterfaceInfo:

 * [bindgen] header: /usr/include/gobject-introspection-1.0/gitypes.h
*/
type GIInterfaceInfo = GIBaseInfo
object GIInterfaceInfo: 
  given _tag: Tag[GIInterfaceInfo] = GIBaseInfo._tag
  inline def apply(inline o: GIBaseInfo): GIInterfaceInfo = o
  extension (v: GIInterfaceInfo)
    inline def value: GIBaseInfo = v