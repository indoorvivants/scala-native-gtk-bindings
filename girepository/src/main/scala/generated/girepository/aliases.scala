package girepository
package aliases

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

import _root_.girepository.enumerations.*
import _root_.girepository.aliases.*
import _root_.girepository.structs.*
import _root_.girepository.unions.*

/**
 * [bindgen] header: /usr/include/gobject-introspection-1.0/gitypes.h
*/
type GArgument = GIArgument
object GArgument: 
  given _tag: Tag[GArgument] = GIArgument._tag
  inline def apply(inline o: GIArgument): GArgument = o
  extension (v: GArgument)
    inline def value: GIArgument = v

/**
 * GIArgInfo:

 * [bindgen] header: /usr/include/gobject-introspection-1.0/gitypes.h
*/
type GIArgInfo = GIBaseInfo
object GIArgInfo: 
  given _tag: Tag[GIArgInfo] = GIBaseInfo._tag
  inline def apply(inline o: GIBaseInfo): GIArgInfo = o
  extension (v: GIArgInfo)
    inline def value: GIBaseInfo = v

/**
 * GICallableInfo:

 * [bindgen] header: /usr/include/gobject-introspection-1.0/gitypes.h
*/
type GICallableInfo = GIBaseInfo
object GICallableInfo: 
  given _tag: Tag[GICallableInfo] = GIBaseInfo._tag
  inline def apply(inline o: GIBaseInfo): GICallableInfo = o
  extension (v: GICallableInfo)
    inline def value: GIBaseInfo = v

/**
 * GICallbackInfo:

 * [bindgen] header: /usr/include/gobject-introspection-1.0/gitypes.h
*/
type GICallbackInfo = GIBaseInfo
object GICallbackInfo: 
  given _tag: Tag[GICallbackInfo] = GIBaseInfo._tag
  inline def apply(inline o: GIBaseInfo): GICallbackInfo = o
  extension (v: GICallbackInfo)
    inline def value: GIBaseInfo = v

/**
 * GIConstantInfo:

 * [bindgen] header: /usr/include/gobject-introspection-1.0/gitypes.h
*/
type GIConstantInfo = GIBaseInfo
object GIConstantInfo: 
  given _tag: Tag[GIConstantInfo] = GIBaseInfo._tag
  inline def apply(inline o: GIBaseInfo): GIConstantInfo = o
  extension (v: GIConstantInfo)
    inline def value: GIBaseInfo = v

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
 * GIFieldInfo:

 * [bindgen] header: /usr/include/gobject-introspection-1.0/gitypes.h
*/
type GIFieldInfo = GIBaseInfo
object GIFieldInfo: 
  given _tag: Tag[GIFieldInfo] = GIBaseInfo._tag
  inline def apply(inline o: GIBaseInfo): GIFieldInfo = o
  extension (v: GIFieldInfo)
    inline def value: GIBaseInfo = v

/**
 * GIFunctionInfo:

 * [bindgen] header: /usr/include/gobject-introspection-1.0/gitypes.h
*/
type GIFunctionInfo = GIBaseInfo
object GIFunctionInfo: 
  given _tag: Tag[GIFunctionInfo] = GIBaseInfo._tag
  inline def apply(inline o: GIBaseInfo): GIFunctionInfo = o
  extension (v: GIFunctionInfo)
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

/**
 * GIObjectInfo:

 * [bindgen] header: /usr/include/gobject-introspection-1.0/gitypes.h
*/
type GIObjectInfo = GIBaseInfo
object GIObjectInfo: 
  given _tag: Tag[GIObjectInfo] = GIBaseInfo._tag
  inline def apply(inline o: GIBaseInfo): GIObjectInfo = o
  extension (v: GIObjectInfo)
    inline def value: GIBaseInfo = v

