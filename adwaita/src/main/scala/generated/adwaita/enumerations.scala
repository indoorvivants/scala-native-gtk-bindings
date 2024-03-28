package adwaita
package enumerations

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

private[adwaita] trait CEnum[T](using eq: T =:= Int):
  given Tag[T] = Tag.Int.asInstanceOf[Tag[T]]
  extension (inline t: T) 
    inline def int: CInt = eq.apply(t)
    inline def value: CInt = eq.apply(t)
private[adwaita] trait CEnumU[T](using eq: T =:= UInt):
  given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
  extension (inline t: T)
   inline def int: CInt = eq.apply(t).toInt
   inline def uint: CUnsignedInt = eq.apply(t)
   inline def value: CUnsignedInt = eq.apply(t)
/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-animation.h
*/
opaque type AdwAnimationState = CUnsignedInt
object AdwAnimationState extends CEnumU[AdwAnimationState]:
  given _tag: Tag[AdwAnimationState] = Tag.UInt
  inline def define(inline a: Long): AdwAnimationState = a.toUInt
  val ADW_ANIMATION_IDLE = define(0)
  val ADW_ANIMATION_PAUSED = define(1)
  val ADW_ANIMATION_PLAYING = define(2)
  val ADW_ANIMATION_FINISHED = define(3)
  inline def getName(inline value: AdwAnimationState): Option[String] =
    inline value match
      case ADW_ANIMATION_IDLE => Some("ADW_ANIMATION_IDLE")
      case ADW_ANIMATION_PAUSED => Some("ADW_ANIMATION_PAUSED")
      case ADW_ANIMATION_PLAYING => Some("ADW_ANIMATION_PLAYING")
      case ADW_ANIMATION_FINISHED => Some("ADW_ANIMATION_FINISHED")
      case _ => None
  extension (a: AdwAnimationState)
    inline def &(b: AdwAnimationState): AdwAnimationState = a & b
    inline def |(b: AdwAnimationState): AdwAnimationState = a | b
    inline def is(b: AdwAnimationState): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-header-bar.h
*/
opaque type AdwCenteringPolicy = CUnsignedInt
object AdwCenteringPolicy extends CEnumU[AdwCenteringPolicy]:
  given _tag: Tag[AdwCenteringPolicy] = Tag.UInt
  inline def define(inline a: Long): AdwCenteringPolicy = a.toUInt
  val ADW_CENTERING_POLICY_LOOSE = define(0)
  val ADW_CENTERING_POLICY_STRICT = define(1)
  inline def getName(inline value: AdwCenteringPolicy): Option[String] =
    inline value match
      case ADW_CENTERING_POLICY_LOOSE => Some("ADW_CENTERING_POLICY_LOOSE")
      case ADW_CENTERING_POLICY_STRICT => Some("ADW_CENTERING_POLICY_STRICT")
      case _ => None
  extension (a: AdwCenteringPolicy)
    inline def &(b: AdwCenteringPolicy): AdwCenteringPolicy = a & b
    inline def |(b: AdwCenteringPolicy): AdwCenteringPolicy = a | b
    inline def is(b: AdwCenteringPolicy): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-style-manager.h
*/
opaque type AdwColorScheme = CUnsignedInt
object AdwColorScheme extends CEnumU[AdwColorScheme]:
  given _tag: Tag[AdwColorScheme] = Tag.UInt
  inline def define(inline a: Long): AdwColorScheme = a.toUInt
  val ADW_COLOR_SCHEME_DEFAULT = define(0)
  val ADW_COLOR_SCHEME_FORCE_LIGHT = define(1)
  val ADW_COLOR_SCHEME_PREFER_LIGHT = define(2)
  val ADW_COLOR_SCHEME_PREFER_DARK = define(3)
  val ADW_COLOR_SCHEME_FORCE_DARK = define(4)
  inline def getName(inline value: AdwColorScheme): Option[String] =
    inline value match
      case ADW_COLOR_SCHEME_DEFAULT => Some("ADW_COLOR_SCHEME_DEFAULT")
      case ADW_COLOR_SCHEME_FORCE_LIGHT => Some("ADW_COLOR_SCHEME_FORCE_LIGHT")
      case ADW_COLOR_SCHEME_PREFER_LIGHT => Some("ADW_COLOR_SCHEME_PREFER_LIGHT")
      case ADW_COLOR_SCHEME_PREFER_DARK => Some("ADW_COLOR_SCHEME_PREFER_DARK")
      case ADW_COLOR_SCHEME_FORCE_DARK => Some("ADW_COLOR_SCHEME_FORCE_DARK")
      case _ => None
  extension (a: AdwColorScheme)
    inline def &(b: AdwColorScheme): AdwColorScheme = a & b
    inline def |(b: AdwColorScheme): AdwColorScheme = a | b
    inline def is(b: AdwColorScheme): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-easing.h
*/
opaque type AdwEasing = CUnsignedInt
object AdwEasing extends CEnumU[AdwEasing]:
  given _tag: Tag[AdwEasing] = Tag.UInt
  inline def define(inline a: Long): AdwEasing = a.toUInt
  val ADW_LINEAR = define(0)
  val ADW_EASE_IN_QUAD = define(1)
  val ADW_EASE_OUT_QUAD = define(2)
  val ADW_EASE_IN_OUT_QUAD = define(3)
  val ADW_EASE_IN_CUBIC = define(4)
  val ADW_EASE_OUT_CUBIC = define(5)
  val ADW_EASE_IN_OUT_CUBIC = define(6)
  val ADW_EASE_IN_QUART = define(7)
  val ADW_EASE_OUT_QUART = define(8)
  val ADW_EASE_IN_OUT_QUART = define(9)
  val ADW_EASE_IN_QUINT = define(10)
  val ADW_EASE_OUT_QUINT = define(11)
  val ADW_EASE_IN_OUT_QUINT = define(12)
  val ADW_EASE_IN_SINE = define(13)
  val ADW_EASE_OUT_SINE = define(14)
  val ADW_EASE_IN_OUT_SINE = define(15)
  val ADW_EASE_IN_EXPO = define(16)
  val ADW_EASE_OUT_EXPO = define(17)
  val ADW_EASE_IN_OUT_EXPO = define(18)
  val ADW_EASE_IN_CIRC = define(19)
  val ADW_EASE_OUT_CIRC = define(20)
  val ADW_EASE_IN_OUT_CIRC = define(21)
  val ADW_EASE_IN_ELASTIC = define(22)
  val ADW_EASE_OUT_ELASTIC = define(23)
  val ADW_EASE_IN_OUT_ELASTIC = define(24)
  val ADW_EASE_IN_BACK = define(25)
  val ADW_EASE_OUT_BACK = define(26)
  val ADW_EASE_IN_OUT_BACK = define(27)
  val ADW_EASE_IN_BOUNCE = define(28)
  val ADW_EASE_OUT_BOUNCE = define(29)
  val ADW_EASE_IN_OUT_BOUNCE = define(30)
  inline def getName(inline value: AdwEasing): Option[String] =
    inline value match
      case ADW_LINEAR => Some("ADW_LINEAR")
      case ADW_EASE_IN_QUAD => Some("ADW_EASE_IN_QUAD")
      case ADW_EASE_OUT_QUAD => Some("ADW_EASE_OUT_QUAD")
      case ADW_EASE_IN_OUT_QUAD => Some("ADW_EASE_IN_OUT_QUAD")
      case ADW_EASE_IN_CUBIC => Some("ADW_EASE_IN_CUBIC")
      case ADW_EASE_OUT_CUBIC => Some("ADW_EASE_OUT_CUBIC")
      case ADW_EASE_IN_OUT_CUBIC => Some("ADW_EASE_IN_OUT_CUBIC")
      case ADW_EASE_IN_QUART => Some("ADW_EASE_IN_QUART")
      case ADW_EASE_OUT_QUART => Some("ADW_EASE_OUT_QUART")
      case ADW_EASE_IN_OUT_QUART => Some("ADW_EASE_IN_OUT_QUART")
      case ADW_EASE_IN_QUINT => Some("ADW_EASE_IN_QUINT")
      case ADW_EASE_OUT_QUINT => Some("ADW_EASE_OUT_QUINT")
      case ADW_EASE_IN_OUT_QUINT => Some("ADW_EASE_IN_OUT_QUINT")
      case ADW_EASE_IN_SINE => Some("ADW_EASE_IN_SINE")
      case ADW_EASE_OUT_SINE => Some("ADW_EASE_OUT_SINE")
      case ADW_EASE_IN_OUT_SINE => Some("ADW_EASE_IN_OUT_SINE")
      case ADW_EASE_IN_EXPO => Some("ADW_EASE_IN_EXPO")
      case ADW_EASE_OUT_EXPO => Some("ADW_EASE_OUT_EXPO")
      case ADW_EASE_IN_OUT_EXPO => Some("ADW_EASE_IN_OUT_EXPO")
      case ADW_EASE_IN_CIRC => Some("ADW_EASE_IN_CIRC")
      case ADW_EASE_OUT_CIRC => Some("ADW_EASE_OUT_CIRC")
      case ADW_EASE_IN_OUT_CIRC => Some("ADW_EASE_IN_OUT_CIRC")
      case ADW_EASE_IN_ELASTIC => Some("ADW_EASE_IN_ELASTIC")
      case ADW_EASE_OUT_ELASTIC => Some("ADW_EASE_OUT_ELASTIC")
      case ADW_EASE_IN_OUT_ELASTIC => Some("ADW_EASE_IN_OUT_ELASTIC")
      case ADW_EASE_IN_BACK => Some("ADW_EASE_IN_BACK")
      case ADW_EASE_OUT_BACK => Some("ADW_EASE_OUT_BACK")
      case ADW_EASE_IN_OUT_BACK => Some("ADW_EASE_IN_OUT_BACK")
      case ADW_EASE_IN_BOUNCE => Some("ADW_EASE_IN_BOUNCE")
      case ADW_EASE_OUT_BOUNCE => Some("ADW_EASE_OUT_BOUNCE")
      case ADW_EASE_IN_OUT_BOUNCE => Some("ADW_EASE_IN_OUT_BOUNCE")
      case _ => None
  extension (a: AdwEasing)
    inline def &(b: AdwEasing): AdwEasing = a & b
    inline def |(b: AdwEasing): AdwEasing = a | b
    inline def is(b: AdwEasing): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-flap.h
*/
opaque type AdwFlapFoldPolicy = CUnsignedInt
object AdwFlapFoldPolicy extends CEnumU[AdwFlapFoldPolicy]:
  given _tag: Tag[AdwFlapFoldPolicy] = Tag.UInt
  inline def define(inline a: Long): AdwFlapFoldPolicy = a.toUInt
  val ADW_FLAP_FOLD_POLICY_NEVER = define(0)
  val ADW_FLAP_FOLD_POLICY_ALWAYS = define(1)
  val ADW_FLAP_FOLD_POLICY_AUTO = define(2)
  inline def getName(inline value: AdwFlapFoldPolicy): Option[String] =
    inline value match
      case ADW_FLAP_FOLD_POLICY_NEVER => Some("ADW_FLAP_FOLD_POLICY_NEVER")
      case ADW_FLAP_FOLD_POLICY_ALWAYS => Some("ADW_FLAP_FOLD_POLICY_ALWAYS")
      case ADW_FLAP_FOLD_POLICY_AUTO => Some("ADW_FLAP_FOLD_POLICY_AUTO")
      case _ => None
  extension (a: AdwFlapFoldPolicy)
    inline def &(b: AdwFlapFoldPolicy): AdwFlapFoldPolicy = a & b
    inline def |(b: AdwFlapFoldPolicy): AdwFlapFoldPolicy = a | b
    inline def is(b: AdwFlapFoldPolicy): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-flap.h
*/
opaque type AdwFlapTransitionType = CUnsignedInt
object AdwFlapTransitionType extends CEnumU[AdwFlapTransitionType]:
  given _tag: Tag[AdwFlapTransitionType] = Tag.UInt
  inline def define(inline a: Long): AdwFlapTransitionType = a.toUInt
  val ADW_FLAP_TRANSITION_TYPE_OVER = define(0)
  val ADW_FLAP_TRANSITION_TYPE_UNDER = define(1)
  val ADW_FLAP_TRANSITION_TYPE_SLIDE = define(2)
  inline def getName(inline value: AdwFlapTransitionType): Option[String] =
    inline value match
      case ADW_FLAP_TRANSITION_TYPE_OVER => Some("ADW_FLAP_TRANSITION_TYPE_OVER")
      case ADW_FLAP_TRANSITION_TYPE_UNDER => Some("ADW_FLAP_TRANSITION_TYPE_UNDER")
      case ADW_FLAP_TRANSITION_TYPE_SLIDE => Some("ADW_FLAP_TRANSITION_TYPE_SLIDE")
      case _ => None
  extension (a: AdwFlapTransitionType)
    inline def &(b: AdwFlapTransitionType): AdwFlapTransitionType = a & b
    inline def |(b: AdwFlapTransitionType): AdwFlapTransitionType = a | b
    inline def is(b: AdwFlapTransitionType): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-fold-threshold-policy.h
*/
opaque type AdwFoldThresholdPolicy = CUnsignedInt
object AdwFoldThresholdPolicy extends CEnumU[AdwFoldThresholdPolicy]:
  given _tag: Tag[AdwFoldThresholdPolicy] = Tag.UInt
  inline def define(inline a: Long): AdwFoldThresholdPolicy = a.toUInt
  val ADW_FOLD_THRESHOLD_POLICY_MINIMUM = define(0)
  val ADW_FOLD_THRESHOLD_POLICY_NATURAL = define(1)
  inline def getName(inline value: AdwFoldThresholdPolicy): Option[String] =
    inline value match
      case ADW_FOLD_THRESHOLD_POLICY_MINIMUM => Some("ADW_FOLD_THRESHOLD_POLICY_MINIMUM")
      case ADW_FOLD_THRESHOLD_POLICY_NATURAL => Some("ADW_FOLD_THRESHOLD_POLICY_NATURAL")
      case _ => None
  extension (a: AdwFoldThresholdPolicy)
    inline def &(b: AdwFoldThresholdPolicy): AdwFoldThresholdPolicy = a & b
    inline def |(b: AdwFoldThresholdPolicy): AdwFoldThresholdPolicy = a | b
    inline def is(b: AdwFoldThresholdPolicy): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-leaflet.h
*/
opaque type AdwLeafletTransitionType = CUnsignedInt
object AdwLeafletTransitionType extends CEnumU[AdwLeafletTransitionType]:
  given _tag: Tag[AdwLeafletTransitionType] = Tag.UInt
  inline def define(inline a: Long): AdwLeafletTransitionType = a.toUInt
  val ADW_LEAFLET_TRANSITION_TYPE_OVER = define(0)
  val ADW_LEAFLET_TRANSITION_TYPE_UNDER = define(1)
  val ADW_LEAFLET_TRANSITION_TYPE_SLIDE = define(2)
  inline def getName(inline value: AdwLeafletTransitionType): Option[String] =
    inline value match
      case ADW_LEAFLET_TRANSITION_TYPE_OVER => Some("ADW_LEAFLET_TRANSITION_TYPE_OVER")
      case ADW_LEAFLET_TRANSITION_TYPE_UNDER => Some("ADW_LEAFLET_TRANSITION_TYPE_UNDER")
      case ADW_LEAFLET_TRANSITION_TYPE_SLIDE => Some("ADW_LEAFLET_TRANSITION_TYPE_SLIDE")
      case _ => None
  extension (a: AdwLeafletTransitionType)
    inline def &(b: AdwLeafletTransitionType): AdwLeafletTransitionType = a & b
    inline def |(b: AdwLeafletTransitionType): AdwLeafletTransitionType = a | b
    inline def is(b: AdwLeafletTransitionType): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-navigation-direction.h
*/
opaque type AdwNavigationDirection = CUnsignedInt
object AdwNavigationDirection extends CEnumU[AdwNavigationDirection]:
  given _tag: Tag[AdwNavigationDirection] = Tag.UInt
  inline def define(inline a: Long): AdwNavigationDirection = a.toUInt
  val ADW_NAVIGATION_DIRECTION_BACK = define(0)
  val ADW_NAVIGATION_DIRECTION_FORWARD = define(1)
  inline def getName(inline value: AdwNavigationDirection): Option[String] =
    inline value match
      case ADW_NAVIGATION_DIRECTION_BACK => Some("ADW_NAVIGATION_DIRECTION_BACK")
      case ADW_NAVIGATION_DIRECTION_FORWARD => Some("ADW_NAVIGATION_DIRECTION_FORWARD")
      case _ => None
  extension (a: AdwNavigationDirection)
    inline def &(b: AdwNavigationDirection): AdwNavigationDirection = a & b
    inline def |(b: AdwNavigationDirection): AdwNavigationDirection = a | b
    inline def is(b: AdwNavigationDirection): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-squeezer.h
*/
opaque type AdwSqueezerTransitionType = CUnsignedInt
object AdwSqueezerTransitionType extends CEnumU[AdwSqueezerTransitionType]:
  given _tag: Tag[AdwSqueezerTransitionType] = Tag.UInt
  inline def define(inline a: Long): AdwSqueezerTransitionType = a.toUInt
  val ADW_SQUEEZER_TRANSITION_TYPE_NONE = define(0)
  val ADW_SQUEEZER_TRANSITION_TYPE_CROSSFADE = define(1)
  inline def getName(inline value: AdwSqueezerTransitionType): Option[String] =
    inline value match
      case ADW_SQUEEZER_TRANSITION_TYPE_NONE => Some("ADW_SQUEEZER_TRANSITION_TYPE_NONE")
      case ADW_SQUEEZER_TRANSITION_TYPE_CROSSFADE => Some("ADW_SQUEEZER_TRANSITION_TYPE_CROSSFADE")
      case _ => None
  extension (a: AdwSqueezerTransitionType)
    inline def &(b: AdwSqueezerTransitionType): AdwSqueezerTransitionType = a & b
    inline def |(b: AdwSqueezerTransitionType): AdwSqueezerTransitionType = a | b
    inline def is(b: AdwSqueezerTransitionType): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-toast.h
*/
opaque type AdwToastPriority = CUnsignedInt
object AdwToastPriority extends CEnumU[AdwToastPriority]:
  given _tag: Tag[AdwToastPriority] = Tag.UInt
  inline def define(inline a: Long): AdwToastPriority = a.toUInt
  val ADW_TOAST_PRIORITY_NORMAL = define(0)
  val ADW_TOAST_PRIORITY_HIGH = define(1)
  inline def getName(inline value: AdwToastPriority): Option[String] =
    inline value match
      case ADW_TOAST_PRIORITY_NORMAL => Some("ADW_TOAST_PRIORITY_NORMAL")
      case ADW_TOAST_PRIORITY_HIGH => Some("ADW_TOAST_PRIORITY_HIGH")
      case _ => None
  extension (a: AdwToastPriority)
    inline def &(b: AdwToastPriority): AdwToastPriority = a & b
    inline def |(b: AdwToastPriority): AdwToastPriority = a | b
    inline def is(b: AdwToastPriority): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-switcher.h
*/
opaque type AdwViewSwitcherPolicy = CUnsignedInt
object AdwViewSwitcherPolicy extends CEnumU[AdwViewSwitcherPolicy]:
  given _tag: Tag[AdwViewSwitcherPolicy] = Tag.UInt
  inline def define(inline a: Long): AdwViewSwitcherPolicy = a.toUInt
  val ADW_VIEW_SWITCHER_POLICY_NARROW = define(0)
  val ADW_VIEW_SWITCHER_POLICY_WIDE = define(1)
  inline def getName(inline value: AdwViewSwitcherPolicy): Option[String] =
    inline value match
      case ADW_VIEW_SWITCHER_POLICY_NARROW => Some("ADW_VIEW_SWITCHER_POLICY_NARROW")
      case ADW_VIEW_SWITCHER_POLICY_WIDE => Some("ADW_VIEW_SWITCHER_POLICY_WIDE")
      case _ => None
  extension (a: AdwViewSwitcherPolicy)
    inline def &(b: AdwViewSwitcherPolicy): AdwViewSwitcherPolicy = a & b
    inline def |(b: AdwViewSwitcherPolicy): AdwViewSwitcherPolicy = a | b
    inline def is(b: AdwViewSwitcherPolicy): Boolean = (a & b) == b

/**
 * GAppInfoCreateFlags: _APP_INFO_CREATE_NONE: No flags. _APP_INFO_CREATE_NEEDS_TERMINAL: Application opens in a terminal window. _APP_INFO_CREATE_SUPPORTS_URIS: Application supports URI arguments. _APP_INFO_CREATE_SUPPORTS_STARTUP_NOTIFICATION: Application supports startup notification. Since 2.26

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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
 * GApplicationFlags: _APPLICATION_FLAGS_NONE: Default _APPLICATION_IS_SERVICE: Run as a service. In this mode, registration fails if the service is already running, and the application will initially wait up to 10 seconds for an initial activation message to arrive. _APPLICATION_IS_LAUNCHER: Don't try to become the primary instance. _APPLICATION_HANDLES_OPEN: This application handles opening files (in the primary instance). Note that this flag only affects the default implementation of local_command_line(), and has no effect if %G_APPLICATION_HANDLES_COMMAND_LINE is given. See g_application_run() for details. _APPLICATION_HANDLES_COMMAND_LINE: This application handles command line arguments (in the primary instance). Note that this flag only affect the default implementation of local_command_line(). See g_application_run() for details. _APPLICATION_SEND_ENVIRONMENT: Send the environment of the launching process to the primary instance. Set this flag if your application is expected to behave differently depending on certain environment variables. For instance, an editor might be expected to use the `GIT_COMMITTER_NAME` environment variable when editing a git commit message. The environment is available to the #GApplication::command-line signal handler, via g_application_command_line_getenv(). _APPLICATION_NON_UNIQUE: Make no attempts to do any of the typical single-instance application negotiation, even if the application ID is given. The application neither attempts to become the owner of the application ID nor does it check if an existing owner already exists. Everything occurs in the local process. Since: 2.30. _APPLICATION_CAN_OVERRIDE_APP_ID: Allow users to override the application ID from the command line with `--gapplication-app-id`. Since: 2.48 _APPLICATION_ALLOW_REPLACEMENT: Allow another instance to take over the bus name. Since: 2.60 _APPLICATION_REPLACE: Take over from another instance. This flag is usually set by passing `--gapplication-replace` on the commandline. Since: 2.60

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
*/
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
    inline value match
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
 * GAskPasswordFlags: _ASK_PASSWORD_NEED_PASSWORD: operation requires a password. _ASK_PASSWORD_NEED_USERNAME: operation requires a username. _ASK_PASSWORD_NEED_DOMAIN: operation requires a domain. _ASK_PASSWORD_SAVING_SUPPORTED: operation supports saving settings. _ASK_PASSWORD_ANONYMOUS_SUPPORTED: operation supports anonymous users. _ASK_PASSWORD_TCRYPT: operation takes TCRYPT parameters (Since: 2.58)

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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
 * GBindingFlags: _BINDING_DEFAULT: The default binding; if the source property changes, the target property is updated with its value. _BINDING_BIDIRECTIONAL: Bidirectional binding; if either the property of the source or the property of the target changes, the other is updated. _BINDING_SYNC_CREATE: Synchronize the values of the source and target properties when creating the binding; the direction of the synchronization is always from the source to the target. _BINDING_INVERT_BOOLEAN: If the two properties being bound are booleans, setting one to %TRUE will result in the other being set to %FALSE and vice versa. This flag will only work for boolean properties, and cannot be used when passing custom transformation functions to g_object_bind_property_full().

 * [bindgen] header: /usr/include/glib-2.0/gobject/gbinding.h
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
 * GBusNameOwnerFlags: _BUS_NAME_OWNER_FLAGS_NONE: No flags set. _BUS_NAME_OWNER_FLAGS_ALLOW_REPLACEMENT: Allow another message bus connection to claim the name. _BUS_NAME_OWNER_FLAGS_REPLACE: If another message bus connection owns the name and have specified %G_BUS_NAME_OWNER_FLAGS_ALLOW_REPLACEMENT, then take the name from the other connection. _BUS_NAME_OWNER_FLAGS_DO_NOT_QUEUE: If another message bus connection owns the name, immediately return an error from g_bus_own_name() rather than entering the waiting queue for that name. (Since 2.54)

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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
 * GConnectFlags: _CONNECT_AFTER: whether the handler should be called before or after the default handler of the signal. _CONNECT_SWAPPED: whether the instance and data should be swapped when calling the handler; see g_signal_connect_swapped() for an example.

 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
opaque type GConnectFlags = CUnsignedInt
object GConnectFlags extends CEnumU[GConnectFlags]:
  given _tag: Tag[GConnectFlags] = Tag.UInt
  inline def define(inline a: Long): GConnectFlags = a.toUInt
  val G_CONNECT_AFTER = define(1)
  val G_CONNECT_SWAPPED = define(2)
  inline def getName(inline value: GConnectFlags): Option[String] =
    inline value match
      case G_CONNECT_AFTER => Some("G_CONNECT_AFTER")
      case G_CONNECT_SWAPPED => Some("G_CONNECT_SWAPPED")
      case _ => None
  extension (a: GConnectFlags)
    inline def &(b: GConnectFlags): GConnectFlags = a & b
    inline def |(b: GConnectFlags): GConnectFlags = a | b
    inline def is(b: GConnectFlags): Boolean = (a & b) == b

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
 * GConverterFlags: _CONVERTER_NO_FLAGS: No flags. _CONVERTER_INPUT_AT_END: At end of input data _CONVERTER_FLUSH: Flush data

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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
 * GDBusConnectionFlags: _DBUS_CONNECTION_FLAGS_NONE: No flags set. _DBUS_CONNECTION_FLAGS_AUTHENTICATION_CLIENT: Perform authentication against server. _DBUS_CONNECTION_FLAGS_AUTHENTICATION_SERVER: Perform authentication against client. _DBUS_CONNECTION_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS: When authenticating as a server, allow the anonymous authentication method. _DBUS_CONNECTION_FLAGS_MESSAGE_BUS_CONNECTION: Pass this flag if connecting to a peer that is a message bus. This means that the Hello() method will be invoked as part of the connection setup. _DBUS_CONNECTION_FLAGS_DELAY_MESSAGE_PROCESSING: If set, processing of D-Bus messages is delayed until g_dbus_connection_start_message_processing() is called. _DBUS_CONNECTION_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER: When authenticating as a server, require the UID of the peer to be the same as the UID of the server. (Since: 2.68)

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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
  inline def getName(inline value: GDBusConnectionFlags): Option[String] =
    inline value match
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

