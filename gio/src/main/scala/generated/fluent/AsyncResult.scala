package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait AsyncResult:
  def getUnsafeRawPointer(): Ptr[Byte]
end AsyncResult

object AsyncResult:
  class Abstract(raw: Ptr[Byte]) extends AsyncResult:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end AsyncResult