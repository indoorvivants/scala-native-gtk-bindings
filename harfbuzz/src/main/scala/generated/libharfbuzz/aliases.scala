package libharfbuzz
package aliases

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

import _root_.libharfbuzz.enumerations.*
import _root_.libharfbuzz.aliases.*
import _root_.libharfbuzz.structs.*
import _root_.libharfbuzz.unions.*

/**
 * hb_bool_t:

 * [bindgen] header: /usr/include/harfbuzz/hb-common.h
*/
opaque type hb_bool_t = CInt
object hb_bool_t: 
  given _tag: Tag[hb_bool_t] = Tag.Int
  inline def apply(inline o: CInt): hb_bool_t = o
  extension (v: hb_bool_t)
    inline def value: CInt = v

/**
 * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
*/
opaque type hb_buffer_message_func_t = CFuncPtr4[Ptr[hb_buffer_t], Ptr[hb_font_t], CString, Ptr[Byte], hb_bool_t]
object hb_buffer_message_func_t: 
  given _tag: Tag[hb_buffer_message_func_t] = Tag.materializeCFuncPtr4[Ptr[hb_buffer_t], Ptr[hb_font_t], CString, Ptr[Byte], hb_bool_t]
  inline def apply(inline o: CFuncPtr4[Ptr[hb_buffer_t], Ptr[hb_font_t], CString, Ptr[Byte], hb_bool_t]): hb_buffer_message_func_t = o
  extension (v: hb_buffer_message_func_t)
    inline def value: CFuncPtr4[Ptr[hb_buffer_t], Ptr[hb_font_t], CString, Ptr[Byte], hb_bool_t] = v

/**
 * hb_codepoint_t:

 * [bindgen] header: /usr/include/harfbuzz/hb-common.h
*/
type hb_codepoint_t = uint32_t
object hb_codepoint_t: 
  given _tag: Tag[hb_codepoint_t] = uint32_t._tag
  inline def apply(inline o: uint32_t): hb_codepoint_t = o
  extension (v: hb_codepoint_t)
    inline def value: uint32_t = v

/**
 * hb_color_t:

 * [bindgen] header: /usr/include/harfbuzz/hb-common.h
*/
type hb_color_t = uint32_t
object hb_color_t: 
  given _tag: Tag[hb_color_t] = uint32_t._tag
  inline def apply(inline o: uint32_t): hb_color_t = o
  extension (v: hb_color_t)
    inline def value: uint32_t = v

/**
 * [bindgen] header: /usr/include/harfbuzz/hb-common.h
*/
opaque type hb_destroy_func_t = CFuncPtr1[Ptr[Byte], Unit]
object hb_destroy_func_t: 
  given _tag: Tag[hb_destroy_func_t] = Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
  inline def apply(inline o: CFuncPtr1[Ptr[Byte], Unit]): hb_destroy_func_t = o
  extension (v: hb_destroy_func_t)
    inline def value: CFuncPtr1[Ptr[Byte], Unit] = v

/**
 * [bindgen] header: /usr/include/harfbuzz/hb-font.h
*/
opaque type hb_font_get_font_extents_func_t = CFuncPtr4[Ptr[hb_font_t], Ptr[Byte], Ptr[hb_font_extents_t], Ptr[Byte], hb_bool_t]
object hb_font_get_font_extents_func_t: 
  given _tag: Tag[hb_font_get_font_extents_func_t] = Tag.materializeCFuncPtr4[Ptr[hb_font_t], Ptr[Byte], Ptr[hb_font_extents_t], Ptr[Byte], hb_bool_t]
  inline def apply(inline o: CFuncPtr4[Ptr[hb_font_t], Ptr[Byte], Ptr[hb_font_extents_t], Ptr[Byte], hb_bool_t]): hb_font_get_font_extents_func_t = o
  extension (v: hb_font_get_font_extents_func_t)
    inline def value: CFuncPtr4[Ptr[hb_font_t], Ptr[Byte], Ptr[hb_font_extents_t], Ptr[Byte], hb_bool_t] = v

