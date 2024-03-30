package gtk
package aliases

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

import _root_.gtk.enumerations.*
import _root_.gtk.aliases.*
import _root_.gtk.structs.*

type FILE = libc.stdio.FILE
object FILE: 
  val _tag: Tag[FILE] = summon[Tag[libc.stdio.FILE]]
  inline def apply(inline o: libc.stdio.FILE): FILE = o
  extension (v: FILE)
    inline def value: libc.stdio.FILE = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkAppLaunchContext_autoptr = Ptr[GdkAppLaunchContext]
object GdkAppLaunchContext_autoptr: 
  given _tag: Tag[GdkAppLaunchContext_autoptr] = Tag.Ptr[GdkAppLaunchContext](GdkAppLaunchContext._tag)
  inline def apply(inline o: Ptr[GdkAppLaunchContext]): GdkAppLaunchContext_autoptr = o
  extension (v: GdkAppLaunchContext_autoptr)
    inline def value: Ptr[GdkAppLaunchContext] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkAppLaunchContext_listautoptr = Ptr[_root_.glib.all.GList]
object GdkAppLaunchContext_listautoptr: 
  given _tag: Tag[GdkAppLaunchContext_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GdkAppLaunchContext_listautoptr = o
  extension (v: GdkAppLaunchContext_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkAppLaunchContext_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GdkAppLaunchContext_queueautoptr: 
  given _tag: Tag[GdkAppLaunchContext_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GdkAppLaunchContext_queueautoptr = o
  extension (v: GdkAppLaunchContext_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkAppLaunchContext_slistautoptr = Ptr[_root_.glib.all.GSList]
object GdkAppLaunchContext_slistautoptr: 
  given _tag: Tag[GdkAppLaunchContext_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GdkAppLaunchContext_slistautoptr = o
  extension (v: GdkAppLaunchContext_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkClipboard_autoptr = Ptr[GdkClipboard]
object GdkClipboard_autoptr: 
  given _tag: Tag[GdkClipboard_autoptr] = Tag.Ptr[GdkClipboard](GdkClipboard._tag)
  inline def apply(inline o: Ptr[GdkClipboard]): GdkClipboard_autoptr = o
  extension (v: GdkClipboard_autoptr)
    inline def value: Ptr[GdkClipboard] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkClipboard_listautoptr = Ptr[_root_.glib.all.GList]
object GdkClipboard_listautoptr: 
  given _tag: Tag[GdkClipboard_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GdkClipboard_listautoptr = o
  extension (v: GdkClipboard_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkClipboard_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GdkClipboard_queueautoptr: 
  given _tag: Tag[GdkClipboard_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GdkClipboard_queueautoptr = o
  extension (v: GdkClipboard_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkClipboard_slistautoptr = Ptr[_root_.glib.all.GSList]
object GdkClipboard_slistautoptr: 
  given _tag: Tag[GdkClipboard_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GdkClipboard_slistautoptr = o
  extension (v: GdkClipboard_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GdkContentDeserializeFunc: : a `GdkContentDeserializer`

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkcontentdeserializer.h
*/
opaque type GdkContentDeserializeFunc = CFuncPtr1[Ptr[GdkContentDeserializer], Unit]
object GdkContentDeserializeFunc: 
  given _tag: Tag[GdkContentDeserializeFunc] = Tag.materializeCFuncPtr1[Ptr[GdkContentDeserializer], Unit]
  inline def apply(inline o: CFuncPtr1[Ptr[GdkContentDeserializer], Unit]): GdkContentDeserializeFunc = o
  extension (v: GdkContentDeserializeFunc)
    inline def value: CFuncPtr1[Ptr[GdkContentDeserializer], Unit] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkContentFormats_autoptr = Ptr[GdkContentFormats]
object GdkContentFormats_autoptr: 
  given _tag: Tag[GdkContentFormats_autoptr] = Tag.Ptr[GdkContentFormats](GdkContentFormats._tag)
  inline def apply(inline o: Ptr[GdkContentFormats]): GdkContentFormats_autoptr = o
  extension (v: GdkContentFormats_autoptr)
    inline def value: Ptr[GdkContentFormats] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkContentFormats_listautoptr = Ptr[_root_.glib.all.GList]
object GdkContentFormats_listautoptr: 
  given _tag: Tag[GdkContentFormats_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GdkContentFormats_listautoptr = o
  extension (v: GdkContentFormats_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkContentFormats_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GdkContentFormats_queueautoptr: 
  given _tag: Tag[GdkContentFormats_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GdkContentFormats_queueautoptr = o
  extension (v: GdkContentFormats_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkContentFormats_slistautoptr = Ptr[_root_.glib.all.GSList]
object GdkContentFormats_slistautoptr: 
  given _tag: Tag[GdkContentFormats_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GdkContentFormats_slistautoptr = o
  extension (v: GdkContentFormats_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkContentProvider_autoptr = Ptr[GdkContentProvider]
object GdkContentProvider_autoptr: 
  given _tag: Tag[GdkContentProvider_autoptr] = Tag.Ptr[GdkContentProvider](GdkContentProvider._tag)
  inline def apply(inline o: Ptr[GdkContentProvider]): GdkContentProvider_autoptr = o
  extension (v: GdkContentProvider_autoptr)
    inline def value: Ptr[GdkContentProvider] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkContentProvider_listautoptr = Ptr[_root_.glib.all.GList]
object GdkContentProvider_listautoptr: 
  given _tag: Tag[GdkContentProvider_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GdkContentProvider_listautoptr = o
  extension (v: GdkContentProvider_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkContentProvider_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GdkContentProvider_queueautoptr: 
  given _tag: Tag[GdkContentProvider_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GdkContentProvider_queueautoptr = o
  extension (v: GdkContentProvider_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkContentProvider_slistautoptr = Ptr[_root_.glib.all.GSList]
object GdkContentProvider_slistautoptr: 
  given _tag: Tag[GdkContentProvider_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GdkContentProvider_slistautoptr = o
  extension (v: GdkContentProvider_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GdkContentSerializeFunc: : a `GdkContentSerializer`

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkcontentserializer.h
*/
opaque type GdkContentSerializeFunc = CFuncPtr1[Ptr[GdkContentSerializer], Unit]
object GdkContentSerializeFunc: 
  given _tag: Tag[GdkContentSerializeFunc] = Tag.materializeCFuncPtr1[Ptr[GdkContentSerializer], Unit]
  inline def apply(inline o: CFuncPtr1[Ptr[GdkContentSerializer], Unit]): GdkContentSerializeFunc = o
  extension (v: GdkContentSerializeFunc)
    inline def value: CFuncPtr1[Ptr[GdkContentSerializer], Unit] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkCursor_autoptr = Ptr[GdkCursor]
object GdkCursor_autoptr: 
  given _tag: Tag[GdkCursor_autoptr] = Tag.Ptr[GdkCursor](GdkCursor._tag)
  inline def apply(inline o: Ptr[GdkCursor]): GdkCursor_autoptr = o
  extension (v: GdkCursor_autoptr)
    inline def value: Ptr[GdkCursor] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkCursor_listautoptr = Ptr[_root_.glib.all.GList]
object GdkCursor_listautoptr: 
  given _tag: Tag[GdkCursor_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GdkCursor_listautoptr = o
  extension (v: GdkCursor_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkCursor_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GdkCursor_queueautoptr: 
  given _tag: Tag[GdkCursor_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GdkCursor_queueautoptr = o
  extension (v: GdkCursor_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkCursor_slistautoptr = Ptr[_root_.glib.all.GSList]
object GdkCursor_slistautoptr: 
  given _tag: Tag[GdkCursor_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GdkCursor_slistautoptr = o
  extension (v: GdkCursor_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkDevice_autoptr = Ptr[GdkDevice]
object GdkDevice_autoptr: 
  given _tag: Tag[GdkDevice_autoptr] = Tag.Ptr[GdkDevice](GdkDevice._tag)
  inline def apply(inline o: Ptr[GdkDevice]): GdkDevice_autoptr = o
  extension (v: GdkDevice_autoptr)
    inline def value: Ptr[GdkDevice] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkDevice_listautoptr = Ptr[_root_.glib.all.GList]
object GdkDevice_listautoptr: 
  given _tag: Tag[GdkDevice_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GdkDevice_listautoptr = o
  extension (v: GdkDevice_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkDevice_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GdkDevice_queueautoptr: 
  given _tag: Tag[GdkDevice_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GdkDevice_queueautoptr = o
  extension (v: GdkDevice_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkDevice_slistautoptr = Ptr[_root_.glib.all.GSList]
object GdkDevice_slistautoptr: 
  given _tag: Tag[GdkDevice_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GdkDevice_slistautoptr = o
  extension (v: GdkDevice_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkDisplayManager_autoptr = Ptr[GdkDisplayManager]
object GdkDisplayManager_autoptr: 
  given _tag: Tag[GdkDisplayManager_autoptr] = Tag.Ptr[GdkDisplayManager](GdkDisplayManager._tag)
  inline def apply(inline o: Ptr[GdkDisplayManager]): GdkDisplayManager_autoptr = o
  extension (v: GdkDisplayManager_autoptr)
    inline def value: Ptr[GdkDisplayManager] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkDisplayManager_listautoptr = Ptr[_root_.glib.all.GList]
object GdkDisplayManager_listautoptr: 
  given _tag: Tag[GdkDisplayManager_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GdkDisplayManager_listautoptr = o
  extension (v: GdkDisplayManager_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkDisplayManager_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GdkDisplayManager_queueautoptr: 
  given _tag: Tag[GdkDisplayManager_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GdkDisplayManager_queueautoptr = o
  extension (v: GdkDisplayManager_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkDisplayManager_slistautoptr = Ptr[_root_.glib.all.GSList]
object GdkDisplayManager_slistautoptr: 
  given _tag: Tag[GdkDisplayManager_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GdkDisplayManager_slistautoptr = o
  extension (v: GdkDisplayManager_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkDisplay_autoptr = Ptr[GdkDisplay]
object GdkDisplay_autoptr: 
  given _tag: Tag[GdkDisplay_autoptr] = Tag.Ptr[GdkDisplay](GdkDisplay._tag)
  inline def apply(inline o: Ptr[GdkDisplay]): GdkDisplay_autoptr = o
  extension (v: GdkDisplay_autoptr)
    inline def value: Ptr[GdkDisplay] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkDisplay_listautoptr = Ptr[_root_.glib.all.GList]
object GdkDisplay_listautoptr: 
  given _tag: Tag[GdkDisplay_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GdkDisplay_listautoptr = o
  extension (v: GdkDisplay_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkDisplay_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GdkDisplay_queueautoptr: 
  given _tag: Tag[GdkDisplay_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GdkDisplay_queueautoptr = o
  extension (v: GdkDisplay_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkDisplay_slistautoptr = Ptr[_root_.glib.all.GSList]
object GdkDisplay_slistautoptr: 
  given _tag: Tag[GdkDisplay_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GdkDisplay_slistautoptr = o
  extension (v: GdkDisplay_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkdragsurface.h
*/
opaque type GdkDragSurface_autoptr = Ptr[GdkDragSurface]
object GdkDragSurface_autoptr: 
  given _tag: Tag[GdkDragSurface_autoptr] = Tag.Ptr[GdkDragSurface](GdkDragSurface._tag)
  inline def apply(inline o: Ptr[GdkDragSurface]): GdkDragSurface_autoptr = o
  extension (v: GdkDragSurface_autoptr)
    inline def value: Ptr[GdkDragSurface] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkdragsurface.h
*/
opaque type GdkDragSurface_listautoptr = Ptr[_root_.glib.all.GList]
object GdkDragSurface_listautoptr: 
  given _tag: Tag[GdkDragSurface_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GdkDragSurface_listautoptr = o
  extension (v: GdkDragSurface_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkdragsurface.h
*/
opaque type GdkDragSurface_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GdkDragSurface_queueautoptr: 
  given _tag: Tag[GdkDragSurface_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GdkDragSurface_queueautoptr = o
  extension (v: GdkDragSurface_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkdragsurface.h
*/
opaque type GdkDragSurface_slistautoptr = Ptr[_root_.glib.all.GSList]
object GdkDragSurface_slistautoptr: 
  given _tag: Tag[GdkDragSurface_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GdkDragSurface_slistautoptr = o
  extension (v: GdkDragSurface_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkDrag_autoptr = Ptr[GdkDrag]
object GdkDrag_autoptr: 
  given _tag: Tag[GdkDrag_autoptr] = Tag.Ptr[GdkDrag](GdkDrag._tag)
  inline def apply(inline o: Ptr[GdkDrag]): GdkDrag_autoptr = o
  extension (v: GdkDrag_autoptr)
    inline def value: Ptr[GdkDrag] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkDrag_listautoptr = Ptr[_root_.glib.all.GList]
object GdkDrag_listautoptr: 
  given _tag: Tag[GdkDrag_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GdkDrag_listautoptr = o
  extension (v: GdkDrag_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkDrag_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GdkDrag_queueautoptr: 
  given _tag: Tag[GdkDrag_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GdkDrag_queueautoptr = o
  extension (v: GdkDrag_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkDrag_slistautoptr = Ptr[_root_.glib.all.GSList]
object GdkDrag_slistautoptr: 
  given _tag: Tag[GdkDrag_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GdkDrag_slistautoptr = o
  extension (v: GdkDrag_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkDrawContext_autoptr = Ptr[GdkDrawContext]
object GdkDrawContext_autoptr: 
  given _tag: Tag[GdkDrawContext_autoptr] = Tag.Ptr[GdkDrawContext](GdkDrawContext._tag)
  inline def apply(inline o: Ptr[GdkDrawContext]): GdkDrawContext_autoptr = o
  extension (v: GdkDrawContext_autoptr)
    inline def value: Ptr[GdkDrawContext] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkDrawContext_listautoptr = Ptr[_root_.glib.all.GList]
object GdkDrawContext_listautoptr: 
  given _tag: Tag[GdkDrawContext_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GdkDrawContext_listautoptr = o
  extension (v: GdkDrawContext_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkDrawContext_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GdkDrawContext_queueautoptr: 
  given _tag: Tag[GdkDrawContext_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GdkDrawContext_queueautoptr = o
  extension (v: GdkDrawContext_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkDrawContext_slistautoptr = Ptr[_root_.glib.all.GSList]
object GdkDrawContext_slistautoptr: 
  given _tag: Tag[GdkDrawContext_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GdkDrawContext_slistautoptr = o
  extension (v: GdkDrawContext_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkdrop.h
*/
opaque type GdkDrop_autoptr = Ptr[GdkDrop]
object GdkDrop_autoptr: 
  given _tag: Tag[GdkDrop_autoptr] = Tag.Ptr[GdkDrop](GdkDrop._tag)
  inline def apply(inline o: Ptr[GdkDrop]): GdkDrop_autoptr = o
  extension (v: GdkDrop_autoptr)
    inline def value: Ptr[GdkDrop] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkdrop.h
*/
opaque type GdkDrop_listautoptr = Ptr[_root_.glib.all.GList]
object GdkDrop_listautoptr: 
  given _tag: Tag[GdkDrop_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GdkDrop_listautoptr = o
  extension (v: GdkDrop_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkdrop.h
*/
opaque type GdkDrop_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GdkDrop_queueautoptr: 
  given _tag: Tag[GdkDrop_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GdkDrop_queueautoptr = o
  extension (v: GdkDrop_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkdrop.h
*/
opaque type GdkDrop_slistautoptr = Ptr[_root_.glib.all.GSList]
object GdkDrop_slistautoptr: 
  given _tag: Tag[GdkDrop_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GdkDrop_slistautoptr = o
  extension (v: GdkDrop_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkEvent_autoptr = Ptr[GdkEvent]
object GdkEvent_autoptr: 
  given _tag: Tag[GdkEvent_autoptr] = Tag.Ptr[GdkEvent](GdkEvent._tag)
  inline def apply(inline o: Ptr[GdkEvent]): GdkEvent_autoptr = o
  extension (v: GdkEvent_autoptr)
    inline def value: Ptr[GdkEvent] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkEvent_listautoptr = Ptr[_root_.glib.all.GList]
object GdkEvent_listautoptr: 
  given _tag: Tag[GdkEvent_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GdkEvent_listautoptr = o
  extension (v: GdkEvent_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkEvent_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GdkEvent_queueautoptr: 
  given _tag: Tag[GdkEvent_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GdkEvent_queueautoptr = o
  extension (v: GdkEvent_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkEvent_slistautoptr = Ptr[_root_.glib.all.GSList]
object GdkEvent_slistautoptr: 
  given _tag: Tag[GdkEvent_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GdkEvent_slistautoptr = o
  extension (v: GdkEvent_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkFrameClock_autoptr = Ptr[GdkFrameClock]
object GdkFrameClock_autoptr: 
  given _tag: Tag[GdkFrameClock_autoptr] = Tag.Ptr[GdkFrameClock](GdkFrameClock._tag)
  inline def apply(inline o: Ptr[GdkFrameClock]): GdkFrameClock_autoptr = o
  extension (v: GdkFrameClock_autoptr)
    inline def value: Ptr[GdkFrameClock] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkFrameClock_listautoptr = Ptr[_root_.glib.all.GList]
object GdkFrameClock_listautoptr: 
  given _tag: Tag[GdkFrameClock_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GdkFrameClock_listautoptr = o
  extension (v: GdkFrameClock_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkFrameClock_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GdkFrameClock_queueautoptr: 
  given _tag: Tag[GdkFrameClock_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GdkFrameClock_queueautoptr = o
  extension (v: GdkFrameClock_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkFrameClock_slistautoptr = Ptr[_root_.glib.all.GSList]
object GdkFrameClock_slistautoptr: 
  given _tag: Tag[GdkFrameClock_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GdkFrameClock_slistautoptr = o
  extension (v: GdkFrameClock_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkFrameTimings_autoptr = Ptr[GdkFrameTimings]
object GdkFrameTimings_autoptr: 
  given _tag: Tag[GdkFrameTimings_autoptr] = Tag.Ptr[GdkFrameTimings](GdkFrameTimings._tag)
  inline def apply(inline o: Ptr[GdkFrameTimings]): GdkFrameTimings_autoptr = o
  extension (v: GdkFrameTimings_autoptr)
    inline def value: Ptr[GdkFrameTimings] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkFrameTimings_listautoptr = Ptr[_root_.glib.all.GList]
object GdkFrameTimings_listautoptr: 
  given _tag: Tag[GdkFrameTimings_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GdkFrameTimings_listautoptr = o
  extension (v: GdkFrameTimings_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkFrameTimings_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GdkFrameTimings_queueautoptr: 
  given _tag: Tag[GdkFrameTimings_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GdkFrameTimings_queueautoptr = o
  extension (v: GdkFrameTimings_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkFrameTimings_slistautoptr = Ptr[_root_.glib.all.GSList]
object GdkFrameTimings_slistautoptr: 
  given _tag: Tag[GdkFrameTimings_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GdkFrameTimings_slistautoptr = o
  extension (v: GdkFrameTimings_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkGLContext_autoptr = Ptr[GdkGLContext]
object GdkGLContext_autoptr: 
  given _tag: Tag[GdkGLContext_autoptr] = Tag.Ptr[GdkGLContext](GdkGLContext._tag)
  inline def apply(inline o: Ptr[GdkGLContext]): GdkGLContext_autoptr = o
  extension (v: GdkGLContext_autoptr)
    inline def value: Ptr[GdkGLContext] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkGLContext_listautoptr = Ptr[_root_.glib.all.GList]
object GdkGLContext_listautoptr: 
  given _tag: Tag[GdkGLContext_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GdkGLContext_listautoptr = o
  extension (v: GdkGLContext_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkGLContext_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GdkGLContext_queueautoptr: 
  given _tag: Tag[GdkGLContext_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GdkGLContext_queueautoptr = o
  extension (v: GdkGLContext_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkGLContext_slistautoptr = Ptr[_root_.glib.all.GSList]
object GdkGLContext_slistautoptr: 
  given _tag: Tag[GdkGLContext_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GdkGLContext_slistautoptr = o
  extension (v: GdkGLContext_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkgltexture.h
*/
opaque type GdkGLTexture_autoptr = Ptr[GdkGLTexture]
object GdkGLTexture_autoptr: 
  given _tag: Tag[GdkGLTexture_autoptr] = Tag.Ptr[GdkGLTexture](GdkGLTexture._tag)
  inline def apply(inline o: Ptr[GdkGLTexture]): GdkGLTexture_autoptr = o
  extension (v: GdkGLTexture_autoptr)
    inline def value: Ptr[GdkGLTexture] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkgltexture.h
*/
opaque type GdkGLTexture_listautoptr = Ptr[_root_.glib.all.GList]
object GdkGLTexture_listautoptr: 
  given _tag: Tag[GdkGLTexture_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GdkGLTexture_listautoptr = o
  extension (v: GdkGLTexture_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkgltexture.h
*/
opaque type GdkGLTexture_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GdkGLTexture_queueautoptr: 
  given _tag: Tag[GdkGLTexture_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GdkGLTexture_queueautoptr = o
  extension (v: GdkGLTexture_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkgltexture.h
*/
opaque type GdkGLTexture_slistautoptr = Ptr[_root_.glib.all.GSList]
object GdkGLTexture_slistautoptr: 
  given _tag: Tag[GdkGLTexture_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GdkGLTexture_slistautoptr = o
  extension (v: GdkGLTexture_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkmemorytexture.h
*/
opaque type GdkMemoryTexture_autoptr = Ptr[GdkMemoryTexture]
object GdkMemoryTexture_autoptr: 
  given _tag: Tag[GdkMemoryTexture_autoptr] = Tag.Ptr[GdkMemoryTexture](GdkMemoryTexture._tag)
  inline def apply(inline o: Ptr[GdkMemoryTexture]): GdkMemoryTexture_autoptr = o
  extension (v: GdkMemoryTexture_autoptr)
    inline def value: Ptr[GdkMemoryTexture] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkmemorytexture.h
*/
opaque type GdkMemoryTexture_listautoptr = Ptr[_root_.glib.all.GList]
object GdkMemoryTexture_listautoptr: 
  given _tag: Tag[GdkMemoryTexture_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GdkMemoryTexture_listautoptr = o
  extension (v: GdkMemoryTexture_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkmemorytexture.h
*/
opaque type GdkMemoryTexture_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GdkMemoryTexture_queueautoptr: 
  given _tag: Tag[GdkMemoryTexture_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GdkMemoryTexture_queueautoptr = o
  extension (v: GdkMemoryTexture_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkmemorytexture.h
*/
opaque type GdkMemoryTexture_slistautoptr = Ptr[_root_.glib.all.GSList]
object GdkMemoryTexture_slistautoptr: 
  given _tag: Tag[GdkMemoryTexture_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GdkMemoryTexture_slistautoptr = o
  extension (v: GdkMemoryTexture_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkMonitor_autoptr = Ptr[GdkMonitor]
object GdkMonitor_autoptr: 
  given _tag: Tag[GdkMonitor_autoptr] = Tag.Ptr[GdkMonitor](GdkMonitor._tag)
  inline def apply(inline o: Ptr[GdkMonitor]): GdkMonitor_autoptr = o
  extension (v: GdkMonitor_autoptr)
    inline def value: Ptr[GdkMonitor] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkMonitor_listautoptr = Ptr[_root_.glib.all.GList]
object GdkMonitor_listautoptr: 
  given _tag: Tag[GdkMonitor_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GdkMonitor_listautoptr = o
  extension (v: GdkMonitor_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkMonitor_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GdkMonitor_queueautoptr: 
  given _tag: Tag[GdkMonitor_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GdkMonitor_queueautoptr = o
  extension (v: GdkMonitor_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkMonitor_slistautoptr = Ptr[_root_.glib.all.GSList]
object GdkMonitor_slistautoptr: 
  given _tag: Tag[GdkMonitor_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GdkMonitor_slistautoptr = o
  extension (v: GdkMonitor_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkpaintable.h
*/
opaque type GdkPaintable_autoptr = Ptr[GdkPaintable]
object GdkPaintable_autoptr: 
  given _tag: Tag[GdkPaintable_autoptr] = Tag.Ptr[GdkPaintable](GdkPaintable._tag)
  inline def apply(inline o: Ptr[GdkPaintable]): GdkPaintable_autoptr = o
  extension (v: GdkPaintable_autoptr)
    inline def value: Ptr[GdkPaintable] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkpaintable.h
*/
opaque type GdkPaintable_listautoptr = Ptr[_root_.glib.all.GList]
object GdkPaintable_listautoptr: 
  given _tag: Tag[GdkPaintable_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GdkPaintable_listautoptr = o
  extension (v: GdkPaintable_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkpaintable.h
*/
opaque type GdkPaintable_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GdkPaintable_queueautoptr: 
  given _tag: Tag[GdkPaintable_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GdkPaintable_queueautoptr = o
  extension (v: GdkPaintable_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkpaintable.h
*/
opaque type GdkPaintable_slistautoptr = Ptr[_root_.glib.all.GSList]
object GdkPaintable_slistautoptr: 
  given _tag: Tag[GdkPaintable_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GdkPaintable_slistautoptr = o
  extension (v: GdkPaintable_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkPopupLayout_autoptr = Ptr[GdkPopupLayout]
object GdkPopupLayout_autoptr: 
  given _tag: Tag[GdkPopupLayout_autoptr] = Tag.Ptr[GdkPopupLayout](GdkPopupLayout._tag)
  inline def apply(inline o: Ptr[GdkPopupLayout]): GdkPopupLayout_autoptr = o
  extension (v: GdkPopupLayout_autoptr)
    inline def value: Ptr[GdkPopupLayout] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkPopupLayout_listautoptr = Ptr[_root_.glib.all.GList]
object GdkPopupLayout_listautoptr: 
  given _tag: Tag[GdkPopupLayout_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GdkPopupLayout_listautoptr = o
  extension (v: GdkPopupLayout_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkPopupLayout_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GdkPopupLayout_queueautoptr: 
  given _tag: Tag[GdkPopupLayout_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GdkPopupLayout_queueautoptr = o
  extension (v: GdkPopupLayout_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkPopupLayout_slistautoptr = Ptr[_root_.glib.all.GSList]
object GdkPopupLayout_slistautoptr: 
  given _tag: Tag[GdkPopupLayout_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GdkPopupLayout_slistautoptr = o
  extension (v: GdkPopupLayout_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkpopup.h
*/
opaque type GdkPopup_autoptr = Ptr[GdkPopup]
object GdkPopup_autoptr: 
  given _tag: Tag[GdkPopup_autoptr] = Tag.Ptr[GdkPopup](GdkPopup._tag)
  inline def apply(inline o: Ptr[GdkPopup]): GdkPopup_autoptr = o
  extension (v: GdkPopup_autoptr)
    inline def value: Ptr[GdkPopup] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkpopup.h
*/
opaque type GdkPopup_listautoptr = Ptr[_root_.glib.all.GList]
object GdkPopup_listautoptr: 
  given _tag: Tag[GdkPopup_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GdkPopup_listautoptr = o
  extension (v: GdkPopup_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkpopup.h
*/
opaque type GdkPopup_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GdkPopup_queueautoptr: 
  given _tag: Tag[GdkPopup_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GdkPopup_queueautoptr = o
  extension (v: GdkPopup_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkpopup.h
*/
opaque type GdkPopup_slistautoptr = Ptr[_root_.glib.all.GSList]
object GdkPopup_slistautoptr: 
  given _tag: Tag[GdkPopup_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GdkPopup_slistautoptr = o
  extension (v: GdkPopup_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkRGBA_autoptr = Ptr[GdkRGBA]
object GdkRGBA_autoptr: 
  given _tag: Tag[GdkRGBA_autoptr] = Tag.Ptr[GdkRGBA](GdkRGBA._tag)
  inline def apply(inline o: Ptr[GdkRGBA]): GdkRGBA_autoptr = o
  extension (v: GdkRGBA_autoptr)
    inline def value: Ptr[GdkRGBA] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkRGBA_listautoptr = Ptr[_root_.glib.all.GList]
object GdkRGBA_listautoptr: 
  given _tag: Tag[GdkRGBA_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GdkRGBA_listautoptr = o
  extension (v: GdkRGBA_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkRGBA_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GdkRGBA_queueautoptr: 
  given _tag: Tag[GdkRGBA_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GdkRGBA_queueautoptr = o
  extension (v: GdkRGBA_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkRGBA_slistautoptr = Ptr[_root_.glib.all.GSList]
object GdkRGBA_slistautoptr: 
  given _tag: Tag[GdkRGBA_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GdkRGBA_slistautoptr = o
  extension (v: GdkRGBA_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
type GdkRectangle = _root_.cairo.all.cairo_rectangle_int_t
object GdkRectangle: 
  given _tag: Tag[GdkRectangle] = _root_.cairo.all.cairo_rectangle_int_t._tag
  inline def apply(inline o: _root_.cairo.all.cairo_rectangle_int_t): GdkRectangle = o
  extension (v: GdkRectangle)
    inline def value: _root_.cairo.all.cairo_rectangle_int_t = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkSeat_autoptr = Ptr[GdkSeat]
object GdkSeat_autoptr: 
  given _tag: Tag[GdkSeat_autoptr] = Tag.Ptr[GdkSeat](GdkSeat._tag)
  inline def apply(inline o: Ptr[GdkSeat]): GdkSeat_autoptr = o
  extension (v: GdkSeat_autoptr)
    inline def value: Ptr[GdkSeat] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkSeat_listautoptr = Ptr[_root_.glib.all.GList]
object GdkSeat_listautoptr: 
  given _tag: Tag[GdkSeat_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GdkSeat_listautoptr = o
  extension (v: GdkSeat_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkSeat_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GdkSeat_queueautoptr: 
  given _tag: Tag[GdkSeat_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GdkSeat_queueautoptr = o
  extension (v: GdkSeat_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkSeat_slistautoptr = Ptr[_root_.glib.all.GSList]
object GdkSeat_slistautoptr: 
  given _tag: Tag[GdkSeat_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GdkSeat_slistautoptr = o
  extension (v: GdkSeat_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdksnapshot.h
*/
opaque type GdkSnapshot_autoptr = Ptr[GdkSnapshot]
object GdkSnapshot_autoptr: 
  given _tag: Tag[GdkSnapshot_autoptr] = Tag.Ptr[GdkSnapshot](GdkSnapshot._tag)
  inline def apply(inline o: Ptr[GdkSnapshot]): GdkSnapshot_autoptr = o
  extension (v: GdkSnapshot_autoptr)
    inline def value: Ptr[GdkSnapshot] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdksnapshot.h
*/
opaque type GdkSnapshot_listautoptr = Ptr[_root_.glib.all.GList]
object GdkSnapshot_listautoptr: 
  given _tag: Tag[GdkSnapshot_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GdkSnapshot_listautoptr = o
  extension (v: GdkSnapshot_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdksnapshot.h
*/
opaque type GdkSnapshot_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GdkSnapshot_queueautoptr: 
  given _tag: Tag[GdkSnapshot_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GdkSnapshot_queueautoptr = o
  extension (v: GdkSnapshot_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdksnapshot.h
*/
opaque type GdkSnapshot_slistautoptr = Ptr[_root_.glib.all.GSList]
object GdkSnapshot_slistautoptr: 
  given _tag: Tag[GdkSnapshot_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GdkSnapshot_slistautoptr = o
  extension (v: GdkSnapshot_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdksurface.h
*/
opaque type GdkSurface_autoptr = Ptr[GdkSurface]
object GdkSurface_autoptr: 
  given _tag: Tag[GdkSurface_autoptr] = Tag.Ptr[GdkSurface](GdkSurface._tag)
  inline def apply(inline o: Ptr[GdkSurface]): GdkSurface_autoptr = o
  extension (v: GdkSurface_autoptr)
    inline def value: Ptr[GdkSurface] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdksurface.h
*/
opaque type GdkSurface_listautoptr = Ptr[_root_.glib.all.GList]
object GdkSurface_listautoptr: 
  given _tag: Tag[GdkSurface_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GdkSurface_listautoptr = o
  extension (v: GdkSurface_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdksurface.h
*/
opaque type GdkSurface_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GdkSurface_queueautoptr: 
  given _tag: Tag[GdkSurface_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GdkSurface_queueautoptr = o
  extension (v: GdkSurface_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdksurface.h
*/
opaque type GdkSurface_slistautoptr = Ptr[_root_.glib.all.GSList]
object GdkSurface_slistautoptr: 
  given _tag: Tag[GdkSurface_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GdkSurface_slistautoptr = o
  extension (v: GdkSurface_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktexture.h
*/
opaque type GdkTexture_autoptr = Ptr[GdkTexture]
object GdkTexture_autoptr: 
  given _tag: Tag[GdkTexture_autoptr] = Tag.Ptr[GdkTexture](GdkTexture._tag)
  inline def apply(inline o: Ptr[GdkTexture]): GdkTexture_autoptr = o
  extension (v: GdkTexture_autoptr)
    inline def value: Ptr[GdkTexture] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktexture.h
*/
opaque type GdkTexture_listautoptr = Ptr[_root_.glib.all.GList]
object GdkTexture_listautoptr: 
  given _tag: Tag[GdkTexture_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GdkTexture_listautoptr = o
  extension (v: GdkTexture_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktexture.h
*/
opaque type GdkTexture_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GdkTexture_queueautoptr: 
  given _tag: Tag[GdkTexture_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GdkTexture_queueautoptr = o
  extension (v: GdkTexture_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktexture.h
*/
opaque type GdkTexture_slistautoptr = Ptr[_root_.glib.all.GSList]
object GdkTexture_slistautoptr: 
  given _tag: Tag[GdkTexture_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GdkTexture_slistautoptr = o
  extension (v: GdkTexture_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktoplevel.h
*/
opaque type GdkToplevel_autoptr = Ptr[GdkToplevel]
object GdkToplevel_autoptr: 
  given _tag: Tag[GdkToplevel_autoptr] = Tag.Ptr[GdkToplevel](GdkToplevel._tag)
  inline def apply(inline o: Ptr[GdkToplevel]): GdkToplevel_autoptr = o
  extension (v: GdkToplevel_autoptr)
    inline def value: Ptr[GdkToplevel] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktoplevel.h
*/
opaque type GdkToplevel_listautoptr = Ptr[_root_.glib.all.GList]
object GdkToplevel_listautoptr: 
  given _tag: Tag[GdkToplevel_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GdkToplevel_listautoptr = o
  extension (v: GdkToplevel_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktoplevel.h
*/
opaque type GdkToplevel_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GdkToplevel_queueautoptr: 
  given _tag: Tag[GdkToplevel_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GdkToplevel_queueautoptr = o
  extension (v: GdkToplevel_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktoplevel.h
*/
opaque type GdkToplevel_slistautoptr = Ptr[_root_.glib.all.GSList]
object GdkToplevel_slistautoptr: 
  given _tag: Tag[GdkToplevel_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GdkToplevel_slistautoptr = o
  extension (v: GdkToplevel_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkVulkanContext_autoptr = Ptr[GdkVulkanContext]
object GdkVulkanContext_autoptr: 
  given _tag: Tag[GdkVulkanContext_autoptr] = Tag.Ptr[GdkVulkanContext](GdkVulkanContext._tag)
  inline def apply(inline o: Ptr[GdkVulkanContext]): GdkVulkanContext_autoptr = o
  extension (v: GdkVulkanContext_autoptr)
    inline def value: Ptr[GdkVulkanContext] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkVulkanContext_listautoptr = Ptr[_root_.glib.all.GList]
object GdkVulkanContext_listautoptr: 
  given _tag: Tag[GdkVulkanContext_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GdkVulkanContext_listautoptr = o
  extension (v: GdkVulkanContext_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkVulkanContext_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GdkVulkanContext_queueautoptr: 
  given _tag: Tag[GdkVulkanContext_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GdkVulkanContext_queueautoptr = o
  extension (v: GdkVulkanContext_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdk-autocleanup.h
*/
opaque type GdkVulkanContext_slistautoptr = Ptr[_root_.glib.all.GSList]
object GdkVulkanContext_slistautoptr: 
  given _tag: Tag[GdkVulkanContext_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GdkVulkanContext_slistautoptr = o
  extension (v: GdkVulkanContext_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskglshader.h
*/
opaque type GskGLShaderClass_autoptr = Ptr[GskGLShaderClass]
object GskGLShaderClass_autoptr: 
  given _tag: Tag[GskGLShaderClass_autoptr] = Tag.Ptr[GskGLShaderClass](GskGLShaderClass._tag)
  inline def apply(inline o: Ptr[GskGLShaderClass]): GskGLShaderClass_autoptr = o
  extension (v: GskGLShaderClass_autoptr)
    inline def value: Ptr[GskGLShaderClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskglshader.h
*/
opaque type GskGLShaderClass_listautoptr = Ptr[_root_.glib.all.GList]
object GskGLShaderClass_listautoptr: 
  given _tag: Tag[GskGLShaderClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GskGLShaderClass_listautoptr = o
  extension (v: GskGLShaderClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskglshader.h
*/
opaque type GskGLShaderClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GskGLShaderClass_queueautoptr: 
  given _tag: Tag[GskGLShaderClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GskGLShaderClass_queueautoptr = o
  extension (v: GskGLShaderClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskglshader.h
*/
opaque type GskGLShaderClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GskGLShaderClass_slistautoptr: 
  given _tag: Tag[GskGLShaderClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GskGLShaderClass_slistautoptr = o
  extension (v: GskGLShaderClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskglshader.h
*/
opaque type GskGLShader_autoptr = Ptr[GskGLShader]
object GskGLShader_autoptr: 
  given _tag: Tag[GskGLShader_autoptr] = Tag.Ptr[GskGLShader](GskGLShader._tag)
  inline def apply(inline o: Ptr[GskGLShader]): GskGLShader_autoptr = o
  extension (v: GskGLShader_autoptr)
    inline def value: Ptr[GskGLShader] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskglshader.h
*/
opaque type GskGLShader_listautoptr = Ptr[_root_.glib.all.GList]
object GskGLShader_listautoptr: 
  given _tag: Tag[GskGLShader_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GskGLShader_listautoptr = o
  extension (v: GskGLShader_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskglshader.h
*/
opaque type GskGLShader_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GskGLShader_queueautoptr: 
  given _tag: Tag[GskGLShader_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GskGLShader_queueautoptr = o
  extension (v: GskGLShader_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskglshader.h
*/
opaque type GskGLShader_slistautoptr = Ptr[_root_.glib.all.GSList]
object GskGLShader_slistautoptr: 
  given _tag: Tag[GskGLShader_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GskGLShader_slistautoptr = o
  extension (v: GskGLShader_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GskParseErrorFunc: : start of the error location : end of the error location : the error _data: user data

 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type GskParseErrorFunc = CFuncPtr4[Ptr[GskParseLocation], Ptr[GskParseLocation], Ptr[_root_.glib.all.GError], _root_.glib.all.gpointer, Unit]
object GskParseErrorFunc: 
  given _tag: Tag[GskParseErrorFunc] = Tag.materializeCFuncPtr4[Ptr[GskParseLocation], Ptr[GskParseLocation], Ptr[_root_.glib.all.GError], _root_.glib.all.gpointer, Unit]
  inline def apply(inline o: CFuncPtr4[Ptr[GskParseLocation], Ptr[GskParseLocation], Ptr[_root_.glib.all.GError], _root_.glib.all.gpointer, Unit]): GskParseErrorFunc = o
  extension (v: GskParseErrorFunc)
    inline def value: CFuncPtr4[Ptr[GskParseLocation], Ptr[GskParseLocation], Ptr[_root_.glib.all.GError], _root_.glib.all.gpointer, Unit] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gsk-autocleanup.h
*/
opaque type GskRenderNode_autoptr = Ptr[GskRenderNode]
object GskRenderNode_autoptr: 
  given _tag: Tag[GskRenderNode_autoptr] = Tag.Ptr[GskRenderNode](GskRenderNode._tag)
  inline def apply(inline o: Ptr[GskRenderNode]): GskRenderNode_autoptr = o
  extension (v: GskRenderNode_autoptr)
    inline def value: Ptr[GskRenderNode] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gsk-autocleanup.h
*/
opaque type GskRenderNode_listautoptr = Ptr[_root_.glib.all.GList]
object GskRenderNode_listautoptr: 
  given _tag: Tag[GskRenderNode_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GskRenderNode_listautoptr = o
  extension (v: GskRenderNode_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gsk-autocleanup.h
*/
opaque type GskRenderNode_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GskRenderNode_queueautoptr: 
  given _tag: Tag[GskRenderNode_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GskRenderNode_queueautoptr = o
  extension (v: GskRenderNode_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gsk-autocleanup.h
*/
opaque type GskRenderNode_slistautoptr = Ptr[_root_.glib.all.GSList]
object GskRenderNode_slistautoptr: 
  given _tag: Tag[GskRenderNode_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GskRenderNode_slistautoptr = o
  extension (v: GskRenderNode_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gsk-autocleanup.h
*/
opaque type GskRenderer_autoptr = Ptr[GskRenderer]
object GskRenderer_autoptr: 
  given _tag: Tag[GskRenderer_autoptr] = Tag.Ptr[GskRenderer](GskRenderer._tag)
  inline def apply(inline o: Ptr[GskRenderer]): GskRenderer_autoptr = o
  extension (v: GskRenderer_autoptr)
    inline def value: Ptr[GskRenderer] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gsk-autocleanup.h
*/
opaque type GskRenderer_listautoptr = Ptr[_root_.glib.all.GList]
object GskRenderer_listautoptr: 
  given _tag: Tag[GskRenderer_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GskRenderer_listautoptr = o
  extension (v: GskRenderer_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gsk-autocleanup.h
*/
opaque type GskRenderer_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GskRenderer_queueautoptr: 
  given _tag: Tag[GskRenderer_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GskRenderer_queueautoptr = o
  extension (v: GskRenderer_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gsk-autocleanup.h
*/
opaque type GskRenderer_slistautoptr = Ptr[_root_.glib.all.GSList]
object GskRenderer_slistautoptr: 
  given _tag: Tag[GskRenderer_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GskRenderer_slistautoptr = o
  extension (v: GskRenderer_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gsk-autocleanup.h
*/
opaque type GskTransform_autoptr = Ptr[GskTransform]
object GskTransform_autoptr: 
  given _tag: Tag[GskTransform_autoptr] = Tag.Ptr[GskTransform](GskTransform._tag)
  inline def apply(inline o: Ptr[GskTransform]): GskTransform_autoptr = o
  extension (v: GskTransform_autoptr)
    inline def value: Ptr[GskTransform] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gsk-autocleanup.h
*/
opaque type GskTransform_listautoptr = Ptr[_root_.glib.all.GList]
object GskTransform_listautoptr: 
  given _tag: Tag[GskTransform_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GskTransform_listautoptr = o
  extension (v: GskTransform_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gsk-autocleanup.h
*/
opaque type GskTransform_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GskTransform_queueautoptr: 
  given _tag: Tag[GskTransform_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GskTransform_queueautoptr = o
  extension (v: GskTransform_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gsk-autocleanup.h
*/
opaque type GskTransform_slistautoptr = Ptr[_root_.glib.all.GSList]
object GskTransform_slistautoptr: 
  given _tag: Tag[GskTransform_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GskTransform_slistautoptr = o
  extension (v: GskTransform_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkatcontext.h
*/
opaque type GtkATContextClass_autoptr = Ptr[GtkATContextClass]
object GtkATContextClass_autoptr: 
  given _tag: Tag[GtkATContextClass_autoptr] = Tag.Ptr[GtkATContextClass](GtkATContextClass._tag)
  inline def apply(inline o: Ptr[GtkATContextClass]): GtkATContextClass_autoptr = o
  extension (v: GtkATContextClass_autoptr)
    inline def value: Ptr[GtkATContextClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkatcontext.h
*/
opaque type GtkATContextClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkATContextClass_listautoptr: 
  given _tag: Tag[GtkATContextClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkATContextClass_listautoptr = o
  extension (v: GtkATContextClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkatcontext.h
*/
opaque type GtkATContextClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkATContextClass_queueautoptr: 
  given _tag: Tag[GtkATContextClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkATContextClass_queueautoptr = o
  extension (v: GtkATContextClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkatcontext.h
*/
opaque type GtkATContextClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkATContextClass_slistautoptr: 
  given _tag: Tag[GtkATContextClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkATContextClass_slistautoptr = o
  extension (v: GtkATContextClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkatcontext.h
*/
opaque type GtkATContext_autoptr = Ptr[GtkATContext]
object GtkATContext_autoptr: 
  given _tag: Tag[GtkATContext_autoptr] = Tag.Ptr[GtkATContext](GtkATContext._tag)
  inline def apply(inline o: Ptr[GtkATContext]): GtkATContext_autoptr = o
  extension (v: GtkATContext_autoptr)
    inline def value: Ptr[GtkATContext] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkatcontext.h
*/
opaque type GtkATContext_listautoptr = Ptr[_root_.glib.all.GList]
object GtkATContext_listautoptr: 
  given _tag: Tag[GtkATContext_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkATContext_listautoptr = o
  extension (v: GtkATContext_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkatcontext.h
*/
opaque type GtkATContext_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkATContext_queueautoptr: 
  given _tag: Tag[GtkATContext_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkATContext_queueautoptr = o
  extension (v: GtkATContext_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkatcontext.h
*/
opaque type GtkATContext_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkATContext_slistautoptr: 
  given _tag: Tag[GtkATContext_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkATContext_slistautoptr = o
  extension (v: GtkATContext_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkaboutdialog.h
*/
opaque type GtkAboutDialog_autoptr = Ptr[GtkAboutDialog]
object GtkAboutDialog_autoptr: 
  given _tag: Tag[GtkAboutDialog_autoptr] = Tag.Ptr[GtkAboutDialog](GtkAboutDialog._tag)
  inline def apply(inline o: Ptr[GtkAboutDialog]): GtkAboutDialog_autoptr = o
  extension (v: GtkAboutDialog_autoptr)
    inline def value: Ptr[GtkAboutDialog] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkaboutdialog.h
*/
opaque type GtkAboutDialog_listautoptr = Ptr[_root_.glib.all.GList]
object GtkAboutDialog_listautoptr: 
  given _tag: Tag[GtkAboutDialog_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkAboutDialog_listautoptr = o
  extension (v: GtkAboutDialog_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkaboutdialog.h
*/
opaque type GtkAboutDialog_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkAboutDialog_queueautoptr: 
  given _tag: Tag[GtkAboutDialog_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkAboutDialog_queueautoptr = o
  extension (v: GtkAboutDialog_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkaboutdialog.h
*/
opaque type GtkAboutDialog_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkAboutDialog_slistautoptr: 
  given _tag: Tag[GtkAboutDialog_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkAboutDialog_slistautoptr = o
  extension (v: GtkAboutDialog_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkaccessible.h
*/
opaque type GtkAccessible_autoptr = Ptr[GtkAccessible]
object GtkAccessible_autoptr: 
  given _tag: Tag[GtkAccessible_autoptr] = Tag.Ptr[GtkAccessible](GtkAccessible._tag)
  inline def apply(inline o: Ptr[GtkAccessible]): GtkAccessible_autoptr = o
  extension (v: GtkAccessible_autoptr)
    inline def value: Ptr[GtkAccessible] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkaccessible.h
*/
opaque type GtkAccessible_listautoptr = Ptr[_root_.glib.all.GList]
object GtkAccessible_listautoptr: 
  given _tag: Tag[GtkAccessible_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkAccessible_listautoptr = o
  extension (v: GtkAccessible_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkaccessible.h
*/
opaque type GtkAccessible_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkAccessible_queueautoptr: 
  given _tag: Tag[GtkAccessible_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkAccessible_queueautoptr = o
  extension (v: GtkAccessible_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkaccessible.h
*/
opaque type GtkAccessible_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkAccessible_slistautoptr: 
  given _tag: Tag[GtkAccessible_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkAccessible_slistautoptr = o
  extension (v: GtkAccessible_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkActionBar_autoptr = Ptr[GtkActionBar]
object GtkActionBar_autoptr: 
  given _tag: Tag[GtkActionBar_autoptr] = Tag.Ptr[GtkActionBar](GtkActionBar._tag)
  inline def apply(inline o: Ptr[GtkActionBar]): GtkActionBar_autoptr = o
  extension (v: GtkActionBar_autoptr)
    inline def value: Ptr[GtkActionBar] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkActionBar_listautoptr = Ptr[_root_.glib.all.GList]
object GtkActionBar_listautoptr: 
  given _tag: Tag[GtkActionBar_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkActionBar_listautoptr = o
  extension (v: GtkActionBar_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkActionBar_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkActionBar_queueautoptr: 
  given _tag: Tag[GtkActionBar_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkActionBar_queueautoptr = o
  extension (v: GtkActionBar_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkActionBar_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkActionBar_slistautoptr: 
  given _tag: Tag[GtkActionBar_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkActionBar_slistautoptr = o
  extension (v: GtkActionBar_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkActionable_autoptr = Ptr[GtkActionable]
object GtkActionable_autoptr: 
  given _tag: Tag[GtkActionable_autoptr] = Tag.Ptr[GtkActionable](GtkActionable._tag)
  inline def apply(inline o: Ptr[GtkActionable]): GtkActionable_autoptr = o
  extension (v: GtkActionable_autoptr)
    inline def value: Ptr[GtkActionable] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkActionable_listautoptr = Ptr[_root_.glib.all.GList]
object GtkActionable_listautoptr: 
  given _tag: Tag[GtkActionable_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkActionable_listautoptr = o
  extension (v: GtkActionable_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkActionable_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkActionable_queueautoptr: 
  given _tag: Tag[GtkActionable_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkActionable_queueautoptr = o
  extension (v: GtkActionable_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkActionable_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkActionable_slistautoptr: 
  given _tag: Tag[GtkActionable_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkActionable_slistautoptr = o
  extension (v: GtkActionable_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkActivateActionClass_autoptr = Ptr[GtkActivateActionClass]
object GtkActivateActionClass_autoptr: 
  given _tag: Tag[GtkActivateActionClass_autoptr] = Tag.Ptr[GtkActivateActionClass](GtkActivateActionClass._tag)
  inline def apply(inline o: Ptr[GtkActivateActionClass]): GtkActivateActionClass_autoptr = o
  extension (v: GtkActivateActionClass_autoptr)
    inline def value: Ptr[GtkActivateActionClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkActivateActionClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkActivateActionClass_listautoptr: 
  given _tag: Tag[GtkActivateActionClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkActivateActionClass_listautoptr = o
  extension (v: GtkActivateActionClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkActivateActionClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkActivateActionClass_queueautoptr: 
  given _tag: Tag[GtkActivateActionClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkActivateActionClass_queueautoptr = o
  extension (v: GtkActivateActionClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkActivateActionClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkActivateActionClass_slistautoptr: 
  given _tag: Tag[GtkActivateActionClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkActivateActionClass_slistautoptr = o
  extension (v: GtkActivateActionClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkActivateAction_autoptr = Ptr[GtkActivateAction]
object GtkActivateAction_autoptr: 
  given _tag: Tag[GtkActivateAction_autoptr] = Tag.Ptr[GtkActivateAction](GtkActivateAction._tag)
  inline def apply(inline o: Ptr[GtkActivateAction]): GtkActivateAction_autoptr = o
  extension (v: GtkActivateAction_autoptr)
    inline def value: Ptr[GtkActivateAction] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkActivateAction_listautoptr = Ptr[_root_.glib.all.GList]
object GtkActivateAction_listautoptr: 
  given _tag: Tag[GtkActivateAction_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkActivateAction_listautoptr = o
  extension (v: GtkActivateAction_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkActivateAction_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkActivateAction_queueautoptr: 
  given _tag: Tag[GtkActivateAction_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkActivateAction_queueautoptr = o
  extension (v: GtkActivateAction_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkActivateAction_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkActivateAction_slistautoptr: 
  given _tag: Tag[GtkActivateAction_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkActivateAction_slistautoptr = o
  extension (v: GtkActivateAction_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkAdjustment_autoptr = Ptr[GtkAdjustment]
object GtkAdjustment_autoptr: 
  given _tag: Tag[GtkAdjustment_autoptr] = Tag.Ptr[GtkAdjustment](GtkAdjustment._tag)
  inline def apply(inline o: Ptr[GtkAdjustment]): GtkAdjustment_autoptr = o
  extension (v: GtkAdjustment_autoptr)
    inline def value: Ptr[GtkAdjustment] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkAdjustment_listautoptr = Ptr[_root_.glib.all.GList]
object GtkAdjustment_listautoptr: 
  given _tag: Tag[GtkAdjustment_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkAdjustment_listautoptr = o
  extension (v: GtkAdjustment_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkAdjustment_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkAdjustment_queueautoptr: 
  given _tag: Tag[GtkAdjustment_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkAdjustment_queueautoptr = o
  extension (v: GtkAdjustment_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkAdjustment_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkAdjustment_slistautoptr: 
  given _tag: Tag[GtkAdjustment_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkAdjustment_slistautoptr = o
  extension (v: GtkAdjustment_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkAllocation: : the X position of the widget’s area relative to its parents allocation. : the Y position of the widget’s area relative to its parents allocation. : the width of the widget’s allocated area. : the height of the widget’s allocated area.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidget.h
*/
type GtkAllocation = GdkRectangle
object GtkAllocation: 
  given _tag: Tag[GtkAllocation] = GdkRectangle._tag
  inline def apply(inline o: GdkRectangle): GtkAllocation = o
  extension (v: GtkAllocation)
    inline def value: GdkRectangle = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkAlternativeTriggerClass_autoptr = Ptr[GtkAlternativeTriggerClass]
object GtkAlternativeTriggerClass_autoptr: 
  given _tag: Tag[GtkAlternativeTriggerClass_autoptr] = Tag.Ptr[GtkAlternativeTriggerClass](GtkAlternativeTriggerClass._tag)
  inline def apply(inline o: Ptr[GtkAlternativeTriggerClass]): GtkAlternativeTriggerClass_autoptr = o
  extension (v: GtkAlternativeTriggerClass_autoptr)
    inline def value: Ptr[GtkAlternativeTriggerClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkAlternativeTriggerClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkAlternativeTriggerClass_listautoptr: 
  given _tag: Tag[GtkAlternativeTriggerClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkAlternativeTriggerClass_listautoptr = o
  extension (v: GtkAlternativeTriggerClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkAlternativeTriggerClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkAlternativeTriggerClass_queueautoptr: 
  given _tag: Tag[GtkAlternativeTriggerClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkAlternativeTriggerClass_queueautoptr = o
  extension (v: GtkAlternativeTriggerClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkAlternativeTriggerClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkAlternativeTriggerClass_slistautoptr: 
  given _tag: Tag[GtkAlternativeTriggerClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkAlternativeTriggerClass_slistautoptr = o
  extension (v: GtkAlternativeTriggerClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkAlternativeTrigger_autoptr = Ptr[GtkAlternativeTrigger]
object GtkAlternativeTrigger_autoptr: 
  given _tag: Tag[GtkAlternativeTrigger_autoptr] = Tag.Ptr[GtkAlternativeTrigger](GtkAlternativeTrigger._tag)
  inline def apply(inline o: Ptr[GtkAlternativeTrigger]): GtkAlternativeTrigger_autoptr = o
  extension (v: GtkAlternativeTrigger_autoptr)
    inline def value: Ptr[GtkAlternativeTrigger] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkAlternativeTrigger_listautoptr = Ptr[_root_.glib.all.GList]
object GtkAlternativeTrigger_listautoptr: 
  given _tag: Tag[GtkAlternativeTrigger_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkAlternativeTrigger_listautoptr = o
  extension (v: GtkAlternativeTrigger_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkAlternativeTrigger_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkAlternativeTrigger_queueautoptr: 
  given _tag: Tag[GtkAlternativeTrigger_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkAlternativeTrigger_queueautoptr = o
  extension (v: GtkAlternativeTrigger_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkAlternativeTrigger_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkAlternativeTrigger_slistautoptr: 
  given _tag: Tag[GtkAlternativeTrigger_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkAlternativeTrigger_slistautoptr = o
  extension (v: GtkAlternativeTrigger_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type GtkAnyFilterClass_autoptr = Ptr[GtkAnyFilterClass]
object GtkAnyFilterClass_autoptr: 
  given _tag: Tag[GtkAnyFilterClass_autoptr] = Tag.Ptr[GtkAnyFilterClass](GtkAnyFilterClass._tag)
  inline def apply(inline o: Ptr[GtkAnyFilterClass]): GtkAnyFilterClass_autoptr = o
  extension (v: GtkAnyFilterClass_autoptr)
    inline def value: Ptr[GtkAnyFilterClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type GtkAnyFilterClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkAnyFilterClass_listautoptr: 
  given _tag: Tag[GtkAnyFilterClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkAnyFilterClass_listautoptr = o
  extension (v: GtkAnyFilterClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type GtkAnyFilterClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkAnyFilterClass_queueautoptr: 
  given _tag: Tag[GtkAnyFilterClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkAnyFilterClass_queueautoptr = o
  extension (v: GtkAnyFilterClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type GtkAnyFilterClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkAnyFilterClass_slistautoptr: 
  given _tag: Tag[GtkAnyFilterClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkAnyFilterClass_slistautoptr = o
  extension (v: GtkAnyFilterClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type GtkAnyFilter_autoptr = Ptr[GtkAnyFilter]
object GtkAnyFilter_autoptr: 
  given _tag: Tag[GtkAnyFilter_autoptr] = Tag.Ptr[GtkAnyFilter](GtkAnyFilter._tag)
  inline def apply(inline o: Ptr[GtkAnyFilter]): GtkAnyFilter_autoptr = o
  extension (v: GtkAnyFilter_autoptr)
    inline def value: Ptr[GtkAnyFilter] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type GtkAnyFilter_listautoptr = Ptr[_root_.glib.all.GList]
object GtkAnyFilter_listautoptr: 
  given _tag: Tag[GtkAnyFilter_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkAnyFilter_listautoptr = o
  extension (v: GtkAnyFilter_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type GtkAnyFilter_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkAnyFilter_queueautoptr: 
  given _tag: Tag[GtkAnyFilter_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkAnyFilter_queueautoptr = o
  extension (v: GtkAnyFilter_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type GtkAnyFilter_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkAnyFilter_slistautoptr: 
  given _tag: Tag[GtkAnyFilter_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkAnyFilter_slistautoptr = o
  extension (v: GtkAnyFilter_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkAppChooserButton_autoptr = Ptr[GtkAppChooserButton]
object GtkAppChooserButton_autoptr: 
  given _tag: Tag[GtkAppChooserButton_autoptr] = Tag.Ptr[GtkAppChooserButton](GtkAppChooserButton._tag)
  inline def apply(inline o: Ptr[GtkAppChooserButton]): GtkAppChooserButton_autoptr = o
  extension (v: GtkAppChooserButton_autoptr)
    inline def value: Ptr[GtkAppChooserButton] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkAppChooserButton_listautoptr = Ptr[_root_.glib.all.GList]
object GtkAppChooserButton_listautoptr: 
  given _tag: Tag[GtkAppChooserButton_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkAppChooserButton_listautoptr = o
  extension (v: GtkAppChooserButton_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkAppChooserButton_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkAppChooserButton_queueautoptr: 
  given _tag: Tag[GtkAppChooserButton_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkAppChooserButton_queueautoptr = o
  extension (v: GtkAppChooserButton_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkAppChooserButton_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkAppChooserButton_slistautoptr: 
  given _tag: Tag[GtkAppChooserButton_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkAppChooserButton_slistautoptr = o
  extension (v: GtkAppChooserButton_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkAppChooserDialog_autoptr = Ptr[GtkAppChooserDialog]
object GtkAppChooserDialog_autoptr: 
  given _tag: Tag[GtkAppChooserDialog_autoptr] = Tag.Ptr[GtkAppChooserDialog](GtkAppChooserDialog._tag)
  inline def apply(inline o: Ptr[GtkAppChooserDialog]): GtkAppChooserDialog_autoptr = o
  extension (v: GtkAppChooserDialog_autoptr)
    inline def value: Ptr[GtkAppChooserDialog] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkAppChooserDialog_listautoptr = Ptr[_root_.glib.all.GList]
object GtkAppChooserDialog_listautoptr: 
  given _tag: Tag[GtkAppChooserDialog_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkAppChooserDialog_listautoptr = o
  extension (v: GtkAppChooserDialog_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkAppChooserDialog_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkAppChooserDialog_queueautoptr: 
  given _tag: Tag[GtkAppChooserDialog_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkAppChooserDialog_queueautoptr = o
  extension (v: GtkAppChooserDialog_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkAppChooserDialog_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkAppChooserDialog_slistautoptr: 
  given _tag: Tag[GtkAppChooserDialog_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkAppChooserDialog_slistautoptr = o
  extension (v: GtkAppChooserDialog_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkAppChooserWidget_autoptr = Ptr[GtkAppChooserWidget]
object GtkAppChooserWidget_autoptr: 
  given _tag: Tag[GtkAppChooserWidget_autoptr] = Tag.Ptr[GtkAppChooserWidget](GtkAppChooserWidget._tag)
  inline def apply(inline o: Ptr[GtkAppChooserWidget]): GtkAppChooserWidget_autoptr = o
  extension (v: GtkAppChooserWidget_autoptr)
    inline def value: Ptr[GtkAppChooserWidget] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkAppChooserWidget_listautoptr = Ptr[_root_.glib.all.GList]
object GtkAppChooserWidget_listautoptr: 
  given _tag: Tag[GtkAppChooserWidget_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkAppChooserWidget_listautoptr = o
  extension (v: GtkAppChooserWidget_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkAppChooserWidget_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkAppChooserWidget_queueautoptr: 
  given _tag: Tag[GtkAppChooserWidget_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkAppChooserWidget_queueautoptr = o
  extension (v: GtkAppChooserWidget_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkAppChooserWidget_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkAppChooserWidget_slistautoptr: 
  given _tag: Tag[GtkAppChooserWidget_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkAppChooserWidget_slistautoptr = o
  extension (v: GtkAppChooserWidget_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkAppChooser_autoptr = Ptr[GtkAppChooser]
object GtkAppChooser_autoptr: 
  given _tag: Tag[GtkAppChooser_autoptr] = Tag.Ptr[GtkAppChooser](GtkAppChooser._tag)
  inline def apply(inline o: Ptr[GtkAppChooser]): GtkAppChooser_autoptr = o
  extension (v: GtkAppChooser_autoptr)
    inline def value: Ptr[GtkAppChooser] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkAppChooser_listautoptr = Ptr[_root_.glib.all.GList]
object GtkAppChooser_listautoptr: 
  given _tag: Tag[GtkAppChooser_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkAppChooser_listautoptr = o
  extension (v: GtkAppChooser_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkAppChooser_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkAppChooser_queueautoptr: 
  given _tag: Tag[GtkAppChooser_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkAppChooser_queueautoptr = o
  extension (v: GtkAppChooser_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkAppChooser_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkAppChooser_slistautoptr: 
  given _tag: Tag[GtkAppChooser_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkAppChooser_slistautoptr = o
  extension (v: GtkAppChooser_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkApplicationWindow_autoptr = Ptr[GtkApplicationWindow]
object GtkApplicationWindow_autoptr: 
  given _tag: Tag[GtkApplicationWindow_autoptr] = Tag.Ptr[GtkApplicationWindow](GtkApplicationWindow._tag)
  inline def apply(inline o: Ptr[GtkApplicationWindow]): GtkApplicationWindow_autoptr = o
  extension (v: GtkApplicationWindow_autoptr)
    inline def value: Ptr[GtkApplicationWindow] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkApplicationWindow_listautoptr = Ptr[_root_.glib.all.GList]
object GtkApplicationWindow_listautoptr: 
  given _tag: Tag[GtkApplicationWindow_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkApplicationWindow_listautoptr = o
  extension (v: GtkApplicationWindow_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkApplicationWindow_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkApplicationWindow_queueautoptr: 
  given _tag: Tag[GtkApplicationWindow_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkApplicationWindow_queueautoptr = o
  extension (v: GtkApplicationWindow_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkApplicationWindow_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkApplicationWindow_slistautoptr: 
  given _tag: Tag[GtkApplicationWindow_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkApplicationWindow_slistautoptr = o
  extension (v: GtkApplicationWindow_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkapplication.h
*/
opaque type GtkApplication_autoptr = Ptr[GtkApplication]
object GtkApplication_autoptr: 
  given _tag: Tag[GtkApplication_autoptr] = Tag.Ptr[GtkApplication](GtkApplication._tag)
  inline def apply(inline o: Ptr[GtkApplication]): GtkApplication_autoptr = o
  extension (v: GtkApplication_autoptr)
    inline def value: Ptr[GtkApplication] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkapplication.h
*/
opaque type GtkApplication_listautoptr = Ptr[_root_.glib.all.GList]
object GtkApplication_listautoptr: 
  given _tag: Tag[GtkApplication_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkApplication_listautoptr = o
  extension (v: GtkApplication_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkapplication.h
*/
opaque type GtkApplication_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkApplication_queueautoptr: 
  given _tag: Tag[GtkApplication_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkApplication_queueautoptr = o
  extension (v: GtkApplication_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkapplication.h
*/
opaque type GtkApplication_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkApplication_slistautoptr: 
  given _tag: Tag[GtkApplication_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkApplication_slistautoptr = o
  extension (v: GtkApplication_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkAspectFrame_autoptr = Ptr[GtkAspectFrame]
object GtkAspectFrame_autoptr: 
  given _tag: Tag[GtkAspectFrame_autoptr] = Tag.Ptr[GtkAspectFrame](GtkAspectFrame._tag)
  inline def apply(inline o: Ptr[GtkAspectFrame]): GtkAspectFrame_autoptr = o
  extension (v: GtkAspectFrame_autoptr)
    inline def value: Ptr[GtkAspectFrame] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkAspectFrame_listautoptr = Ptr[_root_.glib.all.GList]
object GtkAspectFrame_listautoptr: 
  given _tag: Tag[GtkAspectFrame_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkAspectFrame_listautoptr = o
  extension (v: GtkAspectFrame_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkAspectFrame_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkAspectFrame_queueautoptr: 
  given _tag: Tag[GtkAspectFrame_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkAspectFrame_queueautoptr = o
  extension (v: GtkAspectFrame_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkAspectFrame_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkAspectFrame_slistautoptr: 
  given _tag: Tag[GtkAspectFrame_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkAspectFrame_slistautoptr = o
  extension (v: GtkAspectFrame_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkAssistantPageFunc: _page: The page number used to calculate the next page.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkassistant.h
*/
opaque type GtkAssistantPageFunc = CFuncPtr2[CInt, _root_.glib.all.gpointer, CInt]
object GtkAssistantPageFunc: 
  given _tag: Tag[GtkAssistantPageFunc] = Tag.materializeCFuncPtr2[CInt, _root_.glib.all.gpointer, CInt]
  inline def apply(inline o: CFuncPtr2[CInt, _root_.glib.all.gpointer, CInt]): GtkAssistantPageFunc = o
  extension (v: GtkAssistantPageFunc)
    inline def value: CFuncPtr2[CInt, _root_.glib.all.gpointer, CInt] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkAssistant_autoptr = Ptr[GtkAssistant]
object GtkAssistant_autoptr: 
  given _tag: Tag[GtkAssistant_autoptr] = Tag.Ptr[GtkAssistant](GtkAssistant._tag)
  inline def apply(inline o: Ptr[GtkAssistant]): GtkAssistant_autoptr = o
  extension (v: GtkAssistant_autoptr)
    inline def value: Ptr[GtkAssistant] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkAssistant_listautoptr = Ptr[_root_.glib.all.GList]
object GtkAssistant_listautoptr: 
  given _tag: Tag[GtkAssistant_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkAssistant_listautoptr = o
  extension (v: GtkAssistant_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkAssistant_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkAssistant_queueautoptr: 
  given _tag: Tag[GtkAssistant_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkAssistant_queueautoptr = o
  extension (v: GtkAssistant_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkAssistant_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkAssistant_slistautoptr: 
  given _tag: Tag[GtkAssistant_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkAssistant_slistautoptr = o
  extension (v: GtkAssistant_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbinlayout.h
*/
opaque type GtkBinLayoutClass_autoptr = Ptr[GtkBinLayoutClass]
object GtkBinLayoutClass_autoptr: 
  given _tag: Tag[GtkBinLayoutClass_autoptr] = Tag.Ptr[GtkBinLayoutClass](GtkBinLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkBinLayoutClass]): GtkBinLayoutClass_autoptr = o
  extension (v: GtkBinLayoutClass_autoptr)
    inline def value: Ptr[GtkBinLayoutClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbinlayout.h
*/
opaque type GtkBinLayoutClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkBinLayoutClass_listautoptr: 
  given _tag: Tag[GtkBinLayoutClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkBinLayoutClass_listautoptr = o
  extension (v: GtkBinLayoutClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbinlayout.h
*/
opaque type GtkBinLayoutClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkBinLayoutClass_queueautoptr: 
  given _tag: Tag[GtkBinLayoutClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkBinLayoutClass_queueautoptr = o
  extension (v: GtkBinLayoutClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbinlayout.h
*/
opaque type GtkBinLayoutClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkBinLayoutClass_slistautoptr: 
  given _tag: Tag[GtkBinLayoutClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkBinLayoutClass_slistautoptr = o
  extension (v: GtkBinLayoutClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbinlayout.h
*/
opaque type GtkBinLayout_autoptr = Ptr[GtkBinLayout]
object GtkBinLayout_autoptr: 
  given _tag: Tag[GtkBinLayout_autoptr] = Tag.Ptr[GtkBinLayout](GtkBinLayout._tag)
  inline def apply(inline o: Ptr[GtkBinLayout]): GtkBinLayout_autoptr = o
  extension (v: GtkBinLayout_autoptr)
    inline def value: Ptr[GtkBinLayout] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbinlayout.h
*/
opaque type GtkBinLayout_listautoptr = Ptr[_root_.glib.all.GList]
object GtkBinLayout_listautoptr: 
  given _tag: Tag[GtkBinLayout_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkBinLayout_listautoptr = o
  extension (v: GtkBinLayout_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbinlayout.h
*/
opaque type GtkBinLayout_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkBinLayout_queueautoptr: 
  given _tag: Tag[GtkBinLayout_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkBinLayout_queueautoptr = o
  extension (v: GtkBinLayout_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbinlayout.h
*/
opaque type GtkBinLayout_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkBinLayout_slistautoptr: 
  given _tag: Tag[GtkBinLayout_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkBinLayout_slistautoptr = o
  extension (v: GtkBinLayout_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbitset.h
*/
opaque type GtkBitset_autoptr = Ptr[GtkBitset]
object GtkBitset_autoptr: 
  given _tag: Tag[GtkBitset_autoptr] = Tag.Ptr[GtkBitset](GtkBitset._tag)
  inline def apply(inline o: Ptr[GtkBitset]): GtkBitset_autoptr = o
  extension (v: GtkBitset_autoptr)
    inline def value: Ptr[GtkBitset] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbitset.h
*/
opaque type GtkBitset_listautoptr = Ptr[_root_.glib.all.GList]
object GtkBitset_listautoptr: 
  given _tag: Tag[GtkBitset_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkBitset_listautoptr = o
  extension (v: GtkBitset_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbitset.h
*/
opaque type GtkBitset_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkBitset_queueautoptr: 
  given _tag: Tag[GtkBitset_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkBitset_queueautoptr = o
  extension (v: GtkBitset_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbitset.h
*/
opaque type GtkBitset_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkBitset_slistautoptr: 
  given _tag: Tag[GtkBitset_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkBitset_slistautoptr = o
  extension (v: GtkBitset_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbookmarklist.h
*/
opaque type GtkBookmarkListClass_autoptr = Ptr[GtkBookmarkListClass]
object GtkBookmarkListClass_autoptr: 
  given _tag: Tag[GtkBookmarkListClass_autoptr] = Tag.Ptr[GtkBookmarkListClass](GtkBookmarkListClass._tag)
  inline def apply(inline o: Ptr[GtkBookmarkListClass]): GtkBookmarkListClass_autoptr = o
  extension (v: GtkBookmarkListClass_autoptr)
    inline def value: Ptr[GtkBookmarkListClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbookmarklist.h
*/
opaque type GtkBookmarkListClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkBookmarkListClass_listautoptr: 
  given _tag: Tag[GtkBookmarkListClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkBookmarkListClass_listautoptr = o
  extension (v: GtkBookmarkListClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbookmarklist.h
*/
opaque type GtkBookmarkListClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkBookmarkListClass_queueautoptr: 
  given _tag: Tag[GtkBookmarkListClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkBookmarkListClass_queueautoptr = o
  extension (v: GtkBookmarkListClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbookmarklist.h
*/
opaque type GtkBookmarkListClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkBookmarkListClass_slistautoptr: 
  given _tag: Tag[GtkBookmarkListClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkBookmarkListClass_slistautoptr = o
  extension (v: GtkBookmarkListClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbookmarklist.h
*/
opaque type GtkBookmarkList_autoptr = Ptr[GtkBookmarkList]
object GtkBookmarkList_autoptr: 
  given _tag: Tag[GtkBookmarkList_autoptr] = Tag.Ptr[GtkBookmarkList](GtkBookmarkList._tag)
  inline def apply(inline o: Ptr[GtkBookmarkList]): GtkBookmarkList_autoptr = o
  extension (v: GtkBookmarkList_autoptr)
    inline def value: Ptr[GtkBookmarkList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbookmarklist.h
*/
opaque type GtkBookmarkList_listautoptr = Ptr[_root_.glib.all.GList]
object GtkBookmarkList_listautoptr: 
  given _tag: Tag[GtkBookmarkList_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkBookmarkList_listautoptr = o
  extension (v: GtkBookmarkList_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbookmarklist.h
*/
opaque type GtkBookmarkList_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkBookmarkList_queueautoptr: 
  given _tag: Tag[GtkBookmarkList_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkBookmarkList_queueautoptr = o
  extension (v: GtkBookmarkList_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbookmarklist.h
*/
opaque type GtkBookmarkList_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkBookmarkList_slistautoptr: 
  given _tag: Tag[GtkBookmarkList_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkBookmarkList_slistautoptr = o
  extension (v: GtkBookmarkList_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkboolfilter.h
*/
opaque type GtkBoolFilterClass_autoptr = Ptr[GtkBoolFilterClass]
object GtkBoolFilterClass_autoptr: 
  given _tag: Tag[GtkBoolFilterClass_autoptr] = Tag.Ptr[GtkBoolFilterClass](GtkBoolFilterClass._tag)
  inline def apply(inline o: Ptr[GtkBoolFilterClass]): GtkBoolFilterClass_autoptr = o
  extension (v: GtkBoolFilterClass_autoptr)
    inline def value: Ptr[GtkBoolFilterClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkboolfilter.h
*/
opaque type GtkBoolFilterClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkBoolFilterClass_listautoptr: 
  given _tag: Tag[GtkBoolFilterClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkBoolFilterClass_listautoptr = o
  extension (v: GtkBoolFilterClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkboolfilter.h
*/
opaque type GtkBoolFilterClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkBoolFilterClass_queueautoptr: 
  given _tag: Tag[GtkBoolFilterClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkBoolFilterClass_queueautoptr = o
  extension (v: GtkBoolFilterClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkboolfilter.h
*/
opaque type GtkBoolFilterClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkBoolFilterClass_slistautoptr: 
  given _tag: Tag[GtkBoolFilterClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkBoolFilterClass_slistautoptr = o
  extension (v: GtkBoolFilterClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkboolfilter.h
*/
opaque type GtkBoolFilter_autoptr = Ptr[GtkBoolFilter]
object GtkBoolFilter_autoptr: 
  given _tag: Tag[GtkBoolFilter_autoptr] = Tag.Ptr[GtkBoolFilter](GtkBoolFilter._tag)
  inline def apply(inline o: Ptr[GtkBoolFilter]): GtkBoolFilter_autoptr = o
  extension (v: GtkBoolFilter_autoptr)
    inline def value: Ptr[GtkBoolFilter] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkboolfilter.h
*/
opaque type GtkBoolFilter_listautoptr = Ptr[_root_.glib.all.GList]
object GtkBoolFilter_listautoptr: 
  given _tag: Tag[GtkBoolFilter_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkBoolFilter_listautoptr = o
  extension (v: GtkBoolFilter_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkboolfilter.h
*/
opaque type GtkBoolFilter_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkBoolFilter_queueautoptr: 
  given _tag: Tag[GtkBoolFilter_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkBoolFilter_queueautoptr = o
  extension (v: GtkBoolFilter_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkboolfilter.h
*/
opaque type GtkBoolFilter_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkBoolFilter_slistautoptr: 
  given _tag: Tag[GtkBoolFilter_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkBoolFilter_slistautoptr = o
  extension (v: GtkBoolFilter_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkborder.h
*/
opaque type GtkBorder_autoptr = Ptr[GtkBorder]
object GtkBorder_autoptr: 
  given _tag: Tag[GtkBorder_autoptr] = Tag.Ptr[GtkBorder](GtkBorder._tag)
  inline def apply(inline o: Ptr[GtkBorder]): GtkBorder_autoptr = o
  extension (v: GtkBorder_autoptr)
    inline def value: Ptr[GtkBorder] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkborder.h
*/
opaque type GtkBorder_listautoptr = Ptr[_root_.glib.all.GList]
object GtkBorder_listautoptr: 
  given _tag: Tag[GtkBorder_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkBorder_listautoptr = o
  extension (v: GtkBorder_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkborder.h
*/
opaque type GtkBorder_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkBorder_queueautoptr: 
  given _tag: Tag[GtkBorder_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkBorder_queueautoptr = o
  extension (v: GtkBorder_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkborder.h
*/
opaque type GtkBorder_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkBorder_slistautoptr: 
  given _tag: Tag[GtkBorder_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkBorder_slistautoptr = o
  extension (v: GtkBorder_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkboxlayout.h
*/
opaque type GtkBoxLayoutClass_autoptr = Ptr[GtkBoxLayoutClass]
object GtkBoxLayoutClass_autoptr: 
  given _tag: Tag[GtkBoxLayoutClass_autoptr] = Tag.Ptr[GtkBoxLayoutClass](GtkBoxLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkBoxLayoutClass]): GtkBoxLayoutClass_autoptr = o
  extension (v: GtkBoxLayoutClass_autoptr)
    inline def value: Ptr[GtkBoxLayoutClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkboxlayout.h
*/
opaque type GtkBoxLayoutClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkBoxLayoutClass_listautoptr: 
  given _tag: Tag[GtkBoxLayoutClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkBoxLayoutClass_listautoptr = o
  extension (v: GtkBoxLayoutClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkboxlayout.h
*/
opaque type GtkBoxLayoutClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkBoxLayoutClass_queueautoptr: 
  given _tag: Tag[GtkBoxLayoutClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkBoxLayoutClass_queueautoptr = o
  extension (v: GtkBoxLayoutClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkboxlayout.h
*/
opaque type GtkBoxLayoutClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkBoxLayoutClass_slistautoptr: 
  given _tag: Tag[GtkBoxLayoutClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkBoxLayoutClass_slistautoptr = o
  extension (v: GtkBoxLayoutClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkboxlayout.h
*/
opaque type GtkBoxLayout_autoptr = Ptr[GtkBoxLayout]
object GtkBoxLayout_autoptr: 
  given _tag: Tag[GtkBoxLayout_autoptr] = Tag.Ptr[GtkBoxLayout](GtkBoxLayout._tag)
  inline def apply(inline o: Ptr[GtkBoxLayout]): GtkBoxLayout_autoptr = o
  extension (v: GtkBoxLayout_autoptr)
    inline def value: Ptr[GtkBoxLayout] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkboxlayout.h
*/
opaque type GtkBoxLayout_listautoptr = Ptr[_root_.glib.all.GList]
object GtkBoxLayout_listautoptr: 
  given _tag: Tag[GtkBoxLayout_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkBoxLayout_listautoptr = o
  extension (v: GtkBoxLayout_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkboxlayout.h
*/
opaque type GtkBoxLayout_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkBoxLayout_queueautoptr: 
  given _tag: Tag[GtkBoxLayout_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkBoxLayout_queueautoptr = o
  extension (v: GtkBoxLayout_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkboxlayout.h
*/
opaque type GtkBoxLayout_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkBoxLayout_slistautoptr: 
  given _tag: Tag[GtkBoxLayout_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkBoxLayout_slistautoptr = o
  extension (v: GtkBoxLayout_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkBox_autoptr = Ptr[GtkBox]
object GtkBox_autoptr: 
  given _tag: Tag[GtkBox_autoptr] = Tag.Ptr[GtkBox](GtkBox._tag)
  inline def apply(inline o: Ptr[GtkBox]): GtkBox_autoptr = o
  extension (v: GtkBox_autoptr)
    inline def value: Ptr[GtkBox] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkBox_listautoptr = Ptr[_root_.glib.all.GList]
object GtkBox_listautoptr: 
  given _tag: Tag[GtkBox_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkBox_listautoptr = o
  extension (v: GtkBox_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkBox_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkBox_queueautoptr: 
  given _tag: Tag[GtkBox_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkBox_queueautoptr = o
  extension (v: GtkBox_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkBox_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkBox_slistautoptr: 
  given _tag: Tag[GtkBox_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkBox_slistautoptr = o
  extension (v: GtkBox_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkBuildable_autoptr = Ptr[GtkBuildable]
object GtkBuildable_autoptr: 
  given _tag: Tag[GtkBuildable_autoptr] = Tag.Ptr[GtkBuildable](GtkBuildable._tag)
  inline def apply(inline o: Ptr[GtkBuildable]): GtkBuildable_autoptr = o
  extension (v: GtkBuildable_autoptr)
    inline def value: Ptr[GtkBuildable] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkBuildable_listautoptr = Ptr[_root_.glib.all.GList]
object GtkBuildable_listautoptr: 
  given _tag: Tag[GtkBuildable_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkBuildable_listautoptr = o
  extension (v: GtkBuildable_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkBuildable_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkBuildable_queueautoptr: 
  given _tag: Tag[GtkBuildable_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkBuildable_queueautoptr = o
  extension (v: GtkBuildable_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkBuildable_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkBuildable_slistautoptr: 
  given _tag: Tag[GtkBuildable_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkBuildable_slistautoptr = o
  extension (v: GtkBuildable_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuilderscope.h
*/
opaque type GtkBuilderCScopeClass_autoptr = Ptr[GtkBuilderCScopeClass]
object GtkBuilderCScopeClass_autoptr: 
  given _tag: Tag[GtkBuilderCScopeClass_autoptr] = Tag.Ptr[GtkBuilderCScopeClass](GtkBuilderCScopeClass._tag)
  inline def apply(inline o: Ptr[GtkBuilderCScopeClass]): GtkBuilderCScopeClass_autoptr = o
  extension (v: GtkBuilderCScopeClass_autoptr)
    inline def value: Ptr[GtkBuilderCScopeClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuilderscope.h
*/
opaque type GtkBuilderCScopeClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkBuilderCScopeClass_listautoptr: 
  given _tag: Tag[GtkBuilderCScopeClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkBuilderCScopeClass_listautoptr = o
  extension (v: GtkBuilderCScopeClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuilderscope.h
*/
opaque type GtkBuilderCScopeClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkBuilderCScopeClass_queueautoptr: 
  given _tag: Tag[GtkBuilderCScopeClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkBuilderCScopeClass_queueautoptr = o
  extension (v: GtkBuilderCScopeClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuilderscope.h
*/
opaque type GtkBuilderCScopeClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkBuilderCScopeClass_slistautoptr: 
  given _tag: Tag[GtkBuilderCScopeClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkBuilderCScopeClass_slistautoptr = o
  extension (v: GtkBuilderCScopeClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuilderscope.h
*/
opaque type GtkBuilderCScope_autoptr = Ptr[GtkBuilderCScope]
object GtkBuilderCScope_autoptr: 
  given _tag: Tag[GtkBuilderCScope_autoptr] = Tag.Ptr[GtkBuilderCScope](GtkBuilderCScope._tag)
  inline def apply(inline o: Ptr[GtkBuilderCScope]): GtkBuilderCScope_autoptr = o
  extension (v: GtkBuilderCScope_autoptr)
    inline def value: Ptr[GtkBuilderCScope] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuilderscope.h
*/
opaque type GtkBuilderCScope_listautoptr = Ptr[_root_.glib.all.GList]
object GtkBuilderCScope_listautoptr: 
  given _tag: Tag[GtkBuilderCScope_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkBuilderCScope_listautoptr = o
  extension (v: GtkBuilderCScope_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuilderscope.h
*/
opaque type GtkBuilderCScope_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkBuilderCScope_queueautoptr: 
  given _tag: Tag[GtkBuilderCScope_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkBuilderCScope_queueautoptr = o
  extension (v: GtkBuilderCScope_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuilderscope.h
*/
opaque type GtkBuilderCScope_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkBuilderCScope_slistautoptr: 
  given _tag: Tag[GtkBuilderCScope_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkBuilderCScope_slistautoptr = o
  extension (v: GtkBuilderCScope_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuilderscope.h
*/
opaque type GtkBuilderScope_autoptr = Ptr[GtkBuilderScope]
object GtkBuilderScope_autoptr: 
  given _tag: Tag[GtkBuilderScope_autoptr] = Tag.Ptr[GtkBuilderScope](GtkBuilderScope._tag)
  inline def apply(inline o: Ptr[GtkBuilderScope]): GtkBuilderScope_autoptr = o
  extension (v: GtkBuilderScope_autoptr)
    inline def value: Ptr[GtkBuilderScope] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuilderscope.h
*/
opaque type GtkBuilderScope_listautoptr = Ptr[_root_.glib.all.GList]
object GtkBuilderScope_listautoptr: 
  given _tag: Tag[GtkBuilderScope_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkBuilderScope_listautoptr = o
  extension (v: GtkBuilderScope_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuilderscope.h
*/
opaque type GtkBuilderScope_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkBuilderScope_queueautoptr: 
  given _tag: Tag[GtkBuilderScope_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkBuilderScope_queueautoptr = o
  extension (v: GtkBuilderScope_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuilderscope.h
*/
opaque type GtkBuilderScope_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkBuilderScope_slistautoptr: 
  given _tag: Tag[GtkBuilderScope_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkBuilderScope_slistautoptr = o
  extension (v: GtkBuilderScope_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkBuilder_autoptr = Ptr[GtkBuilder]
object GtkBuilder_autoptr: 
  given _tag: Tag[GtkBuilder_autoptr] = Tag.Ptr[GtkBuilder](GtkBuilder._tag)
  inline def apply(inline o: Ptr[GtkBuilder]): GtkBuilder_autoptr = o
  extension (v: GtkBuilder_autoptr)
    inline def value: Ptr[GtkBuilder] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkBuilder_listautoptr = Ptr[_root_.glib.all.GList]
object GtkBuilder_listautoptr: 
  given _tag: Tag[GtkBuilder_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkBuilder_listautoptr = o
  extension (v: GtkBuilder_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkBuilder_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkBuilder_queueautoptr: 
  given _tag: Tag[GtkBuilder_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkBuilder_queueautoptr = o
  extension (v: GtkBuilder_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkBuilder_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkBuilder_slistautoptr: 
  given _tag: Tag[GtkBuilder_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkBuilder_slistautoptr = o
  extension (v: GtkBuilder_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkButton_autoptr = Ptr[GtkButton]
object GtkButton_autoptr: 
  given _tag: Tag[GtkButton_autoptr] = Tag.Ptr[GtkButton](GtkButton._tag)
  inline def apply(inline o: Ptr[GtkButton]): GtkButton_autoptr = o
  extension (v: GtkButton_autoptr)
    inline def value: Ptr[GtkButton] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkButton_listautoptr = Ptr[_root_.glib.all.GList]
object GtkButton_listautoptr: 
  given _tag: Tag[GtkButton_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkButton_listautoptr = o
  extension (v: GtkButton_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkButton_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkButton_queueautoptr: 
  given _tag: Tag[GtkButton_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkButton_queueautoptr = o
  extension (v: GtkButton_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkButton_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkButton_slistautoptr: 
  given _tag: Tag[GtkButton_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkButton_slistautoptr = o
  extension (v: GtkButton_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCalendar_autoptr = Ptr[GtkCalendar]
object GtkCalendar_autoptr: 
  given _tag: Tag[GtkCalendar_autoptr] = Tag.Ptr[GtkCalendar](GtkCalendar._tag)
  inline def apply(inline o: Ptr[GtkCalendar]): GtkCalendar_autoptr = o
  extension (v: GtkCalendar_autoptr)
    inline def value: Ptr[GtkCalendar] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCalendar_listautoptr = Ptr[_root_.glib.all.GList]
object GtkCalendar_listautoptr: 
  given _tag: Tag[GtkCalendar_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkCalendar_listautoptr = o
  extension (v: GtkCalendar_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCalendar_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkCalendar_queueautoptr: 
  given _tag: Tag[GtkCalendar_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkCalendar_queueautoptr = o
  extension (v: GtkCalendar_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCalendar_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkCalendar_slistautoptr: 
  given _tag: Tag[GtkCalendar_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkCalendar_slistautoptr = o
  extension (v: GtkCalendar_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkCallbackActionClass_autoptr = Ptr[GtkCallbackActionClass]
object GtkCallbackActionClass_autoptr: 
  given _tag: Tag[GtkCallbackActionClass_autoptr] = Tag.Ptr[GtkCallbackActionClass](GtkCallbackActionClass._tag)
  inline def apply(inline o: Ptr[GtkCallbackActionClass]): GtkCallbackActionClass_autoptr = o
  extension (v: GtkCallbackActionClass_autoptr)
    inline def value: Ptr[GtkCallbackActionClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkCallbackActionClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkCallbackActionClass_listautoptr: 
  given _tag: Tag[GtkCallbackActionClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkCallbackActionClass_listautoptr = o
  extension (v: GtkCallbackActionClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkCallbackActionClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkCallbackActionClass_queueautoptr: 
  given _tag: Tag[GtkCallbackActionClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkCallbackActionClass_queueautoptr = o
  extension (v: GtkCallbackActionClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkCallbackActionClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkCallbackActionClass_slistautoptr: 
  given _tag: Tag[GtkCallbackActionClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkCallbackActionClass_slistautoptr = o
  extension (v: GtkCallbackActionClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkCallbackAction_autoptr = Ptr[GtkCallbackAction]
object GtkCallbackAction_autoptr: 
  given _tag: Tag[GtkCallbackAction_autoptr] = Tag.Ptr[GtkCallbackAction](GtkCallbackAction._tag)
  inline def apply(inline o: Ptr[GtkCallbackAction]): GtkCallbackAction_autoptr = o
  extension (v: GtkCallbackAction_autoptr)
    inline def value: Ptr[GtkCallbackAction] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkCallbackAction_listautoptr = Ptr[_root_.glib.all.GList]
object GtkCallbackAction_listautoptr: 
  given _tag: Tag[GtkCallbackAction_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkCallbackAction_listautoptr = o
  extension (v: GtkCallbackAction_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkCallbackAction_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkCallbackAction_queueautoptr: 
  given _tag: Tag[GtkCallbackAction_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkCallbackAction_queueautoptr = o
  extension (v: GtkCallbackAction_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkCallbackAction_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkCallbackAction_slistautoptr: 
  given _tag: Tag[GtkCallbackAction_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkCallbackAction_slistautoptr = o
  extension (v: GtkCallbackAction_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkCellAllocCallback: : the cell renderer to operate on _area: the area allocated to inside the rectangle provided to gtk_cell_area_foreach_alloc(). _background: the background area for inside the background area provided to gtk_cell_area_foreach_alloc().

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellarea.h
*/
opaque type GtkCellAllocCallback = CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GdkRectangle], Ptr[GdkRectangle], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
object GtkCellAllocCallback: 
  given _tag: Tag[GtkCellAllocCallback] = Tag.materializeCFuncPtr4[Ptr[GtkCellRenderer], Ptr[GdkRectangle], Ptr[GdkRectangle], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
  inline def apply(inline o: CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GdkRectangle], Ptr[GdkRectangle], _root_.glib.all.gpointer, _root_.glib.all.gboolean]): GtkCellAllocCallback = o
  extension (v: GtkCellAllocCallback)
    inline def value: CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GdkRectangle], Ptr[GdkRectangle], _root_.glib.all.gpointer, _root_.glib.all.gboolean] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellAreaBox_autoptr = Ptr[GtkCellAreaBox]
object GtkCellAreaBox_autoptr: 
  given _tag: Tag[GtkCellAreaBox_autoptr] = Tag.Ptr[GtkCellAreaBox](GtkCellAreaBox._tag)
  inline def apply(inline o: Ptr[GtkCellAreaBox]): GtkCellAreaBox_autoptr = o
  extension (v: GtkCellAreaBox_autoptr)
    inline def value: Ptr[GtkCellAreaBox] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellAreaBox_listautoptr = Ptr[_root_.glib.all.GList]
object GtkCellAreaBox_listautoptr: 
  given _tag: Tag[GtkCellAreaBox_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkCellAreaBox_listautoptr = o
  extension (v: GtkCellAreaBox_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellAreaBox_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkCellAreaBox_queueautoptr: 
  given _tag: Tag[GtkCellAreaBox_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkCellAreaBox_queueautoptr = o
  extension (v: GtkCellAreaBox_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellAreaBox_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkCellAreaBox_slistautoptr: 
  given _tag: Tag[GtkCellAreaBox_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkCellAreaBox_slistautoptr = o
  extension (v: GtkCellAreaBox_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellAreaContext_autoptr = Ptr[GtkCellAreaContext]
object GtkCellAreaContext_autoptr: 
  given _tag: Tag[GtkCellAreaContext_autoptr] = Tag.Ptr[GtkCellAreaContext](GtkCellAreaContext._tag)
  inline def apply(inline o: Ptr[GtkCellAreaContext]): GtkCellAreaContext_autoptr = o
  extension (v: GtkCellAreaContext_autoptr)
    inline def value: Ptr[GtkCellAreaContext] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellAreaContext_listautoptr = Ptr[_root_.glib.all.GList]
object GtkCellAreaContext_listautoptr: 
  given _tag: Tag[GtkCellAreaContext_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkCellAreaContext_listautoptr = o
  extension (v: GtkCellAreaContext_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellAreaContext_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkCellAreaContext_queueautoptr: 
  given _tag: Tag[GtkCellAreaContext_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkCellAreaContext_queueautoptr = o
  extension (v: GtkCellAreaContext_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellAreaContext_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkCellAreaContext_slistautoptr: 
  given _tag: Tag[GtkCellAreaContext_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkCellAreaContext_slistautoptr = o
  extension (v: GtkCellAreaContext_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellArea_autoptr = Ptr[GtkCellArea]
object GtkCellArea_autoptr: 
  given _tag: Tag[GtkCellArea_autoptr] = Tag.Ptr[GtkCellArea](GtkCellArea._tag)
  inline def apply(inline o: Ptr[GtkCellArea]): GtkCellArea_autoptr = o
  extension (v: GtkCellArea_autoptr)
    inline def value: Ptr[GtkCellArea] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellArea_listautoptr = Ptr[_root_.glib.all.GList]
object GtkCellArea_listautoptr: 
  given _tag: Tag[GtkCellArea_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkCellArea_listautoptr = o
  extension (v: GtkCellArea_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellArea_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkCellArea_queueautoptr: 
  given _tag: Tag[GtkCellArea_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkCellArea_queueautoptr = o
  extension (v: GtkCellArea_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellArea_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkCellArea_slistautoptr: 
  given _tag: Tag[GtkCellArea_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkCellArea_slistautoptr = o
  extension (v: GtkCellArea_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkCellCallback: : the cell renderer to operate on

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellarea.h
*/
opaque type GtkCellCallback = CFuncPtr2[Ptr[GtkCellRenderer], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
object GtkCellCallback: 
  given _tag: Tag[GtkCellCallback] = Tag.materializeCFuncPtr2[Ptr[GtkCellRenderer], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
  inline def apply(inline o: CFuncPtr2[Ptr[GtkCellRenderer], _root_.glib.all.gpointer, _root_.glib.all.gboolean]): GtkCellCallback = o
  extension (v: GtkCellCallback)
    inline def value: CFuncPtr2[Ptr[GtkCellRenderer], _root_.glib.all.gpointer, _root_.glib.all.gboolean] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellEditable_autoptr = Ptr[GtkCellEditable]
object GtkCellEditable_autoptr: 
  given _tag: Tag[GtkCellEditable_autoptr] = Tag.Ptr[GtkCellEditable](GtkCellEditable._tag)
  inline def apply(inline o: Ptr[GtkCellEditable]): GtkCellEditable_autoptr = o
  extension (v: GtkCellEditable_autoptr)
    inline def value: Ptr[GtkCellEditable] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellEditable_listautoptr = Ptr[_root_.glib.all.GList]
object GtkCellEditable_listautoptr: 
  given _tag: Tag[GtkCellEditable_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkCellEditable_listautoptr = o
  extension (v: GtkCellEditable_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellEditable_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkCellEditable_queueautoptr: 
  given _tag: Tag[GtkCellEditable_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkCellEditable_queueautoptr = o
  extension (v: GtkCellEditable_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellEditable_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkCellEditable_slistautoptr: 
  given _tag: Tag[GtkCellEditable_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkCellEditable_slistautoptr = o
  extension (v: GtkCellEditable_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkCellLayoutDataFunc: _layout: a `GtkCellLayout` : the cell renderer whose value is to be set _model: the model : a `GtkTreeIter` indicating the row to set the value for

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcelllayout.h
*/
opaque type GtkCellLayoutDataFunc = CFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gpointer, Unit]
object GtkCellLayoutDataFunc: 
  given _tag: Tag[GtkCellLayoutDataFunc] = Tag.materializeCFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gpointer, Unit]
  inline def apply(inline o: CFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gpointer, Unit]): GtkCellLayoutDataFunc = o
  extension (v: GtkCellLayoutDataFunc)
    inline def value: CFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gpointer, Unit] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellLayout_autoptr = Ptr[GtkCellLayout]
object GtkCellLayout_autoptr: 
  given _tag: Tag[GtkCellLayout_autoptr] = Tag.Ptr[GtkCellLayout](GtkCellLayout._tag)
  inline def apply(inline o: Ptr[GtkCellLayout]): GtkCellLayout_autoptr = o
  extension (v: GtkCellLayout_autoptr)
    inline def value: Ptr[GtkCellLayout] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellLayout_listautoptr = Ptr[_root_.glib.all.GList]
object GtkCellLayout_listautoptr: 
  given _tag: Tag[GtkCellLayout_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkCellLayout_listautoptr = o
  extension (v: GtkCellLayout_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellLayout_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkCellLayout_queueautoptr: 
  given _tag: Tag[GtkCellLayout_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkCellLayout_queueautoptr = o
  extension (v: GtkCellLayout_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellLayout_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkCellLayout_slistautoptr: 
  given _tag: Tag[GtkCellLayout_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkCellLayout_slistautoptr = o
  extension (v: GtkCellLayout_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererAccel_autoptr = Ptr[GtkCellRendererAccel]
object GtkCellRendererAccel_autoptr: 
  given _tag: Tag[GtkCellRendererAccel_autoptr] = Tag.Ptr[GtkCellRendererAccel](GtkCellRendererAccel._tag)
  inline def apply(inline o: Ptr[GtkCellRendererAccel]): GtkCellRendererAccel_autoptr = o
  extension (v: GtkCellRendererAccel_autoptr)
    inline def value: Ptr[GtkCellRendererAccel] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererAccel_listautoptr = Ptr[_root_.glib.all.GList]
object GtkCellRendererAccel_listautoptr: 
  given _tag: Tag[GtkCellRendererAccel_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkCellRendererAccel_listautoptr = o
  extension (v: GtkCellRendererAccel_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererAccel_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkCellRendererAccel_queueautoptr: 
  given _tag: Tag[GtkCellRendererAccel_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkCellRendererAccel_queueautoptr = o
  extension (v: GtkCellRendererAccel_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererAccel_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkCellRendererAccel_slistautoptr: 
  given _tag: Tag[GtkCellRendererAccel_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkCellRendererAccel_slistautoptr = o
  extension (v: GtkCellRendererAccel_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererCombo_autoptr = Ptr[GtkCellRendererCombo]
object GtkCellRendererCombo_autoptr: 
  given _tag: Tag[GtkCellRendererCombo_autoptr] = Tag.Ptr[GtkCellRendererCombo](GtkCellRendererCombo._tag)
  inline def apply(inline o: Ptr[GtkCellRendererCombo]): GtkCellRendererCombo_autoptr = o
  extension (v: GtkCellRendererCombo_autoptr)
    inline def value: Ptr[GtkCellRendererCombo] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererCombo_listautoptr = Ptr[_root_.glib.all.GList]
object GtkCellRendererCombo_listautoptr: 
  given _tag: Tag[GtkCellRendererCombo_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkCellRendererCombo_listautoptr = o
  extension (v: GtkCellRendererCombo_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererCombo_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkCellRendererCombo_queueautoptr: 
  given _tag: Tag[GtkCellRendererCombo_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkCellRendererCombo_queueautoptr = o
  extension (v: GtkCellRendererCombo_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererCombo_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkCellRendererCombo_slistautoptr: 
  given _tag: Tag[GtkCellRendererCombo_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkCellRendererCombo_slistautoptr = o
  extension (v: GtkCellRendererCombo_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererPixbuf_autoptr = Ptr[GtkCellRendererPixbuf]
object GtkCellRendererPixbuf_autoptr: 
  given _tag: Tag[GtkCellRendererPixbuf_autoptr] = Tag.Ptr[GtkCellRendererPixbuf](GtkCellRendererPixbuf._tag)
  inline def apply(inline o: Ptr[GtkCellRendererPixbuf]): GtkCellRendererPixbuf_autoptr = o
  extension (v: GtkCellRendererPixbuf_autoptr)
    inline def value: Ptr[GtkCellRendererPixbuf] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererPixbuf_listautoptr = Ptr[_root_.glib.all.GList]
object GtkCellRendererPixbuf_listautoptr: 
  given _tag: Tag[GtkCellRendererPixbuf_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkCellRendererPixbuf_listautoptr = o
  extension (v: GtkCellRendererPixbuf_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererPixbuf_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkCellRendererPixbuf_queueautoptr: 
  given _tag: Tag[GtkCellRendererPixbuf_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkCellRendererPixbuf_queueautoptr = o
  extension (v: GtkCellRendererPixbuf_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererPixbuf_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkCellRendererPixbuf_slistautoptr: 
  given _tag: Tag[GtkCellRendererPixbuf_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkCellRendererPixbuf_slistautoptr = o
  extension (v: GtkCellRendererPixbuf_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererProgress_autoptr = Ptr[GtkCellRendererProgress]
object GtkCellRendererProgress_autoptr: 
  given _tag: Tag[GtkCellRendererProgress_autoptr] = Tag.Ptr[GtkCellRendererProgress](GtkCellRendererProgress._tag)
  inline def apply(inline o: Ptr[GtkCellRendererProgress]): GtkCellRendererProgress_autoptr = o
  extension (v: GtkCellRendererProgress_autoptr)
    inline def value: Ptr[GtkCellRendererProgress] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererProgress_listautoptr = Ptr[_root_.glib.all.GList]
object GtkCellRendererProgress_listautoptr: 
  given _tag: Tag[GtkCellRendererProgress_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkCellRendererProgress_listautoptr = o
  extension (v: GtkCellRendererProgress_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererProgress_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkCellRendererProgress_queueautoptr: 
  given _tag: Tag[GtkCellRendererProgress_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkCellRendererProgress_queueautoptr = o
  extension (v: GtkCellRendererProgress_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererProgress_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkCellRendererProgress_slistautoptr: 
  given _tag: Tag[GtkCellRendererProgress_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkCellRendererProgress_slistautoptr = o
  extension (v: GtkCellRendererProgress_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererSpin_autoptr = Ptr[GtkCellRendererSpin]
object GtkCellRendererSpin_autoptr: 
  given _tag: Tag[GtkCellRendererSpin_autoptr] = Tag.Ptr[GtkCellRendererSpin](GtkCellRendererSpin._tag)
  inline def apply(inline o: Ptr[GtkCellRendererSpin]): GtkCellRendererSpin_autoptr = o
  extension (v: GtkCellRendererSpin_autoptr)
    inline def value: Ptr[GtkCellRendererSpin] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererSpin_listautoptr = Ptr[_root_.glib.all.GList]
object GtkCellRendererSpin_listautoptr: 
  given _tag: Tag[GtkCellRendererSpin_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkCellRendererSpin_listautoptr = o
  extension (v: GtkCellRendererSpin_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererSpin_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkCellRendererSpin_queueautoptr: 
  given _tag: Tag[GtkCellRendererSpin_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkCellRendererSpin_queueautoptr = o
  extension (v: GtkCellRendererSpin_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererSpin_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkCellRendererSpin_slistautoptr: 
  given _tag: Tag[GtkCellRendererSpin_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkCellRendererSpin_slistautoptr = o
  extension (v: GtkCellRendererSpin_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererSpinner_autoptr = Ptr[GtkCellRendererSpinner]
object GtkCellRendererSpinner_autoptr: 
  given _tag: Tag[GtkCellRendererSpinner_autoptr] = Tag.Ptr[GtkCellRendererSpinner](GtkCellRendererSpinner._tag)
  inline def apply(inline o: Ptr[GtkCellRendererSpinner]): GtkCellRendererSpinner_autoptr = o
  extension (v: GtkCellRendererSpinner_autoptr)
    inline def value: Ptr[GtkCellRendererSpinner] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererSpinner_listautoptr = Ptr[_root_.glib.all.GList]
object GtkCellRendererSpinner_listautoptr: 
  given _tag: Tag[GtkCellRendererSpinner_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkCellRendererSpinner_listautoptr = o
  extension (v: GtkCellRendererSpinner_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererSpinner_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkCellRendererSpinner_queueautoptr: 
  given _tag: Tag[GtkCellRendererSpinner_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkCellRendererSpinner_queueautoptr = o
  extension (v: GtkCellRendererSpinner_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererSpinner_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkCellRendererSpinner_slistautoptr: 
  given _tag: Tag[GtkCellRendererSpinner_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkCellRendererSpinner_slistautoptr = o
  extension (v: GtkCellRendererSpinner_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererText_autoptr = Ptr[GtkCellRendererText]
object GtkCellRendererText_autoptr: 
  given _tag: Tag[GtkCellRendererText_autoptr] = Tag.Ptr[GtkCellRendererText](GtkCellRendererText._tag)
  inline def apply(inline o: Ptr[GtkCellRendererText]): GtkCellRendererText_autoptr = o
  extension (v: GtkCellRendererText_autoptr)
    inline def value: Ptr[GtkCellRendererText] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererText_listautoptr = Ptr[_root_.glib.all.GList]
object GtkCellRendererText_listautoptr: 
  given _tag: Tag[GtkCellRendererText_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkCellRendererText_listautoptr = o
  extension (v: GtkCellRendererText_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererText_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkCellRendererText_queueautoptr: 
  given _tag: Tag[GtkCellRendererText_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkCellRendererText_queueautoptr = o
  extension (v: GtkCellRendererText_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererText_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkCellRendererText_slistautoptr: 
  given _tag: Tag[GtkCellRendererText_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkCellRendererText_slistautoptr = o
  extension (v: GtkCellRendererText_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererToggle_autoptr = Ptr[GtkCellRendererToggle]
object GtkCellRendererToggle_autoptr: 
  given _tag: Tag[GtkCellRendererToggle_autoptr] = Tag.Ptr[GtkCellRendererToggle](GtkCellRendererToggle._tag)
  inline def apply(inline o: Ptr[GtkCellRendererToggle]): GtkCellRendererToggle_autoptr = o
  extension (v: GtkCellRendererToggle_autoptr)
    inline def value: Ptr[GtkCellRendererToggle] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererToggle_listautoptr = Ptr[_root_.glib.all.GList]
object GtkCellRendererToggle_listautoptr: 
  given _tag: Tag[GtkCellRendererToggle_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkCellRendererToggle_listautoptr = o
  extension (v: GtkCellRendererToggle_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererToggle_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkCellRendererToggle_queueautoptr: 
  given _tag: Tag[GtkCellRendererToggle_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkCellRendererToggle_queueautoptr = o
  extension (v: GtkCellRendererToggle_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRendererToggle_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkCellRendererToggle_slistautoptr: 
  given _tag: Tag[GtkCellRendererToggle_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkCellRendererToggle_slistautoptr = o
  extension (v: GtkCellRendererToggle_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRenderer_autoptr = Ptr[GtkCellRenderer]
object GtkCellRenderer_autoptr: 
  given _tag: Tag[GtkCellRenderer_autoptr] = Tag.Ptr[GtkCellRenderer](GtkCellRenderer._tag)
  inline def apply(inline o: Ptr[GtkCellRenderer]): GtkCellRenderer_autoptr = o
  extension (v: GtkCellRenderer_autoptr)
    inline def value: Ptr[GtkCellRenderer] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRenderer_listautoptr = Ptr[_root_.glib.all.GList]
object GtkCellRenderer_listautoptr: 
  given _tag: Tag[GtkCellRenderer_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkCellRenderer_listautoptr = o
  extension (v: GtkCellRenderer_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRenderer_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkCellRenderer_queueautoptr: 
  given _tag: Tag[GtkCellRenderer_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkCellRenderer_queueautoptr = o
  extension (v: GtkCellRenderer_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellRenderer_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkCellRenderer_slistautoptr: 
  given _tag: Tag[GtkCellRenderer_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkCellRenderer_slistautoptr = o
  extension (v: GtkCellRenderer_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellView_autoptr = Ptr[GtkCellView]
object GtkCellView_autoptr: 
  given _tag: Tag[GtkCellView_autoptr] = Tag.Ptr[GtkCellView](GtkCellView._tag)
  inline def apply(inline o: Ptr[GtkCellView]): GtkCellView_autoptr = o
  extension (v: GtkCellView_autoptr)
    inline def value: Ptr[GtkCellView] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellView_listautoptr = Ptr[_root_.glib.all.GList]
object GtkCellView_listautoptr: 
  given _tag: Tag[GtkCellView_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkCellView_listautoptr = o
  extension (v: GtkCellView_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellView_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkCellView_queueautoptr: 
  given _tag: Tag[GtkCellView_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkCellView_queueautoptr = o
  extension (v: GtkCellView_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCellView_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkCellView_slistautoptr: 
  given _tag: Tag[GtkCellView_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkCellView_slistautoptr = o
  extension (v: GtkCellView_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcenterlayout.h
*/
opaque type GtkCenterLayoutClass_autoptr = Ptr[GtkCenterLayoutClass]
object GtkCenterLayoutClass_autoptr: 
  given _tag: Tag[GtkCenterLayoutClass_autoptr] = Tag.Ptr[GtkCenterLayoutClass](GtkCenterLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkCenterLayoutClass]): GtkCenterLayoutClass_autoptr = o
  extension (v: GtkCenterLayoutClass_autoptr)
    inline def value: Ptr[GtkCenterLayoutClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcenterlayout.h
*/
opaque type GtkCenterLayoutClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkCenterLayoutClass_listautoptr: 
  given _tag: Tag[GtkCenterLayoutClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkCenterLayoutClass_listautoptr = o
  extension (v: GtkCenterLayoutClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcenterlayout.h
*/
opaque type GtkCenterLayoutClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkCenterLayoutClass_queueautoptr: 
  given _tag: Tag[GtkCenterLayoutClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkCenterLayoutClass_queueautoptr = o
  extension (v: GtkCenterLayoutClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcenterlayout.h
*/
opaque type GtkCenterLayoutClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkCenterLayoutClass_slistautoptr: 
  given _tag: Tag[GtkCenterLayoutClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkCenterLayoutClass_slistautoptr = o
  extension (v: GtkCenterLayoutClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcenterlayout.h
*/
opaque type GtkCenterLayout_autoptr = Ptr[GtkCenterLayout]
object GtkCenterLayout_autoptr: 
  given _tag: Tag[GtkCenterLayout_autoptr] = Tag.Ptr[GtkCenterLayout](GtkCenterLayout._tag)
  inline def apply(inline o: Ptr[GtkCenterLayout]): GtkCenterLayout_autoptr = o
  extension (v: GtkCenterLayout_autoptr)
    inline def value: Ptr[GtkCenterLayout] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcenterlayout.h
*/
opaque type GtkCenterLayout_listautoptr = Ptr[_root_.glib.all.GList]
object GtkCenterLayout_listautoptr: 
  given _tag: Tag[GtkCenterLayout_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkCenterLayout_listautoptr = o
  extension (v: GtkCenterLayout_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcenterlayout.h
*/
opaque type GtkCenterLayout_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkCenterLayout_queueautoptr: 
  given _tag: Tag[GtkCenterLayout_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkCenterLayout_queueautoptr = o
  extension (v: GtkCenterLayout_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcenterlayout.h
*/
opaque type GtkCenterLayout_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkCenterLayout_slistautoptr: 
  given _tag: Tag[GtkCenterLayout_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkCenterLayout_slistautoptr = o
  extension (v: GtkCenterLayout_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCheckButton_autoptr = Ptr[GtkCheckButton]
object GtkCheckButton_autoptr: 
  given _tag: Tag[GtkCheckButton_autoptr] = Tag.Ptr[GtkCheckButton](GtkCheckButton._tag)
  inline def apply(inline o: Ptr[GtkCheckButton]): GtkCheckButton_autoptr = o
  extension (v: GtkCheckButton_autoptr)
    inline def value: Ptr[GtkCheckButton] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCheckButton_listautoptr = Ptr[_root_.glib.all.GList]
object GtkCheckButton_listautoptr: 
  given _tag: Tag[GtkCheckButton_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkCheckButton_listautoptr = o
  extension (v: GtkCheckButton_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCheckButton_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkCheckButton_queueautoptr: 
  given _tag: Tag[GtkCheckButton_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkCheckButton_queueautoptr = o
  extension (v: GtkCheckButton_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCheckButton_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkCheckButton_slistautoptr: 
  given _tag: Tag[GtkCheckButton_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkCheckButton_slistautoptr = o
  extension (v: GtkCheckButton_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkColorButton_autoptr = Ptr[GtkColorButton]
object GtkColorButton_autoptr: 
  given _tag: Tag[GtkColorButton_autoptr] = Tag.Ptr[GtkColorButton](GtkColorButton._tag)
  inline def apply(inline o: Ptr[GtkColorButton]): GtkColorButton_autoptr = o
  extension (v: GtkColorButton_autoptr)
    inline def value: Ptr[GtkColorButton] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkColorButton_listautoptr = Ptr[_root_.glib.all.GList]
object GtkColorButton_listautoptr: 
  given _tag: Tag[GtkColorButton_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkColorButton_listautoptr = o
  extension (v: GtkColorButton_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkColorButton_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkColorButton_queueautoptr: 
  given _tag: Tag[GtkColorButton_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkColorButton_queueautoptr = o
  extension (v: GtkColorButton_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkColorButton_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkColorButton_slistautoptr: 
  given _tag: Tag[GtkColorButton_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkColorButton_slistautoptr = o
  extension (v: GtkColorButton_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkColorChooserDialog_autoptr = Ptr[GtkColorChooserDialog]
object GtkColorChooserDialog_autoptr: 
  given _tag: Tag[GtkColorChooserDialog_autoptr] = Tag.Ptr[GtkColorChooserDialog](GtkColorChooserDialog._tag)
  inline def apply(inline o: Ptr[GtkColorChooserDialog]): GtkColorChooserDialog_autoptr = o
  extension (v: GtkColorChooserDialog_autoptr)
    inline def value: Ptr[GtkColorChooserDialog] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkColorChooserDialog_listautoptr = Ptr[_root_.glib.all.GList]
object GtkColorChooserDialog_listautoptr: 
  given _tag: Tag[GtkColorChooserDialog_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkColorChooserDialog_listautoptr = o
  extension (v: GtkColorChooserDialog_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkColorChooserDialog_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkColorChooserDialog_queueautoptr: 
  given _tag: Tag[GtkColorChooserDialog_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkColorChooserDialog_queueautoptr = o
  extension (v: GtkColorChooserDialog_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkColorChooserDialog_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkColorChooserDialog_slistautoptr: 
  given _tag: Tag[GtkColorChooserDialog_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkColorChooserDialog_slistautoptr = o
  extension (v: GtkColorChooserDialog_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkColorChooserWidget_autoptr = Ptr[GtkColorChooserWidget]
object GtkColorChooserWidget_autoptr: 
  given _tag: Tag[GtkColorChooserWidget_autoptr] = Tag.Ptr[GtkColorChooserWidget](GtkColorChooserWidget._tag)
  inline def apply(inline o: Ptr[GtkColorChooserWidget]): GtkColorChooserWidget_autoptr = o
  extension (v: GtkColorChooserWidget_autoptr)
    inline def value: Ptr[GtkColorChooserWidget] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkColorChooserWidget_listautoptr = Ptr[_root_.glib.all.GList]
object GtkColorChooserWidget_listautoptr: 
  given _tag: Tag[GtkColorChooserWidget_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkColorChooserWidget_listautoptr = o
  extension (v: GtkColorChooserWidget_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkColorChooserWidget_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkColorChooserWidget_queueautoptr: 
  given _tag: Tag[GtkColorChooserWidget_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkColorChooserWidget_queueautoptr = o
  extension (v: GtkColorChooserWidget_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkColorChooserWidget_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkColorChooserWidget_slistautoptr: 
  given _tag: Tag[GtkColorChooserWidget_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkColorChooserWidget_slistautoptr = o
  extension (v: GtkColorChooserWidget_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkColorChooser_autoptr = Ptr[GtkColorChooser]
object GtkColorChooser_autoptr: 
  given _tag: Tag[GtkColorChooser_autoptr] = Tag.Ptr[GtkColorChooser](GtkColorChooser._tag)
  inline def apply(inline o: Ptr[GtkColorChooser]): GtkColorChooser_autoptr = o
  extension (v: GtkColorChooser_autoptr)
    inline def value: Ptr[GtkColorChooser] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkColorChooser_listautoptr = Ptr[_root_.glib.all.GList]
object GtkColorChooser_listautoptr: 
  given _tag: Tag[GtkColorChooser_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkColorChooser_listautoptr = o
  extension (v: GtkColorChooser_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkColorChooser_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkColorChooser_queueautoptr: 
  given _tag: Tag[GtkColorChooser_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkColorChooser_queueautoptr = o
  extension (v: GtkColorChooser_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkColorChooser_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkColorChooser_slistautoptr: 
  given _tag: Tag[GtkColorChooser_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkColorChooser_slistautoptr = o
  extension (v: GtkColorChooser_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcolumnviewcolumn.h
*/
opaque type GtkColumnViewColumn_autoptr = Ptr[GtkColumnViewColumn]
object GtkColumnViewColumn_autoptr: 
  given _tag: Tag[GtkColumnViewColumn_autoptr] = Tag.Ptr[GtkColumnViewColumn](GtkColumnViewColumn._tag)
  inline def apply(inline o: Ptr[GtkColumnViewColumn]): GtkColumnViewColumn_autoptr = o
  extension (v: GtkColumnViewColumn_autoptr)
    inline def value: Ptr[GtkColumnViewColumn] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcolumnviewcolumn.h
*/
opaque type GtkColumnViewColumn_listautoptr = Ptr[_root_.glib.all.GList]
object GtkColumnViewColumn_listautoptr: 
  given _tag: Tag[GtkColumnViewColumn_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkColumnViewColumn_listautoptr = o
  extension (v: GtkColumnViewColumn_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcolumnviewcolumn.h
*/
opaque type GtkColumnViewColumn_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkColumnViewColumn_queueautoptr: 
  given _tag: Tag[GtkColumnViewColumn_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkColumnViewColumn_queueautoptr = o
  extension (v: GtkColumnViewColumn_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcolumnviewcolumn.h
*/
opaque type GtkColumnViewColumn_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkColumnViewColumn_slistautoptr: 
  given _tag: Tag[GtkColumnViewColumn_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkColumnViewColumn_slistautoptr = o
  extension (v: GtkColumnViewColumn_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkComboBoxText_autoptr = Ptr[GtkComboBoxText]
object GtkComboBoxText_autoptr: 
  given _tag: Tag[GtkComboBoxText_autoptr] = Tag.Ptr[GtkComboBoxText](GtkComboBoxText._tag)
  inline def apply(inline o: Ptr[GtkComboBoxText]): GtkComboBoxText_autoptr = o
  extension (v: GtkComboBoxText_autoptr)
    inline def value: Ptr[GtkComboBoxText] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkComboBoxText_listautoptr = Ptr[_root_.glib.all.GList]
object GtkComboBoxText_listautoptr: 
  given _tag: Tag[GtkComboBoxText_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkComboBoxText_listautoptr = o
  extension (v: GtkComboBoxText_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkComboBoxText_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkComboBoxText_queueautoptr: 
  given _tag: Tag[GtkComboBoxText_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkComboBoxText_queueautoptr = o
  extension (v: GtkComboBoxText_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkComboBoxText_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkComboBoxText_slistautoptr: 
  given _tag: Tag[GtkComboBoxText_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkComboBoxText_slistautoptr = o
  extension (v: GtkComboBoxText_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkComboBox_autoptr = Ptr[GtkComboBox]
object GtkComboBox_autoptr: 
  given _tag: Tag[GtkComboBox_autoptr] = Tag.Ptr[GtkComboBox](GtkComboBox._tag)
  inline def apply(inline o: Ptr[GtkComboBox]): GtkComboBox_autoptr = o
  extension (v: GtkComboBox_autoptr)
    inline def value: Ptr[GtkComboBox] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkComboBox_listautoptr = Ptr[_root_.glib.all.GList]
object GtkComboBox_listautoptr: 
  given _tag: Tag[GtkComboBox_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkComboBox_listautoptr = o
  extension (v: GtkComboBox_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkComboBox_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkComboBox_queueautoptr: 
  given _tag: Tag[GtkComboBox_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkComboBox_queueautoptr = o
  extension (v: GtkComboBox_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkComboBox_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkComboBox_slistautoptr: 
  given _tag: Tag[GtkComboBox_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkComboBox_slistautoptr = o
  extension (v: GtkComboBox_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraint.h
*/
opaque type GtkConstraintClass_autoptr = Ptr[GtkConstraintClass]
object GtkConstraintClass_autoptr: 
  given _tag: Tag[GtkConstraintClass_autoptr] = Tag.Ptr[GtkConstraintClass](GtkConstraintClass._tag)
  inline def apply(inline o: Ptr[GtkConstraintClass]): GtkConstraintClass_autoptr = o
  extension (v: GtkConstraintClass_autoptr)
    inline def value: Ptr[GtkConstraintClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraint.h
*/
opaque type GtkConstraintClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkConstraintClass_listautoptr: 
  given _tag: Tag[GtkConstraintClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkConstraintClass_listautoptr = o
  extension (v: GtkConstraintClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraint.h
*/
opaque type GtkConstraintClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkConstraintClass_queueautoptr: 
  given _tag: Tag[GtkConstraintClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkConstraintClass_queueautoptr = o
  extension (v: GtkConstraintClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraint.h
*/
opaque type GtkConstraintClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkConstraintClass_slistautoptr: 
  given _tag: Tag[GtkConstraintClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkConstraintClass_slistautoptr = o
  extension (v: GtkConstraintClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintguide.h
*/
opaque type GtkConstraintGuideClass_autoptr = Ptr[GtkConstraintGuideClass]
object GtkConstraintGuideClass_autoptr: 
  given _tag: Tag[GtkConstraintGuideClass_autoptr] = Tag.Ptr[GtkConstraintGuideClass](GtkConstraintGuideClass._tag)
  inline def apply(inline o: Ptr[GtkConstraintGuideClass]): GtkConstraintGuideClass_autoptr = o
  extension (v: GtkConstraintGuideClass_autoptr)
    inline def value: Ptr[GtkConstraintGuideClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintguide.h
*/
opaque type GtkConstraintGuideClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkConstraintGuideClass_listautoptr: 
  given _tag: Tag[GtkConstraintGuideClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkConstraintGuideClass_listautoptr = o
  extension (v: GtkConstraintGuideClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintguide.h
*/
opaque type GtkConstraintGuideClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkConstraintGuideClass_queueautoptr: 
  given _tag: Tag[GtkConstraintGuideClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkConstraintGuideClass_queueautoptr = o
  extension (v: GtkConstraintGuideClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintguide.h
*/
opaque type GtkConstraintGuideClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkConstraintGuideClass_slistautoptr: 
  given _tag: Tag[GtkConstraintGuideClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkConstraintGuideClass_slistautoptr = o
  extension (v: GtkConstraintGuideClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintguide.h
*/
opaque type GtkConstraintGuide_autoptr = Ptr[GtkConstraintGuide]
object GtkConstraintGuide_autoptr: 
  given _tag: Tag[GtkConstraintGuide_autoptr] = Tag.Ptr[GtkConstraintGuide](GtkConstraintGuide._tag)
  inline def apply(inline o: Ptr[GtkConstraintGuide]): GtkConstraintGuide_autoptr = o
  extension (v: GtkConstraintGuide_autoptr)
    inline def value: Ptr[GtkConstraintGuide] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintguide.h
*/
opaque type GtkConstraintGuide_listautoptr = Ptr[_root_.glib.all.GList]
object GtkConstraintGuide_listautoptr: 
  given _tag: Tag[GtkConstraintGuide_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkConstraintGuide_listautoptr = o
  extension (v: GtkConstraintGuide_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintguide.h
*/
opaque type GtkConstraintGuide_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkConstraintGuide_queueautoptr: 
  given _tag: Tag[GtkConstraintGuide_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkConstraintGuide_queueautoptr = o
  extension (v: GtkConstraintGuide_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintguide.h
*/
opaque type GtkConstraintGuide_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkConstraintGuide_slistautoptr: 
  given _tag: Tag[GtkConstraintGuide_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkConstraintGuide_slistautoptr = o
  extension (v: GtkConstraintGuide_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintlayout.h
*/
opaque type GtkConstraintLayoutChildClass_autoptr = Ptr[GtkConstraintLayoutChildClass]
object GtkConstraintLayoutChildClass_autoptr: 
  given _tag: Tag[GtkConstraintLayoutChildClass_autoptr] = Tag.Ptr[GtkConstraintLayoutChildClass](GtkConstraintLayoutChildClass._tag)
  inline def apply(inline o: Ptr[GtkConstraintLayoutChildClass]): GtkConstraintLayoutChildClass_autoptr = o
  extension (v: GtkConstraintLayoutChildClass_autoptr)
    inline def value: Ptr[GtkConstraintLayoutChildClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintlayout.h
*/
opaque type GtkConstraintLayoutChildClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkConstraintLayoutChildClass_listautoptr: 
  given _tag: Tag[GtkConstraintLayoutChildClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkConstraintLayoutChildClass_listautoptr = o
  extension (v: GtkConstraintLayoutChildClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintlayout.h
*/
opaque type GtkConstraintLayoutChildClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkConstraintLayoutChildClass_queueautoptr: 
  given _tag: Tag[GtkConstraintLayoutChildClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkConstraintLayoutChildClass_queueautoptr = o
  extension (v: GtkConstraintLayoutChildClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintlayout.h
*/
opaque type GtkConstraintLayoutChildClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkConstraintLayoutChildClass_slistautoptr: 
  given _tag: Tag[GtkConstraintLayoutChildClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkConstraintLayoutChildClass_slistautoptr = o
  extension (v: GtkConstraintLayoutChildClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintlayout.h
*/
opaque type GtkConstraintLayoutChild_autoptr = Ptr[GtkConstraintLayoutChild]
object GtkConstraintLayoutChild_autoptr: 
  given _tag: Tag[GtkConstraintLayoutChild_autoptr] = Tag.Ptr[GtkConstraintLayoutChild](GtkConstraintLayoutChild._tag)
  inline def apply(inline o: Ptr[GtkConstraintLayoutChild]): GtkConstraintLayoutChild_autoptr = o
  extension (v: GtkConstraintLayoutChild_autoptr)
    inline def value: Ptr[GtkConstraintLayoutChild] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintlayout.h
*/
opaque type GtkConstraintLayoutChild_listautoptr = Ptr[_root_.glib.all.GList]
object GtkConstraintLayoutChild_listautoptr: 
  given _tag: Tag[GtkConstraintLayoutChild_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkConstraintLayoutChild_listautoptr = o
  extension (v: GtkConstraintLayoutChild_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintlayout.h
*/
opaque type GtkConstraintLayoutChild_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkConstraintLayoutChild_queueautoptr: 
  given _tag: Tag[GtkConstraintLayoutChild_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkConstraintLayoutChild_queueautoptr = o
  extension (v: GtkConstraintLayoutChild_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintlayout.h
*/
opaque type GtkConstraintLayoutChild_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkConstraintLayoutChild_slistautoptr: 
  given _tag: Tag[GtkConstraintLayoutChild_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkConstraintLayoutChild_slistautoptr = o
  extension (v: GtkConstraintLayoutChild_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintlayout.h
*/
opaque type GtkConstraintLayoutClass_autoptr = Ptr[GtkConstraintLayoutClass]
object GtkConstraintLayoutClass_autoptr: 
  given _tag: Tag[GtkConstraintLayoutClass_autoptr] = Tag.Ptr[GtkConstraintLayoutClass](GtkConstraintLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkConstraintLayoutClass]): GtkConstraintLayoutClass_autoptr = o
  extension (v: GtkConstraintLayoutClass_autoptr)
    inline def value: Ptr[GtkConstraintLayoutClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintlayout.h
*/
opaque type GtkConstraintLayoutClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkConstraintLayoutClass_listautoptr: 
  given _tag: Tag[GtkConstraintLayoutClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkConstraintLayoutClass_listautoptr = o
  extension (v: GtkConstraintLayoutClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintlayout.h
*/
opaque type GtkConstraintLayoutClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkConstraintLayoutClass_queueautoptr: 
  given _tag: Tag[GtkConstraintLayoutClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkConstraintLayoutClass_queueautoptr = o
  extension (v: GtkConstraintLayoutClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintlayout.h
*/
opaque type GtkConstraintLayoutClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkConstraintLayoutClass_slistautoptr: 
  given _tag: Tag[GtkConstraintLayoutClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkConstraintLayoutClass_slistautoptr = o
  extension (v: GtkConstraintLayoutClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintlayout.h
*/
opaque type GtkConstraintLayout_autoptr = Ptr[GtkConstraintLayout]
object GtkConstraintLayout_autoptr: 
  given _tag: Tag[GtkConstraintLayout_autoptr] = Tag.Ptr[GtkConstraintLayout](GtkConstraintLayout._tag)
  inline def apply(inline o: Ptr[GtkConstraintLayout]): GtkConstraintLayout_autoptr = o
  extension (v: GtkConstraintLayout_autoptr)
    inline def value: Ptr[GtkConstraintLayout] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintlayout.h
*/
opaque type GtkConstraintLayout_listautoptr = Ptr[_root_.glib.all.GList]
object GtkConstraintLayout_listautoptr: 
  given _tag: Tag[GtkConstraintLayout_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkConstraintLayout_listautoptr = o
  extension (v: GtkConstraintLayout_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintlayout.h
*/
opaque type GtkConstraintLayout_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkConstraintLayout_queueautoptr: 
  given _tag: Tag[GtkConstraintLayout_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkConstraintLayout_queueautoptr = o
  extension (v: GtkConstraintLayout_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintlayout.h
*/
opaque type GtkConstraintLayout_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkConstraintLayout_slistautoptr: 
  given _tag: Tag[GtkConstraintLayout_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkConstraintLayout_slistautoptr = o
  extension (v: GtkConstraintLayout_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraint.h
*/
opaque type GtkConstraintTarget_autoptr = Ptr[GtkConstraintTarget]
object GtkConstraintTarget_autoptr: 
  given _tag: Tag[GtkConstraintTarget_autoptr] = Tag.Ptr[GtkConstraintTarget](GtkConstraintTarget._tag)
  inline def apply(inline o: Ptr[GtkConstraintTarget]): GtkConstraintTarget_autoptr = o
  extension (v: GtkConstraintTarget_autoptr)
    inline def value: Ptr[GtkConstraintTarget] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraint.h
*/
opaque type GtkConstraintTarget_listautoptr = Ptr[_root_.glib.all.GList]
object GtkConstraintTarget_listautoptr: 
  given _tag: Tag[GtkConstraintTarget_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkConstraintTarget_listautoptr = o
  extension (v: GtkConstraintTarget_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraint.h
*/
opaque type GtkConstraintTarget_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkConstraintTarget_queueautoptr: 
  given _tag: Tag[GtkConstraintTarget_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkConstraintTarget_queueautoptr = o
  extension (v: GtkConstraintTarget_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraint.h
*/
opaque type GtkConstraintTarget_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkConstraintTarget_slistautoptr: 
  given _tag: Tag[GtkConstraintTarget_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkConstraintTarget_slistautoptr = o
  extension (v: GtkConstraintTarget_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraint.h
*/
opaque type GtkConstraint_autoptr = Ptr[GtkConstraint]
object GtkConstraint_autoptr: 
  given _tag: Tag[GtkConstraint_autoptr] = Tag.Ptr[GtkConstraint](GtkConstraint._tag)
  inline def apply(inline o: Ptr[GtkConstraint]): GtkConstraint_autoptr = o
  extension (v: GtkConstraint_autoptr)
    inline def value: Ptr[GtkConstraint] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraint.h
*/
opaque type GtkConstraint_listautoptr = Ptr[_root_.glib.all.GList]
object GtkConstraint_listautoptr: 
  given _tag: Tag[GtkConstraint_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkConstraint_listautoptr = o
  extension (v: GtkConstraint_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraint.h
*/
opaque type GtkConstraint_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkConstraint_queueautoptr: 
  given _tag: Tag[GtkConstraint_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkConstraint_queueautoptr = o
  extension (v: GtkConstraint_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraint.h
*/
opaque type GtkConstraint_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkConstraint_slistautoptr: 
  given _tag: Tag[GtkConstraint_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkConstraint_slistautoptr = o
  extension (v: GtkConstraint_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCssProvider_autoptr = Ptr[GtkCssProvider]
object GtkCssProvider_autoptr: 
  given _tag: Tag[GtkCssProvider_autoptr] = Tag.Ptr[GtkCssProvider](GtkCssProvider._tag)
  inline def apply(inline o: Ptr[GtkCssProvider]): GtkCssProvider_autoptr = o
  extension (v: GtkCssProvider_autoptr)
    inline def value: Ptr[GtkCssProvider] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCssProvider_listautoptr = Ptr[_root_.glib.all.GList]
object GtkCssProvider_listautoptr: 
  given _tag: Tag[GtkCssProvider_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkCssProvider_listautoptr = o
  extension (v: GtkCssProvider_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCssProvider_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkCssProvider_queueautoptr: 
  given _tag: Tag[GtkCssProvider_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkCssProvider_queueautoptr = o
  extension (v: GtkCssProvider_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkCssProvider_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkCssProvider_slistautoptr: 
  given _tag: Tag[GtkCssProvider_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkCssProvider_slistautoptr = o
  extension (v: GtkCssProvider_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkCustomAllocateFunc: : the widget to allocate : the new width of the widget : the new height of the widget : the new baseline of the widget, or -1

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomlayout.h
*/
opaque type GtkCustomAllocateFunc = CFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit]
object GtkCustomAllocateFunc: 
  given _tag: Tag[GtkCustomAllocateFunc] = Tag.materializeCFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit]
  inline def apply(inline o: CFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit]): GtkCustomAllocateFunc = o
  extension (v: GtkCustomAllocateFunc)
    inline def value: CFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomfilter.h
*/
opaque type GtkCustomFilterClass_autoptr = Ptr[GtkCustomFilterClass]
object GtkCustomFilterClass_autoptr: 
  given _tag: Tag[GtkCustomFilterClass_autoptr] = Tag.Ptr[GtkCustomFilterClass](GtkCustomFilterClass._tag)
  inline def apply(inline o: Ptr[GtkCustomFilterClass]): GtkCustomFilterClass_autoptr = o
  extension (v: GtkCustomFilterClass_autoptr)
    inline def value: Ptr[GtkCustomFilterClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomfilter.h
*/
opaque type GtkCustomFilterClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkCustomFilterClass_listautoptr: 
  given _tag: Tag[GtkCustomFilterClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkCustomFilterClass_listautoptr = o
  extension (v: GtkCustomFilterClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomfilter.h
*/
opaque type GtkCustomFilterClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkCustomFilterClass_queueautoptr: 
  given _tag: Tag[GtkCustomFilterClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkCustomFilterClass_queueautoptr = o
  extension (v: GtkCustomFilterClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomfilter.h
*/
opaque type GtkCustomFilterClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkCustomFilterClass_slistautoptr: 
  given _tag: Tag[GtkCustomFilterClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkCustomFilterClass_slistautoptr = o
  extension (v: GtkCustomFilterClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkCustomFilterFunc: : (type GObject): The item to be matched _data: user data

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomfilter.h
*/
opaque type GtkCustomFilterFunc = CFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, _root_.glib.all.gboolean]
object GtkCustomFilterFunc: 
  given _tag: Tag[GtkCustomFilterFunc] = Tag.materializeCFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, _root_.glib.all.gboolean]
  inline def apply(inline o: CFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, _root_.glib.all.gboolean]): GtkCustomFilterFunc = o
  extension (v: GtkCustomFilterFunc)
    inline def value: CFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, _root_.glib.all.gboolean] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomfilter.h
*/
opaque type GtkCustomFilter_autoptr = Ptr[GtkCustomFilter]
object GtkCustomFilter_autoptr: 
  given _tag: Tag[GtkCustomFilter_autoptr] = Tag.Ptr[GtkCustomFilter](GtkCustomFilter._tag)
  inline def apply(inline o: Ptr[GtkCustomFilter]): GtkCustomFilter_autoptr = o
  extension (v: GtkCustomFilter_autoptr)
    inline def value: Ptr[GtkCustomFilter] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomfilter.h
*/
opaque type GtkCustomFilter_listautoptr = Ptr[_root_.glib.all.GList]
object GtkCustomFilter_listautoptr: 
  given _tag: Tag[GtkCustomFilter_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkCustomFilter_listautoptr = o
  extension (v: GtkCustomFilter_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomfilter.h
*/
opaque type GtkCustomFilter_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkCustomFilter_queueautoptr: 
  given _tag: Tag[GtkCustomFilter_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkCustomFilter_queueautoptr = o
  extension (v: GtkCustomFilter_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomfilter.h
*/
opaque type GtkCustomFilter_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkCustomFilter_slistautoptr: 
  given _tag: Tag[GtkCustomFilter_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkCustomFilter_slistautoptr = o
  extension (v: GtkCustomFilter_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomlayout.h
*/
opaque type GtkCustomLayoutClass_autoptr = Ptr[GtkCustomLayoutClass]
object GtkCustomLayoutClass_autoptr: 
  given _tag: Tag[GtkCustomLayoutClass_autoptr] = Tag.Ptr[GtkCustomLayoutClass](GtkCustomLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkCustomLayoutClass]): GtkCustomLayoutClass_autoptr = o
  extension (v: GtkCustomLayoutClass_autoptr)
    inline def value: Ptr[GtkCustomLayoutClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomlayout.h
*/
opaque type GtkCustomLayoutClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkCustomLayoutClass_listautoptr: 
  given _tag: Tag[GtkCustomLayoutClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkCustomLayoutClass_listautoptr = o
  extension (v: GtkCustomLayoutClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomlayout.h
*/
opaque type GtkCustomLayoutClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkCustomLayoutClass_queueautoptr: 
  given _tag: Tag[GtkCustomLayoutClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkCustomLayoutClass_queueautoptr = o
  extension (v: GtkCustomLayoutClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomlayout.h
*/
opaque type GtkCustomLayoutClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkCustomLayoutClass_slistautoptr: 
  given _tag: Tag[GtkCustomLayoutClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkCustomLayoutClass_slistautoptr = o
  extension (v: GtkCustomLayoutClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomlayout.h
*/
opaque type GtkCustomLayout_autoptr = Ptr[GtkCustomLayout]
object GtkCustomLayout_autoptr: 
  given _tag: Tag[GtkCustomLayout_autoptr] = Tag.Ptr[GtkCustomLayout](GtkCustomLayout._tag)
  inline def apply(inline o: Ptr[GtkCustomLayout]): GtkCustomLayout_autoptr = o
  extension (v: GtkCustomLayout_autoptr)
    inline def value: Ptr[GtkCustomLayout] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomlayout.h
*/
opaque type GtkCustomLayout_listautoptr = Ptr[_root_.glib.all.GList]
object GtkCustomLayout_listautoptr: 
  given _tag: Tag[GtkCustomLayout_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkCustomLayout_listautoptr = o
  extension (v: GtkCustomLayout_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomlayout.h
*/
opaque type GtkCustomLayout_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkCustomLayout_queueautoptr: 
  given _tag: Tag[GtkCustomLayout_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkCustomLayout_queueautoptr = o
  extension (v: GtkCustomLayout_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomlayout.h
*/
opaque type GtkCustomLayout_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkCustomLayout_slistautoptr: 
  given _tag: Tag[GtkCustomLayout_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkCustomLayout_slistautoptr = o
  extension (v: GtkCustomLayout_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkCustomMeasureFunc: : the widget to be measured : the direction to be measured _size: the size to be measured for : (out): the measured minimum size of the widget : (out): the measured natural size of the widget _baseline: (out): the measured minimum baseline of the widget _baseline: (out): the measured natural baseline of the widget

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomlayout.h
*/
opaque type GtkCustomMeasureFunc = CFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit]
object GtkCustomMeasureFunc: 
  given _tag: Tag[GtkCustomMeasureFunc] = Tag.materializeCFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit]
  inline def apply(inline o: CFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit]): GtkCustomMeasureFunc = o
  extension (v: GtkCustomMeasureFunc)
    inline def value: CFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit] = v

/**
 * GtkCustomRequestModeFunc: : the widget to be queried

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomlayout.h
*/
opaque type GtkCustomRequestModeFunc = CFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode]
object GtkCustomRequestModeFunc: 
  given _tag: Tag[GtkCustomRequestModeFunc] = Tag.materializeCFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode]
  inline def apply(inline o: CFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode]): GtkCustomRequestModeFunc = o
  extension (v: GtkCustomRequestModeFunc)
    inline def value: CFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomsorter.h
*/
opaque type GtkCustomSorterClass_autoptr = Ptr[GtkCustomSorterClass]
object GtkCustomSorterClass_autoptr: 
  given _tag: Tag[GtkCustomSorterClass_autoptr] = Tag.Ptr[GtkCustomSorterClass](GtkCustomSorterClass._tag)
  inline def apply(inline o: Ptr[GtkCustomSorterClass]): GtkCustomSorterClass_autoptr = o
  extension (v: GtkCustomSorterClass_autoptr)
    inline def value: Ptr[GtkCustomSorterClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomsorter.h
*/
opaque type GtkCustomSorterClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkCustomSorterClass_listautoptr: 
  given _tag: Tag[GtkCustomSorterClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkCustomSorterClass_listautoptr = o
  extension (v: GtkCustomSorterClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomsorter.h
*/
opaque type GtkCustomSorterClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkCustomSorterClass_queueautoptr: 
  given _tag: Tag[GtkCustomSorterClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkCustomSorterClass_queueautoptr = o
  extension (v: GtkCustomSorterClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomsorter.h
*/
opaque type GtkCustomSorterClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkCustomSorterClass_slistautoptr: 
  given _tag: Tag[GtkCustomSorterClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkCustomSorterClass_slistautoptr = o
  extension (v: GtkCustomSorterClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomsorter.h
*/
opaque type GtkCustomSorter_autoptr = Ptr[GtkCustomSorter]
object GtkCustomSorter_autoptr: 
  given _tag: Tag[GtkCustomSorter_autoptr] = Tag.Ptr[GtkCustomSorter](GtkCustomSorter._tag)
  inline def apply(inline o: Ptr[GtkCustomSorter]): GtkCustomSorter_autoptr = o
  extension (v: GtkCustomSorter_autoptr)
    inline def value: Ptr[GtkCustomSorter] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomsorter.h
*/
opaque type GtkCustomSorter_listautoptr = Ptr[_root_.glib.all.GList]
object GtkCustomSorter_listautoptr: 
  given _tag: Tag[GtkCustomSorter_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkCustomSorter_listautoptr = o
  extension (v: GtkCustomSorter_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomsorter.h
*/
opaque type GtkCustomSorter_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkCustomSorter_queueautoptr: 
  given _tag: Tag[GtkCustomSorter_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkCustomSorter_queueautoptr = o
  extension (v: GtkCustomSorter_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomsorter.h
*/
opaque type GtkCustomSorter_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkCustomSorter_slistautoptr: 
  given _tag: Tag[GtkCustomSorter_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkCustomSorter_slistautoptr = o
  extension (v: GtkCustomSorter_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdialog.h
*/
opaque type GtkDialog_autoptr = Ptr[GtkDialog]
object GtkDialog_autoptr: 
  given _tag: Tag[GtkDialog_autoptr] = Tag.Ptr[GtkDialog](GtkDialog._tag)
  inline def apply(inline o: Ptr[GtkDialog]): GtkDialog_autoptr = o
  extension (v: GtkDialog_autoptr)
    inline def value: Ptr[GtkDialog] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdialog.h
*/
opaque type GtkDialog_listautoptr = Ptr[_root_.glib.all.GList]
object GtkDialog_listautoptr: 
  given _tag: Tag[GtkDialog_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkDialog_listautoptr = o
  extension (v: GtkDialog_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdialog.h
*/
opaque type GtkDialog_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkDialog_queueautoptr: 
  given _tag: Tag[GtkDialog_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkDialog_queueautoptr = o
  extension (v: GtkDialog_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdialog.h
*/
opaque type GtkDialog_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkDialog_slistautoptr: 
  given _tag: Tag[GtkDialog_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkDialog_slistautoptr = o
  extension (v: GtkDialog_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdirectorylist.h
*/
opaque type GtkDirectoryListClass_autoptr = Ptr[GtkDirectoryListClass]
object GtkDirectoryListClass_autoptr: 
  given _tag: Tag[GtkDirectoryListClass_autoptr] = Tag.Ptr[GtkDirectoryListClass](GtkDirectoryListClass._tag)
  inline def apply(inline o: Ptr[GtkDirectoryListClass]): GtkDirectoryListClass_autoptr = o
  extension (v: GtkDirectoryListClass_autoptr)
    inline def value: Ptr[GtkDirectoryListClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdirectorylist.h
*/
opaque type GtkDirectoryListClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkDirectoryListClass_listautoptr: 
  given _tag: Tag[GtkDirectoryListClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkDirectoryListClass_listautoptr = o
  extension (v: GtkDirectoryListClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdirectorylist.h
*/
opaque type GtkDirectoryListClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkDirectoryListClass_queueautoptr: 
  given _tag: Tag[GtkDirectoryListClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkDirectoryListClass_queueautoptr = o
  extension (v: GtkDirectoryListClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdirectorylist.h
*/
opaque type GtkDirectoryListClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkDirectoryListClass_slistautoptr: 
  given _tag: Tag[GtkDirectoryListClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkDirectoryListClass_slistautoptr = o
  extension (v: GtkDirectoryListClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdirectorylist.h
*/
opaque type GtkDirectoryList_autoptr = Ptr[GtkDirectoryList]
object GtkDirectoryList_autoptr: 
  given _tag: Tag[GtkDirectoryList_autoptr] = Tag.Ptr[GtkDirectoryList](GtkDirectoryList._tag)
  inline def apply(inline o: Ptr[GtkDirectoryList]): GtkDirectoryList_autoptr = o
  extension (v: GtkDirectoryList_autoptr)
    inline def value: Ptr[GtkDirectoryList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdirectorylist.h
*/
opaque type GtkDirectoryList_listautoptr = Ptr[_root_.glib.all.GList]
object GtkDirectoryList_listautoptr: 
  given _tag: Tag[GtkDirectoryList_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkDirectoryList_listautoptr = o
  extension (v: GtkDirectoryList_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdirectorylist.h
*/
opaque type GtkDirectoryList_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkDirectoryList_queueautoptr: 
  given _tag: Tag[GtkDirectoryList_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkDirectoryList_queueautoptr = o
  extension (v: GtkDirectoryList_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdirectorylist.h
*/
opaque type GtkDirectoryList_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkDirectoryList_slistautoptr: 
  given _tag: Tag[GtkDirectoryList_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkDirectoryList_slistautoptr = o
  extension (v: GtkDirectoryList_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdragicon.h
*/
opaque type GtkDragIconClass_autoptr = Ptr[GtkDragIconClass]
object GtkDragIconClass_autoptr: 
  given _tag: Tag[GtkDragIconClass_autoptr] = Tag.Ptr[GtkDragIconClass](GtkDragIconClass._tag)
  inline def apply(inline o: Ptr[GtkDragIconClass]): GtkDragIconClass_autoptr = o
  extension (v: GtkDragIconClass_autoptr)
    inline def value: Ptr[GtkDragIconClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdragicon.h
*/
opaque type GtkDragIconClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkDragIconClass_listautoptr: 
  given _tag: Tag[GtkDragIconClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkDragIconClass_listautoptr = o
  extension (v: GtkDragIconClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdragicon.h
*/
opaque type GtkDragIconClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkDragIconClass_queueautoptr: 
  given _tag: Tag[GtkDragIconClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkDragIconClass_queueautoptr = o
  extension (v: GtkDragIconClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdragicon.h
*/
opaque type GtkDragIconClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkDragIconClass_slistautoptr: 
  given _tag: Tag[GtkDragIconClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkDragIconClass_slistautoptr = o
  extension (v: GtkDragIconClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdragicon.h
*/
opaque type GtkDragIcon_autoptr = Ptr[GtkDragIcon]
object GtkDragIcon_autoptr: 
  given _tag: Tag[GtkDragIcon_autoptr] = Tag.Ptr[GtkDragIcon](GtkDragIcon._tag)
  inline def apply(inline o: Ptr[GtkDragIcon]): GtkDragIcon_autoptr = o
  extension (v: GtkDragIcon_autoptr)
    inline def value: Ptr[GtkDragIcon] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdragicon.h
*/
opaque type GtkDragIcon_listautoptr = Ptr[_root_.glib.all.GList]
object GtkDragIcon_listautoptr: 
  given _tag: Tag[GtkDragIcon_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkDragIcon_listautoptr = o
  extension (v: GtkDragIcon_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdragicon.h
*/
opaque type GtkDragIcon_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkDragIcon_queueautoptr: 
  given _tag: Tag[GtkDragIcon_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkDragIcon_queueautoptr = o
  extension (v: GtkDragIcon_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdragicon.h
*/
opaque type GtkDragIcon_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkDragIcon_slistautoptr: 
  given _tag: Tag[GtkDragIcon_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkDragIcon_slistautoptr = o
  extension (v: GtkDragIcon_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkDrawingAreaDrawFunc: _area: the `GtkDrawingArea` to redraw : the context to draw to : the actual width of the contents. This value will be at least as wide as GtkDrawingArea:width. : the actual height of the contents. This value will be at least as wide as GtkDrawingArea:height. _data: (closure): user data

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdrawingarea.h
*/
opaque type GtkDrawingAreaDrawFunc = CFuncPtr5[Ptr[GtkDrawingArea], Ptr[_root_.cairo.all.cairo_t], CInt, CInt, _root_.glib.all.gpointer, Unit]
object GtkDrawingAreaDrawFunc: 
  given _tag: Tag[GtkDrawingAreaDrawFunc] = Tag.materializeCFuncPtr5[Ptr[GtkDrawingArea], Ptr[_root_.cairo.all.cairo_t], CInt, CInt, _root_.glib.all.gpointer, Unit]
  inline def apply(inline o: CFuncPtr5[Ptr[GtkDrawingArea], Ptr[_root_.cairo.all.cairo_t], CInt, CInt, _root_.glib.all.gpointer, Unit]): GtkDrawingAreaDrawFunc = o
  extension (v: GtkDrawingAreaDrawFunc)
    inline def value: CFuncPtr5[Ptr[GtkDrawingArea], Ptr[_root_.cairo.all.cairo_t], CInt, CInt, _root_.glib.all.gpointer, Unit] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkDrawingArea_autoptr = Ptr[GtkDrawingArea]
object GtkDrawingArea_autoptr: 
  given _tag: Tag[GtkDrawingArea_autoptr] = Tag.Ptr[GtkDrawingArea](GtkDrawingArea._tag)
  inline def apply(inline o: Ptr[GtkDrawingArea]): GtkDrawingArea_autoptr = o
  extension (v: GtkDrawingArea_autoptr)
    inline def value: Ptr[GtkDrawingArea] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkDrawingArea_listautoptr = Ptr[_root_.glib.all.GList]
object GtkDrawingArea_listautoptr: 
  given _tag: Tag[GtkDrawingArea_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkDrawingArea_listautoptr = o
  extension (v: GtkDrawingArea_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkDrawingArea_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkDrawingArea_queueautoptr: 
  given _tag: Tag[GtkDrawingArea_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkDrawingArea_queueautoptr = o
  extension (v: GtkDrawingArea_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkDrawingArea_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkDrawingArea_slistautoptr: 
  given _tag: Tag[GtkDrawingArea_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkDrawingArea_slistautoptr = o
  extension (v: GtkDrawingArea_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdropdown.h
*/
opaque type GtkDropDownClass_autoptr = Ptr[GtkDropDownClass]
object GtkDropDownClass_autoptr: 
  given _tag: Tag[GtkDropDownClass_autoptr] = Tag.Ptr[GtkDropDownClass](GtkDropDownClass._tag)
  inline def apply(inline o: Ptr[GtkDropDownClass]): GtkDropDownClass_autoptr = o
  extension (v: GtkDropDownClass_autoptr)
    inline def value: Ptr[GtkDropDownClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdropdown.h
*/
opaque type GtkDropDownClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkDropDownClass_listautoptr: 
  given _tag: Tag[GtkDropDownClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkDropDownClass_listautoptr = o
  extension (v: GtkDropDownClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdropdown.h
*/
opaque type GtkDropDownClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkDropDownClass_queueautoptr: 
  given _tag: Tag[GtkDropDownClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkDropDownClass_queueautoptr = o
  extension (v: GtkDropDownClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdropdown.h
*/
opaque type GtkDropDownClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkDropDownClass_slistautoptr: 
  given _tag: Tag[GtkDropDownClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkDropDownClass_slistautoptr = o
  extension (v: GtkDropDownClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdropdown.h
*/
opaque type GtkDropDown_autoptr = Ptr[GtkDropDown]
object GtkDropDown_autoptr: 
  given _tag: Tag[GtkDropDown_autoptr] = Tag.Ptr[GtkDropDown](GtkDropDown._tag)
  inline def apply(inline o: Ptr[GtkDropDown]): GtkDropDown_autoptr = o
  extension (v: GtkDropDown_autoptr)
    inline def value: Ptr[GtkDropDown] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdropdown.h
*/
opaque type GtkDropDown_listautoptr = Ptr[_root_.glib.all.GList]
object GtkDropDown_listautoptr: 
  given _tag: Tag[GtkDropDown_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkDropDown_listautoptr = o
  extension (v: GtkDropDown_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdropdown.h
*/
opaque type GtkDropDown_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkDropDown_queueautoptr: 
  given _tag: Tag[GtkDropDown_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkDropDown_queueautoptr = o
  extension (v: GtkDropDown_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdropdown.h
*/
opaque type GtkDropDown_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkDropDown_slistautoptr: 
  given _tag: Tag[GtkDropDown_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkDropDown_slistautoptr = o
  extension (v: GtkDropDown_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeditablelabel.h
*/
opaque type GtkEditableLabelClass_autoptr = Ptr[GtkEditableLabelClass]
object GtkEditableLabelClass_autoptr: 
  given _tag: Tag[GtkEditableLabelClass_autoptr] = Tag.Ptr[GtkEditableLabelClass](GtkEditableLabelClass._tag)
  inline def apply(inline o: Ptr[GtkEditableLabelClass]): GtkEditableLabelClass_autoptr = o
  extension (v: GtkEditableLabelClass_autoptr)
    inline def value: Ptr[GtkEditableLabelClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeditablelabel.h
*/
opaque type GtkEditableLabelClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkEditableLabelClass_listautoptr: 
  given _tag: Tag[GtkEditableLabelClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkEditableLabelClass_listautoptr = o
  extension (v: GtkEditableLabelClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeditablelabel.h
*/
opaque type GtkEditableLabelClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkEditableLabelClass_queueautoptr: 
  given _tag: Tag[GtkEditableLabelClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkEditableLabelClass_queueautoptr = o
  extension (v: GtkEditableLabelClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeditablelabel.h
*/
opaque type GtkEditableLabelClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkEditableLabelClass_slistautoptr: 
  given _tag: Tag[GtkEditableLabelClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkEditableLabelClass_slistautoptr = o
  extension (v: GtkEditableLabelClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeditablelabel.h
*/
opaque type GtkEditableLabel_autoptr = Ptr[GtkEditableLabel]
object GtkEditableLabel_autoptr: 
  given _tag: Tag[GtkEditableLabel_autoptr] = Tag.Ptr[GtkEditableLabel](GtkEditableLabel._tag)
  inline def apply(inline o: Ptr[GtkEditableLabel]): GtkEditableLabel_autoptr = o
  extension (v: GtkEditableLabel_autoptr)
    inline def value: Ptr[GtkEditableLabel] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeditablelabel.h
*/
opaque type GtkEditableLabel_listautoptr = Ptr[_root_.glib.all.GList]
object GtkEditableLabel_listautoptr: 
  given _tag: Tag[GtkEditableLabel_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkEditableLabel_listautoptr = o
  extension (v: GtkEditableLabel_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeditablelabel.h
*/
opaque type GtkEditableLabel_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkEditableLabel_queueautoptr: 
  given _tag: Tag[GtkEditableLabel_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkEditableLabel_queueautoptr = o
  extension (v: GtkEditableLabel_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeditablelabel.h
*/
opaque type GtkEditableLabel_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkEditableLabel_slistautoptr: 
  given _tag: Tag[GtkEditableLabel_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkEditableLabel_slistautoptr = o
  extension (v: GtkEditableLabel_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkEditable_autoptr = Ptr[GtkEditable]
object GtkEditable_autoptr: 
  given _tag: Tag[GtkEditable_autoptr] = Tag.Ptr[GtkEditable](GtkEditable._tag)
  inline def apply(inline o: Ptr[GtkEditable]): GtkEditable_autoptr = o
  extension (v: GtkEditable_autoptr)
    inline def value: Ptr[GtkEditable] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkEditable_listautoptr = Ptr[_root_.glib.all.GList]
object GtkEditable_listautoptr: 
  given _tag: Tag[GtkEditable_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkEditable_listautoptr = o
  extension (v: GtkEditable_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkEditable_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkEditable_queueautoptr: 
  given _tag: Tag[GtkEditable_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkEditable_queueautoptr = o
  extension (v: GtkEditable_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkEditable_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkEditable_slistautoptr: 
  given _tag: Tag[GtkEditable_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkEditable_slistautoptr = o
  extension (v: GtkEditable_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkentrybuffer.h
*/
opaque type GtkEntryBuffer_autoptr = Ptr[GtkEntryBuffer]
object GtkEntryBuffer_autoptr: 
  given _tag: Tag[GtkEntryBuffer_autoptr] = Tag.Ptr[GtkEntryBuffer](GtkEntryBuffer._tag)
  inline def apply(inline o: Ptr[GtkEntryBuffer]): GtkEntryBuffer_autoptr = o
  extension (v: GtkEntryBuffer_autoptr)
    inline def value: Ptr[GtkEntryBuffer] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkentrybuffer.h
*/
opaque type GtkEntryBuffer_listautoptr = Ptr[_root_.glib.all.GList]
object GtkEntryBuffer_listautoptr: 
  given _tag: Tag[GtkEntryBuffer_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkEntryBuffer_listautoptr = o
  extension (v: GtkEntryBuffer_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkentrybuffer.h
*/
opaque type GtkEntryBuffer_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkEntryBuffer_queueautoptr: 
  given _tag: Tag[GtkEntryBuffer_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkEntryBuffer_queueautoptr = o
  extension (v: GtkEntryBuffer_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkentrybuffer.h
*/
opaque type GtkEntryBuffer_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkEntryBuffer_slistautoptr: 
  given _tag: Tag[GtkEntryBuffer_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkEntryBuffer_slistautoptr = o
  extension (v: GtkEntryBuffer_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkEntryCompletionMatchFunc: : the `GtkEntryCompletion` : the string to match, normalized and case-folded : a `GtkTreeIter` indicating the row to match _data: user data given to gtk_entry_completion_set_match_func()

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkentrycompletion.h
*/
opaque type GtkEntryCompletionMatchFunc = CFuncPtr4[Ptr[GtkEntryCompletion], CString, Ptr[GtkTreeIter], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
object GtkEntryCompletionMatchFunc: 
  given _tag: Tag[GtkEntryCompletionMatchFunc] = Tag.materializeCFuncPtr4[Ptr[GtkEntryCompletion], CString, Ptr[GtkTreeIter], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
  inline def apply(inline o: CFuncPtr4[Ptr[GtkEntryCompletion], CString, Ptr[GtkTreeIter], _root_.glib.all.gpointer, _root_.glib.all.gboolean]): GtkEntryCompletionMatchFunc = o
  extension (v: GtkEntryCompletionMatchFunc)
    inline def value: CFuncPtr4[Ptr[GtkEntryCompletion], CString, Ptr[GtkTreeIter], _root_.glib.all.gpointer, _root_.glib.all.gboolean] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkEntryCompletion_autoptr = Ptr[GtkEntryCompletion]
object GtkEntryCompletion_autoptr: 
  given _tag: Tag[GtkEntryCompletion_autoptr] = Tag.Ptr[GtkEntryCompletion](GtkEntryCompletion._tag)
  inline def apply(inline o: Ptr[GtkEntryCompletion]): GtkEntryCompletion_autoptr = o
  extension (v: GtkEntryCompletion_autoptr)
    inline def value: Ptr[GtkEntryCompletion] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkEntryCompletion_listautoptr = Ptr[_root_.glib.all.GList]
object GtkEntryCompletion_listautoptr: 
  given _tag: Tag[GtkEntryCompletion_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkEntryCompletion_listautoptr = o
  extension (v: GtkEntryCompletion_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkEntryCompletion_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkEntryCompletion_queueautoptr: 
  given _tag: Tag[GtkEntryCompletion_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkEntryCompletion_queueautoptr = o
  extension (v: GtkEntryCompletion_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkEntryCompletion_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkEntryCompletion_slistautoptr: 
  given _tag: Tag[GtkEntryCompletion_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkEntryCompletion_slistautoptr = o
  extension (v: GtkEntryCompletion_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkEntry_autoptr = Ptr[GtkEntry]
object GtkEntry_autoptr: 
  given _tag: Tag[GtkEntry_autoptr] = Tag.Ptr[GtkEntry](GtkEntry._tag)
  inline def apply(inline o: Ptr[GtkEntry]): GtkEntry_autoptr = o
  extension (v: GtkEntry_autoptr)
    inline def value: Ptr[GtkEntry] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkEntry_listautoptr = Ptr[_root_.glib.all.GList]
object GtkEntry_listautoptr: 
  given _tag: Tag[GtkEntry_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkEntry_listautoptr = o
  extension (v: GtkEntry_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkEntry_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkEntry_queueautoptr: 
  given _tag: Tag[GtkEntry_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkEntry_queueautoptr = o
  extension (v: GtkEntry_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkEntry_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkEntry_slistautoptr: 
  given _tag: Tag[GtkEntry_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkEntry_slistautoptr = o
  extension (v: GtkEntry_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkEventController_autoptr = Ptr[GtkEventController]
object GtkEventController_autoptr: 
  given _tag: Tag[GtkEventController_autoptr] = Tag.Ptr[GtkEventController](GtkEventController._tag)
  inline def apply(inline o: Ptr[GtkEventController]): GtkEventController_autoptr = o
  extension (v: GtkEventController_autoptr)
    inline def value: Ptr[GtkEventController] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkEventController_listautoptr = Ptr[_root_.glib.all.GList]
object GtkEventController_listautoptr: 
  given _tag: Tag[GtkEventController_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkEventController_listautoptr = o
  extension (v: GtkEventController_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkEventController_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkEventController_queueautoptr: 
  given _tag: Tag[GtkEventController_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkEventController_queueautoptr = o
  extension (v: GtkEventController_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkEventController_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkEventController_slistautoptr: 
  given _tag: Tag[GtkEventController_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkEventController_slistautoptr = o
  extension (v: GtkEventController_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type GtkEveryFilterClass_autoptr = Ptr[GtkEveryFilterClass]
object GtkEveryFilterClass_autoptr: 
  given _tag: Tag[GtkEveryFilterClass_autoptr] = Tag.Ptr[GtkEveryFilterClass](GtkEveryFilterClass._tag)
  inline def apply(inline o: Ptr[GtkEveryFilterClass]): GtkEveryFilterClass_autoptr = o
  extension (v: GtkEveryFilterClass_autoptr)
    inline def value: Ptr[GtkEveryFilterClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type GtkEveryFilterClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkEveryFilterClass_listautoptr: 
  given _tag: Tag[GtkEveryFilterClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkEveryFilterClass_listautoptr = o
  extension (v: GtkEveryFilterClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type GtkEveryFilterClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkEveryFilterClass_queueautoptr: 
  given _tag: Tag[GtkEveryFilterClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkEveryFilterClass_queueautoptr = o
  extension (v: GtkEveryFilterClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type GtkEveryFilterClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkEveryFilterClass_slistautoptr: 
  given _tag: Tag[GtkEveryFilterClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkEveryFilterClass_slistautoptr = o
  extension (v: GtkEveryFilterClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type GtkEveryFilter_autoptr = Ptr[GtkEveryFilter]
object GtkEveryFilter_autoptr: 
  given _tag: Tag[GtkEveryFilter_autoptr] = Tag.Ptr[GtkEveryFilter](GtkEveryFilter._tag)
  inline def apply(inline o: Ptr[GtkEveryFilter]): GtkEveryFilter_autoptr = o
  extension (v: GtkEveryFilter_autoptr)
    inline def value: Ptr[GtkEveryFilter] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type GtkEveryFilter_listautoptr = Ptr[_root_.glib.all.GList]
object GtkEveryFilter_listautoptr: 
  given _tag: Tag[GtkEveryFilter_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkEveryFilter_listautoptr = o
  extension (v: GtkEveryFilter_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type GtkEveryFilter_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkEveryFilter_queueautoptr: 
  given _tag: Tag[GtkEveryFilter_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkEveryFilter_queueautoptr = o
  extension (v: GtkEveryFilter_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type GtkEveryFilter_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkEveryFilter_slistautoptr: 
  given _tag: Tag[GtkEveryFilter_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkEveryFilter_slistautoptr = o
  extension (v: GtkEveryFilter_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkExpander_autoptr = Ptr[GtkExpander]
object GtkExpander_autoptr: 
  given _tag: Tag[GtkExpander_autoptr] = Tag.Ptr[GtkExpander](GtkExpander._tag)
  inline def apply(inline o: Ptr[GtkExpander]): GtkExpander_autoptr = o
  extension (v: GtkExpander_autoptr)
    inline def value: Ptr[GtkExpander] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkExpander_listautoptr = Ptr[_root_.glib.all.GList]
object GtkExpander_listautoptr: 
  given _tag: Tag[GtkExpander_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkExpander_listautoptr = o
  extension (v: GtkExpander_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkExpander_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkExpander_queueautoptr: 
  given _tag: Tag[GtkExpander_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkExpander_queueautoptr = o
  extension (v: GtkExpander_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkExpander_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkExpander_slistautoptr: 
  given _tag: Tag[GtkExpander_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkExpander_slistautoptr = o
  extension (v: GtkExpander_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkExpressionNotify: _data: data passed to gtk_expression_watch()

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkexpression.h
*/
opaque type GtkExpressionNotify = CFuncPtr1[_root_.glib.all.gpointer, Unit]
object GtkExpressionNotify: 
  given _tag: Tag[GtkExpressionNotify] = Tag.materializeCFuncPtr1[_root_.glib.all.gpointer, Unit]
  inline def apply(inline o: CFuncPtr1[_root_.glib.all.gpointer, Unit]): GtkExpressionNotify = o
  extension (v: GtkExpressionNotify)
    inline def value: CFuncPtr1[_root_.glib.all.gpointer, Unit] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkexpression.h
*/
opaque type GtkExpression_autoptr = Ptr[GtkExpression]
object GtkExpression_autoptr: 
  given _tag: Tag[GtkExpression_autoptr] = Tag.Ptr[GtkExpression](GtkExpression._tag)
  inline def apply(inline o: Ptr[GtkExpression]): GtkExpression_autoptr = o
  extension (v: GtkExpression_autoptr)
    inline def value: Ptr[GtkExpression] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkexpression.h
*/
opaque type GtkExpression_listautoptr = Ptr[_root_.glib.all.GList]
object GtkExpression_listautoptr: 
  given _tag: Tag[GtkExpression_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkExpression_listautoptr = o
  extension (v: GtkExpression_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkexpression.h
*/
opaque type GtkExpression_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkExpression_queueautoptr: 
  given _tag: Tag[GtkExpression_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkExpression_queueautoptr = o
  extension (v: GtkExpression_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkexpression.h
*/
opaque type GtkExpression_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkExpression_slistautoptr: 
  given _tag: Tag[GtkExpression_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkExpression_slistautoptr = o
  extension (v: GtkExpression_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFileChooserDialog_autoptr = Ptr[GtkFileChooserDialog]
object GtkFileChooserDialog_autoptr: 
  given _tag: Tag[GtkFileChooserDialog_autoptr] = Tag.Ptr[GtkFileChooserDialog](GtkFileChooserDialog._tag)
  inline def apply(inline o: Ptr[GtkFileChooserDialog]): GtkFileChooserDialog_autoptr = o
  extension (v: GtkFileChooserDialog_autoptr)
    inline def value: Ptr[GtkFileChooserDialog] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFileChooserDialog_listautoptr = Ptr[_root_.glib.all.GList]
object GtkFileChooserDialog_listautoptr: 
  given _tag: Tag[GtkFileChooserDialog_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkFileChooserDialog_listautoptr = o
  extension (v: GtkFileChooserDialog_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFileChooserDialog_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkFileChooserDialog_queueautoptr: 
  given _tag: Tag[GtkFileChooserDialog_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkFileChooserDialog_queueautoptr = o
  extension (v: GtkFileChooserDialog_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFileChooserDialog_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkFileChooserDialog_slistautoptr: 
  given _tag: Tag[GtkFileChooserDialog_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkFileChooserDialog_slistautoptr = o
  extension (v: GtkFileChooserDialog_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilechoosernative.h
*/
opaque type GtkFileChooserNativeClass_autoptr = Ptr[GtkFileChooserNativeClass]
object GtkFileChooserNativeClass_autoptr: 
  given _tag: Tag[GtkFileChooserNativeClass_autoptr] = Tag.Ptr[GtkFileChooserNativeClass](GtkFileChooserNativeClass._tag)
  inline def apply(inline o: Ptr[GtkFileChooserNativeClass]): GtkFileChooserNativeClass_autoptr = o
  extension (v: GtkFileChooserNativeClass_autoptr)
    inline def value: Ptr[GtkFileChooserNativeClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilechoosernative.h
*/
opaque type GtkFileChooserNativeClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkFileChooserNativeClass_listautoptr: 
  given _tag: Tag[GtkFileChooserNativeClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkFileChooserNativeClass_listautoptr = o
  extension (v: GtkFileChooserNativeClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilechoosernative.h
*/
opaque type GtkFileChooserNativeClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkFileChooserNativeClass_queueautoptr: 
  given _tag: Tag[GtkFileChooserNativeClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkFileChooserNativeClass_queueautoptr = o
  extension (v: GtkFileChooserNativeClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilechoosernative.h
*/
opaque type GtkFileChooserNativeClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkFileChooserNativeClass_slistautoptr: 
  given _tag: Tag[GtkFileChooserNativeClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkFileChooserNativeClass_slistautoptr = o
  extension (v: GtkFileChooserNativeClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilechoosernative.h
*/
opaque type GtkFileChooserNative_autoptr = Ptr[GtkFileChooserNative]
object GtkFileChooserNative_autoptr: 
  given _tag: Tag[GtkFileChooserNative_autoptr] = Tag.Ptr[GtkFileChooserNative](GtkFileChooserNative._tag)
  inline def apply(inline o: Ptr[GtkFileChooserNative]): GtkFileChooserNative_autoptr = o
  extension (v: GtkFileChooserNative_autoptr)
    inline def value: Ptr[GtkFileChooserNative] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilechoosernative.h
*/
opaque type GtkFileChooserNative_listautoptr = Ptr[_root_.glib.all.GList]
object GtkFileChooserNative_listautoptr: 
  given _tag: Tag[GtkFileChooserNative_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkFileChooserNative_listautoptr = o
  extension (v: GtkFileChooserNative_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilechoosernative.h
*/
opaque type GtkFileChooserNative_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkFileChooserNative_queueautoptr: 
  given _tag: Tag[GtkFileChooserNative_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkFileChooserNative_queueautoptr = o
  extension (v: GtkFileChooserNative_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilechoosernative.h
*/
opaque type GtkFileChooserNative_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkFileChooserNative_slistautoptr: 
  given _tag: Tag[GtkFileChooserNative_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkFileChooserNative_slistautoptr = o
  extension (v: GtkFileChooserNative_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFileChooserWidget_autoptr = Ptr[GtkFileChooserWidget]
object GtkFileChooserWidget_autoptr: 
  given _tag: Tag[GtkFileChooserWidget_autoptr] = Tag.Ptr[GtkFileChooserWidget](GtkFileChooserWidget._tag)
  inline def apply(inline o: Ptr[GtkFileChooserWidget]): GtkFileChooserWidget_autoptr = o
  extension (v: GtkFileChooserWidget_autoptr)
    inline def value: Ptr[GtkFileChooserWidget] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFileChooserWidget_listautoptr = Ptr[_root_.glib.all.GList]
object GtkFileChooserWidget_listautoptr: 
  given _tag: Tag[GtkFileChooserWidget_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkFileChooserWidget_listautoptr = o
  extension (v: GtkFileChooserWidget_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFileChooserWidget_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkFileChooserWidget_queueautoptr: 
  given _tag: Tag[GtkFileChooserWidget_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkFileChooserWidget_queueautoptr = o
  extension (v: GtkFileChooserWidget_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFileChooserWidget_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkFileChooserWidget_slistautoptr: 
  given _tag: Tag[GtkFileChooserWidget_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkFileChooserWidget_slistautoptr = o
  extension (v: GtkFileChooserWidget_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFileFilter_autoptr = Ptr[GtkFileFilter]
object GtkFileFilter_autoptr: 
  given _tag: Tag[GtkFileFilter_autoptr] = Tag.Ptr[GtkFileFilter](GtkFileFilter._tag)
  inline def apply(inline o: Ptr[GtkFileFilter]): GtkFileFilter_autoptr = o
  extension (v: GtkFileFilter_autoptr)
    inline def value: Ptr[GtkFileFilter] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFileFilter_listautoptr = Ptr[_root_.glib.all.GList]
object GtkFileFilter_listautoptr: 
  given _tag: Tag[GtkFileFilter_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkFileFilter_listautoptr = o
  extension (v: GtkFileFilter_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFileFilter_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkFileFilter_queueautoptr: 
  given _tag: Tag[GtkFileFilter_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkFileFilter_queueautoptr = o
  extension (v: GtkFileFilter_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFileFilter_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkFileFilter_slistautoptr: 
  given _tag: Tag[GtkFileFilter_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkFileFilter_slistautoptr = o
  extension (v: GtkFileFilter_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilter.h
*/
opaque type GtkFilterClass_autoptr = Ptr[GtkFilterClass]
object GtkFilterClass_autoptr: 
  given _tag: Tag[GtkFilterClass_autoptr] = Tag.Ptr[GtkFilterClass](GtkFilterClass._tag)
  inline def apply(inline o: Ptr[GtkFilterClass]): GtkFilterClass_autoptr = o
  extension (v: GtkFilterClass_autoptr)
    inline def value: Ptr[GtkFilterClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilter.h
*/
opaque type GtkFilterClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkFilterClass_listautoptr: 
  given _tag: Tag[GtkFilterClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkFilterClass_listautoptr = o
  extension (v: GtkFilterClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilter.h
*/
opaque type GtkFilterClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkFilterClass_queueautoptr: 
  given _tag: Tag[GtkFilterClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkFilterClass_queueautoptr = o
  extension (v: GtkFilterClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilter.h
*/
opaque type GtkFilterClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkFilterClass_slistautoptr: 
  given _tag: Tag[GtkFilterClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkFilterClass_slistautoptr = o
  extension (v: GtkFilterClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilterlistmodel.h
*/
opaque type GtkFilterListModelClass_autoptr = Ptr[GtkFilterListModelClass]
object GtkFilterListModelClass_autoptr: 
  given _tag: Tag[GtkFilterListModelClass_autoptr] = Tag.Ptr[GtkFilterListModelClass](GtkFilterListModelClass._tag)
  inline def apply(inline o: Ptr[GtkFilterListModelClass]): GtkFilterListModelClass_autoptr = o
  extension (v: GtkFilterListModelClass_autoptr)
    inline def value: Ptr[GtkFilterListModelClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilterlistmodel.h
*/
opaque type GtkFilterListModelClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkFilterListModelClass_listautoptr: 
  given _tag: Tag[GtkFilterListModelClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkFilterListModelClass_listautoptr = o
  extension (v: GtkFilterListModelClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilterlistmodel.h
*/
opaque type GtkFilterListModelClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkFilterListModelClass_queueautoptr: 
  given _tag: Tag[GtkFilterListModelClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkFilterListModelClass_queueautoptr = o
  extension (v: GtkFilterListModelClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilterlistmodel.h
*/
opaque type GtkFilterListModelClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkFilterListModelClass_slistautoptr: 
  given _tag: Tag[GtkFilterListModelClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkFilterListModelClass_slistautoptr = o
  extension (v: GtkFilterListModelClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilterlistmodel.h
*/
opaque type GtkFilterListModel_autoptr = Ptr[GtkFilterListModel]
object GtkFilterListModel_autoptr: 
  given _tag: Tag[GtkFilterListModel_autoptr] = Tag.Ptr[GtkFilterListModel](GtkFilterListModel._tag)
  inline def apply(inline o: Ptr[GtkFilterListModel]): GtkFilterListModel_autoptr = o
  extension (v: GtkFilterListModel_autoptr)
    inline def value: Ptr[GtkFilterListModel] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilterlistmodel.h
*/
opaque type GtkFilterListModel_listautoptr = Ptr[_root_.glib.all.GList]
object GtkFilterListModel_listautoptr: 
  given _tag: Tag[GtkFilterListModel_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkFilterListModel_listautoptr = o
  extension (v: GtkFilterListModel_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilterlistmodel.h
*/
opaque type GtkFilterListModel_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkFilterListModel_queueautoptr: 
  given _tag: Tag[GtkFilterListModel_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkFilterListModel_queueautoptr = o
  extension (v: GtkFilterListModel_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilterlistmodel.h
*/
opaque type GtkFilterListModel_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkFilterListModel_slistautoptr: 
  given _tag: Tag[GtkFilterListModel_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkFilterListModel_slistautoptr = o
  extension (v: GtkFilterListModel_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilter.h
*/
opaque type GtkFilter_autoptr = Ptr[GtkFilter]
object GtkFilter_autoptr: 
  given _tag: Tag[GtkFilter_autoptr] = Tag.Ptr[GtkFilter](GtkFilter._tag)
  inline def apply(inline o: Ptr[GtkFilter]): GtkFilter_autoptr = o
  extension (v: GtkFilter_autoptr)
    inline def value: Ptr[GtkFilter] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilter.h
*/
opaque type GtkFilter_listautoptr = Ptr[_root_.glib.all.GList]
object GtkFilter_listautoptr: 
  given _tag: Tag[GtkFilter_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkFilter_listautoptr = o
  extension (v: GtkFilter_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilter.h
*/
opaque type GtkFilter_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkFilter_queueautoptr: 
  given _tag: Tag[GtkFilter_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkFilter_queueautoptr = o
  extension (v: GtkFilter_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilter.h
*/
opaque type GtkFilter_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkFilter_slistautoptr: 
  given _tag: Tag[GtkFilter_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkFilter_slistautoptr = o
  extension (v: GtkFilter_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfixedlayout.h
*/
opaque type GtkFixedLayoutChildClass_autoptr = Ptr[GtkFixedLayoutChildClass]
object GtkFixedLayoutChildClass_autoptr: 
  given _tag: Tag[GtkFixedLayoutChildClass_autoptr] = Tag.Ptr[GtkFixedLayoutChildClass](GtkFixedLayoutChildClass._tag)
  inline def apply(inline o: Ptr[GtkFixedLayoutChildClass]): GtkFixedLayoutChildClass_autoptr = o
  extension (v: GtkFixedLayoutChildClass_autoptr)
    inline def value: Ptr[GtkFixedLayoutChildClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfixedlayout.h
*/
opaque type GtkFixedLayoutChildClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkFixedLayoutChildClass_listautoptr: 
  given _tag: Tag[GtkFixedLayoutChildClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkFixedLayoutChildClass_listautoptr = o
  extension (v: GtkFixedLayoutChildClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfixedlayout.h
*/
opaque type GtkFixedLayoutChildClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkFixedLayoutChildClass_queueautoptr: 
  given _tag: Tag[GtkFixedLayoutChildClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkFixedLayoutChildClass_queueautoptr = o
  extension (v: GtkFixedLayoutChildClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfixedlayout.h
*/
opaque type GtkFixedLayoutChildClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkFixedLayoutChildClass_slistautoptr: 
  given _tag: Tag[GtkFixedLayoutChildClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkFixedLayoutChildClass_slistautoptr = o
  extension (v: GtkFixedLayoutChildClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfixedlayout.h
*/
opaque type GtkFixedLayoutChild_autoptr = Ptr[GtkFixedLayoutChild]
object GtkFixedLayoutChild_autoptr: 
  given _tag: Tag[GtkFixedLayoutChild_autoptr] = Tag.Ptr[GtkFixedLayoutChild](GtkFixedLayoutChild._tag)
  inline def apply(inline o: Ptr[GtkFixedLayoutChild]): GtkFixedLayoutChild_autoptr = o
  extension (v: GtkFixedLayoutChild_autoptr)
    inline def value: Ptr[GtkFixedLayoutChild] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfixedlayout.h
*/
opaque type GtkFixedLayoutChild_listautoptr = Ptr[_root_.glib.all.GList]
object GtkFixedLayoutChild_listautoptr: 
  given _tag: Tag[GtkFixedLayoutChild_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkFixedLayoutChild_listautoptr = o
  extension (v: GtkFixedLayoutChild_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfixedlayout.h
*/
opaque type GtkFixedLayoutChild_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkFixedLayoutChild_queueautoptr: 
  given _tag: Tag[GtkFixedLayoutChild_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkFixedLayoutChild_queueautoptr = o
  extension (v: GtkFixedLayoutChild_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfixedlayout.h
*/
opaque type GtkFixedLayoutChild_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkFixedLayoutChild_slistautoptr: 
  given _tag: Tag[GtkFixedLayoutChild_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkFixedLayoutChild_slistautoptr = o
  extension (v: GtkFixedLayoutChild_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfixedlayout.h
*/
opaque type GtkFixedLayoutClass_autoptr = Ptr[GtkFixedLayoutClass]
object GtkFixedLayoutClass_autoptr: 
  given _tag: Tag[GtkFixedLayoutClass_autoptr] = Tag.Ptr[GtkFixedLayoutClass](GtkFixedLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkFixedLayoutClass]): GtkFixedLayoutClass_autoptr = o
  extension (v: GtkFixedLayoutClass_autoptr)
    inline def value: Ptr[GtkFixedLayoutClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfixedlayout.h
*/
opaque type GtkFixedLayoutClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkFixedLayoutClass_listautoptr: 
  given _tag: Tag[GtkFixedLayoutClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkFixedLayoutClass_listautoptr = o
  extension (v: GtkFixedLayoutClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfixedlayout.h
*/
opaque type GtkFixedLayoutClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkFixedLayoutClass_queueautoptr: 
  given _tag: Tag[GtkFixedLayoutClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkFixedLayoutClass_queueautoptr = o
  extension (v: GtkFixedLayoutClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfixedlayout.h
*/
opaque type GtkFixedLayoutClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkFixedLayoutClass_slistautoptr: 
  given _tag: Tag[GtkFixedLayoutClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkFixedLayoutClass_slistautoptr = o
  extension (v: GtkFixedLayoutClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfixedlayout.h
*/
opaque type GtkFixedLayout_autoptr = Ptr[GtkFixedLayout]
object GtkFixedLayout_autoptr: 
  given _tag: Tag[GtkFixedLayout_autoptr] = Tag.Ptr[GtkFixedLayout](GtkFixedLayout._tag)
  inline def apply(inline o: Ptr[GtkFixedLayout]): GtkFixedLayout_autoptr = o
  extension (v: GtkFixedLayout_autoptr)
    inline def value: Ptr[GtkFixedLayout] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfixedlayout.h
*/
opaque type GtkFixedLayout_listautoptr = Ptr[_root_.glib.all.GList]
object GtkFixedLayout_listautoptr: 
  given _tag: Tag[GtkFixedLayout_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkFixedLayout_listautoptr = o
  extension (v: GtkFixedLayout_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfixedlayout.h
*/
opaque type GtkFixedLayout_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkFixedLayout_queueautoptr: 
  given _tag: Tag[GtkFixedLayout_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkFixedLayout_queueautoptr = o
  extension (v: GtkFixedLayout_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfixedlayout.h
*/
opaque type GtkFixedLayout_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkFixedLayout_slistautoptr: 
  given _tag: Tag[GtkFixedLayout_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkFixedLayout_slistautoptr = o
  extension (v: GtkFixedLayout_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFixed_autoptr = Ptr[GtkFixed]
object GtkFixed_autoptr: 
  given _tag: Tag[GtkFixed_autoptr] = Tag.Ptr[GtkFixed](GtkFixed._tag)
  inline def apply(inline o: Ptr[GtkFixed]): GtkFixed_autoptr = o
  extension (v: GtkFixed_autoptr)
    inline def value: Ptr[GtkFixed] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFixed_listautoptr = Ptr[_root_.glib.all.GList]
object GtkFixed_listautoptr: 
  given _tag: Tag[GtkFixed_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkFixed_listautoptr = o
  extension (v: GtkFixed_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFixed_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkFixed_queueautoptr: 
  given _tag: Tag[GtkFixed_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkFixed_queueautoptr = o
  extension (v: GtkFixed_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFixed_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkFixed_slistautoptr: 
  given _tag: Tag[GtkFixed_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkFixed_slistautoptr = o
  extension (v: GtkFixed_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkflattenlistmodel.h
*/
opaque type GtkFlattenListModelClass_autoptr = Ptr[GtkFlattenListModelClass]
object GtkFlattenListModelClass_autoptr: 
  given _tag: Tag[GtkFlattenListModelClass_autoptr] = Tag.Ptr[GtkFlattenListModelClass](GtkFlattenListModelClass._tag)
  inline def apply(inline o: Ptr[GtkFlattenListModelClass]): GtkFlattenListModelClass_autoptr = o
  extension (v: GtkFlattenListModelClass_autoptr)
    inline def value: Ptr[GtkFlattenListModelClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkflattenlistmodel.h
*/
opaque type GtkFlattenListModelClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkFlattenListModelClass_listautoptr: 
  given _tag: Tag[GtkFlattenListModelClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkFlattenListModelClass_listautoptr = o
  extension (v: GtkFlattenListModelClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkflattenlistmodel.h
*/
opaque type GtkFlattenListModelClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkFlattenListModelClass_queueautoptr: 
  given _tag: Tag[GtkFlattenListModelClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkFlattenListModelClass_queueautoptr = o
  extension (v: GtkFlattenListModelClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkflattenlistmodel.h
*/
opaque type GtkFlattenListModelClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkFlattenListModelClass_slistautoptr: 
  given _tag: Tag[GtkFlattenListModelClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkFlattenListModelClass_slistautoptr = o
  extension (v: GtkFlattenListModelClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkflattenlistmodel.h
*/
opaque type GtkFlattenListModel_autoptr = Ptr[GtkFlattenListModel]
object GtkFlattenListModel_autoptr: 
  given _tag: Tag[GtkFlattenListModel_autoptr] = Tag.Ptr[GtkFlattenListModel](GtkFlattenListModel._tag)
  inline def apply(inline o: Ptr[GtkFlattenListModel]): GtkFlattenListModel_autoptr = o
  extension (v: GtkFlattenListModel_autoptr)
    inline def value: Ptr[GtkFlattenListModel] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkflattenlistmodel.h
*/
opaque type GtkFlattenListModel_listautoptr = Ptr[_root_.glib.all.GList]
object GtkFlattenListModel_listautoptr: 
  given _tag: Tag[GtkFlattenListModel_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkFlattenListModel_listautoptr = o
  extension (v: GtkFlattenListModel_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkflattenlistmodel.h
*/
opaque type GtkFlattenListModel_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkFlattenListModel_queueautoptr: 
  given _tag: Tag[GtkFlattenListModel_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkFlattenListModel_queueautoptr = o
  extension (v: GtkFlattenListModel_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkflattenlistmodel.h
*/
opaque type GtkFlattenListModel_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkFlattenListModel_slistautoptr: 
  given _tag: Tag[GtkFlattenListModel_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkFlattenListModel_slistautoptr = o
  extension (v: GtkFlattenListModel_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFlowBoxChild_autoptr = Ptr[GtkFlowBoxChild]
object GtkFlowBoxChild_autoptr: 
  given _tag: Tag[GtkFlowBoxChild_autoptr] = Tag.Ptr[GtkFlowBoxChild](GtkFlowBoxChild._tag)
  inline def apply(inline o: Ptr[GtkFlowBoxChild]): GtkFlowBoxChild_autoptr = o
  extension (v: GtkFlowBoxChild_autoptr)
    inline def value: Ptr[GtkFlowBoxChild] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFlowBoxChild_listautoptr = Ptr[_root_.glib.all.GList]
object GtkFlowBoxChild_listautoptr: 
  given _tag: Tag[GtkFlowBoxChild_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkFlowBoxChild_listautoptr = o
  extension (v: GtkFlowBoxChild_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFlowBoxChild_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkFlowBoxChild_queueautoptr: 
  given _tag: Tag[GtkFlowBoxChild_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkFlowBoxChild_queueautoptr = o
  extension (v: GtkFlowBoxChild_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFlowBoxChild_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkFlowBoxChild_slistautoptr: 
  given _tag: Tag[GtkFlowBoxChild_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkFlowBoxChild_slistautoptr = o
  extension (v: GtkFlowBoxChild_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkFlowBoxCreateWidgetFunc: : (type GObject): the item from the model for which to create a widget for _data: (closure): user data from gtk_flow_box_bind_model()

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkflowbox.h
*/
opaque type GtkFlowBoxCreateWidgetFunc = CFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Ptr[GtkWidget]]
object GtkFlowBoxCreateWidgetFunc: 
  given _tag: Tag[GtkFlowBoxCreateWidgetFunc] = Tag.materializeCFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Ptr[GtkWidget]]
  inline def apply(inline o: CFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Ptr[GtkWidget]]): GtkFlowBoxCreateWidgetFunc = o
  extension (v: GtkFlowBoxCreateWidgetFunc)
    inline def value: CFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Ptr[GtkWidget]] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkflowbox.h
*/
opaque type GtkFlowBoxFilterFunc = CFuncPtr2[Ptr[GtkFlowBoxChild], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
object GtkFlowBoxFilterFunc: 
  given _tag: Tag[GtkFlowBoxFilterFunc] = Tag.materializeCFuncPtr2[Ptr[GtkFlowBoxChild], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
  inline def apply(inline o: CFuncPtr2[Ptr[GtkFlowBoxChild], _root_.glib.all.gpointer, _root_.glib.all.gboolean]): GtkFlowBoxFilterFunc = o
  extension (v: GtkFlowBoxFilterFunc)
    inline def value: CFuncPtr2[Ptr[GtkFlowBoxChild], _root_.glib.all.gpointer, _root_.glib.all.gboolean] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkflowbox.h
*/
opaque type GtkFlowBoxForeachFunc = CFuncPtr3[Ptr[GtkFlowBox], Ptr[GtkFlowBoxChild], _root_.glib.all.gpointer, Unit]
object GtkFlowBoxForeachFunc: 
  given _tag: Tag[GtkFlowBoxForeachFunc] = Tag.materializeCFuncPtr3[Ptr[GtkFlowBox], Ptr[GtkFlowBoxChild], _root_.glib.all.gpointer, Unit]
  inline def apply(inline o: CFuncPtr3[Ptr[GtkFlowBox], Ptr[GtkFlowBoxChild], _root_.glib.all.gpointer, Unit]): GtkFlowBoxForeachFunc = o
  extension (v: GtkFlowBoxForeachFunc)
    inline def value: CFuncPtr3[Ptr[GtkFlowBox], Ptr[GtkFlowBoxChild], _root_.glib.all.gpointer, Unit] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkflowbox.h
*/
opaque type GtkFlowBoxSortFunc = CFuncPtr3[Ptr[GtkFlowBoxChild], Ptr[GtkFlowBoxChild], _root_.glib.all.gpointer, CInt]
object GtkFlowBoxSortFunc: 
  given _tag: Tag[GtkFlowBoxSortFunc] = Tag.materializeCFuncPtr3[Ptr[GtkFlowBoxChild], Ptr[GtkFlowBoxChild], _root_.glib.all.gpointer, CInt]
  inline def apply(inline o: CFuncPtr3[Ptr[GtkFlowBoxChild], Ptr[GtkFlowBoxChild], _root_.glib.all.gpointer, CInt]): GtkFlowBoxSortFunc = o
  extension (v: GtkFlowBoxSortFunc)
    inline def value: CFuncPtr3[Ptr[GtkFlowBoxChild], Ptr[GtkFlowBoxChild], _root_.glib.all.gpointer, CInt] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFlowBox_autoptr = Ptr[GtkFlowBox]
object GtkFlowBox_autoptr: 
  given _tag: Tag[GtkFlowBox_autoptr] = Tag.Ptr[GtkFlowBox](GtkFlowBox._tag)
  inline def apply(inline o: Ptr[GtkFlowBox]): GtkFlowBox_autoptr = o
  extension (v: GtkFlowBox_autoptr)
    inline def value: Ptr[GtkFlowBox] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFlowBox_listautoptr = Ptr[_root_.glib.all.GList]
object GtkFlowBox_listautoptr: 
  given _tag: Tag[GtkFlowBox_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkFlowBox_listautoptr = o
  extension (v: GtkFlowBox_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFlowBox_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkFlowBox_queueautoptr: 
  given _tag: Tag[GtkFlowBox_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkFlowBox_queueautoptr = o
  extension (v: GtkFlowBox_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFlowBox_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkFlowBox_slistautoptr: 
  given _tag: Tag[GtkFlowBox_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkFlowBox_slistautoptr = o
  extension (v: GtkFlowBox_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFontButton_autoptr = Ptr[GtkFontButton]
object GtkFontButton_autoptr: 
  given _tag: Tag[GtkFontButton_autoptr] = Tag.Ptr[GtkFontButton](GtkFontButton._tag)
  inline def apply(inline o: Ptr[GtkFontButton]): GtkFontButton_autoptr = o
  extension (v: GtkFontButton_autoptr)
    inline def value: Ptr[GtkFontButton] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFontButton_listautoptr = Ptr[_root_.glib.all.GList]
object GtkFontButton_listautoptr: 
  given _tag: Tag[GtkFontButton_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkFontButton_listautoptr = o
  extension (v: GtkFontButton_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFontButton_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkFontButton_queueautoptr: 
  given _tag: Tag[GtkFontButton_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkFontButton_queueautoptr = o
  extension (v: GtkFontButton_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFontButton_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkFontButton_slistautoptr: 
  given _tag: Tag[GtkFontButton_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkFontButton_slistautoptr = o
  extension (v: GtkFontButton_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFontChooserDialog_autoptr = Ptr[GtkFontChooserDialog]
object GtkFontChooserDialog_autoptr: 
  given _tag: Tag[GtkFontChooserDialog_autoptr] = Tag.Ptr[GtkFontChooserDialog](GtkFontChooserDialog._tag)
  inline def apply(inline o: Ptr[GtkFontChooserDialog]): GtkFontChooserDialog_autoptr = o
  extension (v: GtkFontChooserDialog_autoptr)
    inline def value: Ptr[GtkFontChooserDialog] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFontChooserDialog_listautoptr = Ptr[_root_.glib.all.GList]
object GtkFontChooserDialog_listautoptr: 
  given _tag: Tag[GtkFontChooserDialog_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkFontChooserDialog_listautoptr = o
  extension (v: GtkFontChooserDialog_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFontChooserDialog_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkFontChooserDialog_queueautoptr: 
  given _tag: Tag[GtkFontChooserDialog_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkFontChooserDialog_queueautoptr = o
  extension (v: GtkFontChooserDialog_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFontChooserDialog_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkFontChooserDialog_slistautoptr: 
  given _tag: Tag[GtkFontChooserDialog_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkFontChooserDialog_slistautoptr = o
  extension (v: GtkFontChooserDialog_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFontChooserWidget_autoptr = Ptr[GtkFontChooserWidget]
object GtkFontChooserWidget_autoptr: 
  given _tag: Tag[GtkFontChooserWidget_autoptr] = Tag.Ptr[GtkFontChooserWidget](GtkFontChooserWidget._tag)
  inline def apply(inline o: Ptr[GtkFontChooserWidget]): GtkFontChooserWidget_autoptr = o
  extension (v: GtkFontChooserWidget_autoptr)
    inline def value: Ptr[GtkFontChooserWidget] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFontChooserWidget_listautoptr = Ptr[_root_.glib.all.GList]
object GtkFontChooserWidget_listautoptr: 
  given _tag: Tag[GtkFontChooserWidget_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkFontChooserWidget_listautoptr = o
  extension (v: GtkFontChooserWidget_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFontChooserWidget_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkFontChooserWidget_queueautoptr: 
  given _tag: Tag[GtkFontChooserWidget_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkFontChooserWidget_queueautoptr = o
  extension (v: GtkFontChooserWidget_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFontChooserWidget_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkFontChooserWidget_slistautoptr: 
  given _tag: Tag[GtkFontChooserWidget_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkFontChooserWidget_slistautoptr = o
  extension (v: GtkFontChooserWidget_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFontChooser_autoptr = Ptr[GtkFontChooser]
object GtkFontChooser_autoptr: 
  given _tag: Tag[GtkFontChooser_autoptr] = Tag.Ptr[GtkFontChooser](GtkFontChooser._tag)
  inline def apply(inline o: Ptr[GtkFontChooser]): GtkFontChooser_autoptr = o
  extension (v: GtkFontChooser_autoptr)
    inline def value: Ptr[GtkFontChooser] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFontChooser_listautoptr = Ptr[_root_.glib.all.GList]
object GtkFontChooser_listautoptr: 
  given _tag: Tag[GtkFontChooser_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkFontChooser_listautoptr = o
  extension (v: GtkFontChooser_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFontChooser_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkFontChooser_queueautoptr: 
  given _tag: Tag[GtkFontChooser_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkFontChooser_queueautoptr = o
  extension (v: GtkFontChooser_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFontChooser_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkFontChooser_slistautoptr: 
  given _tag: Tag[GtkFontChooser_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkFontChooser_slistautoptr = o
  extension (v: GtkFontChooser_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkFontFilterFunc: : a `PangoFontFamily` : a `PangoFontFace` belonging to

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfontchooser.h
*/
opaque type GtkFontFilterFunc = CFuncPtr3[Ptr[_root_.pango.all.PangoFontFamily], Ptr[_root_.pango.all.PangoFontFace], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
object GtkFontFilterFunc: 
  given _tag: Tag[GtkFontFilterFunc] = Tag.materializeCFuncPtr3[Ptr[_root_.pango.all.PangoFontFamily], Ptr[_root_.pango.all.PangoFontFace], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
  inline def apply(inline o: CFuncPtr3[Ptr[_root_.pango.all.PangoFontFamily], Ptr[_root_.pango.all.PangoFontFace], _root_.glib.all.gpointer, _root_.glib.all.gboolean]): GtkFontFilterFunc = o
  extension (v: GtkFontFilterFunc)
    inline def value: CFuncPtr3[Ptr[_root_.pango.all.PangoFontFamily], Ptr[_root_.pango.all.PangoFontFace], _root_.glib.all.gpointer, _root_.glib.all.gboolean] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFrame_autoptr = Ptr[GtkFrame]
object GtkFrame_autoptr: 
  given _tag: Tag[GtkFrame_autoptr] = Tag.Ptr[GtkFrame](GtkFrame._tag)
  inline def apply(inline o: Ptr[GtkFrame]): GtkFrame_autoptr = o
  extension (v: GtkFrame_autoptr)
    inline def value: Ptr[GtkFrame] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFrame_listautoptr = Ptr[_root_.glib.all.GList]
object GtkFrame_listautoptr: 
  given _tag: Tag[GtkFrame_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkFrame_listautoptr = o
  extension (v: GtkFrame_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFrame_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkFrame_queueautoptr: 
  given _tag: Tag[GtkFrame_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkFrame_queueautoptr = o
  extension (v: GtkFrame_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkFrame_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkFrame_slistautoptr: 
  given _tag: Tag[GtkFrame_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkFrame_slistautoptr = o
  extension (v: GtkFrame_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGLArea_autoptr = Ptr[GtkGLArea]
object GtkGLArea_autoptr: 
  given _tag: Tag[GtkGLArea_autoptr] = Tag.Ptr[GtkGLArea](GtkGLArea._tag)
  inline def apply(inline o: Ptr[GtkGLArea]): GtkGLArea_autoptr = o
  extension (v: GtkGLArea_autoptr)
    inline def value: Ptr[GtkGLArea] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGLArea_listautoptr = Ptr[_root_.glib.all.GList]
object GtkGLArea_listautoptr: 
  given _tag: Tag[GtkGLArea_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkGLArea_listautoptr = o
  extension (v: GtkGLArea_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGLArea_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkGLArea_queueautoptr: 
  given _tag: Tag[GtkGLArea_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkGLArea_queueautoptr = o
  extension (v: GtkGLArea_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGLArea_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkGLArea_slistautoptr: 
  given _tag: Tag[GtkGLArea_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkGLArea_slistautoptr = o
  extension (v: GtkGLArea_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGestureClick_autoptr = Ptr[GtkGestureClick]
object GtkGestureClick_autoptr: 
  given _tag: Tag[GtkGestureClick_autoptr] = Tag.Ptr[GtkGestureClick](GtkGestureClick._tag)
  inline def apply(inline o: Ptr[GtkGestureClick]): GtkGestureClick_autoptr = o
  extension (v: GtkGestureClick_autoptr)
    inline def value: Ptr[GtkGestureClick] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGestureClick_listautoptr = Ptr[_root_.glib.all.GList]
object GtkGestureClick_listautoptr: 
  given _tag: Tag[GtkGestureClick_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkGestureClick_listautoptr = o
  extension (v: GtkGestureClick_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGestureClick_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkGestureClick_queueautoptr: 
  given _tag: Tag[GtkGestureClick_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkGestureClick_queueautoptr = o
  extension (v: GtkGestureClick_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGestureClick_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkGestureClick_slistautoptr: 
  given _tag: Tag[GtkGestureClick_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkGestureClick_slistautoptr = o
  extension (v: GtkGestureClick_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGestureDrag_autoptr = Ptr[GtkGestureDrag]
object GtkGestureDrag_autoptr: 
  given _tag: Tag[GtkGestureDrag_autoptr] = Tag.Ptr[GtkGestureDrag](GtkGestureDrag._tag)
  inline def apply(inline o: Ptr[GtkGestureDrag]): GtkGestureDrag_autoptr = o
  extension (v: GtkGestureDrag_autoptr)
    inline def value: Ptr[GtkGestureDrag] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGestureDrag_listautoptr = Ptr[_root_.glib.all.GList]
object GtkGestureDrag_listautoptr: 
  given _tag: Tag[GtkGestureDrag_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkGestureDrag_listautoptr = o
  extension (v: GtkGestureDrag_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGestureDrag_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkGestureDrag_queueautoptr: 
  given _tag: Tag[GtkGestureDrag_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkGestureDrag_queueautoptr = o
  extension (v: GtkGestureDrag_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGestureDrag_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkGestureDrag_slistautoptr: 
  given _tag: Tag[GtkGestureDrag_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkGestureDrag_slistautoptr = o
  extension (v: GtkGestureDrag_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGestureLongPress_autoptr = Ptr[GtkGestureLongPress]
object GtkGestureLongPress_autoptr: 
  given _tag: Tag[GtkGestureLongPress_autoptr] = Tag.Ptr[GtkGestureLongPress](GtkGestureLongPress._tag)
  inline def apply(inline o: Ptr[GtkGestureLongPress]): GtkGestureLongPress_autoptr = o
  extension (v: GtkGestureLongPress_autoptr)
    inline def value: Ptr[GtkGestureLongPress] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGestureLongPress_listautoptr = Ptr[_root_.glib.all.GList]
object GtkGestureLongPress_listautoptr: 
  given _tag: Tag[GtkGestureLongPress_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkGestureLongPress_listautoptr = o
  extension (v: GtkGestureLongPress_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGestureLongPress_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkGestureLongPress_queueautoptr: 
  given _tag: Tag[GtkGestureLongPress_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkGestureLongPress_queueautoptr = o
  extension (v: GtkGestureLongPress_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGestureLongPress_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkGestureLongPress_slistautoptr: 
  given _tag: Tag[GtkGestureLongPress_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkGestureLongPress_slistautoptr = o
  extension (v: GtkGestureLongPress_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGesturePan_autoptr = Ptr[GtkGesturePan]
object GtkGesturePan_autoptr: 
  given _tag: Tag[GtkGesturePan_autoptr] = Tag.Ptr[GtkGesturePan](GtkGesturePan._tag)
  inline def apply(inline o: Ptr[GtkGesturePan]): GtkGesturePan_autoptr = o
  extension (v: GtkGesturePan_autoptr)
    inline def value: Ptr[GtkGesturePan] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGesturePan_listautoptr = Ptr[_root_.glib.all.GList]
object GtkGesturePan_listautoptr: 
  given _tag: Tag[GtkGesturePan_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkGesturePan_listautoptr = o
  extension (v: GtkGesturePan_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGesturePan_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkGesturePan_queueautoptr: 
  given _tag: Tag[GtkGesturePan_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkGesturePan_queueautoptr = o
  extension (v: GtkGesturePan_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGesturePan_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkGesturePan_slistautoptr: 
  given _tag: Tag[GtkGesturePan_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkGesturePan_slistautoptr = o
  extension (v: GtkGesturePan_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGestureRotate_autoptr = Ptr[GtkGestureRotate]
object GtkGestureRotate_autoptr: 
  given _tag: Tag[GtkGestureRotate_autoptr] = Tag.Ptr[GtkGestureRotate](GtkGestureRotate._tag)
  inline def apply(inline o: Ptr[GtkGestureRotate]): GtkGestureRotate_autoptr = o
  extension (v: GtkGestureRotate_autoptr)
    inline def value: Ptr[GtkGestureRotate] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGestureRotate_listautoptr = Ptr[_root_.glib.all.GList]
object GtkGestureRotate_listautoptr: 
  given _tag: Tag[GtkGestureRotate_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkGestureRotate_listautoptr = o
  extension (v: GtkGestureRotate_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGestureRotate_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkGestureRotate_queueautoptr: 
  given _tag: Tag[GtkGestureRotate_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkGestureRotate_queueautoptr = o
  extension (v: GtkGestureRotate_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGestureRotate_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkGestureRotate_slistautoptr: 
  given _tag: Tag[GtkGestureRotate_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkGestureRotate_slistautoptr = o
  extension (v: GtkGestureRotate_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGestureSingle_autoptr = Ptr[GtkGestureSingle]
object GtkGestureSingle_autoptr: 
  given _tag: Tag[GtkGestureSingle_autoptr] = Tag.Ptr[GtkGestureSingle](GtkGestureSingle._tag)
  inline def apply(inline o: Ptr[GtkGestureSingle]): GtkGestureSingle_autoptr = o
  extension (v: GtkGestureSingle_autoptr)
    inline def value: Ptr[GtkGestureSingle] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGestureSingle_listautoptr = Ptr[_root_.glib.all.GList]
object GtkGestureSingle_listautoptr: 
  given _tag: Tag[GtkGestureSingle_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkGestureSingle_listautoptr = o
  extension (v: GtkGestureSingle_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGestureSingle_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkGestureSingle_queueautoptr: 
  given _tag: Tag[GtkGestureSingle_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkGestureSingle_queueautoptr = o
  extension (v: GtkGestureSingle_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGestureSingle_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkGestureSingle_slistautoptr: 
  given _tag: Tag[GtkGestureSingle_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkGestureSingle_slistautoptr = o
  extension (v: GtkGestureSingle_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGestureSwipe_autoptr = Ptr[GtkGestureSwipe]
object GtkGestureSwipe_autoptr: 
  given _tag: Tag[GtkGestureSwipe_autoptr] = Tag.Ptr[GtkGestureSwipe](GtkGestureSwipe._tag)
  inline def apply(inline o: Ptr[GtkGestureSwipe]): GtkGestureSwipe_autoptr = o
  extension (v: GtkGestureSwipe_autoptr)
    inline def value: Ptr[GtkGestureSwipe] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGestureSwipe_listautoptr = Ptr[_root_.glib.all.GList]
object GtkGestureSwipe_listautoptr: 
  given _tag: Tag[GtkGestureSwipe_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkGestureSwipe_listautoptr = o
  extension (v: GtkGestureSwipe_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGestureSwipe_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkGestureSwipe_queueautoptr: 
  given _tag: Tag[GtkGestureSwipe_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkGestureSwipe_queueautoptr = o
  extension (v: GtkGestureSwipe_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGestureSwipe_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkGestureSwipe_slistautoptr: 
  given _tag: Tag[GtkGestureSwipe_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkGestureSwipe_slistautoptr = o
  extension (v: GtkGestureSwipe_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGestureZoom_autoptr = Ptr[GtkGestureZoom]
object GtkGestureZoom_autoptr: 
  given _tag: Tag[GtkGestureZoom_autoptr] = Tag.Ptr[GtkGestureZoom](GtkGestureZoom._tag)
  inline def apply(inline o: Ptr[GtkGestureZoom]): GtkGestureZoom_autoptr = o
  extension (v: GtkGestureZoom_autoptr)
    inline def value: Ptr[GtkGestureZoom] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGestureZoom_listautoptr = Ptr[_root_.glib.all.GList]
object GtkGestureZoom_listautoptr: 
  given _tag: Tag[GtkGestureZoom_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkGestureZoom_listautoptr = o
  extension (v: GtkGestureZoom_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGestureZoom_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkGestureZoom_queueautoptr: 
  given _tag: Tag[GtkGestureZoom_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkGestureZoom_queueautoptr = o
  extension (v: GtkGestureZoom_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGestureZoom_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkGestureZoom_slistautoptr: 
  given _tag: Tag[GtkGestureZoom_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkGestureZoom_slistautoptr = o
  extension (v: GtkGestureZoom_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGesture_autoptr = Ptr[GtkGesture]
object GtkGesture_autoptr: 
  given _tag: Tag[GtkGesture_autoptr] = Tag.Ptr[GtkGesture](GtkGesture._tag)
  inline def apply(inline o: Ptr[GtkGesture]): GtkGesture_autoptr = o
  extension (v: GtkGesture_autoptr)
    inline def value: Ptr[GtkGesture] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGesture_listautoptr = Ptr[_root_.glib.all.GList]
object GtkGesture_listautoptr: 
  given _tag: Tag[GtkGesture_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkGesture_listautoptr = o
  extension (v: GtkGesture_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGesture_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkGesture_queueautoptr: 
  given _tag: Tag[GtkGesture_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkGesture_queueautoptr = o
  extension (v: GtkGesture_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGesture_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkGesture_slistautoptr: 
  given _tag: Tag[GtkGesture_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkGesture_slistautoptr = o
  extension (v: GtkGesture_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgridlayout.h
*/
opaque type GtkGridLayoutChildClass_autoptr = Ptr[GtkGridLayoutChildClass]
object GtkGridLayoutChildClass_autoptr: 
  given _tag: Tag[GtkGridLayoutChildClass_autoptr] = Tag.Ptr[GtkGridLayoutChildClass](GtkGridLayoutChildClass._tag)
  inline def apply(inline o: Ptr[GtkGridLayoutChildClass]): GtkGridLayoutChildClass_autoptr = o
  extension (v: GtkGridLayoutChildClass_autoptr)
    inline def value: Ptr[GtkGridLayoutChildClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgridlayout.h
*/
opaque type GtkGridLayoutChildClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkGridLayoutChildClass_listautoptr: 
  given _tag: Tag[GtkGridLayoutChildClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkGridLayoutChildClass_listautoptr = o
  extension (v: GtkGridLayoutChildClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgridlayout.h
*/
opaque type GtkGridLayoutChildClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkGridLayoutChildClass_queueautoptr: 
  given _tag: Tag[GtkGridLayoutChildClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkGridLayoutChildClass_queueautoptr = o
  extension (v: GtkGridLayoutChildClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgridlayout.h
*/
opaque type GtkGridLayoutChildClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkGridLayoutChildClass_slistautoptr: 
  given _tag: Tag[GtkGridLayoutChildClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkGridLayoutChildClass_slistautoptr = o
  extension (v: GtkGridLayoutChildClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgridlayout.h
*/
opaque type GtkGridLayoutChild_autoptr = Ptr[GtkGridLayoutChild]
object GtkGridLayoutChild_autoptr: 
  given _tag: Tag[GtkGridLayoutChild_autoptr] = Tag.Ptr[GtkGridLayoutChild](GtkGridLayoutChild._tag)
  inline def apply(inline o: Ptr[GtkGridLayoutChild]): GtkGridLayoutChild_autoptr = o
  extension (v: GtkGridLayoutChild_autoptr)
    inline def value: Ptr[GtkGridLayoutChild] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgridlayout.h
*/
opaque type GtkGridLayoutChild_listautoptr = Ptr[_root_.glib.all.GList]
object GtkGridLayoutChild_listautoptr: 
  given _tag: Tag[GtkGridLayoutChild_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkGridLayoutChild_listautoptr = o
  extension (v: GtkGridLayoutChild_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgridlayout.h
*/
opaque type GtkGridLayoutChild_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkGridLayoutChild_queueautoptr: 
  given _tag: Tag[GtkGridLayoutChild_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkGridLayoutChild_queueautoptr = o
  extension (v: GtkGridLayoutChild_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgridlayout.h
*/
opaque type GtkGridLayoutChild_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkGridLayoutChild_slistautoptr: 
  given _tag: Tag[GtkGridLayoutChild_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkGridLayoutChild_slistautoptr = o
  extension (v: GtkGridLayoutChild_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgridlayout.h
*/
opaque type GtkGridLayoutClass_autoptr = Ptr[GtkGridLayoutClass]
object GtkGridLayoutClass_autoptr: 
  given _tag: Tag[GtkGridLayoutClass_autoptr] = Tag.Ptr[GtkGridLayoutClass](GtkGridLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkGridLayoutClass]): GtkGridLayoutClass_autoptr = o
  extension (v: GtkGridLayoutClass_autoptr)
    inline def value: Ptr[GtkGridLayoutClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgridlayout.h
*/
opaque type GtkGridLayoutClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkGridLayoutClass_listautoptr: 
  given _tag: Tag[GtkGridLayoutClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkGridLayoutClass_listautoptr = o
  extension (v: GtkGridLayoutClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgridlayout.h
*/
opaque type GtkGridLayoutClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkGridLayoutClass_queueautoptr: 
  given _tag: Tag[GtkGridLayoutClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkGridLayoutClass_queueautoptr = o
  extension (v: GtkGridLayoutClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgridlayout.h
*/
opaque type GtkGridLayoutClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkGridLayoutClass_slistautoptr: 
  given _tag: Tag[GtkGridLayoutClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkGridLayoutClass_slistautoptr = o
  extension (v: GtkGridLayoutClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgridlayout.h
*/
opaque type GtkGridLayout_autoptr = Ptr[GtkGridLayout]
object GtkGridLayout_autoptr: 
  given _tag: Tag[GtkGridLayout_autoptr] = Tag.Ptr[GtkGridLayout](GtkGridLayout._tag)
  inline def apply(inline o: Ptr[GtkGridLayout]): GtkGridLayout_autoptr = o
  extension (v: GtkGridLayout_autoptr)
    inline def value: Ptr[GtkGridLayout] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgridlayout.h
*/
opaque type GtkGridLayout_listautoptr = Ptr[_root_.glib.all.GList]
object GtkGridLayout_listautoptr: 
  given _tag: Tag[GtkGridLayout_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkGridLayout_listautoptr = o
  extension (v: GtkGridLayout_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgridlayout.h
*/
opaque type GtkGridLayout_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkGridLayout_queueautoptr: 
  given _tag: Tag[GtkGridLayout_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkGridLayout_queueautoptr = o
  extension (v: GtkGridLayout_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgridlayout.h
*/
opaque type GtkGridLayout_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkGridLayout_slistautoptr: 
  given _tag: Tag[GtkGridLayout_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkGridLayout_slistautoptr = o
  extension (v: GtkGridLayout_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGridView_autoptr = Ptr[GtkGridView]
object GtkGridView_autoptr: 
  given _tag: Tag[GtkGridView_autoptr] = Tag.Ptr[GtkGridView](GtkGridView._tag)
  inline def apply(inline o: Ptr[GtkGridView]): GtkGridView_autoptr = o
  extension (v: GtkGridView_autoptr)
    inline def value: Ptr[GtkGridView] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGridView_listautoptr = Ptr[_root_.glib.all.GList]
object GtkGridView_listautoptr: 
  given _tag: Tag[GtkGridView_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkGridView_listautoptr = o
  extension (v: GtkGridView_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGridView_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkGridView_queueautoptr: 
  given _tag: Tag[GtkGridView_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkGridView_queueautoptr = o
  extension (v: GtkGridView_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGridView_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkGridView_slistautoptr: 
  given _tag: Tag[GtkGridView_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkGridView_slistautoptr = o
  extension (v: GtkGridView_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGrid_autoptr = Ptr[GtkGrid]
object GtkGrid_autoptr: 
  given _tag: Tag[GtkGrid_autoptr] = Tag.Ptr[GtkGrid](GtkGrid._tag)
  inline def apply(inline o: Ptr[GtkGrid]): GtkGrid_autoptr = o
  extension (v: GtkGrid_autoptr)
    inline def value: Ptr[GtkGrid] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGrid_listautoptr = Ptr[_root_.glib.all.GList]
object GtkGrid_listautoptr: 
  given _tag: Tag[GtkGrid_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkGrid_listautoptr = o
  extension (v: GtkGrid_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGrid_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkGrid_queueautoptr: 
  given _tag: Tag[GtkGrid_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkGrid_queueautoptr = o
  extension (v: GtkGrid_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkGrid_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkGrid_slistautoptr: 
  given _tag: Tag[GtkGrid_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkGrid_slistautoptr = o
  extension (v: GtkGrid_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkHeaderBar_autoptr = Ptr[GtkHeaderBar]
object GtkHeaderBar_autoptr: 
  given _tag: Tag[GtkHeaderBar_autoptr] = Tag.Ptr[GtkHeaderBar](GtkHeaderBar._tag)
  inline def apply(inline o: Ptr[GtkHeaderBar]): GtkHeaderBar_autoptr = o
  extension (v: GtkHeaderBar_autoptr)
    inline def value: Ptr[GtkHeaderBar] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkHeaderBar_listautoptr = Ptr[_root_.glib.all.GList]
object GtkHeaderBar_listautoptr: 
  given _tag: Tag[GtkHeaderBar_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkHeaderBar_listautoptr = o
  extension (v: GtkHeaderBar_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkHeaderBar_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkHeaderBar_queueautoptr: 
  given _tag: Tag[GtkHeaderBar_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkHeaderBar_queueautoptr = o
  extension (v: GtkHeaderBar_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkHeaderBar_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkHeaderBar_slistautoptr: 
  given _tag: Tag[GtkHeaderBar_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkHeaderBar_slistautoptr = o
  extension (v: GtkHeaderBar_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkIMContextSimple_autoptr = Ptr[GtkIMContextSimple]
object GtkIMContextSimple_autoptr: 
  given _tag: Tag[GtkIMContextSimple_autoptr] = Tag.Ptr[GtkIMContextSimple](GtkIMContextSimple._tag)
  inline def apply(inline o: Ptr[GtkIMContextSimple]): GtkIMContextSimple_autoptr = o
  extension (v: GtkIMContextSimple_autoptr)
    inline def value: Ptr[GtkIMContextSimple] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkIMContextSimple_listautoptr = Ptr[_root_.glib.all.GList]
object GtkIMContextSimple_listautoptr: 
  given _tag: Tag[GtkIMContextSimple_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkIMContextSimple_listautoptr = o
  extension (v: GtkIMContextSimple_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkIMContextSimple_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkIMContextSimple_queueautoptr: 
  given _tag: Tag[GtkIMContextSimple_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkIMContextSimple_queueautoptr = o
  extension (v: GtkIMContextSimple_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkIMContextSimple_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkIMContextSimple_slistautoptr: 
  given _tag: Tag[GtkIMContextSimple_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkIMContextSimple_slistautoptr = o
  extension (v: GtkIMContextSimple_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkIMContext_autoptr = Ptr[GtkIMContext]
object GtkIMContext_autoptr: 
  given _tag: Tag[GtkIMContext_autoptr] = Tag.Ptr[GtkIMContext](GtkIMContext._tag)
  inline def apply(inline o: Ptr[GtkIMContext]): GtkIMContext_autoptr = o
  extension (v: GtkIMContext_autoptr)
    inline def value: Ptr[GtkIMContext] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkIMContext_listautoptr = Ptr[_root_.glib.all.GList]
object GtkIMContext_listautoptr: 
  given _tag: Tag[GtkIMContext_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkIMContext_listautoptr = o
  extension (v: GtkIMContext_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkIMContext_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkIMContext_queueautoptr: 
  given _tag: Tag[GtkIMContext_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkIMContext_queueautoptr = o
  extension (v: GtkIMContext_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkIMContext_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkIMContext_slistautoptr: 
  given _tag: Tag[GtkIMContext_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkIMContext_slistautoptr = o
  extension (v: GtkIMContext_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkIMMulticontext_autoptr = Ptr[GtkIMMulticontext]
object GtkIMMulticontext_autoptr: 
  given _tag: Tag[GtkIMMulticontext_autoptr] = Tag.Ptr[GtkIMMulticontext](GtkIMMulticontext._tag)
  inline def apply(inline o: Ptr[GtkIMMulticontext]): GtkIMMulticontext_autoptr = o
  extension (v: GtkIMMulticontext_autoptr)
    inline def value: Ptr[GtkIMMulticontext] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkIMMulticontext_listautoptr = Ptr[_root_.glib.all.GList]
object GtkIMMulticontext_listautoptr: 
  given _tag: Tag[GtkIMMulticontext_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkIMMulticontext_listautoptr = o
  extension (v: GtkIMMulticontext_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkIMMulticontext_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkIMMulticontext_queueautoptr: 
  given _tag: Tag[GtkIMMulticontext_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkIMMulticontext_queueautoptr = o
  extension (v: GtkIMMulticontext_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkIMMulticontext_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkIMMulticontext_slistautoptr: 
  given _tag: Tag[GtkIMMulticontext_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkIMMulticontext_slistautoptr = o
  extension (v: GtkIMMulticontext_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkIconPaintable_autoptr = Ptr[GtkIconPaintable]
object GtkIconPaintable_autoptr: 
  given _tag: Tag[GtkIconPaintable_autoptr] = Tag.Ptr[GtkIconPaintable](GtkIconPaintable._tag)
  inline def apply(inline o: Ptr[GtkIconPaintable]): GtkIconPaintable_autoptr = o
  extension (v: GtkIconPaintable_autoptr)
    inline def value: Ptr[GtkIconPaintable] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkIconPaintable_listautoptr = Ptr[_root_.glib.all.GList]
object GtkIconPaintable_listautoptr: 
  given _tag: Tag[GtkIconPaintable_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkIconPaintable_listautoptr = o
  extension (v: GtkIconPaintable_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkIconPaintable_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkIconPaintable_queueautoptr: 
  given _tag: Tag[GtkIconPaintable_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkIconPaintable_queueautoptr = o
  extension (v: GtkIconPaintable_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkIconPaintable_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkIconPaintable_slistautoptr: 
  given _tag: Tag[GtkIconPaintable_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkIconPaintable_slistautoptr = o
  extension (v: GtkIconPaintable_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkIconTheme_autoptr = Ptr[GtkIconTheme]
object GtkIconTheme_autoptr: 
  given _tag: Tag[GtkIconTheme_autoptr] = Tag.Ptr[GtkIconTheme](GtkIconTheme._tag)
  inline def apply(inline o: Ptr[GtkIconTheme]): GtkIconTheme_autoptr = o
  extension (v: GtkIconTheme_autoptr)
    inline def value: Ptr[GtkIconTheme] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkIconTheme_listautoptr = Ptr[_root_.glib.all.GList]
object GtkIconTheme_listautoptr: 
  given _tag: Tag[GtkIconTheme_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkIconTheme_listautoptr = o
  extension (v: GtkIconTheme_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkIconTheme_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkIconTheme_queueautoptr: 
  given _tag: Tag[GtkIconTheme_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkIconTheme_queueautoptr = o
  extension (v: GtkIconTheme_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkIconTheme_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkIconTheme_slistautoptr: 
  given _tag: Tag[GtkIconTheme_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkIconTheme_slistautoptr = o
  extension (v: GtkIconTheme_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkIconViewForeachFunc: _view: a `GtkIconView` : The `GtkTreePath` of a selected row

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkiconview.h
*/
opaque type GtkIconViewForeachFunc = CFuncPtr3[Ptr[GtkIconView], Ptr[GtkTreePath], _root_.glib.all.gpointer, Unit]
object GtkIconViewForeachFunc: 
  given _tag: Tag[GtkIconViewForeachFunc] = Tag.materializeCFuncPtr3[Ptr[GtkIconView], Ptr[GtkTreePath], _root_.glib.all.gpointer, Unit]
  inline def apply(inline o: CFuncPtr3[Ptr[GtkIconView], Ptr[GtkTreePath], _root_.glib.all.gpointer, Unit]): GtkIconViewForeachFunc = o
  extension (v: GtkIconViewForeachFunc)
    inline def value: CFuncPtr3[Ptr[GtkIconView], Ptr[GtkTreePath], _root_.glib.all.gpointer, Unit] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkIconView_autoptr = Ptr[GtkIconView]
object GtkIconView_autoptr: 
  given _tag: Tag[GtkIconView_autoptr] = Tag.Ptr[GtkIconView](GtkIconView._tag)
  inline def apply(inline o: Ptr[GtkIconView]): GtkIconView_autoptr = o
  extension (v: GtkIconView_autoptr)
    inline def value: Ptr[GtkIconView] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkIconView_listautoptr = Ptr[_root_.glib.all.GList]
object GtkIconView_listautoptr: 
  given _tag: Tag[GtkIconView_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkIconView_listautoptr = o
  extension (v: GtkIconView_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkIconView_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkIconView_queueautoptr: 
  given _tag: Tag[GtkIconView_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkIconView_queueautoptr = o
  extension (v: GtkIconView_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkIconView_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkIconView_slistautoptr: 
  given _tag: Tag[GtkIconView_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkIconView_slistautoptr = o
  extension (v: GtkIconView_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkImage_autoptr = Ptr[GtkImage]
object GtkImage_autoptr: 
  given _tag: Tag[GtkImage_autoptr] = Tag.Ptr[GtkImage](GtkImage._tag)
  inline def apply(inline o: Ptr[GtkImage]): GtkImage_autoptr = o
  extension (v: GtkImage_autoptr)
    inline def value: Ptr[GtkImage] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkImage_listautoptr = Ptr[_root_.glib.all.GList]
object GtkImage_listautoptr: 
  given _tag: Tag[GtkImage_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkImage_listautoptr = o
  extension (v: GtkImage_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkImage_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkImage_queueautoptr: 
  given _tag: Tag[GtkImage_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkImage_queueautoptr = o
  extension (v: GtkImage_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkImage_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkImage_slistautoptr: 
  given _tag: Tag[GtkImage_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkImage_slistautoptr = o
  extension (v: GtkImage_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkInfoBar_autoptr = Ptr[GtkInfoBar]
object GtkInfoBar_autoptr: 
  given _tag: Tag[GtkInfoBar_autoptr] = Tag.Ptr[GtkInfoBar](GtkInfoBar._tag)
  inline def apply(inline o: Ptr[GtkInfoBar]): GtkInfoBar_autoptr = o
  extension (v: GtkInfoBar_autoptr)
    inline def value: Ptr[GtkInfoBar] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkInfoBar_listautoptr = Ptr[_root_.glib.all.GList]
object GtkInfoBar_listautoptr: 
  given _tag: Tag[GtkInfoBar_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkInfoBar_listautoptr = o
  extension (v: GtkInfoBar_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkInfoBar_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkInfoBar_queueautoptr: 
  given _tag: Tag[GtkInfoBar_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkInfoBar_queueautoptr = o
  extension (v: GtkInfoBar_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkInfoBar_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkInfoBar_slistautoptr: 
  given _tag: Tag[GtkInfoBar_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkInfoBar_slistautoptr = o
  extension (v: GtkInfoBar_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkKeyvalTriggerClass_autoptr = Ptr[GtkKeyvalTriggerClass]
object GtkKeyvalTriggerClass_autoptr: 
  given _tag: Tag[GtkKeyvalTriggerClass_autoptr] = Tag.Ptr[GtkKeyvalTriggerClass](GtkKeyvalTriggerClass._tag)
  inline def apply(inline o: Ptr[GtkKeyvalTriggerClass]): GtkKeyvalTriggerClass_autoptr = o
  extension (v: GtkKeyvalTriggerClass_autoptr)
    inline def value: Ptr[GtkKeyvalTriggerClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkKeyvalTriggerClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkKeyvalTriggerClass_listautoptr: 
  given _tag: Tag[GtkKeyvalTriggerClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkKeyvalTriggerClass_listautoptr = o
  extension (v: GtkKeyvalTriggerClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkKeyvalTriggerClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkKeyvalTriggerClass_queueautoptr: 
  given _tag: Tag[GtkKeyvalTriggerClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkKeyvalTriggerClass_queueautoptr = o
  extension (v: GtkKeyvalTriggerClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkKeyvalTriggerClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkKeyvalTriggerClass_slistautoptr: 
  given _tag: Tag[GtkKeyvalTriggerClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkKeyvalTriggerClass_slistautoptr = o
  extension (v: GtkKeyvalTriggerClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkKeyvalTrigger_autoptr = Ptr[GtkKeyvalTrigger]
object GtkKeyvalTrigger_autoptr: 
  given _tag: Tag[GtkKeyvalTrigger_autoptr] = Tag.Ptr[GtkKeyvalTrigger](GtkKeyvalTrigger._tag)
  inline def apply(inline o: Ptr[GtkKeyvalTrigger]): GtkKeyvalTrigger_autoptr = o
  extension (v: GtkKeyvalTrigger_autoptr)
    inline def value: Ptr[GtkKeyvalTrigger] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkKeyvalTrigger_listautoptr = Ptr[_root_.glib.all.GList]
object GtkKeyvalTrigger_listautoptr: 
  given _tag: Tag[GtkKeyvalTrigger_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkKeyvalTrigger_listautoptr = o
  extension (v: GtkKeyvalTrigger_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkKeyvalTrigger_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkKeyvalTrigger_queueautoptr: 
  given _tag: Tag[GtkKeyvalTrigger_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkKeyvalTrigger_queueautoptr = o
  extension (v: GtkKeyvalTrigger_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkKeyvalTrigger_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkKeyvalTrigger_slistautoptr: 
  given _tag: Tag[GtkKeyvalTrigger_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkKeyvalTrigger_slistautoptr = o
  extension (v: GtkKeyvalTrigger_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklabel.h
*/
opaque type GtkLabel_autoptr = Ptr[GtkLabel]
object GtkLabel_autoptr: 
  given _tag: Tag[GtkLabel_autoptr] = Tag.Ptr[GtkLabel](GtkLabel._tag)
  inline def apply(inline o: Ptr[GtkLabel]): GtkLabel_autoptr = o
  extension (v: GtkLabel_autoptr)
    inline def value: Ptr[GtkLabel] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklabel.h
*/
opaque type GtkLabel_listautoptr = Ptr[_root_.glib.all.GList]
object GtkLabel_listautoptr: 
  given _tag: Tag[GtkLabel_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkLabel_listautoptr = o
  extension (v: GtkLabel_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklabel.h
*/
opaque type GtkLabel_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkLabel_queueautoptr: 
  given _tag: Tag[GtkLabel_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkLabel_queueautoptr = o
  extension (v: GtkLabel_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklabel.h
*/
opaque type GtkLabel_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkLabel_slistautoptr: 
  given _tag: Tag[GtkLabel_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkLabel_slistautoptr = o
  extension (v: GtkLabel_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklayoutchild.h
*/
opaque type GtkLayoutChildClass_autoptr = Ptr[GtkLayoutChildClass]
object GtkLayoutChildClass_autoptr: 
  given _tag: Tag[GtkLayoutChildClass_autoptr] = Tag.Ptr[GtkLayoutChildClass](GtkLayoutChildClass._tag)
  inline def apply(inline o: Ptr[GtkLayoutChildClass]): GtkLayoutChildClass_autoptr = o
  extension (v: GtkLayoutChildClass_autoptr)
    inline def value: Ptr[GtkLayoutChildClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklayoutchild.h
*/
opaque type GtkLayoutChildClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkLayoutChildClass_listautoptr: 
  given _tag: Tag[GtkLayoutChildClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkLayoutChildClass_listautoptr = o
  extension (v: GtkLayoutChildClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklayoutchild.h
*/
opaque type GtkLayoutChildClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkLayoutChildClass_queueautoptr: 
  given _tag: Tag[GtkLayoutChildClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkLayoutChildClass_queueautoptr = o
  extension (v: GtkLayoutChildClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklayoutchild.h
*/
opaque type GtkLayoutChildClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkLayoutChildClass_slistautoptr: 
  given _tag: Tag[GtkLayoutChildClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkLayoutChildClass_slistautoptr = o
  extension (v: GtkLayoutChildClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklayoutchild.h
*/
opaque type GtkLayoutChild_autoptr = Ptr[GtkLayoutChild]
object GtkLayoutChild_autoptr: 
  given _tag: Tag[GtkLayoutChild_autoptr] = Tag.Ptr[GtkLayoutChild](GtkLayoutChild._tag)
  inline def apply(inline o: Ptr[GtkLayoutChild]): GtkLayoutChild_autoptr = o
  extension (v: GtkLayoutChild_autoptr)
    inline def value: Ptr[GtkLayoutChild] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklayoutchild.h
*/
opaque type GtkLayoutChild_listautoptr = Ptr[_root_.glib.all.GList]
object GtkLayoutChild_listautoptr: 
  given _tag: Tag[GtkLayoutChild_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkLayoutChild_listautoptr = o
  extension (v: GtkLayoutChild_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklayoutchild.h
*/
opaque type GtkLayoutChild_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkLayoutChild_queueautoptr: 
  given _tag: Tag[GtkLayoutChild_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkLayoutChild_queueautoptr = o
  extension (v: GtkLayoutChild_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklayoutchild.h
*/
opaque type GtkLayoutChild_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkLayoutChild_slistautoptr: 
  given _tag: Tag[GtkLayoutChild_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkLayoutChild_slistautoptr = o
  extension (v: GtkLayoutChild_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklayoutmanager.h
*/
opaque type GtkLayoutManagerClass_autoptr = Ptr[GtkLayoutManagerClass]
object GtkLayoutManagerClass_autoptr: 
  given _tag: Tag[GtkLayoutManagerClass_autoptr] = Tag.Ptr[GtkLayoutManagerClass](GtkLayoutManagerClass._tag)
  inline def apply(inline o: Ptr[GtkLayoutManagerClass]): GtkLayoutManagerClass_autoptr = o
  extension (v: GtkLayoutManagerClass_autoptr)
    inline def value: Ptr[GtkLayoutManagerClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklayoutmanager.h
*/
opaque type GtkLayoutManagerClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkLayoutManagerClass_listautoptr: 
  given _tag: Tag[GtkLayoutManagerClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkLayoutManagerClass_listautoptr = o
  extension (v: GtkLayoutManagerClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklayoutmanager.h
*/
opaque type GtkLayoutManagerClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkLayoutManagerClass_queueautoptr: 
  given _tag: Tag[GtkLayoutManagerClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkLayoutManagerClass_queueautoptr = o
  extension (v: GtkLayoutManagerClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklayoutmanager.h
*/
opaque type GtkLayoutManagerClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkLayoutManagerClass_slistautoptr: 
  given _tag: Tag[GtkLayoutManagerClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkLayoutManagerClass_slistautoptr = o
  extension (v: GtkLayoutManagerClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklayoutmanager.h
*/
opaque type GtkLayoutManager_autoptr = Ptr[GtkLayoutManager]
object GtkLayoutManager_autoptr: 
  given _tag: Tag[GtkLayoutManager_autoptr] = Tag.Ptr[GtkLayoutManager](GtkLayoutManager._tag)
  inline def apply(inline o: Ptr[GtkLayoutManager]): GtkLayoutManager_autoptr = o
  extension (v: GtkLayoutManager_autoptr)
    inline def value: Ptr[GtkLayoutManager] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklayoutmanager.h
*/
opaque type GtkLayoutManager_listautoptr = Ptr[_root_.glib.all.GList]
object GtkLayoutManager_listautoptr: 
  given _tag: Tag[GtkLayoutManager_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkLayoutManager_listautoptr = o
  extension (v: GtkLayoutManager_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklayoutmanager.h
*/
opaque type GtkLayoutManager_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkLayoutManager_queueautoptr: 
  given _tag: Tag[GtkLayoutManager_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkLayoutManager_queueautoptr = o
  extension (v: GtkLayoutManager_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklayoutmanager.h
*/
opaque type GtkLayoutManager_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkLayoutManager_slistautoptr: 
  given _tag: Tag[GtkLayoutManager_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkLayoutManager_slistautoptr = o
  extension (v: GtkLayoutManager_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkLevelBar_autoptr = Ptr[GtkLevelBar]
object GtkLevelBar_autoptr: 
  given _tag: Tag[GtkLevelBar_autoptr] = Tag.Ptr[GtkLevelBar](GtkLevelBar._tag)
  inline def apply(inline o: Ptr[GtkLevelBar]): GtkLevelBar_autoptr = o
  extension (v: GtkLevelBar_autoptr)
    inline def value: Ptr[GtkLevelBar] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkLevelBar_listautoptr = Ptr[_root_.glib.all.GList]
object GtkLevelBar_listautoptr: 
  given _tag: Tag[GtkLevelBar_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkLevelBar_listautoptr = o
  extension (v: GtkLevelBar_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkLevelBar_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkLevelBar_queueautoptr: 
  given _tag: Tag[GtkLevelBar_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkLevelBar_queueautoptr = o
  extension (v: GtkLevelBar_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkLevelBar_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkLevelBar_slistautoptr: 
  given _tag: Tag[GtkLevelBar_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkLevelBar_slistautoptr = o
  extension (v: GtkLevelBar_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkLinkButton_autoptr = Ptr[GtkLinkButton]
object GtkLinkButton_autoptr: 
  given _tag: Tag[GtkLinkButton_autoptr] = Tag.Ptr[GtkLinkButton](GtkLinkButton._tag)
  inline def apply(inline o: Ptr[GtkLinkButton]): GtkLinkButton_autoptr = o
  extension (v: GtkLinkButton_autoptr)
    inline def value: Ptr[GtkLinkButton] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkLinkButton_listautoptr = Ptr[_root_.glib.all.GList]
object GtkLinkButton_listautoptr: 
  given _tag: Tag[GtkLinkButton_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkLinkButton_listautoptr = o
  extension (v: GtkLinkButton_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkLinkButton_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkLinkButton_queueautoptr: 
  given _tag: Tag[GtkLinkButton_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkLinkButton_queueautoptr = o
  extension (v: GtkLinkButton_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkLinkButton_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkLinkButton_slistautoptr: 
  given _tag: Tag[GtkLinkButton_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkLinkButton_slistautoptr = o
  extension (v: GtkLinkButton_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkListBoxCreateWidgetFunc: : (type GObject): the item from the model for which to create a widget for _data: (closure): user data

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistbox.h
*/
opaque type GtkListBoxCreateWidgetFunc = CFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Ptr[GtkWidget]]
object GtkListBoxCreateWidgetFunc: 
  given _tag: Tag[GtkListBoxCreateWidgetFunc] = Tag.materializeCFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Ptr[GtkWidget]]
  inline def apply(inline o: CFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Ptr[GtkWidget]]): GtkListBoxCreateWidgetFunc = o
  extension (v: GtkListBoxCreateWidgetFunc)
    inline def value: CFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Ptr[GtkWidget]] = v

/**
 * GtkListBoxFilterFunc: : the row that may be filtered _data: (closure): user data

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistbox.h
*/
opaque type GtkListBoxFilterFunc = CFuncPtr2[Ptr[GtkListBoxRow], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
object GtkListBoxFilterFunc: 
  given _tag: Tag[GtkListBoxFilterFunc] = Tag.materializeCFuncPtr2[Ptr[GtkListBoxRow], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
  inline def apply(inline o: CFuncPtr2[Ptr[GtkListBoxRow], _root_.glib.all.gpointer, _root_.glib.all.gboolean]): GtkListBoxFilterFunc = o
  extension (v: GtkListBoxFilterFunc)
    inline def value: CFuncPtr2[Ptr[GtkListBoxRow], _root_.glib.all.gpointer, _root_.glib.all.gboolean] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistbox.h
*/
opaque type GtkListBoxForeachFunc = CFuncPtr3[Ptr[GtkListBox], Ptr[GtkListBoxRow], _root_.glib.all.gpointer, Unit]
object GtkListBoxForeachFunc: 
  given _tag: Tag[GtkListBoxForeachFunc] = Tag.materializeCFuncPtr3[Ptr[GtkListBox], Ptr[GtkListBoxRow], _root_.glib.all.gpointer, Unit]
  inline def apply(inline o: CFuncPtr3[Ptr[GtkListBox], Ptr[GtkListBoxRow], _root_.glib.all.gpointer, Unit]): GtkListBoxForeachFunc = o
  extension (v: GtkListBoxForeachFunc)
    inline def value: CFuncPtr3[Ptr[GtkListBox], Ptr[GtkListBoxRow], _root_.glib.all.gpointer, Unit] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistbox.h
*/
opaque type GtkListBoxRow_autoptr = Ptr[GtkListBoxRow]
object GtkListBoxRow_autoptr: 
  given _tag: Tag[GtkListBoxRow_autoptr] = Tag.Ptr[GtkListBoxRow](GtkListBoxRow._tag)
  inline def apply(inline o: Ptr[GtkListBoxRow]): GtkListBoxRow_autoptr = o
  extension (v: GtkListBoxRow_autoptr)
    inline def value: Ptr[GtkListBoxRow] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistbox.h
*/
opaque type GtkListBoxRow_listautoptr = Ptr[_root_.glib.all.GList]
object GtkListBoxRow_listautoptr: 
  given _tag: Tag[GtkListBoxRow_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkListBoxRow_listautoptr = o
  extension (v: GtkListBoxRow_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistbox.h
*/
opaque type GtkListBoxRow_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkListBoxRow_queueautoptr: 
  given _tag: Tag[GtkListBoxRow_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkListBoxRow_queueautoptr = o
  extension (v: GtkListBoxRow_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistbox.h
*/
opaque type GtkListBoxRow_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkListBoxRow_slistautoptr: 
  given _tag: Tag[GtkListBoxRow_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkListBoxRow_slistautoptr = o
  extension (v: GtkListBoxRow_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkListBoxSortFunc: : the first row : the second row _data: (closure): user data

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistbox.h
*/
opaque type GtkListBoxSortFunc = CFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], _root_.glib.all.gpointer, CInt]
object GtkListBoxSortFunc: 
  given _tag: Tag[GtkListBoxSortFunc] = Tag.materializeCFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], _root_.glib.all.gpointer, CInt]
  inline def apply(inline o: CFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], _root_.glib.all.gpointer, CInt]): GtkListBoxSortFunc = o
  extension (v: GtkListBoxSortFunc)
    inline def value: CFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], _root_.glib.all.gpointer, CInt] = v

/**
 * GtkListBoxUpdateHeaderFunc: : the row to update : (nullable): the row before , or %NULL if it is first _data: (closure): user data

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistbox.h
*/
opaque type GtkListBoxUpdateHeaderFunc = CFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], _root_.glib.all.gpointer, Unit]
object GtkListBoxUpdateHeaderFunc: 
  given _tag: Tag[GtkListBoxUpdateHeaderFunc] = Tag.materializeCFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], _root_.glib.all.gpointer, Unit]
  inline def apply(inline o: CFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], _root_.glib.all.gpointer, Unit]): GtkListBoxUpdateHeaderFunc = o
  extension (v: GtkListBoxUpdateHeaderFunc)
    inline def value: CFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], _root_.glib.all.gpointer, Unit] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistbox.h
*/
opaque type GtkListBox_autoptr = Ptr[GtkListBox]
object GtkListBox_autoptr: 
  given _tag: Tag[GtkListBox_autoptr] = Tag.Ptr[GtkListBox](GtkListBox._tag)
  inline def apply(inline o: Ptr[GtkListBox]): GtkListBox_autoptr = o
  extension (v: GtkListBox_autoptr)
    inline def value: Ptr[GtkListBox] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistbox.h
*/
opaque type GtkListBox_listautoptr = Ptr[_root_.glib.all.GList]
object GtkListBox_listautoptr: 
  given _tag: Tag[GtkListBox_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkListBox_listautoptr = o
  extension (v: GtkListBox_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistbox.h
*/
opaque type GtkListBox_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkListBox_queueautoptr: 
  given _tag: Tag[GtkListBox_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkListBox_queueautoptr = o
  extension (v: GtkListBox_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistbox.h
*/
opaque type GtkListBox_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkListBox_slistautoptr: 
  given _tag: Tag[GtkListBox_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkListBox_slistautoptr = o
  extension (v: GtkListBox_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkListItemFactory_autoptr = Ptr[GtkListItemFactory]
object GtkListItemFactory_autoptr: 
  given _tag: Tag[GtkListItemFactory_autoptr] = Tag.Ptr[GtkListItemFactory](GtkListItemFactory._tag)
  inline def apply(inline o: Ptr[GtkListItemFactory]): GtkListItemFactory_autoptr = o
  extension (v: GtkListItemFactory_autoptr)
    inline def value: Ptr[GtkListItemFactory] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkListItemFactory_listautoptr = Ptr[_root_.glib.all.GList]
object GtkListItemFactory_listautoptr: 
  given _tag: Tag[GtkListItemFactory_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkListItemFactory_listautoptr = o
  extension (v: GtkListItemFactory_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkListItemFactory_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkListItemFactory_queueautoptr: 
  given _tag: Tag[GtkListItemFactory_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkListItemFactory_queueautoptr = o
  extension (v: GtkListItemFactory_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkListItemFactory_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkListItemFactory_slistautoptr: 
  given _tag: Tag[GtkListItemFactory_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkListItemFactory_slistautoptr = o
  extension (v: GtkListItemFactory_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkListItem_autoptr = Ptr[GtkListItem]
object GtkListItem_autoptr: 
  given _tag: Tag[GtkListItem_autoptr] = Tag.Ptr[GtkListItem](GtkListItem._tag)
  inline def apply(inline o: Ptr[GtkListItem]): GtkListItem_autoptr = o
  extension (v: GtkListItem_autoptr)
    inline def value: Ptr[GtkListItem] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkListItem_listautoptr = Ptr[_root_.glib.all.GList]
object GtkListItem_listautoptr: 
  given _tag: Tag[GtkListItem_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkListItem_listautoptr = o
  extension (v: GtkListItem_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkListItem_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkListItem_queueautoptr: 
  given _tag: Tag[GtkListItem_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkListItem_queueautoptr = o
  extension (v: GtkListItem_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkListItem_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkListItem_slistautoptr: 
  given _tag: Tag[GtkListItem_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkListItem_slistautoptr = o
  extension (v: GtkListItem_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkListStore_autoptr = Ptr[GtkListStore]
object GtkListStore_autoptr: 
  given _tag: Tag[GtkListStore_autoptr] = Tag.Ptr[GtkListStore](GtkListStore._tag)
  inline def apply(inline o: Ptr[GtkListStore]): GtkListStore_autoptr = o
  extension (v: GtkListStore_autoptr)
    inline def value: Ptr[GtkListStore] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkListStore_listautoptr = Ptr[_root_.glib.all.GList]
object GtkListStore_listautoptr: 
  given _tag: Tag[GtkListStore_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkListStore_listautoptr = o
  extension (v: GtkListStore_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkListStore_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkListStore_queueautoptr: 
  given _tag: Tag[GtkListStore_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkListStore_queueautoptr = o
  extension (v: GtkListStore_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkListStore_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkListStore_slistautoptr: 
  given _tag: Tag[GtkListStore_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkListStore_slistautoptr = o
  extension (v: GtkListStore_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistview.h
*/
opaque type GtkListView_autoptr = Ptr[GtkListView]
object GtkListView_autoptr: 
  given _tag: Tag[GtkListView_autoptr] = Tag.Ptr[GtkListView](GtkListView._tag)
  inline def apply(inline o: Ptr[GtkListView]): GtkListView_autoptr = o
  extension (v: GtkListView_autoptr)
    inline def value: Ptr[GtkListView] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistview.h
*/
opaque type GtkListView_listautoptr = Ptr[_root_.glib.all.GList]
object GtkListView_listautoptr: 
  given _tag: Tag[GtkListView_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkListView_listautoptr = o
  extension (v: GtkListView_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistview.h
*/
opaque type GtkListView_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkListView_queueautoptr: 
  given _tag: Tag[GtkListView_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkListView_queueautoptr = o
  extension (v: GtkListView_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistview.h
*/
opaque type GtkListView_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkListView_slistautoptr: 
  given _tag: Tag[GtkListView_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkListView_slistautoptr = o
  extension (v: GtkListView_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkLockButton_autoptr = Ptr[GtkLockButton]
object GtkLockButton_autoptr: 
  given _tag: Tag[GtkLockButton_autoptr] = Tag.Ptr[GtkLockButton](GtkLockButton._tag)
  inline def apply(inline o: Ptr[GtkLockButton]): GtkLockButton_autoptr = o
  extension (v: GtkLockButton_autoptr)
    inline def value: Ptr[GtkLockButton] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkLockButton_listautoptr = Ptr[_root_.glib.all.GList]
object GtkLockButton_listautoptr: 
  given _tag: Tag[GtkLockButton_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkLockButton_listautoptr = o
  extension (v: GtkLockButton_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkLockButton_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkLockButton_queueautoptr: 
  given _tag: Tag[GtkLockButton_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkLockButton_queueautoptr = o
  extension (v: GtkLockButton_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkLockButton_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkLockButton_slistautoptr: 
  given _tag: Tag[GtkLockButton_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkLockButton_slistautoptr = o
  extension (v: GtkLockButton_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmaplistmodel.h
*/
opaque type GtkMapListModelClass_autoptr = Ptr[GtkMapListModelClass]
object GtkMapListModelClass_autoptr: 
  given _tag: Tag[GtkMapListModelClass_autoptr] = Tag.Ptr[GtkMapListModelClass](GtkMapListModelClass._tag)
  inline def apply(inline o: Ptr[GtkMapListModelClass]): GtkMapListModelClass_autoptr = o
  extension (v: GtkMapListModelClass_autoptr)
    inline def value: Ptr[GtkMapListModelClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmaplistmodel.h
*/
opaque type GtkMapListModelClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkMapListModelClass_listautoptr: 
  given _tag: Tag[GtkMapListModelClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkMapListModelClass_listautoptr = o
  extension (v: GtkMapListModelClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmaplistmodel.h
*/
opaque type GtkMapListModelClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkMapListModelClass_queueautoptr: 
  given _tag: Tag[GtkMapListModelClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkMapListModelClass_queueautoptr = o
  extension (v: GtkMapListModelClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmaplistmodel.h
*/
opaque type GtkMapListModelClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkMapListModelClass_slistautoptr: 
  given _tag: Tag[GtkMapListModelClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkMapListModelClass_slistautoptr = o
  extension (v: GtkMapListModelClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkMapListModelMapFunc: : (type GObject) (transfer full): The item to map _data: user data

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmaplistmodel.h
*/
opaque type GtkMapListModelMapFunc = CFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, _root_.glib.all.gpointer]
object GtkMapListModelMapFunc: 
  given _tag: Tag[GtkMapListModelMapFunc] = Tag.materializeCFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, _root_.glib.all.gpointer]
  inline def apply(inline o: CFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, _root_.glib.all.gpointer]): GtkMapListModelMapFunc = o
  extension (v: GtkMapListModelMapFunc)
    inline def value: CFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, _root_.glib.all.gpointer] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmaplistmodel.h
*/
opaque type GtkMapListModel_autoptr = Ptr[GtkMapListModel]
object GtkMapListModel_autoptr: 
  given _tag: Tag[GtkMapListModel_autoptr] = Tag.Ptr[GtkMapListModel](GtkMapListModel._tag)
  inline def apply(inline o: Ptr[GtkMapListModel]): GtkMapListModel_autoptr = o
  extension (v: GtkMapListModel_autoptr)
    inline def value: Ptr[GtkMapListModel] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmaplistmodel.h
*/
opaque type GtkMapListModel_listautoptr = Ptr[_root_.glib.all.GList]
object GtkMapListModel_listautoptr: 
  given _tag: Tag[GtkMapListModel_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkMapListModel_listautoptr = o
  extension (v: GtkMapListModel_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmaplistmodel.h
*/
opaque type GtkMapListModel_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkMapListModel_queueautoptr: 
  given _tag: Tag[GtkMapListModel_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkMapListModel_queueautoptr = o
  extension (v: GtkMapListModel_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmaplistmodel.h
*/
opaque type GtkMapListModel_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkMapListModel_slistautoptr: 
  given _tag: Tag[GtkMapListModel_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkMapListModel_slistautoptr = o
  extension (v: GtkMapListModel_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediacontrols.h
*/
opaque type GtkMediaControlsClass_autoptr = Ptr[GtkMediaControlsClass]
object GtkMediaControlsClass_autoptr: 
  given _tag: Tag[GtkMediaControlsClass_autoptr] = Tag.Ptr[GtkMediaControlsClass](GtkMediaControlsClass._tag)
  inline def apply(inline o: Ptr[GtkMediaControlsClass]): GtkMediaControlsClass_autoptr = o
  extension (v: GtkMediaControlsClass_autoptr)
    inline def value: Ptr[GtkMediaControlsClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediacontrols.h
*/
opaque type GtkMediaControlsClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkMediaControlsClass_listautoptr: 
  given _tag: Tag[GtkMediaControlsClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkMediaControlsClass_listautoptr = o
  extension (v: GtkMediaControlsClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediacontrols.h
*/
opaque type GtkMediaControlsClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkMediaControlsClass_queueautoptr: 
  given _tag: Tag[GtkMediaControlsClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkMediaControlsClass_queueautoptr = o
  extension (v: GtkMediaControlsClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediacontrols.h
*/
opaque type GtkMediaControlsClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkMediaControlsClass_slistautoptr: 
  given _tag: Tag[GtkMediaControlsClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkMediaControlsClass_slistautoptr = o
  extension (v: GtkMediaControlsClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediacontrols.h
*/
opaque type GtkMediaControls_autoptr = Ptr[GtkMediaControls]
object GtkMediaControls_autoptr: 
  given _tag: Tag[GtkMediaControls_autoptr] = Tag.Ptr[GtkMediaControls](GtkMediaControls._tag)
  inline def apply(inline o: Ptr[GtkMediaControls]): GtkMediaControls_autoptr = o
  extension (v: GtkMediaControls_autoptr)
    inline def value: Ptr[GtkMediaControls] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediacontrols.h
*/
opaque type GtkMediaControls_listautoptr = Ptr[_root_.glib.all.GList]
object GtkMediaControls_listautoptr: 
  given _tag: Tag[GtkMediaControls_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkMediaControls_listautoptr = o
  extension (v: GtkMediaControls_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediacontrols.h
*/
opaque type GtkMediaControls_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkMediaControls_queueautoptr: 
  given _tag: Tag[GtkMediaControls_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkMediaControls_queueautoptr = o
  extension (v: GtkMediaControls_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediacontrols.h
*/
opaque type GtkMediaControls_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkMediaControls_slistautoptr: 
  given _tag: Tag[GtkMediaControls_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkMediaControls_slistautoptr = o
  extension (v: GtkMediaControls_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediafile.h
*/
opaque type GtkMediaFileClass_autoptr = Ptr[GtkMediaFileClass]
object GtkMediaFileClass_autoptr: 
  given _tag: Tag[GtkMediaFileClass_autoptr] = Tag.Ptr[GtkMediaFileClass](GtkMediaFileClass._tag)
  inline def apply(inline o: Ptr[GtkMediaFileClass]): GtkMediaFileClass_autoptr = o
  extension (v: GtkMediaFileClass_autoptr)
    inline def value: Ptr[GtkMediaFileClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediafile.h
*/
opaque type GtkMediaFileClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkMediaFileClass_listautoptr: 
  given _tag: Tag[GtkMediaFileClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkMediaFileClass_listautoptr = o
  extension (v: GtkMediaFileClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediafile.h
*/
opaque type GtkMediaFileClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkMediaFileClass_queueautoptr: 
  given _tag: Tag[GtkMediaFileClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkMediaFileClass_queueautoptr = o
  extension (v: GtkMediaFileClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediafile.h
*/
opaque type GtkMediaFileClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkMediaFileClass_slistautoptr: 
  given _tag: Tag[GtkMediaFileClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkMediaFileClass_slistautoptr = o
  extension (v: GtkMediaFileClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediafile.h
*/
opaque type GtkMediaFile_autoptr = Ptr[GtkMediaFile]
object GtkMediaFile_autoptr: 
  given _tag: Tag[GtkMediaFile_autoptr] = Tag.Ptr[GtkMediaFile](GtkMediaFile._tag)
  inline def apply(inline o: Ptr[GtkMediaFile]): GtkMediaFile_autoptr = o
  extension (v: GtkMediaFile_autoptr)
    inline def value: Ptr[GtkMediaFile] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediafile.h
*/
opaque type GtkMediaFile_listautoptr = Ptr[_root_.glib.all.GList]
object GtkMediaFile_listautoptr: 
  given _tag: Tag[GtkMediaFile_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkMediaFile_listautoptr = o
  extension (v: GtkMediaFile_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediafile.h
*/
opaque type GtkMediaFile_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkMediaFile_queueautoptr: 
  given _tag: Tag[GtkMediaFile_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkMediaFile_queueautoptr = o
  extension (v: GtkMediaFile_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediafile.h
*/
opaque type GtkMediaFile_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkMediaFile_slistautoptr: 
  given _tag: Tag[GtkMediaFile_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkMediaFile_slistautoptr = o
  extension (v: GtkMediaFile_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediastream.h
*/
opaque type GtkMediaStreamClass_autoptr = Ptr[GtkMediaStreamClass]
object GtkMediaStreamClass_autoptr: 
  given _tag: Tag[GtkMediaStreamClass_autoptr] = Tag.Ptr[GtkMediaStreamClass](GtkMediaStreamClass._tag)
  inline def apply(inline o: Ptr[GtkMediaStreamClass]): GtkMediaStreamClass_autoptr = o
  extension (v: GtkMediaStreamClass_autoptr)
    inline def value: Ptr[GtkMediaStreamClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediastream.h
*/
opaque type GtkMediaStreamClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkMediaStreamClass_listautoptr: 
  given _tag: Tag[GtkMediaStreamClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkMediaStreamClass_listautoptr = o
  extension (v: GtkMediaStreamClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediastream.h
*/
opaque type GtkMediaStreamClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkMediaStreamClass_queueautoptr: 
  given _tag: Tag[GtkMediaStreamClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkMediaStreamClass_queueautoptr = o
  extension (v: GtkMediaStreamClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediastream.h
*/
opaque type GtkMediaStreamClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkMediaStreamClass_slistautoptr: 
  given _tag: Tag[GtkMediaStreamClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkMediaStreamClass_slistautoptr = o
  extension (v: GtkMediaStreamClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediastream.h
*/
opaque type GtkMediaStream_autoptr = Ptr[GtkMediaStream]
object GtkMediaStream_autoptr: 
  given _tag: Tag[GtkMediaStream_autoptr] = Tag.Ptr[GtkMediaStream](GtkMediaStream._tag)
  inline def apply(inline o: Ptr[GtkMediaStream]): GtkMediaStream_autoptr = o
  extension (v: GtkMediaStream_autoptr)
    inline def value: Ptr[GtkMediaStream] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediastream.h
*/
opaque type GtkMediaStream_listautoptr = Ptr[_root_.glib.all.GList]
object GtkMediaStream_listautoptr: 
  given _tag: Tag[GtkMediaStream_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkMediaStream_listautoptr = o
  extension (v: GtkMediaStream_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediastream.h
*/
opaque type GtkMediaStream_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkMediaStream_queueautoptr: 
  given _tag: Tag[GtkMediaStream_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkMediaStream_queueautoptr = o
  extension (v: GtkMediaStream_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediastream.h
*/
opaque type GtkMediaStream_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkMediaStream_slistautoptr: 
  given _tag: Tag[GtkMediaStream_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkMediaStream_slistautoptr = o
  extension (v: GtkMediaStream_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkMenuButtonCreatePopupFunc: _button: the `GtkMenuButton` _data: User data passed to gtk_menu_button_set_create_popup_func()

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmenubutton.h
*/
opaque type GtkMenuButtonCreatePopupFunc = CFuncPtr2[Ptr[GtkMenuButton], _root_.glib.all.gpointer, Unit]
object GtkMenuButtonCreatePopupFunc: 
  given _tag: Tag[GtkMenuButtonCreatePopupFunc] = Tag.materializeCFuncPtr2[Ptr[GtkMenuButton], _root_.glib.all.gpointer, Unit]
  inline def apply(inline o: CFuncPtr2[Ptr[GtkMenuButton], _root_.glib.all.gpointer, Unit]): GtkMenuButtonCreatePopupFunc = o
  extension (v: GtkMenuButtonCreatePopupFunc)
    inline def value: CFuncPtr2[Ptr[GtkMenuButton], _root_.glib.all.gpointer, Unit] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkMenuButton_autoptr = Ptr[GtkMenuButton]
object GtkMenuButton_autoptr: 
  given _tag: Tag[GtkMenuButton_autoptr] = Tag.Ptr[GtkMenuButton](GtkMenuButton._tag)
  inline def apply(inline o: Ptr[GtkMenuButton]): GtkMenuButton_autoptr = o
  extension (v: GtkMenuButton_autoptr)
    inline def value: Ptr[GtkMenuButton] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkMenuButton_listautoptr = Ptr[_root_.glib.all.GList]
object GtkMenuButton_listautoptr: 
  given _tag: Tag[GtkMenuButton_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkMenuButton_listautoptr = o
  extension (v: GtkMenuButton_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkMenuButton_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkMenuButton_queueautoptr: 
  given _tag: Tag[GtkMenuButton_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkMenuButton_queueautoptr = o
  extension (v: GtkMenuButton_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkMenuButton_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkMenuButton_slistautoptr: 
  given _tag: Tag[GtkMenuButton_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkMenuButton_slistautoptr = o
  extension (v: GtkMenuButton_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkMessageDialog_autoptr = Ptr[GtkMessageDialog]
object GtkMessageDialog_autoptr: 
  given _tag: Tag[GtkMessageDialog_autoptr] = Tag.Ptr[GtkMessageDialog](GtkMessageDialog._tag)
  inline def apply(inline o: Ptr[GtkMessageDialog]): GtkMessageDialog_autoptr = o
  extension (v: GtkMessageDialog_autoptr)
    inline def value: Ptr[GtkMessageDialog] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkMessageDialog_listautoptr = Ptr[_root_.glib.all.GList]
object GtkMessageDialog_listautoptr: 
  given _tag: Tag[GtkMessageDialog_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkMessageDialog_listautoptr = o
  extension (v: GtkMessageDialog_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkMessageDialog_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkMessageDialog_queueautoptr: 
  given _tag: Tag[GtkMessageDialog_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkMessageDialog_queueautoptr = o
  extension (v: GtkMessageDialog_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkMessageDialog_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkMessageDialog_slistautoptr: 
  given _tag: Tag[GtkMessageDialog_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkMessageDialog_slistautoptr = o
  extension (v: GtkMessageDialog_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkMnemonicActionClass_autoptr = Ptr[GtkMnemonicActionClass]
object GtkMnemonicActionClass_autoptr: 
  given _tag: Tag[GtkMnemonicActionClass_autoptr] = Tag.Ptr[GtkMnemonicActionClass](GtkMnemonicActionClass._tag)
  inline def apply(inline o: Ptr[GtkMnemonicActionClass]): GtkMnemonicActionClass_autoptr = o
  extension (v: GtkMnemonicActionClass_autoptr)
    inline def value: Ptr[GtkMnemonicActionClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkMnemonicActionClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkMnemonicActionClass_listautoptr: 
  given _tag: Tag[GtkMnemonicActionClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkMnemonicActionClass_listautoptr = o
  extension (v: GtkMnemonicActionClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkMnemonicActionClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkMnemonicActionClass_queueautoptr: 
  given _tag: Tag[GtkMnemonicActionClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkMnemonicActionClass_queueautoptr = o
  extension (v: GtkMnemonicActionClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkMnemonicActionClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkMnemonicActionClass_slistautoptr: 
  given _tag: Tag[GtkMnemonicActionClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkMnemonicActionClass_slistautoptr = o
  extension (v: GtkMnemonicActionClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkMnemonicAction_autoptr = Ptr[GtkMnemonicAction]
object GtkMnemonicAction_autoptr: 
  given _tag: Tag[GtkMnemonicAction_autoptr] = Tag.Ptr[GtkMnemonicAction](GtkMnemonicAction._tag)
  inline def apply(inline o: Ptr[GtkMnemonicAction]): GtkMnemonicAction_autoptr = o
  extension (v: GtkMnemonicAction_autoptr)
    inline def value: Ptr[GtkMnemonicAction] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkMnemonicAction_listautoptr = Ptr[_root_.glib.all.GList]
object GtkMnemonicAction_listautoptr: 
  given _tag: Tag[GtkMnemonicAction_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkMnemonicAction_listautoptr = o
  extension (v: GtkMnemonicAction_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkMnemonicAction_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkMnemonicAction_queueautoptr: 
  given _tag: Tag[GtkMnemonicAction_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkMnemonicAction_queueautoptr = o
  extension (v: GtkMnemonicAction_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkMnemonicAction_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkMnemonicAction_slistautoptr: 
  given _tag: Tag[GtkMnemonicAction_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkMnemonicAction_slistautoptr = o
  extension (v: GtkMnemonicAction_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkMnemonicTriggerClass_autoptr = Ptr[GtkMnemonicTriggerClass]
object GtkMnemonicTriggerClass_autoptr: 
  given _tag: Tag[GtkMnemonicTriggerClass_autoptr] = Tag.Ptr[GtkMnemonicTriggerClass](GtkMnemonicTriggerClass._tag)
  inline def apply(inline o: Ptr[GtkMnemonicTriggerClass]): GtkMnemonicTriggerClass_autoptr = o
  extension (v: GtkMnemonicTriggerClass_autoptr)
    inline def value: Ptr[GtkMnemonicTriggerClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkMnemonicTriggerClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkMnemonicTriggerClass_listautoptr: 
  given _tag: Tag[GtkMnemonicTriggerClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkMnemonicTriggerClass_listautoptr = o
  extension (v: GtkMnemonicTriggerClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkMnemonicTriggerClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkMnemonicTriggerClass_queueautoptr: 
  given _tag: Tag[GtkMnemonicTriggerClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkMnemonicTriggerClass_queueautoptr = o
  extension (v: GtkMnemonicTriggerClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkMnemonicTriggerClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkMnemonicTriggerClass_slistautoptr: 
  given _tag: Tag[GtkMnemonicTriggerClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkMnemonicTriggerClass_slistautoptr = o
  extension (v: GtkMnemonicTriggerClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkMnemonicTrigger_autoptr = Ptr[GtkMnemonicTrigger]
object GtkMnemonicTrigger_autoptr: 
  given _tag: Tag[GtkMnemonicTrigger_autoptr] = Tag.Ptr[GtkMnemonicTrigger](GtkMnemonicTrigger._tag)
  inline def apply(inline o: Ptr[GtkMnemonicTrigger]): GtkMnemonicTrigger_autoptr = o
  extension (v: GtkMnemonicTrigger_autoptr)
    inline def value: Ptr[GtkMnemonicTrigger] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkMnemonicTrigger_listautoptr = Ptr[_root_.glib.all.GList]
object GtkMnemonicTrigger_listautoptr: 
  given _tag: Tag[GtkMnemonicTrigger_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkMnemonicTrigger_listautoptr = o
  extension (v: GtkMnemonicTrigger_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkMnemonicTrigger_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkMnemonicTrigger_queueautoptr: 
  given _tag: Tag[GtkMnemonicTrigger_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkMnemonicTrigger_queueautoptr = o
  extension (v: GtkMnemonicTrigger_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkMnemonicTrigger_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkMnemonicTrigger_slistautoptr: 
  given _tag: Tag[GtkMnemonicTrigger_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkMnemonicTrigger_slistautoptr = o
  extension (v: GtkMnemonicTrigger_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkMountOperation_autoptr = Ptr[GtkMountOperation]
object GtkMountOperation_autoptr: 
  given _tag: Tag[GtkMountOperation_autoptr] = Tag.Ptr[GtkMountOperation](GtkMountOperation._tag)
  inline def apply(inline o: Ptr[GtkMountOperation]): GtkMountOperation_autoptr = o
  extension (v: GtkMountOperation_autoptr)
    inline def value: Ptr[GtkMountOperation] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkMountOperation_listautoptr = Ptr[_root_.glib.all.GList]
object GtkMountOperation_listautoptr: 
  given _tag: Tag[GtkMountOperation_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkMountOperation_listautoptr = o
  extension (v: GtkMountOperation_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkMountOperation_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkMountOperation_queueautoptr: 
  given _tag: Tag[GtkMountOperation_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkMountOperation_queueautoptr = o
  extension (v: GtkMountOperation_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkMountOperation_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkMountOperation_slistautoptr: 
  given _tag: Tag[GtkMountOperation_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkMountOperation_slistautoptr = o
  extension (v: GtkMountOperation_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type GtkMultiFilterClass_autoptr = Ptr[GtkMultiFilterClass]
object GtkMultiFilterClass_autoptr: 
  given _tag: Tag[GtkMultiFilterClass_autoptr] = Tag.Ptr[GtkMultiFilterClass](GtkMultiFilterClass._tag)
  inline def apply(inline o: Ptr[GtkMultiFilterClass]): GtkMultiFilterClass_autoptr = o
  extension (v: GtkMultiFilterClass_autoptr)
    inline def value: Ptr[GtkMultiFilterClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type GtkMultiFilterClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkMultiFilterClass_listautoptr: 
  given _tag: Tag[GtkMultiFilterClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkMultiFilterClass_listautoptr = o
  extension (v: GtkMultiFilterClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type GtkMultiFilterClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkMultiFilterClass_queueautoptr: 
  given _tag: Tag[GtkMultiFilterClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkMultiFilterClass_queueautoptr = o
  extension (v: GtkMultiFilterClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type GtkMultiFilterClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkMultiFilterClass_slistautoptr: 
  given _tag: Tag[GtkMultiFilterClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkMultiFilterClass_slistautoptr = o
  extension (v: GtkMultiFilterClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type GtkMultiFilter_autoptr = Ptr[GtkMultiFilter]
object GtkMultiFilter_autoptr: 
  given _tag: Tag[GtkMultiFilter_autoptr] = Tag.Ptr[GtkMultiFilter](GtkMultiFilter._tag)
  inline def apply(inline o: Ptr[GtkMultiFilter]): GtkMultiFilter_autoptr = o
  extension (v: GtkMultiFilter_autoptr)
    inline def value: Ptr[GtkMultiFilter] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type GtkMultiFilter_listautoptr = Ptr[_root_.glib.all.GList]
object GtkMultiFilter_listautoptr: 
  given _tag: Tag[GtkMultiFilter_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkMultiFilter_listautoptr = o
  extension (v: GtkMultiFilter_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type GtkMultiFilter_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkMultiFilter_queueautoptr: 
  given _tag: Tag[GtkMultiFilter_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkMultiFilter_queueautoptr = o
  extension (v: GtkMultiFilter_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type GtkMultiFilter_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkMultiFilter_slistautoptr: 
  given _tag: Tag[GtkMultiFilter_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkMultiFilter_slistautoptr = o
  extension (v: GtkMultiFilter_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultiselection.h
*/
opaque type GtkMultiSelectionClass_autoptr = Ptr[GtkMultiSelectionClass]
object GtkMultiSelectionClass_autoptr: 
  given _tag: Tag[GtkMultiSelectionClass_autoptr] = Tag.Ptr[GtkMultiSelectionClass](GtkMultiSelectionClass._tag)
  inline def apply(inline o: Ptr[GtkMultiSelectionClass]): GtkMultiSelectionClass_autoptr = o
  extension (v: GtkMultiSelectionClass_autoptr)
    inline def value: Ptr[GtkMultiSelectionClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultiselection.h
*/
opaque type GtkMultiSelectionClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkMultiSelectionClass_listautoptr: 
  given _tag: Tag[GtkMultiSelectionClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkMultiSelectionClass_listautoptr = o
  extension (v: GtkMultiSelectionClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultiselection.h
*/
opaque type GtkMultiSelectionClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkMultiSelectionClass_queueautoptr: 
  given _tag: Tag[GtkMultiSelectionClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkMultiSelectionClass_queueautoptr = o
  extension (v: GtkMultiSelectionClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultiselection.h
*/
opaque type GtkMultiSelectionClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkMultiSelectionClass_slistautoptr: 
  given _tag: Tag[GtkMultiSelectionClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkMultiSelectionClass_slistautoptr = o
  extension (v: GtkMultiSelectionClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultiselection.h
*/
opaque type GtkMultiSelection_autoptr = Ptr[GtkMultiSelection]
object GtkMultiSelection_autoptr: 
  given _tag: Tag[GtkMultiSelection_autoptr] = Tag.Ptr[GtkMultiSelection](GtkMultiSelection._tag)
  inline def apply(inline o: Ptr[GtkMultiSelection]): GtkMultiSelection_autoptr = o
  extension (v: GtkMultiSelection_autoptr)
    inline def value: Ptr[GtkMultiSelection] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultiselection.h
*/
opaque type GtkMultiSelection_listautoptr = Ptr[_root_.glib.all.GList]
object GtkMultiSelection_listautoptr: 
  given _tag: Tag[GtkMultiSelection_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkMultiSelection_listautoptr = o
  extension (v: GtkMultiSelection_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultiselection.h
*/
opaque type GtkMultiSelection_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkMultiSelection_queueautoptr: 
  given _tag: Tag[GtkMultiSelection_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkMultiSelection_queueautoptr = o
  extension (v: GtkMultiSelection_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultiselection.h
*/
opaque type GtkMultiSelection_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkMultiSelection_slistautoptr: 
  given _tag: Tag[GtkMultiSelection_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkMultiSelection_slistautoptr = o
  extension (v: GtkMultiSelection_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultisorter.h
*/
opaque type GtkMultiSorterClass_autoptr = Ptr[GtkMultiSorterClass]
object GtkMultiSorterClass_autoptr: 
  given _tag: Tag[GtkMultiSorterClass_autoptr] = Tag.Ptr[GtkMultiSorterClass](GtkMultiSorterClass._tag)
  inline def apply(inline o: Ptr[GtkMultiSorterClass]): GtkMultiSorterClass_autoptr = o
  extension (v: GtkMultiSorterClass_autoptr)
    inline def value: Ptr[GtkMultiSorterClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultisorter.h
*/
opaque type GtkMultiSorterClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkMultiSorterClass_listautoptr: 
  given _tag: Tag[GtkMultiSorterClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkMultiSorterClass_listautoptr = o
  extension (v: GtkMultiSorterClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultisorter.h
*/
opaque type GtkMultiSorterClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkMultiSorterClass_queueautoptr: 
  given _tag: Tag[GtkMultiSorterClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkMultiSorterClass_queueautoptr = o
  extension (v: GtkMultiSorterClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultisorter.h
*/
opaque type GtkMultiSorterClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkMultiSorterClass_slistautoptr: 
  given _tag: Tag[GtkMultiSorterClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkMultiSorterClass_slistautoptr = o
  extension (v: GtkMultiSorterClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultisorter.h
*/
opaque type GtkMultiSorter_autoptr = Ptr[GtkMultiSorter]
object GtkMultiSorter_autoptr: 
  given _tag: Tag[GtkMultiSorter_autoptr] = Tag.Ptr[GtkMultiSorter](GtkMultiSorter._tag)
  inline def apply(inline o: Ptr[GtkMultiSorter]): GtkMultiSorter_autoptr = o
  extension (v: GtkMultiSorter_autoptr)
    inline def value: Ptr[GtkMultiSorter] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultisorter.h
*/
opaque type GtkMultiSorter_listautoptr = Ptr[_root_.glib.all.GList]
object GtkMultiSorter_listautoptr: 
  given _tag: Tag[GtkMultiSorter_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkMultiSorter_listautoptr = o
  extension (v: GtkMultiSorter_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultisorter.h
*/
opaque type GtkMultiSorter_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkMultiSorter_queueautoptr: 
  given _tag: Tag[GtkMultiSorter_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkMultiSorter_queueautoptr = o
  extension (v: GtkMultiSorter_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultisorter.h
*/
opaque type GtkMultiSorter_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkMultiSorter_slistautoptr: 
  given _tag: Tag[GtkMultiSorter_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkMultiSorter_slistautoptr = o
  extension (v: GtkMultiSorter_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkNamedActionClass_autoptr = Ptr[GtkNamedActionClass]
object GtkNamedActionClass_autoptr: 
  given _tag: Tag[GtkNamedActionClass_autoptr] = Tag.Ptr[GtkNamedActionClass](GtkNamedActionClass._tag)
  inline def apply(inline o: Ptr[GtkNamedActionClass]): GtkNamedActionClass_autoptr = o
  extension (v: GtkNamedActionClass_autoptr)
    inline def value: Ptr[GtkNamedActionClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkNamedActionClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkNamedActionClass_listautoptr: 
  given _tag: Tag[GtkNamedActionClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkNamedActionClass_listautoptr = o
  extension (v: GtkNamedActionClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkNamedActionClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkNamedActionClass_queueautoptr: 
  given _tag: Tag[GtkNamedActionClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkNamedActionClass_queueautoptr = o
  extension (v: GtkNamedActionClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkNamedActionClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkNamedActionClass_slistautoptr: 
  given _tag: Tag[GtkNamedActionClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkNamedActionClass_slistautoptr = o
  extension (v: GtkNamedActionClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkNamedAction_autoptr = Ptr[GtkNamedAction]
object GtkNamedAction_autoptr: 
  given _tag: Tag[GtkNamedAction_autoptr] = Tag.Ptr[GtkNamedAction](GtkNamedAction._tag)
  inline def apply(inline o: Ptr[GtkNamedAction]): GtkNamedAction_autoptr = o
  extension (v: GtkNamedAction_autoptr)
    inline def value: Ptr[GtkNamedAction] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkNamedAction_listautoptr = Ptr[_root_.glib.all.GList]
object GtkNamedAction_listautoptr: 
  given _tag: Tag[GtkNamedAction_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkNamedAction_listautoptr = o
  extension (v: GtkNamedAction_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkNamedAction_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkNamedAction_queueautoptr: 
  given _tag: Tag[GtkNamedAction_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkNamedAction_queueautoptr = o
  extension (v: GtkNamedAction_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkNamedAction_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkNamedAction_slistautoptr: 
  given _tag: Tag[GtkNamedAction_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkNamedAction_slistautoptr = o
  extension (v: GtkNamedAction_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknativedialog.h
*/
opaque type GtkNativeDialogClass_autoptr = Ptr[GtkNativeDialogClass]
object GtkNativeDialogClass_autoptr: 
  given _tag: Tag[GtkNativeDialogClass_autoptr] = Tag.Ptr[GtkNativeDialogClass](GtkNativeDialogClass._tag)
  inline def apply(inline o: Ptr[GtkNativeDialogClass]): GtkNativeDialogClass_autoptr = o
  extension (v: GtkNativeDialogClass_autoptr)
    inline def value: Ptr[GtkNativeDialogClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknativedialog.h
*/
opaque type GtkNativeDialogClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkNativeDialogClass_listautoptr: 
  given _tag: Tag[GtkNativeDialogClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkNativeDialogClass_listautoptr = o
  extension (v: GtkNativeDialogClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknativedialog.h
*/
opaque type GtkNativeDialogClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkNativeDialogClass_queueautoptr: 
  given _tag: Tag[GtkNativeDialogClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkNativeDialogClass_queueautoptr = o
  extension (v: GtkNativeDialogClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknativedialog.h
*/
opaque type GtkNativeDialogClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkNativeDialogClass_slistautoptr: 
  given _tag: Tag[GtkNativeDialogClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkNativeDialogClass_slistautoptr = o
  extension (v: GtkNativeDialogClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknativedialog.h
*/
opaque type GtkNativeDialog_autoptr = Ptr[GtkNativeDialog]
object GtkNativeDialog_autoptr: 
  given _tag: Tag[GtkNativeDialog_autoptr] = Tag.Ptr[GtkNativeDialog](GtkNativeDialog._tag)
  inline def apply(inline o: Ptr[GtkNativeDialog]): GtkNativeDialog_autoptr = o
  extension (v: GtkNativeDialog_autoptr)
    inline def value: Ptr[GtkNativeDialog] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknativedialog.h
*/
opaque type GtkNativeDialog_listautoptr = Ptr[_root_.glib.all.GList]
object GtkNativeDialog_listautoptr: 
  given _tag: Tag[GtkNativeDialog_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkNativeDialog_listautoptr = o
  extension (v: GtkNativeDialog_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknativedialog.h
*/
opaque type GtkNativeDialog_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkNativeDialog_queueautoptr: 
  given _tag: Tag[GtkNativeDialog_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkNativeDialog_queueautoptr = o
  extension (v: GtkNativeDialog_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknativedialog.h
*/
opaque type GtkNativeDialog_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkNativeDialog_slistautoptr: 
  given _tag: Tag[GtkNativeDialog_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkNativeDialog_slistautoptr = o
  extension (v: GtkNativeDialog_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknative.h
*/
opaque type GtkNative_autoptr = Ptr[GtkNative]
object GtkNative_autoptr: 
  given _tag: Tag[GtkNative_autoptr] = Tag.Ptr[GtkNative](GtkNative._tag)
  inline def apply(inline o: Ptr[GtkNative]): GtkNative_autoptr = o
  extension (v: GtkNative_autoptr)
    inline def value: Ptr[GtkNative] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknative.h
*/
opaque type GtkNative_listautoptr = Ptr[_root_.glib.all.GList]
object GtkNative_listautoptr: 
  given _tag: Tag[GtkNative_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkNative_listautoptr = o
  extension (v: GtkNative_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknative.h
*/
opaque type GtkNative_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkNative_queueautoptr: 
  given _tag: Tag[GtkNative_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkNative_queueautoptr = o
  extension (v: GtkNative_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknative.h
*/
opaque type GtkNative_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkNative_slistautoptr: 
  given _tag: Tag[GtkNative_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkNative_slistautoptr = o
  extension (v: GtkNative_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkNeverTriggerClass_autoptr = Ptr[GtkNeverTriggerClass]
object GtkNeverTriggerClass_autoptr: 
  given _tag: Tag[GtkNeverTriggerClass_autoptr] = Tag.Ptr[GtkNeverTriggerClass](GtkNeverTriggerClass._tag)
  inline def apply(inline o: Ptr[GtkNeverTriggerClass]): GtkNeverTriggerClass_autoptr = o
  extension (v: GtkNeverTriggerClass_autoptr)
    inline def value: Ptr[GtkNeverTriggerClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkNeverTriggerClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkNeverTriggerClass_listautoptr: 
  given _tag: Tag[GtkNeverTriggerClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkNeverTriggerClass_listautoptr = o
  extension (v: GtkNeverTriggerClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkNeverTriggerClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkNeverTriggerClass_queueautoptr: 
  given _tag: Tag[GtkNeverTriggerClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkNeverTriggerClass_queueautoptr = o
  extension (v: GtkNeverTriggerClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkNeverTriggerClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkNeverTriggerClass_slistautoptr: 
  given _tag: Tag[GtkNeverTriggerClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkNeverTriggerClass_slistautoptr = o
  extension (v: GtkNeverTriggerClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkNeverTrigger_autoptr = Ptr[GtkNeverTrigger]
object GtkNeverTrigger_autoptr: 
  given _tag: Tag[GtkNeverTrigger_autoptr] = Tag.Ptr[GtkNeverTrigger](GtkNeverTrigger._tag)
  inline def apply(inline o: Ptr[GtkNeverTrigger]): GtkNeverTrigger_autoptr = o
  extension (v: GtkNeverTrigger_autoptr)
    inline def value: Ptr[GtkNeverTrigger] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkNeverTrigger_listautoptr = Ptr[_root_.glib.all.GList]
object GtkNeverTrigger_listautoptr: 
  given _tag: Tag[GtkNeverTrigger_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkNeverTrigger_listautoptr = o
  extension (v: GtkNeverTrigger_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkNeverTrigger_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkNeverTrigger_queueautoptr: 
  given _tag: Tag[GtkNeverTrigger_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkNeverTrigger_queueautoptr = o
  extension (v: GtkNeverTrigger_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkNeverTrigger_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkNeverTrigger_slistautoptr: 
  given _tag: Tag[GtkNeverTrigger_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkNeverTrigger_slistautoptr = o
  extension (v: GtkNeverTrigger_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknoselection.h
*/
opaque type GtkNoSelectionClass_autoptr = Ptr[GtkNoSelectionClass]
object GtkNoSelectionClass_autoptr: 
  given _tag: Tag[GtkNoSelectionClass_autoptr] = Tag.Ptr[GtkNoSelectionClass](GtkNoSelectionClass._tag)
  inline def apply(inline o: Ptr[GtkNoSelectionClass]): GtkNoSelectionClass_autoptr = o
  extension (v: GtkNoSelectionClass_autoptr)
    inline def value: Ptr[GtkNoSelectionClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknoselection.h
*/
opaque type GtkNoSelectionClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkNoSelectionClass_listautoptr: 
  given _tag: Tag[GtkNoSelectionClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkNoSelectionClass_listautoptr = o
  extension (v: GtkNoSelectionClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknoselection.h
*/
opaque type GtkNoSelectionClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkNoSelectionClass_queueautoptr: 
  given _tag: Tag[GtkNoSelectionClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkNoSelectionClass_queueautoptr = o
  extension (v: GtkNoSelectionClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknoselection.h
*/
opaque type GtkNoSelectionClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkNoSelectionClass_slistautoptr: 
  given _tag: Tag[GtkNoSelectionClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkNoSelectionClass_slistautoptr = o
  extension (v: GtkNoSelectionClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknoselection.h
*/
opaque type GtkNoSelection_autoptr = Ptr[GtkNoSelection]
object GtkNoSelection_autoptr: 
  given _tag: Tag[GtkNoSelection_autoptr] = Tag.Ptr[GtkNoSelection](GtkNoSelection._tag)
  inline def apply(inline o: Ptr[GtkNoSelection]): GtkNoSelection_autoptr = o
  extension (v: GtkNoSelection_autoptr)
    inline def value: Ptr[GtkNoSelection] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknoselection.h
*/
opaque type GtkNoSelection_listautoptr = Ptr[_root_.glib.all.GList]
object GtkNoSelection_listautoptr: 
  given _tag: Tag[GtkNoSelection_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkNoSelection_listautoptr = o
  extension (v: GtkNoSelection_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknoselection.h
*/
opaque type GtkNoSelection_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkNoSelection_queueautoptr: 
  given _tag: Tag[GtkNoSelection_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkNoSelection_queueautoptr = o
  extension (v: GtkNoSelection_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknoselection.h
*/
opaque type GtkNoSelection_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkNoSelection_slistautoptr: 
  given _tag: Tag[GtkNoSelection_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkNoSelection_slistautoptr = o
  extension (v: GtkNoSelection_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkNotebook_autoptr = Ptr[GtkNotebook]
object GtkNotebook_autoptr: 
  given _tag: Tag[GtkNotebook_autoptr] = Tag.Ptr[GtkNotebook](GtkNotebook._tag)
  inline def apply(inline o: Ptr[GtkNotebook]): GtkNotebook_autoptr = o
  extension (v: GtkNotebook_autoptr)
    inline def value: Ptr[GtkNotebook] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkNotebook_listautoptr = Ptr[_root_.glib.all.GList]
object GtkNotebook_listautoptr: 
  given _tag: Tag[GtkNotebook_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkNotebook_listautoptr = o
  extension (v: GtkNotebook_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkNotebook_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkNotebook_queueautoptr: 
  given _tag: Tag[GtkNotebook_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkNotebook_queueautoptr = o
  extension (v: GtkNotebook_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkNotebook_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkNotebook_slistautoptr: 
  given _tag: Tag[GtkNotebook_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkNotebook_slistautoptr = o
  extension (v: GtkNotebook_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkNothingActionClass_autoptr = Ptr[GtkNothingActionClass]
object GtkNothingActionClass_autoptr: 
  given _tag: Tag[GtkNothingActionClass_autoptr] = Tag.Ptr[GtkNothingActionClass](GtkNothingActionClass._tag)
  inline def apply(inline o: Ptr[GtkNothingActionClass]): GtkNothingActionClass_autoptr = o
  extension (v: GtkNothingActionClass_autoptr)
    inline def value: Ptr[GtkNothingActionClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkNothingActionClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkNothingActionClass_listautoptr: 
  given _tag: Tag[GtkNothingActionClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkNothingActionClass_listautoptr = o
  extension (v: GtkNothingActionClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkNothingActionClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkNothingActionClass_queueautoptr: 
  given _tag: Tag[GtkNothingActionClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkNothingActionClass_queueautoptr = o
  extension (v: GtkNothingActionClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkNothingActionClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkNothingActionClass_slistautoptr: 
  given _tag: Tag[GtkNothingActionClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkNothingActionClass_slistautoptr = o
  extension (v: GtkNothingActionClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkNothingAction_autoptr = Ptr[GtkNothingAction]
object GtkNothingAction_autoptr: 
  given _tag: Tag[GtkNothingAction_autoptr] = Tag.Ptr[GtkNothingAction](GtkNothingAction._tag)
  inline def apply(inline o: Ptr[GtkNothingAction]): GtkNothingAction_autoptr = o
  extension (v: GtkNothingAction_autoptr)
    inline def value: Ptr[GtkNothingAction] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkNothingAction_listautoptr = Ptr[_root_.glib.all.GList]
object GtkNothingAction_listautoptr: 
  given _tag: Tag[GtkNothingAction_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkNothingAction_listautoptr = o
  extension (v: GtkNothingAction_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkNothingAction_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkNothingAction_queueautoptr: 
  given _tag: Tag[GtkNothingAction_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkNothingAction_queueautoptr = o
  extension (v: GtkNothingAction_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkNothingAction_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkNothingAction_slistautoptr: 
  given _tag: Tag[GtkNothingAction_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkNothingAction_slistautoptr = o
  extension (v: GtkNothingAction_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknumericsorter.h
*/
opaque type GtkNumericSorterClass_autoptr = Ptr[GtkNumericSorterClass]
object GtkNumericSorterClass_autoptr: 
  given _tag: Tag[GtkNumericSorterClass_autoptr] = Tag.Ptr[GtkNumericSorterClass](GtkNumericSorterClass._tag)
  inline def apply(inline o: Ptr[GtkNumericSorterClass]): GtkNumericSorterClass_autoptr = o
  extension (v: GtkNumericSorterClass_autoptr)
    inline def value: Ptr[GtkNumericSorterClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknumericsorter.h
*/
opaque type GtkNumericSorterClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkNumericSorterClass_listautoptr: 
  given _tag: Tag[GtkNumericSorterClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkNumericSorterClass_listautoptr = o
  extension (v: GtkNumericSorterClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknumericsorter.h
*/
opaque type GtkNumericSorterClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkNumericSorterClass_queueautoptr: 
  given _tag: Tag[GtkNumericSorterClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkNumericSorterClass_queueautoptr = o
  extension (v: GtkNumericSorterClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknumericsorter.h
*/
opaque type GtkNumericSorterClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkNumericSorterClass_slistautoptr: 
  given _tag: Tag[GtkNumericSorterClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkNumericSorterClass_slistautoptr = o
  extension (v: GtkNumericSorterClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknumericsorter.h
*/
opaque type GtkNumericSorter_autoptr = Ptr[GtkNumericSorter]
object GtkNumericSorter_autoptr: 
  given _tag: Tag[GtkNumericSorter_autoptr] = Tag.Ptr[GtkNumericSorter](GtkNumericSorter._tag)
  inline def apply(inline o: Ptr[GtkNumericSorter]): GtkNumericSorter_autoptr = o
  extension (v: GtkNumericSorter_autoptr)
    inline def value: Ptr[GtkNumericSorter] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknumericsorter.h
*/
opaque type GtkNumericSorter_listautoptr = Ptr[_root_.glib.all.GList]
object GtkNumericSorter_listautoptr: 
  given _tag: Tag[GtkNumericSorter_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkNumericSorter_listautoptr = o
  extension (v: GtkNumericSorter_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknumericsorter.h
*/
opaque type GtkNumericSorter_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkNumericSorter_queueautoptr: 
  given _tag: Tag[GtkNumericSorter_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkNumericSorter_queueautoptr = o
  extension (v: GtkNumericSorter_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknumericsorter.h
*/
opaque type GtkNumericSorter_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkNumericSorter_slistautoptr: 
  given _tag: Tag[GtkNumericSorter_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkNumericSorter_slistautoptr = o
  extension (v: GtkNumericSorter_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkOrientable_autoptr = Ptr[GtkOrientable]
object GtkOrientable_autoptr: 
  given _tag: Tag[GtkOrientable_autoptr] = Tag.Ptr[GtkOrientable](GtkOrientable._tag)
  inline def apply(inline o: Ptr[GtkOrientable]): GtkOrientable_autoptr = o
  extension (v: GtkOrientable_autoptr)
    inline def value: Ptr[GtkOrientable] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkOrientable_listautoptr = Ptr[_root_.glib.all.GList]
object GtkOrientable_listautoptr: 
  given _tag: Tag[GtkOrientable_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkOrientable_listautoptr = o
  extension (v: GtkOrientable_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkOrientable_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkOrientable_queueautoptr: 
  given _tag: Tag[GtkOrientable_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkOrientable_queueautoptr = o
  extension (v: GtkOrientable_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkOrientable_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkOrientable_slistautoptr: 
  given _tag: Tag[GtkOrientable_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkOrientable_slistautoptr = o
  extension (v: GtkOrientable_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkoverlaylayout.h
*/
opaque type GtkOverlayLayoutChildClass_autoptr = Ptr[GtkOverlayLayoutChildClass]
object GtkOverlayLayoutChildClass_autoptr: 
  given _tag: Tag[GtkOverlayLayoutChildClass_autoptr] = Tag.Ptr[GtkOverlayLayoutChildClass](GtkOverlayLayoutChildClass._tag)
  inline def apply(inline o: Ptr[GtkOverlayLayoutChildClass]): GtkOverlayLayoutChildClass_autoptr = o
  extension (v: GtkOverlayLayoutChildClass_autoptr)
    inline def value: Ptr[GtkOverlayLayoutChildClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkoverlaylayout.h
*/
opaque type GtkOverlayLayoutChildClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkOverlayLayoutChildClass_listautoptr: 
  given _tag: Tag[GtkOverlayLayoutChildClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkOverlayLayoutChildClass_listautoptr = o
  extension (v: GtkOverlayLayoutChildClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkoverlaylayout.h
*/
opaque type GtkOverlayLayoutChildClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkOverlayLayoutChildClass_queueautoptr: 
  given _tag: Tag[GtkOverlayLayoutChildClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkOverlayLayoutChildClass_queueautoptr = o
  extension (v: GtkOverlayLayoutChildClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkoverlaylayout.h
*/
opaque type GtkOverlayLayoutChildClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkOverlayLayoutChildClass_slistautoptr: 
  given _tag: Tag[GtkOverlayLayoutChildClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkOverlayLayoutChildClass_slistautoptr = o
  extension (v: GtkOverlayLayoutChildClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkoverlaylayout.h
*/
opaque type GtkOverlayLayoutChild_autoptr = Ptr[GtkOverlayLayoutChild]
object GtkOverlayLayoutChild_autoptr: 
  given _tag: Tag[GtkOverlayLayoutChild_autoptr] = Tag.Ptr[GtkOverlayLayoutChild](GtkOverlayLayoutChild._tag)
  inline def apply(inline o: Ptr[GtkOverlayLayoutChild]): GtkOverlayLayoutChild_autoptr = o
  extension (v: GtkOverlayLayoutChild_autoptr)
    inline def value: Ptr[GtkOverlayLayoutChild] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkoverlaylayout.h
*/
opaque type GtkOverlayLayoutChild_listautoptr = Ptr[_root_.glib.all.GList]
object GtkOverlayLayoutChild_listautoptr: 
  given _tag: Tag[GtkOverlayLayoutChild_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkOverlayLayoutChild_listautoptr = o
  extension (v: GtkOverlayLayoutChild_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkoverlaylayout.h
*/
opaque type GtkOverlayLayoutChild_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkOverlayLayoutChild_queueautoptr: 
  given _tag: Tag[GtkOverlayLayoutChild_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkOverlayLayoutChild_queueautoptr = o
  extension (v: GtkOverlayLayoutChild_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkoverlaylayout.h
*/
opaque type GtkOverlayLayoutChild_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkOverlayLayoutChild_slistautoptr: 
  given _tag: Tag[GtkOverlayLayoutChild_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkOverlayLayoutChild_slistautoptr = o
  extension (v: GtkOverlayLayoutChild_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkoverlaylayout.h
*/
opaque type GtkOverlayLayoutClass_autoptr = Ptr[GtkOverlayLayoutClass]
object GtkOverlayLayoutClass_autoptr: 
  given _tag: Tag[GtkOverlayLayoutClass_autoptr] = Tag.Ptr[GtkOverlayLayoutClass](GtkOverlayLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkOverlayLayoutClass]): GtkOverlayLayoutClass_autoptr = o
  extension (v: GtkOverlayLayoutClass_autoptr)
    inline def value: Ptr[GtkOverlayLayoutClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkoverlaylayout.h
*/
opaque type GtkOverlayLayoutClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkOverlayLayoutClass_listautoptr: 
  given _tag: Tag[GtkOverlayLayoutClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkOverlayLayoutClass_listautoptr = o
  extension (v: GtkOverlayLayoutClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkoverlaylayout.h
*/
opaque type GtkOverlayLayoutClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkOverlayLayoutClass_queueautoptr: 
  given _tag: Tag[GtkOverlayLayoutClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkOverlayLayoutClass_queueautoptr = o
  extension (v: GtkOverlayLayoutClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkoverlaylayout.h
*/
opaque type GtkOverlayLayoutClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkOverlayLayoutClass_slistautoptr: 
  given _tag: Tag[GtkOverlayLayoutClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkOverlayLayoutClass_slistautoptr = o
  extension (v: GtkOverlayLayoutClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkoverlaylayout.h
*/
opaque type GtkOverlayLayout_autoptr = Ptr[GtkOverlayLayout]
object GtkOverlayLayout_autoptr: 
  given _tag: Tag[GtkOverlayLayout_autoptr] = Tag.Ptr[GtkOverlayLayout](GtkOverlayLayout._tag)
  inline def apply(inline o: Ptr[GtkOverlayLayout]): GtkOverlayLayout_autoptr = o
  extension (v: GtkOverlayLayout_autoptr)
    inline def value: Ptr[GtkOverlayLayout] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkoverlaylayout.h
*/
opaque type GtkOverlayLayout_listautoptr = Ptr[_root_.glib.all.GList]
object GtkOverlayLayout_listautoptr: 
  given _tag: Tag[GtkOverlayLayout_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkOverlayLayout_listautoptr = o
  extension (v: GtkOverlayLayout_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkoverlaylayout.h
*/
opaque type GtkOverlayLayout_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkOverlayLayout_queueautoptr: 
  given _tag: Tag[GtkOverlayLayout_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkOverlayLayout_queueautoptr = o
  extension (v: GtkOverlayLayout_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkoverlaylayout.h
*/
opaque type GtkOverlayLayout_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkOverlayLayout_slistautoptr: 
  given _tag: Tag[GtkOverlayLayout_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkOverlayLayout_slistautoptr = o
  extension (v: GtkOverlayLayout_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkOverlay_autoptr = Ptr[GtkOverlay]
object GtkOverlay_autoptr: 
  given _tag: Tag[GtkOverlay_autoptr] = Tag.Ptr[GtkOverlay](GtkOverlay._tag)
  inline def apply(inline o: Ptr[GtkOverlay]): GtkOverlay_autoptr = o
  extension (v: GtkOverlay_autoptr)
    inline def value: Ptr[GtkOverlay] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkOverlay_listautoptr = Ptr[_root_.glib.all.GList]
object GtkOverlay_listautoptr: 
  given _tag: Tag[GtkOverlay_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkOverlay_listautoptr = o
  extension (v: GtkOverlay_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkOverlay_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkOverlay_queueautoptr: 
  given _tag: Tag[GtkOverlay_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkOverlay_queueautoptr = o
  extension (v: GtkOverlay_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkOverlay_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkOverlay_slistautoptr: 
  given _tag: Tag[GtkOverlay_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkOverlay_slistautoptr = o
  extension (v: GtkOverlay_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkPageSetupDoneFunc: gtk_print_run_page_setup_dialog_async()

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkprintoperation.h
*/
opaque type GtkPageSetupDoneFunc = CFuncPtr2[Ptr[GtkPageSetup], _root_.glib.all.gpointer, Unit]
object GtkPageSetupDoneFunc: 
  given _tag: Tag[GtkPageSetupDoneFunc] = Tag.materializeCFuncPtr2[Ptr[GtkPageSetup], _root_.glib.all.gpointer, Unit]
  inline def apply(inline o: CFuncPtr2[Ptr[GtkPageSetup], _root_.glib.all.gpointer, Unit]): GtkPageSetupDoneFunc = o
  extension (v: GtkPageSetupDoneFunc)
    inline def value: CFuncPtr2[Ptr[GtkPageSetup], _root_.glib.all.gpointer, Unit] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPageSetup_autoptr = Ptr[GtkPageSetup]
object GtkPageSetup_autoptr: 
  given _tag: Tag[GtkPageSetup_autoptr] = Tag.Ptr[GtkPageSetup](GtkPageSetup._tag)
  inline def apply(inline o: Ptr[GtkPageSetup]): GtkPageSetup_autoptr = o
  extension (v: GtkPageSetup_autoptr)
    inline def value: Ptr[GtkPageSetup] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPageSetup_listautoptr = Ptr[_root_.glib.all.GList]
object GtkPageSetup_listautoptr: 
  given _tag: Tag[GtkPageSetup_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkPageSetup_listautoptr = o
  extension (v: GtkPageSetup_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPageSetup_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkPageSetup_queueautoptr: 
  given _tag: Tag[GtkPageSetup_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkPageSetup_queueautoptr = o
  extension (v: GtkPageSetup_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPageSetup_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkPageSetup_slistautoptr: 
  given _tag: Tag[GtkPageSetup_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkPageSetup_slistautoptr = o
  extension (v: GtkPageSetup_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPaned_autoptr = Ptr[GtkPaned]
object GtkPaned_autoptr: 
  given _tag: Tag[GtkPaned_autoptr] = Tag.Ptr[GtkPaned](GtkPaned._tag)
  inline def apply(inline o: Ptr[GtkPaned]): GtkPaned_autoptr = o
  extension (v: GtkPaned_autoptr)
    inline def value: Ptr[GtkPaned] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPaned_listautoptr = Ptr[_root_.glib.all.GList]
object GtkPaned_listautoptr: 
  given _tag: Tag[GtkPaned_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkPaned_listautoptr = o
  extension (v: GtkPaned_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPaned_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkPaned_queueautoptr: 
  given _tag: Tag[GtkPaned_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkPaned_queueautoptr = o
  extension (v: GtkPaned_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPaned_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkPaned_slistautoptr: 
  given _tag: Tag[GtkPaned_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkPaned_slistautoptr = o
  extension (v: GtkPaned_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPaperSize_autoptr = Ptr[GtkPaperSize]
object GtkPaperSize_autoptr: 
  given _tag: Tag[GtkPaperSize_autoptr] = Tag.Ptr[GtkPaperSize](GtkPaperSize._tag)
  inline def apply(inline o: Ptr[GtkPaperSize]): GtkPaperSize_autoptr = o
  extension (v: GtkPaperSize_autoptr)
    inline def value: Ptr[GtkPaperSize] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPaperSize_listautoptr = Ptr[_root_.glib.all.GList]
object GtkPaperSize_listautoptr: 
  given _tag: Tag[GtkPaperSize_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkPaperSize_listautoptr = o
  extension (v: GtkPaperSize_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPaperSize_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkPaperSize_queueautoptr: 
  given _tag: Tag[GtkPaperSize_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkPaperSize_queueautoptr = o
  extension (v: GtkPaperSize_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPaperSize_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkPaperSize_slistautoptr: 
  given _tag: Tag[GtkPaperSize_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkPaperSize_slistautoptr = o
  extension (v: GtkPaperSize_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpasswordentrybuffer.h
*/
opaque type GtkPasswordEntryBufferClass_autoptr = Ptr[GtkPasswordEntryBufferClass]
object GtkPasswordEntryBufferClass_autoptr: 
  given _tag: Tag[GtkPasswordEntryBufferClass_autoptr] = Tag.Ptr[GtkPasswordEntryBufferClass](GtkPasswordEntryBufferClass._tag)
  inline def apply(inline o: Ptr[GtkPasswordEntryBufferClass]): GtkPasswordEntryBufferClass_autoptr = o
  extension (v: GtkPasswordEntryBufferClass_autoptr)
    inline def value: Ptr[GtkPasswordEntryBufferClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpasswordentrybuffer.h
*/
opaque type GtkPasswordEntryBufferClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkPasswordEntryBufferClass_listautoptr: 
  given _tag: Tag[GtkPasswordEntryBufferClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkPasswordEntryBufferClass_listautoptr = o
  extension (v: GtkPasswordEntryBufferClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpasswordentrybuffer.h
*/
opaque type GtkPasswordEntryBufferClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkPasswordEntryBufferClass_queueautoptr: 
  given _tag: Tag[GtkPasswordEntryBufferClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkPasswordEntryBufferClass_queueautoptr = o
  extension (v: GtkPasswordEntryBufferClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpasswordentrybuffer.h
*/
opaque type GtkPasswordEntryBufferClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkPasswordEntryBufferClass_slistautoptr: 
  given _tag: Tag[GtkPasswordEntryBufferClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkPasswordEntryBufferClass_slistautoptr = o
  extension (v: GtkPasswordEntryBufferClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpasswordentrybuffer.h
*/
opaque type GtkPasswordEntryBuffer_autoptr = Ptr[GtkPasswordEntryBuffer]
object GtkPasswordEntryBuffer_autoptr: 
  given _tag: Tag[GtkPasswordEntryBuffer_autoptr] = Tag.Ptr[GtkPasswordEntryBuffer](GtkPasswordEntryBuffer._tag)
  inline def apply(inline o: Ptr[GtkPasswordEntryBuffer]): GtkPasswordEntryBuffer_autoptr = o
  extension (v: GtkPasswordEntryBuffer_autoptr)
    inline def value: Ptr[GtkPasswordEntryBuffer] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpasswordentrybuffer.h
*/
opaque type GtkPasswordEntryBuffer_listautoptr = Ptr[_root_.glib.all.GList]
object GtkPasswordEntryBuffer_listautoptr: 
  given _tag: Tag[GtkPasswordEntryBuffer_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkPasswordEntryBuffer_listautoptr = o
  extension (v: GtkPasswordEntryBuffer_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpasswordentrybuffer.h
*/
opaque type GtkPasswordEntryBuffer_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkPasswordEntryBuffer_queueautoptr: 
  given _tag: Tag[GtkPasswordEntryBuffer_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkPasswordEntryBuffer_queueautoptr = o
  extension (v: GtkPasswordEntryBuffer_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpasswordentrybuffer.h
*/
opaque type GtkPasswordEntryBuffer_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkPasswordEntryBuffer_slistautoptr: 
  given _tag: Tag[GtkPasswordEntryBuffer_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkPasswordEntryBuffer_slistautoptr = o
  extension (v: GtkPasswordEntryBuffer_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpicture.h
*/
opaque type GtkPictureClass_autoptr = Ptr[GtkPictureClass]
object GtkPictureClass_autoptr: 
  given _tag: Tag[GtkPictureClass_autoptr] = Tag.Ptr[GtkPictureClass](GtkPictureClass._tag)
  inline def apply(inline o: Ptr[GtkPictureClass]): GtkPictureClass_autoptr = o
  extension (v: GtkPictureClass_autoptr)
    inline def value: Ptr[GtkPictureClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpicture.h
*/
opaque type GtkPictureClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkPictureClass_listautoptr: 
  given _tag: Tag[GtkPictureClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkPictureClass_listautoptr = o
  extension (v: GtkPictureClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpicture.h
*/
opaque type GtkPictureClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkPictureClass_queueautoptr: 
  given _tag: Tag[GtkPictureClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkPictureClass_queueautoptr = o
  extension (v: GtkPictureClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpicture.h
*/
opaque type GtkPictureClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkPictureClass_slistautoptr: 
  given _tag: Tag[GtkPictureClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkPictureClass_slistautoptr = o
  extension (v: GtkPictureClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpicture.h
*/
opaque type GtkPicture_autoptr = Ptr[GtkPicture]
object GtkPicture_autoptr: 
  given _tag: Tag[GtkPicture_autoptr] = Tag.Ptr[GtkPicture](GtkPicture._tag)
  inline def apply(inline o: Ptr[GtkPicture]): GtkPicture_autoptr = o
  extension (v: GtkPicture_autoptr)
    inline def value: Ptr[GtkPicture] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpicture.h
*/
opaque type GtkPicture_listautoptr = Ptr[_root_.glib.all.GList]
object GtkPicture_listautoptr: 
  given _tag: Tag[GtkPicture_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkPicture_listautoptr = o
  extension (v: GtkPicture_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpicture.h
*/
opaque type GtkPicture_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkPicture_queueautoptr: 
  given _tag: Tag[GtkPicture_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkPicture_queueautoptr = o
  extension (v: GtkPicture_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpicture.h
*/
opaque type GtkPicture_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkPicture_slistautoptr: 
  given _tag: Tag[GtkPicture_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkPicture_slistautoptr = o
  extension (v: GtkPicture_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPopoverMenu_autoptr = Ptr[GtkPopoverMenu]
object GtkPopoverMenu_autoptr: 
  given _tag: Tag[GtkPopoverMenu_autoptr] = Tag.Ptr[GtkPopoverMenu](GtkPopoverMenu._tag)
  inline def apply(inline o: Ptr[GtkPopoverMenu]): GtkPopoverMenu_autoptr = o
  extension (v: GtkPopoverMenu_autoptr)
    inline def value: Ptr[GtkPopoverMenu] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPopoverMenu_listautoptr = Ptr[_root_.glib.all.GList]
object GtkPopoverMenu_listautoptr: 
  given _tag: Tag[GtkPopoverMenu_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkPopoverMenu_listautoptr = o
  extension (v: GtkPopoverMenu_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPopoverMenu_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkPopoverMenu_queueautoptr: 
  given _tag: Tag[GtkPopoverMenu_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkPopoverMenu_queueautoptr = o
  extension (v: GtkPopoverMenu_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPopoverMenu_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkPopoverMenu_slistautoptr: 
  given _tag: Tag[GtkPopoverMenu_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkPopoverMenu_slistautoptr = o
  extension (v: GtkPopoverMenu_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPopover_autoptr = Ptr[GtkPopover]
object GtkPopover_autoptr: 
  given _tag: Tag[GtkPopover_autoptr] = Tag.Ptr[GtkPopover](GtkPopover._tag)
  inline def apply(inline o: Ptr[GtkPopover]): GtkPopover_autoptr = o
  extension (v: GtkPopover_autoptr)
    inline def value: Ptr[GtkPopover] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPopover_listautoptr = Ptr[_root_.glib.all.GList]
object GtkPopover_listautoptr: 
  given _tag: Tag[GtkPopover_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkPopover_listautoptr = o
  extension (v: GtkPopover_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPopover_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkPopover_queueautoptr: 
  given _tag: Tag[GtkPopover_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkPopover_queueautoptr = o
  extension (v: GtkPopover_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPopover_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkPopover_slistautoptr: 
  given _tag: Tag[GtkPopover_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkPopover_slistautoptr = o
  extension (v: GtkPopover_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPrintContext_autoptr = Ptr[GtkPrintContext]
object GtkPrintContext_autoptr: 
  given _tag: Tag[GtkPrintContext_autoptr] = Tag.Ptr[GtkPrintContext](GtkPrintContext._tag)
  inline def apply(inline o: Ptr[GtkPrintContext]): GtkPrintContext_autoptr = o
  extension (v: GtkPrintContext_autoptr)
    inline def value: Ptr[GtkPrintContext] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPrintContext_listautoptr = Ptr[_root_.glib.all.GList]
object GtkPrintContext_listautoptr: 
  given _tag: Tag[GtkPrintContext_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkPrintContext_listautoptr = o
  extension (v: GtkPrintContext_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPrintContext_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkPrintContext_queueautoptr: 
  given _tag: Tag[GtkPrintContext_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkPrintContext_queueautoptr = o
  extension (v: GtkPrintContext_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPrintContext_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkPrintContext_slistautoptr: 
  given _tag: Tag[GtkPrintContext_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkPrintContext_slistautoptr = o
  extension (v: GtkPrintContext_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPrintOperationPreview_autoptr = Ptr[GtkPrintOperationPreview]
object GtkPrintOperationPreview_autoptr: 
  given _tag: Tag[GtkPrintOperationPreview_autoptr] = Tag.Ptr[GtkPrintOperationPreview](GtkPrintOperationPreview._tag)
  inline def apply(inline o: Ptr[GtkPrintOperationPreview]): GtkPrintOperationPreview_autoptr = o
  extension (v: GtkPrintOperationPreview_autoptr)
    inline def value: Ptr[GtkPrintOperationPreview] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPrintOperationPreview_listautoptr = Ptr[_root_.glib.all.GList]
object GtkPrintOperationPreview_listautoptr: 
  given _tag: Tag[GtkPrintOperationPreview_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkPrintOperationPreview_listautoptr = o
  extension (v: GtkPrintOperationPreview_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPrintOperationPreview_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkPrintOperationPreview_queueautoptr: 
  given _tag: Tag[GtkPrintOperationPreview_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkPrintOperationPreview_queueautoptr = o
  extension (v: GtkPrintOperationPreview_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPrintOperationPreview_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkPrintOperationPreview_slistautoptr: 
  given _tag: Tag[GtkPrintOperationPreview_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkPrintOperationPreview_slistautoptr = o
  extension (v: GtkPrintOperationPreview_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPrintOperation_autoptr = Ptr[GtkPrintOperation]
object GtkPrintOperation_autoptr: 
  given _tag: Tag[GtkPrintOperation_autoptr] = Tag.Ptr[GtkPrintOperation](GtkPrintOperation._tag)
  inline def apply(inline o: Ptr[GtkPrintOperation]): GtkPrintOperation_autoptr = o
  extension (v: GtkPrintOperation_autoptr)
    inline def value: Ptr[GtkPrintOperation] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPrintOperation_listautoptr = Ptr[_root_.glib.all.GList]
object GtkPrintOperation_listautoptr: 
  given _tag: Tag[GtkPrintOperation_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkPrintOperation_listautoptr = o
  extension (v: GtkPrintOperation_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPrintOperation_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkPrintOperation_queueautoptr: 
  given _tag: Tag[GtkPrintOperation_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkPrintOperation_queueautoptr = o
  extension (v: GtkPrintOperation_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPrintOperation_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkPrintOperation_slistautoptr: 
  given _tag: Tag[GtkPrintOperation_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkPrintOperation_slistautoptr = o
  extension (v: GtkPrintOperation_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkprintsettings.h
*/
opaque type GtkPrintSettingsFunc = CFuncPtr3[CString, CString, _root_.glib.all.gpointer, Unit]
object GtkPrintSettingsFunc: 
  given _tag: Tag[GtkPrintSettingsFunc] = Tag.materializeCFuncPtr3[CString, CString, _root_.glib.all.gpointer, Unit]
  inline def apply(inline o: CFuncPtr3[CString, CString, _root_.glib.all.gpointer, Unit]): GtkPrintSettingsFunc = o
  extension (v: GtkPrintSettingsFunc)
    inline def value: CFuncPtr3[CString, CString, _root_.glib.all.gpointer, Unit] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPrintSettings_autoptr = Ptr[GtkPrintSettings]
object GtkPrintSettings_autoptr: 
  given _tag: Tag[GtkPrintSettings_autoptr] = Tag.Ptr[GtkPrintSettings](GtkPrintSettings._tag)
  inline def apply(inline o: Ptr[GtkPrintSettings]): GtkPrintSettings_autoptr = o
  extension (v: GtkPrintSettings_autoptr)
    inline def value: Ptr[GtkPrintSettings] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPrintSettings_listautoptr = Ptr[_root_.glib.all.GList]
object GtkPrintSettings_listautoptr: 
  given _tag: Tag[GtkPrintSettings_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkPrintSettings_listautoptr = o
  extension (v: GtkPrintSettings_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPrintSettings_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkPrintSettings_queueautoptr: 
  given _tag: Tag[GtkPrintSettings_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkPrintSettings_queueautoptr = o
  extension (v: GtkPrintSettings_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkPrintSettings_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkPrintSettings_slistautoptr: 
  given _tag: Tag[GtkPrintSettings_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkPrintSettings_slistautoptr = o
  extension (v: GtkPrintSettings_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkProgressBar_autoptr = Ptr[GtkProgressBar]
object GtkProgressBar_autoptr: 
  given _tag: Tag[GtkProgressBar_autoptr] = Tag.Ptr[GtkProgressBar](GtkProgressBar._tag)
  inline def apply(inline o: Ptr[GtkProgressBar]): GtkProgressBar_autoptr = o
  extension (v: GtkProgressBar_autoptr)
    inline def value: Ptr[GtkProgressBar] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkProgressBar_listautoptr = Ptr[_root_.glib.all.GList]
object GtkProgressBar_listautoptr: 
  given _tag: Tag[GtkProgressBar_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkProgressBar_listautoptr = o
  extension (v: GtkProgressBar_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkProgressBar_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkProgressBar_queueautoptr: 
  given _tag: Tag[GtkProgressBar_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkProgressBar_queueautoptr = o
  extension (v: GtkProgressBar_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkProgressBar_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkProgressBar_slistautoptr: 
  given _tag: Tag[GtkProgressBar_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkProgressBar_slistautoptr = o
  extension (v: GtkProgressBar_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkRange_autoptr = Ptr[GtkRange]
object GtkRange_autoptr: 
  given _tag: Tag[GtkRange_autoptr] = Tag.Ptr[GtkRange](GtkRange._tag)
  inline def apply(inline o: Ptr[GtkRange]): GtkRange_autoptr = o
  extension (v: GtkRange_autoptr)
    inline def value: Ptr[GtkRange] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkRange_listautoptr = Ptr[_root_.glib.all.GList]
object GtkRange_listautoptr: 
  given _tag: Tag[GtkRange_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkRange_listautoptr = o
  extension (v: GtkRange_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkRange_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkRange_queueautoptr: 
  given _tag: Tag[GtkRange_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkRange_queueautoptr = o
  extension (v: GtkRange_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkRange_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkRange_slistautoptr: 
  given _tag: Tag[GtkRange_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkRange_slistautoptr = o
  extension (v: GtkRange_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkRecentInfo_autoptr = Ptr[GtkRecentInfo]
object GtkRecentInfo_autoptr: 
  given _tag: Tag[GtkRecentInfo_autoptr] = Tag.Ptr[GtkRecentInfo](GtkRecentInfo._tag)
  inline def apply(inline o: Ptr[GtkRecentInfo]): GtkRecentInfo_autoptr = o
  extension (v: GtkRecentInfo_autoptr)
    inline def value: Ptr[GtkRecentInfo] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkRecentInfo_listautoptr = Ptr[_root_.glib.all.GList]
object GtkRecentInfo_listautoptr: 
  given _tag: Tag[GtkRecentInfo_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkRecentInfo_listautoptr = o
  extension (v: GtkRecentInfo_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkRecentInfo_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkRecentInfo_queueautoptr: 
  given _tag: Tag[GtkRecentInfo_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkRecentInfo_queueautoptr = o
  extension (v: GtkRecentInfo_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkRecentInfo_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkRecentInfo_slistautoptr: 
  given _tag: Tag[GtkRecentInfo_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkRecentInfo_slistautoptr = o
  extension (v: GtkRecentInfo_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkRecentManager_autoptr = Ptr[GtkRecentManager]
object GtkRecentManager_autoptr: 
  given _tag: Tag[GtkRecentManager_autoptr] = Tag.Ptr[GtkRecentManager](GtkRecentManager._tag)
  inline def apply(inline o: Ptr[GtkRecentManager]): GtkRecentManager_autoptr = o
  extension (v: GtkRecentManager_autoptr)
    inline def value: Ptr[GtkRecentManager] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkRecentManager_listautoptr = Ptr[_root_.glib.all.GList]
object GtkRecentManager_listautoptr: 
  given _tag: Tag[GtkRecentManager_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkRecentManager_listautoptr = o
  extension (v: GtkRecentManager_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkRecentManager_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkRecentManager_queueautoptr: 
  given _tag: Tag[GtkRecentManager_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkRecentManager_queueautoptr = o
  extension (v: GtkRecentManager_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkRecentManager_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkRecentManager_slistautoptr: 
  given _tag: Tag[GtkRecentManager_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkRecentManager_slistautoptr = o
  extension (v: GtkRecentManager_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidget.h
*/
opaque type GtkRequisition_autoptr = Ptr[GtkRequisition]
object GtkRequisition_autoptr: 
  given _tag: Tag[GtkRequisition_autoptr] = Tag.Ptr[GtkRequisition](GtkRequisition._tag)
  inline def apply(inline o: Ptr[GtkRequisition]): GtkRequisition_autoptr = o
  extension (v: GtkRequisition_autoptr)
    inline def value: Ptr[GtkRequisition] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidget.h
*/
opaque type GtkRequisition_listautoptr = Ptr[_root_.glib.all.GList]
object GtkRequisition_listautoptr: 
  given _tag: Tag[GtkRequisition_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkRequisition_listautoptr = o
  extension (v: GtkRequisition_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidget.h
*/
opaque type GtkRequisition_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkRequisition_queueautoptr: 
  given _tag: Tag[GtkRequisition_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkRequisition_queueautoptr = o
  extension (v: GtkRequisition_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidget.h
*/
opaque type GtkRequisition_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkRequisition_slistautoptr: 
  given _tag: Tag[GtkRequisition_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkRequisition_slistautoptr = o
  extension (v: GtkRequisition_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkRevealer_autoptr = Ptr[GtkRevealer]
object GtkRevealer_autoptr: 
  given _tag: Tag[GtkRevealer_autoptr] = Tag.Ptr[GtkRevealer](GtkRevealer._tag)
  inline def apply(inline o: Ptr[GtkRevealer]): GtkRevealer_autoptr = o
  extension (v: GtkRevealer_autoptr)
    inline def value: Ptr[GtkRevealer] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkRevealer_listautoptr = Ptr[_root_.glib.all.GList]
object GtkRevealer_listautoptr: 
  given _tag: Tag[GtkRevealer_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkRevealer_listautoptr = o
  extension (v: GtkRevealer_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkRevealer_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkRevealer_queueautoptr: 
  given _tag: Tag[GtkRevealer_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkRevealer_queueautoptr = o
  extension (v: GtkRevealer_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkRevealer_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkRevealer_slistautoptr: 
  given _tag: Tag[GtkRevealer_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkRevealer_slistautoptr = o
  extension (v: GtkRevealer_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkroot.h
*/
opaque type GtkRoot_autoptr = Ptr[GtkRoot]
object GtkRoot_autoptr: 
  given _tag: Tag[GtkRoot_autoptr] = Tag.Ptr[GtkRoot](GtkRoot._tag)
  inline def apply(inline o: Ptr[GtkRoot]): GtkRoot_autoptr = o
  extension (v: GtkRoot_autoptr)
    inline def value: Ptr[GtkRoot] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkroot.h
*/
opaque type GtkRoot_listautoptr = Ptr[_root_.glib.all.GList]
object GtkRoot_listautoptr: 
  given _tag: Tag[GtkRoot_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkRoot_listautoptr = o
  extension (v: GtkRoot_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkroot.h
*/
opaque type GtkRoot_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkRoot_queueautoptr: 
  given _tag: Tag[GtkRoot_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkRoot_queueautoptr = o
  extension (v: GtkRoot_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkroot.h
*/
opaque type GtkRoot_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkRoot_slistautoptr: 
  given _tag: Tag[GtkRoot_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkRoot_slistautoptr = o
  extension (v: GtkRoot_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkScaleButton_autoptr = Ptr[GtkScaleButton]
object GtkScaleButton_autoptr: 
  given _tag: Tag[GtkScaleButton_autoptr] = Tag.Ptr[GtkScaleButton](GtkScaleButton._tag)
  inline def apply(inline o: Ptr[GtkScaleButton]): GtkScaleButton_autoptr = o
  extension (v: GtkScaleButton_autoptr)
    inline def value: Ptr[GtkScaleButton] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkScaleButton_listautoptr = Ptr[_root_.glib.all.GList]
object GtkScaleButton_listautoptr: 
  given _tag: Tag[GtkScaleButton_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkScaleButton_listautoptr = o
  extension (v: GtkScaleButton_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkScaleButton_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkScaleButton_queueautoptr: 
  given _tag: Tag[GtkScaleButton_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkScaleButton_queueautoptr = o
  extension (v: GtkScaleButton_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkScaleButton_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkScaleButton_slistautoptr: 
  given _tag: Tag[GtkScaleButton_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkScaleButton_slistautoptr = o
  extension (v: GtkScaleButton_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkScaleFormatValueFunc: : The `GtkScale` : The numeric value to format _data: (closure): user data

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkscale.h
*/
opaque type GtkScaleFormatValueFunc = CFuncPtr3[Ptr[GtkScale], Double, _root_.glib.all.gpointer, CString]
object GtkScaleFormatValueFunc: 
  given _tag: Tag[GtkScaleFormatValueFunc] = Tag.materializeCFuncPtr3[Ptr[GtkScale], Double, _root_.glib.all.gpointer, CString]
  inline def apply(inline o: CFuncPtr3[Ptr[GtkScale], Double, _root_.glib.all.gpointer, CString]): GtkScaleFormatValueFunc = o
  extension (v: GtkScaleFormatValueFunc)
    inline def value: CFuncPtr3[Ptr[GtkScale], Double, _root_.glib.all.gpointer, CString] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkScale_autoptr = Ptr[GtkScale]
object GtkScale_autoptr: 
  given _tag: Tag[GtkScale_autoptr] = Tag.Ptr[GtkScale](GtkScale._tag)
  inline def apply(inline o: Ptr[GtkScale]): GtkScale_autoptr = o
  extension (v: GtkScale_autoptr)
    inline def value: Ptr[GtkScale] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkScale_listautoptr = Ptr[_root_.glib.all.GList]
object GtkScale_listautoptr: 
  given _tag: Tag[GtkScale_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkScale_listautoptr = o
  extension (v: GtkScale_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkScale_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkScale_queueautoptr: 
  given _tag: Tag[GtkScale_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkScale_queueautoptr = o
  extension (v: GtkScale_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkScale_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkScale_slistautoptr: 
  given _tag: Tag[GtkScale_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkScale_slistautoptr = o
  extension (v: GtkScale_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkScrollable_autoptr = Ptr[GtkScrollable]
object GtkScrollable_autoptr: 
  given _tag: Tag[GtkScrollable_autoptr] = Tag.Ptr[GtkScrollable](GtkScrollable._tag)
  inline def apply(inline o: Ptr[GtkScrollable]): GtkScrollable_autoptr = o
  extension (v: GtkScrollable_autoptr)
    inline def value: Ptr[GtkScrollable] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkScrollable_listautoptr = Ptr[_root_.glib.all.GList]
object GtkScrollable_listautoptr: 
  given _tag: Tag[GtkScrollable_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkScrollable_listautoptr = o
  extension (v: GtkScrollable_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkScrollable_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkScrollable_queueautoptr: 
  given _tag: Tag[GtkScrollable_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkScrollable_queueautoptr = o
  extension (v: GtkScrollable_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkScrollable_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkScrollable_slistautoptr: 
  given _tag: Tag[GtkScrollable_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkScrollable_slistautoptr = o
  extension (v: GtkScrollable_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkScrollbar_autoptr = Ptr[GtkScrollbar]
object GtkScrollbar_autoptr: 
  given _tag: Tag[GtkScrollbar_autoptr] = Tag.Ptr[GtkScrollbar](GtkScrollbar._tag)
  inline def apply(inline o: Ptr[GtkScrollbar]): GtkScrollbar_autoptr = o
  extension (v: GtkScrollbar_autoptr)
    inline def value: Ptr[GtkScrollbar] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkScrollbar_listautoptr = Ptr[_root_.glib.all.GList]
object GtkScrollbar_listautoptr: 
  given _tag: Tag[GtkScrollbar_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkScrollbar_listautoptr = o
  extension (v: GtkScrollbar_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkScrollbar_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkScrollbar_queueautoptr: 
  given _tag: Tag[GtkScrollbar_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkScrollbar_queueautoptr = o
  extension (v: GtkScrollbar_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkScrollbar_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkScrollbar_slistautoptr: 
  given _tag: Tag[GtkScrollbar_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkScrollbar_slistautoptr = o
  extension (v: GtkScrollbar_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkScrolledWindow_autoptr = Ptr[GtkScrolledWindow]
object GtkScrolledWindow_autoptr: 
  given _tag: Tag[GtkScrolledWindow_autoptr] = Tag.Ptr[GtkScrolledWindow](GtkScrolledWindow._tag)
  inline def apply(inline o: Ptr[GtkScrolledWindow]): GtkScrolledWindow_autoptr = o
  extension (v: GtkScrolledWindow_autoptr)
    inline def value: Ptr[GtkScrolledWindow] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkScrolledWindow_listautoptr = Ptr[_root_.glib.all.GList]
object GtkScrolledWindow_listautoptr: 
  given _tag: Tag[GtkScrolledWindow_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkScrolledWindow_listautoptr = o
  extension (v: GtkScrolledWindow_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkScrolledWindow_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkScrolledWindow_queueautoptr: 
  given _tag: Tag[GtkScrolledWindow_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkScrolledWindow_queueautoptr = o
  extension (v: GtkScrolledWindow_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkScrolledWindow_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkScrolledWindow_slistautoptr: 
  given _tag: Tag[GtkScrolledWindow_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkScrolledWindow_slistautoptr = o
  extension (v: GtkScrolledWindow_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSearchBar_autoptr = Ptr[GtkSearchBar]
object GtkSearchBar_autoptr: 
  given _tag: Tag[GtkSearchBar_autoptr] = Tag.Ptr[GtkSearchBar](GtkSearchBar._tag)
  inline def apply(inline o: Ptr[GtkSearchBar]): GtkSearchBar_autoptr = o
  extension (v: GtkSearchBar_autoptr)
    inline def value: Ptr[GtkSearchBar] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSearchBar_listautoptr = Ptr[_root_.glib.all.GList]
object GtkSearchBar_listautoptr: 
  given _tag: Tag[GtkSearchBar_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkSearchBar_listautoptr = o
  extension (v: GtkSearchBar_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSearchBar_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkSearchBar_queueautoptr: 
  given _tag: Tag[GtkSearchBar_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkSearchBar_queueautoptr = o
  extension (v: GtkSearchBar_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSearchBar_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkSearchBar_slistautoptr: 
  given _tag: Tag[GtkSearchBar_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkSearchBar_slistautoptr = o
  extension (v: GtkSearchBar_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSearchEntry_autoptr = Ptr[GtkSearchEntry]
object GtkSearchEntry_autoptr: 
  given _tag: Tag[GtkSearchEntry_autoptr] = Tag.Ptr[GtkSearchEntry](GtkSearchEntry._tag)
  inline def apply(inline o: Ptr[GtkSearchEntry]): GtkSearchEntry_autoptr = o
  extension (v: GtkSearchEntry_autoptr)
    inline def value: Ptr[GtkSearchEntry] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSearchEntry_listautoptr = Ptr[_root_.glib.all.GList]
object GtkSearchEntry_listautoptr: 
  given _tag: Tag[GtkSearchEntry_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkSearchEntry_listautoptr = o
  extension (v: GtkSearchEntry_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSearchEntry_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkSearchEntry_queueautoptr: 
  given _tag: Tag[GtkSearchEntry_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkSearchEntry_queueautoptr = o
  extension (v: GtkSearchEntry_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSearchEntry_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkSearchEntry_slistautoptr: 
  given _tag: Tag[GtkSearchEntry_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkSearchEntry_slistautoptr = o
  extension (v: GtkSearchEntry_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkselectionfiltermodel.h
*/
opaque type GtkSelectionFilterModelClass_autoptr = Ptr[GtkSelectionFilterModelClass]
object GtkSelectionFilterModelClass_autoptr: 
  given _tag: Tag[GtkSelectionFilterModelClass_autoptr] = Tag.Ptr[GtkSelectionFilterModelClass](GtkSelectionFilterModelClass._tag)
  inline def apply(inline o: Ptr[GtkSelectionFilterModelClass]): GtkSelectionFilterModelClass_autoptr = o
  extension (v: GtkSelectionFilterModelClass_autoptr)
    inline def value: Ptr[GtkSelectionFilterModelClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkselectionfiltermodel.h
*/
opaque type GtkSelectionFilterModelClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkSelectionFilterModelClass_listautoptr: 
  given _tag: Tag[GtkSelectionFilterModelClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkSelectionFilterModelClass_listautoptr = o
  extension (v: GtkSelectionFilterModelClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkselectionfiltermodel.h
*/
opaque type GtkSelectionFilterModelClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkSelectionFilterModelClass_queueautoptr: 
  given _tag: Tag[GtkSelectionFilterModelClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkSelectionFilterModelClass_queueautoptr = o
  extension (v: GtkSelectionFilterModelClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkselectionfiltermodel.h
*/
opaque type GtkSelectionFilterModelClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkSelectionFilterModelClass_slistautoptr: 
  given _tag: Tag[GtkSelectionFilterModelClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkSelectionFilterModelClass_slistautoptr = o
  extension (v: GtkSelectionFilterModelClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkselectionfiltermodel.h
*/
opaque type GtkSelectionFilterModel_autoptr = Ptr[GtkSelectionFilterModel]
object GtkSelectionFilterModel_autoptr: 
  given _tag: Tag[GtkSelectionFilterModel_autoptr] = Tag.Ptr[GtkSelectionFilterModel](GtkSelectionFilterModel._tag)
  inline def apply(inline o: Ptr[GtkSelectionFilterModel]): GtkSelectionFilterModel_autoptr = o
  extension (v: GtkSelectionFilterModel_autoptr)
    inline def value: Ptr[GtkSelectionFilterModel] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkselectionfiltermodel.h
*/
opaque type GtkSelectionFilterModel_listautoptr = Ptr[_root_.glib.all.GList]
object GtkSelectionFilterModel_listautoptr: 
  given _tag: Tag[GtkSelectionFilterModel_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkSelectionFilterModel_listautoptr = o
  extension (v: GtkSelectionFilterModel_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkselectionfiltermodel.h
*/
opaque type GtkSelectionFilterModel_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkSelectionFilterModel_queueautoptr: 
  given _tag: Tag[GtkSelectionFilterModel_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkSelectionFilterModel_queueautoptr = o
  extension (v: GtkSelectionFilterModel_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkselectionfiltermodel.h
*/
opaque type GtkSelectionFilterModel_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkSelectionFilterModel_slistautoptr: 
  given _tag: Tag[GtkSelectionFilterModel_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkSelectionFilterModel_slistautoptr = o
  extension (v: GtkSelectionFilterModel_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkselectionmodel.h
*/
opaque type GtkSelectionModel_autoptr = Ptr[GtkSelectionModel]
object GtkSelectionModel_autoptr: 
  given _tag: Tag[GtkSelectionModel_autoptr] = Tag.Ptr[GtkSelectionModel](GtkSelectionModel._tag)
  inline def apply(inline o: Ptr[GtkSelectionModel]): GtkSelectionModel_autoptr = o
  extension (v: GtkSelectionModel_autoptr)
    inline def value: Ptr[GtkSelectionModel] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkselectionmodel.h
*/
opaque type GtkSelectionModel_listautoptr = Ptr[_root_.glib.all.GList]
object GtkSelectionModel_listautoptr: 
  given _tag: Tag[GtkSelectionModel_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkSelectionModel_listautoptr = o
  extension (v: GtkSelectionModel_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkselectionmodel.h
*/
opaque type GtkSelectionModel_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkSelectionModel_queueautoptr: 
  given _tag: Tag[GtkSelectionModel_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkSelectionModel_queueautoptr = o
  extension (v: GtkSelectionModel_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkselectionmodel.h
*/
opaque type GtkSelectionModel_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkSelectionModel_slistautoptr: 
  given _tag: Tag[GtkSelectionModel_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkSelectionModel_slistautoptr = o
  extension (v: GtkSelectionModel_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSeparator_autoptr = Ptr[GtkSeparator]
object GtkSeparator_autoptr: 
  given _tag: Tag[GtkSeparator_autoptr] = Tag.Ptr[GtkSeparator](GtkSeparator._tag)
  inline def apply(inline o: Ptr[GtkSeparator]): GtkSeparator_autoptr = o
  extension (v: GtkSeparator_autoptr)
    inline def value: Ptr[GtkSeparator] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSeparator_listautoptr = Ptr[_root_.glib.all.GList]
object GtkSeparator_listautoptr: 
  given _tag: Tag[GtkSeparator_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkSeparator_listautoptr = o
  extension (v: GtkSeparator_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSeparator_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkSeparator_queueautoptr: 
  given _tag: Tag[GtkSeparator_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkSeparator_queueautoptr = o
  extension (v: GtkSeparator_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSeparator_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkSeparator_slistautoptr: 
  given _tag: Tag[GtkSeparator_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkSeparator_slistautoptr = o
  extension (v: GtkSeparator_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSettings_autoptr = Ptr[GtkSettings]
object GtkSettings_autoptr: 
  given _tag: Tag[GtkSettings_autoptr] = Tag.Ptr[GtkSettings](GtkSettings._tag)
  inline def apply(inline o: Ptr[GtkSettings]): GtkSettings_autoptr = o
  extension (v: GtkSettings_autoptr)
    inline def value: Ptr[GtkSettings] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSettings_listautoptr = Ptr[_root_.glib.all.GList]
object GtkSettings_listautoptr: 
  given _tag: Tag[GtkSettings_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkSettings_listautoptr = o
  extension (v: GtkSettings_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSettings_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkSettings_queueautoptr: 
  given _tag: Tag[GtkSettings_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkSettings_queueautoptr = o
  extension (v: GtkSettings_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSettings_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkSettings_slistautoptr: 
  given _tag: Tag[GtkSettings_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkSettings_slistautoptr = o
  extension (v: GtkSettings_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkShortcutActionClass_autoptr = Ptr[GtkShortcutActionClass]
object GtkShortcutActionClass_autoptr: 
  given _tag: Tag[GtkShortcutActionClass_autoptr] = Tag.Ptr[GtkShortcutActionClass](GtkShortcutActionClass._tag)
  inline def apply(inline o: Ptr[GtkShortcutActionClass]): GtkShortcutActionClass_autoptr = o
  extension (v: GtkShortcutActionClass_autoptr)
    inline def value: Ptr[GtkShortcutActionClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkShortcutActionClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkShortcutActionClass_listautoptr: 
  given _tag: Tag[GtkShortcutActionClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkShortcutActionClass_listautoptr = o
  extension (v: GtkShortcutActionClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkShortcutActionClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkShortcutActionClass_queueautoptr: 
  given _tag: Tag[GtkShortcutActionClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkShortcutActionClass_queueautoptr = o
  extension (v: GtkShortcutActionClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkShortcutActionClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkShortcutActionClass_slistautoptr: 
  given _tag: Tag[GtkShortcutActionClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkShortcutActionClass_slistautoptr = o
  extension (v: GtkShortcutActionClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkShortcutAction_autoptr = Ptr[GtkShortcutAction]
object GtkShortcutAction_autoptr: 
  given _tag: Tag[GtkShortcutAction_autoptr] = Tag.Ptr[GtkShortcutAction](GtkShortcutAction._tag)
  inline def apply(inline o: Ptr[GtkShortcutAction]): GtkShortcutAction_autoptr = o
  extension (v: GtkShortcutAction_autoptr)
    inline def value: Ptr[GtkShortcutAction] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkShortcutAction_listautoptr = Ptr[_root_.glib.all.GList]
object GtkShortcutAction_listautoptr: 
  given _tag: Tag[GtkShortcutAction_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkShortcutAction_listautoptr = o
  extension (v: GtkShortcutAction_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkShortcutAction_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkShortcutAction_queueautoptr: 
  given _tag: Tag[GtkShortcutAction_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkShortcutAction_queueautoptr = o
  extension (v: GtkShortcutAction_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkShortcutAction_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkShortcutAction_slistautoptr: 
  given _tag: Tag[GtkShortcutAction_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkShortcutAction_slistautoptr = o
  extension (v: GtkShortcutAction_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcut.h
*/
opaque type GtkShortcutClass_autoptr = Ptr[GtkShortcutClass]
object GtkShortcutClass_autoptr: 
  given _tag: Tag[GtkShortcutClass_autoptr] = Tag.Ptr[GtkShortcutClass](GtkShortcutClass._tag)
  inline def apply(inline o: Ptr[GtkShortcutClass]): GtkShortcutClass_autoptr = o
  extension (v: GtkShortcutClass_autoptr)
    inline def value: Ptr[GtkShortcutClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcut.h
*/
opaque type GtkShortcutClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkShortcutClass_listautoptr: 
  given _tag: Tag[GtkShortcutClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkShortcutClass_listautoptr = o
  extension (v: GtkShortcutClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcut.h
*/
opaque type GtkShortcutClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkShortcutClass_queueautoptr: 
  given _tag: Tag[GtkShortcutClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkShortcutClass_queueautoptr = o
  extension (v: GtkShortcutClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcut.h
*/
opaque type GtkShortcutClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkShortcutClass_slistautoptr: 
  given _tag: Tag[GtkShortcutClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkShortcutClass_slistautoptr = o
  extension (v: GtkShortcutClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkShortcutFunc: : The widget passed to the activation

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkShortcutFunc = CFuncPtr3[Ptr[GtkWidget], Ptr[_root_.glib.all.GVariant], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
object GtkShortcutFunc: 
  given _tag: Tag[GtkShortcutFunc] = Tag.materializeCFuncPtr3[Ptr[GtkWidget], Ptr[_root_.glib.all.GVariant], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
  inline def apply(inline o: CFuncPtr3[Ptr[GtkWidget], Ptr[_root_.glib.all.GVariant], _root_.glib.all.gpointer, _root_.glib.all.gboolean]): GtkShortcutFunc = o
  extension (v: GtkShortcutFunc)
    inline def value: CFuncPtr3[Ptr[GtkWidget], Ptr[_root_.glib.all.GVariant], _root_.glib.all.gpointer, _root_.glib.all.gboolean] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutmanager.h
*/
opaque type GtkShortcutManager_autoptr = Ptr[GtkShortcutManager]
object GtkShortcutManager_autoptr: 
  given _tag: Tag[GtkShortcutManager_autoptr] = Tag.Ptr[GtkShortcutManager](GtkShortcutManager._tag)
  inline def apply(inline o: Ptr[GtkShortcutManager]): GtkShortcutManager_autoptr = o
  extension (v: GtkShortcutManager_autoptr)
    inline def value: Ptr[GtkShortcutManager] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutmanager.h
*/
opaque type GtkShortcutManager_listautoptr = Ptr[_root_.glib.all.GList]
object GtkShortcutManager_listautoptr: 
  given _tag: Tag[GtkShortcutManager_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkShortcutManager_listautoptr = o
  extension (v: GtkShortcutManager_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutmanager.h
*/
opaque type GtkShortcutManager_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkShortcutManager_queueautoptr: 
  given _tag: Tag[GtkShortcutManager_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkShortcutManager_queueautoptr = o
  extension (v: GtkShortcutManager_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutmanager.h
*/
opaque type GtkShortcutManager_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkShortcutManager_slistautoptr: 
  given _tag: Tag[GtkShortcutManager_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkShortcutManager_slistautoptr = o
  extension (v: GtkShortcutManager_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkShortcutTriggerClass_autoptr = Ptr[GtkShortcutTriggerClass]
object GtkShortcutTriggerClass_autoptr: 
  given _tag: Tag[GtkShortcutTriggerClass_autoptr] = Tag.Ptr[GtkShortcutTriggerClass](GtkShortcutTriggerClass._tag)
  inline def apply(inline o: Ptr[GtkShortcutTriggerClass]): GtkShortcutTriggerClass_autoptr = o
  extension (v: GtkShortcutTriggerClass_autoptr)
    inline def value: Ptr[GtkShortcutTriggerClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkShortcutTriggerClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkShortcutTriggerClass_listautoptr: 
  given _tag: Tag[GtkShortcutTriggerClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkShortcutTriggerClass_listautoptr = o
  extension (v: GtkShortcutTriggerClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkShortcutTriggerClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkShortcutTriggerClass_queueautoptr: 
  given _tag: Tag[GtkShortcutTriggerClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkShortcutTriggerClass_queueautoptr = o
  extension (v: GtkShortcutTriggerClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkShortcutTriggerClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkShortcutTriggerClass_slistautoptr: 
  given _tag: Tag[GtkShortcutTriggerClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkShortcutTriggerClass_slistautoptr = o
  extension (v: GtkShortcutTriggerClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkShortcutTrigger_autoptr = Ptr[GtkShortcutTrigger]
object GtkShortcutTrigger_autoptr: 
  given _tag: Tag[GtkShortcutTrigger_autoptr] = Tag.Ptr[GtkShortcutTrigger](GtkShortcutTrigger._tag)
  inline def apply(inline o: Ptr[GtkShortcutTrigger]): GtkShortcutTrigger_autoptr = o
  extension (v: GtkShortcutTrigger_autoptr)
    inline def value: Ptr[GtkShortcutTrigger] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkShortcutTrigger_listautoptr = Ptr[_root_.glib.all.GList]
object GtkShortcutTrigger_listautoptr: 
  given _tag: Tag[GtkShortcutTrigger_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkShortcutTrigger_listautoptr = o
  extension (v: GtkShortcutTrigger_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkShortcutTrigger_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkShortcutTrigger_queueautoptr: 
  given _tag: Tag[GtkShortcutTrigger_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkShortcutTrigger_queueautoptr = o
  extension (v: GtkShortcutTrigger_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkShortcutTrigger_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkShortcutTrigger_slistautoptr: 
  given _tag: Tag[GtkShortcutTrigger_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkShortcutTrigger_slistautoptr = o
  extension (v: GtkShortcutTrigger_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcut.h
*/
opaque type GtkShortcut_autoptr = Ptr[GtkShortcut]
object GtkShortcut_autoptr: 
  given _tag: Tag[GtkShortcut_autoptr] = Tag.Ptr[GtkShortcut](GtkShortcut._tag)
  inline def apply(inline o: Ptr[GtkShortcut]): GtkShortcut_autoptr = o
  extension (v: GtkShortcut_autoptr)
    inline def value: Ptr[GtkShortcut] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcut.h
*/
opaque type GtkShortcut_listautoptr = Ptr[_root_.glib.all.GList]
object GtkShortcut_listautoptr: 
  given _tag: Tag[GtkShortcut_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkShortcut_listautoptr = o
  extension (v: GtkShortcut_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcut.h
*/
opaque type GtkShortcut_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkShortcut_queueautoptr: 
  given _tag: Tag[GtkShortcut_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkShortcut_queueautoptr = o
  extension (v: GtkShortcut_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcut.h
*/
opaque type GtkShortcut_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkShortcut_slistautoptr: 
  given _tag: Tag[GtkShortcut_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkShortcut_slistautoptr = o
  extension (v: GtkShortcut_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutswindow.h
*/
opaque type GtkShortcutsWindow_autoptr = Ptr[GtkShortcutsWindow]
object GtkShortcutsWindow_autoptr: 
  given _tag: Tag[GtkShortcutsWindow_autoptr] = Tag.Ptr[GtkShortcutsWindow](GtkShortcutsWindow._tag)
  inline def apply(inline o: Ptr[GtkShortcutsWindow]): GtkShortcutsWindow_autoptr = o
  extension (v: GtkShortcutsWindow_autoptr)
    inline def value: Ptr[GtkShortcutsWindow] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutswindow.h
*/
opaque type GtkShortcutsWindow_listautoptr = Ptr[_root_.glib.all.GList]
object GtkShortcutsWindow_listautoptr: 
  given _tag: Tag[GtkShortcutsWindow_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkShortcutsWindow_listautoptr = o
  extension (v: GtkShortcutsWindow_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutswindow.h
*/
opaque type GtkShortcutsWindow_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkShortcutsWindow_queueautoptr: 
  given _tag: Tag[GtkShortcutsWindow_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkShortcutsWindow_queueautoptr = o
  extension (v: GtkShortcutsWindow_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutswindow.h
*/
opaque type GtkShortcutsWindow_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkShortcutsWindow_slistautoptr: 
  given _tag: Tag[GtkShortcutsWindow_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkShortcutsWindow_slistautoptr = o
  extension (v: GtkShortcutsWindow_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkSignalActionClass_autoptr = Ptr[GtkSignalActionClass]
object GtkSignalActionClass_autoptr: 
  given _tag: Tag[GtkSignalActionClass_autoptr] = Tag.Ptr[GtkSignalActionClass](GtkSignalActionClass._tag)
  inline def apply(inline o: Ptr[GtkSignalActionClass]): GtkSignalActionClass_autoptr = o
  extension (v: GtkSignalActionClass_autoptr)
    inline def value: Ptr[GtkSignalActionClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkSignalActionClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkSignalActionClass_listautoptr: 
  given _tag: Tag[GtkSignalActionClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkSignalActionClass_listautoptr = o
  extension (v: GtkSignalActionClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkSignalActionClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkSignalActionClass_queueautoptr: 
  given _tag: Tag[GtkSignalActionClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkSignalActionClass_queueautoptr = o
  extension (v: GtkSignalActionClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkSignalActionClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkSignalActionClass_slistautoptr: 
  given _tag: Tag[GtkSignalActionClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkSignalActionClass_slistautoptr = o
  extension (v: GtkSignalActionClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkSignalAction_autoptr = Ptr[GtkSignalAction]
object GtkSignalAction_autoptr: 
  given _tag: Tag[GtkSignalAction_autoptr] = Tag.Ptr[GtkSignalAction](GtkSignalAction._tag)
  inline def apply(inline o: Ptr[GtkSignalAction]): GtkSignalAction_autoptr = o
  extension (v: GtkSignalAction_autoptr)
    inline def value: Ptr[GtkSignalAction] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkSignalAction_listautoptr = Ptr[_root_.glib.all.GList]
object GtkSignalAction_listautoptr: 
  given _tag: Tag[GtkSignalAction_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkSignalAction_listautoptr = o
  extension (v: GtkSignalAction_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkSignalAction_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkSignalAction_queueautoptr: 
  given _tag: Tag[GtkSignalAction_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkSignalAction_queueautoptr = o
  extension (v: GtkSignalAction_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkSignalAction_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkSignalAction_slistautoptr: 
  given _tag: Tag[GtkSignalAction_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkSignalAction_slistautoptr = o
  extension (v: GtkSignalAction_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksingleselection.h
*/
opaque type GtkSingleSelectionClass_autoptr = Ptr[GtkSingleSelectionClass]
object GtkSingleSelectionClass_autoptr: 
  given _tag: Tag[GtkSingleSelectionClass_autoptr] = Tag.Ptr[GtkSingleSelectionClass](GtkSingleSelectionClass._tag)
  inline def apply(inline o: Ptr[GtkSingleSelectionClass]): GtkSingleSelectionClass_autoptr = o
  extension (v: GtkSingleSelectionClass_autoptr)
    inline def value: Ptr[GtkSingleSelectionClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksingleselection.h
*/
opaque type GtkSingleSelectionClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkSingleSelectionClass_listautoptr: 
  given _tag: Tag[GtkSingleSelectionClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkSingleSelectionClass_listautoptr = o
  extension (v: GtkSingleSelectionClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksingleselection.h
*/
opaque type GtkSingleSelectionClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkSingleSelectionClass_queueautoptr: 
  given _tag: Tag[GtkSingleSelectionClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkSingleSelectionClass_queueautoptr = o
  extension (v: GtkSingleSelectionClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksingleselection.h
*/
opaque type GtkSingleSelectionClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkSingleSelectionClass_slistautoptr: 
  given _tag: Tag[GtkSingleSelectionClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkSingleSelectionClass_slistautoptr = o
  extension (v: GtkSingleSelectionClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksingleselection.h
*/
opaque type GtkSingleSelection_autoptr = Ptr[GtkSingleSelection]
object GtkSingleSelection_autoptr: 
  given _tag: Tag[GtkSingleSelection_autoptr] = Tag.Ptr[GtkSingleSelection](GtkSingleSelection._tag)
  inline def apply(inline o: Ptr[GtkSingleSelection]): GtkSingleSelection_autoptr = o
  extension (v: GtkSingleSelection_autoptr)
    inline def value: Ptr[GtkSingleSelection] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksingleselection.h
*/
opaque type GtkSingleSelection_listautoptr = Ptr[_root_.glib.all.GList]
object GtkSingleSelection_listautoptr: 
  given _tag: Tag[GtkSingleSelection_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkSingleSelection_listautoptr = o
  extension (v: GtkSingleSelection_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksingleselection.h
*/
opaque type GtkSingleSelection_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkSingleSelection_queueautoptr: 
  given _tag: Tag[GtkSingleSelection_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkSingleSelection_queueautoptr = o
  extension (v: GtkSingleSelection_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksingleselection.h
*/
opaque type GtkSingleSelection_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkSingleSelection_slistautoptr: 
  given _tag: Tag[GtkSingleSelection_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkSingleSelection_slistautoptr = o
  extension (v: GtkSingleSelection_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSizeGroup_autoptr = Ptr[GtkSizeGroup]
object GtkSizeGroup_autoptr: 
  given _tag: Tag[GtkSizeGroup_autoptr] = Tag.Ptr[GtkSizeGroup](GtkSizeGroup._tag)
  inline def apply(inline o: Ptr[GtkSizeGroup]): GtkSizeGroup_autoptr = o
  extension (v: GtkSizeGroup_autoptr)
    inline def value: Ptr[GtkSizeGroup] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSizeGroup_listautoptr = Ptr[_root_.glib.all.GList]
object GtkSizeGroup_listautoptr: 
  given _tag: Tag[GtkSizeGroup_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkSizeGroup_listautoptr = o
  extension (v: GtkSizeGroup_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSizeGroup_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkSizeGroup_queueautoptr: 
  given _tag: Tag[GtkSizeGroup_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkSizeGroup_queueautoptr = o
  extension (v: GtkSizeGroup_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSizeGroup_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkSizeGroup_slistautoptr: 
  given _tag: Tag[GtkSizeGroup_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkSizeGroup_slistautoptr = o
  extension (v: GtkSizeGroup_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkslicelistmodel.h
*/
opaque type GtkSliceListModelClass_autoptr = Ptr[GtkSliceListModelClass]
object GtkSliceListModelClass_autoptr: 
  given _tag: Tag[GtkSliceListModelClass_autoptr] = Tag.Ptr[GtkSliceListModelClass](GtkSliceListModelClass._tag)
  inline def apply(inline o: Ptr[GtkSliceListModelClass]): GtkSliceListModelClass_autoptr = o
  extension (v: GtkSliceListModelClass_autoptr)
    inline def value: Ptr[GtkSliceListModelClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkslicelistmodel.h
*/
opaque type GtkSliceListModelClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkSliceListModelClass_listautoptr: 
  given _tag: Tag[GtkSliceListModelClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkSliceListModelClass_listautoptr = o
  extension (v: GtkSliceListModelClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkslicelistmodel.h
*/
opaque type GtkSliceListModelClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkSliceListModelClass_queueautoptr: 
  given _tag: Tag[GtkSliceListModelClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkSliceListModelClass_queueautoptr = o
  extension (v: GtkSliceListModelClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkslicelistmodel.h
*/
opaque type GtkSliceListModelClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkSliceListModelClass_slistautoptr: 
  given _tag: Tag[GtkSliceListModelClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkSliceListModelClass_slistautoptr = o
  extension (v: GtkSliceListModelClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkslicelistmodel.h
*/
opaque type GtkSliceListModel_autoptr = Ptr[GtkSliceListModel]
object GtkSliceListModel_autoptr: 
  given _tag: Tag[GtkSliceListModel_autoptr] = Tag.Ptr[GtkSliceListModel](GtkSliceListModel._tag)
  inline def apply(inline o: Ptr[GtkSliceListModel]): GtkSliceListModel_autoptr = o
  extension (v: GtkSliceListModel_autoptr)
    inline def value: Ptr[GtkSliceListModel] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkslicelistmodel.h
*/
opaque type GtkSliceListModel_listautoptr = Ptr[_root_.glib.all.GList]
object GtkSliceListModel_listautoptr: 
  given _tag: Tag[GtkSliceListModel_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkSliceListModel_listautoptr = o
  extension (v: GtkSliceListModel_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkslicelistmodel.h
*/
opaque type GtkSliceListModel_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkSliceListModel_queueautoptr: 
  given _tag: Tag[GtkSliceListModel_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkSliceListModel_queueautoptr = o
  extension (v: GtkSliceListModel_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkslicelistmodel.h
*/
opaque type GtkSliceListModel_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkSliceListModel_slistautoptr: 
  given _tag: Tag[GtkSliceListModel_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkSliceListModel_slistautoptr = o
  extension (v: GtkSliceListModel_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
type GtkSnapshot = GdkSnapshot
object GtkSnapshot: 
  given _tag: Tag[GtkSnapshot] = GdkSnapshot._tag
  inline def apply(inline o: GdkSnapshot): GtkSnapshot = o
  extension (v: GtkSnapshot)
    inline def value: GdkSnapshot = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksnapshot.h
*/
opaque type GtkSnapshot_autoptr = Ptr[GtkSnapshot]
object GtkSnapshot_autoptr: 
  given _tag: Tag[GtkSnapshot_autoptr] = Tag.Ptr[GtkSnapshot](GtkSnapshot._tag)
  inline def apply(inline o: Ptr[GtkSnapshot]): GtkSnapshot_autoptr = o
  extension (v: GtkSnapshot_autoptr)
    inline def value: Ptr[GtkSnapshot] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksnapshot.h
*/
opaque type GtkSnapshot_listautoptr = Ptr[_root_.glib.all.GList]
object GtkSnapshot_listautoptr: 
  given _tag: Tag[GtkSnapshot_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkSnapshot_listautoptr = o
  extension (v: GtkSnapshot_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksnapshot.h
*/
opaque type GtkSnapshot_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkSnapshot_queueautoptr: 
  given _tag: Tag[GtkSnapshot_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkSnapshot_queueautoptr = o
  extension (v: GtkSnapshot_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksnapshot.h
*/
opaque type GtkSnapshot_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkSnapshot_slistautoptr: 
  given _tag: Tag[GtkSnapshot_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkSnapshot_slistautoptr = o
  extension (v: GtkSnapshot_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksortlistmodel.h
*/
opaque type GtkSortListModelClass_autoptr = Ptr[GtkSortListModelClass]
object GtkSortListModelClass_autoptr: 
  given _tag: Tag[GtkSortListModelClass_autoptr] = Tag.Ptr[GtkSortListModelClass](GtkSortListModelClass._tag)
  inline def apply(inline o: Ptr[GtkSortListModelClass]): GtkSortListModelClass_autoptr = o
  extension (v: GtkSortListModelClass_autoptr)
    inline def value: Ptr[GtkSortListModelClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksortlistmodel.h
*/
opaque type GtkSortListModelClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkSortListModelClass_listautoptr: 
  given _tag: Tag[GtkSortListModelClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkSortListModelClass_listautoptr = o
  extension (v: GtkSortListModelClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksortlistmodel.h
*/
opaque type GtkSortListModelClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkSortListModelClass_queueautoptr: 
  given _tag: Tag[GtkSortListModelClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkSortListModelClass_queueautoptr = o
  extension (v: GtkSortListModelClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksortlistmodel.h
*/
opaque type GtkSortListModelClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkSortListModelClass_slistautoptr: 
  given _tag: Tag[GtkSortListModelClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkSortListModelClass_slistautoptr = o
  extension (v: GtkSortListModelClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksortlistmodel.h
*/
opaque type GtkSortListModel_autoptr = Ptr[GtkSortListModel]
object GtkSortListModel_autoptr: 
  given _tag: Tag[GtkSortListModel_autoptr] = Tag.Ptr[GtkSortListModel](GtkSortListModel._tag)
  inline def apply(inline o: Ptr[GtkSortListModel]): GtkSortListModel_autoptr = o
  extension (v: GtkSortListModel_autoptr)
    inline def value: Ptr[GtkSortListModel] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksortlistmodel.h
*/
opaque type GtkSortListModel_listautoptr = Ptr[_root_.glib.all.GList]
object GtkSortListModel_listautoptr: 
  given _tag: Tag[GtkSortListModel_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkSortListModel_listautoptr = o
  extension (v: GtkSortListModel_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksortlistmodel.h
*/
opaque type GtkSortListModel_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkSortListModel_queueautoptr: 
  given _tag: Tag[GtkSortListModel_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkSortListModel_queueautoptr = o
  extension (v: GtkSortListModel_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksortlistmodel.h
*/
opaque type GtkSortListModel_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkSortListModel_slistautoptr: 
  given _tag: Tag[GtkSortListModel_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkSortListModel_slistautoptr = o
  extension (v: GtkSortListModel_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksorter.h
*/
opaque type GtkSorterClass_autoptr = Ptr[GtkSorterClass]
object GtkSorterClass_autoptr: 
  given _tag: Tag[GtkSorterClass_autoptr] = Tag.Ptr[GtkSorterClass](GtkSorterClass._tag)
  inline def apply(inline o: Ptr[GtkSorterClass]): GtkSorterClass_autoptr = o
  extension (v: GtkSorterClass_autoptr)
    inline def value: Ptr[GtkSorterClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksorter.h
*/
opaque type GtkSorterClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkSorterClass_listautoptr: 
  given _tag: Tag[GtkSorterClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkSorterClass_listautoptr = o
  extension (v: GtkSorterClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksorter.h
*/
opaque type GtkSorterClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkSorterClass_queueautoptr: 
  given _tag: Tag[GtkSorterClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkSorterClass_queueautoptr = o
  extension (v: GtkSorterClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksorter.h
*/
opaque type GtkSorterClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkSorterClass_slistautoptr: 
  given _tag: Tag[GtkSorterClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkSorterClass_slistautoptr = o
  extension (v: GtkSorterClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksorter.h
*/
opaque type GtkSorter_autoptr = Ptr[GtkSorter]
object GtkSorter_autoptr: 
  given _tag: Tag[GtkSorter_autoptr] = Tag.Ptr[GtkSorter](GtkSorter._tag)
  inline def apply(inline o: Ptr[GtkSorter]): GtkSorter_autoptr = o
  extension (v: GtkSorter_autoptr)
    inline def value: Ptr[GtkSorter] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksorter.h
*/
opaque type GtkSorter_listautoptr = Ptr[_root_.glib.all.GList]
object GtkSorter_listautoptr: 
  given _tag: Tag[GtkSorter_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkSorter_listautoptr = o
  extension (v: GtkSorter_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksorter.h
*/
opaque type GtkSorter_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkSorter_queueautoptr: 
  given _tag: Tag[GtkSorter_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkSorter_queueautoptr = o
  extension (v: GtkSorter_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksorter.h
*/
opaque type GtkSorter_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkSorter_slistautoptr: 
  given _tag: Tag[GtkSorter_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkSorter_slistautoptr = o
  extension (v: GtkSorter_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSpinButton_autoptr = Ptr[GtkSpinButton]
object GtkSpinButton_autoptr: 
  given _tag: Tag[GtkSpinButton_autoptr] = Tag.Ptr[GtkSpinButton](GtkSpinButton._tag)
  inline def apply(inline o: Ptr[GtkSpinButton]): GtkSpinButton_autoptr = o
  extension (v: GtkSpinButton_autoptr)
    inline def value: Ptr[GtkSpinButton] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSpinButton_listautoptr = Ptr[_root_.glib.all.GList]
object GtkSpinButton_listautoptr: 
  given _tag: Tag[GtkSpinButton_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkSpinButton_listautoptr = o
  extension (v: GtkSpinButton_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSpinButton_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkSpinButton_queueautoptr: 
  given _tag: Tag[GtkSpinButton_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkSpinButton_queueautoptr = o
  extension (v: GtkSpinButton_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSpinButton_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkSpinButton_slistautoptr: 
  given _tag: Tag[GtkSpinButton_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkSpinButton_slistautoptr = o
  extension (v: GtkSpinButton_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSpinner_autoptr = Ptr[GtkSpinner]
object GtkSpinner_autoptr: 
  given _tag: Tag[GtkSpinner_autoptr] = Tag.Ptr[GtkSpinner](GtkSpinner._tag)
  inline def apply(inline o: Ptr[GtkSpinner]): GtkSpinner_autoptr = o
  extension (v: GtkSpinner_autoptr)
    inline def value: Ptr[GtkSpinner] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSpinner_listautoptr = Ptr[_root_.glib.all.GList]
object GtkSpinner_listautoptr: 
  given _tag: Tag[GtkSpinner_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkSpinner_listautoptr = o
  extension (v: GtkSpinner_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSpinner_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkSpinner_queueautoptr: 
  given _tag: Tag[GtkSpinner_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkSpinner_queueautoptr = o
  extension (v: GtkSpinner_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSpinner_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkSpinner_slistautoptr: 
  given _tag: Tag[GtkSpinner_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkSpinner_slistautoptr = o
  extension (v: GtkSpinner_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkStackSidebar_autoptr = Ptr[GtkStackSidebar]
object GtkStackSidebar_autoptr: 
  given _tag: Tag[GtkStackSidebar_autoptr] = Tag.Ptr[GtkStackSidebar](GtkStackSidebar._tag)
  inline def apply(inline o: Ptr[GtkStackSidebar]): GtkStackSidebar_autoptr = o
  extension (v: GtkStackSidebar_autoptr)
    inline def value: Ptr[GtkStackSidebar] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkStackSidebar_listautoptr = Ptr[_root_.glib.all.GList]
object GtkStackSidebar_listautoptr: 
  given _tag: Tag[GtkStackSidebar_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkStackSidebar_listautoptr = o
  extension (v: GtkStackSidebar_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkStackSidebar_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkStackSidebar_queueautoptr: 
  given _tag: Tag[GtkStackSidebar_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkStackSidebar_queueautoptr = o
  extension (v: GtkStackSidebar_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkStackSidebar_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkStackSidebar_slistautoptr: 
  given _tag: Tag[GtkStackSidebar_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkStackSidebar_slistautoptr = o
  extension (v: GtkStackSidebar_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkStackSwitcher_autoptr = Ptr[GtkStackSwitcher]
object GtkStackSwitcher_autoptr: 
  given _tag: Tag[GtkStackSwitcher_autoptr] = Tag.Ptr[GtkStackSwitcher](GtkStackSwitcher._tag)
  inline def apply(inline o: Ptr[GtkStackSwitcher]): GtkStackSwitcher_autoptr = o
  extension (v: GtkStackSwitcher_autoptr)
    inline def value: Ptr[GtkStackSwitcher] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkStackSwitcher_listautoptr = Ptr[_root_.glib.all.GList]
object GtkStackSwitcher_listautoptr: 
  given _tag: Tag[GtkStackSwitcher_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkStackSwitcher_listautoptr = o
  extension (v: GtkStackSwitcher_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkStackSwitcher_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkStackSwitcher_queueautoptr: 
  given _tag: Tag[GtkStackSwitcher_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkStackSwitcher_queueautoptr = o
  extension (v: GtkStackSwitcher_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkStackSwitcher_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkStackSwitcher_slistautoptr: 
  given _tag: Tag[GtkStackSwitcher_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkStackSwitcher_slistautoptr = o
  extension (v: GtkStackSwitcher_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkStack_autoptr = Ptr[GtkStack]
object GtkStack_autoptr: 
  given _tag: Tag[GtkStack_autoptr] = Tag.Ptr[GtkStack](GtkStack._tag)
  inline def apply(inline o: Ptr[GtkStack]): GtkStack_autoptr = o
  extension (v: GtkStack_autoptr)
    inline def value: Ptr[GtkStack] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkStack_listautoptr = Ptr[_root_.glib.all.GList]
object GtkStack_listautoptr: 
  given _tag: Tag[GtkStack_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkStack_listautoptr = o
  extension (v: GtkStack_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkStack_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkStack_queueautoptr: 
  given _tag: Tag[GtkStack_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkStack_queueautoptr = o
  extension (v: GtkStack_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkStack_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkStack_slistautoptr: 
  given _tag: Tag[GtkStack_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkStack_slistautoptr = o
  extension (v: GtkStack_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkStatusbar_autoptr = Ptr[GtkStatusbar]
object GtkStatusbar_autoptr: 
  given _tag: Tag[GtkStatusbar_autoptr] = Tag.Ptr[GtkStatusbar](GtkStatusbar._tag)
  inline def apply(inline o: Ptr[GtkStatusbar]): GtkStatusbar_autoptr = o
  extension (v: GtkStatusbar_autoptr)
    inline def value: Ptr[GtkStatusbar] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkStatusbar_listautoptr = Ptr[_root_.glib.all.GList]
object GtkStatusbar_listautoptr: 
  given _tag: Tag[GtkStatusbar_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkStatusbar_listautoptr = o
  extension (v: GtkStatusbar_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkStatusbar_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkStatusbar_queueautoptr: 
  given _tag: Tag[GtkStatusbar_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkStatusbar_queueautoptr = o
  extension (v: GtkStatusbar_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkStatusbar_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkStatusbar_slistautoptr: 
  given _tag: Tag[GtkStatusbar_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkStatusbar_slistautoptr = o
  extension (v: GtkStatusbar_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringfilter.h
*/
opaque type GtkStringFilterClass_autoptr = Ptr[GtkStringFilterClass]
object GtkStringFilterClass_autoptr: 
  given _tag: Tag[GtkStringFilterClass_autoptr] = Tag.Ptr[GtkStringFilterClass](GtkStringFilterClass._tag)
  inline def apply(inline o: Ptr[GtkStringFilterClass]): GtkStringFilterClass_autoptr = o
  extension (v: GtkStringFilterClass_autoptr)
    inline def value: Ptr[GtkStringFilterClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringfilter.h
*/
opaque type GtkStringFilterClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkStringFilterClass_listautoptr: 
  given _tag: Tag[GtkStringFilterClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkStringFilterClass_listautoptr = o
  extension (v: GtkStringFilterClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringfilter.h
*/
opaque type GtkStringFilterClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkStringFilterClass_queueautoptr: 
  given _tag: Tag[GtkStringFilterClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkStringFilterClass_queueautoptr = o
  extension (v: GtkStringFilterClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringfilter.h
*/
opaque type GtkStringFilterClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkStringFilterClass_slistautoptr: 
  given _tag: Tag[GtkStringFilterClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkStringFilterClass_slistautoptr = o
  extension (v: GtkStringFilterClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringfilter.h
*/
opaque type GtkStringFilter_autoptr = Ptr[GtkStringFilter]
object GtkStringFilter_autoptr: 
  given _tag: Tag[GtkStringFilter_autoptr] = Tag.Ptr[GtkStringFilter](GtkStringFilter._tag)
  inline def apply(inline o: Ptr[GtkStringFilter]): GtkStringFilter_autoptr = o
  extension (v: GtkStringFilter_autoptr)
    inline def value: Ptr[GtkStringFilter] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringfilter.h
*/
opaque type GtkStringFilter_listautoptr = Ptr[_root_.glib.all.GList]
object GtkStringFilter_listautoptr: 
  given _tag: Tag[GtkStringFilter_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkStringFilter_listautoptr = o
  extension (v: GtkStringFilter_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringfilter.h
*/
opaque type GtkStringFilter_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkStringFilter_queueautoptr: 
  given _tag: Tag[GtkStringFilter_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkStringFilter_queueautoptr = o
  extension (v: GtkStringFilter_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringfilter.h
*/
opaque type GtkStringFilter_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkStringFilter_slistautoptr: 
  given _tag: Tag[GtkStringFilter_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkStringFilter_slistautoptr = o
  extension (v: GtkStringFilter_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringlist.h
*/
opaque type GtkStringListClass_autoptr = Ptr[GtkStringListClass]
object GtkStringListClass_autoptr: 
  given _tag: Tag[GtkStringListClass_autoptr] = Tag.Ptr[GtkStringListClass](GtkStringListClass._tag)
  inline def apply(inline o: Ptr[GtkStringListClass]): GtkStringListClass_autoptr = o
  extension (v: GtkStringListClass_autoptr)
    inline def value: Ptr[GtkStringListClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringlist.h
*/
opaque type GtkStringListClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkStringListClass_listautoptr: 
  given _tag: Tag[GtkStringListClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkStringListClass_listautoptr = o
  extension (v: GtkStringListClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringlist.h
*/
opaque type GtkStringListClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkStringListClass_queueautoptr: 
  given _tag: Tag[GtkStringListClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkStringListClass_queueautoptr = o
  extension (v: GtkStringListClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringlist.h
*/
opaque type GtkStringListClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkStringListClass_slistautoptr: 
  given _tag: Tag[GtkStringListClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkStringListClass_slistautoptr = o
  extension (v: GtkStringListClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringlist.h
*/
opaque type GtkStringList_autoptr = Ptr[GtkStringList]
object GtkStringList_autoptr: 
  given _tag: Tag[GtkStringList_autoptr] = Tag.Ptr[GtkStringList](GtkStringList._tag)
  inline def apply(inline o: Ptr[GtkStringList]): GtkStringList_autoptr = o
  extension (v: GtkStringList_autoptr)
    inline def value: Ptr[GtkStringList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringlist.h
*/
opaque type GtkStringList_listautoptr = Ptr[_root_.glib.all.GList]
object GtkStringList_listautoptr: 
  given _tag: Tag[GtkStringList_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkStringList_listautoptr = o
  extension (v: GtkStringList_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringlist.h
*/
opaque type GtkStringList_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkStringList_queueautoptr: 
  given _tag: Tag[GtkStringList_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkStringList_queueautoptr = o
  extension (v: GtkStringList_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringlist.h
*/
opaque type GtkStringList_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkStringList_slistautoptr: 
  given _tag: Tag[GtkStringList_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkStringList_slistautoptr = o
  extension (v: GtkStringList_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringlist.h
*/
opaque type GtkStringObjectClass_autoptr = Ptr[GtkStringObjectClass]
object GtkStringObjectClass_autoptr: 
  given _tag: Tag[GtkStringObjectClass_autoptr] = Tag.Ptr[GtkStringObjectClass](GtkStringObjectClass._tag)
  inline def apply(inline o: Ptr[GtkStringObjectClass]): GtkStringObjectClass_autoptr = o
  extension (v: GtkStringObjectClass_autoptr)
    inline def value: Ptr[GtkStringObjectClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringlist.h
*/
opaque type GtkStringObjectClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkStringObjectClass_listautoptr: 
  given _tag: Tag[GtkStringObjectClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkStringObjectClass_listautoptr = o
  extension (v: GtkStringObjectClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringlist.h
*/
opaque type GtkStringObjectClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkStringObjectClass_queueautoptr: 
  given _tag: Tag[GtkStringObjectClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkStringObjectClass_queueautoptr = o
  extension (v: GtkStringObjectClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringlist.h
*/
opaque type GtkStringObjectClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkStringObjectClass_slistautoptr: 
  given _tag: Tag[GtkStringObjectClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkStringObjectClass_slistautoptr = o
  extension (v: GtkStringObjectClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringlist.h
*/
opaque type GtkStringObject_autoptr = Ptr[GtkStringObject]
object GtkStringObject_autoptr: 
  given _tag: Tag[GtkStringObject_autoptr] = Tag.Ptr[GtkStringObject](GtkStringObject._tag)
  inline def apply(inline o: Ptr[GtkStringObject]): GtkStringObject_autoptr = o
  extension (v: GtkStringObject_autoptr)
    inline def value: Ptr[GtkStringObject] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringlist.h
*/
opaque type GtkStringObject_listautoptr = Ptr[_root_.glib.all.GList]
object GtkStringObject_listautoptr: 
  given _tag: Tag[GtkStringObject_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkStringObject_listautoptr = o
  extension (v: GtkStringObject_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringlist.h
*/
opaque type GtkStringObject_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkStringObject_queueautoptr: 
  given _tag: Tag[GtkStringObject_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkStringObject_queueautoptr = o
  extension (v: GtkStringObject_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringlist.h
*/
opaque type GtkStringObject_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkStringObject_slistautoptr: 
  given _tag: Tag[GtkStringObject_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkStringObject_slistautoptr = o
  extension (v: GtkStringObject_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringsorter.h
*/
opaque type GtkStringSorterClass_autoptr = Ptr[GtkStringSorterClass]
object GtkStringSorterClass_autoptr: 
  given _tag: Tag[GtkStringSorterClass_autoptr] = Tag.Ptr[GtkStringSorterClass](GtkStringSorterClass._tag)
  inline def apply(inline o: Ptr[GtkStringSorterClass]): GtkStringSorterClass_autoptr = o
  extension (v: GtkStringSorterClass_autoptr)
    inline def value: Ptr[GtkStringSorterClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringsorter.h
*/
opaque type GtkStringSorterClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkStringSorterClass_listautoptr: 
  given _tag: Tag[GtkStringSorterClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkStringSorterClass_listautoptr = o
  extension (v: GtkStringSorterClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringsorter.h
*/
opaque type GtkStringSorterClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkStringSorterClass_queueautoptr: 
  given _tag: Tag[GtkStringSorterClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkStringSorterClass_queueautoptr = o
  extension (v: GtkStringSorterClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringsorter.h
*/
opaque type GtkStringSorterClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkStringSorterClass_slistautoptr: 
  given _tag: Tag[GtkStringSorterClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkStringSorterClass_slistautoptr = o
  extension (v: GtkStringSorterClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringsorter.h
*/
opaque type GtkStringSorter_autoptr = Ptr[GtkStringSorter]
object GtkStringSorter_autoptr: 
  given _tag: Tag[GtkStringSorter_autoptr] = Tag.Ptr[GtkStringSorter](GtkStringSorter._tag)
  inline def apply(inline o: Ptr[GtkStringSorter]): GtkStringSorter_autoptr = o
  extension (v: GtkStringSorter_autoptr)
    inline def value: Ptr[GtkStringSorter] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringsorter.h
*/
opaque type GtkStringSorter_listautoptr = Ptr[_root_.glib.all.GList]
object GtkStringSorter_listautoptr: 
  given _tag: Tag[GtkStringSorter_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkStringSorter_listautoptr = o
  extension (v: GtkStringSorter_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringsorter.h
*/
opaque type GtkStringSorter_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkStringSorter_queueautoptr: 
  given _tag: Tag[GtkStringSorter_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkStringSorter_queueautoptr = o
  extension (v: GtkStringSorter_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringsorter.h
*/
opaque type GtkStringSorter_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkStringSorter_slistautoptr: 
  given _tag: Tag[GtkStringSorter_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkStringSorter_slistautoptr = o
  extension (v: GtkStringSorter_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkStyleContext_autoptr = Ptr[GtkStyleContext]
object GtkStyleContext_autoptr: 
  given _tag: Tag[GtkStyleContext_autoptr] = Tag.Ptr[GtkStyleContext](GtkStyleContext._tag)
  inline def apply(inline o: Ptr[GtkStyleContext]): GtkStyleContext_autoptr = o
  extension (v: GtkStyleContext_autoptr)
    inline def value: Ptr[GtkStyleContext] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkStyleContext_listautoptr = Ptr[_root_.glib.all.GList]
object GtkStyleContext_listautoptr: 
  given _tag: Tag[GtkStyleContext_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkStyleContext_listautoptr = o
  extension (v: GtkStyleContext_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkStyleContext_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkStyleContext_queueautoptr: 
  given _tag: Tag[GtkStyleContext_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkStyleContext_queueautoptr = o
  extension (v: GtkStyleContext_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkStyleContext_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkStyleContext_slistautoptr: 
  given _tag: Tag[GtkStyleContext_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkStyleContext_slistautoptr = o
  extension (v: GtkStyleContext_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkStyleProvider_autoptr = Ptr[GtkStyleProvider]
object GtkStyleProvider_autoptr: 
  given _tag: Tag[GtkStyleProvider_autoptr] = Tag.Ptr[GtkStyleProvider](GtkStyleProvider._tag)
  inline def apply(inline o: Ptr[GtkStyleProvider]): GtkStyleProvider_autoptr = o
  extension (v: GtkStyleProvider_autoptr)
    inline def value: Ptr[GtkStyleProvider] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkStyleProvider_listautoptr = Ptr[_root_.glib.all.GList]
object GtkStyleProvider_listautoptr: 
  given _tag: Tag[GtkStyleProvider_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkStyleProvider_listautoptr = o
  extension (v: GtkStyleProvider_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkStyleProvider_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkStyleProvider_queueautoptr: 
  given _tag: Tag[GtkStyleProvider_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkStyleProvider_queueautoptr = o
  extension (v: GtkStyleProvider_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkStyleProvider_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkStyleProvider_slistautoptr: 
  given _tag: Tag[GtkStyleProvider_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkStyleProvider_slistautoptr = o
  extension (v: GtkStyleProvider_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSwitch_autoptr = Ptr[GtkSwitch]
object GtkSwitch_autoptr: 
  given _tag: Tag[GtkSwitch_autoptr] = Tag.Ptr[GtkSwitch](GtkSwitch._tag)
  inline def apply(inline o: Ptr[GtkSwitch]): GtkSwitch_autoptr = o
  extension (v: GtkSwitch_autoptr)
    inline def value: Ptr[GtkSwitch] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSwitch_listautoptr = Ptr[_root_.glib.all.GList]
object GtkSwitch_listautoptr: 
  given _tag: Tag[GtkSwitch_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkSwitch_listautoptr = o
  extension (v: GtkSwitch_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSwitch_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkSwitch_queueautoptr: 
  given _tag: Tag[GtkSwitch_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkSwitch_queueautoptr = o
  extension (v: GtkSwitch_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkSwitch_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkSwitch_slistautoptr: 
  given _tag: Tag[GtkSwitch_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkSwitch_slistautoptr = o
  extension (v: GtkSwitch_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksymbolicpaintable.h
*/
opaque type GtkSymbolicPaintable_autoptr = Ptr[GtkSymbolicPaintable]
object GtkSymbolicPaintable_autoptr: 
  given _tag: Tag[GtkSymbolicPaintable_autoptr] = Tag.Ptr[GtkSymbolicPaintable](GtkSymbolicPaintable._tag)
  inline def apply(inline o: Ptr[GtkSymbolicPaintable]): GtkSymbolicPaintable_autoptr = o
  extension (v: GtkSymbolicPaintable_autoptr)
    inline def value: Ptr[GtkSymbolicPaintable] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksymbolicpaintable.h
*/
opaque type GtkSymbolicPaintable_listautoptr = Ptr[_root_.glib.all.GList]
object GtkSymbolicPaintable_listautoptr: 
  given _tag: Tag[GtkSymbolicPaintable_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkSymbolicPaintable_listautoptr = o
  extension (v: GtkSymbolicPaintable_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksymbolicpaintable.h
*/
opaque type GtkSymbolicPaintable_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkSymbolicPaintable_queueautoptr: 
  given _tag: Tag[GtkSymbolicPaintable_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkSymbolicPaintable_queueautoptr = o
  extension (v: GtkSymbolicPaintable_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksymbolicpaintable.h
*/
opaque type GtkSymbolicPaintable_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkSymbolicPaintable_slistautoptr: 
  given _tag: Tag[GtkSymbolicPaintable_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkSymbolicPaintable_slistautoptr = o
  extension (v: GtkSymbolicPaintable_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTextBuffer_autoptr = Ptr[GtkTextBuffer]
object GtkTextBuffer_autoptr: 
  given _tag: Tag[GtkTextBuffer_autoptr] = Tag.Ptr[GtkTextBuffer](GtkTextBuffer._tag)
  inline def apply(inline o: Ptr[GtkTextBuffer]): GtkTextBuffer_autoptr = o
  extension (v: GtkTextBuffer_autoptr)
    inline def value: Ptr[GtkTextBuffer] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTextBuffer_listautoptr = Ptr[_root_.glib.all.GList]
object GtkTextBuffer_listautoptr: 
  given _tag: Tag[GtkTextBuffer_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkTextBuffer_listautoptr = o
  extension (v: GtkTextBuffer_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTextBuffer_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkTextBuffer_queueautoptr: 
  given _tag: Tag[GtkTextBuffer_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkTextBuffer_queueautoptr = o
  extension (v: GtkTextBuffer_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTextBuffer_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkTextBuffer_slistautoptr: 
  given _tag: Tag[GtkTextBuffer_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkTextBuffer_slistautoptr = o
  extension (v: GtkTextBuffer_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkTextCharPredicate: : a Unicode code point _data: data passed to the callback

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktextiter.h
*/
opaque type GtkTextCharPredicate = CFuncPtr2[_root_.glib.all.gunichar, _root_.glib.all.gpointer, _root_.glib.all.gboolean]
object GtkTextCharPredicate: 
  given _tag: Tag[GtkTextCharPredicate] = Tag.materializeCFuncPtr2[_root_.glib.all.gunichar, _root_.glib.all.gpointer, _root_.glib.all.gboolean]
  inline def apply(inline o: CFuncPtr2[_root_.glib.all.gunichar, _root_.glib.all.gpointer, _root_.glib.all.gboolean]): GtkTextCharPredicate = o
  extension (v: GtkTextCharPredicate)
    inline def value: CFuncPtr2[_root_.glib.all.gunichar, _root_.glib.all.gpointer, _root_.glib.all.gboolean] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTextChildAnchor_autoptr = Ptr[GtkTextChildAnchor]
object GtkTextChildAnchor_autoptr: 
  given _tag: Tag[GtkTextChildAnchor_autoptr] = Tag.Ptr[GtkTextChildAnchor](GtkTextChildAnchor._tag)
  inline def apply(inline o: Ptr[GtkTextChildAnchor]): GtkTextChildAnchor_autoptr = o
  extension (v: GtkTextChildAnchor_autoptr)
    inline def value: Ptr[GtkTextChildAnchor] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTextChildAnchor_listautoptr = Ptr[_root_.glib.all.GList]
object GtkTextChildAnchor_listautoptr: 
  given _tag: Tag[GtkTextChildAnchor_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkTextChildAnchor_listautoptr = o
  extension (v: GtkTextChildAnchor_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTextChildAnchor_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkTextChildAnchor_queueautoptr: 
  given _tag: Tag[GtkTextChildAnchor_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkTextChildAnchor_queueautoptr = o
  extension (v: GtkTextChildAnchor_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTextChildAnchor_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkTextChildAnchor_slistautoptr: 
  given _tag: Tag[GtkTextChildAnchor_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkTextChildAnchor_slistautoptr = o
  extension (v: GtkTextChildAnchor_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTextIter_autoptr = Ptr[GtkTextIter]
object GtkTextIter_autoptr: 
  given _tag: Tag[GtkTextIter_autoptr] = Tag.Ptr[GtkTextIter](GtkTextIter._tag)
  inline def apply(inline o: Ptr[GtkTextIter]): GtkTextIter_autoptr = o
  extension (v: GtkTextIter_autoptr)
    inline def value: Ptr[GtkTextIter] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTextIter_listautoptr = Ptr[_root_.glib.all.GList]
object GtkTextIter_listautoptr: 
  given _tag: Tag[GtkTextIter_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkTextIter_listautoptr = o
  extension (v: GtkTextIter_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTextIter_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkTextIter_queueautoptr: 
  given _tag: Tag[GtkTextIter_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkTextIter_queueautoptr = o
  extension (v: GtkTextIter_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTextIter_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkTextIter_slistautoptr: 
  given _tag: Tag[GtkTextIter_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkTextIter_slistautoptr = o
  extension (v: GtkTextIter_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTextMark_autoptr = Ptr[GtkTextMark]
object GtkTextMark_autoptr: 
  given _tag: Tag[GtkTextMark_autoptr] = Tag.Ptr[GtkTextMark](GtkTextMark._tag)
  inline def apply(inline o: Ptr[GtkTextMark]): GtkTextMark_autoptr = o
  extension (v: GtkTextMark_autoptr)
    inline def value: Ptr[GtkTextMark] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTextMark_listautoptr = Ptr[_root_.glib.all.GList]
object GtkTextMark_listautoptr: 
  given _tag: Tag[GtkTextMark_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkTextMark_listautoptr = o
  extension (v: GtkTextMark_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTextMark_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkTextMark_queueautoptr: 
  given _tag: Tag[GtkTextMark_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkTextMark_queueautoptr = o
  extension (v: GtkTextMark_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTextMark_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkTextMark_slistautoptr: 
  given _tag: Tag[GtkTextMark_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkTextMark_slistautoptr = o
  extension (v: GtkTextMark_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkTextTagTableForeach: : the `GtkTextTag`

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktexttagtable.h
*/
opaque type GtkTextTagTableForeach = CFuncPtr2[Ptr[GtkTextTag], _root_.glib.all.gpointer, Unit]
object GtkTextTagTableForeach: 
  given _tag: Tag[GtkTextTagTableForeach] = Tag.materializeCFuncPtr2[Ptr[GtkTextTag], _root_.glib.all.gpointer, Unit]
  inline def apply(inline o: CFuncPtr2[Ptr[GtkTextTag], _root_.glib.all.gpointer, Unit]): GtkTextTagTableForeach = o
  extension (v: GtkTextTagTableForeach)
    inline def value: CFuncPtr2[Ptr[GtkTextTag], _root_.glib.all.gpointer, Unit] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTextTagTable_autoptr = Ptr[GtkTextTagTable]
object GtkTextTagTable_autoptr: 
  given _tag: Tag[GtkTextTagTable_autoptr] = Tag.Ptr[GtkTextTagTable](GtkTextTagTable._tag)
  inline def apply(inline o: Ptr[GtkTextTagTable]): GtkTextTagTable_autoptr = o
  extension (v: GtkTextTagTable_autoptr)
    inline def value: Ptr[GtkTextTagTable] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTextTagTable_listautoptr = Ptr[_root_.glib.all.GList]
object GtkTextTagTable_listautoptr: 
  given _tag: Tag[GtkTextTagTable_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkTextTagTable_listautoptr = o
  extension (v: GtkTextTagTable_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTextTagTable_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkTextTagTable_queueautoptr: 
  given _tag: Tag[GtkTextTagTable_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkTextTagTable_queueautoptr = o
  extension (v: GtkTextTagTable_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTextTagTable_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkTextTagTable_slistautoptr: 
  given _tag: Tag[GtkTextTagTable_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkTextTagTable_slistautoptr = o
  extension (v: GtkTextTagTable_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTextTag_autoptr = Ptr[GtkTextTag]
object GtkTextTag_autoptr: 
  given _tag: Tag[GtkTextTag_autoptr] = Tag.Ptr[GtkTextTag](GtkTextTag._tag)
  inline def apply(inline o: Ptr[GtkTextTag]): GtkTextTag_autoptr = o
  extension (v: GtkTextTag_autoptr)
    inline def value: Ptr[GtkTextTag] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTextTag_listautoptr = Ptr[_root_.glib.all.GList]
object GtkTextTag_listautoptr: 
  given _tag: Tag[GtkTextTag_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkTextTag_listautoptr = o
  extension (v: GtkTextTag_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTextTag_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkTextTag_queueautoptr: 
  given _tag: Tag[GtkTextTag_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkTextTag_queueautoptr = o
  extension (v: GtkTextTag_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTextTag_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkTextTag_slistautoptr: 
  given _tag: Tag[GtkTextTag_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkTextTag_slistautoptr = o
  extension (v: GtkTextTag_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTextView_autoptr = Ptr[GtkTextView]
object GtkTextView_autoptr: 
  given _tag: Tag[GtkTextView_autoptr] = Tag.Ptr[GtkTextView](GtkTextView._tag)
  inline def apply(inline o: Ptr[GtkTextView]): GtkTextView_autoptr = o
  extension (v: GtkTextView_autoptr)
    inline def value: Ptr[GtkTextView] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTextView_listautoptr = Ptr[_root_.glib.all.GList]
object GtkTextView_listautoptr: 
  given _tag: Tag[GtkTextView_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkTextView_listautoptr = o
  extension (v: GtkTextView_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTextView_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkTextView_queueautoptr: 
  given _tag: Tag[GtkTextView_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkTextView_queueautoptr = o
  extension (v: GtkTextView_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTextView_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkTextView_slistautoptr: 
  given _tag: Tag[GtkTextView_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkTextView_slistautoptr = o
  extension (v: GtkTextView_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkTickCallback: : the widget _clock: the frame clock for the widget (same as calling gtk_widget_get_frame_clock()) _data: user data passed to gtk_widget_add_tick_callback().

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidget.h
*/
opaque type GtkTickCallback = CFuncPtr3[Ptr[GtkWidget], Ptr[GdkFrameClock], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
object GtkTickCallback: 
  given _tag: Tag[GtkTickCallback] = Tag.materializeCFuncPtr3[Ptr[GtkWidget], Ptr[GdkFrameClock], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
  inline def apply(inline o: CFuncPtr3[Ptr[GtkWidget], Ptr[GdkFrameClock], _root_.glib.all.gpointer, _root_.glib.all.gboolean]): GtkTickCallback = o
  extension (v: GtkTickCallback)
    inline def value: CFuncPtr3[Ptr[GtkWidget], Ptr[GdkFrameClock], _root_.glib.all.gpointer, _root_.glib.all.gboolean] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkToggleButton_autoptr = Ptr[GtkToggleButton]
object GtkToggleButton_autoptr: 
  given _tag: Tag[GtkToggleButton_autoptr] = Tag.Ptr[GtkToggleButton](GtkToggleButton._tag)
  inline def apply(inline o: Ptr[GtkToggleButton]): GtkToggleButton_autoptr = o
  extension (v: GtkToggleButton_autoptr)
    inline def value: Ptr[GtkToggleButton] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkToggleButton_listautoptr = Ptr[_root_.glib.all.GList]
object GtkToggleButton_listautoptr: 
  given _tag: Tag[GtkToggleButton_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkToggleButton_listautoptr = o
  extension (v: GtkToggleButton_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkToggleButton_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkToggleButton_queueautoptr: 
  given _tag: Tag[GtkToggleButton_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkToggleButton_queueautoptr = o
  extension (v: GtkToggleButton_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkToggleButton_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkToggleButton_slistautoptr: 
  given _tag: Tag[GtkToggleButton_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkToggleButton_slistautoptr = o
  extension (v: GtkToggleButton_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTooltip_autoptr = Ptr[GtkTooltip]
object GtkTooltip_autoptr: 
  given _tag: Tag[GtkTooltip_autoptr] = Tag.Ptr[GtkTooltip](GtkTooltip._tag)
  inline def apply(inline o: Ptr[GtkTooltip]): GtkTooltip_autoptr = o
  extension (v: GtkTooltip_autoptr)
    inline def value: Ptr[GtkTooltip] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTooltip_listautoptr = Ptr[_root_.glib.all.GList]
object GtkTooltip_listautoptr: 
  given _tag: Tag[GtkTooltip_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkTooltip_listautoptr = o
  extension (v: GtkTooltip_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTooltip_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkTooltip_queueautoptr: 
  given _tag: Tag[GtkTooltip_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkTooltip_queueautoptr = o
  extension (v: GtkTooltip_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTooltip_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkTooltip_slistautoptr: 
  given _tag: Tag[GtkTooltip_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkTooltip_slistautoptr = o
  extension (v: GtkTooltip_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkTreeCellDataFunc: _column: A `GtkTreeViewColumn` : The `GtkCellRenderer` that is being rendered by _column _model: The `GtkTreeModel` being rendered : A `GtkTreeIter` of the current row rendered

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreeviewcolumn.h
*/
opaque type GtkTreeCellDataFunc = CFuncPtr5[Ptr[GtkTreeViewColumn], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gpointer, Unit]
object GtkTreeCellDataFunc: 
  given _tag: Tag[GtkTreeCellDataFunc] = Tag.materializeCFuncPtr5[Ptr[GtkTreeViewColumn], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gpointer, Unit]
  inline def apply(inline o: CFuncPtr5[Ptr[GtkTreeViewColumn], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gpointer, Unit]): GtkTreeCellDataFunc = o
  extension (v: GtkTreeCellDataFunc)
    inline def value: CFuncPtr5[Ptr[GtkTreeViewColumn], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gpointer, Unit] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeDragDest_autoptr = Ptr[GtkTreeDragDest]
object GtkTreeDragDest_autoptr: 
  given _tag: Tag[GtkTreeDragDest_autoptr] = Tag.Ptr[GtkTreeDragDest](GtkTreeDragDest._tag)
  inline def apply(inline o: Ptr[GtkTreeDragDest]): GtkTreeDragDest_autoptr = o
  extension (v: GtkTreeDragDest_autoptr)
    inline def value: Ptr[GtkTreeDragDest] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeDragDest_listautoptr = Ptr[_root_.glib.all.GList]
object GtkTreeDragDest_listautoptr: 
  given _tag: Tag[GtkTreeDragDest_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkTreeDragDest_listautoptr = o
  extension (v: GtkTreeDragDest_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeDragDest_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkTreeDragDest_queueautoptr: 
  given _tag: Tag[GtkTreeDragDest_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkTreeDragDest_queueautoptr = o
  extension (v: GtkTreeDragDest_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeDragDest_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkTreeDragDest_slistautoptr: 
  given _tag: Tag[GtkTreeDragDest_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkTreeDragDest_slistautoptr = o
  extension (v: GtkTreeDragDest_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeDragSource_autoptr = Ptr[GtkTreeDragSource]
object GtkTreeDragSource_autoptr: 
  given _tag: Tag[GtkTreeDragSource_autoptr] = Tag.Ptr[GtkTreeDragSource](GtkTreeDragSource._tag)
  inline def apply(inline o: Ptr[GtkTreeDragSource]): GtkTreeDragSource_autoptr = o
  extension (v: GtkTreeDragSource_autoptr)
    inline def value: Ptr[GtkTreeDragSource] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeDragSource_listautoptr = Ptr[_root_.glib.all.GList]
object GtkTreeDragSource_listautoptr: 
  given _tag: Tag[GtkTreeDragSource_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkTreeDragSource_listautoptr = o
  extension (v: GtkTreeDragSource_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeDragSource_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkTreeDragSource_queueautoptr: 
  given _tag: Tag[GtkTreeDragSource_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkTreeDragSource_queueautoptr = o
  extension (v: GtkTreeDragSource_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeDragSource_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkTreeDragSource_slistautoptr: 
  given _tag: Tag[GtkTreeDragSource_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkTreeDragSource_slistautoptr = o
  extension (v: GtkTreeDragSource_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreeexpander.h
*/
opaque type GtkTreeExpanderClass_autoptr = Ptr[GtkTreeExpanderClass]
object GtkTreeExpanderClass_autoptr: 
  given _tag: Tag[GtkTreeExpanderClass_autoptr] = Tag.Ptr[GtkTreeExpanderClass](GtkTreeExpanderClass._tag)
  inline def apply(inline o: Ptr[GtkTreeExpanderClass]): GtkTreeExpanderClass_autoptr = o
  extension (v: GtkTreeExpanderClass_autoptr)
    inline def value: Ptr[GtkTreeExpanderClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreeexpander.h
*/
opaque type GtkTreeExpanderClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkTreeExpanderClass_listautoptr: 
  given _tag: Tag[GtkTreeExpanderClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkTreeExpanderClass_listautoptr = o
  extension (v: GtkTreeExpanderClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreeexpander.h
*/
opaque type GtkTreeExpanderClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkTreeExpanderClass_queueautoptr: 
  given _tag: Tag[GtkTreeExpanderClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkTreeExpanderClass_queueautoptr = o
  extension (v: GtkTreeExpanderClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreeexpander.h
*/
opaque type GtkTreeExpanderClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkTreeExpanderClass_slistautoptr: 
  given _tag: Tag[GtkTreeExpanderClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkTreeExpanderClass_slistautoptr = o
  extension (v: GtkTreeExpanderClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreeexpander.h
*/
opaque type GtkTreeExpander_autoptr = Ptr[GtkTreeExpander]
object GtkTreeExpander_autoptr: 
  given _tag: Tag[GtkTreeExpander_autoptr] = Tag.Ptr[GtkTreeExpander](GtkTreeExpander._tag)
  inline def apply(inline o: Ptr[GtkTreeExpander]): GtkTreeExpander_autoptr = o
  extension (v: GtkTreeExpander_autoptr)
    inline def value: Ptr[GtkTreeExpander] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreeexpander.h
*/
opaque type GtkTreeExpander_listautoptr = Ptr[_root_.glib.all.GList]
object GtkTreeExpander_listautoptr: 
  given _tag: Tag[GtkTreeExpander_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkTreeExpander_listautoptr = o
  extension (v: GtkTreeExpander_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreeexpander.h
*/
opaque type GtkTreeExpander_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkTreeExpander_queueautoptr: 
  given _tag: Tag[GtkTreeExpander_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkTreeExpander_queueautoptr = o
  extension (v: GtkTreeExpander_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreeexpander.h
*/
opaque type GtkTreeExpander_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkTreeExpander_slistautoptr: 
  given _tag: Tag[GtkTreeExpander_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkTreeExpander_slistautoptr = o
  extension (v: GtkTreeExpander_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkTreeIterCompareFunc: : The `GtkTreeModel` the comparison is within : A `GtkTreeIter` in : Another `GtkTreeIter` in _data: Data passed when the compare func is assigned e.g. by gtk_tree_sortable_set_sort_func()

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreesortable.h
*/
opaque type GtkTreeIterCompareFunc = CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.glib.all.gpointer, CInt]
object GtkTreeIterCompareFunc: 
  given _tag: Tag[GtkTreeIterCompareFunc] = Tag.materializeCFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.glib.all.gpointer, CInt]
  inline def apply(inline o: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.glib.all.gpointer, CInt]): GtkTreeIterCompareFunc = o
  extension (v: GtkTreeIterCompareFunc)
    inline def value: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.glib.all.gpointer, CInt] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeIter_autoptr = Ptr[GtkTreeIter]
object GtkTreeIter_autoptr: 
  given _tag: Tag[GtkTreeIter_autoptr] = Tag.Ptr[GtkTreeIter](GtkTreeIter._tag)
  inline def apply(inline o: Ptr[GtkTreeIter]): GtkTreeIter_autoptr = o
  extension (v: GtkTreeIter_autoptr)
    inline def value: Ptr[GtkTreeIter] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeIter_listautoptr = Ptr[_root_.glib.all.GList]
object GtkTreeIter_listautoptr: 
  given _tag: Tag[GtkTreeIter_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkTreeIter_listautoptr = o
  extension (v: GtkTreeIter_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeIter_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkTreeIter_queueautoptr: 
  given _tag: Tag[GtkTreeIter_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkTreeIter_queueautoptr = o
  extension (v: GtkTreeIter_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeIter_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkTreeIter_slistautoptr: 
  given _tag: Tag[GtkTreeIter_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkTreeIter_slistautoptr = o
  extension (v: GtkTreeIter_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistmodel.h
*/
opaque type GtkTreeListModelClass_autoptr = Ptr[GtkTreeListModelClass]
object GtkTreeListModelClass_autoptr: 
  given _tag: Tag[GtkTreeListModelClass_autoptr] = Tag.Ptr[GtkTreeListModelClass](GtkTreeListModelClass._tag)
  inline def apply(inline o: Ptr[GtkTreeListModelClass]): GtkTreeListModelClass_autoptr = o
  extension (v: GtkTreeListModelClass_autoptr)
    inline def value: Ptr[GtkTreeListModelClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistmodel.h
*/
opaque type GtkTreeListModelClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkTreeListModelClass_listautoptr: 
  given _tag: Tag[GtkTreeListModelClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkTreeListModelClass_listautoptr = o
  extension (v: GtkTreeListModelClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistmodel.h
*/
opaque type GtkTreeListModelClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkTreeListModelClass_queueautoptr: 
  given _tag: Tag[GtkTreeListModelClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkTreeListModelClass_queueautoptr = o
  extension (v: GtkTreeListModelClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistmodel.h
*/
opaque type GtkTreeListModelClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkTreeListModelClass_slistautoptr: 
  given _tag: Tag[GtkTreeListModelClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkTreeListModelClass_slistautoptr = o
  extension (v: GtkTreeListModelClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkTreeListModelCreateModelFunc: : (type GObject): The item that is being expanded _data: User data passed when registering the function

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistmodel.h
*/
opaque type GtkTreeListModelCreateModelFunc = CFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Ptr[_root_.gio.all.GListModel]]
object GtkTreeListModelCreateModelFunc: 
  given _tag: Tag[GtkTreeListModelCreateModelFunc] = Tag.materializeCFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Ptr[_root_.gio.all.GListModel]]
  inline def apply(inline o: CFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Ptr[_root_.gio.all.GListModel]]): GtkTreeListModelCreateModelFunc = o
  extension (v: GtkTreeListModelCreateModelFunc)
    inline def value: CFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Ptr[_root_.gio.all.GListModel]] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistmodel.h
*/
opaque type GtkTreeListModel_autoptr = Ptr[GtkTreeListModel]
object GtkTreeListModel_autoptr: 
  given _tag: Tag[GtkTreeListModel_autoptr] = Tag.Ptr[GtkTreeListModel](GtkTreeListModel._tag)
  inline def apply(inline o: Ptr[GtkTreeListModel]): GtkTreeListModel_autoptr = o
  extension (v: GtkTreeListModel_autoptr)
    inline def value: Ptr[GtkTreeListModel] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistmodel.h
*/
opaque type GtkTreeListModel_listautoptr = Ptr[_root_.glib.all.GList]
object GtkTreeListModel_listautoptr: 
  given _tag: Tag[GtkTreeListModel_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkTreeListModel_listautoptr = o
  extension (v: GtkTreeListModel_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistmodel.h
*/
opaque type GtkTreeListModel_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkTreeListModel_queueautoptr: 
  given _tag: Tag[GtkTreeListModel_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkTreeListModel_queueautoptr = o
  extension (v: GtkTreeListModel_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistmodel.h
*/
opaque type GtkTreeListModel_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkTreeListModel_slistautoptr: 
  given _tag: Tag[GtkTreeListModel_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkTreeListModel_slistautoptr = o
  extension (v: GtkTreeListModel_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistmodel.h
*/
opaque type GtkTreeListRowClass_autoptr = Ptr[GtkTreeListRowClass]
object GtkTreeListRowClass_autoptr: 
  given _tag: Tag[GtkTreeListRowClass_autoptr] = Tag.Ptr[GtkTreeListRowClass](GtkTreeListRowClass._tag)
  inline def apply(inline o: Ptr[GtkTreeListRowClass]): GtkTreeListRowClass_autoptr = o
  extension (v: GtkTreeListRowClass_autoptr)
    inline def value: Ptr[GtkTreeListRowClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistmodel.h
*/
opaque type GtkTreeListRowClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkTreeListRowClass_listautoptr: 
  given _tag: Tag[GtkTreeListRowClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkTreeListRowClass_listautoptr = o
  extension (v: GtkTreeListRowClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistmodel.h
*/
opaque type GtkTreeListRowClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkTreeListRowClass_queueautoptr: 
  given _tag: Tag[GtkTreeListRowClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkTreeListRowClass_queueautoptr = o
  extension (v: GtkTreeListRowClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistmodel.h
*/
opaque type GtkTreeListRowClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkTreeListRowClass_slistautoptr: 
  given _tag: Tag[GtkTreeListRowClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkTreeListRowClass_slistautoptr = o
  extension (v: GtkTreeListRowClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistrowsorter.h
*/
opaque type GtkTreeListRowSorterClass_autoptr = Ptr[GtkTreeListRowSorterClass]
object GtkTreeListRowSorterClass_autoptr: 
  given _tag: Tag[GtkTreeListRowSorterClass_autoptr] = Tag.Ptr[GtkTreeListRowSorterClass](GtkTreeListRowSorterClass._tag)
  inline def apply(inline o: Ptr[GtkTreeListRowSorterClass]): GtkTreeListRowSorterClass_autoptr = o
  extension (v: GtkTreeListRowSorterClass_autoptr)
    inline def value: Ptr[GtkTreeListRowSorterClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistrowsorter.h
*/
opaque type GtkTreeListRowSorterClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkTreeListRowSorterClass_listautoptr: 
  given _tag: Tag[GtkTreeListRowSorterClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkTreeListRowSorterClass_listautoptr = o
  extension (v: GtkTreeListRowSorterClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistrowsorter.h
*/
opaque type GtkTreeListRowSorterClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkTreeListRowSorterClass_queueautoptr: 
  given _tag: Tag[GtkTreeListRowSorterClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkTreeListRowSorterClass_queueautoptr = o
  extension (v: GtkTreeListRowSorterClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistrowsorter.h
*/
opaque type GtkTreeListRowSorterClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkTreeListRowSorterClass_slistautoptr: 
  given _tag: Tag[GtkTreeListRowSorterClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkTreeListRowSorterClass_slistautoptr = o
  extension (v: GtkTreeListRowSorterClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistrowsorter.h
*/
opaque type GtkTreeListRowSorter_autoptr = Ptr[GtkTreeListRowSorter]
object GtkTreeListRowSorter_autoptr: 
  given _tag: Tag[GtkTreeListRowSorter_autoptr] = Tag.Ptr[GtkTreeListRowSorter](GtkTreeListRowSorter._tag)
  inline def apply(inline o: Ptr[GtkTreeListRowSorter]): GtkTreeListRowSorter_autoptr = o
  extension (v: GtkTreeListRowSorter_autoptr)
    inline def value: Ptr[GtkTreeListRowSorter] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistrowsorter.h
*/
opaque type GtkTreeListRowSorter_listautoptr = Ptr[_root_.glib.all.GList]
object GtkTreeListRowSorter_listautoptr: 
  given _tag: Tag[GtkTreeListRowSorter_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkTreeListRowSorter_listautoptr = o
  extension (v: GtkTreeListRowSorter_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistrowsorter.h
*/
opaque type GtkTreeListRowSorter_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkTreeListRowSorter_queueautoptr: 
  given _tag: Tag[GtkTreeListRowSorter_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkTreeListRowSorter_queueautoptr = o
  extension (v: GtkTreeListRowSorter_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistrowsorter.h
*/
opaque type GtkTreeListRowSorter_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkTreeListRowSorter_slistautoptr: 
  given _tag: Tag[GtkTreeListRowSorter_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkTreeListRowSorter_slistautoptr = o
  extension (v: GtkTreeListRowSorter_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistmodel.h
*/
opaque type GtkTreeListRow_autoptr = Ptr[GtkTreeListRow]
object GtkTreeListRow_autoptr: 
  given _tag: Tag[GtkTreeListRow_autoptr] = Tag.Ptr[GtkTreeListRow](GtkTreeListRow._tag)
  inline def apply(inline o: Ptr[GtkTreeListRow]): GtkTreeListRow_autoptr = o
  extension (v: GtkTreeListRow_autoptr)
    inline def value: Ptr[GtkTreeListRow] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistmodel.h
*/
opaque type GtkTreeListRow_listautoptr = Ptr[_root_.glib.all.GList]
object GtkTreeListRow_listautoptr: 
  given _tag: Tag[GtkTreeListRow_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkTreeListRow_listautoptr = o
  extension (v: GtkTreeListRow_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistmodel.h
*/
opaque type GtkTreeListRow_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkTreeListRow_queueautoptr: 
  given _tag: Tag[GtkTreeListRow_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkTreeListRow_queueautoptr = o
  extension (v: GtkTreeListRow_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistmodel.h
*/
opaque type GtkTreeListRow_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkTreeListRow_slistautoptr: 
  given _tag: Tag[GtkTreeListRow_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkTreeListRow_slistautoptr = o
  extension (v: GtkTreeListRow_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkTreeModelFilterModifyFunc: : the `GtkTreeModelFilter` : a `GtkTreeIter` pointing to the row whose display values are determined : (out caller-allocates): A `GValue` which is already initialized for with the correct type for the column . : the column whose display value is determined

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreemodelfilter.h
*/
opaque type GtkTreeModelFilterModifyFunc = CFuncPtr5[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[_root_.gobject.all.GValue], CInt, _root_.glib.all.gpointer, Unit]
object GtkTreeModelFilterModifyFunc: 
  given _tag: Tag[GtkTreeModelFilterModifyFunc] = Tag.materializeCFuncPtr5[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[_root_.gobject.all.GValue], CInt, _root_.glib.all.gpointer, Unit]
  inline def apply(inline o: CFuncPtr5[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[_root_.gobject.all.GValue], CInt, _root_.glib.all.gpointer, Unit]): GtkTreeModelFilterModifyFunc = o
  extension (v: GtkTreeModelFilterModifyFunc)
    inline def value: CFuncPtr5[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[_root_.gobject.all.GValue], CInt, _root_.glib.all.gpointer, Unit] = v

/**
 * GtkTreeModelFilterVisibleFunc: : the child model of the `GtkTreeModelFilter` : a `GtkTreeIter` pointing to the row in whose visibility is determined

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreemodelfilter.h
*/
opaque type GtkTreeModelFilterVisibleFunc = CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
object GtkTreeModelFilterVisibleFunc: 
  given _tag: Tag[GtkTreeModelFilterVisibleFunc] = Tag.materializeCFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
  inline def apply(inline o: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gpointer, _root_.glib.all.gboolean]): GtkTreeModelFilterVisibleFunc = o
  extension (v: GtkTreeModelFilterVisibleFunc)
    inline def value: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gpointer, _root_.glib.all.gboolean] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeModelFilter_autoptr = Ptr[GtkTreeModelFilter]
object GtkTreeModelFilter_autoptr: 
  given _tag: Tag[GtkTreeModelFilter_autoptr] = Tag.Ptr[GtkTreeModelFilter](GtkTreeModelFilter._tag)
  inline def apply(inline o: Ptr[GtkTreeModelFilter]): GtkTreeModelFilter_autoptr = o
  extension (v: GtkTreeModelFilter_autoptr)
    inline def value: Ptr[GtkTreeModelFilter] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeModelFilter_listautoptr = Ptr[_root_.glib.all.GList]
object GtkTreeModelFilter_listautoptr: 
  given _tag: Tag[GtkTreeModelFilter_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkTreeModelFilter_listautoptr = o
  extension (v: GtkTreeModelFilter_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeModelFilter_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkTreeModelFilter_queueautoptr: 
  given _tag: Tag[GtkTreeModelFilter_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkTreeModelFilter_queueautoptr = o
  extension (v: GtkTreeModelFilter_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeModelFilter_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkTreeModelFilter_slistautoptr: 
  given _tag: Tag[GtkTreeModelFilter_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkTreeModelFilter_slistautoptr = o
  extension (v: GtkTreeModelFilter_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkTreeModelForeachFunc: : the `GtkTreeModel` being iterated : the current `GtkTreePath` : the current `GtkTreeIter`

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreemodel.h
*/
opaque type GtkTreeModelForeachFunc = CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
object GtkTreeModelForeachFunc: 
  given _tag: Tag[GtkTreeModelForeachFunc] = Tag.materializeCFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
  inline def apply(inline o: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], _root_.glib.all.gpointer, _root_.glib.all.gboolean]): GtkTreeModelForeachFunc = o
  extension (v: GtkTreeModelForeachFunc)
    inline def value: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], _root_.glib.all.gpointer, _root_.glib.all.gboolean] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeModelSort_autoptr = Ptr[GtkTreeModelSort]
object GtkTreeModelSort_autoptr: 
  given _tag: Tag[GtkTreeModelSort_autoptr] = Tag.Ptr[GtkTreeModelSort](GtkTreeModelSort._tag)
  inline def apply(inline o: Ptr[GtkTreeModelSort]): GtkTreeModelSort_autoptr = o
  extension (v: GtkTreeModelSort_autoptr)
    inline def value: Ptr[GtkTreeModelSort] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeModelSort_listautoptr = Ptr[_root_.glib.all.GList]
object GtkTreeModelSort_listautoptr: 
  given _tag: Tag[GtkTreeModelSort_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkTreeModelSort_listautoptr = o
  extension (v: GtkTreeModelSort_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeModelSort_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkTreeModelSort_queueautoptr: 
  given _tag: Tag[GtkTreeModelSort_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkTreeModelSort_queueautoptr = o
  extension (v: GtkTreeModelSort_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeModelSort_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkTreeModelSort_slistautoptr: 
  given _tag: Tag[GtkTreeModelSort_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkTreeModelSort_slistautoptr = o
  extension (v: GtkTreeModelSort_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeModel_autoptr = Ptr[GtkTreeModel]
object GtkTreeModel_autoptr: 
  given _tag: Tag[GtkTreeModel_autoptr] = Tag.Ptr[GtkTreeModel](GtkTreeModel._tag)
  inline def apply(inline o: Ptr[GtkTreeModel]): GtkTreeModel_autoptr = o
  extension (v: GtkTreeModel_autoptr)
    inline def value: Ptr[GtkTreeModel] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeModel_listautoptr = Ptr[_root_.glib.all.GList]
object GtkTreeModel_listautoptr: 
  given _tag: Tag[GtkTreeModel_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkTreeModel_listautoptr = o
  extension (v: GtkTreeModel_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeModel_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkTreeModel_queueautoptr: 
  given _tag: Tag[GtkTreeModel_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkTreeModel_queueautoptr = o
  extension (v: GtkTreeModel_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeModel_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkTreeModel_slistautoptr: 
  given _tag: Tag[GtkTreeModel_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkTreeModel_slistautoptr = o
  extension (v: GtkTreeModel_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreePath_autoptr = Ptr[GtkTreePath]
object GtkTreePath_autoptr: 
  given _tag: Tag[GtkTreePath_autoptr] = Tag.Ptr[GtkTreePath](GtkTreePath._tag)
  inline def apply(inline o: Ptr[GtkTreePath]): GtkTreePath_autoptr = o
  extension (v: GtkTreePath_autoptr)
    inline def value: Ptr[GtkTreePath] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreePath_listautoptr = Ptr[_root_.glib.all.GList]
object GtkTreePath_listautoptr: 
  given _tag: Tag[GtkTreePath_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkTreePath_listautoptr = o
  extension (v: GtkTreePath_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreePath_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkTreePath_queueautoptr: 
  given _tag: Tag[GtkTreePath_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkTreePath_queueautoptr = o
  extension (v: GtkTreePath_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreePath_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkTreePath_slistautoptr: 
  given _tag: Tag[GtkTreePath_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkTreePath_slistautoptr = o
  extension (v: GtkTreePath_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeRowReference_autoptr = Ptr[GtkTreeRowReference]
object GtkTreeRowReference_autoptr: 
  given _tag: Tag[GtkTreeRowReference_autoptr] = Tag.Ptr[GtkTreeRowReference](GtkTreeRowReference._tag)
  inline def apply(inline o: Ptr[GtkTreeRowReference]): GtkTreeRowReference_autoptr = o
  extension (v: GtkTreeRowReference_autoptr)
    inline def value: Ptr[GtkTreeRowReference] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeRowReference_listautoptr = Ptr[_root_.glib.all.GList]
object GtkTreeRowReference_listautoptr: 
  given _tag: Tag[GtkTreeRowReference_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkTreeRowReference_listautoptr = o
  extension (v: GtkTreeRowReference_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeRowReference_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkTreeRowReference_queueautoptr: 
  given _tag: Tag[GtkTreeRowReference_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkTreeRowReference_queueautoptr = o
  extension (v: GtkTreeRowReference_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeRowReference_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkTreeRowReference_slistautoptr: 
  given _tag: Tag[GtkTreeRowReference_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkTreeRowReference_slistautoptr = o
  extension (v: GtkTreeRowReference_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkTreeSelectionForeachFunc: : The `GtkTreeModel` being viewed : The `GtkTreePath` of a selected row : A `GtkTreeIter` pointing to a selected row

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreeselection.h
*/
opaque type GtkTreeSelectionForeachFunc = CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], _root_.glib.all.gpointer, Unit]
object GtkTreeSelectionForeachFunc: 
  given _tag: Tag[GtkTreeSelectionForeachFunc] = Tag.materializeCFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], _root_.glib.all.gpointer, Unit]
  inline def apply(inline o: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], _root_.glib.all.gpointer, Unit]): GtkTreeSelectionForeachFunc = o
  extension (v: GtkTreeSelectionForeachFunc)
    inline def value: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], _root_.glib.all.gpointer, Unit] = v

/**
 * GtkTreeSelectionFunc: : A `GtkTreeSelection` : A `GtkTreeModel` being viewed : The `GtkTreePath` of the row in question _currently_selected: %TRUE, if the path is currently selected

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreeselection.h
*/
opaque type GtkTreeSelectionFunc = CFuncPtr5[Ptr[GtkTreeSelection], Ptr[GtkTreeModel], Ptr[GtkTreePath], _root_.glib.all.gboolean, _root_.glib.all.gpointer, _root_.glib.all.gboolean]
object GtkTreeSelectionFunc: 
  given _tag: Tag[GtkTreeSelectionFunc] = Tag.materializeCFuncPtr5[Ptr[GtkTreeSelection], Ptr[GtkTreeModel], Ptr[GtkTreePath], _root_.glib.all.gboolean, _root_.glib.all.gpointer, _root_.glib.all.gboolean]
  inline def apply(inline o: CFuncPtr5[Ptr[GtkTreeSelection], Ptr[GtkTreeModel], Ptr[GtkTreePath], _root_.glib.all.gboolean, _root_.glib.all.gpointer, _root_.glib.all.gboolean]): GtkTreeSelectionFunc = o
  extension (v: GtkTreeSelectionFunc)
    inline def value: CFuncPtr5[Ptr[GtkTreeSelection], Ptr[GtkTreeModel], Ptr[GtkTreePath], _root_.glib.all.gboolean, _root_.glib.all.gpointer, _root_.glib.all.gboolean] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeSelection_autoptr = Ptr[GtkTreeSelection]
object GtkTreeSelection_autoptr: 
  given _tag: Tag[GtkTreeSelection_autoptr] = Tag.Ptr[GtkTreeSelection](GtkTreeSelection._tag)
  inline def apply(inline o: Ptr[GtkTreeSelection]): GtkTreeSelection_autoptr = o
  extension (v: GtkTreeSelection_autoptr)
    inline def value: Ptr[GtkTreeSelection] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeSelection_listautoptr = Ptr[_root_.glib.all.GList]
object GtkTreeSelection_listautoptr: 
  given _tag: Tag[GtkTreeSelection_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkTreeSelection_listautoptr = o
  extension (v: GtkTreeSelection_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeSelection_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkTreeSelection_queueautoptr: 
  given _tag: Tag[GtkTreeSelection_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkTreeSelection_queueautoptr = o
  extension (v: GtkTreeSelection_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeSelection_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkTreeSelection_slistautoptr: 
  given _tag: Tag[GtkTreeSelection_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkTreeSelection_slistautoptr = o
  extension (v: GtkTreeSelection_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeSortable_autoptr = Ptr[GtkTreeSortable]
object GtkTreeSortable_autoptr: 
  given _tag: Tag[GtkTreeSortable_autoptr] = Tag.Ptr[GtkTreeSortable](GtkTreeSortable._tag)
  inline def apply(inline o: Ptr[GtkTreeSortable]): GtkTreeSortable_autoptr = o
  extension (v: GtkTreeSortable_autoptr)
    inline def value: Ptr[GtkTreeSortable] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeSortable_listautoptr = Ptr[_root_.glib.all.GList]
object GtkTreeSortable_listautoptr: 
  given _tag: Tag[GtkTreeSortable_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkTreeSortable_listautoptr = o
  extension (v: GtkTreeSortable_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeSortable_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkTreeSortable_queueautoptr: 
  given _tag: Tag[GtkTreeSortable_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkTreeSortable_queueautoptr = o
  extension (v: GtkTreeSortable_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeSortable_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkTreeSortable_slistautoptr: 
  given _tag: Tag[GtkTreeSortable_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkTreeSortable_slistautoptr = o
  extension (v: GtkTreeSortable_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeStore_autoptr = Ptr[GtkTreeStore]
object GtkTreeStore_autoptr: 
  given _tag: Tag[GtkTreeStore_autoptr] = Tag.Ptr[GtkTreeStore](GtkTreeStore._tag)
  inline def apply(inline o: Ptr[GtkTreeStore]): GtkTreeStore_autoptr = o
  extension (v: GtkTreeStore_autoptr)
    inline def value: Ptr[GtkTreeStore] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeStore_listautoptr = Ptr[_root_.glib.all.GList]
object GtkTreeStore_listautoptr: 
  given _tag: Tag[GtkTreeStore_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkTreeStore_listautoptr = o
  extension (v: GtkTreeStore_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeStore_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkTreeStore_queueautoptr: 
  given _tag: Tag[GtkTreeStore_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkTreeStore_queueautoptr = o
  extension (v: GtkTreeStore_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeStore_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkTreeStore_slistautoptr: 
  given _tag: Tag[GtkTreeStore_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkTreeStore_slistautoptr = o
  extension (v: GtkTreeStore_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkTreeViewColumnDropFunc: _view: A `GtkTreeView` : The `GtkTreeViewColumn` being dragged

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreeview.h
*/
opaque type GtkTreeViewColumnDropFunc = CFuncPtr5[Ptr[GtkTreeView], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
object GtkTreeViewColumnDropFunc: 
  given _tag: Tag[GtkTreeViewColumnDropFunc] = Tag.materializeCFuncPtr5[Ptr[GtkTreeView], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
  inline def apply(inline o: CFuncPtr5[Ptr[GtkTreeView], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], _root_.glib.all.gpointer, _root_.glib.all.gboolean]): GtkTreeViewColumnDropFunc = o
  extension (v: GtkTreeViewColumnDropFunc)
    inline def value: CFuncPtr5[Ptr[GtkTreeView], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], _root_.glib.all.gpointer, _root_.glib.all.gboolean] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeViewColumn_autoptr = Ptr[GtkTreeViewColumn]
object GtkTreeViewColumn_autoptr: 
  given _tag: Tag[GtkTreeViewColumn_autoptr] = Tag.Ptr[GtkTreeViewColumn](GtkTreeViewColumn._tag)
  inline def apply(inline o: Ptr[GtkTreeViewColumn]): GtkTreeViewColumn_autoptr = o
  extension (v: GtkTreeViewColumn_autoptr)
    inline def value: Ptr[GtkTreeViewColumn] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeViewColumn_listautoptr = Ptr[_root_.glib.all.GList]
object GtkTreeViewColumn_listautoptr: 
  given _tag: Tag[GtkTreeViewColumn_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkTreeViewColumn_listautoptr = o
  extension (v: GtkTreeViewColumn_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeViewColumn_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkTreeViewColumn_queueautoptr: 
  given _tag: Tag[GtkTreeViewColumn_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkTreeViewColumn_queueautoptr = o
  extension (v: GtkTreeViewColumn_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeViewColumn_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkTreeViewColumn_slistautoptr: 
  given _tag: Tag[GtkTreeViewColumn_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkTreeViewColumn_slistautoptr = o
  extension (v: GtkTreeViewColumn_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkTreeViewMappingFunc: _view: A `GtkTreeView` : The path that’s expanded _data: user data

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreeview.h
*/
opaque type GtkTreeViewMappingFunc = CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], _root_.glib.all.gpointer, Unit]
object GtkTreeViewMappingFunc: 
  given _tag: Tag[GtkTreeViewMappingFunc] = Tag.materializeCFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], _root_.glib.all.gpointer, Unit]
  inline def apply(inline o: CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], _root_.glib.all.gpointer, Unit]): GtkTreeViewMappingFunc = o
  extension (v: GtkTreeViewMappingFunc)
    inline def value: CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], _root_.glib.all.gpointer, Unit] = v

/**
 * GtkTreeViewRowSeparatorFunc: : the `GtkTreeModel` : a `GtkTreeIter` pointing at a row in

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreeview.h
*/
opaque type GtkTreeViewRowSeparatorFunc = CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
object GtkTreeViewRowSeparatorFunc: 
  given _tag: Tag[GtkTreeViewRowSeparatorFunc] = Tag.materializeCFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
  inline def apply(inline o: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gpointer, _root_.glib.all.gboolean]): GtkTreeViewRowSeparatorFunc = o
  extension (v: GtkTreeViewRowSeparatorFunc)
    inline def value: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gpointer, _root_.glib.all.gboolean] = v

/**
 * GtkTreeViewSearchEqualFunc: : the `GtkTreeModel` being searched : the search column set by gtk_tree_view_set_search_column() : the key string to compare with : a `GtkTreeIter` pointing the row of that should be compared with . _data: (closure): user data from gtk_tree_view_set_search_equal_func()

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreeview.h
*/
opaque type GtkTreeViewSearchEqualFunc = CFuncPtr5[Ptr[GtkTreeModel], CInt, CString, Ptr[GtkTreeIter], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
object GtkTreeViewSearchEqualFunc: 
  given _tag: Tag[GtkTreeViewSearchEqualFunc] = Tag.materializeCFuncPtr5[Ptr[GtkTreeModel], CInt, CString, Ptr[GtkTreeIter], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
  inline def apply(inline o: CFuncPtr5[Ptr[GtkTreeModel], CInt, CString, Ptr[GtkTreeIter], _root_.glib.all.gpointer, _root_.glib.all.gboolean]): GtkTreeViewSearchEqualFunc = o
  extension (v: GtkTreeViewSearchEqualFunc)
    inline def value: CFuncPtr5[Ptr[GtkTreeModel], CInt, CString, Ptr[GtkTreeIter], _root_.glib.all.gpointer, _root_.glib.all.gboolean] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeView_autoptr = Ptr[GtkTreeView]
object GtkTreeView_autoptr: 
  given _tag: Tag[GtkTreeView_autoptr] = Tag.Ptr[GtkTreeView](GtkTreeView._tag)
  inline def apply(inline o: Ptr[GtkTreeView]): GtkTreeView_autoptr = o
  extension (v: GtkTreeView_autoptr)
    inline def value: Ptr[GtkTreeView] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeView_listautoptr = Ptr[_root_.glib.all.GList]
object GtkTreeView_listautoptr: 
  given _tag: Tag[GtkTreeView_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkTreeView_listautoptr = o
  extension (v: GtkTreeView_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeView_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkTreeView_queueautoptr: 
  given _tag: Tag[GtkTreeView_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkTreeView_queueautoptr = o
  extension (v: GtkTreeView_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkTreeView_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkTreeView_slistautoptr: 
  given _tag: Tag[GtkTreeView_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkTreeView_slistautoptr = o
  extension (v: GtkTreeView_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkvideo.h
*/
opaque type GtkVideoClass_autoptr = Ptr[GtkVideoClass]
object GtkVideoClass_autoptr: 
  given _tag: Tag[GtkVideoClass_autoptr] = Tag.Ptr[GtkVideoClass](GtkVideoClass._tag)
  inline def apply(inline o: Ptr[GtkVideoClass]): GtkVideoClass_autoptr = o
  extension (v: GtkVideoClass_autoptr)
    inline def value: Ptr[GtkVideoClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkvideo.h
*/
opaque type GtkVideoClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkVideoClass_listautoptr: 
  given _tag: Tag[GtkVideoClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkVideoClass_listautoptr = o
  extension (v: GtkVideoClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkvideo.h
*/
opaque type GtkVideoClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkVideoClass_queueautoptr: 
  given _tag: Tag[GtkVideoClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkVideoClass_queueautoptr = o
  extension (v: GtkVideoClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkvideo.h
*/
opaque type GtkVideoClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkVideoClass_slistautoptr: 
  given _tag: Tag[GtkVideoClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkVideoClass_slistautoptr = o
  extension (v: GtkVideoClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkvideo.h
*/
opaque type GtkVideo_autoptr = Ptr[GtkVideo]
object GtkVideo_autoptr: 
  given _tag: Tag[GtkVideo_autoptr] = Tag.Ptr[GtkVideo](GtkVideo._tag)
  inline def apply(inline o: Ptr[GtkVideo]): GtkVideo_autoptr = o
  extension (v: GtkVideo_autoptr)
    inline def value: Ptr[GtkVideo] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkvideo.h
*/
opaque type GtkVideo_listautoptr = Ptr[_root_.glib.all.GList]
object GtkVideo_listautoptr: 
  given _tag: Tag[GtkVideo_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkVideo_listautoptr = o
  extension (v: GtkVideo_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkvideo.h
*/
opaque type GtkVideo_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkVideo_queueautoptr: 
  given _tag: Tag[GtkVideo_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkVideo_queueautoptr = o
  extension (v: GtkVideo_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkvideo.h
*/
opaque type GtkVideo_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkVideo_slistautoptr: 
  given _tag: Tag[GtkVideo_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkVideo_slistautoptr = o
  extension (v: GtkVideo_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkViewport_autoptr = Ptr[GtkViewport]
object GtkViewport_autoptr: 
  given _tag: Tag[GtkViewport_autoptr] = Tag.Ptr[GtkViewport](GtkViewport._tag)
  inline def apply(inline o: Ptr[GtkViewport]): GtkViewport_autoptr = o
  extension (v: GtkViewport_autoptr)
    inline def value: Ptr[GtkViewport] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkViewport_listautoptr = Ptr[_root_.glib.all.GList]
object GtkViewport_listautoptr: 
  given _tag: Tag[GtkViewport_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkViewport_listautoptr = o
  extension (v: GtkViewport_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkViewport_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkViewport_queueautoptr: 
  given _tag: Tag[GtkViewport_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkViewport_queueautoptr = o
  extension (v: GtkViewport_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkViewport_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkViewport_slistautoptr: 
  given _tag: Tag[GtkViewport_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkViewport_slistautoptr = o
  extension (v: GtkViewport_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkVolumeButton_autoptr = Ptr[GtkVolumeButton]
object GtkVolumeButton_autoptr: 
  given _tag: Tag[GtkVolumeButton_autoptr] = Tag.Ptr[GtkVolumeButton](GtkVolumeButton._tag)
  inline def apply(inline o: Ptr[GtkVolumeButton]): GtkVolumeButton_autoptr = o
  extension (v: GtkVolumeButton_autoptr)
    inline def value: Ptr[GtkVolumeButton] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkVolumeButton_listautoptr = Ptr[_root_.glib.all.GList]
object GtkVolumeButton_listautoptr: 
  given _tag: Tag[GtkVolumeButton_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkVolumeButton_listautoptr = o
  extension (v: GtkVolumeButton_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkVolumeButton_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkVolumeButton_queueautoptr: 
  given _tag: Tag[GtkVolumeButton_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkVolumeButton_queueautoptr = o
  extension (v: GtkVolumeButton_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtk-autocleanups.h
*/
opaque type GtkVolumeButton_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkVolumeButton_slistautoptr: 
  given _tag: Tag[GtkVolumeButton_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkVolumeButton_slistautoptr = o
  extension (v: GtkVolumeButton_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GtkWidgetActionActivateFunc: : the widget to which the action belongs _name: the action name : parameter for activation

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidget.h
*/
opaque type GtkWidgetActionActivateFunc = CFuncPtr3[Ptr[GtkWidget], CString, Ptr[_root_.glib.all.GVariant], Unit]
object GtkWidgetActionActivateFunc: 
  given _tag: Tag[GtkWidgetActionActivateFunc] = Tag.materializeCFuncPtr3[Ptr[GtkWidget], CString, Ptr[_root_.glib.all.GVariant], Unit]
  inline def apply(inline o: CFuncPtr3[Ptr[GtkWidget], CString, Ptr[_root_.glib.all.GVariant], Unit]): GtkWidgetActionActivateFunc = o
  extension (v: GtkWidgetActionActivateFunc)
    inline def value: CFuncPtr3[Ptr[GtkWidget], CString, Ptr[_root_.glib.all.GVariant], Unit] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidgetpaintable.h
*/
opaque type GtkWidgetPaintableClass_autoptr = Ptr[GtkWidgetPaintableClass]
object GtkWidgetPaintableClass_autoptr: 
  given _tag: Tag[GtkWidgetPaintableClass_autoptr] = Tag.Ptr[GtkWidgetPaintableClass](GtkWidgetPaintableClass._tag)
  inline def apply(inline o: Ptr[GtkWidgetPaintableClass]): GtkWidgetPaintableClass_autoptr = o
  extension (v: GtkWidgetPaintableClass_autoptr)
    inline def value: Ptr[GtkWidgetPaintableClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidgetpaintable.h
*/
opaque type GtkWidgetPaintableClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkWidgetPaintableClass_listautoptr: 
  given _tag: Tag[GtkWidgetPaintableClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkWidgetPaintableClass_listautoptr = o
  extension (v: GtkWidgetPaintableClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidgetpaintable.h
*/
opaque type GtkWidgetPaintableClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkWidgetPaintableClass_queueautoptr: 
  given _tag: Tag[GtkWidgetPaintableClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkWidgetPaintableClass_queueautoptr = o
  extension (v: GtkWidgetPaintableClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidgetpaintable.h
*/
opaque type GtkWidgetPaintableClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkWidgetPaintableClass_slistautoptr: 
  given _tag: Tag[GtkWidgetPaintableClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkWidgetPaintableClass_slistautoptr = o
  extension (v: GtkWidgetPaintableClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidgetpaintable.h
*/
opaque type GtkWidgetPaintable_autoptr = Ptr[GtkWidgetPaintable]
object GtkWidgetPaintable_autoptr: 
  given _tag: Tag[GtkWidgetPaintable_autoptr] = Tag.Ptr[GtkWidgetPaintable](GtkWidgetPaintable._tag)
  inline def apply(inline o: Ptr[GtkWidgetPaintable]): GtkWidgetPaintable_autoptr = o
  extension (v: GtkWidgetPaintable_autoptr)
    inline def value: Ptr[GtkWidgetPaintable] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidgetpaintable.h
*/
opaque type GtkWidgetPaintable_listautoptr = Ptr[_root_.glib.all.GList]
object GtkWidgetPaintable_listautoptr: 
  given _tag: Tag[GtkWidgetPaintable_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkWidgetPaintable_listautoptr = o
  extension (v: GtkWidgetPaintable_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidgetpaintable.h
*/
opaque type GtkWidgetPaintable_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkWidgetPaintable_queueautoptr: 
  given _tag: Tag[GtkWidgetPaintable_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkWidgetPaintable_queueautoptr = o
  extension (v: GtkWidgetPaintable_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidgetpaintable.h
*/
opaque type GtkWidgetPaintable_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkWidgetPaintable_slistautoptr: 
  given _tag: Tag[GtkWidgetPaintable_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkWidgetPaintable_slistautoptr = o
  extension (v: GtkWidgetPaintable_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidget.h
*/
opaque type GtkWidget_autoptr = Ptr[GtkWidget]
object GtkWidget_autoptr: 
  given _tag: Tag[GtkWidget_autoptr] = Tag.Ptr[GtkWidget](GtkWidget._tag)
  inline def apply(inline o: Ptr[GtkWidget]): GtkWidget_autoptr = o
  extension (v: GtkWidget_autoptr)
    inline def value: Ptr[GtkWidget] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidget.h
*/
opaque type GtkWidget_listautoptr = Ptr[_root_.glib.all.GList]
object GtkWidget_listautoptr: 
  given _tag: Tag[GtkWidget_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkWidget_listautoptr = o
  extension (v: GtkWidget_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidget.h
*/
opaque type GtkWidget_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkWidget_queueautoptr: 
  given _tag: Tag[GtkWidget_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkWidget_queueautoptr = o
  extension (v: GtkWidget_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidget.h
*/
opaque type GtkWidget_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkWidget_slistautoptr: 
  given _tag: Tag[GtkWidget_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkWidget_slistautoptr = o
  extension (v: GtkWidget_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindowcontrols.h
*/
opaque type GtkWindowControlsClass_autoptr = Ptr[GtkWindowControlsClass]
object GtkWindowControlsClass_autoptr: 
  given _tag: Tag[GtkWindowControlsClass_autoptr] = Tag.Ptr[GtkWindowControlsClass](GtkWindowControlsClass._tag)
  inline def apply(inline o: Ptr[GtkWindowControlsClass]): GtkWindowControlsClass_autoptr = o
  extension (v: GtkWindowControlsClass_autoptr)
    inline def value: Ptr[GtkWindowControlsClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindowcontrols.h
*/
opaque type GtkWindowControlsClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkWindowControlsClass_listautoptr: 
  given _tag: Tag[GtkWindowControlsClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkWindowControlsClass_listautoptr = o
  extension (v: GtkWindowControlsClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindowcontrols.h
*/
opaque type GtkWindowControlsClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkWindowControlsClass_queueautoptr: 
  given _tag: Tag[GtkWindowControlsClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkWindowControlsClass_queueautoptr = o
  extension (v: GtkWindowControlsClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindowcontrols.h
*/
opaque type GtkWindowControlsClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkWindowControlsClass_slistautoptr: 
  given _tag: Tag[GtkWindowControlsClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkWindowControlsClass_slistautoptr = o
  extension (v: GtkWindowControlsClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindowcontrols.h
*/
opaque type GtkWindowControls_autoptr = Ptr[GtkWindowControls]
object GtkWindowControls_autoptr: 
  given _tag: Tag[GtkWindowControls_autoptr] = Tag.Ptr[GtkWindowControls](GtkWindowControls._tag)
  inline def apply(inline o: Ptr[GtkWindowControls]): GtkWindowControls_autoptr = o
  extension (v: GtkWindowControls_autoptr)
    inline def value: Ptr[GtkWindowControls] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindowcontrols.h
*/
opaque type GtkWindowControls_listautoptr = Ptr[_root_.glib.all.GList]
object GtkWindowControls_listautoptr: 
  given _tag: Tag[GtkWindowControls_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkWindowControls_listautoptr = o
  extension (v: GtkWindowControls_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindowcontrols.h
*/
opaque type GtkWindowControls_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkWindowControls_queueautoptr: 
  given _tag: Tag[GtkWindowControls_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkWindowControls_queueautoptr = o
  extension (v: GtkWindowControls_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindowcontrols.h
*/
opaque type GtkWindowControls_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkWindowControls_slistautoptr: 
  given _tag: Tag[GtkWindowControls_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkWindowControls_slistautoptr = o
  extension (v: GtkWindowControls_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindow.h
*/
opaque type GtkWindowGroup_autoptr = Ptr[GtkWindowGroup]
object GtkWindowGroup_autoptr: 
  given _tag: Tag[GtkWindowGroup_autoptr] = Tag.Ptr[GtkWindowGroup](GtkWindowGroup._tag)
  inline def apply(inline o: Ptr[GtkWindowGroup]): GtkWindowGroup_autoptr = o
  extension (v: GtkWindowGroup_autoptr)
    inline def value: Ptr[GtkWindowGroup] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindow.h
*/
opaque type GtkWindowGroup_listautoptr = Ptr[_root_.glib.all.GList]
object GtkWindowGroup_listautoptr: 
  given _tag: Tag[GtkWindowGroup_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkWindowGroup_listautoptr = o
  extension (v: GtkWindowGroup_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindow.h
*/
opaque type GtkWindowGroup_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkWindowGroup_queueautoptr: 
  given _tag: Tag[GtkWindowGroup_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkWindowGroup_queueautoptr = o
  extension (v: GtkWindowGroup_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindow.h
*/
opaque type GtkWindowGroup_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkWindowGroup_slistautoptr: 
  given _tag: Tag[GtkWindowGroup_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkWindowGroup_slistautoptr = o
  extension (v: GtkWindowGroup_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindowhandle.h
*/
opaque type GtkWindowHandleClass_autoptr = Ptr[GtkWindowHandleClass]
object GtkWindowHandleClass_autoptr: 
  given _tag: Tag[GtkWindowHandleClass_autoptr] = Tag.Ptr[GtkWindowHandleClass](GtkWindowHandleClass._tag)
  inline def apply(inline o: Ptr[GtkWindowHandleClass]): GtkWindowHandleClass_autoptr = o
  extension (v: GtkWindowHandleClass_autoptr)
    inline def value: Ptr[GtkWindowHandleClass] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindowhandle.h
*/
opaque type GtkWindowHandleClass_listautoptr = Ptr[_root_.glib.all.GList]
object GtkWindowHandleClass_listautoptr: 
  given _tag: Tag[GtkWindowHandleClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkWindowHandleClass_listautoptr = o
  extension (v: GtkWindowHandleClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindowhandle.h
*/
opaque type GtkWindowHandleClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkWindowHandleClass_queueautoptr: 
  given _tag: Tag[GtkWindowHandleClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkWindowHandleClass_queueautoptr = o
  extension (v: GtkWindowHandleClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindowhandle.h
*/
opaque type GtkWindowHandleClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkWindowHandleClass_slistautoptr: 
  given _tag: Tag[GtkWindowHandleClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkWindowHandleClass_slistautoptr = o
  extension (v: GtkWindowHandleClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindowhandle.h
*/
opaque type GtkWindowHandle_autoptr = Ptr[GtkWindowHandle]
object GtkWindowHandle_autoptr: 
  given _tag: Tag[GtkWindowHandle_autoptr] = Tag.Ptr[GtkWindowHandle](GtkWindowHandle._tag)
  inline def apply(inline o: Ptr[GtkWindowHandle]): GtkWindowHandle_autoptr = o
  extension (v: GtkWindowHandle_autoptr)
    inline def value: Ptr[GtkWindowHandle] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindowhandle.h
*/
opaque type GtkWindowHandle_listautoptr = Ptr[_root_.glib.all.GList]
object GtkWindowHandle_listautoptr: 
  given _tag: Tag[GtkWindowHandle_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkWindowHandle_listautoptr = o
  extension (v: GtkWindowHandle_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindowhandle.h
*/
opaque type GtkWindowHandle_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkWindowHandle_queueautoptr: 
  given _tag: Tag[GtkWindowHandle_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkWindowHandle_queueautoptr = o
  extension (v: GtkWindowHandle_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindowhandle.h
*/
opaque type GtkWindowHandle_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkWindowHandle_slistautoptr: 
  given _tag: Tag[GtkWindowHandle_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkWindowHandle_slistautoptr = o
  extension (v: GtkWindowHandle_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindow.h
*/
opaque type GtkWindow_autoptr = Ptr[GtkWindow]
object GtkWindow_autoptr: 
  given _tag: Tag[GtkWindow_autoptr] = Tag.Ptr[GtkWindow](GtkWindow._tag)
  inline def apply(inline o: Ptr[GtkWindow]): GtkWindow_autoptr = o
  extension (v: GtkWindow_autoptr)
    inline def value: Ptr[GtkWindow] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindow.h
*/
opaque type GtkWindow_listautoptr = Ptr[_root_.glib.all.GList]
object GtkWindow_listautoptr: 
  given _tag: Tag[GtkWindow_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GtkWindow_listautoptr = o
  extension (v: GtkWindow_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindow.h
*/
opaque type GtkWindow_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GtkWindow_queueautoptr: 
  given _tag: Tag[GtkWindow_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GtkWindow_queueautoptr = o
  extension (v: GtkWindow_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindow.h
*/
opaque type GtkWindow_slistautoptr = Ptr[_root_.glib.all.GSList]
object GtkWindow_slistautoptr: 
  given _tag: Tag[GtkWindow_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GtkWindow_slistautoptr = o
  extension (v: GtkWindow_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/lib/llvm-14/lib/clang/14.0.0/include/xmmintrin.h
*/
opaque type __m128 = CStruct4[Float, Float, Float, Float]
object __m128: 
  given _tag: Tag[__m128] = Tag.materializeCStruct4Tag[Float, Float, Float, Float]
  inline def apply(inline o: CStruct4[Float, Float, Float, Float]): __m128 = o
  extension (v: __m128)
    inline def value: CStruct4[Float, Float, Float, Float] = v

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

type pid_t = posix.sys.types.pid_t
object pid_t: 
  val _tag: Tag[pid_t] = summon[Tag[posix.sys.types.pid_t]]
  inline def apply(inline o: posix.sys.types.pid_t): pid_t = o
  extension (v: pid_t)
    inline def value: posix.sys.types.pid_t = v

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

type uid_t = posix.sys.types.uid_t
object uid_t: 
  val _tag: Tag[uid_t] = summon[Tag[posix.sys.types.uid_t]]
  inline def apply(inline o: posix.sys.types.uid_t): uid_t = o
  extension (v: uid_t)
    inline def value: posix.sys.types.uid_t = v

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

