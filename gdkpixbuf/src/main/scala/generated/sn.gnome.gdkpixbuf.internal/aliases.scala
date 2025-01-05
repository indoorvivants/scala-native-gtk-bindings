package sn.gnome.gdkpixbuf.internal

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkPixbufAnimationIter_autoptr = Ptr[GdkPixbufAnimationIter]
object GdkPixbufAnimationIter_autoptr: 
  given _tag: Tag[GdkPixbufAnimationIter_autoptr] = Tag.Ptr[GdkPixbufAnimationIter](GdkPixbufAnimationIter._tag)
  inline def apply(inline o: Ptr[GdkPixbufAnimationIter]): GdkPixbufAnimationIter_autoptr = o
  extension (v: GdkPixbufAnimationIter_autoptr)
    inline def value: Ptr[GdkPixbufAnimationIter] = v

opaque type GdkPixbufAnimationIter_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GdkPixbufAnimationIter_listautoptr: 
  given _tag: Tag[GdkPixbufAnimationIter_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GdkPixbufAnimationIter_listautoptr = o
  extension (v: GdkPixbufAnimationIter_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GdkPixbufAnimationIter_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GdkPixbufAnimationIter_queueautoptr: 
  given _tag: Tag[GdkPixbufAnimationIter_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GdkPixbufAnimationIter_queueautoptr = o
  extension (v: GdkPixbufAnimationIter_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GdkPixbufAnimationIter_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GdkPixbufAnimationIter_slistautoptr: 
  given _tag: Tag[GdkPixbufAnimationIter_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GdkPixbufAnimationIter_slistautoptr = o
  extension (v: GdkPixbufAnimationIter_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GdkPixbufAnimation_autoptr = Ptr[GdkPixbufAnimation]
object GdkPixbufAnimation_autoptr: 
  given _tag: Tag[GdkPixbufAnimation_autoptr] = Tag.Ptr[GdkPixbufAnimation](GdkPixbufAnimation._tag)
  inline def apply(inline o: Ptr[GdkPixbufAnimation]): GdkPixbufAnimation_autoptr = o
  extension (v: GdkPixbufAnimation_autoptr)
    inline def value: Ptr[GdkPixbufAnimation] = v

opaque type GdkPixbufAnimation_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GdkPixbufAnimation_listautoptr: 
  given _tag: Tag[GdkPixbufAnimation_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GdkPixbufAnimation_listautoptr = o
  extension (v: GdkPixbufAnimation_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GdkPixbufAnimation_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GdkPixbufAnimation_queueautoptr: 
  given _tag: Tag[GdkPixbufAnimation_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GdkPixbufAnimation_queueautoptr = o
  extension (v: GdkPixbufAnimation_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GdkPixbufAnimation_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GdkPixbufAnimation_slistautoptr: 
  given _tag: Tag[GdkPixbufAnimation_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GdkPixbufAnimation_slistautoptr = o
  extension (v: GdkPixbufAnimation_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GdkPixbufDestroyNotify: : (array) (element-type guint8): The pixel array of the pixbuf that is being finalized.
*/
opaque type GdkPixbufDestroyNotify = CFuncPtr2[Ptr[_root_.sn.gnome.glib.internal.guchar], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GdkPixbufDestroyNotify: 
  given _tag: Tag[GdkPixbufDestroyNotify] = Tag.materializeCFuncPtr2[Ptr[_root_.sn.gnome.glib.internal.guchar], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GdkPixbufDestroyNotify = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[_root_.sn.gnome.glib.internal.guchar], _root_.sn.gnome.glib.internal.gpointer, Unit]): GdkPixbufDestroyNotify = o
  extension (v: GdkPixbufDestroyNotify)
    inline def value: CFuncPtr2[Ptr[_root_.sn.gnome.glib.internal.guchar], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GdkPixbufLoader_autoptr = Ptr[GdkPixbufLoader]
object GdkPixbufLoader_autoptr: 
  given _tag: Tag[GdkPixbufLoader_autoptr] = Tag.Ptr[GdkPixbufLoader](GdkPixbufLoader._tag)
  inline def apply(inline o: Ptr[GdkPixbufLoader]): GdkPixbufLoader_autoptr = o
  extension (v: GdkPixbufLoader_autoptr)
    inline def value: Ptr[GdkPixbufLoader] = v

opaque type GdkPixbufLoader_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GdkPixbufLoader_listautoptr: 
  given _tag: Tag[GdkPixbufLoader_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GdkPixbufLoader_listautoptr = o
  extension (v: GdkPixbufLoader_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GdkPixbufLoader_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GdkPixbufLoader_queueautoptr: 
  given _tag: Tag[GdkPixbufLoader_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GdkPixbufLoader_queueautoptr = o
  extension (v: GdkPixbufLoader_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GdkPixbufLoader_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GdkPixbufLoader_slistautoptr: 
  given _tag: Tag[GdkPixbufLoader_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GdkPixbufLoader_slistautoptr = o
  extension (v: GdkPixbufLoader_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GdkPixbufSaveFunc:
*/
opaque type GdkPixbufSaveFunc = CFuncPtr4[Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GdkPixbufSaveFunc: 
  given _tag: Tag[GdkPixbufSaveFunc] = Tag.materializeCFuncPtr4[Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GdkPixbufSaveFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GdkPixbufSaveFunc = o
  extension (v: GdkPixbufSaveFunc)
    inline def value: CFuncPtr4[Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GdkPixbufSimpleAnim_autoptr = Ptr[GdkPixbufSimpleAnim]
object GdkPixbufSimpleAnim_autoptr: 
  given _tag: Tag[GdkPixbufSimpleAnim_autoptr] = Tag.Ptr[GdkPixbufSimpleAnim](GdkPixbufSimpleAnim._tag)
  inline def apply(inline o: Ptr[GdkPixbufSimpleAnim]): GdkPixbufSimpleAnim_autoptr = o
  extension (v: GdkPixbufSimpleAnim_autoptr)
    inline def value: Ptr[GdkPixbufSimpleAnim] = v

opaque type GdkPixbufSimpleAnim_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GdkPixbufSimpleAnim_listautoptr: 
  given _tag: Tag[GdkPixbufSimpleAnim_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GdkPixbufSimpleAnim_listautoptr = o
  extension (v: GdkPixbufSimpleAnim_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GdkPixbufSimpleAnim_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GdkPixbufSimpleAnim_queueautoptr: 
  given _tag: Tag[GdkPixbufSimpleAnim_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GdkPixbufSimpleAnim_queueautoptr = o
  extension (v: GdkPixbufSimpleAnim_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GdkPixbufSimpleAnim_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GdkPixbufSimpleAnim_slistautoptr: 
  given _tag: Tag[GdkPixbufSimpleAnim_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GdkPixbufSimpleAnim_slistautoptr = o
  extension (v: GdkPixbufSimpleAnim_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GdkPixbuf_autoptr = Ptr[GdkPixbuf]
object GdkPixbuf_autoptr: 
  given _tag: Tag[GdkPixbuf_autoptr] = Tag.Ptr[GdkPixbuf](GdkPixbuf._tag)
  inline def apply(inline o: Ptr[GdkPixbuf]): GdkPixbuf_autoptr = o
  extension (v: GdkPixbuf_autoptr)
    inline def value: Ptr[GdkPixbuf] = v

opaque type GdkPixbuf_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GdkPixbuf_listautoptr: 
  given _tag: Tag[GdkPixbuf_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GdkPixbuf_listautoptr = o
  extension (v: GdkPixbuf_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GdkPixbuf_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GdkPixbuf_queueautoptr: 
  given _tag: Tag[GdkPixbuf_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GdkPixbuf_queueautoptr = o
  extension (v: GdkPixbuf_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GdkPixbuf_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GdkPixbuf_slistautoptr: 
  given _tag: Tag[GdkPixbuf_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GdkPixbuf_slistautoptr = o
  extension (v: GdkPixbuf_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v