package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class PropertyAction(private[fluent] val raw: Ptr[GPropertyAction]) extends GObject.Object, Action

object PropertyAction:
  def apply(name : String, `object` : sn.gnome.gobject.fluent.Object, property_name : String): PropertyAction = PropertyAction(g_property_action_new(name, `object`.raw, property_name))

end PropertyAction
