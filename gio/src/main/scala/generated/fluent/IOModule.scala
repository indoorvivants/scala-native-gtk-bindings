package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class IOModule(private[fluent] val raw: Ptr[GIOModule]) extends sn.gnome.gobject.fluent.TypeModule, sn.gnome.gobject.fluent.TypePlugin:
  def load(): Unit = g_io_module_load(this.raw)

  def unload(): Unit = g_io_module_unload(this.raw)

end IOModule

object IOModule:
  def apply(filename : Any /* Some(filename): const gchar**/): IOModule = IOModule(g_io_module_new(filename))

end IOModule
