package sn.gnome.cairo.internal

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_antialias_t: _ANTIALIAS_DEFAULT: Use the default antialiasing for the subsystem and target device, since 1.0 _ANTIALIAS_NONE: Use a bilevel alpha mask, since 1.0 _ANTIALIAS_GRAY: Perform single-color antialiasing (using shades of gray for black text on a white background, for example), since 1.0 _ANTIALIAS_SUBPIXEL: Perform antialiasing by taking advantage of the order of subpixel elements on devices such as LCD panels, since 1.0 _ANTIALIAS_FAST: Hint that the backend should perform some antialiasing but prefer speed over quality, since 1.12 _ANTIALIAS_GOOD: The backend should balance quality against performance, since 1.12 _ANTIALIAS_BEST: Hint that the backend should render at the highest quality, sacrificing speed if necessary, since 1.12
*/
type cairo_antialias_t = _cairo_antialias
object cairo_antialias_t: 
  given _tag: Tag[cairo_antialias_t] = _cairo_antialias._tag
  inline def apply(inline o: _cairo_antialias): cairo_antialias_t = o
  extension (v: cairo_antialias_t)
    inline def value: _cairo_antialias = v

/**
 * cairo_bool_t:
*/
opaque type cairo_bool_t = CInt
object cairo_bool_t: 
  given _tag: Tag[cairo_bool_t] = Tag.Int
  inline def apply(inline o: CInt): cairo_bool_t = o
  extension (v: cairo_bool_t)
    inline def value: CInt = v

/**
 * cairo_content_t: _CONTENT_COLOR: The surface will hold color content only. (Since 1.0) _CONTENT_ALPHA: The surface will hold alpha content only. (Since 1.0) _CONTENT_COLOR_ALPHA: The surface will hold color and alpha content. (Since 1.0)
*/
type cairo_content_t = _cairo_content
object cairo_content_t: 
  given _tag: Tag[cairo_content_t] = _cairo_content._tag
  inline def apply(inline o: _cairo_content): cairo_content_t = o
  extension (v: cairo_content_t)
    inline def value: _cairo_content = v

/**
 * cairo_destroy_func_t:
*/
opaque type cairo_destroy_func_t = CFuncPtr1[Ptr[Byte], Unit]
object cairo_destroy_func_t: 
  given _tag: Tag[cairo_destroy_func_t] = Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte]): cairo_destroy_func_t = CFuncPtr.fromPtr(ptr)
  inline def apply(inline o: CFuncPtr1[Ptr[Byte], Unit]): cairo_destroy_func_t = o
  extension (v: cairo_destroy_func_t)
    inline def value: CFuncPtr1[Ptr[Byte], Unit] = v
    inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

/**
 * cairo_device_type_t: _DEVICE_TYPE_DRM: The device is of type Direct Render Manager, since 1.10 _DEVICE_TYPE_GL: The device is of type OpenGL, since 1.10 _DEVICE_TYPE_SCRIPT: The device is of type script, since 1.10 _DEVICE_TYPE_XCB: The device is of type xcb, since 1.10 _DEVICE_TYPE_XLIB: The device is of type xlib, since 1.10 _DEVICE_TYPE_XML: The device is of type XML, since 1.10 _DEVICE_TYPE_COGL: The device is of type cogl, since 1.12 _DEVICE_TYPE_WIN32: The device is of type win32, since 1.12 _DEVICE_TYPE_INVALID: The device is invalid, since 1.10
*/
type cairo_device_type_t = _cairo_device_type
object cairo_device_type_t: 
  given _tag: Tag[cairo_device_type_t] = _cairo_device_type._tag
  inline def apply(inline o: _cairo_device_type): cairo_device_type_t = o
  extension (v: cairo_device_type_t)
    inline def value: _cairo_device_type = v

/**
 * cairo_extend_t: _EXTEND_NONE: pixels outside of the source pattern are fully transparent (Since 1.0) _EXTEND_REPEAT: the pattern is tiled by repeating (Since 1.0) _EXTEND_REFLECT: the pattern is tiled by reflecting at the edges (Since 1.0; but only implemented for surface patterns since 1.6) _EXTEND_PAD: pixels outside of the pattern copy the closest pixel from the source (Since 1.2; but only implemented for surface patterns since 1.6)
*/
type cairo_extend_t = _cairo_extend
object cairo_extend_t: 
  given _tag: Tag[cairo_extend_t] = _cairo_extend._tag
  inline def apply(inline o: _cairo_extend): cairo_extend_t = o
  extension (v: cairo_extend_t)
    inline def value: _cairo_extend = v

/**
 * cairo_fill_rule_t: _FILL_RULE_WINDING: If the path crosses the ray from left-to-right, counts +1. If the path crosses the ray from right to left, counts -1. (Left and right are determined from the perspective of looking along the ray from the starting point.) If the total count is non-zero, the point will be filled. (Since 1.0) _FILL_RULE_EVEN_ODD: Counts the total number of intersections, without regard to the orientation of the contour. If the total number of intersections is odd, the point will be filled. (Since 1.0)
*/
type cairo_fill_rule_t = _cairo_fill_rule
object cairo_fill_rule_t: 
  given _tag: Tag[cairo_fill_rule_t] = _cairo_fill_rule._tag
  inline def apply(inline o: _cairo_fill_rule): cairo_fill_rule_t = o
  extension (v: cairo_fill_rule_t)
    inline def value: _cairo_fill_rule = v

