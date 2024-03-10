package sn.gnome.harfbuzz.internal

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_bool_t:
*/
opaque type hb_bool_t = CInt
object hb_bool_t: 
  given _tag: Tag[hb_bool_t] = Tag.Int
  inline def apply(inline o: CInt): hb_bool_t = o
  extension (v: hb_bool_t)
    inline def value: CInt = v

/**
 * hb_buffer_message_func_t: : An #hb_buffer_t to work upon : The #hb_font_t the is shaped with : `NULL`-terminated message passed to the function _data: User data pointer passed by the caller
*/
opaque type hb_buffer_message_func_t = CFuncPtr4[Ptr[hb_buffer_t], Ptr[hb_font_t], CString, Ptr[Byte], hb_bool_t]
object hb_buffer_message_func_t: 
  given _tag: Tag[hb_buffer_message_func_t] = Tag.materializeCFuncPtr4[Ptr[hb_buffer_t], Ptr[hb_font_t], CString, Ptr[Byte], hb_bool_t]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_buffer_message_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[hb_buffer_t], Ptr[hb_font_t], CString, Ptr[Byte], hb_bool_t]): hb_buffer_message_func_t = o
  extension (v: hb_buffer_message_func_t)
    inline def value: CFuncPtr4[Ptr[hb_buffer_t], Ptr[hb_font_t], CString, Ptr[Byte], hb_bool_t] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_codepoint_t:
*/
type hb_codepoint_t = uint32_t
object hb_codepoint_t: 
  given _tag: Tag[hb_codepoint_t] = uint32_t._tag
  inline def apply(inline o: uint32_t): hb_codepoint_t = o
  extension (v: hb_codepoint_t)
    inline def value: uint32_t = v

/**
 * hb_color_line_get_color_stops_func_t: _line: a #hb_color_line_t object _line_data: the data accompanying _line : the index of the first color stop to return : (inout) (optional): Input = the maximum number of feature tags to return; Output = the actual number of feature tags returned (may be zero) _stops: (out) (array length=count) (optional): Array of #hb_color_stop_t to populate _data: the data accompanying this method
*/
opaque type hb_color_line_get_color_stops_func_t = CFuncPtr6[Ptr[hb_color_line_t], Ptr[Byte], CUnsignedInt, Ptr[CUnsignedInt], Ptr[hb_color_stop_t], Ptr[Byte], CUnsignedInt]
object hb_color_line_get_color_stops_func_t: 
  given _tag: Tag[hb_color_line_get_color_stops_func_t] = Tag.materializeCFuncPtr6[Ptr[hb_color_line_t], Ptr[Byte], CUnsignedInt, Ptr[CUnsignedInt], Ptr[hb_color_stop_t], Ptr[Byte], CUnsignedInt]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_color_line_get_color_stops_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[Ptr[hb_color_line_t], Ptr[Byte], CUnsignedInt, Ptr[CUnsignedInt], Ptr[hb_color_stop_t], Ptr[Byte], CUnsignedInt]): hb_color_line_get_color_stops_func_t = o
  extension (v: hb_color_line_get_color_stops_func_t)
    inline def value: CFuncPtr6[Ptr[hb_color_line_t], Ptr[Byte], CUnsignedInt, Ptr[CUnsignedInt], Ptr[hb_color_stop_t], Ptr[Byte], CUnsignedInt] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_color_line_get_extend_func_t: _line: a #hb_color_line_t object _line_data: the data accompanying _line _data: the data accompanying this method
*/
opaque type hb_color_line_get_extend_func_t = CFuncPtr3[Ptr[hb_color_line_t], Ptr[Byte], Ptr[Byte], hb_paint_extend_t]
object hb_color_line_get_extend_func_t: 
  given _tag: Tag[hb_color_line_get_extend_func_t] = Tag.materializeCFuncPtr3[Ptr[hb_color_line_t], Ptr[Byte], Ptr[Byte], hb_paint_extend_t]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_color_line_get_extend_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[hb_color_line_t], Ptr[Byte], Ptr[Byte], hb_paint_extend_t]): hb_color_line_get_extend_func_t = o
  extension (v: hb_color_line_get_extend_func_t)
    inline def value: CFuncPtr3[Ptr[hb_color_line_t], Ptr[Byte], Ptr[Byte], hb_paint_extend_t] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_color_t:
*/
type hb_color_t = uint32_t
object hb_color_t: 
  given _tag: Tag[hb_color_t] = uint32_t._tag
  inline def apply(inline o: uint32_t): hb_color_t = o
  extension (v: hb_color_t)
    inline def value: uint32_t = v

