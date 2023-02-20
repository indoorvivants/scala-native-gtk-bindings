package glib
package enumerations

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

private[glib] trait CEnum[T](using eq: T =:= Int):
  given Tag[T] = Tag.Int.asInstanceOf[Tag[T]]
  extension (inline t: T) 
    inline def int: CInt = eq.apply(t)
    inline def value: CInt = eq.apply(t)
private[glib] trait CEnumU[T](using eq: T =:= UInt):
  given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
  extension (inline t: T)
   inline def int: CInt = eq.apply(t).toInt
   inline def uint: CUnsignedInt = eq.apply(t)
   inline def value: CUnsignedInt = eq.apply(t)
/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gstrfuncs.h
*/
opaque type GAsciiType = CUnsignedInt
object GAsciiType extends CEnumU[GAsciiType]:
  given _tag: Tag[GAsciiType] = Tag.UInt
  inline def define(inline a: Long): GAsciiType = a.toUInt
  val G_ASCII_ALNUM = define(1)
  val G_ASCII_ALPHA = define(2)
  val G_ASCII_CNTRL = define(4)
  val G_ASCII_DIGIT = define(8)
  val G_ASCII_GRAPH = define(16)
  val G_ASCII_LOWER = define(32)
  val G_ASCII_PRINT = define(64)
  val G_ASCII_PUNCT = define(128)
  val G_ASCII_SPACE = define(256)
  val G_ASCII_UPPER = define(512)
  val G_ASCII_XDIGIT = define(1024)
  inline def getName(inline value: GAsciiType): Option[String] =
    inline value match
      case G_ASCII_ALNUM => Some("G_ASCII_ALNUM")
      case G_ASCII_ALPHA => Some("G_ASCII_ALPHA")
      case G_ASCII_CNTRL => Some("G_ASCII_CNTRL")
      case G_ASCII_DIGIT => Some("G_ASCII_DIGIT")
      case G_ASCII_GRAPH => Some("G_ASCII_GRAPH")
      case G_ASCII_LOWER => Some("G_ASCII_LOWER")
      case G_ASCII_PRINT => Some("G_ASCII_PRINT")
      case G_ASCII_PUNCT => Some("G_ASCII_PUNCT")
      case G_ASCII_SPACE => Some("G_ASCII_SPACE")
      case G_ASCII_UPPER => Some("G_ASCII_UPPER")
      case G_ASCII_XDIGIT => Some("G_ASCII_XDIGIT")
      case _ => None
  extension (a: GAsciiType)
    inline def &(b: GAsciiType): GAsciiType = a & b
    inline def |(b: GAsciiType): GAsciiType = a | b
    inline def is(b: GAsciiType): Boolean = (a & b) == b

/**
 * GBookmarkFileError: _BOOKMARK_FILE_ERROR_INVALID_URI: URI was ill-formed _BOOKMARK_FILE_ERROR_INVALID_VALUE: a requested field was not found _BOOKMARK_FILE_ERROR_APP_NOT_REGISTERED: a requested application did not register a bookmark _BOOKMARK_FILE_ERROR_URI_NOT_FOUND: a requested URI was not found _BOOKMARK_FILE_ERROR_READ: document was ill formed _BOOKMARK_FILE_ERROR_UNKNOWN_ENCODING: the text being parsed was in an unknown encoding _BOOKMARK_FILE_ERROR_WRITE: an error occurred while writing _BOOKMARK_FILE_ERROR_FILE_NOT_FOUND: requested file was not found

 * [bindgen] header: /usr/include/glib-2.0/glib/gbookmarkfile.h
*/
opaque type GBookmarkFileError = CUnsignedInt
object GBookmarkFileError extends CEnumU[GBookmarkFileError]:
  given _tag: Tag[GBookmarkFileError] = Tag.UInt
  inline def define(inline a: Long): GBookmarkFileError = a.toUInt
  val G_BOOKMARK_FILE_ERROR_INVALID_URI = define(0)
  val G_BOOKMARK_FILE_ERROR_INVALID_VALUE = define(1)
  val G_BOOKMARK_FILE_ERROR_APP_NOT_REGISTERED = define(2)
  val G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND = define(3)
  val G_BOOKMARK_FILE_ERROR_READ = define(4)
  val G_BOOKMARK_FILE_ERROR_UNKNOWN_ENCODING = define(5)
  val G_BOOKMARK_FILE_ERROR_WRITE = define(6)
  val G_BOOKMARK_FILE_ERROR_FILE_NOT_FOUND = define(7)
  inline def getName(inline value: GBookmarkFileError): Option[String] =
    inline value match
      case G_BOOKMARK_FILE_ERROR_INVALID_URI => Some("G_BOOKMARK_FILE_ERROR_INVALID_URI")
      case G_BOOKMARK_FILE_ERROR_INVALID_VALUE => Some("G_BOOKMARK_FILE_ERROR_INVALID_VALUE")
      case G_BOOKMARK_FILE_ERROR_APP_NOT_REGISTERED => Some("G_BOOKMARK_FILE_ERROR_APP_NOT_REGISTERED")
      case G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND => Some("G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND")
      case G_BOOKMARK_FILE_ERROR_READ => Some("G_BOOKMARK_FILE_ERROR_READ")
      case G_BOOKMARK_FILE_ERROR_UNKNOWN_ENCODING => Some("G_BOOKMARK_FILE_ERROR_UNKNOWN_ENCODING")
      case G_BOOKMARK_FILE_ERROR_WRITE => Some("G_BOOKMARK_FILE_ERROR_WRITE")
      case G_BOOKMARK_FILE_ERROR_FILE_NOT_FOUND => Some("G_BOOKMARK_FILE_ERROR_FILE_NOT_FOUND")
      case _ => None
  extension (a: GBookmarkFileError)
    inline def &(b: GBookmarkFileError): GBookmarkFileError = a & b
    inline def |(b: GBookmarkFileError): GBookmarkFileError = a | b
    inline def is(b: GBookmarkFileError): Boolean = (a & b) == b

/**
 * GChecksumType: _CHECKSUM_MD5: Use the MD5 hashing algorithm _CHECKSUM_SHA1: Use the SHA-1 hashing algorithm _CHECKSUM_SHA256: Use the SHA-256 hashing algorithm _CHECKSUM_SHA384: Use the SHA-384 hashing algorithm (Since: 2.51) _CHECKSUM_SHA512: Use the SHA-512 hashing algorithm (Since: 2.36)

 * [bindgen] header: /usr/include/glib-2.0/glib/gchecksum.h
*/
opaque type GChecksumType = CUnsignedInt
object GChecksumType extends CEnumU[GChecksumType]:
  given _tag: Tag[GChecksumType] = Tag.UInt
  inline def define(inline a: Long): GChecksumType = a.toUInt
  val G_CHECKSUM_MD5 = define(0)
  val G_CHECKSUM_SHA1 = define(1)
  val G_CHECKSUM_SHA256 = define(2)
  val G_CHECKSUM_SHA512 = define(3)
  val G_CHECKSUM_SHA384 = define(4)
  inline def getName(inline value: GChecksumType): Option[String] =
    inline value match
      case G_CHECKSUM_MD5 => Some("G_CHECKSUM_MD5")
      case G_CHECKSUM_SHA1 => Some("G_CHECKSUM_SHA1")
      case G_CHECKSUM_SHA256 => Some("G_CHECKSUM_SHA256")
      case G_CHECKSUM_SHA512 => Some("G_CHECKSUM_SHA512")
      case G_CHECKSUM_SHA384 => Some("G_CHECKSUM_SHA384")
      case _ => None
  extension (a: GChecksumType)
    inline def &(b: GChecksumType): GChecksumType = a & b
    inline def |(b: GChecksumType): GChecksumType = a | b
    inline def is(b: GChecksumType): Boolean = (a & b) == b

/**
 * GConvertError: _CONVERT_ERROR_NO_CONVERSION: Conversion between the requested character sets is not supported. _CONVERT_ERROR_ILLEGAL_SEQUENCE: Invalid byte sequence in conversion input; or the character sequence could not be represented in the target character set. _CONVERT_ERROR_FAILED: Conversion failed for some reason. _CONVERT_ERROR_PARTIAL_INPUT: Partial character sequence at end of input. _CONVERT_ERROR_BAD_URI: URI is invalid. _CONVERT_ERROR_NOT_ABSOLUTE_PATH: Pathname is not an absolute path. _CONVERT_ERROR_NO_MEMORY: No memory available. Since: 2.40 _CONVERT_ERROR_EMBEDDED_NUL: An embedded NUL character is present in conversion output where a NUL-terminated string is expected. Since: 2.56

 * [bindgen] header: /usr/include/glib-2.0/glib/gconvert.h
*/
opaque type GConvertError = CUnsignedInt
object GConvertError extends CEnumU[GConvertError]:
  given _tag: Tag[GConvertError] = Tag.UInt
  inline def define(inline a: Long): GConvertError = a.toUInt
  val G_CONVERT_ERROR_NO_CONVERSION = define(0)
  val G_CONVERT_ERROR_ILLEGAL_SEQUENCE = define(1)
  val G_CONVERT_ERROR_FAILED = define(2)
  val G_CONVERT_ERROR_PARTIAL_INPUT = define(3)
  val G_CONVERT_ERROR_BAD_URI = define(4)
  val G_CONVERT_ERROR_NOT_ABSOLUTE_PATH = define(5)
  val G_CONVERT_ERROR_NO_MEMORY = define(6)
  val G_CONVERT_ERROR_EMBEDDED_NUL = define(7)
  inline def getName(inline value: GConvertError): Option[String] =
    inline value match
      case G_CONVERT_ERROR_NO_CONVERSION => Some("G_CONVERT_ERROR_NO_CONVERSION")
      case G_CONVERT_ERROR_ILLEGAL_SEQUENCE => Some("G_CONVERT_ERROR_ILLEGAL_SEQUENCE")
      case G_CONVERT_ERROR_FAILED => Some("G_CONVERT_ERROR_FAILED")
      case G_CONVERT_ERROR_PARTIAL_INPUT => Some("G_CONVERT_ERROR_PARTIAL_INPUT")
      case G_CONVERT_ERROR_BAD_URI => Some("G_CONVERT_ERROR_BAD_URI")
      case G_CONVERT_ERROR_NOT_ABSOLUTE_PATH => Some("G_CONVERT_ERROR_NOT_ABSOLUTE_PATH")
      case G_CONVERT_ERROR_NO_MEMORY => Some("G_CONVERT_ERROR_NO_MEMORY")
      case G_CONVERT_ERROR_EMBEDDED_NUL => Some("G_CONVERT_ERROR_EMBEDDED_NUL")
      case _ => None
  extension (a: GConvertError)
    inline def &(b: GConvertError): GConvertError = a & b
    inline def |(b: GConvertError): GConvertError = a | b
    inline def is(b: GConvertError): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gdate.h
*/
opaque type GDateDMY = CUnsignedInt
object GDateDMY extends CEnumU[GDateDMY]:
  given _tag: Tag[GDateDMY] = Tag.UInt
  inline def define(inline a: Long): GDateDMY = a.toUInt
  val G_DATE_DAY = define(0)
  val G_DATE_MONTH = define(1)
  val G_DATE_YEAR = define(2)
  inline def getName(inline value: GDateDMY): Option[String] =
    inline value match
      case G_DATE_DAY => Some("G_DATE_DAY")
      case G_DATE_MONTH => Some("G_DATE_MONTH")
      case G_DATE_YEAR => Some("G_DATE_YEAR")
      case _ => None
  extension (a: GDateDMY)
    inline def &(b: GDateDMY): GDateDMY = a & b
    inline def |(b: GDateDMY): GDateDMY = a | b
    inline def is(b: GDateDMY): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gdate.h
*/
opaque type GDateMonth = CUnsignedInt
object GDateMonth extends CEnumU[GDateMonth]:
  given _tag: Tag[GDateMonth] = Tag.UInt
  inline def define(inline a: Long): GDateMonth = a.toUInt
  val G_DATE_BAD_MONTH = define(0)
  val G_DATE_JANUARY = define(1)
  val G_DATE_FEBRUARY = define(2)
  val G_DATE_MARCH = define(3)
  val G_DATE_APRIL = define(4)
  val G_DATE_MAY = define(5)
  val G_DATE_JUNE = define(6)
  val G_DATE_JULY = define(7)
  val G_DATE_AUGUST = define(8)
  val G_DATE_SEPTEMBER = define(9)
  val G_DATE_OCTOBER = define(10)
  val G_DATE_NOVEMBER = define(11)
  val G_DATE_DECEMBER = define(12)
  inline def getName(inline value: GDateMonth): Option[String] =
    inline value match
      case G_DATE_BAD_MONTH => Some("G_DATE_BAD_MONTH")
      case G_DATE_JANUARY => Some("G_DATE_JANUARY")
      case G_DATE_FEBRUARY => Some("G_DATE_FEBRUARY")
      case G_DATE_MARCH => Some("G_DATE_MARCH")
      case G_DATE_APRIL => Some("G_DATE_APRIL")
      case G_DATE_MAY => Some("G_DATE_MAY")
      case G_DATE_JUNE => Some("G_DATE_JUNE")
      case G_DATE_JULY => Some("G_DATE_JULY")
      case G_DATE_AUGUST => Some("G_DATE_AUGUST")
      case G_DATE_SEPTEMBER => Some("G_DATE_SEPTEMBER")
      case G_DATE_OCTOBER => Some("G_DATE_OCTOBER")
      case G_DATE_NOVEMBER => Some("G_DATE_NOVEMBER")
      case G_DATE_DECEMBER => Some("G_DATE_DECEMBER")
      case _ => None
  extension (a: GDateMonth)
    inline def &(b: GDateMonth): GDateMonth = a & b
    inline def |(b: GDateMonth): GDateMonth = a | b
    inline def is(b: GDateMonth): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gdate.h
*/
opaque type GDateWeekday = CUnsignedInt
object GDateWeekday extends CEnumU[GDateWeekday]:
  given _tag: Tag[GDateWeekday] = Tag.UInt
  inline def define(inline a: Long): GDateWeekday = a.toUInt
  val G_DATE_BAD_WEEKDAY = define(0)
  val G_DATE_MONDAY = define(1)
  val G_DATE_TUESDAY = define(2)
  val G_DATE_WEDNESDAY = define(3)
  val G_DATE_THURSDAY = define(4)
  val G_DATE_FRIDAY = define(5)
  val G_DATE_SATURDAY = define(6)
  val G_DATE_SUNDAY = define(7)
  inline def getName(inline value: GDateWeekday): Option[String] =
    inline value match
      case G_DATE_BAD_WEEKDAY => Some("G_DATE_BAD_WEEKDAY")
      case G_DATE_MONDAY => Some("G_DATE_MONDAY")
      case G_DATE_TUESDAY => Some("G_DATE_TUESDAY")
      case G_DATE_WEDNESDAY => Some("G_DATE_WEDNESDAY")
      case G_DATE_THURSDAY => Some("G_DATE_THURSDAY")
      case G_DATE_FRIDAY => Some("G_DATE_FRIDAY")
      case G_DATE_SATURDAY => Some("G_DATE_SATURDAY")
      case G_DATE_SUNDAY => Some("G_DATE_SUNDAY")
      case _ => None
  extension (a: GDateWeekday)
    inline def &(b: GDateWeekday): GDateWeekday = a & b
    inline def |(b: GDateWeekday): GDateWeekday = a | b
    inline def is(b: GDateWeekday): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gscanner.h
*/
opaque type GErrorType = CUnsignedInt
object GErrorType extends CEnumU[GErrorType]:
  given _tag: Tag[GErrorType] = Tag.UInt
  inline def define(inline a: Long): GErrorType = a.toUInt
  val G_ERR_UNKNOWN = define(0)
  val G_ERR_UNEXP_EOF = define(1)
  val G_ERR_UNEXP_EOF_IN_STRING = define(2)
  val G_ERR_UNEXP_EOF_IN_COMMENT = define(3)
  val G_ERR_NON_DIGIT_IN_CONST = define(4)
  val G_ERR_DIGIT_RADIX = define(5)
  val G_ERR_FLOAT_RADIX = define(6)
  val G_ERR_FLOAT_MALFORMED = define(7)
  inline def getName(inline value: GErrorType): Option[String] =
    inline value match
      case G_ERR_UNKNOWN => Some("G_ERR_UNKNOWN")
      case G_ERR_UNEXP_EOF => Some("G_ERR_UNEXP_EOF")
      case G_ERR_UNEXP_EOF_IN_STRING => Some("G_ERR_UNEXP_EOF_IN_STRING")
      case G_ERR_UNEXP_EOF_IN_COMMENT => Some("G_ERR_UNEXP_EOF_IN_COMMENT")
      case G_ERR_NON_DIGIT_IN_CONST => Some("G_ERR_NON_DIGIT_IN_CONST")
      case G_ERR_DIGIT_RADIX => Some("G_ERR_DIGIT_RADIX")
      case G_ERR_FLOAT_RADIX => Some("G_ERR_FLOAT_RADIX")
      case G_ERR_FLOAT_MALFORMED => Some("G_ERR_FLOAT_MALFORMED")
      case _ => None
  extension (a: GErrorType)
    inline def &(b: GErrorType): GErrorType = a & b
    inline def |(b: GErrorType): GErrorType = a | b
    inline def is(b: GErrorType): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gfileutils.h
*/
opaque type GFileError = CUnsignedInt
object GFileError extends CEnumU[GFileError]:
  given _tag: Tag[GFileError] = Tag.UInt
  inline def define(inline a: Long): GFileError = a.toUInt
  val G_FILE_ERROR_EXIST = define(0)
  val G_FILE_ERROR_ISDIR = define(1)
  val G_FILE_ERROR_ACCES = define(2)
  val G_FILE_ERROR_NAMETOOLONG = define(3)
  val G_FILE_ERROR_NOENT = define(4)
  val G_FILE_ERROR_NOTDIR = define(5)
  val G_FILE_ERROR_NXIO = define(6)
  val G_FILE_ERROR_NODEV = define(7)
  val G_FILE_ERROR_ROFS = define(8)
  val G_FILE_ERROR_TXTBSY = define(9)
  val G_FILE_ERROR_FAULT = define(10)
  val G_FILE_ERROR_LOOP = define(11)
  val G_FILE_ERROR_NOSPC = define(12)
  val G_FILE_ERROR_NOMEM = define(13)
  val G_FILE_ERROR_MFILE = define(14)
  val G_FILE_ERROR_NFILE = define(15)
  val G_FILE_ERROR_BADF = define(16)
  val G_FILE_ERROR_INVAL = define(17)
  val G_FILE_ERROR_PIPE = define(18)
  val G_FILE_ERROR_AGAIN = define(19)
  val G_FILE_ERROR_INTR = define(20)
  val G_FILE_ERROR_IO = define(21)
  val G_FILE_ERROR_PERM = define(22)
  val G_FILE_ERROR_NOSYS = define(23)
  val G_FILE_ERROR_FAILED = define(24)
  inline def getName(inline value: GFileError): Option[String] =
    inline value match
      case G_FILE_ERROR_EXIST => Some("G_FILE_ERROR_EXIST")
      case G_FILE_ERROR_ISDIR => Some("G_FILE_ERROR_ISDIR")
      case G_FILE_ERROR_ACCES => Some("G_FILE_ERROR_ACCES")
      case G_FILE_ERROR_NAMETOOLONG => Some("G_FILE_ERROR_NAMETOOLONG")
      case G_FILE_ERROR_NOENT => Some("G_FILE_ERROR_NOENT")
      case G_FILE_ERROR_NOTDIR => Some("G_FILE_ERROR_NOTDIR")
      case G_FILE_ERROR_NXIO => Some("G_FILE_ERROR_NXIO")
      case G_FILE_ERROR_NODEV => Some("G_FILE_ERROR_NODEV")
      case G_FILE_ERROR_ROFS => Some("G_FILE_ERROR_ROFS")
      case G_FILE_ERROR_TXTBSY => Some("G_FILE_ERROR_TXTBSY")
      case G_FILE_ERROR_FAULT => Some("G_FILE_ERROR_FAULT")
      case G_FILE_ERROR_LOOP => Some("G_FILE_ERROR_LOOP")
      case G_FILE_ERROR_NOSPC => Some("G_FILE_ERROR_NOSPC")
      case G_FILE_ERROR_NOMEM => Some("G_FILE_ERROR_NOMEM")
      case G_FILE_ERROR_MFILE => Some("G_FILE_ERROR_MFILE")
      case G_FILE_ERROR_NFILE => Some("G_FILE_ERROR_NFILE")
      case G_FILE_ERROR_BADF => Some("G_FILE_ERROR_BADF")
      case G_FILE_ERROR_INVAL => Some("G_FILE_ERROR_INVAL")
      case G_FILE_ERROR_PIPE => Some("G_FILE_ERROR_PIPE")
      case G_FILE_ERROR_AGAIN => Some("G_FILE_ERROR_AGAIN")
      case G_FILE_ERROR_INTR => Some("G_FILE_ERROR_INTR")
      case G_FILE_ERROR_IO => Some("G_FILE_ERROR_IO")
      case G_FILE_ERROR_PERM => Some("G_FILE_ERROR_PERM")
      case G_FILE_ERROR_NOSYS => Some("G_FILE_ERROR_NOSYS")
      case G_FILE_ERROR_FAILED => Some("G_FILE_ERROR_FAILED")
      case _ => None
  extension (a: GFileError)
    inline def &(b: GFileError): GFileError = a & b
    inline def |(b: GFileError): GFileError = a | b
    inline def is(b: GFileError): Boolean = (a & b) == b

/**
 * GFileSetContentsFlags: _FILE_SET_CONTENTS_NONE: No guarantees about file consistency or durability. The most dangerous setting, which is slightly faster than other settings. _FILE_SET_CONTENTS_CONSISTENT: Guarantee file consistency: after a crash, either the old version of the file or the new version of the file will be available, but not a mixture. On Unix systems this equates to an `fsync()` on the file and use of an atomic `rename()` of the new version of the file over the old. _FILE_SET_CONTENTS_DURABLE: Guarantee file durability: after a crash, the new version of the file will be available. On Unix systems this equates to an `fsync()` on the file (if %G_FILE_SET_CONTENTS_CONSISTENT is unset), or the effects of %G_FILE_SET_CONTENTS_CONSISTENT plus an `fsync()` on the directory containing the file after calling `rename()`. _FILE_SET_CONTENTS_ONLY_EXISTING: Only apply consistency and durability guarantees if the file already exists. This may speed up file operations if the file doesn’t currently exist, but may result in a corrupted version of the new file if the system crashes while writing it.

 * [bindgen] header: /usr/include/glib-2.0/glib/gfileutils.h
*/
opaque type GFileSetContentsFlags = CUnsignedInt
object GFileSetContentsFlags extends CEnumU[GFileSetContentsFlags]:
  given _tag: Tag[GFileSetContentsFlags] = Tag.UInt
  inline def define(inline a: Long): GFileSetContentsFlags = a.toUInt
  val G_FILE_SET_CONTENTS_NONE = define(0)
  val G_FILE_SET_CONTENTS_CONSISTENT = define(1)
  val G_FILE_SET_CONTENTS_DURABLE = define(2)
  val G_FILE_SET_CONTENTS_ONLY_EXISTING = define(4)
  inline def getName(inline value: GFileSetContentsFlags): Option[String] =
    inline value match
      case G_FILE_SET_CONTENTS_NONE => Some("G_FILE_SET_CONTENTS_NONE")
      case G_FILE_SET_CONTENTS_CONSISTENT => Some("G_FILE_SET_CONTENTS_CONSISTENT")
      case G_FILE_SET_CONTENTS_DURABLE => Some("G_FILE_SET_CONTENTS_DURABLE")
      case G_FILE_SET_CONTENTS_ONLY_EXISTING => Some("G_FILE_SET_CONTENTS_ONLY_EXISTING")
      case _ => None
  extension (a: GFileSetContentsFlags)
    inline def &(b: GFileSetContentsFlags): GFileSetContentsFlags = a & b
    inline def |(b: GFileSetContentsFlags): GFileSetContentsFlags = a | b
    inline def is(b: GFileSetContentsFlags): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gfileutils.h
*/
opaque type GFileTest = CUnsignedInt
object GFileTest extends CEnumU[GFileTest]:
  given _tag: Tag[GFileTest] = Tag.UInt
  inline def define(inline a: Long): GFileTest = a.toUInt
  val G_FILE_TEST_IS_REGULAR = define(1)
  val G_FILE_TEST_IS_SYMLINK = define(2)
  val G_FILE_TEST_IS_DIR = define(4)
  val G_FILE_TEST_IS_EXECUTABLE = define(8)
  val G_FILE_TEST_EXISTS = define(16)
  inline def getName(inline value: GFileTest): Option[String] =
    inline value match
      case G_FILE_TEST_IS_REGULAR => Some("G_FILE_TEST_IS_REGULAR")
      case G_FILE_TEST_IS_SYMLINK => Some("G_FILE_TEST_IS_SYMLINK")
      case G_FILE_TEST_IS_DIR => Some("G_FILE_TEST_IS_DIR")
      case G_FILE_TEST_IS_EXECUTABLE => Some("G_FILE_TEST_IS_EXECUTABLE")
      case G_FILE_TEST_EXISTS => Some("G_FILE_TEST_EXISTS")
      case _ => None
  extension (a: GFileTest)
    inline def &(b: GFileTest): GFileTest = a & b
    inline def |(b: GFileTest): GFileTest = a | b
    inline def is(b: GFileTest): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gutils.h
*/
opaque type GFormatSizeFlags = CUnsignedInt
object GFormatSizeFlags extends CEnumU[GFormatSizeFlags]:
  given _tag: Tag[GFormatSizeFlags] = Tag.UInt
  inline def define(inline a: Long): GFormatSizeFlags = a.toUInt
  val G_FORMAT_SIZE_DEFAULT = define(0)
  val G_FORMAT_SIZE_LONG_FORMAT = define(1)
  val G_FORMAT_SIZE_IEC_UNITS = define(2)
  val G_FORMAT_SIZE_BITS = define(4)
  inline def getName(inline value: GFormatSizeFlags): Option[String] =
    inline value match
      case G_FORMAT_SIZE_DEFAULT => Some("G_FORMAT_SIZE_DEFAULT")
      case G_FORMAT_SIZE_LONG_FORMAT => Some("G_FORMAT_SIZE_LONG_FORMAT")
      case G_FORMAT_SIZE_IEC_UNITS => Some("G_FORMAT_SIZE_IEC_UNITS")
      case G_FORMAT_SIZE_BITS => Some("G_FORMAT_SIZE_BITS")
      case _ => None
  extension (a: GFormatSizeFlags)
    inline def &(b: GFormatSizeFlags): GFormatSizeFlags = a & b
    inline def |(b: GFormatSizeFlags): GFormatSizeFlags = a | b
    inline def is(b: GFormatSizeFlags): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/ghook.h
*/
opaque type GHookFlagMask = CUnsignedInt
object GHookFlagMask extends CEnumU[GHookFlagMask]:
  given _tag: Tag[GHookFlagMask] = Tag.UInt
  inline def define(inline a: Long): GHookFlagMask = a.toUInt
  val G_HOOK_FLAG_ACTIVE = define(1)
  val G_HOOK_FLAG_IN_CALL = define(2)
  val G_HOOK_FLAG_MASK = define(15)
  inline def getName(inline value: GHookFlagMask): Option[String] =
    inline value match
      case G_HOOK_FLAG_ACTIVE => Some("G_HOOK_FLAG_ACTIVE")
      case G_HOOK_FLAG_IN_CALL => Some("G_HOOK_FLAG_IN_CALL")
      case G_HOOK_FLAG_MASK => Some("G_HOOK_FLAG_MASK")
      case _ => None
  extension (a: GHookFlagMask)
    inline def &(b: GHookFlagMask): GHookFlagMask = a & b
    inline def |(b: GHookFlagMask): GHookFlagMask = a | b
    inline def is(b: GHookFlagMask): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/giochannel.h
