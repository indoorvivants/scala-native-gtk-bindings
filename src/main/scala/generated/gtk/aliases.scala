package gtk
package aliases

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

import _root_.gtk.enumerations.*
import _root_.gtk.aliases.*
import _root_.gtk.structs.*
import _root_.gtk.unions.*

type FILE = libc.stdio.FILE
object FILE: 
  val _tag: Tag[FILE] = summon[Tag[libc.stdio.FILE]]
  inline def apply(inline o: libc.stdio.FILE): FILE = o
  extension (v: FILE)
    inline def value: libc.stdio.FILE = v

opaque type GActionMap_autoptr = Ptr[GActionMap]
object GActionMap_autoptr: 
  given _tag: Tag[GActionMap_autoptr] = Tag.Ptr[GActionMap](GActionMap._tag)
  inline def apply(inline o: Ptr[GActionMap]): GActionMap_autoptr = o
  extension (v: GActionMap_autoptr)
    inline def value: Ptr[GActionMap] = v

opaque type GActionMap_listautoptr = Ptr[GList]
object GActionMap_listautoptr: 
  given _tag: Tag[GActionMap_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GActionMap_listautoptr = o
  extension (v: GActionMap_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GActionMap_queueautoptr = Ptr[GQueue]
object GActionMap_queueautoptr: 
  given _tag: Tag[GActionMap_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GActionMap_queueautoptr = o
  extension (v: GActionMap_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GActionMap_slistautoptr = Ptr[GSList]
object GActionMap_slistautoptr: 
  given _tag: Tag[GActionMap_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GActionMap_slistautoptr = o
  extension (v: GActionMap_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GAction_autoptr = Ptr[GAction]
object GAction_autoptr: 
  given _tag: Tag[GAction_autoptr] = Tag.Ptr[GAction](GAction._tag)
  inline def apply(inline o: Ptr[GAction]): GAction_autoptr = o
  extension (v: GAction_autoptr)
    inline def value: Ptr[GAction] = v

opaque type GAction_listautoptr = Ptr[GList]
object GAction_listautoptr: 
  given _tag: Tag[GAction_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GAction_listautoptr = o
  extension (v: GAction_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GAction_queueautoptr = Ptr[GQueue]
object GAction_queueautoptr: 
  given _tag: Tag[GAction_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GAction_queueautoptr = o
  extension (v: GAction_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GAction_slistautoptr = Ptr[GSList]
object GAction_slistautoptr: 
  given _tag: Tag[GAction_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GAction_slistautoptr = o
  extension (v: GAction_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GAppInfoMonitor_autoptr = Ptr[GAppInfoMonitor]
object GAppInfoMonitor_autoptr: 
  given _tag: Tag[GAppInfoMonitor_autoptr] = Tag.Ptr[GAppInfoMonitor](GAppInfoMonitor._tag)
  inline def apply(inline o: Ptr[GAppInfoMonitor]): GAppInfoMonitor_autoptr = o
  extension (v: GAppInfoMonitor_autoptr)
    inline def value: Ptr[GAppInfoMonitor] = v

opaque type GAppInfoMonitor_listautoptr = Ptr[GList]
object GAppInfoMonitor_listautoptr: 
  given _tag: Tag[GAppInfoMonitor_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GAppInfoMonitor_listautoptr = o
  extension (v: GAppInfoMonitor_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GAppInfoMonitor_queueautoptr = Ptr[GQueue]
object GAppInfoMonitor_queueautoptr: 
  given _tag: Tag[GAppInfoMonitor_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GAppInfoMonitor_queueautoptr = o
  extension (v: GAppInfoMonitor_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GAppInfoMonitor_slistautoptr = Ptr[GSList]
object GAppInfoMonitor_slistautoptr: 
  given _tag: Tag[GAppInfoMonitor_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GAppInfoMonitor_slistautoptr = o
  extension (v: GAppInfoMonitor_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GAppInfo_autoptr = Ptr[GAppInfo]
object GAppInfo_autoptr: 
  given _tag: Tag[GAppInfo_autoptr] = Tag.Ptr[GAppInfo](GAppInfo._tag)
  inline def apply(inline o: Ptr[GAppInfo]): GAppInfo_autoptr = o
  extension (v: GAppInfo_autoptr)
    inline def value: Ptr[GAppInfo] = v

opaque type GAppInfo_listautoptr = Ptr[GList]
object GAppInfo_listautoptr: 
  given _tag: Tag[GAppInfo_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GAppInfo_listautoptr = o
  extension (v: GAppInfo_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GAppInfo_queueautoptr = Ptr[GQueue]
object GAppInfo_queueautoptr: 
  given _tag: Tag[GAppInfo_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GAppInfo_queueautoptr = o
  extension (v: GAppInfo_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GAppInfo_slistautoptr = Ptr[GSList]
object GAppInfo_slistautoptr: 
  given _tag: Tag[GAppInfo_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GAppInfo_slistautoptr = o
  extension (v: GAppInfo_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GAppLaunchContext_autoptr = Ptr[GAppLaunchContext]
object GAppLaunchContext_autoptr: 
  given _tag: Tag[GAppLaunchContext_autoptr] = Tag.Ptr[GAppLaunchContext](GAppLaunchContext._tag)
  inline def apply(inline o: Ptr[GAppLaunchContext]): GAppLaunchContext_autoptr = o
  extension (v: GAppLaunchContext_autoptr)
    inline def value: Ptr[GAppLaunchContext] = v

opaque type GAppLaunchContext_listautoptr = Ptr[GList]
object GAppLaunchContext_listautoptr: 
  given _tag: Tag[GAppLaunchContext_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GAppLaunchContext_listautoptr = o
  extension (v: GAppLaunchContext_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GAppLaunchContext_queueautoptr = Ptr[GQueue]
object GAppLaunchContext_queueautoptr: 
  given _tag: Tag[GAppLaunchContext_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GAppLaunchContext_queueautoptr = o
  extension (v: GAppLaunchContext_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GAppLaunchContext_slistautoptr = Ptr[GSList]
object GAppLaunchContext_slistautoptr: 
  given _tag: Tag[GAppLaunchContext_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GAppLaunchContext_slistautoptr = o
  extension (v: GAppLaunchContext_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GApplicationCommandLine_autoptr = Ptr[GApplicationCommandLine]
object GApplicationCommandLine_autoptr: 
  given _tag: Tag[GApplicationCommandLine_autoptr] = Tag.Ptr[GApplicationCommandLine](GApplicationCommandLine._tag)
  inline def apply(inline o: Ptr[GApplicationCommandLine]): GApplicationCommandLine_autoptr = o
  extension (v: GApplicationCommandLine_autoptr)
    inline def value: Ptr[GApplicationCommandLine] = v

opaque type GApplicationCommandLine_listautoptr = Ptr[GList]
object GApplicationCommandLine_listautoptr: 
  given _tag: Tag[GApplicationCommandLine_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GApplicationCommandLine_listautoptr = o
  extension (v: GApplicationCommandLine_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GApplicationCommandLine_queueautoptr = Ptr[GQueue]
object GApplicationCommandLine_queueautoptr: 
  given _tag: Tag[GApplicationCommandLine_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GApplicationCommandLine_queueautoptr = o
  extension (v: GApplicationCommandLine_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GApplicationCommandLine_slistautoptr = Ptr[GSList]
object GApplicationCommandLine_slistautoptr: 
  given _tag: Tag[GApplicationCommandLine_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GApplicationCommandLine_slistautoptr = o
  extension (v: GApplicationCommandLine_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GApplication_autoptr = Ptr[GApplication]
object GApplication_autoptr: 
  given _tag: Tag[GApplication_autoptr] = Tag.Ptr[GApplication](GApplication._tag)
  inline def apply(inline o: Ptr[GApplication]): GApplication_autoptr = o
  extension (v: GApplication_autoptr)
    inline def value: Ptr[GApplication] = v

opaque type GApplication_listautoptr = Ptr[GList]
object GApplication_listautoptr: 
  given _tag: Tag[GApplication_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GApplication_listautoptr = o
  extension (v: GApplication_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GApplication_queueautoptr = Ptr[GQueue]
object GApplication_queueautoptr: 
  given _tag: Tag[GApplication_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GApplication_queueautoptr = o
  extension (v: GApplication_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GApplication_slistautoptr = Ptr[GSList]
object GApplication_slistautoptr: 
  given _tag: Tag[GApplication_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GApplication_slistautoptr = o
  extension (v: GApplication_slistautoptr)
    inline def value: Ptr[GSList] = v

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

opaque type GAsyncInitable_autoptr = Ptr[GAsyncInitable]
object GAsyncInitable_autoptr: 
  given _tag: Tag[GAsyncInitable_autoptr] = Tag.Ptr[GAsyncInitable](GAsyncInitable._tag)
  inline def apply(inline o: Ptr[GAsyncInitable]): GAsyncInitable_autoptr = o
  extension (v: GAsyncInitable_autoptr)
    inline def value: Ptr[GAsyncInitable] = v

opaque type GAsyncInitable_listautoptr = Ptr[GList]
object GAsyncInitable_listautoptr: 
  given _tag: Tag[GAsyncInitable_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GAsyncInitable_listautoptr = o
  extension (v: GAsyncInitable_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GAsyncInitable_queueautoptr = Ptr[GQueue]
object GAsyncInitable_queueautoptr: 
  given _tag: Tag[GAsyncInitable_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GAsyncInitable_queueautoptr = o
  extension (v: GAsyncInitable_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GAsyncInitable_slistautoptr = Ptr[GSList]
object GAsyncInitable_slistautoptr: 
  given _tag: Tag[GAsyncInitable_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GAsyncInitable_slistautoptr = o
  extension (v: GAsyncInitable_slistautoptr)
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

opaque type GAsyncReadyCallback = CFuncPtr3[Ptr[GObject], Ptr[GAsyncResult], gpointer, Unit]
object GAsyncReadyCallback: 
  given _tag: Tag[GAsyncReadyCallback] = Tag.materializeCFuncPtr3[Ptr[GObject], Ptr[GAsyncResult], gpointer, Unit]
  inline def apply(inline o: CFuncPtr3[Ptr[GObject], Ptr[GAsyncResult], gpointer, Unit]): GAsyncReadyCallback = o
  extension (v: GAsyncReadyCallback)
    inline def value: CFuncPtr3[Ptr[GObject], Ptr[GAsyncResult], gpointer, Unit] = v

opaque type GAsyncResult_autoptr = Ptr[GAsyncResult]
object GAsyncResult_autoptr: 
  given _tag: Tag[GAsyncResult_autoptr] = Tag.Ptr[GAsyncResult](GAsyncResult._tag)
  inline def apply(inline o: Ptr[GAsyncResult]): GAsyncResult_autoptr = o
  extension (v: GAsyncResult_autoptr)
    inline def value: Ptr[GAsyncResult] = v

opaque type GAsyncResult_listautoptr = Ptr[GList]
object GAsyncResult_listautoptr: 
  given _tag: Tag[GAsyncResult_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GAsyncResult_listautoptr = o
  extension (v: GAsyncResult_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GAsyncResult_queueautoptr = Ptr[GQueue]
object GAsyncResult_queueautoptr: 
  given _tag: Tag[GAsyncResult_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GAsyncResult_queueautoptr = o
  extension (v: GAsyncResult_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GAsyncResult_slistautoptr = Ptr[GSList]
object GAsyncResult_slistautoptr: 
  given _tag: Tag[GAsyncResult_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GAsyncResult_slistautoptr = o
  extension (v: GAsyncResult_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GBaseFinalizeFunc = CFuncPtr1[gpointer, Unit]
object GBaseFinalizeFunc: 
  given _tag: Tag[GBaseFinalizeFunc] = Tag.materializeCFuncPtr1[gpointer, Unit]
  inline def apply(inline o: CFuncPtr1[gpointer, Unit]): GBaseFinalizeFunc = o
  extension (v: GBaseFinalizeFunc)
    inline def value: CFuncPtr1[gpointer, Unit] = v

opaque type GBaseInitFunc = CFuncPtr1[gpointer, Unit]
object GBaseInitFunc: 
  given _tag: Tag[GBaseInitFunc] = Tag.materializeCFuncPtr1[gpointer, Unit]
  inline def apply(inline o: CFuncPtr1[gpointer, Unit]): GBaseInitFunc = o
  extension (v: GBaseInitFunc)
    inline def value: CFuncPtr1[gpointer, Unit] = v

opaque type GBindingTransformFunc = CFuncPtr4[Ptr[GBinding], Ptr[GValue], Ptr[GValue], gpointer, gboolean]
object GBindingTransformFunc: 
  given _tag: Tag[GBindingTransformFunc] = Tag.materializeCFuncPtr4[Ptr[GBinding], Ptr[GValue], Ptr[GValue], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr4[Ptr[GBinding], Ptr[GValue], Ptr[GValue], gpointer, gboolean]): GBindingTransformFunc = o
  extension (v: GBindingTransformFunc)
    inline def value: CFuncPtr4[Ptr[GBinding], Ptr[GValue], Ptr[GValue], gpointer, gboolean] = v

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

opaque type GBoxedCopyFunc = CFuncPtr1[gpointer, gpointer]
object GBoxedCopyFunc: 
  given _tag: Tag[GBoxedCopyFunc] = Tag.materializeCFuncPtr1[gpointer, gpointer]
  inline def apply(inline o: CFuncPtr1[gpointer, gpointer]): GBoxedCopyFunc = o
  extension (v: GBoxedCopyFunc)
    inline def value: CFuncPtr1[gpointer, gpointer] = v

opaque type GBoxedFreeFunc = CFuncPtr1[gpointer, Unit]
object GBoxedFreeFunc: 
  given _tag: Tag[GBoxedFreeFunc] = Tag.materializeCFuncPtr1[gpointer, Unit]
  inline def apply(inline o: CFuncPtr1[gpointer, Unit]): GBoxedFreeFunc = o
  extension (v: GBoxedFreeFunc)
    inline def value: CFuncPtr1[gpointer, Unit] = v

opaque type GBufferedInputStream_autoptr = Ptr[GBufferedInputStream]
object GBufferedInputStream_autoptr: 
  given _tag: Tag[GBufferedInputStream_autoptr] = Tag.Ptr[GBufferedInputStream](GBufferedInputStream._tag)
  inline def apply(inline o: Ptr[GBufferedInputStream]): GBufferedInputStream_autoptr = o
  extension (v: GBufferedInputStream_autoptr)
    inline def value: Ptr[GBufferedInputStream] = v

opaque type GBufferedInputStream_listautoptr = Ptr[GList]
object GBufferedInputStream_listautoptr: 
  given _tag: Tag[GBufferedInputStream_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GBufferedInputStream_listautoptr = o
  extension (v: GBufferedInputStream_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GBufferedInputStream_queueautoptr = Ptr[GQueue]
object GBufferedInputStream_queueautoptr: 
  given _tag: Tag[GBufferedInputStream_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GBufferedInputStream_queueautoptr = o
  extension (v: GBufferedInputStream_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GBufferedInputStream_slistautoptr = Ptr[GSList]
object GBufferedInputStream_slistautoptr: 
  given _tag: Tag[GBufferedInputStream_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GBufferedInputStream_slistautoptr = o
  extension (v: GBufferedInputStream_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GBufferedOutputStream_autoptr = Ptr[GBufferedOutputStream]
object GBufferedOutputStream_autoptr: 
  given _tag: Tag[GBufferedOutputStream_autoptr] = Tag.Ptr[GBufferedOutputStream](GBufferedOutputStream._tag)
  inline def apply(inline o: Ptr[GBufferedOutputStream]): GBufferedOutputStream_autoptr = o
  extension (v: GBufferedOutputStream_autoptr)
    inline def value: Ptr[GBufferedOutputStream] = v

opaque type GBufferedOutputStream_listautoptr = Ptr[GList]
object GBufferedOutputStream_listautoptr: 
  given _tag: Tag[GBufferedOutputStream_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GBufferedOutputStream_listautoptr = o
  extension (v: GBufferedOutputStream_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GBufferedOutputStream_queueautoptr = Ptr[GQueue]
object GBufferedOutputStream_queueautoptr: 
  given _tag: Tag[GBufferedOutputStream_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GBufferedOutputStream_queueautoptr = o
  extension (v: GBufferedOutputStream_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GBufferedOutputStream_slistautoptr = Ptr[GSList]
object GBufferedOutputStream_slistautoptr: 
  given _tag: Tag[GBufferedOutputStream_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GBufferedOutputStream_slistautoptr = o
  extension (v: GBufferedOutputStream_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GBusAcquiredCallback = CFuncPtr3[Ptr[GDBusConnection], Ptr[gchar], gpointer, Unit]
object GBusAcquiredCallback: 
  given _tag: Tag[GBusAcquiredCallback] = Tag.materializeCFuncPtr3[Ptr[GDBusConnection], Ptr[gchar], gpointer, Unit]
  inline def apply(inline o: CFuncPtr3[Ptr[GDBusConnection], Ptr[gchar], gpointer, Unit]): GBusAcquiredCallback = o
  extension (v: GBusAcquiredCallback)
    inline def value: CFuncPtr3[Ptr[GDBusConnection], Ptr[gchar], gpointer, Unit] = v

opaque type GBusNameAcquiredCallback = CFuncPtr3[Ptr[GDBusConnection], Ptr[gchar], gpointer, Unit]
object GBusNameAcquiredCallback: 
  given _tag: Tag[GBusNameAcquiredCallback] = Tag.materializeCFuncPtr3[Ptr[GDBusConnection], Ptr[gchar], gpointer, Unit]
  inline def apply(inline o: CFuncPtr3[Ptr[GDBusConnection], Ptr[gchar], gpointer, Unit]): GBusNameAcquiredCallback = o
  extension (v: GBusNameAcquiredCallback)
    inline def value: CFuncPtr3[Ptr[GDBusConnection], Ptr[gchar], gpointer, Unit] = v

opaque type GBusNameAppearedCallback = CFuncPtr4[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], gpointer, Unit]
object GBusNameAppearedCallback: 
  given _tag: Tag[GBusNameAppearedCallback] = Tag.materializeCFuncPtr4[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], gpointer, Unit]
  inline def apply(inline o: CFuncPtr4[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], gpointer, Unit]): GBusNameAppearedCallback = o
  extension (v: GBusNameAppearedCallback)
    inline def value: CFuncPtr4[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], gpointer, Unit] = v

opaque type GBusNameLostCallback = CFuncPtr3[Ptr[GDBusConnection], Ptr[gchar], gpointer, Unit]
object GBusNameLostCallback: 
  given _tag: Tag[GBusNameLostCallback] = Tag.materializeCFuncPtr3[Ptr[GDBusConnection], Ptr[gchar], gpointer, Unit]
  inline def apply(inline o: CFuncPtr3[Ptr[GDBusConnection], Ptr[gchar], gpointer, Unit]): GBusNameLostCallback = o
  extension (v: GBusNameLostCallback)
    inline def value: CFuncPtr3[Ptr[GDBusConnection], Ptr[gchar], gpointer, Unit] = v

opaque type GBusNameVanishedCallback = CFuncPtr3[Ptr[GDBusConnection], Ptr[gchar], gpointer, Unit]
object GBusNameVanishedCallback: 
  given _tag: Tag[GBusNameVanishedCallback] = Tag.materializeCFuncPtr3[Ptr[GDBusConnection], Ptr[gchar], gpointer, Unit]
  inline def apply(inline o: CFuncPtr3[Ptr[GDBusConnection], Ptr[gchar], gpointer, Unit]): GBusNameVanishedCallback = o
  extension (v: GBusNameVanishedCallback)
    inline def value: CFuncPtr3[Ptr[GDBusConnection], Ptr[gchar], gpointer, Unit] = v

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

opaque type GBytesIcon_autoptr = Ptr[GBytesIcon]
object GBytesIcon_autoptr: 
  given _tag: Tag[GBytesIcon_autoptr] = Tag.Ptr[GBytesIcon](GBytesIcon._tag)
  inline def apply(inline o: Ptr[GBytesIcon]): GBytesIcon_autoptr = o
  extension (v: GBytesIcon_autoptr)
    inline def value: Ptr[GBytesIcon] = v

opaque type GBytesIcon_listautoptr = Ptr[GList]
object GBytesIcon_listautoptr: 
  given _tag: Tag[GBytesIcon_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GBytesIcon_listautoptr = o
  extension (v: GBytesIcon_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GBytesIcon_queueautoptr = Ptr[GQueue]
object GBytesIcon_queueautoptr: 
  given _tag: Tag[GBytesIcon_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GBytesIcon_queueautoptr = o
  extension (v: GBytesIcon_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GBytesIcon_slistautoptr = Ptr[GSList]
object GBytesIcon_slistautoptr: 
  given _tag: Tag[GBytesIcon_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GBytesIcon_slistautoptr = o
  extension (v: GBytesIcon_slistautoptr)
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
  inline def apply(inline o: CFuncPtr1[gpointer, Unit]): GCacheDestroyFunc = o
  extension (v: GCacheDestroyFunc)
    inline def value: CFuncPtr1[gpointer, Unit] = v

opaque type GCacheDupFunc = CFuncPtr1[gpointer, gpointer]
object GCacheDupFunc: 
  given _tag: Tag[GCacheDupFunc] = Tag.materializeCFuncPtr1[gpointer, gpointer]
  inline def apply(inline o: CFuncPtr1[gpointer, gpointer]): GCacheDupFunc = o
  extension (v: GCacheDupFunc)
    inline def value: CFuncPtr1[gpointer, gpointer] = v

opaque type GCacheNewFunc = CFuncPtr1[gpointer, gpointer]
object GCacheNewFunc: 
  given _tag: Tag[GCacheNewFunc] = Tag.materializeCFuncPtr1[gpointer, gpointer]
  inline def apply(inline o: CFuncPtr1[gpointer, gpointer]): GCacheNewFunc = o
  extension (v: GCacheNewFunc)
    inline def value: CFuncPtr1[gpointer, gpointer] = v

opaque type GCallback = CFuncPtr0[Unit]
object GCallback: 
  given _tag: Tag[GCallback] = Tag.materializeCFuncPtr0[Unit]
  inline def apply(inline o: CFuncPtr0[Unit]): GCallback = o
  extension (v: GCallback)
    inline def value: CFuncPtr0[Unit] = v

opaque type GCancellableSourceFunc = CFuncPtr2[Ptr[GCancellable], gpointer, gboolean]
object GCancellableSourceFunc: 
  given _tag: Tag[GCancellableSourceFunc] = Tag.materializeCFuncPtr2[Ptr[GCancellable], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr2[Ptr[GCancellable], gpointer, gboolean]): GCancellableSourceFunc = o
  extension (v: GCancellableSourceFunc)
    inline def value: CFuncPtr2[Ptr[GCancellable], gpointer, gboolean] = v

opaque type GCancellable_autoptr = Ptr[GCancellable]
object GCancellable_autoptr: 
  given _tag: Tag[GCancellable_autoptr] = Tag.Ptr[GCancellable](GCancellable._tag)
  inline def apply(inline o: Ptr[GCancellable]): GCancellable_autoptr = o
  extension (v: GCancellable_autoptr)
    inline def value: Ptr[GCancellable] = v

opaque type GCancellable_listautoptr = Ptr[GList]
object GCancellable_listautoptr: 
  given _tag: Tag[GCancellable_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GCancellable_listautoptr = o
  extension (v: GCancellable_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GCancellable_queueautoptr = Ptr[GQueue]
object GCancellable_queueautoptr: 
  given _tag: Tag[GCancellable_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GCancellable_queueautoptr = o
  extension (v: GCancellable_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GCancellable_slistautoptr = Ptr[GSList]
object GCancellable_slistautoptr: 
  given _tag: Tag[GCancellable_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GCancellable_slistautoptr = o
  extension (v: GCancellable_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GCharsetConverter_autoptr = Ptr[GCharsetConverter]
object GCharsetConverter_autoptr: 
  given _tag: Tag[GCharsetConverter_autoptr] = Tag.Ptr[GCharsetConverter](GCharsetConverter._tag)
  inline def apply(inline o: Ptr[GCharsetConverter]): GCharsetConverter_autoptr = o
  extension (v: GCharsetConverter_autoptr)
    inline def value: Ptr[GCharsetConverter] = v

opaque type GCharsetConverter_listautoptr = Ptr[GList]
object GCharsetConverter_listautoptr: 
  given _tag: Tag[GCharsetConverter_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GCharsetConverter_listautoptr = o
  extension (v: GCharsetConverter_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GCharsetConverter_queueautoptr = Ptr[GQueue]
object GCharsetConverter_queueautoptr: 
  given _tag: Tag[GCharsetConverter_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GCharsetConverter_queueautoptr = o
  extension (v: GCharsetConverter_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GCharsetConverter_slistautoptr = Ptr[GSList]
object GCharsetConverter_slistautoptr: 
  given _tag: Tag[GCharsetConverter_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GCharsetConverter_slistautoptr = o
  extension (v: GCharsetConverter_slistautoptr)
    inline def value: Ptr[GSList] = v

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

opaque type GChildWatchFunc = CFuncPtr3[GPid, gint, gpointer, Unit]
object GChildWatchFunc: 
  given _tag: Tag[GChildWatchFunc] = Tag.materializeCFuncPtr3[GPid, gint, gpointer, Unit]
  inline def apply(inline o: CFuncPtr3[GPid, gint, gpointer, Unit]): GChildWatchFunc = o
  extension (v: GChildWatchFunc)
    inline def value: CFuncPtr3[GPid, gint, gpointer, Unit] = v

opaque type GClassFinalizeFunc = CFuncPtr2[gpointer, gpointer, Unit]
object GClassFinalizeFunc: 
  given _tag: Tag[GClassFinalizeFunc] = Tag.materializeCFuncPtr2[gpointer, gpointer, Unit]
  inline def apply(inline o: CFuncPtr2[gpointer, gpointer, Unit]): GClassFinalizeFunc = o
  extension (v: GClassFinalizeFunc)
    inline def value: CFuncPtr2[gpointer, gpointer, Unit] = v

opaque type GClassInitFunc = CFuncPtr2[gpointer, gpointer, Unit]
object GClassInitFunc: 
  given _tag: Tag[GClassInitFunc] = Tag.materializeCFuncPtr2[gpointer, gpointer, Unit]
  inline def apply(inline o: CFuncPtr2[gpointer, gpointer, Unit]): GClassInitFunc = o
  extension (v: GClassInitFunc)
    inline def value: CFuncPtr2[gpointer, gpointer, Unit] = v

opaque type GClearHandleFunc = CFuncPtr1[guint, Unit]
object GClearHandleFunc: 
  given _tag: Tag[GClearHandleFunc] = Tag.materializeCFuncPtr1[guint, Unit]
  inline def apply(inline o: CFuncPtr1[guint, Unit]): GClearHandleFunc = o
  extension (v: GClearHandleFunc)
    inline def value: CFuncPtr1[guint, Unit] = v

opaque type GClosureMarshal = CFuncPtr6[Ptr[GClosure], Ptr[GValue], guint, Ptr[GValue], gpointer, gpointer, Unit]
object GClosureMarshal: 
  given _tag: Tag[GClosureMarshal] = Tag.materializeCFuncPtr6[Ptr[GClosure], Ptr[GValue], guint, Ptr[GValue], gpointer, gpointer, Unit]
  inline def apply(inline o: CFuncPtr6[Ptr[GClosure], Ptr[GValue], guint, Ptr[GValue], gpointer, gpointer, Unit]): GClosureMarshal = o
  extension (v: GClosureMarshal)
    inline def value: CFuncPtr6[Ptr[GClosure], Ptr[GValue], guint, Ptr[GValue], gpointer, gpointer, Unit] = v

opaque type GClosureNotify = CFuncPtr2[gpointer, Ptr[GClosure], Unit]
object GClosureNotify: 
  given _tag: Tag[GClosureNotify] = Tag.materializeCFuncPtr2[gpointer, Ptr[GClosure], Unit]
  inline def apply(inline o: CFuncPtr2[gpointer, Ptr[GClosure], Unit]): GClosureNotify = o
  extension (v: GClosureNotify)
    inline def value: CFuncPtr2[gpointer, Ptr[GClosure], Unit] = v

opaque type GClosure_autoptr = Ptr[GClosure]
object GClosure_autoptr: 
  given _tag: Tag[GClosure_autoptr] = Tag.Ptr[GClosure](GClosure._tag)
  inline def apply(inline o: Ptr[GClosure]): GClosure_autoptr = o
  extension (v: GClosure_autoptr)
    inline def value: Ptr[GClosure] = v

opaque type GClosure_listautoptr = Ptr[GList]
object GClosure_listautoptr: 
  given _tag: Tag[GClosure_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GClosure_listautoptr = o
  extension (v: GClosure_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GClosure_queueautoptr = Ptr[GQueue]
object GClosure_queueautoptr: 
  given _tag: Tag[GClosure_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GClosure_queueautoptr = o
  extension (v: GClosure_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GClosure_slistautoptr = Ptr[GSList]
object GClosure_slistautoptr: 
  given _tag: Tag[GClosure_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GClosure_slistautoptr = o
  extension (v: GClosure_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GCompareDataFunc = CFuncPtr3[gconstpointer, gconstpointer, gpointer, gint]
object GCompareDataFunc: 
  given _tag: Tag[GCompareDataFunc] = Tag.materializeCFuncPtr3[gconstpointer, gconstpointer, gpointer, gint]
  inline def apply(inline o: CFuncPtr3[gconstpointer, gconstpointer, gpointer, gint]): GCompareDataFunc = o
  extension (v: GCompareDataFunc)
    inline def value: CFuncPtr3[gconstpointer, gconstpointer, gpointer, gint] = v

opaque type GCompareFunc = CFuncPtr2[gconstpointer, gconstpointer, gint]
object GCompareFunc: 
  given _tag: Tag[GCompareFunc] = Tag.materializeCFuncPtr2[gconstpointer, gconstpointer, gint]
  inline def apply(inline o: CFuncPtr2[gconstpointer, gconstpointer, gint]): GCompareFunc = o
  extension (v: GCompareFunc)
    inline def value: CFuncPtr2[gconstpointer, gconstpointer, gint] = v

opaque type GCompletionFunc = CFuncPtr1[gpointer, Ptr[gchar]]
object GCompletionFunc: 
  given _tag: Tag[GCompletionFunc] = Tag.materializeCFuncPtr1[gpointer, Ptr[gchar]]
  inline def apply(inline o: CFuncPtr1[gpointer, Ptr[gchar]]): GCompletionFunc = o
  extension (v: GCompletionFunc)
    inline def value: CFuncPtr1[gpointer, Ptr[gchar]] = v

opaque type GCompletionStrncmpFunc = CFuncPtr3[Ptr[gchar], Ptr[gchar], gsize, gint]
object GCompletionStrncmpFunc: 
  given _tag: Tag[GCompletionStrncmpFunc] = Tag.materializeCFuncPtr3[Ptr[gchar], Ptr[gchar], gsize, gint]
  inline def apply(inline o: CFuncPtr3[Ptr[gchar], Ptr[gchar], gsize, gint]): GCompletionStrncmpFunc = o
  extension (v: GCompletionStrncmpFunc)
    inline def value: CFuncPtr3[Ptr[gchar], Ptr[gchar], gsize, gint] = v

opaque type GConverterInputStream_autoptr = Ptr[GConverterInputStream]
object GConverterInputStream_autoptr: 
  given _tag: Tag[GConverterInputStream_autoptr] = Tag.Ptr[GConverterInputStream](GConverterInputStream._tag)
  inline def apply(inline o: Ptr[GConverterInputStream]): GConverterInputStream_autoptr = o
  extension (v: GConverterInputStream_autoptr)
    inline def value: Ptr[GConverterInputStream] = v

opaque type GConverterInputStream_listautoptr = Ptr[GList]
object GConverterInputStream_listautoptr: 
  given _tag: Tag[GConverterInputStream_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GConverterInputStream_listautoptr = o
  extension (v: GConverterInputStream_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GConverterInputStream_queueautoptr = Ptr[GQueue]
object GConverterInputStream_queueautoptr: 
  given _tag: Tag[GConverterInputStream_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GConverterInputStream_queueautoptr = o
  extension (v: GConverterInputStream_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GConverterInputStream_slistautoptr = Ptr[GSList]
object GConverterInputStream_slistautoptr: 
  given _tag: Tag[GConverterInputStream_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GConverterInputStream_slistautoptr = o
  extension (v: GConverterInputStream_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GConverterOutputStream_autoptr = Ptr[GConverterOutputStream]
object GConverterOutputStream_autoptr: 
  given _tag: Tag[GConverterOutputStream_autoptr] = Tag.Ptr[GConverterOutputStream](GConverterOutputStream._tag)
  inline def apply(inline o: Ptr[GConverterOutputStream]): GConverterOutputStream_autoptr = o
  extension (v: GConverterOutputStream_autoptr)
    inline def value: Ptr[GConverterOutputStream] = v

opaque type GConverterOutputStream_listautoptr = Ptr[GList]
object GConverterOutputStream_listautoptr: 
  given _tag: Tag[GConverterOutputStream_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GConverterOutputStream_listautoptr = o
  extension (v: GConverterOutputStream_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GConverterOutputStream_queueautoptr = Ptr[GQueue]
object GConverterOutputStream_queueautoptr: 
  given _tag: Tag[GConverterOutputStream_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GConverterOutputStream_queueautoptr = o
  extension (v: GConverterOutputStream_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GConverterOutputStream_slistautoptr = Ptr[GSList]
object GConverterOutputStream_slistautoptr: 
  given _tag: Tag[GConverterOutputStream_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GConverterOutputStream_slistautoptr = o
  extension (v: GConverterOutputStream_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GConverter_autoptr = Ptr[GConverter]
object GConverter_autoptr: 
  given _tag: Tag[GConverter_autoptr] = Tag.Ptr[GConverter](GConverter._tag)
  inline def apply(inline o: Ptr[GConverter]): GConverter_autoptr = o
  extension (v: GConverter_autoptr)
    inline def value: Ptr[GConverter] = v

opaque type GConverter_listautoptr = Ptr[GList]
object GConverter_listautoptr: 
  given _tag: Tag[GConverter_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GConverter_listautoptr = o
  extension (v: GConverter_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GConverter_queueautoptr = Ptr[GQueue]
object GConverter_queueautoptr: 
  given _tag: Tag[GConverter_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GConverter_queueautoptr = o
  extension (v: GConverter_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GConverter_slistautoptr = Ptr[GSList]
object GConverter_slistautoptr: 
  given _tag: Tag[GConverter_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GConverter_slistautoptr = o
  extension (v: GConverter_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GCopyFunc = CFuncPtr2[gconstpointer, gpointer, gpointer]
object GCopyFunc: 
  given _tag: Tag[GCopyFunc] = Tag.materializeCFuncPtr2[gconstpointer, gpointer, gpointer]
  inline def apply(inline o: CFuncPtr2[gconstpointer, gpointer, gpointer]): GCopyFunc = o
  extension (v: GCopyFunc)
    inline def value: CFuncPtr2[gconstpointer, gpointer, gpointer] = v

opaque type GCredentials_autoptr = Ptr[GCredentials]
object GCredentials_autoptr: 
  given _tag: Tag[GCredentials_autoptr] = Tag.Ptr[GCredentials](GCredentials._tag)
  inline def apply(inline o: Ptr[GCredentials]): GCredentials_autoptr = o
  extension (v: GCredentials_autoptr)
    inline def value: Ptr[GCredentials] = v

opaque type GCredentials_listautoptr = Ptr[GList]
object GCredentials_listautoptr: 
  given _tag: Tag[GCredentials_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GCredentials_listautoptr = o
  extension (v: GCredentials_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GCredentials_queueautoptr = Ptr[GQueue]
object GCredentials_queueautoptr: 
  given _tag: Tag[GCredentials_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GCredentials_queueautoptr = o
  extension (v: GCredentials_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GCredentials_slistautoptr = Ptr[GSList]
object GCredentials_slistautoptr: 
  given _tag: Tag[GCredentials_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GCredentials_slistautoptr = o
  extension (v: GCredentials_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GDBusActionGroup_autoptr = Ptr[GDBusActionGroup]
object GDBusActionGroup_autoptr: 
  given _tag: Tag[GDBusActionGroup_autoptr] = Tag.Ptr[GDBusActionGroup](GDBusActionGroup._tag)
  inline def apply(inline o: Ptr[GDBusActionGroup]): GDBusActionGroup_autoptr = o
  extension (v: GDBusActionGroup_autoptr)
    inline def value: Ptr[GDBusActionGroup] = v

opaque type GDBusActionGroup_listautoptr = Ptr[GList]
object GDBusActionGroup_listautoptr: 
  given _tag: Tag[GDBusActionGroup_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDBusActionGroup_listautoptr = o
  extension (v: GDBusActionGroup_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GDBusActionGroup_queueautoptr = Ptr[GQueue]
object GDBusActionGroup_queueautoptr: 
  given _tag: Tag[GDBusActionGroup_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GDBusActionGroup_queueautoptr = o
  extension (v: GDBusActionGroup_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GDBusActionGroup_slistautoptr = Ptr[GSList]
object GDBusActionGroup_slistautoptr: 
  given _tag: Tag[GDBusActionGroup_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDBusActionGroup_slistautoptr = o
  extension (v: GDBusActionGroup_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GDBusAuthObserver_autoptr = Ptr[GDBusAuthObserver]
object GDBusAuthObserver_autoptr: 
  given _tag: Tag[GDBusAuthObserver_autoptr] = Tag.Ptr[GDBusAuthObserver](GDBusAuthObserver._tag)
  inline def apply(inline o: Ptr[GDBusAuthObserver]): GDBusAuthObserver_autoptr = o
  extension (v: GDBusAuthObserver_autoptr)
    inline def value: Ptr[GDBusAuthObserver] = v

opaque type GDBusAuthObserver_listautoptr = Ptr[GList]
object GDBusAuthObserver_listautoptr: 
  given _tag: Tag[GDBusAuthObserver_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDBusAuthObserver_listautoptr = o
  extension (v: GDBusAuthObserver_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GDBusAuthObserver_queueautoptr = Ptr[GQueue]
object GDBusAuthObserver_queueautoptr: 
  given _tag: Tag[GDBusAuthObserver_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GDBusAuthObserver_queueautoptr = o
  extension (v: GDBusAuthObserver_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GDBusAuthObserver_slistautoptr = Ptr[GSList]
object GDBusAuthObserver_slistautoptr: 
  given _tag: Tag[GDBusAuthObserver_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDBusAuthObserver_slistautoptr = o
  extension (v: GDBusAuthObserver_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GDBusConnection_autoptr = Ptr[GDBusConnection]
object GDBusConnection_autoptr: 
  given _tag: Tag[GDBusConnection_autoptr] = Tag.Ptr[GDBusConnection](GDBusConnection._tag)
  inline def apply(inline o: Ptr[GDBusConnection]): GDBusConnection_autoptr = o
  extension (v: GDBusConnection_autoptr)
    inline def value: Ptr[GDBusConnection] = v

opaque type GDBusConnection_listautoptr = Ptr[GList]
object GDBusConnection_listautoptr: 
  given _tag: Tag[GDBusConnection_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDBusConnection_listautoptr = o
  extension (v: GDBusConnection_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GDBusConnection_queueautoptr = Ptr[GQueue]
object GDBusConnection_queueautoptr: 
  given _tag: Tag[GDBusConnection_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GDBusConnection_queueautoptr = o
  extension (v: GDBusConnection_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GDBusConnection_slistautoptr = Ptr[GSList]
object GDBusConnection_slistautoptr: 
  given _tag: Tag[GDBusConnection_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDBusConnection_slistautoptr = o
  extension (v: GDBusConnection_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GDBusInterfaceGetPropertyFunc = CFuncPtr7[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[Ptr[GError]], gpointer, Ptr[GVariant]]
object GDBusInterfaceGetPropertyFunc: 
  given _tag: Tag[GDBusInterfaceGetPropertyFunc] = Tag.materializeCFuncPtr7[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[Ptr[GError]], gpointer, Ptr[GVariant]]
  inline def apply(inline o: CFuncPtr7[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[Ptr[GError]], gpointer, Ptr[GVariant]]): GDBusInterfaceGetPropertyFunc = o
  extension (v: GDBusInterfaceGetPropertyFunc)
    inline def value: CFuncPtr7[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[Ptr[GError]], gpointer, Ptr[GVariant]] = v

opaque type GDBusInterfaceMethodCallFunc = CFuncPtr8[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[GVariant], Ptr[GDBusMethodInvocation], gpointer, Unit]
object GDBusInterfaceMethodCallFunc: 
  given _tag: Tag[GDBusInterfaceMethodCallFunc] = Tag.materializeCFuncPtr8[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[GVariant], Ptr[GDBusMethodInvocation], gpointer, Unit]
  inline def apply(inline o: CFuncPtr8[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[GVariant], Ptr[GDBusMethodInvocation], gpointer, Unit]): GDBusInterfaceMethodCallFunc = o
  extension (v: GDBusInterfaceMethodCallFunc)
    inline def value: CFuncPtr8[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[GVariant], Ptr[GDBusMethodInvocation], gpointer, Unit] = v

opaque type GDBusInterfaceSetPropertyFunc = CFuncPtr8[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[GVariant], Ptr[Ptr[GError]], gpointer, gboolean]
object GDBusInterfaceSetPropertyFunc: 
  given _tag: Tag[GDBusInterfaceSetPropertyFunc] = Tag.materializeCFuncPtr8[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[GVariant], Ptr[Ptr[GError]], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr8[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[GVariant], Ptr[Ptr[GError]], gpointer, gboolean]): GDBusInterfaceSetPropertyFunc = o
  extension (v: GDBusInterfaceSetPropertyFunc)
    inline def value: CFuncPtr8[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[GVariant], Ptr[Ptr[GError]], gpointer, gboolean] = v

opaque type GDBusInterfaceSkeleton_autoptr = Ptr[GDBusInterfaceSkeleton]
object GDBusInterfaceSkeleton_autoptr: 
  given _tag: Tag[GDBusInterfaceSkeleton_autoptr] = Tag.Ptr[GDBusInterfaceSkeleton](GDBusInterfaceSkeleton._tag)
  inline def apply(inline o: Ptr[GDBusInterfaceSkeleton]): GDBusInterfaceSkeleton_autoptr = o
  extension (v: GDBusInterfaceSkeleton_autoptr)
    inline def value: Ptr[GDBusInterfaceSkeleton] = v

opaque type GDBusInterfaceSkeleton_listautoptr = Ptr[GList]
object GDBusInterfaceSkeleton_listautoptr: 
  given _tag: Tag[GDBusInterfaceSkeleton_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDBusInterfaceSkeleton_listautoptr = o
  extension (v: GDBusInterfaceSkeleton_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GDBusInterfaceSkeleton_queueautoptr = Ptr[GQueue]
object GDBusInterfaceSkeleton_queueautoptr: 
  given _tag: Tag[GDBusInterfaceSkeleton_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GDBusInterfaceSkeleton_queueautoptr = o
  extension (v: GDBusInterfaceSkeleton_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GDBusInterfaceSkeleton_slistautoptr = Ptr[GSList]
object GDBusInterfaceSkeleton_slistautoptr: 
  given _tag: Tag[GDBusInterfaceSkeleton_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDBusInterfaceSkeleton_slistautoptr = o
  extension (v: GDBusInterfaceSkeleton_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GDBusInterface_autoptr = Ptr[GDBusInterface]
object GDBusInterface_autoptr: 
  given _tag: Tag[GDBusInterface_autoptr] = Tag.Ptr[GDBusInterface](GDBusInterface._tag)
  inline def apply(inline o: Ptr[GDBusInterface]): GDBusInterface_autoptr = o
  extension (v: GDBusInterface_autoptr)
    inline def value: Ptr[GDBusInterface] = v

opaque type GDBusInterface_listautoptr = Ptr[GList]
object GDBusInterface_listautoptr: 
  given _tag: Tag[GDBusInterface_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDBusInterface_listautoptr = o
  extension (v: GDBusInterface_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GDBusInterface_queueautoptr = Ptr[GQueue]
object GDBusInterface_queueautoptr: 
  given _tag: Tag[GDBusInterface_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GDBusInterface_queueautoptr = o
  extension (v: GDBusInterface_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GDBusInterface_slistautoptr = Ptr[GSList]
object GDBusInterface_slistautoptr: 
  given _tag: Tag[GDBusInterface_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDBusInterface_slistautoptr = o
  extension (v: GDBusInterface_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GDBusMenuModel_autoptr = Ptr[GDBusMenuModel]
object GDBusMenuModel_autoptr: 
  given _tag: Tag[GDBusMenuModel_autoptr] = Tag.Ptr[GDBusMenuModel](GDBusMenuModel._tag)
  inline def apply(inline o: Ptr[GDBusMenuModel]): GDBusMenuModel_autoptr = o
  extension (v: GDBusMenuModel_autoptr)
    inline def value: Ptr[GDBusMenuModel] = v

opaque type GDBusMenuModel_listautoptr = Ptr[GList]
object GDBusMenuModel_listautoptr: 
  given _tag: Tag[GDBusMenuModel_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDBusMenuModel_listautoptr = o
  extension (v: GDBusMenuModel_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GDBusMenuModel_queueautoptr = Ptr[GQueue]
object GDBusMenuModel_queueautoptr: 
  given _tag: Tag[GDBusMenuModel_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GDBusMenuModel_queueautoptr = o
  extension (v: GDBusMenuModel_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GDBusMenuModel_slistautoptr = Ptr[GSList]
object GDBusMenuModel_slistautoptr: 
  given _tag: Tag[GDBusMenuModel_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDBusMenuModel_slistautoptr = o
  extension (v: GDBusMenuModel_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GDBusMessageFilterFunction = CFuncPtr4[Ptr[GDBusConnection], Ptr[GDBusMessage], gboolean, gpointer, Ptr[GDBusMessage]]
object GDBusMessageFilterFunction: 
  given _tag: Tag[GDBusMessageFilterFunction] = Tag.materializeCFuncPtr4[Ptr[GDBusConnection], Ptr[GDBusMessage], gboolean, gpointer, Ptr[GDBusMessage]]
  inline def apply(inline o: CFuncPtr4[Ptr[GDBusConnection], Ptr[GDBusMessage], gboolean, gpointer, Ptr[GDBusMessage]]): GDBusMessageFilterFunction = o
  extension (v: GDBusMessageFilterFunction)
    inline def value: CFuncPtr4[Ptr[GDBusConnection], Ptr[GDBusMessage], gboolean, gpointer, Ptr[GDBusMessage]] = v

opaque type GDBusMessage_autoptr = Ptr[GDBusMessage]
object GDBusMessage_autoptr: 
  given _tag: Tag[GDBusMessage_autoptr] = Tag.Ptr[GDBusMessage](GDBusMessage._tag)
  inline def apply(inline o: Ptr[GDBusMessage]): GDBusMessage_autoptr = o
  extension (v: GDBusMessage_autoptr)
    inline def value: Ptr[GDBusMessage] = v

opaque type GDBusMessage_listautoptr = Ptr[GList]
object GDBusMessage_listautoptr: 
  given _tag: Tag[GDBusMessage_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDBusMessage_listautoptr = o
  extension (v: GDBusMessage_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GDBusMessage_queueautoptr = Ptr[GQueue]
object GDBusMessage_queueautoptr: 
  given _tag: Tag[GDBusMessage_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GDBusMessage_queueautoptr = o
  extension (v: GDBusMessage_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GDBusMessage_slistautoptr = Ptr[GSList]
object GDBusMessage_slistautoptr: 
  given _tag: Tag[GDBusMessage_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDBusMessage_slistautoptr = o
  extension (v: GDBusMessage_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GDBusMethodInvocation_autoptr = Ptr[GDBusMethodInvocation]
object GDBusMethodInvocation_autoptr: 
  given _tag: Tag[GDBusMethodInvocation_autoptr] = Tag.Ptr[GDBusMethodInvocation](GDBusMethodInvocation._tag)
  inline def apply(inline o: Ptr[GDBusMethodInvocation]): GDBusMethodInvocation_autoptr = o
  extension (v: GDBusMethodInvocation_autoptr)
    inline def value: Ptr[GDBusMethodInvocation] = v

opaque type GDBusMethodInvocation_listautoptr = Ptr[GList]
object GDBusMethodInvocation_listautoptr: 
  given _tag: Tag[GDBusMethodInvocation_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDBusMethodInvocation_listautoptr = o
  extension (v: GDBusMethodInvocation_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GDBusMethodInvocation_queueautoptr = Ptr[GQueue]
object GDBusMethodInvocation_queueautoptr: 
  given _tag: Tag[GDBusMethodInvocation_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GDBusMethodInvocation_queueautoptr = o
  extension (v: GDBusMethodInvocation_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GDBusMethodInvocation_slistautoptr = Ptr[GSList]
object GDBusMethodInvocation_slistautoptr: 
  given _tag: Tag[GDBusMethodInvocation_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDBusMethodInvocation_slistautoptr = o
  extension (v: GDBusMethodInvocation_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GDBusNodeInfo_autoptr = Ptr[GDBusNodeInfo]
object GDBusNodeInfo_autoptr: 
  given _tag: Tag[GDBusNodeInfo_autoptr] = Tag.Ptr[GDBusNodeInfo](GDBusNodeInfo._tag)
  inline def apply(inline o: Ptr[GDBusNodeInfo]): GDBusNodeInfo_autoptr = o
  extension (v: GDBusNodeInfo_autoptr)
    inline def value: Ptr[GDBusNodeInfo] = v

opaque type GDBusNodeInfo_listautoptr = Ptr[GList]
object GDBusNodeInfo_listautoptr: 
  given _tag: Tag[GDBusNodeInfo_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDBusNodeInfo_listautoptr = o
  extension (v: GDBusNodeInfo_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GDBusNodeInfo_queueautoptr = Ptr[GQueue]
object GDBusNodeInfo_queueautoptr: 
  given _tag: Tag[GDBusNodeInfo_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GDBusNodeInfo_queueautoptr = o
  extension (v: GDBusNodeInfo_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GDBusNodeInfo_slistautoptr = Ptr[GSList]
object GDBusNodeInfo_slistautoptr: 
  given _tag: Tag[GDBusNodeInfo_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDBusNodeInfo_slistautoptr = o
  extension (v: GDBusNodeInfo_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GDBusObjectManagerClient_autoptr = Ptr[GDBusObjectManagerClient]
object GDBusObjectManagerClient_autoptr: 
  given _tag: Tag[GDBusObjectManagerClient_autoptr] = Tag.Ptr[GDBusObjectManagerClient](GDBusObjectManagerClient._tag)
  inline def apply(inline o: Ptr[GDBusObjectManagerClient]): GDBusObjectManagerClient_autoptr = o
  extension (v: GDBusObjectManagerClient_autoptr)
    inline def value: Ptr[GDBusObjectManagerClient] = v

opaque type GDBusObjectManagerClient_listautoptr = Ptr[GList]
object GDBusObjectManagerClient_listautoptr: 
  given _tag: Tag[GDBusObjectManagerClient_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDBusObjectManagerClient_listautoptr = o
  extension (v: GDBusObjectManagerClient_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GDBusObjectManagerClient_queueautoptr = Ptr[GQueue]
object GDBusObjectManagerClient_queueautoptr: 
  given _tag: Tag[GDBusObjectManagerClient_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GDBusObjectManagerClient_queueautoptr = o
  extension (v: GDBusObjectManagerClient_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GDBusObjectManagerClient_slistautoptr = Ptr[GSList]
object GDBusObjectManagerClient_slistautoptr: 
  given _tag: Tag[GDBusObjectManagerClient_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDBusObjectManagerClient_slistautoptr = o
  extension (v: GDBusObjectManagerClient_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GDBusObjectManagerServer_autoptr = Ptr[GDBusObjectManagerServer]
object GDBusObjectManagerServer_autoptr: 
  given _tag: Tag[GDBusObjectManagerServer_autoptr] = Tag.Ptr[GDBusObjectManagerServer](GDBusObjectManagerServer._tag)
  inline def apply(inline o: Ptr[GDBusObjectManagerServer]): GDBusObjectManagerServer_autoptr = o
  extension (v: GDBusObjectManagerServer_autoptr)
    inline def value: Ptr[GDBusObjectManagerServer] = v

opaque type GDBusObjectManagerServer_listautoptr = Ptr[GList]
object GDBusObjectManagerServer_listautoptr: 
  given _tag: Tag[GDBusObjectManagerServer_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDBusObjectManagerServer_listautoptr = o
  extension (v: GDBusObjectManagerServer_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GDBusObjectManagerServer_queueautoptr = Ptr[GQueue]
object GDBusObjectManagerServer_queueautoptr: 
  given _tag: Tag[GDBusObjectManagerServer_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GDBusObjectManagerServer_queueautoptr = o
  extension (v: GDBusObjectManagerServer_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GDBusObjectManagerServer_slistautoptr = Ptr[GSList]
object GDBusObjectManagerServer_slistautoptr: 
  given _tag: Tag[GDBusObjectManagerServer_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDBusObjectManagerServer_slistautoptr = o
  extension (v: GDBusObjectManagerServer_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GDBusObjectManager_autoptr = Ptr[GDBusObjectManager]
object GDBusObjectManager_autoptr: 
  given _tag: Tag[GDBusObjectManager_autoptr] = Tag.Ptr[GDBusObjectManager](GDBusObjectManager._tag)
  inline def apply(inline o: Ptr[GDBusObjectManager]): GDBusObjectManager_autoptr = o
  extension (v: GDBusObjectManager_autoptr)
    inline def value: Ptr[GDBusObjectManager] = v

opaque type GDBusObjectManager_listautoptr = Ptr[GList]
object GDBusObjectManager_listautoptr: 
  given _tag: Tag[GDBusObjectManager_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDBusObjectManager_listautoptr = o
  extension (v: GDBusObjectManager_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GDBusObjectManager_queueautoptr = Ptr[GQueue]
object GDBusObjectManager_queueautoptr: 
  given _tag: Tag[GDBusObjectManager_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GDBusObjectManager_queueautoptr = o
  extension (v: GDBusObjectManager_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GDBusObjectManager_slistautoptr = Ptr[GSList]
object GDBusObjectManager_slistautoptr: 
  given _tag: Tag[GDBusObjectManager_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDBusObjectManager_slistautoptr = o
  extension (v: GDBusObjectManager_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GDBusObjectProxy_autoptr = Ptr[GDBusObjectProxy]
object GDBusObjectProxy_autoptr: 
  given _tag: Tag[GDBusObjectProxy_autoptr] = Tag.Ptr[GDBusObjectProxy](GDBusObjectProxy._tag)
  inline def apply(inline o: Ptr[GDBusObjectProxy]): GDBusObjectProxy_autoptr = o
  extension (v: GDBusObjectProxy_autoptr)
    inline def value: Ptr[GDBusObjectProxy] = v

opaque type GDBusObjectProxy_listautoptr = Ptr[GList]
object GDBusObjectProxy_listautoptr: 
  given _tag: Tag[GDBusObjectProxy_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDBusObjectProxy_listautoptr = o
  extension (v: GDBusObjectProxy_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GDBusObjectProxy_queueautoptr = Ptr[GQueue]
object GDBusObjectProxy_queueautoptr: 
  given _tag: Tag[GDBusObjectProxy_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GDBusObjectProxy_queueautoptr = o
  extension (v: GDBusObjectProxy_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GDBusObjectProxy_slistautoptr = Ptr[GSList]
object GDBusObjectProxy_slistautoptr: 
  given _tag: Tag[GDBusObjectProxy_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDBusObjectProxy_slistautoptr = o
  extension (v: GDBusObjectProxy_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GDBusObjectSkeleton_autoptr = Ptr[GDBusObjectSkeleton]
object GDBusObjectSkeleton_autoptr: 
  given _tag: Tag[GDBusObjectSkeleton_autoptr] = Tag.Ptr[GDBusObjectSkeleton](GDBusObjectSkeleton._tag)
  inline def apply(inline o: Ptr[GDBusObjectSkeleton]): GDBusObjectSkeleton_autoptr = o
  extension (v: GDBusObjectSkeleton_autoptr)
    inline def value: Ptr[GDBusObjectSkeleton] = v

opaque type GDBusObjectSkeleton_listautoptr = Ptr[GList]
object GDBusObjectSkeleton_listautoptr: 
  given _tag: Tag[GDBusObjectSkeleton_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDBusObjectSkeleton_listautoptr = o
  extension (v: GDBusObjectSkeleton_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GDBusObjectSkeleton_queueautoptr = Ptr[GQueue]
object GDBusObjectSkeleton_queueautoptr: 
  given _tag: Tag[GDBusObjectSkeleton_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GDBusObjectSkeleton_queueautoptr = o
  extension (v: GDBusObjectSkeleton_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GDBusObjectSkeleton_slistautoptr = Ptr[GSList]
object GDBusObjectSkeleton_slistautoptr: 
  given _tag: Tag[GDBusObjectSkeleton_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDBusObjectSkeleton_slistautoptr = o
  extension (v: GDBusObjectSkeleton_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GDBusObject_autoptr = Ptr[GDBusObject]
object GDBusObject_autoptr: 
  given _tag: Tag[GDBusObject_autoptr] = Tag.Ptr[GDBusObject](GDBusObject._tag)
  inline def apply(inline o: Ptr[GDBusObject]): GDBusObject_autoptr = o
  extension (v: GDBusObject_autoptr)
    inline def value: Ptr[GDBusObject] = v

opaque type GDBusObject_listautoptr = Ptr[GList]
object GDBusObject_listautoptr: 
  given _tag: Tag[GDBusObject_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDBusObject_listautoptr = o
  extension (v: GDBusObject_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GDBusObject_queueautoptr = Ptr[GQueue]
object GDBusObject_queueautoptr: 
  given _tag: Tag[GDBusObject_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GDBusObject_queueautoptr = o
  extension (v: GDBusObject_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GDBusObject_slistautoptr = Ptr[GSList]
object GDBusObject_slistautoptr: 
  given _tag: Tag[GDBusObject_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDBusObject_slistautoptr = o
  extension (v: GDBusObject_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GDBusProxyTypeFunc = CFuncPtr4[Ptr[GDBusObjectManagerClient], Ptr[gchar], Ptr[gchar], gpointer, GType]
object GDBusProxyTypeFunc: 
  given _tag: Tag[GDBusProxyTypeFunc] = Tag.materializeCFuncPtr4[Ptr[GDBusObjectManagerClient], Ptr[gchar], Ptr[gchar], gpointer, GType]
  inline def apply(inline o: CFuncPtr4[Ptr[GDBusObjectManagerClient], Ptr[gchar], Ptr[gchar], gpointer, GType]): GDBusProxyTypeFunc = o
  extension (v: GDBusProxyTypeFunc)
    inline def value: CFuncPtr4[Ptr[GDBusObjectManagerClient], Ptr[gchar], Ptr[gchar], gpointer, GType] = v

opaque type GDBusProxy_autoptr = Ptr[GDBusProxy]
object GDBusProxy_autoptr: 
  given _tag: Tag[GDBusProxy_autoptr] = Tag.Ptr[GDBusProxy](GDBusProxy._tag)
  inline def apply(inline o: Ptr[GDBusProxy]): GDBusProxy_autoptr = o
  extension (v: GDBusProxy_autoptr)
    inline def value: Ptr[GDBusProxy] = v

opaque type GDBusProxy_listautoptr = Ptr[GList]
object GDBusProxy_listautoptr: 
  given _tag: Tag[GDBusProxy_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDBusProxy_listautoptr = o
  extension (v: GDBusProxy_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GDBusProxy_queueautoptr = Ptr[GQueue]
object GDBusProxy_queueautoptr: 
  given _tag: Tag[GDBusProxy_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GDBusProxy_queueautoptr = o
  extension (v: GDBusProxy_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GDBusProxy_slistautoptr = Ptr[GSList]
object GDBusProxy_slistautoptr: 
  given _tag: Tag[GDBusProxy_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDBusProxy_slistautoptr = o
  extension (v: GDBusProxy_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GDBusServer_autoptr = Ptr[GDBusServer]
object GDBusServer_autoptr: 
  given _tag: Tag[GDBusServer_autoptr] = Tag.Ptr[GDBusServer](GDBusServer._tag)
  inline def apply(inline o: Ptr[GDBusServer]): GDBusServer_autoptr = o
  extension (v: GDBusServer_autoptr)
    inline def value: Ptr[GDBusServer] = v

opaque type GDBusServer_listautoptr = Ptr[GList]
object GDBusServer_listautoptr: 
  given _tag: Tag[GDBusServer_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDBusServer_listautoptr = o
  extension (v: GDBusServer_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GDBusServer_queueautoptr = Ptr[GQueue]
object GDBusServer_queueautoptr: 
  given _tag: Tag[GDBusServer_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GDBusServer_queueautoptr = o
  extension (v: GDBusServer_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GDBusServer_slistautoptr = Ptr[GSList]
object GDBusServer_slistautoptr: 
  given _tag: Tag[GDBusServer_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDBusServer_slistautoptr = o
  extension (v: GDBusServer_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GDBusSignalCallback = CFuncPtr7[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[GVariant], gpointer, Unit]
object GDBusSignalCallback: 
  given _tag: Tag[GDBusSignalCallback] = Tag.materializeCFuncPtr7[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[GVariant], gpointer, Unit]
  inline def apply(inline o: CFuncPtr7[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[GVariant], gpointer, Unit]): GDBusSignalCallback = o
  extension (v: GDBusSignalCallback)
    inline def value: CFuncPtr7[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[GVariant], gpointer, Unit] = v

opaque type GDBusSubtreeDispatchFunc = CFuncPtr7[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[gpointer], gpointer, Ptr[GDBusInterfaceVTable]]
object GDBusSubtreeDispatchFunc: 
  given _tag: Tag[GDBusSubtreeDispatchFunc] = Tag.materializeCFuncPtr7[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[gpointer], gpointer, Ptr[GDBusInterfaceVTable]]
  inline def apply(inline o: CFuncPtr7[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[gpointer], gpointer, Ptr[GDBusInterfaceVTable]]): GDBusSubtreeDispatchFunc = o
  extension (v: GDBusSubtreeDispatchFunc)
    inline def value: CFuncPtr7[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[gchar], Ptr[gpointer], gpointer, Ptr[GDBusInterfaceVTable]] = v

opaque type GDBusSubtreeEnumerateFunc = CFuncPtr4[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], gpointer, Ptr[Ptr[gchar]]]
object GDBusSubtreeEnumerateFunc: 
  given _tag: Tag[GDBusSubtreeEnumerateFunc] = Tag.materializeCFuncPtr4[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], gpointer, Ptr[Ptr[gchar]]]
  inline def apply(inline o: CFuncPtr4[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], gpointer, Ptr[Ptr[gchar]]]): GDBusSubtreeEnumerateFunc = o
  extension (v: GDBusSubtreeEnumerateFunc)
    inline def value: CFuncPtr4[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], gpointer, Ptr[Ptr[gchar]]] = v

opaque type GDBusSubtreeIntrospectFunc = CFuncPtr5[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], Ptr[gchar], gpointer, Ptr[Ptr[GDBusInterfaceInfo]]]
object GDBusSubtreeIntrospectFunc: 
  given _tag: Tag[GDBusSubtreeIntrospectFunc] = Tag.materializeCFuncPtr5[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], Ptr[gchar], gpointer, Ptr[Ptr[GDBusInterfaceInfo]]]
  inline def apply(inline o: CFuncPtr5[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], Ptr[gchar], gpointer, Ptr[Ptr[GDBusInterfaceInfo]]]): GDBusSubtreeIntrospectFunc = o
  extension (v: GDBusSubtreeIntrospectFunc)
    inline def value: CFuncPtr5[Ptr[GDBusConnection], Ptr[gchar], Ptr[gchar], Ptr[gchar], gpointer, Ptr[Ptr[GDBusInterfaceInfo]]] = v

opaque type GDataForeachFunc = CFuncPtr3[GQuark, gpointer, gpointer, Unit]
object GDataForeachFunc: 
  given _tag: Tag[GDataForeachFunc] = Tag.materializeCFuncPtr3[GQuark, gpointer, gpointer, Unit]
  inline def apply(inline o: CFuncPtr3[GQuark, gpointer, gpointer, Unit]): GDataForeachFunc = o
  extension (v: GDataForeachFunc)
    inline def value: CFuncPtr3[GQuark, gpointer, gpointer, Unit] = v

opaque type GDataInputStream_autoptr = Ptr[GDataInputStream]
object GDataInputStream_autoptr: 
  given _tag: Tag[GDataInputStream_autoptr] = Tag.Ptr[GDataInputStream](GDataInputStream._tag)
  inline def apply(inline o: Ptr[GDataInputStream]): GDataInputStream_autoptr = o
  extension (v: GDataInputStream_autoptr)
    inline def value: Ptr[GDataInputStream] = v

opaque type GDataInputStream_listautoptr = Ptr[GList]
object GDataInputStream_listautoptr: 
  given _tag: Tag[GDataInputStream_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDataInputStream_listautoptr = o
  extension (v: GDataInputStream_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GDataInputStream_queueautoptr = Ptr[GQueue]
object GDataInputStream_queueautoptr: 
  given _tag: Tag[GDataInputStream_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GDataInputStream_queueautoptr = o
  extension (v: GDataInputStream_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GDataInputStream_slistautoptr = Ptr[GSList]
object GDataInputStream_slistautoptr: 
  given _tag: Tag[GDataInputStream_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDataInputStream_slistautoptr = o
  extension (v: GDataInputStream_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GDataOutputStream_autoptr = Ptr[GDataOutputStream]
object GDataOutputStream_autoptr: 
  given _tag: Tag[GDataOutputStream_autoptr] = Tag.Ptr[GDataOutputStream](GDataOutputStream._tag)
  inline def apply(inline o: Ptr[GDataOutputStream]): GDataOutputStream_autoptr = o
  extension (v: GDataOutputStream_autoptr)
    inline def value: Ptr[GDataOutputStream] = v

opaque type GDataOutputStream_listautoptr = Ptr[GList]
object GDataOutputStream_listautoptr: 
  given _tag: Tag[GDataOutputStream_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDataOutputStream_listautoptr = o
  extension (v: GDataOutputStream_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GDataOutputStream_queueautoptr = Ptr[GQueue]
object GDataOutputStream_queueautoptr: 
  given _tag: Tag[GDataOutputStream_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GDataOutputStream_queueautoptr = o
  extension (v: GDataOutputStream_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GDataOutputStream_slistautoptr = Ptr[GSList]
object GDataOutputStream_slistautoptr: 
  given _tag: Tag[GDataOutputStream_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDataOutputStream_slistautoptr = o
  extension (v: GDataOutputStream_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GDatagramBasedSourceFunc = CFuncPtr3[Ptr[GDatagramBased], GIOCondition, gpointer, gboolean]
object GDatagramBasedSourceFunc: 
  given _tag: Tag[GDatagramBasedSourceFunc] = Tag.materializeCFuncPtr3[Ptr[GDatagramBased], GIOCondition, gpointer, gboolean]
  inline def apply(inline o: CFuncPtr3[Ptr[GDatagramBased], GIOCondition, gpointer, gboolean]): GDatagramBasedSourceFunc = o
  extension (v: GDatagramBasedSourceFunc)
    inline def value: CFuncPtr3[Ptr[GDatagramBased], GIOCondition, gpointer, gboolean] = v

opaque type GDatagramBased_autoptr = Ptr[GDatagramBased]
object GDatagramBased_autoptr: 
  given _tag: Tag[GDatagramBased_autoptr] = Tag.Ptr[GDatagramBased](GDatagramBased._tag)
  inline def apply(inline o: Ptr[GDatagramBased]): GDatagramBased_autoptr = o
  extension (v: GDatagramBased_autoptr)
    inline def value: Ptr[GDatagramBased] = v

opaque type GDatagramBased_listautoptr = Ptr[GList]
object GDatagramBased_listautoptr: 
  given _tag: Tag[GDatagramBased_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDatagramBased_listautoptr = o
  extension (v: GDatagramBased_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GDatagramBased_queueautoptr = Ptr[GQueue]
object GDatagramBased_queueautoptr: 
  given _tag: Tag[GDatagramBased_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GDatagramBased_queueautoptr = o
  extension (v: GDatagramBased_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GDatagramBased_slistautoptr = Ptr[GSList]
object GDatagramBased_slistautoptr: 
  given _tag: Tag[GDatagramBased_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDatagramBased_slistautoptr = o
  extension (v: GDatagramBased_slistautoptr)
    inline def value: Ptr[GSList] = v

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

opaque type GDebugControllerDBusClass_autoptr = Ptr[GDebugControllerDBusClass]
object GDebugControllerDBusClass_autoptr: 
  given _tag: Tag[GDebugControllerDBusClass_autoptr] = Tag.Ptr[GDebugControllerDBusClass](GDebugControllerDBusClass._tag)
  inline def apply(inline o: Ptr[GDebugControllerDBusClass]): GDebugControllerDBusClass_autoptr = o
  extension (v: GDebugControllerDBusClass_autoptr)
    inline def value: Ptr[GDebugControllerDBusClass] = v

opaque type GDebugControllerDBusClass_listautoptr = Ptr[GList]
object GDebugControllerDBusClass_listautoptr: 
  given _tag: Tag[GDebugControllerDBusClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDebugControllerDBusClass_listautoptr = o
  extension (v: GDebugControllerDBusClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GDebugControllerDBusClass_queueautoptr = Ptr[GQueue]
object GDebugControllerDBusClass_queueautoptr: 
  given _tag: Tag[GDebugControllerDBusClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GDebugControllerDBusClass_queueautoptr = o
  extension (v: GDebugControllerDBusClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GDebugControllerDBusClass_slistautoptr = Ptr[GSList]
object GDebugControllerDBusClass_slistautoptr: 
  given _tag: Tag[GDebugControllerDBusClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDebugControllerDBusClass_slistautoptr = o
  extension (v: GDebugControllerDBusClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GDebugControllerDBus_autoptr = Ptr[GDebugControllerDBus]
object GDebugControllerDBus_autoptr: 
  given _tag: Tag[GDebugControllerDBus_autoptr] = Tag.Ptr[GDebugControllerDBus](GDebugControllerDBus._tag)
  inline def apply(inline o: Ptr[GDebugControllerDBus]): GDebugControllerDBus_autoptr = o
  extension (v: GDebugControllerDBus_autoptr)
    inline def value: Ptr[GDebugControllerDBus] = v

opaque type GDebugControllerDBus_listautoptr = Ptr[GList]
object GDebugControllerDBus_listautoptr: 
  given _tag: Tag[GDebugControllerDBus_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDebugControllerDBus_listautoptr = o
  extension (v: GDebugControllerDBus_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GDebugControllerDBus_queueautoptr = Ptr[GQueue]
object GDebugControllerDBus_queueautoptr: 
  given _tag: Tag[GDebugControllerDBus_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GDebugControllerDBus_queueautoptr = o
  extension (v: GDebugControllerDBus_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GDebugControllerDBus_slistautoptr = Ptr[GSList]
object GDebugControllerDBus_slistautoptr: 
  given _tag: Tag[GDebugControllerDBus_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDebugControllerDBus_slistautoptr = o
  extension (v: GDebugControllerDBus_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GDebugController_autoptr = Ptr[GDebugController]
object GDebugController_autoptr: 
  given _tag: Tag[GDebugController_autoptr] = Tag.Ptr[GDebugController](GDebugController._tag)
  inline def apply(inline o: Ptr[GDebugController]): GDebugController_autoptr = o
  extension (v: GDebugController_autoptr)
    inline def value: Ptr[GDebugController] = v

opaque type GDebugController_listautoptr = Ptr[GList]
object GDebugController_listautoptr: 
  given _tag: Tag[GDebugController_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDebugController_listautoptr = o
  extension (v: GDebugController_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GDebugController_queueautoptr = Ptr[GQueue]
object GDebugController_queueautoptr: 
  given _tag: Tag[GDebugController_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GDebugController_queueautoptr = o
  extension (v: GDebugController_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GDebugController_slistautoptr = Ptr[GSList]
object GDebugController_slistautoptr: 
  given _tag: Tag[GDebugController_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDebugController_slistautoptr = o
  extension (v: GDebugController_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GDestroyNotify = CFuncPtr1[gpointer, Unit]
object GDestroyNotify: 
  given _tag: Tag[GDestroyNotify] = Tag.materializeCFuncPtr1[gpointer, Unit]
  inline def apply(inline o: CFuncPtr1[gpointer, Unit]): GDestroyNotify = o
  extension (v: GDestroyNotify)
    inline def value: CFuncPtr1[gpointer, Unit] = v

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

opaque type GDrive_autoptr = Ptr[GDrive]
object GDrive_autoptr: 
  given _tag: Tag[GDrive_autoptr] = Tag.Ptr[GDrive](GDrive._tag)
  inline def apply(inline o: Ptr[GDrive]): GDrive_autoptr = o
  extension (v: GDrive_autoptr)
    inline def value: Ptr[GDrive] = v

opaque type GDrive_listautoptr = Ptr[GList]
object GDrive_listautoptr: 
  given _tag: Tag[GDrive_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDrive_listautoptr = o
  extension (v: GDrive_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GDrive_queueautoptr = Ptr[GQueue]
object GDrive_queueautoptr: 
  given _tag: Tag[GDrive_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GDrive_queueautoptr = o
  extension (v: GDrive_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GDrive_slistautoptr = Ptr[GSList]
object GDrive_slistautoptr: 
  given _tag: Tag[GDrive_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDrive_slistautoptr = o
  extension (v: GDrive_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GDuplicateFunc = CFuncPtr2[gpointer, gpointer, gpointer]
object GDuplicateFunc: 
  given _tag: Tag[GDuplicateFunc] = Tag.materializeCFuncPtr2[gpointer, gpointer, gpointer]
  inline def apply(inline o: CFuncPtr2[gpointer, gpointer, gpointer]): GDuplicateFunc = o
  extension (v: GDuplicateFunc)
    inline def value: CFuncPtr2[gpointer, gpointer, gpointer] = v

opaque type GEmblem_autoptr = Ptr[GEmblem]
object GEmblem_autoptr: 
  given _tag: Tag[GEmblem_autoptr] = Tag.Ptr[GEmblem](GEmblem._tag)
  inline def apply(inline o: Ptr[GEmblem]): GEmblem_autoptr = o
  extension (v: GEmblem_autoptr)
    inline def value: Ptr[GEmblem] = v

opaque type GEmblem_listautoptr = Ptr[GList]
object GEmblem_listautoptr: 
  given _tag: Tag[GEmblem_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GEmblem_listautoptr = o
  extension (v: GEmblem_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GEmblem_queueautoptr = Ptr[GQueue]
object GEmblem_queueautoptr: 
  given _tag: Tag[GEmblem_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GEmblem_queueautoptr = o
  extension (v: GEmblem_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GEmblem_slistautoptr = Ptr[GSList]
object GEmblem_slistautoptr: 
  given _tag: Tag[GEmblem_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GEmblem_slistautoptr = o
  extension (v: GEmblem_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GEmblemedIcon_autoptr = Ptr[GEmblemedIcon]
object GEmblemedIcon_autoptr: 
  given _tag: Tag[GEmblemedIcon_autoptr] = Tag.Ptr[GEmblemedIcon](GEmblemedIcon._tag)
  inline def apply(inline o: Ptr[GEmblemedIcon]): GEmblemedIcon_autoptr = o
  extension (v: GEmblemedIcon_autoptr)
    inline def value: Ptr[GEmblemedIcon] = v

opaque type GEmblemedIcon_listautoptr = Ptr[GList]
object GEmblemedIcon_listautoptr: 
  given _tag: Tag[GEmblemedIcon_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GEmblemedIcon_listautoptr = o
  extension (v: GEmblemedIcon_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GEmblemedIcon_queueautoptr = Ptr[GQueue]
object GEmblemedIcon_queueautoptr: 
  given _tag: Tag[GEmblemedIcon_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GEmblemedIcon_queueautoptr = o
  extension (v: GEmblemedIcon_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GEmblemedIcon_slistautoptr = Ptr[GSList]
object GEmblemedIcon_slistautoptr: 
  given _tag: Tag[GEmblemedIcon_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GEmblemedIcon_slistautoptr = o
  extension (v: GEmblemedIcon_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GEnumClass_autoptr = Ptr[GEnumClass]
object GEnumClass_autoptr: 
  given _tag: Tag[GEnumClass_autoptr] = Tag.Ptr[GEnumClass](GEnumClass._tag)
  inline def apply(inline o: Ptr[GEnumClass]): GEnumClass_autoptr = o
  extension (v: GEnumClass_autoptr)
    inline def value: Ptr[GEnumClass] = v

opaque type GEnumClass_listautoptr = Ptr[GList]
object GEnumClass_listautoptr: 
  given _tag: Tag[GEnumClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GEnumClass_listautoptr = o
  extension (v: GEnumClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GEnumClass_queueautoptr = Ptr[GQueue]
object GEnumClass_queueautoptr: 
  given _tag: Tag[GEnumClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GEnumClass_queueautoptr = o
  extension (v: GEnumClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GEnumClass_slistautoptr = Ptr[GSList]
object GEnumClass_slistautoptr: 
  given _tag: Tag[GEnumClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GEnumClass_slistautoptr = o
  extension (v: GEnumClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GEqualFunc = CFuncPtr2[gconstpointer, gconstpointer, gboolean]
object GEqualFunc: 
  given _tag: Tag[GEqualFunc] = Tag.materializeCFuncPtr2[gconstpointer, gconstpointer, gboolean]
  inline def apply(inline o: CFuncPtr2[gconstpointer, gconstpointer, gboolean]): GEqualFunc = o
  extension (v: GEqualFunc)
    inline def value: CFuncPtr2[gconstpointer, gconstpointer, gboolean] = v

opaque type GErrorClearFunc = CFuncPtr1[Ptr[GError], Unit]
object GErrorClearFunc: 
  given _tag: Tag[GErrorClearFunc] = Tag.materializeCFuncPtr1[Ptr[GError], Unit]
  inline def apply(inline o: CFuncPtr1[Ptr[GError], Unit]): GErrorClearFunc = o
  extension (v: GErrorClearFunc)
    inline def value: CFuncPtr1[Ptr[GError], Unit] = v

opaque type GErrorCopyFunc = CFuncPtr2[Ptr[GError], Ptr[GError], Unit]
object GErrorCopyFunc: 
  given _tag: Tag[GErrorCopyFunc] = Tag.materializeCFuncPtr2[Ptr[GError], Ptr[GError], Unit]
  inline def apply(inline o: CFuncPtr2[Ptr[GError], Ptr[GError], Unit]): GErrorCopyFunc = o
  extension (v: GErrorCopyFunc)
    inline def value: CFuncPtr2[Ptr[GError], Ptr[GError], Unit] = v

opaque type GErrorInitFunc = CFuncPtr1[Ptr[GError], Unit]
object GErrorInitFunc: 
  given _tag: Tag[GErrorInitFunc] = Tag.materializeCFuncPtr1[Ptr[GError], Unit]
  inline def apply(inline o: CFuncPtr1[Ptr[GError], Unit]): GErrorInitFunc = o
  extension (v: GErrorInitFunc)
    inline def value: CFuncPtr1[Ptr[GError], Unit] = v

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

opaque type GFileAttributeInfoList_autoptr = Ptr[GFileAttributeInfoList]
object GFileAttributeInfoList_autoptr: 
  given _tag: Tag[GFileAttributeInfoList_autoptr] = Tag.Ptr[GFileAttributeInfoList](GFileAttributeInfoList._tag)
  inline def apply(inline o: Ptr[GFileAttributeInfoList]): GFileAttributeInfoList_autoptr = o
  extension (v: GFileAttributeInfoList_autoptr)
    inline def value: Ptr[GFileAttributeInfoList] = v

opaque type GFileAttributeInfoList_listautoptr = Ptr[GList]
object GFileAttributeInfoList_listautoptr: 
  given _tag: Tag[GFileAttributeInfoList_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GFileAttributeInfoList_listautoptr = o
  extension (v: GFileAttributeInfoList_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GFileAttributeInfoList_queueautoptr = Ptr[GQueue]
object GFileAttributeInfoList_queueautoptr: 
  given _tag: Tag[GFileAttributeInfoList_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GFileAttributeInfoList_queueautoptr = o
  extension (v: GFileAttributeInfoList_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GFileAttributeInfoList_slistautoptr = Ptr[GSList]
object GFileAttributeInfoList_slistautoptr: 
  given _tag: Tag[GFileAttributeInfoList_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GFileAttributeInfoList_slistautoptr = o
  extension (v: GFileAttributeInfoList_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GFileEnumerator_autoptr = Ptr[GFileEnumerator]
object GFileEnumerator_autoptr: 
  given _tag: Tag[GFileEnumerator_autoptr] = Tag.Ptr[GFileEnumerator](GFileEnumerator._tag)
  inline def apply(inline o: Ptr[GFileEnumerator]): GFileEnumerator_autoptr = o
  extension (v: GFileEnumerator_autoptr)
    inline def value: Ptr[GFileEnumerator] = v

opaque type GFileEnumerator_listautoptr = Ptr[GList]
object GFileEnumerator_listautoptr: 
  given _tag: Tag[GFileEnumerator_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GFileEnumerator_listautoptr = o
  extension (v: GFileEnumerator_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GFileEnumerator_queueautoptr = Ptr[GQueue]
object GFileEnumerator_queueautoptr: 
  given _tag: Tag[GFileEnumerator_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GFileEnumerator_queueautoptr = o
  extension (v: GFileEnumerator_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GFileEnumerator_slistautoptr = Ptr[GSList]
object GFileEnumerator_slistautoptr: 
  given _tag: Tag[GFileEnumerator_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GFileEnumerator_slistautoptr = o
  extension (v: GFileEnumerator_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GFileIOStream_autoptr = Ptr[GFileIOStream]
object GFileIOStream_autoptr: 
  given _tag: Tag[GFileIOStream_autoptr] = Tag.Ptr[GFileIOStream](GFileIOStream._tag)
  inline def apply(inline o: Ptr[GFileIOStream]): GFileIOStream_autoptr = o
  extension (v: GFileIOStream_autoptr)
    inline def value: Ptr[GFileIOStream] = v

opaque type GFileIOStream_listautoptr = Ptr[GList]
object GFileIOStream_listautoptr: 
  given _tag: Tag[GFileIOStream_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GFileIOStream_listautoptr = o
  extension (v: GFileIOStream_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GFileIOStream_queueautoptr = Ptr[GQueue]
object GFileIOStream_queueautoptr: 
  given _tag: Tag[GFileIOStream_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GFileIOStream_queueautoptr = o
  extension (v: GFileIOStream_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GFileIOStream_slistautoptr = Ptr[GSList]
object GFileIOStream_slistautoptr: 
  given _tag: Tag[GFileIOStream_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GFileIOStream_slistautoptr = o
  extension (v: GFileIOStream_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GFileIcon_autoptr = Ptr[GFileIcon]
object GFileIcon_autoptr: 
  given _tag: Tag[GFileIcon_autoptr] = Tag.Ptr[GFileIcon](GFileIcon._tag)
  inline def apply(inline o: Ptr[GFileIcon]): GFileIcon_autoptr = o
  extension (v: GFileIcon_autoptr)
    inline def value: Ptr[GFileIcon] = v

opaque type GFileIcon_listautoptr = Ptr[GList]
object GFileIcon_listautoptr: 
  given _tag: Tag[GFileIcon_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GFileIcon_listautoptr = o
  extension (v: GFileIcon_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GFileIcon_queueautoptr = Ptr[GQueue]
object GFileIcon_queueautoptr: 
  given _tag: Tag[GFileIcon_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GFileIcon_queueautoptr = o
  extension (v: GFileIcon_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GFileIcon_slistautoptr = Ptr[GSList]
object GFileIcon_slistautoptr: 
  given _tag: Tag[GFileIcon_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GFileIcon_slistautoptr = o
  extension (v: GFileIcon_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GFileInfo_autoptr = Ptr[GFileInfo]
object GFileInfo_autoptr: 
  given _tag: Tag[GFileInfo_autoptr] = Tag.Ptr[GFileInfo](GFileInfo._tag)
  inline def apply(inline o: Ptr[GFileInfo]): GFileInfo_autoptr = o
  extension (v: GFileInfo_autoptr)
    inline def value: Ptr[GFileInfo] = v

opaque type GFileInfo_listautoptr = Ptr[GList]
object GFileInfo_listautoptr: 
  given _tag: Tag[GFileInfo_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GFileInfo_listautoptr = o
  extension (v: GFileInfo_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GFileInfo_queueautoptr = Ptr[GQueue]
object GFileInfo_queueautoptr: 
  given _tag: Tag[GFileInfo_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GFileInfo_queueautoptr = o
  extension (v: GFileInfo_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GFileInfo_slistautoptr = Ptr[GSList]
object GFileInfo_slistautoptr: 
  given _tag: Tag[GFileInfo_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GFileInfo_slistautoptr = o
  extension (v: GFileInfo_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GFileInputStream_autoptr = Ptr[GFileInputStream]
object GFileInputStream_autoptr: 
  given _tag: Tag[GFileInputStream_autoptr] = Tag.Ptr[GFileInputStream](GFileInputStream._tag)
  inline def apply(inline o: Ptr[GFileInputStream]): GFileInputStream_autoptr = o
  extension (v: GFileInputStream_autoptr)
    inline def value: Ptr[GFileInputStream] = v

opaque type GFileInputStream_listautoptr = Ptr[GList]
object GFileInputStream_listautoptr: 
  given _tag: Tag[GFileInputStream_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GFileInputStream_listautoptr = o
  extension (v: GFileInputStream_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GFileInputStream_queueautoptr = Ptr[GQueue]
object GFileInputStream_queueautoptr: 
  given _tag: Tag[GFileInputStream_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GFileInputStream_queueautoptr = o
  extension (v: GFileInputStream_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GFileInputStream_slistautoptr = Ptr[GSList]
object GFileInputStream_slistautoptr: 
  given _tag: Tag[GFileInputStream_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GFileInputStream_slistautoptr = o
  extension (v: GFileInputStream_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GFileMeasureProgressCallback = CFuncPtr5[gboolean, guint64, guint64, guint64, gpointer, Unit]
object GFileMeasureProgressCallback: 
  given _tag: Tag[GFileMeasureProgressCallback] = Tag.materializeCFuncPtr5[gboolean, guint64, guint64, guint64, gpointer, Unit]
  inline def apply(inline o: CFuncPtr5[gboolean, guint64, guint64, guint64, gpointer, Unit]): GFileMeasureProgressCallback = o
  extension (v: GFileMeasureProgressCallback)
    inline def value: CFuncPtr5[gboolean, guint64, guint64, guint64, gpointer, Unit] = v

opaque type GFileMonitor_autoptr = Ptr[GFileMonitor]
object GFileMonitor_autoptr: 
  given _tag: Tag[GFileMonitor_autoptr] = Tag.Ptr[GFileMonitor](GFileMonitor._tag)
  inline def apply(inline o: Ptr[GFileMonitor]): GFileMonitor_autoptr = o
  extension (v: GFileMonitor_autoptr)
    inline def value: Ptr[GFileMonitor] = v

opaque type GFileMonitor_listautoptr = Ptr[GList]
object GFileMonitor_listautoptr: 
  given _tag: Tag[GFileMonitor_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GFileMonitor_listautoptr = o
  extension (v: GFileMonitor_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GFileMonitor_queueautoptr = Ptr[GQueue]
object GFileMonitor_queueautoptr: 
  given _tag: Tag[GFileMonitor_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GFileMonitor_queueautoptr = o
  extension (v: GFileMonitor_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GFileMonitor_slistautoptr = Ptr[GSList]
object GFileMonitor_slistautoptr: 
  given _tag: Tag[GFileMonitor_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GFileMonitor_slistautoptr = o
  extension (v: GFileMonitor_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GFileOutputStream_autoptr = Ptr[GFileOutputStream]
object GFileOutputStream_autoptr: 
  given _tag: Tag[GFileOutputStream_autoptr] = Tag.Ptr[GFileOutputStream](GFileOutputStream._tag)
  inline def apply(inline o: Ptr[GFileOutputStream]): GFileOutputStream_autoptr = o
  extension (v: GFileOutputStream_autoptr)
    inline def value: Ptr[GFileOutputStream] = v

opaque type GFileOutputStream_listautoptr = Ptr[GList]
object GFileOutputStream_listautoptr: 
  given _tag: Tag[GFileOutputStream_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GFileOutputStream_listautoptr = o
  extension (v: GFileOutputStream_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GFileOutputStream_queueautoptr = Ptr[GQueue]
object GFileOutputStream_queueautoptr: 
  given _tag: Tag[GFileOutputStream_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GFileOutputStream_queueautoptr = o
  extension (v: GFileOutputStream_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GFileOutputStream_slistautoptr = Ptr[GSList]
object GFileOutputStream_slistautoptr: 
  given _tag: Tag[GFileOutputStream_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GFileOutputStream_slistautoptr = o
  extension (v: GFileOutputStream_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GFileProgressCallback = CFuncPtr3[goffset, goffset, gpointer, Unit]
object GFileProgressCallback: 
  given _tag: Tag[GFileProgressCallback] = Tag.materializeCFuncPtr3[goffset, goffset, gpointer, Unit]
  inline def apply(inline o: CFuncPtr3[goffset, goffset, gpointer, Unit]): GFileProgressCallback = o
  extension (v: GFileProgressCallback)
    inline def value: CFuncPtr3[goffset, goffset, gpointer, Unit] = v

opaque type GFileReadMoreCallback = CFuncPtr3[CString, goffset, gpointer, gboolean]
object GFileReadMoreCallback: 
  given _tag: Tag[GFileReadMoreCallback] = Tag.materializeCFuncPtr3[CString, goffset, gpointer, gboolean]
  inline def apply(inline o: CFuncPtr3[CString, goffset, gpointer, gboolean]): GFileReadMoreCallback = o
  extension (v: GFileReadMoreCallback)
    inline def value: CFuncPtr3[CString, goffset, gpointer, gboolean] = v

opaque type GFile_autoptr = Ptr[GFile]
object GFile_autoptr: 
  given _tag: Tag[GFile_autoptr] = Tag.Ptr[GFile](GFile._tag)
  inline def apply(inline o: Ptr[GFile]): GFile_autoptr = o
  extension (v: GFile_autoptr)
    inline def value: Ptr[GFile] = v

opaque type GFile_listautoptr = Ptr[GList]
object GFile_listautoptr: 
  given _tag: Tag[GFile_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GFile_listautoptr = o
  extension (v: GFile_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GFile_queueautoptr = Ptr[GQueue]
object GFile_queueautoptr: 
  given _tag: Tag[GFile_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GFile_queueautoptr = o
  extension (v: GFile_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GFile_slistautoptr = Ptr[GSList]
object GFile_slistautoptr: 
  given _tag: Tag[GFile_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GFile_slistautoptr = o
  extension (v: GFile_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GFilenameCompleter_autoptr = Ptr[GFilenameCompleter]
object GFilenameCompleter_autoptr: 
  given _tag: Tag[GFilenameCompleter_autoptr] = Tag.Ptr[GFilenameCompleter](GFilenameCompleter._tag)
  inline def apply(inline o: Ptr[GFilenameCompleter]): GFilenameCompleter_autoptr = o
  extension (v: GFilenameCompleter_autoptr)
    inline def value: Ptr[GFilenameCompleter] = v

opaque type GFilenameCompleter_listautoptr = Ptr[GList]
object GFilenameCompleter_listautoptr: 
  given _tag: Tag[GFilenameCompleter_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GFilenameCompleter_listautoptr = o
  extension (v: GFilenameCompleter_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GFilenameCompleter_queueautoptr = Ptr[GQueue]
object GFilenameCompleter_queueautoptr: 
  given _tag: Tag[GFilenameCompleter_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GFilenameCompleter_queueautoptr = o
  extension (v: GFilenameCompleter_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GFilenameCompleter_slistautoptr = Ptr[GSList]
object GFilenameCompleter_slistautoptr: 
  given _tag: Tag[GFilenameCompleter_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GFilenameCompleter_slistautoptr = o
  extension (v: GFilenameCompleter_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GFilterInputStream_autoptr = Ptr[GFilterInputStream]
object GFilterInputStream_autoptr: 
  given _tag: Tag[GFilterInputStream_autoptr] = Tag.Ptr[GFilterInputStream](GFilterInputStream._tag)
  inline def apply(inline o: Ptr[GFilterInputStream]): GFilterInputStream_autoptr = o
  extension (v: GFilterInputStream_autoptr)
    inline def value: Ptr[GFilterInputStream] = v

opaque type GFilterInputStream_listautoptr = Ptr[GList]
object GFilterInputStream_listautoptr: 
  given _tag: Tag[GFilterInputStream_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GFilterInputStream_listautoptr = o
  extension (v: GFilterInputStream_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GFilterInputStream_queueautoptr = Ptr[GQueue]
object GFilterInputStream_queueautoptr: 
  given _tag: Tag[GFilterInputStream_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GFilterInputStream_queueautoptr = o
  extension (v: GFilterInputStream_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GFilterInputStream_slistautoptr = Ptr[GSList]
object GFilterInputStream_slistautoptr: 
  given _tag: Tag[GFilterInputStream_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GFilterInputStream_slistautoptr = o
  extension (v: GFilterInputStream_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GFilterOutputStream_autoptr = Ptr[GFilterOutputStream]
object GFilterOutputStream_autoptr: 
  given _tag: Tag[GFilterOutputStream_autoptr] = Tag.Ptr[GFilterOutputStream](GFilterOutputStream._tag)
  inline def apply(inline o: Ptr[GFilterOutputStream]): GFilterOutputStream_autoptr = o
  extension (v: GFilterOutputStream_autoptr)
    inline def value: Ptr[GFilterOutputStream] = v

opaque type GFilterOutputStream_listautoptr = Ptr[GList]
object GFilterOutputStream_listautoptr: 
  given _tag: Tag[GFilterOutputStream_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GFilterOutputStream_listautoptr = o
  extension (v: GFilterOutputStream_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GFilterOutputStream_queueautoptr = Ptr[GQueue]
object GFilterOutputStream_queueautoptr: 
  given _tag: Tag[GFilterOutputStream_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GFilterOutputStream_queueautoptr = o
  extension (v: GFilterOutputStream_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GFilterOutputStream_slistautoptr = Ptr[GSList]
object GFilterOutputStream_slistautoptr: 
  given _tag: Tag[GFilterOutputStream_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GFilterOutputStream_slistautoptr = o
  extension (v: GFilterOutputStream_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GFlagsClass_autoptr = Ptr[GFlagsClass]
object GFlagsClass_autoptr: 
  given _tag: Tag[GFlagsClass_autoptr] = Tag.Ptr[GFlagsClass](GFlagsClass._tag)
  inline def apply(inline o: Ptr[GFlagsClass]): GFlagsClass_autoptr = o
  extension (v: GFlagsClass_autoptr)
    inline def value: Ptr[GFlagsClass] = v

opaque type GFlagsClass_listautoptr = Ptr[GList]
object GFlagsClass_listautoptr: 
  given _tag: Tag[GFlagsClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GFlagsClass_listautoptr = o
  extension (v: GFlagsClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GFlagsClass_queueautoptr = Ptr[GQueue]
object GFlagsClass_queueautoptr: 
  given _tag: Tag[GFlagsClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GFlagsClass_queueautoptr = o
  extension (v: GFlagsClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GFlagsClass_slistautoptr = Ptr[GSList]
object GFlagsClass_slistautoptr: 
  given _tag: Tag[GFlagsClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GFlagsClass_slistautoptr = o
  extension (v: GFlagsClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GFreeFunc = CFuncPtr1[gpointer, Unit]
object GFreeFunc: 
  given _tag: Tag[GFreeFunc] = Tag.materializeCFuncPtr1[gpointer, Unit]
  inline def apply(inline o: CFuncPtr1[gpointer, Unit]): GFreeFunc = o
  extension (v: GFreeFunc)
    inline def value: CFuncPtr1[gpointer, Unit] = v

opaque type GFunc = CFuncPtr2[gpointer, gpointer, Unit]
object GFunc: 
  given _tag: Tag[GFunc] = Tag.materializeCFuncPtr2[gpointer, gpointer, Unit]
  inline def apply(inline o: CFuncPtr2[gpointer, gpointer, Unit]): GFunc = o
  extension (v: GFunc)
    inline def value: CFuncPtr2[gpointer, gpointer, Unit] = v

opaque type GHFunc = CFuncPtr3[gpointer, gpointer, gpointer, Unit]
object GHFunc: 
  given _tag: Tag[GHFunc] = Tag.materializeCFuncPtr3[gpointer, gpointer, gpointer, Unit]
  inline def apply(inline o: CFuncPtr3[gpointer, gpointer, gpointer, Unit]): GHFunc = o
  extension (v: GHFunc)
    inline def value: CFuncPtr3[gpointer, gpointer, gpointer, Unit] = v

opaque type GHRFunc = CFuncPtr3[gpointer, gpointer, gpointer, gboolean]
object GHRFunc: 
  given _tag: Tag[GHRFunc] = Tag.materializeCFuncPtr3[gpointer, gpointer, gpointer, gboolean]
  inline def apply(inline o: CFuncPtr3[gpointer, gpointer, gpointer, gboolean]): GHRFunc = o
  extension (v: GHRFunc)
    inline def value: CFuncPtr3[gpointer, gpointer, gpointer, gboolean] = v

opaque type GHashFunc = CFuncPtr1[gconstpointer, guint]
object GHashFunc: 
  given _tag: Tag[GHashFunc] = Tag.materializeCFuncPtr1[gconstpointer, guint]
  inline def apply(inline o: CFuncPtr1[gconstpointer, guint]): GHashFunc = o
  extension (v: GHashFunc)
    inline def value: CFuncPtr1[gconstpointer, guint] = v

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
  inline def apply(inline o: CFuncPtr1[gpointer, gboolean]): GHookCheckFunc = o
  extension (v: GHookCheckFunc)
    inline def value: CFuncPtr1[gpointer, gboolean] = v

opaque type GHookCheckMarshaller = CFuncPtr2[Ptr[GHook], gpointer, gboolean]
object GHookCheckMarshaller: 
  given _tag: Tag[GHookCheckMarshaller] = Tag.materializeCFuncPtr2[Ptr[GHook], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr2[Ptr[GHook], gpointer, gboolean]): GHookCheckMarshaller = o
  extension (v: GHookCheckMarshaller)
    inline def value: CFuncPtr2[Ptr[GHook], gpointer, gboolean] = v

opaque type GHookCompareFunc = CFuncPtr2[Ptr[GHook], Ptr[GHook], gint]
object GHookCompareFunc: 
  given _tag: Tag[GHookCompareFunc] = Tag.materializeCFuncPtr2[Ptr[GHook], Ptr[GHook], gint]
  inline def apply(inline o: CFuncPtr2[Ptr[GHook], Ptr[GHook], gint]): GHookCompareFunc = o
  extension (v: GHookCompareFunc)
    inline def value: CFuncPtr2[Ptr[GHook], Ptr[GHook], gint] = v

opaque type GHookFinalizeFunc = CFuncPtr2[Ptr[GHookList], Ptr[GHook], Unit]
object GHookFinalizeFunc: 
  given _tag: Tag[GHookFinalizeFunc] = Tag.materializeCFuncPtr2[Ptr[GHookList], Ptr[GHook], Unit]
  inline def apply(inline o: CFuncPtr2[Ptr[GHookList], Ptr[GHook], Unit]): GHookFinalizeFunc = o
  extension (v: GHookFinalizeFunc)
    inline def value: CFuncPtr2[Ptr[GHookList], Ptr[GHook], Unit] = v

opaque type GHookFindFunc = CFuncPtr2[Ptr[GHook], gpointer, gboolean]
object GHookFindFunc: 
  given _tag: Tag[GHookFindFunc] = Tag.materializeCFuncPtr2[Ptr[GHook], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr2[Ptr[GHook], gpointer, gboolean]): GHookFindFunc = o
  extension (v: GHookFindFunc)
    inline def value: CFuncPtr2[Ptr[GHook], gpointer, gboolean] = v

opaque type GHookFunc = CFuncPtr1[gpointer, Unit]
object GHookFunc: 
  given _tag: Tag[GHookFunc] = Tag.materializeCFuncPtr1[gpointer, Unit]
  inline def apply(inline o: CFuncPtr1[gpointer, Unit]): GHookFunc = o
  extension (v: GHookFunc)
    inline def value: CFuncPtr1[gpointer, Unit] = v

opaque type GHookMarshaller = CFuncPtr2[Ptr[GHook], gpointer, Unit]
object GHookMarshaller: 
  given _tag: Tag[GHookMarshaller] = Tag.materializeCFuncPtr2[Ptr[GHook], gpointer, Unit]
  inline def apply(inline o: CFuncPtr2[Ptr[GHook], gpointer, Unit]): GHookMarshaller = o
  extension (v: GHookMarshaller)
    inline def value: CFuncPtr2[Ptr[GHook], gpointer, Unit] = v

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
  inline def apply(inline o: CFuncPtr3[Ptr[GIOChannel], GIOCondition, gpointer, gboolean]): GIOFunc = o
  extension (v: GIOFunc)
    inline def value: CFuncPtr3[Ptr[GIOChannel], GIOCondition, gpointer, gboolean] = v

opaque type GIOModule_autoptr = Ptr[GIOModule]
object GIOModule_autoptr: 
  given _tag: Tag[GIOModule_autoptr] = Tag.Ptr[GIOModule](GIOModule._tag)
  inline def apply(inline o: Ptr[GIOModule]): GIOModule_autoptr = o
  extension (v: GIOModule_autoptr)
    inline def value: Ptr[GIOModule] = v

opaque type GIOModule_listautoptr = Ptr[GList]
object GIOModule_listautoptr: 
  given _tag: Tag[GIOModule_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GIOModule_listautoptr = o
  extension (v: GIOModule_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GIOModule_queueautoptr = Ptr[GQueue]
object GIOModule_queueautoptr: 
  given _tag: Tag[GIOModule_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GIOModule_queueautoptr = o
  extension (v: GIOModule_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GIOModule_slistautoptr = Ptr[GSList]
object GIOModule_slistautoptr: 
  given _tag: Tag[GIOModule_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GIOModule_slistautoptr = o
  extension (v: GIOModule_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GIOSchedulerJobFunc = CFuncPtr3[Ptr[GIOSchedulerJob], Ptr[GCancellable], gpointer, gboolean]
object GIOSchedulerJobFunc: 
  given _tag: Tag[GIOSchedulerJobFunc] = Tag.materializeCFuncPtr3[Ptr[GIOSchedulerJob], Ptr[GCancellable], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr3[Ptr[GIOSchedulerJob], Ptr[GCancellable], gpointer, gboolean]): GIOSchedulerJobFunc = o
  extension (v: GIOSchedulerJobFunc)
    inline def value: CFuncPtr3[Ptr[GIOSchedulerJob], Ptr[GCancellable], gpointer, gboolean] = v

opaque type GIOStream_autoptr = Ptr[GIOStream]
object GIOStream_autoptr: 
  given _tag: Tag[GIOStream_autoptr] = Tag.Ptr[GIOStream](GIOStream._tag)
  inline def apply(inline o: Ptr[GIOStream]): GIOStream_autoptr = o
  extension (v: GIOStream_autoptr)
    inline def value: Ptr[GIOStream] = v

opaque type GIOStream_listautoptr = Ptr[GList]
object GIOStream_listautoptr: 
  given _tag: Tag[GIOStream_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GIOStream_listautoptr = o
  extension (v: GIOStream_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GIOStream_queueautoptr = Ptr[GQueue]
object GIOStream_queueautoptr: 
  given _tag: Tag[GIOStream_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GIOStream_queueautoptr = o
  extension (v: GIOStream_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GIOStream_slistautoptr = Ptr[GSList]
object GIOStream_slistautoptr: 
  given _tag: Tag[GIOStream_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GIOStream_slistautoptr = o
  extension (v: GIOStream_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GIcon_autoptr = Ptr[GIcon]
object GIcon_autoptr: 
  given _tag: Tag[GIcon_autoptr] = Tag.Ptr[GIcon](GIcon._tag)
  inline def apply(inline o: Ptr[GIcon]): GIcon_autoptr = o
  extension (v: GIcon_autoptr)
    inline def value: Ptr[GIcon] = v

opaque type GIcon_listautoptr = Ptr[GList]
object GIcon_listautoptr: 
  given _tag: Tag[GIcon_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GIcon_listautoptr = o
  extension (v: GIcon_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GIcon_queueautoptr = Ptr[GQueue]
object GIcon_queueautoptr: 
  given _tag: Tag[GIcon_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GIcon_queueautoptr = o
  extension (v: GIcon_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GIcon_slistautoptr = Ptr[GSList]
object GIcon_slistautoptr: 
  given _tag: Tag[GIcon_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GIcon_slistautoptr = o
  extension (v: GIcon_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GInetAddressMask_autoptr = Ptr[GInetAddressMask]
object GInetAddressMask_autoptr: 
  given _tag: Tag[GInetAddressMask_autoptr] = Tag.Ptr[GInetAddressMask](GInetAddressMask._tag)
  inline def apply(inline o: Ptr[GInetAddressMask]): GInetAddressMask_autoptr = o
  extension (v: GInetAddressMask_autoptr)
    inline def value: Ptr[GInetAddressMask] = v

opaque type GInetAddressMask_listautoptr = Ptr[GList]
object GInetAddressMask_listautoptr: 
  given _tag: Tag[GInetAddressMask_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GInetAddressMask_listautoptr = o
  extension (v: GInetAddressMask_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GInetAddressMask_queueautoptr = Ptr[GQueue]
object GInetAddressMask_queueautoptr: 
  given _tag: Tag[GInetAddressMask_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GInetAddressMask_queueautoptr = o
  extension (v: GInetAddressMask_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GInetAddressMask_slistautoptr = Ptr[GSList]
object GInetAddressMask_slistautoptr: 
  given _tag: Tag[GInetAddressMask_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GInetAddressMask_slistautoptr = o
  extension (v: GInetAddressMask_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GInetAddress_autoptr = Ptr[GInetAddress]
object GInetAddress_autoptr: 
  given _tag: Tag[GInetAddress_autoptr] = Tag.Ptr[GInetAddress](GInetAddress._tag)
  inline def apply(inline o: Ptr[GInetAddress]): GInetAddress_autoptr = o
  extension (v: GInetAddress_autoptr)
    inline def value: Ptr[GInetAddress] = v

opaque type GInetAddress_listautoptr = Ptr[GList]
object GInetAddress_listautoptr: 
  given _tag: Tag[GInetAddress_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GInetAddress_listautoptr = o
  extension (v: GInetAddress_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GInetAddress_queueautoptr = Ptr[GQueue]
object GInetAddress_queueautoptr: 
  given _tag: Tag[GInetAddress_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GInetAddress_queueautoptr = o
  extension (v: GInetAddress_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GInetAddress_slistautoptr = Ptr[GSList]
object GInetAddress_slistautoptr: 
  given _tag: Tag[GInetAddress_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GInetAddress_slistautoptr = o
  extension (v: GInetAddress_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GInetSocketAddress_autoptr = Ptr[GInetSocketAddress]
object GInetSocketAddress_autoptr: 
  given _tag: Tag[GInetSocketAddress_autoptr] = Tag.Ptr[GInetSocketAddress](GInetSocketAddress._tag)
  inline def apply(inline o: Ptr[GInetSocketAddress]): GInetSocketAddress_autoptr = o
  extension (v: GInetSocketAddress_autoptr)
    inline def value: Ptr[GInetSocketAddress] = v

opaque type GInetSocketAddress_listautoptr = Ptr[GList]
object GInetSocketAddress_listautoptr: 
  given _tag: Tag[GInetSocketAddress_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GInetSocketAddress_listautoptr = o
  extension (v: GInetSocketAddress_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GInetSocketAddress_queueautoptr = Ptr[GQueue]
object GInetSocketAddress_queueautoptr: 
  given _tag: Tag[GInetSocketAddress_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GInetSocketAddress_queueautoptr = o
  extension (v: GInetSocketAddress_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GInetSocketAddress_slistautoptr = Ptr[GSList]
object GInetSocketAddress_slistautoptr: 
  given _tag: Tag[GInetSocketAddress_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GInetSocketAddress_slistautoptr = o
  extension (v: GInetSocketAddress_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GInitable_autoptr = Ptr[GInitable]
object GInitable_autoptr: 
  given _tag: Tag[GInitable_autoptr] = Tag.Ptr[GInitable](GInitable._tag)
  inline def apply(inline o: Ptr[GInitable]): GInitable_autoptr = o
  extension (v: GInitable_autoptr)
    inline def value: Ptr[GInitable] = v

opaque type GInitable_listautoptr = Ptr[GList]
object GInitable_listautoptr: 
  given _tag: Tag[GInitable_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GInitable_listautoptr = o
  extension (v: GInitable_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GInitable_queueautoptr = Ptr[GQueue]
object GInitable_queueautoptr: 
  given _tag: Tag[GInitable_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GInitable_queueautoptr = o
  extension (v: GInitable_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GInitable_slistautoptr = Ptr[GSList]
object GInitable_slistautoptr: 
  given _tag: Tag[GInitable_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GInitable_slistautoptr = o
  extension (v: GInitable_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GInitiallyUnowned_autoptr = Ptr[GInitiallyUnowned]
object GInitiallyUnowned_autoptr: 
  given _tag: Tag[GInitiallyUnowned_autoptr] = Tag.Ptr[GInitiallyUnowned](GInitiallyUnowned._tag)
  inline def apply(inline o: Ptr[GInitiallyUnowned]): GInitiallyUnowned_autoptr = o
  extension (v: GInitiallyUnowned_autoptr)
    inline def value: Ptr[GInitiallyUnowned] = v

opaque type GInitiallyUnowned_listautoptr = Ptr[GList]
object GInitiallyUnowned_listautoptr: 
  given _tag: Tag[GInitiallyUnowned_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GInitiallyUnowned_listautoptr = o
  extension (v: GInitiallyUnowned_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GInitiallyUnowned_queueautoptr = Ptr[GQueue]
object GInitiallyUnowned_queueautoptr: 
  given _tag: Tag[GInitiallyUnowned_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GInitiallyUnowned_queueautoptr = o
  extension (v: GInitiallyUnowned_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GInitiallyUnowned_slistautoptr = Ptr[GSList]
object GInitiallyUnowned_slistautoptr: 
  given _tag: Tag[GInitiallyUnowned_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GInitiallyUnowned_slistautoptr = o
  extension (v: GInitiallyUnowned_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GInputStream_autoptr = Ptr[GInputStream]
object GInputStream_autoptr: 
  given _tag: Tag[GInputStream_autoptr] = Tag.Ptr[GInputStream](GInputStream._tag)
  inline def apply(inline o: Ptr[GInputStream]): GInputStream_autoptr = o
  extension (v: GInputStream_autoptr)
    inline def value: Ptr[GInputStream] = v

opaque type GInputStream_listautoptr = Ptr[GList]
object GInputStream_listautoptr: 
  given _tag: Tag[GInputStream_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GInputStream_listautoptr = o
  extension (v: GInputStream_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GInputStream_queueautoptr = Ptr[GQueue]
object GInputStream_queueautoptr: 
  given _tag: Tag[GInputStream_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GInputStream_queueautoptr = o
  extension (v: GInputStream_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GInputStream_slistautoptr = Ptr[GSList]
object GInputStream_slistautoptr: 
  given _tag: Tag[GInputStream_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GInputStream_slistautoptr = o
  extension (v: GInputStream_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GInstanceInitFunc = CFuncPtr2[Ptr[GTypeInstance], gpointer, Unit]
object GInstanceInitFunc: 
  given _tag: Tag[GInstanceInitFunc] = Tag.materializeCFuncPtr2[Ptr[GTypeInstance], gpointer, Unit]
  inline def apply(inline o: CFuncPtr2[Ptr[GTypeInstance], gpointer, Unit]): GInstanceInitFunc = o
  extension (v: GInstanceInitFunc)
    inline def value: CFuncPtr2[Ptr[GTypeInstance], gpointer, Unit] = v

opaque type GInterfaceFinalizeFunc = CFuncPtr2[gpointer, gpointer, Unit]
object GInterfaceFinalizeFunc: 
  given _tag: Tag[GInterfaceFinalizeFunc] = Tag.materializeCFuncPtr2[gpointer, gpointer, Unit]
  inline def apply(inline o: CFuncPtr2[gpointer, gpointer, Unit]): GInterfaceFinalizeFunc = o
  extension (v: GInterfaceFinalizeFunc)
    inline def value: CFuncPtr2[gpointer, gpointer, Unit] = v

opaque type GInterfaceInitFunc = CFuncPtr2[gpointer, gpointer, Unit]
object GInterfaceInitFunc: 
  given _tag: Tag[GInterfaceInitFunc] = Tag.materializeCFuncPtr2[gpointer, gpointer, Unit]
  inline def apply(inline o: CFuncPtr2[gpointer, gpointer, Unit]): GInterfaceInitFunc = o
  extension (v: GInterfaceInitFunc)
    inline def value: CFuncPtr2[gpointer, gpointer, Unit] = v

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

opaque type GListModel_autoptr = Ptr[GListModel]
object GListModel_autoptr: 
  given _tag: Tag[GListModel_autoptr] = Tag.Ptr[GListModel](GListModel._tag)
  inline def apply(inline o: Ptr[GListModel]): GListModel_autoptr = o
  extension (v: GListModel_autoptr)
    inline def value: Ptr[GListModel] = v

opaque type GListModel_listautoptr = Ptr[GList]
object GListModel_listautoptr: 
  given _tag: Tag[GListModel_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GListModel_listautoptr = o
  extension (v: GListModel_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GListModel_queueautoptr = Ptr[GQueue]
object GListModel_queueautoptr: 
  given _tag: Tag[GListModel_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GListModel_queueautoptr = o
  extension (v: GListModel_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GListModel_slistautoptr = Ptr[GSList]
object GListModel_slistautoptr: 
  given _tag: Tag[GListModel_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GListModel_slistautoptr = o
  extension (v: GListModel_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GListStoreClass_autoptr = Ptr[GListStoreClass]
object GListStoreClass_autoptr: 
  given _tag: Tag[GListStoreClass_autoptr] = Tag.Ptr[GListStoreClass](GListStoreClass._tag)
  inline def apply(inline o: Ptr[GListStoreClass]): GListStoreClass_autoptr = o
  extension (v: GListStoreClass_autoptr)
    inline def value: Ptr[GListStoreClass] = v

opaque type GListStoreClass_listautoptr = Ptr[GList]
object GListStoreClass_listautoptr: 
  given _tag: Tag[GListStoreClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GListStoreClass_listautoptr = o
  extension (v: GListStoreClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GListStoreClass_queueautoptr = Ptr[GQueue]
object GListStoreClass_queueautoptr: 
  given _tag: Tag[GListStoreClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GListStoreClass_queueautoptr = o
  extension (v: GListStoreClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GListStoreClass_slistautoptr = Ptr[GSList]
object GListStoreClass_slistautoptr: 
  given _tag: Tag[GListStoreClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GListStoreClass_slistautoptr = o
  extension (v: GListStoreClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GListStore_autoptr = Ptr[GListStore]
object GListStore_autoptr: 
  given _tag: Tag[GListStore_autoptr] = Tag.Ptr[GListStore](GListStore._tag)
  inline def apply(inline o: Ptr[GListStore]): GListStore_autoptr = o
  extension (v: GListStore_autoptr)
    inline def value: Ptr[GListStore] = v

opaque type GListStore_listautoptr = Ptr[GList]
object GListStore_listautoptr: 
  given _tag: Tag[GListStore_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GListStore_listautoptr = o
  extension (v: GListStore_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GListStore_queueautoptr = Ptr[GQueue]
object GListStore_queueautoptr: 
  given _tag: Tag[GListStore_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GListStore_queueautoptr = o
  extension (v: GListStore_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GListStore_slistautoptr = Ptr[GSList]
object GListStore_slistautoptr: 
  given _tag: Tag[GListStore_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GListStore_slistautoptr = o
  extension (v: GListStore_slistautoptr)
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

opaque type GLoadableIcon_autoptr = Ptr[GLoadableIcon]
object GLoadableIcon_autoptr: 
  given _tag: Tag[GLoadableIcon_autoptr] = Tag.Ptr[GLoadableIcon](GLoadableIcon._tag)
  inline def apply(inline o: Ptr[GLoadableIcon]): GLoadableIcon_autoptr = o
  extension (v: GLoadableIcon_autoptr)
    inline def value: Ptr[GLoadableIcon] = v

opaque type GLoadableIcon_listautoptr = Ptr[GList]
object GLoadableIcon_listautoptr: 
  given _tag: Tag[GLoadableIcon_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GLoadableIcon_listautoptr = o
  extension (v: GLoadableIcon_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GLoadableIcon_queueautoptr = Ptr[GQueue]
object GLoadableIcon_queueautoptr: 
  given _tag: Tag[GLoadableIcon_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GLoadableIcon_queueautoptr = o
  extension (v: GLoadableIcon_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GLoadableIcon_slistautoptr = Ptr[GSList]
object GLoadableIcon_slistautoptr: 
  given _tag: Tag[GLoadableIcon_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GLoadableIcon_slistautoptr = o
  extension (v: GLoadableIcon_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GLogFunc = CFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, Unit]
object GLogFunc: 
  given _tag: Tag[GLogFunc] = Tag.materializeCFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, Unit]
  inline def apply(inline o: CFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, Unit]): GLogFunc = o
  extension (v: GLogFunc)
    inline def value: CFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, Unit] = v

opaque type GLogWriterFunc = CFuncPtr4[GLogLevelFlags, Ptr[GLogField], gsize, gpointer, GLogWriterOutput]
object GLogWriterFunc: 
  given _tag: Tag[GLogWriterFunc] = Tag.materializeCFuncPtr4[GLogLevelFlags, Ptr[GLogField], gsize, gpointer, GLogWriterOutput]
  inline def apply(inline o: CFuncPtr4[GLogLevelFlags, Ptr[GLogField], gsize, gpointer, GLogWriterOutput]): GLogWriterFunc = o
  extension (v: GLogWriterFunc)
    inline def value: CFuncPtr4[GLogLevelFlags, Ptr[GLogField], gsize, gpointer, GLogWriterOutput] = v

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

opaque type GMemoryInputStream_autoptr = Ptr[GMemoryInputStream]
object GMemoryInputStream_autoptr: 
  given _tag: Tag[GMemoryInputStream_autoptr] = Tag.Ptr[GMemoryInputStream](GMemoryInputStream._tag)
  inline def apply(inline o: Ptr[GMemoryInputStream]): GMemoryInputStream_autoptr = o
  extension (v: GMemoryInputStream_autoptr)
    inline def value: Ptr[GMemoryInputStream] = v

opaque type GMemoryInputStream_listautoptr = Ptr[GList]
object GMemoryInputStream_listautoptr: 
  given _tag: Tag[GMemoryInputStream_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GMemoryInputStream_listautoptr = o
  extension (v: GMemoryInputStream_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GMemoryInputStream_queueautoptr = Ptr[GQueue]
object GMemoryInputStream_queueautoptr: 
  given _tag: Tag[GMemoryInputStream_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GMemoryInputStream_queueautoptr = o
  extension (v: GMemoryInputStream_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GMemoryInputStream_slistautoptr = Ptr[GSList]
object GMemoryInputStream_slistautoptr: 
  given _tag: Tag[GMemoryInputStream_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GMemoryInputStream_slistautoptr = o
  extension (v: GMemoryInputStream_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GMemoryMonitor_autoptr = Ptr[GMemoryMonitor]
object GMemoryMonitor_autoptr: 
  given _tag: Tag[GMemoryMonitor_autoptr] = Tag.Ptr[GMemoryMonitor](GMemoryMonitor._tag)
  inline def apply(inline o: Ptr[GMemoryMonitor]): GMemoryMonitor_autoptr = o
  extension (v: GMemoryMonitor_autoptr)
    inline def value: Ptr[GMemoryMonitor] = v

opaque type GMemoryMonitor_listautoptr = Ptr[GList]
object GMemoryMonitor_listautoptr: 
  given _tag: Tag[GMemoryMonitor_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GMemoryMonitor_listautoptr = o
  extension (v: GMemoryMonitor_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GMemoryMonitor_queueautoptr = Ptr[GQueue]
object GMemoryMonitor_queueautoptr: 
  given _tag: Tag[GMemoryMonitor_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GMemoryMonitor_queueautoptr = o
  extension (v: GMemoryMonitor_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GMemoryMonitor_slistautoptr = Ptr[GSList]
object GMemoryMonitor_slistautoptr: 
  given _tag: Tag[GMemoryMonitor_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GMemoryMonitor_slistautoptr = o
  extension (v: GMemoryMonitor_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GMemoryOutputStream_autoptr = Ptr[GMemoryOutputStream]
object GMemoryOutputStream_autoptr: 
  given _tag: Tag[GMemoryOutputStream_autoptr] = Tag.Ptr[GMemoryOutputStream](GMemoryOutputStream._tag)
  inline def apply(inline o: Ptr[GMemoryOutputStream]): GMemoryOutputStream_autoptr = o
  extension (v: GMemoryOutputStream_autoptr)
    inline def value: Ptr[GMemoryOutputStream] = v

opaque type GMemoryOutputStream_listautoptr = Ptr[GList]
object GMemoryOutputStream_listautoptr: 
  given _tag: Tag[GMemoryOutputStream_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GMemoryOutputStream_listautoptr = o
  extension (v: GMemoryOutputStream_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GMemoryOutputStream_queueautoptr = Ptr[GQueue]
object GMemoryOutputStream_queueautoptr: 
  given _tag: Tag[GMemoryOutputStream_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GMemoryOutputStream_queueautoptr = o
  extension (v: GMemoryOutputStream_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GMemoryOutputStream_slistautoptr = Ptr[GSList]
object GMemoryOutputStream_slistautoptr: 
  given _tag: Tag[GMemoryOutputStream_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GMemoryOutputStream_slistautoptr = o
  extension (v: GMemoryOutputStream_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GMenuAttributeIter_autoptr = Ptr[GMenuAttributeIter]
object GMenuAttributeIter_autoptr: 
  given _tag: Tag[GMenuAttributeIter_autoptr] = Tag.Ptr[GMenuAttributeIter](GMenuAttributeIter._tag)
  inline def apply(inline o: Ptr[GMenuAttributeIter]): GMenuAttributeIter_autoptr = o
  extension (v: GMenuAttributeIter_autoptr)
    inline def value: Ptr[GMenuAttributeIter] = v

opaque type GMenuAttributeIter_listautoptr = Ptr[GList]
object GMenuAttributeIter_listautoptr: 
  given _tag: Tag[GMenuAttributeIter_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GMenuAttributeIter_listautoptr = o
  extension (v: GMenuAttributeIter_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GMenuAttributeIter_queueautoptr = Ptr[GQueue]
object GMenuAttributeIter_queueautoptr: 
  given _tag: Tag[GMenuAttributeIter_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GMenuAttributeIter_queueautoptr = o
  extension (v: GMenuAttributeIter_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GMenuAttributeIter_slistautoptr = Ptr[GSList]
object GMenuAttributeIter_slistautoptr: 
  given _tag: Tag[GMenuAttributeIter_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GMenuAttributeIter_slistautoptr = o
  extension (v: GMenuAttributeIter_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GMenuItem_autoptr = Ptr[GMenuItem]
object GMenuItem_autoptr: 
  given _tag: Tag[GMenuItem_autoptr] = Tag.Ptr[GMenuItem](GMenuItem._tag)
  inline def apply(inline o: Ptr[GMenuItem]): GMenuItem_autoptr = o
  extension (v: GMenuItem_autoptr)
    inline def value: Ptr[GMenuItem] = v

opaque type GMenuItem_listautoptr = Ptr[GList]
object GMenuItem_listautoptr: 
  given _tag: Tag[GMenuItem_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GMenuItem_listautoptr = o
  extension (v: GMenuItem_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GMenuItem_queueautoptr = Ptr[GQueue]
object GMenuItem_queueautoptr: 
  given _tag: Tag[GMenuItem_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GMenuItem_queueautoptr = o
  extension (v: GMenuItem_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GMenuItem_slistautoptr = Ptr[GSList]
object GMenuItem_slistautoptr: 
  given _tag: Tag[GMenuItem_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GMenuItem_slistautoptr = o
  extension (v: GMenuItem_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GMenuLinkIter_autoptr = Ptr[GMenuLinkIter]
object GMenuLinkIter_autoptr: 
  given _tag: Tag[GMenuLinkIter_autoptr] = Tag.Ptr[GMenuLinkIter](GMenuLinkIter._tag)
  inline def apply(inline o: Ptr[GMenuLinkIter]): GMenuLinkIter_autoptr = o
  extension (v: GMenuLinkIter_autoptr)
    inline def value: Ptr[GMenuLinkIter] = v

opaque type GMenuLinkIter_listautoptr = Ptr[GList]
object GMenuLinkIter_listautoptr: 
  given _tag: Tag[GMenuLinkIter_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GMenuLinkIter_listautoptr = o
  extension (v: GMenuLinkIter_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GMenuLinkIter_queueautoptr = Ptr[GQueue]
object GMenuLinkIter_queueautoptr: 
  given _tag: Tag[GMenuLinkIter_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GMenuLinkIter_queueautoptr = o
  extension (v: GMenuLinkIter_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GMenuLinkIter_slistautoptr = Ptr[GSList]
object GMenuLinkIter_slistautoptr: 
  given _tag: Tag[GMenuLinkIter_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GMenuLinkIter_slistautoptr = o
  extension (v: GMenuLinkIter_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GMenuModel_autoptr = Ptr[GMenuModel]
object GMenuModel_autoptr: 
  given _tag: Tag[GMenuModel_autoptr] = Tag.Ptr[GMenuModel](GMenuModel._tag)
  inline def apply(inline o: Ptr[GMenuModel]): GMenuModel_autoptr = o
  extension (v: GMenuModel_autoptr)
    inline def value: Ptr[GMenuModel] = v

opaque type GMenuModel_listautoptr = Ptr[GList]
object GMenuModel_listautoptr: 
  given _tag: Tag[GMenuModel_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GMenuModel_listautoptr = o
  extension (v: GMenuModel_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GMenuModel_queueautoptr = Ptr[GQueue]
object GMenuModel_queueautoptr: 
  given _tag: Tag[GMenuModel_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GMenuModel_queueautoptr = o
  extension (v: GMenuModel_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GMenuModel_slistautoptr = Ptr[GSList]
object GMenuModel_slistautoptr: 
  given _tag: Tag[GMenuModel_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GMenuModel_slistautoptr = o
  extension (v: GMenuModel_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GMenu_autoptr = Ptr[GMenu]
object GMenu_autoptr: 
  given _tag: Tag[GMenu_autoptr] = Tag.Ptr[GMenu](GMenu._tag)
  inline def apply(inline o: Ptr[GMenu]): GMenu_autoptr = o
  extension (v: GMenu_autoptr)
    inline def value: Ptr[GMenu] = v

opaque type GMenu_listautoptr = Ptr[GList]
object GMenu_listautoptr: 
  given _tag: Tag[GMenu_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GMenu_listautoptr = o
  extension (v: GMenu_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GMenu_queueautoptr = Ptr[GQueue]
object GMenu_queueautoptr: 
  given _tag: Tag[GMenu_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GMenu_queueautoptr = o
  extension (v: GMenu_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GMenu_slistautoptr = Ptr[GSList]
object GMenu_slistautoptr: 
  given _tag: Tag[GMenu_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GMenu_slistautoptr = o
  extension (v: GMenu_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GModuleCheckInit = CFuncPtr1[Ptr[GModule], Ptr[gchar]]
object GModuleCheckInit: 
  given _tag: Tag[GModuleCheckInit] = Tag.materializeCFuncPtr1[Ptr[GModule], Ptr[gchar]]
  inline def apply(inline o: CFuncPtr1[Ptr[GModule], Ptr[gchar]]): GModuleCheckInit = o
  extension (v: GModuleCheckInit)
    inline def value: CFuncPtr1[Ptr[GModule], Ptr[gchar]] = v

opaque type GModuleUnload = CFuncPtr1[Ptr[GModule], Unit]
object GModuleUnload: 
  given _tag: Tag[GModuleUnload] = Tag.materializeCFuncPtr1[Ptr[GModule], Unit]
  inline def apply(inline o: CFuncPtr1[Ptr[GModule], Unit]): GModuleUnload = o
  extension (v: GModuleUnload)
    inline def value: CFuncPtr1[Ptr[GModule], Unit] = v

opaque type GMountOperation_autoptr = Ptr[GMountOperation]
object GMountOperation_autoptr: 
  given _tag: Tag[GMountOperation_autoptr] = Tag.Ptr[GMountOperation](GMountOperation._tag)
  inline def apply(inline o: Ptr[GMountOperation]): GMountOperation_autoptr = o
  extension (v: GMountOperation_autoptr)
    inline def value: Ptr[GMountOperation] = v

opaque type GMountOperation_listautoptr = Ptr[GList]
object GMountOperation_listautoptr: 
  given _tag: Tag[GMountOperation_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GMountOperation_listautoptr = o
  extension (v: GMountOperation_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GMountOperation_queueautoptr = Ptr[GQueue]
object GMountOperation_queueautoptr: 
  given _tag: Tag[GMountOperation_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GMountOperation_queueautoptr = o
  extension (v: GMountOperation_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GMountOperation_slistautoptr = Ptr[GSList]
object GMountOperation_slistautoptr: 
  given _tag: Tag[GMountOperation_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GMountOperation_slistautoptr = o
  extension (v: GMountOperation_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GMount_autoptr = Ptr[GMount]
object GMount_autoptr: 
  given _tag: Tag[GMount_autoptr] = Tag.Ptr[GMount](GMount._tag)
  inline def apply(inline o: Ptr[GMount]): GMount_autoptr = o
  extension (v: GMount_autoptr)
    inline def value: Ptr[GMount] = v

opaque type GMount_listautoptr = Ptr[GList]
object GMount_listautoptr: 
  given _tag: Tag[GMount_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GMount_listautoptr = o
  extension (v: GMount_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GMount_queueautoptr = Ptr[GQueue]
object GMount_queueautoptr: 
  given _tag: Tag[GMount_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GMount_queueautoptr = o
  extension (v: GMount_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GMount_slistautoptr = Ptr[GSList]
object GMount_slistautoptr: 
  given _tag: Tag[GMount_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GMount_slistautoptr = o
  extension (v: GMount_slistautoptr)
    inline def value: Ptr[GSList] = v

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

opaque type GNativeVolumeMonitor_autoptr = Ptr[GNativeVolumeMonitor]
object GNativeVolumeMonitor_autoptr: 
  given _tag: Tag[GNativeVolumeMonitor_autoptr] = Tag.Ptr[GNativeVolumeMonitor](GNativeVolumeMonitor._tag)
  inline def apply(inline o: Ptr[GNativeVolumeMonitor]): GNativeVolumeMonitor_autoptr = o
  extension (v: GNativeVolumeMonitor_autoptr)
    inline def value: Ptr[GNativeVolumeMonitor] = v

opaque type GNativeVolumeMonitor_listautoptr = Ptr[GList]
object GNativeVolumeMonitor_listautoptr: 
  given _tag: Tag[GNativeVolumeMonitor_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GNativeVolumeMonitor_listautoptr = o
  extension (v: GNativeVolumeMonitor_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GNativeVolumeMonitor_queueautoptr = Ptr[GQueue]
object GNativeVolumeMonitor_queueautoptr: 
  given _tag: Tag[GNativeVolumeMonitor_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GNativeVolumeMonitor_queueautoptr = o
  extension (v: GNativeVolumeMonitor_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GNativeVolumeMonitor_slistautoptr = Ptr[GSList]
object GNativeVolumeMonitor_slistautoptr: 
  given _tag: Tag[GNativeVolumeMonitor_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GNativeVolumeMonitor_slistautoptr = o
  extension (v: GNativeVolumeMonitor_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GNetworkAddress_autoptr = Ptr[GNetworkAddress]
object GNetworkAddress_autoptr: 
  given _tag: Tag[GNetworkAddress_autoptr] = Tag.Ptr[GNetworkAddress](GNetworkAddress._tag)
  inline def apply(inline o: Ptr[GNetworkAddress]): GNetworkAddress_autoptr = o
  extension (v: GNetworkAddress_autoptr)
    inline def value: Ptr[GNetworkAddress] = v

opaque type GNetworkAddress_listautoptr = Ptr[GList]
object GNetworkAddress_listautoptr: 
  given _tag: Tag[GNetworkAddress_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GNetworkAddress_listautoptr = o
  extension (v: GNetworkAddress_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GNetworkAddress_queueautoptr = Ptr[GQueue]
object GNetworkAddress_queueautoptr: 
  given _tag: Tag[GNetworkAddress_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GNetworkAddress_queueautoptr = o
  extension (v: GNetworkAddress_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GNetworkAddress_slistautoptr = Ptr[GSList]
object GNetworkAddress_slistautoptr: 
  given _tag: Tag[GNetworkAddress_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GNetworkAddress_slistautoptr = o
  extension (v: GNetworkAddress_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GNetworkMonitor_autoptr = Ptr[GNetworkMonitor]
object GNetworkMonitor_autoptr: 
  given _tag: Tag[GNetworkMonitor_autoptr] = Tag.Ptr[GNetworkMonitor](GNetworkMonitor._tag)
  inline def apply(inline o: Ptr[GNetworkMonitor]): GNetworkMonitor_autoptr = o
  extension (v: GNetworkMonitor_autoptr)
    inline def value: Ptr[GNetworkMonitor] = v

opaque type GNetworkMonitor_listautoptr = Ptr[GList]
object GNetworkMonitor_listautoptr: 
  given _tag: Tag[GNetworkMonitor_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GNetworkMonitor_listautoptr = o
  extension (v: GNetworkMonitor_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GNetworkMonitor_queueautoptr = Ptr[GQueue]
object GNetworkMonitor_queueautoptr: 
  given _tag: Tag[GNetworkMonitor_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GNetworkMonitor_queueautoptr = o
  extension (v: GNetworkMonitor_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GNetworkMonitor_slistautoptr = Ptr[GSList]
object GNetworkMonitor_slistautoptr: 
  given _tag: Tag[GNetworkMonitor_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GNetworkMonitor_slistautoptr = o
  extension (v: GNetworkMonitor_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GNetworkService_autoptr = Ptr[GNetworkService]
object GNetworkService_autoptr: 
  given _tag: Tag[GNetworkService_autoptr] = Tag.Ptr[GNetworkService](GNetworkService._tag)
  inline def apply(inline o: Ptr[GNetworkService]): GNetworkService_autoptr = o
  extension (v: GNetworkService_autoptr)
    inline def value: Ptr[GNetworkService] = v

opaque type GNetworkService_listautoptr = Ptr[GList]
object GNetworkService_listautoptr: 
  given _tag: Tag[GNetworkService_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GNetworkService_listautoptr = o
  extension (v: GNetworkService_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GNetworkService_queueautoptr = Ptr[GQueue]
object GNetworkService_queueautoptr: 
  given _tag: Tag[GNetworkService_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GNetworkService_queueautoptr = o
  extension (v: GNetworkService_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GNetworkService_slistautoptr = Ptr[GSList]
object GNetworkService_slistautoptr: 
  given _tag: Tag[GNetworkService_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GNetworkService_slistautoptr = o
  extension (v: GNetworkService_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GNodeForeachFunc = CFuncPtr2[Ptr[GNode], gpointer, Unit]
object GNodeForeachFunc: 
  given _tag: Tag[GNodeForeachFunc] = Tag.materializeCFuncPtr2[Ptr[GNode], gpointer, Unit]
  inline def apply(inline o: CFuncPtr2[Ptr[GNode], gpointer, Unit]): GNodeForeachFunc = o
  extension (v: GNodeForeachFunc)
    inline def value: CFuncPtr2[Ptr[GNode], gpointer, Unit] = v

opaque type GNodeTraverseFunc = CFuncPtr2[Ptr[GNode], gpointer, gboolean]
object GNodeTraverseFunc: 
  given _tag: Tag[GNodeTraverseFunc] = Tag.materializeCFuncPtr2[Ptr[GNode], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr2[Ptr[GNode], gpointer, gboolean]): GNodeTraverseFunc = o
  extension (v: GNodeTraverseFunc)
    inline def value: CFuncPtr2[Ptr[GNode], gpointer, gboolean] = v

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

opaque type GNotification_autoptr = Ptr[GNotification]
object GNotification_autoptr: 
  given _tag: Tag[GNotification_autoptr] = Tag.Ptr[GNotification](GNotification._tag)
  inline def apply(inline o: Ptr[GNotification]): GNotification_autoptr = o
  extension (v: GNotification_autoptr)
    inline def value: Ptr[GNotification] = v

opaque type GNotification_listautoptr = Ptr[GList]
object GNotification_listautoptr: 
  given _tag: Tag[GNotification_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GNotification_listautoptr = o
  extension (v: GNotification_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GNotification_queueautoptr = Ptr[GQueue]
object GNotification_queueautoptr: 
  given _tag: Tag[GNotification_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GNotification_queueautoptr = o
  extension (v: GNotification_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GNotification_slistautoptr = Ptr[GSList]
object GNotification_slistautoptr: 
  given _tag: Tag[GNotification_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GNotification_slistautoptr = o
  extension (v: GNotification_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GObjectFinalizeFunc = CFuncPtr1[Ptr[GObject], Unit]
object GObjectFinalizeFunc: 
  given _tag: Tag[GObjectFinalizeFunc] = Tag.materializeCFuncPtr1[Ptr[GObject], Unit]
  inline def apply(inline o: CFuncPtr1[Ptr[GObject], Unit]): GObjectFinalizeFunc = o
  extension (v: GObjectFinalizeFunc)
    inline def value: CFuncPtr1[Ptr[GObject], Unit] = v

opaque type GObjectGetPropertyFunc = CFuncPtr4[Ptr[GObject], guint, Ptr[GValue], Ptr[GParamSpec], Unit]
object GObjectGetPropertyFunc: 
  given _tag: Tag[GObjectGetPropertyFunc] = Tag.materializeCFuncPtr4[Ptr[GObject], guint, Ptr[GValue], Ptr[GParamSpec], Unit]
  inline def apply(inline o: CFuncPtr4[Ptr[GObject], guint, Ptr[GValue], Ptr[GParamSpec], Unit]): GObjectGetPropertyFunc = o
  extension (v: GObjectGetPropertyFunc)
    inline def value: CFuncPtr4[Ptr[GObject], guint, Ptr[GValue], Ptr[GParamSpec], Unit] = v

opaque type GObjectSetPropertyFunc = CFuncPtr4[Ptr[GObject], guint, Ptr[GValue], Ptr[GParamSpec], Unit]
object GObjectSetPropertyFunc: 
  given _tag: Tag[GObjectSetPropertyFunc] = Tag.materializeCFuncPtr4[Ptr[GObject], guint, Ptr[GValue], Ptr[GParamSpec], Unit]
  inline def apply(inline o: CFuncPtr4[Ptr[GObject], guint, Ptr[GValue], Ptr[GParamSpec], Unit]): GObjectSetPropertyFunc = o
  extension (v: GObjectSetPropertyFunc)
    inline def value: CFuncPtr4[Ptr[GObject], guint, Ptr[GValue], Ptr[GParamSpec], Unit] = v

opaque type GObject_autoptr = Ptr[GObject]
object GObject_autoptr: 
  given _tag: Tag[GObject_autoptr] = Tag.Ptr[GObject](GObject._tag)
  inline def apply(inline o: Ptr[GObject]): GObject_autoptr = o
  extension (v: GObject_autoptr)
    inline def value: Ptr[GObject] = v

opaque type GObject_listautoptr = Ptr[GList]
object GObject_listautoptr: 
  given _tag: Tag[GObject_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GObject_listautoptr = o
  extension (v: GObject_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GObject_queueautoptr = Ptr[GQueue]
object GObject_queueautoptr: 
  given _tag: Tag[GObject_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GObject_queueautoptr = o
  extension (v: GObject_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GObject_slistautoptr = Ptr[GSList]
object GObject_slistautoptr: 
  given _tag: Tag[GObject_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GObject_slistautoptr = o
  extension (v: GObject_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GOptionArgFunc = CFuncPtr4[Ptr[gchar], Ptr[gchar], gpointer, Ptr[Ptr[GError]], gboolean]
object GOptionArgFunc: 
  given _tag: Tag[GOptionArgFunc] = Tag.materializeCFuncPtr4[Ptr[gchar], Ptr[gchar], gpointer, Ptr[Ptr[GError]], gboolean]
  inline def apply(inline o: CFuncPtr4[Ptr[gchar], Ptr[gchar], gpointer, Ptr[Ptr[GError]], gboolean]): GOptionArgFunc = o
  extension (v: GOptionArgFunc)
    inline def value: CFuncPtr4[Ptr[gchar], Ptr[gchar], gpointer, Ptr[Ptr[GError]], gboolean] = v

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

opaque type GOptionErrorFunc = CFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], Unit]
object GOptionErrorFunc: 
  given _tag: Tag[GOptionErrorFunc] = Tag.materializeCFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], Unit]
  inline def apply(inline o: CFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], Unit]): GOptionErrorFunc = o
  extension (v: GOptionErrorFunc)
    inline def value: CFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], Unit] = v

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

opaque type GOptionParseFunc = CFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], gboolean]
object GOptionParseFunc: 
  given _tag: Tag[GOptionParseFunc] = Tag.materializeCFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], gboolean]
  inline def apply(inline o: CFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], gboolean]): GOptionParseFunc = o
  extension (v: GOptionParseFunc)
    inline def value: CFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], gboolean] = v

opaque type GOutputStream_autoptr = Ptr[GOutputStream]
object GOutputStream_autoptr: 
  given _tag: Tag[GOutputStream_autoptr] = Tag.Ptr[GOutputStream](GOutputStream._tag)
  inline def apply(inline o: Ptr[GOutputStream]): GOutputStream_autoptr = o
  extension (v: GOutputStream_autoptr)
    inline def value: Ptr[GOutputStream] = v

opaque type GOutputStream_listautoptr = Ptr[GList]
object GOutputStream_listautoptr: 
  given _tag: Tag[GOutputStream_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GOutputStream_listautoptr = o
  extension (v: GOutputStream_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GOutputStream_queueautoptr = Ptr[GQueue]
object GOutputStream_queueautoptr: 
  given _tag: Tag[GOutputStream_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GOutputStream_queueautoptr = o
  extension (v: GOutputStream_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GOutputStream_slistautoptr = Ptr[GSList]
object GOutputStream_slistautoptr: 
  given _tag: Tag[GOutputStream_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GOutputStream_slistautoptr = o
  extension (v: GOutputStream_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GParamSpec_autoptr = Ptr[GParamSpec]
object GParamSpec_autoptr: 
  given _tag: Tag[GParamSpec_autoptr] = Tag.Ptr[GParamSpec](GParamSpec._tag)
  inline def apply(inline o: Ptr[GParamSpec]): GParamSpec_autoptr = o
  extension (v: GParamSpec_autoptr)
    inline def value: Ptr[GParamSpec] = v

opaque type GParamSpec_listautoptr = Ptr[GList]
object GParamSpec_listautoptr: 
  given _tag: Tag[GParamSpec_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GParamSpec_listautoptr = o
  extension (v: GParamSpec_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GParamSpec_queueautoptr = Ptr[GQueue]
object GParamSpec_queueautoptr: 
  given _tag: Tag[GParamSpec_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GParamSpec_queueautoptr = o
  extension (v: GParamSpec_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GParamSpec_slistautoptr = Ptr[GSList]
object GParamSpec_slistautoptr: 
  given _tag: Tag[GParamSpec_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GParamSpec_slistautoptr = o
  extension (v: GParamSpec_slistautoptr)
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

opaque type GPermission_autoptr = Ptr[GPermission]
object GPermission_autoptr: 
  given _tag: Tag[GPermission_autoptr] = Tag.Ptr[GPermission](GPermission._tag)
  inline def apply(inline o: Ptr[GPermission]): GPermission_autoptr = o
  extension (v: GPermission_autoptr)
    inline def value: Ptr[GPermission] = v

opaque type GPermission_listautoptr = Ptr[GList]
object GPermission_listautoptr: 
  given _tag: Tag[GPermission_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GPermission_listautoptr = o
  extension (v: GPermission_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GPermission_queueautoptr = Ptr[GQueue]
object GPermission_queueautoptr: 
  given _tag: Tag[GPermission_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GPermission_queueautoptr = o
  extension (v: GPermission_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GPermission_slistautoptr = Ptr[GSList]
object GPermission_slistautoptr: 
  given _tag: Tag[GPermission_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GPermission_slistautoptr = o
  extension (v: GPermission_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GPid = CInt
object GPid: 
  given _tag: Tag[GPid] = Tag.Int
  inline def apply(inline o: CInt): GPid = o
  extension (v: GPid)
    inline def value: CInt = v

opaque type GPollFunc = CFuncPtr3[Ptr[GPollFD], guint, gint, gint]
object GPollFunc: 
  given _tag: Tag[GPollFunc] = Tag.materializeCFuncPtr3[Ptr[GPollFD], guint, gint, gint]
  inline def apply(inline o: CFuncPtr3[Ptr[GPollFD], guint, gint, gint]): GPollFunc = o
  extension (v: GPollFunc)
    inline def value: CFuncPtr3[Ptr[GPollFD], guint, gint, gint] = v

opaque type GPollableInputStream_autoptr = Ptr[GPollableInputStream]
object GPollableInputStream_autoptr: 
  given _tag: Tag[GPollableInputStream_autoptr] = Tag.Ptr[GPollableInputStream](GPollableInputStream._tag)
  inline def apply(inline o: Ptr[GPollableInputStream]): GPollableInputStream_autoptr = o
  extension (v: GPollableInputStream_autoptr)
    inline def value: Ptr[GPollableInputStream] = v

opaque type GPollableInputStream_listautoptr = Ptr[GList]
object GPollableInputStream_listautoptr: 
  given _tag: Tag[GPollableInputStream_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GPollableInputStream_listautoptr = o
  extension (v: GPollableInputStream_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GPollableInputStream_queueautoptr = Ptr[GQueue]
object GPollableInputStream_queueautoptr: 
  given _tag: Tag[GPollableInputStream_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GPollableInputStream_queueautoptr = o
  extension (v: GPollableInputStream_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GPollableInputStream_slistautoptr = Ptr[GSList]
object GPollableInputStream_slistautoptr: 
  given _tag: Tag[GPollableInputStream_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GPollableInputStream_slistautoptr = o
  extension (v: GPollableInputStream_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GPollableOutputStream_autoptr = Ptr[GPollableOutputStream]
object GPollableOutputStream_autoptr: 
  given _tag: Tag[GPollableOutputStream_autoptr] = Tag.Ptr[GPollableOutputStream](GPollableOutputStream._tag)
  inline def apply(inline o: Ptr[GPollableOutputStream]): GPollableOutputStream_autoptr = o
  extension (v: GPollableOutputStream_autoptr)
    inline def value: Ptr[GPollableOutputStream] = v

opaque type GPollableOutputStream_listautoptr = Ptr[GList]
object GPollableOutputStream_listautoptr: 
  given _tag: Tag[GPollableOutputStream_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GPollableOutputStream_listautoptr = o
  extension (v: GPollableOutputStream_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GPollableOutputStream_queueautoptr = Ptr[GQueue]
object GPollableOutputStream_queueautoptr: 
  given _tag: Tag[GPollableOutputStream_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GPollableOutputStream_queueautoptr = o
  extension (v: GPollableOutputStream_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GPollableOutputStream_slistautoptr = Ptr[GSList]
object GPollableOutputStream_slistautoptr: 
  given _tag: Tag[GPollableOutputStream_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GPollableOutputStream_slistautoptr = o
  extension (v: GPollableOutputStream_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GPollableSourceFunc = CFuncPtr2[Ptr[GObject], gpointer, gboolean]
object GPollableSourceFunc: 
  given _tag: Tag[GPollableSourceFunc] = Tag.materializeCFuncPtr2[Ptr[GObject], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr2[Ptr[GObject], gpointer, gboolean]): GPollableSourceFunc = o
  extension (v: GPollableSourceFunc)
    inline def value: CFuncPtr2[Ptr[GObject], gpointer, gboolean] = v

opaque type GPowerProfileMonitor_autoptr = Ptr[GPowerProfileMonitor]
object GPowerProfileMonitor_autoptr: 
  given _tag: Tag[GPowerProfileMonitor_autoptr] = Tag.Ptr[GPowerProfileMonitor](GPowerProfileMonitor._tag)
  inline def apply(inline o: Ptr[GPowerProfileMonitor]): GPowerProfileMonitor_autoptr = o
  extension (v: GPowerProfileMonitor_autoptr)
    inline def value: Ptr[GPowerProfileMonitor] = v

opaque type GPowerProfileMonitor_listautoptr = Ptr[GList]
object GPowerProfileMonitor_listautoptr: 
  given _tag: Tag[GPowerProfileMonitor_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GPowerProfileMonitor_listautoptr = o
  extension (v: GPowerProfileMonitor_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GPowerProfileMonitor_queueautoptr = Ptr[GQueue]
object GPowerProfileMonitor_queueautoptr: 
  given _tag: Tag[GPowerProfileMonitor_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GPowerProfileMonitor_queueautoptr = o
  extension (v: GPowerProfileMonitor_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GPowerProfileMonitor_slistautoptr = Ptr[GSList]
object GPowerProfileMonitor_slistautoptr: 
  given _tag: Tag[GPowerProfileMonitor_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GPowerProfileMonitor_slistautoptr = o
  extension (v: GPowerProfileMonitor_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GPrintFunc = CFuncPtr1[Ptr[gchar], Unit]
object GPrintFunc: 
  given _tag: Tag[GPrintFunc] = Tag.materializeCFuncPtr1[Ptr[gchar], Unit]
  inline def apply(inline o: CFuncPtr1[Ptr[gchar], Unit]): GPrintFunc = o
  extension (v: GPrintFunc)
    inline def value: CFuncPtr1[Ptr[gchar], Unit] = v

opaque type GPropertyAction_autoptr = Ptr[GPropertyAction]
object GPropertyAction_autoptr: 
  given _tag: Tag[GPropertyAction_autoptr] = Tag.Ptr[GPropertyAction](GPropertyAction._tag)
  inline def apply(inline o: Ptr[GPropertyAction]): GPropertyAction_autoptr = o
  extension (v: GPropertyAction_autoptr)
    inline def value: Ptr[GPropertyAction] = v

opaque type GPropertyAction_listautoptr = Ptr[GList]
object GPropertyAction_listautoptr: 
  given _tag: Tag[GPropertyAction_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GPropertyAction_listautoptr = o
  extension (v: GPropertyAction_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GPropertyAction_queueautoptr = Ptr[GQueue]
object GPropertyAction_queueautoptr: 
  given _tag: Tag[GPropertyAction_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GPropertyAction_queueautoptr = o
  extension (v: GPropertyAction_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GPropertyAction_slistautoptr = Ptr[GSList]
object GPropertyAction_slistautoptr: 
  given _tag: Tag[GPropertyAction_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GPropertyAction_slistautoptr = o
  extension (v: GPropertyAction_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GProxyAddressEnumerator_autoptr = Ptr[GProxyAddressEnumerator]
object GProxyAddressEnumerator_autoptr: 
  given _tag: Tag[GProxyAddressEnumerator_autoptr] = Tag.Ptr[GProxyAddressEnumerator](GProxyAddressEnumerator._tag)
  inline def apply(inline o: Ptr[GProxyAddressEnumerator]): GProxyAddressEnumerator_autoptr = o
  extension (v: GProxyAddressEnumerator_autoptr)
    inline def value: Ptr[GProxyAddressEnumerator] = v

opaque type GProxyAddressEnumerator_listautoptr = Ptr[GList]
object GProxyAddressEnumerator_listautoptr: 
  given _tag: Tag[GProxyAddressEnumerator_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GProxyAddressEnumerator_listautoptr = o
  extension (v: GProxyAddressEnumerator_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GProxyAddressEnumerator_queueautoptr = Ptr[GQueue]
object GProxyAddressEnumerator_queueautoptr: 
  given _tag: Tag[GProxyAddressEnumerator_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GProxyAddressEnumerator_queueautoptr = o
  extension (v: GProxyAddressEnumerator_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GProxyAddressEnumerator_slistautoptr = Ptr[GSList]
object GProxyAddressEnumerator_slistautoptr: 
  given _tag: Tag[GProxyAddressEnumerator_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GProxyAddressEnumerator_slistautoptr = o
  extension (v: GProxyAddressEnumerator_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GProxyAddress_autoptr = Ptr[GProxyAddress]
object GProxyAddress_autoptr: 
  given _tag: Tag[GProxyAddress_autoptr] = Tag.Ptr[GProxyAddress](GProxyAddress._tag)
  inline def apply(inline o: Ptr[GProxyAddress]): GProxyAddress_autoptr = o
  extension (v: GProxyAddress_autoptr)
    inline def value: Ptr[GProxyAddress] = v

opaque type GProxyAddress_listautoptr = Ptr[GList]
object GProxyAddress_listautoptr: 
  given _tag: Tag[GProxyAddress_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GProxyAddress_listautoptr = o
  extension (v: GProxyAddress_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GProxyAddress_queueautoptr = Ptr[GQueue]
object GProxyAddress_queueautoptr: 
  given _tag: Tag[GProxyAddress_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GProxyAddress_queueautoptr = o
  extension (v: GProxyAddress_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GProxyAddress_slistautoptr = Ptr[GSList]
object GProxyAddress_slistautoptr: 
  given _tag: Tag[GProxyAddress_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GProxyAddress_slistautoptr = o
  extension (v: GProxyAddress_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GProxyResolver_autoptr = Ptr[GProxyResolver]
object GProxyResolver_autoptr: 
  given _tag: Tag[GProxyResolver_autoptr] = Tag.Ptr[GProxyResolver](GProxyResolver._tag)
  inline def apply(inline o: Ptr[GProxyResolver]): GProxyResolver_autoptr = o
  extension (v: GProxyResolver_autoptr)
    inline def value: Ptr[GProxyResolver] = v

opaque type GProxyResolver_listautoptr = Ptr[GList]
object GProxyResolver_listautoptr: 
  given _tag: Tag[GProxyResolver_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GProxyResolver_listautoptr = o
  extension (v: GProxyResolver_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GProxyResolver_queueautoptr = Ptr[GQueue]
object GProxyResolver_queueautoptr: 
  given _tag: Tag[GProxyResolver_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GProxyResolver_queueautoptr = o
  extension (v: GProxyResolver_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GProxyResolver_slistautoptr = Ptr[GSList]
object GProxyResolver_slistautoptr: 
  given _tag: Tag[GProxyResolver_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GProxyResolver_slistautoptr = o
  extension (v: GProxyResolver_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GProxy_autoptr = Ptr[GProxy]
object GProxy_autoptr: 
  given _tag: Tag[GProxy_autoptr] = Tag.Ptr[GProxy](GProxy._tag)
  inline def apply(inline o: Ptr[GProxy]): GProxy_autoptr = o
  extension (v: GProxy_autoptr)
    inline def value: Ptr[GProxy] = v

opaque type GProxy_listautoptr = Ptr[GList]
object GProxy_listautoptr: 
  given _tag: Tag[GProxy_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GProxy_listautoptr = o
  extension (v: GProxy_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GProxy_queueautoptr = Ptr[GQueue]
object GProxy_queueautoptr: 
  given _tag: Tag[GProxy_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GProxy_queueautoptr = o
  extension (v: GProxy_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GProxy_slistautoptr = Ptr[GSList]
object GProxy_slistautoptr: 
  given _tag: Tag[GProxy_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GProxy_slistautoptr = o
  extension (v: GProxy_slistautoptr)
    inline def value: Ptr[GSList] = v

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

opaque type GReallocFunc = CFuncPtr2[gpointer, gsize, gpointer]
object GReallocFunc: 
  given _tag: Tag[GReallocFunc] = Tag.materializeCFuncPtr2[gpointer, gsize, gpointer]
  inline def apply(inline o: CFuncPtr2[gpointer, gsize, gpointer]): GReallocFunc = o
  extension (v: GReallocFunc)
    inline def value: CFuncPtr2[gpointer, gsize, gpointer] = v

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

opaque type GRegexEvalCallback = CFuncPtr3[Ptr[GMatchInfo], Ptr[GString], gpointer, gboolean]
object GRegexEvalCallback: 
  given _tag: Tag[GRegexEvalCallback] = Tag.materializeCFuncPtr3[Ptr[GMatchInfo], Ptr[GString], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr3[Ptr[GMatchInfo], Ptr[GString], gpointer, gboolean]): GRegexEvalCallback = o
  extension (v: GRegexEvalCallback)
    inline def value: CFuncPtr3[Ptr[GMatchInfo], Ptr[GString], gpointer, gboolean] = v

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

opaque type GRemoteActionGroup_autoptr = Ptr[GRemoteActionGroup]
object GRemoteActionGroup_autoptr: 
  given _tag: Tag[GRemoteActionGroup_autoptr] = Tag.Ptr[GRemoteActionGroup](GRemoteActionGroup._tag)
  inline def apply(inline o: Ptr[GRemoteActionGroup]): GRemoteActionGroup_autoptr = o
  extension (v: GRemoteActionGroup_autoptr)
    inline def value: Ptr[GRemoteActionGroup] = v

opaque type GRemoteActionGroup_listautoptr = Ptr[GList]
object GRemoteActionGroup_listautoptr: 
  given _tag: Tag[GRemoteActionGroup_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GRemoteActionGroup_listautoptr = o
  extension (v: GRemoteActionGroup_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GRemoteActionGroup_queueautoptr = Ptr[GQueue]
object GRemoteActionGroup_queueautoptr: 
  given _tag: Tag[GRemoteActionGroup_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GRemoteActionGroup_queueautoptr = o
  extension (v: GRemoteActionGroup_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GRemoteActionGroup_slistautoptr = Ptr[GSList]
object GRemoteActionGroup_slistautoptr: 
  given _tag: Tag[GRemoteActionGroup_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GRemoteActionGroup_slistautoptr = o
  extension (v: GRemoteActionGroup_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GResolver_autoptr = Ptr[GResolver]
object GResolver_autoptr: 
  given _tag: Tag[GResolver_autoptr] = Tag.Ptr[GResolver](GResolver._tag)
  inline def apply(inline o: Ptr[GResolver]): GResolver_autoptr = o
  extension (v: GResolver_autoptr)
    inline def value: Ptr[GResolver] = v

opaque type GResolver_listautoptr = Ptr[GList]
object GResolver_listautoptr: 
  given _tag: Tag[GResolver_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GResolver_listautoptr = o
  extension (v: GResolver_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GResolver_queueautoptr = Ptr[GQueue]
object GResolver_queueautoptr: 
  given _tag: Tag[GResolver_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GResolver_queueautoptr = o
  extension (v: GResolver_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GResolver_slistautoptr = Ptr[GSList]
object GResolver_slistautoptr: 
  given _tag: Tag[GResolver_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GResolver_slistautoptr = o
  extension (v: GResolver_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GResource_autoptr = Ptr[GResource]
object GResource_autoptr: 
  given _tag: Tag[GResource_autoptr] = Tag.Ptr[GResource](GResource._tag)
  inline def apply(inline o: Ptr[GResource]): GResource_autoptr = o
  extension (v: GResource_autoptr)
    inline def value: Ptr[GResource] = v

opaque type GResource_listautoptr = Ptr[GList]
object GResource_listautoptr: 
  given _tag: Tag[GResource_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GResource_listautoptr = o
  extension (v: GResource_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GResource_queueautoptr = Ptr[GQueue]
object GResource_queueautoptr: 
  given _tag: Tag[GResource_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GResource_queueautoptr = o
  extension (v: GResource_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GResource_slistautoptr = Ptr[GSList]
object GResource_slistautoptr: 
  given _tag: Tag[GResource_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GResource_slistautoptr = o
  extension (v: GResource_slistautoptr)
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
  inline def apply(inline o: CFuncPtr3[Ptr[GScanner], Ptr[gchar], gboolean, Unit]): GScannerMsgFunc = o
  extension (v: GScannerMsgFunc)
    inline def value: CFuncPtr3[Ptr[GScanner], Ptr[gchar], gboolean, Unit] = v

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

opaque type GSeekable_autoptr = Ptr[GSeekable]
object GSeekable_autoptr: 
  given _tag: Tag[GSeekable_autoptr] = Tag.Ptr[GSeekable](GSeekable._tag)
  inline def apply(inline o: Ptr[GSeekable]): GSeekable_autoptr = o
  extension (v: GSeekable_autoptr)
    inline def value: Ptr[GSeekable] = v

opaque type GSeekable_listautoptr = Ptr[GList]
object GSeekable_listautoptr: 
  given _tag: Tag[GSeekable_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GSeekable_listautoptr = o
  extension (v: GSeekable_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GSeekable_queueautoptr = Ptr[GQueue]
object GSeekable_queueautoptr: 
  given _tag: Tag[GSeekable_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GSeekable_queueautoptr = o
  extension (v: GSeekable_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GSeekable_slistautoptr = Ptr[GSList]
object GSeekable_slistautoptr: 
  given _tag: Tag[GSeekable_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSeekable_slistautoptr = o
  extension (v: GSeekable_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GSequenceIterCompareFunc = CFuncPtr3[Ptr[GSequenceIter], Ptr[GSequenceIter], gpointer, gint]
object GSequenceIterCompareFunc: 
  given _tag: Tag[GSequenceIterCompareFunc] = Tag.materializeCFuncPtr3[Ptr[GSequenceIter], Ptr[GSequenceIter], gpointer, gint]
  inline def apply(inline o: CFuncPtr3[Ptr[GSequenceIter], Ptr[GSequenceIter], gpointer, gint]): GSequenceIterCompareFunc = o
  extension (v: GSequenceIterCompareFunc)
    inline def value: CFuncPtr3[Ptr[GSequenceIter], Ptr[GSequenceIter], gpointer, gint] = v

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

opaque type GSettingsBackend_autoptr = Ptr[GSettingsBackend]
object GSettingsBackend_autoptr: 
  given _tag: Tag[GSettingsBackend_autoptr] = Tag.Ptr[GSettingsBackend](GSettingsBackend._tag)
  inline def apply(inline o: Ptr[GSettingsBackend]): GSettingsBackend_autoptr = o
  extension (v: GSettingsBackend_autoptr)
    inline def value: Ptr[GSettingsBackend] = v

opaque type GSettingsBackend_listautoptr = Ptr[GList]
object GSettingsBackend_listautoptr: 
  given _tag: Tag[GSettingsBackend_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GSettingsBackend_listautoptr = o
  extension (v: GSettingsBackend_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GSettingsBackend_queueautoptr = Ptr[GQueue]
object GSettingsBackend_queueautoptr: 
  given _tag: Tag[GSettingsBackend_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GSettingsBackend_queueautoptr = o
  extension (v: GSettingsBackend_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GSettingsBackend_slistautoptr = Ptr[GSList]
object GSettingsBackend_slistautoptr: 
  given _tag: Tag[GSettingsBackend_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSettingsBackend_slistautoptr = o
  extension (v: GSettingsBackend_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GSettingsBindGetMapping = CFuncPtr3[Ptr[GValue], Ptr[GVariant], gpointer, gboolean]
object GSettingsBindGetMapping: 
  given _tag: Tag[GSettingsBindGetMapping] = Tag.materializeCFuncPtr3[Ptr[GValue], Ptr[GVariant], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr3[Ptr[GValue], Ptr[GVariant], gpointer, gboolean]): GSettingsBindGetMapping = o
  extension (v: GSettingsBindGetMapping)
    inline def value: CFuncPtr3[Ptr[GValue], Ptr[GVariant], gpointer, gboolean] = v

opaque type GSettingsBindSetMapping = CFuncPtr3[Ptr[GValue], Ptr[GVariantType], gpointer, Ptr[GVariant]]
object GSettingsBindSetMapping: 
  given _tag: Tag[GSettingsBindSetMapping] = Tag.materializeCFuncPtr3[Ptr[GValue], Ptr[GVariantType], gpointer, Ptr[GVariant]]
  inline def apply(inline o: CFuncPtr3[Ptr[GValue], Ptr[GVariantType], gpointer, Ptr[GVariant]]): GSettingsBindSetMapping = o
  extension (v: GSettingsBindSetMapping)
    inline def value: CFuncPtr3[Ptr[GValue], Ptr[GVariantType], gpointer, Ptr[GVariant]] = v

opaque type GSettingsGetMapping = CFuncPtr3[Ptr[GVariant], Ptr[gpointer], gpointer, gboolean]
object GSettingsGetMapping: 
  given _tag: Tag[GSettingsGetMapping] = Tag.materializeCFuncPtr3[Ptr[GVariant], Ptr[gpointer], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr3[Ptr[GVariant], Ptr[gpointer], gpointer, gboolean]): GSettingsGetMapping = o
  extension (v: GSettingsGetMapping)
    inline def value: CFuncPtr3[Ptr[GVariant], Ptr[gpointer], gpointer, gboolean] = v

opaque type GSettingsSchemaKey_autoptr = Ptr[GSettingsSchemaKey]
object GSettingsSchemaKey_autoptr: 
  given _tag: Tag[GSettingsSchemaKey_autoptr] = Tag.Ptr[GSettingsSchemaKey](GSettingsSchemaKey._tag)
  inline def apply(inline o: Ptr[GSettingsSchemaKey]): GSettingsSchemaKey_autoptr = o
  extension (v: GSettingsSchemaKey_autoptr)
    inline def value: Ptr[GSettingsSchemaKey] = v

opaque type GSettingsSchemaKey_listautoptr = Ptr[GList]
object GSettingsSchemaKey_listautoptr: 
  given _tag: Tag[GSettingsSchemaKey_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GSettingsSchemaKey_listautoptr = o
  extension (v: GSettingsSchemaKey_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GSettingsSchemaKey_queueautoptr = Ptr[GQueue]
object GSettingsSchemaKey_queueautoptr: 
  given _tag: Tag[GSettingsSchemaKey_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GSettingsSchemaKey_queueautoptr = o
  extension (v: GSettingsSchemaKey_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GSettingsSchemaKey_slistautoptr = Ptr[GSList]
object GSettingsSchemaKey_slistautoptr: 
  given _tag: Tag[GSettingsSchemaKey_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSettingsSchemaKey_slistautoptr = o
  extension (v: GSettingsSchemaKey_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GSettingsSchemaSource_autoptr = Ptr[GSettingsSchemaSource]
object GSettingsSchemaSource_autoptr: 
  given _tag: Tag[GSettingsSchemaSource_autoptr] = Tag.Ptr[GSettingsSchemaSource](GSettingsSchemaSource._tag)
  inline def apply(inline o: Ptr[GSettingsSchemaSource]): GSettingsSchemaSource_autoptr = o
  extension (v: GSettingsSchemaSource_autoptr)
    inline def value: Ptr[GSettingsSchemaSource] = v

opaque type GSettingsSchemaSource_listautoptr = Ptr[GList]
object GSettingsSchemaSource_listautoptr: 
  given _tag: Tag[GSettingsSchemaSource_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GSettingsSchemaSource_listautoptr = o
  extension (v: GSettingsSchemaSource_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GSettingsSchemaSource_queueautoptr = Ptr[GQueue]
object GSettingsSchemaSource_queueautoptr: 
  given _tag: Tag[GSettingsSchemaSource_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GSettingsSchemaSource_queueautoptr = o
  extension (v: GSettingsSchemaSource_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GSettingsSchemaSource_slistautoptr = Ptr[GSList]
object GSettingsSchemaSource_slistautoptr: 
  given _tag: Tag[GSettingsSchemaSource_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSettingsSchemaSource_slistautoptr = o
  extension (v: GSettingsSchemaSource_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GSettingsSchema_autoptr = Ptr[GSettingsSchema]
object GSettingsSchema_autoptr: 
  given _tag: Tag[GSettingsSchema_autoptr] = Tag.Ptr[GSettingsSchema](GSettingsSchema._tag)
  inline def apply(inline o: Ptr[GSettingsSchema]): GSettingsSchema_autoptr = o
  extension (v: GSettingsSchema_autoptr)
    inline def value: Ptr[GSettingsSchema] = v

opaque type GSettingsSchema_listautoptr = Ptr[GList]
object GSettingsSchema_listautoptr: 
  given _tag: Tag[GSettingsSchema_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GSettingsSchema_listautoptr = o
  extension (v: GSettingsSchema_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GSettingsSchema_queueautoptr = Ptr[GQueue]
object GSettingsSchema_queueautoptr: 
  given _tag: Tag[GSettingsSchema_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GSettingsSchema_queueautoptr = o
  extension (v: GSettingsSchema_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GSettingsSchema_slistautoptr = Ptr[GSList]
object GSettingsSchema_slistautoptr: 
  given _tag: Tag[GSettingsSchema_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSettingsSchema_slistautoptr = o
  extension (v: GSettingsSchema_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GSettings_autoptr = Ptr[GSettings]
object GSettings_autoptr: 
  given _tag: Tag[GSettings_autoptr] = Tag.Ptr[GSettings](GSettings._tag)
  inline def apply(inline o: Ptr[GSettings]): GSettings_autoptr = o
  extension (v: GSettings_autoptr)
    inline def value: Ptr[GSettings] = v

opaque type GSettings_listautoptr = Ptr[GList]
object GSettings_listautoptr: 
  given _tag: Tag[GSettings_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GSettings_listautoptr = o
  extension (v: GSettings_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GSettings_queueautoptr = Ptr[GQueue]
object GSettings_queueautoptr: 
  given _tag: Tag[GSettings_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GSettings_queueautoptr = o
  extension (v: GSettings_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GSettings_slistautoptr = Ptr[GSList]
object GSettings_slistautoptr: 
  given _tag: Tag[GSettings_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSettings_slistautoptr = o
  extension (v: GSettings_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GSignalAccumulator = CFuncPtr4[Ptr[GSignalInvocationHint], Ptr[GValue], Ptr[GValue], gpointer, gboolean]
object GSignalAccumulator: 
  given _tag: Tag[GSignalAccumulator] = Tag.materializeCFuncPtr4[Ptr[GSignalInvocationHint], Ptr[GValue], Ptr[GValue], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr4[Ptr[GSignalInvocationHint], Ptr[GValue], Ptr[GValue], gpointer, gboolean]): GSignalAccumulator = o
  extension (v: GSignalAccumulator)
    inline def value: CFuncPtr4[Ptr[GSignalInvocationHint], Ptr[GValue], Ptr[GValue], gpointer, gboolean] = v

type GSignalCMarshaller = GClosureMarshal
object GSignalCMarshaller: 
  given _tag: Tag[GSignalCMarshaller] = GClosureMarshal._tag
  inline def apply(inline o: GClosureMarshal): GSignalCMarshaller = o
  extension (v: GSignalCMarshaller)
    inline def value: GClosureMarshal = v

type GSignalCVaMarshaller = GVaClosureMarshal
object GSignalCVaMarshaller: 
  given _tag: Tag[GSignalCVaMarshaller] = GVaClosureMarshal._tag
  inline def apply(inline o: GVaClosureMarshal): GSignalCVaMarshaller = o
  extension (v: GSignalCVaMarshaller)
    inline def value: GVaClosureMarshal = v

opaque type GSignalEmissionHook = CFuncPtr4[Ptr[GSignalInvocationHint], guint, Ptr[GValue], gpointer, gboolean]
object GSignalEmissionHook: 
  given _tag: Tag[GSignalEmissionHook] = Tag.materializeCFuncPtr4[Ptr[GSignalInvocationHint], guint, Ptr[GValue], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr4[Ptr[GSignalInvocationHint], guint, Ptr[GValue], gpointer, gboolean]): GSignalEmissionHook = o
  extension (v: GSignalEmissionHook)
    inline def value: CFuncPtr4[Ptr[GSignalInvocationHint], guint, Ptr[GValue], gpointer, gboolean] = v

opaque type GSimpleActionGroup_autoptr = Ptr[GSimpleActionGroup]
object GSimpleActionGroup_autoptr: 
  given _tag: Tag[GSimpleActionGroup_autoptr] = Tag.Ptr[GSimpleActionGroup](GSimpleActionGroup._tag)
  inline def apply(inline o: Ptr[GSimpleActionGroup]): GSimpleActionGroup_autoptr = o
  extension (v: GSimpleActionGroup_autoptr)
    inline def value: Ptr[GSimpleActionGroup] = v

opaque type GSimpleActionGroup_listautoptr = Ptr[GList]
object GSimpleActionGroup_listautoptr: 
  given _tag: Tag[GSimpleActionGroup_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GSimpleActionGroup_listautoptr = o
  extension (v: GSimpleActionGroup_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GSimpleActionGroup_queueautoptr = Ptr[GQueue]
object GSimpleActionGroup_queueautoptr: 
  given _tag: Tag[GSimpleActionGroup_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GSimpleActionGroup_queueautoptr = o
  extension (v: GSimpleActionGroup_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GSimpleActionGroup_slistautoptr = Ptr[GSList]
object GSimpleActionGroup_slistautoptr: 
  given _tag: Tag[GSimpleActionGroup_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSimpleActionGroup_slistautoptr = o
  extension (v: GSimpleActionGroup_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GSimpleAction_autoptr = Ptr[GSimpleAction]
object GSimpleAction_autoptr: 
  given _tag: Tag[GSimpleAction_autoptr] = Tag.Ptr[GSimpleAction](GSimpleAction._tag)
  inline def apply(inline o: Ptr[GSimpleAction]): GSimpleAction_autoptr = o
  extension (v: GSimpleAction_autoptr)
    inline def value: Ptr[GSimpleAction] = v

opaque type GSimpleAction_listautoptr = Ptr[GList]
object GSimpleAction_listautoptr: 
  given _tag: Tag[GSimpleAction_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GSimpleAction_listautoptr = o
  extension (v: GSimpleAction_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GSimpleAction_queueautoptr = Ptr[GQueue]
object GSimpleAction_queueautoptr: 
  given _tag: Tag[GSimpleAction_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GSimpleAction_queueautoptr = o
  extension (v: GSimpleAction_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GSimpleAction_slistautoptr = Ptr[GSList]
object GSimpleAction_slistautoptr: 
  given _tag: Tag[GSimpleAction_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSimpleAction_slistautoptr = o
  extension (v: GSimpleAction_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GSimpleAsyncResult_autoptr = Ptr[GSimpleAsyncResult]
object GSimpleAsyncResult_autoptr: 
  given _tag: Tag[GSimpleAsyncResult_autoptr] = Tag.Ptr[GSimpleAsyncResult](GSimpleAsyncResult._tag)
  inline def apply(inline o: Ptr[GSimpleAsyncResult]): GSimpleAsyncResult_autoptr = o
  extension (v: GSimpleAsyncResult_autoptr)
    inline def value: Ptr[GSimpleAsyncResult] = v

opaque type GSimpleAsyncResult_listautoptr = Ptr[GList]
object GSimpleAsyncResult_listautoptr: 
  given _tag: Tag[GSimpleAsyncResult_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GSimpleAsyncResult_listautoptr = o
  extension (v: GSimpleAsyncResult_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GSimpleAsyncResult_queueautoptr = Ptr[GQueue]
object GSimpleAsyncResult_queueautoptr: 
  given _tag: Tag[GSimpleAsyncResult_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GSimpleAsyncResult_queueautoptr = o
  extension (v: GSimpleAsyncResult_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GSimpleAsyncResult_slistautoptr = Ptr[GSList]
object GSimpleAsyncResult_slistautoptr: 
  given _tag: Tag[GSimpleAsyncResult_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSimpleAsyncResult_slistautoptr = o
  extension (v: GSimpleAsyncResult_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GSimpleAsyncThreadFunc = CFuncPtr3[Ptr[GSimpleAsyncResult], Ptr[GObject], Ptr[GCancellable], Unit]
object GSimpleAsyncThreadFunc: 
  given _tag: Tag[GSimpleAsyncThreadFunc] = Tag.materializeCFuncPtr3[Ptr[GSimpleAsyncResult], Ptr[GObject], Ptr[GCancellable], Unit]
  inline def apply(inline o: CFuncPtr3[Ptr[GSimpleAsyncResult], Ptr[GObject], Ptr[GCancellable], Unit]): GSimpleAsyncThreadFunc = o
  extension (v: GSimpleAsyncThreadFunc)
    inline def value: CFuncPtr3[Ptr[GSimpleAsyncResult], Ptr[GObject], Ptr[GCancellable], Unit] = v

opaque type GSimplePermission_autoptr = Ptr[GSimplePermission]
object GSimplePermission_autoptr: 
  given _tag: Tag[GSimplePermission_autoptr] = Tag.Ptr[GSimplePermission](GSimplePermission._tag)
  inline def apply(inline o: Ptr[GSimplePermission]): GSimplePermission_autoptr = o
  extension (v: GSimplePermission_autoptr)
    inline def value: Ptr[GSimplePermission] = v

opaque type GSimplePermission_listautoptr = Ptr[GList]
object GSimplePermission_listautoptr: 
  given _tag: Tag[GSimplePermission_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GSimplePermission_listautoptr = o
  extension (v: GSimplePermission_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GSimplePermission_queueautoptr = Ptr[GQueue]
object GSimplePermission_queueautoptr: 
  given _tag: Tag[GSimplePermission_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GSimplePermission_queueautoptr = o
  extension (v: GSimplePermission_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GSimplePermission_slistautoptr = Ptr[GSList]
object GSimplePermission_slistautoptr: 
  given _tag: Tag[GSimplePermission_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSimplePermission_slistautoptr = o
  extension (v: GSimplePermission_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GSimpleProxyResolver_autoptr = Ptr[GSimpleProxyResolver]
object GSimpleProxyResolver_autoptr: 
  given _tag: Tag[GSimpleProxyResolver_autoptr] = Tag.Ptr[GSimpleProxyResolver](GSimpleProxyResolver._tag)
  inline def apply(inline o: Ptr[GSimpleProxyResolver]): GSimpleProxyResolver_autoptr = o
  extension (v: GSimpleProxyResolver_autoptr)
    inline def value: Ptr[GSimpleProxyResolver] = v

opaque type GSimpleProxyResolver_listautoptr = Ptr[GList]
object GSimpleProxyResolver_listautoptr: 
  given _tag: Tag[GSimpleProxyResolver_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GSimpleProxyResolver_listautoptr = o
  extension (v: GSimpleProxyResolver_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GSimpleProxyResolver_queueautoptr = Ptr[GQueue]
object GSimpleProxyResolver_queueautoptr: 
  given _tag: Tag[GSimpleProxyResolver_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GSimpleProxyResolver_queueautoptr = o
  extension (v: GSimpleProxyResolver_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GSimpleProxyResolver_slistautoptr = Ptr[GSList]
object GSimpleProxyResolver_slistautoptr: 
  given _tag: Tag[GSimpleProxyResolver_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSimpleProxyResolver_slistautoptr = o
  extension (v: GSimpleProxyResolver_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GSocketAddressEnumerator_autoptr = Ptr[GSocketAddressEnumerator]
object GSocketAddressEnumerator_autoptr: 
  given _tag: Tag[GSocketAddressEnumerator_autoptr] = Tag.Ptr[GSocketAddressEnumerator](GSocketAddressEnumerator._tag)
  inline def apply(inline o: Ptr[GSocketAddressEnumerator]): GSocketAddressEnumerator_autoptr = o
  extension (v: GSocketAddressEnumerator_autoptr)
    inline def value: Ptr[GSocketAddressEnumerator] = v

opaque type GSocketAddressEnumerator_listautoptr = Ptr[GList]
object GSocketAddressEnumerator_listautoptr: 
  given _tag: Tag[GSocketAddressEnumerator_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GSocketAddressEnumerator_listautoptr = o
  extension (v: GSocketAddressEnumerator_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GSocketAddressEnumerator_queueautoptr = Ptr[GQueue]
object GSocketAddressEnumerator_queueautoptr: 
  given _tag: Tag[GSocketAddressEnumerator_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GSocketAddressEnumerator_queueautoptr = o
  extension (v: GSocketAddressEnumerator_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GSocketAddressEnumerator_slistautoptr = Ptr[GSList]
object GSocketAddressEnumerator_slistautoptr: 
  given _tag: Tag[GSocketAddressEnumerator_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSocketAddressEnumerator_slistautoptr = o
  extension (v: GSocketAddressEnumerator_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GSocketAddress_autoptr = Ptr[GSocketAddress]
object GSocketAddress_autoptr: 
  given _tag: Tag[GSocketAddress_autoptr] = Tag.Ptr[GSocketAddress](GSocketAddress._tag)
  inline def apply(inline o: Ptr[GSocketAddress]): GSocketAddress_autoptr = o
  extension (v: GSocketAddress_autoptr)
    inline def value: Ptr[GSocketAddress] = v

opaque type GSocketAddress_listautoptr = Ptr[GList]
object GSocketAddress_listautoptr: 
  given _tag: Tag[GSocketAddress_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GSocketAddress_listautoptr = o
  extension (v: GSocketAddress_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GSocketAddress_queueautoptr = Ptr[GQueue]
object GSocketAddress_queueautoptr: 
  given _tag: Tag[GSocketAddress_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GSocketAddress_queueautoptr = o
  extension (v: GSocketAddress_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GSocketAddress_slistautoptr = Ptr[GSList]
object GSocketAddress_slistautoptr: 
  given _tag: Tag[GSocketAddress_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSocketAddress_slistautoptr = o
  extension (v: GSocketAddress_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GSocketClient_autoptr = Ptr[GSocketClient]
object GSocketClient_autoptr: 
  given _tag: Tag[GSocketClient_autoptr] = Tag.Ptr[GSocketClient](GSocketClient._tag)
  inline def apply(inline o: Ptr[GSocketClient]): GSocketClient_autoptr = o
  extension (v: GSocketClient_autoptr)
    inline def value: Ptr[GSocketClient] = v

opaque type GSocketClient_listautoptr = Ptr[GList]
object GSocketClient_listautoptr: 
  given _tag: Tag[GSocketClient_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GSocketClient_listautoptr = o
  extension (v: GSocketClient_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GSocketClient_queueautoptr = Ptr[GQueue]
object GSocketClient_queueautoptr: 
  given _tag: Tag[GSocketClient_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GSocketClient_queueautoptr = o
  extension (v: GSocketClient_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GSocketClient_slistautoptr = Ptr[GSList]
object GSocketClient_slistautoptr: 
  given _tag: Tag[GSocketClient_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSocketClient_slistautoptr = o
  extension (v: GSocketClient_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GSocketConnectable_autoptr = Ptr[GSocketConnectable]
object GSocketConnectable_autoptr: 
  given _tag: Tag[GSocketConnectable_autoptr] = Tag.Ptr[GSocketConnectable](GSocketConnectable._tag)
  inline def apply(inline o: Ptr[GSocketConnectable]): GSocketConnectable_autoptr = o
  extension (v: GSocketConnectable_autoptr)
    inline def value: Ptr[GSocketConnectable] = v

opaque type GSocketConnectable_listautoptr = Ptr[GList]
object GSocketConnectable_listautoptr: 
  given _tag: Tag[GSocketConnectable_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GSocketConnectable_listautoptr = o
  extension (v: GSocketConnectable_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GSocketConnectable_queueautoptr = Ptr[GQueue]
object GSocketConnectable_queueautoptr: 
  given _tag: Tag[GSocketConnectable_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GSocketConnectable_queueautoptr = o
  extension (v: GSocketConnectable_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GSocketConnectable_slistautoptr = Ptr[GSList]
object GSocketConnectable_slistautoptr: 
  given _tag: Tag[GSocketConnectable_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSocketConnectable_slistautoptr = o
  extension (v: GSocketConnectable_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GSocketConnection_autoptr = Ptr[GSocketConnection]
object GSocketConnection_autoptr: 
  given _tag: Tag[GSocketConnection_autoptr] = Tag.Ptr[GSocketConnection](GSocketConnection._tag)
  inline def apply(inline o: Ptr[GSocketConnection]): GSocketConnection_autoptr = o
  extension (v: GSocketConnection_autoptr)
    inline def value: Ptr[GSocketConnection] = v

opaque type GSocketConnection_listautoptr = Ptr[GList]
object GSocketConnection_listautoptr: 
  given _tag: Tag[GSocketConnection_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GSocketConnection_listautoptr = o
  extension (v: GSocketConnection_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GSocketConnection_queueautoptr = Ptr[GQueue]
object GSocketConnection_queueautoptr: 
  given _tag: Tag[GSocketConnection_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GSocketConnection_queueautoptr = o
  extension (v: GSocketConnection_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GSocketConnection_slistautoptr = Ptr[GSList]
object GSocketConnection_slistautoptr: 
  given _tag: Tag[GSocketConnection_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSocketConnection_slistautoptr = o
  extension (v: GSocketConnection_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GSocketControlMessage_autoptr = Ptr[GSocketControlMessage]
object GSocketControlMessage_autoptr: 
  given _tag: Tag[GSocketControlMessage_autoptr] = Tag.Ptr[GSocketControlMessage](GSocketControlMessage._tag)
  inline def apply(inline o: Ptr[GSocketControlMessage]): GSocketControlMessage_autoptr = o
  extension (v: GSocketControlMessage_autoptr)
    inline def value: Ptr[GSocketControlMessage] = v

opaque type GSocketControlMessage_listautoptr = Ptr[GList]
object GSocketControlMessage_listautoptr: 
  given _tag: Tag[GSocketControlMessage_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GSocketControlMessage_listautoptr = o
  extension (v: GSocketControlMessage_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GSocketControlMessage_queueautoptr = Ptr[GQueue]
object GSocketControlMessage_queueautoptr: 
  given _tag: Tag[GSocketControlMessage_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GSocketControlMessage_queueautoptr = o
  extension (v: GSocketControlMessage_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GSocketControlMessage_slistautoptr = Ptr[GSList]
object GSocketControlMessage_slistautoptr: 
  given _tag: Tag[GSocketControlMessage_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSocketControlMessage_slistautoptr = o
  extension (v: GSocketControlMessage_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GSocketListener_autoptr = Ptr[GSocketListener]
object GSocketListener_autoptr: 
  given _tag: Tag[GSocketListener_autoptr] = Tag.Ptr[GSocketListener](GSocketListener._tag)
  inline def apply(inline o: Ptr[GSocketListener]): GSocketListener_autoptr = o
  extension (v: GSocketListener_autoptr)
    inline def value: Ptr[GSocketListener] = v

opaque type GSocketListener_listautoptr = Ptr[GList]
object GSocketListener_listautoptr: 
  given _tag: Tag[GSocketListener_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GSocketListener_listautoptr = o
  extension (v: GSocketListener_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GSocketListener_queueautoptr = Ptr[GQueue]
object GSocketListener_queueautoptr: 
  given _tag: Tag[GSocketListener_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GSocketListener_queueautoptr = o
  extension (v: GSocketListener_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GSocketListener_slistautoptr = Ptr[GSList]
object GSocketListener_slistautoptr: 
  given _tag: Tag[GSocketListener_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSocketListener_slistautoptr = o
  extension (v: GSocketListener_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GSocketService_autoptr = Ptr[GSocketService]
object GSocketService_autoptr: 
  given _tag: Tag[GSocketService_autoptr] = Tag.Ptr[GSocketService](GSocketService._tag)
  inline def apply(inline o: Ptr[GSocketService]): GSocketService_autoptr = o
  extension (v: GSocketService_autoptr)
    inline def value: Ptr[GSocketService] = v

opaque type GSocketService_listautoptr = Ptr[GList]
object GSocketService_listautoptr: 
  given _tag: Tag[GSocketService_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GSocketService_listautoptr = o
  extension (v: GSocketService_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GSocketService_queueautoptr = Ptr[GQueue]
object GSocketService_queueautoptr: 
  given _tag: Tag[GSocketService_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GSocketService_queueautoptr = o
  extension (v: GSocketService_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GSocketService_slistautoptr = Ptr[GSList]
object GSocketService_slistautoptr: 
  given _tag: Tag[GSocketService_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSocketService_slistautoptr = o
  extension (v: GSocketService_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GSocketSourceFunc = CFuncPtr3[Ptr[GSocket], GIOCondition, gpointer, gboolean]
object GSocketSourceFunc: 
  given _tag: Tag[GSocketSourceFunc] = Tag.materializeCFuncPtr3[Ptr[GSocket], GIOCondition, gpointer, gboolean]
  inline def apply(inline o: CFuncPtr3[Ptr[GSocket], GIOCondition, gpointer, gboolean]): GSocketSourceFunc = o
  extension (v: GSocketSourceFunc)
    inline def value: CFuncPtr3[Ptr[GSocket], GIOCondition, gpointer, gboolean] = v

opaque type GSocket_autoptr = Ptr[GSocket]
object GSocket_autoptr: 
  given _tag: Tag[GSocket_autoptr] = Tag.Ptr[GSocket](GSocket._tag)
  inline def apply(inline o: Ptr[GSocket]): GSocket_autoptr = o
  extension (v: GSocket_autoptr)
    inline def value: Ptr[GSocket] = v

opaque type GSocket_listautoptr = Ptr[GList]
object GSocket_listautoptr: 
  given _tag: Tag[GSocket_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GSocket_listautoptr = o
  extension (v: GSocket_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GSocket_queueautoptr = Ptr[GQueue]
object GSocket_queueautoptr: 
  given _tag: Tag[GSocket_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GSocket_queueautoptr = o
  extension (v: GSocket_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GSocket_slistautoptr = Ptr[GSList]
object GSocket_slistautoptr: 
  given _tag: Tag[GSocket_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSocket_slistautoptr = o
  extension (v: GSocket_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GSourceDisposeFunc = CFuncPtr1[Ptr[GSource], Unit]
object GSourceDisposeFunc: 
  given _tag: Tag[GSourceDisposeFunc] = Tag.materializeCFuncPtr1[Ptr[GSource], Unit]
  inline def apply(inline o: CFuncPtr1[Ptr[GSource], Unit]): GSourceDisposeFunc = o
  extension (v: GSourceDisposeFunc)
    inline def value: CFuncPtr1[Ptr[GSource], Unit] = v

opaque type GSourceDummyMarshal = CFuncPtr0[Unit]
object GSourceDummyMarshal: 
  given _tag: Tag[GSourceDummyMarshal] = Tag.materializeCFuncPtr0[Unit]
  inline def apply(inline o: CFuncPtr0[Unit]): GSourceDummyMarshal = o
  extension (v: GSourceDummyMarshal)
    inline def value: CFuncPtr0[Unit] = v

opaque type GSourceFunc = CFuncPtr1[gpointer, gboolean]
object GSourceFunc: 
  given _tag: Tag[GSourceFunc] = Tag.materializeCFuncPtr1[gpointer, gboolean]
  inline def apply(inline o: CFuncPtr1[gpointer, gboolean]): GSourceFunc = o
  extension (v: GSourceFunc)
    inline def value: CFuncPtr1[gpointer, gboolean] = v

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

opaque type GSpawnChildSetupFunc = CFuncPtr1[gpointer, Unit]
object GSpawnChildSetupFunc: 
  given _tag: Tag[GSpawnChildSetupFunc] = Tag.materializeCFuncPtr1[gpointer, Unit]
  inline def apply(inline o: CFuncPtr1[gpointer, Unit]): GSpawnChildSetupFunc = o
  extension (v: GSpawnChildSetupFunc)
    inline def value: CFuncPtr1[gpointer, Unit] = v

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

opaque type GSubprocessLauncher_autoptr = Ptr[GSubprocessLauncher]
object GSubprocessLauncher_autoptr: 
  given _tag: Tag[GSubprocessLauncher_autoptr] = Tag.Ptr[GSubprocessLauncher](GSubprocessLauncher._tag)
  inline def apply(inline o: Ptr[GSubprocessLauncher]): GSubprocessLauncher_autoptr = o
  extension (v: GSubprocessLauncher_autoptr)
    inline def value: Ptr[GSubprocessLauncher] = v

opaque type GSubprocessLauncher_listautoptr = Ptr[GList]
object GSubprocessLauncher_listautoptr: 
  given _tag: Tag[GSubprocessLauncher_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GSubprocessLauncher_listautoptr = o
  extension (v: GSubprocessLauncher_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GSubprocessLauncher_queueautoptr = Ptr[GQueue]
object GSubprocessLauncher_queueautoptr: 
  given _tag: Tag[GSubprocessLauncher_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GSubprocessLauncher_queueautoptr = o
  extension (v: GSubprocessLauncher_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GSubprocessLauncher_slistautoptr = Ptr[GSList]
object GSubprocessLauncher_slistautoptr: 
  given _tag: Tag[GSubprocessLauncher_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSubprocessLauncher_slistautoptr = o
  extension (v: GSubprocessLauncher_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GSubprocess_autoptr = Ptr[GSubprocess]
object GSubprocess_autoptr: 
  given _tag: Tag[GSubprocess_autoptr] = Tag.Ptr[GSubprocess](GSubprocess._tag)
  inline def apply(inline o: Ptr[GSubprocess]): GSubprocess_autoptr = o
  extension (v: GSubprocess_autoptr)
    inline def value: Ptr[GSubprocess] = v

opaque type GSubprocess_listautoptr = Ptr[GList]
object GSubprocess_listautoptr: 
  given _tag: Tag[GSubprocess_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GSubprocess_listautoptr = o
  extension (v: GSubprocess_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GSubprocess_queueautoptr = Ptr[GQueue]
object GSubprocess_queueautoptr: 
  given _tag: Tag[GSubprocess_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GSubprocess_queueautoptr = o
  extension (v: GSubprocess_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GSubprocess_slistautoptr = Ptr[GSList]
object GSubprocess_slistautoptr: 
  given _tag: Tag[GSubprocess_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSubprocess_slistautoptr = o
  extension (v: GSubprocess_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GTaskThreadFunc = CFuncPtr4[Ptr[GTask], gpointer, gpointer, Ptr[GCancellable], Unit]
object GTaskThreadFunc: 
  given _tag: Tag[GTaskThreadFunc] = Tag.materializeCFuncPtr4[Ptr[GTask], gpointer, gpointer, Ptr[GCancellable], Unit]
  inline def apply(inline o: CFuncPtr4[Ptr[GTask], gpointer, gpointer, Ptr[GCancellable], Unit]): GTaskThreadFunc = o
  extension (v: GTaskThreadFunc)
    inline def value: CFuncPtr4[Ptr[GTask], gpointer, gpointer, Ptr[GCancellable], Unit] = v

opaque type GTask_autoptr = Ptr[GTask]
object GTask_autoptr: 
  given _tag: Tag[GTask_autoptr] = Tag.Ptr[GTask](GTask._tag)
  inline def apply(inline o: Ptr[GTask]): GTask_autoptr = o
  extension (v: GTask_autoptr)
    inline def value: Ptr[GTask] = v

opaque type GTask_listautoptr = Ptr[GList]
object GTask_listautoptr: 
  given _tag: Tag[GTask_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GTask_listautoptr = o
  extension (v: GTask_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GTask_queueautoptr = Ptr[GQueue]
object GTask_queueautoptr: 
  given _tag: Tag[GTask_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GTask_queueautoptr = o
  extension (v: GTask_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GTask_slistautoptr = Ptr[GSList]
object GTask_slistautoptr: 
  given _tag: Tag[GTask_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GTask_slistautoptr = o
  extension (v: GTask_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GTcpConnection_autoptr = Ptr[GTcpConnection]
object GTcpConnection_autoptr: 
  given _tag: Tag[GTcpConnection_autoptr] = Tag.Ptr[GTcpConnection](GTcpConnection._tag)
  inline def apply(inline o: Ptr[GTcpConnection]): GTcpConnection_autoptr = o
  extension (v: GTcpConnection_autoptr)
    inline def value: Ptr[GTcpConnection] = v

opaque type GTcpConnection_listautoptr = Ptr[GList]
object GTcpConnection_listautoptr: 
  given _tag: Tag[GTcpConnection_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GTcpConnection_listautoptr = o
  extension (v: GTcpConnection_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GTcpConnection_queueautoptr = Ptr[GQueue]
object GTcpConnection_queueautoptr: 
  given _tag: Tag[GTcpConnection_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GTcpConnection_queueautoptr = o
  extension (v: GTcpConnection_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GTcpConnection_slistautoptr = Ptr[GSList]
object GTcpConnection_slistautoptr: 
  given _tag: Tag[GTcpConnection_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GTcpConnection_slistautoptr = o
  extension (v: GTcpConnection_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GTcpWrapperConnection_autoptr = Ptr[GTcpWrapperConnection]
object GTcpWrapperConnection_autoptr: 
  given _tag: Tag[GTcpWrapperConnection_autoptr] = Tag.Ptr[GTcpWrapperConnection](GTcpWrapperConnection._tag)
  inline def apply(inline o: Ptr[GTcpWrapperConnection]): GTcpWrapperConnection_autoptr = o
  extension (v: GTcpWrapperConnection_autoptr)
    inline def value: Ptr[GTcpWrapperConnection] = v

opaque type GTcpWrapperConnection_listautoptr = Ptr[GList]
object GTcpWrapperConnection_listautoptr: 
  given _tag: Tag[GTcpWrapperConnection_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GTcpWrapperConnection_listautoptr = o
  extension (v: GTcpWrapperConnection_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GTcpWrapperConnection_queueautoptr = Ptr[GQueue]
object GTcpWrapperConnection_queueautoptr: 
  given _tag: Tag[GTcpWrapperConnection_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GTcpWrapperConnection_queueautoptr = o
  extension (v: GTcpWrapperConnection_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GTcpWrapperConnection_slistautoptr = Ptr[GSList]
object GTcpWrapperConnection_slistautoptr: 
  given _tag: Tag[GTcpWrapperConnection_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GTcpWrapperConnection_slistautoptr = o
  extension (v: GTcpWrapperConnection_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GTestDBus_autoptr = Ptr[GTestDBus]
object GTestDBus_autoptr: 
  given _tag: Tag[GTestDBus_autoptr] = Tag.Ptr[GTestDBus](GTestDBus._tag)
  inline def apply(inline o: Ptr[GTestDBus]): GTestDBus_autoptr = o
  extension (v: GTestDBus_autoptr)
    inline def value: Ptr[GTestDBus] = v

opaque type GTestDBus_listautoptr = Ptr[GList]
object GTestDBus_listautoptr: 
  given _tag: Tag[GTestDBus_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GTestDBus_listautoptr = o
  extension (v: GTestDBus_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GTestDBus_queueautoptr = Ptr[GQueue]
object GTestDBus_queueautoptr: 
  given _tag: Tag[GTestDBus_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GTestDBus_queueautoptr = o
  extension (v: GTestDBus_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GTestDBus_slistautoptr = Ptr[GSList]
object GTestDBus_slistautoptr: 
  given _tag: Tag[GTestDBus_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GTestDBus_slistautoptr = o
  extension (v: GTestDBus_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GTestDataFunc = CFuncPtr1[gconstpointer, Unit]
object GTestDataFunc: 
  given _tag: Tag[GTestDataFunc] = Tag.materializeCFuncPtr1[gconstpointer, Unit]
  inline def apply(inline o: CFuncPtr1[gconstpointer, Unit]): GTestDataFunc = o
  extension (v: GTestDataFunc)
    inline def value: CFuncPtr1[gconstpointer, Unit] = v

opaque type GTestFixtureFunc = CFuncPtr2[gpointer, gconstpointer, Unit]
object GTestFixtureFunc: 
  given _tag: Tag[GTestFixtureFunc] = Tag.materializeCFuncPtr2[gpointer, gconstpointer, Unit]
  inline def apply(inline o: CFuncPtr2[gpointer, gconstpointer, Unit]): GTestFixtureFunc = o
  extension (v: GTestFixtureFunc)
    inline def value: CFuncPtr2[gpointer, gconstpointer, Unit] = v

opaque type GTestFunc = CFuncPtr0[Unit]
object GTestFunc: 
  given _tag: Tag[GTestFunc] = Tag.materializeCFuncPtr0[Unit]
  inline def apply(inline o: CFuncPtr0[Unit]): GTestFunc = o
  extension (v: GTestFunc)
    inline def value: CFuncPtr0[Unit] = v

opaque type GTestLogFatalFunc = CFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, gboolean]
object GTestLogFatalFunc: 
  given _tag: Tag[GTestLogFatalFunc] = Tag.materializeCFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, gboolean]): GTestLogFatalFunc = o
  extension (v: GTestLogFatalFunc)
    inline def value: CFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, gboolean] = v

opaque type GThemedIcon_autoptr = Ptr[GThemedIcon]
object GThemedIcon_autoptr: 
  given _tag: Tag[GThemedIcon_autoptr] = Tag.Ptr[GThemedIcon](GThemedIcon._tag)
  inline def apply(inline o: Ptr[GThemedIcon]): GThemedIcon_autoptr = o
  extension (v: GThemedIcon_autoptr)
    inline def value: Ptr[GThemedIcon] = v

opaque type GThemedIcon_listautoptr = Ptr[GList]
object GThemedIcon_listautoptr: 
  given _tag: Tag[GThemedIcon_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GThemedIcon_listautoptr = o
  extension (v: GThemedIcon_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GThemedIcon_queueautoptr = Ptr[GQueue]
object GThemedIcon_queueautoptr: 
  given _tag: Tag[GThemedIcon_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GThemedIcon_queueautoptr = o
  extension (v: GThemedIcon_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GThemedIcon_slistautoptr = Ptr[GSList]
object GThemedIcon_slistautoptr: 
  given _tag: Tag[GThemedIcon_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GThemedIcon_slistautoptr = o
  extension (v: GThemedIcon_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GThreadFunc = CFuncPtr1[gpointer, gpointer]
object GThreadFunc: 
  given _tag: Tag[GThreadFunc] = Tag.materializeCFuncPtr1[gpointer, gpointer]
  inline def apply(inline o: CFuncPtr1[gpointer, gpointer]): GThreadFunc = o
  extension (v: GThreadFunc)
    inline def value: CFuncPtr1[gpointer, gpointer] = v

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

opaque type GThreadedSocketService_autoptr = Ptr[GThreadedSocketService]
object GThreadedSocketService_autoptr: 
  given _tag: Tag[GThreadedSocketService_autoptr] = Tag.Ptr[GThreadedSocketService](GThreadedSocketService._tag)
  inline def apply(inline o: Ptr[GThreadedSocketService]): GThreadedSocketService_autoptr = o
  extension (v: GThreadedSocketService_autoptr)
    inline def value: Ptr[GThreadedSocketService] = v

opaque type GThreadedSocketService_listautoptr = Ptr[GList]
object GThreadedSocketService_listautoptr: 
  given _tag: Tag[GThreadedSocketService_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GThreadedSocketService_listautoptr = o
  extension (v: GThreadedSocketService_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GThreadedSocketService_queueautoptr = Ptr[GQueue]
object GThreadedSocketService_queueautoptr: 
  given _tag: Tag[GThreadedSocketService_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GThreadedSocketService_queueautoptr = o
  extension (v: GThreadedSocketService_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GThreadedSocketService_slistautoptr = Ptr[GSList]
object GThreadedSocketService_slistautoptr: 
  given _tag: Tag[GThreadedSocketService_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GThreadedSocketService_slistautoptr = o
  extension (v: GThreadedSocketService_slistautoptr)
    inline def value: Ptr[GSList] = v

type GTime = gint32
object GTime: 
  given _tag: Tag[GTime] = gint32._tag
  inline def apply(inline o: gint32): GTime = o
  extension (v: GTime)
    inline def value: gint32 = v

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

opaque type GTlsBackend_autoptr = Ptr[GTlsBackend]
object GTlsBackend_autoptr: 
  given _tag: Tag[GTlsBackend_autoptr] = Tag.Ptr[GTlsBackend](GTlsBackend._tag)
  inline def apply(inline o: Ptr[GTlsBackend]): GTlsBackend_autoptr = o
  extension (v: GTlsBackend_autoptr)
    inline def value: Ptr[GTlsBackend] = v

opaque type GTlsBackend_listautoptr = Ptr[GList]
object GTlsBackend_listautoptr: 
  given _tag: Tag[GTlsBackend_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GTlsBackend_listautoptr = o
  extension (v: GTlsBackend_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GTlsBackend_queueautoptr = Ptr[GQueue]
object GTlsBackend_queueautoptr: 
  given _tag: Tag[GTlsBackend_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GTlsBackend_queueautoptr = o
  extension (v: GTlsBackend_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GTlsBackend_slistautoptr = Ptr[GSList]
object GTlsBackend_slistautoptr: 
  given _tag: Tag[GTlsBackend_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GTlsBackend_slistautoptr = o
  extension (v: GTlsBackend_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GTlsCertificate_autoptr = Ptr[GTlsCertificate]
object GTlsCertificate_autoptr: 
  given _tag: Tag[GTlsCertificate_autoptr] = Tag.Ptr[GTlsCertificate](GTlsCertificate._tag)
  inline def apply(inline o: Ptr[GTlsCertificate]): GTlsCertificate_autoptr = o
  extension (v: GTlsCertificate_autoptr)
    inline def value: Ptr[GTlsCertificate] = v

opaque type GTlsCertificate_listautoptr = Ptr[GList]
object GTlsCertificate_listautoptr: 
  given _tag: Tag[GTlsCertificate_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GTlsCertificate_listautoptr = o
  extension (v: GTlsCertificate_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GTlsCertificate_queueautoptr = Ptr[GQueue]
object GTlsCertificate_queueautoptr: 
  given _tag: Tag[GTlsCertificate_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GTlsCertificate_queueautoptr = o
  extension (v: GTlsCertificate_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GTlsCertificate_slistautoptr = Ptr[GSList]
object GTlsCertificate_slistautoptr: 
  given _tag: Tag[GTlsCertificate_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GTlsCertificate_slistautoptr = o
  extension (v: GTlsCertificate_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GTlsClientConnection_autoptr = Ptr[GTlsClientConnection]
object GTlsClientConnection_autoptr: 
  given _tag: Tag[GTlsClientConnection_autoptr] = Tag.Ptr[GTlsClientConnection](GTlsClientConnection._tag)
  inline def apply(inline o: Ptr[GTlsClientConnection]): GTlsClientConnection_autoptr = o
  extension (v: GTlsClientConnection_autoptr)
    inline def value: Ptr[GTlsClientConnection] = v

opaque type GTlsClientConnection_listautoptr = Ptr[GList]
object GTlsClientConnection_listautoptr: 
  given _tag: Tag[GTlsClientConnection_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GTlsClientConnection_listautoptr = o
  extension (v: GTlsClientConnection_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GTlsClientConnection_queueautoptr = Ptr[GQueue]
object GTlsClientConnection_queueautoptr: 
  given _tag: Tag[GTlsClientConnection_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GTlsClientConnection_queueautoptr = o
  extension (v: GTlsClientConnection_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GTlsClientConnection_slistautoptr = Ptr[GSList]
object GTlsClientConnection_slistautoptr: 
  given _tag: Tag[GTlsClientConnection_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GTlsClientConnection_slistautoptr = o
  extension (v: GTlsClientConnection_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GTlsConnection_autoptr = Ptr[GTlsConnection]
object GTlsConnection_autoptr: 
  given _tag: Tag[GTlsConnection_autoptr] = Tag.Ptr[GTlsConnection](GTlsConnection._tag)
  inline def apply(inline o: Ptr[GTlsConnection]): GTlsConnection_autoptr = o
  extension (v: GTlsConnection_autoptr)
    inline def value: Ptr[GTlsConnection] = v

opaque type GTlsConnection_listautoptr = Ptr[GList]
object GTlsConnection_listautoptr: 
  given _tag: Tag[GTlsConnection_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GTlsConnection_listautoptr = o
  extension (v: GTlsConnection_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GTlsConnection_queueautoptr = Ptr[GQueue]
object GTlsConnection_queueautoptr: 
  given _tag: Tag[GTlsConnection_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GTlsConnection_queueautoptr = o
  extension (v: GTlsConnection_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GTlsConnection_slistautoptr = Ptr[GSList]
object GTlsConnection_slistautoptr: 
  given _tag: Tag[GTlsConnection_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GTlsConnection_slistautoptr = o
  extension (v: GTlsConnection_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GTlsDatabase_autoptr = Ptr[GTlsDatabase]
object GTlsDatabase_autoptr: 
  given _tag: Tag[GTlsDatabase_autoptr] = Tag.Ptr[GTlsDatabase](GTlsDatabase._tag)
  inline def apply(inline o: Ptr[GTlsDatabase]): GTlsDatabase_autoptr = o
  extension (v: GTlsDatabase_autoptr)
    inline def value: Ptr[GTlsDatabase] = v

opaque type GTlsDatabase_listautoptr = Ptr[GList]
object GTlsDatabase_listautoptr: 
  given _tag: Tag[GTlsDatabase_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GTlsDatabase_listautoptr = o
  extension (v: GTlsDatabase_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GTlsDatabase_queueautoptr = Ptr[GQueue]
object GTlsDatabase_queueautoptr: 
  given _tag: Tag[GTlsDatabase_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GTlsDatabase_queueautoptr = o
  extension (v: GTlsDatabase_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GTlsDatabase_slistautoptr = Ptr[GSList]
object GTlsDatabase_slistautoptr: 
  given _tag: Tag[GTlsDatabase_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GTlsDatabase_slistautoptr = o
  extension (v: GTlsDatabase_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GTlsFileDatabase_autoptr = Ptr[GTlsFileDatabase]
object GTlsFileDatabase_autoptr: 
  given _tag: Tag[GTlsFileDatabase_autoptr] = Tag.Ptr[GTlsFileDatabase](GTlsFileDatabase._tag)
  inline def apply(inline o: Ptr[GTlsFileDatabase]): GTlsFileDatabase_autoptr = o
  extension (v: GTlsFileDatabase_autoptr)
    inline def value: Ptr[GTlsFileDatabase] = v

opaque type GTlsFileDatabase_listautoptr = Ptr[GList]
object GTlsFileDatabase_listautoptr: 
  given _tag: Tag[GTlsFileDatabase_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GTlsFileDatabase_listautoptr = o
  extension (v: GTlsFileDatabase_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GTlsFileDatabase_queueautoptr = Ptr[GQueue]
object GTlsFileDatabase_queueautoptr: 
  given _tag: Tag[GTlsFileDatabase_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GTlsFileDatabase_queueautoptr = o
  extension (v: GTlsFileDatabase_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GTlsFileDatabase_slistautoptr = Ptr[GSList]
object GTlsFileDatabase_slistautoptr: 
  given _tag: Tag[GTlsFileDatabase_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GTlsFileDatabase_slistautoptr = o
  extension (v: GTlsFileDatabase_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GTlsInteraction_autoptr = Ptr[GTlsInteraction]
object GTlsInteraction_autoptr: 
  given _tag: Tag[GTlsInteraction_autoptr] = Tag.Ptr[GTlsInteraction](GTlsInteraction._tag)
  inline def apply(inline o: Ptr[GTlsInteraction]): GTlsInteraction_autoptr = o
  extension (v: GTlsInteraction_autoptr)
    inline def value: Ptr[GTlsInteraction] = v

opaque type GTlsInteraction_listautoptr = Ptr[GList]
object GTlsInteraction_listautoptr: 
  given _tag: Tag[GTlsInteraction_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GTlsInteraction_listautoptr = o
  extension (v: GTlsInteraction_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GTlsInteraction_queueautoptr = Ptr[GQueue]
object GTlsInteraction_queueautoptr: 
  given _tag: Tag[GTlsInteraction_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GTlsInteraction_queueautoptr = o
  extension (v: GTlsInteraction_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GTlsInteraction_slistautoptr = Ptr[GSList]
object GTlsInteraction_slistautoptr: 
  given _tag: Tag[GTlsInteraction_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GTlsInteraction_slistautoptr = o
  extension (v: GTlsInteraction_slistautoptr)
    inline def value: Ptr[GSList] = v

type GTlsPasswordFlags = _GTlsPasswordFlags
object GTlsPasswordFlags: 
  given _tag: Tag[GTlsPasswordFlags] = _GTlsPasswordFlags._tag
  inline def apply(inline o: _GTlsPasswordFlags): GTlsPasswordFlags = o
  extension (v: GTlsPasswordFlags)
    inline def value: _GTlsPasswordFlags = v

opaque type GTlsPassword_autoptr = Ptr[GTlsPassword]
object GTlsPassword_autoptr: 
  given _tag: Tag[GTlsPassword_autoptr] = Tag.Ptr[GTlsPassword](GTlsPassword._tag)
  inline def apply(inline o: Ptr[GTlsPassword]): GTlsPassword_autoptr = o
  extension (v: GTlsPassword_autoptr)
    inline def value: Ptr[GTlsPassword] = v

opaque type GTlsPassword_listautoptr = Ptr[GList]
object GTlsPassword_listautoptr: 
  given _tag: Tag[GTlsPassword_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GTlsPassword_listautoptr = o
  extension (v: GTlsPassword_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GTlsPassword_queueautoptr = Ptr[GQueue]
object GTlsPassword_queueautoptr: 
  given _tag: Tag[GTlsPassword_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GTlsPassword_queueautoptr = o
  extension (v: GTlsPassword_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GTlsPassword_slistautoptr = Ptr[GSList]
object GTlsPassword_slistautoptr: 
  given _tag: Tag[GTlsPassword_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GTlsPassword_slistautoptr = o
  extension (v: GTlsPassword_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GTlsServerConnection_autoptr = Ptr[GTlsServerConnection]
object GTlsServerConnection_autoptr: 
  given _tag: Tag[GTlsServerConnection_autoptr] = Tag.Ptr[GTlsServerConnection](GTlsServerConnection._tag)
  inline def apply(inline o: Ptr[GTlsServerConnection]): GTlsServerConnection_autoptr = o
  extension (v: GTlsServerConnection_autoptr)
    inline def value: Ptr[GTlsServerConnection] = v

opaque type GTlsServerConnection_listautoptr = Ptr[GList]
object GTlsServerConnection_listautoptr: 
  given _tag: Tag[GTlsServerConnection_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GTlsServerConnection_listautoptr = o
  extension (v: GTlsServerConnection_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GTlsServerConnection_queueautoptr = Ptr[GQueue]
object GTlsServerConnection_queueautoptr: 
  given _tag: Tag[GTlsServerConnection_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GTlsServerConnection_queueautoptr = o
  extension (v: GTlsServerConnection_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GTlsServerConnection_slistautoptr = Ptr[GSList]
object GTlsServerConnection_slistautoptr: 
  given _tag: Tag[GTlsServerConnection_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GTlsServerConnection_slistautoptr = o
  extension (v: GTlsServerConnection_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GToggleNotify = CFuncPtr3[gpointer, Ptr[GObject], gboolean, Unit]
object GToggleNotify: 
  given _tag: Tag[GToggleNotify] = Tag.materializeCFuncPtr3[gpointer, Ptr[GObject], gboolean, Unit]
  inline def apply(inline o: CFuncPtr3[gpointer, Ptr[GObject], gboolean, Unit]): GToggleNotify = o
  extension (v: GToggleNotify)
    inline def value: CFuncPtr3[gpointer, Ptr[GObject], gboolean, Unit] = v

opaque type GTranslateFunc = CFuncPtr2[Ptr[gchar], gpointer, Ptr[gchar]]
object GTranslateFunc: 
  given _tag: Tag[GTranslateFunc] = Tag.materializeCFuncPtr2[Ptr[gchar], gpointer, Ptr[gchar]]
  inline def apply(inline o: CFuncPtr2[Ptr[gchar], gpointer, Ptr[gchar]]): GTranslateFunc = o
  extension (v: GTranslateFunc)
    inline def value: CFuncPtr2[Ptr[gchar], gpointer, Ptr[gchar]] = v

opaque type GTraverseFunc = CFuncPtr3[gpointer, gpointer, gpointer, gboolean]
object GTraverseFunc: 
  given _tag: Tag[GTraverseFunc] = Tag.materializeCFuncPtr3[gpointer, gpointer, gpointer, gboolean]
  inline def apply(inline o: CFuncPtr3[gpointer, gpointer, gpointer, gboolean]): GTraverseFunc = o
  extension (v: GTraverseFunc)
    inline def value: CFuncPtr3[gpointer, gpointer, gpointer, gboolean] = v

opaque type GTraverseNodeFunc = CFuncPtr2[Ptr[GTreeNode], gpointer, gboolean]
object GTraverseNodeFunc: 
  given _tag: Tag[GTraverseNodeFunc] = Tag.materializeCFuncPtr2[Ptr[GTreeNode], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr2[Ptr[GTreeNode], gpointer, gboolean]): GTraverseNodeFunc = o
  extension (v: GTraverseNodeFunc)
    inline def value: CFuncPtr2[Ptr[GTreeNode], gpointer, gboolean] = v

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

type GType = gsize
object GType: 
  given _tag: Tag[GType] = gsize._tag
  inline def apply(inline o: gsize): GType = o
  extension (v: GType)
    inline def value: gsize = v

opaque type GTypeClassCacheFunc = CFuncPtr2[gpointer, Ptr[GTypeClass], gboolean]
object GTypeClassCacheFunc: 
  given _tag: Tag[GTypeClassCacheFunc] = Tag.materializeCFuncPtr2[gpointer, Ptr[GTypeClass], gboolean]
  inline def apply(inline o: CFuncPtr2[gpointer, Ptr[GTypeClass], gboolean]): GTypeClassCacheFunc = o
  extension (v: GTypeClassCacheFunc)
    inline def value: CFuncPtr2[gpointer, Ptr[GTypeClass], gboolean] = v

opaque type GTypeClass_autoptr = Ptr[GTypeClass]
object GTypeClass_autoptr: 
  given _tag: Tag[GTypeClass_autoptr] = Tag.Ptr[GTypeClass](GTypeClass._tag)
  inline def apply(inline o: Ptr[GTypeClass]): GTypeClass_autoptr = o
  extension (v: GTypeClass_autoptr)
    inline def value: Ptr[GTypeClass] = v

opaque type GTypeClass_listautoptr = Ptr[GList]
object GTypeClass_listautoptr: 
  given _tag: Tag[GTypeClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GTypeClass_listautoptr = o
  extension (v: GTypeClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GTypeClass_queueautoptr = Ptr[GQueue]
object GTypeClass_queueautoptr: 
  given _tag: Tag[GTypeClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GTypeClass_queueautoptr = o
  extension (v: GTypeClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GTypeClass_slistautoptr = Ptr[GSList]
object GTypeClass_slistautoptr: 
  given _tag: Tag[GTypeClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GTypeClass_slistautoptr = o
  extension (v: GTypeClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GTypeInterfaceCheckFunc = CFuncPtr2[gpointer, gpointer, Unit]
object GTypeInterfaceCheckFunc: 
  given _tag: Tag[GTypeInterfaceCheckFunc] = Tag.materializeCFuncPtr2[gpointer, gpointer, Unit]
  inline def apply(inline o: CFuncPtr2[gpointer, gpointer, Unit]): GTypeInterfaceCheckFunc = o
  extension (v: GTypeInterfaceCheckFunc)
    inline def value: CFuncPtr2[gpointer, gpointer, Unit] = v

opaque type GTypeModule_autoptr = Ptr[GTypeModule]
object GTypeModule_autoptr: 
  given _tag: Tag[GTypeModule_autoptr] = Tag.Ptr[GTypeModule](GTypeModule._tag)
  inline def apply(inline o: Ptr[GTypeModule]): GTypeModule_autoptr = o
  extension (v: GTypeModule_autoptr)
    inline def value: Ptr[GTypeModule] = v

opaque type GTypeModule_listautoptr = Ptr[GList]
object GTypeModule_listautoptr: 
  given _tag: Tag[GTypeModule_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GTypeModule_listautoptr = o
  extension (v: GTypeModule_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GTypeModule_queueautoptr = Ptr[GQueue]
object GTypeModule_queueautoptr: 
  given _tag: Tag[GTypeModule_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GTypeModule_queueautoptr = o
  extension (v: GTypeModule_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GTypeModule_slistautoptr = Ptr[GSList]
object GTypeModule_slistautoptr: 
  given _tag: Tag[GTypeModule_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GTypeModule_slistautoptr = o
  extension (v: GTypeModule_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GTypePluginCompleteInterfaceInfo = CFuncPtr4[Ptr[GTypePlugin], GType, GType, Ptr[GInterfaceInfo], Unit]
object GTypePluginCompleteInterfaceInfo: 
  given _tag: Tag[GTypePluginCompleteInterfaceInfo] = Tag.materializeCFuncPtr4[Ptr[GTypePlugin], GType, GType, Ptr[GInterfaceInfo], Unit]
  inline def apply(inline o: CFuncPtr4[Ptr[GTypePlugin], GType, GType, Ptr[GInterfaceInfo], Unit]): GTypePluginCompleteInterfaceInfo = o
  extension (v: GTypePluginCompleteInterfaceInfo)
    inline def value: CFuncPtr4[Ptr[GTypePlugin], GType, GType, Ptr[GInterfaceInfo], Unit] = v

opaque type GTypePluginCompleteTypeInfo = CFuncPtr4[Ptr[GTypePlugin], GType, Ptr[GTypeInfo], Ptr[GTypeValueTable], Unit]
object GTypePluginCompleteTypeInfo: 
  given _tag: Tag[GTypePluginCompleteTypeInfo] = Tag.materializeCFuncPtr4[Ptr[GTypePlugin], GType, Ptr[GTypeInfo], Ptr[GTypeValueTable], Unit]
  inline def apply(inline o: CFuncPtr4[Ptr[GTypePlugin], GType, Ptr[GTypeInfo], Ptr[GTypeValueTable], Unit]): GTypePluginCompleteTypeInfo = o
  extension (v: GTypePluginCompleteTypeInfo)
    inline def value: CFuncPtr4[Ptr[GTypePlugin], GType, Ptr[GTypeInfo], Ptr[GTypeValueTable], Unit] = v

opaque type GTypePluginUnuse = CFuncPtr1[Ptr[GTypePlugin], Unit]
object GTypePluginUnuse: 
  given _tag: Tag[GTypePluginUnuse] = Tag.materializeCFuncPtr1[Ptr[GTypePlugin], Unit]
  inline def apply(inline o: CFuncPtr1[Ptr[GTypePlugin], Unit]): GTypePluginUnuse = o
  extension (v: GTypePluginUnuse)
    inline def value: CFuncPtr1[Ptr[GTypePlugin], Unit] = v

opaque type GTypePluginUse = CFuncPtr1[Ptr[GTypePlugin], Unit]
object GTypePluginUse: 
  given _tag: Tag[GTypePluginUse] = Tag.materializeCFuncPtr1[Ptr[GTypePlugin], Unit]
  inline def apply(inline o: CFuncPtr1[Ptr[GTypePlugin], Unit]): GTypePluginUse = o
  extension (v: GTypePluginUse)
    inline def value: CFuncPtr1[Ptr[GTypePlugin], Unit] = v

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

opaque type GVaClosureMarshal = CFuncPtr7[Ptr[GClosure], Ptr[GValue], gpointer, va_list, gpointer, CInt, Ptr[GType], Unit]
object GVaClosureMarshal: 
  given _tag: Tag[GVaClosureMarshal] = Tag.materializeCFuncPtr7[Ptr[GClosure], Ptr[GValue], gpointer, va_list, gpointer, CInt, Ptr[GType], Unit]
  inline def apply(inline o: CFuncPtr7[Ptr[GClosure], Ptr[GValue], gpointer, va_list, gpointer, CInt, Ptr[GType], Unit]): GVaClosureMarshal = o
  extension (v: GVaClosureMarshal)
    inline def value: CFuncPtr7[Ptr[GClosure], Ptr[GValue], gpointer, va_list, gpointer, CInt, Ptr[GType], Unit] = v

opaque type GValueTransform = CFuncPtr2[Ptr[GValue], Ptr[GValue], Unit]
object GValueTransform: 
  given _tag: Tag[GValueTransform] = Tag.materializeCFuncPtr2[Ptr[GValue], Ptr[GValue], Unit]
  inline def apply(inline o: CFuncPtr2[Ptr[GValue], Ptr[GValue], Unit]): GValueTransform = o
  extension (v: GValueTransform)
    inline def value: CFuncPtr2[Ptr[GValue], Ptr[GValue], Unit] = v

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

opaque type GVfsFileLookupFunc = CFuncPtr3[Ptr[GVfs], CString, gpointer, Ptr[GFile]]
object GVfsFileLookupFunc: 
  given _tag: Tag[GVfsFileLookupFunc] = Tag.materializeCFuncPtr3[Ptr[GVfs], CString, gpointer, Ptr[GFile]]
  inline def apply(inline o: CFuncPtr3[Ptr[GVfs], CString, gpointer, Ptr[GFile]]): GVfsFileLookupFunc = o
  extension (v: GVfsFileLookupFunc)
    inline def value: CFuncPtr3[Ptr[GVfs], CString, gpointer, Ptr[GFile]] = v

opaque type GVfs_autoptr = Ptr[GVfs]
object GVfs_autoptr: 
  given _tag: Tag[GVfs_autoptr] = Tag.Ptr[GVfs](GVfs._tag)
  inline def apply(inline o: Ptr[GVfs]): GVfs_autoptr = o
  extension (v: GVfs_autoptr)
    inline def value: Ptr[GVfs] = v

opaque type GVfs_listautoptr = Ptr[GList]
object GVfs_listautoptr: 
  given _tag: Tag[GVfs_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GVfs_listautoptr = o
  extension (v: GVfs_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GVfs_queueautoptr = Ptr[GQueue]
object GVfs_queueautoptr: 
  given _tag: Tag[GVfs_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GVfs_queueautoptr = o
  extension (v: GVfs_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GVfs_slistautoptr = Ptr[GSList]
object GVfs_slistautoptr: 
  given _tag: Tag[GVfs_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GVfs_slistautoptr = o
  extension (v: GVfs_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GVoidFunc = CFuncPtr0[Unit]
object GVoidFunc: 
  given _tag: Tag[GVoidFunc] = Tag.materializeCFuncPtr0[Unit]
  inline def apply(inline o: CFuncPtr0[Unit]): GVoidFunc = o
  extension (v: GVoidFunc)
    inline def value: CFuncPtr0[Unit] = v

opaque type GVolumeMonitor_autoptr = Ptr[GVolumeMonitor]
object GVolumeMonitor_autoptr: 
  given _tag: Tag[GVolumeMonitor_autoptr] = Tag.Ptr[GVolumeMonitor](GVolumeMonitor._tag)
  inline def apply(inline o: Ptr[GVolumeMonitor]): GVolumeMonitor_autoptr = o
  extension (v: GVolumeMonitor_autoptr)
    inline def value: Ptr[GVolumeMonitor] = v

opaque type GVolumeMonitor_listautoptr = Ptr[GList]
object GVolumeMonitor_listautoptr: 
  given _tag: Tag[GVolumeMonitor_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GVolumeMonitor_listautoptr = o
  extension (v: GVolumeMonitor_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GVolumeMonitor_queueautoptr = Ptr[GQueue]
object GVolumeMonitor_queueautoptr: 
  given _tag: Tag[GVolumeMonitor_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GVolumeMonitor_queueautoptr = o
  extension (v: GVolumeMonitor_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GVolumeMonitor_slistautoptr = Ptr[GSList]
object GVolumeMonitor_slistautoptr: 
  given _tag: Tag[GVolumeMonitor_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GVolumeMonitor_slistautoptr = o
  extension (v: GVolumeMonitor_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GVolume_autoptr = Ptr[GVolume]
object GVolume_autoptr: 
  given _tag: Tag[GVolume_autoptr] = Tag.Ptr[GVolume](GVolume._tag)
  inline def apply(inline o: Ptr[GVolume]): GVolume_autoptr = o
  extension (v: GVolume_autoptr)
    inline def value: Ptr[GVolume] = v

opaque type GVolume_listautoptr = Ptr[GList]
object GVolume_listautoptr: 
  given _tag: Tag[GVolume_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GVolume_listautoptr = o
  extension (v: GVolume_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GVolume_queueautoptr = Ptr[GQueue]
object GVolume_queueautoptr: 
  given _tag: Tag[GVolume_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GVolume_queueautoptr = o
  extension (v: GVolume_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GVolume_slistautoptr = Ptr[GSList]
object GVolume_slistautoptr: 
  given _tag: Tag[GVolume_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GVolume_slistautoptr = o
  extension (v: GVolume_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GWeakNotify = CFuncPtr2[gpointer, Ptr[GObject], Unit]
object GWeakNotify: 
  given _tag: Tag[GWeakNotify] = Tag.materializeCFuncPtr2[gpointer, Ptr[GObject], Unit]
  inline def apply(inline o: CFuncPtr2[gpointer, Ptr[GObject], Unit]): GWeakNotify = o
  extension (v: GWeakNotify)
    inline def value: CFuncPtr2[gpointer, Ptr[GObject], Unit] = v

opaque type GZlibCompressor_autoptr = Ptr[GZlibCompressor]
object GZlibCompressor_autoptr: 
  given _tag: Tag[GZlibCompressor_autoptr] = Tag.Ptr[GZlibCompressor](GZlibCompressor._tag)
  inline def apply(inline o: Ptr[GZlibCompressor]): GZlibCompressor_autoptr = o
  extension (v: GZlibCompressor_autoptr)
    inline def value: Ptr[GZlibCompressor] = v

opaque type GZlibCompressor_listautoptr = Ptr[GList]
object GZlibCompressor_listautoptr: 
  given _tag: Tag[GZlibCompressor_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GZlibCompressor_listautoptr = o
  extension (v: GZlibCompressor_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GZlibCompressor_queueautoptr = Ptr[GQueue]
object GZlibCompressor_queueautoptr: 
  given _tag: Tag[GZlibCompressor_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GZlibCompressor_queueautoptr = o
  extension (v: GZlibCompressor_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GZlibCompressor_slistautoptr = Ptr[GSList]
object GZlibCompressor_slistautoptr: 
  given _tag: Tag[GZlibCompressor_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GZlibCompressor_slistautoptr = o
  extension (v: GZlibCompressor_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GZlibDecompressor_autoptr = Ptr[GZlibDecompressor]
object GZlibDecompressor_autoptr: 
  given _tag: Tag[GZlibDecompressor_autoptr] = Tag.Ptr[GZlibDecompressor](GZlibDecompressor._tag)
  inline def apply(inline o: Ptr[GZlibDecompressor]): GZlibDecompressor_autoptr = o
  extension (v: GZlibDecompressor_autoptr)
    inline def value: Ptr[GZlibDecompressor] = v

opaque type GZlibDecompressor_listautoptr = Ptr[GList]
object GZlibDecompressor_listautoptr: 
  given _tag: Tag[GZlibDecompressor_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GZlibDecompressor_listautoptr = o
  extension (v: GZlibDecompressor_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GZlibDecompressor_queueautoptr = Ptr[GQueue]
object GZlibDecompressor_queueautoptr: 
  given _tag: Tag[GZlibDecompressor_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GZlibDecompressor_queueautoptr = o
  extension (v: GZlibDecompressor_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GZlibDecompressor_slistautoptr = Ptr[GSList]
object GZlibDecompressor_slistautoptr: 
  given _tag: Tag[GZlibDecompressor_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GZlibDecompressor_slistautoptr = o
  extension (v: GZlibDecompressor_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkAppLaunchContext_autoptr = Ptr[GdkAppLaunchContext]
object GdkAppLaunchContext_autoptr: 
  given _tag: Tag[GdkAppLaunchContext_autoptr] = Tag.Ptr[GdkAppLaunchContext](GdkAppLaunchContext._tag)
  inline def apply(inline o: Ptr[GdkAppLaunchContext]): GdkAppLaunchContext_autoptr = o
  extension (v: GdkAppLaunchContext_autoptr)
    inline def value: Ptr[GdkAppLaunchContext] = v

opaque type GdkAppLaunchContext_listautoptr = Ptr[GList]
object GdkAppLaunchContext_listautoptr: 
  given _tag: Tag[GdkAppLaunchContext_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkAppLaunchContext_listautoptr = o
  extension (v: GdkAppLaunchContext_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkAppLaunchContext_queueautoptr = Ptr[GQueue]
object GdkAppLaunchContext_queueautoptr: 
  given _tag: Tag[GdkAppLaunchContext_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkAppLaunchContext_queueautoptr = o
  extension (v: GdkAppLaunchContext_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkAppLaunchContext_slistautoptr = Ptr[GSList]
object GdkAppLaunchContext_slistautoptr: 
  given _tag: Tag[GdkAppLaunchContext_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkAppLaunchContext_slistautoptr = o
  extension (v: GdkAppLaunchContext_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkClipboard_autoptr = Ptr[GdkClipboard]
object GdkClipboard_autoptr: 
  given _tag: Tag[GdkClipboard_autoptr] = Tag.Ptr[GdkClipboard](GdkClipboard._tag)
  inline def apply(inline o: Ptr[GdkClipboard]): GdkClipboard_autoptr = o
  extension (v: GdkClipboard_autoptr)
    inline def value: Ptr[GdkClipboard] = v

opaque type GdkClipboard_listautoptr = Ptr[GList]
object GdkClipboard_listautoptr: 
  given _tag: Tag[GdkClipboard_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkClipboard_listautoptr = o
  extension (v: GdkClipboard_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkClipboard_queueautoptr = Ptr[GQueue]
object GdkClipboard_queueautoptr: 
  given _tag: Tag[GdkClipboard_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkClipboard_queueautoptr = o
  extension (v: GdkClipboard_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkClipboard_slistautoptr = Ptr[GSList]
object GdkClipboard_slistautoptr: 
  given _tag: Tag[GdkClipboard_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkClipboard_slistautoptr = o
  extension (v: GdkClipboard_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkContentDeserializeFunc = CFuncPtr1[Ptr[GdkContentDeserializer], Unit]
object GdkContentDeserializeFunc: 
  given _tag: Tag[GdkContentDeserializeFunc] = Tag.materializeCFuncPtr1[Ptr[GdkContentDeserializer], Unit]
  inline def apply(inline o: CFuncPtr1[Ptr[GdkContentDeserializer], Unit]): GdkContentDeserializeFunc = o
  extension (v: GdkContentDeserializeFunc)
    inline def value: CFuncPtr1[Ptr[GdkContentDeserializer], Unit] = v

opaque type GdkContentFormats_autoptr = Ptr[GdkContentFormats]
object GdkContentFormats_autoptr: 
  given _tag: Tag[GdkContentFormats_autoptr] = Tag.Ptr[GdkContentFormats](GdkContentFormats._tag)
  inline def apply(inline o: Ptr[GdkContentFormats]): GdkContentFormats_autoptr = o
  extension (v: GdkContentFormats_autoptr)
    inline def value: Ptr[GdkContentFormats] = v

opaque type GdkContentFormats_listautoptr = Ptr[GList]
object GdkContentFormats_listautoptr: 
  given _tag: Tag[GdkContentFormats_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkContentFormats_listautoptr = o
  extension (v: GdkContentFormats_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkContentFormats_queueautoptr = Ptr[GQueue]
object GdkContentFormats_queueautoptr: 
  given _tag: Tag[GdkContentFormats_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkContentFormats_queueautoptr = o
  extension (v: GdkContentFormats_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkContentFormats_slistautoptr = Ptr[GSList]
object GdkContentFormats_slistautoptr: 
  given _tag: Tag[GdkContentFormats_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkContentFormats_slistautoptr = o
  extension (v: GdkContentFormats_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkContentProvider_autoptr = Ptr[GdkContentProvider]
object GdkContentProvider_autoptr: 
  given _tag: Tag[GdkContentProvider_autoptr] = Tag.Ptr[GdkContentProvider](GdkContentProvider._tag)
  inline def apply(inline o: Ptr[GdkContentProvider]): GdkContentProvider_autoptr = o
  extension (v: GdkContentProvider_autoptr)
    inline def value: Ptr[GdkContentProvider] = v

opaque type GdkContentProvider_listautoptr = Ptr[GList]
object GdkContentProvider_listautoptr: 
  given _tag: Tag[GdkContentProvider_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkContentProvider_listautoptr = o
  extension (v: GdkContentProvider_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkContentProvider_queueautoptr = Ptr[GQueue]
object GdkContentProvider_queueautoptr: 
  given _tag: Tag[GdkContentProvider_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkContentProvider_queueautoptr = o
  extension (v: GdkContentProvider_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkContentProvider_slistautoptr = Ptr[GSList]
object GdkContentProvider_slistautoptr: 
  given _tag: Tag[GdkContentProvider_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkContentProvider_slistautoptr = o
  extension (v: GdkContentProvider_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkContentSerializeFunc = CFuncPtr1[Ptr[GdkContentSerializer], Unit]
object GdkContentSerializeFunc: 
  given _tag: Tag[GdkContentSerializeFunc] = Tag.materializeCFuncPtr1[Ptr[GdkContentSerializer], Unit]
  inline def apply(inline o: CFuncPtr1[Ptr[GdkContentSerializer], Unit]): GdkContentSerializeFunc = o
  extension (v: GdkContentSerializeFunc)
    inline def value: CFuncPtr1[Ptr[GdkContentSerializer], Unit] = v

opaque type GdkCursor_autoptr = Ptr[GdkCursor]
object GdkCursor_autoptr: 
  given _tag: Tag[GdkCursor_autoptr] = Tag.Ptr[GdkCursor](GdkCursor._tag)
  inline def apply(inline o: Ptr[GdkCursor]): GdkCursor_autoptr = o
  extension (v: GdkCursor_autoptr)
    inline def value: Ptr[GdkCursor] = v

opaque type GdkCursor_listautoptr = Ptr[GList]
object GdkCursor_listautoptr: 
  given _tag: Tag[GdkCursor_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkCursor_listautoptr = o
  extension (v: GdkCursor_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkCursor_queueautoptr = Ptr[GQueue]
object GdkCursor_queueautoptr: 
  given _tag: Tag[GdkCursor_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkCursor_queueautoptr = o
  extension (v: GdkCursor_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkCursor_slistautoptr = Ptr[GSList]
object GdkCursor_slistautoptr: 
  given _tag: Tag[GdkCursor_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkCursor_slistautoptr = o
  extension (v: GdkCursor_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkDevice_autoptr = Ptr[GdkDevice]
object GdkDevice_autoptr: 
  given _tag: Tag[GdkDevice_autoptr] = Tag.Ptr[GdkDevice](GdkDevice._tag)
  inline def apply(inline o: Ptr[GdkDevice]): GdkDevice_autoptr = o
  extension (v: GdkDevice_autoptr)
    inline def value: Ptr[GdkDevice] = v

opaque type GdkDevice_listautoptr = Ptr[GList]
object GdkDevice_listautoptr: 
  given _tag: Tag[GdkDevice_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkDevice_listautoptr = o
  extension (v: GdkDevice_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkDevice_queueautoptr = Ptr[GQueue]
object GdkDevice_queueautoptr: 
  given _tag: Tag[GdkDevice_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkDevice_queueautoptr = o
  extension (v: GdkDevice_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkDevice_slistautoptr = Ptr[GSList]
object GdkDevice_slistautoptr: 
  given _tag: Tag[GdkDevice_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkDevice_slistautoptr = o
  extension (v: GdkDevice_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkDisplayManager_autoptr = Ptr[GdkDisplayManager]
object GdkDisplayManager_autoptr: 
  given _tag: Tag[GdkDisplayManager_autoptr] = Tag.Ptr[GdkDisplayManager](GdkDisplayManager._tag)
  inline def apply(inline o: Ptr[GdkDisplayManager]): GdkDisplayManager_autoptr = o
  extension (v: GdkDisplayManager_autoptr)
    inline def value: Ptr[GdkDisplayManager] = v

opaque type GdkDisplayManager_listautoptr = Ptr[GList]
object GdkDisplayManager_listautoptr: 
  given _tag: Tag[GdkDisplayManager_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkDisplayManager_listautoptr = o
  extension (v: GdkDisplayManager_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkDisplayManager_queueautoptr = Ptr[GQueue]
object GdkDisplayManager_queueautoptr: 
  given _tag: Tag[GdkDisplayManager_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkDisplayManager_queueautoptr = o
  extension (v: GdkDisplayManager_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkDisplayManager_slistautoptr = Ptr[GSList]
object GdkDisplayManager_slistautoptr: 
  given _tag: Tag[GdkDisplayManager_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkDisplayManager_slistautoptr = o
  extension (v: GdkDisplayManager_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkDisplay_autoptr = Ptr[GdkDisplay]
object GdkDisplay_autoptr: 
  given _tag: Tag[GdkDisplay_autoptr] = Tag.Ptr[GdkDisplay](GdkDisplay._tag)
  inline def apply(inline o: Ptr[GdkDisplay]): GdkDisplay_autoptr = o
  extension (v: GdkDisplay_autoptr)
    inline def value: Ptr[GdkDisplay] = v

opaque type GdkDisplay_listautoptr = Ptr[GList]
object GdkDisplay_listautoptr: 
  given _tag: Tag[GdkDisplay_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkDisplay_listautoptr = o
  extension (v: GdkDisplay_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkDisplay_queueautoptr = Ptr[GQueue]
object GdkDisplay_queueautoptr: 
  given _tag: Tag[GdkDisplay_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkDisplay_queueautoptr = o
  extension (v: GdkDisplay_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkDisplay_slistautoptr = Ptr[GSList]
object GdkDisplay_slistautoptr: 
  given _tag: Tag[GdkDisplay_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkDisplay_slistautoptr = o
  extension (v: GdkDisplay_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkDragSurface_autoptr = Ptr[GdkDragSurface]
object GdkDragSurface_autoptr: 
  given _tag: Tag[GdkDragSurface_autoptr] = Tag.Ptr[GdkDragSurface](GdkDragSurface._tag)
  inline def apply(inline o: Ptr[GdkDragSurface]): GdkDragSurface_autoptr = o
  extension (v: GdkDragSurface_autoptr)
    inline def value: Ptr[GdkDragSurface] = v

opaque type GdkDragSurface_listautoptr = Ptr[GList]
object GdkDragSurface_listautoptr: 
  given _tag: Tag[GdkDragSurface_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkDragSurface_listautoptr = o
  extension (v: GdkDragSurface_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkDragSurface_queueautoptr = Ptr[GQueue]
object GdkDragSurface_queueautoptr: 
  given _tag: Tag[GdkDragSurface_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkDragSurface_queueautoptr = o
  extension (v: GdkDragSurface_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkDragSurface_slistautoptr = Ptr[GSList]
object GdkDragSurface_slistautoptr: 
  given _tag: Tag[GdkDragSurface_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkDragSurface_slistautoptr = o
  extension (v: GdkDragSurface_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkDrag_autoptr = Ptr[GdkDrag]
object GdkDrag_autoptr: 
  given _tag: Tag[GdkDrag_autoptr] = Tag.Ptr[GdkDrag](GdkDrag._tag)
  inline def apply(inline o: Ptr[GdkDrag]): GdkDrag_autoptr = o
  extension (v: GdkDrag_autoptr)
    inline def value: Ptr[GdkDrag] = v

opaque type GdkDrag_listautoptr = Ptr[GList]
object GdkDrag_listautoptr: 
  given _tag: Tag[GdkDrag_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkDrag_listautoptr = o
  extension (v: GdkDrag_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkDrag_queueautoptr = Ptr[GQueue]
object GdkDrag_queueautoptr: 
  given _tag: Tag[GdkDrag_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkDrag_queueautoptr = o
  extension (v: GdkDrag_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkDrag_slistautoptr = Ptr[GSList]
object GdkDrag_slistautoptr: 
  given _tag: Tag[GdkDrag_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkDrag_slistautoptr = o
  extension (v: GdkDrag_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkDrawContext_autoptr = Ptr[GdkDrawContext]
object GdkDrawContext_autoptr: 
  given _tag: Tag[GdkDrawContext_autoptr] = Tag.Ptr[GdkDrawContext](GdkDrawContext._tag)
  inline def apply(inline o: Ptr[GdkDrawContext]): GdkDrawContext_autoptr = o
  extension (v: GdkDrawContext_autoptr)
    inline def value: Ptr[GdkDrawContext] = v

opaque type GdkDrawContext_listautoptr = Ptr[GList]
object GdkDrawContext_listautoptr: 
  given _tag: Tag[GdkDrawContext_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkDrawContext_listautoptr = o
  extension (v: GdkDrawContext_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkDrawContext_queueautoptr = Ptr[GQueue]
object GdkDrawContext_queueautoptr: 
  given _tag: Tag[GdkDrawContext_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkDrawContext_queueautoptr = o
  extension (v: GdkDrawContext_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkDrawContext_slistautoptr = Ptr[GSList]
object GdkDrawContext_slistautoptr: 
  given _tag: Tag[GdkDrawContext_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkDrawContext_slistautoptr = o
  extension (v: GdkDrawContext_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkDrop_autoptr = Ptr[GdkDrop]
object GdkDrop_autoptr: 
  given _tag: Tag[GdkDrop_autoptr] = Tag.Ptr[GdkDrop](GdkDrop._tag)
  inline def apply(inline o: Ptr[GdkDrop]): GdkDrop_autoptr = o
  extension (v: GdkDrop_autoptr)
    inline def value: Ptr[GdkDrop] = v

opaque type GdkDrop_listautoptr = Ptr[GList]
object GdkDrop_listautoptr: 
  given _tag: Tag[GdkDrop_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkDrop_listautoptr = o
  extension (v: GdkDrop_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkDrop_queueautoptr = Ptr[GQueue]
object GdkDrop_queueautoptr: 
  given _tag: Tag[GdkDrop_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkDrop_queueautoptr = o
  extension (v: GdkDrop_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkDrop_slistautoptr = Ptr[GSList]
object GdkDrop_slistautoptr: 
  given _tag: Tag[GdkDrop_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkDrop_slistautoptr = o
  extension (v: GdkDrop_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkEvent_autoptr = Ptr[GdkEvent]
object GdkEvent_autoptr: 
  given _tag: Tag[GdkEvent_autoptr] = Tag.Ptr[GdkEvent](GdkEvent._tag)
  inline def apply(inline o: Ptr[GdkEvent]): GdkEvent_autoptr = o
  extension (v: GdkEvent_autoptr)
    inline def value: Ptr[GdkEvent] = v

opaque type GdkEvent_listautoptr = Ptr[GList]
object GdkEvent_listautoptr: 
  given _tag: Tag[GdkEvent_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkEvent_listautoptr = o
  extension (v: GdkEvent_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkEvent_queueautoptr = Ptr[GQueue]
object GdkEvent_queueautoptr: 
  given _tag: Tag[GdkEvent_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkEvent_queueautoptr = o
  extension (v: GdkEvent_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkEvent_slistautoptr = Ptr[GSList]
object GdkEvent_slistautoptr: 
  given _tag: Tag[GdkEvent_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkEvent_slistautoptr = o
  extension (v: GdkEvent_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkFrameClock_autoptr = Ptr[GdkFrameClock]
object GdkFrameClock_autoptr: 
  given _tag: Tag[GdkFrameClock_autoptr] = Tag.Ptr[GdkFrameClock](GdkFrameClock._tag)
  inline def apply(inline o: Ptr[GdkFrameClock]): GdkFrameClock_autoptr = o
  extension (v: GdkFrameClock_autoptr)
    inline def value: Ptr[GdkFrameClock] = v

opaque type GdkFrameClock_listautoptr = Ptr[GList]
object GdkFrameClock_listautoptr: 
  given _tag: Tag[GdkFrameClock_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkFrameClock_listautoptr = o
  extension (v: GdkFrameClock_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkFrameClock_queueautoptr = Ptr[GQueue]
object GdkFrameClock_queueautoptr: 
  given _tag: Tag[GdkFrameClock_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkFrameClock_queueautoptr = o
  extension (v: GdkFrameClock_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkFrameClock_slistautoptr = Ptr[GSList]
object GdkFrameClock_slistautoptr: 
  given _tag: Tag[GdkFrameClock_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkFrameClock_slistautoptr = o
  extension (v: GdkFrameClock_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkFrameTimings_autoptr = Ptr[GdkFrameTimings]
object GdkFrameTimings_autoptr: 
  given _tag: Tag[GdkFrameTimings_autoptr] = Tag.Ptr[GdkFrameTimings](GdkFrameTimings._tag)
  inline def apply(inline o: Ptr[GdkFrameTimings]): GdkFrameTimings_autoptr = o
  extension (v: GdkFrameTimings_autoptr)
    inline def value: Ptr[GdkFrameTimings] = v

opaque type GdkFrameTimings_listautoptr = Ptr[GList]
object GdkFrameTimings_listautoptr: 
  given _tag: Tag[GdkFrameTimings_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkFrameTimings_listautoptr = o
  extension (v: GdkFrameTimings_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkFrameTimings_queueautoptr = Ptr[GQueue]
object GdkFrameTimings_queueautoptr: 
  given _tag: Tag[GdkFrameTimings_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkFrameTimings_queueautoptr = o
  extension (v: GdkFrameTimings_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkFrameTimings_slistautoptr = Ptr[GSList]
object GdkFrameTimings_slistautoptr: 
  given _tag: Tag[GdkFrameTimings_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkFrameTimings_slistautoptr = o
  extension (v: GdkFrameTimings_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkGLContext_autoptr = Ptr[GdkGLContext]
object GdkGLContext_autoptr: 
  given _tag: Tag[GdkGLContext_autoptr] = Tag.Ptr[GdkGLContext](GdkGLContext._tag)
  inline def apply(inline o: Ptr[GdkGLContext]): GdkGLContext_autoptr = o
  extension (v: GdkGLContext_autoptr)
    inline def value: Ptr[GdkGLContext] = v

opaque type GdkGLContext_listautoptr = Ptr[GList]
object GdkGLContext_listautoptr: 
  given _tag: Tag[GdkGLContext_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkGLContext_listautoptr = o
  extension (v: GdkGLContext_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkGLContext_queueautoptr = Ptr[GQueue]
object GdkGLContext_queueautoptr: 
  given _tag: Tag[GdkGLContext_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkGLContext_queueautoptr = o
  extension (v: GdkGLContext_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkGLContext_slistautoptr = Ptr[GSList]
object GdkGLContext_slistautoptr: 
  given _tag: Tag[GdkGLContext_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkGLContext_slistautoptr = o
  extension (v: GdkGLContext_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkGLTexture_autoptr = Ptr[GdkGLTexture]
object GdkGLTexture_autoptr: 
  given _tag: Tag[GdkGLTexture_autoptr] = Tag.Ptr[GdkGLTexture](GdkGLTexture._tag)
  inline def apply(inline o: Ptr[GdkGLTexture]): GdkGLTexture_autoptr = o
  extension (v: GdkGLTexture_autoptr)
    inline def value: Ptr[GdkGLTexture] = v

opaque type GdkGLTexture_listautoptr = Ptr[GList]
object GdkGLTexture_listautoptr: 
  given _tag: Tag[GdkGLTexture_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkGLTexture_listautoptr = o
  extension (v: GdkGLTexture_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkGLTexture_queueautoptr = Ptr[GQueue]
object GdkGLTexture_queueautoptr: 
  given _tag: Tag[GdkGLTexture_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkGLTexture_queueautoptr = o
  extension (v: GdkGLTexture_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkGLTexture_slistautoptr = Ptr[GSList]
object GdkGLTexture_slistautoptr: 
  given _tag: Tag[GdkGLTexture_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkGLTexture_slistautoptr = o
  extension (v: GdkGLTexture_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkMemoryTexture_autoptr = Ptr[GdkMemoryTexture]
object GdkMemoryTexture_autoptr: 
  given _tag: Tag[GdkMemoryTexture_autoptr] = Tag.Ptr[GdkMemoryTexture](GdkMemoryTexture._tag)
  inline def apply(inline o: Ptr[GdkMemoryTexture]): GdkMemoryTexture_autoptr = o
  extension (v: GdkMemoryTexture_autoptr)
    inline def value: Ptr[GdkMemoryTexture] = v

opaque type GdkMemoryTexture_listautoptr = Ptr[GList]
object GdkMemoryTexture_listautoptr: 
  given _tag: Tag[GdkMemoryTexture_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkMemoryTexture_listautoptr = o
  extension (v: GdkMemoryTexture_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkMemoryTexture_queueautoptr = Ptr[GQueue]
object GdkMemoryTexture_queueautoptr: 
  given _tag: Tag[GdkMemoryTexture_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkMemoryTexture_queueautoptr = o
  extension (v: GdkMemoryTexture_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkMemoryTexture_slistautoptr = Ptr[GSList]
object GdkMemoryTexture_slistautoptr: 
  given _tag: Tag[GdkMemoryTexture_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkMemoryTexture_slistautoptr = o
  extension (v: GdkMemoryTexture_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkMonitor_autoptr = Ptr[GdkMonitor]
object GdkMonitor_autoptr: 
  given _tag: Tag[GdkMonitor_autoptr] = Tag.Ptr[GdkMonitor](GdkMonitor._tag)
  inline def apply(inline o: Ptr[GdkMonitor]): GdkMonitor_autoptr = o
  extension (v: GdkMonitor_autoptr)
    inline def value: Ptr[GdkMonitor] = v

opaque type GdkMonitor_listautoptr = Ptr[GList]
object GdkMonitor_listautoptr: 
  given _tag: Tag[GdkMonitor_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkMonitor_listautoptr = o
  extension (v: GdkMonitor_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkMonitor_queueautoptr = Ptr[GQueue]
object GdkMonitor_queueautoptr: 
  given _tag: Tag[GdkMonitor_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkMonitor_queueautoptr = o
  extension (v: GdkMonitor_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkMonitor_slistautoptr = Ptr[GSList]
object GdkMonitor_slistautoptr: 
  given _tag: Tag[GdkMonitor_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkMonitor_slistautoptr = o
  extension (v: GdkMonitor_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkPaintable_autoptr = Ptr[GdkPaintable]
object GdkPaintable_autoptr: 
  given _tag: Tag[GdkPaintable_autoptr] = Tag.Ptr[GdkPaintable](GdkPaintable._tag)
  inline def apply(inline o: Ptr[GdkPaintable]): GdkPaintable_autoptr = o
  extension (v: GdkPaintable_autoptr)
    inline def value: Ptr[GdkPaintable] = v

opaque type GdkPaintable_listautoptr = Ptr[GList]
object GdkPaintable_listautoptr: 
  given _tag: Tag[GdkPaintable_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkPaintable_listautoptr = o
  extension (v: GdkPaintable_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkPaintable_queueautoptr = Ptr[GQueue]
object GdkPaintable_queueautoptr: 
  given _tag: Tag[GdkPaintable_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkPaintable_queueautoptr = o
  extension (v: GdkPaintable_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkPaintable_slistautoptr = Ptr[GSList]
object GdkPaintable_slistautoptr: 
  given _tag: Tag[GdkPaintable_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkPaintable_slistautoptr = o
  extension (v: GdkPaintable_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkPixbufAnimationIter_autoptr = Ptr[GdkPixbufAnimationIter]
object GdkPixbufAnimationIter_autoptr: 
  given _tag: Tag[GdkPixbufAnimationIter_autoptr] = Tag.Ptr[GdkPixbufAnimationIter](GdkPixbufAnimationIter._tag)
  inline def apply(inline o: Ptr[GdkPixbufAnimationIter]): GdkPixbufAnimationIter_autoptr = o
  extension (v: GdkPixbufAnimationIter_autoptr)
    inline def value: Ptr[GdkPixbufAnimationIter] = v

opaque type GdkPixbufAnimationIter_listautoptr = Ptr[GList]
object GdkPixbufAnimationIter_listautoptr: 
  given _tag: Tag[GdkPixbufAnimationIter_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkPixbufAnimationIter_listautoptr = o
  extension (v: GdkPixbufAnimationIter_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkPixbufAnimationIter_queueautoptr = Ptr[GQueue]
object GdkPixbufAnimationIter_queueautoptr: 
  given _tag: Tag[GdkPixbufAnimationIter_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkPixbufAnimationIter_queueautoptr = o
  extension (v: GdkPixbufAnimationIter_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkPixbufAnimationIter_slistautoptr = Ptr[GSList]
object GdkPixbufAnimationIter_slistautoptr: 
  given _tag: Tag[GdkPixbufAnimationIter_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkPixbufAnimationIter_slistautoptr = o
  extension (v: GdkPixbufAnimationIter_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkPixbufAnimation_autoptr = Ptr[GdkPixbufAnimation]
object GdkPixbufAnimation_autoptr: 
  given _tag: Tag[GdkPixbufAnimation_autoptr] = Tag.Ptr[GdkPixbufAnimation](GdkPixbufAnimation._tag)
  inline def apply(inline o: Ptr[GdkPixbufAnimation]): GdkPixbufAnimation_autoptr = o
  extension (v: GdkPixbufAnimation_autoptr)
    inline def value: Ptr[GdkPixbufAnimation] = v

opaque type GdkPixbufAnimation_listautoptr = Ptr[GList]
object GdkPixbufAnimation_listautoptr: 
  given _tag: Tag[GdkPixbufAnimation_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkPixbufAnimation_listautoptr = o
  extension (v: GdkPixbufAnimation_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkPixbufAnimation_queueautoptr = Ptr[GQueue]
object GdkPixbufAnimation_queueautoptr: 
  given _tag: Tag[GdkPixbufAnimation_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkPixbufAnimation_queueautoptr = o
  extension (v: GdkPixbufAnimation_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkPixbufAnimation_slistautoptr = Ptr[GSList]
object GdkPixbufAnimation_slistautoptr: 
  given _tag: Tag[GdkPixbufAnimation_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkPixbufAnimation_slistautoptr = o
  extension (v: GdkPixbufAnimation_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkPixbufDestroyNotify = CFuncPtr2[Ptr[guchar], gpointer, Unit]
object GdkPixbufDestroyNotify: 
  given _tag: Tag[GdkPixbufDestroyNotify] = Tag.materializeCFuncPtr2[Ptr[guchar], gpointer, Unit]
  inline def apply(inline o: CFuncPtr2[Ptr[guchar], gpointer, Unit]): GdkPixbufDestroyNotify = o
  extension (v: GdkPixbufDestroyNotify)
    inline def value: CFuncPtr2[Ptr[guchar], gpointer, Unit] = v

opaque type GdkPixbufLoader_autoptr = Ptr[GdkPixbufLoader]
object GdkPixbufLoader_autoptr: 
  given _tag: Tag[GdkPixbufLoader_autoptr] = Tag.Ptr[GdkPixbufLoader](GdkPixbufLoader._tag)
  inline def apply(inline o: Ptr[GdkPixbufLoader]): GdkPixbufLoader_autoptr = o
  extension (v: GdkPixbufLoader_autoptr)
    inline def value: Ptr[GdkPixbufLoader] = v

opaque type GdkPixbufLoader_listautoptr = Ptr[GList]
object GdkPixbufLoader_listautoptr: 
  given _tag: Tag[GdkPixbufLoader_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkPixbufLoader_listautoptr = o
  extension (v: GdkPixbufLoader_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkPixbufLoader_queueautoptr = Ptr[GQueue]
object GdkPixbufLoader_queueautoptr: 
  given _tag: Tag[GdkPixbufLoader_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkPixbufLoader_queueautoptr = o
  extension (v: GdkPixbufLoader_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkPixbufLoader_slistautoptr = Ptr[GSList]
object GdkPixbufLoader_slistautoptr: 
  given _tag: Tag[GdkPixbufLoader_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkPixbufLoader_slistautoptr = o
  extension (v: GdkPixbufLoader_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkPixbufSaveFunc = CFuncPtr4[Ptr[gchar], gsize, Ptr[Ptr[GError]], gpointer, gboolean]
object GdkPixbufSaveFunc: 
  given _tag: Tag[GdkPixbufSaveFunc] = Tag.materializeCFuncPtr4[Ptr[gchar], gsize, Ptr[Ptr[GError]], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr4[Ptr[gchar], gsize, Ptr[Ptr[GError]], gpointer, gboolean]): GdkPixbufSaveFunc = o
  extension (v: GdkPixbufSaveFunc)
    inline def value: CFuncPtr4[Ptr[gchar], gsize, Ptr[Ptr[GError]], gpointer, gboolean] = v

opaque type GdkPixbufSimpleAnim_autoptr = Ptr[GdkPixbufSimpleAnim]
object GdkPixbufSimpleAnim_autoptr: 
  given _tag: Tag[GdkPixbufSimpleAnim_autoptr] = Tag.Ptr[GdkPixbufSimpleAnim](GdkPixbufSimpleAnim._tag)
  inline def apply(inline o: Ptr[GdkPixbufSimpleAnim]): GdkPixbufSimpleAnim_autoptr = o
  extension (v: GdkPixbufSimpleAnim_autoptr)
    inline def value: Ptr[GdkPixbufSimpleAnim] = v

opaque type GdkPixbufSimpleAnim_listautoptr = Ptr[GList]
object GdkPixbufSimpleAnim_listautoptr: 
  given _tag: Tag[GdkPixbufSimpleAnim_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkPixbufSimpleAnim_listautoptr = o
  extension (v: GdkPixbufSimpleAnim_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkPixbufSimpleAnim_queueautoptr = Ptr[GQueue]
object GdkPixbufSimpleAnim_queueautoptr: 
  given _tag: Tag[GdkPixbufSimpleAnim_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkPixbufSimpleAnim_queueautoptr = o
  extension (v: GdkPixbufSimpleAnim_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkPixbufSimpleAnim_slistautoptr = Ptr[GSList]
object GdkPixbufSimpleAnim_slistautoptr: 
  given _tag: Tag[GdkPixbufSimpleAnim_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkPixbufSimpleAnim_slistautoptr = o
  extension (v: GdkPixbufSimpleAnim_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkPixbuf_autoptr = Ptr[GdkPixbuf]
object GdkPixbuf_autoptr: 
  given _tag: Tag[GdkPixbuf_autoptr] = Tag.Ptr[GdkPixbuf](GdkPixbuf._tag)
  inline def apply(inline o: Ptr[GdkPixbuf]): GdkPixbuf_autoptr = o
  extension (v: GdkPixbuf_autoptr)
    inline def value: Ptr[GdkPixbuf] = v

opaque type GdkPixbuf_listautoptr = Ptr[GList]
object GdkPixbuf_listautoptr: 
  given _tag: Tag[GdkPixbuf_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkPixbuf_listautoptr = o
  extension (v: GdkPixbuf_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkPixbuf_queueautoptr = Ptr[GQueue]
object GdkPixbuf_queueautoptr: 
  given _tag: Tag[GdkPixbuf_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkPixbuf_queueautoptr = o
  extension (v: GdkPixbuf_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkPixbuf_slistautoptr = Ptr[GSList]
object GdkPixbuf_slistautoptr: 
  given _tag: Tag[GdkPixbuf_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkPixbuf_slistautoptr = o
  extension (v: GdkPixbuf_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkPopupLayout_autoptr = Ptr[GdkPopupLayout]
object GdkPopupLayout_autoptr: 
  given _tag: Tag[GdkPopupLayout_autoptr] = Tag.Ptr[GdkPopupLayout](GdkPopupLayout._tag)
  inline def apply(inline o: Ptr[GdkPopupLayout]): GdkPopupLayout_autoptr = o
  extension (v: GdkPopupLayout_autoptr)
    inline def value: Ptr[GdkPopupLayout] = v

opaque type GdkPopupLayout_listautoptr = Ptr[GList]
object GdkPopupLayout_listautoptr: 
  given _tag: Tag[GdkPopupLayout_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkPopupLayout_listautoptr = o
  extension (v: GdkPopupLayout_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkPopupLayout_queueautoptr = Ptr[GQueue]
object GdkPopupLayout_queueautoptr: 
  given _tag: Tag[GdkPopupLayout_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkPopupLayout_queueautoptr = o
  extension (v: GdkPopupLayout_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkPopupLayout_slistautoptr = Ptr[GSList]
object GdkPopupLayout_slistautoptr: 
  given _tag: Tag[GdkPopupLayout_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkPopupLayout_slistautoptr = o
  extension (v: GdkPopupLayout_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkPopup_autoptr = Ptr[GdkPopup]
object GdkPopup_autoptr: 
  given _tag: Tag[GdkPopup_autoptr] = Tag.Ptr[GdkPopup](GdkPopup._tag)
  inline def apply(inline o: Ptr[GdkPopup]): GdkPopup_autoptr = o
  extension (v: GdkPopup_autoptr)
    inline def value: Ptr[GdkPopup] = v

opaque type GdkPopup_listautoptr = Ptr[GList]
object GdkPopup_listautoptr: 
  given _tag: Tag[GdkPopup_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkPopup_listautoptr = o
  extension (v: GdkPopup_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkPopup_queueautoptr = Ptr[GQueue]
object GdkPopup_queueautoptr: 
  given _tag: Tag[GdkPopup_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkPopup_queueautoptr = o
  extension (v: GdkPopup_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkPopup_slistautoptr = Ptr[GSList]
object GdkPopup_slistautoptr: 
  given _tag: Tag[GdkPopup_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkPopup_slistautoptr = o
  extension (v: GdkPopup_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkRGBA_autoptr = Ptr[GdkRGBA]
object GdkRGBA_autoptr: 
  given _tag: Tag[GdkRGBA_autoptr] = Tag.Ptr[GdkRGBA](GdkRGBA._tag)
  inline def apply(inline o: Ptr[GdkRGBA]): GdkRGBA_autoptr = o
  extension (v: GdkRGBA_autoptr)
    inline def value: Ptr[GdkRGBA] = v

opaque type GdkRGBA_listautoptr = Ptr[GList]
object GdkRGBA_listautoptr: 
  given _tag: Tag[GdkRGBA_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkRGBA_listautoptr = o
  extension (v: GdkRGBA_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkRGBA_queueautoptr = Ptr[GQueue]
object GdkRGBA_queueautoptr: 
  given _tag: Tag[GdkRGBA_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkRGBA_queueautoptr = o
  extension (v: GdkRGBA_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkRGBA_slistautoptr = Ptr[GSList]
object GdkRGBA_slistautoptr: 
  given _tag: Tag[GdkRGBA_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkRGBA_slistautoptr = o
  extension (v: GdkRGBA_slistautoptr)
    inline def value: Ptr[GSList] = v

type GdkRectangle = cairo_rectangle_int_t
object GdkRectangle: 
  given _tag: Tag[GdkRectangle] = cairo_rectangle_int_t._tag
  inline def apply(inline o: cairo_rectangle_int_t): GdkRectangle = o
  extension (v: GdkRectangle)
    inline def value: cairo_rectangle_int_t = v

opaque type GdkSeat_autoptr = Ptr[GdkSeat]
object GdkSeat_autoptr: 
  given _tag: Tag[GdkSeat_autoptr] = Tag.Ptr[GdkSeat](GdkSeat._tag)
  inline def apply(inline o: Ptr[GdkSeat]): GdkSeat_autoptr = o
  extension (v: GdkSeat_autoptr)
    inline def value: Ptr[GdkSeat] = v

opaque type GdkSeat_listautoptr = Ptr[GList]
object GdkSeat_listautoptr: 
  given _tag: Tag[GdkSeat_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkSeat_listautoptr = o
  extension (v: GdkSeat_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkSeat_queueautoptr = Ptr[GQueue]
object GdkSeat_queueautoptr: 
  given _tag: Tag[GdkSeat_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkSeat_queueautoptr = o
  extension (v: GdkSeat_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkSeat_slistautoptr = Ptr[GSList]
object GdkSeat_slistautoptr: 
  given _tag: Tag[GdkSeat_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkSeat_slistautoptr = o
  extension (v: GdkSeat_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkSnapshot_autoptr = Ptr[GdkSnapshot]
object GdkSnapshot_autoptr: 
  given _tag: Tag[GdkSnapshot_autoptr] = Tag.Ptr[GdkSnapshot](GdkSnapshot._tag)
  inline def apply(inline o: Ptr[GdkSnapshot]): GdkSnapshot_autoptr = o
  extension (v: GdkSnapshot_autoptr)
    inline def value: Ptr[GdkSnapshot] = v

opaque type GdkSnapshot_listautoptr = Ptr[GList]
object GdkSnapshot_listautoptr: 
  given _tag: Tag[GdkSnapshot_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkSnapshot_listautoptr = o
  extension (v: GdkSnapshot_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkSnapshot_queueautoptr = Ptr[GQueue]
object GdkSnapshot_queueautoptr: 
  given _tag: Tag[GdkSnapshot_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkSnapshot_queueautoptr = o
  extension (v: GdkSnapshot_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkSnapshot_slistautoptr = Ptr[GSList]
object GdkSnapshot_slistautoptr: 
  given _tag: Tag[GdkSnapshot_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkSnapshot_slistautoptr = o
  extension (v: GdkSnapshot_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkSurface_autoptr = Ptr[GdkSurface]
object GdkSurface_autoptr: 
  given _tag: Tag[GdkSurface_autoptr] = Tag.Ptr[GdkSurface](GdkSurface._tag)
  inline def apply(inline o: Ptr[GdkSurface]): GdkSurface_autoptr = o
  extension (v: GdkSurface_autoptr)
    inline def value: Ptr[GdkSurface] = v

opaque type GdkSurface_listautoptr = Ptr[GList]
object GdkSurface_listautoptr: 
  given _tag: Tag[GdkSurface_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkSurface_listautoptr = o
  extension (v: GdkSurface_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkSurface_queueautoptr = Ptr[GQueue]
object GdkSurface_queueautoptr: 
  given _tag: Tag[GdkSurface_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkSurface_queueautoptr = o
  extension (v: GdkSurface_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkSurface_slistautoptr = Ptr[GSList]
object GdkSurface_slistautoptr: 
  given _tag: Tag[GdkSurface_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkSurface_slistautoptr = o
  extension (v: GdkSurface_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkTexture_autoptr = Ptr[GdkTexture]
object GdkTexture_autoptr: 
  given _tag: Tag[GdkTexture_autoptr] = Tag.Ptr[GdkTexture](GdkTexture._tag)
  inline def apply(inline o: Ptr[GdkTexture]): GdkTexture_autoptr = o
  extension (v: GdkTexture_autoptr)
    inline def value: Ptr[GdkTexture] = v

opaque type GdkTexture_listautoptr = Ptr[GList]
object GdkTexture_listautoptr: 
  given _tag: Tag[GdkTexture_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkTexture_listautoptr = o
  extension (v: GdkTexture_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkTexture_queueautoptr = Ptr[GQueue]
object GdkTexture_queueautoptr: 
  given _tag: Tag[GdkTexture_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkTexture_queueautoptr = o
  extension (v: GdkTexture_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkTexture_slistautoptr = Ptr[GSList]
object GdkTexture_slistautoptr: 
  given _tag: Tag[GdkTexture_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkTexture_slistautoptr = o
  extension (v: GdkTexture_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkToplevel_autoptr = Ptr[GdkToplevel]
object GdkToplevel_autoptr: 
  given _tag: Tag[GdkToplevel_autoptr] = Tag.Ptr[GdkToplevel](GdkToplevel._tag)
  inline def apply(inline o: Ptr[GdkToplevel]): GdkToplevel_autoptr = o
  extension (v: GdkToplevel_autoptr)
    inline def value: Ptr[GdkToplevel] = v

opaque type GdkToplevel_listautoptr = Ptr[GList]
object GdkToplevel_listautoptr: 
  given _tag: Tag[GdkToplevel_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkToplevel_listautoptr = o
  extension (v: GdkToplevel_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkToplevel_queueautoptr = Ptr[GQueue]
object GdkToplevel_queueautoptr: 
  given _tag: Tag[GdkToplevel_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkToplevel_queueautoptr = o
  extension (v: GdkToplevel_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkToplevel_slistautoptr = Ptr[GSList]
object GdkToplevel_slistautoptr: 
  given _tag: Tag[GdkToplevel_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkToplevel_slistautoptr = o
  extension (v: GdkToplevel_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GdkVulkanContext_autoptr = Ptr[GdkVulkanContext]
object GdkVulkanContext_autoptr: 
  given _tag: Tag[GdkVulkanContext_autoptr] = Tag.Ptr[GdkVulkanContext](GdkVulkanContext._tag)
  inline def apply(inline o: Ptr[GdkVulkanContext]): GdkVulkanContext_autoptr = o
  extension (v: GdkVulkanContext_autoptr)
    inline def value: Ptr[GdkVulkanContext] = v

opaque type GdkVulkanContext_listautoptr = Ptr[GList]
object GdkVulkanContext_listautoptr: 
  given _tag: Tag[GdkVulkanContext_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GdkVulkanContext_listautoptr = o
  extension (v: GdkVulkanContext_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GdkVulkanContext_queueautoptr = Ptr[GQueue]
object GdkVulkanContext_queueautoptr: 
  given _tag: Tag[GdkVulkanContext_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GdkVulkanContext_queueautoptr = o
  extension (v: GdkVulkanContext_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GdkVulkanContext_slistautoptr = Ptr[GSList]
object GdkVulkanContext_slistautoptr: 
  given _tag: Tag[GdkVulkanContext_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GdkVulkanContext_slistautoptr = o
  extension (v: GdkVulkanContext_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GskGLShaderClass_autoptr = Ptr[GskGLShaderClass]
object GskGLShaderClass_autoptr: 
  given _tag: Tag[GskGLShaderClass_autoptr] = Tag.Ptr[GskGLShaderClass](GskGLShaderClass._tag)
  inline def apply(inline o: Ptr[GskGLShaderClass]): GskGLShaderClass_autoptr = o
  extension (v: GskGLShaderClass_autoptr)
    inline def value: Ptr[GskGLShaderClass] = v

opaque type GskGLShaderClass_listautoptr = Ptr[GList]
object GskGLShaderClass_listautoptr: 
  given _tag: Tag[GskGLShaderClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GskGLShaderClass_listautoptr = o
  extension (v: GskGLShaderClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GskGLShaderClass_queueautoptr = Ptr[GQueue]
object GskGLShaderClass_queueautoptr: 
  given _tag: Tag[GskGLShaderClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GskGLShaderClass_queueautoptr = o
  extension (v: GskGLShaderClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GskGLShaderClass_slistautoptr = Ptr[GSList]
object GskGLShaderClass_slistautoptr: 
  given _tag: Tag[GskGLShaderClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GskGLShaderClass_slistautoptr = o
  extension (v: GskGLShaderClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GskGLShader_autoptr = Ptr[GskGLShader]
object GskGLShader_autoptr: 
  given _tag: Tag[GskGLShader_autoptr] = Tag.Ptr[GskGLShader](GskGLShader._tag)
  inline def apply(inline o: Ptr[GskGLShader]): GskGLShader_autoptr = o
  extension (v: GskGLShader_autoptr)
    inline def value: Ptr[GskGLShader] = v

opaque type GskGLShader_listautoptr = Ptr[GList]
object GskGLShader_listautoptr: 
  given _tag: Tag[GskGLShader_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GskGLShader_listautoptr = o
  extension (v: GskGLShader_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GskGLShader_queueautoptr = Ptr[GQueue]
object GskGLShader_queueautoptr: 
  given _tag: Tag[GskGLShader_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GskGLShader_queueautoptr = o
  extension (v: GskGLShader_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GskGLShader_slistautoptr = Ptr[GSList]
object GskGLShader_slistautoptr: 
  given _tag: Tag[GskGLShader_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GskGLShader_slistautoptr = o
  extension (v: GskGLShader_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GskParseErrorFunc = CFuncPtr4[Ptr[GskParseLocation], Ptr[GskParseLocation], Ptr[GError], gpointer, Unit]
object GskParseErrorFunc: 
  given _tag: Tag[GskParseErrorFunc] = Tag.materializeCFuncPtr4[Ptr[GskParseLocation], Ptr[GskParseLocation], Ptr[GError], gpointer, Unit]
  inline def apply(inline o: CFuncPtr4[Ptr[GskParseLocation], Ptr[GskParseLocation], Ptr[GError], gpointer, Unit]): GskParseErrorFunc = o
  extension (v: GskParseErrorFunc)
    inline def value: CFuncPtr4[Ptr[GskParseLocation], Ptr[GskParseLocation], Ptr[GError], gpointer, Unit] = v

opaque type GskRenderNode_autoptr = Ptr[GskRenderNode]
object GskRenderNode_autoptr: 
  given _tag: Tag[GskRenderNode_autoptr] = Tag.Ptr[GskRenderNode](GskRenderNode._tag)
  inline def apply(inline o: Ptr[GskRenderNode]): GskRenderNode_autoptr = o
  extension (v: GskRenderNode_autoptr)
    inline def value: Ptr[GskRenderNode] = v

opaque type GskRenderNode_listautoptr = Ptr[GList]
object GskRenderNode_listautoptr: 
  given _tag: Tag[GskRenderNode_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GskRenderNode_listautoptr = o
  extension (v: GskRenderNode_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GskRenderNode_queueautoptr = Ptr[GQueue]
object GskRenderNode_queueautoptr: 
  given _tag: Tag[GskRenderNode_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GskRenderNode_queueautoptr = o
  extension (v: GskRenderNode_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GskRenderNode_slistautoptr = Ptr[GSList]
object GskRenderNode_slistautoptr: 
  given _tag: Tag[GskRenderNode_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GskRenderNode_slistautoptr = o
  extension (v: GskRenderNode_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GskRenderer_autoptr = Ptr[GskRenderer]
object GskRenderer_autoptr: 
  given _tag: Tag[GskRenderer_autoptr] = Tag.Ptr[GskRenderer](GskRenderer._tag)
  inline def apply(inline o: Ptr[GskRenderer]): GskRenderer_autoptr = o
  extension (v: GskRenderer_autoptr)
    inline def value: Ptr[GskRenderer] = v

opaque type GskRenderer_listautoptr = Ptr[GList]
object GskRenderer_listautoptr: 
  given _tag: Tag[GskRenderer_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GskRenderer_listautoptr = o
  extension (v: GskRenderer_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GskRenderer_queueautoptr = Ptr[GQueue]
object GskRenderer_queueautoptr: 
  given _tag: Tag[GskRenderer_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GskRenderer_queueautoptr = o
  extension (v: GskRenderer_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GskRenderer_slistautoptr = Ptr[GSList]
object GskRenderer_slistautoptr: 
  given _tag: Tag[GskRenderer_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GskRenderer_slistautoptr = o
  extension (v: GskRenderer_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GskTransform_autoptr = Ptr[GskTransform]
object GskTransform_autoptr: 
  given _tag: Tag[GskTransform_autoptr] = Tag.Ptr[GskTransform](GskTransform._tag)
  inline def apply(inline o: Ptr[GskTransform]): GskTransform_autoptr = o
  extension (v: GskTransform_autoptr)
    inline def value: Ptr[GskTransform] = v

opaque type GskTransform_listautoptr = Ptr[GList]
object GskTransform_listautoptr: 
  given _tag: Tag[GskTransform_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GskTransform_listautoptr = o
  extension (v: GskTransform_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GskTransform_queueautoptr = Ptr[GQueue]
object GskTransform_queueautoptr: 
  given _tag: Tag[GskTransform_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GskTransform_queueautoptr = o
  extension (v: GskTransform_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GskTransform_slistautoptr = Ptr[GSList]
object GskTransform_slistautoptr: 
  given _tag: Tag[GskTransform_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GskTransform_slistautoptr = o
  extension (v: GskTransform_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkATContextClass_autoptr = Ptr[GtkATContextClass]
object GtkATContextClass_autoptr: 
  given _tag: Tag[GtkATContextClass_autoptr] = Tag.Ptr[GtkATContextClass](GtkATContextClass._tag)
  inline def apply(inline o: Ptr[GtkATContextClass]): GtkATContextClass_autoptr = o
  extension (v: GtkATContextClass_autoptr)
    inline def value: Ptr[GtkATContextClass] = v

opaque type GtkATContextClass_listautoptr = Ptr[GList]
object GtkATContextClass_listautoptr: 
  given _tag: Tag[GtkATContextClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkATContextClass_listautoptr = o
  extension (v: GtkATContextClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkATContextClass_queueautoptr = Ptr[GQueue]
object GtkATContextClass_queueautoptr: 
  given _tag: Tag[GtkATContextClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkATContextClass_queueautoptr = o
  extension (v: GtkATContextClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkATContextClass_slistautoptr = Ptr[GSList]
object GtkATContextClass_slistautoptr: 
  given _tag: Tag[GtkATContextClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkATContextClass_slistautoptr = o
  extension (v: GtkATContextClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkATContext_autoptr = Ptr[GtkATContext]
object GtkATContext_autoptr: 
  given _tag: Tag[GtkATContext_autoptr] = Tag.Ptr[GtkATContext](GtkATContext._tag)
  inline def apply(inline o: Ptr[GtkATContext]): GtkATContext_autoptr = o
  extension (v: GtkATContext_autoptr)
    inline def value: Ptr[GtkATContext] = v

opaque type GtkATContext_listautoptr = Ptr[GList]
object GtkATContext_listautoptr: 
  given _tag: Tag[GtkATContext_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkATContext_listautoptr = o
  extension (v: GtkATContext_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkATContext_queueautoptr = Ptr[GQueue]
object GtkATContext_queueautoptr: 
  given _tag: Tag[GtkATContext_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkATContext_queueautoptr = o
  extension (v: GtkATContext_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkATContext_slistautoptr = Ptr[GSList]
object GtkATContext_slistautoptr: 
  given _tag: Tag[GtkATContext_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkATContext_slistautoptr = o
  extension (v: GtkATContext_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkAboutDialog_autoptr = Ptr[GtkAboutDialog]
object GtkAboutDialog_autoptr: 
  given _tag: Tag[GtkAboutDialog_autoptr] = Tag.Ptr[GtkAboutDialog](GtkAboutDialog._tag)
  inline def apply(inline o: Ptr[GtkAboutDialog]): GtkAboutDialog_autoptr = o
  extension (v: GtkAboutDialog_autoptr)
    inline def value: Ptr[GtkAboutDialog] = v

opaque type GtkAboutDialog_listautoptr = Ptr[GList]
object GtkAboutDialog_listautoptr: 
  given _tag: Tag[GtkAboutDialog_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkAboutDialog_listautoptr = o
  extension (v: GtkAboutDialog_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkAboutDialog_queueautoptr = Ptr[GQueue]
object GtkAboutDialog_queueautoptr: 
  given _tag: Tag[GtkAboutDialog_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkAboutDialog_queueautoptr = o
  extension (v: GtkAboutDialog_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkAboutDialog_slistautoptr = Ptr[GSList]
object GtkAboutDialog_slistautoptr: 
  given _tag: Tag[GtkAboutDialog_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkAboutDialog_slistautoptr = o
  extension (v: GtkAboutDialog_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkAccessible_autoptr = Ptr[GtkAccessible]
object GtkAccessible_autoptr: 
  given _tag: Tag[GtkAccessible_autoptr] = Tag.Ptr[GtkAccessible](GtkAccessible._tag)
  inline def apply(inline o: Ptr[GtkAccessible]): GtkAccessible_autoptr = o
  extension (v: GtkAccessible_autoptr)
    inline def value: Ptr[GtkAccessible] = v

opaque type GtkAccessible_listautoptr = Ptr[GList]
object GtkAccessible_listautoptr: 
  given _tag: Tag[GtkAccessible_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkAccessible_listautoptr = o
  extension (v: GtkAccessible_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkAccessible_queueautoptr = Ptr[GQueue]
object GtkAccessible_queueautoptr: 
  given _tag: Tag[GtkAccessible_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkAccessible_queueautoptr = o
  extension (v: GtkAccessible_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkAccessible_slistautoptr = Ptr[GSList]
object GtkAccessible_slistautoptr: 
  given _tag: Tag[GtkAccessible_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkAccessible_slistautoptr = o
  extension (v: GtkAccessible_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkActionBar_autoptr = Ptr[GtkActionBar]
object GtkActionBar_autoptr: 
  given _tag: Tag[GtkActionBar_autoptr] = Tag.Ptr[GtkActionBar](GtkActionBar._tag)
  inline def apply(inline o: Ptr[GtkActionBar]): GtkActionBar_autoptr = o
  extension (v: GtkActionBar_autoptr)
    inline def value: Ptr[GtkActionBar] = v

opaque type GtkActionBar_listautoptr = Ptr[GList]
object GtkActionBar_listautoptr: 
  given _tag: Tag[GtkActionBar_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkActionBar_listautoptr = o
  extension (v: GtkActionBar_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkActionBar_queueautoptr = Ptr[GQueue]
object GtkActionBar_queueautoptr: 
  given _tag: Tag[GtkActionBar_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkActionBar_queueautoptr = o
  extension (v: GtkActionBar_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkActionBar_slistautoptr = Ptr[GSList]
object GtkActionBar_slistautoptr: 
  given _tag: Tag[GtkActionBar_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkActionBar_slistautoptr = o
  extension (v: GtkActionBar_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkActionable_autoptr = Ptr[GtkActionable]
object GtkActionable_autoptr: 
  given _tag: Tag[GtkActionable_autoptr] = Tag.Ptr[GtkActionable](GtkActionable._tag)
  inline def apply(inline o: Ptr[GtkActionable]): GtkActionable_autoptr = o
  extension (v: GtkActionable_autoptr)
    inline def value: Ptr[GtkActionable] = v

opaque type GtkActionable_listautoptr = Ptr[GList]
object GtkActionable_listautoptr: 
  given _tag: Tag[GtkActionable_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkActionable_listautoptr = o
  extension (v: GtkActionable_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkActionable_queueautoptr = Ptr[GQueue]
object GtkActionable_queueautoptr: 
  given _tag: Tag[GtkActionable_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkActionable_queueautoptr = o
  extension (v: GtkActionable_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkActionable_slistautoptr = Ptr[GSList]
object GtkActionable_slistautoptr: 
  given _tag: Tag[GtkActionable_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkActionable_slistautoptr = o
  extension (v: GtkActionable_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkActivateActionClass_autoptr = Ptr[GtkActivateActionClass]
object GtkActivateActionClass_autoptr: 
  given _tag: Tag[GtkActivateActionClass_autoptr] = Tag.Ptr[GtkActivateActionClass](GtkActivateActionClass._tag)
  inline def apply(inline o: Ptr[GtkActivateActionClass]): GtkActivateActionClass_autoptr = o
  extension (v: GtkActivateActionClass_autoptr)
    inline def value: Ptr[GtkActivateActionClass] = v

opaque type GtkActivateActionClass_listautoptr = Ptr[GList]
object GtkActivateActionClass_listautoptr: 
  given _tag: Tag[GtkActivateActionClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkActivateActionClass_listautoptr = o
  extension (v: GtkActivateActionClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkActivateActionClass_queueautoptr = Ptr[GQueue]
object GtkActivateActionClass_queueautoptr: 
  given _tag: Tag[GtkActivateActionClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkActivateActionClass_queueautoptr = o
  extension (v: GtkActivateActionClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkActivateActionClass_slistautoptr = Ptr[GSList]
object GtkActivateActionClass_slistautoptr: 
  given _tag: Tag[GtkActivateActionClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkActivateActionClass_slistautoptr = o
  extension (v: GtkActivateActionClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkActivateAction_autoptr = Ptr[GtkActivateAction]
object GtkActivateAction_autoptr: 
  given _tag: Tag[GtkActivateAction_autoptr] = Tag.Ptr[GtkActivateAction](GtkActivateAction._tag)
  inline def apply(inline o: Ptr[GtkActivateAction]): GtkActivateAction_autoptr = o
  extension (v: GtkActivateAction_autoptr)
    inline def value: Ptr[GtkActivateAction] = v

opaque type GtkActivateAction_listautoptr = Ptr[GList]
object GtkActivateAction_listautoptr: 
  given _tag: Tag[GtkActivateAction_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkActivateAction_listautoptr = o
  extension (v: GtkActivateAction_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkActivateAction_queueautoptr = Ptr[GQueue]
object GtkActivateAction_queueautoptr: 
  given _tag: Tag[GtkActivateAction_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkActivateAction_queueautoptr = o
  extension (v: GtkActivateAction_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkActivateAction_slistautoptr = Ptr[GSList]
object GtkActivateAction_slistautoptr: 
  given _tag: Tag[GtkActivateAction_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkActivateAction_slistautoptr = o
  extension (v: GtkActivateAction_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkAdjustment_autoptr = Ptr[GtkAdjustment]
object GtkAdjustment_autoptr: 
  given _tag: Tag[GtkAdjustment_autoptr] = Tag.Ptr[GtkAdjustment](GtkAdjustment._tag)
  inline def apply(inline o: Ptr[GtkAdjustment]): GtkAdjustment_autoptr = o
  extension (v: GtkAdjustment_autoptr)
    inline def value: Ptr[GtkAdjustment] = v

opaque type GtkAdjustment_listautoptr = Ptr[GList]
object GtkAdjustment_listautoptr: 
  given _tag: Tag[GtkAdjustment_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkAdjustment_listautoptr = o
  extension (v: GtkAdjustment_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkAdjustment_queueautoptr = Ptr[GQueue]
object GtkAdjustment_queueautoptr: 
  given _tag: Tag[GtkAdjustment_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkAdjustment_queueautoptr = o
  extension (v: GtkAdjustment_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkAdjustment_slistautoptr = Ptr[GSList]
object GtkAdjustment_slistautoptr: 
  given _tag: Tag[GtkAdjustment_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkAdjustment_slistautoptr = o
  extension (v: GtkAdjustment_slistautoptr)
    inline def value: Ptr[GSList] = v

type GtkAllocation = GdkRectangle
object GtkAllocation: 
  given _tag: Tag[GtkAllocation] = GdkRectangle._tag
  inline def apply(inline o: GdkRectangle): GtkAllocation = o
  extension (v: GtkAllocation)
    inline def value: GdkRectangle = v

opaque type GtkAlternativeTriggerClass_autoptr = Ptr[GtkAlternativeTriggerClass]
object GtkAlternativeTriggerClass_autoptr: 
  given _tag: Tag[GtkAlternativeTriggerClass_autoptr] = Tag.Ptr[GtkAlternativeTriggerClass](GtkAlternativeTriggerClass._tag)
  inline def apply(inline o: Ptr[GtkAlternativeTriggerClass]): GtkAlternativeTriggerClass_autoptr = o
  extension (v: GtkAlternativeTriggerClass_autoptr)
    inline def value: Ptr[GtkAlternativeTriggerClass] = v

opaque type GtkAlternativeTriggerClass_listautoptr = Ptr[GList]
object GtkAlternativeTriggerClass_listautoptr: 
  given _tag: Tag[GtkAlternativeTriggerClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkAlternativeTriggerClass_listautoptr = o
  extension (v: GtkAlternativeTriggerClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkAlternativeTriggerClass_queueautoptr = Ptr[GQueue]
object GtkAlternativeTriggerClass_queueautoptr: 
  given _tag: Tag[GtkAlternativeTriggerClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkAlternativeTriggerClass_queueautoptr = o
  extension (v: GtkAlternativeTriggerClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkAlternativeTriggerClass_slistautoptr = Ptr[GSList]
object GtkAlternativeTriggerClass_slistautoptr: 
  given _tag: Tag[GtkAlternativeTriggerClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkAlternativeTriggerClass_slistautoptr = o
  extension (v: GtkAlternativeTriggerClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkAlternativeTrigger_autoptr = Ptr[GtkAlternativeTrigger]
object GtkAlternativeTrigger_autoptr: 
  given _tag: Tag[GtkAlternativeTrigger_autoptr] = Tag.Ptr[GtkAlternativeTrigger](GtkAlternativeTrigger._tag)
  inline def apply(inline o: Ptr[GtkAlternativeTrigger]): GtkAlternativeTrigger_autoptr = o
  extension (v: GtkAlternativeTrigger_autoptr)
    inline def value: Ptr[GtkAlternativeTrigger] = v

opaque type GtkAlternativeTrigger_listautoptr = Ptr[GList]
object GtkAlternativeTrigger_listautoptr: 
  given _tag: Tag[GtkAlternativeTrigger_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkAlternativeTrigger_listautoptr = o
  extension (v: GtkAlternativeTrigger_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkAlternativeTrigger_queueautoptr = Ptr[GQueue]
object GtkAlternativeTrigger_queueautoptr: 
  given _tag: Tag[GtkAlternativeTrigger_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkAlternativeTrigger_queueautoptr = o
  extension (v: GtkAlternativeTrigger_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkAlternativeTrigger_slistautoptr = Ptr[GSList]
object GtkAlternativeTrigger_slistautoptr: 
  given _tag: Tag[GtkAlternativeTrigger_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkAlternativeTrigger_slistautoptr = o
  extension (v: GtkAlternativeTrigger_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkAnyFilterClass_autoptr = Ptr[GtkAnyFilterClass]
object GtkAnyFilterClass_autoptr: 
  given _tag: Tag[GtkAnyFilterClass_autoptr] = Tag.Ptr[GtkAnyFilterClass](GtkAnyFilterClass._tag)
  inline def apply(inline o: Ptr[GtkAnyFilterClass]): GtkAnyFilterClass_autoptr = o
  extension (v: GtkAnyFilterClass_autoptr)
    inline def value: Ptr[GtkAnyFilterClass] = v

opaque type GtkAnyFilterClass_listautoptr = Ptr[GList]
object GtkAnyFilterClass_listautoptr: 
  given _tag: Tag[GtkAnyFilterClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkAnyFilterClass_listautoptr = o
  extension (v: GtkAnyFilterClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkAnyFilterClass_queueautoptr = Ptr[GQueue]
object GtkAnyFilterClass_queueautoptr: 
  given _tag: Tag[GtkAnyFilterClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkAnyFilterClass_queueautoptr = o
  extension (v: GtkAnyFilterClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkAnyFilterClass_slistautoptr = Ptr[GSList]
object GtkAnyFilterClass_slistautoptr: 
  given _tag: Tag[GtkAnyFilterClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkAnyFilterClass_slistautoptr = o
  extension (v: GtkAnyFilterClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkAnyFilter_autoptr = Ptr[GtkAnyFilter]
object GtkAnyFilter_autoptr: 
  given _tag: Tag[GtkAnyFilter_autoptr] = Tag.Ptr[GtkAnyFilter](GtkAnyFilter._tag)
  inline def apply(inline o: Ptr[GtkAnyFilter]): GtkAnyFilter_autoptr = o
  extension (v: GtkAnyFilter_autoptr)
    inline def value: Ptr[GtkAnyFilter] = v

opaque type GtkAnyFilter_listautoptr = Ptr[GList]
object GtkAnyFilter_listautoptr: 
  given _tag: Tag[GtkAnyFilter_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkAnyFilter_listautoptr = o
  extension (v: GtkAnyFilter_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkAnyFilter_queueautoptr = Ptr[GQueue]
object GtkAnyFilter_queueautoptr: 
  given _tag: Tag[GtkAnyFilter_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkAnyFilter_queueautoptr = o
  extension (v: GtkAnyFilter_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkAnyFilter_slistautoptr = Ptr[GSList]
object GtkAnyFilter_slistautoptr: 
  given _tag: Tag[GtkAnyFilter_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkAnyFilter_slistautoptr = o
  extension (v: GtkAnyFilter_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkAppChooserButton_autoptr = Ptr[GtkAppChooserButton]
object GtkAppChooserButton_autoptr: 
  given _tag: Tag[GtkAppChooserButton_autoptr] = Tag.Ptr[GtkAppChooserButton](GtkAppChooserButton._tag)
  inline def apply(inline o: Ptr[GtkAppChooserButton]): GtkAppChooserButton_autoptr = o
  extension (v: GtkAppChooserButton_autoptr)
    inline def value: Ptr[GtkAppChooserButton] = v

opaque type GtkAppChooserButton_listautoptr = Ptr[GList]
object GtkAppChooserButton_listautoptr: 
  given _tag: Tag[GtkAppChooserButton_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkAppChooserButton_listautoptr = o
  extension (v: GtkAppChooserButton_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkAppChooserButton_queueautoptr = Ptr[GQueue]
object GtkAppChooserButton_queueautoptr: 
  given _tag: Tag[GtkAppChooserButton_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkAppChooserButton_queueautoptr = o
  extension (v: GtkAppChooserButton_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkAppChooserButton_slistautoptr = Ptr[GSList]
object GtkAppChooserButton_slistautoptr: 
  given _tag: Tag[GtkAppChooserButton_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkAppChooserButton_slistautoptr = o
  extension (v: GtkAppChooserButton_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkAppChooserDialog_autoptr = Ptr[GtkAppChooserDialog]
object GtkAppChooserDialog_autoptr: 
  given _tag: Tag[GtkAppChooserDialog_autoptr] = Tag.Ptr[GtkAppChooserDialog](GtkAppChooserDialog._tag)
  inline def apply(inline o: Ptr[GtkAppChooserDialog]): GtkAppChooserDialog_autoptr = o
  extension (v: GtkAppChooserDialog_autoptr)
    inline def value: Ptr[GtkAppChooserDialog] = v

opaque type GtkAppChooserDialog_listautoptr = Ptr[GList]
object GtkAppChooserDialog_listautoptr: 
  given _tag: Tag[GtkAppChooserDialog_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkAppChooserDialog_listautoptr = o
  extension (v: GtkAppChooserDialog_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkAppChooserDialog_queueautoptr = Ptr[GQueue]
object GtkAppChooserDialog_queueautoptr: 
  given _tag: Tag[GtkAppChooserDialog_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkAppChooserDialog_queueautoptr = o
  extension (v: GtkAppChooserDialog_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkAppChooserDialog_slistautoptr = Ptr[GSList]
object GtkAppChooserDialog_slistautoptr: 
  given _tag: Tag[GtkAppChooserDialog_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkAppChooserDialog_slistautoptr = o
  extension (v: GtkAppChooserDialog_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkAppChooserWidget_autoptr = Ptr[GtkAppChooserWidget]
object GtkAppChooserWidget_autoptr: 
  given _tag: Tag[GtkAppChooserWidget_autoptr] = Tag.Ptr[GtkAppChooserWidget](GtkAppChooserWidget._tag)
  inline def apply(inline o: Ptr[GtkAppChooserWidget]): GtkAppChooserWidget_autoptr = o
  extension (v: GtkAppChooserWidget_autoptr)
    inline def value: Ptr[GtkAppChooserWidget] = v

opaque type GtkAppChooserWidget_listautoptr = Ptr[GList]
object GtkAppChooserWidget_listautoptr: 
  given _tag: Tag[GtkAppChooserWidget_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkAppChooserWidget_listautoptr = o
  extension (v: GtkAppChooserWidget_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkAppChooserWidget_queueautoptr = Ptr[GQueue]
object GtkAppChooserWidget_queueautoptr: 
  given _tag: Tag[GtkAppChooserWidget_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkAppChooserWidget_queueautoptr = o
  extension (v: GtkAppChooserWidget_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkAppChooserWidget_slistautoptr = Ptr[GSList]
object GtkAppChooserWidget_slistautoptr: 
  given _tag: Tag[GtkAppChooserWidget_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkAppChooserWidget_slistautoptr = o
  extension (v: GtkAppChooserWidget_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkAppChooser_autoptr = Ptr[GtkAppChooser]
object GtkAppChooser_autoptr: 
  given _tag: Tag[GtkAppChooser_autoptr] = Tag.Ptr[GtkAppChooser](GtkAppChooser._tag)
  inline def apply(inline o: Ptr[GtkAppChooser]): GtkAppChooser_autoptr = o
  extension (v: GtkAppChooser_autoptr)
    inline def value: Ptr[GtkAppChooser] = v

opaque type GtkAppChooser_listautoptr = Ptr[GList]
object GtkAppChooser_listautoptr: 
  given _tag: Tag[GtkAppChooser_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkAppChooser_listautoptr = o
  extension (v: GtkAppChooser_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkAppChooser_queueautoptr = Ptr[GQueue]
object GtkAppChooser_queueautoptr: 
  given _tag: Tag[GtkAppChooser_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkAppChooser_queueautoptr = o
  extension (v: GtkAppChooser_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkAppChooser_slistautoptr = Ptr[GSList]
object GtkAppChooser_slistautoptr: 
  given _tag: Tag[GtkAppChooser_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkAppChooser_slistautoptr = o
  extension (v: GtkAppChooser_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkApplicationWindow_autoptr = Ptr[GtkApplicationWindow]
object GtkApplicationWindow_autoptr: 
  given _tag: Tag[GtkApplicationWindow_autoptr] = Tag.Ptr[GtkApplicationWindow](GtkApplicationWindow._tag)
  inline def apply(inline o: Ptr[GtkApplicationWindow]): GtkApplicationWindow_autoptr = o
  extension (v: GtkApplicationWindow_autoptr)
    inline def value: Ptr[GtkApplicationWindow] = v

opaque type GtkApplicationWindow_listautoptr = Ptr[GList]
object GtkApplicationWindow_listautoptr: 
  given _tag: Tag[GtkApplicationWindow_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkApplicationWindow_listautoptr = o
  extension (v: GtkApplicationWindow_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkApplicationWindow_queueautoptr = Ptr[GQueue]
object GtkApplicationWindow_queueautoptr: 
  given _tag: Tag[GtkApplicationWindow_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkApplicationWindow_queueautoptr = o
  extension (v: GtkApplicationWindow_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkApplicationWindow_slistautoptr = Ptr[GSList]
object GtkApplicationWindow_slistautoptr: 
  given _tag: Tag[GtkApplicationWindow_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkApplicationWindow_slistautoptr = o
  extension (v: GtkApplicationWindow_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkApplication_autoptr = Ptr[GtkApplication]
object GtkApplication_autoptr: 
  given _tag: Tag[GtkApplication_autoptr] = Tag.Ptr[GtkApplication](GtkApplication._tag)
  inline def apply(inline o: Ptr[GtkApplication]): GtkApplication_autoptr = o
  extension (v: GtkApplication_autoptr)
    inline def value: Ptr[GtkApplication] = v

opaque type GtkApplication_listautoptr = Ptr[GList]
object GtkApplication_listautoptr: 
  given _tag: Tag[GtkApplication_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkApplication_listautoptr = o
  extension (v: GtkApplication_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkApplication_queueautoptr = Ptr[GQueue]
object GtkApplication_queueautoptr: 
  given _tag: Tag[GtkApplication_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkApplication_queueautoptr = o
  extension (v: GtkApplication_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkApplication_slistautoptr = Ptr[GSList]
object GtkApplication_slistautoptr: 
  given _tag: Tag[GtkApplication_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkApplication_slistautoptr = o
  extension (v: GtkApplication_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkAspectFrame_autoptr = Ptr[GtkAspectFrame]
object GtkAspectFrame_autoptr: 
  given _tag: Tag[GtkAspectFrame_autoptr] = Tag.Ptr[GtkAspectFrame](GtkAspectFrame._tag)
  inline def apply(inline o: Ptr[GtkAspectFrame]): GtkAspectFrame_autoptr = o
  extension (v: GtkAspectFrame_autoptr)
    inline def value: Ptr[GtkAspectFrame] = v

opaque type GtkAspectFrame_listautoptr = Ptr[GList]
object GtkAspectFrame_listautoptr: 
  given _tag: Tag[GtkAspectFrame_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkAspectFrame_listautoptr = o
  extension (v: GtkAspectFrame_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkAspectFrame_queueautoptr = Ptr[GQueue]
object GtkAspectFrame_queueautoptr: 
  given _tag: Tag[GtkAspectFrame_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkAspectFrame_queueautoptr = o
  extension (v: GtkAspectFrame_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkAspectFrame_slistautoptr = Ptr[GSList]
object GtkAspectFrame_slistautoptr: 
  given _tag: Tag[GtkAspectFrame_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkAspectFrame_slistautoptr = o
  extension (v: GtkAspectFrame_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkAssistantPageFunc = CFuncPtr2[CInt, gpointer, CInt]
object GtkAssistantPageFunc: 
  given _tag: Tag[GtkAssistantPageFunc] = Tag.materializeCFuncPtr2[CInt, gpointer, CInt]
  inline def apply(inline o: CFuncPtr2[CInt, gpointer, CInt]): GtkAssistantPageFunc = o
  extension (v: GtkAssistantPageFunc)
    inline def value: CFuncPtr2[CInt, gpointer, CInt] = v

opaque type GtkAssistant_autoptr = Ptr[GtkAssistant]
object GtkAssistant_autoptr: 
  given _tag: Tag[GtkAssistant_autoptr] = Tag.Ptr[GtkAssistant](GtkAssistant._tag)
  inline def apply(inline o: Ptr[GtkAssistant]): GtkAssistant_autoptr = o
  extension (v: GtkAssistant_autoptr)
    inline def value: Ptr[GtkAssistant] = v

opaque type GtkAssistant_listautoptr = Ptr[GList]
object GtkAssistant_listautoptr: 
  given _tag: Tag[GtkAssistant_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkAssistant_listautoptr = o
  extension (v: GtkAssistant_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkAssistant_queueautoptr = Ptr[GQueue]
object GtkAssistant_queueautoptr: 
  given _tag: Tag[GtkAssistant_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkAssistant_queueautoptr = o
  extension (v: GtkAssistant_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkAssistant_slistautoptr = Ptr[GSList]
object GtkAssistant_slistautoptr: 
  given _tag: Tag[GtkAssistant_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkAssistant_slistautoptr = o
  extension (v: GtkAssistant_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkBinLayoutClass_autoptr = Ptr[GtkBinLayoutClass]
object GtkBinLayoutClass_autoptr: 
  given _tag: Tag[GtkBinLayoutClass_autoptr] = Tag.Ptr[GtkBinLayoutClass](GtkBinLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkBinLayoutClass]): GtkBinLayoutClass_autoptr = o
  extension (v: GtkBinLayoutClass_autoptr)
    inline def value: Ptr[GtkBinLayoutClass] = v

opaque type GtkBinLayoutClass_listautoptr = Ptr[GList]
object GtkBinLayoutClass_listautoptr: 
  given _tag: Tag[GtkBinLayoutClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkBinLayoutClass_listautoptr = o
  extension (v: GtkBinLayoutClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkBinLayoutClass_queueautoptr = Ptr[GQueue]
object GtkBinLayoutClass_queueautoptr: 
  given _tag: Tag[GtkBinLayoutClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkBinLayoutClass_queueautoptr = o
  extension (v: GtkBinLayoutClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkBinLayoutClass_slistautoptr = Ptr[GSList]
object GtkBinLayoutClass_slistautoptr: 
  given _tag: Tag[GtkBinLayoutClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkBinLayoutClass_slistautoptr = o
  extension (v: GtkBinLayoutClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkBinLayout_autoptr = Ptr[GtkBinLayout]
object GtkBinLayout_autoptr: 
  given _tag: Tag[GtkBinLayout_autoptr] = Tag.Ptr[GtkBinLayout](GtkBinLayout._tag)
  inline def apply(inline o: Ptr[GtkBinLayout]): GtkBinLayout_autoptr = o
  extension (v: GtkBinLayout_autoptr)
    inline def value: Ptr[GtkBinLayout] = v

opaque type GtkBinLayout_listautoptr = Ptr[GList]
object GtkBinLayout_listautoptr: 
  given _tag: Tag[GtkBinLayout_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkBinLayout_listautoptr = o
  extension (v: GtkBinLayout_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkBinLayout_queueautoptr = Ptr[GQueue]
object GtkBinLayout_queueautoptr: 
  given _tag: Tag[GtkBinLayout_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkBinLayout_queueautoptr = o
  extension (v: GtkBinLayout_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkBinLayout_slistautoptr = Ptr[GSList]
object GtkBinLayout_slistautoptr: 
  given _tag: Tag[GtkBinLayout_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkBinLayout_slistautoptr = o
  extension (v: GtkBinLayout_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkBitset_autoptr = Ptr[GtkBitset]
object GtkBitset_autoptr: 
  given _tag: Tag[GtkBitset_autoptr] = Tag.Ptr[GtkBitset](GtkBitset._tag)
  inline def apply(inline o: Ptr[GtkBitset]): GtkBitset_autoptr = o
  extension (v: GtkBitset_autoptr)
    inline def value: Ptr[GtkBitset] = v

opaque type GtkBitset_listautoptr = Ptr[GList]
object GtkBitset_listautoptr: 
  given _tag: Tag[GtkBitset_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkBitset_listautoptr = o
  extension (v: GtkBitset_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkBitset_queueautoptr = Ptr[GQueue]
object GtkBitset_queueautoptr: 
  given _tag: Tag[GtkBitset_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkBitset_queueautoptr = o
  extension (v: GtkBitset_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkBitset_slistautoptr = Ptr[GSList]
object GtkBitset_slistautoptr: 
  given _tag: Tag[GtkBitset_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkBitset_slistautoptr = o
  extension (v: GtkBitset_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkBookmarkListClass_autoptr = Ptr[GtkBookmarkListClass]
object GtkBookmarkListClass_autoptr: 
  given _tag: Tag[GtkBookmarkListClass_autoptr] = Tag.Ptr[GtkBookmarkListClass](GtkBookmarkListClass._tag)
  inline def apply(inline o: Ptr[GtkBookmarkListClass]): GtkBookmarkListClass_autoptr = o
  extension (v: GtkBookmarkListClass_autoptr)
    inline def value: Ptr[GtkBookmarkListClass] = v

opaque type GtkBookmarkListClass_listautoptr = Ptr[GList]
object GtkBookmarkListClass_listautoptr: 
  given _tag: Tag[GtkBookmarkListClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkBookmarkListClass_listautoptr = o
  extension (v: GtkBookmarkListClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkBookmarkListClass_queueautoptr = Ptr[GQueue]
object GtkBookmarkListClass_queueautoptr: 
  given _tag: Tag[GtkBookmarkListClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkBookmarkListClass_queueautoptr = o
  extension (v: GtkBookmarkListClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkBookmarkListClass_slistautoptr = Ptr[GSList]
object GtkBookmarkListClass_slistautoptr: 
  given _tag: Tag[GtkBookmarkListClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkBookmarkListClass_slistautoptr = o
  extension (v: GtkBookmarkListClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkBookmarkList_autoptr = Ptr[GtkBookmarkList]
object GtkBookmarkList_autoptr: 
  given _tag: Tag[GtkBookmarkList_autoptr] = Tag.Ptr[GtkBookmarkList](GtkBookmarkList._tag)
  inline def apply(inline o: Ptr[GtkBookmarkList]): GtkBookmarkList_autoptr = o
  extension (v: GtkBookmarkList_autoptr)
    inline def value: Ptr[GtkBookmarkList] = v

opaque type GtkBookmarkList_listautoptr = Ptr[GList]
object GtkBookmarkList_listautoptr: 
  given _tag: Tag[GtkBookmarkList_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkBookmarkList_listautoptr = o
  extension (v: GtkBookmarkList_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkBookmarkList_queueautoptr = Ptr[GQueue]
object GtkBookmarkList_queueautoptr: 
  given _tag: Tag[GtkBookmarkList_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkBookmarkList_queueautoptr = o
  extension (v: GtkBookmarkList_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkBookmarkList_slistautoptr = Ptr[GSList]
object GtkBookmarkList_slistautoptr: 
  given _tag: Tag[GtkBookmarkList_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkBookmarkList_slistautoptr = o
  extension (v: GtkBookmarkList_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkBoolFilterClass_autoptr = Ptr[GtkBoolFilterClass]
object GtkBoolFilterClass_autoptr: 
  given _tag: Tag[GtkBoolFilterClass_autoptr] = Tag.Ptr[GtkBoolFilterClass](GtkBoolFilterClass._tag)
  inline def apply(inline o: Ptr[GtkBoolFilterClass]): GtkBoolFilterClass_autoptr = o
  extension (v: GtkBoolFilterClass_autoptr)
    inline def value: Ptr[GtkBoolFilterClass] = v

opaque type GtkBoolFilterClass_listautoptr = Ptr[GList]
object GtkBoolFilterClass_listautoptr: 
  given _tag: Tag[GtkBoolFilterClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkBoolFilterClass_listautoptr = o
  extension (v: GtkBoolFilterClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkBoolFilterClass_queueautoptr = Ptr[GQueue]
object GtkBoolFilterClass_queueautoptr: 
  given _tag: Tag[GtkBoolFilterClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkBoolFilterClass_queueautoptr = o
  extension (v: GtkBoolFilterClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkBoolFilterClass_slistautoptr = Ptr[GSList]
object GtkBoolFilterClass_slistautoptr: 
  given _tag: Tag[GtkBoolFilterClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkBoolFilterClass_slistautoptr = o
  extension (v: GtkBoolFilterClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkBoolFilter_autoptr = Ptr[GtkBoolFilter]
object GtkBoolFilter_autoptr: 
  given _tag: Tag[GtkBoolFilter_autoptr] = Tag.Ptr[GtkBoolFilter](GtkBoolFilter._tag)
  inline def apply(inline o: Ptr[GtkBoolFilter]): GtkBoolFilter_autoptr = o
  extension (v: GtkBoolFilter_autoptr)
    inline def value: Ptr[GtkBoolFilter] = v

opaque type GtkBoolFilter_listautoptr = Ptr[GList]
object GtkBoolFilter_listautoptr: 
  given _tag: Tag[GtkBoolFilter_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkBoolFilter_listautoptr = o
  extension (v: GtkBoolFilter_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkBoolFilter_queueautoptr = Ptr[GQueue]
object GtkBoolFilter_queueautoptr: 
  given _tag: Tag[GtkBoolFilter_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkBoolFilter_queueautoptr = o
  extension (v: GtkBoolFilter_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkBoolFilter_slistautoptr = Ptr[GSList]
object GtkBoolFilter_slistautoptr: 
  given _tag: Tag[GtkBoolFilter_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkBoolFilter_slistautoptr = o
  extension (v: GtkBoolFilter_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkBorder_autoptr = Ptr[GtkBorder]
object GtkBorder_autoptr: 
  given _tag: Tag[GtkBorder_autoptr] = Tag.Ptr[GtkBorder](GtkBorder._tag)
  inline def apply(inline o: Ptr[GtkBorder]): GtkBorder_autoptr = o
  extension (v: GtkBorder_autoptr)
    inline def value: Ptr[GtkBorder] = v

opaque type GtkBorder_listautoptr = Ptr[GList]
object GtkBorder_listautoptr: 
  given _tag: Tag[GtkBorder_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkBorder_listautoptr = o
  extension (v: GtkBorder_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkBorder_queueautoptr = Ptr[GQueue]
object GtkBorder_queueautoptr: 
  given _tag: Tag[GtkBorder_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkBorder_queueautoptr = o
  extension (v: GtkBorder_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkBorder_slistautoptr = Ptr[GSList]
object GtkBorder_slistautoptr: 
  given _tag: Tag[GtkBorder_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkBorder_slistautoptr = o
  extension (v: GtkBorder_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkBoxLayoutClass_autoptr = Ptr[GtkBoxLayoutClass]
object GtkBoxLayoutClass_autoptr: 
  given _tag: Tag[GtkBoxLayoutClass_autoptr] = Tag.Ptr[GtkBoxLayoutClass](GtkBoxLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkBoxLayoutClass]): GtkBoxLayoutClass_autoptr = o
  extension (v: GtkBoxLayoutClass_autoptr)
    inline def value: Ptr[GtkBoxLayoutClass] = v

opaque type GtkBoxLayoutClass_listautoptr = Ptr[GList]
object GtkBoxLayoutClass_listautoptr: 
  given _tag: Tag[GtkBoxLayoutClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkBoxLayoutClass_listautoptr = o
  extension (v: GtkBoxLayoutClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkBoxLayoutClass_queueautoptr = Ptr[GQueue]
object GtkBoxLayoutClass_queueautoptr: 
  given _tag: Tag[GtkBoxLayoutClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkBoxLayoutClass_queueautoptr = o
  extension (v: GtkBoxLayoutClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkBoxLayoutClass_slistautoptr = Ptr[GSList]
object GtkBoxLayoutClass_slistautoptr: 
  given _tag: Tag[GtkBoxLayoutClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkBoxLayoutClass_slistautoptr = o
  extension (v: GtkBoxLayoutClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkBoxLayout_autoptr = Ptr[GtkBoxLayout]
object GtkBoxLayout_autoptr: 
  given _tag: Tag[GtkBoxLayout_autoptr] = Tag.Ptr[GtkBoxLayout](GtkBoxLayout._tag)
  inline def apply(inline o: Ptr[GtkBoxLayout]): GtkBoxLayout_autoptr = o
  extension (v: GtkBoxLayout_autoptr)
    inline def value: Ptr[GtkBoxLayout] = v

opaque type GtkBoxLayout_listautoptr = Ptr[GList]
object GtkBoxLayout_listautoptr: 
  given _tag: Tag[GtkBoxLayout_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkBoxLayout_listautoptr = o
  extension (v: GtkBoxLayout_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkBoxLayout_queueautoptr = Ptr[GQueue]
object GtkBoxLayout_queueautoptr: 
  given _tag: Tag[GtkBoxLayout_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkBoxLayout_queueautoptr = o
  extension (v: GtkBoxLayout_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkBoxLayout_slistautoptr = Ptr[GSList]
object GtkBoxLayout_slistautoptr: 
  given _tag: Tag[GtkBoxLayout_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkBoxLayout_slistautoptr = o
  extension (v: GtkBoxLayout_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkBox_autoptr = Ptr[GtkBox]
object GtkBox_autoptr: 
  given _tag: Tag[GtkBox_autoptr] = Tag.Ptr[GtkBox](GtkBox._tag)
  inline def apply(inline o: Ptr[GtkBox]): GtkBox_autoptr = o
  extension (v: GtkBox_autoptr)
    inline def value: Ptr[GtkBox] = v

opaque type GtkBox_listautoptr = Ptr[GList]
object GtkBox_listautoptr: 
  given _tag: Tag[GtkBox_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkBox_listautoptr = o
  extension (v: GtkBox_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkBox_queueautoptr = Ptr[GQueue]
object GtkBox_queueautoptr: 
  given _tag: Tag[GtkBox_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkBox_queueautoptr = o
  extension (v: GtkBox_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkBox_slistautoptr = Ptr[GSList]
object GtkBox_slistautoptr: 
  given _tag: Tag[GtkBox_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkBox_slistautoptr = o
  extension (v: GtkBox_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkBuildable_autoptr = Ptr[GtkBuildable]
object GtkBuildable_autoptr: 
  given _tag: Tag[GtkBuildable_autoptr] = Tag.Ptr[GtkBuildable](GtkBuildable._tag)
  inline def apply(inline o: Ptr[GtkBuildable]): GtkBuildable_autoptr = o
  extension (v: GtkBuildable_autoptr)
    inline def value: Ptr[GtkBuildable] = v

opaque type GtkBuildable_listautoptr = Ptr[GList]
object GtkBuildable_listautoptr: 
  given _tag: Tag[GtkBuildable_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkBuildable_listautoptr = o
  extension (v: GtkBuildable_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkBuildable_queueautoptr = Ptr[GQueue]
object GtkBuildable_queueautoptr: 
  given _tag: Tag[GtkBuildable_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkBuildable_queueautoptr = o
  extension (v: GtkBuildable_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkBuildable_slistautoptr = Ptr[GSList]
object GtkBuildable_slistautoptr: 
  given _tag: Tag[GtkBuildable_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkBuildable_slistautoptr = o
  extension (v: GtkBuildable_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkBuilderCScopeClass_autoptr = Ptr[GtkBuilderCScopeClass]
object GtkBuilderCScopeClass_autoptr: 
  given _tag: Tag[GtkBuilderCScopeClass_autoptr] = Tag.Ptr[GtkBuilderCScopeClass](GtkBuilderCScopeClass._tag)
  inline def apply(inline o: Ptr[GtkBuilderCScopeClass]): GtkBuilderCScopeClass_autoptr = o
  extension (v: GtkBuilderCScopeClass_autoptr)
    inline def value: Ptr[GtkBuilderCScopeClass] = v

opaque type GtkBuilderCScopeClass_listautoptr = Ptr[GList]
object GtkBuilderCScopeClass_listautoptr: 
  given _tag: Tag[GtkBuilderCScopeClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkBuilderCScopeClass_listautoptr = o
  extension (v: GtkBuilderCScopeClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkBuilderCScopeClass_queueautoptr = Ptr[GQueue]
object GtkBuilderCScopeClass_queueautoptr: 
  given _tag: Tag[GtkBuilderCScopeClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkBuilderCScopeClass_queueautoptr = o
  extension (v: GtkBuilderCScopeClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkBuilderCScopeClass_slistautoptr = Ptr[GSList]
object GtkBuilderCScopeClass_slistautoptr: 
  given _tag: Tag[GtkBuilderCScopeClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkBuilderCScopeClass_slistautoptr = o
  extension (v: GtkBuilderCScopeClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkBuilderCScope_autoptr = Ptr[GtkBuilderCScope]
object GtkBuilderCScope_autoptr: 
  given _tag: Tag[GtkBuilderCScope_autoptr] = Tag.Ptr[GtkBuilderCScope](GtkBuilderCScope._tag)
  inline def apply(inline o: Ptr[GtkBuilderCScope]): GtkBuilderCScope_autoptr = o
  extension (v: GtkBuilderCScope_autoptr)
    inline def value: Ptr[GtkBuilderCScope] = v

opaque type GtkBuilderCScope_listautoptr = Ptr[GList]
object GtkBuilderCScope_listautoptr: 
  given _tag: Tag[GtkBuilderCScope_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkBuilderCScope_listautoptr = o
  extension (v: GtkBuilderCScope_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkBuilderCScope_queueautoptr = Ptr[GQueue]
object GtkBuilderCScope_queueautoptr: 
  given _tag: Tag[GtkBuilderCScope_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkBuilderCScope_queueautoptr = o
  extension (v: GtkBuilderCScope_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkBuilderCScope_slistautoptr = Ptr[GSList]
object GtkBuilderCScope_slistautoptr: 
  given _tag: Tag[GtkBuilderCScope_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkBuilderCScope_slistautoptr = o
  extension (v: GtkBuilderCScope_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkBuilderScope_autoptr = Ptr[GtkBuilderScope]
object GtkBuilderScope_autoptr: 
  given _tag: Tag[GtkBuilderScope_autoptr] = Tag.Ptr[GtkBuilderScope](GtkBuilderScope._tag)
  inline def apply(inline o: Ptr[GtkBuilderScope]): GtkBuilderScope_autoptr = o
  extension (v: GtkBuilderScope_autoptr)
    inline def value: Ptr[GtkBuilderScope] = v

opaque type GtkBuilderScope_listautoptr = Ptr[GList]
object GtkBuilderScope_listautoptr: 
  given _tag: Tag[GtkBuilderScope_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkBuilderScope_listautoptr = o
  extension (v: GtkBuilderScope_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkBuilderScope_queueautoptr = Ptr[GQueue]
object GtkBuilderScope_queueautoptr: 
  given _tag: Tag[GtkBuilderScope_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkBuilderScope_queueautoptr = o
  extension (v: GtkBuilderScope_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkBuilderScope_slistautoptr = Ptr[GSList]
object GtkBuilderScope_slistautoptr: 
  given _tag: Tag[GtkBuilderScope_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkBuilderScope_slistautoptr = o
  extension (v: GtkBuilderScope_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkBuilder_autoptr = Ptr[GtkBuilder]
object GtkBuilder_autoptr: 
  given _tag: Tag[GtkBuilder_autoptr] = Tag.Ptr[GtkBuilder](GtkBuilder._tag)
  inline def apply(inline o: Ptr[GtkBuilder]): GtkBuilder_autoptr = o
  extension (v: GtkBuilder_autoptr)
    inline def value: Ptr[GtkBuilder] = v

opaque type GtkBuilder_listautoptr = Ptr[GList]
object GtkBuilder_listautoptr: 
  given _tag: Tag[GtkBuilder_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkBuilder_listautoptr = o
  extension (v: GtkBuilder_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkBuilder_queueautoptr = Ptr[GQueue]
object GtkBuilder_queueautoptr: 
  given _tag: Tag[GtkBuilder_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkBuilder_queueautoptr = o
  extension (v: GtkBuilder_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkBuilder_slistautoptr = Ptr[GSList]
object GtkBuilder_slistautoptr: 
  given _tag: Tag[GtkBuilder_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkBuilder_slistautoptr = o
  extension (v: GtkBuilder_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkButton_autoptr = Ptr[GtkButton]
object GtkButton_autoptr: 
  given _tag: Tag[GtkButton_autoptr] = Tag.Ptr[GtkButton](GtkButton._tag)
  inline def apply(inline o: Ptr[GtkButton]): GtkButton_autoptr = o
  extension (v: GtkButton_autoptr)
    inline def value: Ptr[GtkButton] = v

opaque type GtkButton_listautoptr = Ptr[GList]
object GtkButton_listautoptr: 
  given _tag: Tag[GtkButton_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkButton_listautoptr = o
  extension (v: GtkButton_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkButton_queueautoptr = Ptr[GQueue]
object GtkButton_queueautoptr: 
  given _tag: Tag[GtkButton_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkButton_queueautoptr = o
  extension (v: GtkButton_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkButton_slistautoptr = Ptr[GSList]
object GtkButton_slistautoptr: 
  given _tag: Tag[GtkButton_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkButton_slistautoptr = o
  extension (v: GtkButton_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkCalendar_autoptr = Ptr[GtkCalendar]
object GtkCalendar_autoptr: 
  given _tag: Tag[GtkCalendar_autoptr] = Tag.Ptr[GtkCalendar](GtkCalendar._tag)
  inline def apply(inline o: Ptr[GtkCalendar]): GtkCalendar_autoptr = o
  extension (v: GtkCalendar_autoptr)
    inline def value: Ptr[GtkCalendar] = v

opaque type GtkCalendar_listautoptr = Ptr[GList]
object GtkCalendar_listautoptr: 
  given _tag: Tag[GtkCalendar_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkCalendar_listautoptr = o
  extension (v: GtkCalendar_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkCalendar_queueautoptr = Ptr[GQueue]
object GtkCalendar_queueautoptr: 
  given _tag: Tag[GtkCalendar_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkCalendar_queueautoptr = o
  extension (v: GtkCalendar_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkCalendar_slistautoptr = Ptr[GSList]
object GtkCalendar_slistautoptr: 
  given _tag: Tag[GtkCalendar_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkCalendar_slistautoptr = o
  extension (v: GtkCalendar_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkCallbackActionClass_autoptr = Ptr[GtkCallbackActionClass]
object GtkCallbackActionClass_autoptr: 
  given _tag: Tag[GtkCallbackActionClass_autoptr] = Tag.Ptr[GtkCallbackActionClass](GtkCallbackActionClass._tag)
  inline def apply(inline o: Ptr[GtkCallbackActionClass]): GtkCallbackActionClass_autoptr = o
  extension (v: GtkCallbackActionClass_autoptr)
    inline def value: Ptr[GtkCallbackActionClass] = v

opaque type GtkCallbackActionClass_listautoptr = Ptr[GList]
object GtkCallbackActionClass_listautoptr: 
  given _tag: Tag[GtkCallbackActionClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkCallbackActionClass_listautoptr = o
  extension (v: GtkCallbackActionClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkCallbackActionClass_queueautoptr = Ptr[GQueue]
object GtkCallbackActionClass_queueautoptr: 
  given _tag: Tag[GtkCallbackActionClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkCallbackActionClass_queueautoptr = o
  extension (v: GtkCallbackActionClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkCallbackActionClass_slistautoptr = Ptr[GSList]
object GtkCallbackActionClass_slistautoptr: 
  given _tag: Tag[GtkCallbackActionClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkCallbackActionClass_slistautoptr = o
  extension (v: GtkCallbackActionClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkCallbackAction_autoptr = Ptr[GtkCallbackAction]
object GtkCallbackAction_autoptr: 
  given _tag: Tag[GtkCallbackAction_autoptr] = Tag.Ptr[GtkCallbackAction](GtkCallbackAction._tag)
  inline def apply(inline o: Ptr[GtkCallbackAction]): GtkCallbackAction_autoptr = o
  extension (v: GtkCallbackAction_autoptr)
    inline def value: Ptr[GtkCallbackAction] = v

opaque type GtkCallbackAction_listautoptr = Ptr[GList]
object GtkCallbackAction_listautoptr: 
  given _tag: Tag[GtkCallbackAction_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkCallbackAction_listautoptr = o
  extension (v: GtkCallbackAction_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkCallbackAction_queueautoptr = Ptr[GQueue]
object GtkCallbackAction_queueautoptr: 
  given _tag: Tag[GtkCallbackAction_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkCallbackAction_queueautoptr = o
  extension (v: GtkCallbackAction_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkCallbackAction_slistautoptr = Ptr[GSList]
object GtkCallbackAction_slistautoptr: 
  given _tag: Tag[GtkCallbackAction_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkCallbackAction_slistautoptr = o
  extension (v: GtkCallbackAction_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkCellAllocCallback = CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GdkRectangle], Ptr[GdkRectangle], gpointer, gboolean]
object GtkCellAllocCallback: 
  given _tag: Tag[GtkCellAllocCallback] = Tag.materializeCFuncPtr4[Ptr[GtkCellRenderer], Ptr[GdkRectangle], Ptr[GdkRectangle], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GdkRectangle], Ptr[GdkRectangle], gpointer, gboolean]): GtkCellAllocCallback = o
  extension (v: GtkCellAllocCallback)
    inline def value: CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GdkRectangle], Ptr[GdkRectangle], gpointer, gboolean] = v

opaque type GtkCellAreaBox_autoptr = Ptr[GtkCellAreaBox]
object GtkCellAreaBox_autoptr: 
  given _tag: Tag[GtkCellAreaBox_autoptr] = Tag.Ptr[GtkCellAreaBox](GtkCellAreaBox._tag)
  inline def apply(inline o: Ptr[GtkCellAreaBox]): GtkCellAreaBox_autoptr = o
  extension (v: GtkCellAreaBox_autoptr)
    inline def value: Ptr[GtkCellAreaBox] = v

opaque type GtkCellAreaBox_listautoptr = Ptr[GList]
object GtkCellAreaBox_listautoptr: 
  given _tag: Tag[GtkCellAreaBox_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkCellAreaBox_listautoptr = o
  extension (v: GtkCellAreaBox_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkCellAreaBox_queueautoptr = Ptr[GQueue]
object GtkCellAreaBox_queueautoptr: 
  given _tag: Tag[GtkCellAreaBox_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkCellAreaBox_queueautoptr = o
  extension (v: GtkCellAreaBox_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkCellAreaBox_slistautoptr = Ptr[GSList]
object GtkCellAreaBox_slistautoptr: 
  given _tag: Tag[GtkCellAreaBox_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkCellAreaBox_slistautoptr = o
  extension (v: GtkCellAreaBox_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkCellAreaContext_autoptr = Ptr[GtkCellAreaContext]
object GtkCellAreaContext_autoptr: 
  given _tag: Tag[GtkCellAreaContext_autoptr] = Tag.Ptr[GtkCellAreaContext](GtkCellAreaContext._tag)
  inline def apply(inline o: Ptr[GtkCellAreaContext]): GtkCellAreaContext_autoptr = o
  extension (v: GtkCellAreaContext_autoptr)
    inline def value: Ptr[GtkCellAreaContext] = v

opaque type GtkCellAreaContext_listautoptr = Ptr[GList]
object GtkCellAreaContext_listautoptr: 
  given _tag: Tag[GtkCellAreaContext_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkCellAreaContext_listautoptr = o
  extension (v: GtkCellAreaContext_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkCellAreaContext_queueautoptr = Ptr[GQueue]
object GtkCellAreaContext_queueautoptr: 
  given _tag: Tag[GtkCellAreaContext_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkCellAreaContext_queueautoptr = o
  extension (v: GtkCellAreaContext_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkCellAreaContext_slistautoptr = Ptr[GSList]
object GtkCellAreaContext_slistautoptr: 
  given _tag: Tag[GtkCellAreaContext_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkCellAreaContext_slistautoptr = o
  extension (v: GtkCellAreaContext_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkCellArea_autoptr = Ptr[GtkCellArea]
object GtkCellArea_autoptr: 
  given _tag: Tag[GtkCellArea_autoptr] = Tag.Ptr[GtkCellArea](GtkCellArea._tag)
  inline def apply(inline o: Ptr[GtkCellArea]): GtkCellArea_autoptr = o
  extension (v: GtkCellArea_autoptr)
    inline def value: Ptr[GtkCellArea] = v

opaque type GtkCellArea_listautoptr = Ptr[GList]
object GtkCellArea_listautoptr: 
  given _tag: Tag[GtkCellArea_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkCellArea_listautoptr = o
  extension (v: GtkCellArea_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkCellArea_queueautoptr = Ptr[GQueue]
object GtkCellArea_queueautoptr: 
  given _tag: Tag[GtkCellArea_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkCellArea_queueautoptr = o
  extension (v: GtkCellArea_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkCellArea_slistautoptr = Ptr[GSList]
object GtkCellArea_slistautoptr: 
  given _tag: Tag[GtkCellArea_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkCellArea_slistautoptr = o
  extension (v: GtkCellArea_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkCellCallback = CFuncPtr2[Ptr[GtkCellRenderer], gpointer, gboolean]
object GtkCellCallback: 
  given _tag: Tag[GtkCellCallback] = Tag.materializeCFuncPtr2[Ptr[GtkCellRenderer], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr2[Ptr[GtkCellRenderer], gpointer, gboolean]): GtkCellCallback = o
  extension (v: GtkCellCallback)
    inline def value: CFuncPtr2[Ptr[GtkCellRenderer], gpointer, gboolean] = v

opaque type GtkCellEditable_autoptr = Ptr[GtkCellEditable]
object GtkCellEditable_autoptr: 
  given _tag: Tag[GtkCellEditable_autoptr] = Tag.Ptr[GtkCellEditable](GtkCellEditable._tag)
  inline def apply(inline o: Ptr[GtkCellEditable]): GtkCellEditable_autoptr = o
  extension (v: GtkCellEditable_autoptr)
    inline def value: Ptr[GtkCellEditable] = v

opaque type GtkCellEditable_listautoptr = Ptr[GList]
object GtkCellEditable_listautoptr: 
  given _tag: Tag[GtkCellEditable_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkCellEditable_listautoptr = o
  extension (v: GtkCellEditable_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkCellEditable_queueautoptr = Ptr[GQueue]
object GtkCellEditable_queueautoptr: 
  given _tag: Tag[GtkCellEditable_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkCellEditable_queueautoptr = o
  extension (v: GtkCellEditable_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkCellEditable_slistautoptr = Ptr[GSList]
object GtkCellEditable_slistautoptr: 
  given _tag: Tag[GtkCellEditable_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkCellEditable_slistautoptr = o
  extension (v: GtkCellEditable_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkCellLayoutDataFunc = CFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], gpointer, Unit]
object GtkCellLayoutDataFunc: 
  given _tag: Tag[GtkCellLayoutDataFunc] = Tag.materializeCFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], gpointer, Unit]
  inline def apply(inline o: CFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], gpointer, Unit]): GtkCellLayoutDataFunc = o
  extension (v: GtkCellLayoutDataFunc)
    inline def value: CFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], gpointer, Unit] = v

opaque type GtkCellLayout_autoptr = Ptr[GtkCellLayout]
object GtkCellLayout_autoptr: 
  given _tag: Tag[GtkCellLayout_autoptr] = Tag.Ptr[GtkCellLayout](GtkCellLayout._tag)
  inline def apply(inline o: Ptr[GtkCellLayout]): GtkCellLayout_autoptr = o
  extension (v: GtkCellLayout_autoptr)
    inline def value: Ptr[GtkCellLayout] = v

opaque type GtkCellLayout_listautoptr = Ptr[GList]
object GtkCellLayout_listautoptr: 
  given _tag: Tag[GtkCellLayout_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkCellLayout_listautoptr = o
  extension (v: GtkCellLayout_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkCellLayout_queueautoptr = Ptr[GQueue]
object GtkCellLayout_queueautoptr: 
  given _tag: Tag[GtkCellLayout_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkCellLayout_queueautoptr = o
  extension (v: GtkCellLayout_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkCellLayout_slistautoptr = Ptr[GSList]
object GtkCellLayout_slistautoptr: 
  given _tag: Tag[GtkCellLayout_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkCellLayout_slistautoptr = o
  extension (v: GtkCellLayout_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkCellRendererAccel_autoptr = Ptr[GtkCellRendererAccel]
object GtkCellRendererAccel_autoptr: 
  given _tag: Tag[GtkCellRendererAccel_autoptr] = Tag.Ptr[GtkCellRendererAccel](GtkCellRendererAccel._tag)
  inline def apply(inline o: Ptr[GtkCellRendererAccel]): GtkCellRendererAccel_autoptr = o
  extension (v: GtkCellRendererAccel_autoptr)
    inline def value: Ptr[GtkCellRendererAccel] = v

opaque type GtkCellRendererAccel_listautoptr = Ptr[GList]
object GtkCellRendererAccel_listautoptr: 
  given _tag: Tag[GtkCellRendererAccel_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkCellRendererAccel_listautoptr = o
  extension (v: GtkCellRendererAccel_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkCellRendererAccel_queueautoptr = Ptr[GQueue]
object GtkCellRendererAccel_queueautoptr: 
  given _tag: Tag[GtkCellRendererAccel_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkCellRendererAccel_queueautoptr = o
  extension (v: GtkCellRendererAccel_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkCellRendererAccel_slistautoptr = Ptr[GSList]
object GtkCellRendererAccel_slistautoptr: 
  given _tag: Tag[GtkCellRendererAccel_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkCellRendererAccel_slistautoptr = o
  extension (v: GtkCellRendererAccel_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkCellRendererCombo_autoptr = Ptr[GtkCellRendererCombo]
object GtkCellRendererCombo_autoptr: 
  given _tag: Tag[GtkCellRendererCombo_autoptr] = Tag.Ptr[GtkCellRendererCombo](GtkCellRendererCombo._tag)
  inline def apply(inline o: Ptr[GtkCellRendererCombo]): GtkCellRendererCombo_autoptr = o
  extension (v: GtkCellRendererCombo_autoptr)
    inline def value: Ptr[GtkCellRendererCombo] = v

opaque type GtkCellRendererCombo_listautoptr = Ptr[GList]
object GtkCellRendererCombo_listautoptr: 
  given _tag: Tag[GtkCellRendererCombo_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkCellRendererCombo_listautoptr = o
  extension (v: GtkCellRendererCombo_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkCellRendererCombo_queueautoptr = Ptr[GQueue]
object GtkCellRendererCombo_queueautoptr: 
  given _tag: Tag[GtkCellRendererCombo_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkCellRendererCombo_queueautoptr = o
  extension (v: GtkCellRendererCombo_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkCellRendererCombo_slistautoptr = Ptr[GSList]
object GtkCellRendererCombo_slistautoptr: 
  given _tag: Tag[GtkCellRendererCombo_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkCellRendererCombo_slistautoptr = o
  extension (v: GtkCellRendererCombo_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkCellRendererPixbuf_autoptr = Ptr[GtkCellRendererPixbuf]
object GtkCellRendererPixbuf_autoptr: 
  given _tag: Tag[GtkCellRendererPixbuf_autoptr] = Tag.Ptr[GtkCellRendererPixbuf](GtkCellRendererPixbuf._tag)
  inline def apply(inline o: Ptr[GtkCellRendererPixbuf]): GtkCellRendererPixbuf_autoptr = o
  extension (v: GtkCellRendererPixbuf_autoptr)
    inline def value: Ptr[GtkCellRendererPixbuf] = v

opaque type GtkCellRendererPixbuf_listautoptr = Ptr[GList]
object GtkCellRendererPixbuf_listautoptr: 
  given _tag: Tag[GtkCellRendererPixbuf_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkCellRendererPixbuf_listautoptr = o
  extension (v: GtkCellRendererPixbuf_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkCellRendererPixbuf_queueautoptr = Ptr[GQueue]
object GtkCellRendererPixbuf_queueautoptr: 
  given _tag: Tag[GtkCellRendererPixbuf_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkCellRendererPixbuf_queueautoptr = o
  extension (v: GtkCellRendererPixbuf_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkCellRendererPixbuf_slistautoptr = Ptr[GSList]
object GtkCellRendererPixbuf_slistautoptr: 
  given _tag: Tag[GtkCellRendererPixbuf_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkCellRendererPixbuf_slistautoptr = o
  extension (v: GtkCellRendererPixbuf_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkCellRendererProgress_autoptr = Ptr[GtkCellRendererProgress]
object GtkCellRendererProgress_autoptr: 
  given _tag: Tag[GtkCellRendererProgress_autoptr] = Tag.Ptr[GtkCellRendererProgress](GtkCellRendererProgress._tag)
  inline def apply(inline o: Ptr[GtkCellRendererProgress]): GtkCellRendererProgress_autoptr = o
  extension (v: GtkCellRendererProgress_autoptr)
    inline def value: Ptr[GtkCellRendererProgress] = v

opaque type GtkCellRendererProgress_listautoptr = Ptr[GList]
object GtkCellRendererProgress_listautoptr: 
  given _tag: Tag[GtkCellRendererProgress_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkCellRendererProgress_listautoptr = o
  extension (v: GtkCellRendererProgress_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkCellRendererProgress_queueautoptr = Ptr[GQueue]
object GtkCellRendererProgress_queueautoptr: 
  given _tag: Tag[GtkCellRendererProgress_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkCellRendererProgress_queueautoptr = o
  extension (v: GtkCellRendererProgress_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkCellRendererProgress_slistautoptr = Ptr[GSList]
object GtkCellRendererProgress_slistautoptr: 
  given _tag: Tag[GtkCellRendererProgress_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkCellRendererProgress_slistautoptr = o
  extension (v: GtkCellRendererProgress_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkCellRendererSpin_autoptr = Ptr[GtkCellRendererSpin]
object GtkCellRendererSpin_autoptr: 
  given _tag: Tag[GtkCellRendererSpin_autoptr] = Tag.Ptr[GtkCellRendererSpin](GtkCellRendererSpin._tag)
  inline def apply(inline o: Ptr[GtkCellRendererSpin]): GtkCellRendererSpin_autoptr = o
  extension (v: GtkCellRendererSpin_autoptr)
    inline def value: Ptr[GtkCellRendererSpin] = v

opaque type GtkCellRendererSpin_listautoptr = Ptr[GList]
object GtkCellRendererSpin_listautoptr: 
  given _tag: Tag[GtkCellRendererSpin_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkCellRendererSpin_listautoptr = o
  extension (v: GtkCellRendererSpin_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkCellRendererSpin_queueautoptr = Ptr[GQueue]
object GtkCellRendererSpin_queueautoptr: 
  given _tag: Tag[GtkCellRendererSpin_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkCellRendererSpin_queueautoptr = o
  extension (v: GtkCellRendererSpin_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkCellRendererSpin_slistautoptr = Ptr[GSList]
object GtkCellRendererSpin_slistautoptr: 
  given _tag: Tag[GtkCellRendererSpin_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkCellRendererSpin_slistautoptr = o
  extension (v: GtkCellRendererSpin_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkCellRendererSpinner_autoptr = Ptr[GtkCellRendererSpinner]
object GtkCellRendererSpinner_autoptr: 
  given _tag: Tag[GtkCellRendererSpinner_autoptr] = Tag.Ptr[GtkCellRendererSpinner](GtkCellRendererSpinner._tag)
  inline def apply(inline o: Ptr[GtkCellRendererSpinner]): GtkCellRendererSpinner_autoptr = o
  extension (v: GtkCellRendererSpinner_autoptr)
    inline def value: Ptr[GtkCellRendererSpinner] = v

opaque type GtkCellRendererSpinner_listautoptr = Ptr[GList]
object GtkCellRendererSpinner_listautoptr: 
  given _tag: Tag[GtkCellRendererSpinner_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkCellRendererSpinner_listautoptr = o
  extension (v: GtkCellRendererSpinner_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkCellRendererSpinner_queueautoptr = Ptr[GQueue]
object GtkCellRendererSpinner_queueautoptr: 
  given _tag: Tag[GtkCellRendererSpinner_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkCellRendererSpinner_queueautoptr = o
  extension (v: GtkCellRendererSpinner_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkCellRendererSpinner_slistautoptr = Ptr[GSList]
object GtkCellRendererSpinner_slistautoptr: 
  given _tag: Tag[GtkCellRendererSpinner_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkCellRendererSpinner_slistautoptr = o
  extension (v: GtkCellRendererSpinner_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkCellRendererText_autoptr = Ptr[GtkCellRendererText]
object GtkCellRendererText_autoptr: 
  given _tag: Tag[GtkCellRendererText_autoptr] = Tag.Ptr[GtkCellRendererText](GtkCellRendererText._tag)
  inline def apply(inline o: Ptr[GtkCellRendererText]): GtkCellRendererText_autoptr = o
  extension (v: GtkCellRendererText_autoptr)
    inline def value: Ptr[GtkCellRendererText] = v

opaque type GtkCellRendererText_listautoptr = Ptr[GList]
object GtkCellRendererText_listautoptr: 
  given _tag: Tag[GtkCellRendererText_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkCellRendererText_listautoptr = o
  extension (v: GtkCellRendererText_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkCellRendererText_queueautoptr = Ptr[GQueue]
object GtkCellRendererText_queueautoptr: 
  given _tag: Tag[GtkCellRendererText_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkCellRendererText_queueautoptr = o
  extension (v: GtkCellRendererText_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkCellRendererText_slistautoptr = Ptr[GSList]
object GtkCellRendererText_slistautoptr: 
  given _tag: Tag[GtkCellRendererText_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkCellRendererText_slistautoptr = o
  extension (v: GtkCellRendererText_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkCellRendererToggle_autoptr = Ptr[GtkCellRendererToggle]
object GtkCellRendererToggle_autoptr: 
  given _tag: Tag[GtkCellRendererToggle_autoptr] = Tag.Ptr[GtkCellRendererToggle](GtkCellRendererToggle._tag)
  inline def apply(inline o: Ptr[GtkCellRendererToggle]): GtkCellRendererToggle_autoptr = o
  extension (v: GtkCellRendererToggle_autoptr)
    inline def value: Ptr[GtkCellRendererToggle] = v

opaque type GtkCellRendererToggle_listautoptr = Ptr[GList]
object GtkCellRendererToggle_listautoptr: 
  given _tag: Tag[GtkCellRendererToggle_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkCellRendererToggle_listautoptr = o
  extension (v: GtkCellRendererToggle_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkCellRendererToggle_queueautoptr = Ptr[GQueue]
object GtkCellRendererToggle_queueautoptr: 
  given _tag: Tag[GtkCellRendererToggle_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkCellRendererToggle_queueautoptr = o
  extension (v: GtkCellRendererToggle_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkCellRendererToggle_slistautoptr = Ptr[GSList]
object GtkCellRendererToggle_slistautoptr: 
  given _tag: Tag[GtkCellRendererToggle_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkCellRendererToggle_slistautoptr = o
  extension (v: GtkCellRendererToggle_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkCellRenderer_autoptr = Ptr[GtkCellRenderer]
object GtkCellRenderer_autoptr: 
  given _tag: Tag[GtkCellRenderer_autoptr] = Tag.Ptr[GtkCellRenderer](GtkCellRenderer._tag)
  inline def apply(inline o: Ptr[GtkCellRenderer]): GtkCellRenderer_autoptr = o
  extension (v: GtkCellRenderer_autoptr)
    inline def value: Ptr[GtkCellRenderer] = v

opaque type GtkCellRenderer_listautoptr = Ptr[GList]
object GtkCellRenderer_listautoptr: 
  given _tag: Tag[GtkCellRenderer_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkCellRenderer_listautoptr = o
  extension (v: GtkCellRenderer_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkCellRenderer_queueautoptr = Ptr[GQueue]
object GtkCellRenderer_queueautoptr: 
  given _tag: Tag[GtkCellRenderer_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkCellRenderer_queueautoptr = o
  extension (v: GtkCellRenderer_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkCellRenderer_slistautoptr = Ptr[GSList]
object GtkCellRenderer_slistautoptr: 
  given _tag: Tag[GtkCellRenderer_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkCellRenderer_slistautoptr = o
  extension (v: GtkCellRenderer_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkCellView_autoptr = Ptr[GtkCellView]
object GtkCellView_autoptr: 
  given _tag: Tag[GtkCellView_autoptr] = Tag.Ptr[GtkCellView](GtkCellView._tag)
  inline def apply(inline o: Ptr[GtkCellView]): GtkCellView_autoptr = o
  extension (v: GtkCellView_autoptr)
    inline def value: Ptr[GtkCellView] = v

opaque type GtkCellView_listautoptr = Ptr[GList]
object GtkCellView_listautoptr: 
  given _tag: Tag[GtkCellView_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkCellView_listautoptr = o
  extension (v: GtkCellView_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkCellView_queueautoptr = Ptr[GQueue]
object GtkCellView_queueautoptr: 
  given _tag: Tag[GtkCellView_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkCellView_queueautoptr = o
  extension (v: GtkCellView_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkCellView_slistautoptr = Ptr[GSList]
object GtkCellView_slistautoptr: 
  given _tag: Tag[GtkCellView_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkCellView_slistautoptr = o
  extension (v: GtkCellView_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkCenterLayoutClass_autoptr = Ptr[GtkCenterLayoutClass]
object GtkCenterLayoutClass_autoptr: 
  given _tag: Tag[GtkCenterLayoutClass_autoptr] = Tag.Ptr[GtkCenterLayoutClass](GtkCenterLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkCenterLayoutClass]): GtkCenterLayoutClass_autoptr = o
  extension (v: GtkCenterLayoutClass_autoptr)
    inline def value: Ptr[GtkCenterLayoutClass] = v

opaque type GtkCenterLayoutClass_listautoptr = Ptr[GList]
object GtkCenterLayoutClass_listautoptr: 
  given _tag: Tag[GtkCenterLayoutClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkCenterLayoutClass_listautoptr = o
  extension (v: GtkCenterLayoutClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkCenterLayoutClass_queueautoptr = Ptr[GQueue]
object GtkCenterLayoutClass_queueautoptr: 
  given _tag: Tag[GtkCenterLayoutClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkCenterLayoutClass_queueautoptr = o
  extension (v: GtkCenterLayoutClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkCenterLayoutClass_slistautoptr = Ptr[GSList]
object GtkCenterLayoutClass_slistautoptr: 
  given _tag: Tag[GtkCenterLayoutClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkCenterLayoutClass_slistautoptr = o
  extension (v: GtkCenterLayoutClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkCenterLayout_autoptr = Ptr[GtkCenterLayout]
object GtkCenterLayout_autoptr: 
  given _tag: Tag[GtkCenterLayout_autoptr] = Tag.Ptr[GtkCenterLayout](GtkCenterLayout._tag)
  inline def apply(inline o: Ptr[GtkCenterLayout]): GtkCenterLayout_autoptr = o
  extension (v: GtkCenterLayout_autoptr)
    inline def value: Ptr[GtkCenterLayout] = v

opaque type GtkCenterLayout_listautoptr = Ptr[GList]
object GtkCenterLayout_listautoptr: 
  given _tag: Tag[GtkCenterLayout_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkCenterLayout_listautoptr = o
  extension (v: GtkCenterLayout_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkCenterLayout_queueautoptr = Ptr[GQueue]
object GtkCenterLayout_queueautoptr: 
  given _tag: Tag[GtkCenterLayout_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkCenterLayout_queueautoptr = o
  extension (v: GtkCenterLayout_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkCenterLayout_slistautoptr = Ptr[GSList]
object GtkCenterLayout_slistautoptr: 
  given _tag: Tag[GtkCenterLayout_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkCenterLayout_slistautoptr = o
  extension (v: GtkCenterLayout_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkCheckButton_autoptr = Ptr[GtkCheckButton]
object GtkCheckButton_autoptr: 
  given _tag: Tag[GtkCheckButton_autoptr] = Tag.Ptr[GtkCheckButton](GtkCheckButton._tag)
  inline def apply(inline o: Ptr[GtkCheckButton]): GtkCheckButton_autoptr = o
  extension (v: GtkCheckButton_autoptr)
    inline def value: Ptr[GtkCheckButton] = v

opaque type GtkCheckButton_listautoptr = Ptr[GList]
object GtkCheckButton_listautoptr: 
  given _tag: Tag[GtkCheckButton_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkCheckButton_listautoptr = o
  extension (v: GtkCheckButton_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkCheckButton_queueautoptr = Ptr[GQueue]
object GtkCheckButton_queueautoptr: 
  given _tag: Tag[GtkCheckButton_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkCheckButton_queueautoptr = o
  extension (v: GtkCheckButton_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkCheckButton_slistautoptr = Ptr[GSList]
object GtkCheckButton_slistautoptr: 
  given _tag: Tag[GtkCheckButton_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkCheckButton_slistautoptr = o
  extension (v: GtkCheckButton_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkColorButton_autoptr = Ptr[GtkColorButton]
object GtkColorButton_autoptr: 
  given _tag: Tag[GtkColorButton_autoptr] = Tag.Ptr[GtkColorButton](GtkColorButton._tag)
  inline def apply(inline o: Ptr[GtkColorButton]): GtkColorButton_autoptr = o
  extension (v: GtkColorButton_autoptr)
    inline def value: Ptr[GtkColorButton] = v

opaque type GtkColorButton_listautoptr = Ptr[GList]
object GtkColorButton_listautoptr: 
  given _tag: Tag[GtkColorButton_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkColorButton_listautoptr = o
  extension (v: GtkColorButton_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkColorButton_queueautoptr = Ptr[GQueue]
object GtkColorButton_queueautoptr: 
  given _tag: Tag[GtkColorButton_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkColorButton_queueautoptr = o
  extension (v: GtkColorButton_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkColorButton_slistautoptr = Ptr[GSList]
object GtkColorButton_slistautoptr: 
  given _tag: Tag[GtkColorButton_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkColorButton_slistautoptr = o
  extension (v: GtkColorButton_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkColorChooserDialog_autoptr = Ptr[GtkColorChooserDialog]
object GtkColorChooserDialog_autoptr: 
  given _tag: Tag[GtkColorChooserDialog_autoptr] = Tag.Ptr[GtkColorChooserDialog](GtkColorChooserDialog._tag)
  inline def apply(inline o: Ptr[GtkColorChooserDialog]): GtkColorChooserDialog_autoptr = o
  extension (v: GtkColorChooserDialog_autoptr)
    inline def value: Ptr[GtkColorChooserDialog] = v

opaque type GtkColorChooserDialog_listautoptr = Ptr[GList]
object GtkColorChooserDialog_listautoptr: 
  given _tag: Tag[GtkColorChooserDialog_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkColorChooserDialog_listautoptr = o
  extension (v: GtkColorChooserDialog_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkColorChooserDialog_queueautoptr = Ptr[GQueue]
object GtkColorChooserDialog_queueautoptr: 
  given _tag: Tag[GtkColorChooserDialog_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkColorChooserDialog_queueautoptr = o
  extension (v: GtkColorChooserDialog_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkColorChooserDialog_slistautoptr = Ptr[GSList]
object GtkColorChooserDialog_slistautoptr: 
  given _tag: Tag[GtkColorChooserDialog_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkColorChooserDialog_slistautoptr = o
  extension (v: GtkColorChooserDialog_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkColorChooserWidget_autoptr = Ptr[GtkColorChooserWidget]
object GtkColorChooserWidget_autoptr: 
  given _tag: Tag[GtkColorChooserWidget_autoptr] = Tag.Ptr[GtkColorChooserWidget](GtkColorChooserWidget._tag)
  inline def apply(inline o: Ptr[GtkColorChooserWidget]): GtkColorChooserWidget_autoptr = o
  extension (v: GtkColorChooserWidget_autoptr)
    inline def value: Ptr[GtkColorChooserWidget] = v

opaque type GtkColorChooserWidget_listautoptr = Ptr[GList]
object GtkColorChooserWidget_listautoptr: 
  given _tag: Tag[GtkColorChooserWidget_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkColorChooserWidget_listautoptr = o
  extension (v: GtkColorChooserWidget_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkColorChooserWidget_queueautoptr = Ptr[GQueue]
object GtkColorChooserWidget_queueautoptr: 
  given _tag: Tag[GtkColorChooserWidget_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkColorChooserWidget_queueautoptr = o
  extension (v: GtkColorChooserWidget_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkColorChooserWidget_slistautoptr = Ptr[GSList]
object GtkColorChooserWidget_slistautoptr: 
  given _tag: Tag[GtkColorChooserWidget_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkColorChooserWidget_slistautoptr = o
  extension (v: GtkColorChooserWidget_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkColorChooser_autoptr = Ptr[GtkColorChooser]
object GtkColorChooser_autoptr: 
  given _tag: Tag[GtkColorChooser_autoptr] = Tag.Ptr[GtkColorChooser](GtkColorChooser._tag)
  inline def apply(inline o: Ptr[GtkColorChooser]): GtkColorChooser_autoptr = o
  extension (v: GtkColorChooser_autoptr)
    inline def value: Ptr[GtkColorChooser] = v

opaque type GtkColorChooser_listautoptr = Ptr[GList]
object GtkColorChooser_listautoptr: 
  given _tag: Tag[GtkColorChooser_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkColorChooser_listautoptr = o
  extension (v: GtkColorChooser_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkColorChooser_queueautoptr = Ptr[GQueue]
object GtkColorChooser_queueautoptr: 
  given _tag: Tag[GtkColorChooser_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkColorChooser_queueautoptr = o
  extension (v: GtkColorChooser_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkColorChooser_slistautoptr = Ptr[GSList]
object GtkColorChooser_slistautoptr: 
  given _tag: Tag[GtkColorChooser_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkColorChooser_slistautoptr = o
  extension (v: GtkColorChooser_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkColumnViewColumn_autoptr = Ptr[GtkColumnViewColumn]
object GtkColumnViewColumn_autoptr: 
  given _tag: Tag[GtkColumnViewColumn_autoptr] = Tag.Ptr[GtkColumnViewColumn](GtkColumnViewColumn._tag)
  inline def apply(inline o: Ptr[GtkColumnViewColumn]): GtkColumnViewColumn_autoptr = o
  extension (v: GtkColumnViewColumn_autoptr)
    inline def value: Ptr[GtkColumnViewColumn] = v

opaque type GtkColumnViewColumn_listautoptr = Ptr[GList]
object GtkColumnViewColumn_listautoptr: 
  given _tag: Tag[GtkColumnViewColumn_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkColumnViewColumn_listautoptr = o
  extension (v: GtkColumnViewColumn_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkColumnViewColumn_queueautoptr = Ptr[GQueue]
object GtkColumnViewColumn_queueautoptr: 
  given _tag: Tag[GtkColumnViewColumn_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkColumnViewColumn_queueautoptr = o
  extension (v: GtkColumnViewColumn_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkColumnViewColumn_slistautoptr = Ptr[GSList]
object GtkColumnViewColumn_slistautoptr: 
  given _tag: Tag[GtkColumnViewColumn_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkColumnViewColumn_slistautoptr = o
  extension (v: GtkColumnViewColumn_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkComboBoxText_autoptr = Ptr[GtkComboBoxText]
object GtkComboBoxText_autoptr: 
  given _tag: Tag[GtkComboBoxText_autoptr] = Tag.Ptr[GtkComboBoxText](GtkComboBoxText._tag)
  inline def apply(inline o: Ptr[GtkComboBoxText]): GtkComboBoxText_autoptr = o
  extension (v: GtkComboBoxText_autoptr)
    inline def value: Ptr[GtkComboBoxText] = v

opaque type GtkComboBoxText_listautoptr = Ptr[GList]
object GtkComboBoxText_listautoptr: 
  given _tag: Tag[GtkComboBoxText_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkComboBoxText_listautoptr = o
  extension (v: GtkComboBoxText_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkComboBoxText_queueautoptr = Ptr[GQueue]
object GtkComboBoxText_queueautoptr: 
  given _tag: Tag[GtkComboBoxText_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkComboBoxText_queueautoptr = o
  extension (v: GtkComboBoxText_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkComboBoxText_slistautoptr = Ptr[GSList]
object GtkComboBoxText_slistautoptr: 
  given _tag: Tag[GtkComboBoxText_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkComboBoxText_slistautoptr = o
  extension (v: GtkComboBoxText_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkComboBox_autoptr = Ptr[GtkComboBox]
object GtkComboBox_autoptr: 
  given _tag: Tag[GtkComboBox_autoptr] = Tag.Ptr[GtkComboBox](GtkComboBox._tag)
  inline def apply(inline o: Ptr[GtkComboBox]): GtkComboBox_autoptr = o
  extension (v: GtkComboBox_autoptr)
    inline def value: Ptr[GtkComboBox] = v

opaque type GtkComboBox_listautoptr = Ptr[GList]
object GtkComboBox_listautoptr: 
  given _tag: Tag[GtkComboBox_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkComboBox_listautoptr = o
  extension (v: GtkComboBox_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkComboBox_queueautoptr = Ptr[GQueue]
object GtkComboBox_queueautoptr: 
  given _tag: Tag[GtkComboBox_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkComboBox_queueautoptr = o
  extension (v: GtkComboBox_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkComboBox_slistautoptr = Ptr[GSList]
object GtkComboBox_slistautoptr: 
  given _tag: Tag[GtkComboBox_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkComboBox_slistautoptr = o
  extension (v: GtkComboBox_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkConstraintClass_autoptr = Ptr[GtkConstraintClass]
object GtkConstraintClass_autoptr: 
  given _tag: Tag[GtkConstraintClass_autoptr] = Tag.Ptr[GtkConstraintClass](GtkConstraintClass._tag)
  inline def apply(inline o: Ptr[GtkConstraintClass]): GtkConstraintClass_autoptr = o
  extension (v: GtkConstraintClass_autoptr)
    inline def value: Ptr[GtkConstraintClass] = v

opaque type GtkConstraintClass_listautoptr = Ptr[GList]
object GtkConstraintClass_listautoptr: 
  given _tag: Tag[GtkConstraintClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkConstraintClass_listautoptr = o
  extension (v: GtkConstraintClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkConstraintClass_queueautoptr = Ptr[GQueue]
object GtkConstraintClass_queueautoptr: 
  given _tag: Tag[GtkConstraintClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkConstraintClass_queueautoptr = o
  extension (v: GtkConstraintClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkConstraintClass_slistautoptr = Ptr[GSList]
object GtkConstraintClass_slistautoptr: 
  given _tag: Tag[GtkConstraintClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkConstraintClass_slistautoptr = o
  extension (v: GtkConstraintClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkConstraintGuideClass_autoptr = Ptr[GtkConstraintGuideClass]
object GtkConstraintGuideClass_autoptr: 
  given _tag: Tag[GtkConstraintGuideClass_autoptr] = Tag.Ptr[GtkConstraintGuideClass](GtkConstraintGuideClass._tag)
  inline def apply(inline o: Ptr[GtkConstraintGuideClass]): GtkConstraintGuideClass_autoptr = o
  extension (v: GtkConstraintGuideClass_autoptr)
    inline def value: Ptr[GtkConstraintGuideClass] = v

opaque type GtkConstraintGuideClass_listautoptr = Ptr[GList]
object GtkConstraintGuideClass_listautoptr: 
  given _tag: Tag[GtkConstraintGuideClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkConstraintGuideClass_listautoptr = o
  extension (v: GtkConstraintGuideClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkConstraintGuideClass_queueautoptr = Ptr[GQueue]
object GtkConstraintGuideClass_queueautoptr: 
  given _tag: Tag[GtkConstraintGuideClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkConstraintGuideClass_queueautoptr = o
  extension (v: GtkConstraintGuideClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkConstraintGuideClass_slistautoptr = Ptr[GSList]
object GtkConstraintGuideClass_slistautoptr: 
  given _tag: Tag[GtkConstraintGuideClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkConstraintGuideClass_slistautoptr = o
  extension (v: GtkConstraintGuideClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkConstraintGuide_autoptr = Ptr[GtkConstraintGuide]
object GtkConstraintGuide_autoptr: 
  given _tag: Tag[GtkConstraintGuide_autoptr] = Tag.Ptr[GtkConstraintGuide](GtkConstraintGuide._tag)
  inline def apply(inline o: Ptr[GtkConstraintGuide]): GtkConstraintGuide_autoptr = o
  extension (v: GtkConstraintGuide_autoptr)
    inline def value: Ptr[GtkConstraintGuide] = v

opaque type GtkConstraintGuide_listautoptr = Ptr[GList]
object GtkConstraintGuide_listautoptr: 
  given _tag: Tag[GtkConstraintGuide_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkConstraintGuide_listautoptr = o
  extension (v: GtkConstraintGuide_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkConstraintGuide_queueautoptr = Ptr[GQueue]
object GtkConstraintGuide_queueautoptr: 
  given _tag: Tag[GtkConstraintGuide_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkConstraintGuide_queueautoptr = o
  extension (v: GtkConstraintGuide_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkConstraintGuide_slistautoptr = Ptr[GSList]
object GtkConstraintGuide_slistautoptr: 
  given _tag: Tag[GtkConstraintGuide_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkConstraintGuide_slistautoptr = o
  extension (v: GtkConstraintGuide_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkConstraintLayoutChildClass_autoptr = Ptr[GtkConstraintLayoutChildClass]
object GtkConstraintLayoutChildClass_autoptr: 
  given _tag: Tag[GtkConstraintLayoutChildClass_autoptr] = Tag.Ptr[GtkConstraintLayoutChildClass](GtkConstraintLayoutChildClass._tag)
  inline def apply(inline o: Ptr[GtkConstraintLayoutChildClass]): GtkConstraintLayoutChildClass_autoptr = o
  extension (v: GtkConstraintLayoutChildClass_autoptr)
    inline def value: Ptr[GtkConstraintLayoutChildClass] = v

opaque type GtkConstraintLayoutChildClass_listautoptr = Ptr[GList]
object GtkConstraintLayoutChildClass_listautoptr: 
  given _tag: Tag[GtkConstraintLayoutChildClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkConstraintLayoutChildClass_listautoptr = o
  extension (v: GtkConstraintLayoutChildClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkConstraintLayoutChildClass_queueautoptr = Ptr[GQueue]
object GtkConstraintLayoutChildClass_queueautoptr: 
  given _tag: Tag[GtkConstraintLayoutChildClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkConstraintLayoutChildClass_queueautoptr = o
  extension (v: GtkConstraintLayoutChildClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkConstraintLayoutChildClass_slistautoptr = Ptr[GSList]
object GtkConstraintLayoutChildClass_slistautoptr: 
  given _tag: Tag[GtkConstraintLayoutChildClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkConstraintLayoutChildClass_slistautoptr = o
  extension (v: GtkConstraintLayoutChildClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkConstraintLayoutChild_autoptr = Ptr[GtkConstraintLayoutChild]
object GtkConstraintLayoutChild_autoptr: 
  given _tag: Tag[GtkConstraintLayoutChild_autoptr] = Tag.Ptr[GtkConstraintLayoutChild](GtkConstraintLayoutChild._tag)
  inline def apply(inline o: Ptr[GtkConstraintLayoutChild]): GtkConstraintLayoutChild_autoptr = o
  extension (v: GtkConstraintLayoutChild_autoptr)
    inline def value: Ptr[GtkConstraintLayoutChild] = v

opaque type GtkConstraintLayoutChild_listautoptr = Ptr[GList]
object GtkConstraintLayoutChild_listautoptr: 
  given _tag: Tag[GtkConstraintLayoutChild_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkConstraintLayoutChild_listautoptr = o
  extension (v: GtkConstraintLayoutChild_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkConstraintLayoutChild_queueautoptr = Ptr[GQueue]
object GtkConstraintLayoutChild_queueautoptr: 
  given _tag: Tag[GtkConstraintLayoutChild_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkConstraintLayoutChild_queueautoptr = o
  extension (v: GtkConstraintLayoutChild_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkConstraintLayoutChild_slistautoptr = Ptr[GSList]
object GtkConstraintLayoutChild_slistautoptr: 
  given _tag: Tag[GtkConstraintLayoutChild_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkConstraintLayoutChild_slistautoptr = o
  extension (v: GtkConstraintLayoutChild_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkConstraintLayoutClass_autoptr = Ptr[GtkConstraintLayoutClass]
object GtkConstraintLayoutClass_autoptr: 
  given _tag: Tag[GtkConstraintLayoutClass_autoptr] = Tag.Ptr[GtkConstraintLayoutClass](GtkConstraintLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkConstraintLayoutClass]): GtkConstraintLayoutClass_autoptr = o
  extension (v: GtkConstraintLayoutClass_autoptr)
    inline def value: Ptr[GtkConstraintLayoutClass] = v

opaque type GtkConstraintLayoutClass_listautoptr = Ptr[GList]
object GtkConstraintLayoutClass_listautoptr: 
  given _tag: Tag[GtkConstraintLayoutClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkConstraintLayoutClass_listautoptr = o
  extension (v: GtkConstraintLayoutClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkConstraintLayoutClass_queueautoptr = Ptr[GQueue]
object GtkConstraintLayoutClass_queueautoptr: 
  given _tag: Tag[GtkConstraintLayoutClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkConstraintLayoutClass_queueautoptr = o
  extension (v: GtkConstraintLayoutClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkConstraintLayoutClass_slistautoptr = Ptr[GSList]
object GtkConstraintLayoutClass_slistautoptr: 
  given _tag: Tag[GtkConstraintLayoutClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkConstraintLayoutClass_slistautoptr = o
  extension (v: GtkConstraintLayoutClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkConstraintLayout_autoptr = Ptr[GtkConstraintLayout]
object GtkConstraintLayout_autoptr: 
  given _tag: Tag[GtkConstraintLayout_autoptr] = Tag.Ptr[GtkConstraintLayout](GtkConstraintLayout._tag)
  inline def apply(inline o: Ptr[GtkConstraintLayout]): GtkConstraintLayout_autoptr = o
  extension (v: GtkConstraintLayout_autoptr)
    inline def value: Ptr[GtkConstraintLayout] = v

opaque type GtkConstraintLayout_listautoptr = Ptr[GList]
object GtkConstraintLayout_listautoptr: 
  given _tag: Tag[GtkConstraintLayout_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkConstraintLayout_listautoptr = o
  extension (v: GtkConstraintLayout_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkConstraintLayout_queueautoptr = Ptr[GQueue]
object GtkConstraintLayout_queueautoptr: 
  given _tag: Tag[GtkConstraintLayout_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkConstraintLayout_queueautoptr = o
  extension (v: GtkConstraintLayout_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkConstraintLayout_slistautoptr = Ptr[GSList]
object GtkConstraintLayout_slistautoptr: 
  given _tag: Tag[GtkConstraintLayout_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkConstraintLayout_slistautoptr = o
  extension (v: GtkConstraintLayout_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkConstraintTarget_autoptr = Ptr[GtkConstraintTarget]
object GtkConstraintTarget_autoptr: 
  given _tag: Tag[GtkConstraintTarget_autoptr] = Tag.Ptr[GtkConstraintTarget](GtkConstraintTarget._tag)
  inline def apply(inline o: Ptr[GtkConstraintTarget]): GtkConstraintTarget_autoptr = o
  extension (v: GtkConstraintTarget_autoptr)
    inline def value: Ptr[GtkConstraintTarget] = v

opaque type GtkConstraintTarget_listautoptr = Ptr[GList]
object GtkConstraintTarget_listautoptr: 
  given _tag: Tag[GtkConstraintTarget_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkConstraintTarget_listautoptr = o
  extension (v: GtkConstraintTarget_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkConstraintTarget_queueautoptr = Ptr[GQueue]
object GtkConstraintTarget_queueautoptr: 
  given _tag: Tag[GtkConstraintTarget_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkConstraintTarget_queueautoptr = o
  extension (v: GtkConstraintTarget_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkConstraintTarget_slistautoptr = Ptr[GSList]
object GtkConstraintTarget_slistautoptr: 
  given _tag: Tag[GtkConstraintTarget_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkConstraintTarget_slistautoptr = o
  extension (v: GtkConstraintTarget_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkConstraint_autoptr = Ptr[GtkConstraint]
object GtkConstraint_autoptr: 
  given _tag: Tag[GtkConstraint_autoptr] = Tag.Ptr[GtkConstraint](GtkConstraint._tag)
  inline def apply(inline o: Ptr[GtkConstraint]): GtkConstraint_autoptr = o
  extension (v: GtkConstraint_autoptr)
    inline def value: Ptr[GtkConstraint] = v

opaque type GtkConstraint_listautoptr = Ptr[GList]
object GtkConstraint_listautoptr: 
  given _tag: Tag[GtkConstraint_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkConstraint_listautoptr = o
  extension (v: GtkConstraint_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkConstraint_queueautoptr = Ptr[GQueue]
object GtkConstraint_queueautoptr: 
  given _tag: Tag[GtkConstraint_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkConstraint_queueautoptr = o
  extension (v: GtkConstraint_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkConstraint_slistautoptr = Ptr[GSList]
object GtkConstraint_slistautoptr: 
  given _tag: Tag[GtkConstraint_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkConstraint_slistautoptr = o
  extension (v: GtkConstraint_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkCssProvider_autoptr = Ptr[GtkCssProvider]
object GtkCssProvider_autoptr: 
  given _tag: Tag[GtkCssProvider_autoptr] = Tag.Ptr[GtkCssProvider](GtkCssProvider._tag)
  inline def apply(inline o: Ptr[GtkCssProvider]): GtkCssProvider_autoptr = o
  extension (v: GtkCssProvider_autoptr)
    inline def value: Ptr[GtkCssProvider] = v

opaque type GtkCssProvider_listautoptr = Ptr[GList]
object GtkCssProvider_listautoptr: 
  given _tag: Tag[GtkCssProvider_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkCssProvider_listautoptr = o
  extension (v: GtkCssProvider_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkCssProvider_queueautoptr = Ptr[GQueue]
object GtkCssProvider_queueautoptr: 
  given _tag: Tag[GtkCssProvider_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkCssProvider_queueautoptr = o
  extension (v: GtkCssProvider_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkCssProvider_slistautoptr = Ptr[GSList]
object GtkCssProvider_slistautoptr: 
  given _tag: Tag[GtkCssProvider_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkCssProvider_slistautoptr = o
  extension (v: GtkCssProvider_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkCustomAllocateFunc = CFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit]
object GtkCustomAllocateFunc: 
  given _tag: Tag[GtkCustomAllocateFunc] = Tag.materializeCFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit]
  inline def apply(inline o: CFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit]): GtkCustomAllocateFunc = o
  extension (v: GtkCustomAllocateFunc)
    inline def value: CFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit] = v

opaque type GtkCustomFilterClass_autoptr = Ptr[GtkCustomFilterClass]
object GtkCustomFilterClass_autoptr: 
  given _tag: Tag[GtkCustomFilterClass_autoptr] = Tag.Ptr[GtkCustomFilterClass](GtkCustomFilterClass._tag)
  inline def apply(inline o: Ptr[GtkCustomFilterClass]): GtkCustomFilterClass_autoptr = o
  extension (v: GtkCustomFilterClass_autoptr)
    inline def value: Ptr[GtkCustomFilterClass] = v

opaque type GtkCustomFilterClass_listautoptr = Ptr[GList]
object GtkCustomFilterClass_listautoptr: 
  given _tag: Tag[GtkCustomFilterClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkCustomFilterClass_listautoptr = o
  extension (v: GtkCustomFilterClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkCustomFilterClass_queueautoptr = Ptr[GQueue]
object GtkCustomFilterClass_queueautoptr: 
  given _tag: Tag[GtkCustomFilterClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkCustomFilterClass_queueautoptr = o
  extension (v: GtkCustomFilterClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkCustomFilterClass_slistautoptr = Ptr[GSList]
object GtkCustomFilterClass_slistautoptr: 
  given _tag: Tag[GtkCustomFilterClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkCustomFilterClass_slistautoptr = o
  extension (v: GtkCustomFilterClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkCustomFilterFunc = CFuncPtr2[gpointer, gpointer, gboolean]
object GtkCustomFilterFunc: 
  given _tag: Tag[GtkCustomFilterFunc] = Tag.materializeCFuncPtr2[gpointer, gpointer, gboolean]
  inline def apply(inline o: CFuncPtr2[gpointer, gpointer, gboolean]): GtkCustomFilterFunc = o
  extension (v: GtkCustomFilterFunc)
    inline def value: CFuncPtr2[gpointer, gpointer, gboolean] = v

opaque type GtkCustomFilter_autoptr = Ptr[GtkCustomFilter]
object GtkCustomFilter_autoptr: 
  given _tag: Tag[GtkCustomFilter_autoptr] = Tag.Ptr[GtkCustomFilter](GtkCustomFilter._tag)
  inline def apply(inline o: Ptr[GtkCustomFilter]): GtkCustomFilter_autoptr = o
  extension (v: GtkCustomFilter_autoptr)
    inline def value: Ptr[GtkCustomFilter] = v

opaque type GtkCustomFilter_listautoptr = Ptr[GList]
object GtkCustomFilter_listautoptr: 
  given _tag: Tag[GtkCustomFilter_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkCustomFilter_listautoptr = o
  extension (v: GtkCustomFilter_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkCustomFilter_queueautoptr = Ptr[GQueue]
object GtkCustomFilter_queueautoptr: 
  given _tag: Tag[GtkCustomFilter_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkCustomFilter_queueautoptr = o
  extension (v: GtkCustomFilter_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkCustomFilter_slistautoptr = Ptr[GSList]
object GtkCustomFilter_slistautoptr: 
  given _tag: Tag[GtkCustomFilter_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkCustomFilter_slistautoptr = o
  extension (v: GtkCustomFilter_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkCustomLayoutClass_autoptr = Ptr[GtkCustomLayoutClass]
object GtkCustomLayoutClass_autoptr: 
  given _tag: Tag[GtkCustomLayoutClass_autoptr] = Tag.Ptr[GtkCustomLayoutClass](GtkCustomLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkCustomLayoutClass]): GtkCustomLayoutClass_autoptr = o
  extension (v: GtkCustomLayoutClass_autoptr)
    inline def value: Ptr[GtkCustomLayoutClass] = v

opaque type GtkCustomLayoutClass_listautoptr = Ptr[GList]
object GtkCustomLayoutClass_listautoptr: 
  given _tag: Tag[GtkCustomLayoutClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkCustomLayoutClass_listautoptr = o
  extension (v: GtkCustomLayoutClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkCustomLayoutClass_queueautoptr = Ptr[GQueue]
object GtkCustomLayoutClass_queueautoptr: 
  given _tag: Tag[GtkCustomLayoutClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkCustomLayoutClass_queueautoptr = o
  extension (v: GtkCustomLayoutClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkCustomLayoutClass_slistautoptr = Ptr[GSList]
object GtkCustomLayoutClass_slistautoptr: 
  given _tag: Tag[GtkCustomLayoutClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkCustomLayoutClass_slistautoptr = o
  extension (v: GtkCustomLayoutClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkCustomLayout_autoptr = Ptr[GtkCustomLayout]
object GtkCustomLayout_autoptr: 
  given _tag: Tag[GtkCustomLayout_autoptr] = Tag.Ptr[GtkCustomLayout](GtkCustomLayout._tag)
  inline def apply(inline o: Ptr[GtkCustomLayout]): GtkCustomLayout_autoptr = o
  extension (v: GtkCustomLayout_autoptr)
    inline def value: Ptr[GtkCustomLayout] = v

opaque type GtkCustomLayout_listautoptr = Ptr[GList]
object GtkCustomLayout_listautoptr: 
  given _tag: Tag[GtkCustomLayout_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkCustomLayout_listautoptr = o
  extension (v: GtkCustomLayout_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkCustomLayout_queueautoptr = Ptr[GQueue]
object GtkCustomLayout_queueautoptr: 
  given _tag: Tag[GtkCustomLayout_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkCustomLayout_queueautoptr = o
  extension (v: GtkCustomLayout_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkCustomLayout_slistautoptr = Ptr[GSList]
object GtkCustomLayout_slistautoptr: 
  given _tag: Tag[GtkCustomLayout_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkCustomLayout_slistautoptr = o
  extension (v: GtkCustomLayout_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkCustomMeasureFunc = CFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit]
object GtkCustomMeasureFunc: 
  given _tag: Tag[GtkCustomMeasureFunc] = Tag.materializeCFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit]
  inline def apply(inline o: CFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit]): GtkCustomMeasureFunc = o
  extension (v: GtkCustomMeasureFunc)
    inline def value: CFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit] = v

opaque type GtkCustomRequestModeFunc = CFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode]
object GtkCustomRequestModeFunc: 
  given _tag: Tag[GtkCustomRequestModeFunc] = Tag.materializeCFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode]
  inline def apply(inline o: CFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode]): GtkCustomRequestModeFunc = o
  extension (v: GtkCustomRequestModeFunc)
    inline def value: CFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode] = v

opaque type GtkCustomSorterClass_autoptr = Ptr[GtkCustomSorterClass]
object GtkCustomSorterClass_autoptr: 
  given _tag: Tag[GtkCustomSorterClass_autoptr] = Tag.Ptr[GtkCustomSorterClass](GtkCustomSorterClass._tag)
  inline def apply(inline o: Ptr[GtkCustomSorterClass]): GtkCustomSorterClass_autoptr = o
  extension (v: GtkCustomSorterClass_autoptr)
    inline def value: Ptr[GtkCustomSorterClass] = v

opaque type GtkCustomSorterClass_listautoptr = Ptr[GList]
object GtkCustomSorterClass_listautoptr: 
  given _tag: Tag[GtkCustomSorterClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkCustomSorterClass_listautoptr = o
  extension (v: GtkCustomSorterClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkCustomSorterClass_queueautoptr = Ptr[GQueue]
object GtkCustomSorterClass_queueautoptr: 
  given _tag: Tag[GtkCustomSorterClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkCustomSorterClass_queueautoptr = o
  extension (v: GtkCustomSorterClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkCustomSorterClass_slistautoptr = Ptr[GSList]
object GtkCustomSorterClass_slistautoptr: 
  given _tag: Tag[GtkCustomSorterClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkCustomSorterClass_slistautoptr = o
  extension (v: GtkCustomSorterClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkCustomSorter_autoptr = Ptr[GtkCustomSorter]
object GtkCustomSorter_autoptr: 
  given _tag: Tag[GtkCustomSorter_autoptr] = Tag.Ptr[GtkCustomSorter](GtkCustomSorter._tag)
  inline def apply(inline o: Ptr[GtkCustomSorter]): GtkCustomSorter_autoptr = o
  extension (v: GtkCustomSorter_autoptr)
    inline def value: Ptr[GtkCustomSorter] = v

opaque type GtkCustomSorter_listautoptr = Ptr[GList]
object GtkCustomSorter_listautoptr: 
  given _tag: Tag[GtkCustomSorter_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkCustomSorter_listautoptr = o
  extension (v: GtkCustomSorter_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkCustomSorter_queueautoptr = Ptr[GQueue]
object GtkCustomSorter_queueautoptr: 
  given _tag: Tag[GtkCustomSorter_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkCustomSorter_queueautoptr = o
  extension (v: GtkCustomSorter_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkCustomSorter_slistautoptr = Ptr[GSList]
object GtkCustomSorter_slistautoptr: 
  given _tag: Tag[GtkCustomSorter_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkCustomSorter_slistautoptr = o
  extension (v: GtkCustomSorter_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkDialog_autoptr = Ptr[GtkDialog]
object GtkDialog_autoptr: 
  given _tag: Tag[GtkDialog_autoptr] = Tag.Ptr[GtkDialog](GtkDialog._tag)
  inline def apply(inline o: Ptr[GtkDialog]): GtkDialog_autoptr = o
  extension (v: GtkDialog_autoptr)
    inline def value: Ptr[GtkDialog] = v

opaque type GtkDialog_listautoptr = Ptr[GList]
object GtkDialog_listautoptr: 
  given _tag: Tag[GtkDialog_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkDialog_listautoptr = o
  extension (v: GtkDialog_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkDialog_queueautoptr = Ptr[GQueue]
object GtkDialog_queueautoptr: 
  given _tag: Tag[GtkDialog_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkDialog_queueautoptr = o
  extension (v: GtkDialog_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkDialog_slistautoptr = Ptr[GSList]
object GtkDialog_slistautoptr: 
  given _tag: Tag[GtkDialog_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkDialog_slistautoptr = o
  extension (v: GtkDialog_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkDirectoryListClass_autoptr = Ptr[GtkDirectoryListClass]
object GtkDirectoryListClass_autoptr: 
  given _tag: Tag[GtkDirectoryListClass_autoptr] = Tag.Ptr[GtkDirectoryListClass](GtkDirectoryListClass._tag)
  inline def apply(inline o: Ptr[GtkDirectoryListClass]): GtkDirectoryListClass_autoptr = o
  extension (v: GtkDirectoryListClass_autoptr)
    inline def value: Ptr[GtkDirectoryListClass] = v

opaque type GtkDirectoryListClass_listautoptr = Ptr[GList]
object GtkDirectoryListClass_listautoptr: 
  given _tag: Tag[GtkDirectoryListClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkDirectoryListClass_listautoptr = o
  extension (v: GtkDirectoryListClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkDirectoryListClass_queueautoptr = Ptr[GQueue]
object GtkDirectoryListClass_queueautoptr: 
  given _tag: Tag[GtkDirectoryListClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkDirectoryListClass_queueautoptr = o
  extension (v: GtkDirectoryListClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkDirectoryListClass_slistautoptr = Ptr[GSList]
object GtkDirectoryListClass_slistautoptr: 
  given _tag: Tag[GtkDirectoryListClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkDirectoryListClass_slistautoptr = o
  extension (v: GtkDirectoryListClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkDirectoryList_autoptr = Ptr[GtkDirectoryList]
object GtkDirectoryList_autoptr: 
  given _tag: Tag[GtkDirectoryList_autoptr] = Tag.Ptr[GtkDirectoryList](GtkDirectoryList._tag)
  inline def apply(inline o: Ptr[GtkDirectoryList]): GtkDirectoryList_autoptr = o
  extension (v: GtkDirectoryList_autoptr)
    inline def value: Ptr[GtkDirectoryList] = v

opaque type GtkDirectoryList_listautoptr = Ptr[GList]
object GtkDirectoryList_listautoptr: 
  given _tag: Tag[GtkDirectoryList_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkDirectoryList_listautoptr = o
  extension (v: GtkDirectoryList_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkDirectoryList_queueautoptr = Ptr[GQueue]
object GtkDirectoryList_queueautoptr: 
  given _tag: Tag[GtkDirectoryList_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkDirectoryList_queueautoptr = o
  extension (v: GtkDirectoryList_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkDirectoryList_slistautoptr = Ptr[GSList]
object GtkDirectoryList_slistautoptr: 
  given _tag: Tag[GtkDirectoryList_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkDirectoryList_slistautoptr = o
  extension (v: GtkDirectoryList_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkDragIconClass_autoptr = Ptr[GtkDragIconClass]
object GtkDragIconClass_autoptr: 
  given _tag: Tag[GtkDragIconClass_autoptr] = Tag.Ptr[GtkDragIconClass](GtkDragIconClass._tag)
  inline def apply(inline o: Ptr[GtkDragIconClass]): GtkDragIconClass_autoptr = o
  extension (v: GtkDragIconClass_autoptr)
    inline def value: Ptr[GtkDragIconClass] = v

opaque type GtkDragIconClass_listautoptr = Ptr[GList]
object GtkDragIconClass_listautoptr: 
  given _tag: Tag[GtkDragIconClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkDragIconClass_listautoptr = o
  extension (v: GtkDragIconClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkDragIconClass_queueautoptr = Ptr[GQueue]
object GtkDragIconClass_queueautoptr: 
  given _tag: Tag[GtkDragIconClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkDragIconClass_queueautoptr = o
  extension (v: GtkDragIconClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkDragIconClass_slistautoptr = Ptr[GSList]
object GtkDragIconClass_slistautoptr: 
  given _tag: Tag[GtkDragIconClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkDragIconClass_slistautoptr = o
  extension (v: GtkDragIconClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkDragIcon_autoptr = Ptr[GtkDragIcon]
object GtkDragIcon_autoptr: 
  given _tag: Tag[GtkDragIcon_autoptr] = Tag.Ptr[GtkDragIcon](GtkDragIcon._tag)
  inline def apply(inline o: Ptr[GtkDragIcon]): GtkDragIcon_autoptr = o
  extension (v: GtkDragIcon_autoptr)
    inline def value: Ptr[GtkDragIcon] = v

opaque type GtkDragIcon_listautoptr = Ptr[GList]
object GtkDragIcon_listautoptr: 
  given _tag: Tag[GtkDragIcon_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkDragIcon_listautoptr = o
  extension (v: GtkDragIcon_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkDragIcon_queueautoptr = Ptr[GQueue]
object GtkDragIcon_queueautoptr: 
  given _tag: Tag[GtkDragIcon_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkDragIcon_queueautoptr = o
  extension (v: GtkDragIcon_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkDragIcon_slistautoptr = Ptr[GSList]
object GtkDragIcon_slistautoptr: 
  given _tag: Tag[GtkDragIcon_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkDragIcon_slistautoptr = o
  extension (v: GtkDragIcon_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkDrawingAreaDrawFunc = CFuncPtr5[Ptr[GtkDrawingArea], Ptr[cairo_t], CInt, CInt, gpointer, Unit]
object GtkDrawingAreaDrawFunc: 
  given _tag: Tag[GtkDrawingAreaDrawFunc] = Tag.materializeCFuncPtr5[Ptr[GtkDrawingArea], Ptr[cairo_t], CInt, CInt, gpointer, Unit]
  inline def apply(inline o: CFuncPtr5[Ptr[GtkDrawingArea], Ptr[cairo_t], CInt, CInt, gpointer, Unit]): GtkDrawingAreaDrawFunc = o
  extension (v: GtkDrawingAreaDrawFunc)
    inline def value: CFuncPtr5[Ptr[GtkDrawingArea], Ptr[cairo_t], CInt, CInt, gpointer, Unit] = v

opaque type GtkDrawingArea_autoptr = Ptr[GtkDrawingArea]
object GtkDrawingArea_autoptr: 
  given _tag: Tag[GtkDrawingArea_autoptr] = Tag.Ptr[GtkDrawingArea](GtkDrawingArea._tag)
  inline def apply(inline o: Ptr[GtkDrawingArea]): GtkDrawingArea_autoptr = o
  extension (v: GtkDrawingArea_autoptr)
    inline def value: Ptr[GtkDrawingArea] = v

opaque type GtkDrawingArea_listautoptr = Ptr[GList]
object GtkDrawingArea_listautoptr: 
  given _tag: Tag[GtkDrawingArea_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkDrawingArea_listautoptr = o
  extension (v: GtkDrawingArea_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkDrawingArea_queueautoptr = Ptr[GQueue]
object GtkDrawingArea_queueautoptr: 
  given _tag: Tag[GtkDrawingArea_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkDrawingArea_queueautoptr = o
  extension (v: GtkDrawingArea_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkDrawingArea_slistautoptr = Ptr[GSList]
object GtkDrawingArea_slistautoptr: 
  given _tag: Tag[GtkDrawingArea_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkDrawingArea_slistautoptr = o
  extension (v: GtkDrawingArea_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkDropDownClass_autoptr = Ptr[GtkDropDownClass]
object GtkDropDownClass_autoptr: 
  given _tag: Tag[GtkDropDownClass_autoptr] = Tag.Ptr[GtkDropDownClass](GtkDropDownClass._tag)
  inline def apply(inline o: Ptr[GtkDropDownClass]): GtkDropDownClass_autoptr = o
  extension (v: GtkDropDownClass_autoptr)
    inline def value: Ptr[GtkDropDownClass] = v

opaque type GtkDropDownClass_listautoptr = Ptr[GList]
object GtkDropDownClass_listautoptr: 
  given _tag: Tag[GtkDropDownClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkDropDownClass_listautoptr = o
  extension (v: GtkDropDownClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkDropDownClass_queueautoptr = Ptr[GQueue]
object GtkDropDownClass_queueautoptr: 
  given _tag: Tag[GtkDropDownClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkDropDownClass_queueautoptr = o
  extension (v: GtkDropDownClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkDropDownClass_slistautoptr = Ptr[GSList]
object GtkDropDownClass_slistautoptr: 
  given _tag: Tag[GtkDropDownClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkDropDownClass_slistautoptr = o
  extension (v: GtkDropDownClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkDropDown_autoptr = Ptr[GtkDropDown]
object GtkDropDown_autoptr: 
  given _tag: Tag[GtkDropDown_autoptr] = Tag.Ptr[GtkDropDown](GtkDropDown._tag)
  inline def apply(inline o: Ptr[GtkDropDown]): GtkDropDown_autoptr = o
  extension (v: GtkDropDown_autoptr)
    inline def value: Ptr[GtkDropDown] = v

opaque type GtkDropDown_listautoptr = Ptr[GList]
object GtkDropDown_listautoptr: 
  given _tag: Tag[GtkDropDown_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkDropDown_listautoptr = o
  extension (v: GtkDropDown_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkDropDown_queueautoptr = Ptr[GQueue]
object GtkDropDown_queueautoptr: 
  given _tag: Tag[GtkDropDown_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkDropDown_queueautoptr = o
  extension (v: GtkDropDown_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkDropDown_slistautoptr = Ptr[GSList]
object GtkDropDown_slistautoptr: 
  given _tag: Tag[GtkDropDown_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkDropDown_slistautoptr = o
  extension (v: GtkDropDown_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkEditableLabelClass_autoptr = Ptr[GtkEditableLabelClass]
object GtkEditableLabelClass_autoptr: 
  given _tag: Tag[GtkEditableLabelClass_autoptr] = Tag.Ptr[GtkEditableLabelClass](GtkEditableLabelClass._tag)
  inline def apply(inline o: Ptr[GtkEditableLabelClass]): GtkEditableLabelClass_autoptr = o
  extension (v: GtkEditableLabelClass_autoptr)
    inline def value: Ptr[GtkEditableLabelClass] = v

opaque type GtkEditableLabelClass_listautoptr = Ptr[GList]
object GtkEditableLabelClass_listautoptr: 
  given _tag: Tag[GtkEditableLabelClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkEditableLabelClass_listautoptr = o
  extension (v: GtkEditableLabelClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkEditableLabelClass_queueautoptr = Ptr[GQueue]
object GtkEditableLabelClass_queueautoptr: 
  given _tag: Tag[GtkEditableLabelClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkEditableLabelClass_queueautoptr = o
  extension (v: GtkEditableLabelClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkEditableLabelClass_slistautoptr = Ptr[GSList]
object GtkEditableLabelClass_slistautoptr: 
  given _tag: Tag[GtkEditableLabelClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkEditableLabelClass_slistautoptr = o
  extension (v: GtkEditableLabelClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkEditableLabel_autoptr = Ptr[GtkEditableLabel]
object GtkEditableLabel_autoptr: 
  given _tag: Tag[GtkEditableLabel_autoptr] = Tag.Ptr[GtkEditableLabel](GtkEditableLabel._tag)
  inline def apply(inline o: Ptr[GtkEditableLabel]): GtkEditableLabel_autoptr = o
  extension (v: GtkEditableLabel_autoptr)
    inline def value: Ptr[GtkEditableLabel] = v

opaque type GtkEditableLabel_listautoptr = Ptr[GList]
object GtkEditableLabel_listautoptr: 
  given _tag: Tag[GtkEditableLabel_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkEditableLabel_listautoptr = o
  extension (v: GtkEditableLabel_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkEditableLabel_queueautoptr = Ptr[GQueue]
object GtkEditableLabel_queueautoptr: 
  given _tag: Tag[GtkEditableLabel_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkEditableLabel_queueautoptr = o
  extension (v: GtkEditableLabel_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkEditableLabel_slistautoptr = Ptr[GSList]
object GtkEditableLabel_slistautoptr: 
  given _tag: Tag[GtkEditableLabel_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkEditableLabel_slistautoptr = o
  extension (v: GtkEditableLabel_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkEditable_autoptr = Ptr[GtkEditable]
object GtkEditable_autoptr: 
  given _tag: Tag[GtkEditable_autoptr] = Tag.Ptr[GtkEditable](GtkEditable._tag)
  inline def apply(inline o: Ptr[GtkEditable]): GtkEditable_autoptr = o
  extension (v: GtkEditable_autoptr)
    inline def value: Ptr[GtkEditable] = v

opaque type GtkEditable_listautoptr = Ptr[GList]
object GtkEditable_listautoptr: 
  given _tag: Tag[GtkEditable_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkEditable_listautoptr = o
  extension (v: GtkEditable_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkEditable_queueautoptr = Ptr[GQueue]
object GtkEditable_queueautoptr: 
  given _tag: Tag[GtkEditable_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkEditable_queueautoptr = o
  extension (v: GtkEditable_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkEditable_slistautoptr = Ptr[GSList]
object GtkEditable_slistautoptr: 
  given _tag: Tag[GtkEditable_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkEditable_slistautoptr = o
  extension (v: GtkEditable_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkEntryBuffer_autoptr = Ptr[GtkEntryBuffer]
object GtkEntryBuffer_autoptr: 
  given _tag: Tag[GtkEntryBuffer_autoptr] = Tag.Ptr[GtkEntryBuffer](GtkEntryBuffer._tag)
  inline def apply(inline o: Ptr[GtkEntryBuffer]): GtkEntryBuffer_autoptr = o
  extension (v: GtkEntryBuffer_autoptr)
    inline def value: Ptr[GtkEntryBuffer] = v

opaque type GtkEntryBuffer_listautoptr = Ptr[GList]
object GtkEntryBuffer_listautoptr: 
  given _tag: Tag[GtkEntryBuffer_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkEntryBuffer_listautoptr = o
  extension (v: GtkEntryBuffer_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkEntryBuffer_queueautoptr = Ptr[GQueue]
object GtkEntryBuffer_queueautoptr: 
  given _tag: Tag[GtkEntryBuffer_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkEntryBuffer_queueautoptr = o
  extension (v: GtkEntryBuffer_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkEntryBuffer_slistautoptr = Ptr[GSList]
object GtkEntryBuffer_slistautoptr: 
  given _tag: Tag[GtkEntryBuffer_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkEntryBuffer_slistautoptr = o
  extension (v: GtkEntryBuffer_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkEntryCompletionMatchFunc = CFuncPtr4[Ptr[GtkEntryCompletion], CString, Ptr[GtkTreeIter], gpointer, gboolean]
object GtkEntryCompletionMatchFunc: 
  given _tag: Tag[GtkEntryCompletionMatchFunc] = Tag.materializeCFuncPtr4[Ptr[GtkEntryCompletion], CString, Ptr[GtkTreeIter], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr4[Ptr[GtkEntryCompletion], CString, Ptr[GtkTreeIter], gpointer, gboolean]): GtkEntryCompletionMatchFunc = o
  extension (v: GtkEntryCompletionMatchFunc)
    inline def value: CFuncPtr4[Ptr[GtkEntryCompletion], CString, Ptr[GtkTreeIter], gpointer, gboolean] = v

opaque type GtkEntryCompletion_autoptr = Ptr[GtkEntryCompletion]
object GtkEntryCompletion_autoptr: 
  given _tag: Tag[GtkEntryCompletion_autoptr] = Tag.Ptr[GtkEntryCompletion](GtkEntryCompletion._tag)
  inline def apply(inline o: Ptr[GtkEntryCompletion]): GtkEntryCompletion_autoptr = o
  extension (v: GtkEntryCompletion_autoptr)
    inline def value: Ptr[GtkEntryCompletion] = v

opaque type GtkEntryCompletion_listautoptr = Ptr[GList]
object GtkEntryCompletion_listautoptr: 
  given _tag: Tag[GtkEntryCompletion_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkEntryCompletion_listautoptr = o
  extension (v: GtkEntryCompletion_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkEntryCompletion_queueautoptr = Ptr[GQueue]
object GtkEntryCompletion_queueautoptr: 
  given _tag: Tag[GtkEntryCompletion_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkEntryCompletion_queueautoptr = o
  extension (v: GtkEntryCompletion_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkEntryCompletion_slistautoptr = Ptr[GSList]
object GtkEntryCompletion_slistautoptr: 
  given _tag: Tag[GtkEntryCompletion_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkEntryCompletion_slistautoptr = o
  extension (v: GtkEntryCompletion_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkEntry_autoptr = Ptr[GtkEntry]
object GtkEntry_autoptr: 
  given _tag: Tag[GtkEntry_autoptr] = Tag.Ptr[GtkEntry](GtkEntry._tag)
  inline def apply(inline o: Ptr[GtkEntry]): GtkEntry_autoptr = o
  extension (v: GtkEntry_autoptr)
    inline def value: Ptr[GtkEntry] = v

opaque type GtkEntry_listautoptr = Ptr[GList]
object GtkEntry_listautoptr: 
  given _tag: Tag[GtkEntry_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkEntry_listautoptr = o
  extension (v: GtkEntry_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkEntry_queueautoptr = Ptr[GQueue]
object GtkEntry_queueautoptr: 
  given _tag: Tag[GtkEntry_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkEntry_queueautoptr = o
  extension (v: GtkEntry_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkEntry_slistautoptr = Ptr[GSList]
object GtkEntry_slistautoptr: 
  given _tag: Tag[GtkEntry_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkEntry_slistautoptr = o
  extension (v: GtkEntry_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkEventController_autoptr = Ptr[GtkEventController]
object GtkEventController_autoptr: 
  given _tag: Tag[GtkEventController_autoptr] = Tag.Ptr[GtkEventController](GtkEventController._tag)
  inline def apply(inline o: Ptr[GtkEventController]): GtkEventController_autoptr = o
  extension (v: GtkEventController_autoptr)
    inline def value: Ptr[GtkEventController] = v

opaque type GtkEventController_listautoptr = Ptr[GList]
object GtkEventController_listautoptr: 
  given _tag: Tag[GtkEventController_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkEventController_listautoptr = o
  extension (v: GtkEventController_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkEventController_queueautoptr = Ptr[GQueue]
object GtkEventController_queueautoptr: 
  given _tag: Tag[GtkEventController_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkEventController_queueautoptr = o
  extension (v: GtkEventController_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkEventController_slistautoptr = Ptr[GSList]
object GtkEventController_slistautoptr: 
  given _tag: Tag[GtkEventController_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkEventController_slistautoptr = o
  extension (v: GtkEventController_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkEveryFilterClass_autoptr = Ptr[GtkEveryFilterClass]
object GtkEveryFilterClass_autoptr: 
  given _tag: Tag[GtkEveryFilterClass_autoptr] = Tag.Ptr[GtkEveryFilterClass](GtkEveryFilterClass._tag)
  inline def apply(inline o: Ptr[GtkEveryFilterClass]): GtkEveryFilterClass_autoptr = o
  extension (v: GtkEveryFilterClass_autoptr)
    inline def value: Ptr[GtkEveryFilterClass] = v

opaque type GtkEveryFilterClass_listautoptr = Ptr[GList]
object GtkEveryFilterClass_listautoptr: 
  given _tag: Tag[GtkEveryFilterClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkEveryFilterClass_listautoptr = o
  extension (v: GtkEveryFilterClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkEveryFilterClass_queueautoptr = Ptr[GQueue]
object GtkEveryFilterClass_queueautoptr: 
  given _tag: Tag[GtkEveryFilterClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkEveryFilterClass_queueautoptr = o
  extension (v: GtkEveryFilterClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkEveryFilterClass_slistautoptr = Ptr[GSList]
object GtkEveryFilterClass_slistautoptr: 
  given _tag: Tag[GtkEveryFilterClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkEveryFilterClass_slistautoptr = o
  extension (v: GtkEveryFilterClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkEveryFilter_autoptr = Ptr[GtkEveryFilter]
object GtkEveryFilter_autoptr: 
  given _tag: Tag[GtkEveryFilter_autoptr] = Tag.Ptr[GtkEveryFilter](GtkEveryFilter._tag)
  inline def apply(inline o: Ptr[GtkEveryFilter]): GtkEveryFilter_autoptr = o
  extension (v: GtkEveryFilter_autoptr)
    inline def value: Ptr[GtkEveryFilter] = v

opaque type GtkEveryFilter_listautoptr = Ptr[GList]
object GtkEveryFilter_listautoptr: 
  given _tag: Tag[GtkEveryFilter_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkEveryFilter_listautoptr = o
  extension (v: GtkEveryFilter_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkEveryFilter_queueautoptr = Ptr[GQueue]
object GtkEveryFilter_queueautoptr: 
  given _tag: Tag[GtkEveryFilter_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkEveryFilter_queueautoptr = o
  extension (v: GtkEveryFilter_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkEveryFilter_slistautoptr = Ptr[GSList]
object GtkEveryFilter_slistautoptr: 
  given _tag: Tag[GtkEveryFilter_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkEveryFilter_slistautoptr = o
  extension (v: GtkEveryFilter_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkExpander_autoptr = Ptr[GtkExpander]
object GtkExpander_autoptr: 
  given _tag: Tag[GtkExpander_autoptr] = Tag.Ptr[GtkExpander](GtkExpander._tag)
  inline def apply(inline o: Ptr[GtkExpander]): GtkExpander_autoptr = o
  extension (v: GtkExpander_autoptr)
    inline def value: Ptr[GtkExpander] = v

opaque type GtkExpander_listautoptr = Ptr[GList]
object GtkExpander_listautoptr: 
  given _tag: Tag[GtkExpander_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkExpander_listautoptr = o
  extension (v: GtkExpander_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkExpander_queueautoptr = Ptr[GQueue]
object GtkExpander_queueautoptr: 
  given _tag: Tag[GtkExpander_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkExpander_queueautoptr = o
  extension (v: GtkExpander_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkExpander_slistautoptr = Ptr[GSList]
object GtkExpander_slistautoptr: 
  given _tag: Tag[GtkExpander_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkExpander_slistautoptr = o
  extension (v: GtkExpander_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkExpressionNotify = CFuncPtr1[gpointer, Unit]
object GtkExpressionNotify: 
  given _tag: Tag[GtkExpressionNotify] = Tag.materializeCFuncPtr1[gpointer, Unit]
  inline def apply(inline o: CFuncPtr1[gpointer, Unit]): GtkExpressionNotify = o
  extension (v: GtkExpressionNotify)
    inline def value: CFuncPtr1[gpointer, Unit] = v

opaque type GtkExpression_autoptr = Ptr[GtkExpression]
object GtkExpression_autoptr: 
  given _tag: Tag[GtkExpression_autoptr] = Tag.Ptr[GtkExpression](GtkExpression._tag)
  inline def apply(inline o: Ptr[GtkExpression]): GtkExpression_autoptr = o
  extension (v: GtkExpression_autoptr)
    inline def value: Ptr[GtkExpression] = v

opaque type GtkExpression_listautoptr = Ptr[GList]
object GtkExpression_listautoptr: 
  given _tag: Tag[GtkExpression_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkExpression_listautoptr = o
  extension (v: GtkExpression_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkExpression_queueautoptr = Ptr[GQueue]
object GtkExpression_queueautoptr: 
  given _tag: Tag[GtkExpression_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkExpression_queueautoptr = o
  extension (v: GtkExpression_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkExpression_slistautoptr = Ptr[GSList]
object GtkExpression_slistautoptr: 
  given _tag: Tag[GtkExpression_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkExpression_slistautoptr = o
  extension (v: GtkExpression_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkFileChooserDialog_autoptr = Ptr[GtkFileChooserDialog]
object GtkFileChooserDialog_autoptr: 
  given _tag: Tag[GtkFileChooserDialog_autoptr] = Tag.Ptr[GtkFileChooserDialog](GtkFileChooserDialog._tag)
  inline def apply(inline o: Ptr[GtkFileChooserDialog]): GtkFileChooserDialog_autoptr = o
  extension (v: GtkFileChooserDialog_autoptr)
    inline def value: Ptr[GtkFileChooserDialog] = v

opaque type GtkFileChooserDialog_listautoptr = Ptr[GList]
object GtkFileChooserDialog_listautoptr: 
  given _tag: Tag[GtkFileChooserDialog_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkFileChooserDialog_listautoptr = o
  extension (v: GtkFileChooserDialog_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkFileChooserDialog_queueautoptr = Ptr[GQueue]
object GtkFileChooserDialog_queueautoptr: 
  given _tag: Tag[GtkFileChooserDialog_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkFileChooserDialog_queueautoptr = o
  extension (v: GtkFileChooserDialog_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkFileChooserDialog_slistautoptr = Ptr[GSList]
object GtkFileChooserDialog_slistautoptr: 
  given _tag: Tag[GtkFileChooserDialog_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkFileChooserDialog_slistautoptr = o
  extension (v: GtkFileChooserDialog_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkFileChooserNativeClass_autoptr = Ptr[GtkFileChooserNativeClass]
object GtkFileChooserNativeClass_autoptr: 
  given _tag: Tag[GtkFileChooserNativeClass_autoptr] = Tag.Ptr[GtkFileChooserNativeClass](GtkFileChooserNativeClass._tag)
  inline def apply(inline o: Ptr[GtkFileChooserNativeClass]): GtkFileChooserNativeClass_autoptr = o
  extension (v: GtkFileChooserNativeClass_autoptr)
    inline def value: Ptr[GtkFileChooserNativeClass] = v

opaque type GtkFileChooserNativeClass_listautoptr = Ptr[GList]
object GtkFileChooserNativeClass_listautoptr: 
  given _tag: Tag[GtkFileChooserNativeClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkFileChooserNativeClass_listautoptr = o
  extension (v: GtkFileChooserNativeClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkFileChooserNativeClass_queueautoptr = Ptr[GQueue]
object GtkFileChooserNativeClass_queueautoptr: 
  given _tag: Tag[GtkFileChooserNativeClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkFileChooserNativeClass_queueautoptr = o
  extension (v: GtkFileChooserNativeClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkFileChooserNativeClass_slistautoptr = Ptr[GSList]
object GtkFileChooserNativeClass_slistautoptr: 
  given _tag: Tag[GtkFileChooserNativeClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkFileChooserNativeClass_slistautoptr = o
  extension (v: GtkFileChooserNativeClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkFileChooserNative_autoptr = Ptr[GtkFileChooserNative]
object GtkFileChooserNative_autoptr: 
  given _tag: Tag[GtkFileChooserNative_autoptr] = Tag.Ptr[GtkFileChooserNative](GtkFileChooserNative._tag)
  inline def apply(inline o: Ptr[GtkFileChooserNative]): GtkFileChooserNative_autoptr = o
  extension (v: GtkFileChooserNative_autoptr)
    inline def value: Ptr[GtkFileChooserNative] = v

opaque type GtkFileChooserNative_listautoptr = Ptr[GList]
object GtkFileChooserNative_listautoptr: 
  given _tag: Tag[GtkFileChooserNative_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkFileChooserNative_listautoptr = o
  extension (v: GtkFileChooserNative_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkFileChooserNative_queueautoptr = Ptr[GQueue]
object GtkFileChooserNative_queueautoptr: 
  given _tag: Tag[GtkFileChooserNative_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkFileChooserNative_queueautoptr = o
  extension (v: GtkFileChooserNative_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkFileChooserNative_slistautoptr = Ptr[GSList]
object GtkFileChooserNative_slistautoptr: 
  given _tag: Tag[GtkFileChooserNative_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkFileChooserNative_slistautoptr = o
  extension (v: GtkFileChooserNative_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkFileChooserWidget_autoptr = Ptr[GtkFileChooserWidget]
object GtkFileChooserWidget_autoptr: 
  given _tag: Tag[GtkFileChooserWidget_autoptr] = Tag.Ptr[GtkFileChooserWidget](GtkFileChooserWidget._tag)
  inline def apply(inline o: Ptr[GtkFileChooserWidget]): GtkFileChooserWidget_autoptr = o
  extension (v: GtkFileChooserWidget_autoptr)
    inline def value: Ptr[GtkFileChooserWidget] = v

opaque type GtkFileChooserWidget_listautoptr = Ptr[GList]
object GtkFileChooserWidget_listautoptr: 
  given _tag: Tag[GtkFileChooserWidget_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkFileChooserWidget_listautoptr = o
  extension (v: GtkFileChooserWidget_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkFileChooserWidget_queueautoptr = Ptr[GQueue]
object GtkFileChooserWidget_queueautoptr: 
  given _tag: Tag[GtkFileChooserWidget_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkFileChooserWidget_queueautoptr = o
  extension (v: GtkFileChooserWidget_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkFileChooserWidget_slistautoptr = Ptr[GSList]
object GtkFileChooserWidget_slistautoptr: 
  given _tag: Tag[GtkFileChooserWidget_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkFileChooserWidget_slistautoptr = o
  extension (v: GtkFileChooserWidget_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkFileFilter_autoptr = Ptr[GtkFileFilter]
object GtkFileFilter_autoptr: 
  given _tag: Tag[GtkFileFilter_autoptr] = Tag.Ptr[GtkFileFilter](GtkFileFilter._tag)
  inline def apply(inline o: Ptr[GtkFileFilter]): GtkFileFilter_autoptr = o
  extension (v: GtkFileFilter_autoptr)
    inline def value: Ptr[GtkFileFilter] = v

opaque type GtkFileFilter_listautoptr = Ptr[GList]
object GtkFileFilter_listautoptr: 
  given _tag: Tag[GtkFileFilter_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkFileFilter_listautoptr = o
  extension (v: GtkFileFilter_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkFileFilter_queueautoptr = Ptr[GQueue]
object GtkFileFilter_queueautoptr: 
  given _tag: Tag[GtkFileFilter_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkFileFilter_queueautoptr = o
  extension (v: GtkFileFilter_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkFileFilter_slistautoptr = Ptr[GSList]
object GtkFileFilter_slistautoptr: 
  given _tag: Tag[GtkFileFilter_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkFileFilter_slistautoptr = o
  extension (v: GtkFileFilter_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkFilterClass_autoptr = Ptr[GtkFilterClass]
object GtkFilterClass_autoptr: 
  given _tag: Tag[GtkFilterClass_autoptr] = Tag.Ptr[GtkFilterClass](GtkFilterClass._tag)
  inline def apply(inline o: Ptr[GtkFilterClass]): GtkFilterClass_autoptr = o
  extension (v: GtkFilterClass_autoptr)
    inline def value: Ptr[GtkFilterClass] = v

opaque type GtkFilterClass_listautoptr = Ptr[GList]
object GtkFilterClass_listautoptr: 
  given _tag: Tag[GtkFilterClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkFilterClass_listautoptr = o
  extension (v: GtkFilterClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkFilterClass_queueautoptr = Ptr[GQueue]
object GtkFilterClass_queueautoptr: 
  given _tag: Tag[GtkFilterClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkFilterClass_queueautoptr = o
  extension (v: GtkFilterClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkFilterClass_slistautoptr = Ptr[GSList]
object GtkFilterClass_slistautoptr: 
  given _tag: Tag[GtkFilterClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkFilterClass_slistautoptr = o
  extension (v: GtkFilterClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkFilterListModelClass_autoptr = Ptr[GtkFilterListModelClass]
object GtkFilterListModelClass_autoptr: 
  given _tag: Tag[GtkFilterListModelClass_autoptr] = Tag.Ptr[GtkFilterListModelClass](GtkFilterListModelClass._tag)
  inline def apply(inline o: Ptr[GtkFilterListModelClass]): GtkFilterListModelClass_autoptr = o
  extension (v: GtkFilterListModelClass_autoptr)
    inline def value: Ptr[GtkFilterListModelClass] = v

opaque type GtkFilterListModelClass_listautoptr = Ptr[GList]
object GtkFilterListModelClass_listautoptr: 
  given _tag: Tag[GtkFilterListModelClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkFilterListModelClass_listautoptr = o
  extension (v: GtkFilterListModelClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkFilterListModelClass_queueautoptr = Ptr[GQueue]
object GtkFilterListModelClass_queueautoptr: 
  given _tag: Tag[GtkFilterListModelClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkFilterListModelClass_queueautoptr = o
  extension (v: GtkFilterListModelClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkFilterListModelClass_slistautoptr = Ptr[GSList]
object GtkFilterListModelClass_slistautoptr: 
  given _tag: Tag[GtkFilterListModelClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkFilterListModelClass_slistautoptr = o
  extension (v: GtkFilterListModelClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkFilterListModel_autoptr = Ptr[GtkFilterListModel]
object GtkFilterListModel_autoptr: 
  given _tag: Tag[GtkFilterListModel_autoptr] = Tag.Ptr[GtkFilterListModel](GtkFilterListModel._tag)
  inline def apply(inline o: Ptr[GtkFilterListModel]): GtkFilterListModel_autoptr = o
  extension (v: GtkFilterListModel_autoptr)
    inline def value: Ptr[GtkFilterListModel] = v

opaque type GtkFilterListModel_listautoptr = Ptr[GList]
object GtkFilterListModel_listautoptr: 
  given _tag: Tag[GtkFilterListModel_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkFilterListModel_listautoptr = o
  extension (v: GtkFilterListModel_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkFilterListModel_queueautoptr = Ptr[GQueue]
object GtkFilterListModel_queueautoptr: 
  given _tag: Tag[GtkFilterListModel_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkFilterListModel_queueautoptr = o
  extension (v: GtkFilterListModel_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkFilterListModel_slistautoptr = Ptr[GSList]
object GtkFilterListModel_slistautoptr: 
  given _tag: Tag[GtkFilterListModel_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkFilterListModel_slistautoptr = o
  extension (v: GtkFilterListModel_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkFilter_autoptr = Ptr[GtkFilter]
object GtkFilter_autoptr: 
  given _tag: Tag[GtkFilter_autoptr] = Tag.Ptr[GtkFilter](GtkFilter._tag)
  inline def apply(inline o: Ptr[GtkFilter]): GtkFilter_autoptr = o
  extension (v: GtkFilter_autoptr)
    inline def value: Ptr[GtkFilter] = v

opaque type GtkFilter_listautoptr = Ptr[GList]
object GtkFilter_listautoptr: 
  given _tag: Tag[GtkFilter_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkFilter_listautoptr = o
  extension (v: GtkFilter_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkFilter_queueautoptr = Ptr[GQueue]
object GtkFilter_queueautoptr: 
  given _tag: Tag[GtkFilter_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkFilter_queueautoptr = o
  extension (v: GtkFilter_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkFilter_slistautoptr = Ptr[GSList]
object GtkFilter_slistautoptr: 
  given _tag: Tag[GtkFilter_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkFilter_slistautoptr = o
  extension (v: GtkFilter_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkFixedLayoutChildClass_autoptr = Ptr[GtkFixedLayoutChildClass]
object GtkFixedLayoutChildClass_autoptr: 
  given _tag: Tag[GtkFixedLayoutChildClass_autoptr] = Tag.Ptr[GtkFixedLayoutChildClass](GtkFixedLayoutChildClass._tag)
  inline def apply(inline o: Ptr[GtkFixedLayoutChildClass]): GtkFixedLayoutChildClass_autoptr = o
  extension (v: GtkFixedLayoutChildClass_autoptr)
    inline def value: Ptr[GtkFixedLayoutChildClass] = v

opaque type GtkFixedLayoutChildClass_listautoptr = Ptr[GList]
object GtkFixedLayoutChildClass_listautoptr: 
  given _tag: Tag[GtkFixedLayoutChildClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkFixedLayoutChildClass_listautoptr = o
  extension (v: GtkFixedLayoutChildClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkFixedLayoutChildClass_queueautoptr = Ptr[GQueue]
object GtkFixedLayoutChildClass_queueautoptr: 
  given _tag: Tag[GtkFixedLayoutChildClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkFixedLayoutChildClass_queueautoptr = o
  extension (v: GtkFixedLayoutChildClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkFixedLayoutChildClass_slistautoptr = Ptr[GSList]
object GtkFixedLayoutChildClass_slistautoptr: 
  given _tag: Tag[GtkFixedLayoutChildClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkFixedLayoutChildClass_slistautoptr = o
  extension (v: GtkFixedLayoutChildClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkFixedLayoutChild_autoptr = Ptr[GtkFixedLayoutChild]
object GtkFixedLayoutChild_autoptr: 
  given _tag: Tag[GtkFixedLayoutChild_autoptr] = Tag.Ptr[GtkFixedLayoutChild](GtkFixedLayoutChild._tag)
  inline def apply(inline o: Ptr[GtkFixedLayoutChild]): GtkFixedLayoutChild_autoptr = o
  extension (v: GtkFixedLayoutChild_autoptr)
    inline def value: Ptr[GtkFixedLayoutChild] = v

opaque type GtkFixedLayoutChild_listautoptr = Ptr[GList]
object GtkFixedLayoutChild_listautoptr: 
  given _tag: Tag[GtkFixedLayoutChild_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkFixedLayoutChild_listautoptr = o
  extension (v: GtkFixedLayoutChild_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkFixedLayoutChild_queueautoptr = Ptr[GQueue]
object GtkFixedLayoutChild_queueautoptr: 
  given _tag: Tag[GtkFixedLayoutChild_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkFixedLayoutChild_queueautoptr = o
  extension (v: GtkFixedLayoutChild_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkFixedLayoutChild_slistautoptr = Ptr[GSList]
object GtkFixedLayoutChild_slistautoptr: 
  given _tag: Tag[GtkFixedLayoutChild_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkFixedLayoutChild_slistautoptr = o
  extension (v: GtkFixedLayoutChild_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkFixedLayoutClass_autoptr = Ptr[GtkFixedLayoutClass]
object GtkFixedLayoutClass_autoptr: 
  given _tag: Tag[GtkFixedLayoutClass_autoptr] = Tag.Ptr[GtkFixedLayoutClass](GtkFixedLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkFixedLayoutClass]): GtkFixedLayoutClass_autoptr = o
  extension (v: GtkFixedLayoutClass_autoptr)
    inline def value: Ptr[GtkFixedLayoutClass] = v

opaque type GtkFixedLayoutClass_listautoptr = Ptr[GList]
object GtkFixedLayoutClass_listautoptr: 
  given _tag: Tag[GtkFixedLayoutClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkFixedLayoutClass_listautoptr = o
  extension (v: GtkFixedLayoutClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkFixedLayoutClass_queueautoptr = Ptr[GQueue]
object GtkFixedLayoutClass_queueautoptr: 
  given _tag: Tag[GtkFixedLayoutClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkFixedLayoutClass_queueautoptr = o
  extension (v: GtkFixedLayoutClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkFixedLayoutClass_slistautoptr = Ptr[GSList]
object GtkFixedLayoutClass_slistautoptr: 
  given _tag: Tag[GtkFixedLayoutClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkFixedLayoutClass_slistautoptr = o
  extension (v: GtkFixedLayoutClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkFixedLayout_autoptr = Ptr[GtkFixedLayout]
object GtkFixedLayout_autoptr: 
  given _tag: Tag[GtkFixedLayout_autoptr] = Tag.Ptr[GtkFixedLayout](GtkFixedLayout._tag)
  inline def apply(inline o: Ptr[GtkFixedLayout]): GtkFixedLayout_autoptr = o
  extension (v: GtkFixedLayout_autoptr)
    inline def value: Ptr[GtkFixedLayout] = v

opaque type GtkFixedLayout_listautoptr = Ptr[GList]
object GtkFixedLayout_listautoptr: 
  given _tag: Tag[GtkFixedLayout_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkFixedLayout_listautoptr = o
  extension (v: GtkFixedLayout_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkFixedLayout_queueautoptr = Ptr[GQueue]
object GtkFixedLayout_queueautoptr: 
  given _tag: Tag[GtkFixedLayout_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkFixedLayout_queueautoptr = o
  extension (v: GtkFixedLayout_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkFixedLayout_slistautoptr = Ptr[GSList]
object GtkFixedLayout_slistautoptr: 
  given _tag: Tag[GtkFixedLayout_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkFixedLayout_slistautoptr = o
  extension (v: GtkFixedLayout_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkFixed_autoptr = Ptr[GtkFixed]
object GtkFixed_autoptr: 
  given _tag: Tag[GtkFixed_autoptr] = Tag.Ptr[GtkFixed](GtkFixed._tag)
  inline def apply(inline o: Ptr[GtkFixed]): GtkFixed_autoptr = o
  extension (v: GtkFixed_autoptr)
    inline def value: Ptr[GtkFixed] = v

opaque type GtkFixed_listautoptr = Ptr[GList]
object GtkFixed_listautoptr: 
  given _tag: Tag[GtkFixed_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkFixed_listautoptr = o
  extension (v: GtkFixed_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkFixed_queueautoptr = Ptr[GQueue]
object GtkFixed_queueautoptr: 
  given _tag: Tag[GtkFixed_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkFixed_queueautoptr = o
  extension (v: GtkFixed_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkFixed_slistautoptr = Ptr[GSList]
object GtkFixed_slistautoptr: 
  given _tag: Tag[GtkFixed_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkFixed_slistautoptr = o
  extension (v: GtkFixed_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkFlattenListModelClass_autoptr = Ptr[GtkFlattenListModelClass]
object GtkFlattenListModelClass_autoptr: 
  given _tag: Tag[GtkFlattenListModelClass_autoptr] = Tag.Ptr[GtkFlattenListModelClass](GtkFlattenListModelClass._tag)
  inline def apply(inline o: Ptr[GtkFlattenListModelClass]): GtkFlattenListModelClass_autoptr = o
  extension (v: GtkFlattenListModelClass_autoptr)
    inline def value: Ptr[GtkFlattenListModelClass] = v

opaque type GtkFlattenListModelClass_listautoptr = Ptr[GList]
object GtkFlattenListModelClass_listautoptr: 
  given _tag: Tag[GtkFlattenListModelClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkFlattenListModelClass_listautoptr = o
  extension (v: GtkFlattenListModelClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkFlattenListModelClass_queueautoptr = Ptr[GQueue]
object GtkFlattenListModelClass_queueautoptr: 
  given _tag: Tag[GtkFlattenListModelClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkFlattenListModelClass_queueautoptr = o
  extension (v: GtkFlattenListModelClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkFlattenListModelClass_slistautoptr = Ptr[GSList]
object GtkFlattenListModelClass_slistautoptr: 
  given _tag: Tag[GtkFlattenListModelClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkFlattenListModelClass_slistautoptr = o
  extension (v: GtkFlattenListModelClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkFlattenListModel_autoptr = Ptr[GtkFlattenListModel]
object GtkFlattenListModel_autoptr: 
  given _tag: Tag[GtkFlattenListModel_autoptr] = Tag.Ptr[GtkFlattenListModel](GtkFlattenListModel._tag)
  inline def apply(inline o: Ptr[GtkFlattenListModel]): GtkFlattenListModel_autoptr = o
  extension (v: GtkFlattenListModel_autoptr)
    inline def value: Ptr[GtkFlattenListModel] = v

opaque type GtkFlattenListModel_listautoptr = Ptr[GList]
object GtkFlattenListModel_listautoptr: 
  given _tag: Tag[GtkFlattenListModel_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkFlattenListModel_listautoptr = o
  extension (v: GtkFlattenListModel_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkFlattenListModel_queueautoptr = Ptr[GQueue]
object GtkFlattenListModel_queueautoptr: 
  given _tag: Tag[GtkFlattenListModel_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkFlattenListModel_queueautoptr = o
  extension (v: GtkFlattenListModel_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkFlattenListModel_slistautoptr = Ptr[GSList]
object GtkFlattenListModel_slistautoptr: 
  given _tag: Tag[GtkFlattenListModel_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkFlattenListModel_slistautoptr = o
  extension (v: GtkFlattenListModel_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkFlowBoxChild_autoptr = Ptr[GtkFlowBoxChild]
object GtkFlowBoxChild_autoptr: 
  given _tag: Tag[GtkFlowBoxChild_autoptr] = Tag.Ptr[GtkFlowBoxChild](GtkFlowBoxChild._tag)
  inline def apply(inline o: Ptr[GtkFlowBoxChild]): GtkFlowBoxChild_autoptr = o
  extension (v: GtkFlowBoxChild_autoptr)
    inline def value: Ptr[GtkFlowBoxChild] = v

opaque type GtkFlowBoxChild_listautoptr = Ptr[GList]
object GtkFlowBoxChild_listautoptr: 
  given _tag: Tag[GtkFlowBoxChild_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkFlowBoxChild_listautoptr = o
  extension (v: GtkFlowBoxChild_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkFlowBoxChild_queueautoptr = Ptr[GQueue]
object GtkFlowBoxChild_queueautoptr: 
  given _tag: Tag[GtkFlowBoxChild_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkFlowBoxChild_queueautoptr = o
  extension (v: GtkFlowBoxChild_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkFlowBoxChild_slistautoptr = Ptr[GSList]
object GtkFlowBoxChild_slistautoptr: 
  given _tag: Tag[GtkFlowBoxChild_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkFlowBoxChild_slistautoptr = o
  extension (v: GtkFlowBoxChild_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkFlowBoxCreateWidgetFunc = CFuncPtr2[gpointer, gpointer, Ptr[GtkWidget]]
object GtkFlowBoxCreateWidgetFunc: 
  given _tag: Tag[GtkFlowBoxCreateWidgetFunc] = Tag.materializeCFuncPtr2[gpointer, gpointer, Ptr[GtkWidget]]
  inline def apply(inline o: CFuncPtr2[gpointer, gpointer, Ptr[GtkWidget]]): GtkFlowBoxCreateWidgetFunc = o
  extension (v: GtkFlowBoxCreateWidgetFunc)
    inline def value: CFuncPtr2[gpointer, gpointer, Ptr[GtkWidget]] = v

opaque type GtkFlowBoxFilterFunc = CFuncPtr2[Ptr[GtkFlowBoxChild], gpointer, gboolean]
object GtkFlowBoxFilterFunc: 
  given _tag: Tag[GtkFlowBoxFilterFunc] = Tag.materializeCFuncPtr2[Ptr[GtkFlowBoxChild], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr2[Ptr[GtkFlowBoxChild], gpointer, gboolean]): GtkFlowBoxFilterFunc = o
  extension (v: GtkFlowBoxFilterFunc)
    inline def value: CFuncPtr2[Ptr[GtkFlowBoxChild], gpointer, gboolean] = v

opaque type GtkFlowBoxForeachFunc = CFuncPtr3[Ptr[GtkFlowBox], Ptr[GtkFlowBoxChild], gpointer, Unit]
object GtkFlowBoxForeachFunc: 
  given _tag: Tag[GtkFlowBoxForeachFunc] = Tag.materializeCFuncPtr3[Ptr[GtkFlowBox], Ptr[GtkFlowBoxChild], gpointer, Unit]
  inline def apply(inline o: CFuncPtr3[Ptr[GtkFlowBox], Ptr[GtkFlowBoxChild], gpointer, Unit]): GtkFlowBoxForeachFunc = o
  extension (v: GtkFlowBoxForeachFunc)
    inline def value: CFuncPtr3[Ptr[GtkFlowBox], Ptr[GtkFlowBoxChild], gpointer, Unit] = v

opaque type GtkFlowBoxSortFunc = CFuncPtr3[Ptr[GtkFlowBoxChild], Ptr[GtkFlowBoxChild], gpointer, CInt]
object GtkFlowBoxSortFunc: 
  given _tag: Tag[GtkFlowBoxSortFunc] = Tag.materializeCFuncPtr3[Ptr[GtkFlowBoxChild], Ptr[GtkFlowBoxChild], gpointer, CInt]
  inline def apply(inline o: CFuncPtr3[Ptr[GtkFlowBoxChild], Ptr[GtkFlowBoxChild], gpointer, CInt]): GtkFlowBoxSortFunc = o
  extension (v: GtkFlowBoxSortFunc)
    inline def value: CFuncPtr3[Ptr[GtkFlowBoxChild], Ptr[GtkFlowBoxChild], gpointer, CInt] = v

opaque type GtkFlowBox_autoptr = Ptr[GtkFlowBox]
object GtkFlowBox_autoptr: 
  given _tag: Tag[GtkFlowBox_autoptr] = Tag.Ptr[GtkFlowBox](GtkFlowBox._tag)
  inline def apply(inline o: Ptr[GtkFlowBox]): GtkFlowBox_autoptr = o
  extension (v: GtkFlowBox_autoptr)
    inline def value: Ptr[GtkFlowBox] = v

opaque type GtkFlowBox_listautoptr = Ptr[GList]
object GtkFlowBox_listautoptr: 
  given _tag: Tag[GtkFlowBox_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkFlowBox_listautoptr = o
  extension (v: GtkFlowBox_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkFlowBox_queueautoptr = Ptr[GQueue]
object GtkFlowBox_queueautoptr: 
  given _tag: Tag[GtkFlowBox_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkFlowBox_queueautoptr = o
  extension (v: GtkFlowBox_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkFlowBox_slistautoptr = Ptr[GSList]
object GtkFlowBox_slistautoptr: 
  given _tag: Tag[GtkFlowBox_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkFlowBox_slistautoptr = o
  extension (v: GtkFlowBox_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkFontButton_autoptr = Ptr[GtkFontButton]
object GtkFontButton_autoptr: 
  given _tag: Tag[GtkFontButton_autoptr] = Tag.Ptr[GtkFontButton](GtkFontButton._tag)
  inline def apply(inline o: Ptr[GtkFontButton]): GtkFontButton_autoptr = o
  extension (v: GtkFontButton_autoptr)
    inline def value: Ptr[GtkFontButton] = v

opaque type GtkFontButton_listautoptr = Ptr[GList]
object GtkFontButton_listautoptr: 
  given _tag: Tag[GtkFontButton_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkFontButton_listautoptr = o
  extension (v: GtkFontButton_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkFontButton_queueautoptr = Ptr[GQueue]
object GtkFontButton_queueautoptr: 
  given _tag: Tag[GtkFontButton_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkFontButton_queueautoptr = o
  extension (v: GtkFontButton_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkFontButton_slistautoptr = Ptr[GSList]
object GtkFontButton_slistautoptr: 
  given _tag: Tag[GtkFontButton_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkFontButton_slistautoptr = o
  extension (v: GtkFontButton_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkFontChooserDialog_autoptr = Ptr[GtkFontChooserDialog]
object GtkFontChooserDialog_autoptr: 
  given _tag: Tag[GtkFontChooserDialog_autoptr] = Tag.Ptr[GtkFontChooserDialog](GtkFontChooserDialog._tag)
  inline def apply(inline o: Ptr[GtkFontChooserDialog]): GtkFontChooserDialog_autoptr = o
  extension (v: GtkFontChooserDialog_autoptr)
    inline def value: Ptr[GtkFontChooserDialog] = v

opaque type GtkFontChooserDialog_listautoptr = Ptr[GList]
object GtkFontChooserDialog_listautoptr: 
  given _tag: Tag[GtkFontChooserDialog_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkFontChooserDialog_listautoptr = o
  extension (v: GtkFontChooserDialog_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkFontChooserDialog_queueautoptr = Ptr[GQueue]
object GtkFontChooserDialog_queueautoptr: 
  given _tag: Tag[GtkFontChooserDialog_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkFontChooserDialog_queueautoptr = o
  extension (v: GtkFontChooserDialog_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkFontChooserDialog_slistautoptr = Ptr[GSList]
object GtkFontChooserDialog_slistautoptr: 
  given _tag: Tag[GtkFontChooserDialog_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkFontChooserDialog_slistautoptr = o
  extension (v: GtkFontChooserDialog_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkFontChooserWidget_autoptr = Ptr[GtkFontChooserWidget]
object GtkFontChooserWidget_autoptr: 
  given _tag: Tag[GtkFontChooserWidget_autoptr] = Tag.Ptr[GtkFontChooserWidget](GtkFontChooserWidget._tag)
  inline def apply(inline o: Ptr[GtkFontChooserWidget]): GtkFontChooserWidget_autoptr = o
  extension (v: GtkFontChooserWidget_autoptr)
    inline def value: Ptr[GtkFontChooserWidget] = v

opaque type GtkFontChooserWidget_listautoptr = Ptr[GList]
object GtkFontChooserWidget_listautoptr: 
  given _tag: Tag[GtkFontChooserWidget_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkFontChooserWidget_listautoptr = o
  extension (v: GtkFontChooserWidget_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkFontChooserWidget_queueautoptr = Ptr[GQueue]
object GtkFontChooserWidget_queueautoptr: 
  given _tag: Tag[GtkFontChooserWidget_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkFontChooserWidget_queueautoptr = o
  extension (v: GtkFontChooserWidget_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkFontChooserWidget_slistautoptr = Ptr[GSList]
object GtkFontChooserWidget_slistautoptr: 
  given _tag: Tag[GtkFontChooserWidget_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkFontChooserWidget_slistautoptr = o
  extension (v: GtkFontChooserWidget_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkFontChooser_autoptr = Ptr[GtkFontChooser]
object GtkFontChooser_autoptr: 
  given _tag: Tag[GtkFontChooser_autoptr] = Tag.Ptr[GtkFontChooser](GtkFontChooser._tag)
  inline def apply(inline o: Ptr[GtkFontChooser]): GtkFontChooser_autoptr = o
  extension (v: GtkFontChooser_autoptr)
    inline def value: Ptr[GtkFontChooser] = v

opaque type GtkFontChooser_listautoptr = Ptr[GList]
object GtkFontChooser_listautoptr: 
  given _tag: Tag[GtkFontChooser_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkFontChooser_listautoptr = o
  extension (v: GtkFontChooser_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkFontChooser_queueautoptr = Ptr[GQueue]
object GtkFontChooser_queueautoptr: 
  given _tag: Tag[GtkFontChooser_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkFontChooser_queueautoptr = o
  extension (v: GtkFontChooser_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkFontChooser_slistautoptr = Ptr[GSList]
object GtkFontChooser_slistautoptr: 
  given _tag: Tag[GtkFontChooser_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkFontChooser_slistautoptr = o
  extension (v: GtkFontChooser_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkFontFilterFunc = CFuncPtr3[Ptr[PangoFontFamily], Ptr[PangoFontFace], gpointer, gboolean]
object GtkFontFilterFunc: 
  given _tag: Tag[GtkFontFilterFunc] = Tag.materializeCFuncPtr3[Ptr[PangoFontFamily], Ptr[PangoFontFace], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr3[Ptr[PangoFontFamily], Ptr[PangoFontFace], gpointer, gboolean]): GtkFontFilterFunc = o
  extension (v: GtkFontFilterFunc)
    inline def value: CFuncPtr3[Ptr[PangoFontFamily], Ptr[PangoFontFace], gpointer, gboolean] = v

opaque type GtkFrame_autoptr = Ptr[GtkFrame]
object GtkFrame_autoptr: 
  given _tag: Tag[GtkFrame_autoptr] = Tag.Ptr[GtkFrame](GtkFrame._tag)
  inline def apply(inline o: Ptr[GtkFrame]): GtkFrame_autoptr = o
  extension (v: GtkFrame_autoptr)
    inline def value: Ptr[GtkFrame] = v

opaque type GtkFrame_listautoptr = Ptr[GList]
object GtkFrame_listautoptr: 
  given _tag: Tag[GtkFrame_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkFrame_listautoptr = o
  extension (v: GtkFrame_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkFrame_queueautoptr = Ptr[GQueue]
object GtkFrame_queueautoptr: 
  given _tag: Tag[GtkFrame_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkFrame_queueautoptr = o
  extension (v: GtkFrame_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkFrame_slistautoptr = Ptr[GSList]
object GtkFrame_slistautoptr: 
  given _tag: Tag[GtkFrame_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkFrame_slistautoptr = o
  extension (v: GtkFrame_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkGLArea_autoptr = Ptr[GtkGLArea]
object GtkGLArea_autoptr: 
  given _tag: Tag[GtkGLArea_autoptr] = Tag.Ptr[GtkGLArea](GtkGLArea._tag)
  inline def apply(inline o: Ptr[GtkGLArea]): GtkGLArea_autoptr = o
  extension (v: GtkGLArea_autoptr)
    inline def value: Ptr[GtkGLArea] = v

opaque type GtkGLArea_listautoptr = Ptr[GList]
object GtkGLArea_listautoptr: 
  given _tag: Tag[GtkGLArea_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkGLArea_listautoptr = o
  extension (v: GtkGLArea_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkGLArea_queueautoptr = Ptr[GQueue]
object GtkGLArea_queueautoptr: 
  given _tag: Tag[GtkGLArea_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkGLArea_queueautoptr = o
  extension (v: GtkGLArea_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkGLArea_slistautoptr = Ptr[GSList]
object GtkGLArea_slistautoptr: 
  given _tag: Tag[GtkGLArea_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkGLArea_slistautoptr = o
  extension (v: GtkGLArea_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkGestureClick_autoptr = Ptr[GtkGestureClick]
object GtkGestureClick_autoptr: 
  given _tag: Tag[GtkGestureClick_autoptr] = Tag.Ptr[GtkGestureClick](GtkGestureClick._tag)
  inline def apply(inline o: Ptr[GtkGestureClick]): GtkGestureClick_autoptr = o
  extension (v: GtkGestureClick_autoptr)
    inline def value: Ptr[GtkGestureClick] = v

opaque type GtkGestureClick_listautoptr = Ptr[GList]
object GtkGestureClick_listautoptr: 
  given _tag: Tag[GtkGestureClick_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkGestureClick_listautoptr = o
  extension (v: GtkGestureClick_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkGestureClick_queueautoptr = Ptr[GQueue]
object GtkGestureClick_queueautoptr: 
  given _tag: Tag[GtkGestureClick_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkGestureClick_queueautoptr = o
  extension (v: GtkGestureClick_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkGestureClick_slistautoptr = Ptr[GSList]
object GtkGestureClick_slistautoptr: 
  given _tag: Tag[GtkGestureClick_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkGestureClick_slistautoptr = o
  extension (v: GtkGestureClick_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkGestureDrag_autoptr = Ptr[GtkGestureDrag]
object GtkGestureDrag_autoptr: 
  given _tag: Tag[GtkGestureDrag_autoptr] = Tag.Ptr[GtkGestureDrag](GtkGestureDrag._tag)
  inline def apply(inline o: Ptr[GtkGestureDrag]): GtkGestureDrag_autoptr = o
  extension (v: GtkGestureDrag_autoptr)
    inline def value: Ptr[GtkGestureDrag] = v

opaque type GtkGestureDrag_listautoptr = Ptr[GList]
object GtkGestureDrag_listautoptr: 
  given _tag: Tag[GtkGestureDrag_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkGestureDrag_listautoptr = o
  extension (v: GtkGestureDrag_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkGestureDrag_queueautoptr = Ptr[GQueue]
object GtkGestureDrag_queueautoptr: 
  given _tag: Tag[GtkGestureDrag_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkGestureDrag_queueautoptr = o
  extension (v: GtkGestureDrag_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkGestureDrag_slistautoptr = Ptr[GSList]
object GtkGestureDrag_slistautoptr: 
  given _tag: Tag[GtkGestureDrag_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkGestureDrag_slistautoptr = o
  extension (v: GtkGestureDrag_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkGestureLongPress_autoptr = Ptr[GtkGestureLongPress]
object GtkGestureLongPress_autoptr: 
  given _tag: Tag[GtkGestureLongPress_autoptr] = Tag.Ptr[GtkGestureLongPress](GtkGestureLongPress._tag)
  inline def apply(inline o: Ptr[GtkGestureLongPress]): GtkGestureLongPress_autoptr = o
  extension (v: GtkGestureLongPress_autoptr)
    inline def value: Ptr[GtkGestureLongPress] = v

opaque type GtkGestureLongPress_listautoptr = Ptr[GList]
object GtkGestureLongPress_listautoptr: 
  given _tag: Tag[GtkGestureLongPress_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkGestureLongPress_listautoptr = o
  extension (v: GtkGestureLongPress_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkGestureLongPress_queueautoptr = Ptr[GQueue]
object GtkGestureLongPress_queueautoptr: 
  given _tag: Tag[GtkGestureLongPress_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkGestureLongPress_queueautoptr = o
  extension (v: GtkGestureLongPress_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkGestureLongPress_slistautoptr = Ptr[GSList]
object GtkGestureLongPress_slistautoptr: 
  given _tag: Tag[GtkGestureLongPress_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkGestureLongPress_slistautoptr = o
  extension (v: GtkGestureLongPress_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkGesturePan_autoptr = Ptr[GtkGesturePan]
object GtkGesturePan_autoptr: 
  given _tag: Tag[GtkGesturePan_autoptr] = Tag.Ptr[GtkGesturePan](GtkGesturePan._tag)
  inline def apply(inline o: Ptr[GtkGesturePan]): GtkGesturePan_autoptr = o
  extension (v: GtkGesturePan_autoptr)
    inline def value: Ptr[GtkGesturePan] = v

opaque type GtkGesturePan_listautoptr = Ptr[GList]
object GtkGesturePan_listautoptr: 
  given _tag: Tag[GtkGesturePan_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkGesturePan_listautoptr = o
  extension (v: GtkGesturePan_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkGesturePan_queueautoptr = Ptr[GQueue]
object GtkGesturePan_queueautoptr: 
  given _tag: Tag[GtkGesturePan_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkGesturePan_queueautoptr = o
  extension (v: GtkGesturePan_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkGesturePan_slistautoptr = Ptr[GSList]
object GtkGesturePan_slistautoptr: 
  given _tag: Tag[GtkGesturePan_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkGesturePan_slistautoptr = o
  extension (v: GtkGesturePan_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkGestureRotate_autoptr = Ptr[GtkGestureRotate]
object GtkGestureRotate_autoptr: 
  given _tag: Tag[GtkGestureRotate_autoptr] = Tag.Ptr[GtkGestureRotate](GtkGestureRotate._tag)
  inline def apply(inline o: Ptr[GtkGestureRotate]): GtkGestureRotate_autoptr = o
  extension (v: GtkGestureRotate_autoptr)
    inline def value: Ptr[GtkGestureRotate] = v

opaque type GtkGestureRotate_listautoptr = Ptr[GList]
object GtkGestureRotate_listautoptr: 
  given _tag: Tag[GtkGestureRotate_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkGestureRotate_listautoptr = o
  extension (v: GtkGestureRotate_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkGestureRotate_queueautoptr = Ptr[GQueue]
object GtkGestureRotate_queueautoptr: 
  given _tag: Tag[GtkGestureRotate_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkGestureRotate_queueautoptr = o
  extension (v: GtkGestureRotate_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkGestureRotate_slistautoptr = Ptr[GSList]
object GtkGestureRotate_slistautoptr: 
  given _tag: Tag[GtkGestureRotate_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkGestureRotate_slistautoptr = o
  extension (v: GtkGestureRotate_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkGestureSingle_autoptr = Ptr[GtkGestureSingle]
object GtkGestureSingle_autoptr: 
  given _tag: Tag[GtkGestureSingle_autoptr] = Tag.Ptr[GtkGestureSingle](GtkGestureSingle._tag)
  inline def apply(inline o: Ptr[GtkGestureSingle]): GtkGestureSingle_autoptr = o
  extension (v: GtkGestureSingle_autoptr)
    inline def value: Ptr[GtkGestureSingle] = v

opaque type GtkGestureSingle_listautoptr = Ptr[GList]
object GtkGestureSingle_listautoptr: 
  given _tag: Tag[GtkGestureSingle_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkGestureSingle_listautoptr = o
  extension (v: GtkGestureSingle_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkGestureSingle_queueautoptr = Ptr[GQueue]
object GtkGestureSingle_queueautoptr: 
  given _tag: Tag[GtkGestureSingle_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkGestureSingle_queueautoptr = o
  extension (v: GtkGestureSingle_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkGestureSingle_slistautoptr = Ptr[GSList]
object GtkGestureSingle_slistautoptr: 
  given _tag: Tag[GtkGestureSingle_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkGestureSingle_slistautoptr = o
  extension (v: GtkGestureSingle_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkGestureSwipe_autoptr = Ptr[GtkGestureSwipe]
object GtkGestureSwipe_autoptr: 
  given _tag: Tag[GtkGestureSwipe_autoptr] = Tag.Ptr[GtkGestureSwipe](GtkGestureSwipe._tag)
  inline def apply(inline o: Ptr[GtkGestureSwipe]): GtkGestureSwipe_autoptr = o
  extension (v: GtkGestureSwipe_autoptr)
    inline def value: Ptr[GtkGestureSwipe] = v

opaque type GtkGestureSwipe_listautoptr = Ptr[GList]
object GtkGestureSwipe_listautoptr: 
  given _tag: Tag[GtkGestureSwipe_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkGestureSwipe_listautoptr = o
  extension (v: GtkGestureSwipe_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkGestureSwipe_queueautoptr = Ptr[GQueue]
object GtkGestureSwipe_queueautoptr: 
  given _tag: Tag[GtkGestureSwipe_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkGestureSwipe_queueautoptr = o
  extension (v: GtkGestureSwipe_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkGestureSwipe_slistautoptr = Ptr[GSList]
object GtkGestureSwipe_slistautoptr: 
  given _tag: Tag[GtkGestureSwipe_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkGestureSwipe_slistautoptr = o
  extension (v: GtkGestureSwipe_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkGestureZoom_autoptr = Ptr[GtkGestureZoom]
object GtkGestureZoom_autoptr: 
  given _tag: Tag[GtkGestureZoom_autoptr] = Tag.Ptr[GtkGestureZoom](GtkGestureZoom._tag)
  inline def apply(inline o: Ptr[GtkGestureZoom]): GtkGestureZoom_autoptr = o
  extension (v: GtkGestureZoom_autoptr)
    inline def value: Ptr[GtkGestureZoom] = v

opaque type GtkGestureZoom_listautoptr = Ptr[GList]
object GtkGestureZoom_listautoptr: 
  given _tag: Tag[GtkGestureZoom_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkGestureZoom_listautoptr = o
  extension (v: GtkGestureZoom_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkGestureZoom_queueautoptr = Ptr[GQueue]
object GtkGestureZoom_queueautoptr: 
  given _tag: Tag[GtkGestureZoom_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkGestureZoom_queueautoptr = o
  extension (v: GtkGestureZoom_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkGestureZoom_slistautoptr = Ptr[GSList]
object GtkGestureZoom_slistautoptr: 
  given _tag: Tag[GtkGestureZoom_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkGestureZoom_slistautoptr = o
  extension (v: GtkGestureZoom_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkGesture_autoptr = Ptr[GtkGesture]
object GtkGesture_autoptr: 
  given _tag: Tag[GtkGesture_autoptr] = Tag.Ptr[GtkGesture](GtkGesture._tag)
  inline def apply(inline o: Ptr[GtkGesture]): GtkGesture_autoptr = o
  extension (v: GtkGesture_autoptr)
    inline def value: Ptr[GtkGesture] = v

opaque type GtkGesture_listautoptr = Ptr[GList]
object GtkGesture_listautoptr: 
  given _tag: Tag[GtkGesture_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkGesture_listautoptr = o
  extension (v: GtkGesture_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkGesture_queueautoptr = Ptr[GQueue]
object GtkGesture_queueautoptr: 
  given _tag: Tag[GtkGesture_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkGesture_queueautoptr = o
  extension (v: GtkGesture_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkGesture_slistautoptr = Ptr[GSList]
object GtkGesture_slistautoptr: 
  given _tag: Tag[GtkGesture_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkGesture_slistautoptr = o
  extension (v: GtkGesture_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkGridLayoutChildClass_autoptr = Ptr[GtkGridLayoutChildClass]
object GtkGridLayoutChildClass_autoptr: 
  given _tag: Tag[GtkGridLayoutChildClass_autoptr] = Tag.Ptr[GtkGridLayoutChildClass](GtkGridLayoutChildClass._tag)
  inline def apply(inline o: Ptr[GtkGridLayoutChildClass]): GtkGridLayoutChildClass_autoptr = o
  extension (v: GtkGridLayoutChildClass_autoptr)
    inline def value: Ptr[GtkGridLayoutChildClass] = v

opaque type GtkGridLayoutChildClass_listautoptr = Ptr[GList]
object GtkGridLayoutChildClass_listautoptr: 
  given _tag: Tag[GtkGridLayoutChildClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkGridLayoutChildClass_listautoptr = o
  extension (v: GtkGridLayoutChildClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkGridLayoutChildClass_queueautoptr = Ptr[GQueue]
object GtkGridLayoutChildClass_queueautoptr: 
  given _tag: Tag[GtkGridLayoutChildClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkGridLayoutChildClass_queueautoptr = o
  extension (v: GtkGridLayoutChildClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkGridLayoutChildClass_slistautoptr = Ptr[GSList]
object GtkGridLayoutChildClass_slistautoptr: 
  given _tag: Tag[GtkGridLayoutChildClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkGridLayoutChildClass_slistautoptr = o
  extension (v: GtkGridLayoutChildClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkGridLayoutChild_autoptr = Ptr[GtkGridLayoutChild]
object GtkGridLayoutChild_autoptr: 
  given _tag: Tag[GtkGridLayoutChild_autoptr] = Tag.Ptr[GtkGridLayoutChild](GtkGridLayoutChild._tag)
  inline def apply(inline o: Ptr[GtkGridLayoutChild]): GtkGridLayoutChild_autoptr = o
  extension (v: GtkGridLayoutChild_autoptr)
    inline def value: Ptr[GtkGridLayoutChild] = v

opaque type GtkGridLayoutChild_listautoptr = Ptr[GList]
object GtkGridLayoutChild_listautoptr: 
  given _tag: Tag[GtkGridLayoutChild_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkGridLayoutChild_listautoptr = o
  extension (v: GtkGridLayoutChild_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkGridLayoutChild_queueautoptr = Ptr[GQueue]
object GtkGridLayoutChild_queueautoptr: 
  given _tag: Tag[GtkGridLayoutChild_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkGridLayoutChild_queueautoptr = o
  extension (v: GtkGridLayoutChild_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkGridLayoutChild_slistautoptr = Ptr[GSList]
object GtkGridLayoutChild_slistautoptr: 
  given _tag: Tag[GtkGridLayoutChild_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkGridLayoutChild_slistautoptr = o
  extension (v: GtkGridLayoutChild_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkGridLayoutClass_autoptr = Ptr[GtkGridLayoutClass]
object GtkGridLayoutClass_autoptr: 
  given _tag: Tag[GtkGridLayoutClass_autoptr] = Tag.Ptr[GtkGridLayoutClass](GtkGridLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkGridLayoutClass]): GtkGridLayoutClass_autoptr = o
  extension (v: GtkGridLayoutClass_autoptr)
    inline def value: Ptr[GtkGridLayoutClass] = v

opaque type GtkGridLayoutClass_listautoptr = Ptr[GList]
object GtkGridLayoutClass_listautoptr: 
  given _tag: Tag[GtkGridLayoutClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkGridLayoutClass_listautoptr = o
  extension (v: GtkGridLayoutClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkGridLayoutClass_queueautoptr = Ptr[GQueue]
object GtkGridLayoutClass_queueautoptr: 
  given _tag: Tag[GtkGridLayoutClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkGridLayoutClass_queueautoptr = o
  extension (v: GtkGridLayoutClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkGridLayoutClass_slistautoptr = Ptr[GSList]
object GtkGridLayoutClass_slistautoptr: 
  given _tag: Tag[GtkGridLayoutClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkGridLayoutClass_slistautoptr = o
  extension (v: GtkGridLayoutClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkGridLayout_autoptr = Ptr[GtkGridLayout]
object GtkGridLayout_autoptr: 
  given _tag: Tag[GtkGridLayout_autoptr] = Tag.Ptr[GtkGridLayout](GtkGridLayout._tag)
  inline def apply(inline o: Ptr[GtkGridLayout]): GtkGridLayout_autoptr = o
  extension (v: GtkGridLayout_autoptr)
    inline def value: Ptr[GtkGridLayout] = v

opaque type GtkGridLayout_listautoptr = Ptr[GList]
object GtkGridLayout_listautoptr: 
  given _tag: Tag[GtkGridLayout_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkGridLayout_listautoptr = o
  extension (v: GtkGridLayout_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkGridLayout_queueautoptr = Ptr[GQueue]
object GtkGridLayout_queueautoptr: 
  given _tag: Tag[GtkGridLayout_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkGridLayout_queueautoptr = o
  extension (v: GtkGridLayout_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkGridLayout_slistautoptr = Ptr[GSList]
object GtkGridLayout_slistautoptr: 
  given _tag: Tag[GtkGridLayout_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkGridLayout_slistautoptr = o
  extension (v: GtkGridLayout_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkGridView_autoptr = Ptr[GtkGridView]
object GtkGridView_autoptr: 
  given _tag: Tag[GtkGridView_autoptr] = Tag.Ptr[GtkGridView](GtkGridView._tag)
  inline def apply(inline o: Ptr[GtkGridView]): GtkGridView_autoptr = o
  extension (v: GtkGridView_autoptr)
    inline def value: Ptr[GtkGridView] = v

opaque type GtkGridView_listautoptr = Ptr[GList]
object GtkGridView_listautoptr: 
  given _tag: Tag[GtkGridView_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkGridView_listautoptr = o
  extension (v: GtkGridView_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkGridView_queueautoptr = Ptr[GQueue]
object GtkGridView_queueautoptr: 
  given _tag: Tag[GtkGridView_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkGridView_queueautoptr = o
  extension (v: GtkGridView_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkGridView_slistautoptr = Ptr[GSList]
object GtkGridView_slistautoptr: 
  given _tag: Tag[GtkGridView_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkGridView_slistautoptr = o
  extension (v: GtkGridView_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkGrid_autoptr = Ptr[GtkGrid]
object GtkGrid_autoptr: 
  given _tag: Tag[GtkGrid_autoptr] = Tag.Ptr[GtkGrid](GtkGrid._tag)
  inline def apply(inline o: Ptr[GtkGrid]): GtkGrid_autoptr = o
  extension (v: GtkGrid_autoptr)
    inline def value: Ptr[GtkGrid] = v

opaque type GtkGrid_listautoptr = Ptr[GList]
object GtkGrid_listautoptr: 
  given _tag: Tag[GtkGrid_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkGrid_listautoptr = o
  extension (v: GtkGrid_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkGrid_queueautoptr = Ptr[GQueue]
object GtkGrid_queueautoptr: 
  given _tag: Tag[GtkGrid_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkGrid_queueautoptr = o
  extension (v: GtkGrid_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkGrid_slistautoptr = Ptr[GSList]
object GtkGrid_slistautoptr: 
  given _tag: Tag[GtkGrid_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkGrid_slistautoptr = o
  extension (v: GtkGrid_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkHeaderBar_autoptr = Ptr[GtkHeaderBar]
object GtkHeaderBar_autoptr: 
  given _tag: Tag[GtkHeaderBar_autoptr] = Tag.Ptr[GtkHeaderBar](GtkHeaderBar._tag)
  inline def apply(inline o: Ptr[GtkHeaderBar]): GtkHeaderBar_autoptr = o
  extension (v: GtkHeaderBar_autoptr)
    inline def value: Ptr[GtkHeaderBar] = v

opaque type GtkHeaderBar_listautoptr = Ptr[GList]
object GtkHeaderBar_listautoptr: 
  given _tag: Tag[GtkHeaderBar_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkHeaderBar_listautoptr = o
  extension (v: GtkHeaderBar_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkHeaderBar_queueautoptr = Ptr[GQueue]
object GtkHeaderBar_queueautoptr: 
  given _tag: Tag[GtkHeaderBar_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkHeaderBar_queueautoptr = o
  extension (v: GtkHeaderBar_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkHeaderBar_slistautoptr = Ptr[GSList]
object GtkHeaderBar_slistautoptr: 
  given _tag: Tag[GtkHeaderBar_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkHeaderBar_slistautoptr = o
  extension (v: GtkHeaderBar_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkIMContextSimple_autoptr = Ptr[GtkIMContextSimple]
object GtkIMContextSimple_autoptr: 
  given _tag: Tag[GtkIMContextSimple_autoptr] = Tag.Ptr[GtkIMContextSimple](GtkIMContextSimple._tag)
  inline def apply(inline o: Ptr[GtkIMContextSimple]): GtkIMContextSimple_autoptr = o
  extension (v: GtkIMContextSimple_autoptr)
    inline def value: Ptr[GtkIMContextSimple] = v

opaque type GtkIMContextSimple_listautoptr = Ptr[GList]
object GtkIMContextSimple_listautoptr: 
  given _tag: Tag[GtkIMContextSimple_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkIMContextSimple_listautoptr = o
  extension (v: GtkIMContextSimple_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkIMContextSimple_queueautoptr = Ptr[GQueue]
object GtkIMContextSimple_queueautoptr: 
  given _tag: Tag[GtkIMContextSimple_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkIMContextSimple_queueautoptr = o
  extension (v: GtkIMContextSimple_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkIMContextSimple_slistautoptr = Ptr[GSList]
object GtkIMContextSimple_slistautoptr: 
  given _tag: Tag[GtkIMContextSimple_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkIMContextSimple_slistautoptr = o
  extension (v: GtkIMContextSimple_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkIMContext_autoptr = Ptr[GtkIMContext]
object GtkIMContext_autoptr: 
  given _tag: Tag[GtkIMContext_autoptr] = Tag.Ptr[GtkIMContext](GtkIMContext._tag)
  inline def apply(inline o: Ptr[GtkIMContext]): GtkIMContext_autoptr = o
  extension (v: GtkIMContext_autoptr)
    inline def value: Ptr[GtkIMContext] = v

opaque type GtkIMContext_listautoptr = Ptr[GList]
object GtkIMContext_listautoptr: 
  given _tag: Tag[GtkIMContext_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkIMContext_listautoptr = o
  extension (v: GtkIMContext_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkIMContext_queueautoptr = Ptr[GQueue]
object GtkIMContext_queueautoptr: 
  given _tag: Tag[GtkIMContext_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkIMContext_queueautoptr = o
  extension (v: GtkIMContext_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkIMContext_slistautoptr = Ptr[GSList]
object GtkIMContext_slistautoptr: 
  given _tag: Tag[GtkIMContext_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkIMContext_slistautoptr = o
  extension (v: GtkIMContext_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkIMMulticontext_autoptr = Ptr[GtkIMMulticontext]
object GtkIMMulticontext_autoptr: 
  given _tag: Tag[GtkIMMulticontext_autoptr] = Tag.Ptr[GtkIMMulticontext](GtkIMMulticontext._tag)
  inline def apply(inline o: Ptr[GtkIMMulticontext]): GtkIMMulticontext_autoptr = o
  extension (v: GtkIMMulticontext_autoptr)
    inline def value: Ptr[GtkIMMulticontext] = v

opaque type GtkIMMulticontext_listautoptr = Ptr[GList]
object GtkIMMulticontext_listautoptr: 
  given _tag: Tag[GtkIMMulticontext_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkIMMulticontext_listautoptr = o
  extension (v: GtkIMMulticontext_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkIMMulticontext_queueautoptr = Ptr[GQueue]
object GtkIMMulticontext_queueautoptr: 
  given _tag: Tag[GtkIMMulticontext_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkIMMulticontext_queueautoptr = o
  extension (v: GtkIMMulticontext_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkIMMulticontext_slistautoptr = Ptr[GSList]
object GtkIMMulticontext_slistautoptr: 
  given _tag: Tag[GtkIMMulticontext_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkIMMulticontext_slistautoptr = o
  extension (v: GtkIMMulticontext_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkIconPaintable_autoptr = Ptr[GtkIconPaintable]
object GtkIconPaintable_autoptr: 
  given _tag: Tag[GtkIconPaintable_autoptr] = Tag.Ptr[GtkIconPaintable](GtkIconPaintable._tag)
  inline def apply(inline o: Ptr[GtkIconPaintable]): GtkIconPaintable_autoptr = o
  extension (v: GtkIconPaintable_autoptr)
    inline def value: Ptr[GtkIconPaintable] = v

opaque type GtkIconPaintable_listautoptr = Ptr[GList]
object GtkIconPaintable_listautoptr: 
  given _tag: Tag[GtkIconPaintable_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkIconPaintable_listautoptr = o
  extension (v: GtkIconPaintable_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkIconPaintable_queueautoptr = Ptr[GQueue]
object GtkIconPaintable_queueautoptr: 
  given _tag: Tag[GtkIconPaintable_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkIconPaintable_queueautoptr = o
  extension (v: GtkIconPaintable_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkIconPaintable_slistautoptr = Ptr[GSList]
object GtkIconPaintable_slistautoptr: 
  given _tag: Tag[GtkIconPaintable_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkIconPaintable_slistautoptr = o
  extension (v: GtkIconPaintable_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkIconTheme_autoptr = Ptr[GtkIconTheme]
object GtkIconTheme_autoptr: 
  given _tag: Tag[GtkIconTheme_autoptr] = Tag.Ptr[GtkIconTheme](GtkIconTheme._tag)
  inline def apply(inline o: Ptr[GtkIconTheme]): GtkIconTheme_autoptr = o
  extension (v: GtkIconTheme_autoptr)
    inline def value: Ptr[GtkIconTheme] = v

opaque type GtkIconTheme_listautoptr = Ptr[GList]
object GtkIconTheme_listautoptr: 
  given _tag: Tag[GtkIconTheme_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkIconTheme_listautoptr = o
  extension (v: GtkIconTheme_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkIconTheme_queueautoptr = Ptr[GQueue]
object GtkIconTheme_queueautoptr: 
  given _tag: Tag[GtkIconTheme_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkIconTheme_queueautoptr = o
  extension (v: GtkIconTheme_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkIconTheme_slistautoptr = Ptr[GSList]
object GtkIconTheme_slistautoptr: 
  given _tag: Tag[GtkIconTheme_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkIconTheme_slistautoptr = o
  extension (v: GtkIconTheme_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkIconViewForeachFunc = CFuncPtr3[Ptr[GtkIconView], Ptr[GtkTreePath], gpointer, Unit]
object GtkIconViewForeachFunc: 
  given _tag: Tag[GtkIconViewForeachFunc] = Tag.materializeCFuncPtr3[Ptr[GtkIconView], Ptr[GtkTreePath], gpointer, Unit]
  inline def apply(inline o: CFuncPtr3[Ptr[GtkIconView], Ptr[GtkTreePath], gpointer, Unit]): GtkIconViewForeachFunc = o
  extension (v: GtkIconViewForeachFunc)
    inline def value: CFuncPtr3[Ptr[GtkIconView], Ptr[GtkTreePath], gpointer, Unit] = v

opaque type GtkIconView_autoptr = Ptr[GtkIconView]
object GtkIconView_autoptr: 
  given _tag: Tag[GtkIconView_autoptr] = Tag.Ptr[GtkIconView](GtkIconView._tag)
  inline def apply(inline o: Ptr[GtkIconView]): GtkIconView_autoptr = o
  extension (v: GtkIconView_autoptr)
    inline def value: Ptr[GtkIconView] = v

opaque type GtkIconView_listautoptr = Ptr[GList]
object GtkIconView_listautoptr: 
  given _tag: Tag[GtkIconView_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkIconView_listautoptr = o
  extension (v: GtkIconView_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkIconView_queueautoptr = Ptr[GQueue]
object GtkIconView_queueautoptr: 
  given _tag: Tag[GtkIconView_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkIconView_queueautoptr = o
  extension (v: GtkIconView_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkIconView_slistautoptr = Ptr[GSList]
object GtkIconView_slistautoptr: 
  given _tag: Tag[GtkIconView_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkIconView_slistautoptr = o
  extension (v: GtkIconView_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkImage_autoptr = Ptr[GtkImage]
object GtkImage_autoptr: 
  given _tag: Tag[GtkImage_autoptr] = Tag.Ptr[GtkImage](GtkImage._tag)
  inline def apply(inline o: Ptr[GtkImage]): GtkImage_autoptr = o
  extension (v: GtkImage_autoptr)
    inline def value: Ptr[GtkImage] = v

opaque type GtkImage_listautoptr = Ptr[GList]
object GtkImage_listautoptr: 
  given _tag: Tag[GtkImage_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkImage_listautoptr = o
  extension (v: GtkImage_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkImage_queueautoptr = Ptr[GQueue]
object GtkImage_queueautoptr: 
  given _tag: Tag[GtkImage_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkImage_queueautoptr = o
  extension (v: GtkImage_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkImage_slistautoptr = Ptr[GSList]
object GtkImage_slistautoptr: 
  given _tag: Tag[GtkImage_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkImage_slistautoptr = o
  extension (v: GtkImage_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkInfoBar_autoptr = Ptr[GtkInfoBar]
object GtkInfoBar_autoptr: 
  given _tag: Tag[GtkInfoBar_autoptr] = Tag.Ptr[GtkInfoBar](GtkInfoBar._tag)
  inline def apply(inline o: Ptr[GtkInfoBar]): GtkInfoBar_autoptr = o
  extension (v: GtkInfoBar_autoptr)
    inline def value: Ptr[GtkInfoBar] = v

opaque type GtkInfoBar_listautoptr = Ptr[GList]
object GtkInfoBar_listautoptr: 
  given _tag: Tag[GtkInfoBar_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkInfoBar_listautoptr = o
  extension (v: GtkInfoBar_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkInfoBar_queueautoptr = Ptr[GQueue]
object GtkInfoBar_queueautoptr: 
  given _tag: Tag[GtkInfoBar_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkInfoBar_queueautoptr = o
  extension (v: GtkInfoBar_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkInfoBar_slistautoptr = Ptr[GSList]
object GtkInfoBar_slistautoptr: 
  given _tag: Tag[GtkInfoBar_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkInfoBar_slistautoptr = o
  extension (v: GtkInfoBar_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkKeyvalTriggerClass_autoptr = Ptr[GtkKeyvalTriggerClass]
object GtkKeyvalTriggerClass_autoptr: 
  given _tag: Tag[GtkKeyvalTriggerClass_autoptr] = Tag.Ptr[GtkKeyvalTriggerClass](GtkKeyvalTriggerClass._tag)
  inline def apply(inline o: Ptr[GtkKeyvalTriggerClass]): GtkKeyvalTriggerClass_autoptr = o
  extension (v: GtkKeyvalTriggerClass_autoptr)
    inline def value: Ptr[GtkKeyvalTriggerClass] = v

opaque type GtkKeyvalTriggerClass_listautoptr = Ptr[GList]
object GtkKeyvalTriggerClass_listautoptr: 
  given _tag: Tag[GtkKeyvalTriggerClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkKeyvalTriggerClass_listautoptr = o
  extension (v: GtkKeyvalTriggerClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkKeyvalTriggerClass_queueautoptr = Ptr[GQueue]
object GtkKeyvalTriggerClass_queueautoptr: 
  given _tag: Tag[GtkKeyvalTriggerClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkKeyvalTriggerClass_queueautoptr = o
  extension (v: GtkKeyvalTriggerClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkKeyvalTriggerClass_slistautoptr = Ptr[GSList]
object GtkKeyvalTriggerClass_slistautoptr: 
  given _tag: Tag[GtkKeyvalTriggerClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkKeyvalTriggerClass_slistautoptr = o
  extension (v: GtkKeyvalTriggerClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkKeyvalTrigger_autoptr = Ptr[GtkKeyvalTrigger]
object GtkKeyvalTrigger_autoptr: 
  given _tag: Tag[GtkKeyvalTrigger_autoptr] = Tag.Ptr[GtkKeyvalTrigger](GtkKeyvalTrigger._tag)
  inline def apply(inline o: Ptr[GtkKeyvalTrigger]): GtkKeyvalTrigger_autoptr = o
  extension (v: GtkKeyvalTrigger_autoptr)
    inline def value: Ptr[GtkKeyvalTrigger] = v

opaque type GtkKeyvalTrigger_listautoptr = Ptr[GList]
object GtkKeyvalTrigger_listautoptr: 
  given _tag: Tag[GtkKeyvalTrigger_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkKeyvalTrigger_listautoptr = o
  extension (v: GtkKeyvalTrigger_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkKeyvalTrigger_queueautoptr = Ptr[GQueue]
object GtkKeyvalTrigger_queueautoptr: 
  given _tag: Tag[GtkKeyvalTrigger_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkKeyvalTrigger_queueautoptr = o
  extension (v: GtkKeyvalTrigger_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkKeyvalTrigger_slistautoptr = Ptr[GSList]
object GtkKeyvalTrigger_slistautoptr: 
  given _tag: Tag[GtkKeyvalTrigger_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkKeyvalTrigger_slistautoptr = o
  extension (v: GtkKeyvalTrigger_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkLabel_autoptr = Ptr[GtkLabel]
object GtkLabel_autoptr: 
  given _tag: Tag[GtkLabel_autoptr] = Tag.Ptr[GtkLabel](GtkLabel._tag)
  inline def apply(inline o: Ptr[GtkLabel]): GtkLabel_autoptr = o
  extension (v: GtkLabel_autoptr)
    inline def value: Ptr[GtkLabel] = v

opaque type GtkLabel_listautoptr = Ptr[GList]
object GtkLabel_listautoptr: 
  given _tag: Tag[GtkLabel_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkLabel_listautoptr = o
  extension (v: GtkLabel_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkLabel_queueautoptr = Ptr[GQueue]
object GtkLabel_queueautoptr: 
  given _tag: Tag[GtkLabel_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkLabel_queueautoptr = o
  extension (v: GtkLabel_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkLabel_slistautoptr = Ptr[GSList]
object GtkLabel_slistautoptr: 
  given _tag: Tag[GtkLabel_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkLabel_slistautoptr = o
  extension (v: GtkLabel_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkLayoutChildClass_autoptr = Ptr[GtkLayoutChildClass]
object GtkLayoutChildClass_autoptr: 
  given _tag: Tag[GtkLayoutChildClass_autoptr] = Tag.Ptr[GtkLayoutChildClass](GtkLayoutChildClass._tag)
  inline def apply(inline o: Ptr[GtkLayoutChildClass]): GtkLayoutChildClass_autoptr = o
  extension (v: GtkLayoutChildClass_autoptr)
    inline def value: Ptr[GtkLayoutChildClass] = v

opaque type GtkLayoutChildClass_listautoptr = Ptr[GList]
object GtkLayoutChildClass_listautoptr: 
  given _tag: Tag[GtkLayoutChildClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkLayoutChildClass_listautoptr = o
  extension (v: GtkLayoutChildClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkLayoutChildClass_queueautoptr = Ptr[GQueue]
object GtkLayoutChildClass_queueautoptr: 
  given _tag: Tag[GtkLayoutChildClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkLayoutChildClass_queueautoptr = o
  extension (v: GtkLayoutChildClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkLayoutChildClass_slistautoptr = Ptr[GSList]
object GtkLayoutChildClass_slistautoptr: 
  given _tag: Tag[GtkLayoutChildClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkLayoutChildClass_slistautoptr = o
  extension (v: GtkLayoutChildClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkLayoutChild_autoptr = Ptr[GtkLayoutChild]
object GtkLayoutChild_autoptr: 
  given _tag: Tag[GtkLayoutChild_autoptr] = Tag.Ptr[GtkLayoutChild](GtkLayoutChild._tag)
  inline def apply(inline o: Ptr[GtkLayoutChild]): GtkLayoutChild_autoptr = o
  extension (v: GtkLayoutChild_autoptr)
    inline def value: Ptr[GtkLayoutChild] = v

opaque type GtkLayoutChild_listautoptr = Ptr[GList]
object GtkLayoutChild_listautoptr: 
  given _tag: Tag[GtkLayoutChild_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkLayoutChild_listautoptr = o
  extension (v: GtkLayoutChild_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkLayoutChild_queueautoptr = Ptr[GQueue]
object GtkLayoutChild_queueautoptr: 
  given _tag: Tag[GtkLayoutChild_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkLayoutChild_queueautoptr = o
  extension (v: GtkLayoutChild_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkLayoutChild_slistautoptr = Ptr[GSList]
object GtkLayoutChild_slistautoptr: 
  given _tag: Tag[GtkLayoutChild_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkLayoutChild_slistautoptr = o
  extension (v: GtkLayoutChild_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkLayoutManagerClass_autoptr = Ptr[GtkLayoutManagerClass]
object GtkLayoutManagerClass_autoptr: 
  given _tag: Tag[GtkLayoutManagerClass_autoptr] = Tag.Ptr[GtkLayoutManagerClass](GtkLayoutManagerClass._tag)
  inline def apply(inline o: Ptr[GtkLayoutManagerClass]): GtkLayoutManagerClass_autoptr = o
  extension (v: GtkLayoutManagerClass_autoptr)
    inline def value: Ptr[GtkLayoutManagerClass] = v

opaque type GtkLayoutManagerClass_listautoptr = Ptr[GList]
object GtkLayoutManagerClass_listautoptr: 
  given _tag: Tag[GtkLayoutManagerClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkLayoutManagerClass_listautoptr = o
  extension (v: GtkLayoutManagerClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkLayoutManagerClass_queueautoptr = Ptr[GQueue]
object GtkLayoutManagerClass_queueautoptr: 
  given _tag: Tag[GtkLayoutManagerClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkLayoutManagerClass_queueautoptr = o
  extension (v: GtkLayoutManagerClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkLayoutManagerClass_slistautoptr = Ptr[GSList]
object GtkLayoutManagerClass_slistautoptr: 
  given _tag: Tag[GtkLayoutManagerClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkLayoutManagerClass_slistautoptr = o
  extension (v: GtkLayoutManagerClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkLayoutManager_autoptr = Ptr[GtkLayoutManager]
object GtkLayoutManager_autoptr: 
  given _tag: Tag[GtkLayoutManager_autoptr] = Tag.Ptr[GtkLayoutManager](GtkLayoutManager._tag)
  inline def apply(inline o: Ptr[GtkLayoutManager]): GtkLayoutManager_autoptr = o
  extension (v: GtkLayoutManager_autoptr)
    inline def value: Ptr[GtkLayoutManager] = v

opaque type GtkLayoutManager_listautoptr = Ptr[GList]
object GtkLayoutManager_listautoptr: 
  given _tag: Tag[GtkLayoutManager_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkLayoutManager_listautoptr = o
  extension (v: GtkLayoutManager_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkLayoutManager_queueautoptr = Ptr[GQueue]
object GtkLayoutManager_queueautoptr: 
  given _tag: Tag[GtkLayoutManager_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkLayoutManager_queueautoptr = o
  extension (v: GtkLayoutManager_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkLayoutManager_slistautoptr = Ptr[GSList]
object GtkLayoutManager_slistautoptr: 
  given _tag: Tag[GtkLayoutManager_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkLayoutManager_slistautoptr = o
  extension (v: GtkLayoutManager_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkLevelBar_autoptr = Ptr[GtkLevelBar]
object GtkLevelBar_autoptr: 
  given _tag: Tag[GtkLevelBar_autoptr] = Tag.Ptr[GtkLevelBar](GtkLevelBar._tag)
  inline def apply(inline o: Ptr[GtkLevelBar]): GtkLevelBar_autoptr = o
  extension (v: GtkLevelBar_autoptr)
    inline def value: Ptr[GtkLevelBar] = v

opaque type GtkLevelBar_listautoptr = Ptr[GList]
object GtkLevelBar_listautoptr: 
  given _tag: Tag[GtkLevelBar_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkLevelBar_listautoptr = o
  extension (v: GtkLevelBar_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkLevelBar_queueautoptr = Ptr[GQueue]
object GtkLevelBar_queueautoptr: 
  given _tag: Tag[GtkLevelBar_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkLevelBar_queueautoptr = o
  extension (v: GtkLevelBar_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkLevelBar_slistautoptr = Ptr[GSList]
object GtkLevelBar_slistautoptr: 
  given _tag: Tag[GtkLevelBar_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkLevelBar_slistautoptr = o
  extension (v: GtkLevelBar_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkLinkButton_autoptr = Ptr[GtkLinkButton]
object GtkLinkButton_autoptr: 
  given _tag: Tag[GtkLinkButton_autoptr] = Tag.Ptr[GtkLinkButton](GtkLinkButton._tag)
  inline def apply(inline o: Ptr[GtkLinkButton]): GtkLinkButton_autoptr = o
  extension (v: GtkLinkButton_autoptr)
    inline def value: Ptr[GtkLinkButton] = v

opaque type GtkLinkButton_listautoptr = Ptr[GList]
object GtkLinkButton_listautoptr: 
  given _tag: Tag[GtkLinkButton_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkLinkButton_listautoptr = o
  extension (v: GtkLinkButton_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkLinkButton_queueautoptr = Ptr[GQueue]
object GtkLinkButton_queueautoptr: 
  given _tag: Tag[GtkLinkButton_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkLinkButton_queueautoptr = o
  extension (v: GtkLinkButton_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkLinkButton_slistautoptr = Ptr[GSList]
object GtkLinkButton_slistautoptr: 
  given _tag: Tag[GtkLinkButton_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkLinkButton_slistautoptr = o
  extension (v: GtkLinkButton_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkListBoxCreateWidgetFunc = CFuncPtr2[gpointer, gpointer, Ptr[GtkWidget]]
object GtkListBoxCreateWidgetFunc: 
  given _tag: Tag[GtkListBoxCreateWidgetFunc] = Tag.materializeCFuncPtr2[gpointer, gpointer, Ptr[GtkWidget]]
  inline def apply(inline o: CFuncPtr2[gpointer, gpointer, Ptr[GtkWidget]]): GtkListBoxCreateWidgetFunc = o
  extension (v: GtkListBoxCreateWidgetFunc)
    inline def value: CFuncPtr2[gpointer, gpointer, Ptr[GtkWidget]] = v

opaque type GtkListBoxFilterFunc = CFuncPtr2[Ptr[GtkListBoxRow], gpointer, gboolean]
object GtkListBoxFilterFunc: 
  given _tag: Tag[GtkListBoxFilterFunc] = Tag.materializeCFuncPtr2[Ptr[GtkListBoxRow], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr2[Ptr[GtkListBoxRow], gpointer, gboolean]): GtkListBoxFilterFunc = o
  extension (v: GtkListBoxFilterFunc)
    inline def value: CFuncPtr2[Ptr[GtkListBoxRow], gpointer, gboolean] = v

opaque type GtkListBoxForeachFunc = CFuncPtr3[Ptr[GtkListBox], Ptr[GtkListBoxRow], gpointer, Unit]
object GtkListBoxForeachFunc: 
  given _tag: Tag[GtkListBoxForeachFunc] = Tag.materializeCFuncPtr3[Ptr[GtkListBox], Ptr[GtkListBoxRow], gpointer, Unit]
  inline def apply(inline o: CFuncPtr3[Ptr[GtkListBox], Ptr[GtkListBoxRow], gpointer, Unit]): GtkListBoxForeachFunc = o
  extension (v: GtkListBoxForeachFunc)
    inline def value: CFuncPtr3[Ptr[GtkListBox], Ptr[GtkListBoxRow], gpointer, Unit] = v

opaque type GtkListBoxRow_autoptr = Ptr[GtkListBoxRow]
object GtkListBoxRow_autoptr: 
  given _tag: Tag[GtkListBoxRow_autoptr] = Tag.Ptr[GtkListBoxRow](GtkListBoxRow._tag)
  inline def apply(inline o: Ptr[GtkListBoxRow]): GtkListBoxRow_autoptr = o
  extension (v: GtkListBoxRow_autoptr)
    inline def value: Ptr[GtkListBoxRow] = v

opaque type GtkListBoxRow_listautoptr = Ptr[GList]
object GtkListBoxRow_listautoptr: 
  given _tag: Tag[GtkListBoxRow_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkListBoxRow_listautoptr = o
  extension (v: GtkListBoxRow_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkListBoxRow_queueautoptr = Ptr[GQueue]
object GtkListBoxRow_queueautoptr: 
  given _tag: Tag[GtkListBoxRow_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkListBoxRow_queueautoptr = o
  extension (v: GtkListBoxRow_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkListBoxRow_slistautoptr = Ptr[GSList]
object GtkListBoxRow_slistautoptr: 
  given _tag: Tag[GtkListBoxRow_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkListBoxRow_slistautoptr = o
  extension (v: GtkListBoxRow_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkListBoxSortFunc = CFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], gpointer, CInt]
object GtkListBoxSortFunc: 
  given _tag: Tag[GtkListBoxSortFunc] = Tag.materializeCFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], gpointer, CInt]
  inline def apply(inline o: CFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], gpointer, CInt]): GtkListBoxSortFunc = o
  extension (v: GtkListBoxSortFunc)
    inline def value: CFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], gpointer, CInt] = v

opaque type GtkListBoxUpdateHeaderFunc = CFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], gpointer, Unit]
object GtkListBoxUpdateHeaderFunc: 
  given _tag: Tag[GtkListBoxUpdateHeaderFunc] = Tag.materializeCFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], gpointer, Unit]
  inline def apply(inline o: CFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], gpointer, Unit]): GtkListBoxUpdateHeaderFunc = o
  extension (v: GtkListBoxUpdateHeaderFunc)
    inline def value: CFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], gpointer, Unit] = v

opaque type GtkListBox_autoptr = Ptr[GtkListBox]
object GtkListBox_autoptr: 
  given _tag: Tag[GtkListBox_autoptr] = Tag.Ptr[GtkListBox](GtkListBox._tag)
  inline def apply(inline o: Ptr[GtkListBox]): GtkListBox_autoptr = o
  extension (v: GtkListBox_autoptr)
    inline def value: Ptr[GtkListBox] = v

opaque type GtkListBox_listautoptr = Ptr[GList]
object GtkListBox_listautoptr: 
  given _tag: Tag[GtkListBox_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkListBox_listautoptr = o
  extension (v: GtkListBox_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkListBox_queueautoptr = Ptr[GQueue]
object GtkListBox_queueautoptr: 
  given _tag: Tag[GtkListBox_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkListBox_queueautoptr = o
  extension (v: GtkListBox_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkListBox_slistautoptr = Ptr[GSList]
object GtkListBox_slistautoptr: 
  given _tag: Tag[GtkListBox_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkListBox_slistautoptr = o
  extension (v: GtkListBox_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkListItemFactory_autoptr = Ptr[GtkListItemFactory]
object GtkListItemFactory_autoptr: 
  given _tag: Tag[GtkListItemFactory_autoptr] = Tag.Ptr[GtkListItemFactory](GtkListItemFactory._tag)
  inline def apply(inline o: Ptr[GtkListItemFactory]): GtkListItemFactory_autoptr = o
  extension (v: GtkListItemFactory_autoptr)
    inline def value: Ptr[GtkListItemFactory] = v

opaque type GtkListItemFactory_listautoptr = Ptr[GList]
object GtkListItemFactory_listautoptr: 
  given _tag: Tag[GtkListItemFactory_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkListItemFactory_listautoptr = o
  extension (v: GtkListItemFactory_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkListItemFactory_queueautoptr = Ptr[GQueue]
object GtkListItemFactory_queueautoptr: 
  given _tag: Tag[GtkListItemFactory_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkListItemFactory_queueautoptr = o
  extension (v: GtkListItemFactory_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkListItemFactory_slistautoptr = Ptr[GSList]
object GtkListItemFactory_slistautoptr: 
  given _tag: Tag[GtkListItemFactory_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkListItemFactory_slistautoptr = o
  extension (v: GtkListItemFactory_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkListItem_autoptr = Ptr[GtkListItem]
object GtkListItem_autoptr: 
  given _tag: Tag[GtkListItem_autoptr] = Tag.Ptr[GtkListItem](GtkListItem._tag)
  inline def apply(inline o: Ptr[GtkListItem]): GtkListItem_autoptr = o
  extension (v: GtkListItem_autoptr)
    inline def value: Ptr[GtkListItem] = v

opaque type GtkListItem_listautoptr = Ptr[GList]
object GtkListItem_listautoptr: 
  given _tag: Tag[GtkListItem_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkListItem_listautoptr = o
  extension (v: GtkListItem_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkListItem_queueautoptr = Ptr[GQueue]
object GtkListItem_queueautoptr: 
  given _tag: Tag[GtkListItem_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkListItem_queueautoptr = o
  extension (v: GtkListItem_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkListItem_slistautoptr = Ptr[GSList]
object GtkListItem_slistautoptr: 
  given _tag: Tag[GtkListItem_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkListItem_slistautoptr = o
  extension (v: GtkListItem_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkListStore_autoptr = Ptr[GtkListStore]
object GtkListStore_autoptr: 
  given _tag: Tag[GtkListStore_autoptr] = Tag.Ptr[GtkListStore](GtkListStore._tag)
  inline def apply(inline o: Ptr[GtkListStore]): GtkListStore_autoptr = o
  extension (v: GtkListStore_autoptr)
    inline def value: Ptr[GtkListStore] = v

opaque type GtkListStore_listautoptr = Ptr[GList]
object GtkListStore_listautoptr: 
  given _tag: Tag[GtkListStore_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkListStore_listautoptr = o
  extension (v: GtkListStore_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkListStore_queueautoptr = Ptr[GQueue]
object GtkListStore_queueautoptr: 
  given _tag: Tag[GtkListStore_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkListStore_queueautoptr = o
  extension (v: GtkListStore_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkListStore_slistautoptr = Ptr[GSList]
object GtkListStore_slistautoptr: 
  given _tag: Tag[GtkListStore_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkListStore_slistautoptr = o
  extension (v: GtkListStore_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkListView_autoptr = Ptr[GtkListView]
object GtkListView_autoptr: 
  given _tag: Tag[GtkListView_autoptr] = Tag.Ptr[GtkListView](GtkListView._tag)
  inline def apply(inline o: Ptr[GtkListView]): GtkListView_autoptr = o
  extension (v: GtkListView_autoptr)
    inline def value: Ptr[GtkListView] = v

opaque type GtkListView_listautoptr = Ptr[GList]
object GtkListView_listautoptr: 
  given _tag: Tag[GtkListView_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkListView_listautoptr = o
  extension (v: GtkListView_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkListView_queueautoptr = Ptr[GQueue]
object GtkListView_queueautoptr: 
  given _tag: Tag[GtkListView_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkListView_queueautoptr = o
  extension (v: GtkListView_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkListView_slistautoptr = Ptr[GSList]
object GtkListView_slistautoptr: 
  given _tag: Tag[GtkListView_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkListView_slistautoptr = o
  extension (v: GtkListView_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkLockButton_autoptr = Ptr[GtkLockButton]
object GtkLockButton_autoptr: 
  given _tag: Tag[GtkLockButton_autoptr] = Tag.Ptr[GtkLockButton](GtkLockButton._tag)
  inline def apply(inline o: Ptr[GtkLockButton]): GtkLockButton_autoptr = o
  extension (v: GtkLockButton_autoptr)
    inline def value: Ptr[GtkLockButton] = v

opaque type GtkLockButton_listautoptr = Ptr[GList]
object GtkLockButton_listautoptr: 
  given _tag: Tag[GtkLockButton_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkLockButton_listautoptr = o
  extension (v: GtkLockButton_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkLockButton_queueautoptr = Ptr[GQueue]
object GtkLockButton_queueautoptr: 
  given _tag: Tag[GtkLockButton_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkLockButton_queueautoptr = o
  extension (v: GtkLockButton_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkLockButton_slistautoptr = Ptr[GSList]
object GtkLockButton_slistautoptr: 
  given _tag: Tag[GtkLockButton_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkLockButton_slistautoptr = o
  extension (v: GtkLockButton_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkMapListModelClass_autoptr = Ptr[GtkMapListModelClass]
object GtkMapListModelClass_autoptr: 
  given _tag: Tag[GtkMapListModelClass_autoptr] = Tag.Ptr[GtkMapListModelClass](GtkMapListModelClass._tag)
  inline def apply(inline o: Ptr[GtkMapListModelClass]): GtkMapListModelClass_autoptr = o
  extension (v: GtkMapListModelClass_autoptr)
    inline def value: Ptr[GtkMapListModelClass] = v

opaque type GtkMapListModelClass_listautoptr = Ptr[GList]
object GtkMapListModelClass_listautoptr: 
  given _tag: Tag[GtkMapListModelClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkMapListModelClass_listautoptr = o
  extension (v: GtkMapListModelClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkMapListModelClass_queueautoptr = Ptr[GQueue]
object GtkMapListModelClass_queueautoptr: 
  given _tag: Tag[GtkMapListModelClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkMapListModelClass_queueautoptr = o
  extension (v: GtkMapListModelClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkMapListModelClass_slistautoptr = Ptr[GSList]
object GtkMapListModelClass_slistautoptr: 
  given _tag: Tag[GtkMapListModelClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkMapListModelClass_slistautoptr = o
  extension (v: GtkMapListModelClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkMapListModelMapFunc = CFuncPtr2[gpointer, gpointer, gpointer]
object GtkMapListModelMapFunc: 
  given _tag: Tag[GtkMapListModelMapFunc] = Tag.materializeCFuncPtr2[gpointer, gpointer, gpointer]
  inline def apply(inline o: CFuncPtr2[gpointer, gpointer, gpointer]): GtkMapListModelMapFunc = o
  extension (v: GtkMapListModelMapFunc)
    inline def value: CFuncPtr2[gpointer, gpointer, gpointer] = v

opaque type GtkMapListModel_autoptr = Ptr[GtkMapListModel]
object GtkMapListModel_autoptr: 
  given _tag: Tag[GtkMapListModel_autoptr] = Tag.Ptr[GtkMapListModel](GtkMapListModel._tag)
  inline def apply(inline o: Ptr[GtkMapListModel]): GtkMapListModel_autoptr = o
  extension (v: GtkMapListModel_autoptr)
    inline def value: Ptr[GtkMapListModel] = v

opaque type GtkMapListModel_listautoptr = Ptr[GList]
object GtkMapListModel_listautoptr: 
  given _tag: Tag[GtkMapListModel_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkMapListModel_listautoptr = o
  extension (v: GtkMapListModel_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkMapListModel_queueautoptr = Ptr[GQueue]
object GtkMapListModel_queueautoptr: 
  given _tag: Tag[GtkMapListModel_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkMapListModel_queueautoptr = o
  extension (v: GtkMapListModel_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkMapListModel_slistautoptr = Ptr[GSList]
object GtkMapListModel_slistautoptr: 
  given _tag: Tag[GtkMapListModel_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkMapListModel_slistautoptr = o
  extension (v: GtkMapListModel_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkMediaControlsClass_autoptr = Ptr[GtkMediaControlsClass]
object GtkMediaControlsClass_autoptr: 
  given _tag: Tag[GtkMediaControlsClass_autoptr] = Tag.Ptr[GtkMediaControlsClass](GtkMediaControlsClass._tag)
  inline def apply(inline o: Ptr[GtkMediaControlsClass]): GtkMediaControlsClass_autoptr = o
  extension (v: GtkMediaControlsClass_autoptr)
    inline def value: Ptr[GtkMediaControlsClass] = v

opaque type GtkMediaControlsClass_listautoptr = Ptr[GList]
object GtkMediaControlsClass_listautoptr: 
  given _tag: Tag[GtkMediaControlsClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkMediaControlsClass_listautoptr = o
  extension (v: GtkMediaControlsClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkMediaControlsClass_queueautoptr = Ptr[GQueue]
object GtkMediaControlsClass_queueautoptr: 
  given _tag: Tag[GtkMediaControlsClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkMediaControlsClass_queueautoptr = o
  extension (v: GtkMediaControlsClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkMediaControlsClass_slistautoptr = Ptr[GSList]
object GtkMediaControlsClass_slistautoptr: 
  given _tag: Tag[GtkMediaControlsClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkMediaControlsClass_slistautoptr = o
  extension (v: GtkMediaControlsClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkMediaControls_autoptr = Ptr[GtkMediaControls]
object GtkMediaControls_autoptr: 
  given _tag: Tag[GtkMediaControls_autoptr] = Tag.Ptr[GtkMediaControls](GtkMediaControls._tag)
  inline def apply(inline o: Ptr[GtkMediaControls]): GtkMediaControls_autoptr = o
  extension (v: GtkMediaControls_autoptr)
    inline def value: Ptr[GtkMediaControls] = v

opaque type GtkMediaControls_listautoptr = Ptr[GList]
object GtkMediaControls_listautoptr: 
  given _tag: Tag[GtkMediaControls_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkMediaControls_listautoptr = o
  extension (v: GtkMediaControls_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkMediaControls_queueautoptr = Ptr[GQueue]
object GtkMediaControls_queueautoptr: 
  given _tag: Tag[GtkMediaControls_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkMediaControls_queueautoptr = o
  extension (v: GtkMediaControls_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkMediaControls_slistautoptr = Ptr[GSList]
object GtkMediaControls_slistautoptr: 
  given _tag: Tag[GtkMediaControls_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkMediaControls_slistautoptr = o
  extension (v: GtkMediaControls_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkMediaFileClass_autoptr = Ptr[GtkMediaFileClass]
object GtkMediaFileClass_autoptr: 
  given _tag: Tag[GtkMediaFileClass_autoptr] = Tag.Ptr[GtkMediaFileClass](GtkMediaFileClass._tag)
  inline def apply(inline o: Ptr[GtkMediaFileClass]): GtkMediaFileClass_autoptr = o
  extension (v: GtkMediaFileClass_autoptr)
    inline def value: Ptr[GtkMediaFileClass] = v

opaque type GtkMediaFileClass_listautoptr = Ptr[GList]
object GtkMediaFileClass_listautoptr: 
  given _tag: Tag[GtkMediaFileClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkMediaFileClass_listautoptr = o
  extension (v: GtkMediaFileClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkMediaFileClass_queueautoptr = Ptr[GQueue]
object GtkMediaFileClass_queueautoptr: 
  given _tag: Tag[GtkMediaFileClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkMediaFileClass_queueautoptr = o
  extension (v: GtkMediaFileClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkMediaFileClass_slistautoptr = Ptr[GSList]
object GtkMediaFileClass_slistautoptr: 
  given _tag: Tag[GtkMediaFileClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkMediaFileClass_slistautoptr = o
  extension (v: GtkMediaFileClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkMediaFile_autoptr = Ptr[GtkMediaFile]
object GtkMediaFile_autoptr: 
  given _tag: Tag[GtkMediaFile_autoptr] = Tag.Ptr[GtkMediaFile](GtkMediaFile._tag)
  inline def apply(inline o: Ptr[GtkMediaFile]): GtkMediaFile_autoptr = o
  extension (v: GtkMediaFile_autoptr)
    inline def value: Ptr[GtkMediaFile] = v

opaque type GtkMediaFile_listautoptr = Ptr[GList]
object GtkMediaFile_listautoptr: 
  given _tag: Tag[GtkMediaFile_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkMediaFile_listautoptr = o
  extension (v: GtkMediaFile_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkMediaFile_queueautoptr = Ptr[GQueue]
object GtkMediaFile_queueautoptr: 
  given _tag: Tag[GtkMediaFile_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkMediaFile_queueautoptr = o
  extension (v: GtkMediaFile_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkMediaFile_slistautoptr = Ptr[GSList]
object GtkMediaFile_slistautoptr: 
  given _tag: Tag[GtkMediaFile_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkMediaFile_slistautoptr = o
  extension (v: GtkMediaFile_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkMediaStreamClass_autoptr = Ptr[GtkMediaStreamClass]
object GtkMediaStreamClass_autoptr: 
  given _tag: Tag[GtkMediaStreamClass_autoptr] = Tag.Ptr[GtkMediaStreamClass](GtkMediaStreamClass._tag)
  inline def apply(inline o: Ptr[GtkMediaStreamClass]): GtkMediaStreamClass_autoptr = o
  extension (v: GtkMediaStreamClass_autoptr)
    inline def value: Ptr[GtkMediaStreamClass] = v

opaque type GtkMediaStreamClass_listautoptr = Ptr[GList]
object GtkMediaStreamClass_listautoptr: 
  given _tag: Tag[GtkMediaStreamClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkMediaStreamClass_listautoptr = o
  extension (v: GtkMediaStreamClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkMediaStreamClass_queueautoptr = Ptr[GQueue]
object GtkMediaStreamClass_queueautoptr: 
  given _tag: Tag[GtkMediaStreamClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkMediaStreamClass_queueautoptr = o
  extension (v: GtkMediaStreamClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkMediaStreamClass_slistautoptr = Ptr[GSList]
object GtkMediaStreamClass_slistautoptr: 
  given _tag: Tag[GtkMediaStreamClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkMediaStreamClass_slistautoptr = o
  extension (v: GtkMediaStreamClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkMediaStream_autoptr = Ptr[GtkMediaStream]
object GtkMediaStream_autoptr: 
  given _tag: Tag[GtkMediaStream_autoptr] = Tag.Ptr[GtkMediaStream](GtkMediaStream._tag)
  inline def apply(inline o: Ptr[GtkMediaStream]): GtkMediaStream_autoptr = o
  extension (v: GtkMediaStream_autoptr)
    inline def value: Ptr[GtkMediaStream] = v

opaque type GtkMediaStream_listautoptr = Ptr[GList]
object GtkMediaStream_listautoptr: 
  given _tag: Tag[GtkMediaStream_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkMediaStream_listautoptr = o
  extension (v: GtkMediaStream_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkMediaStream_queueautoptr = Ptr[GQueue]
object GtkMediaStream_queueautoptr: 
  given _tag: Tag[GtkMediaStream_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkMediaStream_queueautoptr = o
  extension (v: GtkMediaStream_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkMediaStream_slistautoptr = Ptr[GSList]
object GtkMediaStream_slistautoptr: 
  given _tag: Tag[GtkMediaStream_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkMediaStream_slistautoptr = o
  extension (v: GtkMediaStream_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkMenuButtonCreatePopupFunc = CFuncPtr2[Ptr[GtkMenuButton], gpointer, Unit]
object GtkMenuButtonCreatePopupFunc: 
  given _tag: Tag[GtkMenuButtonCreatePopupFunc] = Tag.materializeCFuncPtr2[Ptr[GtkMenuButton], gpointer, Unit]
  inline def apply(inline o: CFuncPtr2[Ptr[GtkMenuButton], gpointer, Unit]): GtkMenuButtonCreatePopupFunc = o
  extension (v: GtkMenuButtonCreatePopupFunc)
    inline def value: CFuncPtr2[Ptr[GtkMenuButton], gpointer, Unit] = v

opaque type GtkMenuButton_autoptr = Ptr[GtkMenuButton]
object GtkMenuButton_autoptr: 
  given _tag: Tag[GtkMenuButton_autoptr] = Tag.Ptr[GtkMenuButton](GtkMenuButton._tag)
  inline def apply(inline o: Ptr[GtkMenuButton]): GtkMenuButton_autoptr = o
  extension (v: GtkMenuButton_autoptr)
    inline def value: Ptr[GtkMenuButton] = v

opaque type GtkMenuButton_listautoptr = Ptr[GList]
object GtkMenuButton_listautoptr: 
  given _tag: Tag[GtkMenuButton_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkMenuButton_listautoptr = o
  extension (v: GtkMenuButton_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkMenuButton_queueautoptr = Ptr[GQueue]
object GtkMenuButton_queueautoptr: 
  given _tag: Tag[GtkMenuButton_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkMenuButton_queueautoptr = o
  extension (v: GtkMenuButton_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkMenuButton_slistautoptr = Ptr[GSList]
object GtkMenuButton_slistautoptr: 
  given _tag: Tag[GtkMenuButton_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkMenuButton_slistautoptr = o
  extension (v: GtkMenuButton_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkMessageDialog_autoptr = Ptr[GtkMessageDialog]
object GtkMessageDialog_autoptr: 
  given _tag: Tag[GtkMessageDialog_autoptr] = Tag.Ptr[GtkMessageDialog](GtkMessageDialog._tag)
  inline def apply(inline o: Ptr[GtkMessageDialog]): GtkMessageDialog_autoptr = o
  extension (v: GtkMessageDialog_autoptr)
    inline def value: Ptr[GtkMessageDialog] = v

opaque type GtkMessageDialog_listautoptr = Ptr[GList]
object GtkMessageDialog_listautoptr: 
  given _tag: Tag[GtkMessageDialog_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkMessageDialog_listautoptr = o
  extension (v: GtkMessageDialog_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkMessageDialog_queueautoptr = Ptr[GQueue]
object GtkMessageDialog_queueautoptr: 
  given _tag: Tag[GtkMessageDialog_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkMessageDialog_queueautoptr = o
  extension (v: GtkMessageDialog_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkMessageDialog_slistautoptr = Ptr[GSList]
object GtkMessageDialog_slistautoptr: 
  given _tag: Tag[GtkMessageDialog_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkMessageDialog_slistautoptr = o
  extension (v: GtkMessageDialog_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkMnemonicActionClass_autoptr = Ptr[GtkMnemonicActionClass]
object GtkMnemonicActionClass_autoptr: 
  given _tag: Tag[GtkMnemonicActionClass_autoptr] = Tag.Ptr[GtkMnemonicActionClass](GtkMnemonicActionClass._tag)
  inline def apply(inline o: Ptr[GtkMnemonicActionClass]): GtkMnemonicActionClass_autoptr = o
  extension (v: GtkMnemonicActionClass_autoptr)
    inline def value: Ptr[GtkMnemonicActionClass] = v

opaque type GtkMnemonicActionClass_listautoptr = Ptr[GList]
object GtkMnemonicActionClass_listautoptr: 
  given _tag: Tag[GtkMnemonicActionClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkMnemonicActionClass_listautoptr = o
  extension (v: GtkMnemonicActionClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkMnemonicActionClass_queueautoptr = Ptr[GQueue]
object GtkMnemonicActionClass_queueautoptr: 
  given _tag: Tag[GtkMnemonicActionClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkMnemonicActionClass_queueautoptr = o
  extension (v: GtkMnemonicActionClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkMnemonicActionClass_slistautoptr = Ptr[GSList]
object GtkMnemonicActionClass_slistautoptr: 
  given _tag: Tag[GtkMnemonicActionClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkMnemonicActionClass_slistautoptr = o
  extension (v: GtkMnemonicActionClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkMnemonicAction_autoptr = Ptr[GtkMnemonicAction]
object GtkMnemonicAction_autoptr: 
  given _tag: Tag[GtkMnemonicAction_autoptr] = Tag.Ptr[GtkMnemonicAction](GtkMnemonicAction._tag)
  inline def apply(inline o: Ptr[GtkMnemonicAction]): GtkMnemonicAction_autoptr = o
  extension (v: GtkMnemonicAction_autoptr)
    inline def value: Ptr[GtkMnemonicAction] = v

opaque type GtkMnemonicAction_listautoptr = Ptr[GList]
object GtkMnemonicAction_listautoptr: 
  given _tag: Tag[GtkMnemonicAction_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkMnemonicAction_listautoptr = o
  extension (v: GtkMnemonicAction_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkMnemonicAction_queueautoptr = Ptr[GQueue]
object GtkMnemonicAction_queueautoptr: 
  given _tag: Tag[GtkMnemonicAction_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkMnemonicAction_queueautoptr = o
  extension (v: GtkMnemonicAction_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkMnemonicAction_slistautoptr = Ptr[GSList]
object GtkMnemonicAction_slistautoptr: 
  given _tag: Tag[GtkMnemonicAction_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkMnemonicAction_slistautoptr = o
  extension (v: GtkMnemonicAction_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkMnemonicTriggerClass_autoptr = Ptr[GtkMnemonicTriggerClass]
object GtkMnemonicTriggerClass_autoptr: 
  given _tag: Tag[GtkMnemonicTriggerClass_autoptr] = Tag.Ptr[GtkMnemonicTriggerClass](GtkMnemonicTriggerClass._tag)
  inline def apply(inline o: Ptr[GtkMnemonicTriggerClass]): GtkMnemonicTriggerClass_autoptr = o
  extension (v: GtkMnemonicTriggerClass_autoptr)
    inline def value: Ptr[GtkMnemonicTriggerClass] = v

opaque type GtkMnemonicTriggerClass_listautoptr = Ptr[GList]
object GtkMnemonicTriggerClass_listautoptr: 
  given _tag: Tag[GtkMnemonicTriggerClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkMnemonicTriggerClass_listautoptr = o
  extension (v: GtkMnemonicTriggerClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkMnemonicTriggerClass_queueautoptr = Ptr[GQueue]
object GtkMnemonicTriggerClass_queueautoptr: 
  given _tag: Tag[GtkMnemonicTriggerClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkMnemonicTriggerClass_queueautoptr = o
  extension (v: GtkMnemonicTriggerClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkMnemonicTriggerClass_slistautoptr = Ptr[GSList]
object GtkMnemonicTriggerClass_slistautoptr: 
  given _tag: Tag[GtkMnemonicTriggerClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkMnemonicTriggerClass_slistautoptr = o
  extension (v: GtkMnemonicTriggerClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkMnemonicTrigger_autoptr = Ptr[GtkMnemonicTrigger]
object GtkMnemonicTrigger_autoptr: 
  given _tag: Tag[GtkMnemonicTrigger_autoptr] = Tag.Ptr[GtkMnemonicTrigger](GtkMnemonicTrigger._tag)
  inline def apply(inline o: Ptr[GtkMnemonicTrigger]): GtkMnemonicTrigger_autoptr = o
  extension (v: GtkMnemonicTrigger_autoptr)
    inline def value: Ptr[GtkMnemonicTrigger] = v

opaque type GtkMnemonicTrigger_listautoptr = Ptr[GList]
object GtkMnemonicTrigger_listautoptr: 
  given _tag: Tag[GtkMnemonicTrigger_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkMnemonicTrigger_listautoptr = o
  extension (v: GtkMnemonicTrigger_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkMnemonicTrigger_queueautoptr = Ptr[GQueue]
object GtkMnemonicTrigger_queueautoptr: 
  given _tag: Tag[GtkMnemonicTrigger_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkMnemonicTrigger_queueautoptr = o
  extension (v: GtkMnemonicTrigger_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkMnemonicTrigger_slistautoptr = Ptr[GSList]
object GtkMnemonicTrigger_slistautoptr: 
  given _tag: Tag[GtkMnemonicTrigger_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkMnemonicTrigger_slistautoptr = o
  extension (v: GtkMnemonicTrigger_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkMountOperation_autoptr = Ptr[GtkMountOperation]
object GtkMountOperation_autoptr: 
  given _tag: Tag[GtkMountOperation_autoptr] = Tag.Ptr[GtkMountOperation](GtkMountOperation._tag)
  inline def apply(inline o: Ptr[GtkMountOperation]): GtkMountOperation_autoptr = o
  extension (v: GtkMountOperation_autoptr)
    inline def value: Ptr[GtkMountOperation] = v

opaque type GtkMountOperation_listautoptr = Ptr[GList]
object GtkMountOperation_listautoptr: 
  given _tag: Tag[GtkMountOperation_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkMountOperation_listautoptr = o
  extension (v: GtkMountOperation_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkMountOperation_queueautoptr = Ptr[GQueue]
object GtkMountOperation_queueautoptr: 
  given _tag: Tag[GtkMountOperation_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkMountOperation_queueautoptr = o
  extension (v: GtkMountOperation_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkMountOperation_slistautoptr = Ptr[GSList]
object GtkMountOperation_slistautoptr: 
  given _tag: Tag[GtkMountOperation_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkMountOperation_slistautoptr = o
  extension (v: GtkMountOperation_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkMultiFilterClass_autoptr = Ptr[GtkMultiFilterClass]
object GtkMultiFilterClass_autoptr: 
  given _tag: Tag[GtkMultiFilterClass_autoptr] = Tag.Ptr[GtkMultiFilterClass](GtkMultiFilterClass._tag)
  inline def apply(inline o: Ptr[GtkMultiFilterClass]): GtkMultiFilterClass_autoptr = o
  extension (v: GtkMultiFilterClass_autoptr)
    inline def value: Ptr[GtkMultiFilterClass] = v

opaque type GtkMultiFilterClass_listautoptr = Ptr[GList]
object GtkMultiFilterClass_listautoptr: 
  given _tag: Tag[GtkMultiFilterClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkMultiFilterClass_listautoptr = o
  extension (v: GtkMultiFilterClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkMultiFilterClass_queueautoptr = Ptr[GQueue]
object GtkMultiFilterClass_queueautoptr: 
  given _tag: Tag[GtkMultiFilterClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkMultiFilterClass_queueautoptr = o
  extension (v: GtkMultiFilterClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkMultiFilterClass_slistautoptr = Ptr[GSList]
object GtkMultiFilterClass_slistautoptr: 
  given _tag: Tag[GtkMultiFilterClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkMultiFilterClass_slistautoptr = o
  extension (v: GtkMultiFilterClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkMultiFilter_autoptr = Ptr[GtkMultiFilter]
object GtkMultiFilter_autoptr: 
  given _tag: Tag[GtkMultiFilter_autoptr] = Tag.Ptr[GtkMultiFilter](GtkMultiFilter._tag)
  inline def apply(inline o: Ptr[GtkMultiFilter]): GtkMultiFilter_autoptr = o
  extension (v: GtkMultiFilter_autoptr)
    inline def value: Ptr[GtkMultiFilter] = v

opaque type GtkMultiFilter_listautoptr = Ptr[GList]
object GtkMultiFilter_listautoptr: 
  given _tag: Tag[GtkMultiFilter_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkMultiFilter_listautoptr = o
  extension (v: GtkMultiFilter_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkMultiFilter_queueautoptr = Ptr[GQueue]
object GtkMultiFilter_queueautoptr: 
  given _tag: Tag[GtkMultiFilter_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkMultiFilter_queueautoptr = o
  extension (v: GtkMultiFilter_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkMultiFilter_slistautoptr = Ptr[GSList]
object GtkMultiFilter_slistautoptr: 
  given _tag: Tag[GtkMultiFilter_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkMultiFilter_slistautoptr = o
  extension (v: GtkMultiFilter_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkMultiSelectionClass_autoptr = Ptr[GtkMultiSelectionClass]
object GtkMultiSelectionClass_autoptr: 
  given _tag: Tag[GtkMultiSelectionClass_autoptr] = Tag.Ptr[GtkMultiSelectionClass](GtkMultiSelectionClass._tag)
  inline def apply(inline o: Ptr[GtkMultiSelectionClass]): GtkMultiSelectionClass_autoptr = o
  extension (v: GtkMultiSelectionClass_autoptr)
    inline def value: Ptr[GtkMultiSelectionClass] = v

opaque type GtkMultiSelectionClass_listautoptr = Ptr[GList]
object GtkMultiSelectionClass_listautoptr: 
  given _tag: Tag[GtkMultiSelectionClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkMultiSelectionClass_listautoptr = o
  extension (v: GtkMultiSelectionClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkMultiSelectionClass_queueautoptr = Ptr[GQueue]
object GtkMultiSelectionClass_queueautoptr: 
  given _tag: Tag[GtkMultiSelectionClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkMultiSelectionClass_queueautoptr = o
  extension (v: GtkMultiSelectionClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkMultiSelectionClass_slistautoptr = Ptr[GSList]
object GtkMultiSelectionClass_slistautoptr: 
  given _tag: Tag[GtkMultiSelectionClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkMultiSelectionClass_slistautoptr = o
  extension (v: GtkMultiSelectionClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkMultiSelection_autoptr = Ptr[GtkMultiSelection]
object GtkMultiSelection_autoptr: 
  given _tag: Tag[GtkMultiSelection_autoptr] = Tag.Ptr[GtkMultiSelection](GtkMultiSelection._tag)
  inline def apply(inline o: Ptr[GtkMultiSelection]): GtkMultiSelection_autoptr = o
  extension (v: GtkMultiSelection_autoptr)
    inline def value: Ptr[GtkMultiSelection] = v

opaque type GtkMultiSelection_listautoptr = Ptr[GList]
object GtkMultiSelection_listautoptr: 
  given _tag: Tag[GtkMultiSelection_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkMultiSelection_listautoptr = o
  extension (v: GtkMultiSelection_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkMultiSelection_queueautoptr = Ptr[GQueue]
object GtkMultiSelection_queueautoptr: 
  given _tag: Tag[GtkMultiSelection_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkMultiSelection_queueautoptr = o
  extension (v: GtkMultiSelection_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkMultiSelection_slistautoptr = Ptr[GSList]
object GtkMultiSelection_slistautoptr: 
  given _tag: Tag[GtkMultiSelection_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkMultiSelection_slistautoptr = o
  extension (v: GtkMultiSelection_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkMultiSorterClass_autoptr = Ptr[GtkMultiSorterClass]
object GtkMultiSorterClass_autoptr: 
  given _tag: Tag[GtkMultiSorterClass_autoptr] = Tag.Ptr[GtkMultiSorterClass](GtkMultiSorterClass._tag)
  inline def apply(inline o: Ptr[GtkMultiSorterClass]): GtkMultiSorterClass_autoptr = o
  extension (v: GtkMultiSorterClass_autoptr)
    inline def value: Ptr[GtkMultiSorterClass] = v

opaque type GtkMultiSorterClass_listautoptr = Ptr[GList]
object GtkMultiSorterClass_listautoptr: 
  given _tag: Tag[GtkMultiSorterClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkMultiSorterClass_listautoptr = o
  extension (v: GtkMultiSorterClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkMultiSorterClass_queueautoptr = Ptr[GQueue]
object GtkMultiSorterClass_queueautoptr: 
  given _tag: Tag[GtkMultiSorterClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkMultiSorterClass_queueautoptr = o
  extension (v: GtkMultiSorterClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkMultiSorterClass_slistautoptr = Ptr[GSList]
object GtkMultiSorterClass_slistautoptr: 
  given _tag: Tag[GtkMultiSorterClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkMultiSorterClass_slistautoptr = o
  extension (v: GtkMultiSorterClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkMultiSorter_autoptr = Ptr[GtkMultiSorter]
object GtkMultiSorter_autoptr: 
  given _tag: Tag[GtkMultiSorter_autoptr] = Tag.Ptr[GtkMultiSorter](GtkMultiSorter._tag)
  inline def apply(inline o: Ptr[GtkMultiSorter]): GtkMultiSorter_autoptr = o
  extension (v: GtkMultiSorter_autoptr)
    inline def value: Ptr[GtkMultiSorter] = v

opaque type GtkMultiSorter_listautoptr = Ptr[GList]
object GtkMultiSorter_listautoptr: 
  given _tag: Tag[GtkMultiSorter_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkMultiSorter_listautoptr = o
  extension (v: GtkMultiSorter_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkMultiSorter_queueautoptr = Ptr[GQueue]
object GtkMultiSorter_queueautoptr: 
  given _tag: Tag[GtkMultiSorter_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkMultiSorter_queueautoptr = o
  extension (v: GtkMultiSorter_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkMultiSorter_slistautoptr = Ptr[GSList]
object GtkMultiSorter_slistautoptr: 
  given _tag: Tag[GtkMultiSorter_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkMultiSorter_slistautoptr = o
  extension (v: GtkMultiSorter_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkNamedActionClass_autoptr = Ptr[GtkNamedActionClass]
object GtkNamedActionClass_autoptr: 
  given _tag: Tag[GtkNamedActionClass_autoptr] = Tag.Ptr[GtkNamedActionClass](GtkNamedActionClass._tag)
  inline def apply(inline o: Ptr[GtkNamedActionClass]): GtkNamedActionClass_autoptr = o
  extension (v: GtkNamedActionClass_autoptr)
    inline def value: Ptr[GtkNamedActionClass] = v

opaque type GtkNamedActionClass_listautoptr = Ptr[GList]
object GtkNamedActionClass_listautoptr: 
  given _tag: Tag[GtkNamedActionClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkNamedActionClass_listautoptr = o
  extension (v: GtkNamedActionClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkNamedActionClass_queueautoptr = Ptr[GQueue]
object GtkNamedActionClass_queueautoptr: 
  given _tag: Tag[GtkNamedActionClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkNamedActionClass_queueautoptr = o
  extension (v: GtkNamedActionClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkNamedActionClass_slistautoptr = Ptr[GSList]
object GtkNamedActionClass_slistautoptr: 
  given _tag: Tag[GtkNamedActionClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkNamedActionClass_slistautoptr = o
  extension (v: GtkNamedActionClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkNamedAction_autoptr = Ptr[GtkNamedAction]
object GtkNamedAction_autoptr: 
  given _tag: Tag[GtkNamedAction_autoptr] = Tag.Ptr[GtkNamedAction](GtkNamedAction._tag)
  inline def apply(inline o: Ptr[GtkNamedAction]): GtkNamedAction_autoptr = o
  extension (v: GtkNamedAction_autoptr)
    inline def value: Ptr[GtkNamedAction] = v

opaque type GtkNamedAction_listautoptr = Ptr[GList]
object GtkNamedAction_listautoptr: 
  given _tag: Tag[GtkNamedAction_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkNamedAction_listautoptr = o
  extension (v: GtkNamedAction_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkNamedAction_queueautoptr = Ptr[GQueue]
object GtkNamedAction_queueautoptr: 
  given _tag: Tag[GtkNamedAction_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkNamedAction_queueautoptr = o
  extension (v: GtkNamedAction_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkNamedAction_slistautoptr = Ptr[GSList]
object GtkNamedAction_slistautoptr: 
  given _tag: Tag[GtkNamedAction_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkNamedAction_slistautoptr = o
  extension (v: GtkNamedAction_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkNativeDialogClass_autoptr = Ptr[GtkNativeDialogClass]
object GtkNativeDialogClass_autoptr: 
  given _tag: Tag[GtkNativeDialogClass_autoptr] = Tag.Ptr[GtkNativeDialogClass](GtkNativeDialogClass._tag)
  inline def apply(inline o: Ptr[GtkNativeDialogClass]): GtkNativeDialogClass_autoptr = o
  extension (v: GtkNativeDialogClass_autoptr)
    inline def value: Ptr[GtkNativeDialogClass] = v

opaque type GtkNativeDialogClass_listautoptr = Ptr[GList]
object GtkNativeDialogClass_listautoptr: 
  given _tag: Tag[GtkNativeDialogClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkNativeDialogClass_listautoptr = o
  extension (v: GtkNativeDialogClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkNativeDialogClass_queueautoptr = Ptr[GQueue]
object GtkNativeDialogClass_queueautoptr: 
  given _tag: Tag[GtkNativeDialogClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkNativeDialogClass_queueautoptr = o
  extension (v: GtkNativeDialogClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkNativeDialogClass_slistautoptr = Ptr[GSList]
object GtkNativeDialogClass_slistautoptr: 
  given _tag: Tag[GtkNativeDialogClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkNativeDialogClass_slistautoptr = o
  extension (v: GtkNativeDialogClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkNativeDialog_autoptr = Ptr[GtkNativeDialog]
object GtkNativeDialog_autoptr: 
  given _tag: Tag[GtkNativeDialog_autoptr] = Tag.Ptr[GtkNativeDialog](GtkNativeDialog._tag)
  inline def apply(inline o: Ptr[GtkNativeDialog]): GtkNativeDialog_autoptr = o
  extension (v: GtkNativeDialog_autoptr)
    inline def value: Ptr[GtkNativeDialog] = v

opaque type GtkNativeDialog_listautoptr = Ptr[GList]
object GtkNativeDialog_listautoptr: 
  given _tag: Tag[GtkNativeDialog_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkNativeDialog_listautoptr = o
  extension (v: GtkNativeDialog_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkNativeDialog_queueautoptr = Ptr[GQueue]
object GtkNativeDialog_queueautoptr: 
  given _tag: Tag[GtkNativeDialog_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkNativeDialog_queueautoptr = o
  extension (v: GtkNativeDialog_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkNativeDialog_slistautoptr = Ptr[GSList]
object GtkNativeDialog_slistautoptr: 
  given _tag: Tag[GtkNativeDialog_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkNativeDialog_slistautoptr = o
  extension (v: GtkNativeDialog_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkNative_autoptr = Ptr[GtkNative]
object GtkNative_autoptr: 
  given _tag: Tag[GtkNative_autoptr] = Tag.Ptr[GtkNative](GtkNative._tag)
  inline def apply(inline o: Ptr[GtkNative]): GtkNative_autoptr = o
  extension (v: GtkNative_autoptr)
    inline def value: Ptr[GtkNative] = v

opaque type GtkNative_listautoptr = Ptr[GList]
object GtkNative_listautoptr: 
  given _tag: Tag[GtkNative_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkNative_listautoptr = o
  extension (v: GtkNative_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkNative_queueautoptr = Ptr[GQueue]
object GtkNative_queueautoptr: 
  given _tag: Tag[GtkNative_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkNative_queueautoptr = o
  extension (v: GtkNative_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkNative_slistautoptr = Ptr[GSList]
object GtkNative_slistautoptr: 
  given _tag: Tag[GtkNative_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkNative_slistautoptr = o
  extension (v: GtkNative_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkNeverTriggerClass_autoptr = Ptr[GtkNeverTriggerClass]
object GtkNeverTriggerClass_autoptr: 
  given _tag: Tag[GtkNeverTriggerClass_autoptr] = Tag.Ptr[GtkNeverTriggerClass](GtkNeverTriggerClass._tag)
  inline def apply(inline o: Ptr[GtkNeverTriggerClass]): GtkNeverTriggerClass_autoptr = o
  extension (v: GtkNeverTriggerClass_autoptr)
    inline def value: Ptr[GtkNeverTriggerClass] = v

opaque type GtkNeverTriggerClass_listautoptr = Ptr[GList]
object GtkNeverTriggerClass_listautoptr: 
  given _tag: Tag[GtkNeverTriggerClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkNeverTriggerClass_listautoptr = o
  extension (v: GtkNeverTriggerClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkNeverTriggerClass_queueautoptr = Ptr[GQueue]
object GtkNeverTriggerClass_queueautoptr: 
  given _tag: Tag[GtkNeverTriggerClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkNeverTriggerClass_queueautoptr = o
  extension (v: GtkNeverTriggerClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkNeverTriggerClass_slistautoptr = Ptr[GSList]
object GtkNeverTriggerClass_slistautoptr: 
  given _tag: Tag[GtkNeverTriggerClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkNeverTriggerClass_slistautoptr = o
  extension (v: GtkNeverTriggerClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkNeverTrigger_autoptr = Ptr[GtkNeverTrigger]
object GtkNeverTrigger_autoptr: 
  given _tag: Tag[GtkNeverTrigger_autoptr] = Tag.Ptr[GtkNeverTrigger](GtkNeverTrigger._tag)
  inline def apply(inline o: Ptr[GtkNeverTrigger]): GtkNeverTrigger_autoptr = o
  extension (v: GtkNeverTrigger_autoptr)
    inline def value: Ptr[GtkNeverTrigger] = v

opaque type GtkNeverTrigger_listautoptr = Ptr[GList]
object GtkNeverTrigger_listautoptr: 
  given _tag: Tag[GtkNeverTrigger_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkNeverTrigger_listautoptr = o
  extension (v: GtkNeverTrigger_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkNeverTrigger_queueautoptr = Ptr[GQueue]
object GtkNeverTrigger_queueautoptr: 
  given _tag: Tag[GtkNeverTrigger_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkNeverTrigger_queueautoptr = o
  extension (v: GtkNeverTrigger_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkNeverTrigger_slistautoptr = Ptr[GSList]
object GtkNeverTrigger_slistautoptr: 
  given _tag: Tag[GtkNeverTrigger_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkNeverTrigger_slistautoptr = o
  extension (v: GtkNeverTrigger_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkNoSelectionClass_autoptr = Ptr[GtkNoSelectionClass]
object GtkNoSelectionClass_autoptr: 
  given _tag: Tag[GtkNoSelectionClass_autoptr] = Tag.Ptr[GtkNoSelectionClass](GtkNoSelectionClass._tag)
  inline def apply(inline o: Ptr[GtkNoSelectionClass]): GtkNoSelectionClass_autoptr = o
  extension (v: GtkNoSelectionClass_autoptr)
    inline def value: Ptr[GtkNoSelectionClass] = v

opaque type GtkNoSelectionClass_listautoptr = Ptr[GList]
object GtkNoSelectionClass_listautoptr: 
  given _tag: Tag[GtkNoSelectionClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkNoSelectionClass_listautoptr = o
  extension (v: GtkNoSelectionClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkNoSelectionClass_queueautoptr = Ptr[GQueue]
object GtkNoSelectionClass_queueautoptr: 
  given _tag: Tag[GtkNoSelectionClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkNoSelectionClass_queueautoptr = o
  extension (v: GtkNoSelectionClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkNoSelectionClass_slistautoptr = Ptr[GSList]
object GtkNoSelectionClass_slistautoptr: 
  given _tag: Tag[GtkNoSelectionClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkNoSelectionClass_slistautoptr = o
  extension (v: GtkNoSelectionClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkNoSelection_autoptr = Ptr[GtkNoSelection]
object GtkNoSelection_autoptr: 
  given _tag: Tag[GtkNoSelection_autoptr] = Tag.Ptr[GtkNoSelection](GtkNoSelection._tag)
  inline def apply(inline o: Ptr[GtkNoSelection]): GtkNoSelection_autoptr = o
  extension (v: GtkNoSelection_autoptr)
    inline def value: Ptr[GtkNoSelection] = v

opaque type GtkNoSelection_listautoptr = Ptr[GList]
object GtkNoSelection_listautoptr: 
  given _tag: Tag[GtkNoSelection_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkNoSelection_listautoptr = o
  extension (v: GtkNoSelection_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkNoSelection_queueautoptr = Ptr[GQueue]
object GtkNoSelection_queueautoptr: 
  given _tag: Tag[GtkNoSelection_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkNoSelection_queueautoptr = o
  extension (v: GtkNoSelection_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkNoSelection_slistautoptr = Ptr[GSList]
object GtkNoSelection_slistautoptr: 
  given _tag: Tag[GtkNoSelection_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkNoSelection_slistautoptr = o
  extension (v: GtkNoSelection_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkNotebook_autoptr = Ptr[GtkNotebook]
object GtkNotebook_autoptr: 
  given _tag: Tag[GtkNotebook_autoptr] = Tag.Ptr[GtkNotebook](GtkNotebook._tag)
  inline def apply(inline o: Ptr[GtkNotebook]): GtkNotebook_autoptr = o
  extension (v: GtkNotebook_autoptr)
    inline def value: Ptr[GtkNotebook] = v

opaque type GtkNotebook_listautoptr = Ptr[GList]
object GtkNotebook_listautoptr: 
  given _tag: Tag[GtkNotebook_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkNotebook_listautoptr = o
  extension (v: GtkNotebook_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkNotebook_queueautoptr = Ptr[GQueue]
object GtkNotebook_queueautoptr: 
  given _tag: Tag[GtkNotebook_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkNotebook_queueautoptr = o
  extension (v: GtkNotebook_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkNotebook_slistautoptr = Ptr[GSList]
object GtkNotebook_slistautoptr: 
  given _tag: Tag[GtkNotebook_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkNotebook_slistautoptr = o
  extension (v: GtkNotebook_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkNothingActionClass_autoptr = Ptr[GtkNothingActionClass]
object GtkNothingActionClass_autoptr: 
  given _tag: Tag[GtkNothingActionClass_autoptr] = Tag.Ptr[GtkNothingActionClass](GtkNothingActionClass._tag)
  inline def apply(inline o: Ptr[GtkNothingActionClass]): GtkNothingActionClass_autoptr = o
  extension (v: GtkNothingActionClass_autoptr)
    inline def value: Ptr[GtkNothingActionClass] = v

opaque type GtkNothingActionClass_listautoptr = Ptr[GList]
object GtkNothingActionClass_listautoptr: 
  given _tag: Tag[GtkNothingActionClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkNothingActionClass_listautoptr = o
  extension (v: GtkNothingActionClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkNothingActionClass_queueautoptr = Ptr[GQueue]
object GtkNothingActionClass_queueautoptr: 
  given _tag: Tag[GtkNothingActionClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkNothingActionClass_queueautoptr = o
  extension (v: GtkNothingActionClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkNothingActionClass_slistautoptr = Ptr[GSList]
object GtkNothingActionClass_slistautoptr: 
  given _tag: Tag[GtkNothingActionClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkNothingActionClass_slistautoptr = o
  extension (v: GtkNothingActionClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkNothingAction_autoptr = Ptr[GtkNothingAction]
object GtkNothingAction_autoptr: 
  given _tag: Tag[GtkNothingAction_autoptr] = Tag.Ptr[GtkNothingAction](GtkNothingAction._tag)
  inline def apply(inline o: Ptr[GtkNothingAction]): GtkNothingAction_autoptr = o
  extension (v: GtkNothingAction_autoptr)
    inline def value: Ptr[GtkNothingAction] = v

opaque type GtkNothingAction_listautoptr = Ptr[GList]
object GtkNothingAction_listautoptr: 
  given _tag: Tag[GtkNothingAction_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkNothingAction_listautoptr = o
  extension (v: GtkNothingAction_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkNothingAction_queueautoptr = Ptr[GQueue]
object GtkNothingAction_queueautoptr: 
  given _tag: Tag[GtkNothingAction_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkNothingAction_queueautoptr = o
  extension (v: GtkNothingAction_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkNothingAction_slistautoptr = Ptr[GSList]
object GtkNothingAction_slistautoptr: 
  given _tag: Tag[GtkNothingAction_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkNothingAction_slistautoptr = o
  extension (v: GtkNothingAction_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkNumericSorterClass_autoptr = Ptr[GtkNumericSorterClass]
object GtkNumericSorterClass_autoptr: 
  given _tag: Tag[GtkNumericSorterClass_autoptr] = Tag.Ptr[GtkNumericSorterClass](GtkNumericSorterClass._tag)
  inline def apply(inline o: Ptr[GtkNumericSorterClass]): GtkNumericSorterClass_autoptr = o
  extension (v: GtkNumericSorterClass_autoptr)
    inline def value: Ptr[GtkNumericSorterClass] = v

opaque type GtkNumericSorterClass_listautoptr = Ptr[GList]
object GtkNumericSorterClass_listautoptr: 
  given _tag: Tag[GtkNumericSorterClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkNumericSorterClass_listautoptr = o
  extension (v: GtkNumericSorterClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkNumericSorterClass_queueautoptr = Ptr[GQueue]
object GtkNumericSorterClass_queueautoptr: 
  given _tag: Tag[GtkNumericSorterClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkNumericSorterClass_queueautoptr = o
  extension (v: GtkNumericSorterClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkNumericSorterClass_slistautoptr = Ptr[GSList]
object GtkNumericSorterClass_slistautoptr: 
  given _tag: Tag[GtkNumericSorterClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkNumericSorterClass_slistautoptr = o
  extension (v: GtkNumericSorterClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkNumericSorter_autoptr = Ptr[GtkNumericSorter]
object GtkNumericSorter_autoptr: 
  given _tag: Tag[GtkNumericSorter_autoptr] = Tag.Ptr[GtkNumericSorter](GtkNumericSorter._tag)
  inline def apply(inline o: Ptr[GtkNumericSorter]): GtkNumericSorter_autoptr = o
  extension (v: GtkNumericSorter_autoptr)
    inline def value: Ptr[GtkNumericSorter] = v

opaque type GtkNumericSorter_listautoptr = Ptr[GList]
object GtkNumericSorter_listautoptr: 
  given _tag: Tag[GtkNumericSorter_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkNumericSorter_listautoptr = o
  extension (v: GtkNumericSorter_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkNumericSorter_queueautoptr = Ptr[GQueue]
object GtkNumericSorter_queueautoptr: 
  given _tag: Tag[GtkNumericSorter_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkNumericSorter_queueautoptr = o
  extension (v: GtkNumericSorter_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkNumericSorter_slistautoptr = Ptr[GSList]
object GtkNumericSorter_slistautoptr: 
  given _tag: Tag[GtkNumericSorter_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkNumericSorter_slistautoptr = o
  extension (v: GtkNumericSorter_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkOrientable_autoptr = Ptr[GtkOrientable]
object GtkOrientable_autoptr: 
  given _tag: Tag[GtkOrientable_autoptr] = Tag.Ptr[GtkOrientable](GtkOrientable._tag)
  inline def apply(inline o: Ptr[GtkOrientable]): GtkOrientable_autoptr = o
  extension (v: GtkOrientable_autoptr)
    inline def value: Ptr[GtkOrientable] = v

opaque type GtkOrientable_listautoptr = Ptr[GList]
object GtkOrientable_listautoptr: 
  given _tag: Tag[GtkOrientable_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkOrientable_listautoptr = o
  extension (v: GtkOrientable_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkOrientable_queueautoptr = Ptr[GQueue]
object GtkOrientable_queueautoptr: 
  given _tag: Tag[GtkOrientable_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkOrientable_queueautoptr = o
  extension (v: GtkOrientable_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkOrientable_slistautoptr = Ptr[GSList]
object GtkOrientable_slistautoptr: 
  given _tag: Tag[GtkOrientable_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkOrientable_slistautoptr = o
  extension (v: GtkOrientable_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkOverlayLayoutChildClass_autoptr = Ptr[GtkOverlayLayoutChildClass]
object GtkOverlayLayoutChildClass_autoptr: 
  given _tag: Tag[GtkOverlayLayoutChildClass_autoptr] = Tag.Ptr[GtkOverlayLayoutChildClass](GtkOverlayLayoutChildClass._tag)
  inline def apply(inline o: Ptr[GtkOverlayLayoutChildClass]): GtkOverlayLayoutChildClass_autoptr = o
  extension (v: GtkOverlayLayoutChildClass_autoptr)
    inline def value: Ptr[GtkOverlayLayoutChildClass] = v

opaque type GtkOverlayLayoutChildClass_listautoptr = Ptr[GList]
object GtkOverlayLayoutChildClass_listautoptr: 
  given _tag: Tag[GtkOverlayLayoutChildClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkOverlayLayoutChildClass_listautoptr = o
  extension (v: GtkOverlayLayoutChildClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkOverlayLayoutChildClass_queueautoptr = Ptr[GQueue]
object GtkOverlayLayoutChildClass_queueautoptr: 
  given _tag: Tag[GtkOverlayLayoutChildClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkOverlayLayoutChildClass_queueautoptr = o
  extension (v: GtkOverlayLayoutChildClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkOverlayLayoutChildClass_slistautoptr = Ptr[GSList]
object GtkOverlayLayoutChildClass_slistautoptr: 
  given _tag: Tag[GtkOverlayLayoutChildClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkOverlayLayoutChildClass_slistautoptr = o
  extension (v: GtkOverlayLayoutChildClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkOverlayLayoutChild_autoptr = Ptr[GtkOverlayLayoutChild]
object GtkOverlayLayoutChild_autoptr: 
  given _tag: Tag[GtkOverlayLayoutChild_autoptr] = Tag.Ptr[GtkOverlayLayoutChild](GtkOverlayLayoutChild._tag)
  inline def apply(inline o: Ptr[GtkOverlayLayoutChild]): GtkOverlayLayoutChild_autoptr = o
  extension (v: GtkOverlayLayoutChild_autoptr)
    inline def value: Ptr[GtkOverlayLayoutChild] = v

opaque type GtkOverlayLayoutChild_listautoptr = Ptr[GList]
object GtkOverlayLayoutChild_listautoptr: 
  given _tag: Tag[GtkOverlayLayoutChild_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkOverlayLayoutChild_listautoptr = o
  extension (v: GtkOverlayLayoutChild_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkOverlayLayoutChild_queueautoptr = Ptr[GQueue]
object GtkOverlayLayoutChild_queueautoptr: 
  given _tag: Tag[GtkOverlayLayoutChild_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkOverlayLayoutChild_queueautoptr = o
  extension (v: GtkOverlayLayoutChild_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkOverlayLayoutChild_slistautoptr = Ptr[GSList]
object GtkOverlayLayoutChild_slistautoptr: 
  given _tag: Tag[GtkOverlayLayoutChild_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkOverlayLayoutChild_slistautoptr = o
  extension (v: GtkOverlayLayoutChild_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkOverlayLayoutClass_autoptr = Ptr[GtkOverlayLayoutClass]
object GtkOverlayLayoutClass_autoptr: 
  given _tag: Tag[GtkOverlayLayoutClass_autoptr] = Tag.Ptr[GtkOverlayLayoutClass](GtkOverlayLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkOverlayLayoutClass]): GtkOverlayLayoutClass_autoptr = o
  extension (v: GtkOverlayLayoutClass_autoptr)
    inline def value: Ptr[GtkOverlayLayoutClass] = v

opaque type GtkOverlayLayoutClass_listautoptr = Ptr[GList]
object GtkOverlayLayoutClass_listautoptr: 
  given _tag: Tag[GtkOverlayLayoutClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkOverlayLayoutClass_listautoptr = o
  extension (v: GtkOverlayLayoutClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkOverlayLayoutClass_queueautoptr = Ptr[GQueue]
object GtkOverlayLayoutClass_queueautoptr: 
  given _tag: Tag[GtkOverlayLayoutClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkOverlayLayoutClass_queueautoptr = o
  extension (v: GtkOverlayLayoutClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkOverlayLayoutClass_slistautoptr = Ptr[GSList]
object GtkOverlayLayoutClass_slistautoptr: 
  given _tag: Tag[GtkOverlayLayoutClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkOverlayLayoutClass_slistautoptr = o
  extension (v: GtkOverlayLayoutClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkOverlayLayout_autoptr = Ptr[GtkOverlayLayout]
object GtkOverlayLayout_autoptr: 
  given _tag: Tag[GtkOverlayLayout_autoptr] = Tag.Ptr[GtkOverlayLayout](GtkOverlayLayout._tag)
  inline def apply(inline o: Ptr[GtkOverlayLayout]): GtkOverlayLayout_autoptr = o
  extension (v: GtkOverlayLayout_autoptr)
    inline def value: Ptr[GtkOverlayLayout] = v

opaque type GtkOverlayLayout_listautoptr = Ptr[GList]
object GtkOverlayLayout_listautoptr: 
  given _tag: Tag[GtkOverlayLayout_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkOverlayLayout_listautoptr = o
  extension (v: GtkOverlayLayout_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkOverlayLayout_queueautoptr = Ptr[GQueue]
object GtkOverlayLayout_queueautoptr: 
  given _tag: Tag[GtkOverlayLayout_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkOverlayLayout_queueautoptr = o
  extension (v: GtkOverlayLayout_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkOverlayLayout_slistautoptr = Ptr[GSList]
object GtkOverlayLayout_slistautoptr: 
  given _tag: Tag[GtkOverlayLayout_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkOverlayLayout_slistautoptr = o
  extension (v: GtkOverlayLayout_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkOverlay_autoptr = Ptr[GtkOverlay]
object GtkOverlay_autoptr: 
  given _tag: Tag[GtkOverlay_autoptr] = Tag.Ptr[GtkOverlay](GtkOverlay._tag)
  inline def apply(inline o: Ptr[GtkOverlay]): GtkOverlay_autoptr = o
  extension (v: GtkOverlay_autoptr)
    inline def value: Ptr[GtkOverlay] = v

opaque type GtkOverlay_listautoptr = Ptr[GList]
object GtkOverlay_listautoptr: 
  given _tag: Tag[GtkOverlay_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkOverlay_listautoptr = o
  extension (v: GtkOverlay_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkOverlay_queueautoptr = Ptr[GQueue]
object GtkOverlay_queueautoptr: 
  given _tag: Tag[GtkOverlay_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkOverlay_queueautoptr = o
  extension (v: GtkOverlay_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkOverlay_slistautoptr = Ptr[GSList]
object GtkOverlay_slistautoptr: 
  given _tag: Tag[GtkOverlay_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkOverlay_slistautoptr = o
  extension (v: GtkOverlay_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkPageSetupDoneFunc = CFuncPtr2[Ptr[GtkPageSetup], gpointer, Unit]
object GtkPageSetupDoneFunc: 
  given _tag: Tag[GtkPageSetupDoneFunc] = Tag.materializeCFuncPtr2[Ptr[GtkPageSetup], gpointer, Unit]
  inline def apply(inline o: CFuncPtr2[Ptr[GtkPageSetup], gpointer, Unit]): GtkPageSetupDoneFunc = o
  extension (v: GtkPageSetupDoneFunc)
    inline def value: CFuncPtr2[Ptr[GtkPageSetup], gpointer, Unit] = v

opaque type GtkPageSetup_autoptr = Ptr[GtkPageSetup]
object GtkPageSetup_autoptr: 
  given _tag: Tag[GtkPageSetup_autoptr] = Tag.Ptr[GtkPageSetup](GtkPageSetup._tag)
  inline def apply(inline o: Ptr[GtkPageSetup]): GtkPageSetup_autoptr = o
  extension (v: GtkPageSetup_autoptr)
    inline def value: Ptr[GtkPageSetup] = v

opaque type GtkPageSetup_listautoptr = Ptr[GList]
object GtkPageSetup_listautoptr: 
  given _tag: Tag[GtkPageSetup_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkPageSetup_listautoptr = o
  extension (v: GtkPageSetup_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkPageSetup_queueautoptr = Ptr[GQueue]
object GtkPageSetup_queueautoptr: 
  given _tag: Tag[GtkPageSetup_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkPageSetup_queueautoptr = o
  extension (v: GtkPageSetup_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkPageSetup_slistautoptr = Ptr[GSList]
object GtkPageSetup_slistautoptr: 
  given _tag: Tag[GtkPageSetup_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkPageSetup_slistautoptr = o
  extension (v: GtkPageSetup_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkPaned_autoptr = Ptr[GtkPaned]
object GtkPaned_autoptr: 
  given _tag: Tag[GtkPaned_autoptr] = Tag.Ptr[GtkPaned](GtkPaned._tag)
  inline def apply(inline o: Ptr[GtkPaned]): GtkPaned_autoptr = o
  extension (v: GtkPaned_autoptr)
    inline def value: Ptr[GtkPaned] = v

opaque type GtkPaned_listautoptr = Ptr[GList]
object GtkPaned_listautoptr: 
  given _tag: Tag[GtkPaned_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkPaned_listautoptr = o
  extension (v: GtkPaned_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkPaned_queueautoptr = Ptr[GQueue]
object GtkPaned_queueautoptr: 
  given _tag: Tag[GtkPaned_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkPaned_queueautoptr = o
  extension (v: GtkPaned_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkPaned_slistautoptr = Ptr[GSList]
object GtkPaned_slistautoptr: 
  given _tag: Tag[GtkPaned_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkPaned_slistautoptr = o
  extension (v: GtkPaned_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkPaperSize_autoptr = Ptr[GtkPaperSize]
object GtkPaperSize_autoptr: 
  given _tag: Tag[GtkPaperSize_autoptr] = Tag.Ptr[GtkPaperSize](GtkPaperSize._tag)
  inline def apply(inline o: Ptr[GtkPaperSize]): GtkPaperSize_autoptr = o
  extension (v: GtkPaperSize_autoptr)
    inline def value: Ptr[GtkPaperSize] = v

opaque type GtkPaperSize_listautoptr = Ptr[GList]
object GtkPaperSize_listautoptr: 
  given _tag: Tag[GtkPaperSize_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkPaperSize_listautoptr = o
  extension (v: GtkPaperSize_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkPaperSize_queueautoptr = Ptr[GQueue]
object GtkPaperSize_queueautoptr: 
  given _tag: Tag[GtkPaperSize_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkPaperSize_queueautoptr = o
  extension (v: GtkPaperSize_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkPaperSize_slistautoptr = Ptr[GSList]
object GtkPaperSize_slistautoptr: 
  given _tag: Tag[GtkPaperSize_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkPaperSize_slistautoptr = o
  extension (v: GtkPaperSize_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkPasswordEntryBufferClass_autoptr = Ptr[GtkPasswordEntryBufferClass]
object GtkPasswordEntryBufferClass_autoptr: 
  given _tag: Tag[GtkPasswordEntryBufferClass_autoptr] = Tag.Ptr[GtkPasswordEntryBufferClass](GtkPasswordEntryBufferClass._tag)
  inline def apply(inline o: Ptr[GtkPasswordEntryBufferClass]): GtkPasswordEntryBufferClass_autoptr = o
  extension (v: GtkPasswordEntryBufferClass_autoptr)
    inline def value: Ptr[GtkPasswordEntryBufferClass] = v

opaque type GtkPasswordEntryBufferClass_listautoptr = Ptr[GList]
object GtkPasswordEntryBufferClass_listautoptr: 
  given _tag: Tag[GtkPasswordEntryBufferClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkPasswordEntryBufferClass_listautoptr = o
  extension (v: GtkPasswordEntryBufferClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkPasswordEntryBufferClass_queueautoptr = Ptr[GQueue]
object GtkPasswordEntryBufferClass_queueautoptr: 
  given _tag: Tag[GtkPasswordEntryBufferClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkPasswordEntryBufferClass_queueautoptr = o
  extension (v: GtkPasswordEntryBufferClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkPasswordEntryBufferClass_slistautoptr = Ptr[GSList]
object GtkPasswordEntryBufferClass_slistautoptr: 
  given _tag: Tag[GtkPasswordEntryBufferClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkPasswordEntryBufferClass_slistautoptr = o
  extension (v: GtkPasswordEntryBufferClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkPasswordEntryBuffer_autoptr = Ptr[GtkPasswordEntryBuffer]
object GtkPasswordEntryBuffer_autoptr: 
  given _tag: Tag[GtkPasswordEntryBuffer_autoptr] = Tag.Ptr[GtkPasswordEntryBuffer](GtkPasswordEntryBuffer._tag)
  inline def apply(inline o: Ptr[GtkPasswordEntryBuffer]): GtkPasswordEntryBuffer_autoptr = o
  extension (v: GtkPasswordEntryBuffer_autoptr)
    inline def value: Ptr[GtkPasswordEntryBuffer] = v

opaque type GtkPasswordEntryBuffer_listautoptr = Ptr[GList]
object GtkPasswordEntryBuffer_listautoptr: 
  given _tag: Tag[GtkPasswordEntryBuffer_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkPasswordEntryBuffer_listautoptr = o
  extension (v: GtkPasswordEntryBuffer_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkPasswordEntryBuffer_queueautoptr = Ptr[GQueue]
object GtkPasswordEntryBuffer_queueautoptr: 
  given _tag: Tag[GtkPasswordEntryBuffer_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkPasswordEntryBuffer_queueautoptr = o
  extension (v: GtkPasswordEntryBuffer_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkPasswordEntryBuffer_slistautoptr = Ptr[GSList]
object GtkPasswordEntryBuffer_slistautoptr: 
  given _tag: Tag[GtkPasswordEntryBuffer_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkPasswordEntryBuffer_slistautoptr = o
  extension (v: GtkPasswordEntryBuffer_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkPictureClass_autoptr = Ptr[GtkPictureClass]
object GtkPictureClass_autoptr: 
  given _tag: Tag[GtkPictureClass_autoptr] = Tag.Ptr[GtkPictureClass](GtkPictureClass._tag)
  inline def apply(inline o: Ptr[GtkPictureClass]): GtkPictureClass_autoptr = o
  extension (v: GtkPictureClass_autoptr)
    inline def value: Ptr[GtkPictureClass] = v

opaque type GtkPictureClass_listautoptr = Ptr[GList]
object GtkPictureClass_listautoptr: 
  given _tag: Tag[GtkPictureClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkPictureClass_listautoptr = o
  extension (v: GtkPictureClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkPictureClass_queueautoptr = Ptr[GQueue]
object GtkPictureClass_queueautoptr: 
  given _tag: Tag[GtkPictureClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkPictureClass_queueautoptr = o
  extension (v: GtkPictureClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkPictureClass_slistautoptr = Ptr[GSList]
object GtkPictureClass_slistautoptr: 
  given _tag: Tag[GtkPictureClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkPictureClass_slistautoptr = o
  extension (v: GtkPictureClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkPicture_autoptr = Ptr[GtkPicture]
object GtkPicture_autoptr: 
  given _tag: Tag[GtkPicture_autoptr] = Tag.Ptr[GtkPicture](GtkPicture._tag)
  inline def apply(inline o: Ptr[GtkPicture]): GtkPicture_autoptr = o
  extension (v: GtkPicture_autoptr)
    inline def value: Ptr[GtkPicture] = v

opaque type GtkPicture_listautoptr = Ptr[GList]
object GtkPicture_listautoptr: 
  given _tag: Tag[GtkPicture_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkPicture_listautoptr = o
  extension (v: GtkPicture_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkPicture_queueautoptr = Ptr[GQueue]
object GtkPicture_queueautoptr: 
  given _tag: Tag[GtkPicture_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkPicture_queueautoptr = o
  extension (v: GtkPicture_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkPicture_slistautoptr = Ptr[GSList]
object GtkPicture_slistautoptr: 
  given _tag: Tag[GtkPicture_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkPicture_slistautoptr = o
  extension (v: GtkPicture_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkPopoverMenu_autoptr = Ptr[GtkPopoverMenu]
object GtkPopoverMenu_autoptr: 
  given _tag: Tag[GtkPopoverMenu_autoptr] = Tag.Ptr[GtkPopoverMenu](GtkPopoverMenu._tag)
  inline def apply(inline o: Ptr[GtkPopoverMenu]): GtkPopoverMenu_autoptr = o
  extension (v: GtkPopoverMenu_autoptr)
    inline def value: Ptr[GtkPopoverMenu] = v

opaque type GtkPopoverMenu_listautoptr = Ptr[GList]
object GtkPopoverMenu_listautoptr: 
  given _tag: Tag[GtkPopoverMenu_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkPopoverMenu_listautoptr = o
  extension (v: GtkPopoverMenu_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkPopoverMenu_queueautoptr = Ptr[GQueue]
object GtkPopoverMenu_queueautoptr: 
  given _tag: Tag[GtkPopoverMenu_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkPopoverMenu_queueautoptr = o
  extension (v: GtkPopoverMenu_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkPopoverMenu_slistautoptr = Ptr[GSList]
object GtkPopoverMenu_slistautoptr: 
  given _tag: Tag[GtkPopoverMenu_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkPopoverMenu_slistautoptr = o
  extension (v: GtkPopoverMenu_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkPopover_autoptr = Ptr[GtkPopover]
object GtkPopover_autoptr: 
  given _tag: Tag[GtkPopover_autoptr] = Tag.Ptr[GtkPopover](GtkPopover._tag)
  inline def apply(inline o: Ptr[GtkPopover]): GtkPopover_autoptr = o
  extension (v: GtkPopover_autoptr)
    inline def value: Ptr[GtkPopover] = v

opaque type GtkPopover_listautoptr = Ptr[GList]
object GtkPopover_listautoptr: 
  given _tag: Tag[GtkPopover_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkPopover_listautoptr = o
  extension (v: GtkPopover_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkPopover_queueautoptr = Ptr[GQueue]
object GtkPopover_queueautoptr: 
  given _tag: Tag[GtkPopover_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkPopover_queueautoptr = o
  extension (v: GtkPopover_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkPopover_slistautoptr = Ptr[GSList]
object GtkPopover_slistautoptr: 
  given _tag: Tag[GtkPopover_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkPopover_slistautoptr = o
  extension (v: GtkPopover_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkPrintContext_autoptr = Ptr[GtkPrintContext]
object GtkPrintContext_autoptr: 
  given _tag: Tag[GtkPrintContext_autoptr] = Tag.Ptr[GtkPrintContext](GtkPrintContext._tag)
  inline def apply(inline o: Ptr[GtkPrintContext]): GtkPrintContext_autoptr = o
  extension (v: GtkPrintContext_autoptr)
    inline def value: Ptr[GtkPrintContext] = v

opaque type GtkPrintContext_listautoptr = Ptr[GList]
object GtkPrintContext_listautoptr: 
  given _tag: Tag[GtkPrintContext_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkPrintContext_listautoptr = o
  extension (v: GtkPrintContext_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkPrintContext_queueautoptr = Ptr[GQueue]
object GtkPrintContext_queueautoptr: 
  given _tag: Tag[GtkPrintContext_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkPrintContext_queueautoptr = o
  extension (v: GtkPrintContext_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkPrintContext_slistautoptr = Ptr[GSList]
object GtkPrintContext_slistautoptr: 
  given _tag: Tag[GtkPrintContext_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkPrintContext_slistautoptr = o
  extension (v: GtkPrintContext_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkPrintOperationPreview_autoptr = Ptr[GtkPrintOperationPreview]
object GtkPrintOperationPreview_autoptr: 
  given _tag: Tag[GtkPrintOperationPreview_autoptr] = Tag.Ptr[GtkPrintOperationPreview](GtkPrintOperationPreview._tag)
  inline def apply(inline o: Ptr[GtkPrintOperationPreview]): GtkPrintOperationPreview_autoptr = o
  extension (v: GtkPrintOperationPreview_autoptr)
    inline def value: Ptr[GtkPrintOperationPreview] = v

opaque type GtkPrintOperationPreview_listautoptr = Ptr[GList]
object GtkPrintOperationPreview_listautoptr: 
  given _tag: Tag[GtkPrintOperationPreview_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkPrintOperationPreview_listautoptr = o
  extension (v: GtkPrintOperationPreview_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkPrintOperationPreview_queueautoptr = Ptr[GQueue]
object GtkPrintOperationPreview_queueautoptr: 
  given _tag: Tag[GtkPrintOperationPreview_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkPrintOperationPreview_queueautoptr = o
  extension (v: GtkPrintOperationPreview_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkPrintOperationPreview_slistautoptr = Ptr[GSList]
object GtkPrintOperationPreview_slistautoptr: 
  given _tag: Tag[GtkPrintOperationPreview_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkPrintOperationPreview_slistautoptr = o
  extension (v: GtkPrintOperationPreview_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkPrintOperation_autoptr = Ptr[GtkPrintOperation]
object GtkPrintOperation_autoptr: 
  given _tag: Tag[GtkPrintOperation_autoptr] = Tag.Ptr[GtkPrintOperation](GtkPrintOperation._tag)
  inline def apply(inline o: Ptr[GtkPrintOperation]): GtkPrintOperation_autoptr = o
  extension (v: GtkPrintOperation_autoptr)
    inline def value: Ptr[GtkPrintOperation] = v

opaque type GtkPrintOperation_listautoptr = Ptr[GList]
object GtkPrintOperation_listautoptr: 
  given _tag: Tag[GtkPrintOperation_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkPrintOperation_listautoptr = o
  extension (v: GtkPrintOperation_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkPrintOperation_queueautoptr = Ptr[GQueue]
object GtkPrintOperation_queueautoptr: 
  given _tag: Tag[GtkPrintOperation_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkPrintOperation_queueautoptr = o
  extension (v: GtkPrintOperation_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkPrintOperation_slistautoptr = Ptr[GSList]
object GtkPrintOperation_slistautoptr: 
  given _tag: Tag[GtkPrintOperation_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkPrintOperation_slistautoptr = o
  extension (v: GtkPrintOperation_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkPrintSettingsFunc = CFuncPtr3[CString, CString, gpointer, Unit]
object GtkPrintSettingsFunc: 
  given _tag: Tag[GtkPrintSettingsFunc] = Tag.materializeCFuncPtr3[CString, CString, gpointer, Unit]
  inline def apply(inline o: CFuncPtr3[CString, CString, gpointer, Unit]): GtkPrintSettingsFunc = o
  extension (v: GtkPrintSettingsFunc)
    inline def value: CFuncPtr3[CString, CString, gpointer, Unit] = v

opaque type GtkPrintSettings_autoptr = Ptr[GtkPrintSettings]
object GtkPrintSettings_autoptr: 
  given _tag: Tag[GtkPrintSettings_autoptr] = Tag.Ptr[GtkPrintSettings](GtkPrintSettings._tag)
  inline def apply(inline o: Ptr[GtkPrintSettings]): GtkPrintSettings_autoptr = o
  extension (v: GtkPrintSettings_autoptr)
    inline def value: Ptr[GtkPrintSettings] = v

opaque type GtkPrintSettings_listautoptr = Ptr[GList]
object GtkPrintSettings_listautoptr: 
  given _tag: Tag[GtkPrintSettings_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkPrintSettings_listautoptr = o
  extension (v: GtkPrintSettings_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkPrintSettings_queueautoptr = Ptr[GQueue]
object GtkPrintSettings_queueautoptr: 
  given _tag: Tag[GtkPrintSettings_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkPrintSettings_queueautoptr = o
  extension (v: GtkPrintSettings_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkPrintSettings_slistautoptr = Ptr[GSList]
object GtkPrintSettings_slistautoptr: 
  given _tag: Tag[GtkPrintSettings_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkPrintSettings_slistautoptr = o
  extension (v: GtkPrintSettings_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkProgressBar_autoptr = Ptr[GtkProgressBar]
object GtkProgressBar_autoptr: 
  given _tag: Tag[GtkProgressBar_autoptr] = Tag.Ptr[GtkProgressBar](GtkProgressBar._tag)
  inline def apply(inline o: Ptr[GtkProgressBar]): GtkProgressBar_autoptr = o
  extension (v: GtkProgressBar_autoptr)
    inline def value: Ptr[GtkProgressBar] = v

opaque type GtkProgressBar_listautoptr = Ptr[GList]
object GtkProgressBar_listautoptr: 
  given _tag: Tag[GtkProgressBar_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkProgressBar_listautoptr = o
  extension (v: GtkProgressBar_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkProgressBar_queueautoptr = Ptr[GQueue]
object GtkProgressBar_queueautoptr: 
  given _tag: Tag[GtkProgressBar_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkProgressBar_queueautoptr = o
  extension (v: GtkProgressBar_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkProgressBar_slistautoptr = Ptr[GSList]
object GtkProgressBar_slistautoptr: 
  given _tag: Tag[GtkProgressBar_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkProgressBar_slistautoptr = o
  extension (v: GtkProgressBar_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkRange_autoptr = Ptr[GtkRange]
object GtkRange_autoptr: 
  given _tag: Tag[GtkRange_autoptr] = Tag.Ptr[GtkRange](GtkRange._tag)
  inline def apply(inline o: Ptr[GtkRange]): GtkRange_autoptr = o
  extension (v: GtkRange_autoptr)
    inline def value: Ptr[GtkRange] = v

opaque type GtkRange_listautoptr = Ptr[GList]
object GtkRange_listautoptr: 
  given _tag: Tag[GtkRange_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkRange_listautoptr = o
  extension (v: GtkRange_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkRange_queueautoptr = Ptr[GQueue]
object GtkRange_queueautoptr: 
  given _tag: Tag[GtkRange_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkRange_queueautoptr = o
  extension (v: GtkRange_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkRange_slistautoptr = Ptr[GSList]
object GtkRange_slistautoptr: 
  given _tag: Tag[GtkRange_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkRange_slistautoptr = o
  extension (v: GtkRange_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkRecentInfo_autoptr = Ptr[GtkRecentInfo]
object GtkRecentInfo_autoptr: 
  given _tag: Tag[GtkRecentInfo_autoptr] = Tag.Ptr[GtkRecentInfo](GtkRecentInfo._tag)
  inline def apply(inline o: Ptr[GtkRecentInfo]): GtkRecentInfo_autoptr = o
  extension (v: GtkRecentInfo_autoptr)
    inline def value: Ptr[GtkRecentInfo] = v

opaque type GtkRecentInfo_listautoptr = Ptr[GList]
object GtkRecentInfo_listautoptr: 
  given _tag: Tag[GtkRecentInfo_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkRecentInfo_listautoptr = o
  extension (v: GtkRecentInfo_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkRecentInfo_queueautoptr = Ptr[GQueue]
object GtkRecentInfo_queueautoptr: 
  given _tag: Tag[GtkRecentInfo_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkRecentInfo_queueautoptr = o
  extension (v: GtkRecentInfo_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkRecentInfo_slistautoptr = Ptr[GSList]
object GtkRecentInfo_slistautoptr: 
  given _tag: Tag[GtkRecentInfo_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkRecentInfo_slistautoptr = o
  extension (v: GtkRecentInfo_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkRecentManager_autoptr = Ptr[GtkRecentManager]
object GtkRecentManager_autoptr: 
  given _tag: Tag[GtkRecentManager_autoptr] = Tag.Ptr[GtkRecentManager](GtkRecentManager._tag)
  inline def apply(inline o: Ptr[GtkRecentManager]): GtkRecentManager_autoptr = o
  extension (v: GtkRecentManager_autoptr)
    inline def value: Ptr[GtkRecentManager] = v

opaque type GtkRecentManager_listautoptr = Ptr[GList]
object GtkRecentManager_listautoptr: 
  given _tag: Tag[GtkRecentManager_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkRecentManager_listautoptr = o
  extension (v: GtkRecentManager_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkRecentManager_queueautoptr = Ptr[GQueue]
object GtkRecentManager_queueautoptr: 
  given _tag: Tag[GtkRecentManager_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkRecentManager_queueautoptr = o
  extension (v: GtkRecentManager_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkRecentManager_slistautoptr = Ptr[GSList]
object GtkRecentManager_slistautoptr: 
  given _tag: Tag[GtkRecentManager_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkRecentManager_slistautoptr = o
  extension (v: GtkRecentManager_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkRequisition_autoptr = Ptr[GtkRequisition]
object GtkRequisition_autoptr: 
  given _tag: Tag[GtkRequisition_autoptr] = Tag.Ptr[GtkRequisition](GtkRequisition._tag)
  inline def apply(inline o: Ptr[GtkRequisition]): GtkRequisition_autoptr = o
  extension (v: GtkRequisition_autoptr)
    inline def value: Ptr[GtkRequisition] = v

opaque type GtkRequisition_listautoptr = Ptr[GList]
object GtkRequisition_listautoptr: 
  given _tag: Tag[GtkRequisition_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkRequisition_listautoptr = o
  extension (v: GtkRequisition_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkRequisition_queueautoptr = Ptr[GQueue]
object GtkRequisition_queueautoptr: 
  given _tag: Tag[GtkRequisition_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkRequisition_queueautoptr = o
  extension (v: GtkRequisition_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkRequisition_slistautoptr = Ptr[GSList]
object GtkRequisition_slistautoptr: 
  given _tag: Tag[GtkRequisition_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkRequisition_slistautoptr = o
  extension (v: GtkRequisition_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkRevealer_autoptr = Ptr[GtkRevealer]
object GtkRevealer_autoptr: 
  given _tag: Tag[GtkRevealer_autoptr] = Tag.Ptr[GtkRevealer](GtkRevealer._tag)
  inline def apply(inline o: Ptr[GtkRevealer]): GtkRevealer_autoptr = o
  extension (v: GtkRevealer_autoptr)
    inline def value: Ptr[GtkRevealer] = v

opaque type GtkRevealer_listautoptr = Ptr[GList]
object GtkRevealer_listautoptr: 
  given _tag: Tag[GtkRevealer_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkRevealer_listautoptr = o
  extension (v: GtkRevealer_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkRevealer_queueautoptr = Ptr[GQueue]
object GtkRevealer_queueautoptr: 
  given _tag: Tag[GtkRevealer_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkRevealer_queueautoptr = o
  extension (v: GtkRevealer_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkRevealer_slistautoptr = Ptr[GSList]
object GtkRevealer_slistautoptr: 
  given _tag: Tag[GtkRevealer_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkRevealer_slistautoptr = o
  extension (v: GtkRevealer_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkRoot_autoptr = Ptr[GtkRoot]
object GtkRoot_autoptr: 
  given _tag: Tag[GtkRoot_autoptr] = Tag.Ptr[GtkRoot](GtkRoot._tag)
  inline def apply(inline o: Ptr[GtkRoot]): GtkRoot_autoptr = o
  extension (v: GtkRoot_autoptr)
    inline def value: Ptr[GtkRoot] = v

opaque type GtkRoot_listautoptr = Ptr[GList]
object GtkRoot_listautoptr: 
  given _tag: Tag[GtkRoot_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkRoot_listautoptr = o
  extension (v: GtkRoot_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkRoot_queueautoptr = Ptr[GQueue]
object GtkRoot_queueautoptr: 
  given _tag: Tag[GtkRoot_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkRoot_queueautoptr = o
  extension (v: GtkRoot_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkRoot_slistautoptr = Ptr[GSList]
object GtkRoot_slistautoptr: 
  given _tag: Tag[GtkRoot_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkRoot_slistautoptr = o
  extension (v: GtkRoot_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkScaleButton_autoptr = Ptr[GtkScaleButton]
object GtkScaleButton_autoptr: 
  given _tag: Tag[GtkScaleButton_autoptr] = Tag.Ptr[GtkScaleButton](GtkScaleButton._tag)
  inline def apply(inline o: Ptr[GtkScaleButton]): GtkScaleButton_autoptr = o
  extension (v: GtkScaleButton_autoptr)
    inline def value: Ptr[GtkScaleButton] = v

opaque type GtkScaleButton_listautoptr = Ptr[GList]
object GtkScaleButton_listautoptr: 
  given _tag: Tag[GtkScaleButton_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkScaleButton_listautoptr = o
  extension (v: GtkScaleButton_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkScaleButton_queueautoptr = Ptr[GQueue]
object GtkScaleButton_queueautoptr: 
  given _tag: Tag[GtkScaleButton_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkScaleButton_queueautoptr = o
  extension (v: GtkScaleButton_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkScaleButton_slistautoptr = Ptr[GSList]
object GtkScaleButton_slistautoptr: 
  given _tag: Tag[GtkScaleButton_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkScaleButton_slistautoptr = o
  extension (v: GtkScaleButton_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkScaleFormatValueFunc = CFuncPtr3[Ptr[GtkScale], Double, gpointer, CString]
object GtkScaleFormatValueFunc: 
  given _tag: Tag[GtkScaleFormatValueFunc] = Tag.materializeCFuncPtr3[Ptr[GtkScale], Double, gpointer, CString]
  inline def apply(inline o: CFuncPtr3[Ptr[GtkScale], Double, gpointer, CString]): GtkScaleFormatValueFunc = o
  extension (v: GtkScaleFormatValueFunc)
    inline def value: CFuncPtr3[Ptr[GtkScale], Double, gpointer, CString] = v

opaque type GtkScale_autoptr = Ptr[GtkScale]
object GtkScale_autoptr: 
  given _tag: Tag[GtkScale_autoptr] = Tag.Ptr[GtkScale](GtkScale._tag)
  inline def apply(inline o: Ptr[GtkScale]): GtkScale_autoptr = o
  extension (v: GtkScale_autoptr)
    inline def value: Ptr[GtkScale] = v

opaque type GtkScale_listautoptr = Ptr[GList]
object GtkScale_listautoptr: 
  given _tag: Tag[GtkScale_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkScale_listautoptr = o
  extension (v: GtkScale_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkScale_queueautoptr = Ptr[GQueue]
object GtkScale_queueautoptr: 
  given _tag: Tag[GtkScale_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkScale_queueautoptr = o
  extension (v: GtkScale_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkScale_slistautoptr = Ptr[GSList]
object GtkScale_slistautoptr: 
  given _tag: Tag[GtkScale_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkScale_slistautoptr = o
  extension (v: GtkScale_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkScrollable_autoptr = Ptr[GtkScrollable]
object GtkScrollable_autoptr: 
  given _tag: Tag[GtkScrollable_autoptr] = Tag.Ptr[GtkScrollable](GtkScrollable._tag)
  inline def apply(inline o: Ptr[GtkScrollable]): GtkScrollable_autoptr = o
  extension (v: GtkScrollable_autoptr)
    inline def value: Ptr[GtkScrollable] = v

opaque type GtkScrollable_listautoptr = Ptr[GList]
object GtkScrollable_listautoptr: 
  given _tag: Tag[GtkScrollable_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkScrollable_listautoptr = o
  extension (v: GtkScrollable_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkScrollable_queueautoptr = Ptr[GQueue]
object GtkScrollable_queueautoptr: 
  given _tag: Tag[GtkScrollable_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkScrollable_queueautoptr = o
  extension (v: GtkScrollable_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkScrollable_slistautoptr = Ptr[GSList]
object GtkScrollable_slistautoptr: 
  given _tag: Tag[GtkScrollable_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkScrollable_slistautoptr = o
  extension (v: GtkScrollable_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkScrollbar_autoptr = Ptr[GtkScrollbar]
object GtkScrollbar_autoptr: 
  given _tag: Tag[GtkScrollbar_autoptr] = Tag.Ptr[GtkScrollbar](GtkScrollbar._tag)
  inline def apply(inline o: Ptr[GtkScrollbar]): GtkScrollbar_autoptr = o
  extension (v: GtkScrollbar_autoptr)
    inline def value: Ptr[GtkScrollbar] = v

opaque type GtkScrollbar_listautoptr = Ptr[GList]
object GtkScrollbar_listautoptr: 
  given _tag: Tag[GtkScrollbar_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkScrollbar_listautoptr = o
  extension (v: GtkScrollbar_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkScrollbar_queueautoptr = Ptr[GQueue]
object GtkScrollbar_queueautoptr: 
  given _tag: Tag[GtkScrollbar_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkScrollbar_queueautoptr = o
  extension (v: GtkScrollbar_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkScrollbar_slistautoptr = Ptr[GSList]
object GtkScrollbar_slistautoptr: 
  given _tag: Tag[GtkScrollbar_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkScrollbar_slistautoptr = o
  extension (v: GtkScrollbar_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkScrolledWindow_autoptr = Ptr[GtkScrolledWindow]
object GtkScrolledWindow_autoptr: 
  given _tag: Tag[GtkScrolledWindow_autoptr] = Tag.Ptr[GtkScrolledWindow](GtkScrolledWindow._tag)
  inline def apply(inline o: Ptr[GtkScrolledWindow]): GtkScrolledWindow_autoptr = o
  extension (v: GtkScrolledWindow_autoptr)
    inline def value: Ptr[GtkScrolledWindow] = v

opaque type GtkScrolledWindow_listautoptr = Ptr[GList]
object GtkScrolledWindow_listautoptr: 
  given _tag: Tag[GtkScrolledWindow_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkScrolledWindow_listautoptr = o
  extension (v: GtkScrolledWindow_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkScrolledWindow_queueautoptr = Ptr[GQueue]
object GtkScrolledWindow_queueautoptr: 
  given _tag: Tag[GtkScrolledWindow_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkScrolledWindow_queueautoptr = o
  extension (v: GtkScrolledWindow_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkScrolledWindow_slistautoptr = Ptr[GSList]
object GtkScrolledWindow_slistautoptr: 
  given _tag: Tag[GtkScrolledWindow_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkScrolledWindow_slistautoptr = o
  extension (v: GtkScrolledWindow_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkSearchBar_autoptr = Ptr[GtkSearchBar]
object GtkSearchBar_autoptr: 
  given _tag: Tag[GtkSearchBar_autoptr] = Tag.Ptr[GtkSearchBar](GtkSearchBar._tag)
  inline def apply(inline o: Ptr[GtkSearchBar]): GtkSearchBar_autoptr = o
  extension (v: GtkSearchBar_autoptr)
    inline def value: Ptr[GtkSearchBar] = v

opaque type GtkSearchBar_listautoptr = Ptr[GList]
object GtkSearchBar_listautoptr: 
  given _tag: Tag[GtkSearchBar_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkSearchBar_listautoptr = o
  extension (v: GtkSearchBar_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkSearchBar_queueautoptr = Ptr[GQueue]
object GtkSearchBar_queueautoptr: 
  given _tag: Tag[GtkSearchBar_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkSearchBar_queueautoptr = o
  extension (v: GtkSearchBar_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkSearchBar_slistautoptr = Ptr[GSList]
object GtkSearchBar_slistautoptr: 
  given _tag: Tag[GtkSearchBar_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkSearchBar_slistautoptr = o
  extension (v: GtkSearchBar_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkSearchEntry_autoptr = Ptr[GtkSearchEntry]
object GtkSearchEntry_autoptr: 
  given _tag: Tag[GtkSearchEntry_autoptr] = Tag.Ptr[GtkSearchEntry](GtkSearchEntry._tag)
  inline def apply(inline o: Ptr[GtkSearchEntry]): GtkSearchEntry_autoptr = o
  extension (v: GtkSearchEntry_autoptr)
    inline def value: Ptr[GtkSearchEntry] = v

opaque type GtkSearchEntry_listautoptr = Ptr[GList]
object GtkSearchEntry_listautoptr: 
  given _tag: Tag[GtkSearchEntry_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkSearchEntry_listautoptr = o
  extension (v: GtkSearchEntry_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkSearchEntry_queueautoptr = Ptr[GQueue]
object GtkSearchEntry_queueautoptr: 
  given _tag: Tag[GtkSearchEntry_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkSearchEntry_queueautoptr = o
  extension (v: GtkSearchEntry_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkSearchEntry_slistautoptr = Ptr[GSList]
object GtkSearchEntry_slistautoptr: 
  given _tag: Tag[GtkSearchEntry_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkSearchEntry_slistautoptr = o
  extension (v: GtkSearchEntry_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkSelectionFilterModelClass_autoptr = Ptr[GtkSelectionFilterModelClass]
object GtkSelectionFilterModelClass_autoptr: 
  given _tag: Tag[GtkSelectionFilterModelClass_autoptr] = Tag.Ptr[GtkSelectionFilterModelClass](GtkSelectionFilterModelClass._tag)
  inline def apply(inline o: Ptr[GtkSelectionFilterModelClass]): GtkSelectionFilterModelClass_autoptr = o
  extension (v: GtkSelectionFilterModelClass_autoptr)
    inline def value: Ptr[GtkSelectionFilterModelClass] = v

opaque type GtkSelectionFilterModelClass_listautoptr = Ptr[GList]
object GtkSelectionFilterModelClass_listautoptr: 
  given _tag: Tag[GtkSelectionFilterModelClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkSelectionFilterModelClass_listautoptr = o
  extension (v: GtkSelectionFilterModelClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkSelectionFilterModelClass_queueautoptr = Ptr[GQueue]
object GtkSelectionFilterModelClass_queueautoptr: 
  given _tag: Tag[GtkSelectionFilterModelClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkSelectionFilterModelClass_queueautoptr = o
  extension (v: GtkSelectionFilterModelClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkSelectionFilterModelClass_slistautoptr = Ptr[GSList]
object GtkSelectionFilterModelClass_slistautoptr: 
  given _tag: Tag[GtkSelectionFilterModelClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkSelectionFilterModelClass_slistautoptr = o
  extension (v: GtkSelectionFilterModelClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkSelectionFilterModel_autoptr = Ptr[GtkSelectionFilterModel]
object GtkSelectionFilterModel_autoptr: 
  given _tag: Tag[GtkSelectionFilterModel_autoptr] = Tag.Ptr[GtkSelectionFilterModel](GtkSelectionFilterModel._tag)
  inline def apply(inline o: Ptr[GtkSelectionFilterModel]): GtkSelectionFilterModel_autoptr = o
  extension (v: GtkSelectionFilterModel_autoptr)
    inline def value: Ptr[GtkSelectionFilterModel] = v

opaque type GtkSelectionFilterModel_listautoptr = Ptr[GList]
object GtkSelectionFilterModel_listautoptr: 
  given _tag: Tag[GtkSelectionFilterModel_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkSelectionFilterModel_listautoptr = o
  extension (v: GtkSelectionFilterModel_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkSelectionFilterModel_queueautoptr = Ptr[GQueue]
object GtkSelectionFilterModel_queueautoptr: 
  given _tag: Tag[GtkSelectionFilterModel_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkSelectionFilterModel_queueautoptr = o
  extension (v: GtkSelectionFilterModel_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkSelectionFilterModel_slistautoptr = Ptr[GSList]
object GtkSelectionFilterModel_slistautoptr: 
  given _tag: Tag[GtkSelectionFilterModel_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkSelectionFilterModel_slistautoptr = o
  extension (v: GtkSelectionFilterModel_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkSelectionModel_autoptr = Ptr[GtkSelectionModel]
object GtkSelectionModel_autoptr: 
  given _tag: Tag[GtkSelectionModel_autoptr] = Tag.Ptr[GtkSelectionModel](GtkSelectionModel._tag)
  inline def apply(inline o: Ptr[GtkSelectionModel]): GtkSelectionModel_autoptr = o
  extension (v: GtkSelectionModel_autoptr)
    inline def value: Ptr[GtkSelectionModel] = v

opaque type GtkSelectionModel_listautoptr = Ptr[GList]
object GtkSelectionModel_listautoptr: 
  given _tag: Tag[GtkSelectionModel_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkSelectionModel_listautoptr = o
  extension (v: GtkSelectionModel_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkSelectionModel_queueautoptr = Ptr[GQueue]
object GtkSelectionModel_queueautoptr: 
  given _tag: Tag[GtkSelectionModel_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkSelectionModel_queueautoptr = o
  extension (v: GtkSelectionModel_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkSelectionModel_slistautoptr = Ptr[GSList]
object GtkSelectionModel_slistautoptr: 
  given _tag: Tag[GtkSelectionModel_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkSelectionModel_slistautoptr = o
  extension (v: GtkSelectionModel_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkSeparator_autoptr = Ptr[GtkSeparator]
object GtkSeparator_autoptr: 
  given _tag: Tag[GtkSeparator_autoptr] = Tag.Ptr[GtkSeparator](GtkSeparator._tag)
  inline def apply(inline o: Ptr[GtkSeparator]): GtkSeparator_autoptr = o
  extension (v: GtkSeparator_autoptr)
    inline def value: Ptr[GtkSeparator] = v

opaque type GtkSeparator_listautoptr = Ptr[GList]
object GtkSeparator_listautoptr: 
  given _tag: Tag[GtkSeparator_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkSeparator_listautoptr = o
  extension (v: GtkSeparator_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkSeparator_queueautoptr = Ptr[GQueue]
object GtkSeparator_queueautoptr: 
  given _tag: Tag[GtkSeparator_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkSeparator_queueautoptr = o
  extension (v: GtkSeparator_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkSeparator_slistautoptr = Ptr[GSList]
object GtkSeparator_slistautoptr: 
  given _tag: Tag[GtkSeparator_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkSeparator_slistautoptr = o
  extension (v: GtkSeparator_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkSettings_autoptr = Ptr[GtkSettings]
object GtkSettings_autoptr: 
  given _tag: Tag[GtkSettings_autoptr] = Tag.Ptr[GtkSettings](GtkSettings._tag)
  inline def apply(inline o: Ptr[GtkSettings]): GtkSettings_autoptr = o
  extension (v: GtkSettings_autoptr)
    inline def value: Ptr[GtkSettings] = v

opaque type GtkSettings_listautoptr = Ptr[GList]
object GtkSettings_listautoptr: 
  given _tag: Tag[GtkSettings_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkSettings_listautoptr = o
  extension (v: GtkSettings_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkSettings_queueautoptr = Ptr[GQueue]
object GtkSettings_queueautoptr: 
  given _tag: Tag[GtkSettings_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkSettings_queueautoptr = o
  extension (v: GtkSettings_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkSettings_slistautoptr = Ptr[GSList]
object GtkSettings_slistautoptr: 
  given _tag: Tag[GtkSettings_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkSettings_slistautoptr = o
  extension (v: GtkSettings_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkShortcutActionClass_autoptr = Ptr[GtkShortcutActionClass]
object GtkShortcutActionClass_autoptr: 
  given _tag: Tag[GtkShortcutActionClass_autoptr] = Tag.Ptr[GtkShortcutActionClass](GtkShortcutActionClass._tag)
  inline def apply(inline o: Ptr[GtkShortcutActionClass]): GtkShortcutActionClass_autoptr = o
  extension (v: GtkShortcutActionClass_autoptr)
    inline def value: Ptr[GtkShortcutActionClass] = v

opaque type GtkShortcutActionClass_listautoptr = Ptr[GList]
object GtkShortcutActionClass_listautoptr: 
  given _tag: Tag[GtkShortcutActionClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkShortcutActionClass_listautoptr = o
  extension (v: GtkShortcutActionClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkShortcutActionClass_queueautoptr = Ptr[GQueue]
object GtkShortcutActionClass_queueautoptr: 
  given _tag: Tag[GtkShortcutActionClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkShortcutActionClass_queueautoptr = o
  extension (v: GtkShortcutActionClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkShortcutActionClass_slistautoptr = Ptr[GSList]
object GtkShortcutActionClass_slistautoptr: 
  given _tag: Tag[GtkShortcutActionClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkShortcutActionClass_slistautoptr = o
  extension (v: GtkShortcutActionClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkShortcutAction_autoptr = Ptr[GtkShortcutAction]
object GtkShortcutAction_autoptr: 
  given _tag: Tag[GtkShortcutAction_autoptr] = Tag.Ptr[GtkShortcutAction](GtkShortcutAction._tag)
  inline def apply(inline o: Ptr[GtkShortcutAction]): GtkShortcutAction_autoptr = o
  extension (v: GtkShortcutAction_autoptr)
    inline def value: Ptr[GtkShortcutAction] = v

opaque type GtkShortcutAction_listautoptr = Ptr[GList]
object GtkShortcutAction_listautoptr: 
  given _tag: Tag[GtkShortcutAction_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkShortcutAction_listautoptr = o
  extension (v: GtkShortcutAction_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkShortcutAction_queueautoptr = Ptr[GQueue]
object GtkShortcutAction_queueautoptr: 
  given _tag: Tag[GtkShortcutAction_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkShortcutAction_queueautoptr = o
  extension (v: GtkShortcutAction_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkShortcutAction_slistautoptr = Ptr[GSList]
object GtkShortcutAction_slistautoptr: 
  given _tag: Tag[GtkShortcutAction_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkShortcutAction_slistautoptr = o
  extension (v: GtkShortcutAction_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkShortcutClass_autoptr = Ptr[GtkShortcutClass]
object GtkShortcutClass_autoptr: 
  given _tag: Tag[GtkShortcutClass_autoptr] = Tag.Ptr[GtkShortcutClass](GtkShortcutClass._tag)
  inline def apply(inline o: Ptr[GtkShortcutClass]): GtkShortcutClass_autoptr = o
  extension (v: GtkShortcutClass_autoptr)
    inline def value: Ptr[GtkShortcutClass] = v

opaque type GtkShortcutClass_listautoptr = Ptr[GList]
object GtkShortcutClass_listautoptr: 
  given _tag: Tag[GtkShortcutClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkShortcutClass_listautoptr = o
  extension (v: GtkShortcutClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkShortcutClass_queueautoptr = Ptr[GQueue]
object GtkShortcutClass_queueautoptr: 
  given _tag: Tag[GtkShortcutClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkShortcutClass_queueautoptr = o
  extension (v: GtkShortcutClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkShortcutClass_slistautoptr = Ptr[GSList]
object GtkShortcutClass_slistautoptr: 
  given _tag: Tag[GtkShortcutClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkShortcutClass_slistautoptr = o
  extension (v: GtkShortcutClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkShortcutFunc = CFuncPtr3[Ptr[GtkWidget], Ptr[GVariant], gpointer, gboolean]
object GtkShortcutFunc: 
  given _tag: Tag[GtkShortcutFunc] = Tag.materializeCFuncPtr3[Ptr[GtkWidget], Ptr[GVariant], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr3[Ptr[GtkWidget], Ptr[GVariant], gpointer, gboolean]): GtkShortcutFunc = o
  extension (v: GtkShortcutFunc)
    inline def value: CFuncPtr3[Ptr[GtkWidget], Ptr[GVariant], gpointer, gboolean] = v

opaque type GtkShortcutManager_autoptr = Ptr[GtkShortcutManager]
object GtkShortcutManager_autoptr: 
  given _tag: Tag[GtkShortcutManager_autoptr] = Tag.Ptr[GtkShortcutManager](GtkShortcutManager._tag)
  inline def apply(inline o: Ptr[GtkShortcutManager]): GtkShortcutManager_autoptr = o
  extension (v: GtkShortcutManager_autoptr)
    inline def value: Ptr[GtkShortcutManager] = v

opaque type GtkShortcutManager_listautoptr = Ptr[GList]
object GtkShortcutManager_listautoptr: 
  given _tag: Tag[GtkShortcutManager_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkShortcutManager_listautoptr = o
  extension (v: GtkShortcutManager_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkShortcutManager_queueautoptr = Ptr[GQueue]
object GtkShortcutManager_queueautoptr: 
  given _tag: Tag[GtkShortcutManager_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkShortcutManager_queueautoptr = o
  extension (v: GtkShortcutManager_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkShortcutManager_slistautoptr = Ptr[GSList]
object GtkShortcutManager_slistautoptr: 
  given _tag: Tag[GtkShortcutManager_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkShortcutManager_slistautoptr = o
  extension (v: GtkShortcutManager_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkShortcutTriggerClass_autoptr = Ptr[GtkShortcutTriggerClass]
object GtkShortcutTriggerClass_autoptr: 
  given _tag: Tag[GtkShortcutTriggerClass_autoptr] = Tag.Ptr[GtkShortcutTriggerClass](GtkShortcutTriggerClass._tag)
  inline def apply(inline o: Ptr[GtkShortcutTriggerClass]): GtkShortcutTriggerClass_autoptr = o
  extension (v: GtkShortcutTriggerClass_autoptr)
    inline def value: Ptr[GtkShortcutTriggerClass] = v

opaque type GtkShortcutTriggerClass_listautoptr = Ptr[GList]
object GtkShortcutTriggerClass_listautoptr: 
  given _tag: Tag[GtkShortcutTriggerClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkShortcutTriggerClass_listautoptr = o
  extension (v: GtkShortcutTriggerClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkShortcutTriggerClass_queueautoptr = Ptr[GQueue]
object GtkShortcutTriggerClass_queueautoptr: 
  given _tag: Tag[GtkShortcutTriggerClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkShortcutTriggerClass_queueautoptr = o
  extension (v: GtkShortcutTriggerClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkShortcutTriggerClass_slistautoptr = Ptr[GSList]
object GtkShortcutTriggerClass_slistautoptr: 
  given _tag: Tag[GtkShortcutTriggerClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkShortcutTriggerClass_slistautoptr = o
  extension (v: GtkShortcutTriggerClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkShortcutTrigger_autoptr = Ptr[GtkShortcutTrigger]
object GtkShortcutTrigger_autoptr: 
  given _tag: Tag[GtkShortcutTrigger_autoptr] = Tag.Ptr[GtkShortcutTrigger](GtkShortcutTrigger._tag)
  inline def apply(inline o: Ptr[GtkShortcutTrigger]): GtkShortcutTrigger_autoptr = o
  extension (v: GtkShortcutTrigger_autoptr)
    inline def value: Ptr[GtkShortcutTrigger] = v

opaque type GtkShortcutTrigger_listautoptr = Ptr[GList]
object GtkShortcutTrigger_listautoptr: 
  given _tag: Tag[GtkShortcutTrigger_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkShortcutTrigger_listautoptr = o
  extension (v: GtkShortcutTrigger_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkShortcutTrigger_queueautoptr = Ptr[GQueue]
object GtkShortcutTrigger_queueautoptr: 
  given _tag: Tag[GtkShortcutTrigger_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkShortcutTrigger_queueautoptr = o
  extension (v: GtkShortcutTrigger_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkShortcutTrigger_slistautoptr = Ptr[GSList]
object GtkShortcutTrigger_slistautoptr: 
  given _tag: Tag[GtkShortcutTrigger_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkShortcutTrigger_slistautoptr = o
  extension (v: GtkShortcutTrigger_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkShortcut_autoptr = Ptr[GtkShortcut]
object GtkShortcut_autoptr: 
  given _tag: Tag[GtkShortcut_autoptr] = Tag.Ptr[GtkShortcut](GtkShortcut._tag)
  inline def apply(inline o: Ptr[GtkShortcut]): GtkShortcut_autoptr = o
  extension (v: GtkShortcut_autoptr)
    inline def value: Ptr[GtkShortcut] = v

opaque type GtkShortcut_listautoptr = Ptr[GList]
object GtkShortcut_listautoptr: 
  given _tag: Tag[GtkShortcut_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkShortcut_listautoptr = o
  extension (v: GtkShortcut_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkShortcut_queueautoptr = Ptr[GQueue]
object GtkShortcut_queueautoptr: 
  given _tag: Tag[GtkShortcut_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkShortcut_queueautoptr = o
  extension (v: GtkShortcut_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkShortcut_slistautoptr = Ptr[GSList]
object GtkShortcut_slistautoptr: 
  given _tag: Tag[GtkShortcut_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkShortcut_slistautoptr = o
  extension (v: GtkShortcut_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkShortcutsWindow_autoptr = Ptr[GtkShortcutsWindow]
object GtkShortcutsWindow_autoptr: 
  given _tag: Tag[GtkShortcutsWindow_autoptr] = Tag.Ptr[GtkShortcutsWindow](GtkShortcutsWindow._tag)
  inline def apply(inline o: Ptr[GtkShortcutsWindow]): GtkShortcutsWindow_autoptr = o
  extension (v: GtkShortcutsWindow_autoptr)
    inline def value: Ptr[GtkShortcutsWindow] = v

opaque type GtkShortcutsWindow_listautoptr = Ptr[GList]
object GtkShortcutsWindow_listautoptr: 
  given _tag: Tag[GtkShortcutsWindow_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkShortcutsWindow_listautoptr = o
  extension (v: GtkShortcutsWindow_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkShortcutsWindow_queueautoptr = Ptr[GQueue]
object GtkShortcutsWindow_queueautoptr: 
  given _tag: Tag[GtkShortcutsWindow_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkShortcutsWindow_queueautoptr = o
  extension (v: GtkShortcutsWindow_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkShortcutsWindow_slistautoptr = Ptr[GSList]
object GtkShortcutsWindow_slistautoptr: 
  given _tag: Tag[GtkShortcutsWindow_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkShortcutsWindow_slistautoptr = o
  extension (v: GtkShortcutsWindow_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkSignalActionClass_autoptr = Ptr[GtkSignalActionClass]
object GtkSignalActionClass_autoptr: 
  given _tag: Tag[GtkSignalActionClass_autoptr] = Tag.Ptr[GtkSignalActionClass](GtkSignalActionClass._tag)
  inline def apply(inline o: Ptr[GtkSignalActionClass]): GtkSignalActionClass_autoptr = o
  extension (v: GtkSignalActionClass_autoptr)
    inline def value: Ptr[GtkSignalActionClass] = v

opaque type GtkSignalActionClass_listautoptr = Ptr[GList]
object GtkSignalActionClass_listautoptr: 
  given _tag: Tag[GtkSignalActionClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkSignalActionClass_listautoptr = o
  extension (v: GtkSignalActionClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkSignalActionClass_queueautoptr = Ptr[GQueue]
object GtkSignalActionClass_queueautoptr: 
  given _tag: Tag[GtkSignalActionClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkSignalActionClass_queueautoptr = o
  extension (v: GtkSignalActionClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkSignalActionClass_slistautoptr = Ptr[GSList]
object GtkSignalActionClass_slistautoptr: 
  given _tag: Tag[GtkSignalActionClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkSignalActionClass_slistautoptr = o
  extension (v: GtkSignalActionClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkSignalAction_autoptr = Ptr[GtkSignalAction]
object GtkSignalAction_autoptr: 
  given _tag: Tag[GtkSignalAction_autoptr] = Tag.Ptr[GtkSignalAction](GtkSignalAction._tag)
  inline def apply(inline o: Ptr[GtkSignalAction]): GtkSignalAction_autoptr = o
  extension (v: GtkSignalAction_autoptr)
    inline def value: Ptr[GtkSignalAction] = v

opaque type GtkSignalAction_listautoptr = Ptr[GList]
object GtkSignalAction_listautoptr: 
  given _tag: Tag[GtkSignalAction_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkSignalAction_listautoptr = o
  extension (v: GtkSignalAction_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkSignalAction_queueautoptr = Ptr[GQueue]
object GtkSignalAction_queueautoptr: 
  given _tag: Tag[GtkSignalAction_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkSignalAction_queueautoptr = o
  extension (v: GtkSignalAction_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkSignalAction_slistautoptr = Ptr[GSList]
object GtkSignalAction_slistautoptr: 
  given _tag: Tag[GtkSignalAction_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkSignalAction_slistautoptr = o
  extension (v: GtkSignalAction_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkSingleSelectionClass_autoptr = Ptr[GtkSingleSelectionClass]
object GtkSingleSelectionClass_autoptr: 
  given _tag: Tag[GtkSingleSelectionClass_autoptr] = Tag.Ptr[GtkSingleSelectionClass](GtkSingleSelectionClass._tag)
  inline def apply(inline o: Ptr[GtkSingleSelectionClass]): GtkSingleSelectionClass_autoptr = o
  extension (v: GtkSingleSelectionClass_autoptr)
    inline def value: Ptr[GtkSingleSelectionClass] = v

opaque type GtkSingleSelectionClass_listautoptr = Ptr[GList]
object GtkSingleSelectionClass_listautoptr: 
  given _tag: Tag[GtkSingleSelectionClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkSingleSelectionClass_listautoptr = o
  extension (v: GtkSingleSelectionClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkSingleSelectionClass_queueautoptr = Ptr[GQueue]
object GtkSingleSelectionClass_queueautoptr: 
  given _tag: Tag[GtkSingleSelectionClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkSingleSelectionClass_queueautoptr = o
  extension (v: GtkSingleSelectionClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkSingleSelectionClass_slistautoptr = Ptr[GSList]
object GtkSingleSelectionClass_slistautoptr: 
  given _tag: Tag[GtkSingleSelectionClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkSingleSelectionClass_slistautoptr = o
  extension (v: GtkSingleSelectionClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkSingleSelection_autoptr = Ptr[GtkSingleSelection]
object GtkSingleSelection_autoptr: 
  given _tag: Tag[GtkSingleSelection_autoptr] = Tag.Ptr[GtkSingleSelection](GtkSingleSelection._tag)
  inline def apply(inline o: Ptr[GtkSingleSelection]): GtkSingleSelection_autoptr = o
  extension (v: GtkSingleSelection_autoptr)
    inline def value: Ptr[GtkSingleSelection] = v

opaque type GtkSingleSelection_listautoptr = Ptr[GList]
object GtkSingleSelection_listautoptr: 
  given _tag: Tag[GtkSingleSelection_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkSingleSelection_listautoptr = o
  extension (v: GtkSingleSelection_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkSingleSelection_queueautoptr = Ptr[GQueue]
object GtkSingleSelection_queueautoptr: 
  given _tag: Tag[GtkSingleSelection_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkSingleSelection_queueautoptr = o
  extension (v: GtkSingleSelection_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkSingleSelection_slistautoptr = Ptr[GSList]
object GtkSingleSelection_slistautoptr: 
  given _tag: Tag[GtkSingleSelection_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkSingleSelection_slistautoptr = o
  extension (v: GtkSingleSelection_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkSizeGroup_autoptr = Ptr[GtkSizeGroup]
object GtkSizeGroup_autoptr: 
  given _tag: Tag[GtkSizeGroup_autoptr] = Tag.Ptr[GtkSizeGroup](GtkSizeGroup._tag)
  inline def apply(inline o: Ptr[GtkSizeGroup]): GtkSizeGroup_autoptr = o
  extension (v: GtkSizeGroup_autoptr)
    inline def value: Ptr[GtkSizeGroup] = v

opaque type GtkSizeGroup_listautoptr = Ptr[GList]
object GtkSizeGroup_listautoptr: 
  given _tag: Tag[GtkSizeGroup_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkSizeGroup_listautoptr = o
  extension (v: GtkSizeGroup_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkSizeGroup_queueautoptr = Ptr[GQueue]
object GtkSizeGroup_queueautoptr: 
  given _tag: Tag[GtkSizeGroup_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkSizeGroup_queueautoptr = o
  extension (v: GtkSizeGroup_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkSizeGroup_slistautoptr = Ptr[GSList]
object GtkSizeGroup_slistautoptr: 
  given _tag: Tag[GtkSizeGroup_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkSizeGroup_slistautoptr = o
  extension (v: GtkSizeGroup_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkSliceListModelClass_autoptr = Ptr[GtkSliceListModelClass]
object GtkSliceListModelClass_autoptr: 
  given _tag: Tag[GtkSliceListModelClass_autoptr] = Tag.Ptr[GtkSliceListModelClass](GtkSliceListModelClass._tag)
  inline def apply(inline o: Ptr[GtkSliceListModelClass]): GtkSliceListModelClass_autoptr = o
  extension (v: GtkSliceListModelClass_autoptr)
    inline def value: Ptr[GtkSliceListModelClass] = v

opaque type GtkSliceListModelClass_listautoptr = Ptr[GList]
object GtkSliceListModelClass_listautoptr: 
  given _tag: Tag[GtkSliceListModelClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkSliceListModelClass_listautoptr = o
  extension (v: GtkSliceListModelClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkSliceListModelClass_queueautoptr = Ptr[GQueue]
object GtkSliceListModelClass_queueautoptr: 
  given _tag: Tag[GtkSliceListModelClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkSliceListModelClass_queueautoptr = o
  extension (v: GtkSliceListModelClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkSliceListModelClass_slistautoptr = Ptr[GSList]
object GtkSliceListModelClass_slistautoptr: 
  given _tag: Tag[GtkSliceListModelClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkSliceListModelClass_slistautoptr = o
  extension (v: GtkSliceListModelClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkSliceListModel_autoptr = Ptr[GtkSliceListModel]
object GtkSliceListModel_autoptr: 
  given _tag: Tag[GtkSliceListModel_autoptr] = Tag.Ptr[GtkSliceListModel](GtkSliceListModel._tag)
  inline def apply(inline o: Ptr[GtkSliceListModel]): GtkSliceListModel_autoptr = o
  extension (v: GtkSliceListModel_autoptr)
    inline def value: Ptr[GtkSliceListModel] = v

opaque type GtkSliceListModel_listautoptr = Ptr[GList]
object GtkSliceListModel_listautoptr: 
  given _tag: Tag[GtkSliceListModel_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkSliceListModel_listautoptr = o
  extension (v: GtkSliceListModel_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkSliceListModel_queueautoptr = Ptr[GQueue]
object GtkSliceListModel_queueautoptr: 
  given _tag: Tag[GtkSliceListModel_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkSliceListModel_queueautoptr = o
  extension (v: GtkSliceListModel_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkSliceListModel_slistautoptr = Ptr[GSList]
object GtkSliceListModel_slistautoptr: 
  given _tag: Tag[GtkSliceListModel_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkSliceListModel_slistautoptr = o
  extension (v: GtkSliceListModel_slistautoptr)
    inline def value: Ptr[GSList] = v

type GtkSnapshot = GdkSnapshot
object GtkSnapshot: 
  given _tag: Tag[GtkSnapshot] = GdkSnapshot._tag
  inline def apply(inline o: GdkSnapshot): GtkSnapshot = o
  extension (v: GtkSnapshot)
    inline def value: GdkSnapshot = v

opaque type GtkSnapshot_autoptr = Ptr[GtkSnapshot]
object GtkSnapshot_autoptr: 
  given _tag: Tag[GtkSnapshot_autoptr] = Tag.Ptr[GtkSnapshot](GtkSnapshot._tag)
  inline def apply(inline o: Ptr[GtkSnapshot]): GtkSnapshot_autoptr = o
  extension (v: GtkSnapshot_autoptr)
    inline def value: Ptr[GtkSnapshot] = v

opaque type GtkSnapshot_listautoptr = Ptr[GList]
object GtkSnapshot_listautoptr: 
  given _tag: Tag[GtkSnapshot_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkSnapshot_listautoptr = o
  extension (v: GtkSnapshot_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkSnapshot_queueautoptr = Ptr[GQueue]
object GtkSnapshot_queueautoptr: 
  given _tag: Tag[GtkSnapshot_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkSnapshot_queueautoptr = o
  extension (v: GtkSnapshot_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkSnapshot_slistautoptr = Ptr[GSList]
object GtkSnapshot_slistautoptr: 
  given _tag: Tag[GtkSnapshot_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkSnapshot_slistautoptr = o
  extension (v: GtkSnapshot_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkSortListModelClass_autoptr = Ptr[GtkSortListModelClass]
object GtkSortListModelClass_autoptr: 
  given _tag: Tag[GtkSortListModelClass_autoptr] = Tag.Ptr[GtkSortListModelClass](GtkSortListModelClass._tag)
  inline def apply(inline o: Ptr[GtkSortListModelClass]): GtkSortListModelClass_autoptr = o
  extension (v: GtkSortListModelClass_autoptr)
    inline def value: Ptr[GtkSortListModelClass] = v

opaque type GtkSortListModelClass_listautoptr = Ptr[GList]
object GtkSortListModelClass_listautoptr: 
  given _tag: Tag[GtkSortListModelClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkSortListModelClass_listautoptr = o
  extension (v: GtkSortListModelClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkSortListModelClass_queueautoptr = Ptr[GQueue]
object GtkSortListModelClass_queueautoptr: 
  given _tag: Tag[GtkSortListModelClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkSortListModelClass_queueautoptr = o
  extension (v: GtkSortListModelClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkSortListModelClass_slistautoptr = Ptr[GSList]
object GtkSortListModelClass_slistautoptr: 
  given _tag: Tag[GtkSortListModelClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkSortListModelClass_slistautoptr = o
  extension (v: GtkSortListModelClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkSortListModel_autoptr = Ptr[GtkSortListModel]
object GtkSortListModel_autoptr: 
  given _tag: Tag[GtkSortListModel_autoptr] = Tag.Ptr[GtkSortListModel](GtkSortListModel._tag)
  inline def apply(inline o: Ptr[GtkSortListModel]): GtkSortListModel_autoptr = o
  extension (v: GtkSortListModel_autoptr)
    inline def value: Ptr[GtkSortListModel] = v

opaque type GtkSortListModel_listautoptr = Ptr[GList]
object GtkSortListModel_listautoptr: 
  given _tag: Tag[GtkSortListModel_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkSortListModel_listautoptr = o
  extension (v: GtkSortListModel_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkSortListModel_queueautoptr = Ptr[GQueue]
object GtkSortListModel_queueautoptr: 
  given _tag: Tag[GtkSortListModel_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkSortListModel_queueautoptr = o
  extension (v: GtkSortListModel_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkSortListModel_slistautoptr = Ptr[GSList]
object GtkSortListModel_slistautoptr: 
  given _tag: Tag[GtkSortListModel_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkSortListModel_slistautoptr = o
  extension (v: GtkSortListModel_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkSorterClass_autoptr = Ptr[GtkSorterClass]
object GtkSorterClass_autoptr: 
  given _tag: Tag[GtkSorterClass_autoptr] = Tag.Ptr[GtkSorterClass](GtkSorterClass._tag)
  inline def apply(inline o: Ptr[GtkSorterClass]): GtkSorterClass_autoptr = o
  extension (v: GtkSorterClass_autoptr)
    inline def value: Ptr[GtkSorterClass] = v

opaque type GtkSorterClass_listautoptr = Ptr[GList]
object GtkSorterClass_listautoptr: 
  given _tag: Tag[GtkSorterClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkSorterClass_listautoptr = o
  extension (v: GtkSorterClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkSorterClass_queueautoptr = Ptr[GQueue]
object GtkSorterClass_queueautoptr: 
  given _tag: Tag[GtkSorterClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkSorterClass_queueautoptr = o
  extension (v: GtkSorterClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkSorterClass_slistautoptr = Ptr[GSList]
object GtkSorterClass_slistautoptr: 
  given _tag: Tag[GtkSorterClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkSorterClass_slistautoptr = o
  extension (v: GtkSorterClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkSorter_autoptr = Ptr[GtkSorter]
object GtkSorter_autoptr: 
  given _tag: Tag[GtkSorter_autoptr] = Tag.Ptr[GtkSorter](GtkSorter._tag)
  inline def apply(inline o: Ptr[GtkSorter]): GtkSorter_autoptr = o
  extension (v: GtkSorter_autoptr)
    inline def value: Ptr[GtkSorter] = v

opaque type GtkSorter_listautoptr = Ptr[GList]
object GtkSorter_listautoptr: 
  given _tag: Tag[GtkSorter_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkSorter_listautoptr = o
  extension (v: GtkSorter_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkSorter_queueautoptr = Ptr[GQueue]
object GtkSorter_queueautoptr: 
  given _tag: Tag[GtkSorter_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkSorter_queueautoptr = o
  extension (v: GtkSorter_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkSorter_slistautoptr = Ptr[GSList]
object GtkSorter_slistautoptr: 
  given _tag: Tag[GtkSorter_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkSorter_slistautoptr = o
  extension (v: GtkSorter_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkSpinButton_autoptr = Ptr[GtkSpinButton]
object GtkSpinButton_autoptr: 
  given _tag: Tag[GtkSpinButton_autoptr] = Tag.Ptr[GtkSpinButton](GtkSpinButton._tag)
  inline def apply(inline o: Ptr[GtkSpinButton]): GtkSpinButton_autoptr = o
  extension (v: GtkSpinButton_autoptr)
    inline def value: Ptr[GtkSpinButton] = v

opaque type GtkSpinButton_listautoptr = Ptr[GList]
object GtkSpinButton_listautoptr: 
  given _tag: Tag[GtkSpinButton_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkSpinButton_listautoptr = o
  extension (v: GtkSpinButton_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkSpinButton_queueautoptr = Ptr[GQueue]
object GtkSpinButton_queueautoptr: 
  given _tag: Tag[GtkSpinButton_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkSpinButton_queueautoptr = o
  extension (v: GtkSpinButton_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkSpinButton_slistautoptr = Ptr[GSList]
object GtkSpinButton_slistautoptr: 
  given _tag: Tag[GtkSpinButton_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkSpinButton_slistautoptr = o
  extension (v: GtkSpinButton_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkSpinner_autoptr = Ptr[GtkSpinner]
object GtkSpinner_autoptr: 
  given _tag: Tag[GtkSpinner_autoptr] = Tag.Ptr[GtkSpinner](GtkSpinner._tag)
  inline def apply(inline o: Ptr[GtkSpinner]): GtkSpinner_autoptr = o
  extension (v: GtkSpinner_autoptr)
    inline def value: Ptr[GtkSpinner] = v

opaque type GtkSpinner_listautoptr = Ptr[GList]
object GtkSpinner_listautoptr: 
  given _tag: Tag[GtkSpinner_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkSpinner_listautoptr = o
  extension (v: GtkSpinner_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkSpinner_queueautoptr = Ptr[GQueue]
object GtkSpinner_queueautoptr: 
  given _tag: Tag[GtkSpinner_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkSpinner_queueautoptr = o
  extension (v: GtkSpinner_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkSpinner_slistautoptr = Ptr[GSList]
object GtkSpinner_slistautoptr: 
  given _tag: Tag[GtkSpinner_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkSpinner_slistautoptr = o
  extension (v: GtkSpinner_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkStackSidebar_autoptr = Ptr[GtkStackSidebar]
object GtkStackSidebar_autoptr: 
  given _tag: Tag[GtkStackSidebar_autoptr] = Tag.Ptr[GtkStackSidebar](GtkStackSidebar._tag)
  inline def apply(inline o: Ptr[GtkStackSidebar]): GtkStackSidebar_autoptr = o
  extension (v: GtkStackSidebar_autoptr)
    inline def value: Ptr[GtkStackSidebar] = v

opaque type GtkStackSidebar_listautoptr = Ptr[GList]
object GtkStackSidebar_listautoptr: 
  given _tag: Tag[GtkStackSidebar_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkStackSidebar_listautoptr = o
  extension (v: GtkStackSidebar_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkStackSidebar_queueautoptr = Ptr[GQueue]
object GtkStackSidebar_queueautoptr: 
  given _tag: Tag[GtkStackSidebar_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkStackSidebar_queueautoptr = o
  extension (v: GtkStackSidebar_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkStackSidebar_slistautoptr = Ptr[GSList]
object GtkStackSidebar_slistautoptr: 
  given _tag: Tag[GtkStackSidebar_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkStackSidebar_slistautoptr = o
  extension (v: GtkStackSidebar_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkStackSwitcher_autoptr = Ptr[GtkStackSwitcher]
object GtkStackSwitcher_autoptr: 
  given _tag: Tag[GtkStackSwitcher_autoptr] = Tag.Ptr[GtkStackSwitcher](GtkStackSwitcher._tag)
  inline def apply(inline o: Ptr[GtkStackSwitcher]): GtkStackSwitcher_autoptr = o
  extension (v: GtkStackSwitcher_autoptr)
    inline def value: Ptr[GtkStackSwitcher] = v

opaque type GtkStackSwitcher_listautoptr = Ptr[GList]
object GtkStackSwitcher_listautoptr: 
  given _tag: Tag[GtkStackSwitcher_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkStackSwitcher_listautoptr = o
  extension (v: GtkStackSwitcher_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkStackSwitcher_queueautoptr = Ptr[GQueue]
object GtkStackSwitcher_queueautoptr: 
  given _tag: Tag[GtkStackSwitcher_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkStackSwitcher_queueautoptr = o
  extension (v: GtkStackSwitcher_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkStackSwitcher_slistautoptr = Ptr[GSList]
object GtkStackSwitcher_slistautoptr: 
  given _tag: Tag[GtkStackSwitcher_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkStackSwitcher_slistautoptr = o
  extension (v: GtkStackSwitcher_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkStack_autoptr = Ptr[GtkStack]
object GtkStack_autoptr: 
  given _tag: Tag[GtkStack_autoptr] = Tag.Ptr[GtkStack](GtkStack._tag)
  inline def apply(inline o: Ptr[GtkStack]): GtkStack_autoptr = o
  extension (v: GtkStack_autoptr)
    inline def value: Ptr[GtkStack] = v

opaque type GtkStack_listautoptr = Ptr[GList]
object GtkStack_listautoptr: 
  given _tag: Tag[GtkStack_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkStack_listautoptr = o
  extension (v: GtkStack_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkStack_queueautoptr = Ptr[GQueue]
object GtkStack_queueautoptr: 
  given _tag: Tag[GtkStack_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkStack_queueautoptr = o
  extension (v: GtkStack_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkStack_slistautoptr = Ptr[GSList]
object GtkStack_slistautoptr: 
  given _tag: Tag[GtkStack_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkStack_slistautoptr = o
  extension (v: GtkStack_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkStatusbar_autoptr = Ptr[GtkStatusbar]
object GtkStatusbar_autoptr: 
  given _tag: Tag[GtkStatusbar_autoptr] = Tag.Ptr[GtkStatusbar](GtkStatusbar._tag)
  inline def apply(inline o: Ptr[GtkStatusbar]): GtkStatusbar_autoptr = o
  extension (v: GtkStatusbar_autoptr)
    inline def value: Ptr[GtkStatusbar] = v

opaque type GtkStatusbar_listautoptr = Ptr[GList]
object GtkStatusbar_listautoptr: 
  given _tag: Tag[GtkStatusbar_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkStatusbar_listautoptr = o
  extension (v: GtkStatusbar_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkStatusbar_queueautoptr = Ptr[GQueue]
object GtkStatusbar_queueautoptr: 
  given _tag: Tag[GtkStatusbar_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkStatusbar_queueautoptr = o
  extension (v: GtkStatusbar_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkStatusbar_slistautoptr = Ptr[GSList]
object GtkStatusbar_slistautoptr: 
  given _tag: Tag[GtkStatusbar_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkStatusbar_slistautoptr = o
  extension (v: GtkStatusbar_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkStringFilterClass_autoptr = Ptr[GtkStringFilterClass]
object GtkStringFilterClass_autoptr: 
  given _tag: Tag[GtkStringFilterClass_autoptr] = Tag.Ptr[GtkStringFilterClass](GtkStringFilterClass._tag)
  inline def apply(inline o: Ptr[GtkStringFilterClass]): GtkStringFilterClass_autoptr = o
  extension (v: GtkStringFilterClass_autoptr)
    inline def value: Ptr[GtkStringFilterClass] = v

opaque type GtkStringFilterClass_listautoptr = Ptr[GList]
object GtkStringFilterClass_listautoptr: 
  given _tag: Tag[GtkStringFilterClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkStringFilterClass_listautoptr = o
  extension (v: GtkStringFilterClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkStringFilterClass_queueautoptr = Ptr[GQueue]
object GtkStringFilterClass_queueautoptr: 
  given _tag: Tag[GtkStringFilterClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkStringFilterClass_queueautoptr = o
  extension (v: GtkStringFilterClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkStringFilterClass_slistautoptr = Ptr[GSList]
object GtkStringFilterClass_slistautoptr: 
  given _tag: Tag[GtkStringFilterClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkStringFilterClass_slistautoptr = o
  extension (v: GtkStringFilterClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkStringFilter_autoptr = Ptr[GtkStringFilter]
object GtkStringFilter_autoptr: 
  given _tag: Tag[GtkStringFilter_autoptr] = Tag.Ptr[GtkStringFilter](GtkStringFilter._tag)
  inline def apply(inline o: Ptr[GtkStringFilter]): GtkStringFilter_autoptr = o
  extension (v: GtkStringFilter_autoptr)
    inline def value: Ptr[GtkStringFilter] = v

opaque type GtkStringFilter_listautoptr = Ptr[GList]
object GtkStringFilter_listautoptr: 
  given _tag: Tag[GtkStringFilter_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkStringFilter_listautoptr = o
  extension (v: GtkStringFilter_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkStringFilter_queueautoptr = Ptr[GQueue]
object GtkStringFilter_queueautoptr: 
  given _tag: Tag[GtkStringFilter_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkStringFilter_queueautoptr = o
  extension (v: GtkStringFilter_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkStringFilter_slistautoptr = Ptr[GSList]
object GtkStringFilter_slistautoptr: 
  given _tag: Tag[GtkStringFilter_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkStringFilter_slistautoptr = o
  extension (v: GtkStringFilter_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkStringListClass_autoptr = Ptr[GtkStringListClass]
object GtkStringListClass_autoptr: 
  given _tag: Tag[GtkStringListClass_autoptr] = Tag.Ptr[GtkStringListClass](GtkStringListClass._tag)
  inline def apply(inline o: Ptr[GtkStringListClass]): GtkStringListClass_autoptr = o
  extension (v: GtkStringListClass_autoptr)
    inline def value: Ptr[GtkStringListClass] = v

opaque type GtkStringListClass_listautoptr = Ptr[GList]
object GtkStringListClass_listautoptr: 
  given _tag: Tag[GtkStringListClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkStringListClass_listautoptr = o
  extension (v: GtkStringListClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkStringListClass_queueautoptr = Ptr[GQueue]
object GtkStringListClass_queueautoptr: 
  given _tag: Tag[GtkStringListClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkStringListClass_queueautoptr = o
  extension (v: GtkStringListClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkStringListClass_slistautoptr = Ptr[GSList]
object GtkStringListClass_slistautoptr: 
  given _tag: Tag[GtkStringListClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkStringListClass_slistautoptr = o
  extension (v: GtkStringListClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkStringList_autoptr = Ptr[GtkStringList]
object GtkStringList_autoptr: 
  given _tag: Tag[GtkStringList_autoptr] = Tag.Ptr[GtkStringList](GtkStringList._tag)
  inline def apply(inline o: Ptr[GtkStringList]): GtkStringList_autoptr = o
  extension (v: GtkStringList_autoptr)
    inline def value: Ptr[GtkStringList] = v

opaque type GtkStringList_listautoptr = Ptr[GList]
object GtkStringList_listautoptr: 
  given _tag: Tag[GtkStringList_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkStringList_listautoptr = o
  extension (v: GtkStringList_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkStringList_queueautoptr = Ptr[GQueue]
object GtkStringList_queueautoptr: 
  given _tag: Tag[GtkStringList_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkStringList_queueautoptr = o
  extension (v: GtkStringList_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkStringList_slistautoptr = Ptr[GSList]
object GtkStringList_slistautoptr: 
  given _tag: Tag[GtkStringList_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkStringList_slistautoptr = o
  extension (v: GtkStringList_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkStringObjectClass_autoptr = Ptr[GtkStringObjectClass]
object GtkStringObjectClass_autoptr: 
  given _tag: Tag[GtkStringObjectClass_autoptr] = Tag.Ptr[GtkStringObjectClass](GtkStringObjectClass._tag)
  inline def apply(inline o: Ptr[GtkStringObjectClass]): GtkStringObjectClass_autoptr = o
  extension (v: GtkStringObjectClass_autoptr)
    inline def value: Ptr[GtkStringObjectClass] = v

opaque type GtkStringObjectClass_listautoptr = Ptr[GList]
object GtkStringObjectClass_listautoptr: 
  given _tag: Tag[GtkStringObjectClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkStringObjectClass_listautoptr = o
  extension (v: GtkStringObjectClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkStringObjectClass_queueautoptr = Ptr[GQueue]
object GtkStringObjectClass_queueautoptr: 
  given _tag: Tag[GtkStringObjectClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkStringObjectClass_queueautoptr = o
  extension (v: GtkStringObjectClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkStringObjectClass_slistautoptr = Ptr[GSList]
object GtkStringObjectClass_slistautoptr: 
  given _tag: Tag[GtkStringObjectClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkStringObjectClass_slistautoptr = o
  extension (v: GtkStringObjectClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkStringObject_autoptr = Ptr[GtkStringObject]
object GtkStringObject_autoptr: 
  given _tag: Tag[GtkStringObject_autoptr] = Tag.Ptr[GtkStringObject](GtkStringObject._tag)
  inline def apply(inline o: Ptr[GtkStringObject]): GtkStringObject_autoptr = o
  extension (v: GtkStringObject_autoptr)
    inline def value: Ptr[GtkStringObject] = v

opaque type GtkStringObject_listautoptr = Ptr[GList]
object GtkStringObject_listautoptr: 
  given _tag: Tag[GtkStringObject_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkStringObject_listautoptr = o
  extension (v: GtkStringObject_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkStringObject_queueautoptr = Ptr[GQueue]
object GtkStringObject_queueautoptr: 
  given _tag: Tag[GtkStringObject_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkStringObject_queueautoptr = o
  extension (v: GtkStringObject_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkStringObject_slistautoptr = Ptr[GSList]
object GtkStringObject_slistautoptr: 
  given _tag: Tag[GtkStringObject_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkStringObject_slistautoptr = o
  extension (v: GtkStringObject_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkStringSorterClass_autoptr = Ptr[GtkStringSorterClass]
object GtkStringSorterClass_autoptr: 
  given _tag: Tag[GtkStringSorterClass_autoptr] = Tag.Ptr[GtkStringSorterClass](GtkStringSorterClass._tag)
  inline def apply(inline o: Ptr[GtkStringSorterClass]): GtkStringSorterClass_autoptr = o
  extension (v: GtkStringSorterClass_autoptr)
    inline def value: Ptr[GtkStringSorterClass] = v

opaque type GtkStringSorterClass_listautoptr = Ptr[GList]
object GtkStringSorterClass_listautoptr: 
  given _tag: Tag[GtkStringSorterClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkStringSorterClass_listautoptr = o
  extension (v: GtkStringSorterClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkStringSorterClass_queueautoptr = Ptr[GQueue]
object GtkStringSorterClass_queueautoptr: 
  given _tag: Tag[GtkStringSorterClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkStringSorterClass_queueautoptr = o
  extension (v: GtkStringSorterClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkStringSorterClass_slistautoptr = Ptr[GSList]
object GtkStringSorterClass_slistautoptr: 
  given _tag: Tag[GtkStringSorterClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkStringSorterClass_slistautoptr = o
  extension (v: GtkStringSorterClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkStringSorter_autoptr = Ptr[GtkStringSorter]
object GtkStringSorter_autoptr: 
  given _tag: Tag[GtkStringSorter_autoptr] = Tag.Ptr[GtkStringSorter](GtkStringSorter._tag)
  inline def apply(inline o: Ptr[GtkStringSorter]): GtkStringSorter_autoptr = o
  extension (v: GtkStringSorter_autoptr)
    inline def value: Ptr[GtkStringSorter] = v

opaque type GtkStringSorter_listautoptr = Ptr[GList]
object GtkStringSorter_listautoptr: 
  given _tag: Tag[GtkStringSorter_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkStringSorter_listautoptr = o
  extension (v: GtkStringSorter_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkStringSorter_queueautoptr = Ptr[GQueue]
object GtkStringSorter_queueautoptr: 
  given _tag: Tag[GtkStringSorter_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkStringSorter_queueautoptr = o
  extension (v: GtkStringSorter_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkStringSorter_slistautoptr = Ptr[GSList]
object GtkStringSorter_slistautoptr: 
  given _tag: Tag[GtkStringSorter_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkStringSorter_slistautoptr = o
  extension (v: GtkStringSorter_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkStyleContext_autoptr = Ptr[GtkStyleContext]
object GtkStyleContext_autoptr: 
  given _tag: Tag[GtkStyleContext_autoptr] = Tag.Ptr[GtkStyleContext](GtkStyleContext._tag)
  inline def apply(inline o: Ptr[GtkStyleContext]): GtkStyleContext_autoptr = o
  extension (v: GtkStyleContext_autoptr)
    inline def value: Ptr[GtkStyleContext] = v

opaque type GtkStyleContext_listautoptr = Ptr[GList]
object GtkStyleContext_listautoptr: 
  given _tag: Tag[GtkStyleContext_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkStyleContext_listautoptr = o
  extension (v: GtkStyleContext_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkStyleContext_queueautoptr = Ptr[GQueue]
object GtkStyleContext_queueautoptr: 
  given _tag: Tag[GtkStyleContext_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkStyleContext_queueautoptr = o
  extension (v: GtkStyleContext_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkStyleContext_slistautoptr = Ptr[GSList]
object GtkStyleContext_slistautoptr: 
  given _tag: Tag[GtkStyleContext_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkStyleContext_slistautoptr = o
  extension (v: GtkStyleContext_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkStyleProvider_autoptr = Ptr[GtkStyleProvider]
object GtkStyleProvider_autoptr: 
  given _tag: Tag[GtkStyleProvider_autoptr] = Tag.Ptr[GtkStyleProvider](GtkStyleProvider._tag)
  inline def apply(inline o: Ptr[GtkStyleProvider]): GtkStyleProvider_autoptr = o
  extension (v: GtkStyleProvider_autoptr)
    inline def value: Ptr[GtkStyleProvider] = v

opaque type GtkStyleProvider_listautoptr = Ptr[GList]
object GtkStyleProvider_listautoptr: 
  given _tag: Tag[GtkStyleProvider_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkStyleProvider_listautoptr = o
  extension (v: GtkStyleProvider_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkStyleProvider_queueautoptr = Ptr[GQueue]
object GtkStyleProvider_queueautoptr: 
  given _tag: Tag[GtkStyleProvider_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkStyleProvider_queueautoptr = o
  extension (v: GtkStyleProvider_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkStyleProvider_slistautoptr = Ptr[GSList]
object GtkStyleProvider_slistautoptr: 
  given _tag: Tag[GtkStyleProvider_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkStyleProvider_slistautoptr = o
  extension (v: GtkStyleProvider_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkSwitch_autoptr = Ptr[GtkSwitch]
object GtkSwitch_autoptr: 
  given _tag: Tag[GtkSwitch_autoptr] = Tag.Ptr[GtkSwitch](GtkSwitch._tag)
  inline def apply(inline o: Ptr[GtkSwitch]): GtkSwitch_autoptr = o
  extension (v: GtkSwitch_autoptr)
    inline def value: Ptr[GtkSwitch] = v

opaque type GtkSwitch_listautoptr = Ptr[GList]
object GtkSwitch_listautoptr: 
  given _tag: Tag[GtkSwitch_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkSwitch_listautoptr = o
  extension (v: GtkSwitch_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkSwitch_queueautoptr = Ptr[GQueue]
object GtkSwitch_queueautoptr: 
  given _tag: Tag[GtkSwitch_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkSwitch_queueautoptr = o
  extension (v: GtkSwitch_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkSwitch_slistautoptr = Ptr[GSList]
object GtkSwitch_slistautoptr: 
  given _tag: Tag[GtkSwitch_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkSwitch_slistautoptr = o
  extension (v: GtkSwitch_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkSymbolicPaintable_autoptr = Ptr[GtkSymbolicPaintable]
object GtkSymbolicPaintable_autoptr: 
  given _tag: Tag[GtkSymbolicPaintable_autoptr] = Tag.Ptr[GtkSymbolicPaintable](GtkSymbolicPaintable._tag)
  inline def apply(inline o: Ptr[GtkSymbolicPaintable]): GtkSymbolicPaintable_autoptr = o
  extension (v: GtkSymbolicPaintable_autoptr)
    inline def value: Ptr[GtkSymbolicPaintable] = v

opaque type GtkSymbolicPaintable_listautoptr = Ptr[GList]
object GtkSymbolicPaintable_listautoptr: 
  given _tag: Tag[GtkSymbolicPaintable_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkSymbolicPaintable_listautoptr = o
  extension (v: GtkSymbolicPaintable_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkSymbolicPaintable_queueautoptr = Ptr[GQueue]
object GtkSymbolicPaintable_queueautoptr: 
  given _tag: Tag[GtkSymbolicPaintable_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkSymbolicPaintable_queueautoptr = o
  extension (v: GtkSymbolicPaintable_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkSymbolicPaintable_slistautoptr = Ptr[GSList]
object GtkSymbolicPaintable_slistautoptr: 
  given _tag: Tag[GtkSymbolicPaintable_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkSymbolicPaintable_slistautoptr = o
  extension (v: GtkSymbolicPaintable_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkTextBuffer_autoptr = Ptr[GtkTextBuffer]
object GtkTextBuffer_autoptr: 
  given _tag: Tag[GtkTextBuffer_autoptr] = Tag.Ptr[GtkTextBuffer](GtkTextBuffer._tag)
  inline def apply(inline o: Ptr[GtkTextBuffer]): GtkTextBuffer_autoptr = o
  extension (v: GtkTextBuffer_autoptr)
    inline def value: Ptr[GtkTextBuffer] = v

opaque type GtkTextBuffer_listautoptr = Ptr[GList]
object GtkTextBuffer_listautoptr: 
  given _tag: Tag[GtkTextBuffer_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkTextBuffer_listautoptr = o
  extension (v: GtkTextBuffer_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkTextBuffer_queueautoptr = Ptr[GQueue]
object GtkTextBuffer_queueautoptr: 
  given _tag: Tag[GtkTextBuffer_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkTextBuffer_queueautoptr = o
  extension (v: GtkTextBuffer_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkTextBuffer_slistautoptr = Ptr[GSList]
object GtkTextBuffer_slistautoptr: 
  given _tag: Tag[GtkTextBuffer_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkTextBuffer_slistautoptr = o
  extension (v: GtkTextBuffer_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkTextCharPredicate = CFuncPtr2[gunichar, gpointer, gboolean]
object GtkTextCharPredicate: 
  given _tag: Tag[GtkTextCharPredicate] = Tag.materializeCFuncPtr2[gunichar, gpointer, gboolean]
  inline def apply(inline o: CFuncPtr2[gunichar, gpointer, gboolean]): GtkTextCharPredicate = o
  extension (v: GtkTextCharPredicate)
    inline def value: CFuncPtr2[gunichar, gpointer, gboolean] = v

opaque type GtkTextChildAnchor_autoptr = Ptr[GtkTextChildAnchor]
object GtkTextChildAnchor_autoptr: 
  given _tag: Tag[GtkTextChildAnchor_autoptr] = Tag.Ptr[GtkTextChildAnchor](GtkTextChildAnchor._tag)
  inline def apply(inline o: Ptr[GtkTextChildAnchor]): GtkTextChildAnchor_autoptr = o
  extension (v: GtkTextChildAnchor_autoptr)
    inline def value: Ptr[GtkTextChildAnchor] = v

opaque type GtkTextChildAnchor_listautoptr = Ptr[GList]
object GtkTextChildAnchor_listautoptr: 
  given _tag: Tag[GtkTextChildAnchor_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkTextChildAnchor_listautoptr = o
  extension (v: GtkTextChildAnchor_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkTextChildAnchor_queueautoptr = Ptr[GQueue]
object GtkTextChildAnchor_queueautoptr: 
  given _tag: Tag[GtkTextChildAnchor_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkTextChildAnchor_queueautoptr = o
  extension (v: GtkTextChildAnchor_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkTextChildAnchor_slistautoptr = Ptr[GSList]
object GtkTextChildAnchor_slistautoptr: 
  given _tag: Tag[GtkTextChildAnchor_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkTextChildAnchor_slistautoptr = o
  extension (v: GtkTextChildAnchor_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkTextIter_autoptr = Ptr[GtkTextIter]
object GtkTextIter_autoptr: 
  given _tag: Tag[GtkTextIter_autoptr] = Tag.Ptr[GtkTextIter](GtkTextIter._tag)
  inline def apply(inline o: Ptr[GtkTextIter]): GtkTextIter_autoptr = o
  extension (v: GtkTextIter_autoptr)
    inline def value: Ptr[GtkTextIter] = v

opaque type GtkTextIter_listautoptr = Ptr[GList]
object GtkTextIter_listautoptr: 
  given _tag: Tag[GtkTextIter_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkTextIter_listautoptr = o
  extension (v: GtkTextIter_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkTextIter_queueautoptr = Ptr[GQueue]
object GtkTextIter_queueautoptr: 
  given _tag: Tag[GtkTextIter_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkTextIter_queueautoptr = o
  extension (v: GtkTextIter_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkTextIter_slistautoptr = Ptr[GSList]
object GtkTextIter_slistautoptr: 
  given _tag: Tag[GtkTextIter_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkTextIter_slistautoptr = o
  extension (v: GtkTextIter_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkTextMark_autoptr = Ptr[GtkTextMark]
object GtkTextMark_autoptr: 
  given _tag: Tag[GtkTextMark_autoptr] = Tag.Ptr[GtkTextMark](GtkTextMark._tag)
  inline def apply(inline o: Ptr[GtkTextMark]): GtkTextMark_autoptr = o
  extension (v: GtkTextMark_autoptr)
    inline def value: Ptr[GtkTextMark] = v

opaque type GtkTextMark_listautoptr = Ptr[GList]
object GtkTextMark_listautoptr: 
  given _tag: Tag[GtkTextMark_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkTextMark_listautoptr = o
  extension (v: GtkTextMark_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkTextMark_queueautoptr = Ptr[GQueue]
object GtkTextMark_queueautoptr: 
  given _tag: Tag[GtkTextMark_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkTextMark_queueautoptr = o
  extension (v: GtkTextMark_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkTextMark_slistautoptr = Ptr[GSList]
object GtkTextMark_slistautoptr: 
  given _tag: Tag[GtkTextMark_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkTextMark_slistautoptr = o
  extension (v: GtkTextMark_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkTextTagTableForeach = CFuncPtr2[Ptr[GtkTextTag], gpointer, Unit]
object GtkTextTagTableForeach: 
  given _tag: Tag[GtkTextTagTableForeach] = Tag.materializeCFuncPtr2[Ptr[GtkTextTag], gpointer, Unit]
  inline def apply(inline o: CFuncPtr2[Ptr[GtkTextTag], gpointer, Unit]): GtkTextTagTableForeach = o
  extension (v: GtkTextTagTableForeach)
    inline def value: CFuncPtr2[Ptr[GtkTextTag], gpointer, Unit] = v

opaque type GtkTextTagTable_autoptr = Ptr[GtkTextTagTable]
object GtkTextTagTable_autoptr: 
  given _tag: Tag[GtkTextTagTable_autoptr] = Tag.Ptr[GtkTextTagTable](GtkTextTagTable._tag)
  inline def apply(inline o: Ptr[GtkTextTagTable]): GtkTextTagTable_autoptr = o
  extension (v: GtkTextTagTable_autoptr)
    inline def value: Ptr[GtkTextTagTable] = v

opaque type GtkTextTagTable_listautoptr = Ptr[GList]
object GtkTextTagTable_listautoptr: 
  given _tag: Tag[GtkTextTagTable_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkTextTagTable_listautoptr = o
  extension (v: GtkTextTagTable_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkTextTagTable_queueautoptr = Ptr[GQueue]
object GtkTextTagTable_queueautoptr: 
  given _tag: Tag[GtkTextTagTable_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkTextTagTable_queueautoptr = o
  extension (v: GtkTextTagTable_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkTextTagTable_slistautoptr = Ptr[GSList]
object GtkTextTagTable_slistautoptr: 
  given _tag: Tag[GtkTextTagTable_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkTextTagTable_slistautoptr = o
  extension (v: GtkTextTagTable_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkTextTag_autoptr = Ptr[GtkTextTag]
object GtkTextTag_autoptr: 
  given _tag: Tag[GtkTextTag_autoptr] = Tag.Ptr[GtkTextTag](GtkTextTag._tag)
  inline def apply(inline o: Ptr[GtkTextTag]): GtkTextTag_autoptr = o
  extension (v: GtkTextTag_autoptr)
    inline def value: Ptr[GtkTextTag] = v

opaque type GtkTextTag_listautoptr = Ptr[GList]
object GtkTextTag_listautoptr: 
  given _tag: Tag[GtkTextTag_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkTextTag_listautoptr = o
  extension (v: GtkTextTag_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkTextTag_queueautoptr = Ptr[GQueue]
object GtkTextTag_queueautoptr: 
  given _tag: Tag[GtkTextTag_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkTextTag_queueautoptr = o
  extension (v: GtkTextTag_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkTextTag_slistautoptr = Ptr[GSList]
object GtkTextTag_slistautoptr: 
  given _tag: Tag[GtkTextTag_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkTextTag_slistautoptr = o
  extension (v: GtkTextTag_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkTextView_autoptr = Ptr[GtkTextView]
object GtkTextView_autoptr: 
  given _tag: Tag[GtkTextView_autoptr] = Tag.Ptr[GtkTextView](GtkTextView._tag)
  inline def apply(inline o: Ptr[GtkTextView]): GtkTextView_autoptr = o
  extension (v: GtkTextView_autoptr)
    inline def value: Ptr[GtkTextView] = v

opaque type GtkTextView_listautoptr = Ptr[GList]
object GtkTextView_listautoptr: 
  given _tag: Tag[GtkTextView_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkTextView_listautoptr = o
  extension (v: GtkTextView_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkTextView_queueautoptr = Ptr[GQueue]
object GtkTextView_queueautoptr: 
  given _tag: Tag[GtkTextView_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkTextView_queueautoptr = o
  extension (v: GtkTextView_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkTextView_slistautoptr = Ptr[GSList]
object GtkTextView_slistautoptr: 
  given _tag: Tag[GtkTextView_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkTextView_slistautoptr = o
  extension (v: GtkTextView_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkTickCallback = CFuncPtr3[Ptr[GtkWidget], Ptr[GdkFrameClock], gpointer, gboolean]
object GtkTickCallback: 
  given _tag: Tag[GtkTickCallback] = Tag.materializeCFuncPtr3[Ptr[GtkWidget], Ptr[GdkFrameClock], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr3[Ptr[GtkWidget], Ptr[GdkFrameClock], gpointer, gboolean]): GtkTickCallback = o
  extension (v: GtkTickCallback)
    inline def value: CFuncPtr3[Ptr[GtkWidget], Ptr[GdkFrameClock], gpointer, gboolean] = v

opaque type GtkToggleButton_autoptr = Ptr[GtkToggleButton]
object GtkToggleButton_autoptr: 
  given _tag: Tag[GtkToggleButton_autoptr] = Tag.Ptr[GtkToggleButton](GtkToggleButton._tag)
  inline def apply(inline o: Ptr[GtkToggleButton]): GtkToggleButton_autoptr = o
  extension (v: GtkToggleButton_autoptr)
    inline def value: Ptr[GtkToggleButton] = v

opaque type GtkToggleButton_listautoptr = Ptr[GList]
object GtkToggleButton_listautoptr: 
  given _tag: Tag[GtkToggleButton_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkToggleButton_listautoptr = o
  extension (v: GtkToggleButton_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkToggleButton_queueautoptr = Ptr[GQueue]
object GtkToggleButton_queueautoptr: 
  given _tag: Tag[GtkToggleButton_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkToggleButton_queueautoptr = o
  extension (v: GtkToggleButton_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkToggleButton_slistautoptr = Ptr[GSList]
object GtkToggleButton_slistautoptr: 
  given _tag: Tag[GtkToggleButton_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkToggleButton_slistautoptr = o
  extension (v: GtkToggleButton_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkTooltip_autoptr = Ptr[GtkTooltip]
object GtkTooltip_autoptr: 
  given _tag: Tag[GtkTooltip_autoptr] = Tag.Ptr[GtkTooltip](GtkTooltip._tag)
  inline def apply(inline o: Ptr[GtkTooltip]): GtkTooltip_autoptr = o
  extension (v: GtkTooltip_autoptr)
    inline def value: Ptr[GtkTooltip] = v

opaque type GtkTooltip_listautoptr = Ptr[GList]
object GtkTooltip_listautoptr: 
  given _tag: Tag[GtkTooltip_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkTooltip_listautoptr = o
  extension (v: GtkTooltip_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkTooltip_queueautoptr = Ptr[GQueue]
object GtkTooltip_queueautoptr: 
  given _tag: Tag[GtkTooltip_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkTooltip_queueautoptr = o
  extension (v: GtkTooltip_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkTooltip_slistautoptr = Ptr[GSList]
object GtkTooltip_slistautoptr: 
  given _tag: Tag[GtkTooltip_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkTooltip_slistautoptr = o
  extension (v: GtkTooltip_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkTreeCellDataFunc = CFuncPtr5[Ptr[GtkTreeViewColumn], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], gpointer, Unit]
object GtkTreeCellDataFunc: 
  given _tag: Tag[GtkTreeCellDataFunc] = Tag.materializeCFuncPtr5[Ptr[GtkTreeViewColumn], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], gpointer, Unit]
  inline def apply(inline o: CFuncPtr5[Ptr[GtkTreeViewColumn], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], gpointer, Unit]): GtkTreeCellDataFunc = o
  extension (v: GtkTreeCellDataFunc)
    inline def value: CFuncPtr5[Ptr[GtkTreeViewColumn], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], gpointer, Unit] = v

opaque type GtkTreeDragDest_autoptr = Ptr[GtkTreeDragDest]
object GtkTreeDragDest_autoptr: 
  given _tag: Tag[GtkTreeDragDest_autoptr] = Tag.Ptr[GtkTreeDragDest](GtkTreeDragDest._tag)
  inline def apply(inline o: Ptr[GtkTreeDragDest]): GtkTreeDragDest_autoptr = o
  extension (v: GtkTreeDragDest_autoptr)
    inline def value: Ptr[GtkTreeDragDest] = v

opaque type GtkTreeDragDest_listautoptr = Ptr[GList]
object GtkTreeDragDest_listautoptr: 
  given _tag: Tag[GtkTreeDragDest_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkTreeDragDest_listautoptr = o
  extension (v: GtkTreeDragDest_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkTreeDragDest_queueautoptr = Ptr[GQueue]
object GtkTreeDragDest_queueautoptr: 
  given _tag: Tag[GtkTreeDragDest_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkTreeDragDest_queueautoptr = o
  extension (v: GtkTreeDragDest_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkTreeDragDest_slistautoptr = Ptr[GSList]
object GtkTreeDragDest_slistautoptr: 
  given _tag: Tag[GtkTreeDragDest_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkTreeDragDest_slistautoptr = o
  extension (v: GtkTreeDragDest_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkTreeDragSource_autoptr = Ptr[GtkTreeDragSource]
object GtkTreeDragSource_autoptr: 
  given _tag: Tag[GtkTreeDragSource_autoptr] = Tag.Ptr[GtkTreeDragSource](GtkTreeDragSource._tag)
  inline def apply(inline o: Ptr[GtkTreeDragSource]): GtkTreeDragSource_autoptr = o
  extension (v: GtkTreeDragSource_autoptr)
    inline def value: Ptr[GtkTreeDragSource] = v

opaque type GtkTreeDragSource_listautoptr = Ptr[GList]
object GtkTreeDragSource_listautoptr: 
  given _tag: Tag[GtkTreeDragSource_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkTreeDragSource_listautoptr = o
  extension (v: GtkTreeDragSource_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkTreeDragSource_queueautoptr = Ptr[GQueue]
object GtkTreeDragSource_queueautoptr: 
  given _tag: Tag[GtkTreeDragSource_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkTreeDragSource_queueautoptr = o
  extension (v: GtkTreeDragSource_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkTreeDragSource_slistautoptr = Ptr[GSList]
object GtkTreeDragSource_slistautoptr: 
  given _tag: Tag[GtkTreeDragSource_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkTreeDragSource_slistautoptr = o
  extension (v: GtkTreeDragSource_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkTreeExpanderClass_autoptr = Ptr[GtkTreeExpanderClass]
object GtkTreeExpanderClass_autoptr: 
  given _tag: Tag[GtkTreeExpanderClass_autoptr] = Tag.Ptr[GtkTreeExpanderClass](GtkTreeExpanderClass._tag)
  inline def apply(inline o: Ptr[GtkTreeExpanderClass]): GtkTreeExpanderClass_autoptr = o
  extension (v: GtkTreeExpanderClass_autoptr)
    inline def value: Ptr[GtkTreeExpanderClass] = v

opaque type GtkTreeExpanderClass_listautoptr = Ptr[GList]
object GtkTreeExpanderClass_listautoptr: 
  given _tag: Tag[GtkTreeExpanderClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkTreeExpanderClass_listautoptr = o
  extension (v: GtkTreeExpanderClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkTreeExpanderClass_queueautoptr = Ptr[GQueue]
object GtkTreeExpanderClass_queueautoptr: 
  given _tag: Tag[GtkTreeExpanderClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkTreeExpanderClass_queueautoptr = o
  extension (v: GtkTreeExpanderClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkTreeExpanderClass_slistautoptr = Ptr[GSList]
object GtkTreeExpanderClass_slistautoptr: 
  given _tag: Tag[GtkTreeExpanderClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkTreeExpanderClass_slistautoptr = o
  extension (v: GtkTreeExpanderClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkTreeExpander_autoptr = Ptr[GtkTreeExpander]
object GtkTreeExpander_autoptr: 
  given _tag: Tag[GtkTreeExpander_autoptr] = Tag.Ptr[GtkTreeExpander](GtkTreeExpander._tag)
  inline def apply(inline o: Ptr[GtkTreeExpander]): GtkTreeExpander_autoptr = o
  extension (v: GtkTreeExpander_autoptr)
    inline def value: Ptr[GtkTreeExpander] = v

opaque type GtkTreeExpander_listautoptr = Ptr[GList]
object GtkTreeExpander_listautoptr: 
  given _tag: Tag[GtkTreeExpander_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkTreeExpander_listautoptr = o
  extension (v: GtkTreeExpander_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkTreeExpander_queueautoptr = Ptr[GQueue]
object GtkTreeExpander_queueautoptr: 
  given _tag: Tag[GtkTreeExpander_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkTreeExpander_queueautoptr = o
  extension (v: GtkTreeExpander_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkTreeExpander_slistautoptr = Ptr[GSList]
object GtkTreeExpander_slistautoptr: 
  given _tag: Tag[GtkTreeExpander_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkTreeExpander_slistautoptr = o
  extension (v: GtkTreeExpander_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkTreeIterCompareFunc = CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], gpointer, CInt]
object GtkTreeIterCompareFunc: 
  given _tag: Tag[GtkTreeIterCompareFunc] = Tag.materializeCFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], gpointer, CInt]
  inline def apply(inline o: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], gpointer, CInt]): GtkTreeIterCompareFunc = o
  extension (v: GtkTreeIterCompareFunc)
    inline def value: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], gpointer, CInt] = v

opaque type GtkTreeIter_autoptr = Ptr[GtkTreeIter]
object GtkTreeIter_autoptr: 
  given _tag: Tag[GtkTreeIter_autoptr] = Tag.Ptr[GtkTreeIter](GtkTreeIter._tag)
  inline def apply(inline o: Ptr[GtkTreeIter]): GtkTreeIter_autoptr = o
  extension (v: GtkTreeIter_autoptr)
    inline def value: Ptr[GtkTreeIter] = v

opaque type GtkTreeIter_listautoptr = Ptr[GList]
object GtkTreeIter_listautoptr: 
  given _tag: Tag[GtkTreeIter_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkTreeIter_listautoptr = o
  extension (v: GtkTreeIter_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkTreeIter_queueautoptr = Ptr[GQueue]
object GtkTreeIter_queueautoptr: 
  given _tag: Tag[GtkTreeIter_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkTreeIter_queueautoptr = o
  extension (v: GtkTreeIter_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkTreeIter_slistautoptr = Ptr[GSList]
object GtkTreeIter_slistautoptr: 
  given _tag: Tag[GtkTreeIter_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkTreeIter_slistautoptr = o
  extension (v: GtkTreeIter_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkTreeListModelClass_autoptr = Ptr[GtkTreeListModelClass]
object GtkTreeListModelClass_autoptr: 
  given _tag: Tag[GtkTreeListModelClass_autoptr] = Tag.Ptr[GtkTreeListModelClass](GtkTreeListModelClass._tag)
  inline def apply(inline o: Ptr[GtkTreeListModelClass]): GtkTreeListModelClass_autoptr = o
  extension (v: GtkTreeListModelClass_autoptr)
    inline def value: Ptr[GtkTreeListModelClass] = v

opaque type GtkTreeListModelClass_listautoptr = Ptr[GList]
object GtkTreeListModelClass_listautoptr: 
  given _tag: Tag[GtkTreeListModelClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkTreeListModelClass_listautoptr = o
  extension (v: GtkTreeListModelClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkTreeListModelClass_queueautoptr = Ptr[GQueue]
object GtkTreeListModelClass_queueautoptr: 
  given _tag: Tag[GtkTreeListModelClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkTreeListModelClass_queueautoptr = o
  extension (v: GtkTreeListModelClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkTreeListModelClass_slistautoptr = Ptr[GSList]
object GtkTreeListModelClass_slistautoptr: 
  given _tag: Tag[GtkTreeListModelClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkTreeListModelClass_slistautoptr = o
  extension (v: GtkTreeListModelClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkTreeListModelCreateModelFunc = CFuncPtr2[gpointer, gpointer, Ptr[GListModel]]
object GtkTreeListModelCreateModelFunc: 
  given _tag: Tag[GtkTreeListModelCreateModelFunc] = Tag.materializeCFuncPtr2[gpointer, gpointer, Ptr[GListModel]]
  inline def apply(inline o: CFuncPtr2[gpointer, gpointer, Ptr[GListModel]]): GtkTreeListModelCreateModelFunc = o
  extension (v: GtkTreeListModelCreateModelFunc)
    inline def value: CFuncPtr2[gpointer, gpointer, Ptr[GListModel]] = v

opaque type GtkTreeListModel_autoptr = Ptr[GtkTreeListModel]
object GtkTreeListModel_autoptr: 
  given _tag: Tag[GtkTreeListModel_autoptr] = Tag.Ptr[GtkTreeListModel](GtkTreeListModel._tag)
  inline def apply(inline o: Ptr[GtkTreeListModel]): GtkTreeListModel_autoptr = o
  extension (v: GtkTreeListModel_autoptr)
    inline def value: Ptr[GtkTreeListModel] = v

opaque type GtkTreeListModel_listautoptr = Ptr[GList]
object GtkTreeListModel_listautoptr: 
  given _tag: Tag[GtkTreeListModel_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkTreeListModel_listautoptr = o
  extension (v: GtkTreeListModel_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkTreeListModel_queueautoptr = Ptr[GQueue]
object GtkTreeListModel_queueautoptr: 
  given _tag: Tag[GtkTreeListModel_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkTreeListModel_queueautoptr = o
  extension (v: GtkTreeListModel_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkTreeListModel_slistautoptr = Ptr[GSList]
object GtkTreeListModel_slistautoptr: 
  given _tag: Tag[GtkTreeListModel_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkTreeListModel_slistautoptr = o
  extension (v: GtkTreeListModel_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkTreeListRowClass_autoptr = Ptr[GtkTreeListRowClass]
object GtkTreeListRowClass_autoptr: 
  given _tag: Tag[GtkTreeListRowClass_autoptr] = Tag.Ptr[GtkTreeListRowClass](GtkTreeListRowClass._tag)
  inline def apply(inline o: Ptr[GtkTreeListRowClass]): GtkTreeListRowClass_autoptr = o
  extension (v: GtkTreeListRowClass_autoptr)
    inline def value: Ptr[GtkTreeListRowClass] = v

opaque type GtkTreeListRowClass_listautoptr = Ptr[GList]
object GtkTreeListRowClass_listautoptr: 
  given _tag: Tag[GtkTreeListRowClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkTreeListRowClass_listautoptr = o
  extension (v: GtkTreeListRowClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkTreeListRowClass_queueautoptr = Ptr[GQueue]
object GtkTreeListRowClass_queueautoptr: 
  given _tag: Tag[GtkTreeListRowClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkTreeListRowClass_queueautoptr = o
  extension (v: GtkTreeListRowClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkTreeListRowClass_slistautoptr = Ptr[GSList]
object GtkTreeListRowClass_slistautoptr: 
  given _tag: Tag[GtkTreeListRowClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkTreeListRowClass_slistautoptr = o
  extension (v: GtkTreeListRowClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkTreeListRowSorterClass_autoptr = Ptr[GtkTreeListRowSorterClass]
object GtkTreeListRowSorterClass_autoptr: 
  given _tag: Tag[GtkTreeListRowSorterClass_autoptr] = Tag.Ptr[GtkTreeListRowSorterClass](GtkTreeListRowSorterClass._tag)
  inline def apply(inline o: Ptr[GtkTreeListRowSorterClass]): GtkTreeListRowSorterClass_autoptr = o
  extension (v: GtkTreeListRowSorterClass_autoptr)
    inline def value: Ptr[GtkTreeListRowSorterClass] = v

opaque type GtkTreeListRowSorterClass_listautoptr = Ptr[GList]
object GtkTreeListRowSorterClass_listautoptr: 
  given _tag: Tag[GtkTreeListRowSorterClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkTreeListRowSorterClass_listautoptr = o
  extension (v: GtkTreeListRowSorterClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkTreeListRowSorterClass_queueautoptr = Ptr[GQueue]
object GtkTreeListRowSorterClass_queueautoptr: 
  given _tag: Tag[GtkTreeListRowSorterClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkTreeListRowSorterClass_queueautoptr = o
  extension (v: GtkTreeListRowSorterClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkTreeListRowSorterClass_slistautoptr = Ptr[GSList]
object GtkTreeListRowSorterClass_slistautoptr: 
  given _tag: Tag[GtkTreeListRowSorterClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkTreeListRowSorterClass_slistautoptr = o
  extension (v: GtkTreeListRowSorterClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkTreeListRowSorter_autoptr = Ptr[GtkTreeListRowSorter]
object GtkTreeListRowSorter_autoptr: 
  given _tag: Tag[GtkTreeListRowSorter_autoptr] = Tag.Ptr[GtkTreeListRowSorter](GtkTreeListRowSorter._tag)
  inline def apply(inline o: Ptr[GtkTreeListRowSorter]): GtkTreeListRowSorter_autoptr = o
  extension (v: GtkTreeListRowSorter_autoptr)
    inline def value: Ptr[GtkTreeListRowSorter] = v

opaque type GtkTreeListRowSorter_listautoptr = Ptr[GList]
object GtkTreeListRowSorter_listautoptr: 
  given _tag: Tag[GtkTreeListRowSorter_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkTreeListRowSorter_listautoptr = o
  extension (v: GtkTreeListRowSorter_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkTreeListRowSorter_queueautoptr = Ptr[GQueue]
object GtkTreeListRowSorter_queueautoptr: 
  given _tag: Tag[GtkTreeListRowSorter_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkTreeListRowSorter_queueautoptr = o
  extension (v: GtkTreeListRowSorter_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkTreeListRowSorter_slistautoptr = Ptr[GSList]
object GtkTreeListRowSorter_slistautoptr: 
  given _tag: Tag[GtkTreeListRowSorter_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkTreeListRowSorter_slistautoptr = o
  extension (v: GtkTreeListRowSorter_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkTreeListRow_autoptr = Ptr[GtkTreeListRow]
object GtkTreeListRow_autoptr: 
  given _tag: Tag[GtkTreeListRow_autoptr] = Tag.Ptr[GtkTreeListRow](GtkTreeListRow._tag)
  inline def apply(inline o: Ptr[GtkTreeListRow]): GtkTreeListRow_autoptr = o
  extension (v: GtkTreeListRow_autoptr)
    inline def value: Ptr[GtkTreeListRow] = v

opaque type GtkTreeListRow_listautoptr = Ptr[GList]
object GtkTreeListRow_listautoptr: 
  given _tag: Tag[GtkTreeListRow_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkTreeListRow_listautoptr = o
  extension (v: GtkTreeListRow_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkTreeListRow_queueautoptr = Ptr[GQueue]
object GtkTreeListRow_queueautoptr: 
  given _tag: Tag[GtkTreeListRow_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkTreeListRow_queueautoptr = o
  extension (v: GtkTreeListRow_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkTreeListRow_slistautoptr = Ptr[GSList]
object GtkTreeListRow_slistautoptr: 
  given _tag: Tag[GtkTreeListRow_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkTreeListRow_slistautoptr = o
  extension (v: GtkTreeListRow_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkTreeModelFilterModifyFunc = CFuncPtr5[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GValue], CInt, gpointer, Unit]
object GtkTreeModelFilterModifyFunc: 
  given _tag: Tag[GtkTreeModelFilterModifyFunc] = Tag.materializeCFuncPtr5[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GValue], CInt, gpointer, Unit]
  inline def apply(inline o: CFuncPtr5[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GValue], CInt, gpointer, Unit]): GtkTreeModelFilterModifyFunc = o
  extension (v: GtkTreeModelFilterModifyFunc)
    inline def value: CFuncPtr5[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GValue], CInt, gpointer, Unit] = v

opaque type GtkTreeModelFilterVisibleFunc = CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], gpointer, gboolean]
object GtkTreeModelFilterVisibleFunc: 
  given _tag: Tag[GtkTreeModelFilterVisibleFunc] = Tag.materializeCFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], gpointer, gboolean]): GtkTreeModelFilterVisibleFunc = o
  extension (v: GtkTreeModelFilterVisibleFunc)
    inline def value: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], gpointer, gboolean] = v

opaque type GtkTreeModelFilter_autoptr = Ptr[GtkTreeModelFilter]
object GtkTreeModelFilter_autoptr: 
  given _tag: Tag[GtkTreeModelFilter_autoptr] = Tag.Ptr[GtkTreeModelFilter](GtkTreeModelFilter._tag)
  inline def apply(inline o: Ptr[GtkTreeModelFilter]): GtkTreeModelFilter_autoptr = o
  extension (v: GtkTreeModelFilter_autoptr)
    inline def value: Ptr[GtkTreeModelFilter] = v

opaque type GtkTreeModelFilter_listautoptr = Ptr[GList]
object GtkTreeModelFilter_listautoptr: 
  given _tag: Tag[GtkTreeModelFilter_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkTreeModelFilter_listautoptr = o
  extension (v: GtkTreeModelFilter_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkTreeModelFilter_queueautoptr = Ptr[GQueue]
object GtkTreeModelFilter_queueautoptr: 
  given _tag: Tag[GtkTreeModelFilter_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkTreeModelFilter_queueautoptr = o
  extension (v: GtkTreeModelFilter_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkTreeModelFilter_slistautoptr = Ptr[GSList]
object GtkTreeModelFilter_slistautoptr: 
  given _tag: Tag[GtkTreeModelFilter_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkTreeModelFilter_slistautoptr = o
  extension (v: GtkTreeModelFilter_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkTreeModelForeachFunc = CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], gpointer, gboolean]
object GtkTreeModelForeachFunc: 
  given _tag: Tag[GtkTreeModelForeachFunc] = Tag.materializeCFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], gpointer, gboolean]): GtkTreeModelForeachFunc = o
  extension (v: GtkTreeModelForeachFunc)
    inline def value: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], gpointer, gboolean] = v

opaque type GtkTreeModelSort_autoptr = Ptr[GtkTreeModelSort]
object GtkTreeModelSort_autoptr: 
  given _tag: Tag[GtkTreeModelSort_autoptr] = Tag.Ptr[GtkTreeModelSort](GtkTreeModelSort._tag)
  inline def apply(inline o: Ptr[GtkTreeModelSort]): GtkTreeModelSort_autoptr = o
  extension (v: GtkTreeModelSort_autoptr)
    inline def value: Ptr[GtkTreeModelSort] = v

opaque type GtkTreeModelSort_listautoptr = Ptr[GList]
object GtkTreeModelSort_listautoptr: 
  given _tag: Tag[GtkTreeModelSort_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkTreeModelSort_listautoptr = o
  extension (v: GtkTreeModelSort_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkTreeModelSort_queueautoptr = Ptr[GQueue]
object GtkTreeModelSort_queueautoptr: 
  given _tag: Tag[GtkTreeModelSort_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkTreeModelSort_queueautoptr = o
  extension (v: GtkTreeModelSort_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkTreeModelSort_slistautoptr = Ptr[GSList]
object GtkTreeModelSort_slistautoptr: 
  given _tag: Tag[GtkTreeModelSort_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkTreeModelSort_slistautoptr = o
  extension (v: GtkTreeModelSort_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkTreeModel_autoptr = Ptr[GtkTreeModel]
object GtkTreeModel_autoptr: 
  given _tag: Tag[GtkTreeModel_autoptr] = Tag.Ptr[GtkTreeModel](GtkTreeModel._tag)
  inline def apply(inline o: Ptr[GtkTreeModel]): GtkTreeModel_autoptr = o
  extension (v: GtkTreeModel_autoptr)
    inline def value: Ptr[GtkTreeModel] = v

opaque type GtkTreeModel_listautoptr = Ptr[GList]
object GtkTreeModel_listautoptr: 
  given _tag: Tag[GtkTreeModel_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkTreeModel_listautoptr = o
  extension (v: GtkTreeModel_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkTreeModel_queueautoptr = Ptr[GQueue]
object GtkTreeModel_queueautoptr: 
  given _tag: Tag[GtkTreeModel_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkTreeModel_queueautoptr = o
  extension (v: GtkTreeModel_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkTreeModel_slistautoptr = Ptr[GSList]
object GtkTreeModel_slistautoptr: 
  given _tag: Tag[GtkTreeModel_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkTreeModel_slistautoptr = o
  extension (v: GtkTreeModel_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkTreePath_autoptr = Ptr[GtkTreePath]
object GtkTreePath_autoptr: 
  given _tag: Tag[GtkTreePath_autoptr] = Tag.Ptr[GtkTreePath](GtkTreePath._tag)
  inline def apply(inline o: Ptr[GtkTreePath]): GtkTreePath_autoptr = o
  extension (v: GtkTreePath_autoptr)
    inline def value: Ptr[GtkTreePath] = v

opaque type GtkTreePath_listautoptr = Ptr[GList]
object GtkTreePath_listautoptr: 
  given _tag: Tag[GtkTreePath_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkTreePath_listautoptr = o
  extension (v: GtkTreePath_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkTreePath_queueautoptr = Ptr[GQueue]
object GtkTreePath_queueautoptr: 
  given _tag: Tag[GtkTreePath_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkTreePath_queueautoptr = o
  extension (v: GtkTreePath_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkTreePath_slistautoptr = Ptr[GSList]
object GtkTreePath_slistautoptr: 
  given _tag: Tag[GtkTreePath_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkTreePath_slistautoptr = o
  extension (v: GtkTreePath_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkTreeRowReference_autoptr = Ptr[GtkTreeRowReference]
object GtkTreeRowReference_autoptr: 
  given _tag: Tag[GtkTreeRowReference_autoptr] = Tag.Ptr[GtkTreeRowReference](GtkTreeRowReference._tag)
  inline def apply(inline o: Ptr[GtkTreeRowReference]): GtkTreeRowReference_autoptr = o
  extension (v: GtkTreeRowReference_autoptr)
    inline def value: Ptr[GtkTreeRowReference] = v

opaque type GtkTreeRowReference_listautoptr = Ptr[GList]
object GtkTreeRowReference_listautoptr: 
  given _tag: Tag[GtkTreeRowReference_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkTreeRowReference_listautoptr = o
  extension (v: GtkTreeRowReference_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkTreeRowReference_queueautoptr = Ptr[GQueue]
object GtkTreeRowReference_queueautoptr: 
  given _tag: Tag[GtkTreeRowReference_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkTreeRowReference_queueautoptr = o
  extension (v: GtkTreeRowReference_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkTreeRowReference_slistautoptr = Ptr[GSList]
object GtkTreeRowReference_slistautoptr: 
  given _tag: Tag[GtkTreeRowReference_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkTreeRowReference_slistautoptr = o
  extension (v: GtkTreeRowReference_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkTreeSelectionForeachFunc = CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], gpointer, Unit]
object GtkTreeSelectionForeachFunc: 
  given _tag: Tag[GtkTreeSelectionForeachFunc] = Tag.materializeCFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], gpointer, Unit]
  inline def apply(inline o: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], gpointer, Unit]): GtkTreeSelectionForeachFunc = o
  extension (v: GtkTreeSelectionForeachFunc)
    inline def value: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], gpointer, Unit] = v

opaque type GtkTreeSelectionFunc = CFuncPtr5[Ptr[GtkTreeSelection], Ptr[GtkTreeModel], Ptr[GtkTreePath], gboolean, gpointer, gboolean]
object GtkTreeSelectionFunc: 
  given _tag: Tag[GtkTreeSelectionFunc] = Tag.materializeCFuncPtr5[Ptr[GtkTreeSelection], Ptr[GtkTreeModel], Ptr[GtkTreePath], gboolean, gpointer, gboolean]
  inline def apply(inline o: CFuncPtr5[Ptr[GtkTreeSelection], Ptr[GtkTreeModel], Ptr[GtkTreePath], gboolean, gpointer, gboolean]): GtkTreeSelectionFunc = o
  extension (v: GtkTreeSelectionFunc)
    inline def value: CFuncPtr5[Ptr[GtkTreeSelection], Ptr[GtkTreeModel], Ptr[GtkTreePath], gboolean, gpointer, gboolean] = v

opaque type GtkTreeSelection_autoptr = Ptr[GtkTreeSelection]
object GtkTreeSelection_autoptr: 
  given _tag: Tag[GtkTreeSelection_autoptr] = Tag.Ptr[GtkTreeSelection](GtkTreeSelection._tag)
  inline def apply(inline o: Ptr[GtkTreeSelection]): GtkTreeSelection_autoptr = o
  extension (v: GtkTreeSelection_autoptr)
    inline def value: Ptr[GtkTreeSelection] = v

opaque type GtkTreeSelection_listautoptr = Ptr[GList]
object GtkTreeSelection_listautoptr: 
  given _tag: Tag[GtkTreeSelection_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkTreeSelection_listautoptr = o
  extension (v: GtkTreeSelection_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkTreeSelection_queueautoptr = Ptr[GQueue]
object GtkTreeSelection_queueautoptr: 
  given _tag: Tag[GtkTreeSelection_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkTreeSelection_queueautoptr = o
  extension (v: GtkTreeSelection_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkTreeSelection_slistautoptr = Ptr[GSList]
object GtkTreeSelection_slistautoptr: 
  given _tag: Tag[GtkTreeSelection_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkTreeSelection_slistautoptr = o
  extension (v: GtkTreeSelection_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkTreeSortable_autoptr = Ptr[GtkTreeSortable]
object GtkTreeSortable_autoptr: 
  given _tag: Tag[GtkTreeSortable_autoptr] = Tag.Ptr[GtkTreeSortable](GtkTreeSortable._tag)
  inline def apply(inline o: Ptr[GtkTreeSortable]): GtkTreeSortable_autoptr = o
  extension (v: GtkTreeSortable_autoptr)
    inline def value: Ptr[GtkTreeSortable] = v

opaque type GtkTreeSortable_listautoptr = Ptr[GList]
object GtkTreeSortable_listautoptr: 
  given _tag: Tag[GtkTreeSortable_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkTreeSortable_listautoptr = o
  extension (v: GtkTreeSortable_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkTreeSortable_queueautoptr = Ptr[GQueue]
object GtkTreeSortable_queueautoptr: 
  given _tag: Tag[GtkTreeSortable_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkTreeSortable_queueautoptr = o
  extension (v: GtkTreeSortable_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkTreeSortable_slistautoptr = Ptr[GSList]
object GtkTreeSortable_slistautoptr: 
  given _tag: Tag[GtkTreeSortable_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkTreeSortable_slistautoptr = o
  extension (v: GtkTreeSortable_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkTreeStore_autoptr = Ptr[GtkTreeStore]
object GtkTreeStore_autoptr: 
  given _tag: Tag[GtkTreeStore_autoptr] = Tag.Ptr[GtkTreeStore](GtkTreeStore._tag)
  inline def apply(inline o: Ptr[GtkTreeStore]): GtkTreeStore_autoptr = o
  extension (v: GtkTreeStore_autoptr)
    inline def value: Ptr[GtkTreeStore] = v

opaque type GtkTreeStore_listautoptr = Ptr[GList]
object GtkTreeStore_listautoptr: 
  given _tag: Tag[GtkTreeStore_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkTreeStore_listautoptr = o
  extension (v: GtkTreeStore_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkTreeStore_queueautoptr = Ptr[GQueue]
object GtkTreeStore_queueautoptr: 
  given _tag: Tag[GtkTreeStore_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkTreeStore_queueautoptr = o
  extension (v: GtkTreeStore_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkTreeStore_slistautoptr = Ptr[GSList]
object GtkTreeStore_slistautoptr: 
  given _tag: Tag[GtkTreeStore_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkTreeStore_slistautoptr = o
  extension (v: GtkTreeStore_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkTreeViewColumnDropFunc = CFuncPtr5[Ptr[GtkTreeView], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], gpointer, gboolean]
object GtkTreeViewColumnDropFunc: 
  given _tag: Tag[GtkTreeViewColumnDropFunc] = Tag.materializeCFuncPtr5[Ptr[GtkTreeView], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr5[Ptr[GtkTreeView], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], gpointer, gboolean]): GtkTreeViewColumnDropFunc = o
  extension (v: GtkTreeViewColumnDropFunc)
    inline def value: CFuncPtr5[Ptr[GtkTreeView], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], gpointer, gboolean] = v

opaque type GtkTreeViewColumn_autoptr = Ptr[GtkTreeViewColumn]
object GtkTreeViewColumn_autoptr: 
  given _tag: Tag[GtkTreeViewColumn_autoptr] = Tag.Ptr[GtkTreeViewColumn](GtkTreeViewColumn._tag)
  inline def apply(inline o: Ptr[GtkTreeViewColumn]): GtkTreeViewColumn_autoptr = o
  extension (v: GtkTreeViewColumn_autoptr)
    inline def value: Ptr[GtkTreeViewColumn] = v

opaque type GtkTreeViewColumn_listautoptr = Ptr[GList]
object GtkTreeViewColumn_listautoptr: 
  given _tag: Tag[GtkTreeViewColumn_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkTreeViewColumn_listautoptr = o
  extension (v: GtkTreeViewColumn_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkTreeViewColumn_queueautoptr = Ptr[GQueue]
object GtkTreeViewColumn_queueautoptr: 
  given _tag: Tag[GtkTreeViewColumn_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkTreeViewColumn_queueautoptr = o
  extension (v: GtkTreeViewColumn_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkTreeViewColumn_slistautoptr = Ptr[GSList]
object GtkTreeViewColumn_slistautoptr: 
  given _tag: Tag[GtkTreeViewColumn_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkTreeViewColumn_slistautoptr = o
  extension (v: GtkTreeViewColumn_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkTreeViewMappingFunc = CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], gpointer, Unit]
object GtkTreeViewMappingFunc: 
  given _tag: Tag[GtkTreeViewMappingFunc] = Tag.materializeCFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], gpointer, Unit]
  inline def apply(inline o: CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], gpointer, Unit]): GtkTreeViewMappingFunc = o
  extension (v: GtkTreeViewMappingFunc)
    inline def value: CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], gpointer, Unit] = v

opaque type GtkTreeViewRowSeparatorFunc = CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], gpointer, gboolean]
object GtkTreeViewRowSeparatorFunc: 
  given _tag: Tag[GtkTreeViewRowSeparatorFunc] = Tag.materializeCFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], gpointer, gboolean]): GtkTreeViewRowSeparatorFunc = o
  extension (v: GtkTreeViewRowSeparatorFunc)
    inline def value: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], gpointer, gboolean] = v

opaque type GtkTreeViewSearchEqualFunc = CFuncPtr5[Ptr[GtkTreeModel], CInt, CString, Ptr[GtkTreeIter], gpointer, gboolean]
object GtkTreeViewSearchEqualFunc: 
  given _tag: Tag[GtkTreeViewSearchEqualFunc] = Tag.materializeCFuncPtr5[Ptr[GtkTreeModel], CInt, CString, Ptr[GtkTreeIter], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr5[Ptr[GtkTreeModel], CInt, CString, Ptr[GtkTreeIter], gpointer, gboolean]): GtkTreeViewSearchEqualFunc = o
  extension (v: GtkTreeViewSearchEqualFunc)
    inline def value: CFuncPtr5[Ptr[GtkTreeModel], CInt, CString, Ptr[GtkTreeIter], gpointer, gboolean] = v

opaque type GtkTreeView_autoptr = Ptr[GtkTreeView]
object GtkTreeView_autoptr: 
  given _tag: Tag[GtkTreeView_autoptr] = Tag.Ptr[GtkTreeView](GtkTreeView._tag)
  inline def apply(inline o: Ptr[GtkTreeView]): GtkTreeView_autoptr = o
  extension (v: GtkTreeView_autoptr)
    inline def value: Ptr[GtkTreeView] = v

opaque type GtkTreeView_listautoptr = Ptr[GList]
object GtkTreeView_listautoptr: 
  given _tag: Tag[GtkTreeView_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkTreeView_listautoptr = o
  extension (v: GtkTreeView_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkTreeView_queueautoptr = Ptr[GQueue]
object GtkTreeView_queueautoptr: 
  given _tag: Tag[GtkTreeView_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkTreeView_queueautoptr = o
  extension (v: GtkTreeView_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkTreeView_slistautoptr = Ptr[GSList]
object GtkTreeView_slistautoptr: 
  given _tag: Tag[GtkTreeView_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkTreeView_slistautoptr = o
  extension (v: GtkTreeView_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkVideoClass_autoptr = Ptr[GtkVideoClass]
object GtkVideoClass_autoptr: 
  given _tag: Tag[GtkVideoClass_autoptr] = Tag.Ptr[GtkVideoClass](GtkVideoClass._tag)
  inline def apply(inline o: Ptr[GtkVideoClass]): GtkVideoClass_autoptr = o
  extension (v: GtkVideoClass_autoptr)
    inline def value: Ptr[GtkVideoClass] = v

opaque type GtkVideoClass_listautoptr = Ptr[GList]
object GtkVideoClass_listautoptr: 
  given _tag: Tag[GtkVideoClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkVideoClass_listautoptr = o
  extension (v: GtkVideoClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkVideoClass_queueautoptr = Ptr[GQueue]
object GtkVideoClass_queueautoptr: 
  given _tag: Tag[GtkVideoClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkVideoClass_queueautoptr = o
  extension (v: GtkVideoClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkVideoClass_slistautoptr = Ptr[GSList]
object GtkVideoClass_slistautoptr: 
  given _tag: Tag[GtkVideoClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkVideoClass_slistautoptr = o
  extension (v: GtkVideoClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkVideo_autoptr = Ptr[GtkVideo]
object GtkVideo_autoptr: 
  given _tag: Tag[GtkVideo_autoptr] = Tag.Ptr[GtkVideo](GtkVideo._tag)
  inline def apply(inline o: Ptr[GtkVideo]): GtkVideo_autoptr = o
  extension (v: GtkVideo_autoptr)
    inline def value: Ptr[GtkVideo] = v

opaque type GtkVideo_listautoptr = Ptr[GList]
object GtkVideo_listautoptr: 
  given _tag: Tag[GtkVideo_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkVideo_listautoptr = o
  extension (v: GtkVideo_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkVideo_queueautoptr = Ptr[GQueue]
object GtkVideo_queueautoptr: 
  given _tag: Tag[GtkVideo_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkVideo_queueautoptr = o
  extension (v: GtkVideo_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkVideo_slistautoptr = Ptr[GSList]
object GtkVideo_slistautoptr: 
  given _tag: Tag[GtkVideo_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkVideo_slistautoptr = o
  extension (v: GtkVideo_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkViewport_autoptr = Ptr[GtkViewport]
object GtkViewport_autoptr: 
  given _tag: Tag[GtkViewport_autoptr] = Tag.Ptr[GtkViewport](GtkViewport._tag)
  inline def apply(inline o: Ptr[GtkViewport]): GtkViewport_autoptr = o
  extension (v: GtkViewport_autoptr)
    inline def value: Ptr[GtkViewport] = v

opaque type GtkViewport_listautoptr = Ptr[GList]
object GtkViewport_listautoptr: 
  given _tag: Tag[GtkViewport_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkViewport_listautoptr = o
  extension (v: GtkViewport_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkViewport_queueautoptr = Ptr[GQueue]
object GtkViewport_queueautoptr: 
  given _tag: Tag[GtkViewport_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkViewport_queueautoptr = o
  extension (v: GtkViewport_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkViewport_slistautoptr = Ptr[GSList]
object GtkViewport_slistautoptr: 
  given _tag: Tag[GtkViewport_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkViewport_slistautoptr = o
  extension (v: GtkViewport_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkVolumeButton_autoptr = Ptr[GtkVolumeButton]
object GtkVolumeButton_autoptr: 
  given _tag: Tag[GtkVolumeButton_autoptr] = Tag.Ptr[GtkVolumeButton](GtkVolumeButton._tag)
  inline def apply(inline o: Ptr[GtkVolumeButton]): GtkVolumeButton_autoptr = o
  extension (v: GtkVolumeButton_autoptr)
    inline def value: Ptr[GtkVolumeButton] = v

opaque type GtkVolumeButton_listautoptr = Ptr[GList]
object GtkVolumeButton_listautoptr: 
  given _tag: Tag[GtkVolumeButton_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkVolumeButton_listautoptr = o
  extension (v: GtkVolumeButton_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkVolumeButton_queueautoptr = Ptr[GQueue]
object GtkVolumeButton_queueautoptr: 
  given _tag: Tag[GtkVolumeButton_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkVolumeButton_queueautoptr = o
  extension (v: GtkVolumeButton_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkVolumeButton_slistautoptr = Ptr[GSList]
object GtkVolumeButton_slistautoptr: 
  given _tag: Tag[GtkVolumeButton_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkVolumeButton_slistautoptr = o
  extension (v: GtkVolumeButton_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkWidgetActionActivateFunc = CFuncPtr3[Ptr[GtkWidget], CString, Ptr[GVariant], Unit]
object GtkWidgetActionActivateFunc: 
  given _tag: Tag[GtkWidgetActionActivateFunc] = Tag.materializeCFuncPtr3[Ptr[GtkWidget], CString, Ptr[GVariant], Unit]
  inline def apply(inline o: CFuncPtr3[Ptr[GtkWidget], CString, Ptr[GVariant], Unit]): GtkWidgetActionActivateFunc = o
  extension (v: GtkWidgetActionActivateFunc)
    inline def value: CFuncPtr3[Ptr[GtkWidget], CString, Ptr[GVariant], Unit] = v

opaque type GtkWidgetPaintableClass_autoptr = Ptr[GtkWidgetPaintableClass]
object GtkWidgetPaintableClass_autoptr: 
  given _tag: Tag[GtkWidgetPaintableClass_autoptr] = Tag.Ptr[GtkWidgetPaintableClass](GtkWidgetPaintableClass._tag)
  inline def apply(inline o: Ptr[GtkWidgetPaintableClass]): GtkWidgetPaintableClass_autoptr = o
  extension (v: GtkWidgetPaintableClass_autoptr)
    inline def value: Ptr[GtkWidgetPaintableClass] = v

opaque type GtkWidgetPaintableClass_listautoptr = Ptr[GList]
object GtkWidgetPaintableClass_listautoptr: 
  given _tag: Tag[GtkWidgetPaintableClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkWidgetPaintableClass_listautoptr = o
  extension (v: GtkWidgetPaintableClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkWidgetPaintableClass_queueautoptr = Ptr[GQueue]
object GtkWidgetPaintableClass_queueautoptr: 
  given _tag: Tag[GtkWidgetPaintableClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkWidgetPaintableClass_queueautoptr = o
  extension (v: GtkWidgetPaintableClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkWidgetPaintableClass_slistautoptr = Ptr[GSList]
object GtkWidgetPaintableClass_slistautoptr: 
  given _tag: Tag[GtkWidgetPaintableClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkWidgetPaintableClass_slistautoptr = o
  extension (v: GtkWidgetPaintableClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkWidgetPaintable_autoptr = Ptr[GtkWidgetPaintable]
object GtkWidgetPaintable_autoptr: 
  given _tag: Tag[GtkWidgetPaintable_autoptr] = Tag.Ptr[GtkWidgetPaintable](GtkWidgetPaintable._tag)
  inline def apply(inline o: Ptr[GtkWidgetPaintable]): GtkWidgetPaintable_autoptr = o
  extension (v: GtkWidgetPaintable_autoptr)
    inline def value: Ptr[GtkWidgetPaintable] = v

opaque type GtkWidgetPaintable_listautoptr = Ptr[GList]
object GtkWidgetPaintable_listautoptr: 
  given _tag: Tag[GtkWidgetPaintable_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkWidgetPaintable_listautoptr = o
  extension (v: GtkWidgetPaintable_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkWidgetPaintable_queueautoptr = Ptr[GQueue]
object GtkWidgetPaintable_queueautoptr: 
  given _tag: Tag[GtkWidgetPaintable_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkWidgetPaintable_queueautoptr = o
  extension (v: GtkWidgetPaintable_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkWidgetPaintable_slistautoptr = Ptr[GSList]
object GtkWidgetPaintable_slistautoptr: 
  given _tag: Tag[GtkWidgetPaintable_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkWidgetPaintable_slistautoptr = o
  extension (v: GtkWidgetPaintable_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkWidget_autoptr = Ptr[GtkWidget]
object GtkWidget_autoptr: 
  given _tag: Tag[GtkWidget_autoptr] = Tag.Ptr[GtkWidget](GtkWidget._tag)
  inline def apply(inline o: Ptr[GtkWidget]): GtkWidget_autoptr = o
  extension (v: GtkWidget_autoptr)
    inline def value: Ptr[GtkWidget] = v

opaque type GtkWidget_listautoptr = Ptr[GList]
object GtkWidget_listautoptr: 
  given _tag: Tag[GtkWidget_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkWidget_listautoptr = o
  extension (v: GtkWidget_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkWidget_queueautoptr = Ptr[GQueue]
object GtkWidget_queueautoptr: 
  given _tag: Tag[GtkWidget_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkWidget_queueautoptr = o
  extension (v: GtkWidget_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkWidget_slistautoptr = Ptr[GSList]
object GtkWidget_slistautoptr: 
  given _tag: Tag[GtkWidget_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkWidget_slistautoptr = o
  extension (v: GtkWidget_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkWindowControlsClass_autoptr = Ptr[GtkWindowControlsClass]
object GtkWindowControlsClass_autoptr: 
  given _tag: Tag[GtkWindowControlsClass_autoptr] = Tag.Ptr[GtkWindowControlsClass](GtkWindowControlsClass._tag)
  inline def apply(inline o: Ptr[GtkWindowControlsClass]): GtkWindowControlsClass_autoptr = o
  extension (v: GtkWindowControlsClass_autoptr)
    inline def value: Ptr[GtkWindowControlsClass] = v

opaque type GtkWindowControlsClass_listautoptr = Ptr[GList]
object GtkWindowControlsClass_listautoptr: 
  given _tag: Tag[GtkWindowControlsClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkWindowControlsClass_listautoptr = o
  extension (v: GtkWindowControlsClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkWindowControlsClass_queueautoptr = Ptr[GQueue]
object GtkWindowControlsClass_queueautoptr: 
  given _tag: Tag[GtkWindowControlsClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkWindowControlsClass_queueautoptr = o
  extension (v: GtkWindowControlsClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkWindowControlsClass_slistautoptr = Ptr[GSList]
object GtkWindowControlsClass_slistautoptr: 
  given _tag: Tag[GtkWindowControlsClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkWindowControlsClass_slistautoptr = o
  extension (v: GtkWindowControlsClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkWindowControls_autoptr = Ptr[GtkWindowControls]
object GtkWindowControls_autoptr: 
  given _tag: Tag[GtkWindowControls_autoptr] = Tag.Ptr[GtkWindowControls](GtkWindowControls._tag)
  inline def apply(inline o: Ptr[GtkWindowControls]): GtkWindowControls_autoptr = o
  extension (v: GtkWindowControls_autoptr)
    inline def value: Ptr[GtkWindowControls] = v

opaque type GtkWindowControls_listautoptr = Ptr[GList]
object GtkWindowControls_listautoptr: 
  given _tag: Tag[GtkWindowControls_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkWindowControls_listautoptr = o
  extension (v: GtkWindowControls_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkWindowControls_queueautoptr = Ptr[GQueue]
object GtkWindowControls_queueautoptr: 
  given _tag: Tag[GtkWindowControls_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkWindowControls_queueautoptr = o
  extension (v: GtkWindowControls_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkWindowControls_slistautoptr = Ptr[GSList]
object GtkWindowControls_slistautoptr: 
  given _tag: Tag[GtkWindowControls_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkWindowControls_slistautoptr = o
  extension (v: GtkWindowControls_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkWindowGroup_autoptr = Ptr[GtkWindowGroup]
object GtkWindowGroup_autoptr: 
  given _tag: Tag[GtkWindowGroup_autoptr] = Tag.Ptr[GtkWindowGroup](GtkWindowGroup._tag)
  inline def apply(inline o: Ptr[GtkWindowGroup]): GtkWindowGroup_autoptr = o
  extension (v: GtkWindowGroup_autoptr)
    inline def value: Ptr[GtkWindowGroup] = v

opaque type GtkWindowGroup_listautoptr = Ptr[GList]
object GtkWindowGroup_listautoptr: 
  given _tag: Tag[GtkWindowGroup_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkWindowGroup_listautoptr = o
  extension (v: GtkWindowGroup_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkWindowGroup_queueautoptr = Ptr[GQueue]
object GtkWindowGroup_queueautoptr: 
  given _tag: Tag[GtkWindowGroup_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkWindowGroup_queueautoptr = o
  extension (v: GtkWindowGroup_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkWindowGroup_slistautoptr = Ptr[GSList]
object GtkWindowGroup_slistautoptr: 
  given _tag: Tag[GtkWindowGroup_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkWindowGroup_slistautoptr = o
  extension (v: GtkWindowGroup_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkWindowHandleClass_autoptr = Ptr[GtkWindowHandleClass]
object GtkWindowHandleClass_autoptr: 
  given _tag: Tag[GtkWindowHandleClass_autoptr] = Tag.Ptr[GtkWindowHandleClass](GtkWindowHandleClass._tag)
  inline def apply(inline o: Ptr[GtkWindowHandleClass]): GtkWindowHandleClass_autoptr = o
  extension (v: GtkWindowHandleClass_autoptr)
    inline def value: Ptr[GtkWindowHandleClass] = v

opaque type GtkWindowHandleClass_listautoptr = Ptr[GList]
object GtkWindowHandleClass_listautoptr: 
  given _tag: Tag[GtkWindowHandleClass_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkWindowHandleClass_listautoptr = o
  extension (v: GtkWindowHandleClass_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkWindowHandleClass_queueautoptr = Ptr[GQueue]
object GtkWindowHandleClass_queueautoptr: 
  given _tag: Tag[GtkWindowHandleClass_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkWindowHandleClass_queueautoptr = o
  extension (v: GtkWindowHandleClass_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkWindowHandleClass_slistautoptr = Ptr[GSList]
object GtkWindowHandleClass_slistautoptr: 
  given _tag: Tag[GtkWindowHandleClass_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkWindowHandleClass_slistautoptr = o
  extension (v: GtkWindowHandleClass_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkWindowHandle_autoptr = Ptr[GtkWindowHandle]
object GtkWindowHandle_autoptr: 
  given _tag: Tag[GtkWindowHandle_autoptr] = Tag.Ptr[GtkWindowHandle](GtkWindowHandle._tag)
  inline def apply(inline o: Ptr[GtkWindowHandle]): GtkWindowHandle_autoptr = o
  extension (v: GtkWindowHandle_autoptr)
    inline def value: Ptr[GtkWindowHandle] = v

opaque type GtkWindowHandle_listautoptr = Ptr[GList]
object GtkWindowHandle_listautoptr: 
  given _tag: Tag[GtkWindowHandle_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkWindowHandle_listautoptr = o
  extension (v: GtkWindowHandle_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkWindowHandle_queueautoptr = Ptr[GQueue]
object GtkWindowHandle_queueautoptr: 
  given _tag: Tag[GtkWindowHandle_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkWindowHandle_queueautoptr = o
  extension (v: GtkWindowHandle_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkWindowHandle_slistautoptr = Ptr[GSList]
object GtkWindowHandle_slistautoptr: 
  given _tag: Tag[GtkWindowHandle_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkWindowHandle_slistautoptr = o
  extension (v: GtkWindowHandle_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type GtkWindow_autoptr = Ptr[GtkWindow]
object GtkWindow_autoptr: 
  given _tag: Tag[GtkWindow_autoptr] = Tag.Ptr[GtkWindow](GtkWindow._tag)
  inline def apply(inline o: Ptr[GtkWindow]): GtkWindow_autoptr = o
  extension (v: GtkWindow_autoptr)
    inline def value: Ptr[GtkWindow] = v

opaque type GtkWindow_listautoptr = Ptr[GList]
object GtkWindow_listautoptr: 
  given _tag: Tag[GtkWindow_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GtkWindow_listautoptr = o
  extension (v: GtkWindow_listautoptr)
    inline def value: Ptr[GList] = v

opaque type GtkWindow_queueautoptr = Ptr[GQueue]
object GtkWindow_queueautoptr: 
  given _tag: Tag[GtkWindow_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GtkWindow_queueautoptr = o
  extension (v: GtkWindow_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type GtkWindow_slistautoptr = Ptr[GSList]
object GtkWindow_slistautoptr: 
  given _tag: Tag[GtkWindow_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GtkWindow_slistautoptr = o
  extension (v: GtkWindow_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type PangoAttrDataCopyFunc = CFuncPtr1[gconstpointer, gpointer]
object PangoAttrDataCopyFunc: 
  given _tag: Tag[PangoAttrDataCopyFunc] = Tag.materializeCFuncPtr1[gconstpointer, gpointer]
  inline def apply(inline o: CFuncPtr1[gconstpointer, gpointer]): PangoAttrDataCopyFunc = o
  extension (v: PangoAttrDataCopyFunc)
    inline def value: CFuncPtr1[gconstpointer, gpointer] = v

opaque type PangoAttrFilterFunc = CFuncPtr2[Ptr[PangoAttribute], gpointer, gboolean]
object PangoAttrFilterFunc: 
  given _tag: Tag[PangoAttrFilterFunc] = Tag.materializeCFuncPtr2[Ptr[PangoAttribute], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr2[Ptr[PangoAttribute], gpointer, gboolean]): PangoAttrFilterFunc = o
  extension (v: PangoAttrFilterFunc)
    inline def value: CFuncPtr2[Ptr[PangoAttribute], gpointer, gboolean] = v

opaque type PangoAttrIterator_autoptr = Ptr[PangoAttrIterator]
object PangoAttrIterator_autoptr: 
  given _tag: Tag[PangoAttrIterator_autoptr] = Tag.Ptr[PangoAttrIterator](PangoAttrIterator._tag)
  inline def apply(inline o: Ptr[PangoAttrIterator]): PangoAttrIterator_autoptr = o
  extension (v: PangoAttrIterator_autoptr)
    inline def value: Ptr[PangoAttrIterator] = v

opaque type PangoAttrIterator_listautoptr = Ptr[GList]
object PangoAttrIterator_listautoptr: 
  given _tag: Tag[PangoAttrIterator_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): PangoAttrIterator_listautoptr = o
  extension (v: PangoAttrIterator_listautoptr)
    inline def value: Ptr[GList] = v

opaque type PangoAttrIterator_queueautoptr = Ptr[GQueue]
object PangoAttrIterator_queueautoptr: 
  given _tag: Tag[PangoAttrIterator_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): PangoAttrIterator_queueautoptr = o
  extension (v: PangoAttrIterator_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type PangoAttrIterator_slistautoptr = Ptr[GSList]
object PangoAttrIterator_slistautoptr: 
  given _tag: Tag[PangoAttrIterator_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): PangoAttrIterator_slistautoptr = o
  extension (v: PangoAttrIterator_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type PangoAttrList_autoptr = Ptr[PangoAttrList]
object PangoAttrList_autoptr: 
  given _tag: Tag[PangoAttrList_autoptr] = Tag.Ptr[PangoAttrList](PangoAttrList._tag)
  inline def apply(inline o: Ptr[PangoAttrList]): PangoAttrList_autoptr = o
  extension (v: PangoAttrList_autoptr)
    inline def value: Ptr[PangoAttrList] = v

opaque type PangoAttrList_listautoptr = Ptr[GList]
object PangoAttrList_listautoptr: 
  given _tag: Tag[PangoAttrList_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): PangoAttrList_listautoptr = o
  extension (v: PangoAttrList_listautoptr)
    inline def value: Ptr[GList] = v

opaque type PangoAttrList_queueautoptr = Ptr[GQueue]
object PangoAttrList_queueautoptr: 
  given _tag: Tag[PangoAttrList_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): PangoAttrList_queueautoptr = o
  extension (v: PangoAttrList_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type PangoAttrList_slistautoptr = Ptr[GSList]
object PangoAttrList_slistautoptr: 
  given _tag: Tag[PangoAttrList_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): PangoAttrList_slistautoptr = o
  extension (v: PangoAttrList_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type PangoAttribute_autoptr = Ptr[PangoAttribute]
object PangoAttribute_autoptr: 
  given _tag: Tag[PangoAttribute_autoptr] = Tag.Ptr[PangoAttribute](PangoAttribute._tag)
  inline def apply(inline o: Ptr[PangoAttribute]): PangoAttribute_autoptr = o
  extension (v: PangoAttribute_autoptr)
    inline def value: Ptr[PangoAttribute] = v

opaque type PangoAttribute_listautoptr = Ptr[GList]
object PangoAttribute_listautoptr: 
  given _tag: Tag[PangoAttribute_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): PangoAttribute_listautoptr = o
  extension (v: PangoAttribute_listautoptr)
    inline def value: Ptr[GList] = v

opaque type PangoAttribute_queueautoptr = Ptr[GQueue]
object PangoAttribute_queueautoptr: 
  given _tag: Tag[PangoAttribute_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): PangoAttribute_queueautoptr = o
  extension (v: PangoAttribute_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type PangoAttribute_slistautoptr = Ptr[GSList]
object PangoAttribute_slistautoptr: 
  given _tag: Tag[PangoAttribute_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): PangoAttribute_slistautoptr = o
  extension (v: PangoAttribute_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type PangoCairoShapeRendererFunc = CFuncPtr4[Ptr[cairo_t], Ptr[PangoAttrShape], gboolean, gpointer, Unit]
object PangoCairoShapeRendererFunc: 
  given _tag: Tag[PangoCairoShapeRendererFunc] = Tag.materializeCFuncPtr4[Ptr[cairo_t], Ptr[PangoAttrShape], gboolean, gpointer, Unit]
  inline def apply(inline o: CFuncPtr4[Ptr[cairo_t], Ptr[PangoAttrShape], gboolean, gpointer, Unit]): PangoCairoShapeRendererFunc = o
  extension (v: PangoCairoShapeRendererFunc)
    inline def value: CFuncPtr4[Ptr[cairo_t], Ptr[PangoAttrShape], gboolean, gpointer, Unit] = v

opaque type PangoCoverage_autoptr = Ptr[PangoCoverage]
object PangoCoverage_autoptr: 
  given _tag: Tag[PangoCoverage_autoptr] = Tag.Ptr[PangoCoverage](PangoCoverage._tag)
  inline def apply(inline o: Ptr[PangoCoverage]): PangoCoverage_autoptr = o
  extension (v: PangoCoverage_autoptr)
    inline def value: Ptr[PangoCoverage] = v

opaque type PangoCoverage_listautoptr = Ptr[GList]
object PangoCoverage_listautoptr: 
  given _tag: Tag[PangoCoverage_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): PangoCoverage_listautoptr = o
  extension (v: PangoCoverage_listautoptr)
    inline def value: Ptr[GList] = v

opaque type PangoCoverage_queueautoptr = Ptr[GQueue]
object PangoCoverage_queueautoptr: 
  given _tag: Tag[PangoCoverage_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): PangoCoverage_queueautoptr = o
  extension (v: PangoCoverage_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type PangoCoverage_slistautoptr = Ptr[GSList]
object PangoCoverage_slistautoptr: 
  given _tag: Tag[PangoCoverage_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): PangoCoverage_slistautoptr = o
  extension (v: PangoCoverage_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type PangoFontDescription_autoptr = Ptr[PangoFontDescription]
object PangoFontDescription_autoptr: 
  given _tag: Tag[PangoFontDescription_autoptr] = Tag.Ptr[PangoFontDescription](PangoFontDescription._tag)
  inline def apply(inline o: Ptr[PangoFontDescription]): PangoFontDescription_autoptr = o
  extension (v: PangoFontDescription_autoptr)
    inline def value: Ptr[PangoFontDescription] = v

opaque type PangoFontDescription_listautoptr = Ptr[GList]
object PangoFontDescription_listautoptr: 
  given _tag: Tag[PangoFontDescription_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): PangoFontDescription_listautoptr = o
  extension (v: PangoFontDescription_listautoptr)
    inline def value: Ptr[GList] = v

opaque type PangoFontDescription_queueautoptr = Ptr[GQueue]
object PangoFontDescription_queueautoptr: 
  given _tag: Tag[PangoFontDescription_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): PangoFontDescription_queueautoptr = o
  extension (v: PangoFontDescription_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type PangoFontDescription_slistautoptr = Ptr[GSList]
object PangoFontDescription_slistautoptr: 
  given _tag: Tag[PangoFontDescription_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): PangoFontDescription_slistautoptr = o
  extension (v: PangoFontDescription_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type PangoFontFace_autoptr = Ptr[PangoFontFace]
object PangoFontFace_autoptr: 
  given _tag: Tag[PangoFontFace_autoptr] = Tag.Ptr[PangoFontFace](PangoFontFace._tag)
  inline def apply(inline o: Ptr[PangoFontFace]): PangoFontFace_autoptr = o
  extension (v: PangoFontFace_autoptr)
    inline def value: Ptr[PangoFontFace] = v

opaque type PangoFontFace_listautoptr = Ptr[GList]
object PangoFontFace_listautoptr: 
  given _tag: Tag[PangoFontFace_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): PangoFontFace_listautoptr = o
  extension (v: PangoFontFace_listautoptr)
    inline def value: Ptr[GList] = v

opaque type PangoFontFace_queueautoptr = Ptr[GQueue]
object PangoFontFace_queueautoptr: 
  given _tag: Tag[PangoFontFace_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): PangoFontFace_queueautoptr = o
  extension (v: PangoFontFace_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type PangoFontFace_slistautoptr = Ptr[GSList]
object PangoFontFace_slistautoptr: 
  given _tag: Tag[PangoFontFace_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): PangoFontFace_slistautoptr = o
  extension (v: PangoFontFace_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type PangoFontFamily_autoptr = Ptr[PangoFontFamily]
object PangoFontFamily_autoptr: 
  given _tag: Tag[PangoFontFamily_autoptr] = Tag.Ptr[PangoFontFamily](PangoFontFamily._tag)
  inline def apply(inline o: Ptr[PangoFontFamily]): PangoFontFamily_autoptr = o
  extension (v: PangoFontFamily_autoptr)
    inline def value: Ptr[PangoFontFamily] = v

opaque type PangoFontFamily_listautoptr = Ptr[GList]
object PangoFontFamily_listautoptr: 
  given _tag: Tag[PangoFontFamily_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): PangoFontFamily_listautoptr = o
  extension (v: PangoFontFamily_listautoptr)
    inline def value: Ptr[GList] = v

opaque type PangoFontFamily_queueautoptr = Ptr[GQueue]
object PangoFontFamily_queueautoptr: 
  given _tag: Tag[PangoFontFamily_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): PangoFontFamily_queueautoptr = o
  extension (v: PangoFontFamily_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type PangoFontFamily_slistautoptr = Ptr[GSList]
object PangoFontFamily_slistautoptr: 
  given _tag: Tag[PangoFontFamily_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): PangoFontFamily_slistautoptr = o
  extension (v: PangoFontFamily_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type PangoFontMap_autoptr = Ptr[PangoFontMap]
object PangoFontMap_autoptr: 
  given _tag: Tag[PangoFontMap_autoptr] = Tag.Ptr[PangoFontMap](PangoFontMap._tag)
  inline def apply(inline o: Ptr[PangoFontMap]): PangoFontMap_autoptr = o
  extension (v: PangoFontMap_autoptr)
    inline def value: Ptr[PangoFontMap] = v

opaque type PangoFontMap_listautoptr = Ptr[GList]
object PangoFontMap_listautoptr: 
  given _tag: Tag[PangoFontMap_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): PangoFontMap_listautoptr = o
  extension (v: PangoFontMap_listautoptr)
    inline def value: Ptr[GList] = v

opaque type PangoFontMap_queueautoptr = Ptr[GQueue]
object PangoFontMap_queueautoptr: 
  given _tag: Tag[PangoFontMap_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): PangoFontMap_queueautoptr = o
  extension (v: PangoFontMap_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type PangoFontMap_slistautoptr = Ptr[GSList]
object PangoFontMap_slistautoptr: 
  given _tag: Tag[PangoFontMap_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): PangoFontMap_slistautoptr = o
  extension (v: PangoFontMap_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type PangoFont_autoptr = Ptr[PangoFont]
object PangoFont_autoptr: 
  given _tag: Tag[PangoFont_autoptr] = Tag.Ptr[PangoFont](PangoFont._tag)
  inline def apply(inline o: Ptr[PangoFont]): PangoFont_autoptr = o
  extension (v: PangoFont_autoptr)
    inline def value: Ptr[PangoFont] = v

opaque type PangoFont_listautoptr = Ptr[GList]
object PangoFont_listautoptr: 
  given _tag: Tag[PangoFont_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): PangoFont_listautoptr = o
  extension (v: PangoFont_listautoptr)
    inline def value: Ptr[GList] = v

opaque type PangoFont_queueautoptr = Ptr[GQueue]
object PangoFont_queueautoptr: 
  given _tag: Tag[PangoFont_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): PangoFont_queueautoptr = o
  extension (v: PangoFont_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type PangoFont_slistautoptr = Ptr[GSList]
object PangoFont_slistautoptr: 
  given _tag: Tag[PangoFont_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): PangoFont_slistautoptr = o
  extension (v: PangoFont_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type PangoFontsetForeachFunc = CFuncPtr3[Ptr[PangoFontset], Ptr[PangoFont], gpointer, gboolean]
object PangoFontsetForeachFunc: 
  given _tag: Tag[PangoFontsetForeachFunc] = Tag.materializeCFuncPtr3[Ptr[PangoFontset], Ptr[PangoFont], gpointer, gboolean]
  inline def apply(inline o: CFuncPtr3[Ptr[PangoFontset], Ptr[PangoFont], gpointer, gboolean]): PangoFontsetForeachFunc = o
  extension (v: PangoFontsetForeachFunc)
    inline def value: CFuncPtr3[Ptr[PangoFontset], Ptr[PangoFont], gpointer, gboolean] = v

type PangoGlyph = guint32
object PangoGlyph: 
  given _tag: Tag[PangoGlyph] = guint32._tag
  inline def apply(inline o: guint32): PangoGlyph = o
  extension (v: PangoGlyph)
    inline def value: guint32 = v

type PangoGlyphUnit = gint32
object PangoGlyphUnit: 
  given _tag: Tag[PangoGlyphUnit] = gint32._tag
  inline def apply(inline o: gint32): PangoGlyphUnit = o
  extension (v: PangoGlyphUnit)
    inline def value: gint32 = v

opaque type PangoLayoutIter_autoptr = Ptr[PangoLayoutIter]
object PangoLayoutIter_autoptr: 
  given _tag: Tag[PangoLayoutIter_autoptr] = Tag.Ptr[PangoLayoutIter](PangoLayoutIter._tag)
  inline def apply(inline o: Ptr[PangoLayoutIter]): PangoLayoutIter_autoptr = o
  extension (v: PangoLayoutIter_autoptr)
    inline def value: Ptr[PangoLayoutIter] = v

opaque type PangoLayoutIter_listautoptr = Ptr[GList]
object PangoLayoutIter_listautoptr: 
  given _tag: Tag[PangoLayoutIter_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): PangoLayoutIter_listautoptr = o
  extension (v: PangoLayoutIter_listautoptr)
    inline def value: Ptr[GList] = v

opaque type PangoLayoutIter_queueautoptr = Ptr[GQueue]
object PangoLayoutIter_queueautoptr: 
  given _tag: Tag[PangoLayoutIter_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): PangoLayoutIter_queueautoptr = o
  extension (v: PangoLayoutIter_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type PangoLayoutIter_slistautoptr = Ptr[GSList]
object PangoLayoutIter_slistautoptr: 
  given _tag: Tag[PangoLayoutIter_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): PangoLayoutIter_slistautoptr = o
  extension (v: PangoLayoutIter_slistautoptr)
    inline def value: Ptr[GSList] = v

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

opaque type PangoLayout_listautoptr = Ptr[GList]
object PangoLayout_listautoptr: 
  given _tag: Tag[PangoLayout_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): PangoLayout_listautoptr = o
  extension (v: PangoLayout_listautoptr)
    inline def value: Ptr[GList] = v

opaque type PangoLayout_queueautoptr = Ptr[GQueue]
object PangoLayout_queueautoptr: 
  given _tag: Tag[PangoLayout_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): PangoLayout_queueautoptr = o
  extension (v: PangoLayout_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type PangoLayout_slistautoptr = Ptr[GSList]
object PangoLayout_slistautoptr: 
  given _tag: Tag[PangoLayout_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): PangoLayout_slistautoptr = o
  extension (v: PangoLayout_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type PangoTabArray_autoptr = Ptr[PangoTabArray]
object PangoTabArray_autoptr: 
  given _tag: Tag[PangoTabArray_autoptr] = Tag.Ptr[PangoTabArray](PangoTabArray._tag)
  inline def apply(inline o: Ptr[PangoTabArray]): PangoTabArray_autoptr = o
  extension (v: PangoTabArray_autoptr)
    inline def value: Ptr[PangoTabArray] = v

opaque type PangoTabArray_listautoptr = Ptr[GList]
object PangoTabArray_listautoptr: 
  given _tag: Tag[PangoTabArray_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): PangoTabArray_listautoptr = o
  extension (v: PangoTabArray_listautoptr)
    inline def value: Ptr[GList] = v

opaque type PangoTabArray_queueautoptr = Ptr[GQueue]
object PangoTabArray_queueautoptr: 
  given _tag: Tag[PangoTabArray_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): PangoTabArray_queueautoptr = o
  extension (v: PangoTabArray_queueautoptr)
    inline def value: Ptr[GQueue] = v

opaque type PangoTabArray_slistautoptr = Ptr[GSList]
object PangoTabArray_slistautoptr: 
  given _tag: Tag[PangoTabArray_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): PangoTabArray_slistautoptr = o
  extension (v: PangoTabArray_slistautoptr)
    inline def value: Ptr[GSList] = v

opaque type __m128 = CStruct4[Float, Float, Float, Float]
object __m128: 
  given _tag: Tag[__m128] = Tag.materializeCStruct4Tag[Float, Float, Float, Float]
  inline def apply(inline o: CStruct4[Float, Float, Float, Float]): __m128 = o
  extension (v: __m128)
    inline def value: CStruct4[Float, Float, Float, Float] = v

type cairo_antialias_t = _cairo_antialias
object cairo_antialias_t: 
  given _tag: Tag[cairo_antialias_t] = _cairo_antialias._tag
  inline def apply(inline o: _cairo_antialias): cairo_antialias_t = o
  extension (v: cairo_antialias_t)
    inline def value: _cairo_antialias = v

opaque type cairo_bool_t = CInt
object cairo_bool_t: 
  given _tag: Tag[cairo_bool_t] = Tag.Int
  inline def apply(inline o: CInt): cairo_bool_t = o
  extension (v: cairo_bool_t)
    inline def value: CInt = v

type cairo_content_t = _cairo_content
object cairo_content_t: 
  given _tag: Tag[cairo_content_t] = _cairo_content._tag
  inline def apply(inline o: _cairo_content): cairo_content_t = o
  extension (v: cairo_content_t)
    inline def value: _cairo_content = v

opaque type cairo_destroy_func_t = CFuncPtr1[Ptr[Byte], Unit]
object cairo_destroy_func_t: 
  given _tag: Tag[cairo_destroy_func_t] = Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
  inline def apply(inline o: CFuncPtr1[Ptr[Byte], Unit]): cairo_destroy_func_t = o
  extension (v: cairo_destroy_func_t)
    inline def value: CFuncPtr1[Ptr[Byte], Unit] = v

type cairo_device_type_t = _cairo_device_type
object cairo_device_type_t: 
  given _tag: Tag[cairo_device_type_t] = _cairo_device_type._tag
  inline def apply(inline o: _cairo_device_type): cairo_device_type_t = o
  extension (v: cairo_device_type_t)
    inline def value: _cairo_device_type = v

type cairo_extend_t = _cairo_extend
object cairo_extend_t: 
  given _tag: Tag[cairo_extend_t] = _cairo_extend._tag
  inline def apply(inline o: _cairo_extend): cairo_extend_t = o
  extension (v: cairo_extend_t)
    inline def value: _cairo_extend = v

type cairo_fill_rule_t = _cairo_fill_rule
object cairo_fill_rule_t: 
  given _tag: Tag[cairo_fill_rule_t] = _cairo_fill_rule._tag
  inline def apply(inline o: _cairo_fill_rule): cairo_fill_rule_t = o
  extension (v: cairo_fill_rule_t)
    inline def value: _cairo_fill_rule = v

type cairo_filter_t = _cairo_filter
object cairo_filter_t: 
  given _tag: Tag[cairo_filter_t] = _cairo_filter._tag
  inline def apply(inline o: _cairo_filter): cairo_filter_t = o
  extension (v: cairo_filter_t)
    inline def value: _cairo_filter = v

type cairo_font_slant_t = _cairo_font_slant
object cairo_font_slant_t: 
  given _tag: Tag[cairo_font_slant_t] = _cairo_font_slant._tag
  inline def apply(inline o: _cairo_font_slant): cairo_font_slant_t = o
  extension (v: cairo_font_slant_t)
    inline def value: _cairo_font_slant = v

type cairo_font_type_t = _cairo_font_type
object cairo_font_type_t: 
  given _tag: Tag[cairo_font_type_t] = _cairo_font_type._tag
  inline def apply(inline o: _cairo_font_type): cairo_font_type_t = o
  extension (v: cairo_font_type_t)
    inline def value: _cairo_font_type = v

type cairo_font_weight_t = _cairo_font_weight
object cairo_font_weight_t: 
  given _tag: Tag[cairo_font_weight_t] = _cairo_font_weight._tag
  inline def apply(inline o: _cairo_font_weight): cairo_font_weight_t = o
  extension (v: cairo_font_weight_t)
    inline def value: _cairo_font_weight = v

type cairo_format_t = _cairo_format
object cairo_format_t: 
  given _tag: Tag[cairo_format_t] = _cairo_format._tag
  inline def apply(inline o: _cairo_format): cairo_format_t = o
  extension (v: cairo_format_t)
    inline def value: _cairo_format = v

type cairo_hint_metrics_t = _cairo_hint_metrics
object cairo_hint_metrics_t: 
  given _tag: Tag[cairo_hint_metrics_t] = _cairo_hint_metrics._tag
  inline def apply(inline o: _cairo_hint_metrics): cairo_hint_metrics_t = o
  extension (v: cairo_hint_metrics_t)
    inline def value: _cairo_hint_metrics = v

type cairo_hint_style_t = _cairo_hint_style
object cairo_hint_style_t: 
  given _tag: Tag[cairo_hint_style_t] = _cairo_hint_style._tag
  inline def apply(inline o: _cairo_hint_style): cairo_hint_style_t = o
  extension (v: cairo_hint_style_t)
    inline def value: _cairo_hint_style = v

type cairo_line_cap_t = _cairo_line_cap
object cairo_line_cap_t: 
  given _tag: Tag[cairo_line_cap_t] = _cairo_line_cap._tag
  inline def apply(inline o: _cairo_line_cap): cairo_line_cap_t = o
  extension (v: cairo_line_cap_t)
    inline def value: _cairo_line_cap = v

type cairo_line_join_t = _cairo_line_join
object cairo_line_join_t: 
  given _tag: Tag[cairo_line_join_t] = _cairo_line_join._tag
  inline def apply(inline o: _cairo_line_join): cairo_line_join_t = o
  extension (v: cairo_line_join_t)
    inline def value: _cairo_line_join = v

type cairo_operator_t = _cairo_operator
object cairo_operator_t: 
  given _tag: Tag[cairo_operator_t] = _cairo_operator._tag
  inline def apply(inline o: _cairo_operator): cairo_operator_t = o
  extension (v: cairo_operator_t)
    inline def value: _cairo_operator = v

type cairo_path_data_type_t = _cairo_path_data_type
object cairo_path_data_type_t: 
  given _tag: Tag[cairo_path_data_type_t] = _cairo_path_data_type._tag
  inline def apply(inline o: _cairo_path_data_type): cairo_path_data_type_t = o
  extension (v: cairo_path_data_type_t)
    inline def value: _cairo_path_data_type = v

type cairo_pattern_type_t = _cairo_pattern_type
object cairo_pattern_type_t: 
  given _tag: Tag[cairo_pattern_type_t] = _cairo_pattern_type._tag
  inline def apply(inline o: _cairo_pattern_type): cairo_pattern_type_t = o
  extension (v: cairo_pattern_type_t)
    inline def value: _cairo_pattern_type = v

opaque type cairo_raster_source_acquire_func_t = CFuncPtr4[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_surface_t], Ptr[cairo_rectangle_int_t], Ptr[cairo_surface_t]]
object cairo_raster_source_acquire_func_t: 
  given _tag: Tag[cairo_raster_source_acquire_func_t] = Tag.materializeCFuncPtr4[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_surface_t], Ptr[cairo_rectangle_int_t], Ptr[cairo_surface_t]]
  inline def apply(inline o: CFuncPtr4[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_surface_t], Ptr[cairo_rectangle_int_t], Ptr[cairo_surface_t]]): cairo_raster_source_acquire_func_t = o
  extension (v: cairo_raster_source_acquire_func_t)
    inline def value: CFuncPtr4[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_surface_t], Ptr[cairo_rectangle_int_t], Ptr[cairo_surface_t]] = v

opaque type cairo_raster_source_copy_func_t = CFuncPtr3[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_pattern_t], cairo_status_t]
object cairo_raster_source_copy_func_t: 
  given _tag: Tag[cairo_raster_source_copy_func_t] = Tag.materializeCFuncPtr3[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_pattern_t], cairo_status_t]
  inline def apply(inline o: CFuncPtr3[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_pattern_t], cairo_status_t]): cairo_raster_source_copy_func_t = o
  extension (v: cairo_raster_source_copy_func_t)
    inline def value: CFuncPtr3[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_pattern_t], cairo_status_t] = v

opaque type cairo_raster_source_finish_func_t = CFuncPtr2[Ptr[cairo_pattern_t], Ptr[Byte], Unit]
object cairo_raster_source_finish_func_t: 
  given _tag: Tag[cairo_raster_source_finish_func_t] = Tag.materializeCFuncPtr2[Ptr[cairo_pattern_t], Ptr[Byte], Unit]
  inline def apply(inline o: CFuncPtr2[Ptr[cairo_pattern_t], Ptr[Byte], Unit]): cairo_raster_source_finish_func_t = o
  extension (v: cairo_raster_source_finish_func_t)
    inline def value: CFuncPtr2[Ptr[cairo_pattern_t], Ptr[Byte], Unit] = v

opaque type cairo_raster_source_release_func_t = CFuncPtr3[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_surface_t], Unit]
object cairo_raster_source_release_func_t: 
  given _tag: Tag[cairo_raster_source_release_func_t] = Tag.materializeCFuncPtr3[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_surface_t], Unit]
  inline def apply(inline o: CFuncPtr3[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_surface_t], Unit]): cairo_raster_source_release_func_t = o
  extension (v: cairo_raster_source_release_func_t)
    inline def value: CFuncPtr3[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_surface_t], Unit] = v

opaque type cairo_raster_source_snapshot_func_t = CFuncPtr2[Ptr[cairo_pattern_t], Ptr[Byte], cairo_status_t]
object cairo_raster_source_snapshot_func_t: 
  given _tag: Tag[cairo_raster_source_snapshot_func_t] = Tag.materializeCFuncPtr2[Ptr[cairo_pattern_t], Ptr[Byte], cairo_status_t]
  inline def apply(inline o: CFuncPtr2[Ptr[cairo_pattern_t], Ptr[Byte], cairo_status_t]): cairo_raster_source_snapshot_func_t = o
  extension (v: cairo_raster_source_snapshot_func_t)
    inline def value: CFuncPtr2[Ptr[cairo_pattern_t], Ptr[Byte], cairo_status_t] = v

opaque type cairo_read_func_t = CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], CUnsignedInt, cairo_status_t]
object cairo_read_func_t: 
  given _tag: Tag[cairo_read_func_t] = Tag.materializeCFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], CUnsignedInt, cairo_status_t]
  inline def apply(inline o: CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], CUnsignedInt, cairo_status_t]): cairo_read_func_t = o
  extension (v: cairo_read_func_t)
    inline def value: CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], CUnsignedInt, cairo_status_t] = v

type cairo_region_overlap_t = _cairo_region_overlap
object cairo_region_overlap_t: 
  given _tag: Tag[cairo_region_overlap_t] = _cairo_region_overlap._tag
  inline def apply(inline o: _cairo_region_overlap): cairo_region_overlap_t = o
  extension (v: cairo_region_overlap_t)
    inline def value: _cairo_region_overlap = v

type cairo_status_t = _cairo_status
object cairo_status_t: 
  given _tag: Tag[cairo_status_t] = _cairo_status._tag
  inline def apply(inline o: _cairo_status): cairo_status_t = o
  extension (v: cairo_status_t)
    inline def value: _cairo_status = v

type cairo_subpixel_order_t = _cairo_subpixel_order
object cairo_subpixel_order_t: 
  given _tag: Tag[cairo_subpixel_order_t] = _cairo_subpixel_order._tag
  inline def apply(inline o: _cairo_subpixel_order): cairo_subpixel_order_t = o
  extension (v: cairo_subpixel_order_t)
    inline def value: _cairo_subpixel_order = v

opaque type cairo_surface_observer_callback_t = CFuncPtr3[Ptr[cairo_surface_t], Ptr[cairo_surface_t], Ptr[Byte], Unit]
object cairo_surface_observer_callback_t: 
  given _tag: Tag[cairo_surface_observer_callback_t] = Tag.materializeCFuncPtr3[Ptr[cairo_surface_t], Ptr[cairo_surface_t], Ptr[Byte], Unit]
  inline def apply(inline o: CFuncPtr3[Ptr[cairo_surface_t], Ptr[cairo_surface_t], Ptr[Byte], Unit]): cairo_surface_observer_callback_t = o
  extension (v: cairo_surface_observer_callback_t)
    inline def value: CFuncPtr3[Ptr[cairo_surface_t], Ptr[cairo_surface_t], Ptr[Byte], Unit] = v

type cairo_surface_type_t = _cairo_surface_type
object cairo_surface_type_t: 
  given _tag: Tag[cairo_surface_type_t] = _cairo_surface_type._tag
  inline def apply(inline o: _cairo_surface_type): cairo_surface_type_t = o
  extension (v: cairo_surface_type_t)
    inline def value: _cairo_surface_type = v

type cairo_text_cluster_flags_t = _cairo_text_cluster_flags
object cairo_text_cluster_flags_t: 
  given _tag: Tag[cairo_text_cluster_flags_t] = _cairo_text_cluster_flags._tag
  inline def apply(inline o: _cairo_text_cluster_flags): cairo_text_cluster_flags_t = o
  extension (v: cairo_text_cluster_flags_t)
    inline def value: _cairo_text_cluster_flags = v

opaque type cairo_user_scaled_font_init_func_t = CFuncPtr3[Ptr[cairo_scaled_font_t], Ptr[cairo_t], Ptr[cairo_font_extents_t], cairo_status_t]
object cairo_user_scaled_font_init_func_t: 
  given _tag: Tag[cairo_user_scaled_font_init_func_t] = Tag.materializeCFuncPtr3[Ptr[cairo_scaled_font_t], Ptr[cairo_t], Ptr[cairo_font_extents_t], cairo_status_t]
  inline def apply(inline o: CFuncPtr3[Ptr[cairo_scaled_font_t], Ptr[cairo_t], Ptr[cairo_font_extents_t], cairo_status_t]): cairo_user_scaled_font_init_func_t = o
  extension (v: cairo_user_scaled_font_init_func_t)
    inline def value: CFuncPtr3[Ptr[cairo_scaled_font_t], Ptr[cairo_t], Ptr[cairo_font_extents_t], cairo_status_t] = v

opaque type cairo_user_scaled_font_render_glyph_func_t = CFuncPtr4[Ptr[cairo_scaled_font_t], CUnsignedLongInt, Ptr[cairo_t], Ptr[cairo_text_extents_t], cairo_status_t]
object cairo_user_scaled_font_render_glyph_func_t: 
  given _tag: Tag[cairo_user_scaled_font_render_glyph_func_t] = Tag.materializeCFuncPtr4[Ptr[cairo_scaled_font_t], CUnsignedLongInt, Ptr[cairo_t], Ptr[cairo_text_extents_t], cairo_status_t]
  inline def apply(inline o: CFuncPtr4[Ptr[cairo_scaled_font_t], CUnsignedLongInt, Ptr[cairo_t], Ptr[cairo_text_extents_t], cairo_status_t]): cairo_user_scaled_font_render_glyph_func_t = o
  extension (v: cairo_user_scaled_font_render_glyph_func_t)
    inline def value: CFuncPtr4[Ptr[cairo_scaled_font_t], CUnsignedLongInt, Ptr[cairo_t], Ptr[cairo_text_extents_t], cairo_status_t] = v

opaque type cairo_user_scaled_font_text_to_glyphs_func_t = CFuncPtr8[Ptr[cairo_scaled_font_t], CString, CInt, Ptr[Ptr[cairo_glyph_t]], Ptr[CInt], Ptr[Ptr[cairo_text_cluster_t]], Ptr[CInt], Ptr[cairo_text_cluster_flags_t], cairo_status_t]
object cairo_user_scaled_font_text_to_glyphs_func_t: 
  given _tag: Tag[cairo_user_scaled_font_text_to_glyphs_func_t] = Tag.materializeCFuncPtr8[Ptr[cairo_scaled_font_t], CString, CInt, Ptr[Ptr[cairo_glyph_t]], Ptr[CInt], Ptr[Ptr[cairo_text_cluster_t]], Ptr[CInt], Ptr[cairo_text_cluster_flags_t], cairo_status_t]
  inline def apply(inline o: CFuncPtr8[Ptr[cairo_scaled_font_t], CString, CInt, Ptr[Ptr[cairo_glyph_t]], Ptr[CInt], Ptr[Ptr[cairo_text_cluster_t]], Ptr[CInt], Ptr[cairo_text_cluster_flags_t], cairo_status_t]): cairo_user_scaled_font_text_to_glyphs_func_t = o
  extension (v: cairo_user_scaled_font_text_to_glyphs_func_t)
    inline def value: CFuncPtr8[Ptr[cairo_scaled_font_t], CString, CInt, Ptr[Ptr[cairo_glyph_t]], Ptr[CInt], Ptr[Ptr[cairo_text_cluster_t]], Ptr[CInt], Ptr[cairo_text_cluster_flags_t], cairo_status_t] = v

opaque type cairo_user_scaled_font_unicode_to_glyph_func_t = CFuncPtr3[Ptr[cairo_scaled_font_t], CUnsignedLongInt, Ptr[CUnsignedLongInt], cairo_status_t]
object cairo_user_scaled_font_unicode_to_glyph_func_t: 
  given _tag: Tag[cairo_user_scaled_font_unicode_to_glyph_func_t] = Tag.materializeCFuncPtr3[Ptr[cairo_scaled_font_t], CUnsignedLongInt, Ptr[CUnsignedLongInt], cairo_status_t]
  inline def apply(inline o: CFuncPtr3[Ptr[cairo_scaled_font_t], CUnsignedLongInt, Ptr[CUnsignedLongInt], cairo_status_t]): cairo_user_scaled_font_unicode_to_glyph_func_t = o
  extension (v: cairo_user_scaled_font_unicode_to_glyph_func_t)
    inline def value: CFuncPtr3[Ptr[cairo_scaled_font_t], CUnsignedLongInt, Ptr[CUnsignedLongInt], cairo_status_t] = v

opaque type cairo_write_func_t = CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], CUnsignedInt, cairo_status_t]
object cairo_write_func_t: 
  given _tag: Tag[cairo_write_func_t] = Tag.materializeCFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], CUnsignedInt, cairo_status_t]
  inline def apply(inline o: CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], CUnsignedInt, cairo_status_t]): cairo_write_func_t = o
  extension (v: cairo_write_func_t)
    inline def value: CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], CUnsignedInt, cairo_status_t] = v

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

opaque type gchararray = Ptr[gchar]
object gchararray: 
  given _tag: Tag[gchararray] = Tag.Ptr[gchar](gchar._tag)
  inline def apply(inline o: Ptr[gchar]): gchararray = o
  extension (v: gchararray)
    inline def value: Ptr[gchar] = v

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

type graphene_simd4f_t = __m128
object graphene_simd4f_t: 
  given _tag: Tag[graphene_simd4f_t] = __m128._tag
  inline def apply(inline o: __m128): graphene_simd4f_t = o
  extension (v: graphene_simd4f_t)
    inline def value: __m128 = v

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

type gunichar = guint32
object gunichar: 
  given _tag: Tag[gunichar] = guint32._tag
  inline def apply(inline o: guint32): gunichar = o
  extension (v: gunichar)
    inline def value: guint32 = v

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

opaque type hb_bool_t = CInt
object hb_bool_t: 
  given _tag: Tag[hb_bool_t] = Tag.Int
  inline def apply(inline o: CInt): hb_bool_t = o
  extension (v: hb_bool_t)
    inline def value: CInt = v

opaque type hb_buffer_message_func_t = CFuncPtr4[Ptr[hb_buffer_t], Ptr[hb_font_t], CString, Ptr[Byte], hb_bool_t]
object hb_buffer_message_func_t: 
  given _tag: Tag[hb_buffer_message_func_t] = Tag.materializeCFuncPtr4[Ptr[hb_buffer_t], Ptr[hb_font_t], CString, Ptr[Byte], hb_bool_t]
  inline def apply(inline o: CFuncPtr4[Ptr[hb_buffer_t], Ptr[hb_font_t], CString, Ptr[Byte], hb_bool_t]): hb_buffer_message_func_t = o
  extension (v: hb_buffer_message_func_t)
    inline def value: CFuncPtr4[Ptr[hb_buffer_t], Ptr[hb_font_t], CString, Ptr[Byte], hb_bool_t] = v

type hb_codepoint_t = uint32_t
object hb_codepoint_t: 
  given _tag: Tag[hb_codepoint_t] = uint32_t._tag
  inline def apply(inline o: uint32_t): hb_codepoint_t = o
  extension (v: hb_codepoint_t)
    inline def value: uint32_t = v

type hb_color_t = uint32_t
object hb_color_t: 
  given _tag: Tag[hb_color_t] = uint32_t._tag
  inline def apply(inline o: uint32_t): hb_color_t = o
  extension (v: hb_color_t)
    inline def value: uint32_t = v

opaque type hb_destroy_func_t = CFuncPtr1[Ptr[Byte], Unit]
object hb_destroy_func_t: 
  given _tag: Tag[hb_destroy_func_t] = Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
  inline def apply(inline o: CFuncPtr1[Ptr[Byte], Unit]): hb_destroy_func_t = o
  extension (v: hb_destroy_func_t)
    inline def value: CFuncPtr1[Ptr[Byte], Unit] = v

opaque type hb_font_get_font_extents_func_t = CFuncPtr4[Ptr[hb_font_t], Ptr[Byte], Ptr[hb_font_extents_t], Ptr[Byte], hb_bool_t]
object hb_font_get_font_extents_func_t: 
  given _tag: Tag[hb_font_get_font_extents_func_t] = Tag.materializeCFuncPtr4[Ptr[hb_font_t], Ptr[Byte], Ptr[hb_font_extents_t], Ptr[Byte], hb_bool_t]
  inline def apply(inline o: CFuncPtr4[Ptr[hb_font_t], Ptr[Byte], Ptr[hb_font_extents_t], Ptr[Byte], hb_bool_t]): hb_font_get_font_extents_func_t = o
  extension (v: hb_font_get_font_extents_func_t)
    inline def value: CFuncPtr4[Ptr[hb_font_t], Ptr[Byte], Ptr[hb_font_extents_t], Ptr[Byte], hb_bool_t] = v

type hb_font_get_font_h_extents_func_t = hb_font_get_font_extents_func_t
object hb_font_get_font_h_extents_func_t: 
  given _tag: Tag[hb_font_get_font_h_extents_func_t] = hb_font_get_font_extents_func_t._tag
  inline def apply(inline o: hb_font_get_font_extents_func_t): hb_font_get_font_h_extents_func_t = o
  extension (v: hb_font_get_font_h_extents_func_t)
    inline def value: hb_font_get_font_extents_func_t = v

type hb_font_get_font_v_extents_func_t = hb_font_get_font_extents_func_t
object hb_font_get_font_v_extents_func_t: 
  given _tag: Tag[hb_font_get_font_v_extents_func_t] = hb_font_get_font_extents_func_t._tag
  inline def apply(inline o: hb_font_get_font_extents_func_t): hb_font_get_font_v_extents_func_t = o
  extension (v: hb_font_get_font_v_extents_func_t)
    inline def value: hb_font_get_font_extents_func_t = v

opaque type hb_font_get_glyph_advance_func_t = CFuncPtr4[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[Byte], hb_position_t]
object hb_font_get_glyph_advance_func_t: 
  given _tag: Tag[hb_font_get_glyph_advance_func_t] = Tag.materializeCFuncPtr4[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[Byte], hb_position_t]
  inline def apply(inline o: CFuncPtr4[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[Byte], hb_position_t]): hb_font_get_glyph_advance_func_t = o
  extension (v: hb_font_get_glyph_advance_func_t)
    inline def value: CFuncPtr4[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[Byte], hb_position_t] = v

opaque type hb_font_get_glyph_advances_func_t = CFuncPtr8[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_position_t], CUnsignedInt, Ptr[Byte], Unit]
object hb_font_get_glyph_advances_func_t: 
  given _tag: Tag[hb_font_get_glyph_advances_func_t] = Tag.materializeCFuncPtr8[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_position_t], CUnsignedInt, Ptr[Byte], Unit]
  inline def apply(inline o: CFuncPtr8[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_position_t], CUnsignedInt, Ptr[Byte], Unit]): hb_font_get_glyph_advances_func_t = o
  extension (v: hb_font_get_glyph_advances_func_t)
    inline def value: CFuncPtr8[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_position_t], CUnsignedInt, Ptr[Byte], Unit] = v

opaque type hb_font_get_glyph_contour_point_func_t = CFuncPtr7[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, CUnsignedInt, Ptr[hb_position_t], Ptr[hb_position_t], Ptr[Byte], hb_bool_t]
object hb_font_get_glyph_contour_point_func_t: 
  given _tag: Tag[hb_font_get_glyph_contour_point_func_t] = Tag.materializeCFuncPtr7[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, CUnsignedInt, Ptr[hb_position_t], Ptr[hb_position_t], Ptr[Byte], hb_bool_t]
  inline def apply(inline o: CFuncPtr7[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, CUnsignedInt, Ptr[hb_position_t], Ptr[hb_position_t], Ptr[Byte], hb_bool_t]): hb_font_get_glyph_contour_point_func_t = o
  extension (v: hb_font_get_glyph_contour_point_func_t)
    inline def value: CFuncPtr7[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, CUnsignedInt, Ptr[hb_position_t], Ptr[hb_position_t], Ptr[Byte], hb_bool_t] = v

opaque type hb_font_get_glyph_extents_func_t = CFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_glyph_extents_t], Ptr[Byte], hb_bool_t]
object hb_font_get_glyph_extents_func_t: 
  given _tag: Tag[hb_font_get_glyph_extents_func_t] = Tag.materializeCFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_glyph_extents_t], Ptr[Byte], hb_bool_t]
  inline def apply(inline o: CFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_glyph_extents_t], Ptr[Byte], hb_bool_t]): hb_font_get_glyph_extents_func_t = o
  extension (v: hb_font_get_glyph_extents_func_t)
    inline def value: CFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_glyph_extents_t], Ptr[Byte], hb_bool_t] = v

opaque type hb_font_get_glyph_from_name_func_t = CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], CString, CInt, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
object hb_font_get_glyph_from_name_func_t: 
  given _tag: Tag[hb_font_get_glyph_from_name_func_t] = Tag.materializeCFuncPtr6[Ptr[hb_font_t], Ptr[Byte], CString, CInt, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
  inline def apply(inline o: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], CString, CInt, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]): hb_font_get_glyph_from_name_func_t = o
  extension (v: hb_font_get_glyph_from_name_func_t)
    inline def value: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], CString, CInt, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t] = v

opaque type hb_font_get_glyph_func_t = CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
object hb_font_get_glyph_func_t: 
  given _tag: Tag[hb_font_get_glyph_func_t] = Tag.materializeCFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
  inline def apply(inline o: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]): hb_font_get_glyph_func_t = o
  extension (v: hb_font_get_glyph_func_t)
    inline def value: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t] = v

type hb_font_get_glyph_h_advance_func_t = hb_font_get_glyph_advance_func_t
object hb_font_get_glyph_h_advance_func_t: 
  given _tag: Tag[hb_font_get_glyph_h_advance_func_t] = hb_font_get_glyph_advance_func_t._tag
  inline def apply(inline o: hb_font_get_glyph_advance_func_t): hb_font_get_glyph_h_advance_func_t = o
  extension (v: hb_font_get_glyph_h_advance_func_t)
    inline def value: hb_font_get_glyph_advance_func_t = v

type hb_font_get_glyph_h_advances_func_t = hb_font_get_glyph_advances_func_t
object hb_font_get_glyph_h_advances_func_t: 
  given _tag: Tag[hb_font_get_glyph_h_advances_func_t] = hb_font_get_glyph_advances_func_t._tag
  inline def apply(inline o: hb_font_get_glyph_advances_func_t): hb_font_get_glyph_h_advances_func_t = o
  extension (v: hb_font_get_glyph_h_advances_func_t)
    inline def value: hb_font_get_glyph_advances_func_t = v

type hb_font_get_glyph_h_kerning_func_t = hb_font_get_glyph_kerning_func_t
object hb_font_get_glyph_h_kerning_func_t: 
  given _tag: Tag[hb_font_get_glyph_h_kerning_func_t] = hb_font_get_glyph_kerning_func_t._tag
  inline def apply(inline o: hb_font_get_glyph_kerning_func_t): hb_font_get_glyph_h_kerning_func_t = o
  extension (v: hb_font_get_glyph_h_kerning_func_t)
    inline def value: hb_font_get_glyph_kerning_func_t = v

type hb_font_get_glyph_h_origin_func_t = hb_font_get_glyph_origin_func_t
object hb_font_get_glyph_h_origin_func_t: 
  given _tag: Tag[hb_font_get_glyph_h_origin_func_t] = hb_font_get_glyph_origin_func_t._tag
  inline def apply(inline o: hb_font_get_glyph_origin_func_t): hb_font_get_glyph_h_origin_func_t = o
  extension (v: hb_font_get_glyph_h_origin_func_t)
    inline def value: hb_font_get_glyph_origin_func_t = v

opaque type hb_font_get_glyph_kerning_func_t = CFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[Byte], hb_position_t]
object hb_font_get_glyph_kerning_func_t: 
  given _tag: Tag[hb_font_get_glyph_kerning_func_t] = Tag.materializeCFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[Byte], hb_position_t]
  inline def apply(inline o: CFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[Byte], hb_position_t]): hb_font_get_glyph_kerning_func_t = o
  extension (v: hb_font_get_glyph_kerning_func_t)
    inline def value: CFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[Byte], hb_position_t] = v

opaque type hb_font_get_glyph_name_func_t = CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, CString, CUnsignedInt, Ptr[Byte], hb_bool_t]
object hb_font_get_glyph_name_func_t: 
  given _tag: Tag[hb_font_get_glyph_name_func_t] = Tag.materializeCFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, CString, CUnsignedInt, Ptr[Byte], hb_bool_t]
  inline def apply(inline o: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, CString, CUnsignedInt, Ptr[Byte], hb_bool_t]): hb_font_get_glyph_name_func_t = o
  extension (v: hb_font_get_glyph_name_func_t)
    inline def value: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, CString, CUnsignedInt, Ptr[Byte], hb_bool_t] = v

opaque type hb_font_get_glyph_origin_func_t = CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_position_t], Ptr[hb_position_t], Ptr[Byte], hb_bool_t]
object hb_font_get_glyph_origin_func_t: 
  given _tag: Tag[hb_font_get_glyph_origin_func_t] = Tag.materializeCFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_position_t], Ptr[hb_position_t], Ptr[Byte], hb_bool_t]
  inline def apply(inline o: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_position_t], Ptr[hb_position_t], Ptr[Byte], hb_bool_t]): hb_font_get_glyph_origin_func_t = o
  extension (v: hb_font_get_glyph_origin_func_t)
    inline def value: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_position_t], Ptr[hb_position_t], Ptr[Byte], hb_bool_t] = v

type hb_font_get_glyph_v_advance_func_t = hb_font_get_glyph_advance_func_t
object hb_font_get_glyph_v_advance_func_t: 
  given _tag: Tag[hb_font_get_glyph_v_advance_func_t] = hb_font_get_glyph_advance_func_t._tag
  inline def apply(inline o: hb_font_get_glyph_advance_func_t): hb_font_get_glyph_v_advance_func_t = o
  extension (v: hb_font_get_glyph_v_advance_func_t)
    inline def value: hb_font_get_glyph_advance_func_t = v

type hb_font_get_glyph_v_advances_func_t = hb_font_get_glyph_advances_func_t
object hb_font_get_glyph_v_advances_func_t: 
  given _tag: Tag[hb_font_get_glyph_v_advances_func_t] = hb_font_get_glyph_advances_func_t._tag
  inline def apply(inline o: hb_font_get_glyph_advances_func_t): hb_font_get_glyph_v_advances_func_t = o
  extension (v: hb_font_get_glyph_v_advances_func_t)
    inline def value: hb_font_get_glyph_advances_func_t = v

type hb_font_get_glyph_v_kerning_func_t = hb_font_get_glyph_kerning_func_t
object hb_font_get_glyph_v_kerning_func_t: 
  given _tag: Tag[hb_font_get_glyph_v_kerning_func_t] = hb_font_get_glyph_kerning_func_t._tag
  inline def apply(inline o: hb_font_get_glyph_kerning_func_t): hb_font_get_glyph_v_kerning_func_t = o
  extension (v: hb_font_get_glyph_v_kerning_func_t)
    inline def value: hb_font_get_glyph_kerning_func_t = v

type hb_font_get_glyph_v_origin_func_t = hb_font_get_glyph_origin_func_t
object hb_font_get_glyph_v_origin_func_t: 
  given _tag: Tag[hb_font_get_glyph_v_origin_func_t] = hb_font_get_glyph_origin_func_t._tag
  inline def apply(inline o: hb_font_get_glyph_origin_func_t): hb_font_get_glyph_v_origin_func_t = o
  extension (v: hb_font_get_glyph_v_origin_func_t)
    inline def value: hb_font_get_glyph_origin_func_t = v

opaque type hb_font_get_nominal_glyph_func_t = CFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
object hb_font_get_nominal_glyph_func_t: 
  given _tag: Tag[hb_font_get_nominal_glyph_func_t] = Tag.materializeCFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
  inline def apply(inline o: CFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]): hb_font_get_nominal_glyph_func_t = o
  extension (v: hb_font_get_nominal_glyph_func_t)
    inline def value: CFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t] = v

opaque type hb_font_get_nominal_glyphs_func_t = CFuncPtr8[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[Byte], CUnsignedInt]
object hb_font_get_nominal_glyphs_func_t: 
  given _tag: Tag[hb_font_get_nominal_glyphs_func_t] = Tag.materializeCFuncPtr8[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[Byte], CUnsignedInt]
  inline def apply(inline o: CFuncPtr8[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[Byte], CUnsignedInt]): hb_font_get_nominal_glyphs_func_t = o
  extension (v: hb_font_get_nominal_glyphs_func_t)
    inline def value: CFuncPtr8[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[Byte], CUnsignedInt] = v

opaque type hb_font_get_variation_glyph_func_t = CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
object hb_font_get_variation_glyph_func_t: 
  given _tag: Tag[hb_font_get_variation_glyph_func_t] = Tag.materializeCFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
  inline def apply(inline o: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]): hb_font_get_variation_glyph_func_t = o
  extension (v: hb_font_get_variation_glyph_func_t)
    inline def value: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t] = v

opaque type hb_language_t = Ptr[hb_language_impl_t]
object hb_language_t: 
  given _tag: Tag[hb_language_t] = Tag.Ptr[hb_language_impl_t](hb_language_impl_t._tag)
  inline def apply(inline o: Ptr[hb_language_impl_t]): hb_language_t = o
  extension (v: hb_language_t)
    inline def value: Ptr[hb_language_impl_t] = v

type hb_mask_t = uint32_t
object hb_mask_t: 
  given _tag: Tag[hb_mask_t] = uint32_t._tag
  inline def apply(inline o: uint32_t): hb_mask_t = o
  extension (v: hb_mask_t)
    inline def value: uint32_t = v

type hb_position_t = int32_t
object hb_position_t: 
  given _tag: Tag[hb_position_t] = int32_t._tag
  inline def apply(inline o: int32_t): hb_position_t = o
  extension (v: hb_position_t)
    inline def value: int32_t = v

opaque type hb_reference_table_func_t = CFuncPtr3[Ptr[hb_face_t], hb_tag_t, Ptr[Byte], Ptr[hb_blob_t]]
object hb_reference_table_func_t: 
  given _tag: Tag[hb_reference_table_func_t] = Tag.materializeCFuncPtr3[Ptr[hb_face_t], hb_tag_t, Ptr[Byte], Ptr[hb_blob_t]]
  inline def apply(inline o: CFuncPtr3[Ptr[hb_face_t], hb_tag_t, Ptr[Byte], Ptr[hb_blob_t]]): hb_reference_table_func_t = o
  extension (v: hb_reference_table_func_t)
    inline def value: CFuncPtr3[Ptr[hb_face_t], hb_tag_t, Ptr[Byte], Ptr[hb_blob_t]] = v

type hb_tag_t = uint32_t
object hb_tag_t: 
  given _tag: Tag[hb_tag_t] = uint32_t._tag
  inline def apply(inline o: uint32_t): hb_tag_t = o
  extension (v: hb_tag_t)
    inline def value: uint32_t = v

opaque type hb_unicode_combining_class_func_t = CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_unicode_combining_class_t]
object hb_unicode_combining_class_func_t: 
  given _tag: Tag[hb_unicode_combining_class_func_t] = Tag.materializeCFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_unicode_combining_class_t]
  inline def apply(inline o: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_unicode_combining_class_t]): hb_unicode_combining_class_func_t = o
  extension (v: hb_unicode_combining_class_func_t)
    inline def value: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_unicode_combining_class_t] = v

opaque type hb_unicode_compose_func_t = CFuncPtr5[Ptr[hb_unicode_funcs_t], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
object hb_unicode_compose_func_t: 
  given _tag: Tag[hb_unicode_compose_func_t] = Tag.materializeCFuncPtr5[Ptr[hb_unicode_funcs_t], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
  inline def apply(inline o: CFuncPtr5[Ptr[hb_unicode_funcs_t], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]): hb_unicode_compose_func_t = o
  extension (v: hb_unicode_compose_func_t)
    inline def value: CFuncPtr5[Ptr[hb_unicode_funcs_t], hb_codepoint_t, hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t] = v

opaque type hb_unicode_decompose_compatibility_func_t = CFuncPtr4[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], CUnsignedInt]
object hb_unicode_decompose_compatibility_func_t: 
  given _tag: Tag[hb_unicode_decompose_compatibility_func_t] = Tag.materializeCFuncPtr4[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], CUnsignedInt]
  inline def apply(inline o: CFuncPtr4[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], CUnsignedInt]): hb_unicode_decompose_compatibility_func_t = o
  extension (v: hb_unicode_decompose_compatibility_func_t)
    inline def value: CFuncPtr4[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], CUnsignedInt] = v

opaque type hb_unicode_decompose_func_t = CFuncPtr5[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
object hb_unicode_decompose_func_t: 
  given _tag: Tag[hb_unicode_decompose_func_t] = Tag.materializeCFuncPtr5[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
  inline def apply(inline o: CFuncPtr5[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]): hb_unicode_decompose_func_t = o
  extension (v: hb_unicode_decompose_func_t)
    inline def value: CFuncPtr5[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t] = v

opaque type hb_unicode_eastasian_width_func_t = CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], CUnsignedInt]
object hb_unicode_eastasian_width_func_t: 
  given _tag: Tag[hb_unicode_eastasian_width_func_t] = Tag.materializeCFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], CUnsignedInt]
  inline def apply(inline o: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], CUnsignedInt]): hb_unicode_eastasian_width_func_t = o
  extension (v: hb_unicode_eastasian_width_func_t)
    inline def value: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], CUnsignedInt] = v

opaque type hb_unicode_general_category_func_t = CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_unicode_general_category_t]
object hb_unicode_general_category_func_t: 
  given _tag: Tag[hb_unicode_general_category_func_t] = Tag.materializeCFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_unicode_general_category_t]
  inline def apply(inline o: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_unicode_general_category_t]): hb_unicode_general_category_func_t = o
  extension (v: hb_unicode_general_category_func_t)
    inline def value: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_unicode_general_category_t] = v

opaque type hb_unicode_mirroring_func_t = CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_codepoint_t]
object hb_unicode_mirroring_func_t: 
  given _tag: Tag[hb_unicode_mirroring_func_t] = Tag.materializeCFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_codepoint_t]
  inline def apply(inline o: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_codepoint_t]): hb_unicode_mirroring_func_t = o
  extension (v: hb_unicode_mirroring_func_t)
    inline def value: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_codepoint_t] = v

opaque type hb_unicode_script_func_t = CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_script_t]
object hb_unicode_script_func_t: 
  given _tag: Tag[hb_unicode_script_func_t] = Tag.materializeCFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_script_t]
  inline def apply(inline o: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_script_t]): hb_unicode_script_func_t = o
  extension (v: hb_unicode_script_func_t)
    inline def value: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_script_t] = v

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