/**
 * hb_destroy_func_t: _data: the data to be destroyed
*/
opaque type hb_destroy_func_t = CFuncPtr1[Ptr[Byte], Unit]
object hb_destroy_func_t: 
  given _tag: Tag[hb_destroy_func_t] = Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_destroy_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[Byte], Unit]): hb_destroy_func_t = o
  extension (v: hb_destroy_func_t)
    inline def value: CFuncPtr1[Ptr[Byte], Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_draw_close_path_func_t: : draw functions object _data: The data accompanying the draw functions in hb_font_draw_glyph()
*/
opaque type hb_draw_close_path_func_t = CFuncPtr4[Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[hb_draw_state_t], Ptr[Byte], Unit]
object hb_draw_close_path_func_t: 
  given _tag: Tag[hb_draw_close_path_func_t] = Tag.materializeCFuncPtr4[Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[hb_draw_state_t], Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_draw_close_path_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[hb_draw_state_t], Ptr[Byte], Unit]): hb_draw_close_path_func_t = o
  extension (v: hb_draw_close_path_func_t)
    inline def value: CFuncPtr4[Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[hb_draw_state_t], Ptr[Byte], Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_draw_cubic_to_func_t: : draw functions object _data: The data accompanying the draw functions in hb_font_draw_glyph()
*/
opaque type hb_draw_cubic_to_func_t = CFuncPtr10[Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[hb_draw_state_t], Float, Float, Float, Float, Float, Float, Ptr[Byte], Unit]
object hb_draw_cubic_to_func_t: 
  given _tag: Tag[hb_draw_cubic_to_func_t] = Tag.materializeCFuncPtr10[Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[hb_draw_state_t], Float, Float, Float, Float, Float, Float, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_draw_cubic_to_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr10[Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[hb_draw_state_t], Float, Float, Float, Float, Float, Float, Ptr[Byte], Unit]): hb_draw_cubic_to_func_t = o
  extension (v: hb_draw_cubic_to_func_t)
    inline def value: CFuncPtr10[Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[hb_draw_state_t], Float, Float, Float, Float, Float, Float, Ptr[Byte], Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_draw_line_to_func_t: : draw functions object _data: The data accompanying the draw functions in hb_font_draw_glyph()
*/
opaque type hb_draw_line_to_func_t = CFuncPtr6[Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[hb_draw_state_t], Float, Float, Ptr[Byte], Unit]
object hb_draw_line_to_func_t: 
  given _tag: Tag[hb_draw_line_to_func_t] = Tag.materializeCFuncPtr6[Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[hb_draw_state_t], Float, Float, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_draw_line_to_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[hb_draw_state_t], Float, Float, Ptr[Byte], Unit]): hb_draw_line_to_func_t = o
  extension (v: hb_draw_line_to_func_t)
    inline def value: CFuncPtr6[Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[hb_draw_state_t], Float, Float, Ptr[Byte], Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_draw_move_to_func_t: : draw functions object _data: The data accompanying the draw functions in hb_font_draw_glyph()
*/
opaque type hb_draw_move_to_func_t = CFuncPtr6[Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[hb_draw_state_t], Float, Float, Ptr[Byte], Unit]
object hb_draw_move_to_func_t: 
  given _tag: Tag[hb_draw_move_to_func_t] = Tag.materializeCFuncPtr6[Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[hb_draw_state_t], Float, Float, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_draw_move_to_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[hb_draw_state_t], Float, Float, Ptr[Byte], Unit]): hb_draw_move_to_func_t = o
  extension (v: hb_draw_move_to_func_t)
    inline def value: CFuncPtr6[Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[hb_draw_state_t], Float, Float, Ptr[Byte], Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_draw_quadratic_to_func_t: : draw functions object _data: The data accompanying the draw functions in hb_font_draw_glyph()
*/
opaque type hb_draw_quadratic_to_func_t = CFuncPtr8[Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[hb_draw_state_t], Float, Float, Float, Float, Ptr[Byte], Unit]
object hb_draw_quadratic_to_func_t: 
  given _tag: Tag[hb_draw_quadratic_to_func_t] = Tag.materializeCFuncPtr8[Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[hb_draw_state_t], Float, Float, Float, Float, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_draw_quadratic_to_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr8[Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[hb_draw_state_t], Float, Float, Float, Float, Ptr[Byte], Unit]): hb_draw_quadratic_to_func_t = o
  extension (v: hb_draw_quadratic_to_func_t)
    inline def value: CFuncPtr8[Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[hb_draw_state_t], Float, Float, Float, Float, Ptr[Byte], Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_font_draw_glyph_func_t: : #hb_font_t to work upon _data: user data pointer : The glyph ID to query _funcs: The draw functions to send the shape data to _data: The data accompanying the draw functions _data: User data pointer passed by the caller
*/
opaque type hb_font_draw_glyph_func_t = CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[Byte], Unit]
object hb_font_draw_glyph_func_t: 
  given _tag: Tag[hb_font_draw_glyph_func_t] = Tag.materializeCFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_font_draw_glyph_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[Byte], Unit]): hb_font_draw_glyph_func_t = o
  extension (v: hb_font_draw_glyph_func_t)
    inline def value: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[Byte], Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_font_get_font_extents_func_t: : #hb_font_t to work upon _data: user data pointer : (out): The font extents retrieved _data: User data pointer passed by the caller
*/
opaque type hb_font_get_font_extents_func_t = CFuncPtr4[Ptr[hb_font_t], Ptr[Byte], Ptr[hb_font_extents_t], Ptr[Byte], hb_bool_t]
object hb_font_get_font_extents_func_t: 
  given _tag: Tag[hb_font_get_font_extents_func_t] = Tag.materializeCFuncPtr4[Ptr[hb_font_t], Ptr[Byte], Ptr[hb_font_extents_t], Ptr[Byte], hb_bool_t]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_font_get_font_extents_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[hb_font_t], Ptr[Byte], Ptr[hb_font_extents_t], Ptr[Byte], hb_bool_t]): hb_font_get_font_extents_func_t = o
  extension (v: hb_font_get_font_extents_func_t)
    inline def value: CFuncPtr4[Ptr[hb_font_t], Ptr[Byte], Ptr[hb_font_extents_t], Ptr[Byte], hb_bool_t] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_font_get_font_h_extents_func_t:
*/
type hb_font_get_font_h_extents_func_t = hb_font_get_font_extents_func_t
object hb_font_get_font_h_extents_func_t: 
  given _tag: Tag[hb_font_get_font_h_extents_func_t] = hb_font_get_font_extents_func_t._tag
  inline def apply(inline o: hb_font_get_font_extents_func_t): hb_font_get_font_h_extents_func_t = o
  extension (v: hb_font_get_font_h_extents_func_t)
    inline def value: hb_font_get_font_extents_func_t = v

/**
 * hb_font_get_font_v_extents_func_t:
*/
type hb_font_get_font_v_extents_func_t = hb_font_get_font_extents_func_t
object hb_font_get_font_v_extents_func_t: 
  given _tag: Tag[hb_font_get_font_v_extents_func_t] = hb_font_get_font_extents_func_t._tag
  inline def apply(inline o: hb_font_get_font_extents_func_t): hb_font_get_font_v_extents_func_t = o
  extension (v: hb_font_get_font_v_extents_func_t)
    inline def value: hb_font_get_font_extents_func_t = v

/**
 * hb_font_get_glyph_advance_func_t: : #hb_font_t to work upon _data: user data pointer : The glyph ID to query _data: User data pointer passed by the caller
*/
opaque type hb_font_get_glyph_advance_func_t = CFuncPtr4[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[Byte], hb_position_t]
object hb_font_get_glyph_advance_func_t: 
  given _tag: Tag[hb_font_get_glyph_advance_func_t] = Tag.materializeCFuncPtr4[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[Byte], hb_position_t]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_font_get_glyph_advance_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[Byte], hb_position_t]): hb_font_get_glyph_advance_func_t = o
  extension (v: hb_font_get_glyph_advance_func_t)
    inline def value: CFuncPtr4[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[Byte], hb_position_t] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_font_get_glyph_advances_func_t: : #hb_font_t to work upon _data: user data pointer : The number of glyph IDs in the sequence queried _glyph: The first glyph ID to query _stride: The stride between successive glyph IDs _advance: (out): The first advance retrieved _stride: The stride between successive advances _data: User data pointer passed by the caller
