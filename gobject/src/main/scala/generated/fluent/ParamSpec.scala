package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.GQuark
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.ParamSpec
import sn.gnome.gobject.internal.GParamSpec
import sn.gnome.gobject.internal.GValue

class ParamSpec(raw: Ptr[GParamSpec]):
  def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getBlurb()(using Zone): String = fromCString(
    g_param_spec_get_blurb(this.raw.asInstanceOf).asInstanceOf
  )

  def getDefaultValue(): Ptr[GValue] = g_param_spec_get_default_value(
    this.raw.asInstanceOf
  )

  def getName()(using Zone): String = fromCString(
    g_param_spec_get_name(this.raw.asInstanceOf).asInstanceOf
  )

  def getNameQuark(): GQuark = g_param_spec_get_name_quark(
    this.raw.asInstanceOf
  )

  def getNick()(using Zone): String = fromCString(
    g_param_spec_get_nick(this.raw.asInstanceOf).asInstanceOf
  )

  def getQdata(quark: GQuark): Ptr[Byte] =
    g_param_spec_get_qdata(this.raw.asInstanceOf, quark).value

  def getRedirectTarget(): ParamSpec = new ParamSpec(
    g_param_spec_get_redirect_target(this.raw.asInstanceOf).asInstanceOf
  )

  def ref(): ParamSpec = new ParamSpec(
    g_param_spec_ref(this.raw.asInstanceOf).asInstanceOf
  )

  def refSink(): ParamSpec = new ParamSpec(
    g_param_spec_ref_sink(this.raw.asInstanceOf).asInstanceOf
  )

  def setQdata(quark: GQuark, data: Ptr[Byte]): Unit =
    g_param_spec_set_qdata(this.raw.asInstanceOf, quark, gpointer(data))

  def setQdataFull(
      quark: GQuark,
      data: Ptr[Byte],
      destroy: GDestroyNotify
  ): Unit = g_param_spec_set_qdata_full(
    this.raw.asInstanceOf,
    quark,
    gpointer(data),
    destroy
  )

  def sink(): Unit = g_param_spec_sink(this.raw.asInstanceOf)

  def stealQdata(quark: GQuark): Ptr[Byte] =
    g_param_spec_steal_qdata(this.raw.asInstanceOf, quark).value

  def unref(): Unit = g_param_spec_unref(this.raw.asInstanceOf)

end ParamSpec