*/
opaque type GIOChannelError = CUnsignedInt
object GIOChannelError extends CEnumU[GIOChannelError]:
  given _tag: Tag[GIOChannelError] = Tag.UInt
  inline def define(inline a: Long): GIOChannelError = a.toUInt
  val G_IO_CHANNEL_ERROR_FBIG = define(0)
  val G_IO_CHANNEL_ERROR_INVAL = define(1)
  val G_IO_CHANNEL_ERROR_IO = define(2)
  val G_IO_CHANNEL_ERROR_ISDIR = define(3)
  val G_IO_CHANNEL_ERROR_NOSPC = define(4)
  val G_IO_CHANNEL_ERROR_NXIO = define(5)
  val G_IO_CHANNEL_ERROR_OVERFLOW = define(6)
  val G_IO_CHANNEL_ERROR_PIPE = define(7)
  val G_IO_CHANNEL_ERROR_FAILED = define(8)
  inline def getName(inline value: GIOChannelError): Option[String] =
    inline value match
      case G_IO_CHANNEL_ERROR_FBIG => Some("G_IO_CHANNEL_ERROR_FBIG")
      case G_IO_CHANNEL_ERROR_INVAL => Some("G_IO_CHANNEL_ERROR_INVAL")
      case G_IO_CHANNEL_ERROR_IO => Some("G_IO_CHANNEL_ERROR_IO")
      case G_IO_CHANNEL_ERROR_ISDIR => Some("G_IO_CHANNEL_ERROR_ISDIR")
      case G_IO_CHANNEL_ERROR_NOSPC => Some("G_IO_CHANNEL_ERROR_NOSPC")
      case G_IO_CHANNEL_ERROR_NXIO => Some("G_IO_CHANNEL_ERROR_NXIO")
      case G_IO_CHANNEL_ERROR_OVERFLOW => Some("G_IO_CHANNEL_ERROR_OVERFLOW")
      case G_IO_CHANNEL_ERROR_PIPE => Some("G_IO_CHANNEL_ERROR_PIPE")
      case G_IO_CHANNEL_ERROR_FAILED => Some("G_IO_CHANNEL_ERROR_FAILED")
      case _ => None
  extension (a: GIOChannelError)
    inline def &(b: GIOChannelError): GIOChannelError = a & b
    inline def |(b: GIOChannelError): GIOChannelError = a | b
    inline def is(b: GIOChannelError): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gmain.h
*/
opaque type GIOCondition = CUnsignedInt
object GIOCondition extends CEnumU[GIOCondition]:
  given _tag: Tag[GIOCondition] = Tag.UInt
  inline def define(inline a: Long): GIOCondition = a.toUInt
  val G_IO_IN = define(1)
  val G_IO_OUT = define(4)
  val G_IO_PRI = define(2)
  val G_IO_ERR = define(8)
  val G_IO_HUP = define(16)
  val G_IO_NVAL = define(32)
  inline def getName(inline value: GIOCondition): Option[String] =
    inline value match
      case G_IO_IN => Some("G_IO_IN")
      case G_IO_OUT => Some("G_IO_OUT")
      case G_IO_PRI => Some("G_IO_PRI")
      case G_IO_ERR => Some("G_IO_ERR")
      case G_IO_HUP => Some("G_IO_HUP")
      case G_IO_NVAL => Some("G_IO_NVAL")
      case _ => None
  extension (a: GIOCondition)
    inline def &(b: GIOCondition): GIOCondition = a & b
    inline def |(b: GIOCondition): GIOCondition = a | b
    inline def is(b: GIOCondition): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/giochannel.h
*/
opaque type GIOError = CUnsignedInt
object GIOError extends CEnumU[GIOError]:
  given _tag: Tag[GIOError] = Tag.UInt
  inline def define(inline a: Long): GIOError = a.toUInt
  val G_IO_ERROR_NONE = define(0)
  val G_IO_ERROR_AGAIN = define(1)
  val G_IO_ERROR_INVAL = define(2)
  val G_IO_ERROR_UNKNOWN = define(3)
  inline def getName(inline value: GIOError): Option[String] =
    inline value match
      case G_IO_ERROR_NONE => Some("G_IO_ERROR_NONE")
      case G_IO_ERROR_AGAIN => Some("G_IO_ERROR_AGAIN")
      case G_IO_ERROR_INVAL => Some("G_IO_ERROR_INVAL")
      case G_IO_ERROR_UNKNOWN => Some("G_IO_ERROR_UNKNOWN")
      case _ => None
  extension (a: GIOError)
    inline def &(b: GIOError): GIOError = a & b
    inline def |(b: GIOError): GIOError = a | b
    inline def is(b: GIOError): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/giochannel.h
*/
opaque type GIOFlags = CUnsignedInt
object GIOFlags extends CEnumU[GIOFlags]:
  given _tag: Tag[GIOFlags] = Tag.UInt
  inline def define(inline a: Long): GIOFlags = a.toUInt
  val G_IO_FLAG_APPEND = define(1)
  val G_IO_FLAG_NONBLOCK = define(2)
  val G_IO_FLAG_IS_READABLE = define(4)
  val G_IO_FLAG_IS_WRITABLE = define(8)
  val G_IO_FLAG_IS_WRITEABLE = define(8)
  val G_IO_FLAG_IS_SEEKABLE = define(16)
  val G_IO_FLAG_MASK = define(31)
  val G_IO_FLAG_GET_MASK = define(31)
  val G_IO_FLAG_SET_MASK = define(3)
  inline def getName(inline value: GIOFlags): Option[String] =
    inline value match
      case G_IO_FLAG_APPEND => Some("G_IO_FLAG_APPEND")
      case G_IO_FLAG_NONBLOCK => Some("G_IO_FLAG_NONBLOCK")
      case G_IO_FLAG_IS_READABLE => Some("G_IO_FLAG_IS_READABLE")
      case G_IO_FLAG_IS_WRITABLE => Some("G_IO_FLAG_IS_WRITABLE")
      case G_IO_FLAG_IS_WRITEABLE => Some("G_IO_FLAG_IS_WRITEABLE")
      case G_IO_FLAG_IS_SEEKABLE => Some("G_IO_FLAG_IS_SEEKABLE")
      case G_IO_FLAG_MASK => Some("G_IO_FLAG_MASK")
      case G_IO_FLAG_GET_MASK => Some("G_IO_FLAG_GET_MASK")
      case G_IO_FLAG_SET_MASK => Some("G_IO_FLAG_SET_MASK")
      case _ => None
  extension (a: GIOFlags)
    inline def &(b: GIOFlags): GIOFlags = a & b
    inline def |(b: GIOFlags): GIOFlags = a | b
    inline def is(b: GIOFlags): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/giochannel.h
*/
opaque type GIOStatus = CUnsignedInt
object GIOStatus extends CEnumU[GIOStatus]:
  given _tag: Tag[GIOStatus] = Tag.UInt
  inline def define(inline a: Long): GIOStatus = a.toUInt
  val G_IO_STATUS_ERROR = define(0)
  val G_IO_STATUS_NORMAL = define(1)
  val G_IO_STATUS_EOF = define(2)
  val G_IO_STATUS_AGAIN = define(3)
  inline def getName(inline value: GIOStatus): Option[String] =
    inline value match
      case G_IO_STATUS_ERROR => Some("G_IO_STATUS_ERROR")
      case G_IO_STATUS_NORMAL => Some("G_IO_STATUS_NORMAL")
      case G_IO_STATUS_EOF => Some("G_IO_STATUS_EOF")
      case G_IO_STATUS_AGAIN => Some("G_IO_STATUS_AGAIN")
      case _ => None
  extension (a: GIOStatus)
    inline def &(b: GIOStatus): GIOStatus = a & b
    inline def |(b: GIOStatus): GIOStatus = a | b
    inline def is(b: GIOStatus): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gkeyfile.h
*/
opaque type GKeyFileError = CUnsignedInt
object GKeyFileError extends CEnumU[GKeyFileError]:
  given _tag: Tag[GKeyFileError] = Tag.UInt
  inline def define(inline a: Long): GKeyFileError = a.toUInt
  val G_KEY_FILE_ERROR_UNKNOWN_ENCODING = define(0)
  val G_KEY_FILE_ERROR_PARSE = define(1)
  val G_KEY_FILE_ERROR_NOT_FOUND = define(2)
  val G_KEY_FILE_ERROR_KEY_NOT_FOUND = define(3)
  val G_KEY_FILE_ERROR_GROUP_NOT_FOUND = define(4)
  val G_KEY_FILE_ERROR_INVALID_VALUE = define(5)
  inline def getName(inline value: GKeyFileError): Option[String] =
    inline value match
      case G_KEY_FILE_ERROR_UNKNOWN_ENCODING => Some("G_KEY_FILE_ERROR_UNKNOWN_ENCODING")
      case G_KEY_FILE_ERROR_PARSE => Some("G_KEY_FILE_ERROR_PARSE")
      case G_KEY_FILE_ERROR_NOT_FOUND => Some("G_KEY_FILE_ERROR_NOT_FOUND")
      case G_KEY_FILE_ERROR_KEY_NOT_FOUND => Some("G_KEY_FILE_ERROR_KEY_NOT_FOUND")
      case G_KEY_FILE_ERROR_GROUP_NOT_FOUND => Some("G_KEY_FILE_ERROR_GROUP_NOT_FOUND")
      case G_KEY_FILE_ERROR_INVALID_VALUE => Some("G_KEY_FILE_ERROR_INVALID_VALUE")
      case _ => None
  extension (a: GKeyFileError)
    inline def &(b: GKeyFileError): GKeyFileError = a & b
    inline def |(b: GKeyFileError): GKeyFileError = a | b
    inline def is(b: GKeyFileError): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gkeyfile.h
*/
opaque type GKeyFileFlags = CUnsignedInt
object GKeyFileFlags extends CEnumU[GKeyFileFlags]:
  given _tag: Tag[GKeyFileFlags] = Tag.UInt
  inline def define(inline a: Long): GKeyFileFlags = a.toUInt
  val G_KEY_FILE_NONE = define(0)
  val G_KEY_FILE_KEEP_COMMENTS = define(1)
  val G_KEY_FILE_KEEP_TRANSLATIONS = define(2)
  inline def getName(inline value: GKeyFileFlags): Option[String] =
    inline value match
      case G_KEY_FILE_NONE => Some("G_KEY_FILE_NONE")
      case G_KEY_FILE_KEEP_COMMENTS => Some("G_KEY_FILE_KEEP_COMMENTS")
      case G_KEY_FILE_KEEP_TRANSLATIONS => Some("G_KEY_FILE_KEEP_TRANSLATIONS")
      case _ => None
  extension (a: GKeyFileFlags)
    inline def &(b: GKeyFileFlags): GKeyFileFlags = a & b
    inline def |(b: GKeyFileFlags): GKeyFileFlags = a | b
    inline def is(b: GKeyFileFlags): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gmessages.h
*/
opaque type GLogLevelFlags = CInt
object GLogLevelFlags extends CEnum[GLogLevelFlags]:
  given _tag: Tag[GLogLevelFlags] = Tag.Int
  inline def define(inline a: CInt): GLogLevelFlags = a
  val G_LOG_FLAG_RECURSION = define(1)
  val G_LOG_FLAG_FATAL = define(2)
  val G_LOG_LEVEL_ERROR = define(4)
  val G_LOG_LEVEL_CRITICAL = define(8)
  val G_LOG_LEVEL_WARNING = define(16)
  val G_LOG_LEVEL_MESSAGE = define(32)
  val G_LOG_LEVEL_INFO = define(64)
  val G_LOG_LEVEL_DEBUG = define(128)
  val G_LOG_LEVEL_MASK = define(-4)
  inline def getName(inline value: GLogLevelFlags): Option[String] =
    inline value match
      case G_LOG_FLAG_RECURSION => Some("G_LOG_FLAG_RECURSION")
      case G_LOG_FLAG_FATAL => Some("G_LOG_FLAG_FATAL")
      case G_LOG_LEVEL_ERROR => Some("G_LOG_LEVEL_ERROR")
      case G_LOG_LEVEL_CRITICAL => Some("G_LOG_LEVEL_CRITICAL")
      case G_LOG_LEVEL_WARNING => Some("G_LOG_LEVEL_WARNING")
      case G_LOG_LEVEL_MESSAGE => Some("G_LOG_LEVEL_MESSAGE")
      case G_LOG_LEVEL_INFO => Some("G_LOG_LEVEL_INFO")
      case G_LOG_LEVEL_DEBUG => Some("G_LOG_LEVEL_DEBUG")
      case G_LOG_LEVEL_MASK => Some("G_LOG_LEVEL_MASK")
      case _ => None
  extension (a: GLogLevelFlags)
    inline def &(b: GLogLevelFlags): GLogLevelFlags = a & b
    inline def |(b: GLogLevelFlags): GLogLevelFlags = a | b
    inline def is(b: GLogLevelFlags): Boolean = (a & b) == b

/**
 * GLogWriterOutput: _LOG_WRITER_HANDLED: Log writer has handled the log entry. _LOG_WRITER_UNHANDLED: Log writer could not handle the log entry.

 * [bindgen] header: /usr/include/glib-2.0/glib/gmessages.h
*/
opaque type GLogWriterOutput = CUnsignedInt
object GLogWriterOutput extends CEnumU[GLogWriterOutput]:
  given _tag: Tag[GLogWriterOutput] = Tag.UInt
  inline def define(inline a: Long): GLogWriterOutput = a.toUInt
  val G_LOG_WRITER_HANDLED = define(1)
  val G_LOG_WRITER_UNHANDLED = define(0)
  inline def getName(inline value: GLogWriterOutput): Option[String] =
    inline value match
      case G_LOG_WRITER_HANDLED => Some("G_LOG_WRITER_HANDLED")
      case G_LOG_WRITER_UNHANDLED => Some("G_LOG_WRITER_UNHANDLED")
      case _ => None
  extension (a: GLogWriterOutput)
    inline def &(b: GLogWriterOutput): GLogWriterOutput = a & b
    inline def |(b: GLogWriterOutput): GLogWriterOutput = a | b
    inline def is(b: GLogWriterOutput): Boolean = (a & b) == b

/**
 * GMainContextFlags: _MAIN_CONTEXT_FLAGS_NONE: Default behaviour. _MAIN_CONTEXT_FLAGS_OWNERLESS_POLLING: Assume that polling for events will free the thread to process other jobs. That's useful if you're using `g_main_context_{prepare,query,check,dispatch}` to integrate GMainContext in other event loops.

 * [bindgen] header: /usr/include/glib-2.0/glib/gmain.h
*/
opaque type GMainContextFlags = CUnsignedInt
object GMainContextFlags extends CEnumU[GMainContextFlags]:
  given _tag: Tag[GMainContextFlags] = Tag.UInt
  inline def define(inline a: Long): GMainContextFlags = a.toUInt
  val G_MAIN_CONTEXT_FLAGS_NONE = define(0)
  val G_MAIN_CONTEXT_FLAGS_OWNERLESS_POLLING = define(1)
  inline def getName(inline value: GMainContextFlags): Option[String] =
    inline value match
      case G_MAIN_CONTEXT_FLAGS_NONE => Some("G_MAIN_CONTEXT_FLAGS_NONE")
      case G_MAIN_CONTEXT_FLAGS_OWNERLESS_POLLING => Some("G_MAIN_CONTEXT_FLAGS_OWNERLESS_POLLING")
      case _ => None
  extension (a: GMainContextFlags)
    inline def &(b: GMainContextFlags): GMainContextFlags = a & b
    inline def |(b: GMainContextFlags): GMainContextFlags = a | b
    inline def is(b: GMainContextFlags): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gmarkup.h
*/
opaque type GMarkupCollectType = CUnsignedInt
object GMarkupCollectType extends CEnumU[GMarkupCollectType]:
  given _tag: Tag[GMarkupCollectType] = Tag.UInt
  inline def define(inline a: Long): GMarkupCollectType = a.toUInt
  val G_MARKUP_COLLECT_INVALID = define(0)
  val G_MARKUP_COLLECT_STRING = define(1)
  val G_MARKUP_COLLECT_STRDUP = define(2)
  val G_MARKUP_COLLECT_BOOLEAN = define(3)
  val G_MARKUP_COLLECT_TRISTATE = define(4)
  val G_MARKUP_COLLECT_OPTIONAL = define(65536)
  inline def getName(inline value: GMarkupCollectType): Option[String] =
    inline value match
      case G_MARKUP_COLLECT_INVALID => Some("G_MARKUP_COLLECT_INVALID")
      case G_MARKUP_COLLECT_STRING => Some("G_MARKUP_COLLECT_STRING")
      case G_MARKUP_COLLECT_STRDUP => Some("G_MARKUP_COLLECT_STRDUP")
      case G_MARKUP_COLLECT_BOOLEAN => Some("G_MARKUP_COLLECT_BOOLEAN")
      case G_MARKUP_COLLECT_TRISTATE => Some("G_MARKUP_COLLECT_TRISTATE")
      case G_MARKUP_COLLECT_OPTIONAL => Some("G_MARKUP_COLLECT_OPTIONAL")
      case _ => None
  extension (a: GMarkupCollectType)
    inline def &(b: GMarkupCollectType): GMarkupCollectType = a & b
    inline def |(b: GMarkupCollectType): GMarkupCollectType = a | b
    inline def is(b: GMarkupCollectType): Boolean = (a & b) == b

/**
 * GMarkupError: _MARKUP_ERROR_BAD_UTF8: text being parsed was not valid UTF-8 _MARKUP_ERROR_EMPTY: document contained nothing, or only whitespace _MARKUP_ERROR_PARSE: document was ill-formed _MARKUP_ERROR_UNKNOWN_ELEMENT: error should be set by #GMarkupParser functions; element wasn't known _MARKUP_ERROR_UNKNOWN_ATTRIBUTE: error should be set by #GMarkupParser functions; attribute wasn't known _MARKUP_ERROR_INVALID_CONTENT: error should be set by #GMarkupParser functions; content was invalid _MARKUP_ERROR_MISSING_ATTRIBUTE: error should be set by #GMarkupParser functions; a required attribute was missing

 * [bindgen] header: /usr/include/glib-2.0/glib/gmarkup.h
*/
opaque type GMarkupError = CUnsignedInt
object GMarkupError extends CEnumU[GMarkupError]:
  given _tag: Tag[GMarkupError] = Tag.UInt
  inline def define(inline a: Long): GMarkupError = a.toUInt
  val G_MARKUP_ERROR_BAD_UTF8 = define(0)
  val G_MARKUP_ERROR_EMPTY = define(1)
  val G_MARKUP_ERROR_PARSE = define(2)
  val G_MARKUP_ERROR_UNKNOWN_ELEMENT = define(3)
  val G_MARKUP_ERROR_UNKNOWN_ATTRIBUTE = define(4)
  val G_MARKUP_ERROR_INVALID_CONTENT = define(5)
  val G_MARKUP_ERROR_MISSING_ATTRIBUTE = define(6)
  inline def getName(inline value: GMarkupError): Option[String] =
    inline value match
      case G_MARKUP_ERROR_BAD_UTF8 => Some("G_MARKUP_ERROR_BAD_UTF8")
      case G_MARKUP_ERROR_EMPTY => Some("G_MARKUP_ERROR_EMPTY")
      case G_MARKUP_ERROR_PARSE => Some("G_MARKUP_ERROR_PARSE")
      case G_MARKUP_ERROR_UNKNOWN_ELEMENT => Some("G_MARKUP_ERROR_UNKNOWN_ELEMENT")
      case G_MARKUP_ERROR_UNKNOWN_ATTRIBUTE => Some("G_MARKUP_ERROR_UNKNOWN_ATTRIBUTE")
      case G_MARKUP_ERROR_INVALID_CONTENT => Some("G_MARKUP_ERROR_INVALID_CONTENT")
      case G_MARKUP_ERROR_MISSING_ATTRIBUTE => Some("G_MARKUP_ERROR_MISSING_ATTRIBUTE")
      case _ => None
  extension (a: GMarkupError)
    inline def &(b: GMarkupError): GMarkupError = a & b
    inline def |(b: GMarkupError): GMarkupError = a | b
    inline def is(b: GMarkupError): Boolean = (a & b) == b

/**
 * GMarkupParseFlags: _MARKUP_DO_NOT_USE_THIS_UNSUPPORTED_FLAG: flag you should not use _MARKUP_TREAT_CDATA_AS_TEXT: When this flag is set, CDATA marked sections are not passed literally to the function of the parser. Instead, the content of the section (without the `<![CDATA[` and `]]>`) is passed to the

 * [bindgen] header: /usr/include/glib-2.0/glib/gmarkup.h
*/
opaque type GMarkupParseFlags = CUnsignedInt
object GMarkupParseFlags extends CEnumU[GMarkupParseFlags]:
  given _tag: Tag[GMarkupParseFlags] = Tag.UInt
  inline def define(inline a: Long): GMarkupParseFlags = a.toUInt
  val G_MARKUP_DO_NOT_USE_THIS_UNSUPPORTED_FLAG = define(1)
  val G_MARKUP_TREAT_CDATA_AS_TEXT = define(2)
  val G_MARKUP_PREFIX_ERROR_POSITION = define(4)
  val G_MARKUP_IGNORE_QUALIFIED = define(8)
  inline def getName(inline value: GMarkupParseFlags): Option[String] =
    inline value match
      case G_MARKUP_DO_NOT_USE_THIS_UNSUPPORTED_FLAG => Some("G_MARKUP_DO_NOT_USE_THIS_UNSUPPORTED_FLAG")
      case G_MARKUP_TREAT_CDATA_AS_TEXT => Some("G_MARKUP_TREAT_CDATA_AS_TEXT")
      case G_MARKUP_PREFIX_ERROR_POSITION => Some("G_MARKUP_PREFIX_ERROR_POSITION")
      case G_MARKUP_IGNORE_QUALIFIED => Some("G_MARKUP_IGNORE_QUALIFIED")
      case _ => None
  extension (a: GMarkupParseFlags)
    inline def &(b: GMarkupParseFlags): GMarkupParseFlags = a & b
    inline def |(b: GMarkupParseFlags): GMarkupParseFlags = a | b
    inline def is(b: GMarkupParseFlags): Boolean = (a & b) == b

/**
 * GNormalizeMode: _NORMALIZE_DEFAULT: standardize differences that do not affect the text content, such as the above-mentioned accent representation _NORMALIZE_NFD: another name for %G_NORMALIZE_DEFAULT _NORMALIZE_DEFAULT_COMPOSE: like %G_NORMALIZE_DEFAULT, but with composed forms rather than a maximally decomposed form _NORMALIZE_NFC: another name for %G_NORMALIZE_DEFAULT_COMPOSE _NORMALIZE_ALL: beyond %G_NORMALIZE_DEFAULT also standardize the "compatibility" characters in Unicode, such as SUPERSCRIPT THREE to the standard forms (in this case DIGIT THREE). Formatting information may be lost but for most text operations such characters should be considered the same _NORMALIZE_NFKD: another name for %G_NORMALIZE_ALL _NORMALIZE_ALL_COMPOSE: like %G_NORMALIZE_ALL, but with composed forms rather than a maximally decomposed form _NORMALIZE_NFKC: another name for %G_NORMALIZE_ALL_COMPOSE

 * [bindgen] header: /usr/include/glib-2.0/glib/gunicode.h
*/
opaque type GNormalizeMode = CUnsignedInt
object GNormalizeMode extends CEnumU[GNormalizeMode]:
  given _tag: Tag[GNormalizeMode] = Tag.UInt
  inline def define(inline a: Long): GNormalizeMode = a.toUInt
  val G_NORMALIZE_DEFAULT = define(0)
  val G_NORMALIZE_NFD = define(0)
  val G_NORMALIZE_DEFAULT_COMPOSE = define(1)
  val G_NORMALIZE_NFC = define(1)
  val G_NORMALIZE_ALL = define(2)
  val G_NORMALIZE_NFKD = define(2)
  val G_NORMALIZE_ALL_COMPOSE = define(3)
  val G_NORMALIZE_NFKC = define(3)
  inline def getName(inline value: GNormalizeMode): Option[String] =
    inline value match
      case G_NORMALIZE_DEFAULT => Some("G_NORMALIZE_DEFAULT")
      case G_NORMALIZE_NFD => Some("G_NORMALIZE_NFD")
      case G_NORMALIZE_DEFAULT_COMPOSE => Some("G_NORMALIZE_DEFAULT_COMPOSE")
      case G_NORMALIZE_NFC => Some("G_NORMALIZE_NFC")
      case G_NORMALIZE_ALL => Some("G_NORMALIZE_ALL")
      case G_NORMALIZE_NFKD => Some("G_NORMALIZE_NFKD")
      case G_NORMALIZE_ALL_COMPOSE => Some("G_NORMALIZE_ALL_COMPOSE")
      case G_NORMALIZE_NFKC => Some("G_NORMALIZE_NFKC")
      case _ => None
  extension (a: GNormalizeMode)
    inline def &(b: GNormalizeMode): GNormalizeMode = a & b
    inline def |(b: GNormalizeMode): GNormalizeMode = a | b
    inline def is(b: GNormalizeMode): Boolean = (a & b) == b

/**
 * GNumberParserError: _NUMBER_PARSER_ERROR_INVALID: String was not a valid number. _NUMBER_PARSER_ERROR_OUT_OF_BOUNDS: String was a number, but out of bounds.

 * [bindgen] header: /usr/include/glib-2.0/glib/gstrfuncs.h
*/
opaque type GNumberParserError = CUnsignedInt
object GNumberParserError extends CEnumU[GNumberParserError]:
  given _tag: Tag[GNumberParserError] = Tag.UInt
  inline def define(inline a: Long): GNumberParserError = a.toUInt
  val G_NUMBER_PARSER_ERROR_INVALID = define(0)
  val G_NUMBER_PARSER_ERROR_OUT_OF_BOUNDS = define(1)
  inline def getName(inline value: GNumberParserError): Option[String] =
    inline value match
      case G_NUMBER_PARSER_ERROR_INVALID => Some("G_NUMBER_PARSER_ERROR_INVALID")
      case G_NUMBER_PARSER_ERROR_OUT_OF_BOUNDS => Some("G_NUMBER_PARSER_ERROR_OUT_OF_BOUNDS")
      case _ => None
  extension (a: GNumberParserError)
    inline def &(b: GNumberParserError): GNumberParserError = a & b
    inline def |(b: GNumberParserError): GNumberParserError = a | b
    inline def is(b: GNumberParserError): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gthread.h
*/
opaque type GOnceStatus = CUnsignedInt
object GOnceStatus extends CEnumU[GOnceStatus]:
  given _tag: Tag[GOnceStatus] = Tag.UInt
  inline def define(inline a: Long): GOnceStatus = a.toUInt
  val G_ONCE_STATUS_NOTCALLED = define(0)
  val G_ONCE_STATUS_PROGRESS = define(1)
  val G_ONCE_STATUS_READY = define(2)
  inline def getName(inline value: GOnceStatus): Option[String] =
    inline value match
      case G_ONCE_STATUS_NOTCALLED => Some("G_ONCE_STATUS_NOTCALLED")
      case G_ONCE_STATUS_PROGRESS => Some("G_ONCE_STATUS_PROGRESS")
      case G_ONCE_STATUS_READY => Some("G_ONCE_STATUS_READY")
      case _ => None
  extension (a: GOnceStatus)
    inline def &(b: GOnceStatus): GOnceStatus = a & b
    inline def |(b: GOnceStatus): GOnceStatus = a | b
    inline def is(b: GOnceStatus): Boolean = (a & b) == b