/**
 * cairo_filter_t: _FILTER_FAST: A high-performance filter, with quality similar to %CAIRO_FILTER_NEAREST (Since 1.0) _FILTER_GOOD: A reasonable-performance filter, with quality similar to %CAIRO_FILTER_BILINEAR (Since 1.0) _FILTER_BEST: The highest-quality available, performance may not be suitable for interactive use. (Since 1.0) _FILTER_NEAREST: Nearest-neighbor filtering (Since 1.0) _FILTER_BILINEAR: Linear interpolation in two dimensions (Since 1.0) _FILTER_GAUSSIAN: This filter value is currently unimplemented, and should not be used in current code. (Since 1.0)
*/
type cairo_filter_t = _cairo_filter
object cairo_filter_t: 
  given _tag: Tag[cairo_filter_t] = _cairo_filter._tag
  inline def apply(inline o: _cairo_filter): cairo_filter_t = o
  extension (v: cairo_filter_t)
    inline def value: _cairo_filter = v

/**
 * cairo_font_slant_t: _FONT_SLANT_NORMAL: Upright font style, since 1.0 _FONT_SLANT_ITALIC: Italic font style, since 1.0 _FONT_SLANT_OBLIQUE: Oblique font style, since 1.0
*/
type cairo_font_slant_t = _cairo_font_slant
object cairo_font_slant_t: 
  given _tag: Tag[cairo_font_slant_t] = _cairo_font_slant._tag
  inline def apply(inline o: _cairo_font_slant): cairo_font_slant_t = o
  extension (v: cairo_font_slant_t)
    inline def value: _cairo_font_slant = v

/**
 * cairo_font_type_t: _FONT_TYPE_TOY: The font was created using cairo's toy font api (Since: 1.2) _FONT_TYPE_FT: The font is of type FreeType (Since: 1.2) _FONT_TYPE_WIN32: The font is of type Win32 (Since: 1.2) _FONT_TYPE_QUARTZ: The font is of type Quartz (Since: 1.6, in 1.2 and 1.4 it was named CAIRO_FONT_TYPE_ATSUI) _FONT_TYPE_USER: The font was create using cairo's user font api (Since: 1.8)
*/
type cairo_font_type_t = _cairo_font_type
object cairo_font_type_t: 
  given _tag: Tag[cairo_font_type_t] = _cairo_font_type._tag
  inline def apply(inline o: _cairo_font_type): cairo_font_type_t = o
  extension (v: cairo_font_type_t)
    inline def value: _cairo_font_type = v

/**
 * cairo_font_weight_t: _FONT_WEIGHT_NORMAL: Normal font weight, since 1.0 _FONT_WEIGHT_BOLD: Bold font weight, since 1.0
*/
type cairo_font_weight_t = _cairo_font_weight
object cairo_font_weight_t: 
  given _tag: Tag[cairo_font_weight_t] = _cairo_font_weight._tag
  inline def apply(inline o: _cairo_font_weight): cairo_font_weight_t = o
  extension (v: cairo_font_weight_t)
    inline def value: _cairo_font_weight = v

/**
 * cairo_format_t: _FORMAT_INVALID: no such format exists or is supported. _FORMAT_ARGB32: each pixel is a 32-bit quantity, with alpha in the upper 8 bits, then red, then green, then blue. The 32-bit quantities are stored native-endian. Pre-multiplied alpha is used. (That is, 50% transparent red is 0x80800000, not 0x80ff0000.) (Since 1.0) _FORMAT_RGB24: each pixel is a 32-bit quantity, with the upper 8 bits unused. Red, Green, and Blue are stored in the remaining 24 bits in that order. (Since 1.0) _FORMAT_A8: each pixel is a 8-bit quantity holding an alpha value. (Since 1.0) _FORMAT_A1: each pixel is a 1-bit quantity holding an alpha value. Pixels are packed together into 32-bit quantities. The ordering of the bits matches the endianness of the platform. On a big-endian machine, the first pixel is in the uppermost bit, on a little-endian machine the first pixel is in the least-significant bit. (Since 1.0) _FORMAT_RGB16_565: each pixel is a 16-bit quantity with red in the upper 5 bits, then green in the middle 6 bits, and blue in the lower 5 bits. (Since 1.2) _FORMAT_RGB30: like RGB24 but with 10bpc. (Since 1.12)
*/
type cairo_format_t = _cairo_format
object cairo_format_t: 
  given _tag: Tag[cairo_format_t] = _cairo_format._tag
  inline def apply(inline o: _cairo_format): cairo_format_t = o
  extension (v: cairo_format_t)
    inline def value: _cairo_format = v

/**
 * cairo_hint_metrics_t: _HINT_METRICS_DEFAULT: Hint metrics in the default manner for the font backend and target device, since 1.0 _HINT_METRICS_OFF: Do not hint font metrics, since 1.0 _HINT_METRICS_ON: Hint font metrics, since 1.0
*/
type cairo_hint_metrics_t = _cairo_hint_metrics
object cairo_hint_metrics_t: 
  given _tag: Tag[cairo_hint_metrics_t] = _cairo_hint_metrics._tag
  inline def apply(inline o: _cairo_hint_metrics): cairo_hint_metrics_t = o
  extension (v: cairo_hint_metrics_t)
    inline def value: _cairo_hint_metrics = v

