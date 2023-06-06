package girepository
package enumerations

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

private[girepository] trait CEnumU[T](using eq: T =:= UInt):
  given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
  extension (inline t: T)
   inline def int: CInt = eq.apply(t).toInt
   inline def uint: CUnsignedInt = eq.apply(t)
   inline def value: CUnsignedInt = eq.apply(t)
/**
 * GIArrayType: _ARRAY_TYPE_C: a C array, char[] for instance _ARRAY_TYPE_ARRAY: a array _ARRAY_TYPE_PTR_ARRAY: a #GPtrArray array _ARRAY_TYPE_BYTE_ARRAY: a #GByteArray array

 * [bindgen] header: /usr/include/gobject-introspection-1.0/gitypes.h
*/
opaque type GIArrayType = CUnsignedInt
object GIArrayType extends CEnumU[GIArrayType]:
  given _tag: Tag[GIArrayType] = Tag.UInt
  inline def define(inline a: Long): GIArrayType = a.toUInt
  val GI_ARRAY_TYPE_C = define(0)
  val GI_ARRAY_TYPE_ARRAY = define(1)
  val GI_ARRAY_TYPE_PTR_ARRAY = define(2)
  val GI_ARRAY_TYPE_BYTE_ARRAY = define(3)
  inline def getName(inline value: GIArrayType): Option[String] =
    inline value match
      case GI_ARRAY_TYPE_C => Some("GI_ARRAY_TYPE_C")
      case GI_ARRAY_TYPE_ARRAY => Some("GI_ARRAY_TYPE_ARRAY")
      case GI_ARRAY_TYPE_PTR_ARRAY => Some("GI_ARRAY_TYPE_PTR_ARRAY")
      case GI_ARRAY_TYPE_BYTE_ARRAY => Some("GI_ARRAY_TYPE_BYTE_ARRAY")
      case _ => None
  extension (a: GIArrayType)
    inline def &(b: GIArrayType): GIArrayType = a & b
    inline def |(b: GIArrayType): GIArrayType = a | b
    inline def is(b: GIArrayType): Boolean = (a & b) == b

/**
 * GIDirection: _DIRECTION_IN: in argument. _DIRECTION_OUT: out argument. _DIRECTION_INOUT: in and out argument.

 * [bindgen] header: /usr/include/gobject-introspection-1.0/gitypes.h
*/
opaque type GIDirection = CUnsignedInt
object GIDirection extends CEnumU[GIDirection]:
  given _tag: Tag[GIDirection] = Tag.UInt
  inline def define(inline a: Long): GIDirection = a.toUInt
  val GI_DIRECTION_IN = define(0)
  val GI_DIRECTION_OUT = define(1)
  val GI_DIRECTION_INOUT = define(2)
  inline def getName(inline value: GIDirection): Option[String] =
    inline value match
      case GI_DIRECTION_IN => Some("GI_DIRECTION_IN")
      case GI_DIRECTION_OUT => Some("GI_DIRECTION_OUT")
      case GI_DIRECTION_INOUT => Some("GI_DIRECTION_INOUT")
      case _ => None
  extension (a: GIDirection)
    inline def &(b: GIDirection): GIDirection = a & b
    inline def |(b: GIDirection): GIDirection = a | b
    inline def is(b: GIDirection): Boolean = (a & b) == b

/**
 * GIFieldInfoFlags: _FIELD_IS_READABLE: field is readable. _FIELD_IS_WRITABLE: field is writable.

 * [bindgen] header: /usr/include/gobject-introspection-1.0/gitypes.h
*/
opaque type GIFieldInfoFlags = CUnsignedInt
object GIFieldInfoFlags extends CEnumU[GIFieldInfoFlags]:
  given _tag: Tag[GIFieldInfoFlags] = Tag.UInt
  inline def define(inline a: Long): GIFieldInfoFlags = a.toUInt
  val GI_FIELD_IS_READABLE = define(1)
  val GI_FIELD_IS_WRITABLE = define(2)
  inline def getName(inline value: GIFieldInfoFlags): Option[String] =
    inline value match
      case GI_FIELD_IS_READABLE => Some("GI_FIELD_IS_READABLE")
      case GI_FIELD_IS_WRITABLE => Some("GI_FIELD_IS_WRITABLE")
      case _ => None
  extension (a: GIFieldInfoFlags)
    inline def &(b: GIFieldInfoFlags): GIFieldInfoFlags = a & b
    inline def |(b: GIFieldInfoFlags): GIFieldInfoFlags = a | b
    inline def is(b: GIFieldInfoFlags): Boolean = (a & b) == b

