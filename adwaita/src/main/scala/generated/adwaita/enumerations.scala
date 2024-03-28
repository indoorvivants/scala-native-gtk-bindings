package adwaita
package enumerations

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

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

