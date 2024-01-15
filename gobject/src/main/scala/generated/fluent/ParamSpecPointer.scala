package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.ParamSpec

class ParamSpecPointer(raw: Ptr[GParamSpecPointer])
    extends ParamSpec(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ParamSpecPointer
