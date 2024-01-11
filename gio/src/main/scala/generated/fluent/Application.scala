package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class Application(private[fluent] val raw: Ptr[GApplication]) extends GObject.Object, ActionGroup, ActionMap:
  def activate(): Unit = g_application_activate(this.raw)

  def addMainOption(long_name : String, short_name : Any /* Some(gchar): char*/, flags : Any /* Some(GLib.OptionFlags): GOptionFlags*/, arg : GOptionArg, description : String, arg_description : String): Unit = g_application_add_main_option(this.raw, long_name, short_name, flags, arg, description, arg_description)

  def addMainOptionEntries(entries : Array[Byte]): Unit = g_application_add_main_option_entries(this.raw, entries)

  def addOptionGroup(group : Any /* Some(GLib.OptionGroup): GOptionGroup**/): Unit = g_application_add_option_group(this.raw, group)

  def bindBusyProperty(`object` : sn.gnome.gobject.fluent.Object, property : String): Unit = g_application_bind_busy_property(this.raw, `object`.raw, property)

  def getApplicationId(): String = g_application_get_application_id(this.raw)

  def getDbusConnection(): sn.gnome.gio.fluent.DBusConnection = g_application_get_dbus_connection(this.raw)

  def getDbusObjectPath(): String = g_application_get_dbus_object_path(this.raw)

  def getFlags(): Any /* Some(ApplicationFlags): GApplicationFlags*/ = g_application_get_flags(this.raw)

  def getInactivityTimeout(): Any /* Some(guint): guint*/ = g_application_get_inactivity_timeout(this.raw)

  def getIsBusy(): Boolean = g_application_get_is_busy(this.raw)

  def getIsRegistered(): Boolean = g_application_get_is_registered(this.raw)

  def getIsRemote(): Boolean = g_application_get_is_remote(this.raw)

  def getResourceBasePath(): String = g_application_get_resource_base_path(this.raw)

  def hold(): Unit = g_application_hold(this.raw)

  def markBusy(): Unit = g_application_mark_busy(this.raw)

  def open(files : Array[Byte], n_files : Int, hint : String): Unit = g_application_open(this.raw, files, n_files, hint)

  def quit(): Unit = g_application_quit(this.raw)

  def register(cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_application_register(this.raw, cancellable.raw)

  def release(): Unit = g_application_release(this.raw)

  def run(argc : Int, argv : Array[Byte]): Int = g_application_run(this.raw, argc, argv)

  def sendNotification(id : String, notification : sn.gnome.gio.fluent.Notification): Unit = g_application_send_notification(this.raw, id, notification.raw)

  def setActionGroup(action_group : sn.gnome.gio.fluent.ActionGroup): Unit = g_application_set_action_group(this.raw, action_group.raw)

  def setApplicationId(application_id : String): Unit = g_application_set_application_id(this.raw, application_id)

  def setDefault(): Unit = g_application_set_default(this.raw)

  def setFlags(flags : Any /* Some(ApplicationFlags): GApplicationFlags*/): Unit = g_application_set_flags(this.raw, flags)

  def setInactivityTimeout(inactivity_timeout : Any /* Some(guint): guint*/): Unit = g_application_set_inactivity_timeout(this.raw, inactivity_timeout)

  def setOptionContextDescription(description : String): Unit = g_application_set_option_context_description(this.raw, description)

  def setOptionContextParameterString(parameter_string : String): Unit = g_application_set_option_context_parameter_string(this.raw, parameter_string)

  def setOptionContextSummary(summary : String): Unit = g_application_set_option_context_summary(this.raw, summary)

  def setResourceBasePath(resource_path : String): Unit = g_application_set_resource_base_path(this.raw, resource_path)

  def unbindBusyProperty(`object` : sn.gnome.gobject.fluent.Object, property : String): Unit = g_application_unbind_busy_property(this.raw, `object`.raw, property)

  def unmarkBusy(): Unit = g_application_unmark_busy(this.raw)

  def withdrawNotification(id : String): Unit = g_application_withdraw_notification(this.raw, id)

end Application

object Application:
  def apply(application_id : String, flags : Any /* Some(ApplicationFlags): GApplicationFlags*/): Application = Application(g_application_new(application_id, flags))

end Application
