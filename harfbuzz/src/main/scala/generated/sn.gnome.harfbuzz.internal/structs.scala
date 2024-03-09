package sn.gnome.harfbuzz.internal

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type hb_blob_t = CStruct0
object hb_blob_t:
  given _tag: Tag[hb_blob_t] = Tag.materializeCStruct0Tag

opaque type hb_buffer_t = CStruct0
object hb_buffer_t:
  given _tag: Tag[hb_buffer_t] = Tag.materializeCStruct0Tag

/**
 * hb_color_line_t:
*/
opaque type hb_color_line_t = CStruct13[Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte]]
object hb_color_line_t:
  given _tag: Tag[hb_color_line_t] = Tag.materializeCStruct13Tag[Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte]]
  def apply()(using Zone): Ptr[hb_color_line_t] = scala.scalanative.unsafe.alloc[hb_color_line_t](1)
  def apply(data : Ptr[Byte], get_color_stops : hb_color_line_get_color_stops_func_t, get_color_stops_user_data : Ptr[Byte], get_extend : hb_color_line_get_extend_func_t, get_extend_user_data : Ptr[Byte], reserved0 : Ptr[Byte], reserved1 : Ptr[Byte], reserved2 : Ptr[Byte], reserved3 : Ptr[Byte], reserved5 : Ptr[Byte], reserved6 : Ptr[Byte], reserved7 : Ptr[Byte], reserved8 : Ptr[Byte])(using Zone): Ptr[hb_color_line_t] = 
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).get_color_stops = get_color_stops
    (!____ptr).get_color_stops_user_data = get_color_stops_user_data
    (!____ptr).get_extend = get_extend
    (!____ptr).get_extend_user_data = get_extend_user_data
    (!____ptr).reserved0 = reserved0
    (!____ptr).reserved1 = reserved1
    (!____ptr).reserved2 = reserved2
    (!____ptr).reserved3 = reserved3
    (!____ptr).reserved5 = reserved5
    (!____ptr).reserved6 = reserved6
    (!____ptr).reserved7 = reserved7
    (!____ptr).reserved8 = reserved8
    ____ptr
  extension (struct: hb_color_line_t)
    def data : Ptr[Byte] = struct._1
    def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
    def get_color_stops : hb_color_line_get_color_stops_func_t = struct._2.asInstanceOf[hb_color_line_get_color_stops_func_t]
    def get_color_stops_=(value: hb_color_line_get_color_stops_func_t): Unit = !struct.at2 = value.asInstanceOf[Ptr[Byte]]
    def get_color_stops_user_data : Ptr[Byte] = struct._3
    def get_color_stops_user_data_=(value: Ptr[Byte]): Unit = !struct.at3 = value
    def get_extend : hb_color_line_get_extend_func_t = struct._4.asInstanceOf[hb_color_line_get_extend_func_t]
    def get_extend_=(value: hb_color_line_get_extend_func_t): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
    def get_extend_user_data : Ptr[Byte] = struct._5
    def get_extend_user_data_=(value: Ptr[Byte]): Unit = !struct.at5 = value
    def reserved0 : Ptr[Byte] = struct._6
    def reserved0_=(value: Ptr[Byte]): Unit = !struct.at6 = value
    def reserved1 : Ptr[Byte] = struct._7
    def reserved1_=(value: Ptr[Byte]): Unit = !struct.at7 = value
    def reserved2 : Ptr[Byte] = struct._8
    def reserved2_=(value: Ptr[Byte]): Unit = !struct.at8 = value
    def reserved3 : Ptr[Byte] = struct._9
    def reserved3_=(value: Ptr[Byte]): Unit = !struct.at9 = value
    def reserved5 : Ptr[Byte] = struct._10
    def reserved5_=(value: Ptr[Byte]): Unit = !struct.at10 = value
    def reserved6 : Ptr[Byte] = struct._11
    def reserved6_=(value: Ptr[Byte]): Unit = !struct.at11 = value
    def reserved7 : Ptr[Byte] = struct._12
    def reserved7_=(value: Ptr[Byte]): Unit = !struct.at12 = value
    def reserved8 : Ptr[Byte] = struct._13
    def reserved8_=(value: Ptr[Byte]): Unit = !struct.at13 = value

