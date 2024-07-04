package sn.gnome.pango.internal

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

type FILE = libc.stdio.FILE
object FILE: 
  val _tag: Tag[FILE] = summon[Tag[libc.stdio.FILE]]
  inline def apply(inline o: libc.stdio.FILE): FILE = o
  extension (v: FILE)
    inline def value: libc.stdio.FILE = v

/**
 * PangoAttrDataCopyFunc: _data: user data to copy
*/
opaque type PangoAttrDataCopyFunc = CFuncPtr1[_root_.sn.gnome.glib.internal.gconstpointer, _root_.sn.gnome.glib.internal.gpointer]
object PangoAttrDataCopyFunc: 
  given _tag: Tag[PangoAttrDataCopyFunc] = Tag.materializeCFuncPtr1[_root_.sn.gnome.glib.internal.gconstpointer, _root_.sn.gnome.glib.internal.gpointer]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): PangoAttrDataCopyFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[_root_.sn.gnome.glib.internal.gconstpointer, _root_.sn.gnome.glib.internal.gpointer]): PangoAttrDataCopyFunc = o
  extension (v: PangoAttrDataCopyFunc)
    inline def value: CFuncPtr1[_root_.sn.gnome.glib.internal.gconstpointer, _root_.sn.gnome.glib.internal.gpointer] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * PangoAttrFilterFunc: : a Pango attribute _data: user data passed to the function
