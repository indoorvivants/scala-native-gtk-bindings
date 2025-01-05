package adwaita

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

private[adwaita] trait _BindgenEnumCUnsignedInt[T](using eq: T =:= CUnsignedInt):
  given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
  extension (inline t: T)
   inline def value: CUnsignedInt = eq.apply(t)
   inline def int: CInt = eq.apply(t).toInt
   inline def uint: CUnsignedInt = eq.apply(t)
/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-animation.h
*/
opaque type AdwAnimationState = CUnsignedInt
object AdwAnimationState extends _BindgenEnumCUnsignedInt[AdwAnimationState]:
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
      case _ => _root_.scala.None
  extension (a: AdwAnimationState)
    inline def &(b: AdwAnimationState): AdwAnimationState = a & b
    inline def |(b: AdwAnimationState): AdwAnimationState = a | b
    inline def is(b: AdwAnimationState): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-breakpoint.h
*/
opaque type AdwBreakpointConditionLengthType = CUnsignedInt
object AdwBreakpointConditionLengthType extends _BindgenEnumCUnsignedInt[AdwBreakpointConditionLengthType]:
  given _tag: Tag[AdwBreakpointConditionLengthType] = Tag.UInt
  inline def define(inline a: Long): AdwBreakpointConditionLengthType = a.toUInt
  val ADW_BREAKPOINT_CONDITION_MIN_WIDTH = define(0)
  val ADW_BREAKPOINT_CONDITION_MAX_WIDTH = define(1)
  val ADW_BREAKPOINT_CONDITION_MIN_HEIGHT = define(2)
  val ADW_BREAKPOINT_CONDITION_MAX_HEIGHT = define(3)
  inline def getName(inline value: AdwBreakpointConditionLengthType): Option[String] =
    inline value match
      case ADW_BREAKPOINT_CONDITION_MIN_WIDTH => Some("ADW_BREAKPOINT_CONDITION_MIN_WIDTH")
      case ADW_BREAKPOINT_CONDITION_MAX_WIDTH => Some("ADW_BREAKPOINT_CONDITION_MAX_WIDTH")
      case ADW_BREAKPOINT_CONDITION_MIN_HEIGHT => Some("ADW_BREAKPOINT_CONDITION_MIN_HEIGHT")
      case ADW_BREAKPOINT_CONDITION_MAX_HEIGHT => Some("ADW_BREAKPOINT_CONDITION_MAX_HEIGHT")
      case _ => _root_.scala.None
  extension (a: AdwBreakpointConditionLengthType)
    inline def &(b: AdwBreakpointConditionLengthType): AdwBreakpointConditionLengthType = a & b
    inline def |(b: AdwBreakpointConditionLengthType): AdwBreakpointConditionLengthType = a | b
    inline def is(b: AdwBreakpointConditionLengthType): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-breakpoint.h
*/
opaque type AdwBreakpointConditionRatioType = CUnsignedInt
object AdwBreakpointConditionRatioType extends _BindgenEnumCUnsignedInt[AdwBreakpointConditionRatioType]:
  given _tag: Tag[AdwBreakpointConditionRatioType] = Tag.UInt
  inline def define(inline a: Long): AdwBreakpointConditionRatioType = a.toUInt
  val ADW_BREAKPOINT_CONDITION_MIN_ASPECT_RATIO = define(0)
  val ADW_BREAKPOINT_CONDITION_MAX_ASPECT_RATIO = define(1)
  inline def getName(inline value: AdwBreakpointConditionRatioType): Option[String] =
    inline value match
      case ADW_BREAKPOINT_CONDITION_MIN_ASPECT_RATIO => Some("ADW_BREAKPOINT_CONDITION_MIN_ASPECT_RATIO")
      case ADW_BREAKPOINT_CONDITION_MAX_ASPECT_RATIO => Some("ADW_BREAKPOINT_CONDITION_MAX_ASPECT_RATIO")
      case _ => _root_.scala.None
  extension (a: AdwBreakpointConditionRatioType)
    inline def &(b: AdwBreakpointConditionRatioType): AdwBreakpointConditionRatioType = a & b
    inline def |(b: AdwBreakpointConditionRatioType): AdwBreakpointConditionRatioType = a | b
    inline def is(b: AdwBreakpointConditionRatioType): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-header-bar.h
