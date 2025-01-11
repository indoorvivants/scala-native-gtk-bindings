package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.ParamSpec
import sn.gnome.gobject.internal.GParamSpecInt64

class ParamSpecInt64(raw: Ptr[GParamSpecInt64])
    extends ParamSpec(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ParamSpecInt64
