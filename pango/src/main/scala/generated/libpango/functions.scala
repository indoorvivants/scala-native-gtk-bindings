package libpango
package functions

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

import _root_.libpango.enumerations.*
import _root_.libpango.aliases.*
import _root_.libpango.structs.*


@extern
private[libpango] object extern_functions:
  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def glib_autoptr_cleanup_PangoAttrIterator(_ptr : Ptr[Ptr[PangoAttrIterator]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def glib_autoptr_cleanup_PangoAttrList(_ptr : Ptr[Ptr[PangoAttrList]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def glib_autoptr_cleanup_PangoAttribute(_ptr : Ptr[Ptr[PangoAttribute]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-coverage.h
  */
  def glib_autoptr_cleanup_PangoCoverage(_ptr : Ptr[Ptr[PangoCoverage]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def glib_autoptr_cleanup_PangoFont(_ptr : Ptr[Ptr[PangoFont]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def glib_autoptr_cleanup_PangoFontDescription(_ptr : Ptr[Ptr[PangoFontDescription]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def glib_autoptr_cleanup_PangoFontFace(_ptr : Ptr[Ptr[PangoFontFace]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def glib_autoptr_cleanup_PangoFontFamily(_ptr : Ptr[Ptr[PangoFontFamily]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontmap.h
  */
  def glib_autoptr_cleanup_PangoFontMap(_ptr : Ptr[Ptr[PangoFontMap]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def glib_autoptr_cleanup_PangoLayout(_ptr : Ptr[Ptr[PangoLayout]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def glib_autoptr_cleanup_PangoLayoutIter(_ptr : Ptr[Ptr[PangoLayoutIter]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-tabs.h
  */
  def glib_autoptr_cleanup_PangoTabArray(_ptr : Ptr[Ptr[PangoTabArray]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def glib_autoptr_clear_PangoAttrIterator(_ptr : Ptr[PangoAttrIterator]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def glib_autoptr_clear_PangoAttrList(_ptr : Ptr[PangoAttrList]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def glib_autoptr_clear_PangoAttribute(_ptr : Ptr[PangoAttribute]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-coverage.h
  */
  def glib_autoptr_clear_PangoCoverage(_ptr : Ptr[PangoCoverage]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def glib_autoptr_clear_PangoFont(_ptr : Ptr[PangoFont]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def glib_autoptr_clear_PangoFontDescription(_ptr : Ptr[PangoFontDescription]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def glib_autoptr_clear_PangoFontFace(_ptr : Ptr[PangoFontFace]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def glib_autoptr_clear_PangoFontFamily(_ptr : Ptr[PangoFontFamily]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontmap.h
  */
  def glib_autoptr_clear_PangoFontMap(_ptr : Ptr[PangoFontMap]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def glib_autoptr_clear_PangoLayout(_ptr : Ptr[PangoLayout]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def glib_autoptr_clear_PangoLayoutIter(_ptr : Ptr[PangoLayoutIter]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-tabs.h
  */
  def glib_autoptr_clear_PangoTabArray(_ptr : Ptr[PangoTabArray]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def glib_listautoptr_cleanup_PangoAttrIterator(_l : Ptr[Ptr[_root_.glib.all.GList]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def glib_listautoptr_cleanup_PangoAttrList(_l : Ptr[Ptr[_root_.glib.all.GList]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def glib_listautoptr_cleanup_PangoAttribute(_l : Ptr[Ptr[_root_.glib.all.GList]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-coverage.h
  */
  def glib_listautoptr_cleanup_PangoCoverage(_l : Ptr[Ptr[_root_.glib.all.GList]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def glib_listautoptr_cleanup_PangoFont(_l : Ptr[Ptr[_root_.glib.all.GList]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def glib_listautoptr_cleanup_PangoFontDescription(_l : Ptr[Ptr[_root_.glib.all.GList]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def glib_listautoptr_cleanup_PangoFontFace(_l : Ptr[Ptr[_root_.glib.all.GList]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def glib_listautoptr_cleanup_PangoFontFamily(_l : Ptr[Ptr[_root_.glib.all.GList]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontmap.h
  */
  def glib_listautoptr_cleanup_PangoFontMap(_l : Ptr[Ptr[_root_.glib.all.GList]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def glib_listautoptr_cleanup_PangoLayout(_l : Ptr[Ptr[_root_.glib.all.GList]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def glib_listautoptr_cleanup_PangoLayoutIter(_l : Ptr[Ptr[_root_.glib.all.GList]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-tabs.h
  */
  def glib_listautoptr_cleanup_PangoTabArray(_l : Ptr[Ptr[_root_.glib.all.GList]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def glib_queueautoptr_cleanup_PangoAttrIterator(_q : Ptr[Ptr[_root_.glib.all.GQueue]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def glib_queueautoptr_cleanup_PangoAttrList(_q : Ptr[Ptr[_root_.glib.all.GQueue]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def glib_queueautoptr_cleanup_PangoAttribute(_q : Ptr[Ptr[_root_.glib.all.GQueue]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-coverage.h
  */
  def glib_queueautoptr_cleanup_PangoCoverage(_q : Ptr[Ptr[_root_.glib.all.GQueue]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def glib_queueautoptr_cleanup_PangoFont(_q : Ptr[Ptr[_root_.glib.all.GQueue]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def glib_queueautoptr_cleanup_PangoFontDescription(_q : Ptr[Ptr[_root_.glib.all.GQueue]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def glib_queueautoptr_cleanup_PangoFontFace(_q : Ptr[Ptr[_root_.glib.all.GQueue]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def glib_queueautoptr_cleanup_PangoFontFamily(_q : Ptr[Ptr[_root_.glib.all.GQueue]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontmap.h
  */
  def glib_queueautoptr_cleanup_PangoFontMap(_q : Ptr[Ptr[_root_.glib.all.GQueue]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def glib_queueautoptr_cleanup_PangoLayout(_q : Ptr[Ptr[_root_.glib.all.GQueue]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def glib_queueautoptr_cleanup_PangoLayoutIter(_q : Ptr[Ptr[_root_.glib.all.GQueue]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-tabs.h
  */
  def glib_queueautoptr_cleanup_PangoTabArray(_q : Ptr[Ptr[_root_.glib.all.GQueue]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def glib_slistautoptr_cleanup_PangoAttrIterator(_l : Ptr[Ptr[_root_.glib.all.GSList]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def glib_slistautoptr_cleanup_PangoAttrList(_l : Ptr[Ptr[_root_.glib.all.GSList]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def glib_slistautoptr_cleanup_PangoAttribute(_l : Ptr[Ptr[_root_.glib.all.GSList]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-coverage.h
  */
  def glib_slistautoptr_cleanup_PangoCoverage(_l : Ptr[Ptr[_root_.glib.all.GSList]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def glib_slistautoptr_cleanup_PangoFont(_l : Ptr[Ptr[_root_.glib.all.GSList]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def glib_slistautoptr_cleanup_PangoFontDescription(_l : Ptr[Ptr[_root_.glib.all.GSList]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def glib_slistautoptr_cleanup_PangoFontFace(_l : Ptr[Ptr[_root_.glib.all.GSList]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def glib_slistautoptr_cleanup_PangoFontFamily(_l : Ptr[Ptr[_root_.glib.all.GSList]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontmap.h
  */
  def glib_slistautoptr_cleanup_PangoFontMap(_l : Ptr[Ptr[_root_.glib.all.GSList]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def glib_slistautoptr_cleanup_PangoLayout(_l : Ptr[Ptr[_root_.glib.all.GSList]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def glib_slistautoptr_cleanup_PangoLayoutIter(_l : Ptr[Ptr[_root_.glib.all.GSList]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-tabs.h
  */
  def glib_slistautoptr_cleanup_PangoTabArray(_l : Ptr[Ptr[_root_.glib.all.GSList]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-enum-types.h
  */
  def pango_alignment_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_allow_breaks_new(allow_breaks : _root_.glib.all.gboolean): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_background_alpha_new(alpha : _root_.glib.all.guint16): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_background_new(red : _root_.glib.all.guint16, green : _root_.glib.all.guint16, blue : _root_.glib.all.guint16): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_baseline_shift_new(shift : CInt): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-break.h
  */
  def pango_attr_break(text : CString, length : CInt, attr_list : Ptr[PangoAttrList], offset : CInt, attrs : Ptr[PangoLogAttr], attrs_len : CInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_fallback_new(enable_fallback : _root_.glib.all.gboolean): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_family_new(family : CString): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_font_desc_new(desc : Ptr[PangoFontDescription]): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_font_features_new(features : CString): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_font_scale_new(scale : PangoFontScale): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_foreground_alpha_new(alpha : _root_.glib.all.guint16): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_foreground_new(red : _root_.glib.all.guint16, green : _root_.glib.all.guint16, blue : _root_.glib.all.guint16): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_gravity_hint_new(hint : PangoGravityHint): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_gravity_new(gravity : PangoGravity): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_insert_hyphens_new(insert_hyphens : _root_.glib.all.gboolean): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_iterator_copy(iterator : Ptr[PangoAttrIterator]): Ptr[PangoAttrIterator] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_iterator_destroy(iterator : Ptr[PangoAttrIterator]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_iterator_get(iterator : Ptr[PangoAttrIterator], `type` : PangoAttrType): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_iterator_get_attrs(iterator : Ptr[PangoAttrIterator]): Ptr[_root_.glib.all.GSList] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_iterator_get_font(iterator : Ptr[PangoAttrIterator], desc : Ptr[PangoFontDescription], language : Ptr[Ptr[PangoLanguage]], extra_attrs : Ptr[Ptr[_root_.glib.all.GSList]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_iterator_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_iterator_next(iterator : Ptr[PangoAttrIterator]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_iterator_range(iterator : Ptr[PangoAttrIterator], start : Ptr[CInt], end : Ptr[CInt]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_language_new(language : Ptr[PangoLanguage]): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_letter_spacing_new(letter_spacing : CInt): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_line_height_new(factor : Double): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_line_height_new_absolute(height : CInt): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_list_change(list : Ptr[PangoAttrList], attr : Ptr[PangoAttribute]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_list_copy(list : Ptr[PangoAttrList]): Ptr[PangoAttrList] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_list_equal(list : Ptr[PangoAttrList], other_list : Ptr[PangoAttrList]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_list_filter(list : Ptr[PangoAttrList], func : PangoAttrFilterFunc, data : _root_.glib.all.gpointer): Ptr[PangoAttrList] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_list_from_string(text : CString): Ptr[PangoAttrList] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_list_get_attributes(list : Ptr[PangoAttrList]): Ptr[_root_.glib.all.GSList] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_list_get_iterator(list : Ptr[PangoAttrList]): Ptr[PangoAttrIterator] = extern

  /**
   * PangoAttrList:
  
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_list_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_list_insert(list : Ptr[PangoAttrList], attr : Ptr[PangoAttribute]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_list_insert_before(list : Ptr[PangoAttrList], attr : Ptr[PangoAttribute]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_list_new(): Ptr[PangoAttrList] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_list_ref(list : Ptr[PangoAttrList]): Ptr[PangoAttrList] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_list_splice(list : Ptr[PangoAttrList], other : Ptr[PangoAttrList], pos : CInt, len : CInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_list_to_string(list : Ptr[PangoAttrList]): CString = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_list_unref(list : Ptr[PangoAttrList]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_list_update(list : Ptr[PangoAttrList], pos : CInt, remove : CInt, add : CInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_overline_color_new(red : _root_.glib.all.guint16, green : _root_.glib.all.guint16, blue : _root_.glib.all.guint16): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_overline_new(overline : PangoOverline): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_rise_new(rise : CInt): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_scale_new(scale_factor : Double): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_sentence_new(): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_shape_new(ink_rect : Ptr[PangoRectangle], logical_rect : Ptr[PangoRectangle]): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_shape_new_with_data(ink_rect : Ptr[PangoRectangle], logical_rect : Ptr[PangoRectangle], data : _root_.glib.all.gpointer, copy_func : PangoAttrDataCopyFunc, destroy_func : _root_.glib.all.GDestroyNotify): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_show_new(flags : PangoShowFlags): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_size_new(size : CInt): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_size_new_absolute(size : CInt): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_stretch_new(stretch : PangoStretch): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_strikethrough_color_new(red : _root_.glib.all.guint16, green : _root_.glib.all.guint16, blue : _root_.glib.all.guint16): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_strikethrough_new(strikethrough : _root_.glib.all.gboolean): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_style_new(style : PangoStyle): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_text_transform_new(transform : PangoTextTransform): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_type_get_name(`type` : PangoAttrType): CString = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-enum-types.h
  */
  def pango_attr_type_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_type_register(name : CString): PangoAttrType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_underline_color_new(red : _root_.glib.all.guint16, green : _root_.glib.all.guint16, blue : _root_.glib.all.guint16): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_underline_new(underline : PangoUnderline): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_variant_new(variant : PangoVariant): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_weight_new(weight : PangoWeight): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attr_word_new(): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attribute_as_color(attr : Ptr[PangoAttribute]): Ptr[PangoAttrColor] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attribute_as_float(attr : Ptr[PangoAttribute]): Ptr[PangoAttrFloat] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attribute_as_font_desc(attr : Ptr[PangoAttribute]): Ptr[PangoAttrFontDesc] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attribute_as_font_features(attr : Ptr[PangoAttribute]): Ptr[PangoAttrFontFeatures] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attribute_as_int(attr : Ptr[PangoAttribute]): Ptr[PangoAttrInt] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attribute_as_language(attr : Ptr[PangoAttribute]): Ptr[PangoAttrLanguage] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attribute_as_shape(attr : Ptr[PangoAttribute]): Ptr[PangoAttrShape] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attribute_as_size(attr : Ptr[PangoAttribute]): Ptr[PangoAttrSize] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attribute_as_string(attr : Ptr[PangoAttribute]): Ptr[PangoAttrString] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attribute_copy(attr : Ptr[PangoAttribute]): Ptr[PangoAttribute] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attribute_destroy(attr : Ptr[PangoAttribute]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attribute_equal(attr1 : Ptr[PangoAttribute], attr2 : Ptr[PangoAttribute]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attribute_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
  */
  def pango_attribute_init(attr : Ptr[PangoAttribute], klass : Ptr[PangoAttrClass]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-enum-types.h
  */
  def pango_baseline_shift_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-bidi-type.h
  */
  def pango_bidi_type_for_unichar(ch : _root_.glib.all.gunichar): PangoBidiType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-enum-types.h
  */
  def pango_bidi_type_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-break.h
  */
  def pango_break(text : CString, length : CInt, analysis : Ptr[PangoAnalysis], attrs : Ptr[PangoLogAttr], attrs_len : CInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-color.h
  */
  def pango_color_copy(src : Ptr[PangoColor]): Ptr[PangoColor] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-color.h
  */
  def pango_color_free(color : Ptr[PangoColor]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-color.h
  */
  def pango_color_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-color.h
  */
  def pango_color_parse(color : Ptr[PangoColor], spec : CString): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-color.h
  */
  def pango_color_parse_with_alpha(color : Ptr[PangoColor], alpha : Ptr[_root_.glib.all.guint16], spec : CString): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-color.h
  */
  def pango_color_to_string(color : Ptr[PangoColor]): CString = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-context.h
  */
  def pango_context_changed(context : Ptr[PangoContext]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-context.h
  */
  def pango_context_get_base_dir(context : Ptr[PangoContext]): PangoDirection = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-context.h
  */
  def pango_context_get_base_gravity(context : Ptr[PangoContext]): PangoGravity = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-context.h
  */
  def pango_context_get_font_description(context : Ptr[PangoContext]): Ptr[PangoFontDescription] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-context.h
  */
  def pango_context_get_font_map(context : Ptr[PangoContext]): Ptr[PangoFontMap] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-context.h
  */
  def pango_context_get_gravity(context : Ptr[PangoContext]): PangoGravity = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-context.h
  */
  def pango_context_get_gravity_hint(context : Ptr[PangoContext]): PangoGravityHint = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-context.h
  */
  def pango_context_get_language(context : Ptr[PangoContext]): Ptr[PangoLanguage] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-context.h
  */
  def pango_context_get_matrix(context : Ptr[PangoContext]): Ptr[PangoMatrix] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-context.h
  */
  def pango_context_get_metrics(context : Ptr[PangoContext], desc : Ptr[PangoFontDescription], language : Ptr[PangoLanguage]): Ptr[PangoFontMetrics] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-context.h
  */
  def pango_context_get_round_glyph_positions(context : Ptr[PangoContext]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-context.h
  */
  def pango_context_get_serial(context : Ptr[PangoContext]): _root_.glib.all.guint = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-context.h
  */
  def pango_context_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-context.h
  */
  def pango_context_list_families(context : Ptr[PangoContext], families : Ptr[Ptr[Ptr[PangoFontFamily]]], n_families : Ptr[CInt]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-context.h
  */
  def pango_context_load_font(context : Ptr[PangoContext], desc : Ptr[PangoFontDescription]): Ptr[PangoFont] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-context.h
  */
  def pango_context_load_fontset(context : Ptr[PangoContext], desc : Ptr[PangoFontDescription], language : Ptr[PangoLanguage]): Ptr[PangoFontset] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-context.h
  */
  def pango_context_new(): Ptr[PangoContext] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-context.h
  */
  def pango_context_set_base_dir(context : Ptr[PangoContext], direction : PangoDirection): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-context.h
  */
  def pango_context_set_base_gravity(context : Ptr[PangoContext], gravity : PangoGravity): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-context.h
  */
  def pango_context_set_font_description(context : Ptr[PangoContext], desc : Ptr[PangoFontDescription]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-context.h
  */
  def pango_context_set_font_map(context : Ptr[PangoContext], font_map : Ptr[PangoFontMap]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-context.h
  */
  def pango_context_set_gravity_hint(context : Ptr[PangoContext], hint : PangoGravityHint): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-context.h
  */
  def pango_context_set_language(context : Ptr[PangoContext], language : Ptr[PangoLanguage]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-context.h
  */
  def pango_context_set_matrix(context : Ptr[PangoContext], matrix : Ptr[PangoMatrix]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-context.h
  */
  def pango_context_set_round_glyph_positions(context : Ptr[PangoContext], round_positions : _root_.glib.all.gboolean): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-coverage.h
  */
  def pango_coverage_copy(coverage : Ptr[PangoCoverage]): Ptr[PangoCoverage] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-coverage.h
  */
  def pango_coverage_from_bytes(bytes : Ptr[_root_.glib.all.guchar], n_bytes : CInt): Ptr[PangoCoverage] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-coverage.h
  */
  def pango_coverage_get(coverage : Ptr[PangoCoverage], `index_` : CInt): PangoCoverageLevel = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-coverage.h
  */
  def pango_coverage_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-enum-types.h
  */
  def pango_coverage_level_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-coverage.h
  */
  def pango_coverage_max(coverage : Ptr[PangoCoverage], other : Ptr[PangoCoverage]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-coverage.h
  */
  def pango_coverage_new(): Ptr[PangoCoverage] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-coverage.h
  */
  def pango_coverage_ref(coverage : Ptr[PangoCoverage]): Ptr[PangoCoverage] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-coverage.h
  */
  def pango_coverage_set(coverage : Ptr[PangoCoverage], `index_` : CInt, level : PangoCoverageLevel): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-coverage.h
  */
  def pango_coverage_to_bytes(coverage : Ptr[PangoCoverage], bytes : Ptr[Ptr[_root_.glib.all.guchar]], n_bytes : Ptr[CInt]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-coverage.h
  */
  def pango_coverage_unref(coverage : Ptr[PangoCoverage]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-break.h
  */
  def pango_default_break(text : CString, length : CInt, analysis : Ptr[PangoAnalysis], attrs : Ptr[PangoLogAttr], attrs_len : CInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-enum-types.h
  */
  def pango_direction_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-enum-types.h
  */
  def pango_ellipsize_mode_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-engine.h
  */
  def pango_engine_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-engine.h
  */
  def pango_engine_lang_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-engine.h
  */
  def pango_engine_shape_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-types.h
  */
  def pango_extents_to_pixels(inclusive : Ptr[PangoRectangle], nearest : Ptr[PangoRectangle]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-bidi-type.h
  */
  def pango_find_base_dir(text : Ptr[_root_.glib.all.gchar], length : _root_.glib.all.gint): PangoDirection = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-utils.h
  */
  def pango_find_paragraph_boundary(text : CString, length : CInt, paragraph_delimiter_index : Ptr[CInt], next_paragraph_start : Ptr[CInt]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_describe(font : Ptr[PangoFont]): Ptr[PangoFontDescription] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_describe_with_absolute_size(font : Ptr[PangoFont]): Ptr[PangoFontDescription] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_better_match(desc : Ptr[PangoFontDescription], old_match : Ptr[PangoFontDescription], new_match : Ptr[PangoFontDescription]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_copy(desc : Ptr[PangoFontDescription]): Ptr[PangoFontDescription] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_copy_static(desc : Ptr[PangoFontDescription]): Ptr[PangoFontDescription] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_equal(desc1 : Ptr[PangoFontDescription], desc2 : Ptr[PangoFontDescription]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_free(desc : Ptr[PangoFontDescription]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_from_string(str : CString): Ptr[PangoFontDescription] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_get_family(desc : Ptr[PangoFontDescription]): CString = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_get_gravity(desc : Ptr[PangoFontDescription]): PangoGravity = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_get_set_fields(desc : Ptr[PangoFontDescription]): PangoFontMask = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_get_size(desc : Ptr[PangoFontDescription]): _root_.glib.all.gint = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_get_size_is_absolute(desc : Ptr[PangoFontDescription]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_get_stretch(desc : Ptr[PangoFontDescription]): PangoStretch = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_get_style(desc : Ptr[PangoFontDescription]): PangoStyle = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_get_variant(desc : Ptr[PangoFontDescription]): PangoVariant = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_get_variations(desc : Ptr[PangoFontDescription]): CString = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_get_weight(desc : Ptr[PangoFontDescription]): PangoWeight = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_hash(desc : Ptr[PangoFontDescription]): _root_.glib.all.guint = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_merge(desc : Ptr[PangoFontDescription], desc_to_merge : Ptr[PangoFontDescription], replace_existing : _root_.glib.all.gboolean): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_merge_static(desc : Ptr[PangoFontDescription], desc_to_merge : Ptr[PangoFontDescription], replace_existing : _root_.glib.all.gboolean): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_new(): Ptr[PangoFontDescription] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_set_absolute_size(desc : Ptr[PangoFontDescription], size : Double): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_set_family(desc : Ptr[PangoFontDescription], family : CString): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_set_family_static(desc : Ptr[PangoFontDescription], family : CString): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_set_gravity(desc : Ptr[PangoFontDescription], gravity : PangoGravity): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_set_size(desc : Ptr[PangoFontDescription], size : _root_.glib.all.gint): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_set_stretch(desc : Ptr[PangoFontDescription], stretch : PangoStretch): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_set_style(desc : Ptr[PangoFontDescription], style : PangoStyle): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_set_variant(desc : Ptr[PangoFontDescription], variant : PangoVariant): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_set_variations(desc : Ptr[PangoFontDescription], variations : CString): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_set_variations_static(desc : Ptr[PangoFontDescription], variations : CString): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_set_weight(desc : Ptr[PangoFontDescription], weight : PangoWeight): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_to_filename(desc : Ptr[PangoFontDescription]): CString = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_to_string(desc : Ptr[PangoFontDescription]): CString = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_description_unset_fields(desc : Ptr[PangoFontDescription], to_unset : PangoFontMask): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_descriptions_free(descs : Ptr[Ptr[PangoFontDescription]], n_descs : CInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_deserialize(context : Ptr[PangoContext], bytes : Ptr[_root_.glib.all.GBytes], error : Ptr[Ptr[_root_.glib.all.GError]]): Ptr[PangoFont] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_face_describe(face : Ptr[PangoFontFace]): Ptr[PangoFontDescription] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_face_get_face_name(face : Ptr[PangoFontFace]): CString = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_face_get_family(face : Ptr[PangoFontFace]): Ptr[PangoFontFamily] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_face_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_face_is_synthesized(face : Ptr[PangoFontFace]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_face_list_sizes(face : Ptr[PangoFontFace], sizes : Ptr[Ptr[CInt]], n_sizes : Ptr[CInt]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_family_get_face(family : Ptr[PangoFontFamily], name : CString): Ptr[PangoFontFace] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_family_get_name(family : Ptr[PangoFontFamily]): CString = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_family_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_family_is_monospace(family : Ptr[PangoFontFamily]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_family_is_variable(family : Ptr[PangoFontFamily]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_family_list_faces(family : Ptr[PangoFontFamily], faces : Ptr[Ptr[Ptr[PangoFontFace]]], n_faces : Ptr[CInt]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_find_shaper(font : Ptr[PangoFont], language : Ptr[PangoLanguage], ch : _root_.glib.all.guint32): Ptr[PangoEngineShape] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_get_coverage(font : Ptr[PangoFont], language : Ptr[PangoLanguage]): Ptr[PangoCoverage] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_get_face(font : Ptr[PangoFont]): Ptr[PangoFontFace] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_get_features(font : Ptr[PangoFont], features : Ptr[_root_.libharfbuzz.all.hb_feature_t], len : _root_.glib.all.guint, num_features : Ptr[_root_.glib.all.guint]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_get_font_map(font : Ptr[PangoFont]): Ptr[PangoFontMap] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_get_glyph_extents(font : Ptr[PangoFont], glyph : PangoGlyph, ink_rect : Ptr[PangoRectangle], logical_rect : Ptr[PangoRectangle]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_get_hb_font(font : Ptr[PangoFont]): Ptr[_root_.libharfbuzz.all.hb_font_t] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_get_languages(font : Ptr[PangoFont]): Ptr[Ptr[PangoLanguage]] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_get_metrics(font : Ptr[PangoFont], language : Ptr[PangoLanguage]): Ptr[PangoFontMetrics] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_has_char(font : Ptr[PangoFont], wc : _root_.glib.all.gunichar): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontmap.h
  */
  def pango_font_map_changed(fontmap : Ptr[PangoFontMap]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontmap.h
  */
  def pango_font_map_create_context(fontmap : Ptr[PangoFontMap]): Ptr[PangoContext] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontmap.h
  */
  def pango_font_map_get_family(fontmap : Ptr[PangoFontMap], name : CString): Ptr[PangoFontFamily] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontmap.h
  */
  def pango_font_map_get_serial(fontmap : Ptr[PangoFontMap]): _root_.glib.all.guint = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontmap.h
  */
  def pango_font_map_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontmap.h
  */
  def pango_font_map_list_families(fontmap : Ptr[PangoFontMap], families : Ptr[Ptr[Ptr[PangoFontFamily]]], n_families : Ptr[CInt]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontmap.h
  */
  def pango_font_map_load_font(fontmap : Ptr[PangoFontMap], context : Ptr[PangoContext], desc : Ptr[PangoFontDescription]): Ptr[PangoFont] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontmap.h
  */
  def pango_font_map_load_fontset(fontmap : Ptr[PangoFontMap], context : Ptr[PangoContext], desc : Ptr[PangoFontDescription], language : Ptr[PangoLanguage]): Ptr[PangoFontset] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-enum-types.h
  */
  def pango_font_mask_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_metrics_get_approximate_char_width(metrics : Ptr[PangoFontMetrics]): CInt = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_metrics_get_approximate_digit_width(metrics : Ptr[PangoFontMetrics]): CInt = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_metrics_get_ascent(metrics : Ptr[PangoFontMetrics]): CInt = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_metrics_get_descent(metrics : Ptr[PangoFontMetrics]): CInt = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_metrics_get_height(metrics : Ptr[PangoFontMetrics]): CInt = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_metrics_get_strikethrough_position(metrics : Ptr[PangoFontMetrics]): CInt = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_metrics_get_strikethrough_thickness(metrics : Ptr[PangoFontMetrics]): CInt = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_metrics_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_metrics_get_underline_position(metrics : Ptr[PangoFontMetrics]): CInt = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_metrics_get_underline_thickness(metrics : Ptr[PangoFontMetrics]): CInt = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_metrics_ref(metrics : Ptr[PangoFontMetrics]): Ptr[PangoFontMetrics] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_metrics_unref(metrics : Ptr[PangoFontMetrics]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-enum-types.h
  */
  def pango_font_scale_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
  */
  def pango_font_serialize(font : Ptr[PangoFont]): Ptr[_root_.glib.all.GBytes] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontset.h
  */
  def pango_fontset_foreach(fontset : Ptr[PangoFontset], func : PangoFontsetForeachFunc, data : _root_.glib.all.gpointer): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontset.h
  */
  def pango_fontset_get_font(fontset : Ptr[PangoFontset], wc : _root_.glib.all.guint): Ptr[PangoFont] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontset.h
  */
  def pango_fontset_get_metrics(fontset : Ptr[PangoFontset]): Ptr[PangoFontMetrics] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontset.h
  */
  def pango_fontset_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontset-simple.h
  */
  def pango_fontset_simple_append(fontset : Ptr[PangoFontsetSimple], font : Ptr[PangoFont]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontset-simple.h
  */
  def pango_fontset_simple_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontset-simple.h
  */
  def pango_fontset_simple_new(language : Ptr[PangoLanguage]): Ptr[PangoFontsetSimple] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontset-simple.h
  */
  def pango_fontset_simple_size(fontset : Ptr[PangoFontsetSimple]): CInt = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-break.h
  */
  def pango_get_log_attrs(text : CString, length : CInt, level : CInt, language : Ptr[PangoLanguage], attrs : Ptr[PangoLogAttr], attrs_len : CInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-bidi-type.h
  */
  def pango_get_mirror_char(ch : _root_.glib.all.gunichar, mirrored_ch : Ptr[_root_.glib.all.gunichar]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph-item.h
  */
  def pango_glyph_item_apply_attrs(glyph_item : Ptr[PangoGlyphItem], text : CString, list : Ptr[PangoAttrList]): Ptr[_root_.glib.all.GSList] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph-item.h
  */
  def pango_glyph_item_copy(orig : Ptr[PangoGlyphItem]): Ptr[PangoGlyphItem] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph-item.h
  */
  def pango_glyph_item_free(glyph_item : Ptr[PangoGlyphItem]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph-item.h
  */
  def pango_glyph_item_get_logical_widths(glyph_item : Ptr[PangoGlyphItem], text : CString, logical_widths : Ptr[CInt]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph-item.h
  */
  def pango_glyph_item_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph-item.h
  */
  def pango_glyph_item_iter_copy(orig : Ptr[PangoGlyphItemIter]): Ptr[PangoGlyphItemIter] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph-item.h
  */
  def pango_glyph_item_iter_free(iter : Ptr[PangoGlyphItemIter]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph-item.h
  */
  def pango_glyph_item_iter_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph-item.h
  */
  def pango_glyph_item_iter_init_end(iter : Ptr[PangoGlyphItemIter], glyph_item : Ptr[PangoGlyphItem], text : CString): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph-item.h
  */
  def pango_glyph_item_iter_init_start(iter : Ptr[PangoGlyphItemIter], glyph_item : Ptr[PangoGlyphItem], text : CString): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph-item.h
  */
  def pango_glyph_item_iter_next_cluster(iter : Ptr[PangoGlyphItemIter]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph-item.h
  */
  def pango_glyph_item_iter_prev_cluster(iter : Ptr[PangoGlyphItemIter]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph-item.h
  */
  def pango_glyph_item_letter_space(glyph_item : Ptr[PangoGlyphItem], text : CString, log_attrs : Ptr[PangoLogAttr], letter_spacing : CInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph-item.h
  */
  def pango_glyph_item_split(orig : Ptr[PangoGlyphItem], text : CString, split_index : CInt): Ptr[PangoGlyphItem] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph.h
  */
  def pango_glyph_string_copy(string : Ptr[PangoGlyphString]): Ptr[PangoGlyphString] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph.h
  */
  def pango_glyph_string_extents(glyphs : Ptr[PangoGlyphString], font : Ptr[PangoFont], ink_rect : Ptr[PangoRectangle], logical_rect : Ptr[PangoRectangle]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph.h
  */
  def pango_glyph_string_extents_range(glyphs : Ptr[PangoGlyphString], start : CInt, end : CInt, font : Ptr[PangoFont], ink_rect : Ptr[PangoRectangle], logical_rect : Ptr[PangoRectangle]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph.h
  */
  def pango_glyph_string_free(string : Ptr[PangoGlyphString]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph.h
  */
  def pango_glyph_string_get_logical_widths(glyphs : Ptr[PangoGlyphString], text : CString, length : CInt, embedding_level : CInt, logical_widths : Ptr[CInt]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph.h
  */
  def pango_glyph_string_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph.h
  */
  def pango_glyph_string_get_width(glyphs : Ptr[PangoGlyphString]): CInt = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph.h
  */
  def pango_glyph_string_index_to_x(glyphs : Ptr[PangoGlyphString], text : CString, length : CInt, analysis : Ptr[PangoAnalysis], `index_` : CInt, trailing : _root_.glib.all.gboolean, x_pos : Ptr[CInt]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph.h
  */
  def pango_glyph_string_index_to_x_full(glyphs : Ptr[PangoGlyphString], text : CString, length : CInt, analysis : Ptr[PangoAnalysis], attrs : Ptr[PangoLogAttr], `index_` : CInt, trailing : _root_.glib.all.gboolean, x_pos : Ptr[CInt]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph.h
  */
  def pango_glyph_string_new(): Ptr[PangoGlyphString] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph.h
  */
  def pango_glyph_string_set_size(string : Ptr[PangoGlyphString], new_len : CInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph.h
  */
  def pango_glyph_string_x_to_index(glyphs : Ptr[PangoGlyphString], text : CString, length : CInt, analysis : Ptr[PangoAnalysis], x_pos : CInt, `index_` : Ptr[CInt], trailing : Ptr[CInt]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-gravity.h
  */
  def pango_gravity_get_for_matrix(matrix : Ptr[PangoMatrix]): PangoGravity = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-gravity.h
  */
  def pango_gravity_get_for_script(script : PangoScript, base_gravity : PangoGravity, hint : PangoGravityHint): PangoGravity = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-gravity.h
  */
  def pango_gravity_get_for_script_and_width(script : PangoScript, wide : _root_.glib.all.gboolean, base_gravity : PangoGravity, hint : PangoGravityHint): PangoGravity = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-enum-types.h
  */
  def pango_gravity_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-enum-types.h
  */
  def pango_gravity_hint_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-gravity.h
  */
  def pango_gravity_to_rotation(gravity : PangoGravity): Double = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-utils.h
  */
  def pango_is_zero_width(ch : _root_.glib.all.gunichar): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-item.h
  */
  def pango_item_apply_attrs(item : Ptr[PangoItem], iter : Ptr[PangoAttrIterator]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-item.h
  */
  def pango_item_copy(item : Ptr[PangoItem]): Ptr[PangoItem] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-item.h
  */
  def pango_item_free(item : Ptr[PangoItem]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-item.h
  */
  def pango_item_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-item.h
  */
  def pango_item_new(): Ptr[PangoItem] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-item.h
  */
  def pango_item_split(orig : Ptr[PangoItem], split_index : CInt, split_offset : CInt): Ptr[PangoItem] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-item.h
  */
  def pango_itemize(context : Ptr[PangoContext], text : CString, start_index : CInt, length : CInt, attrs : Ptr[PangoAttrList], cached_iter : Ptr[PangoAttrIterator]): Ptr[_root_.glib.all.GList] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-item.h
  */
  def pango_itemize_with_base_dir(context : Ptr[PangoContext], base_dir : PangoDirection, text : CString, start_index : CInt, length : CInt, attrs : Ptr[PangoAttrList], cached_iter : Ptr[PangoAttrIterator]): Ptr[_root_.glib.all.GList] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-language.h
  */
  def pango_language_from_string(language : CString): Ptr[PangoLanguage] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-language.h
  */
  def pango_language_get_default(): Ptr[PangoLanguage] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-language.h
  */
  def pango_language_get_preferred(): Ptr[Ptr[PangoLanguage]] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-language.h
  */
  def pango_language_get_sample_string(language : Ptr[PangoLanguage]): CString = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-language.h
  */
  def pango_language_get_scripts(language : Ptr[PangoLanguage], num_scripts : Ptr[CInt]): Ptr[PangoScript] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-language.h
  */
  def pango_language_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-language.h
  */
  def pango_language_includes_script(language : Ptr[PangoLanguage], script : PangoScript): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-language.h
  */
  def pango_language_matches(language : Ptr[PangoLanguage], range_list : CString): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-language.h
  */
  def pango_language_to_string(language : Ptr[PangoLanguage]): CString = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_context_changed(layout : Ptr[PangoLayout]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_copy(src : Ptr[PangoLayout]): Ptr[PangoLayout] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_deserialize(context : Ptr[PangoContext], bytes : Ptr[_root_.glib.all.GBytes], flags : PangoLayoutDeserializeFlags, error : Ptr[Ptr[_root_.glib.all.GError]]): Ptr[PangoLayout] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-enum-types.h
  */
  def pango_layout_deserialize_error_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_deserialize_error_quark(): _root_.glib.all.GQuark = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-enum-types.h
  */
  def pango_layout_deserialize_flags_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_alignment(layout : Ptr[PangoLayout]): PangoAlignment = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_attributes(layout : Ptr[PangoLayout]): Ptr[PangoAttrList] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_auto_dir(layout : Ptr[PangoLayout]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_baseline(layout : Ptr[PangoLayout]): CInt = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_caret_pos(layout : Ptr[PangoLayout], `index_` : CInt, strong_pos : Ptr[PangoRectangle], weak_pos : Ptr[PangoRectangle]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_character_count(layout : Ptr[PangoLayout]): _root_.glib.all.gint = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_context(layout : Ptr[PangoLayout]): Ptr[PangoContext] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_cursor_pos(layout : Ptr[PangoLayout], `index_` : CInt, strong_pos : Ptr[PangoRectangle], weak_pos : Ptr[PangoRectangle]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_direction(layout : Ptr[PangoLayout], index : CInt): PangoDirection = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_ellipsize(layout : Ptr[PangoLayout]): PangoEllipsizeMode = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_extents(layout : Ptr[PangoLayout], ink_rect : Ptr[PangoRectangle], logical_rect : Ptr[PangoRectangle]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_font_description(layout : Ptr[PangoLayout]): Ptr[PangoFontDescription] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_height(layout : Ptr[PangoLayout]): CInt = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_indent(layout : Ptr[PangoLayout]): CInt = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_iter(layout : Ptr[PangoLayout]): Ptr[PangoLayoutIter] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_justify(layout : Ptr[PangoLayout]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_justify_last_line(layout : Ptr[PangoLayout]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_line(layout : Ptr[PangoLayout], line : CInt): Ptr[PangoLayoutLine] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_line_count(layout : Ptr[PangoLayout]): CInt = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_line_readonly(layout : Ptr[PangoLayout], line : CInt): Ptr[PangoLayoutLine] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_line_spacing(layout : Ptr[PangoLayout]): Float = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_lines(layout : Ptr[PangoLayout]): Ptr[_root_.glib.all.GSList] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_lines_readonly(layout : Ptr[PangoLayout]): Ptr[_root_.glib.all.GSList] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_log_attrs(layout : Ptr[PangoLayout], attrs : Ptr[Ptr[PangoLogAttr]], n_attrs : Ptr[_root_.glib.all.gint]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_log_attrs_readonly(layout : Ptr[PangoLayout], n_attrs : Ptr[_root_.glib.all.gint]): Ptr[PangoLogAttr] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_pixel_extents(layout : Ptr[PangoLayout], ink_rect : Ptr[PangoRectangle], logical_rect : Ptr[PangoRectangle]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_pixel_size(layout : Ptr[PangoLayout], width : Ptr[CInt], height : Ptr[CInt]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_serial(layout : Ptr[PangoLayout]): _root_.glib.all.guint = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_single_paragraph_mode(layout : Ptr[PangoLayout]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_size(layout : Ptr[PangoLayout], width : Ptr[CInt], height : Ptr[CInt]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_spacing(layout : Ptr[PangoLayout]): CInt = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_tabs(layout : Ptr[PangoLayout]): Ptr[PangoTabArray] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_text(layout : Ptr[PangoLayout]): CString = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_unknown_glyphs_count(layout : Ptr[PangoLayout]): CInt = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_width(layout : Ptr[PangoLayout]): CInt = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_get_wrap(layout : Ptr[PangoLayout]): PangoWrapMode = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_index_to_line_x(layout : Ptr[PangoLayout], `index_` : CInt, trailing : _root_.glib.all.gboolean, line : Ptr[CInt], x_pos : Ptr[CInt]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_index_to_pos(layout : Ptr[PangoLayout], `index_` : CInt, pos : Ptr[PangoRectangle]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_is_ellipsized(layout : Ptr[PangoLayout]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_is_wrapped(layout : Ptr[PangoLayout]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_iter_at_last_line(iter : Ptr[PangoLayoutIter]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_iter_copy(iter : Ptr[PangoLayoutIter]): Ptr[PangoLayoutIter] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_iter_free(iter : Ptr[PangoLayoutIter]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_iter_get_baseline(iter : Ptr[PangoLayoutIter]): CInt = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_iter_get_char_extents(iter : Ptr[PangoLayoutIter], logical_rect : Ptr[PangoRectangle]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_iter_get_cluster_extents(iter : Ptr[PangoLayoutIter], ink_rect : Ptr[PangoRectangle], logical_rect : Ptr[PangoRectangle]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_iter_get_index(iter : Ptr[PangoLayoutIter]): CInt = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_iter_get_layout(iter : Ptr[PangoLayoutIter]): Ptr[PangoLayout] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_iter_get_layout_extents(iter : Ptr[PangoLayoutIter], ink_rect : Ptr[PangoRectangle], logical_rect : Ptr[PangoRectangle]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_iter_get_line(iter : Ptr[PangoLayoutIter]): Ptr[PangoLayoutLine] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_iter_get_line_extents(iter : Ptr[PangoLayoutIter], ink_rect : Ptr[PangoRectangle], logical_rect : Ptr[PangoRectangle]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_iter_get_line_readonly(iter : Ptr[PangoLayoutIter]): Ptr[PangoLayoutLine] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_iter_get_line_yrange(iter : Ptr[PangoLayoutIter], `y0_` : Ptr[CInt], `y1_` : Ptr[CInt]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_iter_get_run(iter : Ptr[PangoLayoutIter]): Ptr[PangoLayoutRun] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_iter_get_run_baseline(iter : Ptr[PangoLayoutIter]): CInt = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_iter_get_run_extents(iter : Ptr[PangoLayoutIter], ink_rect : Ptr[PangoRectangle], logical_rect : Ptr[PangoRectangle]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_iter_get_run_readonly(iter : Ptr[PangoLayoutIter]): Ptr[PangoLayoutRun] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_iter_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_iter_next_char(iter : Ptr[PangoLayoutIter]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_iter_next_cluster(iter : Ptr[PangoLayoutIter]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_iter_next_line(iter : Ptr[PangoLayoutIter]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_iter_next_run(iter : Ptr[PangoLayoutIter]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_line_get_extents(line : Ptr[PangoLayoutLine], ink_rect : Ptr[PangoRectangle], logical_rect : Ptr[PangoRectangle]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_line_get_height(line : Ptr[PangoLayoutLine], height : Ptr[CInt]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_line_get_length(line : Ptr[PangoLayoutLine]): CInt = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_line_get_pixel_extents(layout_line : Ptr[PangoLayoutLine], ink_rect : Ptr[PangoRectangle], logical_rect : Ptr[PangoRectangle]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_line_get_resolved_direction(line : Ptr[PangoLayoutLine]): PangoDirection = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_line_get_start_index(line : Ptr[PangoLayoutLine]): CInt = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_line_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_line_get_x_ranges(line : Ptr[PangoLayoutLine], start_index : CInt, end_index : CInt, ranges : Ptr[Ptr[CInt]], n_ranges : Ptr[CInt]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_line_index_to_x(line : Ptr[PangoLayoutLine], `index_` : CInt, trailing : _root_.glib.all.gboolean, x_pos : Ptr[CInt]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_line_is_paragraph_start(line : Ptr[PangoLayoutLine]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_line_ref(line : Ptr[PangoLayoutLine]): Ptr[PangoLayoutLine] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_line_unref(line : Ptr[PangoLayoutLine]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_line_x_to_index(line : Ptr[PangoLayoutLine], x_pos : CInt, `index_` : Ptr[CInt], trailing : Ptr[CInt]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_move_cursor_visually(layout : Ptr[PangoLayout], strong : _root_.glib.all.gboolean, old_index : CInt, old_trailing : CInt, direction : CInt, new_index : Ptr[CInt], new_trailing : Ptr[CInt]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_new(context : Ptr[PangoContext]): Ptr[PangoLayout] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_serialize(layout : Ptr[PangoLayout], flags : PangoLayoutSerializeFlags): Ptr[_root_.glib.all.GBytes] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-enum-types.h
  */
  def pango_layout_serialize_flags_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_set_alignment(layout : Ptr[PangoLayout], alignment : PangoAlignment): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_set_attributes(layout : Ptr[PangoLayout], attrs : Ptr[PangoAttrList]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_set_auto_dir(layout : Ptr[PangoLayout], auto_dir : _root_.glib.all.gboolean): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_set_ellipsize(layout : Ptr[PangoLayout], ellipsize : PangoEllipsizeMode): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_set_font_description(layout : Ptr[PangoLayout], desc : Ptr[PangoFontDescription]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_set_height(layout : Ptr[PangoLayout], height : CInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_set_indent(layout : Ptr[PangoLayout], indent : CInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_set_justify(layout : Ptr[PangoLayout], justify : _root_.glib.all.gboolean): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_set_justify_last_line(layout : Ptr[PangoLayout], justify : _root_.glib.all.gboolean): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_set_line_spacing(layout : Ptr[PangoLayout], factor : Float): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_set_markup(layout : Ptr[PangoLayout], markup : CString, length : CInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_set_markup_with_accel(layout : Ptr[PangoLayout], markup : CString, length : CInt, accel_marker : _root_.glib.all.gunichar, accel_char : Ptr[_root_.glib.all.gunichar]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_set_single_paragraph_mode(layout : Ptr[PangoLayout], setting : _root_.glib.all.gboolean): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_set_spacing(layout : Ptr[PangoLayout], spacing : CInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_set_tabs(layout : Ptr[PangoLayout], tabs : Ptr[PangoTabArray]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_set_text(layout : Ptr[PangoLayout], text : CString, length : CInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_set_width(layout : Ptr[PangoLayout], width : CInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_set_wrap(layout : Ptr[PangoLayout], wrap : PangoWrapMode): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_write_to_file(layout : Ptr[PangoLayout], flags : PangoLayoutSerializeFlags, filename : CString, error : Ptr[Ptr[_root_.glib.all.GError]]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
  */
  def pango_layout_xy_to_index(layout : Ptr[PangoLayout], x : CInt, y : CInt, `index_` : Ptr[CInt], trailing : Ptr[CInt]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-utils.h
  */
  def pango_log2vis_get_embedding_levels(text : Ptr[_root_.glib.all.gchar], length : CInt, pbase_dir : Ptr[PangoDirection]): Ptr[_root_.glib.all.guint8] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-markup.h
  */
  def pango_markup_parser_finish(context : Ptr[_root_.glib.all.GMarkupParseContext], attr_list : Ptr[Ptr[PangoAttrList]], text : Ptr[CString], accel_char : Ptr[_root_.glib.all.gunichar], error : Ptr[Ptr[_root_.glib.all.GError]]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-markup.h
  */
  def pango_markup_parser_new(accel_marker : _root_.glib.all.gunichar): Ptr[_root_.glib.all.GMarkupParseContext] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-matrix.h
  */
  def pango_matrix_concat(matrix : Ptr[PangoMatrix], new_matrix : Ptr[PangoMatrix]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-matrix.h
  */
  def pango_matrix_copy(matrix : Ptr[PangoMatrix]): Ptr[PangoMatrix] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-matrix.h
  */
  def pango_matrix_free(matrix : Ptr[PangoMatrix]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-matrix.h
  */
  def pango_matrix_get_font_scale_factor(matrix : Ptr[PangoMatrix]): Double = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-matrix.h
  */
  def pango_matrix_get_font_scale_factors(matrix : Ptr[PangoMatrix], xscale : Ptr[Double], yscale : Ptr[Double]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-matrix.h
  */
  def pango_matrix_get_slant_ratio(matrix : Ptr[PangoMatrix]): Double = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-matrix.h
  */
  def pango_matrix_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-matrix.h
  */
  def pango_matrix_rotate(matrix : Ptr[PangoMatrix], degrees : Double): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-matrix.h
  */
  def pango_matrix_scale(matrix : Ptr[PangoMatrix], scale_x : Double, scale_y : Double): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-matrix.h
  */
  def pango_matrix_transform_distance(matrix : Ptr[PangoMatrix], dx : Ptr[Double], dy : Ptr[Double]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-matrix.h
  */
  def pango_matrix_transform_pixel_rectangle(matrix : Ptr[PangoMatrix], rect : Ptr[PangoRectangle]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-matrix.h
  */
  def pango_matrix_transform_point(matrix : Ptr[PangoMatrix], x : Ptr[Double], y : Ptr[Double]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-matrix.h
  */
  def pango_matrix_transform_rectangle(matrix : Ptr[PangoMatrix], rect : Ptr[PangoRectangle]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-matrix.h
  */
  def pango_matrix_translate(matrix : Ptr[PangoMatrix], tx : Double, ty : Double): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-enum-types.h
  */
  def pango_overline_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-utils.h
  */
  def pango_parse_enum(`type` : _root_.gobject.all.GType, str : CString, value : Ptr[CInt], warn : _root_.glib.all.gboolean, possible_values : Ptr[CString]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-markup.h
  */
  def pango_parse_markup(markup_text : CString, length : CInt, accel_marker : _root_.glib.all.gunichar, attr_list : Ptr[Ptr[PangoAttrList]], text : Ptr[CString], accel_char : Ptr[_root_.glib.all.gunichar], error : Ptr[Ptr[_root_.glib.all.GError]]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-utils.h
  */
  def pango_parse_stretch(str : CString, stretch : Ptr[PangoStretch], warn : _root_.glib.all.gboolean): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-utils.h
  */
  def pango_parse_style(str : CString, style : Ptr[PangoStyle], warn : _root_.glib.all.gboolean): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-utils.h
  */
  def pango_parse_variant(str : CString, variant : Ptr[PangoVariant], warn : _root_.glib.all.gboolean): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-utils.h
  */
  def pango_parse_weight(str : CString, weight : Ptr[PangoWeight], warn : _root_.glib.all.gboolean): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-utils.h
  */
  def pango_quantize_line_geometry(thickness : Ptr[CInt], position : Ptr[CInt]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-utils.h
  */
  def pango_read_line(stream : Ptr[FILE], str : Ptr[_root_.glib.all.GString]): _root_.glib.all.gint = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-enum-types.h
  */
  def pango_render_part_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-renderer.h
  */
  def pango_renderer_activate(renderer : Ptr[PangoRenderer]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-renderer.h
  */
  def pango_renderer_deactivate(renderer : Ptr[PangoRenderer]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-renderer.h
  */
  def pango_renderer_draw_error_underline(renderer : Ptr[PangoRenderer], x : CInt, y : CInt, width : CInt, height : CInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-renderer.h
  */
  def pango_renderer_draw_glyph(renderer : Ptr[PangoRenderer], font : Ptr[PangoFont], glyph : PangoGlyph, x : Double, y : Double): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-renderer.h
  */
  def pango_renderer_draw_glyph_item(renderer : Ptr[PangoRenderer], text : CString, glyph_item : Ptr[PangoGlyphItem], x : CInt, y : CInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-renderer.h
  */
  def pango_renderer_draw_glyphs(renderer : Ptr[PangoRenderer], font : Ptr[PangoFont], glyphs : Ptr[PangoGlyphString], x : CInt, y : CInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-renderer.h
  */
  def pango_renderer_draw_layout(renderer : Ptr[PangoRenderer], layout : Ptr[PangoLayout], x : CInt, y : CInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-renderer.h
  */
  def pango_renderer_draw_layout_line(renderer : Ptr[PangoRenderer], line : Ptr[PangoLayoutLine], x : CInt, y : CInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-renderer.h
  */
  def pango_renderer_draw_rectangle(renderer : Ptr[PangoRenderer], part : PangoRenderPart, x : CInt, y : CInt, width : CInt, height : CInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-renderer.h
  */
  def pango_renderer_draw_trapezoid(renderer : Ptr[PangoRenderer], part : PangoRenderPart, `y1_` : Double, x11 : Double, x21 : Double, y2 : Double, x12 : Double, x22 : Double): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-renderer.h
  */
  def pango_renderer_get_alpha(renderer : Ptr[PangoRenderer], part : PangoRenderPart): _root_.glib.all.guint16 = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-renderer.h
  */
  def pango_renderer_get_color(renderer : Ptr[PangoRenderer], part : PangoRenderPart): Ptr[PangoColor] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-renderer.h
  */
  def pango_renderer_get_layout(renderer : Ptr[PangoRenderer]): Ptr[PangoLayout] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-renderer.h
  */
  def pango_renderer_get_layout_line(renderer : Ptr[PangoRenderer]): Ptr[PangoLayoutLine] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-renderer.h
  */
  def pango_renderer_get_matrix(renderer : Ptr[PangoRenderer]): Ptr[PangoMatrix] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-renderer.h
  */
  def pango_renderer_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-renderer.h
  */
  def pango_renderer_part_changed(renderer : Ptr[PangoRenderer], part : PangoRenderPart): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-renderer.h
  */
  def pango_renderer_set_alpha(renderer : Ptr[PangoRenderer], part : PangoRenderPart, alpha : _root_.glib.all.guint16): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-renderer.h
  */
  def pango_renderer_set_color(renderer : Ptr[PangoRenderer], part : PangoRenderPart, color : Ptr[PangoColor]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-renderer.h
  */
  def pango_renderer_set_matrix(renderer : Ptr[PangoRenderer], matrix : Ptr[PangoMatrix]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-item.h
  */
  def pango_reorder_items(items : Ptr[_root_.glib.all.GList]): Ptr[_root_.glib.all.GList] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-utils.h
  */
  def pango_scan_int(pos : Ptr[CString], out : Ptr[CInt]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-utils.h
  */
  def pango_scan_string(pos : Ptr[CString], out : Ptr[_root_.glib.all.GString]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-utils.h
  */
  def pango_scan_word(pos : Ptr[CString], out : Ptr[_root_.glib.all.GString]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-script.h
  */
  def pango_script_for_unichar(ch : _root_.glib.all.gunichar): PangoScript = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-script.h
  */
  def pango_script_get_sample_language(script : PangoScript): Ptr[PangoLanguage] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-enum-types.h
  */
  def pango_script_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-script.h
  */
  def pango_script_iter_free(iter : Ptr[PangoScriptIter]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-script.h
  */
  def pango_script_iter_get_range(iter : Ptr[PangoScriptIter], start : Ptr[CString], end : Ptr[CString], script : Ptr[PangoScript]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-script.h
  */
  def pango_script_iter_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-script.h
  */
  def pango_script_iter_new(text : CString, length : CInt): Ptr[PangoScriptIter] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-script.h
  */
  def pango_script_iter_next(iter : Ptr[PangoScriptIter]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph.h
  */
  def pango_shape(text : CString, length : CInt, analysis : Ptr[PangoAnalysis], glyphs : Ptr[PangoGlyphString]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-enum-types.h
  */
  def pango_shape_flags_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph.h
  */
  def pango_shape_full(item_text : CString, item_length : CInt, paragraph_text : CString, paragraph_length : CInt, analysis : Ptr[PangoAnalysis], glyphs : Ptr[PangoGlyphString]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph.h
  */
  def pango_shape_item(item : Ptr[PangoItem], paragraph_text : CString, paragraph_length : CInt, log_attrs : Ptr[PangoLogAttr], glyphs : Ptr[PangoGlyphString], flags : PangoShapeFlags): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph.h
  */
  def pango_shape_with_flags(item_text : CString, item_length : CInt, paragraph_text : CString, paragraph_length : CInt, analysis : Ptr[PangoAnalysis], glyphs : Ptr[PangoGlyphString], flags : PangoShapeFlags): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-enum-types.h
  */
  def pango_show_flags_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-utils.h
  */
  def pango_skip_space(pos : Ptr[CString]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-utils.h
  */
  def pango_split_file_list(str : CString): Ptr[CString] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-enum-types.h
  */
  def pango_stretch_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-enum-types.h
  */
  def pango_style_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-enum-types.h
  */
  def pango_tab_align_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-tabs.h
  */
  def pango_tab_array_copy(src : Ptr[PangoTabArray]): Ptr[PangoTabArray] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-tabs.h
  */
  def pango_tab_array_free(tab_array : Ptr[PangoTabArray]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-tabs.h
  */
  def pango_tab_array_from_string(text : CString): Ptr[PangoTabArray] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-tabs.h
  */
  def pango_tab_array_get_decimal_point(tab_array : Ptr[PangoTabArray], tab_index : CInt): _root_.glib.all.gunichar = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-tabs.h
  */
  def pango_tab_array_get_positions_in_pixels(tab_array : Ptr[PangoTabArray]): _root_.glib.all.gboolean = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-tabs.h
  */
  def pango_tab_array_get_size(tab_array : Ptr[PangoTabArray]): _root_.glib.all.gint = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-tabs.h
  */
  def pango_tab_array_get_tab(tab_array : Ptr[PangoTabArray], tab_index : _root_.glib.all.gint, alignment : Ptr[PangoTabAlign], location : Ptr[_root_.glib.all.gint]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-tabs.h
  */
  def pango_tab_array_get_tabs(tab_array : Ptr[PangoTabArray], alignments : Ptr[Ptr[PangoTabAlign]], locations : Ptr[Ptr[_root_.glib.all.gint]]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-tabs.h
  */
  def pango_tab_array_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-tabs.h
  */
  def pango_tab_array_new(initial_size : _root_.glib.all.gint, positions_in_pixels : _root_.glib.all.gboolean): Ptr[PangoTabArray] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-tabs.h
  */
  def pango_tab_array_new_with_positions(size : _root_.glib.all.gint, positions_in_pixels : _root_.glib.all.gboolean, first_alignment : PangoTabAlign, first_position : _root_.glib.all.gint): Ptr[PangoTabArray] = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-tabs.h
  */
  def pango_tab_array_resize(tab_array : Ptr[PangoTabArray], new_size : _root_.glib.all.gint): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-tabs.h
  */
  def pango_tab_array_set_decimal_point(tab_array : Ptr[PangoTabArray], tab_index : CInt, decimal_point : _root_.glib.all.gunichar): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-tabs.h
  */
  def pango_tab_array_set_positions_in_pixels(tab_array : Ptr[PangoTabArray], positions_in_pixels : _root_.glib.all.gboolean): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-tabs.h
  */
  def pango_tab_array_set_tab(tab_array : Ptr[PangoTabArray], tab_index : _root_.glib.all.gint, alignment : PangoTabAlign, location : _root_.glib.all.gint): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-tabs.h
  */
  def pango_tab_array_sort(tab_array : Ptr[PangoTabArray]): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-tabs.h
  */
  def pango_tab_array_to_string(tab_array : Ptr[PangoTabArray]): CString = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-break.h
  */
  def pango_tailor_break(text : CString, length : CInt, analysis : Ptr[PangoAnalysis], offset : CInt, attrs : Ptr[PangoLogAttr], attrs_len : CInt): Unit = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-enum-types.h
  */
  def pango_text_transform_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-utils.h
  */
  def pango_trim_string(str : CString): CString = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-enum-types.h
  */
  def pango_underline_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-bidi-type.h
  */
  def pango_unichar_direction(ch : _root_.glib.all.gunichar): PangoDirection = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-types.h
  */
  def pango_units_from_double(d : Double): CInt = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-types.h
  */
  def pango_units_to_double(i : CInt): Double = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-enum-types.h
  */
  def pango_variant_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-utils.h
  */
  def pango_version(): CInt = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-utils.h
  */
  def pango_version_check(required_major : CInt, required_minor : CInt, required_micro : CInt): CString = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-utils.h
  */
  def pango_version_string(): CString = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-enum-types.h
  */
  def pango_weight_get_type(): _root_.gobject.all.GType = extern

  /**
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-enum-types.h
  */
  def pango_wrap_mode_get_type(): _root_.gobject.all.GType = extern

  /**
   * script_engine_create: (skip)
  
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-engine.h
  */
  def script_engine_create(id : CString): Ptr[PangoEngine] = extern

  /**
   * script_engine_exit: (skip)
  
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-engine.h
  */
  def script_engine_exit(): Unit = extern

  /**
   * script_engine_init: (skip) : a `GTypeModule` structure used to associate any GObject types created in this module with the module.
  
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-engine.h
  */
  def script_engine_init(module : Ptr[_root_.gobject.all.GTypeModule]): Unit = extern

  /**
   * script_engine_list: (skip) : location to store a pointer to an array of engines. _engines: location to store the number of elements in .
  
   * [bindgen] header: /usr/include/pango-1.0/pango/pango-engine.h
  */
  def script_engine_list(engines : Ptr[Ptr[PangoEngineInfo]], n_engines : Ptr[CInt]): Unit = extern

import extern_functions.*
export extern_functions.*

