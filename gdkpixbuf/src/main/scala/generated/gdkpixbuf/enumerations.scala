package gdkpixbuf
package enumerations

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

private[gdkpixbuf] trait CEnumU[T](using eq: T =:= UInt):
  given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
  extension (inline t: T)
   inline def int: CInt = eq.apply(t).toInt
   inline def uint: CUnsignedInt = eq.apply(t)
   inline def value: CUnsignedInt = eq.apply(t)
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

