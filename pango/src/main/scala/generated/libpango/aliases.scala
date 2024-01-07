package libpango
package aliases

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

import _root_.libpango.enumerations.*
import _root_.libpango.aliases.*
import _root_.libpango.structs.*
type FILE = libc.stdio.FILE
object FILE: 
  val _tag: Tag[FILE] = summon[Tag[libc.stdio.FILE]]
  inline def apply(inline o: libc.stdio.FILE): FILE = o
  extension (v: FILE)
    inline def value: libc.stdio.FILE = v

/**
 * PangoAttrDataCopyFunc: _data: user data to copy

 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoAttrDataCopyFunc = CFuncPtr1[_root_.glib.all.gconstpointer, _root_.glib.all.gpointer]
object PangoAttrDataCopyFunc: 
  given _tag: Tag[PangoAttrDataCopyFunc] = Tag.materializeCFuncPtr1[_root_.glib.all.gconstpointer, _root_.glib.all.gpointer]
  inline def fromPtr(ptr: Ptr[Byte]): PangoAttrDataCopyFunc = CFuncPtr.fromPtr(ptr)
  inline def apply(inline o: CFuncPtr1[_root_.glib.all.gconstpointer, _root_.glib.all.gpointer]): PangoAttrDataCopyFunc = o
  extension (v: PangoAttrDataCopyFunc)
    inline def value: CFuncPtr1[_root_.glib.all.gconstpointer, _root_.glib.all.gpointer] = v
    inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

/**
 * PangoAttrFilterFunc: : a Pango attribute _data: user data passed to the function

 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoAttrFilterFunc = CFuncPtr2[Ptr[PangoAttribute], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
object PangoAttrFilterFunc: 
  given _tag: Tag[PangoAttrFilterFunc] = Tag.materializeCFuncPtr2[Ptr[PangoAttribute], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
  inline def fromPtr(ptr: Ptr[Byte]): PangoAttrFilterFunc = CFuncPtr.fromPtr(ptr)
  inline def apply(inline o: CFuncPtr2[Ptr[PangoAttribute], _root_.glib.all.gpointer, _root_.glib.all.gboolean]): PangoAttrFilterFunc = o
  extension (v: PangoAttrFilterFunc)
    inline def value: CFuncPtr2[Ptr[PangoAttribute], _root_.glib.all.gpointer, _root_.glib.all.gboolean] = v
    inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoAttrIterator_autoptr = Ptr[PangoAttrIterator]
object PangoAttrIterator_autoptr: 
  given _tag: Tag[PangoAttrIterator_autoptr] = Tag.Ptr[PangoAttrIterator](PangoAttrIterator._tag)
  inline def apply(inline o: Ptr[PangoAttrIterator]): PangoAttrIterator_autoptr = o
  extension (v: PangoAttrIterator_autoptr)
    inline def value: Ptr[PangoAttrIterator] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoAttrIterator_listautoptr = Ptr[_root_.glib.all.GList]
object PangoAttrIterator_listautoptr: 
  given _tag: Tag[PangoAttrIterator_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): PangoAttrIterator_listautoptr = o
  extension (v: PangoAttrIterator_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoAttrIterator_queueautoptr = Ptr[_root_.glib.all.GQueue]
object PangoAttrIterator_queueautoptr: 
  given _tag: Tag[PangoAttrIterator_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): PangoAttrIterator_queueautoptr = o
  extension (v: PangoAttrIterator_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoAttrIterator_slistautoptr = Ptr[_root_.glib.all.GSList]
object PangoAttrIterator_slistautoptr: 
  given _tag: Tag[PangoAttrIterator_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): PangoAttrIterator_slistautoptr = o
  extension (v: PangoAttrIterator_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoAttrList_autoptr = Ptr[PangoAttrList]
object PangoAttrList_autoptr: 
  given _tag: Tag[PangoAttrList_autoptr] = Tag.Ptr[PangoAttrList](PangoAttrList._tag)
  inline def apply(inline o: Ptr[PangoAttrList]): PangoAttrList_autoptr = o
  extension (v: PangoAttrList_autoptr)
    inline def value: Ptr[PangoAttrList] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoAttrList_listautoptr = Ptr[_root_.glib.all.GList]
object PangoAttrList_listautoptr: 
  given _tag: Tag[PangoAttrList_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): PangoAttrList_listautoptr = o
  extension (v: PangoAttrList_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoAttrList_queueautoptr = Ptr[_root_.glib.all.GQueue]
object PangoAttrList_queueautoptr: 
  given _tag: Tag[PangoAttrList_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): PangoAttrList_queueautoptr = o
  extension (v: PangoAttrList_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoAttrList_slistautoptr = Ptr[_root_.glib.all.GSList]
object PangoAttrList_slistautoptr: 
  given _tag: Tag[PangoAttrList_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): PangoAttrList_slistautoptr = o
  extension (v: PangoAttrList_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoAttribute_autoptr = Ptr[PangoAttribute]
object PangoAttribute_autoptr: 
  given _tag: Tag[PangoAttribute_autoptr] = Tag.Ptr[PangoAttribute](PangoAttribute._tag)
  inline def apply(inline o: Ptr[PangoAttribute]): PangoAttribute_autoptr = o
  extension (v: PangoAttribute_autoptr)
    inline def value: Ptr[PangoAttribute] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoAttribute_listautoptr = Ptr[_root_.glib.all.GList]
object PangoAttribute_listautoptr: 
  given _tag: Tag[PangoAttribute_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): PangoAttribute_listautoptr = o
  extension (v: PangoAttribute_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoAttribute_queueautoptr = Ptr[_root_.glib.all.GQueue]
object PangoAttribute_queueautoptr: 
  given _tag: Tag[PangoAttribute_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): PangoAttribute_queueautoptr = o
  extension (v: PangoAttribute_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoAttribute_slistautoptr = Ptr[_root_.glib.all.GSList]
object PangoAttribute_slistautoptr: 
  given _tag: Tag[PangoAttribute_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): PangoAttribute_slistautoptr = o
  extension (v: PangoAttribute_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-coverage.h
*/
opaque type PangoCoverage_autoptr = Ptr[PangoCoverage]
object PangoCoverage_autoptr: 
  given _tag: Tag[PangoCoverage_autoptr] = Tag.Ptr[PangoCoverage](PangoCoverage._tag)
  inline def apply(inline o: Ptr[PangoCoverage]): PangoCoverage_autoptr = o
  extension (v: PangoCoverage_autoptr)
    inline def value: Ptr[PangoCoverage] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-coverage.h
