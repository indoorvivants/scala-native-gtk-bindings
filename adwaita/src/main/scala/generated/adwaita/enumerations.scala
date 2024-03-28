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