*/
opaque type AdwCenteringPolicy = CUnsignedInt
object AdwCenteringPolicy extends _BindgenEnumCUnsignedInt[AdwCenteringPolicy]:
  given _tag: Tag[AdwCenteringPolicy] = Tag.UInt
  inline def define(inline a: Long): AdwCenteringPolicy = a.toUInt
  val ADW_CENTERING_POLICY_LOOSE = define(0)
  val ADW_CENTERING_POLICY_STRICT = define(1)
  inline def getName(inline value: AdwCenteringPolicy): Option[String] =
    inline value match
      case ADW_CENTERING_POLICY_LOOSE => Some("ADW_CENTERING_POLICY_LOOSE")
      case ADW_CENTERING_POLICY_STRICT => Some("ADW_CENTERING_POLICY_STRICT")
      case _ => _root_.scala.None
  extension (a: AdwCenteringPolicy)
    inline def &(b: AdwCenteringPolicy): AdwCenteringPolicy = a & b
    inline def |(b: AdwCenteringPolicy): AdwCenteringPolicy = a | b
    inline def is(b: AdwCenteringPolicy): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-style-manager.h
*/
opaque type AdwColorScheme = CUnsignedInt
object AdwColorScheme extends _BindgenEnumCUnsignedInt[AdwColorScheme]:
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
      case _ => _root_.scala.None
  extension (a: AdwColorScheme)
    inline def &(b: AdwColorScheme): AdwColorScheme = a & b
    inline def |(b: AdwColorScheme): AdwColorScheme = a | b
    inline def is(b: AdwColorScheme): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-dialog.h
*/
opaque type AdwDialogPresentationMode = CUnsignedInt
object AdwDialogPresentationMode extends _BindgenEnumCUnsignedInt[AdwDialogPresentationMode]:
  given _tag: Tag[AdwDialogPresentationMode] = Tag.UInt
  inline def define(inline a: Long): AdwDialogPresentationMode = a.toUInt
  val ADW_DIALOG_AUTO = define(0)
  val ADW_DIALOG_FLOATING = define(1)
  val ADW_DIALOG_BOTTOM_SHEET = define(2)
  inline def getName(inline value: AdwDialogPresentationMode): Option[String] =
    inline value match
      case ADW_DIALOG_AUTO => Some("ADW_DIALOG_AUTO")
      case ADW_DIALOG_FLOATING => Some("ADW_DIALOG_FLOATING")
      case ADW_DIALOG_BOTTOM_SHEET => Some("ADW_DIALOG_BOTTOM_SHEET")
      case _ => _root_.scala.None
  extension (a: AdwDialogPresentationMode)
    inline def &(b: AdwDialogPresentationMode): AdwDialogPresentationMode = a & b
    inline def |(b: AdwDialogPresentationMode): AdwDialogPresentationMode = a | b
    inline def is(b: AdwDialogPresentationMode): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-easing.h
*/
opaque type AdwEasing = CUnsignedInt
object AdwEasing extends _BindgenEnumCUnsignedInt[AdwEasing]:
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
      case _ => _root_.scala.None
  extension (a: AdwEasing)
    inline def &(b: AdwEasing): AdwEasing = a & b
    inline def |(b: AdwEasing): AdwEasing = a | b
    inline def is(b: AdwEasing): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-flap.h
*/
opaque type AdwFlapFoldPolicy = CUnsignedInt
object AdwFlapFoldPolicy extends _BindgenEnumCUnsignedInt[AdwFlapFoldPolicy]:
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
      case _ => _root_.scala.None
  extension (a: AdwFlapFoldPolicy)
    inline def &(b: AdwFlapFoldPolicy): AdwFlapFoldPolicy = a & b
    inline def |(b: AdwFlapFoldPolicy): AdwFlapFoldPolicy = a | b
    inline def is(b: AdwFlapFoldPolicy): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-flap.h
*/
opaque type AdwFlapTransitionType = CUnsignedInt
object AdwFlapTransitionType extends _BindgenEnumCUnsignedInt[AdwFlapTransitionType]:
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
      case _ => _root_.scala.None
  extension (a: AdwFlapTransitionType)
    inline def &(b: AdwFlapTransitionType): AdwFlapTransitionType = a & b
    inline def |(b: AdwFlapTransitionType): AdwFlapTransitionType = a | b
    inline def is(b: AdwFlapTransitionType): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-fold-threshold-policy.h
