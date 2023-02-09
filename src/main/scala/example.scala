package sample

import gtk.functions.*
import gtk.enumerations.*
import gtk.structs.*
import gtk.aliases.*

import scalanative.unsafe.*

@main def example =
  gtk_init()

  val callback = CFuncPtr2.fromScalaFunction {
    (application: Ptr[GtkApplication], data: gpointer) =>

      val window = gtk_application_window_new(application)

      gtk_window_set_title(
        window.asInstanceOf[Ptr[GtkWindow]],
        c"Hello from Scala Native"
      )

      gtk_window_set_default_size(window.asInstanceOf[Ptr[GtkWindow]], 500, 500)

      gtk_widget_show(window)
  }

  val g_callback = GCallback(
    CFuncPtr.fromPtr[CFuncPtr0[Unit]](CFuncPtr.toPtr(callback))
  )

  val app = gtk_application_new(
    c"org.gtk.example",
    GApplicationFlags.G_APPLICATION_FLAGS_NONE
  )

  g_signal_connect_data(
    app.asInstanceOf[gpointer],
    c"activate".asInstanceOf[Ptr[gchar]],
    g_callback,
    null.asInstanceOf[gpointer],
    null.asInstanceOf[GClosureNotify],
    GConnectFlags.define(0L)
  )

  g_application_run(app.asInstanceOf[Ptr[GApplication]], 0, null)

  System.in.read()
end example
