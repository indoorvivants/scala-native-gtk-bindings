package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class AppLaunchContext(private[fluent] val raw: Ptr[GAppLaunchContext]) extends sn.gnome.gobject.fluent.Object:
  def getDisplay(info : sn.gnome.gio.fluent.AppInfo, files : Any /* Some(GLib.List): GList**/): Any /* Some(utf8): char**/ = g_app_launch_context_get_display(this.raw, info.raw, files)

  def getEnvironment(): Array[Byte] = g_app_launch_context_get_environment(this.raw)

  def getStartupNotifyId(info : sn.gnome.gio.fluent.AppInfo, files : Any /* Some(GLib.List): GList**/): Any /* Some(utf8): char**/ = g_app_launch_context_get_startup_notify_id(this.raw, info.raw, files)

  def launchFailed(startup_notify_id : String): Unit = g_app_launch_context_launch_failed(this.raw, startup_notify_id)

  def setenv(variable : String, value : String): Unit = g_app_launch_context_setenv(this.raw, variable, value)

  def unsetenv(variable : String): Unit = g_app_launch_context_unsetenv(this.raw, variable)

end AppLaunchContext

object AppLaunchContext:
  def apply(): AppLaunchContext = AppLaunchContext(g_app_launch_context_new())

end AppLaunchContext
