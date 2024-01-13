package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GTree
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object

class SettingsBackend(raw: Ptr[GSettingsBackend]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def changed(key : String | CString, origin_tag : Ptr[Byte])(using Zone): Unit = g_settings_backend_changed(this.raw.asInstanceOf, __sn_extract_string(key).asInstanceOf[Ptr[gchar]], gpointer(origin_tag))

  def changedTree(tree : Ptr[GTree], origin_tag : Ptr[Byte]): Unit = g_settings_backend_changed_tree(this.raw.asInstanceOf, tree, gpointer(origin_tag))

  def keysChanged(path : String | CString, items : Ptr[CString], origin_tag : Ptr[Byte])(using Zone): Unit = g_settings_backend_keys_changed(this.raw.asInstanceOf, __sn_extract_string(path).asInstanceOf[Ptr[gchar]], items.asInstanceOf, gpointer(origin_tag))

  def pathChanged(path : String | CString, origin_tag : Ptr[Byte])(using Zone): Unit = g_settings_backend_path_changed(this.raw.asInstanceOf, __sn_extract_string(path).asInstanceOf[Ptr[gchar]], gpointer(origin_tag))

  def pathWritableChanged(path : String | CString)(using Zone): Unit = g_settings_backend_path_writable_changed(this.raw.asInstanceOf, __sn_extract_string(path).asInstanceOf[Ptr[gchar]])

  def writableChanged(key : String | CString)(using Zone): Unit = g_settings_backend_writable_changed(this.raw.asInstanceOf, __sn_extract_string(key).asInstanceOf[Ptr[gchar]])


  private inline def __sn_extract_string(str: String | CString)(using Zone): CString = 
    str match
      case s: String => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end SettingsBackend