*/
opaque type hb_font_get_glyph_advances_func_t = CFuncPtr8[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_position_t], CUnsignedInt, Ptr[Byte], Unit]
object hb_font_get_glyph_advances_func_t: 
  given _tag: Tag[hb_font_get_glyph_advances_func_t] = Tag.materializeCFuncPtr8[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_position_t], CUnsignedInt, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_font_get_glyph_advances_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr8[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_position_t], CUnsignedInt, Ptr[Byte], Unit]): hb_font_get_glyph_advances_func_t = o
  extension (v: hb_font_get_glyph_advances_func_t)
    inline def value: CFuncPtr8[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_position_t], CUnsignedInt, Ptr[Byte], Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_font_get_glyph_contour_point_func_t: : #hb_font_t to work upon _data: user data pointer : The glyph ID to query _index: The contour-point index to query : (out): The X value retrieved for the contour point : (out): The Y value retrieved for the contour point _data: User data pointer passed by the caller
*/
opaque type hb_font_get_glyph_contour_point_func_t = CFuncPtr7[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, CUnsignedInt, Ptr[hb_position_t], Ptr[hb_position_t], Ptr[Byte], hb_bool_t]
object hb_font_get_glyph_contour_point_func_t: 
  given _tag: Tag[hb_font_get_glyph_contour_point_func_t] = Tag.materializeCFuncPtr7[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, CUnsignedInt, Ptr[hb_position_t], Ptr[hb_position_t], Ptr[Byte], hb_bool_t]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_font_get_glyph_contour_point_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, CUnsignedInt, Ptr[hb_position_t], Ptr[hb_position_t], Ptr[Byte], hb_bool_t]): hb_font_get_glyph_contour_point_func_t = o
  extension (v: hb_font_get_glyph_contour_point_func_t)
    inline def value: CFuncPtr7[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, CUnsignedInt, Ptr[hb_position_t], Ptr[hb_position_t], Ptr[Byte], hb_bool_t] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_font_get_glyph_extents_func_t: : #hb_font_t to work upon _data: user data pointer : The glyph ID to query : (out): The #hb_glyph_extents_t retrieved _data: User data pointer passed by the caller
*/
opaque type hb_font_get_glyph_extents_func_t = CFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_glyph_extents_t], Ptr[Byte], hb_bool_t]
object hb_font_get_glyph_extents_func_t: 
  given _tag: Tag[hb_font_get_glyph_extents_func_t] = Tag.materializeCFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_glyph_extents_t], Ptr[Byte], hb_bool_t]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_font_get_glyph_extents_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_glyph_extents_t], Ptr[Byte], hb_bool_t]): hb_font_get_glyph_extents_func_t = o
  extension (v: hb_font_get_glyph_extents_func_t)
    inline def value: CFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_glyph_extents_t], Ptr[Byte], hb_bool_t] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_font_get_glyph_from_name_func_t: : #hb_font_t to work upon _data: user data pointer : The length of the name queried : (out): The glyph ID retrieved _data: User data pointer passed by the caller
*/
opaque type hb_font_get_glyph_from_name_func_t = CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], CString, CInt, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
object hb_font_get_glyph_from_name_func_t: 
  given _tag: Tag[hb_font_get_glyph_from_name_func_t] = Tag.materializeCFuncPtr6[Ptr[hb_font_t], Ptr[Byte], CString, CInt, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_font_get_glyph_from_name_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], CString, CInt, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]): hb_font_get_glyph_from_name_func_t = o
  extension (v: hb_font_get_glyph_from_name_func_t)
    inline def value: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], CString, CInt, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_font_get_glyph_func_t: : #hb_font_t to work upon _data: user data pointer : The Unicode code point to query _selector: The variation-selector code point to query : (out): The glyph ID retrieved _data: User data pointer passed by the caller
*/
opaque type hb_font_get_glyph_func_t = CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
object hb_font_get_glyph_func_t: 
  given _tag: Tag[hb_font_get_glyph_func_t] = Tag.materializeCFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_font_get_glyph_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]): hb_font_get_glyph_func_t = o
  extension (v: hb_font_get_glyph_func_t)
    inline def value: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_font_get_glyph_h_advance_func_t:
*/
type hb_font_get_glyph_h_advance_func_t = hb_font_get_glyph_advance_func_t
object hb_font_get_glyph_h_advance_func_t: 
  given _tag: Tag[hb_font_get_glyph_h_advance_func_t] = hb_font_get_glyph_advance_func_t._tag
  inline def apply(inline o: hb_font_get_glyph_advance_func_t): hb_font_get_glyph_h_advance_func_t = o
  extension (v: hb_font_get_glyph_h_advance_func_t)
    inline def value: hb_font_get_glyph_advance_func_t = v

/**
 * hb_font_get_glyph_h_advances_func_t:
*/
type hb_font_get_glyph_h_advances_func_t = hb_font_get_glyph_advances_func_t
object hb_font_get_glyph_h_advances_func_t: 
  given _tag: Tag[hb_font_get_glyph_h_advances_func_t] = hb_font_get_glyph_advances_func_t._tag
  inline def apply(inline o: hb_font_get_glyph_advances_func_t): hb_font_get_glyph_h_advances_func_t = o
  extension (v: hb_font_get_glyph_h_advances_func_t)
    inline def value: hb_font_get_glyph_advances_func_t = v

/**
 * hb_font_get_glyph_h_kerning_func_t:
*/
type hb_font_get_glyph_h_kerning_func_t = hb_font_get_glyph_kerning_func_t
object hb_font_get_glyph_h_kerning_func_t: 
  given _tag: Tag[hb_font_get_glyph_h_kerning_func_t] = hb_font_get_glyph_kerning_func_t._tag
  inline def apply(inline o: hb_font_get_glyph_kerning_func_t): hb_font_get_glyph_h_kerning_func_t = o
  extension (v: hb_font_get_glyph_h_kerning_func_t)
    inline def value: hb_font_get_glyph_kerning_func_t = v

