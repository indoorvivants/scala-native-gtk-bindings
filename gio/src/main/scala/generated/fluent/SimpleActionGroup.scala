package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class SimpleActionGroup(private[fluent] val raw: Ptr[GSimpleActionGroup]) extends GObject.Object, ActionGroup, ActionMap:
  def addEntries(entries : Array[Byte], n_entries : Int, user_data : Ptr[Byte]): Unit = g_simple_action_group_add_entries(this.raw, entries, n_entries, user_data)

  def insert(action : sn.gnome.gio.fluent.Action): Unit = g_simple_action_group_insert(this.raw, action.raw)

  def lookup(action_name : String): sn.gnome.gio.fluent.Action = g_simple_action_group_lookup(this.raw, action_name)

  def remove(action_name : String): Unit = g_simple_action_group_remove(this.raw, action_name)

end SimpleActionGroup

object SimpleActionGroup:
  def apply(): SimpleActionGroup = SimpleActionGroup(g_simple_action_group_new())

end SimpleActionGroup
