package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

trait TypePlugin:
  def getUnsafeRawPointer(): Ptr[Byte]
end TypePlugin

object TypePlugin:
  class Abstract(raw: Ptr[Byte]) extends TypePlugin:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end TypePlugin