/**
 * hb_font_get_font_h_extents_func_t:

 * [bindgen] header: /usr/include/harfbuzz/hb-font.h
*/
type hb_font_get_font_h_extents_func_t = hb_font_get_font_extents_func_t
object hb_font_get_font_h_extents_func_t: 
  given _tag: Tag[hb_font_get_font_h_extents_func_t] = hb_font_get_font_extents_func_t._tag
  inline def apply(inline o: hb_font_get_font_extents_func_t): hb_font_get_font_h_extents_func_t = o
  extension (v: hb_font_get_font_h_extents_func_t)
    inline def value: hb_font_get_font_extents_func_t = v

/**
 * hb_font_get_font_v_extents_func_t:

 * [bindgen] header: /usr/include/harfbuzz/hb-font.h
*/
type hb_font_get_font_v_extents_func_t = hb_font_get_font_extents_func_t
object hb_font_get_font_v_extents_func_t: 
  given _tag: Tag[hb_font_get_font_v_extents_func_t] = hb_font_get_font_extents_func_t._tag
  inline def apply(inline o: hb_font_get_font_extents_func_t): hb_font_get_font_v_extents_func_t = o
  extension (v: hb_font_get_font_v_extents_func_t)
    inline def value: hb_font_get_font_extents_func_t = v

/**
 * hb_font_get_glyph_advance_func_t:

 * [bindgen] header: /usr/include/harfbuzz/hb-font.h
*/
opaque type hb_font_get_glyph_advance_func_t = CFuncPtr4[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[Byte], hb_position_t]
object hb_font_get_glyph_advance_func_t: 
  given _tag: Tag[hb_font_get_glyph_advance_func_t] = Tag.materializeCFuncPtr4[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[Byte], hb_position_t]
  inline def apply(inline o: CFuncPtr4[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[Byte], hb_position_t]): hb_font_get_glyph_advance_func_t = o
  extension (v: hb_font_get_glyph_advance_func_t)
    inline def value: CFuncPtr4[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[Byte], hb_position_t] = v

/**
 * hb_font_get_glyph_advances_func_t:

 * [bindgen] header: /usr/include/harfbuzz/hb-font.h
*/
opaque type hb_font_get_glyph_advances_func_t = CFuncPtr8[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_position_t], CUnsignedInt, Ptr[Byte], Unit]
object hb_font_get_glyph_advances_func_t: 
  given _tag: Tag[hb_font_get_glyph_advances_func_t] = Tag.materializeCFuncPtr8[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_position_t], CUnsignedInt, Ptr[Byte], Unit]
  inline def apply(inline o: CFuncPtr8[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_position_t], CUnsignedInt, Ptr[Byte], Unit]): hb_font_get_glyph_advances_func_t = o
  extension (v: hb_font_get_glyph_advances_func_t)
    inline def value: CFuncPtr8[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_position_t], CUnsignedInt, Ptr[Byte], Unit] = v

/**
 * hb_font_get_glyph_contour_point_func_t:

 * [bindgen] header: /usr/include/harfbuzz/hb-font.h
*/
opaque type hb_font_get_glyph_contour_point_func_t = CFuncPtr7[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, CUnsignedInt, Ptr[hb_position_t], Ptr[hb_position_t], Ptr[Byte], hb_bool_t]
object hb_font_get_glyph_contour_point_func_t: 
  given _tag: Tag[hb_font_get_glyph_contour_point_func_t] = Tag.materializeCFuncPtr7[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, CUnsignedInt, Ptr[hb_position_t], Ptr[hb_position_t], Ptr[Byte], hb_bool_t]
  inline def apply(inline o: CFuncPtr7[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, CUnsignedInt, Ptr[hb_position_t], Ptr[hb_position_t], Ptr[Byte], hb_bool_t]): hb_font_get_glyph_contour_point_func_t = o
  extension (v: hb_font_get_glyph_contour_point_func_t)
    inline def value: CFuncPtr7[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, CUnsignedInt, Ptr[hb_position_t], Ptr[hb_position_t], Ptr[Byte], hb_bool_t] = v

/**
 * hb_font_get_glyph_extents_func_t:

 * [bindgen] header: /usr/include/harfbuzz/hb-font.h
*/
opaque type hb_font_get_glyph_extents_func_t = CFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_glyph_extents_t], Ptr[Byte], hb_bool_t]
object hb_font_get_glyph_extents_func_t: 
  given _tag: Tag[hb_font_get_glyph_extents_func_t] = Tag.materializeCFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_glyph_extents_t], Ptr[Byte], hb_bool_t]
  inline def apply(inline o: CFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_glyph_extents_t], Ptr[Byte], hb_bool_t]): hb_font_get_glyph_extents_func_t = o
  extension (v: hb_font_get_glyph_extents_func_t)
    inline def value: CFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_glyph_extents_t], Ptr[Byte], hb_bool_t] = v

