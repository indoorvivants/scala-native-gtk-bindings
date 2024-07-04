package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait DBusObject:
  def getUnsafeRawPointer(): Ptr[Byte]
end DBusObject

object DBusObject:
  class Abstract(raw: Ptr[Byte]) extends DBusObject:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end DBusObject