*/
opaque type PangoCoverage_listautoptr = Ptr[_root_.glib.all.GList]
object PangoCoverage_listautoptr: 
  given _tag: Tag[PangoCoverage_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): PangoCoverage_listautoptr = o
  extension (v: PangoCoverage_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-coverage.h
*/
opaque type PangoCoverage_queueautoptr = Ptr[_root_.glib.all.GQueue]
object PangoCoverage_queueautoptr: 
  given _tag: Tag[PangoCoverage_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): PangoCoverage_queueautoptr = o
  extension (v: PangoCoverage_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-coverage.h
*/
opaque type PangoCoverage_slistautoptr = Ptr[_root_.glib.all.GSList]
object PangoCoverage_slistautoptr: 
  given _tag: Tag[PangoCoverage_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): PangoCoverage_slistautoptr = o
  extension (v: PangoCoverage_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-font.h
*/
opaque type PangoFontDescription_autoptr = Ptr[PangoFontDescription]
object PangoFontDescription_autoptr: 
  given _tag: Tag[PangoFontDescription_autoptr] = Tag.Ptr[PangoFontDescription](PangoFontDescription._tag)
  inline def apply(inline o: Ptr[PangoFontDescription]): PangoFontDescription_autoptr = o
  extension (v: PangoFontDescription_autoptr)
    inline def value: Ptr[PangoFontDescription] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-font.h
*/
opaque type PangoFontDescription_listautoptr = Ptr[_root_.glib.all.GList]
object PangoFontDescription_listautoptr: 
  given _tag: Tag[PangoFontDescription_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): PangoFontDescription_listautoptr = o
  extension (v: PangoFontDescription_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-font.h
*/
opaque type PangoFontDescription_queueautoptr = Ptr[_root_.glib.all.GQueue]
object PangoFontDescription_queueautoptr: 
  given _tag: Tag[PangoFontDescription_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): PangoFontDescription_queueautoptr = o
  extension (v: PangoFontDescription_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-font.h
*/
opaque type PangoFontDescription_slistautoptr = Ptr[_root_.glib.all.GSList]
object PangoFontDescription_slistautoptr: 
  given _tag: Tag[PangoFontDescription_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): PangoFontDescription_slistautoptr = o
  extension (v: PangoFontDescription_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-font.h
*/
opaque type PangoFontFace_autoptr = Ptr[PangoFontFace]
object PangoFontFace_autoptr: 
  given _tag: Tag[PangoFontFace_autoptr] = Tag.Ptr[PangoFontFace](PangoFontFace._tag)
  inline def apply(inline o: Ptr[PangoFontFace]): PangoFontFace_autoptr = o
  extension (v: PangoFontFace_autoptr)
    inline def value: Ptr[PangoFontFace] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-font.h
*/
opaque type PangoFontFace_listautoptr = Ptr[_root_.glib.all.GList]
object PangoFontFace_listautoptr: 
  given _tag: Tag[PangoFontFace_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): PangoFontFace_listautoptr = o
  extension (v: PangoFontFace_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-font.h
*/
opaque type PangoFontFace_queueautoptr = Ptr[_root_.glib.all.GQueue]
object PangoFontFace_queueautoptr: 
  given _tag: Tag[PangoFontFace_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): PangoFontFace_queueautoptr = o
  extension (v: PangoFontFace_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-font.h
*/
opaque type PangoFontFace_slistautoptr = Ptr[_root_.glib.all.GSList]
object PangoFontFace_slistautoptr: 
  given _tag: Tag[PangoFontFace_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): PangoFontFace_slistautoptr = o
  extension (v: PangoFontFace_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-font.h
*/
opaque type PangoFontFamily_autoptr = Ptr[PangoFontFamily]
object PangoFontFamily_autoptr: 
  given _tag: Tag[PangoFontFamily_autoptr] = Tag.Ptr[PangoFontFamily](PangoFontFamily._tag)
  inline def apply(inline o: Ptr[PangoFontFamily]): PangoFontFamily_autoptr = o
  extension (v: PangoFontFamily_autoptr)
    inline def value: Ptr[PangoFontFamily] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-font.h
*/
opaque type PangoFontFamily_listautoptr = Ptr[_root_.glib.all.GList]
object PangoFontFamily_listautoptr: 
  given _tag: Tag[PangoFontFamily_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): PangoFontFamily_listautoptr = o
  extension (v: PangoFontFamily_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-font.h
*/
opaque type PangoFontFamily_queueautoptr = Ptr[_root_.glib.all.GQueue]
object PangoFontFamily_queueautoptr: 
  given _tag: Tag[PangoFontFamily_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): PangoFontFamily_queueautoptr = o
  extension (v: PangoFontFamily_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-font.h
*/
opaque type PangoFontFamily_slistautoptr = Ptr[_root_.glib.all.GSList]
object PangoFontFamily_slistautoptr: 
  given _tag: Tag[PangoFontFamily_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): PangoFontFamily_slistautoptr = o
  extension (v: PangoFontFamily_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-fontmap.h
*/
opaque type PangoFontMap_autoptr = Ptr[PangoFontMap]
object PangoFontMap_autoptr: 
  given _tag: Tag[PangoFontMap_autoptr] = Tag.Ptr[PangoFontMap](PangoFontMap._tag)
  inline def apply(inline o: Ptr[PangoFontMap]): PangoFontMap_autoptr = o
  extension (v: PangoFontMap_autoptr)
    inline def value: Ptr[PangoFontMap] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-fontmap.h
*/
opaque type PangoFontMap_listautoptr = Ptr[_root_.glib.all.GList]
object PangoFontMap_listautoptr: 
  given _tag: Tag[PangoFontMap_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): PangoFontMap_listautoptr = o
  extension (v: PangoFontMap_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-fontmap.h
*/
opaque type PangoFontMap_queueautoptr = Ptr[_root_.glib.all.GQueue]
object PangoFontMap_queueautoptr: 
  given _tag: Tag[PangoFontMap_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): PangoFontMap_queueautoptr = o
  extension (v: PangoFontMap_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-fontmap.h
*/
opaque type PangoFontMap_slistautoptr = Ptr[_root_.glib.all.GSList]
object PangoFontMap_slistautoptr: 
  given _tag: Tag[PangoFontMap_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): PangoFontMap_slistautoptr = o
  extension (v: PangoFontMap_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-font.h
*/
opaque type PangoFont_autoptr = Ptr[PangoFont]
object PangoFont_autoptr: 
  given _tag: Tag[PangoFont_autoptr] = Tag.Ptr[PangoFont](PangoFont._tag)
  inline def apply(inline o: Ptr[PangoFont]): PangoFont_autoptr = o
  extension (v: PangoFont_autoptr)
    inline def value: Ptr[PangoFont] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-font.h
*/
opaque type PangoFont_listautoptr = Ptr[_root_.glib.all.GList]
object PangoFont_listautoptr: 
  given _tag: Tag[PangoFont_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): PangoFont_listautoptr = o
  extension (v: PangoFont_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-font.h
*/
opaque type PangoFont_queueautoptr = Ptr[_root_.glib.all.GQueue]
object PangoFont_queueautoptr: 
  given _tag: Tag[PangoFont_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): PangoFont_queueautoptr = o
  extension (v: PangoFont_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-font.h
*/
opaque type PangoFont_slistautoptr = Ptr[_root_.glib.all.GSList]
object PangoFont_slistautoptr: 
  given _tag: Tag[PangoFont_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): PangoFont_slistautoptr = o
  extension (v: PangoFont_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * PangoFontsetForeachFunc: : a `PangoFontset` : a font from _data: callback data

 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-fontset.h
*/
opaque type PangoFontsetForeachFunc = CFuncPtr3[Ptr[PangoFontset], Ptr[PangoFont], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
object PangoFontsetForeachFunc: 
  given _tag: Tag[PangoFontsetForeachFunc] = Tag.materializeCFuncPtr3[Ptr[PangoFontset], Ptr[PangoFont], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
  inline def fromPtr(ptr: Ptr[Byte]): PangoFontsetForeachFunc = CFuncPtr.fromPtr(ptr)
  inline def apply(inline o: CFuncPtr3[Ptr[PangoFontset], Ptr[PangoFont], _root_.glib.all.gpointer, _root_.glib.all.gboolean]): PangoFontsetForeachFunc = o
  extension (v: PangoFontsetForeachFunc)
    inline def value: CFuncPtr3[Ptr[PangoFontset], Ptr[PangoFont], _root_.glib.all.gpointer, _root_.glib.all.gboolean] = v
    inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

/**
 * PangoGlyph:

 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-types.h
*/
type PangoGlyph = _root_.glib.all.guint32
object PangoGlyph: 
  given _tag: Tag[PangoGlyph] = _root_.glib.all.guint32._tag
  inline def apply(inline o: _root_.glib.all.guint32): PangoGlyph = o
  extension (v: PangoGlyph)
    inline def value: _root_.glib.all.guint32 = v

/**
 * PangoGlyphUnit:

 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-glyph.h
*/
type PangoGlyphUnit = _root_.glib.all.gint32
object PangoGlyphUnit: 
  given _tag: Tag[PangoGlyphUnit] = _root_.glib.all.gint32._tag
  inline def apply(inline o: _root_.glib.all.gint32): PangoGlyphUnit = o
  extension (v: PangoGlyphUnit)
    inline def value: _root_.glib.all.gint32 = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-layout.h
*/
opaque type PangoLayoutIter_autoptr = Ptr[PangoLayoutIter]
object PangoLayoutIter_autoptr: 
  given _tag: Tag[PangoLayoutIter_autoptr] = Tag.Ptr[PangoLayoutIter](PangoLayoutIter._tag)
  inline def apply(inline o: Ptr[PangoLayoutIter]): PangoLayoutIter_autoptr = o
  extension (v: PangoLayoutIter_autoptr)
    inline def value: Ptr[PangoLayoutIter] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-layout.h
*/
opaque type PangoLayoutIter_listautoptr = Ptr[_root_.glib.all.GList]
object PangoLayoutIter_listautoptr: 
  given _tag: Tag[PangoLayoutIter_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): PangoLayoutIter_listautoptr = o
  extension (v: PangoLayoutIter_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-layout.h
*/
opaque type PangoLayoutIter_queueautoptr = Ptr[_root_.glib.all.GQueue]
object PangoLayoutIter_queueautoptr: 
  given _tag: Tag[PangoLayoutIter_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): PangoLayoutIter_queueautoptr = o
  extension (v: PangoLayoutIter_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-layout.h
*/
opaque type PangoLayoutIter_slistautoptr = Ptr[_root_.glib.all.GSList]
object PangoLayoutIter_slistautoptr: 
  given _tag: Tag[PangoLayoutIter_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): PangoLayoutIter_slistautoptr = o
  extension (v: PangoLayoutIter_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * PangoLayoutRun:

 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-layout.h
*/
type PangoLayoutRun = PangoGlyphItem
object PangoLayoutRun: 
  given _tag: Tag[PangoLayoutRun] = PangoGlyphItem._tag
  inline def apply(inline o: PangoGlyphItem): PangoLayoutRun = o
  extension (v: PangoLayoutRun)
    inline def value: PangoGlyphItem = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-layout.h
*/
opaque type PangoLayout_autoptr = Ptr[PangoLayout]
object PangoLayout_autoptr: 
  given _tag: Tag[PangoLayout_autoptr] = Tag.Ptr[PangoLayout](PangoLayout._tag)
  inline def apply(inline o: Ptr[PangoLayout]): PangoLayout_autoptr = o
  extension (v: PangoLayout_autoptr)
    inline def value: Ptr[PangoLayout] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-layout.h
*/
opaque type PangoLayout_listautoptr = Ptr[_root_.glib.all.GList]
object PangoLayout_listautoptr: 
  given _tag: Tag[PangoLayout_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): PangoLayout_listautoptr = o
  extension (v: PangoLayout_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-layout.h
*/
opaque type PangoLayout_queueautoptr = Ptr[_root_.glib.all.GQueue]
object PangoLayout_queueautoptr: 
  given _tag: Tag[PangoLayout_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): PangoLayout_queueautoptr = o
  extension (v: PangoLayout_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-layout.h
*/
opaque type PangoLayout_slistautoptr = Ptr[_root_.glib.all.GSList]
object PangoLayout_slistautoptr: 
  given _tag: Tag[PangoLayout_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): PangoLayout_slistautoptr = o
  extension (v: PangoLayout_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-tabs.h
*/
opaque type PangoTabArray_autoptr = Ptr[PangoTabArray]
object PangoTabArray_autoptr: 
  given _tag: Tag[PangoTabArray_autoptr] = Tag.Ptr[PangoTabArray](PangoTabArray._tag)
  inline def apply(inline o: Ptr[PangoTabArray]): PangoTabArray_autoptr = o
  extension (v: PangoTabArray_autoptr)
    inline def value: Ptr[PangoTabArray] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-tabs.h
*/
opaque type PangoTabArray_listautoptr = Ptr[_root_.glib.all.GList]
object PangoTabArray_listautoptr: 
  given _tag: Tag[PangoTabArray_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): PangoTabArray_listautoptr = o
  extension (v: PangoTabArray_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-tabs.h
*/
opaque type PangoTabArray_queueautoptr = Ptr[_root_.glib.all.GQueue]
object PangoTabArray_queueautoptr: 
  given _tag: Tag[PangoTabArray_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): PangoTabArray_queueautoptr = o
  extension (v: PangoTabArray_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /opt/homebrew/Cellar/pango/1.50.14/include/pango-1.0/pango/pango-tabs.h
*/
opaque type PangoTabArray_slistautoptr = Ptr[_root_.glib.all.GSList]
object PangoTabArray_slistautoptr: 
  given _tag: Tag[PangoTabArray_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): PangoTabArray_slistautoptr = o
  extension (v: PangoTabArray_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

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

type pthread_mutex_t = posix.sys.types.pthread_mutex_t
object pthread_mutex_t: 
  val _tag: Tag[pthread_mutex_t] = summon[Tag[posix.sys.types.pthread_mutex_t]]
  inline def apply(inline o: posix.sys.types.pthread_mutex_t): pthread_mutex_t = o
  extension (v: pthread_mutex_t)
    inline def value: posix.sys.types.pthread_mutex_t = v

type pthread_t = posix.sys.types.pthread_t
object pthread_t: 
  val _tag: Tag[pthread_t] = summon[Tag[posix.sys.types.pthread_t]]
  inline def apply(inline o: posix.sys.types.pthread_t): pthread_t = o
  extension (v: pthread_t)
    inline def value: posix.sys.types.pthread_t = v

type size_t = libc.stddef.size_t
object size_t: 
  val _tag: Tag[size_t] = summon[Tag[libc.stddef.size_t]]
  inline def apply(inline o: libc.stddef.size_t): size_t = o
  extension (v: size_t)
    inline def value: libc.stddef.size_t = v

type time_t = posix.sys.types.time_t
object time_t: 
  val _tag: Tag[time_t] = summon[Tag[posix.sys.types.time_t]]
  inline def apply(inline o: posix.sys.types.time_t): time_t = o
  extension (v: time_t)
    inline def value: posix.sys.types.time_t = v

type tm = posix.time.tm
object tm: 
  val _tag: Tag[tm] = summon[Tag[posix.time.tm]]
  inline def apply(inline o: posix.time.tm): tm = o
  extension (v: tm)
    inline def value: posix.time.tm = v

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

type va_list = unsafe.CVarArgList
object va_list: 
  val _tag: Tag[va_list] = summon[Tag[unsafe.CVarArgList]]
  inline def apply(inline o: unsafe.CVarArgList): va_list = o
  extension (v: va_list)
    inline def value: unsafe.CVarArgList = v

