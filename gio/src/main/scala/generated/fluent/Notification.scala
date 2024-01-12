package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class Notification(private[fluent] val raw: Ptr[GNotification]) extends sn.gnome.gobject.fluent.Object:
  def addButton(label : String, detailed_action : String): Unit = g_notification_add_button(this.raw, label, detailed_action)

  def addButtonWithTargetValue(label : String, action : String, target : Any /* Some(GLib.Variant): GVariant**/): Unit = g_notification_add_button_with_target_value(this.raw, label, action, target)

  def setBody(body : String): Unit = g_notification_set_body(this.raw, body)

  def setCategory(category : String): Unit = g_notification_set_category(this.raw, category)

  def setDefaultAction(detailed_action : String): Unit = g_notification_set_default_action(this.raw, detailed_action)

  def setDefaultActionAndTargetValue(action : String, target : Any /* Some(GLib.Variant): GVariant**/): Unit = g_notification_set_default_action_and_target_value(this.raw, action, target)

  def setIcon(icon : sn.gnome.gio.fluent.Icon): Unit = g_notification_set_icon(this.raw, icon.raw)

  def setPriority(priority : GNotificationPriority): Unit = g_notification_set_priority(this.raw, priority)

  def setTitle(title : String): Unit = g_notification_set_title(this.raw, title)

  def setUrgent(urgent : Boolean): Unit = g_notification_set_urgent(this.raw, urgent)

end Notification

object Notification:
  def apply(title : String): Notification = Notification(g_notification_new(title))

end Notification