/**
 * hb_color_stop_t: : the offset of the color stop : the color, unpremultiplied
*/
opaque type hb_color_stop_t = CStruct3[Float, hb_bool_t, hb_color_t]
object hb_color_stop_t:
  given _tag: Tag[hb_color_stop_t] = Tag.materializeCStruct3Tag[Float, hb_bool_t, hb_color_t]
  def apply()(using Zone): Ptr[hb_color_stop_t] = scala.scalanative.unsafe.alloc[hb_color_stop_t](1)
  def apply(offset : Float, is_foreground : hb_bool_t, color : hb_color_t)(using Zone): Ptr[hb_color_stop_t] = 
    val ____ptr = apply()
    (!____ptr).offset = offset
    (!____ptr).is_foreground = is_foreground
    (!____ptr).color = color
    ____ptr
  extension (struct: hb_color_stop_t)
    def offset : Float = struct._1
    def offset_=(value: Float): Unit = !struct.at1 = value
    def is_foreground : hb_bool_t = struct._2
    def is_foreground_=(value: hb_bool_t): Unit = !struct.at2 = value
    def color : hb_color_t = struct._3
    def color_=(value: hb_color_t): Unit = !struct.at3 = value

opaque type hb_draw_funcs_t = CStruct0
object hb_draw_funcs_t:
  given _tag: Tag[hb_draw_funcs_t] = Tag.materializeCStruct0Tag

/**
 * hb_draw_state_t _open: Whether there is an open path _start_x: X component of the start of current path _start_y: Y component of the start of current path _x: X component of current point _y: Y component of current point
*/
opaque type hb_draw_state_t = CStruct12[hb_bool_t, Float, Float, Float, Float, hb_var_num_t, hb_var_num_t, hb_var_num_t, hb_var_num_t, hb_var_num_t, hb_var_num_t, hb_var_num_t]
object hb_draw_state_t:
  given _tag: Tag[hb_draw_state_t] = Tag.materializeCStruct12Tag[hb_bool_t, Float, Float, Float, Float, hb_var_num_t, hb_var_num_t, hb_var_num_t, hb_var_num_t, hb_var_num_t, hb_var_num_t, hb_var_num_t]
  def apply()(using Zone): Ptr[hb_draw_state_t] = scala.scalanative.unsafe.alloc[hb_draw_state_t](1)
  def apply(path_open : hb_bool_t, path_start_x : Float, path_start_y : Float, current_x : Float, current_y : Float, reserved1 : hb_var_num_t, reserved2 : hb_var_num_t, reserved3 : hb_var_num_t, reserved4 : hb_var_num_t, reserved5 : hb_var_num_t, reserved6 : hb_var_num_t, reserved7 : hb_var_num_t)(using Zone): Ptr[hb_draw_state_t] = 
    val ____ptr = apply()
    (!____ptr).path_open = path_open
    (!____ptr).path_start_x = path_start_x
    (!____ptr).path_start_y = path_start_y
    (!____ptr).current_x = current_x
    (!____ptr).current_y = current_y
    (!____ptr).reserved1 = reserved1
    (!____ptr).reserved2 = reserved2
    (!____ptr).reserved3 = reserved3
    (!____ptr).reserved4 = reserved4
    (!____ptr).reserved5 = reserved5
    (!____ptr).reserved6 = reserved6
    (!____ptr).reserved7 = reserved7
    ____ptr
  extension (struct: hb_draw_state_t)
    def path_open : hb_bool_t = struct._1
    def path_open_=(value: hb_bool_t): Unit = !struct.at1 = value
    def path_start_x : Float = struct._2
    def path_start_x_=(value: Float): Unit = !struct.at2 = value
    def path_start_y : Float = struct._3
    def path_start_y_=(value: Float): Unit = !struct.at3 = value
    def current_x : Float = struct._4
    def current_x_=(value: Float): Unit = !struct.at4 = value
    def current_y : Float = struct._5
    def current_y_=(value: Float): Unit = !struct.at5 = value
    def reserved1 : hb_var_num_t = struct._6
    def reserved1_=(value: hb_var_num_t): Unit = !struct.at6 = value
    def reserved2 : hb_var_num_t = struct._7
    def reserved2_=(value: hb_var_num_t): Unit = !struct.at7 = value
    def reserved3 : hb_var_num_t = struct._8
    def reserved3_=(value: hb_var_num_t): Unit = !struct.at8 = value
    def reserved4 : hb_var_num_t = struct._9
    def reserved4_=(value: hb_var_num_t): Unit = !struct.at9 = value
    def reserved5 : hb_var_num_t = struct._10
    def reserved5_=(value: hb_var_num_t): Unit = !struct.at10 = value
    def reserved6 : hb_var_num_t = struct._11
    def reserved6_=(value: hb_var_num_t): Unit = !struct.at11 = value
    def reserved7 : hb_var_num_t = struct._12
    def reserved7_=(value: hb_var_num_t): Unit = !struct.at12 = value

