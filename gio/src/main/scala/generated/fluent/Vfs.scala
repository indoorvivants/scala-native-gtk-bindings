package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class Vfs(private[fluent] val raw: Ptr[GVfs]) extends GObject.Object:
  def getFileForPath(path : String): sn.gnome.gio.fluent.File = g_vfs_get_file_for_path(this.raw, path)

  def getFileForUri(uri : String): sn.gnome.gio.fluent.File = g_vfs_get_file_for_uri(this.raw, uri)

  def getSupportedUriSchemes(): Array[Byte] = g_vfs_get_supported_uri_schemes(this.raw)

  def isActive(): Boolean = g_vfs_is_active(this.raw)

  def parseName(parse_name : String): sn.gnome.gio.fluent.File = g_vfs_parse_name(this.raw, parse_name)

  def registerUriScheme(scheme : String, uri_func : Any /* Some(VfsFileLookupFunc): GVfsFileLookupFunc*/, uri_data : Ptr[Byte], uri_destroy : Any /* Some(GLib.DestroyNotify): GDestroyNotify*/, parse_name_func : Any /* Some(VfsFileLookupFunc): GVfsFileLookupFunc*/, parse_name_data : Ptr[Byte], parse_name_destroy : Any /* Some(GLib.DestroyNotify): GDestroyNotify*/): Boolean = g_vfs_register_uri_scheme(this.raw, scheme, uri_func, uri_data, uri_destroy, parse_name_func, parse_name_data, parse_name_destroy)

  def unregisterUriScheme(scheme : String): Boolean = g_vfs_unregister_uri_scheme(this.raw, scheme)

end Vfs