/**
 * hb_font_get_glyph_h_origin_func_t:
*/
type hb_font_get_glyph_h_origin_func_t = hb_font_get_glyph_origin_func_t
object hb_font_get_glyph_h_origin_func_t: 
  given _tag: Tag[hb_font_get_glyph_h_origin_func_t] = hb_font_get_glyph_origin_func_t._tag
  inline def apply(inline o: hb_font_get_glyph_origin_func_t): hb_font_get_glyph_h_origin_func_t = o
  extension (v: hb_font_get_glyph_h_origin_func_t)
    inline def value: hb_font_get_glyph_origin_func_t = v

/**
 * hb_font_get_glyph_kerning_func_t: : #hb_font_t to work upon _data: user data pointer _glyph: The glyph ID of the first glyph in the glyph pair _glyph: The glyph ID of the second glyph in the glyph pair _data: User data pointer passed by the caller
*/
opaque type hb_font_get_glyph_kerning_func_t = CFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[Byte], hb_position_t]
object hb_font_get_glyph_kerning_func_t: 
  given _tag: Tag[hb_font_get_glyph_kerning_func_t] = Tag.materializeCFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[Byte], hb_position_t]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_font_get_glyph_kerning_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[Byte], hb_position_t]): hb_font_get_glyph_kerning_func_t = o
  extension (v: hb_font_get_glyph_kerning_func_t)
    inline def value: CFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[Byte], hb_position_t] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_font_get_glyph_name_func_t: : #hb_font_t to work upon _data: user data pointer : The glyph ID to query : Length of the glyph-name string retrieved _data: User data pointer passed by the caller
*/
opaque type hb_font_get_glyph_name_func_t = CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, CString, CUnsignedInt, Ptr[Byte], hb_bool_t]
object hb_font_get_glyph_name_func_t: 
  given _tag: Tag[hb_font_get_glyph_name_func_t] = Tag.materializeCFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, CString, CUnsignedInt, Ptr[Byte], hb_bool_t]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_font_get_glyph_name_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, CString, CUnsignedInt, Ptr[Byte], hb_bool_t]): hb_font_get_glyph_name_func_t = o
  extension (v: hb_font_get_glyph_name_func_t)
    inline def value: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, CString, CUnsignedInt, Ptr[Byte], hb_bool_t] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_font_get_glyph_origin_func_t: : #hb_font_t to work upon _data: user data pointer : The glyph ID to query : (out): The X coordinate of the origin : (out): The Y coordinate of the origin _data: User data pointer passed by the caller
*/
opaque type hb_font_get_glyph_origin_func_t = CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_position_t], Ptr[hb_position_t], Ptr[Byte], hb_bool_t]
object hb_font_get_glyph_origin_func_t: 
  given _tag: Tag[hb_font_get_glyph_origin_func_t] = Tag.materializeCFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_position_t], Ptr[hb_position_t], Ptr[Byte], hb_bool_t]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_font_get_glyph_origin_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_position_t], Ptr[hb_position_t], Ptr[Byte], hb_bool_t]): hb_font_get_glyph_origin_func_t = o
  extension (v: hb_font_get_glyph_origin_func_t)
    inline def value: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_position_t], Ptr[hb_position_t], Ptr[Byte], hb_bool_t] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_font_get_glyph_shape_func_t: : #hb_font_t to work upon _data: user data pointer : The glyph ID to query _funcs: The draw functions to send the shape data to _data: The data accompanying the draw functions _data: User data pointer passed by the caller
*/
opaque type hb_font_get_glyph_shape_func_t = CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[Byte], Unit]
object hb_font_get_glyph_shape_func_t: 
  given _tag: Tag[hb_font_get_glyph_shape_func_t] = Tag.materializeCFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_font_get_glyph_shape_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[Byte], Unit]): hb_font_get_glyph_shape_func_t = o
  extension (v: hb_font_get_glyph_shape_func_t)
    inline def value: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[Byte], Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_font_get_glyph_v_advance_func_t:
*/
type hb_font_get_glyph_v_advance_func_t = hb_font_get_glyph_advance_func_t
object hb_font_get_glyph_v_advance_func_t: 
  given _tag: Tag[hb_font_get_glyph_v_advance_func_t] = hb_font_get_glyph_advance_func_t._tag
  inline def apply(inline o: hb_font_get_glyph_advance_func_t): hb_font_get_glyph_v_advance_func_t = o
  extension (v: hb_font_get_glyph_v_advance_func_t)
    inline def value: hb_font_get_glyph_advance_func_t = v

/**
 * hb_font_get_glyph_v_advances_func_t:
*/
type hb_font_get_glyph_v_advances_func_t = hb_font_get_glyph_advances_func_t
object hb_font_get_glyph_v_advances_func_t: 
  given _tag: Tag[hb_font_get_glyph_v_advances_func_t] = hb_font_get_glyph_advances_func_t._tag
  inline def apply(inline o: hb_font_get_glyph_advances_func_t): hb_font_get_glyph_v_advances_func_t = o
  extension (v: hb_font_get_glyph_v_advances_func_t)
    inline def value: hb_font_get_glyph_advances_func_t = v

/**
 * hb_font_get_glyph_v_kerning_func_t:
*/
type hb_font_get_glyph_v_kerning_func_t = hb_font_get_glyph_kerning_func_t
object hb_font_get_glyph_v_kerning_func_t: 
  given _tag: Tag[hb_font_get_glyph_v_kerning_func_t] = hb_font_get_glyph_kerning_func_t._tag
  inline def apply(inline o: hb_font_get_glyph_kerning_func_t): hb_font_get_glyph_v_kerning_func_t = o
  extension (v: hb_font_get_glyph_v_kerning_func_t)
    inline def value: hb_font_get_glyph_kerning_func_t = v

/**
 * hb_font_get_glyph_v_origin_func_t:
*/
type hb_font_get_glyph_v_origin_func_t = hb_font_get_glyph_origin_func_t
object hb_font_get_glyph_v_origin_func_t: 
  given _tag: Tag[hb_font_get_glyph_v_origin_func_t] = hb_font_get_glyph_origin_func_t._tag
  inline def apply(inline o: hb_font_get_glyph_origin_func_t): hb_font_get_glyph_v_origin_func_t = o
  extension (v: hb_font_get_glyph_v_origin_func_t)
    inline def value: hb_font_get_glyph_origin_func_t = v

