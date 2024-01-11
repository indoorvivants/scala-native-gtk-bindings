package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class SimpleAction(private[fluent] val raw: Ptr[GSimpleAction]) extends GObject.Object, Action:
  def setEnabled(enabled : Boolean): Unit = g_simple_action_set_enabled(this.raw, enabled)

  def setState(value : Any /* Some(GLib.Variant): GVariant**/): Unit = g_simple_action_set_state(this.raw, value)

  def setStateHint(state_hint : Any /* Some(GLib.Variant): GVariant**/): Unit = g_simple_action_set_state_hint(this.raw, state_hint)

end SimpleAction

object SimpleAction:
  def apply(name : String, parameter_type : Any /* Some(GLib.VariantType): const GVariantType**/): SimpleAction = SimpleAction(g_simple_action_new(name, parameter_type))

  def stateful(name : String, parameter_type : Any /* Some(GLib.VariantType): const GVariantType**/, state : Any /* Some(GLib.Variant): GVariant**/): SimpleAction = SimpleAction(g_simple_action_new_stateful(name, parameter_type, state))

end SimpleAction
