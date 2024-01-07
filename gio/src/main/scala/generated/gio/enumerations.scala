package gio
package enumerations

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

private[gio] trait CEnum[T](using eq: T =:= Int):
  given Tag[T] = Tag.Int.asInstanceOf[Tag[T]]
  extension (inline t: T) 
    inline def int: CInt = eq.apply(t)
    inline def value: CInt = eq.apply(t)
private[gio] trait CEnumU[T](using eq: T =:= UInt):
  given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
  extension (inline t: T)
   inline def int: CInt = eq.apply(t).toInt
   inline def uint: CUnsignedInt = eq.apply(t)
   inline def value: CUnsignedInt = eq.apply(t)
/**
 * GAppInfoCreateFlags: _APP_INFO_CREATE_NONE: No flags. _APP_INFO_CREATE_NEEDS_TERMINAL: Application opens in a terminal window. _APP_INFO_CREATE_SUPPORTS_URIS: Application supports URI arguments. _APP_INFO_CREATE_SUPPORTS_STARTUP_NOTIFICATION: Application supports startup notification. Since 2.26

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GAppInfoCreateFlags = CUnsignedInt
object GAppInfoCreateFlags extends CEnumU[GAppInfoCreateFlags]:
  given _tag: Tag[GAppInfoCreateFlags] = Tag.UInt
  inline def define(inline a: Long): GAppInfoCreateFlags = a.toUInt
  val G_APP_INFO_CREATE_NONE = define(0)
  val G_APP_INFO_CREATE_NEEDS_TERMINAL = define(1)
  val G_APP_INFO_CREATE_SUPPORTS_URIS = define(2)
  val G_APP_INFO_CREATE_SUPPORTS_STARTUP_NOTIFICATION = define(4)
  inline def getName(inline value: GAppInfoCreateFlags): Option[String] =
    inline value match
      case G_APP_INFO_CREATE_NONE => Some("G_APP_INFO_CREATE_NONE")
      case G_APP_INFO_CREATE_NEEDS_TERMINAL => Some("G_APP_INFO_CREATE_NEEDS_TERMINAL")
      case G_APP_INFO_CREATE_SUPPORTS_URIS => Some("G_APP_INFO_CREATE_SUPPORTS_URIS")
      case G_APP_INFO_CREATE_SUPPORTS_STARTUP_NOTIFICATION => Some("G_APP_INFO_CREATE_SUPPORTS_STARTUP_NOTIFICATION")
      case _ => None
  extension (a: GAppInfoCreateFlags)
    inline def &(b: GAppInfoCreateFlags): GAppInfoCreateFlags = a & b
    inline def |(b: GAppInfoCreateFlags): GAppInfoCreateFlags = a | b
    inline def is(b: GAppInfoCreateFlags): Boolean = (a & b) == b

/**
 * GApplicationFlags: _APPLICATION_FLAGS_NONE: Default. Deprecated in 2.74, use %G_APPLICATION_DEFAULT_FLAGS instead _APPLICATION_DEFAULT_FLAGS: Default flags. Since: 2.74 _APPLICATION_IS_SERVICE: Run as a service. In this mode, registration fails if the service is already running, and the application will initially wait up to 10 seconds for an initial activation message to arrive. _APPLICATION_IS_LAUNCHER: Don't try to become the primary instance. _APPLICATION_HANDLES_OPEN: This application handles opening files (in the primary instance). Note that this flag only affects the default implementation of local_command_line(), and has no effect if %G_APPLICATION_HANDLES_COMMAND_LINE is given. See g_application_run() for details. _APPLICATION_HANDLES_COMMAND_LINE: This application handles command line arguments (in the primary instance). Note that this flag only affect the default implementation of local_command_line(). See g_application_run() for details. _APPLICATION_SEND_ENVIRONMENT: Send the environment of the launching process to the primary instance. Set this flag if your application is expected to behave differently depending on certain environment variables. For instance, an editor might be expected to use the `GIT_COMMITTER_NAME` environment variable when editing a git commit message. The environment is available to the #GApplication::command-line signal handler, via g_application_command_line_getenv(). _APPLICATION_NON_UNIQUE: Make no attempts to do any of the typical single-instance application negotiation, even if the application ID is given. The application neither attempts to become the owner of the application ID nor does it check if an existing owner already exists. Everything occurs in the local process. Since: 2.30. _APPLICATION_CAN_OVERRIDE_APP_ID: Allow users to override the application ID from the command line with `--gapplication-app-id`. Since: 2.48 _APPLICATION_ALLOW_REPLACEMENT: Allow another instance to take over the bus name. Since: 2.60 _APPLICATION_REPLACE: Take over from another instance. This flag is usually set by passing `--gapplication-replace` on the commandline. Since: 2.60

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GApplicationFlags = CUnsignedInt
object GApplicationFlags extends CEnumU[GApplicationFlags]:
  given _tag: Tag[GApplicationFlags] = Tag.UInt
  inline def define(inline a: Long): GApplicationFlags = a.toUInt
  val G_APPLICATION_FLAGS_NONE = define(0)
  val G_APPLICATION_DEFAULT_FLAGS = define(0)
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
    inline value match
      case G_APPLICATION_FLAGS_NONE => Some("G_APPLICATION_FLAGS_NONE")
      case G_APPLICATION_DEFAULT_FLAGS => Some("G_APPLICATION_DEFAULT_FLAGS")
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

/**
 * GAskPasswordFlags: _ASK_PASSWORD_NEED_PASSWORD: operation requires a password. _ASK_PASSWORD_NEED_USERNAME: operation requires a username. _ASK_PASSWORD_NEED_DOMAIN: operation requires a domain. _ASK_PASSWORD_SAVING_SUPPORTED: operation supports saving settings. _ASK_PASSWORD_ANONYMOUS_SUPPORTED: operation supports anonymous users. _ASK_PASSWORD_TCRYPT: operation takes TCRYPT parameters (Since: 2.58)

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
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
    inline value match
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

/**
 * GBusNameOwnerFlags: _BUS_NAME_OWNER_FLAGS_NONE: No flags set. _BUS_NAME_OWNER_FLAGS_ALLOW_REPLACEMENT: Allow another message bus connection to claim the name. _BUS_NAME_OWNER_FLAGS_REPLACE: If another message bus connection owns the name and have specified %G_BUS_NAME_OWNER_FLAGS_ALLOW_REPLACEMENT, then take the name from the other connection. _BUS_NAME_OWNER_FLAGS_DO_NOT_QUEUE: If another message bus connection owns the name, immediately return an error from g_bus_own_name() rather than entering the waiting queue for that name. (Since 2.54)

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GBusNameOwnerFlags = CUnsignedInt
object GBusNameOwnerFlags extends CEnumU[GBusNameOwnerFlags]:
  given _tag: Tag[GBusNameOwnerFlags] = Tag.UInt
  inline def define(inline a: Long): GBusNameOwnerFlags = a.toUInt
  val G_BUS_NAME_OWNER_FLAGS_NONE = define(0)
  val G_BUS_NAME_OWNER_FLAGS_ALLOW_REPLACEMENT = define(1)
  val G_BUS_NAME_OWNER_FLAGS_REPLACE = define(2)
  val G_BUS_NAME_OWNER_FLAGS_DO_NOT_QUEUE = define(4)
  inline def getName(inline value: GBusNameOwnerFlags): Option[String] =
    inline value match
      case G_BUS_NAME_OWNER_FLAGS_NONE => Some("G_BUS_NAME_OWNER_FLAGS_NONE")
      case G_BUS_NAME_OWNER_FLAGS_ALLOW_REPLACEMENT => Some("G_BUS_NAME_OWNER_FLAGS_ALLOW_REPLACEMENT")
      case G_BUS_NAME_OWNER_FLAGS_REPLACE => Some("G_BUS_NAME_OWNER_FLAGS_REPLACE")
      case G_BUS_NAME_OWNER_FLAGS_DO_NOT_QUEUE => Some("G_BUS_NAME_OWNER_FLAGS_DO_NOT_QUEUE")
      case _ => None
  extension (a: GBusNameOwnerFlags)
    inline def &(b: GBusNameOwnerFlags): GBusNameOwnerFlags = a & b
    inline def |(b: GBusNameOwnerFlags): GBusNameOwnerFlags = a | b
    inline def is(b: GBusNameOwnerFlags): Boolean = (a & b) == b

/**
 * GBusNameWatcherFlags: _BUS_NAME_WATCHER_FLAGS_NONE: No flags set. _BUS_NAME_WATCHER_FLAGS_AUTO_START: If no-one owns the name when beginning to watch the name, ask the bus to launch an owner for the name.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GBusNameWatcherFlags = CUnsignedInt
object GBusNameWatcherFlags extends CEnumU[GBusNameWatcherFlags]:
  given _tag: Tag[GBusNameWatcherFlags] = Tag.UInt
  inline def define(inline a: Long): GBusNameWatcherFlags = a.toUInt
  val G_BUS_NAME_WATCHER_FLAGS_NONE = define(0)
  val G_BUS_NAME_WATCHER_FLAGS_AUTO_START = define(1)
  inline def getName(inline value: GBusNameWatcherFlags): Option[String] =
    inline value match
      case G_BUS_NAME_WATCHER_FLAGS_NONE => Some("G_BUS_NAME_WATCHER_FLAGS_NONE")
      case G_BUS_NAME_WATCHER_FLAGS_AUTO_START => Some("G_BUS_NAME_WATCHER_FLAGS_AUTO_START")
      case _ => None
  extension (a: GBusNameWatcherFlags)
    inline def &(b: GBusNameWatcherFlags): GBusNameWatcherFlags = a & b
    inline def |(b: GBusNameWatcherFlags): GBusNameWatcherFlags = a | b
    inline def is(b: GBusNameWatcherFlags): Boolean = (a & b) == b

/**
 * GBusType: _BUS_TYPE_STARTER: An alias for the message bus that activated the process, if any. _BUS_TYPE_NONE: Not a message bus. _BUS_TYPE_SYSTEM: The system-wide message bus. _BUS_TYPE_SESSION: The login session message bus.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GBusType = CInt
object GBusType extends CEnum[GBusType]:
  given _tag: Tag[GBusType] = Tag.Int
  inline def define(inline a: CInt): GBusType = a
  val G_BUS_TYPE_STARTER = define(-1)
  val G_BUS_TYPE_NONE = define(0)
  val G_BUS_TYPE_SYSTEM = define(1)
  val G_BUS_TYPE_SESSION = define(2)
  inline def getName(inline value: GBusType): Option[String] =
    inline value match
      case G_BUS_TYPE_STARTER => Some("G_BUS_TYPE_STARTER")
      case G_BUS_TYPE_NONE => Some("G_BUS_TYPE_NONE")
      case G_BUS_TYPE_SYSTEM => Some("G_BUS_TYPE_SYSTEM")
      case G_BUS_TYPE_SESSION => Some("G_BUS_TYPE_SESSION")
      case _ => None
  extension (a: GBusType)
    inline def &(b: GBusType): GBusType = a & b
    inline def |(b: GBusType): GBusType = a | b
    inline def is(b: GBusType): Boolean = (a & b) == b

/**
 * GConverterFlags: _CONVERTER_NO_FLAGS: No flags. _CONVERTER_INPUT_AT_END: At end of input data _CONVERTER_FLUSH: Flush data

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GConverterFlags = CUnsignedInt
object GConverterFlags extends CEnumU[GConverterFlags]:
  given _tag: Tag[GConverterFlags] = Tag.UInt
  inline def define(inline a: Long): GConverterFlags = a.toUInt
  val G_CONVERTER_NO_FLAGS = define(0)
  val G_CONVERTER_INPUT_AT_END = define(1)
  val G_CONVERTER_FLUSH = define(2)
  inline def getName(inline value: GConverterFlags): Option[String] =
    inline value match
      case G_CONVERTER_NO_FLAGS => Some("G_CONVERTER_NO_FLAGS")
      case G_CONVERTER_INPUT_AT_END => Some("G_CONVERTER_INPUT_AT_END")
      case G_CONVERTER_FLUSH => Some("G_CONVERTER_FLUSH")
      case _ => None
  extension (a: GConverterFlags)
    inline def &(b: GConverterFlags): GConverterFlags = a & b
    inline def |(b: GConverterFlags): GConverterFlags = a | b
    inline def is(b: GConverterFlags): Boolean = (a & b) == b

/**
 * GConverterResult: _CONVERTER_ERROR: There was an error during conversion. _CONVERTER_CONVERTED: Some data was consumed or produced _CONVERTER_FINISHED: The conversion is finished _CONVERTER_FLUSHED: Flushing is finished

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GConverterResult = CUnsignedInt
object GConverterResult extends CEnumU[GConverterResult]:
  given _tag: Tag[GConverterResult] = Tag.UInt
  inline def define(inline a: Long): GConverterResult = a.toUInt
  val G_CONVERTER_ERROR = define(0)
  val G_CONVERTER_CONVERTED = define(1)
  val G_CONVERTER_FINISHED = define(2)
  val G_CONVERTER_FLUSHED = define(3)
  inline def getName(inline value: GConverterResult): Option[String] =
    inline value match
      case G_CONVERTER_ERROR => Some("G_CONVERTER_ERROR")
      case G_CONVERTER_CONVERTED => Some("G_CONVERTER_CONVERTED")
      case G_CONVERTER_FINISHED => Some("G_CONVERTER_FINISHED")
      case G_CONVERTER_FLUSHED => Some("G_CONVERTER_FLUSHED")
      case _ => None
  extension (a: GConverterResult)
    inline def &(b: GConverterResult): GConverterResult = a & b
    inline def |(b: GConverterResult): GConverterResult = a | b
    inline def is(b: GConverterResult): Boolean = (a & b) == b

/**
 * GCredentialsType: _CREDENTIALS_TYPE_INVALID: Indicates an invalid native credential type. _CREDENTIALS_TYPE_LINUX_UCRED: The native credentials type is a `struct ucred`. _CREDENTIALS_TYPE_FREEBSD_CMSGCRED: The native credentials type is a `struct cmsgcred`. _CREDENTIALS_TYPE_OPENBSD_SOCKPEERCRED: The native credentials type is a `struct sockpeercred`. Added in 2.30. _CREDENTIALS_TYPE_SOLARIS_UCRED: The native credentials type is a `ucred_t`. Added in 2.40. _CREDENTIALS_TYPE_NETBSD_UNPCBID: The native credentials type is a `struct unpcbid`. Added in 2.42. _CREDENTIALS_TYPE_APPLE_XUCRED: The native credentials type is a `struct xucred`. Added in 2.66. _CREDENTIALS_TYPE_WIN32_PID: The native credentials type is a PID `DWORD`. Added in 2.72.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
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
    inline value match
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

/**
 * GDBusCallFlags: _DBUS_CALL_FLAGS_NONE: No flags set. _DBUS_CALL_FLAGS_NO_AUTO_START: The bus must not launch an owner for the destination name in response to this method invocation. _DBUS_CALL_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION: the caller is prepared to wait for interactive authorization. Since 2.46.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GDBusCallFlags = CUnsignedInt
object GDBusCallFlags extends CEnumU[GDBusCallFlags]:
  given _tag: Tag[GDBusCallFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusCallFlags = a.toUInt
  val G_DBUS_CALL_FLAGS_NONE = define(0)
  val G_DBUS_CALL_FLAGS_NO_AUTO_START = define(1)
  val G_DBUS_CALL_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION = define(2)
  inline def getName(inline value: GDBusCallFlags): Option[String] =
    inline value match
      case G_DBUS_CALL_FLAGS_NONE => Some("G_DBUS_CALL_FLAGS_NONE")
      case G_DBUS_CALL_FLAGS_NO_AUTO_START => Some("G_DBUS_CALL_FLAGS_NO_AUTO_START")
      case G_DBUS_CALL_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION => Some("G_DBUS_CALL_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION")
      case _ => None
  extension (a: GDBusCallFlags)
    inline def &(b: GDBusCallFlags): GDBusCallFlags = a & b
    inline def |(b: GDBusCallFlags): GDBusCallFlags = a | b
    inline def is(b: GDBusCallFlags): Boolean = (a & b) == b

/**
 * GDBusCapabilityFlags: _DBUS_CAPABILITY_FLAGS_NONE: No flags set. _DBUS_CAPABILITY_FLAGS_UNIX_FD_PASSING: The connection supports exchanging UNIX file descriptors with the remote peer.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GDBusCapabilityFlags = CUnsignedInt
object GDBusCapabilityFlags extends CEnumU[GDBusCapabilityFlags]:
  given _tag: Tag[GDBusCapabilityFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusCapabilityFlags = a.toUInt
  val G_DBUS_CAPABILITY_FLAGS_NONE = define(0)
  val G_DBUS_CAPABILITY_FLAGS_UNIX_FD_PASSING = define(1)
  inline def getName(inline value: GDBusCapabilityFlags): Option[String] =
    inline value match
      case G_DBUS_CAPABILITY_FLAGS_NONE => Some("G_DBUS_CAPABILITY_FLAGS_NONE")
      case G_DBUS_CAPABILITY_FLAGS_UNIX_FD_PASSING => Some("G_DBUS_CAPABILITY_FLAGS_UNIX_FD_PASSING")
      case _ => None
  extension (a: GDBusCapabilityFlags)
    inline def &(b: GDBusCapabilityFlags): GDBusCapabilityFlags = a & b
    inline def |(b: GDBusCapabilityFlags): GDBusCapabilityFlags = a | b
    inline def is(b: GDBusCapabilityFlags): Boolean = (a & b) == b

/**
 * GDBusConnectionFlags: _DBUS_CONNECTION_FLAGS_NONE: No flags set. _DBUS_CONNECTION_FLAGS_AUTHENTICATION_CLIENT: Perform authentication against server. _DBUS_CONNECTION_FLAGS_AUTHENTICATION_SERVER: Perform authentication against client. _DBUS_CONNECTION_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS: When authenticating as a server, allow the anonymous authentication method. _DBUS_CONNECTION_FLAGS_MESSAGE_BUS_CONNECTION: Pass this flag if connecting to a peer that is a message bus. This means that the Hello() method will be invoked as part of the connection setup. _DBUS_CONNECTION_FLAGS_DELAY_MESSAGE_PROCESSING: If set, processing of D-Bus messages is delayed until g_dbus_connection_start_message_processing() is called. _DBUS_CONNECTION_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER: When authenticating as a server, require the UID of the peer to be the same as the UID of the server. (Since: 2.68) _DBUS_CONNECTION_FLAGS_CROSS_NAMESPACE: When authenticating, try to use protocols that work across a Linux user namespace boundary, even if this reduces interoperability with older D-Bus implementations. This currently affects client-side `EXTERNAL` authentication, for which this flag makes connections to a server in another user namespace succeed, but causes a deadlock when connecting to a GDBus server older than 2.73.3. Since: 2.74

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
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
  val G_DBUS_CONNECTION_FLAGS_CROSS_NAMESPACE = define(64)
  inline def getName(inline value: GDBusConnectionFlags): Option[String] =
    inline value match
      case G_DBUS_CONNECTION_FLAGS_NONE => Some("G_DBUS_CONNECTION_FLAGS_NONE")
      case G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_CLIENT => Some("G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_CLIENT")
      case G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_SERVER => Some("G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_SERVER")
      case G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS => Some("G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS")
      case G_DBUS_CONNECTION_FLAGS_MESSAGE_BUS_CONNECTION => Some("G_DBUS_CONNECTION_FLAGS_MESSAGE_BUS_CONNECTION")
      case G_DBUS_CONNECTION_FLAGS_DELAY_MESSAGE_PROCESSING => Some("G_DBUS_CONNECTION_FLAGS_DELAY_MESSAGE_PROCESSING")
      case G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER => Some("G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER")
      case G_DBUS_CONNECTION_FLAGS_CROSS_NAMESPACE => Some("G_DBUS_CONNECTION_FLAGS_CROSS_NAMESPACE")
      case _ => None
  extension (a: GDBusConnectionFlags)
    inline def &(b: GDBusConnectionFlags): GDBusConnectionFlags = a & b
    inline def |(b: GDBusConnectionFlags): GDBusConnectionFlags = a | b
    inline def is(b: GDBusConnectionFlags): Boolean = (a & b) == b

/**
 * GDBusError: _DBUS_ERROR_FAILED: A generic error; "something went wrong" - see the error message for more. _DBUS_ERROR_NO_MEMORY: There was not enough memory to complete an operation. _DBUS_ERROR_SERVICE_UNKNOWN: The bus doesn't know how to launch a service to supply the bus name you wanted. _DBUS_ERROR_NAME_HAS_NO_OWNER: The bus name you referenced doesn't exist (i.e. no application owns it). _DBUS_ERROR_NO_REPLY: No reply to a message expecting one, usually means a timeout occurred. _DBUS_ERROR_IO_ERROR: Something went wrong reading or writing to a socket, for example. _DBUS_ERROR_BAD_ADDRESS: A D-Bus bus address was malformed. _DBUS_ERROR_NOT_SUPPORTED: Requested operation isn't supported (like ENOSYS on UNIX). _DBUS_ERROR_LIMITS_EXCEEDED: Some limited resource is exhausted. _DBUS_ERROR_ACCESS_DENIED: Security restrictions don't allow doing what you're trying to do. _DBUS_ERROR_AUTH_FAILED: Authentication didn't work. _DBUS_ERROR_NO_SERVER: Unable to connect to server (probably caused by ECONNREFUSED on a socket). _DBUS_ERROR_TIMEOUT: Certain timeout errors, possibly ETIMEDOUT on a socket. Note that %G_DBUS_ERROR_NO_REPLY is used for message reply timeouts. Warning: this is confusingly-named given that %G_DBUS_ERROR_TIMED_OUT also exists. We can't fix it for compatibility reasons so just be careful. _DBUS_ERROR_NO_NETWORK: No network access (probably ENETUNREACH on a socket). _DBUS_ERROR_ADDRESS_IN_USE: Can't bind a socket since its address is in use (i.e. EADDRINUSE). _DBUS_ERROR_DISCONNECTED: The connection is disconnected and you're trying to use it. _DBUS_ERROR_INVALID_ARGS: Invalid arguments passed to a method call. _DBUS_ERROR_FILE_NOT_FOUND: Missing file. _DBUS_ERROR_FILE_EXISTS: Existing file and the operation you're using does not silently overwrite. _DBUS_ERROR_UNKNOWN_METHOD: Method name you invoked isn't known by the object you invoked it on. _DBUS_ERROR_UNKNOWN_OBJECT: Object you invoked a method on isn't known. Since 2.42 _DBUS_ERROR_UNKNOWN_INTERFACE: Interface you invoked a method on isn't known by the object. Since 2.42 _DBUS_ERROR_UNKNOWN_PROPERTY: Property you tried to access isn't known by the object. Since 2.42 _DBUS_ERROR_PROPERTY_READ_ONLY: Property you tried to set is read-only. Since 2.42 _DBUS_ERROR_TIMED_OUT: Certain timeout errors, e.g. while starting a service. Warning: this is confusingly-named given that %G_DBUS_ERROR_TIMEOUT also exists. We can't fix it for compatibility reasons so just be careful. _DBUS_ERROR_MATCH_RULE_NOT_FOUND: Tried to remove or modify a match rule that didn't exist. _DBUS_ERROR_MATCH_RULE_INVALID: The match rule isn't syntactically valid. _DBUS_ERROR_SPAWN_EXEC_FAILED: While starting a new process, the exec() call failed. _DBUS_ERROR_SPAWN_FORK_FAILED: While starting a new process, the fork() call failed. _DBUS_ERROR_SPAWN_CHILD_EXITED: While starting a new process, the child exited with a status code. _DBUS_ERROR_SPAWN_CHILD_SIGNALED: While starting a new process, the child exited on a signal. _DBUS_ERROR_SPAWN_FAILED: While starting a new process, something went wrong. _DBUS_ERROR_SPAWN_SETUP_FAILED: We failed to setup the environment correctly. _DBUS_ERROR_SPAWN_CONFIG_INVALID: We failed to setup the config parser correctly. _DBUS_ERROR_SPAWN_SERVICE_INVALID: Bus name was not valid. _DBUS_ERROR_SPAWN_SERVICE_NOT_FOUND: Service file not found in system-services directory. _DBUS_ERROR_SPAWN_PERMISSIONS_INVALID: Permissions are incorrect on the setuid helper. _DBUS_ERROR_SPAWN_FILE_INVALID: Service file invalid (Name, User or Exec missing). _DBUS_ERROR_SPAWN_NO_MEMORY: Tried to get a UNIX process ID and it wasn't available. _DBUS_ERROR_UNIX_PROCESS_ID_UNKNOWN: Tried to get a UNIX process ID and it wasn't available. _DBUS_ERROR_INVALID_SIGNATURE: A type signature is not valid. _DBUS_ERROR_INVALID_FILE_CONTENT: A file contains invalid syntax or is otherwise broken. _DBUS_ERROR_SELINUX_SECURITY_CONTEXT_UNKNOWN: Asked for SELinux security context and it wasn't available. _DBUS_ERROR_ADT_AUDIT_DATA_UNKNOWN: Asked for ADT audit data and it wasn't available. _DBUS_ERROR_OBJECT_PATH_IN_USE: There's already an object with the requested object path.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
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
    inline value match
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

/**
 * GDBusInterfaceSkeletonFlags: _DBUS_INTERFACE_SKELETON_FLAGS_NONE: No flags set. _DBUS_INTERFACE_SKELETON_FLAGS_HANDLE_METHOD_INVOCATIONS_IN_THREAD: Each method invocation is handled in a thread dedicated to the invocation. This means that the method implementation can use blocking IO without blocking any other part of the process. It also means that the method implementation must use locking to access data structures used by other threads.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GDBusInterfaceSkeletonFlags = CUnsignedInt
object GDBusInterfaceSkeletonFlags extends CEnumU[GDBusInterfaceSkeletonFlags]:
  given _tag: Tag[GDBusInterfaceSkeletonFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusInterfaceSkeletonFlags = a.toUInt
  val G_DBUS_INTERFACE_SKELETON_FLAGS_NONE = define(0)
  val G_DBUS_INTERFACE_SKELETON_FLAGS_HANDLE_METHOD_INVOCATIONS_IN_THREAD = define(1)
  inline def getName(inline value: GDBusInterfaceSkeletonFlags): Option[String] =
    inline value match
      case G_DBUS_INTERFACE_SKELETON_FLAGS_NONE => Some("G_DBUS_INTERFACE_SKELETON_FLAGS_NONE")
      case G_DBUS_INTERFACE_SKELETON_FLAGS_HANDLE_METHOD_INVOCATIONS_IN_THREAD => Some("G_DBUS_INTERFACE_SKELETON_FLAGS_HANDLE_METHOD_INVOCATIONS_IN_THREAD")
      case _ => None
  extension (a: GDBusInterfaceSkeletonFlags)
    inline def &(b: GDBusInterfaceSkeletonFlags): GDBusInterfaceSkeletonFlags = a & b
    inline def |(b: GDBusInterfaceSkeletonFlags): GDBusInterfaceSkeletonFlags = a | b
    inline def is(b: GDBusInterfaceSkeletonFlags): Boolean = (a & b) == b

/**
 * GDBusMessageByteOrder: _DBUS_MESSAGE_BYTE_ORDER_BIG_ENDIAN: The byte order is big endian. _DBUS_MESSAGE_BYTE_ORDER_LITTLE_ENDIAN: The byte order is little endian.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GDBusMessageByteOrder = CUnsignedInt
object GDBusMessageByteOrder extends CEnumU[GDBusMessageByteOrder]:
  given _tag: Tag[GDBusMessageByteOrder] = Tag.UInt
  inline def define(inline a: Long): GDBusMessageByteOrder = a.toUInt
  val G_DBUS_MESSAGE_BYTE_ORDER_BIG_ENDIAN = define(66)
  val G_DBUS_MESSAGE_BYTE_ORDER_LITTLE_ENDIAN = define(108)
  inline def getName(inline value: GDBusMessageByteOrder): Option[String] =
    inline value match
      case G_DBUS_MESSAGE_BYTE_ORDER_BIG_ENDIAN => Some("G_DBUS_MESSAGE_BYTE_ORDER_BIG_ENDIAN")
      case G_DBUS_MESSAGE_BYTE_ORDER_LITTLE_ENDIAN => Some("G_DBUS_MESSAGE_BYTE_ORDER_LITTLE_ENDIAN")
      case _ => None
  extension (a: GDBusMessageByteOrder)
    inline def &(b: GDBusMessageByteOrder): GDBusMessageByteOrder = a & b
    inline def |(b: GDBusMessageByteOrder): GDBusMessageByteOrder = a | b
    inline def is(b: GDBusMessageByteOrder): Boolean = (a & b) == b

/**
 * GDBusMessageFlags: _DBUS_MESSAGE_FLAGS_NONE: No flags set. _DBUS_MESSAGE_FLAGS_NO_REPLY_EXPECTED: A reply is not expected. _DBUS_MESSAGE_FLAGS_NO_AUTO_START: The bus must not launch an owner for the destination name in response to this message. _DBUS_MESSAGE_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION: If set on a method call, this flag means that the caller is prepared to wait for interactive authorization. Since 2.46.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GDBusMessageFlags = CUnsignedInt
object GDBusMessageFlags extends CEnumU[GDBusMessageFlags]:
  given _tag: Tag[GDBusMessageFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusMessageFlags = a.toUInt
  val G_DBUS_MESSAGE_FLAGS_NONE = define(0)
  val G_DBUS_MESSAGE_FLAGS_NO_REPLY_EXPECTED = define(1)
  val G_DBUS_MESSAGE_FLAGS_NO_AUTO_START = define(2)
  val G_DBUS_MESSAGE_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION = define(4)
  inline def getName(inline value: GDBusMessageFlags): Option[String] =
    inline value match
      case G_DBUS_MESSAGE_FLAGS_NONE => Some("G_DBUS_MESSAGE_FLAGS_NONE")
      case G_DBUS_MESSAGE_FLAGS_NO_REPLY_EXPECTED => Some("G_DBUS_MESSAGE_FLAGS_NO_REPLY_EXPECTED")
      case G_DBUS_MESSAGE_FLAGS_NO_AUTO_START => Some("G_DBUS_MESSAGE_FLAGS_NO_AUTO_START")
      case G_DBUS_MESSAGE_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION => Some("G_DBUS_MESSAGE_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION")
      case _ => None
  extension (a: GDBusMessageFlags)
    inline def &(b: GDBusMessageFlags): GDBusMessageFlags = a & b
    inline def |(b: GDBusMessageFlags): GDBusMessageFlags = a | b
    inline def is(b: GDBusMessageFlags): Boolean = (a & b) == b

/**
 * GDBusMessageHeaderField: _DBUS_MESSAGE_HEADER_FIELD_INVALID: Not a valid header field. _DBUS_MESSAGE_HEADER_FIELD_PATH: The object path. _DBUS_MESSAGE_HEADER_FIELD_INTERFACE: The interface name. _DBUS_MESSAGE_HEADER_FIELD_MEMBER: The method or signal name. _DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME: The name of the error that occurred. _DBUS_MESSAGE_HEADER_FIELD_REPLY_SERIAL: The serial number the message is a reply to. _DBUS_MESSAGE_HEADER_FIELD_DESTINATION: The name the message is intended for. _DBUS_MESSAGE_HEADER_FIELD_SENDER: Unique name of the sender of the message (filled in by the bus). _DBUS_MESSAGE_HEADER_FIELD_SIGNATURE: The signature of the message body. _DBUS_MESSAGE_HEADER_FIELD_NUM_UNIX_FDS: The number of UNIX file descriptors that accompany the message.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
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
    inline value match
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

/**
 * GDBusMessageType: _DBUS_MESSAGE_TYPE_INVALID: Message is of invalid type. _DBUS_MESSAGE_TYPE_METHOD_CALL: Method call. _DBUS_MESSAGE_TYPE_METHOD_RETURN: Method reply. _DBUS_MESSAGE_TYPE_ERROR: Error reply. _DBUS_MESSAGE_TYPE_SIGNAL: Signal emission.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
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
    inline value match
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

/**
 * GDBusObjectManagerClientFlags: _DBUS_OBJECT_MANAGER_CLIENT_FLAGS_NONE: No flags set. _DBUS_OBJECT_MANAGER_CLIENT_FLAGS_DO_NOT_AUTO_START: If not set and the manager is for a well-known name, then request the bus to launch an owner for the name if no-one owns the name. This flag can only be used in managers for well-known names.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GDBusObjectManagerClientFlags = CUnsignedInt
object GDBusObjectManagerClientFlags extends CEnumU[GDBusObjectManagerClientFlags]:
  given _tag: Tag[GDBusObjectManagerClientFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusObjectManagerClientFlags = a.toUInt
  val G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_NONE = define(0)
  val G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_DO_NOT_AUTO_START = define(1)
  inline def getName(inline value: GDBusObjectManagerClientFlags): Option[String] =
    inline value match
      case G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_NONE => Some("G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_NONE")
      case G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_DO_NOT_AUTO_START => Some("G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_DO_NOT_AUTO_START")
      case _ => None
  extension (a: GDBusObjectManagerClientFlags)
    inline def &(b: GDBusObjectManagerClientFlags): GDBusObjectManagerClientFlags = a & b
    inline def |(b: GDBusObjectManagerClientFlags): GDBusObjectManagerClientFlags = a | b
    inline def is(b: GDBusObjectManagerClientFlags): Boolean = (a & b) == b

/**
 * GDBusPropertyInfoFlags: _DBUS_PROPERTY_INFO_FLAGS_NONE: No flags set. _DBUS_PROPERTY_INFO_FLAGS_READABLE: Property is readable. _DBUS_PROPERTY_INFO_FLAGS_WRITABLE: Property is writable.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GDBusPropertyInfoFlags = CUnsignedInt
object GDBusPropertyInfoFlags extends CEnumU[GDBusPropertyInfoFlags]:
  given _tag: Tag[GDBusPropertyInfoFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusPropertyInfoFlags = a.toUInt
  val G_DBUS_PROPERTY_INFO_FLAGS_NONE = define(0)
  val G_DBUS_PROPERTY_INFO_FLAGS_READABLE = define(1)
  val G_DBUS_PROPERTY_INFO_FLAGS_WRITABLE = define(2)
  inline def getName(inline value: GDBusPropertyInfoFlags): Option[String] =
    inline value match
      case G_DBUS_PROPERTY_INFO_FLAGS_NONE => Some("G_DBUS_PROPERTY_INFO_FLAGS_NONE")
      case G_DBUS_PROPERTY_INFO_FLAGS_READABLE => Some("G_DBUS_PROPERTY_INFO_FLAGS_READABLE")
      case G_DBUS_PROPERTY_INFO_FLAGS_WRITABLE => Some("G_DBUS_PROPERTY_INFO_FLAGS_WRITABLE")
      case _ => None
  extension (a: GDBusPropertyInfoFlags)
    inline def &(b: GDBusPropertyInfoFlags): GDBusPropertyInfoFlags = a & b
    inline def |(b: GDBusPropertyInfoFlags): GDBusPropertyInfoFlags = a | b
    inline def is(b: GDBusPropertyInfoFlags): Boolean = (a & b) == b

/**
 * GDBusProxyFlags: _DBUS_PROXY_FLAGS_NONE: No flags set. _DBUS_PROXY_FLAGS_DO_NOT_LOAD_PROPERTIES: Don't load properties. _DBUS_PROXY_FLAGS_DO_NOT_CONNECT_SIGNALS: Don't connect to signals on the remote object. _DBUS_PROXY_FLAGS_DO_NOT_AUTO_START: If the proxy is for a well-known name, do not ask the bus to launch an owner during proxy initialization or a method call. This flag is only meaningful in proxies for well-known names. _DBUS_PROXY_FLAGS_GET_INVALIDATED_PROPERTIES: If set, the property value for any __invalidated property__ will be (asynchronously) retrieved upon receiving the [`PropertiesChanged`](http://dbus.freedesktop.org/doc/dbus-specification.html#standard-interfaces-properties) D-Bus signal and the property will not cause emission of the #GDBusProxy::g-properties-changed signal. When the value is received the #GDBusProxy::g-properties-changed signal is emitted for the property along with the retrieved value. Since 2.32. _DBUS_PROXY_FLAGS_DO_NOT_AUTO_START_AT_CONSTRUCTION: If the proxy is for a well-known name, do not ask the bus to launch an owner during proxy initialization, but allow it to be autostarted by a method call. This flag is only meaningful in proxies for well-known names, and only if %G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START is not also specified. _DBUS_PROXY_FLAGS_NO_MATCH_RULE: Don't actually send the AddMatch D-Bus call for this signal subscription. This gives you more control over which match rules you add (but you must add them manually). (Since: 2.72)

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
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
    inline value match
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

/**
 * GDBusSendMessageFlags: _DBUS_SEND_MESSAGE_FLAGS_NONE: No flags set. _DBUS_SEND_MESSAGE_FLAGS_PRESERVE_SERIAL: Do not automatically assign a serial number from the #GDBusConnection object when sending a message.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GDBusSendMessageFlags = CUnsignedInt
object GDBusSendMessageFlags extends CEnumU[GDBusSendMessageFlags]:
  given _tag: Tag[GDBusSendMessageFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusSendMessageFlags = a.toUInt
  val G_DBUS_SEND_MESSAGE_FLAGS_NONE = define(0)
  val G_DBUS_SEND_MESSAGE_FLAGS_PRESERVE_SERIAL = define(1)
  inline def getName(inline value: GDBusSendMessageFlags): Option[String] =
    inline value match
      case G_DBUS_SEND_MESSAGE_FLAGS_NONE => Some("G_DBUS_SEND_MESSAGE_FLAGS_NONE")
      case G_DBUS_SEND_MESSAGE_FLAGS_PRESERVE_SERIAL => Some("G_DBUS_SEND_MESSAGE_FLAGS_PRESERVE_SERIAL")
      case _ => None
  extension (a: GDBusSendMessageFlags)
    inline def &(b: GDBusSendMessageFlags): GDBusSendMessageFlags = a & b
    inline def |(b: GDBusSendMessageFlags): GDBusSendMessageFlags = a | b
    inline def is(b: GDBusSendMessageFlags): Boolean = (a & b) == b

/**
 * GDBusServerFlags: _DBUS_SERVER_FLAGS_NONE: No flags set. _DBUS_SERVER_FLAGS_RUN_IN_THREAD: All #GDBusServer::new-connection signals will run in separated dedicated threads (see signal for details). _DBUS_SERVER_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS: Allow the anonymous authentication method. _DBUS_SERVER_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER: Require the UID of the peer to be the same as the UID of the server when authenticating. (Since: 2.68)

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GDBusServerFlags = CUnsignedInt
object GDBusServerFlags extends CEnumU[GDBusServerFlags]:
  given _tag: Tag[GDBusServerFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusServerFlags = a.toUInt
  val G_DBUS_SERVER_FLAGS_NONE = define(0)
  val G_DBUS_SERVER_FLAGS_RUN_IN_THREAD = define(1)
  val G_DBUS_SERVER_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS = define(2)
  val G_DBUS_SERVER_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER = define(4)
  inline def getName(inline value: GDBusServerFlags): Option[String] =
    inline value match
      case G_DBUS_SERVER_FLAGS_NONE => Some("G_DBUS_SERVER_FLAGS_NONE")
      case G_DBUS_SERVER_FLAGS_RUN_IN_THREAD => Some("G_DBUS_SERVER_FLAGS_RUN_IN_THREAD")
      case G_DBUS_SERVER_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS => Some("G_DBUS_SERVER_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS")
      case G_DBUS_SERVER_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER => Some("G_DBUS_SERVER_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER")
      case _ => None
  extension (a: GDBusServerFlags)
    inline def &(b: GDBusServerFlags): GDBusServerFlags = a & b
    inline def |(b: GDBusServerFlags): GDBusServerFlags = a | b
    inline def is(b: GDBusServerFlags): Boolean = (a & b) == b

/**
 * GDBusSignalFlags: _DBUS_SIGNAL_FLAGS_NONE: No flags set. _DBUS_SIGNAL_FLAGS_NO_MATCH_RULE: Don't actually send the AddMatch D-Bus call for this signal subscription. This gives you more control over which match rules you add (but you must add them manually). _DBUS_SIGNAL_FLAGS_MATCH_ARG0_NAMESPACE: Match first arguments that contain a bus or interface name with the given namespace. _DBUS_SIGNAL_FLAGS_MATCH_ARG0_PATH: Match first arguments that contain an object path that is either equivalent to the given path, or one of the paths is a subpath of the other.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GDBusSignalFlags = CUnsignedInt
object GDBusSignalFlags extends CEnumU[GDBusSignalFlags]:
  given _tag: Tag[GDBusSignalFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusSignalFlags = a.toUInt
  val G_DBUS_SIGNAL_FLAGS_NONE = define(0)
  val G_DBUS_SIGNAL_FLAGS_NO_MATCH_RULE = define(1)
  val G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_NAMESPACE = define(2)
  val G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_PATH = define(4)
  inline def getName(inline value: GDBusSignalFlags): Option[String] =
    inline value match
      case G_DBUS_SIGNAL_FLAGS_NONE => Some("G_DBUS_SIGNAL_FLAGS_NONE")
      case G_DBUS_SIGNAL_FLAGS_NO_MATCH_RULE => Some("G_DBUS_SIGNAL_FLAGS_NO_MATCH_RULE")
      case G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_NAMESPACE => Some("G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_NAMESPACE")
      case G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_PATH => Some("G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_PATH")
      case _ => None
  extension (a: GDBusSignalFlags)
    inline def &(b: GDBusSignalFlags): GDBusSignalFlags = a & b
    inline def |(b: GDBusSignalFlags): GDBusSignalFlags = a | b
    inline def is(b: GDBusSignalFlags): Boolean = (a & b) == b

/**
 * GDBusSubtreeFlags: _DBUS_SUBTREE_FLAGS_NONE: No flags set. _DBUS_SUBTREE_FLAGS_DISPATCH_TO_UNENUMERATED_NODES: Method calls to objects not in the enumerated range will still be dispatched. This is useful if you want to dynamically spawn objects in the subtree.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GDBusSubtreeFlags = CUnsignedInt
object GDBusSubtreeFlags extends CEnumU[GDBusSubtreeFlags]:
  given _tag: Tag[GDBusSubtreeFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusSubtreeFlags = a.toUInt
  val G_DBUS_SUBTREE_FLAGS_NONE = define(0)
  val G_DBUS_SUBTREE_FLAGS_DISPATCH_TO_UNENUMERATED_NODES = define(1)
  inline def getName(inline value: GDBusSubtreeFlags): Option[String] =
    inline value match
      case G_DBUS_SUBTREE_FLAGS_NONE => Some("G_DBUS_SUBTREE_FLAGS_NONE")
      case G_DBUS_SUBTREE_FLAGS_DISPATCH_TO_UNENUMERATED_NODES => Some("G_DBUS_SUBTREE_FLAGS_DISPATCH_TO_UNENUMERATED_NODES")
      case _ => None
  extension (a: GDBusSubtreeFlags)
    inline def &(b: GDBusSubtreeFlags): GDBusSubtreeFlags = a & b
    inline def |(b: GDBusSubtreeFlags): GDBusSubtreeFlags = a | b
    inline def is(b: GDBusSubtreeFlags): Boolean = (a & b) == b

/**
 * GDataStreamByteOrder: _DATA_STREAM_BYTE_ORDER_BIG_ENDIAN: Selects Big Endian byte order. _DATA_STREAM_BYTE_ORDER_LITTLE_ENDIAN: Selects Little Endian byte order. _DATA_STREAM_BYTE_ORDER_HOST_ENDIAN: Selects endianness based on host machine's architecture.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GDataStreamByteOrder = CUnsignedInt
object GDataStreamByteOrder extends CEnumU[GDataStreamByteOrder]:
  given _tag: Tag[GDataStreamByteOrder] = Tag.UInt
  inline def define(inline a: Long): GDataStreamByteOrder = a.toUInt
  val G_DATA_STREAM_BYTE_ORDER_BIG_ENDIAN = define(0)
  val G_DATA_STREAM_BYTE_ORDER_LITTLE_ENDIAN = define(1)
  val G_DATA_STREAM_BYTE_ORDER_HOST_ENDIAN = define(2)
  inline def getName(inline value: GDataStreamByteOrder): Option[String] =
    inline value match
      case G_DATA_STREAM_BYTE_ORDER_BIG_ENDIAN => Some("G_DATA_STREAM_BYTE_ORDER_BIG_ENDIAN")
      case G_DATA_STREAM_BYTE_ORDER_LITTLE_ENDIAN => Some("G_DATA_STREAM_BYTE_ORDER_LITTLE_ENDIAN")
      case G_DATA_STREAM_BYTE_ORDER_HOST_ENDIAN => Some("G_DATA_STREAM_BYTE_ORDER_HOST_ENDIAN")
      case _ => None
  extension (a: GDataStreamByteOrder)
    inline def &(b: GDataStreamByteOrder): GDataStreamByteOrder = a & b
    inline def |(b: GDataStreamByteOrder): GDataStreamByteOrder = a | b
    inline def is(b: GDataStreamByteOrder): Boolean = (a & b) == b

/**
 * GDataStreamNewlineType: _DATA_STREAM_NEWLINE_TYPE_LF: Selects "LF" line endings, common on most modern UNIX platforms. _DATA_STREAM_NEWLINE_TYPE_CR: Selects "CR" line endings. _DATA_STREAM_NEWLINE_TYPE_CR_LF: Selects "CR, LF" line ending, common on Microsoft Windows. _DATA_STREAM_NEWLINE_TYPE_ANY: Automatically try to handle any line ending type.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GDataStreamNewlineType = CUnsignedInt
object GDataStreamNewlineType extends CEnumU[GDataStreamNewlineType]:
  given _tag: Tag[GDataStreamNewlineType] = Tag.UInt
  inline def define(inline a: Long): GDataStreamNewlineType = a.toUInt
  val G_DATA_STREAM_NEWLINE_TYPE_LF = define(0)
  val G_DATA_STREAM_NEWLINE_TYPE_CR = define(1)
  val G_DATA_STREAM_NEWLINE_TYPE_CR_LF = define(2)
  val G_DATA_STREAM_NEWLINE_TYPE_ANY = define(3)
  inline def getName(inline value: GDataStreamNewlineType): Option[String] =
    inline value match
      case G_DATA_STREAM_NEWLINE_TYPE_LF => Some("G_DATA_STREAM_NEWLINE_TYPE_LF")
      case G_DATA_STREAM_NEWLINE_TYPE_CR => Some("G_DATA_STREAM_NEWLINE_TYPE_CR")
      case G_DATA_STREAM_NEWLINE_TYPE_CR_LF => Some("G_DATA_STREAM_NEWLINE_TYPE_CR_LF")
      case G_DATA_STREAM_NEWLINE_TYPE_ANY => Some("G_DATA_STREAM_NEWLINE_TYPE_ANY")
      case _ => None
  extension (a: GDataStreamNewlineType)
    inline def &(b: GDataStreamNewlineType): GDataStreamNewlineType = a & b
    inline def |(b: GDataStreamNewlineType): GDataStreamNewlineType = a | b
    inline def is(b: GDataStreamNewlineType): Boolean = (a & b) == b

/**
 * GDriveStartFlags: _DRIVE_START_NONE: No flags set.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GDriveStartFlags = CUnsignedInt
object GDriveStartFlags extends CEnumU[GDriveStartFlags]:
  given _tag: Tag[GDriveStartFlags] = Tag.UInt
  inline def define(inline a: Long): GDriveStartFlags = a.toUInt
  val G_DRIVE_START_NONE = define(0)
  inline def getName(inline value: GDriveStartFlags): Option[String] =
    inline value match
      case G_DRIVE_START_NONE => Some("G_DRIVE_START_NONE")
      case _ => None
  extension (a: GDriveStartFlags)
    inline def &(b: GDriveStartFlags): GDriveStartFlags = a & b
    inline def |(b: GDriveStartFlags): GDriveStartFlags = a | b
    inline def is(b: GDriveStartFlags): Boolean = (a & b) == b

/**
 * GDriveStartStopType: _DRIVE_START_STOP_TYPE_UNKNOWN: Unknown or drive doesn't support start/stop. _DRIVE_START_STOP_TYPE_SHUTDOWN: The stop method will physically shut down the drive and e.g. power down the port the drive is attached to. _DRIVE_START_STOP_TYPE_NETWORK: The start/stop methods are used for connecting/disconnect to the drive over the network. _DRIVE_START_STOP_TYPE_MULTIDISK: The start/stop methods will assemble/disassemble a virtual drive from several physical drives. _DRIVE_START_STOP_TYPE_PASSWORD: The start/stop methods will unlock/lock the disk (for example using the ATA <quote>SECURITY UNLOCK DEVICE</quote> command)

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
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
    inline value match
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

/**
 * GEmblemOrigin: _EMBLEM_ORIGIN_UNKNOWN: Emblem of unknown origin _EMBLEM_ORIGIN_DEVICE: Emblem adds device-specific information _EMBLEM_ORIGIN_LIVEMETADATA: Emblem depicts live metadata, such as "readonly" _EMBLEM_ORIGIN_TAG: Emblem comes from a user-defined tag, e.g. set by nautilus (in the future)

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GEmblemOrigin = CUnsignedInt
object GEmblemOrigin extends CEnumU[GEmblemOrigin]:
  given _tag: Tag[GEmblemOrigin] = Tag.UInt
  inline def define(inline a: Long): GEmblemOrigin = a.toUInt
  val G_EMBLEM_ORIGIN_UNKNOWN = define(0)
  val G_EMBLEM_ORIGIN_DEVICE = define(1)
  val G_EMBLEM_ORIGIN_LIVEMETADATA = define(2)
  val G_EMBLEM_ORIGIN_TAG = define(3)
  inline def getName(inline value: GEmblemOrigin): Option[String] =
    inline value match
      case G_EMBLEM_ORIGIN_UNKNOWN => Some("G_EMBLEM_ORIGIN_UNKNOWN")
      case G_EMBLEM_ORIGIN_DEVICE => Some("G_EMBLEM_ORIGIN_DEVICE")
      case G_EMBLEM_ORIGIN_LIVEMETADATA => Some("G_EMBLEM_ORIGIN_LIVEMETADATA")
      case G_EMBLEM_ORIGIN_TAG => Some("G_EMBLEM_ORIGIN_TAG")
      case _ => None
  extension (a: GEmblemOrigin)
    inline def &(b: GEmblemOrigin): GEmblemOrigin = a & b
    inline def |(b: GEmblemOrigin): GEmblemOrigin = a | b
    inline def is(b: GEmblemOrigin): Boolean = (a & b) == b

/**
 * GFileAttributeInfoFlags: _FILE_ATTRIBUTE_INFO_NONE: no flags set. _FILE_ATTRIBUTE_INFO_COPY_WITH_FILE: copy the attribute values when the file is copied. _FILE_ATTRIBUTE_INFO_COPY_WHEN_MOVED: copy the attribute values when the file is moved.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GFileAttributeInfoFlags = CUnsignedInt
object GFileAttributeInfoFlags extends CEnumU[GFileAttributeInfoFlags]:
  given _tag: Tag[GFileAttributeInfoFlags] = Tag.UInt
  inline def define(inline a: Long): GFileAttributeInfoFlags = a.toUInt
  val G_FILE_ATTRIBUTE_INFO_NONE = define(0)
  val G_FILE_ATTRIBUTE_INFO_COPY_WITH_FILE = define(1)
  val G_FILE_ATTRIBUTE_INFO_COPY_WHEN_MOVED = define(2)
  inline def getName(inline value: GFileAttributeInfoFlags): Option[String] =
    inline value match
      case G_FILE_ATTRIBUTE_INFO_NONE => Some("G_FILE_ATTRIBUTE_INFO_NONE")
      case G_FILE_ATTRIBUTE_INFO_COPY_WITH_FILE => Some("G_FILE_ATTRIBUTE_INFO_COPY_WITH_FILE")
      case G_FILE_ATTRIBUTE_INFO_COPY_WHEN_MOVED => Some("G_FILE_ATTRIBUTE_INFO_COPY_WHEN_MOVED")
      case _ => None
  extension (a: GFileAttributeInfoFlags)
    inline def &(b: GFileAttributeInfoFlags): GFileAttributeInfoFlags = a & b
    inline def |(b: GFileAttributeInfoFlags): GFileAttributeInfoFlags = a | b
    inline def is(b: GFileAttributeInfoFlags): Boolean = (a & b) == b

/**
 * GFileAttributeStatus: _FILE_ATTRIBUTE_STATUS_UNSET: Attribute value is unset (empty). _FILE_ATTRIBUTE_STATUS_SET: Attribute value is set. _FILE_ATTRIBUTE_STATUS_ERROR_SETTING: Indicates an error in setting the value.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GFileAttributeStatus = CUnsignedInt
object GFileAttributeStatus extends CEnumU[GFileAttributeStatus]:
  given _tag: Tag[GFileAttributeStatus] = Tag.UInt
  inline def define(inline a: Long): GFileAttributeStatus = a.toUInt
  val G_FILE_ATTRIBUTE_STATUS_UNSET = define(0)
  val G_FILE_ATTRIBUTE_STATUS_SET = define(1)
  val G_FILE_ATTRIBUTE_STATUS_ERROR_SETTING = define(2)
  inline def getName(inline value: GFileAttributeStatus): Option[String] =
    inline value match
      case G_FILE_ATTRIBUTE_STATUS_UNSET => Some("G_FILE_ATTRIBUTE_STATUS_UNSET")
      case G_FILE_ATTRIBUTE_STATUS_SET => Some("G_FILE_ATTRIBUTE_STATUS_SET")
      case G_FILE_ATTRIBUTE_STATUS_ERROR_SETTING => Some("G_FILE_ATTRIBUTE_STATUS_ERROR_SETTING")
      case _ => None
  extension (a: GFileAttributeStatus)
    inline def &(b: GFileAttributeStatus): GFileAttributeStatus = a & b
    inline def |(b: GFileAttributeStatus): GFileAttributeStatus = a | b
    inline def is(b: GFileAttributeStatus): Boolean = (a & b) == b

/**
 * GFileAttributeType: _FILE_ATTRIBUTE_TYPE_INVALID: indicates an invalid or uninitialized type. _FILE_ATTRIBUTE_TYPE_STRING: a null terminated UTF8 string. _FILE_ATTRIBUTE_TYPE_BYTE_STRING: a zero terminated string of non-zero bytes. _FILE_ATTRIBUTE_TYPE_BOOLEAN: a boolean value. _FILE_ATTRIBUTE_TYPE_UINT32: an unsigned 4-byte/32-bit integer. _FILE_ATTRIBUTE_TYPE_INT32: a signed 4-byte/32-bit integer. _FILE_ATTRIBUTE_TYPE_UINT64: an unsigned 8-byte/64-bit integer. _FILE_ATTRIBUTE_TYPE_INT64: a signed 8-byte/64-bit integer. _FILE_ATTRIBUTE_TYPE_OBJECT: a #GObject. _FILE_ATTRIBUTE_TYPE_STRINGV: a %NULL terminated char **. Since 2.22

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
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
    inline value match
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

/**
 * GFileCopyFlags: _FILE_COPY_NONE: No flags set. _FILE_COPY_OVERWRITE: Overwrite any existing files _FILE_COPY_BACKUP: Make a backup of any existing files. _FILE_COPY_NOFOLLOW_SYMLINKS: Don't follow symlinks. _FILE_COPY_ALL_METADATA: Copy all file metadata instead of just default set used for copy (see #GFileInfo). _FILE_COPY_NO_FALLBACK_FOR_MOVE: Don't use copy and delete fallback if native move not supported. _FILE_COPY_TARGET_DEFAULT_PERMS: Leaves target file with default perms, instead of setting the source file perms.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
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
    inline value match
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

/**
 * GFileCreateFlags: _FILE_CREATE_NONE: No flags set. _FILE_CREATE_PRIVATE: Create a file that can only be accessed by the current user. _FILE_CREATE_REPLACE_DESTINATION: Replace the destination as if it didn't exist before. Don't try to keep any old permissions, replace instead of following links. This is generally useful if you're doing a "copy over" rather than a "save new version of" replace operation. You can think of it as "unlink destination" before writing to it, although the implementation may not be exactly like that. This flag can only be used with g_file_replace() and its variants, including g_file_replace_contents(). Since 2.20

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GFileCreateFlags = CUnsignedInt
object GFileCreateFlags extends CEnumU[GFileCreateFlags]:
  given _tag: Tag[GFileCreateFlags] = Tag.UInt
  inline def define(inline a: Long): GFileCreateFlags = a.toUInt
  val G_FILE_CREATE_NONE = define(0)
  val G_FILE_CREATE_PRIVATE = define(1)
  val G_FILE_CREATE_REPLACE_DESTINATION = define(2)
  inline def getName(inline value: GFileCreateFlags): Option[String] =
    inline value match
      case G_FILE_CREATE_NONE => Some("G_FILE_CREATE_NONE")
      case G_FILE_CREATE_PRIVATE => Some("G_FILE_CREATE_PRIVATE")
      case G_FILE_CREATE_REPLACE_DESTINATION => Some("G_FILE_CREATE_REPLACE_DESTINATION")
      case _ => None
  extension (a: GFileCreateFlags)
    inline def &(b: GFileCreateFlags): GFileCreateFlags = a & b
    inline def |(b: GFileCreateFlags): GFileCreateFlags = a | b
    inline def is(b: GFileCreateFlags): Boolean = (a & b) == b

/**
 * GFileMeasureFlags: _FILE_MEASURE_NONE: No flags set. _FILE_MEASURE_REPORT_ANY_ERROR: Report any error encountered while traversing the directory tree. Normally errors are only reported for the toplevel file. _FILE_MEASURE_APPARENT_SIZE: Tally usage based on apparent file sizes. Normally, the block-size is used, if available, as this is a more accurate representation of disk space used. Compare with `du --apparent-size`. Since GLib 2.78. and similarly to `du` since GNU Coreutils 9.2, this will ignore the sizes of file types other than regular files and links, as the sizes of other file types are not specified in a standard way. _FILE_MEASURE_NO_XDEV: Do not cross mount point boundaries. Compare with `du -x`.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GFileMeasureFlags = CUnsignedInt
object GFileMeasureFlags extends CEnumU[GFileMeasureFlags]:
  given _tag: Tag[GFileMeasureFlags] = Tag.UInt
  inline def define(inline a: Long): GFileMeasureFlags = a.toUInt
  val G_FILE_MEASURE_NONE = define(0)
  val G_FILE_MEASURE_REPORT_ANY_ERROR = define(2)
  val G_FILE_MEASURE_APPARENT_SIZE = define(4)
  val G_FILE_MEASURE_NO_XDEV = define(8)
  inline def getName(inline value: GFileMeasureFlags): Option[String] =
    inline value match
      case G_FILE_MEASURE_NONE => Some("G_FILE_MEASURE_NONE")
      case G_FILE_MEASURE_REPORT_ANY_ERROR => Some("G_FILE_MEASURE_REPORT_ANY_ERROR")
      case G_FILE_MEASURE_APPARENT_SIZE => Some("G_FILE_MEASURE_APPARENT_SIZE")
      case G_FILE_MEASURE_NO_XDEV => Some("G_FILE_MEASURE_NO_XDEV")
      case _ => None
  extension (a: GFileMeasureFlags)
    inline def &(b: GFileMeasureFlags): GFileMeasureFlags = a & b
    inline def |(b: GFileMeasureFlags): GFileMeasureFlags = a | b
    inline def is(b: GFileMeasureFlags): Boolean = (a & b) == b

/**
 * GFileMonitorEvent: _FILE_MONITOR_EVENT_CHANGED: a file changed. _FILE_MONITOR_EVENT_CHANGES_DONE_HINT: a hint that this was probably the last change in a set of changes. _FILE_MONITOR_EVENT_DELETED: a file was deleted. _FILE_MONITOR_EVENT_CREATED: a file was created. _FILE_MONITOR_EVENT_ATTRIBUTE_CHANGED: a file attribute was changed. _FILE_MONITOR_EVENT_PRE_UNMOUNT: the file location will soon be unmounted. _FILE_MONITOR_EVENT_UNMOUNTED: the file location was unmounted. _FILE_MONITOR_EVENT_MOVED: the file was moved -- only sent if the (deprecated) %G_FILE_MONITOR_SEND_MOVED flag is set _FILE_MONITOR_EVENT_RENAMED: the file was renamed within the current directory -- only sent if the %G_FILE_MONITOR_WATCH_MOVES flag is set. Since: 2.46. _FILE_MONITOR_EVENT_MOVED_IN: the file was moved into the monitored directory from another location -- only sent if the %G_FILE_MONITOR_WATCH_MOVES flag is set. Since: 2.46. _FILE_MONITOR_EVENT_MOVED_OUT: the file was moved out of the monitored directory to another location -- only sent if the %G_FILE_MONITOR_WATCH_MOVES flag is set. Since: 2.46

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
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
    inline value match
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

/**
 * GFileMonitorFlags: _FILE_MONITOR_NONE: No flags set. _FILE_MONITOR_WATCH_MOUNTS: Watch for mount events. _FILE_MONITOR_SEND_MOVED: Pair DELETED and CREATED events caused by file renames (moves) and send a single G_FILE_MONITOR_EVENT_MOVED event instead (NB: not supported on all backends; the default behaviour -without specifying this flag- is to send single DELETED and CREATED events). Deprecated since 2.46: use %G_FILE_MONITOR_WATCH_MOVES instead. _FILE_MONITOR_WATCH_HARD_LINKS: Watch for changes to the file made via another hard link. Since 2.36. _FILE_MONITOR_WATCH_MOVES: Watch for rename operations on a monitored directory. This causes %G_FILE_MONITOR_EVENT_RENAMED, %G_FILE_MONITOR_EVENT_MOVED_IN and %G_FILE_MONITOR_EVENT_MOVED_OUT events to be emitted when possible. Since: 2.46.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
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
    inline value match
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

/**
 * GFileQueryInfoFlags: _FILE_QUERY_INFO_NONE: No flags set. _FILE_QUERY_INFO_NOFOLLOW_SYMLINKS: Don't follow symlinks.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GFileQueryInfoFlags = CUnsignedInt
object GFileQueryInfoFlags extends CEnumU[GFileQueryInfoFlags]:
  given _tag: Tag[GFileQueryInfoFlags] = Tag.UInt
  inline def define(inline a: Long): GFileQueryInfoFlags = a.toUInt
  val G_FILE_QUERY_INFO_NONE = define(0)
  val G_FILE_QUERY_INFO_NOFOLLOW_SYMLINKS = define(1)
  inline def getName(inline value: GFileQueryInfoFlags): Option[String] =
    inline value match
      case G_FILE_QUERY_INFO_NONE => Some("G_FILE_QUERY_INFO_NONE")
      case G_FILE_QUERY_INFO_NOFOLLOW_SYMLINKS => Some("G_FILE_QUERY_INFO_NOFOLLOW_SYMLINKS")
      case _ => None
  extension (a: GFileQueryInfoFlags)
    inline def &(b: GFileQueryInfoFlags): GFileQueryInfoFlags = a & b
    inline def |(b: GFileQueryInfoFlags): GFileQueryInfoFlags = a | b
    inline def is(b: GFileQueryInfoFlags): Boolean = (a & b) == b

/**
 * GFileType: _FILE_TYPE_UNKNOWN: File's type is unknown. _FILE_TYPE_REGULAR: File handle represents a regular file. _FILE_TYPE_DIRECTORY: File handle represents a directory. _FILE_TYPE_SYMBOLIC_LINK: File handle represents a symbolic link (Unix systems). _FILE_TYPE_SPECIAL: File is a "special" file, such as a socket, fifo, block device, or character device. _FILE_TYPE_SHORTCUT: File is a shortcut (Windows systems). _FILE_TYPE_MOUNTABLE: File is a mountable location.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
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
    inline value match
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

/**
 * GFilesystemPreviewType: _FILESYSTEM_PREVIEW_TYPE_IF_ALWAYS: Only preview files if user has explicitly requested it. _FILESYSTEM_PREVIEW_TYPE_IF_LOCAL: Preview files if user has requested preview of "local" files. _FILESYSTEM_PREVIEW_TYPE_NEVER: Never preview files.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GFilesystemPreviewType = CUnsignedInt
object GFilesystemPreviewType extends CEnumU[GFilesystemPreviewType]:
  given _tag: Tag[GFilesystemPreviewType] = Tag.UInt
  inline def define(inline a: Long): GFilesystemPreviewType = a.toUInt
  val G_FILESYSTEM_PREVIEW_TYPE_IF_ALWAYS = define(0)
  val G_FILESYSTEM_PREVIEW_TYPE_IF_LOCAL = define(1)
  val G_FILESYSTEM_PREVIEW_TYPE_NEVER = define(2)
  inline def getName(inline value: GFilesystemPreviewType): Option[String] =
    inline value match
      case G_FILESYSTEM_PREVIEW_TYPE_IF_ALWAYS => Some("G_FILESYSTEM_PREVIEW_TYPE_IF_ALWAYS")
      case G_FILESYSTEM_PREVIEW_TYPE_IF_LOCAL => Some("G_FILESYSTEM_PREVIEW_TYPE_IF_LOCAL")
      case G_FILESYSTEM_PREVIEW_TYPE_NEVER => Some("G_FILESYSTEM_PREVIEW_TYPE_NEVER")
      case _ => None
  extension (a: GFilesystemPreviewType)
    inline def &(b: GFilesystemPreviewType): GFilesystemPreviewType = a & b
    inline def |(b: GFilesystemPreviewType): GFilesystemPreviewType = a | b
    inline def is(b: GFilesystemPreviewType): Boolean = (a & b) == b

/**
 * GIOErrorEnum: _IO_ERROR_FAILED: Generic error condition for when an operation fails and no more specific #GIOErrorEnum value is defined. _IO_ERROR_NOT_FOUND: File not found. _IO_ERROR_EXISTS: File already exists. _IO_ERROR_IS_DIRECTORY: File is a directory. _IO_ERROR_NOT_DIRECTORY: File is not a directory. _IO_ERROR_NOT_EMPTY: File is a directory that isn't empty. _IO_ERROR_NOT_REGULAR_FILE: File is not a regular file. _IO_ERROR_NOT_SYMBOLIC_LINK: File is not a symbolic link. _IO_ERROR_NOT_MOUNTABLE_FILE: File cannot be mounted. _IO_ERROR_FILENAME_TOO_LONG: Filename is too many characters. _IO_ERROR_INVALID_FILENAME: Filename is invalid or contains invalid characters. _IO_ERROR_TOO_MANY_LINKS: File contains too many symbolic links. _IO_ERROR_NO_SPACE: No space left on drive. _IO_ERROR_INVALID_ARGUMENT: Invalid argument. _IO_ERROR_PERMISSION_DENIED: Permission denied. _IO_ERROR_NOT_SUPPORTED: Operation (or one of its parameters) not supported _IO_ERROR_NOT_MOUNTED: File isn't mounted. _IO_ERROR_ALREADY_MOUNTED: File is already mounted. _IO_ERROR_CLOSED: File was closed. _IO_ERROR_CANCELLED: Operation was cancelled. See #GCancellable. _IO_ERROR_PENDING: Operations are still pending. _IO_ERROR_READ_ONLY: File is read only. _IO_ERROR_CANT_CREATE_BACKUP: Backup couldn't be created. _IO_ERROR_WRONG_ETAG: File's Entity Tag was incorrect. _IO_ERROR_TIMED_OUT: Operation timed out. _IO_ERROR_WOULD_RECURSE: Operation would be recursive. _IO_ERROR_BUSY: File is busy. _IO_ERROR_WOULD_BLOCK: Operation would block. _IO_ERROR_HOST_NOT_FOUND: Host couldn't be found (remote operations). _IO_ERROR_WOULD_MERGE: Operation would merge files. _IO_ERROR_FAILED_HANDLED: Operation failed and a helper program has already interacted with the user. Do not display any error dialog. _IO_ERROR_TOO_MANY_OPEN_FILES: The current process has too many files open and can't open any more. Duplicate descriptors do count toward this limit. Since 2.20 _IO_ERROR_NOT_INITIALIZED: The object has not been initialized. Since 2.22 _IO_ERROR_ADDRESS_IN_USE: The requested address is already in use. Since 2.22 _IO_ERROR_PARTIAL_INPUT: Need more input to finish operation. Since 2.24 _IO_ERROR_INVALID_DATA: The input data was invalid. Since 2.24 _IO_ERROR_DBUS_ERROR: A remote object generated an error that doesn't correspond to a locally registered #GError error domain. Use g_dbus_error_get_remote_error() to extract the D-Bus error name and g_dbus_error_strip_remote_error() to fix up the message so it matches what was received on the wire. Since 2.26. _IO_ERROR_HOST_UNREACHABLE: Host unreachable. Since 2.26 _IO_ERROR_NETWORK_UNREACHABLE: Network unreachable. Since 2.26 _IO_ERROR_CONNECTION_REFUSED: Connection refused. Since 2.26 _IO_ERROR_PROXY_FAILED: Connection to proxy server failed. Since 2.26 _IO_ERROR_PROXY_AUTH_FAILED: Proxy authentication failed. Since 2.26 _IO_ERROR_PROXY_NEED_AUTH: Proxy server needs authentication. Since 2.26 _IO_ERROR_PROXY_NOT_ALLOWED: Proxy connection is not allowed by ruleset. Since 2.26 _IO_ERROR_BROKEN_PIPE: Broken pipe. Since 2.36 _IO_ERROR_CONNECTION_CLOSED: Connection closed by peer. Note that this is the same code as %G_IO_ERROR_BROKEN_PIPE; before 2.44 some "connection closed" errors returned %G_IO_ERROR_BROKEN_PIPE, but others returned %G_IO_ERROR_FAILED. Now they should all return the same value, which has this more logical name. Since 2.44. _IO_ERROR_NOT_CONNECTED: Transport endpoint is not connected. Since 2.44 _IO_ERROR_MESSAGE_TOO_LARGE: Message too large. Since 2.48. _IO_ERROR_NO_SUCH_DEVICE: No such device found. Since 2.74

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
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
  val G_IO_ERROR_NO_SUCH_DEVICE = define(47)
  inline def getName(inline value: GIOErrorEnum): Option[String] =
    inline value match
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
      case G_IO_ERROR_NO_SUCH_DEVICE => Some("G_IO_ERROR_NO_SUCH_DEVICE")
      case _ => None
  extension (a: GIOErrorEnum)
    inline def &(b: GIOErrorEnum): GIOErrorEnum = a & b
    inline def |(b: GIOErrorEnum): GIOErrorEnum = a | b
    inline def is(b: GIOErrorEnum): Boolean = (a & b) == b

/**
 * GIOModuleScopeFlags: _IO_MODULE_SCOPE_NONE: No module scan flags _IO_MODULE_SCOPE_BLOCK_DUPLICATES: When using this scope to load or scan modules, automatically block a modules which has the same base basename as previously loaded module.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GIOModuleScopeFlags = CUnsignedInt
object GIOModuleScopeFlags extends CEnumU[GIOModuleScopeFlags]:
  given _tag: Tag[GIOModuleScopeFlags] = Tag.UInt
  inline def define(inline a: Long): GIOModuleScopeFlags = a.toUInt
  val G_IO_MODULE_SCOPE_NONE = define(0)
  val G_IO_MODULE_SCOPE_BLOCK_DUPLICATES = define(1)
  inline def getName(inline value: GIOModuleScopeFlags): Option[String] =
    inline value match
      case G_IO_MODULE_SCOPE_NONE => Some("G_IO_MODULE_SCOPE_NONE")
      case G_IO_MODULE_SCOPE_BLOCK_DUPLICATES => Some("G_IO_MODULE_SCOPE_BLOCK_DUPLICATES")
      case _ => None
  extension (a: GIOModuleScopeFlags)
    inline def &(b: GIOModuleScopeFlags): GIOModuleScopeFlags = a & b
    inline def |(b: GIOModuleScopeFlags): GIOModuleScopeFlags = a | b
    inline def is(b: GIOModuleScopeFlags): Boolean = (a & b) == b

/**
 * GIOStreamSpliceFlags: _IO_STREAM_SPLICE_NONE: Do not close either stream. _IO_STREAM_SPLICE_CLOSE_STREAM1: Close the first stream after the splice. _IO_STREAM_SPLICE_CLOSE_STREAM2: Close the second stream after the splice. _IO_STREAM_SPLICE_WAIT_FOR_BOTH: Wait for both splice operations to finish before calling the callback.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GIOStreamSpliceFlags = CUnsignedInt
object GIOStreamSpliceFlags extends CEnumU[GIOStreamSpliceFlags]:
  given _tag: Tag[GIOStreamSpliceFlags] = Tag.UInt
  inline def define(inline a: Long): GIOStreamSpliceFlags = a.toUInt
  val G_IO_STREAM_SPLICE_NONE = define(0)
  val G_IO_STREAM_SPLICE_CLOSE_STREAM1 = define(1)
  val G_IO_STREAM_SPLICE_CLOSE_STREAM2 = define(2)
  val G_IO_STREAM_SPLICE_WAIT_FOR_BOTH = define(4)
  inline def getName(inline value: GIOStreamSpliceFlags): Option[String] =
    inline value match
      case G_IO_STREAM_SPLICE_NONE => Some("G_IO_STREAM_SPLICE_NONE")
      case G_IO_STREAM_SPLICE_CLOSE_STREAM1 => Some("G_IO_STREAM_SPLICE_CLOSE_STREAM1")
      case G_IO_STREAM_SPLICE_CLOSE_STREAM2 => Some("G_IO_STREAM_SPLICE_CLOSE_STREAM2")
      case G_IO_STREAM_SPLICE_WAIT_FOR_BOTH => Some("G_IO_STREAM_SPLICE_WAIT_FOR_BOTH")
      case _ => None
  extension (a: GIOStreamSpliceFlags)
    inline def &(b: GIOStreamSpliceFlags): GIOStreamSpliceFlags = a & b
    inline def |(b: GIOStreamSpliceFlags): GIOStreamSpliceFlags = a | b
    inline def is(b: GIOStreamSpliceFlags): Boolean = (a & b) == b

/**
 * GMemoryMonitorWarningLevel: _MEMORY_MONITOR_WARNING_LEVEL_LOW: Memory on the device is low, processes should free up unneeded resources (for example, in-memory caches) so they can be used elsewhere. _MEMORY_MONITOR_WARNING_LEVEL_MEDIUM: Same as _MEMORY_MONITOR_WARNING_LEVEL_LOW but the device has even less free memory, so processes should try harder to free up unneeded resources. If your process does not need to stay running, it is a good time for it to quit. _MEMORY_MONITOR_WARNING_LEVEL_CRITICAL: The system will soon start terminating processes to reclaim memory, including background processes.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GMemoryMonitorWarningLevel = CUnsignedInt
object GMemoryMonitorWarningLevel extends CEnumU[GMemoryMonitorWarningLevel]:
  given _tag: Tag[GMemoryMonitorWarningLevel] = Tag.UInt
  inline def define(inline a: Long): GMemoryMonitorWarningLevel = a.toUInt
  val G_MEMORY_MONITOR_WARNING_LEVEL_LOW = define(50)
  val G_MEMORY_MONITOR_WARNING_LEVEL_MEDIUM = define(100)
  val G_MEMORY_MONITOR_WARNING_LEVEL_CRITICAL = define(255)
  inline def getName(inline value: GMemoryMonitorWarningLevel): Option[String] =
    inline value match
      case G_MEMORY_MONITOR_WARNING_LEVEL_LOW => Some("G_MEMORY_MONITOR_WARNING_LEVEL_LOW")
      case G_MEMORY_MONITOR_WARNING_LEVEL_MEDIUM => Some("G_MEMORY_MONITOR_WARNING_LEVEL_MEDIUM")
      case G_MEMORY_MONITOR_WARNING_LEVEL_CRITICAL => Some("G_MEMORY_MONITOR_WARNING_LEVEL_CRITICAL")
      case _ => None
  extension (a: GMemoryMonitorWarningLevel)
    inline def &(b: GMemoryMonitorWarningLevel): GMemoryMonitorWarningLevel = a & b
    inline def |(b: GMemoryMonitorWarningLevel): GMemoryMonitorWarningLevel = a | b
    inline def is(b: GMemoryMonitorWarningLevel): Boolean = (a & b) == b

/**
 * GMountMountFlags: _MOUNT_MOUNT_NONE: No flags set.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GMountMountFlags = CUnsignedInt
object GMountMountFlags extends CEnumU[GMountMountFlags]:
  given _tag: Tag[GMountMountFlags] = Tag.UInt
  inline def define(inline a: Long): GMountMountFlags = a.toUInt
  val G_MOUNT_MOUNT_NONE = define(0)
  inline def getName(inline value: GMountMountFlags): Option[String] =
    inline value match
      case G_MOUNT_MOUNT_NONE => Some("G_MOUNT_MOUNT_NONE")
      case _ => None
  extension (a: GMountMountFlags)
    inline def &(b: GMountMountFlags): GMountMountFlags = a & b
    inline def |(b: GMountMountFlags): GMountMountFlags = a | b
    inline def is(b: GMountMountFlags): Boolean = (a & b) == b

/**
 * GMountOperationResult: _MOUNT_OPERATION_HANDLED: The request was fulfilled and the user specified data is now available _MOUNT_OPERATION_ABORTED: The user requested the mount operation to be aborted _MOUNT_OPERATION_UNHANDLED: The request was unhandled (i.e. not implemented)

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GMountOperationResult = CUnsignedInt
object GMountOperationResult extends CEnumU[GMountOperationResult]:
  given _tag: Tag[GMountOperationResult] = Tag.UInt
  inline def define(inline a: Long): GMountOperationResult = a.toUInt
  val G_MOUNT_OPERATION_HANDLED = define(0)
  val G_MOUNT_OPERATION_ABORTED = define(1)
  val G_MOUNT_OPERATION_UNHANDLED = define(2)
  inline def getName(inline value: GMountOperationResult): Option[String] =
    inline value match
      case G_MOUNT_OPERATION_HANDLED => Some("G_MOUNT_OPERATION_HANDLED")
      case G_MOUNT_OPERATION_ABORTED => Some("G_MOUNT_OPERATION_ABORTED")
      case G_MOUNT_OPERATION_UNHANDLED => Some("G_MOUNT_OPERATION_UNHANDLED")
      case _ => None
  extension (a: GMountOperationResult)
    inline def &(b: GMountOperationResult): GMountOperationResult = a & b
    inline def |(b: GMountOperationResult): GMountOperationResult = a | b
    inline def is(b: GMountOperationResult): Boolean = (a & b) == b

/**
 * GMountUnmountFlags: _MOUNT_UNMOUNT_NONE: No flags set. _MOUNT_UNMOUNT_FORCE: Unmount even if there are outstanding file operations on the mount.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GMountUnmountFlags = CUnsignedInt
object GMountUnmountFlags extends CEnumU[GMountUnmountFlags]:
  given _tag: Tag[GMountUnmountFlags] = Tag.UInt
  inline def define(inline a: Long): GMountUnmountFlags = a.toUInt
  val G_MOUNT_UNMOUNT_NONE = define(0)
  val G_MOUNT_UNMOUNT_FORCE = define(1)
  inline def getName(inline value: GMountUnmountFlags): Option[String] =
    inline value match
      case G_MOUNT_UNMOUNT_NONE => Some("G_MOUNT_UNMOUNT_NONE")
      case G_MOUNT_UNMOUNT_FORCE => Some("G_MOUNT_UNMOUNT_FORCE")
      case _ => None
  extension (a: GMountUnmountFlags)
    inline def &(b: GMountUnmountFlags): GMountUnmountFlags = a & b
    inline def |(b: GMountUnmountFlags): GMountUnmountFlags = a | b
    inline def is(b: GMountUnmountFlags): Boolean = (a & b) == b

/**
 * GNetworkConnectivity: _NETWORK_CONNECTIVITY_LOCAL: The host is not configured with a route to the Internet; it may or may not be connected to a local network. _NETWORK_CONNECTIVITY_LIMITED: The host is connected to a network, but does not appear to be able to reach the full Internet, perhaps due to upstream network problems. _NETWORK_CONNECTIVITY_PORTAL: The host is behind a captive portal and cannot reach the full Internet. _NETWORK_CONNECTIVITY_FULL: The host is connected to a network, and appears to be able to reach the full Internet.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GNetworkConnectivity = CUnsignedInt
object GNetworkConnectivity extends CEnumU[GNetworkConnectivity]:
  given _tag: Tag[GNetworkConnectivity] = Tag.UInt
  inline def define(inline a: Long): GNetworkConnectivity = a.toUInt
  val G_NETWORK_CONNECTIVITY_LOCAL = define(1)
  val G_NETWORK_CONNECTIVITY_LIMITED = define(2)
  val G_NETWORK_CONNECTIVITY_PORTAL = define(3)
  val G_NETWORK_CONNECTIVITY_FULL = define(4)
  inline def getName(inline value: GNetworkConnectivity): Option[String] =
    inline value match
      case G_NETWORK_CONNECTIVITY_LOCAL => Some("G_NETWORK_CONNECTIVITY_LOCAL")
      case G_NETWORK_CONNECTIVITY_LIMITED => Some("G_NETWORK_CONNECTIVITY_LIMITED")
      case G_NETWORK_CONNECTIVITY_PORTAL => Some("G_NETWORK_CONNECTIVITY_PORTAL")
      case G_NETWORK_CONNECTIVITY_FULL => Some("G_NETWORK_CONNECTIVITY_FULL")
      case _ => None
  extension (a: GNetworkConnectivity)
    inline def &(b: GNetworkConnectivity): GNetworkConnectivity = a & b
    inline def |(b: GNetworkConnectivity): GNetworkConnectivity = a | b
    inline def is(b: GNetworkConnectivity): Boolean = (a & b) == b

/**
 * GNotificationPriority: _NOTIFICATION_PRIORITY_LOW: for notifications that do not require immediate attention - typically used for contextual background information, such as contact birthdays or local weather _NOTIFICATION_PRIORITY_NORMAL: the default priority, to be used for the majority of notifications (for example email messages, software updates, completed download/sync operations) _NOTIFICATION_PRIORITY_HIGH: for events that require more attention, usually because responses are time-sensitive (for example chat and SMS messages or alarms) _NOTIFICATION_PRIORITY_URGENT: for urgent notifications, or notifications that require a response in a short space of time (for example phone calls or emergency warnings)

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GNotificationPriority = CUnsignedInt
object GNotificationPriority extends CEnumU[GNotificationPriority]:
  given _tag: Tag[GNotificationPriority] = Tag.UInt
  inline def define(inline a: Long): GNotificationPriority = a.toUInt
  val G_NOTIFICATION_PRIORITY_NORMAL = define(0)
  val G_NOTIFICATION_PRIORITY_LOW = define(1)
  val G_NOTIFICATION_PRIORITY_HIGH = define(2)
  val G_NOTIFICATION_PRIORITY_URGENT = define(3)
  inline def getName(inline value: GNotificationPriority): Option[String] =
    inline value match
      case G_NOTIFICATION_PRIORITY_NORMAL => Some("G_NOTIFICATION_PRIORITY_NORMAL")
      case G_NOTIFICATION_PRIORITY_LOW => Some("G_NOTIFICATION_PRIORITY_LOW")
      case G_NOTIFICATION_PRIORITY_HIGH => Some("G_NOTIFICATION_PRIORITY_HIGH")
      case G_NOTIFICATION_PRIORITY_URGENT => Some("G_NOTIFICATION_PRIORITY_URGENT")
      case _ => None
  extension (a: GNotificationPriority)
    inline def &(b: GNotificationPriority): GNotificationPriority = a & b
    inline def |(b: GNotificationPriority): GNotificationPriority = a | b
    inline def is(b: GNotificationPriority): Boolean = (a & b) == b

/**
 * GOutputStreamSpliceFlags: _OUTPUT_STREAM_SPLICE_NONE: Do not close either stream. _OUTPUT_STREAM_SPLICE_CLOSE_SOURCE: Close the source stream after the splice. _OUTPUT_STREAM_SPLICE_CLOSE_TARGET: Close the target stream after the splice.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GOutputStreamSpliceFlags = CUnsignedInt
object GOutputStreamSpliceFlags extends CEnumU[GOutputStreamSpliceFlags]:
  given _tag: Tag[GOutputStreamSpliceFlags] = Tag.UInt
  inline def define(inline a: Long): GOutputStreamSpliceFlags = a.toUInt
  val G_OUTPUT_STREAM_SPLICE_NONE = define(0)
  val G_OUTPUT_STREAM_SPLICE_CLOSE_SOURCE = define(1)
  val G_OUTPUT_STREAM_SPLICE_CLOSE_TARGET = define(2)
  inline def getName(inline value: GOutputStreamSpliceFlags): Option[String] =
    inline value match
      case G_OUTPUT_STREAM_SPLICE_NONE => Some("G_OUTPUT_STREAM_SPLICE_NONE")
      case G_OUTPUT_STREAM_SPLICE_CLOSE_SOURCE => Some("G_OUTPUT_STREAM_SPLICE_CLOSE_SOURCE")
      case G_OUTPUT_STREAM_SPLICE_CLOSE_TARGET => Some("G_OUTPUT_STREAM_SPLICE_CLOSE_TARGET")
      case _ => None
  extension (a: GOutputStreamSpliceFlags)
    inline def &(b: GOutputStreamSpliceFlags): GOutputStreamSpliceFlags = a & b
    inline def |(b: GOutputStreamSpliceFlags): GOutputStreamSpliceFlags = a | b
    inline def is(b: GOutputStreamSpliceFlags): Boolean = (a & b) == b

/**
 * GPasswordSave: _PASSWORD_SAVE_NEVER: never save a password. _PASSWORD_SAVE_FOR_SESSION: save a password for the session. _PASSWORD_SAVE_PERMANENTLY: save a password permanently.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GPasswordSave = CUnsignedInt
object GPasswordSave extends CEnumU[GPasswordSave]:
  given _tag: Tag[GPasswordSave] = Tag.UInt
  inline def define(inline a: Long): GPasswordSave = a.toUInt
  val G_PASSWORD_SAVE_NEVER = define(0)
  val G_PASSWORD_SAVE_FOR_SESSION = define(1)
  val G_PASSWORD_SAVE_PERMANENTLY = define(2)
  inline def getName(inline value: GPasswordSave): Option[String] =
    inline value match
      case G_PASSWORD_SAVE_NEVER => Some("G_PASSWORD_SAVE_NEVER")
      case G_PASSWORD_SAVE_FOR_SESSION => Some("G_PASSWORD_SAVE_FOR_SESSION")
      case G_PASSWORD_SAVE_PERMANENTLY => Some("G_PASSWORD_SAVE_PERMANENTLY")
      case _ => None
  extension (a: GPasswordSave)
    inline def &(b: GPasswordSave): GPasswordSave = a & b
    inline def |(b: GPasswordSave): GPasswordSave = a | b
    inline def is(b: GPasswordSave): Boolean = (a & b) == b

/**
 * GPollableReturn: _POLLABLE_RETURN_FAILED: Generic error condition for when an operation fails. _POLLABLE_RETURN_OK: The operation was successfully finished. _POLLABLE_RETURN_WOULD_BLOCK: The operation would block.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GPollableReturn = CInt
object GPollableReturn extends CEnum[GPollableReturn]:
  given _tag: Tag[GPollableReturn] = Tag.Int
  inline def define(inline a: CInt): GPollableReturn = a
  val G_POLLABLE_RETURN_FAILED = define(0)
  val G_POLLABLE_RETURN_OK = define(1)
  val G_POLLABLE_RETURN_WOULD_BLOCK = define(-27)
  inline def getName(inline value: GPollableReturn): Option[String] =
    inline value match
      case G_POLLABLE_RETURN_FAILED => Some("G_POLLABLE_RETURN_FAILED")
      case G_POLLABLE_RETURN_OK => Some("G_POLLABLE_RETURN_OK")
      case G_POLLABLE_RETURN_WOULD_BLOCK => Some("G_POLLABLE_RETURN_WOULD_BLOCK")
      case _ => None
  extension (a: GPollableReturn)
    inline def &(b: GPollableReturn): GPollableReturn = a & b
    inline def |(b: GPollableReturn): GPollableReturn = a | b
    inline def is(b: GPollableReturn): Boolean = (a & b) == b

/**
 * GResolverError: _RESOLVER_ERROR_NOT_FOUND: the requested name/address/service was not found _RESOLVER_ERROR_TEMPORARY_FAILURE: the requested information could not be looked up due to a network error or similar problem _RESOLVER_ERROR_INTERNAL: unknown error

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GResolverError = CUnsignedInt
object GResolverError extends CEnumU[GResolverError]:
  given _tag: Tag[GResolverError] = Tag.UInt
  inline def define(inline a: Long): GResolverError = a.toUInt
  val G_RESOLVER_ERROR_NOT_FOUND = define(0)
  val G_RESOLVER_ERROR_TEMPORARY_FAILURE = define(1)
  val G_RESOLVER_ERROR_INTERNAL = define(2)
  inline def getName(inline value: GResolverError): Option[String] =
    inline value match
      case G_RESOLVER_ERROR_NOT_FOUND => Some("G_RESOLVER_ERROR_NOT_FOUND")
      case G_RESOLVER_ERROR_TEMPORARY_FAILURE => Some("G_RESOLVER_ERROR_TEMPORARY_FAILURE")
      case G_RESOLVER_ERROR_INTERNAL => Some("G_RESOLVER_ERROR_INTERNAL")
      case _ => None
  extension (a: GResolverError)
    inline def &(b: GResolverError): GResolverError = a & b
    inline def |(b: GResolverError): GResolverError = a | b
    inline def is(b: GResolverError): Boolean = (a & b) == b

/**
 * GResolverNameLookupFlags: _RESOLVER_NAME_LOOKUP_FLAGS_DEFAULT: default behavior (same as g_resolver_lookup_by_name()) _RESOLVER_NAME_LOOKUP_FLAGS_IPV4_ONLY: only resolve ipv4 addresses _RESOLVER_NAME_LOOKUP_FLAGS_IPV6_ONLY: only resolve ipv6 addresses

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gresolver.h
*/
opaque type GResolverNameLookupFlags = CUnsignedInt
object GResolverNameLookupFlags extends CEnumU[GResolverNameLookupFlags]:
  given _tag: Tag[GResolverNameLookupFlags] = Tag.UInt
  inline def define(inline a: Long): GResolverNameLookupFlags = a.toUInt
  val G_RESOLVER_NAME_LOOKUP_FLAGS_DEFAULT = define(0)
  val G_RESOLVER_NAME_LOOKUP_FLAGS_IPV4_ONLY = define(1)
  val G_RESOLVER_NAME_LOOKUP_FLAGS_IPV6_ONLY = define(2)
  inline def getName(inline value: GResolverNameLookupFlags): Option[String] =
    inline value match
      case G_RESOLVER_NAME_LOOKUP_FLAGS_DEFAULT => Some("G_RESOLVER_NAME_LOOKUP_FLAGS_DEFAULT")
      case G_RESOLVER_NAME_LOOKUP_FLAGS_IPV4_ONLY => Some("G_RESOLVER_NAME_LOOKUP_FLAGS_IPV4_ONLY")
      case G_RESOLVER_NAME_LOOKUP_FLAGS_IPV6_ONLY => Some("G_RESOLVER_NAME_LOOKUP_FLAGS_IPV6_ONLY")
      case _ => None
  extension (a: GResolverNameLookupFlags)
    inline def &(b: GResolverNameLookupFlags): GResolverNameLookupFlags = a & b
    inline def |(b: GResolverNameLookupFlags): GResolverNameLookupFlags = a | b
    inline def is(b: GResolverNameLookupFlags): Boolean = (a & b) == b