/**
 * hb_font_get_nominal_glyph_func_t: : #hb_font_t to work upon _data: user data pointer : The Unicode code point to query : (out): The glyph ID retrieved _data: User data pointer passed by the caller
*/
opaque type hb_font_get_nominal_glyph_func_t = CFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
object hb_font_get_nominal_glyph_func_t: 
  given _tag: Tag[hb_font_get_nominal_glyph_func_t] = Tag.materializeCFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_font_get_nominal_glyph_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]): hb_font_get_nominal_glyph_func_t = o
  extension (v: hb_font_get_nominal_glyph_func_t)
    inline def value: CFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_font_get_nominal_glyphs_func_t: : #hb_font_t to work upon _data: user data pointer : number of code points to query _unicode: The first Unicode code point to query _stride: The stride between successive code points _glyph: (out): The first glyph ID retrieved _stride: The stride between successive glyph IDs _data: User data pointer passed by the caller
*/
opaque type hb_font_get_nominal_glyphs_func_t = CFuncPtr8[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[Byte], CUnsignedInt]
object hb_font_get_nominal_glyphs_func_t: 
  given _tag: Tag[hb_font_get_nominal_glyphs_func_t] = Tag.materializeCFuncPtr8[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[Byte], CUnsignedInt]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_font_get_nominal_glyphs_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr8[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[Byte], CUnsignedInt]): hb_font_get_nominal_glyphs_func_t = o
  extension (v: hb_font_get_nominal_glyphs_func_t)
    inline def value: CFuncPtr8[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[Byte], CUnsignedInt] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_font_get_variation_glyph_func_t: : #hb_font_t to work upon _data: user data pointer : The Unicode code point to query _selector: The variation-selector code point to query : (out): The glyph ID retrieved _data: User data pointer passed by the caller
*/
opaque type hb_font_get_variation_glyph_func_t = CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
object hb_font_get_variation_glyph_func_t: 
  given _tag: Tag[hb_font_get_variation_glyph_func_t] = Tag.materializeCFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_font_get_variation_glyph_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]): hb_font_get_variation_glyph_func_t = o
  extension (v: hb_font_get_variation_glyph_func_t)
    inline def value: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_font_paint_glyph_func_t: : #hb_font_t to work upon _data: user data pointer : The glyph ID to query _funcs: The paint functions to use _data: The data accompanying the paint functions _index: The color palette to use : The foreground color _data: User data pointer passed by the caller
*/
opaque type hb_font_paint_glyph_func_t = CFuncPtr8[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_paint_funcs_t], Ptr[Byte], CUnsignedInt, hb_color_t, Ptr[Byte], Unit]
object hb_font_paint_glyph_func_t: 
  given _tag: Tag[hb_font_paint_glyph_func_t] = Tag.materializeCFuncPtr8[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_paint_funcs_t], Ptr[Byte], CUnsignedInt, hb_color_t, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_font_paint_glyph_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr8[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_paint_funcs_t], Ptr[Byte], CUnsignedInt, hb_color_t, Ptr[Byte], Unit]): hb_font_paint_glyph_func_t = o
  extension (v: hb_font_paint_glyph_func_t)
    inline def value: CFuncPtr8[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_paint_funcs_t], Ptr[Byte], CUnsignedInt, hb_color_t, Ptr[Byte], Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_language_t:
*/
opaque type hb_language_t = Ptr[hb_language_impl_t]
object hb_language_t: 
  given _tag: Tag[hb_language_t] = Tag.Ptr[hb_language_impl_t](hb_language_impl_t._tag)
  inline def apply(inline o: Ptr[hb_language_impl_t]): hb_language_t = o
  extension (v: hb_language_t)
    inline def value: Ptr[hb_language_impl_t] = v

/**
 * hb_mask_t:
*/
type hb_mask_t = uint32_t
object hb_mask_t: 
  given _tag: Tag[hb_mask_t] = uint32_t._tag
  inline def apply(inline o: uint32_t): hb_mask_t = o
  extension (v: hb_mask_t)
    inline def value: uint32_t = v

/**
 * hb_paint_color_func_t: : paint functions object _data: The data accompanying the paint functions in hb_font_paint_glyph() : The color to use, unpremultiplied _data: User data pointer passed to hb_paint_funcs_set_color_func()
*/
opaque type hb_paint_color_func_t = CFuncPtr5[Ptr[hb_paint_funcs_t], Ptr[Byte], hb_bool_t, hb_color_t, Ptr[Byte], Unit]
object hb_paint_color_func_t: 
  given _tag: Tag[hb_paint_color_func_t] = Tag.materializeCFuncPtr5[Ptr[hb_paint_funcs_t], Ptr[Byte], hb_bool_t, hb_color_t, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_paint_color_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[Ptr[hb_paint_funcs_t], Ptr[Byte], hb_bool_t, hb_color_t, Ptr[Byte], Unit]): hb_paint_color_func_t = o
  extension (v: hb_paint_color_func_t)
    inline def value: CFuncPtr5[Ptr[hb_paint_funcs_t], Ptr[Byte], hb_bool_t, hb_color_t, Ptr[Byte], Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_paint_color_glyph_func_t: : paint functions object _data: The data accompanying the paint functions in hb_font_paint_glyph() : the glyph ID : the font _data: User data pointer passed to hb_paint_funcs_set_color_glyph_func()
*/
opaque type hb_paint_color_glyph_func_t = CFuncPtr5[Ptr[hb_paint_funcs_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_font_t], Ptr[Byte], hb_bool_t]
object hb_paint_color_glyph_func_t: 
  given _tag: Tag[hb_paint_color_glyph_func_t] = Tag.materializeCFuncPtr5[Ptr[hb_paint_funcs_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_font_t], Ptr[Byte], hb_bool_t]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_paint_color_glyph_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[Ptr[hb_paint_funcs_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_font_t], Ptr[Byte], hb_bool_t]): hb_paint_color_glyph_func_t = o
  extension (v: hb_paint_color_glyph_func_t)
    inline def value: CFuncPtr5[Ptr[hb_paint_funcs_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_font_t], Ptr[Byte], hb_bool_t] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_paint_custom_palette_color_func_t: : paint functions object _data: The data accompanying the paint functions in hb_font_paint_glyph() _index: the color index : (out): fetched color _data: User data pointer passed to hb_paint_funcs_set_pop_group_func()