/**
 * hb_font_get_glyph_from_name_func_t:

 * [bindgen] header: /usr/include/harfbuzz/hb-font.h
*/
opaque type hb_font_get_glyph_from_name_func_t = CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], CString, CInt, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
object hb_font_get_glyph_from_name_func_t: 
  given _tag: Tag[hb_font_get_glyph_from_name_func_t] = Tag.materializeCFuncPtr6[Ptr[hb_font_t], Ptr[Byte], CString, CInt, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
  inline def apply(inline o: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], CString, CInt, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]): hb_font_get_glyph_from_name_func_t = o
  extension (v: hb_font_get_glyph_from_name_func_t)
    inline def value: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], CString, CInt, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t] = v

/**
 * [bindgen] header: /usr/include/harfbuzz/hb-deprecated.h
*/
opaque type hb_font_get_glyph_func_t = CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
object hb_font_get_glyph_func_t: 
  given _tag: Tag[hb_font_get_glyph_func_t] = Tag.materializeCFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
  inline def apply(inline o: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]): hb_font_get_glyph_func_t = o
  extension (v: hb_font_get_glyph_func_t)
    inline def value: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t] = v

/**
 * hb_font_get_glyph_h_advance_func_t:

 * [bindgen] header: /usr/include/harfbuzz/hb-font.h
*/
type hb_font_get_glyph_h_advance_func_t = hb_font_get_glyph_advance_func_t
object hb_font_get_glyph_h_advance_func_t: 
  given _tag: Tag[hb_font_get_glyph_h_advance_func_t] = hb_font_get_glyph_advance_func_t._tag
  inline def apply(inline o: hb_font_get_glyph_advance_func_t): hb_font_get_glyph_h_advance_func_t = o
  extension (v: hb_font_get_glyph_h_advance_func_t)
    inline def value: hb_font_get_glyph_advance_func_t = v

/**
 * hb_font_get_glyph_h_advances_func_t:

 * [bindgen] header: /usr/include/harfbuzz/hb-font.h
*/
type hb_font_get_glyph_h_advances_func_t = hb_font_get_glyph_advances_func_t
object hb_font_get_glyph_h_advances_func_t: 
  given _tag: Tag[hb_font_get_glyph_h_advances_func_t] = hb_font_get_glyph_advances_func_t._tag
  inline def apply(inline o: hb_font_get_glyph_advances_func_t): hb_font_get_glyph_h_advances_func_t = o
  extension (v: hb_font_get_glyph_h_advances_func_t)
    inline def value: hb_font_get_glyph_advances_func_t = v

/**
 * [bindgen] header: /usr/include/harfbuzz/hb-font.h
*/
type hb_font_get_glyph_h_kerning_func_t = hb_font_get_glyph_kerning_func_t
object hb_font_get_glyph_h_kerning_func_t: 
  given _tag: Tag[hb_font_get_glyph_h_kerning_func_t] = hb_font_get_glyph_kerning_func_t._tag
  inline def apply(inline o: hb_font_get_glyph_kerning_func_t): hb_font_get_glyph_h_kerning_func_t = o
  extension (v: hb_font_get_glyph_h_kerning_func_t)
    inline def value: hb_font_get_glyph_kerning_func_t = v

/**
 * hb_font_get_glyph_h_origin_func_t:

 * [bindgen] header: /usr/include/harfbuzz/hb-font.h
*/
type hb_font_get_glyph_h_origin_func_t = hb_font_get_glyph_origin_func_t
object hb_font_get_glyph_h_origin_func_t: 
  given _tag: Tag[hb_font_get_glyph_h_origin_func_t] = hb_font_get_glyph_origin_func_t._tag
  inline def apply(inline o: hb_font_get_glyph_origin_func_t): hb_font_get_glyph_h_origin_func_t = o
  extension (v: hb_font_get_glyph_h_origin_func_t)
    inline def value: hb_font_get_glyph_origin_func_t = v

