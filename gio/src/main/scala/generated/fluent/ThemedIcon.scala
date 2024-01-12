package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class ThemedIcon(private[fluent] val raw: Ptr[GThemedIcon]) extends sn.gnome.gobject.fluent.Object, sn.gnome.gio.fluent.Icon:
  def appendName(iconname : String): Unit = g_themed_icon_append_name(this.raw, iconname)

  def getNames(): Array[Byte] = g_themed_icon_get_names(this.raw)

  def prependName(iconname : String): Unit = g_themed_icon_prepend_name(this.raw, iconname)

end ThemedIcon

object ThemedIcon:
  def apply(iconname : String): ThemedIcon = ThemedIcon(g_themed_icon_new(iconname))

  def fromNames(iconnames : Array[Byte], len : Int): ThemedIcon = ThemedIcon(g_themed_icon_new_from_names(iconnames, len))

  def withDefaultFallbacks(iconname : String): ThemedIcon = ThemedIcon(g_themed_icon_new_with_default_fallbacks(iconname))

end ThemedIcon
