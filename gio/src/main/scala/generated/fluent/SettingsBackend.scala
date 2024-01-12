package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class SettingsBackend(private[fluent] val raw: Ptr[GSettingsBackend]) extends sn.gnome.gobject.fluent.Object:
  def changed(key : String, origin_tag : Ptr[Byte]): Unit = g_settings_backend_changed(this.raw, key, origin_tag)

  def changedTree(tree : Any /* Some(GLib.Tree): GTree**/, origin_tag : Ptr[Byte]): Unit = g_settings_backend_changed_tree(this.raw, tree, origin_tag)

  def keysChanged(path : String, items : Array[Byte], origin_tag : Ptr[Byte]): Unit = g_settings_backend_keys_changed(this.raw, path, items, origin_tag)

  def pathChanged(path : String, origin_tag : Ptr[Byte]): Unit = g_settings_backend_path_changed(this.raw, path, origin_tag)

  def pathWritableChanged(path : String): Unit = g_settings_backend_path_writable_changed(this.raw, path)

  def writableChanged(key : String): Unit = g_settings_backend_writable_changed(this.raw, key)

end SettingsBackend

