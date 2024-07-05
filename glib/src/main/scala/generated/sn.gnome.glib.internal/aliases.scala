package sn.gnome.glib.internal

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GArray_autoptr = Ptr[GArray]
object GArray_autoptr: 
  given _tag: Tag[GArray_autoptr] = Tag.Ptr[GArray](GArray._tag)
  inline def apply(inline o: Ptr[GArray]): GArray_autoptr = o
  extension (v: GArray_autoptr)
    inline def value: Ptr[GArray] = v

opaque type GArray_listautoptr = Ptr[GList]
object GArray_listautoptr: 
  given _tag: Tag[GArray_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GArray_listautoptr = o
  extension (v: GArray_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GArray_queueautoptr = Ptr[GQueue]
object GArray_queueautoptr: 
  given _tag: Tag[GArray_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GArray_queueautoptr = o
  extension (v: GArray_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GArray_slistautoptr = Ptr[GSList]
object GArray_slistautoptr: 
  given _tag: Tag[GArray_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GArray_slistautoptr = o
  extension (v: GArray_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GAsyncQueue_autoptr = Ptr[GAsyncQueue]
object GAsyncQueue_autoptr: 
  given _tag: Tag[GAsyncQueue_autoptr] = Tag.Ptr[GAsyncQueue](GAsyncQueue._tag)
  inline def apply(inline o: Ptr[GAsyncQueue]): GAsyncQueue_autoptr = o
  extension (v: GAsyncQueue_autoptr)
    inline def value: Ptr[GAsyncQueue] = v

opaque type GAsyncQueue_listautoptr = Ptr[GList]
object GAsyncQueue_listautoptr: 
  given _tag: Tag[GAsyncQueue_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GAsyncQueue_listautoptr = o
  extension (v: GAsyncQueue_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GAsyncQueue_queueautoptr = Ptr[GQueue]
object GAsyncQueue_queueautoptr: 
  given _tag: Tag[GAsyncQueue_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GAsyncQueue_queueautoptr = o
  extension (v: GAsyncQueue_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GAsyncQueue_slistautoptr = Ptr[GSList]
object GAsyncQueue_slistautoptr: 
  given _tag: Tag[GAsyncQueue_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GAsyncQueue_slistautoptr = o
  extension (v: GAsyncQueue_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GBookmarkFile_autoptr = Ptr[GBookmarkFile]
object GBookmarkFile_autoptr: 
  given _tag: Tag[GBookmarkFile_autoptr] = Tag.Ptr[GBookmarkFile](GBookmarkFile._tag)
  inline def apply(inline o: Ptr[GBookmarkFile]): GBookmarkFile_autoptr = o
  extension (v: GBookmarkFile_autoptr)
    inline def value: Ptr[GBookmarkFile] = v

opaque type GBookmarkFile_listautoptr = Ptr[GList]
object GBookmarkFile_listautoptr: 
  given _tag: Tag[GBookmarkFile_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GBookmarkFile_listautoptr = o
  extension (v: GBookmarkFile_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GBookmarkFile_queueautoptr = Ptr[GQueue]
object GBookmarkFile_queueautoptr: 
  given _tag: Tag[GBookmarkFile_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GBookmarkFile_queueautoptr = o
  extension (v: GBookmarkFile_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GBookmarkFile_slistautoptr = Ptr[GSList]
object GBookmarkFile_slistautoptr: 
  given _tag: Tag[GBookmarkFile_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GBookmarkFile_slistautoptr = o
  extension (v: GBookmarkFile_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GByteArray_autoptr = Ptr[GByteArray]
object GByteArray_autoptr: 
  given _tag: Tag[GByteArray_autoptr] = Tag.Ptr[GByteArray](GByteArray._tag)
  inline def apply(inline o: Ptr[GByteArray]): GByteArray_autoptr = o
  extension (v: GByteArray_autoptr)
    inline def value: Ptr[GByteArray] = v

opaque type GByteArray_listautoptr = Ptr[GList]
object GByteArray_listautoptr: 
  given _tag: Tag[GByteArray_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GByteArray_listautoptr = o
  extension (v: GByteArray_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GByteArray_queueautoptr = Ptr[GQueue]
object GByteArray_queueautoptr: 
  given _tag: Tag[GByteArray_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GByteArray_queueautoptr = o
  extension (v: GByteArray_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GByteArray_slistautoptr = Ptr[GSList]
object GByteArray_slistautoptr: 
  given _tag: Tag[GByteArray_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GByteArray_slistautoptr = o
  extension (v: GByteArray_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GBytes_autoptr = Ptr[GBytes]
object GBytes_autoptr: 
  given _tag: Tag[GBytes_autoptr] = Tag.Ptr[GBytes](GBytes._tag)
  inline def apply(inline o: Ptr[GBytes]): GBytes_autoptr = o
  extension (v: GBytes_autoptr)
    inline def value: Ptr[GBytes] = v

opaque type GBytes_listautoptr = Ptr[GList]
object GBytes_listautoptr: 
  given _tag: Tag[GBytes_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GBytes_listautoptr = o
  extension (v: GBytes_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GBytes_queueautoptr = Ptr[GQueue]
object GBytes_queueautoptr: 
  given _tag: Tag[GBytes_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GBytes_queueautoptr = o
  extension (v: GBytes_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GBytes_slistautoptr = Ptr[GSList]
object GBytes_slistautoptr: 
  given _tag: Tag[GBytes_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GBytes_slistautoptr = o
  extension (v: GBytes_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GCacheDestroyFunc = CFuncPtr1[gpointer, Unit]
object GCacheDestroyFunc: 
  given _tag: Tag[GCacheDestroyFunc] = Tag.materializeCFuncPtr1[gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GCacheDestroyFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[gpointer, Unit]): GCacheDestroyFunc = o
  extension (v: GCacheDestroyFunc)
    inline def value: CFuncPtr1[gpointer, Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GCacheDupFunc = CFuncPtr1[gpointer, gpointer]
object GCacheDupFunc: 
  given _tag: Tag[GCacheDupFunc] = Tag.materializeCFuncPtr1[gpointer, gpointer]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GCacheDupFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[gpointer, gpointer]): GCacheDupFunc = o
  extension (v: GCacheDupFunc)
    inline def value: CFuncPtr1[gpointer, gpointer] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GCacheNewFunc = CFuncPtr1[gpointer, gpointer]
object GCacheNewFunc: 
  given _tag: Tag[GCacheNewFunc] = Tag.materializeCFuncPtr1[gpointer, gpointer]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GCacheNewFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[gpointer, gpointer]): GCacheNewFunc = o
  extension (v: GCacheNewFunc)
    inline def value: CFuncPtr1[gpointer, gpointer] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GChecksum_autoptr = Ptr[GChecksum]
object GChecksum_autoptr: 
  given _tag: Tag[GChecksum_autoptr] = Tag.Ptr[GChecksum](GChecksum._tag)
  inline def apply(inline o: Ptr[GChecksum]): GChecksum_autoptr = o
  extension (v: GChecksum_autoptr)
    inline def value: Ptr[GChecksum] = v

opaque type GChecksum_listautoptr = Ptr[GList]
object GChecksum_listautoptr: 
  given _tag: Tag[GChecksum_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GChecksum_listautoptr = o
  extension (v: GChecksum_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GChecksum_queueautoptr = Ptr[GQueue]
object GChecksum_queueautoptr: 
  given _tag: Tag[GChecksum_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GChecksum_queueautoptr = o
  extension (v: GChecksum_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GChecksum_slistautoptr = Ptr[GSList]
object GChecksum_slistautoptr: 
  given _tag: Tag[GChecksum_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GChecksum_slistautoptr = o
  extension (v: GChecksum_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * GChildWatchFunc: : the process id of the child process _status: Status information about the child process, encoded in a platform-specific manner _data: user data passed to g_child_watch_add()
*/
opaque type GChildWatchFunc = CFuncPtr3[GPid, gint, gpointer, Unit]
object GChildWatchFunc: 
  given _tag: Tag[GChildWatchFunc] = Tag.materializeCFuncPtr3[GPid, gint, gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GChildWatchFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GPid, gint, gpointer, Unit]): GChildWatchFunc = o
  extension (v: GChildWatchFunc)
    inline def value: CFuncPtr3[GPid, gint, gpointer, Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * GClearHandleFunc: _id: the handle ID to clear
*/
opaque type GClearHandleFunc = CFuncPtr1[guint, Unit]
object GClearHandleFunc: 
  given _tag: Tag[GClearHandleFunc] = Tag.materializeCFuncPtr1[guint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GClearHandleFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[guint, Unit]): GClearHandleFunc = o
  extension (v: GClearHandleFunc)
    inline def value: CFuncPtr1[guint, Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GCompareDataFunc = CFuncPtr3[gconstpointer, gconstpointer, gpointer, gint]
object GCompareDataFunc: 
  given _tag: Tag[GCompareDataFunc] = Tag.materializeCFuncPtr3[gconstpointer, gconstpointer, gpointer, gint]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GCompareDataFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[gconstpointer, gconstpointer, gpointer, gint]): GCompareDataFunc = o
  extension (v: GCompareDataFunc)
    inline def value: CFuncPtr3[gconstpointer, gconstpointer, gpointer, gint] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GCompareFunc = CFuncPtr2[gconstpointer, gconstpointer, gint]
object GCompareFunc: 
  given _tag: Tag[GCompareFunc] = Tag.materializeCFuncPtr2[gconstpointer, gconstpointer, gint]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GCompareFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[gconstpointer, gconstpointer, gint]): GCompareFunc = o
  extension (v: GCompareFunc)
    inline def value: CFuncPtr2[gconstpointer, gconstpointer, gint] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GCompletionFunc = CFuncPtr1[gpointer, Ptr[gchar]]
object GCompletionFunc: 
  given _tag: Tag[GCompletionFunc] = Tag.materializeCFuncPtr1[gpointer, Ptr[gchar]]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GCompletionFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[gpointer, Ptr[gchar]]): GCompletionFunc = o
  extension (v: GCompletionFunc)
    inline def value: CFuncPtr1[gpointer, Ptr[gchar]] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GCompletionStrncmpFunc = CFuncPtr3[Ptr[gchar], Ptr[gchar], gsize, gint]
object GCompletionStrncmpFunc: 
  given _tag: Tag[GCompletionStrncmpFunc] = Tag.materializeCFuncPtr3[Ptr[gchar], Ptr[gchar], gsize, gint]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GCompletionStrncmpFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[gchar], Ptr[gchar], gsize, gint]): GCompletionStrncmpFunc = o
  extension (v: GCompletionStrncmpFunc)
    inline def value: CFuncPtr3[Ptr[gchar], Ptr[gchar], gsize, gint] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * GCopyFunc: : (not nullable): A pointer to the data which should be copied
*/
opaque type GCopyFunc = CFuncPtr2[gconstpointer, gpointer, gpointer]
object GCopyFunc: 
  given _tag: Tag[GCopyFunc] = Tag.materializeCFuncPtr2[gconstpointer, gpointer, gpointer]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GCopyFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[gconstpointer, gpointer, gpointer]): GCopyFunc = o
  extension (v: GCopyFunc)
    inline def value: CFuncPtr2[gconstpointer, gpointer, gpointer] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GDataForeachFunc = CFuncPtr3[GQuark, gpointer, gpointer, Unit]
object GDataForeachFunc: 
  given _tag: Tag[GDataForeachFunc] = Tag.materializeCFuncPtr3[GQuark, gpointer, gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GDataForeachFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GQuark, gpointer, gpointer, Unit]): GDataForeachFunc = o
  extension (v: GDataForeachFunc)
    inline def value: CFuncPtr3[GQuark, gpointer, gpointer, Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

type GDateDay = guint8
object GDateDay: 
  given _tag: Tag[GDateDay] = guint8._tag
  inline def apply(inline o: guint8): GDateDay = o
  extension (v: GDateDay)
    inline def value: guint8 = v

opaque type GDateTime_autoptr = Ptr[GDateTime]
object GDateTime_autoptr: 
  given _tag: Tag[GDateTime_autoptr] = Tag.Ptr[GDateTime](GDateTime._tag)
  inline def apply(inline o: Ptr[GDateTime]): GDateTime_autoptr = o
  extension (v: GDateTime_autoptr)
    inline def value: Ptr[GDateTime] = v

opaque type GDateTime_listautoptr = Ptr[GList]
object GDateTime_listautoptr: 
  given _tag: Tag[GDateTime_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDateTime_listautoptr = o
  extension (v: GDateTime_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GDateTime_queueautoptr = Ptr[GQueue]
object GDateTime_queueautoptr: 
  given _tag: Tag[GDateTime_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GDateTime_queueautoptr = o
  extension (v: GDateTime_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GDateTime_slistautoptr = Ptr[GSList]
object GDateTime_slistautoptr: 
  given _tag: Tag[GDateTime_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDateTime_slistautoptr = o
  extension (v: GDateTime_slistautoptr)
    inline def value: Ptr[GSList] = v

type GDateYear = guint16
object GDateYear: 
  given _tag: Tag[GDateYear] = guint16._tag
  inline def apply(inline o: guint16): GDateYear = o
  extension (v: GDateYear)
    inline def value: guint16 = v

opaque type GDate_autoptr = Ptr[GDate]
object GDate_autoptr: 
  given _tag: Tag[GDate_autoptr] = Tag.Ptr[GDate](GDate._tag)
  inline def apply(inline o: Ptr[GDate]): GDate_autoptr = o
  extension (v: GDate_autoptr)
    inline def value: Ptr[GDate] = v

opaque type GDate_listautoptr = Ptr[GList]
object GDate_listautoptr: 
  given _tag: Tag[GDate_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDate_listautoptr = o
  extension (v: GDate_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GDate_queueautoptr = Ptr[GQueue]
object GDate_queueautoptr: 
  given _tag: Tag[GDate_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GDate_queueautoptr = o
  extension (v: GDate_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GDate_slistautoptr = Ptr[GSList]
object GDate_slistautoptr: 
  given _tag: Tag[GDate_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDate_slistautoptr = o
  extension (v: GDate_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GDestroyNotify = CFuncPtr1[gpointer, Unit]
object GDestroyNotify: 
  given _tag: Tag[GDestroyNotify] = Tag.materializeCFuncPtr1[gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GDestroyNotify = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[gpointer, Unit]): GDestroyNotify = o
  extension (v: GDestroyNotify)
    inline def value: CFuncPtr1[gpointer, Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GDir_autoptr = Ptr[GDir]
object GDir_autoptr: 
  given _tag: Tag[GDir_autoptr] = Tag.Ptr[GDir](GDir._tag)
  inline def apply(inline o: Ptr[GDir]): GDir_autoptr = o
  extension (v: GDir_autoptr)
    inline def value: Ptr[GDir] = v

opaque type GDir_listautoptr = Ptr[GList]
object GDir_listautoptr: 
  given _tag: Tag[GDir_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDir_listautoptr = o
  extension (v: GDir_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GDir_queueautoptr = Ptr[GQueue]
object GDir_queueautoptr: 
  given _tag: Tag[GDir_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GDir_queueautoptr = o
  extension (v: GDir_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GDir_slistautoptr = Ptr[GSList]
object GDir_slistautoptr: 
  given _tag: Tag[GDir_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDir_slistautoptr = o
  extension (v: GDir_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GDuplicateFunc = CFuncPtr2[gpointer, gpointer, gpointer]
object GDuplicateFunc: 
  given _tag: Tag[GDuplicateFunc] = Tag.materializeCFuncPtr2[gpointer, gpointer, gpointer]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GDuplicateFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[gpointer, gpointer, gpointer]): GDuplicateFunc = o
  extension (v: GDuplicateFunc)
    inline def value: CFuncPtr2[gpointer, gpointer, gpointer] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GEqualFunc = CFuncPtr2[gconstpointer, gconstpointer, gboolean]
object GEqualFunc: 
  given _tag: Tag[GEqualFunc] = Tag.materializeCFuncPtr2[gconstpointer, gconstpointer, gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GEqualFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[gconstpointer, gconstpointer, gboolean]): GEqualFunc = o
  extension (v: GEqualFunc)
    inline def value: CFuncPtr2[gconstpointer, gconstpointer, gboolean] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * GEqualFuncFull: : a value : a value to compare with _data: user data provided by the caller
*/
opaque type GEqualFuncFull = CFuncPtr3[gconstpointer, gconstpointer, gpointer, gboolean]
object GEqualFuncFull: 
  given _tag: Tag[GEqualFuncFull] = Tag.materializeCFuncPtr3[gconstpointer, gconstpointer, gpointer, gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GEqualFuncFull = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[gconstpointer, gconstpointer, gpointer, gboolean]): GEqualFuncFull = o
  extension (v: GEqualFuncFull)
    inline def value: CFuncPtr3[gconstpointer, gconstpointer, gpointer, gboolean] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * GErrorClearFunc: : extended error to clear
*/
opaque type GErrorClearFunc = CFuncPtr1[Ptr[GError], Unit]
object GErrorClearFunc: 
  given _tag: Tag[GErrorClearFunc] = Tag.materializeCFuncPtr1[Ptr[GError], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GErrorClearFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GError], Unit]): GErrorClearFunc = o
  extension (v: GErrorClearFunc)
    inline def value: CFuncPtr1[Ptr[GError], Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * GErrorCopyFunc: _error: source extended error
*/
opaque type GErrorCopyFunc = CFuncPtr2[Ptr[GError], Ptr[GError], Unit]
object GErrorCopyFunc: 
  given _tag: Tag[GErrorCopyFunc] = Tag.materializeCFuncPtr2[Ptr[GError], Ptr[GError], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GErrorCopyFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GError], Ptr[GError], Unit]): GErrorCopyFunc = o
  extension (v: GErrorCopyFunc)
    inline def value: CFuncPtr2[Ptr[GError], Ptr[GError], Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * GErrorInitFunc: : extended error
*/
opaque type GErrorInitFunc = CFuncPtr1[Ptr[GError], Unit]
object GErrorInitFunc: 
  given _tag: Tag[GErrorInitFunc] = Tag.materializeCFuncPtr1[Ptr[GError], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GErrorInitFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GError], Unit]): GErrorInitFunc = o
  extension (v: GErrorInitFunc)
    inline def value: CFuncPtr1[Ptr[GError], Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GError_autoptr = Ptr[GError]
object GError_autoptr: 
  given _tag: Tag[GError_autoptr] = Tag.Ptr[GError](GError._tag)
  inline def apply(inline o: Ptr[GError]): GError_autoptr = o
  extension (v: GError_autoptr)
    inline def value: Ptr[GError] = v

opaque type GError_listautoptr = Ptr[GList]
object GError_listautoptr: 
  given _tag: Tag[GError_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GError_listautoptr = o
  extension (v: GError_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GError_queueautoptr = Ptr[GQueue]
object GError_queueautoptr: 
  given _tag: Tag[GError_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GError_queueautoptr = o
  extension (v: GError_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GError_slistautoptr = Ptr[GSList]
object GError_slistautoptr: 
  given _tag: Tag[GError_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GError_slistautoptr = o
  extension (v: GError_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * GFreeFunc:
*/
opaque type GFreeFunc = CFuncPtr1[gpointer, Unit]
object GFreeFunc: 
  given _tag: Tag[GFreeFunc] = Tag.materializeCFuncPtr1[gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GFreeFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[gpointer, Unit]): GFreeFunc = o
  extension (v: GFreeFunc)
    inline def value: CFuncPtr1[gpointer, Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GFunc = CFuncPtr2[gpointer, gpointer, Unit]
object GFunc: 
  given _tag: Tag[GFunc] = Tag.materializeCFuncPtr2[gpointer, gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[gpointer, gpointer, Unit]): GFunc = o
  extension (v: GFunc)
    inline def value: CFuncPtr2[gpointer, gpointer, Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GHFunc = CFuncPtr3[gpointer, gpointer, gpointer, Unit]
object GHFunc: 
  given _tag: Tag[GHFunc] = Tag.materializeCFuncPtr3[gpointer, gpointer, gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GHFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[gpointer, gpointer, gpointer, Unit]): GHFunc = o
  extension (v: GHFunc)
    inline def value: CFuncPtr3[gpointer, gpointer, gpointer, Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GHRFunc = CFuncPtr3[gpointer, gpointer, gpointer, gboolean]
object GHRFunc: 
  given _tag: Tag[GHRFunc] = Tag.materializeCFuncPtr3[gpointer, gpointer, gpointer, gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GHRFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[gpointer, gpointer, gpointer, gboolean]): GHRFunc = o
  extension (v: GHRFunc)
    inline def value: CFuncPtr3[gpointer, gpointer, gpointer, gboolean] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GHashFunc = CFuncPtr1[gconstpointer, guint]
object GHashFunc: 
  given _tag: Tag[GHashFunc] = Tag.materializeCFuncPtr1[gconstpointer, guint]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GHashFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[gconstpointer, guint]): GHashFunc = o
  extension (v: GHashFunc)
    inline def value: CFuncPtr1[gconstpointer, guint] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GHashTable_autoptr = Ptr[GHashTable]
object GHashTable_autoptr: 
  given _tag: Tag[GHashTable_autoptr] = Tag.Ptr[GHashTable](GHashTable._tag)
  inline def apply(inline o: Ptr[GHashTable]): GHashTable_autoptr = o
  extension (v: GHashTable_autoptr)
    inline def value: Ptr[GHashTable] = v

opaque type GHashTable_listautoptr = Ptr[GList]
object GHashTable_listautoptr: 
  given _tag: Tag[GHashTable_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GHashTable_listautoptr = o
  extension (v: GHashTable_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GHashTable_queueautoptr = Ptr[GQueue]
object GHashTable_queueautoptr: 
  given _tag: Tag[GHashTable_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GHashTable_queueautoptr = o
  extension (v: GHashTable_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GHashTable_slistautoptr = Ptr[GSList]
object GHashTable_slistautoptr: 
  given _tag: Tag[GHashTable_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GHashTable_slistautoptr = o
  extension (v: GHashTable_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GHmac_autoptr = Ptr[GHmac]
object GHmac_autoptr: 
  given _tag: Tag[GHmac_autoptr] = Tag.Ptr[GHmac](GHmac._tag)
  inline def apply(inline o: Ptr[GHmac]): GHmac_autoptr = o
  extension (v: GHmac_autoptr)
    inline def value: Ptr[GHmac] = v

opaque type GHmac_listautoptr = Ptr[GList]
object GHmac_listautoptr: 
  given _tag: Tag[GHmac_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GHmac_listautoptr = o
  extension (v: GHmac_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GHmac_queueautoptr = Ptr[GQueue]
object GHmac_queueautoptr: 
  given _tag: Tag[GHmac_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GHmac_queueautoptr = o
  extension (v: GHmac_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GHmac_slistautoptr = Ptr[GSList]
object GHmac_slistautoptr: 
  given _tag: Tag[GHmac_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GHmac_slistautoptr = o
  extension (v: GHmac_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GHookCheckFunc = CFuncPtr1[gpointer, gboolean]
object GHookCheckFunc: 
  given _tag: Tag[GHookCheckFunc] = Tag.materializeCFuncPtr1[gpointer, gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GHookCheckFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[gpointer, gboolean]): GHookCheckFunc = o
  extension (v: GHookCheckFunc)
    inline def value: CFuncPtr1[gpointer, gboolean] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GHookCheckMarshaller = CFuncPtr2[Ptr[GHook], gpointer, gboolean]
object GHookCheckMarshaller: 
  given _tag: Tag[GHookCheckMarshaller] = Tag.materializeCFuncPtr2[Ptr[GHook], gpointer, gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GHookCheckMarshaller = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GHook], gpointer, gboolean]): GHookCheckMarshaller = o
  extension (v: GHookCheckMarshaller)
    inline def value: CFuncPtr2[Ptr[GHook], gpointer, gboolean] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GHookCompareFunc = CFuncPtr2[Ptr[GHook], Ptr[GHook], gint]
object GHookCompareFunc: 
  given _tag: Tag[GHookCompareFunc] = Tag.materializeCFuncPtr2[Ptr[GHook], Ptr[GHook], gint]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GHookCompareFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GHook], Ptr[GHook], gint]): GHookCompareFunc = o
  extension (v: GHookCompareFunc)
    inline def value: CFuncPtr2[Ptr[GHook], Ptr[GHook], gint] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GHookFinalizeFunc = CFuncPtr2[Ptr[GHookList], Ptr[GHook], Unit]
object GHookFinalizeFunc: 
  given _tag: Tag[GHookFinalizeFunc] = Tag.materializeCFuncPtr2[Ptr[GHookList], Ptr[GHook], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GHookFinalizeFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GHookList], Ptr[GHook], Unit]): GHookFinalizeFunc = o
  extension (v: GHookFinalizeFunc)
    inline def value: CFuncPtr2[Ptr[GHookList], Ptr[GHook], Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GHookFindFunc = CFuncPtr2[Ptr[GHook], gpointer, gboolean]
object GHookFindFunc: 
  given _tag: Tag[GHookFindFunc] = Tag.materializeCFuncPtr2[Ptr[GHook], gpointer, gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GHookFindFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GHook], gpointer, gboolean]): GHookFindFunc = o
  extension (v: GHookFindFunc)
    inline def value: CFuncPtr2[Ptr[GHook], gpointer, gboolean] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GHookFunc = CFuncPtr1[gpointer, Unit]
object GHookFunc: 
  given _tag: Tag[GHookFunc] = Tag.materializeCFuncPtr1[gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GHookFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[gpointer, Unit]): GHookFunc = o
  extension (v: GHookFunc)
    inline def value: CFuncPtr1[gpointer, Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GHookMarshaller = CFuncPtr2[Ptr[GHook], gpointer, Unit]
object GHookMarshaller: 
  given _tag: Tag[GHookMarshaller] = Tag.materializeCFuncPtr2[Ptr[GHook], gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GHookMarshaller = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GHook], gpointer, Unit]): GHookMarshaller = o
  extension (v: GHookMarshaller)
    inline def value: CFuncPtr2[Ptr[GHook], gpointer, Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * GIConv: (skip)
*/
opaque type GIConv = Ptr[_GIConv]
object GIConv: 
  given _tag: Tag[GIConv] = Tag.Ptr[_GIConv](_GIConv._tag)
  inline def apply(inline o: Ptr[_GIConv]): GIConv = o
  extension (v: GIConv)
    inline def value: Ptr[_GIConv] = v

opaque type GIOChannel_autoptr = Ptr[GIOChannel]
object GIOChannel_autoptr: 
  given _tag: Tag[GIOChannel_autoptr] = Tag.Ptr[GIOChannel](GIOChannel._tag)
  inline def apply(inline o: Ptr[GIOChannel]): GIOChannel_autoptr = o
  extension (v: GIOChannel_autoptr)
    inline def value: Ptr[GIOChannel] = v

opaque type GIOChannel_listautoptr = Ptr[GList]
object GIOChannel_listautoptr: 
  given _tag: Tag[GIOChannel_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GIOChannel_listautoptr = o
  extension (v: GIOChannel_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GIOChannel_queueautoptr = Ptr[GQueue]
object GIOChannel_queueautoptr: 
  given _tag: Tag[GIOChannel_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GIOChannel_queueautoptr = o
  extension (v: GIOChannel_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GIOChannel_slistautoptr = Ptr[GSList]
object GIOChannel_slistautoptr: 
  given _tag: Tag[GIOChannel_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GIOChannel_slistautoptr = o
  extension (v: GIOChannel_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GIOFunc = CFuncPtr3[Ptr[GIOChannel], GIOCondition, gpointer, gboolean]
object GIOFunc: 
  given _tag: Tag[GIOFunc] = Tag.materializeCFuncPtr3[Ptr[GIOChannel], GIOCondition, gpointer, gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GIOFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GIOChannel], GIOCondition, gpointer, gboolean]): GIOFunc = o
  extension (v: GIOFunc)
    inline def value: CFuncPtr3[Ptr[GIOChannel], GIOCondition, gpointer, gboolean] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GKeyFile_autoptr = Ptr[GKeyFile]
object GKeyFile_autoptr: 
  given _tag: Tag[GKeyFile_autoptr] = Tag.Ptr[GKeyFile](GKeyFile._tag)
  inline def apply(inline o: Ptr[GKeyFile]): GKeyFile_autoptr = o
  extension (v: GKeyFile_autoptr)
    inline def value: Ptr[GKeyFile] = v

opaque type GKeyFile_listautoptr = Ptr[GList]
object GKeyFile_listautoptr: 
  given _tag: Tag[GKeyFile_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GKeyFile_listautoptr = o
  extension (v: GKeyFile_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GKeyFile_queueautoptr = Ptr[GQueue]
object GKeyFile_queueautoptr: 
  given _tag: Tag[GKeyFile_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GKeyFile_queueautoptr = o
  extension (v: GKeyFile_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GKeyFile_slistautoptr = Ptr[GSList]
object GKeyFile_slistautoptr: 
  given _tag: Tag[GKeyFile_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GKeyFile_slistautoptr = o
  extension (v: GKeyFile_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GList_autoptr = Ptr[GList]
object GList_autoptr: 
  given _tag: Tag[GList_autoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GList_autoptr = o
  extension (v: GList_autoptr)
    inline def value: Ptr[GList] = v

opaque type GList_listautoptr = Ptr[GList]
object GList_listautoptr: 
  given _tag: Tag[GList_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GList_listautoptr = o
  extension (v: GList_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GList_queueautoptr = Ptr[GQueue]
object GList_queueautoptr: 
  given _tag: Tag[GList_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GList_queueautoptr = o
  extension (v: GList_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GList_slistautoptr = Ptr[GSList]
object GList_slistautoptr: 
  given _tag: Tag[GList_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GList_slistautoptr = o
  extension (v: GList_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GLogFunc = CFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, Unit]
object GLogFunc: 
  given _tag: Tag[GLogFunc] = Tag.materializeCFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GLogFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, Unit]): GLogFunc = o
  extension (v: GLogFunc)
    inline def value: CFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * GLogWriterFunc: _level: log level of the message : (array length=n_fields): fields forming the message _fields: number of _data: user data passed to g_log_set_writer_func()
*/
opaque type GLogWriterFunc = CFuncPtr4[GLogLevelFlags, Ptr[GLogField], gsize, gpointer, GLogWriterOutput]
object GLogWriterFunc: 
  given _tag: Tag[GLogWriterFunc] = Tag.materializeCFuncPtr4[GLogLevelFlags, Ptr[GLogField], gsize, gpointer, GLogWriterOutput]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GLogWriterFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLogLevelFlags, Ptr[GLogField], gsize, gpointer, GLogWriterOutput]): GLogWriterFunc = o
  extension (v: GLogWriterFunc)
    inline def value: CFuncPtr4[GLogLevelFlags, Ptr[GLogField], gsize, gpointer, GLogWriterOutput] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * GMainContextPusher:
*/
type GMainContextPusher = Unit
object GMainContextPusher: 
  given _tag: Tag[GMainContextPusher] = Tag.Unit
  inline def apply(inline o: Unit): GMainContextPusher = o
  extension (v: GMainContextPusher)
    inline def value: Unit = v

opaque type GMainContextPusher_autoptr = Ptr[GMainContextPusher]
object GMainContextPusher_autoptr: 
  given _tag: Tag[GMainContextPusher_autoptr] = Tag.Ptr[GMainContextPusher](GMainContextPusher._tag)
  inline def apply(inline o: Ptr[GMainContextPusher]): GMainContextPusher_autoptr = o
  extension (v: GMainContextPusher_autoptr)
    inline def value: Ptr[GMainContextPusher] = v

opaque type GMainContextPusher_listautoptr = Ptr[GList]
object GMainContextPusher_listautoptr: 
  given _tag: Tag[GMainContextPusher_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GMainContextPusher_listautoptr = o
  extension (v: GMainContextPusher_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GMainContextPusher_queueautoptr = Ptr[GQueue]
object GMainContextPusher_queueautoptr: 
  given _tag: Tag[GMainContextPusher_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GMainContextPusher_queueautoptr = o
  extension (v: GMainContextPusher_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GMainContextPusher_slistautoptr = Ptr[GSList]
object GMainContextPusher_slistautoptr: 
  given _tag: Tag[GMainContextPusher_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GMainContextPusher_slistautoptr = o
  extension (v: GMainContextPusher_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GMainContext_autoptr = Ptr[GMainContext]
object GMainContext_autoptr: 
  given _tag: Tag[GMainContext_autoptr] = Tag.Ptr[GMainContext](GMainContext._tag)
  inline def apply(inline o: Ptr[GMainContext]): GMainContext_autoptr = o
  extension (v: GMainContext_autoptr)
    inline def value: Ptr[GMainContext] = v

opaque type GMainContext_listautoptr = Ptr[GList]
object GMainContext_listautoptr: 
  given _tag: Tag[GMainContext_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GMainContext_listautoptr = o
  extension (v: GMainContext_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GMainContext_queueautoptr = Ptr[GQueue]
object GMainContext_queueautoptr: 
  given _tag: Tag[GMainContext_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GMainContext_queueautoptr = o
  extension (v: GMainContext_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GMainContext_slistautoptr = Ptr[GSList]
object GMainContext_slistautoptr: 
  given _tag: Tag[GMainContext_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GMainContext_slistautoptr = o
  extension (v: GMainContext_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GMainLoop_autoptr = Ptr[GMainLoop]
object GMainLoop_autoptr: 
  given _tag: Tag[GMainLoop_autoptr] = Tag.Ptr[GMainLoop](GMainLoop._tag)
  inline def apply(inline o: Ptr[GMainLoop]): GMainLoop_autoptr = o
  extension (v: GMainLoop_autoptr)
    inline def value: Ptr[GMainLoop] = v

opaque type GMainLoop_listautoptr = Ptr[GList]
object GMainLoop_listautoptr: 
  given _tag: Tag[GMainLoop_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GMainLoop_listautoptr = o
  extension (v: GMainLoop_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GMainLoop_queueautoptr = Ptr[GQueue]
object GMainLoop_queueautoptr: 
  given _tag: Tag[GMainLoop_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GMainLoop_queueautoptr = o
  extension (v: GMainLoop_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GMainLoop_slistautoptr = Ptr[GSList]
object GMainLoop_slistautoptr: 
  given _tag: Tag[GMainLoop_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GMainLoop_slistautoptr = o
  extension (v: GMainLoop_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GMappedFile_autoptr = Ptr[GMappedFile]
object GMappedFile_autoptr: 
  given _tag: Tag[GMappedFile_autoptr] = Tag.Ptr[GMappedFile](GMappedFile._tag)
  inline def apply(inline o: Ptr[GMappedFile]): GMappedFile_autoptr = o
  extension (v: GMappedFile_autoptr)
    inline def value: Ptr[GMappedFile] = v

opaque type GMappedFile_listautoptr = Ptr[GList]
object GMappedFile_listautoptr: 
  given _tag: Tag[GMappedFile_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GMappedFile_listautoptr = o
  extension (v: GMappedFile_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GMappedFile_queueautoptr = Ptr[GQueue]
object GMappedFile_queueautoptr: 
  given _tag: Tag[GMappedFile_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GMappedFile_queueautoptr = o
  extension (v: GMappedFile_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GMappedFile_slistautoptr = Ptr[GSList]
object GMappedFile_slistautoptr: 
  given _tag: Tag[GMappedFile_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GMappedFile_slistautoptr = o
  extension (v: GMappedFile_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GMarkupParseContext_autoptr = Ptr[GMarkupParseContext]
object GMarkupParseContext_autoptr: 
  given _tag: Tag[GMarkupParseContext_autoptr] = Tag.Ptr[GMarkupParseContext](GMarkupParseContext._tag)
  inline def apply(inline o: Ptr[GMarkupParseContext]): GMarkupParseContext_autoptr = o
  extension (v: GMarkupParseContext_autoptr)
    inline def value: Ptr[GMarkupParseContext] = v

opaque type GMarkupParseContext_listautoptr = Ptr[GList]
object GMarkupParseContext_listautoptr: 
  given _tag: Tag[GMarkupParseContext_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GMarkupParseContext_listautoptr = o
  extension (v: GMarkupParseContext_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GMarkupParseContext_queueautoptr = Ptr[GQueue]
object GMarkupParseContext_queueautoptr: 
  given _tag: Tag[GMarkupParseContext_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GMarkupParseContext_queueautoptr = o
  extension (v: GMarkupParseContext_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GMarkupParseContext_slistautoptr = Ptr[GSList]
object GMarkupParseContext_slistautoptr: 
  given _tag: Tag[GMarkupParseContext_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GMarkupParseContext_slistautoptr = o
  extension (v: GMarkupParseContext_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GMatchInfo_autoptr = Ptr[GMatchInfo]
object GMatchInfo_autoptr: 
  given _tag: Tag[GMatchInfo_autoptr] = Tag.Ptr[GMatchInfo](GMatchInfo._tag)
  inline def apply(inline o: Ptr[GMatchInfo]): GMatchInfo_autoptr = o
  extension (v: GMatchInfo_autoptr)
    inline def value: Ptr[GMatchInfo] = v

opaque type GMatchInfo_listautoptr = Ptr[GList]
object GMatchInfo_listautoptr: 
  given _tag: Tag[GMatchInfo_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GMatchInfo_listautoptr = o
  extension (v: GMatchInfo_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GMatchInfo_queueautoptr = Ptr[GQueue]
object GMatchInfo_queueautoptr: 
  given _tag: Tag[GMatchInfo_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GMatchInfo_queueautoptr = o
  extension (v: GMatchInfo_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GMatchInfo_slistautoptr = Ptr[GSList]
object GMatchInfo_slistautoptr: 
  given _tag: Tag[GMatchInfo_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GMatchInfo_slistautoptr = o
  extension (v: GMatchInfo_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * GMutexLocker:
*/
type GMutexLocker = Unit
object GMutexLocker: 
  given _tag: Tag[GMutexLocker] = Tag.Unit
  inline def apply(inline o: Unit): GMutexLocker = o
  extension (v: GMutexLocker)
    inline def value: Unit = v

opaque type GMutexLocker_autoptr = Ptr[GMutexLocker]
object GMutexLocker_autoptr: 
  given _tag: Tag[GMutexLocker_autoptr] = Tag.Ptr[GMutexLocker](GMutexLocker._tag)
  inline def apply(inline o: Ptr[GMutexLocker]): GMutexLocker_autoptr = o
  extension (v: GMutexLocker_autoptr)
    inline def value: Ptr[GMutexLocker] = v

opaque type GMutexLocker_listautoptr = Ptr[GList]
object GMutexLocker_listautoptr: 
  given _tag: Tag[GMutexLocker_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GMutexLocker_listautoptr = o
  extension (v: GMutexLocker_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GMutexLocker_queueautoptr = Ptr[GQueue]
object GMutexLocker_queueautoptr: 
  given _tag: Tag[GMutexLocker_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GMutexLocker_queueautoptr = o
  extension (v: GMutexLocker_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GMutexLocker_slistautoptr = Ptr[GSList]
object GMutexLocker_slistautoptr: 
  given _tag: Tag[GMutexLocker_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GMutexLocker_slistautoptr = o
  extension (v: GMutexLocker_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GNodeForeachFunc = CFuncPtr2[Ptr[GNode], gpointer, Unit]
object GNodeForeachFunc: 
  given _tag: Tag[GNodeForeachFunc] = Tag.materializeCFuncPtr2[Ptr[GNode], gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GNodeForeachFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GNode], gpointer, Unit]): GNodeForeachFunc = o
  extension (v: GNodeForeachFunc)
    inline def value: CFuncPtr2[Ptr[GNode], gpointer, Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GNodeTraverseFunc = CFuncPtr2[Ptr[GNode], gpointer, gboolean]
object GNodeTraverseFunc: 
  given _tag: Tag[GNodeTraverseFunc] = Tag.materializeCFuncPtr2[Ptr[GNode], gpointer, gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GNodeTraverseFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GNode], gpointer, gboolean]): GNodeTraverseFunc = o
  extension (v: GNodeTraverseFunc)
    inline def value: CFuncPtr2[Ptr[GNode], gpointer, gboolean] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GNode_autoptr = Ptr[GNode]
object GNode_autoptr: 
  given _tag: Tag[GNode_autoptr] = Tag.Ptr[GNode](GNode._tag)
  inline def apply(inline o: Ptr[GNode]): GNode_autoptr = o
  extension (v: GNode_autoptr)
    inline def value: Ptr[GNode] = v

opaque type GNode_listautoptr = Ptr[GList]
object GNode_listautoptr: 
  given _tag: Tag[GNode_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GNode_listautoptr = o
  extension (v: GNode_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GNode_queueautoptr = Ptr[GQueue]
object GNode_queueautoptr: 
  given _tag: Tag[GNode_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GNode_queueautoptr = o
  extension (v: GNode_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GNode_slistautoptr = Ptr[GSList]
object GNode_slistautoptr: 
  given _tag: Tag[GNode_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GNode_slistautoptr = o
  extension (v: GNode_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * GOptionArgFunc: _name: The name of the option being parsed. This will be either a single dash followed by a single letter (for a short name) or two dashes followed by a long option name. : The value to be parsed.
*/
opaque type GOptionArgFunc = CFuncPtr4[Ptr[gchar], Ptr[gchar], gpointer, Ptr[Ptr[GError]], gboolean]
object GOptionArgFunc: 
  given _tag: Tag[GOptionArgFunc] = Tag.materializeCFuncPtr4[Ptr[gchar], Ptr[gchar], gpointer, Ptr[Ptr[GError]], gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GOptionArgFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[gchar], Ptr[gchar], gpointer, Ptr[Ptr[GError]], gboolean]): GOptionArgFunc = o
  extension (v: GOptionArgFunc)
    inline def value: CFuncPtr4[Ptr[gchar], Ptr[gchar], gpointer, Ptr[Ptr[GError]], gboolean] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GOptionContext_autoptr = Ptr[GOptionContext]
object GOptionContext_autoptr: 
  given _tag: Tag[GOptionContext_autoptr] = Tag.Ptr[GOptionContext](GOptionContext._tag)
  inline def apply(inline o: Ptr[GOptionContext]): GOptionContext_autoptr = o
  extension (v: GOptionContext_autoptr)
    inline def value: Ptr[GOptionContext] = v

opaque type GOptionContext_listautoptr = Ptr[GList]
object GOptionContext_listautoptr: 
  given _tag: Tag[GOptionContext_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GOptionContext_listautoptr = o
  extension (v: GOptionContext_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GOptionContext_queueautoptr = Ptr[GQueue]
object GOptionContext_queueautoptr: 
  given _tag: Tag[GOptionContext_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GOptionContext_queueautoptr = o
  extension (v: GOptionContext_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GOptionContext_slistautoptr = Ptr[GSList]
object GOptionContext_slistautoptr: 
  given _tag: Tag[GOptionContext_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GOptionContext_slistautoptr = o
  extension (v: GOptionContext_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * GOptionErrorFunc: : The active #GOptionContext : The group to which the function belongs
*/
opaque type GOptionErrorFunc = CFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], Unit]
object GOptionErrorFunc: 
  given _tag: Tag[GOptionErrorFunc] = Tag.materializeCFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GOptionErrorFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], Unit]): GOptionErrorFunc = o
  extension (v: GOptionErrorFunc)
    inline def value: CFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GOptionGroup_autoptr = Ptr[GOptionGroup]
object GOptionGroup_autoptr: 
  given _tag: Tag[GOptionGroup_autoptr] = Tag.Ptr[GOptionGroup](GOptionGroup._tag)
  inline def apply(inline o: Ptr[GOptionGroup]): GOptionGroup_autoptr = o
  extension (v: GOptionGroup_autoptr)
    inline def value: Ptr[GOptionGroup] = v

opaque type GOptionGroup_listautoptr = Ptr[GList]
object GOptionGroup_listautoptr: 
  given _tag: Tag[GOptionGroup_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GOptionGroup_listautoptr = o
  extension (v: GOptionGroup_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GOptionGroup_queueautoptr = Ptr[GQueue]
object GOptionGroup_queueautoptr: 
  given _tag: Tag[GOptionGroup_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GOptionGroup_queueautoptr = o
  extension (v: GOptionGroup_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GOptionGroup_slistautoptr = Ptr[GSList]
object GOptionGroup_slistautoptr: 
  given _tag: Tag[GOptionGroup_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GOptionGroup_slistautoptr = o
  extension (v: GOptionGroup_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * GOptionParseFunc: : The active #GOptionContext : The group to which the function belongs
*/
opaque type GOptionParseFunc = CFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], gboolean]
object GOptionParseFunc: 
  given _tag: Tag[GOptionParseFunc] = Tag.materializeCFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GOptionParseFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], gboolean]): GOptionParseFunc = o
  extension (v: GOptionParseFunc)
    inline def value: CFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], gboolean] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GPathBuf_autoptr = Ptr[GPathBuf]
object GPathBuf_autoptr: 
  given _tag: Tag[GPathBuf_autoptr] = Tag.Ptr[GPathBuf](GPathBuf._tag)
  inline def apply(inline o: Ptr[GPathBuf]): GPathBuf_autoptr = o
  extension (v: GPathBuf_autoptr)
    inline def value: Ptr[GPathBuf] = v

opaque type GPathBuf_listautoptr = Ptr[GList]
object GPathBuf_listautoptr: 
  given _tag: Tag[GPathBuf_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GPathBuf_listautoptr = o
  extension (v: GPathBuf_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GPathBuf_queueautoptr = Ptr[GQueue]
object GPathBuf_queueautoptr: 
  given _tag: Tag[GPathBuf_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GPathBuf_queueautoptr = o
  extension (v: GPathBuf_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GPathBuf_slistautoptr = Ptr[GSList]
object GPathBuf_slistautoptr: 
  given _tag: Tag[GPathBuf_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GPathBuf_slistautoptr = o
  extension (v: GPathBuf_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GPatternSpec_autoptr = Ptr[GPatternSpec]
object GPatternSpec_autoptr: 
  given _tag: Tag[GPatternSpec_autoptr] = Tag.Ptr[GPatternSpec](GPatternSpec._tag)
  inline def apply(inline o: Ptr[GPatternSpec]): GPatternSpec_autoptr = o
  extension (v: GPatternSpec_autoptr)
    inline def value: Ptr[GPatternSpec] = v

opaque type GPatternSpec_listautoptr = Ptr[GList]
object GPatternSpec_listautoptr: 
  given _tag: Tag[GPatternSpec_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GPatternSpec_listautoptr = o
  extension (v: GPatternSpec_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GPatternSpec_queueautoptr = Ptr[GQueue]
object GPatternSpec_queueautoptr: 
  given _tag: Tag[GPatternSpec_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GPatternSpec_queueautoptr = o
  extension (v: GPatternSpec_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GPatternSpec_slistautoptr = Ptr[GSList]
object GPatternSpec_slistautoptr: 
  given _tag: Tag[GPatternSpec_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GPatternSpec_slistautoptr = o
  extension (v: GPatternSpec_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GPid = CInt
object GPid: 
  given _tag: Tag[GPid] = Tag.Int
  inline def apply(inline o: CInt): GPid = o
  extension (v: GPid)
    inline def value: CInt = v

/**
 * GPollFunc: : an array of #GPollFD elements : the number of elements in _: the maximum time to wait for an event of the file descriptors. A negative value indicates an infinite timeout.
*/
opaque type GPollFunc = CFuncPtr3[Ptr[GPollFD], guint, gint, gint]
object GPollFunc: 
  given _tag: Tag[GPollFunc] = Tag.materializeCFuncPtr3[Ptr[GPollFD], guint, gint, gint]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GPollFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GPollFD], guint, gint, gint]): GPollFunc = o
  extension (v: GPollFunc)
    inline def value: CFuncPtr3[Ptr[GPollFD], guint, gint, gint] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * GPrintFunc: : the message to output
*/
opaque type GPrintFunc = CFuncPtr1[Ptr[gchar], Unit]
object GPrintFunc: 
  given _tag: Tag[GPrintFunc] = Tag.materializeCFuncPtr1[Ptr[gchar], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GPrintFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[gchar], Unit]): GPrintFunc = o
  extension (v: GPrintFunc)
    inline def value: CFuncPtr1[Ptr[gchar], Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GPtrArray_autoptr = Ptr[GPtrArray]
object GPtrArray_autoptr: 
  given _tag: Tag[GPtrArray_autoptr] = Tag.Ptr[GPtrArray](GPtrArray._tag)
  inline def apply(inline o: Ptr[GPtrArray]): GPtrArray_autoptr = o
  extension (v: GPtrArray_autoptr)
    inline def value: Ptr[GPtrArray] = v

opaque type GPtrArray_listautoptr = Ptr[GList]
object GPtrArray_listautoptr: 
  given _tag: Tag[GPtrArray_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GPtrArray_listautoptr = o
  extension (v: GPtrArray_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GPtrArray_queueautoptr = Ptr[GQueue]
object GPtrArray_queueautoptr: 
  given _tag: Tag[GPtrArray_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GPtrArray_queueautoptr = o
  extension (v: GPtrArray_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GPtrArray_slistautoptr = Ptr[GSList]
object GPtrArray_slistautoptr: 
  given _tag: Tag[GPtrArray_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GPtrArray_slistautoptr = o
  extension (v: GPtrArray_slistautoptr)
    inline def value: Ptr[GSList] = v

type GQuark = guint32
object GQuark: 
  given _tag: Tag[GQuark] = guint32._tag
  inline def apply(inline o: guint32): GQuark = o
  extension (v: GQuark)
    inline def value: guint32 = v

opaque type GQueue_autoptr = Ptr[GQueue]
object GQueue_autoptr: 
  given _tag: Tag[GQueue_autoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GQueue_autoptr = o
  extension (v: GQueue_autoptr)
    inline def value: Ptr[GQueue] = v

opaque type GQueue_listautoptr = Ptr[GList]
object GQueue_listautoptr: 
  given _tag: Tag[GQueue_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GQueue_listautoptr = o
  extension (v: GQueue_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GQueue_queueautoptr = Ptr[GQueue]
object GQueue_queueautoptr: 
  given _tag: Tag[GQueue_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GQueue_queueautoptr = o
  extension (v: GQueue_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GQueue_slistautoptr = Ptr[GSList]
object GQueue_slistautoptr: 
  given _tag: Tag[GQueue_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GQueue_slistautoptr = o
  extension (v: GQueue_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * GRWLockReaderLocker:
*/
type GRWLockReaderLocker = Unit
object GRWLockReaderLocker: 
  given _tag: Tag[GRWLockReaderLocker] = Tag.Unit
  inline def apply(inline o: Unit): GRWLockReaderLocker = o
  extension (v: GRWLockReaderLocker)
    inline def value: Unit = v

opaque type GRWLockReaderLocker_autoptr = Ptr[GRWLockReaderLocker]
object GRWLockReaderLocker_autoptr: 
  given _tag: Tag[GRWLockReaderLocker_autoptr] = Tag.Ptr[GRWLockReaderLocker](GRWLockReaderLocker._tag)
  inline def apply(inline o: Ptr[GRWLockReaderLocker]): GRWLockReaderLocker_autoptr = o
  extension (v: GRWLockReaderLocker_autoptr)
    inline def value: Ptr[GRWLockReaderLocker] = v

opaque type GRWLockReaderLocker_listautoptr = Ptr[GList]
object GRWLockReaderLocker_listautoptr: 
  given _tag: Tag[GRWLockReaderLocker_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GRWLockReaderLocker_listautoptr = o
  extension (v: GRWLockReaderLocker_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GRWLockReaderLocker_queueautoptr = Ptr[GQueue]
object GRWLockReaderLocker_queueautoptr: 
  given _tag: Tag[GRWLockReaderLocker_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GRWLockReaderLocker_queueautoptr = o
  extension (v: GRWLockReaderLocker_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GRWLockReaderLocker_slistautoptr = Ptr[GSList]
object GRWLockReaderLocker_slistautoptr: 
  given _tag: Tag[GRWLockReaderLocker_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GRWLockReaderLocker_slistautoptr = o
  extension (v: GRWLockReaderLocker_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * GRWLockWriterLocker:
*/
type GRWLockWriterLocker = Unit
object GRWLockWriterLocker: 
  given _tag: Tag[GRWLockWriterLocker] = Tag.Unit
  inline def apply(inline o: Unit): GRWLockWriterLocker = o
  extension (v: GRWLockWriterLocker)
    inline def value: Unit = v

opaque type GRWLockWriterLocker_autoptr = Ptr[GRWLockWriterLocker]
object GRWLockWriterLocker_autoptr: 
  given _tag: Tag[GRWLockWriterLocker_autoptr] = Tag.Ptr[GRWLockWriterLocker](GRWLockWriterLocker._tag)
  inline def apply(inline o: Ptr[GRWLockWriterLocker]): GRWLockWriterLocker_autoptr = o
  extension (v: GRWLockWriterLocker_autoptr)
    inline def value: Ptr[GRWLockWriterLocker] = v

opaque type GRWLockWriterLocker_listautoptr = Ptr[GList]
object GRWLockWriterLocker_listautoptr: 
  given _tag: Tag[GRWLockWriterLocker_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GRWLockWriterLocker_listautoptr = o
  extension (v: GRWLockWriterLocker_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GRWLockWriterLocker_queueautoptr = Ptr[GQueue]
object GRWLockWriterLocker_queueautoptr: 
  given _tag: Tag[GRWLockWriterLocker_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GRWLockWriterLocker_queueautoptr = o
  extension (v: GRWLockWriterLocker_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GRWLockWriterLocker_slistautoptr = Ptr[GSList]
object GRWLockWriterLocker_slistautoptr: 
  given _tag: Tag[GRWLockWriterLocker_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GRWLockWriterLocker_slistautoptr = o
  extension (v: GRWLockWriterLocker_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GRand_autoptr = Ptr[GRand]
object GRand_autoptr: 
  given _tag: Tag[GRand_autoptr] = Tag.Ptr[GRand](GRand._tag)
  inline def apply(inline o: Ptr[GRand]): GRand_autoptr = o
  extension (v: GRand_autoptr)
    inline def value: Ptr[GRand] = v

opaque type GRand_listautoptr = Ptr[GList]
object GRand_listautoptr: 
  given _tag: Tag[GRand_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GRand_listautoptr = o
  extension (v: GRand_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GRand_queueautoptr = Ptr[GQueue]
object GRand_queueautoptr: 
  given _tag: Tag[GRand_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GRand_queueautoptr = o
  extension (v: GRand_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GRand_slistautoptr = Ptr[GSList]
object GRand_slistautoptr: 
  given _tag: Tag[GRand_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GRand_slistautoptr = o
  extension (v: GRand_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * GRecMutexLocker:
*/
type GRecMutexLocker = Unit
object GRecMutexLocker: 
  given _tag: Tag[GRecMutexLocker] = Tag.Unit
  inline def apply(inline o: Unit): GRecMutexLocker = o
  extension (v: GRecMutexLocker)
    inline def value: Unit = v

opaque type GRecMutexLocker_autoptr = Ptr[GRecMutexLocker]
object GRecMutexLocker_autoptr: 
  given _tag: Tag[GRecMutexLocker_autoptr] = Tag.Ptr[GRecMutexLocker](GRecMutexLocker._tag)
  inline def apply(inline o: Ptr[GRecMutexLocker]): GRecMutexLocker_autoptr = o
  extension (v: GRecMutexLocker_autoptr)
    inline def value: Ptr[GRecMutexLocker] = v

opaque type GRecMutexLocker_listautoptr = Ptr[GList]
object GRecMutexLocker_listautoptr: 
  given _tag: Tag[GRecMutexLocker_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GRecMutexLocker_listautoptr = o
  extension (v: GRecMutexLocker_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GRecMutexLocker_queueautoptr = Ptr[GQueue]
object GRecMutexLocker_queueautoptr: 
  given _tag: Tag[GRecMutexLocker_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GRecMutexLocker_queueautoptr = o
  extension (v: GRecMutexLocker_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GRecMutexLocker_slistautoptr = Ptr[GSList]
object GRecMutexLocker_slistautoptr: 
  given _tag: Tag[GRecMutexLocker_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GRecMutexLocker_slistautoptr = o
  extension (v: GRecMutexLocker_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * GRefString:
*/
opaque type GRefString = CChar
object GRefString: 
  given _tag: Tag[GRefString] = Tag.Byte
  inline def apply(inline o: CChar): GRefString = o
  extension (v: GRefString)
    inline def value: CChar = v

opaque type GRefString_autoptr = Ptr[GRefString]
object GRefString_autoptr: 
  given _tag: Tag[GRefString_autoptr] = Tag.Ptr[GRefString](GRefString._tag)
  inline def apply(inline o: Ptr[GRefString]): GRefString_autoptr = o
  extension (v: GRefString_autoptr)
    inline def value: Ptr[GRefString] = v

opaque type GRefString_listautoptr = Ptr[GList]
object GRefString_listautoptr: 
  given _tag: Tag[GRefString_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GRefString_listautoptr = o
  extension (v: GRefString_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GRefString_queueautoptr = Ptr[GQueue]
object GRefString_queueautoptr: 
  given _tag: Tag[GRefString_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GRefString_queueautoptr = o
  extension (v: GRefString_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GRefString_slistautoptr = Ptr[GSList]
object GRefString_slistautoptr: 
  given _tag: Tag[GRefString_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GRefString_slistautoptr = o
  extension (v: GRefString_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * GRegexEvalCallback: _info: the #GMatchInfo generated by the match. Use g_match_info_get_regex() and g_match_info_get_string() if you need the #GRegex or the matched string.
*/
opaque type GRegexEvalCallback = CFuncPtr3[Ptr[GMatchInfo], Ptr[GString], gpointer, gboolean]
object GRegexEvalCallback: 
  given _tag: Tag[GRegexEvalCallback] = Tag.materializeCFuncPtr3[Ptr[GMatchInfo], Ptr[GString], gpointer, gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GRegexEvalCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GMatchInfo], Ptr[GString], gpointer, gboolean]): GRegexEvalCallback = o
  extension (v: GRegexEvalCallback)
    inline def value: CFuncPtr3[Ptr[GMatchInfo], Ptr[GString], gpointer, gboolean] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GRegex_autoptr = Ptr[GRegex]
object GRegex_autoptr: 
  given _tag: Tag[GRegex_autoptr] = Tag.Ptr[GRegex](GRegex._tag)
  inline def apply(inline o: Ptr[GRegex]): GRegex_autoptr = o
  extension (v: GRegex_autoptr)
    inline def value: Ptr[GRegex] = v

opaque type GRegex_listautoptr = Ptr[GList]
object GRegex_listautoptr: 
  given _tag: Tag[GRegex_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GRegex_listautoptr = o
  extension (v: GRegex_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GRegex_queueautoptr = Ptr[GQueue]
object GRegex_queueautoptr: 
  given _tag: Tag[GRegex_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GRegex_queueautoptr = o
  extension (v: GRegex_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GRegex_slistautoptr = Ptr[GSList]
object GRegex_slistautoptr: 
  given _tag: Tag[GRegex_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GRegex_slistautoptr = o
  extension (v: GRegex_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GSList_autoptr = Ptr[GSList]
object GSList_autoptr: 
  given _tag: Tag[GSList_autoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSList_autoptr = o
  extension (v: GSList_autoptr)
    inline def value: Ptr[GSList] = v

opaque type GSList_listautoptr = Ptr[GList]
object GSList_listautoptr: 
  given _tag: Tag[GSList_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GSList_listautoptr = o
  extension (v: GSList_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GSList_queueautoptr = Ptr[GQueue]
object GSList_queueautoptr: 
  given _tag: Tag[GSList_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GSList_queueautoptr = o
  extension (v: GSList_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GSList_slistautoptr = Ptr[GSList]
object GSList_slistautoptr: 
  given _tag: Tag[GSList_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSList_slistautoptr = o
  extension (v: GSList_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GScannerMsgFunc = CFuncPtr3[Ptr[GScanner], Ptr[gchar], gboolean, Unit]
object GScannerMsgFunc: 
  given _tag: Tag[GScannerMsgFunc] = Tag.materializeCFuncPtr3[Ptr[GScanner], Ptr[gchar], gboolean, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GScannerMsgFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GScanner], Ptr[gchar], gboolean, Unit]): GScannerMsgFunc = o
  extension (v: GScannerMsgFunc)
    inline def value: CFuncPtr3[Ptr[GScanner], Ptr[gchar], gboolean, Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GScanner_autoptr = Ptr[GScanner]
object GScanner_autoptr: 
  given _tag: Tag[GScanner_autoptr] = Tag.Ptr[GScanner](GScanner._tag)
  inline def apply(inline o: Ptr[GScanner]): GScanner_autoptr = o
  extension (v: GScanner_autoptr)
    inline def value: Ptr[GScanner] = v

opaque type GScanner_listautoptr = Ptr[GList]
object GScanner_listautoptr: 
  given _tag: Tag[GScanner_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GScanner_listautoptr = o
  extension (v: GScanner_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GScanner_queueautoptr = Ptr[GQueue]
object GScanner_queueautoptr: 
  given _tag: Tag[GScanner_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GScanner_queueautoptr = o
  extension (v: GScanner_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GScanner_slistautoptr = Ptr[GSList]
object GScanner_slistautoptr: 
  given _tag: Tag[GScanner_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GScanner_slistautoptr = o
  extension (v: GScanner_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GSequenceIterCompareFunc = CFuncPtr3[Ptr[GSequenceIter], Ptr[GSequenceIter], gpointer, gint]
object GSequenceIterCompareFunc: 
  given _tag: Tag[GSequenceIterCompareFunc] = Tag.materializeCFuncPtr3[Ptr[GSequenceIter], Ptr[GSequenceIter], gpointer, gint]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GSequenceIterCompareFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GSequenceIter], Ptr[GSequenceIter], gpointer, gint]): GSequenceIterCompareFunc = o
  extension (v: GSequenceIterCompareFunc)
    inline def value: CFuncPtr3[Ptr[GSequenceIter], Ptr[GSequenceIter], gpointer, gint] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GSequence_autoptr = Ptr[GSequence]
object GSequence_autoptr: 
  given _tag: Tag[GSequence_autoptr] = Tag.Ptr[GSequence](GSequence._tag)
  inline def apply(inline o: Ptr[GSequence]): GSequence_autoptr = o
  extension (v: GSequence_autoptr)
    inline def value: Ptr[GSequence] = v

opaque type GSequence_listautoptr = Ptr[GList]
object GSequence_listautoptr: 
  given _tag: Tag[GSequence_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GSequence_listautoptr = o
  extension (v: GSequence_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GSequence_queueautoptr = Ptr[GQueue]
object GSequence_queueautoptr: 
  given _tag: Tag[GSequence_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GSequence_queueautoptr = o
  extension (v: GSequence_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GSequence_slistautoptr = Ptr[GSList]
object GSequence_slistautoptr: 
  given _tag: Tag[GSequence_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSequence_slistautoptr = o
  extension (v: GSequence_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * GSourceDisposeFunc: : #GSource that is currently being disposed
*/
opaque type GSourceDisposeFunc = CFuncPtr1[Ptr[GSource], Unit]
object GSourceDisposeFunc: 
  given _tag: Tag[GSourceDisposeFunc] = Tag.materializeCFuncPtr1[Ptr[GSource], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GSourceDisposeFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GSource], Unit]): GSourceDisposeFunc = o
  extension (v: GSourceDisposeFunc)
    inline def value: CFuncPtr1[Ptr[GSource], Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * GSourceDummyMarshal:
*/
opaque type GSourceDummyMarshal = CFuncPtr0[Unit]
object GSourceDummyMarshal: 
  given _tag: Tag[GSourceDummyMarshal] = Tag.materializeCFuncPtr0[Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GSourceDummyMarshal = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[Unit]): GSourceDummyMarshal = o
  extension (v: GSourceDummyMarshal)
    inline def value: CFuncPtr0[Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * GSourceFunc: _data: data passed to the function, set when the source was created with one of the above functions
*/
opaque type GSourceFunc = CFuncPtr1[gpointer, gboolean]
object GSourceFunc: 
  given _tag: Tag[GSourceFunc] = Tag.materializeCFuncPtr1[gpointer, gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GSourceFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[gpointer, gboolean]): GSourceFunc = o
  extension (v: GSourceFunc)
    inline def value: CFuncPtr1[gpointer, gboolean] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * GSourceOnceFunc: _data: data passed to the function, set when the source was created
*/
opaque type GSourceOnceFunc = CFuncPtr1[gpointer, Unit]
object GSourceOnceFunc: 
  given _tag: Tag[GSourceOnceFunc] = Tag.materializeCFuncPtr1[gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GSourceOnceFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[gpointer, Unit]): GSourceOnceFunc = o
  extension (v: GSourceOnceFunc)
    inline def value: CFuncPtr1[gpointer, Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GSource_autoptr = Ptr[GSource]
object GSource_autoptr: 
  given _tag: Tag[GSource_autoptr] = Tag.Ptr[GSource](GSource._tag)
  inline def apply(inline o: Ptr[GSource]): GSource_autoptr = o
  extension (v: GSource_autoptr)
    inline def value: Ptr[GSource] = v

opaque type GSource_listautoptr = Ptr[GList]
object GSource_listautoptr: 
  given _tag: Tag[GSource_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GSource_listautoptr = o
  extension (v: GSource_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GSource_queueautoptr = Ptr[GQueue]
object GSource_queueautoptr: 
  given _tag: Tag[GSource_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GSource_queueautoptr = o
  extension (v: GSource_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GSource_slistautoptr = Ptr[GSList]
object GSource_slistautoptr: 
  given _tag: Tag[GSource_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSource_slistautoptr = o
  extension (v: GSource_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * GSpawnChildSetupFunc:
*/
opaque type GSpawnChildSetupFunc = CFuncPtr1[gpointer, Unit]
object GSpawnChildSetupFunc: 
  given _tag: Tag[GSpawnChildSetupFunc] = Tag.materializeCFuncPtr1[gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GSpawnChildSetupFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[gpointer, Unit]): GSpawnChildSetupFunc = o
  extension (v: GSpawnChildSetupFunc)
    inline def value: CFuncPtr1[gpointer, Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GStringChunk_autoptr = Ptr[GStringChunk]
object GStringChunk_autoptr: 
  given _tag: Tag[GStringChunk_autoptr] = Tag.Ptr[GStringChunk](GStringChunk._tag)
  inline def apply(inline o: Ptr[GStringChunk]): GStringChunk_autoptr = o
  extension (v: GStringChunk_autoptr)
    inline def value: Ptr[GStringChunk] = v

opaque type GStringChunk_listautoptr = Ptr[GList]
object GStringChunk_listautoptr: 
  given _tag: Tag[GStringChunk_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GStringChunk_listautoptr = o
  extension (v: GStringChunk_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GStringChunk_queueautoptr = Ptr[GQueue]
object GStringChunk_queueautoptr: 
  given _tag: Tag[GStringChunk_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GStringChunk_queueautoptr = o
  extension (v: GStringChunk_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GStringChunk_slistautoptr = Ptr[GSList]
object GStringChunk_slistautoptr: 
  given _tag: Tag[GStringChunk_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GStringChunk_slistautoptr = o
  extension (v: GStringChunk_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GString_autoptr = Ptr[GString]
object GString_autoptr: 
  given _tag: Tag[GString_autoptr] = Tag.Ptr[GString](GString._tag)
  inline def apply(inline o: Ptr[GString]): GString_autoptr = o
  extension (v: GString_autoptr)
    inline def value: Ptr[GString] = v

opaque type GString_listautoptr = Ptr[GList]
object GString_listautoptr: 
  given _tag: Tag[GString_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GString_listautoptr = o
  extension (v: GString_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GString_queueautoptr = Ptr[GQueue]
object GString_queueautoptr: 
  given _tag: Tag[GString_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GString_queueautoptr = o
  extension (v: GString_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GString_slistautoptr = Ptr[GSList]
object GString_slistautoptr: 
  given _tag: Tag[GString_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GString_slistautoptr = o
  extension (v: GString_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GStrv = Ptr[Ptr[gchar]]
object GStrv: 
  given _tag: Tag[GStrv] = Tag.Ptr[Ptr[gchar]](Tag.Ptr[gchar](gchar._tag))
  inline def apply(inline o: Ptr[Ptr[gchar]]): GStrv = o
  extension (v: GStrv)
    inline def value: Ptr[Ptr[gchar]] = v

opaque type GStrvBuilder_autoptr = Ptr[GStrvBuilder]
object GStrvBuilder_autoptr: 
  given _tag: Tag[GStrvBuilder_autoptr] = Tag.Ptr[GStrvBuilder](GStrvBuilder._tag)
  inline def apply(inline o: Ptr[GStrvBuilder]): GStrvBuilder_autoptr = o
  extension (v: GStrvBuilder_autoptr)
    inline def value: Ptr[GStrvBuilder] = v

opaque type GStrvBuilder_listautoptr = Ptr[GList]
object GStrvBuilder_listautoptr: 
  given _tag: Tag[GStrvBuilder_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GStrvBuilder_listautoptr = o
  extension (v: GStrvBuilder_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GStrvBuilder_queueautoptr = Ptr[GQueue]
object GStrvBuilder_queueautoptr: 
  given _tag: Tag[GStrvBuilder_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GStrvBuilder_queueautoptr = o
  extension (v: GStrvBuilder_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GStrvBuilder_slistautoptr = Ptr[GSList]
object GStrvBuilder_slistautoptr: 
  given _tag: Tag[GStrvBuilder_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GStrvBuilder_slistautoptr = o
  extension (v: GStrvBuilder_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GTestDataFunc = CFuncPtr1[gconstpointer, Unit]
object GTestDataFunc: 
  given _tag: Tag[GTestDataFunc] = Tag.materializeCFuncPtr1[gconstpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GTestDataFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[gconstpointer, Unit]): GTestDataFunc = o
  extension (v: GTestDataFunc)
    inline def value: CFuncPtr1[gconstpointer, Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GTestFixtureFunc = CFuncPtr2[gpointer, gconstpointer, Unit]
object GTestFixtureFunc: 
  given _tag: Tag[GTestFixtureFunc] = Tag.materializeCFuncPtr2[gpointer, gconstpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GTestFixtureFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[gpointer, gconstpointer, Unit]): GTestFixtureFunc = o
  extension (v: GTestFixtureFunc)
    inline def value: CFuncPtr2[gpointer, gconstpointer, Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GTestFunc = CFuncPtr0[Unit]
object GTestFunc: 
  given _tag: Tag[GTestFunc] = Tag.materializeCFuncPtr0[Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GTestFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[Unit]): GTestFunc = o
  extension (v: GTestFunc)
    inline def value: CFuncPtr0[Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * GTestLogFatalFunc: _domain: the log domain of the message _level: the log level of the message (including the fatal and recursion flags) : the message to process _data: user data, set in g_test_log_set_fatal_handler()
*/
opaque type GTestLogFatalFunc = CFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, gboolean]
object GTestLogFatalFunc: 
  given _tag: Tag[GTestLogFatalFunc] = Tag.materializeCFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GTestLogFatalFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, gboolean]): GTestLogFatalFunc = o
  extension (v: GTestLogFatalFunc)
    inline def value: CFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, gboolean] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GThreadFunc = CFuncPtr1[gpointer, gpointer]
object GThreadFunc: 
  given _tag: Tag[GThreadFunc] = Tag.materializeCFuncPtr1[gpointer, gpointer]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GThreadFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[gpointer, gpointer]): GThreadFunc = o
  extension (v: GThreadFunc)
    inline def value: CFuncPtr1[gpointer, gpointer] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GThread_autoptr = Ptr[GThread]
object GThread_autoptr: 
  given _tag: Tag[GThread_autoptr] = Tag.Ptr[GThread](GThread._tag)
  inline def apply(inline o: Ptr[GThread]): GThread_autoptr = o
  extension (v: GThread_autoptr)
    inline def value: Ptr[GThread] = v

opaque type GThread_listautoptr = Ptr[GList]
object GThread_listautoptr: 
  given _tag: Tag[GThread_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GThread_listautoptr = o
  extension (v: GThread_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GThread_queueautoptr = Ptr[GQueue]
object GThread_queueautoptr: 
  given _tag: Tag[GThread_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GThread_queueautoptr = o
  extension (v: GThread_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GThread_slistautoptr = Ptr[GSList]
object GThread_slistautoptr: 
  given _tag: Tag[GThread_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GThread_slistautoptr = o
  extension (v: GThread_slistautoptr)
    inline def value: Ptr[GSList] = v

type GTime = gint32
object GTime: 
  given _tag: Tag[GTime] = gint32._tag
  inline def apply(inline o: gint32): GTime = o
  extension (v: GTime)
    inline def value: gint32 = v

/**
 * GTimeSpan:
*/
type GTimeSpan = gint64
object GTimeSpan: 
  given _tag: Tag[GTimeSpan] = gint64._tag
  inline def apply(inline o: gint64): GTimeSpan = o
  extension (v: GTimeSpan)
    inline def value: gint64 = v

opaque type GTimeZone_autoptr = Ptr[GTimeZone]
object GTimeZone_autoptr: 
  given _tag: Tag[GTimeZone_autoptr] = Tag.Ptr[GTimeZone](GTimeZone._tag)
  inline def apply(inline o: Ptr[GTimeZone]): GTimeZone_autoptr = o
  extension (v: GTimeZone_autoptr)
    inline def value: Ptr[GTimeZone] = v

opaque type GTimeZone_listautoptr = Ptr[GList]
object GTimeZone_listautoptr: 
  given _tag: Tag[GTimeZone_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GTimeZone_listautoptr = o
  extension (v: GTimeZone_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GTimeZone_queueautoptr = Ptr[GQueue]
object GTimeZone_queueautoptr: 
  given _tag: Tag[GTimeZone_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GTimeZone_queueautoptr = o
  extension (v: GTimeZone_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GTimeZone_slistautoptr = Ptr[GSList]
object GTimeZone_slistautoptr: 
  given _tag: Tag[GTimeZone_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GTimeZone_slistautoptr = o
  extension (v: GTimeZone_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GTimer_autoptr = Ptr[GTimer]
object GTimer_autoptr: 
  given _tag: Tag[GTimer_autoptr] = Tag.Ptr[GTimer](GTimer._tag)
  inline def apply(inline o: Ptr[GTimer]): GTimer_autoptr = o
  extension (v: GTimer_autoptr)
    inline def value: Ptr[GTimer] = v

opaque type GTimer_listautoptr = Ptr[GList]
object GTimer_listautoptr: 
  given _tag: Tag[GTimer_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GTimer_listautoptr = o
  extension (v: GTimer_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GTimer_queueautoptr = Ptr[GQueue]
object GTimer_queueautoptr: 
  given _tag: Tag[GTimer_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GTimer_queueautoptr = o
  extension (v: GTimer_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GTimer_slistautoptr = Ptr[GSList]
object GTimer_slistautoptr: 
  given _tag: Tag[GTimer_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GTimer_slistautoptr = o
  extension (v: GTimer_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * GTranslateFunc: : the untranslated string
*/
opaque type GTranslateFunc = CFuncPtr2[Ptr[gchar], gpointer, Ptr[gchar]]
object GTranslateFunc: 
  given _tag: Tag[GTranslateFunc] = Tag.materializeCFuncPtr2[Ptr[gchar], gpointer, Ptr[gchar]]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GTranslateFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[gchar], gpointer, Ptr[gchar]]): GTranslateFunc = o
  extension (v: GTranslateFunc)
    inline def value: CFuncPtr2[Ptr[gchar], gpointer, Ptr[gchar]] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GTraverseFunc = CFuncPtr3[gpointer, gpointer, gpointer, gboolean]
object GTraverseFunc: 
  given _tag: Tag[GTraverseFunc] = Tag.materializeCFuncPtr3[gpointer, gpointer, gpointer, gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GTraverseFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[gpointer, gpointer, gpointer, gboolean]): GTraverseFunc = o
  extension (v: GTraverseFunc)
    inline def value: CFuncPtr3[gpointer, gpointer, gpointer, gboolean] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * GTraverseNodeFunc: : a #GTreeNode
*/
opaque type GTraverseNodeFunc = CFuncPtr2[Ptr[GTreeNode], gpointer, gboolean]
object GTraverseNodeFunc: 
  given _tag: Tag[GTraverseNodeFunc] = Tag.materializeCFuncPtr2[Ptr[GTreeNode], gpointer, gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GTraverseNodeFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GTreeNode], gpointer, gboolean]): GTraverseNodeFunc = o
  extension (v: GTraverseNodeFunc)
    inline def value: CFuncPtr2[Ptr[GTreeNode], gpointer, gboolean] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GTree_autoptr = Ptr[GTree]
object GTree_autoptr: 
  given _tag: Tag[GTree_autoptr] = Tag.Ptr[GTree](GTree._tag)
  inline def apply(inline o: Ptr[GTree]): GTree_autoptr = o
  extension (v: GTree_autoptr)
    inline def value: Ptr[GTree] = v

opaque type GTree_listautoptr = Ptr[GList]
object GTree_listautoptr: 
  given _tag: Tag[GTree_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GTree_listautoptr = o
  extension (v: GTree_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GTree_queueautoptr = Ptr[GQueue]
object GTree_queueautoptr: 
  given _tag: Tag[GTree_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GTree_queueautoptr = o
  extension (v: GTree_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GTree_slistautoptr = Ptr[GSList]
object GTree_slistautoptr: 
  given _tag: Tag[GTree_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GTree_slistautoptr = o
  extension (v: GTree_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GUri_autoptr = Ptr[GUri]
object GUri_autoptr: 
  given _tag: Tag[GUri_autoptr] = Tag.Ptr[GUri](GUri._tag)
  inline def apply(inline o: Ptr[GUri]): GUri_autoptr = o
  extension (v: GUri_autoptr)
    inline def value: Ptr[GUri] = v

opaque type GUri_listautoptr = Ptr[GList]
object GUri_listautoptr: 
  given _tag: Tag[GUri_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GUri_listautoptr = o
  extension (v: GUri_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GUri_queueautoptr = Ptr[GQueue]
object GUri_queueautoptr: 
  given _tag: Tag[GUri_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GUri_queueautoptr = o
  extension (v: GUri_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GUri_slistautoptr = Ptr[GSList]
object GUri_slistautoptr: 
  given _tag: Tag[GUri_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GUri_slistautoptr = o
  extension (v: GUri_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GVariantBuilder_autoptr = Ptr[GVariantBuilder]
object GVariantBuilder_autoptr: 
  given _tag: Tag[GVariantBuilder_autoptr] = Tag.Ptr[GVariantBuilder](GVariantBuilder._tag)
  inline def apply(inline o: Ptr[GVariantBuilder]): GVariantBuilder_autoptr = o
  extension (v: GVariantBuilder_autoptr)
    inline def value: Ptr[GVariantBuilder] = v

opaque type GVariantBuilder_listautoptr = Ptr[GList]
object GVariantBuilder_listautoptr: 
  given _tag: Tag[GVariantBuilder_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GVariantBuilder_listautoptr = o
  extension (v: GVariantBuilder_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GVariantBuilder_queueautoptr = Ptr[GQueue]
object GVariantBuilder_queueautoptr: 
  given _tag: Tag[GVariantBuilder_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GVariantBuilder_queueautoptr = o
  extension (v: GVariantBuilder_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GVariantBuilder_slistautoptr = Ptr[GSList]
object GVariantBuilder_slistautoptr: 
  given _tag: Tag[GVariantBuilder_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GVariantBuilder_slistautoptr = o
  extension (v: GVariantBuilder_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GVariantDict_autoptr = Ptr[GVariantDict]
object GVariantDict_autoptr: 
  given _tag: Tag[GVariantDict_autoptr] = Tag.Ptr[GVariantDict](GVariantDict._tag)
  inline def apply(inline o: Ptr[GVariantDict]): GVariantDict_autoptr = o
  extension (v: GVariantDict_autoptr)
    inline def value: Ptr[GVariantDict] = v

opaque type GVariantDict_listautoptr = Ptr[GList]
object GVariantDict_listautoptr: 
  given _tag: Tag[GVariantDict_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GVariantDict_listautoptr = o
  extension (v: GVariantDict_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GVariantDict_queueautoptr = Ptr[GQueue]
object GVariantDict_queueautoptr: 
  given _tag: Tag[GVariantDict_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GVariantDict_queueautoptr = o
  extension (v: GVariantDict_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GVariantDict_slistautoptr = Ptr[GSList]
object GVariantDict_slistautoptr: 
  given _tag: Tag[GVariantDict_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GVariantDict_slistautoptr = o
  extension (v: GVariantDict_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GVariantIter_autoptr = Ptr[GVariantIter]
object GVariantIter_autoptr: 
  given _tag: Tag[GVariantIter_autoptr] = Tag.Ptr[GVariantIter](GVariantIter._tag)
  inline def apply(inline o: Ptr[GVariantIter]): GVariantIter_autoptr = o
  extension (v: GVariantIter_autoptr)
    inline def value: Ptr[GVariantIter] = v

opaque type GVariantIter_listautoptr = Ptr[GList]
object GVariantIter_listautoptr: 
  given _tag: Tag[GVariantIter_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GVariantIter_listautoptr = o
  extension (v: GVariantIter_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GVariantIter_queueautoptr = Ptr[GQueue]
object GVariantIter_queueautoptr: 
  given _tag: Tag[GVariantIter_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GVariantIter_queueautoptr = o
  extension (v: GVariantIter_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GVariantIter_slistautoptr = Ptr[GSList]
object GVariantIter_slistautoptr: 
  given _tag: Tag[GVariantIter_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GVariantIter_slistautoptr = o
  extension (v: GVariantIter_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GVariantType_autoptr = Ptr[GVariantType]
object GVariantType_autoptr: 
  given _tag: Tag[GVariantType_autoptr] = Tag.Ptr[GVariantType](GVariantType._tag)
  inline def apply(inline o: Ptr[GVariantType]): GVariantType_autoptr = o
  extension (v: GVariantType_autoptr)
    inline def value: Ptr[GVariantType] = v

opaque type GVariantType_listautoptr = Ptr[GList]
object GVariantType_listautoptr: 
  given _tag: Tag[GVariantType_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GVariantType_listautoptr = o
  extension (v: GVariantType_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GVariantType_queueautoptr = Ptr[GQueue]
object GVariantType_queueautoptr: 
  given _tag: Tag[GVariantType_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GVariantType_queueautoptr = o
  extension (v: GVariantType_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GVariantType_slistautoptr = Ptr[GSList]
object GVariantType_slistautoptr: 
  given _tag: Tag[GVariantType_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GVariantType_slistautoptr = o
  extension (v: GVariantType_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GVariant_autoptr = Ptr[GVariant]
object GVariant_autoptr: 
  given _tag: Tag[GVariant_autoptr] = Tag.Ptr[GVariant](GVariant._tag)
  inline def apply(inline o: Ptr[GVariant]): GVariant_autoptr = o
  extension (v: GVariant_autoptr)
    inline def value: Ptr[GVariant] = v

opaque type GVariant_listautoptr = Ptr[GList]
object GVariant_listautoptr: 
  given _tag: Tag[GVariant_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GVariant_listautoptr = o
  extension (v: GVariant_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GVariant_queueautoptr = Ptr[GQueue]
object GVariant_queueautoptr: 
  given _tag: Tag[GVariant_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GVariant_queueautoptr = o
  extension (v: GVariant_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GVariant_slistautoptr = Ptr[GSList]
object GVariant_slistautoptr: 
  given _tag: Tag[GVariant_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GVariant_slistautoptr = o
  extension (v: GVariant_slistautoptr)
    inline def value: Ptr[GSList] = v

/**
 * GVoidFunc:
*/
opaque type GVoidFunc = CFuncPtr0[Unit]
object GVoidFunc: 
  given _tag: Tag[GVoidFunc] = Tag.materializeCFuncPtr0[Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GVoidFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[Unit]): GVoidFunc = o
  extension (v: GVoidFunc)
    inline def value: CFuncPtr0[Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

type gatomicrefcount = gint
object gatomicrefcount: 
  given _tag: Tag[gatomicrefcount] = gint._tag
  inline def apply(inline o: gint): gatomicrefcount = o
  extension (v: gatomicrefcount)
    inline def value: gint = v

type gboolean = gint
object gboolean: 
  given _tag: Tag[gboolean] = gint._tag
  inline def apply(inline o: gint): gboolean = o
  extension (v: gboolean)
    inline def value: gint = v

opaque type gchar = CChar
object gchar: 
  given _tag: Tag[gchar] = Tag.Byte
  inline def apply(inline o: CChar): gchar = o
  extension (v: gchar)
    inline def value: CChar = v

opaque type gconstpointer = Ptr[Byte]
object gconstpointer: 
  given _tag: Tag[gconstpointer] = Tag.Ptr(Tag.Byte)
  inline def apply(inline o: Ptr[Byte]): gconstpointer = o
  extension (v: gconstpointer)
    inline def value: Ptr[Byte] = v

opaque type gdouble = Double
object gdouble: 
  given _tag: Tag[gdouble] = Tag.Double
  inline def apply(inline o: Double): gdouble = o
  extension (v: gdouble)
    inline def value: Double = v

opaque type gfloat = Float
object gfloat: 
  given _tag: Tag[gfloat] = Tag.Float
  inline def apply(inline o: Float): gfloat = o
  extension (v: gfloat)
    inline def value: Float = v

opaque type gint = CInt
object gint: 
  given _tag: Tag[gint] = Tag.Int
  inline def apply(inline o: CInt): gint = o
  extension (v: gint)
    inline def value: CInt = v

opaque type gint16 = CShort
object gint16: 
  given _tag: Tag[gint16] = Tag.Short
  inline def apply(inline o: CShort): gint16 = o
  extension (v: gint16)
    inline def value: CShort = v

opaque type gint32 = CInt
object gint32: 
  given _tag: Tag[gint32] = Tag.Int
  inline def apply(inline o: CInt): gint32 = o
  extension (v: gint32)
    inline def value: CInt = v

opaque type gint64 = CLongInt
object gint64: 
  given _tag: Tag[gint64] = Tag.Long
  inline def apply(inline o: CLongInt): gint64 = o
  extension (v: gint64)
    inline def value: CLongInt = v

opaque type gint8 = CChar
object gint8: 
  given _tag: Tag[gint8] = Tag.Byte
  inline def apply(inline o: CChar): gint8 = o
  extension (v: gint8)
    inline def value: CChar = v

opaque type gintptr = CLongInt
object gintptr: 
  given _tag: Tag[gintptr] = Tag.Long
  inline def apply(inline o: CLongInt): gintptr = o
  extension (v: gintptr)
    inline def value: CLongInt = v

opaque type glong = CLongInt
object glong: 
  given _tag: Tag[glong] = Tag.Long
  inline def apply(inline o: CLongInt): glong = o
  extension (v: glong)
    inline def value: CLongInt = v

type goffset = gint64
object goffset: 
  given _tag: Tag[goffset] = gint64._tag
  inline def apply(inline o: gint64): goffset = o
  extension (v: goffset)
    inline def value: gint64 = v

opaque type gpointer = Ptr[Byte]
object gpointer: 
  given _tag: Tag[gpointer] = Tag.Ptr(Tag.Byte)
  inline def apply(inline o: Ptr[Byte]): gpointer = o
  extension (v: gpointer)
    inline def value: Ptr[Byte] = v

type grefcount = gint
object grefcount: 
  given _tag: Tag[grefcount] = gint._tag
  inline def apply(inline o: gint): grefcount = o
  extension (v: grefcount)
    inline def value: gint = v

opaque type gshort = CShort
object gshort: 
  given _tag: Tag[gshort] = Tag.Short
  inline def apply(inline o: CShort): gshort = o
  extension (v: gshort)
    inline def value: CShort = v

opaque type gsize = CUnsignedLongInt
object gsize: 
  given _tag: Tag[gsize] = Tag.ULong
  inline def apply(inline o: CUnsignedLongInt): gsize = o
  extension (v: gsize)
    inline def value: CUnsignedLongInt = v

opaque type gssize = CLongInt
object gssize: 
  given _tag: Tag[gssize] = Tag.Long
  inline def apply(inline o: CLongInt): gssize = o
  extension (v: gssize)
    inline def value: CLongInt = v

opaque type guchar = CUnsignedChar
object guchar: 
  given _tag: Tag[guchar] = Tag.UByte
  inline def apply(inline o: CUnsignedChar): guchar = o
  extension (v: guchar)
    inline def value: CUnsignedChar = v

opaque type guint = CUnsignedInt
object guint: 
  given _tag: Tag[guint] = Tag.UInt
  inline def apply(inline o: CUnsignedInt): guint = o
  extension (v: guint)
    inline def value: CUnsignedInt = v

opaque type guint16 = CUnsignedShort
object guint16: 
  given _tag: Tag[guint16] = Tag.UShort
  inline def apply(inline o: CUnsignedShort): guint16 = o
  extension (v: guint16)
    inline def value: CUnsignedShort = v

opaque type guint32 = CUnsignedInt
object guint32: 
  given _tag: Tag[guint32] = Tag.UInt
  inline def apply(inline o: CUnsignedInt): guint32 = o
  extension (v: guint32)
    inline def value: CUnsignedInt = v

opaque type guint64 = CUnsignedLongInt
object guint64: 
  given _tag: Tag[guint64] = Tag.ULong
  inline def apply(inline o: CUnsignedLongInt): guint64 = o
  extension (v: guint64)
    inline def value: CUnsignedLongInt = v

opaque type guint8 = CUnsignedChar
object guint8: 
  given _tag: Tag[guint8] = Tag.UByte
  inline def apply(inline o: CUnsignedChar): guint8 = o
  extension (v: guint8)
    inline def value: CUnsignedChar = v

opaque type guintptr = CUnsignedLongInt
object guintptr: 
  given _tag: Tag[guintptr] = Tag.ULong
  inline def apply(inline o: CUnsignedLongInt): guintptr = o
  extension (v: guintptr)
    inline def value: CUnsignedLongInt = v

opaque type gulong = CUnsignedLongInt
object gulong: 
  given _tag: Tag[gulong] = Tag.ULong
  inline def apply(inline o: CUnsignedLongInt): gulong = o
  extension (v: gulong)
    inline def value: CUnsignedLongInt = v

/**
 * gunichar:
*/
type gunichar = guint32
object gunichar: 
  given _tag: Tag[gunichar] = guint32._tag
  inline def apply(inline o: guint32): gunichar = o
  extension (v: gunichar)
    inline def value: guint32 = v

/**
 * gunichar2:
*/
type gunichar2 = guint16
object gunichar2: 
  given _tag: Tag[gunichar2] = guint16._tag
  inline def apply(inline o: guint16): gunichar2 = o
  extension (v: gunichar2)
    inline def value: guint16 = v

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

type va_list = unsafe.CVarArgList
object va_list: 
  val _tag: Tag[va_list] = summon[Tag[unsafe.CVarArgList]]
  inline def apply(inline o: unsafe.CVarArgList): va_list = o
  extension (v: va_list)
    inline def value: unsafe.CVarArgList = v