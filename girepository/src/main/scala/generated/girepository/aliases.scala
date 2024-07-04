package girepository

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GIEnumInfo:
*/
type GIEnumInfo = GIBaseInfo
object GIEnumInfo: 
  given _tag: Tag[GIEnumInfo] = GIBaseInfo._tag
  inline def apply(inline o: GIBaseInfo): GIEnumInfo = o
  extension (v: GIEnumInfo)
    inline def value: GIBaseInfo = v

/**
 * GIInterfaceInfo:
*/
type GIInterfaceInfo = GIBaseInfo
object GIInterfaceInfo: 
  given _tag: Tag[GIInterfaceInfo] = GIBaseInfo._tag
  inline def apply(inline o: GIBaseInfo): GIInterfaceInfo = o
  extension (v: GIInterfaceInfo)
    inline def value: GIBaseInfo = v