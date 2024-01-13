package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ActionGroup
import sn.gnome.gio.fluent.AsyncInitable
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.Credentials
import sn.gnome.gio.fluent.DBusMessage
import sn.gnome.gio.fluent.IOStream
import sn.gnome.gio.fluent.Initable
import sn.gnome.gio.fluent.MenuModel
import sn.gnome.gio.fluent.UnixFDList
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GDBusCallFlags
import sn.gnome.gio.internal.GDBusCapabilityFlags
import sn.gnome.gio.internal.GDBusConnectionFlags
import sn.gnome.gio.internal.GDBusInterfaceInfo
import sn.gnome.gio.internal.GDBusInterfaceVTable
import sn.gnome.gio.internal.GDBusMessageFilterFunction
import sn.gnome.gio.internal.GDBusSendMessageFlags
import sn.gnome.gio.internal.GDBusSignalCallback
import sn.gnome.gio.internal.GDBusSignalFlags
import sn.gnome.gio.internal.GDBusSubtreeFlags
import sn.gnome.gio.internal.GDBusSubtreeVTable
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.GVariant
import sn.gnome.glib.internal.GVariantType
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.guint
import sn.gnome.glib.internal.guint32
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GClosure

class DBusConnection(raw: Ptr[GDBusConnection]) extends Object(raw.asInstanceOf), AsyncInitable, Initable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addFilter(filter_function : GDBusMessageFilterFunction, user_data : Ptr[Byte], user_data_free_func : GDestroyNotify): UInt = g_dbus_connection_add_filter(this.raw.asInstanceOf, filter_function, gpointer(user_data), user_data_free_func).value

  def call(bus_name : String | CString, object_path : String | CString, interface_name : String | CString, method_name : String | CString, parameters : Ptr[GVariant], reply_type : Ptr[GVariantType], flags : GDBusCallFlags, timeout_msec : Int, cancellable : Cancellable, callback : GAsyncReadyCallback, user_data : Ptr[Byte])(using Zone): Unit = g_dbus_connection_call(this.raw.asInstanceOf, __sn_extract_string(bus_name).asInstanceOf[Ptr[gchar]], __sn_extract_string(object_path).asInstanceOf[Ptr[gchar]], __sn_extract_string(interface_name).asInstanceOf[Ptr[gchar]], __sn_extract_string(method_name).asInstanceOf[Ptr[gchar]], parameters, reply_type, flags, gint(timeout_msec), cancellable.getUnsafeRawPointer().asInstanceOf, callback, gpointer(user_data))

  def callFinish(res : AsyncResult): Ptr[GVariant] = g_dbus_connection_call_finish(this.raw.asInstanceOf, res.getUnsafeRawPointer().asInstanceOf)

  def callSync(bus_name : String | CString, object_path : String | CString, interface_name : String | CString, method_name : String | CString, parameters : Ptr[GVariant], reply_type : Ptr[GVariantType], flags : GDBusCallFlags, timeout_msec : Int, cancellable : Cancellable)(using Zone): Ptr[GVariant] = g_dbus_connection_call_sync(this.raw.asInstanceOf, __sn_extract_string(bus_name).asInstanceOf[Ptr[gchar]], __sn_extract_string(object_path).asInstanceOf[Ptr[gchar]], __sn_extract_string(interface_name).asInstanceOf[Ptr[gchar]], __sn_extract_string(method_name).asInstanceOf[Ptr[gchar]], parameters, reply_type, flags, gint(timeout_msec), cancellable.getUnsafeRawPointer().asInstanceOf)

  def callWithUnixFdList(bus_name : String | CString, object_path : String | CString, interface_name : String | CString, method_name : String | CString, parameters : Ptr[GVariant], reply_type : Ptr[GVariantType], flags : GDBusCallFlags, timeout_msec : Int, fd_list : UnixFDList, cancellable : Cancellable, callback : GAsyncReadyCallback, user_data : Ptr[Byte])(using Zone): Unit = g_dbus_connection_call_with_unix_fd_list(this.raw.asInstanceOf, __sn_extract_string(bus_name).asInstanceOf[Ptr[gchar]], __sn_extract_string(object_path).asInstanceOf[Ptr[gchar]], __sn_extract_string(interface_name).asInstanceOf[Ptr[gchar]], __sn_extract_string(method_name).asInstanceOf[Ptr[gchar]], parameters, reply_type, flags, gint(timeout_msec), fd_list.getUnsafeRawPointer().asInstanceOf, cancellable.getUnsafeRawPointer().asInstanceOf, callback, gpointer(user_data))

  def callWithUnixFdListFinish(out_fd_list : UnixFDList, res : AsyncResult): Ptr[GVariant] = g_dbus_connection_call_with_unix_fd_list_finish(this.raw.asInstanceOf, out_fd_list.getUnsafeRawPointer().asInstanceOf, res.getUnsafeRawPointer().asInstanceOf)

  def callWithUnixFdListSync(bus_name : String | CString, object_path : String | CString, interface_name : String | CString, method_name : String | CString, parameters : Ptr[GVariant], reply_type : Ptr[GVariantType], flags : GDBusCallFlags, timeout_msec : Int, fd_list : UnixFDList, out_fd_list : UnixFDList, cancellable : Cancellable)(using Zone): Ptr[GVariant] = g_dbus_connection_call_with_unix_fd_list_sync(this.raw.asInstanceOf, __sn_extract_string(bus_name).asInstanceOf[Ptr[gchar]], __sn_extract_string(object_path).asInstanceOf[Ptr[gchar]], __sn_extract_string(interface_name).asInstanceOf[Ptr[gchar]], __sn_extract_string(method_name).asInstanceOf[Ptr[gchar]], parameters, reply_type, flags, gint(timeout_msec), fd_list.getUnsafeRawPointer().asInstanceOf, out_fd_list.getUnsafeRawPointer().asInstanceOf, cancellable.getUnsafeRawPointer().asInstanceOf)

  def close(cancellable : Cancellable, callback : GAsyncReadyCallback, user_data : Ptr[Byte]): Unit = g_dbus_connection_close(this.raw.asInstanceOf, cancellable.getUnsafeRawPointer().asInstanceOf, callback, gpointer(user_data))

  def closeFinish(res : AsyncResult): Boolean = g_dbus_connection_close_finish(this.raw.asInstanceOf, res.getUnsafeRawPointer().asInstanceOf).value.!=(0)

  def closeSync(cancellable : Cancellable): Boolean = g_dbus_connection_close_sync(this.raw.asInstanceOf, cancellable.getUnsafeRawPointer().asInstanceOf).value.!=(0)

  def emitSignal(destination_bus_name : String | CString, object_path : String | CString, interface_name : String | CString, signal_name : String | CString, parameters : Ptr[GVariant])(using Zone): Boolean = g_dbus_connection_emit_signal(this.raw.asInstanceOf, __sn_extract_string(destination_bus_name).asInstanceOf[Ptr[gchar]], __sn_extract_string(object_path).asInstanceOf[Ptr[gchar]], __sn_extract_string(interface_name).asInstanceOf[Ptr[gchar]], __sn_extract_string(signal_name).asInstanceOf[Ptr[gchar]], parameters).value.!=(0)

  def exportActionGroup(object_path : String | CString, action_group : ActionGroup)(using Zone): UInt = g_dbus_connection_export_action_group(this.raw.asInstanceOf, __sn_extract_string(object_path).asInstanceOf[Ptr[gchar]], action_group.getUnsafeRawPointer().asInstanceOf).value

  def exportMenuModel(object_path : String | CString, menu : MenuModel)(using Zone): UInt = g_dbus_connection_export_menu_model(this.raw.asInstanceOf, __sn_extract_string(object_path).asInstanceOf[Ptr[gchar]], menu.getUnsafeRawPointer().asInstanceOf).value

  def flush(cancellable : Cancellable, callback : GAsyncReadyCallback, user_data : Ptr[Byte]): Unit = g_dbus_connection_flush(this.raw.asInstanceOf, cancellable.getUnsafeRawPointer().asInstanceOf, callback, gpointer(user_data))

  def flushFinish(res : AsyncResult): Boolean = g_dbus_connection_flush_finish(this.raw.asInstanceOf, res.getUnsafeRawPointer().asInstanceOf).value.!=(0)

  def flushSync(cancellable : Cancellable): Boolean = g_dbus_connection_flush_sync(this.raw.asInstanceOf, cancellable.getUnsafeRawPointer().asInstanceOf).value.!=(0)

  def getCapabilities(): GDBusCapabilityFlags = g_dbus_connection_get_capabilities(this.raw.asInstanceOf)

  def getExitOnClose(): Boolean = g_dbus_connection_get_exit_on_close(this.raw.asInstanceOf).value.!=(0)

  def getFlags(): GDBusConnectionFlags = g_dbus_connection_get_flags(this.raw.asInstanceOf)

  def getGuid()(using Zone): String = fromCString(g_dbus_connection_get_guid(this.raw.asInstanceOf).asInstanceOf)

  def getLastSerial(): UInt = g_dbus_connection_get_last_serial(this.raw.asInstanceOf).value

  def getPeerCredentials(): Credentials = new Credentials(g_dbus_connection_get_peer_credentials(this.raw.asInstanceOf).asInstanceOf)

  def getStream(): IOStream = new IOStream(g_dbus_connection_get_stream(this.raw.asInstanceOf).asInstanceOf)

  def getUniqueName()(using Zone): String = fromCString(g_dbus_connection_get_unique_name(this.raw.asInstanceOf).asInstanceOf)

  def isClosed(): Boolean = g_dbus_connection_is_closed(this.raw.asInstanceOf).value.!=(0)

  def registerObject(object_path : String | CString, interface_info : Ptr[GDBusInterfaceInfo], vtable : Ptr[GDBusInterfaceVTable], user_data : Ptr[Byte], user_data_free_func : GDestroyNotify)(using Zone): UInt = g_dbus_connection_register_object(this.raw.asInstanceOf, __sn_extract_string(object_path).asInstanceOf[Ptr[gchar]], interface_info, vtable, gpointer(user_data), user_data_free_func).value

  def registerObjectWithClosures(object_path : String | CString, interface_info : Ptr[GDBusInterfaceInfo], method_call_closure : Ptr[GClosure], get_property_closure : Ptr[GClosure], set_property_closure : Ptr[GClosure])(using Zone): UInt = g_dbus_connection_register_object_with_closures(this.raw.asInstanceOf, __sn_extract_string(object_path).asInstanceOf[Ptr[gchar]], interface_info, method_call_closure, get_property_closure, set_property_closure).value

  def registerSubtree(object_path : String | CString, vtable : Ptr[GDBusSubtreeVTable], flags : GDBusSubtreeFlags, user_data : Ptr[Byte], user_data_free_func : GDestroyNotify)(using Zone): UInt = g_dbus_connection_register_subtree(this.raw.asInstanceOf, __sn_extract_string(object_path).asInstanceOf[Ptr[gchar]], vtable, flags, gpointer(user_data), user_data_free_func).value

  def removeFilter(filter_id : UInt): Unit = g_dbus_connection_remove_filter(this.raw.asInstanceOf, guint(filter_id))

  def sendMessage(message : DBusMessage, flags : GDBusSendMessageFlags, out_serial : Any /* Some(guint32): `volatile guint32*` */): Boolean = g_dbus_connection_send_message(this.raw.asInstanceOf, message.getUnsafeRawPointer().asInstanceOf, flags, out_serial).value.!=(0)

  def sendMessageWithReply(message : DBusMessage, flags : GDBusSendMessageFlags, timeout_msec : Int, out_serial : Any /* Some(guint32): `volatile guint32*` */, cancellable : Cancellable, callback : GAsyncReadyCallback, user_data : Ptr[Byte]): Unit = g_dbus_connection_send_message_with_reply(this.raw.asInstanceOf, message.getUnsafeRawPointer().asInstanceOf, flags, gint(timeout_msec), out_serial, cancellable.getUnsafeRawPointer().asInstanceOf, callback, gpointer(user_data))

  def sendMessageWithReplyFinish(res : AsyncResult): DBusMessage = new DBusMessage(g_dbus_connection_send_message_with_reply_finish(this.raw.asInstanceOf, res.getUnsafeRawPointer().asInstanceOf).asInstanceOf)

  def sendMessageWithReplySync(message : DBusMessage, flags : GDBusSendMessageFlags, timeout_msec : Int, out_serial : Any /* Some(guint32): `volatile guint32*` */, cancellable : Cancellable): DBusMessage = new DBusMessage(g_dbus_connection_send_message_with_reply_sync(this.raw.asInstanceOf, message.getUnsafeRawPointer().asInstanceOf, flags, gint(timeout_msec), out_serial, cancellable.getUnsafeRawPointer().asInstanceOf).asInstanceOf)

  def setExitOnClose(exit_on_close : Boolean): Unit = g_dbus_connection_set_exit_on_close(this.raw.asInstanceOf, exit_on_close)

  def signalSubscribe(sender : String | CString, interface_name : String | CString, member : String | CString, object_path : String | CString, arg0 : String | CString, flags : GDBusSignalFlags, callback : GDBusSignalCallback, user_data : Ptr[Byte], user_data_free_func : GDestroyNotify)(using Zone): UInt = g_dbus_connection_signal_subscribe(this.raw.asInstanceOf, __sn_extract_string(sender).asInstanceOf[Ptr[gchar]], __sn_extract_string(interface_name).asInstanceOf[Ptr[gchar]], __sn_extract_string(member).asInstanceOf[Ptr[gchar]], __sn_extract_string(object_path).asInstanceOf[Ptr[gchar]], __sn_extract_string(arg0).asInstanceOf[Ptr[gchar]], flags, callback, gpointer(user_data), user_data_free_func).value

  def signalUnsubscribe(subscription_id : UInt): Unit = g_dbus_connection_signal_unsubscribe(this.raw.asInstanceOf, guint(subscription_id))

  def startMessageProcessing(): Unit = g_dbus_connection_start_message_processing(this.raw.asInstanceOf)

  def unexportActionGroup(export_id : UInt): Unit = g_dbus_connection_unexport_action_group(this.raw.asInstanceOf, guint(export_id))

  def unexportMenuModel(export_id : UInt): Unit = g_dbus_connection_unexport_menu_model(this.raw.asInstanceOf, guint(export_id))

  def unregisterObject(registration_id : UInt): Boolean = g_dbus_connection_unregister_object(this.raw.asInstanceOf, guint(registration_id)).value.!=(0)

  def unregisterSubtree(registration_id : UInt): Boolean = g_dbus_connection_unregister_subtree(this.raw.asInstanceOf, guint(registration_id)).value.!=(0)


  private inline def __sn_extract_string(str: String | CString)(using Zone): CString = 
    str match
      case s: String => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end DBusConnection