/**
 * GDBusError: _DBUS_ERROR_FAILED: A generic error; "something went wrong" - see the error message for more. _DBUS_ERROR_NO_MEMORY: There was not enough memory to complete an operation. _DBUS_ERROR_SERVICE_UNKNOWN: The bus doesn't know how to launch a service to supply the bus name you wanted. _DBUS_ERROR_NAME_HAS_NO_OWNER: The bus name you referenced doesn't exist (i.e. no application owns it). _DBUS_ERROR_NO_REPLY: No reply to a message expecting one, usually means a timeout occurred. _DBUS_ERROR_IO_ERROR: Something went wrong reading or writing to a socket, for example. _DBUS_ERROR_BAD_ADDRESS: A D-Bus bus address was malformed. _DBUS_ERROR_NOT_SUPPORTED: Requested operation isn't supported (like ENOSYS on UNIX). _DBUS_ERROR_LIMITS_EXCEEDED: Some limited resource is exhausted. _DBUS_ERROR_ACCESS_DENIED: Security restrictions don't allow doing what you're trying to do. _DBUS_ERROR_AUTH_FAILED: Authentication didn't work. _DBUS_ERROR_NO_SERVER: Unable to connect to server (probably caused by ECONNREFUSED on a socket). _DBUS_ERROR_TIMEOUT: Certain timeout errors, possibly ETIMEDOUT on a socket. Note that %G_DBUS_ERROR_NO_REPLY is used for message reply timeouts. Warning: this is confusingly-named given that %G_DBUS_ERROR_TIMED_OUT also exists. We can't fix it for compatibility reasons so just be careful. _DBUS_ERROR_NO_NETWORK: No network access (probably ENETUNREACH on a socket). _DBUS_ERROR_ADDRESS_IN_USE: Can't bind a socket since its address is in use (i.e. EADDRINUSE). _DBUS_ERROR_DISCONNECTED: The connection is disconnected and you're trying to use it. _DBUS_ERROR_INVALID_ARGS: Invalid arguments passed to a method call. _DBUS_ERROR_FILE_NOT_FOUND: Missing file. _DBUS_ERROR_FILE_EXISTS: Existing file and the operation you're using does not silently overwrite. _DBUS_ERROR_UNKNOWN_METHOD: Method name you invoked isn't known by the object you invoked it on. _DBUS_ERROR_UNKNOWN_OBJECT: Object you invoked a method on isn't known. Since 2.42 _DBUS_ERROR_UNKNOWN_INTERFACE: Interface you invoked a method on isn't known by the object. Since 2.42 _DBUS_ERROR_UNKNOWN_PROPERTY: Property you tried to access isn't known by the object. Since 2.42 _DBUS_ERROR_PROPERTY_READ_ONLY: Property you tried to set is read-only. Since 2.42 _DBUS_ERROR_TIMED_OUT: Certain timeout errors, e.g. while starting a service. Warning: this is confusingly-named given that %G_DBUS_ERROR_TIMEOUT also exists. We can't fix it for compatibility reasons so just be careful. _DBUS_ERROR_MATCH_RULE_NOT_FOUND: Tried to remove or modify a match rule that didn't exist. _DBUS_ERROR_MATCH_RULE_INVALID: The match rule isn't syntactically valid. _DBUS_ERROR_SPAWN_EXEC_FAILED: While starting a new process, the exec() call failed. _DBUS_ERROR_SPAWN_FORK_FAILED: While starting a new process, the fork() call failed. _DBUS_ERROR_SPAWN_CHILD_EXITED: While starting a new process, the child exited with a status code. _DBUS_ERROR_SPAWN_CHILD_SIGNALED: While starting a new process, the child exited on a signal. _DBUS_ERROR_SPAWN_FAILED: While starting a new process, something went wrong. _DBUS_ERROR_SPAWN_SETUP_FAILED: We failed to setup the environment correctly. _DBUS_ERROR_SPAWN_CONFIG_INVALID: We failed to setup the config parser correctly. _DBUS_ERROR_SPAWN_SERVICE_INVALID: Bus name was not valid. _DBUS_ERROR_SPAWN_SERVICE_NOT_FOUND: Service file not found in system-services directory. _DBUS_ERROR_SPAWN_PERMISSIONS_INVALID: Permissions are incorrect on the setuid helper. _DBUS_ERROR_SPAWN_FILE_INVALID: Service file invalid (Name, User or Exec missing). _DBUS_ERROR_SPAWN_NO_MEMORY: Tried to get a UNIX process ID and it wasn't available. _DBUS_ERROR_UNIX_PROCESS_ID_UNKNOWN: Tried to get a UNIX process ID and it wasn't available. _DBUS_ERROR_INVALID_SIGNATURE: A type signature is not valid. _DBUS_ERROR_INVALID_FILE_CONTENT: A file contains invalid syntax or is otherwise broken. _DBUS_ERROR_SELINUX_SECURITY_CONTEXT_UNKNOWN: Asked for SELinux security context and it wasn't available. _DBUS_ERROR_ADT_AUDIT_DATA_UNKNOWN: Asked for ADT audit data and it wasn't available. _DBUS_ERROR_OBJECT_PATH_IN_USE: There's already an object with the requested object path.

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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
 * GDriveStartFlags: _DRIVE_START_NONE: No flags set.

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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
 * GFileAttributeInfoFlags: _FILE_ATTRIBUTE_INFO_NONE: no flags set. _FILE_ATTRIBUTE_INFO_COPY_WITH_FILE: copy the attribute values when the file is copied. _FILE_ATTRIBUTE_INFO_COPY_WHEN_MOVED: copy the attribute values when the file is moved.

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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
 * GFileMeasureFlags: _FILE_MEASURE_NONE: No flags set. _FILE_MEASURE_REPORT_ANY_ERROR: Report any error encountered while traversing the directory tree. Normally errors are only reported for the toplevel file. _FILE_MEASURE_APPARENT_SIZE: Tally usage based on apparent file sizes. Normally, the block-size is used, if available, as this is a more accurate representation of disk space used. Compare with `du --apparent-size`. _FILE_MEASURE_NO_XDEV: Do not cross mount point boundaries. Compare with `du -x`.

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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
 * GFileType: _FILE_TYPE_UNKNOWN: File's type is unknown. _FILE_TYPE_REGULAR: File handle represents a regular file. _FILE_TYPE_DIRECTORY: File handle represents a directory. _FILE_TYPE_SYMBOLIC_LINK: File handle represents a symbolic link (Unix systems). _FILE_TYPE_SPECIAL: File is a "special" file, such as a socket, fifo, block device, or character device. _FILE_TYPE_SHORTCUT: File is a shortcut (Windows systems). _FILE_TYPE_MOUNTABLE: File is a mountable location.

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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
 * GIOErrorEnum: _IO_ERROR_FAILED: Generic error condition for when an operation fails and no more specific #GIOErrorEnum value is defined. _IO_ERROR_NOT_FOUND: File not found. _IO_ERROR_EXISTS: File already exists. _IO_ERROR_IS_DIRECTORY: File is a directory. _IO_ERROR_NOT_DIRECTORY: File is not a directory. _IO_ERROR_NOT_EMPTY: File is a directory that isn't empty. _IO_ERROR_NOT_REGULAR_FILE: File is not a regular file. _IO_ERROR_NOT_SYMBOLIC_LINK: File is not a symbolic link. _IO_ERROR_NOT_MOUNTABLE_FILE: File cannot be mounted. _IO_ERROR_FILENAME_TOO_LONG: Filename is too many characters. _IO_ERROR_INVALID_FILENAME: Filename is invalid or contains invalid characters. _IO_ERROR_TOO_MANY_LINKS: File contains too many symbolic links. _IO_ERROR_NO_SPACE: No space left on drive. _IO_ERROR_INVALID_ARGUMENT: Invalid argument. _IO_ERROR_PERMISSION_DENIED: Permission denied. _IO_ERROR_NOT_SUPPORTED: Operation (or one of its parameters) not supported _IO_ERROR_NOT_MOUNTED: File isn't mounted. _IO_ERROR_ALREADY_MOUNTED: File is already mounted. _IO_ERROR_CLOSED: File was closed. _IO_ERROR_CANCELLED: Operation was cancelled. See #GCancellable. _IO_ERROR_PENDING: Operations are still pending. _IO_ERROR_READ_ONLY: File is read only. _IO_ERROR_CANT_CREATE_BACKUP: Backup couldn't be created. _IO_ERROR_WRONG_ETAG: File's Entity Tag was incorrect. _IO_ERROR_TIMED_OUT: Operation timed out. _IO_ERROR_WOULD_RECURSE: Operation would be recursive. _IO_ERROR_BUSY: File is busy. _IO_ERROR_WOULD_BLOCK: Operation would block. _IO_ERROR_HOST_NOT_FOUND: Host couldn't be found (remote operations). _IO_ERROR_WOULD_MERGE: Operation would merge files. _IO_ERROR_FAILED_HANDLED: Operation failed and a helper program has already interacted with the user. Do not display any error dialog. _IO_ERROR_TOO_MANY_OPEN_FILES: The current process has too many files open and can't open any more. Duplicate descriptors do count toward this limit. Since 2.20 _IO_ERROR_NOT_INITIALIZED: The object has not been initialized. Since 2.22 _IO_ERROR_ADDRESS_IN_USE: The requested address is already in use. Since 2.22 _IO_ERROR_PARTIAL_INPUT: Need more input to finish operation. Since 2.24 _IO_ERROR_INVALID_DATA: The input data was invalid. Since 2.24 _IO_ERROR_DBUS_ERROR: A remote object generated an error that doesn't correspond to a locally registered #GError error domain. Use g_dbus_error_get_remote_error() to extract the D-Bus error name and g_dbus_error_strip_remote_error() to fix up the message so it matches what was received on the wire. Since 2.26. _IO_ERROR_HOST_UNREACHABLE: Host unreachable. Since 2.26 _IO_ERROR_NETWORK_UNREACHABLE: Network unreachable. Since 2.26 _IO_ERROR_CONNECTION_REFUSED: Connection refused. Since 2.26 _IO_ERROR_PROXY_FAILED: Connection to proxy server failed. Since 2.26 _IO_ERROR_PROXY_AUTH_FAILED: Proxy authentication failed. Since 2.26 _IO_ERROR_PROXY_NEED_AUTH: Proxy server needs authentication. Since 2.26 _IO_ERROR_PROXY_NOT_ALLOWED: Proxy connection is not allowed by ruleset. Since 2.26 _IO_ERROR_BROKEN_PIPE: Broken pipe. Since 2.36 _IO_ERROR_CONNECTION_CLOSED: Connection closed by peer. Note that this is the same code as %G_IO_ERROR_BROKEN_PIPE; before 2.44 some "connection closed" errors returned %G_IO_ERROR_BROKEN_PIPE, but others returned %G_IO_ERROR_FAILED. Now they should all return the same value, which has this more logical name. Since 2.44. _IO_ERROR_NOT_CONNECTED: Transport endpoint is not connected. Since 2.44 _IO_ERROR_MESSAGE_TOO_LARGE: Message too large. Since 2.48.

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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
      case _ => None
  extension (a: GIOErrorEnum)
    inline def &(b: GIOErrorEnum): GIOErrorEnum = a & b
    inline def |(b: GIOErrorEnum): GIOErrorEnum = a | b
    inline def is(b: GIOErrorEnum): Boolean = (a & b) == b

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
 * GIOModuleScopeFlags: _IO_MODULE_SCOPE_NONE: No module scan flags _IO_MODULE_SCOPE_BLOCK_DUPLICATES: When using this scope to load or scan modules, automatically block a modules which has the same base basename as previously loaded module.

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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
 * GIOStreamSpliceFlags: _IO_STREAM_SPLICE_NONE: Do not close either stream. _IO_STREAM_SPLICE_CLOSE_STREAM1: Close the first stream after the splice. _IO_STREAM_SPLICE_CLOSE_STREAM2: Close the second stream after the splice. _IO_STREAM_SPLICE_WAIT_FOR_BOTH: Wait for both splice operations to finish before calling the callback.

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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
 * GMemoryMonitorWarningLevel: _MEMORY_MONITOR_WARNING_LEVEL_LOW: Memory on the device is low, processes should free up unneeded resources (for example, in-memory caches) so they can be used elsewhere. _MEMORY_MONITOR_WARNING_LEVEL_MEDIUM: Same as _MEMORY_MONITOR_WARNING_LEVEL_LOW but the device has even less free memory, so processes should try harder to free up unneeded resources. If your process does not need to stay running, it is a good time for it to quit. _MEMORY_MONITOR_WARNING_LEVEL_CRITICAL: The system will soon start terminating processes to reclaim memory, including background processes.

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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
 * GModuleError: _MODULE_ERROR_FAILED: there was an error loading or opening a module file _MODULE_ERROR_CHECK_FAILED: a module returned an error from its `g_module_check_init()` function

 * [bindgen] header: /usr/include/glib-2.0/gmodule.h
*/
opaque type GModuleError = CUnsignedInt
object GModuleError extends CEnumU[GModuleError]:
  given _tag: Tag[GModuleError] = Tag.UInt
  inline def define(inline a: Long): GModuleError = a.toUInt
  val G_MODULE_ERROR_FAILED = define(0)
  val G_MODULE_ERROR_CHECK_FAILED = define(1)
  inline def getName(inline value: GModuleError): Option[String] =
    inline value match
      case G_MODULE_ERROR_FAILED => Some("G_MODULE_ERROR_FAILED")
      case G_MODULE_ERROR_CHECK_FAILED => Some("G_MODULE_ERROR_CHECK_FAILED")
      case _ => None
  extension (a: GModuleError)
    inline def &(b: GModuleError): GModuleError = a & b
    inline def |(b: GModuleError): GModuleError = a | b
    inline def is(b: GModuleError): Boolean = (a & b) == b

/**
 * GModuleFlags: _MODULE_BIND_LAZY: specifies that symbols are only resolved when needed. The default action is to bind all symbols when the module is loaded. _MODULE_BIND_LOCAL: specifies that symbols in the module should not be added to the global name space. The default action on most platforms is to place symbols in the module in the global name space, which may cause conflicts with existing symbols. _MODULE_BIND_MASK: mask for all flags.

 * [bindgen] header: /usr/include/glib-2.0/gmodule.h
*/
opaque type GModuleFlags = CUnsignedInt
object GModuleFlags extends CEnumU[GModuleFlags]:
  given _tag: Tag[GModuleFlags] = Tag.UInt
  inline def define(inline a: Long): GModuleFlags = a.toUInt
  val G_MODULE_BIND_LAZY = define(1)
  val G_MODULE_BIND_LOCAL = define(2)
  val G_MODULE_BIND_MASK = define(3)
  inline def getName(inline value: GModuleFlags): Option[String] =
    inline value match
      case G_MODULE_BIND_LAZY => Some("G_MODULE_BIND_LAZY")
      case G_MODULE_BIND_LOCAL => Some("G_MODULE_BIND_LOCAL")
      case G_MODULE_BIND_MASK => Some("G_MODULE_BIND_MASK")
      case _ => None
  extension (a: GModuleFlags)
    inline def &(b: GModuleFlags): GModuleFlags = a & b
    inline def |(b: GModuleFlags): GModuleFlags = a | b
    inline def is(b: GModuleFlags): Boolean = (a & b) == b

