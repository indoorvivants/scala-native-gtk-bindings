package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class Settings(private[fluent] val raw: Ptr[GSettings]) extends sn.gnome.gobject.fluent.Object:
  def apply(): Unit = g_settings_apply(this.raw)

  def bind(key : String, `object` : sn.gnome.gobject.fluent.Object, property : String, flags : Any /* Some(SettingsBindFlags): GSettingsBindFlags*/): Unit = g_settings_bind(this.raw, key, `object`.raw, property, flags)

  def bindWithMapping(key : String, `object` : sn.gnome.gobject.fluent.Object, property : String, flags : Any /* Some(SettingsBindFlags): GSettingsBindFlags*/, get_mapping : Any /* Some(SettingsBindGetMapping): GSettingsBindGetMapping*/, set_mapping : Any /* Some(SettingsBindSetMapping): GSettingsBindSetMapping*/, user_data : Ptr[Byte], destroy : Any /* Some(GLib.DestroyNotify): GDestroyNotify*/): Unit = g_settings_bind_with_mapping(this.raw, key, `object`.raw, property, flags, get_mapping, set_mapping, user_data, destroy)

  def bindWritable(key : String, `object` : sn.gnome.gobject.fluent.Object, property : String, inverted : Boolean): Unit = g_settings_bind_writable(this.raw, key, `object`.raw, property, inverted)

  def createAction(key : String): sn.gnome.gio.fluent.Action = g_settings_create_action(this.raw, key)

  def delay(): Unit = g_settings_delay(this.raw)

  def getBoolean(key : String): Boolean = g_settings_get_boolean(this.raw, key)

  def getChild(name : String): sn.gnome.gio.fluent.Settings = g_settings_get_child(this.raw, name)

  def getDefaultValue(key : String): Any /* Some(GLib.Variant): GVariant**/ = g_settings_get_default_value(this.raw, key)

  def getDouble(key : String): Any /* Some(gdouble): gdouble*/ = g_settings_get_double(this.raw, key)

  def getEnum(key : String): Int = g_settings_get_enum(this.raw, key)

  def getFlags(key : String): Any /* Some(guint): guint*/ = g_settings_get_flags(this.raw, key)

  def getHasUnapplied(): Boolean = g_settings_get_has_unapplied(this.raw)

  def getInt(key : String): Int = g_settings_get_int(this.raw, key)

  def getInt64(key : String): Any /* Some(gint64): gint64*/ = g_settings_get_int64(this.raw, key)

  def getMapped(key : String, mapping : Any /* Some(SettingsGetMapping): GSettingsGetMapping*/, user_data : Ptr[Byte]): Ptr[Byte] = g_settings_get_mapped(this.raw, key, mapping, user_data)

  def getRange(key : String): Any /* Some(GLib.Variant): GVariant**/ = g_settings_get_range(this.raw, key)

  def getString(key : String): Any /* Some(utf8): gchar**/ = g_settings_get_string(this.raw, key)

  def getStrv(key : String): Array[Byte] = g_settings_get_strv(this.raw, key)

  def getUint(key : String): Any /* Some(guint): guint*/ = g_settings_get_uint(this.raw, key)

  def getUint64(key : String): ULong = g_settings_get_uint64(this.raw, key)

  def getUserValue(key : String): Any /* Some(GLib.Variant): GVariant**/ = g_settings_get_user_value(this.raw, key)

  def getValue(key : String): Any /* Some(GLib.Variant): GVariant**/ = g_settings_get_value(this.raw, key)

  def isWritable(name : String): Boolean = g_settings_is_writable(this.raw, name)

  def listChildren(): Array[Byte] = g_settings_list_children(this.raw)

  def listKeys(): Array[Byte] = g_settings_list_keys(this.raw)

  def rangeCheck(key : String, value : Any /* Some(GLib.Variant): GVariant**/): Boolean = g_settings_range_check(this.raw, key, value)

  def reset(key : String): Unit = g_settings_reset(this.raw, key)

  def revert(): Unit = g_settings_revert(this.raw)

  def setBoolean(key : String, value : Boolean): Boolean = g_settings_set_boolean(this.raw, key, value)

  def setDouble(key : String, value : Any /* Some(gdouble): gdouble*/): Boolean = g_settings_set_double(this.raw, key, value)

  def setEnum(key : String, value : Int): Boolean = g_settings_set_enum(this.raw, key, value)

  def setFlags(key : String, value : Any /* Some(guint): guint*/): Boolean = g_settings_set_flags(this.raw, key, value)

  def setInt(key : String, value : Int): Boolean = g_settings_set_int(this.raw, key, value)

  def setInt64(key : String, value : Any /* Some(gint64): gint64*/): Boolean = g_settings_set_int64(this.raw, key, value)

  def setString(key : String, value : String): Boolean = g_settings_set_string(this.raw, key, value)

  def setStrv(key : String, value : Array[Byte]): Boolean = g_settings_set_strv(this.raw, key, value)

  def setUint(key : String, value : Any /* Some(guint): guint*/): Boolean = g_settings_set_uint(this.raw, key, value)

  def setUint64(key : String, value : ULong): Boolean = g_settings_set_uint64(this.raw, key, value)

  def setValue(key : String, value : Any /* Some(GLib.Variant): GVariant**/): Boolean = g_settings_set_value(this.raw, key, value)

end Settings

object Settings:
  def apply(schema_id : String): Settings = Settings(g_settings_new(schema_id))

  def full(schema : Any /* Some(SettingsSchema): GSettingsSchema**/, backend : sn.gnome.gio.fluent.SettingsBackend, path : String): Settings = Settings(g_settings_new_full(schema, backend.raw, path))

  def withBackend(schema_id : String, backend : sn.gnome.gio.fluent.SettingsBackend): Settings = Settings(g_settings_new_with_backend(schema_id, backend.raw))

  def withBackendAndPath(schema_id : String, backend : sn.gnome.gio.fluent.SettingsBackend, path : String): Settings = Settings(g_settings_new_with_backend_and_path(schema_id, backend.raw, path))

  def withPath(schema_id : String, path : String): Settings = Settings(g_settings_new_with_path(schema_id, path))

end Settings