opaque type hb_face_t = CStruct0
object hb_face_t:
  given _tag: Tag[hb_face_t] = Tag.materializeCStruct0Tag

/**
 * hb_feature_t: : The #hb_tag_t tag of the feature : The value of the feature. 0 disables the feature, non-zero (usually 1) enables the feature. For features implemented as lookup type 3 (like 'salt') the is a one based index into the alternates. : the cluster to start applying this feature setting (inclusive). : the cluster to end applying this feature setting (exclusive).
*/
opaque type hb_feature_t = CStruct4[hb_tag_t, uint32_t, CUnsignedInt, CUnsignedInt]
object hb_feature_t:
  given _tag: Tag[hb_feature_t] = Tag.materializeCStruct4Tag[hb_tag_t, uint32_t, CUnsignedInt, CUnsignedInt]
  def apply()(using Zone): Ptr[hb_feature_t] = scala.scalanative.unsafe.alloc[hb_feature_t](1)
  def apply(tag : hb_tag_t, value : uint32_t, start : CUnsignedInt, end : CUnsignedInt)(using Zone): Ptr[hb_feature_t] = 
    val ____ptr = apply()
    (!____ptr).tag = tag
    (!____ptr).value = value
    (!____ptr).start = start
    (!____ptr).end = end
    ____ptr
  extension (struct: hb_feature_t)
    def tag : hb_tag_t = struct._1
    def tag_=(value: hb_tag_t): Unit = !struct.at1 = value
    def value : uint32_t = struct._2
    def value_=(value: uint32_t): Unit = !struct.at2 = value
    def start : CUnsignedInt = struct._3
    def start_=(value: CUnsignedInt): Unit = !struct.at3 = value
    def end : CUnsignedInt = struct._4
    def end_=(value: CUnsignedInt): Unit = !struct.at4 = value

/**
 * hb_font_extents_t: : The height of typographic ascenders. : The depth of typographic descenders.
*/
opaque type hb_font_extents_t = CStruct12[hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t]
object hb_font_extents_t:
  given _tag: Tag[hb_font_extents_t] = Tag.materializeCStruct12Tag[hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t]
  def apply()(using Zone): Ptr[hb_font_extents_t] = scala.scalanative.unsafe.alloc[hb_font_extents_t](1)
  def apply(ascender : hb_position_t, descender : hb_position_t, line_gap : hb_position_t, reserved9 : hb_position_t, reserved8 : hb_position_t, reserved7 : hb_position_t, reserved6 : hb_position_t, reserved5 : hb_position_t, reserved4 : hb_position_t, reserved3 : hb_position_t, reserved2 : hb_position_t, reserved1 : hb_position_t)(using Zone): Ptr[hb_font_extents_t] = 
    val ____ptr = apply()
    (!____ptr).ascender = ascender
    (!____ptr).descender = descender
    (!____ptr).line_gap = line_gap
    (!____ptr).reserved9 = reserved9
    (!____ptr).reserved8 = reserved8
    (!____ptr).reserved7 = reserved7
    (!____ptr).reserved6 = reserved6
    (!____ptr).reserved5 = reserved5
    (!____ptr).reserved4 = reserved4
    (!____ptr).reserved3 = reserved3
    (!____ptr).reserved2 = reserved2
    (!____ptr).reserved1 = reserved1
    ____ptr
  extension (struct: hb_font_extents_t)
    def ascender : hb_position_t = struct._1
    def ascender_=(value: hb_position_t): Unit = !struct.at1 = value
    def descender : hb_position_t = struct._2
    def descender_=(value: hb_position_t): Unit = !struct.at2 = value
    def line_gap : hb_position_t = struct._3
    def line_gap_=(value: hb_position_t): Unit = !struct.at3 = value
    def reserved9 : hb_position_t = struct._4
    def reserved9_=(value: hb_position_t): Unit = !struct.at4 = value
    def reserved8 : hb_position_t = struct._5
    def reserved8_=(value: hb_position_t): Unit = !struct.at5 = value
    def reserved7 : hb_position_t = struct._6
    def reserved7_=(value: hb_position_t): Unit = !struct.at6 = value
    def reserved6 : hb_position_t = struct._7
    def reserved6_=(value: hb_position_t): Unit = !struct.at7 = value
    def reserved5 : hb_position_t = struct._8
    def reserved5_=(value: hb_position_t): Unit = !struct.at8 = value
    def reserved4 : hb_position_t = struct._9
    def reserved4_=(value: hb_position_t): Unit = !struct.at9 = value
    def reserved3 : hb_position_t = struct._10
    def reserved3_=(value: hb_position_t): Unit = !struct.at10 = value
    def reserved2 : hb_position_t = struct._11
    def reserved2_=(value: hb_position_t): Unit = !struct.at11 = value
    def reserved1 : hb_position_t = struct._12
    def reserved1_=(value: hb_position_t): Unit = !struct.at12 = value