*/
opaque type hb_paint_custom_palette_color_func_t = CFuncPtr5[Ptr[hb_paint_funcs_t], Ptr[Byte], CUnsignedInt, Ptr[hb_color_t], Ptr[Byte], hb_bool_t]
object hb_paint_custom_palette_color_func_t: 
  given _tag: Tag[hb_paint_custom_palette_color_func_t] = Tag.materializeCFuncPtr5[Ptr[hb_paint_funcs_t], Ptr[Byte], CUnsignedInt, Ptr[hb_color_t], Ptr[Byte], hb_bool_t]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_paint_custom_palette_color_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[Ptr[hb_paint_funcs_t], Ptr[Byte], CUnsignedInt, Ptr[hb_color_t], Ptr[Byte], hb_bool_t]): hb_paint_custom_palette_color_func_t = o
  extension (v: hb_paint_custom_palette_color_func_t)
    inline def value: CFuncPtr5[Ptr[hb_paint_funcs_t], Ptr[Byte], CUnsignedInt, Ptr[hb_color_t], Ptr[Byte], hb_bool_t] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_paint_image_func_t: : paint functions object _data: The data accompanying the paint functions in hb_font_paint_glyph() : width of the raster image in pixels, or 0 : height of the raster image in pixels, or 0 : the image format as a tag : the synthetic slant ratio to be applied to the image during rendering : (nullable): glyph extents for desired rendering _data: User data pointer passed to hb_paint_funcs_set_image_func()
*/
opaque type hb_paint_image_func_t = CFuncPtr9[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[hb_blob_t], CUnsignedInt, CUnsignedInt, hb_tag_t, Float, Ptr[hb_glyph_extents_t], Ptr[Byte], hb_bool_t]
object hb_paint_image_func_t: 
  given _tag: Tag[hb_paint_image_func_t] = Tag.materializeCFuncPtr9[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[hb_blob_t], CUnsignedInt, CUnsignedInt, hb_tag_t, Float, Ptr[hb_glyph_extents_t], Ptr[Byte], hb_bool_t]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_paint_image_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr9[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[hb_blob_t], CUnsignedInt, CUnsignedInt, hb_tag_t, Float, Ptr[hb_glyph_extents_t], Ptr[Byte], hb_bool_t]): hb_paint_image_func_t = o
  extension (v: hb_paint_image_func_t)
    inline def value: CFuncPtr9[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[hb_blob_t], CUnsignedInt, CUnsignedInt, hb_tag_t, Float, Ptr[hb_glyph_extents_t], Ptr[Byte], hb_bool_t] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_paint_linear_gradient_func_t: : paint functions object _data: The data accompanying the paint functions in hb_font_paint_glyph() _line: Color information for the gradient : X coordinate of the first point : Y coordinate of the first point : X coordinate of the second point : Y coordinate of the second point : X coordinate of the third point : Y coordinate of the third point _data: User data pointer passed to hb_paint_funcs_set_linear_gradient_func()