object DBusConnection:
  def finish(res : AsyncResult): DBusConnection = new DBusConnection(g_dbus_connection_new_finish(res.getUnsafeRawPointer().asInstanceOf).asInstanceOf)
  def forAddressFinish(res : AsyncResult): DBusConnection = new DBusConnection(g_dbus_connection_new_for_address_finish(res.getUnsafeRawPointer().asInstanceOf).asInstanceOf)
  def forAddressSync(address : String | CString, flags : GDBusConnectionFlags, observer : DBusAuthObserver, cancellable : Cancellable)(using Zone): DBusConnection = new DBusConnection(g_dbus_connection_new_for_address_sync(__sn_extract_string(address).asInstanceOf[Ptr[gchar]], flags, observer.getUnsafeRawPointer().asInstanceOf, cancellable.getUnsafeRawPointer().asInstanceOf).asInstanceOf)
  def sync(stream : IOStream, guid : String | CString, flags : GDBusConnectionFlags, observer : DBusAuthObserver, cancellable : Cancellable)(using Zone): DBusConnection = new DBusConnection(g_dbus_connection_new_sync(stream.getUnsafeRawPointer().asInstanceOf, __sn_extract_string(guid).asInstanceOf[Ptr[gchar]], flags, observer.getUnsafeRawPointer().asInstanceOf, cancellable.getUnsafeRawPointer().asInstanceOf).asInstanceOf)

  private inline def __sn_extract_string(str: String | CString)(using Zone): CString = 
    str match
      case s: String => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end DBusConnection
