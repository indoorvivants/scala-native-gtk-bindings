package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class FileIcon(private[fluent] val raw: Ptr[GFileIcon]) extends sn.gnome.gobject.fluent.Object, sn.gnome.gio.fluent.Icon, sn.gnome.gio.fluent.LoadableIcon:
  def getFile(): sn.gnome.gio.fluent.File = g_file_icon_get_file(this.raw)

end FileIcon

object FileIcon:
  def apply(file : sn.gnome.gio.fluent.File): FileIcon = FileIcon(g_file_icon_new(file.raw))

end FileIcon