opaque type hb_font_funcs_t = CStruct0
object hb_font_funcs_t:
  given _tag: Tag[hb_font_funcs_t] = Tag.materializeCStruct0Tag

opaque type hb_font_t = CStruct0
object hb_font_t:
  given _tag: Tag[hb_font_t] = Tag.materializeCStruct0Tag

/**
 * hb_glyph_extents_t: _bearing: Distance from the x-origin to the left extremum of the glyph. _bearing: Distance from the top extremum of the glyph to the y-origin. : Distance from the left extremum of the glyph to the right extremum. : Distance from the top extremum of the glyph to the bottom extremum.
*/
opaque type hb_glyph_extents_t = CStruct4[hb_position_t, hb_position_t, hb_position_t, hb_position_t]
object hb_glyph_extents_t:
  given _tag: Tag[hb_glyph_extents_t] = Tag.materializeCStruct4Tag[hb_position_t, hb_position_t, hb_position_t, hb_position_t]
  def apply()(using Zone): Ptr[hb_glyph_extents_t] = scala.scalanative.unsafe.alloc[hb_glyph_extents_t](1)
  def apply(x_bearing : hb_position_t, y_bearing : hb_position_t, width : hb_position_t, height : hb_position_t)(using Zone): Ptr[hb_glyph_extents_t] = 
    val ____ptr = apply()
    (!____ptr).x_bearing = x_bearing
    (!____ptr).y_bearing = y_bearing
    (!____ptr).width = width
    (!____ptr).height = height
    ____ptr
  extension (struct: hb_glyph_extents_t)
    def x_bearing : hb_position_t = struct._1
    def x_bearing_=(value: hb_position_t): Unit = !struct.at1 = value
    def y_bearing : hb_position_t = struct._2
    def y_bearing_=(value: hb_position_t): Unit = !struct.at2 = value
    def width : hb_position_t = struct._3
    def width_=(value: hb_position_t): Unit = !struct.at3 = value
    def height : hb_position_t = struct._4
    def height_=(value: hb_position_t): Unit = !struct.at4 = value