/**
 * GMountMountFlags: _MOUNT_MOUNT_NONE: No flags set.

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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
 * GNotificationPriority: _NOTIFICATION_PRIORITY_LOW: for notifications that do not require immediate attention - typically used for contextual background information, such as contact birthdays or local weather _NOTIFICATION_PRIORITY_NORMAL: the default priority, to be used for the majority of notifications (for example email messages, software updates, completed download/sync operations) _NOTIFICATION_PRIORITY_HIGH: for events that require more attention, usually because responses are time-sensitive (for example chat and SMS messages or alarms) _NOTIFICATION_PRIORITY_URGENT: for urgent notifications, or notifications that require a response in a short space of time (for example phone calls or emergency warnings)

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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
 * GOutputStreamSpliceFlags: _OUTPUT_STREAM_SPLICE_NONE: Do not close either stream. _OUTPUT_STREAM_SPLICE_CLOSE_SOURCE: Close the source stream after the splice. _OUTPUT_STREAM_SPLICE_CLOSE_TARGET: Close the target stream after the splice.

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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
 * GParamFlags: _PARAM_READABLE: the parameter is readable _PARAM_WRITABLE: the parameter is writable _PARAM_READWRITE: alias for %G_PARAM_READABLE | %G_PARAM_WRITABLE _PARAM_CONSTRUCT: the parameter will be set upon object construction _PARAM_CONSTRUCT_ONLY: the parameter can only be set upon object construction _PARAM_LAX_VALIDATION: upon parameter conversion (see g_param_value_convert()) strict validation is not required _PARAM_STATIC_NAME: the string used as name when constructing the parameter is guaranteed to remain valid and unmodified for the lifetime of the parameter. Since 2.8 _PARAM_STATIC_NICK: the string used as nick when constructing the parameter is guaranteed to remain valid and unmmodified for the lifetime of the parameter. Since 2.8 _PARAM_STATIC_BLURB: the string used as blurb when constructing the parameter is guaranteed to remain valid and unmodified for the lifetime of the parameter. Since 2.8 _PARAM_EXPLICIT_NOTIFY: calls to g_object_set_property() for this property will not automatically result in a "notify" signal being emitted: the implementation must call g_object_notify() themselves in case the property actually changes. Since: 2.42. _PARAM_PRIVATE: internal _PARAM_DEPRECATED: the parameter is deprecated and will be removed in a future version. A warning will be generated if it is used while running with G_ENABLE_DIAGNOSTIC=1. Since 2.26

 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
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
 * GPasswordSave: _PASSWORD_SAVE_NEVER: never save a password. _PASSWORD_SAVE_FOR_SESSION: save a password for the session. _PASSWORD_SAVE_PERMANENTLY: save a password permanently.

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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
 * GResolverError: _RESOLVER_ERROR_NOT_FOUND: the requested name/address/service was not found _RESOLVER_ERROR_TEMPORARY_FAILURE: the requested information could not be looked up due to a network error or similar problem _RESOLVER_ERROR_INTERNAL: unknown error

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gresolver.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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
 * GSettingsBindFlags: _SETTINGS_BIND_DEFAULT: Equivalent to `G_SETTINGS_BIND_GET|G_SETTINGS_BIND_SET` _SETTINGS_BIND_GET: Update the #GObject property when the setting changes. It is an error to use this flag if the property is not writable. _SETTINGS_BIND_SET: Update the setting when the #GObject property changes. It is an error to use this flag if the property is not readable. _SETTINGS_BIND_NO_SENSITIVITY: Do not try to bind a "sensitivity" property to the writability of the setting _SETTINGS_BIND_GET_NO_CHANGES: When set in addition to %G_SETTINGS_BIND_GET, set the #GObject property value initially from the setting, but do not listen for changes of the setting _SETTINGS_BIND_INVERT_BOOLEAN: When passed to g_settings_bind(), uses a pair of mapping functions that invert the boolean value when mapping between the setting and the property. The setting and property must both be booleans. You cannot pass this flag to g_settings_bind_with_mapping().

 * [bindgen] header: /usr/include/glib-2.0/gio/gsettings.h
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
 * GSignalFlags: _SIGNAL_RUN_FIRST: Invoke the object method handler in the first emission stage. _SIGNAL_RUN_LAST: Invoke the object method handler in the third emission stage. _SIGNAL_RUN_CLEANUP: Invoke the object method handler in the last emission stage. _SIGNAL_NO_RECURSE: Signals being emitted for an object while currently being in emission for this very object will not be emitted recursively, but instead cause the first emission to be restarted. _SIGNAL_DETAILED: This signal supports "::detail" appendices to the signal name upon handler connections and emissions. _SIGNAL_ACTION: Action signals are signals that may freely be emitted on alive objects from user code via g_signal_emit() and friends, without the need of being embedded into extra code that performs pre or post emission adjustments on the object. They can also be thought of as object methods which can be called generically by third-party code. _SIGNAL_NO_HOOKS: No emissions hooks are supported for this signal. _SIGNAL_MUST_COLLECT: Varargs signal emission will always collect the arguments, even if there are no signal handlers connected. Since 2.30. _SIGNAL_DEPRECATED: The signal is deprecated and will be removed in a future version. A warning will be generated if it is connected while running with G_ENABLE_DIAGNOSTIC=1. Since 2.32. _SIGNAL_ACCUMULATOR_FIRST_RUN: Only used in #GSignalAccumulator accumulator functions for the #GSignalInvocationHint::run_type field to mark the first call to the accumulator function for a signal emission. Since 2.68.

 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
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

 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
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
 * GSocketClientEvent: _SOCKET_CLIENT_RESOLVING: The client is doing a DNS lookup. _SOCKET_CLIENT_RESOLVED: The client has completed a DNS lookup. _SOCKET_CLIENT_CONNECTING: The client is connecting to a remote host (either a proxy or the destination server). _SOCKET_CLIENT_CONNECTED: The client has connected to a remote host. _SOCKET_CLIENT_PROXY_NEGOTIATING: The client is negotiating with a proxy to connect to the destination server. _SOCKET_CLIENT_PROXY_NEGOTIATED: The client has negotiated with the proxy server. _SOCKET_CLIENT_TLS_HANDSHAKING: The client is performing a TLS handshake. _SOCKET_CLIENT_TLS_HANDSHAKED: The client has performed a TLS handshake. _SOCKET_CLIENT_COMPLETE: The client is done with a particular #GSocketConnectable.

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
*/
opaque type GSocketFamily = CUnsignedInt
object GSocketFamily extends CEnumU[GSocketFamily]:
  given _tag: Tag[GSocketFamily] = Tag.UInt
  inline def define(inline a: Long): GSocketFamily = a.toUInt
  val G_SOCKET_FAMILY_INVALID = define(0)
  val G_SOCKET_FAMILY_UNIX = define(1)
  val G_SOCKET_FAMILY_IPV4 = define(2)
  val G_SOCKET_FAMILY_IPV6 = define(10)
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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
 * GSubprocessFlags: _SUBPROCESS_FLAGS_NONE: No flags. _SUBPROCESS_FLAGS_STDIN_PIPE: create a pipe for the stdin of the spawned process that can be accessed with g_subprocess_get_stdin_pipe(). _SUBPROCESS_FLAGS_STDIN_INHERIT: stdin is inherited from the calling process. _SUBPROCESS_FLAGS_STDOUT_PIPE: create a pipe for the stdout of the spawned process that can be accessed with g_subprocess_get_stdout_pipe(). _SUBPROCESS_FLAGS_STDOUT_SILENCE: silence the stdout of the spawned process (ie: redirect to `/dev/null`). _SUBPROCESS_FLAGS_STDERR_PIPE: create a pipe for the stderr of the spawned process that can be accessed with g_subprocess_get_stderr_pipe(). _SUBPROCESS_FLAGS_STDERR_SILENCE: silence the stderr of the spawned process (ie: redirect to `/dev/null`). _SUBPROCESS_FLAGS_STDERR_MERGE: merge the stderr of the spawned process with whatever the stdout happens to be. This is a good way of directing both streams to a common log file, for example. _SUBPROCESS_FLAGS_INHERIT_FDS: spawned processes will inherit the file descriptors of their parent, unless those descriptors have been explicitly marked as close-on-exec. This flag has no effect over the "standard" file descriptors (stdin, stdout, stderr). _SUBPROCESS_FLAGS_SEARCH_PATH_FROM_ENVP: if path searching is needed when spawning the subprocess, use the `PATH` in the launcher environment. (Since: 2.72)

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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
 * GTlsAuthenticationMode: _TLS_AUTHENTICATION_NONE: client authentication not required _TLS_AUTHENTICATION_REQUESTED: client authentication is requested _TLS_AUTHENTICATION_REQUIRED: client authentication is required

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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
 * GTlsCertificateFlags: _TLS_CERTIFICATE_UNKNOWN_CA: The signing certificate authority is not known. _TLS_CERTIFICATE_BAD_IDENTITY: The certificate does not match the expected identity of the site that it was retrieved from. _TLS_CERTIFICATE_NOT_ACTIVATED: The certificate's activation time is still in the future _TLS_CERTIFICATE_EXPIRED: The certificate has expired _TLS_CERTIFICATE_REVOKED: The certificate has been revoked according to the #GTlsConnection's certificate revocation list. _TLS_CERTIFICATE_INSECURE: The certificate's algorithm is considered insecure. _TLS_CERTIFICATE_GENERIC_ERROR: Some other error occurred validating the certificate _TLS_CERTIFICATE_VALIDATE_ALL: the combination of all of the above flags

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
*/
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
    inline value match
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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
 * GTlsChannelBindingType: _TLS_CHANNEL_BINDING_TLS_UNIQUE: [`tls-unique`](https://tools.ietf.org/html/rfc5929#section-3) binding type _TLS_CHANNEL_BINDING_TLS_SERVER_END_POINT: [`tls-server-end-point`](https://tools.ietf.org/html/rfc5929#section-4) binding type

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
*/
opaque type GTlsChannelBindingType = CUnsignedInt
object GTlsChannelBindingType extends CEnumU[GTlsChannelBindingType]:
  given _tag: Tag[GTlsChannelBindingType] = Tag.UInt
  inline def define(inline a: Long): GTlsChannelBindingType = a.toUInt
  val G_TLS_CHANNEL_BINDING_TLS_UNIQUE = define(0)
  val G_TLS_CHANNEL_BINDING_TLS_SERVER_END_POINT = define(1)
  inline def getName(inline value: GTlsChannelBindingType): Option[String] =
    inline value match
      case G_TLS_CHANNEL_BINDING_TLS_UNIQUE => Some("G_TLS_CHANNEL_BINDING_TLS_UNIQUE")
      case G_TLS_CHANNEL_BINDING_TLS_SERVER_END_POINT => Some("G_TLS_CHANNEL_BINDING_TLS_SERVER_END_POINT")
      case _ => None
  extension (a: GTlsChannelBindingType)
    inline def &(b: GTlsChannelBindingType): GTlsChannelBindingType = a & b
    inline def |(b: GTlsChannelBindingType): GTlsChannelBindingType = a | b
    inline def is(b: GTlsChannelBindingType): Boolean = (a & b) == b

/**
 * GTlsDatabaseLookupFlags: _TLS_DATABASE_LOOKUP_NONE: No lookup flags _TLS_DATABASE_LOOKUP_KEYPAIR: Restrict lookup to certificates that have a private key.

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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
 * GTypeDebugFlags: _TYPE_DEBUG_NONE: Print no messages _TYPE_DEBUG_OBJECTS: Print messages about object bookkeeping _TYPE_DEBUG_SIGNALS: Print messages about signal emissions _TYPE_DEBUG_MASK: Mask covering all debug flags _TYPE_DEBUG_INSTANCE_COUNT: Keep a count of instances of each type

 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
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
 * GTypeFlags: _TYPE_FLAG_ABSTRACT: Indicates an abstract type. No instances can be created for an abstract type _TYPE_FLAG_VALUE_ABSTRACT: Indicates an abstract value type, i.e. a type that introduces a value table, but can't be used for g_value_init() _TYPE_FLAG_FINAL: Indicates a final type. A final type is a non-derivable leaf node in a deep derivable type hierarchy tree. Since: 2.70

 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
opaque type GTypeFlags = CUnsignedInt
object GTypeFlags extends CEnumU[GTypeFlags]:
  given _tag: Tag[GTypeFlags] = Tag.UInt
  inline def define(inline a: Long): GTypeFlags = a.toUInt
  val G_TYPE_FLAG_ABSTRACT = define(16)
  val G_TYPE_FLAG_VALUE_ABSTRACT = define(32)
  val G_TYPE_FLAG_FINAL = define(64)
  inline def getName(inline value: GTypeFlags): Option[String] =
    inline value match
      case G_TYPE_FLAG_ABSTRACT => Some("G_TYPE_FLAG_ABSTRACT")
      case G_TYPE_FLAG_VALUE_ABSTRACT => Some("G_TYPE_FLAG_VALUE_ABSTRACT")
      case G_TYPE_FLAG_FINAL => Some("G_TYPE_FLAG_FINAL")
      case _ => None
  extension (a: GTypeFlags)
    inline def &(b: GTypeFlags): GTypeFlags = a & b
    inline def |(b: GTypeFlags): GTypeFlags = a | b
    inline def is(b: GTypeFlags): Boolean = (a & b) == b

/**
 * GTypeFundamentalFlags: _TYPE_FLAG_CLASSED: Indicates a classed type _TYPE_FLAG_INSTANTIATABLE: Indicates an instantiatable type (implies classed) _TYPE_FLAG_DERIVABLE: Indicates a flat derivable type _TYPE_FLAG_DEEP_DERIVABLE: Indicates a deep derivable type (implies derivable)

 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
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
 * GUnixSocketAddressType: _UNIX_SOCKET_ADDRESS_INVALID: invalid _UNIX_SOCKET_ADDRESS_ANONYMOUS: anonymous _UNIX_SOCKET_ADDRESS_PATH: a filesystem path _UNIX_SOCKET_ADDRESS_ABSTRACT: an abstract name _UNIX_SOCKET_ADDRESS_ABSTRACT_PADDED: an abstract name, 0-padded to the full length of a unix socket name

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

/**
 * GZlibCompressorFormat: _ZLIB_COMPRESSOR_FORMAT_ZLIB: deflate compression with zlib header _ZLIB_COMPRESSOR_FORMAT_GZIP: gzip file format _ZLIB_COMPRESSOR_FORMAT_RAW: deflate compression with no header

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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
 * GdkAnchorHints: _ANCHOR_FLIP_X: allow flipping anchors horizontally _ANCHOR_FLIP_Y: allow flipping anchors vertically _ANCHOR_SLIDE_X: allow sliding surface horizontally _ANCHOR_SLIDE_Y: allow sliding surface vertically _ANCHOR_RESIZE_X: allow resizing surface horizontally _ANCHOR_RESIZE_Y: allow resizing surface vertically _ANCHOR_FLIP: allow flipping anchors on both axes _ANCHOR_SLIDE: allow sliding surface on both axes _ANCHOR_RESIZE: allow resizing surface on both axes

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkpopuplayout.h
*/
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
    inline value match
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

/**
 * GdkAxisFlags: _AXIS_FLAG_X: X axis is present _AXIS_FLAG_Y: Y axis is present _AXIS_FLAG_DELTA_X: Scroll X delta axis is present _AXIS_FLAG_DELTA_Y: Scroll Y delta axis is present _AXIS_FLAG_PRESSURE: Pressure axis is present _AXIS_FLAG_XTILT: X tilt axis is present _AXIS_FLAG_YTILT: Y tilt axis is present _AXIS_FLAG_WHEEL: Wheel axis is present _AXIS_FLAG_DISTANCE: Distance axis is present _AXIS_FLAG_ROTATION: Z-axis rotation is present _AXIS_FLAG_SLIDER: Slider axis is present

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkenums.h
*/
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
    inline value match
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

/**
 * GdkAxisUse: _AXIS_IGNORE: the axis is ignored. _AXIS_X: the axis is used as the x axis. _AXIS_Y: the axis is used as the y axis. _AXIS_DELTA_X: the axis is used as the scroll x delta _AXIS_DELTA_Y: the axis is used as the scroll y delta _AXIS_PRESSURE: the axis is used for pressure information. _AXIS_XTILT: the axis is used for x tilt information. _AXIS_YTILT: the axis is used for y tilt information. _AXIS_WHEEL: the axis is used for wheel information. _AXIS_DISTANCE: the axis is used for pen/tablet distance information _AXIS_ROTATION: the axis is used for pen rotation information _AXIS_SLIDER: the axis is used for pen slider information _AXIS_LAST: a constant equal to the numerically highest axis value.

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkenums.h
*/
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
    inline value match
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

/**
 * GdkColorspace: _COLORSPACE_RGB: Indicates a red/green/blue additive color space.

 * [bindgen] header: /usr/include/gdk-pixbuf-2.0/gdk-pixbuf/gdk-pixbuf-core.h
*/
opaque type GdkColorspace = CUnsignedInt
object GdkColorspace extends CEnumU[GdkColorspace]:
  given _tag: Tag[GdkColorspace] = Tag.UInt
  inline def define(inline a: Long): GdkColorspace = a.toUInt
  val GDK_COLORSPACE_RGB = define(0)
  inline def getName(inline value: GdkColorspace): Option[String] =
    inline value match
      case GDK_COLORSPACE_RGB => Some("GDK_COLORSPACE_RGB")
      case _ => None
  extension (a: GdkColorspace)
    inline def &(b: GdkColorspace): GdkColorspace = a & b
    inline def |(b: GdkColorspace): GdkColorspace = a | b
    inline def is(b: GdkColorspace): Boolean = (a & b) == b

/**
 * GdkCrossingMode: _CROSSING_NORMAL: crossing because of pointer motion. _CROSSING_GRAB: crossing because a grab is activated. _CROSSING_UNGRAB: crossing because a grab is deactivated. _CROSSING_GTK_GRAB: crossing because a GTK grab is activated. _CROSSING_GTK_UNGRAB: crossing because a GTK grab is deactivated. _CROSSING_STATE_CHANGED: crossing because a GTK widget changed state (e.g. sensitivity). _CROSSING_TOUCH_BEGIN: crossing because a touch sequence has begun, this event is synthetic as the pointer might have not left the surface. _CROSSING_TOUCH_END: crossing because a touch sequence has ended, this event is synthetic as the pointer might have not left the surface. _CROSSING_DEVICE_SWITCH: crossing because of a device switch (i.e. a mouse taking control of the pointer after a touch device), this event is synthetic as the pointer didn’t leave the surface.

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
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
    inline value match
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

/**
 * GdkDevicePadFeature: _DEVICE_PAD_FEATURE_BUTTON: a button _DEVICE_PAD_FEATURE_RING: a ring-shaped interactive area _DEVICE_PAD_FEATURE_STRIP: a straight interactive area

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkdevicepad.h
*/
opaque type GdkDevicePadFeature = CUnsignedInt
object GdkDevicePadFeature extends CEnumU[GdkDevicePadFeature]:
  given _tag: Tag[GdkDevicePadFeature] = Tag.UInt
  inline def define(inline a: Long): GdkDevicePadFeature = a.toUInt
  val GDK_DEVICE_PAD_FEATURE_BUTTON = define(0)
  val GDK_DEVICE_PAD_FEATURE_RING = define(1)
  val GDK_DEVICE_PAD_FEATURE_STRIP = define(2)
  inline def getName(inline value: GdkDevicePadFeature): Option[String] =
    inline value match
      case GDK_DEVICE_PAD_FEATURE_BUTTON => Some("GDK_DEVICE_PAD_FEATURE_BUTTON")
      case GDK_DEVICE_PAD_FEATURE_RING => Some("GDK_DEVICE_PAD_FEATURE_RING")
      case GDK_DEVICE_PAD_FEATURE_STRIP => Some("GDK_DEVICE_PAD_FEATURE_STRIP")
      case _ => None
  extension (a: GdkDevicePadFeature)
    inline def &(b: GdkDevicePadFeature): GdkDevicePadFeature = a & b
    inline def |(b: GdkDevicePadFeature): GdkDevicePadFeature = a | b
    inline def is(b: GdkDevicePadFeature): Boolean = (a & b) == b

/**
 * GdkDeviceToolType: _DEVICE_TOOL_TYPE_UNKNOWN: Tool is of an unknown type. _DEVICE_TOOL_TYPE_PEN: Tool is a standard tablet stylus. _DEVICE_TOOL_TYPE_ERASER: Tool is standard tablet eraser. _DEVICE_TOOL_TYPE_BRUSH: Tool is a brush stylus. _DEVICE_TOOL_TYPE_PENCIL: Tool is a pencil stylus. _DEVICE_TOOL_TYPE_AIRBRUSH: Tool is an airbrush stylus. _DEVICE_TOOL_TYPE_MOUSE: Tool is a mouse. _DEVICE_TOOL_TYPE_LENS: Tool is a lens cursor.

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkdevicetool.h
*/
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
    inline value match
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

/**
 * GdkDragAction: _ACTION_COPY: Copy the data. _ACTION_MOVE: Move the data, i.e. first copy it, then delete it from the source using the DELETE target of the X selection protocol. _ACTION_LINK: Add a link to the data. Note that this is only useful if source and destination agree on what it means, and is not supported on all platforms. _ACTION_ASK: Ask the user what to do with the data.

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkenums.h
*/
opaque type GdkDragAction = CUnsignedInt
object GdkDragAction extends CEnumU[GdkDragAction]:
  given _tag: Tag[GdkDragAction] = Tag.UInt
  inline def define(inline a: Long): GdkDragAction = a.toUInt
  val GDK_ACTION_COPY = define(1)
  val GDK_ACTION_MOVE = define(2)
  val GDK_ACTION_LINK = define(4)
  val GDK_ACTION_ASK = define(8)
  inline def getName(inline value: GdkDragAction): Option[String] =
    inline value match
      case GDK_ACTION_COPY => Some("GDK_ACTION_COPY")
      case GDK_ACTION_MOVE => Some("GDK_ACTION_MOVE")
      case GDK_ACTION_LINK => Some("GDK_ACTION_LINK")
      case GDK_ACTION_ASK => Some("GDK_ACTION_ASK")
      case _ => None
  extension (a: GdkDragAction)
    inline def &(b: GdkDragAction): GdkDragAction = a & b
    inline def |(b: GdkDragAction): GdkDragAction = a | b
    inline def is(b: GdkDragAction): Boolean = (a & b) == b

/**
 * GdkDragCancelReason: _DRAG_CANCEL_NO_TARGET: There is no suitable drop target. _DRAG_CANCEL_USER_CANCELLED: Drag cancelled by the user _DRAG_CANCEL_ERROR: Unspecified error.

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkdrag.h
*/
opaque type GdkDragCancelReason = CUnsignedInt
object GdkDragCancelReason extends CEnumU[GdkDragCancelReason]:
  given _tag: Tag[GdkDragCancelReason] = Tag.UInt
  inline def define(inline a: Long): GdkDragCancelReason = a.toUInt
  val GDK_DRAG_CANCEL_NO_TARGET = define(0)
  val GDK_DRAG_CANCEL_USER_CANCELLED = define(1)
  val GDK_DRAG_CANCEL_ERROR = define(2)
  inline def getName(inline value: GdkDragCancelReason): Option[String] =
    inline value match
      case GDK_DRAG_CANCEL_NO_TARGET => Some("GDK_DRAG_CANCEL_NO_TARGET")
      case GDK_DRAG_CANCEL_USER_CANCELLED => Some("GDK_DRAG_CANCEL_USER_CANCELLED")
      case GDK_DRAG_CANCEL_ERROR => Some("GDK_DRAG_CANCEL_ERROR")
      case _ => None
  extension (a: GdkDragCancelReason)
    inline def &(b: GdkDragCancelReason): GdkDragCancelReason = a & b
    inline def |(b: GdkDragCancelReason): GdkDragCancelReason = a | b
    inline def is(b: GdkDragCancelReason): Boolean = (a & b) == b

/**
 * GdkEventType: _DELETE: the window manager has requested that the toplevel surface be hidden or destroyed, usually when the user clicks on a special icon in the title bar. _MOTION_NOTIFY: the pointer (usually a mouse) has moved. _BUTTON_PRESS: a mouse button has been pressed. _BUTTON_RELEASE: a mouse button has been released. _KEY_PRESS: a key has been pressed. _KEY_RELEASE: a key has been released. _ENTER_NOTIFY: the pointer has entered the surface. _LEAVE_NOTIFY: the pointer has left the surface. _FOCUS_CHANGE: the keyboard focus has entered or left the surface. _PROXIMITY_IN: an input device has moved into contact with a sensing surface (e.g. a touchscreen or graphics tablet). _PROXIMITY_OUT: an input device has moved out of contact with a sensing surface. _DRAG_ENTER: the mouse has entered the surface while a drag is in progress. _DRAG_LEAVE: the mouse has left the surface while a drag is in progress. _DRAG_MOTION: the mouse has moved in the surface while a drag is in progress. _DROP_START: a drop operation onto the surface has started. _SCROLL: the scroll wheel was turned _GRAB_BROKEN: a pointer or keyboard grab was broken. _TOUCH_BEGIN: A new touch event sequence has just started. _TOUCH_UPDATE: A touch event sequence has been updated. _TOUCH_END: A touch event sequence has finished. _TOUCH_CANCEL: A touch event sequence has been canceled. _TOUCHPAD_SWIPE: A touchpad swipe gesture event, the current state is determined by its phase field. _TOUCHPAD_PINCH: A touchpad pinch gesture event, the current state is determined by its phase field. _PAD_BUTTON_PRESS: A tablet pad button press event. _PAD_BUTTON_RELEASE: A tablet pad button release event. _PAD_RING: A tablet pad axis event from a "ring". _PAD_STRIP: A tablet pad axis event from a "strip". _PAD_GROUP_MODE: A tablet pad group mode change. _TOUCHPAD_HOLD: A touchpad hold gesture event, the current state is determined by its phase field. Since: 4.6 _EVENT_LAST: marks the end of the GdkEventType enumeration.

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
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
    inline value match
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

/**
 * GdkFrameClockPhase: _FRAME_CLOCK_PHASE_NONE: no phase _FRAME_CLOCK_PHASE_FLUSH_EVENTS: corresponds to GdkFrameClock::flush-events. Should not be handled by applications. _FRAME_CLOCK_PHASE_BEFORE_PAINT: corresponds to GdkFrameClock::before-paint. Should not be handled by applications. _FRAME_CLOCK_PHASE_UPDATE: corresponds to GdkFrameClock::update. _FRAME_CLOCK_PHASE_LAYOUT: corresponds to GdkFrameClock::layout. Should not be handled by applicatiosn. _FRAME_CLOCK_PHASE_PAINT: corresponds to GdkFrameClock::paint. _FRAME_CLOCK_PHASE_RESUME_EVENTS: corresponds to GdkFrameClock::resume-events. Should not be handled by applications. _FRAME_CLOCK_PHASE_AFTER_PAINT: corresponds to GdkFrameClock::after-paint. Should not be handled by applications.

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkframeclock.h
*/
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
    inline value match
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

/**
 * GdkFullscreenMode: _FULLSCREEN_ON_CURRENT_MONITOR: Fullscreen on current monitor only. _FULLSCREEN_ON_ALL_MONITORS: Span across all monitors when fullscreen.

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktoplevel.h
*/
opaque type GdkFullscreenMode = CUnsignedInt
object GdkFullscreenMode extends CEnumU[GdkFullscreenMode]:
  given _tag: Tag[GdkFullscreenMode] = Tag.UInt
  inline def define(inline a: Long): GdkFullscreenMode = a.toUInt
  val GDK_FULLSCREEN_ON_CURRENT_MONITOR = define(0)
  val GDK_FULLSCREEN_ON_ALL_MONITORS = define(1)
  inline def getName(inline value: GdkFullscreenMode): Option[String] =
    inline value match
      case GDK_FULLSCREEN_ON_CURRENT_MONITOR => Some("GDK_FULLSCREEN_ON_CURRENT_MONITOR")
      case GDK_FULLSCREEN_ON_ALL_MONITORS => Some("GDK_FULLSCREEN_ON_ALL_MONITORS")
      case _ => None
  extension (a: GdkFullscreenMode)
    inline def &(b: GdkFullscreenMode): GdkFullscreenMode = a & b
    inline def |(b: GdkFullscreenMode): GdkFullscreenMode = a | b
    inline def is(b: GdkFullscreenMode): Boolean = (a & b) == b

/**
 * GdkGLAPI: _GL_API_GL: The OpenGL API _GL_API_GLES: The OpenGL ES API

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkglcontext.h
*/
opaque type GdkGLAPI = CUnsignedInt
object GdkGLAPI extends CEnumU[GdkGLAPI]:
  given _tag: Tag[GdkGLAPI] = Tag.UInt
  inline def define(inline a: Long): GdkGLAPI = a.toUInt
  val GDK_GL_API_GL = define(1)
  val GDK_GL_API_GLES = define(2)
  inline def getName(inline value: GdkGLAPI): Option[String] =
    inline value match
      case GDK_GL_API_GL => Some("GDK_GL_API_GL")
      case GDK_GL_API_GLES => Some("GDK_GL_API_GLES")
      case _ => None
  extension (a: GdkGLAPI)
    inline def &(b: GdkGLAPI): GdkGLAPI = a & b
    inline def |(b: GdkGLAPI): GdkGLAPI = a | b
    inline def is(b: GdkGLAPI): Boolean = (a & b) == b

/**
 * GdkGLError: _GL_ERROR_NOT_AVAILABLE: OpenGL support is not available _GL_ERROR_UNSUPPORTED_FORMAT: The requested visual format is not supported _GL_ERROR_UNSUPPORTED_PROFILE: The requested profile is not supported _GL_ERROR_COMPILATION_FAILED: The shader compilation failed _GL_ERROR_LINK_FAILED: The shader linking failed

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkenums.h
*/
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
    inline value match
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

/**
 * GdkGravity: _GRAVITY_NORTH_WEST: the reference point is at the top left corner. _GRAVITY_NORTH: the reference point is in the middle of the top edge. _GRAVITY_NORTH_EAST: the reference point is at the top right corner. _GRAVITY_WEST: the reference point is at the middle of the left edge. _GRAVITY_CENTER: the reference point is at the center of the surface. _GRAVITY_EAST: the reference point is at the middle of the right edge. _GRAVITY_SOUTH_WEST: the reference point is at the lower left corner. _GRAVITY_SOUTH: the reference point is at the middle of the lower edge. _GRAVITY_SOUTH_EAST: the reference point is at the lower right corner. _GRAVITY_STATIC: the reference point is at the top left corner of the surface itself, ignoring window manager decorations.

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkenums.h
*/
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
    inline value match
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

/**
 * GdkInputSource: _SOURCE_MOUSE: the device is a mouse. (This will be reported for the core pointer, even if it is something else, such as a trackball.) _SOURCE_PEN: the device is a stylus of a graphics tablet or similar device. _SOURCE_KEYBOARD: the device is a keyboard. _SOURCE_TOUCHSCREEN: the device is a direct-input touch device, such as a touchscreen or tablet _SOURCE_TOUCHPAD: the device is an indirect touch device, such as a touchpad _SOURCE_TRACKPOINT: the device is a trackpoint _SOURCE_TABLET_PAD: the device is a "pad", a collection of buttons, rings and strips found in drawing tablets

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkdevice.h
*/
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
    inline value match
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

/**
 * GdkInterpType: _INTERP_NEAREST: Nearest neighbor sampling; this is the fastest and lowest quality mode. Quality is normally unacceptable when scaling down, but may be OK when scaling up. _INTERP_TILES: This is an accurate simulation of the PostScript image operator without any interpolation enabled. Each pixel is rendered as a tiny parallelogram of solid color, the edges of which are implemented with antialiasing. It resembles nearest neighbor for enlargement, and bilinear for reduction. _INTERP_BILINEAR: Best quality/speed balance; use this mode by default. Bilinear interpolation. For enlargement, it is equivalent to point-sampling the ideal bilinear-interpolated image. For reduction, it is equivalent to laying down small tiles and integrating over the coverage area. _INTERP_HYPER: This is the slowest and highest quality reconstruction function. It is derived from the hyperbolic filters in Wolberg's "Digital Image Warping", and is formally defined as the hyperbolic-filter sampling the ideal hyperbolic-filter interpolated image (the filter is designed to be idempotent for 1:1 pixel mapping). **Deprecated**: this interpolation filter is deprecated, as in reality it has a lower quality than the _INTERP_BILINEAR filter (Since: 2.38)

 * [bindgen] header: /usr/include/gdk-pixbuf-2.0/gdk-pixbuf/gdk-pixbuf-transform.h
*/
opaque type GdkInterpType = CUnsignedInt
object GdkInterpType extends CEnumU[GdkInterpType]:
  given _tag: Tag[GdkInterpType] = Tag.UInt
  inline def define(inline a: Long): GdkInterpType = a.toUInt
  val GDK_INTERP_NEAREST = define(0)
  val GDK_INTERP_TILES = define(1)
  val GDK_INTERP_BILINEAR = define(2)
  val GDK_INTERP_HYPER = define(3)
  inline def getName(inline value: GdkInterpType): Option[String] =
    inline value match
      case GDK_INTERP_NEAREST => Some("GDK_INTERP_NEAREST")
      case GDK_INTERP_TILES => Some("GDK_INTERP_TILES")
      case GDK_INTERP_BILINEAR => Some("GDK_INTERP_BILINEAR")
      case GDK_INTERP_HYPER => Some("GDK_INTERP_HYPER")
      case _ => None
  extension (a: GdkInterpType)
    inline def &(b: GdkInterpType): GdkInterpType = a & b
    inline def |(b: GdkInterpType): GdkInterpType = a | b
    inline def is(b: GdkInterpType): Boolean = (a & b) == b

/**
 * GdkKeyMatch: _KEY_MATCH_NONE: The key event does not match _KEY_MATCH_PARTIAL: The key event matches if keyboard state (specifically, the currently active group) is ignored _KEY_MATCH_EXACT: The key event matches

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type GdkKeyMatch = CUnsignedInt
object GdkKeyMatch extends CEnumU[GdkKeyMatch]:
  given _tag: Tag[GdkKeyMatch] = Tag.UInt
  inline def define(inline a: Long): GdkKeyMatch = a.toUInt
  val GDK_KEY_MATCH_NONE = define(0)
  val GDK_KEY_MATCH_PARTIAL = define(1)
  val GDK_KEY_MATCH_EXACT = define(2)
  inline def getName(inline value: GdkKeyMatch): Option[String] =
    inline value match
      case GDK_KEY_MATCH_NONE => Some("GDK_KEY_MATCH_NONE")
      case GDK_KEY_MATCH_PARTIAL => Some("GDK_KEY_MATCH_PARTIAL")
      case GDK_KEY_MATCH_EXACT => Some("GDK_KEY_MATCH_EXACT")
      case _ => None
  extension (a: GdkKeyMatch)
    inline def &(b: GdkKeyMatch): GdkKeyMatch = a & b
    inline def |(b: GdkKeyMatch): GdkKeyMatch = a | b
    inline def is(b: GdkKeyMatch): Boolean = (a & b) == b

/**
 * GdkMemoryFormat: _MEMORY_B8G8R8A8_PREMULTIPLIED: 4 bytes; for blue, green, red, alpha. The color values are premultiplied with the alpha value. _MEMORY_A8R8G8B8_PREMULTIPLIED: 4 bytes; for alpha, red, green, blue. The color values are premultiplied with the alpha value. _MEMORY_R8G8B8A8_PREMULTIPLIED: 4 bytes; for red, green, blue, alpha The color values are premultiplied with the alpha value. _MEMORY_B8G8R8A8: 4 bytes; for blue, green, red, alpha. _MEMORY_A8R8G8B8: 4 bytes; for alpha, red, green, blue. _MEMORY_R8G8B8A8: 4 bytes; for red, green, blue, alpha. _MEMORY_A8B8G8R8: 4 bytes; for alpha, blue, green, red. _MEMORY_R8G8B8: 3 bytes; for red, green, blue. The data is opaque. _MEMORY_B8G8R8: 3 bytes; for blue, green, red. The data is opaque. _MEMORY_R16G16B16: 3 guint16 values; for red, green, blue. Since: 4.6 _MEMORY_R16G16B16A16_PREMULTIPLIED: 4 guint16 values; for red, green, blue, alpha. The color values are premultiplied with the alpha value. Since: 4.6 _MEMORY_R16G16B16A16: 4 guint16 values; for red, green, blue, alpha. Since: 4.6 _MEMORY_R16G16B16_FLOAT: 3 half-float values; for red, green, blue. The data is opaque. Since: 4.6 _MEMORY_R16G16B16A16_FLOAT_PREMULTIPLIED: 4 half-float values; for red, green, blue and alpha. The color values are premultiplied with the alpha value. Since: 4.6 _MEMORY_R16G16B16A16_FLOAT: 4 half-float values; for red, green, blue and alpha. Since: 4.6 _MEMORY_B32G32R32_FLOAT: 3 float values; for blue, green, red. The data is opaque. Since: 4.6 _MEMORY_R32G32B32A32_FLOAT_PREMULTIPLIED: 4 float values; for red, green, blue and alpha. The color values are premultiplied with the alpha value. Since: 4.6 _MEMORY_R32G32B32A32_FLOAT: 4 float values; for red, green, blue and alpha. Since: 4.6 _MEMORY_N_FORMATS: The number of formats. This value will change as more formats get added, so do not rely on its concrete integer.

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkenums.h
*/
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
    inline value match
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

/**
 * GdkModifierType: _SHIFT_MASK: the Shift key. _LOCK_MASK: a Lock key (depending on the modifier mapping of the X server this may either be CapsLock or ShiftLock). _CONTROL_MASK: the Control key. _ALT_MASK: the fourth modifier key (it depends on the modifier mapping of the X server which key is interpreted as this modifier, but normally it is the Alt key). _BUTTON1_MASK: the first mouse button. _BUTTON2_MASK: the second mouse button. _BUTTON3_MASK: the third mouse button. _BUTTON4_MASK: the fourth mouse button. _BUTTON5_MASK: the fifth mouse button. _SUPER_MASK: the Super modifier _HYPER_MASK: the Hyper modifier _META_MASK: the Meta modifier

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkenums.h
*/
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
    inline value match
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

/**
 * GdkNotifyType: _NOTIFY_ANCESTOR: the surface is entered from an ancestor or left towards an ancestor. _NOTIFY_VIRTUAL: the pointer moves between an ancestor and an inferior of the surface. _NOTIFY_INFERIOR: the surface is entered from an inferior or left towards an inferior. _NOTIFY_NONLINEAR: the surface is entered from or left towards a surface which is neither an ancestor nor an inferior. _NOTIFY_NONLINEAR_VIRTUAL: the pointer moves between two surfaces which are not ancestors of each other and the surface is part of the ancestor chain between one of these surfaces and their least common ancestor. _NOTIFY_UNKNOWN: an unknown type of enter/leave event occurred.

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
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
    inline value match
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

/**
 * GdkPaintableFlags: _PAINTABLE_STATIC_SIZE: The size is immutable. The [signal::invalidate-size] signal will never be emitted. _PAINTABLE_STATIC_CONTENTS: The content is immutable. The [signal::invalidate-contents] signal will never be emitted.

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkpaintable.h
*/
opaque type GdkPaintableFlags = CUnsignedInt
object GdkPaintableFlags extends CEnumU[GdkPaintableFlags]:
  given _tag: Tag[GdkPaintableFlags] = Tag.UInt
  inline def define(inline a: Long): GdkPaintableFlags = a.toUInt
  val GDK_PAINTABLE_STATIC_SIZE = define(1)
  val GDK_PAINTABLE_STATIC_CONTENTS = define(2)
  inline def getName(inline value: GdkPaintableFlags): Option[String] =
    inline value match
      case GDK_PAINTABLE_STATIC_SIZE => Some("GDK_PAINTABLE_STATIC_SIZE")
      case GDK_PAINTABLE_STATIC_CONTENTS => Some("GDK_PAINTABLE_STATIC_CONTENTS")
      case _ => None
  extension (a: GdkPaintableFlags)
    inline def &(b: GdkPaintableFlags): GdkPaintableFlags = a & b
    inline def |(b: GdkPaintableFlags): GdkPaintableFlags = a | b
    inline def is(b: GdkPaintableFlags): Boolean = (a & b) == b

/**
 * GdkPixbufAlphaMode: _PIXBUF_ALPHA_BILEVEL: A bilevel clipping mask (black and white) will be created and used to draw the image. Pixels below 0.5 opacity will be considered fully transparent, and all others will be considered fully opaque. _PIXBUF_ALPHA_FULL: For now falls back to #GDK_PIXBUF_ALPHA_BILEVEL. In the future it will do full alpha compositing.

 * [bindgen] header: /usr/include/gdk-pixbuf-2.0/gdk-pixbuf/gdk-pixbuf-core.h
*/
opaque type GdkPixbufAlphaMode = CUnsignedInt
object GdkPixbufAlphaMode extends CEnumU[GdkPixbufAlphaMode]:
  given _tag: Tag[GdkPixbufAlphaMode] = Tag.UInt
  inline def define(inline a: Long): GdkPixbufAlphaMode = a.toUInt
  val GDK_PIXBUF_ALPHA_BILEVEL = define(0)
  val GDK_PIXBUF_ALPHA_FULL = define(1)
  inline def getName(inline value: GdkPixbufAlphaMode): Option[String] =
    inline value match
      case GDK_PIXBUF_ALPHA_BILEVEL => Some("GDK_PIXBUF_ALPHA_BILEVEL")
      case GDK_PIXBUF_ALPHA_FULL => Some("GDK_PIXBUF_ALPHA_FULL")
      case _ => None
  extension (a: GdkPixbufAlphaMode)
    inline def &(b: GdkPixbufAlphaMode): GdkPixbufAlphaMode = a & b
    inline def |(b: GdkPixbufAlphaMode): GdkPixbufAlphaMode = a | b
    inline def is(b: GdkPixbufAlphaMode): Boolean = (a & b) == b

/**
 * GdkPixbufError: _PIXBUF_ERROR_CORRUPT_IMAGE: An image file was broken somehow. _PIXBUF_ERROR_INSUFFICIENT_MEMORY: Not enough memory. _PIXBUF_ERROR_BAD_OPTION: A bad option was passed to a pixbuf save module. _PIXBUF_ERROR_UNKNOWN_TYPE: Unknown image type. _PIXBUF_ERROR_UNSUPPORTED_OPERATION: Don't know how to perform the given operation on the type of image at hand. _PIXBUF_ERROR_FAILED: Generic failure code, something went wrong. _PIXBUF_ERROR_INCOMPLETE_ANIMATION: Only part of the animation was loaded.

 * [bindgen] header: /usr/include/gdk-pixbuf-2.0/gdk-pixbuf/gdk-pixbuf-core.h
*/
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
    inline value match
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

/**
 * GdkPixbufRotation: _PIXBUF_ROTATE_NONE: No rotation. _PIXBUF_ROTATE_COUNTERCLOCKWISE: Rotate by 90 degrees. _PIXBUF_ROTATE_UPSIDEDOWN: Rotate by 180 degrees. _PIXBUF_ROTATE_CLOCKWISE: Rotate by 270 degrees.

 * [bindgen] header: /usr/include/gdk-pixbuf-2.0/gdk-pixbuf/gdk-pixbuf-transform.h
*/
opaque type GdkPixbufRotation = CUnsignedInt
object GdkPixbufRotation extends CEnumU[GdkPixbufRotation]:
  given _tag: Tag[GdkPixbufRotation] = Tag.UInt
  inline def define(inline a: Long): GdkPixbufRotation = a.toUInt
  val GDK_PIXBUF_ROTATE_NONE = define(0)
  val GDK_PIXBUF_ROTATE_COUNTERCLOCKWISE = define(90)
  val GDK_PIXBUF_ROTATE_UPSIDEDOWN = define(180)
  val GDK_PIXBUF_ROTATE_CLOCKWISE = define(270)
  inline def getName(inline value: GdkPixbufRotation): Option[String] =
    inline value match
      case GDK_PIXBUF_ROTATE_NONE => Some("GDK_PIXBUF_ROTATE_NONE")
      case GDK_PIXBUF_ROTATE_COUNTERCLOCKWISE => Some("GDK_PIXBUF_ROTATE_COUNTERCLOCKWISE")
      case GDK_PIXBUF_ROTATE_UPSIDEDOWN => Some("GDK_PIXBUF_ROTATE_UPSIDEDOWN")
      case GDK_PIXBUF_ROTATE_CLOCKWISE => Some("GDK_PIXBUF_ROTATE_CLOCKWISE")
      case _ => None
  extension (a: GdkPixbufRotation)
    inline def &(b: GdkPixbufRotation): GdkPixbufRotation = a & b
    inline def |(b: GdkPixbufRotation): GdkPixbufRotation = a | b
    inline def is(b: GdkPixbufRotation): Boolean = (a & b) == b

/**
 * GdkScrollDirection: _SCROLL_UP: the surface is scrolled up. _SCROLL_DOWN: the surface is scrolled down. _SCROLL_LEFT: the surface is scrolled to the left. _SCROLL_RIGHT: the surface is scrolled to the right. _SCROLL_SMOOTH: the scrolling is determined by the delta values in scroll events. See gdk_scroll_event_get_deltas()

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
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
    inline value match
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

/**
 * GdkSeatCapabilities: _SEAT_CAPABILITY_NONE: No input capabilities _SEAT_CAPABILITY_POINTER: The seat has a pointer (e.g. mouse) _SEAT_CAPABILITY_TOUCH: The seat has touchscreen(s) attached _SEAT_CAPABILITY_TABLET_STYLUS: The seat has drawing tablet(s) attached _SEAT_CAPABILITY_KEYBOARD: The seat has keyboard(s) attached _SEAT_CAPABILITY_TABLET_PAD: The seat has drawing tablet pad(s) attached _SEAT_CAPABILITY_ALL_POINTING: The union of all pointing capabilities _SEAT_CAPABILITY_ALL: The union of all capabilities

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkseat.h
*/
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
    inline value match
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

/**
 * GdkSubpixelLayout: _SUBPIXEL_LAYOUT_UNKNOWN: The layout is not known _SUBPIXEL_LAYOUT_NONE: Not organized in this way _SUBPIXEL_LAYOUT_HORIZONTAL_RGB: The layout is horizontal, the order is RGB _SUBPIXEL_LAYOUT_HORIZONTAL_BGR: The layout is horizontal, the order is BGR _SUBPIXEL_LAYOUT_VERTICAL_RGB: The layout is vertical, the order is RGB _SUBPIXEL_LAYOUT_VERTICAL_BGR: The layout is vertical, the order is BGR

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkmonitor.h
*/
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
    inline value match
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

/**
 * GdkSurfaceEdge: _SURFACE_EDGE_NORTH_WEST: the top left corner. _SURFACE_EDGE_NORTH: the top edge. _SURFACE_EDGE_NORTH_EAST: the top right corner. _SURFACE_EDGE_WEST: the left edge. _SURFACE_EDGE_EAST: the right edge. _SURFACE_EDGE_SOUTH_WEST: the lower left corner. _SURFACE_EDGE_SOUTH: the lower edge. _SURFACE_EDGE_SOUTH_EAST: the lower right corner.

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktoplevel.h
*/
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
    inline value match
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

/**
 * GdkTextureError: _TEXTURE_ERROR_TOO_LARGE: Not enough memory to handle this image _TEXTURE_ERROR_CORRUPT_IMAGE: The image data appears corrupted _TEXTURE_ERROR_UNSUPPORTED_CONTENT: The image contains features that cannot be loaded _TEXTURE_ERROR_UNSUPPORTED_FORMAT: The image format is not supported

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktexture.h
*/
opaque type GdkTextureError = CUnsignedInt
object GdkTextureError extends CEnumU[GdkTextureError]:
  given _tag: Tag[GdkTextureError] = Tag.UInt
  inline def define(inline a: Long): GdkTextureError = a.toUInt
  val GDK_TEXTURE_ERROR_TOO_LARGE = define(0)
  val GDK_TEXTURE_ERROR_CORRUPT_IMAGE = define(1)
  val GDK_TEXTURE_ERROR_UNSUPPORTED_CONTENT = define(2)
  val GDK_TEXTURE_ERROR_UNSUPPORTED_FORMAT = define(3)
  inline def getName(inline value: GdkTextureError): Option[String] =
    inline value match
      case GDK_TEXTURE_ERROR_TOO_LARGE => Some("GDK_TEXTURE_ERROR_TOO_LARGE")
      case GDK_TEXTURE_ERROR_CORRUPT_IMAGE => Some("GDK_TEXTURE_ERROR_CORRUPT_IMAGE")
      case GDK_TEXTURE_ERROR_UNSUPPORTED_CONTENT => Some("GDK_TEXTURE_ERROR_UNSUPPORTED_CONTENT")
      case GDK_TEXTURE_ERROR_UNSUPPORTED_FORMAT => Some("GDK_TEXTURE_ERROR_UNSUPPORTED_FORMAT")
      case _ => None
  extension (a: GdkTextureError)
    inline def &(b: GdkTextureError): GdkTextureError = a & b
    inline def |(b: GdkTextureError): GdkTextureError = a | b
    inline def is(b: GdkTextureError): Boolean = (a & b) == b

/**
 * GdkTitlebarGesture: _TITLEBAR_GESTURE_DOUBLE_CLICK: _TITLEBAR_GESTURE_RIGHT_CLICK: _TITLEBAR_GESTURE_MIDDLE_CLICK:

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktoplevel.h
*/
opaque type GdkTitlebarGesture = CUnsignedInt
object GdkTitlebarGesture extends CEnumU[GdkTitlebarGesture]:
  given _tag: Tag[GdkTitlebarGesture] = Tag.UInt
  inline def define(inline a: Long): GdkTitlebarGesture = a.toUInt
  val GDK_TITLEBAR_GESTURE_DOUBLE_CLICK = define(1)
  val GDK_TITLEBAR_GESTURE_RIGHT_CLICK = define(2)
  val GDK_TITLEBAR_GESTURE_MIDDLE_CLICK = define(3)
  inline def getName(inline value: GdkTitlebarGesture): Option[String] =
    inline value match
      case GDK_TITLEBAR_GESTURE_DOUBLE_CLICK => Some("GDK_TITLEBAR_GESTURE_DOUBLE_CLICK")
      case GDK_TITLEBAR_GESTURE_RIGHT_CLICK => Some("GDK_TITLEBAR_GESTURE_RIGHT_CLICK")
      case GDK_TITLEBAR_GESTURE_MIDDLE_CLICK => Some("GDK_TITLEBAR_GESTURE_MIDDLE_CLICK")
      case _ => None
  extension (a: GdkTitlebarGesture)
    inline def &(b: GdkTitlebarGesture): GdkTitlebarGesture = a & b
    inline def |(b: GdkTitlebarGesture): GdkTitlebarGesture = a | b
    inline def is(b: GdkTitlebarGesture): Boolean = (a & b) == b

/**
 * GdkToplevelState: _TOPLEVEL_STATE_MINIMIZED: the surface is minimized _TOPLEVEL_STATE_MAXIMIZED: the surface is maximized _TOPLEVEL_STATE_STICKY: the surface is sticky _TOPLEVEL_STATE_FULLSCREEN: the surface is maximized without decorations _TOPLEVEL_STATE_ABOVE: the surface is kept above other surfaces _TOPLEVEL_STATE_BELOW: the surface is kept below other surfaces _TOPLEVEL_STATE_FOCUSED: the surface is presented as focused (with active decorations) _TOPLEVEL_STATE_TILED: the surface is in a tiled state _TOPLEVEL_STATE_TOP_TILED: whether the top edge is tiled _TOPLEVEL_STATE_TOP_RESIZABLE: whether the top edge is resizable _TOPLEVEL_STATE_RIGHT_TILED: whether the right edge is tiled _TOPLEVEL_STATE_RIGHT_RESIZABLE: whether the right edge is resizable _TOPLEVEL_STATE_BOTTOM_TILED: whether the bottom edge is tiled _TOPLEVEL_STATE_BOTTOM_RESIZABLE: whether the bottom edge is resizable _TOPLEVEL_STATE_LEFT_TILED: whether the left edge is tiled _TOPLEVEL_STATE_LEFT_RESIZABLE: whether the left edge is resizable

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktoplevel.h
*/
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
    inline value match
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

/**
 * GdkTouchpadGesturePhase: _TOUCHPAD_GESTURE_PHASE_BEGIN: The gesture has begun. _TOUCHPAD_GESTURE_PHASE_UPDATE: The gesture has been updated. _TOUCHPAD_GESTURE_PHASE_END: The gesture was finished, changes should be permanently applied. _TOUCHPAD_GESTURE_PHASE_CANCEL: The gesture was cancelled, all changes should be undone.

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type GdkTouchpadGesturePhase = CUnsignedInt
object GdkTouchpadGesturePhase extends CEnumU[GdkTouchpadGesturePhase]:
  given _tag: Tag[GdkTouchpadGesturePhase] = Tag.UInt
  inline def define(inline a: Long): GdkTouchpadGesturePhase = a.toUInt
  val GDK_TOUCHPAD_GESTURE_PHASE_BEGIN = define(0)
  val GDK_TOUCHPAD_GESTURE_PHASE_UPDATE = define(1)
  val GDK_TOUCHPAD_GESTURE_PHASE_END = define(2)
  val GDK_TOUCHPAD_GESTURE_PHASE_CANCEL = define(3)
  inline def getName(inline value: GdkTouchpadGesturePhase): Option[String] =
    inline value match
      case GDK_TOUCHPAD_GESTURE_PHASE_BEGIN => Some("GDK_TOUCHPAD_GESTURE_PHASE_BEGIN")
      case GDK_TOUCHPAD_GESTURE_PHASE_UPDATE => Some("GDK_TOUCHPAD_GESTURE_PHASE_UPDATE")
      case GDK_TOUCHPAD_GESTURE_PHASE_END => Some("GDK_TOUCHPAD_GESTURE_PHASE_END")
      case GDK_TOUCHPAD_GESTURE_PHASE_CANCEL => Some("GDK_TOUCHPAD_GESTURE_PHASE_CANCEL")
      case _ => None
  extension (a: GdkTouchpadGesturePhase)
    inline def &(b: GdkTouchpadGesturePhase): GdkTouchpadGesturePhase = a & b
    inline def |(b: GdkTouchpadGesturePhase): GdkTouchpadGesturePhase = a | b
    inline def is(b: GdkTouchpadGesturePhase): Boolean = (a & b) == b

/**
 * GdkVulkanError: _VULKAN_ERROR_UNSUPPORTED: Vulkan is not supported on this backend or has not been compiled in. _VULKAN_ERROR_NOT_AVAILABLE: Vulkan support is not available on this Surface

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkenums.h
*/
opaque type GdkVulkanError = CUnsignedInt
object GdkVulkanError extends CEnumU[GdkVulkanError]:
  given _tag: Tag[GdkVulkanError] = Tag.UInt
  inline def define(inline a: Long): GdkVulkanError = a.toUInt
  val GDK_VULKAN_ERROR_UNSUPPORTED = define(0)
  val GDK_VULKAN_ERROR_NOT_AVAILABLE = define(1)
  inline def getName(inline value: GdkVulkanError): Option[String] =
    inline value match
      case GDK_VULKAN_ERROR_UNSUPPORTED => Some("GDK_VULKAN_ERROR_UNSUPPORTED")
      case GDK_VULKAN_ERROR_NOT_AVAILABLE => Some("GDK_VULKAN_ERROR_NOT_AVAILABLE")
      case _ => None
  extension (a: GdkVulkanError)
    inline def &(b: GdkVulkanError): GdkVulkanError = a & b
    inline def |(b: GdkVulkanError): GdkVulkanError = a | b
    inline def is(b: GdkVulkanError): Boolean = (a & b) == b

/**
 * GskBlendMode: _BLEND_MODE_DEFAULT: The default blend mode, which specifies no blending _BLEND_MODE_MULTIPLY: The source color is multiplied by the destination and replaces the destination _BLEND_MODE_SCREEN: Multiplies the complements of the destination and source color values, then complements the result. _BLEND_MODE_OVERLAY: Multiplies or screens the colors, depending on the destination color value. This is the inverse of hard-list _BLEND_MODE_DARKEN: Selects the darker of the destination and source colors _BLEND_MODE_LIGHTEN: Selects the lighter of the destination and source colors _BLEND_MODE_COLOR_DODGE: Brightens the destination color to reflect the source color _BLEND_MODE_COLOR_BURN: Darkens the destination color to reflect the source color _BLEND_MODE_HARD_LIGHT: Multiplies or screens the colors, depending on the source color value _BLEND_MODE_SOFT_LIGHT: Darkens or lightens the colors, depending on the source color value _BLEND_MODE_DIFFERENCE: Subtracts the darker of the two constituent colors from the lighter color _BLEND_MODE_EXCLUSION: Produces an effect similar to that of the difference mode but lower in contrast _BLEND_MODE_COLOR: Creates a color with the hue and saturation of the source color and the luminosity of the destination color _BLEND_MODE_HUE: Creates a color with the hue of the source color and the saturation and luminosity of the destination color _BLEND_MODE_SATURATION: Creates a color with the saturation of the source color and the hue and luminosity of the destination color _BLEND_MODE_LUMINOSITY: Creates a color with the luminosity of the source color and the hue and saturation of the destination color

 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskenums.h
*/
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
    inline value match
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

/**
 * GskCorner: _CORNER_TOP_LEFT: The top left corner _CORNER_TOP_RIGHT: The top right corner _CORNER_BOTTOM_RIGHT: The bottom right corner _CORNER_BOTTOM_LEFT: The bottom left corner

 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskenums.h
*/
opaque type GskCorner = CUnsignedInt
object GskCorner extends CEnumU[GskCorner]:
  given _tag: Tag[GskCorner] = Tag.UInt
  inline def define(inline a: Long): GskCorner = a.toUInt
  val GSK_CORNER_TOP_LEFT = define(0)
  val GSK_CORNER_TOP_RIGHT = define(1)
  val GSK_CORNER_BOTTOM_RIGHT = define(2)
  val GSK_CORNER_BOTTOM_LEFT = define(3)
  inline def getName(inline value: GskCorner): Option[String] =
    inline value match
      case GSK_CORNER_TOP_LEFT => Some("GSK_CORNER_TOP_LEFT")
      case GSK_CORNER_TOP_RIGHT => Some("GSK_CORNER_TOP_RIGHT")
      case GSK_CORNER_BOTTOM_RIGHT => Some("GSK_CORNER_BOTTOM_RIGHT")
      case GSK_CORNER_BOTTOM_LEFT => Some("GSK_CORNER_BOTTOM_LEFT")
      case _ => None
  extension (a: GskCorner)
    inline def &(b: GskCorner): GskCorner = a & b
    inline def |(b: GskCorner): GskCorner = a | b
    inline def is(b: GskCorner): Boolean = (a & b) == b

/**
 * GskGLUniformType: _GL_UNIFORM_TYPE_NONE: No type, used for uninitialized or unspecified values. _GL_UNIFORM_TYPE_FLOAT: A float uniform _GL_UNIFORM_TYPE_INT: A GLSL int / gint32 uniform _GL_UNIFORM_TYPE_UINT: A GLSL uint / guint32 uniform _GL_UNIFORM_TYPE_BOOL: A GLSL bool / gboolean uniform _GL_UNIFORM_TYPE_VEC2: A GLSL vec2 / graphene_vec2_t uniform _GL_UNIFORM_TYPE_VEC3: A GLSL vec3 / graphene_vec3_t uniform _GL_UNIFORM_TYPE_VEC4: A GLSL vec4 / graphene_vec4_t uniform

 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskenums.h
*/
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
    inline value match
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

/**
 * GskRenderNodeType: _NOT_A_RENDER_NODE: Error type. No node will ever have this type. _CONTAINER_NODE: A node containing a stack of children _CAIRO_NODE: A node drawing a `cairo_surface_t` _COLOR_NODE: A node drawing a single color rectangle _LINEAR_GRADIENT_NODE: A node drawing a linear gradient _REPEATING_LINEAR_GRADIENT_NODE: A node drawing a repeating linear gradient _RADIAL_GRADIENT_NODE: A node drawing a radial gradient _REPEATING_RADIAL_GRADIENT_NODE: A node drawing a repeating radial gradient _CONIC_GRADIENT_NODE: A node drawing a conic gradient _BORDER_NODE: A node stroking a border around an area _TEXTURE_NODE: A node drawing a `GdkTexture` _INSET_SHADOW_NODE: A node drawing an inset shadow _OUTSET_SHADOW_NODE: A node drawing an outset shadow _TRANSFORM_NODE: A node that renders its child after applying a matrix transform _OPACITY_NODE: A node that changes the opacity of its child _COLOR_MATRIX_NODE: A node that applies a color matrix to every pixel _REPEAT_NODE: A node that repeats the child's contents _CLIP_NODE: A node that clips its child to a rectangular area _ROUNDED_CLIP_NODE: A node that clips its child to a rounded rectangle _SHADOW_NODE: A node that draws a shadow below its child _BLEND_NODE: A node that blends two children together _CROSS_FADE_NODE: A node that cross-fades between two children _TEXT_NODE: A node containing a glyph string _BLUR_NODE: A node that applies a blur _DEBUG_NODE: Debug information that does not affect the rendering _GL_SHADER_NODE: A node that uses OpenGL fragment shaders to render

 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskenums.h
*/
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
    inline value match
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

/**
 * GskScalingFilter: _SCALING_FILTER_LINEAR: linear interpolation filter _SCALING_FILTER_NEAREST: nearest neighbor interpolation filter _SCALING_FILTER_TRILINEAR: linear interpolation along each axis, plus mipmap generation, with linear interpolation along the mipmap levels

 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskenums.h
*/
opaque type GskScalingFilter = CUnsignedInt
object GskScalingFilter extends CEnumU[GskScalingFilter]:
  given _tag: Tag[GskScalingFilter] = Tag.UInt
  inline def define(inline a: Long): GskScalingFilter = a.toUInt
  val GSK_SCALING_FILTER_LINEAR = define(0)
  val GSK_SCALING_FILTER_NEAREST = define(1)
  val GSK_SCALING_FILTER_TRILINEAR = define(2)
  inline def getName(inline value: GskScalingFilter): Option[String] =
    inline value match
      case GSK_SCALING_FILTER_LINEAR => Some("GSK_SCALING_FILTER_LINEAR")
      case GSK_SCALING_FILTER_NEAREST => Some("GSK_SCALING_FILTER_NEAREST")
      case GSK_SCALING_FILTER_TRILINEAR => Some("GSK_SCALING_FILTER_TRILINEAR")
      case _ => None
  extension (a: GskScalingFilter)
    inline def &(b: GskScalingFilter): GskScalingFilter = a & b
    inline def |(b: GskScalingFilter): GskScalingFilter = a | b
    inline def is(b: GskScalingFilter): Boolean = (a & b) == b

/**
 * GskSerializationError: _SERIALIZATION_UNSUPPORTED_FORMAT: The format can not be identified _SERIALIZATION_UNSUPPORTED_VERSION: The version of the data is not understood _SERIALIZATION_INVALID_DATA: The given data may not exist in a proper serialization

 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskenums.h
*/
opaque type GskSerializationError = CUnsignedInt
object GskSerializationError extends CEnumU[GskSerializationError]:
  given _tag: Tag[GskSerializationError] = Tag.UInt
  inline def define(inline a: Long): GskSerializationError = a.toUInt
  val GSK_SERIALIZATION_UNSUPPORTED_FORMAT = define(0)
  val GSK_SERIALIZATION_UNSUPPORTED_VERSION = define(1)
  val GSK_SERIALIZATION_INVALID_DATA = define(2)
  inline def getName(inline value: GskSerializationError): Option[String] =
    inline value match
      case GSK_SERIALIZATION_UNSUPPORTED_FORMAT => Some("GSK_SERIALIZATION_UNSUPPORTED_FORMAT")
      case GSK_SERIALIZATION_UNSUPPORTED_VERSION => Some("GSK_SERIALIZATION_UNSUPPORTED_VERSION")
      case GSK_SERIALIZATION_INVALID_DATA => Some("GSK_SERIALIZATION_INVALID_DATA")
      case _ => None
  extension (a: GskSerializationError)
    inline def &(b: GskSerializationError): GskSerializationError = a & b
    inline def |(b: GskSerializationError): GskSerializationError = a | b
    inline def is(b: GskSerializationError): Boolean = (a & b) == b

/**
 * GskTransformCategory: _TRANSFORM_CATEGORY_UNKNOWN: The category of the matrix has not been determined. _TRANSFORM_CATEGORY_ANY: Analyzing the matrix concluded that it does not fit in any other category. _TRANSFORM_CATEGORY_3D: The matrix is a 3D matrix. This means that the w column (the last column) has the values (0, 0, 0, 1). _TRANSFORM_CATEGORY_2D: The matrix is a 2D matrix. This is equivalent to graphene_matrix_is_2d() returning %TRUE. In particular, this means that Cairo can deal with the matrix. _TRANSFORM_CATEGORY_2D_AFFINE: The matrix is a combination of 2D scale and 2D translation operations. In particular, this means that any rectangle can be transformed exactly using this matrix. _TRANSFORM_CATEGORY_2D_TRANSLATE: The matrix is a 2D translation. _TRANSFORM_CATEGORY_IDENTITY: The matrix is the identity matrix.

 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskenums.h
*/
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
    inline value match
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

/**
 * PangoAlignment: _ALIGN_LEFT: Put all available space on the right _ALIGN_CENTER: Center the line within the available space _ALIGN_RIGHT: Put all available space on the left

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
*/
opaque type PangoAlignment = CUnsignedInt
object PangoAlignment extends CEnumU[PangoAlignment]:
  given _tag: Tag[PangoAlignment] = Tag.UInt
  inline def define(inline a: Long): PangoAlignment = a.toUInt
  val PANGO_ALIGN_LEFT = define(0)
  val PANGO_ALIGN_CENTER = define(1)
  val PANGO_ALIGN_RIGHT = define(2)
  inline def getName(inline value: PangoAlignment): Option[String] =
    inline value match
      case PANGO_ALIGN_LEFT => Some("PANGO_ALIGN_LEFT")
      case PANGO_ALIGN_CENTER => Some("PANGO_ALIGN_CENTER")
      case PANGO_ALIGN_RIGHT => Some("PANGO_ALIGN_RIGHT")
      case _ => None
  extension (a: PangoAlignment)
    inline def &(b: PangoAlignment): PangoAlignment = a & b
    inline def |(b: PangoAlignment): PangoAlignment = a | b
    inline def is(b: PangoAlignment): Boolean = (a & b) == b

/**
 * PangoAttrType: _ATTR_INVALID: does not happen _ATTR_LANGUAGE: language ([struct.AttrLanguage]) _ATTR_FAMILY: font family name list ([struct.AttrString]) _ATTR_STYLE: font slant style ([struct.AttrInt]) _ATTR_WEIGHT: font weight ([struct.AttrInt]) _ATTR_VARIANT: font variant (normal or small caps) ([struct.AttrInt]) _ATTR_STRETCH: font stretch ([struct.AttrInt]) _ATTR_SIZE: font size in points scaled by %PANGO_SCALE ([struct.AttrInt]) _ATTR_FONT_DESC: font description ([struct.AttrFontDesc]) _ATTR_FOREGROUND: foreground color ([struct.AttrColor]) _ATTR_BACKGROUND: background color ([struct.AttrColor]) _ATTR_UNDERLINE: whether the text has an underline ([struct.AttrInt]) _ATTR_STRIKETHROUGH: whether the text is struck-through ([struct.AttrInt]) _ATTR_RISE: baseline displacement ([struct.AttrInt]) _ATTR_SHAPE: shape ([struct.AttrShape]) _ATTR_SCALE: font size scale factor ([struct.AttrFloat]) _ATTR_FALLBACK: whether fallback is enabled ([struct.AttrInt]) _ATTR_LETTER_SPACING: letter spacing ([struct]) _ATTR_UNDERLINE_COLOR: underline color ([struct.AttrColor]) _ATTR_STRIKETHROUGH_COLOR: strikethrough color ([struct.AttrColor]) _ATTR_ABSOLUTE_SIZE: font size in pixels scaled by %PANGO_SCALE ([struct.AttrInt]) _ATTR_GRAVITY: base text gravity ([struct.AttrInt]) _ATTR_GRAVITY_HINT: gravity hint ([struct.AttrInt]) _ATTR_FONT_FEATURES: OpenType font features ([struct.AttrFontFeatures]). Since 1.38 _ATTR_FOREGROUND_ALPHA: foreground alpha ([struct.AttrInt]). Since 1.38 _ATTR_BACKGROUND_ALPHA: background alpha ([struct.AttrInt]). Since 1.38 _ATTR_ALLOW_BREAKS: whether breaks are allowed ([struct.AttrInt]). Since 1.44 _ATTR_SHOW: how to render invisible characters ([struct.AttrInt]). Since 1.44 _ATTR_INSERT_HYPHENS: whether to insert hyphens at intra-word line breaks ([struct.AttrInt]). Since 1.44 _ATTR_OVERLINE: whether the text has an overline ([struct.AttrInt]). Since 1.46 _ATTR_OVERLINE_COLOR: overline color ([struct.AttrColor]). Since 1.46 _ATTR_LINE_HEIGHT: line height factor ([struct.AttrFloat]). Since: 1.50 _ATTR_ABSOLUTE_LINE_HEIGHT: line height ([struct.AttrInt]). Since: 1.50 _ATTR_WORD: override segmentation to classify the range of the attribute as a single word ([struct.AttrInt]). Since 1.50 _ATTR_SENTENCE: override segmentation to classify the range of the attribute as a single sentence ([struct.AttrInt]). Since 1.50 _ATTR_BASELINE_SHIFT: baseline displacement ([struct.AttrInt]). Since 1.50 _ATTR_FONT_SCALE: font-relative size change ([struct.AttrInt]). Since 1.50

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
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
    inline value match
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

/**
 * PangoBaselineShift: _BASELINE_SHIFT_NONE: Leave the baseline unchanged _BASELINE_SHIFT_SUPERSCRIPT: Shift the baseline to the superscript position, relative to the previous run _BASELINE_SHIFT_SUBSCRIPT: Shift the baseline to the subscript position, relative to the previous run

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoBaselineShift = CUnsignedInt
object PangoBaselineShift extends CEnumU[PangoBaselineShift]:
  given _tag: Tag[PangoBaselineShift] = Tag.UInt
  inline def define(inline a: Long): PangoBaselineShift = a.toUInt
  val PANGO_BASELINE_SHIFT_NONE = define(0)
  val PANGO_BASELINE_SHIFT_SUPERSCRIPT = define(1)
  val PANGO_BASELINE_SHIFT_SUBSCRIPT = define(2)
  inline def getName(inline value: PangoBaselineShift): Option[String] =
    inline value match
      case PANGO_BASELINE_SHIFT_NONE => Some("PANGO_BASELINE_SHIFT_NONE")
      case PANGO_BASELINE_SHIFT_SUPERSCRIPT => Some("PANGO_BASELINE_SHIFT_SUPERSCRIPT")
      case PANGO_BASELINE_SHIFT_SUBSCRIPT => Some("PANGO_BASELINE_SHIFT_SUBSCRIPT")
      case _ => None
  extension (a: PangoBaselineShift)
    inline def &(b: PangoBaselineShift): PangoBaselineShift = a & b
    inline def |(b: PangoBaselineShift): PangoBaselineShift = a | b
    inline def is(b: PangoBaselineShift): Boolean = (a & b) == b

/**
 * PangoBidiType: _BIDI_TYPE_L: Left-to-Right _BIDI_TYPE_LRE: Left-to-Right Embedding _BIDI_TYPE_LRO: Left-to-Right Override _BIDI_TYPE_R: Right-to-Left _BIDI_TYPE_AL: Right-to-Left Arabic _BIDI_TYPE_RLE: Right-to-Left Embedding _BIDI_TYPE_RLO: Right-to-Left Override _BIDI_TYPE_PDF: Pop Directional Format _BIDI_TYPE_EN: European Number _BIDI_TYPE_ES: European Number Separator _BIDI_TYPE_ET: European Number Terminator _BIDI_TYPE_AN: Arabic Number _BIDI_TYPE_CS: Common Number Separator _BIDI_TYPE_NSM: Nonspacing Mark _BIDI_TYPE_BN: Boundary Neutral _BIDI_TYPE_B: Paragraph Separator _BIDI_TYPE_S: Segment Separator _BIDI_TYPE_WS: Whitespace _BIDI_TYPE_ON: Other Neutrals _BIDI_TYPE_LRI: Left-to-Right isolate. Since 1.48.6 _BIDI_TYPE_RLI: Right-to-Left isolate. Since 1.48.6 _BIDI_TYPE_FSI: First strong isolate. Since 1.48.6 _BIDI_TYPE_PDI: Pop directional isolate. Since 1.48.6

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-bidi-type.h
*/
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
    inline value match
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

/**
 * PangoCoverageLevel: _COVERAGE_NONE: The character is not representable with the font. _COVERAGE_FALLBACK: The character is represented in a way that may be comprehensible but is not the correct graphical form. For instance, a Hangul character represented as a a sequence of Jamos, or a Latin transliteration of a Cyrillic word. _COVERAGE_APPROXIMATE: The character is represented as basically the correct graphical form, but with a stylistic variant inappropriate for the current script. _COVERAGE_EXACT: The character is represented as the correct graphical form.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-coverage.h
*/
opaque type PangoCoverageLevel = CUnsignedInt
object PangoCoverageLevel extends CEnumU[PangoCoverageLevel]:
  given _tag: Tag[PangoCoverageLevel] = Tag.UInt
  inline def define(inline a: Long): PangoCoverageLevel = a.toUInt
  val PANGO_COVERAGE_NONE = define(0)
  val PANGO_COVERAGE_FALLBACK = define(1)
  val PANGO_COVERAGE_APPROXIMATE = define(2)
  val PANGO_COVERAGE_EXACT = define(3)
  inline def getName(inline value: PangoCoverageLevel): Option[String] =
    inline value match
      case PANGO_COVERAGE_NONE => Some("PANGO_COVERAGE_NONE")
      case PANGO_COVERAGE_FALLBACK => Some("PANGO_COVERAGE_FALLBACK")
      case PANGO_COVERAGE_APPROXIMATE => Some("PANGO_COVERAGE_APPROXIMATE")
      case PANGO_COVERAGE_EXACT => Some("PANGO_COVERAGE_EXACT")
      case _ => None
  extension (a: PangoCoverageLevel)
    inline def &(b: PangoCoverageLevel): PangoCoverageLevel = a & b
    inline def |(b: PangoCoverageLevel): PangoCoverageLevel = a | b
    inline def is(b: PangoCoverageLevel): Boolean = (a & b) == b

/**
 * PangoDirection: _DIRECTION_LTR: A strong left-to-right direction _DIRECTION_RTL: A strong right-to-left direction _DIRECTION_TTB_LTR: Deprecated value; treated the same as `PANGO_DIRECTION_RTL`. _DIRECTION_TTB_RTL: Deprecated value; treated the same as `PANGO_DIRECTION_LTR` _DIRECTION_WEAK_LTR: A weak left-to-right direction _DIRECTION_WEAK_RTL: A weak right-to-left direction _DIRECTION_NEUTRAL: No direction specified

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-direction.h
*/
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
    inline value match
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

/**
 * PangoEllipsizeMode: _ELLIPSIZE_NONE: No ellipsization _ELLIPSIZE_START: Omit characters at the start of the text _ELLIPSIZE_MIDDLE: Omit characters in the middle of the text _ELLIPSIZE_END: Omit characters at the end of the text

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
*/
opaque type PangoEllipsizeMode = CUnsignedInt
object PangoEllipsizeMode extends CEnumU[PangoEllipsizeMode]:
  given _tag: Tag[PangoEllipsizeMode] = Tag.UInt
  inline def define(inline a: Long): PangoEllipsizeMode = a.toUInt
  val PANGO_ELLIPSIZE_NONE = define(0)
  val PANGO_ELLIPSIZE_START = define(1)
  val PANGO_ELLIPSIZE_MIDDLE = define(2)
  val PANGO_ELLIPSIZE_END = define(3)
  inline def getName(inline value: PangoEllipsizeMode): Option[String] =
    inline value match
      case PANGO_ELLIPSIZE_NONE => Some("PANGO_ELLIPSIZE_NONE")
      case PANGO_ELLIPSIZE_START => Some("PANGO_ELLIPSIZE_START")
      case PANGO_ELLIPSIZE_MIDDLE => Some("PANGO_ELLIPSIZE_MIDDLE")
      case PANGO_ELLIPSIZE_END => Some("PANGO_ELLIPSIZE_END")
      case _ => None
  extension (a: PangoEllipsizeMode)
    inline def &(b: PangoEllipsizeMode): PangoEllipsizeMode = a & b
    inline def |(b: PangoEllipsizeMode): PangoEllipsizeMode = a | b
    inline def is(b: PangoEllipsizeMode): Boolean = (a & b) == b

/**
 * PangoFontMask: _FONT_MASK_FAMILY: the font family is specified. _FONT_MASK_STYLE: the font style is specified. _FONT_MASK_VARIANT: the font variant is specified. _FONT_MASK_WEIGHT: the font weight is specified. _FONT_MASK_STRETCH: the font stretch is specified. _FONT_MASK_SIZE: the font size is specified. _FONT_MASK_GRAVITY: the font gravity is specified (Since: 1.16.) _FONT_MASK_VARIATIONS: OpenType font variations are specified (Since: 1.42)

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
*/
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
    inline value match
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

/**
 * PangoFontScale: _FONT_SCALE_NONE: Leave the font size unchanged _FONT_SCALE_SUPERSCRIPT: Change the font to a size suitable for superscripts _FONT_SCALE_SUBSCRIPT: Change the font to a size suitable for subscripts _FONT_SCALE_SMALL_CAPS: Change the font to a size suitable for Small Caps

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoFontScale = CUnsignedInt
object PangoFontScale extends CEnumU[PangoFontScale]:
  given _tag: Tag[PangoFontScale] = Tag.UInt
  inline def define(inline a: Long): PangoFontScale = a.toUInt
  val PANGO_FONT_SCALE_NONE = define(0)
  val PANGO_FONT_SCALE_SUPERSCRIPT = define(1)
  val PANGO_FONT_SCALE_SUBSCRIPT = define(2)
  val PANGO_FONT_SCALE_SMALL_CAPS = define(3)
  inline def getName(inline value: PangoFontScale): Option[String] =
    inline value match
      case PANGO_FONT_SCALE_NONE => Some("PANGO_FONT_SCALE_NONE")
      case PANGO_FONT_SCALE_SUPERSCRIPT => Some("PANGO_FONT_SCALE_SUPERSCRIPT")
      case PANGO_FONT_SCALE_SUBSCRIPT => Some("PANGO_FONT_SCALE_SUBSCRIPT")
      case PANGO_FONT_SCALE_SMALL_CAPS => Some("PANGO_FONT_SCALE_SMALL_CAPS")
      case _ => None
  extension (a: PangoFontScale)
    inline def &(b: PangoFontScale): PangoFontScale = a & b
    inline def |(b: PangoFontScale): PangoFontScale = a | b
    inline def is(b: PangoFontScale): Boolean = (a & b) == b

/**
 * PangoGravity: _GRAVITY_SOUTH: Glyphs stand upright (default) _GRAVITY_EAST: Glyphs are rotated 90 degrees counter-clockwise. _GRAVITY_NORTH: Glyphs are upside-down. _GRAVITY_WEST: Glyphs are rotated 90 degrees clockwise. _GRAVITY_AUTO: Gravity is resolved from the context matrix

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-gravity.h
*/
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
    inline value match
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

/**
 * PangoGravityHint: _GRAVITY_HINT_NATURAL: scripts will take their natural gravity based on the base gravity and the script. This is the default. _GRAVITY_HINT_STRONG: always use the base gravity set, regardless of the script. _GRAVITY_HINT_LINE: for scripts not in their natural direction (eg. Latin in East gravity), choose per-script gravity such that every script respects the line progression. This means, Latin and Arabic will take opposite gravities and both flow top-to-bottom for example.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-gravity.h
*/
opaque type PangoGravityHint = CUnsignedInt
object PangoGravityHint extends CEnumU[PangoGravityHint]:
  given _tag: Tag[PangoGravityHint] = Tag.UInt
  inline def define(inline a: Long): PangoGravityHint = a.toUInt
  val PANGO_GRAVITY_HINT_NATURAL = define(0)
  val PANGO_GRAVITY_HINT_STRONG = define(1)
  val PANGO_GRAVITY_HINT_LINE = define(2)
  inline def getName(inline value: PangoGravityHint): Option[String] =
    inline value match
      case PANGO_GRAVITY_HINT_NATURAL => Some("PANGO_GRAVITY_HINT_NATURAL")
      case PANGO_GRAVITY_HINT_STRONG => Some("PANGO_GRAVITY_HINT_STRONG")
      case PANGO_GRAVITY_HINT_LINE => Some("PANGO_GRAVITY_HINT_LINE")
      case _ => None
  extension (a: PangoGravityHint)
    inline def &(b: PangoGravityHint): PangoGravityHint = a & b
    inline def |(b: PangoGravityHint): PangoGravityHint = a | b
    inline def is(b: PangoGravityHint): Boolean = (a & b) == b

/**
 * PangoLayoutDeserializeError: _LAYOUT_DESERIALIZE_INVALID: Unspecified error _LAYOUT_DESERIALIZE_INVALID_VALUE: A JSon value could not be interpreted _LAYOUT_DESERIALIZE_MISSING_VALUE: A required JSon member was not found

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
*/
opaque type PangoLayoutDeserializeError = CUnsignedInt
object PangoLayoutDeserializeError extends CEnumU[PangoLayoutDeserializeError]:
  given _tag: Tag[PangoLayoutDeserializeError] = Tag.UInt
  inline def define(inline a: Long): PangoLayoutDeserializeError = a.toUInt
  val PANGO_LAYOUT_DESERIALIZE_INVALID = define(0)
  val PANGO_LAYOUT_DESERIALIZE_INVALID_VALUE = define(1)
  val PANGO_LAYOUT_DESERIALIZE_MISSING_VALUE = define(2)
  inline def getName(inline value: PangoLayoutDeserializeError): Option[String] =
    inline value match
      case PANGO_LAYOUT_DESERIALIZE_INVALID => Some("PANGO_LAYOUT_DESERIALIZE_INVALID")
      case PANGO_LAYOUT_DESERIALIZE_INVALID_VALUE => Some("PANGO_LAYOUT_DESERIALIZE_INVALID_VALUE")
      case PANGO_LAYOUT_DESERIALIZE_MISSING_VALUE => Some("PANGO_LAYOUT_DESERIALIZE_MISSING_VALUE")
      case _ => None
  extension (a: PangoLayoutDeserializeError)
    inline def &(b: PangoLayoutDeserializeError): PangoLayoutDeserializeError = a & b
    inline def |(b: PangoLayoutDeserializeError): PangoLayoutDeserializeError = a | b
    inline def is(b: PangoLayoutDeserializeError): Boolean = (a & b) == b

/**
 * PangoLayoutDeserializeFlags: _LAYOUT_DESERIALIZE_DEFAULT: Default behavior _LAYOUT_DESERIALIZE_CONTEXT: Apply context information from the serialization to the `PangoContext`

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
*/
opaque type PangoLayoutDeserializeFlags = CUnsignedInt
object PangoLayoutDeserializeFlags extends CEnumU[PangoLayoutDeserializeFlags]:
  given _tag: Tag[PangoLayoutDeserializeFlags] = Tag.UInt
  inline def define(inline a: Long): PangoLayoutDeserializeFlags = a.toUInt
  val PANGO_LAYOUT_DESERIALIZE_DEFAULT = define(0)
  val PANGO_LAYOUT_DESERIALIZE_CONTEXT = define(1)
  inline def getName(inline value: PangoLayoutDeserializeFlags): Option[String] =
    inline value match
      case PANGO_LAYOUT_DESERIALIZE_DEFAULT => Some("PANGO_LAYOUT_DESERIALIZE_DEFAULT")
      case PANGO_LAYOUT_DESERIALIZE_CONTEXT => Some("PANGO_LAYOUT_DESERIALIZE_CONTEXT")
      case _ => None
  extension (a: PangoLayoutDeserializeFlags)
    inline def &(b: PangoLayoutDeserializeFlags): PangoLayoutDeserializeFlags = a & b
    inline def |(b: PangoLayoutDeserializeFlags): PangoLayoutDeserializeFlags = a | b
    inline def is(b: PangoLayoutDeserializeFlags): Boolean = (a & b) == b

/**
 * PangoLayoutSerializeFlags: _LAYOUT_SERIALIZE_DEFAULT: Default behavior _LAYOUT_SERIALIZE_CONTEXT: Include context information _LAYOUT_SERIALIZE_OUTPUT: Include information about the formatted output

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
*/
opaque type PangoLayoutSerializeFlags = CUnsignedInt
object PangoLayoutSerializeFlags extends CEnumU[PangoLayoutSerializeFlags]:
  given _tag: Tag[PangoLayoutSerializeFlags] = Tag.UInt
  inline def define(inline a: Long): PangoLayoutSerializeFlags = a.toUInt
  val PANGO_LAYOUT_SERIALIZE_DEFAULT = define(0)
  val PANGO_LAYOUT_SERIALIZE_CONTEXT = define(1)
  val PANGO_LAYOUT_SERIALIZE_OUTPUT = define(2)
  inline def getName(inline value: PangoLayoutSerializeFlags): Option[String] =
    inline value match
      case PANGO_LAYOUT_SERIALIZE_DEFAULT => Some("PANGO_LAYOUT_SERIALIZE_DEFAULT")
      case PANGO_LAYOUT_SERIALIZE_CONTEXT => Some("PANGO_LAYOUT_SERIALIZE_CONTEXT")
      case PANGO_LAYOUT_SERIALIZE_OUTPUT => Some("PANGO_LAYOUT_SERIALIZE_OUTPUT")
      case _ => None
  extension (a: PangoLayoutSerializeFlags)
    inline def &(b: PangoLayoutSerializeFlags): PangoLayoutSerializeFlags = a & b
    inline def |(b: PangoLayoutSerializeFlags): PangoLayoutSerializeFlags = a | b
    inline def is(b: PangoLayoutSerializeFlags): Boolean = (a & b) == b

/**
 * PangoOverline: _OVERLINE_NONE: no overline should be drawn _OVERLINE_SINGLE: Draw a single line above the ink extents of the text being underlined.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoOverline = CUnsignedInt
object PangoOverline extends CEnumU[PangoOverline]:
  given _tag: Tag[PangoOverline] = Tag.UInt
  inline def define(inline a: Long): PangoOverline = a.toUInt
  val PANGO_OVERLINE_NONE = define(0)
  val PANGO_OVERLINE_SINGLE = define(1)
  inline def getName(inline value: PangoOverline): Option[String] =
    inline value match
      case PANGO_OVERLINE_NONE => Some("PANGO_OVERLINE_NONE")
      case PANGO_OVERLINE_SINGLE => Some("PANGO_OVERLINE_SINGLE")
      case _ => None
  extension (a: PangoOverline)
    inline def &(b: PangoOverline): PangoOverline = a & b
    inline def |(b: PangoOverline): PangoOverline = a | b
    inline def is(b: PangoOverline): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-renderer.h
*/
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
    inline value match
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

/**
 * PangoScript: _SCRIPT_INVALID_CODE: a value never returned from pango_script_for_unichar() _SCRIPT_COMMON: a character used by multiple different scripts _SCRIPT_INHERITED: a mark glyph that takes its script from the base glyph to which it is attached _SCRIPT_ARABIC: Arabic _SCRIPT_ARMENIAN: Armenian _SCRIPT_BENGALI: Bengali _SCRIPT_BOPOMOFO: Bopomofo _SCRIPT_CHEROKEE: Cherokee _SCRIPT_COPTIC: Coptic _SCRIPT_CYRILLIC: Cyrillic _SCRIPT_DESERET: Deseret _SCRIPT_DEVANAGARI: Devanagari _SCRIPT_ETHIOPIC: Ethiopic _SCRIPT_GEORGIAN: Georgian _SCRIPT_GOTHIC: Gothic _SCRIPT_GREEK: Greek _SCRIPT_GUJARATI: Gujarati _SCRIPT_GURMUKHI: Gurmukhi _SCRIPT_HAN: Han _SCRIPT_HANGUL: Hangul _SCRIPT_HEBREW: Hebrew _SCRIPT_HIRAGANA: Hiragana _SCRIPT_KANNADA: Kannada _SCRIPT_KATAKANA: Katakana _SCRIPT_KHMER: Khmer _SCRIPT_LAO: Lao _SCRIPT_LATIN: Latin _SCRIPT_MALAYALAM: Malayalam _SCRIPT_MONGOLIAN: Mongolian _SCRIPT_MYANMAR: Myanmar _SCRIPT_OGHAM: Ogham _SCRIPT_OLD_ITALIC: Old Italic _SCRIPT_ORIYA: Oriya _SCRIPT_RUNIC: Runic _SCRIPT_SINHALA: Sinhala _SCRIPT_SYRIAC: Syriac _SCRIPT_TAMIL: Tamil _SCRIPT_TELUGU: Telugu _SCRIPT_THAANA: Thaana _SCRIPT_THAI: Thai _SCRIPT_TIBETAN: Tibetan _SCRIPT_CANADIAN_ABORIGINAL: Canadian Aboriginal _SCRIPT_YI: Yi _SCRIPT_TAGALOG: Tagalog _SCRIPT_HANUNOO: Hanunoo _SCRIPT_BUHID: Buhid _SCRIPT_TAGBANWA: Tagbanwa _SCRIPT_BRAILLE: Braille _SCRIPT_CYPRIOT: Cypriot _SCRIPT_LIMBU: Limbu _SCRIPT_OSMANYA: Osmanya _SCRIPT_SHAVIAN: Shavian _SCRIPT_LINEAR_B: Linear B _SCRIPT_TAI_LE: Tai Le _SCRIPT_UGARITIC: Ugaritic _SCRIPT_NEW_TAI_LUE: New Tai Lue. Since 1.10 _SCRIPT_BUGINESE: Buginese. Since 1.10 _SCRIPT_GLAGOLITIC: Glagolitic. Since 1.10 _SCRIPT_TIFINAGH: Tifinagh. Since 1.10 _SCRIPT_SYLOTI_NAGRI: Syloti Nagri. Since 1.10 _SCRIPT_OLD_PERSIAN: Old Persian. Since 1.10 _SCRIPT_KHAROSHTHI: Kharoshthi. Since 1.10 _SCRIPT_UNKNOWN: an unassigned code point. Since 1.14 _SCRIPT_BALINESE: Balinese. Since 1.14 _SCRIPT_CUNEIFORM: Cuneiform. Since 1.14 _SCRIPT_PHOENICIAN: Phoenician. Since 1.14 _SCRIPT_PHAGS_PA: Phags-pa. Since 1.14 _SCRIPT_NKO: N'Ko. Since 1.14 _SCRIPT_KAYAH_LI: Kayah Li. Since 1.20.1 _SCRIPT_LEPCHA: Lepcha. Since 1.20.1 _SCRIPT_REJANG: Rejang. Since 1.20.1 _SCRIPT_SUNDANESE: Sundanese. Since 1.20.1 _SCRIPT_SAURASHTRA: Saurashtra. Since 1.20.1 _SCRIPT_CHAM: Cham. Since 1.20.1 _SCRIPT_OL_CHIKI: Ol Chiki. Since 1.20.1 _SCRIPT_VAI: Vai. Since 1.20.1 _SCRIPT_CARIAN: Carian. Since 1.20.1 _SCRIPT_LYCIAN: Lycian. Since 1.20.1 _SCRIPT_LYDIAN: Lydian. Since 1.20.1 _SCRIPT_BATAK: Batak. Since 1.32 _SCRIPT_BRAHMI: Brahmi. Since 1.32 _SCRIPT_MANDAIC: Mandaic. Since 1.32 _SCRIPT_CHAKMA: Chakma. Since: 1.32 _SCRIPT_MEROITIC_CURSIVE: Meroitic Cursive. Since: 1.32 _SCRIPT_MEROITIC_HIEROGLYPHS: Meroitic Hieroglyphs. Since: 1.32 _SCRIPT_MIAO: Miao. Since: 1.32 _SCRIPT_SHARADA: Sharada. Since: 1.32 _SCRIPT_SORA_SOMPENG: Sora Sompeng. Since: 1.32 _SCRIPT_TAKRI: Takri. Since: 1.32 _SCRIPT_BASSA_VAH: Bassa. Since: 1.40 _SCRIPT_CAUCASIAN_ALBANIAN: Caucasian Albanian. Since: 1.40 _SCRIPT_DUPLOYAN: Duployan. Since: 1.40 _SCRIPT_ELBASAN: Elbasan. Since: 1.40 _SCRIPT_GRANTHA: Grantha. Since: 1.40 _SCRIPT_KHOJKI: Kjohki. Since: 1.40 _SCRIPT_KHUDAWADI: Khudawadi, Sindhi. Since: 1.40 _SCRIPT_LINEAR_A: Linear A. Since: 1.40 _SCRIPT_MAHAJANI: Mahajani. Since: 1.40 _SCRIPT_MANICHAEAN: Manichaean. Since: 1.40 _SCRIPT_MENDE_KIKAKUI: Mende Kikakui. Since: 1.40 _SCRIPT_MODI: Modi. Since: 1.40 _SCRIPT_MRO: Mro. Since: 1.40 _SCRIPT_NABATAEAN: Nabataean. Since: 1.40 _SCRIPT_OLD_NORTH_ARABIAN: Old North Arabian. Since: 1.40 _SCRIPT_OLD_PERMIC: Old Permic. Since: 1.40 _SCRIPT_PAHAWH_HMONG: Pahawh Hmong. Since: 1.40 _SCRIPT_PALMYRENE: Palmyrene. Since: 1.40 _SCRIPT_PAU_CIN_HAU: Pau Cin Hau. Since: 1.40 _SCRIPT_PSALTER_PAHLAVI: Psalter Pahlavi. Since: 1.40 _SCRIPT_SIDDHAM: Siddham. Since: 1.40 _SCRIPT_TIRHUTA: Tirhuta. Since: 1.40 _SCRIPT_WARANG_CITI: Warang Citi. Since: 1.40 _SCRIPT_AHOM: Ahom. Since: 1.40 _SCRIPT_ANATOLIAN_HIEROGLYPHS: Anatolian Hieroglyphs. Since: 1.40 _SCRIPT_HATRAN: Hatran. Since: 1.40 _SCRIPT_MULTANI: Multani. Since: 1.40 _SCRIPT_OLD_HUNGARIAN: Old Hungarian. Since: 1.40 _SCRIPT_SIGNWRITING: Signwriting. Since: 1.40

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-script.h
*/
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
    inline value match
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

/**
 * PangoShapeFlags: _SHAPE_NONE: Default value _SHAPE_ROUND_POSITIONS: Round glyph positions and widths to whole device units This option should be set if the target renderer can't do subpixel positioning of glyphs

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph.h
*/
opaque type PangoShapeFlags = CUnsignedInt
object PangoShapeFlags extends CEnumU[PangoShapeFlags]:
  given _tag: Tag[PangoShapeFlags] = Tag.UInt
  inline def define(inline a: Long): PangoShapeFlags = a.toUInt
  val PANGO_SHAPE_NONE = define(0)
  val PANGO_SHAPE_ROUND_POSITIONS = define(1)
  inline def getName(inline value: PangoShapeFlags): Option[String] =
    inline value match
      case PANGO_SHAPE_NONE => Some("PANGO_SHAPE_NONE")
      case PANGO_SHAPE_ROUND_POSITIONS => Some("PANGO_SHAPE_ROUND_POSITIONS")
      case _ => None
  extension (a: PangoShapeFlags)
    inline def &(b: PangoShapeFlags): PangoShapeFlags = a & b
    inline def |(b: PangoShapeFlags): PangoShapeFlags = a | b
    inline def is(b: PangoShapeFlags): Boolean = (a & b) == b

/**
 * PangoShowFlags: _SHOW_NONE: No special treatment for invisible characters _SHOW_SPACES: Render spaces, tabs and newlines visibly _SHOW_LINE_BREAKS: Render line breaks visibly _SHOW_IGNORABLES: Render default-ignorable Unicode characters visibly

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoShowFlags = CUnsignedInt
object PangoShowFlags extends CEnumU[PangoShowFlags]:
  given _tag: Tag[PangoShowFlags] = Tag.UInt
  inline def define(inline a: Long): PangoShowFlags = a.toUInt
  val PANGO_SHOW_NONE = define(0)
  val PANGO_SHOW_SPACES = define(1)
  val PANGO_SHOW_LINE_BREAKS = define(2)
  val PANGO_SHOW_IGNORABLES = define(4)
  inline def getName(inline value: PangoShowFlags): Option[String] =
    inline value match
      case PANGO_SHOW_NONE => Some("PANGO_SHOW_NONE")
      case PANGO_SHOW_SPACES => Some("PANGO_SHOW_SPACES")
      case PANGO_SHOW_LINE_BREAKS => Some("PANGO_SHOW_LINE_BREAKS")
      case PANGO_SHOW_IGNORABLES => Some("PANGO_SHOW_IGNORABLES")
      case _ => None
  extension (a: PangoShowFlags)
    inline def &(b: PangoShowFlags): PangoShowFlags = a & b
    inline def |(b: PangoShowFlags): PangoShowFlags = a | b
    inline def is(b: PangoShowFlags): Boolean = (a & b) == b

/**
 * PangoStretch: _STRETCH_ULTRA_CONDENSED: ultra condensed width _STRETCH_EXTRA_CONDENSED: extra condensed width _STRETCH_CONDENSED: condensed width _STRETCH_SEMI_CONDENSED: semi condensed width _STRETCH_NORMAL: the normal width _STRETCH_SEMI_EXPANDED: semi expanded width _STRETCH_EXPANDED: expanded width _STRETCH_EXTRA_EXPANDED: extra expanded width _STRETCH_ULTRA_EXPANDED: ultra expanded width

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
*/
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
    inline value match
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

/**
 * PangoStyle: _STYLE_NORMAL: the font is upright. _STYLE_OBLIQUE: the font is slanted, but in a roman style. _STYLE_ITALIC: the font is slanted in an italic style.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
*/
opaque type PangoStyle = CUnsignedInt
object PangoStyle extends CEnumU[PangoStyle]:
  given _tag: Tag[PangoStyle] = Tag.UInt
  inline def define(inline a: Long): PangoStyle = a.toUInt
  val PANGO_STYLE_NORMAL = define(0)
  val PANGO_STYLE_OBLIQUE = define(1)
  val PANGO_STYLE_ITALIC = define(2)
  inline def getName(inline value: PangoStyle): Option[String] =
    inline value match
      case PANGO_STYLE_NORMAL => Some("PANGO_STYLE_NORMAL")
      case PANGO_STYLE_OBLIQUE => Some("PANGO_STYLE_OBLIQUE")
      case PANGO_STYLE_ITALIC => Some("PANGO_STYLE_ITALIC")
      case _ => None
  extension (a: PangoStyle)
    inline def &(b: PangoStyle): PangoStyle = a & b
    inline def |(b: PangoStyle): PangoStyle = a | b
    inline def is(b: PangoStyle): Boolean = (a & b) == b

/**
 * PangoTabAlign: _TAB_LEFT: the text appears to the right of the tab stop position _TAB_RIGHT: the text appears to the left of the tab stop position until the available space is filled. Since: 1.50 _TAB_CENTER: the text is centered at the tab stop position until the available space is filled. Since: 1.50 _TAB_DECIMAL: text before the first occurrence of the decimal point character appears to the left of the tab stop position (until the available space is filled), the rest to the right. Since: 1.50

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-tabs.h
*/
opaque type PangoTabAlign = CUnsignedInt
object PangoTabAlign extends CEnumU[PangoTabAlign]:
  given _tag: Tag[PangoTabAlign] = Tag.UInt
  inline def define(inline a: Long): PangoTabAlign = a.toUInt
  val PANGO_TAB_LEFT = define(0)
  val PANGO_TAB_RIGHT = define(1)
  val PANGO_TAB_CENTER = define(2)
  val PANGO_TAB_DECIMAL = define(3)
  inline def getName(inline value: PangoTabAlign): Option[String] =
    inline value match
      case PANGO_TAB_LEFT => Some("PANGO_TAB_LEFT")
      case PANGO_TAB_RIGHT => Some("PANGO_TAB_RIGHT")
      case PANGO_TAB_CENTER => Some("PANGO_TAB_CENTER")
      case PANGO_TAB_DECIMAL => Some("PANGO_TAB_DECIMAL")
      case _ => None
  extension (a: PangoTabAlign)
    inline def &(b: PangoTabAlign): PangoTabAlign = a & b
    inline def |(b: PangoTabAlign): PangoTabAlign = a | b
    inline def is(b: PangoTabAlign): Boolean = (a & b) == b

/**
 * PangoTextTransform: _TEXT_TRANSFORM_NONE: Leave text unchanged _TEXT_TRANSFORM_LOWERCASE: Display letters and numbers as lowercase _TEXT_TRANSFORM_UPPERCASE: Display letters and numbers as uppercase _TEXT_TRANSFORM_CAPITALIZE: Display the first character of a word in titlecase

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoTextTransform = CUnsignedInt
object PangoTextTransform extends CEnumU[PangoTextTransform]:
  given _tag: Tag[PangoTextTransform] = Tag.UInt
  inline def define(inline a: Long): PangoTextTransform = a.toUInt
  val PANGO_TEXT_TRANSFORM_NONE = define(0)
  val PANGO_TEXT_TRANSFORM_LOWERCASE = define(1)
  val PANGO_TEXT_TRANSFORM_UPPERCASE = define(2)
  val PANGO_TEXT_TRANSFORM_CAPITALIZE = define(3)
  inline def getName(inline value: PangoTextTransform): Option[String] =
    inline value match
      case PANGO_TEXT_TRANSFORM_NONE => Some("PANGO_TEXT_TRANSFORM_NONE")
      case PANGO_TEXT_TRANSFORM_LOWERCASE => Some("PANGO_TEXT_TRANSFORM_LOWERCASE")
      case PANGO_TEXT_TRANSFORM_UPPERCASE => Some("PANGO_TEXT_TRANSFORM_UPPERCASE")
      case PANGO_TEXT_TRANSFORM_CAPITALIZE => Some("PANGO_TEXT_TRANSFORM_CAPITALIZE")
      case _ => None
  extension (a: PangoTextTransform)
    inline def &(b: PangoTextTransform): PangoTextTransform = a & b
    inline def |(b: PangoTextTransform): PangoTextTransform = a | b
    inline def is(b: PangoTextTransform): Boolean = (a & b) == b

/**
 * PangoUnderline: _UNDERLINE_NONE: no underline should be drawn _UNDERLINE_SINGLE: a single underline should be drawn _UNDERLINE_DOUBLE: a double underline should be drawn _UNDERLINE_LOW: a single underline should be drawn at a position beneath the ink extents of the text being underlined. This should be used only for underlining single characters, such as for keyboard accelerators. %PANGO_UNDERLINE_SINGLE should be used for extended portions of text. _UNDERLINE_ERROR: an underline indicating an error should be drawn below. The exact style of rendering is up to the `PangoRenderer` in use, but typical styles include wavy or dotted lines. This underline is typically used to indicate an error such as a possible mispelling; in some cases a contrasting color may automatically be used. This type of underlining is available since Pango 1.4. _UNDERLINE_SINGLE_LINE: Like _UNDERLINE_SINGLE, but drawn continuously across multiple runs. This type of underlining is available since Pango 1.46. _UNDERLINE_DOUBLE_LINE: Like _UNDERLINE_DOUBLE, but drawn continuously across multiple runs. This type of underlining is available since Pango 1.46. _UNDERLINE_ERROR_LINE: Like _UNDERLINE_ERROR, but drawn continuously across multiple runs. This type of underlining is available since Pango 1.46.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
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
    inline value match
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

/**
 * PangoVariant: _VARIANT_NORMAL: A normal font. _VARIANT_SMALL_CAPS: A font with the lower case characters replaced by smaller variants of the capital characters. _VARIANT_ALL_SMALL_CAPS: A font with all characters replaced by smaller variants of the capital characters. Since: 1.50 _VARIANT_PETITE_CAPS: A font with the lower case characters replaced by smaller variants of the capital characters. Petite Caps can be even smaller than Small Caps. Since: 1.50 _VARIANT_ALL_PETITE_CAPS: A font with all characters replaced by smaller variants of the capital characters. Petite Caps can be even smaller than Small Caps. Since: 1.50 _VARIANT_UNICASE: A font with the upper case characters replaced by smaller variants of the capital letters. Since: 1.50 _VARIANT_TITLE_CAPS: A font with capital letters that are more suitable for all-uppercase titles. Since: 1.50

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
*/
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
    inline value match
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

/**
 * PangoWeight: _WEIGHT_THIN: the thin weight (= 100) Since: 1.24 _WEIGHT_ULTRALIGHT: the ultralight weight (= 200) _WEIGHT_LIGHT: the light weight (= 300) _WEIGHT_SEMILIGHT: the semilight weight (= 350) Since: 1.36.7 _WEIGHT_BOOK: the book weight (= 380) Since: 1.24) _WEIGHT_NORMAL: the default weight (= 400) _WEIGHT_MEDIUM: the normal weight (= 500) Since: 1.24 _WEIGHT_SEMIBOLD: the semibold weight (= 600) _WEIGHT_BOLD: the bold weight (= 700) _WEIGHT_ULTRABOLD: the ultrabold weight (= 800) _WEIGHT_HEAVY: the heavy weight (= 900) _WEIGHT_ULTRAHEAVY: the ultraheavy weight (= 1000) Since: 1.24

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
*/
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
    inline value match
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

/**
 * PangoWrapMode: _WRAP_WORD: wrap lines at word boundaries. _WRAP_CHAR: wrap lines at character boundaries. _WRAP_WORD_CHAR: wrap lines at word boundaries, but fall back to character boundaries if there is not enough space for a full word.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
*/
opaque type PangoWrapMode = CUnsignedInt
object PangoWrapMode extends CEnumU[PangoWrapMode]:
  given _tag: Tag[PangoWrapMode] = Tag.UInt
  inline def define(inline a: Long): PangoWrapMode = a.toUInt
  val PANGO_WRAP_WORD = define(0)
  val PANGO_WRAP_CHAR = define(1)
  val PANGO_WRAP_WORD_CHAR = define(2)
  inline def getName(inline value: PangoWrapMode): Option[String] =
    inline value match
      case PANGO_WRAP_WORD => Some("PANGO_WRAP_WORD")
      case PANGO_WRAP_CHAR => Some("PANGO_WRAP_CHAR")
      case PANGO_WRAP_WORD_CHAR => Some("PANGO_WRAP_WORD_CHAR")
      case _ => None
  extension (a: PangoWrapMode)
    inline def &(b: PangoWrapMode): PangoWrapMode = a & b
    inline def |(b: PangoWrapMode): PangoWrapMode = a | b
    inline def is(b: PangoWrapMode): Boolean = (a & b) == b

/**
 * GTlsPasswordFlags: _TLS_PASSWORD_NONE: No flags _TLS_PASSWORD_RETRY: The password was wrong, and the user should retry. _TLS_PASSWORD_MANY_TRIES: Hint to the user that the password has been wrong many times, and the user may not have many chances left. _TLS_PASSWORD_FINAL_TRY: Hint to the user that this is the last try to get this password right. _TLS_PASSWORD_PKCS11_USER: For PKCS #11, the user PIN is required. Since: 2.70. _TLS_PASSWORD_PKCS11_SECURITY_OFFICER: For PKCS #11, the security officer PIN is required. Since: 2.70. _TLS_PASSWORD_PKCS11_CONTEXT_SPECIFIC: For PKCS #11, the context-specific PIN is required. Since: 2.70.

 * [bindgen] header: /usr/include/glib-2.0/gio/gioenums.h
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

/**
 * cairo_antialias_t: _ANTIALIAS_DEFAULT: Use the default antialiasing for the subsystem and target device, since 1.0 _ANTIALIAS_NONE: Use a bilevel alpha mask, since 1.0 _ANTIALIAS_GRAY: Perform single-color antialiasing (using shades of gray for black text on a white background, for example), since 1.0 _ANTIALIAS_SUBPIXEL: Perform antialiasing by taking advantage of the order of subpixel elements on devices such as LCD panels, since 1.0 _ANTIALIAS_FAST: Hint that the backend should perform some antialiasing but prefer speed over quality, since 1.12 _ANTIALIAS_GOOD: The backend should balance quality against performance, since 1.12 _ANTIALIAS_BEST: Hint that the backend should render at the highest quality, sacrificing speed if necessary, since 1.12

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
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
    inline value match
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

/**
 * cairo_content_t: _CONTENT_COLOR: The surface will hold color content only. (Since 1.0) _CONTENT_ALPHA: The surface will hold alpha content only. (Since 1.0) _CONTENT_COLOR_ALPHA: The surface will hold color and alpha content. (Since 1.0)

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type _cairo_content = CUnsignedInt
object _cairo_content extends CEnumU[_cairo_content]:
  given _tag: Tag[_cairo_content] = Tag.UInt
  inline def define(inline a: Long): _cairo_content = a.toUInt
  val CAIRO_CONTENT_COLOR = define(4096)
  val CAIRO_CONTENT_ALPHA = define(8192)
  val CAIRO_CONTENT_COLOR_ALPHA = define(12288)
  inline def getName(inline value: _cairo_content): Option[String] =
    inline value match
      case CAIRO_CONTENT_COLOR => Some("CAIRO_CONTENT_COLOR")
      case CAIRO_CONTENT_ALPHA => Some("CAIRO_CONTENT_ALPHA")
      case CAIRO_CONTENT_COLOR_ALPHA => Some("CAIRO_CONTENT_COLOR_ALPHA")
      case _ => None
  extension (a: _cairo_content)
    inline def &(b: _cairo_content): _cairo_content = a & b
    inline def |(b: _cairo_content): _cairo_content = a | b
    inline def is(b: _cairo_content): Boolean = (a & b) == b

/**
 * cairo_device_type_t: _DEVICE_TYPE_DRM: The device is of type Direct Render Manager, since 1.10 _DEVICE_TYPE_GL: The device is of type OpenGL, since 1.10 _DEVICE_TYPE_SCRIPT: The device is of type script, since 1.10 _DEVICE_TYPE_XCB: The device is of type xcb, since 1.10 _DEVICE_TYPE_XLIB: The device is of type xlib, since 1.10 _DEVICE_TYPE_XML: The device is of type XML, since 1.10 _DEVICE_TYPE_COGL: The device is of type cogl, since 1.12 _DEVICE_TYPE_WIN32: The device is of type win32, since 1.12 _DEVICE_TYPE_INVALID: The device is invalid, since 1.10

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
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
    inline value match
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

/**
 * cairo_extend_t: _EXTEND_NONE: pixels outside of the source pattern are fully transparent (Since 1.0) _EXTEND_REPEAT: the pattern is tiled by repeating (Since 1.0) _EXTEND_REFLECT: the pattern is tiled by reflecting at the edges (Since 1.0; but only implemented for surface patterns since 1.6) _EXTEND_PAD: pixels outside of the pattern copy the closest pixel from the source (Since 1.2; but only implemented for surface patterns since 1.6)

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type _cairo_extend = CUnsignedInt
object _cairo_extend extends CEnumU[_cairo_extend]:
  given _tag: Tag[_cairo_extend] = Tag.UInt
  inline def define(inline a: Long): _cairo_extend = a.toUInt
  val CAIRO_EXTEND_NONE = define(0)
  val CAIRO_EXTEND_REPEAT = define(1)
  val CAIRO_EXTEND_REFLECT = define(2)
  val CAIRO_EXTEND_PAD = define(3)
  inline def getName(inline value: _cairo_extend): Option[String] =
    inline value match
      case CAIRO_EXTEND_NONE => Some("CAIRO_EXTEND_NONE")
      case CAIRO_EXTEND_REPEAT => Some("CAIRO_EXTEND_REPEAT")
      case CAIRO_EXTEND_REFLECT => Some("CAIRO_EXTEND_REFLECT")
      case CAIRO_EXTEND_PAD => Some("CAIRO_EXTEND_PAD")
      case _ => None
  extension (a: _cairo_extend)
    inline def &(b: _cairo_extend): _cairo_extend = a & b
    inline def |(b: _cairo_extend): _cairo_extend = a | b
    inline def is(b: _cairo_extend): Boolean = (a & b) == b

/**
 * cairo_fill_rule_t: _FILL_RULE_WINDING: If the path crosses the ray from left-to-right, counts +1. If the path crosses the ray from right to left, counts -1. (Left and right are determined from the perspective of looking along the ray from the starting point.) If the total count is non-zero, the point will be filled. (Since 1.0) _FILL_RULE_EVEN_ODD: Counts the total number of intersections, without regard to the orientation of the contour. If the total number of intersections is odd, the point will be filled. (Since 1.0)

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type _cairo_fill_rule = CUnsignedInt
object _cairo_fill_rule extends CEnumU[_cairo_fill_rule]:
  given _tag: Tag[_cairo_fill_rule] = Tag.UInt
  inline def define(inline a: Long): _cairo_fill_rule = a.toUInt
  val CAIRO_FILL_RULE_WINDING = define(0)
  val CAIRO_FILL_RULE_EVEN_ODD = define(1)
  inline def getName(inline value: _cairo_fill_rule): Option[String] =
    inline value match
      case CAIRO_FILL_RULE_WINDING => Some("CAIRO_FILL_RULE_WINDING")
      case CAIRO_FILL_RULE_EVEN_ODD => Some("CAIRO_FILL_RULE_EVEN_ODD")
      case _ => None
  extension (a: _cairo_fill_rule)
    inline def &(b: _cairo_fill_rule): _cairo_fill_rule = a & b
    inline def |(b: _cairo_fill_rule): _cairo_fill_rule = a | b
    inline def is(b: _cairo_fill_rule): Boolean = (a & b) == b

/**
 * cairo_filter_t: _FILTER_FAST: A high-performance filter, with quality similar to %CAIRO_FILTER_NEAREST (Since 1.0) _FILTER_GOOD: A reasonable-performance filter, with quality similar to %CAIRO_FILTER_BILINEAR (Since 1.0) _FILTER_BEST: The highest-quality available, performance may not be suitable for interactive use. (Since 1.0) _FILTER_NEAREST: Nearest-neighbor filtering (Since 1.0) _FILTER_BILINEAR: Linear interpolation in two dimensions (Since 1.0) _FILTER_GAUSSIAN: This filter value is currently unimplemented, and should not be used in current code. (Since 1.0)

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
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
    inline value match
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

/**
 * cairo_font_slant_t: _FONT_SLANT_NORMAL: Upright font style, since 1.0 _FONT_SLANT_ITALIC: Italic font style, since 1.0 _FONT_SLANT_OBLIQUE: Oblique font style, since 1.0

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type _cairo_font_slant = CUnsignedInt
object _cairo_font_slant extends CEnumU[_cairo_font_slant]:
  given _tag: Tag[_cairo_font_slant] = Tag.UInt
  inline def define(inline a: Long): _cairo_font_slant = a.toUInt
  val CAIRO_FONT_SLANT_NORMAL = define(0)
  val CAIRO_FONT_SLANT_ITALIC = define(1)
  val CAIRO_FONT_SLANT_OBLIQUE = define(2)
  inline def getName(inline value: _cairo_font_slant): Option[String] =
    inline value match
      case CAIRO_FONT_SLANT_NORMAL => Some("CAIRO_FONT_SLANT_NORMAL")
      case CAIRO_FONT_SLANT_ITALIC => Some("CAIRO_FONT_SLANT_ITALIC")
      case CAIRO_FONT_SLANT_OBLIQUE => Some("CAIRO_FONT_SLANT_OBLIQUE")
      case _ => None
  extension (a: _cairo_font_slant)
    inline def &(b: _cairo_font_slant): _cairo_font_slant = a & b
    inline def |(b: _cairo_font_slant): _cairo_font_slant = a | b
    inline def is(b: _cairo_font_slant): Boolean = (a & b) == b

/**
 * cairo_font_type_t: _FONT_TYPE_TOY: The font was created using cairo's toy font api (Since: 1.2) _FONT_TYPE_FT: The font is of type FreeType (Since: 1.2) _FONT_TYPE_WIN32: The font is of type Win32 (Since: 1.2) _FONT_TYPE_QUARTZ: The font is of type Quartz (Since: 1.6, in 1.2 and 1.4 it was named CAIRO_FONT_TYPE_ATSUI) _FONT_TYPE_USER: The font was create using cairo's user font api (Since: 1.8)

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
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
    inline value match
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

/**
 * cairo_font_weight_t: _FONT_WEIGHT_NORMAL: Normal font weight, since 1.0 _FONT_WEIGHT_BOLD: Bold font weight, since 1.0

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type _cairo_font_weight = CUnsignedInt
object _cairo_font_weight extends CEnumU[_cairo_font_weight]:
  given _tag: Tag[_cairo_font_weight] = Tag.UInt
  inline def define(inline a: Long): _cairo_font_weight = a.toUInt
  val CAIRO_FONT_WEIGHT_NORMAL = define(0)
  val CAIRO_FONT_WEIGHT_BOLD = define(1)
  inline def getName(inline value: _cairo_font_weight): Option[String] =
    inline value match
      case CAIRO_FONT_WEIGHT_NORMAL => Some("CAIRO_FONT_WEIGHT_NORMAL")
      case CAIRO_FONT_WEIGHT_BOLD => Some("CAIRO_FONT_WEIGHT_BOLD")
      case _ => None
  extension (a: _cairo_font_weight)
    inline def &(b: _cairo_font_weight): _cairo_font_weight = a & b
    inline def |(b: _cairo_font_weight): _cairo_font_weight = a | b
    inline def is(b: _cairo_font_weight): Boolean = (a & b) == b

/**
 * cairo_format_t: _FORMAT_INVALID: no such format exists or is supported. _FORMAT_ARGB32: each pixel is a 32-bit quantity, with alpha in the upper 8 bits, then red, then green, then blue. The 32-bit quantities are stored native-endian. Pre-multiplied alpha is used. (That is, 50% transparent red is 0x80800000, not 0x80ff0000.) (Since 1.0) _FORMAT_RGB24: each pixel is a 32-bit quantity, with the upper 8 bits unused. Red, Green, and Blue are stored in the remaining 24 bits in that order. (Since 1.0) _FORMAT_A8: each pixel is a 8-bit quantity holding an alpha value. (Since 1.0) _FORMAT_A1: each pixel is a 1-bit quantity holding an alpha value. Pixels are packed together into 32-bit quantities. The ordering of the bits matches the endianness of the platform. On a big-endian machine, the first pixel is in the uppermost bit, on a little-endian machine the first pixel is in the least-significant bit. (Since 1.0) _FORMAT_RGB16_565: each pixel is a 16-bit quantity with red in the upper 5 bits, then green in the middle 6 bits, and blue in the lower 5 bits. (Since 1.2) _FORMAT_RGB30: like RGB24 but with 10bpc. (Since 1.12)

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
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
    inline value match
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

/**
 * cairo_hint_metrics_t: _HINT_METRICS_DEFAULT: Hint metrics in the default manner for the font backend and target device, since 1.0 _HINT_METRICS_OFF: Do not hint font metrics, since 1.0 _HINT_METRICS_ON: Hint font metrics, since 1.0

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type _cairo_hint_metrics = CUnsignedInt
object _cairo_hint_metrics extends CEnumU[_cairo_hint_metrics]:
  given _tag: Tag[_cairo_hint_metrics] = Tag.UInt
  inline def define(inline a: Long): _cairo_hint_metrics = a.toUInt
  val CAIRO_HINT_METRICS_DEFAULT = define(0)
  val CAIRO_HINT_METRICS_OFF = define(1)
  val CAIRO_HINT_METRICS_ON = define(2)
  inline def getName(inline value: _cairo_hint_metrics): Option[String] =
    inline value match
      case CAIRO_HINT_METRICS_DEFAULT => Some("CAIRO_HINT_METRICS_DEFAULT")
      case CAIRO_HINT_METRICS_OFF => Some("CAIRO_HINT_METRICS_OFF")
      case CAIRO_HINT_METRICS_ON => Some("CAIRO_HINT_METRICS_ON")
      case _ => None
  extension (a: _cairo_hint_metrics)
    inline def &(b: _cairo_hint_metrics): _cairo_hint_metrics = a & b
    inline def |(b: _cairo_hint_metrics): _cairo_hint_metrics = a | b
    inline def is(b: _cairo_hint_metrics): Boolean = (a & b) == b

/**
 * cairo_hint_style_t: _HINT_STYLE_DEFAULT: Use the default hint style for font backend and target device, since 1.0 _HINT_STYLE_NONE: Do not hint outlines, since 1.0 _HINT_STYLE_SLIGHT: Hint outlines slightly to improve contrast while retaining good fidelity to the original shapes, since 1.0 _HINT_STYLE_MEDIUM: Hint outlines with medium strength giving a compromise between fidelity to the original shapes and contrast, since 1.0 _HINT_STYLE_FULL: Hint outlines to maximize contrast, since 1.0

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
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
    inline value match
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

/**
 * cairo_line_cap_t: _LINE_CAP_BUTT: start(stop) the line exactly at the start(end) point (Since 1.0) _LINE_CAP_ROUND: use a round ending, the center of the circle is the end point (Since 1.0) _LINE_CAP_SQUARE: use squared ending, the center of the square is the end point (Since 1.0)

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type _cairo_line_cap = CUnsignedInt
object _cairo_line_cap extends CEnumU[_cairo_line_cap]:
  given _tag: Tag[_cairo_line_cap] = Tag.UInt
  inline def define(inline a: Long): _cairo_line_cap = a.toUInt
  val CAIRO_LINE_CAP_BUTT = define(0)
  val CAIRO_LINE_CAP_ROUND = define(1)
  val CAIRO_LINE_CAP_SQUARE = define(2)
  inline def getName(inline value: _cairo_line_cap): Option[String] =
    inline value match
      case CAIRO_LINE_CAP_BUTT => Some("CAIRO_LINE_CAP_BUTT")
      case CAIRO_LINE_CAP_ROUND => Some("CAIRO_LINE_CAP_ROUND")
      case CAIRO_LINE_CAP_SQUARE => Some("CAIRO_LINE_CAP_SQUARE")
      case _ => None
  extension (a: _cairo_line_cap)
    inline def &(b: _cairo_line_cap): _cairo_line_cap = a & b
    inline def |(b: _cairo_line_cap): _cairo_line_cap = a | b
    inline def is(b: _cairo_line_cap): Boolean = (a & b) == b

/**
 * cairo_line_join_t: _LINE_JOIN_MITER: use a sharp (angled) corner, see cairo_set_miter_limit() (Since 1.0) _LINE_JOIN_ROUND: use a rounded join, the center of the circle is the joint point (Since 1.0) _LINE_JOIN_BEVEL: use a cut-off join, the join is cut off at half the line width from the joint point (Since 1.0)

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type _cairo_line_join = CUnsignedInt
object _cairo_line_join extends CEnumU[_cairo_line_join]:
  given _tag: Tag[_cairo_line_join] = Tag.UInt
  inline def define(inline a: Long): _cairo_line_join = a.toUInt
  val CAIRO_LINE_JOIN_MITER = define(0)
  val CAIRO_LINE_JOIN_ROUND = define(1)
  val CAIRO_LINE_JOIN_BEVEL = define(2)
  inline def getName(inline value: _cairo_line_join): Option[String] =
    inline value match
      case CAIRO_LINE_JOIN_MITER => Some("CAIRO_LINE_JOIN_MITER")
      case CAIRO_LINE_JOIN_ROUND => Some("CAIRO_LINE_JOIN_ROUND")
      case CAIRO_LINE_JOIN_BEVEL => Some("CAIRO_LINE_JOIN_BEVEL")
      case _ => None
  extension (a: _cairo_line_join)
    inline def &(b: _cairo_line_join): _cairo_line_join = a & b
    inline def |(b: _cairo_line_join): _cairo_line_join = a | b
    inline def is(b: _cairo_line_join): Boolean = (a & b) == b

/**
 * cairo_operator_t: _OPERATOR_CLEAR: clear destination layer (bounded) (Since 1.0) _OPERATOR_SOURCE: replace destination layer (bounded) (Since 1.0) _OPERATOR_OVER: draw source layer on top of destination layer (bounded) (Since 1.0) _OPERATOR_IN: draw source where there was destination content (unbounded) (Since 1.0) _OPERATOR_OUT: draw source where there was no destination content (unbounded) (Since 1.0) _OPERATOR_ATOP: draw source on top of destination content and only there (Since 1.0) _OPERATOR_DEST: ignore the source (Since 1.0) _OPERATOR_DEST_OVER: draw destination on top of source (Since 1.0) _OPERATOR_DEST_IN: leave destination only where there was source content (unbounded) (Since 1.0) _OPERATOR_DEST_OUT: leave destination only where there was no source content (Since 1.0) _OPERATOR_DEST_ATOP: leave destination on top of source content and only there (unbounded) (Since 1.0) _OPERATOR_XOR: source and destination are shown where there is only one of them (Since 1.0) _OPERATOR_ADD: source and destination layers are accumulated (Since 1.0) _OPERATOR_SATURATE: like over, but assuming source and dest are disjoint geometries (Since 1.0) _OPERATOR_MULTIPLY: source and destination layers are multiplied. This causes the result to be at least as dark as the darker inputs. (Since 1.10) _OPERATOR_SCREEN: source and destination are complemented and multiplied. This causes the result to be at least as light as the lighter inputs. (Since 1.10) _OPERATOR_OVERLAY: multiplies or screens, depending on the lightness of the destination color. (Since 1.10) _OPERATOR_DARKEN: replaces the destination with the source if it is darker, otherwise keeps the source. (Since 1.10) _OPERATOR_LIGHTEN: replaces the destination with the source if it is lighter, otherwise keeps the source. (Since 1.10) _OPERATOR_COLOR_DODGE: brightens the destination color to reflect the source color. (Since 1.10) _OPERATOR_COLOR_BURN: darkens the destination color to reflect the source color. (Since 1.10) _OPERATOR_HARD_LIGHT: Multiplies or screens, dependent on source color. (Since 1.10) _OPERATOR_SOFT_LIGHT: Darkens or lightens, dependent on source color. (Since 1.10) _OPERATOR_DIFFERENCE: Takes the difference of the source and destination color. (Since 1.10) _OPERATOR_EXCLUSION: Produces an effect similar to difference, but with lower contrast. (Since 1.10) _OPERATOR_HSL_HUE: Creates a color with the hue of the source and the saturation and luminosity of the target. (Since 1.10) _OPERATOR_HSL_SATURATION: Creates a color with the saturation of the source and the hue and luminosity of the target. Painting with this mode onto a gray area produces no change. (Since 1.10) _OPERATOR_HSL_COLOR: Creates a color with the hue and saturation of the source and the luminosity of the target. This preserves the gray levels of the target and is useful for coloring monochrome images or tinting color images. (Since 1.10) _OPERATOR_HSL_LUMINOSITY: Creates a color with the luminosity of the source and the hue and saturation of the target. This produces an inverse effect to _OPERATOR_HSL_COLOR. (Since 1.10)

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
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
    inline value match
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

/**
 * cairo_path_data_type_t: _PATH_MOVE_TO: A move-to operation, since 1.0 _PATH_LINE_TO: A line-to operation, since 1.0 _PATH_CURVE_TO: A curve-to operation, since 1.0 _PATH_CLOSE_PATH: A close-path operation, since 1.0

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type _cairo_path_data_type = CUnsignedInt
object _cairo_path_data_type extends CEnumU[_cairo_path_data_type]:
  given _tag: Tag[_cairo_path_data_type] = Tag.UInt
  inline def define(inline a: Long): _cairo_path_data_type = a.toUInt
  val CAIRO_PATH_MOVE_TO = define(0)
  val CAIRO_PATH_LINE_TO = define(1)
  val CAIRO_PATH_CURVE_TO = define(2)
  val CAIRO_PATH_CLOSE_PATH = define(3)
  inline def getName(inline value: _cairo_path_data_type): Option[String] =
    inline value match
      case CAIRO_PATH_MOVE_TO => Some("CAIRO_PATH_MOVE_TO")
      case CAIRO_PATH_LINE_TO => Some("CAIRO_PATH_LINE_TO")
      case CAIRO_PATH_CURVE_TO => Some("CAIRO_PATH_CURVE_TO")
      case CAIRO_PATH_CLOSE_PATH => Some("CAIRO_PATH_CLOSE_PATH")
      case _ => None
  extension (a: _cairo_path_data_type)
    inline def &(b: _cairo_path_data_type): _cairo_path_data_type = a & b
    inline def |(b: _cairo_path_data_type): _cairo_path_data_type = a | b
    inline def is(b: _cairo_path_data_type): Boolean = (a & b) == b

/**
 * cairo_pattern_type_t: _PATTERN_TYPE_SOLID: The pattern is a solid (uniform) color. It may be opaque or translucent, since 1.2. _PATTERN_TYPE_SURFACE: The pattern is a based on a surface (an image), since 1.2. _PATTERN_TYPE_LINEAR: The pattern is a linear gradient, since 1.2. _PATTERN_TYPE_RADIAL: The pattern is a radial gradient, since 1.2. _PATTERN_TYPE_MESH: The pattern is a mesh, since 1.12. _PATTERN_TYPE_RASTER_SOURCE: The pattern is a user pattern providing raster data, since 1.12.

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
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
    inline value match
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

/**
 * cairo_region_overlap_t: _REGION_OVERLAP_IN: The contents are entirely inside the region. (Since 1.10) _REGION_OVERLAP_OUT: The contents are entirely outside the region. (Since 1.10) _REGION_OVERLAP_PART: The contents are partially inside and partially outside the region. (Since 1.10)

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type _cairo_region_overlap = CUnsignedInt
object _cairo_region_overlap extends CEnumU[_cairo_region_overlap]:
  given _tag: Tag[_cairo_region_overlap] = Tag.UInt
  inline def define(inline a: Long): _cairo_region_overlap = a.toUInt
  val CAIRO_REGION_OVERLAP_IN = define(0)
  val CAIRO_REGION_OVERLAP_OUT = define(1)
  val CAIRO_REGION_OVERLAP_PART = define(2)
  inline def getName(inline value: _cairo_region_overlap): Option[String] =
    inline value match
      case CAIRO_REGION_OVERLAP_IN => Some("CAIRO_REGION_OVERLAP_IN")
      case CAIRO_REGION_OVERLAP_OUT => Some("CAIRO_REGION_OVERLAP_OUT")
      case CAIRO_REGION_OVERLAP_PART => Some("CAIRO_REGION_OVERLAP_PART")
      case _ => None
  extension (a: _cairo_region_overlap)
    inline def &(b: _cairo_region_overlap): _cairo_region_overlap = a & b
    inline def |(b: _cairo_region_overlap): _cairo_region_overlap = a | b
    inline def is(b: _cairo_region_overlap): Boolean = (a & b) == b

/**
 * cairo_status_t: _STATUS_SUCCESS: no error has occurred (Since 1.0) _STATUS_NO_MEMORY: out of memory (Since 1.0) _STATUS_INVALID_RESTORE: cairo_restore() called without matching cairo_save() (Since 1.0) _STATUS_INVALID_POP_GROUP: no saved group to pop, i.e. cairo_pop_group() without matching cairo_push_group() (Since 1.0) _STATUS_NO_CURRENT_POINT: no current point defined (Since 1.0) _STATUS_INVALID_MATRIX: invalid matrix (not invertible) (Since 1.0) _STATUS_INVALID_STATUS: invalid value for an input #cairo_status_t (Since 1.0) _STATUS_NULL_POINTER: %NULL pointer (Since 1.0) _STATUS_INVALID_STRING: input string not valid UTF-8 (Since 1.0) _STATUS_INVALID_PATH_DATA: input path data not valid (Since 1.0) _STATUS_READ_ERROR: error while reading from input stream (Since 1.0) _STATUS_WRITE_ERROR: error while writing to output stream (Since 1.0) _STATUS_SURFACE_FINISHED: target surface has been finished (Since 1.0) _STATUS_SURFACE_TYPE_MISMATCH: the surface type is not appropriate for the operation (Since 1.0) _STATUS_PATTERN_TYPE_MISMATCH: the pattern type is not appropriate for the operation (Since 1.0) _STATUS_INVALID_CONTENT: invalid value for an input #cairo_content_t (Since 1.0) _STATUS_INVALID_FORMAT: invalid value for an input #cairo_format_t (Since 1.0) _STATUS_INVALID_VISUAL: invalid value for an input Visual* (Since 1.0) _STATUS_FILE_NOT_FOUND: file not found (Since 1.0) _STATUS_INVALID_DASH: invalid value for a dash setting (Since 1.0) _STATUS_INVALID_DSC_COMMENT: invalid value for a DSC comment (Since 1.2) _STATUS_INVALID_INDEX: invalid index passed to getter (Since 1.4) _STATUS_CLIP_NOT_REPRESENTABLE: clip region not representable in desired format (Since 1.4) _STATUS_TEMP_FILE_ERROR: error creating or writing to a temporary file (Since 1.6) _STATUS_INVALID_STRIDE: invalid value for stride (Since 1.6) _STATUS_FONT_TYPE_MISMATCH: the font type is not appropriate for the operation (Since 1.8) _STATUS_USER_FONT_IMMUTABLE: the user-font is immutable (Since 1.8) _STATUS_USER_FONT_ERROR: error occurred in a user-font callback function (Since 1.8) _STATUS_NEGATIVE_COUNT: negative number used where it is not allowed (Since 1.8) _STATUS_INVALID_CLUSTERS: input clusters do not represent the accompanying text and glyph array (Since 1.8) _STATUS_INVALID_SLANT: invalid value for an input #cairo_font_slant_t (Since 1.8) _STATUS_INVALID_WEIGHT: invalid value for an input #cairo_font_weight_t (Since 1.8) _STATUS_INVALID_SIZE: invalid value (typically too big) for the size of the input (surface, pattern, etc.) (Since 1.10) _STATUS_USER_FONT_NOT_IMPLEMENTED: user-font method not implemented (Since 1.10) _STATUS_DEVICE_TYPE_MISMATCH: the device type is not appropriate for the operation (Since 1.10) _STATUS_DEVICE_ERROR: an operation to the device caused an unspecified error (Since 1.10) _STATUS_INVALID_MESH_CONSTRUCTION: a mesh pattern construction operation was used outside of a cairo_mesh_pattern_begin_patch()/cairo_mesh_pattern_end_patch() pair (Since 1.12) _STATUS_DEVICE_FINISHED: target device has been finished (Since 1.12) _STATUS_JBIG2_GLOBAL_MISSING: %CAIRO_MIME_TYPE_JBIG2_GLOBAL_ID has been used on at least one image but no image provided %CAIRO_MIME_TYPE_JBIG2_GLOBAL (Since 1.14) _STATUS_PNG_ERROR: error occurred in libpng while reading from or writing to a PNG file (Since 1.16) _STATUS_FREETYPE_ERROR: error occurred in libfreetype (Since 1.16) _STATUS_WIN32_GDI_ERROR: error occurred in the Windows Graphics Device Interface (Since 1.16) _STATUS_TAG_ERROR: invalid tag name, attributes, or nesting (Since 1.16) _STATUS_LAST_STATUS: this is a special value indicating the number of status values defined in this enumeration. When using this value, note that the version of cairo at run-time may have additional status values defined than the value of this symbol at compile-time. (Since 1.10)

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
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
    inline value match
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

/**
 * cairo_subpixel_order_t: _SUBPIXEL_ORDER_DEFAULT: Use the default subpixel order for for the target device, since 1.0 _SUBPIXEL_ORDER_RGB: Subpixel elements are arranged horizontally with red at the left, since 1.0 _SUBPIXEL_ORDER_BGR: Subpixel elements are arranged horizontally with blue at the left, since 1.0 _SUBPIXEL_ORDER_VRGB: Subpixel elements are arranged vertically with red at the top, since 1.0 _SUBPIXEL_ORDER_VBGR: Subpixel elements are arranged vertically with blue at the top, since 1.0

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
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
    inline value match
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

/**
 * cairo_surface_type_t: _SURFACE_TYPE_IMAGE: The surface is of type image, since 1.2 _SURFACE_TYPE_PDF: The surface is of type pdf, since 1.2 _SURFACE_TYPE_PS: The surface is of type ps, since 1.2 _SURFACE_TYPE_XLIB: The surface is of type xlib, since 1.2 _SURFACE_TYPE_XCB: The surface is of type xcb, since 1.2 _SURFACE_TYPE_GLITZ: The surface is of type glitz, since 1.2 _SURFACE_TYPE_QUARTZ: The surface is of type quartz, since 1.2 _SURFACE_TYPE_WIN32: The surface is of type win32, since 1.2 _SURFACE_TYPE_BEOS: The surface is of type beos, since 1.2 _SURFACE_TYPE_DIRECTFB: The surface is of type directfb, since 1.2 _SURFACE_TYPE_SVG: The surface is of type svg, since 1.2 _SURFACE_TYPE_OS2: The surface is of type os2, since 1.4 _SURFACE_TYPE_WIN32_PRINTING: The surface is a win32 printing surface, since 1.6 _SURFACE_TYPE_QUARTZ_IMAGE: The surface is of type quartz_image, since 1.6 _SURFACE_TYPE_SCRIPT: The surface is of type script, since 1.10 _SURFACE_TYPE_QT: The surface is of type Qt, since 1.10 _SURFACE_TYPE_RECORDING: The surface is of type recording, since 1.10 _SURFACE_TYPE_VG: The surface is a OpenVG surface, since 1.10 _SURFACE_TYPE_GL: The surface is of type OpenGL, since 1.10 _SURFACE_TYPE_DRM: The surface is of type Direct Render Manager, since 1.10 _SURFACE_TYPE_TEE: The surface is of type 'tee' (a multiplexing surface), since 1.10 _SURFACE_TYPE_XML: The surface is of type XML (for debugging), since 1.10 _SURFACE_TYPE_SUBSURFACE: The surface is a subsurface created with cairo_surface_create_for_rectangle(), since 1.10 _SURFACE_TYPE_COGL: This surface is of type Cogl, since 1.12

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
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
    inline value match
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

/**
 * cairo_text_cluster_flags_t: _TEXT_CLUSTER_FLAG_BACKWARD: The clusters in the cluster array map to glyphs in the glyph array from end to start. (Since 1.8)

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type _cairo_text_cluster_flags = CUnsignedInt
object _cairo_text_cluster_flags extends CEnumU[_cairo_text_cluster_flags]:
  given _tag: Tag[_cairo_text_cluster_flags] = Tag.UInt
  inline def define(inline a: Long): _cairo_text_cluster_flags = a.toUInt
  val CAIRO_TEXT_CLUSTER_FLAG_BACKWARD = define(1)
  inline def getName(inline value: _cairo_text_cluster_flags): Option[String] =
    inline value match
      case CAIRO_TEXT_CLUSTER_FLAG_BACKWARD => Some("CAIRO_TEXT_CLUSTER_FLAG_BACKWARD")
      case _ => None
  extension (a: _cairo_text_cluster_flags)
    inline def &(b: _cairo_text_cluster_flags): _cairo_text_cluster_flags = a & b
    inline def |(b: _cairo_text_cluster_flags): _cairo_text_cluster_flags = a | b
    inline def is(b: _cairo_text_cluster_flags): Boolean = (a & b) == b

/**
 * cairo_surface_observer_mode_t: _SURFACE_OBSERVER_NORMAL: no recording is done _SURFACE_OBSERVER_RECORD_OPERATIONS: operations are recorded

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type cairo_surface_observer_mode_t = CUnsignedInt
object cairo_surface_observer_mode_t extends CEnumU[cairo_surface_observer_mode_t]:
  given _tag: Tag[cairo_surface_observer_mode_t] = Tag.UInt
  inline def define(inline a: Long): cairo_surface_observer_mode_t = a.toUInt
  val CAIRO_SURFACE_OBSERVER_NORMAL = define(0)
  val CAIRO_SURFACE_OBSERVER_RECORD_OPERATIONS = define(1)
  inline def getName(inline value: cairo_surface_observer_mode_t): Option[String] =
    inline value match
      case CAIRO_SURFACE_OBSERVER_NORMAL => Some("CAIRO_SURFACE_OBSERVER_NORMAL")
      case CAIRO_SURFACE_OBSERVER_RECORD_OPERATIONS => Some("CAIRO_SURFACE_OBSERVER_RECORD_OPERATIONS")
      case _ => None
  extension (a: cairo_surface_observer_mode_t)
    inline def &(b: cairo_surface_observer_mode_t): cairo_surface_observer_mode_t = a & b
    inline def |(b: cairo_surface_observer_mode_t): cairo_surface_observer_mode_t = a | b
    inline def is(b: cairo_surface_observer_mode_t): Boolean = (a & b) == b

/**
 * graphene_euler_order_t: _EULER_ORDER_DEFAULT: Rotate in the default order; the default order is one of the following enumeration values _EULER_ORDER_XYZ: Rotate in the X, Y, and Z order. Deprecated in Graphene 1.10, it's an alias for %GRAPHENE_EULER_ORDER_SXYZ _EULER_ORDER_YZX: Rotate in the Y, Z, and X order. Deprecated in Graphene 1.10, it's an alias for %GRAPHENE_EULER_ORDER_SYZX _EULER_ORDER_ZXY: Rotate in the Z, X, and Y order. Deprecated in Graphene 1.10, it's an alias for %GRAPHENE_EULER_ORDER_SZXY _EULER_ORDER_XZY: Rotate in the X, Z, and Y order. Deprecated in Graphene 1.10, it's an alias for %GRAPHENE_EULER_ORDER_SXZY _EULER_ORDER_YXZ: Rotate in the Y, X, and Z order. Deprecated in Graphene 1.10, it's an alias for %GRAPHENE_EULER_ORDER_SYXZ _EULER_ORDER_ZYX: Rotate in the Z, Y, and X order. Deprecated in Graphene 1.10, it's an alias for %GRAPHENE_EULER_ORDER_SZYX _EULER_ORDER_SXYZ: Defines a static rotation along the X, Y, and Z axes (Since: 1.10) _EULER_ORDER_SXYX: Defines a static rotation along the X, Y, and X axes (Since: 1.10) _EULER_ORDER_SXZY: Defines a static rotation along the X, Z, and Y axes (Since: 1.10) _EULER_ORDER_SXZX: Defines a static rotation along the X, Z, and X axes (Since: 1.10) _EULER_ORDER_SYZX: Defines a static rotation along the Y, Z, and X axes (Since: 1.10) _EULER_ORDER_SYZY: Defines a static rotation along the Y, Z, and Y axes (Since: 1.10) _EULER_ORDER_SYXZ: Defines a static rotation along the Y, X, and Z axes (Since: 1.10) _EULER_ORDER_SYXY: Defines a static rotation along the Y, X, and Y axes (Since: 1.10) _EULER_ORDER_SZXY: Defines a static rotation along the Z, X, and Y axes (Since: 1.10) _EULER_ORDER_SZXZ: Defines a static rotation along the Z, X, and Z axes (Since: 1.10) _EULER_ORDER_SZYX: Defines a static rotation along the Z, Y, and X axes (Since: 1.10) _EULER_ORDER_SZYZ: Defines a static rotation along the Z, Y, and Z axes (Since: 1.10) _EULER_ORDER_RZYX: Defines a relative rotation along the Z, Y, and X axes (Since: 1.10) _EULER_ORDER_RXYX: Defines a relative rotation along the X, Y, and X axes (Since: 1.10) _EULER_ORDER_RYZX: Defines a relative rotation along the Y, Z, and X axes (Since: 1.10) _EULER_ORDER_RXZX: Defines a relative rotation along the X, Z, and X axes (Since: 1.10) _EULER_ORDER_RXZY: Defines a relative rotation along the X, Z, and Y axes (Since: 1.10) _EULER_ORDER_RYZY: Defines a relative rotation along the Y, Z, and Y axes (Since: 1.10) _EULER_ORDER_RZXY: Defines a relative rotation along the Z, X, and Y axes (Since: 1.10) _EULER_ORDER_RYXY: Defines a relative rotation along the Y, X, and Y axes (Since: 1.10) _EULER_ORDER_RYXZ: Defines a relative rotation along the Y, X, and Z axes (Since: 1.10) _EULER_ORDER_RZXZ: Defines a relative rotation along the Z, X, and Z axes (Since: 1.10) _EULER_ORDER_RXYZ: Defines a relative rotation along the X, Y, and Z axes (Since: 1.10) _EULER_ORDER_RZYZ: Defines a relative rotation along the Z, Y, and Z axes (Since: 1.10)

 * [bindgen] header: /usr/include/graphene-1.0/graphene-euler.h
*/
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
    inline value match
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

/**
 * graphene_ray_intersection_kind_t: _RAY_INTERSECTION_KIND_NONE: No intersection _RAY_INTERSECTION_KIND_ENTER: The ray is entering the intersected object _RAY_INTERSECTION_KIND_LEAVE: The ray is leaving the intersected object

 * [bindgen] header: /usr/include/graphene-1.0/graphene-ray.h
*/
opaque type graphene_ray_intersection_kind_t = CUnsignedInt
object graphene_ray_intersection_kind_t extends CEnumU[graphene_ray_intersection_kind_t]:
  given _tag: Tag[graphene_ray_intersection_kind_t] = Tag.UInt
  inline def define(inline a: Long): graphene_ray_intersection_kind_t = a.toUInt
  val GRAPHENE_RAY_INTERSECTION_KIND_NONE = define(0)
  val GRAPHENE_RAY_INTERSECTION_KIND_ENTER = define(1)
  val GRAPHENE_RAY_INTERSECTION_KIND_LEAVE = define(2)
  inline def getName(inline value: graphene_ray_intersection_kind_t): Option[String] =
    inline value match
      case GRAPHENE_RAY_INTERSECTION_KIND_NONE => Some("GRAPHENE_RAY_INTERSECTION_KIND_NONE")
      case GRAPHENE_RAY_INTERSECTION_KIND_ENTER => Some("GRAPHENE_RAY_INTERSECTION_KIND_ENTER")
      case GRAPHENE_RAY_INTERSECTION_KIND_LEAVE => Some("GRAPHENE_RAY_INTERSECTION_KIND_LEAVE")
      case _ => None
  extension (a: graphene_ray_intersection_kind_t)
    inline def &(b: graphene_ray_intersection_kind_t): graphene_ray_intersection_kind_t = a & b
    inline def |(b: graphene_ray_intersection_kind_t): graphene_ray_intersection_kind_t = a | b
    inline def is(b: graphene_ray_intersection_kind_t): Boolean = (a & b) == b

/**
 * hb_buffer_cluster_level_t: _BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES: Return cluster values grouped by graphemes into monotone order. _BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS: Return cluster values grouped into monotone order. _BUFFER_CLUSTER_LEVEL_CHARACTERS: Don't group cluster values. _BUFFER_CLUSTER_LEVEL_DEFAULT: Default cluster level, equal to _BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES.

 * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
*/
opaque type hb_buffer_cluster_level_t = CUnsignedInt
object hb_buffer_cluster_level_t extends CEnumU[hb_buffer_cluster_level_t]:
  given _tag: Tag[hb_buffer_cluster_level_t] = Tag.UInt
  inline def define(inline a: Long): hb_buffer_cluster_level_t = a.toUInt
  val HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES = define(0)
  val HB_BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS = define(1)
  val HB_BUFFER_CLUSTER_LEVEL_CHARACTERS = define(2)
  val HB_BUFFER_CLUSTER_LEVEL_DEFAULT = define(0)
  inline def getName(inline value: hb_buffer_cluster_level_t): Option[String] =
    inline value match
      case HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES => Some("HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES")
      case HB_BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS => Some("HB_BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS")
      case HB_BUFFER_CLUSTER_LEVEL_CHARACTERS => Some("HB_BUFFER_CLUSTER_LEVEL_CHARACTERS")
      case HB_BUFFER_CLUSTER_LEVEL_DEFAULT => Some("HB_BUFFER_CLUSTER_LEVEL_DEFAULT")
      case _ => None
  extension (a: hb_buffer_cluster_level_t)
    inline def &(b: hb_buffer_cluster_level_t): hb_buffer_cluster_level_t = a & b
    inline def |(b: hb_buffer_cluster_level_t): hb_buffer_cluster_level_t = a | b
    inline def is(b: hb_buffer_cluster_level_t): Boolean = (a & b) == b

/**
 * hb_buffer_content_type_t: _BUFFER_CONTENT_TYPE_INVALID: Initial value for new buffer. _BUFFER_CONTENT_TYPE_UNICODE: The buffer contains input characters (before shaping). _BUFFER_CONTENT_TYPE_GLYPHS: The buffer contains output glyphs (after shaping).

 * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
*/
opaque type hb_buffer_content_type_t = CUnsignedInt
object hb_buffer_content_type_t extends CEnumU[hb_buffer_content_type_t]:
  given _tag: Tag[hb_buffer_content_type_t] = Tag.UInt
  inline def define(inline a: Long): hb_buffer_content_type_t = a.toUInt
  val HB_BUFFER_CONTENT_TYPE_INVALID = define(0)
  val HB_BUFFER_CONTENT_TYPE_UNICODE = define(1)
  val HB_BUFFER_CONTENT_TYPE_GLYPHS = define(2)
  inline def getName(inline value: hb_buffer_content_type_t): Option[String] =
    inline value match
      case HB_BUFFER_CONTENT_TYPE_INVALID => Some("HB_BUFFER_CONTENT_TYPE_INVALID")
      case HB_BUFFER_CONTENT_TYPE_UNICODE => Some("HB_BUFFER_CONTENT_TYPE_UNICODE")
      case HB_BUFFER_CONTENT_TYPE_GLYPHS => Some("HB_BUFFER_CONTENT_TYPE_GLYPHS")
      case _ => None
  extension (a: hb_buffer_content_type_t)
    inline def &(b: hb_buffer_content_type_t): hb_buffer_content_type_t = a & b
    inline def |(b: hb_buffer_content_type_t): hb_buffer_content_type_t = a | b
    inline def is(b: hb_buffer_content_type_t): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
*/
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
    inline value match
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

/**
 * hb_buffer_flags_t: _BUFFER_FLAG_DEFAULT: the default buffer flag. _BUFFER_FLAG_BOT: flag indicating that special handling of the beginning of text paragraph can be applied to this buffer. Should usually be set, unless you are passing to the buffer only part of the text without the full context. _BUFFER_FLAG_EOT: flag indicating that special handling of the end of text paragraph can be applied to this buffer, similar to _BUFFER_FLAG_BOT. _BUFFER_FLAG_PRESERVE_DEFAULT_IGNORABLES: flag indication that character with Default_Ignorable Unicode property should use the corresponding glyph from the font, instead of hiding them (done by replacing them with the space glyph and zeroing the advance width.) This flag takes precedence over _BUFFER_FLAG_REMOVE_DEFAULT_IGNORABLES. _BUFFER_FLAG_REMOVE_DEFAULT_IGNORABLES: flag indication that character with Default_Ignorable Unicode property should be removed from glyph string instead of hiding them (done by replacing them with the space glyph and zeroing the advance width.) _BUFFER_FLAG_PRESERVE_DEFAULT_IGNORABLES takes precedence over this flag. Since: 1.8.0 _BUFFER_FLAG_DO_NOT_INSERT_DOTTED_CIRCLE: flag indicating that a dotted circle should not be inserted in the rendering of incorrect character sequences (such at <0905 093E>). Since: 2.4

 * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
*/
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
    inline value match
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

/**
 * hb_buffer_serialize_flags_t: _BUFFER_SERIALIZE_FLAG_DEFAULT: serialize glyph names, clusters and positions. _BUFFER_SERIALIZE_FLAG_NO_CLUSTERS: do not serialize glyph cluster. _BUFFER_SERIALIZE_FLAG_NO_POSITIONS: do not serialize glyph position information. _BUFFER_SERIALIZE_FLAG_NO_GLYPH_NAMES: do no serialize glyph name. _BUFFER_SERIALIZE_FLAG_GLYPH_EXTENTS: serialize glyph extents. _BUFFER_SERIALIZE_FLAG_GLYPH_FLAGS: serialize glyph flags. Since: 1.5.0 _BUFFER_SERIALIZE_FLAG_NO_ADVANCES: do not serialize glyph advances, glyph offsets will reflect absolute glyph positions. Since: 1.8.0

 * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
*/
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
    inline value match
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

/**
 * hb_buffer_serialize_format_t: _BUFFER_SERIALIZE_FORMAT_TEXT: a human-readable, plain text format. _BUFFER_SERIALIZE_FORMAT_JSON: a machine-readable JSON format. _BUFFER_SERIALIZE_FORMAT_INVALID: invalid format.

 * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
*/
opaque type hb_buffer_serialize_format_t = CUnsignedInt
object hb_buffer_serialize_format_t extends CEnumU[hb_buffer_serialize_format_t]:
  given _tag: Tag[hb_buffer_serialize_format_t] = Tag.UInt
  inline def define(inline a: Long): hb_buffer_serialize_format_t = a.toUInt
  val HB_BUFFER_SERIALIZE_FORMAT_TEXT = define(1413830740)
  val HB_BUFFER_SERIALIZE_FORMAT_JSON = define(1246973774)
  val HB_BUFFER_SERIALIZE_FORMAT_INVALID = define(0)
  inline def getName(inline value: hb_buffer_serialize_format_t): Option[String] =
    inline value match
      case HB_BUFFER_SERIALIZE_FORMAT_TEXT => Some("HB_BUFFER_SERIALIZE_FORMAT_TEXT")
      case HB_BUFFER_SERIALIZE_FORMAT_JSON => Some("HB_BUFFER_SERIALIZE_FORMAT_JSON")
      case HB_BUFFER_SERIALIZE_FORMAT_INVALID => Some("HB_BUFFER_SERIALIZE_FORMAT_INVALID")
      case _ => None
  extension (a: hb_buffer_serialize_format_t)
    inline def &(b: hb_buffer_serialize_format_t): hb_buffer_serialize_format_t = a & b
    inline def |(b: hb_buffer_serialize_format_t): hb_buffer_serialize_format_t = a | b
    inline def is(b: hb_buffer_serialize_format_t): Boolean = (a & b) == b

/**
 * hb_direction_t: _DIRECTION_INVALID: Initial, unset direction. _DIRECTION_LTR: Text is set horizontally from left to right. _DIRECTION_RTL: Text is set horizontally from right to left. _DIRECTION_TTB: Text is set vertically from top to bottom. _DIRECTION_BTT: Text is set vertically from bottom to top.

 * [bindgen] header: /usr/include/harfbuzz/hb-common.h
*/
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
    inline value match
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

/**
 * hb_glyph_flags_t: _GLYPH_FLAG_UNSAFE_TO_BREAK: Indicates that if input text is broken at the beginning of the cluster this glyph is part of, then both sides need to be re-shaped, as the result might be different. On the flip side, it means that when this flag is not present, then it's safe to break the glyph-run at the beginning of this cluster, and the two sides represent the exact same result one would get if breaking input text at the beginning of this cluster and shaping the two sides separately. This can be used to optimize paragraph layout, by avoiding re-shaping of each line after line-breaking, or limiting the reshaping to a small piece around the breaking point only. _GLYPH_FLAG_DEFINED: All the currently defined flags.

 * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
*/
opaque type hb_glyph_flags_t = CUnsignedInt
object hb_glyph_flags_t extends CEnumU[hb_glyph_flags_t]:
  given _tag: Tag[hb_glyph_flags_t] = Tag.UInt
  inline def define(inline a: Long): hb_glyph_flags_t = a.toUInt
  val HB_GLYPH_FLAG_UNSAFE_TO_BREAK = define(1)
  val HB_GLYPH_FLAG_DEFINED = define(1)
  inline def getName(inline value: hb_glyph_flags_t): Option[String] =
    inline value match
      case HB_GLYPH_FLAG_UNSAFE_TO_BREAK => Some("HB_GLYPH_FLAG_UNSAFE_TO_BREAK")
      case HB_GLYPH_FLAG_DEFINED => Some("HB_GLYPH_FLAG_DEFINED")
      case _ => None
  extension (a: hb_glyph_flags_t)
    inline def &(b: hb_glyph_flags_t): hb_glyph_flags_t = a & b
    inline def |(b: hb_glyph_flags_t): hb_glyph_flags_t = a | b
    inline def is(b: hb_glyph_flags_t): Boolean = (a & b) == b

/**
 * hb_memory_mode_t: _MEMORY_MODE_DUPLICATE _MEMORY_MODE_READONLY _MEMORY_MODE_WRITABLE _MEMORY_MODE_READONLY_MAY_MAKE_WRITABLE

 * [bindgen] header: /usr/include/harfbuzz/hb-blob.h
*/
opaque type hb_memory_mode_t = CUnsignedInt
object hb_memory_mode_t extends CEnumU[hb_memory_mode_t]:
  given _tag: Tag[hb_memory_mode_t] = Tag.UInt
  inline def define(inline a: Long): hb_memory_mode_t = a.toUInt
  val HB_MEMORY_MODE_DUPLICATE = define(0)
  val HB_MEMORY_MODE_READONLY = define(1)
  val HB_MEMORY_MODE_WRITABLE = define(2)
  val HB_MEMORY_MODE_READONLY_MAY_MAKE_WRITABLE = define(3)
  inline def getName(inline value: hb_memory_mode_t): Option[String] =
    inline value match
      case HB_MEMORY_MODE_DUPLICATE => Some("HB_MEMORY_MODE_DUPLICATE")
      case HB_MEMORY_MODE_READONLY => Some("HB_MEMORY_MODE_READONLY")
      case HB_MEMORY_MODE_WRITABLE => Some("HB_MEMORY_MODE_WRITABLE")
      case HB_MEMORY_MODE_READONLY_MAY_MAKE_WRITABLE => Some("HB_MEMORY_MODE_READONLY_MAY_MAKE_WRITABLE")
      case _ => None
  extension (a: hb_memory_mode_t)
    inline def &(b: hb_memory_mode_t): hb_memory_mode_t = a & b
    inline def |(b: hb_memory_mode_t): hb_memory_mode_t = a | b
    inline def is(b: hb_memory_mode_t): Boolean = (a & b) == b

/**
 * hb_script_t: _SCRIPT_COMMON: HB_TAG ('Z','y','y','y') _SCRIPT_INHERITED: HB_TAG ('Z','i','n','h') _SCRIPT_UNKNOWN: HB_TAG ('Z','z','z','z') _SCRIPT_ARABIC _SCRIPT_ARMENIAN _SCRIPT_BENGALI _SCRIPT_CYRILLIC _SCRIPT_DEVANAGARI _SCRIPT_GEORGIAN _SCRIPT_GREEK _SCRIPT_GUJARATI _SCRIPT_GURMUKHI _SCRIPT_HANGUL _SCRIPT_HAN _SCRIPT_HEBREW _SCRIPT_HIRAGANA _SCRIPT_KANNADA _SCRIPT_KATAKANA _SCRIPT_LAO _SCRIPT_LATIN _SCRIPT_MALAYALAM _SCRIPT_ORIYA _SCRIPT_TAMIL _SCRIPT_TELUGU _SCRIPT_THAI _SCRIPT_TIBETAN _SCRIPT_BOPOMOFO _SCRIPT_BRAILLE _SCRIPT_CANADIAN_SYLLABICS _SCRIPT_CHEROKEE _SCRIPT_ETHIOPIC _SCRIPT_KHMER _SCRIPT_MONGOLIAN _SCRIPT_MYANMAR _SCRIPT_OGHAM _SCRIPT_RUNIC _SCRIPT_SINHALA _SCRIPT_SYRIAC _SCRIPT_THAANA _SCRIPT_YI _SCRIPT_DESERET _SCRIPT_GOTHIC _SCRIPT_OLD_ITALIC _SCRIPT_BUHID _SCRIPT_HANUNOO _SCRIPT_TAGALOG _SCRIPT_TAGBANWA _SCRIPT_CYPRIOT _SCRIPT_LIMBU _SCRIPT_LINEAR_B _SCRIPT_OSMANYA _SCRIPT_SHAVIAN _SCRIPT_TAI_LE _SCRIPT_UGARITIC _SCRIPT_BUGINESE _SCRIPT_COPTIC _SCRIPT_GLAGOLITIC _SCRIPT_KHAROSHTHI _SCRIPT_NEW_TAI_LUE _SCRIPT_OLD_PERSIAN _SCRIPT_SYLOTI_NAGRI _SCRIPT_TIFINAGH _SCRIPT_BALINESE _SCRIPT_CUNEIFORM _SCRIPT_NKO _SCRIPT_PHAGS_PA _SCRIPT_PHOENICIAN _SCRIPT_CARIAN _SCRIPT_CHAM _SCRIPT_KAYAH_LI _SCRIPT_LEPCHA _SCRIPT_LYCIAN _SCRIPT_LYDIAN _SCRIPT_OL_CHIKI _SCRIPT_REJANG _SCRIPT_SAURASHTRA _SCRIPT_SUNDANESE _SCRIPT_VAI _SCRIPT_AVESTAN _SCRIPT_BAMUM _SCRIPT_EGYPTIAN_HIEROGLYPHS _SCRIPT_IMPERIAL_ARAMAIC _SCRIPT_INSCRIPTIONAL_PAHLAVI _SCRIPT_INSCRIPTIONAL_PARTHIAN _SCRIPT_JAVANESE _SCRIPT_KAITHI _SCRIPT_LISU _SCRIPT_MEETEI_MAYEK _SCRIPT_OLD_SOUTH_ARABIAN _SCRIPT_OLD_TURKIC _SCRIPT_SAMARITAN _SCRIPT_TAI_THAM _SCRIPT_TAI_VIET _SCRIPT_BATAK _SCRIPT_BRAHMI _SCRIPT_MANDAIC _SCRIPT_CHAKMA _SCRIPT_MEROITIC_CURSIVE _SCRIPT_MEROITIC_HIEROGLYPHS _SCRIPT_MIAO _SCRIPT_SHARADA _SCRIPT_SORA_SOMPENG _SCRIPT_TAKRI _SCRIPT_BASSA_VAH _SCRIPT_CAUCASIAN_ALBANIAN _SCRIPT_DUPLOYAN _SCRIPT_ELBASAN _SCRIPT_GRANTHA _SCRIPT_KHOJKI _SCRIPT_KHUDAWADI _SCRIPT_LINEAR_A _SCRIPT_MAHAJANI _SCRIPT_MANICHAEAN _SCRIPT_MENDE_KIKAKUI _SCRIPT_MODI _SCRIPT_MRO _SCRIPT_NABATAEAN _SCRIPT_OLD_NORTH_ARABIAN _SCRIPT_OLD_PERMIC _SCRIPT_PAHAWH_HMONG _SCRIPT_PALMYRENE _SCRIPT_PAU_CIN_HAU _SCRIPT_PSALTER_PAHLAVI _SCRIPT_SIDDHAM _SCRIPT_TIRHUTA _SCRIPT_WARANG_CITI _SCRIPT_AHOM _SCRIPT_ANATOLIAN_HIEROGLYPHS _SCRIPT_HATRAN _SCRIPT_MULTANI _SCRIPT_OLD_HUNGARIAN _SCRIPT_SIGNWRITING _SCRIPT_ADLAM _SCRIPT_BHAIKSUKI _SCRIPT_MARCHEN _SCRIPT_OSAGE _SCRIPT_TANGUT _SCRIPT_NEWA _SCRIPT_MASARAM_GONDI _SCRIPT_NUSHU _SCRIPT_SOYOMBO _SCRIPT_ZANABAZAR_SQUARE _SCRIPT_DOGRA _SCRIPT_GUNJALA_GONDI _SCRIPT_HANIFI_ROHINGYA _SCRIPT_MAKASAR _SCRIPT_MEDEFAIDRIN _SCRIPT_OLD_SOGDIAN _SCRIPT_SOGDIAN _SCRIPT_ELYMAIC _SCRIPT_NANDINAGARI _SCRIPT_NYIAKENG_PUACHUE_HMONG _SCRIPT_WANCHO _SCRIPT_INVALID: #HB_TAG_NONE

 * [bindgen] header: /usr/include/harfbuzz/hb-common.h
*/
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
    inline value match
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

/**
 * hb_unicode_combining_class_t: _UNICODE_COMBINING_CLASS_NOT_REORDERED: Spacing and enclosing marks; also many vowel and consonant signs, even if nonspacing _UNICODE_COMBINING_CLASS_OVERLAY: Marks which overlay a base letter or symbol _UNICODE_COMBINING_CLASS_NUKTA: Diacritic nukta marks in Brahmi-derived scripts _UNICODE_COMBINING_CLASS_KANA_VOICING: Hiragana/Katakana voicing marks _UNICODE_COMBINING_CLASS_VIRAMA: Viramas _UNICODE_COMBINING_CLASS_CCC10: [Hebrew] _UNICODE_COMBINING_CLASS_CCC11: [Hebrew] _UNICODE_COMBINING_CLASS_CCC12: [Hebrew] _UNICODE_COMBINING_CLASS_CCC13: [Hebrew] _UNICODE_COMBINING_CLASS_CCC14: [Hebrew] _UNICODE_COMBINING_CLASS_CCC15: [Hebrew] _UNICODE_COMBINING_CLASS_CCC16: [Hebrew] _UNICODE_COMBINING_CLASS_CCC17: [Hebrew] _UNICODE_COMBINING_CLASS_CCC18: [Hebrew] _UNICODE_COMBINING_CLASS_CCC19: [Hebrew] _UNICODE_COMBINING_CLASS_CCC20: [Hebrew] _UNICODE_COMBINING_CLASS_CCC21: [Hebrew] _UNICODE_COMBINING_CLASS_CCC22: [Hebrew] _UNICODE_COMBINING_CLASS_CCC23: [Hebrew] _UNICODE_COMBINING_CLASS_CCC24: [Hebrew] _UNICODE_COMBINING_CLASS_CCC25: [Hebrew] _UNICODE_COMBINING_CLASS_CCC26: [Hebrew] _UNICODE_COMBINING_CLASS_CCC27: [Arabic] _UNICODE_COMBINING_CLASS_CCC28: [Arabic] _UNICODE_COMBINING_CLASS_CCC29: [Arabic] _UNICODE_COMBINING_CLASS_CCC30: [Arabic] _UNICODE_COMBINING_CLASS_CCC31: [Arabic] _UNICODE_COMBINING_CLASS_CCC32: [Arabic] _UNICODE_COMBINING_CLASS_CCC33: [Arabic] _UNICODE_COMBINING_CLASS_CCC34: [Arabic] _UNICODE_COMBINING_CLASS_CCC35: [Arabic] _UNICODE_COMBINING_CLASS_CCC36: [Syriac] _UNICODE_COMBINING_CLASS_CCC84: [Telugu] _UNICODE_COMBINING_CLASS_CCC91: [Telugu] _UNICODE_COMBINING_CLASS_CCC103: [Thai] _UNICODE_COMBINING_CLASS_CCC107: [Thai] _UNICODE_COMBINING_CLASS_CCC118: [Lao] _UNICODE_COMBINING_CLASS_CCC122: [Lao] _UNICODE_COMBINING_CLASS_CCC129: [Tibetan] _UNICODE_COMBINING_CLASS_CCC130: [Tibetan] _UNICODE_COMBINING_CLASS_CCC133: [Tibetan] _UNICODE_COMBINING_CLASS_ATTACHED_BELOW_LEFT: Marks attached at the bottom left _UNICODE_COMBINING_CLASS_ATTACHED_BELOW: Marks attached directly below _UNICODE_COMBINING_CLASS_ATTACHED_ABOVE: Marks attached directly above _UNICODE_COMBINING_CLASS_ATTACHED_ABOVE_RIGHT: Marks attached at the top right _UNICODE_COMBINING_CLASS_BELOW_LEFT: Distinct marks at the bottom left _UNICODE_COMBINING_CLASS_BELOW: Distinct marks directly below _UNICODE_COMBINING_CLASS_BELOW_RIGHT: Distinct marks at the bottom right _UNICODE_COMBINING_CLASS_LEFT: Distinct marks to the left _UNICODE_COMBINING_CLASS_RIGHT: Distinct marks to the right _UNICODE_COMBINING_CLASS_ABOVE_LEFT: Distinct marks at the top left _UNICODE_COMBINING_CLASS_ABOVE: Distinct marks directly above _UNICODE_COMBINING_CLASS_ABOVE_RIGHT: Distinct marks at the top right _UNICODE_COMBINING_CLASS_DOUBLE_BELOW: Distinct marks subtending two bases _UNICODE_COMBINING_CLASS_DOUBLE_ABOVE: Distinct marks extending above two bases _UNICODE_COMBINING_CLASS_IOTA_SUBSCRIPT: Greek iota subscript only _UNICODE_COMBINING_CLASS_INVALID: Invalid combining class

 * [bindgen] header: /usr/include/harfbuzz/hb-unicode.h
*/
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
    inline value match
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

/**
 * hb_unicode_general_category_t: _UNICODE_GENERAL_CATEGORY_CONTROL: [Cc] _UNICODE_GENERAL_CATEGORY_FORMAT: [Cf] _UNICODE_GENERAL_CATEGORY_UNASSIGNED: [Cn] _UNICODE_GENERAL_CATEGORY_PRIVATE_USE: [Co] _UNICODE_GENERAL_CATEGORY_SURROGATE: [Cs] _UNICODE_GENERAL_CATEGORY_LOWERCASE_LETTER: [Ll] _UNICODE_GENERAL_CATEGORY_MODIFIER_LETTER: [Lm] _UNICODE_GENERAL_CATEGORY_OTHER_LETTER: [Lo] _UNICODE_GENERAL_CATEGORY_TITLECASE_LETTER: [Lt] _UNICODE_GENERAL_CATEGORY_UPPERCASE_LETTER: [Lu] _UNICODE_GENERAL_CATEGORY_SPACING_MARK: [Mc] _UNICODE_GENERAL_CATEGORY_ENCLOSING_MARK: [Me] _UNICODE_GENERAL_CATEGORY_NON_SPACING_MARK: [Mn] _UNICODE_GENERAL_CATEGORY_DECIMAL_NUMBER: [Nd] _UNICODE_GENERAL_CATEGORY_LETTER_NUMBER: [Nl] _UNICODE_GENERAL_CATEGORY_OTHER_NUMBER: [No] _UNICODE_GENERAL_CATEGORY_CONNECT_PUNCTUATION: [Pc] _UNICODE_GENERAL_CATEGORY_DASH_PUNCTUATION: [Pd] _UNICODE_GENERAL_CATEGORY_CLOSE_PUNCTUATION: [Pe] _UNICODE_GENERAL_CATEGORY_FINAL_PUNCTUATION: [Pf] _UNICODE_GENERAL_CATEGORY_INITIAL_PUNCTUATION: [Pi] _UNICODE_GENERAL_CATEGORY_OTHER_PUNCTUATION: [Po] _UNICODE_GENERAL_CATEGORY_OPEN_PUNCTUATION: [Ps] _UNICODE_GENERAL_CATEGORY_CURRENCY_SYMBOL: [Sc] _UNICODE_GENERAL_CATEGORY_MODIFIER_SYMBOL: [Sk] _UNICODE_GENERAL_CATEGORY_MATH_SYMBOL: [Sm] _UNICODE_GENERAL_CATEGORY_OTHER_SYMBOL: [So] _UNICODE_GENERAL_CATEGORY_LINE_SEPARATOR: [Zl] _UNICODE_GENERAL_CATEGORY_PARAGRAPH_SEPARATOR: [Zp] _UNICODE_GENERAL_CATEGORY_SPACE_SEPARATOR: [Zs]

 * [bindgen] header: /usr/include/harfbuzz/hb-unicode.h
*/
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
    inline value match
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

