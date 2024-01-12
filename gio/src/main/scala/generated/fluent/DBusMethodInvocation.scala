package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class DBusMethodInvocation(private[fluent] val raw: Ptr[GDBusMethodInvocation]) extends sn.gnome.gobject.fluent.Object:
  def getConnection(): sn.gnome.gio.fluent.DBusConnection = g_dbus_method_invocation_get_connection(this.raw)

  def getInterfaceName(): String = g_dbus_method_invocation_get_interface_name(this.raw)

  def getMessage(): sn.gnome.gio.fluent.DBusMessage = g_dbus_method_invocation_get_message(this.raw)

  def getMethodInfo(): Any /* Some(DBusMethodInfo): const GDBusMethodInfo**/ = g_dbus_method_invocation_get_method_info(this.raw)

  def getMethodName(): String = g_dbus_method_invocation_get_method_name(this.raw)

  def getObjectPath(): String = g_dbus_method_invocation_get_object_path(this.raw)

  def getParameters(): Any /* Some(GLib.Variant): GVariant**/ = g_dbus_method_invocation_get_parameters(this.raw)

  def getPropertyInfo(): Any /* Some(DBusPropertyInfo): const GDBusPropertyInfo**/ = g_dbus_method_invocation_get_property_info(this.raw)

  def getSender(): String = g_dbus_method_invocation_get_sender(this.raw)

  def getUserData(): Ptr[Byte] = g_dbus_method_invocation_get_user_data(this.raw)

  def returnDbusError(error_name : String, error_message : String): Unit = g_dbus_method_invocation_return_dbus_error(this.raw, error_name, error_message)

  def returnErrorLiteral(domain : Any /* Some(GLib.Quark): GQuark*/, code : Int, message : String): Unit = g_dbus_method_invocation_return_error_literal(this.raw, domain, code, message)

  def returnErrorValist(domain : Any /* Some(GLib.Quark): GQuark*/, code : Int, format : String, var_args : Any /* Some(va_list): va_list*/): Unit = g_dbus_method_invocation_return_error_valist(this.raw, domain, code, format, var_args)

  def returnGerror(error : Any /* Some(GLib.Error): const GError**/): Unit = g_dbus_method_invocation_return_gerror(this.raw, error)

  def returnValue(parameters : Any /* Some(GLib.Variant): GVariant**/): Unit = g_dbus_method_invocation_return_value(this.raw, parameters)

  def returnValueWithUnixFdList(parameters : Any /* Some(GLib.Variant): GVariant**/, fd_list : sn.gnome.gio.fluent.UnixFDList): Unit = g_dbus_method_invocation_return_value_with_unix_fd_list(this.raw, parameters, fd_list.raw)

  def takeError(error : Any /* Some(GLib.Error): GError**/): Unit = g_dbus_method_invocation_take_error(this.raw, error)

end DBusMethodInvocation