/**
 * GResolverRecordType: _RESOLVER_RECORD_SRV: look up DNS SRV records for a domain _RESOLVER_RECORD_MX: look up DNS MX records for a domain _RESOLVER_RECORD_TXT: look up DNS TXT records for a name _RESOLVER_RECORD_SOA: look up DNS SOA records for a zone _RESOLVER_RECORD_NS: look up DNS NS records for a domain

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
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
    inline value match
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

/**
 * GResourceError: _RESOURCE_ERROR_NOT_FOUND: no file was found at the requested path _RESOURCE_ERROR_INTERNAL: unknown error

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GResourceError = CUnsignedInt
object GResourceError extends CEnumU[GResourceError]:
  given _tag: Tag[GResourceError] = Tag.UInt
  inline def define(inline a: Long): GResourceError = a.toUInt
  val G_RESOURCE_ERROR_NOT_FOUND = define(0)
  val G_RESOURCE_ERROR_INTERNAL = define(1)
  inline def getName(inline value: GResourceError): Option[String] =
    inline value match
      case G_RESOURCE_ERROR_NOT_FOUND => Some("G_RESOURCE_ERROR_NOT_FOUND")
      case G_RESOURCE_ERROR_INTERNAL => Some("G_RESOURCE_ERROR_INTERNAL")
      case _ => None
  extension (a: GResourceError)
    inline def &(b: GResourceError): GResourceError = a & b
    inline def |(b: GResourceError): GResourceError = a | b
    inline def is(b: GResourceError): Boolean = (a & b) == b

/**
 * GResourceFlags: _RESOURCE_FLAGS_NONE: No flags set. _RESOURCE_FLAGS_COMPRESSED: The file is compressed.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GResourceFlags = CUnsignedInt
object GResourceFlags extends CEnumU[GResourceFlags]:
  given _tag: Tag[GResourceFlags] = Tag.UInt
  inline def define(inline a: Long): GResourceFlags = a.toUInt
  val G_RESOURCE_FLAGS_NONE = define(0)
  val G_RESOURCE_FLAGS_COMPRESSED = define(1)
  inline def getName(inline value: GResourceFlags): Option[String] =
    inline value match
      case G_RESOURCE_FLAGS_NONE => Some("G_RESOURCE_FLAGS_NONE")
      case G_RESOURCE_FLAGS_COMPRESSED => Some("G_RESOURCE_FLAGS_COMPRESSED")
      case _ => None
  extension (a: GResourceFlags)
    inline def &(b: GResourceFlags): GResourceFlags = a & b
    inline def |(b: GResourceFlags): GResourceFlags = a | b
    inline def is(b: GResourceFlags): Boolean = (a & b) == b

/**
 * GResourceLookupFlags: _RESOURCE_LOOKUP_FLAGS_NONE: No flags set.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GResourceLookupFlags = CUnsignedInt
object GResourceLookupFlags extends CEnumU[GResourceLookupFlags]:
  given _tag: Tag[GResourceLookupFlags] = Tag.UInt
  inline def define(inline a: Long): GResourceLookupFlags = a.toUInt
  val G_RESOURCE_LOOKUP_FLAGS_NONE = define(0)
  inline def getName(inline value: GResourceLookupFlags): Option[String] =
    inline value match
      case G_RESOURCE_LOOKUP_FLAGS_NONE => Some("G_RESOURCE_LOOKUP_FLAGS_NONE")
      case _ => None
  extension (a: GResourceLookupFlags)
    inline def &(b: GResourceLookupFlags): GResourceLookupFlags = a & b
    inline def |(b: GResourceLookupFlags): GResourceLookupFlags = a | b
    inline def is(b: GResourceLookupFlags): Boolean = (a & b) == b

/**
 * GSettingsBindFlags: _SETTINGS_BIND_DEFAULT: Equivalent to `G_SETTINGS_BIND_GET|G_SETTINGS_BIND_SET` _SETTINGS_BIND_GET: Update the #GObject property when the setting changes. It is an error to use this flag if the property is not writable. _SETTINGS_BIND_SET: Update the setting when the #GObject property changes. It is an error to use this flag if the property is not readable. _SETTINGS_BIND_NO_SENSITIVITY: Do not try to bind a "sensitivity" property to the writability of the setting _SETTINGS_BIND_GET_NO_CHANGES: When set in addition to %G_SETTINGS_BIND_GET, set the #GObject property value initially from the setting, but do not listen for changes of the setting _SETTINGS_BIND_INVERT_BOOLEAN: When passed to g_settings_bind(), uses a pair of mapping functions that invert the boolean value when mapping between the setting and the property. The setting and property must both be booleans. You cannot pass this flag to g_settings_bind_with_mapping().

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gsettings.h
*/
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
    inline value match
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