/**
 * hb_glyph_info_t: : either a Unicode code point (before shaping) or a glyph index (after shaping). : the index of the character in the original text that corresponds to this #hb_glyph_info_t, or whatever the client passes to hb_buffer_add(). More than one #hb_glyph_info_t can have the same value, if they resulted from the same character (e.g. one to many glyph substitution), and when more than one character gets merged in the same glyph (e.g. many to one glyph substitution) the #hb_glyph_info_t will have the smallest cluster value of them. By default some characters are merged into the same cluster (e.g. combining marks have the same cluster as their bases) even if they are separate glyphs, hb_buffer_set_cluster_level() allow selecting more fine-grained cluster handling.
*/
opaque type hb_glyph_info_t = CStruct5[hb_codepoint_t, hb_mask_t, uint32_t, hb_var_int_t, hb_var_int_t]
object hb_glyph_info_t:
  given _tag: Tag[hb_glyph_info_t] = Tag.materializeCStruct5Tag[hb_codepoint_t, hb_mask_t, uint32_t, hb_var_int_t, hb_var_int_t]
  def apply()(using Zone): Ptr[hb_glyph_info_t] = scala.scalanative.unsafe.alloc[hb_glyph_info_t](1)
  def apply(codepoint : hb_codepoint_t, mask : hb_mask_t, cluster : uint32_t, var1 : hb_var_int_t, var2 : hb_var_int_t)(using Zone): Ptr[hb_glyph_info_t] = 
    val ____ptr = apply()
    (!____ptr).codepoint = codepoint
    (!____ptr).mask = mask
    (!____ptr).cluster = cluster
    (!____ptr).var1 = var1
    (!____ptr).var2 = var2
    ____ptr
  extension (struct: hb_glyph_info_t)
    def codepoint : hb_codepoint_t = struct._1
    def codepoint_=(value: hb_codepoint_t): Unit = !struct.at1 = value
    def mask : hb_mask_t = struct._2
    def mask_=(value: hb_mask_t): Unit = !struct.at2 = value
    def cluster : uint32_t = struct._3
    def cluster_=(value: uint32_t): Unit = !struct.at3 = value
    def var1 : hb_var_int_t = struct._4
    def var1_=(value: hb_var_int_t): Unit = !struct.at4 = value
    def var2 : hb_var_int_t = struct._5
    def var2_=(value: hb_var_int_t): Unit = !struct.at5 = value

/**
 * hb_glyph_position_t: _advance: how much the line advances after drawing this glyph when setting text in horizontal direction. _advance: how much the line advances after drawing this glyph when setting text in vertical direction. _offset: how much the glyph moves on the X-axis before drawing it, this should not affect how much the line advances. _offset: how much the glyph moves on the Y-axis before drawing it, this should not affect how much the line advances.
*/
opaque type hb_glyph_position_t = CStruct5[hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_var_int_t]
object hb_glyph_position_t:
  given _tag: Tag[hb_glyph_position_t] = Tag.materializeCStruct5Tag[hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_var_int_t]
  def apply()(using Zone): Ptr[hb_glyph_position_t] = scala.scalanative.unsafe.alloc[hb_glyph_position_t](1)
  def apply(x_advance : hb_position_t, y_advance : hb_position_t, x_offset : hb_position_t, y_offset : hb_position_t, `var` : hb_var_int_t)(using Zone): Ptr[hb_glyph_position_t] = 
    val ____ptr = apply()
    (!____ptr).x_advance = x_advance
    (!____ptr).y_advance = y_advance
    (!____ptr).x_offset = x_offset
    (!____ptr).y_offset = y_offset
    (!____ptr).`var` = `var`
    ____ptr
  extension (struct: hb_glyph_position_t)
    def x_advance : hb_position_t = struct._1
    def x_advance_=(value: hb_position_t): Unit = !struct.at1 = value
    def y_advance : hb_position_t = struct._2
    def y_advance_=(value: hb_position_t): Unit = !struct.at2 = value
    def x_offset : hb_position_t = struct._3
    def x_offset_=(value: hb_position_t): Unit = !struct.at3 = value
    def y_offset : hb_position_t = struct._4
    def y_offset_=(value: hb_position_t): Unit = !struct.at4 = value
    def `var` : hb_var_int_t = struct._5
    def var_=(value: hb_var_int_t): Unit = !struct.at5 = value

opaque type hb_language_impl_t = CStruct0
object hb_language_impl_t:
  given _tag: Tag[hb_language_impl_t] = Tag.materializeCStruct0Tag

opaque type hb_map_t = CStruct0
object hb_map_t:
  given _tag: Tag[hb_map_t] = Tag.materializeCStruct0Tag

opaque type hb_paint_funcs_t = CStruct0
object hb_paint_funcs_t:
  given _tag: Tag[hb_paint_funcs_t] = Tag.materializeCStruct0Tag