/**
 * GIFunctionInfoFlags: _FUNCTION_IS_METHOD: is a method. _FUNCTION_IS_CONSTRUCTOR: is a constructor. _FUNCTION_IS_GETTER: is a getter of a #GIPropertyInfo. _FUNCTION_IS_SETTER: is a setter of a #GIPropertyInfo. _FUNCTION_WRAPS_VFUNC: represents a virtual function. _FUNCTION_THROWS: the function may throw an error.

 * [bindgen] header: /usr/include/gobject-introspection-1.0/gitypes.h
*/
opaque type GIFunctionInfoFlags = CUnsignedInt
object GIFunctionInfoFlags extends CEnumU[GIFunctionInfoFlags]:
  given _tag: Tag[GIFunctionInfoFlags] = Tag.UInt
  inline def define(inline a: Long): GIFunctionInfoFlags = a.toUInt
  val GI_FUNCTION_IS_METHOD = define(1)
  val GI_FUNCTION_IS_CONSTRUCTOR = define(2)
  val GI_FUNCTION_IS_GETTER = define(4)
  val GI_FUNCTION_IS_SETTER = define(8)
  val GI_FUNCTION_WRAPS_VFUNC = define(16)
  val GI_FUNCTION_THROWS = define(32)
  inline def getName(inline value: GIFunctionInfoFlags): Option[String] =
    inline value match
      case GI_FUNCTION_IS_METHOD => Some("GI_FUNCTION_IS_METHOD")
      case GI_FUNCTION_IS_CONSTRUCTOR => Some("GI_FUNCTION_IS_CONSTRUCTOR")
      case GI_FUNCTION_IS_GETTER => Some("GI_FUNCTION_IS_GETTER")
      case GI_FUNCTION_IS_SETTER => Some("GI_FUNCTION_IS_SETTER")
      case GI_FUNCTION_WRAPS_VFUNC => Some("GI_FUNCTION_WRAPS_VFUNC")
      case GI_FUNCTION_THROWS => Some("GI_FUNCTION_THROWS")
      case _ => None
  extension (a: GIFunctionInfoFlags)
    inline def &(b: GIFunctionInfoFlags): GIFunctionInfoFlags = a & b
    inline def |(b: GIFunctionInfoFlags): GIFunctionInfoFlags = a | b
    inline def is(b: GIFunctionInfoFlags): Boolean = (a & b) == b