/**
 * [bindgen] header: /usr/include/harfbuzz/hb-font.h
*/
opaque type hb_font_get_glyph_kerning_func_t = CFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[Byte], hb_position_t]
object hb_font_get_glyph_kerning_func_t: 
  given _tag: Tag[hb_font_get_glyph_kerning_func_t] = Tag.materializeCFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[Byte], hb_position_t]
  inline def apply(inline o: CFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[Byte], hb_position_t]): hb_font_get_glyph_kerning_func_t = o
  extension (v: hb_font_get_glyph_kerning_func_t)
    inline def value: CFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[Byte], hb_position_t] = v

/**
 * hb_font_get_glyph_name_func_t:

 * [bindgen] header: /usr/include/harfbuzz/hb-font.h
*/
opaque type hb_font_get_glyph_name_func_t = CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, CString, CUnsignedInt, Ptr[Byte], hb_bool_t]
object hb_font_get_glyph_name_func_t: 
  given _tag: Tag[hb_font_get_glyph_name_func_t] = Tag.materializeCFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, CString, CUnsignedInt, Ptr[Byte], hb_bool_t]
  inline def apply(inline o: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, CString, CUnsignedInt, Ptr[Byte], hb_bool_t]): hb_font_get_glyph_name_func_t = o
  extension (v: hb_font_get_glyph_name_func_t)
    inline def value: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, CString, CUnsignedInt, Ptr[Byte], hb_bool_t] = v

/**
 * hb_font_get_glyph_origin_func_t:

 * [bindgen] header: /usr/include/harfbuzz/hb-font.h
*/
opaque type hb_font_get_glyph_origin_func_t = CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_position_t], Ptr[hb_position_t], Ptr[Byte], hb_bool_t]
object hb_font_get_glyph_origin_func_t: 
  given _tag: Tag[hb_font_get_glyph_origin_func_t] = Tag.materializeCFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_position_t], Ptr[hb_position_t], Ptr[Byte], hb_bool_t]
  inline def apply(inline o: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_position_t], Ptr[hb_position_t], Ptr[Byte], hb_bool_t]): hb_font_get_glyph_origin_func_t = o
  extension (v: hb_font_get_glyph_origin_func_t)
    inline def value: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_position_t], Ptr[hb_position_t], Ptr[Byte], hb_bool_t] = v

/**
 * hb_font_get_glyph_v_advance_func_t:

 * [bindgen] header: /usr/include/harfbuzz/hb-font.h
*/
type hb_font_get_glyph_v_advance_func_t = hb_font_get_glyph_advance_func_t
object hb_font_get_glyph_v_advance_func_t: 
  given _tag: Tag[hb_font_get_glyph_v_advance_func_t] = hb_font_get_glyph_advance_func_t._tag
  inline def apply(inline o: hb_font_get_glyph_advance_func_t): hb_font_get_glyph_v_advance_func_t = o
  extension (v: hb_font_get_glyph_v_advance_func_t)
    inline def value: hb_font_get_glyph_advance_func_t = v

/**
 * hb_font_get_glyph_v_advances_func_t:

 * [bindgen] header: /usr/include/harfbuzz/hb-font.h
*/
type hb_font_get_glyph_v_advances_func_t = hb_font_get_glyph_advances_func_t
object hb_font_get_glyph_v_advances_func_t: 
  given _tag: Tag[hb_font_get_glyph_v_advances_func_t] = hb_font_get_glyph_advances_func_t._tag
  inline def apply(inline o: hb_font_get_glyph_advances_func_t): hb_font_get_glyph_v_advances_func_t = o
  extension (v: hb_font_get_glyph_v_advances_func_t)
    inline def value: hb_font_get_glyph_advances_func_t = v

/**
 * [bindgen] header: /usr/include/harfbuzz/hb-deprecated.h
*/
type hb_font_get_glyph_v_kerning_func_t = hb_font_get_glyph_kerning_func_t
object hb_font_get_glyph_v_kerning_func_t: 
  given _tag: Tag[hb_font_get_glyph_v_kerning_func_t] = hb_font_get_glyph_kerning_func_t._tag
  inline def apply(inline o: hb_font_get_glyph_kerning_func_t): hb_font_get_glyph_v_kerning_func_t = o
  extension (v: hb_font_get_glyph_v_kerning_func_t)
    inline def value: hb_font_get_glyph_kerning_func_t = v