/**
 * cairo_hint_style_t: _HINT_STYLE_DEFAULT: Use the default hint style for font backend and target device, since 1.0 _HINT_STYLE_NONE: Do not hint outlines, since 1.0 _HINT_STYLE_SLIGHT: Hint outlines slightly to improve contrast while retaining good fidelity to the original shapes, since 1.0 _HINT_STYLE_MEDIUM: Hint outlines with medium strength giving a compromise between fidelity to the original shapes and contrast, since 1.0 _HINT_STYLE_FULL: Hint outlines to maximize contrast, since 1.0
*/
type cairo_hint_style_t = _cairo_hint_style
object cairo_hint_style_t: 
  given _tag: Tag[cairo_hint_style_t] = _cairo_hint_style._tag
  inline def apply(inline o: _cairo_hint_style): cairo_hint_style_t = o
  extension (v: cairo_hint_style_t)
    inline def value: _cairo_hint_style = v

/**
 * cairo_line_cap_t: _LINE_CAP_BUTT: start(stop) the line exactly at the start(end) point (Since 1.0) _LINE_CAP_ROUND: use a round ending, the center of the circle is the end point (Since 1.0) _LINE_CAP_SQUARE: use squared ending, the center of the square is the end point (Since 1.0)
*/
type cairo_line_cap_t = _cairo_line_cap
object cairo_line_cap_t: 
  given _tag: Tag[cairo_line_cap_t] = _cairo_line_cap._tag
  inline def apply(inline o: _cairo_line_cap): cairo_line_cap_t = o
  extension (v: cairo_line_cap_t)
    inline def value: _cairo_line_cap = v

/**
 * cairo_line_join_t: _LINE_JOIN_MITER: use a sharp (angled) corner, see cairo_set_miter_limit() (Since 1.0) _LINE_JOIN_ROUND: use a rounded join, the center of the circle is the joint point (Since 1.0) _LINE_JOIN_BEVEL: use a cut-off join, the join is cut off at half the line width from the joint point (Since 1.0)
*/
type cairo_line_join_t = _cairo_line_join
object cairo_line_join_t: 
  given _tag: Tag[cairo_line_join_t] = _cairo_line_join._tag
  inline def apply(inline o: _cairo_line_join): cairo_line_join_t = o
  extension (v: cairo_line_join_t)
    inline def value: _cairo_line_join = v

/**
 * cairo_operator_t: _OPERATOR_CLEAR: clear destination layer (bounded) (Since 1.0) _OPERATOR_SOURCE: replace destination layer (bounded) (Since 1.0) _OPERATOR_OVER: draw source layer on top of destination layer (bounded) (Since 1.0) _OPERATOR_IN: draw source where there was destination content (unbounded) (Since 1.0) _OPERATOR_OUT: draw source where there was no destination content (unbounded) (Since 1.0) _OPERATOR_ATOP: draw source on top of destination content and only there (Since 1.0) _OPERATOR_DEST: ignore the source (Since 1.0) _OPERATOR_DEST_OVER: draw destination on top of source (Since 1.0) _OPERATOR_DEST_IN: leave destination only where there was source content (unbounded) (Since 1.0) _OPERATOR_DEST_OUT: leave destination only where there was no source content (Since 1.0) _OPERATOR_DEST_ATOP: leave destination on top of source content and only there (unbounded) (Since 1.0) _OPERATOR_XOR: source and destination are shown where there is only one of them (Since 1.0) _OPERATOR_ADD: source and destination layers are accumulated (Since 1.0) _OPERATOR_SATURATE: like over, but assuming source and dest are disjoint geometries (Since 1.0) _OPERATOR_MULTIPLY: source and destination layers are multiplied. This causes the result to be at least as dark as the darker inputs. (Since 1.10) _OPERATOR_SCREEN: source and destination are complemented and multiplied. This causes the result to be at least as light as the lighter inputs. (Since 1.10) _OPERATOR_OVERLAY: multiplies or screens, depending on the lightness of the destination color. (Since 1.10) _OPERATOR_DARKEN: replaces the destination with the source if it is darker, otherwise keeps the source. (Since 1.10) _OPERATOR_LIGHTEN: replaces the destination with the source if it is lighter, otherwise keeps the source. (Since 1.10) _OPERATOR_COLOR_DODGE: brightens the destination color to reflect the source color. (Since 1.10) _OPERATOR_COLOR_BURN: darkens the destination color to reflect the source color. (Since 1.10) _OPERATOR_HARD_LIGHT: Multiplies or screens, dependent on source color. (Since 1.10) _OPERATOR_SOFT_LIGHT: Darkens or lightens, dependent on source color. (Since 1.10) _OPERATOR_DIFFERENCE: Takes the difference of the source and destination color. (Since 1.10) _OPERATOR_EXCLUSION: Produces an effect similar to difference, but with lower contrast. (Since 1.10) _OPERATOR_HSL_HUE: Creates a color with the hue of the source and the saturation and luminosity of the target. (Since 1.10) _OPERATOR_HSL_SATURATION: Creates a color with the saturation of the source and the hue and luminosity of the target. Painting with this mode onto a gray area produces no change. (Since 1.10) _OPERATOR_HSL_COLOR: Creates a color with the hue and saturation of the source and the luminosity of the target. This preserves the gray levels of the target and is useful for coloring monochrome images or tinting color images. (Since 1.10) _OPERATOR_HSL_LUMINOSITY: Creates a color with the luminosity of the source and the hue and saturation of the target. This produces an inverse effect to _OPERATOR_HSL_COLOR. (Since 1.10)
*/
type cairo_operator_t = _cairo_operator
object cairo_operator_t: 
  given _tag: Tag[cairo_operator_t] = _cairo_operator._tag
  inline def apply(inline o: _cairo_operator): cairo_operator_t = o
  extension (v: cairo_operator_t)
    inline def value: _cairo_operator = v