*/
opaque type AdwFoldThresholdPolicy = CUnsignedInt
object AdwFoldThresholdPolicy extends _BindgenEnumCUnsignedInt[AdwFoldThresholdPolicy]:
  given _tag: Tag[AdwFoldThresholdPolicy] = Tag.UInt
  inline def define(inline a: Long): AdwFoldThresholdPolicy = a.toUInt
  val ADW_FOLD_THRESHOLD_POLICY_MINIMUM = define(0)
  val ADW_FOLD_THRESHOLD_POLICY_NATURAL = define(1)
  inline def getName(inline value: AdwFoldThresholdPolicy): Option[String] =
    inline value match
      case ADW_FOLD_THRESHOLD_POLICY_MINIMUM => Some("ADW_FOLD_THRESHOLD_POLICY_MINIMUM")
      case ADW_FOLD_THRESHOLD_POLICY_NATURAL => Some("ADW_FOLD_THRESHOLD_POLICY_NATURAL")
      case _ => _root_.scala.None
  extension (a: AdwFoldThresholdPolicy)
    inline def &(b: AdwFoldThresholdPolicy): AdwFoldThresholdPolicy = a & b
    inline def |(b: AdwFoldThresholdPolicy): AdwFoldThresholdPolicy = a | b
    inline def is(b: AdwFoldThresholdPolicy): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-leaflet.h
*/
opaque type AdwLeafletTransitionType = CUnsignedInt
object AdwLeafletTransitionType extends _BindgenEnumCUnsignedInt[AdwLeafletTransitionType]:
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
      case _ => _root_.scala.None
  extension (a: AdwLeafletTransitionType)
    inline def &(b: AdwLeafletTransitionType): AdwLeafletTransitionType = a & b
    inline def |(b: AdwLeafletTransitionType): AdwLeafletTransitionType = a | b
    inline def is(b: AdwLeafletTransitionType): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-length-unit.h
*/
opaque type AdwLengthUnit = CUnsignedInt
object AdwLengthUnit extends _BindgenEnumCUnsignedInt[AdwLengthUnit]:
  given _tag: Tag[AdwLengthUnit] = Tag.UInt
  inline def define(inline a: Long): AdwLengthUnit = a.toUInt
  val ADW_LENGTH_UNIT_PX = define(0)
  val ADW_LENGTH_UNIT_PT = define(1)
  val ADW_LENGTH_UNIT_SP = define(2)
  inline def getName(inline value: AdwLengthUnit): Option[String] =
    inline value match
      case ADW_LENGTH_UNIT_PX => Some("ADW_LENGTH_UNIT_PX")
      case ADW_LENGTH_UNIT_PT => Some("ADW_LENGTH_UNIT_PT")
      case ADW_LENGTH_UNIT_SP => Some("ADW_LENGTH_UNIT_SP")
      case _ => _root_.scala.None
  extension (a: AdwLengthUnit)
    inline def &(b: AdwLengthUnit): AdwLengthUnit = a & b
    inline def |(b: AdwLengthUnit): AdwLengthUnit = a | b
    inline def is(b: AdwLengthUnit): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-navigation-direction.h
*/
opaque type AdwNavigationDirection = CUnsignedInt
object AdwNavigationDirection extends _BindgenEnumCUnsignedInt[AdwNavigationDirection]:
  given _tag: Tag[AdwNavigationDirection] = Tag.UInt
  inline def define(inline a: Long): AdwNavigationDirection = a.toUInt
  val ADW_NAVIGATION_DIRECTION_BACK = define(0)
  val ADW_NAVIGATION_DIRECTION_FORWARD = define(1)
  inline def getName(inline value: AdwNavigationDirection): Option[String] =
    inline value match
      case ADW_NAVIGATION_DIRECTION_BACK => Some("ADW_NAVIGATION_DIRECTION_BACK")
      case ADW_NAVIGATION_DIRECTION_FORWARD => Some("ADW_NAVIGATION_DIRECTION_FORWARD")
      case _ => _root_.scala.None
  extension (a: AdwNavigationDirection)
    inline def &(b: AdwNavigationDirection): AdwNavigationDirection = a & b
    inline def |(b: AdwNavigationDirection): AdwNavigationDirection = a | b
    inline def is(b: AdwNavigationDirection): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-alert-dialog.h
*/
opaque type AdwResponseAppearance = CUnsignedInt
object AdwResponseAppearance extends _BindgenEnumCUnsignedInt[AdwResponseAppearance]:
  given _tag: Tag[AdwResponseAppearance] = Tag.UInt
  inline def define(inline a: Long): AdwResponseAppearance = a.toUInt
  val ADW_RESPONSE_DEFAULT = define(0)
  val ADW_RESPONSE_SUGGESTED = define(1)
  val ADW_RESPONSE_DESTRUCTIVE = define(2)
  inline def getName(inline value: AdwResponseAppearance): Option[String] =
    inline value match
      case ADW_RESPONSE_DEFAULT => Some("ADW_RESPONSE_DEFAULT")
      case ADW_RESPONSE_SUGGESTED => Some("ADW_RESPONSE_SUGGESTED")
      case ADW_RESPONSE_DESTRUCTIVE => Some("ADW_RESPONSE_DESTRUCTIVE")
      case _ => _root_.scala.None
  extension (a: AdwResponseAppearance)
    inline def &(b: AdwResponseAppearance): AdwResponseAppearance = a & b
    inline def |(b: AdwResponseAppearance): AdwResponseAppearance = a | b
    inline def is(b: AdwResponseAppearance): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-squeezer.h