/**
 * GOptionArg: _OPTION_ARG_NONE: No extra argument. This is useful for simple flags. _OPTION_ARG_STRING: The option takes a UTF-8 string argument. _OPTION_ARG_INT: The option takes an integer argument. _OPTION_ARG_CALLBACK: The option provides a callback (of type #GOptionArgFunc) to parse the extra argument. _OPTION_ARG_FILENAME: The option takes a filename as argument, which will be in the GLib filename encoding rather than UTF-8. _OPTION_ARG_STRING_ARRAY: The option takes a string argument, multiple uses of the option are collected into an array of strings. _OPTION_ARG_FILENAME_ARRAY: The option takes a filename as argument, multiple uses of the option are collected into an array of strings. _OPTION_ARG_DOUBLE: The option takes a double argument. The argument can be formatted either for the user's locale or for the "C" locale. Since 2.12 _OPTION_ARG_INT64: The option takes a 64-bit integer. Like %G_OPTION_ARG_INT but for larger numbers. The number can be in decimal base, or in hexadecimal (when prefixed with `0x`, for example, `0xffffffff`). Since 2.12

 * [bindgen] header: /usr/include/glib-2.0/glib/goption.h
*/
opaque type GOptionArg = CUnsignedInt
object GOptionArg extends CEnumU[GOptionArg]:
  given _tag: Tag[GOptionArg] = Tag.UInt
  inline def define(inline a: Long): GOptionArg = a.toUInt
  val G_OPTION_ARG_NONE = define(0)
  val G_OPTION_ARG_STRING = define(1)
  val G_OPTION_ARG_INT = define(2)
  val G_OPTION_ARG_CALLBACK = define(3)
  val G_OPTION_ARG_FILENAME = define(4)
  val G_OPTION_ARG_STRING_ARRAY = define(5)
  val G_OPTION_ARG_FILENAME_ARRAY = define(6)
  val G_OPTION_ARG_DOUBLE = define(7)
  val G_OPTION_ARG_INT64 = define(8)
  inline def getName(inline value: GOptionArg): Option[String] =
    inline value match
      case G_OPTION_ARG_NONE => Some("G_OPTION_ARG_NONE")
      case G_OPTION_ARG_STRING => Some("G_OPTION_ARG_STRING")
      case G_OPTION_ARG_INT => Some("G_OPTION_ARG_INT")
      case G_OPTION_ARG_CALLBACK => Some("G_OPTION_ARG_CALLBACK")
      case G_OPTION_ARG_FILENAME => Some("G_OPTION_ARG_FILENAME")
      case G_OPTION_ARG_STRING_ARRAY => Some("G_OPTION_ARG_STRING_ARRAY")
      case G_OPTION_ARG_FILENAME_ARRAY => Some("G_OPTION_ARG_FILENAME_ARRAY")
      case G_OPTION_ARG_DOUBLE => Some("G_OPTION_ARG_DOUBLE")
      case G_OPTION_ARG_INT64 => Some("G_OPTION_ARG_INT64")
      case _ => None
  extension (a: GOptionArg)
    inline def &(b: GOptionArg): GOptionArg = a & b
    inline def |(b: GOptionArg): GOptionArg = a | b
    inline def is(b: GOptionArg): Boolean = (a & b) == b

/**
 * GOptionError: _OPTION_ERROR_UNKNOWN_OPTION: An option was not known to the parser. This error will only be reported, if the parser hasn't been instructed to ignore unknown options, see g_option_context_set_ignore_unknown_options(). _OPTION_ERROR_BAD_VALUE: A value couldn't be parsed. _OPTION_ERROR_FAILED: A #GOptionArgFunc callback failed.

 * [bindgen] header: /usr/include/glib-2.0/glib/goption.h
*/
opaque type GOptionError = CUnsignedInt
object GOptionError extends CEnumU[GOptionError]:
  given _tag: Tag[GOptionError] = Tag.UInt
  inline def define(inline a: Long): GOptionError = a.toUInt
  val G_OPTION_ERROR_UNKNOWN_OPTION = define(0)
  val G_OPTION_ERROR_BAD_VALUE = define(1)
  val G_OPTION_ERROR_FAILED = define(2)
  inline def getName(inline value: GOptionError): Option[String] =
    inline value match
      case G_OPTION_ERROR_UNKNOWN_OPTION => Some("G_OPTION_ERROR_UNKNOWN_OPTION")
      case G_OPTION_ERROR_BAD_VALUE => Some("G_OPTION_ERROR_BAD_VALUE")
      case G_OPTION_ERROR_FAILED => Some("G_OPTION_ERROR_FAILED")
      case _ => None
  extension (a: GOptionError)
    inline def &(b: GOptionError): GOptionError = a & b
    inline def |(b: GOptionError): GOptionError = a | b
    inline def is(b: GOptionError): Boolean = (a & b) == b

/**
 * GOptionFlags: _OPTION_FLAG_NONE: No flags. Since: 2.42. _OPTION_FLAG_HIDDEN: The option doesn't appear in `--help` output. _OPTION_FLAG_IN_MAIN: The option appears in the main section of the `--help` output, even if it is defined in a group. _OPTION_FLAG_REVERSE: For options of the %G_OPTION_ARG_NONE kind, this flag indicates that the sense of the option is reversed. _OPTION_FLAG_NO_ARG: For options of the %G_OPTION_ARG_CALLBACK kind, this flag indicates that the callback does not take any argument (like a %G_OPTION_ARG_NONE option). Since 2.8 _OPTION_FLAG_FILENAME: For options of the %G_OPTION_ARG_CALLBACK kind, this flag indicates that the argument should be passed to the callback in the GLib filename encoding rather than UTF-8. Since 2.8 _OPTION_FLAG_OPTIONAL_ARG: For options of the %G_OPTION_ARG_CALLBACK kind, this flag indicates that the argument supply is optional. If no argument is given then data of %GOptionParseFunc will be set to NULL. Since 2.8 _OPTION_FLAG_NOALIAS: This flag turns off the automatic conflict resolution which prefixes long option names with `groupname-` if there is a conflict. This option should only be used in situations where aliasing is necessary to model some legacy commandline interface. It is not safe to use this option, unless all option groups are under your direct control. Since 2.8.

 * [bindgen] header: /usr/include/glib-2.0/glib/goption.h
*/
opaque type GOptionFlags = CUnsignedInt
object GOptionFlags extends CEnumU[GOptionFlags]:
  given _tag: Tag[GOptionFlags] = Tag.UInt
  inline def define(inline a: Long): GOptionFlags = a.toUInt
  val G_OPTION_FLAG_NONE = define(0)
  val G_OPTION_FLAG_HIDDEN = define(1)
  val G_OPTION_FLAG_IN_MAIN = define(2)
  val G_OPTION_FLAG_REVERSE = define(4)
  val G_OPTION_FLAG_NO_ARG = define(8)
  val G_OPTION_FLAG_FILENAME = define(16)
  val G_OPTION_FLAG_OPTIONAL_ARG = define(32)
  val G_OPTION_FLAG_NOALIAS = define(64)
  inline def getName(inline value: GOptionFlags): Option[String] =
    inline value match
      case G_OPTION_FLAG_NONE => Some("G_OPTION_FLAG_NONE")
      case G_OPTION_FLAG_HIDDEN => Some("G_OPTION_FLAG_HIDDEN")
      case G_OPTION_FLAG_IN_MAIN => Some("G_OPTION_FLAG_IN_MAIN")
      case G_OPTION_FLAG_REVERSE => Some("G_OPTION_FLAG_REVERSE")
      case G_OPTION_FLAG_NO_ARG => Some("G_OPTION_FLAG_NO_ARG")
      case G_OPTION_FLAG_FILENAME => Some("G_OPTION_FLAG_FILENAME")
      case G_OPTION_FLAG_OPTIONAL_ARG => Some("G_OPTION_FLAG_OPTIONAL_ARG")
      case G_OPTION_FLAG_NOALIAS => Some("G_OPTION_FLAG_NOALIAS")
      case _ => None
  extension (a: GOptionFlags)
    inline def &(b: GOptionFlags): GOptionFlags = a & b
    inline def |(b: GOptionFlags): GOptionFlags = a | b
    inline def is(b: GOptionFlags): Boolean = (a & b) == b

/**
 * GRegexCompileFlags: _REGEX_CASELESS: Letters in the pattern match both upper- and lowercase letters. This option can be changed within a pattern by a "(?i)" option setting. _REGEX_MULTILINE: By default, GRegex treats the strings as consisting of a single line of characters (even if it actually contains newlines). The "start of line" metacharacter ("^") matches only at the start of the string, while the "end of line" metacharacter ("$") matches only at the end of the string, or before a terminating newline (unless %G_REGEX_DOLLAR_ENDONLY is set). When %G_REGEX_MULTILINE is set, the "start of line" and "end of line" constructs match immediately following or immediately before any newline in the string, respectively, as well as at the very start and end. This can be changed within a pattern by a "(?m)" option setting. _REGEX_DOTALL: A dot metacharacter (".") in the pattern matches all characters, including newlines. Without it, newlines are excluded. This option can be changed within a pattern by a ("?s") option setting. _REGEX_EXTENDED: Whitespace data characters in the pattern are totally ignored except when escaped or inside a character class. Whitespace does not include the VT character (code 11). In addition, characters between an unescaped "#" outside a character class and the next newline character, inclusive, are also ignored. This can be changed within a pattern by a "(?x)" option setting. _REGEX_ANCHORED: The pattern is forced to be "anchored", that is, it is constrained to match only at the first matching point in the string that is being searched. This effect can also be achieved by appropriate constructs in the pattern itself such as the "^" metacharacter. _REGEX_DOLLAR_ENDONLY: A dollar metacharacter ("$") in the pattern matches only at the end of the string. Without this option, a dollar also matches immediately before the final character if it is a newline (but not before any other newlines). This option is ignored if %G_REGEX_MULTILINE is set. _REGEX_UNGREEDY: Inverts the "greediness" of the quantifiers so that they are not greedy by default, but become greedy if followed by "?". It can also be set by a "(?U)" option setting within the pattern. _REGEX_RAW: Usually strings must be valid UTF-8 strings, using this flag they are considered as a raw sequence of bytes. _REGEX_NO_AUTO_CAPTURE: Disables the use of numbered capturing parentheses in the pattern. Any opening parenthesis that is not followed by "?" behaves as if it were followed by "?:" but named parentheses can still be used for capturing (and they acquire numbers in the usual way). _REGEX_OPTIMIZE: Optimize the regular expression. If the pattern will be used many times, then it may be worth the effort to optimize it to improve the speed of matches. _REGEX_FIRSTLINE: Limits an unanchored pattern to match before (or at) the first newline. Since: 2.34 _REGEX_DUPNAMES: Names used to identify capturing subpatterns need not be unique. This can be helpful for certain types of pattern when it is known that only one instance of the named subpattern can ever be matched. _REGEX_NEWLINE_CR: Usually any newline character or character sequence is recognized. If this option is set, the only recognized newline character is ''. _REGEX_NEWLINE_LF: Usually any newline character or character sequence is recognized. If this option is set, the only recognized newline character is ''. _REGEX_NEWLINE_CRLF: Usually any newline character or character sequence is recognized. If this option is set, the only recognized newline character sequence is ''. _REGEX_NEWLINE_ANYCRLF: Usually any newline character or character sequence is recognized. If this option is set, the only recognized newline character sequences are '', '', and ''. Since: 2.34 _REGEX_BSR_ANYCRLF: Usually any newline character or character sequence is recognised. If this option is set, then "\R" only recognizes the newline characters '', '' and ''. Since: 2.34 _REGEX_JAVASCRIPT_COMPAT: Changes behaviour so that it is compatible with JavaScript rather than PCRE. Since: 2.34

 * [bindgen] header: /usr/include/glib-2.0/glib/gregex.h
*/
opaque type GRegexCompileFlags = CUnsignedInt
object GRegexCompileFlags extends CEnumU[GRegexCompileFlags]:
  given _tag: Tag[GRegexCompileFlags] = Tag.UInt
  inline def define(inline a: Long): GRegexCompileFlags = a.toUInt
  val G_REGEX_CASELESS = define(1)
  val G_REGEX_MULTILINE = define(2)
  val G_REGEX_DOTALL = define(4)
  val G_REGEX_EXTENDED = define(8)
  val G_REGEX_ANCHORED = define(16)
  val G_REGEX_DOLLAR_ENDONLY = define(32)
  val G_REGEX_UNGREEDY = define(512)
  val G_REGEX_RAW = define(2048)
  val G_REGEX_NO_AUTO_CAPTURE = define(4096)
  val G_REGEX_OPTIMIZE = define(8192)
  val G_REGEX_FIRSTLINE = define(262144)
  val G_REGEX_DUPNAMES = define(524288)
  val G_REGEX_NEWLINE_CR = define(1048576)
  val G_REGEX_NEWLINE_LF = define(2097152)
  val G_REGEX_NEWLINE_CRLF = define(3145728)
  val G_REGEX_NEWLINE_ANYCRLF = define(5242880)
  val G_REGEX_BSR_ANYCRLF = define(8388608)
  val G_REGEX_JAVASCRIPT_COMPAT = define(33554432)
  inline def getName(inline value: GRegexCompileFlags): Option[String] =
    inline value match
      case G_REGEX_CASELESS => Some("G_REGEX_CASELESS")
      case G_REGEX_MULTILINE => Some("G_REGEX_MULTILINE")
      case G_REGEX_DOTALL => Some("G_REGEX_DOTALL")
      case G_REGEX_EXTENDED => Some("G_REGEX_EXTENDED")
      case G_REGEX_ANCHORED => Some("G_REGEX_ANCHORED")
      case G_REGEX_DOLLAR_ENDONLY => Some("G_REGEX_DOLLAR_ENDONLY")
      case G_REGEX_UNGREEDY => Some("G_REGEX_UNGREEDY")
      case G_REGEX_RAW => Some("G_REGEX_RAW")
      case G_REGEX_NO_AUTO_CAPTURE => Some("G_REGEX_NO_AUTO_CAPTURE")
      case G_REGEX_OPTIMIZE => Some("G_REGEX_OPTIMIZE")
      case G_REGEX_FIRSTLINE => Some("G_REGEX_FIRSTLINE")
      case G_REGEX_DUPNAMES => Some("G_REGEX_DUPNAMES")
      case G_REGEX_NEWLINE_CR => Some("G_REGEX_NEWLINE_CR")
      case G_REGEX_NEWLINE_LF => Some("G_REGEX_NEWLINE_LF")
      case G_REGEX_NEWLINE_CRLF => Some("G_REGEX_NEWLINE_CRLF")
      case G_REGEX_NEWLINE_ANYCRLF => Some("G_REGEX_NEWLINE_ANYCRLF")
      case G_REGEX_BSR_ANYCRLF => Some("G_REGEX_BSR_ANYCRLF")
      case G_REGEX_JAVASCRIPT_COMPAT => Some("G_REGEX_JAVASCRIPT_COMPAT")
      case _ => None
  extension (a: GRegexCompileFlags)
    inline def &(b: GRegexCompileFlags): GRegexCompileFlags = a & b
    inline def |(b: GRegexCompileFlags): GRegexCompileFlags = a | b
    inline def is(b: GRegexCompileFlags): Boolean = (a & b) == b

/**
 * GRegexError: _REGEX_ERROR_COMPILE: Compilation of the regular expression failed. _REGEX_ERROR_OPTIMIZE: Optimization of the regular expression failed. _REGEX_ERROR_REPLACE: Replacement failed due to an ill-formed replacement string. _REGEX_ERROR_MATCH: The match process failed. _REGEX_ERROR_INTERNAL: Internal error of the regular expression engine. Since 2.16 _REGEX_ERROR_STRAY_BACKSLASH: "\\" at end of pattern. Since 2.16 _REGEX_ERROR_MISSING_CONTROL_CHAR: "\\c" at end of pattern. Since 2.16 _REGEX_ERROR_UNRECOGNIZED_ESCAPE: Unrecognized character follows "\\". Since 2.16 _REGEX_ERROR_QUANTIFIERS_OUT_OF_ORDER: Numbers out of order in "{}" quantifier. Since 2.16 _REGEX_ERROR_QUANTIFIER_TOO_BIG: Number too big in "{}" quantifier. Since 2.16 _REGEX_ERROR_UNTERMINATED_CHARACTER_CLASS: Missing terminating "]" for character class. Since 2.16 _REGEX_ERROR_INVALID_ESCAPE_IN_CHARACTER_CLASS: Invalid escape sequence in character class. Since 2.16 _REGEX_ERROR_RANGE_OUT_OF_ORDER: Range out of order in character class. Since 2.16 _REGEX_ERROR_NOTHING_TO_REPEAT: Nothing to repeat. Since 2.16 _REGEX_ERROR_UNRECOGNIZED_CHARACTER: Unrecognized character after "(?", "(?<" or "(?P". Since 2.16 _REGEX_ERROR_POSIX_NAMED_CLASS_OUTSIDE_CLASS: POSIX named classes are supported only within a class. Since 2.16 _REGEX_ERROR_UNMATCHED_PARENTHESIS: Missing terminating ")" or ")" without opening "(". Since 2.16 _REGEX_ERROR_INEXISTENT_SUBPATTERN_REFERENCE: Reference to non-existent subpattern. Since 2.16 _REGEX_ERROR_UNTERMINATED_COMMENT: Missing terminating ")" after comment. Since 2.16 _REGEX_ERROR_EXPRESSION_TOO_LARGE: Regular expression too large. Since 2.16 _REGEX_ERROR_MEMORY_ERROR: Failed to get memory. Since 2.16 _REGEX_ERROR_VARIABLE_LENGTH_LOOKBEHIND: Lookbehind assertion is not fixed length. Since 2.16 _REGEX_ERROR_MALFORMED_CONDITION: Malformed number or name after "(?(". Since 2.16 _REGEX_ERROR_TOO_MANY_CONDITIONAL_BRANCHES: Conditional group contains more than two branches. Since 2.16 _REGEX_ERROR_ASSERTION_EXPECTED: Assertion expected after "(?(". Since 2.16 _REGEX_ERROR_UNKNOWN_POSIX_CLASS_NAME: Unknown POSIX class name. Since 2.16 _REGEX_ERROR_POSIX_COLLATING_ELEMENTS_NOT_SUPPORTED: POSIX collating elements are not supported. Since 2.16 _REGEX_ERROR_HEX_CODE_TOO_LARGE: Character value in "\\x{...}" sequence is too large. Since 2.16 _REGEX_ERROR_INVALID_CONDITION: Invalid condition "(?(0)". Since 2.16 _REGEX_ERROR_SINGLE_BYTE_MATCH_IN_LOOKBEHIND: \C not allowed in lookbehind assertion. Since 2.16 _REGEX_ERROR_INFINITE_LOOP: Recursive call could loop indefinitely. Since 2.16 _REGEX_ERROR_MISSING_SUBPATTERN_NAME_TERMINATOR: Missing terminator in subpattern name. Since 2.16 _REGEX_ERROR_DUPLICATE_SUBPATTERN_NAME: Two named subpatterns have the same name. Since 2.16 _REGEX_ERROR_MALFORMED_PROPERTY: Malformed "\\P" or "\\p" sequence. Since 2.16 _REGEX_ERROR_UNKNOWN_PROPERTY: Unknown property name after "\\P" or "\\p". Since 2.16 _REGEX_ERROR_SUBPATTERN_NAME_TOO_LONG: Subpattern name is too long (maximum 32 characters). Since 2.16 _REGEX_ERROR_TOO_MANY_SUBPATTERNS: Too many named subpatterns (maximum 10,000). Since 2.16 _REGEX_ERROR_INVALID_OCTAL_VALUE: Octal value is greater than "\\377". Since 2.16 _REGEX_ERROR_TOO_MANY_BRANCHES_IN_DEFINE: "DEFINE" group contains more than one branch. Since 2.16 _REGEX_ERROR_DEFINE_REPETION: Repeating a "DEFINE" group is not allowed. This error is never raised. Since: 2.16 Deprecated: 2.34 _REGEX_ERROR_INCONSISTENT_NEWLINE_OPTIONS: Inconsistent newline options. Since 2.16 _REGEX_ERROR_MISSING_BACK_REFERENCE: "\\g" is not followed by a braced, angle-bracketed, or quoted name or number, or by a plain number. Since: 2.16 _REGEX_ERROR_INVALID_RELATIVE_REFERENCE: relative reference must not be zero. Since: 2.34 _REGEX_ERROR_BACKTRACKING_CONTROL_VERB_ARGUMENT_FORBIDDEN: the backtracing control verb used does not allow an argument. Since: 2.34 _REGEX_ERROR_UNKNOWN_BACKTRACKING_CONTROL_VERB: unknown backtracing control verb. Since: 2.34 _REGEX_ERROR_NUMBER_TOO_BIG: number is too big in escape sequence. Since: 2.34 _REGEX_ERROR_MISSING_SUBPATTERN_NAME: Missing subpattern name. Since: 2.34 _REGEX_ERROR_MISSING_DIGIT: Missing digit. Since 2.34 _REGEX_ERROR_INVALID_DATA_CHARACTER: In JavaScript compatibility mode, "[" is an invalid data character. Since: 2.34 _REGEX_ERROR_EXTRA_SUBPATTERN_NAME: different names for subpatterns of the same number are not allowed. Since: 2.34 _REGEX_ERROR_BACKTRACKING_CONTROL_VERB_ARGUMENT_REQUIRED: the backtracing control verb requires an argument. Since: 2.34 _REGEX_ERROR_INVALID_CONTROL_CHAR: "\\c" must be followed by an ASCII character. Since: 2.34 _REGEX_ERROR_MISSING_NAME: "\\k" is not followed by a braced, angle-bracketed, or quoted name. Since: 2.34 _REGEX_ERROR_NOT_SUPPORTED_IN_CLASS: "\\N" is not supported in a class. Since: 2.34 _REGEX_ERROR_TOO_MANY_FORWARD_REFERENCES: too many forward references. Since: 2.34 _REGEX_ERROR_NAME_TOO_LONG: the name is too long in "(*MARK)", "(*PRUNE)", "(*SKIP)", or "(*THEN)". Since: 2.34 _REGEX_ERROR_CHARACTER_VALUE_TOO_LARGE: the character value in the \u sequence is too large. Since: 2.34

 * [bindgen] header: /usr/include/glib-2.0/glib/gregex.h
*/
opaque type GRegexError = CUnsignedInt
object GRegexError extends CEnumU[GRegexError]:
  given _tag: Tag[GRegexError] = Tag.UInt
  inline def define(inline a: Long): GRegexError = a.toUInt
  val G_REGEX_ERROR_COMPILE = define(0)
  val G_REGEX_ERROR_OPTIMIZE = define(1)
  val G_REGEX_ERROR_REPLACE = define(2)
  val G_REGEX_ERROR_MATCH = define(3)
  val G_REGEX_ERROR_INTERNAL = define(4)
  val G_REGEX_ERROR_STRAY_BACKSLASH = define(101)
  val G_REGEX_ERROR_MISSING_CONTROL_CHAR = define(102)
  val G_REGEX_ERROR_UNRECOGNIZED_ESCAPE = define(103)
  val G_REGEX_ERROR_QUANTIFIERS_OUT_OF_ORDER = define(104)
  val G_REGEX_ERROR_QUANTIFIER_TOO_BIG = define(105)
  val G_REGEX_ERROR_UNTERMINATED_CHARACTER_CLASS = define(106)
  val G_REGEX_ERROR_INVALID_ESCAPE_IN_CHARACTER_CLASS = define(107)
  val G_REGEX_ERROR_RANGE_OUT_OF_ORDER = define(108)
  val G_REGEX_ERROR_NOTHING_TO_REPEAT = define(109)
  val G_REGEX_ERROR_UNRECOGNIZED_CHARACTER = define(112)
  val G_REGEX_ERROR_POSIX_NAMED_CLASS_OUTSIDE_CLASS = define(113)
  val G_REGEX_ERROR_UNMATCHED_PARENTHESIS = define(114)
  val G_REGEX_ERROR_INEXISTENT_SUBPATTERN_REFERENCE = define(115)
  val G_REGEX_ERROR_UNTERMINATED_COMMENT = define(118)
  val G_REGEX_ERROR_EXPRESSION_TOO_LARGE = define(120)
  val G_REGEX_ERROR_MEMORY_ERROR = define(121)
  val G_REGEX_ERROR_VARIABLE_LENGTH_LOOKBEHIND = define(125)
  val G_REGEX_ERROR_MALFORMED_CONDITION = define(126)
  val G_REGEX_ERROR_TOO_MANY_CONDITIONAL_BRANCHES = define(127)
  val G_REGEX_ERROR_ASSERTION_EXPECTED = define(128)
  val G_REGEX_ERROR_UNKNOWN_POSIX_CLASS_NAME = define(130)
  val G_REGEX_ERROR_POSIX_COLLATING_ELEMENTS_NOT_SUPPORTED = define(131)
  val G_REGEX_ERROR_HEX_CODE_TOO_LARGE = define(134)
  val G_REGEX_ERROR_INVALID_CONDITION = define(135)
  val G_REGEX_ERROR_SINGLE_BYTE_MATCH_IN_LOOKBEHIND = define(136)
  val G_REGEX_ERROR_INFINITE_LOOP = define(140)
  val G_REGEX_ERROR_MISSING_SUBPATTERN_NAME_TERMINATOR = define(142)
  val G_REGEX_ERROR_DUPLICATE_SUBPATTERN_NAME = define(143)
  val G_REGEX_ERROR_MALFORMED_PROPERTY = define(146)
  val G_REGEX_ERROR_UNKNOWN_PROPERTY = define(147)
  val G_REGEX_ERROR_SUBPATTERN_NAME_TOO_LONG = define(148)
  val G_REGEX_ERROR_TOO_MANY_SUBPATTERNS = define(149)
  val G_REGEX_ERROR_INVALID_OCTAL_VALUE = define(151)
  val G_REGEX_ERROR_TOO_MANY_BRANCHES_IN_DEFINE = define(154)
  val G_REGEX_ERROR_DEFINE_REPETION = define(155)
  val G_REGEX_ERROR_INCONSISTENT_NEWLINE_OPTIONS = define(156)
  val G_REGEX_ERROR_MISSING_BACK_REFERENCE = define(157)
  val G_REGEX_ERROR_INVALID_RELATIVE_REFERENCE = define(158)
  val G_REGEX_ERROR_BACKTRACKING_CONTROL_VERB_ARGUMENT_FORBIDDEN = define(159)
  val G_REGEX_ERROR_UNKNOWN_BACKTRACKING_CONTROL_VERB = define(160)
  val G_REGEX_ERROR_NUMBER_TOO_BIG = define(161)
  val G_REGEX_ERROR_MISSING_SUBPATTERN_NAME = define(162)
  val G_REGEX_ERROR_MISSING_DIGIT = define(163)
  val G_REGEX_ERROR_INVALID_DATA_CHARACTER = define(164)
  val G_REGEX_ERROR_EXTRA_SUBPATTERN_NAME = define(165)
  val G_REGEX_ERROR_BACKTRACKING_CONTROL_VERB_ARGUMENT_REQUIRED = define(166)
  val G_REGEX_ERROR_INVALID_CONTROL_CHAR = define(168)
  val G_REGEX_ERROR_MISSING_NAME = define(169)
  val G_REGEX_ERROR_NOT_SUPPORTED_IN_CLASS = define(171)
  val G_REGEX_ERROR_TOO_MANY_FORWARD_REFERENCES = define(172)
  val G_REGEX_ERROR_NAME_TOO_LONG = define(175)
  val G_REGEX_ERROR_CHARACTER_VALUE_TOO_LARGE = define(176)
  inline def getName(inline value: GRegexError): Option[String] =
    inline value match
      case G_REGEX_ERROR_COMPILE => Some("G_REGEX_ERROR_COMPILE")
      case G_REGEX_ERROR_OPTIMIZE => Some("G_REGEX_ERROR_OPTIMIZE")
      case G_REGEX_ERROR_REPLACE => Some("G_REGEX_ERROR_REPLACE")
      case G_REGEX_ERROR_MATCH => Some("G_REGEX_ERROR_MATCH")
      case G_REGEX_ERROR_INTERNAL => Some("G_REGEX_ERROR_INTERNAL")
      case G_REGEX_ERROR_STRAY_BACKSLASH => Some("G_REGEX_ERROR_STRAY_BACKSLASH")
      case G_REGEX_ERROR_MISSING_CONTROL_CHAR => Some("G_REGEX_ERROR_MISSING_CONTROL_CHAR")
      case G_REGEX_ERROR_UNRECOGNIZED_ESCAPE => Some("G_REGEX_ERROR_UNRECOGNIZED_ESCAPE")
      case G_REGEX_ERROR_QUANTIFIERS_OUT_OF_ORDER => Some("G_REGEX_ERROR_QUANTIFIERS_OUT_OF_ORDER")
      case G_REGEX_ERROR_QUANTIFIER_TOO_BIG => Some("G_REGEX_ERROR_QUANTIFIER_TOO_BIG")
      case G_REGEX_ERROR_UNTERMINATED_CHARACTER_CLASS => Some("G_REGEX_ERROR_UNTERMINATED_CHARACTER_CLASS")
      case G_REGEX_ERROR_INVALID_ESCAPE_IN_CHARACTER_CLASS => Some("G_REGEX_ERROR_INVALID_ESCAPE_IN_CHARACTER_CLASS")
      case G_REGEX_ERROR_RANGE_OUT_OF_ORDER => Some("G_REGEX_ERROR_RANGE_OUT_OF_ORDER")
      case G_REGEX_ERROR_NOTHING_TO_REPEAT => Some("G_REGEX_ERROR_NOTHING_TO_REPEAT")
      case G_REGEX_ERROR_UNRECOGNIZED_CHARACTER => Some("G_REGEX_ERROR_UNRECOGNIZED_CHARACTER")
      case G_REGEX_ERROR_POSIX_NAMED_CLASS_OUTSIDE_CLASS => Some("G_REGEX_ERROR_POSIX_NAMED_CLASS_OUTSIDE_CLASS")
      case G_REGEX_ERROR_UNMATCHED_PARENTHESIS => Some("G_REGEX_ERROR_UNMATCHED_PARENTHESIS")
      case G_REGEX_ERROR_INEXISTENT_SUBPATTERN_REFERENCE => Some("G_REGEX_ERROR_INEXISTENT_SUBPATTERN_REFERENCE")
      case G_REGEX_ERROR_UNTERMINATED_COMMENT => Some("G_REGEX_ERROR_UNTERMINATED_COMMENT")
      case G_REGEX_ERROR_EXPRESSION_TOO_LARGE => Some("G_REGEX_ERROR_EXPRESSION_TOO_LARGE")
      case G_REGEX_ERROR_MEMORY_ERROR => Some("G_REGEX_ERROR_MEMORY_ERROR")
      case G_REGEX_ERROR_VARIABLE_LENGTH_LOOKBEHIND => Some("G_REGEX_ERROR_VARIABLE_LENGTH_LOOKBEHIND")
      case G_REGEX_ERROR_MALFORMED_CONDITION => Some("G_REGEX_ERROR_MALFORMED_CONDITION")
      case G_REGEX_ERROR_TOO_MANY_CONDITIONAL_BRANCHES => Some("G_REGEX_ERROR_TOO_MANY_CONDITIONAL_BRANCHES")
      case G_REGEX_ERROR_ASSERTION_EXPECTED => Some("G_REGEX_ERROR_ASSERTION_EXPECTED")
      case G_REGEX_ERROR_UNKNOWN_POSIX_CLASS_NAME => Some("G_REGEX_ERROR_UNKNOWN_POSIX_CLASS_NAME")
      case G_REGEX_ERROR_POSIX_COLLATING_ELEMENTS_NOT_SUPPORTED => Some("G_REGEX_ERROR_POSIX_COLLATING_ELEMENTS_NOT_SUPPORTED")
      case G_REGEX_ERROR_HEX_CODE_TOO_LARGE => Some("G_REGEX_ERROR_HEX_CODE_TOO_LARGE")
      case G_REGEX_ERROR_INVALID_CONDITION => Some("G_REGEX_ERROR_INVALID_CONDITION")
      case G_REGEX_ERROR_SINGLE_BYTE_MATCH_IN_LOOKBEHIND => Some("G_REGEX_ERROR_SINGLE_BYTE_MATCH_IN_LOOKBEHIND")
      case G_REGEX_ERROR_INFINITE_LOOP => Some("G_REGEX_ERROR_INFINITE_LOOP")
      case G_REGEX_ERROR_MISSING_SUBPATTERN_NAME_TERMINATOR => Some("G_REGEX_ERROR_MISSING_SUBPATTERN_NAME_TERMINATOR")
      case G_REGEX_ERROR_DUPLICATE_SUBPATTERN_NAME => Some("G_REGEX_ERROR_DUPLICATE_SUBPATTERN_NAME")
      case G_REGEX_ERROR_MALFORMED_PROPERTY => Some("G_REGEX_ERROR_MALFORMED_PROPERTY")
      case G_REGEX_ERROR_UNKNOWN_PROPERTY => Some("G_REGEX_ERROR_UNKNOWN_PROPERTY")
      case G_REGEX_ERROR_SUBPATTERN_NAME_TOO_LONG => Some("G_REGEX_ERROR_SUBPATTERN_NAME_TOO_LONG")
      case G_REGEX_ERROR_TOO_MANY_SUBPATTERNS => Some("G_REGEX_ERROR_TOO_MANY_SUBPATTERNS")
      case G_REGEX_ERROR_INVALID_OCTAL_VALUE => Some("G_REGEX_ERROR_INVALID_OCTAL_VALUE")
      case G_REGEX_ERROR_TOO_MANY_BRANCHES_IN_DEFINE => Some("G_REGEX_ERROR_TOO_MANY_BRANCHES_IN_DEFINE")
      case G_REGEX_ERROR_DEFINE_REPETION => Some("G_REGEX_ERROR_DEFINE_REPETION")
      case G_REGEX_ERROR_INCONSISTENT_NEWLINE_OPTIONS => Some("G_REGEX_ERROR_INCONSISTENT_NEWLINE_OPTIONS")
      case G_REGEX_ERROR_MISSING_BACK_REFERENCE => Some("G_REGEX_ERROR_MISSING_BACK_REFERENCE")
      case G_REGEX_ERROR_INVALID_RELATIVE_REFERENCE => Some("G_REGEX_ERROR_INVALID_RELATIVE_REFERENCE")
      case G_REGEX_ERROR_BACKTRACKING_CONTROL_VERB_ARGUMENT_FORBIDDEN => Some("G_REGEX_ERROR_BACKTRACKING_CONTROL_VERB_ARGUMENT_FORBIDDEN")
      case G_REGEX_ERROR_UNKNOWN_BACKTRACKING_CONTROL_VERB => Some("G_REGEX_ERROR_UNKNOWN_BACKTRACKING_CONTROL_VERB")
      case G_REGEX_ERROR_NUMBER_TOO_BIG => Some("G_REGEX_ERROR_NUMBER_TOO_BIG")
      case G_REGEX_ERROR_MISSING_SUBPATTERN_NAME => Some("G_REGEX_ERROR_MISSING_SUBPATTERN_NAME")
      case G_REGEX_ERROR_MISSING_DIGIT => Some("G_REGEX_ERROR_MISSING_DIGIT")
      case G_REGEX_ERROR_INVALID_DATA_CHARACTER => Some("G_REGEX_ERROR_INVALID_DATA_CHARACTER")
      case G_REGEX_ERROR_EXTRA_SUBPATTERN_NAME => Some("G_REGEX_ERROR_EXTRA_SUBPATTERN_NAME")
      case G_REGEX_ERROR_BACKTRACKING_CONTROL_VERB_ARGUMENT_REQUIRED => Some("G_REGEX_ERROR_BACKTRACKING_CONTROL_VERB_ARGUMENT_REQUIRED")
      case G_REGEX_ERROR_INVALID_CONTROL_CHAR => Some("G_REGEX_ERROR_INVALID_CONTROL_CHAR")
      case G_REGEX_ERROR_MISSING_NAME => Some("G_REGEX_ERROR_MISSING_NAME")
      case G_REGEX_ERROR_NOT_SUPPORTED_IN_CLASS => Some("G_REGEX_ERROR_NOT_SUPPORTED_IN_CLASS")
      case G_REGEX_ERROR_TOO_MANY_FORWARD_REFERENCES => Some("G_REGEX_ERROR_TOO_MANY_FORWARD_REFERENCES")
      case G_REGEX_ERROR_NAME_TOO_LONG => Some("G_REGEX_ERROR_NAME_TOO_LONG")
      case G_REGEX_ERROR_CHARACTER_VALUE_TOO_LARGE => Some("G_REGEX_ERROR_CHARACTER_VALUE_TOO_LARGE")
      case _ => None
  extension (a: GRegexError)
    inline def &(b: GRegexError): GRegexError = a & b
    inline def |(b: GRegexError): GRegexError = a | b
    inline def is(b: GRegexError): Boolean = (a & b) == b

