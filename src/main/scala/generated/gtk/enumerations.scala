package gtk
package enumerations

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

private[gtk] trait CEnum[T](using eq: T =:= Int):
  given Tag[T] = Tag.Int.asInstanceOf[Tag[T]]
  extension (inline t: T) 
    inline def int: CInt = eq.apply(t)
    inline def value: CInt = eq.apply(t)
private[gtk] trait CEnumU[T](using eq: T =:= UInt):
  given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
  extension (inline t: T)
   inline def int: CInt = eq.apply(t).toInt
   inline def uint: CUnsignedInt = eq.apply(t)
   inline def value: CUnsignedInt = eq.apply(t)
opaque type GAppInfoCreateFlags = CUnsignedInt
object GAppInfoCreateFlags extends CEnumU[GAppInfoCreateFlags]:
  given _tag: Tag[GAppInfoCreateFlags] = Tag.UInt
  inline def define(inline a: Long): GAppInfoCreateFlags = a.toUInt
  val G_APP_INFO_CREATE_NONE = define(0)
  val G_APP_INFO_CREATE_NEEDS_TERMINAL = define(1)
  val G_APP_INFO_CREATE_SUPPORTS_URIS = define(2)
  val G_APP_INFO_CREATE_SUPPORTS_STARTUP_NOTIFICATION = define(4)
  inline def getName(inline value: GAppInfoCreateFlags): Option[String] =
    value match
      case G_APP_INFO_CREATE_NONE => Some("G_APP_INFO_CREATE_NONE")
      case G_APP_INFO_CREATE_NEEDS_TERMINAL => Some("G_APP_INFO_CREATE_NEEDS_TERMINAL")
      case G_APP_INFO_CREATE_SUPPORTS_URIS => Some("G_APP_INFO_CREATE_SUPPORTS_URIS")
      case G_APP_INFO_CREATE_SUPPORTS_STARTUP_NOTIFICATION => Some("G_APP_INFO_CREATE_SUPPORTS_STARTUP_NOTIFICATION")
      case _ => None
  extension (a: GAppInfoCreateFlags)
    inline def &(b: GAppInfoCreateFlags): GAppInfoCreateFlags = a & b
    inline def |(b: GAppInfoCreateFlags): GAppInfoCreateFlags = a | b
    inline def is(b: GAppInfoCreateFlags): Boolean = (a & b) == b

opaque type GApplicationFlags = CUnsignedInt
object GApplicationFlags extends CEnumU[GApplicationFlags]:
  given _tag: Tag[GApplicationFlags] = Tag.UInt
  inline def define(inline a: Long): GApplicationFlags = a.toUInt
  val G_APPLICATION_FLAGS_NONE = define(0)
  val G_APPLICATION_IS_SERVICE = define(1)
  val G_APPLICATION_IS_LAUNCHER = define(2)
  val G_APPLICATION_HANDLES_OPEN = define(4)
  val G_APPLICATION_HANDLES_COMMAND_LINE = define(8)
  val G_APPLICATION_SEND_ENVIRONMENT = define(16)
  val G_APPLICATION_NON_UNIQUE = define(32)
  val G_APPLICATION_CAN_OVERRIDE_APP_ID = define(64)
  val G_APPLICATION_ALLOW_REPLACEMENT = define(128)
  val G_APPLICATION_REPLACE = define(256)
  inline def getName(inline value: GApplicationFlags): Option[String] =
    value match
      case G_APPLICATION_FLAGS_NONE => Some("G_APPLICATION_FLAGS_NONE")
      case G_APPLICATION_IS_SERVICE => Some("G_APPLICATION_IS_SERVICE")
      case G_APPLICATION_IS_LAUNCHER => Some("G_APPLICATION_IS_LAUNCHER")
      case G_APPLICATION_HANDLES_OPEN => Some("G_APPLICATION_HANDLES_OPEN")
      case G_APPLICATION_HANDLES_COMMAND_LINE => Some("G_APPLICATION_HANDLES_COMMAND_LINE")
      case G_APPLICATION_SEND_ENVIRONMENT => Some("G_APPLICATION_SEND_ENVIRONMENT")
      case G_APPLICATION_NON_UNIQUE => Some("G_APPLICATION_NON_UNIQUE")
      case G_APPLICATION_CAN_OVERRIDE_APP_ID => Some("G_APPLICATION_CAN_OVERRIDE_APP_ID")
      case G_APPLICATION_ALLOW_REPLACEMENT => Some("G_APPLICATION_ALLOW_REPLACEMENT")
      case G_APPLICATION_REPLACE => Some("G_APPLICATION_REPLACE")
      case _ => None
  extension (a: GApplicationFlags)
    inline def &(b: GApplicationFlags): GApplicationFlags = a & b
    inline def |(b: GApplicationFlags): GApplicationFlags = a | b
    inline def is(b: GApplicationFlags): Boolean = (a & b) == b

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
    value match
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

opaque type GAskPasswordFlags = CUnsignedInt
object GAskPasswordFlags extends CEnumU[GAskPasswordFlags]:
  given _tag: Tag[GAskPasswordFlags] = Tag.UInt
  inline def define(inline a: Long): GAskPasswordFlags = a.toUInt
  val G_ASK_PASSWORD_NEED_PASSWORD = define(1)
  val G_ASK_PASSWORD_NEED_USERNAME = define(2)
  val G_ASK_PASSWORD_NEED_DOMAIN = define(4)
  val G_ASK_PASSWORD_SAVING_SUPPORTED = define(8)
  val G_ASK_PASSWORD_ANONYMOUS_SUPPORTED = define(16)
  val G_ASK_PASSWORD_TCRYPT = define(32)
  inline def getName(inline value: GAskPasswordFlags): Option[String] =
    value match
      case G_ASK_PASSWORD_NEED_PASSWORD => Some("G_ASK_PASSWORD_NEED_PASSWORD")
      case G_ASK_PASSWORD_NEED_USERNAME => Some("G_ASK_PASSWORD_NEED_USERNAME")
      case G_ASK_PASSWORD_NEED_DOMAIN => Some("G_ASK_PASSWORD_NEED_DOMAIN")
      case G_ASK_PASSWORD_SAVING_SUPPORTED => Some("G_ASK_PASSWORD_SAVING_SUPPORTED")
      case G_ASK_PASSWORD_ANONYMOUS_SUPPORTED => Some("G_ASK_PASSWORD_ANONYMOUS_SUPPORTED")
      case G_ASK_PASSWORD_TCRYPT => Some("G_ASK_PASSWORD_TCRYPT")
      case _ => None
  extension (a: GAskPasswordFlags)
    inline def &(b: GAskPasswordFlags): GAskPasswordFlags = a & b
    inline def |(b: GAskPasswordFlags): GAskPasswordFlags = a | b
    inline def is(b: GAskPasswordFlags): Boolean = (a & b) == b

opaque type GBindingFlags = CUnsignedInt
object GBindingFlags extends CEnumU[GBindingFlags]:
  given _tag: Tag[GBindingFlags] = Tag.UInt
  inline def define(inline a: Long): GBindingFlags = a.toUInt
  val G_BINDING_DEFAULT = define(0)
  val G_BINDING_BIDIRECTIONAL = define(1)
  val G_BINDING_SYNC_CREATE = define(2)
  val G_BINDING_INVERT_BOOLEAN = define(4)
  inline def getName(inline value: GBindingFlags): Option[String] =
    value match
      case G_BINDING_DEFAULT => Some("G_BINDING_DEFAULT")
      case G_BINDING_BIDIRECTIONAL => Some("G_BINDING_BIDIRECTIONAL")
      case G_BINDING_SYNC_CREATE => Some("G_BINDING_SYNC_CREATE")
      case G_BINDING_INVERT_BOOLEAN => Some("G_BINDING_INVERT_BOOLEAN")
      case _ => None
  extension (a: GBindingFlags)
    inline def &(b: GBindingFlags): GBindingFlags = a & b
    inline def |(b: GBindingFlags): GBindingFlags = a | b
    inline def is(b: GBindingFlags): Boolean = (a & b) == b

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
    value match
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

opaque type GBusNameOwnerFlags = CUnsignedInt
object GBusNameOwnerFlags extends CEnumU[GBusNameOwnerFlags]:
  given _tag: Tag[GBusNameOwnerFlags] = Tag.UInt
  inline def define(inline a: Long): GBusNameOwnerFlags = a.toUInt
  val G_BUS_NAME_OWNER_FLAGS_NONE = define(0)
  val G_BUS_NAME_OWNER_FLAGS_ALLOW_REPLACEMENT = define(1)
  val G_BUS_NAME_OWNER_FLAGS_REPLACE = define(2)
  val G_BUS_NAME_OWNER_FLAGS_DO_NOT_QUEUE = define(4)
  inline def getName(inline value: GBusNameOwnerFlags): Option[String] =
    value match
      case G_BUS_NAME_OWNER_FLAGS_NONE => Some("G_BUS_NAME_OWNER_FLAGS_NONE")
      case G_BUS_NAME_OWNER_FLAGS_ALLOW_REPLACEMENT => Some("G_BUS_NAME_OWNER_FLAGS_ALLOW_REPLACEMENT")
      case G_BUS_NAME_OWNER_FLAGS_REPLACE => Some("G_BUS_NAME_OWNER_FLAGS_REPLACE")
      case G_BUS_NAME_OWNER_FLAGS_DO_NOT_QUEUE => Some("G_BUS_NAME_OWNER_FLAGS_DO_NOT_QUEUE")
      case _ => None
  extension (a: GBusNameOwnerFlags)
    inline def &(b: GBusNameOwnerFlags): GBusNameOwnerFlags = a & b
    inline def |(b: GBusNameOwnerFlags): GBusNameOwnerFlags = a | b
    inline def is(b: GBusNameOwnerFlags): Boolean = (a & b) == b

opaque type GBusNameWatcherFlags = CUnsignedInt
object GBusNameWatcherFlags extends CEnumU[GBusNameWatcherFlags]:
  given _tag: Tag[GBusNameWatcherFlags] = Tag.UInt
  inline def define(inline a: Long): GBusNameWatcherFlags = a.toUInt
  val G_BUS_NAME_WATCHER_FLAGS_NONE = define(0)
  val G_BUS_NAME_WATCHER_FLAGS_AUTO_START = define(1)
  inline def getName(inline value: GBusNameWatcherFlags): Option[String] =
    value match
      case G_BUS_NAME_WATCHER_FLAGS_NONE => Some("G_BUS_NAME_WATCHER_FLAGS_NONE")
      case G_BUS_NAME_WATCHER_FLAGS_AUTO_START => Some("G_BUS_NAME_WATCHER_FLAGS_AUTO_START")
      case _ => None
  extension (a: GBusNameWatcherFlags)
    inline def &(b: GBusNameWatcherFlags): GBusNameWatcherFlags = a & b
    inline def |(b: GBusNameWatcherFlags): GBusNameWatcherFlags = a | b
    inline def is(b: GBusNameWatcherFlags): Boolean = (a & b) == b

opaque type GBusType = CInt
object GBusType extends CEnum[GBusType]:
  given _tag: Tag[GBusType] = Tag.Int
  inline def define(inline a: CInt): GBusType = a
  val G_BUS_TYPE_STARTER = define(-1)
  val G_BUS_TYPE_NONE = define(0)
  val G_BUS_TYPE_SYSTEM = define(1)
  val G_BUS_TYPE_SESSION = define(2)
  inline def getName(inline value: GBusType): Option[String] =
    value match
      case G_BUS_TYPE_STARTER => Some("G_BUS_TYPE_STARTER")
      case G_BUS_TYPE_NONE => Some("G_BUS_TYPE_NONE")
      case G_BUS_TYPE_SYSTEM => Some("G_BUS_TYPE_SYSTEM")
      case G_BUS_TYPE_SESSION => Some("G_BUS_TYPE_SESSION")
      case _ => None
  extension (a: GBusType)
    inline def &(b: GBusType): GBusType = a & b
    inline def |(b: GBusType): GBusType = a | b
    inline def is(b: GBusType): Boolean = (a & b) == b

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
    value match
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

opaque type GConnectFlags = CUnsignedInt
object GConnectFlags extends CEnumU[GConnectFlags]:
  given _tag: Tag[GConnectFlags] = Tag.UInt
  inline def define(inline a: Long): GConnectFlags = a.toUInt
  val G_CONNECT_AFTER = define(1)
  val G_CONNECT_SWAPPED = define(2)
  inline def getName(inline value: GConnectFlags): Option[String] =
    value match
      case G_CONNECT_AFTER => Some("G_CONNECT_AFTER")
      case G_CONNECT_SWAPPED => Some("G_CONNECT_SWAPPED")
      case _ => None
  extension (a: GConnectFlags)
    inline def &(b: GConnectFlags): GConnectFlags = a & b
    inline def |(b: GConnectFlags): GConnectFlags = a | b
    inline def is(b: GConnectFlags): Boolean = (a & b) == b

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
    value match
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

opaque type GConverterFlags = CUnsignedInt
object GConverterFlags extends CEnumU[GConverterFlags]:
  given _tag: Tag[GConverterFlags] = Tag.UInt
  inline def define(inline a: Long): GConverterFlags = a.toUInt
  val G_CONVERTER_NO_FLAGS = define(0)
  val G_CONVERTER_INPUT_AT_END = define(1)
  val G_CONVERTER_FLUSH = define(2)
  inline def getName(inline value: GConverterFlags): Option[String] =
    value match
      case G_CONVERTER_NO_FLAGS => Some("G_CONVERTER_NO_FLAGS")
      case G_CONVERTER_INPUT_AT_END => Some("G_CONVERTER_INPUT_AT_END")
      case G_CONVERTER_FLUSH => Some("G_CONVERTER_FLUSH")
      case _ => None
  extension (a: GConverterFlags)
    inline def &(b: GConverterFlags): GConverterFlags = a & b
    inline def |(b: GConverterFlags): GConverterFlags = a | b
    inline def is(b: GConverterFlags): Boolean = (a & b) == b

opaque type GConverterResult = CUnsignedInt
object GConverterResult extends CEnumU[GConverterResult]:
  given _tag: Tag[GConverterResult] = Tag.UInt
  inline def define(inline a: Long): GConverterResult = a.toUInt
  val G_CONVERTER_ERROR = define(0)
  val G_CONVERTER_CONVERTED = define(1)
  val G_CONVERTER_FINISHED = define(2)
  val G_CONVERTER_FLUSHED = define(3)
  inline def getName(inline value: GConverterResult): Option[String] =
    value match
      case G_CONVERTER_ERROR => Some("G_CONVERTER_ERROR")
      case G_CONVERTER_CONVERTED => Some("G_CONVERTER_CONVERTED")
      case G_CONVERTER_FINISHED => Some("G_CONVERTER_FINISHED")
      case G_CONVERTER_FLUSHED => Some("G_CONVERTER_FLUSHED")
      case _ => None
  extension (a: GConverterResult)
    inline def &(b: GConverterResult): GConverterResult = a & b
    inline def |(b: GConverterResult): GConverterResult = a | b
    inline def is(b: GConverterResult): Boolean = (a & b) == b

opaque type GCredentialsType = CUnsignedInt
object GCredentialsType extends CEnumU[GCredentialsType]:
  given _tag: Tag[GCredentialsType] = Tag.UInt
  inline def define(inline a: Long): GCredentialsType = a.toUInt
  val G_CREDENTIALS_TYPE_INVALID = define(0)
  val G_CREDENTIALS_TYPE_LINUX_UCRED = define(1)
  val G_CREDENTIALS_TYPE_FREEBSD_CMSGCRED = define(2)
  val G_CREDENTIALS_TYPE_OPENBSD_SOCKPEERCRED = define(3)
  val G_CREDENTIALS_TYPE_SOLARIS_UCRED = define(4)
  val G_CREDENTIALS_TYPE_NETBSD_UNPCBID = define(5)
  val G_CREDENTIALS_TYPE_APPLE_XUCRED = define(6)
  val G_CREDENTIALS_TYPE_WIN32_PID = define(7)
  inline def getName(inline value: GCredentialsType): Option[String] =
    value match
      case G_CREDENTIALS_TYPE_INVALID => Some("G_CREDENTIALS_TYPE_INVALID")
      case G_CREDENTIALS_TYPE_LINUX_UCRED => Some("G_CREDENTIALS_TYPE_LINUX_UCRED")
      case G_CREDENTIALS_TYPE_FREEBSD_CMSGCRED => Some("G_CREDENTIALS_TYPE_FREEBSD_CMSGCRED")
      case G_CREDENTIALS_TYPE_OPENBSD_SOCKPEERCRED => Some("G_CREDENTIALS_TYPE_OPENBSD_SOCKPEERCRED")
      case G_CREDENTIALS_TYPE_SOLARIS_UCRED => Some("G_CREDENTIALS_TYPE_SOLARIS_UCRED")
      case G_CREDENTIALS_TYPE_NETBSD_UNPCBID => Some("G_CREDENTIALS_TYPE_NETBSD_UNPCBID")
      case G_CREDENTIALS_TYPE_APPLE_XUCRED => Some("G_CREDENTIALS_TYPE_APPLE_XUCRED")
      case G_CREDENTIALS_TYPE_WIN32_PID => Some("G_CREDENTIALS_TYPE_WIN32_PID")
      case _ => None
  extension (a: GCredentialsType)
    inline def &(b: GCredentialsType): GCredentialsType = a & b
    inline def |(b: GCredentialsType): GCredentialsType = a | b
    inline def is(b: GCredentialsType): Boolean = (a & b) == b

opaque type GDBusCallFlags = CUnsignedInt
object GDBusCallFlags extends CEnumU[GDBusCallFlags]:
  given _tag: Tag[GDBusCallFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusCallFlags = a.toUInt
  val G_DBUS_CALL_FLAGS_NONE = define(0)
  val G_DBUS_CALL_FLAGS_NO_AUTO_START = define(1)
  val G_DBUS_CALL_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION = define(2)
  inline def getName(inline value: GDBusCallFlags): Option[String] =
    value match
      case G_DBUS_CALL_FLAGS_NONE => Some("G_DBUS_CALL_FLAGS_NONE")
      case G_DBUS_CALL_FLAGS_NO_AUTO_START => Some("G_DBUS_CALL_FLAGS_NO_AUTO_START")
      case G_DBUS_CALL_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION => Some("G_DBUS_CALL_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION")
      case _ => None
  extension (a: GDBusCallFlags)
    inline def &(b: GDBusCallFlags): GDBusCallFlags = a & b
    inline def |(b: GDBusCallFlags): GDBusCallFlags = a | b
    inline def is(b: GDBusCallFlags): Boolean = (a & b) == b

opaque type GDBusCapabilityFlags = CUnsignedInt
object GDBusCapabilityFlags extends CEnumU[GDBusCapabilityFlags]:
  given _tag: Tag[GDBusCapabilityFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusCapabilityFlags = a.toUInt
  val G_DBUS_CAPABILITY_FLAGS_NONE = define(0)
  val G_DBUS_CAPABILITY_FLAGS_UNIX_FD_PASSING = define(1)
  inline def getName(inline value: GDBusCapabilityFlags): Option[String] =
    value match
      case G_DBUS_CAPABILITY_FLAGS_NONE => Some("G_DBUS_CAPABILITY_FLAGS_NONE")
      case G_DBUS_CAPABILITY_FLAGS_UNIX_FD_PASSING => Some("G_DBUS_CAPABILITY_FLAGS_UNIX_FD_PASSING")
      case _ => None
  extension (a: GDBusCapabilityFlags)
    inline def &(b: GDBusCapabilityFlags): GDBusCapabilityFlags = a & b
    inline def |(b: GDBusCapabilityFlags): GDBusCapabilityFlags = a | b
    inline def is(b: GDBusCapabilityFlags): Boolean = (a & b) == b

opaque type GDBusConnectionFlags = CUnsignedInt
object GDBusConnectionFlags extends CEnumU[GDBusConnectionFlags]:
  given _tag: Tag[GDBusConnectionFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusConnectionFlags = a.toUInt
  val G_DBUS_CONNECTION_FLAGS_NONE = define(0)
  val G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_CLIENT = define(1)
  val G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_SERVER = define(2)
  val G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS = define(4)
  val G_DBUS_CONNECTION_FLAGS_MESSAGE_BUS_CONNECTION = define(8)
  val G_DBUS_CONNECTION_FLAGS_DELAY_MESSAGE_PROCESSING = define(16)
  val G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER = define(32)
  inline def getName(inline value: GDBusConnectionFlags): Option[String] =
    value match
      case G_DBUS_CONNECTION_FLAGS_NONE => Some("G_DBUS_CONNECTION_FLAGS_NONE")
      case G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_CLIENT => Some("G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_CLIENT")
      case G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_SERVER => Some("G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_SERVER")
      case G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS => Some("G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS")
      case G_DBUS_CONNECTION_FLAGS_MESSAGE_BUS_CONNECTION => Some("G_DBUS_CONNECTION_FLAGS_MESSAGE_BUS_CONNECTION")
      case G_DBUS_CONNECTION_FLAGS_DELAY_MESSAGE_PROCESSING => Some("G_DBUS_CONNECTION_FLAGS_DELAY_MESSAGE_PROCESSING")
      case G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER => Some("G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER")
      case _ => None
  extension (a: GDBusConnectionFlags)
    inline def &(b: GDBusConnectionFlags): GDBusConnectionFlags = a & b
    inline def |(b: GDBusConnectionFlags): GDBusConnectionFlags = a | b
    inline def is(b: GDBusConnectionFlags): Boolean = (a & b) == b

opaque type GDBusError = CUnsignedInt
object GDBusError extends CEnumU[GDBusError]:
  given _tag: Tag[GDBusError] = Tag.UInt
  inline def define(inline a: Long): GDBusError = a.toUInt
  val G_DBUS_ERROR_FAILED = define(0)
  val G_DBUS_ERROR_NO_MEMORY = define(1)
  val G_DBUS_ERROR_SERVICE_UNKNOWN = define(2)
  val G_DBUS_ERROR_NAME_HAS_NO_OWNER = define(3)
  val G_DBUS_ERROR_NO_REPLY = define(4)
  val G_DBUS_ERROR_IO_ERROR = define(5)
  val G_DBUS_ERROR_BAD_ADDRESS = define(6)
  val G_DBUS_ERROR_NOT_SUPPORTED = define(7)
  val G_DBUS_ERROR_LIMITS_EXCEEDED = define(8)
  val G_DBUS_ERROR_ACCESS_DENIED = define(9)
  val G_DBUS_ERROR_AUTH_FAILED = define(10)
  val G_DBUS_ERROR_NO_SERVER = define(11)
  val G_DBUS_ERROR_TIMEOUT = define(12)
  val G_DBUS_ERROR_NO_NETWORK = define(13)
  val G_DBUS_ERROR_ADDRESS_IN_USE = define(14)
  val G_DBUS_ERROR_DISCONNECTED = define(15)
  val G_DBUS_ERROR_INVALID_ARGS = define(16)
  val G_DBUS_ERROR_FILE_NOT_FOUND = define(17)
  val G_DBUS_ERROR_FILE_EXISTS = define(18)
  val G_DBUS_ERROR_UNKNOWN_METHOD = define(19)
  val G_DBUS_ERROR_TIMED_OUT = define(20)
  val G_DBUS_ERROR_MATCH_RULE_NOT_FOUND = define(21)
  val G_DBUS_ERROR_MATCH_RULE_INVALID = define(22)
  val G_DBUS_ERROR_SPAWN_EXEC_FAILED = define(23)
  val G_DBUS_ERROR_SPAWN_FORK_FAILED = define(24)
  val G_DBUS_ERROR_SPAWN_CHILD_EXITED = define(25)
  val G_DBUS_ERROR_SPAWN_CHILD_SIGNALED = define(26)
  val G_DBUS_ERROR_SPAWN_FAILED = define(27)
  val G_DBUS_ERROR_SPAWN_SETUP_FAILED = define(28)
  val G_DBUS_ERROR_SPAWN_CONFIG_INVALID = define(29)
  val G_DBUS_ERROR_SPAWN_SERVICE_INVALID = define(30)
  val G_DBUS_ERROR_SPAWN_SERVICE_NOT_FOUND = define(31)
  val G_DBUS_ERROR_SPAWN_PERMISSIONS_INVALID = define(32)
  val G_DBUS_ERROR_SPAWN_FILE_INVALID = define(33)
  val G_DBUS_ERROR_SPAWN_NO_MEMORY = define(34)
  val G_DBUS_ERROR_UNIX_PROCESS_ID_UNKNOWN = define(35)
  val G_DBUS_ERROR_INVALID_SIGNATURE = define(36)
  val G_DBUS_ERROR_INVALID_FILE_CONTENT = define(37)
  val G_DBUS_ERROR_SELINUX_SECURITY_CONTEXT_UNKNOWN = define(38)
  val G_DBUS_ERROR_ADT_AUDIT_DATA_UNKNOWN = define(39)
  val G_DBUS_ERROR_OBJECT_PATH_IN_USE = define(40)
  val G_DBUS_ERROR_UNKNOWN_OBJECT = define(41)
  val G_DBUS_ERROR_UNKNOWN_INTERFACE = define(42)
  val G_DBUS_ERROR_UNKNOWN_PROPERTY = define(43)
  val G_DBUS_ERROR_PROPERTY_READ_ONLY = define(44)
  inline def getName(inline value: GDBusError): Option[String] =
    value match
      case G_DBUS_ERROR_FAILED => Some("G_DBUS_ERROR_FAILED")
      case G_DBUS_ERROR_NO_MEMORY => Some("G_DBUS_ERROR_NO_MEMORY")
      case G_DBUS_ERROR_SERVICE_UNKNOWN => Some("G_DBUS_ERROR_SERVICE_UNKNOWN")
      case G_DBUS_ERROR_NAME_HAS_NO_OWNER => Some("G_DBUS_ERROR_NAME_HAS_NO_OWNER")
      case G_DBUS_ERROR_NO_REPLY => Some("G_DBUS_ERROR_NO_REPLY")
      case G_DBUS_ERROR_IO_ERROR => Some("G_DBUS_ERROR_IO_ERROR")
      case G_DBUS_ERROR_BAD_ADDRESS => Some("G_DBUS_ERROR_BAD_ADDRESS")
      case G_DBUS_ERROR_NOT_SUPPORTED => Some("G_DBUS_ERROR_NOT_SUPPORTED")
      case G_DBUS_ERROR_LIMITS_EXCEEDED => Some("G_DBUS_ERROR_LIMITS_EXCEEDED")
      case G_DBUS_ERROR_ACCESS_DENIED => Some("G_DBUS_ERROR_ACCESS_DENIED")
      case G_DBUS_ERROR_AUTH_FAILED => Some("G_DBUS_ERROR_AUTH_FAILED")
      case G_DBUS_ERROR_NO_SERVER => Some("G_DBUS_ERROR_NO_SERVER")
      case G_DBUS_ERROR_TIMEOUT => Some("G_DBUS_ERROR_TIMEOUT")
      case G_DBUS_ERROR_NO_NETWORK => Some("G_DBUS_ERROR_NO_NETWORK")
      case G_DBUS_ERROR_ADDRESS_IN_USE => Some("G_DBUS_ERROR_ADDRESS_IN_USE")
      case G_DBUS_ERROR_DISCONNECTED => Some("G_DBUS_ERROR_DISCONNECTED")
      case G_DBUS_ERROR_INVALID_ARGS => Some("G_DBUS_ERROR_INVALID_ARGS")
      case G_DBUS_ERROR_FILE_NOT_FOUND => Some("G_DBUS_ERROR_FILE_NOT_FOUND")
      case G_DBUS_ERROR_FILE_EXISTS => Some("G_DBUS_ERROR_FILE_EXISTS")
      case G_DBUS_ERROR_UNKNOWN_METHOD => Some("G_DBUS_ERROR_UNKNOWN_METHOD")
      case G_DBUS_ERROR_TIMED_OUT => Some("G_DBUS_ERROR_TIMED_OUT")
      case G_DBUS_ERROR_MATCH_RULE_NOT_FOUND => Some("G_DBUS_ERROR_MATCH_RULE_NOT_FOUND")
      case G_DBUS_ERROR_MATCH_RULE_INVALID => Some("G_DBUS_ERROR_MATCH_RULE_INVALID")
      case G_DBUS_ERROR_SPAWN_EXEC_FAILED => Some("G_DBUS_ERROR_SPAWN_EXEC_FAILED")
      case G_DBUS_ERROR_SPAWN_FORK_FAILED => Some("G_DBUS_ERROR_SPAWN_FORK_FAILED")
      case G_DBUS_ERROR_SPAWN_CHILD_EXITED => Some("G_DBUS_ERROR_SPAWN_CHILD_EXITED")
      case G_DBUS_ERROR_SPAWN_CHILD_SIGNALED => Some("G_DBUS_ERROR_SPAWN_CHILD_SIGNALED")
      case G_DBUS_ERROR_SPAWN_FAILED => Some("G_DBUS_ERROR_SPAWN_FAILED")
      case G_DBUS_ERROR_SPAWN_SETUP_FAILED => Some("G_DBUS_ERROR_SPAWN_SETUP_FAILED")
      case G_DBUS_ERROR_SPAWN_CONFIG_INVALID => Some("G_DBUS_ERROR_SPAWN_CONFIG_INVALID")
      case G_DBUS_ERROR_SPAWN_SERVICE_INVALID => Some("G_DBUS_ERROR_SPAWN_SERVICE_INVALID")
      case G_DBUS_ERROR_SPAWN_SERVICE_NOT_FOUND => Some("G_DBUS_ERROR_SPAWN_SERVICE_NOT_FOUND")
      case G_DBUS_ERROR_SPAWN_PERMISSIONS_INVALID => Some("G_DBUS_ERROR_SPAWN_PERMISSIONS_INVALID")
      case G_DBUS_ERROR_SPAWN_FILE_INVALID => Some("G_DBUS_ERROR_SPAWN_FILE_INVALID")
      case G_DBUS_ERROR_SPAWN_NO_MEMORY => Some("G_DBUS_ERROR_SPAWN_NO_MEMORY")
      case G_DBUS_ERROR_UNIX_PROCESS_ID_UNKNOWN => Some("G_DBUS_ERROR_UNIX_PROCESS_ID_UNKNOWN")
      case G_DBUS_ERROR_INVALID_SIGNATURE => Some("G_DBUS_ERROR_INVALID_SIGNATURE")
      case G_DBUS_ERROR_INVALID_FILE_CONTENT => Some("G_DBUS_ERROR_INVALID_FILE_CONTENT")
      case G_DBUS_ERROR_SELINUX_SECURITY_CONTEXT_UNKNOWN => Some("G_DBUS_ERROR_SELINUX_SECURITY_CONTEXT_UNKNOWN")
      case G_DBUS_ERROR_ADT_AUDIT_DATA_UNKNOWN => Some("G_DBUS_ERROR_ADT_AUDIT_DATA_UNKNOWN")
      case G_DBUS_ERROR_OBJECT_PATH_IN_USE => Some("G_DBUS_ERROR_OBJECT_PATH_IN_USE")
      case G_DBUS_ERROR_UNKNOWN_OBJECT => Some("G_DBUS_ERROR_UNKNOWN_OBJECT")
      case G_DBUS_ERROR_UNKNOWN_INTERFACE => Some("G_DBUS_ERROR_UNKNOWN_INTERFACE")
      case G_DBUS_ERROR_UNKNOWN_PROPERTY => Some("G_DBUS_ERROR_UNKNOWN_PROPERTY")
      case G_DBUS_ERROR_PROPERTY_READ_ONLY => Some("G_DBUS_ERROR_PROPERTY_READ_ONLY")
      case _ => None
  extension (a: GDBusError)
    inline def &(b: GDBusError): GDBusError = a & b
    inline def |(b: GDBusError): GDBusError = a | b
    inline def is(b: GDBusError): Boolean = (a & b) == b

opaque type GDBusInterfaceSkeletonFlags = CUnsignedInt
object GDBusInterfaceSkeletonFlags extends CEnumU[GDBusInterfaceSkeletonFlags]:
  given _tag: Tag[GDBusInterfaceSkeletonFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusInterfaceSkeletonFlags = a.toUInt
  val G_DBUS_INTERFACE_SKELETON_FLAGS_NONE = define(0)
  val G_DBUS_INTERFACE_SKELETON_FLAGS_HANDLE_METHOD_INVOCATIONS_IN_THREAD = define(1)
  inline def getName(inline value: GDBusInterfaceSkeletonFlags): Option[String] =
    value match
      case G_DBUS_INTERFACE_SKELETON_FLAGS_NONE => Some("G_DBUS_INTERFACE_SKELETON_FLAGS_NONE")
      case G_DBUS_INTERFACE_SKELETON_FLAGS_HANDLE_METHOD_INVOCATIONS_IN_THREAD => Some("G_DBUS_INTERFACE_SKELETON_FLAGS_HANDLE_METHOD_INVOCATIONS_IN_THREAD")
      case _ => None
  extension (a: GDBusInterfaceSkeletonFlags)
    inline def &(b: GDBusInterfaceSkeletonFlags): GDBusInterfaceSkeletonFlags = a & b
    inline def |(b: GDBusInterfaceSkeletonFlags): GDBusInterfaceSkeletonFlags = a | b
    inline def is(b: GDBusInterfaceSkeletonFlags): Boolean = (a & b) == b

opaque type GDBusMessageByteOrder = CUnsignedInt
object GDBusMessageByteOrder extends CEnumU[GDBusMessageByteOrder]:
  given _tag: Tag[GDBusMessageByteOrder] = Tag.UInt
  inline def define(inline a: Long): GDBusMessageByteOrder = a.toUInt
  val G_DBUS_MESSAGE_BYTE_ORDER_BIG_ENDIAN = define(66)
  val G_DBUS_MESSAGE_BYTE_ORDER_LITTLE_ENDIAN = define(108)
  inline def getName(inline value: GDBusMessageByteOrder): Option[String] =
    value match
      case G_DBUS_MESSAGE_BYTE_ORDER_BIG_ENDIAN => Some("G_DBUS_MESSAGE_BYTE_ORDER_BIG_ENDIAN")
      case G_DBUS_MESSAGE_BYTE_ORDER_LITTLE_ENDIAN => Some("G_DBUS_MESSAGE_BYTE_ORDER_LITTLE_ENDIAN")
      case _ => None
  extension (a: GDBusMessageByteOrder)
    inline def &(b: GDBusMessageByteOrder): GDBusMessageByteOrder = a & b
    inline def |(b: GDBusMessageByteOrder): GDBusMessageByteOrder = a | b
    inline def is(b: GDBusMessageByteOrder): Boolean = (a & b) == b

opaque type GDBusMessageFlags = CUnsignedInt
object GDBusMessageFlags extends CEnumU[GDBusMessageFlags]:
  given _tag: Tag[GDBusMessageFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusMessageFlags = a.toUInt
  val G_DBUS_MESSAGE_FLAGS_NONE = define(0)
  val G_DBUS_MESSAGE_FLAGS_NO_REPLY_EXPECTED = define(1)
  val G_DBUS_MESSAGE_FLAGS_NO_AUTO_START = define(2)
  val G_DBUS_MESSAGE_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION = define(4)
  inline def getName(inline value: GDBusMessageFlags): Option[String] =
    value match
      case G_DBUS_MESSAGE_FLAGS_NONE => Some("G_DBUS_MESSAGE_FLAGS_NONE")
      case G_DBUS_MESSAGE_FLAGS_NO_REPLY_EXPECTED => Some("G_DBUS_MESSAGE_FLAGS_NO_REPLY_EXPECTED")
      case G_DBUS_MESSAGE_FLAGS_NO_AUTO_START => Some("G_DBUS_MESSAGE_FLAGS_NO_AUTO_START")
      case G_DBUS_MESSAGE_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION => Some("G_DBUS_MESSAGE_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION")
      case _ => None
  extension (a: GDBusMessageFlags)
    inline def &(b: GDBusMessageFlags): GDBusMessageFlags = a & b
    inline def |(b: GDBusMessageFlags): GDBusMessageFlags = a | b
    inline def is(b: GDBusMessageFlags): Boolean = (a & b) == b

opaque type GDBusMessageHeaderField = CUnsignedInt
object GDBusMessageHeaderField extends CEnumU[GDBusMessageHeaderField]:
  given _tag: Tag[GDBusMessageHeaderField] = Tag.UInt
  inline def define(inline a: Long): GDBusMessageHeaderField = a.toUInt
  val G_DBUS_MESSAGE_HEADER_FIELD_INVALID = define(0)
  val G_DBUS_MESSAGE_HEADER_FIELD_PATH = define(1)
  val G_DBUS_MESSAGE_HEADER_FIELD_INTERFACE = define(2)
  val G_DBUS_MESSAGE_HEADER_FIELD_MEMBER = define(3)
  val G_DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME = define(4)
  val G_DBUS_MESSAGE_HEADER_FIELD_REPLY_SERIAL = define(5)
  val G_DBUS_MESSAGE_HEADER_FIELD_DESTINATION = define(6)
  val G_DBUS_MESSAGE_HEADER_FIELD_SENDER = define(7)
  val G_DBUS_MESSAGE_HEADER_FIELD_SIGNATURE = define(8)
  val G_DBUS_MESSAGE_HEADER_FIELD_NUM_UNIX_FDS = define(9)
  inline def getName(inline value: GDBusMessageHeaderField): Option[String] =
    value match
      case G_DBUS_MESSAGE_HEADER_FIELD_INVALID => Some("G_DBUS_MESSAGE_HEADER_FIELD_INVALID")
      case G_DBUS_MESSAGE_HEADER_FIELD_PATH => Some("G_DBUS_MESSAGE_HEADER_FIELD_PATH")
      case G_DBUS_MESSAGE_HEADER_FIELD_INTERFACE => Some("G_DBUS_MESSAGE_HEADER_FIELD_INTERFACE")
      case G_DBUS_MESSAGE_HEADER_FIELD_MEMBER => Some("G_DBUS_MESSAGE_HEADER_FIELD_MEMBER")
      case G_DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME => Some("G_DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME")
      case G_DBUS_MESSAGE_HEADER_FIELD_REPLY_SERIAL => Some("G_DBUS_MESSAGE_HEADER_FIELD_REPLY_SERIAL")
      case G_DBUS_MESSAGE_HEADER_FIELD_DESTINATION => Some("G_DBUS_MESSAGE_HEADER_FIELD_DESTINATION")
      case G_DBUS_MESSAGE_HEADER_FIELD_SENDER => Some("G_DBUS_MESSAGE_HEADER_FIELD_SENDER")
      case G_DBUS_MESSAGE_HEADER_FIELD_SIGNATURE => Some("G_DBUS_MESSAGE_HEADER_FIELD_SIGNATURE")
      case G_DBUS_MESSAGE_HEADER_FIELD_NUM_UNIX_FDS => Some("G_DBUS_MESSAGE_HEADER_FIELD_NUM_UNIX_FDS")
      case _ => None
  extension (a: GDBusMessageHeaderField)
    inline def &(b: GDBusMessageHeaderField): GDBusMessageHeaderField = a & b
    inline def |(b: GDBusMessageHeaderField): GDBusMessageHeaderField = a | b
    inline def is(b: GDBusMessageHeaderField): Boolean = (a & b) == b

opaque type GDBusMessageType = CUnsignedInt
object GDBusMessageType extends CEnumU[GDBusMessageType]:
  given _tag: Tag[GDBusMessageType] = Tag.UInt
  inline def define(inline a: Long): GDBusMessageType = a.toUInt
  val G_DBUS_MESSAGE_TYPE_INVALID = define(0)
  val G_DBUS_MESSAGE_TYPE_METHOD_CALL = define(1)
  val G_DBUS_MESSAGE_TYPE_METHOD_RETURN = define(2)
  val G_DBUS_MESSAGE_TYPE_ERROR = define(3)
  val G_DBUS_MESSAGE_TYPE_SIGNAL = define(4)
  inline def getName(inline value: GDBusMessageType): Option[String] =
    value match
      case G_DBUS_MESSAGE_TYPE_INVALID => Some("G_DBUS_MESSAGE_TYPE_INVALID")
      case G_DBUS_MESSAGE_TYPE_METHOD_CALL => Some("G_DBUS_MESSAGE_TYPE_METHOD_CALL")
      case G_DBUS_MESSAGE_TYPE_METHOD_RETURN => Some("G_DBUS_MESSAGE_TYPE_METHOD_RETURN")
      case G_DBUS_MESSAGE_TYPE_ERROR => Some("G_DBUS_MESSAGE_TYPE_ERROR")
      case G_DBUS_MESSAGE_TYPE_SIGNAL => Some("G_DBUS_MESSAGE_TYPE_SIGNAL")
      case _ => None
  extension (a: GDBusMessageType)
    inline def &(b: GDBusMessageType): GDBusMessageType = a & b
    inline def |(b: GDBusMessageType): GDBusMessageType = a | b
    inline def is(b: GDBusMessageType): Boolean = (a & b) == b

opaque type GDBusObjectManagerClientFlags = CUnsignedInt
object GDBusObjectManagerClientFlags extends CEnumU[GDBusObjectManagerClientFlags]:
  given _tag: Tag[GDBusObjectManagerClientFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusObjectManagerClientFlags = a.toUInt
  val G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_NONE = define(0)
  val G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_DO_NOT_AUTO_START = define(1)
  inline def getName(inline value: GDBusObjectManagerClientFlags): Option[String] =
    value match
      case G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_NONE => Some("G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_NONE")
      case G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_DO_NOT_AUTO_START => Some("G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_DO_NOT_AUTO_START")
      case _ => None
  extension (a: GDBusObjectManagerClientFlags)
    inline def &(b: GDBusObjectManagerClientFlags): GDBusObjectManagerClientFlags = a & b
    inline def |(b: GDBusObjectManagerClientFlags): GDBusObjectManagerClientFlags = a | b
    inline def is(b: GDBusObjectManagerClientFlags): Boolean = (a & b) == b

opaque type GDBusPropertyInfoFlags = CUnsignedInt
object GDBusPropertyInfoFlags extends CEnumU[GDBusPropertyInfoFlags]:
  given _tag: Tag[GDBusPropertyInfoFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusPropertyInfoFlags = a.toUInt
  val G_DBUS_PROPERTY_INFO_FLAGS_NONE = define(0)
  val G_DBUS_PROPERTY_INFO_FLAGS_READABLE = define(1)
  val G_DBUS_PROPERTY_INFO_FLAGS_WRITABLE = define(2)
  inline def getName(inline value: GDBusPropertyInfoFlags): Option[String] =
    value match
      case G_DBUS_PROPERTY_INFO_FLAGS_NONE => Some("G_DBUS_PROPERTY_INFO_FLAGS_NONE")
      case G_DBUS_PROPERTY_INFO_FLAGS_READABLE => Some("G_DBUS_PROPERTY_INFO_FLAGS_READABLE")
      case G_DBUS_PROPERTY_INFO_FLAGS_WRITABLE => Some("G_DBUS_PROPERTY_INFO_FLAGS_WRITABLE")
      case _ => None
  extension (a: GDBusPropertyInfoFlags)
    inline def &(b: GDBusPropertyInfoFlags): GDBusPropertyInfoFlags = a & b
    inline def |(b: GDBusPropertyInfoFlags): GDBusPropertyInfoFlags = a | b
    inline def is(b: GDBusPropertyInfoFlags): Boolean = (a & b) == b

opaque type GDBusProxyFlags = CUnsignedInt
object GDBusProxyFlags extends CEnumU[GDBusProxyFlags]:
  given _tag: Tag[GDBusProxyFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusProxyFlags = a.toUInt
  val G_DBUS_PROXY_FLAGS_NONE = define(0)
  val G_DBUS_PROXY_FLAGS_DO_NOT_LOAD_PROPERTIES = define(1)
  val G_DBUS_PROXY_FLAGS_DO_NOT_CONNECT_SIGNALS = define(2)
  val G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START = define(4)
  val G_DBUS_PROXY_FLAGS_GET_INVALIDATED_PROPERTIES = define(8)
  val G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START_AT_CONSTRUCTION = define(16)
  val G_DBUS_PROXY_FLAGS_NO_MATCH_RULE = define(32)
  inline def getName(inline value: GDBusProxyFlags): Option[String] =
    value match
      case G_DBUS_PROXY_FLAGS_NONE => Some("G_DBUS_PROXY_FLAGS_NONE")
      case G_DBUS_PROXY_FLAGS_DO_NOT_LOAD_PROPERTIES => Some("G_DBUS_PROXY_FLAGS_DO_NOT_LOAD_PROPERTIES")
      case G_DBUS_PROXY_FLAGS_DO_NOT_CONNECT_SIGNALS => Some("G_DBUS_PROXY_FLAGS_DO_NOT_CONNECT_SIGNALS")
      case G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START => Some("G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START")
      case G_DBUS_PROXY_FLAGS_GET_INVALIDATED_PROPERTIES => Some("G_DBUS_PROXY_FLAGS_GET_INVALIDATED_PROPERTIES")
      case G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START_AT_CONSTRUCTION => Some("G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START_AT_CONSTRUCTION")
      case G_DBUS_PROXY_FLAGS_NO_MATCH_RULE => Some("G_DBUS_PROXY_FLAGS_NO_MATCH_RULE")
      case _ => None
  extension (a: GDBusProxyFlags)
    inline def &(b: GDBusProxyFlags): GDBusProxyFlags = a & b
    inline def |(b: GDBusProxyFlags): GDBusProxyFlags = a | b
    inline def is(b: GDBusProxyFlags): Boolean = (a & b) == b

opaque type GDBusSendMessageFlags = CUnsignedInt
object GDBusSendMessageFlags extends CEnumU[GDBusSendMessageFlags]:
  given _tag: Tag[GDBusSendMessageFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusSendMessageFlags = a.toUInt
  val G_DBUS_SEND_MESSAGE_FLAGS_NONE = define(0)
  val G_DBUS_SEND_MESSAGE_FLAGS_PRESERVE_SERIAL = define(1)
  inline def getName(inline value: GDBusSendMessageFlags): Option[String] =
    value match
      case G_DBUS_SEND_MESSAGE_FLAGS_NONE => Some("G_DBUS_SEND_MESSAGE_FLAGS_NONE")
      case G_DBUS_SEND_MESSAGE_FLAGS_PRESERVE_SERIAL => Some("G_DBUS_SEND_MESSAGE_FLAGS_PRESERVE_SERIAL")
      case _ => None
  extension (a: GDBusSendMessageFlags)
    inline def &(b: GDBusSendMessageFlags): GDBusSendMessageFlags = a & b
    inline def |(b: GDBusSendMessageFlags): GDBusSendMessageFlags = a | b
    inline def is(b: GDBusSendMessageFlags): Boolean = (a & b) == b

opaque type GDBusServerFlags = CUnsignedInt
object GDBusServerFlags extends CEnumU[GDBusServerFlags]:
  given _tag: Tag[GDBusServerFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusServerFlags = a.toUInt
  val G_DBUS_SERVER_FLAGS_NONE = define(0)
  val G_DBUS_SERVER_FLAGS_RUN_IN_THREAD = define(1)
  val G_DBUS_SERVER_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS = define(2)
  val G_DBUS_SERVER_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER = define(4)
  inline def getName(inline value: GDBusServerFlags): Option[String] =
    value match
      case G_DBUS_SERVER_FLAGS_NONE => Some("G_DBUS_SERVER_FLAGS_NONE")
      case G_DBUS_SERVER_FLAGS_RUN_IN_THREAD => Some("G_DBUS_SERVER_FLAGS_RUN_IN_THREAD")
      case G_DBUS_SERVER_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS => Some("G_DBUS_SERVER_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS")
      case G_DBUS_SERVER_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER => Some("G_DBUS_SERVER_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER")
      case _ => None
  extension (a: GDBusServerFlags)
    inline def &(b: GDBusServerFlags): GDBusServerFlags = a & b
    inline def |(b: GDBusServerFlags): GDBusServerFlags = a | b
    inline def is(b: GDBusServerFlags): Boolean = (a & b) == b

opaque type GDBusSignalFlags = CUnsignedInt
object GDBusSignalFlags extends CEnumU[GDBusSignalFlags]:
  given _tag: Tag[GDBusSignalFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusSignalFlags = a.toUInt
  val G_DBUS_SIGNAL_FLAGS_NONE = define(0)
  val G_DBUS_SIGNAL_FLAGS_NO_MATCH_RULE = define(1)
  val G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_NAMESPACE = define(2)
  val G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_PATH = define(4)
  inline def getName(inline value: GDBusSignalFlags): Option[String] =
    value match
      case G_DBUS_SIGNAL_FLAGS_NONE => Some("G_DBUS_SIGNAL_FLAGS_NONE")
      case G_DBUS_SIGNAL_FLAGS_NO_MATCH_RULE => Some("G_DBUS_SIGNAL_FLAGS_NO_MATCH_RULE")
      case G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_NAMESPACE => Some("G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_NAMESPACE")
      case G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_PATH => Some("G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_PATH")
      case _ => None
  extension (a: GDBusSignalFlags)
    inline def &(b: GDBusSignalFlags): GDBusSignalFlags = a & b
    inline def |(b: GDBusSignalFlags): GDBusSignalFlags = a | b
    inline def is(b: GDBusSignalFlags): Boolean = (a & b) == b

opaque type GDBusSubtreeFlags = CUnsignedInt
object GDBusSubtreeFlags extends CEnumU[GDBusSubtreeFlags]:
  given _tag: Tag[GDBusSubtreeFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusSubtreeFlags = a.toUInt
  val G_DBUS_SUBTREE_FLAGS_NONE = define(0)
  val G_DBUS_SUBTREE_FLAGS_DISPATCH_TO_UNENUMERATED_NODES = define(1)
  inline def getName(inline value: GDBusSubtreeFlags): Option[String] =
    value match
      case G_DBUS_SUBTREE_FLAGS_NONE => Some("G_DBUS_SUBTREE_FLAGS_NONE")
      case G_DBUS_SUBTREE_FLAGS_DISPATCH_TO_UNENUMERATED_NODES => Some("G_DBUS_SUBTREE_FLAGS_DISPATCH_TO_UNENUMERATED_NODES")
      case _ => None
  extension (a: GDBusSubtreeFlags)
    inline def &(b: GDBusSubtreeFlags): GDBusSubtreeFlags = a & b
    inline def |(b: GDBusSubtreeFlags): GDBusSubtreeFlags = a | b
    inline def is(b: GDBusSubtreeFlags): Boolean = (a & b) == b

opaque type GDataStreamByteOrder = CUnsignedInt
object GDataStreamByteOrder extends CEnumU[GDataStreamByteOrder]:
  given _tag: Tag[GDataStreamByteOrder] = Tag.UInt
  inline def define(inline a: Long): GDataStreamByteOrder = a.toUInt
  val G_DATA_STREAM_BYTE_ORDER_BIG_ENDIAN = define(0)
  val G_DATA_STREAM_BYTE_ORDER_LITTLE_ENDIAN = define(1)
  val G_DATA_STREAM_BYTE_ORDER_HOST_ENDIAN = define(2)
  inline def getName(inline value: GDataStreamByteOrder): Option[String] =
    value match
      case G_DATA_STREAM_BYTE_ORDER_BIG_ENDIAN => Some("G_DATA_STREAM_BYTE_ORDER_BIG_ENDIAN")
      case G_DATA_STREAM_BYTE_ORDER_LITTLE_ENDIAN => Some("G_DATA_STREAM_BYTE_ORDER_LITTLE_ENDIAN")
      case G_DATA_STREAM_BYTE_ORDER_HOST_ENDIAN => Some("G_DATA_STREAM_BYTE_ORDER_HOST_ENDIAN")
      case _ => None
  extension (a: GDataStreamByteOrder)
    inline def &(b: GDataStreamByteOrder): GDataStreamByteOrder = a & b
    inline def |(b: GDataStreamByteOrder): GDataStreamByteOrder = a | b
    inline def is(b: GDataStreamByteOrder): Boolean = (a & b) == b

opaque type GDataStreamNewlineType = CUnsignedInt
object GDataStreamNewlineType extends CEnumU[GDataStreamNewlineType]:
  given _tag: Tag[GDataStreamNewlineType] = Tag.UInt
  inline def define(inline a: Long): GDataStreamNewlineType = a.toUInt
  val G_DATA_STREAM_NEWLINE_TYPE_LF = define(0)
  val G_DATA_STREAM_NEWLINE_TYPE_CR = define(1)
  val G_DATA_STREAM_NEWLINE_TYPE_CR_LF = define(2)
  val G_DATA_STREAM_NEWLINE_TYPE_ANY = define(3)
  inline def getName(inline value: GDataStreamNewlineType): Option[String] =
    value match
      case G_DATA_STREAM_NEWLINE_TYPE_LF => Some("G_DATA_STREAM_NEWLINE_TYPE_LF")
      case G_DATA_STREAM_NEWLINE_TYPE_CR => Some("G_DATA_STREAM_NEWLINE_TYPE_CR")
      case G_DATA_STREAM_NEWLINE_TYPE_CR_LF => Some("G_DATA_STREAM_NEWLINE_TYPE_CR_LF")
      case G_DATA_STREAM_NEWLINE_TYPE_ANY => Some("G_DATA_STREAM_NEWLINE_TYPE_ANY")
      case _ => None
  extension (a: GDataStreamNewlineType)
    inline def &(b: GDataStreamNewlineType): GDataStreamNewlineType = a & b
    inline def |(b: GDataStreamNewlineType): GDataStreamNewlineType = a | b
    inline def is(b: GDataStreamNewlineType): Boolean = (a & b) == b

opaque type GDateDMY = CUnsignedInt
object GDateDMY extends CEnumU[GDateDMY]:
  given _tag: Tag[GDateDMY] = Tag.UInt
  inline def define(inline a: Long): GDateDMY = a.toUInt
  val G_DATE_DAY = define(0)
  val G_DATE_MONTH = define(1)
  val G_DATE_YEAR = define(2)
  inline def getName(inline value: GDateDMY): Option[String] =
    value match
      case G_DATE_DAY => Some("G_DATE_DAY")
      case G_DATE_MONTH => Some("G_DATE_MONTH")
      case G_DATE_YEAR => Some("G_DATE_YEAR")
      case _ => None
  extension (a: GDateDMY)
    inline def &(b: GDateDMY): GDateDMY = a & b
    inline def |(b: GDateDMY): GDateDMY = a | b
    inline def is(b: GDateDMY): Boolean = (a & b) == b

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
    value match
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
    value match
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

opaque type GDriveStartFlags = CUnsignedInt
object GDriveStartFlags extends CEnumU[GDriveStartFlags]:
  given _tag: Tag[GDriveStartFlags] = Tag.UInt
  inline def define(inline a: Long): GDriveStartFlags = a.toUInt
  val G_DRIVE_START_NONE = define(0)
  inline def getName(inline value: GDriveStartFlags): Option[String] =
    value match
      case G_DRIVE_START_NONE => Some("G_DRIVE_START_NONE")
      case _ => None
  extension (a: GDriveStartFlags)
    inline def &(b: GDriveStartFlags): GDriveStartFlags = a & b
    inline def |(b: GDriveStartFlags): GDriveStartFlags = a | b
    inline def is(b: GDriveStartFlags): Boolean = (a & b) == b

opaque type GDriveStartStopType = CUnsignedInt
object GDriveStartStopType extends CEnumU[GDriveStartStopType]:
  given _tag: Tag[GDriveStartStopType] = Tag.UInt
  inline def define(inline a: Long): GDriveStartStopType = a.toUInt
  val G_DRIVE_START_STOP_TYPE_UNKNOWN = define(0)
  val G_DRIVE_START_STOP_TYPE_SHUTDOWN = define(1)
  val G_DRIVE_START_STOP_TYPE_NETWORK = define(2)
  val G_DRIVE_START_STOP_TYPE_MULTIDISK = define(3)
  val G_DRIVE_START_STOP_TYPE_PASSWORD = define(4)
  inline def getName(inline value: GDriveStartStopType): Option[String] =
    value match
      case G_DRIVE_START_STOP_TYPE_UNKNOWN => Some("G_DRIVE_START_STOP_TYPE_UNKNOWN")
      case G_DRIVE_START_STOP_TYPE_SHUTDOWN => Some("G_DRIVE_START_STOP_TYPE_SHUTDOWN")
      case G_DRIVE_START_STOP_TYPE_NETWORK => Some("G_DRIVE_START_STOP_TYPE_NETWORK")
      case G_DRIVE_START_STOP_TYPE_MULTIDISK => Some("G_DRIVE_START_STOP_TYPE_MULTIDISK")
      case G_DRIVE_START_STOP_TYPE_PASSWORD => Some("G_DRIVE_START_STOP_TYPE_PASSWORD")
      case _ => None
  extension (a: GDriveStartStopType)
    inline def &(b: GDriveStartStopType): GDriveStartStopType = a & b
    inline def |(b: GDriveStartStopType): GDriveStartStopType = a | b
    inline def is(b: GDriveStartStopType): Boolean = (a & b) == b

opaque type GEmblemOrigin = CUnsignedInt
object GEmblemOrigin extends CEnumU[GEmblemOrigin]:
  given _tag: Tag[GEmblemOrigin] = Tag.UInt
  inline def define(inline a: Long): GEmblemOrigin = a.toUInt
  val G_EMBLEM_ORIGIN_UNKNOWN = define(0)
  val G_EMBLEM_ORIGIN_DEVICE = define(1)
  val G_EMBLEM_ORIGIN_LIVEMETADATA = define(2)
  val G_EMBLEM_ORIGIN_TAG = define(3)
  inline def getName(inline value: GEmblemOrigin): Option[String] =
    value match
      case G_EMBLEM_ORIGIN_UNKNOWN => Some("G_EMBLEM_ORIGIN_UNKNOWN")
      case G_EMBLEM_ORIGIN_DEVICE => Some("G_EMBLEM_ORIGIN_DEVICE")
      case G_EMBLEM_ORIGIN_LIVEMETADATA => Some("G_EMBLEM_ORIGIN_LIVEMETADATA")
      case G_EMBLEM_ORIGIN_TAG => Some("G_EMBLEM_ORIGIN_TAG")
      case _ => None
  extension (a: GEmblemOrigin)
    inline def &(b: GEmblemOrigin): GEmblemOrigin = a & b
    inline def |(b: GEmblemOrigin): GEmblemOrigin = a | b
    inline def is(b: GEmblemOrigin): Boolean = (a & b) == b

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
    value match
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

opaque type GFileAttributeInfoFlags = CUnsignedInt
object GFileAttributeInfoFlags extends CEnumU[GFileAttributeInfoFlags]:
  given _tag: Tag[GFileAttributeInfoFlags] = Tag.UInt
  inline def define(inline a: Long): GFileAttributeInfoFlags = a.toUInt
  val G_FILE_ATTRIBUTE_INFO_NONE = define(0)
  val G_FILE_ATTRIBUTE_INFO_COPY_WITH_FILE = define(1)
  val G_FILE_ATTRIBUTE_INFO_COPY_WHEN_MOVED = define(2)
  inline def getName(inline value: GFileAttributeInfoFlags): Option[String] =
    value match
      case G_FILE_ATTRIBUTE_INFO_NONE => Some("G_FILE_ATTRIBUTE_INFO_NONE")
      case G_FILE_ATTRIBUTE_INFO_COPY_WITH_FILE => Some("G_FILE_ATTRIBUTE_INFO_COPY_WITH_FILE")
      case G_FILE_ATTRIBUTE_INFO_COPY_WHEN_MOVED => Some("G_FILE_ATTRIBUTE_INFO_COPY_WHEN_MOVED")
      case _ => None
  extension (a: GFileAttributeInfoFlags)
    inline def &(b: GFileAttributeInfoFlags): GFileAttributeInfoFlags = a & b
    inline def |(b: GFileAttributeInfoFlags): GFileAttributeInfoFlags = a | b
    inline def is(b: GFileAttributeInfoFlags): Boolean = (a & b) == b

opaque type GFileAttributeStatus = CUnsignedInt
object GFileAttributeStatus extends CEnumU[GFileAttributeStatus]:
  given _tag: Tag[GFileAttributeStatus] = Tag.UInt
  inline def define(inline a: Long): GFileAttributeStatus = a.toUInt
  val G_FILE_ATTRIBUTE_STATUS_UNSET = define(0)
  val G_FILE_ATTRIBUTE_STATUS_SET = define(1)
  val G_FILE_ATTRIBUTE_STATUS_ERROR_SETTING = define(2)
  inline def getName(inline value: GFileAttributeStatus): Option[String] =
    value match
      case G_FILE_ATTRIBUTE_STATUS_UNSET => Some("G_FILE_ATTRIBUTE_STATUS_UNSET")
      case G_FILE_ATTRIBUTE_STATUS_SET => Some("G_FILE_ATTRIBUTE_STATUS_SET")
      case G_FILE_ATTRIBUTE_STATUS_ERROR_SETTING => Some("G_FILE_ATTRIBUTE_STATUS_ERROR_SETTING")
      case _ => None
  extension (a: GFileAttributeStatus)
    inline def &(b: GFileAttributeStatus): GFileAttributeStatus = a & b
    inline def |(b: GFileAttributeStatus): GFileAttributeStatus = a | b
    inline def is(b: GFileAttributeStatus): Boolean = (a & b) == b

opaque type GFileAttributeType = CUnsignedInt
object GFileAttributeType extends CEnumU[GFileAttributeType]:
  given _tag: Tag[GFileAttributeType] = Tag.UInt
  inline def define(inline a: Long): GFileAttributeType = a.toUInt
  val G_FILE_ATTRIBUTE_TYPE_INVALID = define(0)
  val G_FILE_ATTRIBUTE_TYPE_STRING = define(1)
  val G_FILE_ATTRIBUTE_TYPE_BYTE_STRING = define(2)
  val G_FILE_ATTRIBUTE_TYPE_BOOLEAN = define(3)
  val G_FILE_ATTRIBUTE_TYPE_UINT32 = define(4)
  val G_FILE_ATTRIBUTE_TYPE_INT32 = define(5)
  val G_FILE_ATTRIBUTE_TYPE_UINT64 = define(6)
  val G_FILE_ATTRIBUTE_TYPE_INT64 = define(7)
  val G_FILE_ATTRIBUTE_TYPE_OBJECT = define(8)
  val G_FILE_ATTRIBUTE_TYPE_STRINGV = define(9)
  inline def getName(inline value: GFileAttributeType): Option[String] =
    value match
      case G_FILE_ATTRIBUTE_TYPE_INVALID => Some("G_FILE_ATTRIBUTE_TYPE_INVALID")
      case G_FILE_ATTRIBUTE_TYPE_STRING => Some("G_FILE_ATTRIBUTE_TYPE_STRING")
      case G_FILE_ATTRIBUTE_TYPE_BYTE_STRING => Some("G_FILE_ATTRIBUTE_TYPE_BYTE_STRING")
      case G_FILE_ATTRIBUTE_TYPE_BOOLEAN => Some("G_FILE_ATTRIBUTE_TYPE_BOOLEAN")
      case G_FILE_ATTRIBUTE_TYPE_UINT32 => Some("G_FILE_ATTRIBUTE_TYPE_UINT32")
      case G_FILE_ATTRIBUTE_TYPE_INT32 => Some("G_FILE_ATTRIBUTE_TYPE_INT32")
      case G_FILE_ATTRIBUTE_TYPE_UINT64 => Some("G_FILE_ATTRIBUTE_TYPE_UINT64")
      case G_FILE_ATTRIBUTE_TYPE_INT64 => Some("G_FILE_ATTRIBUTE_TYPE_INT64")
      case G_FILE_ATTRIBUTE_TYPE_OBJECT => Some("G_FILE_ATTRIBUTE_TYPE_OBJECT")
      case G_FILE_ATTRIBUTE_TYPE_STRINGV => Some("G_FILE_ATTRIBUTE_TYPE_STRINGV")
      case _ => None
  extension (a: GFileAttributeType)
    inline def &(b: GFileAttributeType): GFileAttributeType = a & b
    inline def |(b: GFileAttributeType): GFileAttributeType = a | b
    inline def is(b: GFileAttributeType): Boolean = (a & b) == b

opaque type GFileCopyFlags = CUnsignedInt
object GFileCopyFlags extends CEnumU[GFileCopyFlags]:
  given _tag: Tag[GFileCopyFlags] = Tag.UInt
  inline def define(inline a: Long): GFileCopyFlags = a.toUInt
  val G_FILE_COPY_NONE = define(0)
  val G_FILE_COPY_OVERWRITE = define(1)
  val G_FILE_COPY_BACKUP = define(2)
  val G_FILE_COPY_NOFOLLOW_SYMLINKS = define(4)
  val G_FILE_COPY_ALL_METADATA = define(8)
  val G_FILE_COPY_NO_FALLBACK_FOR_MOVE = define(16)
  val G_FILE_COPY_TARGET_DEFAULT_PERMS = define(32)
  inline def getName(inline value: GFileCopyFlags): Option[String] =
    value match
      case G_FILE_COPY_NONE => Some("G_FILE_COPY_NONE")
      case G_FILE_COPY_OVERWRITE => Some("G_FILE_COPY_OVERWRITE")
      case G_FILE_COPY_BACKUP => Some("G_FILE_COPY_BACKUP")
      case G_FILE_COPY_NOFOLLOW_SYMLINKS => Some("G_FILE_COPY_NOFOLLOW_SYMLINKS")
      case G_FILE_COPY_ALL_METADATA => Some("G_FILE_COPY_ALL_METADATA")
      case G_FILE_COPY_NO_FALLBACK_FOR_MOVE => Some("G_FILE_COPY_NO_FALLBACK_FOR_MOVE")
      case G_FILE_COPY_TARGET_DEFAULT_PERMS => Some("G_FILE_COPY_TARGET_DEFAULT_PERMS")
      case _ => None
  extension (a: GFileCopyFlags)
    inline def &(b: GFileCopyFlags): GFileCopyFlags = a & b
    inline def |(b: GFileCopyFlags): GFileCopyFlags = a | b
    inline def is(b: GFileCopyFlags): Boolean = (a & b) == b

opaque type GFileCreateFlags = CUnsignedInt
object GFileCreateFlags extends CEnumU[GFileCreateFlags]:
  given _tag: Tag[GFileCreateFlags] = Tag.UInt
  inline def define(inline a: Long): GFileCreateFlags = a.toUInt
  val G_FILE_CREATE_NONE = define(0)
  val G_FILE_CREATE_PRIVATE = define(1)
  val G_FILE_CREATE_REPLACE_DESTINATION = define(2)
  inline def getName(inline value: GFileCreateFlags): Option[String] =
    value match
      case G_FILE_CREATE_NONE => Some("G_FILE_CREATE_NONE")
      case G_FILE_CREATE_PRIVATE => Some("G_FILE_CREATE_PRIVATE")
      case G_FILE_CREATE_REPLACE_DESTINATION => Some("G_FILE_CREATE_REPLACE_DESTINATION")
      case _ => None
  extension (a: GFileCreateFlags)
    inline def &(b: GFileCreateFlags): GFileCreateFlags = a & b
    inline def |(b: GFileCreateFlags): GFileCreateFlags = a | b
    inline def is(b: GFileCreateFlags): Boolean = (a & b) == b

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
    value match
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

opaque type GFileMeasureFlags = CUnsignedInt
object GFileMeasureFlags extends CEnumU[GFileMeasureFlags]:
  given _tag: Tag[GFileMeasureFlags] = Tag.UInt
  inline def define(inline a: Long): GFileMeasureFlags = a.toUInt
  val G_FILE_MEASURE_NONE = define(0)
  val G_FILE_MEASURE_REPORT_ANY_ERROR = define(2)
  val G_FILE_MEASURE_APPARENT_SIZE = define(4)
  val G_FILE_MEASURE_NO_XDEV = define(8)
  inline def getName(inline value: GFileMeasureFlags): Option[String] =
    value match
      case G_FILE_MEASURE_NONE => Some("G_FILE_MEASURE_NONE")
      case G_FILE_MEASURE_REPORT_ANY_ERROR => Some("G_FILE_MEASURE_REPORT_ANY_ERROR")
      case G_FILE_MEASURE_APPARENT_SIZE => Some("G_FILE_MEASURE_APPARENT_SIZE")
      case G_FILE_MEASURE_NO_XDEV => Some("G_FILE_MEASURE_NO_XDEV")
      case _ => None
  extension (a: GFileMeasureFlags)
    inline def &(b: GFileMeasureFlags): GFileMeasureFlags = a & b
    inline def |(b: GFileMeasureFlags): GFileMeasureFlags = a | b
    inline def is(b: GFileMeasureFlags): Boolean = (a & b) == b

opaque type GFileMonitorEvent = CUnsignedInt
object GFileMonitorEvent extends CEnumU[GFileMonitorEvent]:
  given _tag: Tag[GFileMonitorEvent] = Tag.UInt
  inline def define(inline a: Long): GFileMonitorEvent = a.toUInt
  val G_FILE_MONITOR_EVENT_CHANGED = define(0)
  val G_FILE_MONITOR_EVENT_CHANGES_DONE_HINT = define(1)
  val G_FILE_MONITOR_EVENT_DELETED = define(2)
  val G_FILE_MONITOR_EVENT_CREATED = define(3)
  val G_FILE_MONITOR_EVENT_ATTRIBUTE_CHANGED = define(4)
  val G_FILE_MONITOR_EVENT_PRE_UNMOUNT = define(5)
  val G_FILE_MONITOR_EVENT_UNMOUNTED = define(6)
  val G_FILE_MONITOR_EVENT_MOVED = define(7)
  val G_FILE_MONITOR_EVENT_RENAMED = define(8)
  val G_FILE_MONITOR_EVENT_MOVED_IN = define(9)
  val G_FILE_MONITOR_EVENT_MOVED_OUT = define(10)
  inline def getName(inline value: GFileMonitorEvent): Option[String] =
    value match
      case G_FILE_MONITOR_EVENT_CHANGED => Some("G_FILE_MONITOR_EVENT_CHANGED")
      case G_FILE_MONITOR_EVENT_CHANGES_DONE_HINT => Some("G_FILE_MONITOR_EVENT_CHANGES_DONE_HINT")
      case G_FILE_MONITOR_EVENT_DELETED => Some("G_FILE_MONITOR_EVENT_DELETED")
      case G_FILE_MONITOR_EVENT_CREATED => Some("G_FILE_MONITOR_EVENT_CREATED")
      case G_FILE_MONITOR_EVENT_ATTRIBUTE_CHANGED => Some("G_FILE_MONITOR_EVENT_ATTRIBUTE_CHANGED")
      case G_FILE_MONITOR_EVENT_PRE_UNMOUNT => Some("G_FILE_MONITOR_EVENT_PRE_UNMOUNT")
      case G_FILE_MONITOR_EVENT_UNMOUNTED => Some("G_FILE_MONITOR_EVENT_UNMOUNTED")
      case G_FILE_MONITOR_EVENT_MOVED => Some("G_FILE_MONITOR_EVENT_MOVED")
      case G_FILE_MONITOR_EVENT_RENAMED => Some("G_FILE_MONITOR_EVENT_RENAMED")
      case G_FILE_MONITOR_EVENT_MOVED_IN => Some("G_FILE_MONITOR_EVENT_MOVED_IN")
      case G_FILE_MONITOR_EVENT_MOVED_OUT => Some("G_FILE_MONITOR_EVENT_MOVED_OUT")
      case _ => None
  extension (a: GFileMonitorEvent)
    inline def &(b: GFileMonitorEvent): GFileMonitorEvent = a & b
    inline def |(b: GFileMonitorEvent): GFileMonitorEvent = a | b
    inline def is(b: GFileMonitorEvent): Boolean = (a & b) == b

opaque type GFileMonitorFlags = CUnsignedInt
object GFileMonitorFlags extends CEnumU[GFileMonitorFlags]:
  given _tag: Tag[GFileMonitorFlags] = Tag.UInt
  inline def define(inline a: Long): GFileMonitorFlags = a.toUInt
  val G_FILE_MONITOR_NONE = define(0)
  val G_FILE_MONITOR_WATCH_MOUNTS = define(1)
  val G_FILE_MONITOR_SEND_MOVED = define(2)
  val G_FILE_MONITOR_WATCH_HARD_LINKS = define(4)
  val G_FILE_MONITOR_WATCH_MOVES = define(8)
  inline def getName(inline value: GFileMonitorFlags): Option[String] =
    value match
      case G_FILE_MONITOR_NONE => Some("G_FILE_MONITOR_NONE")
      case G_FILE_MONITOR_WATCH_MOUNTS => Some("G_FILE_MONITOR_WATCH_MOUNTS")
      case G_FILE_MONITOR_SEND_MOVED => Some("G_FILE_MONITOR_SEND_MOVED")
      case G_FILE_MONITOR_WATCH_HARD_LINKS => Some("G_FILE_MONITOR_WATCH_HARD_LINKS")
      case G_FILE_MONITOR_WATCH_MOVES => Some("G_FILE_MONITOR_WATCH_MOVES")
      case _ => None
  extension (a: GFileMonitorFlags)
    inline def &(b: GFileMonitorFlags): GFileMonitorFlags = a & b
    inline def |(b: GFileMonitorFlags): GFileMonitorFlags = a | b
    inline def is(b: GFileMonitorFlags): Boolean = (a & b) == b

opaque type GFileQueryInfoFlags = CUnsignedInt
object GFileQueryInfoFlags extends CEnumU[GFileQueryInfoFlags]:
  given _tag: Tag[GFileQueryInfoFlags] = Tag.UInt
  inline def define(inline a: Long): GFileQueryInfoFlags = a.toUInt
  val G_FILE_QUERY_INFO_NONE = define(0)
  val G_FILE_QUERY_INFO_NOFOLLOW_SYMLINKS = define(1)
  inline def getName(inline value: GFileQueryInfoFlags): Option[String] =
    value match
      case G_FILE_QUERY_INFO_NONE => Some("G_FILE_QUERY_INFO_NONE")
      case G_FILE_QUERY_INFO_NOFOLLOW_SYMLINKS => Some("G_FILE_QUERY_INFO_NOFOLLOW_SYMLINKS")
      case _ => None
  extension (a: GFileQueryInfoFlags)
    inline def &(b: GFileQueryInfoFlags): GFileQueryInfoFlags = a & b
    inline def |(b: GFileQueryInfoFlags): GFileQueryInfoFlags = a | b
    inline def is(b: GFileQueryInfoFlags): Boolean = (a & b) == b

opaque type GFileSetContentsFlags = CUnsignedInt
object GFileSetContentsFlags extends CEnumU[GFileSetContentsFlags]:
  given _tag: Tag[GFileSetContentsFlags] = Tag.UInt
  inline def define(inline a: Long): GFileSetContentsFlags = a.toUInt
  val G_FILE_SET_CONTENTS_NONE = define(0)
  val G_FILE_SET_CONTENTS_CONSISTENT = define(1)
  val G_FILE_SET_CONTENTS_DURABLE = define(2)
  val G_FILE_SET_CONTENTS_ONLY_EXISTING = define(4)
  inline def getName(inline value: GFileSetContentsFlags): Option[String] =
    value match
      case G_FILE_SET_CONTENTS_NONE => Some("G_FILE_SET_CONTENTS_NONE")
      case G_FILE_SET_CONTENTS_CONSISTENT => Some("G_FILE_SET_CONTENTS_CONSISTENT")
      case G_FILE_SET_CONTENTS_DURABLE => Some("G_FILE_SET_CONTENTS_DURABLE")
      case G_FILE_SET_CONTENTS_ONLY_EXISTING => Some("G_FILE_SET_CONTENTS_ONLY_EXISTING")
      case _ => None
  extension (a: GFileSetContentsFlags)
    inline def &(b: GFileSetContentsFlags): GFileSetContentsFlags = a & b
    inline def |(b: GFileSetContentsFlags): GFileSetContentsFlags = a | b
    inline def is(b: GFileSetContentsFlags): Boolean = (a & b) == b

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
    value match
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

opaque type GFileType = CUnsignedInt
object GFileType extends CEnumU[GFileType]:
  given _tag: Tag[GFileType] = Tag.UInt
  inline def define(inline a: Long): GFileType = a.toUInt
  val G_FILE_TYPE_UNKNOWN = define(0)
  val G_FILE_TYPE_REGULAR = define(1)
  val G_FILE_TYPE_DIRECTORY = define(2)
  val G_FILE_TYPE_SYMBOLIC_LINK = define(3)
  val G_FILE_TYPE_SPECIAL = define(4)
  val G_FILE_TYPE_SHORTCUT = define(5)
  val G_FILE_TYPE_MOUNTABLE = define(6)
  inline def getName(inline value: GFileType): Option[String] =
    value match
      case G_FILE_TYPE_UNKNOWN => Some("G_FILE_TYPE_UNKNOWN")
      case G_FILE_TYPE_REGULAR => Some("G_FILE_TYPE_REGULAR")
      case G_FILE_TYPE_DIRECTORY => Some("G_FILE_TYPE_DIRECTORY")
      case G_FILE_TYPE_SYMBOLIC_LINK => Some("G_FILE_TYPE_SYMBOLIC_LINK")
      case G_FILE_TYPE_SPECIAL => Some("G_FILE_TYPE_SPECIAL")
      case G_FILE_TYPE_SHORTCUT => Some("G_FILE_TYPE_SHORTCUT")
      case G_FILE_TYPE_MOUNTABLE => Some("G_FILE_TYPE_MOUNTABLE")
      case _ => None
  extension (a: GFileType)
    inline def &(b: GFileType): GFileType = a & b
    inline def |(b: GFileType): GFileType = a | b
    inline def is(b: GFileType): Boolean = (a & b) == b

opaque type GFilesystemPreviewType = CUnsignedInt
object GFilesystemPreviewType extends CEnumU[GFilesystemPreviewType]:
  given _tag: Tag[GFilesystemPreviewType] = Tag.UInt
  inline def define(inline a: Long): GFilesystemPreviewType = a.toUInt
  val G_FILESYSTEM_PREVIEW_TYPE_IF_ALWAYS = define(0)
  val G_FILESYSTEM_PREVIEW_TYPE_IF_LOCAL = define(1)
  val G_FILESYSTEM_PREVIEW_TYPE_NEVER = define(2)
  inline def getName(inline value: GFilesystemPreviewType): Option[String] =
    value match
      case G_FILESYSTEM_PREVIEW_TYPE_IF_ALWAYS => Some("G_FILESYSTEM_PREVIEW_TYPE_IF_ALWAYS")
      case G_FILESYSTEM_PREVIEW_TYPE_IF_LOCAL => Some("G_FILESYSTEM_PREVIEW_TYPE_IF_LOCAL")
      case G_FILESYSTEM_PREVIEW_TYPE_NEVER => Some("G_FILESYSTEM_PREVIEW_TYPE_NEVER")
      case _ => None
  extension (a: GFilesystemPreviewType)
    inline def &(b: GFilesystemPreviewType): GFilesystemPreviewType = a & b
    inline def |(b: GFilesystemPreviewType): GFilesystemPreviewType = a | b
    inline def is(b: GFilesystemPreviewType): Boolean = (a & b) == b

opaque type GFormatSizeFlags = CUnsignedInt
object GFormatSizeFlags extends CEnumU[GFormatSizeFlags]:
  given _tag: Tag[GFormatSizeFlags] = Tag.UInt
  inline def define(inline a: Long): GFormatSizeFlags = a.toUInt
  val G_FORMAT_SIZE_DEFAULT = define(0)
  val G_FORMAT_SIZE_LONG_FORMAT = define(1)
  val G_FORMAT_SIZE_IEC_UNITS = define(2)
  val G_FORMAT_SIZE_BITS = define(4)
  inline def getName(inline value: GFormatSizeFlags): Option[String] =
    value match
      case G_FORMAT_SIZE_DEFAULT => Some("G_FORMAT_SIZE_DEFAULT")
      case G_FORMAT_SIZE_LONG_FORMAT => Some("G_FORMAT_SIZE_LONG_FORMAT")
      case G_FORMAT_SIZE_IEC_UNITS => Some("G_FORMAT_SIZE_IEC_UNITS")
      case G_FORMAT_SIZE_BITS => Some("G_FORMAT_SIZE_BITS")
      case _ => None
  extension (a: GFormatSizeFlags)
    inline def &(b: GFormatSizeFlags): GFormatSizeFlags = a & b
    inline def |(b: GFormatSizeFlags): GFormatSizeFlags = a | b
    inline def is(b: GFormatSizeFlags): Boolean = (a & b) == b

opaque type GHookFlagMask = CUnsignedInt
object GHookFlagMask extends CEnumU[GHookFlagMask]:
  given _tag: Tag[GHookFlagMask] = Tag.UInt
  inline def define(inline a: Long): GHookFlagMask = a.toUInt
  val G_HOOK_FLAG_ACTIVE = define(1)
  val G_HOOK_FLAG_IN_CALL = define(2)
  val G_HOOK_FLAG_MASK = define(15)
  inline def getName(inline value: GHookFlagMask): Option[String] =
    value match
      case G_HOOK_FLAG_ACTIVE => Some("G_HOOK_FLAG_ACTIVE")
      case G_HOOK_FLAG_IN_CALL => Some("G_HOOK_FLAG_IN_CALL")
      case G_HOOK_FLAG_MASK => Some("G_HOOK_FLAG_MASK")
      case _ => None
  extension (a: GHookFlagMask)
    inline def &(b: GHookFlagMask): GHookFlagMask = a & b
    inline def |(b: GHookFlagMask): GHookFlagMask = a | b
    inline def is(b: GHookFlagMask): Boolean = (a & b) == b

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
    value match
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
    value match
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

opaque type GIOError = CUnsignedInt
object GIOError extends CEnumU[GIOError]:
  given _tag: Tag[GIOError] = Tag.UInt
  inline def define(inline a: Long): GIOError = a.toUInt
  val G_IO_ERROR_NONE = define(0)
  val G_IO_ERROR_AGAIN = define(1)
  val G_IO_ERROR_INVAL = define(2)
  val G_IO_ERROR_UNKNOWN = define(3)
  inline def getName(inline value: GIOError): Option[String] =
    value match
      case G_IO_ERROR_NONE => Some("G_IO_ERROR_NONE")
      case G_IO_ERROR_AGAIN => Some("G_IO_ERROR_AGAIN")
      case G_IO_ERROR_INVAL => Some("G_IO_ERROR_INVAL")
      case G_IO_ERROR_UNKNOWN => Some("G_IO_ERROR_UNKNOWN")
      case _ => None
  extension (a: GIOError)
    inline def &(b: GIOError): GIOError = a & b
    inline def |(b: GIOError): GIOError = a | b
    inline def is(b: GIOError): Boolean = (a & b) == b

opaque type GIOErrorEnum = CUnsignedInt
object GIOErrorEnum extends CEnumU[GIOErrorEnum]:
  given _tag: Tag[GIOErrorEnum] = Tag.UInt
  inline def define(inline a: Long): GIOErrorEnum = a.toUInt
  val G_IO_ERROR_FAILED = define(0)
  val G_IO_ERROR_NOT_FOUND = define(1)
  val G_IO_ERROR_EXISTS = define(2)
  val G_IO_ERROR_IS_DIRECTORY = define(3)
  val G_IO_ERROR_NOT_DIRECTORY = define(4)
  val G_IO_ERROR_NOT_EMPTY = define(5)
  val G_IO_ERROR_NOT_REGULAR_FILE = define(6)
  val G_IO_ERROR_NOT_SYMBOLIC_LINK = define(7)
  val G_IO_ERROR_NOT_MOUNTABLE_FILE = define(8)
  val G_IO_ERROR_FILENAME_TOO_LONG = define(9)
  val G_IO_ERROR_INVALID_FILENAME = define(10)
  val G_IO_ERROR_TOO_MANY_LINKS = define(11)
  val G_IO_ERROR_NO_SPACE = define(12)
  val G_IO_ERROR_INVALID_ARGUMENT = define(13)
  val G_IO_ERROR_PERMISSION_DENIED = define(14)
  val G_IO_ERROR_NOT_SUPPORTED = define(15)
  val G_IO_ERROR_NOT_MOUNTED = define(16)
  val G_IO_ERROR_ALREADY_MOUNTED = define(17)
  val G_IO_ERROR_CLOSED = define(18)
  val G_IO_ERROR_CANCELLED = define(19)
  val G_IO_ERROR_PENDING = define(20)
  val G_IO_ERROR_READ_ONLY = define(21)
  val G_IO_ERROR_CANT_CREATE_BACKUP = define(22)
  val G_IO_ERROR_WRONG_ETAG = define(23)
  val G_IO_ERROR_TIMED_OUT = define(24)
  val G_IO_ERROR_WOULD_RECURSE = define(25)
  val G_IO_ERROR_BUSY = define(26)
  val G_IO_ERROR_WOULD_BLOCK = define(27)
  val G_IO_ERROR_HOST_NOT_FOUND = define(28)
  val G_IO_ERROR_WOULD_MERGE = define(29)
  val G_IO_ERROR_FAILED_HANDLED = define(30)
  val G_IO_ERROR_TOO_MANY_OPEN_FILES = define(31)
  val G_IO_ERROR_NOT_INITIALIZED = define(32)
  val G_IO_ERROR_ADDRESS_IN_USE = define(33)
  val G_IO_ERROR_PARTIAL_INPUT = define(34)
  val G_IO_ERROR_INVALID_DATA = define(35)
  val G_IO_ERROR_DBUS_ERROR = define(36)
  val G_IO_ERROR_HOST_UNREACHABLE = define(37)
  val G_IO_ERROR_NETWORK_UNREACHABLE = define(38)
  val G_IO_ERROR_CONNECTION_REFUSED = define(39)
  val G_IO_ERROR_PROXY_FAILED = define(40)
  val G_IO_ERROR_PROXY_AUTH_FAILED = define(41)
  val G_IO_ERROR_PROXY_NEED_AUTH = define(42)
  val G_IO_ERROR_PROXY_NOT_ALLOWED = define(43)
  val G_IO_ERROR_BROKEN_PIPE = define(44)
  val G_IO_ERROR_CONNECTION_CLOSED = define(44)
  val G_IO_ERROR_NOT_CONNECTED = define(45)
  val G_IO_ERROR_MESSAGE_TOO_LARGE = define(46)
  inline def getName(inline value: GIOErrorEnum): Option[String] =
    value match
      case G_IO_ERROR_FAILED => Some("G_IO_ERROR_FAILED")
      case G_IO_ERROR_NOT_FOUND => Some("G_IO_ERROR_NOT_FOUND")
      case G_IO_ERROR_EXISTS => Some("G_IO_ERROR_EXISTS")
      case G_IO_ERROR_IS_DIRECTORY => Some("G_IO_ERROR_IS_DIRECTORY")
      case G_IO_ERROR_NOT_DIRECTORY => Some("G_IO_ERROR_NOT_DIRECTORY")
      case G_IO_ERROR_NOT_EMPTY => Some("G_IO_ERROR_NOT_EMPTY")
      case G_IO_ERROR_NOT_REGULAR_FILE => Some("G_IO_ERROR_NOT_REGULAR_FILE")
      case G_IO_ERROR_NOT_SYMBOLIC_LINK => Some("G_IO_ERROR_NOT_SYMBOLIC_LINK")
      case G_IO_ERROR_NOT_MOUNTABLE_FILE => Some("G_IO_ERROR_NOT_MOUNTABLE_FILE")
      case G_IO_ERROR_FILENAME_TOO_LONG => Some("G_IO_ERROR_FILENAME_TOO_LONG")
      case G_IO_ERROR_INVALID_FILENAME => Some("G_IO_ERROR_INVALID_FILENAME")
      case G_IO_ERROR_TOO_MANY_LINKS => Some("G_IO_ERROR_TOO_MANY_LINKS")
      case G_IO_ERROR_NO_SPACE => Some("G_IO_ERROR_NO_SPACE")
      case G_IO_ERROR_INVALID_ARGUMENT => Some("G_IO_ERROR_INVALID_ARGUMENT")
      case G_IO_ERROR_PERMISSION_DENIED => Some("G_IO_ERROR_PERMISSION_DENIED")
      case G_IO_ERROR_NOT_SUPPORTED => Some("G_IO_ERROR_NOT_SUPPORTED")
      case G_IO_ERROR_NOT_MOUNTED => Some("G_IO_ERROR_NOT_MOUNTED")
      case G_IO_ERROR_ALREADY_MOUNTED => Some("G_IO_ERROR_ALREADY_MOUNTED")
      case G_IO_ERROR_CLOSED => Some("G_IO_ERROR_CLOSED")
      case G_IO_ERROR_CANCELLED => Some("G_IO_ERROR_CANCELLED")
      case G_IO_ERROR_PENDING => Some("G_IO_ERROR_PENDING")
      case G_IO_ERROR_READ_ONLY => Some("G_IO_ERROR_READ_ONLY")
      case G_IO_ERROR_CANT_CREATE_BACKUP => Some("G_IO_ERROR_CANT_CREATE_BACKUP")
      case G_IO_ERROR_WRONG_ETAG => Some("G_IO_ERROR_WRONG_ETAG")
      case G_IO_ERROR_TIMED_OUT => Some("G_IO_ERROR_TIMED_OUT")
      case G_IO_ERROR_WOULD_RECURSE => Some("G_IO_ERROR_WOULD_RECURSE")
      case G_IO_ERROR_BUSY => Some("G_IO_ERROR_BUSY")
      case G_IO_ERROR_WOULD_BLOCK => Some("G_IO_ERROR_WOULD_BLOCK")
      case G_IO_ERROR_HOST_NOT_FOUND => Some("G_IO_ERROR_HOST_NOT_FOUND")
      case G_IO_ERROR_WOULD_MERGE => Some("G_IO_ERROR_WOULD_MERGE")
      case G_IO_ERROR_FAILED_HANDLED => Some("G_IO_ERROR_FAILED_HANDLED")
      case G_IO_ERROR_TOO_MANY_OPEN_FILES => Some("G_IO_ERROR_TOO_MANY_OPEN_FILES")
      case G_IO_ERROR_NOT_INITIALIZED => Some("G_IO_ERROR_NOT_INITIALIZED")
      case G_IO_ERROR_ADDRESS_IN_USE => Some("G_IO_ERROR_ADDRESS_IN_USE")
      case G_IO_ERROR_PARTIAL_INPUT => Some("G_IO_ERROR_PARTIAL_INPUT")
      case G_IO_ERROR_INVALID_DATA => Some("G_IO_ERROR_INVALID_DATA")
      case G_IO_ERROR_DBUS_ERROR => Some("G_IO_ERROR_DBUS_ERROR")
      case G_IO_ERROR_HOST_UNREACHABLE => Some("G_IO_ERROR_HOST_UNREACHABLE")
      case G_IO_ERROR_NETWORK_UNREACHABLE => Some("G_IO_ERROR_NETWORK_UNREACHABLE")
      case G_IO_ERROR_CONNECTION_REFUSED => Some("G_IO_ERROR_CONNECTION_REFUSED")
      case G_IO_ERROR_PROXY_FAILED => Some("G_IO_ERROR_PROXY_FAILED")
      case G_IO_ERROR_PROXY_AUTH_FAILED => Some("G_IO_ERROR_PROXY_AUTH_FAILED")
      case G_IO_ERROR_PROXY_NEED_AUTH => Some("G_IO_ERROR_PROXY_NEED_AUTH")
      case G_IO_ERROR_PROXY_NOT_ALLOWED => Some("G_IO_ERROR_PROXY_NOT_ALLOWED")
      case G_IO_ERROR_BROKEN_PIPE => Some("G_IO_ERROR_BROKEN_PIPE")
      case G_IO_ERROR_CONNECTION_CLOSED => Some("G_IO_ERROR_CONNECTION_CLOSED")
      case G_IO_ERROR_NOT_CONNECTED => Some("G_IO_ERROR_NOT_CONNECTED")
      case G_IO_ERROR_MESSAGE_TOO_LARGE => Some("G_IO_ERROR_MESSAGE_TOO_LARGE")
      case _ => None
  extension (a: GIOErrorEnum)
    inline def &(b: GIOErrorEnum): GIOErrorEnum = a & b
    inline def |(b: GIOErrorEnum): GIOErrorEnum = a | b
    inline def is(b: GIOErrorEnum): Boolean = (a & b) == b

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
    value match
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

opaque type GIOModuleScopeFlags = CUnsignedInt
object GIOModuleScopeFlags extends CEnumU[GIOModuleScopeFlags]:
  given _tag: Tag[GIOModuleScopeFlags] = Tag.UInt
  inline def define(inline a: Long): GIOModuleScopeFlags = a.toUInt
  val G_IO_MODULE_SCOPE_NONE = define(0)
  val G_IO_MODULE_SCOPE_BLOCK_DUPLICATES = define(1)
  inline def getName(inline value: GIOModuleScopeFlags): Option[String] =
    value match
      case G_IO_MODULE_SCOPE_NONE => Some("G_IO_MODULE_SCOPE_NONE")
      case G_IO_MODULE_SCOPE_BLOCK_DUPLICATES => Some("G_IO_MODULE_SCOPE_BLOCK_DUPLICATES")
      case _ => None
  extension (a: GIOModuleScopeFlags)
    inline def &(b: GIOModuleScopeFlags): GIOModuleScopeFlags = a & b
    inline def |(b: GIOModuleScopeFlags): GIOModuleScopeFlags = a | b
    inline def is(b: GIOModuleScopeFlags): Boolean = (a & b) == b

opaque type GIOStatus = CUnsignedInt
object GIOStatus extends CEnumU[GIOStatus]:
  given _tag: Tag[GIOStatus] = Tag.UInt
  inline def define(inline a: Long): GIOStatus = a.toUInt
  val G_IO_STATUS_ERROR = define(0)
  val G_IO_STATUS_NORMAL = define(1)
  val G_IO_STATUS_EOF = define(2)
  val G_IO_STATUS_AGAIN = define(3)
  inline def getName(inline value: GIOStatus): Option[String] =
    value match
      case G_IO_STATUS_ERROR => Some("G_IO_STATUS_ERROR")
      case G_IO_STATUS_NORMAL => Some("G_IO_STATUS_NORMAL")
      case G_IO_STATUS_EOF => Some("G_IO_STATUS_EOF")
      case G_IO_STATUS_AGAIN => Some("G_IO_STATUS_AGAIN")
      case _ => None
  extension (a: GIOStatus)
    inline def &(b: GIOStatus): GIOStatus = a & b
    inline def |(b: GIOStatus): GIOStatus = a | b
    inline def is(b: GIOStatus): Boolean = (a & b) == b

opaque type GIOStreamSpliceFlags = CUnsignedInt
object GIOStreamSpliceFlags extends CEnumU[GIOStreamSpliceFlags]:
  given _tag: Tag[GIOStreamSpliceFlags] = Tag.UInt
  inline def define(inline a: Long): GIOStreamSpliceFlags = a.toUInt
  val G_IO_STREAM_SPLICE_NONE = define(0)
  val G_IO_STREAM_SPLICE_CLOSE_STREAM1 = define(1)
  val G_IO_STREAM_SPLICE_CLOSE_STREAM2 = define(2)
  val G_IO_STREAM_SPLICE_WAIT_FOR_BOTH = define(4)
  inline def getName(inline value: GIOStreamSpliceFlags): Option[String] =
    value match
      case G_IO_STREAM_SPLICE_NONE => Some("G_IO_STREAM_SPLICE_NONE")
      case G_IO_STREAM_SPLICE_CLOSE_STREAM1 => Some("G_IO_STREAM_SPLICE_CLOSE_STREAM1")
      case G_IO_STREAM_SPLICE_CLOSE_STREAM2 => Some("G_IO_STREAM_SPLICE_CLOSE_STREAM2")
      case G_IO_STREAM_SPLICE_WAIT_FOR_BOTH => Some("G_IO_STREAM_SPLICE_WAIT_FOR_BOTH")
      case _ => None
  extension (a: GIOStreamSpliceFlags)
    inline def &(b: GIOStreamSpliceFlags): GIOStreamSpliceFlags = a & b
    inline def |(b: GIOStreamSpliceFlags): GIOStreamSpliceFlags = a | b
    inline def is(b: GIOStreamSpliceFlags): Boolean = (a & b) == b

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
    value match
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

opaque type GKeyFileFlags = CUnsignedInt
object GKeyFileFlags extends CEnumU[GKeyFileFlags]:
  given _tag: Tag[GKeyFileFlags] = Tag.UInt
  inline def define(inline a: Long): GKeyFileFlags = a.toUInt
  val G_KEY_FILE_NONE = define(0)
  val G_KEY_FILE_KEEP_COMMENTS = define(1)
  val G_KEY_FILE_KEEP_TRANSLATIONS = define(2)
  inline def getName(inline value: GKeyFileFlags): Option[String] =
    value match
      case G_KEY_FILE_NONE => Some("G_KEY_FILE_NONE")
      case G_KEY_FILE_KEEP_COMMENTS => Some("G_KEY_FILE_KEEP_COMMENTS")
      case G_KEY_FILE_KEEP_TRANSLATIONS => Some("G_KEY_FILE_KEEP_TRANSLATIONS")
      case _ => None
  extension (a: GKeyFileFlags)
    inline def &(b: GKeyFileFlags): GKeyFileFlags = a & b
    inline def |(b: GKeyFileFlags): GKeyFileFlags = a | b
    inline def is(b: GKeyFileFlags): Boolean = (a & b) == b

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
    value match
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

opaque type GLogWriterOutput = CUnsignedInt
object GLogWriterOutput extends CEnumU[GLogWriterOutput]:
  given _tag: Tag[GLogWriterOutput] = Tag.UInt
  inline def define(inline a: Long): GLogWriterOutput = a.toUInt
  val G_LOG_WRITER_HANDLED = define(1)
  val G_LOG_WRITER_UNHANDLED = define(0)
  inline def getName(inline value: GLogWriterOutput): Option[String] =
    value match
      case G_LOG_WRITER_HANDLED => Some("G_LOG_WRITER_HANDLED")
      case G_LOG_WRITER_UNHANDLED => Some("G_LOG_WRITER_UNHANDLED")
      case _ => None
  extension (a: GLogWriterOutput)
    inline def &(b: GLogWriterOutput): GLogWriterOutput = a & b
    inline def |(b: GLogWriterOutput): GLogWriterOutput = a | b
    inline def is(b: GLogWriterOutput): Boolean = (a & b) == b

opaque type GMainContextFlags = CUnsignedInt
object GMainContextFlags extends CEnumU[GMainContextFlags]:
  given _tag: Tag[GMainContextFlags] = Tag.UInt
  inline def define(inline a: Long): GMainContextFlags = a.toUInt
  val G_MAIN_CONTEXT_FLAGS_NONE = define(0)
  val G_MAIN_CONTEXT_FLAGS_OWNERLESS_POLLING = define(1)
  inline def getName(inline value: GMainContextFlags): Option[String] =
    value match
      case G_MAIN_CONTEXT_FLAGS_NONE => Some("G_MAIN_CONTEXT_FLAGS_NONE")
      case G_MAIN_CONTEXT_FLAGS_OWNERLESS_POLLING => Some("G_MAIN_CONTEXT_FLAGS_OWNERLESS_POLLING")
      case _ => None
  extension (a: GMainContextFlags)
    inline def &(b: GMainContextFlags): GMainContextFlags = a & b
    inline def |(b: GMainContextFlags): GMainContextFlags = a | b
    inline def is(b: GMainContextFlags): Boolean = (a & b) == b

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
    value match
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
    value match
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

opaque type GMarkupParseFlags = CUnsignedInt
object GMarkupParseFlags extends CEnumU[GMarkupParseFlags]:
  given _tag: Tag[GMarkupParseFlags] = Tag.UInt
  inline def define(inline a: Long): GMarkupParseFlags = a.toUInt
  val G_MARKUP_DO_NOT_USE_THIS_UNSUPPORTED_FLAG = define(1)
  val G_MARKUP_TREAT_CDATA_AS_TEXT = define(2)
  val G_MARKUP_PREFIX_ERROR_POSITION = define(4)
  val G_MARKUP_IGNORE_QUALIFIED = define(8)
  inline def getName(inline value: GMarkupParseFlags): Option[String] =
    value match
      case G_MARKUP_DO_NOT_USE_THIS_UNSUPPORTED_FLAG => Some("G_MARKUP_DO_NOT_USE_THIS_UNSUPPORTED_FLAG")
      case G_MARKUP_TREAT_CDATA_AS_TEXT => Some("G_MARKUP_TREAT_CDATA_AS_TEXT")
      case G_MARKUP_PREFIX_ERROR_POSITION => Some("G_MARKUP_PREFIX_ERROR_POSITION")
      case G_MARKUP_IGNORE_QUALIFIED => Some("G_MARKUP_IGNORE_QUALIFIED")
      case _ => None
  extension (a: GMarkupParseFlags)
    inline def &(b: GMarkupParseFlags): GMarkupParseFlags = a & b
    inline def |(b: GMarkupParseFlags): GMarkupParseFlags = a | b
    inline def is(b: GMarkupParseFlags): Boolean = (a & b) == b

opaque type GMemoryMonitorWarningLevel = CUnsignedInt
object GMemoryMonitorWarningLevel extends CEnumU[GMemoryMonitorWarningLevel]:
  given _tag: Tag[GMemoryMonitorWarningLevel] = Tag.UInt
  inline def define(inline a: Long): GMemoryMonitorWarningLevel = a.toUInt
  val G_MEMORY_MONITOR_WARNING_LEVEL_LOW = define(50)
  val G_MEMORY_MONITOR_WARNING_LEVEL_MEDIUM = define(100)
  val G_MEMORY_MONITOR_WARNING_LEVEL_CRITICAL = define(255)
  inline def getName(inline value: GMemoryMonitorWarningLevel): Option[String] =
    value match
      case G_MEMORY_MONITOR_WARNING_LEVEL_LOW => Some("G_MEMORY_MONITOR_WARNING_LEVEL_LOW")
      case G_MEMORY_MONITOR_WARNING_LEVEL_MEDIUM => Some("G_MEMORY_MONITOR_WARNING_LEVEL_MEDIUM")
      case G_MEMORY_MONITOR_WARNING_LEVEL_CRITICAL => Some("G_MEMORY_MONITOR_WARNING_LEVEL_CRITICAL")
      case _ => None
  extension (a: GMemoryMonitorWarningLevel)
    inline def &(b: GMemoryMonitorWarningLevel): GMemoryMonitorWarningLevel = a & b
    inline def |(b: GMemoryMonitorWarningLevel): GMemoryMonitorWarningLevel = a | b
    inline def is(b: GMemoryMonitorWarningLevel): Boolean = (a & b) == b

opaque type GModuleError = CUnsignedInt
object GModuleError extends CEnumU[GModuleError]:
  given _tag: Tag[GModuleError] = Tag.UInt
  inline def define(inline a: Long): GModuleError = a.toUInt
  val G_MODULE_ERROR_FAILED = define(0)
  val G_MODULE_ERROR_CHECK_FAILED = define(1)
  inline def getName(inline value: GModuleError): Option[String] =
    value match
      case G_MODULE_ERROR_FAILED => Some("G_MODULE_ERROR_FAILED")
      case G_MODULE_ERROR_CHECK_FAILED => Some("G_MODULE_ERROR_CHECK_FAILED")
      case _ => None
  extension (a: GModuleError)
    inline def &(b: GModuleError): GModuleError = a & b
    inline def |(b: GModuleError): GModuleError = a | b
    inline def is(b: GModuleError): Boolean = (a & b) == b

opaque type GModuleFlags = CUnsignedInt
object GModuleFlags extends CEnumU[GModuleFlags]:
  given _tag: Tag[GModuleFlags] = Tag.UInt
  inline def define(inline a: Long): GModuleFlags = a.toUInt
  val G_MODULE_BIND_LAZY = define(1)
  val G_MODULE_BIND_LOCAL = define(2)
  val G_MODULE_BIND_MASK = define(3)
  inline def getName(inline value: GModuleFlags): Option[String] =
    value match
      case G_MODULE_BIND_LAZY => Some("G_MODULE_BIND_LAZY")
      case G_MODULE_BIND_LOCAL => Some("G_MODULE_BIND_LOCAL")
      case G_MODULE_BIND_MASK => Some("G_MODULE_BIND_MASK")
      case _ => None
  extension (a: GModuleFlags)
    inline def &(b: GModuleFlags): GModuleFlags = a & b
    inline def |(b: GModuleFlags): GModuleFlags = a | b
    inline def is(b: GModuleFlags): Boolean = (a & b) == b

opaque type GMountMountFlags = CUnsignedInt
object GMountMountFlags extends CEnumU[GMountMountFlags]:
  given _tag: Tag[GMountMountFlags] = Tag.UInt
  inline def define(inline a: Long): GMountMountFlags = a.toUInt
  val G_MOUNT_MOUNT_NONE = define(0)
  inline def getName(inline value: GMountMountFlags): Option[String] =
    value match
      case G_MOUNT_MOUNT_NONE => Some("G_MOUNT_MOUNT_NONE")
      case _ => None
  extension (a: GMountMountFlags)
    inline def &(b: GMountMountFlags): GMountMountFlags = a & b
    inline def |(b: GMountMountFlags): GMountMountFlags = a | b
    inline def is(b: GMountMountFlags): Boolean = (a & b) == b

opaque type GMountOperationResult = CUnsignedInt
object GMountOperationResult extends CEnumU[GMountOperationResult]:
  given _tag: Tag[GMountOperationResult] = Tag.UInt
  inline def define(inline a: Long): GMountOperationResult = a.toUInt
  val G_MOUNT_OPERATION_HANDLED = define(0)
  val G_MOUNT_OPERATION_ABORTED = define(1)
  val G_MOUNT_OPERATION_UNHANDLED = define(2)
  inline def getName(inline value: GMountOperationResult): Option[String] =
    value match
      case G_MOUNT_OPERATION_HANDLED => Some("G_MOUNT_OPERATION_HANDLED")
      case G_MOUNT_OPERATION_ABORTED => Some("G_MOUNT_OPERATION_ABORTED")
      case G_MOUNT_OPERATION_UNHANDLED => Some("G_MOUNT_OPERATION_UNHANDLED")
      case _ => None
  extension (a: GMountOperationResult)
    inline def &(b: GMountOperationResult): GMountOperationResult = a & b
    inline def |(b: GMountOperationResult): GMountOperationResult = a | b
    inline def is(b: GMountOperationResult): Boolean = (a & b) == b

opaque type GMountUnmountFlags = CUnsignedInt
object GMountUnmountFlags extends CEnumU[GMountUnmountFlags]:
  given _tag: Tag[GMountUnmountFlags] = Tag.UInt
  inline def define(inline a: Long): GMountUnmountFlags = a.toUInt
  val G_MOUNT_UNMOUNT_NONE = define(0)
  val G_MOUNT_UNMOUNT_FORCE = define(1)
  inline def getName(inline value: GMountUnmountFlags): Option[String] =
    value match
      case G_MOUNT_UNMOUNT_NONE => Some("G_MOUNT_UNMOUNT_NONE")
      case G_MOUNT_UNMOUNT_FORCE => Some("G_MOUNT_UNMOUNT_FORCE")
      case _ => None
  extension (a: GMountUnmountFlags)
    inline def &(b: GMountUnmountFlags): GMountUnmountFlags = a & b
    inline def |(b: GMountUnmountFlags): GMountUnmountFlags = a | b
    inline def is(b: GMountUnmountFlags): Boolean = (a & b) == b

opaque type GNetworkConnectivity = CUnsignedInt
object GNetworkConnectivity extends CEnumU[GNetworkConnectivity]:
  given _tag: Tag[GNetworkConnectivity] = Tag.UInt
  inline def define(inline a: Long): GNetworkConnectivity = a.toUInt
  val G_NETWORK_CONNECTIVITY_LOCAL = define(1)
  val G_NETWORK_CONNECTIVITY_LIMITED = define(2)
  val G_NETWORK_CONNECTIVITY_PORTAL = define(3)
  val G_NETWORK_CONNECTIVITY_FULL = define(4)
  inline def getName(inline value: GNetworkConnectivity): Option[String] =
    value match
      case G_NETWORK_CONNECTIVITY_LOCAL => Some("G_NETWORK_CONNECTIVITY_LOCAL")
      case G_NETWORK_CONNECTIVITY_LIMITED => Some("G_NETWORK_CONNECTIVITY_LIMITED")
      case G_NETWORK_CONNECTIVITY_PORTAL => Some("G_NETWORK_CONNECTIVITY_PORTAL")
      case G_NETWORK_CONNECTIVITY_FULL => Some("G_NETWORK_CONNECTIVITY_FULL")
      case _ => None
  extension (a: GNetworkConnectivity)
    inline def &(b: GNetworkConnectivity): GNetworkConnectivity = a & b
    inline def |(b: GNetworkConnectivity): GNetworkConnectivity = a | b
    inline def is(b: GNetworkConnectivity): Boolean = (a & b) == b

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
    value match
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

opaque type GNotificationPriority = CUnsignedInt
object GNotificationPriority extends CEnumU[GNotificationPriority]:
  given _tag: Tag[GNotificationPriority] = Tag.UInt
  inline def define(inline a: Long): GNotificationPriority = a.toUInt
  val G_NOTIFICATION_PRIORITY_NORMAL = define(0)
  val G_NOTIFICATION_PRIORITY_LOW = define(1)
  val G_NOTIFICATION_PRIORITY_HIGH = define(2)
  val G_NOTIFICATION_PRIORITY_URGENT = define(3)
  inline def getName(inline value: GNotificationPriority): Option[String] =
    value match
      case G_NOTIFICATION_PRIORITY_NORMAL => Some("G_NOTIFICATION_PRIORITY_NORMAL")
      case G_NOTIFICATION_PRIORITY_LOW => Some("G_NOTIFICATION_PRIORITY_LOW")
      case G_NOTIFICATION_PRIORITY_HIGH => Some("G_NOTIFICATION_PRIORITY_HIGH")
      case G_NOTIFICATION_PRIORITY_URGENT => Some("G_NOTIFICATION_PRIORITY_URGENT")
      case _ => None
  extension (a: GNotificationPriority)
    inline def &(b: GNotificationPriority): GNotificationPriority = a & b
    inline def |(b: GNotificationPriority): GNotificationPriority = a | b
    inline def is(b: GNotificationPriority): Boolean = (a & b) == b

opaque type GNumberParserError = CUnsignedInt
object GNumberParserError extends CEnumU[GNumberParserError]:
  given _tag: Tag[GNumberParserError] = Tag.UInt
  inline def define(inline a: Long): GNumberParserError = a.toUInt
  val G_NUMBER_PARSER_ERROR_INVALID = define(0)
  val G_NUMBER_PARSER_ERROR_OUT_OF_BOUNDS = define(1)
  inline def getName(inline value: GNumberParserError): Option[String] =
    value match
      case G_NUMBER_PARSER_ERROR_INVALID => Some("G_NUMBER_PARSER_ERROR_INVALID")
      case G_NUMBER_PARSER_ERROR_OUT_OF_BOUNDS => Some("G_NUMBER_PARSER_ERROR_OUT_OF_BOUNDS")
      case _ => None
  extension (a: GNumberParserError)
    inline def &(b: GNumberParserError): GNumberParserError = a & b
    inline def |(b: GNumberParserError): GNumberParserError = a | b
    inline def is(b: GNumberParserError): Boolean = (a & b) == b

opaque type GOnceStatus = CUnsignedInt
object GOnceStatus extends CEnumU[GOnceStatus]:
  given _tag: Tag[GOnceStatus] = Tag.UInt
  inline def define(inline a: Long): GOnceStatus = a.toUInt
  val G_ONCE_STATUS_NOTCALLED = define(0)
  val G_ONCE_STATUS_PROGRESS = define(1)
  val G_ONCE_STATUS_READY = define(2)
  inline def getName(inline value: GOnceStatus): Option[String] =
    value match
      case G_ONCE_STATUS_NOTCALLED => Some("G_ONCE_STATUS_NOTCALLED")
      case G_ONCE_STATUS_PROGRESS => Some("G_ONCE_STATUS_PROGRESS")
      case G_ONCE_STATUS_READY => Some("G_ONCE_STATUS_READY")
      case _ => None
  extension (a: GOnceStatus)
    inline def &(b: GOnceStatus): GOnceStatus = a & b
    inline def |(b: GOnceStatus): GOnceStatus = a | b
    inline def is(b: GOnceStatus): Boolean = (a & b) == b

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
    value match
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

opaque type GOptionError = CUnsignedInt
object GOptionError extends CEnumU[GOptionError]:
  given _tag: Tag[GOptionError] = Tag.UInt
  inline def define(inline a: Long): GOptionError = a.toUInt
  val G_OPTION_ERROR_UNKNOWN_OPTION = define(0)
  val G_OPTION_ERROR_BAD_VALUE = define(1)
  val G_OPTION_ERROR_FAILED = define(2)
  inline def getName(inline value: GOptionError): Option[String] =
    value match
      case G_OPTION_ERROR_UNKNOWN_OPTION => Some("G_OPTION_ERROR_UNKNOWN_OPTION")
      case G_OPTION_ERROR_BAD_VALUE => Some("G_OPTION_ERROR_BAD_VALUE")
      case G_OPTION_ERROR_FAILED => Some("G_OPTION_ERROR_FAILED")
      case _ => None
  extension (a: GOptionError)
    inline def &(b: GOptionError): GOptionError = a & b
    inline def |(b: GOptionError): GOptionError = a | b
    inline def is(b: GOptionError): Boolean = (a & b) == b

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
    value match
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

opaque type GOutputStreamSpliceFlags = CUnsignedInt
object GOutputStreamSpliceFlags extends CEnumU[GOutputStreamSpliceFlags]:
  given _tag: Tag[GOutputStreamSpliceFlags] = Tag.UInt
  inline def define(inline a: Long): GOutputStreamSpliceFlags = a.toUInt
  val G_OUTPUT_STREAM_SPLICE_NONE = define(0)
  val G_OUTPUT_STREAM_SPLICE_CLOSE_SOURCE = define(1)
  val G_OUTPUT_STREAM_SPLICE_CLOSE_TARGET = define(2)
  inline def getName(inline value: GOutputStreamSpliceFlags): Option[String] =
    value match
      case G_OUTPUT_STREAM_SPLICE_NONE => Some("G_OUTPUT_STREAM_SPLICE_NONE")
      case G_OUTPUT_STREAM_SPLICE_CLOSE_SOURCE => Some("G_OUTPUT_STREAM_SPLICE_CLOSE_SOURCE")
      case G_OUTPUT_STREAM_SPLICE_CLOSE_TARGET => Some("G_OUTPUT_STREAM_SPLICE_CLOSE_TARGET")
      case _ => None
  extension (a: GOutputStreamSpliceFlags)
    inline def &(b: GOutputStreamSpliceFlags): GOutputStreamSpliceFlags = a & b
    inline def |(b: GOutputStreamSpliceFlags): GOutputStreamSpliceFlags = a | b
    inline def is(b: GOutputStreamSpliceFlags): Boolean = (a & b) == b

opaque type GParamFlags = CInt
object GParamFlags extends CEnum[GParamFlags]:
  given _tag: Tag[GParamFlags] = Tag.Int
  inline def define(inline a: CInt): GParamFlags = a
  val G_PARAM_READABLE = define(1)
  val G_PARAM_WRITABLE = define(2)
  val G_PARAM_READWRITE = define(3)
  val G_PARAM_CONSTRUCT = define(4)
  val G_PARAM_CONSTRUCT_ONLY = define(8)
  val G_PARAM_LAX_VALIDATION = define(16)
  val G_PARAM_STATIC_NAME = define(32)
  val G_PARAM_PRIVATE = define(32)
  val G_PARAM_STATIC_NICK = define(64)
  val G_PARAM_STATIC_BLURB = define(128)
  val G_PARAM_EXPLICIT_NOTIFY = define(1073741824)
  val G_PARAM_DEPRECATED = define(-2147483648)
  inline def getName(inline value: GParamFlags): Option[String] =
    value match
      case G_PARAM_READABLE => Some("G_PARAM_READABLE")
      case G_PARAM_WRITABLE => Some("G_PARAM_WRITABLE")
      case G_PARAM_READWRITE => Some("G_PARAM_READWRITE")
      case G_PARAM_CONSTRUCT => Some("G_PARAM_CONSTRUCT")
      case G_PARAM_CONSTRUCT_ONLY => Some("G_PARAM_CONSTRUCT_ONLY")
      case G_PARAM_LAX_VALIDATION => Some("G_PARAM_LAX_VALIDATION")
      case G_PARAM_STATIC_NAME => Some("G_PARAM_STATIC_NAME")
      case G_PARAM_PRIVATE => Some("G_PARAM_PRIVATE")
      case G_PARAM_STATIC_NICK => Some("G_PARAM_STATIC_NICK")
      case G_PARAM_STATIC_BLURB => Some("G_PARAM_STATIC_BLURB")
      case G_PARAM_EXPLICIT_NOTIFY => Some("G_PARAM_EXPLICIT_NOTIFY")
      case G_PARAM_DEPRECATED => Some("G_PARAM_DEPRECATED")
      case _ => None
  extension (a: GParamFlags)
    inline def &(b: GParamFlags): GParamFlags = a & b
    inline def |(b: GParamFlags): GParamFlags = a | b
    inline def is(b: GParamFlags): Boolean = (a & b) == b

opaque type GPasswordSave = CUnsignedInt
object GPasswordSave extends CEnumU[GPasswordSave]:
  given _tag: Tag[GPasswordSave] = Tag.UInt
  inline def define(inline a: Long): GPasswordSave = a.toUInt
  val G_PASSWORD_SAVE_NEVER = define(0)
  val G_PASSWORD_SAVE_FOR_SESSION = define(1)
  val G_PASSWORD_SAVE_PERMANENTLY = define(2)
  inline def getName(inline value: GPasswordSave): Option[String] =
    value match
      case G_PASSWORD_SAVE_NEVER => Some("G_PASSWORD_SAVE_NEVER")
      case G_PASSWORD_SAVE_FOR_SESSION => Some("G_PASSWORD_SAVE_FOR_SESSION")
      case G_PASSWORD_SAVE_PERMANENTLY => Some("G_PASSWORD_SAVE_PERMANENTLY")
      case _ => None
  extension (a: GPasswordSave)
    inline def &(b: GPasswordSave): GPasswordSave = a & b
    inline def |(b: GPasswordSave): GPasswordSave = a | b
    inline def is(b: GPasswordSave): Boolean = (a & b) == b

opaque type GPollableReturn = CInt
object GPollableReturn extends CEnum[GPollableReturn]:
  given _tag: Tag[GPollableReturn] = Tag.Int
  inline def define(inline a: CInt): GPollableReturn = a
  val G_POLLABLE_RETURN_FAILED = define(0)
  val G_POLLABLE_RETURN_OK = define(1)
  val G_POLLABLE_RETURN_WOULD_BLOCK = define(-27)
  inline def getName(inline value: GPollableReturn): Option[String] =
    value match
      case G_POLLABLE_RETURN_FAILED => Some("G_POLLABLE_RETURN_FAILED")
      case G_POLLABLE_RETURN_OK => Some("G_POLLABLE_RETURN_OK")
      case G_POLLABLE_RETURN_WOULD_BLOCK => Some("G_POLLABLE_RETURN_WOULD_BLOCK")
      case _ => None
  extension (a: GPollableReturn)
    inline def &(b: GPollableReturn): GPollableReturn = a & b
    inline def |(b: GPollableReturn): GPollableReturn = a | b
    inline def is(b: GPollableReturn): Boolean = (a & b) == b

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
    value match
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
    value match
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
    value match
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

opaque type GResolverError = CUnsignedInt
object GResolverError extends CEnumU[GResolverError]:
  given _tag: Tag[GResolverError] = Tag.UInt
  inline def define(inline a: Long): GResolverError = a.toUInt
  val G_RESOLVER_ERROR_NOT_FOUND = define(0)
  val G_RESOLVER_ERROR_TEMPORARY_FAILURE = define(1)
  val G_RESOLVER_ERROR_INTERNAL = define(2)
  inline def getName(inline value: GResolverError): Option[String] =
    value match
      case G_RESOLVER_ERROR_NOT_FOUND => Some("G_RESOLVER_ERROR_NOT_FOUND")
      case G_RESOLVER_ERROR_TEMPORARY_FAILURE => Some("G_RESOLVER_ERROR_TEMPORARY_FAILURE")
      case G_RESOLVER_ERROR_INTERNAL => Some("G_RESOLVER_ERROR_INTERNAL")
      case _ => None
  extension (a: GResolverError)
    inline def &(b: GResolverError): GResolverError = a & b
    inline def |(b: GResolverError): GResolverError = a | b
    inline def is(b: GResolverError): Boolean = (a & b) == b

opaque type GResolverNameLookupFlags = CUnsignedInt
object GResolverNameLookupFlags extends CEnumU[GResolverNameLookupFlags]:
  given _tag: Tag[GResolverNameLookupFlags] = Tag.UInt
  inline def define(inline a: Long): GResolverNameLookupFlags = a.toUInt
  val G_RESOLVER_NAME_LOOKUP_FLAGS_DEFAULT = define(0)
  val G_RESOLVER_NAME_LOOKUP_FLAGS_IPV4_ONLY = define(1)
  val G_RESOLVER_NAME_LOOKUP_FLAGS_IPV6_ONLY = define(2)
  inline def getName(inline value: GResolverNameLookupFlags): Option[String] =
    value match
      case G_RESOLVER_NAME_LOOKUP_FLAGS_DEFAULT => Some("G_RESOLVER_NAME_LOOKUP_FLAGS_DEFAULT")
      case G_RESOLVER_NAME_LOOKUP_FLAGS_IPV4_ONLY => Some("G_RESOLVER_NAME_LOOKUP_FLAGS_IPV4_ONLY")
      case G_RESOLVER_NAME_LOOKUP_FLAGS_IPV6_ONLY => Some("G_RESOLVER_NAME_LOOKUP_FLAGS_IPV6_ONLY")
      case _ => None
  extension (a: GResolverNameLookupFlags)
    inline def &(b: GResolverNameLookupFlags): GResolverNameLookupFlags = a & b
    inline def |(b: GResolverNameLookupFlags): GResolverNameLookupFlags = a | b
    inline def is(b: GResolverNameLookupFlags): Boolean = (a & b) == b

opaque type GResolverRecordType = CUnsignedInt
object GResolverRecordType extends CEnumU[GResolverRecordType]:
  given _tag: Tag[GResolverRecordType] = Tag.UInt
  inline def define(inline a: Long): GResolverRecordType = a.toUInt
  val G_RESOLVER_RECORD_SRV = define(1)
  val G_RESOLVER_RECORD_MX = define(2)
  val G_RESOLVER_RECORD_TXT = define(3)
  val G_RESOLVER_RECORD_SOA = define(4)
  val G_RESOLVER_RECORD_NS = define(5)
  inline def getName(inline value: GResolverRecordType): Option[String] =
    value match
      case G_RESOLVER_RECORD_SRV => Some("G_RESOLVER_RECORD_SRV")
      case G_RESOLVER_RECORD_MX => Some("G_RESOLVER_RECORD_MX")
      case G_RESOLVER_RECORD_TXT => Some("G_RESOLVER_RECORD_TXT")
      case G_RESOLVER_RECORD_SOA => Some("G_RESOLVER_RECORD_SOA")
      case G_RESOLVER_RECORD_NS => Some("G_RESOLVER_RECORD_NS")
      case _ => None
  extension (a: GResolverRecordType)
    inline def &(b: GResolverRecordType): GResolverRecordType = a & b
    inline def |(b: GResolverRecordType): GResolverRecordType = a | b
    inline def is(b: GResolverRecordType): Boolean = (a & b) == b

opaque type GResourceError = CUnsignedInt
object GResourceError extends CEnumU[GResourceError]:
  given _tag: Tag[GResourceError] = Tag.UInt
  inline def define(inline a: Long): GResourceError = a.toUInt
  val G_RESOURCE_ERROR_NOT_FOUND = define(0)
  val G_RESOURCE_ERROR_INTERNAL = define(1)
  inline def getName(inline value: GResourceError): Option[String] =
    value match
      case G_RESOURCE_ERROR_NOT_FOUND => Some("G_RESOURCE_ERROR_NOT_FOUND")
      case G_RESOURCE_ERROR_INTERNAL => Some("G_RESOURCE_ERROR_INTERNAL")
      case _ => None
  extension (a: GResourceError)
    inline def &(b: GResourceError): GResourceError = a & b
    inline def |(b: GResourceError): GResourceError = a | b
    inline def is(b: GResourceError): Boolean = (a & b) == b

opaque type GResourceFlags = CUnsignedInt
object GResourceFlags extends CEnumU[GResourceFlags]:
  given _tag: Tag[GResourceFlags] = Tag.UInt
  inline def define(inline a: Long): GResourceFlags = a.toUInt
  val G_RESOURCE_FLAGS_NONE = define(0)
  val G_RESOURCE_FLAGS_COMPRESSED = define(1)
  inline def getName(inline value: GResourceFlags): Option[String] =
    value match
      case G_RESOURCE_FLAGS_NONE => Some("G_RESOURCE_FLAGS_NONE")
      case G_RESOURCE_FLAGS_COMPRESSED => Some("G_RESOURCE_FLAGS_COMPRESSED")
      case _ => None
  extension (a: GResourceFlags)
    inline def &(b: GResourceFlags): GResourceFlags = a & b
    inline def |(b: GResourceFlags): GResourceFlags = a | b
    inline def is(b: GResourceFlags): Boolean = (a & b) == b

opaque type GResourceLookupFlags = CUnsignedInt
object GResourceLookupFlags extends CEnumU[GResourceLookupFlags]:
  given _tag: Tag[GResourceLookupFlags] = Tag.UInt
  inline def define(inline a: Long): GResourceLookupFlags = a.toUInt
  val G_RESOURCE_LOOKUP_FLAGS_NONE = define(0)
  inline def getName(inline value: GResourceLookupFlags): Option[String] =
    value match
      case G_RESOURCE_LOOKUP_FLAGS_NONE => Some("G_RESOURCE_LOOKUP_FLAGS_NONE")
      case _ => None
  extension (a: GResourceLookupFlags)
    inline def &(b: GResourceLookupFlags): GResourceLookupFlags = a & b
    inline def |(b: GResourceLookupFlags): GResourceLookupFlags = a | b
    inline def is(b: GResourceLookupFlags): Boolean = (a & b) == b

opaque type GSeekType = CUnsignedInt
object GSeekType extends CEnumU[GSeekType]:
  given _tag: Tag[GSeekType] = Tag.UInt
  inline def define(inline a: Long): GSeekType = a.toUInt
  val G_SEEK_CUR = define(0)
  val G_SEEK_SET = define(1)
  val G_SEEK_END = define(2)
  inline def getName(inline value: GSeekType): Option[String] =
    value match
      case G_SEEK_CUR => Some("G_SEEK_CUR")
      case G_SEEK_SET => Some("G_SEEK_SET")
      case G_SEEK_END => Some("G_SEEK_END")
      case _ => None
  extension (a: GSeekType)
    inline def &(b: GSeekType): GSeekType = a & b
    inline def |(b: GSeekType): GSeekType = a | b
    inline def is(b: GSeekType): Boolean = (a & b) == b

opaque type GSettingsBindFlags = CUnsignedInt
object GSettingsBindFlags extends CEnumU[GSettingsBindFlags]:
  given _tag: Tag[GSettingsBindFlags] = Tag.UInt
  inline def define(inline a: Long): GSettingsBindFlags = a.toUInt
  val G_SETTINGS_BIND_DEFAULT = define(0)
  val G_SETTINGS_BIND_GET = define(1)
  val G_SETTINGS_BIND_SET = define(2)
  val G_SETTINGS_BIND_NO_SENSITIVITY = define(4)
  val G_SETTINGS_BIND_GET_NO_CHANGES = define(8)
  val G_SETTINGS_BIND_INVERT_BOOLEAN = define(16)
  inline def getName(inline value: GSettingsBindFlags): Option[String] =
    value match
      case G_SETTINGS_BIND_DEFAULT => Some("G_SETTINGS_BIND_DEFAULT")
      case G_SETTINGS_BIND_GET => Some("G_SETTINGS_BIND_GET")
      case G_SETTINGS_BIND_SET => Some("G_SETTINGS_BIND_SET")
      case G_SETTINGS_BIND_NO_SENSITIVITY => Some("G_SETTINGS_BIND_NO_SENSITIVITY")
      case G_SETTINGS_BIND_GET_NO_CHANGES => Some("G_SETTINGS_BIND_GET_NO_CHANGES")
      case G_SETTINGS_BIND_INVERT_BOOLEAN => Some("G_SETTINGS_BIND_INVERT_BOOLEAN")
      case _ => None
  extension (a: GSettingsBindFlags)
    inline def &(b: GSettingsBindFlags): GSettingsBindFlags = a & b
    inline def |(b: GSettingsBindFlags): GSettingsBindFlags = a | b
    inline def is(b: GSettingsBindFlags): Boolean = (a & b) == b

opaque type GShellError = CUnsignedInt
object GShellError extends CEnumU[GShellError]:
  given _tag: Tag[GShellError] = Tag.UInt
  inline def define(inline a: Long): GShellError = a.toUInt
  val G_SHELL_ERROR_BAD_QUOTING = define(0)
  val G_SHELL_ERROR_EMPTY_STRING = define(1)
  val G_SHELL_ERROR_FAILED = define(2)
  inline def getName(inline value: GShellError): Option[String] =
    value match
      case G_SHELL_ERROR_BAD_QUOTING => Some("G_SHELL_ERROR_BAD_QUOTING")
      case G_SHELL_ERROR_EMPTY_STRING => Some("G_SHELL_ERROR_EMPTY_STRING")
      case G_SHELL_ERROR_FAILED => Some("G_SHELL_ERROR_FAILED")
      case _ => None
  extension (a: GShellError)
    inline def &(b: GShellError): GShellError = a & b
    inline def |(b: GShellError): GShellError = a | b
    inline def is(b: GShellError): Boolean = (a & b) == b

opaque type GSignalFlags = CUnsignedInt
object GSignalFlags extends CEnumU[GSignalFlags]:
  given _tag: Tag[GSignalFlags] = Tag.UInt
  inline def define(inline a: Long): GSignalFlags = a.toUInt
  val G_SIGNAL_RUN_FIRST = define(1)
  val G_SIGNAL_RUN_LAST = define(2)
  val G_SIGNAL_RUN_CLEANUP = define(4)
  val G_SIGNAL_NO_RECURSE = define(8)
  val G_SIGNAL_DETAILED = define(16)
  val G_SIGNAL_ACTION = define(32)
  val G_SIGNAL_NO_HOOKS = define(64)
  val G_SIGNAL_MUST_COLLECT = define(128)
  val G_SIGNAL_DEPRECATED = define(256)
  val G_SIGNAL_ACCUMULATOR_FIRST_RUN = define(131072)
  inline def getName(inline value: GSignalFlags): Option[String] =
    value match
      case G_SIGNAL_RUN_FIRST => Some("G_SIGNAL_RUN_FIRST")
      case G_SIGNAL_RUN_LAST => Some("G_SIGNAL_RUN_LAST")
      case G_SIGNAL_RUN_CLEANUP => Some("G_SIGNAL_RUN_CLEANUP")
      case G_SIGNAL_NO_RECURSE => Some("G_SIGNAL_NO_RECURSE")
      case G_SIGNAL_DETAILED => Some("G_SIGNAL_DETAILED")
      case G_SIGNAL_ACTION => Some("G_SIGNAL_ACTION")
      case G_SIGNAL_NO_HOOKS => Some("G_SIGNAL_NO_HOOKS")
      case G_SIGNAL_MUST_COLLECT => Some("G_SIGNAL_MUST_COLLECT")
      case G_SIGNAL_DEPRECATED => Some("G_SIGNAL_DEPRECATED")
      case G_SIGNAL_ACCUMULATOR_FIRST_RUN => Some("G_SIGNAL_ACCUMULATOR_FIRST_RUN")
      case _ => None
  extension (a: GSignalFlags)
    inline def &(b: GSignalFlags): GSignalFlags = a & b
    inline def |(b: GSignalFlags): GSignalFlags = a | b
    inline def is(b: GSignalFlags): Boolean = (a & b) == b

opaque type GSignalMatchType = CUnsignedInt
object GSignalMatchType extends CEnumU[GSignalMatchType]:
  given _tag: Tag[GSignalMatchType] = Tag.UInt
  inline def define(inline a: Long): GSignalMatchType = a.toUInt
  val G_SIGNAL_MATCH_ID = define(1)
  val G_SIGNAL_MATCH_DETAIL = define(2)
  val G_SIGNAL_MATCH_CLOSURE = define(4)
  val G_SIGNAL_MATCH_FUNC = define(8)
  val G_SIGNAL_MATCH_DATA = define(16)
  val G_SIGNAL_MATCH_UNBLOCKED = define(32)
  inline def getName(inline value: GSignalMatchType): Option[String] =
    value match
      case G_SIGNAL_MATCH_ID => Some("G_SIGNAL_MATCH_ID")
      case G_SIGNAL_MATCH_DETAIL => Some("G_SIGNAL_MATCH_DETAIL")
      case G_SIGNAL_MATCH_CLOSURE => Some("G_SIGNAL_MATCH_CLOSURE")
      case G_SIGNAL_MATCH_FUNC => Some("G_SIGNAL_MATCH_FUNC")
      case G_SIGNAL_MATCH_DATA => Some("G_SIGNAL_MATCH_DATA")
      case G_SIGNAL_MATCH_UNBLOCKED => Some("G_SIGNAL_MATCH_UNBLOCKED")
      case _ => None
  extension (a: GSignalMatchType)
    inline def &(b: GSignalMatchType): GSignalMatchType = a & b
    inline def |(b: GSignalMatchType): GSignalMatchType = a | b
    inline def is(b: GSignalMatchType): Boolean = (a & b) == b

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
    value match
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

opaque type GSocketClientEvent = CUnsignedInt
object GSocketClientEvent extends CEnumU[GSocketClientEvent]:
  given _tag: Tag[GSocketClientEvent] = Tag.UInt
  inline def define(inline a: Long): GSocketClientEvent = a.toUInt
  val G_SOCKET_CLIENT_RESOLVING = define(0)
  val G_SOCKET_CLIENT_RESOLVED = define(1)
  val G_SOCKET_CLIENT_CONNECTING = define(2)
  val G_SOCKET_CLIENT_CONNECTED = define(3)
  val G_SOCKET_CLIENT_PROXY_NEGOTIATING = define(4)
  val G_SOCKET_CLIENT_PROXY_NEGOTIATED = define(5)
  val G_SOCKET_CLIENT_TLS_HANDSHAKING = define(6)
  val G_SOCKET_CLIENT_TLS_HANDSHAKED = define(7)
  val G_SOCKET_CLIENT_COMPLETE = define(8)
  inline def getName(inline value: GSocketClientEvent): Option[String] =
    value match
      case G_SOCKET_CLIENT_RESOLVING => Some("G_SOCKET_CLIENT_RESOLVING")
      case G_SOCKET_CLIENT_RESOLVED => Some("G_SOCKET_CLIENT_RESOLVED")
      case G_SOCKET_CLIENT_CONNECTING => Some("G_SOCKET_CLIENT_CONNECTING")
      case G_SOCKET_CLIENT_CONNECTED => Some("G_SOCKET_CLIENT_CONNECTED")
      case G_SOCKET_CLIENT_PROXY_NEGOTIATING => Some("G_SOCKET_CLIENT_PROXY_NEGOTIATING")
      case G_SOCKET_CLIENT_PROXY_NEGOTIATED => Some("G_SOCKET_CLIENT_PROXY_NEGOTIATED")
      case G_SOCKET_CLIENT_TLS_HANDSHAKING => Some("G_SOCKET_CLIENT_TLS_HANDSHAKING")
      case G_SOCKET_CLIENT_TLS_HANDSHAKED => Some("G_SOCKET_CLIENT_TLS_HANDSHAKED")
      case G_SOCKET_CLIENT_COMPLETE => Some("G_SOCKET_CLIENT_COMPLETE")
      case _ => None
  extension (a: GSocketClientEvent)
    inline def &(b: GSocketClientEvent): GSocketClientEvent = a & b
    inline def |(b: GSocketClientEvent): GSocketClientEvent = a | b
    inline def is(b: GSocketClientEvent): Boolean = (a & b) == b

opaque type GSocketFamily = CUnsignedInt
object GSocketFamily extends CEnumU[GSocketFamily]:
  given _tag: Tag[GSocketFamily] = Tag.UInt
  inline def define(inline a: Long): GSocketFamily = a.toUInt
  val G_SOCKET_FAMILY_INVALID = define(0)
  val G_SOCKET_FAMILY_UNIX = define(1)
  val G_SOCKET_FAMILY_IPV4 = define(2)
  val G_SOCKET_FAMILY_IPV6 = define(10)
  inline def getName(inline value: GSocketFamily): Option[String] =
    value match
      case G_SOCKET_FAMILY_INVALID => Some("G_SOCKET_FAMILY_INVALID")
      case G_SOCKET_FAMILY_UNIX => Some("G_SOCKET_FAMILY_UNIX")
      case G_SOCKET_FAMILY_IPV4 => Some("G_SOCKET_FAMILY_IPV4")
      case G_SOCKET_FAMILY_IPV6 => Some("G_SOCKET_FAMILY_IPV6")
      case _ => None
  extension (a: GSocketFamily)
    inline def &(b: GSocketFamily): GSocketFamily = a & b
    inline def |(b: GSocketFamily): GSocketFamily = a | b
    inline def is(b: GSocketFamily): Boolean = (a & b) == b

opaque type GSocketListenerEvent = CUnsignedInt
object GSocketListenerEvent extends CEnumU[GSocketListenerEvent]:
  given _tag: Tag[GSocketListenerEvent] = Tag.UInt
  inline def define(inline a: Long): GSocketListenerEvent = a.toUInt
  val G_SOCKET_LISTENER_BINDING = define(0)
  val G_SOCKET_LISTENER_BOUND = define(1)
  val G_SOCKET_LISTENER_LISTENING = define(2)
  val G_SOCKET_LISTENER_LISTENED = define(3)
  inline def getName(inline value: GSocketListenerEvent): Option[String] =
    value match
      case G_SOCKET_LISTENER_BINDING => Some("G_SOCKET_LISTENER_BINDING")
      case G_SOCKET_LISTENER_BOUND => Some("G_SOCKET_LISTENER_BOUND")
      case G_SOCKET_LISTENER_LISTENING => Some("G_SOCKET_LISTENER_LISTENING")
      case G_SOCKET_LISTENER_LISTENED => Some("G_SOCKET_LISTENER_LISTENED")
      case _ => None
  extension (a: GSocketListenerEvent)
    inline def &(b: GSocketListenerEvent): GSocketListenerEvent = a & b
    inline def |(b: GSocketListenerEvent): GSocketListenerEvent = a | b
    inline def is(b: GSocketListenerEvent): Boolean = (a & b) == b

opaque type GSocketMsgFlags = CUnsignedInt
object GSocketMsgFlags extends CEnumU[GSocketMsgFlags]:
  given _tag: Tag[GSocketMsgFlags] = Tag.UInt
  inline def define(inline a: Long): GSocketMsgFlags = a.toUInt
  val G_SOCKET_MSG_NONE = define(0)
  val G_SOCKET_MSG_OOB = define(1)
  val G_SOCKET_MSG_PEEK = define(2)
  val G_SOCKET_MSG_DONTROUTE = define(4)
  inline def getName(inline value: GSocketMsgFlags): Option[String] =
    value match
      case G_SOCKET_MSG_NONE => Some("G_SOCKET_MSG_NONE")
      case G_SOCKET_MSG_OOB => Some("G_SOCKET_MSG_OOB")
      case G_SOCKET_MSG_PEEK => Some("G_SOCKET_MSG_PEEK")
      case G_SOCKET_MSG_DONTROUTE => Some("G_SOCKET_MSG_DONTROUTE")
      case _ => None
  extension (a: GSocketMsgFlags)
    inline def &(b: GSocketMsgFlags): GSocketMsgFlags = a & b
    inline def |(b: GSocketMsgFlags): GSocketMsgFlags = a | b
    inline def is(b: GSocketMsgFlags): Boolean = (a & b) == b

opaque type GSocketProtocol = CInt
object GSocketProtocol extends CEnum[GSocketProtocol]:
  given _tag: Tag[GSocketProtocol] = Tag.Int
  inline def define(inline a: CInt): GSocketProtocol = a
  val G_SOCKET_PROTOCOL_UNKNOWN = define(-1)
  val G_SOCKET_PROTOCOL_DEFAULT = define(0)
  val G_SOCKET_PROTOCOL_TCP = define(6)
  val G_SOCKET_PROTOCOL_UDP = define(17)
  val G_SOCKET_PROTOCOL_SCTP = define(132)
  inline def getName(inline value: GSocketProtocol): Option[String] =
    value match
      case G_SOCKET_PROTOCOL_UNKNOWN => Some("G_SOCKET_PROTOCOL_UNKNOWN")
      case G_SOCKET_PROTOCOL_DEFAULT => Some("G_SOCKET_PROTOCOL_DEFAULT")
      case G_SOCKET_PROTOCOL_TCP => Some("G_SOCKET_PROTOCOL_TCP")
      case G_SOCKET_PROTOCOL_UDP => Some("G_SOCKET_PROTOCOL_UDP")
      case G_SOCKET_PROTOCOL_SCTP => Some("G_SOCKET_PROTOCOL_SCTP")
      case _ => None
  extension (a: GSocketProtocol)
    inline def &(b: GSocketProtocol): GSocketProtocol = a & b
    inline def |(b: GSocketProtocol): GSocketProtocol = a | b
    inline def is(b: GSocketProtocol): Boolean = (a & b) == b

opaque type GSocketType = CUnsignedInt
object GSocketType extends CEnumU[GSocketType]:
  given _tag: Tag[GSocketType] = Tag.UInt
  inline def define(inline a: Long): GSocketType = a.toUInt
  val G_SOCKET_TYPE_INVALID = define(0)
  val G_SOCKET_TYPE_STREAM = define(1)
  val G_SOCKET_TYPE_DATAGRAM = define(2)
  val G_SOCKET_TYPE_SEQPACKET = define(3)
  inline def getName(inline value: GSocketType): Option[String] =
    value match
      case G_SOCKET_TYPE_INVALID => Some("G_SOCKET_TYPE_INVALID")
      case G_SOCKET_TYPE_STREAM => Some("G_SOCKET_TYPE_STREAM")
      case G_SOCKET_TYPE_DATAGRAM => Some("G_SOCKET_TYPE_DATAGRAM")
      case G_SOCKET_TYPE_SEQPACKET => Some("G_SOCKET_TYPE_SEQPACKET")
      case _ => None
  extension (a: GSocketType)
    inline def &(b: GSocketType): GSocketType = a & b
    inline def |(b: GSocketType): GSocketType = a | b
    inline def is(b: GSocketType): Boolean = (a & b) == b

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
    value match
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
    value match
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

opaque type GSubprocessFlags = CUnsignedInt
object GSubprocessFlags extends CEnumU[GSubprocessFlags]:
  given _tag: Tag[GSubprocessFlags] = Tag.UInt
  inline def define(inline a: Long): GSubprocessFlags = a.toUInt
  val G_SUBPROCESS_FLAGS_NONE = define(0)
  val G_SUBPROCESS_FLAGS_STDIN_PIPE = define(1)
  val G_SUBPROCESS_FLAGS_STDIN_INHERIT = define(2)
  val G_SUBPROCESS_FLAGS_STDOUT_PIPE = define(4)
  val G_SUBPROCESS_FLAGS_STDOUT_SILENCE = define(8)
  val G_SUBPROCESS_FLAGS_STDERR_PIPE = define(16)
  val G_SUBPROCESS_FLAGS_STDERR_SILENCE = define(32)
  val G_SUBPROCESS_FLAGS_STDERR_MERGE = define(64)
  val G_SUBPROCESS_FLAGS_INHERIT_FDS = define(128)
  val G_SUBPROCESS_FLAGS_SEARCH_PATH_FROM_ENVP = define(256)
  inline def getName(inline value: GSubprocessFlags): Option[String] =
    value match
      case G_SUBPROCESS_FLAGS_NONE => Some("G_SUBPROCESS_FLAGS_NONE")
      case G_SUBPROCESS_FLAGS_STDIN_PIPE => Some("G_SUBPROCESS_FLAGS_STDIN_PIPE")
      case G_SUBPROCESS_FLAGS_STDIN_INHERIT => Some("G_SUBPROCESS_FLAGS_STDIN_INHERIT")
      case G_SUBPROCESS_FLAGS_STDOUT_PIPE => Some("G_SUBPROCESS_FLAGS_STDOUT_PIPE")
      case G_SUBPROCESS_FLAGS_STDOUT_SILENCE => Some("G_SUBPROCESS_FLAGS_STDOUT_SILENCE")
      case G_SUBPROCESS_FLAGS_STDERR_PIPE => Some("G_SUBPROCESS_FLAGS_STDERR_PIPE")
      case G_SUBPROCESS_FLAGS_STDERR_SILENCE => Some("G_SUBPROCESS_FLAGS_STDERR_SILENCE")
      case G_SUBPROCESS_FLAGS_STDERR_MERGE => Some("G_SUBPROCESS_FLAGS_STDERR_MERGE")
      case G_SUBPROCESS_FLAGS_INHERIT_FDS => Some("G_SUBPROCESS_FLAGS_INHERIT_FDS")
      case G_SUBPROCESS_FLAGS_SEARCH_PATH_FROM_ENVP => Some("G_SUBPROCESS_FLAGS_SEARCH_PATH_FROM_ENVP")
      case _ => None
  extension (a: GSubprocessFlags)
    inline def &(b: GSubprocessFlags): GSubprocessFlags = a & b
    inline def |(b: GSubprocessFlags): GSubprocessFlags = a | b
    inline def is(b: GSubprocessFlags): Boolean = (a & b) == b

opaque type GTestDBusFlags = CUnsignedInt
object GTestDBusFlags extends CEnumU[GTestDBusFlags]:
  given _tag: Tag[GTestDBusFlags] = Tag.UInt
  inline def define(inline a: Long): GTestDBusFlags = a.toUInt
  val G_TEST_DBUS_NONE = define(0)
  inline def getName(inline value: GTestDBusFlags): Option[String] =
    value match
      case G_TEST_DBUS_NONE => Some("G_TEST_DBUS_NONE")
      case _ => None
  extension (a: GTestDBusFlags)
    inline def &(b: GTestDBusFlags): GTestDBusFlags = a & b
    inline def |(b: GTestDBusFlags): GTestDBusFlags = a | b
    inline def is(b: GTestDBusFlags): Boolean = (a & b) == b

opaque type GTestFileType = CUnsignedInt
object GTestFileType extends CEnumU[GTestFileType]:
  given _tag: Tag[GTestFileType] = Tag.UInt
  inline def define(inline a: Long): GTestFileType = a.toUInt
  val G_TEST_DIST = define(0)
  val G_TEST_BUILT = define(1)
  inline def getName(inline value: GTestFileType): Option[String] =
    value match
      case G_TEST_DIST => Some("G_TEST_DIST")
      case G_TEST_BUILT => Some("G_TEST_BUILT")
      case _ => None
  extension (a: GTestFileType)
    inline def &(b: GTestFileType): GTestFileType = a & b
    inline def |(b: GTestFileType): GTestFileType = a | b
    inline def is(b: GTestFileType): Boolean = (a & b) == b

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
    value match
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

opaque type GTestResult = CUnsignedInt
object GTestResult extends CEnumU[GTestResult]:
  given _tag: Tag[GTestResult] = Tag.UInt
  inline def define(inline a: Long): GTestResult = a.toUInt
  val G_TEST_RUN_SUCCESS = define(0)
  val G_TEST_RUN_SKIPPED = define(1)
  val G_TEST_RUN_FAILURE = define(2)
  val G_TEST_RUN_INCOMPLETE = define(3)
  inline def getName(inline value: GTestResult): Option[String] =
    value match
      case G_TEST_RUN_SUCCESS => Some("G_TEST_RUN_SUCCESS")
      case G_TEST_RUN_SKIPPED => Some("G_TEST_RUN_SKIPPED")
      case G_TEST_RUN_FAILURE => Some("G_TEST_RUN_FAILURE")
      case G_TEST_RUN_INCOMPLETE => Some("G_TEST_RUN_INCOMPLETE")
      case _ => None
  extension (a: GTestResult)
    inline def &(b: GTestResult): GTestResult = a & b
    inline def |(b: GTestResult): GTestResult = a | b
    inline def is(b: GTestResult): Boolean = (a & b) == b

opaque type GTestSubprocessFlags = CUnsignedInt
object GTestSubprocessFlags extends CEnumU[GTestSubprocessFlags]:
  given _tag: Tag[GTestSubprocessFlags] = Tag.UInt
  inline def define(inline a: Long): GTestSubprocessFlags = a.toUInt
  val G_TEST_SUBPROCESS_INHERIT_STDIN = define(1)
  val G_TEST_SUBPROCESS_INHERIT_STDOUT = define(2)
  val G_TEST_SUBPROCESS_INHERIT_STDERR = define(4)
  inline def getName(inline value: GTestSubprocessFlags): Option[String] =
    value match
      case G_TEST_SUBPROCESS_INHERIT_STDIN => Some("G_TEST_SUBPROCESS_INHERIT_STDIN")
      case G_TEST_SUBPROCESS_INHERIT_STDOUT => Some("G_TEST_SUBPROCESS_INHERIT_STDOUT")
      case G_TEST_SUBPROCESS_INHERIT_STDERR => Some("G_TEST_SUBPROCESS_INHERIT_STDERR")
      case _ => None
  extension (a: GTestSubprocessFlags)
    inline def &(b: GTestSubprocessFlags): GTestSubprocessFlags = a & b
    inline def |(b: GTestSubprocessFlags): GTestSubprocessFlags = a | b
    inline def is(b: GTestSubprocessFlags): Boolean = (a & b) == b

opaque type GTestTrapFlags = CUnsignedInt
object GTestTrapFlags extends CEnumU[GTestTrapFlags]:
  given _tag: Tag[GTestTrapFlags] = Tag.UInt
  inline def define(inline a: Long): GTestTrapFlags = a.toUInt
  val G_TEST_TRAP_SILENCE_STDOUT = define(128)
  val G_TEST_TRAP_SILENCE_STDERR = define(256)
  val G_TEST_TRAP_INHERIT_STDIN = define(512)
  inline def getName(inline value: GTestTrapFlags): Option[String] =
    value match
      case G_TEST_TRAP_SILENCE_STDOUT => Some("G_TEST_TRAP_SILENCE_STDOUT")
      case G_TEST_TRAP_SILENCE_STDERR => Some("G_TEST_TRAP_SILENCE_STDERR")
      case G_TEST_TRAP_INHERIT_STDIN => Some("G_TEST_TRAP_INHERIT_STDIN")
      case _ => None
  extension (a: GTestTrapFlags)
    inline def &(b: GTestTrapFlags): GTestTrapFlags = a & b
    inline def |(b: GTestTrapFlags): GTestTrapFlags = a | b
    inline def is(b: GTestTrapFlags): Boolean = (a & b) == b

opaque type GThreadError = CUnsignedInt
object GThreadError extends CEnumU[GThreadError]:
  given _tag: Tag[GThreadError] = Tag.UInt
  inline def define(inline a: Long): GThreadError = a.toUInt
  val G_THREAD_ERROR_AGAIN = define(0)
  inline def getName(inline value: GThreadError): Option[String] =
    value match
      case G_THREAD_ERROR_AGAIN => Some("G_THREAD_ERROR_AGAIN")
      case _ => None
  extension (a: GThreadError)
    inline def &(b: GThreadError): GThreadError = a & b
    inline def |(b: GThreadError): GThreadError = a | b
    inline def is(b: GThreadError): Boolean = (a & b) == b

opaque type GThreadPriority = CUnsignedInt
object GThreadPriority extends CEnumU[GThreadPriority]:
  given _tag: Tag[GThreadPriority] = Tag.UInt
  inline def define(inline a: Long): GThreadPriority = a.toUInt
  val G_THREAD_PRIORITY_LOW = define(0)
  val G_THREAD_PRIORITY_NORMAL = define(1)
  val G_THREAD_PRIORITY_HIGH = define(2)
  val G_THREAD_PRIORITY_URGENT = define(3)
  inline def getName(inline value: GThreadPriority): Option[String] =
    value match
      case G_THREAD_PRIORITY_LOW => Some("G_THREAD_PRIORITY_LOW")
      case G_THREAD_PRIORITY_NORMAL => Some("G_THREAD_PRIORITY_NORMAL")
      case G_THREAD_PRIORITY_HIGH => Some("G_THREAD_PRIORITY_HIGH")
      case G_THREAD_PRIORITY_URGENT => Some("G_THREAD_PRIORITY_URGENT")
      case _ => None
  extension (a: GThreadPriority)
    inline def &(b: GThreadPriority): GThreadPriority = a & b
    inline def |(b: GThreadPriority): GThreadPriority = a | b
    inline def is(b: GThreadPriority): Boolean = (a & b) == b

opaque type GTimeType = CUnsignedInt
object GTimeType extends CEnumU[GTimeType]:
  given _tag: Tag[GTimeType] = Tag.UInt
  inline def define(inline a: Long): GTimeType = a.toUInt
  val G_TIME_TYPE_STANDARD = define(0)
  val G_TIME_TYPE_DAYLIGHT = define(1)
  val G_TIME_TYPE_UNIVERSAL = define(2)
  inline def getName(inline value: GTimeType): Option[String] =
    value match
      case G_TIME_TYPE_STANDARD => Some("G_TIME_TYPE_STANDARD")
      case G_TIME_TYPE_DAYLIGHT => Some("G_TIME_TYPE_DAYLIGHT")
      case G_TIME_TYPE_UNIVERSAL => Some("G_TIME_TYPE_UNIVERSAL")
      case _ => None
  extension (a: GTimeType)
    inline def &(b: GTimeType): GTimeType = a & b
    inline def |(b: GTimeType): GTimeType = a | b
    inline def is(b: GTimeType): Boolean = (a & b) == b

opaque type GTlsAuthenticationMode = CUnsignedInt
object GTlsAuthenticationMode extends CEnumU[GTlsAuthenticationMode]:
  given _tag: Tag[GTlsAuthenticationMode] = Tag.UInt
  inline def define(inline a: Long): GTlsAuthenticationMode = a.toUInt
  val G_TLS_AUTHENTICATION_NONE = define(0)
  val G_TLS_AUTHENTICATION_REQUESTED = define(1)
  val G_TLS_AUTHENTICATION_REQUIRED = define(2)
  inline def getName(inline value: GTlsAuthenticationMode): Option[String] =
    value match
      case G_TLS_AUTHENTICATION_NONE => Some("G_TLS_AUTHENTICATION_NONE")
      case G_TLS_AUTHENTICATION_REQUESTED => Some("G_TLS_AUTHENTICATION_REQUESTED")
      case G_TLS_AUTHENTICATION_REQUIRED => Some("G_TLS_AUTHENTICATION_REQUIRED")
      case _ => None
  extension (a: GTlsAuthenticationMode)
    inline def &(b: GTlsAuthenticationMode): GTlsAuthenticationMode = a & b
    inline def |(b: GTlsAuthenticationMode): GTlsAuthenticationMode = a | b
    inline def is(b: GTlsAuthenticationMode): Boolean = (a & b) == b

opaque type GTlsCertificateFlags = CUnsignedInt
object GTlsCertificateFlags extends CEnumU[GTlsCertificateFlags]:
  given _tag: Tag[GTlsCertificateFlags] = Tag.UInt
  inline def define(inline a: Long): GTlsCertificateFlags = a.toUInt
  val G_TLS_CERTIFICATE_UNKNOWN_CA = define(1)
  val G_TLS_CERTIFICATE_BAD_IDENTITY = define(2)
  val G_TLS_CERTIFICATE_NOT_ACTIVATED = define(4)
  val G_TLS_CERTIFICATE_EXPIRED = define(8)
  val G_TLS_CERTIFICATE_REVOKED = define(16)
  val G_TLS_CERTIFICATE_INSECURE = define(32)
  val G_TLS_CERTIFICATE_GENERIC_ERROR = define(64)
  val G_TLS_CERTIFICATE_VALIDATE_ALL = define(127)
  inline def getName(inline value: GTlsCertificateFlags): Option[String] =
    value match
      case G_TLS_CERTIFICATE_UNKNOWN_CA => Some("G_TLS_CERTIFICATE_UNKNOWN_CA")
      case G_TLS_CERTIFICATE_BAD_IDENTITY => Some("G_TLS_CERTIFICATE_BAD_IDENTITY")
      case G_TLS_CERTIFICATE_NOT_ACTIVATED => Some("G_TLS_CERTIFICATE_NOT_ACTIVATED")
      case G_TLS_CERTIFICATE_EXPIRED => Some("G_TLS_CERTIFICATE_EXPIRED")
      case G_TLS_CERTIFICATE_REVOKED => Some("G_TLS_CERTIFICATE_REVOKED")
      case G_TLS_CERTIFICATE_INSECURE => Some("G_TLS_CERTIFICATE_INSECURE")
      case G_TLS_CERTIFICATE_GENERIC_ERROR => Some("G_TLS_CERTIFICATE_GENERIC_ERROR")
      case G_TLS_CERTIFICATE_VALIDATE_ALL => Some("G_TLS_CERTIFICATE_VALIDATE_ALL")
      case _ => None
  extension (a: GTlsCertificateFlags)
    inline def &(b: GTlsCertificateFlags): GTlsCertificateFlags = a & b
    inline def |(b: GTlsCertificateFlags): GTlsCertificateFlags = a | b
    inline def is(b: GTlsCertificateFlags): Boolean = (a & b) == b

opaque type GTlsCertificateRequestFlags = CUnsignedInt
object GTlsCertificateRequestFlags extends CEnumU[GTlsCertificateRequestFlags]:
  given _tag: Tag[GTlsCertificateRequestFlags] = Tag.UInt
  inline def define(inline a: Long): GTlsCertificateRequestFlags = a.toUInt
  val G_TLS_CERTIFICATE_REQUEST_NONE = define(0)
  inline def getName(inline value: GTlsCertificateRequestFlags): Option[String] =
    value match
      case G_TLS_CERTIFICATE_REQUEST_NONE => Some("G_TLS_CERTIFICATE_REQUEST_NONE")
      case _ => None
  extension (a: GTlsCertificateRequestFlags)
    inline def &(b: GTlsCertificateRequestFlags): GTlsCertificateRequestFlags = a & b
    inline def |(b: GTlsCertificateRequestFlags): GTlsCertificateRequestFlags = a | b
    inline def is(b: GTlsCertificateRequestFlags): Boolean = (a & b) == b

opaque type GTlsChannelBindingError = CUnsignedInt
object GTlsChannelBindingError extends CEnumU[GTlsChannelBindingError]:
  given _tag: Tag[GTlsChannelBindingError] = Tag.UInt
  inline def define(inline a: Long): GTlsChannelBindingError = a.toUInt
  val G_TLS_CHANNEL_BINDING_ERROR_NOT_IMPLEMENTED = define(0)
  val G_TLS_CHANNEL_BINDING_ERROR_INVALID_STATE = define(1)
  val G_TLS_CHANNEL_BINDING_ERROR_NOT_AVAILABLE = define(2)
  val G_TLS_CHANNEL_BINDING_ERROR_NOT_SUPPORTED = define(3)
  val G_TLS_CHANNEL_BINDING_ERROR_GENERAL_ERROR = define(4)
  inline def getName(inline value: GTlsChannelBindingError): Option[String] =
    value match
      case G_TLS_CHANNEL_BINDING_ERROR_NOT_IMPLEMENTED => Some("G_TLS_CHANNEL_BINDING_ERROR_NOT_IMPLEMENTED")
      case G_TLS_CHANNEL_BINDING_ERROR_INVALID_STATE => Some("G_TLS_CHANNEL_BINDING_ERROR_INVALID_STATE")
      case G_TLS_CHANNEL_BINDING_ERROR_NOT_AVAILABLE => Some("G_TLS_CHANNEL_BINDING_ERROR_NOT_AVAILABLE")
      case G_TLS_CHANNEL_BINDING_ERROR_NOT_SUPPORTED => Some("G_TLS_CHANNEL_BINDING_ERROR_NOT_SUPPORTED")
      case G_TLS_CHANNEL_BINDING_ERROR_GENERAL_ERROR => Some("G_TLS_CHANNEL_BINDING_ERROR_GENERAL_ERROR")
      case _ => None
  extension (a: GTlsChannelBindingError)
    inline def &(b: GTlsChannelBindingError): GTlsChannelBindingError = a & b
    inline def |(b: GTlsChannelBindingError): GTlsChannelBindingError = a | b
    inline def is(b: GTlsChannelBindingError): Boolean = (a & b) == b

opaque type GTlsChannelBindingType = CUnsignedInt
object GTlsChannelBindingType extends CEnumU[GTlsChannelBindingType]:
  given _tag: Tag[GTlsChannelBindingType] = Tag.UInt
  inline def define(inline a: Long): GTlsChannelBindingType = a.toUInt
  val G_TLS_CHANNEL_BINDING_TLS_UNIQUE = define(0)
  val G_TLS_CHANNEL_BINDING_TLS_SERVER_END_POINT = define(1)
  inline def getName(inline value: GTlsChannelBindingType): Option[String] =
    value match
      case G_TLS_CHANNEL_BINDING_TLS_UNIQUE => Some("G_TLS_CHANNEL_BINDING_TLS_UNIQUE")
      case G_TLS_CHANNEL_BINDING_TLS_SERVER_END_POINT => Some("G_TLS_CHANNEL_BINDING_TLS_SERVER_END_POINT")
      case _ => None
  extension (a: GTlsChannelBindingType)
    inline def &(b: GTlsChannelBindingType): GTlsChannelBindingType = a & b
    inline def |(b: GTlsChannelBindingType): GTlsChannelBindingType = a | b
    inline def is(b: GTlsChannelBindingType): Boolean = (a & b) == b

opaque type GTlsDatabaseLookupFlags = CUnsignedInt
object GTlsDatabaseLookupFlags extends CEnumU[GTlsDatabaseLookupFlags]:
  given _tag: Tag[GTlsDatabaseLookupFlags] = Tag.UInt
  inline def define(inline a: Long): GTlsDatabaseLookupFlags = a.toUInt
  val G_TLS_DATABASE_LOOKUP_NONE = define(0)
  val G_TLS_DATABASE_LOOKUP_KEYPAIR = define(1)
  inline def getName(inline value: GTlsDatabaseLookupFlags): Option[String] =
    value match
      case G_TLS_DATABASE_LOOKUP_NONE => Some("G_TLS_DATABASE_LOOKUP_NONE")
      case G_TLS_DATABASE_LOOKUP_KEYPAIR => Some("G_TLS_DATABASE_LOOKUP_KEYPAIR")
      case _ => None
  extension (a: GTlsDatabaseLookupFlags)
    inline def &(b: GTlsDatabaseLookupFlags): GTlsDatabaseLookupFlags = a & b
    inline def |(b: GTlsDatabaseLookupFlags): GTlsDatabaseLookupFlags = a | b
    inline def is(b: GTlsDatabaseLookupFlags): Boolean = (a & b) == b

opaque type GTlsDatabaseVerifyFlags = CUnsignedInt
object GTlsDatabaseVerifyFlags extends CEnumU[GTlsDatabaseVerifyFlags]:
  given _tag: Tag[GTlsDatabaseVerifyFlags] = Tag.UInt
  inline def define(inline a: Long): GTlsDatabaseVerifyFlags = a.toUInt
  val G_TLS_DATABASE_VERIFY_NONE = define(0)
  inline def getName(inline value: GTlsDatabaseVerifyFlags): Option[String] =
    value match
      case G_TLS_DATABASE_VERIFY_NONE => Some("G_TLS_DATABASE_VERIFY_NONE")
      case _ => None
  extension (a: GTlsDatabaseVerifyFlags)
    inline def &(b: GTlsDatabaseVerifyFlags): GTlsDatabaseVerifyFlags = a & b
    inline def |(b: GTlsDatabaseVerifyFlags): GTlsDatabaseVerifyFlags = a | b
    inline def is(b: GTlsDatabaseVerifyFlags): Boolean = (a & b) == b

opaque type GTlsError = CUnsignedInt
object GTlsError extends CEnumU[GTlsError]:
  given _tag: Tag[GTlsError] = Tag.UInt
  inline def define(inline a: Long): GTlsError = a.toUInt
  val G_TLS_ERROR_UNAVAILABLE = define(0)
  val G_TLS_ERROR_MISC = define(1)
  val G_TLS_ERROR_BAD_CERTIFICATE = define(2)
  val G_TLS_ERROR_NOT_TLS = define(3)
  val G_TLS_ERROR_HANDSHAKE = define(4)
  val G_TLS_ERROR_CERTIFICATE_REQUIRED = define(5)
  val G_TLS_ERROR_EOF = define(6)
  val G_TLS_ERROR_INAPPROPRIATE_FALLBACK = define(7)
  val G_TLS_ERROR_BAD_CERTIFICATE_PASSWORD = define(8)
  inline def getName(inline value: GTlsError): Option[String] =
    value match
      case G_TLS_ERROR_UNAVAILABLE => Some("G_TLS_ERROR_UNAVAILABLE")
      case G_TLS_ERROR_MISC => Some("G_TLS_ERROR_MISC")
      case G_TLS_ERROR_BAD_CERTIFICATE => Some("G_TLS_ERROR_BAD_CERTIFICATE")
      case G_TLS_ERROR_NOT_TLS => Some("G_TLS_ERROR_NOT_TLS")
      case G_TLS_ERROR_HANDSHAKE => Some("G_TLS_ERROR_HANDSHAKE")
      case G_TLS_ERROR_CERTIFICATE_REQUIRED => Some("G_TLS_ERROR_CERTIFICATE_REQUIRED")
      case G_TLS_ERROR_EOF => Some("G_TLS_ERROR_EOF")
      case G_TLS_ERROR_INAPPROPRIATE_FALLBACK => Some("G_TLS_ERROR_INAPPROPRIATE_FALLBACK")
      case G_TLS_ERROR_BAD_CERTIFICATE_PASSWORD => Some("G_TLS_ERROR_BAD_CERTIFICATE_PASSWORD")
      case _ => None
  extension (a: GTlsError)
    inline def &(b: GTlsError): GTlsError = a & b
    inline def |(b: GTlsError): GTlsError = a | b
    inline def is(b: GTlsError): Boolean = (a & b) == b

opaque type GTlsInteractionResult = CUnsignedInt
object GTlsInteractionResult extends CEnumU[GTlsInteractionResult]:
  given _tag: Tag[GTlsInteractionResult] = Tag.UInt
  inline def define(inline a: Long): GTlsInteractionResult = a.toUInt
  val G_TLS_INTERACTION_UNHANDLED = define(0)
  val G_TLS_INTERACTION_HANDLED = define(1)
  val G_TLS_INTERACTION_FAILED = define(2)
  inline def getName(inline value: GTlsInteractionResult): Option[String] =
    value match
      case G_TLS_INTERACTION_UNHANDLED => Some("G_TLS_INTERACTION_UNHANDLED")
      case G_TLS_INTERACTION_HANDLED => Some("G_TLS_INTERACTION_HANDLED")
      case G_TLS_INTERACTION_FAILED => Some("G_TLS_INTERACTION_FAILED")
      case _ => None
  extension (a: GTlsInteractionResult)
    inline def &(b: GTlsInteractionResult): GTlsInteractionResult = a & b
    inline def |(b: GTlsInteractionResult): GTlsInteractionResult = a | b
    inline def is(b: GTlsInteractionResult): Boolean = (a & b) == b

opaque type GTlsProtocolVersion = CUnsignedInt
object GTlsProtocolVersion extends CEnumU[GTlsProtocolVersion]:
  given _tag: Tag[GTlsProtocolVersion] = Tag.UInt
  inline def define(inline a: Long): GTlsProtocolVersion = a.toUInt
  val G_TLS_PROTOCOL_VERSION_UNKNOWN = define(0)
  val G_TLS_PROTOCOL_VERSION_SSL_3_0 = define(1)
  val G_TLS_PROTOCOL_VERSION_TLS_1_0 = define(2)
  val G_TLS_PROTOCOL_VERSION_TLS_1_1 = define(3)
  val G_TLS_PROTOCOL_VERSION_TLS_1_2 = define(4)
  val G_TLS_PROTOCOL_VERSION_TLS_1_3 = define(5)
  val G_TLS_PROTOCOL_VERSION_DTLS_1_0 = define(201)
  val G_TLS_PROTOCOL_VERSION_DTLS_1_2 = define(202)
  inline def getName(inline value: GTlsProtocolVersion): Option[String] =
    value match
      case G_TLS_PROTOCOL_VERSION_UNKNOWN => Some("G_TLS_PROTOCOL_VERSION_UNKNOWN")
      case G_TLS_PROTOCOL_VERSION_SSL_3_0 => Some("G_TLS_PROTOCOL_VERSION_SSL_3_0")
      case G_TLS_PROTOCOL_VERSION_TLS_1_0 => Some("G_TLS_PROTOCOL_VERSION_TLS_1_0")
      case G_TLS_PROTOCOL_VERSION_TLS_1_1 => Some("G_TLS_PROTOCOL_VERSION_TLS_1_1")
      case G_TLS_PROTOCOL_VERSION_TLS_1_2 => Some("G_TLS_PROTOCOL_VERSION_TLS_1_2")
      case G_TLS_PROTOCOL_VERSION_TLS_1_3 => Some("G_TLS_PROTOCOL_VERSION_TLS_1_3")
      case G_TLS_PROTOCOL_VERSION_DTLS_1_0 => Some("G_TLS_PROTOCOL_VERSION_DTLS_1_0")
      case G_TLS_PROTOCOL_VERSION_DTLS_1_2 => Some("G_TLS_PROTOCOL_VERSION_DTLS_1_2")
      case _ => None
  extension (a: GTlsProtocolVersion)
    inline def &(b: GTlsProtocolVersion): GTlsProtocolVersion = a & b
    inline def |(b: GTlsProtocolVersion): GTlsProtocolVersion = a | b
    inline def is(b: GTlsProtocolVersion): Boolean = (a & b) == b

opaque type GTlsRehandshakeMode = CUnsignedInt
object GTlsRehandshakeMode extends CEnumU[GTlsRehandshakeMode]:
  given _tag: Tag[GTlsRehandshakeMode] = Tag.UInt
  inline def define(inline a: Long): GTlsRehandshakeMode = a.toUInt
  val G_TLS_REHANDSHAKE_NEVER = define(0)
  val G_TLS_REHANDSHAKE_SAFELY = define(1)
  val G_TLS_REHANDSHAKE_UNSAFELY = define(2)
  inline def getName(inline value: GTlsRehandshakeMode): Option[String] =
    value match
      case G_TLS_REHANDSHAKE_NEVER => Some("G_TLS_REHANDSHAKE_NEVER")
      case G_TLS_REHANDSHAKE_SAFELY => Some("G_TLS_REHANDSHAKE_SAFELY")
      case G_TLS_REHANDSHAKE_UNSAFELY => Some("G_TLS_REHANDSHAKE_UNSAFELY")
      case _ => None
  extension (a: GTlsRehandshakeMode)
    inline def &(b: GTlsRehandshakeMode): GTlsRehandshakeMode = a & b
    inline def |(b: GTlsRehandshakeMode): GTlsRehandshakeMode = a | b
    inline def is(b: GTlsRehandshakeMode): Boolean = (a & b) == b

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
    value match
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
    value match
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

opaque type GTraverseType = CUnsignedInt
object GTraverseType extends CEnumU[GTraverseType]:
  given _tag: Tag[GTraverseType] = Tag.UInt
  inline def define(inline a: Long): GTraverseType = a.toUInt
  val G_IN_ORDER = define(0)
  val G_PRE_ORDER = define(1)
  val G_POST_ORDER = define(2)
  val G_LEVEL_ORDER = define(3)
  inline def getName(inline value: GTraverseType): Option[String] =
    value match
      case G_IN_ORDER => Some("G_IN_ORDER")
      case G_PRE_ORDER => Some("G_PRE_ORDER")
      case G_POST_ORDER => Some("G_POST_ORDER")
      case G_LEVEL_ORDER => Some("G_LEVEL_ORDER")
      case _ => None
  extension (a: GTraverseType)
    inline def &(b: GTraverseType): GTraverseType = a & b
    inline def |(b: GTraverseType): GTraverseType = a | b
    inline def is(b: GTraverseType): Boolean = (a & b) == b

opaque type GTypeDebugFlags = CUnsignedInt
object GTypeDebugFlags extends CEnumU[GTypeDebugFlags]:
  given _tag: Tag[GTypeDebugFlags] = Tag.UInt
  inline def define(inline a: Long): GTypeDebugFlags = a.toUInt
  val G_TYPE_DEBUG_NONE = define(0)
  val G_TYPE_DEBUG_OBJECTS = define(1)
  val G_TYPE_DEBUG_SIGNALS = define(2)
  val G_TYPE_DEBUG_INSTANCE_COUNT = define(4)
  val G_TYPE_DEBUG_MASK = define(7)
  inline def getName(inline value: GTypeDebugFlags): Option[String] =
    value match
      case G_TYPE_DEBUG_NONE => Some("G_TYPE_DEBUG_NONE")
      case G_TYPE_DEBUG_OBJECTS => Some("G_TYPE_DEBUG_OBJECTS")
      case G_TYPE_DEBUG_SIGNALS => Some("G_TYPE_DEBUG_SIGNALS")
      case G_TYPE_DEBUG_INSTANCE_COUNT => Some("G_TYPE_DEBUG_INSTANCE_COUNT")
      case G_TYPE_DEBUG_MASK => Some("G_TYPE_DEBUG_MASK")
      case _ => None
  extension (a: GTypeDebugFlags)
    inline def &(b: GTypeDebugFlags): GTypeDebugFlags = a & b
    inline def |(b: GTypeDebugFlags): GTypeDebugFlags = a | b
    inline def is(b: GTypeDebugFlags): Boolean = (a & b) == b

opaque type GTypeFlags = CUnsignedInt
object GTypeFlags extends CEnumU[GTypeFlags]:
  given _tag: Tag[GTypeFlags] = Tag.UInt
  inline def define(inline a: Long): GTypeFlags = a.toUInt
  val G_TYPE_FLAG_ABSTRACT = define(16)
  val G_TYPE_FLAG_VALUE_ABSTRACT = define(32)
  val G_TYPE_FLAG_FINAL = define(64)
  inline def getName(inline value: GTypeFlags): Option[String] =
    value match
      case G_TYPE_FLAG_ABSTRACT => Some("G_TYPE_FLAG_ABSTRACT")
      case G_TYPE_FLAG_VALUE_ABSTRACT => Some("G_TYPE_FLAG_VALUE_ABSTRACT")
      case G_TYPE_FLAG_FINAL => Some("G_TYPE_FLAG_FINAL")
      case _ => None
  extension (a: GTypeFlags)
    inline def &(b: GTypeFlags): GTypeFlags = a & b
    inline def |(b: GTypeFlags): GTypeFlags = a | b
    inline def is(b: GTypeFlags): Boolean = (a & b) == b

opaque type GTypeFundamentalFlags = CUnsignedInt
object GTypeFundamentalFlags extends CEnumU[GTypeFundamentalFlags]:
  given _tag: Tag[GTypeFundamentalFlags] = Tag.UInt
  inline def define(inline a: Long): GTypeFundamentalFlags = a.toUInt
  val G_TYPE_FLAG_CLASSED = define(1)
  val G_TYPE_FLAG_INSTANTIATABLE = define(2)
  val G_TYPE_FLAG_DERIVABLE = define(4)
  val G_TYPE_FLAG_DEEP_DERIVABLE = define(8)
  inline def getName(inline value: GTypeFundamentalFlags): Option[String] =
    value match
      case G_TYPE_FLAG_CLASSED => Some("G_TYPE_FLAG_CLASSED")
      case G_TYPE_FLAG_INSTANTIATABLE => Some("G_TYPE_FLAG_INSTANTIATABLE")
      case G_TYPE_FLAG_DERIVABLE => Some("G_TYPE_FLAG_DERIVABLE")
      case G_TYPE_FLAG_DEEP_DERIVABLE => Some("G_TYPE_FLAG_DEEP_DERIVABLE")
      case _ => None
  extension (a: GTypeFundamentalFlags)
    inline def &(b: GTypeFundamentalFlags): GTypeFundamentalFlags = a & b
    inline def |(b: GTypeFundamentalFlags): GTypeFundamentalFlags = a | b
    inline def is(b: GTypeFundamentalFlags): Boolean = (a & b) == b

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
    value match
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
    value match
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
    value match
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

opaque type GUnixSocketAddressType = CUnsignedInt
object GUnixSocketAddressType extends CEnumU[GUnixSocketAddressType]:
  given _tag: Tag[GUnixSocketAddressType] = Tag.UInt
  inline def define(inline a: Long): GUnixSocketAddressType = a.toUInt
  val G_UNIX_SOCKET_ADDRESS_INVALID = define(0)
  val G_UNIX_SOCKET_ADDRESS_ANONYMOUS = define(1)
  val G_UNIX_SOCKET_ADDRESS_PATH = define(2)
  val G_UNIX_SOCKET_ADDRESS_ABSTRACT = define(3)
  val G_UNIX_SOCKET_ADDRESS_ABSTRACT_PADDED = define(4)
  inline def getName(inline value: GUnixSocketAddressType): Option[String] =
    value match
      case G_UNIX_SOCKET_ADDRESS_INVALID => Some("G_UNIX_SOCKET_ADDRESS_INVALID")
      case G_UNIX_SOCKET_ADDRESS_ANONYMOUS => Some("G_UNIX_SOCKET_ADDRESS_ANONYMOUS")
      case G_UNIX_SOCKET_ADDRESS_PATH => Some("G_UNIX_SOCKET_ADDRESS_PATH")
      case G_UNIX_SOCKET_ADDRESS_ABSTRACT => Some("G_UNIX_SOCKET_ADDRESS_ABSTRACT")
      case G_UNIX_SOCKET_ADDRESS_ABSTRACT_PADDED => Some("G_UNIX_SOCKET_ADDRESS_ABSTRACT_PADDED")
      case _ => None
  extension (a: GUnixSocketAddressType)
    inline def &(b: GUnixSocketAddressType): GUnixSocketAddressType = a & b
    inline def |(b: GUnixSocketAddressType): GUnixSocketAddressType = a | b
    inline def is(b: GUnixSocketAddressType): Boolean = (a & b) == b

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
    value match
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
    value match
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
    value match
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

opaque type GUriParamsFlags = CUnsignedInt
object GUriParamsFlags extends CEnumU[GUriParamsFlags]:
  given _tag: Tag[GUriParamsFlags] = Tag.UInt
  inline def define(inline a: Long): GUriParamsFlags = a.toUInt
  val G_URI_PARAMS_NONE = define(0)
  val G_URI_PARAMS_CASE_INSENSITIVE = define(1)
  val G_URI_PARAMS_WWW_FORM = define(2)
  val G_URI_PARAMS_PARSE_RELAXED = define(4)
  inline def getName(inline value: GUriParamsFlags): Option[String] =
    value match
      case G_URI_PARAMS_NONE => Some("G_URI_PARAMS_NONE")
      case G_URI_PARAMS_CASE_INSENSITIVE => Some("G_URI_PARAMS_CASE_INSENSITIVE")
      case G_URI_PARAMS_WWW_FORM => Some("G_URI_PARAMS_WWW_FORM")
      case G_URI_PARAMS_PARSE_RELAXED => Some("G_URI_PARAMS_PARSE_RELAXED")
      case _ => None
  extension (a: GUriParamsFlags)
    inline def &(b: GUriParamsFlags): GUriParamsFlags = a & b
    inline def |(b: GUriParamsFlags): GUriParamsFlags = a | b
    inline def is(b: GUriParamsFlags): Boolean = (a & b) == b

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
    value match
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
    value match
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
    value match
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

opaque type GZlibCompressorFormat = CUnsignedInt
object GZlibCompressorFormat extends CEnumU[GZlibCompressorFormat]:
  given _tag: Tag[GZlibCompressorFormat] = Tag.UInt
  inline def define(inline a: Long): GZlibCompressorFormat = a.toUInt
  val G_ZLIB_COMPRESSOR_FORMAT_ZLIB = define(0)
  val G_ZLIB_COMPRESSOR_FORMAT_GZIP = define(1)
  val G_ZLIB_COMPRESSOR_FORMAT_RAW = define(2)
  inline def getName(inline value: GZlibCompressorFormat): Option[String] =
    value match
      case G_ZLIB_COMPRESSOR_FORMAT_ZLIB => Some("G_ZLIB_COMPRESSOR_FORMAT_ZLIB")
      case G_ZLIB_COMPRESSOR_FORMAT_GZIP => Some("G_ZLIB_COMPRESSOR_FORMAT_GZIP")
      case G_ZLIB_COMPRESSOR_FORMAT_RAW => Some("G_ZLIB_COMPRESSOR_FORMAT_RAW")
      case _ => None
  extension (a: GZlibCompressorFormat)
    inline def &(b: GZlibCompressorFormat): GZlibCompressorFormat = a & b
    inline def |(b: GZlibCompressorFormat): GZlibCompressorFormat = a | b
    inline def is(b: GZlibCompressorFormat): Boolean = (a & b) == b

opaque type GdkAnchorHints = CUnsignedInt
object GdkAnchorHints extends CEnumU[GdkAnchorHints]:
  given _tag: Tag[GdkAnchorHints] = Tag.UInt
  inline def define(inline a: Long): GdkAnchorHints = a.toUInt
  val GDK_ANCHOR_FLIP_X = define(1)
  val GDK_ANCHOR_FLIP_Y = define(2)
  val GDK_ANCHOR_SLIDE_X = define(4)
  val GDK_ANCHOR_SLIDE_Y = define(8)
  val GDK_ANCHOR_RESIZE_X = define(16)
  val GDK_ANCHOR_RESIZE_Y = define(32)
  val GDK_ANCHOR_FLIP = define(3)
  val GDK_ANCHOR_SLIDE = define(12)
  val GDK_ANCHOR_RESIZE = define(48)
  inline def getName(inline value: GdkAnchorHints): Option[String] =
    value match
      case GDK_ANCHOR_FLIP_X => Some("GDK_ANCHOR_FLIP_X")
      case GDK_ANCHOR_FLIP_Y => Some("GDK_ANCHOR_FLIP_Y")
      case GDK_ANCHOR_SLIDE_X => Some("GDK_ANCHOR_SLIDE_X")
      case GDK_ANCHOR_SLIDE_Y => Some("GDK_ANCHOR_SLIDE_Y")
      case GDK_ANCHOR_RESIZE_X => Some("GDK_ANCHOR_RESIZE_X")
      case GDK_ANCHOR_RESIZE_Y => Some("GDK_ANCHOR_RESIZE_Y")
      case GDK_ANCHOR_FLIP => Some("GDK_ANCHOR_FLIP")
      case GDK_ANCHOR_SLIDE => Some("GDK_ANCHOR_SLIDE")
      case GDK_ANCHOR_RESIZE => Some("GDK_ANCHOR_RESIZE")
      case _ => None
  extension (a: GdkAnchorHints)
    inline def &(b: GdkAnchorHints): GdkAnchorHints = a & b
    inline def |(b: GdkAnchorHints): GdkAnchorHints = a | b
    inline def is(b: GdkAnchorHints): Boolean = (a & b) == b

opaque type GdkAxisFlags = CUnsignedInt
object GdkAxisFlags extends CEnumU[GdkAxisFlags]:
  given _tag: Tag[GdkAxisFlags] = Tag.UInt
  inline def define(inline a: Long): GdkAxisFlags = a.toUInt
  val GDK_AXIS_FLAG_X = define(2)
  val GDK_AXIS_FLAG_Y = define(4)
  val GDK_AXIS_FLAG_DELTA_X = define(8)
  val GDK_AXIS_FLAG_DELTA_Y = define(16)
  val GDK_AXIS_FLAG_PRESSURE = define(32)
  val GDK_AXIS_FLAG_XTILT = define(64)
  val GDK_AXIS_FLAG_YTILT = define(128)
  val GDK_AXIS_FLAG_WHEEL = define(256)
  val GDK_AXIS_FLAG_DISTANCE = define(512)
  val GDK_AXIS_FLAG_ROTATION = define(1024)
  val GDK_AXIS_FLAG_SLIDER = define(2048)
  inline def getName(inline value: GdkAxisFlags): Option[String] =
    value match
      case GDK_AXIS_FLAG_X => Some("GDK_AXIS_FLAG_X")
      case GDK_AXIS_FLAG_Y => Some("GDK_AXIS_FLAG_Y")
      case GDK_AXIS_FLAG_DELTA_X => Some("GDK_AXIS_FLAG_DELTA_X")
      case GDK_AXIS_FLAG_DELTA_Y => Some("GDK_AXIS_FLAG_DELTA_Y")
      case GDK_AXIS_FLAG_PRESSURE => Some("GDK_AXIS_FLAG_PRESSURE")
      case GDK_AXIS_FLAG_XTILT => Some("GDK_AXIS_FLAG_XTILT")
      case GDK_AXIS_FLAG_YTILT => Some("GDK_AXIS_FLAG_YTILT")
      case GDK_AXIS_FLAG_WHEEL => Some("GDK_AXIS_FLAG_WHEEL")
      case GDK_AXIS_FLAG_DISTANCE => Some("GDK_AXIS_FLAG_DISTANCE")
      case GDK_AXIS_FLAG_ROTATION => Some("GDK_AXIS_FLAG_ROTATION")
      case GDK_AXIS_FLAG_SLIDER => Some("GDK_AXIS_FLAG_SLIDER")
      case _ => None
  extension (a: GdkAxisFlags)
    inline def &(b: GdkAxisFlags): GdkAxisFlags = a & b
    inline def |(b: GdkAxisFlags): GdkAxisFlags = a | b
    inline def is(b: GdkAxisFlags): Boolean = (a & b) == b

opaque type GdkAxisUse = CUnsignedInt
object GdkAxisUse extends CEnumU[GdkAxisUse]:
  given _tag: Tag[GdkAxisUse] = Tag.UInt
  inline def define(inline a: Long): GdkAxisUse = a.toUInt
  val GDK_AXIS_IGNORE = define(0)
  val GDK_AXIS_X = define(1)
  val GDK_AXIS_Y = define(2)
  val GDK_AXIS_DELTA_X = define(3)
  val GDK_AXIS_DELTA_Y = define(4)
  val GDK_AXIS_PRESSURE = define(5)
  val GDK_AXIS_XTILT = define(6)
  val GDK_AXIS_YTILT = define(7)
  val GDK_AXIS_WHEEL = define(8)
  val GDK_AXIS_DISTANCE = define(9)
  val GDK_AXIS_ROTATION = define(10)
  val GDK_AXIS_SLIDER = define(11)
  val GDK_AXIS_LAST = define(12)
  inline def getName(inline value: GdkAxisUse): Option[String] =
    value match
      case GDK_AXIS_IGNORE => Some("GDK_AXIS_IGNORE")
      case GDK_AXIS_X => Some("GDK_AXIS_X")
      case GDK_AXIS_Y => Some("GDK_AXIS_Y")
      case GDK_AXIS_DELTA_X => Some("GDK_AXIS_DELTA_X")
      case GDK_AXIS_DELTA_Y => Some("GDK_AXIS_DELTA_Y")
      case GDK_AXIS_PRESSURE => Some("GDK_AXIS_PRESSURE")
      case GDK_AXIS_XTILT => Some("GDK_AXIS_XTILT")
      case GDK_AXIS_YTILT => Some("GDK_AXIS_YTILT")
      case GDK_AXIS_WHEEL => Some("GDK_AXIS_WHEEL")
      case GDK_AXIS_DISTANCE => Some("GDK_AXIS_DISTANCE")
      case GDK_AXIS_ROTATION => Some("GDK_AXIS_ROTATION")
      case GDK_AXIS_SLIDER => Some("GDK_AXIS_SLIDER")
      case GDK_AXIS_LAST => Some("GDK_AXIS_LAST")
      case _ => None
  extension (a: GdkAxisUse)
    inline def &(b: GdkAxisUse): GdkAxisUse = a & b
    inline def |(b: GdkAxisUse): GdkAxisUse = a | b
    inline def is(b: GdkAxisUse): Boolean = (a & b) == b

opaque type GdkColorspace = CUnsignedInt
object GdkColorspace extends CEnumU[GdkColorspace]:
  given _tag: Tag[GdkColorspace] = Tag.UInt
  inline def define(inline a: Long): GdkColorspace = a.toUInt
  val GDK_COLORSPACE_RGB = define(0)
  inline def getName(inline value: GdkColorspace): Option[String] =
    value match
      case GDK_COLORSPACE_RGB => Some("GDK_COLORSPACE_RGB")
      case _ => None
  extension (a: GdkColorspace)
    inline def &(b: GdkColorspace): GdkColorspace = a & b
    inline def |(b: GdkColorspace): GdkColorspace = a | b
    inline def is(b: GdkColorspace): Boolean = (a & b) == b

opaque type GdkCrossingMode = CUnsignedInt
object GdkCrossingMode extends CEnumU[GdkCrossingMode]:
  given _tag: Tag[GdkCrossingMode] = Tag.UInt
  inline def define(inline a: Long): GdkCrossingMode = a.toUInt
  val GDK_CROSSING_NORMAL = define(0)
  val GDK_CROSSING_GRAB = define(1)
  val GDK_CROSSING_UNGRAB = define(2)
  val GDK_CROSSING_GTK_GRAB = define(3)
  val GDK_CROSSING_GTK_UNGRAB = define(4)
  val GDK_CROSSING_STATE_CHANGED = define(5)
  val GDK_CROSSING_TOUCH_BEGIN = define(6)
  val GDK_CROSSING_TOUCH_END = define(7)
  val GDK_CROSSING_DEVICE_SWITCH = define(8)
  inline def getName(inline value: GdkCrossingMode): Option[String] =
    value match
      case GDK_CROSSING_NORMAL => Some("GDK_CROSSING_NORMAL")
      case GDK_CROSSING_GRAB => Some("GDK_CROSSING_GRAB")
      case GDK_CROSSING_UNGRAB => Some("GDK_CROSSING_UNGRAB")
      case GDK_CROSSING_GTK_GRAB => Some("GDK_CROSSING_GTK_GRAB")
      case GDK_CROSSING_GTK_UNGRAB => Some("GDK_CROSSING_GTK_UNGRAB")
      case GDK_CROSSING_STATE_CHANGED => Some("GDK_CROSSING_STATE_CHANGED")
      case GDK_CROSSING_TOUCH_BEGIN => Some("GDK_CROSSING_TOUCH_BEGIN")
      case GDK_CROSSING_TOUCH_END => Some("GDK_CROSSING_TOUCH_END")
      case GDK_CROSSING_DEVICE_SWITCH => Some("GDK_CROSSING_DEVICE_SWITCH")
      case _ => None
  extension (a: GdkCrossingMode)
    inline def &(b: GdkCrossingMode): GdkCrossingMode = a & b
    inline def |(b: GdkCrossingMode): GdkCrossingMode = a | b
    inline def is(b: GdkCrossingMode): Boolean = (a & b) == b

opaque type GdkDevicePadFeature = CUnsignedInt
object GdkDevicePadFeature extends CEnumU[GdkDevicePadFeature]:
  given _tag: Tag[GdkDevicePadFeature] = Tag.UInt
  inline def define(inline a: Long): GdkDevicePadFeature = a.toUInt
  val GDK_DEVICE_PAD_FEATURE_BUTTON = define(0)
  val GDK_DEVICE_PAD_FEATURE_RING = define(1)
  val GDK_DEVICE_PAD_FEATURE_STRIP = define(2)
  inline def getName(inline value: GdkDevicePadFeature): Option[String] =
    value match
      case GDK_DEVICE_PAD_FEATURE_BUTTON => Some("GDK_DEVICE_PAD_FEATURE_BUTTON")
      case GDK_DEVICE_PAD_FEATURE_RING => Some("GDK_DEVICE_PAD_FEATURE_RING")
      case GDK_DEVICE_PAD_FEATURE_STRIP => Some("GDK_DEVICE_PAD_FEATURE_STRIP")
      case _ => None
  extension (a: GdkDevicePadFeature)
    inline def &(b: GdkDevicePadFeature): GdkDevicePadFeature = a & b
    inline def |(b: GdkDevicePadFeature): GdkDevicePadFeature = a | b
    inline def is(b: GdkDevicePadFeature): Boolean = (a & b) == b

opaque type GdkDeviceToolType = CUnsignedInt
object GdkDeviceToolType extends CEnumU[GdkDeviceToolType]:
  given _tag: Tag[GdkDeviceToolType] = Tag.UInt
  inline def define(inline a: Long): GdkDeviceToolType = a.toUInt
  val GDK_DEVICE_TOOL_TYPE_UNKNOWN = define(0)
  val GDK_DEVICE_TOOL_TYPE_PEN = define(1)
  val GDK_DEVICE_TOOL_TYPE_ERASER = define(2)
  val GDK_DEVICE_TOOL_TYPE_BRUSH = define(3)
  val GDK_DEVICE_TOOL_TYPE_PENCIL = define(4)
  val GDK_DEVICE_TOOL_TYPE_AIRBRUSH = define(5)
  val GDK_DEVICE_TOOL_TYPE_MOUSE = define(6)
  val GDK_DEVICE_TOOL_TYPE_LENS = define(7)
  inline def getName(inline value: GdkDeviceToolType): Option[String] =
    value match
      case GDK_DEVICE_TOOL_TYPE_UNKNOWN => Some("GDK_DEVICE_TOOL_TYPE_UNKNOWN")
      case GDK_DEVICE_TOOL_TYPE_PEN => Some("GDK_DEVICE_TOOL_TYPE_PEN")
      case GDK_DEVICE_TOOL_TYPE_ERASER => Some("GDK_DEVICE_TOOL_TYPE_ERASER")
      case GDK_DEVICE_TOOL_TYPE_BRUSH => Some("GDK_DEVICE_TOOL_TYPE_BRUSH")
      case GDK_DEVICE_TOOL_TYPE_PENCIL => Some("GDK_DEVICE_TOOL_TYPE_PENCIL")
      case GDK_DEVICE_TOOL_TYPE_AIRBRUSH => Some("GDK_DEVICE_TOOL_TYPE_AIRBRUSH")
      case GDK_DEVICE_TOOL_TYPE_MOUSE => Some("GDK_DEVICE_TOOL_TYPE_MOUSE")
      case GDK_DEVICE_TOOL_TYPE_LENS => Some("GDK_DEVICE_TOOL_TYPE_LENS")
      case _ => None
  extension (a: GdkDeviceToolType)
    inline def &(b: GdkDeviceToolType): GdkDeviceToolType = a & b
    inline def |(b: GdkDeviceToolType): GdkDeviceToolType = a | b
    inline def is(b: GdkDeviceToolType): Boolean = (a & b) == b

opaque type GdkDragAction = CUnsignedInt
object GdkDragAction extends CEnumU[GdkDragAction]:
  given _tag: Tag[GdkDragAction] = Tag.UInt
  inline def define(inline a: Long): GdkDragAction = a.toUInt
  val GDK_ACTION_COPY = define(1)
  val GDK_ACTION_MOVE = define(2)
  val GDK_ACTION_LINK = define(4)
  val GDK_ACTION_ASK = define(8)
  inline def getName(inline value: GdkDragAction): Option[String] =
    value match
      case GDK_ACTION_COPY => Some("GDK_ACTION_COPY")
      case GDK_ACTION_MOVE => Some("GDK_ACTION_MOVE")
      case GDK_ACTION_LINK => Some("GDK_ACTION_LINK")
      case GDK_ACTION_ASK => Some("GDK_ACTION_ASK")
      case _ => None
  extension (a: GdkDragAction)
    inline def &(b: GdkDragAction): GdkDragAction = a & b
    inline def |(b: GdkDragAction): GdkDragAction = a | b
    inline def is(b: GdkDragAction): Boolean = (a & b) == b

opaque type GdkDragCancelReason = CUnsignedInt
object GdkDragCancelReason extends CEnumU[GdkDragCancelReason]:
  given _tag: Tag[GdkDragCancelReason] = Tag.UInt
  inline def define(inline a: Long): GdkDragCancelReason = a.toUInt
  val GDK_DRAG_CANCEL_NO_TARGET = define(0)
  val GDK_DRAG_CANCEL_USER_CANCELLED = define(1)
  val GDK_DRAG_CANCEL_ERROR = define(2)
  inline def getName(inline value: GdkDragCancelReason): Option[String] =
    value match
      case GDK_DRAG_CANCEL_NO_TARGET => Some("GDK_DRAG_CANCEL_NO_TARGET")
      case GDK_DRAG_CANCEL_USER_CANCELLED => Some("GDK_DRAG_CANCEL_USER_CANCELLED")
      case GDK_DRAG_CANCEL_ERROR => Some("GDK_DRAG_CANCEL_ERROR")
      case _ => None
  extension (a: GdkDragCancelReason)
    inline def &(b: GdkDragCancelReason): GdkDragCancelReason = a & b
    inline def |(b: GdkDragCancelReason): GdkDragCancelReason = a | b
    inline def is(b: GdkDragCancelReason): Boolean = (a & b) == b

opaque type GdkEventType = CUnsignedInt
object GdkEventType extends CEnumU[GdkEventType]:
  given _tag: Tag[GdkEventType] = Tag.UInt
  inline def define(inline a: Long): GdkEventType = a.toUInt
  val GDK_DELETE = define(0)
  val GDK_MOTION_NOTIFY = define(1)
  val GDK_BUTTON_PRESS = define(2)
  val GDK_BUTTON_RELEASE = define(3)
  val GDK_KEY_PRESS = define(4)
  val GDK_KEY_RELEASE = define(5)
  val GDK_ENTER_NOTIFY = define(6)
  val GDK_LEAVE_NOTIFY = define(7)
  val GDK_FOCUS_CHANGE = define(8)
  val GDK_PROXIMITY_IN = define(9)
  val GDK_PROXIMITY_OUT = define(10)
  val GDK_DRAG_ENTER = define(11)
  val GDK_DRAG_LEAVE = define(12)
  val GDK_DRAG_MOTION = define(13)
  val GDK_DROP_START = define(14)
  val GDK_SCROLL = define(15)
  val GDK_GRAB_BROKEN = define(16)
  val GDK_TOUCH_BEGIN = define(17)
  val GDK_TOUCH_UPDATE = define(18)
  val GDK_TOUCH_END = define(19)
  val GDK_TOUCH_CANCEL = define(20)
  val GDK_TOUCHPAD_SWIPE = define(21)
  val GDK_TOUCHPAD_PINCH = define(22)
  val GDK_PAD_BUTTON_PRESS = define(23)
  val GDK_PAD_BUTTON_RELEASE = define(24)
  val GDK_PAD_RING = define(25)
  val GDK_PAD_STRIP = define(26)
  val GDK_PAD_GROUP_MODE = define(27)
  val GDK_TOUCHPAD_HOLD = define(28)
  val GDK_EVENT_LAST = define(29)
  inline def getName(inline value: GdkEventType): Option[String] =
    value match
      case GDK_DELETE => Some("GDK_DELETE")
      case GDK_MOTION_NOTIFY => Some("GDK_MOTION_NOTIFY")
      case GDK_BUTTON_PRESS => Some("GDK_BUTTON_PRESS")
      case GDK_BUTTON_RELEASE => Some("GDK_BUTTON_RELEASE")
      case GDK_KEY_PRESS => Some("GDK_KEY_PRESS")
      case GDK_KEY_RELEASE => Some("GDK_KEY_RELEASE")
      case GDK_ENTER_NOTIFY => Some("GDK_ENTER_NOTIFY")
      case GDK_LEAVE_NOTIFY => Some("GDK_LEAVE_NOTIFY")
      case GDK_FOCUS_CHANGE => Some("GDK_FOCUS_CHANGE")
      case GDK_PROXIMITY_IN => Some("GDK_PROXIMITY_IN")
      case GDK_PROXIMITY_OUT => Some("GDK_PROXIMITY_OUT")
      case GDK_DRAG_ENTER => Some("GDK_DRAG_ENTER")
      case GDK_DRAG_LEAVE => Some("GDK_DRAG_LEAVE")
      case GDK_DRAG_MOTION => Some("GDK_DRAG_MOTION")
      case GDK_DROP_START => Some("GDK_DROP_START")
      case GDK_SCROLL => Some("GDK_SCROLL")
      case GDK_GRAB_BROKEN => Some("GDK_GRAB_BROKEN")
      case GDK_TOUCH_BEGIN => Some("GDK_TOUCH_BEGIN")
      case GDK_TOUCH_UPDATE => Some("GDK_TOUCH_UPDATE")
      case GDK_TOUCH_END => Some("GDK_TOUCH_END")
      case GDK_TOUCH_CANCEL => Some("GDK_TOUCH_CANCEL")
      case GDK_TOUCHPAD_SWIPE => Some("GDK_TOUCHPAD_SWIPE")
      case GDK_TOUCHPAD_PINCH => Some("GDK_TOUCHPAD_PINCH")
      case GDK_PAD_BUTTON_PRESS => Some("GDK_PAD_BUTTON_PRESS")
      case GDK_PAD_BUTTON_RELEASE => Some("GDK_PAD_BUTTON_RELEASE")
      case GDK_PAD_RING => Some("GDK_PAD_RING")
      case GDK_PAD_STRIP => Some("GDK_PAD_STRIP")
      case GDK_PAD_GROUP_MODE => Some("GDK_PAD_GROUP_MODE")
      case GDK_TOUCHPAD_HOLD => Some("GDK_TOUCHPAD_HOLD")
      case GDK_EVENT_LAST => Some("GDK_EVENT_LAST")
      case _ => None
  extension (a: GdkEventType)
    inline def &(b: GdkEventType): GdkEventType = a & b
    inline def |(b: GdkEventType): GdkEventType = a | b
    inline def is(b: GdkEventType): Boolean = (a & b) == b

opaque type GdkFrameClockPhase = CUnsignedInt
object GdkFrameClockPhase extends CEnumU[GdkFrameClockPhase]:
  given _tag: Tag[GdkFrameClockPhase] = Tag.UInt
  inline def define(inline a: Long): GdkFrameClockPhase = a.toUInt
  val GDK_FRAME_CLOCK_PHASE_NONE = define(0)
  val GDK_FRAME_CLOCK_PHASE_FLUSH_EVENTS = define(1)
  val GDK_FRAME_CLOCK_PHASE_BEFORE_PAINT = define(2)
  val GDK_FRAME_CLOCK_PHASE_UPDATE = define(4)
  val GDK_FRAME_CLOCK_PHASE_LAYOUT = define(8)
  val GDK_FRAME_CLOCK_PHASE_PAINT = define(16)
  val GDK_FRAME_CLOCK_PHASE_RESUME_EVENTS = define(32)
  val GDK_FRAME_CLOCK_PHASE_AFTER_PAINT = define(64)
  inline def getName(inline value: GdkFrameClockPhase): Option[String] =
    value match
      case GDK_FRAME_CLOCK_PHASE_NONE => Some("GDK_FRAME_CLOCK_PHASE_NONE")
      case GDK_FRAME_CLOCK_PHASE_FLUSH_EVENTS => Some("GDK_FRAME_CLOCK_PHASE_FLUSH_EVENTS")
      case GDK_FRAME_CLOCK_PHASE_BEFORE_PAINT => Some("GDK_FRAME_CLOCK_PHASE_BEFORE_PAINT")
      case GDK_FRAME_CLOCK_PHASE_UPDATE => Some("GDK_FRAME_CLOCK_PHASE_UPDATE")
      case GDK_FRAME_CLOCK_PHASE_LAYOUT => Some("GDK_FRAME_CLOCK_PHASE_LAYOUT")
      case GDK_FRAME_CLOCK_PHASE_PAINT => Some("GDK_FRAME_CLOCK_PHASE_PAINT")
      case GDK_FRAME_CLOCK_PHASE_RESUME_EVENTS => Some("GDK_FRAME_CLOCK_PHASE_RESUME_EVENTS")
      case GDK_FRAME_CLOCK_PHASE_AFTER_PAINT => Some("GDK_FRAME_CLOCK_PHASE_AFTER_PAINT")
      case _ => None
  extension (a: GdkFrameClockPhase)
    inline def &(b: GdkFrameClockPhase): GdkFrameClockPhase = a & b
    inline def |(b: GdkFrameClockPhase): GdkFrameClockPhase = a | b
    inline def is(b: GdkFrameClockPhase): Boolean = (a & b) == b

opaque type GdkFullscreenMode = CUnsignedInt
object GdkFullscreenMode extends CEnumU[GdkFullscreenMode]:
  given _tag: Tag[GdkFullscreenMode] = Tag.UInt
  inline def define(inline a: Long): GdkFullscreenMode = a.toUInt
  val GDK_FULLSCREEN_ON_CURRENT_MONITOR = define(0)
  val GDK_FULLSCREEN_ON_ALL_MONITORS = define(1)
  inline def getName(inline value: GdkFullscreenMode): Option[String] =
    value match
      case GDK_FULLSCREEN_ON_CURRENT_MONITOR => Some("GDK_FULLSCREEN_ON_CURRENT_MONITOR")
      case GDK_FULLSCREEN_ON_ALL_MONITORS => Some("GDK_FULLSCREEN_ON_ALL_MONITORS")
      case _ => None
  extension (a: GdkFullscreenMode)
    inline def &(b: GdkFullscreenMode): GdkFullscreenMode = a & b
    inline def |(b: GdkFullscreenMode): GdkFullscreenMode = a | b
    inline def is(b: GdkFullscreenMode): Boolean = (a & b) == b

opaque type GdkGLAPI = CUnsignedInt
object GdkGLAPI extends CEnumU[GdkGLAPI]:
  given _tag: Tag[GdkGLAPI] = Tag.UInt
  inline def define(inline a: Long): GdkGLAPI = a.toUInt
  val GDK_GL_API_GL = define(1)
  val GDK_GL_API_GLES = define(2)
  inline def getName(inline value: GdkGLAPI): Option[String] =
    value match
      case GDK_GL_API_GL => Some("GDK_GL_API_GL")
      case GDK_GL_API_GLES => Some("GDK_GL_API_GLES")
      case _ => None
  extension (a: GdkGLAPI)
    inline def &(b: GdkGLAPI): GdkGLAPI = a & b
    inline def |(b: GdkGLAPI): GdkGLAPI = a | b
    inline def is(b: GdkGLAPI): Boolean = (a & b) == b

opaque type GdkGLError = CUnsignedInt
object GdkGLError extends CEnumU[GdkGLError]:
  given _tag: Tag[GdkGLError] = Tag.UInt
  inline def define(inline a: Long): GdkGLError = a.toUInt
  val GDK_GL_ERROR_NOT_AVAILABLE = define(0)
  val GDK_GL_ERROR_UNSUPPORTED_FORMAT = define(1)
  val GDK_GL_ERROR_UNSUPPORTED_PROFILE = define(2)
  val GDK_GL_ERROR_COMPILATION_FAILED = define(3)
  val GDK_GL_ERROR_LINK_FAILED = define(4)
  inline def getName(inline value: GdkGLError): Option[String] =
    value match
      case GDK_GL_ERROR_NOT_AVAILABLE => Some("GDK_GL_ERROR_NOT_AVAILABLE")
      case GDK_GL_ERROR_UNSUPPORTED_FORMAT => Some("GDK_GL_ERROR_UNSUPPORTED_FORMAT")
      case GDK_GL_ERROR_UNSUPPORTED_PROFILE => Some("GDK_GL_ERROR_UNSUPPORTED_PROFILE")
      case GDK_GL_ERROR_COMPILATION_FAILED => Some("GDK_GL_ERROR_COMPILATION_FAILED")
      case GDK_GL_ERROR_LINK_FAILED => Some("GDK_GL_ERROR_LINK_FAILED")
      case _ => None
  extension (a: GdkGLError)
    inline def &(b: GdkGLError): GdkGLError = a & b
    inline def |(b: GdkGLError): GdkGLError = a | b
    inline def is(b: GdkGLError): Boolean = (a & b) == b

opaque type GdkGravity = CUnsignedInt
object GdkGravity extends CEnumU[GdkGravity]:
  given _tag: Tag[GdkGravity] = Tag.UInt
  inline def define(inline a: Long): GdkGravity = a.toUInt
  val GDK_GRAVITY_NORTH_WEST = define(1)
  val GDK_GRAVITY_NORTH = define(2)
  val GDK_GRAVITY_NORTH_EAST = define(3)
  val GDK_GRAVITY_WEST = define(4)
  val GDK_GRAVITY_CENTER = define(5)
  val GDK_GRAVITY_EAST = define(6)
  val GDK_GRAVITY_SOUTH_WEST = define(7)
  val GDK_GRAVITY_SOUTH = define(8)
  val GDK_GRAVITY_SOUTH_EAST = define(9)
  val GDK_GRAVITY_STATIC = define(10)
  inline def getName(inline value: GdkGravity): Option[String] =
    value match
      case GDK_GRAVITY_NORTH_WEST => Some("GDK_GRAVITY_NORTH_WEST")
      case GDK_GRAVITY_NORTH => Some("GDK_GRAVITY_NORTH")
      case GDK_GRAVITY_NORTH_EAST => Some("GDK_GRAVITY_NORTH_EAST")
      case GDK_GRAVITY_WEST => Some("GDK_GRAVITY_WEST")
      case GDK_GRAVITY_CENTER => Some("GDK_GRAVITY_CENTER")
      case GDK_GRAVITY_EAST => Some("GDK_GRAVITY_EAST")
      case GDK_GRAVITY_SOUTH_WEST => Some("GDK_GRAVITY_SOUTH_WEST")
      case GDK_GRAVITY_SOUTH => Some("GDK_GRAVITY_SOUTH")
      case GDK_GRAVITY_SOUTH_EAST => Some("GDK_GRAVITY_SOUTH_EAST")
      case GDK_GRAVITY_STATIC => Some("GDK_GRAVITY_STATIC")
      case _ => None
  extension (a: GdkGravity)
    inline def &(b: GdkGravity): GdkGravity = a & b
    inline def |(b: GdkGravity): GdkGravity = a | b
    inline def is(b: GdkGravity): Boolean = (a & b) == b

opaque type GdkInputSource = CUnsignedInt
object GdkInputSource extends CEnumU[GdkInputSource]:
  given _tag: Tag[GdkInputSource] = Tag.UInt
  inline def define(inline a: Long): GdkInputSource = a.toUInt
  val GDK_SOURCE_MOUSE = define(0)
  val GDK_SOURCE_PEN = define(1)
  val GDK_SOURCE_KEYBOARD = define(2)
  val GDK_SOURCE_TOUCHSCREEN = define(3)
  val GDK_SOURCE_TOUCHPAD = define(4)
  val GDK_SOURCE_TRACKPOINT = define(5)
  val GDK_SOURCE_TABLET_PAD = define(6)
  inline def getName(inline value: GdkInputSource): Option[String] =
    value match
      case GDK_SOURCE_MOUSE => Some("GDK_SOURCE_MOUSE")
      case GDK_SOURCE_PEN => Some("GDK_SOURCE_PEN")
      case GDK_SOURCE_KEYBOARD => Some("GDK_SOURCE_KEYBOARD")
      case GDK_SOURCE_TOUCHSCREEN => Some("GDK_SOURCE_TOUCHSCREEN")
      case GDK_SOURCE_TOUCHPAD => Some("GDK_SOURCE_TOUCHPAD")
      case GDK_SOURCE_TRACKPOINT => Some("GDK_SOURCE_TRACKPOINT")
      case GDK_SOURCE_TABLET_PAD => Some("GDK_SOURCE_TABLET_PAD")
      case _ => None
  extension (a: GdkInputSource)
    inline def &(b: GdkInputSource): GdkInputSource = a & b
    inline def |(b: GdkInputSource): GdkInputSource = a | b
    inline def is(b: GdkInputSource): Boolean = (a & b) == b

opaque type GdkInterpType = CUnsignedInt
object GdkInterpType extends CEnumU[GdkInterpType]:
  given _tag: Tag[GdkInterpType] = Tag.UInt
  inline def define(inline a: Long): GdkInterpType = a.toUInt
  val GDK_INTERP_NEAREST = define(0)
  val GDK_INTERP_TILES = define(1)
  val GDK_INTERP_BILINEAR = define(2)
  val GDK_INTERP_HYPER = define(3)
  inline def getName(inline value: GdkInterpType): Option[String] =
    value match
      case GDK_INTERP_NEAREST => Some("GDK_INTERP_NEAREST")
      case GDK_INTERP_TILES => Some("GDK_INTERP_TILES")
      case GDK_INTERP_BILINEAR => Some("GDK_INTERP_BILINEAR")
      case GDK_INTERP_HYPER => Some("GDK_INTERP_HYPER")
      case _ => None
  extension (a: GdkInterpType)
    inline def &(b: GdkInterpType): GdkInterpType = a & b
    inline def |(b: GdkInterpType): GdkInterpType = a | b
    inline def is(b: GdkInterpType): Boolean = (a & b) == b

opaque type GdkKeyMatch = CUnsignedInt
object GdkKeyMatch extends CEnumU[GdkKeyMatch]:
  given _tag: Tag[GdkKeyMatch] = Tag.UInt
  inline def define(inline a: Long): GdkKeyMatch = a.toUInt
  val GDK_KEY_MATCH_NONE = define(0)
  val GDK_KEY_MATCH_PARTIAL = define(1)
  val GDK_KEY_MATCH_EXACT = define(2)
  inline def getName(inline value: GdkKeyMatch): Option[String] =
    value match
      case GDK_KEY_MATCH_NONE => Some("GDK_KEY_MATCH_NONE")
      case GDK_KEY_MATCH_PARTIAL => Some("GDK_KEY_MATCH_PARTIAL")
      case GDK_KEY_MATCH_EXACT => Some("GDK_KEY_MATCH_EXACT")
      case _ => None
  extension (a: GdkKeyMatch)
    inline def &(b: GdkKeyMatch): GdkKeyMatch = a & b
    inline def |(b: GdkKeyMatch): GdkKeyMatch = a | b
    inline def is(b: GdkKeyMatch): Boolean = (a & b) == b

opaque type GdkMemoryFormat = CUnsignedInt
object GdkMemoryFormat extends CEnumU[GdkMemoryFormat]:
  given _tag: Tag[GdkMemoryFormat] = Tag.UInt
  inline def define(inline a: Long): GdkMemoryFormat = a.toUInt
  val GDK_MEMORY_B8G8R8A8_PREMULTIPLIED = define(0)
  val GDK_MEMORY_A8R8G8B8_PREMULTIPLIED = define(1)
  val GDK_MEMORY_R8G8B8A8_PREMULTIPLIED = define(2)
  val GDK_MEMORY_B8G8R8A8 = define(3)
  val GDK_MEMORY_A8R8G8B8 = define(4)
  val GDK_MEMORY_R8G8B8A8 = define(5)
  val GDK_MEMORY_A8B8G8R8 = define(6)
  val GDK_MEMORY_R8G8B8 = define(7)
  val GDK_MEMORY_B8G8R8 = define(8)
  val GDK_MEMORY_R16G16B16 = define(9)
  val GDK_MEMORY_R16G16B16A16_PREMULTIPLIED = define(10)
  val GDK_MEMORY_R16G16B16A16 = define(11)
  val GDK_MEMORY_R16G16B16_FLOAT = define(12)
  val GDK_MEMORY_R16G16B16A16_FLOAT_PREMULTIPLIED = define(13)
  val GDK_MEMORY_R16G16B16A16_FLOAT = define(14)
  val GDK_MEMORY_R32G32B32_FLOAT = define(15)
  val GDK_MEMORY_R32G32B32A32_FLOAT_PREMULTIPLIED = define(16)
  val GDK_MEMORY_R32G32B32A32_FLOAT = define(17)
  val GDK_MEMORY_N_FORMATS = define(18)
  inline def getName(inline value: GdkMemoryFormat): Option[String] =
    value match
      case GDK_MEMORY_B8G8R8A8_PREMULTIPLIED => Some("GDK_MEMORY_B8G8R8A8_PREMULTIPLIED")
      case GDK_MEMORY_A8R8G8B8_PREMULTIPLIED => Some("GDK_MEMORY_A8R8G8B8_PREMULTIPLIED")
      case GDK_MEMORY_R8G8B8A8_PREMULTIPLIED => Some("GDK_MEMORY_R8G8B8A8_PREMULTIPLIED")
      case GDK_MEMORY_B8G8R8A8 => Some("GDK_MEMORY_B8G8R8A8")
      case GDK_MEMORY_A8R8G8B8 => Some("GDK_MEMORY_A8R8G8B8")
      case GDK_MEMORY_R8G8B8A8 => Some("GDK_MEMORY_R8G8B8A8")
      case GDK_MEMORY_A8B8G8R8 => Some("GDK_MEMORY_A8B8G8R8")
      case GDK_MEMORY_R8G8B8 => Some("GDK_MEMORY_R8G8B8")
      case GDK_MEMORY_B8G8R8 => Some("GDK_MEMORY_B8G8R8")
      case GDK_MEMORY_R16G16B16 => Some("GDK_MEMORY_R16G16B16")
      case GDK_MEMORY_R16G16B16A16_PREMULTIPLIED => Some("GDK_MEMORY_R16G16B16A16_PREMULTIPLIED")
      case GDK_MEMORY_R16G16B16A16 => Some("GDK_MEMORY_R16G16B16A16")
      case GDK_MEMORY_R16G16B16_FLOAT => Some("GDK_MEMORY_R16G16B16_FLOAT")
      case GDK_MEMORY_R16G16B16A16_FLOAT_PREMULTIPLIED => Some("GDK_MEMORY_R16G16B16A16_FLOAT_PREMULTIPLIED")
      case GDK_MEMORY_R16G16B16A16_FLOAT => Some("GDK_MEMORY_R16G16B16A16_FLOAT")
      case GDK_MEMORY_R32G32B32_FLOAT => Some("GDK_MEMORY_R32G32B32_FLOAT")
      case GDK_MEMORY_R32G32B32A32_FLOAT_PREMULTIPLIED => Some("GDK_MEMORY_R32G32B32A32_FLOAT_PREMULTIPLIED")
      case GDK_MEMORY_R32G32B32A32_FLOAT => Some("GDK_MEMORY_R32G32B32A32_FLOAT")
      case GDK_MEMORY_N_FORMATS => Some("GDK_MEMORY_N_FORMATS")
      case _ => None
  extension (a: GdkMemoryFormat)
    inline def &(b: GdkMemoryFormat): GdkMemoryFormat = a & b
    inline def |(b: GdkMemoryFormat): GdkMemoryFormat = a | b
    inline def is(b: GdkMemoryFormat): Boolean = (a & b) == b

opaque type GdkModifierType = CUnsignedInt
object GdkModifierType extends CEnumU[GdkModifierType]:
  given _tag: Tag[GdkModifierType] = Tag.UInt
  inline def define(inline a: Long): GdkModifierType = a.toUInt
  val GDK_SHIFT_MASK = define(1)
  val GDK_LOCK_MASK = define(2)
  val GDK_CONTROL_MASK = define(4)
  val GDK_ALT_MASK = define(8)
  val GDK_BUTTON1_MASK = define(256)
  val GDK_BUTTON2_MASK = define(512)
  val GDK_BUTTON3_MASK = define(1024)
  val GDK_BUTTON4_MASK = define(2048)
  val GDK_BUTTON5_MASK = define(4096)
  val GDK_SUPER_MASK = define(67108864)
  val GDK_HYPER_MASK = define(134217728)
  val GDK_META_MASK = define(268435456)
  inline def getName(inline value: GdkModifierType): Option[String] =
    value match
      case GDK_SHIFT_MASK => Some("GDK_SHIFT_MASK")
      case GDK_LOCK_MASK => Some("GDK_LOCK_MASK")
      case GDK_CONTROL_MASK => Some("GDK_CONTROL_MASK")
      case GDK_ALT_MASK => Some("GDK_ALT_MASK")
      case GDK_BUTTON1_MASK => Some("GDK_BUTTON1_MASK")
      case GDK_BUTTON2_MASK => Some("GDK_BUTTON2_MASK")
      case GDK_BUTTON3_MASK => Some("GDK_BUTTON3_MASK")
      case GDK_BUTTON4_MASK => Some("GDK_BUTTON4_MASK")
      case GDK_BUTTON5_MASK => Some("GDK_BUTTON5_MASK")
      case GDK_SUPER_MASK => Some("GDK_SUPER_MASK")
      case GDK_HYPER_MASK => Some("GDK_HYPER_MASK")
      case GDK_META_MASK => Some("GDK_META_MASK")
      case _ => None
  extension (a: GdkModifierType)
    inline def &(b: GdkModifierType): GdkModifierType = a & b
    inline def |(b: GdkModifierType): GdkModifierType = a | b
    inline def is(b: GdkModifierType): Boolean = (a & b) == b

opaque type GdkNotifyType = CUnsignedInt
object GdkNotifyType extends CEnumU[GdkNotifyType]:
  given _tag: Tag[GdkNotifyType] = Tag.UInt
  inline def define(inline a: Long): GdkNotifyType = a.toUInt
  val GDK_NOTIFY_ANCESTOR = define(0)
  val GDK_NOTIFY_VIRTUAL = define(1)
  val GDK_NOTIFY_INFERIOR = define(2)
  val GDK_NOTIFY_NONLINEAR = define(3)
  val GDK_NOTIFY_NONLINEAR_VIRTUAL = define(4)
  val GDK_NOTIFY_UNKNOWN = define(5)
  inline def getName(inline value: GdkNotifyType): Option[String] =
    value match
      case GDK_NOTIFY_ANCESTOR => Some("GDK_NOTIFY_ANCESTOR")
      case GDK_NOTIFY_VIRTUAL => Some("GDK_NOTIFY_VIRTUAL")
      case GDK_NOTIFY_INFERIOR => Some("GDK_NOTIFY_INFERIOR")
      case GDK_NOTIFY_NONLINEAR => Some("GDK_NOTIFY_NONLINEAR")
      case GDK_NOTIFY_NONLINEAR_VIRTUAL => Some("GDK_NOTIFY_NONLINEAR_VIRTUAL")
      case GDK_NOTIFY_UNKNOWN => Some("GDK_NOTIFY_UNKNOWN")
      case _ => None
  extension (a: GdkNotifyType)
    inline def &(b: GdkNotifyType): GdkNotifyType = a & b
    inline def |(b: GdkNotifyType): GdkNotifyType = a | b
    inline def is(b: GdkNotifyType): Boolean = (a & b) == b

opaque type GdkPaintableFlags = CUnsignedInt
object GdkPaintableFlags extends CEnumU[GdkPaintableFlags]:
  given _tag: Tag[GdkPaintableFlags] = Tag.UInt
  inline def define(inline a: Long): GdkPaintableFlags = a.toUInt
  val GDK_PAINTABLE_STATIC_SIZE = define(1)
  val GDK_PAINTABLE_STATIC_CONTENTS = define(2)
  inline def getName(inline value: GdkPaintableFlags): Option[String] =
    value match
      case GDK_PAINTABLE_STATIC_SIZE => Some("GDK_PAINTABLE_STATIC_SIZE")
      case GDK_PAINTABLE_STATIC_CONTENTS => Some("GDK_PAINTABLE_STATIC_CONTENTS")
      case _ => None
  extension (a: GdkPaintableFlags)
    inline def &(b: GdkPaintableFlags): GdkPaintableFlags = a & b
    inline def |(b: GdkPaintableFlags): GdkPaintableFlags = a | b
    inline def is(b: GdkPaintableFlags): Boolean = (a & b) == b

opaque type GdkPixbufAlphaMode = CUnsignedInt
object GdkPixbufAlphaMode extends CEnumU[GdkPixbufAlphaMode]:
  given _tag: Tag[GdkPixbufAlphaMode] = Tag.UInt
  inline def define(inline a: Long): GdkPixbufAlphaMode = a.toUInt
  val GDK_PIXBUF_ALPHA_BILEVEL = define(0)
  val GDK_PIXBUF_ALPHA_FULL = define(1)
  inline def getName(inline value: GdkPixbufAlphaMode): Option[String] =
    value match
      case GDK_PIXBUF_ALPHA_BILEVEL => Some("GDK_PIXBUF_ALPHA_BILEVEL")
      case GDK_PIXBUF_ALPHA_FULL => Some("GDK_PIXBUF_ALPHA_FULL")
      case _ => None
  extension (a: GdkPixbufAlphaMode)
    inline def &(b: GdkPixbufAlphaMode): GdkPixbufAlphaMode = a & b
    inline def |(b: GdkPixbufAlphaMode): GdkPixbufAlphaMode = a | b
    inline def is(b: GdkPixbufAlphaMode): Boolean = (a & b) == b

opaque type GdkPixbufError = CUnsignedInt
object GdkPixbufError extends CEnumU[GdkPixbufError]:
  given _tag: Tag[GdkPixbufError] = Tag.UInt
  inline def define(inline a: Long): GdkPixbufError = a.toUInt
  val GDK_PIXBUF_ERROR_CORRUPT_IMAGE = define(0)
  val GDK_PIXBUF_ERROR_INSUFFICIENT_MEMORY = define(1)
  val GDK_PIXBUF_ERROR_BAD_OPTION = define(2)
  val GDK_PIXBUF_ERROR_UNKNOWN_TYPE = define(3)
  val GDK_PIXBUF_ERROR_UNSUPPORTED_OPERATION = define(4)
  val GDK_PIXBUF_ERROR_FAILED = define(5)
  val GDK_PIXBUF_ERROR_INCOMPLETE_ANIMATION = define(6)
  inline def getName(inline value: GdkPixbufError): Option[String] =
    value match
      case GDK_PIXBUF_ERROR_CORRUPT_IMAGE => Some("GDK_PIXBUF_ERROR_CORRUPT_IMAGE")
      case GDK_PIXBUF_ERROR_INSUFFICIENT_MEMORY => Some("GDK_PIXBUF_ERROR_INSUFFICIENT_MEMORY")
      case GDK_PIXBUF_ERROR_BAD_OPTION => Some("GDK_PIXBUF_ERROR_BAD_OPTION")
      case GDK_PIXBUF_ERROR_UNKNOWN_TYPE => Some("GDK_PIXBUF_ERROR_UNKNOWN_TYPE")
      case GDK_PIXBUF_ERROR_UNSUPPORTED_OPERATION => Some("GDK_PIXBUF_ERROR_UNSUPPORTED_OPERATION")
      case GDK_PIXBUF_ERROR_FAILED => Some("GDK_PIXBUF_ERROR_FAILED")
      case GDK_PIXBUF_ERROR_INCOMPLETE_ANIMATION => Some("GDK_PIXBUF_ERROR_INCOMPLETE_ANIMATION")
      case _ => None
  extension (a: GdkPixbufError)
    inline def &(b: GdkPixbufError): GdkPixbufError = a & b
    inline def |(b: GdkPixbufError): GdkPixbufError = a | b
    inline def is(b: GdkPixbufError): Boolean = (a & b) == b

opaque type GdkPixbufRotation = CUnsignedInt
object GdkPixbufRotation extends CEnumU[GdkPixbufRotation]:
  given _tag: Tag[GdkPixbufRotation] = Tag.UInt
  inline def define(inline a: Long): GdkPixbufRotation = a.toUInt
  val GDK_PIXBUF_ROTATE_NONE = define(0)
  val GDK_PIXBUF_ROTATE_COUNTERCLOCKWISE = define(90)
  val GDK_PIXBUF_ROTATE_UPSIDEDOWN = define(180)
  val GDK_PIXBUF_ROTATE_CLOCKWISE = define(270)
  inline def getName(inline value: GdkPixbufRotation): Option[String] =
    value match
      case GDK_PIXBUF_ROTATE_NONE => Some("GDK_PIXBUF_ROTATE_NONE")
      case GDK_PIXBUF_ROTATE_COUNTERCLOCKWISE => Some("GDK_PIXBUF_ROTATE_COUNTERCLOCKWISE")
      case GDK_PIXBUF_ROTATE_UPSIDEDOWN => Some("GDK_PIXBUF_ROTATE_UPSIDEDOWN")
      case GDK_PIXBUF_ROTATE_CLOCKWISE => Some("GDK_PIXBUF_ROTATE_CLOCKWISE")
      case _ => None
  extension (a: GdkPixbufRotation)
    inline def &(b: GdkPixbufRotation): GdkPixbufRotation = a & b
    inline def |(b: GdkPixbufRotation): GdkPixbufRotation = a | b
    inline def is(b: GdkPixbufRotation): Boolean = (a & b) == b

opaque type GdkScrollDirection = CUnsignedInt
object GdkScrollDirection extends CEnumU[GdkScrollDirection]:
  given _tag: Tag[GdkScrollDirection] = Tag.UInt
  inline def define(inline a: Long): GdkScrollDirection = a.toUInt
  val GDK_SCROLL_UP = define(0)
  val GDK_SCROLL_DOWN = define(1)
  val GDK_SCROLL_LEFT = define(2)
  val GDK_SCROLL_RIGHT = define(3)
  val GDK_SCROLL_SMOOTH = define(4)
  inline def getName(inline value: GdkScrollDirection): Option[String] =
    value match
      case GDK_SCROLL_UP => Some("GDK_SCROLL_UP")
      case GDK_SCROLL_DOWN => Some("GDK_SCROLL_DOWN")
      case GDK_SCROLL_LEFT => Some("GDK_SCROLL_LEFT")
      case GDK_SCROLL_RIGHT => Some("GDK_SCROLL_RIGHT")
      case GDK_SCROLL_SMOOTH => Some("GDK_SCROLL_SMOOTH")
      case _ => None
  extension (a: GdkScrollDirection)
    inline def &(b: GdkScrollDirection): GdkScrollDirection = a & b
    inline def |(b: GdkScrollDirection): GdkScrollDirection = a | b
    inline def is(b: GdkScrollDirection): Boolean = (a & b) == b

opaque type GdkSeatCapabilities = CUnsignedInt
object GdkSeatCapabilities extends CEnumU[GdkSeatCapabilities]:
  given _tag: Tag[GdkSeatCapabilities] = Tag.UInt
  inline def define(inline a: Long): GdkSeatCapabilities = a.toUInt
  val GDK_SEAT_CAPABILITY_NONE = define(0)
  val GDK_SEAT_CAPABILITY_POINTER = define(1)
  val GDK_SEAT_CAPABILITY_TOUCH = define(2)
  val GDK_SEAT_CAPABILITY_TABLET_STYLUS = define(4)
  val GDK_SEAT_CAPABILITY_KEYBOARD = define(8)
  val GDK_SEAT_CAPABILITY_TABLET_PAD = define(16)
  val GDK_SEAT_CAPABILITY_ALL_POINTING = define(7)
  val GDK_SEAT_CAPABILITY_ALL = define(15)
  inline def getName(inline value: GdkSeatCapabilities): Option[String] =
    value match
      case GDK_SEAT_CAPABILITY_NONE => Some("GDK_SEAT_CAPABILITY_NONE")
      case GDK_SEAT_CAPABILITY_POINTER => Some("GDK_SEAT_CAPABILITY_POINTER")
      case GDK_SEAT_CAPABILITY_TOUCH => Some("GDK_SEAT_CAPABILITY_TOUCH")
      case GDK_SEAT_CAPABILITY_TABLET_STYLUS => Some("GDK_SEAT_CAPABILITY_TABLET_STYLUS")
      case GDK_SEAT_CAPABILITY_KEYBOARD => Some("GDK_SEAT_CAPABILITY_KEYBOARD")
      case GDK_SEAT_CAPABILITY_TABLET_PAD => Some("GDK_SEAT_CAPABILITY_TABLET_PAD")
      case GDK_SEAT_CAPABILITY_ALL_POINTING => Some("GDK_SEAT_CAPABILITY_ALL_POINTING")
      case GDK_SEAT_CAPABILITY_ALL => Some("GDK_SEAT_CAPABILITY_ALL")
      case _ => None
  extension (a: GdkSeatCapabilities)
    inline def &(b: GdkSeatCapabilities): GdkSeatCapabilities = a & b
    inline def |(b: GdkSeatCapabilities): GdkSeatCapabilities = a | b
    inline def is(b: GdkSeatCapabilities): Boolean = (a & b) == b

opaque type GdkSubpixelLayout = CUnsignedInt
object GdkSubpixelLayout extends CEnumU[GdkSubpixelLayout]:
  given _tag: Tag[GdkSubpixelLayout] = Tag.UInt
  inline def define(inline a: Long): GdkSubpixelLayout = a.toUInt
  val GDK_SUBPIXEL_LAYOUT_UNKNOWN = define(0)
  val GDK_SUBPIXEL_LAYOUT_NONE = define(1)
  val GDK_SUBPIXEL_LAYOUT_HORIZONTAL_RGB = define(2)
  val GDK_SUBPIXEL_LAYOUT_HORIZONTAL_BGR = define(3)
  val GDK_SUBPIXEL_LAYOUT_VERTICAL_RGB = define(4)
  val GDK_SUBPIXEL_LAYOUT_VERTICAL_BGR = define(5)
  inline def getName(inline value: GdkSubpixelLayout): Option[String] =
    value match
      case GDK_SUBPIXEL_LAYOUT_UNKNOWN => Some("GDK_SUBPIXEL_LAYOUT_UNKNOWN")
      case GDK_SUBPIXEL_LAYOUT_NONE => Some("GDK_SUBPIXEL_LAYOUT_NONE")
      case GDK_SUBPIXEL_LAYOUT_HORIZONTAL_RGB => Some("GDK_SUBPIXEL_LAYOUT_HORIZONTAL_RGB")
      case GDK_SUBPIXEL_LAYOUT_HORIZONTAL_BGR => Some("GDK_SUBPIXEL_LAYOUT_HORIZONTAL_BGR")
      case GDK_SUBPIXEL_LAYOUT_VERTICAL_RGB => Some("GDK_SUBPIXEL_LAYOUT_VERTICAL_RGB")
      case GDK_SUBPIXEL_LAYOUT_VERTICAL_BGR => Some("GDK_SUBPIXEL_LAYOUT_VERTICAL_BGR")
      case _ => None
  extension (a: GdkSubpixelLayout)
    inline def &(b: GdkSubpixelLayout): GdkSubpixelLayout = a & b
    inline def |(b: GdkSubpixelLayout): GdkSubpixelLayout = a | b
    inline def is(b: GdkSubpixelLayout): Boolean = (a & b) == b

opaque type GdkSurfaceEdge = CUnsignedInt
object GdkSurfaceEdge extends CEnumU[GdkSurfaceEdge]:
  given _tag: Tag[GdkSurfaceEdge] = Tag.UInt
  inline def define(inline a: Long): GdkSurfaceEdge = a.toUInt
  val GDK_SURFACE_EDGE_NORTH_WEST = define(0)
  val GDK_SURFACE_EDGE_NORTH = define(1)
  val GDK_SURFACE_EDGE_NORTH_EAST = define(2)
  val GDK_SURFACE_EDGE_WEST = define(3)
  val GDK_SURFACE_EDGE_EAST = define(4)
  val GDK_SURFACE_EDGE_SOUTH_WEST = define(5)
  val GDK_SURFACE_EDGE_SOUTH = define(6)
  val GDK_SURFACE_EDGE_SOUTH_EAST = define(7)
  inline def getName(inline value: GdkSurfaceEdge): Option[String] =
    value match
      case GDK_SURFACE_EDGE_NORTH_WEST => Some("GDK_SURFACE_EDGE_NORTH_WEST")
      case GDK_SURFACE_EDGE_NORTH => Some("GDK_SURFACE_EDGE_NORTH")
      case GDK_SURFACE_EDGE_NORTH_EAST => Some("GDK_SURFACE_EDGE_NORTH_EAST")
      case GDK_SURFACE_EDGE_WEST => Some("GDK_SURFACE_EDGE_WEST")
      case GDK_SURFACE_EDGE_EAST => Some("GDK_SURFACE_EDGE_EAST")
      case GDK_SURFACE_EDGE_SOUTH_WEST => Some("GDK_SURFACE_EDGE_SOUTH_WEST")
      case GDK_SURFACE_EDGE_SOUTH => Some("GDK_SURFACE_EDGE_SOUTH")
      case GDK_SURFACE_EDGE_SOUTH_EAST => Some("GDK_SURFACE_EDGE_SOUTH_EAST")
      case _ => None
  extension (a: GdkSurfaceEdge)
    inline def &(b: GdkSurfaceEdge): GdkSurfaceEdge = a & b
    inline def |(b: GdkSurfaceEdge): GdkSurfaceEdge = a | b
    inline def is(b: GdkSurfaceEdge): Boolean = (a & b) == b

opaque type GdkTextureError = CUnsignedInt
object GdkTextureError extends CEnumU[GdkTextureError]:
  given _tag: Tag[GdkTextureError] = Tag.UInt
  inline def define(inline a: Long): GdkTextureError = a.toUInt
  val GDK_TEXTURE_ERROR_TOO_LARGE = define(0)
  val GDK_TEXTURE_ERROR_CORRUPT_IMAGE = define(1)
  val GDK_TEXTURE_ERROR_UNSUPPORTED_CONTENT = define(2)
  val GDK_TEXTURE_ERROR_UNSUPPORTED_FORMAT = define(3)
  inline def getName(inline value: GdkTextureError): Option[String] =
    value match
      case GDK_TEXTURE_ERROR_TOO_LARGE => Some("GDK_TEXTURE_ERROR_TOO_LARGE")
      case GDK_TEXTURE_ERROR_CORRUPT_IMAGE => Some("GDK_TEXTURE_ERROR_CORRUPT_IMAGE")
      case GDK_TEXTURE_ERROR_UNSUPPORTED_CONTENT => Some("GDK_TEXTURE_ERROR_UNSUPPORTED_CONTENT")
      case GDK_TEXTURE_ERROR_UNSUPPORTED_FORMAT => Some("GDK_TEXTURE_ERROR_UNSUPPORTED_FORMAT")
      case _ => None
  extension (a: GdkTextureError)
    inline def &(b: GdkTextureError): GdkTextureError = a & b
    inline def |(b: GdkTextureError): GdkTextureError = a | b
    inline def is(b: GdkTextureError): Boolean = (a & b) == b

opaque type GdkTitlebarGesture = CUnsignedInt
object GdkTitlebarGesture extends CEnumU[GdkTitlebarGesture]:
  given _tag: Tag[GdkTitlebarGesture] = Tag.UInt
  inline def define(inline a: Long): GdkTitlebarGesture = a.toUInt
  val GDK_TITLEBAR_GESTURE_DOUBLE_CLICK = define(1)
  val GDK_TITLEBAR_GESTURE_RIGHT_CLICK = define(2)
  val GDK_TITLEBAR_GESTURE_MIDDLE_CLICK = define(3)
  inline def getName(inline value: GdkTitlebarGesture): Option[String] =
    value match
      case GDK_TITLEBAR_GESTURE_DOUBLE_CLICK => Some("GDK_TITLEBAR_GESTURE_DOUBLE_CLICK")
      case GDK_TITLEBAR_GESTURE_RIGHT_CLICK => Some("GDK_TITLEBAR_GESTURE_RIGHT_CLICK")
      case GDK_TITLEBAR_GESTURE_MIDDLE_CLICK => Some("GDK_TITLEBAR_GESTURE_MIDDLE_CLICK")
      case _ => None
  extension (a: GdkTitlebarGesture)
    inline def &(b: GdkTitlebarGesture): GdkTitlebarGesture = a & b
    inline def |(b: GdkTitlebarGesture): GdkTitlebarGesture = a | b
    inline def is(b: GdkTitlebarGesture): Boolean = (a & b) == b

opaque type GdkToplevelState = CUnsignedInt
object GdkToplevelState extends CEnumU[GdkToplevelState]:
  given _tag: Tag[GdkToplevelState] = Tag.UInt
  inline def define(inline a: Long): GdkToplevelState = a.toUInt
  val GDK_TOPLEVEL_STATE_MINIMIZED = define(1)
  val GDK_TOPLEVEL_STATE_MAXIMIZED = define(2)
  val GDK_TOPLEVEL_STATE_STICKY = define(4)
  val GDK_TOPLEVEL_STATE_FULLSCREEN = define(8)
  val GDK_TOPLEVEL_STATE_ABOVE = define(16)
  val GDK_TOPLEVEL_STATE_BELOW = define(32)
  val GDK_TOPLEVEL_STATE_FOCUSED = define(64)
  val GDK_TOPLEVEL_STATE_TILED = define(128)
  val GDK_TOPLEVEL_STATE_TOP_TILED = define(256)
  val GDK_TOPLEVEL_STATE_TOP_RESIZABLE = define(512)
  val GDK_TOPLEVEL_STATE_RIGHT_TILED = define(1024)
  val GDK_TOPLEVEL_STATE_RIGHT_RESIZABLE = define(2048)
  val GDK_TOPLEVEL_STATE_BOTTOM_TILED = define(4096)
  val GDK_TOPLEVEL_STATE_BOTTOM_RESIZABLE = define(8192)
  val GDK_TOPLEVEL_STATE_LEFT_TILED = define(16384)
  val GDK_TOPLEVEL_STATE_LEFT_RESIZABLE = define(32768)
  inline def getName(inline value: GdkToplevelState): Option[String] =
    value match
      case GDK_TOPLEVEL_STATE_MINIMIZED => Some("GDK_TOPLEVEL_STATE_MINIMIZED")
      case GDK_TOPLEVEL_STATE_MAXIMIZED => Some("GDK_TOPLEVEL_STATE_MAXIMIZED")
      case GDK_TOPLEVEL_STATE_STICKY => Some("GDK_TOPLEVEL_STATE_STICKY")
      case GDK_TOPLEVEL_STATE_FULLSCREEN => Some("GDK_TOPLEVEL_STATE_FULLSCREEN")
      case GDK_TOPLEVEL_STATE_ABOVE => Some("GDK_TOPLEVEL_STATE_ABOVE")
      case GDK_TOPLEVEL_STATE_BELOW => Some("GDK_TOPLEVEL_STATE_BELOW")
      case GDK_TOPLEVEL_STATE_FOCUSED => Some("GDK_TOPLEVEL_STATE_FOCUSED")
      case GDK_TOPLEVEL_STATE_TILED => Some("GDK_TOPLEVEL_STATE_TILED")
      case GDK_TOPLEVEL_STATE_TOP_TILED => Some("GDK_TOPLEVEL_STATE_TOP_TILED")
      case GDK_TOPLEVEL_STATE_TOP_RESIZABLE => Some("GDK_TOPLEVEL_STATE_TOP_RESIZABLE")
      case GDK_TOPLEVEL_STATE_RIGHT_TILED => Some("GDK_TOPLEVEL_STATE_RIGHT_TILED")
      case GDK_TOPLEVEL_STATE_RIGHT_RESIZABLE => Some("GDK_TOPLEVEL_STATE_RIGHT_RESIZABLE")
      case GDK_TOPLEVEL_STATE_BOTTOM_TILED => Some("GDK_TOPLEVEL_STATE_BOTTOM_TILED")
      case GDK_TOPLEVEL_STATE_BOTTOM_RESIZABLE => Some("GDK_TOPLEVEL_STATE_BOTTOM_RESIZABLE")
      case GDK_TOPLEVEL_STATE_LEFT_TILED => Some("GDK_TOPLEVEL_STATE_LEFT_TILED")
      case GDK_TOPLEVEL_STATE_LEFT_RESIZABLE => Some("GDK_TOPLEVEL_STATE_LEFT_RESIZABLE")
      case _ => None
  extension (a: GdkToplevelState)
    inline def &(b: GdkToplevelState): GdkToplevelState = a & b
    inline def |(b: GdkToplevelState): GdkToplevelState = a | b
    inline def is(b: GdkToplevelState): Boolean = (a & b) == b

opaque type GdkTouchpadGesturePhase = CUnsignedInt
object GdkTouchpadGesturePhase extends CEnumU[GdkTouchpadGesturePhase]:
  given _tag: Tag[GdkTouchpadGesturePhase] = Tag.UInt
  inline def define(inline a: Long): GdkTouchpadGesturePhase = a.toUInt
  val GDK_TOUCHPAD_GESTURE_PHASE_BEGIN = define(0)
  val GDK_TOUCHPAD_GESTURE_PHASE_UPDATE = define(1)
  val GDK_TOUCHPAD_GESTURE_PHASE_END = define(2)
  val GDK_TOUCHPAD_GESTURE_PHASE_CANCEL = define(3)
  inline def getName(inline value: GdkTouchpadGesturePhase): Option[String] =
    value match
      case GDK_TOUCHPAD_GESTURE_PHASE_BEGIN => Some("GDK_TOUCHPAD_GESTURE_PHASE_BEGIN")
      case GDK_TOUCHPAD_GESTURE_PHASE_UPDATE => Some("GDK_TOUCHPAD_GESTURE_PHASE_UPDATE")
      case GDK_TOUCHPAD_GESTURE_PHASE_END => Some("GDK_TOUCHPAD_GESTURE_PHASE_END")
      case GDK_TOUCHPAD_GESTURE_PHASE_CANCEL => Some("GDK_TOUCHPAD_GESTURE_PHASE_CANCEL")
      case _ => None
  extension (a: GdkTouchpadGesturePhase)
    inline def &(b: GdkTouchpadGesturePhase): GdkTouchpadGesturePhase = a & b
    inline def |(b: GdkTouchpadGesturePhase): GdkTouchpadGesturePhase = a | b
    inline def is(b: GdkTouchpadGesturePhase): Boolean = (a & b) == b

opaque type GdkVulkanError = CUnsignedInt
object GdkVulkanError extends CEnumU[GdkVulkanError]:
  given _tag: Tag[GdkVulkanError] = Tag.UInt
  inline def define(inline a: Long): GdkVulkanError = a.toUInt
  val GDK_VULKAN_ERROR_UNSUPPORTED = define(0)
  val GDK_VULKAN_ERROR_NOT_AVAILABLE = define(1)
  inline def getName(inline value: GdkVulkanError): Option[String] =
    value match
      case GDK_VULKAN_ERROR_UNSUPPORTED => Some("GDK_VULKAN_ERROR_UNSUPPORTED")
      case GDK_VULKAN_ERROR_NOT_AVAILABLE => Some("GDK_VULKAN_ERROR_NOT_AVAILABLE")
      case _ => None
  extension (a: GdkVulkanError)
    inline def &(b: GdkVulkanError): GdkVulkanError = a & b
    inline def |(b: GdkVulkanError): GdkVulkanError = a | b
    inline def is(b: GdkVulkanError): Boolean = (a & b) == b

opaque type GskBlendMode = CUnsignedInt
object GskBlendMode extends CEnumU[GskBlendMode]:
  given _tag: Tag[GskBlendMode] = Tag.UInt
  inline def define(inline a: Long): GskBlendMode = a.toUInt
  val GSK_BLEND_MODE_DEFAULT = define(0)
  val GSK_BLEND_MODE_MULTIPLY = define(1)
  val GSK_BLEND_MODE_SCREEN = define(2)
  val GSK_BLEND_MODE_OVERLAY = define(3)
  val GSK_BLEND_MODE_DARKEN = define(4)
  val GSK_BLEND_MODE_LIGHTEN = define(5)
  val GSK_BLEND_MODE_COLOR_DODGE = define(6)
  val GSK_BLEND_MODE_COLOR_BURN = define(7)
  val GSK_BLEND_MODE_HARD_LIGHT = define(8)
  val GSK_BLEND_MODE_SOFT_LIGHT = define(9)
  val GSK_BLEND_MODE_DIFFERENCE = define(10)
  val GSK_BLEND_MODE_EXCLUSION = define(11)
  val GSK_BLEND_MODE_COLOR = define(12)
  val GSK_BLEND_MODE_HUE = define(13)
  val GSK_BLEND_MODE_SATURATION = define(14)
  val GSK_BLEND_MODE_LUMINOSITY = define(15)
  inline def getName(inline value: GskBlendMode): Option[String] =
    value match
      case GSK_BLEND_MODE_DEFAULT => Some("GSK_BLEND_MODE_DEFAULT")
      case GSK_BLEND_MODE_MULTIPLY => Some("GSK_BLEND_MODE_MULTIPLY")
      case GSK_BLEND_MODE_SCREEN => Some("GSK_BLEND_MODE_SCREEN")
      case GSK_BLEND_MODE_OVERLAY => Some("GSK_BLEND_MODE_OVERLAY")
      case GSK_BLEND_MODE_DARKEN => Some("GSK_BLEND_MODE_DARKEN")
      case GSK_BLEND_MODE_LIGHTEN => Some("GSK_BLEND_MODE_LIGHTEN")
      case GSK_BLEND_MODE_COLOR_DODGE => Some("GSK_BLEND_MODE_COLOR_DODGE")
      case GSK_BLEND_MODE_COLOR_BURN => Some("GSK_BLEND_MODE_COLOR_BURN")
      case GSK_BLEND_MODE_HARD_LIGHT => Some("GSK_BLEND_MODE_HARD_LIGHT")
      case GSK_BLEND_MODE_SOFT_LIGHT => Some("GSK_BLEND_MODE_SOFT_LIGHT")
      case GSK_BLEND_MODE_DIFFERENCE => Some("GSK_BLEND_MODE_DIFFERENCE")
      case GSK_BLEND_MODE_EXCLUSION => Some("GSK_BLEND_MODE_EXCLUSION")
      case GSK_BLEND_MODE_COLOR => Some("GSK_BLEND_MODE_COLOR")
      case GSK_BLEND_MODE_HUE => Some("GSK_BLEND_MODE_HUE")
      case GSK_BLEND_MODE_SATURATION => Some("GSK_BLEND_MODE_SATURATION")
      case GSK_BLEND_MODE_LUMINOSITY => Some("GSK_BLEND_MODE_LUMINOSITY")
      case _ => None
  extension (a: GskBlendMode)
    inline def &(b: GskBlendMode): GskBlendMode = a & b
    inline def |(b: GskBlendMode): GskBlendMode = a | b
    inline def is(b: GskBlendMode): Boolean = (a & b) == b

opaque type GskCorner = CUnsignedInt
object GskCorner extends CEnumU[GskCorner]:
  given _tag: Tag[GskCorner] = Tag.UInt
  inline def define(inline a: Long): GskCorner = a.toUInt
  val GSK_CORNER_TOP_LEFT = define(0)
  val GSK_CORNER_TOP_RIGHT = define(1)
  val GSK_CORNER_BOTTOM_RIGHT = define(2)
  val GSK_CORNER_BOTTOM_LEFT = define(3)
  inline def getName(inline value: GskCorner): Option[String] =
    value match
      case GSK_CORNER_TOP_LEFT => Some("GSK_CORNER_TOP_LEFT")
      case GSK_CORNER_TOP_RIGHT => Some("GSK_CORNER_TOP_RIGHT")
      case GSK_CORNER_BOTTOM_RIGHT => Some("GSK_CORNER_BOTTOM_RIGHT")
      case GSK_CORNER_BOTTOM_LEFT => Some("GSK_CORNER_BOTTOM_LEFT")
      case _ => None
  extension (a: GskCorner)
    inline def &(b: GskCorner): GskCorner = a & b
    inline def |(b: GskCorner): GskCorner = a | b
    inline def is(b: GskCorner): Boolean = (a & b) == b

opaque type GskGLUniformType = CUnsignedInt
object GskGLUniformType extends CEnumU[GskGLUniformType]:
  given _tag: Tag[GskGLUniformType] = Tag.UInt
  inline def define(inline a: Long): GskGLUniformType = a.toUInt
  val GSK_GL_UNIFORM_TYPE_NONE = define(0)
  val GSK_GL_UNIFORM_TYPE_FLOAT = define(1)
  val GSK_GL_UNIFORM_TYPE_INT = define(2)
  val GSK_GL_UNIFORM_TYPE_UINT = define(3)
  val GSK_GL_UNIFORM_TYPE_BOOL = define(4)
  val GSK_GL_UNIFORM_TYPE_VEC2 = define(5)
  val GSK_GL_UNIFORM_TYPE_VEC3 = define(6)
  val GSK_GL_UNIFORM_TYPE_VEC4 = define(7)
  inline def getName(inline value: GskGLUniformType): Option[String] =
    value match
      case GSK_GL_UNIFORM_TYPE_NONE => Some("GSK_GL_UNIFORM_TYPE_NONE")
      case GSK_GL_UNIFORM_TYPE_FLOAT => Some("GSK_GL_UNIFORM_TYPE_FLOAT")
      case GSK_GL_UNIFORM_TYPE_INT => Some("GSK_GL_UNIFORM_TYPE_INT")
      case GSK_GL_UNIFORM_TYPE_UINT => Some("GSK_GL_UNIFORM_TYPE_UINT")
      case GSK_GL_UNIFORM_TYPE_BOOL => Some("GSK_GL_UNIFORM_TYPE_BOOL")
      case GSK_GL_UNIFORM_TYPE_VEC2 => Some("GSK_GL_UNIFORM_TYPE_VEC2")
      case GSK_GL_UNIFORM_TYPE_VEC3 => Some("GSK_GL_UNIFORM_TYPE_VEC3")
      case GSK_GL_UNIFORM_TYPE_VEC4 => Some("GSK_GL_UNIFORM_TYPE_VEC4")
      case _ => None
  extension (a: GskGLUniformType)
    inline def &(b: GskGLUniformType): GskGLUniformType = a & b
    inline def |(b: GskGLUniformType): GskGLUniformType = a | b
    inline def is(b: GskGLUniformType): Boolean = (a & b) == b

opaque type GskRenderNodeType = CUnsignedInt
object GskRenderNodeType extends CEnumU[GskRenderNodeType]:
  given _tag: Tag[GskRenderNodeType] = Tag.UInt
  inline def define(inline a: Long): GskRenderNodeType = a.toUInt
  val GSK_NOT_A_RENDER_NODE = define(0)
  val GSK_CONTAINER_NODE = define(1)
  val GSK_CAIRO_NODE = define(2)
  val GSK_COLOR_NODE = define(3)
  val GSK_LINEAR_GRADIENT_NODE = define(4)
  val GSK_REPEATING_LINEAR_GRADIENT_NODE = define(5)
  val GSK_RADIAL_GRADIENT_NODE = define(6)
  val GSK_REPEATING_RADIAL_GRADIENT_NODE = define(7)
  val GSK_CONIC_GRADIENT_NODE = define(8)
  val GSK_BORDER_NODE = define(9)
  val GSK_TEXTURE_NODE = define(10)
  val GSK_INSET_SHADOW_NODE = define(11)
  val GSK_OUTSET_SHADOW_NODE = define(12)
  val GSK_TRANSFORM_NODE = define(13)
  val GSK_OPACITY_NODE = define(14)
  val GSK_COLOR_MATRIX_NODE = define(15)
  val GSK_REPEAT_NODE = define(16)
  val GSK_CLIP_NODE = define(17)
  val GSK_ROUNDED_CLIP_NODE = define(18)
  val GSK_SHADOW_NODE = define(19)
  val GSK_BLEND_NODE = define(20)
  val GSK_CROSS_FADE_NODE = define(21)
  val GSK_TEXT_NODE = define(22)
  val GSK_BLUR_NODE = define(23)
  val GSK_DEBUG_NODE = define(24)
  val GSK_GL_SHADER_NODE = define(25)
  inline def getName(inline value: GskRenderNodeType): Option[String] =
    value match
      case GSK_NOT_A_RENDER_NODE => Some("GSK_NOT_A_RENDER_NODE")
      case GSK_CONTAINER_NODE => Some("GSK_CONTAINER_NODE")
      case GSK_CAIRO_NODE => Some("GSK_CAIRO_NODE")
      case GSK_COLOR_NODE => Some("GSK_COLOR_NODE")
      case GSK_LINEAR_GRADIENT_NODE => Some("GSK_LINEAR_GRADIENT_NODE")
      case GSK_REPEATING_LINEAR_GRADIENT_NODE => Some("GSK_REPEATING_LINEAR_GRADIENT_NODE")
      case GSK_RADIAL_GRADIENT_NODE => Some("GSK_RADIAL_GRADIENT_NODE")
      case GSK_REPEATING_RADIAL_GRADIENT_NODE => Some("GSK_REPEATING_RADIAL_GRADIENT_NODE")
      case GSK_CONIC_GRADIENT_NODE => Some("GSK_CONIC_GRADIENT_NODE")
      case GSK_BORDER_NODE => Some("GSK_BORDER_NODE")
      case GSK_TEXTURE_NODE => Some("GSK_TEXTURE_NODE")
      case GSK_INSET_SHADOW_NODE => Some("GSK_INSET_SHADOW_NODE")
      case GSK_OUTSET_SHADOW_NODE => Some("GSK_OUTSET_SHADOW_NODE")
      case GSK_TRANSFORM_NODE => Some("GSK_TRANSFORM_NODE")
      case GSK_OPACITY_NODE => Some("GSK_OPACITY_NODE")
      case GSK_COLOR_MATRIX_NODE => Some("GSK_COLOR_MATRIX_NODE")
      case GSK_REPEAT_NODE => Some("GSK_REPEAT_NODE")
      case GSK_CLIP_NODE => Some("GSK_CLIP_NODE")
      case GSK_ROUNDED_CLIP_NODE => Some("GSK_ROUNDED_CLIP_NODE")
      case GSK_SHADOW_NODE => Some("GSK_SHADOW_NODE")
      case GSK_BLEND_NODE => Some("GSK_BLEND_NODE")
      case GSK_CROSS_FADE_NODE => Some("GSK_CROSS_FADE_NODE")
      case GSK_TEXT_NODE => Some("GSK_TEXT_NODE")
      case GSK_BLUR_NODE => Some("GSK_BLUR_NODE")
      case GSK_DEBUG_NODE => Some("GSK_DEBUG_NODE")
      case GSK_GL_SHADER_NODE => Some("GSK_GL_SHADER_NODE")
      case _ => None
  extension (a: GskRenderNodeType)
    inline def &(b: GskRenderNodeType): GskRenderNodeType = a & b
    inline def |(b: GskRenderNodeType): GskRenderNodeType = a | b
    inline def is(b: GskRenderNodeType): Boolean = (a & b) == b

opaque type GskScalingFilter = CUnsignedInt
object GskScalingFilter extends CEnumU[GskScalingFilter]:
  given _tag: Tag[GskScalingFilter] = Tag.UInt
  inline def define(inline a: Long): GskScalingFilter = a.toUInt
  val GSK_SCALING_FILTER_LINEAR = define(0)
  val GSK_SCALING_FILTER_NEAREST = define(1)
  val GSK_SCALING_FILTER_TRILINEAR = define(2)
  inline def getName(inline value: GskScalingFilter): Option[String] =
    value match
      case GSK_SCALING_FILTER_LINEAR => Some("GSK_SCALING_FILTER_LINEAR")
      case GSK_SCALING_FILTER_NEAREST => Some("GSK_SCALING_FILTER_NEAREST")
      case GSK_SCALING_FILTER_TRILINEAR => Some("GSK_SCALING_FILTER_TRILINEAR")
      case _ => None
  extension (a: GskScalingFilter)
    inline def &(b: GskScalingFilter): GskScalingFilter = a & b
    inline def |(b: GskScalingFilter): GskScalingFilter = a | b
    inline def is(b: GskScalingFilter): Boolean = (a & b) == b

opaque type GskSerializationError = CUnsignedInt
object GskSerializationError extends CEnumU[GskSerializationError]:
  given _tag: Tag[GskSerializationError] = Tag.UInt
  inline def define(inline a: Long): GskSerializationError = a.toUInt
  val GSK_SERIALIZATION_UNSUPPORTED_FORMAT = define(0)
  val GSK_SERIALIZATION_UNSUPPORTED_VERSION = define(1)
  val GSK_SERIALIZATION_INVALID_DATA = define(2)
  inline def getName(inline value: GskSerializationError): Option[String] =
    value match
      case GSK_SERIALIZATION_UNSUPPORTED_FORMAT => Some("GSK_SERIALIZATION_UNSUPPORTED_FORMAT")
      case GSK_SERIALIZATION_UNSUPPORTED_VERSION => Some("GSK_SERIALIZATION_UNSUPPORTED_VERSION")
      case GSK_SERIALIZATION_INVALID_DATA => Some("GSK_SERIALIZATION_INVALID_DATA")
      case _ => None
  extension (a: GskSerializationError)
    inline def &(b: GskSerializationError): GskSerializationError = a & b
    inline def |(b: GskSerializationError): GskSerializationError = a | b
    inline def is(b: GskSerializationError): Boolean = (a & b) == b

opaque type GskTransformCategory = CUnsignedInt
object GskTransformCategory extends CEnumU[GskTransformCategory]:
  given _tag: Tag[GskTransformCategory] = Tag.UInt
  inline def define(inline a: Long): GskTransformCategory = a.toUInt
  val GSK_TRANSFORM_CATEGORY_UNKNOWN = define(0)
  val GSK_TRANSFORM_CATEGORY_ANY = define(1)
  val GSK_TRANSFORM_CATEGORY_3D = define(2)
  val GSK_TRANSFORM_CATEGORY_2D = define(3)
  val GSK_TRANSFORM_CATEGORY_2D_AFFINE = define(4)
  val GSK_TRANSFORM_CATEGORY_2D_TRANSLATE = define(5)
  val GSK_TRANSFORM_CATEGORY_IDENTITY = define(6)
  inline def getName(inline value: GskTransformCategory): Option[String] =
    value match
      case GSK_TRANSFORM_CATEGORY_UNKNOWN => Some("GSK_TRANSFORM_CATEGORY_UNKNOWN")
      case GSK_TRANSFORM_CATEGORY_ANY => Some("GSK_TRANSFORM_CATEGORY_ANY")
      case GSK_TRANSFORM_CATEGORY_3D => Some("GSK_TRANSFORM_CATEGORY_3D")
      case GSK_TRANSFORM_CATEGORY_2D => Some("GSK_TRANSFORM_CATEGORY_2D")
      case GSK_TRANSFORM_CATEGORY_2D_AFFINE => Some("GSK_TRANSFORM_CATEGORY_2D_AFFINE")
      case GSK_TRANSFORM_CATEGORY_2D_TRANSLATE => Some("GSK_TRANSFORM_CATEGORY_2D_TRANSLATE")
      case GSK_TRANSFORM_CATEGORY_IDENTITY => Some("GSK_TRANSFORM_CATEGORY_IDENTITY")
      case _ => None
  extension (a: GskTransformCategory)
    inline def &(b: GskTransformCategory): GskTransformCategory = a & b
    inline def |(b: GskTransformCategory): GskTransformCategory = a | b
    inline def is(b: GskTransformCategory): Boolean = (a & b) == b

opaque type GtkAccessibleAutocomplete = CUnsignedInt
object GtkAccessibleAutocomplete extends CEnumU[GtkAccessibleAutocomplete]:
  given _tag: Tag[GtkAccessibleAutocomplete] = Tag.UInt
  inline def define(inline a: Long): GtkAccessibleAutocomplete = a.toUInt
  val GTK_ACCESSIBLE_AUTOCOMPLETE_NONE = define(0)
  val GTK_ACCESSIBLE_AUTOCOMPLETE_INLINE = define(1)
  val GTK_ACCESSIBLE_AUTOCOMPLETE_LIST = define(2)
  val GTK_ACCESSIBLE_AUTOCOMPLETE_BOTH = define(3)
  inline def getName(inline value: GtkAccessibleAutocomplete): Option[String] =
    value match
      case GTK_ACCESSIBLE_AUTOCOMPLETE_NONE => Some("GTK_ACCESSIBLE_AUTOCOMPLETE_NONE")
      case GTK_ACCESSIBLE_AUTOCOMPLETE_INLINE => Some("GTK_ACCESSIBLE_AUTOCOMPLETE_INLINE")
      case GTK_ACCESSIBLE_AUTOCOMPLETE_LIST => Some("GTK_ACCESSIBLE_AUTOCOMPLETE_LIST")
      case GTK_ACCESSIBLE_AUTOCOMPLETE_BOTH => Some("GTK_ACCESSIBLE_AUTOCOMPLETE_BOTH")
      case _ => None
  extension (a: GtkAccessibleAutocomplete)
    inline def &(b: GtkAccessibleAutocomplete): GtkAccessibleAutocomplete = a & b
    inline def |(b: GtkAccessibleAutocomplete): GtkAccessibleAutocomplete = a | b
    inline def is(b: GtkAccessibleAutocomplete): Boolean = (a & b) == b

opaque type GtkAccessibleInvalidState = CUnsignedInt
object GtkAccessibleInvalidState extends CEnumU[GtkAccessibleInvalidState]:
  given _tag: Tag[GtkAccessibleInvalidState] = Tag.UInt
  inline def define(inline a: Long): GtkAccessibleInvalidState = a.toUInt
  val GTK_ACCESSIBLE_INVALID_FALSE = define(0)
  val GTK_ACCESSIBLE_INVALID_TRUE = define(1)
  val GTK_ACCESSIBLE_INVALID_GRAMMAR = define(2)
  val GTK_ACCESSIBLE_INVALID_SPELLING = define(3)
  inline def getName(inline value: GtkAccessibleInvalidState): Option[String] =
    value match
      case GTK_ACCESSIBLE_INVALID_FALSE => Some("GTK_ACCESSIBLE_INVALID_FALSE")
      case GTK_ACCESSIBLE_INVALID_TRUE => Some("GTK_ACCESSIBLE_INVALID_TRUE")
      case GTK_ACCESSIBLE_INVALID_GRAMMAR => Some("GTK_ACCESSIBLE_INVALID_GRAMMAR")
      case GTK_ACCESSIBLE_INVALID_SPELLING => Some("GTK_ACCESSIBLE_INVALID_SPELLING")
      case _ => None
  extension (a: GtkAccessibleInvalidState)
    inline def &(b: GtkAccessibleInvalidState): GtkAccessibleInvalidState = a & b
    inline def |(b: GtkAccessibleInvalidState): GtkAccessibleInvalidState = a | b
    inline def is(b: GtkAccessibleInvalidState): Boolean = (a & b) == b

opaque type GtkAccessibleProperty = CUnsignedInt
object GtkAccessibleProperty extends CEnumU[GtkAccessibleProperty]:
  given _tag: Tag[GtkAccessibleProperty] = Tag.UInt
  inline def define(inline a: Long): GtkAccessibleProperty = a.toUInt
  val GTK_ACCESSIBLE_PROPERTY_AUTOCOMPLETE = define(0)
  val GTK_ACCESSIBLE_PROPERTY_DESCRIPTION = define(1)
  val GTK_ACCESSIBLE_PROPERTY_HAS_POPUP = define(2)
  val GTK_ACCESSIBLE_PROPERTY_KEY_SHORTCUTS = define(3)
  val GTK_ACCESSIBLE_PROPERTY_LABEL = define(4)
  val GTK_ACCESSIBLE_PROPERTY_LEVEL = define(5)
  val GTK_ACCESSIBLE_PROPERTY_MODAL = define(6)
  val GTK_ACCESSIBLE_PROPERTY_MULTI_LINE = define(7)
  val GTK_ACCESSIBLE_PROPERTY_MULTI_SELECTABLE = define(8)
  val GTK_ACCESSIBLE_PROPERTY_ORIENTATION = define(9)
  val GTK_ACCESSIBLE_PROPERTY_PLACEHOLDER = define(10)
  val GTK_ACCESSIBLE_PROPERTY_READ_ONLY = define(11)
  val GTK_ACCESSIBLE_PROPERTY_REQUIRED = define(12)
  val GTK_ACCESSIBLE_PROPERTY_ROLE_DESCRIPTION = define(13)
  val GTK_ACCESSIBLE_PROPERTY_SORT = define(14)
  val GTK_ACCESSIBLE_PROPERTY_VALUE_MAX = define(15)
  val GTK_ACCESSIBLE_PROPERTY_VALUE_MIN = define(16)
  val GTK_ACCESSIBLE_PROPERTY_VALUE_NOW = define(17)
  val GTK_ACCESSIBLE_PROPERTY_VALUE_TEXT = define(18)
  inline def getName(inline value: GtkAccessibleProperty): Option[String] =
    value match
      case GTK_ACCESSIBLE_PROPERTY_AUTOCOMPLETE => Some("GTK_ACCESSIBLE_PROPERTY_AUTOCOMPLETE")
      case GTK_ACCESSIBLE_PROPERTY_DESCRIPTION => Some("GTK_ACCESSIBLE_PROPERTY_DESCRIPTION")
      case GTK_ACCESSIBLE_PROPERTY_HAS_POPUP => Some("GTK_ACCESSIBLE_PROPERTY_HAS_POPUP")
      case GTK_ACCESSIBLE_PROPERTY_KEY_SHORTCUTS => Some("GTK_ACCESSIBLE_PROPERTY_KEY_SHORTCUTS")
      case GTK_ACCESSIBLE_PROPERTY_LABEL => Some("GTK_ACCESSIBLE_PROPERTY_LABEL")
      case GTK_ACCESSIBLE_PROPERTY_LEVEL => Some("GTK_ACCESSIBLE_PROPERTY_LEVEL")
      case GTK_ACCESSIBLE_PROPERTY_MODAL => Some("GTK_ACCESSIBLE_PROPERTY_MODAL")
      case GTK_ACCESSIBLE_PROPERTY_MULTI_LINE => Some("GTK_ACCESSIBLE_PROPERTY_MULTI_LINE")
      case GTK_ACCESSIBLE_PROPERTY_MULTI_SELECTABLE => Some("GTK_ACCESSIBLE_PROPERTY_MULTI_SELECTABLE")
      case GTK_ACCESSIBLE_PROPERTY_ORIENTATION => Some("GTK_ACCESSIBLE_PROPERTY_ORIENTATION")
      case GTK_ACCESSIBLE_PROPERTY_PLACEHOLDER => Some("GTK_ACCESSIBLE_PROPERTY_PLACEHOLDER")
      case GTK_ACCESSIBLE_PROPERTY_READ_ONLY => Some("GTK_ACCESSIBLE_PROPERTY_READ_ONLY")
      case GTK_ACCESSIBLE_PROPERTY_REQUIRED => Some("GTK_ACCESSIBLE_PROPERTY_REQUIRED")
      case GTK_ACCESSIBLE_PROPERTY_ROLE_DESCRIPTION => Some("GTK_ACCESSIBLE_PROPERTY_ROLE_DESCRIPTION")
      case GTK_ACCESSIBLE_PROPERTY_SORT => Some("GTK_ACCESSIBLE_PROPERTY_SORT")
      case GTK_ACCESSIBLE_PROPERTY_VALUE_MAX => Some("GTK_ACCESSIBLE_PROPERTY_VALUE_MAX")
      case GTK_ACCESSIBLE_PROPERTY_VALUE_MIN => Some("GTK_ACCESSIBLE_PROPERTY_VALUE_MIN")
      case GTK_ACCESSIBLE_PROPERTY_VALUE_NOW => Some("GTK_ACCESSIBLE_PROPERTY_VALUE_NOW")
      case GTK_ACCESSIBLE_PROPERTY_VALUE_TEXT => Some("GTK_ACCESSIBLE_PROPERTY_VALUE_TEXT")
      case _ => None
  extension (a: GtkAccessibleProperty)
    inline def &(b: GtkAccessibleProperty): GtkAccessibleProperty = a & b
    inline def |(b: GtkAccessibleProperty): GtkAccessibleProperty = a | b
    inline def is(b: GtkAccessibleProperty): Boolean = (a & b) == b

opaque type GtkAccessibleRelation = CUnsignedInt
object GtkAccessibleRelation extends CEnumU[GtkAccessibleRelation]:
  given _tag: Tag[GtkAccessibleRelation] = Tag.UInt
  inline def define(inline a: Long): GtkAccessibleRelation = a.toUInt
  val GTK_ACCESSIBLE_RELATION_ACTIVE_DESCENDANT = define(0)
  val GTK_ACCESSIBLE_RELATION_COL_COUNT = define(1)
  val GTK_ACCESSIBLE_RELATION_COL_INDEX = define(2)
  val GTK_ACCESSIBLE_RELATION_COL_INDEX_TEXT = define(3)
  val GTK_ACCESSIBLE_RELATION_COL_SPAN = define(4)
  val GTK_ACCESSIBLE_RELATION_CONTROLS = define(5)
  val GTK_ACCESSIBLE_RELATION_DESCRIBED_BY = define(6)
  val GTK_ACCESSIBLE_RELATION_DETAILS = define(7)
  val GTK_ACCESSIBLE_RELATION_ERROR_MESSAGE = define(8)
  val GTK_ACCESSIBLE_RELATION_FLOW_TO = define(9)
  val GTK_ACCESSIBLE_RELATION_LABELLED_BY = define(10)
  val GTK_ACCESSIBLE_RELATION_OWNS = define(11)
  val GTK_ACCESSIBLE_RELATION_POS_IN_SET = define(12)
  val GTK_ACCESSIBLE_RELATION_ROW_COUNT = define(13)
  val GTK_ACCESSIBLE_RELATION_ROW_INDEX = define(14)
  val GTK_ACCESSIBLE_RELATION_ROW_INDEX_TEXT = define(15)
  val GTK_ACCESSIBLE_RELATION_ROW_SPAN = define(16)
  val GTK_ACCESSIBLE_RELATION_SET_SIZE = define(17)
  inline def getName(inline value: GtkAccessibleRelation): Option[String] =
    value match
      case GTK_ACCESSIBLE_RELATION_ACTIVE_DESCENDANT => Some("GTK_ACCESSIBLE_RELATION_ACTIVE_DESCENDANT")
      case GTK_ACCESSIBLE_RELATION_COL_COUNT => Some("GTK_ACCESSIBLE_RELATION_COL_COUNT")
      case GTK_ACCESSIBLE_RELATION_COL_INDEX => Some("GTK_ACCESSIBLE_RELATION_COL_INDEX")
      case GTK_ACCESSIBLE_RELATION_COL_INDEX_TEXT => Some("GTK_ACCESSIBLE_RELATION_COL_INDEX_TEXT")
      case GTK_ACCESSIBLE_RELATION_COL_SPAN => Some("GTK_ACCESSIBLE_RELATION_COL_SPAN")
      case GTK_ACCESSIBLE_RELATION_CONTROLS => Some("GTK_ACCESSIBLE_RELATION_CONTROLS")
      case GTK_ACCESSIBLE_RELATION_DESCRIBED_BY => Some("GTK_ACCESSIBLE_RELATION_DESCRIBED_BY")
      case GTK_ACCESSIBLE_RELATION_DETAILS => Some("GTK_ACCESSIBLE_RELATION_DETAILS")
      case GTK_ACCESSIBLE_RELATION_ERROR_MESSAGE => Some("GTK_ACCESSIBLE_RELATION_ERROR_MESSAGE")
      case GTK_ACCESSIBLE_RELATION_FLOW_TO => Some("GTK_ACCESSIBLE_RELATION_FLOW_TO")
      case GTK_ACCESSIBLE_RELATION_LABELLED_BY => Some("GTK_ACCESSIBLE_RELATION_LABELLED_BY")
      case GTK_ACCESSIBLE_RELATION_OWNS => Some("GTK_ACCESSIBLE_RELATION_OWNS")
      case GTK_ACCESSIBLE_RELATION_POS_IN_SET => Some("GTK_ACCESSIBLE_RELATION_POS_IN_SET")
      case GTK_ACCESSIBLE_RELATION_ROW_COUNT => Some("GTK_ACCESSIBLE_RELATION_ROW_COUNT")
      case GTK_ACCESSIBLE_RELATION_ROW_INDEX => Some("GTK_ACCESSIBLE_RELATION_ROW_INDEX")
      case GTK_ACCESSIBLE_RELATION_ROW_INDEX_TEXT => Some("GTK_ACCESSIBLE_RELATION_ROW_INDEX_TEXT")
      case GTK_ACCESSIBLE_RELATION_ROW_SPAN => Some("GTK_ACCESSIBLE_RELATION_ROW_SPAN")
      case GTK_ACCESSIBLE_RELATION_SET_SIZE => Some("GTK_ACCESSIBLE_RELATION_SET_SIZE")
      case _ => None
  extension (a: GtkAccessibleRelation)
    inline def &(b: GtkAccessibleRelation): GtkAccessibleRelation = a & b
    inline def |(b: GtkAccessibleRelation): GtkAccessibleRelation = a | b
    inline def is(b: GtkAccessibleRelation): Boolean = (a & b) == b

opaque type GtkAccessibleRole = CUnsignedInt
object GtkAccessibleRole extends CEnumU[GtkAccessibleRole]:
  given _tag: Tag[GtkAccessibleRole] = Tag.UInt
  inline def define(inline a: Long): GtkAccessibleRole = a.toUInt
  val GTK_ACCESSIBLE_ROLE_ALERT = define(0)
  val GTK_ACCESSIBLE_ROLE_ALERT_DIALOG = define(1)
  val GTK_ACCESSIBLE_ROLE_BANNER = define(2)
  val GTK_ACCESSIBLE_ROLE_BUTTON = define(3)
  val GTK_ACCESSIBLE_ROLE_CAPTION = define(4)
  val GTK_ACCESSIBLE_ROLE_CELL = define(5)
  val GTK_ACCESSIBLE_ROLE_CHECKBOX = define(6)
  val GTK_ACCESSIBLE_ROLE_COLUMN_HEADER = define(7)
  val GTK_ACCESSIBLE_ROLE_COMBO_BOX = define(8)
  val GTK_ACCESSIBLE_ROLE_COMMAND = define(9)
  val GTK_ACCESSIBLE_ROLE_COMPOSITE = define(10)
  val GTK_ACCESSIBLE_ROLE_DIALOG = define(11)
  val GTK_ACCESSIBLE_ROLE_DOCUMENT = define(12)
  val GTK_ACCESSIBLE_ROLE_FEED = define(13)
  val GTK_ACCESSIBLE_ROLE_FORM = define(14)
  val GTK_ACCESSIBLE_ROLE_GENERIC = define(15)
  val GTK_ACCESSIBLE_ROLE_GRID = define(16)
  val GTK_ACCESSIBLE_ROLE_GRID_CELL = define(17)
  val GTK_ACCESSIBLE_ROLE_GROUP = define(18)
  val GTK_ACCESSIBLE_ROLE_HEADING = define(19)
  val GTK_ACCESSIBLE_ROLE_IMG = define(20)
  val GTK_ACCESSIBLE_ROLE_INPUT = define(21)
  val GTK_ACCESSIBLE_ROLE_LABEL = define(22)
  val GTK_ACCESSIBLE_ROLE_LANDMARK = define(23)
  val GTK_ACCESSIBLE_ROLE_LEGEND = define(24)
  val GTK_ACCESSIBLE_ROLE_LINK = define(25)
  val GTK_ACCESSIBLE_ROLE_LIST = define(26)
  val GTK_ACCESSIBLE_ROLE_LIST_BOX = define(27)
  val GTK_ACCESSIBLE_ROLE_LIST_ITEM = define(28)
  val GTK_ACCESSIBLE_ROLE_LOG = define(29)
  val GTK_ACCESSIBLE_ROLE_MAIN = define(30)
  val GTK_ACCESSIBLE_ROLE_MARQUEE = define(31)
  val GTK_ACCESSIBLE_ROLE_MATH = define(32)
  val GTK_ACCESSIBLE_ROLE_METER = define(33)
  val GTK_ACCESSIBLE_ROLE_MENU = define(34)
  val GTK_ACCESSIBLE_ROLE_MENU_BAR = define(35)
  val GTK_ACCESSIBLE_ROLE_MENU_ITEM = define(36)
  val GTK_ACCESSIBLE_ROLE_MENU_ITEM_CHECKBOX = define(37)
  val GTK_ACCESSIBLE_ROLE_MENU_ITEM_RADIO = define(38)
  val GTK_ACCESSIBLE_ROLE_NAVIGATION = define(39)
  val GTK_ACCESSIBLE_ROLE_NONE = define(40)
  val GTK_ACCESSIBLE_ROLE_NOTE = define(41)
  val GTK_ACCESSIBLE_ROLE_OPTION = define(42)
  val GTK_ACCESSIBLE_ROLE_PRESENTATION = define(43)
  val GTK_ACCESSIBLE_ROLE_PROGRESS_BAR = define(44)
  val GTK_ACCESSIBLE_ROLE_RADIO = define(45)
  val GTK_ACCESSIBLE_ROLE_RADIO_GROUP = define(46)
  val GTK_ACCESSIBLE_ROLE_RANGE = define(47)
  val GTK_ACCESSIBLE_ROLE_REGION = define(48)
  val GTK_ACCESSIBLE_ROLE_ROW = define(49)
  val GTK_ACCESSIBLE_ROLE_ROW_GROUP = define(50)
  val GTK_ACCESSIBLE_ROLE_ROW_HEADER = define(51)
  val GTK_ACCESSIBLE_ROLE_SCROLLBAR = define(52)
  val GTK_ACCESSIBLE_ROLE_SEARCH = define(53)
  val GTK_ACCESSIBLE_ROLE_SEARCH_BOX = define(54)
  val GTK_ACCESSIBLE_ROLE_SECTION = define(55)
  val GTK_ACCESSIBLE_ROLE_SECTION_HEAD = define(56)
  val GTK_ACCESSIBLE_ROLE_SELECT = define(57)
  val GTK_ACCESSIBLE_ROLE_SEPARATOR = define(58)
  val GTK_ACCESSIBLE_ROLE_SLIDER = define(59)
  val GTK_ACCESSIBLE_ROLE_SPIN_BUTTON = define(60)
  val GTK_ACCESSIBLE_ROLE_STATUS = define(61)
  val GTK_ACCESSIBLE_ROLE_STRUCTURE = define(62)
  val GTK_ACCESSIBLE_ROLE_SWITCH = define(63)
  val GTK_ACCESSIBLE_ROLE_TAB = define(64)
  val GTK_ACCESSIBLE_ROLE_TABLE = define(65)
  val GTK_ACCESSIBLE_ROLE_TAB_LIST = define(66)
  val GTK_ACCESSIBLE_ROLE_TAB_PANEL = define(67)
  val GTK_ACCESSIBLE_ROLE_TEXT_BOX = define(68)
  val GTK_ACCESSIBLE_ROLE_TIME = define(69)
  val GTK_ACCESSIBLE_ROLE_TIMER = define(70)
  val GTK_ACCESSIBLE_ROLE_TOOLBAR = define(71)
  val GTK_ACCESSIBLE_ROLE_TOOLTIP = define(72)
  val GTK_ACCESSIBLE_ROLE_TREE = define(73)
  val GTK_ACCESSIBLE_ROLE_TREE_GRID = define(74)
  val GTK_ACCESSIBLE_ROLE_TREE_ITEM = define(75)
  val GTK_ACCESSIBLE_ROLE_WIDGET = define(76)
  val GTK_ACCESSIBLE_ROLE_WINDOW = define(77)
  inline def getName(inline value: GtkAccessibleRole): Option[String] =
    value match
      case GTK_ACCESSIBLE_ROLE_ALERT => Some("GTK_ACCESSIBLE_ROLE_ALERT")
      case GTK_ACCESSIBLE_ROLE_ALERT_DIALOG => Some("GTK_ACCESSIBLE_ROLE_ALERT_DIALOG")
      case GTK_ACCESSIBLE_ROLE_BANNER => Some("GTK_ACCESSIBLE_ROLE_BANNER")
      case GTK_ACCESSIBLE_ROLE_BUTTON => Some("GTK_ACCESSIBLE_ROLE_BUTTON")
      case GTK_ACCESSIBLE_ROLE_CAPTION => Some("GTK_ACCESSIBLE_ROLE_CAPTION")
      case GTK_ACCESSIBLE_ROLE_CELL => Some("GTK_ACCESSIBLE_ROLE_CELL")
      case GTK_ACCESSIBLE_ROLE_CHECKBOX => Some("GTK_ACCESSIBLE_ROLE_CHECKBOX")
      case GTK_ACCESSIBLE_ROLE_COLUMN_HEADER => Some("GTK_ACCESSIBLE_ROLE_COLUMN_HEADER")
      case GTK_ACCESSIBLE_ROLE_COMBO_BOX => Some("GTK_ACCESSIBLE_ROLE_COMBO_BOX")
      case GTK_ACCESSIBLE_ROLE_COMMAND => Some("GTK_ACCESSIBLE_ROLE_COMMAND")
      case GTK_ACCESSIBLE_ROLE_COMPOSITE => Some("GTK_ACCESSIBLE_ROLE_COMPOSITE")
      case GTK_ACCESSIBLE_ROLE_DIALOG => Some("GTK_ACCESSIBLE_ROLE_DIALOG")
      case GTK_ACCESSIBLE_ROLE_DOCUMENT => Some("GTK_ACCESSIBLE_ROLE_DOCUMENT")
      case GTK_ACCESSIBLE_ROLE_FEED => Some("GTK_ACCESSIBLE_ROLE_FEED")
      case GTK_ACCESSIBLE_ROLE_FORM => Some("GTK_ACCESSIBLE_ROLE_FORM")
      case GTK_ACCESSIBLE_ROLE_GENERIC => Some("GTK_ACCESSIBLE_ROLE_GENERIC")
      case GTK_ACCESSIBLE_ROLE_GRID => Some("GTK_ACCESSIBLE_ROLE_GRID")
      case GTK_ACCESSIBLE_ROLE_GRID_CELL => Some("GTK_ACCESSIBLE_ROLE_GRID_CELL")
      case GTK_ACCESSIBLE_ROLE_GROUP => Some("GTK_ACCESSIBLE_ROLE_GROUP")
      case GTK_ACCESSIBLE_ROLE_HEADING => Some("GTK_ACCESSIBLE_ROLE_HEADING")
      case GTK_ACCESSIBLE_ROLE_IMG => Some("GTK_ACCESSIBLE_ROLE_IMG")
      case GTK_ACCESSIBLE_ROLE_INPUT => Some("GTK_ACCESSIBLE_ROLE_INPUT")
      case GTK_ACCESSIBLE_ROLE_LABEL => Some("GTK_ACCESSIBLE_ROLE_LABEL")
      case GTK_ACCESSIBLE_ROLE_LANDMARK => Some("GTK_ACCESSIBLE_ROLE_LANDMARK")
      case GTK_ACCESSIBLE_ROLE_LEGEND => Some("GTK_ACCESSIBLE_ROLE_LEGEND")
      case GTK_ACCESSIBLE_ROLE_LINK => Some("GTK_ACCESSIBLE_ROLE_LINK")
      case GTK_ACCESSIBLE_ROLE_LIST => Some("GTK_ACCESSIBLE_ROLE_LIST")
      case GTK_ACCESSIBLE_ROLE_LIST_BOX => Some("GTK_ACCESSIBLE_ROLE_LIST_BOX")
      case GTK_ACCESSIBLE_ROLE_LIST_ITEM => Some("GTK_ACCESSIBLE_ROLE_LIST_ITEM")
      case GTK_ACCESSIBLE_ROLE_LOG => Some("GTK_ACCESSIBLE_ROLE_LOG")
      case GTK_ACCESSIBLE_ROLE_MAIN => Some("GTK_ACCESSIBLE_ROLE_MAIN")
      case GTK_ACCESSIBLE_ROLE_MARQUEE => Some("GTK_ACCESSIBLE_ROLE_MARQUEE")
      case GTK_ACCESSIBLE_ROLE_MATH => Some("GTK_ACCESSIBLE_ROLE_MATH")
      case GTK_ACCESSIBLE_ROLE_METER => Some("GTK_ACCESSIBLE_ROLE_METER")
      case GTK_ACCESSIBLE_ROLE_MENU => Some("GTK_ACCESSIBLE_ROLE_MENU")
      case GTK_ACCESSIBLE_ROLE_MENU_BAR => Some("GTK_ACCESSIBLE_ROLE_MENU_BAR")
      case GTK_ACCESSIBLE_ROLE_MENU_ITEM => Some("GTK_ACCESSIBLE_ROLE_MENU_ITEM")
      case GTK_ACCESSIBLE_ROLE_MENU_ITEM_CHECKBOX => Some("GTK_ACCESSIBLE_ROLE_MENU_ITEM_CHECKBOX")
      case GTK_ACCESSIBLE_ROLE_MENU_ITEM_RADIO => Some("GTK_ACCESSIBLE_ROLE_MENU_ITEM_RADIO")
      case GTK_ACCESSIBLE_ROLE_NAVIGATION => Some("GTK_ACCESSIBLE_ROLE_NAVIGATION")
      case GTK_ACCESSIBLE_ROLE_NONE => Some("GTK_ACCESSIBLE_ROLE_NONE")
      case GTK_ACCESSIBLE_ROLE_NOTE => Some("GTK_ACCESSIBLE_ROLE_NOTE")
      case GTK_ACCESSIBLE_ROLE_OPTION => Some("GTK_ACCESSIBLE_ROLE_OPTION")
      case GTK_ACCESSIBLE_ROLE_PRESENTATION => Some("GTK_ACCESSIBLE_ROLE_PRESENTATION")
      case GTK_ACCESSIBLE_ROLE_PROGRESS_BAR => Some("GTK_ACCESSIBLE_ROLE_PROGRESS_BAR")
      case GTK_ACCESSIBLE_ROLE_RADIO => Some("GTK_ACCESSIBLE_ROLE_RADIO")
      case GTK_ACCESSIBLE_ROLE_RADIO_GROUP => Some("GTK_ACCESSIBLE_ROLE_RADIO_GROUP")
      case GTK_ACCESSIBLE_ROLE_RANGE => Some("GTK_ACCESSIBLE_ROLE_RANGE")
      case GTK_ACCESSIBLE_ROLE_REGION => Some("GTK_ACCESSIBLE_ROLE_REGION")
      case GTK_ACCESSIBLE_ROLE_ROW => Some("GTK_ACCESSIBLE_ROLE_ROW")
      case GTK_ACCESSIBLE_ROLE_ROW_GROUP => Some("GTK_ACCESSIBLE_ROLE_ROW_GROUP")
      case GTK_ACCESSIBLE_ROLE_ROW_HEADER => Some("GTK_ACCESSIBLE_ROLE_ROW_HEADER")
      case GTK_ACCESSIBLE_ROLE_SCROLLBAR => Some("GTK_ACCESSIBLE_ROLE_SCROLLBAR")
      case GTK_ACCESSIBLE_ROLE_SEARCH => Some("GTK_ACCESSIBLE_ROLE_SEARCH")
      case GTK_ACCESSIBLE_ROLE_SEARCH_BOX => Some("GTK_ACCESSIBLE_ROLE_SEARCH_BOX")
      case GTK_ACCESSIBLE_ROLE_SECTION => Some("GTK_ACCESSIBLE_ROLE_SECTION")
      case GTK_ACCESSIBLE_ROLE_SECTION_HEAD => Some("GTK_ACCESSIBLE_ROLE_SECTION_HEAD")
      case GTK_ACCESSIBLE_ROLE_SELECT => Some("GTK_ACCESSIBLE_ROLE_SELECT")
      case GTK_ACCESSIBLE_ROLE_SEPARATOR => Some("GTK_ACCESSIBLE_ROLE_SEPARATOR")
      case GTK_ACCESSIBLE_ROLE_SLIDER => Some("GTK_ACCESSIBLE_ROLE_SLIDER")
      case GTK_ACCESSIBLE_ROLE_SPIN_BUTTON => Some("GTK_ACCESSIBLE_ROLE_SPIN_BUTTON")
      case GTK_ACCESSIBLE_ROLE_STATUS => Some("GTK_ACCESSIBLE_ROLE_STATUS")
      case GTK_ACCESSIBLE_ROLE_STRUCTURE => Some("GTK_ACCESSIBLE_ROLE_STRUCTURE")
      case GTK_ACCESSIBLE_ROLE_SWITCH => Some("GTK_ACCESSIBLE_ROLE_SWITCH")
      case GTK_ACCESSIBLE_ROLE_TAB => Some("GTK_ACCESSIBLE_ROLE_TAB")
      case GTK_ACCESSIBLE_ROLE_TABLE => Some("GTK_ACCESSIBLE_ROLE_TABLE")
      case GTK_ACCESSIBLE_ROLE_TAB_LIST => Some("GTK_ACCESSIBLE_ROLE_TAB_LIST")
      case GTK_ACCESSIBLE_ROLE_TAB_PANEL => Some("GTK_ACCESSIBLE_ROLE_TAB_PANEL")
      case GTK_ACCESSIBLE_ROLE_TEXT_BOX => Some("GTK_ACCESSIBLE_ROLE_TEXT_BOX")
      case GTK_ACCESSIBLE_ROLE_TIME => Some("GTK_ACCESSIBLE_ROLE_TIME")
      case GTK_ACCESSIBLE_ROLE_TIMER => Some("GTK_ACCESSIBLE_ROLE_TIMER")
      case GTK_ACCESSIBLE_ROLE_TOOLBAR => Some("GTK_ACCESSIBLE_ROLE_TOOLBAR")
      case GTK_ACCESSIBLE_ROLE_TOOLTIP => Some("GTK_ACCESSIBLE_ROLE_TOOLTIP")
      case GTK_ACCESSIBLE_ROLE_TREE => Some("GTK_ACCESSIBLE_ROLE_TREE")
      case GTK_ACCESSIBLE_ROLE_TREE_GRID => Some("GTK_ACCESSIBLE_ROLE_TREE_GRID")
      case GTK_ACCESSIBLE_ROLE_TREE_ITEM => Some("GTK_ACCESSIBLE_ROLE_TREE_ITEM")
      case GTK_ACCESSIBLE_ROLE_WIDGET => Some("GTK_ACCESSIBLE_ROLE_WIDGET")
      case GTK_ACCESSIBLE_ROLE_WINDOW => Some("GTK_ACCESSIBLE_ROLE_WINDOW")
      case _ => None
  extension (a: GtkAccessibleRole)
    inline def &(b: GtkAccessibleRole): GtkAccessibleRole = a & b
    inline def |(b: GtkAccessibleRole): GtkAccessibleRole = a | b
    inline def is(b: GtkAccessibleRole): Boolean = (a & b) == b

opaque type GtkAccessibleSort = CUnsignedInt
object GtkAccessibleSort extends CEnumU[GtkAccessibleSort]:
  given _tag: Tag[GtkAccessibleSort] = Tag.UInt
  inline def define(inline a: Long): GtkAccessibleSort = a.toUInt
  val GTK_ACCESSIBLE_SORT_NONE = define(0)
  val GTK_ACCESSIBLE_SORT_ASCENDING = define(1)
  val GTK_ACCESSIBLE_SORT_DESCENDING = define(2)
  val GTK_ACCESSIBLE_SORT_OTHER = define(3)
  inline def getName(inline value: GtkAccessibleSort): Option[String] =
    value match
      case GTK_ACCESSIBLE_SORT_NONE => Some("GTK_ACCESSIBLE_SORT_NONE")
      case GTK_ACCESSIBLE_SORT_ASCENDING => Some("GTK_ACCESSIBLE_SORT_ASCENDING")
      case GTK_ACCESSIBLE_SORT_DESCENDING => Some("GTK_ACCESSIBLE_SORT_DESCENDING")
      case GTK_ACCESSIBLE_SORT_OTHER => Some("GTK_ACCESSIBLE_SORT_OTHER")
      case _ => None
  extension (a: GtkAccessibleSort)
    inline def &(b: GtkAccessibleSort): GtkAccessibleSort = a & b
    inline def |(b: GtkAccessibleSort): GtkAccessibleSort = a | b
    inline def is(b: GtkAccessibleSort): Boolean = (a & b) == b

opaque type GtkAccessibleState = CUnsignedInt
object GtkAccessibleState extends CEnumU[GtkAccessibleState]:
  given _tag: Tag[GtkAccessibleState] = Tag.UInt
  inline def define(inline a: Long): GtkAccessibleState = a.toUInt
  val GTK_ACCESSIBLE_STATE_BUSY = define(0)
  val GTK_ACCESSIBLE_STATE_CHECKED = define(1)
  val GTK_ACCESSIBLE_STATE_DISABLED = define(2)
  val GTK_ACCESSIBLE_STATE_EXPANDED = define(3)
  val GTK_ACCESSIBLE_STATE_HIDDEN = define(4)
  val GTK_ACCESSIBLE_STATE_INVALID = define(5)
  val GTK_ACCESSIBLE_STATE_PRESSED = define(6)
  val GTK_ACCESSIBLE_STATE_SELECTED = define(7)
  inline def getName(inline value: GtkAccessibleState): Option[String] =
    value match
      case GTK_ACCESSIBLE_STATE_BUSY => Some("GTK_ACCESSIBLE_STATE_BUSY")
      case GTK_ACCESSIBLE_STATE_CHECKED => Some("GTK_ACCESSIBLE_STATE_CHECKED")
      case GTK_ACCESSIBLE_STATE_DISABLED => Some("GTK_ACCESSIBLE_STATE_DISABLED")
      case GTK_ACCESSIBLE_STATE_EXPANDED => Some("GTK_ACCESSIBLE_STATE_EXPANDED")
      case GTK_ACCESSIBLE_STATE_HIDDEN => Some("GTK_ACCESSIBLE_STATE_HIDDEN")
      case GTK_ACCESSIBLE_STATE_INVALID => Some("GTK_ACCESSIBLE_STATE_INVALID")
      case GTK_ACCESSIBLE_STATE_PRESSED => Some("GTK_ACCESSIBLE_STATE_PRESSED")
      case GTK_ACCESSIBLE_STATE_SELECTED => Some("GTK_ACCESSIBLE_STATE_SELECTED")
      case _ => None
  extension (a: GtkAccessibleState)
    inline def &(b: GtkAccessibleState): GtkAccessibleState = a & b
    inline def |(b: GtkAccessibleState): GtkAccessibleState = a | b
    inline def is(b: GtkAccessibleState): Boolean = (a & b) == b

opaque type GtkAccessibleTristate = CUnsignedInt
object GtkAccessibleTristate extends CEnumU[GtkAccessibleTristate]:
  given _tag: Tag[GtkAccessibleTristate] = Tag.UInt
  inline def define(inline a: Long): GtkAccessibleTristate = a.toUInt
  val GTK_ACCESSIBLE_TRISTATE_FALSE = define(0)
  val GTK_ACCESSIBLE_TRISTATE_TRUE = define(1)
  val GTK_ACCESSIBLE_TRISTATE_MIXED = define(2)
  inline def getName(inline value: GtkAccessibleTristate): Option[String] =
    value match
      case GTK_ACCESSIBLE_TRISTATE_FALSE => Some("GTK_ACCESSIBLE_TRISTATE_FALSE")
      case GTK_ACCESSIBLE_TRISTATE_TRUE => Some("GTK_ACCESSIBLE_TRISTATE_TRUE")
      case GTK_ACCESSIBLE_TRISTATE_MIXED => Some("GTK_ACCESSIBLE_TRISTATE_MIXED")
      case _ => None
  extension (a: GtkAccessibleTristate)
    inline def &(b: GtkAccessibleTristate): GtkAccessibleTristate = a & b
    inline def |(b: GtkAccessibleTristate): GtkAccessibleTristate = a | b
    inline def is(b: GtkAccessibleTristate): Boolean = (a & b) == b

opaque type GtkAlign = CUnsignedInt
object GtkAlign extends CEnumU[GtkAlign]:
  given _tag: Tag[GtkAlign] = Tag.UInt
  inline def define(inline a: Long): GtkAlign = a.toUInt
  val GTK_ALIGN_FILL = define(0)
  val GTK_ALIGN_START = define(1)
  val GTK_ALIGN_END = define(2)
  val GTK_ALIGN_CENTER = define(3)
  val GTK_ALIGN_BASELINE = define(4)
  inline def getName(inline value: GtkAlign): Option[String] =
    value match
      case GTK_ALIGN_FILL => Some("GTK_ALIGN_FILL")
      case GTK_ALIGN_START => Some("GTK_ALIGN_START")
      case GTK_ALIGN_END => Some("GTK_ALIGN_END")
      case GTK_ALIGN_CENTER => Some("GTK_ALIGN_CENTER")
      case GTK_ALIGN_BASELINE => Some("GTK_ALIGN_BASELINE")
      case _ => None
  extension (a: GtkAlign)
    inline def &(b: GtkAlign): GtkAlign = a & b
    inline def |(b: GtkAlign): GtkAlign = a | b
    inline def is(b: GtkAlign): Boolean = (a & b) == b

opaque type GtkApplicationInhibitFlags = CUnsignedInt
object GtkApplicationInhibitFlags extends CEnumU[GtkApplicationInhibitFlags]:
  given _tag: Tag[GtkApplicationInhibitFlags] = Tag.UInt
  inline def define(inline a: Long): GtkApplicationInhibitFlags = a.toUInt
  val GTK_APPLICATION_INHIBIT_LOGOUT = define(1)
  val GTK_APPLICATION_INHIBIT_SWITCH = define(2)
  val GTK_APPLICATION_INHIBIT_SUSPEND = define(4)
  val GTK_APPLICATION_INHIBIT_IDLE = define(8)
  inline def getName(inline value: GtkApplicationInhibitFlags): Option[String] =
    value match
      case GTK_APPLICATION_INHIBIT_LOGOUT => Some("GTK_APPLICATION_INHIBIT_LOGOUT")
      case GTK_APPLICATION_INHIBIT_SWITCH => Some("GTK_APPLICATION_INHIBIT_SWITCH")
      case GTK_APPLICATION_INHIBIT_SUSPEND => Some("GTK_APPLICATION_INHIBIT_SUSPEND")
      case GTK_APPLICATION_INHIBIT_IDLE => Some("GTK_APPLICATION_INHIBIT_IDLE")
      case _ => None
  extension (a: GtkApplicationInhibitFlags)
    inline def &(b: GtkApplicationInhibitFlags): GtkApplicationInhibitFlags = a & b
    inline def |(b: GtkApplicationInhibitFlags): GtkApplicationInhibitFlags = a | b
    inline def is(b: GtkApplicationInhibitFlags): Boolean = (a & b) == b

opaque type GtkArrowType = CUnsignedInt
object GtkArrowType extends CEnumU[GtkArrowType]:
  given _tag: Tag[GtkArrowType] = Tag.UInt
  inline def define(inline a: Long): GtkArrowType = a.toUInt
  val GTK_ARROW_UP = define(0)
  val GTK_ARROW_DOWN = define(1)
  val GTK_ARROW_LEFT = define(2)
  val GTK_ARROW_RIGHT = define(3)
  val GTK_ARROW_NONE = define(4)
  inline def getName(inline value: GtkArrowType): Option[String] =
    value match
      case GTK_ARROW_UP => Some("GTK_ARROW_UP")
      case GTK_ARROW_DOWN => Some("GTK_ARROW_DOWN")
      case GTK_ARROW_LEFT => Some("GTK_ARROW_LEFT")
      case GTK_ARROW_RIGHT => Some("GTK_ARROW_RIGHT")
      case GTK_ARROW_NONE => Some("GTK_ARROW_NONE")
      case _ => None
  extension (a: GtkArrowType)
    inline def &(b: GtkArrowType): GtkArrowType = a & b
    inline def |(b: GtkArrowType): GtkArrowType = a | b
    inline def is(b: GtkArrowType): Boolean = (a & b) == b

opaque type GtkAssistantPageType = CUnsignedInt
object GtkAssistantPageType extends CEnumU[GtkAssistantPageType]:
  given _tag: Tag[GtkAssistantPageType] = Tag.UInt
  inline def define(inline a: Long): GtkAssistantPageType = a.toUInt
  val GTK_ASSISTANT_PAGE_CONTENT = define(0)
  val GTK_ASSISTANT_PAGE_INTRO = define(1)
  val GTK_ASSISTANT_PAGE_CONFIRM = define(2)
  val GTK_ASSISTANT_PAGE_SUMMARY = define(3)
  val GTK_ASSISTANT_PAGE_PROGRESS = define(4)
  val GTK_ASSISTANT_PAGE_CUSTOM = define(5)
  inline def getName(inline value: GtkAssistantPageType): Option[String] =
    value match
      case GTK_ASSISTANT_PAGE_CONTENT => Some("GTK_ASSISTANT_PAGE_CONTENT")
      case GTK_ASSISTANT_PAGE_INTRO => Some("GTK_ASSISTANT_PAGE_INTRO")
      case GTK_ASSISTANT_PAGE_CONFIRM => Some("GTK_ASSISTANT_PAGE_CONFIRM")
      case GTK_ASSISTANT_PAGE_SUMMARY => Some("GTK_ASSISTANT_PAGE_SUMMARY")
      case GTK_ASSISTANT_PAGE_PROGRESS => Some("GTK_ASSISTANT_PAGE_PROGRESS")
      case GTK_ASSISTANT_PAGE_CUSTOM => Some("GTK_ASSISTANT_PAGE_CUSTOM")
      case _ => None
  extension (a: GtkAssistantPageType)
    inline def &(b: GtkAssistantPageType): GtkAssistantPageType = a & b
    inline def |(b: GtkAssistantPageType): GtkAssistantPageType = a | b
    inline def is(b: GtkAssistantPageType): Boolean = (a & b) == b

opaque type GtkBaselinePosition = CUnsignedInt
object GtkBaselinePosition extends CEnumU[GtkBaselinePosition]:
  given _tag: Tag[GtkBaselinePosition] = Tag.UInt
  inline def define(inline a: Long): GtkBaselinePosition = a.toUInt
  val GTK_BASELINE_POSITION_TOP = define(0)
  val GTK_BASELINE_POSITION_CENTER = define(1)
  val GTK_BASELINE_POSITION_BOTTOM = define(2)
  inline def getName(inline value: GtkBaselinePosition): Option[String] =
    value match
      case GTK_BASELINE_POSITION_TOP => Some("GTK_BASELINE_POSITION_TOP")
      case GTK_BASELINE_POSITION_CENTER => Some("GTK_BASELINE_POSITION_CENTER")
      case GTK_BASELINE_POSITION_BOTTOM => Some("GTK_BASELINE_POSITION_BOTTOM")
      case _ => None
  extension (a: GtkBaselinePosition)
    inline def &(b: GtkBaselinePosition): GtkBaselinePosition = a & b
    inline def |(b: GtkBaselinePosition): GtkBaselinePosition = a | b
    inline def is(b: GtkBaselinePosition): Boolean = (a & b) == b

opaque type GtkBorderStyle = CUnsignedInt
object GtkBorderStyle extends CEnumU[GtkBorderStyle]:
  given _tag: Tag[GtkBorderStyle] = Tag.UInt
  inline def define(inline a: Long): GtkBorderStyle = a.toUInt
  val GTK_BORDER_STYLE_NONE = define(0)
  val GTK_BORDER_STYLE_HIDDEN = define(1)
  val GTK_BORDER_STYLE_SOLID = define(2)
  val GTK_BORDER_STYLE_INSET = define(3)
  val GTK_BORDER_STYLE_OUTSET = define(4)
  val GTK_BORDER_STYLE_DOTTED = define(5)
  val GTK_BORDER_STYLE_DASHED = define(6)
  val GTK_BORDER_STYLE_DOUBLE = define(7)
  val GTK_BORDER_STYLE_GROOVE = define(8)
  val GTK_BORDER_STYLE_RIDGE = define(9)
  inline def getName(inline value: GtkBorderStyle): Option[String] =
    value match
      case GTK_BORDER_STYLE_NONE => Some("GTK_BORDER_STYLE_NONE")
      case GTK_BORDER_STYLE_HIDDEN => Some("GTK_BORDER_STYLE_HIDDEN")
      case GTK_BORDER_STYLE_SOLID => Some("GTK_BORDER_STYLE_SOLID")
      case GTK_BORDER_STYLE_INSET => Some("GTK_BORDER_STYLE_INSET")
      case GTK_BORDER_STYLE_OUTSET => Some("GTK_BORDER_STYLE_OUTSET")
      case GTK_BORDER_STYLE_DOTTED => Some("GTK_BORDER_STYLE_DOTTED")
      case GTK_BORDER_STYLE_DASHED => Some("GTK_BORDER_STYLE_DASHED")
      case GTK_BORDER_STYLE_DOUBLE => Some("GTK_BORDER_STYLE_DOUBLE")
      case GTK_BORDER_STYLE_GROOVE => Some("GTK_BORDER_STYLE_GROOVE")
      case GTK_BORDER_STYLE_RIDGE => Some("GTK_BORDER_STYLE_RIDGE")
      case _ => None
  extension (a: GtkBorderStyle)
    inline def &(b: GtkBorderStyle): GtkBorderStyle = a & b
    inline def |(b: GtkBorderStyle): GtkBorderStyle = a | b
    inline def is(b: GtkBorderStyle): Boolean = (a & b) == b

opaque type GtkBuilderClosureFlags = CUnsignedInt
object GtkBuilderClosureFlags extends CEnumU[GtkBuilderClosureFlags]:
  given _tag: Tag[GtkBuilderClosureFlags] = Tag.UInt
  inline def define(inline a: Long): GtkBuilderClosureFlags = a.toUInt
  val GTK_BUILDER_CLOSURE_SWAPPED = define(1)
  inline def getName(inline value: GtkBuilderClosureFlags): Option[String] =
    value match
      case GTK_BUILDER_CLOSURE_SWAPPED => Some("GTK_BUILDER_CLOSURE_SWAPPED")
      case _ => None
  extension (a: GtkBuilderClosureFlags)
    inline def &(b: GtkBuilderClosureFlags): GtkBuilderClosureFlags = a & b
    inline def |(b: GtkBuilderClosureFlags): GtkBuilderClosureFlags = a | b
    inline def is(b: GtkBuilderClosureFlags): Boolean = (a & b) == b

opaque type GtkBuilderError = CUnsignedInt
object GtkBuilderError extends CEnumU[GtkBuilderError]:
  given _tag: Tag[GtkBuilderError] = Tag.UInt
  inline def define(inline a: Long): GtkBuilderError = a.toUInt
  val GTK_BUILDER_ERROR_INVALID_TYPE_FUNCTION = define(0)
  val GTK_BUILDER_ERROR_UNHANDLED_TAG = define(1)
  val GTK_BUILDER_ERROR_MISSING_ATTRIBUTE = define(2)
  val GTK_BUILDER_ERROR_INVALID_ATTRIBUTE = define(3)
  val GTK_BUILDER_ERROR_INVALID_TAG = define(4)
  val GTK_BUILDER_ERROR_MISSING_PROPERTY_VALUE = define(5)
  val GTK_BUILDER_ERROR_INVALID_VALUE = define(6)
  val GTK_BUILDER_ERROR_VERSION_MISMATCH = define(7)
  val GTK_BUILDER_ERROR_DUPLICATE_ID = define(8)
  val GTK_BUILDER_ERROR_OBJECT_TYPE_REFUSED = define(9)
  val GTK_BUILDER_ERROR_TEMPLATE_MISMATCH = define(10)
  val GTK_BUILDER_ERROR_INVALID_PROPERTY = define(11)
  val GTK_BUILDER_ERROR_INVALID_SIGNAL = define(12)
  val GTK_BUILDER_ERROR_INVALID_ID = define(13)
  val GTK_BUILDER_ERROR_INVALID_FUNCTION = define(14)
  inline def getName(inline value: GtkBuilderError): Option[String] =
    value match
      case GTK_BUILDER_ERROR_INVALID_TYPE_FUNCTION => Some("GTK_BUILDER_ERROR_INVALID_TYPE_FUNCTION")
      case GTK_BUILDER_ERROR_UNHANDLED_TAG => Some("GTK_BUILDER_ERROR_UNHANDLED_TAG")
      case GTK_BUILDER_ERROR_MISSING_ATTRIBUTE => Some("GTK_BUILDER_ERROR_MISSING_ATTRIBUTE")
      case GTK_BUILDER_ERROR_INVALID_ATTRIBUTE => Some("GTK_BUILDER_ERROR_INVALID_ATTRIBUTE")
      case GTK_BUILDER_ERROR_INVALID_TAG => Some("GTK_BUILDER_ERROR_INVALID_TAG")
      case GTK_BUILDER_ERROR_MISSING_PROPERTY_VALUE => Some("GTK_BUILDER_ERROR_MISSING_PROPERTY_VALUE")
      case GTK_BUILDER_ERROR_INVALID_VALUE => Some("GTK_BUILDER_ERROR_INVALID_VALUE")
      case GTK_BUILDER_ERROR_VERSION_MISMATCH => Some("GTK_BUILDER_ERROR_VERSION_MISMATCH")
      case GTK_BUILDER_ERROR_DUPLICATE_ID => Some("GTK_BUILDER_ERROR_DUPLICATE_ID")
      case GTK_BUILDER_ERROR_OBJECT_TYPE_REFUSED => Some("GTK_BUILDER_ERROR_OBJECT_TYPE_REFUSED")
      case GTK_BUILDER_ERROR_TEMPLATE_MISMATCH => Some("GTK_BUILDER_ERROR_TEMPLATE_MISMATCH")
      case GTK_BUILDER_ERROR_INVALID_PROPERTY => Some("GTK_BUILDER_ERROR_INVALID_PROPERTY")
      case GTK_BUILDER_ERROR_INVALID_SIGNAL => Some("GTK_BUILDER_ERROR_INVALID_SIGNAL")
      case GTK_BUILDER_ERROR_INVALID_ID => Some("GTK_BUILDER_ERROR_INVALID_ID")
      case GTK_BUILDER_ERROR_INVALID_FUNCTION => Some("GTK_BUILDER_ERROR_INVALID_FUNCTION")
      case _ => None
  extension (a: GtkBuilderError)
    inline def &(b: GtkBuilderError): GtkBuilderError = a & b
    inline def |(b: GtkBuilderError): GtkBuilderError = a | b
    inline def is(b: GtkBuilderError): Boolean = (a & b) == b

opaque type GtkButtonsType = CUnsignedInt
object GtkButtonsType extends CEnumU[GtkButtonsType]:
  given _tag: Tag[GtkButtonsType] = Tag.UInt
  inline def define(inline a: Long): GtkButtonsType = a.toUInt
  val GTK_BUTTONS_NONE = define(0)
  val GTK_BUTTONS_OK = define(1)
  val GTK_BUTTONS_CLOSE = define(2)
  val GTK_BUTTONS_CANCEL = define(3)
  val GTK_BUTTONS_YES_NO = define(4)
  val GTK_BUTTONS_OK_CANCEL = define(5)
  inline def getName(inline value: GtkButtonsType): Option[String] =
    value match
      case GTK_BUTTONS_NONE => Some("GTK_BUTTONS_NONE")
      case GTK_BUTTONS_OK => Some("GTK_BUTTONS_OK")
      case GTK_BUTTONS_CLOSE => Some("GTK_BUTTONS_CLOSE")
      case GTK_BUTTONS_CANCEL => Some("GTK_BUTTONS_CANCEL")
      case GTK_BUTTONS_YES_NO => Some("GTK_BUTTONS_YES_NO")
      case GTK_BUTTONS_OK_CANCEL => Some("GTK_BUTTONS_OK_CANCEL")
      case _ => None
  extension (a: GtkButtonsType)
    inline def &(b: GtkButtonsType): GtkButtonsType = a & b
    inline def |(b: GtkButtonsType): GtkButtonsType = a | b
    inline def is(b: GtkButtonsType): Boolean = (a & b) == b

opaque type GtkCellRendererAccelMode = CUnsignedInt
object GtkCellRendererAccelMode extends CEnumU[GtkCellRendererAccelMode]:
  given _tag: Tag[GtkCellRendererAccelMode] = Tag.UInt
  inline def define(inline a: Long): GtkCellRendererAccelMode = a.toUInt
  val GTK_CELL_RENDERER_ACCEL_MODE_GTK = define(0)
  val GTK_CELL_RENDERER_ACCEL_MODE_OTHER = define(1)
  inline def getName(inline value: GtkCellRendererAccelMode): Option[String] =
    value match
      case GTK_CELL_RENDERER_ACCEL_MODE_GTK => Some("GTK_CELL_RENDERER_ACCEL_MODE_GTK")
      case GTK_CELL_RENDERER_ACCEL_MODE_OTHER => Some("GTK_CELL_RENDERER_ACCEL_MODE_OTHER")
      case _ => None
  extension (a: GtkCellRendererAccelMode)
    inline def &(b: GtkCellRendererAccelMode): GtkCellRendererAccelMode = a & b
    inline def |(b: GtkCellRendererAccelMode): GtkCellRendererAccelMode = a | b
    inline def is(b: GtkCellRendererAccelMode): Boolean = (a & b) == b

opaque type GtkCellRendererMode = CUnsignedInt
object GtkCellRendererMode extends CEnumU[GtkCellRendererMode]:
  given _tag: Tag[GtkCellRendererMode] = Tag.UInt
  inline def define(inline a: Long): GtkCellRendererMode = a.toUInt
  val GTK_CELL_RENDERER_MODE_INERT = define(0)
  val GTK_CELL_RENDERER_MODE_ACTIVATABLE = define(1)
  val GTK_CELL_RENDERER_MODE_EDITABLE = define(2)
  inline def getName(inline value: GtkCellRendererMode): Option[String] =
    value match
      case GTK_CELL_RENDERER_MODE_INERT => Some("GTK_CELL_RENDERER_MODE_INERT")
      case GTK_CELL_RENDERER_MODE_ACTIVATABLE => Some("GTK_CELL_RENDERER_MODE_ACTIVATABLE")
      case GTK_CELL_RENDERER_MODE_EDITABLE => Some("GTK_CELL_RENDERER_MODE_EDITABLE")
      case _ => None
  extension (a: GtkCellRendererMode)
    inline def &(b: GtkCellRendererMode): GtkCellRendererMode = a & b
    inline def |(b: GtkCellRendererMode): GtkCellRendererMode = a | b
    inline def is(b: GtkCellRendererMode): Boolean = (a & b) == b

opaque type GtkCellRendererState = CUnsignedInt
object GtkCellRendererState extends CEnumU[GtkCellRendererState]:
  given _tag: Tag[GtkCellRendererState] = Tag.UInt
  inline def define(inline a: Long): GtkCellRendererState = a.toUInt
  val GTK_CELL_RENDERER_SELECTED = define(1)
  val GTK_CELL_RENDERER_PRELIT = define(2)
  val GTK_CELL_RENDERER_INSENSITIVE = define(4)
  val GTK_CELL_RENDERER_SORTED = define(8)
  val GTK_CELL_RENDERER_FOCUSED = define(16)
  val GTK_CELL_RENDERER_EXPANDABLE = define(32)
  val GTK_CELL_RENDERER_EXPANDED = define(64)
  inline def getName(inline value: GtkCellRendererState): Option[String] =
    value match
      case GTK_CELL_RENDERER_SELECTED => Some("GTK_CELL_RENDERER_SELECTED")
      case GTK_CELL_RENDERER_PRELIT => Some("GTK_CELL_RENDERER_PRELIT")
      case GTK_CELL_RENDERER_INSENSITIVE => Some("GTK_CELL_RENDERER_INSENSITIVE")
      case GTK_CELL_RENDERER_SORTED => Some("GTK_CELL_RENDERER_SORTED")
      case GTK_CELL_RENDERER_FOCUSED => Some("GTK_CELL_RENDERER_FOCUSED")
      case GTK_CELL_RENDERER_EXPANDABLE => Some("GTK_CELL_RENDERER_EXPANDABLE")
      case GTK_CELL_RENDERER_EXPANDED => Some("GTK_CELL_RENDERER_EXPANDED")
      case _ => None
  extension (a: GtkCellRendererState)
    inline def &(b: GtkCellRendererState): GtkCellRendererState = a & b
    inline def |(b: GtkCellRendererState): GtkCellRendererState = a | b
    inline def is(b: GtkCellRendererState): Boolean = (a & b) == b

opaque type GtkConstraintAttribute = CUnsignedInt
object GtkConstraintAttribute extends CEnumU[GtkConstraintAttribute]:
  given _tag: Tag[GtkConstraintAttribute] = Tag.UInt
  inline def define(inline a: Long): GtkConstraintAttribute = a.toUInt
  val GTK_CONSTRAINT_ATTRIBUTE_NONE = define(0)
  val GTK_CONSTRAINT_ATTRIBUTE_LEFT = define(1)
  val GTK_CONSTRAINT_ATTRIBUTE_RIGHT = define(2)
  val GTK_CONSTRAINT_ATTRIBUTE_TOP = define(3)
  val GTK_CONSTRAINT_ATTRIBUTE_BOTTOM = define(4)
  val GTK_CONSTRAINT_ATTRIBUTE_START = define(5)
  val GTK_CONSTRAINT_ATTRIBUTE_END = define(6)
  val GTK_CONSTRAINT_ATTRIBUTE_WIDTH = define(7)
  val GTK_CONSTRAINT_ATTRIBUTE_HEIGHT = define(8)
  val GTK_CONSTRAINT_ATTRIBUTE_CENTER_X = define(9)
  val GTK_CONSTRAINT_ATTRIBUTE_CENTER_Y = define(10)
  val GTK_CONSTRAINT_ATTRIBUTE_BASELINE = define(11)
  inline def getName(inline value: GtkConstraintAttribute): Option[String] =
    value match
      case GTK_CONSTRAINT_ATTRIBUTE_NONE => Some("GTK_CONSTRAINT_ATTRIBUTE_NONE")
      case GTK_CONSTRAINT_ATTRIBUTE_LEFT => Some("GTK_CONSTRAINT_ATTRIBUTE_LEFT")
      case GTK_CONSTRAINT_ATTRIBUTE_RIGHT => Some("GTK_CONSTRAINT_ATTRIBUTE_RIGHT")
      case GTK_CONSTRAINT_ATTRIBUTE_TOP => Some("GTK_CONSTRAINT_ATTRIBUTE_TOP")
      case GTK_CONSTRAINT_ATTRIBUTE_BOTTOM => Some("GTK_CONSTRAINT_ATTRIBUTE_BOTTOM")
      case GTK_CONSTRAINT_ATTRIBUTE_START => Some("GTK_CONSTRAINT_ATTRIBUTE_START")
      case GTK_CONSTRAINT_ATTRIBUTE_END => Some("GTK_CONSTRAINT_ATTRIBUTE_END")
      case GTK_CONSTRAINT_ATTRIBUTE_WIDTH => Some("GTK_CONSTRAINT_ATTRIBUTE_WIDTH")
      case GTK_CONSTRAINT_ATTRIBUTE_HEIGHT => Some("GTK_CONSTRAINT_ATTRIBUTE_HEIGHT")
      case GTK_CONSTRAINT_ATTRIBUTE_CENTER_X => Some("GTK_CONSTRAINT_ATTRIBUTE_CENTER_X")
      case GTK_CONSTRAINT_ATTRIBUTE_CENTER_Y => Some("GTK_CONSTRAINT_ATTRIBUTE_CENTER_Y")
      case GTK_CONSTRAINT_ATTRIBUTE_BASELINE => Some("GTK_CONSTRAINT_ATTRIBUTE_BASELINE")
      case _ => None
  extension (a: GtkConstraintAttribute)
    inline def &(b: GtkConstraintAttribute): GtkConstraintAttribute = a & b
    inline def |(b: GtkConstraintAttribute): GtkConstraintAttribute = a | b
    inline def is(b: GtkConstraintAttribute): Boolean = (a & b) == b

opaque type GtkConstraintRelation = CInt
object GtkConstraintRelation extends CEnum[GtkConstraintRelation]:
  given _tag: Tag[GtkConstraintRelation] = Tag.Int
  inline def define(inline a: CInt): GtkConstraintRelation = a
  val GTK_CONSTRAINT_RELATION_LE = define(-1)
  val GTK_CONSTRAINT_RELATION_EQ = define(0)
  val GTK_CONSTRAINT_RELATION_GE = define(1)
  inline def getName(inline value: GtkConstraintRelation): Option[String] =
    value match
      case GTK_CONSTRAINT_RELATION_LE => Some("GTK_CONSTRAINT_RELATION_LE")
      case GTK_CONSTRAINT_RELATION_EQ => Some("GTK_CONSTRAINT_RELATION_EQ")
      case GTK_CONSTRAINT_RELATION_GE => Some("GTK_CONSTRAINT_RELATION_GE")
      case _ => None
  extension (a: GtkConstraintRelation)
    inline def &(b: GtkConstraintRelation): GtkConstraintRelation = a & b
    inline def |(b: GtkConstraintRelation): GtkConstraintRelation = a | b
    inline def is(b: GtkConstraintRelation): Boolean = (a & b) == b

opaque type GtkConstraintStrength = CUnsignedInt
object GtkConstraintStrength extends CEnumU[GtkConstraintStrength]:
  given _tag: Tag[GtkConstraintStrength] = Tag.UInt
  inline def define(inline a: Long): GtkConstraintStrength = a.toUInt
  val GTK_CONSTRAINT_STRENGTH_REQUIRED = define(1001001000)
  val GTK_CONSTRAINT_STRENGTH_STRONG = define(1000000000)
  val GTK_CONSTRAINT_STRENGTH_MEDIUM = define(1000)
  val GTK_CONSTRAINT_STRENGTH_WEAK = define(1)
  inline def getName(inline value: GtkConstraintStrength): Option[String] =
    value match
      case GTK_CONSTRAINT_STRENGTH_REQUIRED => Some("GTK_CONSTRAINT_STRENGTH_REQUIRED")
      case GTK_CONSTRAINT_STRENGTH_STRONG => Some("GTK_CONSTRAINT_STRENGTH_STRONG")
      case GTK_CONSTRAINT_STRENGTH_MEDIUM => Some("GTK_CONSTRAINT_STRENGTH_MEDIUM")
      case GTK_CONSTRAINT_STRENGTH_WEAK => Some("GTK_CONSTRAINT_STRENGTH_WEAK")
      case _ => None
  extension (a: GtkConstraintStrength)
    inline def &(b: GtkConstraintStrength): GtkConstraintStrength = a & b
    inline def |(b: GtkConstraintStrength): GtkConstraintStrength = a | b
    inline def is(b: GtkConstraintStrength): Boolean = (a & b) == b

opaque type GtkConstraintVflParserError = CUnsignedInt
object GtkConstraintVflParserError extends CEnumU[GtkConstraintVflParserError]:
  given _tag: Tag[GtkConstraintVflParserError] = Tag.UInt
  inline def define(inline a: Long): GtkConstraintVflParserError = a.toUInt
  val GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_SYMBOL = define(0)
  val GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_ATTRIBUTE = define(1)
  val GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_VIEW = define(2)
  val GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_METRIC = define(3)
  val GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_PRIORITY = define(4)
  val GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_RELATION = define(5)
  inline def getName(inline value: GtkConstraintVflParserError): Option[String] =
    value match
      case GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_SYMBOL => Some("GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_SYMBOL")
      case GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_ATTRIBUTE => Some("GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_ATTRIBUTE")
      case GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_VIEW => Some("GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_VIEW")
      case GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_METRIC => Some("GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_METRIC")
      case GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_PRIORITY => Some("GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_PRIORITY")
      case GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_RELATION => Some("GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_RELATION")
      case _ => None
  extension (a: GtkConstraintVflParserError)
    inline def &(b: GtkConstraintVflParserError): GtkConstraintVflParserError = a & b
    inline def |(b: GtkConstraintVflParserError): GtkConstraintVflParserError = a | b
    inline def is(b: GtkConstraintVflParserError): Boolean = (a & b) == b

opaque type GtkCornerType = CUnsignedInt
object GtkCornerType extends CEnumU[GtkCornerType]:
  given _tag: Tag[GtkCornerType] = Tag.UInt
  inline def define(inline a: Long): GtkCornerType = a.toUInt
  val GTK_CORNER_TOP_LEFT = define(0)
  val GTK_CORNER_BOTTOM_LEFT = define(1)
  val GTK_CORNER_TOP_RIGHT = define(2)
  val GTK_CORNER_BOTTOM_RIGHT = define(3)
  inline def getName(inline value: GtkCornerType): Option[String] =
    value match
      case GTK_CORNER_TOP_LEFT => Some("GTK_CORNER_TOP_LEFT")
      case GTK_CORNER_BOTTOM_LEFT => Some("GTK_CORNER_BOTTOM_LEFT")
      case GTK_CORNER_TOP_RIGHT => Some("GTK_CORNER_TOP_RIGHT")
      case GTK_CORNER_BOTTOM_RIGHT => Some("GTK_CORNER_BOTTOM_RIGHT")
      case _ => None
  extension (a: GtkCornerType)
    inline def &(b: GtkCornerType): GtkCornerType = a & b
    inline def |(b: GtkCornerType): GtkCornerType = a | b
    inline def is(b: GtkCornerType): Boolean = (a & b) == b

opaque type GtkCssParserError = CUnsignedInt
object GtkCssParserError extends CEnumU[GtkCssParserError]:
  given _tag: Tag[GtkCssParserError] = Tag.UInt
  inline def define(inline a: Long): GtkCssParserError = a.toUInt
  val GTK_CSS_PARSER_ERROR_FAILED = define(0)
  val GTK_CSS_PARSER_ERROR_SYNTAX = define(1)
  val GTK_CSS_PARSER_ERROR_IMPORT = define(2)
  val GTK_CSS_PARSER_ERROR_NAME = define(3)
  val GTK_CSS_PARSER_ERROR_UNKNOWN_VALUE = define(4)
  inline def getName(inline value: GtkCssParserError): Option[String] =
    value match
      case GTK_CSS_PARSER_ERROR_FAILED => Some("GTK_CSS_PARSER_ERROR_FAILED")
      case GTK_CSS_PARSER_ERROR_SYNTAX => Some("GTK_CSS_PARSER_ERROR_SYNTAX")
      case GTK_CSS_PARSER_ERROR_IMPORT => Some("GTK_CSS_PARSER_ERROR_IMPORT")
      case GTK_CSS_PARSER_ERROR_NAME => Some("GTK_CSS_PARSER_ERROR_NAME")
      case GTK_CSS_PARSER_ERROR_UNKNOWN_VALUE => Some("GTK_CSS_PARSER_ERROR_UNKNOWN_VALUE")
      case _ => None
  extension (a: GtkCssParserError)
    inline def &(b: GtkCssParserError): GtkCssParserError = a & b
    inline def |(b: GtkCssParserError): GtkCssParserError = a | b
    inline def is(b: GtkCssParserError): Boolean = (a & b) == b

opaque type GtkCssParserWarning = CUnsignedInt
object GtkCssParserWarning extends CEnumU[GtkCssParserWarning]:
  given _tag: Tag[GtkCssParserWarning] = Tag.UInt
  inline def define(inline a: Long): GtkCssParserWarning = a.toUInt
  val GTK_CSS_PARSER_WARNING_DEPRECATED = define(0)
  val GTK_CSS_PARSER_WARNING_SYNTAX = define(1)
  val GTK_CSS_PARSER_WARNING_UNIMPLEMENTED = define(2)
  inline def getName(inline value: GtkCssParserWarning): Option[String] =
    value match
      case GTK_CSS_PARSER_WARNING_DEPRECATED => Some("GTK_CSS_PARSER_WARNING_DEPRECATED")
      case GTK_CSS_PARSER_WARNING_SYNTAX => Some("GTK_CSS_PARSER_WARNING_SYNTAX")
      case GTK_CSS_PARSER_WARNING_UNIMPLEMENTED => Some("GTK_CSS_PARSER_WARNING_UNIMPLEMENTED")
      case _ => None
  extension (a: GtkCssParserWarning)
    inline def &(b: GtkCssParserWarning): GtkCssParserWarning = a & b
    inline def |(b: GtkCssParserWarning): GtkCssParserWarning = a | b
    inline def is(b: GtkCssParserWarning): Boolean = (a & b) == b

opaque type GtkDebugFlags = CUnsignedInt
object GtkDebugFlags extends CEnumU[GtkDebugFlags]:
  given _tag: Tag[GtkDebugFlags] = Tag.UInt
  inline def define(inline a: Long): GtkDebugFlags = a.toUInt
  val GTK_DEBUG_TEXT = define(1)
  val GTK_DEBUG_TREE = define(2)
  val GTK_DEBUG_KEYBINDINGS = define(4)
  val GTK_DEBUG_MODULES = define(8)
  val GTK_DEBUG_GEOMETRY = define(16)
  val GTK_DEBUG_ICONTHEME = define(32)
  val GTK_DEBUG_PRINTING = define(64)
  val GTK_DEBUG_BUILDER = define(128)
  val GTK_DEBUG_SIZE_REQUEST = define(256)
  val GTK_DEBUG_NO_CSS_CACHE = define(512)
  val GTK_DEBUG_INTERACTIVE = define(1024)
  val GTK_DEBUG_TOUCHSCREEN = define(2048)
  val GTK_DEBUG_ACTIONS = define(4096)
  val GTK_DEBUG_LAYOUT = define(8192)
  val GTK_DEBUG_SNAPSHOT = define(16384)
  val GTK_DEBUG_CONSTRAINTS = define(32768)
  val GTK_DEBUG_BUILDER_OBJECTS = define(65536)
  val GTK_DEBUG_A11Y = define(131072)
  val GTK_DEBUG_ICONFALLBACK = define(262144)
  inline def getName(inline value: GtkDebugFlags): Option[String] =
    value match
      case GTK_DEBUG_TEXT => Some("GTK_DEBUG_TEXT")
      case GTK_DEBUG_TREE => Some("GTK_DEBUG_TREE")
      case GTK_DEBUG_KEYBINDINGS => Some("GTK_DEBUG_KEYBINDINGS")
      case GTK_DEBUG_MODULES => Some("GTK_DEBUG_MODULES")
      case GTK_DEBUG_GEOMETRY => Some("GTK_DEBUG_GEOMETRY")
      case GTK_DEBUG_ICONTHEME => Some("GTK_DEBUG_ICONTHEME")
      case GTK_DEBUG_PRINTING => Some("GTK_DEBUG_PRINTING")
      case GTK_DEBUG_BUILDER => Some("GTK_DEBUG_BUILDER")
      case GTK_DEBUG_SIZE_REQUEST => Some("GTK_DEBUG_SIZE_REQUEST")
      case GTK_DEBUG_NO_CSS_CACHE => Some("GTK_DEBUG_NO_CSS_CACHE")
      case GTK_DEBUG_INTERACTIVE => Some("GTK_DEBUG_INTERACTIVE")
      case GTK_DEBUG_TOUCHSCREEN => Some("GTK_DEBUG_TOUCHSCREEN")
      case GTK_DEBUG_ACTIONS => Some("GTK_DEBUG_ACTIONS")
      case GTK_DEBUG_LAYOUT => Some("GTK_DEBUG_LAYOUT")
      case GTK_DEBUG_SNAPSHOT => Some("GTK_DEBUG_SNAPSHOT")
      case GTK_DEBUG_CONSTRAINTS => Some("GTK_DEBUG_CONSTRAINTS")
      case GTK_DEBUG_BUILDER_OBJECTS => Some("GTK_DEBUG_BUILDER_OBJECTS")
      case GTK_DEBUG_A11Y => Some("GTK_DEBUG_A11Y")
      case GTK_DEBUG_ICONFALLBACK => Some("GTK_DEBUG_ICONFALLBACK")
      case _ => None
  extension (a: GtkDebugFlags)
    inline def &(b: GtkDebugFlags): GtkDebugFlags = a & b
    inline def |(b: GtkDebugFlags): GtkDebugFlags = a | b
    inline def is(b: GtkDebugFlags): Boolean = (a & b) == b

opaque type GtkDeleteType = CUnsignedInt
object GtkDeleteType extends CEnumU[GtkDeleteType]:
  given _tag: Tag[GtkDeleteType] = Tag.UInt
  inline def define(inline a: Long): GtkDeleteType = a.toUInt
  val GTK_DELETE_CHARS = define(0)
  val GTK_DELETE_WORD_ENDS = define(1)
  val GTK_DELETE_WORDS = define(2)
  val GTK_DELETE_DISPLAY_LINES = define(3)
  val GTK_DELETE_DISPLAY_LINE_ENDS = define(4)
  val GTK_DELETE_PARAGRAPH_ENDS = define(5)
  val GTK_DELETE_PARAGRAPHS = define(6)
  val GTK_DELETE_WHITESPACE = define(7)
  inline def getName(inline value: GtkDeleteType): Option[String] =
    value match
      case GTK_DELETE_CHARS => Some("GTK_DELETE_CHARS")
      case GTK_DELETE_WORD_ENDS => Some("GTK_DELETE_WORD_ENDS")
      case GTK_DELETE_WORDS => Some("GTK_DELETE_WORDS")
      case GTK_DELETE_DISPLAY_LINES => Some("GTK_DELETE_DISPLAY_LINES")
      case GTK_DELETE_DISPLAY_LINE_ENDS => Some("GTK_DELETE_DISPLAY_LINE_ENDS")
      case GTK_DELETE_PARAGRAPH_ENDS => Some("GTK_DELETE_PARAGRAPH_ENDS")
      case GTK_DELETE_PARAGRAPHS => Some("GTK_DELETE_PARAGRAPHS")
      case GTK_DELETE_WHITESPACE => Some("GTK_DELETE_WHITESPACE")
      case _ => None
  extension (a: GtkDeleteType)
    inline def &(b: GtkDeleteType): GtkDeleteType = a & b
    inline def |(b: GtkDeleteType): GtkDeleteType = a | b
    inline def is(b: GtkDeleteType): Boolean = (a & b) == b

opaque type GtkDialogFlags = CUnsignedInt
object GtkDialogFlags extends CEnumU[GtkDialogFlags]:
  given _tag: Tag[GtkDialogFlags] = Tag.UInt
  inline def define(inline a: Long): GtkDialogFlags = a.toUInt
  val GTK_DIALOG_MODAL = define(1)
  val GTK_DIALOG_DESTROY_WITH_PARENT = define(2)
  val GTK_DIALOG_USE_HEADER_BAR = define(4)
  inline def getName(inline value: GtkDialogFlags): Option[String] =
    value match
      case GTK_DIALOG_MODAL => Some("GTK_DIALOG_MODAL")
      case GTK_DIALOG_DESTROY_WITH_PARENT => Some("GTK_DIALOG_DESTROY_WITH_PARENT")
      case GTK_DIALOG_USE_HEADER_BAR => Some("GTK_DIALOG_USE_HEADER_BAR")
      case _ => None
  extension (a: GtkDialogFlags)
    inline def &(b: GtkDialogFlags): GtkDialogFlags = a & b
    inline def |(b: GtkDialogFlags): GtkDialogFlags = a | b
    inline def is(b: GtkDialogFlags): Boolean = (a & b) == b

opaque type GtkDirectionType = CUnsignedInt
object GtkDirectionType extends CEnumU[GtkDirectionType]:
  given _tag: Tag[GtkDirectionType] = Tag.UInt
  inline def define(inline a: Long): GtkDirectionType = a.toUInt
  val GTK_DIR_TAB_FORWARD = define(0)
  val GTK_DIR_TAB_BACKWARD = define(1)
  val GTK_DIR_UP = define(2)
  val GTK_DIR_DOWN = define(3)
  val GTK_DIR_LEFT = define(4)
  val GTK_DIR_RIGHT = define(5)
  inline def getName(inline value: GtkDirectionType): Option[String] =
    value match
      case GTK_DIR_TAB_FORWARD => Some("GTK_DIR_TAB_FORWARD")
      case GTK_DIR_TAB_BACKWARD => Some("GTK_DIR_TAB_BACKWARD")
      case GTK_DIR_UP => Some("GTK_DIR_UP")
      case GTK_DIR_DOWN => Some("GTK_DIR_DOWN")
      case GTK_DIR_LEFT => Some("GTK_DIR_LEFT")
      case GTK_DIR_RIGHT => Some("GTK_DIR_RIGHT")
      case _ => None
  extension (a: GtkDirectionType)
    inline def &(b: GtkDirectionType): GtkDirectionType = a & b
    inline def |(b: GtkDirectionType): GtkDirectionType = a | b
    inline def is(b: GtkDirectionType): Boolean = (a & b) == b

opaque type GtkEditableProperties = CUnsignedInt
object GtkEditableProperties extends CEnumU[GtkEditableProperties]:
  given _tag: Tag[GtkEditableProperties] = Tag.UInt
  inline def define(inline a: Long): GtkEditableProperties = a.toUInt
  val GTK_EDITABLE_PROP_TEXT = define(0)
  val GTK_EDITABLE_PROP_CURSOR_POSITION = define(1)
  val GTK_EDITABLE_PROP_SELECTION_BOUND = define(2)
  val GTK_EDITABLE_PROP_EDITABLE = define(3)
  val GTK_EDITABLE_PROP_WIDTH_CHARS = define(4)
  val GTK_EDITABLE_PROP_MAX_WIDTH_CHARS = define(5)
  val GTK_EDITABLE_PROP_XALIGN = define(6)
  val GTK_EDITABLE_PROP_ENABLE_UNDO = define(7)
  val GTK_EDITABLE_NUM_PROPERTIES = define(8)
  inline def getName(inline value: GtkEditableProperties): Option[String] =
    value match
      case GTK_EDITABLE_PROP_TEXT => Some("GTK_EDITABLE_PROP_TEXT")
      case GTK_EDITABLE_PROP_CURSOR_POSITION => Some("GTK_EDITABLE_PROP_CURSOR_POSITION")
      case GTK_EDITABLE_PROP_SELECTION_BOUND => Some("GTK_EDITABLE_PROP_SELECTION_BOUND")
      case GTK_EDITABLE_PROP_EDITABLE => Some("GTK_EDITABLE_PROP_EDITABLE")
      case GTK_EDITABLE_PROP_WIDTH_CHARS => Some("GTK_EDITABLE_PROP_WIDTH_CHARS")
      case GTK_EDITABLE_PROP_MAX_WIDTH_CHARS => Some("GTK_EDITABLE_PROP_MAX_WIDTH_CHARS")
      case GTK_EDITABLE_PROP_XALIGN => Some("GTK_EDITABLE_PROP_XALIGN")
      case GTK_EDITABLE_PROP_ENABLE_UNDO => Some("GTK_EDITABLE_PROP_ENABLE_UNDO")
      case GTK_EDITABLE_NUM_PROPERTIES => Some("GTK_EDITABLE_NUM_PROPERTIES")
      case _ => None
  extension (a: GtkEditableProperties)
    inline def &(b: GtkEditableProperties): GtkEditableProperties = a & b
    inline def |(b: GtkEditableProperties): GtkEditableProperties = a | b
    inline def is(b: GtkEditableProperties): Boolean = (a & b) == b

opaque type GtkEntryIconPosition = CUnsignedInt
object GtkEntryIconPosition extends CEnumU[GtkEntryIconPosition]:
  given _tag: Tag[GtkEntryIconPosition] = Tag.UInt
  inline def define(inline a: Long): GtkEntryIconPosition = a.toUInt
  val GTK_ENTRY_ICON_PRIMARY = define(0)
  val GTK_ENTRY_ICON_SECONDARY = define(1)
  inline def getName(inline value: GtkEntryIconPosition): Option[String] =
    value match
      case GTK_ENTRY_ICON_PRIMARY => Some("GTK_ENTRY_ICON_PRIMARY")
      case GTK_ENTRY_ICON_SECONDARY => Some("GTK_ENTRY_ICON_SECONDARY")
      case _ => None
  extension (a: GtkEntryIconPosition)
    inline def &(b: GtkEntryIconPosition): GtkEntryIconPosition = a & b
    inline def |(b: GtkEntryIconPosition): GtkEntryIconPosition = a | b
    inline def is(b: GtkEntryIconPosition): Boolean = (a & b) == b

opaque type GtkEventControllerScrollFlags = CUnsignedInt
object GtkEventControllerScrollFlags extends CEnumU[GtkEventControllerScrollFlags]:
  given _tag: Tag[GtkEventControllerScrollFlags] = Tag.UInt
  inline def define(inline a: Long): GtkEventControllerScrollFlags = a.toUInt
  val GTK_EVENT_CONTROLLER_SCROLL_NONE = define(0)
  val GTK_EVENT_CONTROLLER_SCROLL_VERTICAL = define(1)
  val GTK_EVENT_CONTROLLER_SCROLL_HORIZONTAL = define(2)
  val GTK_EVENT_CONTROLLER_SCROLL_DISCRETE = define(4)
  val GTK_EVENT_CONTROLLER_SCROLL_KINETIC = define(8)
  val GTK_EVENT_CONTROLLER_SCROLL_BOTH_AXES = define(3)
  inline def getName(inline value: GtkEventControllerScrollFlags): Option[String] =
    value match
      case GTK_EVENT_CONTROLLER_SCROLL_NONE => Some("GTK_EVENT_CONTROLLER_SCROLL_NONE")
      case GTK_EVENT_CONTROLLER_SCROLL_VERTICAL => Some("GTK_EVENT_CONTROLLER_SCROLL_VERTICAL")
      case GTK_EVENT_CONTROLLER_SCROLL_HORIZONTAL => Some("GTK_EVENT_CONTROLLER_SCROLL_HORIZONTAL")
      case GTK_EVENT_CONTROLLER_SCROLL_DISCRETE => Some("GTK_EVENT_CONTROLLER_SCROLL_DISCRETE")
      case GTK_EVENT_CONTROLLER_SCROLL_KINETIC => Some("GTK_EVENT_CONTROLLER_SCROLL_KINETIC")
      case GTK_EVENT_CONTROLLER_SCROLL_BOTH_AXES => Some("GTK_EVENT_CONTROLLER_SCROLL_BOTH_AXES")
      case _ => None
  extension (a: GtkEventControllerScrollFlags)
    inline def &(b: GtkEventControllerScrollFlags): GtkEventControllerScrollFlags = a & b
    inline def |(b: GtkEventControllerScrollFlags): GtkEventControllerScrollFlags = a | b
    inline def is(b: GtkEventControllerScrollFlags): Boolean = (a & b) == b

opaque type GtkEventSequenceState = CUnsignedInt
object GtkEventSequenceState extends CEnumU[GtkEventSequenceState]:
  given _tag: Tag[GtkEventSequenceState] = Tag.UInt
  inline def define(inline a: Long): GtkEventSequenceState = a.toUInt
  val GTK_EVENT_SEQUENCE_NONE = define(0)
  val GTK_EVENT_SEQUENCE_CLAIMED = define(1)
  val GTK_EVENT_SEQUENCE_DENIED = define(2)
  inline def getName(inline value: GtkEventSequenceState): Option[String] =
    value match
      case GTK_EVENT_SEQUENCE_NONE => Some("GTK_EVENT_SEQUENCE_NONE")
      case GTK_EVENT_SEQUENCE_CLAIMED => Some("GTK_EVENT_SEQUENCE_CLAIMED")
      case GTK_EVENT_SEQUENCE_DENIED => Some("GTK_EVENT_SEQUENCE_DENIED")
      case _ => None
  extension (a: GtkEventSequenceState)
    inline def &(b: GtkEventSequenceState): GtkEventSequenceState = a & b
    inline def |(b: GtkEventSequenceState): GtkEventSequenceState = a | b
    inline def is(b: GtkEventSequenceState): Boolean = (a & b) == b

opaque type GtkFileChooserAction = CUnsignedInt
object GtkFileChooserAction extends CEnumU[GtkFileChooserAction]:
  given _tag: Tag[GtkFileChooserAction] = Tag.UInt
  inline def define(inline a: Long): GtkFileChooserAction = a.toUInt
  val GTK_FILE_CHOOSER_ACTION_OPEN = define(0)
  val GTK_FILE_CHOOSER_ACTION_SAVE = define(1)
  val GTK_FILE_CHOOSER_ACTION_SELECT_FOLDER = define(2)
  inline def getName(inline value: GtkFileChooserAction): Option[String] =
    value match
      case GTK_FILE_CHOOSER_ACTION_OPEN => Some("GTK_FILE_CHOOSER_ACTION_OPEN")
      case GTK_FILE_CHOOSER_ACTION_SAVE => Some("GTK_FILE_CHOOSER_ACTION_SAVE")
      case GTK_FILE_CHOOSER_ACTION_SELECT_FOLDER => Some("GTK_FILE_CHOOSER_ACTION_SELECT_FOLDER")
      case _ => None
  extension (a: GtkFileChooserAction)
    inline def &(b: GtkFileChooserAction): GtkFileChooserAction = a & b
    inline def |(b: GtkFileChooserAction): GtkFileChooserAction = a | b
    inline def is(b: GtkFileChooserAction): Boolean = (a & b) == b

opaque type GtkFileChooserError = CUnsignedInt
object GtkFileChooserError extends CEnumU[GtkFileChooserError]:
  given _tag: Tag[GtkFileChooserError] = Tag.UInt
  inline def define(inline a: Long): GtkFileChooserError = a.toUInt
  val GTK_FILE_CHOOSER_ERROR_NONEXISTENT = define(0)
  val GTK_FILE_CHOOSER_ERROR_BAD_FILENAME = define(1)
  val GTK_FILE_CHOOSER_ERROR_ALREADY_EXISTS = define(2)
  val GTK_FILE_CHOOSER_ERROR_INCOMPLETE_HOSTNAME = define(3)
  inline def getName(inline value: GtkFileChooserError): Option[String] =
    value match
      case GTK_FILE_CHOOSER_ERROR_NONEXISTENT => Some("GTK_FILE_CHOOSER_ERROR_NONEXISTENT")
      case GTK_FILE_CHOOSER_ERROR_BAD_FILENAME => Some("GTK_FILE_CHOOSER_ERROR_BAD_FILENAME")
      case GTK_FILE_CHOOSER_ERROR_ALREADY_EXISTS => Some("GTK_FILE_CHOOSER_ERROR_ALREADY_EXISTS")
      case GTK_FILE_CHOOSER_ERROR_INCOMPLETE_HOSTNAME => Some("GTK_FILE_CHOOSER_ERROR_INCOMPLETE_HOSTNAME")
      case _ => None
  extension (a: GtkFileChooserError)
    inline def &(b: GtkFileChooserError): GtkFileChooserError = a & b
    inline def |(b: GtkFileChooserError): GtkFileChooserError = a | b
    inline def is(b: GtkFileChooserError): Boolean = (a & b) == b

opaque type GtkFilterChange = CUnsignedInt
object GtkFilterChange extends CEnumU[GtkFilterChange]:
  given _tag: Tag[GtkFilterChange] = Tag.UInt
  inline def define(inline a: Long): GtkFilterChange = a.toUInt
  val GTK_FILTER_CHANGE_DIFFERENT = define(0)
  val GTK_FILTER_CHANGE_LESS_STRICT = define(1)
  val GTK_FILTER_CHANGE_MORE_STRICT = define(2)
  inline def getName(inline value: GtkFilterChange): Option[String] =
    value match
      case GTK_FILTER_CHANGE_DIFFERENT => Some("GTK_FILTER_CHANGE_DIFFERENT")
      case GTK_FILTER_CHANGE_LESS_STRICT => Some("GTK_FILTER_CHANGE_LESS_STRICT")
      case GTK_FILTER_CHANGE_MORE_STRICT => Some("GTK_FILTER_CHANGE_MORE_STRICT")
      case _ => None
  extension (a: GtkFilterChange)
    inline def &(b: GtkFilterChange): GtkFilterChange = a & b
    inline def |(b: GtkFilterChange): GtkFilterChange = a | b
    inline def is(b: GtkFilterChange): Boolean = (a & b) == b

opaque type GtkFilterMatch = CUnsignedInt
object GtkFilterMatch extends CEnumU[GtkFilterMatch]:
  given _tag: Tag[GtkFilterMatch] = Tag.UInt
  inline def define(inline a: Long): GtkFilterMatch = a.toUInt
  val GTK_FILTER_MATCH_SOME = define(0)
  val GTK_FILTER_MATCH_NONE = define(1)
  val GTK_FILTER_MATCH_ALL = define(2)
  inline def getName(inline value: GtkFilterMatch): Option[String] =
    value match
      case GTK_FILTER_MATCH_SOME => Some("GTK_FILTER_MATCH_SOME")
      case GTK_FILTER_MATCH_NONE => Some("GTK_FILTER_MATCH_NONE")
      case GTK_FILTER_MATCH_ALL => Some("GTK_FILTER_MATCH_ALL")
      case _ => None
  extension (a: GtkFilterMatch)
    inline def &(b: GtkFilterMatch): GtkFilterMatch = a & b
    inline def |(b: GtkFilterMatch): GtkFilterMatch = a | b
    inline def is(b: GtkFilterMatch): Boolean = (a & b) == b

opaque type GtkFontChooserLevel = CUnsignedInt
object GtkFontChooserLevel extends CEnumU[GtkFontChooserLevel]:
  given _tag: Tag[GtkFontChooserLevel] = Tag.UInt
  inline def define(inline a: Long): GtkFontChooserLevel = a.toUInt
  val GTK_FONT_CHOOSER_LEVEL_FAMILY = define(0)
  val GTK_FONT_CHOOSER_LEVEL_STYLE = define(1)
  val GTK_FONT_CHOOSER_LEVEL_SIZE = define(2)
  val GTK_FONT_CHOOSER_LEVEL_VARIATIONS = define(4)
  val GTK_FONT_CHOOSER_LEVEL_FEATURES = define(8)
  inline def getName(inline value: GtkFontChooserLevel): Option[String] =
    value match
      case GTK_FONT_CHOOSER_LEVEL_FAMILY => Some("GTK_FONT_CHOOSER_LEVEL_FAMILY")
      case GTK_FONT_CHOOSER_LEVEL_STYLE => Some("GTK_FONT_CHOOSER_LEVEL_STYLE")
      case GTK_FONT_CHOOSER_LEVEL_SIZE => Some("GTK_FONT_CHOOSER_LEVEL_SIZE")
      case GTK_FONT_CHOOSER_LEVEL_VARIATIONS => Some("GTK_FONT_CHOOSER_LEVEL_VARIATIONS")
      case GTK_FONT_CHOOSER_LEVEL_FEATURES => Some("GTK_FONT_CHOOSER_LEVEL_FEATURES")
      case _ => None
  extension (a: GtkFontChooserLevel)
    inline def &(b: GtkFontChooserLevel): GtkFontChooserLevel = a & b
    inline def |(b: GtkFontChooserLevel): GtkFontChooserLevel = a | b
    inline def is(b: GtkFontChooserLevel): Boolean = (a & b) == b

opaque type GtkIconLookupFlags = CUnsignedInt
object GtkIconLookupFlags extends CEnumU[GtkIconLookupFlags]:
  given _tag: Tag[GtkIconLookupFlags] = Tag.UInt
  inline def define(inline a: Long): GtkIconLookupFlags = a.toUInt
  val GTK_ICON_LOOKUP_FORCE_REGULAR = define(1)
  val GTK_ICON_LOOKUP_FORCE_SYMBOLIC = define(2)
  val GTK_ICON_LOOKUP_PRELOAD = define(4)
  inline def getName(inline value: GtkIconLookupFlags): Option[String] =
    value match
      case GTK_ICON_LOOKUP_FORCE_REGULAR => Some("GTK_ICON_LOOKUP_FORCE_REGULAR")
      case GTK_ICON_LOOKUP_FORCE_SYMBOLIC => Some("GTK_ICON_LOOKUP_FORCE_SYMBOLIC")
      case GTK_ICON_LOOKUP_PRELOAD => Some("GTK_ICON_LOOKUP_PRELOAD")
      case _ => None
  extension (a: GtkIconLookupFlags)
    inline def &(b: GtkIconLookupFlags): GtkIconLookupFlags = a & b
    inline def |(b: GtkIconLookupFlags): GtkIconLookupFlags = a | b
    inline def is(b: GtkIconLookupFlags): Boolean = (a & b) == b

opaque type GtkIconSize = CUnsignedInt
object GtkIconSize extends CEnumU[GtkIconSize]:
  given _tag: Tag[GtkIconSize] = Tag.UInt
  inline def define(inline a: Long): GtkIconSize = a.toUInt
  val GTK_ICON_SIZE_INHERIT = define(0)
  val GTK_ICON_SIZE_NORMAL = define(1)
  val GTK_ICON_SIZE_LARGE = define(2)
  inline def getName(inline value: GtkIconSize): Option[String] =
    value match
      case GTK_ICON_SIZE_INHERIT => Some("GTK_ICON_SIZE_INHERIT")
      case GTK_ICON_SIZE_NORMAL => Some("GTK_ICON_SIZE_NORMAL")
      case GTK_ICON_SIZE_LARGE => Some("GTK_ICON_SIZE_LARGE")
      case _ => None
  extension (a: GtkIconSize)
    inline def &(b: GtkIconSize): GtkIconSize = a & b
    inline def |(b: GtkIconSize): GtkIconSize = a | b
    inline def is(b: GtkIconSize): Boolean = (a & b) == b

opaque type GtkIconThemeError = CUnsignedInt
object GtkIconThemeError extends CEnumU[GtkIconThemeError]:
  given _tag: Tag[GtkIconThemeError] = Tag.UInt
  inline def define(inline a: Long): GtkIconThemeError = a.toUInt
  val GTK_ICON_THEME_NOT_FOUND = define(0)
  val GTK_ICON_THEME_FAILED = define(1)
  inline def getName(inline value: GtkIconThemeError): Option[String] =
    value match
      case GTK_ICON_THEME_NOT_FOUND => Some("GTK_ICON_THEME_NOT_FOUND")
      case GTK_ICON_THEME_FAILED => Some("GTK_ICON_THEME_FAILED")
      case _ => None
  extension (a: GtkIconThemeError)
    inline def &(b: GtkIconThemeError): GtkIconThemeError = a & b
    inline def |(b: GtkIconThemeError): GtkIconThemeError = a | b
    inline def is(b: GtkIconThemeError): Boolean = (a & b) == b

opaque type GtkIconViewDropPosition = CUnsignedInt
object GtkIconViewDropPosition extends CEnumU[GtkIconViewDropPosition]:
  given _tag: Tag[GtkIconViewDropPosition] = Tag.UInt
  inline def define(inline a: Long): GtkIconViewDropPosition = a.toUInt
  val GTK_ICON_VIEW_NO_DROP = define(0)
  val GTK_ICON_VIEW_DROP_INTO = define(1)
  val GTK_ICON_VIEW_DROP_LEFT = define(2)
  val GTK_ICON_VIEW_DROP_RIGHT = define(3)
  val GTK_ICON_VIEW_DROP_ABOVE = define(4)
  val GTK_ICON_VIEW_DROP_BELOW = define(5)
  inline def getName(inline value: GtkIconViewDropPosition): Option[String] =
    value match
      case GTK_ICON_VIEW_NO_DROP => Some("GTK_ICON_VIEW_NO_DROP")
      case GTK_ICON_VIEW_DROP_INTO => Some("GTK_ICON_VIEW_DROP_INTO")
      case GTK_ICON_VIEW_DROP_LEFT => Some("GTK_ICON_VIEW_DROP_LEFT")
      case GTK_ICON_VIEW_DROP_RIGHT => Some("GTK_ICON_VIEW_DROP_RIGHT")
      case GTK_ICON_VIEW_DROP_ABOVE => Some("GTK_ICON_VIEW_DROP_ABOVE")
      case GTK_ICON_VIEW_DROP_BELOW => Some("GTK_ICON_VIEW_DROP_BELOW")
      case _ => None
  extension (a: GtkIconViewDropPosition)
    inline def &(b: GtkIconViewDropPosition): GtkIconViewDropPosition = a & b
    inline def |(b: GtkIconViewDropPosition): GtkIconViewDropPosition = a | b
    inline def is(b: GtkIconViewDropPosition): Boolean = (a & b) == b

opaque type GtkImageType = CUnsignedInt
object GtkImageType extends CEnumU[GtkImageType]:
  given _tag: Tag[GtkImageType] = Tag.UInt
  inline def define(inline a: Long): GtkImageType = a.toUInt
  val GTK_IMAGE_EMPTY = define(0)
  val GTK_IMAGE_ICON_NAME = define(1)
  val GTK_IMAGE_GICON = define(2)
  val GTK_IMAGE_PAINTABLE = define(3)
  inline def getName(inline value: GtkImageType): Option[String] =
    value match
      case GTK_IMAGE_EMPTY => Some("GTK_IMAGE_EMPTY")
      case GTK_IMAGE_ICON_NAME => Some("GTK_IMAGE_ICON_NAME")
      case GTK_IMAGE_GICON => Some("GTK_IMAGE_GICON")
      case GTK_IMAGE_PAINTABLE => Some("GTK_IMAGE_PAINTABLE")
      case _ => None
  extension (a: GtkImageType)
    inline def &(b: GtkImageType): GtkImageType = a & b
    inline def |(b: GtkImageType): GtkImageType = a | b
    inline def is(b: GtkImageType): Boolean = (a & b) == b

opaque type GtkInputHints = CUnsignedInt
object GtkInputHints extends CEnumU[GtkInputHints]:
  given _tag: Tag[GtkInputHints] = Tag.UInt
  inline def define(inline a: Long): GtkInputHints = a.toUInt
  val GTK_INPUT_HINT_NONE = define(0)
  val GTK_INPUT_HINT_SPELLCHECK = define(1)
  val GTK_INPUT_HINT_NO_SPELLCHECK = define(2)
  val GTK_INPUT_HINT_WORD_COMPLETION = define(4)
  val GTK_INPUT_HINT_LOWERCASE = define(8)
  val GTK_INPUT_HINT_UPPERCASE_CHARS = define(16)
  val GTK_INPUT_HINT_UPPERCASE_WORDS = define(32)
  val GTK_INPUT_HINT_UPPERCASE_SENTENCES = define(64)
  val GTK_INPUT_HINT_INHIBIT_OSK = define(128)
  val GTK_INPUT_HINT_VERTICAL_WRITING = define(256)
  val GTK_INPUT_HINT_EMOJI = define(512)
  val GTK_INPUT_HINT_NO_EMOJI = define(1024)
  val GTK_INPUT_HINT_PRIVATE = define(2048)
  inline def getName(inline value: GtkInputHints): Option[String] =
    value match
      case GTK_INPUT_HINT_NONE => Some("GTK_INPUT_HINT_NONE")
      case GTK_INPUT_HINT_SPELLCHECK => Some("GTK_INPUT_HINT_SPELLCHECK")
      case GTK_INPUT_HINT_NO_SPELLCHECK => Some("GTK_INPUT_HINT_NO_SPELLCHECK")
      case GTK_INPUT_HINT_WORD_COMPLETION => Some("GTK_INPUT_HINT_WORD_COMPLETION")
      case GTK_INPUT_HINT_LOWERCASE => Some("GTK_INPUT_HINT_LOWERCASE")
      case GTK_INPUT_HINT_UPPERCASE_CHARS => Some("GTK_INPUT_HINT_UPPERCASE_CHARS")
      case GTK_INPUT_HINT_UPPERCASE_WORDS => Some("GTK_INPUT_HINT_UPPERCASE_WORDS")
      case GTK_INPUT_HINT_UPPERCASE_SENTENCES => Some("GTK_INPUT_HINT_UPPERCASE_SENTENCES")
      case GTK_INPUT_HINT_INHIBIT_OSK => Some("GTK_INPUT_HINT_INHIBIT_OSK")
      case GTK_INPUT_HINT_VERTICAL_WRITING => Some("GTK_INPUT_HINT_VERTICAL_WRITING")
      case GTK_INPUT_HINT_EMOJI => Some("GTK_INPUT_HINT_EMOJI")
      case GTK_INPUT_HINT_NO_EMOJI => Some("GTK_INPUT_HINT_NO_EMOJI")
      case GTK_INPUT_HINT_PRIVATE => Some("GTK_INPUT_HINT_PRIVATE")
      case _ => None
  extension (a: GtkInputHints)
    inline def &(b: GtkInputHints): GtkInputHints = a & b
    inline def |(b: GtkInputHints): GtkInputHints = a | b
    inline def is(b: GtkInputHints): Boolean = (a & b) == b

opaque type GtkInputPurpose = CUnsignedInt
object GtkInputPurpose extends CEnumU[GtkInputPurpose]:
  given _tag: Tag[GtkInputPurpose] = Tag.UInt
  inline def define(inline a: Long): GtkInputPurpose = a.toUInt
  val GTK_INPUT_PURPOSE_FREE_FORM = define(0)
  val GTK_INPUT_PURPOSE_ALPHA = define(1)
  val GTK_INPUT_PURPOSE_DIGITS = define(2)
  val GTK_INPUT_PURPOSE_NUMBER = define(3)
  val GTK_INPUT_PURPOSE_PHONE = define(4)
  val GTK_INPUT_PURPOSE_URL = define(5)
  val GTK_INPUT_PURPOSE_EMAIL = define(6)
  val GTK_INPUT_PURPOSE_NAME = define(7)
  val GTK_INPUT_PURPOSE_PASSWORD = define(8)
  val GTK_INPUT_PURPOSE_PIN = define(9)
  val GTK_INPUT_PURPOSE_TERMINAL = define(10)
  inline def getName(inline value: GtkInputPurpose): Option[String] =
    value match
      case GTK_INPUT_PURPOSE_FREE_FORM => Some("GTK_INPUT_PURPOSE_FREE_FORM")
      case GTK_INPUT_PURPOSE_ALPHA => Some("GTK_INPUT_PURPOSE_ALPHA")
      case GTK_INPUT_PURPOSE_DIGITS => Some("GTK_INPUT_PURPOSE_DIGITS")
      case GTK_INPUT_PURPOSE_NUMBER => Some("GTK_INPUT_PURPOSE_NUMBER")
      case GTK_INPUT_PURPOSE_PHONE => Some("GTK_INPUT_PURPOSE_PHONE")
      case GTK_INPUT_PURPOSE_URL => Some("GTK_INPUT_PURPOSE_URL")
      case GTK_INPUT_PURPOSE_EMAIL => Some("GTK_INPUT_PURPOSE_EMAIL")
      case GTK_INPUT_PURPOSE_NAME => Some("GTK_INPUT_PURPOSE_NAME")
      case GTK_INPUT_PURPOSE_PASSWORD => Some("GTK_INPUT_PURPOSE_PASSWORD")
      case GTK_INPUT_PURPOSE_PIN => Some("GTK_INPUT_PURPOSE_PIN")
      case GTK_INPUT_PURPOSE_TERMINAL => Some("GTK_INPUT_PURPOSE_TERMINAL")
      case _ => None
  extension (a: GtkInputPurpose)
    inline def &(b: GtkInputPurpose): GtkInputPurpose = a & b
    inline def |(b: GtkInputPurpose): GtkInputPurpose = a | b
    inline def is(b: GtkInputPurpose): Boolean = (a & b) == b

opaque type GtkJustification = CUnsignedInt
object GtkJustification extends CEnumU[GtkJustification]:
  given _tag: Tag[GtkJustification] = Tag.UInt
  inline def define(inline a: Long): GtkJustification = a.toUInt
  val GTK_JUSTIFY_LEFT = define(0)
  val GTK_JUSTIFY_RIGHT = define(1)
  val GTK_JUSTIFY_CENTER = define(2)
  val GTK_JUSTIFY_FILL = define(3)
  inline def getName(inline value: GtkJustification): Option[String] =
    value match
      case GTK_JUSTIFY_LEFT => Some("GTK_JUSTIFY_LEFT")
      case GTK_JUSTIFY_RIGHT => Some("GTK_JUSTIFY_RIGHT")
      case GTK_JUSTIFY_CENTER => Some("GTK_JUSTIFY_CENTER")
      case GTK_JUSTIFY_FILL => Some("GTK_JUSTIFY_FILL")
      case _ => None
  extension (a: GtkJustification)
    inline def &(b: GtkJustification): GtkJustification = a & b
    inline def |(b: GtkJustification): GtkJustification = a | b
    inline def is(b: GtkJustification): Boolean = (a & b) == b

opaque type GtkLevelBarMode = CUnsignedInt
object GtkLevelBarMode extends CEnumU[GtkLevelBarMode]:
  given _tag: Tag[GtkLevelBarMode] = Tag.UInt
  inline def define(inline a: Long): GtkLevelBarMode = a.toUInt
  val GTK_LEVEL_BAR_MODE_CONTINUOUS = define(0)
  val GTK_LEVEL_BAR_MODE_DISCRETE = define(1)
  inline def getName(inline value: GtkLevelBarMode): Option[String] =
    value match
      case GTK_LEVEL_BAR_MODE_CONTINUOUS => Some("GTK_LEVEL_BAR_MODE_CONTINUOUS")
      case GTK_LEVEL_BAR_MODE_DISCRETE => Some("GTK_LEVEL_BAR_MODE_DISCRETE")
      case _ => None
  extension (a: GtkLevelBarMode)
    inline def &(b: GtkLevelBarMode): GtkLevelBarMode = a & b
    inline def |(b: GtkLevelBarMode): GtkLevelBarMode = a | b
    inline def is(b: GtkLevelBarMode): Boolean = (a & b) == b

opaque type GtkLicense = CUnsignedInt
object GtkLicense extends CEnumU[GtkLicense]:
  given _tag: Tag[GtkLicense] = Tag.UInt
  inline def define(inline a: Long): GtkLicense = a.toUInt
  val GTK_LICENSE_UNKNOWN = define(0)
  val GTK_LICENSE_CUSTOM = define(1)
  val GTK_LICENSE_GPL_2_0 = define(2)
  val GTK_LICENSE_GPL_3_0 = define(3)
  val GTK_LICENSE_LGPL_2_1 = define(4)
  val GTK_LICENSE_LGPL_3_0 = define(5)
  val GTK_LICENSE_BSD = define(6)
  val GTK_LICENSE_MIT_X11 = define(7)
  val GTK_LICENSE_ARTISTIC = define(8)
  val GTK_LICENSE_GPL_2_0_ONLY = define(9)
  val GTK_LICENSE_GPL_3_0_ONLY = define(10)
  val GTK_LICENSE_LGPL_2_1_ONLY = define(11)
  val GTK_LICENSE_LGPL_3_0_ONLY = define(12)
  val GTK_LICENSE_AGPL_3_0 = define(13)
  val GTK_LICENSE_AGPL_3_0_ONLY = define(14)
  val GTK_LICENSE_BSD_3 = define(15)
  val GTK_LICENSE_APACHE_2_0 = define(16)
  val GTK_LICENSE_MPL_2_0 = define(17)
  inline def getName(inline value: GtkLicense): Option[String] =
    value match
      case GTK_LICENSE_UNKNOWN => Some("GTK_LICENSE_UNKNOWN")
      case GTK_LICENSE_CUSTOM => Some("GTK_LICENSE_CUSTOM")
      case GTK_LICENSE_GPL_2_0 => Some("GTK_LICENSE_GPL_2_0")
      case GTK_LICENSE_GPL_3_0 => Some("GTK_LICENSE_GPL_3_0")
      case GTK_LICENSE_LGPL_2_1 => Some("GTK_LICENSE_LGPL_2_1")
      case GTK_LICENSE_LGPL_3_0 => Some("GTK_LICENSE_LGPL_3_0")
      case GTK_LICENSE_BSD => Some("GTK_LICENSE_BSD")
      case GTK_LICENSE_MIT_X11 => Some("GTK_LICENSE_MIT_X11")
      case GTK_LICENSE_ARTISTIC => Some("GTK_LICENSE_ARTISTIC")
      case GTK_LICENSE_GPL_2_0_ONLY => Some("GTK_LICENSE_GPL_2_0_ONLY")
      case GTK_LICENSE_GPL_3_0_ONLY => Some("GTK_LICENSE_GPL_3_0_ONLY")
      case GTK_LICENSE_LGPL_2_1_ONLY => Some("GTK_LICENSE_LGPL_2_1_ONLY")
      case GTK_LICENSE_LGPL_3_0_ONLY => Some("GTK_LICENSE_LGPL_3_0_ONLY")
      case GTK_LICENSE_AGPL_3_0 => Some("GTK_LICENSE_AGPL_3_0")
      case GTK_LICENSE_AGPL_3_0_ONLY => Some("GTK_LICENSE_AGPL_3_0_ONLY")
      case GTK_LICENSE_BSD_3 => Some("GTK_LICENSE_BSD_3")
      case GTK_LICENSE_APACHE_2_0 => Some("GTK_LICENSE_APACHE_2_0")
      case GTK_LICENSE_MPL_2_0 => Some("GTK_LICENSE_MPL_2_0")
      case _ => None
  extension (a: GtkLicense)
    inline def &(b: GtkLicense): GtkLicense = a & b
    inline def |(b: GtkLicense): GtkLicense = a | b
    inline def is(b: GtkLicense): Boolean = (a & b) == b

opaque type GtkMessageType = CUnsignedInt
object GtkMessageType extends CEnumU[GtkMessageType]:
  given _tag: Tag[GtkMessageType] = Tag.UInt
  inline def define(inline a: Long): GtkMessageType = a.toUInt
  val GTK_MESSAGE_INFO = define(0)
  val GTK_MESSAGE_WARNING = define(1)
  val GTK_MESSAGE_QUESTION = define(2)
  val GTK_MESSAGE_ERROR = define(3)
  val GTK_MESSAGE_OTHER = define(4)
  inline def getName(inline value: GtkMessageType): Option[String] =
    value match
      case GTK_MESSAGE_INFO => Some("GTK_MESSAGE_INFO")
      case GTK_MESSAGE_WARNING => Some("GTK_MESSAGE_WARNING")
      case GTK_MESSAGE_QUESTION => Some("GTK_MESSAGE_QUESTION")
      case GTK_MESSAGE_ERROR => Some("GTK_MESSAGE_ERROR")
      case GTK_MESSAGE_OTHER => Some("GTK_MESSAGE_OTHER")
      case _ => None
  extension (a: GtkMessageType)
    inline def &(b: GtkMessageType): GtkMessageType = a & b
    inline def |(b: GtkMessageType): GtkMessageType = a | b
    inline def is(b: GtkMessageType): Boolean = (a & b) == b

opaque type GtkMovementStep = CUnsignedInt
object GtkMovementStep extends CEnumU[GtkMovementStep]:
  given _tag: Tag[GtkMovementStep] = Tag.UInt
  inline def define(inline a: Long): GtkMovementStep = a.toUInt
  val GTK_MOVEMENT_LOGICAL_POSITIONS = define(0)
  val GTK_MOVEMENT_VISUAL_POSITIONS = define(1)
  val GTK_MOVEMENT_WORDS = define(2)
  val GTK_MOVEMENT_DISPLAY_LINES = define(3)
  val GTK_MOVEMENT_DISPLAY_LINE_ENDS = define(4)
  val GTK_MOVEMENT_PARAGRAPHS = define(5)
  val GTK_MOVEMENT_PARAGRAPH_ENDS = define(6)
  val GTK_MOVEMENT_PAGES = define(7)
  val GTK_MOVEMENT_BUFFER_ENDS = define(8)
  val GTK_MOVEMENT_HORIZONTAL_PAGES = define(9)
  inline def getName(inline value: GtkMovementStep): Option[String] =
    value match
      case GTK_MOVEMENT_LOGICAL_POSITIONS => Some("GTK_MOVEMENT_LOGICAL_POSITIONS")
      case GTK_MOVEMENT_VISUAL_POSITIONS => Some("GTK_MOVEMENT_VISUAL_POSITIONS")
      case GTK_MOVEMENT_WORDS => Some("GTK_MOVEMENT_WORDS")
      case GTK_MOVEMENT_DISPLAY_LINES => Some("GTK_MOVEMENT_DISPLAY_LINES")
      case GTK_MOVEMENT_DISPLAY_LINE_ENDS => Some("GTK_MOVEMENT_DISPLAY_LINE_ENDS")
      case GTK_MOVEMENT_PARAGRAPHS => Some("GTK_MOVEMENT_PARAGRAPHS")
      case GTK_MOVEMENT_PARAGRAPH_ENDS => Some("GTK_MOVEMENT_PARAGRAPH_ENDS")
      case GTK_MOVEMENT_PAGES => Some("GTK_MOVEMENT_PAGES")
      case GTK_MOVEMENT_BUFFER_ENDS => Some("GTK_MOVEMENT_BUFFER_ENDS")
      case GTK_MOVEMENT_HORIZONTAL_PAGES => Some("GTK_MOVEMENT_HORIZONTAL_PAGES")
      case _ => None
  extension (a: GtkMovementStep)
    inline def &(b: GtkMovementStep): GtkMovementStep = a & b
    inline def |(b: GtkMovementStep): GtkMovementStep = a | b
    inline def is(b: GtkMovementStep): Boolean = (a & b) == b

opaque type GtkNaturalWrapMode = CUnsignedInt
object GtkNaturalWrapMode extends CEnumU[GtkNaturalWrapMode]:
  given _tag: Tag[GtkNaturalWrapMode] = Tag.UInt
  inline def define(inline a: Long): GtkNaturalWrapMode = a.toUInt
  val GTK_NATURAL_WRAP_INHERIT = define(0)
  val GTK_NATURAL_WRAP_NONE = define(1)
  val GTK_NATURAL_WRAP_WORD = define(2)
  inline def getName(inline value: GtkNaturalWrapMode): Option[String] =
    value match
      case GTK_NATURAL_WRAP_INHERIT => Some("GTK_NATURAL_WRAP_INHERIT")
      case GTK_NATURAL_WRAP_NONE => Some("GTK_NATURAL_WRAP_NONE")
      case GTK_NATURAL_WRAP_WORD => Some("GTK_NATURAL_WRAP_WORD")
      case _ => None
  extension (a: GtkNaturalWrapMode)
    inline def &(b: GtkNaturalWrapMode): GtkNaturalWrapMode = a & b
    inline def |(b: GtkNaturalWrapMode): GtkNaturalWrapMode = a | b
    inline def is(b: GtkNaturalWrapMode): Boolean = (a & b) == b

opaque type GtkNotebookTab = CUnsignedInt
object GtkNotebookTab extends CEnumU[GtkNotebookTab]:
  given _tag: Tag[GtkNotebookTab] = Tag.UInt
  inline def define(inline a: Long): GtkNotebookTab = a.toUInt
  val GTK_NOTEBOOK_TAB_FIRST = define(0)
  val GTK_NOTEBOOK_TAB_LAST = define(1)
  inline def getName(inline value: GtkNotebookTab): Option[String] =
    value match
      case GTK_NOTEBOOK_TAB_FIRST => Some("GTK_NOTEBOOK_TAB_FIRST")
      case GTK_NOTEBOOK_TAB_LAST => Some("GTK_NOTEBOOK_TAB_LAST")
      case _ => None
  extension (a: GtkNotebookTab)
    inline def &(b: GtkNotebookTab): GtkNotebookTab = a & b
    inline def |(b: GtkNotebookTab): GtkNotebookTab = a | b
    inline def is(b: GtkNotebookTab): Boolean = (a & b) == b

opaque type GtkNumberUpLayout = CUnsignedInt
object GtkNumberUpLayout extends CEnumU[GtkNumberUpLayout]:
  given _tag: Tag[GtkNumberUpLayout] = Tag.UInt
  inline def define(inline a: Long): GtkNumberUpLayout = a.toUInt
  val GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_TOP_TO_BOTTOM = define(0)
  val GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_BOTTOM_TO_TOP = define(1)
  val GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_TOP_TO_BOTTOM = define(2)
  val GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_BOTTOM_TO_TOP = define(3)
  val GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_LEFT_TO_RIGHT = define(4)
  val GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_RIGHT_TO_LEFT = define(5)
  val GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_LEFT_TO_RIGHT = define(6)
  val GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_RIGHT_TO_LEFT = define(7)
  inline def getName(inline value: GtkNumberUpLayout): Option[String] =
    value match
      case GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_TOP_TO_BOTTOM => Some("GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_TOP_TO_BOTTOM")
      case GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_BOTTOM_TO_TOP => Some("GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_BOTTOM_TO_TOP")
      case GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_TOP_TO_BOTTOM => Some("GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_TOP_TO_BOTTOM")
      case GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_BOTTOM_TO_TOP => Some("GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_BOTTOM_TO_TOP")
      case GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_LEFT_TO_RIGHT => Some("GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_LEFT_TO_RIGHT")
      case GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_RIGHT_TO_LEFT => Some("GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_RIGHT_TO_LEFT")
      case GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_LEFT_TO_RIGHT => Some("GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_LEFT_TO_RIGHT")
      case GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_RIGHT_TO_LEFT => Some("GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_RIGHT_TO_LEFT")
      case _ => None
  extension (a: GtkNumberUpLayout)
    inline def &(b: GtkNumberUpLayout): GtkNumberUpLayout = a & b
    inline def |(b: GtkNumberUpLayout): GtkNumberUpLayout = a | b
    inline def is(b: GtkNumberUpLayout): Boolean = (a & b) == b

opaque type GtkOrdering = CInt
object GtkOrdering extends CEnum[GtkOrdering]:
  given _tag: Tag[GtkOrdering] = Tag.Int
  inline def define(inline a: CInt): GtkOrdering = a
  val GTK_ORDERING_SMALLER = define(-1)
  val GTK_ORDERING_EQUAL = define(0)
  val GTK_ORDERING_LARGER = define(1)
  inline def getName(inline value: GtkOrdering): Option[String] =
    value match
      case GTK_ORDERING_SMALLER => Some("GTK_ORDERING_SMALLER")
      case GTK_ORDERING_EQUAL => Some("GTK_ORDERING_EQUAL")
      case GTK_ORDERING_LARGER => Some("GTK_ORDERING_LARGER")
      case _ => None
  extension (a: GtkOrdering)
    inline def &(b: GtkOrdering): GtkOrdering = a & b
    inline def |(b: GtkOrdering): GtkOrdering = a | b
    inline def is(b: GtkOrdering): Boolean = (a & b) == b

opaque type GtkOrientation = CUnsignedInt
object GtkOrientation extends CEnumU[GtkOrientation]:
  given _tag: Tag[GtkOrientation] = Tag.UInt
  inline def define(inline a: Long): GtkOrientation = a.toUInt
  val GTK_ORIENTATION_HORIZONTAL = define(0)
  val GTK_ORIENTATION_VERTICAL = define(1)
  inline def getName(inline value: GtkOrientation): Option[String] =
    value match
      case GTK_ORIENTATION_HORIZONTAL => Some("GTK_ORIENTATION_HORIZONTAL")
      case GTK_ORIENTATION_VERTICAL => Some("GTK_ORIENTATION_VERTICAL")
      case _ => None
  extension (a: GtkOrientation)
    inline def &(b: GtkOrientation): GtkOrientation = a & b
    inline def |(b: GtkOrientation): GtkOrientation = a | b
    inline def is(b: GtkOrientation): Boolean = (a & b) == b

opaque type GtkOverflow = CUnsignedInt
object GtkOverflow extends CEnumU[GtkOverflow]:
  given _tag: Tag[GtkOverflow] = Tag.UInt
  inline def define(inline a: Long): GtkOverflow = a.toUInt
  val GTK_OVERFLOW_VISIBLE = define(0)
  val GTK_OVERFLOW_HIDDEN = define(1)
  inline def getName(inline value: GtkOverflow): Option[String] =
    value match
      case GTK_OVERFLOW_VISIBLE => Some("GTK_OVERFLOW_VISIBLE")
      case GTK_OVERFLOW_HIDDEN => Some("GTK_OVERFLOW_HIDDEN")
      case _ => None
  extension (a: GtkOverflow)
    inline def &(b: GtkOverflow): GtkOverflow = a & b
    inline def |(b: GtkOverflow): GtkOverflow = a | b
    inline def is(b: GtkOverflow): Boolean = (a & b) == b

opaque type GtkPackType = CUnsignedInt
object GtkPackType extends CEnumU[GtkPackType]:
  given _tag: Tag[GtkPackType] = Tag.UInt
  inline def define(inline a: Long): GtkPackType = a.toUInt
  val GTK_PACK_START = define(0)
  val GTK_PACK_END = define(1)
  inline def getName(inline value: GtkPackType): Option[String] =
    value match
      case GTK_PACK_START => Some("GTK_PACK_START")
      case GTK_PACK_END => Some("GTK_PACK_END")
      case _ => None
  extension (a: GtkPackType)
    inline def &(b: GtkPackType): GtkPackType = a & b
    inline def |(b: GtkPackType): GtkPackType = a | b
    inline def is(b: GtkPackType): Boolean = (a & b) == b

opaque type GtkPadActionType = CUnsignedInt
object GtkPadActionType extends CEnumU[GtkPadActionType]:
  given _tag: Tag[GtkPadActionType] = Tag.UInt
  inline def define(inline a: Long): GtkPadActionType = a.toUInt
  val GTK_PAD_ACTION_BUTTON = define(0)
  val GTK_PAD_ACTION_RING = define(1)
  val GTK_PAD_ACTION_STRIP = define(2)
  inline def getName(inline value: GtkPadActionType): Option[String] =
    value match
      case GTK_PAD_ACTION_BUTTON => Some("GTK_PAD_ACTION_BUTTON")
      case GTK_PAD_ACTION_RING => Some("GTK_PAD_ACTION_RING")
      case GTK_PAD_ACTION_STRIP => Some("GTK_PAD_ACTION_STRIP")
      case _ => None
  extension (a: GtkPadActionType)
    inline def &(b: GtkPadActionType): GtkPadActionType = a & b
    inline def |(b: GtkPadActionType): GtkPadActionType = a | b
    inline def is(b: GtkPadActionType): Boolean = (a & b) == b

opaque type GtkPageOrientation = CUnsignedInt
object GtkPageOrientation extends CEnumU[GtkPageOrientation]:
  given _tag: Tag[GtkPageOrientation] = Tag.UInt
  inline def define(inline a: Long): GtkPageOrientation = a.toUInt
  val GTK_PAGE_ORIENTATION_PORTRAIT = define(0)
  val GTK_PAGE_ORIENTATION_LANDSCAPE = define(1)
  val GTK_PAGE_ORIENTATION_REVERSE_PORTRAIT = define(2)
  val GTK_PAGE_ORIENTATION_REVERSE_LANDSCAPE = define(3)
  inline def getName(inline value: GtkPageOrientation): Option[String] =
    value match
      case GTK_PAGE_ORIENTATION_PORTRAIT => Some("GTK_PAGE_ORIENTATION_PORTRAIT")
      case GTK_PAGE_ORIENTATION_LANDSCAPE => Some("GTK_PAGE_ORIENTATION_LANDSCAPE")
      case GTK_PAGE_ORIENTATION_REVERSE_PORTRAIT => Some("GTK_PAGE_ORIENTATION_REVERSE_PORTRAIT")
      case GTK_PAGE_ORIENTATION_REVERSE_LANDSCAPE => Some("GTK_PAGE_ORIENTATION_REVERSE_LANDSCAPE")
      case _ => None
  extension (a: GtkPageOrientation)
    inline def &(b: GtkPageOrientation): GtkPageOrientation = a & b
    inline def |(b: GtkPageOrientation): GtkPageOrientation = a | b
    inline def is(b: GtkPageOrientation): Boolean = (a & b) == b

opaque type GtkPageSet = CUnsignedInt
object GtkPageSet extends CEnumU[GtkPageSet]:
  given _tag: Tag[GtkPageSet] = Tag.UInt
  inline def define(inline a: Long): GtkPageSet = a.toUInt
  val GTK_PAGE_SET_ALL = define(0)
  val GTK_PAGE_SET_EVEN = define(1)
  val GTK_PAGE_SET_ODD = define(2)
  inline def getName(inline value: GtkPageSet): Option[String] =
    value match
      case GTK_PAGE_SET_ALL => Some("GTK_PAGE_SET_ALL")
      case GTK_PAGE_SET_EVEN => Some("GTK_PAGE_SET_EVEN")
      case GTK_PAGE_SET_ODD => Some("GTK_PAGE_SET_ODD")
      case _ => None
  extension (a: GtkPageSet)
    inline def &(b: GtkPageSet): GtkPageSet = a & b
    inline def |(b: GtkPageSet): GtkPageSet = a | b
    inline def is(b: GtkPageSet): Boolean = (a & b) == b

opaque type GtkPanDirection = CUnsignedInt
object GtkPanDirection extends CEnumU[GtkPanDirection]:
  given _tag: Tag[GtkPanDirection] = Tag.UInt
  inline def define(inline a: Long): GtkPanDirection = a.toUInt
  val GTK_PAN_DIRECTION_LEFT = define(0)
  val GTK_PAN_DIRECTION_RIGHT = define(1)
  val GTK_PAN_DIRECTION_UP = define(2)
  val GTK_PAN_DIRECTION_DOWN = define(3)
  inline def getName(inline value: GtkPanDirection): Option[String] =
    value match
      case GTK_PAN_DIRECTION_LEFT => Some("GTK_PAN_DIRECTION_LEFT")
      case GTK_PAN_DIRECTION_RIGHT => Some("GTK_PAN_DIRECTION_RIGHT")
      case GTK_PAN_DIRECTION_UP => Some("GTK_PAN_DIRECTION_UP")
      case GTK_PAN_DIRECTION_DOWN => Some("GTK_PAN_DIRECTION_DOWN")
      case _ => None
  extension (a: GtkPanDirection)
    inline def &(b: GtkPanDirection): GtkPanDirection = a & b
    inline def |(b: GtkPanDirection): GtkPanDirection = a | b
    inline def is(b: GtkPanDirection): Boolean = (a & b) == b

opaque type GtkPickFlags = CUnsignedInt
object GtkPickFlags extends CEnumU[GtkPickFlags]:
  given _tag: Tag[GtkPickFlags] = Tag.UInt
  inline def define(inline a: Long): GtkPickFlags = a.toUInt
  val GTK_PICK_DEFAULT = define(0)
  val GTK_PICK_INSENSITIVE = define(1)
  val GTK_PICK_NON_TARGETABLE = define(2)
  inline def getName(inline value: GtkPickFlags): Option[String] =
    value match
      case GTK_PICK_DEFAULT => Some("GTK_PICK_DEFAULT")
      case GTK_PICK_INSENSITIVE => Some("GTK_PICK_INSENSITIVE")
      case GTK_PICK_NON_TARGETABLE => Some("GTK_PICK_NON_TARGETABLE")
      case _ => None
  extension (a: GtkPickFlags)
    inline def &(b: GtkPickFlags): GtkPickFlags = a & b
    inline def |(b: GtkPickFlags): GtkPickFlags = a | b
    inline def is(b: GtkPickFlags): Boolean = (a & b) == b

opaque type GtkPolicyType = CUnsignedInt
object GtkPolicyType extends CEnumU[GtkPolicyType]:
  given _tag: Tag[GtkPolicyType] = Tag.UInt
  inline def define(inline a: Long): GtkPolicyType = a.toUInt
  val GTK_POLICY_ALWAYS = define(0)
  val GTK_POLICY_AUTOMATIC = define(1)
  val GTK_POLICY_NEVER = define(2)
  val GTK_POLICY_EXTERNAL = define(3)
  inline def getName(inline value: GtkPolicyType): Option[String] =
    value match
      case GTK_POLICY_ALWAYS => Some("GTK_POLICY_ALWAYS")
      case GTK_POLICY_AUTOMATIC => Some("GTK_POLICY_AUTOMATIC")
      case GTK_POLICY_NEVER => Some("GTK_POLICY_NEVER")
      case GTK_POLICY_EXTERNAL => Some("GTK_POLICY_EXTERNAL")
      case _ => None
  extension (a: GtkPolicyType)
    inline def &(b: GtkPolicyType): GtkPolicyType = a & b
    inline def |(b: GtkPolicyType): GtkPolicyType = a | b
    inline def is(b: GtkPolicyType): Boolean = (a & b) == b

opaque type GtkPopoverMenuFlags = CUnsignedInt
object GtkPopoverMenuFlags extends CEnumU[GtkPopoverMenuFlags]:
  given _tag: Tag[GtkPopoverMenuFlags] = Tag.UInt
  inline def define(inline a: Long): GtkPopoverMenuFlags = a.toUInt
  val GTK_POPOVER_MENU_NESTED = define(1)
  inline def getName(inline value: GtkPopoverMenuFlags): Option[String] =
    value match
      case GTK_POPOVER_MENU_NESTED => Some("GTK_POPOVER_MENU_NESTED")
      case _ => None
  extension (a: GtkPopoverMenuFlags)
    inline def &(b: GtkPopoverMenuFlags): GtkPopoverMenuFlags = a & b
    inline def |(b: GtkPopoverMenuFlags): GtkPopoverMenuFlags = a | b
    inline def is(b: GtkPopoverMenuFlags): Boolean = (a & b) == b

opaque type GtkPositionType = CUnsignedInt
object GtkPositionType extends CEnumU[GtkPositionType]:
  given _tag: Tag[GtkPositionType] = Tag.UInt
  inline def define(inline a: Long): GtkPositionType = a.toUInt
  val GTK_POS_LEFT = define(0)
  val GTK_POS_RIGHT = define(1)
  val GTK_POS_TOP = define(2)
  val GTK_POS_BOTTOM = define(3)
  inline def getName(inline value: GtkPositionType): Option[String] =
    value match
      case GTK_POS_LEFT => Some("GTK_POS_LEFT")
      case GTK_POS_RIGHT => Some("GTK_POS_RIGHT")
      case GTK_POS_TOP => Some("GTK_POS_TOP")
      case GTK_POS_BOTTOM => Some("GTK_POS_BOTTOM")
      case _ => None
  extension (a: GtkPositionType)
    inline def &(b: GtkPositionType): GtkPositionType = a & b
    inline def |(b: GtkPositionType): GtkPositionType = a | b
    inline def is(b: GtkPositionType): Boolean = (a & b) == b

opaque type GtkPrintDuplex = CUnsignedInt
object GtkPrintDuplex extends CEnumU[GtkPrintDuplex]:
  given _tag: Tag[GtkPrintDuplex] = Tag.UInt
  inline def define(inline a: Long): GtkPrintDuplex = a.toUInt
  val GTK_PRINT_DUPLEX_SIMPLEX = define(0)
  val GTK_PRINT_DUPLEX_HORIZONTAL = define(1)
  val GTK_PRINT_DUPLEX_VERTICAL = define(2)
  inline def getName(inline value: GtkPrintDuplex): Option[String] =
    value match
      case GTK_PRINT_DUPLEX_SIMPLEX => Some("GTK_PRINT_DUPLEX_SIMPLEX")
      case GTK_PRINT_DUPLEX_HORIZONTAL => Some("GTK_PRINT_DUPLEX_HORIZONTAL")
      case GTK_PRINT_DUPLEX_VERTICAL => Some("GTK_PRINT_DUPLEX_VERTICAL")
      case _ => None
  extension (a: GtkPrintDuplex)
    inline def &(b: GtkPrintDuplex): GtkPrintDuplex = a & b
    inline def |(b: GtkPrintDuplex): GtkPrintDuplex = a | b
    inline def is(b: GtkPrintDuplex): Boolean = (a & b) == b

opaque type GtkPrintError = CUnsignedInt
object GtkPrintError extends CEnumU[GtkPrintError]:
  given _tag: Tag[GtkPrintError] = Tag.UInt
  inline def define(inline a: Long): GtkPrintError = a.toUInt
  val GTK_PRINT_ERROR_GENERAL = define(0)
  val GTK_PRINT_ERROR_INTERNAL_ERROR = define(1)
  val GTK_PRINT_ERROR_NOMEM = define(2)
  val GTK_PRINT_ERROR_INVALID_FILE = define(3)
  inline def getName(inline value: GtkPrintError): Option[String] =
    value match
      case GTK_PRINT_ERROR_GENERAL => Some("GTK_PRINT_ERROR_GENERAL")
      case GTK_PRINT_ERROR_INTERNAL_ERROR => Some("GTK_PRINT_ERROR_INTERNAL_ERROR")
      case GTK_PRINT_ERROR_NOMEM => Some("GTK_PRINT_ERROR_NOMEM")
      case GTK_PRINT_ERROR_INVALID_FILE => Some("GTK_PRINT_ERROR_INVALID_FILE")
      case _ => None
  extension (a: GtkPrintError)
    inline def &(b: GtkPrintError): GtkPrintError = a & b
    inline def |(b: GtkPrintError): GtkPrintError = a | b
    inline def is(b: GtkPrintError): Boolean = (a & b) == b

opaque type GtkPrintOperationAction = CUnsignedInt
object GtkPrintOperationAction extends CEnumU[GtkPrintOperationAction]:
  given _tag: Tag[GtkPrintOperationAction] = Tag.UInt
  inline def define(inline a: Long): GtkPrintOperationAction = a.toUInt
  val GTK_PRINT_OPERATION_ACTION_PRINT_DIALOG = define(0)
  val GTK_PRINT_OPERATION_ACTION_PRINT = define(1)
  val GTK_PRINT_OPERATION_ACTION_PREVIEW = define(2)
  val GTK_PRINT_OPERATION_ACTION_EXPORT = define(3)
  inline def getName(inline value: GtkPrintOperationAction): Option[String] =
    value match
      case GTK_PRINT_OPERATION_ACTION_PRINT_DIALOG => Some("GTK_PRINT_OPERATION_ACTION_PRINT_DIALOG")
      case GTK_PRINT_OPERATION_ACTION_PRINT => Some("GTK_PRINT_OPERATION_ACTION_PRINT")
      case GTK_PRINT_OPERATION_ACTION_PREVIEW => Some("GTK_PRINT_OPERATION_ACTION_PREVIEW")
      case GTK_PRINT_OPERATION_ACTION_EXPORT => Some("GTK_PRINT_OPERATION_ACTION_EXPORT")
      case _ => None
  extension (a: GtkPrintOperationAction)
    inline def &(b: GtkPrintOperationAction): GtkPrintOperationAction = a & b
    inline def |(b: GtkPrintOperationAction): GtkPrintOperationAction = a | b
    inline def is(b: GtkPrintOperationAction): Boolean = (a & b) == b

opaque type GtkPrintOperationResult = CUnsignedInt
object GtkPrintOperationResult extends CEnumU[GtkPrintOperationResult]:
  given _tag: Tag[GtkPrintOperationResult] = Tag.UInt
  inline def define(inline a: Long): GtkPrintOperationResult = a.toUInt
  val GTK_PRINT_OPERATION_RESULT_ERROR = define(0)
  val GTK_PRINT_OPERATION_RESULT_APPLY = define(1)
  val GTK_PRINT_OPERATION_RESULT_CANCEL = define(2)
  val GTK_PRINT_OPERATION_RESULT_IN_PROGRESS = define(3)
  inline def getName(inline value: GtkPrintOperationResult): Option[String] =
    value match
      case GTK_PRINT_OPERATION_RESULT_ERROR => Some("GTK_PRINT_OPERATION_RESULT_ERROR")
      case GTK_PRINT_OPERATION_RESULT_APPLY => Some("GTK_PRINT_OPERATION_RESULT_APPLY")
      case GTK_PRINT_OPERATION_RESULT_CANCEL => Some("GTK_PRINT_OPERATION_RESULT_CANCEL")
      case GTK_PRINT_OPERATION_RESULT_IN_PROGRESS => Some("GTK_PRINT_OPERATION_RESULT_IN_PROGRESS")
      case _ => None
  extension (a: GtkPrintOperationResult)
    inline def &(b: GtkPrintOperationResult): GtkPrintOperationResult = a & b
    inline def |(b: GtkPrintOperationResult): GtkPrintOperationResult = a | b
    inline def is(b: GtkPrintOperationResult): Boolean = (a & b) == b

opaque type GtkPrintPages = CUnsignedInt
object GtkPrintPages extends CEnumU[GtkPrintPages]:
  given _tag: Tag[GtkPrintPages] = Tag.UInt
  inline def define(inline a: Long): GtkPrintPages = a.toUInt
  val GTK_PRINT_PAGES_ALL = define(0)
  val GTK_PRINT_PAGES_CURRENT = define(1)
  val GTK_PRINT_PAGES_RANGES = define(2)
  val GTK_PRINT_PAGES_SELECTION = define(3)
  inline def getName(inline value: GtkPrintPages): Option[String] =
    value match
      case GTK_PRINT_PAGES_ALL => Some("GTK_PRINT_PAGES_ALL")
      case GTK_PRINT_PAGES_CURRENT => Some("GTK_PRINT_PAGES_CURRENT")
      case GTK_PRINT_PAGES_RANGES => Some("GTK_PRINT_PAGES_RANGES")
      case GTK_PRINT_PAGES_SELECTION => Some("GTK_PRINT_PAGES_SELECTION")
      case _ => None
  extension (a: GtkPrintPages)
    inline def &(b: GtkPrintPages): GtkPrintPages = a & b
    inline def |(b: GtkPrintPages): GtkPrintPages = a | b
    inline def is(b: GtkPrintPages): Boolean = (a & b) == b

opaque type GtkPrintQuality = CUnsignedInt
object GtkPrintQuality extends CEnumU[GtkPrintQuality]:
  given _tag: Tag[GtkPrintQuality] = Tag.UInt
  inline def define(inline a: Long): GtkPrintQuality = a.toUInt
  val GTK_PRINT_QUALITY_LOW = define(0)
  val GTK_PRINT_QUALITY_NORMAL = define(1)
  val GTK_PRINT_QUALITY_HIGH = define(2)
  val GTK_PRINT_QUALITY_DRAFT = define(3)
  inline def getName(inline value: GtkPrintQuality): Option[String] =
    value match
      case GTK_PRINT_QUALITY_LOW => Some("GTK_PRINT_QUALITY_LOW")
      case GTK_PRINT_QUALITY_NORMAL => Some("GTK_PRINT_QUALITY_NORMAL")
      case GTK_PRINT_QUALITY_HIGH => Some("GTK_PRINT_QUALITY_HIGH")
      case GTK_PRINT_QUALITY_DRAFT => Some("GTK_PRINT_QUALITY_DRAFT")
      case _ => None
  extension (a: GtkPrintQuality)
    inline def &(b: GtkPrintQuality): GtkPrintQuality = a & b
    inline def |(b: GtkPrintQuality): GtkPrintQuality = a | b
    inline def is(b: GtkPrintQuality): Boolean = (a & b) == b

opaque type GtkPrintStatus = CUnsignedInt
object GtkPrintStatus extends CEnumU[GtkPrintStatus]:
  given _tag: Tag[GtkPrintStatus] = Tag.UInt
  inline def define(inline a: Long): GtkPrintStatus = a.toUInt
  val GTK_PRINT_STATUS_INITIAL = define(0)
  val GTK_PRINT_STATUS_PREPARING = define(1)
  val GTK_PRINT_STATUS_GENERATING_DATA = define(2)
  val GTK_PRINT_STATUS_SENDING_DATA = define(3)
  val GTK_PRINT_STATUS_PENDING = define(4)
  val GTK_PRINT_STATUS_PENDING_ISSUE = define(5)
  val GTK_PRINT_STATUS_PRINTING = define(6)
  val GTK_PRINT_STATUS_FINISHED = define(7)
  val GTK_PRINT_STATUS_FINISHED_ABORTED = define(8)
  inline def getName(inline value: GtkPrintStatus): Option[String] =
    value match
      case GTK_PRINT_STATUS_INITIAL => Some("GTK_PRINT_STATUS_INITIAL")
      case GTK_PRINT_STATUS_PREPARING => Some("GTK_PRINT_STATUS_PREPARING")
      case GTK_PRINT_STATUS_GENERATING_DATA => Some("GTK_PRINT_STATUS_GENERATING_DATA")
      case GTK_PRINT_STATUS_SENDING_DATA => Some("GTK_PRINT_STATUS_SENDING_DATA")
      case GTK_PRINT_STATUS_PENDING => Some("GTK_PRINT_STATUS_PENDING")
      case GTK_PRINT_STATUS_PENDING_ISSUE => Some("GTK_PRINT_STATUS_PENDING_ISSUE")
      case GTK_PRINT_STATUS_PRINTING => Some("GTK_PRINT_STATUS_PRINTING")
      case GTK_PRINT_STATUS_FINISHED => Some("GTK_PRINT_STATUS_FINISHED")
      case GTK_PRINT_STATUS_FINISHED_ABORTED => Some("GTK_PRINT_STATUS_FINISHED_ABORTED")
      case _ => None
  extension (a: GtkPrintStatus)
    inline def &(b: GtkPrintStatus): GtkPrintStatus = a & b
    inline def |(b: GtkPrintStatus): GtkPrintStatus = a | b
    inline def is(b: GtkPrintStatus): Boolean = (a & b) == b

opaque type GtkPropagationLimit = CUnsignedInt
object GtkPropagationLimit extends CEnumU[GtkPropagationLimit]:
  given _tag: Tag[GtkPropagationLimit] = Tag.UInt
  inline def define(inline a: Long): GtkPropagationLimit = a.toUInt
  val GTK_LIMIT_NONE = define(0)
  val GTK_LIMIT_SAME_NATIVE = define(1)
  inline def getName(inline value: GtkPropagationLimit): Option[String] =
    value match
      case GTK_LIMIT_NONE => Some("GTK_LIMIT_NONE")
      case GTK_LIMIT_SAME_NATIVE => Some("GTK_LIMIT_SAME_NATIVE")
      case _ => None
  extension (a: GtkPropagationLimit)
    inline def &(b: GtkPropagationLimit): GtkPropagationLimit = a & b
    inline def |(b: GtkPropagationLimit): GtkPropagationLimit = a | b
    inline def is(b: GtkPropagationLimit): Boolean = (a & b) == b

opaque type GtkPropagationPhase = CUnsignedInt
object GtkPropagationPhase extends CEnumU[GtkPropagationPhase]:
  given _tag: Tag[GtkPropagationPhase] = Tag.UInt
  inline def define(inline a: Long): GtkPropagationPhase = a.toUInt
  val GTK_PHASE_NONE = define(0)
  val GTK_PHASE_CAPTURE = define(1)
  val GTK_PHASE_BUBBLE = define(2)
  val GTK_PHASE_TARGET = define(3)
  inline def getName(inline value: GtkPropagationPhase): Option[String] =
    value match
      case GTK_PHASE_NONE => Some("GTK_PHASE_NONE")
      case GTK_PHASE_CAPTURE => Some("GTK_PHASE_CAPTURE")
      case GTK_PHASE_BUBBLE => Some("GTK_PHASE_BUBBLE")
      case GTK_PHASE_TARGET => Some("GTK_PHASE_TARGET")
      case _ => None
  extension (a: GtkPropagationPhase)
    inline def &(b: GtkPropagationPhase): GtkPropagationPhase = a & b
    inline def |(b: GtkPropagationPhase): GtkPropagationPhase = a | b
    inline def is(b: GtkPropagationPhase): Boolean = (a & b) == b

opaque type GtkRecentManagerError = CUnsignedInt
object GtkRecentManagerError extends CEnumU[GtkRecentManagerError]:
  given _tag: Tag[GtkRecentManagerError] = Tag.UInt
  inline def define(inline a: Long): GtkRecentManagerError = a.toUInt
  val GTK_RECENT_MANAGER_ERROR_NOT_FOUND = define(0)
  val GTK_RECENT_MANAGER_ERROR_INVALID_URI = define(1)
  val GTK_RECENT_MANAGER_ERROR_INVALID_ENCODING = define(2)
  val GTK_RECENT_MANAGER_ERROR_NOT_REGISTERED = define(3)
  val GTK_RECENT_MANAGER_ERROR_READ = define(4)
  val GTK_RECENT_MANAGER_ERROR_WRITE = define(5)
  val GTK_RECENT_MANAGER_ERROR_UNKNOWN = define(6)
  inline def getName(inline value: GtkRecentManagerError): Option[String] =
    value match
      case GTK_RECENT_MANAGER_ERROR_NOT_FOUND => Some("GTK_RECENT_MANAGER_ERROR_NOT_FOUND")
      case GTK_RECENT_MANAGER_ERROR_INVALID_URI => Some("GTK_RECENT_MANAGER_ERROR_INVALID_URI")
      case GTK_RECENT_MANAGER_ERROR_INVALID_ENCODING => Some("GTK_RECENT_MANAGER_ERROR_INVALID_ENCODING")
      case GTK_RECENT_MANAGER_ERROR_NOT_REGISTERED => Some("GTK_RECENT_MANAGER_ERROR_NOT_REGISTERED")
      case GTK_RECENT_MANAGER_ERROR_READ => Some("GTK_RECENT_MANAGER_ERROR_READ")
      case GTK_RECENT_MANAGER_ERROR_WRITE => Some("GTK_RECENT_MANAGER_ERROR_WRITE")
      case GTK_RECENT_MANAGER_ERROR_UNKNOWN => Some("GTK_RECENT_MANAGER_ERROR_UNKNOWN")
      case _ => None
  extension (a: GtkRecentManagerError)
    inline def &(b: GtkRecentManagerError): GtkRecentManagerError = a & b
    inline def |(b: GtkRecentManagerError): GtkRecentManagerError = a | b
    inline def is(b: GtkRecentManagerError): Boolean = (a & b) == b

opaque type GtkResponseType = CInt
object GtkResponseType extends CEnum[GtkResponseType]:
  given _tag: Tag[GtkResponseType] = Tag.Int
  inline def define(inline a: CInt): GtkResponseType = a
  val GTK_RESPONSE_NONE = define(-1)
  val GTK_RESPONSE_REJECT = define(-2)
  val GTK_RESPONSE_ACCEPT = define(-3)
  val GTK_RESPONSE_DELETE_EVENT = define(-4)
  val GTK_RESPONSE_OK = define(-5)
  val GTK_RESPONSE_CANCEL = define(-6)
  val GTK_RESPONSE_CLOSE = define(-7)
  val GTK_RESPONSE_YES = define(-8)
  val GTK_RESPONSE_NO = define(-9)
  val GTK_RESPONSE_APPLY = define(-10)
  val GTK_RESPONSE_HELP = define(-11)
  inline def getName(inline value: GtkResponseType): Option[String] =
    value match
      case GTK_RESPONSE_NONE => Some("GTK_RESPONSE_NONE")
      case GTK_RESPONSE_REJECT => Some("GTK_RESPONSE_REJECT")
      case GTK_RESPONSE_ACCEPT => Some("GTK_RESPONSE_ACCEPT")
      case GTK_RESPONSE_DELETE_EVENT => Some("GTK_RESPONSE_DELETE_EVENT")
      case GTK_RESPONSE_OK => Some("GTK_RESPONSE_OK")
      case GTK_RESPONSE_CANCEL => Some("GTK_RESPONSE_CANCEL")
      case GTK_RESPONSE_CLOSE => Some("GTK_RESPONSE_CLOSE")
      case GTK_RESPONSE_YES => Some("GTK_RESPONSE_YES")
      case GTK_RESPONSE_NO => Some("GTK_RESPONSE_NO")
      case GTK_RESPONSE_APPLY => Some("GTK_RESPONSE_APPLY")
      case GTK_RESPONSE_HELP => Some("GTK_RESPONSE_HELP")
      case _ => None
  extension (a: GtkResponseType)
    inline def &(b: GtkResponseType): GtkResponseType = a & b
    inline def |(b: GtkResponseType): GtkResponseType = a | b
    inline def is(b: GtkResponseType): Boolean = (a & b) == b

opaque type GtkRevealerTransitionType = CUnsignedInt
object GtkRevealerTransitionType extends CEnumU[GtkRevealerTransitionType]:
  given _tag: Tag[GtkRevealerTransitionType] = Tag.UInt
  inline def define(inline a: Long): GtkRevealerTransitionType = a.toUInt
  val GTK_REVEALER_TRANSITION_TYPE_NONE = define(0)
  val GTK_REVEALER_TRANSITION_TYPE_CROSSFADE = define(1)
  val GTK_REVEALER_TRANSITION_TYPE_SLIDE_RIGHT = define(2)
  val GTK_REVEALER_TRANSITION_TYPE_SLIDE_LEFT = define(3)
  val GTK_REVEALER_TRANSITION_TYPE_SLIDE_UP = define(4)
  val GTK_REVEALER_TRANSITION_TYPE_SLIDE_DOWN = define(5)
  val GTK_REVEALER_TRANSITION_TYPE_SWING_RIGHT = define(6)
  val GTK_REVEALER_TRANSITION_TYPE_SWING_LEFT = define(7)
  val GTK_REVEALER_TRANSITION_TYPE_SWING_UP = define(8)
  val GTK_REVEALER_TRANSITION_TYPE_SWING_DOWN = define(9)
  inline def getName(inline value: GtkRevealerTransitionType): Option[String] =
    value match
      case GTK_REVEALER_TRANSITION_TYPE_NONE => Some("GTK_REVEALER_TRANSITION_TYPE_NONE")
      case GTK_REVEALER_TRANSITION_TYPE_CROSSFADE => Some("GTK_REVEALER_TRANSITION_TYPE_CROSSFADE")
      case GTK_REVEALER_TRANSITION_TYPE_SLIDE_RIGHT => Some("GTK_REVEALER_TRANSITION_TYPE_SLIDE_RIGHT")
      case GTK_REVEALER_TRANSITION_TYPE_SLIDE_LEFT => Some("GTK_REVEALER_TRANSITION_TYPE_SLIDE_LEFT")
      case GTK_REVEALER_TRANSITION_TYPE_SLIDE_UP => Some("GTK_REVEALER_TRANSITION_TYPE_SLIDE_UP")
      case GTK_REVEALER_TRANSITION_TYPE_SLIDE_DOWN => Some("GTK_REVEALER_TRANSITION_TYPE_SLIDE_DOWN")
      case GTK_REVEALER_TRANSITION_TYPE_SWING_RIGHT => Some("GTK_REVEALER_TRANSITION_TYPE_SWING_RIGHT")
      case GTK_REVEALER_TRANSITION_TYPE_SWING_LEFT => Some("GTK_REVEALER_TRANSITION_TYPE_SWING_LEFT")
      case GTK_REVEALER_TRANSITION_TYPE_SWING_UP => Some("GTK_REVEALER_TRANSITION_TYPE_SWING_UP")
      case GTK_REVEALER_TRANSITION_TYPE_SWING_DOWN => Some("GTK_REVEALER_TRANSITION_TYPE_SWING_DOWN")
      case _ => None
  extension (a: GtkRevealerTransitionType)
    inline def &(b: GtkRevealerTransitionType): GtkRevealerTransitionType = a & b
    inline def |(b: GtkRevealerTransitionType): GtkRevealerTransitionType = a | b
    inline def is(b: GtkRevealerTransitionType): Boolean = (a & b) == b

opaque type GtkScrollStep = CUnsignedInt
object GtkScrollStep extends CEnumU[GtkScrollStep]:
  given _tag: Tag[GtkScrollStep] = Tag.UInt
  inline def define(inline a: Long): GtkScrollStep = a.toUInt
  val GTK_SCROLL_STEPS = define(0)
  val GTK_SCROLL_PAGES = define(1)
  val GTK_SCROLL_ENDS = define(2)
  val GTK_SCROLL_HORIZONTAL_STEPS = define(3)
  val GTK_SCROLL_HORIZONTAL_PAGES = define(4)
  val GTK_SCROLL_HORIZONTAL_ENDS = define(5)
  inline def getName(inline value: GtkScrollStep): Option[String] =
    value match
      case GTK_SCROLL_STEPS => Some("GTK_SCROLL_STEPS")
      case GTK_SCROLL_PAGES => Some("GTK_SCROLL_PAGES")
      case GTK_SCROLL_ENDS => Some("GTK_SCROLL_ENDS")
      case GTK_SCROLL_HORIZONTAL_STEPS => Some("GTK_SCROLL_HORIZONTAL_STEPS")
      case GTK_SCROLL_HORIZONTAL_PAGES => Some("GTK_SCROLL_HORIZONTAL_PAGES")
      case GTK_SCROLL_HORIZONTAL_ENDS => Some("GTK_SCROLL_HORIZONTAL_ENDS")
      case _ => None
  extension (a: GtkScrollStep)
    inline def &(b: GtkScrollStep): GtkScrollStep = a & b
    inline def |(b: GtkScrollStep): GtkScrollStep = a | b
    inline def is(b: GtkScrollStep): Boolean = (a & b) == b

opaque type GtkScrollType = CUnsignedInt
object GtkScrollType extends CEnumU[GtkScrollType]:
  given _tag: Tag[GtkScrollType] = Tag.UInt
  inline def define(inline a: Long): GtkScrollType = a.toUInt
  val GTK_SCROLL_NONE = define(0)
  val GTK_SCROLL_JUMP = define(1)
  val GTK_SCROLL_STEP_BACKWARD = define(2)
  val GTK_SCROLL_STEP_FORWARD = define(3)
  val GTK_SCROLL_PAGE_BACKWARD = define(4)
  val GTK_SCROLL_PAGE_FORWARD = define(5)
  val GTK_SCROLL_STEP_UP = define(6)
  val GTK_SCROLL_STEP_DOWN = define(7)
  val GTK_SCROLL_PAGE_UP = define(8)
  val GTK_SCROLL_PAGE_DOWN = define(9)
  val GTK_SCROLL_STEP_LEFT = define(10)
  val GTK_SCROLL_STEP_RIGHT = define(11)
  val GTK_SCROLL_PAGE_LEFT = define(12)
  val GTK_SCROLL_PAGE_RIGHT = define(13)
  val GTK_SCROLL_START = define(14)
  val GTK_SCROLL_END = define(15)
  inline def getName(inline value: GtkScrollType): Option[String] =
    value match
      case GTK_SCROLL_NONE => Some("GTK_SCROLL_NONE")
      case GTK_SCROLL_JUMP => Some("GTK_SCROLL_JUMP")
      case GTK_SCROLL_STEP_BACKWARD => Some("GTK_SCROLL_STEP_BACKWARD")
      case GTK_SCROLL_STEP_FORWARD => Some("GTK_SCROLL_STEP_FORWARD")
      case GTK_SCROLL_PAGE_BACKWARD => Some("GTK_SCROLL_PAGE_BACKWARD")
      case GTK_SCROLL_PAGE_FORWARD => Some("GTK_SCROLL_PAGE_FORWARD")
      case GTK_SCROLL_STEP_UP => Some("GTK_SCROLL_STEP_UP")
      case GTK_SCROLL_STEP_DOWN => Some("GTK_SCROLL_STEP_DOWN")
      case GTK_SCROLL_PAGE_UP => Some("GTK_SCROLL_PAGE_UP")
      case GTK_SCROLL_PAGE_DOWN => Some("GTK_SCROLL_PAGE_DOWN")
      case GTK_SCROLL_STEP_LEFT => Some("GTK_SCROLL_STEP_LEFT")
      case GTK_SCROLL_STEP_RIGHT => Some("GTK_SCROLL_STEP_RIGHT")
      case GTK_SCROLL_PAGE_LEFT => Some("GTK_SCROLL_PAGE_LEFT")
      case GTK_SCROLL_PAGE_RIGHT => Some("GTK_SCROLL_PAGE_RIGHT")
      case GTK_SCROLL_START => Some("GTK_SCROLL_START")
      case GTK_SCROLL_END => Some("GTK_SCROLL_END")
      case _ => None
  extension (a: GtkScrollType)
    inline def &(b: GtkScrollType): GtkScrollType = a & b
    inline def |(b: GtkScrollType): GtkScrollType = a | b
    inline def is(b: GtkScrollType): Boolean = (a & b) == b

opaque type GtkScrollablePolicy = CUnsignedInt
object GtkScrollablePolicy extends CEnumU[GtkScrollablePolicy]:
  given _tag: Tag[GtkScrollablePolicy] = Tag.UInt
  inline def define(inline a: Long): GtkScrollablePolicy = a.toUInt
  val GTK_SCROLL_MINIMUM = define(0)
  val GTK_SCROLL_NATURAL = define(1)
  inline def getName(inline value: GtkScrollablePolicy): Option[String] =
    value match
      case GTK_SCROLL_MINIMUM => Some("GTK_SCROLL_MINIMUM")
      case GTK_SCROLL_NATURAL => Some("GTK_SCROLL_NATURAL")
      case _ => None
  extension (a: GtkScrollablePolicy)
    inline def &(b: GtkScrollablePolicy): GtkScrollablePolicy = a & b
    inline def |(b: GtkScrollablePolicy): GtkScrollablePolicy = a | b
    inline def is(b: GtkScrollablePolicy): Boolean = (a & b) == b

opaque type GtkSelectionMode = CUnsignedInt
object GtkSelectionMode extends CEnumU[GtkSelectionMode]:
  given _tag: Tag[GtkSelectionMode] = Tag.UInt
  inline def define(inline a: Long): GtkSelectionMode = a.toUInt
  val GTK_SELECTION_NONE = define(0)
  val GTK_SELECTION_SINGLE = define(1)
  val GTK_SELECTION_BROWSE = define(2)
  val GTK_SELECTION_MULTIPLE = define(3)
  inline def getName(inline value: GtkSelectionMode): Option[String] =
    value match
      case GTK_SELECTION_NONE => Some("GTK_SELECTION_NONE")
      case GTK_SELECTION_SINGLE => Some("GTK_SELECTION_SINGLE")
      case GTK_SELECTION_BROWSE => Some("GTK_SELECTION_BROWSE")
      case GTK_SELECTION_MULTIPLE => Some("GTK_SELECTION_MULTIPLE")
      case _ => None
  extension (a: GtkSelectionMode)
    inline def &(b: GtkSelectionMode): GtkSelectionMode = a & b
    inline def |(b: GtkSelectionMode): GtkSelectionMode = a | b
    inline def is(b: GtkSelectionMode): Boolean = (a & b) == b

opaque type GtkSensitivityType = CUnsignedInt
object GtkSensitivityType extends CEnumU[GtkSensitivityType]:
  given _tag: Tag[GtkSensitivityType] = Tag.UInt
  inline def define(inline a: Long): GtkSensitivityType = a.toUInt
  val GTK_SENSITIVITY_AUTO = define(0)
  val GTK_SENSITIVITY_ON = define(1)
  val GTK_SENSITIVITY_OFF = define(2)
  inline def getName(inline value: GtkSensitivityType): Option[String] =
    value match
      case GTK_SENSITIVITY_AUTO => Some("GTK_SENSITIVITY_AUTO")
      case GTK_SENSITIVITY_ON => Some("GTK_SENSITIVITY_ON")
      case GTK_SENSITIVITY_OFF => Some("GTK_SENSITIVITY_OFF")
      case _ => None
  extension (a: GtkSensitivityType)
    inline def &(b: GtkSensitivityType): GtkSensitivityType = a & b
    inline def |(b: GtkSensitivityType): GtkSensitivityType = a | b
    inline def is(b: GtkSensitivityType): Boolean = (a & b) == b

opaque type GtkShortcutActionFlags = CUnsignedInt
object GtkShortcutActionFlags extends CEnumU[GtkShortcutActionFlags]:
  given _tag: Tag[GtkShortcutActionFlags] = Tag.UInt
  inline def define(inline a: Long): GtkShortcutActionFlags = a.toUInt
  val GTK_SHORTCUT_ACTION_EXCLUSIVE = define(1)
  inline def getName(inline value: GtkShortcutActionFlags): Option[String] =
    value match
      case GTK_SHORTCUT_ACTION_EXCLUSIVE => Some("GTK_SHORTCUT_ACTION_EXCLUSIVE")
      case _ => None
  extension (a: GtkShortcutActionFlags)
    inline def &(b: GtkShortcutActionFlags): GtkShortcutActionFlags = a & b
    inline def |(b: GtkShortcutActionFlags): GtkShortcutActionFlags = a | b
    inline def is(b: GtkShortcutActionFlags): Boolean = (a & b) == b

opaque type GtkShortcutScope = CUnsignedInt
object GtkShortcutScope extends CEnumU[GtkShortcutScope]:
  given _tag: Tag[GtkShortcutScope] = Tag.UInt
  inline def define(inline a: Long): GtkShortcutScope = a.toUInt
  val GTK_SHORTCUT_SCOPE_LOCAL = define(0)
  val GTK_SHORTCUT_SCOPE_MANAGED = define(1)
  val GTK_SHORTCUT_SCOPE_GLOBAL = define(2)
  inline def getName(inline value: GtkShortcutScope): Option[String] =
    value match
      case GTK_SHORTCUT_SCOPE_LOCAL => Some("GTK_SHORTCUT_SCOPE_LOCAL")
      case GTK_SHORTCUT_SCOPE_MANAGED => Some("GTK_SHORTCUT_SCOPE_MANAGED")
      case GTK_SHORTCUT_SCOPE_GLOBAL => Some("GTK_SHORTCUT_SCOPE_GLOBAL")
      case _ => None
  extension (a: GtkShortcutScope)
    inline def &(b: GtkShortcutScope): GtkShortcutScope = a & b
    inline def |(b: GtkShortcutScope): GtkShortcutScope = a | b
    inline def is(b: GtkShortcutScope): Boolean = (a & b) == b

opaque type GtkShortcutType = CUnsignedInt
object GtkShortcutType extends CEnumU[GtkShortcutType]:
  given _tag: Tag[GtkShortcutType] = Tag.UInt
  inline def define(inline a: Long): GtkShortcutType = a.toUInt
  val GTK_SHORTCUT_ACCELERATOR = define(0)
  val GTK_SHORTCUT_GESTURE_PINCH = define(1)
  val GTK_SHORTCUT_GESTURE_STRETCH = define(2)
  val GTK_SHORTCUT_GESTURE_ROTATE_CLOCKWISE = define(3)
  val GTK_SHORTCUT_GESTURE_ROTATE_COUNTERCLOCKWISE = define(4)
  val GTK_SHORTCUT_GESTURE_TWO_FINGER_SWIPE_LEFT = define(5)
  val GTK_SHORTCUT_GESTURE_TWO_FINGER_SWIPE_RIGHT = define(6)
  val GTK_SHORTCUT_GESTURE = define(7)
  val GTK_SHORTCUT_GESTURE_SWIPE_LEFT = define(8)
  val GTK_SHORTCUT_GESTURE_SWIPE_RIGHT = define(9)
  inline def getName(inline value: GtkShortcutType): Option[String] =
    value match
      case GTK_SHORTCUT_ACCELERATOR => Some("GTK_SHORTCUT_ACCELERATOR")
      case GTK_SHORTCUT_GESTURE_PINCH => Some("GTK_SHORTCUT_GESTURE_PINCH")
      case GTK_SHORTCUT_GESTURE_STRETCH => Some("GTK_SHORTCUT_GESTURE_STRETCH")
      case GTK_SHORTCUT_GESTURE_ROTATE_CLOCKWISE => Some("GTK_SHORTCUT_GESTURE_ROTATE_CLOCKWISE")
      case GTK_SHORTCUT_GESTURE_ROTATE_COUNTERCLOCKWISE => Some("GTK_SHORTCUT_GESTURE_ROTATE_COUNTERCLOCKWISE")
      case GTK_SHORTCUT_GESTURE_TWO_FINGER_SWIPE_LEFT => Some("GTK_SHORTCUT_GESTURE_TWO_FINGER_SWIPE_LEFT")
      case GTK_SHORTCUT_GESTURE_TWO_FINGER_SWIPE_RIGHT => Some("GTK_SHORTCUT_GESTURE_TWO_FINGER_SWIPE_RIGHT")
      case GTK_SHORTCUT_GESTURE => Some("GTK_SHORTCUT_GESTURE")
      case GTK_SHORTCUT_GESTURE_SWIPE_LEFT => Some("GTK_SHORTCUT_GESTURE_SWIPE_LEFT")
      case GTK_SHORTCUT_GESTURE_SWIPE_RIGHT => Some("GTK_SHORTCUT_GESTURE_SWIPE_RIGHT")
      case _ => None
  extension (a: GtkShortcutType)
    inline def &(b: GtkShortcutType): GtkShortcutType = a & b
    inline def |(b: GtkShortcutType): GtkShortcutType = a | b
    inline def is(b: GtkShortcutType): Boolean = (a & b) == b

opaque type GtkSizeGroupMode = CUnsignedInt
object GtkSizeGroupMode extends CEnumU[GtkSizeGroupMode]:
  given _tag: Tag[GtkSizeGroupMode] = Tag.UInt
  inline def define(inline a: Long): GtkSizeGroupMode = a.toUInt
  val GTK_SIZE_GROUP_NONE = define(0)
  val GTK_SIZE_GROUP_HORIZONTAL = define(1)
  val GTK_SIZE_GROUP_VERTICAL = define(2)
  val GTK_SIZE_GROUP_BOTH = define(3)
  inline def getName(inline value: GtkSizeGroupMode): Option[String] =
    value match
      case GTK_SIZE_GROUP_NONE => Some("GTK_SIZE_GROUP_NONE")
      case GTK_SIZE_GROUP_HORIZONTAL => Some("GTK_SIZE_GROUP_HORIZONTAL")
      case GTK_SIZE_GROUP_VERTICAL => Some("GTK_SIZE_GROUP_VERTICAL")
      case GTK_SIZE_GROUP_BOTH => Some("GTK_SIZE_GROUP_BOTH")
      case _ => None
  extension (a: GtkSizeGroupMode)
    inline def &(b: GtkSizeGroupMode): GtkSizeGroupMode = a & b
    inline def |(b: GtkSizeGroupMode): GtkSizeGroupMode = a | b
    inline def is(b: GtkSizeGroupMode): Boolean = (a & b) == b

opaque type GtkSizeRequestMode = CUnsignedInt
object GtkSizeRequestMode extends CEnumU[GtkSizeRequestMode]:
  given _tag: Tag[GtkSizeRequestMode] = Tag.UInt
  inline def define(inline a: Long): GtkSizeRequestMode = a.toUInt
  val GTK_SIZE_REQUEST_HEIGHT_FOR_WIDTH = define(0)
  val GTK_SIZE_REQUEST_WIDTH_FOR_HEIGHT = define(1)
  val GTK_SIZE_REQUEST_CONSTANT_SIZE = define(2)
  inline def getName(inline value: GtkSizeRequestMode): Option[String] =
    value match
      case GTK_SIZE_REQUEST_HEIGHT_FOR_WIDTH => Some("GTK_SIZE_REQUEST_HEIGHT_FOR_WIDTH")
      case GTK_SIZE_REQUEST_WIDTH_FOR_HEIGHT => Some("GTK_SIZE_REQUEST_WIDTH_FOR_HEIGHT")
      case GTK_SIZE_REQUEST_CONSTANT_SIZE => Some("GTK_SIZE_REQUEST_CONSTANT_SIZE")
      case _ => None
  extension (a: GtkSizeRequestMode)
    inline def &(b: GtkSizeRequestMode): GtkSizeRequestMode = a & b
    inline def |(b: GtkSizeRequestMode): GtkSizeRequestMode = a | b
    inline def is(b: GtkSizeRequestMode): Boolean = (a & b) == b

opaque type GtkSortType = CUnsignedInt
object GtkSortType extends CEnumU[GtkSortType]:
  given _tag: Tag[GtkSortType] = Tag.UInt
  inline def define(inline a: Long): GtkSortType = a.toUInt
  val GTK_SORT_ASCENDING = define(0)
  val GTK_SORT_DESCENDING = define(1)
  inline def getName(inline value: GtkSortType): Option[String] =
    value match
      case GTK_SORT_ASCENDING => Some("GTK_SORT_ASCENDING")
      case GTK_SORT_DESCENDING => Some("GTK_SORT_DESCENDING")
      case _ => None
  extension (a: GtkSortType)
    inline def &(b: GtkSortType): GtkSortType = a & b
    inline def |(b: GtkSortType): GtkSortType = a | b
    inline def is(b: GtkSortType): Boolean = (a & b) == b

opaque type GtkSorterChange = CUnsignedInt
object GtkSorterChange extends CEnumU[GtkSorterChange]:
  given _tag: Tag[GtkSorterChange] = Tag.UInt
  inline def define(inline a: Long): GtkSorterChange = a.toUInt
  val GTK_SORTER_CHANGE_DIFFERENT = define(0)
  val GTK_SORTER_CHANGE_INVERTED = define(1)
  val GTK_SORTER_CHANGE_LESS_STRICT = define(2)
  val GTK_SORTER_CHANGE_MORE_STRICT = define(3)
  inline def getName(inline value: GtkSorterChange): Option[String] =
    value match
      case GTK_SORTER_CHANGE_DIFFERENT => Some("GTK_SORTER_CHANGE_DIFFERENT")
      case GTK_SORTER_CHANGE_INVERTED => Some("GTK_SORTER_CHANGE_INVERTED")
      case GTK_SORTER_CHANGE_LESS_STRICT => Some("GTK_SORTER_CHANGE_LESS_STRICT")
      case GTK_SORTER_CHANGE_MORE_STRICT => Some("GTK_SORTER_CHANGE_MORE_STRICT")
      case _ => None
  extension (a: GtkSorterChange)
    inline def &(b: GtkSorterChange): GtkSorterChange = a & b
    inline def |(b: GtkSorterChange): GtkSorterChange = a | b
    inline def is(b: GtkSorterChange): Boolean = (a & b) == b

opaque type GtkSorterOrder = CUnsignedInt
object GtkSorterOrder extends CEnumU[GtkSorterOrder]:
  given _tag: Tag[GtkSorterOrder] = Tag.UInt
  inline def define(inline a: Long): GtkSorterOrder = a.toUInt
  val GTK_SORTER_ORDER_PARTIAL = define(0)
  val GTK_SORTER_ORDER_NONE = define(1)
  val GTK_SORTER_ORDER_TOTAL = define(2)
  inline def getName(inline value: GtkSorterOrder): Option[String] =
    value match
      case GTK_SORTER_ORDER_PARTIAL => Some("GTK_SORTER_ORDER_PARTIAL")
      case GTK_SORTER_ORDER_NONE => Some("GTK_SORTER_ORDER_NONE")
      case GTK_SORTER_ORDER_TOTAL => Some("GTK_SORTER_ORDER_TOTAL")
      case _ => None
  extension (a: GtkSorterOrder)
    inline def &(b: GtkSorterOrder): GtkSorterOrder = a & b
    inline def |(b: GtkSorterOrder): GtkSorterOrder = a | b
    inline def is(b: GtkSorterOrder): Boolean = (a & b) == b

opaque type GtkSpinButtonUpdatePolicy = CUnsignedInt
object GtkSpinButtonUpdatePolicy extends CEnumU[GtkSpinButtonUpdatePolicy]:
  given _tag: Tag[GtkSpinButtonUpdatePolicy] = Tag.UInt
  inline def define(inline a: Long): GtkSpinButtonUpdatePolicy = a.toUInt
  val GTK_UPDATE_ALWAYS = define(0)
  val GTK_UPDATE_IF_VALID = define(1)
  inline def getName(inline value: GtkSpinButtonUpdatePolicy): Option[String] =
    value match
      case GTK_UPDATE_ALWAYS => Some("GTK_UPDATE_ALWAYS")
      case GTK_UPDATE_IF_VALID => Some("GTK_UPDATE_IF_VALID")
      case _ => None
  extension (a: GtkSpinButtonUpdatePolicy)
    inline def &(b: GtkSpinButtonUpdatePolicy): GtkSpinButtonUpdatePolicy = a & b
    inline def |(b: GtkSpinButtonUpdatePolicy): GtkSpinButtonUpdatePolicy = a | b
    inline def is(b: GtkSpinButtonUpdatePolicy): Boolean = (a & b) == b

opaque type GtkSpinType = CUnsignedInt
object GtkSpinType extends CEnumU[GtkSpinType]:
  given _tag: Tag[GtkSpinType] = Tag.UInt
  inline def define(inline a: Long): GtkSpinType = a.toUInt
  val GTK_SPIN_STEP_FORWARD = define(0)
  val GTK_SPIN_STEP_BACKWARD = define(1)
  val GTK_SPIN_PAGE_FORWARD = define(2)
  val GTK_SPIN_PAGE_BACKWARD = define(3)
  val GTK_SPIN_HOME = define(4)
  val GTK_SPIN_END = define(5)
  val GTK_SPIN_USER_DEFINED = define(6)
  inline def getName(inline value: GtkSpinType): Option[String] =
    value match
      case GTK_SPIN_STEP_FORWARD => Some("GTK_SPIN_STEP_FORWARD")
      case GTK_SPIN_STEP_BACKWARD => Some("GTK_SPIN_STEP_BACKWARD")
      case GTK_SPIN_PAGE_FORWARD => Some("GTK_SPIN_PAGE_FORWARD")
      case GTK_SPIN_PAGE_BACKWARD => Some("GTK_SPIN_PAGE_BACKWARD")
      case GTK_SPIN_HOME => Some("GTK_SPIN_HOME")
      case GTK_SPIN_END => Some("GTK_SPIN_END")
      case GTK_SPIN_USER_DEFINED => Some("GTK_SPIN_USER_DEFINED")
      case _ => None
  extension (a: GtkSpinType)
    inline def &(b: GtkSpinType): GtkSpinType = a & b
    inline def |(b: GtkSpinType): GtkSpinType = a | b
    inline def is(b: GtkSpinType): Boolean = (a & b) == b

opaque type GtkStackTransitionType = CUnsignedInt
object GtkStackTransitionType extends CEnumU[GtkStackTransitionType]:
  given _tag: Tag[GtkStackTransitionType] = Tag.UInt
  inline def define(inline a: Long): GtkStackTransitionType = a.toUInt
  val GTK_STACK_TRANSITION_TYPE_NONE = define(0)
  val GTK_STACK_TRANSITION_TYPE_CROSSFADE = define(1)
  val GTK_STACK_TRANSITION_TYPE_SLIDE_RIGHT = define(2)
  val GTK_STACK_TRANSITION_TYPE_SLIDE_LEFT = define(3)
  val GTK_STACK_TRANSITION_TYPE_SLIDE_UP = define(4)
  val GTK_STACK_TRANSITION_TYPE_SLIDE_DOWN = define(5)
  val GTK_STACK_TRANSITION_TYPE_SLIDE_LEFT_RIGHT = define(6)
  val GTK_STACK_TRANSITION_TYPE_SLIDE_UP_DOWN = define(7)
  val GTK_STACK_TRANSITION_TYPE_OVER_UP = define(8)
  val GTK_STACK_TRANSITION_TYPE_OVER_DOWN = define(9)
  val GTK_STACK_TRANSITION_TYPE_OVER_LEFT = define(10)
  val GTK_STACK_TRANSITION_TYPE_OVER_RIGHT = define(11)
  val GTK_STACK_TRANSITION_TYPE_UNDER_UP = define(12)
  val GTK_STACK_TRANSITION_TYPE_UNDER_DOWN = define(13)
  val GTK_STACK_TRANSITION_TYPE_UNDER_LEFT = define(14)
  val GTK_STACK_TRANSITION_TYPE_UNDER_RIGHT = define(15)
  val GTK_STACK_TRANSITION_TYPE_OVER_UP_DOWN = define(16)
  val GTK_STACK_TRANSITION_TYPE_OVER_DOWN_UP = define(17)
  val GTK_STACK_TRANSITION_TYPE_OVER_LEFT_RIGHT = define(18)
  val GTK_STACK_TRANSITION_TYPE_OVER_RIGHT_LEFT = define(19)
  val GTK_STACK_TRANSITION_TYPE_ROTATE_LEFT = define(20)
  val GTK_STACK_TRANSITION_TYPE_ROTATE_RIGHT = define(21)
  val GTK_STACK_TRANSITION_TYPE_ROTATE_LEFT_RIGHT = define(22)
  inline def getName(inline value: GtkStackTransitionType): Option[String] =
    value match
      case GTK_STACK_TRANSITION_TYPE_NONE => Some("GTK_STACK_TRANSITION_TYPE_NONE")
      case GTK_STACK_TRANSITION_TYPE_CROSSFADE => Some("GTK_STACK_TRANSITION_TYPE_CROSSFADE")
      case GTK_STACK_TRANSITION_TYPE_SLIDE_RIGHT => Some("GTK_STACK_TRANSITION_TYPE_SLIDE_RIGHT")
      case GTK_STACK_TRANSITION_TYPE_SLIDE_LEFT => Some("GTK_STACK_TRANSITION_TYPE_SLIDE_LEFT")
      case GTK_STACK_TRANSITION_TYPE_SLIDE_UP => Some("GTK_STACK_TRANSITION_TYPE_SLIDE_UP")
      case GTK_STACK_TRANSITION_TYPE_SLIDE_DOWN => Some("GTK_STACK_TRANSITION_TYPE_SLIDE_DOWN")
      case GTK_STACK_TRANSITION_TYPE_SLIDE_LEFT_RIGHT => Some("GTK_STACK_TRANSITION_TYPE_SLIDE_LEFT_RIGHT")
      case GTK_STACK_TRANSITION_TYPE_SLIDE_UP_DOWN => Some("GTK_STACK_TRANSITION_TYPE_SLIDE_UP_DOWN")
      case GTK_STACK_TRANSITION_TYPE_OVER_UP => Some("GTK_STACK_TRANSITION_TYPE_OVER_UP")
      case GTK_STACK_TRANSITION_TYPE_OVER_DOWN => Some("GTK_STACK_TRANSITION_TYPE_OVER_DOWN")
      case GTK_STACK_TRANSITION_TYPE_OVER_LEFT => Some("GTK_STACK_TRANSITION_TYPE_OVER_LEFT")
      case GTK_STACK_TRANSITION_TYPE_OVER_RIGHT => Some("GTK_STACK_TRANSITION_TYPE_OVER_RIGHT")
      case GTK_STACK_TRANSITION_TYPE_UNDER_UP => Some("GTK_STACK_TRANSITION_TYPE_UNDER_UP")
      case GTK_STACK_TRANSITION_TYPE_UNDER_DOWN => Some("GTK_STACK_TRANSITION_TYPE_UNDER_DOWN")
      case GTK_STACK_TRANSITION_TYPE_UNDER_LEFT => Some("GTK_STACK_TRANSITION_TYPE_UNDER_LEFT")
      case GTK_STACK_TRANSITION_TYPE_UNDER_RIGHT => Some("GTK_STACK_TRANSITION_TYPE_UNDER_RIGHT")
      case GTK_STACK_TRANSITION_TYPE_OVER_UP_DOWN => Some("GTK_STACK_TRANSITION_TYPE_OVER_UP_DOWN")
      case GTK_STACK_TRANSITION_TYPE_OVER_DOWN_UP => Some("GTK_STACK_TRANSITION_TYPE_OVER_DOWN_UP")
      case GTK_STACK_TRANSITION_TYPE_OVER_LEFT_RIGHT => Some("GTK_STACK_TRANSITION_TYPE_OVER_LEFT_RIGHT")
      case GTK_STACK_TRANSITION_TYPE_OVER_RIGHT_LEFT => Some("GTK_STACK_TRANSITION_TYPE_OVER_RIGHT_LEFT")
      case GTK_STACK_TRANSITION_TYPE_ROTATE_LEFT => Some("GTK_STACK_TRANSITION_TYPE_ROTATE_LEFT")
      case GTK_STACK_TRANSITION_TYPE_ROTATE_RIGHT => Some("GTK_STACK_TRANSITION_TYPE_ROTATE_RIGHT")
      case GTK_STACK_TRANSITION_TYPE_ROTATE_LEFT_RIGHT => Some("GTK_STACK_TRANSITION_TYPE_ROTATE_LEFT_RIGHT")
      case _ => None
  extension (a: GtkStackTransitionType)
    inline def &(b: GtkStackTransitionType): GtkStackTransitionType = a & b
    inline def |(b: GtkStackTransitionType): GtkStackTransitionType = a | b
    inline def is(b: GtkStackTransitionType): Boolean = (a & b) == b

opaque type GtkStateFlags = CUnsignedInt
object GtkStateFlags extends CEnumU[GtkStateFlags]:
  given _tag: Tag[GtkStateFlags] = Tag.UInt
  inline def define(inline a: Long): GtkStateFlags = a.toUInt
  val GTK_STATE_FLAG_NORMAL = define(0)
  val GTK_STATE_FLAG_ACTIVE = define(1)
  val GTK_STATE_FLAG_PRELIGHT = define(2)
  val GTK_STATE_FLAG_SELECTED = define(4)
  val GTK_STATE_FLAG_INSENSITIVE = define(8)
  val GTK_STATE_FLAG_INCONSISTENT = define(16)
  val GTK_STATE_FLAG_FOCUSED = define(32)
  val GTK_STATE_FLAG_BACKDROP = define(64)
  val GTK_STATE_FLAG_DIR_LTR = define(128)
  val GTK_STATE_FLAG_DIR_RTL = define(256)
  val GTK_STATE_FLAG_LINK = define(512)
  val GTK_STATE_FLAG_VISITED = define(1024)
  val GTK_STATE_FLAG_CHECKED = define(2048)
  val GTK_STATE_FLAG_DROP_ACTIVE = define(4096)
  val GTK_STATE_FLAG_FOCUS_VISIBLE = define(8192)
  val GTK_STATE_FLAG_FOCUS_WITHIN = define(16384)
  inline def getName(inline value: GtkStateFlags): Option[String] =
    value match
      case GTK_STATE_FLAG_NORMAL => Some("GTK_STATE_FLAG_NORMAL")
      case GTK_STATE_FLAG_ACTIVE => Some("GTK_STATE_FLAG_ACTIVE")
      case GTK_STATE_FLAG_PRELIGHT => Some("GTK_STATE_FLAG_PRELIGHT")
      case GTK_STATE_FLAG_SELECTED => Some("GTK_STATE_FLAG_SELECTED")
      case GTK_STATE_FLAG_INSENSITIVE => Some("GTK_STATE_FLAG_INSENSITIVE")
      case GTK_STATE_FLAG_INCONSISTENT => Some("GTK_STATE_FLAG_INCONSISTENT")
      case GTK_STATE_FLAG_FOCUSED => Some("GTK_STATE_FLAG_FOCUSED")
      case GTK_STATE_FLAG_BACKDROP => Some("GTK_STATE_FLAG_BACKDROP")
      case GTK_STATE_FLAG_DIR_LTR => Some("GTK_STATE_FLAG_DIR_LTR")
      case GTK_STATE_FLAG_DIR_RTL => Some("GTK_STATE_FLAG_DIR_RTL")
      case GTK_STATE_FLAG_LINK => Some("GTK_STATE_FLAG_LINK")
      case GTK_STATE_FLAG_VISITED => Some("GTK_STATE_FLAG_VISITED")
      case GTK_STATE_FLAG_CHECKED => Some("GTK_STATE_FLAG_CHECKED")
      case GTK_STATE_FLAG_DROP_ACTIVE => Some("GTK_STATE_FLAG_DROP_ACTIVE")
      case GTK_STATE_FLAG_FOCUS_VISIBLE => Some("GTK_STATE_FLAG_FOCUS_VISIBLE")
      case GTK_STATE_FLAG_FOCUS_WITHIN => Some("GTK_STATE_FLAG_FOCUS_WITHIN")
      case _ => None
  extension (a: GtkStateFlags)
    inline def &(b: GtkStateFlags): GtkStateFlags = a & b
    inline def |(b: GtkStateFlags): GtkStateFlags = a | b
    inline def is(b: GtkStateFlags): Boolean = (a & b) == b

opaque type GtkStringFilterMatchMode = CUnsignedInt
object GtkStringFilterMatchMode extends CEnumU[GtkStringFilterMatchMode]:
  given _tag: Tag[GtkStringFilterMatchMode] = Tag.UInt
  inline def define(inline a: Long): GtkStringFilterMatchMode = a.toUInt
  val GTK_STRING_FILTER_MATCH_MODE_EXACT = define(0)
  val GTK_STRING_FILTER_MATCH_MODE_SUBSTRING = define(1)
  val GTK_STRING_FILTER_MATCH_MODE_PREFIX = define(2)
  inline def getName(inline value: GtkStringFilterMatchMode): Option[String] =
    value match
      case GTK_STRING_FILTER_MATCH_MODE_EXACT => Some("GTK_STRING_FILTER_MATCH_MODE_EXACT")
      case GTK_STRING_FILTER_MATCH_MODE_SUBSTRING => Some("GTK_STRING_FILTER_MATCH_MODE_SUBSTRING")
      case GTK_STRING_FILTER_MATCH_MODE_PREFIX => Some("GTK_STRING_FILTER_MATCH_MODE_PREFIX")
      case _ => None
  extension (a: GtkStringFilterMatchMode)
    inline def &(b: GtkStringFilterMatchMode): GtkStringFilterMatchMode = a & b
    inline def |(b: GtkStringFilterMatchMode): GtkStringFilterMatchMode = a | b
    inline def is(b: GtkStringFilterMatchMode): Boolean = (a & b) == b

opaque type GtkStyleContextPrintFlags = CUnsignedInt
object GtkStyleContextPrintFlags extends CEnumU[GtkStyleContextPrintFlags]:
  given _tag: Tag[GtkStyleContextPrintFlags] = Tag.UInt
  inline def define(inline a: Long): GtkStyleContextPrintFlags = a.toUInt
  val GTK_STYLE_CONTEXT_PRINT_NONE = define(0)
  val GTK_STYLE_CONTEXT_PRINT_RECURSE = define(1)
  val GTK_STYLE_CONTEXT_PRINT_SHOW_STYLE = define(2)
  val GTK_STYLE_CONTEXT_PRINT_SHOW_CHANGE = define(4)
  inline def getName(inline value: GtkStyleContextPrintFlags): Option[String] =
    value match
      case GTK_STYLE_CONTEXT_PRINT_NONE => Some("GTK_STYLE_CONTEXT_PRINT_NONE")
      case GTK_STYLE_CONTEXT_PRINT_RECURSE => Some("GTK_STYLE_CONTEXT_PRINT_RECURSE")
      case GTK_STYLE_CONTEXT_PRINT_SHOW_STYLE => Some("GTK_STYLE_CONTEXT_PRINT_SHOW_STYLE")
      case GTK_STYLE_CONTEXT_PRINT_SHOW_CHANGE => Some("GTK_STYLE_CONTEXT_PRINT_SHOW_CHANGE")
      case _ => None
  extension (a: GtkStyleContextPrintFlags)
    inline def &(b: GtkStyleContextPrintFlags): GtkStyleContextPrintFlags = a & b
    inline def |(b: GtkStyleContextPrintFlags): GtkStyleContextPrintFlags = a | b
    inline def is(b: GtkStyleContextPrintFlags): Boolean = (a & b) == b

opaque type GtkSymbolicColor = CUnsignedInt
object GtkSymbolicColor extends CEnumU[GtkSymbolicColor]:
  given _tag: Tag[GtkSymbolicColor] = Tag.UInt
  inline def define(inline a: Long): GtkSymbolicColor = a.toUInt
  val GTK_SYMBOLIC_COLOR_FOREGROUND = define(0)
  val GTK_SYMBOLIC_COLOR_ERROR = define(1)
  val GTK_SYMBOLIC_COLOR_WARNING = define(2)
  val GTK_SYMBOLIC_COLOR_SUCCESS = define(3)
  inline def getName(inline value: GtkSymbolicColor): Option[String] =
    value match
      case GTK_SYMBOLIC_COLOR_FOREGROUND => Some("GTK_SYMBOLIC_COLOR_FOREGROUND")
      case GTK_SYMBOLIC_COLOR_ERROR => Some("GTK_SYMBOLIC_COLOR_ERROR")
      case GTK_SYMBOLIC_COLOR_WARNING => Some("GTK_SYMBOLIC_COLOR_WARNING")
      case GTK_SYMBOLIC_COLOR_SUCCESS => Some("GTK_SYMBOLIC_COLOR_SUCCESS")
      case _ => None
  extension (a: GtkSymbolicColor)
    inline def &(b: GtkSymbolicColor): GtkSymbolicColor = a & b
    inline def |(b: GtkSymbolicColor): GtkSymbolicColor = a | b
    inline def is(b: GtkSymbolicColor): Boolean = (a & b) == b

opaque type GtkSystemSetting = CUnsignedInt
object GtkSystemSetting extends CEnumU[GtkSystemSetting]:
  given _tag: Tag[GtkSystemSetting] = Tag.UInt
  inline def define(inline a: Long): GtkSystemSetting = a.toUInt
  val GTK_SYSTEM_SETTING_DPI = define(0)
  val GTK_SYSTEM_SETTING_FONT_NAME = define(1)
  val GTK_SYSTEM_SETTING_FONT_CONFIG = define(2)
  val GTK_SYSTEM_SETTING_DISPLAY = define(3)
  val GTK_SYSTEM_SETTING_ICON_THEME = define(4)
  inline def getName(inline value: GtkSystemSetting): Option[String] =
    value match
      case GTK_SYSTEM_SETTING_DPI => Some("GTK_SYSTEM_SETTING_DPI")
      case GTK_SYSTEM_SETTING_FONT_NAME => Some("GTK_SYSTEM_SETTING_FONT_NAME")
      case GTK_SYSTEM_SETTING_FONT_CONFIG => Some("GTK_SYSTEM_SETTING_FONT_CONFIG")
      case GTK_SYSTEM_SETTING_DISPLAY => Some("GTK_SYSTEM_SETTING_DISPLAY")
      case GTK_SYSTEM_SETTING_ICON_THEME => Some("GTK_SYSTEM_SETTING_ICON_THEME")
      case _ => None
  extension (a: GtkSystemSetting)
    inline def &(b: GtkSystemSetting): GtkSystemSetting = a & b
    inline def |(b: GtkSystemSetting): GtkSystemSetting = a | b
    inline def is(b: GtkSystemSetting): Boolean = (a & b) == b

opaque type GtkTextDirection = CUnsignedInt
object GtkTextDirection extends CEnumU[GtkTextDirection]:
  given _tag: Tag[GtkTextDirection] = Tag.UInt
  inline def define(inline a: Long): GtkTextDirection = a.toUInt
  val GTK_TEXT_DIR_NONE = define(0)
  val GTK_TEXT_DIR_LTR = define(1)
  val GTK_TEXT_DIR_RTL = define(2)
  inline def getName(inline value: GtkTextDirection): Option[String] =
    value match
      case GTK_TEXT_DIR_NONE => Some("GTK_TEXT_DIR_NONE")
      case GTK_TEXT_DIR_LTR => Some("GTK_TEXT_DIR_LTR")
      case GTK_TEXT_DIR_RTL => Some("GTK_TEXT_DIR_RTL")
      case _ => None
  extension (a: GtkTextDirection)
    inline def &(b: GtkTextDirection): GtkTextDirection = a & b
    inline def |(b: GtkTextDirection): GtkTextDirection = a | b
    inline def is(b: GtkTextDirection): Boolean = (a & b) == b

opaque type GtkTextExtendSelection = CUnsignedInt
object GtkTextExtendSelection extends CEnumU[GtkTextExtendSelection]:
  given _tag: Tag[GtkTextExtendSelection] = Tag.UInt
  inline def define(inline a: Long): GtkTextExtendSelection = a.toUInt
  val GTK_TEXT_EXTEND_SELECTION_WORD = define(0)
  val GTK_TEXT_EXTEND_SELECTION_LINE = define(1)
  inline def getName(inline value: GtkTextExtendSelection): Option[String] =
    value match
      case GTK_TEXT_EXTEND_SELECTION_WORD => Some("GTK_TEXT_EXTEND_SELECTION_WORD")
      case GTK_TEXT_EXTEND_SELECTION_LINE => Some("GTK_TEXT_EXTEND_SELECTION_LINE")
      case _ => None
  extension (a: GtkTextExtendSelection)
    inline def &(b: GtkTextExtendSelection): GtkTextExtendSelection = a & b
    inline def |(b: GtkTextExtendSelection): GtkTextExtendSelection = a | b
    inline def is(b: GtkTextExtendSelection): Boolean = (a & b) == b

opaque type GtkTextSearchFlags = CUnsignedInt
object GtkTextSearchFlags extends CEnumU[GtkTextSearchFlags]:
  given _tag: Tag[GtkTextSearchFlags] = Tag.UInt
  inline def define(inline a: Long): GtkTextSearchFlags = a.toUInt
  val GTK_TEXT_SEARCH_VISIBLE_ONLY = define(1)
  val GTK_TEXT_SEARCH_TEXT_ONLY = define(2)
  val GTK_TEXT_SEARCH_CASE_INSENSITIVE = define(4)
  inline def getName(inline value: GtkTextSearchFlags): Option[String] =
    value match
      case GTK_TEXT_SEARCH_VISIBLE_ONLY => Some("GTK_TEXT_SEARCH_VISIBLE_ONLY")
      case GTK_TEXT_SEARCH_TEXT_ONLY => Some("GTK_TEXT_SEARCH_TEXT_ONLY")
      case GTK_TEXT_SEARCH_CASE_INSENSITIVE => Some("GTK_TEXT_SEARCH_CASE_INSENSITIVE")
      case _ => None
  extension (a: GtkTextSearchFlags)
    inline def &(b: GtkTextSearchFlags): GtkTextSearchFlags = a & b
    inline def |(b: GtkTextSearchFlags): GtkTextSearchFlags = a | b
    inline def is(b: GtkTextSearchFlags): Boolean = (a & b) == b

opaque type GtkTextViewLayer = CUnsignedInt
object GtkTextViewLayer extends CEnumU[GtkTextViewLayer]:
  given _tag: Tag[GtkTextViewLayer] = Tag.UInt
  inline def define(inline a: Long): GtkTextViewLayer = a.toUInt
  val GTK_TEXT_VIEW_LAYER_BELOW_TEXT = define(0)
  val GTK_TEXT_VIEW_LAYER_ABOVE_TEXT = define(1)
  inline def getName(inline value: GtkTextViewLayer): Option[String] =
    value match
      case GTK_TEXT_VIEW_LAYER_BELOW_TEXT => Some("GTK_TEXT_VIEW_LAYER_BELOW_TEXT")
      case GTK_TEXT_VIEW_LAYER_ABOVE_TEXT => Some("GTK_TEXT_VIEW_LAYER_ABOVE_TEXT")
      case _ => None
  extension (a: GtkTextViewLayer)
    inline def &(b: GtkTextViewLayer): GtkTextViewLayer = a & b
    inline def |(b: GtkTextViewLayer): GtkTextViewLayer = a | b
    inline def is(b: GtkTextViewLayer): Boolean = (a & b) == b

opaque type GtkTextWindowType = CUnsignedInt
object GtkTextWindowType extends CEnumU[GtkTextWindowType]:
  given _tag: Tag[GtkTextWindowType] = Tag.UInt
  inline def define(inline a: Long): GtkTextWindowType = a.toUInt
  val GTK_TEXT_WINDOW_WIDGET = define(1)
  val GTK_TEXT_WINDOW_TEXT = define(2)
  val GTK_TEXT_WINDOW_LEFT = define(3)
  val GTK_TEXT_WINDOW_RIGHT = define(4)
  val GTK_TEXT_WINDOW_TOP = define(5)
  val GTK_TEXT_WINDOW_BOTTOM = define(6)
  inline def getName(inline value: GtkTextWindowType): Option[String] =
    value match
      case GTK_TEXT_WINDOW_WIDGET => Some("GTK_TEXT_WINDOW_WIDGET")
      case GTK_TEXT_WINDOW_TEXT => Some("GTK_TEXT_WINDOW_TEXT")
      case GTK_TEXT_WINDOW_LEFT => Some("GTK_TEXT_WINDOW_LEFT")
      case GTK_TEXT_WINDOW_RIGHT => Some("GTK_TEXT_WINDOW_RIGHT")
      case GTK_TEXT_WINDOW_TOP => Some("GTK_TEXT_WINDOW_TOP")
      case GTK_TEXT_WINDOW_BOTTOM => Some("GTK_TEXT_WINDOW_BOTTOM")
      case _ => None
  extension (a: GtkTextWindowType)
    inline def &(b: GtkTextWindowType): GtkTextWindowType = a & b
    inline def |(b: GtkTextWindowType): GtkTextWindowType = a | b
    inline def is(b: GtkTextWindowType): Boolean = (a & b) == b

opaque type GtkTreeModelFlags = CUnsignedInt
object GtkTreeModelFlags extends CEnumU[GtkTreeModelFlags]:
  given _tag: Tag[GtkTreeModelFlags] = Tag.UInt
  inline def define(inline a: Long): GtkTreeModelFlags = a.toUInt
  val GTK_TREE_MODEL_ITERS_PERSIST = define(1)
  val GTK_TREE_MODEL_LIST_ONLY = define(2)
  inline def getName(inline value: GtkTreeModelFlags): Option[String] =
    value match
      case GTK_TREE_MODEL_ITERS_PERSIST => Some("GTK_TREE_MODEL_ITERS_PERSIST")
      case GTK_TREE_MODEL_LIST_ONLY => Some("GTK_TREE_MODEL_LIST_ONLY")
      case _ => None
  extension (a: GtkTreeModelFlags)
    inline def &(b: GtkTreeModelFlags): GtkTreeModelFlags = a & b
    inline def |(b: GtkTreeModelFlags): GtkTreeModelFlags = a | b
    inline def is(b: GtkTreeModelFlags): Boolean = (a & b) == b

opaque type GtkTreeViewColumnSizing = CUnsignedInt
object GtkTreeViewColumnSizing extends CEnumU[GtkTreeViewColumnSizing]:
  given _tag: Tag[GtkTreeViewColumnSizing] = Tag.UInt
  inline def define(inline a: Long): GtkTreeViewColumnSizing = a.toUInt
  val GTK_TREE_VIEW_COLUMN_GROW_ONLY = define(0)
  val GTK_TREE_VIEW_COLUMN_AUTOSIZE = define(1)
  val GTK_TREE_VIEW_COLUMN_FIXED = define(2)
  inline def getName(inline value: GtkTreeViewColumnSizing): Option[String] =
    value match
      case GTK_TREE_VIEW_COLUMN_GROW_ONLY => Some("GTK_TREE_VIEW_COLUMN_GROW_ONLY")
      case GTK_TREE_VIEW_COLUMN_AUTOSIZE => Some("GTK_TREE_VIEW_COLUMN_AUTOSIZE")
      case GTK_TREE_VIEW_COLUMN_FIXED => Some("GTK_TREE_VIEW_COLUMN_FIXED")
      case _ => None
  extension (a: GtkTreeViewColumnSizing)
    inline def &(b: GtkTreeViewColumnSizing): GtkTreeViewColumnSizing = a & b
    inline def |(b: GtkTreeViewColumnSizing): GtkTreeViewColumnSizing = a | b
    inline def is(b: GtkTreeViewColumnSizing): Boolean = (a & b) == b

opaque type GtkTreeViewDropPosition = CUnsignedInt
object GtkTreeViewDropPosition extends CEnumU[GtkTreeViewDropPosition]:
  given _tag: Tag[GtkTreeViewDropPosition] = Tag.UInt
  inline def define(inline a: Long): GtkTreeViewDropPosition = a.toUInt
  val GTK_TREE_VIEW_DROP_BEFORE = define(0)
  val GTK_TREE_VIEW_DROP_AFTER = define(1)
  val GTK_TREE_VIEW_DROP_INTO_OR_BEFORE = define(2)
  val GTK_TREE_VIEW_DROP_INTO_OR_AFTER = define(3)
  inline def getName(inline value: GtkTreeViewDropPosition): Option[String] =
    value match
      case GTK_TREE_VIEW_DROP_BEFORE => Some("GTK_TREE_VIEW_DROP_BEFORE")
      case GTK_TREE_VIEW_DROP_AFTER => Some("GTK_TREE_VIEW_DROP_AFTER")
      case GTK_TREE_VIEW_DROP_INTO_OR_BEFORE => Some("GTK_TREE_VIEW_DROP_INTO_OR_BEFORE")
      case GTK_TREE_VIEW_DROP_INTO_OR_AFTER => Some("GTK_TREE_VIEW_DROP_INTO_OR_AFTER")
      case _ => None
  extension (a: GtkTreeViewDropPosition)
    inline def &(b: GtkTreeViewDropPosition): GtkTreeViewDropPosition = a & b
    inline def |(b: GtkTreeViewDropPosition): GtkTreeViewDropPosition = a | b
    inline def is(b: GtkTreeViewDropPosition): Boolean = (a & b) == b

opaque type GtkTreeViewGridLines = CUnsignedInt
object GtkTreeViewGridLines extends CEnumU[GtkTreeViewGridLines]:
  given _tag: Tag[GtkTreeViewGridLines] = Tag.UInt
  inline def define(inline a: Long): GtkTreeViewGridLines = a.toUInt
  val GTK_TREE_VIEW_GRID_LINES_NONE = define(0)
  val GTK_TREE_VIEW_GRID_LINES_HORIZONTAL = define(1)
  val GTK_TREE_VIEW_GRID_LINES_VERTICAL = define(2)
  val GTK_TREE_VIEW_GRID_LINES_BOTH = define(3)
  inline def getName(inline value: GtkTreeViewGridLines): Option[String] =
    value match
      case GTK_TREE_VIEW_GRID_LINES_NONE => Some("GTK_TREE_VIEW_GRID_LINES_NONE")
      case GTK_TREE_VIEW_GRID_LINES_HORIZONTAL => Some("GTK_TREE_VIEW_GRID_LINES_HORIZONTAL")
      case GTK_TREE_VIEW_GRID_LINES_VERTICAL => Some("GTK_TREE_VIEW_GRID_LINES_VERTICAL")
      case GTK_TREE_VIEW_GRID_LINES_BOTH => Some("GTK_TREE_VIEW_GRID_LINES_BOTH")
      case _ => None
  extension (a: GtkTreeViewGridLines)
    inline def &(b: GtkTreeViewGridLines): GtkTreeViewGridLines = a & b
    inline def |(b: GtkTreeViewGridLines): GtkTreeViewGridLines = a | b
    inline def is(b: GtkTreeViewGridLines): Boolean = (a & b) == b

opaque type GtkUnit = CUnsignedInt
object GtkUnit extends CEnumU[GtkUnit]:
  given _tag: Tag[GtkUnit] = Tag.UInt
  inline def define(inline a: Long): GtkUnit = a.toUInt
  val GTK_UNIT_NONE = define(0)
  val GTK_UNIT_POINTS = define(1)
  val GTK_UNIT_INCH = define(2)
  val GTK_UNIT_MM = define(3)
  inline def getName(inline value: GtkUnit): Option[String] =
    value match
      case GTK_UNIT_NONE => Some("GTK_UNIT_NONE")
      case GTK_UNIT_POINTS => Some("GTK_UNIT_POINTS")
      case GTK_UNIT_INCH => Some("GTK_UNIT_INCH")
      case GTK_UNIT_MM => Some("GTK_UNIT_MM")
      case _ => None
  extension (a: GtkUnit)
    inline def &(b: GtkUnit): GtkUnit = a & b
    inline def |(b: GtkUnit): GtkUnit = a | b
    inline def is(b: GtkUnit): Boolean = (a & b) == b

opaque type GtkWrapMode = CUnsignedInt
object GtkWrapMode extends CEnumU[GtkWrapMode]:
  given _tag: Tag[GtkWrapMode] = Tag.UInt
  inline def define(inline a: Long): GtkWrapMode = a.toUInt
  val GTK_WRAP_NONE = define(0)
  val GTK_WRAP_CHAR = define(1)
  val GTK_WRAP_WORD = define(2)
  val GTK_WRAP_WORD_CHAR = define(3)
  inline def getName(inline value: GtkWrapMode): Option[String] =
    value match
      case GTK_WRAP_NONE => Some("GTK_WRAP_NONE")
      case GTK_WRAP_CHAR => Some("GTK_WRAP_CHAR")
      case GTK_WRAP_WORD => Some("GTK_WRAP_WORD")
      case GTK_WRAP_WORD_CHAR => Some("GTK_WRAP_WORD_CHAR")
      case _ => None
  extension (a: GtkWrapMode)
    inline def &(b: GtkWrapMode): GtkWrapMode = a & b
    inline def |(b: GtkWrapMode): GtkWrapMode = a | b
    inline def is(b: GtkWrapMode): Boolean = (a & b) == b

opaque type PangoAlignment = CUnsignedInt
object PangoAlignment extends CEnumU[PangoAlignment]:
  given _tag: Tag[PangoAlignment] = Tag.UInt
  inline def define(inline a: Long): PangoAlignment = a.toUInt
  val PANGO_ALIGN_LEFT = define(0)
  val PANGO_ALIGN_CENTER = define(1)
  val PANGO_ALIGN_RIGHT = define(2)
  inline def getName(inline value: PangoAlignment): Option[String] =
    value match
      case PANGO_ALIGN_LEFT => Some("PANGO_ALIGN_LEFT")
      case PANGO_ALIGN_CENTER => Some("PANGO_ALIGN_CENTER")
      case PANGO_ALIGN_RIGHT => Some("PANGO_ALIGN_RIGHT")
      case _ => None
  extension (a: PangoAlignment)
    inline def &(b: PangoAlignment): PangoAlignment = a & b
    inline def |(b: PangoAlignment): PangoAlignment = a | b
    inline def is(b: PangoAlignment): Boolean = (a & b) == b

opaque type PangoAttrType = CUnsignedInt
object PangoAttrType extends CEnumU[PangoAttrType]:
  given _tag: Tag[PangoAttrType] = Tag.UInt
  inline def define(inline a: Long): PangoAttrType = a.toUInt
  val PANGO_ATTR_INVALID = define(0)
  val PANGO_ATTR_LANGUAGE = define(1)
  val PANGO_ATTR_FAMILY = define(2)
  val PANGO_ATTR_STYLE = define(3)
  val PANGO_ATTR_WEIGHT = define(4)
  val PANGO_ATTR_VARIANT = define(5)
  val PANGO_ATTR_STRETCH = define(6)
  val PANGO_ATTR_SIZE = define(7)
  val PANGO_ATTR_FONT_DESC = define(8)
  val PANGO_ATTR_FOREGROUND = define(9)
  val PANGO_ATTR_BACKGROUND = define(10)
  val PANGO_ATTR_UNDERLINE = define(11)
  val PANGO_ATTR_STRIKETHROUGH = define(12)
  val PANGO_ATTR_RISE = define(13)
  val PANGO_ATTR_SHAPE = define(14)
  val PANGO_ATTR_SCALE = define(15)
  val PANGO_ATTR_FALLBACK = define(16)
  val PANGO_ATTR_LETTER_SPACING = define(17)
  val PANGO_ATTR_UNDERLINE_COLOR = define(18)
  val PANGO_ATTR_STRIKETHROUGH_COLOR = define(19)
  val PANGO_ATTR_ABSOLUTE_SIZE = define(20)
  val PANGO_ATTR_GRAVITY = define(21)
  val PANGO_ATTR_GRAVITY_HINT = define(22)
  val PANGO_ATTR_FONT_FEATURES = define(23)
  val PANGO_ATTR_FOREGROUND_ALPHA = define(24)
  val PANGO_ATTR_BACKGROUND_ALPHA = define(25)
  val PANGO_ATTR_ALLOW_BREAKS = define(26)
  val PANGO_ATTR_SHOW = define(27)
  val PANGO_ATTR_INSERT_HYPHENS = define(28)
  val PANGO_ATTR_OVERLINE = define(29)
  val PANGO_ATTR_OVERLINE_COLOR = define(30)
  val PANGO_ATTR_LINE_HEIGHT = define(31)
  val PANGO_ATTR_ABSOLUTE_LINE_HEIGHT = define(32)
  val PANGO_ATTR_TEXT_TRANSFORM = define(33)
  val PANGO_ATTR_WORD = define(34)
  val PANGO_ATTR_SENTENCE = define(35)
  val PANGO_ATTR_BASELINE_SHIFT = define(36)
  val PANGO_ATTR_FONT_SCALE = define(37)
  inline def getName(inline value: PangoAttrType): Option[String] =
    value match
      case PANGO_ATTR_INVALID => Some("PANGO_ATTR_INVALID")
      case PANGO_ATTR_LANGUAGE => Some("PANGO_ATTR_LANGUAGE")
      case PANGO_ATTR_FAMILY => Some("PANGO_ATTR_FAMILY")
      case PANGO_ATTR_STYLE => Some("PANGO_ATTR_STYLE")
      case PANGO_ATTR_WEIGHT => Some("PANGO_ATTR_WEIGHT")
      case PANGO_ATTR_VARIANT => Some("PANGO_ATTR_VARIANT")
      case PANGO_ATTR_STRETCH => Some("PANGO_ATTR_STRETCH")
      case PANGO_ATTR_SIZE => Some("PANGO_ATTR_SIZE")
      case PANGO_ATTR_FONT_DESC => Some("PANGO_ATTR_FONT_DESC")
      case PANGO_ATTR_FOREGROUND => Some("PANGO_ATTR_FOREGROUND")
      case PANGO_ATTR_BACKGROUND => Some("PANGO_ATTR_BACKGROUND")
      case PANGO_ATTR_UNDERLINE => Some("PANGO_ATTR_UNDERLINE")
      case PANGO_ATTR_STRIKETHROUGH => Some("PANGO_ATTR_STRIKETHROUGH")
      case PANGO_ATTR_RISE => Some("PANGO_ATTR_RISE")
      case PANGO_ATTR_SHAPE => Some("PANGO_ATTR_SHAPE")
      case PANGO_ATTR_SCALE => Some("PANGO_ATTR_SCALE")
      case PANGO_ATTR_FALLBACK => Some("PANGO_ATTR_FALLBACK")
      case PANGO_ATTR_LETTER_SPACING => Some("PANGO_ATTR_LETTER_SPACING")
      case PANGO_ATTR_UNDERLINE_COLOR => Some("PANGO_ATTR_UNDERLINE_COLOR")
      case PANGO_ATTR_STRIKETHROUGH_COLOR => Some("PANGO_ATTR_STRIKETHROUGH_COLOR")
      case PANGO_ATTR_ABSOLUTE_SIZE => Some("PANGO_ATTR_ABSOLUTE_SIZE")
      case PANGO_ATTR_GRAVITY => Some("PANGO_ATTR_GRAVITY")
      case PANGO_ATTR_GRAVITY_HINT => Some("PANGO_ATTR_GRAVITY_HINT")
      case PANGO_ATTR_FONT_FEATURES => Some("PANGO_ATTR_FONT_FEATURES")
      case PANGO_ATTR_FOREGROUND_ALPHA => Some("PANGO_ATTR_FOREGROUND_ALPHA")
      case PANGO_ATTR_BACKGROUND_ALPHA => Some("PANGO_ATTR_BACKGROUND_ALPHA")
      case PANGO_ATTR_ALLOW_BREAKS => Some("PANGO_ATTR_ALLOW_BREAKS")
      case PANGO_ATTR_SHOW => Some("PANGO_ATTR_SHOW")
      case PANGO_ATTR_INSERT_HYPHENS => Some("PANGO_ATTR_INSERT_HYPHENS")
      case PANGO_ATTR_OVERLINE => Some("PANGO_ATTR_OVERLINE")
      case PANGO_ATTR_OVERLINE_COLOR => Some("PANGO_ATTR_OVERLINE_COLOR")
      case PANGO_ATTR_LINE_HEIGHT => Some("PANGO_ATTR_LINE_HEIGHT")
      case PANGO_ATTR_ABSOLUTE_LINE_HEIGHT => Some("PANGO_ATTR_ABSOLUTE_LINE_HEIGHT")
      case PANGO_ATTR_TEXT_TRANSFORM => Some("PANGO_ATTR_TEXT_TRANSFORM")
      case PANGO_ATTR_WORD => Some("PANGO_ATTR_WORD")
      case PANGO_ATTR_SENTENCE => Some("PANGO_ATTR_SENTENCE")
      case PANGO_ATTR_BASELINE_SHIFT => Some("PANGO_ATTR_BASELINE_SHIFT")
      case PANGO_ATTR_FONT_SCALE => Some("PANGO_ATTR_FONT_SCALE")
      case _ => None
  extension (a: PangoAttrType)
    inline def &(b: PangoAttrType): PangoAttrType = a & b
    inline def |(b: PangoAttrType): PangoAttrType = a | b
    inline def is(b: PangoAttrType): Boolean = (a & b) == b

opaque type PangoBaselineShift = CUnsignedInt
object PangoBaselineShift extends CEnumU[PangoBaselineShift]:
  given _tag: Tag[PangoBaselineShift] = Tag.UInt
  inline def define(inline a: Long): PangoBaselineShift = a.toUInt
  val PANGO_BASELINE_SHIFT_NONE = define(0)
  val PANGO_BASELINE_SHIFT_SUPERSCRIPT = define(1)
  val PANGO_BASELINE_SHIFT_SUBSCRIPT = define(2)
  inline def getName(inline value: PangoBaselineShift): Option[String] =
    value match
      case PANGO_BASELINE_SHIFT_NONE => Some("PANGO_BASELINE_SHIFT_NONE")
      case PANGO_BASELINE_SHIFT_SUPERSCRIPT => Some("PANGO_BASELINE_SHIFT_SUPERSCRIPT")
      case PANGO_BASELINE_SHIFT_SUBSCRIPT => Some("PANGO_BASELINE_SHIFT_SUBSCRIPT")
      case _ => None
  extension (a: PangoBaselineShift)
    inline def &(b: PangoBaselineShift): PangoBaselineShift = a & b
    inline def |(b: PangoBaselineShift): PangoBaselineShift = a | b
    inline def is(b: PangoBaselineShift): Boolean = (a & b) == b

opaque type PangoBidiType = CUnsignedInt
object PangoBidiType extends CEnumU[PangoBidiType]:
  given _tag: Tag[PangoBidiType] = Tag.UInt
  inline def define(inline a: Long): PangoBidiType = a.toUInt
  val PANGO_BIDI_TYPE_L = define(0)
  val PANGO_BIDI_TYPE_LRE = define(1)
  val PANGO_BIDI_TYPE_LRO = define(2)
  val PANGO_BIDI_TYPE_R = define(3)
  val PANGO_BIDI_TYPE_AL = define(4)
  val PANGO_BIDI_TYPE_RLE = define(5)
  val PANGO_BIDI_TYPE_RLO = define(6)
  val PANGO_BIDI_TYPE_PDF = define(7)
  val PANGO_BIDI_TYPE_EN = define(8)
  val PANGO_BIDI_TYPE_ES = define(9)
  val PANGO_BIDI_TYPE_ET = define(10)
  val PANGO_BIDI_TYPE_AN = define(11)
  val PANGO_BIDI_TYPE_CS = define(12)
  val PANGO_BIDI_TYPE_NSM = define(13)
  val PANGO_BIDI_TYPE_BN = define(14)
  val PANGO_BIDI_TYPE_B = define(15)
  val PANGO_BIDI_TYPE_S = define(16)
  val PANGO_BIDI_TYPE_WS = define(17)
  val PANGO_BIDI_TYPE_ON = define(18)
  val PANGO_BIDI_TYPE_LRI = define(19)
  val PANGO_BIDI_TYPE_RLI = define(20)
  val PANGO_BIDI_TYPE_FSI = define(21)
  val PANGO_BIDI_TYPE_PDI = define(22)
  inline def getName(inline value: PangoBidiType): Option[String] =
    value match
      case PANGO_BIDI_TYPE_L => Some("PANGO_BIDI_TYPE_L")
      case PANGO_BIDI_TYPE_LRE => Some("PANGO_BIDI_TYPE_LRE")
      case PANGO_BIDI_TYPE_LRO => Some("PANGO_BIDI_TYPE_LRO")
      case PANGO_BIDI_TYPE_R => Some("PANGO_BIDI_TYPE_R")
      case PANGO_BIDI_TYPE_AL => Some("PANGO_BIDI_TYPE_AL")
      case PANGO_BIDI_TYPE_RLE => Some("PANGO_BIDI_TYPE_RLE")
      case PANGO_BIDI_TYPE_RLO => Some("PANGO_BIDI_TYPE_RLO")
      case PANGO_BIDI_TYPE_PDF => Some("PANGO_BIDI_TYPE_PDF")
      case PANGO_BIDI_TYPE_EN => Some("PANGO_BIDI_TYPE_EN")
      case PANGO_BIDI_TYPE_ES => Some("PANGO_BIDI_TYPE_ES")
      case PANGO_BIDI_TYPE_ET => Some("PANGO_BIDI_TYPE_ET")
      case PANGO_BIDI_TYPE_AN => Some("PANGO_BIDI_TYPE_AN")
      case PANGO_BIDI_TYPE_CS => Some("PANGO_BIDI_TYPE_CS")
      case PANGO_BIDI_TYPE_NSM => Some("PANGO_BIDI_TYPE_NSM")
      case PANGO_BIDI_TYPE_BN => Some("PANGO_BIDI_TYPE_BN")
      case PANGO_BIDI_TYPE_B => Some("PANGO_BIDI_TYPE_B")
      case PANGO_BIDI_TYPE_S => Some("PANGO_BIDI_TYPE_S")
      case PANGO_BIDI_TYPE_WS => Some("PANGO_BIDI_TYPE_WS")
      case PANGO_BIDI_TYPE_ON => Some("PANGO_BIDI_TYPE_ON")
      case PANGO_BIDI_TYPE_LRI => Some("PANGO_BIDI_TYPE_LRI")
      case PANGO_BIDI_TYPE_RLI => Some("PANGO_BIDI_TYPE_RLI")
      case PANGO_BIDI_TYPE_FSI => Some("PANGO_BIDI_TYPE_FSI")
      case PANGO_BIDI_TYPE_PDI => Some("PANGO_BIDI_TYPE_PDI")
      case _ => None
  extension (a: PangoBidiType)
    inline def &(b: PangoBidiType): PangoBidiType = a & b
    inline def |(b: PangoBidiType): PangoBidiType = a | b
    inline def is(b: PangoBidiType): Boolean = (a & b) == b

opaque type PangoCoverageLevel = CUnsignedInt
object PangoCoverageLevel extends CEnumU[PangoCoverageLevel]:
  given _tag: Tag[PangoCoverageLevel] = Tag.UInt
  inline def define(inline a: Long): PangoCoverageLevel = a.toUInt
  val PANGO_COVERAGE_NONE = define(0)
  val PANGO_COVERAGE_FALLBACK = define(1)
  val PANGO_COVERAGE_APPROXIMATE = define(2)
  val PANGO_COVERAGE_EXACT = define(3)
  inline def getName(inline value: PangoCoverageLevel): Option[String] =
    value match
      case PANGO_COVERAGE_NONE => Some("PANGO_COVERAGE_NONE")
      case PANGO_COVERAGE_FALLBACK => Some("PANGO_COVERAGE_FALLBACK")
      case PANGO_COVERAGE_APPROXIMATE => Some("PANGO_COVERAGE_APPROXIMATE")
      case PANGO_COVERAGE_EXACT => Some("PANGO_COVERAGE_EXACT")
      case _ => None
  extension (a: PangoCoverageLevel)
    inline def &(b: PangoCoverageLevel): PangoCoverageLevel = a & b
    inline def |(b: PangoCoverageLevel): PangoCoverageLevel = a | b
    inline def is(b: PangoCoverageLevel): Boolean = (a & b) == b

opaque type PangoDirection = CUnsignedInt
object PangoDirection extends CEnumU[PangoDirection]:
  given _tag: Tag[PangoDirection] = Tag.UInt
  inline def define(inline a: Long): PangoDirection = a.toUInt
  val PANGO_DIRECTION_LTR = define(0)
  val PANGO_DIRECTION_RTL = define(1)
  val PANGO_DIRECTION_TTB_LTR = define(2)
  val PANGO_DIRECTION_TTB_RTL = define(3)
  val PANGO_DIRECTION_WEAK_LTR = define(4)
  val PANGO_DIRECTION_WEAK_RTL = define(5)
  val PANGO_DIRECTION_NEUTRAL = define(6)
  inline def getName(inline value: PangoDirection): Option[String] =
    value match
      case PANGO_DIRECTION_LTR => Some("PANGO_DIRECTION_LTR")
      case PANGO_DIRECTION_RTL => Some("PANGO_DIRECTION_RTL")
      case PANGO_DIRECTION_TTB_LTR => Some("PANGO_DIRECTION_TTB_LTR")
      case PANGO_DIRECTION_TTB_RTL => Some("PANGO_DIRECTION_TTB_RTL")
      case PANGO_DIRECTION_WEAK_LTR => Some("PANGO_DIRECTION_WEAK_LTR")
      case PANGO_DIRECTION_WEAK_RTL => Some("PANGO_DIRECTION_WEAK_RTL")
      case PANGO_DIRECTION_NEUTRAL => Some("PANGO_DIRECTION_NEUTRAL")
      case _ => None
  extension (a: PangoDirection)
    inline def &(b: PangoDirection): PangoDirection = a & b
    inline def |(b: PangoDirection): PangoDirection = a | b
    inline def is(b: PangoDirection): Boolean = (a & b) == b

opaque type PangoEllipsizeMode = CUnsignedInt
object PangoEllipsizeMode extends CEnumU[PangoEllipsizeMode]:
  given _tag: Tag[PangoEllipsizeMode] = Tag.UInt
  inline def define(inline a: Long): PangoEllipsizeMode = a.toUInt
  val PANGO_ELLIPSIZE_NONE = define(0)
  val PANGO_ELLIPSIZE_START = define(1)
  val PANGO_ELLIPSIZE_MIDDLE = define(2)
  val PANGO_ELLIPSIZE_END = define(3)
  inline def getName(inline value: PangoEllipsizeMode): Option[String] =
    value match
      case PANGO_ELLIPSIZE_NONE => Some("PANGO_ELLIPSIZE_NONE")
      case PANGO_ELLIPSIZE_START => Some("PANGO_ELLIPSIZE_START")
      case PANGO_ELLIPSIZE_MIDDLE => Some("PANGO_ELLIPSIZE_MIDDLE")
      case PANGO_ELLIPSIZE_END => Some("PANGO_ELLIPSIZE_END")
      case _ => None
  extension (a: PangoEllipsizeMode)
    inline def &(b: PangoEllipsizeMode): PangoEllipsizeMode = a & b
    inline def |(b: PangoEllipsizeMode): PangoEllipsizeMode = a | b
    inline def is(b: PangoEllipsizeMode): Boolean = (a & b) == b

opaque type PangoFontMask = CUnsignedInt
object PangoFontMask extends CEnumU[PangoFontMask]:
  given _tag: Tag[PangoFontMask] = Tag.UInt
  inline def define(inline a: Long): PangoFontMask = a.toUInt
  val PANGO_FONT_MASK_FAMILY = define(1)
  val PANGO_FONT_MASK_STYLE = define(2)
  val PANGO_FONT_MASK_VARIANT = define(4)
  val PANGO_FONT_MASK_WEIGHT = define(8)
  val PANGO_FONT_MASK_STRETCH = define(16)
  val PANGO_FONT_MASK_SIZE = define(32)
  val PANGO_FONT_MASK_GRAVITY = define(64)
  val PANGO_FONT_MASK_VARIATIONS = define(128)
  inline def getName(inline value: PangoFontMask): Option[String] =
    value match
      case PANGO_FONT_MASK_FAMILY => Some("PANGO_FONT_MASK_FAMILY")
      case PANGO_FONT_MASK_STYLE => Some("PANGO_FONT_MASK_STYLE")
      case PANGO_FONT_MASK_VARIANT => Some("PANGO_FONT_MASK_VARIANT")
      case PANGO_FONT_MASK_WEIGHT => Some("PANGO_FONT_MASK_WEIGHT")
      case PANGO_FONT_MASK_STRETCH => Some("PANGO_FONT_MASK_STRETCH")
      case PANGO_FONT_MASK_SIZE => Some("PANGO_FONT_MASK_SIZE")
      case PANGO_FONT_MASK_GRAVITY => Some("PANGO_FONT_MASK_GRAVITY")
      case PANGO_FONT_MASK_VARIATIONS => Some("PANGO_FONT_MASK_VARIATIONS")
      case _ => None
  extension (a: PangoFontMask)
    inline def &(b: PangoFontMask): PangoFontMask = a & b
    inline def |(b: PangoFontMask): PangoFontMask = a | b
    inline def is(b: PangoFontMask): Boolean = (a & b) == b

opaque type PangoFontScale = CUnsignedInt
object PangoFontScale extends CEnumU[PangoFontScale]:
  given _tag: Tag[PangoFontScale] = Tag.UInt
  inline def define(inline a: Long): PangoFontScale = a.toUInt
  val PANGO_FONT_SCALE_NONE = define(0)
  val PANGO_FONT_SCALE_SUPERSCRIPT = define(1)
  val PANGO_FONT_SCALE_SUBSCRIPT = define(2)
  val PANGO_FONT_SCALE_SMALL_CAPS = define(3)
  inline def getName(inline value: PangoFontScale): Option[String] =
    value match
      case PANGO_FONT_SCALE_NONE => Some("PANGO_FONT_SCALE_NONE")
      case PANGO_FONT_SCALE_SUPERSCRIPT => Some("PANGO_FONT_SCALE_SUPERSCRIPT")
      case PANGO_FONT_SCALE_SUBSCRIPT => Some("PANGO_FONT_SCALE_SUBSCRIPT")
      case PANGO_FONT_SCALE_SMALL_CAPS => Some("PANGO_FONT_SCALE_SMALL_CAPS")
      case _ => None
  extension (a: PangoFontScale)
    inline def &(b: PangoFontScale): PangoFontScale = a & b
    inline def |(b: PangoFontScale): PangoFontScale = a | b
    inline def is(b: PangoFontScale): Boolean = (a & b) == b

opaque type PangoGravity = CUnsignedInt
object PangoGravity extends CEnumU[PangoGravity]:
  given _tag: Tag[PangoGravity] = Tag.UInt
  inline def define(inline a: Long): PangoGravity = a.toUInt
  val PANGO_GRAVITY_SOUTH = define(0)
  val PANGO_GRAVITY_EAST = define(1)
  val PANGO_GRAVITY_NORTH = define(2)
  val PANGO_GRAVITY_WEST = define(3)
  val PANGO_GRAVITY_AUTO = define(4)
  inline def getName(inline value: PangoGravity): Option[String] =
    value match
      case PANGO_GRAVITY_SOUTH => Some("PANGO_GRAVITY_SOUTH")
      case PANGO_GRAVITY_EAST => Some("PANGO_GRAVITY_EAST")
      case PANGO_GRAVITY_NORTH => Some("PANGO_GRAVITY_NORTH")
      case PANGO_GRAVITY_WEST => Some("PANGO_GRAVITY_WEST")
      case PANGO_GRAVITY_AUTO => Some("PANGO_GRAVITY_AUTO")
      case _ => None
  extension (a: PangoGravity)
    inline def &(b: PangoGravity): PangoGravity = a & b
    inline def |(b: PangoGravity): PangoGravity = a | b
    inline def is(b: PangoGravity): Boolean = (a & b) == b

opaque type PangoGravityHint = CUnsignedInt
object PangoGravityHint extends CEnumU[PangoGravityHint]:
  given _tag: Tag[PangoGravityHint] = Tag.UInt
  inline def define(inline a: Long): PangoGravityHint = a.toUInt
  val PANGO_GRAVITY_HINT_NATURAL = define(0)
  val PANGO_GRAVITY_HINT_STRONG = define(1)
  val PANGO_GRAVITY_HINT_LINE = define(2)
  inline def getName(inline value: PangoGravityHint): Option[String] =
    value match
      case PANGO_GRAVITY_HINT_NATURAL => Some("PANGO_GRAVITY_HINT_NATURAL")
      case PANGO_GRAVITY_HINT_STRONG => Some("PANGO_GRAVITY_HINT_STRONG")
      case PANGO_GRAVITY_HINT_LINE => Some("PANGO_GRAVITY_HINT_LINE")
      case _ => None
  extension (a: PangoGravityHint)
    inline def &(b: PangoGravityHint): PangoGravityHint = a & b
    inline def |(b: PangoGravityHint): PangoGravityHint = a | b
    inline def is(b: PangoGravityHint): Boolean = (a & b) == b

opaque type PangoLayoutDeserializeError = CUnsignedInt
object PangoLayoutDeserializeError extends CEnumU[PangoLayoutDeserializeError]:
  given _tag: Tag[PangoLayoutDeserializeError] = Tag.UInt
  inline def define(inline a: Long): PangoLayoutDeserializeError = a.toUInt
  val PANGO_LAYOUT_DESERIALIZE_INVALID = define(0)
  val PANGO_LAYOUT_DESERIALIZE_INVALID_VALUE = define(1)
  val PANGO_LAYOUT_DESERIALIZE_MISSING_VALUE = define(2)
  inline def getName(inline value: PangoLayoutDeserializeError): Option[String] =
    value match
      case PANGO_LAYOUT_DESERIALIZE_INVALID => Some("PANGO_LAYOUT_DESERIALIZE_INVALID")
      case PANGO_LAYOUT_DESERIALIZE_INVALID_VALUE => Some("PANGO_LAYOUT_DESERIALIZE_INVALID_VALUE")
      case PANGO_LAYOUT_DESERIALIZE_MISSING_VALUE => Some("PANGO_LAYOUT_DESERIALIZE_MISSING_VALUE")
      case _ => None
  extension (a: PangoLayoutDeserializeError)
    inline def &(b: PangoLayoutDeserializeError): PangoLayoutDeserializeError = a & b
    inline def |(b: PangoLayoutDeserializeError): PangoLayoutDeserializeError = a | b
    inline def is(b: PangoLayoutDeserializeError): Boolean = (a & b) == b

opaque type PangoLayoutDeserializeFlags = CUnsignedInt
object PangoLayoutDeserializeFlags extends CEnumU[PangoLayoutDeserializeFlags]:
  given _tag: Tag[PangoLayoutDeserializeFlags] = Tag.UInt
  inline def define(inline a: Long): PangoLayoutDeserializeFlags = a.toUInt
  val PANGO_LAYOUT_DESERIALIZE_DEFAULT = define(0)
  val PANGO_LAYOUT_DESERIALIZE_CONTEXT = define(1)
  inline def getName(inline value: PangoLayoutDeserializeFlags): Option[String] =
    value match
      case PANGO_LAYOUT_DESERIALIZE_DEFAULT => Some("PANGO_LAYOUT_DESERIALIZE_DEFAULT")
      case PANGO_LAYOUT_DESERIALIZE_CONTEXT => Some("PANGO_LAYOUT_DESERIALIZE_CONTEXT")
      case _ => None
  extension (a: PangoLayoutDeserializeFlags)
    inline def &(b: PangoLayoutDeserializeFlags): PangoLayoutDeserializeFlags = a & b
    inline def |(b: PangoLayoutDeserializeFlags): PangoLayoutDeserializeFlags = a | b
    inline def is(b: PangoLayoutDeserializeFlags): Boolean = (a & b) == b

opaque type PangoLayoutSerializeFlags = CUnsignedInt
object PangoLayoutSerializeFlags extends CEnumU[PangoLayoutSerializeFlags]:
  given _tag: Tag[PangoLayoutSerializeFlags] = Tag.UInt
  inline def define(inline a: Long): PangoLayoutSerializeFlags = a.toUInt
  val PANGO_LAYOUT_SERIALIZE_DEFAULT = define(0)
  val PANGO_LAYOUT_SERIALIZE_CONTEXT = define(1)
  val PANGO_LAYOUT_SERIALIZE_OUTPUT = define(2)
  inline def getName(inline value: PangoLayoutSerializeFlags): Option[String] =
    value match
      case PANGO_LAYOUT_SERIALIZE_DEFAULT => Some("PANGO_LAYOUT_SERIALIZE_DEFAULT")
      case PANGO_LAYOUT_SERIALIZE_CONTEXT => Some("PANGO_LAYOUT_SERIALIZE_CONTEXT")
      case PANGO_LAYOUT_SERIALIZE_OUTPUT => Some("PANGO_LAYOUT_SERIALIZE_OUTPUT")
      case _ => None
  extension (a: PangoLayoutSerializeFlags)
    inline def &(b: PangoLayoutSerializeFlags): PangoLayoutSerializeFlags = a & b
    inline def |(b: PangoLayoutSerializeFlags): PangoLayoutSerializeFlags = a | b
    inline def is(b: PangoLayoutSerializeFlags): Boolean = (a & b) == b

opaque type PangoOverline = CUnsignedInt
object PangoOverline extends CEnumU[PangoOverline]:
  given _tag: Tag[PangoOverline] = Tag.UInt
  inline def define(inline a: Long): PangoOverline = a.toUInt
  val PANGO_OVERLINE_NONE = define(0)
  val PANGO_OVERLINE_SINGLE = define(1)
  inline def getName(inline value: PangoOverline): Option[String] =
    value match
      case PANGO_OVERLINE_NONE => Some("PANGO_OVERLINE_NONE")
      case PANGO_OVERLINE_SINGLE => Some("PANGO_OVERLINE_SINGLE")
      case _ => None
  extension (a: PangoOverline)
    inline def &(b: PangoOverline): PangoOverline = a & b
    inline def |(b: PangoOverline): PangoOverline = a | b
    inline def is(b: PangoOverline): Boolean = (a & b) == b

opaque type PangoRenderPart = CUnsignedInt
object PangoRenderPart extends CEnumU[PangoRenderPart]:
  given _tag: Tag[PangoRenderPart] = Tag.UInt
  inline def define(inline a: Long): PangoRenderPart = a.toUInt
  val PANGO_RENDER_PART_FOREGROUND = define(0)
  val PANGO_RENDER_PART_BACKGROUND = define(1)
  val PANGO_RENDER_PART_UNDERLINE = define(2)
  val PANGO_RENDER_PART_STRIKETHROUGH = define(3)
  val PANGO_RENDER_PART_OVERLINE = define(4)
  inline def getName(inline value: PangoRenderPart): Option[String] =
    value match
      case PANGO_RENDER_PART_FOREGROUND => Some("PANGO_RENDER_PART_FOREGROUND")
      case PANGO_RENDER_PART_BACKGROUND => Some("PANGO_RENDER_PART_BACKGROUND")
      case PANGO_RENDER_PART_UNDERLINE => Some("PANGO_RENDER_PART_UNDERLINE")
      case PANGO_RENDER_PART_STRIKETHROUGH => Some("PANGO_RENDER_PART_STRIKETHROUGH")
      case PANGO_RENDER_PART_OVERLINE => Some("PANGO_RENDER_PART_OVERLINE")
      case _ => None
  extension (a: PangoRenderPart)
    inline def &(b: PangoRenderPart): PangoRenderPart = a & b
    inline def |(b: PangoRenderPart): PangoRenderPart = a | b
    inline def is(b: PangoRenderPart): Boolean = (a & b) == b

opaque type PangoScript = CInt
object PangoScript extends CEnum[PangoScript]:
  given _tag: Tag[PangoScript] = Tag.Int
  inline def define(inline a: CInt): PangoScript = a
  val PANGO_SCRIPT_INVALID_CODE = define(-1)
  val PANGO_SCRIPT_COMMON = define(0)
  val PANGO_SCRIPT_INHERITED = define(1)
  val PANGO_SCRIPT_ARABIC = define(2)
  val PANGO_SCRIPT_ARMENIAN = define(3)
  val PANGO_SCRIPT_BENGALI = define(4)
  val PANGO_SCRIPT_BOPOMOFO = define(5)
  val PANGO_SCRIPT_CHEROKEE = define(6)
  val PANGO_SCRIPT_COPTIC = define(7)
  val PANGO_SCRIPT_CYRILLIC = define(8)
  val PANGO_SCRIPT_DESERET = define(9)
  val PANGO_SCRIPT_DEVANAGARI = define(10)
  val PANGO_SCRIPT_ETHIOPIC = define(11)
  val PANGO_SCRIPT_GEORGIAN = define(12)
  val PANGO_SCRIPT_GOTHIC = define(13)
  val PANGO_SCRIPT_GREEK = define(14)
  val PANGO_SCRIPT_GUJARATI = define(15)
  val PANGO_SCRIPT_GURMUKHI = define(16)
  val PANGO_SCRIPT_HAN = define(17)
  val PANGO_SCRIPT_HANGUL = define(18)
  val PANGO_SCRIPT_HEBREW = define(19)
  val PANGO_SCRIPT_HIRAGANA = define(20)
  val PANGO_SCRIPT_KANNADA = define(21)
  val PANGO_SCRIPT_KATAKANA = define(22)
  val PANGO_SCRIPT_KHMER = define(23)
  val PANGO_SCRIPT_LAO = define(24)
  val PANGO_SCRIPT_LATIN = define(25)
  val PANGO_SCRIPT_MALAYALAM = define(26)
  val PANGO_SCRIPT_MONGOLIAN = define(27)
  val PANGO_SCRIPT_MYANMAR = define(28)
  val PANGO_SCRIPT_OGHAM = define(29)
  val PANGO_SCRIPT_OLD_ITALIC = define(30)
  val PANGO_SCRIPT_ORIYA = define(31)
  val PANGO_SCRIPT_RUNIC = define(32)
  val PANGO_SCRIPT_SINHALA = define(33)
  val PANGO_SCRIPT_SYRIAC = define(34)
  val PANGO_SCRIPT_TAMIL = define(35)
  val PANGO_SCRIPT_TELUGU = define(36)
  val PANGO_SCRIPT_THAANA = define(37)
  val PANGO_SCRIPT_THAI = define(38)
  val PANGO_SCRIPT_TIBETAN = define(39)
  val PANGO_SCRIPT_CANADIAN_ABORIGINAL = define(40)
  val PANGO_SCRIPT_YI = define(41)
  val PANGO_SCRIPT_TAGALOG = define(42)
  val PANGO_SCRIPT_HANUNOO = define(43)
  val PANGO_SCRIPT_BUHID = define(44)
  val PANGO_SCRIPT_TAGBANWA = define(45)
  val PANGO_SCRIPT_BRAILLE = define(46)
  val PANGO_SCRIPT_CYPRIOT = define(47)
  val PANGO_SCRIPT_LIMBU = define(48)
  val PANGO_SCRIPT_OSMANYA = define(49)
  val PANGO_SCRIPT_SHAVIAN = define(50)
  val PANGO_SCRIPT_LINEAR_B = define(51)
  val PANGO_SCRIPT_TAI_LE = define(52)
  val PANGO_SCRIPT_UGARITIC = define(53)
  val PANGO_SCRIPT_NEW_TAI_LUE = define(54)
  val PANGO_SCRIPT_BUGINESE = define(55)
  val PANGO_SCRIPT_GLAGOLITIC = define(56)
  val PANGO_SCRIPT_TIFINAGH = define(57)
  val PANGO_SCRIPT_SYLOTI_NAGRI = define(58)
  val PANGO_SCRIPT_OLD_PERSIAN = define(59)
  val PANGO_SCRIPT_KHAROSHTHI = define(60)
  val PANGO_SCRIPT_UNKNOWN = define(61)
  val PANGO_SCRIPT_BALINESE = define(62)
  val PANGO_SCRIPT_CUNEIFORM = define(63)
  val PANGO_SCRIPT_PHOENICIAN = define(64)
  val PANGO_SCRIPT_PHAGS_PA = define(65)
  val PANGO_SCRIPT_NKO = define(66)
  val PANGO_SCRIPT_KAYAH_LI = define(67)
  val PANGO_SCRIPT_LEPCHA = define(68)
  val PANGO_SCRIPT_REJANG = define(69)
  val PANGO_SCRIPT_SUNDANESE = define(70)
  val PANGO_SCRIPT_SAURASHTRA = define(71)
  val PANGO_SCRIPT_CHAM = define(72)
  val PANGO_SCRIPT_OL_CHIKI = define(73)
  val PANGO_SCRIPT_VAI = define(74)
  val PANGO_SCRIPT_CARIAN = define(75)
  val PANGO_SCRIPT_LYCIAN = define(76)
  val PANGO_SCRIPT_LYDIAN = define(77)
  val PANGO_SCRIPT_BATAK = define(78)
  val PANGO_SCRIPT_BRAHMI = define(79)
  val PANGO_SCRIPT_MANDAIC = define(80)
  val PANGO_SCRIPT_CHAKMA = define(81)
  val PANGO_SCRIPT_MEROITIC_CURSIVE = define(82)
  val PANGO_SCRIPT_MEROITIC_HIEROGLYPHS = define(83)
  val PANGO_SCRIPT_MIAO = define(84)
  val PANGO_SCRIPT_SHARADA = define(85)
  val PANGO_SCRIPT_SORA_SOMPENG = define(86)
  val PANGO_SCRIPT_TAKRI = define(87)
  val PANGO_SCRIPT_BASSA_VAH = define(88)
  val PANGO_SCRIPT_CAUCASIAN_ALBANIAN = define(89)
  val PANGO_SCRIPT_DUPLOYAN = define(90)
  val PANGO_SCRIPT_ELBASAN = define(91)
  val PANGO_SCRIPT_GRANTHA = define(92)
  val PANGO_SCRIPT_KHOJKI = define(93)
  val PANGO_SCRIPT_KHUDAWADI = define(94)
  val PANGO_SCRIPT_LINEAR_A = define(95)
  val PANGO_SCRIPT_MAHAJANI = define(96)
  val PANGO_SCRIPT_MANICHAEAN = define(97)
  val PANGO_SCRIPT_MENDE_KIKAKUI = define(98)
  val PANGO_SCRIPT_MODI = define(99)
  val PANGO_SCRIPT_MRO = define(100)
  val PANGO_SCRIPT_NABATAEAN = define(101)
  val PANGO_SCRIPT_OLD_NORTH_ARABIAN = define(102)
  val PANGO_SCRIPT_OLD_PERMIC = define(103)
  val PANGO_SCRIPT_PAHAWH_HMONG = define(104)
  val PANGO_SCRIPT_PALMYRENE = define(105)
  val PANGO_SCRIPT_PAU_CIN_HAU = define(106)
  val PANGO_SCRIPT_PSALTER_PAHLAVI = define(107)
  val PANGO_SCRIPT_SIDDHAM = define(108)
  val PANGO_SCRIPT_TIRHUTA = define(109)
  val PANGO_SCRIPT_WARANG_CITI = define(110)
  val PANGO_SCRIPT_AHOM = define(111)
  val PANGO_SCRIPT_ANATOLIAN_HIEROGLYPHS = define(112)
  val PANGO_SCRIPT_HATRAN = define(113)
  val PANGO_SCRIPT_MULTANI = define(114)
  val PANGO_SCRIPT_OLD_HUNGARIAN = define(115)
  val PANGO_SCRIPT_SIGNWRITING = define(116)
  inline def getName(inline value: PangoScript): Option[String] =
    value match
      case PANGO_SCRIPT_INVALID_CODE => Some("PANGO_SCRIPT_INVALID_CODE")
      case PANGO_SCRIPT_COMMON => Some("PANGO_SCRIPT_COMMON")
      case PANGO_SCRIPT_INHERITED => Some("PANGO_SCRIPT_INHERITED")
      case PANGO_SCRIPT_ARABIC => Some("PANGO_SCRIPT_ARABIC")
      case PANGO_SCRIPT_ARMENIAN => Some("PANGO_SCRIPT_ARMENIAN")
      case PANGO_SCRIPT_BENGALI => Some("PANGO_SCRIPT_BENGALI")
      case PANGO_SCRIPT_BOPOMOFO => Some("PANGO_SCRIPT_BOPOMOFO")
      case PANGO_SCRIPT_CHEROKEE => Some("PANGO_SCRIPT_CHEROKEE")
      case PANGO_SCRIPT_COPTIC => Some("PANGO_SCRIPT_COPTIC")
      case PANGO_SCRIPT_CYRILLIC => Some("PANGO_SCRIPT_CYRILLIC")
      case PANGO_SCRIPT_DESERET => Some("PANGO_SCRIPT_DESERET")
      case PANGO_SCRIPT_DEVANAGARI => Some("PANGO_SCRIPT_DEVANAGARI")
      case PANGO_SCRIPT_ETHIOPIC => Some("PANGO_SCRIPT_ETHIOPIC")
      case PANGO_SCRIPT_GEORGIAN => Some("PANGO_SCRIPT_GEORGIAN")
      case PANGO_SCRIPT_GOTHIC => Some("PANGO_SCRIPT_GOTHIC")
      case PANGO_SCRIPT_GREEK => Some("PANGO_SCRIPT_GREEK")
      case PANGO_SCRIPT_GUJARATI => Some("PANGO_SCRIPT_GUJARATI")
      case PANGO_SCRIPT_GURMUKHI => Some("PANGO_SCRIPT_GURMUKHI")
      case PANGO_SCRIPT_HAN => Some("PANGO_SCRIPT_HAN")
      case PANGO_SCRIPT_HANGUL => Some("PANGO_SCRIPT_HANGUL")
      case PANGO_SCRIPT_HEBREW => Some("PANGO_SCRIPT_HEBREW")
      case PANGO_SCRIPT_HIRAGANA => Some("PANGO_SCRIPT_HIRAGANA")
      case PANGO_SCRIPT_KANNADA => Some("PANGO_SCRIPT_KANNADA")
      case PANGO_SCRIPT_KATAKANA => Some("PANGO_SCRIPT_KATAKANA")
      case PANGO_SCRIPT_KHMER => Some("PANGO_SCRIPT_KHMER")
      case PANGO_SCRIPT_LAO => Some("PANGO_SCRIPT_LAO")
      case PANGO_SCRIPT_LATIN => Some("PANGO_SCRIPT_LATIN")
      case PANGO_SCRIPT_MALAYALAM => Some("PANGO_SCRIPT_MALAYALAM")
      case PANGO_SCRIPT_MONGOLIAN => Some("PANGO_SCRIPT_MONGOLIAN")
      case PANGO_SCRIPT_MYANMAR => Some("PANGO_SCRIPT_MYANMAR")
      case PANGO_SCRIPT_OGHAM => Some("PANGO_SCRIPT_OGHAM")
      case PANGO_SCRIPT_OLD_ITALIC => Some("PANGO_SCRIPT_OLD_ITALIC")
      case PANGO_SCRIPT_ORIYA => Some("PANGO_SCRIPT_ORIYA")
      case PANGO_SCRIPT_RUNIC => Some("PANGO_SCRIPT_RUNIC")
      case PANGO_SCRIPT_SINHALA => Some("PANGO_SCRIPT_SINHALA")
      case PANGO_SCRIPT_SYRIAC => Some("PANGO_SCRIPT_SYRIAC")
      case PANGO_SCRIPT_TAMIL => Some("PANGO_SCRIPT_TAMIL")
      case PANGO_SCRIPT_TELUGU => Some("PANGO_SCRIPT_TELUGU")
      case PANGO_SCRIPT_THAANA => Some("PANGO_SCRIPT_THAANA")
      case PANGO_SCRIPT_THAI => Some("PANGO_SCRIPT_THAI")
      case PANGO_SCRIPT_TIBETAN => Some("PANGO_SCRIPT_TIBETAN")
      case PANGO_SCRIPT_CANADIAN_ABORIGINAL => Some("PANGO_SCRIPT_CANADIAN_ABORIGINAL")
      case PANGO_SCRIPT_YI => Some("PANGO_SCRIPT_YI")
      case PANGO_SCRIPT_TAGALOG => Some("PANGO_SCRIPT_TAGALOG")
      case PANGO_SCRIPT_HANUNOO => Some("PANGO_SCRIPT_HANUNOO")
      case PANGO_SCRIPT_BUHID => Some("PANGO_SCRIPT_BUHID")
      case PANGO_SCRIPT_TAGBANWA => Some("PANGO_SCRIPT_TAGBANWA")
      case PANGO_SCRIPT_BRAILLE => Some("PANGO_SCRIPT_BRAILLE")
      case PANGO_SCRIPT_CYPRIOT => Some("PANGO_SCRIPT_CYPRIOT")
      case PANGO_SCRIPT_LIMBU => Some("PANGO_SCRIPT_LIMBU")
      case PANGO_SCRIPT_OSMANYA => Some("PANGO_SCRIPT_OSMANYA")
      case PANGO_SCRIPT_SHAVIAN => Some("PANGO_SCRIPT_SHAVIAN")
      case PANGO_SCRIPT_LINEAR_B => Some("PANGO_SCRIPT_LINEAR_B")
      case PANGO_SCRIPT_TAI_LE => Some("PANGO_SCRIPT_TAI_LE")
      case PANGO_SCRIPT_UGARITIC => Some("PANGO_SCRIPT_UGARITIC")
      case PANGO_SCRIPT_NEW_TAI_LUE => Some("PANGO_SCRIPT_NEW_TAI_LUE")
      case PANGO_SCRIPT_BUGINESE => Some("PANGO_SCRIPT_BUGINESE")
      case PANGO_SCRIPT_GLAGOLITIC => Some("PANGO_SCRIPT_GLAGOLITIC")
      case PANGO_SCRIPT_TIFINAGH => Some("PANGO_SCRIPT_TIFINAGH")
      case PANGO_SCRIPT_SYLOTI_NAGRI => Some("PANGO_SCRIPT_SYLOTI_NAGRI")
      case PANGO_SCRIPT_OLD_PERSIAN => Some("PANGO_SCRIPT_OLD_PERSIAN")
      case PANGO_SCRIPT_KHAROSHTHI => Some("PANGO_SCRIPT_KHAROSHTHI")
      case PANGO_SCRIPT_UNKNOWN => Some("PANGO_SCRIPT_UNKNOWN")
      case PANGO_SCRIPT_BALINESE => Some("PANGO_SCRIPT_BALINESE")
      case PANGO_SCRIPT_CUNEIFORM => Some("PANGO_SCRIPT_CUNEIFORM")
      case PANGO_SCRIPT_PHOENICIAN => Some("PANGO_SCRIPT_PHOENICIAN")
      case PANGO_SCRIPT_PHAGS_PA => Some("PANGO_SCRIPT_PHAGS_PA")
      case PANGO_SCRIPT_NKO => Some("PANGO_SCRIPT_NKO")
      case PANGO_SCRIPT_KAYAH_LI => Some("PANGO_SCRIPT_KAYAH_LI")
      case PANGO_SCRIPT_LEPCHA => Some("PANGO_SCRIPT_LEPCHA")
      case PANGO_SCRIPT_REJANG => Some("PANGO_SCRIPT_REJANG")
      case PANGO_SCRIPT_SUNDANESE => Some("PANGO_SCRIPT_SUNDANESE")
      case PANGO_SCRIPT_SAURASHTRA => Some("PANGO_SCRIPT_SAURASHTRA")
      case PANGO_SCRIPT_CHAM => Some("PANGO_SCRIPT_CHAM")
      case PANGO_SCRIPT_OL_CHIKI => Some("PANGO_SCRIPT_OL_CHIKI")
      case PANGO_SCRIPT_VAI => Some("PANGO_SCRIPT_VAI")
      case PANGO_SCRIPT_CARIAN => Some("PANGO_SCRIPT_CARIAN")
      case PANGO_SCRIPT_LYCIAN => Some("PANGO_SCRIPT_LYCIAN")
      case PANGO_SCRIPT_LYDIAN => Some("PANGO_SCRIPT_LYDIAN")
      case PANGO_SCRIPT_BATAK => Some("PANGO_SCRIPT_BATAK")
      case PANGO_SCRIPT_BRAHMI => Some("PANGO_SCRIPT_BRAHMI")
      case PANGO_SCRIPT_MANDAIC => Some("PANGO_SCRIPT_MANDAIC")
      case PANGO_SCRIPT_CHAKMA => Some("PANGO_SCRIPT_CHAKMA")
      case PANGO_SCRIPT_MEROITIC_CURSIVE => Some("PANGO_SCRIPT_MEROITIC_CURSIVE")
      case PANGO_SCRIPT_MEROITIC_HIEROGLYPHS => Some("PANGO_SCRIPT_MEROITIC_HIEROGLYPHS")
      case PANGO_SCRIPT_MIAO => Some("PANGO_SCRIPT_MIAO")
      case PANGO_SCRIPT_SHARADA => Some("PANGO_SCRIPT_SHARADA")
      case PANGO_SCRIPT_SORA_SOMPENG => Some("PANGO_SCRIPT_SORA_SOMPENG")
      case PANGO_SCRIPT_TAKRI => Some("PANGO_SCRIPT_TAKRI")
      case PANGO_SCRIPT_BASSA_VAH => Some("PANGO_SCRIPT_BASSA_VAH")
      case PANGO_SCRIPT_CAUCASIAN_ALBANIAN => Some("PANGO_SCRIPT_CAUCASIAN_ALBANIAN")
      case PANGO_SCRIPT_DUPLOYAN => Some("PANGO_SCRIPT_DUPLOYAN")
      case PANGO_SCRIPT_ELBASAN => Some("PANGO_SCRIPT_ELBASAN")
      case PANGO_SCRIPT_GRANTHA => Some("PANGO_SCRIPT_GRANTHA")
      case PANGO_SCRIPT_KHOJKI => Some("PANGO_SCRIPT_KHOJKI")
      case PANGO_SCRIPT_KHUDAWADI => Some("PANGO_SCRIPT_KHUDAWADI")
      case PANGO_SCRIPT_LINEAR_A => Some("PANGO_SCRIPT_LINEAR_A")
      case PANGO_SCRIPT_MAHAJANI => Some("PANGO_SCRIPT_MAHAJANI")
      case PANGO_SCRIPT_MANICHAEAN => Some("PANGO_SCRIPT_MANICHAEAN")
      case PANGO_SCRIPT_MENDE_KIKAKUI => Some("PANGO_SCRIPT_MENDE_KIKAKUI")
      case PANGO_SCRIPT_MODI => Some("PANGO_SCRIPT_MODI")
      case PANGO_SCRIPT_MRO => Some("PANGO_SCRIPT_MRO")
      case PANGO_SCRIPT_NABATAEAN => Some("PANGO_SCRIPT_NABATAEAN")
      case PANGO_SCRIPT_OLD_NORTH_ARABIAN => Some("PANGO_SCRIPT_OLD_NORTH_ARABIAN")
      case PANGO_SCRIPT_OLD_PERMIC => Some("PANGO_SCRIPT_OLD_PERMIC")
      case PANGO_SCRIPT_PAHAWH_HMONG => Some("PANGO_SCRIPT_PAHAWH_HMONG")
      case PANGO_SCRIPT_PALMYRENE => Some("PANGO_SCRIPT_PALMYRENE")
      case PANGO_SCRIPT_PAU_CIN_HAU => Some("PANGO_SCRIPT_PAU_CIN_HAU")
      case PANGO_SCRIPT_PSALTER_PAHLAVI => Some("PANGO_SCRIPT_PSALTER_PAHLAVI")
      case PANGO_SCRIPT_SIDDHAM => Some("PANGO_SCRIPT_SIDDHAM")
      case PANGO_SCRIPT_TIRHUTA => Some("PANGO_SCRIPT_TIRHUTA")
      case PANGO_SCRIPT_WARANG_CITI => Some("PANGO_SCRIPT_WARANG_CITI")
      case PANGO_SCRIPT_AHOM => Some("PANGO_SCRIPT_AHOM")
      case PANGO_SCRIPT_ANATOLIAN_HIEROGLYPHS => Some("PANGO_SCRIPT_ANATOLIAN_HIEROGLYPHS")
      case PANGO_SCRIPT_HATRAN => Some("PANGO_SCRIPT_HATRAN")
      case PANGO_SCRIPT_MULTANI => Some("PANGO_SCRIPT_MULTANI")
      case PANGO_SCRIPT_OLD_HUNGARIAN => Some("PANGO_SCRIPT_OLD_HUNGARIAN")
      case PANGO_SCRIPT_SIGNWRITING => Some("PANGO_SCRIPT_SIGNWRITING")
      case _ => None
  extension (a: PangoScript)
    inline def &(b: PangoScript): PangoScript = a & b
    inline def |(b: PangoScript): PangoScript = a | b
    inline def is(b: PangoScript): Boolean = (a & b) == b

opaque type PangoShapeFlags = CUnsignedInt
object PangoShapeFlags extends CEnumU[PangoShapeFlags]:
  given _tag: Tag[PangoShapeFlags] = Tag.UInt
  inline def define(inline a: Long): PangoShapeFlags = a.toUInt
  val PANGO_SHAPE_NONE = define(0)
  val PANGO_SHAPE_ROUND_POSITIONS = define(1)
  inline def getName(inline value: PangoShapeFlags): Option[String] =
    value match
      case PANGO_SHAPE_NONE => Some("PANGO_SHAPE_NONE")
      case PANGO_SHAPE_ROUND_POSITIONS => Some("PANGO_SHAPE_ROUND_POSITIONS")
      case _ => None
  extension (a: PangoShapeFlags)
    inline def &(b: PangoShapeFlags): PangoShapeFlags = a & b
    inline def |(b: PangoShapeFlags): PangoShapeFlags = a | b
    inline def is(b: PangoShapeFlags): Boolean = (a & b) == b

opaque type PangoShowFlags = CUnsignedInt
object PangoShowFlags extends CEnumU[PangoShowFlags]:
  given _tag: Tag[PangoShowFlags] = Tag.UInt
  inline def define(inline a: Long): PangoShowFlags = a.toUInt
  val PANGO_SHOW_NONE = define(0)
  val PANGO_SHOW_SPACES = define(1)
  val PANGO_SHOW_LINE_BREAKS = define(2)
  val PANGO_SHOW_IGNORABLES = define(4)
  inline def getName(inline value: PangoShowFlags): Option[String] =
    value match
      case PANGO_SHOW_NONE => Some("PANGO_SHOW_NONE")
      case PANGO_SHOW_SPACES => Some("PANGO_SHOW_SPACES")
      case PANGO_SHOW_LINE_BREAKS => Some("PANGO_SHOW_LINE_BREAKS")
      case PANGO_SHOW_IGNORABLES => Some("PANGO_SHOW_IGNORABLES")
      case _ => None
  extension (a: PangoShowFlags)
    inline def &(b: PangoShowFlags): PangoShowFlags = a & b
    inline def |(b: PangoShowFlags): PangoShowFlags = a | b
    inline def is(b: PangoShowFlags): Boolean = (a & b) == b

opaque type PangoStretch = CUnsignedInt
object PangoStretch extends CEnumU[PangoStretch]:
  given _tag: Tag[PangoStretch] = Tag.UInt
  inline def define(inline a: Long): PangoStretch = a.toUInt
  val PANGO_STRETCH_ULTRA_CONDENSED = define(0)
  val PANGO_STRETCH_EXTRA_CONDENSED = define(1)
  val PANGO_STRETCH_CONDENSED = define(2)
  val PANGO_STRETCH_SEMI_CONDENSED = define(3)
  val PANGO_STRETCH_NORMAL = define(4)
  val PANGO_STRETCH_SEMI_EXPANDED = define(5)
  val PANGO_STRETCH_EXPANDED = define(6)
  val PANGO_STRETCH_EXTRA_EXPANDED = define(7)
  val PANGO_STRETCH_ULTRA_EXPANDED = define(8)
  inline def getName(inline value: PangoStretch): Option[String] =
    value match
      case PANGO_STRETCH_ULTRA_CONDENSED => Some("PANGO_STRETCH_ULTRA_CONDENSED")
      case PANGO_STRETCH_EXTRA_CONDENSED => Some("PANGO_STRETCH_EXTRA_CONDENSED")
      case PANGO_STRETCH_CONDENSED => Some("PANGO_STRETCH_CONDENSED")
      case PANGO_STRETCH_SEMI_CONDENSED => Some("PANGO_STRETCH_SEMI_CONDENSED")
      case PANGO_STRETCH_NORMAL => Some("PANGO_STRETCH_NORMAL")
      case PANGO_STRETCH_SEMI_EXPANDED => Some("PANGO_STRETCH_SEMI_EXPANDED")
      case PANGO_STRETCH_EXPANDED => Some("PANGO_STRETCH_EXPANDED")
      case PANGO_STRETCH_EXTRA_EXPANDED => Some("PANGO_STRETCH_EXTRA_EXPANDED")
      case PANGO_STRETCH_ULTRA_EXPANDED => Some("PANGO_STRETCH_ULTRA_EXPANDED")
      case _ => None
  extension (a: PangoStretch)
    inline def &(b: PangoStretch): PangoStretch = a & b
    inline def |(b: PangoStretch): PangoStretch = a | b
    inline def is(b: PangoStretch): Boolean = (a & b) == b

opaque type PangoStyle = CUnsignedInt
object PangoStyle extends CEnumU[PangoStyle]:
  given _tag: Tag[PangoStyle] = Tag.UInt
  inline def define(inline a: Long): PangoStyle = a.toUInt
  val PANGO_STYLE_NORMAL = define(0)
  val PANGO_STYLE_OBLIQUE = define(1)
  val PANGO_STYLE_ITALIC = define(2)
  inline def getName(inline value: PangoStyle): Option[String] =
    value match
      case PANGO_STYLE_NORMAL => Some("PANGO_STYLE_NORMAL")
      case PANGO_STYLE_OBLIQUE => Some("PANGO_STYLE_OBLIQUE")
      case PANGO_STYLE_ITALIC => Some("PANGO_STYLE_ITALIC")
      case _ => None
  extension (a: PangoStyle)
    inline def &(b: PangoStyle): PangoStyle = a & b
    inline def |(b: PangoStyle): PangoStyle = a | b
    inline def is(b: PangoStyle): Boolean = (a & b) == b

opaque type PangoTabAlign = CUnsignedInt
object PangoTabAlign extends CEnumU[PangoTabAlign]:
  given _tag: Tag[PangoTabAlign] = Tag.UInt
  inline def define(inline a: Long): PangoTabAlign = a.toUInt
  val PANGO_TAB_LEFT = define(0)
  val PANGO_TAB_RIGHT = define(1)
  val PANGO_TAB_CENTER = define(2)
  val PANGO_TAB_DECIMAL = define(3)
  inline def getName(inline value: PangoTabAlign): Option[String] =
    value match
      case PANGO_TAB_LEFT => Some("PANGO_TAB_LEFT")
      case PANGO_TAB_RIGHT => Some("PANGO_TAB_RIGHT")
      case PANGO_TAB_CENTER => Some("PANGO_TAB_CENTER")
      case PANGO_TAB_DECIMAL => Some("PANGO_TAB_DECIMAL")
      case _ => None
  extension (a: PangoTabAlign)
    inline def &(b: PangoTabAlign): PangoTabAlign = a & b
    inline def |(b: PangoTabAlign): PangoTabAlign = a | b
    inline def is(b: PangoTabAlign): Boolean = (a & b) == b

opaque type PangoTextTransform = CUnsignedInt
object PangoTextTransform extends CEnumU[PangoTextTransform]:
  given _tag: Tag[PangoTextTransform] = Tag.UInt
  inline def define(inline a: Long): PangoTextTransform = a.toUInt
  val PANGO_TEXT_TRANSFORM_NONE = define(0)
  val PANGO_TEXT_TRANSFORM_LOWERCASE = define(1)
  val PANGO_TEXT_TRANSFORM_UPPERCASE = define(2)
  val PANGO_TEXT_TRANSFORM_CAPITALIZE = define(3)
  inline def getName(inline value: PangoTextTransform): Option[String] =
    value match
      case PANGO_TEXT_TRANSFORM_NONE => Some("PANGO_TEXT_TRANSFORM_NONE")
      case PANGO_TEXT_TRANSFORM_LOWERCASE => Some("PANGO_TEXT_TRANSFORM_LOWERCASE")
      case PANGO_TEXT_TRANSFORM_UPPERCASE => Some("PANGO_TEXT_TRANSFORM_UPPERCASE")
      case PANGO_TEXT_TRANSFORM_CAPITALIZE => Some("PANGO_TEXT_TRANSFORM_CAPITALIZE")
      case _ => None
  extension (a: PangoTextTransform)
    inline def &(b: PangoTextTransform): PangoTextTransform = a & b
    inline def |(b: PangoTextTransform): PangoTextTransform = a | b
    inline def is(b: PangoTextTransform): Boolean = (a & b) == b

opaque type PangoUnderline = CUnsignedInt
object PangoUnderline extends CEnumU[PangoUnderline]:
  given _tag: Tag[PangoUnderline] = Tag.UInt
  inline def define(inline a: Long): PangoUnderline = a.toUInt
  val PANGO_UNDERLINE_NONE = define(0)
  val PANGO_UNDERLINE_SINGLE = define(1)
  val PANGO_UNDERLINE_DOUBLE = define(2)
  val PANGO_UNDERLINE_LOW = define(3)
  val PANGO_UNDERLINE_ERROR = define(4)
  val PANGO_UNDERLINE_SINGLE_LINE = define(5)
  val PANGO_UNDERLINE_DOUBLE_LINE = define(6)
  val PANGO_UNDERLINE_ERROR_LINE = define(7)
  inline def getName(inline value: PangoUnderline): Option[String] =
    value match
      case PANGO_UNDERLINE_NONE => Some("PANGO_UNDERLINE_NONE")
      case PANGO_UNDERLINE_SINGLE => Some("PANGO_UNDERLINE_SINGLE")
      case PANGO_UNDERLINE_DOUBLE => Some("PANGO_UNDERLINE_DOUBLE")
      case PANGO_UNDERLINE_LOW => Some("PANGO_UNDERLINE_LOW")
      case PANGO_UNDERLINE_ERROR => Some("PANGO_UNDERLINE_ERROR")
      case PANGO_UNDERLINE_SINGLE_LINE => Some("PANGO_UNDERLINE_SINGLE_LINE")
      case PANGO_UNDERLINE_DOUBLE_LINE => Some("PANGO_UNDERLINE_DOUBLE_LINE")
      case PANGO_UNDERLINE_ERROR_LINE => Some("PANGO_UNDERLINE_ERROR_LINE")
      case _ => None
  extension (a: PangoUnderline)
    inline def &(b: PangoUnderline): PangoUnderline = a & b
    inline def |(b: PangoUnderline): PangoUnderline = a | b
    inline def is(b: PangoUnderline): Boolean = (a & b) == b

opaque type PangoVariant = CUnsignedInt
object PangoVariant extends CEnumU[PangoVariant]:
  given _tag: Tag[PangoVariant] = Tag.UInt
  inline def define(inline a: Long): PangoVariant = a.toUInt
  val PANGO_VARIANT_NORMAL = define(0)
  val PANGO_VARIANT_SMALL_CAPS = define(1)
  val PANGO_VARIANT_ALL_SMALL_CAPS = define(2)
  val PANGO_VARIANT_PETITE_CAPS = define(3)
  val PANGO_VARIANT_ALL_PETITE_CAPS = define(4)
  val PANGO_VARIANT_UNICASE = define(5)
  val PANGO_VARIANT_TITLE_CAPS = define(6)
  inline def getName(inline value: PangoVariant): Option[String] =
    value match
      case PANGO_VARIANT_NORMAL => Some("PANGO_VARIANT_NORMAL")
      case PANGO_VARIANT_SMALL_CAPS => Some("PANGO_VARIANT_SMALL_CAPS")
      case PANGO_VARIANT_ALL_SMALL_CAPS => Some("PANGO_VARIANT_ALL_SMALL_CAPS")
      case PANGO_VARIANT_PETITE_CAPS => Some("PANGO_VARIANT_PETITE_CAPS")
      case PANGO_VARIANT_ALL_PETITE_CAPS => Some("PANGO_VARIANT_ALL_PETITE_CAPS")
      case PANGO_VARIANT_UNICASE => Some("PANGO_VARIANT_UNICASE")
      case PANGO_VARIANT_TITLE_CAPS => Some("PANGO_VARIANT_TITLE_CAPS")
      case _ => None
  extension (a: PangoVariant)
    inline def &(b: PangoVariant): PangoVariant = a & b
    inline def |(b: PangoVariant): PangoVariant = a | b
    inline def is(b: PangoVariant): Boolean = (a & b) == b

opaque type PangoWeight = CUnsignedInt
object PangoWeight extends CEnumU[PangoWeight]:
  given _tag: Tag[PangoWeight] = Tag.UInt
  inline def define(inline a: Long): PangoWeight = a.toUInt
  val PANGO_WEIGHT_THIN = define(100)
  val PANGO_WEIGHT_ULTRALIGHT = define(200)
  val PANGO_WEIGHT_LIGHT = define(300)
  val PANGO_WEIGHT_SEMILIGHT = define(350)
  val PANGO_WEIGHT_BOOK = define(380)
  val PANGO_WEIGHT_NORMAL = define(400)
  val PANGO_WEIGHT_MEDIUM = define(500)
  val PANGO_WEIGHT_SEMIBOLD = define(600)
  val PANGO_WEIGHT_BOLD = define(700)
  val PANGO_WEIGHT_ULTRABOLD = define(800)
  val PANGO_WEIGHT_HEAVY = define(900)
  val PANGO_WEIGHT_ULTRAHEAVY = define(1000)
  inline def getName(inline value: PangoWeight): Option[String] =
    value match
      case PANGO_WEIGHT_THIN => Some("PANGO_WEIGHT_THIN")
      case PANGO_WEIGHT_ULTRALIGHT => Some("PANGO_WEIGHT_ULTRALIGHT")
      case PANGO_WEIGHT_LIGHT => Some("PANGO_WEIGHT_LIGHT")
      case PANGO_WEIGHT_SEMILIGHT => Some("PANGO_WEIGHT_SEMILIGHT")
      case PANGO_WEIGHT_BOOK => Some("PANGO_WEIGHT_BOOK")
      case PANGO_WEIGHT_NORMAL => Some("PANGO_WEIGHT_NORMAL")
      case PANGO_WEIGHT_MEDIUM => Some("PANGO_WEIGHT_MEDIUM")
      case PANGO_WEIGHT_SEMIBOLD => Some("PANGO_WEIGHT_SEMIBOLD")
      case PANGO_WEIGHT_BOLD => Some("PANGO_WEIGHT_BOLD")
      case PANGO_WEIGHT_ULTRABOLD => Some("PANGO_WEIGHT_ULTRABOLD")
      case PANGO_WEIGHT_HEAVY => Some("PANGO_WEIGHT_HEAVY")
      case PANGO_WEIGHT_ULTRAHEAVY => Some("PANGO_WEIGHT_ULTRAHEAVY")
      case _ => None
  extension (a: PangoWeight)
    inline def &(b: PangoWeight): PangoWeight = a & b
    inline def |(b: PangoWeight): PangoWeight = a | b
    inline def is(b: PangoWeight): Boolean = (a & b) == b

opaque type PangoWrapMode = CUnsignedInt
object PangoWrapMode extends CEnumU[PangoWrapMode]:
  given _tag: Tag[PangoWrapMode] = Tag.UInt
  inline def define(inline a: Long): PangoWrapMode = a.toUInt
  val PANGO_WRAP_WORD = define(0)
  val PANGO_WRAP_CHAR = define(1)
  val PANGO_WRAP_WORD_CHAR = define(2)
  inline def getName(inline value: PangoWrapMode): Option[String] =
    value match
      case PANGO_WRAP_WORD => Some("PANGO_WRAP_WORD")
      case PANGO_WRAP_CHAR => Some("PANGO_WRAP_CHAR")
      case PANGO_WRAP_WORD_CHAR => Some("PANGO_WRAP_WORD_CHAR")
      case _ => None
  extension (a: PangoWrapMode)
    inline def &(b: PangoWrapMode): PangoWrapMode = a & b
    inline def |(b: PangoWrapMode): PangoWrapMode = a | b
    inline def is(b: PangoWrapMode): Boolean = (a & b) == b

opaque type _GTlsPasswordFlags = CUnsignedInt
object _GTlsPasswordFlags extends CEnumU[_GTlsPasswordFlags]:
  given _tag: Tag[_GTlsPasswordFlags] = Tag.UInt
  inline def define(inline a: Long): _GTlsPasswordFlags = a.toUInt
  val G_TLS_PASSWORD_NONE = define(0)
  val G_TLS_PASSWORD_RETRY = define(2)
  val G_TLS_PASSWORD_MANY_TRIES = define(4)
  val G_TLS_PASSWORD_FINAL_TRY = define(8)
  val G_TLS_PASSWORD_PKCS11_USER = define(16)
  val G_TLS_PASSWORD_PKCS11_SECURITY_OFFICER = define(32)
  val G_TLS_PASSWORD_PKCS11_CONTEXT_SPECIFIC = define(64)
  inline def getName(inline value: _GTlsPasswordFlags): Option[String] =
    value match
      case G_TLS_PASSWORD_NONE => Some("G_TLS_PASSWORD_NONE")
      case G_TLS_PASSWORD_RETRY => Some("G_TLS_PASSWORD_RETRY")
      case G_TLS_PASSWORD_MANY_TRIES => Some("G_TLS_PASSWORD_MANY_TRIES")
      case G_TLS_PASSWORD_FINAL_TRY => Some("G_TLS_PASSWORD_FINAL_TRY")
      case G_TLS_PASSWORD_PKCS11_USER => Some("G_TLS_PASSWORD_PKCS11_USER")
      case G_TLS_PASSWORD_PKCS11_SECURITY_OFFICER => Some("G_TLS_PASSWORD_PKCS11_SECURITY_OFFICER")
      case G_TLS_PASSWORD_PKCS11_CONTEXT_SPECIFIC => Some("G_TLS_PASSWORD_PKCS11_CONTEXT_SPECIFIC")
      case _ => None
  extension (a: _GTlsPasswordFlags)
    inline def &(b: _GTlsPasswordFlags): _GTlsPasswordFlags = a & b
    inline def |(b: _GTlsPasswordFlags): _GTlsPasswordFlags = a | b
    inline def is(b: _GTlsPasswordFlags): Boolean = (a & b) == b

opaque type _cairo_antialias = CUnsignedInt
object _cairo_antialias extends CEnumU[_cairo_antialias]:
  given _tag: Tag[_cairo_antialias] = Tag.UInt
  inline def define(inline a: Long): _cairo_antialias = a.toUInt
  val CAIRO_ANTIALIAS_DEFAULT = define(0)
  val CAIRO_ANTIALIAS_NONE = define(1)
  val CAIRO_ANTIALIAS_GRAY = define(2)
  val CAIRO_ANTIALIAS_SUBPIXEL = define(3)
  val CAIRO_ANTIALIAS_FAST = define(4)
  val CAIRO_ANTIALIAS_GOOD = define(5)
  val CAIRO_ANTIALIAS_BEST = define(6)
  inline def getName(inline value: _cairo_antialias): Option[String] =
    value match
      case CAIRO_ANTIALIAS_DEFAULT => Some("CAIRO_ANTIALIAS_DEFAULT")
      case CAIRO_ANTIALIAS_NONE => Some("CAIRO_ANTIALIAS_NONE")
      case CAIRO_ANTIALIAS_GRAY => Some("CAIRO_ANTIALIAS_GRAY")
      case CAIRO_ANTIALIAS_SUBPIXEL => Some("CAIRO_ANTIALIAS_SUBPIXEL")
      case CAIRO_ANTIALIAS_FAST => Some("CAIRO_ANTIALIAS_FAST")
      case CAIRO_ANTIALIAS_GOOD => Some("CAIRO_ANTIALIAS_GOOD")
      case CAIRO_ANTIALIAS_BEST => Some("CAIRO_ANTIALIAS_BEST")
      case _ => None
  extension (a: _cairo_antialias)
    inline def &(b: _cairo_antialias): _cairo_antialias = a & b
    inline def |(b: _cairo_antialias): _cairo_antialias = a | b
    inline def is(b: _cairo_antialias): Boolean = (a & b) == b

opaque type _cairo_content = CUnsignedInt
object _cairo_content extends CEnumU[_cairo_content]:
  given _tag: Tag[_cairo_content] = Tag.UInt
  inline def define(inline a: Long): _cairo_content = a.toUInt
  val CAIRO_CONTENT_COLOR = define(4096)
  val CAIRO_CONTENT_ALPHA = define(8192)
  val CAIRO_CONTENT_COLOR_ALPHA = define(12288)
  inline def getName(inline value: _cairo_content): Option[String] =
    value match
      case CAIRO_CONTENT_COLOR => Some("CAIRO_CONTENT_COLOR")
      case CAIRO_CONTENT_ALPHA => Some("CAIRO_CONTENT_ALPHA")
      case CAIRO_CONTENT_COLOR_ALPHA => Some("CAIRO_CONTENT_COLOR_ALPHA")
      case _ => None
  extension (a: _cairo_content)
    inline def &(b: _cairo_content): _cairo_content = a & b
    inline def |(b: _cairo_content): _cairo_content = a | b
    inline def is(b: _cairo_content): Boolean = (a & b) == b

opaque type _cairo_device_type = CInt
object _cairo_device_type extends CEnum[_cairo_device_type]:
  given _tag: Tag[_cairo_device_type] = Tag.Int
  inline def define(inline a: CInt): _cairo_device_type = a
  val CAIRO_DEVICE_TYPE_DRM = define(0)
  val CAIRO_DEVICE_TYPE_GL = define(1)
  val CAIRO_DEVICE_TYPE_SCRIPT = define(2)
  val CAIRO_DEVICE_TYPE_XCB = define(3)
  val CAIRO_DEVICE_TYPE_XLIB = define(4)
  val CAIRO_DEVICE_TYPE_XML = define(5)
  val CAIRO_DEVICE_TYPE_COGL = define(6)
  val CAIRO_DEVICE_TYPE_WIN32 = define(7)
  val CAIRO_DEVICE_TYPE_INVALID = define(-1)
  inline def getName(inline value: _cairo_device_type): Option[String] =
    value match
      case CAIRO_DEVICE_TYPE_DRM => Some("CAIRO_DEVICE_TYPE_DRM")
      case CAIRO_DEVICE_TYPE_GL => Some("CAIRO_DEVICE_TYPE_GL")
      case CAIRO_DEVICE_TYPE_SCRIPT => Some("CAIRO_DEVICE_TYPE_SCRIPT")
      case CAIRO_DEVICE_TYPE_XCB => Some("CAIRO_DEVICE_TYPE_XCB")
      case CAIRO_DEVICE_TYPE_XLIB => Some("CAIRO_DEVICE_TYPE_XLIB")
      case CAIRO_DEVICE_TYPE_XML => Some("CAIRO_DEVICE_TYPE_XML")
      case CAIRO_DEVICE_TYPE_COGL => Some("CAIRO_DEVICE_TYPE_COGL")
      case CAIRO_DEVICE_TYPE_WIN32 => Some("CAIRO_DEVICE_TYPE_WIN32")
      case CAIRO_DEVICE_TYPE_INVALID => Some("CAIRO_DEVICE_TYPE_INVALID")
      case _ => None
  extension (a: _cairo_device_type)
    inline def &(b: _cairo_device_type): _cairo_device_type = a & b
    inline def |(b: _cairo_device_type): _cairo_device_type = a | b
    inline def is(b: _cairo_device_type): Boolean = (a & b) == b

opaque type _cairo_extend = CUnsignedInt
object _cairo_extend extends CEnumU[_cairo_extend]:
  given _tag: Tag[_cairo_extend] = Tag.UInt
  inline def define(inline a: Long): _cairo_extend = a.toUInt
  val CAIRO_EXTEND_NONE = define(0)
  val CAIRO_EXTEND_REPEAT = define(1)
  val CAIRO_EXTEND_REFLECT = define(2)
  val CAIRO_EXTEND_PAD = define(3)
  inline def getName(inline value: _cairo_extend): Option[String] =
    value match
      case CAIRO_EXTEND_NONE => Some("CAIRO_EXTEND_NONE")
      case CAIRO_EXTEND_REPEAT => Some("CAIRO_EXTEND_REPEAT")
      case CAIRO_EXTEND_REFLECT => Some("CAIRO_EXTEND_REFLECT")
      case CAIRO_EXTEND_PAD => Some("CAIRO_EXTEND_PAD")
      case _ => None
  extension (a: _cairo_extend)
    inline def &(b: _cairo_extend): _cairo_extend = a & b
    inline def |(b: _cairo_extend): _cairo_extend = a | b
    inline def is(b: _cairo_extend): Boolean = (a & b) == b

opaque type _cairo_fill_rule = CUnsignedInt
object _cairo_fill_rule extends CEnumU[_cairo_fill_rule]:
  given _tag: Tag[_cairo_fill_rule] = Tag.UInt
  inline def define(inline a: Long): _cairo_fill_rule = a.toUInt
  val CAIRO_FILL_RULE_WINDING = define(0)
  val CAIRO_FILL_RULE_EVEN_ODD = define(1)
  inline def getName(inline value: _cairo_fill_rule): Option[String] =
    value match
      case CAIRO_FILL_RULE_WINDING => Some("CAIRO_FILL_RULE_WINDING")
      case CAIRO_FILL_RULE_EVEN_ODD => Some("CAIRO_FILL_RULE_EVEN_ODD")
      case _ => None
  extension (a: _cairo_fill_rule)
    inline def &(b: _cairo_fill_rule): _cairo_fill_rule = a & b
    inline def |(b: _cairo_fill_rule): _cairo_fill_rule = a | b
    inline def is(b: _cairo_fill_rule): Boolean = (a & b) == b

opaque type _cairo_filter = CUnsignedInt
object _cairo_filter extends CEnumU[_cairo_filter]:
  given _tag: Tag[_cairo_filter] = Tag.UInt
  inline def define(inline a: Long): _cairo_filter = a.toUInt
  val CAIRO_FILTER_FAST = define(0)
  val CAIRO_FILTER_GOOD = define(1)
  val CAIRO_FILTER_BEST = define(2)
  val CAIRO_FILTER_NEAREST = define(3)
  val CAIRO_FILTER_BILINEAR = define(4)
  val CAIRO_FILTER_GAUSSIAN = define(5)
  inline def getName(inline value: _cairo_filter): Option[String] =
    value match
      case CAIRO_FILTER_FAST => Some("CAIRO_FILTER_FAST")
      case CAIRO_FILTER_GOOD => Some("CAIRO_FILTER_GOOD")
      case CAIRO_FILTER_BEST => Some("CAIRO_FILTER_BEST")
      case CAIRO_FILTER_NEAREST => Some("CAIRO_FILTER_NEAREST")
      case CAIRO_FILTER_BILINEAR => Some("CAIRO_FILTER_BILINEAR")
      case CAIRO_FILTER_GAUSSIAN => Some("CAIRO_FILTER_GAUSSIAN")
      case _ => None
  extension (a: _cairo_filter)
    inline def &(b: _cairo_filter): _cairo_filter = a & b
    inline def |(b: _cairo_filter): _cairo_filter = a | b
    inline def is(b: _cairo_filter): Boolean = (a & b) == b

opaque type _cairo_font_slant = CUnsignedInt
object _cairo_font_slant extends CEnumU[_cairo_font_slant]:
  given _tag: Tag[_cairo_font_slant] = Tag.UInt
  inline def define(inline a: Long): _cairo_font_slant = a.toUInt
  val CAIRO_FONT_SLANT_NORMAL = define(0)
  val CAIRO_FONT_SLANT_ITALIC = define(1)
  val CAIRO_FONT_SLANT_OBLIQUE = define(2)
  inline def getName(inline value: _cairo_font_slant): Option[String] =
    value match
      case CAIRO_FONT_SLANT_NORMAL => Some("CAIRO_FONT_SLANT_NORMAL")
      case CAIRO_FONT_SLANT_ITALIC => Some("CAIRO_FONT_SLANT_ITALIC")
      case CAIRO_FONT_SLANT_OBLIQUE => Some("CAIRO_FONT_SLANT_OBLIQUE")
      case _ => None
  extension (a: _cairo_font_slant)
    inline def &(b: _cairo_font_slant): _cairo_font_slant = a & b
    inline def |(b: _cairo_font_slant): _cairo_font_slant = a | b
    inline def is(b: _cairo_font_slant): Boolean = (a & b) == b

opaque type _cairo_font_type = CUnsignedInt
object _cairo_font_type extends CEnumU[_cairo_font_type]:
  given _tag: Tag[_cairo_font_type] = Tag.UInt
  inline def define(inline a: Long): _cairo_font_type = a.toUInt
  val CAIRO_FONT_TYPE_TOY = define(0)
  val CAIRO_FONT_TYPE_FT = define(1)
  val CAIRO_FONT_TYPE_WIN32 = define(2)
  val CAIRO_FONT_TYPE_QUARTZ = define(3)
  val CAIRO_FONT_TYPE_USER = define(4)
  inline def getName(inline value: _cairo_font_type): Option[String] =
    value match
      case CAIRO_FONT_TYPE_TOY => Some("CAIRO_FONT_TYPE_TOY")
      case CAIRO_FONT_TYPE_FT => Some("CAIRO_FONT_TYPE_FT")
      case CAIRO_FONT_TYPE_WIN32 => Some("CAIRO_FONT_TYPE_WIN32")
      case CAIRO_FONT_TYPE_QUARTZ => Some("CAIRO_FONT_TYPE_QUARTZ")
      case CAIRO_FONT_TYPE_USER => Some("CAIRO_FONT_TYPE_USER")
      case _ => None
  extension (a: _cairo_font_type)
    inline def &(b: _cairo_font_type): _cairo_font_type = a & b
    inline def |(b: _cairo_font_type): _cairo_font_type = a | b
    inline def is(b: _cairo_font_type): Boolean = (a & b) == b

opaque type _cairo_font_weight = CUnsignedInt
object _cairo_font_weight extends CEnumU[_cairo_font_weight]:
  given _tag: Tag[_cairo_font_weight] = Tag.UInt
  inline def define(inline a: Long): _cairo_font_weight = a.toUInt
  val CAIRO_FONT_WEIGHT_NORMAL = define(0)
  val CAIRO_FONT_WEIGHT_BOLD = define(1)
  inline def getName(inline value: _cairo_font_weight): Option[String] =
    value match
      case CAIRO_FONT_WEIGHT_NORMAL => Some("CAIRO_FONT_WEIGHT_NORMAL")
      case CAIRO_FONT_WEIGHT_BOLD => Some("CAIRO_FONT_WEIGHT_BOLD")
      case _ => None
  extension (a: _cairo_font_weight)
    inline def &(b: _cairo_font_weight): _cairo_font_weight = a & b
    inline def |(b: _cairo_font_weight): _cairo_font_weight = a | b
    inline def is(b: _cairo_font_weight): Boolean = (a & b) == b

opaque type _cairo_format = CInt
object _cairo_format extends CEnum[_cairo_format]:
  given _tag: Tag[_cairo_format] = Tag.Int
  inline def define(inline a: CInt): _cairo_format = a
  val CAIRO_FORMAT_INVALID = define(-1)
  val CAIRO_FORMAT_ARGB32 = define(0)
  val CAIRO_FORMAT_RGB24 = define(1)
  val CAIRO_FORMAT_A8 = define(2)
  val CAIRO_FORMAT_A1 = define(3)
  val CAIRO_FORMAT_RGB16_565 = define(4)
  val CAIRO_FORMAT_RGB30 = define(5)
  inline def getName(inline value: _cairo_format): Option[String] =
    value match
      case CAIRO_FORMAT_INVALID => Some("CAIRO_FORMAT_INVALID")
      case CAIRO_FORMAT_ARGB32 => Some("CAIRO_FORMAT_ARGB32")
      case CAIRO_FORMAT_RGB24 => Some("CAIRO_FORMAT_RGB24")
      case CAIRO_FORMAT_A8 => Some("CAIRO_FORMAT_A8")
      case CAIRO_FORMAT_A1 => Some("CAIRO_FORMAT_A1")
      case CAIRO_FORMAT_RGB16_565 => Some("CAIRO_FORMAT_RGB16_565")
      case CAIRO_FORMAT_RGB30 => Some("CAIRO_FORMAT_RGB30")
      case _ => None
  extension (a: _cairo_format)
    inline def &(b: _cairo_format): _cairo_format = a & b
    inline def |(b: _cairo_format): _cairo_format = a | b
    inline def is(b: _cairo_format): Boolean = (a & b) == b

opaque type _cairo_hint_metrics = CUnsignedInt
object _cairo_hint_metrics extends CEnumU[_cairo_hint_metrics]:
  given _tag: Tag[_cairo_hint_metrics] = Tag.UInt
  inline def define(inline a: Long): _cairo_hint_metrics = a.toUInt
  val CAIRO_HINT_METRICS_DEFAULT = define(0)
  val CAIRO_HINT_METRICS_OFF = define(1)
  val CAIRO_HINT_METRICS_ON = define(2)
  inline def getName(inline value: _cairo_hint_metrics): Option[String] =
    value match
      case CAIRO_HINT_METRICS_DEFAULT => Some("CAIRO_HINT_METRICS_DEFAULT")
      case CAIRO_HINT_METRICS_OFF => Some("CAIRO_HINT_METRICS_OFF")
      case CAIRO_HINT_METRICS_ON => Some("CAIRO_HINT_METRICS_ON")
      case _ => None
  extension (a: _cairo_hint_metrics)
    inline def &(b: _cairo_hint_metrics): _cairo_hint_metrics = a & b
    inline def |(b: _cairo_hint_metrics): _cairo_hint_metrics = a | b
    inline def is(b: _cairo_hint_metrics): Boolean = (a & b) == b

opaque type _cairo_hint_style = CUnsignedInt
object _cairo_hint_style extends CEnumU[_cairo_hint_style]:
  given _tag: Tag[_cairo_hint_style] = Tag.UInt
  inline def define(inline a: Long): _cairo_hint_style = a.toUInt
  val CAIRO_HINT_STYLE_DEFAULT = define(0)
  val CAIRO_HINT_STYLE_NONE = define(1)
  val CAIRO_HINT_STYLE_SLIGHT = define(2)
  val CAIRO_HINT_STYLE_MEDIUM = define(3)
  val CAIRO_HINT_STYLE_FULL = define(4)
  inline def getName(inline value: _cairo_hint_style): Option[String] =
    value match
      case CAIRO_HINT_STYLE_DEFAULT => Some("CAIRO_HINT_STYLE_DEFAULT")
      case CAIRO_HINT_STYLE_NONE => Some("CAIRO_HINT_STYLE_NONE")
      case CAIRO_HINT_STYLE_SLIGHT => Some("CAIRO_HINT_STYLE_SLIGHT")
      case CAIRO_HINT_STYLE_MEDIUM => Some("CAIRO_HINT_STYLE_MEDIUM")
      case CAIRO_HINT_STYLE_FULL => Some("CAIRO_HINT_STYLE_FULL")
      case _ => None
  extension (a: _cairo_hint_style)
    inline def &(b: _cairo_hint_style): _cairo_hint_style = a & b
    inline def |(b: _cairo_hint_style): _cairo_hint_style = a | b
    inline def is(b: _cairo_hint_style): Boolean = (a & b) == b

opaque type _cairo_line_cap = CUnsignedInt
object _cairo_line_cap extends CEnumU[_cairo_line_cap]:
  given _tag: Tag[_cairo_line_cap] = Tag.UInt
  inline def define(inline a: Long): _cairo_line_cap = a.toUInt
  val CAIRO_LINE_CAP_BUTT = define(0)
  val CAIRO_LINE_CAP_ROUND = define(1)
  val CAIRO_LINE_CAP_SQUARE = define(2)
  inline def getName(inline value: _cairo_line_cap): Option[String] =
    value match
      case CAIRO_LINE_CAP_BUTT => Some("CAIRO_LINE_CAP_BUTT")
      case CAIRO_LINE_CAP_ROUND => Some("CAIRO_LINE_CAP_ROUND")
      case CAIRO_LINE_CAP_SQUARE => Some("CAIRO_LINE_CAP_SQUARE")
      case _ => None
  extension (a: _cairo_line_cap)
    inline def &(b: _cairo_line_cap): _cairo_line_cap = a & b
    inline def |(b: _cairo_line_cap): _cairo_line_cap = a | b
    inline def is(b: _cairo_line_cap): Boolean = (a & b) == b

opaque type _cairo_line_join = CUnsignedInt
object _cairo_line_join extends CEnumU[_cairo_line_join]:
  given _tag: Tag[_cairo_line_join] = Tag.UInt
  inline def define(inline a: Long): _cairo_line_join = a.toUInt
  val CAIRO_LINE_JOIN_MITER = define(0)
  val CAIRO_LINE_JOIN_ROUND = define(1)
  val CAIRO_LINE_JOIN_BEVEL = define(2)
  inline def getName(inline value: _cairo_line_join): Option[String] =
    value match
      case CAIRO_LINE_JOIN_MITER => Some("CAIRO_LINE_JOIN_MITER")
      case CAIRO_LINE_JOIN_ROUND => Some("CAIRO_LINE_JOIN_ROUND")
      case CAIRO_LINE_JOIN_BEVEL => Some("CAIRO_LINE_JOIN_BEVEL")
      case _ => None
  extension (a: _cairo_line_join)
    inline def &(b: _cairo_line_join): _cairo_line_join = a & b
    inline def |(b: _cairo_line_join): _cairo_line_join = a | b
    inline def is(b: _cairo_line_join): Boolean = (a & b) == b

opaque type _cairo_operator = CUnsignedInt
object _cairo_operator extends CEnumU[_cairo_operator]:
  given _tag: Tag[_cairo_operator] = Tag.UInt
  inline def define(inline a: Long): _cairo_operator = a.toUInt
  val CAIRO_OPERATOR_CLEAR = define(0)
  val CAIRO_OPERATOR_SOURCE = define(1)
  val CAIRO_OPERATOR_OVER = define(2)
  val CAIRO_OPERATOR_IN = define(3)
  val CAIRO_OPERATOR_OUT = define(4)
  val CAIRO_OPERATOR_ATOP = define(5)
  val CAIRO_OPERATOR_DEST = define(6)
  val CAIRO_OPERATOR_DEST_OVER = define(7)
  val CAIRO_OPERATOR_DEST_IN = define(8)
  val CAIRO_OPERATOR_DEST_OUT = define(9)
  val CAIRO_OPERATOR_DEST_ATOP = define(10)
  val CAIRO_OPERATOR_XOR = define(11)
  val CAIRO_OPERATOR_ADD = define(12)
  val CAIRO_OPERATOR_SATURATE = define(13)
  val CAIRO_OPERATOR_MULTIPLY = define(14)
  val CAIRO_OPERATOR_SCREEN = define(15)
  val CAIRO_OPERATOR_OVERLAY = define(16)
  val CAIRO_OPERATOR_DARKEN = define(17)
  val CAIRO_OPERATOR_LIGHTEN = define(18)
  val CAIRO_OPERATOR_COLOR_DODGE = define(19)
  val CAIRO_OPERATOR_COLOR_BURN = define(20)
  val CAIRO_OPERATOR_HARD_LIGHT = define(21)
  val CAIRO_OPERATOR_SOFT_LIGHT = define(22)
  val CAIRO_OPERATOR_DIFFERENCE = define(23)
  val CAIRO_OPERATOR_EXCLUSION = define(24)
  val CAIRO_OPERATOR_HSL_HUE = define(25)
  val CAIRO_OPERATOR_HSL_SATURATION = define(26)
  val CAIRO_OPERATOR_HSL_COLOR = define(27)
  val CAIRO_OPERATOR_HSL_LUMINOSITY = define(28)
  inline def getName(inline value: _cairo_operator): Option[String] =
    value match
      case CAIRO_OPERATOR_CLEAR => Some("CAIRO_OPERATOR_CLEAR")
      case CAIRO_OPERATOR_SOURCE => Some("CAIRO_OPERATOR_SOURCE")
      case CAIRO_OPERATOR_OVER => Some("CAIRO_OPERATOR_OVER")
      case CAIRO_OPERATOR_IN => Some("CAIRO_OPERATOR_IN")
      case CAIRO_OPERATOR_OUT => Some("CAIRO_OPERATOR_OUT")
      case CAIRO_OPERATOR_ATOP => Some("CAIRO_OPERATOR_ATOP")
      case CAIRO_OPERATOR_DEST => Some("CAIRO_OPERATOR_DEST")
      case CAIRO_OPERATOR_DEST_OVER => Some("CAIRO_OPERATOR_DEST_OVER")
      case CAIRO_OPERATOR_DEST_IN => Some("CAIRO_OPERATOR_DEST_IN")
      case CAIRO_OPERATOR_DEST_OUT => Some("CAIRO_OPERATOR_DEST_OUT")
      case CAIRO_OPERATOR_DEST_ATOP => Some("CAIRO_OPERATOR_DEST_ATOP")
      case CAIRO_OPERATOR_XOR => Some("CAIRO_OPERATOR_XOR")
      case CAIRO_OPERATOR_ADD => Some("CAIRO_OPERATOR_ADD")
      case CAIRO_OPERATOR_SATURATE => Some("CAIRO_OPERATOR_SATURATE")
      case CAIRO_OPERATOR_MULTIPLY => Some("CAIRO_OPERATOR_MULTIPLY")
      case CAIRO_OPERATOR_SCREEN => Some("CAIRO_OPERATOR_SCREEN")
      case CAIRO_OPERATOR_OVERLAY => Some("CAIRO_OPERATOR_OVERLAY")
      case CAIRO_OPERATOR_DARKEN => Some("CAIRO_OPERATOR_DARKEN")
      case CAIRO_OPERATOR_LIGHTEN => Some("CAIRO_OPERATOR_LIGHTEN")
      case CAIRO_OPERATOR_COLOR_DODGE => Some("CAIRO_OPERATOR_COLOR_DODGE")
      case CAIRO_OPERATOR_COLOR_BURN => Some("CAIRO_OPERATOR_COLOR_BURN")
      case CAIRO_OPERATOR_HARD_LIGHT => Some("CAIRO_OPERATOR_HARD_LIGHT")
      case CAIRO_OPERATOR_SOFT_LIGHT => Some("CAIRO_OPERATOR_SOFT_LIGHT")
      case CAIRO_OPERATOR_DIFFERENCE => Some("CAIRO_OPERATOR_DIFFERENCE")
      case CAIRO_OPERATOR_EXCLUSION => Some("CAIRO_OPERATOR_EXCLUSION")
      case CAIRO_OPERATOR_HSL_HUE => Some("CAIRO_OPERATOR_HSL_HUE")
      case CAIRO_OPERATOR_HSL_SATURATION => Some("CAIRO_OPERATOR_HSL_SATURATION")
      case CAIRO_OPERATOR_HSL_COLOR => Some("CAIRO_OPERATOR_HSL_COLOR")
      case CAIRO_OPERATOR_HSL_LUMINOSITY => Some("CAIRO_OPERATOR_HSL_LUMINOSITY")
      case _ => None
  extension (a: _cairo_operator)
    inline def &(b: _cairo_operator): _cairo_operator = a & b
    inline def |(b: _cairo_operator): _cairo_operator = a | b
    inline def is(b: _cairo_operator): Boolean = (a & b) == b

opaque type _cairo_path_data_type = CUnsignedInt
object _cairo_path_data_type extends CEnumU[_cairo_path_data_type]:
  given _tag: Tag[_cairo_path_data_type] = Tag.UInt
  inline def define(inline a: Long): _cairo_path_data_type = a.toUInt
  val CAIRO_PATH_MOVE_TO = define(0)
  val CAIRO_PATH_LINE_TO = define(1)
  val CAIRO_PATH_CURVE_TO = define(2)
  val CAIRO_PATH_CLOSE_PATH = define(3)
  inline def getName(inline value: _cairo_path_data_type): Option[String] =
    value match
      case CAIRO_PATH_MOVE_TO => Some("CAIRO_PATH_MOVE_TO")
      case CAIRO_PATH_LINE_TO => Some("CAIRO_PATH_LINE_TO")
      case CAIRO_PATH_CURVE_TO => Some("CAIRO_PATH_CURVE_TO")
      case CAIRO_PATH_CLOSE_PATH => Some("CAIRO_PATH_CLOSE_PATH")
      case _ => None
  extension (a: _cairo_path_data_type)
    inline def &(b: _cairo_path_data_type): _cairo_path_data_type = a & b
    inline def |(b: _cairo_path_data_type): _cairo_path_data_type = a | b
    inline def is(b: _cairo_path_data_type): Boolean = (a & b) == b

opaque type _cairo_pattern_type = CUnsignedInt
object _cairo_pattern_type extends CEnumU[_cairo_pattern_type]:
  given _tag: Tag[_cairo_pattern_type] = Tag.UInt
  inline def define(inline a: Long): _cairo_pattern_type = a.toUInt
  val CAIRO_PATTERN_TYPE_SOLID = define(0)
  val CAIRO_PATTERN_TYPE_SURFACE = define(1)
  val CAIRO_PATTERN_TYPE_LINEAR = define(2)
  val CAIRO_PATTERN_TYPE_RADIAL = define(3)
  val CAIRO_PATTERN_TYPE_MESH = define(4)
  val CAIRO_PATTERN_TYPE_RASTER_SOURCE = define(5)
  inline def getName(inline value: _cairo_pattern_type): Option[String] =
    value match
      case CAIRO_PATTERN_TYPE_SOLID => Some("CAIRO_PATTERN_TYPE_SOLID")
      case CAIRO_PATTERN_TYPE_SURFACE => Some("CAIRO_PATTERN_TYPE_SURFACE")
      case CAIRO_PATTERN_TYPE_LINEAR => Some("CAIRO_PATTERN_TYPE_LINEAR")
      case CAIRO_PATTERN_TYPE_RADIAL => Some("CAIRO_PATTERN_TYPE_RADIAL")
      case CAIRO_PATTERN_TYPE_MESH => Some("CAIRO_PATTERN_TYPE_MESH")
      case CAIRO_PATTERN_TYPE_RASTER_SOURCE => Some("CAIRO_PATTERN_TYPE_RASTER_SOURCE")
      case _ => None
  extension (a: _cairo_pattern_type)
    inline def &(b: _cairo_pattern_type): _cairo_pattern_type = a & b
    inline def |(b: _cairo_pattern_type): _cairo_pattern_type = a | b
    inline def is(b: _cairo_pattern_type): Boolean = (a & b) == b

opaque type _cairo_region_overlap = CUnsignedInt
object _cairo_region_overlap extends CEnumU[_cairo_region_overlap]:
  given _tag: Tag[_cairo_region_overlap] = Tag.UInt
  inline def define(inline a: Long): _cairo_region_overlap = a.toUInt
  val CAIRO_REGION_OVERLAP_IN = define(0)
  val CAIRO_REGION_OVERLAP_OUT = define(1)
  val CAIRO_REGION_OVERLAP_PART = define(2)
  inline def getName(inline value: _cairo_region_overlap): Option[String] =
    value match
      case CAIRO_REGION_OVERLAP_IN => Some("CAIRO_REGION_OVERLAP_IN")
      case CAIRO_REGION_OVERLAP_OUT => Some("CAIRO_REGION_OVERLAP_OUT")
      case CAIRO_REGION_OVERLAP_PART => Some("CAIRO_REGION_OVERLAP_PART")
      case _ => None
  extension (a: _cairo_region_overlap)
    inline def &(b: _cairo_region_overlap): _cairo_region_overlap = a & b
    inline def |(b: _cairo_region_overlap): _cairo_region_overlap = a | b
    inline def is(b: _cairo_region_overlap): Boolean = (a & b) == b

opaque type _cairo_status = CUnsignedInt
object _cairo_status extends CEnumU[_cairo_status]:
  given _tag: Tag[_cairo_status] = Tag.UInt
  inline def define(inline a: Long): _cairo_status = a.toUInt
  val CAIRO_STATUS_SUCCESS = define(0)
  val CAIRO_STATUS_NO_MEMORY = define(1)
  val CAIRO_STATUS_INVALID_RESTORE = define(2)
  val CAIRO_STATUS_INVALID_POP_GROUP = define(3)
  val CAIRO_STATUS_NO_CURRENT_POINT = define(4)
  val CAIRO_STATUS_INVALID_MATRIX = define(5)
  val CAIRO_STATUS_INVALID_STATUS = define(6)
  val CAIRO_STATUS_NULL_POINTER = define(7)
  val CAIRO_STATUS_INVALID_STRING = define(8)
  val CAIRO_STATUS_INVALID_PATH_DATA = define(9)
  val CAIRO_STATUS_READ_ERROR = define(10)
  val CAIRO_STATUS_WRITE_ERROR = define(11)
  val CAIRO_STATUS_SURFACE_FINISHED = define(12)
  val CAIRO_STATUS_SURFACE_TYPE_MISMATCH = define(13)
  val CAIRO_STATUS_PATTERN_TYPE_MISMATCH = define(14)
  val CAIRO_STATUS_INVALID_CONTENT = define(15)
  val CAIRO_STATUS_INVALID_FORMAT = define(16)
  val CAIRO_STATUS_INVALID_VISUAL = define(17)
  val CAIRO_STATUS_FILE_NOT_FOUND = define(18)
  val CAIRO_STATUS_INVALID_DASH = define(19)
  val CAIRO_STATUS_INVALID_DSC_COMMENT = define(20)
  val CAIRO_STATUS_INVALID_INDEX = define(21)
  val CAIRO_STATUS_CLIP_NOT_REPRESENTABLE = define(22)
  val CAIRO_STATUS_TEMP_FILE_ERROR = define(23)
  val CAIRO_STATUS_INVALID_STRIDE = define(24)
  val CAIRO_STATUS_FONT_TYPE_MISMATCH = define(25)
  val CAIRO_STATUS_USER_FONT_IMMUTABLE = define(26)
  val CAIRO_STATUS_USER_FONT_ERROR = define(27)
  val CAIRO_STATUS_NEGATIVE_COUNT = define(28)
  val CAIRO_STATUS_INVALID_CLUSTERS = define(29)
  val CAIRO_STATUS_INVALID_SLANT = define(30)
  val CAIRO_STATUS_INVALID_WEIGHT = define(31)
  val CAIRO_STATUS_INVALID_SIZE = define(32)
  val CAIRO_STATUS_USER_FONT_NOT_IMPLEMENTED = define(33)
  val CAIRO_STATUS_DEVICE_TYPE_MISMATCH = define(34)
  val CAIRO_STATUS_DEVICE_ERROR = define(35)
  val CAIRO_STATUS_INVALID_MESH_CONSTRUCTION = define(36)
  val CAIRO_STATUS_DEVICE_FINISHED = define(37)
  val CAIRO_STATUS_JBIG2_GLOBAL_MISSING = define(38)
  val CAIRO_STATUS_PNG_ERROR = define(39)
  val CAIRO_STATUS_FREETYPE_ERROR = define(40)
  val CAIRO_STATUS_WIN32_GDI_ERROR = define(41)
  val CAIRO_STATUS_TAG_ERROR = define(42)
  val CAIRO_STATUS_LAST_STATUS = define(43)
  inline def getName(inline value: _cairo_status): Option[String] =
    value match
      case CAIRO_STATUS_SUCCESS => Some("CAIRO_STATUS_SUCCESS")
      case CAIRO_STATUS_NO_MEMORY => Some("CAIRO_STATUS_NO_MEMORY")
      case CAIRO_STATUS_INVALID_RESTORE => Some("CAIRO_STATUS_INVALID_RESTORE")
      case CAIRO_STATUS_INVALID_POP_GROUP => Some("CAIRO_STATUS_INVALID_POP_GROUP")
      case CAIRO_STATUS_NO_CURRENT_POINT => Some("CAIRO_STATUS_NO_CURRENT_POINT")
      case CAIRO_STATUS_INVALID_MATRIX => Some("CAIRO_STATUS_INVALID_MATRIX")
      case CAIRO_STATUS_INVALID_STATUS => Some("CAIRO_STATUS_INVALID_STATUS")
      case CAIRO_STATUS_NULL_POINTER => Some("CAIRO_STATUS_NULL_POINTER")
      case CAIRO_STATUS_INVALID_STRING => Some("CAIRO_STATUS_INVALID_STRING")
      case CAIRO_STATUS_INVALID_PATH_DATA => Some("CAIRO_STATUS_INVALID_PATH_DATA")
      case CAIRO_STATUS_READ_ERROR => Some("CAIRO_STATUS_READ_ERROR")
      case CAIRO_STATUS_WRITE_ERROR => Some("CAIRO_STATUS_WRITE_ERROR")
      case CAIRO_STATUS_SURFACE_FINISHED => Some("CAIRO_STATUS_SURFACE_FINISHED")
      case CAIRO_STATUS_SURFACE_TYPE_MISMATCH => Some("CAIRO_STATUS_SURFACE_TYPE_MISMATCH")
      case CAIRO_STATUS_PATTERN_TYPE_MISMATCH => Some("CAIRO_STATUS_PATTERN_TYPE_MISMATCH")
      case CAIRO_STATUS_INVALID_CONTENT => Some("CAIRO_STATUS_INVALID_CONTENT")
      case CAIRO_STATUS_INVALID_FORMAT => Some("CAIRO_STATUS_INVALID_FORMAT")
      case CAIRO_STATUS_INVALID_VISUAL => Some("CAIRO_STATUS_INVALID_VISUAL")
      case CAIRO_STATUS_FILE_NOT_FOUND => Some("CAIRO_STATUS_FILE_NOT_FOUND")
      case CAIRO_STATUS_INVALID_DASH => Some("CAIRO_STATUS_INVALID_DASH")
      case CAIRO_STATUS_INVALID_DSC_COMMENT => Some("CAIRO_STATUS_INVALID_DSC_COMMENT")
      case CAIRO_STATUS_INVALID_INDEX => Some("CAIRO_STATUS_INVALID_INDEX")
      case CAIRO_STATUS_CLIP_NOT_REPRESENTABLE => Some("CAIRO_STATUS_CLIP_NOT_REPRESENTABLE")
      case CAIRO_STATUS_TEMP_FILE_ERROR => Some("CAIRO_STATUS_TEMP_FILE_ERROR")
      case CAIRO_STATUS_INVALID_STRIDE => Some("CAIRO_STATUS_INVALID_STRIDE")
      case CAIRO_STATUS_FONT_TYPE_MISMATCH => Some("CAIRO_STATUS_FONT_TYPE_MISMATCH")
      case CAIRO_STATUS_USER_FONT_IMMUTABLE => Some("CAIRO_STATUS_USER_FONT_IMMUTABLE")
      case CAIRO_STATUS_USER_FONT_ERROR => Some("CAIRO_STATUS_USER_FONT_ERROR")
      case CAIRO_STATUS_NEGATIVE_COUNT => Some("CAIRO_STATUS_NEGATIVE_COUNT")
      case CAIRO_STATUS_INVALID_CLUSTERS => Some("CAIRO_STATUS_INVALID_CLUSTERS")
      case CAIRO_STATUS_INVALID_SLANT => Some("CAIRO_STATUS_INVALID_SLANT")
      case CAIRO_STATUS_INVALID_WEIGHT => Some("CAIRO_STATUS_INVALID_WEIGHT")
      case CAIRO_STATUS_INVALID_SIZE => Some("CAIRO_STATUS_INVALID_SIZE")
      case CAIRO_STATUS_USER_FONT_NOT_IMPLEMENTED => Some("CAIRO_STATUS_USER_FONT_NOT_IMPLEMENTED")
      case CAIRO_STATUS_DEVICE_TYPE_MISMATCH => Some("CAIRO_STATUS_DEVICE_TYPE_MISMATCH")
      case CAIRO_STATUS_DEVICE_ERROR => Some("CAIRO_STATUS_DEVICE_ERROR")
      case CAIRO_STATUS_INVALID_MESH_CONSTRUCTION => Some("CAIRO_STATUS_INVALID_MESH_CONSTRUCTION")
      case CAIRO_STATUS_DEVICE_FINISHED => Some("CAIRO_STATUS_DEVICE_FINISHED")
      case CAIRO_STATUS_JBIG2_GLOBAL_MISSING => Some("CAIRO_STATUS_JBIG2_GLOBAL_MISSING")
      case CAIRO_STATUS_PNG_ERROR => Some("CAIRO_STATUS_PNG_ERROR")
      case CAIRO_STATUS_FREETYPE_ERROR => Some("CAIRO_STATUS_FREETYPE_ERROR")
      case CAIRO_STATUS_WIN32_GDI_ERROR => Some("CAIRO_STATUS_WIN32_GDI_ERROR")
      case CAIRO_STATUS_TAG_ERROR => Some("CAIRO_STATUS_TAG_ERROR")
      case CAIRO_STATUS_LAST_STATUS => Some("CAIRO_STATUS_LAST_STATUS")
      case _ => None
  extension (a: _cairo_status)
    inline def &(b: _cairo_status): _cairo_status = a & b
    inline def |(b: _cairo_status): _cairo_status = a | b
    inline def is(b: _cairo_status): Boolean = (a & b) == b

opaque type _cairo_subpixel_order = CUnsignedInt
object _cairo_subpixel_order extends CEnumU[_cairo_subpixel_order]:
  given _tag: Tag[_cairo_subpixel_order] = Tag.UInt
  inline def define(inline a: Long): _cairo_subpixel_order = a.toUInt
  val CAIRO_SUBPIXEL_ORDER_DEFAULT = define(0)
  val CAIRO_SUBPIXEL_ORDER_RGB = define(1)
  val CAIRO_SUBPIXEL_ORDER_BGR = define(2)
  val CAIRO_SUBPIXEL_ORDER_VRGB = define(3)
  val CAIRO_SUBPIXEL_ORDER_VBGR = define(4)
  inline def getName(inline value: _cairo_subpixel_order): Option[String] =
    value match
      case CAIRO_SUBPIXEL_ORDER_DEFAULT => Some("CAIRO_SUBPIXEL_ORDER_DEFAULT")
      case CAIRO_SUBPIXEL_ORDER_RGB => Some("CAIRO_SUBPIXEL_ORDER_RGB")
      case CAIRO_SUBPIXEL_ORDER_BGR => Some("CAIRO_SUBPIXEL_ORDER_BGR")
      case CAIRO_SUBPIXEL_ORDER_VRGB => Some("CAIRO_SUBPIXEL_ORDER_VRGB")
      case CAIRO_SUBPIXEL_ORDER_VBGR => Some("CAIRO_SUBPIXEL_ORDER_VBGR")
      case _ => None
  extension (a: _cairo_subpixel_order)
    inline def &(b: _cairo_subpixel_order): _cairo_subpixel_order = a & b
    inline def |(b: _cairo_subpixel_order): _cairo_subpixel_order = a | b
    inline def is(b: _cairo_subpixel_order): Boolean = (a & b) == b

opaque type _cairo_surface_type = CUnsignedInt
object _cairo_surface_type extends CEnumU[_cairo_surface_type]:
  given _tag: Tag[_cairo_surface_type] = Tag.UInt
  inline def define(inline a: Long): _cairo_surface_type = a.toUInt
  val CAIRO_SURFACE_TYPE_IMAGE = define(0)
  val CAIRO_SURFACE_TYPE_PDF = define(1)
  val CAIRO_SURFACE_TYPE_PS = define(2)
  val CAIRO_SURFACE_TYPE_XLIB = define(3)
  val CAIRO_SURFACE_TYPE_XCB = define(4)
  val CAIRO_SURFACE_TYPE_GLITZ = define(5)
  val CAIRO_SURFACE_TYPE_QUARTZ = define(6)
  val CAIRO_SURFACE_TYPE_WIN32 = define(7)
  val CAIRO_SURFACE_TYPE_BEOS = define(8)
  val CAIRO_SURFACE_TYPE_DIRECTFB = define(9)
  val CAIRO_SURFACE_TYPE_SVG = define(10)
  val CAIRO_SURFACE_TYPE_OS2 = define(11)
  val CAIRO_SURFACE_TYPE_WIN32_PRINTING = define(12)
  val CAIRO_SURFACE_TYPE_QUARTZ_IMAGE = define(13)
  val CAIRO_SURFACE_TYPE_SCRIPT = define(14)
  val CAIRO_SURFACE_TYPE_QT = define(15)
  val CAIRO_SURFACE_TYPE_RECORDING = define(16)
  val CAIRO_SURFACE_TYPE_VG = define(17)
  val CAIRO_SURFACE_TYPE_GL = define(18)
  val CAIRO_SURFACE_TYPE_DRM = define(19)
  val CAIRO_SURFACE_TYPE_TEE = define(20)
  val CAIRO_SURFACE_TYPE_XML = define(21)
  val CAIRO_SURFACE_TYPE_SKIA = define(22)
  val CAIRO_SURFACE_TYPE_SUBSURFACE = define(23)
  val CAIRO_SURFACE_TYPE_COGL = define(24)
  inline def getName(inline value: _cairo_surface_type): Option[String] =
    value match
      case CAIRO_SURFACE_TYPE_IMAGE => Some("CAIRO_SURFACE_TYPE_IMAGE")
      case CAIRO_SURFACE_TYPE_PDF => Some("CAIRO_SURFACE_TYPE_PDF")
      case CAIRO_SURFACE_TYPE_PS => Some("CAIRO_SURFACE_TYPE_PS")
      case CAIRO_SURFACE_TYPE_XLIB => Some("CAIRO_SURFACE_TYPE_XLIB")
      case CAIRO_SURFACE_TYPE_XCB => Some("CAIRO_SURFACE_TYPE_XCB")
      case CAIRO_SURFACE_TYPE_GLITZ => Some("CAIRO_SURFACE_TYPE_GLITZ")
      case CAIRO_SURFACE_TYPE_QUARTZ => Some("CAIRO_SURFACE_TYPE_QUARTZ")
      case CAIRO_SURFACE_TYPE_WIN32 => Some("CAIRO_SURFACE_TYPE_WIN32")
      case CAIRO_SURFACE_TYPE_BEOS => Some("CAIRO_SURFACE_TYPE_BEOS")
      case CAIRO_SURFACE_TYPE_DIRECTFB => Some("CAIRO_SURFACE_TYPE_DIRECTFB")
      case CAIRO_SURFACE_TYPE_SVG => Some("CAIRO_SURFACE_TYPE_SVG")
      case CAIRO_SURFACE_TYPE_OS2 => Some("CAIRO_SURFACE_TYPE_OS2")
      case CAIRO_SURFACE_TYPE_WIN32_PRINTING => Some("CAIRO_SURFACE_TYPE_WIN32_PRINTING")
      case CAIRO_SURFACE_TYPE_QUARTZ_IMAGE => Some("CAIRO_SURFACE_TYPE_QUARTZ_IMAGE")
      case CAIRO_SURFACE_TYPE_SCRIPT => Some("CAIRO_SURFACE_TYPE_SCRIPT")
      case CAIRO_SURFACE_TYPE_QT => Some("CAIRO_SURFACE_TYPE_QT")
      case CAIRO_SURFACE_TYPE_RECORDING => Some("CAIRO_SURFACE_TYPE_RECORDING")
      case CAIRO_SURFACE_TYPE_VG => Some("CAIRO_SURFACE_TYPE_VG")
      case CAIRO_SURFACE_TYPE_GL => Some("CAIRO_SURFACE_TYPE_GL")
      case CAIRO_SURFACE_TYPE_DRM => Some("CAIRO_SURFACE_TYPE_DRM")
      case CAIRO_SURFACE_TYPE_TEE => Some("CAIRO_SURFACE_TYPE_TEE")
      case CAIRO_SURFACE_TYPE_XML => Some("CAIRO_SURFACE_TYPE_XML")
      case CAIRO_SURFACE_TYPE_SKIA => Some("CAIRO_SURFACE_TYPE_SKIA")
      case CAIRO_SURFACE_TYPE_SUBSURFACE => Some("CAIRO_SURFACE_TYPE_SUBSURFACE")
      case CAIRO_SURFACE_TYPE_COGL => Some("CAIRO_SURFACE_TYPE_COGL")
      case _ => None
  extension (a: _cairo_surface_type)
    inline def &(b: _cairo_surface_type): _cairo_surface_type = a & b
    inline def |(b: _cairo_surface_type): _cairo_surface_type = a | b
    inline def is(b: _cairo_surface_type): Boolean = (a & b) == b

opaque type _cairo_text_cluster_flags = CUnsignedInt
object _cairo_text_cluster_flags extends CEnumU[_cairo_text_cluster_flags]:
  given _tag: Tag[_cairo_text_cluster_flags] = Tag.UInt
  inline def define(inline a: Long): _cairo_text_cluster_flags = a.toUInt
  val CAIRO_TEXT_CLUSTER_FLAG_BACKWARD = define(1)
  inline def getName(inline value: _cairo_text_cluster_flags): Option[String] =
    value match
      case CAIRO_TEXT_CLUSTER_FLAG_BACKWARD => Some("CAIRO_TEXT_CLUSTER_FLAG_BACKWARD")
      case _ => None
  extension (a: _cairo_text_cluster_flags)
    inline def &(b: _cairo_text_cluster_flags): _cairo_text_cluster_flags = a & b
    inline def |(b: _cairo_text_cluster_flags): _cairo_text_cluster_flags = a | b
    inline def is(b: _cairo_text_cluster_flags): Boolean = (a & b) == b

opaque type cairo_surface_observer_mode_t = CUnsignedInt
object cairo_surface_observer_mode_t extends CEnumU[cairo_surface_observer_mode_t]:
  given _tag: Tag[cairo_surface_observer_mode_t] = Tag.UInt
  inline def define(inline a: Long): cairo_surface_observer_mode_t = a.toUInt
  val CAIRO_SURFACE_OBSERVER_NORMAL = define(0)
  val CAIRO_SURFACE_OBSERVER_RECORD_OPERATIONS = define(1)
  inline def getName(inline value: cairo_surface_observer_mode_t): Option[String] =
    value match
      case CAIRO_SURFACE_OBSERVER_NORMAL => Some("CAIRO_SURFACE_OBSERVER_NORMAL")
      case CAIRO_SURFACE_OBSERVER_RECORD_OPERATIONS => Some("CAIRO_SURFACE_OBSERVER_RECORD_OPERATIONS")
      case _ => None
  extension (a: cairo_surface_observer_mode_t)
    inline def &(b: cairo_surface_observer_mode_t): cairo_surface_observer_mode_t = a & b
    inline def |(b: cairo_surface_observer_mode_t): cairo_surface_observer_mode_t = a | b
    inline def is(b: cairo_surface_observer_mode_t): Boolean = (a & b) == b

opaque type graphene_euler_order_t = CInt
object graphene_euler_order_t extends CEnum[graphene_euler_order_t]:
  given _tag: Tag[graphene_euler_order_t] = Tag.Int
  inline def define(inline a: CInt): graphene_euler_order_t = a
  val GRAPHENE_EULER_ORDER_DEFAULT = define(-1)
  val GRAPHENE_EULER_ORDER_XYZ = define(0)
  val GRAPHENE_EULER_ORDER_YZX = define(1)
  val GRAPHENE_EULER_ORDER_ZXY = define(2)
  val GRAPHENE_EULER_ORDER_XZY = define(3)
  val GRAPHENE_EULER_ORDER_YXZ = define(4)
  val GRAPHENE_EULER_ORDER_ZYX = define(5)
  val GRAPHENE_EULER_ORDER_SXYZ = define(6)
  val GRAPHENE_EULER_ORDER_SXYX = define(7)
  val GRAPHENE_EULER_ORDER_SXZY = define(8)
  val GRAPHENE_EULER_ORDER_SXZX = define(9)
  val GRAPHENE_EULER_ORDER_SYZX = define(10)
  val GRAPHENE_EULER_ORDER_SYZY = define(11)
  val GRAPHENE_EULER_ORDER_SYXZ = define(12)
  val GRAPHENE_EULER_ORDER_SYXY = define(13)
  val GRAPHENE_EULER_ORDER_SZXY = define(14)
  val GRAPHENE_EULER_ORDER_SZXZ = define(15)
  val GRAPHENE_EULER_ORDER_SZYX = define(16)
  val GRAPHENE_EULER_ORDER_SZYZ = define(17)
  val GRAPHENE_EULER_ORDER_RZYX = define(18)
  val GRAPHENE_EULER_ORDER_RXYX = define(19)
  val GRAPHENE_EULER_ORDER_RYZX = define(20)
  val GRAPHENE_EULER_ORDER_RXZX = define(21)
  val GRAPHENE_EULER_ORDER_RXZY = define(22)
  val GRAPHENE_EULER_ORDER_RYZY = define(23)
  val GRAPHENE_EULER_ORDER_RZXY = define(24)
  val GRAPHENE_EULER_ORDER_RYXY = define(25)
  val GRAPHENE_EULER_ORDER_RYXZ = define(26)
  val GRAPHENE_EULER_ORDER_RZXZ = define(27)
  val GRAPHENE_EULER_ORDER_RXYZ = define(28)
  val GRAPHENE_EULER_ORDER_RZYZ = define(29)
  inline def getName(inline value: graphene_euler_order_t): Option[String] =
    value match
      case GRAPHENE_EULER_ORDER_DEFAULT => Some("GRAPHENE_EULER_ORDER_DEFAULT")
      case GRAPHENE_EULER_ORDER_XYZ => Some("GRAPHENE_EULER_ORDER_XYZ")
      case GRAPHENE_EULER_ORDER_YZX => Some("GRAPHENE_EULER_ORDER_YZX")
      case GRAPHENE_EULER_ORDER_ZXY => Some("GRAPHENE_EULER_ORDER_ZXY")
      case GRAPHENE_EULER_ORDER_XZY => Some("GRAPHENE_EULER_ORDER_XZY")
      case GRAPHENE_EULER_ORDER_YXZ => Some("GRAPHENE_EULER_ORDER_YXZ")
      case GRAPHENE_EULER_ORDER_ZYX => Some("GRAPHENE_EULER_ORDER_ZYX")
      case GRAPHENE_EULER_ORDER_SXYZ => Some("GRAPHENE_EULER_ORDER_SXYZ")
      case GRAPHENE_EULER_ORDER_SXYX => Some("GRAPHENE_EULER_ORDER_SXYX")
      case GRAPHENE_EULER_ORDER_SXZY => Some("GRAPHENE_EULER_ORDER_SXZY")
      case GRAPHENE_EULER_ORDER_SXZX => Some("GRAPHENE_EULER_ORDER_SXZX")
      case GRAPHENE_EULER_ORDER_SYZX => Some("GRAPHENE_EULER_ORDER_SYZX")
      case GRAPHENE_EULER_ORDER_SYZY => Some("GRAPHENE_EULER_ORDER_SYZY")
      case GRAPHENE_EULER_ORDER_SYXZ => Some("GRAPHENE_EULER_ORDER_SYXZ")
      case GRAPHENE_EULER_ORDER_SYXY => Some("GRAPHENE_EULER_ORDER_SYXY")
      case GRAPHENE_EULER_ORDER_SZXY => Some("GRAPHENE_EULER_ORDER_SZXY")
      case GRAPHENE_EULER_ORDER_SZXZ => Some("GRAPHENE_EULER_ORDER_SZXZ")
      case GRAPHENE_EULER_ORDER_SZYX => Some("GRAPHENE_EULER_ORDER_SZYX")
      case GRAPHENE_EULER_ORDER_SZYZ => Some("GRAPHENE_EULER_ORDER_SZYZ")
      case GRAPHENE_EULER_ORDER_RZYX => Some("GRAPHENE_EULER_ORDER_RZYX")
      case GRAPHENE_EULER_ORDER_RXYX => Some("GRAPHENE_EULER_ORDER_RXYX")
      case GRAPHENE_EULER_ORDER_RYZX => Some("GRAPHENE_EULER_ORDER_RYZX")
      case GRAPHENE_EULER_ORDER_RXZX => Some("GRAPHENE_EULER_ORDER_RXZX")
      case GRAPHENE_EULER_ORDER_RXZY => Some("GRAPHENE_EULER_ORDER_RXZY")
      case GRAPHENE_EULER_ORDER_RYZY => Some("GRAPHENE_EULER_ORDER_RYZY")
      case GRAPHENE_EULER_ORDER_RZXY => Some("GRAPHENE_EULER_ORDER_RZXY")
      case GRAPHENE_EULER_ORDER_RYXY => Some("GRAPHENE_EULER_ORDER_RYXY")
      case GRAPHENE_EULER_ORDER_RYXZ => Some("GRAPHENE_EULER_ORDER_RYXZ")
      case GRAPHENE_EULER_ORDER_RZXZ => Some("GRAPHENE_EULER_ORDER_RZXZ")
      case GRAPHENE_EULER_ORDER_RXYZ => Some("GRAPHENE_EULER_ORDER_RXYZ")
      case GRAPHENE_EULER_ORDER_RZYZ => Some("GRAPHENE_EULER_ORDER_RZYZ")
      case _ => None
  extension (a: graphene_euler_order_t)
    inline def &(b: graphene_euler_order_t): graphene_euler_order_t = a & b
    inline def |(b: graphene_euler_order_t): graphene_euler_order_t = a | b
    inline def is(b: graphene_euler_order_t): Boolean = (a & b) == b

opaque type graphene_ray_intersection_kind_t = CUnsignedInt
object graphene_ray_intersection_kind_t extends CEnumU[graphene_ray_intersection_kind_t]:
  given _tag: Tag[graphene_ray_intersection_kind_t] = Tag.UInt
  inline def define(inline a: Long): graphene_ray_intersection_kind_t = a.toUInt
  val GRAPHENE_RAY_INTERSECTION_KIND_NONE = define(0)
  val GRAPHENE_RAY_INTERSECTION_KIND_ENTER = define(1)
  val GRAPHENE_RAY_INTERSECTION_KIND_LEAVE = define(2)
  inline def getName(inline value: graphene_ray_intersection_kind_t): Option[String] =
    value match
      case GRAPHENE_RAY_INTERSECTION_KIND_NONE => Some("GRAPHENE_RAY_INTERSECTION_KIND_NONE")
      case GRAPHENE_RAY_INTERSECTION_KIND_ENTER => Some("GRAPHENE_RAY_INTERSECTION_KIND_ENTER")
      case GRAPHENE_RAY_INTERSECTION_KIND_LEAVE => Some("GRAPHENE_RAY_INTERSECTION_KIND_LEAVE")
      case _ => None
  extension (a: graphene_ray_intersection_kind_t)
    inline def &(b: graphene_ray_intersection_kind_t): graphene_ray_intersection_kind_t = a & b
    inline def |(b: graphene_ray_intersection_kind_t): graphene_ray_intersection_kind_t = a | b
    inline def is(b: graphene_ray_intersection_kind_t): Boolean = (a & b) == b

opaque type hb_buffer_cluster_level_t = CUnsignedInt
object hb_buffer_cluster_level_t extends CEnumU[hb_buffer_cluster_level_t]:
  given _tag: Tag[hb_buffer_cluster_level_t] = Tag.UInt
  inline def define(inline a: Long): hb_buffer_cluster_level_t = a.toUInt
  val HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES = define(0)
  val HB_BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS = define(1)
  val HB_BUFFER_CLUSTER_LEVEL_CHARACTERS = define(2)
  val HB_BUFFER_CLUSTER_LEVEL_DEFAULT = define(0)
  inline def getName(inline value: hb_buffer_cluster_level_t): Option[String] =
    value match
      case HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES => Some("HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES")
      case HB_BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS => Some("HB_BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS")
      case HB_BUFFER_CLUSTER_LEVEL_CHARACTERS => Some("HB_BUFFER_CLUSTER_LEVEL_CHARACTERS")
      case HB_BUFFER_CLUSTER_LEVEL_DEFAULT => Some("HB_BUFFER_CLUSTER_LEVEL_DEFAULT")
      case _ => None
  extension (a: hb_buffer_cluster_level_t)
    inline def &(b: hb_buffer_cluster_level_t): hb_buffer_cluster_level_t = a & b
    inline def |(b: hb_buffer_cluster_level_t): hb_buffer_cluster_level_t = a | b
    inline def is(b: hb_buffer_cluster_level_t): Boolean = (a & b) == b

opaque type hb_buffer_content_type_t = CUnsignedInt
object hb_buffer_content_type_t extends CEnumU[hb_buffer_content_type_t]:
  given _tag: Tag[hb_buffer_content_type_t] = Tag.UInt
  inline def define(inline a: Long): hb_buffer_content_type_t = a.toUInt
  val HB_BUFFER_CONTENT_TYPE_INVALID = define(0)
  val HB_BUFFER_CONTENT_TYPE_UNICODE = define(1)
  val HB_BUFFER_CONTENT_TYPE_GLYPHS = define(2)
  inline def getName(inline value: hb_buffer_content_type_t): Option[String] =
    value match
      case HB_BUFFER_CONTENT_TYPE_INVALID => Some("HB_BUFFER_CONTENT_TYPE_INVALID")
      case HB_BUFFER_CONTENT_TYPE_UNICODE => Some("HB_BUFFER_CONTENT_TYPE_UNICODE")
      case HB_BUFFER_CONTENT_TYPE_GLYPHS => Some("HB_BUFFER_CONTENT_TYPE_GLYPHS")
      case _ => None
  extension (a: hb_buffer_content_type_t)
    inline def &(b: hb_buffer_content_type_t): hb_buffer_content_type_t = a & b
    inline def |(b: hb_buffer_content_type_t): hb_buffer_content_type_t = a | b
    inline def is(b: hb_buffer_content_type_t): Boolean = (a & b) == b

opaque type hb_buffer_diff_flags_t = CUnsignedInt
object hb_buffer_diff_flags_t extends CEnumU[hb_buffer_diff_flags_t]:
  given _tag: Tag[hb_buffer_diff_flags_t] = Tag.UInt
  inline def define(inline a: Long): hb_buffer_diff_flags_t = a.toUInt
  val HB_BUFFER_DIFF_FLAG_EQUAL = define(0)
  val HB_BUFFER_DIFF_FLAG_CONTENT_TYPE_MISMATCH = define(1)
  val HB_BUFFER_DIFF_FLAG_LENGTH_MISMATCH = define(2)
  val HB_BUFFER_DIFF_FLAG_NOTDEF_PRESENT = define(4)
  val HB_BUFFER_DIFF_FLAG_DOTTED_CIRCLE_PRESENT = define(8)
  val HB_BUFFER_DIFF_FLAG_CODEPOINT_MISMATCH = define(16)
  val HB_BUFFER_DIFF_FLAG_CLUSTER_MISMATCH = define(32)
  val HB_BUFFER_DIFF_FLAG_GLYPH_FLAGS_MISMATCH = define(64)
  val HB_BUFFER_DIFF_FLAG_POSITION_MISMATCH = define(128)
  inline def getName(inline value: hb_buffer_diff_flags_t): Option[String] =
    value match
      case HB_BUFFER_DIFF_FLAG_EQUAL => Some("HB_BUFFER_DIFF_FLAG_EQUAL")
      case HB_BUFFER_DIFF_FLAG_CONTENT_TYPE_MISMATCH => Some("HB_BUFFER_DIFF_FLAG_CONTENT_TYPE_MISMATCH")
      case HB_BUFFER_DIFF_FLAG_LENGTH_MISMATCH => Some("HB_BUFFER_DIFF_FLAG_LENGTH_MISMATCH")
      case HB_BUFFER_DIFF_FLAG_NOTDEF_PRESENT => Some("HB_BUFFER_DIFF_FLAG_NOTDEF_PRESENT")
      case HB_BUFFER_DIFF_FLAG_DOTTED_CIRCLE_PRESENT => Some("HB_BUFFER_DIFF_FLAG_DOTTED_CIRCLE_PRESENT")
      case HB_BUFFER_DIFF_FLAG_CODEPOINT_MISMATCH => Some("HB_BUFFER_DIFF_FLAG_CODEPOINT_MISMATCH")
      case HB_BUFFER_DIFF_FLAG_CLUSTER_MISMATCH => Some("HB_BUFFER_DIFF_FLAG_CLUSTER_MISMATCH")
      case HB_BUFFER_DIFF_FLAG_GLYPH_FLAGS_MISMATCH => Some("HB_BUFFER_DIFF_FLAG_GLYPH_FLAGS_MISMATCH")
      case HB_BUFFER_DIFF_FLAG_POSITION_MISMATCH => Some("HB_BUFFER_DIFF_FLAG_POSITION_MISMATCH")
      case _ => None
  extension (a: hb_buffer_diff_flags_t)
    inline def &(b: hb_buffer_diff_flags_t): hb_buffer_diff_flags_t = a & b
    inline def |(b: hb_buffer_diff_flags_t): hb_buffer_diff_flags_t = a | b
    inline def is(b: hb_buffer_diff_flags_t): Boolean = (a & b) == b

opaque type hb_buffer_flags_t = CUnsignedInt
object hb_buffer_flags_t extends CEnumU[hb_buffer_flags_t]:
  given _tag: Tag[hb_buffer_flags_t] = Tag.UInt
  inline def define(inline a: Long): hb_buffer_flags_t = a.toUInt
  val HB_BUFFER_FLAG_DEFAULT = define(0)
  val HB_BUFFER_FLAG_BOT = define(1)
  val HB_BUFFER_FLAG_EOT = define(2)
  val HB_BUFFER_FLAG_PRESERVE_DEFAULT_IGNORABLES = define(4)
  val HB_BUFFER_FLAG_REMOVE_DEFAULT_IGNORABLES = define(8)
  val HB_BUFFER_FLAG_DO_NOT_INSERT_DOTTED_CIRCLE = define(16)
  inline def getName(inline value: hb_buffer_flags_t): Option[String] =
    value match
      case HB_BUFFER_FLAG_DEFAULT => Some("HB_BUFFER_FLAG_DEFAULT")
      case HB_BUFFER_FLAG_BOT => Some("HB_BUFFER_FLAG_BOT")
      case HB_BUFFER_FLAG_EOT => Some("HB_BUFFER_FLAG_EOT")
      case HB_BUFFER_FLAG_PRESERVE_DEFAULT_IGNORABLES => Some("HB_BUFFER_FLAG_PRESERVE_DEFAULT_IGNORABLES")
      case HB_BUFFER_FLAG_REMOVE_DEFAULT_IGNORABLES => Some("HB_BUFFER_FLAG_REMOVE_DEFAULT_IGNORABLES")
      case HB_BUFFER_FLAG_DO_NOT_INSERT_DOTTED_CIRCLE => Some("HB_BUFFER_FLAG_DO_NOT_INSERT_DOTTED_CIRCLE")
      case _ => None
  extension (a: hb_buffer_flags_t)
    inline def &(b: hb_buffer_flags_t): hb_buffer_flags_t = a & b
    inline def |(b: hb_buffer_flags_t): hb_buffer_flags_t = a | b
    inline def is(b: hb_buffer_flags_t): Boolean = (a & b) == b

opaque type hb_buffer_serialize_flags_t = CUnsignedInt
object hb_buffer_serialize_flags_t extends CEnumU[hb_buffer_serialize_flags_t]:
  given _tag: Tag[hb_buffer_serialize_flags_t] = Tag.UInt
  inline def define(inline a: Long): hb_buffer_serialize_flags_t = a.toUInt
  val HB_BUFFER_SERIALIZE_FLAG_DEFAULT = define(0)
  val HB_BUFFER_SERIALIZE_FLAG_NO_CLUSTERS = define(1)
  val HB_BUFFER_SERIALIZE_FLAG_NO_POSITIONS = define(2)
  val HB_BUFFER_SERIALIZE_FLAG_NO_GLYPH_NAMES = define(4)
  val HB_BUFFER_SERIALIZE_FLAG_GLYPH_EXTENTS = define(8)
  val HB_BUFFER_SERIALIZE_FLAG_GLYPH_FLAGS = define(16)
  val HB_BUFFER_SERIALIZE_FLAG_NO_ADVANCES = define(32)
  inline def getName(inline value: hb_buffer_serialize_flags_t): Option[String] =
    value match
      case HB_BUFFER_SERIALIZE_FLAG_DEFAULT => Some("HB_BUFFER_SERIALIZE_FLAG_DEFAULT")
      case HB_BUFFER_SERIALIZE_FLAG_NO_CLUSTERS => Some("HB_BUFFER_SERIALIZE_FLAG_NO_CLUSTERS")
      case HB_BUFFER_SERIALIZE_FLAG_NO_POSITIONS => Some("HB_BUFFER_SERIALIZE_FLAG_NO_POSITIONS")
      case HB_BUFFER_SERIALIZE_FLAG_NO_GLYPH_NAMES => Some("HB_BUFFER_SERIALIZE_FLAG_NO_GLYPH_NAMES")
      case HB_BUFFER_SERIALIZE_FLAG_GLYPH_EXTENTS => Some("HB_BUFFER_SERIALIZE_FLAG_GLYPH_EXTENTS")
      case HB_BUFFER_SERIALIZE_FLAG_GLYPH_FLAGS => Some("HB_BUFFER_SERIALIZE_FLAG_GLYPH_FLAGS")
      case HB_BUFFER_SERIALIZE_FLAG_NO_ADVANCES => Some("HB_BUFFER_SERIALIZE_FLAG_NO_ADVANCES")
      case _ => None
  extension (a: hb_buffer_serialize_flags_t)
    inline def &(b: hb_buffer_serialize_flags_t): hb_buffer_serialize_flags_t = a & b
    inline def |(b: hb_buffer_serialize_flags_t): hb_buffer_serialize_flags_t = a | b
    inline def is(b: hb_buffer_serialize_flags_t): Boolean = (a & b) == b

opaque type hb_buffer_serialize_format_t = CUnsignedInt
object hb_buffer_serialize_format_t extends CEnumU[hb_buffer_serialize_format_t]:
  given _tag: Tag[hb_buffer_serialize_format_t] = Tag.UInt
  inline def define(inline a: Long): hb_buffer_serialize_format_t = a.toUInt
  val HB_BUFFER_SERIALIZE_FORMAT_TEXT = define(1413830740)
  val HB_BUFFER_SERIALIZE_FORMAT_JSON = define(1246973774)
  val HB_BUFFER_SERIALIZE_FORMAT_INVALID = define(0)
  inline def getName(inline value: hb_buffer_serialize_format_t): Option[String] =
    value match
      case HB_BUFFER_SERIALIZE_FORMAT_TEXT => Some("HB_BUFFER_SERIALIZE_FORMAT_TEXT")
      case HB_BUFFER_SERIALIZE_FORMAT_JSON => Some("HB_BUFFER_SERIALIZE_FORMAT_JSON")
      case HB_BUFFER_SERIALIZE_FORMAT_INVALID => Some("HB_BUFFER_SERIALIZE_FORMAT_INVALID")
      case _ => None
  extension (a: hb_buffer_serialize_format_t)
    inline def &(b: hb_buffer_serialize_format_t): hb_buffer_serialize_format_t = a & b
    inline def |(b: hb_buffer_serialize_format_t): hb_buffer_serialize_format_t = a | b
    inline def is(b: hb_buffer_serialize_format_t): Boolean = (a & b) == b

opaque type hb_direction_t = CUnsignedInt
object hb_direction_t extends CEnumU[hb_direction_t]:
  given _tag: Tag[hb_direction_t] = Tag.UInt
  inline def define(inline a: Long): hb_direction_t = a.toUInt
  val HB_DIRECTION_INVALID = define(0)
  val HB_DIRECTION_LTR = define(4)
  val HB_DIRECTION_RTL = define(5)
  val HB_DIRECTION_TTB = define(6)
  val HB_DIRECTION_BTT = define(7)
  inline def getName(inline value: hb_direction_t): Option[String] =
    value match
      case HB_DIRECTION_INVALID => Some("HB_DIRECTION_INVALID")
      case HB_DIRECTION_LTR => Some("HB_DIRECTION_LTR")
      case HB_DIRECTION_RTL => Some("HB_DIRECTION_RTL")
      case HB_DIRECTION_TTB => Some("HB_DIRECTION_TTB")
      case HB_DIRECTION_BTT => Some("HB_DIRECTION_BTT")
      case _ => None
  extension (a: hb_direction_t)
    inline def &(b: hb_direction_t): hb_direction_t = a & b
    inline def |(b: hb_direction_t): hb_direction_t = a | b
    inline def is(b: hb_direction_t): Boolean = (a & b) == b

opaque type hb_glyph_flags_t = CUnsignedInt
object hb_glyph_flags_t extends CEnumU[hb_glyph_flags_t]:
  given _tag: Tag[hb_glyph_flags_t] = Tag.UInt
  inline def define(inline a: Long): hb_glyph_flags_t = a.toUInt
  val HB_GLYPH_FLAG_UNSAFE_TO_BREAK = define(1)
  val HB_GLYPH_FLAG_DEFINED = define(1)
  inline def getName(inline value: hb_glyph_flags_t): Option[String] =
    value match
      case HB_GLYPH_FLAG_UNSAFE_TO_BREAK => Some("HB_GLYPH_FLAG_UNSAFE_TO_BREAK")
      case HB_GLYPH_FLAG_DEFINED => Some("HB_GLYPH_FLAG_DEFINED")
      case _ => None
  extension (a: hb_glyph_flags_t)
    inline def &(b: hb_glyph_flags_t): hb_glyph_flags_t = a & b
    inline def |(b: hb_glyph_flags_t): hb_glyph_flags_t = a | b
    inline def is(b: hb_glyph_flags_t): Boolean = (a & b) == b

opaque type hb_memory_mode_t = CUnsignedInt
object hb_memory_mode_t extends CEnumU[hb_memory_mode_t]:
  given _tag: Tag[hb_memory_mode_t] = Tag.UInt
  inline def define(inline a: Long): hb_memory_mode_t = a.toUInt
  val HB_MEMORY_MODE_DUPLICATE = define(0)
  val HB_MEMORY_MODE_READONLY = define(1)
  val HB_MEMORY_MODE_WRITABLE = define(2)
  val HB_MEMORY_MODE_READONLY_MAY_MAKE_WRITABLE = define(3)
  inline def getName(inline value: hb_memory_mode_t): Option[String] =
    value match
      case HB_MEMORY_MODE_DUPLICATE => Some("HB_MEMORY_MODE_DUPLICATE")
      case HB_MEMORY_MODE_READONLY => Some("HB_MEMORY_MODE_READONLY")
      case HB_MEMORY_MODE_WRITABLE => Some("HB_MEMORY_MODE_WRITABLE")
      case HB_MEMORY_MODE_READONLY_MAY_MAKE_WRITABLE => Some("HB_MEMORY_MODE_READONLY_MAY_MAKE_WRITABLE")
      case _ => None
  extension (a: hb_memory_mode_t)
    inline def &(b: hb_memory_mode_t): hb_memory_mode_t = a & b
    inline def |(b: hb_memory_mode_t): hb_memory_mode_t = a | b
    inline def is(b: hb_memory_mode_t): Boolean = (a & b) == b

opaque type hb_script_t = CUnsignedInt
object hb_script_t extends CEnumU[hb_script_t]:
  given _tag: Tag[hb_script_t] = Tag.UInt
  inline def define(inline a: Long): hb_script_t = a.toUInt
  val HB_SCRIPT_COMMON = define(1517910393)
  val HB_SCRIPT_INHERITED = define(1516858984)
  val HB_SCRIPT_UNKNOWN = define(1517976186)
  val HB_SCRIPT_ARABIC = define(1098015074)
  val HB_SCRIPT_ARMENIAN = define(1098018158)
  val HB_SCRIPT_BENGALI = define(1113943655)
  val HB_SCRIPT_CYRILLIC = define(1132032620)
  val HB_SCRIPT_DEVANAGARI = define(1147500129)
  val HB_SCRIPT_GEORGIAN = define(1197830002)
  val HB_SCRIPT_GREEK = define(1198679403)
  val HB_SCRIPT_GUJARATI = define(1198877298)
  val HB_SCRIPT_GURMUKHI = define(1198879349)
  val HB_SCRIPT_HANGUL = define(1214344807)
  val HB_SCRIPT_HAN = define(1214344809)
  val HB_SCRIPT_HEBREW = define(1214603890)
  val HB_SCRIPT_HIRAGANA = define(1214870113)
  val HB_SCRIPT_KANNADA = define(1265525857)
  val HB_SCRIPT_KATAKANA = define(1264676449)
  val HB_SCRIPT_LAO = define(1281453935)
  val HB_SCRIPT_LATIN = define(1281455214)
  val HB_SCRIPT_MALAYALAM = define(1298954605)
  val HB_SCRIPT_ORIYA = define(1332902241)
  val HB_SCRIPT_TAMIL = define(1415671148)
  val HB_SCRIPT_TELUGU = define(1415933045)
  val HB_SCRIPT_THAI = define(1416126825)
  val HB_SCRIPT_TIBETAN = define(1416192628)
  val HB_SCRIPT_BOPOMOFO = define(1114599535)
  val HB_SCRIPT_BRAILLE = define(1114792297)
  val HB_SCRIPT_CANADIAN_SYLLABICS = define(1130458739)
  val HB_SCRIPT_CHEROKEE = define(1130915186)
  val HB_SCRIPT_ETHIOPIC = define(1165256809)
  val HB_SCRIPT_KHMER = define(1265134962)
  val HB_SCRIPT_MONGOLIAN = define(1299148391)
  val HB_SCRIPT_MYANMAR = define(1299803506)
  val HB_SCRIPT_OGHAM = define(1332175213)
  val HB_SCRIPT_RUNIC = define(1383427698)
  val HB_SCRIPT_SINHALA = define(1399418472)
  val HB_SCRIPT_SYRIAC = define(1400468067)
  val HB_SCRIPT_THAANA = define(1416126817)
  val HB_SCRIPT_YI = define(1500080489)
  val HB_SCRIPT_DESERET = define(1148416628)
  val HB_SCRIPT_GOTHIC = define(1198486632)
  val HB_SCRIPT_OLD_ITALIC = define(1232363884)
  val HB_SCRIPT_BUHID = define(1114990692)
  val HB_SCRIPT_HANUNOO = define(1214344815)
  val HB_SCRIPT_TAGALOG = define(1416064103)
  val HB_SCRIPT_TAGBANWA = define(1415669602)
  val HB_SCRIPT_CYPRIOT = define(1131442804)
  val HB_SCRIPT_LIMBU = define(1281977698)
  val HB_SCRIPT_LINEAR_B = define(1281977954)
  val HB_SCRIPT_OSMANYA = define(1332964705)
  val HB_SCRIPT_SHAVIAN = define(1399349623)
  val HB_SCRIPT_TAI_LE = define(1415670885)
  val HB_SCRIPT_UGARITIC = define(1432838514)
  val HB_SCRIPT_BUGINESE = define(1114990441)
  val HB_SCRIPT_COPTIC = define(1131376756)
  val HB_SCRIPT_GLAGOLITIC = define(1198285159)
  val HB_SCRIPT_KHAROSHTHI = define(1265131890)
  val HB_SCRIPT_NEW_TAI_LUE = define(1415670901)
  val HB_SCRIPT_OLD_PERSIAN = define(1483761007)
  val HB_SCRIPT_SYLOTI_NAGRI = define(1400466543)
  val HB_SCRIPT_TIFINAGH = define(1415999079)
  val HB_SCRIPT_BALINESE = define(1113681001)
  val HB_SCRIPT_CUNEIFORM = define(1483961720)
  val HB_SCRIPT_NKO = define(1315663727)
  val HB_SCRIPT_PHAGS_PA = define(1349017959)
  val HB_SCRIPT_PHOENICIAN = define(1349021304)
  val HB_SCRIPT_CARIAN = define(1130459753)
  val HB_SCRIPT_CHAM = define(1130914157)
  val HB_SCRIPT_KAYAH_LI = define(1264675945)
  val HB_SCRIPT_LEPCHA = define(1281716323)
  val HB_SCRIPT_LYCIAN = define(1283023721)
  val HB_SCRIPT_LYDIAN = define(1283023977)
  val HB_SCRIPT_OL_CHIKI = define(1332503403)
  val HB_SCRIPT_REJANG = define(1382706791)
  val HB_SCRIPT_SAURASHTRA = define(1398895986)
  val HB_SCRIPT_SUNDANESE = define(1400204900)
  val HB_SCRIPT_VAI = define(1449224553)
  val HB_SCRIPT_AVESTAN = define(1098281844)
  val HB_SCRIPT_BAMUM = define(1113681269)
  val HB_SCRIPT_EGYPTIAN_HIEROGLYPHS = define(1164409200)
  val HB_SCRIPT_IMPERIAL_ARAMAIC = define(1098018153)
  val HB_SCRIPT_INSCRIPTIONAL_PAHLAVI = define(1349020777)
  val HB_SCRIPT_INSCRIPTIONAL_PARTHIAN = define(1349678185)
  val HB_SCRIPT_JAVANESE = define(1247901281)
  val HB_SCRIPT_KAITHI = define(1265920105)
  val HB_SCRIPT_LISU = define(1281979253)
  val HB_SCRIPT_MEETEI_MAYEK = define(1299473769)
  val HB_SCRIPT_OLD_SOUTH_ARABIAN = define(1398895202)
  val HB_SCRIPT_OLD_TURKIC = define(1332898664)
  val HB_SCRIPT_SAMARITAN = define(1398893938)
  val HB_SCRIPT_TAI_THAM = define(1281453665)
  val HB_SCRIPT_TAI_VIET = define(1415673460)
  val HB_SCRIPT_BATAK = define(1113683051)
  val HB_SCRIPT_BRAHMI = define(1114792296)
  val HB_SCRIPT_MANDAIC = define(1298230884)
  val HB_SCRIPT_CHAKMA = define(1130457965)
  val HB_SCRIPT_MEROITIC_CURSIVE = define(1298494051)
  val HB_SCRIPT_MEROITIC_HIEROGLYPHS = define(1298494063)
  val HB_SCRIPT_MIAO = define(1349284452)
  val HB_SCRIPT_SHARADA = define(1399353956)
  val HB_SCRIPT_SORA_SOMPENG = define(1399812705)
  val HB_SCRIPT_TAKRI = define(1415670642)
  val HB_SCRIPT_BASSA_VAH = define(1113682803)
  val HB_SCRIPT_CAUCASIAN_ALBANIAN = define(1097295970)
  val HB_SCRIPT_DUPLOYAN = define(1148547180)
  val HB_SCRIPT_ELBASAN = define(1164730977)
  val HB_SCRIPT_GRANTHA = define(1198678382)
  val HB_SCRIPT_KHOJKI = define(1265135466)
  val HB_SCRIPT_KHUDAWADI = define(1399418468)
  val HB_SCRIPT_LINEAR_A = define(1281977953)
  val HB_SCRIPT_MAHAJANI = define(1298229354)
  val HB_SCRIPT_MANICHAEAN = define(1298230889)
  val HB_SCRIPT_MENDE_KIKAKUI = define(1298493028)
  val HB_SCRIPT_MODI = define(1299145833)
  val HB_SCRIPT_MRO = define(1299345263)
  val HB_SCRIPT_NABATAEAN = define(1315070324)
  val HB_SCRIPT_OLD_NORTH_ARABIAN = define(1315009122)
  val HB_SCRIPT_OLD_PERMIC = define(1348825709)
  val HB_SCRIPT_PAHAWH_HMONG = define(1215131239)
  val HB_SCRIPT_PALMYRENE = define(1348562029)
  val HB_SCRIPT_PAU_CIN_HAU = define(1348564323)
  val HB_SCRIPT_PSALTER_PAHLAVI = define(1349020784)
  val HB_SCRIPT_SIDDHAM = define(1399415908)
  val HB_SCRIPT_TIRHUTA = define(1416196712)
  val HB_SCRIPT_WARANG_CITI = define(1466004065)
  val HB_SCRIPT_AHOM = define(1097363309)
  val HB_SCRIPT_ANATOLIAN_HIEROGLYPHS = define(1215067511)
  val HB_SCRIPT_HATRAN = define(1214346354)
  val HB_SCRIPT_MULTANI = define(1299541108)
  val HB_SCRIPT_OLD_HUNGARIAN = define(1215655527)
  val HB_SCRIPT_SIGNWRITING = define(1399287415)
  val HB_SCRIPT_ADLAM = define(1097100397)
  val HB_SCRIPT_BHAIKSUKI = define(1114139507)
  val HB_SCRIPT_MARCHEN = define(1298231907)
  val HB_SCRIPT_OSAGE = define(1332963173)
  val HB_SCRIPT_TANGUT = define(1415671399)
  val HB_SCRIPT_NEWA = define(1315272545)
  val HB_SCRIPT_MASARAM_GONDI = define(1198485101)
  val HB_SCRIPT_NUSHU = define(1316186229)
  val HB_SCRIPT_SOYOMBO = define(1399814511)
  val HB_SCRIPT_ZANABAZAR_SQUARE = define(1516334690)
  val HB_SCRIPT_DOGRA = define(1148151666)
  val HB_SCRIPT_GUNJALA_GONDI = define(1198485095)
  val HB_SCRIPT_HANIFI_ROHINGYA = define(1383032935)
  val HB_SCRIPT_MAKASAR = define(1298230113)
  val HB_SCRIPT_MEDEFAIDRIN = define(1298490470)
  val HB_SCRIPT_OLD_SOGDIAN = define(1399809903)
  val HB_SCRIPT_SOGDIAN = define(1399809892)
  val HB_SCRIPT_ELYMAIC = define(1164736877)
  val HB_SCRIPT_NANDINAGARI = define(1315008100)
  val HB_SCRIPT_NYIAKENG_PUACHUE_HMONG = define(1215131248)
  val HB_SCRIPT_WANCHO = define(1466132591)
  val HB_SCRIPT_CHORASMIAN = define(1130918515)
  val HB_SCRIPT_DIVES_AKURU = define(1147756907)
  val HB_SCRIPT_KHITAN_SMALL_SCRIPT = define(1265202291)
  val HB_SCRIPT_YEZIDI = define(1499822697)
  val HB_SCRIPT_INVALID = define(0)
  val _HB_SCRIPT_MAX_VALUE = define(2147483647)
  val _HB_SCRIPT_MAX_VALUE_SIGNED = define(2147483647)
  inline def getName(inline value: hb_script_t): Option[String] =
    value match
      case HB_SCRIPT_COMMON => Some("HB_SCRIPT_COMMON")
      case HB_SCRIPT_INHERITED => Some("HB_SCRIPT_INHERITED")
      case HB_SCRIPT_UNKNOWN => Some("HB_SCRIPT_UNKNOWN")
      case HB_SCRIPT_ARABIC => Some("HB_SCRIPT_ARABIC")
      case HB_SCRIPT_ARMENIAN => Some("HB_SCRIPT_ARMENIAN")
      case HB_SCRIPT_BENGALI => Some("HB_SCRIPT_BENGALI")
      case HB_SCRIPT_CYRILLIC => Some("HB_SCRIPT_CYRILLIC")
      case HB_SCRIPT_DEVANAGARI => Some("HB_SCRIPT_DEVANAGARI")
      case HB_SCRIPT_GEORGIAN => Some("HB_SCRIPT_GEORGIAN")
      case HB_SCRIPT_GREEK => Some("HB_SCRIPT_GREEK")
      case HB_SCRIPT_GUJARATI => Some("HB_SCRIPT_GUJARATI")
      case HB_SCRIPT_GURMUKHI => Some("HB_SCRIPT_GURMUKHI")
      case HB_SCRIPT_HANGUL => Some("HB_SCRIPT_HANGUL")
      case HB_SCRIPT_HAN => Some("HB_SCRIPT_HAN")
      case HB_SCRIPT_HEBREW => Some("HB_SCRIPT_HEBREW")
      case HB_SCRIPT_HIRAGANA => Some("HB_SCRIPT_HIRAGANA")
      case HB_SCRIPT_KANNADA => Some("HB_SCRIPT_KANNADA")
      case HB_SCRIPT_KATAKANA => Some("HB_SCRIPT_KATAKANA")
      case HB_SCRIPT_LAO => Some("HB_SCRIPT_LAO")
      case HB_SCRIPT_LATIN => Some("HB_SCRIPT_LATIN")
      case HB_SCRIPT_MALAYALAM => Some("HB_SCRIPT_MALAYALAM")
      case HB_SCRIPT_ORIYA => Some("HB_SCRIPT_ORIYA")
      case HB_SCRIPT_TAMIL => Some("HB_SCRIPT_TAMIL")
      case HB_SCRIPT_TELUGU => Some("HB_SCRIPT_TELUGU")
      case HB_SCRIPT_THAI => Some("HB_SCRIPT_THAI")
      case HB_SCRIPT_TIBETAN => Some("HB_SCRIPT_TIBETAN")
      case HB_SCRIPT_BOPOMOFO => Some("HB_SCRIPT_BOPOMOFO")
      case HB_SCRIPT_BRAILLE => Some("HB_SCRIPT_BRAILLE")
      case HB_SCRIPT_CANADIAN_SYLLABICS => Some("HB_SCRIPT_CANADIAN_SYLLABICS")
      case HB_SCRIPT_CHEROKEE => Some("HB_SCRIPT_CHEROKEE")
      case HB_SCRIPT_ETHIOPIC => Some("HB_SCRIPT_ETHIOPIC")
      case HB_SCRIPT_KHMER => Some("HB_SCRIPT_KHMER")
      case HB_SCRIPT_MONGOLIAN => Some("HB_SCRIPT_MONGOLIAN")
      case HB_SCRIPT_MYANMAR => Some("HB_SCRIPT_MYANMAR")
      case HB_SCRIPT_OGHAM => Some("HB_SCRIPT_OGHAM")
      case HB_SCRIPT_RUNIC => Some("HB_SCRIPT_RUNIC")
      case HB_SCRIPT_SINHALA => Some("HB_SCRIPT_SINHALA")
      case HB_SCRIPT_SYRIAC => Some("HB_SCRIPT_SYRIAC")
      case HB_SCRIPT_THAANA => Some("HB_SCRIPT_THAANA")
      case HB_SCRIPT_YI => Some("HB_SCRIPT_YI")
      case HB_SCRIPT_DESERET => Some("HB_SCRIPT_DESERET")
      case HB_SCRIPT_GOTHIC => Some("HB_SCRIPT_GOTHIC")
      case HB_SCRIPT_OLD_ITALIC => Some("HB_SCRIPT_OLD_ITALIC")
      case HB_SCRIPT_BUHID => Some("HB_SCRIPT_BUHID")
      case HB_SCRIPT_HANUNOO => Some("HB_SCRIPT_HANUNOO")
      case HB_SCRIPT_TAGALOG => Some("HB_SCRIPT_TAGALOG")
      case HB_SCRIPT_TAGBANWA => Some("HB_SCRIPT_TAGBANWA")
      case HB_SCRIPT_CYPRIOT => Some("HB_SCRIPT_CYPRIOT")
      case HB_SCRIPT_LIMBU => Some("HB_SCRIPT_LIMBU")
      case HB_SCRIPT_LINEAR_B => Some("HB_SCRIPT_LINEAR_B")
      case HB_SCRIPT_OSMANYA => Some("HB_SCRIPT_OSMANYA")
      case HB_SCRIPT_SHAVIAN => Some("HB_SCRIPT_SHAVIAN")
      case HB_SCRIPT_TAI_LE => Some("HB_SCRIPT_TAI_LE")
      case HB_SCRIPT_UGARITIC => Some("HB_SCRIPT_UGARITIC")
      case HB_SCRIPT_BUGINESE => Some("HB_SCRIPT_BUGINESE")
      case HB_SCRIPT_COPTIC => Some("HB_SCRIPT_COPTIC")
      case HB_SCRIPT_GLAGOLITIC => Some("HB_SCRIPT_GLAGOLITIC")
      case HB_SCRIPT_KHAROSHTHI => Some("HB_SCRIPT_KHAROSHTHI")
      case HB_SCRIPT_NEW_TAI_LUE => Some("HB_SCRIPT_NEW_TAI_LUE")
      case HB_SCRIPT_OLD_PERSIAN => Some("HB_SCRIPT_OLD_PERSIAN")
      case HB_SCRIPT_SYLOTI_NAGRI => Some("HB_SCRIPT_SYLOTI_NAGRI")
      case HB_SCRIPT_TIFINAGH => Some("HB_SCRIPT_TIFINAGH")
      case HB_SCRIPT_BALINESE => Some("HB_SCRIPT_BALINESE")
      case HB_SCRIPT_CUNEIFORM => Some("HB_SCRIPT_CUNEIFORM")
      case HB_SCRIPT_NKO => Some("HB_SCRIPT_NKO")
      case HB_SCRIPT_PHAGS_PA => Some("HB_SCRIPT_PHAGS_PA")
      case HB_SCRIPT_PHOENICIAN => Some("HB_SCRIPT_PHOENICIAN")
      case HB_SCRIPT_CARIAN => Some("HB_SCRIPT_CARIAN")
      case HB_SCRIPT_CHAM => Some("HB_SCRIPT_CHAM")
      case HB_SCRIPT_KAYAH_LI => Some("HB_SCRIPT_KAYAH_LI")
      case HB_SCRIPT_LEPCHA => Some("HB_SCRIPT_LEPCHA")
      case HB_SCRIPT_LYCIAN => Some("HB_SCRIPT_LYCIAN")
      case HB_SCRIPT_LYDIAN => Some("HB_SCRIPT_LYDIAN")
      case HB_SCRIPT_OL_CHIKI => Some("HB_SCRIPT_OL_CHIKI")
      case HB_SCRIPT_REJANG => Some("HB_SCRIPT_REJANG")
      case HB_SCRIPT_SAURASHTRA => Some("HB_SCRIPT_SAURASHTRA")
      case HB_SCRIPT_SUNDANESE => Some("HB_SCRIPT_SUNDANESE")
      case HB_SCRIPT_VAI => Some("HB_SCRIPT_VAI")
      case HB_SCRIPT_AVESTAN => Some("HB_SCRIPT_AVESTAN")
      case HB_SCRIPT_BAMUM => Some("HB_SCRIPT_BAMUM")
      case HB_SCRIPT_EGYPTIAN_HIEROGLYPHS => Some("HB_SCRIPT_EGYPTIAN_HIEROGLYPHS")
      case HB_SCRIPT_IMPERIAL_ARAMAIC => Some("HB_SCRIPT_IMPERIAL_ARAMAIC")
      case HB_SCRIPT_INSCRIPTIONAL_PAHLAVI => Some("HB_SCRIPT_INSCRIPTIONAL_PAHLAVI")
      case HB_SCRIPT_INSCRIPTIONAL_PARTHIAN => Some("HB_SCRIPT_INSCRIPTIONAL_PARTHIAN")
      case HB_SCRIPT_JAVANESE => Some("HB_SCRIPT_JAVANESE")
      case HB_SCRIPT_KAITHI => Some("HB_SCRIPT_KAITHI")
      case HB_SCRIPT_LISU => Some("HB_SCRIPT_LISU")
      case HB_SCRIPT_MEETEI_MAYEK => Some("HB_SCRIPT_MEETEI_MAYEK")
      case HB_SCRIPT_OLD_SOUTH_ARABIAN => Some("HB_SCRIPT_OLD_SOUTH_ARABIAN")
      case HB_SCRIPT_OLD_TURKIC => Some("HB_SCRIPT_OLD_TURKIC")
      case HB_SCRIPT_SAMARITAN => Some("HB_SCRIPT_SAMARITAN")
      case HB_SCRIPT_TAI_THAM => Some("HB_SCRIPT_TAI_THAM")
      case HB_SCRIPT_TAI_VIET => Some("HB_SCRIPT_TAI_VIET")
      case HB_SCRIPT_BATAK => Some("HB_SCRIPT_BATAK")
      case HB_SCRIPT_BRAHMI => Some("HB_SCRIPT_BRAHMI")
      case HB_SCRIPT_MANDAIC => Some("HB_SCRIPT_MANDAIC")
      case HB_SCRIPT_CHAKMA => Some("HB_SCRIPT_CHAKMA")
      case HB_SCRIPT_MEROITIC_CURSIVE => Some("HB_SCRIPT_MEROITIC_CURSIVE")
      case HB_SCRIPT_MEROITIC_HIEROGLYPHS => Some("HB_SCRIPT_MEROITIC_HIEROGLYPHS")
      case HB_SCRIPT_MIAO => Some("HB_SCRIPT_MIAO")
      case HB_SCRIPT_SHARADA => Some("HB_SCRIPT_SHARADA")
      case HB_SCRIPT_SORA_SOMPENG => Some("HB_SCRIPT_SORA_SOMPENG")
      case HB_SCRIPT_TAKRI => Some("HB_SCRIPT_TAKRI")
      case HB_SCRIPT_BASSA_VAH => Some("HB_SCRIPT_BASSA_VAH")
      case HB_SCRIPT_CAUCASIAN_ALBANIAN => Some("HB_SCRIPT_CAUCASIAN_ALBANIAN")
      case HB_SCRIPT_DUPLOYAN => Some("HB_SCRIPT_DUPLOYAN")
      case HB_SCRIPT_ELBASAN => Some("HB_SCRIPT_ELBASAN")
      case HB_SCRIPT_GRANTHA => Some("HB_SCRIPT_GRANTHA")
      case HB_SCRIPT_KHOJKI => Some("HB_SCRIPT_KHOJKI")
      case HB_SCRIPT_KHUDAWADI => Some("HB_SCRIPT_KHUDAWADI")
      case HB_SCRIPT_LINEAR_A => Some("HB_SCRIPT_LINEAR_A")
      case HB_SCRIPT_MAHAJANI => Some("HB_SCRIPT_MAHAJANI")
      case HB_SCRIPT_MANICHAEAN => Some("HB_SCRIPT_MANICHAEAN")
      case HB_SCRIPT_MENDE_KIKAKUI => Some("HB_SCRIPT_MENDE_KIKAKUI")
      case HB_SCRIPT_MODI => Some("HB_SCRIPT_MODI")
      case HB_SCRIPT_MRO => Some("HB_SCRIPT_MRO")
      case HB_SCRIPT_NABATAEAN => Some("HB_SCRIPT_NABATAEAN")
      case HB_SCRIPT_OLD_NORTH_ARABIAN => Some("HB_SCRIPT_OLD_NORTH_ARABIAN")
      case HB_SCRIPT_OLD_PERMIC => Some("HB_SCRIPT_OLD_PERMIC")
      case HB_SCRIPT_PAHAWH_HMONG => Some("HB_SCRIPT_PAHAWH_HMONG")
      case HB_SCRIPT_PALMYRENE => Some("HB_SCRIPT_PALMYRENE")
      case HB_SCRIPT_PAU_CIN_HAU => Some("HB_SCRIPT_PAU_CIN_HAU")
      case HB_SCRIPT_PSALTER_PAHLAVI => Some("HB_SCRIPT_PSALTER_PAHLAVI")
      case HB_SCRIPT_SIDDHAM => Some("HB_SCRIPT_SIDDHAM")
      case HB_SCRIPT_TIRHUTA => Some("HB_SCRIPT_TIRHUTA")
      case HB_SCRIPT_WARANG_CITI => Some("HB_SCRIPT_WARANG_CITI")
      case HB_SCRIPT_AHOM => Some("HB_SCRIPT_AHOM")
      case HB_SCRIPT_ANATOLIAN_HIEROGLYPHS => Some("HB_SCRIPT_ANATOLIAN_HIEROGLYPHS")
      case HB_SCRIPT_HATRAN => Some("HB_SCRIPT_HATRAN")
      case HB_SCRIPT_MULTANI => Some("HB_SCRIPT_MULTANI")
      case HB_SCRIPT_OLD_HUNGARIAN => Some("HB_SCRIPT_OLD_HUNGARIAN")
      case HB_SCRIPT_SIGNWRITING => Some("HB_SCRIPT_SIGNWRITING")
      case HB_SCRIPT_ADLAM => Some("HB_SCRIPT_ADLAM")
      case HB_SCRIPT_BHAIKSUKI => Some("HB_SCRIPT_BHAIKSUKI")
      case HB_SCRIPT_MARCHEN => Some("HB_SCRIPT_MARCHEN")
      case HB_SCRIPT_OSAGE => Some("HB_SCRIPT_OSAGE")
      case HB_SCRIPT_TANGUT => Some("HB_SCRIPT_TANGUT")
      case HB_SCRIPT_NEWA => Some("HB_SCRIPT_NEWA")
      case HB_SCRIPT_MASARAM_GONDI => Some("HB_SCRIPT_MASARAM_GONDI")
      case HB_SCRIPT_NUSHU => Some("HB_SCRIPT_NUSHU")
      case HB_SCRIPT_SOYOMBO => Some("HB_SCRIPT_SOYOMBO")
      case HB_SCRIPT_ZANABAZAR_SQUARE => Some("HB_SCRIPT_ZANABAZAR_SQUARE")
      case HB_SCRIPT_DOGRA => Some("HB_SCRIPT_DOGRA")
      case HB_SCRIPT_GUNJALA_GONDI => Some("HB_SCRIPT_GUNJALA_GONDI")
      case HB_SCRIPT_HANIFI_ROHINGYA => Some("HB_SCRIPT_HANIFI_ROHINGYA")
      case HB_SCRIPT_MAKASAR => Some("HB_SCRIPT_MAKASAR")
      case HB_SCRIPT_MEDEFAIDRIN => Some("HB_SCRIPT_MEDEFAIDRIN")
      case HB_SCRIPT_OLD_SOGDIAN => Some("HB_SCRIPT_OLD_SOGDIAN")
      case HB_SCRIPT_SOGDIAN => Some("HB_SCRIPT_SOGDIAN")
      case HB_SCRIPT_ELYMAIC => Some("HB_SCRIPT_ELYMAIC")
      case HB_SCRIPT_NANDINAGARI => Some("HB_SCRIPT_NANDINAGARI")
      case HB_SCRIPT_NYIAKENG_PUACHUE_HMONG => Some("HB_SCRIPT_NYIAKENG_PUACHUE_HMONG")
      case HB_SCRIPT_WANCHO => Some("HB_SCRIPT_WANCHO")
      case HB_SCRIPT_CHORASMIAN => Some("HB_SCRIPT_CHORASMIAN")
      case HB_SCRIPT_DIVES_AKURU => Some("HB_SCRIPT_DIVES_AKURU")
      case HB_SCRIPT_KHITAN_SMALL_SCRIPT => Some("HB_SCRIPT_KHITAN_SMALL_SCRIPT")
      case HB_SCRIPT_YEZIDI => Some("HB_SCRIPT_YEZIDI")
      case HB_SCRIPT_INVALID => Some("HB_SCRIPT_INVALID")
      case _HB_SCRIPT_MAX_VALUE => Some("_HB_SCRIPT_MAX_VALUE")
      case _HB_SCRIPT_MAX_VALUE_SIGNED => Some("_HB_SCRIPT_MAX_VALUE_SIGNED")
      case _ => None
  extension (a: hb_script_t)
    inline def &(b: hb_script_t): hb_script_t = a & b
    inline def |(b: hb_script_t): hb_script_t = a | b
    inline def is(b: hb_script_t): Boolean = (a & b) == b

opaque type hb_unicode_combining_class_t = CUnsignedInt
object hb_unicode_combining_class_t extends CEnumU[hb_unicode_combining_class_t]:
  given _tag: Tag[hb_unicode_combining_class_t] = Tag.UInt
  inline def define(inline a: Long): hb_unicode_combining_class_t = a.toUInt
  val HB_UNICODE_COMBINING_CLASS_NOT_REORDERED = define(0)
  val HB_UNICODE_COMBINING_CLASS_OVERLAY = define(1)
  val HB_UNICODE_COMBINING_CLASS_NUKTA = define(7)
  val HB_UNICODE_COMBINING_CLASS_KANA_VOICING = define(8)
  val HB_UNICODE_COMBINING_CLASS_VIRAMA = define(9)
  val HB_UNICODE_COMBINING_CLASS_CCC10 = define(10)
  val HB_UNICODE_COMBINING_CLASS_CCC11 = define(11)
  val HB_UNICODE_COMBINING_CLASS_CCC12 = define(12)
  val HB_UNICODE_COMBINING_CLASS_CCC13 = define(13)
  val HB_UNICODE_COMBINING_CLASS_CCC14 = define(14)
  val HB_UNICODE_COMBINING_CLASS_CCC15 = define(15)
  val HB_UNICODE_COMBINING_CLASS_CCC16 = define(16)
  val HB_UNICODE_COMBINING_CLASS_CCC17 = define(17)
  val HB_UNICODE_COMBINING_CLASS_CCC18 = define(18)
  val HB_UNICODE_COMBINING_CLASS_CCC19 = define(19)
  val HB_UNICODE_COMBINING_CLASS_CCC20 = define(20)
  val HB_UNICODE_COMBINING_CLASS_CCC21 = define(21)
  val HB_UNICODE_COMBINING_CLASS_CCC22 = define(22)
  val HB_UNICODE_COMBINING_CLASS_CCC23 = define(23)
  val HB_UNICODE_COMBINING_CLASS_CCC24 = define(24)
  val HB_UNICODE_COMBINING_CLASS_CCC25 = define(25)
  val HB_UNICODE_COMBINING_CLASS_CCC26 = define(26)
  val HB_UNICODE_COMBINING_CLASS_CCC27 = define(27)
  val HB_UNICODE_COMBINING_CLASS_CCC28 = define(28)
  val HB_UNICODE_COMBINING_CLASS_CCC29 = define(29)
  val HB_UNICODE_COMBINING_CLASS_CCC30 = define(30)
  val HB_UNICODE_COMBINING_CLASS_CCC31 = define(31)
  val HB_UNICODE_COMBINING_CLASS_CCC32 = define(32)
  val HB_UNICODE_COMBINING_CLASS_CCC33 = define(33)
  val HB_UNICODE_COMBINING_CLASS_CCC34 = define(34)
  val HB_UNICODE_COMBINING_CLASS_CCC35 = define(35)
  val HB_UNICODE_COMBINING_CLASS_CCC36 = define(36)
  val HB_UNICODE_COMBINING_CLASS_CCC84 = define(84)
  val HB_UNICODE_COMBINING_CLASS_CCC91 = define(91)
  val HB_UNICODE_COMBINING_CLASS_CCC103 = define(103)
  val HB_UNICODE_COMBINING_CLASS_CCC107 = define(107)
  val HB_UNICODE_COMBINING_CLASS_CCC118 = define(118)
  val HB_UNICODE_COMBINING_CLASS_CCC122 = define(122)
  val HB_UNICODE_COMBINING_CLASS_CCC129 = define(129)
  val HB_UNICODE_COMBINING_CLASS_CCC130 = define(130)
  val HB_UNICODE_COMBINING_CLASS_CCC133 = define(132)
  val HB_UNICODE_COMBINING_CLASS_ATTACHED_BELOW_LEFT = define(200)
  val HB_UNICODE_COMBINING_CLASS_ATTACHED_BELOW = define(202)
  val HB_UNICODE_COMBINING_CLASS_ATTACHED_ABOVE = define(214)
  val HB_UNICODE_COMBINING_CLASS_ATTACHED_ABOVE_RIGHT = define(216)
  val HB_UNICODE_COMBINING_CLASS_BELOW_LEFT = define(218)
  val HB_UNICODE_COMBINING_CLASS_BELOW = define(220)
  val HB_UNICODE_COMBINING_CLASS_BELOW_RIGHT = define(222)
  val HB_UNICODE_COMBINING_CLASS_LEFT = define(224)
  val HB_UNICODE_COMBINING_CLASS_RIGHT = define(226)
  val HB_UNICODE_COMBINING_CLASS_ABOVE_LEFT = define(228)
  val HB_UNICODE_COMBINING_CLASS_ABOVE = define(230)
  val HB_UNICODE_COMBINING_CLASS_ABOVE_RIGHT = define(232)
  val HB_UNICODE_COMBINING_CLASS_DOUBLE_BELOW = define(233)
  val HB_UNICODE_COMBINING_CLASS_DOUBLE_ABOVE = define(234)
  val HB_UNICODE_COMBINING_CLASS_IOTA_SUBSCRIPT = define(240)
  val HB_UNICODE_COMBINING_CLASS_INVALID = define(255)
  inline def getName(inline value: hb_unicode_combining_class_t): Option[String] =
    value match
      case HB_UNICODE_COMBINING_CLASS_NOT_REORDERED => Some("HB_UNICODE_COMBINING_CLASS_NOT_REORDERED")
      case HB_UNICODE_COMBINING_CLASS_OVERLAY => Some("HB_UNICODE_COMBINING_CLASS_OVERLAY")
      case HB_UNICODE_COMBINING_CLASS_NUKTA => Some("HB_UNICODE_COMBINING_CLASS_NUKTA")
      case HB_UNICODE_COMBINING_CLASS_KANA_VOICING => Some("HB_UNICODE_COMBINING_CLASS_KANA_VOICING")
      case HB_UNICODE_COMBINING_CLASS_VIRAMA => Some("HB_UNICODE_COMBINING_CLASS_VIRAMA")
      case HB_UNICODE_COMBINING_CLASS_CCC10 => Some("HB_UNICODE_COMBINING_CLASS_CCC10")
      case HB_UNICODE_COMBINING_CLASS_CCC11 => Some("HB_UNICODE_COMBINING_CLASS_CCC11")
      case HB_UNICODE_COMBINING_CLASS_CCC12 => Some("HB_UNICODE_COMBINING_CLASS_CCC12")
      case HB_UNICODE_COMBINING_CLASS_CCC13 => Some("HB_UNICODE_COMBINING_CLASS_CCC13")
      case HB_UNICODE_COMBINING_CLASS_CCC14 => Some("HB_UNICODE_COMBINING_CLASS_CCC14")
      case HB_UNICODE_COMBINING_CLASS_CCC15 => Some("HB_UNICODE_COMBINING_CLASS_CCC15")
      case HB_UNICODE_COMBINING_CLASS_CCC16 => Some("HB_UNICODE_COMBINING_CLASS_CCC16")
      case HB_UNICODE_COMBINING_CLASS_CCC17 => Some("HB_UNICODE_COMBINING_CLASS_CCC17")
      case HB_UNICODE_COMBINING_CLASS_CCC18 => Some("HB_UNICODE_COMBINING_CLASS_CCC18")
      case HB_UNICODE_COMBINING_CLASS_CCC19 => Some("HB_UNICODE_COMBINING_CLASS_CCC19")
      case HB_UNICODE_COMBINING_CLASS_CCC20 => Some("HB_UNICODE_COMBINING_CLASS_CCC20")
      case HB_UNICODE_COMBINING_CLASS_CCC21 => Some("HB_UNICODE_COMBINING_CLASS_CCC21")
      case HB_UNICODE_COMBINING_CLASS_CCC22 => Some("HB_UNICODE_COMBINING_CLASS_CCC22")
      case HB_UNICODE_COMBINING_CLASS_CCC23 => Some("HB_UNICODE_COMBINING_CLASS_CCC23")
      case HB_UNICODE_COMBINING_CLASS_CCC24 => Some("HB_UNICODE_COMBINING_CLASS_CCC24")
      case HB_UNICODE_COMBINING_CLASS_CCC25 => Some("HB_UNICODE_COMBINING_CLASS_CCC25")
      case HB_UNICODE_COMBINING_CLASS_CCC26 => Some("HB_UNICODE_COMBINING_CLASS_CCC26")
      case HB_UNICODE_COMBINING_CLASS_CCC27 => Some("HB_UNICODE_COMBINING_CLASS_CCC27")
      case HB_UNICODE_COMBINING_CLASS_CCC28 => Some("HB_UNICODE_COMBINING_CLASS_CCC28")
      case HB_UNICODE_COMBINING_CLASS_CCC29 => Some("HB_UNICODE_COMBINING_CLASS_CCC29")
      case HB_UNICODE_COMBINING_CLASS_CCC30 => Some("HB_UNICODE_COMBINING_CLASS_CCC30")
      case HB_UNICODE_COMBINING_CLASS_CCC31 => Some("HB_UNICODE_COMBINING_CLASS_CCC31")
      case HB_UNICODE_COMBINING_CLASS_CCC32 => Some("HB_UNICODE_COMBINING_CLASS_CCC32")
      case HB_UNICODE_COMBINING_CLASS_CCC33 => Some("HB_UNICODE_COMBINING_CLASS_CCC33")
      case HB_UNICODE_COMBINING_CLASS_CCC34 => Some("HB_UNICODE_COMBINING_CLASS_CCC34")
      case HB_UNICODE_COMBINING_CLASS_CCC35 => Some("HB_UNICODE_COMBINING_CLASS_CCC35")
      case HB_UNICODE_COMBINING_CLASS_CCC36 => Some("HB_UNICODE_COMBINING_CLASS_CCC36")
      case HB_UNICODE_COMBINING_CLASS_CCC84 => Some("HB_UNICODE_COMBINING_CLASS_CCC84")
      case HB_UNICODE_COMBINING_CLASS_CCC91 => Some("HB_UNICODE_COMBINING_CLASS_CCC91")
      case HB_UNICODE_COMBINING_CLASS_CCC103 => Some("HB_UNICODE_COMBINING_CLASS_CCC103")
      case HB_UNICODE_COMBINING_CLASS_CCC107 => Some("HB_UNICODE_COMBINING_CLASS_CCC107")
      case HB_UNICODE_COMBINING_CLASS_CCC118 => Some("HB_UNICODE_COMBINING_CLASS_CCC118")
      case HB_UNICODE_COMBINING_CLASS_CCC122 => Some("HB_UNICODE_COMBINING_CLASS_CCC122")
      case HB_UNICODE_COMBINING_CLASS_CCC129 => Some("HB_UNICODE_COMBINING_CLASS_CCC129")
      case HB_UNICODE_COMBINING_CLASS_CCC130 => Some("HB_UNICODE_COMBINING_CLASS_CCC130")
      case HB_UNICODE_COMBINING_CLASS_CCC133 => Some("HB_UNICODE_COMBINING_CLASS_CCC133")
      case HB_UNICODE_COMBINING_CLASS_ATTACHED_BELOW_LEFT => Some("HB_UNICODE_COMBINING_CLASS_ATTACHED_BELOW_LEFT")
      case HB_UNICODE_COMBINING_CLASS_ATTACHED_BELOW => Some("HB_UNICODE_COMBINING_CLASS_ATTACHED_BELOW")
      case HB_UNICODE_COMBINING_CLASS_ATTACHED_ABOVE => Some("HB_UNICODE_COMBINING_CLASS_ATTACHED_ABOVE")
      case HB_UNICODE_COMBINING_CLASS_ATTACHED_ABOVE_RIGHT => Some("HB_UNICODE_COMBINING_CLASS_ATTACHED_ABOVE_RIGHT")
      case HB_UNICODE_COMBINING_CLASS_BELOW_LEFT => Some("HB_UNICODE_COMBINING_CLASS_BELOW_LEFT")
      case HB_UNICODE_COMBINING_CLASS_BELOW => Some("HB_UNICODE_COMBINING_CLASS_BELOW")
      case HB_UNICODE_COMBINING_CLASS_BELOW_RIGHT => Some("HB_UNICODE_COMBINING_CLASS_BELOW_RIGHT")
      case HB_UNICODE_COMBINING_CLASS_LEFT => Some("HB_UNICODE_COMBINING_CLASS_LEFT")
      case HB_UNICODE_COMBINING_CLASS_RIGHT => Some("HB_UNICODE_COMBINING_CLASS_RIGHT")
      case HB_UNICODE_COMBINING_CLASS_ABOVE_LEFT => Some("HB_UNICODE_COMBINING_CLASS_ABOVE_LEFT")
      case HB_UNICODE_COMBINING_CLASS_ABOVE => Some("HB_UNICODE_COMBINING_CLASS_ABOVE")
      case HB_UNICODE_COMBINING_CLASS_ABOVE_RIGHT => Some("HB_UNICODE_COMBINING_CLASS_ABOVE_RIGHT")
      case HB_UNICODE_COMBINING_CLASS_DOUBLE_BELOW => Some("HB_UNICODE_COMBINING_CLASS_DOUBLE_BELOW")
      case HB_UNICODE_COMBINING_CLASS_DOUBLE_ABOVE => Some("HB_UNICODE_COMBINING_CLASS_DOUBLE_ABOVE")
      case HB_UNICODE_COMBINING_CLASS_IOTA_SUBSCRIPT => Some("HB_UNICODE_COMBINING_CLASS_IOTA_SUBSCRIPT")
      case HB_UNICODE_COMBINING_CLASS_INVALID => Some("HB_UNICODE_COMBINING_CLASS_INVALID")
      case _ => None
  extension (a: hb_unicode_combining_class_t)
    inline def &(b: hb_unicode_combining_class_t): hb_unicode_combining_class_t = a & b
    inline def |(b: hb_unicode_combining_class_t): hb_unicode_combining_class_t = a | b
    inline def is(b: hb_unicode_combining_class_t): Boolean = (a & b) == b

opaque type hb_unicode_general_category_t = CUnsignedInt
object hb_unicode_general_category_t extends CEnumU[hb_unicode_general_category_t]:
  given _tag: Tag[hb_unicode_general_category_t] = Tag.UInt
  inline def define(inline a: Long): hb_unicode_general_category_t = a.toUInt
  val HB_UNICODE_GENERAL_CATEGORY_CONTROL = define(0)
  val HB_UNICODE_GENERAL_CATEGORY_FORMAT = define(1)
  val HB_UNICODE_GENERAL_CATEGORY_UNASSIGNED = define(2)
  val HB_UNICODE_GENERAL_CATEGORY_PRIVATE_USE = define(3)
  val HB_UNICODE_GENERAL_CATEGORY_SURROGATE = define(4)
  val HB_UNICODE_GENERAL_CATEGORY_LOWERCASE_LETTER = define(5)
  val HB_UNICODE_GENERAL_CATEGORY_MODIFIER_LETTER = define(6)
  val HB_UNICODE_GENERAL_CATEGORY_OTHER_LETTER = define(7)
  val HB_UNICODE_GENERAL_CATEGORY_TITLECASE_LETTER = define(8)
  val HB_UNICODE_GENERAL_CATEGORY_UPPERCASE_LETTER = define(9)
  val HB_UNICODE_GENERAL_CATEGORY_SPACING_MARK = define(10)
  val HB_UNICODE_GENERAL_CATEGORY_ENCLOSING_MARK = define(11)
  val HB_UNICODE_GENERAL_CATEGORY_NON_SPACING_MARK = define(12)
  val HB_UNICODE_GENERAL_CATEGORY_DECIMAL_NUMBER = define(13)
  val HB_UNICODE_GENERAL_CATEGORY_LETTER_NUMBER = define(14)
  val HB_UNICODE_GENERAL_CATEGORY_OTHER_NUMBER = define(15)
  val HB_UNICODE_GENERAL_CATEGORY_CONNECT_PUNCTUATION = define(16)
  val HB_UNICODE_GENERAL_CATEGORY_DASH_PUNCTUATION = define(17)
  val HB_UNICODE_GENERAL_CATEGORY_CLOSE_PUNCTUATION = define(18)
  val HB_UNICODE_GENERAL_CATEGORY_FINAL_PUNCTUATION = define(19)
  val HB_UNICODE_GENERAL_CATEGORY_INITIAL_PUNCTUATION = define(20)
  val HB_UNICODE_GENERAL_CATEGORY_OTHER_PUNCTUATION = define(21)
  val HB_UNICODE_GENERAL_CATEGORY_OPEN_PUNCTUATION = define(22)
  val HB_UNICODE_GENERAL_CATEGORY_CURRENCY_SYMBOL = define(23)
  val HB_UNICODE_GENERAL_CATEGORY_MODIFIER_SYMBOL = define(24)
  val HB_UNICODE_GENERAL_CATEGORY_MATH_SYMBOL = define(25)
  val HB_UNICODE_GENERAL_CATEGORY_OTHER_SYMBOL = define(26)
  val HB_UNICODE_GENERAL_CATEGORY_LINE_SEPARATOR = define(27)
  val HB_UNICODE_GENERAL_CATEGORY_PARAGRAPH_SEPARATOR = define(28)
  val HB_UNICODE_GENERAL_CATEGORY_SPACE_SEPARATOR = define(29)
  inline def getName(inline value: hb_unicode_general_category_t): Option[String] =
    value match
      case HB_UNICODE_GENERAL_CATEGORY_CONTROL => Some("HB_UNICODE_GENERAL_CATEGORY_CONTROL")
      case HB_UNICODE_GENERAL_CATEGORY_FORMAT => Some("HB_UNICODE_GENERAL_CATEGORY_FORMAT")
      case HB_UNICODE_GENERAL_CATEGORY_UNASSIGNED => Some("HB_UNICODE_GENERAL_CATEGORY_UNASSIGNED")
      case HB_UNICODE_GENERAL_CATEGORY_PRIVATE_USE => Some("HB_UNICODE_GENERAL_CATEGORY_PRIVATE_USE")
      case HB_UNICODE_GENERAL_CATEGORY_SURROGATE => Some("HB_UNICODE_GENERAL_CATEGORY_SURROGATE")
      case HB_UNICODE_GENERAL_CATEGORY_LOWERCASE_LETTER => Some("HB_UNICODE_GENERAL_CATEGORY_LOWERCASE_LETTER")
      case HB_UNICODE_GENERAL_CATEGORY_MODIFIER_LETTER => Some("HB_UNICODE_GENERAL_CATEGORY_MODIFIER_LETTER")
      case HB_UNICODE_GENERAL_CATEGORY_OTHER_LETTER => Some("HB_UNICODE_GENERAL_CATEGORY_OTHER_LETTER")
      case HB_UNICODE_GENERAL_CATEGORY_TITLECASE_LETTER => Some("HB_UNICODE_GENERAL_CATEGORY_TITLECASE_LETTER")
      case HB_UNICODE_GENERAL_CATEGORY_UPPERCASE_LETTER => Some("HB_UNICODE_GENERAL_CATEGORY_UPPERCASE_LETTER")
      case HB_UNICODE_GENERAL_CATEGORY_SPACING_MARK => Some("HB_UNICODE_GENERAL_CATEGORY_SPACING_MARK")
      case HB_UNICODE_GENERAL_CATEGORY_ENCLOSING_MARK => Some("HB_UNICODE_GENERAL_CATEGORY_ENCLOSING_MARK")
      case HB_UNICODE_GENERAL_CATEGORY_NON_SPACING_MARK => Some("HB_UNICODE_GENERAL_CATEGORY_NON_SPACING_MARK")
      case HB_UNICODE_GENERAL_CATEGORY_DECIMAL_NUMBER => Some("HB_UNICODE_GENERAL_CATEGORY_DECIMAL_NUMBER")
      case HB_UNICODE_GENERAL_CATEGORY_LETTER_NUMBER => Some("HB_UNICODE_GENERAL_CATEGORY_LETTER_NUMBER")
      case HB_UNICODE_GENERAL_CATEGORY_OTHER_NUMBER => Some("HB_UNICODE_GENERAL_CATEGORY_OTHER_NUMBER")
      case HB_UNICODE_GENERAL_CATEGORY_CONNECT_PUNCTUATION => Some("HB_UNICODE_GENERAL_CATEGORY_CONNECT_PUNCTUATION")
      case HB_UNICODE_GENERAL_CATEGORY_DASH_PUNCTUATION => Some("HB_UNICODE_GENERAL_CATEGORY_DASH_PUNCTUATION")
      case HB_UNICODE_GENERAL_CATEGORY_CLOSE_PUNCTUATION => Some("HB_UNICODE_GENERAL_CATEGORY_CLOSE_PUNCTUATION")
      case HB_UNICODE_GENERAL_CATEGORY_FINAL_PUNCTUATION => Some("HB_UNICODE_GENERAL_CATEGORY_FINAL_PUNCTUATION")
      case HB_UNICODE_GENERAL_CATEGORY_INITIAL_PUNCTUATION => Some("HB_UNICODE_GENERAL_CATEGORY_INITIAL_PUNCTUATION")
      case HB_UNICODE_GENERAL_CATEGORY_OTHER_PUNCTUATION => Some("HB_UNICODE_GENERAL_CATEGORY_OTHER_PUNCTUATION")
      case HB_UNICODE_GENERAL_CATEGORY_OPEN_PUNCTUATION => Some("HB_UNICODE_GENERAL_CATEGORY_OPEN_PUNCTUATION")
      case HB_UNICODE_GENERAL_CATEGORY_CURRENCY_SYMBOL => Some("HB_UNICODE_GENERAL_CATEGORY_CURRENCY_SYMBOL")
      case HB_UNICODE_GENERAL_CATEGORY_MODIFIER_SYMBOL => Some("HB_UNICODE_GENERAL_CATEGORY_MODIFIER_SYMBOL")
      case HB_UNICODE_GENERAL_CATEGORY_MATH_SYMBOL => Some("HB_UNICODE_GENERAL_CATEGORY_MATH_SYMBOL")
      case HB_UNICODE_GENERAL_CATEGORY_OTHER_SYMBOL => Some("HB_UNICODE_GENERAL_CATEGORY_OTHER_SYMBOL")
      case HB_UNICODE_GENERAL_CATEGORY_LINE_SEPARATOR => Some("HB_UNICODE_GENERAL_CATEGORY_LINE_SEPARATOR")
      case HB_UNICODE_GENERAL_CATEGORY_PARAGRAPH_SEPARATOR => Some("HB_UNICODE_GENERAL_CATEGORY_PARAGRAPH_SEPARATOR")
      case HB_UNICODE_GENERAL_CATEGORY_SPACE_SEPARATOR => Some("HB_UNICODE_GENERAL_CATEGORY_SPACE_SEPARATOR")
      case _ => None
  extension (a: hb_unicode_general_category_t)
    inline def &(b: hb_unicode_general_category_t): hb_unicode_general_category_t = a & b
    inline def |(b: hb_unicode_general_category_t): hb_unicode_general_category_t = a | b
    inline def is(b: hb_unicode_general_category_t): Boolean = (a & b) == b