/**
 * GIInfoType: _INFO_TYPE_INVALID: invalid type _INFO_TYPE_FUNCTION: function, see #GIFunctionInfo _INFO_TYPE_CALLBACK: callback, see #GIFunctionInfo _INFO_TYPE_STRUCT: struct, see #GIStructInfo _INFO_TYPE_BOXED: boxed, see #GIStructInfo or #GIUnionInfo _INFO_TYPE_ENUM: enum, see #GIEnumInfo _INFO_TYPE_FLAGS: flags, see #GIEnumInfo _INFO_TYPE_OBJECT: object, see #GIObjectInfo _INFO_TYPE_INTERFACE: interface, see #GIInterfaceInfo _INFO_TYPE_CONSTANT: contant, see #GIConstantInfo _INFO_TYPE_INVALID_0: deleted, used to be GI_INFO_TYPE_ERROR_DOMAIN. _INFO_TYPE_UNION: union, see #GIUnionInfo _INFO_TYPE_VALUE: enum value, see #GIValueInfo _INFO_TYPE_SIGNAL: signal, see #GISignalInfo _INFO_TYPE_VFUNC: virtual function, see #GIVFuncInfo _INFO_TYPE_PROPERTY: GObject property, see #GIPropertyInfo _INFO_TYPE_FIELD: struct or union field, see #GIFieldInfo _INFO_TYPE_ARG: argument of a function or callback, see #GIArgInfo _INFO_TYPE_TYPE: type information, see #GITypeInfo _INFO_TYPE_UNRESOLVED: unresolved type, a type which is not present in the typelib, or any of its dependencies.

 * [bindgen] header: /usr/include/gobject-introspection-1.0/gitypes.h
*/
opaque type GIInfoType = CUnsignedInt
object GIInfoType extends CEnumU[GIInfoType]:
  given _tag: Tag[GIInfoType] = Tag.UInt
  inline def define(inline a: Long): GIInfoType = a.toUInt
  val GI_INFO_TYPE_INVALID = define(0)
  val GI_INFO_TYPE_FUNCTION = define(1)
  val GI_INFO_TYPE_CALLBACK = define(2)
  val GI_INFO_TYPE_STRUCT = define(3)
  val GI_INFO_TYPE_BOXED = define(4)
  val GI_INFO_TYPE_ENUM = define(5)
  val GI_INFO_TYPE_FLAGS = define(6)
  val GI_INFO_TYPE_OBJECT = define(7)
  val GI_INFO_TYPE_INTERFACE = define(8)
  val GI_INFO_TYPE_CONSTANT = define(9)
  val GI_INFO_TYPE_INVALID_0 = define(10)
  val GI_INFO_TYPE_UNION = define(11)
  val GI_INFO_TYPE_VALUE = define(12)
  val GI_INFO_TYPE_SIGNAL = define(13)
  val GI_INFO_TYPE_VFUNC = define(14)
  val GI_INFO_TYPE_PROPERTY = define(15)
  val GI_INFO_TYPE_FIELD = define(16)
  val GI_INFO_TYPE_ARG = define(17)
  val GI_INFO_TYPE_TYPE = define(18)
  val GI_INFO_TYPE_UNRESOLVED = define(19)
  inline def getName(inline value: GIInfoType): Option[String] =
    inline value match
      case GI_INFO_TYPE_INVALID => Some("GI_INFO_TYPE_INVALID")
      case GI_INFO_TYPE_FUNCTION => Some("GI_INFO_TYPE_FUNCTION")
      case GI_INFO_TYPE_CALLBACK => Some("GI_INFO_TYPE_CALLBACK")
      case GI_INFO_TYPE_STRUCT => Some("GI_INFO_TYPE_STRUCT")
      case GI_INFO_TYPE_BOXED => Some("GI_INFO_TYPE_BOXED")
      case GI_INFO_TYPE_ENUM => Some("GI_INFO_TYPE_ENUM")
      case GI_INFO_TYPE_FLAGS => Some("GI_INFO_TYPE_FLAGS")
      case GI_INFO_TYPE_OBJECT => Some("GI_INFO_TYPE_OBJECT")
      case GI_INFO_TYPE_INTERFACE => Some("GI_INFO_TYPE_INTERFACE")
      case GI_INFO_TYPE_CONSTANT => Some("GI_INFO_TYPE_CONSTANT")
      case GI_INFO_TYPE_INVALID_0 => Some("GI_INFO_TYPE_INVALID_0")
      case GI_INFO_TYPE_UNION => Some("GI_INFO_TYPE_UNION")
      case GI_INFO_TYPE_VALUE => Some("GI_INFO_TYPE_VALUE")
      case GI_INFO_TYPE_SIGNAL => Some("GI_INFO_TYPE_SIGNAL")
      case GI_INFO_TYPE_VFUNC => Some("GI_INFO_TYPE_VFUNC")
      case GI_INFO_TYPE_PROPERTY => Some("GI_INFO_TYPE_PROPERTY")
      case GI_INFO_TYPE_FIELD => Some("GI_INFO_TYPE_FIELD")
      case GI_INFO_TYPE_ARG => Some("GI_INFO_TYPE_ARG")
      case GI_INFO_TYPE_TYPE => Some("GI_INFO_TYPE_TYPE")
      case GI_INFO_TYPE_UNRESOLVED => Some("GI_INFO_TYPE_UNRESOLVED")
      case _ => None
  extension (a: GIInfoType)
    inline def &(b: GIInfoType): GIInfoType = a & b
    inline def |(b: GIInfoType): GIInfoType = a | b
    inline def is(b: GIInfoType): Boolean = (a & b) == b

