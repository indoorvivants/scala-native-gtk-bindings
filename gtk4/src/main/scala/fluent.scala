package sn.gnome.gtk4
package fluent

import scalanative.unsafe.*
import sn.gnome.gobject.internal.*
import sn.gnome.glib.internal.*
import sn.gnome.gobject.internal.GConnectFlags
import sn.gnome.gobject.internal.g_signal_connect_data

extension [T <: CFuncPtr](inline ptr: T)
  inline def asGCallback: GCallback =
    GCallback(
      CFuncPtr.fromPtr[CFuncPtr0[Unit]](CFuncPtr.toPtr(ptr))
    )

extension (cstr: CString)
  inline def asGString: Ptr[gchar] = cstr.asInstanceOf[Ptr[gchar]]

extension [T](ptr: Ptr[T])
  inline def asGpointer: gpointer = gpointer(ptr.asInstanceOf[Ptr[Byte]])
  inline def asPtr[T1]: Ptr[T1] = ptr.asInstanceOf[Ptr[T1]]

inline def g_signal_connect[A: Tag, T <: CFuncPtr](
    instance: Ptr[A],
    detailed_signal: CString,
    c_handler: T,
    data: Ptr[Byte] = null,
    flags: GConnectFlags = GConnectFlags.define(0L)
): gulong =
  g_signal_connect_data(
    instance.asGpointer,
    detailed_signal.asGString,
    c_handler.asGCallback,
    data.asGpointer,
    null.asInstanceOf[GClosureNotify],
    flags
  )