/**
 * hb_font_get_glyph_v_origin_func_t:

 * [bindgen] header: /usr/include/harfbuzz/hb-font.h
*/
type hb_font_get_glyph_v_origin_func_t = hb_font_get_glyph_origin_func_t
object hb_font_get_glyph_v_origin_func_t: 
  given _tag: Tag[hb_font_get_glyph_v_origin_func_t] = hb_font_get_glyph_origin_func_t._tag
  inline def apply(inline o: hb_font_get_glyph_origin_func_t): hb_font_get_glyph_v_origin_func_t = o
  extension (v: hb_font_get_glyph_v_origin_func_t)
    inline def value: hb_font_get_glyph_origin_func_t = v

/**
 * hb_font_get_nominal_glyph_func_t:

 * [bindgen] header: /usr/include/harfbuzz/hb-font.h
*/
opaque type hb_font_get_nominal_glyph_func_t = CFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
object hb_font_get_nominal_glyph_func_t: 
  given _tag: Tag[hb_font_get_nominal_glyph_func_t] = Tag.materializeCFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
  inline def apply(inline o: CFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]): hb_font_get_nominal_glyph_func_t = o
  extension (v: hb_font_get_nominal_glyph_func_t)
    inline def value: CFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t] = v

/**
 * hb_font_get_nominal_glyphs_func_t:

 * [bindgen] header: /usr/include/harfbuzz/hb-font.h
*/
opaque type hb_font_get_nominal_glyphs_func_t = CFuncPtr8[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[Byte], CUnsignedInt]
object hb_font_get_nominal_glyphs_func_t: 
  given _tag: Tag[hb_font_get_nominal_glyphs_func_t] = Tag.materializeCFuncPtr8[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[Byte], CUnsignedInt]
  inline def apply(inline o: CFuncPtr8[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[Byte], CUnsignedInt]): hb_font_get_nominal_glyphs_func_t = o
  extension (v: hb_font_get_nominal_glyphs_func_t)
    inline def value: CFuncPtr8[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[Byte], CUnsignedInt] = v

/**
 * hb_font_get_variation_glyph_func_t:

 * [bindgen] header: /usr/include/harfbuzz/hb-font.h
*/
opaque type hb_font_get_variation_glyph_func_t = CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
object hb_font_get_variation_glyph_func_t: 
  given _tag: Tag[hb_font_get_variation_glyph_func_t] = Tag.materializeCFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
  inline def apply(inline o: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]): hb_font_get_variation_glyph_func_t = o
  extension (v: hb_font_get_variation_glyph_func_t)
    inline def value: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t] = v

/**
 * [bindgen] header: /usr/include/harfbuzz/hb-common.h
*/
opaque type hb_language_t = Ptr[hb_language_impl_t]
object hb_language_t: 
  given _tag: Tag[hb_language_t] = Tag.Ptr[hb_language_impl_t](hb_language_impl_t._tag)
  inline def apply(inline o: Ptr[hb_language_impl_t]): hb_language_t = o
  extension (v: hb_language_t)
    inline def value: Ptr[hb_language_impl_t] = v

/**
 * hb_mask_t:

 * [bindgen] header: /usr/include/harfbuzz/hb-common.h
*/
type hb_mask_t = uint32_t
object hb_mask_t: 
  given _tag: Tag[hb_mask_t] = uint32_t._tag
  inline def apply(inline o: uint32_t): hb_mask_t = o
  extension (v: hb_mask_t)
    inline def value: uint32_t = v

/**
 * hb_position_t:

 * [bindgen] header: /usr/include/harfbuzz/hb-common.h
*/
type hb_position_t = int32_t
object hb_position_t: 
  given _tag: Tag[hb_position_t] = int32_t._tag
  inline def apply(inline o: int32_t): hb_position_t = o
  extension (v: hb_position_t)
    inline def value: int32_t = v

/**
 * [bindgen] header: /usr/include/harfbuzz/hb-face.h
*/
opaque type hb_reference_table_func_t = CFuncPtr3[Ptr[hb_face_t], hb_tag_t, Ptr[Byte], Ptr[hb_blob_t]]
object hb_reference_table_func_t: 
  given _tag: Tag[hb_reference_table_func_t] = Tag.materializeCFuncPtr3[Ptr[hb_face_t], hb_tag_t, Ptr[Byte], Ptr[hb_blob_t]]
  inline def apply(inline o: CFuncPtr3[Ptr[hb_face_t], hb_tag_t, Ptr[Byte], Ptr[hb_blob_t]]): hb_reference_table_func_t = o
  extension (v: hb_reference_table_func_t)
    inline def value: CFuncPtr3[Ptr[hb_face_t], hb_tag_t, Ptr[Byte], Ptr[hb_blob_t]] = v