/**
 * GIRepositoryError: _IREPOSITORY_ERROR_TYPELIB_NOT_FOUND: the typelib could not be found. _IREPOSITORY_ERROR_NAMESPACE_MISMATCH: the namespace does not match the requested namespace. _IREPOSITORY_ERROR_NAMESPACE_VERSION_CONFLICT: the version of the typelib does not match the requested version. _IREPOSITORY_ERROR_LIBRARY_NOT_FOUND: the library used by the typelib could not be found.

 * [bindgen] header: /usr/include/gobject-introspection-1.0/girepository.h
*/
opaque type GIRepositoryError = CUnsignedInt
object GIRepositoryError extends CEnumU[GIRepositoryError]:
  given _tag: Tag[GIRepositoryError] = Tag.UInt
  inline def define(inline a: Long): GIRepositoryError = a.toUInt
  val G_IREPOSITORY_ERROR_TYPELIB_NOT_FOUND = define(0)
  val G_IREPOSITORY_ERROR_NAMESPACE_MISMATCH = define(1)
  val G_IREPOSITORY_ERROR_NAMESPACE_VERSION_CONFLICT = define(2)
  val G_IREPOSITORY_ERROR_LIBRARY_NOT_FOUND = define(3)
  inline def getName(inline value: GIRepositoryError): Option[String] =
    inline value match
      case G_IREPOSITORY_ERROR_TYPELIB_NOT_FOUND => Some("G_IREPOSITORY_ERROR_TYPELIB_NOT_FOUND")
      case G_IREPOSITORY_ERROR_NAMESPACE_MISMATCH => Some("G_IREPOSITORY_ERROR_NAMESPACE_MISMATCH")
      case G_IREPOSITORY_ERROR_NAMESPACE_VERSION_CONFLICT => Some("G_IREPOSITORY_ERROR_NAMESPACE_VERSION_CONFLICT")
      case G_IREPOSITORY_ERROR_LIBRARY_NOT_FOUND => Some("G_IREPOSITORY_ERROR_LIBRARY_NOT_FOUND")
      case _ => None
  extension (a: GIRepositoryError)
    inline def &(b: GIRepositoryError): GIRepositoryError = a & b
    inline def |(b: GIRepositoryError): GIRepositoryError = a | b
    inline def is(b: GIRepositoryError): Boolean = (a & b) == b

/**
 * GIRepositoryLoadFlags: _IREPOSITORY_LOAD_FLAG_LAZY: Lazily load the typelib.

 * [bindgen] header: /usr/include/gobject-introspection-1.0/girepository.h
*/
opaque type GIRepositoryLoadFlags = CUnsignedInt
object GIRepositoryLoadFlags extends CEnumU[GIRepositoryLoadFlags]:
  given _tag: Tag[GIRepositoryLoadFlags] = Tag.UInt
  inline def define(inline a: Long): GIRepositoryLoadFlags = a.toUInt
  val G_IREPOSITORY_LOAD_FLAG_LAZY = define(1)
  inline def getName(inline value: GIRepositoryLoadFlags): Option[String] =
    inline value match
      case G_IREPOSITORY_LOAD_FLAG_LAZY => Some("G_IREPOSITORY_LOAD_FLAG_LAZY")
      case _ => None
  extension (a: GIRepositoryLoadFlags)
    inline def &(b: GIRepositoryLoadFlags): GIRepositoryLoadFlags = a & b
    inline def |(b: GIRepositoryLoadFlags): GIRepositoryLoadFlags = a | b
    inline def is(b: GIRepositoryLoadFlags): Boolean = (a & b) == b

