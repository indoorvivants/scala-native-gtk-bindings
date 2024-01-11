package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class FileInfo(private[fluent] val raw: Ptr[GFileInfo]) extends GObject.Object:
  def clearStatus(): Unit = g_file_info_clear_status(this.raw)

  def copyInto(dest_info : sn.gnome.gio.fluent.FileInfo): Unit = g_file_info_copy_into(this.raw, dest_info.raw)

  def dup(): sn.gnome.gio.fluent.FileInfo = g_file_info_dup(this.raw)

  def getAccessDateTime(): Any /* Some(GLib.DateTime): GDateTime**/ = g_file_info_get_access_date_time(this.raw)

  def getAttributeAsString(attribute : String): Any /* Some(utf8): char**/ = g_file_info_get_attribute_as_string(this.raw, attribute)

  def getAttributeBoolean(attribute : String): Boolean = g_file_info_get_attribute_boolean(this.raw, attribute)

  def getAttributeByteString(attribute : String): String = g_file_info_get_attribute_byte_string(this.raw, attribute)

  def getAttributeData(attribute : String, `type` : GFileAttributeType, value_pp : Any /* Some(gpointer): gpointer**/, status : GFileAttributeStatus): Boolean = g_file_info_get_attribute_data(this.raw, attribute, `type`, value_pp, status)

  def getAttributeFilePath(attribute : String): String = g_file_info_get_attribute_file_path(this.raw, attribute)

  def getAttributeInt32(attribute : String): Any /* Some(gint32): gint32*/ = g_file_info_get_attribute_int32(this.raw, attribute)

  def getAttributeInt64(attribute : String): Any /* Some(gint64): gint64*/ = g_file_info_get_attribute_int64(this.raw, attribute)

  def getAttributeObject(attribute : String): sn.gnome.gobject.fluent.Object = g_file_info_get_attribute_object(this.raw, attribute)

  def getAttributeStatus(attribute : String): GFileAttributeStatus = g_file_info_get_attribute_status(this.raw, attribute)

  def getAttributeString(attribute : String): String = g_file_info_get_attribute_string(this.raw, attribute)

  def getAttributeStringv(attribute : String): Array[Byte] = g_file_info_get_attribute_stringv(this.raw, attribute)

  def getAttributeType(attribute : String): GFileAttributeType = g_file_info_get_attribute_type(this.raw, attribute)

  def getAttributeUint32(attribute : String): UInt = g_file_info_get_attribute_uint32(this.raw, attribute)

  def getAttributeUint64(attribute : String): ULong = g_file_info_get_attribute_uint64(this.raw, attribute)

  def getContentType(): String = g_file_info_get_content_type(this.raw)

  def getCreationDateTime(): Any /* Some(GLib.DateTime): GDateTime**/ = g_file_info_get_creation_date_time(this.raw)

  def getDeletionDate(): Any /* Some(GLib.DateTime): GDateTime**/ = g_file_info_get_deletion_date(this.raw)

  def getDisplayName(): String = g_file_info_get_display_name(this.raw)

  def getEditName(): String = g_file_info_get_edit_name(this.raw)

  def getEtag(): String = g_file_info_get_etag(this.raw)

  def getFileType(): GFileType = g_file_info_get_file_type(this.raw)

  def getIcon(): sn.gnome.gio.fluent.Icon = g_file_info_get_icon(this.raw)

  def getIsBackup(): Boolean = g_file_info_get_is_backup(this.raw)

  def getIsHidden(): Boolean = g_file_info_get_is_hidden(this.raw)

  def getIsSymlink(): Boolean = g_file_info_get_is_symlink(this.raw)

  def getModificationDateTime(): Any /* Some(GLib.DateTime): GDateTime**/ = g_file_info_get_modification_date_time(this.raw)

  def getModificationTime(result : Any /* Some(GLib.TimeVal): GTimeVal**/): Unit = g_file_info_get_modification_time(this.raw, result)

  def getName(): String = g_file_info_get_name(this.raw)

  def getSize(): Any /* Some(gint64): goffset*/ = g_file_info_get_size(this.raw)

  def getSortOrder(): Any /* Some(gint32): gint32*/ = g_file_info_get_sort_order(this.raw)

  def getSymbolicIcon(): sn.gnome.gio.fluent.Icon = g_file_info_get_symbolic_icon(this.raw)

  def getSymlinkTarget(): String = g_file_info_get_symlink_target(this.raw)

  def hasAttribute(attribute : String): Boolean = g_file_info_has_attribute(this.raw, attribute)

  def hasNamespace(name_space : String): Boolean = g_file_info_has_namespace(this.raw, name_space)

  def listAttributes(name_space : String): Array[Byte] = g_file_info_list_attributes(this.raw, name_space)

  def removeAttribute(attribute : String): Unit = g_file_info_remove_attribute(this.raw, attribute)

  def setAccessDateTime(atime : Any /* Some(GLib.DateTime): GDateTime**/): Unit = g_file_info_set_access_date_time(this.raw, atime)

  def setAttribute(attribute : String, `type` : GFileAttributeType, value_p : Ptr[Byte]): Unit = g_file_info_set_attribute(this.raw, attribute, `type`, value_p)

  def setAttributeBoolean(attribute : String, attr_value : Boolean): Unit = g_file_info_set_attribute_boolean(this.raw, attribute, attr_value)

  def setAttributeByteString(attribute : String, attr_value : String): Unit = g_file_info_set_attribute_byte_string(this.raw, attribute, attr_value)

  def setAttributeFilePath(attribute : String, attr_value : String): Unit = g_file_info_set_attribute_file_path(this.raw, attribute, attr_value)

  def setAttributeInt32(attribute : String, attr_value : Any /* Some(gint32): gint32*/): Unit = g_file_info_set_attribute_int32(this.raw, attribute, attr_value)

  def setAttributeInt64(attribute : String, attr_value : Any /* Some(gint64): gint64*/): Unit = g_file_info_set_attribute_int64(this.raw, attribute, attr_value)

  def setAttributeMask(mask : Any /* Some(FileAttributeMatcher): GFileAttributeMatcher**/): Unit = g_file_info_set_attribute_mask(this.raw, mask)

  def setAttributeObject(attribute : String, attr_value : sn.gnome.gobject.fluent.Object): Unit = g_file_info_set_attribute_object(this.raw, attribute, attr_value.raw)

  def setAttributeStatus(attribute : String, status : GFileAttributeStatus): Boolean = g_file_info_set_attribute_status(this.raw, attribute, status)

  def setAttributeString(attribute : String, attr_value : String): Unit = g_file_info_set_attribute_string(this.raw, attribute, attr_value)

  def setAttributeStringv(attribute : String, attr_value : Array[Byte]): Unit = g_file_info_set_attribute_stringv(this.raw, attribute, attr_value)

  def setAttributeUint32(attribute : String, attr_value : UInt): Unit = g_file_info_set_attribute_uint32(this.raw, attribute, attr_value)

  def setAttributeUint64(attribute : String, attr_value : ULong): Unit = g_file_info_set_attribute_uint64(this.raw, attribute, attr_value)

  def setContentType(content_type : String): Unit = g_file_info_set_content_type(this.raw, content_type)

  def setCreationDateTime(creation_time : Any /* Some(GLib.DateTime): GDateTime**/): Unit = g_file_info_set_creation_date_time(this.raw, creation_time)

  def setDisplayName(display_name : String): Unit = g_file_info_set_display_name(this.raw, display_name)

  def setEditName(edit_name : String): Unit = g_file_info_set_edit_name(this.raw, edit_name)

  def setFileType(`type` : GFileType): Unit = g_file_info_set_file_type(this.raw, `type`)

  def setIcon(icon : sn.gnome.gio.fluent.Icon): Unit = g_file_info_set_icon(this.raw, icon.raw)

  def setIsHidden(is_hidden : Boolean): Unit = g_file_info_set_is_hidden(this.raw, is_hidden)

  def setIsSymlink(is_symlink : Boolean): Unit = g_file_info_set_is_symlink(this.raw, is_symlink)

  def setModificationDateTime(mtime : Any /* Some(GLib.DateTime): GDateTime**/): Unit = g_file_info_set_modification_date_time(this.raw, mtime)

  def setModificationTime(mtime : Any /* Some(GLib.TimeVal): GTimeVal**/): Unit = g_file_info_set_modification_time(this.raw, mtime)

  def setName(name : String): Unit = g_file_info_set_name(this.raw, name)

  def setSize(size : Any /* Some(gint64): goffset*/): Unit = g_file_info_set_size(this.raw, size)

  def setSortOrder(sort_order : Any /* Some(gint32): gint32*/): Unit = g_file_info_set_sort_order(this.raw, sort_order)

  def setSymbolicIcon(icon : sn.gnome.gio.fluent.Icon): Unit = g_file_info_set_symbolic_icon(this.raw, icon.raw)

  def setSymlinkTarget(symlink_target : String): Unit = g_file_info_set_symlink_target(this.raw, symlink_target)

  def unsetAttributeMask(): Unit = g_file_info_unset_attribute_mask(this.raw)

end FileInfo

object FileInfo:
  def apply(): FileInfo = FileInfo(g_file_info_new())

end FileInfo