/**
 * hb_segment_properties_t: : the #hb_direction_t of the buffer, see hb_buffer_set_direction(). : the #hb_script_t of the buffer, see hb_buffer_set_script(). : the #hb_language_t of the buffer, see hb_buffer_set_language().
*/
opaque type hb_segment_properties_t = CStruct5[hb_direction_t, hb_script_t, hb_language_t, Ptr[Byte], Ptr[Byte]]
object hb_segment_properties_t:
  given _tag: Tag[hb_segment_properties_t] = Tag.materializeCStruct5Tag[hb_direction_t, hb_script_t, hb_language_t, Ptr[Byte], Ptr[Byte]]
  def apply()(using Zone): Ptr[hb_segment_properties_t] = scala.scalanative.unsafe.alloc[hb_segment_properties_t](1)
  def apply(direction : hb_direction_t, script : hb_script_t, language : hb_language_t, reserved1 : Ptr[Byte], reserved2 : Ptr[Byte])(using Zone): Ptr[hb_segment_properties_t] = 
    val ____ptr = apply()
    (!____ptr).direction = direction
    (!____ptr).script = script
    (!____ptr).language = language
    (!____ptr).reserved1 = reserved1
    (!____ptr).reserved2 = reserved2
    ____ptr
  extension (struct: hb_segment_properties_t)
    def direction : hb_direction_t = struct._1
    def direction_=(value: hb_direction_t): Unit = !struct.at1 = value
    def script : hb_script_t = struct._2
    def script_=(value: hb_script_t): Unit = !struct.at2 = value
    def language : hb_language_t = struct._3
    def language_=(value: hb_language_t): Unit = !struct.at3 = value
    def reserved1 : Ptr[Byte] = struct._4
    def reserved1_=(value: Ptr[Byte]): Unit = !struct.at4 = value
    def reserved2 : Ptr[Byte] = struct._5
    def reserved2_=(value: Ptr[Byte]): Unit = !struct.at5 = value

opaque type hb_set_t = CStruct0
object hb_set_t:
  given _tag: Tag[hb_set_t] = Tag.materializeCStruct0Tag

opaque type hb_shape_plan_t = CStruct0
object hb_shape_plan_t:
  given _tag: Tag[hb_shape_plan_t] = Tag.materializeCStruct0Tag

opaque type hb_unicode_funcs_t = CStruct0
object hb_unicode_funcs_t:
  given _tag: Tag[hb_unicode_funcs_t] = Tag.materializeCStruct0Tag

/**
 * hb_user_data_key_t:
*/
opaque type hb_user_data_key_t = CStruct1[CChar]
object hb_user_data_key_t:
  given _tag: Tag[hb_user_data_key_t] = Tag.materializeCStruct1Tag[CChar]
  def apply()(using Zone): Ptr[hb_user_data_key_t] = scala.scalanative.unsafe.alloc[hb_user_data_key_t](1)
  def apply(unused : CChar)(using Zone): Ptr[hb_user_data_key_t] = 
    val ____ptr = apply()
    (!____ptr).unused = unused
    ____ptr
  extension (struct: hb_user_data_key_t)
    def unused : CChar = struct._1
    def unused_=(value: CChar): Unit = !struct.at1 = value

/**
 * hb_variation_t: : The #hb_tag_t tag of the variation-axis name : The value of the variation axis
*/
opaque type hb_variation_t = CStruct2[hb_tag_t, Float]
object hb_variation_t:
  given _tag: Tag[hb_variation_t] = Tag.materializeCStruct2Tag[hb_tag_t, Float]
  def apply()(using Zone): Ptr[hb_variation_t] = scala.scalanative.unsafe.alloc[hb_variation_t](1)
  def apply(tag : hb_tag_t, value : Float)(using Zone): Ptr[hb_variation_t] = 
    val ____ptr = apply()
    (!____ptr).tag = tag
    (!____ptr).value = value
    ____ptr
  extension (struct: hb_variation_t)
    def tag : hb_tag_t = struct._1
    def tag_=(value: hb_tag_t): Unit = !struct.at1 = value
    def value : Float = struct._2
    def value_=(value: Float): Unit = !struct.at2 = value