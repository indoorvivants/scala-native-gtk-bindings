package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class SimplePermission(private[fluent] val raw: Ptr[GSimplePermission]) extends sn.gnome.gio.fluent.Permission

object SimplePermission:
  def apply(allowed : Boolean): SimplePermission = SimplePermission(g_simple_permission_new(allowed))

end SimplePermission