/**
 * hb_tag_t:

 * [bindgen] header: /usr/include/harfbuzz/hb-common.h
*/
type hb_tag_t = uint32_t
object hb_tag_t: 
  given _tag: Tag[hb_tag_t] = uint32_t._tag
  inline def apply(inline o: uint32_t): hb_tag_t = o
  extension (v: hb_tag_t)
    inline def value: uint32_t = v

/**
 * hb_unicode_combining_class_func_t: : A Unicode-functions structure : The code point to query _data: User data pointer passed by the caller

 * [bindgen] header: /usr/include/harfbuzz/hb-unicode.h
*/
opaque type hb_unicode_combining_class_func_t = CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_unicode_combining_class_t]
object hb_unicode_combining_class_func_t: 
  given _tag: Tag[hb_unicode_combining_class_func_t] = Tag.materializeCFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_unicode_combining_class_t]
  inline def apply(inline o: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_unicode_combining_class_t]): hb_unicode_combining_class_func_t = o
  extension (v: hb_unicode_combining_class_func_t)
    inline def value: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_unicode_combining_class_t] = v

/**
 * hb_unicode_compose_func_t: : A Unicode-functions structure : The first code point to compose : The second code point to compose : (out): The composed code point _data: user data pointer passed by the caller

 * [bindgen] header: /usr/include/harfbuzz/hb-unicode.h
*/
opaque type hb_unicode_compose_func_t = CFuncPtr5[Ptr[hb_unicode_funcs_t], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
object hb_unicode_compose_func_t: 
  given _tag: Tag[hb_unicode_compose_func_t] = Tag.materializeCFuncPtr5[Ptr[hb_unicode_funcs_t], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
  inline def apply(inline o: CFuncPtr5[Ptr[hb_unicode_funcs_t], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]): hb_unicode_compose_func_t = o
  extension (v: hb_unicode_compose_func_t)
    inline def value: CFuncPtr5[Ptr[hb_unicode_funcs_t], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t] = v

/**
 * hb_unicode_decompose_compatibility_func_t: : a Unicode function structure : codepoint to decompose : address of codepoint array (of length %HB_UNICODE_MAX_DECOMPOSITION_LEN) to write decomposition into _data: user data pointer as passed to hb_unicode_funcs_set_decompose_compatibility_func()

 * [bindgen] header: /usr/include/harfbuzz/hb-deprecated.h
*/
opaque type hb_unicode_decompose_compatibility_func_t = CFuncPtr4[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], CUnsignedInt]
object hb_unicode_decompose_compatibility_func_t: 
  given _tag: Tag[hb_unicode_decompose_compatibility_func_t] = Tag.materializeCFuncPtr4[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], CUnsignedInt]
  inline def apply(inline o: CFuncPtr4[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], CUnsignedInt]): hb_unicode_decompose_compatibility_func_t = o
  extension (v: hb_unicode_decompose_compatibility_func_t)
    inline def value: CFuncPtr4[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], CUnsignedInt] = v

/**
 * hb_unicode_decompose_func_t: : A Unicode-functions structure : The code point to decompose : (out): The first decomposed code point : (out): The second decomposed code point _data: user data pointer passed by the caller

 * [bindgen] header: /usr/include/harfbuzz/hb-unicode.h
*/
opaque type hb_unicode_decompose_func_t = CFuncPtr5[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
object hb_unicode_decompose_func_t: 
  given _tag: Tag[hb_unicode_decompose_func_t] = Tag.materializeCFuncPtr5[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
  inline def apply(inline o: CFuncPtr5[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]): hb_unicode_decompose_func_t = o
  extension (v: hb_unicode_decompose_func_t)
    inline def value: CFuncPtr5[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t] = v

/**
 * hb_unicode_eastasian_width_func_t:

 * [bindgen] header: /usr/include/harfbuzz/hb-deprecated.h
*/
opaque type hb_unicode_eastasian_width_func_t = CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], CUnsignedInt]
object hb_unicode_eastasian_width_func_t: 
  given _tag: Tag[hb_unicode_eastasian_width_func_t] = Tag.materializeCFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], CUnsignedInt]
  inline def apply(inline o: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], CUnsignedInt]): hb_unicode_eastasian_width_func_t = o
  extension (v: hb_unicode_eastasian_width_func_t)
    inline def value: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], CUnsignedInt] = v

