package glib
package aliases

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

import _root_.glib.enumerations.*
import _root_.glib.aliases.*
import _root_.glib.structs.*
import _root_.glib.unions.*

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GArray_autoptr = Ptr[GArray]
object GArray_autoptr: 
  given _tag: Tag[GArray_autoptr] = Tag.Ptr[GArray](GArray._tag)
  inline def apply(inline o: Ptr[GArray]): GArray_autoptr = o
  extension (v: GArray_autoptr)
    inline def value: Ptr[GArray] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GArray_listautoptr = Ptr[GList]
object GArray_listautoptr: 
  given _tag: Tag[GArray_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GArray_listautoptr = o
  extension (v: GArray_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GArray_queueautoptr = Ptr[GQueue]
object GArray_queueautoptr: 
  given _tag: Tag[GArray_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GArray_queueautoptr = o
  extension (v: GArray_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GArray_slistautoptr = Ptr[GSList]
object GArray_slistautoptr: 
  given _tag: Tag[GArray_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GArray_slistautoptr = o
  extension (v: GArray_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GAsyncQueue_autoptr = Ptr[GAsyncQueue]
object GAsyncQueue_autoptr: 
  given _tag: Tag[GAsyncQueue_autoptr] = Tag.Ptr[GAsyncQueue](GAsyncQueue._tag)
  inline def apply(inline o: Ptr[GAsyncQueue]): GAsyncQueue_autoptr = o
  extension (v: GAsyncQueue_autoptr)
    inline def value: Ptr[GAsyncQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GAsyncQueue_listautoptr = Ptr[GList]
object GAsyncQueue_listautoptr: 
  given _tag: Tag[GAsyncQueue_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GAsyncQueue_listautoptr = o
  extension (v: GAsyncQueue_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GAsyncQueue_queueautoptr = Ptr[GQueue]
object GAsyncQueue_queueautoptr: 
  given _tag: Tag[GAsyncQueue_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GAsyncQueue_queueautoptr = o
  extension (v: GAsyncQueue_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GAsyncQueue_slistautoptr = Ptr[GSList]
object GAsyncQueue_slistautoptr: 
  given _tag: Tag[GAsyncQueue_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GAsyncQueue_slistautoptr = o
  extension (v: GAsyncQueue_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GBookmarkFile_autoptr = Ptr[GBookmarkFile]
object GBookmarkFile_autoptr: 
  given _tag: Tag[GBookmarkFile_autoptr] = Tag.Ptr[GBookmarkFile](GBookmarkFile._tag)
  inline def apply(inline o: Ptr[GBookmarkFile]): GBookmarkFile_autoptr = o
  extension (v: GBookmarkFile_autoptr)
    inline def value: Ptr[GBookmarkFile] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GBookmarkFile_listautoptr = Ptr[GList]
object GBookmarkFile_listautoptr: 
  given _tag: Tag[GBookmarkFile_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GBookmarkFile_listautoptr = o
  extension (v: GBookmarkFile_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GBookmarkFile_queueautoptr = Ptr[GQueue]
object GBookmarkFile_queueautoptr: 
  given _tag: Tag[GBookmarkFile_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GBookmarkFile_queueautoptr = o
  extension (v: GBookmarkFile_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GBookmarkFile_slistautoptr = Ptr[GSList]
object GBookmarkFile_slistautoptr: 
  given _tag: Tag[GBookmarkFile_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GBookmarkFile_slistautoptr = o
  extension (v: GBookmarkFile_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GByteArray_autoptr = Ptr[GByteArray]
object GByteArray_autoptr: 
  given _tag: Tag[GByteArray_autoptr] = Tag.Ptr[GByteArray](GByteArray._tag)
  inline def apply(inline o: Ptr[GByteArray]): GByteArray_autoptr = o
  extension (v: GByteArray_autoptr)
    inline def value: Ptr[GByteArray] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GByteArray_listautoptr = Ptr[GList]
object GByteArray_listautoptr: 
  given _tag: Tag[GByteArray_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GByteArray_listautoptr = o
  extension (v: GByteArray_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GByteArray_queueautoptr = Ptr[GQueue]
object GByteArray_queueautoptr: 
  given _tag: Tag[GByteArray_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GByteArray_queueautoptr = o
  extension (v: GByteArray_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GByteArray_slistautoptr = Ptr[GSList]
object GByteArray_slistautoptr: 
  given _tag: Tag[GByteArray_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GByteArray_slistautoptr = o
  extension (v: GByteArray_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GBytes_autoptr = Ptr[GBytes]
object GBytes_autoptr: 
  given _tag: Tag[GBytes_autoptr] = Tag.Ptr[GBytes](GBytes._tag)
  inline def apply(inline o: Ptr[GBytes]): GBytes_autoptr = o
  extension (v: GBytes_autoptr)
    inline def value: Ptr[GBytes] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GBytes_listautoptr = Ptr[GList]
object GBytes_listautoptr: 
  given _tag: Tag[GBytes_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GBytes_listautoptr = o
  extension (v: GBytes_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GBytes_queueautoptr = Ptr[GQueue]
object GBytes_queueautoptr: 
  given _tag: Tag[GBytes_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GBytes_queueautoptr = o
  extension (v: GBytes_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GBytes_slistautoptr = Ptr[GSList]
object GBytes_slistautoptr: 
  given _tag: Tag[GBytes_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GBytes_slistautoptr = o
  extension (v: GBytes_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/deprecated/gcache.h
*/
opaque type GCacheDestroyFunc = CFuncPtr1[gpointer, Unit]
object GCacheDestroyFunc: 
  given _tag: Tag[GCacheDestroyFunc] = Tag.materializeCFuncPtr1[gpointer, Unit]
  inline def apply(inline o: CFuncPtr1[gpointer, Unit]): GCacheDestroyFunc = o
  extension (v: GCacheDestroyFunc)
    inline def value: CFuncPtr1[gpointer, Unit] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/deprecated/gcache.h
*/
opaque type GCacheDupFunc = CFuncPtr1[gpointer, gpointer]
object GCacheDupFunc: 
  given _tag: Tag[GCacheDupFunc] = Tag.materializeCFuncPtr1[gpointer, gpointer]
  inline def apply(inline o: CFuncPtr1[gpointer, gpointer]): GCacheDupFunc = o
  extension (v: GCacheDupFunc)
    inline def value: CFuncPtr1[gpointer, gpointer] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/deprecated/gcache.h
*/
opaque type GCacheNewFunc = CFuncPtr1[gpointer, gpointer]
object GCacheNewFunc: 
  given _tag: Tag[GCacheNewFunc] = Tag.materializeCFuncPtr1[gpointer, gpointer]
  inline def apply(inline o: CFuncPtr1[gpointer, gpointer]): GCacheNewFunc = o
  extension (v: GCacheNewFunc)
    inline def value: CFuncPtr1[gpointer, gpointer] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GChecksum_autoptr = Ptr[GChecksum]
object GChecksum_autoptr: 
  given _tag: Tag[GChecksum_autoptr] = Tag.Ptr[GChecksum](GChecksum._tag)
  inline def apply(inline o: Ptr[GChecksum]): GChecksum_autoptr = o
  extension (v: GChecksum_autoptr)
    inline def value: Ptr[GChecksum] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GChecksum_listautoptr = Ptr[GList]
object GChecksum_listautoptr: 
  given _tag: Tag[GChecksum_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GChecksum_listautoptr = o
  extension (v: GChecksum_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GChecksum_queueautoptr = Ptr[GQueue]
object GChecksum_queueautoptr: 
  given _tag: Tag[GChecksum_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GChecksum_queueautoptr = o
  extension (v: GChecksum_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GChecksum_slistautoptr = Ptr[GSList]
object GChecksum_slistautoptr: 
  given _tag: Tag[GChecksum_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GChecksum_slistautoptr = o
  extension (v: GChecksum_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * GChildWatchFunc: : the process id of the child process _status: Status information about the child process, encoded in a platform-specific manner _data: user data passed to g_child_watch_add()

 * [bindgen] header: /usr/include/glib-2.0/glib/gmain.h
*/
opaque type GChildWatchFunc = CFuncPtr3[GPid, gint, gpointer, Unit]
object GChildWatchFunc: 
  given _tag: Tag[GChildWatchFunc] = Tag.materializeCFuncPtr3[GPid, gint, gpointer, Unit]
  inline def apply(inline o: CFuncPtr3[GPid, gint, gpointer, Unit]): GChildWatchFunc = o
  extension (v: GChildWatchFunc)
    inline def value: CFuncPtr3[GPid, gint, gpointer, Unit] = v

/**
 * GClearHandleFunc: _id: the handle ID to clear

 * [bindgen] header: /usr/include/glib-2.0/glib/gmain.h
*/
opaque type GClearHandleFunc = CFuncPtr1[guint, Unit]
object GClearHandleFunc: 
  given _tag: Tag[GClearHandleFunc] = Tag.materializeCFuncPtr1[guint, Unit]
  inline def apply(inline o: CFuncPtr1[guint, Unit]): GClearHandleFunc = o
  extension (v: GClearHandleFunc)
    inline def value: CFuncPtr1[guint, Unit] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
*/
opaque type GCompareDataFunc = CFuncPtr3[gconstpointer, gconstpointer, gpointer, gint]
object GCompareDataFunc: 
  given _tag: Tag[GCompareDataFunc] = Tag.materializeCFuncPtr3[gconstpointer, gconstpointer, gpointer, gint]
  inline def apply(inline o: CFuncPtr3[gconstpointer, gconstpointer, gpointer, gint]): GCompareDataFunc = o
  extension (v: GCompareDataFunc)
    inline def value: CFuncPtr3[gconstpointer, gconstpointer, gpointer, gint] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
*/
opaque type GCompareFunc = CFuncPtr2[gconstpointer, gconstpointer, gint]
object GCompareFunc: 
  given _tag: Tag[GCompareFunc] = Tag.materializeCFuncPtr2[gconstpointer, gconstpointer, gint]
  inline def apply(inline o: CFuncPtr2[gconstpointer, gconstpointer, gint]): GCompareFunc = o
  extension (v: GCompareFunc)
    inline def value: CFuncPtr2[gconstpointer, gconstpointer, gint] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/deprecated/gcompletion.h
*/
opaque type GCompletionFunc = CFuncPtr1[gpointer, Ptr[gchar]]
object GCompletionFunc: 
  given _tag: Tag[GCompletionFunc] = Tag.materializeCFuncPtr1[gpointer, Ptr[gchar]]
  inline def apply(inline o: CFuncPtr1[gpointer, Ptr[gchar]]): GCompletionFunc = o
  extension (v: GCompletionFunc)
    inline def value: CFuncPtr1[gpointer, Ptr[gchar]] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/deprecated/gcompletion.h
*/
opaque type GCompletionStrncmpFunc = CFuncPtr3[Ptr[gchar], Ptr[gchar], gsize, gint]
object GCompletionStrncmpFunc: 
  given _tag: Tag[GCompletionStrncmpFunc] = Tag.materializeCFuncPtr3[Ptr[gchar], Ptr[gchar], gsize, gint]
  inline def apply(inline o: CFuncPtr3[Ptr[gchar], Ptr[gchar], gsize, gint]): GCompletionStrncmpFunc = o
  extension (v: GCompletionStrncmpFunc)
    inline def value: CFuncPtr3[Ptr[gchar], Ptr[gchar], gsize, gint] = v

/**
 * GCopyFunc: : (not nullable): A pointer to the data which should be copied

 * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
*/
opaque type GCopyFunc = CFuncPtr2[gconstpointer, gpointer, gpointer]
object GCopyFunc: 
  given _tag: Tag[GCopyFunc] = Tag.materializeCFuncPtr2[gconstpointer, gpointer, gpointer]
  inline def apply(inline o: CFuncPtr2[gconstpointer, gpointer, gpointer]): GCopyFunc = o
  extension (v: GCopyFunc)
    inline def value: CFuncPtr2[gconstpointer, gpointer, gpointer] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gdataset.h
*/
opaque type GDataForeachFunc = CFuncPtr3[GQuark, gpointer, gpointer, Unit]
object GDataForeachFunc: 
  given _tag: Tag[GDataForeachFunc] = Tag.materializeCFuncPtr3[GQuark, gpointer, gpointer, Unit]
  inline def apply(inline o: CFuncPtr3[GQuark, gpointer, gpointer, Unit]): GDataForeachFunc = o
  extension (v: GDataForeachFunc)
    inline def value: CFuncPtr3[GQuark, gpointer, gpointer, Unit] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gdate.h
*/
type GDateDay = guint8
object GDateDay: 
  given _tag: Tag[GDateDay] = guint8._tag
  inline def apply(inline o: guint8): GDateDay = o
  extension (v: GDateDay)
    inline def value: guint8 = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GDateTime_autoptr = Ptr[GDateTime]
object GDateTime_autoptr: 
  given _tag: Tag[GDateTime_autoptr] = Tag.Ptr[GDateTime](GDateTime._tag)
  inline def apply(inline o: Ptr[GDateTime]): GDateTime_autoptr = o
  extension (v: GDateTime_autoptr)
    inline def value: Ptr[GDateTime] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GDateTime_listautoptr = Ptr[GList]
object GDateTime_listautoptr: 
  given _tag: Tag[GDateTime_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDateTime_listautoptr = o
  extension (v: GDateTime_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GDateTime_queueautoptr = Ptr[GQueue]
object GDateTime_queueautoptr: 
  given _tag: Tag[GDateTime_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GDateTime_queueautoptr = o
  extension (v: GDateTime_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GDateTime_slistautoptr = Ptr[GSList]
object GDateTime_slistautoptr: 
  given _tag: Tag[GDateTime_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDateTime_slistautoptr = o
  extension (v: GDateTime_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gdate.h
*/
type GDateYear = guint16
object GDateYear: 
  given _tag: Tag[GDateYear] = guint16._tag
  inline def apply(inline o: guint16): GDateYear = o
  extension (v: GDateYear)
    inline def value: guint16 = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GDate_autoptr = Ptr[GDate]
object GDate_autoptr: 
  given _tag: Tag[GDate_autoptr] = Tag.Ptr[GDate](GDate._tag)
  inline def apply(inline o: Ptr[GDate]): GDate_autoptr = o
  extension (v: GDate_autoptr)
    inline def value: Ptr[GDate] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GDate_listautoptr = Ptr[GList]
object GDate_listautoptr: 
  given _tag: Tag[GDate_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDate_listautoptr = o
  extension (v: GDate_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GDate_queueautoptr = Ptr[GQueue]
object GDate_queueautoptr: 
  given _tag: Tag[GDate_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GDate_queueautoptr = o
  extension (v: GDate_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GDate_slistautoptr = Ptr[GSList]
object GDate_slistautoptr: 
  given _tag: Tag[GDate_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDate_slistautoptr = o
  extension (v: GDate_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
*/
opaque type GDestroyNotify = CFuncPtr1[gpointer, Unit]
object GDestroyNotify: 
  given _tag: Tag[GDestroyNotify] = Tag.materializeCFuncPtr1[gpointer, Unit]
  inline def apply(inline o: CFuncPtr1[gpointer, Unit]): GDestroyNotify = o
  extension (v: GDestroyNotify)
    inline def value: CFuncPtr1[gpointer, Unit] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GDir_autoptr = Ptr[GDir]
object GDir_autoptr: 
  given _tag: Tag[GDir_autoptr] = Tag.Ptr[GDir](GDir._tag)
  inline def apply(inline o: Ptr[GDir]): GDir_autoptr = o
  extension (v: GDir_autoptr)
    inline def value: Ptr[GDir] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GDir_listautoptr = Ptr[GList]
object GDir_listautoptr: 
  given _tag: Tag[GDir_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDir_listautoptr = o
  extension (v: GDir_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GDir_queueautoptr = Ptr[GQueue]
object GDir_queueautoptr: 
  given _tag: Tag[GDir_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GDir_queueautoptr = o
  extension (v: GDir_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GDir_slistautoptr = Ptr[GSList]
object GDir_slistautoptr: 
  given _tag: Tag[GDir_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDir_slistautoptr = o
  extension (v: GDir_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gdataset.h
*/
opaque type GDuplicateFunc = CFuncPtr2[gpointer, gpointer, gpointer]
object GDuplicateFunc: 
  given _tag: Tag[GDuplicateFunc] = Tag.materializeCFuncPtr2[gpointer, gpointer, gpointer]
  inline def apply(inline o: CFuncPtr2[gpointer, gpointer, gpointer]): GDuplicateFunc = o
  extension (v: GDuplicateFunc)
    inline def value: CFuncPtr2[gpointer, gpointer, gpointer] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
*/
opaque type GEqualFunc = CFuncPtr2[gconstpointer, gconstpointer, gboolean]
object GEqualFunc: 
  given _tag: Tag[GEqualFunc] = Tag.materializeCFuncPtr2[gconstpointer, gconstpointer, gboolean]
  inline def apply(inline o: CFuncPtr2[gconstpointer, gconstpointer, gboolean]): GEqualFunc = o
  extension (v: GEqualFunc)
    inline def value: CFuncPtr2[gconstpointer, gconstpointer, gboolean] = v

/**
 * GErrorClearFunc: : extended error to clear

 * [bindgen] header: /usr/include/glib-2.0/glib/gerror.h
*/
opaque type GErrorClearFunc = CFuncPtr1[Ptr[GError], Unit]
object GErrorClearFunc: 
  given _tag: Tag[GErrorClearFunc] = Tag.materializeCFuncPtr1[Ptr[GError], Unit]
  inline def apply(inline o: CFuncPtr1[Ptr[GError], Unit]): GErrorClearFunc = o
  extension (v: GErrorClearFunc)
    inline def value: CFuncPtr1[Ptr[GError], Unit] = v

/**
 * GErrorCopyFunc: _error: source extended error

 * [bindgen] header: /usr/include/glib-2.0/glib/gerror.h
*/
opaque type GErrorCopyFunc = CFuncPtr2[Ptr[GError], Ptr[GError], Unit]
object GErrorCopyFunc: 
  given _tag: Tag[GErrorCopyFunc] = Tag.materializeCFuncPtr2[Ptr[GError], Ptr[GError], Unit]
  inline def apply(inline o: CFuncPtr2[Ptr[GError], Ptr[GError], Unit]): GErrorCopyFunc = o
  extension (v: GErrorCopyFunc)
    inline def value: CFuncPtr2[Ptr[GError], Ptr[GError], Unit] = v

/**
 * GErrorInitFunc: : extended error

 * [bindgen] header: /usr/include/glib-2.0/glib/gerror.h
*/
opaque type GErrorInitFunc = CFuncPtr1[Ptr[GError], Unit]
object GErrorInitFunc: 
  given _tag: Tag[GErrorInitFunc] = Tag.materializeCFuncPtr1[Ptr[GError], Unit]
  inline def apply(inline o: CFuncPtr1[Ptr[GError], Unit]): GErrorInitFunc = o
  extension (v: GErrorInitFunc)
    inline def value: CFuncPtr1[Ptr[GError], Unit] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GError_autoptr = Ptr[GError]
object GError_autoptr: 
  given _tag: Tag[GError_autoptr] = Tag.Ptr[GError](GError._tag)
  inline def apply(inline o: Ptr[GError]): GError_autoptr = o
  extension (v: GError_autoptr)
    inline def value: Ptr[GError] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GError_listautoptr = Ptr[GList]
object GError_listautoptr: 
  given _tag: Tag[GError_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GError_listautoptr = o
  extension (v: GError_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GError_queueautoptr = Ptr[GQueue]
object GError_queueautoptr: 
  given _tag: Tag[GError_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GError_queueautoptr = o
  extension (v: GError_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GError_slistautoptr = Ptr[GSList]
object GError_slistautoptr: 
  given _tag: Tag[GError_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GError_slistautoptr = o
  extension (v: GError_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * GFreeFunc:

 * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
*/
opaque type GFreeFunc = CFuncPtr1[gpointer, Unit]
object GFreeFunc: 
  given _tag: Tag[GFreeFunc] = Tag.materializeCFuncPtr1[gpointer, Unit]
  inline def apply(inline o: CFuncPtr1[gpointer, Unit]): GFreeFunc = o
  extension (v: GFreeFunc)
    inline def value: CFuncPtr1[gpointer, Unit] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
*/
opaque type GFunc = CFuncPtr2[gpointer, gpointer, Unit]
object GFunc: 
  given _tag: Tag[GFunc] = Tag.materializeCFuncPtr2[gpointer, gpointer, Unit]
  inline def apply(inline o: CFuncPtr2[gpointer, gpointer, Unit]): GFunc = o
  extension (v: GFunc)
    inline def value: CFuncPtr2[gpointer, gpointer, Unit] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
*/
opaque type GHFunc = CFuncPtr3[gpointer, gpointer, gpointer, Unit]
object GHFunc: 
  given _tag: Tag[GHFunc] = Tag.materializeCFuncPtr3[gpointer, gpointer, gpointer, Unit]
  inline def apply(inline o: CFuncPtr3[gpointer, gpointer, gpointer, Unit]): GHFunc = o
  extension (v: GHFunc)
    inline def value: CFuncPtr3[gpointer, gpointer, gpointer, Unit] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/ghash.h
*/
opaque type GHRFunc = CFuncPtr3[gpointer, gpointer, gpointer, gboolean]
object GHRFunc: 
  given _tag: Tag[GHRFunc] = Tag.materializeCFuncPtr3[gpointer, gpointer, gpointer, gboolean]
  inline def apply(inline o: CFuncPtr3[gpointer, gpointer, gpointer, gboolean]): GHRFunc = o
  extension (v: GHRFunc)
    inline def value: CFuncPtr3[gpointer, gpointer, gpointer, gboolean] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
*/
opaque type GHashFunc = CFuncPtr1[gconstpointer, guint]
object GHashFunc: 
  given _tag: Tag[GHashFunc] = Tag.materializeCFuncPtr1[gconstpointer, guint]
  inline def apply(inline o: CFuncPtr1[gconstpointer, guint]): GHashFunc = o
  extension (v: GHashFunc)
    inline def value: CFuncPtr1[gconstpointer, guint] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GHashTable_autoptr = Ptr[GHashTable]
object GHashTable_autoptr: 
  given _tag: Tag[GHashTable_autoptr] = Tag.Ptr[GHashTable](GHashTable._tag)
  inline def apply(inline o: Ptr[GHashTable]): GHashTable_autoptr = o
  extension (v: GHashTable_autoptr)
    inline def value: Ptr[GHashTable] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GHashTable_listautoptr = Ptr[GList]
object GHashTable_listautoptr: 
  given _tag: Tag[GHashTable_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GHashTable_listautoptr = o
  extension (v: GHashTable_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GHashTable_queueautoptr = Ptr[GQueue]
object GHashTable_queueautoptr: 
  given _tag: Tag[GHashTable_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GHashTable_queueautoptr = o
  extension (v: GHashTable_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GHashTable_slistautoptr = Ptr[GSList]
object GHashTable_slistautoptr: 
  given _tag: Tag[GHashTable_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GHashTable_slistautoptr = o
  extension (v: GHashTable_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GHmac_autoptr = Ptr[GHmac]
object GHmac_autoptr: 
  given _tag: Tag[GHmac_autoptr] = Tag.Ptr[GHmac](GHmac._tag)
  inline def apply(inline o: Ptr[GHmac]): GHmac_autoptr = o
  extension (v: GHmac_autoptr)
    inline def value: Ptr[GHmac] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GHmac_listautoptr = Ptr[GList]
object GHmac_listautoptr: 
  given _tag: Tag[GHmac_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GHmac_listautoptr = o
  extension (v: GHmac_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GHmac_queueautoptr = Ptr[GQueue]
object GHmac_queueautoptr: 
  given _tag: Tag[GHmac_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GHmac_queueautoptr = o
  extension (v: GHmac_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GHmac_slistautoptr = Ptr[GSList]
object GHmac_slistautoptr: 
  given _tag: Tag[GHmac_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GHmac_slistautoptr = o
  extension (v: GHmac_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/ghook.h
*/
opaque type GHookCheckFunc = CFuncPtr1[gpointer, gboolean]
object GHookCheckFunc: 
  given _tag: Tag[GHookCheckFunc] = Tag.materializeCFuncPtr1[gpointer, gboolean]
  inline def apply(inline o: CFuncPtr1[gpointer, gboolean]): GHookCheckFunc = o
  extension (v: GHookCheckFunc)
    inline def value: CFuncPtr1[gpointer, gboolean] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/ghook.h
*/
opaque type GHookCheckMarshaller = CFuncPtr2[Ptr[GHook], gpointer, gboolean]
object GHookCheckMarshaller: 
  given _tag: Tag[GHookCheckMarshaller] = Tag.materializeCFuncPtr2[Ptr[GHook], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr2[Ptr[GHook], gpointer, gboolean]): GHookCheckMarshaller = o
  extension (v: GHookCheckMarshaller)
    inline def value: CFuncPtr2[Ptr[GHook], gpointer, gboolean] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/ghook.h
*/
opaque type GHookCompareFunc = CFuncPtr2[Ptr[GHook], Ptr[GHook], gint]
object GHookCompareFunc: 
  given _tag: Tag[GHookCompareFunc] = Tag.materializeCFuncPtr2[Ptr[GHook], Ptr[GHook], gint]
  inline def apply(inline o: CFuncPtr2[Ptr[GHook], Ptr[GHook], gint]): GHookCompareFunc = o
  extension (v: GHookCompareFunc)
    inline def value: CFuncPtr2[Ptr[GHook], Ptr[GHook], gint] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/ghook.h
*/
opaque type GHookFinalizeFunc = CFuncPtr2[Ptr[GHookList], Ptr[GHook], Unit]
object GHookFinalizeFunc: 
  given _tag: Tag[GHookFinalizeFunc] = Tag.materializeCFuncPtr2[Ptr[GHookList], Ptr[GHook], Unit]
  inline def apply(inline o: CFuncPtr2[Ptr[GHookList], Ptr[GHook], Unit]): GHookFinalizeFunc = o
  extension (v: GHookFinalizeFunc)
    inline def value: CFuncPtr2[Ptr[GHookList], Ptr[GHook], Unit] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/ghook.h
*/
opaque type GHookFindFunc = CFuncPtr2[Ptr[GHook], gpointer, gboolean]
object GHookFindFunc: 
  given _tag: Tag[GHookFindFunc] = Tag.materializeCFuncPtr2[Ptr[GHook], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr2[Ptr[GHook], gpointer, gboolean]): GHookFindFunc = o
  extension (v: GHookFindFunc)
    inline def value: CFuncPtr2[Ptr[GHook], gpointer, gboolean] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/ghook.h
*/
opaque type GHookFunc = CFuncPtr1[gpointer, Unit]
object GHookFunc: 
  given _tag: Tag[GHookFunc] = Tag.materializeCFuncPtr1[gpointer, Unit]
  inline def apply(inline o: CFuncPtr1[gpointer, Unit]): GHookFunc = o
  extension (v: GHookFunc)
    inline def value: CFuncPtr1[gpointer, Unit] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/ghook.h
*/
opaque type GHookMarshaller = CFuncPtr2[Ptr[GHook], gpointer, Unit]
object GHookMarshaller: 
  given _tag: Tag[GHookMarshaller] = Tag.materializeCFuncPtr2[Ptr[GHook], gpointer, Unit]
  inline def apply(inline o: CFuncPtr2[Ptr[GHook], gpointer, Unit]): GHookMarshaller = o
  extension (v: GHookMarshaller)
    inline def value: CFuncPtr2[Ptr[GHook], gpointer, Unit] = v

/**
 * GIConv: (skip)

 * [bindgen] header: /usr/include/glib-2.0/glib/gconvert.h
*/
opaque type GIConv = Ptr[_GIConv]
object GIConv: 
  given _tag: Tag[GIConv] = Tag.Ptr[_GIConv](_GIConv._tag)
  inline def apply(inline o: Ptr[_GIConv]): GIConv = o
  extension (v: GIConv)
    inline def value: Ptr[_GIConv] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GIOChannel_autoptr = Ptr[GIOChannel]
object GIOChannel_autoptr: 
  given _tag: Tag[GIOChannel_autoptr] = Tag.Ptr[GIOChannel](GIOChannel._tag)
  inline def apply(inline o: Ptr[GIOChannel]): GIOChannel_autoptr = o
  extension (v: GIOChannel_autoptr)
    inline def value: Ptr[GIOChannel] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GIOChannel_listautoptr = Ptr[GList]
object GIOChannel_listautoptr: 
  given _tag: Tag[GIOChannel_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GIOChannel_listautoptr = o
  extension (v: GIOChannel_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GIOChannel_queueautoptr = Ptr[GQueue]
object GIOChannel_queueautoptr: 
  given _tag: Tag[GIOChannel_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GIOChannel_queueautoptr = o
  extension (v: GIOChannel_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GIOChannel_slistautoptr = Ptr[GSList]
object GIOChannel_slistautoptr: 
  given _tag: Tag[GIOChannel_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GIOChannel_slistautoptr = o
  extension (v: GIOChannel_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/giochannel.h
*/
opaque type GIOFunc = CFuncPtr3[Ptr[GIOChannel], GIOCondition, gpointer, gboolean]
object GIOFunc: 
  given _tag: Tag[GIOFunc] = Tag.materializeCFuncPtr3[Ptr[GIOChannel], GIOCondition, gpointer, gboolean]
  inline def apply(inline o: CFuncPtr3[Ptr[GIOChannel], GIOCondition, gpointer, gboolean]): GIOFunc = o
  extension (v: GIOFunc)
    inline def value: CFuncPtr3[Ptr[GIOChannel], GIOCondition, gpointer, gboolean] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GKeyFile_autoptr = Ptr[GKeyFile]
object GKeyFile_autoptr: 
  given _tag: Tag[GKeyFile_autoptr] = Tag.Ptr[GKeyFile](GKeyFile._tag)
  inline def apply(inline o: Ptr[GKeyFile]): GKeyFile_autoptr = o
  extension (v: GKeyFile_autoptr)
    inline def value: Ptr[GKeyFile] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GKeyFile_listautoptr = Ptr[GList]
object GKeyFile_listautoptr: 
  given _tag: Tag[GKeyFile_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GKeyFile_listautoptr = o
  extension (v: GKeyFile_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GKeyFile_queueautoptr = Ptr[GQueue]
object GKeyFile_queueautoptr: 
  given _tag: Tag[GKeyFile_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GKeyFile_queueautoptr = o
  extension (v: GKeyFile_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GKeyFile_slistautoptr = Ptr[GSList]
object GKeyFile_slistautoptr: 
  given _tag: Tag[GKeyFile_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GKeyFile_slistautoptr = o
  extension (v: GKeyFile_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GList_autoptr = Ptr[GList]
object GList_autoptr: 
  given _tag: Tag[GList_autoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GList_autoptr = o
  extension (v: GList_autoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GList_listautoptr = Ptr[GList]
object GList_listautoptr: 
  given _tag: Tag[GList_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GList_listautoptr = o
  extension (v: GList_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GList_queueautoptr = Ptr[GQueue]
object GList_queueautoptr: 
  given _tag: Tag[GList_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GList_queueautoptr = o
  extension (v: GList_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GList_slistautoptr = Ptr[GSList]
object GList_slistautoptr: 
  given _tag: Tag[GList_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GList_slistautoptr = o
  extension (v: GList_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gmessages.h
*/
opaque type GLogFunc = CFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, Unit]
object GLogFunc: 
  given _tag: Tag[GLogFunc] = Tag.materializeCFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, Unit]
  inline def apply(inline o: CFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, Unit]): GLogFunc = o
  extension (v: GLogFunc)
    inline def value: CFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, Unit] = v

/**
 * GLogWriterFunc: _level: log level of the message : (array length=n_fields): fields forming the message _fields: number of _data: user data passed to g_log_set_writer_func()

 * [bindgen] header: /usr/include/glib-2.0/glib/gmessages.h
*/
opaque type GLogWriterFunc = CFuncPtr4[GLogLevelFlags, Ptr[GLogField], gsize, gpointer, GLogWriterOutput]
object GLogWriterFunc: 
  given _tag: Tag[GLogWriterFunc] = Tag.materializeCFuncPtr4[GLogLevelFlags, Ptr[GLogField], gsize, gpointer, GLogWriterOutput]
  inline def apply(inline o: CFuncPtr4[GLogLevelFlags, Ptr[GLogField], gsize, gpointer, GLogWriterOutput]): GLogWriterFunc = o
  extension (v: GLogWriterFunc)
    inline def value: CFuncPtr4[GLogLevelFlags, Ptr[GLogField], gsize, gpointer, GLogWriterOutput] = v

/**
 * GMainContextPusher:

 * [bindgen] header: /usr/include/glib-2.0/glib/gmain.h
*/
type GMainContextPusher = Unit
object GMainContextPusher: 
  given _tag: Tag[GMainContextPusher] = Tag.Unit
  inline def apply(inline o: Unit): GMainContextPusher = o
  extension (v: GMainContextPusher)
    inline def value: Unit = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GMainContextPusher_autoptr = Ptr[GMainContextPusher]
object GMainContextPusher_autoptr: 
  given _tag: Tag[GMainContextPusher_autoptr] = Tag.Ptr[GMainContextPusher](GMainContextPusher._tag)
  inline def apply(inline o: Ptr[GMainContextPusher]): GMainContextPusher_autoptr = o
  extension (v: GMainContextPusher_autoptr)
    inline def value: Ptr[GMainContextPusher] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GMainContextPusher_listautoptr = Ptr[GList]
object GMainContextPusher_listautoptr: 
  given _tag: Tag[GMainContextPusher_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GMainContextPusher_listautoptr = o
  extension (v: GMainContextPusher_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GMainContextPusher_queueautoptr = Ptr[GQueue]
object GMainContextPusher_queueautoptr: 
  given _tag: Tag[GMainContextPusher_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GMainContextPusher_queueautoptr = o
  extension (v: GMainContextPusher_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GMainContextPusher_slistautoptr = Ptr[GSList]
object GMainContextPusher_slistautoptr: 
  given _tag: Tag[GMainContextPusher_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GMainContextPusher_slistautoptr = o
  extension (v: GMainContextPusher_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GMainContext_autoptr = Ptr[GMainContext]
object GMainContext_autoptr: 
  given _tag: Tag[GMainContext_autoptr] = Tag.Ptr[GMainContext](GMainContext._tag)
  inline def apply(inline o: Ptr[GMainContext]): GMainContext_autoptr = o
  extension (v: GMainContext_autoptr)
    inline def value: Ptr[GMainContext] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GMainContext_listautoptr = Ptr[GList]
object GMainContext_listautoptr: 
  given _tag: Tag[GMainContext_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GMainContext_listautoptr = o
  extension (v: GMainContext_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GMainContext_queueautoptr = Ptr[GQueue]
object GMainContext_queueautoptr: 
  given _tag: Tag[GMainContext_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GMainContext_queueautoptr = o
  extension (v: GMainContext_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GMainContext_slistautoptr = Ptr[GSList]
object GMainContext_slistautoptr: 
  given _tag: Tag[GMainContext_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GMainContext_slistautoptr = o
  extension (v: GMainContext_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GMainLoop_autoptr = Ptr[GMainLoop]
object GMainLoop_autoptr: 
  given _tag: Tag[GMainLoop_autoptr] = Tag.Ptr[GMainLoop](GMainLoop._tag)
  inline def apply(inline o: Ptr[GMainLoop]): GMainLoop_autoptr = o
  extension (v: GMainLoop_autoptr)
    inline def value: Ptr[GMainLoop] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GMainLoop_listautoptr = Ptr[GList]
object GMainLoop_listautoptr: 
  given _tag: Tag[GMainLoop_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GMainLoop_listautoptr = o
  extension (v: GMainLoop_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GMainLoop_queueautoptr = Ptr[GQueue]
object GMainLoop_queueautoptr: 
  given _tag: Tag[GMainLoop_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GMainLoop_queueautoptr = o
  extension (v: GMainLoop_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GMainLoop_slistautoptr = Ptr[GSList]
object GMainLoop_slistautoptr: 
  given _tag: Tag[GMainLoop_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GMainLoop_slistautoptr = o
  extension (v: GMainLoop_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GMappedFile_autoptr = Ptr[GMappedFile]
object GMappedFile_autoptr: 
  given _tag: Tag[GMappedFile_autoptr] = Tag.Ptr[GMappedFile](GMappedFile._tag)
  inline def apply(inline o: Ptr[GMappedFile]): GMappedFile_autoptr = o
  extension (v: GMappedFile_autoptr)
    inline def value: Ptr[GMappedFile] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GMappedFile_listautoptr = Ptr[GList]
object GMappedFile_listautoptr: 
  given _tag: Tag[GMappedFile_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GMappedFile_listautoptr = o
  extension (v: GMappedFile_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GMappedFile_queueautoptr = Ptr[GQueue]
object GMappedFile_queueautoptr: 
  given _tag: Tag[GMappedFile_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GMappedFile_queueautoptr = o
  extension (v: GMappedFile_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GMappedFile_slistautoptr = Ptr[GSList]
object GMappedFile_slistautoptr: 
  given _tag: Tag[GMappedFile_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GMappedFile_slistautoptr = o
  extension (v: GMappedFile_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GMarkupParseContext_autoptr = Ptr[GMarkupParseContext]
object GMarkupParseContext_autoptr: 
  given _tag: Tag[GMarkupParseContext_autoptr] = Tag.Ptr[GMarkupParseContext](GMarkupParseContext._tag)
  inline def apply(inline o: Ptr[GMarkupParseContext]): GMarkupParseContext_autoptr = o
  extension (v: GMarkupParseContext_autoptr)
    inline def value: Ptr[GMarkupParseContext] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GMarkupParseContext_listautoptr = Ptr[GList]
object GMarkupParseContext_listautoptr: 
  given _tag: Tag[GMarkupParseContext_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GMarkupParseContext_listautoptr = o
  extension (v: GMarkupParseContext_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GMarkupParseContext_queueautoptr = Ptr[GQueue]
object GMarkupParseContext_queueautoptr: 
  given _tag: Tag[GMarkupParseContext_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GMarkupParseContext_queueautoptr = o
  extension (v: GMarkupParseContext_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GMarkupParseContext_slistautoptr = Ptr[GSList]
object GMarkupParseContext_slistautoptr: 
  given _tag: Tag[GMarkupParseContext_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GMarkupParseContext_slistautoptr = o
  extension (v: GMarkupParseContext_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GMatchInfo_autoptr = Ptr[GMatchInfo]
object GMatchInfo_autoptr: 
  given _tag: Tag[GMatchInfo_autoptr] = Tag.Ptr[GMatchInfo](GMatchInfo._tag)
  inline def apply(inline o: Ptr[GMatchInfo]): GMatchInfo_autoptr = o
  extension (v: GMatchInfo_autoptr)
    inline def value: Ptr[GMatchInfo] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GMatchInfo_listautoptr = Ptr[GList]
object GMatchInfo_listautoptr: 
  given _tag: Tag[GMatchInfo_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GMatchInfo_listautoptr = o
  extension (v: GMatchInfo_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GMatchInfo_queueautoptr = Ptr[GQueue]
object GMatchInfo_queueautoptr: 
  given _tag: Tag[GMatchInfo_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GMatchInfo_queueautoptr = o
  extension (v: GMatchInfo_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GMatchInfo_slistautoptr = Ptr[GSList]
object GMatchInfo_slistautoptr: 
  given _tag: Tag[GMatchInfo_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GMatchInfo_slistautoptr = o
  extension (v: GMatchInfo_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * GMutexLocker:

 * [bindgen] header: /usr/include/glib-2.0/glib/gthread.h
*/
type GMutexLocker = Unit
object GMutexLocker: 
  given _tag: Tag[GMutexLocker] = Tag.Unit
  inline def apply(inline o: Unit): GMutexLocker = o
  extension (v: GMutexLocker)
    inline def value: Unit = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GMutexLocker_autoptr = Ptr[GMutexLocker]
object GMutexLocker_autoptr: 
  given _tag: Tag[GMutexLocker_autoptr] = Tag.Ptr[GMutexLocker](GMutexLocker._tag)
  inline def apply(inline o: Ptr[GMutexLocker]): GMutexLocker_autoptr = o
  extension (v: GMutexLocker_autoptr)
    inline def value: Ptr[GMutexLocker] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GMutexLocker_listautoptr = Ptr[GList]
object GMutexLocker_listautoptr: 
  given _tag: Tag[GMutexLocker_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GMutexLocker_listautoptr = o
  extension (v: GMutexLocker_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GMutexLocker_queueautoptr = Ptr[GQueue]
object GMutexLocker_queueautoptr: 
  given _tag: Tag[GMutexLocker_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GMutexLocker_queueautoptr = o
  extension (v: GMutexLocker_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GMutexLocker_slistautoptr = Ptr[GSList]
object GMutexLocker_slistautoptr: 
  given _tag: Tag[GMutexLocker_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GMutexLocker_slistautoptr = o
  extension (v: GMutexLocker_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gnode.h
*/
opaque type GNodeForeachFunc = CFuncPtr2[Ptr[GNode], gpointer, Unit]
object GNodeForeachFunc: 
  given _tag: Tag[GNodeForeachFunc] = Tag.materializeCFuncPtr2[Ptr[GNode], gpointer, Unit]
  inline def apply(inline o: CFuncPtr2[Ptr[GNode], gpointer, Unit]): GNodeForeachFunc = o
  extension (v: GNodeForeachFunc)
    inline def value: CFuncPtr2[Ptr[GNode], gpointer, Unit] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gnode.h
*/
opaque type GNodeTraverseFunc = CFuncPtr2[Ptr[GNode], gpointer, gboolean]
object GNodeTraverseFunc: 
  given _tag: Tag[GNodeTraverseFunc] = Tag.materializeCFuncPtr2[Ptr[GNode], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr2[Ptr[GNode], gpointer, gboolean]): GNodeTraverseFunc = o
  extension (v: GNodeTraverseFunc)
    inline def value: CFuncPtr2[Ptr[GNode], gpointer, gboolean] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GNode_autoptr = Ptr[GNode]
object GNode_autoptr: 
  given _tag: Tag[GNode_autoptr] = Tag.Ptr[GNode](GNode._tag)
  inline def apply(inline o: Ptr[GNode]): GNode_autoptr = o
  extension (v: GNode_autoptr)
    inline def value: Ptr[GNode] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GNode_listautoptr = Ptr[GList]
object GNode_listautoptr: 
  given _tag: Tag[GNode_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GNode_listautoptr = o
  extension (v: GNode_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GNode_queueautoptr = Ptr[GQueue]
object GNode_queueautoptr: 
  given _tag: Tag[GNode_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GNode_queueautoptr = o
  extension (v: GNode_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GNode_slistautoptr = Ptr[GSList]
object GNode_slistautoptr: 
  given _tag: Tag[GNode_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GNode_slistautoptr = o
  extension (v: GNode_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * GOptionArgFunc: _name: The name of the option being parsed. This will be either a single dash followed by a single letter (for a short name) or two dashes followed by a long option name. : The value to be parsed.

 * [bindgen] header: /usr/include/glib-2.0/glib/goption.h
*/
opaque type GOptionArgFunc = CFuncPtr4[Ptr[gchar], Ptr[gchar], gpointer, Ptr[Ptr[GError]], gboolean]
object GOptionArgFunc: 
  given _tag: Tag[GOptionArgFunc] = Tag.materializeCFuncPtr4[Ptr[gchar], Ptr[gchar], gpointer, Ptr[Ptr[GError]], gboolean]
  inline def apply(inline o: CFuncPtr4[Ptr[gchar], Ptr[gchar], gpointer, Ptr[Ptr[GError]], gboolean]): GOptionArgFunc = o
  extension (v: GOptionArgFunc)
    inline def value: CFuncPtr4[Ptr[gchar], Ptr[gchar], gpointer, Ptr[Ptr[GError]], gboolean] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GOptionContext_autoptr = Ptr[GOptionContext]
object GOptionContext_autoptr: 
  given _tag: Tag[GOptionContext_autoptr] = Tag.Ptr[GOptionContext](GOptionContext._tag)
  inline def apply(inline o: Ptr[GOptionContext]): GOptionContext_autoptr = o
  extension (v: GOptionContext_autoptr)
    inline def value: Ptr[GOptionContext] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GOptionContext_listautoptr = Ptr[GList]
object GOptionContext_listautoptr: 
  given _tag: Tag[GOptionContext_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GOptionContext_listautoptr = o
  extension (v: GOptionContext_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GOptionContext_queueautoptr = Ptr[GQueue]
object GOptionContext_queueautoptr: 
  given _tag: Tag[GOptionContext_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GOptionContext_queueautoptr = o
  extension (v: GOptionContext_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GOptionContext_slistautoptr = Ptr[GSList]
object GOptionContext_slistautoptr: 
  given _tag: Tag[GOptionContext_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GOptionContext_slistautoptr = o
  extension (v: GOptionContext_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * GOptionErrorFunc: : The active #GOptionContext : The group to which the function belongs

 * [bindgen] header: /usr/include/glib-2.0/glib/goption.h
*/
opaque type GOptionErrorFunc = CFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], Unit]
object GOptionErrorFunc: 
  given _tag: Tag[GOptionErrorFunc] = Tag.materializeCFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], Unit]
  inline def apply(inline o: CFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], Unit]): GOptionErrorFunc = o
  extension (v: GOptionErrorFunc)
    inline def value: CFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], Unit] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GOptionGroup_autoptr = Ptr[GOptionGroup]
object GOptionGroup_autoptr: 
  given _tag: Tag[GOptionGroup_autoptr] = Tag.Ptr[GOptionGroup](GOptionGroup._tag)
  inline def apply(inline o: Ptr[GOptionGroup]): GOptionGroup_autoptr = o
  extension (v: GOptionGroup_autoptr)
    inline def value: Ptr[GOptionGroup] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GOptionGroup_listautoptr = Ptr[GList]
object GOptionGroup_listautoptr: 
  given _tag: Tag[GOptionGroup_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GOptionGroup_listautoptr = o
  extension (v: GOptionGroup_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GOptionGroup_queueautoptr = Ptr[GQueue]
object GOptionGroup_queueautoptr: 
  given _tag: Tag[GOptionGroup_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GOptionGroup_queueautoptr = o
  extension (v: GOptionGroup_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GOptionGroup_slistautoptr = Ptr[GSList]
object GOptionGroup_slistautoptr: 
  given _tag: Tag[GOptionGroup_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GOptionGroup_slistautoptr = o
  extension (v: GOptionGroup_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * GOptionParseFunc: : The active #GOptionContext : The group to which the function belongs

 * [bindgen] header: /usr/include/glib-2.0/glib/goption.h
*/
opaque type GOptionParseFunc = CFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], gboolean]
object GOptionParseFunc: 
  given _tag: Tag[GOptionParseFunc] = Tag.materializeCFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], gboolean]
  inline def apply(inline o: CFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], gboolean]): GOptionParseFunc = o
  extension (v: GOptionParseFunc)
    inline def value: CFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], gboolean] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GPatternSpec_autoptr = Ptr[GPatternSpec]
object GPatternSpec_autoptr: 
  given _tag: Tag[GPatternSpec_autoptr] = Tag.Ptr[GPatternSpec](GPatternSpec._tag)
  inline def apply(inline o: Ptr[GPatternSpec]): GPatternSpec_autoptr = o
  extension (v: GPatternSpec_autoptr)
    inline def value: Ptr[GPatternSpec] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GPatternSpec_listautoptr = Ptr[GList]
object GPatternSpec_listautoptr: 
  given _tag: Tag[GPatternSpec_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GPatternSpec_listautoptr = o
  extension (v: GPatternSpec_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GPatternSpec_queueautoptr = Ptr[GQueue]
object GPatternSpec_queueautoptr: 
  given _tag: Tag[GPatternSpec_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GPatternSpec_queueautoptr = o
  extension (v: GPatternSpec_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GPatternSpec_slistautoptr = Ptr[GSList]
object GPatternSpec_slistautoptr: 
  given _tag: Tag[GPatternSpec_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GPatternSpec_slistautoptr = o
  extension (v: GPatternSpec_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/glib-2.0/include/glibconfig.h
*/
opaque type GPid = CInt
object GPid: 
  given _tag: Tag[GPid] = Tag.Int
  inline def apply(inline o: CInt): GPid = o
  extension (v: GPid)
    inline def value: CInt = v

/**
 * GPollFunc: : an array of #GPollFD elements : the number of elements in _: the maximum time to wait for an event of the file descriptors. A negative value indicates an infinite timeout.

 * [bindgen] header: /usr/include/glib-2.0/glib/gpoll.h
*/
opaque type GPollFunc = CFuncPtr3[Ptr[GPollFD], guint, gint, gint]
object GPollFunc: 
  given _tag: Tag[GPollFunc] = Tag.materializeCFuncPtr3[Ptr[GPollFD], guint, gint, gint]
  inline def apply(inline o: CFuncPtr3[Ptr[GPollFD], guint, gint, gint]): GPollFunc = o
  extension (v: GPollFunc)
    inline def value: CFuncPtr3[Ptr[GPollFD], guint, gint, gint] = v

/**
 * GPrintFunc: : the message to output

 * [bindgen] header: /usr/include/glib-2.0/glib/gmessages.h
*/
opaque type GPrintFunc = CFuncPtr1[Ptr[gchar], Unit]
object GPrintFunc: 
  given _tag: Tag[GPrintFunc] = Tag.materializeCFuncPtr1[Ptr[gchar], Unit]
  inline def apply(inline o: CFuncPtr1[Ptr[gchar], Unit]): GPrintFunc = o
  extension (v: GPrintFunc)
    inline def value: CFuncPtr1[Ptr[gchar], Unit] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GPtrArray_autoptr = Ptr[GPtrArray]
object GPtrArray_autoptr: 
  given _tag: Tag[GPtrArray_autoptr] = Tag.Ptr[GPtrArray](GPtrArray._tag)
  inline def apply(inline o: Ptr[GPtrArray]): GPtrArray_autoptr = o
  extension (v: GPtrArray_autoptr)
    inline def value: Ptr[GPtrArray] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GPtrArray_listautoptr = Ptr[GList]
object GPtrArray_listautoptr: 
  given _tag: Tag[GPtrArray_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GPtrArray_listautoptr = o
  extension (v: GPtrArray_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GPtrArray_queueautoptr = Ptr[GQueue]
object GPtrArray_queueautoptr: 
  given _tag: Tag[GPtrArray_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GPtrArray_queueautoptr = o
  extension (v: GPtrArray_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GPtrArray_slistautoptr = Ptr[GSList]
object GPtrArray_slistautoptr: 
  given _tag: Tag[GPtrArray_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GPtrArray_slistautoptr = o
  extension (v: GPtrArray_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gquark.h
*/
type GQuark = guint32
object GQuark: 
  given _tag: Tag[GQuark] = guint32._tag
  inline def apply(inline o: guint32): GQuark = o
  extension (v: GQuark)
    inline def value: guint32 = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GQueue_autoptr = Ptr[GQueue]
object GQueue_autoptr: 
  given _tag: Tag[GQueue_autoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GQueue_autoptr = o
  extension (v: GQueue_autoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GQueue_listautoptr = Ptr[GList]
object GQueue_listautoptr: 
  given _tag: Tag[GQueue_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GQueue_listautoptr = o
  extension (v: GQueue_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GQueue_queueautoptr = Ptr[GQueue]
object GQueue_queueautoptr: 
  given _tag: Tag[GQueue_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GQueue_queueautoptr = o
  extension (v: GQueue_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GQueue_slistautoptr = Ptr[GSList]
object GQueue_slistautoptr: 
  given _tag: Tag[GQueue_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GQueue_slistautoptr = o
  extension (v: GQueue_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * GRWLockReaderLocker:

 * [bindgen] header: /usr/include/glib-2.0/glib/gthread.h
*/
type GRWLockReaderLocker = Unit
object GRWLockReaderLocker: 
  given _tag: Tag[GRWLockReaderLocker] = Tag.Unit
  inline def apply(inline o: Unit): GRWLockReaderLocker = o
  extension (v: GRWLockReaderLocker)
    inline def value: Unit = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GRWLockReaderLocker_autoptr = Ptr[GRWLockReaderLocker]
object GRWLockReaderLocker_autoptr: 
  given _tag: Tag[GRWLockReaderLocker_autoptr] = Tag.Ptr[GRWLockReaderLocker](GRWLockReaderLocker._tag)
  inline def apply(inline o: Ptr[GRWLockReaderLocker]): GRWLockReaderLocker_autoptr = o
  extension (v: GRWLockReaderLocker_autoptr)
    inline def value: Ptr[GRWLockReaderLocker] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GRWLockReaderLocker_listautoptr = Ptr[GList]
object GRWLockReaderLocker_listautoptr: 
  given _tag: Tag[GRWLockReaderLocker_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GRWLockReaderLocker_listautoptr = o
  extension (v: GRWLockReaderLocker_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GRWLockReaderLocker_queueautoptr = Ptr[GQueue]
object GRWLockReaderLocker_queueautoptr: 
  given _tag: Tag[GRWLockReaderLocker_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GRWLockReaderLocker_queueautoptr = o
  extension (v: GRWLockReaderLocker_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GRWLockReaderLocker_slistautoptr = Ptr[GSList]
object GRWLockReaderLocker_slistautoptr: 
  given _tag: Tag[GRWLockReaderLocker_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GRWLockReaderLocker_slistautoptr = o
  extension (v: GRWLockReaderLocker_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * GRWLockWriterLocker:

 * [bindgen] header: /usr/include/glib-2.0/glib/gthread.h
*/
type GRWLockWriterLocker = Unit
object GRWLockWriterLocker: 
  given _tag: Tag[GRWLockWriterLocker] = Tag.Unit
  inline def apply(inline o: Unit): GRWLockWriterLocker = o
  extension (v: GRWLockWriterLocker)
    inline def value: Unit = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GRWLockWriterLocker_autoptr = Ptr[GRWLockWriterLocker]
object GRWLockWriterLocker_autoptr: 
  given _tag: Tag[GRWLockWriterLocker_autoptr] = Tag.Ptr[GRWLockWriterLocker](GRWLockWriterLocker._tag)
  inline def apply(inline o: Ptr[GRWLockWriterLocker]): GRWLockWriterLocker_autoptr = o
  extension (v: GRWLockWriterLocker_autoptr)
    inline def value: Ptr[GRWLockWriterLocker] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GRWLockWriterLocker_listautoptr = Ptr[GList]
object GRWLockWriterLocker_listautoptr: 
  given _tag: Tag[GRWLockWriterLocker_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GRWLockWriterLocker_listautoptr = o
  extension (v: GRWLockWriterLocker_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GRWLockWriterLocker_queueautoptr = Ptr[GQueue]
object GRWLockWriterLocker_queueautoptr: 
  given _tag: Tag[GRWLockWriterLocker_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GRWLockWriterLocker_queueautoptr = o
  extension (v: GRWLockWriterLocker_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GRWLockWriterLocker_slistautoptr = Ptr[GSList]
object GRWLockWriterLocker_slistautoptr: 
  given _tag: Tag[GRWLockWriterLocker_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GRWLockWriterLocker_slistautoptr = o
  extension (v: GRWLockWriterLocker_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GRand_autoptr = Ptr[GRand]
object GRand_autoptr: 
  given _tag: Tag[GRand_autoptr] = Tag.Ptr[GRand](GRand._tag)
  inline def apply(inline o: Ptr[GRand]): GRand_autoptr = o
  extension (v: GRand_autoptr)
    inline def value: Ptr[GRand] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GRand_listautoptr = Ptr[GList]
object GRand_listautoptr: 
  given _tag: Tag[GRand_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GRand_listautoptr = o
  extension (v: GRand_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GRand_queueautoptr = Ptr[GQueue]
object GRand_queueautoptr: 
  given _tag: Tag[GRand_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GRand_queueautoptr = o
  extension (v: GRand_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GRand_slistautoptr = Ptr[GSList]
object GRand_slistautoptr: 
  given _tag: Tag[GRand_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GRand_slistautoptr = o
  extension (v: GRand_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * GRecMutexLocker:

 * [bindgen] header: /usr/include/glib-2.0/glib/gthread.h
*/
type GRecMutexLocker = Unit
object GRecMutexLocker: 
  given _tag: Tag[GRecMutexLocker] = Tag.Unit
  inline def apply(inline o: Unit): GRecMutexLocker = o
  extension (v: GRecMutexLocker)
    inline def value: Unit = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GRecMutexLocker_autoptr = Ptr[GRecMutexLocker]
object GRecMutexLocker_autoptr: 
  given _tag: Tag[GRecMutexLocker_autoptr] = Tag.Ptr[GRecMutexLocker](GRecMutexLocker._tag)
  inline def apply(inline o: Ptr[GRecMutexLocker]): GRecMutexLocker_autoptr = o
  extension (v: GRecMutexLocker_autoptr)
    inline def value: Ptr[GRecMutexLocker] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GRecMutexLocker_listautoptr = Ptr[GList]
object GRecMutexLocker_listautoptr: 
  given _tag: Tag[GRecMutexLocker_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GRecMutexLocker_listautoptr = o
  extension (v: GRecMutexLocker_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GRecMutexLocker_queueautoptr = Ptr[GQueue]
object GRecMutexLocker_queueautoptr: 
  given _tag: Tag[GRecMutexLocker_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GRecMutexLocker_queueautoptr = o
  extension (v: GRecMutexLocker_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GRecMutexLocker_slistautoptr = Ptr[GSList]
object GRecMutexLocker_slistautoptr: 
  given _tag: Tag[GRecMutexLocker_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GRecMutexLocker_slistautoptr = o
  extension (v: GRecMutexLocker_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * GRefString:

 * [bindgen] header: /usr/include/glib-2.0/glib/grefstring.h
*/
opaque type GRefString = CChar
object GRefString: 
  given _tag: Tag[GRefString] = Tag.Byte
  inline def apply(inline o: CChar): GRefString = o
  extension (v: GRefString)
    inline def value: CChar = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GRefString_autoptr = Ptr[GRefString]
object GRefString_autoptr: 
  given _tag: Tag[GRefString_autoptr] = Tag.Ptr[GRefString](GRefString._tag)
  inline def apply(inline o: Ptr[GRefString]): GRefString_autoptr = o
  extension (v: GRefString_autoptr)
    inline def value: Ptr[GRefString] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GRefString_listautoptr = Ptr[GList]
object GRefString_listautoptr: 
  given _tag: Tag[GRefString_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GRefString_listautoptr = o
  extension (v: GRefString_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GRefString_queueautoptr = Ptr[GQueue]
object GRefString_queueautoptr: 
  given _tag: Tag[GRefString_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GRefString_queueautoptr = o
  extension (v: GRefString_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GRefString_slistautoptr = Ptr[GSList]
object GRefString_slistautoptr: 
  given _tag: Tag[GRefString_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GRefString_slistautoptr = o
  extension (v: GRefString_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * GRegexEvalCallback: _info: the #GMatchInfo generated by the match. Use g_match_info_get_regex() and g_match_info_get_string() if you need the #GRegex or the matched string.

 * [bindgen] header: /usr/include/glib-2.0/glib/gregex.h
*/
opaque type GRegexEvalCallback = CFuncPtr3[Ptr[GMatchInfo], Ptr[GString], gpointer, gboolean]
object GRegexEvalCallback: 
  given _tag: Tag[GRegexEvalCallback] = Tag.materializeCFuncPtr3[Ptr[GMatchInfo], Ptr[GString], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr3[Ptr[GMatchInfo], Ptr[GString], gpointer, gboolean]): GRegexEvalCallback = o
  extension (v: GRegexEvalCallback)
    inline def value: CFuncPtr3[Ptr[GMatchInfo], Ptr[GString], gpointer, gboolean] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GRegex_autoptr = Ptr[GRegex]
object GRegex_autoptr: 
  given _tag: Tag[GRegex_autoptr] = Tag.Ptr[GRegex](GRegex._tag)
  inline def apply(inline o: Ptr[GRegex]): GRegex_autoptr = o
  extension (v: GRegex_autoptr)
    inline def value: Ptr[GRegex] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GRegex_listautoptr = Ptr[GList]
object GRegex_listautoptr: 
  given _tag: Tag[GRegex_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GRegex_listautoptr = o
  extension (v: GRegex_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GRegex_queueautoptr = Ptr[GQueue]
object GRegex_queueautoptr: 
  given _tag: Tag[GRegex_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GRegex_queueautoptr = o
  extension (v: GRegex_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GRegex_slistautoptr = Ptr[GSList]
object GRegex_slistautoptr: 
  given _tag: Tag[GRegex_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GRegex_slistautoptr = o
  extension (v: GRegex_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GSList_autoptr = Ptr[GSList]
object GSList_autoptr: 
  given _tag: Tag[GSList_autoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSList_autoptr = o
  extension (v: GSList_autoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GSList_listautoptr = Ptr[GList]
object GSList_listautoptr: 
  given _tag: Tag[GSList_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GSList_listautoptr = o
  extension (v: GSList_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GSList_queueautoptr = Ptr[GQueue]
object GSList_queueautoptr: 
  given _tag: Tag[GSList_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GSList_queueautoptr = o
  extension (v: GSList_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GSList_slistautoptr = Ptr[GSList]
object GSList_slistautoptr: 
  given _tag: Tag[GSList_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSList_slistautoptr = o
  extension (v: GSList_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gscanner.h
*/
opaque type GScannerMsgFunc = CFuncPtr3[Ptr[GScanner], Ptr[gchar], gboolean, Unit]
object GScannerMsgFunc: 
  given _tag: Tag[GScannerMsgFunc] = Tag.materializeCFuncPtr3[Ptr[GScanner], Ptr[gchar], gboolean, Unit]
  inline def apply(inline o: CFuncPtr3[Ptr[GScanner], Ptr[gchar], gboolean, Unit]): GScannerMsgFunc = o
  extension (v: GScannerMsgFunc)
    inline def value: CFuncPtr3[Ptr[GScanner], Ptr[gchar], gboolean, Unit] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GScanner_autoptr = Ptr[GScanner]
object GScanner_autoptr: 
  given _tag: Tag[GScanner_autoptr] = Tag.Ptr[GScanner](GScanner._tag)
  inline def apply(inline o: Ptr[GScanner]): GScanner_autoptr = o
  extension (v: GScanner_autoptr)
    inline def value: Ptr[GScanner] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GScanner_listautoptr = Ptr[GList]
object GScanner_listautoptr: 
  given _tag: Tag[GScanner_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GScanner_listautoptr = o
  extension (v: GScanner_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GScanner_queueautoptr = Ptr[GQueue]
object GScanner_queueautoptr: 
  given _tag: Tag[GScanner_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GScanner_queueautoptr = o
  extension (v: GScanner_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GScanner_slistautoptr = Ptr[GSList]
object GScanner_slistautoptr: 
  given _tag: Tag[GScanner_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GScanner_slistautoptr = o
  extension (v: GScanner_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gsequence.h
*/
opaque type GSequenceIterCompareFunc = CFuncPtr3[Ptr[GSequenceIter], Ptr[GSequenceIter], gpointer, gint]
object GSequenceIterCompareFunc: 
  given _tag: Tag[GSequenceIterCompareFunc] = Tag.materializeCFuncPtr3[Ptr[GSequenceIter], Ptr[GSequenceIter], gpointer, gint]
  inline def apply(inline o: CFuncPtr3[Ptr[GSequenceIter], Ptr[GSequenceIter], gpointer, gint]): GSequenceIterCompareFunc = o
  extension (v: GSequenceIterCompareFunc)
    inline def value: CFuncPtr3[Ptr[GSequenceIter], Ptr[GSequenceIter], gpointer, gint] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GSequence_autoptr = Ptr[GSequence]
object GSequence_autoptr: 
  given _tag: Tag[GSequence_autoptr] = Tag.Ptr[GSequence](GSequence._tag)
  inline def apply(inline o: Ptr[GSequence]): GSequence_autoptr = o
  extension (v: GSequence_autoptr)
    inline def value: Ptr[GSequence] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GSequence_listautoptr = Ptr[GList]
object GSequence_listautoptr: 
  given _tag: Tag[GSequence_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GSequence_listautoptr = o
  extension (v: GSequence_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GSequence_queueautoptr = Ptr[GQueue]
object GSequence_queueautoptr: 
  given _tag: Tag[GSequence_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GSequence_queueautoptr = o
  extension (v: GSequence_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GSequence_slistautoptr = Ptr[GSList]
object GSequence_slistautoptr: 
  given _tag: Tag[GSequence_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSequence_slistautoptr = o
  extension (v: GSequence_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * GSourceDisposeFunc: : #GSource that is currently being disposed

 * [bindgen] header: /usr/include/glib-2.0/glib/gmain.h
*/
opaque type GSourceDisposeFunc = CFuncPtr1[Ptr[GSource], Unit]
object GSourceDisposeFunc: 
  given _tag: Tag[GSourceDisposeFunc] = Tag.materializeCFuncPtr1[Ptr[GSource], Unit]
  inline def apply(inline o: CFuncPtr1[Ptr[GSource], Unit]): GSourceDisposeFunc = o
  extension (v: GSourceDisposeFunc)
    inline def value: CFuncPtr1[Ptr[GSource], Unit] = v

/**
 * GSourceDummyMarshal:

 * [bindgen] header: /usr/include/glib-2.0/glib/gmain.h
*/
opaque type GSourceDummyMarshal = CFuncPtr0[Unit]
object GSourceDummyMarshal: 
  given _tag: Tag[GSourceDummyMarshal] = Tag.materializeCFuncPtr0[Unit]
  inline def apply(inline o: CFuncPtr0[Unit]): GSourceDummyMarshal = o
  extension (v: GSourceDummyMarshal)
    inline def value: CFuncPtr0[Unit] = v

/**
 * GSourceFunc: _data: data passed to the function, set when the source was created with one of the above functions

 * [bindgen] header: /usr/include/glib-2.0/glib/gmain.h
*/
opaque type GSourceFunc = CFuncPtr1[gpointer, gboolean]
object GSourceFunc: 
  given _tag: Tag[GSourceFunc] = Tag.materializeCFuncPtr1[gpointer, gboolean]
  inline def apply(inline o: CFuncPtr1[gpointer, gboolean]): GSourceFunc = o
  extension (v: GSourceFunc)
    inline def value: CFuncPtr1[gpointer, gboolean] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GSource_autoptr = Ptr[GSource]
object GSource_autoptr: 
  given _tag: Tag[GSource_autoptr] = Tag.Ptr[GSource](GSource._tag)
  inline def apply(inline o: Ptr[GSource]): GSource_autoptr = o
  extension (v: GSource_autoptr)
    inline def value: Ptr[GSource] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GSource_listautoptr = Ptr[GList]
object GSource_listautoptr: 
  given _tag: Tag[GSource_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GSource_listautoptr = o
  extension (v: GSource_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GSource_queueautoptr = Ptr[GQueue]
object GSource_queueautoptr: 
  given _tag: Tag[GSource_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GSource_queueautoptr = o
  extension (v: GSource_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GSource_slistautoptr = Ptr[GSList]
object GSource_slistautoptr: 
  given _tag: Tag[GSource_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSource_slistautoptr = o
  extension (v: GSource_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * GSpawnChildSetupFunc: _data: (closure): user data to pass to the function.

 * [bindgen] header: /usr/include/glib-2.0/glib/gspawn.h
*/
opaque type GSpawnChildSetupFunc = CFuncPtr1[gpointer, Unit]
object GSpawnChildSetupFunc: 
  given _tag: Tag[GSpawnChildSetupFunc] = Tag.materializeCFuncPtr1[gpointer, Unit]
  inline def apply(inline o: CFuncPtr1[gpointer, Unit]): GSpawnChildSetupFunc = o
  extension (v: GSpawnChildSetupFunc)
    inline def value: CFuncPtr1[gpointer, Unit] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GStringChunk_autoptr = Ptr[GStringChunk]
object GStringChunk_autoptr: 
  given _tag: Tag[GStringChunk_autoptr] = Tag.Ptr[GStringChunk](GStringChunk._tag)
  inline def apply(inline o: Ptr[GStringChunk]): GStringChunk_autoptr = o
  extension (v: GStringChunk_autoptr)
    inline def value: Ptr[GStringChunk] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GStringChunk_listautoptr = Ptr[GList]
object GStringChunk_listautoptr: 
  given _tag: Tag[GStringChunk_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GStringChunk_listautoptr = o
  extension (v: GStringChunk_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GStringChunk_queueautoptr = Ptr[GQueue]
object GStringChunk_queueautoptr: 
  given _tag: Tag[GStringChunk_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GStringChunk_queueautoptr = o
  extension (v: GStringChunk_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GStringChunk_slistautoptr = Ptr[GSList]
object GStringChunk_slistautoptr: 
  given _tag: Tag[GStringChunk_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GStringChunk_slistautoptr = o
  extension (v: GStringChunk_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GString_autoptr = Ptr[GString]
object GString_autoptr: 
  given _tag: Tag[GString_autoptr] = Tag.Ptr[GString](GString._tag)
  inline def apply(inline o: Ptr[GString]): GString_autoptr = o
  extension (v: GString_autoptr)
    inline def value: Ptr[GString] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GString_listautoptr = Ptr[GList]
object GString_listautoptr: 
  given _tag: Tag[GString_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GString_listautoptr = o
  extension (v: GString_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GString_queueautoptr = Ptr[GQueue]
object GString_queueautoptr: 
  given _tag: Tag[GString_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GString_queueautoptr = o
  extension (v: GString_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GString_slistautoptr = Ptr[GSList]
object GString_slistautoptr: 
  given _tag: Tag[GString_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GString_slistautoptr = o
  extension (v: GString_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gstrfuncs.h
*/
opaque type GStrv = Ptr[Ptr[gchar]]
object GStrv: 
  given _tag: Tag[GStrv] = Tag.Ptr[Ptr[gchar]](Tag.Ptr[gchar](gchar._tag))
  inline def apply(inline o: Ptr[Ptr[gchar]]): GStrv = o
  extension (v: GStrv)
    inline def value: Ptr[Ptr[gchar]] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GStrvBuilder_autoptr = Ptr[GStrvBuilder]
object GStrvBuilder_autoptr: 
  given _tag: Tag[GStrvBuilder_autoptr] = Tag.Ptr[GStrvBuilder](GStrvBuilder._tag)
  inline def apply(inline o: Ptr[GStrvBuilder]): GStrvBuilder_autoptr = o
  extension (v: GStrvBuilder_autoptr)
    inline def value: Ptr[GStrvBuilder] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GStrvBuilder_listautoptr = Ptr[GList]
object GStrvBuilder_listautoptr: 
  given _tag: Tag[GStrvBuilder_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GStrvBuilder_listautoptr = o
  extension (v: GStrvBuilder_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GStrvBuilder_queueautoptr = Ptr[GQueue]
object GStrvBuilder_queueautoptr: 
  given _tag: Tag[GStrvBuilder_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GStrvBuilder_queueautoptr = o
  extension (v: GStrvBuilder_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GStrvBuilder_slistautoptr = Ptr[GSList]
object GStrvBuilder_slistautoptr: 
  given _tag: Tag[GStrvBuilder_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GStrvBuilder_slistautoptr = o
  extension (v: GStrvBuilder_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtestutils.h
*/
opaque type GTestDataFunc = CFuncPtr1[gconstpointer, Unit]
object GTestDataFunc: 
  given _tag: Tag[GTestDataFunc] = Tag.materializeCFuncPtr1[gconstpointer, Unit]
  inline def apply(inline o: CFuncPtr1[gconstpointer, Unit]): GTestDataFunc = o
  extension (v: GTestDataFunc)
    inline def value: CFuncPtr1[gconstpointer, Unit] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtestutils.h
*/
opaque type GTestFixtureFunc = CFuncPtr2[gpointer, gconstpointer, Unit]
object GTestFixtureFunc: 
  given _tag: Tag[GTestFixtureFunc] = Tag.materializeCFuncPtr2[gpointer, gconstpointer, Unit]
  inline def apply(inline o: CFuncPtr2[gpointer, gconstpointer, Unit]): GTestFixtureFunc = o
  extension (v: GTestFixtureFunc)
    inline def value: CFuncPtr2[gpointer, gconstpointer, Unit] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtestutils.h
*/
opaque type GTestFunc = CFuncPtr0[Unit]
object GTestFunc: 
  given _tag: Tag[GTestFunc] = Tag.materializeCFuncPtr0[Unit]
  inline def apply(inline o: CFuncPtr0[Unit]): GTestFunc = o
  extension (v: GTestFunc)
    inline def value: CFuncPtr0[Unit] = v

/**
 * GTestLogFatalFunc: _domain: the log domain of the message _level: the log level of the message (including the fatal and recursion flags) : the message to process _data: user data, set in g_test_log_set_fatal_handler()

 * [bindgen] header: /usr/include/glib-2.0/glib/gtestutils.h
*/
opaque type GTestLogFatalFunc = CFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, gboolean]
object GTestLogFatalFunc: 
  given _tag: Tag[GTestLogFatalFunc] = Tag.materializeCFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, gboolean]): GTestLogFatalFunc = o
  extension (v: GTestLogFatalFunc)
    inline def value: CFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, gboolean] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gthread.h
*/
opaque type GThreadFunc = CFuncPtr1[gpointer, gpointer]
object GThreadFunc: 
  given _tag: Tag[GThreadFunc] = Tag.materializeCFuncPtr1[gpointer, gpointer]
  inline def apply(inline o: CFuncPtr1[gpointer, gpointer]): GThreadFunc = o
  extension (v: GThreadFunc)
    inline def value: CFuncPtr1[gpointer, gpointer] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GThread_autoptr = Ptr[GThread]
object GThread_autoptr: 
  given _tag: Tag[GThread_autoptr] = Tag.Ptr[GThread](GThread._tag)
  inline def apply(inline o: Ptr[GThread]): GThread_autoptr = o
  extension (v: GThread_autoptr)
    inline def value: Ptr[GThread] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GThread_listautoptr = Ptr[GList]
object GThread_listautoptr: 
  given _tag: Tag[GThread_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GThread_listautoptr = o
  extension (v: GThread_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GThread_queueautoptr = Ptr[GQueue]
object GThread_queueautoptr: 
  given _tag: Tag[GThread_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GThread_queueautoptr = o
  extension (v: GThread_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GThread_slistautoptr = Ptr[GSList]
object GThread_slistautoptr: 
  given _tag: Tag[GThread_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GThread_slistautoptr = o
  extension (v: GThread_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gdate.h
*/
type GTime = gint32
object GTime: 
  given _tag: Tag[GTime] = gint32._tag
  inline def apply(inline o: gint32): GTime = o
  extension (v: GTime)
    inline def value: gint32 = v

/**
 * GTimeSpan:

 * [bindgen] header: /usr/include/glib-2.0/glib/gdatetime.h
*/
type GTimeSpan = gint64
object GTimeSpan: 
  given _tag: Tag[GTimeSpan] = gint64._tag
  inline def apply(inline o: gint64): GTimeSpan = o
  extension (v: GTimeSpan)
    inline def value: gint64 = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GTimeZone_autoptr = Ptr[GTimeZone]
object GTimeZone_autoptr: 
  given _tag: Tag[GTimeZone_autoptr] = Tag.Ptr[GTimeZone](GTimeZone._tag)
  inline def apply(inline o: Ptr[GTimeZone]): GTimeZone_autoptr = o
  extension (v: GTimeZone_autoptr)
    inline def value: Ptr[GTimeZone] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GTimeZone_listautoptr = Ptr[GList]
object GTimeZone_listautoptr: 
  given _tag: Tag[GTimeZone_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GTimeZone_listautoptr = o
  extension (v: GTimeZone_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GTimeZone_queueautoptr = Ptr[GQueue]
object GTimeZone_queueautoptr: 
  given _tag: Tag[GTimeZone_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GTimeZone_queueautoptr = o
  extension (v: GTimeZone_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GTimeZone_slistautoptr = Ptr[GSList]
object GTimeZone_slistautoptr: 
  given _tag: Tag[GTimeZone_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GTimeZone_slistautoptr = o
  extension (v: GTimeZone_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GTimer_autoptr = Ptr[GTimer]
object GTimer_autoptr: 
  given _tag: Tag[GTimer_autoptr] = Tag.Ptr[GTimer](GTimer._tag)
  inline def apply(inline o: Ptr[GTimer]): GTimer_autoptr = o
  extension (v: GTimer_autoptr)
    inline def value: Ptr[GTimer] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GTimer_listautoptr = Ptr[GList]
object GTimer_listautoptr: 
  given _tag: Tag[GTimer_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GTimer_listautoptr = o
  extension (v: GTimer_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GTimer_queueautoptr = Ptr[GQueue]
object GTimer_queueautoptr: 
  given _tag: Tag[GTimer_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GTimer_queueautoptr = o
  extension (v: GTimer_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GTimer_slistautoptr = Ptr[GSList]
object GTimer_slistautoptr: 
  given _tag: Tag[GTimer_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GTimer_slistautoptr = o
  extension (v: GTimer_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * GTranslateFunc: : the untranslated string

 * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
*/
opaque type GTranslateFunc = CFuncPtr2[Ptr[gchar], gpointer, Ptr[gchar]]
object GTranslateFunc: 
  given _tag: Tag[GTranslateFunc] = Tag.materializeCFuncPtr2[Ptr[gchar], gpointer, Ptr[gchar]]
  inline def apply(inline o: CFuncPtr2[Ptr[gchar], gpointer, Ptr[gchar]]): GTranslateFunc = o
  extension (v: GTranslateFunc)
    inline def value: CFuncPtr2[Ptr[gchar], gpointer, Ptr[gchar]] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtree.h
*/
opaque type GTraverseFunc = CFuncPtr3[gpointer, gpointer, gpointer, gboolean]
object GTraverseFunc: 
  given _tag: Tag[GTraverseFunc] = Tag.materializeCFuncPtr3[gpointer, gpointer, gpointer, gboolean]
  inline def apply(inline o: CFuncPtr3[gpointer, gpointer, gpointer, gboolean]): GTraverseFunc = o
  extension (v: GTraverseFunc)
    inline def value: CFuncPtr3[gpointer, gpointer, gpointer, gboolean] = v

/**
 * GTraverseNodeFunc: : a #GTreeNode

 * [bindgen] header: /usr/include/glib-2.0/glib/gtree.h
*/
opaque type GTraverseNodeFunc = CFuncPtr2[Ptr[GTreeNode], gpointer, gboolean]
object GTraverseNodeFunc: 
  given _tag: Tag[GTraverseNodeFunc] = Tag.materializeCFuncPtr2[Ptr[GTreeNode], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr2[Ptr[GTreeNode], gpointer, gboolean]): GTraverseNodeFunc = o
  extension (v: GTraverseNodeFunc)
    inline def value: CFuncPtr2[Ptr[GTreeNode], gpointer, gboolean] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GTree_autoptr = Ptr[GTree]
object GTree_autoptr: 
  given _tag: Tag[GTree_autoptr] = Tag.Ptr[GTree](GTree._tag)
  inline def apply(inline o: Ptr[GTree]): GTree_autoptr = o
  extension (v: GTree_autoptr)
    inline def value: Ptr[GTree] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GTree_listautoptr = Ptr[GList]
object GTree_listautoptr: 
  given _tag: Tag[GTree_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GTree_listautoptr = o
  extension (v: GTree_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GTree_queueautoptr = Ptr[GQueue]
object GTree_queueautoptr: 
  given _tag: Tag[GTree_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GTree_queueautoptr = o
  extension (v: GTree_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GTree_slistautoptr = Ptr[GSList]
object GTree_slistautoptr: 
  given _tag: Tag[GTree_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GTree_slistautoptr = o
  extension (v: GTree_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GUri_autoptr = Ptr[GUri]
object GUri_autoptr: 
  given _tag: Tag[GUri_autoptr] = Tag.Ptr[GUri](GUri._tag)
  inline def apply(inline o: Ptr[GUri]): GUri_autoptr = o
  extension (v: GUri_autoptr)
    inline def value: Ptr[GUri] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GUri_listautoptr = Ptr[GList]
object GUri_listautoptr: 
  given _tag: Tag[GUri_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GUri_listautoptr = o
  extension (v: GUri_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GUri_queueautoptr = Ptr[GQueue]
object GUri_queueautoptr: 
  given _tag: Tag[GUri_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GUri_queueautoptr = o
  extension (v: GUri_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GUri_slistautoptr = Ptr[GSList]
object GUri_slistautoptr: 
  given _tag: Tag[GUri_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GUri_slistautoptr = o
  extension (v: GUri_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GVariantBuilder_autoptr = Ptr[GVariantBuilder]
object GVariantBuilder_autoptr: 
  given _tag: Tag[GVariantBuilder_autoptr] = Tag.Ptr[GVariantBuilder](GVariantBuilder._tag)
  inline def apply(inline o: Ptr[GVariantBuilder]): GVariantBuilder_autoptr = o
  extension (v: GVariantBuilder_autoptr)
    inline def value: Ptr[GVariantBuilder] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GVariantBuilder_listautoptr = Ptr[GList]
object GVariantBuilder_listautoptr: 
  given _tag: Tag[GVariantBuilder_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GVariantBuilder_listautoptr = o
  extension (v: GVariantBuilder_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GVariantBuilder_queueautoptr = Ptr[GQueue]
object GVariantBuilder_queueautoptr: 
  given _tag: Tag[GVariantBuilder_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GVariantBuilder_queueautoptr = o
  extension (v: GVariantBuilder_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GVariantBuilder_slistautoptr = Ptr[GSList]
object GVariantBuilder_slistautoptr: 
  given _tag: Tag[GVariantBuilder_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GVariantBuilder_slistautoptr = o
  extension (v: GVariantBuilder_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GVariantDict_autoptr = Ptr[GVariantDict]
object GVariantDict_autoptr: 
  given _tag: Tag[GVariantDict_autoptr] = Tag.Ptr[GVariantDict](GVariantDict._tag)
  inline def apply(inline o: Ptr[GVariantDict]): GVariantDict_autoptr = o
  extension (v: GVariantDict_autoptr)
    inline def value: Ptr[GVariantDict] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GVariantDict_listautoptr = Ptr[GList]
object GVariantDict_listautoptr: 
  given _tag: Tag[GVariantDict_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GVariantDict_listautoptr = o
  extension (v: GVariantDict_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GVariantDict_queueautoptr = Ptr[GQueue]
object GVariantDict_queueautoptr: 
  given _tag: Tag[GVariantDict_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GVariantDict_queueautoptr = o
  extension (v: GVariantDict_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GVariantDict_slistautoptr = Ptr[GSList]
object GVariantDict_slistautoptr: 
  given _tag: Tag[GVariantDict_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GVariantDict_slistautoptr = o
  extension (v: GVariantDict_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GVariantIter_autoptr = Ptr[GVariantIter]
object GVariantIter_autoptr: 
  given _tag: Tag[GVariantIter_autoptr] = Tag.Ptr[GVariantIter](GVariantIter._tag)
  inline def apply(inline o: Ptr[GVariantIter]): GVariantIter_autoptr = o
  extension (v: GVariantIter_autoptr)
    inline def value: Ptr[GVariantIter] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GVariantIter_listautoptr = Ptr[GList]
object GVariantIter_listautoptr: 
  given _tag: Tag[GVariantIter_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GVariantIter_listautoptr = o
  extension (v: GVariantIter_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GVariantIter_queueautoptr = Ptr[GQueue]
object GVariantIter_queueautoptr: 
  given _tag: Tag[GVariantIter_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GVariantIter_queueautoptr = o
  extension (v: GVariantIter_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GVariantIter_slistautoptr = Ptr[GSList]
object GVariantIter_slistautoptr: 
  given _tag: Tag[GVariantIter_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GVariantIter_slistautoptr = o
  extension (v: GVariantIter_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GVariantType_autoptr = Ptr[GVariantType]
object GVariantType_autoptr: 
  given _tag: Tag[GVariantType_autoptr] = Tag.Ptr[GVariantType](GVariantType._tag)
  inline def apply(inline o: Ptr[GVariantType]): GVariantType_autoptr = o
  extension (v: GVariantType_autoptr)
    inline def value: Ptr[GVariantType] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GVariantType_listautoptr = Ptr[GList]
object GVariantType_listautoptr: 
  given _tag: Tag[GVariantType_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GVariantType_listautoptr = o
  extension (v: GVariantType_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GVariantType_queueautoptr = Ptr[GQueue]
object GVariantType_queueautoptr: 
  given _tag: Tag[GVariantType_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GVariantType_queueautoptr = o
  extension (v: GVariantType_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GVariantType_slistautoptr = Ptr[GSList]
object GVariantType_slistautoptr: 
  given _tag: Tag[GVariantType_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GVariantType_slistautoptr = o
  extension (v: GVariantType_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GVariant_autoptr = Ptr[GVariant]
object GVariant_autoptr: 
  given _tag: Tag[GVariant_autoptr] = Tag.Ptr[GVariant](GVariant._tag)
  inline def apply(inline o: Ptr[GVariant]): GVariant_autoptr = o
  extension (v: GVariant_autoptr)
    inline def value: Ptr[GVariant] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GVariant_listautoptr = Ptr[GList]
object GVariant_listautoptr: 
  given _tag: Tag[GVariant_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GVariant_listautoptr = o
  extension (v: GVariant_listautoptr)
    inline def value: Ptr[GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GVariant_queueautoptr = Ptr[GQueue]
object GVariant_queueautoptr: 
  given _tag: Tag[GVariant_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GVariant_queueautoptr = o
  extension (v: GVariant_queueautoptr)
    inline def value: Ptr[GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/glib-autocleanups.h
*/
opaque type GVariant_slistautoptr = Ptr[GSList]
object GVariant_slistautoptr: 
  given _tag: Tag[GVariant_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GVariant_slistautoptr = o
  extension (v: GVariant_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * GVoidFunc:

 * [bindgen] header: /usr/include/glib-2.0/glib/gutils.h
*/
opaque type GVoidFunc = CFuncPtr0[Unit]
object GVoidFunc: 
  given _tag: Tag[GVoidFunc] = Tag.materializeCFuncPtr0[Unit]
  inline def apply(inline o: CFuncPtr0[Unit]): GVoidFunc = o
  extension (v: GVoidFunc)
    inline def value: CFuncPtr0[Unit] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
*/
type gatomicrefcount = gint
object gatomicrefcount: 
  given _tag: Tag[gatomicrefcount] = gint._tag
  inline def apply(inline o: gint): gatomicrefcount = o
  extension (v: gatomicrefcount)
    inline def value: gint = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
*/
type gboolean = gint
object gboolean: 
  given _tag: Tag[gboolean] = gint._tag
  inline def apply(inline o: gint): gboolean = o
  extension (v: gboolean)
    inline def value: gint = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
*/
opaque type gchar = CChar
object gchar: 
  given _tag: Tag[gchar] = Tag.Byte
  inline def apply(inline o: CChar): gchar = o
  extension (v: gchar)
    inline def value: CChar = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
*/
opaque type gconstpointer = Ptr[Byte]
object gconstpointer: 
  given _tag: Tag[gconstpointer] = Tag.Ptr(Tag.Byte)
  inline def apply(inline o: Ptr[Byte]): gconstpointer = o
  extension (v: gconstpointer)
    inline def value: Ptr[Byte] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
*/
opaque type gdouble = Double
object gdouble: 
  given _tag: Tag[gdouble] = Tag.Double
  inline def apply(inline o: Double): gdouble = o
  extension (v: gdouble)
    inline def value: Double = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
*/
opaque type gfloat = Float
object gfloat: 
  given _tag: Tag[gfloat] = Tag.Float
  inline def apply(inline o: Float): gfloat = o
  extension (v: gfloat)
    inline def value: Float = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
*/
opaque type gint = CInt
object gint: 
  given _tag: Tag[gint] = Tag.Int
  inline def apply(inline o: CInt): gint = o
  extension (v: gint)
    inline def value: CInt = v

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/glib-2.0/include/glibconfig.h
*/
opaque type gint16 = CShort
object gint16: 
  given _tag: Tag[gint16] = Tag.Short
  inline def apply(inline o: CShort): gint16 = o
  extension (v: gint16)
    inline def value: CShort = v

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/glib-2.0/include/glibconfig.h
*/
opaque type gint32 = CInt
object gint32: 
  given _tag: Tag[gint32] = Tag.Int
  inline def apply(inline o: CInt): gint32 = o
  extension (v: gint32)
    inline def value: CInt = v

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/glib-2.0/include/glibconfig.h
*/
opaque type gint64 = CLongInt
object gint64: 
  given _tag: Tag[gint64] = Tag.Long
  inline def apply(inline o: CLongInt): gint64 = o
  extension (v: gint64)
    inline def value: CLongInt = v

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/glib-2.0/include/glibconfig.h
*/
opaque type gint8 = CChar
object gint8: 
  given _tag: Tag[gint8] = Tag.Byte
  inline def apply(inline o: CChar): gint8 = o
  extension (v: gint8)
    inline def value: CChar = v

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/glib-2.0/include/glibconfig.h
*/
opaque type gintptr = CLongInt
object gintptr: 
  given _tag: Tag[gintptr] = Tag.Long
  inline def apply(inline o: CLongInt): gintptr = o
  extension (v: gintptr)
    inline def value: CLongInt = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
*/
opaque type glong = CLongInt
object glong: 
  given _tag: Tag[glong] = Tag.Long
  inline def apply(inline o: CLongInt): glong = o
  extension (v: glong)
    inline def value: CLongInt = v

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/glib-2.0/include/glibconfig.h
*/
type goffset = gint64
object goffset: 
  given _tag: Tag[goffset] = gint64._tag
  inline def apply(inline o: gint64): goffset = o
  extension (v: goffset)
    inline def value: gint64 = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
*/
opaque type gpointer = Ptr[Byte]
object gpointer: 
  given _tag: Tag[gpointer] = Tag.Ptr(Tag.Byte)
  inline def apply(inline o: Ptr[Byte]): gpointer = o
  extension (v: gpointer)
    inline def value: Ptr[Byte] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
*/
type grefcount = gint
object grefcount: 
  given _tag: Tag[grefcount] = gint._tag
  inline def apply(inline o: gint): grefcount = o
  extension (v: grefcount)
    inline def value: gint = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
*/
opaque type gshort = CShort
object gshort: 
  given _tag: Tag[gshort] = Tag.Short
  inline def apply(inline o: CShort): gshort = o
  extension (v: gshort)
    inline def value: CShort = v

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/glib-2.0/include/glibconfig.h
*/
opaque type gsize = CUnsignedLongInt
object gsize: 
  given _tag: Tag[gsize] = Tag.ULong
  inline def apply(inline o: CUnsignedLongInt): gsize = o
  extension (v: gsize)
    inline def value: CUnsignedLongInt = v

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/glib-2.0/include/glibconfig.h
*/
opaque type gssize = CLongInt
object gssize: 
  given _tag: Tag[gssize] = Tag.Long
  inline def apply(inline o: CLongInt): gssize = o
  extension (v: gssize)
    inline def value: CLongInt = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
*/
opaque type guchar = CUnsignedChar
object guchar: 
  given _tag: Tag[guchar] = Tag.UByte
  inline def apply(inline o: CUnsignedChar): guchar = o
  extension (v: guchar)
    inline def value: CUnsignedChar = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
*/
opaque type guint = CUnsignedInt
object guint: 
  given _tag: Tag[guint] = Tag.UInt
  inline def apply(inline o: CUnsignedInt): guint = o
  extension (v: guint)
    inline def value: CUnsignedInt = v

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/glib-2.0/include/glibconfig.h
*/
opaque type guint16 = CUnsignedShort
object guint16: 
  given _tag: Tag[guint16] = Tag.UShort
  inline def apply(inline o: CUnsignedShort): guint16 = o
  extension (v: guint16)
    inline def value: CUnsignedShort = v

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/glib-2.0/include/glibconfig.h
*/
opaque type guint32 = CUnsignedInt
object guint32: 
  given _tag: Tag[guint32] = Tag.UInt
  inline def apply(inline o: CUnsignedInt): guint32 = o
  extension (v: guint32)
    inline def value: CUnsignedInt = v

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/glib-2.0/include/glibconfig.h
*/
opaque type guint64 = CUnsignedLongInt
object guint64: 
  given _tag: Tag[guint64] = Tag.ULong
  inline def apply(inline o: CUnsignedLongInt): guint64 = o
  extension (v: guint64)
    inline def value: CUnsignedLongInt = v

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/glib-2.0/include/glibconfig.h
*/
opaque type guint8 = CUnsignedChar
object guint8: 
  given _tag: Tag[guint8] = Tag.UByte
  inline def apply(inline o: CUnsignedChar): guint8 = o
  extension (v: guint8)
    inline def value: CUnsignedChar = v

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/glib-2.0/include/glibconfig.h
*/
opaque type guintptr = CUnsignedLongInt
object guintptr: 
  given _tag: Tag[guintptr] = Tag.ULong
  inline def apply(inline o: CUnsignedLongInt): guintptr = o
  extension (v: guintptr)
    inline def value: CUnsignedLongInt = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
*/
opaque type gulong = CUnsignedLongInt
object gulong: 
  given _tag: Tag[gulong] = Tag.ULong
  inline def apply(inline o: CUnsignedLongInt): gulong = o
  extension (v: gulong)
    inline def value: CUnsignedLongInt = v

/**
 * gunichar:

 * [bindgen] header: /usr/include/glib-2.0/glib/gunicode.h
*/
type gunichar = guint32
object gunichar: 
  given _tag: Tag[gunichar] = guint32._tag
  inline def apply(inline o: guint32): gunichar = o
  extension (v: gunichar)
    inline def value: guint32 = v

/**
 * gunichar2:

 * [bindgen] header: /usr/include/glib-2.0/glib/gunicode.h
*/
type gunichar2 = guint16
object gunichar2: 
  given _tag: Tag[gunichar2] = guint16._tag
  inline def apply(inline o: guint16): gunichar2 = o
  extension (v: gunichar2)
    inline def value: guint16 = v

/**
 * [bindgen] header: /usr/include/glib-2.0/glib/gtypes.h
*/
opaque type gushort = CUnsignedShort
object gushort: 
  given _tag: Tag[gushort] = Tag.UShort
  inline def apply(inline o: CUnsignedShort): gushort = o
  extension (v: gushort)
    inline def value: CUnsignedShort = v

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

type va_list = unsafe.CVarArgList
object va_list: 
  val _tag: Tag[va_list] = summon[Tag[unsafe.CVarArgList]]
  inline def apply(inline o: unsafe.CVarArgList): va_list = o
  extension (v: va_list)
    inline def value: unsafe.CVarArgList = v

