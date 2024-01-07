package gobject
package enumerations

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

private[gobject] trait CEnum[T](using eq: T =:= Int):
  given Tag[T] = Tag.Int.asInstanceOf[Tag[T]]
  extension (inline t: T) 
    inline def int: CInt = eq.apply(t)
    inline def value: CInt = eq.apply(t)
private[gobject] trait CEnumU[T](using eq: T =:= UInt):
  given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
  extension (inline t: T)
   inline def int: CInt = eq.apply(t).toInt
   inline def uint: CUnsignedInt = eq.apply(t)
   inline def value: CUnsignedInt = eq.apply(t)
/**
 * GBindingFlags: _BINDING_DEFAULT: The default binding; if the source property changes, the target property is updated with its value. _BINDING_BIDIRECTIONAL: Bidirectional binding; if either the property of the source or the property of the target changes, the other is updated. _BINDING_SYNC_CREATE: Synchronize the values of the source and target properties when creating the binding; the direction of the synchronization is always from the source to the target. _BINDING_INVERT_BOOLEAN: If the two properties being bound are booleans, setting one to %TRUE will result in the other being set to %FALSE and vice versa. This flag will only work for boolean properties, and cannot be used when passing custom transformation functions to g_object_bind_property_full().

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gobject/gbinding.h
*/
opaque type GBindingFlags = CUnsignedInt
object GBindingFlags extends CEnumU[GBindingFlags]:
  given _tag: Tag[GBindingFlags] = Tag.UInt
  inline def define(inline a: Long): GBindingFlags = a.toUInt
  val G_BINDING_DEFAULT = define(0)
  val G_BINDING_BIDIRECTIONAL = define(1)
  val G_BINDING_SYNC_CREATE = define(2)
  val G_BINDING_INVERT_BOOLEAN = define(4)
  inline def getName(inline value: GBindingFlags): Option[String] =
    inline value match
      case G_BINDING_DEFAULT => Some("G_BINDING_DEFAULT")
      case G_BINDING_BIDIRECTIONAL => Some("G_BINDING_BIDIRECTIONAL")
      case G_BINDING_SYNC_CREATE => Some("G_BINDING_SYNC_CREATE")
      case G_BINDING_INVERT_BOOLEAN => Some("G_BINDING_INVERT_BOOLEAN")
      case _ => None
  extension (a: GBindingFlags)
    inline def &(b: GBindingFlags): GBindingFlags = a & b
    inline def |(b: GBindingFlags): GBindingFlags = a | b
    inline def is(b: GBindingFlags): Boolean = (a & b) == b

/**
 * GConnectFlags: _CONNECT_DEFAULT: Default behaviour (no special flags). Since: 2.74 _CONNECT_AFTER: If set, the handler should be called after the default handler of the signal. Normally, the handler is called before the default handler. _CONNECT_SWAPPED: If set, the instance and data should be swapped when calling the handler; see g_signal_connect_swapped() for an example.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gobject/gsignal.h
*/
opaque type GConnectFlags = CUnsignedInt
object GConnectFlags extends CEnumU[GConnectFlags]:
  given _tag: Tag[GConnectFlags] = Tag.UInt
  inline def define(inline a: Long): GConnectFlags = a.toUInt
  val G_CONNECT_DEFAULT = define(0)
  val G_CONNECT_AFTER = define(1)
  val G_CONNECT_SWAPPED = define(2)
  inline def getName(inline value: GConnectFlags): Option[String] =
    inline value match
      case G_CONNECT_DEFAULT => Some("G_CONNECT_DEFAULT")
      case G_CONNECT_AFTER => Some("G_CONNECT_AFTER")
      case G_CONNECT_SWAPPED => Some("G_CONNECT_SWAPPED")
      case _ => None
  extension (a: GConnectFlags)
    inline def &(b: GConnectFlags): GConnectFlags = a & b
    inline def |(b: GConnectFlags): GConnectFlags = a | b
    inline def is(b: GConnectFlags): Boolean = (a & b) == b