/**
 * cairo_path_data_type_t: _PATH_MOVE_TO: A move-to operation, since 1.0 _PATH_LINE_TO: A line-to operation, since 1.0 _PATH_CURVE_TO: A curve-to operation, since 1.0 _PATH_CLOSE_PATH: A close-path operation, since 1.0
*/
type cairo_path_data_type_t = _cairo_path_data_type
object cairo_path_data_type_t: 
  given _tag: Tag[cairo_path_data_type_t] = _cairo_path_data_type._tag
  inline def apply(inline o: _cairo_path_data_type): cairo_path_data_type_t = o
  extension (v: cairo_path_data_type_t)
    inline def value: _cairo_path_data_type = v

/**
 * cairo_pattern_type_t: _PATTERN_TYPE_SOLID: The pattern is a solid (uniform) color. It may be opaque or translucent, since 1.2. _PATTERN_TYPE_SURFACE: The pattern is a based on a surface (an image), since 1.2. _PATTERN_TYPE_LINEAR: The pattern is a linear gradient, since 1.2. _PATTERN_TYPE_RADIAL: The pattern is a radial gradient, since 1.2. _PATTERN_TYPE_MESH: The pattern is a mesh, since 1.12. _PATTERN_TYPE_RASTER_SOURCE: The pattern is a user pattern providing raster data, since 1.12.
*/
type cairo_pattern_type_t = _cairo_pattern_type
object cairo_pattern_type_t: 
  given _tag: Tag[cairo_pattern_type_t] = _cairo_pattern_type._tag
  inline def apply(inline o: _cairo_pattern_type): cairo_pattern_type_t = o
  extension (v: cairo_pattern_type_t)
    inline def value: _cairo_pattern_type = v

/**
 * cairo_raster_source_acquire_func_t: : the pattern being rendered from : the rendering target surface : rectangular region of interest in pixels in sample space
*/
opaque type cairo_raster_source_acquire_func_t = CFuncPtr4[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_surface_t], Ptr[cairo_rectangle_int_t], Ptr[cairo_surface_t]]
object cairo_raster_source_acquire_func_t: 
  given _tag: Tag[cairo_raster_source_acquire_func_t] = Tag.materializeCFuncPtr4[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_surface_t], Ptr[cairo_rectangle_int_t], Ptr[cairo_surface_t]]
  inline def fromPtr(ptr: Ptr[Byte]): cairo_raster_source_acquire_func_t = CFuncPtr.fromPtr(ptr)
  inline def apply(inline o: CFuncPtr4[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_surface_t], Ptr[cairo_rectangle_int_t], Ptr[cairo_surface_t]]): cairo_raster_source_acquire_func_t = o
  extension (v: cairo_raster_source_acquire_func_t)
    inline def value: CFuncPtr4[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_surface_t], Ptr[cairo_rectangle_int_t], Ptr[cairo_surface_t]] = v
    inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

/**
 * cairo_raster_source_copy_func_t: : the #cairo_pattern_t that was copied to : the #cairo_pattern_t being used as the source for the copy
*/
opaque type cairo_raster_source_copy_func_t = CFuncPtr3[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_pattern_t], cairo_status_t]
object cairo_raster_source_copy_func_t: 
  given _tag: Tag[cairo_raster_source_copy_func_t] = Tag.materializeCFuncPtr3[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_pattern_t], cairo_status_t]
  inline def fromPtr(ptr: Ptr[Byte]): cairo_raster_source_copy_func_t = CFuncPtr.fromPtr(ptr)
  inline def apply(inline o: CFuncPtr3[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_pattern_t], cairo_status_t]): cairo_raster_source_copy_func_t = o
  extension (v: cairo_raster_source_copy_func_t)
    inline def value: CFuncPtr3[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_pattern_t], cairo_status_t] = v
    inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