/**
 * hb_unicode_general_category_func_t: : A Unicode-functions structure : The code point to query _data: User data pointer passed by the caller

 * [bindgen] header: /usr/include/harfbuzz/hb-unicode.h
*/
opaque type hb_unicode_general_category_func_t = CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_unicode_general_category_t]
object hb_unicode_general_category_func_t: 
  given _tag: Tag[hb_unicode_general_category_func_t] = Tag.materializeCFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_unicode_general_category_t]
  inline def apply(inline o: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_unicode_general_category_t]): hb_unicode_general_category_func_t = o
  extension (v: hb_unicode_general_category_func_t)
    inline def value: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_unicode_general_category_t] = v

/**
 * hb_unicode_mirroring_func_t: : A Unicode-functions structure : The code point to query _data: User data pointer passed by the caller

 * [bindgen] header: /usr/include/harfbuzz/hb-unicode.h
*/
opaque type hb_unicode_mirroring_func_t = CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_codepoint_t]
object hb_unicode_mirroring_func_t: 
  given _tag: Tag[hb_unicode_mirroring_func_t] = Tag.materializeCFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_codepoint_t]
  inline def apply(inline o: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_codepoint_t]): hb_unicode_mirroring_func_t = o
  extension (v: hb_unicode_mirroring_func_t)
    inline def value: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_codepoint_t] = v

/**
 * hb_unicode_script_func_t: : A Unicode-functions structure : The code point to query _data: User data pointer passed by the caller

 * [bindgen] header: /usr/include/harfbuzz/hb-unicode.h
*/
opaque type hb_unicode_script_func_t = CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_script_t]
object hb_unicode_script_func_t: 
  given _tag: Tag[hb_unicode_script_func_t] = Tag.materializeCFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_script_t]
  inline def apply(inline o: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_script_t]): hb_unicode_script_func_t = o
  extension (v: hb_unicode_script_func_t)
    inline def value: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_script_t] = v

type int16_t = scala.Short
object int16_t: 
  val _tag: Tag[int16_t] = summon[Tag[scala.Short]]
  inline def apply(inline o: scala.Short): int16_t = o
  extension (v: int16_t)
    inline def value: scala.Short = v

type int32_t = scala.scalanative.unsafe.CInt
object int32_t: 
  val _tag: Tag[int32_t] = summon[Tag[scala.scalanative.unsafe.CInt]]
  inline def apply(inline o: scala.scalanative.unsafe.CInt): int32_t = o
  extension (v: int32_t)
    inline def value: scala.scalanative.unsafe.CInt = v

type int8_t = scala.scalanative.unsafe.CChar
object int8_t: 
  val _tag: Tag[int8_t] = summon[Tag[scala.scalanative.unsafe.CChar]]
  inline def apply(inline o: scala.scalanative.unsafe.CChar): int8_t = o
  extension (v: int8_t)
    inline def value: scala.scalanative.unsafe.CChar = v

type uint16_t = scala.scalanative.unsigned.UShort
object uint16_t: 
  val _tag: Tag[uint16_t] = summon[Tag[scala.scalanative.unsigned.UShort]]
  inline def apply(inline o: scala.scalanative.unsigned.UShort): uint16_t = o
  extension (v: uint16_t)
    inline def value: scala.scalanative.unsigned.UShort = v

type uint32_t = scala.scalanative.unsigned.UInt
object uint32_t: 
  val _tag: Tag[uint32_t] = summon[Tag[scala.scalanative.unsigned.UInt]]
  inline def apply(inline o: scala.scalanative.unsigned.UInt): uint32_t = o
  extension (v: uint32_t)
    inline def value: scala.scalanative.unsigned.UInt = v

type uint8_t = scala.scalanative.unsigned.UByte
object uint8_t: 
  val _tag: Tag[uint8_t] = summon[Tag[scala.scalanative.unsigned.UByte]]
  inline def apply(inline o: scala.scalanative.unsigned.UByte): uint8_t = o
  extension (v: uint8_t)
    inline def value: scala.scalanative.unsigned.UByte = v