/**
 * GSocketClientEvent: _SOCKET_CLIENT_RESOLVING: The client is doing a DNS lookup. _SOCKET_CLIENT_RESOLVED: The client has completed a DNS lookup. _SOCKET_CLIENT_CONNECTING: The client is connecting to a remote host (either a proxy or the destination server). _SOCKET_CLIENT_CONNECTED: The client has connected to a remote host. _SOCKET_CLIENT_PROXY_NEGOTIATING: The client is negotiating with a proxy to connect to the destination server. _SOCKET_CLIENT_PROXY_NEGOTIATED: The client has negotiated with the proxy server. _SOCKET_CLIENT_TLS_HANDSHAKING: The client is performing a TLS handshake. _SOCKET_CLIENT_TLS_HANDSHAKED: The client has performed a TLS handshake. _SOCKET_CLIENT_COMPLETE: The client is done with a particular #GSocketConnectable.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
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
    inline value match
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

/**
 * GSocketFamily: _SOCKET_FAMILY_INVALID: no address family _SOCKET_FAMILY_IPV4: the IPv4 family _SOCKET_FAMILY_IPV6: the IPv6 family _SOCKET_FAMILY_UNIX: the UNIX domain family

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GSocketFamily = CUnsignedInt
object GSocketFamily extends CEnumU[GSocketFamily]:
  given _tag: Tag[GSocketFamily] = Tag.UInt
  inline def define(inline a: Long): GSocketFamily = a.toUInt
  val G_SOCKET_FAMILY_INVALID = define(0)
  val G_SOCKET_FAMILY_UNIX = define(1)
  val G_SOCKET_FAMILY_IPV4 = define(2)
  val G_SOCKET_FAMILY_IPV6 = define(30)
  inline def getName(inline value: GSocketFamily): Option[String] =
    inline value match
      case G_SOCKET_FAMILY_INVALID => Some("G_SOCKET_FAMILY_INVALID")
      case G_SOCKET_FAMILY_UNIX => Some("G_SOCKET_FAMILY_UNIX")
      case G_SOCKET_FAMILY_IPV4 => Some("G_SOCKET_FAMILY_IPV4")
      case G_SOCKET_FAMILY_IPV6 => Some("G_SOCKET_FAMILY_IPV6")
      case _ => None
  extension (a: GSocketFamily)
    inline def &(b: GSocketFamily): GSocketFamily = a & b
    inline def |(b: GSocketFamily): GSocketFamily = a | b
    inline def is(b: GSocketFamily): Boolean = (a & b) == b

/**
 * GSocketListenerEvent: _SOCKET_LISTENER_BINDING: The listener is about to bind a socket. _SOCKET_LISTENER_BOUND: The listener has bound a socket. _SOCKET_LISTENER_LISTENING: The listener is about to start listening on this socket. _SOCKET_LISTENER_LISTENED: The listener is now listening on this socket.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GSocketListenerEvent = CUnsignedInt
object GSocketListenerEvent extends CEnumU[GSocketListenerEvent]:
  given _tag: Tag[GSocketListenerEvent] = Tag.UInt
  inline def define(inline a: Long): GSocketListenerEvent = a.toUInt
  val G_SOCKET_LISTENER_BINDING = define(0)
  val G_SOCKET_LISTENER_BOUND = define(1)
  val G_SOCKET_LISTENER_LISTENING = define(2)
  val G_SOCKET_LISTENER_LISTENED = define(3)
  inline def getName(inline value: GSocketListenerEvent): Option[String] =
    inline value match
      case G_SOCKET_LISTENER_BINDING => Some("G_SOCKET_LISTENER_BINDING")
      case G_SOCKET_LISTENER_BOUND => Some("G_SOCKET_LISTENER_BOUND")
      case G_SOCKET_LISTENER_LISTENING => Some("G_SOCKET_LISTENER_LISTENING")
      case G_SOCKET_LISTENER_LISTENED => Some("G_SOCKET_LISTENER_LISTENED")
      case _ => None
  extension (a: GSocketListenerEvent)
    inline def &(b: GSocketListenerEvent): GSocketListenerEvent = a & b
    inline def |(b: GSocketListenerEvent): GSocketListenerEvent = a | b
    inline def is(b: GSocketListenerEvent): Boolean = (a & b) == b

/**
 * GSocketMsgFlags: _SOCKET_MSG_NONE: No flags. _SOCKET_MSG_OOB: Request to send/receive out of band data. _SOCKET_MSG_PEEK: Read data from the socket without removing it from the queue. _SOCKET_MSG_DONTROUTE: Don't use a gateway to send out the packet, only send to hosts on directly connected networks.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GSocketMsgFlags = CUnsignedInt
object GSocketMsgFlags extends CEnumU[GSocketMsgFlags]:
  given _tag: Tag[GSocketMsgFlags] = Tag.UInt
  inline def define(inline a: Long): GSocketMsgFlags = a.toUInt
  val G_SOCKET_MSG_NONE = define(0)
  val G_SOCKET_MSG_OOB = define(1)
  val G_SOCKET_MSG_PEEK = define(2)
  val G_SOCKET_MSG_DONTROUTE = define(4)
  inline def getName(inline value: GSocketMsgFlags): Option[String] =
    inline value match
      case G_SOCKET_MSG_NONE => Some("G_SOCKET_MSG_NONE")
      case G_SOCKET_MSG_OOB => Some("G_SOCKET_MSG_OOB")
      case G_SOCKET_MSG_PEEK => Some("G_SOCKET_MSG_PEEK")
      case G_SOCKET_MSG_DONTROUTE => Some("G_SOCKET_MSG_DONTROUTE")
      case _ => None
  extension (a: GSocketMsgFlags)
    inline def &(b: GSocketMsgFlags): GSocketMsgFlags = a & b
    inline def |(b: GSocketMsgFlags): GSocketMsgFlags = a | b
    inline def is(b: GSocketMsgFlags): Boolean = (a & b) == b

/**
 * GSocketProtocol: _SOCKET_PROTOCOL_UNKNOWN: The protocol type is unknown _SOCKET_PROTOCOL_DEFAULT: The default protocol for the family/type _SOCKET_PROTOCOL_TCP: TCP over IP _SOCKET_PROTOCOL_UDP: UDP over IP _SOCKET_PROTOCOL_SCTP: SCTP over IP

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
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
    inline value match
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

/**
 * GSocketType: _SOCKET_TYPE_INVALID: Type unknown or wrong _SOCKET_TYPE_STREAM: Reliable connection-based byte streams (e.g. TCP). _SOCKET_TYPE_DATAGRAM: Connectionless, unreliable datagram passing. (e.g. UDP) _SOCKET_TYPE_SEQPACKET: Reliable connection-based passing of datagrams of fixed maximum length (e.g. SCTP).

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GSocketType = CUnsignedInt
object GSocketType extends CEnumU[GSocketType]:
  given _tag: Tag[GSocketType] = Tag.UInt
  inline def define(inline a: Long): GSocketType = a.toUInt
  val G_SOCKET_TYPE_INVALID = define(0)
  val G_SOCKET_TYPE_STREAM = define(1)
  val G_SOCKET_TYPE_DATAGRAM = define(2)
  val G_SOCKET_TYPE_SEQPACKET = define(3)
  inline def getName(inline value: GSocketType): Option[String] =
    inline value match
      case G_SOCKET_TYPE_INVALID => Some("G_SOCKET_TYPE_INVALID")
      case G_SOCKET_TYPE_STREAM => Some("G_SOCKET_TYPE_STREAM")
      case G_SOCKET_TYPE_DATAGRAM => Some("G_SOCKET_TYPE_DATAGRAM")
      case G_SOCKET_TYPE_SEQPACKET => Some("G_SOCKET_TYPE_SEQPACKET")
      case _ => None
  extension (a: GSocketType)
    inline def &(b: GSocketType): GSocketType = a & b
    inline def |(b: GSocketType): GSocketType = a | b
    inline def is(b: GSocketType): Boolean = (a & b) == b

/**
 * GSubprocessFlags: _SUBPROCESS_FLAGS_NONE: No flags. _SUBPROCESS_FLAGS_STDIN_PIPE: create a pipe for the stdin of the spawned process that can be accessed with g_subprocess_get_stdin_pipe(). _SUBPROCESS_FLAGS_STDIN_INHERIT: stdin is inherited from the calling process. _SUBPROCESS_FLAGS_STDOUT_PIPE: create a pipe for the stdout of the spawned process that can be accessed with g_subprocess_get_stdout_pipe(). _SUBPROCESS_FLAGS_STDOUT_SILENCE: silence the stdout of the spawned process (ie: redirect to `/dev/null`). _SUBPROCESS_FLAGS_STDERR_PIPE: create a pipe for the stderr of the spawned process that can be accessed with g_subprocess_get_stderr_pipe(). _SUBPROCESS_FLAGS_STDERR_SILENCE: silence the stderr of the spawned process (ie: redirect to `/dev/null`). _SUBPROCESS_FLAGS_STDERR_MERGE: merge the stderr of the spawned process with whatever the stdout happens to be. This is a good way of directing both streams to a common log file, for example. _SUBPROCESS_FLAGS_INHERIT_FDS: spawned processes will inherit the file descriptors of their parent, unless those descriptors have been explicitly marked as close-on-exec. This flag has no effect over the "standard" file descriptors (stdin, stdout, stderr). _SUBPROCESS_FLAGS_SEARCH_PATH_FROM_ENVP: if path searching is needed when spawning the subprocess, use the `PATH` in the launcher environment. (Since: 2.72)

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
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
    inline value match
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

/**
 * GTestDBusFlags: _TEST_DBUS_NONE: No flags.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GTestDBusFlags = CUnsignedInt
object GTestDBusFlags extends CEnumU[GTestDBusFlags]:
  given _tag: Tag[GTestDBusFlags] = Tag.UInt
  inline def define(inline a: Long): GTestDBusFlags = a.toUInt
  val G_TEST_DBUS_NONE = define(0)
  inline def getName(inline value: GTestDBusFlags): Option[String] =
    inline value match
      case G_TEST_DBUS_NONE => Some("G_TEST_DBUS_NONE")
      case _ => None
  extension (a: GTestDBusFlags)
    inline def &(b: GTestDBusFlags): GTestDBusFlags = a & b
    inline def |(b: GTestDBusFlags): GTestDBusFlags = a | b
    inline def is(b: GTestDBusFlags): Boolean = (a & b) == b

/**
 * GTlsAuthenticationMode: _TLS_AUTHENTICATION_NONE: client authentication not required _TLS_AUTHENTICATION_REQUESTED: client authentication is requested _TLS_AUTHENTICATION_REQUIRED: client authentication is required

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GTlsAuthenticationMode = CUnsignedInt
object GTlsAuthenticationMode extends CEnumU[GTlsAuthenticationMode]:
  given _tag: Tag[GTlsAuthenticationMode] = Tag.UInt
  inline def define(inline a: Long): GTlsAuthenticationMode = a.toUInt
  val G_TLS_AUTHENTICATION_NONE = define(0)
  val G_TLS_AUTHENTICATION_REQUESTED = define(1)
  val G_TLS_AUTHENTICATION_REQUIRED = define(2)
  inline def getName(inline value: GTlsAuthenticationMode): Option[String] =
    inline value match
      case G_TLS_AUTHENTICATION_NONE => Some("G_TLS_AUTHENTICATION_NONE")
      case G_TLS_AUTHENTICATION_REQUESTED => Some("G_TLS_AUTHENTICATION_REQUESTED")
      case G_TLS_AUTHENTICATION_REQUIRED => Some("G_TLS_AUTHENTICATION_REQUIRED")
      case _ => None
  extension (a: GTlsAuthenticationMode)
    inline def &(b: GTlsAuthenticationMode): GTlsAuthenticationMode = a & b
    inline def |(b: GTlsAuthenticationMode): GTlsAuthenticationMode = a | b
    inline def is(b: GTlsAuthenticationMode): Boolean = (a & b) == b

/**
 * GTlsCertificateFlags: _TLS_CERTIFICATE_NO_FLAGS: No flags set. Since: 2.74 _TLS_CERTIFICATE_UNKNOWN_CA: The signing certificate authority is not known. _TLS_CERTIFICATE_BAD_IDENTITY: The certificate does not match the expected identity of the site that it was retrieved from. _TLS_CERTIFICATE_NOT_ACTIVATED: The certificate's activation time is still in the future _TLS_CERTIFICATE_EXPIRED: The certificate has expired _TLS_CERTIFICATE_REVOKED: The certificate has been revoked according to the #GTlsConnection's certificate revocation list. _TLS_CERTIFICATE_INSECURE: The certificate's algorithm is considered insecure. _TLS_CERTIFICATE_GENERIC_ERROR: Some other error occurred validating the certificate _TLS_CERTIFICATE_VALIDATE_ALL: the combination of all of the above flags

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GTlsCertificateFlags = CUnsignedInt
object GTlsCertificateFlags extends CEnumU[GTlsCertificateFlags]:
  given _tag: Tag[GTlsCertificateFlags] = Tag.UInt
  inline def define(inline a: Long): GTlsCertificateFlags = a.toUInt
  val G_TLS_CERTIFICATE_NO_FLAGS = define(0)
  val G_TLS_CERTIFICATE_UNKNOWN_CA = define(1)
  val G_TLS_CERTIFICATE_BAD_IDENTITY = define(2)
  val G_TLS_CERTIFICATE_NOT_ACTIVATED = define(4)
  val G_TLS_CERTIFICATE_EXPIRED = define(8)
  val G_TLS_CERTIFICATE_REVOKED = define(16)
  val G_TLS_CERTIFICATE_INSECURE = define(32)
  val G_TLS_CERTIFICATE_GENERIC_ERROR = define(64)
  val G_TLS_CERTIFICATE_VALIDATE_ALL = define(127)
  inline def getName(inline value: GTlsCertificateFlags): Option[String] =
    inline value match
      case G_TLS_CERTIFICATE_NO_FLAGS => Some("G_TLS_CERTIFICATE_NO_FLAGS")
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

/**
 * GTlsCertificateRequestFlags: _TLS_CERTIFICATE_REQUEST_NONE: No flags

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GTlsCertificateRequestFlags = CUnsignedInt
object GTlsCertificateRequestFlags extends CEnumU[GTlsCertificateRequestFlags]:
  given _tag: Tag[GTlsCertificateRequestFlags] = Tag.UInt
  inline def define(inline a: Long): GTlsCertificateRequestFlags = a.toUInt
  val G_TLS_CERTIFICATE_REQUEST_NONE = define(0)
  inline def getName(inline value: GTlsCertificateRequestFlags): Option[String] =
    inline value match
      case G_TLS_CERTIFICATE_REQUEST_NONE => Some("G_TLS_CERTIFICATE_REQUEST_NONE")
      case _ => None
  extension (a: GTlsCertificateRequestFlags)
    inline def &(b: GTlsCertificateRequestFlags): GTlsCertificateRequestFlags = a & b
    inline def |(b: GTlsCertificateRequestFlags): GTlsCertificateRequestFlags = a | b
    inline def is(b: GTlsCertificateRequestFlags): Boolean = (a & b) == b

/**
 * GTlsChannelBindingError: _TLS_CHANNEL_BINDING_ERROR_NOT_IMPLEMENTED: Either entire binding retrieval facility or specific binding type is not implemented in the TLS backend. _TLS_CHANNEL_BINDING_ERROR_INVALID_STATE: The handshake is not yet complete on the connection which is a strong requirement for any existing binding type. _TLS_CHANNEL_BINDING_ERROR_NOT_AVAILABLE: Handshake is complete but binding data is not available. That normally indicates the TLS implementation failed to provide the binding data. For example, some implementations do not provide a peer certificate for resumed connections. _TLS_CHANNEL_BINDING_ERROR_NOT_SUPPORTED: Binding type is not supported on the current connection. This error could be triggered when requesting `tls-server-end-point` binding data for a certificate which has no hash function or uses multiple hash functions. _TLS_CHANNEL_BINDING_ERROR_GENERAL_ERROR: Any other backend error preventing binding data retrieval.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
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
    inline value match
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

/**
 * GTlsChannelBindingType: _TLS_CHANNEL_BINDING_TLS_UNIQUE: [`tls-unique`](https://tools.ietf.org/html/rfc5929#section-3) binding type _TLS_CHANNEL_BINDING_TLS_SERVER_END_POINT: [`tls-server-end-point`](https://tools.ietf.org/html/rfc5929#section-4) binding type _TLS_CHANNEL_BINDING_TLS_EXPORTER: [`tls-exporter`](https://www.rfc-editor.org/rfc/rfc9266.html) binding type. Since: 2.74

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GTlsChannelBindingType = CUnsignedInt
object GTlsChannelBindingType extends CEnumU[GTlsChannelBindingType]:
  given _tag: Tag[GTlsChannelBindingType] = Tag.UInt
  inline def define(inline a: Long): GTlsChannelBindingType = a.toUInt
  val G_TLS_CHANNEL_BINDING_TLS_UNIQUE = define(0)
  val G_TLS_CHANNEL_BINDING_TLS_SERVER_END_POINT = define(1)
  val G_TLS_CHANNEL_BINDING_TLS_EXPORTER = define(2)
  inline def getName(inline value: GTlsChannelBindingType): Option[String] =
    inline value match
      case G_TLS_CHANNEL_BINDING_TLS_UNIQUE => Some("G_TLS_CHANNEL_BINDING_TLS_UNIQUE")
      case G_TLS_CHANNEL_BINDING_TLS_SERVER_END_POINT => Some("G_TLS_CHANNEL_BINDING_TLS_SERVER_END_POINT")
      case G_TLS_CHANNEL_BINDING_TLS_EXPORTER => Some("G_TLS_CHANNEL_BINDING_TLS_EXPORTER")
      case _ => None
  extension (a: GTlsChannelBindingType)
    inline def &(b: GTlsChannelBindingType): GTlsChannelBindingType = a & b
    inline def |(b: GTlsChannelBindingType): GTlsChannelBindingType = a | b
    inline def is(b: GTlsChannelBindingType): Boolean = (a & b) == b

/**
 * GTlsDatabaseLookupFlags: _TLS_DATABASE_LOOKUP_NONE: No lookup flags _TLS_DATABASE_LOOKUP_KEYPAIR: Restrict lookup to certificates that have a private key.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GTlsDatabaseLookupFlags = CUnsignedInt
object GTlsDatabaseLookupFlags extends CEnumU[GTlsDatabaseLookupFlags]:
  given _tag: Tag[GTlsDatabaseLookupFlags] = Tag.UInt
  inline def define(inline a: Long): GTlsDatabaseLookupFlags = a.toUInt
  val G_TLS_DATABASE_LOOKUP_NONE = define(0)
  val G_TLS_DATABASE_LOOKUP_KEYPAIR = define(1)
  inline def getName(inline value: GTlsDatabaseLookupFlags): Option[String] =
    inline value match
      case G_TLS_DATABASE_LOOKUP_NONE => Some("G_TLS_DATABASE_LOOKUP_NONE")
      case G_TLS_DATABASE_LOOKUP_KEYPAIR => Some("G_TLS_DATABASE_LOOKUP_KEYPAIR")
      case _ => None
  extension (a: GTlsDatabaseLookupFlags)
    inline def &(b: GTlsDatabaseLookupFlags): GTlsDatabaseLookupFlags = a & b
    inline def |(b: GTlsDatabaseLookupFlags): GTlsDatabaseLookupFlags = a | b
    inline def is(b: GTlsDatabaseLookupFlags): Boolean = (a & b) == b

/**
 * GTlsDatabaseVerifyFlags: _TLS_DATABASE_VERIFY_NONE: No verification flags

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GTlsDatabaseVerifyFlags = CUnsignedInt
object GTlsDatabaseVerifyFlags extends CEnumU[GTlsDatabaseVerifyFlags]:
  given _tag: Tag[GTlsDatabaseVerifyFlags] = Tag.UInt
  inline def define(inline a: Long): GTlsDatabaseVerifyFlags = a.toUInt
  val G_TLS_DATABASE_VERIFY_NONE = define(0)
  inline def getName(inline value: GTlsDatabaseVerifyFlags): Option[String] =
    inline value match
      case G_TLS_DATABASE_VERIFY_NONE => Some("G_TLS_DATABASE_VERIFY_NONE")
      case _ => None
  extension (a: GTlsDatabaseVerifyFlags)
    inline def &(b: GTlsDatabaseVerifyFlags): GTlsDatabaseVerifyFlags = a & b
    inline def |(b: GTlsDatabaseVerifyFlags): GTlsDatabaseVerifyFlags = a | b
    inline def is(b: GTlsDatabaseVerifyFlags): Boolean = (a & b) == b

/**
 * GTlsError: _TLS_ERROR_UNAVAILABLE: No TLS provider is available _TLS_ERROR_MISC: Miscellaneous TLS error _TLS_ERROR_BAD_CERTIFICATE: The certificate presented could not be parsed or failed validation. _TLS_ERROR_NOT_TLS: The TLS handshake failed because the peer does not seem to be a TLS server. _TLS_ERROR_HANDSHAKE: The TLS handshake failed because the peer's certificate was not acceptable. _TLS_ERROR_CERTIFICATE_REQUIRED: The TLS handshake failed because the server requested a client-side certificate, but none was provided. See g_tls_connection_set_certificate(). _TLS_ERROR_EOF: The TLS connection was closed without proper notice, which may indicate an attack. See g_tls_connection_set_require_close_notify(). _TLS_ERROR_INAPPROPRIATE_FALLBACK: The TLS handshake failed because the client sent the fallback SCSV, indicating a protocol downgrade attack. Since: 2.60 _TLS_ERROR_BAD_CERTIFICATE_PASSWORD: The certificate failed to load because a password was incorrect. Since: 2.72

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
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
    inline value match
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

/**
 * GTlsInteractionResult: _TLS_INTERACTION_UNHANDLED: The interaction was unhandled (i.e. not implemented). _TLS_INTERACTION_HANDLED: The interaction completed, and resulting data is available. _TLS_INTERACTION_FAILED: The interaction has failed, or was cancelled. and the operation should be aborted.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GTlsInteractionResult = CUnsignedInt
object GTlsInteractionResult extends CEnumU[GTlsInteractionResult]:
  given _tag: Tag[GTlsInteractionResult] = Tag.UInt
  inline def define(inline a: Long): GTlsInteractionResult = a.toUInt
  val G_TLS_INTERACTION_UNHANDLED = define(0)
  val G_TLS_INTERACTION_HANDLED = define(1)
  val G_TLS_INTERACTION_FAILED = define(2)
  inline def getName(inline value: GTlsInteractionResult): Option[String] =
    inline value match
      case G_TLS_INTERACTION_UNHANDLED => Some("G_TLS_INTERACTION_UNHANDLED")
      case G_TLS_INTERACTION_HANDLED => Some("G_TLS_INTERACTION_HANDLED")
      case G_TLS_INTERACTION_FAILED => Some("G_TLS_INTERACTION_FAILED")
      case _ => None
  extension (a: GTlsInteractionResult)
    inline def &(b: GTlsInteractionResult): GTlsInteractionResult = a & b
    inline def |(b: GTlsInteractionResult): GTlsInteractionResult = a | b
    inline def is(b: GTlsInteractionResult): Boolean = (a & b) == b

/**
 * GTlsProtocolVersion: _TLS_PROTOCOL_VERSION_UNKNOWN: No protocol version or unknown protocol version _TLS_PROTOCOL_VERSION_SSL_3_0: SSL 3.0, which is insecure and should not be used _TLS_PROTOCOL_VERSION_TLS_1_0: TLS 1.0, which is insecure and should not be used _TLS_PROTOCOL_VERSION_TLS_1_1: TLS 1.1, which is insecure and should not be used _TLS_PROTOCOL_VERSION_TLS_1_2: TLS 1.2, defined by [RFC 5246](https://datatracker.ietf.org/doc/html/rfc5246) _TLS_PROTOCOL_VERSION_TLS_1_3: TLS 1.3, defined by [RFC 8446](https://datatracker.ietf.org/doc/html/rfc8446) _TLS_PROTOCOL_VERSION_DTLS_1_0: DTLS 1.0, which is insecure and should not be used _TLS_PROTOCOL_VERSION_DTLS_1_2: DTLS 1.2, defined by [RFC 6347](https://datatracker.ietf.org/doc/html/rfc6347)

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
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
    inline value match
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

/**
 * GTlsRehandshakeMode: _TLS_REHANDSHAKE_NEVER: Never allow rehandshaking _TLS_REHANDSHAKE_SAFELY: Allow safe rehandshaking only _TLS_REHANDSHAKE_UNSAFELY: Allow unsafe rehandshaking

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GTlsRehandshakeMode = CUnsignedInt
object GTlsRehandshakeMode extends CEnumU[GTlsRehandshakeMode]:
  given _tag: Tag[GTlsRehandshakeMode] = Tag.UInt
  inline def define(inline a: Long): GTlsRehandshakeMode = a.toUInt
  val G_TLS_REHANDSHAKE_NEVER = define(0)
  val G_TLS_REHANDSHAKE_SAFELY = define(1)
  val G_TLS_REHANDSHAKE_UNSAFELY = define(2)
  inline def getName(inline value: GTlsRehandshakeMode): Option[String] =
    inline value match
      case G_TLS_REHANDSHAKE_NEVER => Some("G_TLS_REHANDSHAKE_NEVER")
      case G_TLS_REHANDSHAKE_SAFELY => Some("G_TLS_REHANDSHAKE_SAFELY")
      case G_TLS_REHANDSHAKE_UNSAFELY => Some("G_TLS_REHANDSHAKE_UNSAFELY")
      case _ => None
  extension (a: GTlsRehandshakeMode)
    inline def &(b: GTlsRehandshakeMode): GTlsRehandshakeMode = a & b
    inline def |(b: GTlsRehandshakeMode): GTlsRehandshakeMode = a | b
    inline def is(b: GTlsRehandshakeMode): Boolean = (a & b) == b

/**
 * GUnixSocketAddressType: _UNIX_SOCKET_ADDRESS_INVALID: invalid _UNIX_SOCKET_ADDRESS_ANONYMOUS: anonymous _UNIX_SOCKET_ADDRESS_PATH: a filesystem path _UNIX_SOCKET_ADDRESS_ABSTRACT: an abstract name _UNIX_SOCKET_ADDRESS_ABSTRACT_PADDED: an abstract name, 0-padded to the full length of a unix socket name

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
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
    inline value match
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

/**
 * GZlibCompressorFormat: _ZLIB_COMPRESSOR_FORMAT_ZLIB: deflate compression with zlib header _ZLIB_COMPRESSOR_FORMAT_GZIP: gzip file format _ZLIB_COMPRESSOR_FORMAT_RAW: deflate compression with no header

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
opaque type GZlibCompressorFormat = CUnsignedInt
object GZlibCompressorFormat extends CEnumU[GZlibCompressorFormat]:
  given _tag: Tag[GZlibCompressorFormat] = Tag.UInt
  inline def define(inline a: Long): GZlibCompressorFormat = a.toUInt
  val G_ZLIB_COMPRESSOR_FORMAT_ZLIB = define(0)
  val G_ZLIB_COMPRESSOR_FORMAT_GZIP = define(1)
  val G_ZLIB_COMPRESSOR_FORMAT_RAW = define(2)
  inline def getName(inline value: GZlibCompressorFormat): Option[String] =
    inline value match
      case G_ZLIB_COMPRESSOR_FORMAT_ZLIB => Some("G_ZLIB_COMPRESSOR_FORMAT_ZLIB")
      case G_ZLIB_COMPRESSOR_FORMAT_GZIP => Some("G_ZLIB_COMPRESSOR_FORMAT_GZIP")
      case G_ZLIB_COMPRESSOR_FORMAT_RAW => Some("G_ZLIB_COMPRESSOR_FORMAT_RAW")
      case _ => None
  extension (a: GZlibCompressorFormat)
    inline def &(b: GZlibCompressorFormat): GZlibCompressorFormat = a & b
    inline def |(b: GZlibCompressorFormat): GZlibCompressorFormat = a | b
    inline def is(b: GZlibCompressorFormat): Boolean = (a & b) == b

/**
 * GTlsPasswordFlags: _TLS_PASSWORD_NONE: No flags _TLS_PASSWORD_RETRY: The password was wrong, and the user should retry. _TLS_PASSWORD_MANY_TRIES: Hint to the user that the password has been wrong many times, and the user may not have many chances left. _TLS_PASSWORD_FINAL_TRY: Hint to the user that this is the last try to get this password right. _TLS_PASSWORD_PKCS11_USER: For PKCS #11, the user PIN is required. Since: 2.70. _TLS_PASSWORD_PKCS11_SECURITY_OFFICER: For PKCS #11, the security officer PIN is required. Since: 2.70. _TLS_PASSWORD_PKCS11_CONTEXT_SPECIFIC: For PKCS #11, the context-specific PIN is required. Since: 2.70.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gio/gioenums.h
*/
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
    inline value match
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