/**
 * GIObjectInfoGetValueFunction: (skip) : a #GValue

 * [bindgen] header: /usr/include/gobject-introspection-1.0/giobjectinfo.h
*/
opaque type GIObjectInfoGetValueFunction = CFuncPtr1[Ptr[_root_.gobject.all.GValue], Ptr[Byte]]
object GIObjectInfoGetValueFunction: 
  given _tag: Tag[GIObjectInfoGetValueFunction] = Tag.materializeCFuncPtr1[Ptr[_root_.gobject.all.GValue], Ptr[Byte]]
  inline def apply(inline o: CFuncPtr1[Ptr[_root_.gobject.all.GValue], Ptr[Byte]]): GIObjectInfoGetValueFunction = o
  extension (v: GIObjectInfoGetValueFunction)
    inline def value: CFuncPtr1[Ptr[_root_.gobject.all.GValue], Ptr[Byte]] = v

/**
 * GIObjectInfoRefFunction: (skip) : object instance pointer

 * [bindgen] header: /usr/include/gobject-introspection-1.0/giobjectinfo.h
*/
opaque type GIObjectInfoRefFunction = CFuncPtr1[Ptr[Byte], Ptr[Byte]]
object GIObjectInfoRefFunction: 
  given _tag: Tag[GIObjectInfoRefFunction] = Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[Byte]]
  inline def apply(inline o: CFuncPtr1[Ptr[Byte], Ptr[Byte]]): GIObjectInfoRefFunction = o
  extension (v: GIObjectInfoRefFunction)
    inline def value: CFuncPtr1[Ptr[Byte], Ptr[Byte]] = v

/**
 * GIObjectInfoSetValueFunction: (skip) : a #GValue : object instance pointer

 * [bindgen] header: /usr/include/gobject-introspection-1.0/giobjectinfo.h
*/
opaque type GIObjectInfoSetValueFunction = CFuncPtr2[Ptr[_root_.gobject.all.GValue], Ptr[Byte], Unit]
object GIObjectInfoSetValueFunction: 
  given _tag: Tag[GIObjectInfoSetValueFunction] = Tag.materializeCFuncPtr2[Ptr[_root_.gobject.all.GValue], Ptr[Byte], Unit]
  inline def apply(inline o: CFuncPtr2[Ptr[_root_.gobject.all.GValue], Ptr[Byte], Unit]): GIObjectInfoSetValueFunction = o
  extension (v: GIObjectInfoSetValueFunction)
    inline def value: CFuncPtr2[Ptr[_root_.gobject.all.GValue], Ptr[Byte], Unit] = v

/**
 * GIObjectInfoUnrefFunction: (skip) : object instance pointer

 * [bindgen] header: /usr/include/gobject-introspection-1.0/giobjectinfo.h
*/
opaque type GIObjectInfoUnrefFunction = CFuncPtr1[Ptr[Byte], Unit]
object GIObjectInfoUnrefFunction: 
  given _tag: Tag[GIObjectInfoUnrefFunction] = Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
  inline def apply(inline o: CFuncPtr1[Ptr[Byte], Unit]): GIObjectInfoUnrefFunction = o
  extension (v: GIObjectInfoUnrefFunction)
    inline def value: CFuncPtr1[Ptr[Byte], Unit] = v

/**
 * GIPropertyInfo:

 * [bindgen] header: /usr/include/gobject-introspection-1.0/gitypes.h
*/
type GIPropertyInfo = GIBaseInfo
object GIPropertyInfo: 
  given _tag: Tag[GIPropertyInfo] = GIBaseInfo._tag
  inline def apply(inline o: GIBaseInfo): GIPropertyInfo = o
  extension (v: GIPropertyInfo)
    inline def value: GIBaseInfo = v

/**
 * GIRegisteredTypeInfo:

 * [bindgen] header: /usr/include/gobject-introspection-1.0/gitypes.h
*/
type GIRegisteredTypeInfo = GIBaseInfo
object GIRegisteredTypeInfo: 
  given _tag: Tag[GIRegisteredTypeInfo] = GIBaseInfo._tag
  inline def apply(inline o: GIBaseInfo): GIRegisteredTypeInfo = o
  extension (v: GIRegisteredTypeInfo)
    inline def value: GIBaseInfo = v