*/
opaque type PangoAttrFilterFunc = CFuncPtr2[Ptr[PangoAttribute], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object PangoAttrFilterFunc: 
  given _tag: Tag[PangoAttrFilterFunc] = Tag.materializeCFuncPtr2[Ptr[PangoAttribute], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): PangoAttrFilterFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[PangoAttribute], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): PangoAttrFilterFunc = o
  extension (v: PangoAttrFilterFunc)
    inline def value: CFuncPtr2[Ptr[PangoAttribute], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type PangoAttrIterator_autoptr = Ptr[PangoAttrIterator]
object PangoAttrIterator_autoptr: 
  given _tag: Tag[PangoAttrIterator_autoptr] = Tag.Ptr[PangoAttrIterator](PangoAttrIterator._tag)
  inline def apply(inline o: Ptr[PangoAttrIterator]): PangoAttrIterator_autoptr = o
  extension (v: PangoAttrIterator_autoptr)
    inline def value: Ptr[PangoAttrIterator] = v

opaque type PangoAttrIterator_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object PangoAttrIterator_listautoptr: 
  given _tag: Tag[PangoAttrIterator_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): PangoAttrIterator_listautoptr = o
  extension (v: PangoAttrIterator_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type PangoAttrIterator_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object PangoAttrIterator_queueautoptr: 
  given _tag: Tag[PangoAttrIterator_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): PangoAttrIterator_queueautoptr = o
  extension (v: PangoAttrIterator_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type PangoAttrIterator_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object PangoAttrIterator_slistautoptr: 
  given _tag: Tag[PangoAttrIterator_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): PangoAttrIterator_slistautoptr = o
  extension (v: PangoAttrIterator_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type PangoAttrList_autoptr = Ptr[PangoAttrList]
object PangoAttrList_autoptr: 
  given _tag: Tag[PangoAttrList_autoptr] = Tag.Ptr[PangoAttrList](PangoAttrList._tag)
  inline def apply(inline o: Ptr[PangoAttrList]): PangoAttrList_autoptr = o
  extension (v: PangoAttrList_autoptr)
    inline def value: Ptr[PangoAttrList] = v

opaque type PangoAttrList_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object PangoAttrList_listautoptr: 
  given _tag: Tag[PangoAttrList_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): PangoAttrList_listautoptr = o
  extension (v: PangoAttrList_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type PangoAttrList_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object PangoAttrList_queueautoptr: 
  given _tag: Tag[PangoAttrList_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): PangoAttrList_queueautoptr = o
  extension (v: PangoAttrList_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type PangoAttrList_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object PangoAttrList_slistautoptr: 
  given _tag: Tag[PangoAttrList_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): PangoAttrList_slistautoptr = o
  extension (v: PangoAttrList_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type PangoAttribute_autoptr = Ptr[PangoAttribute]
object PangoAttribute_autoptr: 
  given _tag: Tag[PangoAttribute_autoptr] = Tag.Ptr[PangoAttribute](PangoAttribute._tag)
  inline def apply(inline o: Ptr[PangoAttribute]): PangoAttribute_autoptr = o
  extension (v: PangoAttribute_autoptr)
    inline def value: Ptr[PangoAttribute] = v

opaque type PangoAttribute_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object PangoAttribute_listautoptr: 
  given _tag: Tag[PangoAttribute_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): PangoAttribute_listautoptr = o
  extension (v: PangoAttribute_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type PangoAttribute_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object PangoAttribute_queueautoptr: 
  given _tag: Tag[PangoAttribute_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): PangoAttribute_queueautoptr = o
  extension (v: PangoAttribute_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type PangoAttribute_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object PangoAttribute_slistautoptr: 
  given _tag: Tag[PangoAttribute_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): PangoAttribute_slistautoptr = o
  extension (v: PangoAttribute_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type PangoCoverage_autoptr = Ptr[PangoCoverage]
object PangoCoverage_autoptr: 
  given _tag: Tag[PangoCoverage_autoptr] = Tag.Ptr[PangoCoverage](PangoCoverage._tag)
  inline def apply(inline o: Ptr[PangoCoverage]): PangoCoverage_autoptr = o
  extension (v: PangoCoverage_autoptr)
    inline def value: Ptr[PangoCoverage] = v

opaque type PangoCoverage_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object PangoCoverage_listautoptr: 
  given _tag: Tag[PangoCoverage_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): PangoCoverage_listautoptr = o
  extension (v: PangoCoverage_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type PangoCoverage_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object PangoCoverage_queueautoptr: 
  given _tag: Tag[PangoCoverage_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): PangoCoverage_queueautoptr = o
  extension (v: PangoCoverage_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type PangoCoverage_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object PangoCoverage_slistautoptr: 
  given _tag: Tag[PangoCoverage_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): PangoCoverage_slistautoptr = o
  extension (v: PangoCoverage_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type PangoFontDescription_autoptr = Ptr[PangoFontDescription]
object PangoFontDescription_autoptr: 
  given _tag: Tag[PangoFontDescription_autoptr] = Tag.Ptr[PangoFontDescription](PangoFontDescription._tag)
  inline def apply(inline o: Ptr[PangoFontDescription]): PangoFontDescription_autoptr = o
  extension (v: PangoFontDescription_autoptr)
    inline def value: Ptr[PangoFontDescription] = v

opaque type PangoFontDescription_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object PangoFontDescription_listautoptr: 
  given _tag: Tag[PangoFontDescription_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): PangoFontDescription_listautoptr = o
  extension (v: PangoFontDescription_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type PangoFontDescription_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object PangoFontDescription_queueautoptr: 
  given _tag: Tag[PangoFontDescription_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): PangoFontDescription_queueautoptr = o
  extension (v: PangoFontDescription_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type PangoFontDescription_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object PangoFontDescription_slistautoptr: 
  given _tag: Tag[PangoFontDescription_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): PangoFontDescription_slistautoptr = o
  extension (v: PangoFontDescription_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type PangoFontFace_autoptr = Ptr[PangoFontFace]
object PangoFontFace_autoptr: 
  given _tag: Tag[PangoFontFace_autoptr] = Tag.Ptr[PangoFontFace](PangoFontFace._tag)
  inline def apply(inline o: Ptr[PangoFontFace]): PangoFontFace_autoptr = o
  extension (v: PangoFontFace_autoptr)
    inline def value: Ptr[PangoFontFace] = v

opaque type PangoFontFace_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object PangoFontFace_listautoptr: 
  given _tag: Tag[PangoFontFace_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): PangoFontFace_listautoptr = o
  extension (v: PangoFontFace_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type PangoFontFace_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object PangoFontFace_queueautoptr: 
  given _tag: Tag[PangoFontFace_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): PangoFontFace_queueautoptr = o
  extension (v: PangoFontFace_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type PangoFontFace_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object PangoFontFace_slistautoptr: 
  given _tag: Tag[PangoFontFace_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): PangoFontFace_slistautoptr = o
  extension (v: PangoFontFace_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type PangoFontFamily_autoptr = Ptr[PangoFontFamily]
object PangoFontFamily_autoptr: 
  given _tag: Tag[PangoFontFamily_autoptr] = Tag.Ptr[PangoFontFamily](PangoFontFamily._tag)
  inline def apply(inline o: Ptr[PangoFontFamily]): PangoFontFamily_autoptr = o
  extension (v: PangoFontFamily_autoptr)
    inline def value: Ptr[PangoFontFamily] = v

opaque type PangoFontFamily_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object PangoFontFamily_listautoptr: 
  given _tag: Tag[PangoFontFamily_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): PangoFontFamily_listautoptr = o
  extension (v: PangoFontFamily_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type PangoFontFamily_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object PangoFontFamily_queueautoptr: 
  given _tag: Tag[PangoFontFamily_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): PangoFontFamily_queueautoptr = o
  extension (v: PangoFontFamily_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type PangoFontFamily_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object PangoFontFamily_slistautoptr: 
  given _tag: Tag[PangoFontFamily_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): PangoFontFamily_slistautoptr = o
  extension (v: PangoFontFamily_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type PangoFontMap_autoptr = Ptr[PangoFontMap]
object PangoFontMap_autoptr: 
  given _tag: Tag[PangoFontMap_autoptr] = Tag.Ptr[PangoFontMap](PangoFontMap._tag)
  inline def apply(inline o: Ptr[PangoFontMap]): PangoFontMap_autoptr = o
  extension (v: PangoFontMap_autoptr)
    inline def value: Ptr[PangoFontMap] = v

opaque type PangoFontMap_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object PangoFontMap_listautoptr: 
  given _tag: Tag[PangoFontMap_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): PangoFontMap_listautoptr = o
  extension (v: PangoFontMap_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type PangoFontMap_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object PangoFontMap_queueautoptr: 
  given _tag: Tag[PangoFontMap_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): PangoFontMap_queueautoptr = o
  extension (v: PangoFontMap_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type PangoFontMap_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object PangoFontMap_slistautoptr: 
  given _tag: Tag[PangoFontMap_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): PangoFontMap_slistautoptr = o
  extension (v: PangoFontMap_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type PangoFont_autoptr = Ptr[PangoFont]
object PangoFont_autoptr: 
  given _tag: Tag[PangoFont_autoptr] = Tag.Ptr[PangoFont](PangoFont._tag)
  inline def apply(inline o: Ptr[PangoFont]): PangoFont_autoptr = o
  extension (v: PangoFont_autoptr)
    inline def value: Ptr[PangoFont] = v

opaque type PangoFont_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object PangoFont_listautoptr: 
  given _tag: Tag[PangoFont_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): PangoFont_listautoptr = o
  extension (v: PangoFont_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type PangoFont_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object PangoFont_queueautoptr: 
  given _tag: Tag[PangoFont_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): PangoFont_queueautoptr = o
  extension (v: PangoFont_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type PangoFont_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object PangoFont_slistautoptr: 
  given _tag: Tag[PangoFont_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): PangoFont_slistautoptr = o
  extension (v: PangoFont_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * PangoFontsetForeachFunc: : a `PangoFontset` : a font from _data: callback data
*/
opaque type PangoFontsetForeachFunc = CFuncPtr3[Ptr[PangoFontset], Ptr[PangoFont], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object PangoFontsetForeachFunc: 
  given _tag: Tag[PangoFontsetForeachFunc] = Tag.materializeCFuncPtr3[Ptr[PangoFontset], Ptr[PangoFont], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): PangoFontsetForeachFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[PangoFontset], Ptr[PangoFont], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): PangoFontsetForeachFunc = o
  extension (v: PangoFontsetForeachFunc)
    inline def value: CFuncPtr3[Ptr[PangoFontset], Ptr[PangoFont], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * PangoGlyph:
*/
type PangoGlyph = _root_.sn.gnome.glib.internal.guint32
object PangoGlyph: 
  given _tag: Tag[PangoGlyph] = _root_.sn.gnome.glib.internal.guint32._tag
  inline def apply(inline o: _root_.sn.gnome.glib.internal.guint32): PangoGlyph = o
  extension (v: PangoGlyph)
    inline def value: _root_.sn.gnome.glib.internal.guint32 = v

/**
 * PangoGlyphUnit:
*/
type PangoGlyphUnit = _root_.sn.gnome.glib.internal.gint32
object PangoGlyphUnit: 
  given _tag: Tag[PangoGlyphUnit] = _root_.sn.gnome.glib.internal.gint32._tag
  inline def apply(inline o: _root_.sn.gnome.glib.internal.gint32): PangoGlyphUnit = o
  extension (v: PangoGlyphUnit)
    inline def value: _root_.sn.gnome.glib.internal.gint32 = v

opaque type PangoLayoutIter_autoptr = Ptr[PangoLayoutIter]
object PangoLayoutIter_autoptr: 
  given _tag: Tag[PangoLayoutIter_autoptr] = Tag.Ptr[PangoLayoutIter](PangoLayoutIter._tag)
  inline def apply(inline o: Ptr[PangoLayoutIter]): PangoLayoutIter_autoptr = o
  extension (v: PangoLayoutIter_autoptr)
    inline def value: Ptr[PangoLayoutIter] = v

opaque type PangoLayoutIter_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object PangoLayoutIter_listautoptr: 
  given _tag: Tag[PangoLayoutIter_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): PangoLayoutIter_listautoptr = o
  extension (v: PangoLayoutIter_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type PangoLayoutIter_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object PangoLayoutIter_queueautoptr: 
  given _tag: Tag[PangoLayoutIter_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): PangoLayoutIter_queueautoptr = o
  extension (v: PangoLayoutIter_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type PangoLayoutIter_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object PangoLayoutIter_slistautoptr: 
  given _tag: Tag[PangoLayoutIter_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): PangoLayoutIter_slistautoptr = o
  extension (v: PangoLayoutIter_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * PangoLayoutRun:
*/
type PangoLayoutRun = PangoGlyphItem
object PangoLayoutRun: 
  given _tag: Tag[PangoLayoutRun] = PangoGlyphItem._tag
  inline def apply(inline o: PangoGlyphItem): PangoLayoutRun = o
  extension (v: PangoLayoutRun)
    inline def value: PangoGlyphItem = v

opaque type PangoLayout_autoptr = Ptr[PangoLayout]
object PangoLayout_autoptr: 
  given _tag: Tag[PangoLayout_autoptr] = Tag.Ptr[PangoLayout](PangoLayout._tag)
  inline def apply(inline o: Ptr[PangoLayout]): PangoLayout_autoptr = o
  extension (v: PangoLayout_autoptr)
    inline def value: Ptr[PangoLayout] = v

opaque type PangoLayout_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object PangoLayout_listautoptr: 
  given _tag: Tag[PangoLayout_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): PangoLayout_listautoptr = o
  extension (v: PangoLayout_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type PangoLayout_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object PangoLayout_queueautoptr: 
  given _tag: Tag[PangoLayout_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): PangoLayout_queueautoptr = o
  extension (v: PangoLayout_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type PangoLayout_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object PangoLayout_slistautoptr: 
  given _tag: Tag[PangoLayout_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): PangoLayout_slistautoptr = o
  extension (v: PangoLayout_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type PangoTabArray_autoptr = Ptr[PangoTabArray]
object PangoTabArray_autoptr: 
  given _tag: Tag[PangoTabArray_autoptr] = Tag.Ptr[PangoTabArray](PangoTabArray._tag)
  inline def apply(inline o: Ptr[PangoTabArray]): PangoTabArray_autoptr = o
  extension (v: PangoTabArray_autoptr)
    inline def value: Ptr[PangoTabArray] = v

opaque type PangoTabArray_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object PangoTabArray_listautoptr: 
  given _tag: Tag[PangoTabArray_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): PangoTabArray_listautoptr = o
  extension (v: PangoTabArray_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type PangoTabArray_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object PangoTabArray_queueautoptr: 
  given _tag: Tag[PangoTabArray_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): PangoTabArray_queueautoptr = o
  extension (v: PangoTabArray_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type PangoTabArray_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object PangoTabArray_slistautoptr: 
  given _tag: Tag[PangoTabArray_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): PangoTabArray_slistautoptr = o
  extension (v: PangoTabArray_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

type uint32_t = scala.scalanative.unsigned.UInt
object uint32_t: 
  val _tag: Tag[uint32_t] = summon[Tag[scala.scalanative.unsigned.UInt]]
  inline def apply(inline o: scala.scalanative.unsigned.UInt): uint32_t = o
  extension (v: uint32_t)
    inline def value: scala.scalanative.unsigned.UInt = v