*/
opaque type hb_paint_linear_gradient_func_t = CFuncPtr10[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[hb_color_line_t], Float, Float, Float, Float, Float, Float, Ptr[Byte], Unit]
object hb_paint_linear_gradient_func_t: 
  given _tag: Tag[hb_paint_linear_gradient_func_t] = Tag.materializeCFuncPtr10[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[hb_color_line_t], Float, Float, Float, Float, Float, Float, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_paint_linear_gradient_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr10[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[hb_color_line_t], Float, Float, Float, Float, Float, Float, Ptr[Byte], Unit]): hb_paint_linear_gradient_func_t = o
  extension (v: hb_paint_linear_gradient_func_t)
    inline def value: CFuncPtr10[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[hb_color_line_t], Float, Float, Float, Float, Float, Float, Ptr[Byte], Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_paint_pop_clip_func_t: : paint functions object _data: The data accompanying the paint functions in hb_font_paint_glyph() _data: User data pointer passed to hb_paint_funcs_set_pop_clip_func()
*/
opaque type hb_paint_pop_clip_func_t = CFuncPtr3[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[Byte], Unit]
object hb_paint_pop_clip_func_t: 
  given _tag: Tag[hb_paint_pop_clip_func_t] = Tag.materializeCFuncPtr3[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_paint_pop_clip_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[Byte], Unit]): hb_paint_pop_clip_func_t = o
  extension (v: hb_paint_pop_clip_func_t)
    inline def value: CFuncPtr3[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[Byte], Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_paint_pop_group_func_t: : paint functions object _data: The data accompanying the paint functions in hb_font_paint_glyph()
*/
opaque type hb_paint_pop_group_func_t = CFuncPtr4[Ptr[hb_paint_funcs_t], Ptr[Byte], hb_paint_composite_mode_t, Ptr[Byte], Unit]
object hb_paint_pop_group_func_t: 
  given _tag: Tag[hb_paint_pop_group_func_t] = Tag.materializeCFuncPtr4[Ptr[hb_paint_funcs_t], Ptr[Byte], hb_paint_composite_mode_t, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_paint_pop_group_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[hb_paint_funcs_t], Ptr[Byte], hb_paint_composite_mode_t, Ptr[Byte], Unit]): hb_paint_pop_group_func_t = o
  extension (v: hb_paint_pop_group_func_t)
    inline def value: CFuncPtr4[Ptr[hb_paint_funcs_t], Ptr[Byte], hb_paint_composite_mode_t, Ptr[Byte], Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_paint_pop_transform_func_t: : paint functions object _data: The data accompanying the paint functions in hb_font_paint_glyph() _data: User data pointer passed to hb_paint_funcs_set_pop_transform_func()
*/
opaque type hb_paint_pop_transform_func_t = CFuncPtr3[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[Byte], Unit]
object hb_paint_pop_transform_func_t: 
  given _tag: Tag[hb_paint_pop_transform_func_t] = Tag.materializeCFuncPtr3[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_paint_pop_transform_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[Byte], Unit]): hb_paint_pop_transform_func_t = o
  extension (v: hb_paint_pop_transform_func_t)
    inline def value: CFuncPtr3[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[Byte], Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_paint_push_clip_glyph_func_t: : paint functions object _data: The data accompanying the paint functions in hb_font_paint_glyph() : the glyph ID : the font _data: User data pointer passed to hb_paint_funcs_set_push_clip_glyph_func()
*/
opaque type hb_paint_push_clip_glyph_func_t = CFuncPtr5[Ptr[hb_paint_funcs_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_font_t], Ptr[Byte], Unit]
object hb_paint_push_clip_glyph_func_t: 
  given _tag: Tag[hb_paint_push_clip_glyph_func_t] = Tag.materializeCFuncPtr5[Ptr[hb_paint_funcs_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_font_t], Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_paint_push_clip_glyph_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[Ptr[hb_paint_funcs_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_font_t], Ptr[Byte], Unit]): hb_paint_push_clip_glyph_func_t = o
  extension (v: hb_paint_push_clip_glyph_func_t)
    inline def value: CFuncPtr5[Ptr[hb_paint_funcs_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_font_t], Ptr[Byte], Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_paint_push_clip_rectangle_func_t: : paint functions object _data: The data accompanying the paint functions in hb_font_paint_glyph() : min X for the rectangle : min Y for the rectangle : max X for the rectangle : max Y for the rectangle _data: User data pointer passed to hb_paint_funcs_set_push_clip_rectangle_func()
*/
opaque type hb_paint_push_clip_rectangle_func_t = CFuncPtr7[Ptr[hb_paint_funcs_t], Ptr[Byte], Float, Float, Float, Float, Ptr[Byte], Unit]
object hb_paint_push_clip_rectangle_func_t: 
  given _tag: Tag[hb_paint_push_clip_rectangle_func_t] = Tag.materializeCFuncPtr7[Ptr[hb_paint_funcs_t], Ptr[Byte], Float, Float, Float, Float, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_paint_push_clip_rectangle_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[Ptr[hb_paint_funcs_t], Ptr[Byte], Float, Float, Float, Float, Ptr[Byte], Unit]): hb_paint_push_clip_rectangle_func_t = o
  extension (v: hb_paint_push_clip_rectangle_func_t)
    inline def value: CFuncPtr7[Ptr[hb_paint_funcs_t], Ptr[Byte], Float, Float, Float, Float, Ptr[Byte], Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_paint_push_group_func_t: : paint functions object _data: The data accompanying the paint functions in hb_font_paint_glyph() _data: User data pointer passed to hb_paint_funcs_set_push_group_func()
*/
opaque type hb_paint_push_group_func_t = CFuncPtr3[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[Byte], Unit]
object hb_paint_push_group_func_t: 
  given _tag: Tag[hb_paint_push_group_func_t] = Tag.materializeCFuncPtr3[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_paint_push_group_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[Byte], Unit]): hb_paint_push_group_func_t = o
  extension (v: hb_paint_push_group_func_t)
    inline def value: CFuncPtr3[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[Byte], Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_paint_push_transform_func_t: : paint functions object _data: The data accompanying the paint functions in hb_font_paint_glyph() : xx component of the transform matrix : yx component of the transform matrix : xy component of the transform matrix : yy component of the transform matrix : dx component of the transform matrix : dy component of the transform matrix _data: User data pointer passed to hb_paint_funcs_set_push_transform_func()
*/
opaque type hb_paint_push_transform_func_t = CFuncPtr9[Ptr[hb_paint_funcs_t], Ptr[Byte], Float, Float, Float, Float, Float, Float, Ptr[Byte], Unit]
object hb_paint_push_transform_func_t: 
  given _tag: Tag[hb_paint_push_transform_func_t] = Tag.materializeCFuncPtr9[Ptr[hb_paint_funcs_t], Ptr[Byte], Float, Float, Float, Float, Float, Float, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_paint_push_transform_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr9[Ptr[hb_paint_funcs_t], Ptr[Byte], Float, Float, Float, Float, Float, Float, Ptr[Byte], Unit]): hb_paint_push_transform_func_t = o
  extension (v: hb_paint_push_transform_func_t)
    inline def value: CFuncPtr9[Ptr[hb_paint_funcs_t], Ptr[Byte], Float, Float, Float, Float, Float, Float, Ptr[Byte], Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_paint_radial_gradient_func_t: : paint functions object _data: The data accompanying the paint functions in hb_font_paint_glyph() _line: Color information for the gradient : X coordinate of the first circle's center : Y coordinate of the first circle's center : radius of the first circle : X coordinate of the second circle's center : Y coordinate of the second circle's center : radius of the second circle _data: User data pointer passed to hb_paint_funcs_set_radial_gradient_func()
*/
opaque type hb_paint_radial_gradient_func_t = CFuncPtr10[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[hb_color_line_t], Float, Float, Float, Float, Float, Float, Ptr[Byte], Unit]
object hb_paint_radial_gradient_func_t: 
  given _tag: Tag[hb_paint_radial_gradient_func_t] = Tag.materializeCFuncPtr10[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[hb_color_line_t], Float, Float, Float, Float, Float, Float, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_paint_radial_gradient_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr10[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[hb_color_line_t], Float, Float, Float, Float, Float, Float, Ptr[Byte], Unit]): hb_paint_radial_gradient_func_t = o
  extension (v: hb_paint_radial_gradient_func_t)
    inline def value: CFuncPtr10[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[hb_color_line_t], Float, Float, Float, Float, Float, Float, Ptr[Byte], Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_paint_sweep_gradient_func_t: : paint functions object _data: The data accompanying the paint functions in hb_font_paint_glyph() _line: Color information for the gradient : X coordinate of the circle's center : Y coordinate of the circle's center _angle: the start angle, in radians _angle: the end angle, in radians _data: User data pointer passed to hb_paint_funcs_set_sweep_gradient_func()
*/
opaque type hb_paint_sweep_gradient_func_t = CFuncPtr8[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[hb_color_line_t], Float, Float, Float, Float, Ptr[Byte], Unit]
object hb_paint_sweep_gradient_func_t: 
  given _tag: Tag[hb_paint_sweep_gradient_func_t] = Tag.materializeCFuncPtr8[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[hb_color_line_t], Float, Float, Float, Float, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_paint_sweep_gradient_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr8[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[hb_color_line_t], Float, Float, Float, Float, Ptr[Byte], Unit]): hb_paint_sweep_gradient_func_t = o
  extension (v: hb_paint_sweep_gradient_func_t)
    inline def value: CFuncPtr8[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[hb_color_line_t], Float, Float, Float, Float, Ptr[Byte], Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_position_t:
*/
type hb_position_t = int32_t
object hb_position_t: 
  given _tag: Tag[hb_position_t] = int32_t._tag
  inline def apply(inline o: int32_t): hb_position_t = o
  extension (v: hb_position_t)
    inline def value: int32_t = v

/**
 * hb_reference_table_func_t: : an #hb_face_t to reference table for : the tag of the table to reference _data: User data pointer passed by the caller
*/
opaque type hb_reference_table_func_t = CFuncPtr3[Ptr[hb_face_t], hb_tag_t, Ptr[Byte], Ptr[hb_blob_t]]
object hb_reference_table_func_t: 
  given _tag: Tag[hb_reference_table_func_t] = Tag.materializeCFuncPtr3[Ptr[hb_face_t], hb_tag_t, Ptr[Byte], Ptr[hb_blob_t]]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_reference_table_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[hb_face_t], hb_tag_t, Ptr[Byte], Ptr[hb_blob_t]]): hb_reference_table_func_t = o
  extension (v: hb_reference_table_func_t)
    inline def value: CFuncPtr3[Ptr[hb_face_t], hb_tag_t, Ptr[Byte], Ptr[hb_blob_t]] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_tag_t:
*/
type hb_tag_t = uint32_t
object hb_tag_t: 
  given _tag: Tag[hb_tag_t] = uint32_t._tag
  inline def apply(inline o: uint32_t): hb_tag_t = o
  extension (v: hb_tag_t)
    inline def value: uint32_t = v

/**
 * hb_unicode_combining_class_func_t: : A Unicode-functions structure : The code point to query _data: User data pointer passed by the caller
*/
opaque type hb_unicode_combining_class_func_t = CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_unicode_combining_class_t]
object hb_unicode_combining_class_func_t: 
  given _tag: Tag[hb_unicode_combining_class_func_t] = Tag.materializeCFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_unicode_combining_class_t]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_unicode_combining_class_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_unicode_combining_class_t]): hb_unicode_combining_class_func_t = o
  extension (v: hb_unicode_combining_class_func_t)
    inline def value: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_unicode_combining_class_t] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_unicode_compose_func_t: : A Unicode-functions structure : The first code point to compose : The second code point to compose : (out): The composed code point _data: user data pointer passed by the caller