/**
 * GRegexMatchFlags: _REGEX_MATCH_ANCHORED: The pattern is forced to be "anchored", that is, it is constrained to match only at the first matching point in the string that is being searched. This effect can also be achieved by appropriate constructs in the pattern itself such as the "^" metacharacter. _REGEX_MATCH_NOTBOL: Specifies that first character of the string is not the beginning of a line, so the circumflex metacharacter should not match before it. Setting this without %G_REGEX_MULTILINE (at compile time) causes circumflex never to match. This option affects only the behaviour of the circumflex metacharacter, it does not affect "\A". _REGEX_MATCH_NOTEOL: Specifies that the end of the subject string is not the end of a line, so the dollar metacharacter should not match it nor (except in multiline mode) a newline immediately before it. Setting this without %G_REGEX_MULTILINE (at compile time) causes dollar never to match. This option affects only the behaviour of the dollar metacharacter, it does not affect "\Z" or "\z". _REGEX_MATCH_NOTEMPTY: An empty string is not considered to be a valid match if this option is set. If there are alternatives in the pattern, they are tried. If all the alternatives match the empty string, the entire match fails. For example, if the pattern "a?b?" is applied to a string not beginning with "a" or "b", it matches the empty string at the start of the string. With this flag set, this match is not valid, so GRegex searches further into the string for occurrences of "a" or "b". _REGEX_MATCH_PARTIAL: Turns on the partial matching feature, for more documentation on partial matching see g_match_info_is_partial_match(). _REGEX_MATCH_NEWLINE_CR: Overrides the newline definition set when creating a new #GRegex, setting the '' character as line terminator. _REGEX_MATCH_NEWLINE_LF: Overrides the newline definition set when creating a new #GRegex, setting the '' character as line terminator. _REGEX_MATCH_NEWLINE_CRLF: Overrides the newline definition set when creating a new #GRegex, setting the '' characters sequence as line terminator. _REGEX_MATCH_NEWLINE_ANY: Overrides the newline definition set when creating a new #GRegex, any Unicode newline sequence is recognised as a newline. These are '', '' and ' single characters U+000B LINE TABULATION, U+000C FORM FEED (FF), U+0085 NEXT LINE (NEL), U+2028 LINE SEPARATOR and U+2029 PARAGRAPH SEPARATOR. _REGEX_MATCH_NEWLINE_ANYCRLF: Overrides the newline definition set when creating a new #GRegex; any '', '', or '' character sequence is recognized as a newline. Since: 2.34 _REGEX_MATCH_BSR_ANYCRLF: Overrides the newline definition for "\R" set when creating a new #GRegex; only '', '', or '' character sequences are recognized as a newline by "\R". Since: 2.34 _REGEX_MATCH_BSR_ANY: Overrides the newline definition for "\R" set when creating a new #GRegex; any Unicode newline character or character sequence are recognized as a newline by "\R". These are '', '' and ' single characters U+000B LINE TABULATION, U+000C FORM FEED (FF), U+0085 NEXT LINE (NEL), U+2028 LINE SEPARATOR and U+2029 PARAGRAPH SEPARATOR. Since: 2.34 _REGEX_MATCH_PARTIAL_SOFT: An alias for %G_REGEX_MATCH_PARTIAL. Since: 2.34 _REGEX_MATCH_PARTIAL_HARD: Turns on the partial matching feature. In contrast to to %G_REGEX_MATCH_PARTIAL_SOFT, this stops matching as soon as a partial match is found, without continuing to search for a possible complete match. See g_match_info_is_partial_match() for more information. Since: 2.34 _REGEX_MATCH_NOTEMPTY_ATSTART: Like %G_REGEX_MATCH_NOTEMPTY, but only applied to the start of the matched string. For anchored patterns this can only happen for pattern containing "\K". Since: 2.34

 * [bindgen] header: /usr/include/glib-2.0/glib/gregex.h
*/
opaque type GRegexMatchFlags = CUnsignedInt
object GRegexMatchFlags extends CEnumU[GRegexMatchFlags]:
  given _tag: Tag[GRegexMatchFlags] = Tag.UInt
  inline def define(inline a: Long): GRegexMatchFlags = a.toUInt
  val G_REGEX_MATCH_ANCHORED = define(16)
  val G_REGEX_MATCH_NOTBOL = define(128)
  val G_REGEX_MATCH_NOTEOL = define(256)
  val G_REGEX_MATCH_NOTEMPTY = define(1024)
  val G_REGEX_MATCH_PARTIAL = define(32768)
  val G_REGEX_MATCH_NEWLINE_CR = define(1048576)
  val G_REGEX_MATCH_NEWLINE_LF = define(2097152)
  val G_REGEX_MATCH_NEWLINE_CRLF = define(3145728)
  val G_REGEX_MATCH_NEWLINE_ANY = define(4194304)
  val G_REGEX_MATCH_NEWLINE_ANYCRLF = define(5242880)
  val G_REGEX_MATCH_BSR_ANYCRLF = define(8388608)
  val G_REGEX_MATCH_BSR_ANY = define(16777216)
  val G_REGEX_MATCH_PARTIAL_SOFT = define(32768)
  val G_REGEX_MATCH_PARTIAL_HARD = define(134217728)
  val G_REGEX_MATCH_NOTEMPTY_ATSTART = define(268435456)
  inline def getName(inline value: GRegexMatchFlags): Option[String] =
    inline value match
      case G_REGEX_MATCH_ANCHORED => Some("G_REGEX_MATCH_ANCHORED")
      case G_REGEX_MATCH_NOTBOL => Some("G_REGEX_MATCH_NOTBOL")
      case G_REGEX_MATCH_NOTEOL => Some("G_REGEX_MATCH_NOTEOL")
      case G_REGEX_MATCH_NOTEMPTY => Some("G_REGEX_MATCH_NOTEMPTY")
      case G_REGEX_MATCH_PARTIAL => Some("G_REGEX_MATCH_PARTIAL")
      case G_REGEX_MATCH_NEWLINE_CR => Some("G_REGEX_MATCH_NEWLINE_CR")
      case G_REGEX_MATCH_NEWLINE_LF => Some("G_REGEX_MATCH_NEWLINE_LF")
      case G_REGEX_MATCH_NEWLINE_CRLF => Some("G_REGEX_MATCH_NEWLINE_CRLF")
      case G_REGEX_MATCH_NEWLINE_ANY => Some("G_REGEX_MATCH_NEWLINE_ANY")
      case G_REGEX_MATCH_NEWLINE_ANYCRLF => Some("G_REGEX_MATCH_NEWLINE_ANYCRLF")
      case G_REGEX_MATCH_BSR_ANYCRLF => Some("G_REGEX_MATCH_BSR_ANYCRLF")
      case G_REGEX_MATCH_BSR_ANY => Some("G_REGEX_MATCH_BSR_ANY")
      case G_REGEX_MATCH_PARTIAL_SOFT => Some("G_REGEX_MATCH_PARTIAL_SOFT")
      case G_REGEX_MATCH_PARTIAL_HARD => Some("G_REGEX_MATCH_PARTIAL_HARD")
      case G_REGEX_MATCH_NOTEMPTY_ATSTART => Some("G_REGEX_MATCH_NOTEMPTY_ATSTART")
      case _ => None
  extension (a: GRegexMatchFlags)
    inline def &(b: GRegexMatchFlags): GRegexMatchFlags = a & b
    inline def |(b: GRegexMatchFlags): GRegexMatchFlags = a | b
    inline def is(b: GRegexMatchFlags): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/giochannel.h
*/
opaque type GSeekType = CUnsignedInt
object GSeekType extends CEnumU[GSeekType]:
  given _tag: Tag[GSeekType] = Tag.UInt
  inline def define(inline a: Long): GSeekType = a.toUInt
  val G_SEEK_CUR = define(0)
  val G_SEEK_SET = define(1)
  val G_SEEK_END = define(2)
  inline def getName(inline value: GSeekType): Option[String] =
    inline value match
      case G_SEEK_CUR => Some("G_SEEK_CUR")
      case G_SEEK_SET => Some("G_SEEK_SET")
      case G_SEEK_END => Some("G_SEEK_END")
      case _ => None
  extension (a: GSeekType)
    inline def &(b: GSeekType): GSeekType = a & b
    inline def |(b: GSeekType): GSeekType = a | b
    inline def is(b: GSeekType): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gshell.h
*/
opaque type GShellError = CUnsignedInt
object GShellError extends CEnumU[GShellError]:
  given _tag: Tag[GShellError] = Tag.UInt
  inline def define(inline a: Long): GShellError = a.toUInt
  val G_SHELL_ERROR_BAD_QUOTING = define(0)
  val G_SHELL_ERROR_EMPTY_STRING = define(1)
  val G_SHELL_ERROR_FAILED = define(2)
  inline def getName(inline value: GShellError): Option[String] =
    inline value match
      case G_SHELL_ERROR_BAD_QUOTING => Some("G_SHELL_ERROR_BAD_QUOTING")
      case G_SHELL_ERROR_EMPTY_STRING => Some("G_SHELL_ERROR_EMPTY_STRING")
      case G_SHELL_ERROR_FAILED => Some("G_SHELL_ERROR_FAILED")
      case _ => None
  extension (a: GShellError)
    inline def &(b: GShellError): GShellError = a & b
    inline def |(b: GShellError): GShellError = a | b
    inline def is(b: GShellError): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gslice.h
*/
opaque type GSliceConfig = CUnsignedInt
object GSliceConfig extends CEnumU[GSliceConfig]:
  given _tag: Tag[GSliceConfig] = Tag.UInt
  inline def define(inline a: Long): GSliceConfig = a.toUInt
  val G_SLICE_CONFIG_ALWAYS_MALLOC = define(1)
  val G_SLICE_CONFIG_BYPASS_MAGAZINES = define(2)
  val G_SLICE_CONFIG_WORKING_SET_MSECS = define(3)
  val G_SLICE_CONFIG_COLOR_INCREMENT = define(4)
  val G_SLICE_CONFIG_CHUNK_SIZES = define(5)
  val G_SLICE_CONFIG_CONTENTION_COUNTER = define(6)
  inline def getName(inline value: GSliceConfig): Option[String] =
    inline value match
      case G_SLICE_CONFIG_ALWAYS_MALLOC => Some("G_SLICE_CONFIG_ALWAYS_MALLOC")
      case G_SLICE_CONFIG_BYPASS_MAGAZINES => Some("G_SLICE_CONFIG_BYPASS_MAGAZINES")
      case G_SLICE_CONFIG_WORKING_SET_MSECS => Some("G_SLICE_CONFIG_WORKING_SET_MSECS")
      case G_SLICE_CONFIG_COLOR_INCREMENT => Some("G_SLICE_CONFIG_COLOR_INCREMENT")
      case G_SLICE_CONFIG_CHUNK_SIZES => Some("G_SLICE_CONFIG_CHUNK_SIZES")
      case G_SLICE_CONFIG_CONTENTION_COUNTER => Some("G_SLICE_CONFIG_CONTENTION_COUNTER")
      case _ => None
  extension (a: GSliceConfig)
    inline def &(b: GSliceConfig): GSliceConfig = a & b
    inline def |(b: GSliceConfig): GSliceConfig = a | b
    inline def is(b: GSliceConfig): Boolean = (a & b) == b

/**
 * GSpawnError: _SPAWN_ERROR_FORK: Fork failed due to lack of memory. _SPAWN_ERROR_READ: Read or select on pipes failed. _SPAWN_ERROR_CHDIR: Changing to working directory failed. _SPAWN_ERROR_ACCES: execv() returned `EACCES` _SPAWN_ERROR_PERM: execv() returned `EPERM` _SPAWN_ERROR_TOO_BIG: execv() returned `E2BIG` _SPAWN_ERROR_2BIG: deprecated alias for %G_SPAWN_ERROR_TOO_BIG (deprecated since GLib 2.32) _SPAWN_ERROR_NOEXEC: execv() returned `ENOEXEC` _SPAWN_ERROR_NAMETOOLONG: execv() returned `ENAMETOOLONG` _SPAWN_ERROR_NOENT: execv() returned `ENOENT` _SPAWN_ERROR_NOMEM: execv() returned `ENOMEM` _SPAWN_ERROR_NOTDIR: execv() returned `ENOTDIR` _SPAWN_ERROR_LOOP: execv() returned `ELOOP` _SPAWN_ERROR_TXTBUSY: execv() returned `ETXTBUSY` _SPAWN_ERROR_IO: execv() returned `EIO` _SPAWN_ERROR_NFILE: execv() returned `ENFILE` _SPAWN_ERROR_MFILE: execv() returned `EMFILE` _SPAWN_ERROR_INVAL: execv() returned `EINVAL` _SPAWN_ERROR_ISDIR: execv() returned `EISDIR` _SPAWN_ERROR_LIBBAD: execv() returned `ELIBBAD` _SPAWN_ERROR_FAILED: Some other fatal failure, `error->message` should explain.

 * [bindgen] header: /usr/include/glib-2.0/glib/gspawn.h
*/
opaque type GSpawnError = CUnsignedInt
object GSpawnError extends CEnumU[GSpawnError]:
  given _tag: Tag[GSpawnError] = Tag.UInt
  inline def define(inline a: Long): GSpawnError = a.toUInt
  val G_SPAWN_ERROR_FORK = define(0)
  val G_SPAWN_ERROR_READ = define(1)
  val G_SPAWN_ERROR_CHDIR = define(2)
  val G_SPAWN_ERROR_ACCES = define(3)
  val G_SPAWN_ERROR_PERM = define(4)
  val G_SPAWN_ERROR_TOO_BIG = define(5)
  val G_SPAWN_ERROR_2BIG = define(5)
  val G_SPAWN_ERROR_NOEXEC = define(6)
  val G_SPAWN_ERROR_NAMETOOLONG = define(7)
  val G_SPAWN_ERROR_NOENT = define(8)
  val G_SPAWN_ERROR_NOMEM = define(9)
  val G_SPAWN_ERROR_NOTDIR = define(10)
  val G_SPAWN_ERROR_LOOP = define(11)
  val G_SPAWN_ERROR_TXTBUSY = define(12)
  val G_SPAWN_ERROR_IO = define(13)
  val G_SPAWN_ERROR_NFILE = define(14)
  val G_SPAWN_ERROR_MFILE = define(15)
  val G_SPAWN_ERROR_INVAL = define(16)
  val G_SPAWN_ERROR_ISDIR = define(17)
  val G_SPAWN_ERROR_LIBBAD = define(18)
  val G_SPAWN_ERROR_FAILED = define(19)
  inline def getName(inline value: GSpawnError): Option[String] =
    inline value match
      case G_SPAWN_ERROR_FORK => Some("G_SPAWN_ERROR_FORK")
      case G_SPAWN_ERROR_READ => Some("G_SPAWN_ERROR_READ")
      case G_SPAWN_ERROR_CHDIR => Some("G_SPAWN_ERROR_CHDIR")
      case G_SPAWN_ERROR_ACCES => Some("G_SPAWN_ERROR_ACCES")
      case G_SPAWN_ERROR_PERM => Some("G_SPAWN_ERROR_PERM")
      case G_SPAWN_ERROR_TOO_BIG => Some("G_SPAWN_ERROR_TOO_BIG")
      case G_SPAWN_ERROR_2BIG => Some("G_SPAWN_ERROR_2BIG")
      case G_SPAWN_ERROR_NOEXEC => Some("G_SPAWN_ERROR_NOEXEC")
      case G_SPAWN_ERROR_NAMETOOLONG => Some("G_SPAWN_ERROR_NAMETOOLONG")
      case G_SPAWN_ERROR_NOENT => Some("G_SPAWN_ERROR_NOENT")
      case G_SPAWN_ERROR_NOMEM => Some("G_SPAWN_ERROR_NOMEM")
      case G_SPAWN_ERROR_NOTDIR => Some("G_SPAWN_ERROR_NOTDIR")
      case G_SPAWN_ERROR_LOOP => Some("G_SPAWN_ERROR_LOOP")
      case G_SPAWN_ERROR_TXTBUSY => Some("G_SPAWN_ERROR_TXTBUSY")
      case G_SPAWN_ERROR_IO => Some("G_SPAWN_ERROR_IO")
      case G_SPAWN_ERROR_NFILE => Some("G_SPAWN_ERROR_NFILE")
      case G_SPAWN_ERROR_MFILE => Some("G_SPAWN_ERROR_MFILE")
      case G_SPAWN_ERROR_INVAL => Some("G_SPAWN_ERROR_INVAL")
      case G_SPAWN_ERROR_ISDIR => Some("G_SPAWN_ERROR_ISDIR")
      case G_SPAWN_ERROR_LIBBAD => Some("G_SPAWN_ERROR_LIBBAD")
      case G_SPAWN_ERROR_FAILED => Some("G_SPAWN_ERROR_FAILED")
      case _ => None
  extension (a: GSpawnError)
    inline def &(b: GSpawnError): GSpawnError = a & b
    inline def |(b: GSpawnError): GSpawnError = a | b
    inline def is(b: GSpawnError): Boolean = (a & b) == b

/**
 * GSpawnFlags: _SPAWN_DEFAULT: no flags, default behaviour _SPAWN_LEAVE_DESCRIPTORS_OPEN: the parent's open file descriptors will be inherited by the child; otherwise all descriptors except stdin, stdout and stderr will be closed before calling exec() in the child. _SPAWN_DO_NOT_REAP_CHILD: the child will not be automatically reaped; you must use g_child_watch_add() yourself (or call waitpid() or handle `SIGCHLD` yourself), or the child will become a zombie. _SPAWN_SEARCH_PATH: `argv[0]` need not be an absolute path, it will be looked for in the user's `PATH`. _SPAWN_STDOUT_TO_DEV_NULL: the child's standard output will be discarded, instead of going to the same location as the parent's standard output. _SPAWN_STDERR_TO_DEV_NULL: the child's standard error will be discarded. _SPAWN_CHILD_INHERITS_STDIN: the child will inherit the parent's standard input (by default, the child's standard input is attached to `/dev/null`). _SPAWN_FILE_AND_ARGV_ZERO: the first element of `argv` is the file to execute, while the remaining elements are the actual argument vector to pass to the file. Normally g_spawn_async_with_pipes() uses `argv[0]` as the file to execute, and passes all of `argv` to the child. _SPAWN_SEARCH_PATH_FROM_ENVP: if `argv[0]` is not an absolute path, it will be looked for in the `PATH` from the passed child environment. Since: 2.34 _SPAWN_CLOEXEC_PIPES: create all pipes with the `O_CLOEXEC` flag set. Since: 2.40

 * [bindgen] header: /usr/include/glib-2.0/glib/gspawn.h
*/
opaque type GSpawnFlags = CUnsignedInt
object GSpawnFlags extends CEnumU[GSpawnFlags]:
  given _tag: Tag[GSpawnFlags] = Tag.UInt
  inline def define(inline a: Long): GSpawnFlags = a.toUInt
  val G_SPAWN_DEFAULT = define(0)
  val G_SPAWN_LEAVE_DESCRIPTORS_OPEN = define(1)
  val G_SPAWN_DO_NOT_REAP_CHILD = define(2)
  val G_SPAWN_SEARCH_PATH = define(4)
  val G_SPAWN_STDOUT_TO_DEV_NULL = define(8)
  val G_SPAWN_STDERR_TO_DEV_NULL = define(16)
  val G_SPAWN_CHILD_INHERITS_STDIN = define(32)
  val G_SPAWN_FILE_AND_ARGV_ZERO = define(64)
  val G_SPAWN_SEARCH_PATH_FROM_ENVP = define(128)
  val G_SPAWN_CLOEXEC_PIPES = define(256)
  inline def getName(inline value: GSpawnFlags): Option[String] =
    inline value match
      case G_SPAWN_DEFAULT => Some("G_SPAWN_DEFAULT")
      case G_SPAWN_LEAVE_DESCRIPTORS_OPEN => Some("G_SPAWN_LEAVE_DESCRIPTORS_OPEN")
      case G_SPAWN_DO_NOT_REAP_CHILD => Some("G_SPAWN_DO_NOT_REAP_CHILD")
      case G_SPAWN_SEARCH_PATH => Some("G_SPAWN_SEARCH_PATH")
      case G_SPAWN_STDOUT_TO_DEV_NULL => Some("G_SPAWN_STDOUT_TO_DEV_NULL")
      case G_SPAWN_STDERR_TO_DEV_NULL => Some("G_SPAWN_STDERR_TO_DEV_NULL")
      case G_SPAWN_CHILD_INHERITS_STDIN => Some("G_SPAWN_CHILD_INHERITS_STDIN")
      case G_SPAWN_FILE_AND_ARGV_ZERO => Some("G_SPAWN_FILE_AND_ARGV_ZERO")
      case G_SPAWN_SEARCH_PATH_FROM_ENVP => Some("G_SPAWN_SEARCH_PATH_FROM_ENVP")
      case G_SPAWN_CLOEXEC_PIPES => Some("G_SPAWN_CLOEXEC_PIPES")
      case _ => None
  extension (a: GSpawnFlags)
    inline def &(b: GSpawnFlags): GSpawnFlags = a & b
    inline def |(b: GSpawnFlags): GSpawnFlags = a | b
    inline def is(b: GSpawnFlags): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtestutils.h