/**
 * GIScopeType: _SCOPE_TYPE_INVALID: The argument is not of callback type. _SCOPE_TYPE_CALL: The callback and associated user_data is only used during the call to this function. _SCOPE_TYPE_ASYNC: The callback and associated user_data is only used until the callback is invoked, and the callback. is invoked always exactly once. _SCOPE_TYPE_NOTIFIED: The callback and associated user_data is used until the caller is notfied via the destroy_notify. _SCOPE_TYPE_FOREVER: The callback and associated user_data is used until the process terminates

 * [bindgen] header: /usr/include/gobject-introspection-1.0/gitypes.h
*/
opaque type GIScopeType = CUnsignedInt
object GIScopeType extends CEnumU[GIScopeType]:
  given _tag: Tag[GIScopeType] = Tag.UInt
  inline def define(inline a: Long): GIScopeType = a.toUInt
  val GI_SCOPE_TYPE_INVALID = define(0)
  val GI_SCOPE_TYPE_CALL = define(1)
  val GI_SCOPE_TYPE_ASYNC = define(2)
  val GI_SCOPE_TYPE_NOTIFIED = define(3)
  val GI_SCOPE_TYPE_FOREVER = define(4)
  inline def getName(inline value: GIScopeType): Option[String] =
    inline value match
      case GI_SCOPE_TYPE_INVALID => Some("GI_SCOPE_TYPE_INVALID")
      case GI_SCOPE_TYPE_CALL => Some("GI_SCOPE_TYPE_CALL")
      case GI_SCOPE_TYPE_ASYNC => Some("GI_SCOPE_TYPE_ASYNC")
      case GI_SCOPE_TYPE_NOTIFIED => Some("GI_SCOPE_TYPE_NOTIFIED")
      case GI_SCOPE_TYPE_FOREVER => Some("GI_SCOPE_TYPE_FOREVER")
      case _ => None
  extension (a: GIScopeType)
    inline def &(b: GIScopeType): GIScopeType = a & b
    inline def |(b: GIScopeType): GIScopeType = a | b
    inline def is(b: GIScopeType): Boolean = (a & b) == b

/**
 * GITransfer: _TRANSFER_NOTHING: transfer nothing from the callee (function or the type instance the property belongs to) to the caller. The callee retains the ownership of the transfer and the caller doesn't need to do anything to free up the resources of this transfer. _TRANSFER_CONTAINER: transfer the container (list, array, hash table) from the callee to the caller. The callee retains the ownership of the individual items in the container and the caller has to free up the container resources (g_list_free()/g_hash_table_destroy() etc) of this transfer. _TRANSFER_EVERYTHING: transfer everything, eg the container and its contents from the callee to the caller. This is the case when the callee creates a copy of all the data it returns. The caller is responsible for cleaning up the container and item resources of this transfer.

 * [bindgen] header: /usr/include/gobject-introspection-1.0/gitypes.h
*/
opaque type GITransfer = CUnsignedInt
object GITransfer extends CEnumU[GITransfer]:
  given _tag: Tag[GITransfer] = Tag.UInt
  inline def define(inline a: Long): GITransfer = a.toUInt
  val GI_TRANSFER_NOTHING = define(0)
  val GI_TRANSFER_CONTAINER = define(1)
  val GI_TRANSFER_EVERYTHING = define(2)
  inline def getName(inline value: GITransfer): Option[String] =
    inline value match
      case GI_TRANSFER_NOTHING => Some("GI_TRANSFER_NOTHING")
      case GI_TRANSFER_CONTAINER => Some("GI_TRANSFER_CONTAINER")
      case GI_TRANSFER_EVERYTHING => Some("GI_TRANSFER_EVERYTHING")
      case _ => None
  extension (a: GITransfer)
    inline def &(b: GITransfer): GITransfer = a & b
    inline def |(b: GITransfer): GITransfer = a | b
    inline def is(b: GITransfer): Boolean = (a & b) == b