*/
opaque type AdwSqueezerTransitionType = CUnsignedInt
object AdwSqueezerTransitionType extends _BindgenEnumCUnsignedInt[AdwSqueezerTransitionType]:
  given _tag: Tag[AdwSqueezerTransitionType] = Tag.UInt
  inline def define(inline a: Long): AdwSqueezerTransitionType = a.toUInt
  val ADW_SQUEEZER_TRANSITION_TYPE_NONE = define(0)
  val ADW_SQUEEZER_TRANSITION_TYPE_CROSSFADE = define(1)
  inline def getName(inline value: AdwSqueezerTransitionType): Option[String] =
    inline value match
      case ADW_SQUEEZER_TRANSITION_TYPE_NONE => Some("ADW_SQUEEZER_TRANSITION_TYPE_NONE")
      case ADW_SQUEEZER_TRANSITION_TYPE_CROSSFADE => Some("ADW_SQUEEZER_TRANSITION_TYPE_CROSSFADE")
      case _ => _root_.scala.None
  extension (a: AdwSqueezerTransitionType)
    inline def &(b: AdwSqueezerTransitionType): AdwSqueezerTransitionType = a & b
    inline def |(b: AdwSqueezerTransitionType): AdwSqueezerTransitionType = a | b
    inline def is(b: AdwSqueezerTransitionType): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-tab-view.h
*/
opaque type AdwTabViewShortcuts = CUnsignedInt
object AdwTabViewShortcuts extends _BindgenEnumCUnsignedInt[AdwTabViewShortcuts]:
  given _tag: Tag[AdwTabViewShortcuts] = Tag.UInt
  inline def define(inline a: Long): AdwTabViewShortcuts = a.toUInt
  val ADW_TAB_VIEW_SHORTCUT_NONE = define(0)
  val ADW_TAB_VIEW_SHORTCUT_CONTROL_TAB = define(1)
  val ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_TAB = define(2)
  val ADW_TAB_VIEW_SHORTCUT_CONTROL_PAGE_UP = define(4)
  val ADW_TAB_VIEW_SHORTCUT_CONTROL_PAGE_DOWN = define(8)
  val ADW_TAB_VIEW_SHORTCUT_CONTROL_HOME = define(16)
  val ADW_TAB_VIEW_SHORTCUT_CONTROL_END = define(32)
  val ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_PAGE_UP = define(64)
  val ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_PAGE_DOWN = define(128)
  val ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_HOME = define(256)
  val ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_END = define(512)
  val ADW_TAB_VIEW_SHORTCUT_ALT_DIGITS = define(1024)
  val ADW_TAB_VIEW_SHORTCUT_ALT_ZERO = define(2048)
  val ADW_TAB_VIEW_SHORTCUT_ALL_SHORTCUTS = define(4095)
  inline def getName(inline value: AdwTabViewShortcuts): Option[String] =
    inline value match
      case ADW_TAB_VIEW_SHORTCUT_NONE => Some("ADW_TAB_VIEW_SHORTCUT_NONE")
      case ADW_TAB_VIEW_SHORTCUT_CONTROL_TAB => Some("ADW_TAB_VIEW_SHORTCUT_CONTROL_TAB")
      case ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_TAB => Some("ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_TAB")
      case ADW_TAB_VIEW_SHORTCUT_CONTROL_PAGE_UP => Some("ADW_TAB_VIEW_SHORTCUT_CONTROL_PAGE_UP")
      case ADW_TAB_VIEW_SHORTCUT_CONTROL_PAGE_DOWN => Some("ADW_TAB_VIEW_SHORTCUT_CONTROL_PAGE_DOWN")
      case ADW_TAB_VIEW_SHORTCUT_CONTROL_HOME => Some("ADW_TAB_VIEW_SHORTCUT_CONTROL_HOME")
      case ADW_TAB_VIEW_SHORTCUT_CONTROL_END => Some("ADW_TAB_VIEW_SHORTCUT_CONTROL_END")
      case ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_PAGE_UP => Some("ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_PAGE_UP")
      case ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_PAGE_DOWN => Some("ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_PAGE_DOWN")
      case ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_HOME => Some("ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_HOME")
      case ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_END => Some("ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_END")
      case ADW_TAB_VIEW_SHORTCUT_ALT_DIGITS => Some("ADW_TAB_VIEW_SHORTCUT_ALT_DIGITS")
      case ADW_TAB_VIEW_SHORTCUT_ALT_ZERO => Some("ADW_TAB_VIEW_SHORTCUT_ALT_ZERO")
      case ADW_TAB_VIEW_SHORTCUT_ALL_SHORTCUTS => Some("ADW_TAB_VIEW_SHORTCUT_ALL_SHORTCUTS")
      case _ => _root_.scala.None
  extension (a: AdwTabViewShortcuts)
    inline def &(b: AdwTabViewShortcuts): AdwTabViewShortcuts = a & b
    inline def |(b: AdwTabViewShortcuts): AdwTabViewShortcuts = a | b
    inline def is(b: AdwTabViewShortcuts): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-toast.h
