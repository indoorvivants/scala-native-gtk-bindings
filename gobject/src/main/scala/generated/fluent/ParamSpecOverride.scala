package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*


class ParamSpecOverride(raw: Ptr[GParamSpecOverride]) extends ParamSpec(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ParamSpecOverride