/**
 * cairo_raster_source_finish_func_t: : the pattern being rendered from
*/
opaque type cairo_raster_source_finish_func_t = CFuncPtr2[Ptr[cairo_pattern_t], Ptr[Byte], Unit]
object cairo_raster_source_finish_func_t: 
  given _tag: Tag[cairo_raster_source_finish_func_t] = Tag.materializeCFuncPtr2[Ptr[cairo_pattern_t], Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte]): cairo_raster_source_finish_func_t = CFuncPtr.fromPtr(ptr)
  inline def apply(inline o: CFuncPtr2[Ptr[cairo_pattern_t], Ptr[Byte], Unit]): cairo_raster_source_finish_func_t = o
  extension (v: cairo_raster_source_finish_func_t)
    inline def value: CFuncPtr2[Ptr[cairo_pattern_t], Ptr[Byte], Unit] = v
    inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

/**
 * cairo_raster_source_release_func_t: : the pattern being rendered from : the surface created during acquire
*/
opaque type cairo_raster_source_release_func_t = CFuncPtr3[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_surface_t], Unit]
object cairo_raster_source_release_func_t: 
  given _tag: Tag[cairo_raster_source_release_func_t] = Tag.materializeCFuncPtr3[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_surface_t], Unit]
  inline def fromPtr(ptr: Ptr[Byte]): cairo_raster_source_release_func_t = CFuncPtr.fromPtr(ptr)
  inline def apply(inline o: CFuncPtr3[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_surface_t], Unit]): cairo_raster_source_release_func_t = o
  extension (v: cairo_raster_source_release_func_t)
    inline def value: CFuncPtr3[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_surface_t], Unit] = v
    inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

/**
 * cairo_raster_source_snapshot_func_t: : the pattern being rendered from
*/
opaque type cairo_raster_source_snapshot_func_t = CFuncPtr2[Ptr[cairo_pattern_t], Ptr[Byte], cairo_status_t]
object cairo_raster_source_snapshot_func_t: 
  given _tag: Tag[cairo_raster_source_snapshot_func_t] = Tag.materializeCFuncPtr2[Ptr[cairo_pattern_t], Ptr[Byte], cairo_status_t]
  inline def fromPtr(ptr: Ptr[Byte]): cairo_raster_source_snapshot_func_t = CFuncPtr.fromPtr(ptr)
  inline def apply(inline o: CFuncPtr2[Ptr[cairo_pattern_t], Ptr[Byte], cairo_status_t]): cairo_raster_source_snapshot_func_t = o
  extension (v: cairo_raster_source_snapshot_func_t)
    inline def value: CFuncPtr2[Ptr[cairo_pattern_t], Ptr[Byte], cairo_status_t] = v
    inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

/**
 * cairo_read_func_t: : the input closure
*/
opaque type cairo_read_func_t = CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], CUnsignedInt, cairo_status_t]
object cairo_read_func_t: 
  given _tag: Tag[cairo_read_func_t] = Tag.materializeCFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], CUnsignedInt, cairo_status_t]
  inline def fromPtr(ptr: Ptr[Byte]): cairo_read_func_t = CFuncPtr.fromPtr(ptr)
  inline def apply(inline o: CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], CUnsignedInt, cairo_status_t]): cairo_read_func_t = o
  extension (v: cairo_read_func_t)
    inline def value: CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], CUnsignedInt, cairo_status_t] = v
    inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

/**
 * cairo_region_overlap_t: _REGION_OVERLAP_IN: The contents are entirely inside the region. (Since 1.10) _REGION_OVERLAP_OUT: The contents are entirely outside the region. (Since 1.10) _REGION_OVERLAP_PART: The contents are partially inside and partially outside the region. (Since 1.10)
*/
type cairo_region_overlap_t = _cairo_region_overlap
object cairo_region_overlap_t: 
  given _tag: Tag[cairo_region_overlap_t] = _cairo_region_overlap._tag
  inline def apply(inline o: _cairo_region_overlap): cairo_region_overlap_t = o
  extension (v: cairo_region_overlap_t)
    inline def value: _cairo_region_overlap = v