*/
opaque type AdwToastPriority = CUnsignedInt
object AdwToastPriority extends _BindgenEnumCUnsignedInt[AdwToastPriority]:
  given _tag: Tag[AdwToastPriority] = Tag.UInt
  inline def define(inline a: Long): AdwToastPriority = a.toUInt
  val ADW_TOAST_PRIORITY_NORMAL = define(0)
  val ADW_TOAST_PRIORITY_HIGH = define(1)
  inline def getName(inline value: AdwToastPriority): Option[String] =
    inline value match
      case ADW_TOAST_PRIORITY_NORMAL => Some("ADW_TOAST_PRIORITY_NORMAL")
      case ADW_TOAST_PRIORITY_HIGH => Some("ADW_TOAST_PRIORITY_HIGH")
      case _ => _root_.scala.None
  extension (a: AdwToastPriority)
    inline def &(b: AdwToastPriority): AdwToastPriority = a & b
    inline def |(b: AdwToastPriority): AdwToastPriority = a | b
    inline def is(b: AdwToastPriority): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-toolbar-view.h
*/
opaque type AdwToolbarStyle = CUnsignedInt
object AdwToolbarStyle extends _BindgenEnumCUnsignedInt[AdwToolbarStyle]:
  given _tag: Tag[AdwToolbarStyle] = Tag.UInt
  inline def define(inline a: Long): AdwToolbarStyle = a.toUInt
  val ADW_TOOLBAR_FLAT = define(0)
  val ADW_TOOLBAR_RAISED = define(1)
  val ADW_TOOLBAR_RAISED_BORDER = define(2)
  inline def getName(inline value: AdwToolbarStyle): Option[String] =
    inline value match
      case ADW_TOOLBAR_FLAT => Some("ADW_TOOLBAR_FLAT")
      case ADW_TOOLBAR_RAISED => Some("ADW_TOOLBAR_RAISED")
      case ADW_TOOLBAR_RAISED_BORDER => Some("ADW_TOOLBAR_RAISED_BORDER")
      case _ => _root_.scala.None
  extension (a: AdwToolbarStyle)
    inline def &(b: AdwToolbarStyle): AdwToolbarStyle = a & b
    inline def |(b: AdwToolbarStyle): AdwToolbarStyle = a | b
    inline def is(b: AdwToolbarStyle): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-switcher.h
*/
opaque type AdwViewSwitcherPolicy = CUnsignedInt
object AdwViewSwitcherPolicy extends _BindgenEnumCUnsignedInt[AdwViewSwitcherPolicy]:
  given _tag: Tag[AdwViewSwitcherPolicy] = Tag.UInt
  inline def define(inline a: Long): AdwViewSwitcherPolicy = a.toUInt
  val ADW_VIEW_SWITCHER_POLICY_NARROW = define(0)
  val ADW_VIEW_SWITCHER_POLICY_WIDE = define(1)
  inline def getName(inline value: AdwViewSwitcherPolicy): Option[String] =
    inline value match
      case ADW_VIEW_SWITCHER_POLICY_NARROW => Some("ADW_VIEW_SWITCHER_POLICY_NARROW")
      case ADW_VIEW_SWITCHER_POLICY_WIDE => Some("ADW_VIEW_SWITCHER_POLICY_WIDE")
      case _ => _root_.scala.None
  extension (a: AdwViewSwitcherPolicy)
    inline def &(b: AdwViewSwitcherPolicy): AdwViewSwitcherPolicy = a & b
    inline def |(b: AdwViewSwitcherPolicy): AdwViewSwitcherPolicy = a | b
    inline def is(b: AdwViewSwitcherPolicy): Boolean = (a & b) == b