/**
 * GITypeTag: _TYPE_TAG_VOID: void _TYPE_TAG_BOOLEAN: boolean _TYPE_TAG_INT8: 8-bit signed integer _TYPE_TAG_UINT8: 8-bit unsigned integer _TYPE_TAG_INT16: 16-bit signed integer _TYPE_TAG_UINT16: 16-bit unsigned integer _TYPE_TAG_INT32: 32-bit signed integer _TYPE_TAG_UINT32: 32-bit unsigned integer _TYPE_TAG_INT64: 64-bit signed integer _TYPE_TAG_UINT64: 64-bit unsigned integer _TYPE_TAG_FLOAT: float _TYPE_TAG_DOUBLE: double floating point _TYPE_TAG_GTYPE: a #GType _TYPE_TAG_UTF8: a UTF-8 encoded string _TYPE_TAG_FILENAME: a filename, encoded in the same encoding as the native filesystem is using. _TYPE_TAG_ARRAY: an array _TYPE_TAG_INTERFACE: an extended interface object _TYPE_TAG_GLIST: a #GList _TYPE_TAG_GSLIST: a #GSList _TYPE_TAG_GHASH: a #GHashTable _TYPE_TAG_ERROR: a #GError _TYPE_TAG_UNICHAR: Unicode character

 * [bindgen] header: /usr/include/gobject-introspection-1.0/gitypes.h
*/
opaque type GITypeTag = CUnsignedInt
object GITypeTag extends CEnumU[GITypeTag]:
  given _tag: Tag[GITypeTag] = Tag.UInt
  inline def define(inline a: Long): GITypeTag = a.toUInt
  val GI_TYPE_TAG_VOID = define(0)
  val GI_TYPE_TAG_BOOLEAN = define(1)
  val GI_TYPE_TAG_INT8 = define(2)
  val GI_TYPE_TAG_UINT8 = define(3)
  val GI_TYPE_TAG_INT16 = define(4)
  val GI_TYPE_TAG_UINT16 = define(5)
  val GI_TYPE_TAG_INT32 = define(6)
  val GI_TYPE_TAG_UINT32 = define(7)
  val GI_TYPE_TAG_INT64 = define(8)
  val GI_TYPE_TAG_UINT64 = define(9)
  val GI_TYPE_TAG_FLOAT = define(10)
  val GI_TYPE_TAG_DOUBLE = define(11)
  val GI_TYPE_TAG_GTYPE = define(12)
  val GI_TYPE_TAG_UTF8 = define(13)
  val GI_TYPE_TAG_FILENAME = define(14)
  val GI_TYPE_TAG_ARRAY = define(15)
  val GI_TYPE_TAG_INTERFACE = define(16)
  val GI_TYPE_TAG_GLIST = define(17)
  val GI_TYPE_TAG_GSLIST = define(18)
  val GI_TYPE_TAG_GHASH = define(19)
  val GI_TYPE_TAG_ERROR = define(20)
  val GI_TYPE_TAG_UNICHAR = define(21)
  inline def getName(inline value: GITypeTag): Option[String] =
    inline value match
      case GI_TYPE_TAG_VOID => Some("GI_TYPE_TAG_VOID")
      case GI_TYPE_TAG_BOOLEAN => Some("GI_TYPE_TAG_BOOLEAN")
      case GI_TYPE_TAG_INT8 => Some("GI_TYPE_TAG_INT8")
      case GI_TYPE_TAG_UINT8 => Some("GI_TYPE_TAG_UINT8")
      case GI_TYPE_TAG_INT16 => Some("GI_TYPE_TAG_INT16")
      case GI_TYPE_TAG_UINT16 => Some("GI_TYPE_TAG_UINT16")
      case GI_TYPE_TAG_INT32 => Some("GI_TYPE_TAG_INT32")
      case GI_TYPE_TAG_UINT32 => Some("GI_TYPE_TAG_UINT32")
      case GI_TYPE_TAG_INT64 => Some("GI_TYPE_TAG_INT64")
      case GI_TYPE_TAG_UINT64 => Some("GI_TYPE_TAG_UINT64")
      case GI_TYPE_TAG_FLOAT => Some("GI_TYPE_TAG_FLOAT")
      case GI_TYPE_TAG_DOUBLE => Some("GI_TYPE_TAG_DOUBLE")
      case GI_TYPE_TAG_GTYPE => Some("GI_TYPE_TAG_GTYPE")
      case GI_TYPE_TAG_UTF8 => Some("GI_TYPE_TAG_UTF8")
      case GI_TYPE_TAG_FILENAME => Some("GI_TYPE_TAG_FILENAME")
      case GI_TYPE_TAG_ARRAY => Some("GI_TYPE_TAG_ARRAY")
      case GI_TYPE_TAG_INTERFACE => Some("GI_TYPE_TAG_INTERFACE")
      case GI_TYPE_TAG_GLIST => Some("GI_TYPE_TAG_GLIST")
      case GI_TYPE_TAG_GSLIST => Some("GI_TYPE_TAG_GSLIST")
      case GI_TYPE_TAG_GHASH => Some("GI_TYPE_TAG_GHASH")
      case GI_TYPE_TAG_ERROR => Some("GI_TYPE_TAG_ERROR")
      case GI_TYPE_TAG_UNICHAR => Some("GI_TYPE_TAG_UNICHAR")
      case _ => None
  extension (a: GITypeTag)
    inline def &(b: GITypeTag): GITypeTag = a & b
    inline def |(b: GITypeTag): GITypeTag = a | b
    inline def is(b: GITypeTag): Boolean = (a & b) == b