/**
 * cairo_status_t: _STATUS_SUCCESS: no error has occurred (Since 1.0) _STATUS_NO_MEMORY: out of memory (Since 1.0) _STATUS_INVALID_RESTORE: cairo_restore() called without matching cairo_save() (Since 1.0) _STATUS_INVALID_POP_GROUP: no saved group to pop, i.e. cairo_pop_group() without matching cairo_push_group() (Since 1.0) _STATUS_NO_CURRENT_POINT: no current point defined (Since 1.0) _STATUS_INVALID_MATRIX: invalid matrix (not invertible) (Since 1.0) _STATUS_INVALID_STATUS: invalid value for an input #cairo_status_t (Since 1.0) _STATUS_NULL_POINTER: %NULL pointer (Since 1.0) _STATUS_INVALID_STRING: input string not valid UTF-8 (Since 1.0) _STATUS_INVALID_PATH_DATA: input path data not valid (Since 1.0) _STATUS_READ_ERROR: error while reading from input stream (Since 1.0) _STATUS_WRITE_ERROR: error while writing to output stream (Since 1.0) _STATUS_SURFACE_FINISHED: target surface has been finished (Since 1.0) _STATUS_SURFACE_TYPE_MISMATCH: the surface type is not appropriate for the operation (Since 1.0) _STATUS_PATTERN_TYPE_MISMATCH: the pattern type is not appropriate for the operation (Since 1.0) _STATUS_INVALID_CONTENT: invalid value for an input #cairo_content_t (Since 1.0) _STATUS_INVALID_FORMAT: invalid value for an input #cairo_format_t (Since 1.0) _STATUS_INVALID_VISUAL: invalid value for an input Visual* (Since 1.0) _STATUS_FILE_NOT_FOUND: file not found (Since 1.0) _STATUS_INVALID_DASH: invalid value for a dash setting (Since 1.0) _STATUS_INVALID_DSC_COMMENT: invalid value for a DSC comment (Since 1.2) _STATUS_INVALID_INDEX: invalid index passed to getter (Since 1.4) _STATUS_CLIP_NOT_REPRESENTABLE: clip region not representable in desired format (Since 1.4) _STATUS_TEMP_FILE_ERROR: error creating or writing to a temporary file (Since 1.6) _STATUS_INVALID_STRIDE: invalid value for stride (Since 1.6) _STATUS_FONT_TYPE_MISMATCH: the font type is not appropriate for the operation (Since 1.8) _STATUS_USER_FONT_IMMUTABLE: the user-font is immutable (Since 1.8) _STATUS_USER_FONT_ERROR: error occurred in a user-font callback function (Since 1.8) _STATUS_NEGATIVE_COUNT: negative number used where it is not allowed (Since 1.8) _STATUS_INVALID_CLUSTERS: input clusters do not represent the accompanying text and glyph array (Since 1.8) _STATUS_INVALID_SLANT: invalid value for an input #cairo_font_slant_t (Since 1.8) _STATUS_INVALID_WEIGHT: invalid value for an input #cairo_font_weight_t (Since 1.8) _STATUS_INVALID_SIZE: invalid value (typically too big) for the size of the input (surface, pattern, etc.) (Since 1.10) _STATUS_USER_FONT_NOT_IMPLEMENTED: user-font method not implemented (Since 1.10) _STATUS_DEVICE_TYPE_MISMATCH: the device type is not appropriate for the operation (Since 1.10) _STATUS_DEVICE_ERROR: an operation to the device caused an unspecified error (Since 1.10) _STATUS_INVALID_MESH_CONSTRUCTION: a mesh pattern construction operation was used outside of a cairo_mesh_pattern_begin_patch()/cairo_mesh_pattern_end_patch() pair (Since 1.12) _STATUS_DEVICE_FINISHED: target device has been finished (Since 1.12) _STATUS_JBIG2_GLOBAL_MISSING: %CAIRO_MIME_TYPE_JBIG2_GLOBAL_ID has been used on at least one image but no image provided %CAIRO_MIME_TYPE_JBIG2_GLOBAL (Since 1.14) _STATUS_PNG_ERROR: error occurred in libpng while reading from or writing to a PNG file (Since 1.16) _STATUS_FREETYPE_ERROR: error occurred in libfreetype (Since 1.16) _STATUS_WIN32_GDI_ERROR: error occurred in the Windows Graphics Device Interface (Since 1.16) _STATUS_TAG_ERROR: invalid tag name, attributes, or nesting (Since 1.16) _STATUS_LAST_STATUS: this is a special value indicating the number of status values defined in this enumeration. When using this value, note that the version of cairo at run-time may have additional status values defined than the value of this symbol at compile-time. (Since 1.10)
*/
type cairo_status_t = _cairo_status
object cairo_status_t: 
  given _tag: Tag[cairo_status_t] = _cairo_status._tag
  inline def apply(inline o: _cairo_status): cairo_status_t = o
  extension (v: cairo_status_t)
    inline def value: _cairo_status = v

/**
 * cairo_subpixel_order_t: _SUBPIXEL_ORDER_DEFAULT: Use the default subpixel order for for the target device, since 1.0 _SUBPIXEL_ORDER_RGB: Subpixel elements are arranged horizontally with red at the left, since 1.0 _SUBPIXEL_ORDER_BGR: Subpixel elements are arranged horizontally with blue at the left, since 1.0 _SUBPIXEL_ORDER_VRGB: Subpixel elements are arranged vertically with red at the top, since 1.0 _SUBPIXEL_ORDER_VBGR: Subpixel elements are arranged vertically with blue at the top, since 1.0
*/
type cairo_subpixel_order_t = _cairo_subpixel_order
object cairo_subpixel_order_t: 
  given _tag: Tag[cairo_subpixel_order_t] = _cairo_subpixel_order._tag
  inline def apply(inline o: _cairo_subpixel_order): cairo_subpixel_order_t = o
  extension (v: cairo_subpixel_order_t)
    inline def value: _cairo_subpixel_order = v

/**
*/
opaque type cairo_surface_observer_callback_t = CFuncPtr3[Ptr[cairo_surface_t], Ptr[cairo_surface_t], Ptr[Byte], Unit]
object cairo_surface_observer_callback_t: 
  given _tag: Tag[cairo_surface_observer_callback_t] = Tag.materializeCFuncPtr3[Ptr[cairo_surface_t], Ptr[cairo_surface_t], Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte]): cairo_surface_observer_callback_t = CFuncPtr.fromPtr(ptr)
  inline def apply(inline o: CFuncPtr3[Ptr[cairo_surface_t], Ptr[cairo_surface_t], Ptr[Byte], Unit]): cairo_surface_observer_callback_t = o
  extension (v: cairo_surface_observer_callback_t)
    inline def value: CFuncPtr3[Ptr[cairo_surface_t], Ptr[cairo_surface_t], Ptr[Byte], Unit] = v
    inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

