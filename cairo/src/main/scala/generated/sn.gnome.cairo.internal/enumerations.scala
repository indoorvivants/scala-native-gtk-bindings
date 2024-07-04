package sn.gnome.cairo.internal

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

private[internal] trait CEnum[T](using eq: T =:= Int):
  given Tag[T] = Tag.Int.asInstanceOf[Tag[T]]
  extension (inline t: T) 
    inline def int: CInt = eq.apply(t)
    inline def value: CInt = eq.apply(t)
private[internal] trait CEnumU[T](using eq: T =:= UInt):
  given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
  extension (inline t: T)
   inline def int: CInt = eq.apply(t).toInt
   inline def uint: CUnsignedInt = eq.apply(t)
   inline def value: CUnsignedInt = eq.apply(t)
/**
 * cairo_antialias_t: _ANTIALIAS_DEFAULT: Use the default antialiasing for the subsystem and target device, since 1.0 _ANTIALIAS_NONE: Use a bilevel alpha mask, since 1.0 _ANTIALIAS_GRAY: Perform single-color antialiasing (using shades of gray for black text on a white background, for example), since 1.0 _ANTIALIAS_SUBPIXEL: Perform antialiasing by taking advantage of the order of subpixel elements on devices such as LCD panels, since 1.0 _ANTIALIAS_FAST: Hint that the backend should perform some antialiasing but prefer speed over quality, since 1.12 _ANTIALIAS_GOOD: The backend should balance quality against performance, since 1.12 _ANTIALIAS_BEST: Hint that the backend should render at the highest quality, sacrificing speed if necessary, since 1.12
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
      case _ => _root_.scala.None
  extension (a: _cairo_antialias)
    inline def &(b: _cairo_antialias): _cairo_antialias = a & b
    inline def |(b: _cairo_antialias): _cairo_antialias = a | b
    inline def is(b: _cairo_antialias): Boolean = (a & b) == b

/**
 * cairo_content_t: _CONTENT_COLOR: The surface will hold color content only. (Since 1.0) _CONTENT_ALPHA: The surface will hold alpha content only. (Since 1.0) _CONTENT_COLOR_ALPHA: The surface will hold color and alpha content. (Since 1.0)
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
      case _ => _root_.scala.None
  extension (a: _cairo_content)
    inline def &(b: _cairo_content): _cairo_content = a & b
    inline def |(b: _cairo_content): _cairo_content = a | b
    inline def is(b: _cairo_content): Boolean = (a & b) == b

/**
 * cairo_device_type_t: _DEVICE_TYPE_DRM: The device is of type Direct Render Manager, since 1.10 _DEVICE_TYPE_GL: The device is of type OpenGL, since 1.10 _DEVICE_TYPE_SCRIPT: The device is of type script, since 1.10 _DEVICE_TYPE_XCB: The device is of type xcb, since 1.10 _DEVICE_TYPE_XLIB: The device is of type xlib, since 1.10 _DEVICE_TYPE_XML: The device is of type XML, since 1.10 _DEVICE_TYPE_COGL: The device is of type cogl, since 1.12 _DEVICE_TYPE_WIN32: The device is of type win32, since 1.12 _DEVICE_TYPE_INVALID: The device is invalid, since 1.10
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
      case _ => _root_.scala.None
  extension (a: _cairo_device_type)
    inline def &(b: _cairo_device_type): _cairo_device_type = a & b
    inline def |(b: _cairo_device_type): _cairo_device_type = a | b
    inline def is(b: _cairo_device_type): Boolean = (a & b) == b

/**
 * cairo_extend_t: _EXTEND_NONE: pixels outside of the source pattern are fully transparent (Since 1.0) _EXTEND_REPEAT: the pattern is tiled by repeating (Since 1.0) _EXTEND_REFLECT: the pattern is tiled by reflecting at the edges (Since 1.0; but only implemented for surface patterns since 1.6) _EXTEND_PAD: pixels outside of the pattern copy the closest pixel from the source (Since 1.2; but only implemented for surface patterns since 1.6)
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
      case _ => _root_.scala.None
  extension (a: _cairo_extend)
    inline def &(b: _cairo_extend): _cairo_extend = a & b
    inline def |(b: _cairo_extend): _cairo_extend = a | b
    inline def is(b: _cairo_extend): Boolean = (a & b) == b

/**
 * cairo_fill_rule_t: _FILL_RULE_WINDING: If the path crosses the ray from left-to-right, counts +1. If the path crosses the ray from right to left, counts -1. (Left and right are determined from the perspective of looking along the ray from the starting point.) If the total count is non-zero, the point will be filled. (Since 1.0) _FILL_RULE_EVEN_ODD: Counts the total number of intersections, without regard to the orientation of the contour. If the total number of intersections is odd, the point will be filled. (Since 1.0)
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
      case _ => _root_.scala.None
  extension (a: _cairo_fill_rule)
    inline def &(b: _cairo_fill_rule): _cairo_fill_rule = a & b
    inline def |(b: _cairo_fill_rule): _cairo_fill_rule = a | b
    inline def is(b: _cairo_fill_rule): Boolean = (a & b) == b

/**
 * cairo_filter_t: _FILTER_FAST: A high-performance filter, with quality similar to %CAIRO_FILTER_NEAREST (Since 1.0) _FILTER_GOOD: A reasonable-performance filter, with quality similar to %CAIRO_FILTER_BILINEAR (Since 1.0) _FILTER_BEST: The highest-quality available, performance may not be suitable for interactive use. (Since 1.0) _FILTER_NEAREST: Nearest-neighbor filtering (Since 1.0) _FILTER_BILINEAR: Linear interpolation in two dimensions (Since 1.0) _FILTER_GAUSSIAN: This filter value is currently unimplemented, and should not be used in current code. (Since 1.0)
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
      case _ => _root_.scala.None
  extension (a: _cairo_filter)
    inline def &(b: _cairo_filter): _cairo_filter = a & b
    inline def |(b: _cairo_filter): _cairo_filter = a | b
    inline def is(b: _cairo_filter): Boolean = (a & b) == b

/**
 * cairo_font_slant_t: _FONT_SLANT_NORMAL: Upright font style, since 1.0 _FONT_SLANT_ITALIC: Italic font style, since 1.0 _FONT_SLANT_OBLIQUE: Oblique font style, since 1.0
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
      case _ => _root_.scala.None
  extension (a: _cairo_font_slant)
    inline def &(b: _cairo_font_slant): _cairo_font_slant = a & b
    inline def |(b: _cairo_font_slant): _cairo_font_slant = a | b
    inline def is(b: _cairo_font_slant): Boolean = (a & b) == b

/**
 * cairo_font_type_t: _FONT_TYPE_TOY: The font was created using cairo's toy font api (Since: 1.2) _FONT_TYPE_FT: The font is of type FreeType (Since: 1.2) _FONT_TYPE_WIN32: The font is of type Win32 (Since: 1.2) _FONT_TYPE_QUARTZ: The font is of type Quartz (Since: 1.6, in 1.2 and 1.4 it was named CAIRO_FONT_TYPE_ATSUI) _FONT_TYPE_USER: The font was create using cairo's user font api (Since: 1.8)
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
      case _ => _root_.scala.None
  extension (a: _cairo_font_type)
    inline def &(b: _cairo_font_type): _cairo_font_type = a & b
    inline def |(b: _cairo_font_type): _cairo_font_type = a | b
    inline def is(b: _cairo_font_type): Boolean = (a & b) == b

/**
 * cairo_font_weight_t: _FONT_WEIGHT_NORMAL: Normal font weight, since 1.0 _FONT_WEIGHT_BOLD: Bold font weight, since 1.0
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
      case _ => _root_.scala.None
  extension (a: _cairo_font_weight)
    inline def &(b: _cairo_font_weight): _cairo_font_weight = a & b
    inline def |(b: _cairo_font_weight): _cairo_font_weight = a | b
    inline def is(b: _cairo_font_weight): Boolean = (a & b) == b

/**
 * cairo_format_t: _FORMAT_INVALID: no such format exists or is supported. _FORMAT_ARGB32: each pixel is a 32-bit quantity, with alpha in the upper 8 bits, then red, then green, then blue. The 32-bit quantities are stored native-endian. Pre-multiplied alpha is used. (That is, 50% transparent red is 0x80800000, not 0x80ff0000.) (Since 1.0) _FORMAT_RGB24: each pixel is a 32-bit quantity, with the upper 8 bits unused. Red, Green, and Blue are stored in the remaining 24 bits in that order. (Since 1.0) _FORMAT_A8: each pixel is a 8-bit quantity holding an alpha value. (Since 1.0) _FORMAT_A1: each pixel is a 1-bit quantity holding an alpha value. Pixels are packed together into 32-bit quantities. The ordering of the bits matches the endianness of the platform. On a big-endian machine, the first pixel is in the uppermost bit, on a little-endian machine the first pixel is in the least-significant bit. (Since 1.0) _FORMAT_RGB16_565: each pixel is a 16-bit quantity with red in the upper 5 bits, then green in the middle 6 bits, and blue in the lower 5 bits. (Since 1.2) _FORMAT_RGB30: like RGB24 but with 10bpc. (Since 1.12)
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
      case _ => _root_.scala.None
  extension (a: _cairo_format)
    inline def &(b: _cairo_format): _cairo_format = a & b
    inline def |(b: _cairo_format): _cairo_format = a | b
    inline def is(b: _cairo_format): Boolean = (a & b) == b

/**
 * cairo_hint_metrics_t: _HINT_METRICS_DEFAULT: Hint metrics in the default manner for the font backend and target device, since 1.0 _HINT_METRICS_OFF: Do not hint font metrics, since 1.0 _HINT_METRICS_ON: Hint font metrics, since 1.0
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
      case _ => _root_.scala.None
  extension (a: _cairo_hint_metrics)
    inline def &(b: _cairo_hint_metrics): _cairo_hint_metrics = a & b
    inline def |(b: _cairo_hint_metrics): _cairo_hint_metrics = a | b
    inline def is(b: _cairo_hint_metrics): Boolean = (a & b) == b

/**
 * cairo_hint_style_t: _HINT_STYLE_DEFAULT: Use the default hint style for font backend and target device, since 1.0 _HINT_STYLE_NONE: Do not hint outlines, since 1.0 _HINT_STYLE_SLIGHT: Hint outlines slightly to improve contrast while retaining good fidelity to the original shapes, since 1.0 _HINT_STYLE_MEDIUM: Hint outlines with medium strength giving a compromise between fidelity to the original shapes and contrast, since 1.0 _HINT_STYLE_FULL: Hint outlines to maximize contrast, since 1.0
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
      case _ => _root_.scala.None
  extension (a: _cairo_hint_style)
    inline def &(b: _cairo_hint_style): _cairo_hint_style = a & b
    inline def |(b: _cairo_hint_style): _cairo_hint_style = a | b
    inline def is(b: _cairo_hint_style): Boolean = (a & b) == b

/**
 * cairo_line_cap_t: _LINE_CAP_BUTT: start(stop) the line exactly at the start(end) point (Since 1.0) _LINE_CAP_ROUND: use a round ending, the center of the circle is the end point (Since 1.0) _LINE_CAP_SQUARE: use squared ending, the center of the square is the end point (Since 1.0)
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
      case _ => _root_.scala.None
  extension (a: _cairo_line_cap)
    inline def &(b: _cairo_line_cap): _cairo_line_cap = a & b
    inline def |(b: _cairo_line_cap): _cairo_line_cap = a | b
    inline def is(b: _cairo_line_cap): Boolean = (a & b) == b

/**
 * cairo_line_join_t: _LINE_JOIN_MITER: use a sharp (angled) corner, see cairo_set_miter_limit() (Since 1.0) _LINE_JOIN_ROUND: use a rounded join, the center of the circle is the joint point (Since 1.0) _LINE_JOIN_BEVEL: use a cut-off join, the join is cut off at half the line width from the joint point (Since 1.0)
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
      case _ => _root_.scala.None
  extension (a: _cairo_line_join)
    inline def &(b: _cairo_line_join): _cairo_line_join = a & b
    inline def |(b: _cairo_line_join): _cairo_line_join = a | b
    inline def is(b: _cairo_line_join): Boolean = (a & b) == b

/**
 * cairo_operator_t: _OPERATOR_CLEAR: clear destination layer (bounded) (Since 1.0) _OPERATOR_SOURCE: replace destination layer (bounded) (Since 1.0) _OPERATOR_OVER: draw source layer on top of destination layer (bounded) (Since 1.0) _OPERATOR_IN: draw source where there was destination content (unbounded) (Since 1.0) _OPERATOR_OUT: draw source where there was no destination content (unbounded) (Since 1.0) _OPERATOR_ATOP: draw source on top of destination content and only there (Since 1.0) _OPERATOR_DEST: ignore the source (Since 1.0) _OPERATOR_DEST_OVER: draw destination on top of source (Since 1.0) _OPERATOR_DEST_IN: leave destination only where there was source content (unbounded) (Since 1.0) _OPERATOR_DEST_OUT: leave destination only where there was no source content (Since 1.0) _OPERATOR_DEST_ATOP: leave destination on top of source content and only there (unbounded) (Since 1.0) _OPERATOR_XOR: source and destination are shown where there is only one of them (Since 1.0) _OPERATOR_ADD: source and destination layers are accumulated (Since 1.0) _OPERATOR_SATURATE: like over, but assuming source and dest are disjoint geometries (Since 1.0) _OPERATOR_MULTIPLY: source and destination layers are multiplied. This causes the result to be at least as dark as the darker inputs. (Since 1.10) _OPERATOR_SCREEN: source and destination are complemented and multiplied. This causes the result to be at least as light as the lighter inputs. (Since 1.10) _OPERATOR_OVERLAY: multiplies or screens, depending on the lightness of the destination color. (Since 1.10) _OPERATOR_DARKEN: replaces the destination with the source if it is darker, otherwise keeps the source. (Since 1.10) _OPERATOR_LIGHTEN: replaces the destination with the source if it is lighter, otherwise keeps the source. (Since 1.10) _OPERATOR_COLOR_DODGE: brightens the destination color to reflect the source color. (Since 1.10) _OPERATOR_COLOR_BURN: darkens the destination color to reflect the source color. (Since 1.10) _OPERATOR_HARD_LIGHT: Multiplies or screens, dependent on source color. (Since 1.10) _OPERATOR_SOFT_LIGHT: Darkens or lightens, dependent on source color. (Since 1.10) _OPERATOR_DIFFERENCE: Takes the difference of the source and destination color. (Since 1.10) _OPERATOR_EXCLUSION: Produces an effect similar to difference, but with lower contrast. (Since 1.10) _OPERATOR_HSL_HUE: Creates a color with the hue of the source and the saturation and luminosity of the target. (Since 1.10) _OPERATOR_HSL_SATURATION: Creates a color with the saturation of the source and the hue and luminosity of the target. Painting with this mode onto a gray area produces no change. (Since 1.10) _OPERATOR_HSL_COLOR: Creates a color with the hue and saturation of the source and the luminosity of the target. This preserves the gray levels of the target and is useful for coloring monochrome images or tinting color images. (Since 1.10) _OPERATOR_HSL_LUMINOSITY: Creates a color with the luminosity of the source and the hue and saturation of the target. This produces an inverse effect to _OPERATOR_HSL_COLOR. (Since 1.10)
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
      case _ => _root_.scala.None
  extension (a: _cairo_operator)
    inline def &(b: _cairo_operator): _cairo_operator = a & b
    inline def |(b: _cairo_operator): _cairo_operator = a | b
    inline def is(b: _cairo_operator): Boolean = (a & b) == b

/**
 * cairo_path_data_type_t: _PATH_MOVE_TO: A move-to operation, since 1.0 _PATH_LINE_TO: A line-to operation, since 1.0 _PATH_CURVE_TO: A curve-to operation, since 1.0 _PATH_CLOSE_PATH: A close-path operation, since 1.0
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
      case _ => _root_.scala.None
  extension (a: _cairo_path_data_type)
    inline def &(b: _cairo_path_data_type): _cairo_path_data_type = a & b
    inline def |(b: _cairo_path_data_type): _cairo_path_data_type = a | b
    inline def is(b: _cairo_path_data_type): Boolean = (a & b) == b

/**
 * cairo_pattern_type_t: _PATTERN_TYPE_SOLID: The pattern is a solid (uniform) color. It may be opaque or translucent, since 1.2. _PATTERN_TYPE_SURFACE: The pattern is a based on a surface (an image), since 1.2. _PATTERN_TYPE_LINEAR: The pattern is a linear gradient, since 1.2. _PATTERN_TYPE_RADIAL: The pattern is a radial gradient, since 1.2. _PATTERN_TYPE_MESH: The pattern is a mesh, since 1.12. _PATTERN_TYPE_RASTER_SOURCE: The pattern is a user pattern providing raster data, since 1.12.
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
      case _ => _root_.scala.None
  extension (a: _cairo_pattern_type)
    inline def &(b: _cairo_pattern_type): _cairo_pattern_type = a & b
    inline def |(b: _cairo_pattern_type): _cairo_pattern_type = a | b
    inline def is(b: _cairo_pattern_type): Boolean = (a & b) == b

/**
 * cairo_region_overlap_t: _REGION_OVERLAP_IN: The contents are entirely inside the region. (Since 1.10) _REGION_OVERLAP_OUT: The contents are entirely outside the region. (Since 1.10) _REGION_OVERLAP_PART: The contents are partially inside and partially outside the region. (Since 1.10)
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
      case _ => _root_.scala.None
  extension (a: _cairo_region_overlap)
    inline def &(b: _cairo_region_overlap): _cairo_region_overlap = a & b
    inline def |(b: _cairo_region_overlap): _cairo_region_overlap = a | b
    inline def is(b: _cairo_region_overlap): Boolean = (a & b) == b

/**
 * cairo_status_t: _STATUS_SUCCESS: no error has occurred (Since 1.0) _STATUS_NO_MEMORY: out of memory (Since 1.0) _STATUS_INVALID_RESTORE: cairo_restore() called without matching cairo_save() (Since 1.0) _STATUS_INVALID_POP_GROUP: no saved group to pop, i.e. cairo_pop_group() without matching cairo_push_group() (Since 1.0) _STATUS_NO_CURRENT_POINT: no current point defined (Since 1.0) _STATUS_INVALID_MATRIX: invalid matrix (not invertible) (Since 1.0) _STATUS_INVALID_STATUS: invalid value for an input #cairo_status_t (Since 1.0) _STATUS_NULL_POINTER: %NULL pointer (Since 1.0) _STATUS_INVALID_STRING: input string not valid UTF-8 (Since 1.0) _STATUS_INVALID_PATH_DATA: input path data not valid (Since 1.0) _STATUS_READ_ERROR: error while reading from input stream (Since 1.0) _STATUS_WRITE_ERROR: error while writing to output stream (Since 1.0) _STATUS_SURFACE_FINISHED: target surface has been finished (Since 1.0) _STATUS_SURFACE_TYPE_MISMATCH: the surface type is not appropriate for the operation (Since 1.0) _STATUS_PATTERN_TYPE_MISMATCH: the pattern type is not appropriate for the operation (Since 1.0) _STATUS_INVALID_CONTENT: invalid value for an input #cairo_content_t (Since 1.0) _STATUS_INVALID_FORMAT: invalid value for an input #cairo_format_t (Since 1.0) _STATUS_INVALID_VISUAL: invalid value for an input Visual* (Since 1.0) _STATUS_FILE_NOT_FOUND: file not found (Since 1.0) _STATUS_INVALID_DASH: invalid value for a dash setting (Since 1.0) _STATUS_INVALID_DSC_COMMENT: invalid value for a DSC comment (Since 1.2) _STATUS_INVALID_INDEX: invalid index passed to getter (Since 1.4) _STATUS_CLIP_NOT_REPRESENTABLE: clip region not representable in desired format (Since 1.4) _STATUS_TEMP_FILE_ERROR: error creating or writing to a temporary file (Since 1.6) _STATUS_INVALID_STRIDE: invalid value for stride (Since 1.6) _STATUS_FONT_TYPE_MISMATCH: the font type is not appropriate for the operation (Since 1.8) _STATUS_USER_FONT_IMMUTABLE: the user-font is immutable (Since 1.8) _STATUS_USER_FONT_ERROR: error occurred in a user-font callback function (Since 1.8) _STATUS_NEGATIVE_COUNT: negative number used where it is not allowed (Since 1.8) _STATUS_INVALID_CLUSTERS: input clusters do not represent the accompanying text and glyph array (Since 1.8) _STATUS_INVALID_SLANT: invalid value for an input #cairo_font_slant_t (Since 1.8) _STATUS_INVALID_WEIGHT: invalid value for an input #cairo_font_weight_t (Since 1.8) _STATUS_INVALID_SIZE: invalid value (typically too big) for the size of the input (surface, pattern, etc.) (Since 1.10) _STATUS_USER_FONT_NOT_IMPLEMENTED: user-font method not implemented (Since 1.10) _STATUS_DEVICE_TYPE_MISMATCH: the device type is not appropriate for the operation (Since 1.10) _STATUS_DEVICE_ERROR: an operation to the device caused an unspecified error (Since 1.10) _STATUS_INVALID_MESH_CONSTRUCTION: a mesh pattern construction operation was used outside of a cairo_mesh_pattern_begin_patch()/cairo_mesh_pattern_end_patch() pair (Since 1.12) _STATUS_DEVICE_FINISHED: target device has been finished (Since 1.12) _STATUS_JBIG2_GLOBAL_MISSING: %CAIRO_MIME_TYPE_JBIG2_GLOBAL_ID has been used on at least one image but no image provided %CAIRO_MIME_TYPE_JBIG2_GLOBAL (Since 1.14) _STATUS_PNG_ERROR: error occurred in libpng while reading from or writing to a PNG file (Since 1.16) _STATUS_FREETYPE_ERROR: error occurred in libfreetype (Since 1.16) _STATUS_WIN32_GDI_ERROR: error occurred in the Windows Graphics Device Interface (Since 1.16) _STATUS_TAG_ERROR: invalid tag name, attributes, or nesting (Since 1.16) _STATUS_LAST_STATUS: this is a special value indicating the number of status values defined in this enumeration. When using this value, note that the version of cairo at run-time may have additional status values defined than the value of this symbol at compile-time. (Since 1.10)
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
      case _ => _root_.scala.None
  extension (a: _cairo_status)
    inline def &(b: _cairo_status): _cairo_status = a & b
    inline def |(b: _cairo_status): _cairo_status = a | b
    inline def is(b: _cairo_status): Boolean = (a & b) == b

/**
 * cairo_subpixel_order_t: _SUBPIXEL_ORDER_DEFAULT: Use the default subpixel order for for the target device, since 1.0 _SUBPIXEL_ORDER_RGB: Subpixel elements are arranged horizontally with red at the left, since 1.0 _SUBPIXEL_ORDER_BGR: Subpixel elements are arranged horizontally with blue at the left, since 1.0 _SUBPIXEL_ORDER_VRGB: Subpixel elements are arranged vertically with red at the top, since 1.0 _SUBPIXEL_ORDER_VBGR: Subpixel elements are arranged vertically with blue at the top, since 1.0
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
      case _ => _root_.scala.None
  extension (a: _cairo_subpixel_order)
    inline def &(b: _cairo_subpixel_order): _cairo_subpixel_order = a & b
    inline def |(b: _cairo_subpixel_order): _cairo_subpixel_order = a | b
    inline def is(b: _cairo_subpixel_order): Boolean = (a & b) == b

/**
 * cairo_surface_type_t: _SURFACE_TYPE_IMAGE: The surface is of type image, since 1.2 _SURFACE_TYPE_PDF: The surface is of type pdf, since 1.2 _SURFACE_TYPE_PS: The surface is of type ps, since 1.2 _SURFACE_TYPE_XLIB: The surface is of type xlib, since 1.2 _SURFACE_TYPE_XCB: The surface is of type xcb, since 1.2 _SURFACE_TYPE_GLITZ: The surface is of type glitz, since 1.2 _SURFACE_TYPE_QUARTZ: The surface is of type quartz, since 1.2 _SURFACE_TYPE_WIN32: The surface is of type win32, since 1.2 _SURFACE_TYPE_BEOS: The surface is of type beos, since 1.2 _SURFACE_TYPE_DIRECTFB: The surface is of type directfb, since 1.2 _SURFACE_TYPE_SVG: The surface is of type svg, since 1.2 _SURFACE_TYPE_OS2: The surface is of type os2, since 1.4 _SURFACE_TYPE_WIN32_PRINTING: The surface is a win32 printing surface, since 1.6 _SURFACE_TYPE_QUARTZ_IMAGE: The surface is of type quartz_image, since 1.6 _SURFACE_TYPE_SCRIPT: The surface is of type script, since 1.10 _SURFACE_TYPE_QT: The surface is of type Qt, since 1.10 _SURFACE_TYPE_RECORDING: The surface is of type recording, since 1.10 _SURFACE_TYPE_VG: The surface is a OpenVG surface, since 1.10 _SURFACE_TYPE_GL: The surface is of type OpenGL, since 1.10 _SURFACE_TYPE_DRM: The surface is of type Direct Render Manager, since 1.10 _SURFACE_TYPE_TEE: The surface is of type 'tee' (a multiplexing surface), since 1.10 _SURFACE_TYPE_XML: The surface is of type XML (for debugging), since 1.10 _SURFACE_TYPE_SUBSURFACE: The surface is a subsurface created with cairo_surface_create_for_rectangle(), since 1.10 _SURFACE_TYPE_COGL: This surface is of type Cogl, since 1.12
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
      case _ => _root_.scala.None
  extension (a: _cairo_surface_type)
    inline def &(b: _cairo_surface_type): _cairo_surface_type = a & b
    inline def |(b: _cairo_surface_type): _cairo_surface_type = a | b
    inline def is(b: _cairo_surface_type): Boolean = (a & b) == b

/**
 * cairo_text_cluster_flags_t: _TEXT_CLUSTER_FLAG_BACKWARD: The clusters in the cluster array map to glyphs in the glyph array from end to start. (Since 1.8)
*/
opaque type _cairo_text_cluster_flags = CUnsignedInt
object _cairo_text_cluster_flags extends CEnumU[_cairo_text_cluster_flags]:
  given _tag: Tag[_cairo_text_cluster_flags] = Tag.UInt
  inline def define(inline a: Long): _cairo_text_cluster_flags = a.toUInt
  val CAIRO_TEXT_CLUSTER_FLAG_BACKWARD = define(1)
  inline def getName(inline value: _cairo_text_cluster_flags): Option[String] =
    inline value match
      case CAIRO_TEXT_CLUSTER_FLAG_BACKWARD => Some("CAIRO_TEXT_CLUSTER_FLAG_BACKWARD")
      case _ => _root_.scala.None
  extension (a: _cairo_text_cluster_flags)
    inline def &(b: _cairo_text_cluster_flags): _cairo_text_cluster_flags = a & b
    inline def |(b: _cairo_text_cluster_flags): _cairo_text_cluster_flags = a | b
    inline def is(b: _cairo_text_cluster_flags): Boolean = (a & b) == b

/**
 * cairo_surface_observer_mode_t: _SURFACE_OBSERVER_NORMAL: no recording is done _SURFACE_OBSERVER_RECORD_OPERATIONS: operations are recorded
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
      case _ => _root_.scala.None
  extension (a: cairo_surface_observer_mode_t)
    inline def &(b: cairo_surface_observer_mode_t): cairo_surface_observer_mode_t = a & b
    inline def |(b: cairo_surface_observer_mode_t): cairo_surface_observer_mode_t = a | b
    inline def is(b: cairo_surface_observer_mode_t): Boolean = (a & b) == b