/**
 * GIVFuncInfoFlags: _VFUNC_MUST_CHAIN_UP: chains up to the parent type _VFUNC_MUST_OVERRIDE: overrides _VFUNC_MUST_NOT_OVERRIDE: does not override _VFUNC_THROWS: Includes a #GError

 * [bindgen] header: /usr/include/gobject-introspection-1.0/gitypes.h
*/
opaque type GIVFuncInfoFlags = CUnsignedInt
object GIVFuncInfoFlags extends CEnumU[GIVFuncInfoFlags]:
  given _tag: Tag[GIVFuncInfoFlags] = Tag.UInt
  inline def define(inline a: Long): GIVFuncInfoFlags = a.toUInt
  val GI_VFUNC_MUST_CHAIN_UP = define(1)
  val GI_VFUNC_MUST_OVERRIDE = define(2)
  val GI_VFUNC_MUST_NOT_OVERRIDE = define(4)
  val GI_VFUNC_THROWS = define(8)
  inline def getName(inline value: GIVFuncInfoFlags): Option[String] =
    inline value match
      case GI_VFUNC_MUST_CHAIN_UP => Some("GI_VFUNC_MUST_CHAIN_UP")
      case GI_VFUNC_MUST_OVERRIDE => Some("GI_VFUNC_MUST_OVERRIDE")
      case GI_VFUNC_MUST_NOT_OVERRIDE => Some("GI_VFUNC_MUST_NOT_OVERRIDE")
      case GI_VFUNC_THROWS => Some("GI_VFUNC_THROWS")
      case _ => None
  extension (a: GIVFuncInfoFlags)
    inline def &(b: GIVFuncInfoFlags): GIVFuncInfoFlags = a & b
    inline def |(b: GIVFuncInfoFlags): GIVFuncInfoFlags = a | b
    inline def is(b: GIVFuncInfoFlags): Boolean = (a & b) == b

/**
 * GInvokeError: _INVOKE_ERROR_FAILED: invokation failed, unknown error. _INVOKE_ERROR_SYMBOL_NOT_FOUND: symbol couldn't be found in any of the libraries associated with the typelib of the function. _INVOKE_ERROR_ARGUMENT_MISMATCH: the arguments provided didn't match the expected arguments for the functions type signature.

 * [bindgen] header: /usr/include/gobject-introspection-1.0/gifunctioninfo.h
*/
opaque type GInvokeError = CUnsignedInt
object GInvokeError extends CEnumU[GInvokeError]:
  given _tag: Tag[GInvokeError] = Tag.UInt
  inline def define(inline a: Long): GInvokeError = a.toUInt
  val G_INVOKE_ERROR_FAILED = define(0)
  val G_INVOKE_ERROR_SYMBOL_NOT_FOUND = define(1)
  val G_INVOKE_ERROR_ARGUMENT_MISMATCH = define(2)
  inline def getName(inline value: GInvokeError): Option[String] =
    inline value match
      case G_INVOKE_ERROR_FAILED => Some("G_INVOKE_ERROR_FAILED")
      case G_INVOKE_ERROR_SYMBOL_NOT_FOUND => Some("G_INVOKE_ERROR_SYMBOL_NOT_FOUND")
      case G_INVOKE_ERROR_ARGUMENT_MISMATCH => Some("G_INVOKE_ERROR_ARGUMENT_MISMATCH")
      case _ => None
  extension (a: GInvokeError)
    inline def &(b: GInvokeError): GInvokeError = a & b
    inline def |(b: GInvokeError): GInvokeError = a | b
    inline def is(b: GInvokeError): Boolean = (a & b) == b