/**
 * cairo_surface_type_t: _SURFACE_TYPE_IMAGE: The surface is of type image, since 1.2 _SURFACE_TYPE_PDF: The surface is of type pdf, since 1.2 _SURFACE_TYPE_PS: The surface is of type ps, since 1.2 _SURFACE_TYPE_XLIB: The surface is of type xlib, since 1.2 _SURFACE_TYPE_XCB: The surface is of type xcb, since 1.2 _SURFACE_TYPE_GLITZ: The surface is of type glitz, since 1.2 _SURFACE_TYPE_QUARTZ: The surface is of type quartz, since 1.2 _SURFACE_TYPE_WIN32: The surface is of type win32, since 1.2 _SURFACE_TYPE_BEOS: The surface is of type beos, since 1.2 _SURFACE_TYPE_DIRECTFB: The surface is of type directfb, since 1.2 _SURFACE_TYPE_SVG: The surface is of type svg, since 1.2 _SURFACE_TYPE_OS2: The surface is of type os2, since 1.4 _SURFACE_TYPE_WIN32_PRINTING: The surface is a win32 printing surface, since 1.6 _SURFACE_TYPE_QUARTZ_IMAGE: The surface is of type quartz_image, since 1.6 _SURFACE_TYPE_SCRIPT: The surface is of type script, since 1.10 _SURFACE_TYPE_QT: The surface is of type Qt, since 1.10 _SURFACE_TYPE_RECORDING: The surface is of type recording, since 1.10 _SURFACE_TYPE_VG: The surface is a OpenVG surface, since 1.10 _SURFACE_TYPE_GL: The surface is of type OpenGL, since 1.10 _SURFACE_TYPE_DRM: The surface is of type Direct Render Manager, since 1.10 _SURFACE_TYPE_TEE: The surface is of type 'tee' (a multiplexing surface), since 1.10 _SURFACE_TYPE_XML: The surface is of type XML (for debugging), since 1.10 _SURFACE_TYPE_SUBSURFACE: The surface is a subsurface created with cairo_surface_create_for_rectangle(), since 1.10 _SURFACE_TYPE_COGL: This surface is of type Cogl, since 1.12
*/
type cairo_surface_type_t = _cairo_surface_type
object cairo_surface_type_t: 
  given _tag: Tag[cairo_surface_type_t] = _cairo_surface_type._tag
  inline def apply(inline o: _cairo_surface_type): cairo_surface_type_t = o
  extension (v: cairo_surface_type_t)
    inline def value: _cairo_surface_type = v

/**
 * cairo_text_cluster_flags_t: _TEXT_CLUSTER_FLAG_BACKWARD: The clusters in the cluster array map to glyphs in the glyph array from end to start. (Since 1.8)
*/
type cairo_text_cluster_flags_t = _cairo_text_cluster_flags
object cairo_text_cluster_flags_t: 
  given _tag: Tag[cairo_text_cluster_flags_t] = _cairo_text_cluster_flags._tag
  inline def apply(inline o: _cairo_text_cluster_flags): cairo_text_cluster_flags_t = o
  extension (v: cairo_text_cluster_flags_t)
    inline def value: _cairo_text_cluster_flags = v

/**
 * cairo_user_scaled_font_init_func_t: _font: the scaled-font being created : a cairo context, in font space : font extents to fill in, in font space
*/
opaque type cairo_user_scaled_font_init_func_t = CFuncPtr3[Ptr[cairo_scaled_font_t], Ptr[cairo_t], Ptr[cairo_font_extents_t], cairo_status_t]
object cairo_user_scaled_font_init_func_t: 
  given _tag: Tag[cairo_user_scaled_font_init_func_t] = Tag.materializeCFuncPtr3[Ptr[cairo_scaled_font_t], Ptr[cairo_t], Ptr[cairo_font_extents_t], cairo_status_t]
  inline def fromPtr(ptr: Ptr[Byte]): cairo_user_scaled_font_init_func_t = CFuncPtr.fromPtr(ptr)
  inline def apply(inline o: CFuncPtr3[Ptr[cairo_scaled_font_t], Ptr[cairo_t], Ptr[cairo_font_extents_t], cairo_status_t]): cairo_user_scaled_font_init_func_t = o
  extension (v: cairo_user_scaled_font_init_func_t)
    inline def value: CFuncPtr3[Ptr[cairo_scaled_font_t], Ptr[cairo_t], Ptr[cairo_font_extents_t], cairo_status_t] = v
    inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

