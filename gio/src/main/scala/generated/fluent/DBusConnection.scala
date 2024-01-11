package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class DBusConnection(private[fluent] val raw: Ptr[GDBusConnection]) extends GObject.Object, AsyncInitable, Initable:
  def addFilter(filter_function : Any /* Some(DBusMessageFilterFunction): GDBusMessageFilterFunction*/, user_data : Ptr[Byte], user_data_free_func : Any /* Some(GLib.DestroyNotify): GDestroyNotify*/): Any /* Some(guint): guint*/ = g_dbus_connection_add_filter(this.raw, filter_function, user_data, user_data_free_func)

  def call(bus_name : String, object_path : String, interface_name : String, method_name : String, parameters : Any /* Some(GLib.Variant): GVariant**/, reply_type : Any /* Some(GLib.VariantType): const GVariantType**/, flags : Any /* Some(DBusCallFlags): GDBusCallFlags*/, timeout_msec : Int, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_dbus_connection_call(this.raw, bus_name, object_path, interface_name, method_name, parameters, reply_type, flags, timeout_msec, cancellable.raw, callback, user_data)

  def callFinish(res : sn.gnome.gio.fluent.AsyncResult): Any /* Some(GLib.Variant): GVariant**/ = g_dbus_connection_call_finish(this.raw, res.raw)

  def callSync(bus_name : String, object_path : String, interface_name : String, method_name : String, parameters : Any /* Some(GLib.Variant): GVariant**/, reply_type : Any /* Some(GLib.VariantType): const GVariantType**/, flags : Any /* Some(DBusCallFlags): GDBusCallFlags*/, timeout_msec : Int, cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(GLib.Variant): GVariant**/ = g_dbus_connection_call_sync(this.raw, bus_name, object_path, interface_name, method_name, parameters, reply_type, flags, timeout_msec, cancellable.raw)

  def callWithUnixFdList(bus_name : String, object_path : String, interface_name : String, method_name : String, parameters : Any /* Some(GLib.Variant): GVariant**/, reply_type : Any /* Some(GLib.VariantType): const GVariantType**/, flags : Any /* Some(DBusCallFlags): GDBusCallFlags*/, timeout_msec : Int, fd_list : sn.gnome.gio.fluent.UnixFDList, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_dbus_connection_call_with_unix_fd_list(this.raw, bus_name, object_path, interface_name, method_name, parameters, reply_type, flags, timeout_msec, fd_list.raw, cancellable.raw, callback, user_data)

  def callWithUnixFdListFinish(out_fd_list : sn.gnome.gio.fluent.UnixFDList, res : sn.gnome.gio.fluent.AsyncResult): Any /* Some(GLib.Variant): GVariant**/ = g_dbus_connection_call_with_unix_fd_list_finish(this.raw, out_fd_list.raw, res.raw)

  def callWithUnixFdListSync(bus_name : String, object_path : String, interface_name : String, method_name : String, parameters : Any /* Some(GLib.Variant): GVariant**/, reply_type : Any /* Some(GLib.VariantType): const GVariantType**/, flags : Any /* Some(DBusCallFlags): GDBusCallFlags*/, timeout_msec : Int, fd_list : sn.gnome.gio.fluent.UnixFDList, out_fd_list : sn.gnome.gio.fluent.UnixFDList, cancellable : sn.gnome.gio.fluent.Cancellable): Any /* Some(GLib.Variant): GVariant**/ = g_dbus_connection_call_with_unix_fd_list_sync(this.raw, bus_name, object_path, interface_name, method_name, parameters, reply_type, flags, timeout_msec, fd_list.raw, out_fd_list.raw, cancellable.raw)

  def close(cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_dbus_connection_close(this.raw, cancellable.raw, callback, user_data)

  def closeFinish(res : sn.gnome.gio.fluent.AsyncResult): Boolean = g_dbus_connection_close_finish(this.raw, res.raw)

  def closeSync(cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_dbus_connection_close_sync(this.raw, cancellable.raw)

  def emitSignal(destination_bus_name : String, object_path : String, interface_name : String, signal_name : String, parameters : Any /* Some(GLib.Variant): GVariant**/): Boolean = g_dbus_connection_emit_signal(this.raw, destination_bus_name, object_path, interface_name, signal_name, parameters)

  def exportActionGroup(object_path : String, action_group : sn.gnome.gio.fluent.ActionGroup): Any /* Some(guint): guint*/ = g_dbus_connection_export_action_group(this.raw, object_path, action_group.raw)

  def exportMenuModel(object_path : String, menu : sn.gnome.gio.fluent.MenuModel): Any /* Some(guint): guint*/ = g_dbus_connection_export_menu_model(this.raw, object_path, menu.raw)

  def flush(cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_dbus_connection_flush(this.raw, cancellable.raw, callback, user_data)

  def flushFinish(res : sn.gnome.gio.fluent.AsyncResult): Boolean = g_dbus_connection_flush_finish(this.raw, res.raw)

  def flushSync(cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_dbus_connection_flush_sync(this.raw, cancellable.raw)

  def getCapabilities(): Any /* Some(DBusCapabilityFlags): GDBusCapabilityFlags*/ = g_dbus_connection_get_capabilities(this.raw)

  def getExitOnClose(): Boolean = g_dbus_connection_get_exit_on_close(this.raw)

  def getFlags(): Any /* Some(DBusConnectionFlags): GDBusConnectionFlags*/ = g_dbus_connection_get_flags(this.raw)

  def getGuid(): String = g_dbus_connection_get_guid(this.raw)

  def getLastSerial(): UInt = g_dbus_connection_get_last_serial(this.raw)

  def getPeerCredentials(): sn.gnome.gio.fluent.Credentials = g_dbus_connection_get_peer_credentials(this.raw)

  def getStream(): sn.gnome.gio.fluent.IOStream = g_dbus_connection_get_stream(this.raw)

  def getUniqueName(): String = g_dbus_connection_get_unique_name(this.raw)

  def isClosed(): Boolean = g_dbus_connection_is_closed(this.raw)

  def registerObject(object_path : String, interface_info : Any /* Some(DBusInterfaceInfo): GDBusInterfaceInfo**/, vtable : Any /* Some(DBusInterfaceVTable): const GDBusInterfaceVTable**/, user_data : Ptr[Byte], user_data_free_func : Any /* Some(GLib.DestroyNotify): GDestroyNotify*/): Any /* Some(guint): guint*/ = g_dbus_connection_register_object(this.raw, object_path, interface_info, vtable, user_data, user_data_free_func)

  def registerObjectWithClosures(object_path : String, interface_info : Any /* Some(DBusInterfaceInfo): GDBusInterfaceInfo**/, method_call_closure : Any /* Some(GObject.Closure): GClosure**/, get_property_closure : Any /* Some(GObject.Closure): GClosure**/, set_property_closure : Any /* Some(GObject.Closure): GClosure**/): Any /* Some(guint): guint*/ = g_dbus_connection_register_object_with_closures(this.raw, object_path, interface_info, method_call_closure, get_property_closure, set_property_closure)

  def registerSubtree(object_path : String, vtable : Any /* Some(DBusSubtreeVTable): const GDBusSubtreeVTable**/, flags : Any /* Some(DBusSubtreeFlags): GDBusSubtreeFlags*/, user_data : Ptr[Byte], user_data_free_func : Any /* Some(GLib.DestroyNotify): GDestroyNotify*/): Any /* Some(guint): guint*/ = g_dbus_connection_register_subtree(this.raw, object_path, vtable, flags, user_data, user_data_free_func)

  def removeFilter(filter_id : Any /* Some(guint): guint*/): Unit = g_dbus_connection_remove_filter(this.raw, filter_id)

  def sendMessage(message : sn.gnome.gio.fluent.DBusMessage, flags : Any /* Some(DBusSendMessageFlags): GDBusSendMessageFlags*/, out_serial : Any /* Some(guint32): volatile guint32**/): Boolean = g_dbus_connection_send_message(this.raw, message.raw, flags, out_serial)

  def sendMessageWithReply(message : sn.gnome.gio.fluent.DBusMessage, flags : Any /* Some(DBusSendMessageFlags): GDBusSendMessageFlags*/, timeout_msec : Int, out_serial : Any /* Some(guint32): volatile guint32**/, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_dbus_connection_send_message_with_reply(this.raw, message.raw, flags, timeout_msec, out_serial, cancellable.raw, callback, user_data)

  def sendMessageWithReplyFinish(res : sn.gnome.gio.fluent.AsyncResult): sn.gnome.gio.fluent.DBusMessage = g_dbus_connection_send_message_with_reply_finish(this.raw, res.raw)

  def sendMessageWithReplySync(message : sn.gnome.gio.fluent.DBusMessage, flags : Any /* Some(DBusSendMessageFlags): GDBusSendMessageFlags*/, timeout_msec : Int, out_serial : Any /* Some(guint32): volatile guint32**/, cancellable : sn.gnome.gio.fluent.Cancellable): sn.gnome.gio.fluent.DBusMessage = g_dbus_connection_send_message_with_reply_sync(this.raw, message.raw, flags, timeout_msec, out_serial, cancellable.raw)

  def setExitOnClose(exit_on_close : Boolean): Unit = g_dbus_connection_set_exit_on_close(this.raw, exit_on_close)

  def signalSubscribe(sender : String, interface_name : String, member : String, object_path : String, arg0 : String, flags : Any /* Some(DBusSignalFlags): GDBusSignalFlags*/, callback : Any /* Some(DBusSignalCallback): GDBusSignalCallback*/, user_data : Ptr[Byte], user_data_free_func : Any /* Some(GLib.DestroyNotify): GDestroyNotify*/): Any /* Some(guint): guint*/ = g_dbus_connection_signal_subscribe(this.raw, sender, interface_name, member, object_path, arg0, flags, callback, user_data, user_data_free_func)

  def signalUnsubscribe(subscription_id : Any /* Some(guint): guint*/): Unit = g_dbus_connection_signal_unsubscribe(this.raw, subscription_id)

  def startMessageProcessing(): Unit = g_dbus_connection_start_message_processing(this.raw)

  def unexportActionGroup(export_id : Any /* Some(guint): guint*/): Unit = g_dbus_connection_unexport_action_group(this.raw, export_id)

  def unexportMenuModel(export_id : Any /* Some(guint): guint*/): Unit = g_dbus_connection_unexport_menu_model(this.raw, export_id)

  def unregisterObject(registration_id : Any /* Some(guint): guint*/): Boolean = g_dbus_connection_unregister_object(this.raw, registration_id)

  def unregisterSubtree(registration_id : Any /* Some(guint): guint*/): Boolean = g_dbus_connection_unregister_subtree(this.raw, registration_id)

end DBusConnection

object DBusConnection:
  def finish(res : sn.gnome.gio.fluent.AsyncResult): DBusConnection = DBusConnection(g_dbus_connection_new_finish(res.raw))

  def forAddressFinish(res : sn.gnome.gio.fluent.AsyncResult): DBusConnection = DBusConnection(g_dbus_connection_new_for_address_finish(res.raw))

  def forAddressSync(address : String, flags : Any /* Some(DBusConnectionFlags): GDBusConnectionFlags*/, observer : sn.gnome.gio.fluent.DBusAuthObserver, cancellable : sn.gnome.gio.fluent.Cancellable): DBusConnection = DBusConnection(g_dbus_connection_new_for_address_sync(address, flags, observer.raw, cancellable.raw))

  def sync(stream : sn.gnome.gio.fluent.IOStream, guid : String, flags : Any /* Some(DBusConnectionFlags): GDBusConnectionFlags*/, observer : sn.gnome.gio.fluent.DBusAuthObserver, cancellable : sn.gnome.gio.fluent.Cancellable): DBusConnection = DBusConnection(g_dbus_connection_new_sync(stream.raw, guid, flags, observer.raw, cancellable.raw))

end DBusConnection
