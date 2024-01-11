package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class DesktopAppInfo(private[fluent] val raw: Ptr[GDesktopAppInfo]) extends GObject.Object, AppInfo:
  def getActionName(action_name : String): Any /* Some(utf8): gchar**/ = g_desktop_app_info_get_action_name(this.raw, action_name)

  def getBoolean(key : String): Boolean = g_desktop_app_info_get_boolean(this.raw, key)

  def getCategories(): String = g_desktop_app_info_get_categories(this.raw)

  def getFilename(): String = g_desktop_app_info_get_filename(this.raw)

  def getGenericName(): String = g_desktop_app_info_get_generic_name(this.raw)

  def getIsHidden(): Boolean = g_desktop_app_info_get_is_hidden(this.raw)

  def getKeywords(): Array[Byte] = g_desktop_app_info_get_keywords(this.raw)

  def getLocaleString(key : String): Any /* Some(utf8): char**/ = g_desktop_app_info_get_locale_string(this.raw, key)

  def getNodisplay(): Boolean = g_desktop_app_info_get_nodisplay(this.raw)

  def getShowIn(desktop_env : String): Boolean = g_desktop_app_info_get_show_in(this.raw, desktop_env)

  def getStartupWmClass(): String = g_desktop_app_info_get_startup_wm_class(this.raw)

  def getString(key : String): Any /* Some(utf8): char**/ = g_desktop_app_info_get_string(this.raw, key)

  def getStringList(key : String, length : Any /* Some(gsize): gsize**/): Array[Byte] = g_desktop_app_info_get_string_list(this.raw, key, length)

  def hasKey(key : String): Boolean = g_desktop_app_info_has_key(this.raw, key)

  def launchAction(action_name : String, launch_context : sn.gnome.gio.fluent.AppLaunchContext): Unit = g_desktop_app_info_launch_action(this.raw, action_name, launch_context.raw)

  def launchUrisAsManager(uris : Any /* Some(GLib.List): GList**/, launch_context : sn.gnome.gio.fluent.AppLaunchContext, spawn_flags : Any /* Some(GLib.SpawnFlags): GSpawnFlags*/, user_setup : Any /* Some(GLib.SpawnChildSetupFunc): GSpawnChildSetupFunc*/, user_setup_data : Ptr[Byte], pid_callback : Any /* Some(DesktopAppLaunchCallback): GDesktopAppLaunchCallback*/, pid_callback_data : Ptr[Byte]): Boolean = g_desktop_app_info_launch_uris_as_manager(this.raw, uris, launch_context.raw, spawn_flags, user_setup, user_setup_data, pid_callback, pid_callback_data)

  def launchUrisAsManagerWithFds(uris : Any /* Some(GLib.List): GList**/, launch_context : sn.gnome.gio.fluent.AppLaunchContext, spawn_flags : Any /* Some(GLib.SpawnFlags): GSpawnFlags*/, user_setup : Any /* Some(GLib.SpawnChildSetupFunc): GSpawnChildSetupFunc*/, user_setup_data : Ptr[Byte], pid_callback : Any /* Some(DesktopAppLaunchCallback): GDesktopAppLaunchCallback*/, pid_callback_data : Ptr[Byte], stdin_fd : Int, stdout_fd : Int, stderr_fd : Int): Boolean = g_desktop_app_info_launch_uris_as_manager_with_fds(this.raw, uris, launch_context.raw, spawn_flags, user_setup, user_setup_data, pid_callback, pid_callback_data, stdin_fd, stdout_fd, stderr_fd)

  def listActions(): Array[Byte] = g_desktop_app_info_list_actions(this.raw)

end DesktopAppInfo

object DesktopAppInfo:
  def apply(desktop_id : String): DesktopAppInfo = DesktopAppInfo(g_desktop_app_info_new(desktop_id))

  def fromFilename(filename : String): DesktopAppInfo = DesktopAppInfo(g_desktop_app_info_new_from_filename(filename))

  def fromKeyfile(key_file : Any /* Some(GLib.KeyFile): GKeyFile**/): DesktopAppInfo = DesktopAppInfo(g_desktop_app_info_new_from_keyfile(key_file))

end DesktopAppInfo