*/
opaque type GTestFileType = CUnsignedInt
object GTestFileType extends CEnumU[GTestFileType]:
  given _tag: Tag[GTestFileType] = Tag.UInt
  inline def define(inline a: Long): GTestFileType = a.toUInt
  val G_TEST_DIST = define(0)
  val G_TEST_BUILT = define(1)
  inline def getName(inline value: GTestFileType): Option[String] =
    inline value match
      case G_TEST_DIST => Some("G_TEST_DIST")
      case G_TEST_BUILT => Some("G_TEST_BUILT")
      case _ => None
  extension (a: GTestFileType)
    inline def &(b: GTestFileType): GTestFileType = a & b
    inline def |(b: GTestFileType): GTestFileType = a | b
    inline def is(b: GTestFileType): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtestutils.h
*/
opaque type GTestLogType = CUnsignedInt
object GTestLogType extends CEnumU[GTestLogType]:
  given _tag: Tag[GTestLogType] = Tag.UInt
  inline def define(inline a: Long): GTestLogType = a.toUInt
  val G_TEST_LOG_NONE = define(0)
  val G_TEST_LOG_ERROR = define(1)
  val G_TEST_LOG_START_BINARY = define(2)
  val G_TEST_LOG_LIST_CASE = define(3)
  val G_TEST_LOG_SKIP_CASE = define(4)
  val G_TEST_LOG_START_CASE = define(5)
  val G_TEST_LOG_STOP_CASE = define(6)
  val G_TEST_LOG_MIN_RESULT = define(7)
  val G_TEST_LOG_MAX_RESULT = define(8)
  val G_TEST_LOG_MESSAGE = define(9)
  val G_TEST_LOG_START_SUITE = define(10)
  val G_TEST_LOG_STOP_SUITE = define(11)
  inline def getName(inline value: GTestLogType): Option[String] =
    inline value match
      case G_TEST_LOG_NONE => Some("G_TEST_LOG_NONE")
      case G_TEST_LOG_ERROR => Some("G_TEST_LOG_ERROR")
      case G_TEST_LOG_START_BINARY => Some("G_TEST_LOG_START_BINARY")
      case G_TEST_LOG_LIST_CASE => Some("G_TEST_LOG_LIST_CASE")
      case G_TEST_LOG_SKIP_CASE => Some("G_TEST_LOG_SKIP_CASE")
      case G_TEST_LOG_START_CASE => Some("G_TEST_LOG_START_CASE")
      case G_TEST_LOG_STOP_CASE => Some("G_TEST_LOG_STOP_CASE")
      case G_TEST_LOG_MIN_RESULT => Some("G_TEST_LOG_MIN_RESULT")
      case G_TEST_LOG_MAX_RESULT => Some("G_TEST_LOG_MAX_RESULT")
      case G_TEST_LOG_MESSAGE => Some("G_TEST_LOG_MESSAGE")
      case G_TEST_LOG_START_SUITE => Some("G_TEST_LOG_START_SUITE")
      case G_TEST_LOG_STOP_SUITE => Some("G_TEST_LOG_STOP_SUITE")
      case _ => None
  extension (a: GTestLogType)
    inline def &(b: GTestLogType): GTestLogType = a & b
    inline def |(b: GTestLogType): GTestLogType = a | b
    inline def is(b: GTestLogType): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtestutils.h
*/
opaque type GTestResult = CUnsignedInt
object GTestResult extends CEnumU[GTestResult]:
  given _tag: Tag[GTestResult] = Tag.UInt
  inline def define(inline a: Long): GTestResult = a.toUInt
  val G_TEST_RUN_SUCCESS = define(0)
  val G_TEST_RUN_SKIPPED = define(1)
  val G_TEST_RUN_FAILURE = define(2)
  val G_TEST_RUN_INCOMPLETE = define(3)
  inline def getName(inline value: GTestResult): Option[String] =
    inline value match
      case G_TEST_RUN_SUCCESS => Some("G_TEST_RUN_SUCCESS")
      case G_TEST_RUN_SKIPPED => Some("G_TEST_RUN_SKIPPED")
      case G_TEST_RUN_FAILURE => Some("G_TEST_RUN_FAILURE")
      case G_TEST_RUN_INCOMPLETE => Some("G_TEST_RUN_INCOMPLETE")
      case _ => None
  extension (a: GTestResult)
    inline def &(b: GTestResult): GTestResult = a & b
    inline def |(b: GTestResult): GTestResult = a | b
    inline def is(b: GTestResult): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtestutils.h
*/
opaque type GTestSubprocessFlags = CUnsignedInt
object GTestSubprocessFlags extends CEnumU[GTestSubprocessFlags]:
  given _tag: Tag[GTestSubprocessFlags] = Tag.UInt
  inline def define(inline a: Long): GTestSubprocessFlags = a.toUInt
  val G_TEST_SUBPROCESS_INHERIT_STDIN = define(1)
  val G_TEST_SUBPROCESS_INHERIT_STDOUT = define(2)
  val G_TEST_SUBPROCESS_INHERIT_STDERR = define(4)
  inline def getName(inline value: GTestSubprocessFlags): Option[String] =
    inline value match
      case G_TEST_SUBPROCESS_INHERIT_STDIN => Some("G_TEST_SUBPROCESS_INHERIT_STDIN")
      case G_TEST_SUBPROCESS_INHERIT_STDOUT => Some("G_TEST_SUBPROCESS_INHERIT_STDOUT")
      case G_TEST_SUBPROCESS_INHERIT_STDERR => Some("G_TEST_SUBPROCESS_INHERIT_STDERR")
      case _ => None
  extension (a: GTestSubprocessFlags)
    inline def &(b: GTestSubprocessFlags): GTestSubprocessFlags = a & b
    inline def |(b: GTestSubprocessFlags): GTestSubprocessFlags = a | b
    inline def is(b: GTestSubprocessFlags): Boolean = (a & b) == b

/**
 * GTestTrapFlags: _TEST_TRAP_SILENCE_STDOUT: Redirect stdout of the test child to `/dev/null` so it cannot be observed on the console during test runs. The actual output is still captured though to allow later tests with g_test_trap_assert_stdout(). _TEST_TRAP_SILENCE_STDERR: Redirect stderr of the test child to `/dev/null` so it cannot be observed on the console during test runs. The actual output is still captured though to allow later tests with g_test_trap_assert_stderr(). _TEST_TRAP_INHERIT_STDIN: If this flag is given, stdin of the child process is shared with stdin of its parent process. It is redirected to `/dev/null` otherwise.

 * [bindgen] header: /usr/include/glib-2.0/glib/gtestutils.h
*/
opaque type GTestTrapFlags = CUnsignedInt
object GTestTrapFlags extends CEnumU[GTestTrapFlags]:
  given _tag: Tag[GTestTrapFlags] = Tag.UInt
  inline def define(inline a: Long): GTestTrapFlags = a.toUInt
  val G_TEST_TRAP_SILENCE_STDOUT = define(128)
  val G_TEST_TRAP_SILENCE_STDERR = define(256)
  val G_TEST_TRAP_INHERIT_STDIN = define(512)
  inline def getName(inline value: GTestTrapFlags): Option[String] =
    inline value match
      case G_TEST_TRAP_SILENCE_STDOUT => Some("G_TEST_TRAP_SILENCE_STDOUT")
      case G_TEST_TRAP_SILENCE_STDERR => Some("G_TEST_TRAP_SILENCE_STDERR")
      case G_TEST_TRAP_INHERIT_STDIN => Some("G_TEST_TRAP_INHERIT_STDIN")
      case _ => None
  extension (a: GTestTrapFlags)
    inline def &(b: GTestTrapFlags): GTestTrapFlags = a & b
    inline def |(b: GTestTrapFlags): GTestTrapFlags = a | b
    inline def is(b: GTestTrapFlags): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gthread.h
*/
opaque type GThreadError = CUnsignedInt
object GThreadError extends CEnumU[GThreadError]:
  given _tag: Tag[GThreadError] = Tag.UInt
  inline def define(inline a: Long): GThreadError = a.toUInt
  val G_THREAD_ERROR_AGAIN = define(0)
  inline def getName(inline value: GThreadError): Option[String] =
    inline value match
      case G_THREAD_ERROR_AGAIN => Some("G_THREAD_ERROR_AGAIN")
      case _ => None
  extension (a: GThreadError)
    inline def &(b: GThreadError): GThreadError = a & b
    inline def |(b: GThreadError): GThreadError = a | b
    inline def is(b: GThreadError): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/deprecated/gthread.h
*/
opaque type GThreadPriority = CUnsignedInt
object GThreadPriority extends CEnumU[GThreadPriority]:
  given _tag: Tag[GThreadPriority] = Tag.UInt
  inline def define(inline a: Long): GThreadPriority = a.toUInt
  val G_THREAD_PRIORITY_LOW = define(0)
  val G_THREAD_PRIORITY_NORMAL = define(1)
  val G_THREAD_PRIORITY_HIGH = define(2)
  val G_THREAD_PRIORITY_URGENT = define(3)
  inline def getName(inline value: GThreadPriority): Option[String] =
    inline value match
      case G_THREAD_PRIORITY_LOW => Some("G_THREAD_PRIORITY_LOW")
      case G_THREAD_PRIORITY_NORMAL => Some("G_THREAD_PRIORITY_NORMAL")
      case G_THREAD_PRIORITY_HIGH => Some("G_THREAD_PRIORITY_HIGH")
      case G_THREAD_PRIORITY_URGENT => Some("G_THREAD_PRIORITY_URGENT")
      case _ => None
  extension (a: GThreadPriority)
    inline def &(b: GThreadPriority): GThreadPriority = a & b
    inline def |(b: GThreadPriority): GThreadPriority = a | b
    inline def is(b: GThreadPriority): Boolean = (a & b) == b

/**
 * GTimeType: _TIME_TYPE_STANDARD: the time is in local standard time _TIME_TYPE_DAYLIGHT: the time is in local daylight time _TIME_TYPE_UNIVERSAL: the time is in UTC

 * [bindgen] header: /usr/include/glib-2.0/glib/gtimezone.h
*/
opaque type GTimeType = CUnsignedInt
object GTimeType extends CEnumU[GTimeType]:
  given _tag: Tag[GTimeType] = Tag.UInt
  inline def define(inline a: Long): GTimeType = a.toUInt
  val G_TIME_TYPE_STANDARD = define(0)
  val G_TIME_TYPE_DAYLIGHT = define(1)
  val G_TIME_TYPE_UNIVERSAL = define(2)
  inline def getName(inline value: GTimeType): Option[String] =
    inline value match
      case G_TIME_TYPE_STANDARD => Some("G_TIME_TYPE_STANDARD")
      case G_TIME_TYPE_DAYLIGHT => Some("G_TIME_TYPE_DAYLIGHT")
      case G_TIME_TYPE_UNIVERSAL => Some("G_TIME_TYPE_UNIVERSAL")
      case _ => None
  extension (a: GTimeType)
    inline def &(b: GTimeType): GTimeType = a & b
    inline def |(b: GTimeType): GTimeType = a | b
    inline def is(b: GTimeType): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gscanner.h
*/
opaque type GTokenType = CUnsignedInt
object GTokenType extends CEnumU[GTokenType]:
  given _tag: Tag[GTokenType] = Tag.UInt
  inline def define(inline a: Long): GTokenType = a.toUInt
  val G_TOKEN_EOF = define(0)
  val G_TOKEN_LEFT_PAREN = define(40)
  val G_TOKEN_RIGHT_PAREN = define(41)
  val G_TOKEN_LEFT_CURLY = define(123)
  val G_TOKEN_RIGHT_CURLY = define(125)
  val G_TOKEN_LEFT_BRACE = define(91)
  val G_TOKEN_RIGHT_BRACE = define(93)
  val G_TOKEN_EQUAL_SIGN = define(61)
  val G_TOKEN_COMMA = define(44)
  val G_TOKEN_NONE = define(256)
  val G_TOKEN_ERROR = define(257)
  val G_TOKEN_CHAR = define(258)
  val G_TOKEN_BINARY = define(259)
  val G_TOKEN_OCTAL = define(260)
  val G_TOKEN_INT = define(261)
  val G_TOKEN_HEX = define(262)
  val G_TOKEN_FLOAT = define(263)
  val G_TOKEN_STRING = define(264)
  val G_TOKEN_SYMBOL = define(265)
  val G_TOKEN_IDENTIFIER = define(266)
  val G_TOKEN_IDENTIFIER_NULL = define(267)
  val G_TOKEN_COMMENT_SINGLE = define(268)
  val G_TOKEN_COMMENT_MULTI = define(269)
  val G_TOKEN_LAST = define(270)
  inline def getName(inline value: GTokenType): Option[String] =
    inline value match
      case G_TOKEN_EOF => Some("G_TOKEN_EOF")
      case G_TOKEN_LEFT_PAREN => Some("G_TOKEN_LEFT_PAREN")
      case G_TOKEN_RIGHT_PAREN => Some("G_TOKEN_RIGHT_PAREN")
      case G_TOKEN_LEFT_CURLY => Some("G_TOKEN_LEFT_CURLY")
      case G_TOKEN_RIGHT_CURLY => Some("G_TOKEN_RIGHT_CURLY")
      case G_TOKEN_LEFT_BRACE => Some("G_TOKEN_LEFT_BRACE")
      case G_TOKEN_RIGHT_BRACE => Some("G_TOKEN_RIGHT_BRACE")
      case G_TOKEN_EQUAL_SIGN => Some("G_TOKEN_EQUAL_SIGN")
      case G_TOKEN_COMMA => Some("G_TOKEN_COMMA")
      case G_TOKEN_NONE => Some("G_TOKEN_NONE")
      case G_TOKEN_ERROR => Some("G_TOKEN_ERROR")
      case G_TOKEN_CHAR => Some("G_TOKEN_CHAR")
      case G_TOKEN_BINARY => Some("G_TOKEN_BINARY")
      case G_TOKEN_OCTAL => Some("G_TOKEN_OCTAL")
      case G_TOKEN_INT => Some("G_TOKEN_INT")
      case G_TOKEN_HEX => Some("G_TOKEN_HEX")
      case G_TOKEN_FLOAT => Some("G_TOKEN_FLOAT")
      case G_TOKEN_STRING => Some("G_TOKEN_STRING")
      case G_TOKEN_SYMBOL => Some("G_TOKEN_SYMBOL")
      case G_TOKEN_IDENTIFIER => Some("G_TOKEN_IDENTIFIER")
      case G_TOKEN_IDENTIFIER_NULL => Some("G_TOKEN_IDENTIFIER_NULL")
      case G_TOKEN_COMMENT_SINGLE => Some("G_TOKEN_COMMENT_SINGLE")
      case G_TOKEN_COMMENT_MULTI => Some("G_TOKEN_COMMENT_MULTI")
      case G_TOKEN_LAST => Some("G_TOKEN_LAST")
      case _ => None
  extension (a: GTokenType)
    inline def &(b: GTokenType): GTokenType = a & b
    inline def |(b: GTokenType): GTokenType = a | b
    inline def is(b: GTokenType): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gnode.h
*/
opaque type GTraverseFlags = CUnsignedInt
object GTraverseFlags extends CEnumU[GTraverseFlags]:
  given _tag: Tag[GTraverseFlags] = Tag.UInt
  inline def define(inline a: Long): GTraverseFlags = a.toUInt
  val G_TRAVERSE_LEAVES = define(1)
  val G_TRAVERSE_NON_LEAVES = define(2)
  val G_TRAVERSE_ALL = define(3)
  val G_TRAVERSE_MASK = define(3)
  val G_TRAVERSE_LEAFS = define(1)
  val G_TRAVERSE_NON_LEAFS = define(2)
  inline def getName(inline value: GTraverseFlags): Option[String] =
    inline value match
      case G_TRAVERSE_LEAVES => Some("G_TRAVERSE_LEAVES")
      case G_TRAVERSE_NON_LEAVES => Some("G_TRAVERSE_NON_LEAVES")
      case G_TRAVERSE_ALL => Some("G_TRAVERSE_ALL")
      case G_TRAVERSE_MASK => Some("G_TRAVERSE_MASK")
      case G_TRAVERSE_LEAFS => Some("G_TRAVERSE_LEAFS")
      case G_TRAVERSE_NON_LEAFS => Some("G_TRAVERSE_NON_LEAFS")
      case _ => None
  extension (a: GTraverseFlags)
    inline def &(b: GTraverseFlags): GTraverseFlags = a & b
    inline def |(b: GTraverseFlags): GTraverseFlags = a | b
    inline def is(b: GTraverseFlags): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gnode.h
*/
opaque type GTraverseType = CUnsignedInt
object GTraverseType extends CEnumU[GTraverseType]:
  given _tag: Tag[GTraverseType] = Tag.UInt
  inline def define(inline a: Long): GTraverseType = a.toUInt
  val G_IN_ORDER = define(0)
  val G_PRE_ORDER = define(1)
  val G_POST_ORDER = define(2)
  val G_LEVEL_ORDER = define(3)
  inline def getName(inline value: GTraverseType): Option[String] =
    inline value match
      case G_IN_ORDER => Some("G_IN_ORDER")
      case G_PRE_ORDER => Some("G_PRE_ORDER")
      case G_POST_ORDER => Some("G_POST_ORDER")
      case G_LEVEL_ORDER => Some("G_LEVEL_ORDER")
      case _ => None
  extension (a: GTraverseType)
    inline def &(b: GTraverseType): GTraverseType = a & b
    inline def |(b: GTraverseType): GTraverseType = a | b
    inline def is(b: GTraverseType): Boolean = (a & b) == b

/**
 * GUnicodeBreakType: _UNICODE_BREAK_MANDATORY: Mandatory Break (BK) _UNICODE_BREAK_CARRIAGE_RETURN: Carriage Return (CR) _UNICODE_BREAK_LINE_FEED: Line Feed (LF) _UNICODE_BREAK_COMBINING_MARK: Attached Characters and Combining Marks (CM) _UNICODE_BREAK_SURROGATE: Surrogates (SG) _UNICODE_BREAK_ZERO_WIDTH_SPACE: Zero Width Space (ZW) _UNICODE_BREAK_INSEPARABLE: Inseparable (IN) _UNICODE_BREAK_NON_BREAKING_GLUE: Non-breaking ("Glue") (GL) _UNICODE_BREAK_CONTINGENT: Contingent Break Opportunity (CB) _UNICODE_BREAK_SPACE: Space (SP) _UNICODE_BREAK_AFTER: Break Opportunity After (BA) _UNICODE_BREAK_BEFORE: Break Opportunity Before (BB) _UNICODE_BREAK_BEFORE_AND_AFTER: Break Opportunity Before and After (B2) _UNICODE_BREAK_HYPHEN: Hyphen (HY) _UNICODE_BREAK_NON_STARTER: Nonstarter (NS) _UNICODE_BREAK_OPEN_PUNCTUATION: Opening Punctuation (OP) _UNICODE_BREAK_CLOSE_PUNCTUATION: Closing Punctuation (CL) _UNICODE_BREAK_QUOTATION: Ambiguous Quotation (QU) _UNICODE_BREAK_EXCLAMATION: Exclamation/Interrogation (EX) _UNICODE_BREAK_IDEOGRAPHIC: Ideographic (ID) _UNICODE_BREAK_NUMERIC: Numeric (NU) _UNICODE_BREAK_INFIX_SEPARATOR: Infix Separator (Numeric) (IS) _UNICODE_BREAK_SYMBOL: Symbols Allowing Break After (SY) _UNICODE_BREAK_ALPHABETIC: Ordinary Alphabetic and Symbol Characters (AL) _UNICODE_BREAK_PREFIX: Prefix (Numeric) (PR) _UNICODE_BREAK_POSTFIX: Postfix (Numeric) (PO) _UNICODE_BREAK_COMPLEX_CONTEXT: Complex Content Dependent (South East Asian) (SA) _UNICODE_BREAK_AMBIGUOUS: Ambiguous (Alphabetic or Ideographic) (AI) _UNICODE_BREAK_UNKNOWN: Unknown (XX) _UNICODE_BREAK_NEXT_LINE: Next Line (NL) _UNICODE_BREAK_WORD_JOINER: Word Joiner (WJ) _UNICODE_BREAK_HANGUL_L_JAMO: Hangul L Jamo (JL) _UNICODE_BREAK_HANGUL_V_JAMO: Hangul V Jamo (JV) _UNICODE_BREAK_HANGUL_T_JAMO: Hangul T Jamo (JT) _UNICODE_BREAK_HANGUL_LV_SYLLABLE: Hangul LV Syllable (H2) _UNICODE_BREAK_HANGUL_LVT_SYLLABLE: Hangul LVT Syllable (H3) _UNICODE_BREAK_CLOSE_PARANTHESIS: Closing Parenthesis (CP). Since 2.28. Deprecated: 2.70: Use %G_UNICODE_BREAK_CLOSE_PARENTHESIS instead. _UNICODE_BREAK_CLOSE_PARENTHESIS: Closing Parenthesis (CP). Since 2.70 _UNICODE_BREAK_CONDITIONAL_JAPANESE_STARTER: Conditional Japanese Starter (CJ). Since: 2.32 _UNICODE_BREAK_HEBREW_LETTER: Hebrew Letter (HL). Since: 2.32 _UNICODE_BREAK_REGIONAL_INDICATOR: Regional Indicator (RI). Since: 2.36 _UNICODE_BREAK_EMOJI_BASE: Emoji Base (EB). Since: 2.50 _UNICODE_BREAK_EMOJI_MODIFIER: Emoji Modifier (EM). Since: 2.50 _UNICODE_BREAK_ZERO_WIDTH_JOINER: Zero Width Joiner (ZWJ). Since: 2.50

 * [bindgen] header: /usr/include/glib-2.0/glib/gunicode.h
*/
opaque type GUnicodeBreakType = CUnsignedInt
object GUnicodeBreakType extends CEnumU[GUnicodeBreakType]:
  given _tag: Tag[GUnicodeBreakType] = Tag.UInt
  inline def define(inline a: Long): GUnicodeBreakType = a.toUInt
  val G_UNICODE_BREAK_MANDATORY = define(0)
  val G_UNICODE_BREAK_CARRIAGE_RETURN = define(1)
  val G_UNICODE_BREAK_LINE_FEED = define(2)
  val G_UNICODE_BREAK_COMBINING_MARK = define(3)
  val G_UNICODE_BREAK_SURROGATE = define(4)
  val G_UNICODE_BREAK_ZERO_WIDTH_SPACE = define(5)
  val G_UNICODE_BREAK_INSEPARABLE = define(6)
  val G_UNICODE_BREAK_NON_BREAKING_GLUE = define(7)
  val G_UNICODE_BREAK_CONTINGENT = define(8)
  val G_UNICODE_BREAK_SPACE = define(9)
  val G_UNICODE_BREAK_AFTER = define(10)
  val G_UNICODE_BREAK_BEFORE = define(11)
  val G_UNICODE_BREAK_BEFORE_AND_AFTER = define(12)
  val G_UNICODE_BREAK_HYPHEN = define(13)
  val G_UNICODE_BREAK_NON_STARTER = define(14)
  val G_UNICODE_BREAK_OPEN_PUNCTUATION = define(15)
  val G_UNICODE_BREAK_CLOSE_PUNCTUATION = define(16)
  val G_UNICODE_BREAK_QUOTATION = define(17)
  val G_UNICODE_BREAK_EXCLAMATION = define(18)
  val G_UNICODE_BREAK_IDEOGRAPHIC = define(19)
  val G_UNICODE_BREAK_NUMERIC = define(20)
  val G_UNICODE_BREAK_INFIX_SEPARATOR = define(21)
  val G_UNICODE_BREAK_SYMBOL = define(22)
  val G_UNICODE_BREAK_ALPHABETIC = define(23)
  val G_UNICODE_BREAK_PREFIX = define(24)
  val G_UNICODE_BREAK_POSTFIX = define(25)
  val G_UNICODE_BREAK_COMPLEX_CONTEXT = define(26)
  val G_UNICODE_BREAK_AMBIGUOUS = define(27)
  val G_UNICODE_BREAK_UNKNOWN = define(28)
  val G_UNICODE_BREAK_NEXT_LINE = define(29)
  val G_UNICODE_BREAK_WORD_JOINER = define(30)
  val G_UNICODE_BREAK_HANGUL_L_JAMO = define(31)
  val G_UNICODE_BREAK_HANGUL_V_JAMO = define(32)
  val G_UNICODE_BREAK_HANGUL_T_JAMO = define(33)
  val G_UNICODE_BREAK_HANGUL_LV_SYLLABLE = define(34)
  val G_UNICODE_BREAK_HANGUL_LVT_SYLLABLE = define(35)
  val G_UNICODE_BREAK_CLOSE_PARANTHESIS = define(36)
  val G_UNICODE_BREAK_CLOSE_PARENTHESIS = define(36)
  val G_UNICODE_BREAK_CONDITIONAL_JAPANESE_STARTER = define(37)
  val G_UNICODE_BREAK_HEBREW_LETTER = define(38)
  val G_UNICODE_BREAK_REGIONAL_INDICATOR = define(39)
  val G_UNICODE_BREAK_EMOJI_BASE = define(40)
  val G_UNICODE_BREAK_EMOJI_MODIFIER = define(41)
  val G_UNICODE_BREAK_ZERO_WIDTH_JOINER = define(42)
  inline def getName(inline value: GUnicodeBreakType): Option[String] =
    inline value match
      case G_UNICODE_BREAK_MANDATORY => Some("G_UNICODE_BREAK_MANDATORY")
      case G_UNICODE_BREAK_CARRIAGE_RETURN => Some("G_UNICODE_BREAK_CARRIAGE_RETURN")
      case G_UNICODE_BREAK_LINE_FEED => Some("G_UNICODE_BREAK_LINE_FEED")
      case G_UNICODE_BREAK_COMBINING_MARK => Some("G_UNICODE_BREAK_COMBINING_MARK")
      case G_UNICODE_BREAK_SURROGATE => Some("G_UNICODE_BREAK_SURROGATE")
      case G_UNICODE_BREAK_ZERO_WIDTH_SPACE => Some("G_UNICODE_BREAK_ZERO_WIDTH_SPACE")
      case G_UNICODE_BREAK_INSEPARABLE => Some("G_UNICODE_BREAK_INSEPARABLE")
      case G_UNICODE_BREAK_NON_BREAKING_GLUE => Some("G_UNICODE_BREAK_NON_BREAKING_GLUE")
      case G_UNICODE_BREAK_CONTINGENT => Some("G_UNICODE_BREAK_CONTINGENT")
      case G_UNICODE_BREAK_SPACE => Some("G_UNICODE_BREAK_SPACE")
      case G_UNICODE_BREAK_AFTER => Some("G_UNICODE_BREAK_AFTER")
      case G_UNICODE_BREAK_BEFORE => Some("G_UNICODE_BREAK_BEFORE")
      case G_UNICODE_BREAK_BEFORE_AND_AFTER => Some("G_UNICODE_BREAK_BEFORE_AND_AFTER")
      case G_UNICODE_BREAK_HYPHEN => Some("G_UNICODE_BREAK_HYPHEN")
      case G_UNICODE_BREAK_NON_STARTER => Some("G_UNICODE_BREAK_NON_STARTER")
      case G_UNICODE_BREAK_OPEN_PUNCTUATION => Some("G_UNICODE_BREAK_OPEN_PUNCTUATION")
      case G_UNICODE_BREAK_CLOSE_PUNCTUATION => Some("G_UNICODE_BREAK_CLOSE_PUNCTUATION")
      case G_UNICODE_BREAK_QUOTATION => Some("G_UNICODE_BREAK_QUOTATION")
      case G_UNICODE_BREAK_EXCLAMATION => Some("G_UNICODE_BREAK_EXCLAMATION")
      case G_UNICODE_BREAK_IDEOGRAPHIC => Some("G_UNICODE_BREAK_IDEOGRAPHIC")
      case G_UNICODE_BREAK_NUMERIC => Some("G_UNICODE_BREAK_NUMERIC")
      case G_UNICODE_BREAK_INFIX_SEPARATOR => Some("G_UNICODE_BREAK_INFIX_SEPARATOR")
      case G_UNICODE_BREAK_SYMBOL => Some("G_UNICODE_BREAK_SYMBOL")
      case G_UNICODE_BREAK_ALPHABETIC => Some("G_UNICODE_BREAK_ALPHABETIC")
      case G_UNICODE_BREAK_PREFIX => Some("G_UNICODE_BREAK_PREFIX")
      case G_UNICODE_BREAK_POSTFIX => Some("G_UNICODE_BREAK_POSTFIX")
      case G_UNICODE_BREAK_COMPLEX_CONTEXT => Some("G_UNICODE_BREAK_COMPLEX_CONTEXT")
      case G_UNICODE_BREAK_AMBIGUOUS => Some("G_UNICODE_BREAK_AMBIGUOUS")
      case G_UNICODE_BREAK_UNKNOWN => Some("G_UNICODE_BREAK_UNKNOWN")
      case G_UNICODE_BREAK_NEXT_LINE => Some("G_UNICODE_BREAK_NEXT_LINE")
      case G_UNICODE_BREAK_WORD_JOINER => Some("G_UNICODE_BREAK_WORD_JOINER")
      case G_UNICODE_BREAK_HANGUL_L_JAMO => Some("G_UNICODE_BREAK_HANGUL_L_JAMO")
      case G_UNICODE_BREAK_HANGUL_V_JAMO => Some("G_UNICODE_BREAK_HANGUL_V_JAMO")
      case G_UNICODE_BREAK_HANGUL_T_JAMO => Some("G_UNICODE_BREAK_HANGUL_T_JAMO")
      case G_UNICODE_BREAK_HANGUL_LV_SYLLABLE => Some("G_UNICODE_BREAK_HANGUL_LV_SYLLABLE")
      case G_UNICODE_BREAK_HANGUL_LVT_SYLLABLE => Some("G_UNICODE_BREAK_HANGUL_LVT_SYLLABLE")
      case G_UNICODE_BREAK_CLOSE_PARANTHESIS => Some("G_UNICODE_BREAK_CLOSE_PARANTHESIS")
      case G_UNICODE_BREAK_CLOSE_PARENTHESIS => Some("G_UNICODE_BREAK_CLOSE_PARENTHESIS")
      case G_UNICODE_BREAK_CONDITIONAL_JAPANESE_STARTER => Some("G_UNICODE_BREAK_CONDITIONAL_JAPANESE_STARTER")
      case G_UNICODE_BREAK_HEBREW_LETTER => Some("G_UNICODE_BREAK_HEBREW_LETTER")
      case G_UNICODE_BREAK_REGIONAL_INDICATOR => Some("G_UNICODE_BREAK_REGIONAL_INDICATOR")
      case G_UNICODE_BREAK_EMOJI_BASE => Some("G_UNICODE_BREAK_EMOJI_BASE")
      case G_UNICODE_BREAK_EMOJI_MODIFIER => Some("G_UNICODE_BREAK_EMOJI_MODIFIER")
      case G_UNICODE_BREAK_ZERO_WIDTH_JOINER => Some("G_UNICODE_BREAK_ZERO_WIDTH_JOINER")
      case _ => None
  extension (a: GUnicodeBreakType)
    inline def &(b: GUnicodeBreakType): GUnicodeBreakType = a & b
    inline def |(b: GUnicodeBreakType): GUnicodeBreakType = a | b
    inline def is(b: GUnicodeBreakType): Boolean = (a & b) == b