*/
opaque type hb_unicode_compose_func_t = CFuncPtr5[Ptr[hb_unicode_funcs_t], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
object hb_unicode_compose_func_t: 
  given _tag: Tag[hb_unicode_compose_func_t] = Tag.materializeCFuncPtr5[Ptr[hb_unicode_funcs_t], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_unicode_compose_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[Ptr[hb_unicode_funcs_t], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]): hb_unicode_compose_func_t = o
  extension (v: hb_unicode_compose_func_t)
    inline def value: CFuncPtr5[Ptr[hb_unicode_funcs_t], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_unicode_decompose_compatibility_func_t: : a Unicode function structure : codepoint to decompose : address of codepoint array (of length #HB_UNICODE_MAX_DECOMPOSITION_LEN) to write decomposition into _data: user data pointer as passed to hb_unicode_funcs_set_decompose_compatibility_func()
*/
opaque type hb_unicode_decompose_compatibility_func_t = CFuncPtr4[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], CUnsignedInt]
object hb_unicode_decompose_compatibility_func_t: 
  given _tag: Tag[hb_unicode_decompose_compatibility_func_t] = Tag.materializeCFuncPtr4[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], CUnsignedInt]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_unicode_decompose_compatibility_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], CUnsignedInt]): hb_unicode_decompose_compatibility_func_t = o
  extension (v: hb_unicode_decompose_compatibility_func_t)
    inline def value: CFuncPtr4[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], CUnsignedInt] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_unicode_decompose_func_t: : A Unicode-functions structure : The code point to decompose : (out): The first decomposed code point : (out): The second decomposed code point _data: user data pointer passed by the caller
*/
opaque type hb_unicode_decompose_func_t = CFuncPtr5[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
object hb_unicode_decompose_func_t: 
  given _tag: Tag[hb_unicode_decompose_func_t] = Tag.materializeCFuncPtr5[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_unicode_decompose_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]): hb_unicode_decompose_func_t = o
  extension (v: hb_unicode_decompose_func_t)
    inline def value: CFuncPtr5[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_unicode_eastasian_width_func_t: : A Unicode-functions structure : The code point to query _data: User data pointer passed by the caller
*/
opaque type hb_unicode_eastasian_width_func_t = CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], CUnsignedInt]
object hb_unicode_eastasian_width_func_t: 
  given _tag: Tag[hb_unicode_eastasian_width_func_t] = Tag.materializeCFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], CUnsignedInt]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_unicode_eastasian_width_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], CUnsignedInt]): hb_unicode_eastasian_width_func_t = o
  extension (v: hb_unicode_eastasian_width_func_t)
    inline def value: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], CUnsignedInt] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_unicode_general_category_func_t: : A Unicode-functions structure : The code point to query _data: User data pointer passed by the caller
*/
opaque type hb_unicode_general_category_func_t = CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_unicode_general_category_t]
object hb_unicode_general_category_func_t: 
  given _tag: Tag[hb_unicode_general_category_func_t] = Tag.materializeCFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_unicode_general_category_t]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_unicode_general_category_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_unicode_general_category_t]): hb_unicode_general_category_func_t = o
  extension (v: hb_unicode_general_category_func_t)
    inline def value: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_unicode_general_category_t] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_unicode_mirroring_func_t: : A Unicode-functions structure : The code point to query _data: User data pointer passed by the caller
*/
opaque type hb_unicode_mirroring_func_t = CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_codepoint_t]
object hb_unicode_mirroring_func_t: 
  given _tag: Tag[hb_unicode_mirroring_func_t] = Tag.materializeCFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_codepoint_t]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_unicode_mirroring_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_codepoint_t]): hb_unicode_mirroring_func_t = o
  extension (v: hb_unicode_mirroring_func_t)
    inline def value: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_codepoint_t] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * hb_unicode_script_func_t: : A Unicode-functions structure : The code point to query _data: User data pointer passed by the caller
*/
opaque type hb_unicode_script_func_t = CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_script_t]
object hb_unicode_script_func_t: 
  given _tag: Tag[hb_unicode_script_func_t] = Tag.materializeCFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_script_t]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): hb_unicode_script_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_script_t]): hb_unicode_script_func_t = o
  extension (v: hb_unicode_script_func_t)
    inline def value: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_script_t] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

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