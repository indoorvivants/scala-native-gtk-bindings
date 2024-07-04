package girepository

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
 * GIRepositoryError: _IREPOSITORY_ERROR_TYPELIB_NOT_FOUND: the typelib could not be found. _IREPOSITORY_ERROR_NAMESPACE_MISMATCH: the namespace does not match the requested namespace. _IREPOSITORY_ERROR_NAMESPACE_VERSION_CONFLICT: the version of the typelib does not match the requested version. _IREPOSITORY_ERROR_LIBRARY_NOT_FOUND: the library used by the typelib could not be found.
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
      case _ => _root_.scala.None
  extension (a: GIRepositoryError)
    inline def &(b: GIRepositoryError): GIRepositoryError = a & b
    inline def |(b: GIRepositoryError): GIRepositoryError = a | b
    inline def is(b: GIRepositoryError): Boolean = (a & b) == b

/**
 * GIRepositoryLoadFlags: _IREPOSITORY_LOAD_FLAG_LAZY: Lazily load the typelib.
*/
opaque type GIRepositoryLoadFlags = CUnsignedInt
object GIRepositoryLoadFlags extends CEnumU[GIRepositoryLoadFlags]:
  given _tag: Tag[GIRepositoryLoadFlags] = Tag.UInt
  inline def define(inline a: Long): GIRepositoryLoadFlags = a.toUInt
  val G_IREPOSITORY_LOAD_FLAG_LAZY = define(1)
  inline def getName(inline value: GIRepositoryLoadFlags): Option[String] =
    inline value match
      case G_IREPOSITORY_LOAD_FLAG_LAZY => Some("G_IREPOSITORY_LOAD_FLAG_LAZY")
      case _ => _root_.scala.None
  extension (a: GIRepositoryLoadFlags)
    inline def &(b: GIRepositoryLoadFlags): GIRepositoryLoadFlags = a & b
    inline def |(b: GIRepositoryLoadFlags): GIRepositoryLoadFlags = a | b
    inline def is(b: GIRepositoryLoadFlags): Boolean = (a & b) == b