/**
 * GUnicodeScript: _UNICODE_SCRIPT_INVALID_CODE: a value never returned from g_unichar_get_script() _UNICODE_SCRIPT_COMMON: a character used by multiple different scripts _UNICODE_SCRIPT_INHERITED: a mark glyph that takes its script from the base glyph to which it is attached _UNICODE_SCRIPT_ARABIC: Arabic _UNICODE_SCRIPT_ARMENIAN: Armenian _UNICODE_SCRIPT_BENGALI: Bengali _UNICODE_SCRIPT_BOPOMOFO: Bopomofo _UNICODE_SCRIPT_CHEROKEE: Cherokee _UNICODE_SCRIPT_COPTIC: Coptic _UNICODE_SCRIPT_CYRILLIC: Cyrillic _UNICODE_SCRIPT_DESERET: Deseret _UNICODE_SCRIPT_DEVANAGARI: Devanagari _UNICODE_SCRIPT_ETHIOPIC: Ethiopic _UNICODE_SCRIPT_GEORGIAN: Georgian _UNICODE_SCRIPT_GOTHIC: Gothic _UNICODE_SCRIPT_GREEK: Greek _UNICODE_SCRIPT_GUJARATI: Gujarati _UNICODE_SCRIPT_GURMUKHI: Gurmukhi _UNICODE_SCRIPT_HAN: Han _UNICODE_SCRIPT_HANGUL: Hangul _UNICODE_SCRIPT_HEBREW: Hebrew _UNICODE_SCRIPT_HIRAGANA: Hiragana _UNICODE_SCRIPT_KANNADA: Kannada _UNICODE_SCRIPT_KATAKANA: Katakana _UNICODE_SCRIPT_KHMER: Khmer _UNICODE_SCRIPT_LAO: Lao _UNICODE_SCRIPT_LATIN: Latin _UNICODE_SCRIPT_MALAYALAM: Malayalam _UNICODE_SCRIPT_MONGOLIAN: Mongolian _UNICODE_SCRIPT_MYANMAR: Myanmar _UNICODE_SCRIPT_OGHAM: Ogham _UNICODE_SCRIPT_OLD_ITALIC: Old Italic _UNICODE_SCRIPT_ORIYA: Oriya _UNICODE_SCRIPT_RUNIC: Runic _UNICODE_SCRIPT_SINHALA: Sinhala _UNICODE_SCRIPT_SYRIAC: Syriac _UNICODE_SCRIPT_TAMIL: Tamil _UNICODE_SCRIPT_TELUGU: Telugu _UNICODE_SCRIPT_THAANA: Thaana _UNICODE_SCRIPT_THAI: Thai _UNICODE_SCRIPT_TIBETAN: Tibetan _UNICODE_SCRIPT_CANADIAN_ABORIGINAL: Canadian Aboriginal _UNICODE_SCRIPT_YI: Yi _UNICODE_SCRIPT_TAGALOG: Tagalog _UNICODE_SCRIPT_HANUNOO: Hanunoo _UNICODE_SCRIPT_BUHID: Buhid _UNICODE_SCRIPT_TAGBANWA: Tagbanwa _UNICODE_SCRIPT_BRAILLE: Braille _UNICODE_SCRIPT_CYPRIOT: Cypriot _UNICODE_SCRIPT_LIMBU: Limbu _UNICODE_SCRIPT_OSMANYA: Osmanya _UNICODE_SCRIPT_SHAVIAN: Shavian _UNICODE_SCRIPT_LINEAR_B: Linear B _UNICODE_SCRIPT_TAI_LE: Tai Le _UNICODE_SCRIPT_UGARITIC: Ugaritic _UNICODE_SCRIPT_NEW_TAI_LUE: New Tai Lue _UNICODE_SCRIPT_BUGINESE: Buginese _UNICODE_SCRIPT_GLAGOLITIC: Glagolitic _UNICODE_SCRIPT_TIFINAGH: Tifinagh _UNICODE_SCRIPT_SYLOTI_NAGRI: Syloti Nagri _UNICODE_SCRIPT_OLD_PERSIAN: Old Persian _UNICODE_SCRIPT_KHAROSHTHI: Kharoshthi _UNICODE_SCRIPT_UNKNOWN: an unassigned code point _UNICODE_SCRIPT_BALINESE: Balinese _UNICODE_SCRIPT_CUNEIFORM: Cuneiform _UNICODE_SCRIPT_PHOENICIAN: Phoenician _UNICODE_SCRIPT_PHAGS_PA: Phags-pa _UNICODE_SCRIPT_NKO: N'Ko _UNICODE_SCRIPT_KAYAH_LI: Kayah Li. Since 2.16.3 _UNICODE_SCRIPT_LEPCHA: Lepcha. Since 2.16.3 _UNICODE_SCRIPT_REJANG: Rejang. Since 2.16.3 _UNICODE_SCRIPT_SUNDANESE: Sundanese. Since 2.16.3 _UNICODE_SCRIPT_SAURASHTRA: Saurashtra. Since 2.16.3 _UNICODE_SCRIPT_CHAM: Cham. Since 2.16.3 _UNICODE_SCRIPT_OL_CHIKI: Ol Chiki. Since 2.16.3 _UNICODE_SCRIPT_VAI: Vai. Since 2.16.3 _UNICODE_SCRIPT_CARIAN: Carian. Since 2.16.3 _UNICODE_SCRIPT_LYCIAN: Lycian. Since 2.16.3 _UNICODE_SCRIPT_LYDIAN: Lydian. Since 2.16.3 _UNICODE_SCRIPT_AVESTAN: Avestan. Since 2.26 _UNICODE_SCRIPT_BAMUM: Bamum. Since 2.26 _UNICODE_SCRIPT_EGYPTIAN_HIEROGLYPHS: Egyptian Hieroglpyhs. Since 2.26 _UNICODE_SCRIPT_IMPERIAL_ARAMAIC: Imperial Aramaic. Since 2.26 _UNICODE_SCRIPT_INSCRIPTIONAL_PAHLAVI: Inscriptional Pahlavi. Since 2.26 _UNICODE_SCRIPT_INSCRIPTIONAL_PARTHIAN: Inscriptional Parthian. Since 2.26 _UNICODE_SCRIPT_JAVANESE: Javanese. Since 2.26 _UNICODE_SCRIPT_KAITHI: Kaithi. Since 2.26 _UNICODE_SCRIPT_LISU: Lisu. Since 2.26 _UNICODE_SCRIPT_MEETEI_MAYEK: Meetei Mayek. Since 2.26 _UNICODE_SCRIPT_OLD_SOUTH_ARABIAN: Old South Arabian. Since 2.26 _UNICODE_SCRIPT_OLD_TURKIC: Old Turkic. Since 2.28 _UNICODE_SCRIPT_SAMARITAN: Samaritan. Since 2.26 _UNICODE_SCRIPT_TAI_THAM: Tai Tham. Since 2.26 _UNICODE_SCRIPT_TAI_VIET: Tai Viet. Since 2.26 _UNICODE_SCRIPT_BATAK: Batak. Since 2.28 _UNICODE_SCRIPT_BRAHMI: Brahmi. Since 2.28 _UNICODE_SCRIPT_MANDAIC: Mandaic. Since 2.28 _UNICODE_SCRIPT_CHAKMA: Chakma. Since: 2.32 _UNICODE_SCRIPT_MEROITIC_CURSIVE: Meroitic Cursive. Since: 2.32 _UNICODE_SCRIPT_MEROITIC_HIEROGLYPHS: Meroitic Hieroglyphs. Since: 2.32 _UNICODE_SCRIPT_MIAO: Miao. Since: 2.32 _UNICODE_SCRIPT_SHARADA: Sharada. Since: 2.32 _UNICODE_SCRIPT_SORA_SOMPENG: Sora Sompeng. Since: 2.32 _UNICODE_SCRIPT_TAKRI: Takri. Since: 2.32 _UNICODE_SCRIPT_BASSA_VAH: Bassa. Since: 2.42 _UNICODE_SCRIPT_CAUCASIAN_ALBANIAN: Caucasian Albanian. Since: 2.42 _UNICODE_SCRIPT_DUPLOYAN: Duployan. Since: 2.42 _UNICODE_SCRIPT_ELBASAN: Elbasan. Since: 2.42 _UNICODE_SCRIPT_GRANTHA: Grantha. Since: 2.42 _UNICODE_SCRIPT_KHOJKI: Kjohki. Since: 2.42 _UNICODE_SCRIPT_KHUDAWADI: Khudawadi, Sindhi. Since: 2.42 _UNICODE_SCRIPT_LINEAR_A: Linear A. Since: 2.42 _UNICODE_SCRIPT_MAHAJANI: Mahajani. Since: 2.42 _UNICODE_SCRIPT_MANICHAEAN: Manichaean. Since: 2.42 _UNICODE_SCRIPT_MENDE_KIKAKUI: Mende Kikakui. Since: 2.42 _UNICODE_SCRIPT_MODI: Modi. Since: 2.42 _UNICODE_SCRIPT_MRO: Mro. Since: 2.42 _UNICODE_SCRIPT_NABATAEAN: Nabataean. Since: 2.42 _UNICODE_SCRIPT_OLD_NORTH_ARABIAN: Old North Arabian. Since: 2.42 _UNICODE_SCRIPT_OLD_PERMIC: Old Permic. Since: 2.42 _UNICODE_SCRIPT_PAHAWH_HMONG: Pahawh Hmong. Since: 2.42 _UNICODE_SCRIPT_PALMYRENE: Palmyrene. Since: 2.42 _UNICODE_SCRIPT_PAU_CIN_HAU: Pau Cin Hau. Since: 2.42 _UNICODE_SCRIPT_PSALTER_PAHLAVI: Psalter Pahlavi. Since: 2.42 _UNICODE_SCRIPT_SIDDHAM: Siddham. Since: 2.42 _UNICODE_SCRIPT_TIRHUTA: Tirhuta. Since: 2.42 _UNICODE_SCRIPT_WARANG_CITI: Warang Citi. Since: 2.42 _UNICODE_SCRIPT_AHOM: Ahom. Since: 2.48 _UNICODE_SCRIPT_ANATOLIAN_HIEROGLYPHS: Anatolian Hieroglyphs. Since: 2.48 _UNICODE_SCRIPT_HATRAN: Hatran. Since: 2.48 _UNICODE_SCRIPT_MULTANI: Multani. Since: 2.48 _UNICODE_SCRIPT_OLD_HUNGARIAN: Old Hungarian. Since: 2.48 _UNICODE_SCRIPT_SIGNWRITING: Signwriting. Since: 2.48 _UNICODE_SCRIPT_ADLAM: Adlam. Since: 2.50 _UNICODE_SCRIPT_BHAIKSUKI: Bhaiksuki. Since: 2.50 _UNICODE_SCRIPT_MARCHEN: Marchen. Since: 2.50 _UNICODE_SCRIPT_NEWA: Newa. Since: 2.50 _UNICODE_SCRIPT_OSAGE: Osage. Since: 2.50 _UNICODE_SCRIPT_TANGUT: Tangut. Since: 2.50 _UNICODE_SCRIPT_MASARAM_GONDI: Masaram Gondi. Since: 2.54 _UNICODE_SCRIPT_NUSHU: Nushu. Since: 2.54 _UNICODE_SCRIPT_SOYOMBO: Soyombo. Since: 2.54 _UNICODE_SCRIPT_ZANABAZAR_SQUARE: Zanabazar Square. Since: 2.54 _UNICODE_SCRIPT_DOGRA: Dogra. Since: 2.58 _UNICODE_SCRIPT_GUNJALA_GONDI: Gunjala Gondi. Since: 2.58 _UNICODE_SCRIPT_HANIFI_ROHINGYA: Hanifi Rohingya. Since: 2.58 _UNICODE_SCRIPT_MAKASAR: Makasar. Since: 2.58 _UNICODE_SCRIPT_MEDEFAIDRIN: Medefaidrin. Since: 2.58 _UNICODE_SCRIPT_OLD_SOGDIAN: Old Sogdian. Since: 2.58 _UNICODE_SCRIPT_SOGDIAN: Sogdian. Since: 2.58 _UNICODE_SCRIPT_ELYMAIC: Elym. Since: 2.62 _UNICODE_SCRIPT_NANDINAGARI: Nand. Since: 2.62 _UNICODE_SCRIPT_NYIAKENG_PUACHUE_HMONG: Rohg. Since: 2.62 _UNICODE_SCRIPT_WANCHO: Wcho. Since: 2.62 _UNICODE_SCRIPT_CHORASMIAN: Chorasmian. Since: 2.66 _UNICODE_SCRIPT_DIVES_AKURU: Dives Akuru. Since: 2.66 _UNICODE_SCRIPT_KHITAN_SMALL_SCRIPT: Khitan small script. Since: 2.66 _UNICODE_SCRIPT_YEZIDI: Yezidi. Since: 2.66 _UNICODE_SCRIPT_CYPRO_MINOAN: Cypro-Minoan. Since: 2.72 _UNICODE_SCRIPT_OLD_UYGHUR: Old Uyghur. Since: 2.72 _UNICODE_SCRIPT_TANGSA: Tangsa. Since: 2.72 _UNICODE_SCRIPT_TOTO: Toto. Since: 2.72 _UNICODE_SCRIPT_VITHKUQI: Vithkuqi. Since: 2.72 _UNICODE_SCRIPT_MATH: Mathematical notation. Since: 2.72

 * [bindgen] header: /usr/include/glib-2.0/glib/gunicode.h
*/
opaque type GUnicodeScript = CInt
object GUnicodeScript extends CEnum[GUnicodeScript]:
  given _tag: Tag[GUnicodeScript] = Tag.Int
  inline def define(inline a: CInt): GUnicodeScript = a
  val G_UNICODE_SCRIPT_INVALID_CODE = define(-1)
  val G_UNICODE_SCRIPT_COMMON = define(0)
  val G_UNICODE_SCRIPT_INHERITED = define(1)
  val G_UNICODE_SCRIPT_ARABIC = define(2)
  val G_UNICODE_SCRIPT_ARMENIAN = define(3)
  val G_UNICODE_SCRIPT_BENGALI = define(4)
  val G_UNICODE_SCRIPT_BOPOMOFO = define(5)
  val G_UNICODE_SCRIPT_CHEROKEE = define(6)
  val G_UNICODE_SCRIPT_COPTIC = define(7)
  val G_UNICODE_SCRIPT_CYRILLIC = define(8)
  val G_UNICODE_SCRIPT_DESERET = define(9)
  val G_UNICODE_SCRIPT_DEVANAGARI = define(10)
  val G_UNICODE_SCRIPT_ETHIOPIC = define(11)
  val G_UNICODE_SCRIPT_GEORGIAN = define(12)
  val G_UNICODE_SCRIPT_GOTHIC = define(13)
  val G_UNICODE_SCRIPT_GREEK = define(14)
  val G_UNICODE_SCRIPT_GUJARATI = define(15)
  val G_UNICODE_SCRIPT_GURMUKHI = define(16)
  val G_UNICODE_SCRIPT_HAN = define(17)
  val G_UNICODE_SCRIPT_HANGUL = define(18)
  val G_UNICODE_SCRIPT_HEBREW = define(19)
  val G_UNICODE_SCRIPT_HIRAGANA = define(20)
  val G_UNICODE_SCRIPT_KANNADA = define(21)
  val G_UNICODE_SCRIPT_KATAKANA = define(22)
  val G_UNICODE_SCRIPT_KHMER = define(23)
  val G_UNICODE_SCRIPT_LAO = define(24)
  val G_UNICODE_SCRIPT_LATIN = define(25)
  val G_UNICODE_SCRIPT_MALAYALAM = define(26)
  val G_UNICODE_SCRIPT_MONGOLIAN = define(27)
  val G_UNICODE_SCRIPT_MYANMAR = define(28)
  val G_UNICODE_SCRIPT_OGHAM = define(29)
  val G_UNICODE_SCRIPT_OLD_ITALIC = define(30)
  val G_UNICODE_SCRIPT_ORIYA = define(31)
  val G_UNICODE_SCRIPT_RUNIC = define(32)
  val G_UNICODE_SCRIPT_SINHALA = define(33)
  val G_UNICODE_SCRIPT_SYRIAC = define(34)
  val G_UNICODE_SCRIPT_TAMIL = define(35)
  val G_UNICODE_SCRIPT_TELUGU = define(36)
  val G_UNICODE_SCRIPT_THAANA = define(37)
  val G_UNICODE_SCRIPT_THAI = define(38)
  val G_UNICODE_SCRIPT_TIBETAN = define(39)
  val G_UNICODE_SCRIPT_CANADIAN_ABORIGINAL = define(40)
  val G_UNICODE_SCRIPT_YI = define(41)
  val G_UNICODE_SCRIPT_TAGALOG = define(42)
  val G_UNICODE_SCRIPT_HANUNOO = define(43)
  val G_UNICODE_SCRIPT_BUHID = define(44)
  val G_UNICODE_SCRIPT_TAGBANWA = define(45)
  val G_UNICODE_SCRIPT_BRAILLE = define(46)
  val G_UNICODE_SCRIPT_CYPRIOT = define(47)
  val G_UNICODE_SCRIPT_LIMBU = define(48)
  val G_UNICODE_SCRIPT_OSMANYA = define(49)
  val G_UNICODE_SCRIPT_SHAVIAN = define(50)
  val G_UNICODE_SCRIPT_LINEAR_B = define(51)
  val G_UNICODE_SCRIPT_TAI_LE = define(52)
  val G_UNICODE_SCRIPT_UGARITIC = define(53)
  val G_UNICODE_SCRIPT_NEW_TAI_LUE = define(54)
  val G_UNICODE_SCRIPT_BUGINESE = define(55)
  val G_UNICODE_SCRIPT_GLAGOLITIC = define(56)
  val G_UNICODE_SCRIPT_TIFINAGH = define(57)
  val G_UNICODE_SCRIPT_SYLOTI_NAGRI = define(58)
  val G_UNICODE_SCRIPT_OLD_PERSIAN = define(59)
  val G_UNICODE_SCRIPT_KHAROSHTHI = define(60)
  val G_UNICODE_SCRIPT_UNKNOWN = define(61)
  val G_UNICODE_SCRIPT_BALINESE = define(62)
  val G_UNICODE_SCRIPT_CUNEIFORM = define(63)
  val G_UNICODE_SCRIPT_PHOENICIAN = define(64)
  val G_UNICODE_SCRIPT_PHAGS_PA = define(65)
  val G_UNICODE_SCRIPT_NKO = define(66)
  val G_UNICODE_SCRIPT_KAYAH_LI = define(67)
  val G_UNICODE_SCRIPT_LEPCHA = define(68)
  val G_UNICODE_SCRIPT_REJANG = define(69)
  val G_UNICODE_SCRIPT_SUNDANESE = define(70)
  val G_UNICODE_SCRIPT_SAURASHTRA = define(71)
  val G_UNICODE_SCRIPT_CHAM = define(72)
  val G_UNICODE_SCRIPT_OL_CHIKI = define(73)
  val G_UNICODE_SCRIPT_VAI = define(74)
  val G_UNICODE_SCRIPT_CARIAN = define(75)
  val G_UNICODE_SCRIPT_LYCIAN = define(76)
  val G_UNICODE_SCRIPT_LYDIAN = define(77)
  val G_UNICODE_SCRIPT_AVESTAN = define(78)
  val G_UNICODE_SCRIPT_BAMUM = define(79)
  val G_UNICODE_SCRIPT_EGYPTIAN_HIEROGLYPHS = define(80)
  val G_UNICODE_SCRIPT_IMPERIAL_ARAMAIC = define(81)
  val G_UNICODE_SCRIPT_INSCRIPTIONAL_PAHLAVI = define(82)
  val G_UNICODE_SCRIPT_INSCRIPTIONAL_PARTHIAN = define(83)
  val G_UNICODE_SCRIPT_JAVANESE = define(84)
  val G_UNICODE_SCRIPT_KAITHI = define(85)
  val G_UNICODE_SCRIPT_LISU = define(86)
  val G_UNICODE_SCRIPT_MEETEI_MAYEK = define(87)
  val G_UNICODE_SCRIPT_OLD_SOUTH_ARABIAN = define(88)
  val G_UNICODE_SCRIPT_OLD_TURKIC = define(89)
  val G_UNICODE_SCRIPT_SAMARITAN = define(90)
  val G_UNICODE_SCRIPT_TAI_THAM = define(91)
  val G_UNICODE_SCRIPT_TAI_VIET = define(92)
  val G_UNICODE_SCRIPT_BATAK = define(93)
  val G_UNICODE_SCRIPT_BRAHMI = define(94)
  val G_UNICODE_SCRIPT_MANDAIC = define(95)
  val G_UNICODE_SCRIPT_CHAKMA = define(96)
  val G_UNICODE_SCRIPT_MEROITIC_CURSIVE = define(97)
  val G_UNICODE_SCRIPT_MEROITIC_HIEROGLYPHS = define(98)
  val G_UNICODE_SCRIPT_MIAO = define(99)
  val G_UNICODE_SCRIPT_SHARADA = define(100)
  val G_UNICODE_SCRIPT_SORA_SOMPENG = define(101)
  val G_UNICODE_SCRIPT_TAKRI = define(102)
  val G_UNICODE_SCRIPT_BASSA_VAH = define(103)
  val G_UNICODE_SCRIPT_CAUCASIAN_ALBANIAN = define(104)
  val G_UNICODE_SCRIPT_DUPLOYAN = define(105)
  val G_UNICODE_SCRIPT_ELBASAN = define(106)
  val G_UNICODE_SCRIPT_GRANTHA = define(107)
  val G_UNICODE_SCRIPT_KHOJKI = define(108)
  val G_UNICODE_SCRIPT_KHUDAWADI = define(109)
  val G_UNICODE_SCRIPT_LINEAR_A = define(110)
  val G_UNICODE_SCRIPT_MAHAJANI = define(111)
  val G_UNICODE_SCRIPT_MANICHAEAN = define(112)
  val G_UNICODE_SCRIPT_MENDE_KIKAKUI = define(113)
  val G_UNICODE_SCRIPT_MODI = define(114)
  val G_UNICODE_SCRIPT_MRO = define(115)
  val G_UNICODE_SCRIPT_NABATAEAN = define(116)
  val G_UNICODE_SCRIPT_OLD_NORTH_ARABIAN = define(117)
  val G_UNICODE_SCRIPT_OLD_PERMIC = define(118)
  val G_UNICODE_SCRIPT_PAHAWH_HMONG = define(119)
  val G_UNICODE_SCRIPT_PALMYRENE = define(120)
  val G_UNICODE_SCRIPT_PAU_CIN_HAU = define(121)
  val G_UNICODE_SCRIPT_PSALTER_PAHLAVI = define(122)
  val G_UNICODE_SCRIPT_SIDDHAM = define(123)
  val G_UNICODE_SCRIPT_TIRHUTA = define(124)
  val G_UNICODE_SCRIPT_WARANG_CITI = define(125)
  val G_UNICODE_SCRIPT_AHOM = define(126)
  val G_UNICODE_SCRIPT_ANATOLIAN_HIEROGLYPHS = define(127)
  val G_UNICODE_SCRIPT_HATRAN = define(128)
  val G_UNICODE_SCRIPT_MULTANI = define(129)
  val G_UNICODE_SCRIPT_OLD_HUNGARIAN = define(130)
  val G_UNICODE_SCRIPT_SIGNWRITING = define(131)
  val G_UNICODE_SCRIPT_ADLAM = define(132)
  val G_UNICODE_SCRIPT_BHAIKSUKI = define(133)
  val G_UNICODE_SCRIPT_MARCHEN = define(134)
  val G_UNICODE_SCRIPT_NEWA = define(135)
  val G_UNICODE_SCRIPT_OSAGE = define(136)
  val G_UNICODE_SCRIPT_TANGUT = define(137)
  val G_UNICODE_SCRIPT_MASARAM_GONDI = define(138)
  val G_UNICODE_SCRIPT_NUSHU = define(139)
  val G_UNICODE_SCRIPT_SOYOMBO = define(140)
  val G_UNICODE_SCRIPT_ZANABAZAR_SQUARE = define(141)
  val G_UNICODE_SCRIPT_DOGRA = define(142)
  val G_UNICODE_SCRIPT_GUNJALA_GONDI = define(143)
  val G_UNICODE_SCRIPT_HANIFI_ROHINGYA = define(144)
  val G_UNICODE_SCRIPT_MAKASAR = define(145)
  val G_UNICODE_SCRIPT_MEDEFAIDRIN = define(146)
  val G_UNICODE_SCRIPT_OLD_SOGDIAN = define(147)
  val G_UNICODE_SCRIPT_SOGDIAN = define(148)
  val G_UNICODE_SCRIPT_ELYMAIC = define(149)
  val G_UNICODE_SCRIPT_NANDINAGARI = define(150)
  val G_UNICODE_SCRIPT_NYIAKENG_PUACHUE_HMONG = define(151)
  val G_UNICODE_SCRIPT_WANCHO = define(152)
  val G_UNICODE_SCRIPT_CHORASMIAN = define(153)
  val G_UNICODE_SCRIPT_DIVES_AKURU = define(154)
  val G_UNICODE_SCRIPT_KHITAN_SMALL_SCRIPT = define(155)
  val G_UNICODE_SCRIPT_YEZIDI = define(156)
  val G_UNICODE_SCRIPT_CYPRO_MINOAN = define(157)
  val G_UNICODE_SCRIPT_OLD_UYGHUR = define(158)
  val G_UNICODE_SCRIPT_TANGSA = define(159)
  val G_UNICODE_SCRIPT_TOTO = define(160)
  val G_UNICODE_SCRIPT_VITHKUQI = define(161)
  val G_UNICODE_SCRIPT_MATH = define(162)
  inline def getName(inline value: GUnicodeScript): Option[String] =
    inline value match
      case G_UNICODE_SCRIPT_INVALID_CODE => Some("G_UNICODE_SCRIPT_INVALID_CODE")
      case G_UNICODE_SCRIPT_COMMON => Some("G_UNICODE_SCRIPT_COMMON")
      case G_UNICODE_SCRIPT_INHERITED => Some("G_UNICODE_SCRIPT_INHERITED")
      case G_UNICODE_SCRIPT_ARABIC => Some("G_UNICODE_SCRIPT_ARABIC")
      case G_UNICODE_SCRIPT_ARMENIAN => Some("G_UNICODE_SCRIPT_ARMENIAN")
      case G_UNICODE_SCRIPT_BENGALI => Some("G_UNICODE_SCRIPT_BENGALI")
      case G_UNICODE_SCRIPT_BOPOMOFO => Some("G_UNICODE_SCRIPT_BOPOMOFO")
      case G_UNICODE_SCRIPT_CHEROKEE => Some("G_UNICODE_SCRIPT_CHEROKEE")
      case G_UNICODE_SCRIPT_COPTIC => Some("G_UNICODE_SCRIPT_COPTIC")
      case G_UNICODE_SCRIPT_CYRILLIC => Some("G_UNICODE_SCRIPT_CYRILLIC")
      case G_UNICODE_SCRIPT_DESERET => Some("G_UNICODE_SCRIPT_DESERET")
      case G_UNICODE_SCRIPT_DEVANAGARI => Some("G_UNICODE_SCRIPT_DEVANAGARI")
      case G_UNICODE_SCRIPT_ETHIOPIC => Some("G_UNICODE_SCRIPT_ETHIOPIC")
      case G_UNICODE_SCRIPT_GEORGIAN => Some("G_UNICODE_SCRIPT_GEORGIAN")
      case G_UNICODE_SCRIPT_GOTHIC => Some("G_UNICODE_SCRIPT_GOTHIC")
      case G_UNICODE_SCRIPT_GREEK => Some("G_UNICODE_SCRIPT_GREEK")
      case G_UNICODE_SCRIPT_GUJARATI => Some("G_UNICODE_SCRIPT_GUJARATI")
      case G_UNICODE_SCRIPT_GURMUKHI => Some("G_UNICODE_SCRIPT_GURMUKHI")
      case G_UNICODE_SCRIPT_HAN => Some("G_UNICODE_SCRIPT_HAN")
      case G_UNICODE_SCRIPT_HANGUL => Some("G_UNICODE_SCRIPT_HANGUL")
      case G_UNICODE_SCRIPT_HEBREW => Some("G_UNICODE_SCRIPT_HEBREW")
      case G_UNICODE_SCRIPT_HIRAGANA => Some("G_UNICODE_SCRIPT_HIRAGANA")
      case G_UNICODE_SCRIPT_KANNADA => Some("G_UNICODE_SCRIPT_KANNADA")
      case G_UNICODE_SCRIPT_KATAKANA => Some("G_UNICODE_SCRIPT_KATAKANA")
      case G_UNICODE_SCRIPT_KHMER => Some("G_UNICODE_SCRIPT_KHMER")
      case G_UNICODE_SCRIPT_LAO => Some("G_UNICODE_SCRIPT_LAO")
      case G_UNICODE_SCRIPT_LATIN => Some("G_UNICODE_SCRIPT_LATIN")
      case G_UNICODE_SCRIPT_MALAYALAM => Some("G_UNICODE_SCRIPT_MALAYALAM")
      case G_UNICODE_SCRIPT_MONGOLIAN => Some("G_UNICODE_SCRIPT_MONGOLIAN")
      case G_UNICODE_SCRIPT_MYANMAR => Some("G_UNICODE_SCRIPT_MYANMAR")
      case G_UNICODE_SCRIPT_OGHAM => Some("G_UNICODE_SCRIPT_OGHAM")
      case G_UNICODE_SCRIPT_OLD_ITALIC => Some("G_UNICODE_SCRIPT_OLD_ITALIC")
      case G_UNICODE_SCRIPT_ORIYA => Some("G_UNICODE_SCRIPT_ORIYA")
      case G_UNICODE_SCRIPT_RUNIC => Some("G_UNICODE_SCRIPT_RUNIC")
      case G_UNICODE_SCRIPT_SINHALA => Some("G_UNICODE_SCRIPT_SINHALA")
      case G_UNICODE_SCRIPT_SYRIAC => Some("G_UNICODE_SCRIPT_SYRIAC")
      case G_UNICODE_SCRIPT_TAMIL => Some("G_UNICODE_SCRIPT_TAMIL")
      case G_UNICODE_SCRIPT_TELUGU => Some("G_UNICODE_SCRIPT_TELUGU")
      case G_UNICODE_SCRIPT_THAANA => Some("G_UNICODE_SCRIPT_THAANA")
      case G_UNICODE_SCRIPT_THAI => Some("G_UNICODE_SCRIPT_THAI")
      case G_UNICODE_SCRIPT_TIBETAN => Some("G_UNICODE_SCRIPT_TIBETAN")
      case G_UNICODE_SCRIPT_CANADIAN_ABORIGINAL => Some("G_UNICODE_SCRIPT_CANADIAN_ABORIGINAL")
      case G_UNICODE_SCRIPT_YI => Some("G_UNICODE_SCRIPT_YI")
      case G_UNICODE_SCRIPT_TAGALOG => Some("G_UNICODE_SCRIPT_TAGALOG")
      case G_UNICODE_SCRIPT_HANUNOO => Some("G_UNICODE_SCRIPT_HANUNOO")
      case G_UNICODE_SCRIPT_BUHID => Some("G_UNICODE_SCRIPT_BUHID")
      case G_UNICODE_SCRIPT_TAGBANWA => Some("G_UNICODE_SCRIPT_TAGBANWA")
      case G_UNICODE_SCRIPT_BRAILLE => Some("G_UNICODE_SCRIPT_BRAILLE")
      case G_UNICODE_SCRIPT_CYPRIOT => Some("G_UNICODE_SCRIPT_CYPRIOT")
      case G_UNICODE_SCRIPT_LIMBU => Some("G_UNICODE_SCRIPT_LIMBU")
      case G_UNICODE_SCRIPT_OSMANYA => Some("G_UNICODE_SCRIPT_OSMANYA")
      case G_UNICODE_SCRIPT_SHAVIAN => Some("G_UNICODE_SCRIPT_SHAVIAN")
      case G_UNICODE_SCRIPT_LINEAR_B => Some("G_UNICODE_SCRIPT_LINEAR_B")
      case G_UNICODE_SCRIPT_TAI_LE => Some("G_UNICODE_SCRIPT_TAI_LE")
      case G_UNICODE_SCRIPT_UGARITIC => Some("G_UNICODE_SCRIPT_UGARITIC")
      case G_UNICODE_SCRIPT_NEW_TAI_LUE => Some("G_UNICODE_SCRIPT_NEW_TAI_LUE")
      case G_UNICODE_SCRIPT_BUGINESE => Some("G_UNICODE_SCRIPT_BUGINESE")
      case G_UNICODE_SCRIPT_GLAGOLITIC => Some("G_UNICODE_SCRIPT_GLAGOLITIC")
      case G_UNICODE_SCRIPT_TIFINAGH => Some("G_UNICODE_SCRIPT_TIFINAGH")
      case G_UNICODE_SCRIPT_SYLOTI_NAGRI => Some("G_UNICODE_SCRIPT_SYLOTI_NAGRI")
      case G_UNICODE_SCRIPT_OLD_PERSIAN => Some("G_UNICODE_SCRIPT_OLD_PERSIAN")
      case G_UNICODE_SCRIPT_KHAROSHTHI => Some("G_UNICODE_SCRIPT_KHAROSHTHI")
      case G_UNICODE_SCRIPT_UNKNOWN => Some("G_UNICODE_SCRIPT_UNKNOWN")
      case G_UNICODE_SCRIPT_BALINESE => Some("G_UNICODE_SCRIPT_BALINESE")
      case G_UNICODE_SCRIPT_CUNEIFORM => Some("G_UNICODE_SCRIPT_CUNEIFORM")
      case G_UNICODE_SCRIPT_PHOENICIAN => Some("G_UNICODE_SCRIPT_PHOENICIAN")
      case G_UNICODE_SCRIPT_PHAGS_PA => Some("G_UNICODE_SCRIPT_PHAGS_PA")
      case G_UNICODE_SCRIPT_NKO => Some("G_UNICODE_SCRIPT_NKO")
      case G_UNICODE_SCRIPT_KAYAH_LI => Some("G_UNICODE_SCRIPT_KAYAH_LI")
      case G_UNICODE_SCRIPT_LEPCHA => Some("G_UNICODE_SCRIPT_LEPCHA")
      case G_UNICODE_SCRIPT_REJANG => Some("G_UNICODE_SCRIPT_REJANG")
      case G_UNICODE_SCRIPT_SUNDANESE => Some("G_UNICODE_SCRIPT_SUNDANESE")
      case G_UNICODE_SCRIPT_SAURASHTRA => Some("G_UNICODE_SCRIPT_SAURASHTRA")
      case G_UNICODE_SCRIPT_CHAM => Some("G_UNICODE_SCRIPT_CHAM")
      case G_UNICODE_SCRIPT_OL_CHIKI => Some("G_UNICODE_SCRIPT_OL_CHIKI")
      case G_UNICODE_SCRIPT_VAI => Some("G_UNICODE_SCRIPT_VAI")
      case G_UNICODE_SCRIPT_CARIAN => Some("G_UNICODE_SCRIPT_CARIAN")
      case G_UNICODE_SCRIPT_LYCIAN => Some("G_UNICODE_SCRIPT_LYCIAN")
      case G_UNICODE_SCRIPT_LYDIAN => Some("G_UNICODE_SCRIPT_LYDIAN")
      case G_UNICODE_SCRIPT_AVESTAN => Some("G_UNICODE_SCRIPT_AVESTAN")
      case G_UNICODE_SCRIPT_BAMUM => Some("G_UNICODE_SCRIPT_BAMUM")
      case G_UNICODE_SCRIPT_EGYPTIAN_HIEROGLYPHS => Some("G_UNICODE_SCRIPT_EGYPTIAN_HIEROGLYPHS")
      case G_UNICODE_SCRIPT_IMPERIAL_ARAMAIC => Some("G_UNICODE_SCRIPT_IMPERIAL_ARAMAIC")
      case G_UNICODE_SCRIPT_INSCRIPTIONAL_PAHLAVI => Some("G_UNICODE_SCRIPT_INSCRIPTIONAL_PAHLAVI")
      case G_UNICODE_SCRIPT_INSCRIPTIONAL_PARTHIAN => Some("G_UNICODE_SCRIPT_INSCRIPTIONAL_PARTHIAN")
      case G_UNICODE_SCRIPT_JAVANESE => Some("G_UNICODE_SCRIPT_JAVANESE")
      case G_UNICODE_SCRIPT_KAITHI => Some("G_UNICODE_SCRIPT_KAITHI")
      case G_UNICODE_SCRIPT_LISU => Some("G_UNICODE_SCRIPT_LISU")
      case G_UNICODE_SCRIPT_MEETEI_MAYEK => Some("G_UNICODE_SCRIPT_MEETEI_MAYEK")
      case G_UNICODE_SCRIPT_OLD_SOUTH_ARABIAN => Some("G_UNICODE_SCRIPT_OLD_SOUTH_ARABIAN")
      case G_UNICODE_SCRIPT_OLD_TURKIC => Some("G_UNICODE_SCRIPT_OLD_TURKIC")
      case G_UNICODE_SCRIPT_SAMARITAN => Some("G_UNICODE_SCRIPT_SAMARITAN")
      case G_UNICODE_SCRIPT_TAI_THAM => Some("G_UNICODE_SCRIPT_TAI_THAM")
      case G_UNICODE_SCRIPT_TAI_VIET => Some("G_UNICODE_SCRIPT_TAI_VIET")
      case G_UNICODE_SCRIPT_BATAK => Some("G_UNICODE_SCRIPT_BATAK")
      case G_UNICODE_SCRIPT_BRAHMI => Some("G_UNICODE_SCRIPT_BRAHMI")
      case G_UNICODE_SCRIPT_MANDAIC => Some("G_UNICODE_SCRIPT_MANDAIC")
      case G_UNICODE_SCRIPT_CHAKMA => Some("G_UNICODE_SCRIPT_CHAKMA")
      case G_UNICODE_SCRIPT_MEROITIC_CURSIVE => Some("G_UNICODE_SCRIPT_MEROITIC_CURSIVE")
      case G_UNICODE_SCRIPT_MEROITIC_HIEROGLYPHS => Some("G_UNICODE_SCRIPT_MEROITIC_HIEROGLYPHS")
      case G_UNICODE_SCRIPT_MIAO => Some("G_UNICODE_SCRIPT_MIAO")
      case G_UNICODE_SCRIPT_SHARADA => Some("G_UNICODE_SCRIPT_SHARADA")
      case G_UNICODE_SCRIPT_SORA_SOMPENG => Some("G_UNICODE_SCRIPT_SORA_SOMPENG")
      case G_UNICODE_SCRIPT_TAKRI => Some("G_UNICODE_SCRIPT_TAKRI")
      case G_UNICODE_SCRIPT_BASSA_VAH => Some("G_UNICODE_SCRIPT_BASSA_VAH")
      case G_UNICODE_SCRIPT_CAUCASIAN_ALBANIAN => Some("G_UNICODE_SCRIPT_CAUCASIAN_ALBANIAN")
      case G_UNICODE_SCRIPT_DUPLOYAN => Some("G_UNICODE_SCRIPT_DUPLOYAN")
      case G_UNICODE_SCRIPT_ELBASAN => Some("G_UNICODE_SCRIPT_ELBASAN")
      case G_UNICODE_SCRIPT_GRANTHA => Some("G_UNICODE_SCRIPT_GRANTHA")
      case G_UNICODE_SCRIPT_KHOJKI => Some("G_UNICODE_SCRIPT_KHOJKI")
      case G_UNICODE_SCRIPT_KHUDAWADI => Some("G_UNICODE_SCRIPT_KHUDAWADI")
      case G_UNICODE_SCRIPT_LINEAR_A => Some("G_UNICODE_SCRIPT_LINEAR_A")
      case G_UNICODE_SCRIPT_MAHAJANI => Some("G_UNICODE_SCRIPT_MAHAJANI")
      case G_UNICODE_SCRIPT_MANICHAEAN => Some("G_UNICODE_SCRIPT_MANICHAEAN")
      case G_UNICODE_SCRIPT_MENDE_KIKAKUI => Some("G_UNICODE_SCRIPT_MENDE_KIKAKUI")
      case G_UNICODE_SCRIPT_MODI => Some("G_UNICODE_SCRIPT_MODI")
      case G_UNICODE_SCRIPT_MRO => Some("G_UNICODE_SCRIPT_MRO")
      case G_UNICODE_SCRIPT_NABATAEAN => Some("G_UNICODE_SCRIPT_NABATAEAN")
      case G_UNICODE_SCRIPT_OLD_NORTH_ARABIAN => Some("G_UNICODE_SCRIPT_OLD_NORTH_ARABIAN")
      case G_UNICODE_SCRIPT_OLD_PERMIC => Some("G_UNICODE_SCRIPT_OLD_PERMIC")
      case G_UNICODE_SCRIPT_PAHAWH_HMONG => Some("G_UNICODE_SCRIPT_PAHAWH_HMONG")
      case G_UNICODE_SCRIPT_PALMYRENE => Some("G_UNICODE_SCRIPT_PALMYRENE")
      case G_UNICODE_SCRIPT_PAU_CIN_HAU => Some("G_UNICODE_SCRIPT_PAU_CIN_HAU")
      case G_UNICODE_SCRIPT_PSALTER_PAHLAVI => Some("G_UNICODE_SCRIPT_PSALTER_PAHLAVI")
      case G_UNICODE_SCRIPT_SIDDHAM => Some("G_UNICODE_SCRIPT_SIDDHAM")
      case G_UNICODE_SCRIPT_TIRHUTA => Some("G_UNICODE_SCRIPT_TIRHUTA")
      case G_UNICODE_SCRIPT_WARANG_CITI => Some("G_UNICODE_SCRIPT_WARANG_CITI")
      case G_UNICODE_SCRIPT_AHOM => Some("G_UNICODE_SCRIPT_AHOM")
      case G_UNICODE_SCRIPT_ANATOLIAN_HIEROGLYPHS => Some("G_UNICODE_SCRIPT_ANATOLIAN_HIEROGLYPHS")
      case G_UNICODE_SCRIPT_HATRAN => Some("G_UNICODE_SCRIPT_HATRAN")
      case G_UNICODE_SCRIPT_MULTANI => Some("G_UNICODE_SCRIPT_MULTANI")
      case G_UNICODE_SCRIPT_OLD_HUNGARIAN => Some("G_UNICODE_SCRIPT_OLD_HUNGARIAN")
      case G_UNICODE_SCRIPT_SIGNWRITING => Some("G_UNICODE_SCRIPT_SIGNWRITING")
      case G_UNICODE_SCRIPT_ADLAM => Some("G_UNICODE_SCRIPT_ADLAM")
      case G_UNICODE_SCRIPT_BHAIKSUKI => Some("G_UNICODE_SCRIPT_BHAIKSUKI")
      case G_UNICODE_SCRIPT_MARCHEN => Some("G_UNICODE_SCRIPT_MARCHEN")
      case G_UNICODE_SCRIPT_NEWA => Some("G_UNICODE_SCRIPT_NEWA")
      case G_UNICODE_SCRIPT_OSAGE => Some("G_UNICODE_SCRIPT_OSAGE")
      case G_UNICODE_SCRIPT_TANGUT => Some("G_UNICODE_SCRIPT_TANGUT")
      case G_UNICODE_SCRIPT_MASARAM_GONDI => Some("G_UNICODE_SCRIPT_MASARAM_GONDI")
      case G_UNICODE_SCRIPT_NUSHU => Some("G_UNICODE_SCRIPT_NUSHU")
      case G_UNICODE_SCRIPT_SOYOMBO => Some("G_UNICODE_SCRIPT_SOYOMBO")
      case G_UNICODE_SCRIPT_ZANABAZAR_SQUARE => Some("G_UNICODE_SCRIPT_ZANABAZAR_SQUARE")
      case G_UNICODE_SCRIPT_DOGRA => Some("G_UNICODE_SCRIPT_DOGRA")
      case G_UNICODE_SCRIPT_GUNJALA_GONDI => Some("G_UNICODE_SCRIPT_GUNJALA_GONDI")
      case G_UNICODE_SCRIPT_HANIFI_ROHINGYA => Some("G_UNICODE_SCRIPT_HANIFI_ROHINGYA")
      case G_UNICODE_SCRIPT_MAKASAR => Some("G_UNICODE_SCRIPT_MAKASAR")
      case G_UNICODE_SCRIPT_MEDEFAIDRIN => Some("G_UNICODE_SCRIPT_MEDEFAIDRIN")
      case G_UNICODE_SCRIPT_OLD_SOGDIAN => Some("G_UNICODE_SCRIPT_OLD_SOGDIAN")
      case G_UNICODE_SCRIPT_SOGDIAN => Some("G_UNICODE_SCRIPT_SOGDIAN")
      case G_UNICODE_SCRIPT_ELYMAIC => Some("G_UNICODE_SCRIPT_ELYMAIC")
      case G_UNICODE_SCRIPT_NANDINAGARI => Some("G_UNICODE_SCRIPT_NANDINAGARI")
      case G_UNICODE_SCRIPT_NYIAKENG_PUACHUE_HMONG => Some("G_UNICODE_SCRIPT_NYIAKENG_PUACHUE_HMONG")
      case G_UNICODE_SCRIPT_WANCHO => Some("G_UNICODE_SCRIPT_WANCHO")
      case G_UNICODE_SCRIPT_CHORASMIAN => Some("G_UNICODE_SCRIPT_CHORASMIAN")
      case G_UNICODE_SCRIPT_DIVES_AKURU => Some("G_UNICODE_SCRIPT_DIVES_AKURU")
      case G_UNICODE_SCRIPT_KHITAN_SMALL_SCRIPT => Some("G_UNICODE_SCRIPT_KHITAN_SMALL_SCRIPT")
      case G_UNICODE_SCRIPT_YEZIDI => Some("G_UNICODE_SCRIPT_YEZIDI")
      case G_UNICODE_SCRIPT_CYPRO_MINOAN => Some("G_UNICODE_SCRIPT_CYPRO_MINOAN")
      case G_UNICODE_SCRIPT_OLD_UYGHUR => Some("G_UNICODE_SCRIPT_OLD_UYGHUR")
      case G_UNICODE_SCRIPT_TANGSA => Some("G_UNICODE_SCRIPT_TANGSA")
      case G_UNICODE_SCRIPT_TOTO => Some("G_UNICODE_SCRIPT_TOTO")
      case G_UNICODE_SCRIPT_VITHKUQI => Some("G_UNICODE_SCRIPT_VITHKUQI")
      case G_UNICODE_SCRIPT_MATH => Some("G_UNICODE_SCRIPT_MATH")
      case _ => None
  extension (a: GUnicodeScript)
    inline def &(b: GUnicodeScript): GUnicodeScript = a & b
    inline def |(b: GUnicodeScript): GUnicodeScript = a | b
    inline def is(b: GUnicodeScript): Boolean = (a & b) == b

