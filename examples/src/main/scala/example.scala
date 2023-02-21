import gio.all.*
import glib.all.*
import gtk.all.*
import gtk.fluent.*
import scala.scalanative.unsafe.*

@main def example =
  gtk_init()

  val callback = CFuncPtr2.fromScalaFunction {
    (application: Ptr[GtkApplication], data: gpointer) =>

      val window = gtk_application_window_new(application)

      gtk_window_set_title(
        window.asInstanceOf[Ptr[GtkWindow]],
        c"Hello from Scala Native"
      )
      gtk_window_set_default_size(window.asPtr[GtkWindow], 200, 200)

      val box = gtk_box_new(GtkOrientation.GTK_ORIENTATION_VERTICAL, 0)
      gtk_widget_set_halign(box, GtkAlign.GTK_ALIGN_CENTER)
      gtk_widget_set_valign(box, GtkAlign.GTK_ALIGN_CENTER)

      gtk_window_set_child(window.asPtr[GtkWindow], box)

      val button = gtk_button_new_with_label(c"Press me")

      val printHello = CFuncPtr2.fromScalaFunction {
        (widget: Ptr[GtkWidget], data: gpointer) =>
          g_print(c"Yoooo, click!".asGString)
      }

      g_signal_connect(button, c"clicked", printHello)

      gtk_box_append(box.asPtr[GtkBox], button)

      gtk_widget_show(window)
  }

  val app = gtk_application_new(
    c"org.gtk.example",
    GApplicationFlags.G_APPLICATION_FLAGS_NONE
  )

  g_signal_connect(
    app,
    c"activate",
    callback
  )

  g_application_run(app.asPtr[GApplication], 0, null)
end example
