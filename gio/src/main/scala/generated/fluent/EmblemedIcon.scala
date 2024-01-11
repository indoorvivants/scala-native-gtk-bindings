package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class EmblemedIcon(private[fluent] val raw: Ptr[GEmblemedIcon]) extends GObject.Object, Icon:
  def addEmblem(emblem : sn.gnome.gio.fluent.Emblem): Unit = g_emblemed_icon_add_emblem(this.raw, emblem.raw)

  def clearEmblems(): Unit = g_emblemed_icon_clear_emblems(this.raw)

  def getEmblems(): Any /* Some(GLib.List): GList**/ = g_emblemed_icon_get_emblems(this.raw)

  def getIcon(): sn.gnome.gio.fluent.Icon = g_emblemed_icon_get_icon(this.raw)

end EmblemedIcon

object EmblemedIcon:
  def apply(icon : sn.gnome.gio.fluent.Icon, emblem : sn.gnome.gio.fluent.Emblem): EmblemedIcon = EmblemedIcon(g_emblemed_icon_new(icon.raw, emblem.raw))

end EmblemedIcon