/**
 * GUnicodeType: _UNICODE_CONTROL: General category "Other, Control" (Cc) _UNICODE_FORMAT: General category "Other, Format" (Cf) _UNICODE_UNASSIGNED: General category "Other, Not Assigned" (Cn) _UNICODE_PRIVATE_USE: General category "Other, Private Use" (Co) _UNICODE_SURROGATE: General category "Other, Surrogate" (Cs) _UNICODE_LOWERCASE_LETTER: General category "Letter, Lowercase" (Ll) _UNICODE_MODIFIER_LETTER: General category "Letter, Modifier" (Lm) _UNICODE_OTHER_LETTER: General category "Letter, Other" (Lo) _UNICODE_TITLECASE_LETTER: General category "Letter, Titlecase" (Lt) _UNICODE_UPPERCASE_LETTER: General category "Letter, Uppercase" (Lu) _UNICODE_SPACING_MARK: General category "Mark, Spacing" (Mc) _UNICODE_ENCLOSING_MARK: General category "Mark, Enclosing" (Me) _UNICODE_NON_SPACING_MARK: General category "Mark, Nonspacing" (Mn) _UNICODE_DECIMAL_NUMBER: General category "Number, Decimal Digit" (Nd) _UNICODE_LETTER_NUMBER: General category "Number, Letter" (Nl) _UNICODE_OTHER_NUMBER: General category "Number, Other" (No) _UNICODE_CONNECT_PUNCTUATION: General category "Punctuation, Connector" (Pc) _UNICODE_DASH_PUNCTUATION: General category "Punctuation, Dash" (Pd) _UNICODE_CLOSE_PUNCTUATION: General category "Punctuation, Close" (Pe) _UNICODE_FINAL_PUNCTUATION: General category "Punctuation, Final quote" (Pf) _UNICODE_INITIAL_PUNCTUATION: General category "Punctuation, Initial quote" (Pi) _UNICODE_OTHER_PUNCTUATION: General category "Punctuation, Other" (Po) _UNICODE_OPEN_PUNCTUATION: General category "Punctuation, Open" (Ps) _UNICODE_CURRENCY_SYMBOL: General category "Symbol, Currency" (Sc) _UNICODE_MODIFIER_SYMBOL: General category "Symbol, Modifier" (Sk) _UNICODE_MATH_SYMBOL: General category "Symbol, Math" (Sm) _UNICODE_OTHER_SYMBOL: General category "Symbol, Other" (So) _UNICODE_LINE_SEPARATOR: General category "Separator, Line" (Zl) _UNICODE_PARAGRAPH_SEPARATOR: General category "Separator, Paragraph" (Zp) _UNICODE_SPACE_SEPARATOR: General category "Separator, Space" (Zs)

 * [bindgen] header: /usr/include/glib-2.0/glib/gunicode.h
*/
opaque type GUnicodeType = CUnsignedInt
object GUnicodeType extends CEnumU[GUnicodeType]:
  given _tag: Tag[GUnicodeType] = Tag.UInt
  inline def define(inline a: Long): GUnicodeType = a.toUInt
  val G_UNICODE_CONTROL = define(0)
  val G_UNICODE_FORMAT = define(1)
  val G_UNICODE_UNASSIGNED = define(2)
  val G_UNICODE_PRIVATE_USE = define(3)
  val G_UNICODE_SURROGATE = define(4)
  val G_UNICODE_LOWERCASE_LETTER = define(5)
  val G_UNICODE_MODIFIER_LETTER = define(6)
  val G_UNICODE_OTHER_LETTER = define(7)
  val G_UNICODE_TITLECASE_LETTER = define(8)
  val G_UNICODE_UPPERCASE_LETTER = define(9)
  val G_UNICODE_SPACING_MARK = define(10)
  val G_UNICODE_ENCLOSING_MARK = define(11)
  val G_UNICODE_NON_SPACING_MARK = define(12)
  val G_UNICODE_DECIMAL_NUMBER = define(13)
  val G_UNICODE_LETTER_NUMBER = define(14)
  val G_UNICODE_OTHER_NUMBER = define(15)
  val G_UNICODE_CONNECT_PUNCTUATION = define(16)
  val G_UNICODE_DASH_PUNCTUATION = define(17)
  val G_UNICODE_CLOSE_PUNCTUATION = define(18)
  val G_UNICODE_FINAL_PUNCTUATION = define(19)
  val G_UNICODE_INITIAL_PUNCTUATION = define(20)
  val G_UNICODE_OTHER_PUNCTUATION = define(21)
  val G_UNICODE_OPEN_PUNCTUATION = define(22)
  val G_UNICODE_CURRENCY_SYMBOL = define(23)
  val G_UNICODE_MODIFIER_SYMBOL = define(24)
  val G_UNICODE_MATH_SYMBOL = define(25)
  val G_UNICODE_OTHER_SYMBOL = define(26)
  val G_UNICODE_LINE_SEPARATOR = define(27)
  val G_UNICODE_PARAGRAPH_SEPARATOR = define(28)
  val G_UNICODE_SPACE_SEPARATOR = define(29)
  inline def getName(inline value: GUnicodeType): Option[String] =
    inline value match
      case G_UNICODE_CONTROL => Some("G_UNICODE_CONTROL")
      case G_UNICODE_FORMAT => Some("G_UNICODE_FORMAT")
      case G_UNICODE_UNASSIGNED => Some("G_UNICODE_UNASSIGNED")
      case G_UNICODE_PRIVATE_USE => Some("G_UNICODE_PRIVATE_USE")
      case G_UNICODE_SURROGATE => Some("G_UNICODE_SURROGATE")
      case G_UNICODE_LOWERCASE_LETTER => Some("G_UNICODE_LOWERCASE_LETTER")
      case G_UNICODE_MODIFIER_LETTER => Some("G_UNICODE_MODIFIER_LETTER")
      case G_UNICODE_OTHER_LETTER => Some("G_UNICODE_OTHER_LETTER")
      case G_UNICODE_TITLECASE_LETTER => Some("G_UNICODE_TITLECASE_LETTER")
      case G_UNICODE_UPPERCASE_LETTER => Some("G_UNICODE_UPPERCASE_LETTER")
      case G_UNICODE_SPACING_MARK => Some("G_UNICODE_SPACING_MARK")
      case G_UNICODE_ENCLOSING_MARK => Some("G_UNICODE_ENCLOSING_MARK")
      case G_UNICODE_NON_SPACING_MARK => Some("G_UNICODE_NON_SPACING_MARK")
      case G_UNICODE_DECIMAL_NUMBER => Some("G_UNICODE_DECIMAL_NUMBER")
      case G_UNICODE_LETTER_NUMBER => Some("G_UNICODE_LETTER_NUMBER")
      case G_UNICODE_OTHER_NUMBER => Some("G_UNICODE_OTHER_NUMBER")
      case G_UNICODE_CONNECT_PUNCTUATION => Some("G_UNICODE_CONNECT_PUNCTUATION")
      case G_UNICODE_DASH_PUNCTUATION => Some("G_UNICODE_DASH_PUNCTUATION")
      case G_UNICODE_CLOSE_PUNCTUATION => Some("G_UNICODE_CLOSE_PUNCTUATION")
      case G_UNICODE_FINAL_PUNCTUATION => Some("G_UNICODE_FINAL_PUNCTUATION")
      case G_UNICODE_INITIAL_PUNCTUATION => Some("G_UNICODE_INITIAL_PUNCTUATION")
      case G_UNICODE_OTHER_PUNCTUATION => Some("G_UNICODE_OTHER_PUNCTUATION")
      case G_UNICODE_OPEN_PUNCTUATION => Some("G_UNICODE_OPEN_PUNCTUATION")
      case G_UNICODE_CURRENCY_SYMBOL => Some("G_UNICODE_CURRENCY_SYMBOL")
      case G_UNICODE_MODIFIER_SYMBOL => Some("G_UNICODE_MODIFIER_SYMBOL")
      case G_UNICODE_MATH_SYMBOL => Some("G_UNICODE_MATH_SYMBOL")
      case G_UNICODE_OTHER_SYMBOL => Some("G_UNICODE_OTHER_SYMBOL")
      case G_UNICODE_LINE_SEPARATOR => Some("G_UNICODE_LINE_SEPARATOR")
      case G_UNICODE_PARAGRAPH_SEPARATOR => Some("G_UNICODE_PARAGRAPH_SEPARATOR")
      case G_UNICODE_SPACE_SEPARATOR => Some("G_UNICODE_SPACE_SEPARATOR")
      case _ => None
  extension (a: GUnicodeType)
    inline def &(b: GUnicodeType): GUnicodeType = a & b
    inline def |(b: GUnicodeType): GUnicodeType = a | b
    inline def is(b: GUnicodeType): Boolean = (a & b) == b

