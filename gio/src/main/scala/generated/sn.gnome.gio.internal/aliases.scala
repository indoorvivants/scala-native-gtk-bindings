package sn.gnome.gio.internal

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GActionMap_autoptr = Ptr[GActionMap]
object GActionMap_autoptr: 
  given _tag: Tag[GActionMap_autoptr] = Tag.Ptr[GActionMap](GActionMap._tag)
  inline def apply(inline o: Ptr[GActionMap]): GActionMap_autoptr = o
  extension (v: GActionMap_autoptr)
    inline def value: Ptr[GActionMap] = v

opaque type GActionMap_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GActionMap_listautoptr: 
  given _tag: Tag[GActionMap_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GActionMap_listautoptr = o
  extension (v: GActionMap_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GActionMap_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GActionMap_queueautoptr: 
  given _tag: Tag[GActionMap_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GActionMap_queueautoptr = o
  extension (v: GActionMap_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GActionMap_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GActionMap_slistautoptr: 
  given _tag: Tag[GActionMap_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GActionMap_slistautoptr = o
  extension (v: GActionMap_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GAction_autoptr = Ptr[GAction]
object GAction_autoptr: 
  given _tag: Tag[GAction_autoptr] = Tag.Ptr[GAction](GAction._tag)
  inline def apply(inline o: Ptr[GAction]): GAction_autoptr = o
  extension (v: GAction_autoptr)
    inline def value: Ptr[GAction] = v

opaque type GAction_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GAction_listautoptr: 
  given _tag: Tag[GAction_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GAction_listautoptr = o
  extension (v: GAction_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GAction_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GAction_queueautoptr: 
  given _tag: Tag[GAction_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GAction_queueautoptr = o
  extension (v: GAction_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GAction_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GAction_slistautoptr: 
  given _tag: Tag[GAction_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GAction_slistautoptr = o
  extension (v: GAction_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GAppInfoMonitor_autoptr = Ptr[GAppInfoMonitor]
object GAppInfoMonitor_autoptr: 
  given _tag: Tag[GAppInfoMonitor_autoptr] = Tag.Ptr[GAppInfoMonitor](GAppInfoMonitor._tag)
  inline def apply(inline o: Ptr[GAppInfoMonitor]): GAppInfoMonitor_autoptr = o
  extension (v: GAppInfoMonitor_autoptr)
    inline def value: Ptr[GAppInfoMonitor] = v

opaque type GAppInfoMonitor_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GAppInfoMonitor_listautoptr: 
  given _tag: Tag[GAppInfoMonitor_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GAppInfoMonitor_listautoptr = o
  extension (v: GAppInfoMonitor_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GAppInfoMonitor_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GAppInfoMonitor_queueautoptr: 
  given _tag: Tag[GAppInfoMonitor_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GAppInfoMonitor_queueautoptr = o
  extension (v: GAppInfoMonitor_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GAppInfoMonitor_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GAppInfoMonitor_slistautoptr: 
  given _tag: Tag[GAppInfoMonitor_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GAppInfoMonitor_slistautoptr = o
  extension (v: GAppInfoMonitor_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GAppInfo_autoptr = Ptr[GAppInfo]
object GAppInfo_autoptr: 
  given _tag: Tag[GAppInfo_autoptr] = Tag.Ptr[GAppInfo](GAppInfo._tag)
  inline def apply(inline o: Ptr[GAppInfo]): GAppInfo_autoptr = o
  extension (v: GAppInfo_autoptr)
    inline def value: Ptr[GAppInfo] = v

opaque type GAppInfo_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GAppInfo_listautoptr: 
  given _tag: Tag[GAppInfo_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GAppInfo_listautoptr = o
  extension (v: GAppInfo_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GAppInfo_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GAppInfo_queueautoptr: 
  given _tag: Tag[GAppInfo_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GAppInfo_queueautoptr = o
  extension (v: GAppInfo_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GAppInfo_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GAppInfo_slistautoptr: 
  given _tag: Tag[GAppInfo_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GAppInfo_slistautoptr = o
  extension (v: GAppInfo_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GAppLaunchContext_autoptr = Ptr[GAppLaunchContext]
object GAppLaunchContext_autoptr: 
  given _tag: Tag[GAppLaunchContext_autoptr] = Tag.Ptr[GAppLaunchContext](GAppLaunchContext._tag)
  inline def apply(inline o: Ptr[GAppLaunchContext]): GAppLaunchContext_autoptr = o
  extension (v: GAppLaunchContext_autoptr)
    inline def value: Ptr[GAppLaunchContext] = v

opaque type GAppLaunchContext_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GAppLaunchContext_listautoptr: 
  given _tag: Tag[GAppLaunchContext_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GAppLaunchContext_listautoptr = o
  extension (v: GAppLaunchContext_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GAppLaunchContext_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GAppLaunchContext_queueautoptr: 
  given _tag: Tag[GAppLaunchContext_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GAppLaunchContext_queueautoptr = o
  extension (v: GAppLaunchContext_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GAppLaunchContext_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GAppLaunchContext_slistautoptr: 
  given _tag: Tag[GAppLaunchContext_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GAppLaunchContext_slistautoptr = o
  extension (v: GAppLaunchContext_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GApplicationCommandLine_autoptr = Ptr[GApplicationCommandLine]
object GApplicationCommandLine_autoptr: 
  given _tag: Tag[GApplicationCommandLine_autoptr] = Tag.Ptr[GApplicationCommandLine](GApplicationCommandLine._tag)
  inline def apply(inline o: Ptr[GApplicationCommandLine]): GApplicationCommandLine_autoptr = o
  extension (v: GApplicationCommandLine_autoptr)
    inline def value: Ptr[GApplicationCommandLine] = v

opaque type GApplicationCommandLine_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GApplicationCommandLine_listautoptr: 
  given _tag: Tag[GApplicationCommandLine_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GApplicationCommandLine_listautoptr = o
  extension (v: GApplicationCommandLine_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GApplicationCommandLine_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GApplicationCommandLine_queueautoptr: 
  given _tag: Tag[GApplicationCommandLine_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GApplicationCommandLine_queueautoptr = o
  extension (v: GApplicationCommandLine_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GApplicationCommandLine_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GApplicationCommandLine_slistautoptr: 
  given _tag: Tag[GApplicationCommandLine_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GApplicationCommandLine_slistautoptr = o
  extension (v: GApplicationCommandLine_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GApplication_autoptr = Ptr[GApplication]
object GApplication_autoptr: 
  given _tag: Tag[GApplication_autoptr] = Tag.Ptr[GApplication](GApplication._tag)
  inline def apply(inline o: Ptr[GApplication]): GApplication_autoptr = o
  extension (v: GApplication_autoptr)
    inline def value: Ptr[GApplication] = v

opaque type GApplication_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GApplication_listautoptr: 
  given _tag: Tag[GApplication_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GApplication_listautoptr = o
  extension (v: GApplication_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GApplication_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GApplication_queueautoptr: 
  given _tag: Tag[GApplication_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GApplication_queueautoptr = o
  extension (v: GApplication_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GApplication_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GApplication_slistautoptr: 
  given _tag: Tag[GApplication_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GApplication_slistautoptr = o
  extension (v: GApplication_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GAsyncInitable_autoptr = Ptr[GAsyncInitable]
object GAsyncInitable_autoptr: 
  given _tag: Tag[GAsyncInitable_autoptr] = Tag.Ptr[GAsyncInitable](GAsyncInitable._tag)
  inline def apply(inline o: Ptr[GAsyncInitable]): GAsyncInitable_autoptr = o
  extension (v: GAsyncInitable_autoptr)
    inline def value: Ptr[GAsyncInitable] = v

opaque type GAsyncInitable_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GAsyncInitable_listautoptr: 
  given _tag: Tag[GAsyncInitable_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GAsyncInitable_listautoptr = o
  extension (v: GAsyncInitable_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GAsyncInitable_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GAsyncInitable_queueautoptr: 
  given _tag: Tag[GAsyncInitable_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GAsyncInitable_queueautoptr = o
  extension (v: GAsyncInitable_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GAsyncInitable_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GAsyncInitable_slistautoptr: 
  given _tag: Tag[GAsyncInitable_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GAsyncInitable_slistautoptr = o
  extension (v: GAsyncInitable_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GAsyncReadyCallback: _object: (nullable): the object the asynchronous operation was started with. : a #GAsyncResult.
*/
opaque type GAsyncReadyCallback = CFuncPtr3[Ptr[_root_.sn.gnome.gobject.internal.GObject], Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GAsyncReadyCallback: 
  given _tag: Tag[GAsyncReadyCallback] = Tag.materializeCFuncPtr3[Ptr[_root_.sn.gnome.gobject.internal.GObject], Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GAsyncReadyCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[_root_.sn.gnome.gobject.internal.GObject], Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer, Unit]): GAsyncReadyCallback = o
  extension (v: GAsyncReadyCallback)
    inline def value: CFuncPtr3[Ptr[_root_.sn.gnome.gobject.internal.GObject], Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GAsyncResult_autoptr = Ptr[GAsyncResult]
object GAsyncResult_autoptr: 
  given _tag: Tag[GAsyncResult_autoptr] = Tag.Ptr[GAsyncResult](GAsyncResult._tag)
  inline def apply(inline o: Ptr[GAsyncResult]): GAsyncResult_autoptr = o
  extension (v: GAsyncResult_autoptr)
    inline def value: Ptr[GAsyncResult] = v

opaque type GAsyncResult_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GAsyncResult_listautoptr: 
  given _tag: Tag[GAsyncResult_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GAsyncResult_listautoptr = o
  extension (v: GAsyncResult_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GAsyncResult_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GAsyncResult_queueautoptr: 
  given _tag: Tag[GAsyncResult_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GAsyncResult_queueautoptr = o
  extension (v: GAsyncResult_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GAsyncResult_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GAsyncResult_slistautoptr: 
  given _tag: Tag[GAsyncResult_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GAsyncResult_slistautoptr = o
  extension (v: GAsyncResult_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GBufferedInputStream_autoptr = Ptr[GBufferedInputStream]
object GBufferedInputStream_autoptr: 
  given _tag: Tag[GBufferedInputStream_autoptr] = Tag.Ptr[GBufferedInputStream](GBufferedInputStream._tag)
  inline def apply(inline o: Ptr[GBufferedInputStream]): GBufferedInputStream_autoptr = o
  extension (v: GBufferedInputStream_autoptr)
    inline def value: Ptr[GBufferedInputStream] = v

opaque type GBufferedInputStream_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GBufferedInputStream_listautoptr: 
  given _tag: Tag[GBufferedInputStream_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GBufferedInputStream_listautoptr = o
  extension (v: GBufferedInputStream_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GBufferedInputStream_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GBufferedInputStream_queueautoptr: 
  given _tag: Tag[GBufferedInputStream_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GBufferedInputStream_queueautoptr = o
  extension (v: GBufferedInputStream_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GBufferedInputStream_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GBufferedInputStream_slistautoptr: 
  given _tag: Tag[GBufferedInputStream_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GBufferedInputStream_slistautoptr = o
  extension (v: GBufferedInputStream_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GBufferedOutputStream_autoptr = Ptr[GBufferedOutputStream]
object GBufferedOutputStream_autoptr: 
  given _tag: Tag[GBufferedOutputStream_autoptr] = Tag.Ptr[GBufferedOutputStream](GBufferedOutputStream._tag)
  inline def apply(inline o: Ptr[GBufferedOutputStream]): GBufferedOutputStream_autoptr = o
  extension (v: GBufferedOutputStream_autoptr)
    inline def value: Ptr[GBufferedOutputStream] = v

opaque type GBufferedOutputStream_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GBufferedOutputStream_listautoptr: 
  given _tag: Tag[GBufferedOutputStream_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GBufferedOutputStream_listautoptr = o
  extension (v: GBufferedOutputStream_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GBufferedOutputStream_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GBufferedOutputStream_queueautoptr: 
  given _tag: Tag[GBufferedOutputStream_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GBufferedOutputStream_queueautoptr = o
  extension (v: GBufferedOutputStream_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GBufferedOutputStream_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GBufferedOutputStream_slistautoptr: 
  given _tag: Tag[GBufferedOutputStream_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GBufferedOutputStream_slistautoptr = o
  extension (v: GBufferedOutputStream_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GBusAcquiredCallback: : The #GDBusConnection to a message bus. _data: User data passed to g_bus_own_name().
*/
opaque type GBusAcquiredCallback = CFuncPtr3[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GBusAcquiredCallback: 
  given _tag: Tag[GBusAcquiredCallback] = Tag.materializeCFuncPtr3[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GBusAcquiredCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit]): GBusAcquiredCallback = o
  extension (v: GBusAcquiredCallback)
    inline def value: CFuncPtr3[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * GBusNameAcquiredCallback: : The #GDBusConnection on which to acquired the name. _data: User data passed to g_bus_own_name() or g_bus_own_name_on_connection().
*/
opaque type GBusNameAcquiredCallback = CFuncPtr3[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GBusNameAcquiredCallback: 
  given _tag: Tag[GBusNameAcquiredCallback] = Tag.materializeCFuncPtr3[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GBusNameAcquiredCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit]): GBusNameAcquiredCallback = o
  extension (v: GBusNameAcquiredCallback)
    inline def value: CFuncPtr3[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * GBusNameAppearedCallback: : The #GDBusConnection the name is being watched on. _data: User data passed to g_bus_watch_name().
*/
opaque type GBusNameAppearedCallback = CFuncPtr4[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GBusNameAppearedCallback: 
  given _tag: Tag[GBusNameAppearedCallback] = Tag.materializeCFuncPtr4[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GBusNameAppearedCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit]): GBusNameAppearedCallback = o
  extension (v: GBusNameAppearedCallback)
    inline def value: CFuncPtr4[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * GBusNameLostCallback: : The #GDBusConnection on which to acquire the name or %NULL if the connection was disconnected. _data: User data passed to g_bus_own_name() or g_bus_own_name_on_connection().
*/
opaque type GBusNameLostCallback = CFuncPtr3[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GBusNameLostCallback: 
  given _tag: Tag[GBusNameLostCallback] = Tag.materializeCFuncPtr3[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GBusNameLostCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit]): GBusNameLostCallback = o
  extension (v: GBusNameLostCallback)
    inline def value: CFuncPtr3[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * GBusNameVanishedCallback: : The #GDBusConnection the name is being watched on, or %NULL. _data: User data passed to g_bus_watch_name().
*/
opaque type GBusNameVanishedCallback = CFuncPtr3[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GBusNameVanishedCallback: 
  given _tag: Tag[GBusNameVanishedCallback] = Tag.materializeCFuncPtr3[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GBusNameVanishedCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit]): GBusNameVanishedCallback = o
  extension (v: GBusNameVanishedCallback)
    inline def value: CFuncPtr3[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GBytesIcon_autoptr = Ptr[GBytesIcon]
object GBytesIcon_autoptr: 
  given _tag: Tag[GBytesIcon_autoptr] = Tag.Ptr[GBytesIcon](GBytesIcon._tag)
  inline def apply(inline o: Ptr[GBytesIcon]): GBytesIcon_autoptr = o
  extension (v: GBytesIcon_autoptr)
    inline def value: Ptr[GBytesIcon] = v

opaque type GBytesIcon_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GBytesIcon_listautoptr: 
  given _tag: Tag[GBytesIcon_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GBytesIcon_listautoptr = o
  extension (v: GBytesIcon_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GBytesIcon_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GBytesIcon_queueautoptr: 
  given _tag: Tag[GBytesIcon_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GBytesIcon_queueautoptr = o
  extension (v: GBytesIcon_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GBytesIcon_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GBytesIcon_slistautoptr: 
  given _tag: Tag[GBytesIcon_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GBytesIcon_slistautoptr = o
  extension (v: GBytesIcon_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GCancellableSourceFunc: : the #GCancellable
*/
opaque type GCancellableSourceFunc = CFuncPtr2[Ptr[GCancellable], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GCancellableSourceFunc: 
  given _tag: Tag[GCancellableSourceFunc] = Tag.materializeCFuncPtr2[Ptr[GCancellable], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GCancellableSourceFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GCancellable], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GCancellableSourceFunc = o
  extension (v: GCancellableSourceFunc)
    inline def value: CFuncPtr2[Ptr[GCancellable], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GCancellable_autoptr = Ptr[GCancellable]
object GCancellable_autoptr: 
  given _tag: Tag[GCancellable_autoptr] = Tag.Ptr[GCancellable](GCancellable._tag)
  inline def apply(inline o: Ptr[GCancellable]): GCancellable_autoptr = o
  extension (v: GCancellable_autoptr)
    inline def value: Ptr[GCancellable] = v

opaque type GCancellable_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GCancellable_listautoptr: 
  given _tag: Tag[GCancellable_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GCancellable_listautoptr = o
  extension (v: GCancellable_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GCancellable_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GCancellable_queueautoptr: 
  given _tag: Tag[GCancellable_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GCancellable_queueautoptr = o
  extension (v: GCancellable_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GCancellable_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GCancellable_slistautoptr: 
  given _tag: Tag[GCancellable_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GCancellable_slistautoptr = o
  extension (v: GCancellable_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GCharsetConverter_autoptr = Ptr[GCharsetConverter]
object GCharsetConverter_autoptr: 
  given _tag: Tag[GCharsetConverter_autoptr] = Tag.Ptr[GCharsetConverter](GCharsetConverter._tag)
  inline def apply(inline o: Ptr[GCharsetConverter]): GCharsetConverter_autoptr = o
  extension (v: GCharsetConverter_autoptr)
    inline def value: Ptr[GCharsetConverter] = v

opaque type GCharsetConverter_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GCharsetConverter_listautoptr: 
  given _tag: Tag[GCharsetConverter_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GCharsetConverter_listautoptr = o
  extension (v: GCharsetConverter_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GCharsetConverter_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GCharsetConverter_queueautoptr: 
  given _tag: Tag[GCharsetConverter_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GCharsetConverter_queueautoptr = o
  extension (v: GCharsetConverter_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GCharsetConverter_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GCharsetConverter_slistautoptr: 
  given _tag: Tag[GCharsetConverter_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GCharsetConverter_slistautoptr = o
  extension (v: GCharsetConverter_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GConverterInputStream_autoptr = Ptr[GConverterInputStream]
object GConverterInputStream_autoptr: 
  given _tag: Tag[GConverterInputStream_autoptr] = Tag.Ptr[GConverterInputStream](GConverterInputStream._tag)
  inline def apply(inline o: Ptr[GConverterInputStream]): GConverterInputStream_autoptr = o
  extension (v: GConverterInputStream_autoptr)
    inline def value: Ptr[GConverterInputStream] = v

opaque type GConverterInputStream_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GConverterInputStream_listautoptr: 
  given _tag: Tag[GConverterInputStream_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GConverterInputStream_listautoptr = o
  extension (v: GConverterInputStream_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GConverterInputStream_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GConverterInputStream_queueautoptr: 
  given _tag: Tag[GConverterInputStream_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GConverterInputStream_queueautoptr = o
  extension (v: GConverterInputStream_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GConverterInputStream_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GConverterInputStream_slistautoptr: 
  given _tag: Tag[GConverterInputStream_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GConverterInputStream_slistautoptr = o
  extension (v: GConverterInputStream_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GConverterOutputStream_autoptr = Ptr[GConverterOutputStream]
object GConverterOutputStream_autoptr: 
  given _tag: Tag[GConverterOutputStream_autoptr] = Tag.Ptr[GConverterOutputStream](GConverterOutputStream._tag)
  inline def apply(inline o: Ptr[GConverterOutputStream]): GConverterOutputStream_autoptr = o
  extension (v: GConverterOutputStream_autoptr)
    inline def value: Ptr[GConverterOutputStream] = v

opaque type GConverterOutputStream_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GConverterOutputStream_listautoptr: 
  given _tag: Tag[GConverterOutputStream_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GConverterOutputStream_listautoptr = o
  extension (v: GConverterOutputStream_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GConverterOutputStream_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GConverterOutputStream_queueautoptr: 
  given _tag: Tag[GConverterOutputStream_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GConverterOutputStream_queueautoptr = o
  extension (v: GConverterOutputStream_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GConverterOutputStream_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GConverterOutputStream_slistautoptr: 
  given _tag: Tag[GConverterOutputStream_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GConverterOutputStream_slistautoptr = o
  extension (v: GConverterOutputStream_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GConverter_autoptr = Ptr[GConverter]
object GConverter_autoptr: 
  given _tag: Tag[GConverter_autoptr] = Tag.Ptr[GConverter](GConverter._tag)
  inline def apply(inline o: Ptr[GConverter]): GConverter_autoptr = o
  extension (v: GConverter_autoptr)
    inline def value: Ptr[GConverter] = v

opaque type GConverter_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GConverter_listautoptr: 
  given _tag: Tag[GConverter_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GConverter_listautoptr = o
  extension (v: GConverter_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GConverter_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GConverter_queueautoptr: 
  given _tag: Tag[GConverter_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GConverter_queueautoptr = o
  extension (v: GConverter_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GConverter_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GConverter_slistautoptr: 
  given _tag: Tag[GConverter_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GConverter_slistautoptr = o
  extension (v: GConverter_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GCredentials_autoptr = Ptr[GCredentials]
object GCredentials_autoptr: 
  given _tag: Tag[GCredentials_autoptr] = Tag.Ptr[GCredentials](GCredentials._tag)
  inline def apply(inline o: Ptr[GCredentials]): GCredentials_autoptr = o
  extension (v: GCredentials_autoptr)
    inline def value: Ptr[GCredentials] = v

opaque type GCredentials_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GCredentials_listautoptr: 
  given _tag: Tag[GCredentials_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GCredentials_listautoptr = o
  extension (v: GCredentials_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GCredentials_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GCredentials_queueautoptr: 
  given _tag: Tag[GCredentials_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GCredentials_queueautoptr = o
  extension (v: GCredentials_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GCredentials_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GCredentials_slistautoptr: 
  given _tag: Tag[GCredentials_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GCredentials_slistautoptr = o
  extension (v: GCredentials_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GDBusActionGroup_autoptr = Ptr[GDBusActionGroup]
object GDBusActionGroup_autoptr: 
  given _tag: Tag[GDBusActionGroup_autoptr] = Tag.Ptr[GDBusActionGroup](GDBusActionGroup._tag)
  inline def apply(inline o: Ptr[GDBusActionGroup]): GDBusActionGroup_autoptr = o
  extension (v: GDBusActionGroup_autoptr)
    inline def value: Ptr[GDBusActionGroup] = v

opaque type GDBusActionGroup_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GDBusActionGroup_listautoptr: 
  given _tag: Tag[GDBusActionGroup_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GDBusActionGroup_listautoptr = o
  extension (v: GDBusActionGroup_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GDBusActionGroup_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GDBusActionGroup_queueautoptr: 
  given _tag: Tag[GDBusActionGroup_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GDBusActionGroup_queueautoptr = o
  extension (v: GDBusActionGroup_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GDBusActionGroup_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GDBusActionGroup_slistautoptr: 
  given _tag: Tag[GDBusActionGroup_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GDBusActionGroup_slistautoptr = o
  extension (v: GDBusActionGroup_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GDBusAuthObserver_autoptr = Ptr[GDBusAuthObserver]
object GDBusAuthObserver_autoptr: 
  given _tag: Tag[GDBusAuthObserver_autoptr] = Tag.Ptr[GDBusAuthObserver](GDBusAuthObserver._tag)
  inline def apply(inline o: Ptr[GDBusAuthObserver]): GDBusAuthObserver_autoptr = o
  extension (v: GDBusAuthObserver_autoptr)
    inline def value: Ptr[GDBusAuthObserver] = v

opaque type GDBusAuthObserver_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GDBusAuthObserver_listautoptr: 
  given _tag: Tag[GDBusAuthObserver_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GDBusAuthObserver_listautoptr = o
  extension (v: GDBusAuthObserver_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GDBusAuthObserver_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GDBusAuthObserver_queueautoptr: 
  given _tag: Tag[GDBusAuthObserver_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GDBusAuthObserver_queueautoptr = o
  extension (v: GDBusAuthObserver_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GDBusAuthObserver_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GDBusAuthObserver_slistautoptr: 
  given _tag: Tag[GDBusAuthObserver_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GDBusAuthObserver_slistautoptr = o
  extension (v: GDBusAuthObserver_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GDBusConnection_autoptr = Ptr[GDBusConnection]
object GDBusConnection_autoptr: 
  given _tag: Tag[GDBusConnection_autoptr] = Tag.Ptr[GDBusConnection](GDBusConnection._tag)
  inline def apply(inline o: Ptr[GDBusConnection]): GDBusConnection_autoptr = o
  extension (v: GDBusConnection_autoptr)
    inline def value: Ptr[GDBusConnection] = v

opaque type GDBusConnection_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GDBusConnection_listautoptr: 
  given _tag: Tag[GDBusConnection_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GDBusConnection_listautoptr = o
  extension (v: GDBusConnection_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GDBusConnection_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GDBusConnection_queueautoptr: 
  given _tag: Tag[GDBusConnection_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GDBusConnection_queueautoptr = o
  extension (v: GDBusConnection_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GDBusConnection_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GDBusConnection_slistautoptr: 
  given _tag: Tag[GDBusConnection_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GDBusConnection_slistautoptr = o
  extension (v: GDBusConnection_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GDBusInterfaceGetPropertyFunc: : A #GDBusConnection. : The unique bus name of the remote caller. _path: The object path that the method was invoked on. : Return location for error. _data: The _data #gpointer passed to g_dbus_connection_register_object().
*/
opaque type GDBusInterfaceGetPropertyFunc = CFuncPtr7[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gpointer, Ptr[_root_.sn.gnome.glib.internal.GVariant]]
object GDBusInterfaceGetPropertyFunc: 
  given _tag: Tag[GDBusInterfaceGetPropertyFunc] = Tag.materializeCFuncPtr7[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gpointer, Ptr[_root_.sn.gnome.glib.internal.GVariant]]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GDBusInterfaceGetPropertyFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gpointer, Ptr[_root_.sn.gnome.glib.internal.GVariant]]): GDBusInterfaceGetPropertyFunc = o
  extension (v: GDBusInterfaceGetPropertyFunc)
    inline def value: CFuncPtr7[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gpointer, Ptr[_root_.sn.gnome.glib.internal.GVariant]] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * GDBusInterfaceMethodCallFunc: : A #GDBusConnection. : The unique bus name of the remote caller. _path: The object path that the method was invoked on. : A #GVariant tuple with parameters. : (transfer full): A #GDBusMethodInvocation object that must be used to return a value or error. _data: The _data #gpointer passed to g_dbus_connection_register_object().
*/
opaque type GDBusInterfaceMethodCallFunc = CFuncPtr8[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GDBusInterfaceMethodCallFunc: 
  given _tag: Tag[GDBusInterfaceMethodCallFunc] = Tag.materializeCFuncPtr8[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GDBusInterfaceMethodCallFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr8[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gpointer, Unit]): GDBusInterfaceMethodCallFunc = o
  extension (v: GDBusInterfaceMethodCallFunc)
    inline def value: CFuncPtr8[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * GDBusInterfaceSetPropertyFunc: : A #GDBusConnection. : The unique bus name of the remote caller. _path: The object path that the method was invoked on. : The value to set the property to. : Return location for error. _data: The _data #gpointer passed to g_dbus_connection_register_object().
*/
opaque type GDBusInterfaceSetPropertyFunc = CFuncPtr8[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GDBusInterfaceSetPropertyFunc: 
  given _tag: Tag[GDBusInterfaceSetPropertyFunc] = Tag.materializeCFuncPtr8[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GDBusInterfaceSetPropertyFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr8[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GDBusInterfaceSetPropertyFunc = o
  extension (v: GDBusInterfaceSetPropertyFunc)
    inline def value: CFuncPtr8[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GDBusInterfaceSkeleton_autoptr = Ptr[GDBusInterfaceSkeleton]
object GDBusInterfaceSkeleton_autoptr: 
  given _tag: Tag[GDBusInterfaceSkeleton_autoptr] = Tag.Ptr[GDBusInterfaceSkeleton](GDBusInterfaceSkeleton._tag)
  inline def apply(inline o: Ptr[GDBusInterfaceSkeleton]): GDBusInterfaceSkeleton_autoptr = o
  extension (v: GDBusInterfaceSkeleton_autoptr)
    inline def value: Ptr[GDBusInterfaceSkeleton] = v

opaque type GDBusInterfaceSkeleton_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GDBusInterfaceSkeleton_listautoptr: 
  given _tag: Tag[GDBusInterfaceSkeleton_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GDBusInterfaceSkeleton_listautoptr = o
  extension (v: GDBusInterfaceSkeleton_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GDBusInterfaceSkeleton_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GDBusInterfaceSkeleton_queueautoptr: 
  given _tag: Tag[GDBusInterfaceSkeleton_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GDBusInterfaceSkeleton_queueautoptr = o
  extension (v: GDBusInterfaceSkeleton_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GDBusInterfaceSkeleton_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GDBusInterfaceSkeleton_slistautoptr: 
  given _tag: Tag[GDBusInterfaceSkeleton_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GDBusInterfaceSkeleton_slistautoptr = o
  extension (v: GDBusInterfaceSkeleton_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GDBusInterface_autoptr = Ptr[GDBusInterface]
object GDBusInterface_autoptr: 
  given _tag: Tag[GDBusInterface_autoptr] = Tag.Ptr[GDBusInterface](GDBusInterface._tag)
  inline def apply(inline o: Ptr[GDBusInterface]): GDBusInterface_autoptr = o
  extension (v: GDBusInterface_autoptr)
    inline def value: Ptr[GDBusInterface] = v

opaque type GDBusInterface_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GDBusInterface_listautoptr: 
  given _tag: Tag[GDBusInterface_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GDBusInterface_listautoptr = o
  extension (v: GDBusInterface_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GDBusInterface_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GDBusInterface_queueautoptr: 
  given _tag: Tag[GDBusInterface_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GDBusInterface_queueautoptr = o
  extension (v: GDBusInterface_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GDBusInterface_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GDBusInterface_slistautoptr: 
  given _tag: Tag[GDBusInterface_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GDBusInterface_slistautoptr = o
  extension (v: GDBusInterface_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GDBusMenuModel_autoptr = Ptr[GDBusMenuModel]
object GDBusMenuModel_autoptr: 
  given _tag: Tag[GDBusMenuModel_autoptr] = Tag.Ptr[GDBusMenuModel](GDBusMenuModel._tag)
  inline def apply(inline o: Ptr[GDBusMenuModel]): GDBusMenuModel_autoptr = o
  extension (v: GDBusMenuModel_autoptr)
    inline def value: Ptr[GDBusMenuModel] = v

opaque type GDBusMenuModel_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GDBusMenuModel_listautoptr: 
  given _tag: Tag[GDBusMenuModel_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GDBusMenuModel_listautoptr = o
  extension (v: GDBusMenuModel_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GDBusMenuModel_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GDBusMenuModel_queueautoptr: 
  given _tag: Tag[GDBusMenuModel_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GDBusMenuModel_queueautoptr = o
  extension (v: GDBusMenuModel_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GDBusMenuModel_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GDBusMenuModel_slistautoptr: 
  given _tag: Tag[GDBusMenuModel_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GDBusMenuModel_slistautoptr = o
  extension (v: GDBusMenuModel_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GDBusMessageFilterFunction: : (transfer none): A #GDBusConnection. : (transfer full): A locked #GDBusMessage that the filter function takes ownership of. : %TRUE if it is a message received from the other peer, %FALSE if it is a message to be sent to the other peer. _data: User data passed when adding the filter.
*/
opaque type GDBusMessageFilterFunction = CFuncPtr4[Ptr[GDBusConnection], Ptr[GDBusMessage], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gpointer, Ptr[GDBusMessage]]
object GDBusMessageFilterFunction: 
  given _tag: Tag[GDBusMessageFilterFunction] = Tag.materializeCFuncPtr4[Ptr[GDBusConnection], Ptr[GDBusMessage], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gpointer, Ptr[GDBusMessage]]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GDBusMessageFilterFunction = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GDBusConnection], Ptr[GDBusMessage], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gpointer, Ptr[GDBusMessage]]): GDBusMessageFilterFunction = o
  extension (v: GDBusMessageFilterFunction)
    inline def value: CFuncPtr4[Ptr[GDBusConnection], Ptr[GDBusMessage], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gpointer, Ptr[GDBusMessage]] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GDBusMessage_autoptr = Ptr[GDBusMessage]
object GDBusMessage_autoptr: 
  given _tag: Tag[GDBusMessage_autoptr] = Tag.Ptr[GDBusMessage](GDBusMessage._tag)
  inline def apply(inline o: Ptr[GDBusMessage]): GDBusMessage_autoptr = o
  extension (v: GDBusMessage_autoptr)
    inline def value: Ptr[GDBusMessage] = v

opaque type GDBusMessage_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GDBusMessage_listautoptr: 
  given _tag: Tag[GDBusMessage_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GDBusMessage_listautoptr = o
  extension (v: GDBusMessage_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GDBusMessage_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GDBusMessage_queueautoptr: 
  given _tag: Tag[GDBusMessage_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GDBusMessage_queueautoptr = o
  extension (v: GDBusMessage_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GDBusMessage_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GDBusMessage_slistautoptr: 
  given _tag: Tag[GDBusMessage_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GDBusMessage_slistautoptr = o
  extension (v: GDBusMessage_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GDBusMethodInvocation_autoptr = Ptr[GDBusMethodInvocation]
object GDBusMethodInvocation_autoptr: 
  given _tag: Tag[GDBusMethodInvocation_autoptr] = Tag.Ptr[GDBusMethodInvocation](GDBusMethodInvocation._tag)
  inline def apply(inline o: Ptr[GDBusMethodInvocation]): GDBusMethodInvocation_autoptr = o
  extension (v: GDBusMethodInvocation_autoptr)
    inline def value: Ptr[GDBusMethodInvocation] = v

opaque type GDBusMethodInvocation_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GDBusMethodInvocation_listautoptr: 
  given _tag: Tag[GDBusMethodInvocation_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GDBusMethodInvocation_listautoptr = o
  extension (v: GDBusMethodInvocation_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GDBusMethodInvocation_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GDBusMethodInvocation_queueautoptr: 
  given _tag: Tag[GDBusMethodInvocation_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GDBusMethodInvocation_queueautoptr = o
  extension (v: GDBusMethodInvocation_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GDBusMethodInvocation_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GDBusMethodInvocation_slistautoptr: 
  given _tag: Tag[GDBusMethodInvocation_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GDBusMethodInvocation_slistautoptr = o
  extension (v: GDBusMethodInvocation_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GDBusNodeInfo_autoptr = Ptr[GDBusNodeInfo]
object GDBusNodeInfo_autoptr: 
  given _tag: Tag[GDBusNodeInfo_autoptr] = Tag.Ptr[GDBusNodeInfo](GDBusNodeInfo._tag)
  inline def apply(inline o: Ptr[GDBusNodeInfo]): GDBusNodeInfo_autoptr = o
  extension (v: GDBusNodeInfo_autoptr)
    inline def value: Ptr[GDBusNodeInfo] = v

opaque type GDBusNodeInfo_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GDBusNodeInfo_listautoptr: 
  given _tag: Tag[GDBusNodeInfo_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GDBusNodeInfo_listautoptr = o
  extension (v: GDBusNodeInfo_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GDBusNodeInfo_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GDBusNodeInfo_queueautoptr: 
  given _tag: Tag[GDBusNodeInfo_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GDBusNodeInfo_queueautoptr = o
  extension (v: GDBusNodeInfo_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GDBusNodeInfo_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GDBusNodeInfo_slistautoptr: 
  given _tag: Tag[GDBusNodeInfo_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GDBusNodeInfo_slistautoptr = o
  extension (v: GDBusNodeInfo_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GDBusObjectManagerClient_autoptr = Ptr[GDBusObjectManagerClient]
object GDBusObjectManagerClient_autoptr: 
  given _tag: Tag[GDBusObjectManagerClient_autoptr] = Tag.Ptr[GDBusObjectManagerClient](GDBusObjectManagerClient._tag)
  inline def apply(inline o: Ptr[GDBusObjectManagerClient]): GDBusObjectManagerClient_autoptr = o
  extension (v: GDBusObjectManagerClient_autoptr)
    inline def value: Ptr[GDBusObjectManagerClient] = v

opaque type GDBusObjectManagerClient_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GDBusObjectManagerClient_listautoptr: 
  given _tag: Tag[GDBusObjectManagerClient_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GDBusObjectManagerClient_listautoptr = o
  extension (v: GDBusObjectManagerClient_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GDBusObjectManagerClient_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GDBusObjectManagerClient_queueautoptr: 
  given _tag: Tag[GDBusObjectManagerClient_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GDBusObjectManagerClient_queueautoptr = o
  extension (v: GDBusObjectManagerClient_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GDBusObjectManagerClient_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GDBusObjectManagerClient_slistautoptr: 
  given _tag: Tag[GDBusObjectManagerClient_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GDBusObjectManagerClient_slistautoptr = o
  extension (v: GDBusObjectManagerClient_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GDBusObjectManagerServer_autoptr = Ptr[GDBusObjectManagerServer]
object GDBusObjectManagerServer_autoptr: 
  given _tag: Tag[GDBusObjectManagerServer_autoptr] = Tag.Ptr[GDBusObjectManagerServer](GDBusObjectManagerServer._tag)
  inline def apply(inline o: Ptr[GDBusObjectManagerServer]): GDBusObjectManagerServer_autoptr = o
  extension (v: GDBusObjectManagerServer_autoptr)
    inline def value: Ptr[GDBusObjectManagerServer] = v

opaque type GDBusObjectManagerServer_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GDBusObjectManagerServer_listautoptr: 
  given _tag: Tag[GDBusObjectManagerServer_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GDBusObjectManagerServer_listautoptr = o
  extension (v: GDBusObjectManagerServer_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GDBusObjectManagerServer_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GDBusObjectManagerServer_queueautoptr: 
  given _tag: Tag[GDBusObjectManagerServer_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GDBusObjectManagerServer_queueautoptr = o
  extension (v: GDBusObjectManagerServer_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GDBusObjectManagerServer_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GDBusObjectManagerServer_slistautoptr: 
  given _tag: Tag[GDBusObjectManagerServer_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GDBusObjectManagerServer_slistautoptr = o
  extension (v: GDBusObjectManagerServer_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GDBusObjectManager_autoptr = Ptr[GDBusObjectManager]
object GDBusObjectManager_autoptr: 
  given _tag: Tag[GDBusObjectManager_autoptr] = Tag.Ptr[GDBusObjectManager](GDBusObjectManager._tag)
  inline def apply(inline o: Ptr[GDBusObjectManager]): GDBusObjectManager_autoptr = o
  extension (v: GDBusObjectManager_autoptr)
    inline def value: Ptr[GDBusObjectManager] = v

opaque type GDBusObjectManager_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GDBusObjectManager_listautoptr: 
  given _tag: Tag[GDBusObjectManager_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GDBusObjectManager_listautoptr = o
  extension (v: GDBusObjectManager_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GDBusObjectManager_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GDBusObjectManager_queueautoptr: 
  given _tag: Tag[GDBusObjectManager_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GDBusObjectManager_queueautoptr = o
  extension (v: GDBusObjectManager_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GDBusObjectManager_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GDBusObjectManager_slistautoptr: 
  given _tag: Tag[GDBusObjectManager_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GDBusObjectManager_slistautoptr = o
  extension (v: GDBusObjectManager_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GDBusObjectProxy_autoptr = Ptr[GDBusObjectProxy]
object GDBusObjectProxy_autoptr: 
  given _tag: Tag[GDBusObjectProxy_autoptr] = Tag.Ptr[GDBusObjectProxy](GDBusObjectProxy._tag)
  inline def apply(inline o: Ptr[GDBusObjectProxy]): GDBusObjectProxy_autoptr = o
  extension (v: GDBusObjectProxy_autoptr)
    inline def value: Ptr[GDBusObjectProxy] = v

opaque type GDBusObjectProxy_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GDBusObjectProxy_listautoptr: 
  given _tag: Tag[GDBusObjectProxy_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GDBusObjectProxy_listautoptr = o
  extension (v: GDBusObjectProxy_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GDBusObjectProxy_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GDBusObjectProxy_queueautoptr: 
  given _tag: Tag[GDBusObjectProxy_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GDBusObjectProxy_queueautoptr = o
  extension (v: GDBusObjectProxy_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GDBusObjectProxy_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GDBusObjectProxy_slistautoptr: 
  given _tag: Tag[GDBusObjectProxy_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GDBusObjectProxy_slistautoptr = o
  extension (v: GDBusObjectProxy_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GDBusObjectSkeleton_autoptr = Ptr[GDBusObjectSkeleton]
object GDBusObjectSkeleton_autoptr: 
  given _tag: Tag[GDBusObjectSkeleton_autoptr] = Tag.Ptr[GDBusObjectSkeleton](GDBusObjectSkeleton._tag)
  inline def apply(inline o: Ptr[GDBusObjectSkeleton]): GDBusObjectSkeleton_autoptr = o
  extension (v: GDBusObjectSkeleton_autoptr)
    inline def value: Ptr[GDBusObjectSkeleton] = v

opaque type GDBusObjectSkeleton_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GDBusObjectSkeleton_listautoptr: 
  given _tag: Tag[GDBusObjectSkeleton_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GDBusObjectSkeleton_listautoptr = o
  extension (v: GDBusObjectSkeleton_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GDBusObjectSkeleton_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GDBusObjectSkeleton_queueautoptr: 
  given _tag: Tag[GDBusObjectSkeleton_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GDBusObjectSkeleton_queueautoptr = o
  extension (v: GDBusObjectSkeleton_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GDBusObjectSkeleton_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GDBusObjectSkeleton_slistautoptr: 
  given _tag: Tag[GDBusObjectSkeleton_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GDBusObjectSkeleton_slistautoptr = o
  extension (v: GDBusObjectSkeleton_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GDBusObject_autoptr = Ptr[GDBusObject]
object GDBusObject_autoptr: 
  given _tag: Tag[GDBusObject_autoptr] = Tag.Ptr[GDBusObject](GDBusObject._tag)
  inline def apply(inline o: Ptr[GDBusObject]): GDBusObject_autoptr = o
  extension (v: GDBusObject_autoptr)
    inline def value: Ptr[GDBusObject] = v

opaque type GDBusObject_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GDBusObject_listautoptr: 
  given _tag: Tag[GDBusObject_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GDBusObject_listautoptr = o
  extension (v: GDBusObject_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GDBusObject_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GDBusObject_queueautoptr: 
  given _tag: Tag[GDBusObject_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GDBusObject_queueautoptr = o
  extension (v: GDBusObject_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GDBusObject_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GDBusObject_slistautoptr: 
  given _tag: Tag[GDBusObject_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GDBusObject_slistautoptr = o
  extension (v: GDBusObject_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GDBusProxyTypeFunc: : A #GDBusObjectManagerClient. _path: The object path of the remote object.
*/
opaque type GDBusProxyTypeFunc = CFuncPtr4[Ptr[GDBusObjectManagerClient], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.gobject.internal.GType]
object GDBusProxyTypeFunc: 
  given _tag: Tag[GDBusProxyTypeFunc] = Tag.materializeCFuncPtr4[Ptr[GDBusObjectManagerClient], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.gobject.internal.GType]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GDBusProxyTypeFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GDBusObjectManagerClient], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.gobject.internal.GType]): GDBusProxyTypeFunc = o
  extension (v: GDBusProxyTypeFunc)
    inline def value: CFuncPtr4[Ptr[GDBusObjectManagerClient], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.gobject.internal.GType] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GDBusProxy_autoptr = Ptr[GDBusProxy]
object GDBusProxy_autoptr: 
  given _tag: Tag[GDBusProxy_autoptr] = Tag.Ptr[GDBusProxy](GDBusProxy._tag)
  inline def apply(inline o: Ptr[GDBusProxy]): GDBusProxy_autoptr = o
  extension (v: GDBusProxy_autoptr)
    inline def value: Ptr[GDBusProxy] = v

opaque type GDBusProxy_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GDBusProxy_listautoptr: 
  given _tag: Tag[GDBusProxy_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GDBusProxy_listautoptr = o
  extension (v: GDBusProxy_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GDBusProxy_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GDBusProxy_queueautoptr: 
  given _tag: Tag[GDBusProxy_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GDBusProxy_queueautoptr = o
  extension (v: GDBusProxy_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GDBusProxy_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GDBusProxy_slistautoptr: 
  given _tag: Tag[GDBusProxy_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GDBusProxy_slistautoptr = o
  extension (v: GDBusProxy_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GDBusServer_autoptr = Ptr[GDBusServer]
object GDBusServer_autoptr: 
  given _tag: Tag[GDBusServer_autoptr] = Tag.Ptr[GDBusServer](GDBusServer._tag)
  inline def apply(inline o: Ptr[GDBusServer]): GDBusServer_autoptr = o
  extension (v: GDBusServer_autoptr)
    inline def value: Ptr[GDBusServer] = v

opaque type GDBusServer_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GDBusServer_listautoptr: 
  given _tag: Tag[GDBusServer_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GDBusServer_listautoptr = o
  extension (v: GDBusServer_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GDBusServer_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GDBusServer_queueautoptr: 
  given _tag: Tag[GDBusServer_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GDBusServer_queueautoptr = o
  extension (v: GDBusServer_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GDBusServer_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GDBusServer_slistautoptr: 
  given _tag: Tag[GDBusServer_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GDBusServer_slistautoptr = o
  extension (v: GDBusServer_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GDBusSignalCallback: : A #GDBusConnection. _name: (nullable): The unique bus name of the sender of the signal, or %NULL on a peer-to-peer D-Bus connection. _path: The object path that the signal was emitted on. _name: The name of the signal. : A #GVariant tuple with parameters for the signal. _data: User data passed when subscribing to the signal.
*/
opaque type GDBusSignalCallback = CFuncPtr7[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GDBusSignalCallback: 
  given _tag: Tag[GDBusSignalCallback] = Tag.materializeCFuncPtr7[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GDBusSignalCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit]): GDBusSignalCallback = o
  extension (v: GDBusSignalCallback)
    inline def value: CFuncPtr7[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * GDBusSubtreeDispatchFunc: : A #GDBusConnection. : The unique bus name of the remote caller. _path: The object path that was registered with g_dbus_connection_register_subtree(). : A node that is a child of _path (relative to _path) or %NULL for the root of the subtree. _user_data: (nullable) (not optional): Return location for user data to pass to functions in the returned #GDBusInterfaceVTable. _data: The _data #gpointer passed to g_dbus_connection_register_subtree().
*/
opaque type GDBusSubtreeDispatchFunc = CFuncPtr7[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gpointer], _root_.sn.gnome.glib.internal.gpointer, Ptr[GDBusInterfaceVTable]]
object GDBusSubtreeDispatchFunc: 
  given _tag: Tag[GDBusSubtreeDispatchFunc] = Tag.materializeCFuncPtr7[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gpointer], _root_.sn.gnome.glib.internal.gpointer, Ptr[GDBusInterfaceVTable]]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GDBusSubtreeDispatchFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gpointer], _root_.sn.gnome.glib.internal.gpointer, Ptr[GDBusInterfaceVTable]]): GDBusSubtreeDispatchFunc = o
  extension (v: GDBusSubtreeDispatchFunc)
    inline def value: CFuncPtr7[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gpointer], _root_.sn.gnome.glib.internal.gpointer, Ptr[GDBusInterfaceVTable]] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * GDBusSubtreeEnumerateFunc: : A #GDBusConnection. : The unique bus name of the remote caller. _path: The object path that was registered with g_dbus_connection_register_subtree(). _data: The _data #gpointer passed to g_dbus_connection_register_subtree().
*/
opaque type GDBusSubtreeEnumerateFunc = CFuncPtr4[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]
object GDBusSubtreeEnumerateFunc: 
  given _tag: Tag[GDBusSubtreeEnumerateFunc] = Tag.materializeCFuncPtr4[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GDBusSubtreeEnumerateFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]): GDBusSubtreeEnumerateFunc = o
  extension (v: GDBusSubtreeEnumerateFunc)
    inline def value: CFuncPtr4[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * GDBusSubtreeIntrospectFunc: : A #GDBusConnection. : The unique bus name of the remote caller. _path: The object path that was registered with g_dbus_connection_register_subtree(). : A node that is a child of _path (relative to _path) or %NULL for the root of the subtree. _data: The _data #gpointer passed to g_dbus_connection_register_subtree().
*/
opaque type GDBusSubtreeIntrospectFunc = CFuncPtr5[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Ptr[Ptr[GDBusInterfaceInfo]]]
object GDBusSubtreeIntrospectFunc: 
  given _tag: Tag[GDBusSubtreeIntrospectFunc] = Tag.materializeCFuncPtr5[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Ptr[Ptr[GDBusInterfaceInfo]]]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GDBusSubtreeIntrospectFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Ptr[Ptr[GDBusInterfaceInfo]]]): GDBusSubtreeIntrospectFunc = o
  extension (v: GDBusSubtreeIntrospectFunc)
    inline def value: CFuncPtr5[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Ptr[Ptr[GDBusInterfaceInfo]]] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GDataInputStream_autoptr = Ptr[GDataInputStream]
object GDataInputStream_autoptr: 
  given _tag: Tag[GDataInputStream_autoptr] = Tag.Ptr[GDataInputStream](GDataInputStream._tag)
  inline def apply(inline o: Ptr[GDataInputStream]): GDataInputStream_autoptr = o
  extension (v: GDataInputStream_autoptr)
    inline def value: Ptr[GDataInputStream] = v

opaque type GDataInputStream_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GDataInputStream_listautoptr: 
  given _tag: Tag[GDataInputStream_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GDataInputStream_listautoptr = o
  extension (v: GDataInputStream_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GDataInputStream_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GDataInputStream_queueautoptr: 
  given _tag: Tag[GDataInputStream_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GDataInputStream_queueautoptr = o
  extension (v: GDataInputStream_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GDataInputStream_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GDataInputStream_slistautoptr: 
  given _tag: Tag[GDataInputStream_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GDataInputStream_slistautoptr = o
  extension (v: GDataInputStream_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GDataOutputStream_autoptr = Ptr[GDataOutputStream]
object GDataOutputStream_autoptr: 
  given _tag: Tag[GDataOutputStream_autoptr] = Tag.Ptr[GDataOutputStream](GDataOutputStream._tag)
  inline def apply(inline o: Ptr[GDataOutputStream]): GDataOutputStream_autoptr = o
  extension (v: GDataOutputStream_autoptr)
    inline def value: Ptr[GDataOutputStream] = v

opaque type GDataOutputStream_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GDataOutputStream_listautoptr: 
  given _tag: Tag[GDataOutputStream_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GDataOutputStream_listautoptr = o
  extension (v: GDataOutputStream_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GDataOutputStream_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GDataOutputStream_queueautoptr: 
  given _tag: Tag[GDataOutputStream_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GDataOutputStream_queueautoptr = o
  extension (v: GDataOutputStream_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GDataOutputStream_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GDataOutputStream_slistautoptr: 
  given _tag: Tag[GDataOutputStream_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GDataOutputStream_slistautoptr = o
  extension (v: GDataOutputStream_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GDatagramBasedSourceFunc: _based: the #GDatagramBased : the current condition at the source fired
*/
opaque type GDatagramBasedSourceFunc = CFuncPtr3[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GDatagramBasedSourceFunc: 
  given _tag: Tag[GDatagramBasedSourceFunc] = Tag.materializeCFuncPtr3[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GDatagramBasedSourceFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GDatagramBasedSourceFunc = o
  extension (v: GDatagramBasedSourceFunc)
    inline def value: CFuncPtr3[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GDatagramBased_autoptr = Ptr[GDatagramBased]
object GDatagramBased_autoptr: 
  given _tag: Tag[GDatagramBased_autoptr] = Tag.Ptr[GDatagramBased](GDatagramBased._tag)
  inline def apply(inline o: Ptr[GDatagramBased]): GDatagramBased_autoptr = o
  extension (v: GDatagramBased_autoptr)
    inline def value: Ptr[GDatagramBased] = v

opaque type GDatagramBased_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GDatagramBased_listautoptr: 
  given _tag: Tag[GDatagramBased_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GDatagramBased_listautoptr = o
  extension (v: GDatagramBased_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GDatagramBased_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GDatagramBased_queueautoptr: 
  given _tag: Tag[GDatagramBased_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GDatagramBased_queueautoptr = o
  extension (v: GDatagramBased_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GDatagramBased_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GDatagramBased_slistautoptr: 
  given _tag: Tag[GDatagramBased_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GDatagramBased_slistautoptr = o
  extension (v: GDatagramBased_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GDebugControllerDBusClass_autoptr = Ptr[GDebugControllerDBusClass]
object GDebugControllerDBusClass_autoptr: 
  given _tag: Tag[GDebugControllerDBusClass_autoptr] = Tag.Ptr[GDebugControllerDBusClass](GDebugControllerDBusClass._tag)
  inline def apply(inline o: Ptr[GDebugControllerDBusClass]): GDebugControllerDBusClass_autoptr = o
  extension (v: GDebugControllerDBusClass_autoptr)
    inline def value: Ptr[GDebugControllerDBusClass] = v

opaque type GDebugControllerDBusClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GDebugControllerDBusClass_listautoptr: 
  given _tag: Tag[GDebugControllerDBusClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GDebugControllerDBusClass_listautoptr = o
  extension (v: GDebugControllerDBusClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GDebugControllerDBusClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GDebugControllerDBusClass_queueautoptr: 
  given _tag: Tag[GDebugControllerDBusClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GDebugControllerDBusClass_queueautoptr = o
  extension (v: GDebugControllerDBusClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GDebugControllerDBusClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GDebugControllerDBusClass_slistautoptr: 
  given _tag: Tag[GDebugControllerDBusClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GDebugControllerDBusClass_slistautoptr = o
  extension (v: GDebugControllerDBusClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GDebugControllerDBus_autoptr = Ptr[GDebugControllerDBus]
object GDebugControllerDBus_autoptr: 
  given _tag: Tag[GDebugControllerDBus_autoptr] = Tag.Ptr[GDebugControllerDBus](GDebugControllerDBus._tag)
  inline def apply(inline o: Ptr[GDebugControllerDBus]): GDebugControllerDBus_autoptr = o
  extension (v: GDebugControllerDBus_autoptr)
    inline def value: Ptr[GDebugControllerDBus] = v

opaque type GDebugControllerDBus_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GDebugControllerDBus_listautoptr: 
  given _tag: Tag[GDebugControllerDBus_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GDebugControllerDBus_listautoptr = o
  extension (v: GDebugControllerDBus_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GDebugControllerDBus_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GDebugControllerDBus_queueautoptr: 
  given _tag: Tag[GDebugControllerDBus_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GDebugControllerDBus_queueautoptr = o
  extension (v: GDebugControllerDBus_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GDebugControllerDBus_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GDebugControllerDBus_slistautoptr: 
  given _tag: Tag[GDebugControllerDBus_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GDebugControllerDBus_slistautoptr = o
  extension (v: GDebugControllerDBus_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GDebugController_autoptr = Ptr[GDebugController]
object GDebugController_autoptr: 
  given _tag: Tag[GDebugController_autoptr] = Tag.Ptr[GDebugController](GDebugController._tag)
  inline def apply(inline o: Ptr[GDebugController]): GDebugController_autoptr = o
  extension (v: GDebugController_autoptr)
    inline def value: Ptr[GDebugController] = v

opaque type GDebugController_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GDebugController_listautoptr: 
  given _tag: Tag[GDebugController_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GDebugController_listautoptr = o
  extension (v: GDebugController_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GDebugController_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GDebugController_queueautoptr: 
  given _tag: Tag[GDebugController_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GDebugController_queueautoptr = o
  extension (v: GDebugController_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GDebugController_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GDebugController_slistautoptr: 
  given _tag: Tag[GDebugController_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GDebugController_slistautoptr = o
  extension (v: GDebugController_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GDrive_autoptr = Ptr[GDrive]
object GDrive_autoptr: 
  given _tag: Tag[GDrive_autoptr] = Tag.Ptr[GDrive](GDrive._tag)
  inline def apply(inline o: Ptr[GDrive]): GDrive_autoptr = o
  extension (v: GDrive_autoptr)
    inline def value: Ptr[GDrive] = v

opaque type GDrive_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GDrive_listautoptr: 
  given _tag: Tag[GDrive_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GDrive_listautoptr = o
  extension (v: GDrive_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GDrive_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GDrive_queueautoptr: 
  given _tag: Tag[GDrive_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GDrive_queueautoptr = o
  extension (v: GDrive_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GDrive_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GDrive_slistautoptr: 
  given _tag: Tag[GDrive_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GDrive_slistautoptr = o
  extension (v: GDrive_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GEmblem_autoptr = Ptr[GEmblem]
object GEmblem_autoptr: 
  given _tag: Tag[GEmblem_autoptr] = Tag.Ptr[GEmblem](GEmblem._tag)
  inline def apply(inline o: Ptr[GEmblem]): GEmblem_autoptr = o
  extension (v: GEmblem_autoptr)
    inline def value: Ptr[GEmblem] = v

opaque type GEmblem_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GEmblem_listautoptr: 
  given _tag: Tag[GEmblem_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GEmblem_listautoptr = o
  extension (v: GEmblem_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GEmblem_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GEmblem_queueautoptr: 
  given _tag: Tag[GEmblem_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GEmblem_queueautoptr = o
  extension (v: GEmblem_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GEmblem_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GEmblem_slistautoptr: 
  given _tag: Tag[GEmblem_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GEmblem_slistautoptr = o
  extension (v: GEmblem_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GEmblemedIcon_autoptr = Ptr[GEmblemedIcon]
object GEmblemedIcon_autoptr: 
  given _tag: Tag[GEmblemedIcon_autoptr] = Tag.Ptr[GEmblemedIcon](GEmblemedIcon._tag)
  inline def apply(inline o: Ptr[GEmblemedIcon]): GEmblemedIcon_autoptr = o
  extension (v: GEmblemedIcon_autoptr)
    inline def value: Ptr[GEmblemedIcon] = v

opaque type GEmblemedIcon_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GEmblemedIcon_listautoptr: 
  given _tag: Tag[GEmblemedIcon_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GEmblemedIcon_listautoptr = o
  extension (v: GEmblemedIcon_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GEmblemedIcon_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GEmblemedIcon_queueautoptr: 
  given _tag: Tag[GEmblemedIcon_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GEmblemedIcon_queueautoptr = o
  extension (v: GEmblemedIcon_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GEmblemedIcon_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GEmblemedIcon_slistautoptr: 
  given _tag: Tag[GEmblemedIcon_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GEmblemedIcon_slistautoptr = o
  extension (v: GEmblemedIcon_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GFileAttributeInfoList_autoptr = Ptr[GFileAttributeInfoList]
object GFileAttributeInfoList_autoptr: 
  given _tag: Tag[GFileAttributeInfoList_autoptr] = Tag.Ptr[GFileAttributeInfoList](GFileAttributeInfoList._tag)
  inline def apply(inline o: Ptr[GFileAttributeInfoList]): GFileAttributeInfoList_autoptr = o
  extension (v: GFileAttributeInfoList_autoptr)
    inline def value: Ptr[GFileAttributeInfoList] = v

opaque type GFileAttributeInfoList_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GFileAttributeInfoList_listautoptr: 
  given _tag: Tag[GFileAttributeInfoList_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GFileAttributeInfoList_listautoptr = o
  extension (v: GFileAttributeInfoList_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GFileAttributeInfoList_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GFileAttributeInfoList_queueautoptr: 
  given _tag: Tag[GFileAttributeInfoList_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GFileAttributeInfoList_queueautoptr = o
  extension (v: GFileAttributeInfoList_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GFileAttributeInfoList_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GFileAttributeInfoList_slistautoptr: 
  given _tag: Tag[GFileAttributeInfoList_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GFileAttributeInfoList_slistautoptr = o
  extension (v: GFileAttributeInfoList_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GFileEnumerator_autoptr = Ptr[GFileEnumerator]
object GFileEnumerator_autoptr: 
  given _tag: Tag[GFileEnumerator_autoptr] = Tag.Ptr[GFileEnumerator](GFileEnumerator._tag)
  inline def apply(inline o: Ptr[GFileEnumerator]): GFileEnumerator_autoptr = o
  extension (v: GFileEnumerator_autoptr)
    inline def value: Ptr[GFileEnumerator] = v

opaque type GFileEnumerator_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GFileEnumerator_listautoptr: 
  given _tag: Tag[GFileEnumerator_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GFileEnumerator_listautoptr = o
  extension (v: GFileEnumerator_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GFileEnumerator_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GFileEnumerator_queueautoptr: 
  given _tag: Tag[GFileEnumerator_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GFileEnumerator_queueautoptr = o
  extension (v: GFileEnumerator_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GFileEnumerator_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GFileEnumerator_slistautoptr: 
  given _tag: Tag[GFileEnumerator_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GFileEnumerator_slistautoptr = o
  extension (v: GFileEnumerator_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GFileIOStream_autoptr = Ptr[GFileIOStream]
object GFileIOStream_autoptr: 
  given _tag: Tag[GFileIOStream_autoptr] = Tag.Ptr[GFileIOStream](GFileIOStream._tag)
  inline def apply(inline o: Ptr[GFileIOStream]): GFileIOStream_autoptr = o
  extension (v: GFileIOStream_autoptr)
    inline def value: Ptr[GFileIOStream] = v

opaque type GFileIOStream_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GFileIOStream_listautoptr: 
  given _tag: Tag[GFileIOStream_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GFileIOStream_listautoptr = o
  extension (v: GFileIOStream_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GFileIOStream_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GFileIOStream_queueautoptr: 
  given _tag: Tag[GFileIOStream_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GFileIOStream_queueautoptr = o
  extension (v: GFileIOStream_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GFileIOStream_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GFileIOStream_slistautoptr: 
  given _tag: Tag[GFileIOStream_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GFileIOStream_slistautoptr = o
  extension (v: GFileIOStream_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GFileIcon_autoptr = Ptr[GFileIcon]
object GFileIcon_autoptr: 
  given _tag: Tag[GFileIcon_autoptr] = Tag.Ptr[GFileIcon](GFileIcon._tag)
  inline def apply(inline o: Ptr[GFileIcon]): GFileIcon_autoptr = o
  extension (v: GFileIcon_autoptr)
    inline def value: Ptr[GFileIcon] = v

opaque type GFileIcon_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GFileIcon_listautoptr: 
  given _tag: Tag[GFileIcon_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GFileIcon_listautoptr = o
  extension (v: GFileIcon_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GFileIcon_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GFileIcon_queueautoptr: 
  given _tag: Tag[GFileIcon_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GFileIcon_queueautoptr = o
  extension (v: GFileIcon_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GFileIcon_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GFileIcon_slistautoptr: 
  given _tag: Tag[GFileIcon_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GFileIcon_slistautoptr = o
  extension (v: GFileIcon_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GFileInfo_autoptr = Ptr[GFileInfo]
object GFileInfo_autoptr: 
  given _tag: Tag[GFileInfo_autoptr] = Tag.Ptr[GFileInfo](GFileInfo._tag)
  inline def apply(inline o: Ptr[GFileInfo]): GFileInfo_autoptr = o
  extension (v: GFileInfo_autoptr)
    inline def value: Ptr[GFileInfo] = v

opaque type GFileInfo_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GFileInfo_listautoptr: 
  given _tag: Tag[GFileInfo_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GFileInfo_listautoptr = o
  extension (v: GFileInfo_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GFileInfo_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GFileInfo_queueautoptr: 
  given _tag: Tag[GFileInfo_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GFileInfo_queueautoptr = o
  extension (v: GFileInfo_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GFileInfo_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GFileInfo_slistautoptr: 
  given _tag: Tag[GFileInfo_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GFileInfo_slistautoptr = o
  extension (v: GFileInfo_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GFileInputStream_autoptr = Ptr[GFileInputStream]
object GFileInputStream_autoptr: 
  given _tag: Tag[GFileInputStream_autoptr] = Tag.Ptr[GFileInputStream](GFileInputStream._tag)
  inline def apply(inline o: Ptr[GFileInputStream]): GFileInputStream_autoptr = o
  extension (v: GFileInputStream_autoptr)
    inline def value: Ptr[GFileInputStream] = v

opaque type GFileInputStream_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GFileInputStream_listautoptr: 
  given _tag: Tag[GFileInputStream_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GFileInputStream_listautoptr = o
  extension (v: GFileInputStream_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GFileInputStream_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GFileInputStream_queueautoptr: 
  given _tag: Tag[GFileInputStream_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GFileInputStream_queueautoptr = o
  extension (v: GFileInputStream_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GFileInputStream_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GFileInputStream_slistautoptr: 
  given _tag: Tag[GFileInputStream_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GFileInputStream_slistautoptr = o
  extension (v: GFileInputStream_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GFileMeasureProgressCallback: : %TRUE if more reports will come _size: the current cumulative size measurement
*/
opaque type GFileMeasureProgressCallback = CFuncPtr5[_root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.gpointer, Unit]
object GFileMeasureProgressCallback: 
  given _tag: Tag[GFileMeasureProgressCallback] = Tag.materializeCFuncPtr5[_root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GFileMeasureProgressCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[_root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.gpointer, Unit]): GFileMeasureProgressCallback = o
  extension (v: GFileMeasureProgressCallback)
    inline def value: CFuncPtr5[_root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GFileMonitor_autoptr = Ptr[GFileMonitor]
object GFileMonitor_autoptr: 
  given _tag: Tag[GFileMonitor_autoptr] = Tag.Ptr[GFileMonitor](GFileMonitor._tag)
  inline def apply(inline o: Ptr[GFileMonitor]): GFileMonitor_autoptr = o
  extension (v: GFileMonitor_autoptr)
    inline def value: Ptr[GFileMonitor] = v

opaque type GFileMonitor_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GFileMonitor_listautoptr: 
  given _tag: Tag[GFileMonitor_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GFileMonitor_listautoptr = o
  extension (v: GFileMonitor_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GFileMonitor_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GFileMonitor_queueautoptr: 
  given _tag: Tag[GFileMonitor_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GFileMonitor_queueautoptr = o
  extension (v: GFileMonitor_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GFileMonitor_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GFileMonitor_slistautoptr: 
  given _tag: Tag[GFileMonitor_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GFileMonitor_slistautoptr = o
  extension (v: GFileMonitor_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GFileOutputStream_autoptr = Ptr[GFileOutputStream]
object GFileOutputStream_autoptr: 
  given _tag: Tag[GFileOutputStream_autoptr] = Tag.Ptr[GFileOutputStream](GFileOutputStream._tag)
  inline def apply(inline o: Ptr[GFileOutputStream]): GFileOutputStream_autoptr = o
  extension (v: GFileOutputStream_autoptr)
    inline def value: Ptr[GFileOutputStream] = v

opaque type GFileOutputStream_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GFileOutputStream_listautoptr: 
  given _tag: Tag[GFileOutputStream_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GFileOutputStream_listautoptr = o
  extension (v: GFileOutputStream_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GFileOutputStream_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GFileOutputStream_queueautoptr: 
  given _tag: Tag[GFileOutputStream_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GFileOutputStream_queueautoptr = o
  extension (v: GFileOutputStream_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GFileOutputStream_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GFileOutputStream_slistautoptr: 
  given _tag: Tag[GFileOutputStream_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GFileOutputStream_slistautoptr = o
  extension (v: GFileOutputStream_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GFileProgressCallback: _num_bytes: the current number of bytes in the operation. _num_bytes: the total number of bytes in the operation.
*/
opaque type GFileProgressCallback = CFuncPtr3[_root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.gpointer, Unit]
object GFileProgressCallback: 
  given _tag: Tag[GFileProgressCallback] = Tag.materializeCFuncPtr3[_root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GFileProgressCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[_root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.gpointer, Unit]): GFileProgressCallback = o
  extension (v: GFileProgressCallback)
    inline def value: CFuncPtr3[_root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * GFileReadMoreCallback:
*/
opaque type GFileReadMoreCallback = CFuncPtr3[CString, _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GFileReadMoreCallback: 
  given _tag: Tag[GFileReadMoreCallback] = Tag.materializeCFuncPtr3[CString, _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GFileReadMoreCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[CString, _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GFileReadMoreCallback = o
  extension (v: GFileReadMoreCallback)
    inline def value: CFuncPtr3[CString, _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GFile_autoptr = Ptr[GFile]
object GFile_autoptr: 
  given _tag: Tag[GFile_autoptr] = Tag.Ptr[GFile](GFile._tag)
  inline def apply(inline o: Ptr[GFile]): GFile_autoptr = o
  extension (v: GFile_autoptr)
    inline def value: Ptr[GFile] = v

opaque type GFile_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GFile_listautoptr: 
  given _tag: Tag[GFile_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GFile_listautoptr = o
  extension (v: GFile_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GFile_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GFile_queueautoptr: 
  given _tag: Tag[GFile_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GFile_queueautoptr = o
  extension (v: GFile_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GFile_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GFile_slistautoptr: 
  given _tag: Tag[GFile_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GFile_slistautoptr = o
  extension (v: GFile_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GFilenameCompleter_autoptr = Ptr[GFilenameCompleter]
object GFilenameCompleter_autoptr: 
  given _tag: Tag[GFilenameCompleter_autoptr] = Tag.Ptr[GFilenameCompleter](GFilenameCompleter._tag)
  inline def apply(inline o: Ptr[GFilenameCompleter]): GFilenameCompleter_autoptr = o
  extension (v: GFilenameCompleter_autoptr)
    inline def value: Ptr[GFilenameCompleter] = v

opaque type GFilenameCompleter_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GFilenameCompleter_listautoptr: 
  given _tag: Tag[GFilenameCompleter_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GFilenameCompleter_listautoptr = o
  extension (v: GFilenameCompleter_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GFilenameCompleter_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GFilenameCompleter_queueautoptr: 
  given _tag: Tag[GFilenameCompleter_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GFilenameCompleter_queueautoptr = o
  extension (v: GFilenameCompleter_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GFilenameCompleter_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GFilenameCompleter_slistautoptr: 
  given _tag: Tag[GFilenameCompleter_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GFilenameCompleter_slistautoptr = o
  extension (v: GFilenameCompleter_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GFilterInputStream_autoptr = Ptr[GFilterInputStream]
object GFilterInputStream_autoptr: 
  given _tag: Tag[GFilterInputStream_autoptr] = Tag.Ptr[GFilterInputStream](GFilterInputStream._tag)
  inline def apply(inline o: Ptr[GFilterInputStream]): GFilterInputStream_autoptr = o
  extension (v: GFilterInputStream_autoptr)
    inline def value: Ptr[GFilterInputStream] = v

opaque type GFilterInputStream_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GFilterInputStream_listautoptr: 
  given _tag: Tag[GFilterInputStream_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GFilterInputStream_listautoptr = o
  extension (v: GFilterInputStream_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GFilterInputStream_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GFilterInputStream_queueautoptr: 
  given _tag: Tag[GFilterInputStream_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GFilterInputStream_queueautoptr = o
  extension (v: GFilterInputStream_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GFilterInputStream_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GFilterInputStream_slistautoptr: 
  given _tag: Tag[GFilterInputStream_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GFilterInputStream_slistautoptr = o
  extension (v: GFilterInputStream_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GFilterOutputStream_autoptr = Ptr[GFilterOutputStream]
object GFilterOutputStream_autoptr: 
  given _tag: Tag[GFilterOutputStream_autoptr] = Tag.Ptr[GFilterOutputStream](GFilterOutputStream._tag)
  inline def apply(inline o: Ptr[GFilterOutputStream]): GFilterOutputStream_autoptr = o
  extension (v: GFilterOutputStream_autoptr)
    inline def value: Ptr[GFilterOutputStream] = v

opaque type GFilterOutputStream_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GFilterOutputStream_listautoptr: 
  given _tag: Tag[GFilterOutputStream_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GFilterOutputStream_listautoptr = o
  extension (v: GFilterOutputStream_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GFilterOutputStream_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GFilterOutputStream_queueautoptr: 
  given _tag: Tag[GFilterOutputStream_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GFilterOutputStream_queueautoptr = o
  extension (v: GFilterOutputStream_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GFilterOutputStream_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GFilterOutputStream_slistautoptr: 
  given _tag: Tag[GFilterOutputStream_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GFilterOutputStream_slistautoptr = o
  extension (v: GFilterOutputStream_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GIOModule_autoptr = Ptr[GIOModule]
object GIOModule_autoptr: 
  given _tag: Tag[GIOModule_autoptr] = Tag.Ptr[GIOModule](GIOModule._tag)
  inline def apply(inline o: Ptr[GIOModule]): GIOModule_autoptr = o
  extension (v: GIOModule_autoptr)
    inline def value: Ptr[GIOModule] = v

opaque type GIOModule_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GIOModule_listautoptr: 
  given _tag: Tag[GIOModule_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GIOModule_listautoptr = o
  extension (v: GIOModule_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GIOModule_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GIOModule_queueautoptr: 
  given _tag: Tag[GIOModule_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GIOModule_queueautoptr = o
  extension (v: GIOModule_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GIOModule_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GIOModule_slistautoptr: 
  given _tag: Tag[GIOModule_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GIOModule_slistautoptr = o
  extension (v: GIOModule_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GIOSchedulerJobFunc: : a #GIOSchedulerJob. : optional #GCancellable object, %NULL to ignore.
*/
opaque type GIOSchedulerJobFunc = CFuncPtr3[Ptr[GIOSchedulerJob], Ptr[GCancellable], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GIOSchedulerJobFunc: 
  given _tag: Tag[GIOSchedulerJobFunc] = Tag.materializeCFuncPtr3[Ptr[GIOSchedulerJob], Ptr[GCancellable], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GIOSchedulerJobFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GIOSchedulerJob], Ptr[GCancellable], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GIOSchedulerJobFunc = o
  extension (v: GIOSchedulerJobFunc)
    inline def value: CFuncPtr3[Ptr[GIOSchedulerJob], Ptr[GCancellable], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GIOStream_autoptr = Ptr[GIOStream]
object GIOStream_autoptr: 
  given _tag: Tag[GIOStream_autoptr] = Tag.Ptr[GIOStream](GIOStream._tag)
  inline def apply(inline o: Ptr[GIOStream]): GIOStream_autoptr = o
  extension (v: GIOStream_autoptr)
    inline def value: Ptr[GIOStream] = v

opaque type GIOStream_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GIOStream_listautoptr: 
  given _tag: Tag[GIOStream_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GIOStream_listautoptr = o
  extension (v: GIOStream_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GIOStream_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GIOStream_queueautoptr: 
  given _tag: Tag[GIOStream_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GIOStream_queueautoptr = o
  extension (v: GIOStream_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GIOStream_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GIOStream_slistautoptr: 
  given _tag: Tag[GIOStream_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GIOStream_slistautoptr = o
  extension (v: GIOStream_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GIcon_autoptr = Ptr[GIcon]
object GIcon_autoptr: 
  given _tag: Tag[GIcon_autoptr] = Tag.Ptr[GIcon](GIcon._tag)
  inline def apply(inline o: Ptr[GIcon]): GIcon_autoptr = o
  extension (v: GIcon_autoptr)
    inline def value: Ptr[GIcon] = v

opaque type GIcon_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GIcon_listautoptr: 
  given _tag: Tag[GIcon_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GIcon_listautoptr = o
  extension (v: GIcon_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GIcon_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GIcon_queueautoptr: 
  given _tag: Tag[GIcon_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GIcon_queueautoptr = o
  extension (v: GIcon_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GIcon_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GIcon_slistautoptr: 
  given _tag: Tag[GIcon_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GIcon_slistautoptr = o
  extension (v: GIcon_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GInetAddressMask_autoptr = Ptr[GInetAddressMask]
object GInetAddressMask_autoptr: 
  given _tag: Tag[GInetAddressMask_autoptr] = Tag.Ptr[GInetAddressMask](GInetAddressMask._tag)
  inline def apply(inline o: Ptr[GInetAddressMask]): GInetAddressMask_autoptr = o
  extension (v: GInetAddressMask_autoptr)
    inline def value: Ptr[GInetAddressMask] = v

opaque type GInetAddressMask_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GInetAddressMask_listautoptr: 
  given _tag: Tag[GInetAddressMask_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GInetAddressMask_listautoptr = o
  extension (v: GInetAddressMask_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GInetAddressMask_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GInetAddressMask_queueautoptr: 
  given _tag: Tag[GInetAddressMask_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GInetAddressMask_queueautoptr = o
  extension (v: GInetAddressMask_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GInetAddressMask_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GInetAddressMask_slistautoptr: 
  given _tag: Tag[GInetAddressMask_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GInetAddressMask_slistautoptr = o
  extension (v: GInetAddressMask_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GInetAddress_autoptr = Ptr[GInetAddress]
object GInetAddress_autoptr: 
  given _tag: Tag[GInetAddress_autoptr] = Tag.Ptr[GInetAddress](GInetAddress._tag)
  inline def apply(inline o: Ptr[GInetAddress]): GInetAddress_autoptr = o
  extension (v: GInetAddress_autoptr)
    inline def value: Ptr[GInetAddress] = v

opaque type GInetAddress_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GInetAddress_listautoptr: 
  given _tag: Tag[GInetAddress_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GInetAddress_listautoptr = o
  extension (v: GInetAddress_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GInetAddress_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GInetAddress_queueautoptr: 
  given _tag: Tag[GInetAddress_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GInetAddress_queueautoptr = o
  extension (v: GInetAddress_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GInetAddress_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GInetAddress_slistautoptr: 
  given _tag: Tag[GInetAddress_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GInetAddress_slistautoptr = o
  extension (v: GInetAddress_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GInetSocketAddress_autoptr = Ptr[GInetSocketAddress]
object GInetSocketAddress_autoptr: 
  given _tag: Tag[GInetSocketAddress_autoptr] = Tag.Ptr[GInetSocketAddress](GInetSocketAddress._tag)
  inline def apply(inline o: Ptr[GInetSocketAddress]): GInetSocketAddress_autoptr = o
  extension (v: GInetSocketAddress_autoptr)
    inline def value: Ptr[GInetSocketAddress] = v

opaque type GInetSocketAddress_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GInetSocketAddress_listautoptr: 
  given _tag: Tag[GInetSocketAddress_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GInetSocketAddress_listautoptr = o
  extension (v: GInetSocketAddress_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GInetSocketAddress_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GInetSocketAddress_queueautoptr: 
  given _tag: Tag[GInetSocketAddress_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GInetSocketAddress_queueautoptr = o
  extension (v: GInetSocketAddress_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GInetSocketAddress_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GInetSocketAddress_slistautoptr: 
  given _tag: Tag[GInetSocketAddress_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GInetSocketAddress_slistautoptr = o
  extension (v: GInetSocketAddress_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GInitable_autoptr = Ptr[GInitable]
object GInitable_autoptr: 
  given _tag: Tag[GInitable_autoptr] = Tag.Ptr[GInitable](GInitable._tag)
  inline def apply(inline o: Ptr[GInitable]): GInitable_autoptr = o
  extension (v: GInitable_autoptr)
    inline def value: Ptr[GInitable] = v

opaque type GInitable_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GInitable_listautoptr: 
  given _tag: Tag[GInitable_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GInitable_listautoptr = o
  extension (v: GInitable_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GInitable_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GInitable_queueautoptr: 
  given _tag: Tag[GInitable_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GInitable_queueautoptr = o
  extension (v: GInitable_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GInitable_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GInitable_slistautoptr: 
  given _tag: Tag[GInitable_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GInitable_slistautoptr = o
  extension (v: GInitable_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GInputStream_autoptr = Ptr[GInputStream]
object GInputStream_autoptr: 
  given _tag: Tag[GInputStream_autoptr] = Tag.Ptr[GInputStream](GInputStream._tag)
  inline def apply(inline o: Ptr[GInputStream]): GInputStream_autoptr = o
  extension (v: GInputStream_autoptr)
    inline def value: Ptr[GInputStream] = v

opaque type GInputStream_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GInputStream_listautoptr: 
  given _tag: Tag[GInputStream_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GInputStream_listautoptr = o
  extension (v: GInputStream_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GInputStream_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GInputStream_queueautoptr: 
  given _tag: Tag[GInputStream_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GInputStream_queueautoptr = o
  extension (v: GInputStream_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GInputStream_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GInputStream_slistautoptr: 
  given _tag: Tag[GInputStream_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GInputStream_slistautoptr = o
  extension (v: GInputStream_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GListModel_autoptr = Ptr[GListModel]
object GListModel_autoptr: 
  given _tag: Tag[GListModel_autoptr] = Tag.Ptr[GListModel](GListModel._tag)
  inline def apply(inline o: Ptr[GListModel]): GListModel_autoptr = o
  extension (v: GListModel_autoptr)
    inline def value: Ptr[GListModel] = v

opaque type GListModel_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GListModel_listautoptr: 
  given _tag: Tag[GListModel_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GListModel_listautoptr = o
  extension (v: GListModel_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GListModel_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GListModel_queueautoptr: 
  given _tag: Tag[GListModel_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GListModel_queueautoptr = o
  extension (v: GListModel_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GListModel_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GListModel_slistautoptr: 
  given _tag: Tag[GListModel_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GListModel_slistautoptr = o
  extension (v: GListModel_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GListStoreClass_autoptr = Ptr[GListStoreClass]
object GListStoreClass_autoptr: 
  given _tag: Tag[GListStoreClass_autoptr] = Tag.Ptr[GListStoreClass](GListStoreClass._tag)
  inline def apply(inline o: Ptr[GListStoreClass]): GListStoreClass_autoptr = o
  extension (v: GListStoreClass_autoptr)
    inline def value: Ptr[GListStoreClass] = v

opaque type GListStoreClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GListStoreClass_listautoptr: 
  given _tag: Tag[GListStoreClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GListStoreClass_listautoptr = o
  extension (v: GListStoreClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GListStoreClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GListStoreClass_queueautoptr: 
  given _tag: Tag[GListStoreClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GListStoreClass_queueautoptr = o
  extension (v: GListStoreClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GListStoreClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GListStoreClass_slistautoptr: 
  given _tag: Tag[GListStoreClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GListStoreClass_slistautoptr = o
  extension (v: GListStoreClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GListStore_autoptr = Ptr[GListStore]
object GListStore_autoptr: 
  given _tag: Tag[GListStore_autoptr] = Tag.Ptr[GListStore](GListStore._tag)
  inline def apply(inline o: Ptr[GListStore]): GListStore_autoptr = o
  extension (v: GListStore_autoptr)
    inline def value: Ptr[GListStore] = v

opaque type GListStore_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GListStore_listautoptr: 
  given _tag: Tag[GListStore_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GListStore_listautoptr = o
  extension (v: GListStore_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GListStore_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GListStore_queueautoptr: 
  given _tag: Tag[GListStore_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GListStore_queueautoptr = o
  extension (v: GListStore_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GListStore_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GListStore_slistautoptr: 
  given _tag: Tag[GListStore_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GListStore_slistautoptr = o
  extension (v: GListStore_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GLoadableIcon_autoptr = Ptr[GLoadableIcon]
object GLoadableIcon_autoptr: 
  given _tag: Tag[GLoadableIcon_autoptr] = Tag.Ptr[GLoadableIcon](GLoadableIcon._tag)
  inline def apply(inline o: Ptr[GLoadableIcon]): GLoadableIcon_autoptr = o
  extension (v: GLoadableIcon_autoptr)
    inline def value: Ptr[GLoadableIcon] = v

opaque type GLoadableIcon_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GLoadableIcon_listautoptr: 
  given _tag: Tag[GLoadableIcon_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GLoadableIcon_listautoptr = o
  extension (v: GLoadableIcon_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GLoadableIcon_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GLoadableIcon_queueautoptr: 
  given _tag: Tag[GLoadableIcon_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GLoadableIcon_queueautoptr = o
  extension (v: GLoadableIcon_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GLoadableIcon_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GLoadableIcon_slistautoptr: 
  given _tag: Tag[GLoadableIcon_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GLoadableIcon_slistautoptr = o
  extension (v: GLoadableIcon_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GMemoryInputStream_autoptr = Ptr[GMemoryInputStream]
object GMemoryInputStream_autoptr: 
  given _tag: Tag[GMemoryInputStream_autoptr] = Tag.Ptr[GMemoryInputStream](GMemoryInputStream._tag)
  inline def apply(inline o: Ptr[GMemoryInputStream]): GMemoryInputStream_autoptr = o
  extension (v: GMemoryInputStream_autoptr)
    inline def value: Ptr[GMemoryInputStream] = v

opaque type GMemoryInputStream_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GMemoryInputStream_listautoptr: 
  given _tag: Tag[GMemoryInputStream_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GMemoryInputStream_listautoptr = o
  extension (v: GMemoryInputStream_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GMemoryInputStream_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GMemoryInputStream_queueautoptr: 
  given _tag: Tag[GMemoryInputStream_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GMemoryInputStream_queueautoptr = o
  extension (v: GMemoryInputStream_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GMemoryInputStream_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GMemoryInputStream_slistautoptr: 
  given _tag: Tag[GMemoryInputStream_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GMemoryInputStream_slistautoptr = o
  extension (v: GMemoryInputStream_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GMemoryMonitor_autoptr = Ptr[GMemoryMonitor]
object GMemoryMonitor_autoptr: 
  given _tag: Tag[GMemoryMonitor_autoptr] = Tag.Ptr[GMemoryMonitor](GMemoryMonitor._tag)
  inline def apply(inline o: Ptr[GMemoryMonitor]): GMemoryMonitor_autoptr = o
  extension (v: GMemoryMonitor_autoptr)
    inline def value: Ptr[GMemoryMonitor] = v

opaque type GMemoryMonitor_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GMemoryMonitor_listautoptr: 
  given _tag: Tag[GMemoryMonitor_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GMemoryMonitor_listautoptr = o
  extension (v: GMemoryMonitor_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GMemoryMonitor_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GMemoryMonitor_queueautoptr: 
  given _tag: Tag[GMemoryMonitor_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GMemoryMonitor_queueautoptr = o
  extension (v: GMemoryMonitor_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GMemoryMonitor_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GMemoryMonitor_slistautoptr: 
  given _tag: Tag[GMemoryMonitor_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GMemoryMonitor_slistautoptr = o
  extension (v: GMemoryMonitor_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GMemoryOutputStream_autoptr = Ptr[GMemoryOutputStream]
object GMemoryOutputStream_autoptr: 
  given _tag: Tag[GMemoryOutputStream_autoptr] = Tag.Ptr[GMemoryOutputStream](GMemoryOutputStream._tag)
  inline def apply(inline o: Ptr[GMemoryOutputStream]): GMemoryOutputStream_autoptr = o
  extension (v: GMemoryOutputStream_autoptr)
    inline def value: Ptr[GMemoryOutputStream] = v

opaque type GMemoryOutputStream_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GMemoryOutputStream_listautoptr: 
  given _tag: Tag[GMemoryOutputStream_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GMemoryOutputStream_listautoptr = o
  extension (v: GMemoryOutputStream_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GMemoryOutputStream_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GMemoryOutputStream_queueautoptr: 
  given _tag: Tag[GMemoryOutputStream_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GMemoryOutputStream_queueautoptr = o
  extension (v: GMemoryOutputStream_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GMemoryOutputStream_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GMemoryOutputStream_slistautoptr: 
  given _tag: Tag[GMemoryOutputStream_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GMemoryOutputStream_slistautoptr = o
  extension (v: GMemoryOutputStream_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GMenuAttributeIter_autoptr = Ptr[GMenuAttributeIter]
object GMenuAttributeIter_autoptr: 
  given _tag: Tag[GMenuAttributeIter_autoptr] = Tag.Ptr[GMenuAttributeIter](GMenuAttributeIter._tag)
  inline def apply(inline o: Ptr[GMenuAttributeIter]): GMenuAttributeIter_autoptr = o
  extension (v: GMenuAttributeIter_autoptr)
    inline def value: Ptr[GMenuAttributeIter] = v

opaque type GMenuAttributeIter_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GMenuAttributeIter_listautoptr: 
  given _tag: Tag[GMenuAttributeIter_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GMenuAttributeIter_listautoptr = o
  extension (v: GMenuAttributeIter_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GMenuAttributeIter_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GMenuAttributeIter_queueautoptr: 
  given _tag: Tag[GMenuAttributeIter_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GMenuAttributeIter_queueautoptr = o
  extension (v: GMenuAttributeIter_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GMenuAttributeIter_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GMenuAttributeIter_slistautoptr: 
  given _tag: Tag[GMenuAttributeIter_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GMenuAttributeIter_slistautoptr = o
  extension (v: GMenuAttributeIter_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GMenuItem_autoptr = Ptr[GMenuItem]
object GMenuItem_autoptr: 
  given _tag: Tag[GMenuItem_autoptr] = Tag.Ptr[GMenuItem](GMenuItem._tag)
  inline def apply(inline o: Ptr[GMenuItem]): GMenuItem_autoptr = o
  extension (v: GMenuItem_autoptr)
    inline def value: Ptr[GMenuItem] = v

opaque type GMenuItem_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GMenuItem_listautoptr: 
  given _tag: Tag[GMenuItem_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GMenuItem_listautoptr = o
  extension (v: GMenuItem_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GMenuItem_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GMenuItem_queueautoptr: 
  given _tag: Tag[GMenuItem_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GMenuItem_queueautoptr = o
  extension (v: GMenuItem_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GMenuItem_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GMenuItem_slistautoptr: 
  given _tag: Tag[GMenuItem_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GMenuItem_slistautoptr = o
  extension (v: GMenuItem_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GMenuLinkIter_autoptr = Ptr[GMenuLinkIter]
object GMenuLinkIter_autoptr: 
  given _tag: Tag[GMenuLinkIter_autoptr] = Tag.Ptr[GMenuLinkIter](GMenuLinkIter._tag)
  inline def apply(inline o: Ptr[GMenuLinkIter]): GMenuLinkIter_autoptr = o
  extension (v: GMenuLinkIter_autoptr)
    inline def value: Ptr[GMenuLinkIter] = v

opaque type GMenuLinkIter_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GMenuLinkIter_listautoptr: 
  given _tag: Tag[GMenuLinkIter_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GMenuLinkIter_listautoptr = o
  extension (v: GMenuLinkIter_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GMenuLinkIter_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GMenuLinkIter_queueautoptr: 
  given _tag: Tag[GMenuLinkIter_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GMenuLinkIter_queueautoptr = o
  extension (v: GMenuLinkIter_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GMenuLinkIter_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GMenuLinkIter_slistautoptr: 
  given _tag: Tag[GMenuLinkIter_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GMenuLinkIter_slistautoptr = o
  extension (v: GMenuLinkIter_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GMenuModel_autoptr = Ptr[GMenuModel]
object GMenuModel_autoptr: 
  given _tag: Tag[GMenuModel_autoptr] = Tag.Ptr[GMenuModel](GMenuModel._tag)
  inline def apply(inline o: Ptr[GMenuModel]): GMenuModel_autoptr = o
  extension (v: GMenuModel_autoptr)
    inline def value: Ptr[GMenuModel] = v

opaque type GMenuModel_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GMenuModel_listautoptr: 
  given _tag: Tag[GMenuModel_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GMenuModel_listautoptr = o
  extension (v: GMenuModel_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GMenuModel_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GMenuModel_queueautoptr: 
  given _tag: Tag[GMenuModel_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GMenuModel_queueautoptr = o
  extension (v: GMenuModel_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GMenuModel_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GMenuModel_slistautoptr: 
  given _tag: Tag[GMenuModel_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GMenuModel_slistautoptr = o
  extension (v: GMenuModel_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GMenu_autoptr = Ptr[GMenu]
object GMenu_autoptr: 
  given _tag: Tag[GMenu_autoptr] = Tag.Ptr[GMenu](GMenu._tag)
  inline def apply(inline o: Ptr[GMenu]): GMenu_autoptr = o
  extension (v: GMenu_autoptr)
    inline def value: Ptr[GMenu] = v

opaque type GMenu_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GMenu_listautoptr: 
  given _tag: Tag[GMenu_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GMenu_listautoptr = o
  extension (v: GMenu_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GMenu_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GMenu_queueautoptr: 
  given _tag: Tag[GMenu_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GMenu_queueautoptr = o
  extension (v: GMenu_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GMenu_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GMenu_slistautoptr: 
  given _tag: Tag[GMenu_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GMenu_slistautoptr = o
  extension (v: GMenu_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GMountOperation_autoptr = Ptr[GMountOperation]
object GMountOperation_autoptr: 
  given _tag: Tag[GMountOperation_autoptr] = Tag.Ptr[GMountOperation](GMountOperation._tag)
  inline def apply(inline o: Ptr[GMountOperation]): GMountOperation_autoptr = o
  extension (v: GMountOperation_autoptr)
    inline def value: Ptr[GMountOperation] = v

opaque type GMountOperation_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GMountOperation_listautoptr: 
  given _tag: Tag[GMountOperation_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GMountOperation_listautoptr = o
  extension (v: GMountOperation_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GMountOperation_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GMountOperation_queueautoptr: 
  given _tag: Tag[GMountOperation_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GMountOperation_queueautoptr = o
  extension (v: GMountOperation_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GMountOperation_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GMountOperation_slistautoptr: 
  given _tag: Tag[GMountOperation_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GMountOperation_slistautoptr = o
  extension (v: GMountOperation_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GMount_autoptr = Ptr[GMount]
object GMount_autoptr: 
  given _tag: Tag[GMount_autoptr] = Tag.Ptr[GMount](GMount._tag)
  inline def apply(inline o: Ptr[GMount]): GMount_autoptr = o
  extension (v: GMount_autoptr)
    inline def value: Ptr[GMount] = v

opaque type GMount_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GMount_listautoptr: 
  given _tag: Tag[GMount_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GMount_listautoptr = o
  extension (v: GMount_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GMount_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GMount_queueautoptr: 
  given _tag: Tag[GMount_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GMount_queueautoptr = o
  extension (v: GMount_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GMount_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GMount_slistautoptr: 
  given _tag: Tag[GMount_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GMount_slistautoptr = o
  extension (v: GMount_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GNativeVolumeMonitor_autoptr = Ptr[GNativeVolumeMonitor]
object GNativeVolumeMonitor_autoptr: 
  given _tag: Tag[GNativeVolumeMonitor_autoptr] = Tag.Ptr[GNativeVolumeMonitor](GNativeVolumeMonitor._tag)
  inline def apply(inline o: Ptr[GNativeVolumeMonitor]): GNativeVolumeMonitor_autoptr = o
  extension (v: GNativeVolumeMonitor_autoptr)
    inline def value: Ptr[GNativeVolumeMonitor] = v

opaque type GNativeVolumeMonitor_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GNativeVolumeMonitor_listautoptr: 
  given _tag: Tag[GNativeVolumeMonitor_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GNativeVolumeMonitor_listautoptr = o
  extension (v: GNativeVolumeMonitor_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GNativeVolumeMonitor_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GNativeVolumeMonitor_queueautoptr: 
  given _tag: Tag[GNativeVolumeMonitor_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GNativeVolumeMonitor_queueautoptr = o
  extension (v: GNativeVolumeMonitor_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GNativeVolumeMonitor_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GNativeVolumeMonitor_slistautoptr: 
  given _tag: Tag[GNativeVolumeMonitor_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GNativeVolumeMonitor_slistautoptr = o
  extension (v: GNativeVolumeMonitor_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GNetworkAddress_autoptr = Ptr[GNetworkAddress]
object GNetworkAddress_autoptr: 
  given _tag: Tag[GNetworkAddress_autoptr] = Tag.Ptr[GNetworkAddress](GNetworkAddress._tag)
  inline def apply(inline o: Ptr[GNetworkAddress]): GNetworkAddress_autoptr = o
  extension (v: GNetworkAddress_autoptr)
    inline def value: Ptr[GNetworkAddress] = v

opaque type GNetworkAddress_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GNetworkAddress_listautoptr: 
  given _tag: Tag[GNetworkAddress_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GNetworkAddress_listautoptr = o
  extension (v: GNetworkAddress_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GNetworkAddress_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GNetworkAddress_queueautoptr: 
  given _tag: Tag[GNetworkAddress_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GNetworkAddress_queueautoptr = o
  extension (v: GNetworkAddress_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GNetworkAddress_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GNetworkAddress_slistautoptr: 
  given _tag: Tag[GNetworkAddress_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GNetworkAddress_slistautoptr = o
  extension (v: GNetworkAddress_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GNetworkMonitor_autoptr = Ptr[GNetworkMonitor]
object GNetworkMonitor_autoptr: 
  given _tag: Tag[GNetworkMonitor_autoptr] = Tag.Ptr[GNetworkMonitor](GNetworkMonitor._tag)
  inline def apply(inline o: Ptr[GNetworkMonitor]): GNetworkMonitor_autoptr = o
  extension (v: GNetworkMonitor_autoptr)
    inline def value: Ptr[GNetworkMonitor] = v

opaque type GNetworkMonitor_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GNetworkMonitor_listautoptr: 
  given _tag: Tag[GNetworkMonitor_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GNetworkMonitor_listautoptr = o
  extension (v: GNetworkMonitor_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GNetworkMonitor_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GNetworkMonitor_queueautoptr: 
  given _tag: Tag[GNetworkMonitor_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GNetworkMonitor_queueautoptr = o
  extension (v: GNetworkMonitor_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GNetworkMonitor_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GNetworkMonitor_slistautoptr: 
  given _tag: Tag[GNetworkMonitor_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GNetworkMonitor_slistautoptr = o
  extension (v: GNetworkMonitor_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GNetworkService_autoptr = Ptr[GNetworkService]
object GNetworkService_autoptr: 
  given _tag: Tag[GNetworkService_autoptr] = Tag.Ptr[GNetworkService](GNetworkService._tag)
  inline def apply(inline o: Ptr[GNetworkService]): GNetworkService_autoptr = o
  extension (v: GNetworkService_autoptr)
    inline def value: Ptr[GNetworkService] = v

opaque type GNetworkService_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GNetworkService_listautoptr: 
  given _tag: Tag[GNetworkService_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GNetworkService_listautoptr = o
  extension (v: GNetworkService_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GNetworkService_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GNetworkService_queueautoptr: 
  given _tag: Tag[GNetworkService_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GNetworkService_queueautoptr = o
  extension (v: GNetworkService_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GNetworkService_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GNetworkService_slistautoptr: 
  given _tag: Tag[GNetworkService_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GNetworkService_slistautoptr = o
  extension (v: GNetworkService_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GNotification_autoptr = Ptr[GNotification]
object GNotification_autoptr: 
  given _tag: Tag[GNotification_autoptr] = Tag.Ptr[GNotification](GNotification._tag)
  inline def apply(inline o: Ptr[GNotification]): GNotification_autoptr = o
  extension (v: GNotification_autoptr)
    inline def value: Ptr[GNotification] = v

opaque type GNotification_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GNotification_listautoptr: 
  given _tag: Tag[GNotification_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GNotification_listautoptr = o
  extension (v: GNotification_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GNotification_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GNotification_queueautoptr: 
  given _tag: Tag[GNotification_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GNotification_queueautoptr = o
  extension (v: GNotification_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GNotification_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GNotification_slistautoptr: 
  given _tag: Tag[GNotification_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GNotification_slistautoptr = o
  extension (v: GNotification_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GOutputStream_autoptr = Ptr[GOutputStream]
object GOutputStream_autoptr: 
  given _tag: Tag[GOutputStream_autoptr] = Tag.Ptr[GOutputStream](GOutputStream._tag)
  inline def apply(inline o: Ptr[GOutputStream]): GOutputStream_autoptr = o
  extension (v: GOutputStream_autoptr)
    inline def value: Ptr[GOutputStream] = v

opaque type GOutputStream_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GOutputStream_listautoptr: 
  given _tag: Tag[GOutputStream_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GOutputStream_listautoptr = o
  extension (v: GOutputStream_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GOutputStream_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GOutputStream_queueautoptr: 
  given _tag: Tag[GOutputStream_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GOutputStream_queueautoptr = o
  extension (v: GOutputStream_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GOutputStream_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GOutputStream_slistautoptr: 
  given _tag: Tag[GOutputStream_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GOutputStream_slistautoptr = o
  extension (v: GOutputStream_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GPermission_autoptr = Ptr[GPermission]
object GPermission_autoptr: 
  given _tag: Tag[GPermission_autoptr] = Tag.Ptr[GPermission](GPermission._tag)
  inline def apply(inline o: Ptr[GPermission]): GPermission_autoptr = o
  extension (v: GPermission_autoptr)
    inline def value: Ptr[GPermission] = v

opaque type GPermission_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GPermission_listautoptr: 
  given _tag: Tag[GPermission_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GPermission_listautoptr = o
  extension (v: GPermission_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GPermission_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GPermission_queueautoptr: 
  given _tag: Tag[GPermission_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GPermission_queueautoptr = o
  extension (v: GPermission_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GPermission_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GPermission_slistautoptr: 
  given _tag: Tag[GPermission_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GPermission_slistautoptr = o
  extension (v: GPermission_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GPollableInputStream_autoptr = Ptr[GPollableInputStream]
object GPollableInputStream_autoptr: 
  given _tag: Tag[GPollableInputStream_autoptr] = Tag.Ptr[GPollableInputStream](GPollableInputStream._tag)
  inline def apply(inline o: Ptr[GPollableInputStream]): GPollableInputStream_autoptr = o
  extension (v: GPollableInputStream_autoptr)
    inline def value: Ptr[GPollableInputStream] = v

opaque type GPollableInputStream_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GPollableInputStream_listautoptr: 
  given _tag: Tag[GPollableInputStream_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GPollableInputStream_listautoptr = o
  extension (v: GPollableInputStream_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GPollableInputStream_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GPollableInputStream_queueautoptr: 
  given _tag: Tag[GPollableInputStream_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GPollableInputStream_queueautoptr = o
  extension (v: GPollableInputStream_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GPollableInputStream_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GPollableInputStream_slistautoptr: 
  given _tag: Tag[GPollableInputStream_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GPollableInputStream_slistautoptr = o
  extension (v: GPollableInputStream_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GPollableOutputStream_autoptr = Ptr[GPollableOutputStream]
object GPollableOutputStream_autoptr: 
  given _tag: Tag[GPollableOutputStream_autoptr] = Tag.Ptr[GPollableOutputStream](GPollableOutputStream._tag)
  inline def apply(inline o: Ptr[GPollableOutputStream]): GPollableOutputStream_autoptr = o
  extension (v: GPollableOutputStream_autoptr)
    inline def value: Ptr[GPollableOutputStream] = v

opaque type GPollableOutputStream_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GPollableOutputStream_listautoptr: 
  given _tag: Tag[GPollableOutputStream_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GPollableOutputStream_listautoptr = o
  extension (v: GPollableOutputStream_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GPollableOutputStream_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GPollableOutputStream_queueautoptr: 
  given _tag: Tag[GPollableOutputStream_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GPollableOutputStream_queueautoptr = o
  extension (v: GPollableOutputStream_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GPollableOutputStream_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GPollableOutputStream_slistautoptr: 
  given _tag: Tag[GPollableOutputStream_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GPollableOutputStream_slistautoptr = o
  extension (v: GPollableOutputStream_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GPollableSourceFunc: _stream: the #GPollableInputStream or #GPollableOutputStream
*/
opaque type GPollableSourceFunc = CFuncPtr2[Ptr[_root_.sn.gnome.gobject.internal.GObject], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GPollableSourceFunc: 
  given _tag: Tag[GPollableSourceFunc] = Tag.materializeCFuncPtr2[Ptr[_root_.sn.gnome.gobject.internal.GObject], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GPollableSourceFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[_root_.sn.gnome.gobject.internal.GObject], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GPollableSourceFunc = o
  extension (v: GPollableSourceFunc)
    inline def value: CFuncPtr2[Ptr[_root_.sn.gnome.gobject.internal.GObject], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GPowerProfileMonitor_autoptr = Ptr[GPowerProfileMonitor]
object GPowerProfileMonitor_autoptr: 
  given _tag: Tag[GPowerProfileMonitor_autoptr] = Tag.Ptr[GPowerProfileMonitor](GPowerProfileMonitor._tag)
  inline def apply(inline o: Ptr[GPowerProfileMonitor]): GPowerProfileMonitor_autoptr = o
  extension (v: GPowerProfileMonitor_autoptr)
    inline def value: Ptr[GPowerProfileMonitor] = v

opaque type GPowerProfileMonitor_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GPowerProfileMonitor_listautoptr: 
  given _tag: Tag[GPowerProfileMonitor_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GPowerProfileMonitor_listautoptr = o
  extension (v: GPowerProfileMonitor_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GPowerProfileMonitor_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GPowerProfileMonitor_queueautoptr: 
  given _tag: Tag[GPowerProfileMonitor_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GPowerProfileMonitor_queueautoptr = o
  extension (v: GPowerProfileMonitor_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GPowerProfileMonitor_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GPowerProfileMonitor_slistautoptr: 
  given _tag: Tag[GPowerProfileMonitor_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GPowerProfileMonitor_slistautoptr = o
  extension (v: GPowerProfileMonitor_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GPropertyAction_autoptr = Ptr[GPropertyAction]
object GPropertyAction_autoptr: 
  given _tag: Tag[GPropertyAction_autoptr] = Tag.Ptr[GPropertyAction](GPropertyAction._tag)
  inline def apply(inline o: Ptr[GPropertyAction]): GPropertyAction_autoptr = o
  extension (v: GPropertyAction_autoptr)
    inline def value: Ptr[GPropertyAction] = v

opaque type GPropertyAction_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GPropertyAction_listautoptr: 
  given _tag: Tag[GPropertyAction_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GPropertyAction_listautoptr = o
  extension (v: GPropertyAction_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GPropertyAction_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GPropertyAction_queueautoptr: 
  given _tag: Tag[GPropertyAction_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GPropertyAction_queueautoptr = o
  extension (v: GPropertyAction_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GPropertyAction_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GPropertyAction_slistautoptr: 
  given _tag: Tag[GPropertyAction_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GPropertyAction_slistautoptr = o
  extension (v: GPropertyAction_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GProxyAddressEnumerator_autoptr = Ptr[GProxyAddressEnumerator]
object GProxyAddressEnumerator_autoptr: 
  given _tag: Tag[GProxyAddressEnumerator_autoptr] = Tag.Ptr[GProxyAddressEnumerator](GProxyAddressEnumerator._tag)
  inline def apply(inline o: Ptr[GProxyAddressEnumerator]): GProxyAddressEnumerator_autoptr = o
  extension (v: GProxyAddressEnumerator_autoptr)
    inline def value: Ptr[GProxyAddressEnumerator] = v

opaque type GProxyAddressEnumerator_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GProxyAddressEnumerator_listautoptr: 
  given _tag: Tag[GProxyAddressEnumerator_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GProxyAddressEnumerator_listautoptr = o
  extension (v: GProxyAddressEnumerator_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GProxyAddressEnumerator_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GProxyAddressEnumerator_queueautoptr: 
  given _tag: Tag[GProxyAddressEnumerator_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GProxyAddressEnumerator_queueautoptr = o
  extension (v: GProxyAddressEnumerator_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GProxyAddressEnumerator_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GProxyAddressEnumerator_slistautoptr: 
  given _tag: Tag[GProxyAddressEnumerator_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GProxyAddressEnumerator_slistautoptr = o
  extension (v: GProxyAddressEnumerator_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GProxyAddress_autoptr = Ptr[GProxyAddress]
object GProxyAddress_autoptr: 
  given _tag: Tag[GProxyAddress_autoptr] = Tag.Ptr[GProxyAddress](GProxyAddress._tag)
  inline def apply(inline o: Ptr[GProxyAddress]): GProxyAddress_autoptr = o
  extension (v: GProxyAddress_autoptr)
    inline def value: Ptr[GProxyAddress] = v

opaque type GProxyAddress_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GProxyAddress_listautoptr: 
  given _tag: Tag[GProxyAddress_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GProxyAddress_listautoptr = o
  extension (v: GProxyAddress_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GProxyAddress_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GProxyAddress_queueautoptr: 
  given _tag: Tag[GProxyAddress_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GProxyAddress_queueautoptr = o
  extension (v: GProxyAddress_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GProxyAddress_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GProxyAddress_slistautoptr: 
  given _tag: Tag[GProxyAddress_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GProxyAddress_slistautoptr = o
  extension (v: GProxyAddress_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GProxyResolver_autoptr = Ptr[GProxyResolver]
object GProxyResolver_autoptr: 
  given _tag: Tag[GProxyResolver_autoptr] = Tag.Ptr[GProxyResolver](GProxyResolver._tag)
  inline def apply(inline o: Ptr[GProxyResolver]): GProxyResolver_autoptr = o
  extension (v: GProxyResolver_autoptr)
    inline def value: Ptr[GProxyResolver] = v

opaque type GProxyResolver_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GProxyResolver_listautoptr: 
  given _tag: Tag[GProxyResolver_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GProxyResolver_listautoptr = o
  extension (v: GProxyResolver_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GProxyResolver_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GProxyResolver_queueautoptr: 
  given _tag: Tag[GProxyResolver_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GProxyResolver_queueautoptr = o
  extension (v: GProxyResolver_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GProxyResolver_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GProxyResolver_slistautoptr: 
  given _tag: Tag[GProxyResolver_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GProxyResolver_slistautoptr = o
  extension (v: GProxyResolver_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GProxy_autoptr = Ptr[GProxy]
object GProxy_autoptr: 
  given _tag: Tag[GProxy_autoptr] = Tag.Ptr[GProxy](GProxy._tag)
  inline def apply(inline o: Ptr[GProxy]): GProxy_autoptr = o
  extension (v: GProxy_autoptr)
    inline def value: Ptr[GProxy] = v

opaque type GProxy_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GProxy_listautoptr: 
  given _tag: Tag[GProxy_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GProxy_listautoptr = o
  extension (v: GProxy_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GProxy_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GProxy_queueautoptr: 
  given _tag: Tag[GProxy_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GProxy_queueautoptr = o
  extension (v: GProxy_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GProxy_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GProxy_slistautoptr: 
  given _tag: Tag[GProxy_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GProxy_slistautoptr = o
  extension (v: GProxy_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GReallocFunc:
*/
opaque type GReallocFunc = CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gpointer]
object GReallocFunc: 
  given _tag: Tag[GReallocFunc] = Tag.materializeCFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gpointer]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GReallocFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gpointer]): GReallocFunc = o
  extension (v: GReallocFunc)
    inline def value: CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gpointer] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GRemoteActionGroup_autoptr = Ptr[GRemoteActionGroup]
object GRemoteActionGroup_autoptr: 
  given _tag: Tag[GRemoteActionGroup_autoptr] = Tag.Ptr[GRemoteActionGroup](GRemoteActionGroup._tag)
  inline def apply(inline o: Ptr[GRemoteActionGroup]): GRemoteActionGroup_autoptr = o
  extension (v: GRemoteActionGroup_autoptr)
    inline def value: Ptr[GRemoteActionGroup] = v

opaque type GRemoteActionGroup_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GRemoteActionGroup_listautoptr: 
  given _tag: Tag[GRemoteActionGroup_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GRemoteActionGroup_listautoptr = o
  extension (v: GRemoteActionGroup_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GRemoteActionGroup_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GRemoteActionGroup_queueautoptr: 
  given _tag: Tag[GRemoteActionGroup_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GRemoteActionGroup_queueautoptr = o
  extension (v: GRemoteActionGroup_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GRemoteActionGroup_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GRemoteActionGroup_slistautoptr: 
  given _tag: Tag[GRemoteActionGroup_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GRemoteActionGroup_slistautoptr = o
  extension (v: GRemoteActionGroup_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GResolver_autoptr = Ptr[GResolver]
object GResolver_autoptr: 
  given _tag: Tag[GResolver_autoptr] = Tag.Ptr[GResolver](GResolver._tag)
  inline def apply(inline o: Ptr[GResolver]): GResolver_autoptr = o
  extension (v: GResolver_autoptr)
    inline def value: Ptr[GResolver] = v

opaque type GResolver_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GResolver_listautoptr: 
  given _tag: Tag[GResolver_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GResolver_listautoptr = o
  extension (v: GResolver_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GResolver_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GResolver_queueautoptr: 
  given _tag: Tag[GResolver_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GResolver_queueautoptr = o
  extension (v: GResolver_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GResolver_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GResolver_slistautoptr: 
  given _tag: Tag[GResolver_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GResolver_slistautoptr = o
  extension (v: GResolver_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GResource_autoptr = Ptr[GResource]
object GResource_autoptr: 
  given _tag: Tag[GResource_autoptr] = Tag.Ptr[GResource](GResource._tag)
  inline def apply(inline o: Ptr[GResource]): GResource_autoptr = o
  extension (v: GResource_autoptr)
    inline def value: Ptr[GResource] = v

opaque type GResource_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GResource_listautoptr: 
  given _tag: Tag[GResource_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GResource_listautoptr = o
  extension (v: GResource_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GResource_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GResource_queueautoptr: 
  given _tag: Tag[GResource_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GResource_queueautoptr = o
  extension (v: GResource_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GResource_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GResource_slistautoptr: 
  given _tag: Tag[GResource_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GResource_slistautoptr = o
  extension (v: GResource_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GSeekable_autoptr = Ptr[GSeekable]
object GSeekable_autoptr: 
  given _tag: Tag[GSeekable_autoptr] = Tag.Ptr[GSeekable](GSeekable._tag)
  inline def apply(inline o: Ptr[GSeekable]): GSeekable_autoptr = o
  extension (v: GSeekable_autoptr)
    inline def value: Ptr[GSeekable] = v

opaque type GSeekable_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GSeekable_listautoptr: 
  given _tag: Tag[GSeekable_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GSeekable_listautoptr = o
  extension (v: GSeekable_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GSeekable_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GSeekable_queueautoptr: 
  given _tag: Tag[GSeekable_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GSeekable_queueautoptr = o
  extension (v: GSeekable_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GSeekable_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GSeekable_slistautoptr: 
  given _tag: Tag[GSeekable_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GSeekable_slistautoptr = o
  extension (v: GSeekable_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GSettingsBackend_autoptr = Ptr[GSettingsBackend]
object GSettingsBackend_autoptr: 
  given _tag: Tag[GSettingsBackend_autoptr] = Tag.Ptr[GSettingsBackend](GSettingsBackend._tag)
  inline def apply(inline o: Ptr[GSettingsBackend]): GSettingsBackend_autoptr = o
  extension (v: GSettingsBackend_autoptr)
    inline def value: Ptr[GSettingsBackend] = v

opaque type GSettingsBackend_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GSettingsBackend_listautoptr: 
  given _tag: Tag[GSettingsBackend_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GSettingsBackend_listautoptr = o
  extension (v: GSettingsBackend_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GSettingsBackend_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GSettingsBackend_queueautoptr: 
  given _tag: Tag[GSettingsBackend_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GSettingsBackend_queueautoptr = o
  extension (v: GSettingsBackend_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GSettingsBackend_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GSettingsBackend_slistautoptr: 
  given _tag: Tag[GSettingsBackend_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GSettingsBackend_slistautoptr = o
  extension (v: GSettingsBackend_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GSettingsBindGetMapping: : return location for the property value : the #GVariant _data: user data that was specified when the binding was created
*/
opaque type GSettingsBindGetMapping = CFuncPtr3[Ptr[_root_.sn.gnome.gobject.internal.GValue], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GSettingsBindGetMapping: 
  given _tag: Tag[GSettingsBindGetMapping] = Tag.materializeCFuncPtr3[Ptr[_root_.sn.gnome.gobject.internal.GValue], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GSettingsBindGetMapping = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[_root_.sn.gnome.gobject.internal.GValue], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GSettingsBindGetMapping = o
  extension (v: GSettingsBindGetMapping)
    inline def value: CFuncPtr3[Ptr[_root_.sn.gnome.gobject.internal.GValue], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * GSettingsBindSetMapping: : a #GValue containing the property value to map _type: the #GVariantType to create _data: user data that was specified when the binding was created
*/
opaque type GSettingsBindSetMapping = CFuncPtr3[Ptr[_root_.sn.gnome.gobject.internal.GValue], Ptr[_root_.sn.gnome.glib.internal.GVariantType], _root_.sn.gnome.glib.internal.gpointer, Ptr[_root_.sn.gnome.glib.internal.GVariant]]
object GSettingsBindSetMapping: 
  given _tag: Tag[GSettingsBindSetMapping] = Tag.materializeCFuncPtr3[Ptr[_root_.sn.gnome.gobject.internal.GValue], Ptr[_root_.sn.gnome.glib.internal.GVariantType], _root_.sn.gnome.glib.internal.gpointer, Ptr[_root_.sn.gnome.glib.internal.GVariant]]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GSettingsBindSetMapping = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[_root_.sn.gnome.gobject.internal.GValue], Ptr[_root_.sn.gnome.glib.internal.GVariantType], _root_.sn.gnome.glib.internal.gpointer, Ptr[_root_.sn.gnome.glib.internal.GVariant]]): GSettingsBindSetMapping = o
  extension (v: GSettingsBindSetMapping)
    inline def value: CFuncPtr3[Ptr[_root_.sn.gnome.gobject.internal.GValue], Ptr[_root_.sn.gnome.glib.internal.GVariantType], _root_.sn.gnome.glib.internal.gpointer, Ptr[_root_.sn.gnome.glib.internal.GVariant]] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

/**
 * GSettingsGetMapping: : the #GVariant to map, or %NULL
*/
opaque type GSettingsGetMapping = CFuncPtr3[Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.gpointer], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GSettingsGetMapping: 
  given _tag: Tag[GSettingsGetMapping] = Tag.materializeCFuncPtr3[Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.gpointer], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GSettingsGetMapping = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.gpointer], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GSettingsGetMapping = o
  extension (v: GSettingsGetMapping)
    inline def value: CFuncPtr3[Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.gpointer], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GSettingsSchemaKey_autoptr = Ptr[GSettingsSchemaKey]
object GSettingsSchemaKey_autoptr: 
  given _tag: Tag[GSettingsSchemaKey_autoptr] = Tag.Ptr[GSettingsSchemaKey](GSettingsSchemaKey._tag)
  inline def apply(inline o: Ptr[GSettingsSchemaKey]): GSettingsSchemaKey_autoptr = o
  extension (v: GSettingsSchemaKey_autoptr)
    inline def value: Ptr[GSettingsSchemaKey] = v

opaque type GSettingsSchemaKey_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GSettingsSchemaKey_listautoptr: 
  given _tag: Tag[GSettingsSchemaKey_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GSettingsSchemaKey_listautoptr = o
  extension (v: GSettingsSchemaKey_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GSettingsSchemaKey_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GSettingsSchemaKey_queueautoptr: 
  given _tag: Tag[GSettingsSchemaKey_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GSettingsSchemaKey_queueautoptr = o
  extension (v: GSettingsSchemaKey_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GSettingsSchemaKey_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GSettingsSchemaKey_slistautoptr: 
  given _tag: Tag[GSettingsSchemaKey_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GSettingsSchemaKey_slistautoptr = o
  extension (v: GSettingsSchemaKey_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GSettingsSchemaSource_autoptr = Ptr[GSettingsSchemaSource]
object GSettingsSchemaSource_autoptr: 
  given _tag: Tag[GSettingsSchemaSource_autoptr] = Tag.Ptr[GSettingsSchemaSource](GSettingsSchemaSource._tag)
  inline def apply(inline o: Ptr[GSettingsSchemaSource]): GSettingsSchemaSource_autoptr = o
  extension (v: GSettingsSchemaSource_autoptr)
    inline def value: Ptr[GSettingsSchemaSource] = v

opaque type GSettingsSchemaSource_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GSettingsSchemaSource_listautoptr: 
  given _tag: Tag[GSettingsSchemaSource_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GSettingsSchemaSource_listautoptr = o
  extension (v: GSettingsSchemaSource_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GSettingsSchemaSource_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GSettingsSchemaSource_queueautoptr: 
  given _tag: Tag[GSettingsSchemaSource_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GSettingsSchemaSource_queueautoptr = o
  extension (v: GSettingsSchemaSource_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GSettingsSchemaSource_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GSettingsSchemaSource_slistautoptr: 
  given _tag: Tag[GSettingsSchemaSource_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GSettingsSchemaSource_slistautoptr = o
  extension (v: GSettingsSchemaSource_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GSettingsSchema_autoptr = Ptr[GSettingsSchema]
object GSettingsSchema_autoptr: 
  given _tag: Tag[GSettingsSchema_autoptr] = Tag.Ptr[GSettingsSchema](GSettingsSchema._tag)
  inline def apply(inline o: Ptr[GSettingsSchema]): GSettingsSchema_autoptr = o
  extension (v: GSettingsSchema_autoptr)
    inline def value: Ptr[GSettingsSchema] = v

opaque type GSettingsSchema_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GSettingsSchema_listautoptr: 
  given _tag: Tag[GSettingsSchema_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GSettingsSchema_listautoptr = o
  extension (v: GSettingsSchema_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GSettingsSchema_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GSettingsSchema_queueautoptr: 
  given _tag: Tag[GSettingsSchema_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GSettingsSchema_queueautoptr = o
  extension (v: GSettingsSchema_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GSettingsSchema_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GSettingsSchema_slistautoptr: 
  given _tag: Tag[GSettingsSchema_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GSettingsSchema_slistautoptr = o
  extension (v: GSettingsSchema_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GSettings_autoptr = Ptr[GSettings]
object GSettings_autoptr: 
  given _tag: Tag[GSettings_autoptr] = Tag.Ptr[GSettings](GSettings._tag)
  inline def apply(inline o: Ptr[GSettings]): GSettings_autoptr = o
  extension (v: GSettings_autoptr)
    inline def value: Ptr[GSettings] = v

opaque type GSettings_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GSettings_listautoptr: 
  given _tag: Tag[GSettings_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GSettings_listautoptr = o
  extension (v: GSettings_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GSettings_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GSettings_queueautoptr: 
  given _tag: Tag[GSettings_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GSettings_queueautoptr = o
  extension (v: GSettings_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GSettings_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GSettings_slistautoptr: 
  given _tag: Tag[GSettings_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GSettings_slistautoptr = o
  extension (v: GSettings_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GSimpleActionGroup_autoptr = Ptr[GSimpleActionGroup]
object GSimpleActionGroup_autoptr: 
  given _tag: Tag[GSimpleActionGroup_autoptr] = Tag.Ptr[GSimpleActionGroup](GSimpleActionGroup._tag)
  inline def apply(inline o: Ptr[GSimpleActionGroup]): GSimpleActionGroup_autoptr = o
  extension (v: GSimpleActionGroup_autoptr)
    inline def value: Ptr[GSimpleActionGroup] = v

opaque type GSimpleActionGroup_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GSimpleActionGroup_listautoptr: 
  given _tag: Tag[GSimpleActionGroup_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GSimpleActionGroup_listautoptr = o
  extension (v: GSimpleActionGroup_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GSimpleActionGroup_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GSimpleActionGroup_queueautoptr: 
  given _tag: Tag[GSimpleActionGroup_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GSimpleActionGroup_queueautoptr = o
  extension (v: GSimpleActionGroup_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GSimpleActionGroup_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GSimpleActionGroup_slistautoptr: 
  given _tag: Tag[GSimpleActionGroup_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GSimpleActionGroup_slistautoptr = o
  extension (v: GSimpleActionGroup_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GSimpleAction_autoptr = Ptr[GSimpleAction]
object GSimpleAction_autoptr: 
  given _tag: Tag[GSimpleAction_autoptr] = Tag.Ptr[GSimpleAction](GSimpleAction._tag)
  inline def apply(inline o: Ptr[GSimpleAction]): GSimpleAction_autoptr = o
  extension (v: GSimpleAction_autoptr)
    inline def value: Ptr[GSimpleAction] = v

opaque type GSimpleAction_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GSimpleAction_listautoptr: 
  given _tag: Tag[GSimpleAction_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GSimpleAction_listautoptr = o
  extension (v: GSimpleAction_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GSimpleAction_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GSimpleAction_queueautoptr: 
  given _tag: Tag[GSimpleAction_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GSimpleAction_queueautoptr = o
  extension (v: GSimpleAction_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GSimpleAction_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GSimpleAction_slistautoptr: 
  given _tag: Tag[GSimpleAction_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GSimpleAction_slistautoptr = o
  extension (v: GSimpleAction_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GSimpleAsyncResult_autoptr = Ptr[GSimpleAsyncResult]
object GSimpleAsyncResult_autoptr: 
  given _tag: Tag[GSimpleAsyncResult_autoptr] = Tag.Ptr[GSimpleAsyncResult](GSimpleAsyncResult._tag)
  inline def apply(inline o: Ptr[GSimpleAsyncResult]): GSimpleAsyncResult_autoptr = o
  extension (v: GSimpleAsyncResult_autoptr)
    inline def value: Ptr[GSimpleAsyncResult] = v

opaque type GSimpleAsyncResult_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GSimpleAsyncResult_listautoptr: 
  given _tag: Tag[GSimpleAsyncResult_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GSimpleAsyncResult_listautoptr = o
  extension (v: GSimpleAsyncResult_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GSimpleAsyncResult_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GSimpleAsyncResult_queueautoptr: 
  given _tag: Tag[GSimpleAsyncResult_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GSimpleAsyncResult_queueautoptr = o
  extension (v: GSimpleAsyncResult_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GSimpleAsyncResult_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GSimpleAsyncResult_slistautoptr: 
  given _tag: Tag[GSimpleAsyncResult_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GSimpleAsyncResult_slistautoptr = o
  extension (v: GSimpleAsyncResult_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GSimpleAsyncThreadFunc: : a #GSimpleAsyncResult. : a #GObject. : optional #GCancellable object, %NULL to ignore.
*/
opaque type GSimpleAsyncThreadFunc = CFuncPtr3[Ptr[GSimpleAsyncResult], Ptr[_root_.sn.gnome.gobject.internal.GObject], Ptr[GCancellable], Unit]
object GSimpleAsyncThreadFunc: 
  given _tag: Tag[GSimpleAsyncThreadFunc] = Tag.materializeCFuncPtr3[Ptr[GSimpleAsyncResult], Ptr[_root_.sn.gnome.gobject.internal.GObject], Ptr[GCancellable], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GSimpleAsyncThreadFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GSimpleAsyncResult], Ptr[_root_.sn.gnome.gobject.internal.GObject], Ptr[GCancellable], Unit]): GSimpleAsyncThreadFunc = o
  extension (v: GSimpleAsyncThreadFunc)
    inline def value: CFuncPtr3[Ptr[GSimpleAsyncResult], Ptr[_root_.sn.gnome.gobject.internal.GObject], Ptr[GCancellable], Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GSimplePermission_autoptr = Ptr[GSimplePermission]
object GSimplePermission_autoptr: 
  given _tag: Tag[GSimplePermission_autoptr] = Tag.Ptr[GSimplePermission](GSimplePermission._tag)
  inline def apply(inline o: Ptr[GSimplePermission]): GSimplePermission_autoptr = o
  extension (v: GSimplePermission_autoptr)
    inline def value: Ptr[GSimplePermission] = v

opaque type GSimplePermission_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GSimplePermission_listautoptr: 
  given _tag: Tag[GSimplePermission_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GSimplePermission_listautoptr = o
  extension (v: GSimplePermission_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GSimplePermission_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GSimplePermission_queueautoptr: 
  given _tag: Tag[GSimplePermission_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GSimplePermission_queueautoptr = o
  extension (v: GSimplePermission_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GSimplePermission_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GSimplePermission_slistautoptr: 
  given _tag: Tag[GSimplePermission_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GSimplePermission_slistautoptr = o
  extension (v: GSimplePermission_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GSimpleProxyResolver_autoptr = Ptr[GSimpleProxyResolver]
object GSimpleProxyResolver_autoptr: 
  given _tag: Tag[GSimpleProxyResolver_autoptr] = Tag.Ptr[GSimpleProxyResolver](GSimpleProxyResolver._tag)
  inline def apply(inline o: Ptr[GSimpleProxyResolver]): GSimpleProxyResolver_autoptr = o
  extension (v: GSimpleProxyResolver_autoptr)
    inline def value: Ptr[GSimpleProxyResolver] = v

opaque type GSimpleProxyResolver_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GSimpleProxyResolver_listautoptr: 
  given _tag: Tag[GSimpleProxyResolver_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GSimpleProxyResolver_listautoptr = o
  extension (v: GSimpleProxyResolver_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GSimpleProxyResolver_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GSimpleProxyResolver_queueautoptr: 
  given _tag: Tag[GSimpleProxyResolver_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GSimpleProxyResolver_queueautoptr = o
  extension (v: GSimpleProxyResolver_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GSimpleProxyResolver_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GSimpleProxyResolver_slistautoptr: 
  given _tag: Tag[GSimpleProxyResolver_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GSimpleProxyResolver_slistautoptr = o
  extension (v: GSimpleProxyResolver_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GSocketAddressEnumerator_autoptr = Ptr[GSocketAddressEnumerator]
object GSocketAddressEnumerator_autoptr: 
  given _tag: Tag[GSocketAddressEnumerator_autoptr] = Tag.Ptr[GSocketAddressEnumerator](GSocketAddressEnumerator._tag)
  inline def apply(inline o: Ptr[GSocketAddressEnumerator]): GSocketAddressEnumerator_autoptr = o
  extension (v: GSocketAddressEnumerator_autoptr)
    inline def value: Ptr[GSocketAddressEnumerator] = v

opaque type GSocketAddressEnumerator_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GSocketAddressEnumerator_listautoptr: 
  given _tag: Tag[GSocketAddressEnumerator_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GSocketAddressEnumerator_listautoptr = o
  extension (v: GSocketAddressEnumerator_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GSocketAddressEnumerator_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GSocketAddressEnumerator_queueautoptr: 
  given _tag: Tag[GSocketAddressEnumerator_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GSocketAddressEnumerator_queueautoptr = o
  extension (v: GSocketAddressEnumerator_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GSocketAddressEnumerator_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GSocketAddressEnumerator_slistautoptr: 
  given _tag: Tag[GSocketAddressEnumerator_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GSocketAddressEnumerator_slistautoptr = o
  extension (v: GSocketAddressEnumerator_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GSocketAddress_autoptr = Ptr[GSocketAddress]
object GSocketAddress_autoptr: 
  given _tag: Tag[GSocketAddress_autoptr] = Tag.Ptr[GSocketAddress](GSocketAddress._tag)
  inline def apply(inline o: Ptr[GSocketAddress]): GSocketAddress_autoptr = o
  extension (v: GSocketAddress_autoptr)
    inline def value: Ptr[GSocketAddress] = v

opaque type GSocketAddress_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GSocketAddress_listautoptr: 
  given _tag: Tag[GSocketAddress_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GSocketAddress_listautoptr = o
  extension (v: GSocketAddress_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GSocketAddress_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GSocketAddress_queueautoptr: 
  given _tag: Tag[GSocketAddress_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GSocketAddress_queueautoptr = o
  extension (v: GSocketAddress_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GSocketAddress_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GSocketAddress_slistautoptr: 
  given _tag: Tag[GSocketAddress_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GSocketAddress_slistautoptr = o
  extension (v: GSocketAddress_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GSocketClient_autoptr = Ptr[GSocketClient]
object GSocketClient_autoptr: 
  given _tag: Tag[GSocketClient_autoptr] = Tag.Ptr[GSocketClient](GSocketClient._tag)
  inline def apply(inline o: Ptr[GSocketClient]): GSocketClient_autoptr = o
  extension (v: GSocketClient_autoptr)
    inline def value: Ptr[GSocketClient] = v

opaque type GSocketClient_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GSocketClient_listautoptr: 
  given _tag: Tag[GSocketClient_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GSocketClient_listautoptr = o
  extension (v: GSocketClient_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GSocketClient_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GSocketClient_queueautoptr: 
  given _tag: Tag[GSocketClient_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GSocketClient_queueautoptr = o
  extension (v: GSocketClient_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GSocketClient_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GSocketClient_slistautoptr: 
  given _tag: Tag[GSocketClient_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GSocketClient_slistautoptr = o
  extension (v: GSocketClient_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GSocketConnectable_autoptr = Ptr[GSocketConnectable]
object GSocketConnectable_autoptr: 
  given _tag: Tag[GSocketConnectable_autoptr] = Tag.Ptr[GSocketConnectable](GSocketConnectable._tag)
  inline def apply(inline o: Ptr[GSocketConnectable]): GSocketConnectable_autoptr = o
  extension (v: GSocketConnectable_autoptr)
    inline def value: Ptr[GSocketConnectable] = v

opaque type GSocketConnectable_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GSocketConnectable_listautoptr: 
  given _tag: Tag[GSocketConnectable_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GSocketConnectable_listautoptr = o
  extension (v: GSocketConnectable_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GSocketConnectable_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GSocketConnectable_queueautoptr: 
  given _tag: Tag[GSocketConnectable_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GSocketConnectable_queueautoptr = o
  extension (v: GSocketConnectable_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GSocketConnectable_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GSocketConnectable_slistautoptr: 
  given _tag: Tag[GSocketConnectable_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GSocketConnectable_slistautoptr = o
  extension (v: GSocketConnectable_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GSocketConnection_autoptr = Ptr[GSocketConnection]
object GSocketConnection_autoptr: 
  given _tag: Tag[GSocketConnection_autoptr] = Tag.Ptr[GSocketConnection](GSocketConnection._tag)
  inline def apply(inline o: Ptr[GSocketConnection]): GSocketConnection_autoptr = o
  extension (v: GSocketConnection_autoptr)
    inline def value: Ptr[GSocketConnection] = v

opaque type GSocketConnection_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GSocketConnection_listautoptr: 
  given _tag: Tag[GSocketConnection_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GSocketConnection_listautoptr = o
  extension (v: GSocketConnection_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GSocketConnection_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GSocketConnection_queueautoptr: 
  given _tag: Tag[GSocketConnection_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GSocketConnection_queueautoptr = o
  extension (v: GSocketConnection_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GSocketConnection_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GSocketConnection_slistautoptr: 
  given _tag: Tag[GSocketConnection_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GSocketConnection_slistautoptr = o
  extension (v: GSocketConnection_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GSocketControlMessage_autoptr = Ptr[GSocketControlMessage]
object GSocketControlMessage_autoptr: 
  given _tag: Tag[GSocketControlMessage_autoptr] = Tag.Ptr[GSocketControlMessage](GSocketControlMessage._tag)
  inline def apply(inline o: Ptr[GSocketControlMessage]): GSocketControlMessage_autoptr = o
  extension (v: GSocketControlMessage_autoptr)
    inline def value: Ptr[GSocketControlMessage] = v

opaque type GSocketControlMessage_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GSocketControlMessage_listautoptr: 
  given _tag: Tag[GSocketControlMessage_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GSocketControlMessage_listautoptr = o
  extension (v: GSocketControlMessage_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GSocketControlMessage_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GSocketControlMessage_queueautoptr: 
  given _tag: Tag[GSocketControlMessage_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GSocketControlMessage_queueautoptr = o
  extension (v: GSocketControlMessage_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GSocketControlMessage_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GSocketControlMessage_slistautoptr: 
  given _tag: Tag[GSocketControlMessage_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GSocketControlMessage_slistautoptr = o
  extension (v: GSocketControlMessage_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GSocketListener_autoptr = Ptr[GSocketListener]
object GSocketListener_autoptr: 
  given _tag: Tag[GSocketListener_autoptr] = Tag.Ptr[GSocketListener](GSocketListener._tag)
  inline def apply(inline o: Ptr[GSocketListener]): GSocketListener_autoptr = o
  extension (v: GSocketListener_autoptr)
    inline def value: Ptr[GSocketListener] = v

opaque type GSocketListener_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GSocketListener_listautoptr: 
  given _tag: Tag[GSocketListener_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GSocketListener_listautoptr = o
  extension (v: GSocketListener_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GSocketListener_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GSocketListener_queueautoptr: 
  given _tag: Tag[GSocketListener_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GSocketListener_queueautoptr = o
  extension (v: GSocketListener_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GSocketListener_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GSocketListener_slistautoptr: 
  given _tag: Tag[GSocketListener_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GSocketListener_slistautoptr = o
  extension (v: GSocketListener_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GSocketService_autoptr = Ptr[GSocketService]
object GSocketService_autoptr: 
  given _tag: Tag[GSocketService_autoptr] = Tag.Ptr[GSocketService](GSocketService._tag)
  inline def apply(inline o: Ptr[GSocketService]): GSocketService_autoptr = o
  extension (v: GSocketService_autoptr)
    inline def value: Ptr[GSocketService] = v

opaque type GSocketService_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GSocketService_listautoptr: 
  given _tag: Tag[GSocketService_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GSocketService_listautoptr = o
  extension (v: GSocketService_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GSocketService_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GSocketService_queueautoptr: 
  given _tag: Tag[GSocketService_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GSocketService_queueautoptr = o
  extension (v: GSocketService_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GSocketService_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GSocketService_slistautoptr: 
  given _tag: Tag[GSocketService_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GSocketService_slistautoptr = o
  extension (v: GSocketService_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GSocketSourceFunc: : the #GSocket : the current condition at the source fired.
*/
opaque type GSocketSourceFunc = CFuncPtr3[Ptr[GSocket], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GSocketSourceFunc: 
  given _tag: Tag[GSocketSourceFunc] = Tag.materializeCFuncPtr3[Ptr[GSocket], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GSocketSourceFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GSocket], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GSocketSourceFunc = o
  extension (v: GSocketSourceFunc)
    inline def value: CFuncPtr3[Ptr[GSocket], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GSocket_autoptr = Ptr[GSocket]
object GSocket_autoptr: 
  given _tag: Tag[GSocket_autoptr] = Tag.Ptr[GSocket](GSocket._tag)
  inline def apply(inline o: Ptr[GSocket]): GSocket_autoptr = o
  extension (v: GSocket_autoptr)
    inline def value: Ptr[GSocket] = v

opaque type GSocket_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GSocket_listautoptr: 
  given _tag: Tag[GSocket_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GSocket_listautoptr = o
  extension (v: GSocket_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GSocket_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GSocket_queueautoptr: 
  given _tag: Tag[GSocket_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GSocket_queueautoptr = o
  extension (v: GSocket_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GSocket_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GSocket_slistautoptr: 
  given _tag: Tag[GSocket_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GSocket_slistautoptr = o
  extension (v: GSocket_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GSubprocessLauncher_autoptr = Ptr[GSubprocessLauncher]
object GSubprocessLauncher_autoptr: 
  given _tag: Tag[GSubprocessLauncher_autoptr] = Tag.Ptr[GSubprocessLauncher](GSubprocessLauncher._tag)
  inline def apply(inline o: Ptr[GSubprocessLauncher]): GSubprocessLauncher_autoptr = o
  extension (v: GSubprocessLauncher_autoptr)
    inline def value: Ptr[GSubprocessLauncher] = v

opaque type GSubprocessLauncher_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GSubprocessLauncher_listautoptr: 
  given _tag: Tag[GSubprocessLauncher_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GSubprocessLauncher_listautoptr = o
  extension (v: GSubprocessLauncher_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GSubprocessLauncher_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GSubprocessLauncher_queueautoptr: 
  given _tag: Tag[GSubprocessLauncher_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GSubprocessLauncher_queueautoptr = o
  extension (v: GSubprocessLauncher_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GSubprocessLauncher_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GSubprocessLauncher_slistautoptr: 
  given _tag: Tag[GSubprocessLauncher_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GSubprocessLauncher_slistautoptr = o
  extension (v: GSubprocessLauncher_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GSubprocess_autoptr = Ptr[GSubprocess]
object GSubprocess_autoptr: 
  given _tag: Tag[GSubprocess_autoptr] = Tag.Ptr[GSubprocess](GSubprocess._tag)
  inline def apply(inline o: Ptr[GSubprocess]): GSubprocess_autoptr = o
  extension (v: GSubprocess_autoptr)
    inline def value: Ptr[GSubprocess] = v

opaque type GSubprocess_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GSubprocess_listautoptr: 
  given _tag: Tag[GSubprocess_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GSubprocess_listautoptr = o
  extension (v: GSubprocess_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GSubprocess_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GSubprocess_queueautoptr: 
  given _tag: Tag[GSubprocess_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GSubprocess_queueautoptr = o
  extension (v: GSubprocess_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GSubprocess_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GSubprocess_slistautoptr: 
  given _tag: Tag[GSubprocess_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GSubprocess_slistautoptr = o
  extension (v: GSubprocess_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GTaskThreadFunc = CFuncPtr4[Ptr[GTask], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[GCancellable], Unit]
object GTaskThreadFunc: 
  given _tag: Tag[GTaskThreadFunc] = Tag.materializeCFuncPtr4[Ptr[GTask], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[GCancellable], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GTaskThreadFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GTask], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[GCancellable], Unit]): GTaskThreadFunc = o
  extension (v: GTaskThreadFunc)
    inline def value: CFuncPtr4[Ptr[GTask], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[GCancellable], Unit] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GTask_autoptr = Ptr[GTask]
object GTask_autoptr: 
  given _tag: Tag[GTask_autoptr] = Tag.Ptr[GTask](GTask._tag)
  inline def apply(inline o: Ptr[GTask]): GTask_autoptr = o
  extension (v: GTask_autoptr)
    inline def value: Ptr[GTask] = v

opaque type GTask_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GTask_listautoptr: 
  given _tag: Tag[GTask_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GTask_listautoptr = o
  extension (v: GTask_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GTask_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GTask_queueautoptr: 
  given _tag: Tag[GTask_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GTask_queueautoptr = o
  extension (v: GTask_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GTask_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GTask_slistautoptr: 
  given _tag: Tag[GTask_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GTask_slistautoptr = o
  extension (v: GTask_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GTcpConnection_autoptr = Ptr[GTcpConnection]
object GTcpConnection_autoptr: 
  given _tag: Tag[GTcpConnection_autoptr] = Tag.Ptr[GTcpConnection](GTcpConnection._tag)
  inline def apply(inline o: Ptr[GTcpConnection]): GTcpConnection_autoptr = o
  extension (v: GTcpConnection_autoptr)
    inline def value: Ptr[GTcpConnection] = v

opaque type GTcpConnection_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GTcpConnection_listautoptr: 
  given _tag: Tag[GTcpConnection_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GTcpConnection_listautoptr = o
  extension (v: GTcpConnection_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GTcpConnection_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GTcpConnection_queueautoptr: 
  given _tag: Tag[GTcpConnection_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GTcpConnection_queueautoptr = o
  extension (v: GTcpConnection_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GTcpConnection_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GTcpConnection_slistautoptr: 
  given _tag: Tag[GTcpConnection_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GTcpConnection_slistautoptr = o
  extension (v: GTcpConnection_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GTcpWrapperConnection_autoptr = Ptr[GTcpWrapperConnection]
object GTcpWrapperConnection_autoptr: 
  given _tag: Tag[GTcpWrapperConnection_autoptr] = Tag.Ptr[GTcpWrapperConnection](GTcpWrapperConnection._tag)
  inline def apply(inline o: Ptr[GTcpWrapperConnection]): GTcpWrapperConnection_autoptr = o
  extension (v: GTcpWrapperConnection_autoptr)
    inline def value: Ptr[GTcpWrapperConnection] = v

opaque type GTcpWrapperConnection_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GTcpWrapperConnection_listautoptr: 
  given _tag: Tag[GTcpWrapperConnection_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GTcpWrapperConnection_listautoptr = o
  extension (v: GTcpWrapperConnection_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GTcpWrapperConnection_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GTcpWrapperConnection_queueautoptr: 
  given _tag: Tag[GTcpWrapperConnection_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GTcpWrapperConnection_queueautoptr = o
  extension (v: GTcpWrapperConnection_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GTcpWrapperConnection_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GTcpWrapperConnection_slistautoptr: 
  given _tag: Tag[GTcpWrapperConnection_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GTcpWrapperConnection_slistautoptr = o
  extension (v: GTcpWrapperConnection_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GTestDBus_autoptr = Ptr[GTestDBus]
object GTestDBus_autoptr: 
  given _tag: Tag[GTestDBus_autoptr] = Tag.Ptr[GTestDBus](GTestDBus._tag)
  inline def apply(inline o: Ptr[GTestDBus]): GTestDBus_autoptr = o
  extension (v: GTestDBus_autoptr)
    inline def value: Ptr[GTestDBus] = v

opaque type GTestDBus_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GTestDBus_listautoptr: 
  given _tag: Tag[GTestDBus_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GTestDBus_listautoptr = o
  extension (v: GTestDBus_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GTestDBus_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GTestDBus_queueautoptr: 
  given _tag: Tag[GTestDBus_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GTestDBus_queueautoptr = o
  extension (v: GTestDBus_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GTestDBus_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GTestDBus_slistautoptr: 
  given _tag: Tag[GTestDBus_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GTestDBus_slistautoptr = o
  extension (v: GTestDBus_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GThemedIcon_autoptr = Ptr[GThemedIcon]
object GThemedIcon_autoptr: 
  given _tag: Tag[GThemedIcon_autoptr] = Tag.Ptr[GThemedIcon](GThemedIcon._tag)
  inline def apply(inline o: Ptr[GThemedIcon]): GThemedIcon_autoptr = o
  extension (v: GThemedIcon_autoptr)
    inline def value: Ptr[GThemedIcon] = v

opaque type GThemedIcon_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GThemedIcon_listautoptr: 
  given _tag: Tag[GThemedIcon_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GThemedIcon_listautoptr = o
  extension (v: GThemedIcon_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GThemedIcon_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GThemedIcon_queueautoptr: 
  given _tag: Tag[GThemedIcon_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GThemedIcon_queueautoptr = o
  extension (v: GThemedIcon_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GThemedIcon_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GThemedIcon_slistautoptr: 
  given _tag: Tag[GThemedIcon_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GThemedIcon_slistautoptr = o
  extension (v: GThemedIcon_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GThreadedSocketService_autoptr = Ptr[GThreadedSocketService]
object GThreadedSocketService_autoptr: 
  given _tag: Tag[GThreadedSocketService_autoptr] = Tag.Ptr[GThreadedSocketService](GThreadedSocketService._tag)
  inline def apply(inline o: Ptr[GThreadedSocketService]): GThreadedSocketService_autoptr = o
  extension (v: GThreadedSocketService_autoptr)
    inline def value: Ptr[GThreadedSocketService] = v

opaque type GThreadedSocketService_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GThreadedSocketService_listautoptr: 
  given _tag: Tag[GThreadedSocketService_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GThreadedSocketService_listautoptr = o
  extension (v: GThreadedSocketService_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GThreadedSocketService_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GThreadedSocketService_queueautoptr: 
  given _tag: Tag[GThreadedSocketService_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GThreadedSocketService_queueautoptr = o
  extension (v: GThreadedSocketService_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GThreadedSocketService_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GThreadedSocketService_slistautoptr: 
  given _tag: Tag[GThreadedSocketService_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GThreadedSocketService_slistautoptr = o
  extension (v: GThreadedSocketService_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GTlsBackend_autoptr = Ptr[GTlsBackend]
object GTlsBackend_autoptr: 
  given _tag: Tag[GTlsBackend_autoptr] = Tag.Ptr[GTlsBackend](GTlsBackend._tag)
  inline def apply(inline o: Ptr[GTlsBackend]): GTlsBackend_autoptr = o
  extension (v: GTlsBackend_autoptr)
    inline def value: Ptr[GTlsBackend] = v

opaque type GTlsBackend_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GTlsBackend_listautoptr: 
  given _tag: Tag[GTlsBackend_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GTlsBackend_listautoptr = o
  extension (v: GTlsBackend_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GTlsBackend_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GTlsBackend_queueautoptr: 
  given _tag: Tag[GTlsBackend_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GTlsBackend_queueautoptr = o
  extension (v: GTlsBackend_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GTlsBackend_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GTlsBackend_slistautoptr: 
  given _tag: Tag[GTlsBackend_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GTlsBackend_slistautoptr = o
  extension (v: GTlsBackend_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GTlsCertificate_autoptr = Ptr[GTlsCertificate]
object GTlsCertificate_autoptr: 
  given _tag: Tag[GTlsCertificate_autoptr] = Tag.Ptr[GTlsCertificate](GTlsCertificate._tag)
  inline def apply(inline o: Ptr[GTlsCertificate]): GTlsCertificate_autoptr = o
  extension (v: GTlsCertificate_autoptr)
    inline def value: Ptr[GTlsCertificate] = v

opaque type GTlsCertificate_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GTlsCertificate_listautoptr: 
  given _tag: Tag[GTlsCertificate_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GTlsCertificate_listautoptr = o
  extension (v: GTlsCertificate_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GTlsCertificate_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GTlsCertificate_queueautoptr: 
  given _tag: Tag[GTlsCertificate_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GTlsCertificate_queueautoptr = o
  extension (v: GTlsCertificate_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GTlsCertificate_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GTlsCertificate_slistautoptr: 
  given _tag: Tag[GTlsCertificate_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GTlsCertificate_slistautoptr = o
  extension (v: GTlsCertificate_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GTlsClientConnection_autoptr = Ptr[GTlsClientConnection]
object GTlsClientConnection_autoptr: 
  given _tag: Tag[GTlsClientConnection_autoptr] = Tag.Ptr[GTlsClientConnection](GTlsClientConnection._tag)
  inline def apply(inline o: Ptr[GTlsClientConnection]): GTlsClientConnection_autoptr = o
  extension (v: GTlsClientConnection_autoptr)
    inline def value: Ptr[GTlsClientConnection] = v

opaque type GTlsClientConnection_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GTlsClientConnection_listautoptr: 
  given _tag: Tag[GTlsClientConnection_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GTlsClientConnection_listautoptr = o
  extension (v: GTlsClientConnection_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GTlsClientConnection_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GTlsClientConnection_queueautoptr: 
  given _tag: Tag[GTlsClientConnection_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GTlsClientConnection_queueautoptr = o
  extension (v: GTlsClientConnection_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GTlsClientConnection_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GTlsClientConnection_slistautoptr: 
  given _tag: Tag[GTlsClientConnection_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GTlsClientConnection_slistautoptr = o
  extension (v: GTlsClientConnection_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GTlsConnection_autoptr = Ptr[GTlsConnection]
object GTlsConnection_autoptr: 
  given _tag: Tag[GTlsConnection_autoptr] = Tag.Ptr[GTlsConnection](GTlsConnection._tag)
  inline def apply(inline o: Ptr[GTlsConnection]): GTlsConnection_autoptr = o
  extension (v: GTlsConnection_autoptr)
    inline def value: Ptr[GTlsConnection] = v

opaque type GTlsConnection_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GTlsConnection_listautoptr: 
  given _tag: Tag[GTlsConnection_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GTlsConnection_listautoptr = o
  extension (v: GTlsConnection_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GTlsConnection_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GTlsConnection_queueautoptr: 
  given _tag: Tag[GTlsConnection_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GTlsConnection_queueautoptr = o
  extension (v: GTlsConnection_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GTlsConnection_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GTlsConnection_slistautoptr: 
  given _tag: Tag[GTlsConnection_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GTlsConnection_slistautoptr = o
  extension (v: GTlsConnection_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GTlsDatabase_autoptr = Ptr[GTlsDatabase]
object GTlsDatabase_autoptr: 
  given _tag: Tag[GTlsDatabase_autoptr] = Tag.Ptr[GTlsDatabase](GTlsDatabase._tag)
  inline def apply(inline o: Ptr[GTlsDatabase]): GTlsDatabase_autoptr = o
  extension (v: GTlsDatabase_autoptr)
    inline def value: Ptr[GTlsDatabase] = v

opaque type GTlsDatabase_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GTlsDatabase_listautoptr: 
  given _tag: Tag[GTlsDatabase_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GTlsDatabase_listautoptr = o
  extension (v: GTlsDatabase_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GTlsDatabase_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GTlsDatabase_queueautoptr: 
  given _tag: Tag[GTlsDatabase_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GTlsDatabase_queueautoptr = o
  extension (v: GTlsDatabase_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GTlsDatabase_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GTlsDatabase_slistautoptr: 
  given _tag: Tag[GTlsDatabase_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GTlsDatabase_slistautoptr = o
  extension (v: GTlsDatabase_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GTlsFileDatabase_autoptr = Ptr[GTlsFileDatabase]
object GTlsFileDatabase_autoptr: 
  given _tag: Tag[GTlsFileDatabase_autoptr] = Tag.Ptr[GTlsFileDatabase](GTlsFileDatabase._tag)
  inline def apply(inline o: Ptr[GTlsFileDatabase]): GTlsFileDatabase_autoptr = o
  extension (v: GTlsFileDatabase_autoptr)
    inline def value: Ptr[GTlsFileDatabase] = v

opaque type GTlsFileDatabase_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GTlsFileDatabase_listautoptr: 
  given _tag: Tag[GTlsFileDatabase_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GTlsFileDatabase_listautoptr = o
  extension (v: GTlsFileDatabase_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GTlsFileDatabase_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GTlsFileDatabase_queueautoptr: 
  given _tag: Tag[GTlsFileDatabase_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GTlsFileDatabase_queueautoptr = o
  extension (v: GTlsFileDatabase_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GTlsFileDatabase_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GTlsFileDatabase_slistautoptr: 
  given _tag: Tag[GTlsFileDatabase_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GTlsFileDatabase_slistautoptr = o
  extension (v: GTlsFileDatabase_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GTlsInteraction_autoptr = Ptr[GTlsInteraction]
object GTlsInteraction_autoptr: 
  given _tag: Tag[GTlsInteraction_autoptr] = Tag.Ptr[GTlsInteraction](GTlsInteraction._tag)
  inline def apply(inline o: Ptr[GTlsInteraction]): GTlsInteraction_autoptr = o
  extension (v: GTlsInteraction_autoptr)
    inline def value: Ptr[GTlsInteraction] = v

opaque type GTlsInteraction_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GTlsInteraction_listautoptr: 
  given _tag: Tag[GTlsInteraction_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GTlsInteraction_listautoptr = o
  extension (v: GTlsInteraction_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GTlsInteraction_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GTlsInteraction_queueautoptr: 
  given _tag: Tag[GTlsInteraction_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GTlsInteraction_queueautoptr = o
  extension (v: GTlsInteraction_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GTlsInteraction_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GTlsInteraction_slistautoptr: 
  given _tag: Tag[GTlsInteraction_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GTlsInteraction_slistautoptr = o
  extension (v: GTlsInteraction_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GTlsPasswordFlags: _TLS_PASSWORD_NONE: No flags _TLS_PASSWORD_RETRY: The password was wrong, and the user should retry. _TLS_PASSWORD_MANY_TRIES: Hint to the user that the password has been wrong many times, and the user may not have many chances left. _TLS_PASSWORD_FINAL_TRY: Hint to the user that this is the last try to get this password right. _TLS_PASSWORD_PKCS11_USER: For PKCS #11, the user PIN is required. Since: 2.70. _TLS_PASSWORD_PKCS11_SECURITY_OFFICER: For PKCS #11, the security officer PIN is required. Since: 2.70. _TLS_PASSWORD_PKCS11_CONTEXT_SPECIFIC: For PKCS #11, the context-specific PIN is required. Since: 2.70.
*/
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

opaque type GTlsPassword_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GTlsPassword_listautoptr: 
  given _tag: Tag[GTlsPassword_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GTlsPassword_listautoptr = o
  extension (v: GTlsPassword_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GTlsPassword_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GTlsPassword_queueautoptr: 
  given _tag: Tag[GTlsPassword_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GTlsPassword_queueautoptr = o
  extension (v: GTlsPassword_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GTlsPassword_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GTlsPassword_slistautoptr: 
  given _tag: Tag[GTlsPassword_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GTlsPassword_slistautoptr = o
  extension (v: GTlsPassword_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GTlsServerConnection_autoptr = Ptr[GTlsServerConnection]
object GTlsServerConnection_autoptr: 
  given _tag: Tag[GTlsServerConnection_autoptr] = Tag.Ptr[GTlsServerConnection](GTlsServerConnection._tag)
  inline def apply(inline o: Ptr[GTlsServerConnection]): GTlsServerConnection_autoptr = o
  extension (v: GTlsServerConnection_autoptr)
    inline def value: Ptr[GTlsServerConnection] = v

opaque type GTlsServerConnection_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GTlsServerConnection_listautoptr: 
  given _tag: Tag[GTlsServerConnection_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GTlsServerConnection_listautoptr = o
  extension (v: GTlsServerConnection_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GTlsServerConnection_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GTlsServerConnection_queueautoptr: 
  given _tag: Tag[GTlsServerConnection_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GTlsServerConnection_queueautoptr = o
  extension (v: GTlsServerConnection_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GTlsServerConnection_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GTlsServerConnection_slistautoptr: 
  given _tag: Tag[GTlsServerConnection_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GTlsServerConnection_slistautoptr = o
  extension (v: GTlsServerConnection_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GUnixConnection_autoptr = Ptr[GUnixConnection]
object GUnixConnection_autoptr: 
  given _tag: Tag[GUnixConnection_autoptr] = Tag.Ptr[GUnixConnection](GUnixConnection._tag)
  inline def apply(inline o: Ptr[GUnixConnection]): GUnixConnection_autoptr = o
  extension (v: GUnixConnection_autoptr)
    inline def value: Ptr[GUnixConnection] = v

opaque type GUnixConnection_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GUnixConnection_listautoptr: 
  given _tag: Tag[GUnixConnection_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GUnixConnection_listautoptr = o
  extension (v: GUnixConnection_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GUnixConnection_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GUnixConnection_queueautoptr: 
  given _tag: Tag[GUnixConnection_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GUnixConnection_queueautoptr = o
  extension (v: GUnixConnection_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GUnixConnection_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GUnixConnection_slistautoptr: 
  given _tag: Tag[GUnixConnection_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GUnixConnection_slistautoptr = o
  extension (v: GUnixConnection_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GUnixCredentialsMessage_autoptr = Ptr[GUnixCredentialsMessage]
object GUnixCredentialsMessage_autoptr: 
  given _tag: Tag[GUnixCredentialsMessage_autoptr] = Tag.Ptr[GUnixCredentialsMessage](GUnixCredentialsMessage._tag)
  inline def apply(inline o: Ptr[GUnixCredentialsMessage]): GUnixCredentialsMessage_autoptr = o
  extension (v: GUnixCredentialsMessage_autoptr)
    inline def value: Ptr[GUnixCredentialsMessage] = v

opaque type GUnixCredentialsMessage_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GUnixCredentialsMessage_listautoptr: 
  given _tag: Tag[GUnixCredentialsMessage_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GUnixCredentialsMessage_listautoptr = o
  extension (v: GUnixCredentialsMessage_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GUnixCredentialsMessage_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GUnixCredentialsMessage_queueautoptr: 
  given _tag: Tag[GUnixCredentialsMessage_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GUnixCredentialsMessage_queueautoptr = o
  extension (v: GUnixCredentialsMessage_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GUnixCredentialsMessage_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GUnixCredentialsMessage_slistautoptr: 
  given _tag: Tag[GUnixCredentialsMessage_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GUnixCredentialsMessage_slistautoptr = o
  extension (v: GUnixCredentialsMessage_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GUnixFDList_autoptr = Ptr[GUnixFDList]
object GUnixFDList_autoptr: 
  given _tag: Tag[GUnixFDList_autoptr] = Tag.Ptr[GUnixFDList](GUnixFDList._tag)
  inline def apply(inline o: Ptr[GUnixFDList]): GUnixFDList_autoptr = o
  extension (v: GUnixFDList_autoptr)
    inline def value: Ptr[GUnixFDList] = v

opaque type GUnixFDList_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GUnixFDList_listautoptr: 
  given _tag: Tag[GUnixFDList_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GUnixFDList_listautoptr = o
  extension (v: GUnixFDList_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GUnixFDList_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GUnixFDList_queueautoptr: 
  given _tag: Tag[GUnixFDList_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GUnixFDList_queueautoptr = o
  extension (v: GUnixFDList_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GUnixFDList_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GUnixFDList_slistautoptr: 
  given _tag: Tag[GUnixFDList_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GUnixFDList_slistautoptr = o
  extension (v: GUnixFDList_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GUnixSocketAddress_autoptr = Ptr[GUnixSocketAddress]
object GUnixSocketAddress_autoptr: 
  given _tag: Tag[GUnixSocketAddress_autoptr] = Tag.Ptr[GUnixSocketAddress](GUnixSocketAddress._tag)
  inline def apply(inline o: Ptr[GUnixSocketAddress]): GUnixSocketAddress_autoptr = o
  extension (v: GUnixSocketAddress_autoptr)
    inline def value: Ptr[GUnixSocketAddress] = v

opaque type GUnixSocketAddress_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GUnixSocketAddress_listautoptr: 
  given _tag: Tag[GUnixSocketAddress_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GUnixSocketAddress_listautoptr = o
  extension (v: GUnixSocketAddress_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GUnixSocketAddress_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GUnixSocketAddress_queueautoptr: 
  given _tag: Tag[GUnixSocketAddress_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GUnixSocketAddress_queueautoptr = o
  extension (v: GUnixSocketAddress_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GUnixSocketAddress_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GUnixSocketAddress_slistautoptr: 
  given _tag: Tag[GUnixSocketAddress_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GUnixSocketAddress_slistautoptr = o
  extension (v: GUnixSocketAddress_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GVfsFileLookupFunc: : a #GVfs : the identifier to look up a #GFile for. This can either be an URI or a parse name as returned by g_file_get_parse_name() _data: user data passed to the function
*/
opaque type GVfsFileLookupFunc = CFuncPtr3[Ptr[GVfs], CString, _root_.sn.gnome.glib.internal.gpointer, Ptr[GFile]]
object GVfsFileLookupFunc: 
  given _tag: Tag[GVfsFileLookupFunc] = Tag.materializeCFuncPtr3[Ptr[GVfs], CString, _root_.sn.gnome.glib.internal.gpointer, Ptr[GFile]]
  inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): GVfsFileLookupFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GVfs], CString, _root_.sn.gnome.glib.internal.gpointer, Ptr[GFile]]): GVfsFileLookupFunc = o
  extension (v: GVfsFileLookupFunc)
    inline def value: CFuncPtr3[Ptr[GVfs], CString, _root_.sn.gnome.glib.internal.gpointer, Ptr[GFile]] = v
    inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

opaque type GVfs_autoptr = Ptr[GVfs]
object GVfs_autoptr: 
  given _tag: Tag[GVfs_autoptr] = Tag.Ptr[GVfs](GVfs._tag)
  inline def apply(inline o: Ptr[GVfs]): GVfs_autoptr = o
  extension (v: GVfs_autoptr)
    inline def value: Ptr[GVfs] = v

opaque type GVfs_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GVfs_listautoptr: 
  given _tag: Tag[GVfs_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GVfs_listautoptr = o
  extension (v: GVfs_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GVfs_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GVfs_queueautoptr: 
  given _tag: Tag[GVfs_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GVfs_queueautoptr = o
  extension (v: GVfs_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GVfs_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GVfs_slistautoptr: 
  given _tag: Tag[GVfs_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GVfs_slistautoptr = o
  extension (v: GVfs_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GVolumeMonitor_autoptr = Ptr[GVolumeMonitor]
object GVolumeMonitor_autoptr: 
  given _tag: Tag[GVolumeMonitor_autoptr] = Tag.Ptr[GVolumeMonitor](GVolumeMonitor._tag)
  inline def apply(inline o: Ptr[GVolumeMonitor]): GVolumeMonitor_autoptr = o
  extension (v: GVolumeMonitor_autoptr)
    inline def value: Ptr[GVolumeMonitor] = v

opaque type GVolumeMonitor_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GVolumeMonitor_listautoptr: 
  given _tag: Tag[GVolumeMonitor_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GVolumeMonitor_listautoptr = o
  extension (v: GVolumeMonitor_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GVolumeMonitor_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GVolumeMonitor_queueautoptr: 
  given _tag: Tag[GVolumeMonitor_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GVolumeMonitor_queueautoptr = o
  extension (v: GVolumeMonitor_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GVolumeMonitor_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GVolumeMonitor_slistautoptr: 
  given _tag: Tag[GVolumeMonitor_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GVolumeMonitor_slistautoptr = o
  extension (v: GVolumeMonitor_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GVolume_autoptr = Ptr[GVolume]
object GVolume_autoptr: 
  given _tag: Tag[GVolume_autoptr] = Tag.Ptr[GVolume](GVolume._tag)
  inline def apply(inline o: Ptr[GVolume]): GVolume_autoptr = o
  extension (v: GVolume_autoptr)
    inline def value: Ptr[GVolume] = v

opaque type GVolume_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GVolume_listautoptr: 
  given _tag: Tag[GVolume_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GVolume_listautoptr = o
  extension (v: GVolume_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GVolume_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GVolume_queueautoptr: 
  given _tag: Tag[GVolume_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GVolume_queueautoptr = o
  extension (v: GVolume_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GVolume_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GVolume_slistautoptr: 
  given _tag: Tag[GVolume_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GVolume_slistautoptr = o
  extension (v: GVolume_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GZlibCompressor_autoptr = Ptr[GZlibCompressor]
object GZlibCompressor_autoptr: 
  given _tag: Tag[GZlibCompressor_autoptr] = Tag.Ptr[GZlibCompressor](GZlibCompressor._tag)
  inline def apply(inline o: Ptr[GZlibCompressor]): GZlibCompressor_autoptr = o
  extension (v: GZlibCompressor_autoptr)
    inline def value: Ptr[GZlibCompressor] = v

opaque type GZlibCompressor_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GZlibCompressor_listautoptr: 
  given _tag: Tag[GZlibCompressor_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GZlibCompressor_listautoptr = o
  extension (v: GZlibCompressor_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GZlibCompressor_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GZlibCompressor_queueautoptr: 
  given _tag: Tag[GZlibCompressor_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GZlibCompressor_queueautoptr = o
  extension (v: GZlibCompressor_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GZlibCompressor_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GZlibCompressor_slistautoptr: 
  given _tag: Tag[GZlibCompressor_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GZlibCompressor_slistautoptr = o
  extension (v: GZlibCompressor_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GZlibDecompressor_autoptr = Ptr[GZlibDecompressor]
object GZlibDecompressor_autoptr: 
  given _tag: Tag[GZlibDecompressor_autoptr] = Tag.Ptr[GZlibDecompressor](GZlibDecompressor._tag)
  inline def apply(inline o: Ptr[GZlibDecompressor]): GZlibDecompressor_autoptr = o
  extension (v: GZlibDecompressor_autoptr)
    inline def value: Ptr[GZlibDecompressor] = v

opaque type GZlibDecompressor_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GZlibDecompressor_listautoptr: 
  given _tag: Tag[GZlibDecompressor_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GZlibDecompressor_listautoptr = o
  extension (v: GZlibDecompressor_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GZlibDecompressor_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GZlibDecompressor_queueautoptr: 
  given _tag: Tag[GZlibDecompressor_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GZlibDecompressor_queueautoptr = o
  extension (v: GZlibDecompressor_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GZlibDecompressor_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GZlibDecompressor_slistautoptr: 
  given _tag: Tag[GZlibDecompressor_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GZlibDecompressor_slistautoptr = o
  extension (v: GZlibDecompressor_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

type pid_t = posix.sys.types.pid_t
object pid_t: 
  val _tag: Tag[pid_t] = summon[Tag[posix.sys.types.pid_t]]
  inline def apply(inline o: posix.sys.types.pid_t): pid_t = o
  extension (v: pid_t)
    inline def value: posix.sys.types.pid_t = v

type uid_t = posix.sys.types.uid_t
object uid_t: 
  val _tag: Tag[uid_t] = summon[Tag[posix.sys.types.uid_t]]
  inline def apply(inline o: posix.sys.types.uid_t): uid_t = o
  extension (v: uid_t)
    inline def value: posix.sys.types.uid_t = v

type va_list = unsafe.CVarArgList
object va_list: 
  val _tag: Tag[va_list] = summon[Tag[unsafe.CVarArgList]]
  inline def apply(inline o: unsafe.CVarArgList): va_list = o
  extension (v: va_list)
    inline def value: unsafe.CVarArgList = v