package libharfbuzz
package functions

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

import _root_.libharfbuzz.enumerations.*
import _root_.libharfbuzz.aliases.*
import _root_.libharfbuzz.structs.*
import _root_.libharfbuzz.unions.*


@extern
private[libharfbuzz] object extern_functions:
  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-blob.h
  */
  def hb_blob_copy_writable_or_fail(blob : Ptr[hb_blob_t]): Ptr[hb_blob_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-blob.h
  */
  def hb_blob_create(data : CString, length : CUnsignedInt, mode : hb_memory_mode_t, user_data : Ptr[Byte], destroy : hb_destroy_func_t): Ptr[hb_blob_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-blob.h
  */
  def hb_blob_create_from_file(file_name : CString): Ptr[hb_blob_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-blob.h
  */
  def hb_blob_create_sub_blob(parent : Ptr[hb_blob_t], offset : CUnsignedInt, length : CUnsignedInt): Ptr[hb_blob_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-blob.h
  */
  def hb_blob_destroy(blob : Ptr[hb_blob_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-blob.h
  */
  def hb_blob_get_data(blob : Ptr[hb_blob_t], length : Ptr[CUnsignedInt]): CString = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-blob.h
  */
  def hb_blob_get_data_writable(blob : Ptr[hb_blob_t], length : Ptr[CUnsignedInt]): CString = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-blob.h
  */
  def hb_blob_get_empty(): Ptr[hb_blob_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-blob.h
  */
  def hb_blob_get_length(blob : Ptr[hb_blob_t]): CUnsignedInt = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-blob.h
  */
  def hb_blob_get_user_data(blob : Ptr[hb_blob_t], key : Ptr[hb_user_data_key_t]): Ptr[Byte] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-blob.h
  */
  def hb_blob_is_immutable(blob : Ptr[hb_blob_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-blob.h
  */
  def hb_blob_make_immutable(blob : Ptr[hb_blob_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-blob.h
  */
  def hb_blob_reference(blob : Ptr[hb_blob_t]): Ptr[hb_blob_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-blob.h
  */
  def hb_blob_set_user_data(blob : Ptr[hb_blob_t], key : Ptr[hb_user_data_key_t], data : Ptr[Byte], destroy : hb_destroy_func_t, replace : hb_bool_t): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_add(buffer : Ptr[hb_buffer_t], codepoint : hb_codepoint_t, cluster : CUnsignedInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_add_codepoints(buffer : Ptr[hb_buffer_t], text : Ptr[hb_codepoint_t], text_length : CInt, item_offset : CUnsignedInt, item_length : CInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_add_latin1(buffer : Ptr[hb_buffer_t], text : Ptr[uint8_t], text_length : CInt, item_offset : CUnsignedInt, item_length : CInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_add_utf16(buffer : Ptr[hb_buffer_t], text : Ptr[uint16_t], text_length : CInt, item_offset : CUnsignedInt, item_length : CInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_add_utf32(buffer : Ptr[hb_buffer_t], text : Ptr[uint32_t], text_length : CInt, item_offset : CUnsignedInt, item_length : CInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_add_utf8(buffer : Ptr[hb_buffer_t], text : CString, text_length : CInt, item_offset : CUnsignedInt, item_length : CInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_allocation_successful(buffer : Ptr[hb_buffer_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_append(buffer : Ptr[hb_buffer_t], source : Ptr[hb_buffer_t], start : CUnsignedInt, end : CUnsignedInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_clear_contents(buffer : Ptr[hb_buffer_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_create(): Ptr[hb_buffer_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_deserialize_glyphs(buffer : Ptr[hb_buffer_t], buf : CString, buf_len : CInt, end_ptr : Ptr[CString], font : Ptr[hb_font_t], format : hb_buffer_serialize_format_t): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_deserialize_unicode(buffer : Ptr[hb_buffer_t], buf : CString, buf_len : CInt, end_ptr : Ptr[CString], format : hb_buffer_serialize_format_t): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_destroy(buffer : Ptr[hb_buffer_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_diff(buffer : Ptr[hb_buffer_t], reference : Ptr[hb_buffer_t], dottedcircle_glyph : hb_codepoint_t, position_fuzz : CUnsignedInt): hb_buffer_diff_flags_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_get_cluster_level(buffer : Ptr[hb_buffer_t]): hb_buffer_cluster_level_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_get_content_type(buffer : Ptr[hb_buffer_t]): hb_buffer_content_type_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_get_direction(buffer : Ptr[hb_buffer_t]): hb_direction_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_get_empty(): Ptr[hb_buffer_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_get_flags(buffer : Ptr[hb_buffer_t]): hb_buffer_flags_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_get_glyph_infos(buffer : Ptr[hb_buffer_t], length : Ptr[CUnsignedInt]): Ptr[hb_glyph_info_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_get_glyph_positions(buffer : Ptr[hb_buffer_t], length : Ptr[CUnsignedInt]): Ptr[hb_glyph_position_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_get_invisible_glyph(buffer : Ptr[hb_buffer_t]): hb_codepoint_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_get_language(buffer : Ptr[hb_buffer_t]): hb_language_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_get_length(buffer : Ptr[hb_buffer_t]): CUnsignedInt = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_get_replacement_codepoint(buffer : Ptr[hb_buffer_t]): hb_codepoint_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_get_script(buffer : Ptr[hb_buffer_t]): hb_script_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_get_segment_properties(buffer : Ptr[hb_buffer_t], props : Ptr[hb_segment_properties_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_get_unicode_funcs(buffer : Ptr[hb_buffer_t]): Ptr[hb_unicode_funcs_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_get_user_data(buffer : Ptr[hb_buffer_t], key : Ptr[hb_user_data_key_t]): Ptr[Byte] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_guess_segment_properties(buffer : Ptr[hb_buffer_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_has_positions(buffer : Ptr[hb_buffer_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_normalize_glyphs(buffer : Ptr[hb_buffer_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_pre_allocate(buffer : Ptr[hb_buffer_t], size : CUnsignedInt): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_reference(buffer : Ptr[hb_buffer_t]): Ptr[hb_buffer_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_reset(buffer : Ptr[hb_buffer_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_reverse(buffer : Ptr[hb_buffer_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_reverse_clusters(buffer : Ptr[hb_buffer_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_reverse_range(buffer : Ptr[hb_buffer_t], start : CUnsignedInt, end : CUnsignedInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_serialize(buffer : Ptr[hb_buffer_t], start : CUnsignedInt, end : CUnsignedInt, buf : CString, buf_size : CUnsignedInt, buf_consumed : Ptr[CUnsignedInt], font : Ptr[hb_font_t], format : hb_buffer_serialize_format_t, flags : hb_buffer_serialize_flags_t): CUnsignedInt = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_serialize_format_from_string(str : CString, len : CInt): hb_buffer_serialize_format_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_serialize_format_to_string(format : hb_buffer_serialize_format_t): CString = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_serialize_glyphs(buffer : Ptr[hb_buffer_t], start : CUnsignedInt, end : CUnsignedInt, buf : CString, buf_size : CUnsignedInt, buf_consumed : Ptr[CUnsignedInt], font : Ptr[hb_font_t], format : hb_buffer_serialize_format_t, flags : hb_buffer_serialize_flags_t): CUnsignedInt = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_serialize_list_formats(): Ptr[CString] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_serialize_unicode(buffer : Ptr[hb_buffer_t], start : CUnsignedInt, end : CUnsignedInt, buf : CString, buf_size : CUnsignedInt, buf_consumed : Ptr[CUnsignedInt], format : hb_buffer_serialize_format_t, flags : hb_buffer_serialize_flags_t): CUnsignedInt = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_set_cluster_level(buffer : Ptr[hb_buffer_t], cluster_level : hb_buffer_cluster_level_t): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_set_content_type(buffer : Ptr[hb_buffer_t], content_type : hb_buffer_content_type_t): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_set_direction(buffer : Ptr[hb_buffer_t], direction : hb_direction_t): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_set_flags(buffer : Ptr[hb_buffer_t], flags : hb_buffer_flags_t): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_set_invisible_glyph(buffer : Ptr[hb_buffer_t], invisible : hb_codepoint_t): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_set_language(buffer : Ptr[hb_buffer_t], language : hb_language_t): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_set_length(buffer : Ptr[hb_buffer_t], length : CUnsignedInt): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_set_message_func(buffer : Ptr[hb_buffer_t], func : hb_buffer_message_func_t, user_data : Ptr[Byte], destroy : hb_destroy_func_t): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_set_replacement_codepoint(buffer : Ptr[hb_buffer_t], replacement : hb_codepoint_t): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_set_script(buffer : Ptr[hb_buffer_t], script : hb_script_t): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_set_segment_properties(buffer : Ptr[hb_buffer_t], props : Ptr[hb_segment_properties_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_set_unicode_funcs(buffer : Ptr[hb_buffer_t], unicode_funcs : Ptr[hb_unicode_funcs_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_buffer_set_user_data(buffer : Ptr[hb_buffer_t], key : Ptr[hb_user_data_key_t], data : Ptr[Byte], destroy : hb_destroy_func_t, replace : hb_bool_t): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-common.h
  */
  def hb_color_get_alpha(color : hb_color_t): uint8_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-common.h
  */
  def hb_color_get_blue(color : hb_color_t): uint8_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-common.h
  */
  def hb_color_get_green(color : hb_color_t): uint8_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-common.h
  */
  def hb_color_get_red(color : hb_color_t): uint8_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-common.h
  */
  def hb_direction_from_string(str : CString, len : CInt): hb_direction_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-common.h
  */
  def hb_direction_to_string(direction : hb_direction_t): CString = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-face.h
  */
  def hb_face_builder_add_table(face : Ptr[hb_face_t], tag : hb_tag_t, blob : Ptr[hb_blob_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-face.h
  */
  def hb_face_builder_create(): Ptr[hb_face_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-face.h
  */
  def hb_face_collect_unicodes(face : Ptr[hb_face_t], out : Ptr[hb_set_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-face.h
  */
  def hb_face_collect_variation_selectors(face : Ptr[hb_face_t], out : Ptr[hb_set_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-face.h
  */
  def hb_face_collect_variation_unicodes(face : Ptr[hb_face_t], variation_selector : hb_codepoint_t, out : Ptr[hb_set_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-face.h
  */
  def hb_face_count(blob : Ptr[hb_blob_t]): CUnsignedInt = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-face.h
  */
  def hb_face_create(blob : Ptr[hb_blob_t], index : CUnsignedInt): Ptr[hb_face_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-face.h
  */
  def hb_face_create_for_tables(reference_table_func : hb_reference_table_func_t, user_data : Ptr[Byte], destroy : hb_destroy_func_t): Ptr[hb_face_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-face.h
  */
  def hb_face_destroy(face : Ptr[hb_face_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-face.h
  */
  def hb_face_get_empty(): Ptr[hb_face_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-face.h
  */
  def hb_face_get_glyph_count(face : Ptr[hb_face_t]): CUnsignedInt = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-face.h
  */
  def hb_face_get_index(face : Ptr[hb_face_t]): CUnsignedInt = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-face.h
  */
  def hb_face_get_table_tags(face : Ptr[hb_face_t], start_offset : CUnsignedInt, table_count : Ptr[CUnsignedInt], table_tags : Ptr[hb_tag_t]): CUnsignedInt = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-face.h
  */
  def hb_face_get_upem(face : Ptr[hb_face_t]): CUnsignedInt = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-face.h
  */
  def hb_face_get_user_data(face : Ptr[hb_face_t], key : Ptr[hb_user_data_key_t]): Ptr[Byte] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-face.h
  */
  def hb_face_is_immutable(face : Ptr[hb_face_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-face.h
  */
  def hb_face_make_immutable(face : Ptr[hb_face_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-face.h
  */
  def hb_face_reference(face : Ptr[hb_face_t]): Ptr[hb_face_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-face.h
  */
  def hb_face_reference_blob(face : Ptr[hb_face_t]): Ptr[hb_blob_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-face.h
  */
  def hb_face_reference_table(face : Ptr[hb_face_t], tag : hb_tag_t): Ptr[hb_blob_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-face.h
  */
  def hb_face_set_glyph_count(face : Ptr[hb_face_t], glyph_count : CUnsignedInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-face.h
  */
  def hb_face_set_index(face : Ptr[hb_face_t], index : CUnsignedInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-face.h
  */
  def hb_face_set_upem(face : Ptr[hb_face_t], upem : CUnsignedInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-face.h
  */
  def hb_face_set_user_data(face : Ptr[hb_face_t], key : Ptr[hb_user_data_key_t], data : Ptr[Byte], destroy : hb_destroy_func_t, replace : hb_bool_t): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-common.h
  */
  def hb_feature_from_string(str : CString, len : CInt, feature : Ptr[hb_feature_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-common.h
  */
  def hb_feature_to_string(feature : Ptr[hb_feature_t], buf : CString, size : CUnsignedInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_add_glyph_origin_for_direction(font : Ptr[hb_font_t], glyph : hb_codepoint_t, direction : hb_direction_t, x : Ptr[hb_position_t], y : Ptr[hb_position_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_create(face : Ptr[hb_face_t]): Ptr[hb_font_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_create_sub_font(parent : Ptr[hb_font_t]): Ptr[hb_font_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_destroy(font : Ptr[hb_font_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_funcs_create(): Ptr[hb_font_funcs_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_funcs_destroy(ffuncs : Ptr[hb_font_funcs_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_funcs_get_empty(): Ptr[hb_font_funcs_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_funcs_get_user_data(ffuncs : Ptr[hb_font_funcs_t], key : Ptr[hb_user_data_key_t]): Ptr[Byte] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_funcs_is_immutable(ffuncs : Ptr[hb_font_funcs_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_funcs_make_immutable(ffuncs : Ptr[hb_font_funcs_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_funcs_reference(ffuncs : Ptr[hb_font_funcs_t]): Ptr[hb_font_funcs_t] = extern

  /**
   * hb_font_funcs_set_font_h_extents_func: : A font-function structure : (closure user_data) (destroy destroy) (scope notified): The callback function to assign _data: Data to pass to : (optional): The function to call when _data is not needed anymore
  
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_funcs_set_font_h_extents_func(ffuncs : Ptr[hb_font_funcs_t], func : hb_font_get_font_h_extents_func_t, user_data : Ptr[Byte], destroy : hb_destroy_func_t): Unit = extern

  /**
   * hb_font_funcs_set_font_v_extents_func: : A font-function structure : (closure user_data) (destroy destroy) (scope notified): The callback function to assign _data: Data to pass to : (optional): The function to call when _data is not needed anymore
  
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_funcs_set_font_v_extents_func(ffuncs : Ptr[hb_font_funcs_t], func : hb_font_get_font_v_extents_func_t, user_data : Ptr[Byte], destroy : hb_destroy_func_t): Unit = extern

  /**
   * hb_font_funcs_set_glyph_contour_point_func: : A font-function structure : (closure user_data) (destroy destroy) (scope notified): The callback function to assign _data: Data to pass to : (optional): The function to call when _data is not needed anymore
  
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_funcs_set_glyph_contour_point_func(ffuncs : Ptr[hb_font_funcs_t], func : hb_font_get_glyph_contour_point_func_t, user_data : Ptr[Byte], destroy : hb_destroy_func_t): Unit = extern

  /**
   * hb_font_funcs_set_glyph_extents_func: : A font-function structure : (closure user_data) (destroy destroy) (scope notified): The callback function to assign _data: Data to pass to : (optional): The function to call when _data is not needed anymore
  
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_funcs_set_glyph_extents_func(ffuncs : Ptr[hb_font_funcs_t], func : hb_font_get_glyph_extents_func_t, user_data : Ptr[Byte], destroy : hb_destroy_func_t): Unit = extern

  /**
   * hb_font_funcs_set_glyph_from_name_func: : A font-function structure : (closure user_data) (destroy destroy) (scope notified): The callback function to assign _data: Data to pass to : (optional): The function to call when _data is not needed anymore
  
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_funcs_set_glyph_from_name_func(ffuncs : Ptr[hb_font_funcs_t], func : hb_font_get_glyph_from_name_func_t, user_data : Ptr[Byte], destroy : hb_destroy_func_t): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-deprecated.h
  */
  def hb_font_funcs_set_glyph_func(ffuncs : Ptr[hb_font_funcs_t], func : hb_font_get_glyph_func_t, user_data : Ptr[Byte], destroy : hb_destroy_func_t): Unit = extern

  /**
   * hb_font_funcs_set_glyph_h_advance_func: : A font-function structure : (closure user_data) (destroy destroy) (scope notified): The callback function to assign _data: Data to pass to : (optional): The function to call when _data is not needed anymore
  
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_funcs_set_glyph_h_advance_func(ffuncs : Ptr[hb_font_funcs_t], func : hb_font_get_glyph_h_advance_func_t, user_data : Ptr[Byte], destroy : hb_destroy_func_t): Unit = extern

  /**
   * hb_font_funcs_set_glyph_h_advances_func: : A font-function structure : (closure user_data) (destroy destroy) (scope notified): The callback function to assign _data: Data to pass to : (optional): The function to call when _data is not needed anymore
  
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_funcs_set_glyph_h_advances_func(ffuncs : Ptr[hb_font_funcs_t], func : hb_font_get_glyph_h_advances_func_t, user_data : Ptr[Byte], destroy : hb_destroy_func_t): Unit = extern

  /**
   * hb_font_funcs_set_glyph_h_kerning_func: : font functions. : (closure user_data) (destroy destroy) (scope notified): _data: :
  
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_funcs_set_glyph_h_kerning_func(ffuncs : Ptr[hb_font_funcs_t], func : hb_font_get_glyph_h_kerning_func_t, user_data : Ptr[Byte], destroy : hb_destroy_func_t): Unit = extern

  /**
   * hb_font_funcs_set_glyph_h_origin_func: : A font-function structure : (closure user_data) (destroy destroy) (scope notified): The callback function to assign _data: Data to pass to : (optional): The function to call when _data is not needed anymore
  
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_funcs_set_glyph_h_origin_func(ffuncs : Ptr[hb_font_funcs_t], func : hb_font_get_glyph_h_origin_func_t, user_data : Ptr[Byte], destroy : hb_destroy_func_t): Unit = extern

  /**
   * hb_font_funcs_set_glyph_name_func: : A font-function structure : (closure user_data) (destroy destroy) (scope notified): The callback function to assign _data: Data to pass to : (optional): The function to call when _data is not needed anymore
  
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_funcs_set_glyph_name_func(ffuncs : Ptr[hb_font_funcs_t], func : hb_font_get_glyph_name_func_t, user_data : Ptr[Byte], destroy : hb_destroy_func_t): Unit = extern

  /**
   * hb_font_funcs_set_glyph_v_advance_func: : A font-function structure : (closure user_data) (destroy destroy) (scope notified): The callback function to assign _data: Data to pass to : (optional): The function to call when _data is not needed anymore
  
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_funcs_set_glyph_v_advance_func(ffuncs : Ptr[hb_font_funcs_t], func : hb_font_get_glyph_v_advance_func_t, user_data : Ptr[Byte], destroy : hb_destroy_func_t): Unit = extern

  /**
   * hb_font_funcs_set_glyph_v_advances_func: : A font-function structure : (closure user_data) (destroy destroy) (scope notified): The callback function to assign _data: Data to pass to : (optional): The function to call when _data is not needed anymore
  
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_funcs_set_glyph_v_advances_func(ffuncs : Ptr[hb_font_funcs_t], func : hb_font_get_glyph_v_advances_func_t, user_data : Ptr[Byte], destroy : hb_destroy_func_t): Unit = extern

  /**
   * hb_font_funcs_set_glyph_v_kerning_func: : font functions. : (closure user_data) (destroy destroy) (scope notified): _data: :
  
   * [bindgen] header: /usr/include/harfbuzz/hb-deprecated.h
  */
  def hb_font_funcs_set_glyph_v_kerning_func(ffuncs : Ptr[hb_font_funcs_t], func : hb_font_get_glyph_v_kerning_func_t, user_data : Ptr[Byte], destroy : hb_destroy_func_t): Unit = extern

  /**
   * hb_font_funcs_set_glyph_v_origin_func: : A font-function structure : (closure user_data) (destroy destroy) (scope notified): The callback function to assign _data: Data to pass to : (optional): The function to call when _data is not needed anymore
  
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_funcs_set_glyph_v_origin_func(ffuncs : Ptr[hb_font_funcs_t], func : hb_font_get_glyph_v_origin_func_t, user_data : Ptr[Byte], destroy : hb_destroy_func_t): Unit = extern

  /**
   * hb_font_funcs_set_nominal_glyph_func: : A font-function structure : (closure user_data) (destroy destroy) (scope notified): The callback function to assign _data: Data to pass to : (optional): The function to call when _data is not needed anymore
  
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_funcs_set_nominal_glyph_func(ffuncs : Ptr[hb_font_funcs_t], func : hb_font_get_nominal_glyph_func_t, user_data : Ptr[Byte], destroy : hb_destroy_func_t): Unit = extern

  /**
   * hb_font_funcs_set_nominal_glyphs_func: : A font-function structure : (closure user_data) (destroy destroy) (scope notified): The callback function to assign _data: Data to pass to : (optional): The function to call when _data is not needed anymore
  
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_funcs_set_nominal_glyphs_func(ffuncs : Ptr[hb_font_funcs_t], func : hb_font_get_nominal_glyphs_func_t, user_data : Ptr[Byte], destroy : hb_destroy_func_t): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_funcs_set_user_data(ffuncs : Ptr[hb_font_funcs_t], key : Ptr[hb_user_data_key_t], data : Ptr[Byte], destroy : hb_destroy_func_t, replace : hb_bool_t): hb_bool_t = extern

  /**
   * hb_font_funcs_set_variation_glyph_func: : A font-function structure : (closure user_data) (destroy destroy) (scope notified): The callback function to assign _data: Data to pass to : (optional): The function to call when _data is not needed anymore
  
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_funcs_set_variation_glyph_func(ffuncs : Ptr[hb_font_funcs_t], func : hb_font_get_variation_glyph_func_t, user_data : Ptr[Byte], destroy : hb_destroy_func_t): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_empty(): Ptr[hb_font_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_extents_for_direction(font : Ptr[hb_font_t], direction : hb_direction_t, extents : Ptr[hb_font_extents_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_face(font : Ptr[hb_font_t]): Ptr[hb_face_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_glyph(font : Ptr[hb_font_t], unicode : hb_codepoint_t, variation_selector : hb_codepoint_t, glyph : Ptr[hb_codepoint_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_glyph_advance_for_direction(font : Ptr[hb_font_t], glyph : hb_codepoint_t, direction : hb_direction_t, x : Ptr[hb_position_t], y : Ptr[hb_position_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_glyph_advances_for_direction(font : Ptr[hb_font_t], direction : hb_direction_t, count : CUnsignedInt, first_glyph : Ptr[hb_codepoint_t], glyph_stride : CUnsignedInt, first_advance : Ptr[hb_position_t], advance_stride : CUnsignedInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_glyph_contour_point(font : Ptr[hb_font_t], glyph : hb_codepoint_t, point_index : CUnsignedInt, x : Ptr[hb_position_t], y : Ptr[hb_position_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_glyph_contour_point_for_origin(font : Ptr[hb_font_t], glyph : hb_codepoint_t, point_index : CUnsignedInt, direction : hb_direction_t, x : Ptr[hb_position_t], y : Ptr[hb_position_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_glyph_extents(font : Ptr[hb_font_t], glyph : hb_codepoint_t, extents : Ptr[hb_glyph_extents_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_glyph_extents_for_origin(font : Ptr[hb_font_t], glyph : hb_codepoint_t, direction : hb_direction_t, extents : Ptr[hb_glyph_extents_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_glyph_from_name(font : Ptr[hb_font_t], name : CString, len : CInt, glyph : Ptr[hb_codepoint_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_glyph_h_advance(font : Ptr[hb_font_t], glyph : hb_codepoint_t): hb_position_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_glyph_h_advances(font : Ptr[hb_font_t], count : CUnsignedInt, first_glyph : Ptr[hb_codepoint_t], glyph_stride : CUnsignedInt, first_advance : Ptr[hb_position_t], advance_stride : CUnsignedInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_glyph_h_kerning(font : Ptr[hb_font_t], left_glyph : hb_codepoint_t, right_glyph : hb_codepoint_t): hb_position_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_glyph_h_origin(font : Ptr[hb_font_t], glyph : hb_codepoint_t, x : Ptr[hb_position_t], y : Ptr[hb_position_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_glyph_kerning_for_direction(font : Ptr[hb_font_t], first_glyph : hb_codepoint_t, second_glyph : hb_codepoint_t, direction : hb_direction_t, x : Ptr[hb_position_t], y : Ptr[hb_position_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_glyph_name(font : Ptr[hb_font_t], glyph : hb_codepoint_t, name : CString, size : CUnsignedInt): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_glyph_origin_for_direction(font : Ptr[hb_font_t], glyph : hb_codepoint_t, direction : hb_direction_t, x : Ptr[hb_position_t], y : Ptr[hb_position_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_glyph_v_advance(font : Ptr[hb_font_t], glyph : hb_codepoint_t): hb_position_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_glyph_v_advances(font : Ptr[hb_font_t], count : CUnsignedInt, first_glyph : Ptr[hb_codepoint_t], glyph_stride : CUnsignedInt, first_advance : Ptr[hb_position_t], advance_stride : CUnsignedInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-deprecated.h
  */
  def hb_font_get_glyph_v_kerning(font : Ptr[hb_font_t], top_glyph : hb_codepoint_t, bottom_glyph : hb_codepoint_t): hb_position_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_glyph_v_origin(font : Ptr[hb_font_t], glyph : hb_codepoint_t, x : Ptr[hb_position_t], y : Ptr[hb_position_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_h_extents(font : Ptr[hb_font_t], extents : Ptr[hb_font_extents_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_nominal_glyph(font : Ptr[hb_font_t], unicode : hb_codepoint_t, glyph : Ptr[hb_codepoint_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_nominal_glyphs(font : Ptr[hb_font_t], count : CUnsignedInt, first_unicode : Ptr[hb_codepoint_t], unicode_stride : CUnsignedInt, first_glyph : Ptr[hb_codepoint_t], glyph_stride : CUnsignedInt): CUnsignedInt = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_parent(font : Ptr[hb_font_t]): Ptr[hb_font_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_ppem(font : Ptr[hb_font_t], x_ppem : Ptr[CUnsignedInt], y_ppem : Ptr[CUnsignedInt]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_ptem(font : Ptr[hb_font_t]): Float = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_scale(font : Ptr[hb_font_t], x_scale : Ptr[CInt], y_scale : Ptr[CInt]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_user_data(font : Ptr[hb_font_t], key : Ptr[hb_user_data_key_t]): Ptr[Byte] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_v_extents(font : Ptr[hb_font_t], extents : Ptr[hb_font_extents_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_var_coords_normalized(font : Ptr[hb_font_t], length : Ptr[CUnsignedInt]): Ptr[CInt] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_get_variation_glyph(font : Ptr[hb_font_t], unicode : hb_codepoint_t, variation_selector : hb_codepoint_t, glyph : Ptr[hb_codepoint_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_glyph_from_string(font : Ptr[hb_font_t], s : CString, len : CInt, glyph : Ptr[hb_codepoint_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_glyph_to_string(font : Ptr[hb_font_t], glyph : hb_codepoint_t, s : CString, size : CUnsignedInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_is_immutable(font : Ptr[hb_font_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_make_immutable(font : Ptr[hb_font_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_reference(font : Ptr[hb_font_t]): Ptr[hb_font_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_set_face(font : Ptr[hb_font_t], face : Ptr[hb_face_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_set_funcs(font : Ptr[hb_font_t], klass : Ptr[hb_font_funcs_t], font_data : Ptr[Byte], destroy : hb_destroy_func_t): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_set_funcs_data(font : Ptr[hb_font_t], font_data : Ptr[Byte], destroy : hb_destroy_func_t): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_set_parent(font : Ptr[hb_font_t], parent : Ptr[hb_font_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_set_ppem(font : Ptr[hb_font_t], x_ppem : CUnsignedInt, y_ppem : CUnsignedInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_set_ptem(font : Ptr[hb_font_t], ptem : Float): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_set_scale(font : Ptr[hb_font_t], x_scale : CInt, y_scale : CInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_set_user_data(font : Ptr[hb_font_t], key : Ptr[hb_user_data_key_t], data : Ptr[Byte], destroy : hb_destroy_func_t, replace : hb_bool_t): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_set_var_coords_design(font : Ptr[hb_font_t], coords : Ptr[Float], coords_length : CUnsignedInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_set_var_coords_normalized(font : Ptr[hb_font_t], coords : Ptr[CInt], coords_length : CUnsignedInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_set_var_named_instance(font : Ptr[hb_font_t], instance_index : CUnsignedInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_set_variations(font : Ptr[hb_font_t], variations : Ptr[hb_variation_t], variations_length : CUnsignedInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-font.h
  */
  def hb_font_subtract_glyph_origin_for_direction(font : Ptr[hb_font_t], glyph : hb_codepoint_t, direction : hb_direction_t, x : Ptr[hb_position_t], y : Ptr[hb_position_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_glyph_info_get_glyph_flags(info : Ptr[hb_glyph_info_t]): hb_glyph_flags_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-common.h
  */
  def hb_language_from_string(str : CString, len : CInt): hb_language_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-common.h
  */
  def hb_language_get_default(): hb_language_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-common.h
  */
  def hb_language_to_string(language : hb_language_t): CString = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-map.h
  */
  def hb_map_allocation_successful(map : Ptr[hb_map_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-map.h
  */
  def hb_map_clear(map : Ptr[hb_map_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-map.h
  */
  def hb_map_create(): Ptr[hb_map_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-map.h
  */
  def hb_map_del(map : Ptr[hb_map_t], key : hb_codepoint_t): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-map.h
  */
  def hb_map_destroy(map : Ptr[hb_map_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-map.h
  */
  def hb_map_get(map : Ptr[hb_map_t], key : hb_codepoint_t): hb_codepoint_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-map.h
  */
  def hb_map_get_empty(): Ptr[hb_map_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-map.h
  */
  def hb_map_get_population(map : Ptr[hb_map_t]): CUnsignedInt = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-map.h
  */
  def hb_map_get_user_data(map : Ptr[hb_map_t], key : Ptr[hb_user_data_key_t]): Ptr[Byte] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-map.h
  */
  def hb_map_has(map : Ptr[hb_map_t], key : hb_codepoint_t): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-map.h
  */
  def hb_map_is_empty(map : Ptr[hb_map_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-map.h
  */
  def hb_map_reference(map : Ptr[hb_map_t]): Ptr[hb_map_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-map.h
  */
  def hb_map_set(map : Ptr[hb_map_t], key : hb_codepoint_t, value : hb_codepoint_t): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-map.h
  */
  def hb_map_set_user_data(map : Ptr[hb_map_t], key : Ptr[hb_user_data_key_t], data : Ptr[Byte], destroy : hb_destroy_func_t, replace : hb_bool_t): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-common.h
  */
  def hb_script_from_iso15924_tag(tag : hb_tag_t): hb_script_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-common.h
  */
  def hb_script_from_string(str : CString, len : CInt): hb_script_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-common.h
  */
  def hb_script_get_horizontal_direction(script : hb_script_t): hb_direction_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-common.h
  */
  def hb_script_to_iso15924_tag(script : hb_script_t): hb_tag_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_segment_properties_equal(a : Ptr[hb_segment_properties_t], b : Ptr[hb_segment_properties_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-buffer.h
  */
  def hb_segment_properties_hash(p : Ptr[hb_segment_properties_t]): CUnsignedInt = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-set.h
  */
  def hb_set_add(set : Ptr[hb_set_t], codepoint : hb_codepoint_t): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-set.h
  */
  def hb_set_add_range(set : Ptr[hb_set_t], first : hb_codepoint_t, last : hb_codepoint_t): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-set.h
  */
  def hb_set_allocation_successful(set : Ptr[hb_set_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-set.h
  */
  def hb_set_clear(set : Ptr[hb_set_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-set.h
  */
  def hb_set_create(): Ptr[hb_set_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-set.h
  */
  def hb_set_del(set : Ptr[hb_set_t], codepoint : hb_codepoint_t): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-set.h
  */
  def hb_set_del_range(set : Ptr[hb_set_t], first : hb_codepoint_t, last : hb_codepoint_t): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-set.h
  */
  def hb_set_destroy(set : Ptr[hb_set_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-set.h
  */
  def hb_set_get_empty(): Ptr[hb_set_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-set.h
  */
  def hb_set_get_max(set : Ptr[hb_set_t]): hb_codepoint_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-set.h
  */
  def hb_set_get_min(set : Ptr[hb_set_t]): hb_codepoint_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-set.h
  */
  def hb_set_get_population(set : Ptr[hb_set_t]): CUnsignedInt = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-set.h
  */
  def hb_set_get_user_data(set : Ptr[hb_set_t], key : Ptr[hb_user_data_key_t]): Ptr[Byte] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-set.h
  */
  def hb_set_has(set : Ptr[hb_set_t], codepoint : hb_codepoint_t): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-set.h
  */
  def hb_set_intersect(set : Ptr[hb_set_t], other : Ptr[hb_set_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-deprecated.h
  */
  def hb_set_invert(set : Ptr[hb_set_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-set.h
  */
  def hb_set_is_empty(set : Ptr[hb_set_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-set.h
  */
  def hb_set_is_equal(set : Ptr[hb_set_t], other : Ptr[hb_set_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-set.h
  */
  def hb_set_is_subset(set : Ptr[hb_set_t], larger_set : Ptr[hb_set_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-set.h
  */
  def hb_set_next(set : Ptr[hb_set_t], codepoint : Ptr[hb_codepoint_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-set.h
  */
  def hb_set_next_range(set : Ptr[hb_set_t], first : Ptr[hb_codepoint_t], last : Ptr[hb_codepoint_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-set.h
  */
  def hb_set_previous(set : Ptr[hb_set_t], codepoint : Ptr[hb_codepoint_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-set.h
  */
  def hb_set_previous_range(set : Ptr[hb_set_t], first : Ptr[hb_codepoint_t], last : Ptr[hb_codepoint_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-set.h
  */
  def hb_set_reference(set : Ptr[hb_set_t]): Ptr[hb_set_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-set.h
  */
  def hb_set_set(set : Ptr[hb_set_t], other : Ptr[hb_set_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-set.h
  */
  def hb_set_set_user_data(set : Ptr[hb_set_t], key : Ptr[hb_user_data_key_t], data : Ptr[Byte], destroy : hb_destroy_func_t, replace : hb_bool_t): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-set.h
  */
  def hb_set_subtract(set : Ptr[hb_set_t], other : Ptr[hb_set_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-set.h
  */
  def hb_set_symmetric_difference(set : Ptr[hb_set_t], other : Ptr[hb_set_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-set.h
  */
  def hb_set_union(set : Ptr[hb_set_t], other : Ptr[hb_set_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-shape.h
  */
  def hb_shape(font : Ptr[hb_font_t], buffer : Ptr[hb_buffer_t], features : Ptr[hb_feature_t], num_features : CUnsignedInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-shape.h
  */
  def hb_shape_full(font : Ptr[hb_font_t], buffer : Ptr[hb_buffer_t], features : Ptr[hb_feature_t], num_features : CUnsignedInt, shaper_list : Ptr[CString]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-shape.h
  */
  def hb_shape_list_shapers(): Ptr[CString] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-shape-plan.h
  */
  def hb_shape_plan_create(face : Ptr[hb_face_t], props : Ptr[hb_segment_properties_t], user_features : Ptr[hb_feature_t], num_user_features : CUnsignedInt, shaper_list : Ptr[CString]): Ptr[hb_shape_plan_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-shape-plan.h
  */
  def hb_shape_plan_create2(face : Ptr[hb_face_t], props : Ptr[hb_segment_properties_t], user_features : Ptr[hb_feature_t], num_user_features : CUnsignedInt, coords : Ptr[CInt], num_coords : CUnsignedInt, shaper_list : Ptr[CString]): Ptr[hb_shape_plan_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-shape-plan.h
  */
  def hb_shape_plan_create_cached(face : Ptr[hb_face_t], props : Ptr[hb_segment_properties_t], user_features : Ptr[hb_feature_t], num_user_features : CUnsignedInt, shaper_list : Ptr[CString]): Ptr[hb_shape_plan_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-shape-plan.h
  */
  def hb_shape_plan_create_cached2(face : Ptr[hb_face_t], props : Ptr[hb_segment_properties_t], user_features : Ptr[hb_feature_t], num_user_features : CUnsignedInt, coords : Ptr[CInt], num_coords : CUnsignedInt, shaper_list : Ptr[CString]): Ptr[hb_shape_plan_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-shape-plan.h
  */
  def hb_shape_plan_destroy(shape_plan : Ptr[hb_shape_plan_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-shape-plan.h
  */
  def hb_shape_plan_execute(shape_plan : Ptr[hb_shape_plan_t], font : Ptr[hb_font_t], buffer : Ptr[hb_buffer_t], features : Ptr[hb_feature_t], num_features : CUnsignedInt): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-shape-plan.h
  */
  def hb_shape_plan_get_empty(): Ptr[hb_shape_plan_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-shape-plan.h
  */
  def hb_shape_plan_get_shaper(shape_plan : Ptr[hb_shape_plan_t]): CString = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-shape-plan.h
  */
  def hb_shape_plan_get_user_data(shape_plan : Ptr[hb_shape_plan_t], key : Ptr[hb_user_data_key_t]): Ptr[Byte] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-shape-plan.h
  */
  def hb_shape_plan_reference(shape_plan : Ptr[hb_shape_plan_t]): Ptr[hb_shape_plan_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-shape-plan.h
  */
  def hb_shape_plan_set_user_data(shape_plan : Ptr[hb_shape_plan_t], key : Ptr[hb_user_data_key_t], data : Ptr[Byte], destroy : hb_destroy_func_t, replace : hb_bool_t): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-common.h
  */
  def hb_tag_from_string(str : CString, len : CInt): hb_tag_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-common.h
  */
  def hb_tag_to_string(tag : hb_tag_t, buf : CString): Unit = extern

  /**
   * hb_unicode_combining_class: : The Unicode-functions structure : The code point to query
  
   * [bindgen] header: /usr/include/harfbuzz/hb-unicode.h
  */
  def hb_unicode_combining_class(ufuncs : Ptr[hb_unicode_funcs_t], unicode : hb_codepoint_t): hb_unicode_combining_class_t = extern

  /**
   * hb_unicode_compose: : The Unicode-functions structure : The first code point to compose : The second code point to compose : (out): The composed code point
  
   * [bindgen] header: /usr/include/harfbuzz/hb-unicode.h
  */
  def hb_unicode_compose(ufuncs : Ptr[hb_unicode_funcs_t], a : hb_codepoint_t, b : hb_codepoint_t, ab : Ptr[hb_codepoint_t]): hb_bool_t = extern

  /**
   * hb_unicode_decompose: : The Unicode-functions structure : The code point to decompose : (out): The first decomposed code point : (out): The second decomposed code point
  
   * [bindgen] header: /usr/include/harfbuzz/hb-unicode.h
  */
  def hb_unicode_decompose(ufuncs : Ptr[hb_unicode_funcs_t], ab : hb_codepoint_t, a : Ptr[hb_codepoint_t], b : Ptr[hb_codepoint_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-deprecated.h
  */
  def hb_unicode_decompose_compatibility(ufuncs : Ptr[hb_unicode_funcs_t], u : hb_codepoint_t, decomposed : Ptr[hb_codepoint_t]): CUnsignedInt = extern

  /**
   * hb_unicode_eastasian_width:
  
   * [bindgen] header: /usr/include/harfbuzz/hb-deprecated.h
  */
  def hb_unicode_eastasian_width(ufuncs : Ptr[hb_unicode_funcs_t], unicode : hb_codepoint_t): CUnsignedInt = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-unicode.h
  */
  def hb_unicode_funcs_create(parent : Ptr[hb_unicode_funcs_t]): Ptr[hb_unicode_funcs_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-unicode.h
  */
  def hb_unicode_funcs_destroy(ufuncs : Ptr[hb_unicode_funcs_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-unicode.h
  */
  def hb_unicode_funcs_get_default(): Ptr[hb_unicode_funcs_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-unicode.h
  */
  def hb_unicode_funcs_get_empty(): Ptr[hb_unicode_funcs_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-unicode.h
  */
  def hb_unicode_funcs_get_parent(ufuncs : Ptr[hb_unicode_funcs_t]): Ptr[hb_unicode_funcs_t] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-unicode.h
  */
  def hb_unicode_funcs_get_user_data(ufuncs : Ptr[hb_unicode_funcs_t], key : Ptr[hb_user_data_key_t]): Ptr[Byte] = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-unicode.h
  */
  def hb_unicode_funcs_is_immutable(ufuncs : Ptr[hb_unicode_funcs_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-unicode.h
  */
  def hb_unicode_funcs_make_immutable(ufuncs : Ptr[hb_unicode_funcs_t]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-unicode.h
  */
  def hb_unicode_funcs_reference(ufuncs : Ptr[hb_unicode_funcs_t]): Ptr[hb_unicode_funcs_t] = extern

  /**
   * hb_unicode_funcs_set_combining_class_func: : A Unicode-functions structure : (closure user_data) (destroy destroy) (scope notified): The callback function to assign _data: Data to pass to : (optional): The function to call when _data is not needed anymore
  
   * [bindgen] header: /usr/include/harfbuzz/hb-unicode.h
  */
  def hb_unicode_funcs_set_combining_class_func(ufuncs : Ptr[hb_unicode_funcs_t], func : hb_unicode_combining_class_func_t, user_data : Ptr[Byte], destroy : hb_destroy_func_t): Unit = extern

  /**
   * hb_unicode_funcs_set_compose_func: : A Unicode-functions structure : (closure user_data) (destroy destroy) (scope notified): The callback function to assign _data: Data to pass to : (optional): The function to call when _data is not needed anymore
  
   * [bindgen] header: /usr/include/harfbuzz/hb-unicode.h
  */
  def hb_unicode_funcs_set_compose_func(ufuncs : Ptr[hb_unicode_funcs_t], func : hb_unicode_compose_func_t, user_data : Ptr[Byte], destroy : hb_destroy_func_t): Unit = extern

  /**
   * hb_unicode_funcs_set_decompose_compatibility_func: : a Unicode function structure : (closure user_data) (destroy destroy) (scope notified): _data: :
  
   * [bindgen] header: /usr/include/harfbuzz/hb-deprecated.h
  */
  def hb_unicode_funcs_set_decompose_compatibility_func(ufuncs : Ptr[hb_unicode_funcs_t], func : hb_unicode_decompose_compatibility_func_t, user_data : Ptr[Byte], destroy : hb_destroy_func_t): Unit = extern

  /**
   * hb_unicode_funcs_set_decompose_func: : A Unicode-functions structure : (closure user_data) (destroy destroy) (scope notified): The callback function to assign _data: Data to pass to : (optional): The function to call when _data is not needed anymore
  
   * [bindgen] header: /usr/include/harfbuzz/hb-unicode.h
  */
  def hb_unicode_funcs_set_decompose_func(ufuncs : Ptr[hb_unicode_funcs_t], func : hb_unicode_decompose_func_t, user_data : Ptr[Byte], destroy : hb_destroy_func_t): Unit = extern

  /**
   * hb_unicode_funcs_set_eastasian_width_func: : a Unicode function structure : (closure user_data) (destroy destroy) (scope notified): _data: :
  
   * [bindgen] header: /usr/include/harfbuzz/hb-deprecated.h
  */
  def hb_unicode_funcs_set_eastasian_width_func(ufuncs : Ptr[hb_unicode_funcs_t], func : hb_unicode_eastasian_width_func_t, user_data : Ptr[Byte], destroy : hb_destroy_func_t): Unit = extern

  /**
   * hb_unicode_funcs_set_general_category_func: : A Unicode-functions structure : (closure user_data) (destroy destroy) (scope notified): The callback function to assign _data: Data to pass to : (optional): The function to call when _data is not needed anymore
  
   * [bindgen] header: /usr/include/harfbuzz/hb-unicode.h
  */
  def hb_unicode_funcs_set_general_category_func(ufuncs : Ptr[hb_unicode_funcs_t], func : hb_unicode_general_category_func_t, user_data : Ptr[Byte], destroy : hb_destroy_func_t): Unit = extern

  /**
   * hb_unicode_funcs_set_mirroring_func: : A Unicode-functions structure : (closure user_data) (destroy destroy) (scope notified): The callback function to assign _data: Data to pass to : (optional): The function to call when _data is not needed anymore
  
   * [bindgen] header: /usr/include/harfbuzz/hb-unicode.h
  */
  def hb_unicode_funcs_set_mirroring_func(ufuncs : Ptr[hb_unicode_funcs_t], func : hb_unicode_mirroring_func_t, user_data : Ptr[Byte], destroy : hb_destroy_func_t): Unit = extern

  /**
   * hb_unicode_funcs_set_script_func: : A Unicode-functions structure : (closure user_data) (destroy destroy) (scope notified): The callback function to assign _data: Data to pass to : (optional): The function to call when _data is not needed anymore
  
   * [bindgen] header: /usr/include/harfbuzz/hb-unicode.h
  */
  def hb_unicode_funcs_set_script_func(ufuncs : Ptr[hb_unicode_funcs_t], func : hb_unicode_script_func_t, user_data : Ptr[Byte], destroy : hb_destroy_func_t): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-unicode.h
  */
  def hb_unicode_funcs_set_user_data(ufuncs : Ptr[hb_unicode_funcs_t], key : Ptr[hb_user_data_key_t], data : Ptr[Byte], destroy : hb_destroy_func_t, replace : hb_bool_t): hb_bool_t = extern

  /**
   * hb_unicode_general_category: : The Unicode-functions structure : The code point to query
  
   * [bindgen] header: /usr/include/harfbuzz/hb-unicode.h
  */
  def hb_unicode_general_category(ufuncs : Ptr[hb_unicode_funcs_t], unicode : hb_codepoint_t): hb_unicode_general_category_t = extern

  /**
   * hb_unicode_mirroring: : The Unicode-functions structure : The code point to query
  
   * [bindgen] header: /usr/include/harfbuzz/hb-unicode.h
  */
  def hb_unicode_mirroring(ufuncs : Ptr[hb_unicode_funcs_t], unicode : hb_codepoint_t): hb_codepoint_t = extern

  /**
   * hb_unicode_script: : The Unicode-functions structure : The code point to query
  
   * [bindgen] header: /usr/include/harfbuzz/hb-unicode.h
  */
  def hb_unicode_script(ufuncs : Ptr[hb_unicode_funcs_t], unicode : hb_codepoint_t): hb_script_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-common.h
  */
  def hb_variation_from_string(str : CString, len : CInt, variation : Ptr[hb_variation_t]): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-common.h
  */
  def hb_variation_to_string(variation : Ptr[hb_variation_t], buf : CString, size : CUnsignedInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-version.h
  */
  def hb_version(major : Ptr[CUnsignedInt], minor : Ptr[CUnsignedInt], micro : Ptr[CUnsignedInt]): Unit = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-version.h
  */
  def hb_version_atleast(major : CUnsignedInt, minor : CUnsignedInt, micro : CUnsignedInt): hb_bool_t = extern

  /**
   * [bindgen] header: /usr/include/harfbuzz/hb-version.h
  */
  def hb_version_string(): CString = extern

import extern_functions.*
export extern_functions.*