/**
 * GUriError: _URI_ERROR_FAILED: Generic error if no more specific error is available. See the error message for details. _URI_ERROR_BAD_SCHEME: The scheme of a URI could not be parsed. _URI_ERROR_BAD_USER: The user/userinfo of a URI could not be parsed. _URI_ERROR_BAD_PASSWORD: The password of a URI could not be parsed. _URI_ERROR_BAD_AUTH_PARAMS: The authentication parameters of a URI could not be parsed. _URI_ERROR_BAD_HOST: The host of a URI could not be parsed. _URI_ERROR_BAD_PORT: The port of a URI could not be parsed. _URI_ERROR_BAD_PATH: The path of a URI could not be parsed. _URI_ERROR_BAD_QUERY: The query of a URI could not be parsed. _URI_ERROR_BAD_FRAGMENT: The fragment of a URI could not be parsed.

 * [bindgen] header: /usr/include/glib-2.0/glib/guri.h
*/
opaque type GUriError = CUnsignedInt
object GUriError extends CEnumU[GUriError]:
  given _tag: Tag[GUriError] = Tag.UInt
  inline def define(inline a: Long): GUriError = a.toUInt
  val G_URI_ERROR_FAILED = define(0)
  val G_URI_ERROR_BAD_SCHEME = define(1)
  val G_URI_ERROR_BAD_USER = define(2)
  val G_URI_ERROR_BAD_PASSWORD = define(3)
  val G_URI_ERROR_BAD_AUTH_PARAMS = define(4)
  val G_URI_ERROR_BAD_HOST = define(5)
  val G_URI_ERROR_BAD_PORT = define(6)
  val G_URI_ERROR_BAD_PATH = define(7)
  val G_URI_ERROR_BAD_QUERY = define(8)
  val G_URI_ERROR_BAD_FRAGMENT = define(9)
  inline def getName(inline value: GUriError): Option[String] =
    inline value match
      case G_URI_ERROR_FAILED => Some("G_URI_ERROR_FAILED")
      case G_URI_ERROR_BAD_SCHEME => Some("G_URI_ERROR_BAD_SCHEME")
      case G_URI_ERROR_BAD_USER => Some("G_URI_ERROR_BAD_USER")
      case G_URI_ERROR_BAD_PASSWORD => Some("G_URI_ERROR_BAD_PASSWORD")
      case G_URI_ERROR_BAD_AUTH_PARAMS => Some("G_URI_ERROR_BAD_AUTH_PARAMS")
      case G_URI_ERROR_BAD_HOST => Some("G_URI_ERROR_BAD_HOST")
      case G_URI_ERROR_BAD_PORT => Some("G_URI_ERROR_BAD_PORT")
      case G_URI_ERROR_BAD_PATH => Some("G_URI_ERROR_BAD_PATH")
      case G_URI_ERROR_BAD_QUERY => Some("G_URI_ERROR_BAD_QUERY")
      case G_URI_ERROR_BAD_FRAGMENT => Some("G_URI_ERROR_BAD_FRAGMENT")
      case _ => None
  extension (a: GUriError)
    inline def &(b: GUriError): GUriError = a & b
    inline def |(b: GUriError): GUriError = a | b
    inline def is(b: GUriError): Boolean = (a & b) == b

/**
 * GUriFlags: _URI_FLAGS_NONE: No flags set. _URI_FLAGS_PARSE_RELAXED: Parse the URI more relaxedly than the [RFC 3986](https://tools.ietf.org/html/rfc3986) grammar specifies, fixing up or ignoring common mistakes in URIs coming from external sources. This is also needed for some obscure URI schemes where `;` separates the host from the path. Don’t use this flag unless you need to. _URI_FLAGS_HAS_PASSWORD: The userinfo field may contain a password, which will be separated from the username by `:`. _URI_FLAGS_HAS_AUTH_PARAMS: The userinfo may contain additional authentication-related parameters, which will be separated from the username and/or password by `;`. _URI_FLAGS_NON_DNS: The host component should not be assumed to be a DNS hostname or IP address (for example, for `smb` URIs with NetBIOS hostnames). _URI_FLAGS_ENCODED: When parsing a URI, this indicates that `%`-encoded characters in the userinfo, path, query, and fragment fields should not be decoded. (And likewise the host field if %G_URI_FLAGS_NON_DNS is also set.) When building a URI, it indicates that you have already `%`-encoded the components, and so #GUri should not do any encoding itself. _URI_FLAGS_ENCODED_QUERY: Same as %G_URI_FLAGS_ENCODED, for the query field only. _URI_FLAGS_ENCODED_PATH: Same as %G_URI_FLAGS_ENCODED, for the path only. _URI_FLAGS_ENCODED_FRAGMENT: Same as %G_URI_FLAGS_ENCODED, for the fragment only. _URI_FLAGS_SCHEME_NORMALIZE: A scheme-based normalization will be applied. For example, when parsing an HTTP URI changing omitted path to `/` and omitted port to `80`; and when building a URI, changing empty path to `/` and default port `80`). This only supports a subset of known schemes. (Since: 2.68)

 * [bindgen] header: /usr/include/glib-2.0/glib/guri.h
*/
opaque type GUriFlags = CUnsignedInt
object GUriFlags extends CEnumU[GUriFlags]:
  given _tag: Tag[GUriFlags] = Tag.UInt
  inline def define(inline a: Long): GUriFlags = a.toUInt
  val G_URI_FLAGS_NONE = define(0)
  val G_URI_FLAGS_PARSE_RELAXED = define(1)
  val G_URI_FLAGS_HAS_PASSWORD = define(2)
  val G_URI_FLAGS_HAS_AUTH_PARAMS = define(4)
  val G_URI_FLAGS_ENCODED = define(8)
  val G_URI_FLAGS_NON_DNS = define(16)
  val G_URI_FLAGS_ENCODED_QUERY = define(32)
  val G_URI_FLAGS_ENCODED_PATH = define(64)
  val G_URI_FLAGS_ENCODED_FRAGMENT = define(128)
  val G_URI_FLAGS_SCHEME_NORMALIZE = define(256)
  inline def getName(inline value: GUriFlags): Option[String] =
    inline value match
      case G_URI_FLAGS_NONE => Some("G_URI_FLAGS_NONE")
      case G_URI_FLAGS_PARSE_RELAXED => Some("G_URI_FLAGS_PARSE_RELAXED")
      case G_URI_FLAGS_HAS_PASSWORD => Some("G_URI_FLAGS_HAS_PASSWORD")
      case G_URI_FLAGS_HAS_AUTH_PARAMS => Some("G_URI_FLAGS_HAS_AUTH_PARAMS")
      case G_URI_FLAGS_ENCODED => Some("G_URI_FLAGS_ENCODED")
      case G_URI_FLAGS_NON_DNS => Some("G_URI_FLAGS_NON_DNS")
      case G_URI_FLAGS_ENCODED_QUERY => Some("G_URI_FLAGS_ENCODED_QUERY")
      case G_URI_FLAGS_ENCODED_PATH => Some("G_URI_FLAGS_ENCODED_PATH")
      case G_URI_FLAGS_ENCODED_FRAGMENT => Some("G_URI_FLAGS_ENCODED_FRAGMENT")
      case G_URI_FLAGS_SCHEME_NORMALIZE => Some("G_URI_FLAGS_SCHEME_NORMALIZE")
      case _ => None
  extension (a: GUriFlags)
    inline def &(b: GUriFlags): GUriFlags = a & b
    inline def |(b: GUriFlags): GUriFlags = a | b
    inline def is(b: GUriFlags): Boolean = (a & b) == b

/**
 * GUriHideFlags: _URI_HIDE_NONE: No flags set. _URI_HIDE_USERINFO: Hide the userinfo. _URI_HIDE_PASSWORD: Hide the password. _URI_HIDE_AUTH_PARAMS: Hide the auth_params. _URI_HIDE_QUERY: Hide the query. _URI_HIDE_FRAGMENT: Hide the fragment.

 * [bindgen] header: /usr/include/glib-2.0/glib/guri.h
*/
opaque type GUriHideFlags = CUnsignedInt
object GUriHideFlags extends CEnumU[GUriHideFlags]:
  given _tag: Tag[GUriHideFlags] = Tag.UInt
  inline def define(inline a: Long): GUriHideFlags = a.toUInt
  val G_URI_HIDE_NONE = define(0)
  val G_URI_HIDE_USERINFO = define(1)
  val G_URI_HIDE_PASSWORD = define(2)
  val G_URI_HIDE_AUTH_PARAMS = define(4)
  val G_URI_HIDE_QUERY = define(8)
  val G_URI_HIDE_FRAGMENT = define(16)
  inline def getName(inline value: GUriHideFlags): Option[String] =
    inline value match
      case G_URI_HIDE_NONE => Some("G_URI_HIDE_NONE")
      case G_URI_HIDE_USERINFO => Some("G_URI_HIDE_USERINFO")
      case G_URI_HIDE_PASSWORD => Some("G_URI_HIDE_PASSWORD")
      case G_URI_HIDE_AUTH_PARAMS => Some("G_URI_HIDE_AUTH_PARAMS")
      case G_URI_HIDE_QUERY => Some("G_URI_HIDE_QUERY")
      case G_URI_HIDE_FRAGMENT => Some("G_URI_HIDE_FRAGMENT")
      case _ => None
  extension (a: GUriHideFlags)
    inline def &(b: GUriHideFlags): GUriHideFlags = a & b
    inline def |(b: GUriHideFlags): GUriHideFlags = a | b
    inline def is(b: GUriHideFlags): Boolean = (a & b) == b

/**
 * GUriParamsFlags: _URI_PARAMS_NONE: No flags set. _URI_PARAMS_CASE_INSENSITIVE: Parameter names are case insensitive. _URI_PARAMS_WWW_FORM: Replace `+` with space character. Only useful for URLs on the web, using the `https` or `http` schemas. _URI_PARAMS_PARSE_RELAXED: See %G_URI_FLAGS_PARSE_RELAXED.

 * [bindgen] header: /usr/include/glib-2.0/glib/guri.h
*/
opaque type GUriParamsFlags = CUnsignedInt
object GUriParamsFlags extends CEnumU[GUriParamsFlags]:
  given _tag: Tag[GUriParamsFlags] = Tag.UInt
  inline def define(inline a: Long): GUriParamsFlags = a.toUInt
  val G_URI_PARAMS_NONE = define(0)
  val G_URI_PARAMS_CASE_INSENSITIVE = define(1)
  val G_URI_PARAMS_WWW_FORM = define(2)
  val G_URI_PARAMS_PARSE_RELAXED = define(4)
  inline def getName(inline value: GUriParamsFlags): Option[String] =
    inline value match
      case G_URI_PARAMS_NONE => Some("G_URI_PARAMS_NONE")
      case G_URI_PARAMS_CASE_INSENSITIVE => Some("G_URI_PARAMS_CASE_INSENSITIVE")
      case G_URI_PARAMS_WWW_FORM => Some("G_URI_PARAMS_WWW_FORM")
      case G_URI_PARAMS_PARSE_RELAXED => Some("G_URI_PARAMS_PARSE_RELAXED")
      case _ => None
  extension (a: GUriParamsFlags)
    inline def &(b: GUriParamsFlags): GUriParamsFlags = a & b
    inline def |(b: GUriParamsFlags): GUriParamsFlags = a | b
    inline def is(b: GUriParamsFlags): Boolean = (a & b) == b

/**
 * GUserDirectory: _USER_DIRECTORY_DESKTOP: the user's Desktop directory _USER_DIRECTORY_DOCUMENTS: the user's Documents directory _USER_DIRECTORY_DOWNLOAD: the user's Downloads directory _USER_DIRECTORY_MUSIC: the user's Music directory _USER_DIRECTORY_PICTURES: the user's Pictures directory _USER_DIRECTORY_PUBLIC_SHARE: the user's shared directory _USER_DIRECTORY_TEMPLATES: the user's Templates directory _USER_DIRECTORY_VIDEOS: the user's Movies directory _USER_N_DIRECTORIES: the number of enum values

 * [bindgen] header: /usr/include/glib-2.0/glib/gutils.h
*/
opaque type GUserDirectory = CUnsignedInt
object GUserDirectory extends CEnumU[GUserDirectory]:
  given _tag: Tag[GUserDirectory] = Tag.UInt
  inline def define(inline a: Long): GUserDirectory = a.toUInt
  val G_USER_DIRECTORY_DESKTOP = define(0)
  val G_USER_DIRECTORY_DOCUMENTS = define(1)
  val G_USER_DIRECTORY_DOWNLOAD = define(2)
  val G_USER_DIRECTORY_MUSIC = define(3)
  val G_USER_DIRECTORY_PICTURES = define(4)
  val G_USER_DIRECTORY_PUBLIC_SHARE = define(5)
  val G_USER_DIRECTORY_TEMPLATES = define(6)
  val G_USER_DIRECTORY_VIDEOS = define(7)
  val G_USER_N_DIRECTORIES = define(8)
  inline def getName(inline value: GUserDirectory): Option[String] =
    inline value match
      case G_USER_DIRECTORY_DESKTOP => Some("G_USER_DIRECTORY_DESKTOP")
      case G_USER_DIRECTORY_DOCUMENTS => Some("G_USER_DIRECTORY_DOCUMENTS")
      case G_USER_DIRECTORY_DOWNLOAD => Some("G_USER_DIRECTORY_DOWNLOAD")
      case G_USER_DIRECTORY_MUSIC => Some("G_USER_DIRECTORY_MUSIC")
      case G_USER_DIRECTORY_PICTURES => Some("G_USER_DIRECTORY_PICTURES")
      case G_USER_DIRECTORY_PUBLIC_SHARE => Some("G_USER_DIRECTORY_PUBLIC_SHARE")
      case G_USER_DIRECTORY_TEMPLATES => Some("G_USER_DIRECTORY_TEMPLATES")
      case G_USER_DIRECTORY_VIDEOS => Some("G_USER_DIRECTORY_VIDEOS")
      case G_USER_N_DIRECTORIES => Some("G_USER_N_DIRECTORIES")
      case _ => None
  extension (a: GUserDirectory)
    inline def &(b: GUserDirectory): GUserDirectory = a & b
    inline def |(b: GUserDirectory): GUserDirectory = a | b
    inline def is(b: GUserDirectory): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gvariant.h
*/
opaque type GVariantClass = CUnsignedInt
object GVariantClass extends CEnumU[GVariantClass]:
  given _tag: Tag[GVariantClass] = Tag.UInt
  inline def define(inline a: Long): GVariantClass = a.toUInt
  val G_VARIANT_CLASS_BOOLEAN = define(98)
  val G_VARIANT_CLASS_BYTE = define(121)
  val G_VARIANT_CLASS_INT16 = define(110)
  val G_VARIANT_CLASS_UINT16 = define(113)
  val G_VARIANT_CLASS_INT32 = define(105)
  val G_VARIANT_CLASS_UINT32 = define(117)
  val G_VARIANT_CLASS_INT64 = define(120)
  val G_VARIANT_CLASS_UINT64 = define(116)
  val G_VARIANT_CLASS_HANDLE = define(104)
  val G_VARIANT_CLASS_DOUBLE = define(100)
  val G_VARIANT_CLASS_STRING = define(115)
  val G_VARIANT_CLASS_OBJECT_PATH = define(111)
  val G_VARIANT_CLASS_SIGNATURE = define(103)
  val G_VARIANT_CLASS_VARIANT = define(118)
  val G_VARIANT_CLASS_MAYBE = define(109)
  val G_VARIANT_CLASS_ARRAY = define(97)
  val G_VARIANT_CLASS_TUPLE = define(40)
  val G_VARIANT_CLASS_DICT_ENTRY = define(123)
  inline def getName(inline value: GVariantClass): Option[String] =
    inline value match
      case G_VARIANT_CLASS_BOOLEAN => Some("G_VARIANT_CLASS_BOOLEAN")
      case G_VARIANT_CLASS_BYTE => Some("G_VARIANT_CLASS_BYTE")
      case G_VARIANT_CLASS_INT16 => Some("G_VARIANT_CLASS_INT16")
      case G_VARIANT_CLASS_UINT16 => Some("G_VARIANT_CLASS_UINT16")
      case G_VARIANT_CLASS_INT32 => Some("G_VARIANT_CLASS_INT32")
      case G_VARIANT_CLASS_UINT32 => Some("G_VARIANT_CLASS_UINT32")
      case G_VARIANT_CLASS_INT64 => Some("G_VARIANT_CLASS_INT64")
      case G_VARIANT_CLASS_UINT64 => Some("G_VARIANT_CLASS_UINT64")
      case G_VARIANT_CLASS_HANDLE => Some("G_VARIANT_CLASS_HANDLE")
      case G_VARIANT_CLASS_DOUBLE => Some("G_VARIANT_CLASS_DOUBLE")
      case G_VARIANT_CLASS_STRING => Some("G_VARIANT_CLASS_STRING")
      case G_VARIANT_CLASS_OBJECT_PATH => Some("G_VARIANT_CLASS_OBJECT_PATH")
      case G_VARIANT_CLASS_SIGNATURE => Some("G_VARIANT_CLASS_SIGNATURE")
      case G_VARIANT_CLASS_VARIANT => Some("G_VARIANT_CLASS_VARIANT")
      case G_VARIANT_CLASS_MAYBE => Some("G_VARIANT_CLASS_MAYBE")
      case G_VARIANT_CLASS_ARRAY => Some("G_VARIANT_CLASS_ARRAY")
      case G_VARIANT_CLASS_TUPLE => Some("G_VARIANT_CLASS_TUPLE")
      case G_VARIANT_CLASS_DICT_ENTRY => Some("G_VARIANT_CLASS_DICT_ENTRY")
      case _ => None
  extension (a: GVariantClass)
    inline def &(b: GVariantClass): GVariantClass = a & b
    inline def |(b: GVariantClass): GVariantClass = a | b
    inline def is(b: GVariantClass): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gvariant.h
*/
opaque type GVariantParseError = CUnsignedInt
object GVariantParseError extends CEnumU[GVariantParseError]:
  given _tag: Tag[GVariantParseError] = Tag.UInt
  inline def define(inline a: Long): GVariantParseError = a.toUInt
  val G_VARIANT_PARSE_ERROR_FAILED = define(0)
  val G_VARIANT_PARSE_ERROR_BASIC_TYPE_EXPECTED = define(1)
  val G_VARIANT_PARSE_ERROR_CANNOT_INFER_TYPE = define(2)
  val G_VARIANT_PARSE_ERROR_DEFINITE_TYPE_EXPECTED = define(3)
  val G_VARIANT_PARSE_ERROR_INPUT_NOT_AT_END = define(4)
  val G_VARIANT_PARSE_ERROR_INVALID_CHARACTER = define(5)
  val G_VARIANT_PARSE_ERROR_INVALID_FORMAT_STRING = define(6)
  val G_VARIANT_PARSE_ERROR_INVALID_OBJECT_PATH = define(7)
  val G_VARIANT_PARSE_ERROR_INVALID_SIGNATURE = define(8)
  val G_VARIANT_PARSE_ERROR_INVALID_TYPE_STRING = define(9)
  val G_VARIANT_PARSE_ERROR_NO_COMMON_TYPE = define(10)
  val G_VARIANT_PARSE_ERROR_NUMBER_OUT_OF_RANGE = define(11)
  val G_VARIANT_PARSE_ERROR_NUMBER_TOO_BIG = define(12)
  val G_VARIANT_PARSE_ERROR_TYPE_ERROR = define(13)
  val G_VARIANT_PARSE_ERROR_UNEXPECTED_TOKEN = define(14)
  val G_VARIANT_PARSE_ERROR_UNKNOWN_KEYWORD = define(15)
  val G_VARIANT_PARSE_ERROR_UNTERMINATED_STRING_CONSTANT = define(16)
  val G_VARIANT_PARSE_ERROR_VALUE_EXPECTED = define(17)
  val G_VARIANT_PARSE_ERROR_RECURSION = define(18)
  inline def getName(inline value: GVariantParseError): Option[String] =
    inline value match
      case G_VARIANT_PARSE_ERROR_FAILED => Some("G_VARIANT_PARSE_ERROR_FAILED")
      case G_VARIANT_PARSE_ERROR_BASIC_TYPE_EXPECTED => Some("G_VARIANT_PARSE_ERROR_BASIC_TYPE_EXPECTED")
      case G_VARIANT_PARSE_ERROR_CANNOT_INFER_TYPE => Some("G_VARIANT_PARSE_ERROR_CANNOT_INFER_TYPE")
      case G_VARIANT_PARSE_ERROR_DEFINITE_TYPE_EXPECTED => Some("G_VARIANT_PARSE_ERROR_DEFINITE_TYPE_EXPECTED")
      case G_VARIANT_PARSE_ERROR_INPUT_NOT_AT_END => Some("G_VARIANT_PARSE_ERROR_INPUT_NOT_AT_END")
      case G_VARIANT_PARSE_ERROR_INVALID_CHARACTER => Some("G_VARIANT_PARSE_ERROR_INVALID_CHARACTER")
      case G_VARIANT_PARSE_ERROR_INVALID_FORMAT_STRING => Some("G_VARIANT_PARSE_ERROR_INVALID_FORMAT_STRING")
      case G_VARIANT_PARSE_ERROR_INVALID_OBJECT_PATH => Some("G_VARIANT_PARSE_ERROR_INVALID_OBJECT_PATH")
      case G_VARIANT_PARSE_ERROR_INVALID_SIGNATURE => Some("G_VARIANT_PARSE_ERROR_INVALID_SIGNATURE")
      case G_VARIANT_PARSE_ERROR_INVALID_TYPE_STRING => Some("G_VARIANT_PARSE_ERROR_INVALID_TYPE_STRING")
      case G_VARIANT_PARSE_ERROR_NO_COMMON_TYPE => Some("G_VARIANT_PARSE_ERROR_NO_COMMON_TYPE")
      case G_VARIANT_PARSE_ERROR_NUMBER_OUT_OF_RANGE => Some("G_VARIANT_PARSE_ERROR_NUMBER_OUT_OF_RANGE")
      case G_VARIANT_PARSE_ERROR_NUMBER_TOO_BIG => Some("G_VARIANT_PARSE_ERROR_NUMBER_TOO_BIG")
      case G_VARIANT_PARSE_ERROR_TYPE_ERROR => Some("G_VARIANT_PARSE_ERROR_TYPE_ERROR")
      case G_VARIANT_PARSE_ERROR_UNEXPECTED_TOKEN => Some("G_VARIANT_PARSE_ERROR_UNEXPECTED_TOKEN")
      case G_VARIANT_PARSE_ERROR_UNKNOWN_KEYWORD => Some("G_VARIANT_PARSE_ERROR_UNKNOWN_KEYWORD")
      case G_VARIANT_PARSE_ERROR_UNTERMINATED_STRING_CONSTANT => Some("G_VARIANT_PARSE_ERROR_UNTERMINATED_STRING_CONSTANT")
      case G_VARIANT_PARSE_ERROR_VALUE_EXPECTED => Some("G_VARIANT_PARSE_ERROR_VALUE_EXPECTED")
      case G_VARIANT_PARSE_ERROR_RECURSION => Some("G_VARIANT_PARSE_ERROR_RECURSION")
      case _ => None
  extension (a: GVariantParseError)
    inline def &(b: GVariantParseError): GVariantParseError = a & b
    inline def |(b: GVariantParseError): GVariantParseError = a | b
    inline def is(b: GVariantParseError): Boolean = (a & b) == b

