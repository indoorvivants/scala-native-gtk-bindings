package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class Emblem(private[fluent] val raw: Ptr[GEmblem]) extends GObject.Object, Icon:
  def getIcon(): sn.gnome.gio.fluent.Icon = g_emblem_get_icon(this.raw)

  def getOrigin(): GEmblemOrigin = g_emblem_get_origin(this.raw)

end Emblem

object Emblem:
  def apply(icon : sn.gnome.gio.fluent.Icon): Emblem = Emblem(g_emblem_new(icon.raw))

  def withOrigin(icon : sn.gnome.gio.fluent.Icon, origin : GEmblemOrigin): Emblem = Emblem(g_emblem_new_with_origin(icon.raw, origin))

end Emblem