/**
 * cairo_user_scaled_font_render_glyph_func_t: _font: user scaled-font : glyph code to render : cairo context to draw to, in font space : glyph extents to fill in, in font space
*/
opaque type cairo_user_scaled_font_render_glyph_func_t = CFuncPtr4[Ptr[cairo_scaled_font_t], CUnsignedLongInt, Ptr[cairo_t], Ptr[cairo_text_extents_t], cairo_status_t]
object cairo_user_scaled_font_render_glyph_func_t: 
  given _tag: Tag[cairo_user_scaled_font_render_glyph_func_t] = Tag.materializeCFuncPtr4[Ptr[cairo_scaled_font_t], CUnsignedLongInt, Ptr[cairo_t], Ptr[cairo_text_extents_t], cairo_status_t]
  inline def fromPtr(ptr: Ptr[Byte]): cairo_user_scaled_font_render_glyph_func_t = CFuncPtr.fromPtr(ptr)
  inline def apply(inline o: CFuncPtr4[Ptr[cairo_scaled_font_t], CUnsignedLongInt, Ptr[cairo_t], Ptr[cairo_text_extents_t], cairo_status_t]): cairo_user_scaled_font_render_glyph_func_t = o
  extension (v: cairo_user_scaled_font_render_glyph_func_t)
    inline def value: CFuncPtr4[Ptr[cairo_scaled_font_t], CUnsignedLongInt, Ptr[cairo_t], Ptr[cairo_text_extents_t], cairo_status_t] = v
    inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

/**
 * cairo_user_scaled_font_text_to_glyphs_func_t: _font: the scaled-font being created : a string of text encoded in UTF-8 _len: length of in bytes : pointer to array of glyphs to fill, in font space : pointer to array of cluster mapping information to fill, or %NULL _flags: pointer to location to store cluster flags corresponding to the output
*/
opaque type cairo_user_scaled_font_text_to_glyphs_func_t = CFuncPtr8[Ptr[cairo_scaled_font_t], CString, CInt, Ptr[Ptr[cairo_glyph_t]], Ptr[CInt], Ptr[Ptr[cairo_text_cluster_t]], Ptr[CInt], Ptr[cairo_text_cluster_flags_t], cairo_status_t]
object cairo_user_scaled_font_text_to_glyphs_func_t: 
  given _tag: Tag[cairo_user_scaled_font_text_to_glyphs_func_t] = Tag.materializeCFuncPtr8[Ptr[cairo_scaled_font_t], CString, CInt, Ptr[Ptr[cairo_glyph_t]], Ptr[CInt], Ptr[Ptr[cairo_text_cluster_t]], Ptr[CInt], Ptr[cairo_text_cluster_flags_t], cairo_status_t]
  inline def fromPtr(ptr: Ptr[Byte]): cairo_user_scaled_font_text_to_glyphs_func_t = CFuncPtr.fromPtr(ptr)
  inline def apply(inline o: CFuncPtr8[Ptr[cairo_scaled_font_t], CString, CInt, Ptr[Ptr[cairo_glyph_t]], Ptr[CInt], Ptr[Ptr[cairo_text_cluster_t]], Ptr[CInt], Ptr[cairo_text_cluster_flags_t], cairo_status_t]): cairo_user_scaled_font_text_to_glyphs_func_t = o
  extension (v: cairo_user_scaled_font_text_to_glyphs_func_t)
    inline def value: CFuncPtr8[Ptr[cairo_scaled_font_t], CString, CInt, Ptr[Ptr[cairo_glyph_t]], Ptr[CInt], Ptr[Ptr[cairo_text_cluster_t]], Ptr[CInt], Ptr[cairo_text_cluster_flags_t], cairo_status_t] = v
    inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

/**
 * cairo_user_scaled_font_unicode_to_glyph_func_t: _font: the scaled-font being created : input unicode character code-point _index: output glyph index
*/
opaque type cairo_user_scaled_font_unicode_to_glyph_func_t = CFuncPtr3[Ptr[cairo_scaled_font_t], CUnsignedLongInt, Ptr[CUnsignedLongInt], cairo_status_t]
object cairo_user_scaled_font_unicode_to_glyph_func_t: 
  given _tag: Tag[cairo_user_scaled_font_unicode_to_glyph_func_t] = Tag.materializeCFuncPtr3[Ptr[cairo_scaled_font_t], CUnsignedLongInt, Ptr[CUnsignedLongInt], cairo_status_t]
  inline def fromPtr(ptr: Ptr[Byte]): cairo_user_scaled_font_unicode_to_glyph_func_t = CFuncPtr.fromPtr(ptr)
  inline def apply(inline o: CFuncPtr3[Ptr[cairo_scaled_font_t], CUnsignedLongInt, Ptr[CUnsignedLongInt], cairo_status_t]): cairo_user_scaled_font_unicode_to_glyph_func_t = o
  extension (v: cairo_user_scaled_font_unicode_to_glyph_func_t)
    inline def value: CFuncPtr3[Ptr[cairo_scaled_font_t], CUnsignedLongInt, Ptr[CUnsignedLongInt], cairo_status_t] = v
    inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

/**
 * cairo_write_func_t: : the output closure
*/
opaque type cairo_write_func_t = CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], CUnsignedInt, cairo_status_t]
object cairo_write_func_t: 
  given _tag: Tag[cairo_write_func_t] = Tag.materializeCFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], CUnsignedInt, cairo_status_t]
  inline def fromPtr(ptr: Ptr[Byte]): cairo_write_func_t = CFuncPtr.fromPtr(ptr)
  inline def apply(inline o: CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], CUnsignedInt, cairo_status_t]): cairo_write_func_t = o
  extension (v: cairo_write_func_t)
    inline def value: CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], CUnsignedInt, cairo_status_t] = v
    inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)