/**
 * GParamFlags: _PARAM_READABLE: the parameter is readable _PARAM_WRITABLE: the parameter is writable _PARAM_READWRITE: alias for %G_PARAM_READABLE | %G_PARAM_WRITABLE _PARAM_CONSTRUCT: the parameter will be set upon object construction _PARAM_CONSTRUCT_ONLY: the parameter can only be set upon object construction _PARAM_LAX_VALIDATION: upon parameter conversion (see g_param_value_convert()) strict validation is not required _PARAM_STATIC_NAME: the string used as name when constructing the parameter is guaranteed to remain valid and unmodified for the lifetime of the parameter. Since 2.8 _PARAM_STATIC_NICK: the string used as nick when constructing the parameter is guaranteed to remain valid and unmmodified for the lifetime of the parameter. Since 2.8 _PARAM_STATIC_BLURB: the string used as blurb when constructing the parameter is guaranteed to remain valid and unmodified for the lifetime of the parameter. Since 2.8 _PARAM_EXPLICIT_NOTIFY: calls to g_object_set_property() for this property will not automatically result in a "notify" signal being emitted: the implementation must call g_object_notify() themselves in case the property actually changes. Since: 2.42. _PARAM_PRIVATE: internal _PARAM_DEPRECATED: the parameter is deprecated and will be removed in a future version. A warning will be generated if it is used while running with G_ENABLE_DIAGNOSTIC=1. Since 2.26

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gobject/gparam.h
*/
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
    inline value match
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

/**
 * GSignalFlags: _SIGNAL_RUN_FIRST: Invoke the object method handler in the first emission stage. _SIGNAL_RUN_LAST: Invoke the object method handler in the third emission stage. _SIGNAL_RUN_CLEANUP: Invoke the object method handler in the last emission stage. _SIGNAL_NO_RECURSE: Signals being emitted for an object while currently being in emission for this very object will not be emitted recursively, but instead cause the first emission to be restarted. _SIGNAL_DETAILED: This signal supports "::detail" appendices to the signal name upon handler connections and emissions. _SIGNAL_ACTION: Action signals are signals that may freely be emitted on alive objects from user code via g_signal_emit() and friends, without the need of being embedded into extra code that performs pre or post emission adjustments on the object. They can also be thought of as object methods which can be called generically by third-party code. _SIGNAL_NO_HOOKS: No emissions hooks are supported for this signal. _SIGNAL_MUST_COLLECT: Varargs signal emission will always collect the arguments, even if there are no signal handlers connected. Since 2.30. _SIGNAL_DEPRECATED: The signal is deprecated and will be removed in a future version. A warning will be generated if it is connected while running with G_ENABLE_DIAGNOSTIC=1. Since 2.32. _SIGNAL_ACCUMULATOR_FIRST_RUN: Only used in #GSignalAccumulator accumulator functions for the #GSignalInvocationHint::run_type field to mark the first call to the accumulator function for a signal emission. Since 2.68.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gobject/gsignal.h
*/
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
    inline value match
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

/**
 * GSignalMatchType: _SIGNAL_MATCH_ID: The signal id must be equal. _SIGNAL_MATCH_DETAIL: The signal detail must be equal. _SIGNAL_MATCH_CLOSURE: The closure must be the same. _SIGNAL_MATCH_FUNC: The C closure callback must be the same. _SIGNAL_MATCH_DATA: The closure data must be the same. _SIGNAL_MATCH_UNBLOCKED: Only unblocked signals may be matched.

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gobject/gsignal.h
*/
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
    inline value match
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

/**
 * GTypeDebugFlags: _TYPE_DEBUG_NONE: Print no messages _TYPE_DEBUG_OBJECTS: Print messages about object bookkeeping _TYPE_DEBUG_SIGNALS: Print messages about signal emissions _TYPE_DEBUG_MASK: Mask covering all debug flags _TYPE_DEBUG_INSTANCE_COUNT: Keep a count of instances of each type

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gobject/gtype.h
*/
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
    inline value match
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

