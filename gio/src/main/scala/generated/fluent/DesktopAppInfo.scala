package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AppInfo
import sn.gnome.gio.fluent.AppLaunchContext
import sn.gnome.gio.internal.GDesktopAppInfo
import sn.gnome.gio.internal.GDesktopAppLaunchCallback
import sn.gnome.glib.internal.GKeyFile
import sn.gnome.glib.internal.GList
import sn.gnome.glib.internal.GSpawnChildSetupFunc
import sn.gnome.glib.internal.GSpawnFlags
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object

class DesktopAppInfo(raw: Ptr[GDesktopAppInfo])
    extends Object(raw.asInstanceOf),
      AppInfo:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getActionName(action_name: String | CString)(using Zone): String =
    fromCString(
      g_desktop_app_info_get_action_name(
        this.raw.asInstanceOf,
        __sn_extract_string(action_name).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )

  def getBoolean(key: String | CString)(using Zone): Boolean =
    g_desktop_app_info_get_boolean(
      this.raw.asInstanceOf,
      __sn_extract_string(key)
    ).value.!=(0)

  def getCategories()(using Zone): String = g_desktop_app_info_get_categories(
    this.raw.asInstanceOf
  )

  def getFilename()(using Zone): String = g_desktop_app_info_get_filename(
    this.raw.asInstanceOf
  )

  def getGenericName()(using Zone): String =
    g_desktop_app_info_get_generic_name(this.raw.asInstanceOf)

  def getIsHidden(): Boolean =
    g_desktop_app_info_get_is_hidden(this.raw.asInstanceOf).value.!=(0)

  def getLocaleString(key: String | CString)(using Zone): String = fromCString(
    g_desktop_app_info_get_locale_string(
      this.raw.asInstanceOf,
      __sn_extract_string(key)
    ).asInstanceOf
  )

  def getNodisplay(): Boolean =
    g_desktop_app_info_get_nodisplay(this.raw.asInstanceOf).value.!=(0)

  def getShowIn(desktop_env: String | CString)(using Zone): Boolean =
    g_desktop_app_info_get_show_in(
      this.raw.asInstanceOf,
      __sn_extract_string(desktop_env).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)

  def getStartupWmClass()(using Zone): String =
    g_desktop_app_info_get_startup_wm_class(this.raw.asInstanceOf)

  def getString(key: String | CString)(using Zone): String = fromCString(
    g_desktop_app_info_get_string(
      this.raw.asInstanceOf,
      __sn_extract_string(key)
    ).asInstanceOf
  )

  def hasKey(key: String | CString)(using Zone): Boolean =
    g_desktop_app_info_has_key(
      this.raw.asInstanceOf,
      __sn_extract_string(key)
    ).value.!=(0)

  def launchAction(
      action_name: String | CString,
      launch_context: AppLaunchContext
  )(using Zone): Unit = g_desktop_app_info_launch_action(
    this.raw.asInstanceOf,
    __sn_extract_string(action_name).asInstanceOf[Ptr[gchar]],
    launch_context.getUnsafeRawPointer().asInstanceOf
  )

  def launchUrisAsManager(
      uris: Ptr[GList],
      launch_context: AppLaunchContext,
      spawn_flags: GSpawnFlags,
      user_setup: GSpawnChildSetupFunc,
      user_setup_data: Ptr[Byte],
      pid_callback: GDesktopAppLaunchCallback,
      pid_callback_data: Ptr[Byte]
  ): Boolean = g_desktop_app_info_launch_uris_as_manager(
    this.raw.asInstanceOf,
    uris,
    launch_context.getUnsafeRawPointer().asInstanceOf,
    spawn_flags,
    user_setup,
    gpointer(user_setup_data),
    pid_callback,
    gpointer(pid_callback_data)
  ).value.!=(0)

  def launchUrisAsManagerWithFds(
      uris: Ptr[GList],
      launch_context: AppLaunchContext,
      spawn_flags: GSpawnFlags,
      user_setup: GSpawnChildSetupFunc,
      user_setup_data: Ptr[Byte],
      pid_callback: GDesktopAppLaunchCallback,
      pid_callback_data: Ptr[Byte],
      stdin_fd: Int,
      stdout_fd: Int,
      stderr_fd: Int
  ): Boolean = g_desktop_app_info_launch_uris_as_manager_with_fds(
    this.raw.asInstanceOf,
    uris,
    launch_context.getUnsafeRawPointer().asInstanceOf,
    spawn_flags,
    user_setup,
    gpointer(user_setup_data),
    pid_callback,
    gpointer(pid_callback_data),
    gint(stdin_fd),
    gint(stdout_fd),
    gint(stderr_fd)
  ).value.!=(0)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end DesktopAppInfo

object DesktopAppInfo:
  def apply(desktop_id: String | CString)(using Zone): DesktopAppInfo =
    new DesktopAppInfo(
      g_desktop_app_info_new(__sn_extract_string(desktop_id)).asInstanceOf
    )
  def fromFilename(filename: String | CString)(using Zone): DesktopAppInfo =
    new DesktopAppInfo(
      g_desktop_app_info_new_from_filename(
        __sn_extract_string(filename)
      ).asInstanceOf
    )
  def fromKeyfile(key_file: Ptr[GKeyFile]): DesktopAppInfo = new DesktopAppInfo(
    g_desktop_app_info_new_from_keyfile(key_file).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end DesktopAppInfo