/**
 * GISignalInfo:

 * [bindgen] header: /usr/include/gobject-introspection-1.0/gitypes.h
*/
type GISignalInfo = GIBaseInfo
object GISignalInfo: 
  given _tag: Tag[GISignalInfo] = GIBaseInfo._tag
  inline def apply(inline o: GIBaseInfo): GISignalInfo = o
  extension (v: GISignalInfo)
    inline def value: GIBaseInfo = v

/**
 * GIStructInfo:

 * [bindgen] header: /usr/include/gobject-introspection-1.0/gitypes.h
*/
type GIStructInfo = GIBaseInfo
object GIStructInfo: 
  given _tag: Tag[GIStructInfo] = GIBaseInfo._tag
  inline def apply(inline o: GIBaseInfo): GIStructInfo = o
  extension (v: GIStructInfo)
    inline def value: GIBaseInfo = v

/**
 * GITypeInfo:

 * [bindgen] header: /usr/include/gobject-introspection-1.0/gitypes.h
*/
type GITypeInfo = GIBaseInfo
object GITypeInfo: 
  given _tag: Tag[GITypeInfo] = GIBaseInfo._tag
  inline def apply(inline o: GIBaseInfo): GITypeInfo = o
  extension (v: GITypeInfo)
    inline def value: GIBaseInfo = v

/**
 * GIUnionInfo:

 * [bindgen] header: /usr/include/gobject-introspection-1.0/gitypes.h
*/
type GIUnionInfo = GIBaseInfo
object GIUnionInfo: 
  given _tag: Tag[GIUnionInfo] = GIBaseInfo._tag
  inline def apply(inline o: GIBaseInfo): GIUnionInfo = o
  extension (v: GIUnionInfo)
    inline def value: GIBaseInfo = v

/**
 * GIVFuncInfo:

 * [bindgen] header: /usr/include/gobject-introspection-1.0/gitypes.h
*/
type GIVFuncInfo = GIBaseInfo
object GIVFuncInfo: 
  given _tag: Tag[GIVFuncInfo] = GIBaseInfo._tag
  inline def apply(inline o: GIBaseInfo): GIVFuncInfo = o
  extension (v: GIVFuncInfo)
    inline def value: GIBaseInfo = v

/**
 * GIValueInfo:

 * [bindgen] header: /usr/include/gobject-introspection-1.0/gitypes.h
*/
type GIValueInfo = GIBaseInfo
object GIValueInfo: 
  given _tag: Tag[GIValueInfo] = GIBaseInfo._tag
  inline def apply(inline o: GIBaseInfo): GIValueInfo = o
  extension (v: GIValueInfo)
    inline def value: GIBaseInfo = v

type pthread_mutex_t = posix.sys.types.pthread_mutex_t
object pthread_mutex_t: 
  val _tag: Tag[pthread_mutex_t] = summon[Tag[posix.sys.types.pthread_mutex_t]]
  inline def apply(inline o: posix.sys.types.pthread_mutex_t): pthread_mutex_t = o
  extension (v: pthread_mutex_t)
    inline def value: posix.sys.types.pthread_mutex_t = v

type pthread_t = posix.sys.types.pthread_t
object pthread_t: 
  val _tag: Tag[pthread_t] = summon[Tag[posix.sys.types.pthread_t]]
  inline def apply(inline o: posix.sys.types.pthread_t): pthread_t = o
  extension (v: pthread_t)
    inline def value: posix.sys.types.pthread_t = v

type time_t = posix.sys.types.time_t
object time_t: 
  val _tag: Tag[time_t] = summon[Tag[posix.sys.types.time_t]]
  inline def apply(inline o: posix.sys.types.time_t): time_t = o
  extension (v: time_t)
    inline def value: posix.sys.types.time_t = v

type tm = posix.time.tm
object tm: 
  val _tag: Tag[tm] = summon[Tag[posix.time.tm]]
  inline def apply(inline o: posix.time.tm): tm = o
  extension (v: tm)
    inline def value: posix.time.tm = v

type va_list = unsafe.CVarArgList
object va_list: 
  val _tag: Tag[va_list] = summon[Tag[unsafe.CVarArgList]]
  inline def apply(inline o: unsafe.CVarArgList): va_list = o
  extension (v: va_list)
    inline def value: unsafe.CVarArgList = v