/**
 * GTypeFlags: _TYPE_FLAG_NONE: No special flags. Since: 2.74 _TYPE_FLAG_ABSTRACT: Indicates an abstract type. No instances can be created for an abstract type _TYPE_FLAG_VALUE_ABSTRACT: Indicates an abstract value type, i.e. a type that introduces a value table, but can't be used for g_value_init() _TYPE_FLAG_FINAL: Indicates a final type. A final type is a non-derivable leaf node in a deep derivable type hierarchy tree. Since: 2.70 _TYPE_FLAG_DEPRECATED: The type is deprecated and may be removed in a future version. A warning will be emitted if it is instantiated while running with `G_ENABLE_DIAGNOSTIC=1`. Since 2.76

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gobject/gtype.h
*/
opaque type GTypeFlags = CUnsignedInt
object GTypeFlags extends CEnumU[GTypeFlags]:
  given _tag: Tag[GTypeFlags] = Tag.UInt
  inline def define(inline a: Long): GTypeFlags = a.toUInt
  val G_TYPE_FLAG_NONE = define(0)
  val G_TYPE_FLAG_ABSTRACT = define(16)
  val G_TYPE_FLAG_VALUE_ABSTRACT = define(32)
  val G_TYPE_FLAG_FINAL = define(64)
  val G_TYPE_FLAG_DEPRECATED = define(128)
  inline def getName(inline value: GTypeFlags): Option[String] =
    inline value match
      case G_TYPE_FLAG_NONE => Some("G_TYPE_FLAG_NONE")
      case G_TYPE_FLAG_ABSTRACT => Some("G_TYPE_FLAG_ABSTRACT")
      case G_TYPE_FLAG_VALUE_ABSTRACT => Some("G_TYPE_FLAG_VALUE_ABSTRACT")
      case G_TYPE_FLAG_FINAL => Some("G_TYPE_FLAG_FINAL")
      case G_TYPE_FLAG_DEPRECATED => Some("G_TYPE_FLAG_DEPRECATED")
      case _ => None
  extension (a: GTypeFlags)
    inline def &(b: GTypeFlags): GTypeFlags = a & b
    inline def |(b: GTypeFlags): GTypeFlags = a | b
    inline def is(b: GTypeFlags): Boolean = (a & b) == b

/**
 * GTypeFundamentalFlags: _TYPE_FLAG_CLASSED: Indicates a classed type _TYPE_FLAG_INSTANTIATABLE: Indicates an instantiatable type (implies classed) _TYPE_FLAG_DERIVABLE: Indicates a flat derivable type _TYPE_FLAG_DEEP_DERIVABLE: Indicates a deep derivable type (implies derivable)

 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gobject/gtype.h
*/
opaque type GTypeFundamentalFlags = CUnsignedInt
object GTypeFundamentalFlags extends CEnumU[GTypeFundamentalFlags]:
  given _tag: Tag[GTypeFundamentalFlags] = Tag.UInt
  inline def define(inline a: Long): GTypeFundamentalFlags = a.toUInt
  val G_TYPE_FLAG_CLASSED = define(1)
  val G_TYPE_FLAG_INSTANTIATABLE = define(2)
  val G_TYPE_FLAG_DERIVABLE = define(4)
  val G_TYPE_FLAG_DEEP_DERIVABLE = define(8)
  inline def getName(inline value: GTypeFundamentalFlags): Option[String] =
    inline value match
      case G_TYPE_FLAG_CLASSED => Some("G_TYPE_FLAG_CLASSED")
      case G_TYPE_FLAG_INSTANTIATABLE => Some("G_TYPE_FLAG_INSTANTIATABLE")
      case G_TYPE_FLAG_DERIVABLE => Some("G_TYPE_FLAG_DERIVABLE")
      case G_TYPE_FLAG_DEEP_DERIVABLE => Some("G_TYPE_FLAG_DEEP_DERIVABLE")
      case _ => None
  extension (a: GTypeFundamentalFlags)
    inline def &(b: GTypeFundamentalFlags): GTypeFundamentalFlags = a & b
    inline def |(b: GTypeFundamentalFlags): GTypeFundamentalFlags = a | b
    inline def is(b: GTypeFundamentalFlags): Boolean = (a & b) == b

