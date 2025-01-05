package sn.gnome.gobject.internal

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GBinding = CStruct0
object GBinding:
  given _tag: Tag[GBinding] = Tag.materializeCStruct0Tag

opaque type GBindingGroup = CStruct0
object GBindingGroup:
  given _tag: Tag[GBindingGroup] = Tag.materializeCStruct0Tag

opaque type GCClosure = CStruct2[GClosure, _root_.sn.gnome.glib.internal.gpointer]
object GCClosure:
  given _tag: Tag[GCClosure] = Tag.materializeCStruct2Tag[GClosure, _root_.sn.gnome.glib.internal.gpointer]
  def apply()(using Zone): Ptr[GCClosure] = scala.scalanative.unsafe.alloc[GCClosure](1)
  def apply(closure : GClosure, callback : _root_.sn.gnome.glib.internal.gpointer)(using Zone): Ptr[GCClosure] = 
    val ____ptr = apply()
    (!____ptr).closure = closure
    (!____ptr).callback = callback
    ____ptr
  extension (struct: GCClosure)
    def closure : GClosure = struct._1
    def closure_=(value: GClosure): Unit = !struct.at1 = value
    def callback : _root_.sn.gnome.glib.internal.gpointer = struct._2
    def callback_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at2 = value

opaque type GClosure = CStruct13[_root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, CFuncPtr6[Ptr[Byte], Ptr[GValue], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit], _root_.sn.gnome.glib.internal.gpointer, Ptr[Byte]]
object GClosure:
  given _tag: Tag[GClosure] = Tag.materializeCStruct13Tag[_root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, CFuncPtr6[Ptr[Byte], Ptr[GValue], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit], _root_.sn.gnome.glib.internal.gpointer, Ptr[Byte]]
  def apply()(using Zone): Ptr[GClosure] = scala.scalanative.unsafe.alloc[GClosure](1)
  def apply(ref_count : _root_.sn.gnome.glib.internal.guint, meta_marshal_nouse : _root_.sn.gnome.glib.internal.guint, n_guards : _root_.sn.gnome.glib.internal.guint, n_fnotifiers : _root_.sn.gnome.glib.internal.guint, n_inotifiers : _root_.sn.gnome.glib.internal.guint, in_inotify : _root_.sn.gnome.glib.internal.guint, floating : _root_.sn.gnome.glib.internal.guint, derivative_flag : _root_.sn.gnome.glib.internal.guint, in_marshal : _root_.sn.gnome.glib.internal.guint, is_invalid : _root_.sn.gnome.glib.internal.guint, marshal : CFuncPtr6[Ptr[GClosure], Ptr[GValue], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit], data : _root_.sn.gnome.glib.internal.gpointer, notifiers : Ptr[GClosureNotifyData])(using Zone): Ptr[GClosure] = 
    val ____ptr = apply()
    (!____ptr).ref_count = ref_count
    (!____ptr).meta_marshal_nouse = meta_marshal_nouse
    (!____ptr).n_guards = n_guards
    (!____ptr).n_fnotifiers = n_fnotifiers
    (!____ptr).n_inotifiers = n_inotifiers
    (!____ptr).in_inotify = in_inotify
    (!____ptr).floating = floating
    (!____ptr).derivative_flag = derivative_flag
    (!____ptr).in_marshal = in_marshal
    (!____ptr).is_invalid = is_invalid
    (!____ptr).marshal = marshal
    (!____ptr).data = data
    (!____ptr).notifiers = notifiers
    ____ptr
  extension (struct: GClosure)
    def ref_count : _root_.sn.gnome.glib.internal.guint = struct._1
    def ref_count_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at1 = value
    def meta_marshal_nouse : _root_.sn.gnome.glib.internal.guint = struct._2
    def meta_marshal_nouse_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at2 = value
    def n_guards : _root_.sn.gnome.glib.internal.guint = struct._3
    def n_guards_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at3 = value
    def n_fnotifiers : _root_.sn.gnome.glib.internal.guint = struct._4
    def n_fnotifiers_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at4 = value
    def n_inotifiers : _root_.sn.gnome.glib.internal.guint = struct._5
    def n_inotifiers_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at5 = value
    def in_inotify : _root_.sn.gnome.glib.internal.guint = struct._6
    def in_inotify_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at6 = value
    def floating : _root_.sn.gnome.glib.internal.guint = struct._7
    def floating_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at7 = value
    def derivative_flag : _root_.sn.gnome.glib.internal.guint = struct._8
    def derivative_flag_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at8 = value
    def in_marshal : _root_.sn.gnome.glib.internal.guint = struct._9
    def in_marshal_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at9 = value
    def is_invalid : _root_.sn.gnome.glib.internal.guint = struct._10
    def is_invalid_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at10 = value
    def marshal : CFuncPtr6[Ptr[GClosure], Ptr[GValue], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._11.asInstanceOf[CFuncPtr6[Ptr[GClosure], Ptr[GValue], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit]]
    def marshal_=(value: CFuncPtr6[Ptr[GClosure], Ptr[GValue], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at11 = value.asInstanceOf[CFuncPtr6[Ptr[Byte], Ptr[GValue], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit]]
    def data : _root_.sn.gnome.glib.internal.gpointer = struct._12
    def data_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at12 = value
    def notifiers : Ptr[GClosureNotifyData] = struct._13.asInstanceOf[Ptr[GClosureNotifyData]]
    def notifiers_=(value: Ptr[GClosureNotifyData]): Unit = !struct.at13 = value.asInstanceOf[Ptr[Byte]]

opaque type GClosureNotifyData = CStruct2[_root_.sn.gnome.glib.internal.gpointer, Ptr[Byte]]
object GClosureNotifyData:
  given _tag: Tag[GClosureNotifyData] = Tag.materializeCStruct2Tag[_root_.sn.gnome.glib.internal.gpointer, Ptr[Byte]]
  def apply()(using Zone): Ptr[GClosureNotifyData] = scala.scalanative.unsafe.alloc[GClosureNotifyData](1)
  def apply(data : _root_.sn.gnome.glib.internal.gpointer, _notify : GClosureNotify)(using Zone): Ptr[GClosureNotifyData] = 
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr)._notify = _notify
    ____ptr
  extension (struct: GClosureNotifyData)
    def data : _root_.sn.gnome.glib.internal.gpointer = struct._1
    def data_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at1 = value
    def _notify : GClosureNotify = struct._2.asInstanceOf[GClosureNotify]
    def _notify_=(value: GClosureNotify): Unit = !struct.at2 = value.asInstanceOf[Ptr[Byte]]

/**
 * GEnumClass: _type_class: the parent class : the smallest possible value. : the largest possible value. _values: the number of possible values. : an array of #GEnumValue structs describing the individual values.
*/
opaque type GEnumClass = CStruct5[GTypeClass, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.guint, Ptr[GEnumValue]]
object GEnumClass:
  given _tag: Tag[GEnumClass] = Tag.materializeCStruct5Tag[GTypeClass, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.guint, Ptr[GEnumValue]]
  def apply()(using Zone): Ptr[GEnumClass] = scala.scalanative.unsafe.alloc[GEnumClass](1)
  def apply(g_type_class : GTypeClass, minimum : _root_.sn.gnome.glib.internal.gint, maximum : _root_.sn.gnome.glib.internal.gint, n_values : _root_.sn.gnome.glib.internal.guint, values : Ptr[GEnumValue])(using Zone): Ptr[GEnumClass] = 
    val ____ptr = apply()
    (!____ptr).g_type_class = g_type_class
    (!____ptr).minimum = minimum
    (!____ptr).maximum = maximum
    (!____ptr).n_values = n_values
    (!____ptr).values = values
    ____ptr
  extension (struct: GEnumClass)
    def g_type_class : GTypeClass = struct._1
    def g_type_class_=(value: GTypeClass): Unit = !struct.at1 = value
    def minimum : _root_.sn.gnome.glib.internal.gint = struct._2
    def minimum_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at2 = value
    def maximum : _root_.sn.gnome.glib.internal.gint = struct._3
    def maximum_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at3 = value
    def n_values : _root_.sn.gnome.glib.internal.guint = struct._4
    def n_values_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at4 = value
    def values : Ptr[GEnumValue] = struct._5
    def values_=(value: Ptr[GEnumValue]): Unit = !struct.at5 = value

/**
 * GEnumValue: : the enum value _name: the name of the value _nick: the nickname of the value
*/
opaque type GEnumValue = CStruct3[_root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar]]
object GEnumValue:
  given _tag: Tag[GEnumValue] = Tag.materializeCStruct3Tag[_root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar]]
  def apply()(using Zone): Ptr[GEnumValue] = scala.scalanative.unsafe.alloc[GEnumValue](1)
  def apply(value : _root_.sn.gnome.glib.internal.gint, value_name : Ptr[_root_.sn.gnome.glib.internal.gchar], value_nick : Ptr[_root_.sn.gnome.glib.internal.gchar])(using Zone): Ptr[GEnumValue] = 
    val ____ptr = apply()
    (!____ptr).value = value
    (!____ptr).value_name = value_name
    (!____ptr).value_nick = value_nick
    ____ptr
  extension (struct: GEnumValue)
    def value : _root_.sn.gnome.glib.internal.gint = struct._1
    def value_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at1 = value
    def value_name : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
    def value_name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at2 = value
    def value_nick : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._3
    def value_nick_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at3 = value

/**
 * GFlagsClass: _type_class: the parent class : a mask covering all possible values. _values: the number of possible values. : an array of #GFlagsValue structs describing the individual values.
*/
opaque type GFlagsClass = CStruct4[GTypeClass, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, Ptr[GFlagsValue]]
object GFlagsClass:
  given _tag: Tag[GFlagsClass] = Tag.materializeCStruct4Tag[GTypeClass, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, Ptr[GFlagsValue]]
  def apply()(using Zone): Ptr[GFlagsClass] = scala.scalanative.unsafe.alloc[GFlagsClass](1)
  def apply(g_type_class : GTypeClass, mask : _root_.sn.gnome.glib.internal.guint, n_values : _root_.sn.gnome.glib.internal.guint, values : Ptr[GFlagsValue])(using Zone): Ptr[GFlagsClass] = 
    val ____ptr = apply()
    (!____ptr).g_type_class = g_type_class
    (!____ptr).mask = mask
    (!____ptr).n_values = n_values
    (!____ptr).values = values
    ____ptr
  extension (struct: GFlagsClass)
    def g_type_class : GTypeClass = struct._1
    def g_type_class_=(value: GTypeClass): Unit = !struct.at1 = value
    def mask : _root_.sn.gnome.glib.internal.guint = struct._2
    def mask_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at2 = value
    def n_values : _root_.sn.gnome.glib.internal.guint = struct._3
    def n_values_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at3 = value
    def values : Ptr[GFlagsValue] = struct._4
    def values_=(value: Ptr[GFlagsValue]): Unit = !struct.at4 = value

/**
 * GFlagsValue: : the flags value _name: the name of the value _nick: the nickname of the value
*/
opaque type GFlagsValue = CStruct3[_root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar]]
object GFlagsValue:
  given _tag: Tag[GFlagsValue] = Tag.materializeCStruct3Tag[_root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar]]
  def apply()(using Zone): Ptr[GFlagsValue] = scala.scalanative.unsafe.alloc[GFlagsValue](1)
  def apply(value : _root_.sn.gnome.glib.internal.guint, value_name : Ptr[_root_.sn.gnome.glib.internal.gchar], value_nick : Ptr[_root_.sn.gnome.glib.internal.gchar])(using Zone): Ptr[GFlagsValue] = 
    val ____ptr = apply()
    (!____ptr).value = value
    (!____ptr).value_name = value_name
    (!____ptr).value_nick = value_nick
    ____ptr
  extension (struct: GFlagsValue)
    def value : _root_.sn.gnome.glib.internal.guint = struct._1
    def value_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at1 = value
    def value_name : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
    def value_name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at2 = value
    def value_nick : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._3
    def value_nick_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at3 = value

opaque type GInitiallyUnowned = CStruct3[GTypeInstance, _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.GData]]
object GInitiallyUnowned:
  given _tag: Tag[GInitiallyUnowned] = Tag.materializeCStruct3Tag[GTypeInstance, _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.GData]]
  def apply()(using Zone): Ptr[GInitiallyUnowned] = scala.scalanative.unsafe.alloc[GInitiallyUnowned](1)
  def apply(g_type_instance : GTypeInstance, ref_count : _root_.sn.gnome.glib.internal.guint, qdata : Ptr[_root_.sn.gnome.glib.internal.GData])(using Zone): Ptr[GInitiallyUnowned] = 
    val ____ptr = apply()
    (!____ptr).g_type_instance = g_type_instance
    (!____ptr).ref_count = ref_count
    (!____ptr).qdata = qdata
    ____ptr
  extension (struct: GInitiallyUnowned)
    def g_type_instance : GTypeInstance = struct._1
    def g_type_instance_=(value: GTypeInstance): Unit = !struct.at1 = value
    def ref_count : _root_.sn.gnome.glib.internal.guint = struct._2
    def ref_count_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at2 = value
    def qdata : Ptr[_root_.sn.gnome.glib.internal.GData] = struct._3
    def qdata_=(value: Ptr[_root_.sn.gnome.glib.internal.GData]): Unit = !struct.at3 = value

/**
 * GObjectClass: _type_class: the parent class : the function is called by g_object_new () to complete the object initialization after all the construction properties are set. The first thing a implementation must do is chain up to the of the parent class. Overriding should be rarely needed, e.g. to handle construct properties, or to implement singletons.
*/
opaque type GInitiallyUnownedClass = CStruct15[GTypeClass, Ptr[Byte], CFuncPtr3[GType, _root_.sn.gnome.glib.internal.guint, Ptr[GObjectConstructParam], Ptr[GObject]], CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit], CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit], CFuncPtr1[Ptr[GObject], Unit], CFuncPtr1[Ptr[GObject], Unit], CFuncPtr3[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[Ptr[GParamSpec]], Unit], CFuncPtr2[Ptr[GObject], Ptr[GParamSpec], Unit], CFuncPtr1[Ptr[GObject], Unit], _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gsize, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3]]
object GInitiallyUnownedClass:
  given _tag: Tag[GInitiallyUnownedClass] = Tag.materializeCStruct15Tag[GTypeClass, Ptr[Byte], CFuncPtr3[GType, _root_.sn.gnome.glib.internal.guint, Ptr[GObjectConstructParam], Ptr[GObject]], CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit], CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit], CFuncPtr1[Ptr[GObject], Unit], CFuncPtr1[Ptr[GObject], Unit], CFuncPtr3[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[Ptr[GParamSpec]], Unit], CFuncPtr2[Ptr[GObject], Ptr[GParamSpec], Unit], CFuncPtr1[Ptr[GObject], Unit], _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gsize, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3]]
  def apply()(using Zone): Ptr[GInitiallyUnownedClass] = scala.scalanative.unsafe.alloc[GInitiallyUnownedClass](1)
  def apply(g_type_class : GTypeClass, construct_properties : Ptr[_root_.sn.gnome.glib.internal.GSList], constructor : CFuncPtr3[GType, _root_.sn.gnome.glib.internal.guint, Ptr[GObjectConstructParam], Ptr[GObject]], set_property : CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit], get_property : CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit], dispose : CFuncPtr1[Ptr[GObject], Unit], finalize : CFuncPtr1[Ptr[GObject], Unit], dispatch_properties_changed : CFuncPtr3[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[Ptr[GParamSpec]], Unit], _notify : CFuncPtr2[Ptr[GObject], Ptr[GParamSpec], Unit], constructed : CFuncPtr1[Ptr[GObject], Unit], flags : _root_.sn.gnome.glib.internal.gsize, n_construct_properties : _root_.sn.gnome.glib.internal.gsize, pspecs : _root_.sn.gnome.glib.internal.gpointer, n_pspecs : _root_.sn.gnome.glib.internal.gsize, pdummy : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3])(using Zone): Ptr[GInitiallyUnownedClass] = 
    val ____ptr = apply()
    (!____ptr).g_type_class = g_type_class
    (!____ptr).construct_properties = construct_properties
    (!____ptr).constructor = constructor
    (!____ptr).set_property = set_property
    (!____ptr).get_property = get_property
    (!____ptr).dispose = dispose
    (!____ptr).finalize = finalize
    (!____ptr).dispatch_properties_changed = dispatch_properties_changed
    (!____ptr)._notify = _notify
    (!____ptr).constructed = constructed
    (!____ptr).flags = flags
    (!____ptr).n_construct_properties = n_construct_properties
    (!____ptr).pspecs = pspecs
    (!____ptr).n_pspecs = n_pspecs
    (!____ptr).pdummy = pdummy
    ____ptr
  extension (struct: GInitiallyUnownedClass)
    def g_type_class : GTypeClass = struct._1
    def g_type_class_=(value: GTypeClass): Unit = !struct.at1 = value
    def construct_properties : Ptr[_root_.sn.gnome.glib.internal.GSList] = struct._2.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GSList]]
    def construct_properties_=(value: Ptr[_root_.sn.gnome.glib.internal.GSList]): Unit = !struct.at2 = value.asInstanceOf[Ptr[Byte]]
    def constructor : CFuncPtr3[GType, _root_.sn.gnome.glib.internal.guint, Ptr[GObjectConstructParam], Ptr[GObject]] = struct._3
    def constructor_=(value: CFuncPtr3[GType, _root_.sn.gnome.glib.internal.guint, Ptr[GObjectConstructParam], Ptr[GObject]]): Unit = !struct.at3 = value
    def set_property : CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit] = struct._4
    def set_property_=(value: CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit]): Unit = !struct.at4 = value
    def get_property : CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit] = struct._5
    def get_property_=(value: CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit]): Unit = !struct.at5 = value
    def dispose : CFuncPtr1[Ptr[GObject], Unit] = struct._6
    def dispose_=(value: CFuncPtr1[Ptr[GObject], Unit]): Unit = !struct.at6 = value
    def finalize : CFuncPtr1[Ptr[GObject], Unit] = struct._7
    def finalize_=(value: CFuncPtr1[Ptr[GObject], Unit]): Unit = !struct.at7 = value
    def dispatch_properties_changed : CFuncPtr3[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[Ptr[GParamSpec]], Unit] = struct._8
    def dispatch_properties_changed_=(value: CFuncPtr3[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[Ptr[GParamSpec]], Unit]): Unit = !struct.at8 = value
    def _notify : CFuncPtr2[Ptr[GObject], Ptr[GParamSpec], Unit] = struct._9
    def _notify_=(value: CFuncPtr2[Ptr[GObject], Ptr[GParamSpec], Unit]): Unit = !struct.at9 = value
    def constructed : CFuncPtr1[Ptr[GObject], Unit] = struct._10
    def constructed_=(value: CFuncPtr1[Ptr[GObject], Unit]): Unit = !struct.at10 = value
    def flags : _root_.sn.gnome.glib.internal.gsize = struct._11
    def flags_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = !struct.at11 = value
    def n_construct_properties : _root_.sn.gnome.glib.internal.gsize = struct._12
    def n_construct_properties_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = !struct.at12 = value
    def pspecs : _root_.sn.gnome.glib.internal.gpointer = struct._13
    def pspecs_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at13 = value
    def n_pspecs : _root_.sn.gnome.glib.internal.gsize = struct._14
    def n_pspecs_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = !struct.at14 = value
    def pdummy : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3] = struct._15
    def pdummy_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3]): Unit = !struct.at15 = value

/**
 * GInterfaceInfo:
*/
opaque type GInterfaceInfo = CStruct3[GInterfaceInitFunc, GInterfaceFinalizeFunc, _root_.sn.gnome.glib.internal.gpointer]
object GInterfaceInfo:
  given _tag: Tag[GInterfaceInfo] = Tag.materializeCStruct3Tag[GInterfaceInitFunc, GInterfaceFinalizeFunc, _root_.sn.gnome.glib.internal.gpointer]
  def apply()(using Zone): Ptr[GInterfaceInfo] = scala.scalanative.unsafe.alloc[GInterfaceInfo](1)
  def apply(interface_init : GInterfaceInitFunc, interface_finalize : GInterfaceFinalizeFunc, interface_data : _root_.sn.gnome.glib.internal.gpointer)(using Zone): Ptr[GInterfaceInfo] = 
    val ____ptr = apply()
    (!____ptr).interface_init = interface_init
    (!____ptr).interface_finalize = interface_finalize
    (!____ptr).interface_data = interface_data
    ____ptr
  extension (struct: GInterfaceInfo)
    def interface_init : GInterfaceInitFunc = struct._1
    def interface_init_=(value: GInterfaceInitFunc): Unit = !struct.at1 = value
    def interface_finalize : GInterfaceFinalizeFunc = struct._2
    def interface_finalize_=(value: GInterfaceFinalizeFunc): Unit = !struct.at2 = value
    def interface_data : _root_.sn.gnome.glib.internal.gpointer = struct._3
    def interface_data_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at3 = value

opaque type GObject = CStruct3[GTypeInstance, _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.GData]]
object GObject:
  given _tag: Tag[GObject] = Tag.materializeCStruct3Tag[GTypeInstance, _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.GData]]
  def apply()(using Zone): Ptr[GObject] = scala.scalanative.unsafe.alloc[GObject](1)
  def apply(g_type_instance : GTypeInstance, ref_count : _root_.sn.gnome.glib.internal.guint, qdata : Ptr[_root_.sn.gnome.glib.internal.GData])(using Zone): Ptr[GObject] = 
    val ____ptr = apply()
    (!____ptr).g_type_instance = g_type_instance
    (!____ptr).ref_count = ref_count
    (!____ptr).qdata = qdata
    ____ptr
  extension (struct: GObject)
    def g_type_instance : GTypeInstance = struct._1
    def g_type_instance_=(value: GTypeInstance): Unit = !struct.at1 = value
    def ref_count : _root_.sn.gnome.glib.internal.guint = struct._2
    def ref_count_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at2 = value
    def qdata : Ptr[_root_.sn.gnome.glib.internal.GData] = struct._3
    def qdata_=(value: Ptr[_root_.sn.gnome.glib.internal.GData]): Unit = !struct.at3 = value

/**
 * GObjectClass: _type_class: the parent class : the function is called by g_object_new () to complete the object initialization after all the construction properties are set. The first thing a implementation must do is chain up to the of the parent class. Overriding should be rarely needed, e.g. to handle construct properties, or to implement singletons.
*/
opaque type GObjectClass = CStruct15[GTypeClass, Ptr[Byte], CFuncPtr3[GType, _root_.sn.gnome.glib.internal.guint, Ptr[GObjectConstructParam], Ptr[GObject]], CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit], CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit], CFuncPtr1[Ptr[GObject], Unit], CFuncPtr1[Ptr[GObject], Unit], CFuncPtr3[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[Ptr[GParamSpec]], Unit], CFuncPtr2[Ptr[GObject], Ptr[GParamSpec], Unit], CFuncPtr1[Ptr[GObject], Unit], _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gsize, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3]]
object GObjectClass:
  given _tag: Tag[GObjectClass] = Tag.materializeCStruct15Tag[GTypeClass, Ptr[Byte], CFuncPtr3[GType, _root_.sn.gnome.glib.internal.guint, Ptr[GObjectConstructParam], Ptr[GObject]], CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit], CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit], CFuncPtr1[Ptr[GObject], Unit], CFuncPtr1[Ptr[GObject], Unit], CFuncPtr3[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[Ptr[GParamSpec]], Unit], CFuncPtr2[Ptr[GObject], Ptr[GParamSpec], Unit], CFuncPtr1[Ptr[GObject], Unit], _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gsize, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3]]
  def apply()(using Zone): Ptr[GObjectClass] = scala.scalanative.unsafe.alloc[GObjectClass](1)
  def apply(g_type_class : GTypeClass, construct_properties : Ptr[_root_.sn.gnome.glib.internal.GSList], constructor : CFuncPtr3[GType, _root_.sn.gnome.glib.internal.guint, Ptr[GObjectConstructParam], Ptr[GObject]], set_property : CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit], get_property : CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit], dispose : CFuncPtr1[Ptr[GObject], Unit], finalize : CFuncPtr1[Ptr[GObject], Unit], dispatch_properties_changed : CFuncPtr3[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[Ptr[GParamSpec]], Unit], _notify : CFuncPtr2[Ptr[GObject], Ptr[GParamSpec], Unit], constructed : CFuncPtr1[Ptr[GObject], Unit], flags : _root_.sn.gnome.glib.internal.gsize, n_construct_properties : _root_.sn.gnome.glib.internal.gsize, pspecs : _root_.sn.gnome.glib.internal.gpointer, n_pspecs : _root_.sn.gnome.glib.internal.gsize, pdummy : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3])(using Zone): Ptr[GObjectClass] = 
    val ____ptr = apply()
    (!____ptr).g_type_class = g_type_class
    (!____ptr).construct_properties = construct_properties
    (!____ptr).constructor = constructor
    (!____ptr).set_property = set_property
    (!____ptr).get_property = get_property
    (!____ptr).dispose = dispose
    (!____ptr).finalize = finalize
    (!____ptr).dispatch_properties_changed = dispatch_properties_changed
    (!____ptr)._notify = _notify
    (!____ptr).constructed = constructed
    (!____ptr).flags = flags
    (!____ptr).n_construct_properties = n_construct_properties
    (!____ptr).pspecs = pspecs
    (!____ptr).n_pspecs = n_pspecs
    (!____ptr).pdummy = pdummy
    ____ptr
  extension (struct: GObjectClass)
    def g_type_class : GTypeClass = struct._1
    def g_type_class_=(value: GTypeClass): Unit = !struct.at1 = value
    def construct_properties : Ptr[_root_.sn.gnome.glib.internal.GSList] = struct._2.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GSList]]
    def construct_properties_=(value: Ptr[_root_.sn.gnome.glib.internal.GSList]): Unit = !struct.at2 = value.asInstanceOf[Ptr[Byte]]
    def constructor : CFuncPtr3[GType, _root_.sn.gnome.glib.internal.guint, Ptr[GObjectConstructParam], Ptr[GObject]] = struct._3
    def constructor_=(value: CFuncPtr3[GType, _root_.sn.gnome.glib.internal.guint, Ptr[GObjectConstructParam], Ptr[GObject]]): Unit = !struct.at3 = value
    def set_property : CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit] = struct._4
    def set_property_=(value: CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit]): Unit = !struct.at4 = value
    def get_property : CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit] = struct._5
    def get_property_=(value: CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit]): Unit = !struct.at5 = value
    def dispose : CFuncPtr1[Ptr[GObject], Unit] = struct._6
    def dispose_=(value: CFuncPtr1[Ptr[GObject], Unit]): Unit = !struct.at6 = value
    def finalize : CFuncPtr1[Ptr[GObject], Unit] = struct._7
    def finalize_=(value: CFuncPtr1[Ptr[GObject], Unit]): Unit = !struct.at7 = value
    def dispatch_properties_changed : CFuncPtr3[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[Ptr[GParamSpec]], Unit] = struct._8
    def dispatch_properties_changed_=(value: CFuncPtr3[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[Ptr[GParamSpec]], Unit]): Unit = !struct.at8 = value
    def _notify : CFuncPtr2[Ptr[GObject], Ptr[GParamSpec], Unit] = struct._9
    def _notify_=(value: CFuncPtr2[Ptr[GObject], Ptr[GParamSpec], Unit]): Unit = !struct.at9 = value
    def constructed : CFuncPtr1[Ptr[GObject], Unit] = struct._10
    def constructed_=(value: CFuncPtr1[Ptr[GObject], Unit]): Unit = !struct.at10 = value
    def flags : _root_.sn.gnome.glib.internal.gsize = struct._11
    def flags_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = !struct.at11 = value
    def n_construct_properties : _root_.sn.gnome.glib.internal.gsize = struct._12
    def n_construct_properties_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = !struct.at12 = value
    def pspecs : _root_.sn.gnome.glib.internal.gpointer = struct._13
    def pspecs_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at13 = value
    def n_pspecs : _root_.sn.gnome.glib.internal.gsize = struct._14
    def n_pspecs_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = !struct.at14 = value
    def pdummy : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3] = struct._15
    def pdummy_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3]): Unit = !struct.at15 = value

/**
 * GObjectConstructParam: : the #GParamSpec of the construct parameter : the value to set the parameter to
*/
opaque type GObjectConstructParam = CStruct2[Ptr[GParamSpec], Ptr[GValue]]
object GObjectConstructParam:
  given _tag: Tag[GObjectConstructParam] = Tag.materializeCStruct2Tag[Ptr[GParamSpec], Ptr[GValue]]
  def apply()(using Zone): Ptr[GObjectConstructParam] = scala.scalanative.unsafe.alloc[GObjectConstructParam](1)
  def apply(pspec : Ptr[GParamSpec], value : Ptr[GValue])(using Zone): Ptr[GObjectConstructParam] = 
    val ____ptr = apply()
    (!____ptr).pspec = pspec
    (!____ptr).value = value
    ____ptr
  extension (struct: GObjectConstructParam)
    def pspec : Ptr[GParamSpec] = struct._1
    def pspec_=(value: Ptr[GParamSpec]): Unit = !struct.at1 = value
    def value : Ptr[GValue] = struct._2
    def value_=(value: Ptr[GValue]): Unit = !struct.at2 = value

opaque type GParamSpec = CStruct10[GTypeInstance, Ptr[_root_.sn.gnome.glib.internal.gchar], GParamFlags, GType, GType, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GData], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
object GParamSpec:
  given _tag: Tag[GParamSpec] = Tag.materializeCStruct10Tag[GTypeInstance, Ptr[_root_.sn.gnome.glib.internal.gchar], GParamFlags, GType, GType, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GData], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
  def apply()(using Zone): Ptr[GParamSpec] = scala.scalanative.unsafe.alloc[GParamSpec](1)
  def apply(g_type_instance : GTypeInstance, name : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GParamFlags, value_type : GType, owner_type : GType, _nick : Ptr[_root_.sn.gnome.glib.internal.gchar], _blurb : Ptr[_root_.sn.gnome.glib.internal.gchar], qdata : Ptr[_root_.sn.gnome.glib.internal.GData], ref_count : _root_.sn.gnome.glib.internal.guint, param_id : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[GParamSpec] = 
    val ____ptr = apply()
    (!____ptr).g_type_instance = g_type_instance
    (!____ptr).name = name
    (!____ptr).flags = flags
    (!____ptr).value_type = value_type
    (!____ptr).owner_type = owner_type
    (!____ptr)._nick = _nick
    (!____ptr)._blurb = _blurb
    (!____ptr).qdata = qdata
    (!____ptr).ref_count = ref_count
    (!____ptr).param_id = param_id
    ____ptr
  extension (struct: GParamSpec)
    def g_type_instance : GTypeInstance = struct._1
    def g_type_instance_=(value: GTypeInstance): Unit = !struct.at1 = value
    def name : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
    def name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at2 = value
    def flags : GParamFlags = struct._3
    def flags_=(value: GParamFlags): Unit = !struct.at3 = value
    def value_type : GType = struct._4
    def value_type_=(value: GType): Unit = !struct.at4 = value
    def owner_type : GType = struct._5
    def owner_type_=(value: GType): Unit = !struct.at5 = value
    def _nick : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._6
    def _nick_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at6 = value
    def _blurb : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._7
    def _blurb_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at7 = value
    def qdata : Ptr[_root_.sn.gnome.glib.internal.GData] = struct._8
    def qdata_=(value: Ptr[_root_.sn.gnome.glib.internal.GData]): Unit = !struct.at8 = value
    def ref_count : _root_.sn.gnome.glib.internal.guint = struct._9
    def ref_count_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at9 = value
    def param_id : _root_.sn.gnome.glib.internal.guint = struct._10
    def param_id_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at10 = value

/**
 * GParamSpecBoolean: _instance: private #GParamSpec portion _value: default value for the property specified
*/
opaque type GParamSpecBoolean = CStruct2[GParamSpec, _root_.sn.gnome.glib.internal.gboolean]
object GParamSpecBoolean:
  given _tag: Tag[GParamSpecBoolean] = Tag.materializeCStruct2Tag[GParamSpec, _root_.sn.gnome.glib.internal.gboolean]
  def apply()(using Zone): Ptr[GParamSpecBoolean] = scala.scalanative.unsafe.alloc[GParamSpecBoolean](1)
  def apply(parent_instance : GParamSpec, default_value : _root_.sn.gnome.glib.internal.gboolean)(using Zone): Ptr[GParamSpecBoolean] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).default_value = default_value
    ____ptr
  extension (struct: GParamSpecBoolean)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def default_value : _root_.sn.gnome.glib.internal.gboolean = struct._2
    def default_value_=(value: _root_.sn.gnome.glib.internal.gboolean): Unit = !struct.at2 = value

/**
 * GParamSpecBoxed: _instance: private #GParamSpec portion
*/
opaque type GParamSpecBoxed = CStruct1[GParamSpec]
object GParamSpecBoxed:
  given _tag: Tag[GParamSpecBoxed] = Tag.materializeCStruct1Tag[GParamSpec]
  def apply()(using Zone): Ptr[GParamSpecBoxed] = scala.scalanative.unsafe.alloc[GParamSpecBoxed](1)
  def apply(parent_instance : GParamSpec)(using Zone): Ptr[GParamSpecBoxed] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GParamSpecBoxed)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value

/**
 * GParamSpecChar: _instance: private #GParamSpec portion : minimum value for the property specified : maximum value for the property specified _value: default value for the property specified
*/
opaque type GParamSpecChar = CStruct4[GParamSpec, _root_.sn.gnome.glib.internal.gint8, _root_.sn.gnome.glib.internal.gint8, _root_.sn.gnome.glib.internal.gint8]
object GParamSpecChar:
  given _tag: Tag[GParamSpecChar] = Tag.materializeCStruct4Tag[GParamSpec, _root_.sn.gnome.glib.internal.gint8, _root_.sn.gnome.glib.internal.gint8, _root_.sn.gnome.glib.internal.gint8]
  def apply()(using Zone): Ptr[GParamSpecChar] = scala.scalanative.unsafe.alloc[GParamSpecChar](1)
  def apply(parent_instance : GParamSpec, minimum : _root_.sn.gnome.glib.internal.gint8, maximum : _root_.sn.gnome.glib.internal.gint8, default_value : _root_.sn.gnome.glib.internal.gint8)(using Zone): Ptr[GParamSpecChar] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).minimum = minimum
    (!____ptr).maximum = maximum
    (!____ptr).default_value = default_value
    ____ptr
  extension (struct: GParamSpecChar)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def minimum : _root_.sn.gnome.glib.internal.gint8 = struct._2
    def minimum_=(value: _root_.sn.gnome.glib.internal.gint8): Unit = !struct.at2 = value
    def maximum : _root_.sn.gnome.glib.internal.gint8 = struct._3
    def maximum_=(value: _root_.sn.gnome.glib.internal.gint8): Unit = !struct.at3 = value
    def default_value : _root_.sn.gnome.glib.internal.gint8 = struct._4
    def default_value_=(value: _root_.sn.gnome.glib.internal.gint8): Unit = !struct.at4 = value

/**
 * GParamSpecClass: _type_class: the parent class _type: the #GValue type for this parameter : The instance finalization function (optional), should chain up to the finalize method of the parent class. _set_default: Resets a to the default value for this type (recommended, the default is g_value_reset()), see g_param_value_set_default(). _validate: Ensures that the contents of comply with the specifications set out by this type (optional), see g_param_value_validate(). _cmp: Compares with according to this type (recommended, the default is memcmp()), see g_param_values_cmp(). _is_valid: Checks if contents of comply with the specifications set out by this type, without modifying the value. This vfunc is optional. If it isn't set, GObject will use _validate. Since 2.74
*/
opaque type GParamSpecClass = CStruct8[GTypeClass, GType, CFuncPtr1[Ptr[GParamSpec], Unit], CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], Unit], CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GParamSpec], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gint], CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3]]
object GParamSpecClass:
  given _tag: Tag[GParamSpecClass] = Tag.materializeCStruct8Tag[GTypeClass, GType, CFuncPtr1[Ptr[GParamSpec], Unit], CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], Unit], CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GParamSpec], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gint], CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3]]
  def apply()(using Zone): Ptr[GParamSpecClass] = scala.scalanative.unsafe.alloc[GParamSpecClass](1)
  def apply(g_type_class : GTypeClass, value_type : GType, finalize : CFuncPtr1[Ptr[GParamSpec], Unit], value_set_default : CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], Unit], value_validate : CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean], values_cmp : CFuncPtr3[Ptr[GParamSpec], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gint], value_is_valid : CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean], dummy : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3])(using Zone): Ptr[GParamSpecClass] = 
    val ____ptr = apply()
    (!____ptr).g_type_class = g_type_class
    (!____ptr).value_type = value_type
    (!____ptr).finalize = finalize
    (!____ptr).value_set_default = value_set_default
    (!____ptr).value_validate = value_validate
    (!____ptr).values_cmp = values_cmp
    (!____ptr).value_is_valid = value_is_valid
    (!____ptr).dummy = dummy
    ____ptr
  extension (struct: GParamSpecClass)
    def g_type_class : GTypeClass = struct._1
    def g_type_class_=(value: GTypeClass): Unit = !struct.at1 = value
    def value_type : GType = struct._2
    def value_type_=(value: GType): Unit = !struct.at2 = value
    def finalize : CFuncPtr1[Ptr[GParamSpec], Unit] = struct._3
    def finalize_=(value: CFuncPtr1[Ptr[GParamSpec], Unit]): Unit = !struct.at3 = value
    def value_set_default : CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], Unit] = struct._4
    def value_set_default_=(value: CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], Unit]): Unit = !struct.at4 = value
    def value_validate : CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean] = struct._5
    def value_validate_=(value: CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at5 = value
    def values_cmp : CFuncPtr3[Ptr[GParamSpec], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gint] = struct._6
    def values_cmp_=(value: CFuncPtr3[Ptr[GParamSpec], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gint]): Unit = !struct.at6 = value
    def value_is_valid : CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean] = struct._7
    def value_is_valid_=(value: CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at7 = value
    def dummy : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3] = struct._8
    def dummy_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3]): Unit = !struct.at8 = value

/**
 * GParamSpecDouble: _instance: private #GParamSpec portion : minimum value for the property specified : maximum value for the property specified _value: default value for the property specified : values closer than will be considered identical by g_param_values_cmp(); the default value is 1e-90.
*/
opaque type GParamSpecDouble = CStruct5[GParamSpec, _root_.sn.gnome.glib.internal.gdouble, _root_.sn.gnome.glib.internal.gdouble, _root_.sn.gnome.glib.internal.gdouble, _root_.sn.gnome.glib.internal.gdouble]
object GParamSpecDouble:
  given _tag: Tag[GParamSpecDouble] = Tag.materializeCStruct5Tag[GParamSpec, _root_.sn.gnome.glib.internal.gdouble, _root_.sn.gnome.glib.internal.gdouble, _root_.sn.gnome.glib.internal.gdouble, _root_.sn.gnome.glib.internal.gdouble]
  def apply()(using Zone): Ptr[GParamSpecDouble] = scala.scalanative.unsafe.alloc[GParamSpecDouble](1)
  def apply(parent_instance : GParamSpec, minimum : _root_.sn.gnome.glib.internal.gdouble, maximum : _root_.sn.gnome.glib.internal.gdouble, default_value : _root_.sn.gnome.glib.internal.gdouble, epsilon : _root_.sn.gnome.glib.internal.gdouble)(using Zone): Ptr[GParamSpecDouble] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).minimum = minimum
    (!____ptr).maximum = maximum
    (!____ptr).default_value = default_value
    (!____ptr).epsilon = epsilon
    ____ptr
  extension (struct: GParamSpecDouble)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def minimum : _root_.sn.gnome.glib.internal.gdouble = struct._2
    def minimum_=(value: _root_.sn.gnome.glib.internal.gdouble): Unit = !struct.at2 = value
    def maximum : _root_.sn.gnome.glib.internal.gdouble = struct._3
    def maximum_=(value: _root_.sn.gnome.glib.internal.gdouble): Unit = !struct.at3 = value
    def default_value : _root_.sn.gnome.glib.internal.gdouble = struct._4
    def default_value_=(value: _root_.sn.gnome.glib.internal.gdouble): Unit = !struct.at4 = value
    def epsilon : _root_.sn.gnome.glib.internal.gdouble = struct._5
    def epsilon_=(value: _root_.sn.gnome.glib.internal.gdouble): Unit = !struct.at5 = value

/**
 * GParamSpecEnum: _instance: private #GParamSpec portion _value: default value for the property specified
*/
opaque type GParamSpecEnum = CStruct3[GParamSpec, Ptr[GEnumClass], _root_.sn.gnome.glib.internal.gint]
object GParamSpecEnum:
  given _tag: Tag[GParamSpecEnum] = Tag.materializeCStruct3Tag[GParamSpec, Ptr[GEnumClass], _root_.sn.gnome.glib.internal.gint]
  def apply()(using Zone): Ptr[GParamSpecEnum] = scala.scalanative.unsafe.alloc[GParamSpecEnum](1)
  def apply(parent_instance : GParamSpec, enum_class : Ptr[GEnumClass], default_value : _root_.sn.gnome.glib.internal.gint)(using Zone): Ptr[GParamSpecEnum] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).enum_class = enum_class
    (!____ptr).default_value = default_value
    ____ptr
  extension (struct: GParamSpecEnum)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def enum_class : Ptr[GEnumClass] = struct._2
    def enum_class_=(value: Ptr[GEnumClass]): Unit = !struct.at2 = value
    def default_value : _root_.sn.gnome.glib.internal.gint = struct._3
    def default_value_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at3 = value

/**
 * GParamSpecFlags: _instance: private #GParamSpec portion _class: the #GFlagsClass for the flags _value: default value for the property specified
*/
opaque type GParamSpecFlags = CStruct3[GParamSpec, Ptr[GFlagsClass], _root_.sn.gnome.glib.internal.guint]
object GParamSpecFlags:
  given _tag: Tag[GParamSpecFlags] = Tag.materializeCStruct3Tag[GParamSpec, Ptr[GFlagsClass], _root_.sn.gnome.glib.internal.guint]
  def apply()(using Zone): Ptr[GParamSpecFlags] = scala.scalanative.unsafe.alloc[GParamSpecFlags](1)
  def apply(parent_instance : GParamSpec, flags_class : Ptr[GFlagsClass], default_value : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[GParamSpecFlags] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).flags_class = flags_class
    (!____ptr).default_value = default_value
    ____ptr
  extension (struct: GParamSpecFlags)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def flags_class : Ptr[GFlagsClass] = struct._2
    def flags_class_=(value: Ptr[GFlagsClass]): Unit = !struct.at2 = value
    def default_value : _root_.sn.gnome.glib.internal.guint = struct._3
    def default_value_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at3 = value

/**
 * GParamSpecFloat: _instance: private #GParamSpec portion : minimum value for the property specified : maximum value for the property specified _value: default value for the property specified : values closer than will be considered identical by g_param_values_cmp(); the default value is 1e-30.
*/
opaque type GParamSpecFloat = CStruct5[GParamSpec, _root_.sn.gnome.glib.internal.gfloat, _root_.sn.gnome.glib.internal.gfloat, _root_.sn.gnome.glib.internal.gfloat, _root_.sn.gnome.glib.internal.gfloat]
object GParamSpecFloat:
  given _tag: Tag[GParamSpecFloat] = Tag.materializeCStruct5Tag[GParamSpec, _root_.sn.gnome.glib.internal.gfloat, _root_.sn.gnome.glib.internal.gfloat, _root_.sn.gnome.glib.internal.gfloat, _root_.sn.gnome.glib.internal.gfloat]
  def apply()(using Zone): Ptr[GParamSpecFloat] = scala.scalanative.unsafe.alloc[GParamSpecFloat](1)
  def apply(parent_instance : GParamSpec, minimum : _root_.sn.gnome.glib.internal.gfloat, maximum : _root_.sn.gnome.glib.internal.gfloat, default_value : _root_.sn.gnome.glib.internal.gfloat, epsilon : _root_.sn.gnome.glib.internal.gfloat)(using Zone): Ptr[GParamSpecFloat] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).minimum = minimum
    (!____ptr).maximum = maximum
    (!____ptr).default_value = default_value
    (!____ptr).epsilon = epsilon
    ____ptr
  extension (struct: GParamSpecFloat)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def minimum : _root_.sn.gnome.glib.internal.gfloat = struct._2
    def minimum_=(value: _root_.sn.gnome.glib.internal.gfloat): Unit = !struct.at2 = value
    def maximum : _root_.sn.gnome.glib.internal.gfloat = struct._3
    def maximum_=(value: _root_.sn.gnome.glib.internal.gfloat): Unit = !struct.at3 = value
    def default_value : _root_.sn.gnome.glib.internal.gfloat = struct._4
    def default_value_=(value: _root_.sn.gnome.glib.internal.gfloat): Unit = !struct.at4 = value
    def epsilon : _root_.sn.gnome.glib.internal.gfloat = struct._5
    def epsilon_=(value: _root_.sn.gnome.glib.internal.gfloat): Unit = !struct.at5 = value

/**
 * GParamSpecGType: _instance: private #GParamSpec portion
*/
opaque type GParamSpecGType = CStruct2[GParamSpec, GType]
object GParamSpecGType:
  given _tag: Tag[GParamSpecGType] = Tag.materializeCStruct2Tag[GParamSpec, GType]
  def apply()(using Zone): Ptr[GParamSpecGType] = scala.scalanative.unsafe.alloc[GParamSpecGType](1)
  def apply(parent_instance : GParamSpec, is_a_type : GType)(using Zone): Ptr[GParamSpecGType] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).is_a_type = is_a_type
    ____ptr
  extension (struct: GParamSpecGType)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def is_a_type : GType = struct._2
    def is_a_type_=(value: GType): Unit = !struct.at2 = value

/**
 * GParamSpecInt: _instance: private #GParamSpec portion : minimum value for the property specified : maximum value for the property specified _value: default value for the property specified
*/
opaque type GParamSpecInt = CStruct4[GParamSpec, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint]
object GParamSpecInt:
  given _tag: Tag[GParamSpecInt] = Tag.materializeCStruct4Tag[GParamSpec, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint]
  def apply()(using Zone): Ptr[GParamSpecInt] = scala.scalanative.unsafe.alloc[GParamSpecInt](1)
  def apply(parent_instance : GParamSpec, minimum : _root_.sn.gnome.glib.internal.gint, maximum : _root_.sn.gnome.glib.internal.gint, default_value : _root_.sn.gnome.glib.internal.gint)(using Zone): Ptr[GParamSpecInt] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).minimum = minimum
    (!____ptr).maximum = maximum
    (!____ptr).default_value = default_value
    ____ptr
  extension (struct: GParamSpecInt)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def minimum : _root_.sn.gnome.glib.internal.gint = struct._2
    def minimum_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at2 = value
    def maximum : _root_.sn.gnome.glib.internal.gint = struct._3
    def maximum_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at3 = value
    def default_value : _root_.sn.gnome.glib.internal.gint = struct._4
    def default_value_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at4 = value

/**
 * GParamSpecInt64: _instance: private #GParamSpec portion : minimum value for the property specified : maximum value for the property specified _value: default value for the property specified
*/
opaque type GParamSpecInt64 = CStruct4[GParamSpec, _root_.sn.gnome.glib.internal.gint64, _root_.sn.gnome.glib.internal.gint64, _root_.sn.gnome.glib.internal.gint64]
object GParamSpecInt64:
  given _tag: Tag[GParamSpecInt64] = Tag.materializeCStruct4Tag[GParamSpec, _root_.sn.gnome.glib.internal.gint64, _root_.sn.gnome.glib.internal.gint64, _root_.sn.gnome.glib.internal.gint64]
  def apply()(using Zone): Ptr[GParamSpecInt64] = scala.scalanative.unsafe.alloc[GParamSpecInt64](1)
  def apply(parent_instance : GParamSpec, minimum : _root_.sn.gnome.glib.internal.gint64, maximum : _root_.sn.gnome.glib.internal.gint64, default_value : _root_.sn.gnome.glib.internal.gint64)(using Zone): Ptr[GParamSpecInt64] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).minimum = minimum
    (!____ptr).maximum = maximum
    (!____ptr).default_value = default_value
    ____ptr
  extension (struct: GParamSpecInt64)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def minimum : _root_.sn.gnome.glib.internal.gint64 = struct._2
    def minimum_=(value: _root_.sn.gnome.glib.internal.gint64): Unit = !struct.at2 = value
    def maximum : _root_.sn.gnome.glib.internal.gint64 = struct._3
    def maximum_=(value: _root_.sn.gnome.glib.internal.gint64): Unit = !struct.at3 = value
    def default_value : _root_.sn.gnome.glib.internal.gint64 = struct._4
    def default_value_=(value: _root_.sn.gnome.glib.internal.gint64): Unit = !struct.at4 = value

/**
 * GParamSpecLong: _instance: private #GParamSpec portion : minimum value for the property specified : maximum value for the property specified _value: default value for the property specified
*/
opaque type GParamSpecLong = CStruct4[GParamSpec, _root_.sn.gnome.glib.internal.glong, _root_.sn.gnome.glib.internal.glong, _root_.sn.gnome.glib.internal.glong]
object GParamSpecLong:
  given _tag: Tag[GParamSpecLong] = Tag.materializeCStruct4Tag[GParamSpec, _root_.sn.gnome.glib.internal.glong, _root_.sn.gnome.glib.internal.glong, _root_.sn.gnome.glib.internal.glong]
  def apply()(using Zone): Ptr[GParamSpecLong] = scala.scalanative.unsafe.alloc[GParamSpecLong](1)
  def apply(parent_instance : GParamSpec, minimum : _root_.sn.gnome.glib.internal.glong, maximum : _root_.sn.gnome.glib.internal.glong, default_value : _root_.sn.gnome.glib.internal.glong)(using Zone): Ptr[GParamSpecLong] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).minimum = minimum
    (!____ptr).maximum = maximum
    (!____ptr).default_value = default_value
    ____ptr
  extension (struct: GParamSpecLong)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def minimum : _root_.sn.gnome.glib.internal.glong = struct._2
    def minimum_=(value: _root_.sn.gnome.glib.internal.glong): Unit = !struct.at2 = value
    def maximum : _root_.sn.gnome.glib.internal.glong = struct._3
    def maximum_=(value: _root_.sn.gnome.glib.internal.glong): Unit = !struct.at3 = value
    def default_value : _root_.sn.gnome.glib.internal.glong = struct._4
    def default_value_=(value: _root_.sn.gnome.glib.internal.glong): Unit = !struct.at4 = value

/**
 * GParamSpecObject: _instance: private #GParamSpec portion
*/
opaque type GParamSpecObject = CStruct1[GParamSpec]
object GParamSpecObject:
  given _tag: Tag[GParamSpecObject] = Tag.materializeCStruct1Tag[GParamSpec]
  def apply()(using Zone): Ptr[GParamSpecObject] = scala.scalanative.unsafe.alloc[GParamSpecObject](1)
  def apply(parent_instance : GParamSpec)(using Zone): Ptr[GParamSpecObject] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GParamSpecObject)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value

/**
 * GParamSpecOverride:
*/
opaque type GParamSpecOverride = CStruct2[GParamSpec, Ptr[GParamSpec]]
object GParamSpecOverride:
  given _tag: Tag[GParamSpecOverride] = Tag.materializeCStruct2Tag[GParamSpec, Ptr[GParamSpec]]
  def apply()(using Zone): Ptr[GParamSpecOverride] = scala.scalanative.unsafe.alloc[GParamSpecOverride](1)
  def apply(parent_instance : GParamSpec, overridden : Ptr[GParamSpec])(using Zone): Ptr[GParamSpecOverride] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).overridden = overridden
    ____ptr
  extension (struct: GParamSpecOverride)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def overridden : Ptr[GParamSpec] = struct._2
    def overridden_=(value: Ptr[GParamSpec]): Unit = !struct.at2 = value

/**
 * GParamSpecParam: _instance: private #GParamSpec portion
*/
opaque type GParamSpecParam = CStruct1[GParamSpec]
object GParamSpecParam:
  given _tag: Tag[GParamSpecParam] = Tag.materializeCStruct1Tag[GParamSpec]
  def apply()(using Zone): Ptr[GParamSpecParam] = scala.scalanative.unsafe.alloc[GParamSpecParam](1)
  def apply(parent_instance : GParamSpec)(using Zone): Ptr[GParamSpecParam] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GParamSpecParam)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value

/**
 * GParamSpecPointer: _instance: private #GParamSpec portion
*/
opaque type GParamSpecPointer = CStruct1[GParamSpec]
object GParamSpecPointer:
  given _tag: Tag[GParamSpecPointer] = Tag.materializeCStruct1Tag[GParamSpec]
  def apply()(using Zone): Ptr[GParamSpecPointer] = scala.scalanative.unsafe.alloc[GParamSpecPointer](1)
  def apply(parent_instance : GParamSpec)(using Zone): Ptr[GParamSpecPointer] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GParamSpecPointer)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value

opaque type GParamSpecPool = CStruct0
object GParamSpecPool:
  given _tag: Tag[GParamSpecPool] = Tag.materializeCStruct0Tag

/**
 * GParamSpecString: _instance: private #GParamSpec portion _value: default value for the property specified _first: a string containing the allowed values for the first byte _nth: a string containing the allowed values for the subsequent bytes : the replacement byte for bytes which don't match _first or _nth. _fold_if_empty: replace empty string by %NULL _non_null: replace %NULL strings by an empty string
*/
opaque type GParamSpecString = CStruct7[GParamSpec, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gchar, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
object GParamSpecString:
  given _tag: Tag[GParamSpecString] = Tag.materializeCStruct7Tag[GParamSpec, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gchar, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
  def apply()(using Zone): Ptr[GParamSpecString] = scala.scalanative.unsafe.alloc[GParamSpecString](1)
  def apply(parent_instance : GParamSpec, default_value : Ptr[_root_.sn.gnome.glib.internal.gchar], cset_first : Ptr[_root_.sn.gnome.glib.internal.gchar], cset_nth : Ptr[_root_.sn.gnome.glib.internal.gchar], substitutor : _root_.sn.gnome.glib.internal.gchar, null_fold_if_empty : _root_.sn.gnome.glib.internal.guint, ensure_non_null : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[GParamSpecString] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).default_value = default_value
    (!____ptr).cset_first = cset_first
    (!____ptr).cset_nth = cset_nth
    (!____ptr).substitutor = substitutor
    (!____ptr).null_fold_if_empty = null_fold_if_empty
    (!____ptr).ensure_non_null = ensure_non_null
    ____ptr
  extension (struct: GParamSpecString)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def default_value : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
    def default_value_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at2 = value
    def cset_first : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._3
    def cset_first_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at3 = value
    def cset_nth : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._4
    def cset_nth_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at4 = value
    def substitutor : _root_.sn.gnome.glib.internal.gchar = struct._5
    def substitutor_=(value: _root_.sn.gnome.glib.internal.gchar): Unit = !struct.at5 = value
    def null_fold_if_empty : _root_.sn.gnome.glib.internal.guint = struct._6
    def null_fold_if_empty_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at6 = value
    def ensure_non_null : _root_.sn.gnome.glib.internal.guint = struct._7
    def ensure_non_null_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at7 = value

/**
 * GParamSpecTypeInfo: _size: Size of the instance (object) structure. _preallocs: Prior to GLib 2.10, it specified the number of pre-allocated (cached) instances to reserve memory for (0 indicates no caching). Since GLib 2.10, it is ignored, since instances are allocated with the [slice allocator][glib-Memory-Slices] now. _init: Location of the instance initialization function (optional). _type: The #GType of values conforming to this #GParamSpec : The instance finalization function (optional). _set_default: Resets a to the default value for (recommended, the default is g_value_reset()), see g_param_value_set_default(). _validate: Ensures that the contents of comply with the specifications set out by (optional), see g_param_value_validate(). _cmp: Compares with according to (recommended, the default is memcmp()), see g_param_values_cmp().
*/
opaque type GParamSpecTypeInfo = CStruct8[_root_.sn.gnome.glib.internal.guint16, _root_.sn.gnome.glib.internal.guint16, CFuncPtr1[Ptr[GParamSpec], Unit], GType, CFuncPtr1[Ptr[GParamSpec], Unit], CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], Unit], CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GParamSpec], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gint]]
object GParamSpecTypeInfo:
  given _tag: Tag[GParamSpecTypeInfo] = Tag.materializeCStruct8Tag[_root_.sn.gnome.glib.internal.guint16, _root_.sn.gnome.glib.internal.guint16, CFuncPtr1[Ptr[GParamSpec], Unit], GType, CFuncPtr1[Ptr[GParamSpec], Unit], CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], Unit], CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GParamSpec], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gint]]
  def apply()(using Zone): Ptr[GParamSpecTypeInfo] = scala.scalanative.unsafe.alloc[GParamSpecTypeInfo](1)
  def apply(instance_size : _root_.sn.gnome.glib.internal.guint16, n_preallocs : _root_.sn.gnome.glib.internal.guint16, instance_init : CFuncPtr1[Ptr[GParamSpec], Unit], value_type : GType, finalize : CFuncPtr1[Ptr[GParamSpec], Unit], value_set_default : CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], Unit], value_validate : CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean], values_cmp : CFuncPtr3[Ptr[GParamSpec], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gint])(using Zone): Ptr[GParamSpecTypeInfo] = 
    val ____ptr = apply()
    (!____ptr).instance_size = instance_size
    (!____ptr).n_preallocs = n_preallocs
    (!____ptr).instance_init = instance_init
    (!____ptr).value_type = value_type
    (!____ptr).finalize = finalize
    (!____ptr).value_set_default = value_set_default
    (!____ptr).value_validate = value_validate
    (!____ptr).values_cmp = values_cmp
    ____ptr
  extension (struct: GParamSpecTypeInfo)
    def instance_size : _root_.sn.gnome.glib.internal.guint16 = struct._1
    def instance_size_=(value: _root_.sn.gnome.glib.internal.guint16): Unit = !struct.at1 = value
    def n_preallocs : _root_.sn.gnome.glib.internal.guint16 = struct._2
    def n_preallocs_=(value: _root_.sn.gnome.glib.internal.guint16): Unit = !struct.at2 = value
    def instance_init : CFuncPtr1[Ptr[GParamSpec], Unit] = struct._3
    def instance_init_=(value: CFuncPtr1[Ptr[GParamSpec], Unit]): Unit = !struct.at3 = value
    def value_type : GType = struct._4
    def value_type_=(value: GType): Unit = !struct.at4 = value
    def finalize : CFuncPtr1[Ptr[GParamSpec], Unit] = struct._5
    def finalize_=(value: CFuncPtr1[Ptr[GParamSpec], Unit]): Unit = !struct.at5 = value
    def value_set_default : CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], Unit] = struct._6
    def value_set_default_=(value: CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], Unit]): Unit = !struct.at6 = value
    def value_validate : CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean] = struct._7
    def value_validate_=(value: CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at7 = value
    def values_cmp : CFuncPtr3[Ptr[GParamSpec], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gint] = struct._8
    def values_cmp_=(value: CFuncPtr3[Ptr[GParamSpec], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gint]): Unit = !struct.at8 = value

/**
 * GParamSpecUChar: _instance: private #GParamSpec portion : minimum value for the property specified : maximum value for the property specified _value: default value for the property specified
*/
opaque type GParamSpecUChar = CStruct4[GParamSpec, _root_.sn.gnome.glib.internal.guint8, _root_.sn.gnome.glib.internal.guint8, _root_.sn.gnome.glib.internal.guint8]
object GParamSpecUChar:
  given _tag: Tag[GParamSpecUChar] = Tag.materializeCStruct4Tag[GParamSpec, _root_.sn.gnome.glib.internal.guint8, _root_.sn.gnome.glib.internal.guint8, _root_.sn.gnome.glib.internal.guint8]
  def apply()(using Zone): Ptr[GParamSpecUChar] = scala.scalanative.unsafe.alloc[GParamSpecUChar](1)
  def apply(parent_instance : GParamSpec, minimum : _root_.sn.gnome.glib.internal.guint8, maximum : _root_.sn.gnome.glib.internal.guint8, default_value : _root_.sn.gnome.glib.internal.guint8)(using Zone): Ptr[GParamSpecUChar] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).minimum = minimum
    (!____ptr).maximum = maximum
    (!____ptr).default_value = default_value
    ____ptr
  extension (struct: GParamSpecUChar)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def minimum : _root_.sn.gnome.glib.internal.guint8 = struct._2
    def minimum_=(value: _root_.sn.gnome.glib.internal.guint8): Unit = !struct.at2 = value
    def maximum : _root_.sn.gnome.glib.internal.guint8 = struct._3
    def maximum_=(value: _root_.sn.gnome.glib.internal.guint8): Unit = !struct.at3 = value
    def default_value : _root_.sn.gnome.glib.internal.guint8 = struct._4
    def default_value_=(value: _root_.sn.gnome.glib.internal.guint8): Unit = !struct.at4 = value

/**
 * GParamSpecUInt: _instance: private #GParamSpec portion : minimum value for the property specified : maximum value for the property specified _value: default value for the property specified
*/
opaque type GParamSpecUInt = CStruct4[GParamSpec, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
object GParamSpecUInt:
  given _tag: Tag[GParamSpecUInt] = Tag.materializeCStruct4Tag[GParamSpec, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
  def apply()(using Zone): Ptr[GParamSpecUInt] = scala.scalanative.unsafe.alloc[GParamSpecUInt](1)
  def apply(parent_instance : GParamSpec, minimum : _root_.sn.gnome.glib.internal.guint, maximum : _root_.sn.gnome.glib.internal.guint, default_value : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[GParamSpecUInt] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).minimum = minimum
    (!____ptr).maximum = maximum
    (!____ptr).default_value = default_value
    ____ptr
  extension (struct: GParamSpecUInt)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def minimum : _root_.sn.gnome.glib.internal.guint = struct._2
    def minimum_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at2 = value
    def maximum : _root_.sn.gnome.glib.internal.guint = struct._3
    def maximum_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at3 = value
    def default_value : _root_.sn.gnome.glib.internal.guint = struct._4
    def default_value_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at4 = value

/**
 * GParamSpecUInt64: _instance: private #GParamSpec portion : minimum value for the property specified : maximum value for the property specified _value: default value for the property specified
*/
opaque type GParamSpecUInt64 = CStruct4[GParamSpec, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.guint64]
object GParamSpecUInt64:
  given _tag: Tag[GParamSpecUInt64] = Tag.materializeCStruct4Tag[GParamSpec, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.guint64]
  def apply()(using Zone): Ptr[GParamSpecUInt64] = scala.scalanative.unsafe.alloc[GParamSpecUInt64](1)
  def apply(parent_instance : GParamSpec, minimum : _root_.sn.gnome.glib.internal.guint64, maximum : _root_.sn.gnome.glib.internal.guint64, default_value : _root_.sn.gnome.glib.internal.guint64)(using Zone): Ptr[GParamSpecUInt64] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).minimum = minimum
    (!____ptr).maximum = maximum
    (!____ptr).default_value = default_value
    ____ptr
  extension (struct: GParamSpecUInt64)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def minimum : _root_.sn.gnome.glib.internal.guint64 = struct._2
    def minimum_=(value: _root_.sn.gnome.glib.internal.guint64): Unit = !struct.at2 = value
    def maximum : _root_.sn.gnome.glib.internal.guint64 = struct._3
    def maximum_=(value: _root_.sn.gnome.glib.internal.guint64): Unit = !struct.at3 = value
    def default_value : _root_.sn.gnome.glib.internal.guint64 = struct._4
    def default_value_=(value: _root_.sn.gnome.glib.internal.guint64): Unit = !struct.at4 = value

/**
 * GParamSpecULong: _instance: private #GParamSpec portion : minimum value for the property specified : maximum value for the property specified _value: default value for the property specified
*/
opaque type GParamSpecULong = CStruct4[GParamSpec, _root_.sn.gnome.glib.internal.gulong, _root_.sn.gnome.glib.internal.gulong, _root_.sn.gnome.glib.internal.gulong]
object GParamSpecULong:
  given _tag: Tag[GParamSpecULong] = Tag.materializeCStruct4Tag[GParamSpec, _root_.sn.gnome.glib.internal.gulong, _root_.sn.gnome.glib.internal.gulong, _root_.sn.gnome.glib.internal.gulong]
  def apply()(using Zone): Ptr[GParamSpecULong] = scala.scalanative.unsafe.alloc[GParamSpecULong](1)
  def apply(parent_instance : GParamSpec, minimum : _root_.sn.gnome.glib.internal.gulong, maximum : _root_.sn.gnome.glib.internal.gulong, default_value : _root_.sn.gnome.glib.internal.gulong)(using Zone): Ptr[GParamSpecULong] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).minimum = minimum
    (!____ptr).maximum = maximum
    (!____ptr).default_value = default_value
    ____ptr
  extension (struct: GParamSpecULong)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def minimum : _root_.sn.gnome.glib.internal.gulong = struct._2
    def minimum_=(value: _root_.sn.gnome.glib.internal.gulong): Unit = !struct.at2 = value
    def maximum : _root_.sn.gnome.glib.internal.gulong = struct._3
    def maximum_=(value: _root_.sn.gnome.glib.internal.gulong): Unit = !struct.at3 = value
    def default_value : _root_.sn.gnome.glib.internal.gulong = struct._4
    def default_value_=(value: _root_.sn.gnome.glib.internal.gulong): Unit = !struct.at4 = value

/**
 * GParamSpecUnichar: _instance: private #GParamSpec portion _value: default value for the property specified
*/
opaque type GParamSpecUnichar = CStruct2[GParamSpec, _root_.sn.gnome.glib.internal.gunichar]
object GParamSpecUnichar:
  given _tag: Tag[GParamSpecUnichar] = Tag.materializeCStruct2Tag[GParamSpec, _root_.sn.gnome.glib.internal.gunichar]
  def apply()(using Zone): Ptr[GParamSpecUnichar] = scala.scalanative.unsafe.alloc[GParamSpecUnichar](1)
  def apply(parent_instance : GParamSpec, default_value : _root_.sn.gnome.glib.internal.gunichar)(using Zone): Ptr[GParamSpecUnichar] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).default_value = default_value
    ____ptr
  extension (struct: GParamSpecUnichar)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def default_value : _root_.sn.gnome.glib.internal.gunichar = struct._2
    def default_value_=(value: _root_.sn.gnome.glib.internal.gunichar): Unit = !struct.at2 = value

/**
 * GParamSpecValueArray: _instance: private #GParamSpec portion _spec: a #GParamSpec describing the elements contained in arrays of this property, may be %NULL _n_elements: if greater than 0, arrays of this property will always have this many elements
*/
opaque type GParamSpecValueArray = CStruct3[GParamSpec, Ptr[GParamSpec], _root_.sn.gnome.glib.internal.guint]
object GParamSpecValueArray:
  given _tag: Tag[GParamSpecValueArray] = Tag.materializeCStruct3Tag[GParamSpec, Ptr[GParamSpec], _root_.sn.gnome.glib.internal.guint]
  def apply()(using Zone): Ptr[GParamSpecValueArray] = scala.scalanative.unsafe.alloc[GParamSpecValueArray](1)
  def apply(parent_instance : GParamSpec, element_spec : Ptr[GParamSpec], fixed_n_elements : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[GParamSpecValueArray] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).element_spec = element_spec
    (!____ptr).fixed_n_elements = fixed_n_elements
    ____ptr
  extension (struct: GParamSpecValueArray)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def element_spec : Ptr[GParamSpec] = struct._2
    def element_spec_=(value: Ptr[GParamSpec]): Unit = !struct.at2 = value
    def fixed_n_elements : _root_.sn.gnome.glib.internal.guint = struct._3
    def fixed_n_elements_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at3 = value

/**
 * GParamSpecVariant: _instance: private #GParamSpec portion : a #GVariantType, or %NULL _value: a #GVariant, or %NULL
*/
opaque type GParamSpecVariant = CStruct4[GParamSpec, Ptr[_root_.sn.gnome.glib.internal.GVariantType], Ptr[_root_.sn.gnome.glib.internal.GVariant], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
object GParamSpecVariant:
  given _tag: Tag[GParamSpecVariant] = Tag.materializeCStruct4Tag[GParamSpec, Ptr[_root_.sn.gnome.glib.internal.GVariantType], Ptr[_root_.sn.gnome.glib.internal.GVariant], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[GParamSpecVariant] = scala.scalanative.unsafe.alloc[GParamSpecVariant](1)
  def apply(parent_instance : GParamSpec, `type` : Ptr[_root_.sn.gnome.glib.internal.GVariantType], default_value : Ptr[_root_.sn.gnome.glib.internal.GVariant], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[GParamSpecVariant] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).`type` = `type`
    (!____ptr).default_value = default_value
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GParamSpecVariant)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def `type` : Ptr[_root_.sn.gnome.glib.internal.GVariantType] = struct._2
    def type_=(value: Ptr[_root_.sn.gnome.glib.internal.GVariantType]): Unit = !struct.at2 = value
    def default_value : Ptr[_root_.sn.gnome.glib.internal.GVariant] = struct._3
    def default_value_=(value: Ptr[_root_.sn.gnome.glib.internal.GVariant]): Unit = !struct.at3 = value
    def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._4
    def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = !struct.at4 = value

/**
 * GParameter: : the parameter value
*/
opaque type GParameter = CStruct2[Ptr[_root_.sn.gnome.glib.internal.gchar], GValue]
object GParameter:
  given _tag: Tag[GParameter] = Tag.materializeCStruct2Tag[Ptr[_root_.sn.gnome.glib.internal.gchar], GValue]
  def apply()(using Zone): Ptr[GParameter] = scala.scalanative.unsafe.alloc[GParameter](1)
  def apply(name : Ptr[_root_.sn.gnome.glib.internal.gchar], value : GValue)(using Zone): Ptr[GParameter] = 
    val ____ptr = apply()
    (!____ptr).name = name
    (!____ptr).value = value
    ____ptr
  extension (struct: GParameter)
    def name : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._1
    def name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at1 = value
    def value : GValue = struct._2
    def value_=(value: GValue): Unit = !struct.at2 = value

opaque type GSignalGroup = CStruct0
object GSignalGroup:
  given _tag: Tag[GSignalGroup] = Tag.materializeCStruct0Tag

/**
 * GSignalInvocationHint: _id: The signal id of the signal invoking the callback
*/
opaque type GSignalInvocationHint = CStruct3[_root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.GQuark, GSignalFlags]
object GSignalInvocationHint:
  given _tag: Tag[GSignalInvocationHint] = Tag.materializeCStruct3Tag[_root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.GQuark, GSignalFlags]
  def apply()(using Zone): Ptr[GSignalInvocationHint] = scala.scalanative.unsafe.alloc[GSignalInvocationHint](1)
  def apply(signal_id : _root_.sn.gnome.glib.internal.guint, detail : _root_.sn.gnome.glib.internal.GQuark, run_type : GSignalFlags)(using Zone): Ptr[GSignalInvocationHint] = 
    val ____ptr = apply()
    (!____ptr).signal_id = signal_id
    (!____ptr).detail = detail
    (!____ptr).run_type = run_type
    ____ptr
  extension (struct: GSignalInvocationHint)
    def signal_id : _root_.sn.gnome.glib.internal.guint = struct._1
    def signal_id_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at1 = value
    def detail : _root_.sn.gnome.glib.internal.GQuark = struct._2
    def detail_=(value: _root_.sn.gnome.glib.internal.GQuark): Unit = !struct.at2 = value
    def run_type : GSignalFlags = struct._3
    def run_type_=(value: GSignalFlags): Unit = !struct.at3 = value

/**
 * GSignalQuery: _id: The signal id of the signal being queried, or 0 if the signal to be queried was unknown. _name: The signal name. : The interface/instance type that this signal can be emitted for. _flags: The signal flags as passed in to g_signal_new().
*/
opaque type GSignalQuery = CStruct7[_root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.gchar], GType, GSignalFlags, GType, _root_.sn.gnome.glib.internal.guint, Ptr[GType]]
object GSignalQuery:
  given _tag: Tag[GSignalQuery] = Tag.materializeCStruct7Tag[_root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.gchar], GType, GSignalFlags, GType, _root_.sn.gnome.glib.internal.guint, Ptr[GType]]
  def apply()(using Zone): Ptr[GSignalQuery] = scala.scalanative.unsafe.alloc[GSignalQuery](1)
  def apply(signal_id : _root_.sn.gnome.glib.internal.guint, signal_name : Ptr[_root_.sn.gnome.glib.internal.gchar], itype : GType, signal_flags : GSignalFlags, return_type : GType, n_params : _root_.sn.gnome.glib.internal.guint, param_types : Ptr[GType])(using Zone): Ptr[GSignalQuery] = 
    val ____ptr = apply()
    (!____ptr).signal_id = signal_id
    (!____ptr).signal_name = signal_name
    (!____ptr).itype = itype
    (!____ptr).signal_flags = signal_flags
    (!____ptr).return_type = return_type
    (!____ptr).n_params = n_params
    (!____ptr).param_types = param_types
    ____ptr
  extension (struct: GSignalQuery)
    def signal_id : _root_.sn.gnome.glib.internal.guint = struct._1
    def signal_id_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at1 = value
    def signal_name : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
    def signal_name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at2 = value
    def itype : GType = struct._3
    def itype_=(value: GType): Unit = !struct.at3 = value
    def signal_flags : GSignalFlags = struct._4
    def signal_flags_=(value: GSignalFlags): Unit = !struct.at4 = value
    def return_type : GType = struct._5
    def return_type_=(value: GType): Unit = !struct.at5 = value
    def n_params : _root_.sn.gnome.glib.internal.guint = struct._6
    def n_params_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at6 = value
    def param_types : Ptr[GType] = struct._7
    def param_types_=(value: Ptr[GType]): Unit = !struct.at7 = value

/**
 * GTypeClass:
*/
opaque type GTypeClass = CStruct1[GType]
object GTypeClass:
  given _tag: Tag[GTypeClass] = Tag.materializeCStruct1Tag[GType]
  def apply()(using Zone): Ptr[GTypeClass] = scala.scalanative.unsafe.alloc[GTypeClass](1)
  def apply(g_type : GType)(using Zone): Ptr[GTypeClass] = 
    val ____ptr = apply()
    (!____ptr).g_type = g_type
    ____ptr
  extension (struct: GTypeClass)
    def g_type : GType = struct._1
    def g_type_=(value: GType): Unit = !struct.at1 = value

/**
 * GTypeFundamentalInfo: _flags: #GTypeFundamentalFlags describing the characteristics of the fundamental type
*/
opaque type GTypeFundamentalInfo = CStruct1[GTypeFundamentalFlags]
object GTypeFundamentalInfo:
  given _tag: Tag[GTypeFundamentalInfo] = Tag.materializeCStruct1Tag[GTypeFundamentalFlags]
  def apply()(using Zone): Ptr[GTypeFundamentalInfo] = scala.scalanative.unsafe.alloc[GTypeFundamentalInfo](1)
  def apply(type_flags : GTypeFundamentalFlags)(using Zone): Ptr[GTypeFundamentalInfo] = 
    val ____ptr = apply()
    (!____ptr).type_flags = type_flags
    ____ptr
  extension (struct: GTypeFundamentalInfo)
    def type_flags : GTypeFundamentalFlags = struct._1
    def type_flags_=(value: GTypeFundamentalFlags): Unit = !struct.at1 = value

/**
 * GTypeInfo: _init: Location of the base initialization function (optional) _finalize: Location of the base finalization function (optional) classed and instantiatable types. Location of the default vtable inititalization function for interface types. (optional) This function is used both to fill in virtual functions in the class or default vtable, and to do type-specific setup such as registering signals and object properties. classed and instantiatable types. Location of the default vtable finalization function for interface types. (optional) _size: Size of the instance (object) structure (required for instantiatable types only) _preallocs: Prior to GLib 2.10, it specified the number of pre-allocated (cached) instances to reserve memory for (0 indicates no caching). Since GLib 2.10 this field is ignored. _init: Location of the instance initialization function (optional, for instantiatable types only) _table: A #GTypeValueTable function table for generic handling of GValues of this type (usually only useful for fundamental types)
*/
opaque type GTypeInfo = CStruct10[_root_.sn.gnome.glib.internal.guint16, GBaseInitFunc, GBaseFinalizeFunc, GClassInitFunc, GClassFinalizeFunc, _root_.sn.gnome.glib.internal.gconstpointer, _root_.sn.gnome.glib.internal.guint16, _root_.sn.gnome.glib.internal.guint16, GInstanceInitFunc, Ptr[GTypeValueTable]]
object GTypeInfo:
  given _tag: Tag[GTypeInfo] = Tag.materializeCStruct10Tag[_root_.sn.gnome.glib.internal.guint16, GBaseInitFunc, GBaseFinalizeFunc, GClassInitFunc, GClassFinalizeFunc, _root_.sn.gnome.glib.internal.gconstpointer, _root_.sn.gnome.glib.internal.guint16, _root_.sn.gnome.glib.internal.guint16, GInstanceInitFunc, Ptr[GTypeValueTable]]
  def apply()(using Zone): Ptr[GTypeInfo] = scala.scalanative.unsafe.alloc[GTypeInfo](1)
  def apply(class_size : _root_.sn.gnome.glib.internal.guint16, base_init : GBaseInitFunc, base_finalize : GBaseFinalizeFunc, class_init : GClassInitFunc, class_finalize : GClassFinalizeFunc, class_data : _root_.sn.gnome.glib.internal.gconstpointer, instance_size : _root_.sn.gnome.glib.internal.guint16, n_preallocs : _root_.sn.gnome.glib.internal.guint16, instance_init : GInstanceInitFunc, value_table : Ptr[GTypeValueTable])(using Zone): Ptr[GTypeInfo] = 
    val ____ptr = apply()
    (!____ptr).class_size = class_size
    (!____ptr).base_init = base_init
    (!____ptr).base_finalize = base_finalize
    (!____ptr).class_init = class_init
    (!____ptr).class_finalize = class_finalize
    (!____ptr).class_data = class_data
    (!____ptr).instance_size = instance_size
    (!____ptr).n_preallocs = n_preallocs
    (!____ptr).instance_init = instance_init
    (!____ptr).value_table = value_table
    ____ptr
  extension (struct: GTypeInfo)
    def class_size : _root_.sn.gnome.glib.internal.guint16 = struct._1
    def class_size_=(value: _root_.sn.gnome.glib.internal.guint16): Unit = !struct.at1 = value
    def base_init : GBaseInitFunc = struct._2
    def base_init_=(value: GBaseInitFunc): Unit = !struct.at2 = value
    def base_finalize : GBaseFinalizeFunc = struct._3
    def base_finalize_=(value: GBaseFinalizeFunc): Unit = !struct.at3 = value
    def class_init : GClassInitFunc = struct._4
    def class_init_=(value: GClassInitFunc): Unit = !struct.at4 = value
    def class_finalize : GClassFinalizeFunc = struct._5
    def class_finalize_=(value: GClassFinalizeFunc): Unit = !struct.at5 = value
    def class_data : _root_.sn.gnome.glib.internal.gconstpointer = struct._6
    def class_data_=(value: _root_.sn.gnome.glib.internal.gconstpointer): Unit = !struct.at6 = value
    def instance_size : _root_.sn.gnome.glib.internal.guint16 = struct._7
    def instance_size_=(value: _root_.sn.gnome.glib.internal.guint16): Unit = !struct.at7 = value
    def n_preallocs : _root_.sn.gnome.glib.internal.guint16 = struct._8
    def n_preallocs_=(value: _root_.sn.gnome.glib.internal.guint16): Unit = !struct.at8 = value
    def instance_init : GInstanceInitFunc = struct._9
    def instance_init_=(value: GInstanceInitFunc): Unit = !struct.at9 = value
    def value_table : Ptr[GTypeValueTable] = struct._10
    def value_table_=(value: Ptr[GTypeValueTable]): Unit = !struct.at10 = value

/**
 * GTypeInstance:
*/
opaque type GTypeInstance = CStruct1[Ptr[GTypeClass]]
object GTypeInstance:
  given _tag: Tag[GTypeInstance] = Tag.materializeCStruct1Tag[Ptr[GTypeClass]]
  def apply()(using Zone): Ptr[GTypeInstance] = scala.scalanative.unsafe.alloc[GTypeInstance](1)
  def apply(g_class : Ptr[GTypeClass])(using Zone): Ptr[GTypeInstance] = 
    val ____ptr = apply()
    (!____ptr).g_class = g_class
    ____ptr
  extension (struct: GTypeInstance)
    def g_class : Ptr[GTypeClass] = struct._1
    def g_class_=(value: Ptr[GTypeClass]): Unit = !struct.at1 = value

/**
 * GTypeInterface:
*/
opaque type GTypeInterface = CStruct2[GType, GType]
object GTypeInterface:
  given _tag: Tag[GTypeInterface] = Tag.materializeCStruct2Tag[GType, GType]
  def apply()(using Zone): Ptr[GTypeInterface] = scala.scalanative.unsafe.alloc[GTypeInterface](1)
  def apply(g_type : GType, g_instance_type : GType)(using Zone): Ptr[GTypeInterface] = 
    val ____ptr = apply()
    (!____ptr).g_type = g_type
    (!____ptr).g_instance_type = g_instance_type
    ____ptr
  extension (struct: GTypeInterface)
    def g_type : GType = struct._1
    def g_type_=(value: GType): Unit = !struct.at1 = value
    def g_instance_type : GType = struct._2
    def g_instance_type_=(value: GType): Unit = !struct.at2 = value

opaque type GTypeModule = CStruct5[GObject, _root_.sn.gnome.glib.internal.guint, Ptr[Byte], Ptr[Byte], Ptr[_root_.sn.gnome.glib.internal.gchar]]
object GTypeModule:
  given _tag: Tag[GTypeModule] = Tag.materializeCStruct5Tag[GObject, _root_.sn.gnome.glib.internal.guint, Ptr[Byte], Ptr[Byte], Ptr[_root_.sn.gnome.glib.internal.gchar]]
  def apply()(using Zone): Ptr[GTypeModule] = scala.scalanative.unsafe.alloc[GTypeModule](1)
  def apply(parent_instance : GObject, use_count : _root_.sn.gnome.glib.internal.guint, type_infos : Ptr[_root_.sn.gnome.glib.internal.GSList], interface_infos : Ptr[_root_.sn.gnome.glib.internal.GSList], name : Ptr[_root_.sn.gnome.glib.internal.gchar])(using Zone): Ptr[GTypeModule] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).use_count = use_count
    (!____ptr).type_infos = type_infos
    (!____ptr).interface_infos = interface_infos
    (!____ptr).name = name
    ____ptr
  extension (struct: GTypeModule)
    def parent_instance : GObject = struct._1
    def parent_instance_=(value: GObject): Unit = !struct.at1 = value
    def use_count : _root_.sn.gnome.glib.internal.guint = struct._2
    def use_count_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at2 = value
    def type_infos : Ptr[_root_.sn.gnome.glib.internal.GSList] = struct._3.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GSList]]
    def type_infos_=(value: Ptr[_root_.sn.gnome.glib.internal.GSList]): Unit = !struct.at3 = value.asInstanceOf[Ptr[Byte]]
    def interface_infos : Ptr[_root_.sn.gnome.glib.internal.GSList] = struct._4.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GSList]]
    def interface_infos_=(value: Ptr[_root_.sn.gnome.glib.internal.GSList]): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
    def name : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._5
    def name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at5 = value

/**
 * GTypeModuleClass: _class: the parent class : loads the module and registers one or more types using g_type_module_register_type(). : unloads the module
*/
opaque type GTypeModuleClass = CStruct7[GObjectClass, CFuncPtr1[Ptr[Byte], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object GTypeModuleClass:
  given _tag: Tag[GTypeModuleClass] = Tag.materializeCStruct7Tag[GObjectClass, CFuncPtr1[Ptr[Byte], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[GTypeModuleClass] = scala.scalanative.unsafe.alloc[GTypeModuleClass](1)
  def apply(parent_class : GObjectClass, load : CFuncPtr1[Ptr[GTypeModule], _root_.sn.gnome.glib.internal.gboolean], unload : CFuncPtr1[Ptr[GTypeModule], Unit], reserved1 : CFuncPtr0[Unit], reserved2 : CFuncPtr0[Unit], reserved3 : CFuncPtr0[Unit], reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[GTypeModuleClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).load = load
    (!____ptr).unload = unload
    (!____ptr).reserved1 = reserved1
    (!____ptr).reserved2 = reserved2
    (!____ptr).reserved3 = reserved3
    (!____ptr).reserved4 = reserved4
    ____ptr
  extension (struct: GTypeModuleClass)
    def parent_class : GObjectClass = struct._1
    def parent_class_=(value: GObjectClass): Unit = !struct.at1 = value
    def load : CFuncPtr1[Ptr[GTypeModule], _root_.sn.gnome.glib.internal.gboolean] = struct._2.asInstanceOf[CFuncPtr1[Ptr[GTypeModule], _root_.sn.gnome.glib.internal.gboolean]]
    def load_=(value: CFuncPtr1[Ptr[GTypeModule], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at2 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], _root_.sn.gnome.glib.internal.gboolean]]
    def unload : CFuncPtr1[Ptr[GTypeModule], Unit] = struct._3.asInstanceOf[CFuncPtr1[Ptr[GTypeModule], Unit]]
    def unload_=(value: CFuncPtr1[Ptr[GTypeModule], Unit]): Unit = !struct.at3 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], Unit]]
    def reserved1 : CFuncPtr0[Unit] = struct._4
    def reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at4 = value
    def reserved2 : CFuncPtr0[Unit] = struct._5
    def reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at5 = value
    def reserved3 : CFuncPtr0[Unit] = struct._6
    def reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at6 = value
    def reserved4 : CFuncPtr0[Unit] = struct._7
    def reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at7 = value

opaque type GTypePlugin = CStruct0
object GTypePlugin:
  given _tag: Tag[GTypePlugin] = Tag.materializeCStruct0Tag

/**
 * GTypePluginClass: _plugin: Increases the use count of the plugin. _plugin: Decreases the use count of the plugin. _type_info: Fills in the #GTypeInfo and #GTypeValueTable structs for the type. The structs are initialized with `memset(s, 0, sizeof (s))` before calling this function. _interface_info: Fills in missing parts of the #GInterfaceInfo for the interface. The structs is initialized with `memset(s, 0, sizeof (s))` before calling this function.
*/
opaque type GTypePluginClass = CStruct5[GTypeInterface, GTypePluginUse, GTypePluginUnuse, GTypePluginCompleteTypeInfo, GTypePluginCompleteInterfaceInfo]
object GTypePluginClass:
  given _tag: Tag[GTypePluginClass] = Tag.materializeCStruct5Tag[GTypeInterface, GTypePluginUse, GTypePluginUnuse, GTypePluginCompleteTypeInfo, GTypePluginCompleteInterfaceInfo]
  def apply()(using Zone): Ptr[GTypePluginClass] = scala.scalanative.unsafe.alloc[GTypePluginClass](1)
  def apply(base_iface : GTypeInterface, use_plugin : GTypePluginUse, unuse_plugin : GTypePluginUnuse, complete_type_info : GTypePluginCompleteTypeInfo, complete_interface_info : GTypePluginCompleteInterfaceInfo)(using Zone): Ptr[GTypePluginClass] = 
    val ____ptr = apply()
    (!____ptr).base_iface = base_iface
    (!____ptr).use_plugin = use_plugin
    (!____ptr).unuse_plugin = unuse_plugin
    (!____ptr).complete_type_info = complete_type_info
    (!____ptr).complete_interface_info = complete_interface_info
    ____ptr
  extension (struct: GTypePluginClass)
    def base_iface : GTypeInterface = struct._1
    def base_iface_=(value: GTypeInterface): Unit = !struct.at1 = value
    def use_plugin : GTypePluginUse = struct._2
    def use_plugin_=(value: GTypePluginUse): Unit = !struct.at2 = value
    def unuse_plugin : GTypePluginUnuse = struct._3
    def unuse_plugin_=(value: GTypePluginUnuse): Unit = !struct.at3 = value
    def complete_type_info : GTypePluginCompleteTypeInfo = struct._4
    def complete_type_info_=(value: GTypePluginCompleteTypeInfo): Unit = !struct.at4 = value
    def complete_interface_info : GTypePluginCompleteInterfaceInfo = struct._5
    def complete_interface_info_=(value: GTypePluginCompleteInterfaceInfo): Unit = !struct.at5 = value

/**
 * GTypeQuery: : the #GType value of the type _name: the name of the type _size: the size of the instance structure
*/
opaque type GTypeQuery = CStruct4[GType, Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
object GTypeQuery:
  given _tag: Tag[GTypeQuery] = Tag.materializeCStruct4Tag[GType, Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
  def apply()(using Zone): Ptr[GTypeQuery] = scala.scalanative.unsafe.alloc[GTypeQuery](1)
  def apply(`type` : GType, type_name : Ptr[_root_.sn.gnome.glib.internal.gchar], class_size : _root_.sn.gnome.glib.internal.guint, instance_size : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[GTypeQuery] = 
    val ____ptr = apply()
    (!____ptr).`type` = `type`
    (!____ptr).type_name = type_name
    (!____ptr).class_size = class_size
    (!____ptr).instance_size = instance_size
    ____ptr
  extension (struct: GTypeQuery)
    def `type` : GType = struct._1
    def type_=(value: GType): Unit = !struct.at1 = value
    def type_name : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
    def type_name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at2 = value
    def class_size : _root_.sn.gnome.glib.internal.guint = struct._3
    def class_size_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at3 = value
    def instance_size : _root_.sn.gnome.glib.internal.guint = struct._4
    def instance_size_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at4 = value

/**
 * GTypeValueTable: _init: Function to initialize a GValue _free: Function to free a GValue _copy: Function to copy a GValue _peek_pointer: Function to peek the contents of a GValue if they fit into a pointer _format: A string format describing how to collect the contents of this value bit-by-bit. Each character in the format represents an argument to be collected, and the characters themselves indicate the type of the argument. Currently supported arguments are: - `'i'`: Integers, passed as `collect_values[].v_int` - `'l'`: Longs, passed as `collect_values[].v_long` - `'d'`: Doubles, passed as `collect_values[].v_double` - `'p'`: Pointers, passed as `collect_values[].v_pointer` It should be noted that for variable argument list construction, ANSI C promotes every type smaller than an integer to an int, and floats to doubles. So for collection of short int or char, `'i'` needs to be used, and for collection of floats `'d'`. _value: Function to initialize a GValue from the values collected from variadic arguments _format: Format description of the arguments to collect for _value, analogous to _format. Usually, _format string consists only of `'p'`s to provide lcopy_value() with pointers to storage locations. _value: Function to store the contents of a value into the locations collected from variadic arguments
*/
opaque type GTypeValueTable = CStruct8[GTypeValueInitFunc, GTypeValueFreeFunc, GTypeValueCopyFunc, GTypeValuePeekPointerFunc, Ptr[_root_.sn.gnome.glib.internal.gchar], GTypeValueCollectFunc, Ptr[_root_.sn.gnome.glib.internal.gchar], GTypeValueLCopyFunc]
object GTypeValueTable:
  given _tag: Tag[GTypeValueTable] = Tag.materializeCStruct8Tag[GTypeValueInitFunc, GTypeValueFreeFunc, GTypeValueCopyFunc, GTypeValuePeekPointerFunc, Ptr[_root_.sn.gnome.glib.internal.gchar], GTypeValueCollectFunc, Ptr[_root_.sn.gnome.glib.internal.gchar], GTypeValueLCopyFunc]
  def apply()(using Zone): Ptr[GTypeValueTable] = scala.scalanative.unsafe.alloc[GTypeValueTable](1)
  def apply(value_init : GTypeValueInitFunc, value_free : GTypeValueFreeFunc, value_copy : GTypeValueCopyFunc, value_peek_pointer : GTypeValuePeekPointerFunc, collect_format : Ptr[_root_.sn.gnome.glib.internal.gchar], collect_value : GTypeValueCollectFunc, lcopy_format : Ptr[_root_.sn.gnome.glib.internal.gchar], lcopy_value : GTypeValueLCopyFunc)(using Zone): Ptr[GTypeValueTable] = 
    val ____ptr = apply()
    (!____ptr).value_init = value_init
    (!____ptr).value_free = value_free
    (!____ptr).value_copy = value_copy
    (!____ptr).value_peek_pointer = value_peek_pointer
    (!____ptr).collect_format = collect_format
    (!____ptr).collect_value = collect_value
    (!____ptr).lcopy_format = lcopy_format
    (!____ptr).lcopy_value = lcopy_value
    ____ptr
  extension (struct: GTypeValueTable)
    def value_init : GTypeValueInitFunc = struct._1
    def value_init_=(value: GTypeValueInitFunc): Unit = !struct.at1 = value
    def value_free : GTypeValueFreeFunc = struct._2
    def value_free_=(value: GTypeValueFreeFunc): Unit = !struct.at2 = value
    def value_copy : GTypeValueCopyFunc = struct._3
    def value_copy_=(value: GTypeValueCopyFunc): Unit = !struct.at3 = value
    def value_peek_pointer : GTypeValuePeekPointerFunc = struct._4
    def value_peek_pointer_=(value: GTypeValuePeekPointerFunc): Unit = !struct.at4 = value
    def collect_format : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._5
    def collect_format_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at5 = value
    def collect_value : GTypeValueCollectFunc = struct._6
    def collect_value_=(value: GTypeValueCollectFunc): Unit = !struct.at6 = value
    def lcopy_format : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._7
    def lcopy_format_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at7 = value
    def lcopy_value : GTypeValueLCopyFunc = struct._8
    def lcopy_value_=(value: GTypeValueLCopyFunc): Unit = !struct.at8 = value

/**
 * GValue:
*/
opaque type GValue = CStruct2[GType, CArray[GValue.Union0, Nat._2]]
object GValue:
  opaque type Union0 = CArray[Byte, Nat._8]
  object Union0:
    given _tag: Tag[Union0] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
    def apply()(using Zone): Ptr[Union0] = 
      val ___ptr = alloc[Union0](1)
      ___ptr
    @scala.annotation.targetName("apply_v_int")
    def apply(v_int: _root_.sn.gnome.glib.internal.gint)(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint]].update(0, v_int)
      ___ptr
    @scala.annotation.targetName("apply_v_uint")
    def apply(v_uint: _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint]].update(0, v_uint)
      ___ptr
    @scala.annotation.targetName("apply_v_long")
    def apply(v_long: _root_.sn.gnome.glib.internal.glong)(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.glong]].update(0, v_long)
      ___ptr
    @scala.annotation.targetName("apply_v_ulong")
    def apply(v_ulong: _root_.sn.gnome.glib.internal.gulong)(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gulong]].update(0, v_ulong)
      ___ptr
    @scala.annotation.targetName("apply_v_int64")
    def apply(v_int64: _root_.sn.gnome.glib.internal.gint64)(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint64]].update(0, v_int64)
      ___ptr
    @scala.annotation.targetName("apply_v_uint64")
    def apply(v_uint64: _root_.sn.gnome.glib.internal.guint64)(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint64]].update(0, v_uint64)
      ___ptr
    @scala.annotation.targetName("apply_v_float")
    def apply(v_float: _root_.sn.gnome.glib.internal.gfloat)(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gfloat]].update(0, v_float)
      ___ptr
    @scala.annotation.targetName("apply_v_double")
    def apply(v_double: _root_.sn.gnome.glib.internal.gdouble)(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gdouble]].update(0, v_double)
      ___ptr
    @scala.annotation.targetName("apply_v_pointer")
    def apply(v_pointer: _root_.sn.gnome.glib.internal.gpointer)(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]].update(0, v_pointer)
      ___ptr
    extension (struct: Union0)
      def v_int : _root_.sn.gnome.glib.internal.gint = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint]]
      def v_int_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint]] = value
      def v_uint : _root_.sn.gnome.glib.internal.guint = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint]]
      def v_uint_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint]] = value
      def v_long : _root_.sn.gnome.glib.internal.glong = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.glong]]
      def v_long_=(value: _root_.sn.gnome.glib.internal.glong): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.glong]] = value
      def v_ulong : _root_.sn.gnome.glib.internal.gulong = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gulong]]
      def v_ulong_=(value: _root_.sn.gnome.glib.internal.gulong): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gulong]] = value
      def v_int64 : _root_.sn.gnome.glib.internal.gint64 = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint64]]
      def v_int64_=(value: _root_.sn.gnome.glib.internal.gint64): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint64]] = value
      def v_uint64 : _root_.sn.gnome.glib.internal.guint64 = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint64]]
      def v_uint64_=(value: _root_.sn.gnome.glib.internal.guint64): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint64]] = value
      def v_float : _root_.sn.gnome.glib.internal.gfloat = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gfloat]]
      def v_float_=(value: _root_.sn.gnome.glib.internal.gfloat): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gfloat]] = value
      def v_double : _root_.sn.gnome.glib.internal.gdouble = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gdouble]]
      def v_double_=(value: _root_.sn.gnome.glib.internal.gdouble): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gdouble]] = value
      def v_pointer : _root_.sn.gnome.glib.internal.gpointer = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]]
      def v_pointer_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]] = value
  given _tag: Tag[GValue] = Tag.materializeCStruct2Tag[GType, CArray[GValue.Union0, Nat._2]]
  def apply()(using Zone): Ptr[GValue] = scala.scalanative.unsafe.alloc[GValue](1)
  def apply(g_type : GType, data : CArray[GValue.Union0, Nat._2])(using Zone): Ptr[GValue] = 
    val ____ptr = apply()
    (!____ptr).g_type = g_type
    (!____ptr).data = data
    ____ptr
  extension (struct: GValue)
    def g_type : GType = struct._1
    def g_type_=(value: GType): Unit = !struct.at1 = value
    def data : CArray[GValue.Union0, Nat._2] = struct._2
    def data_=(value: CArray[GValue.Union0, Nat._2]): Unit = !struct.at2 = value

opaque type GValueArray = CStruct3[_root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.guint]
object GValueArray:
  given _tag: Tag[GValueArray] = Tag.materializeCStruct3Tag[_root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.guint]
  def apply()(using Zone): Ptr[GValueArray] = scala.scalanative.unsafe.alloc[GValueArray](1)
  def apply(n_values : _root_.sn.gnome.glib.internal.guint, values : Ptr[GValue], n_prealloced : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[GValueArray] = 
    val ____ptr = apply()
    (!____ptr).n_values = n_values
    (!____ptr).values = values
    (!____ptr).n_prealloced = n_prealloced
    ____ptr
  extension (struct: GValueArray)
    def n_values : _root_.sn.gnome.glib.internal.guint = struct._1
    def n_values_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at1 = value
    def values : Ptr[GValue] = struct._2
    def values_=(value: Ptr[GValue]): Unit = !struct.at2 = value
    def n_prealloced : _root_.sn.gnome.glib.internal.guint = struct._3
    def n_prealloced_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at3 = value

opaque type GWeakRef = CStruct1[GWeakRef.Union0]
object GWeakRef:
  opaque type Union0 = CArray[Byte, Nat._8]
  object Union0:
    given _tag: Tag[Union0] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
    def apply()(using Zone): Ptr[Union0] = 
      val ___ptr = alloc[Union0](1)
      ___ptr
    @scala.annotation.targetName("apply_p")
    def apply(p: _root_.sn.gnome.glib.internal.gpointer)(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]].update(0, p)
      ___ptr
    extension (struct: Union0)
      def p : _root_.sn.gnome.glib.internal.gpointer = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]]
      def p_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]] = value
  given _tag: Tag[GWeakRef] = Tag.materializeCStruct1Tag[GWeakRef.Union0]
  def apply()(using Zone): Ptr[GWeakRef] = scala.scalanative.unsafe.alloc[GWeakRef](1)
  def apply(priv : GWeakRef.Union0)(using Zone): Ptr[GWeakRef] = 
    val ____ptr = apply()
    (!____ptr).priv = priv
    ____ptr
  extension (struct: GWeakRef)
    def priv : GWeakRef.Union0 = struct._1
    def priv_=(value: GWeakRef.Union0): Unit = !struct.at1 = value

opaque type _GBinding = CStruct0
object _GBinding:
  given _tag: Tag[_GBinding] = Tag.materializeCStruct0Tag

opaque type _GBindingGroup = CStruct0
object _GBindingGroup:
  given _tag: Tag[_GBindingGroup] = Tag.materializeCStruct0Tag

opaque type _GCClosure = CStruct2[GClosure, _root_.sn.gnome.glib.internal.gpointer]
object _GCClosure:
  given _tag: Tag[_GCClosure] = Tag.materializeCStruct2Tag[GClosure, _root_.sn.gnome.glib.internal.gpointer]
  def apply()(using Zone): Ptr[_GCClosure] = scala.scalanative.unsafe.alloc[_GCClosure](1)
  def apply(closure : GClosure, callback : _root_.sn.gnome.glib.internal.gpointer)(using Zone): Ptr[_GCClosure] = 
    val ____ptr = apply()
    (!____ptr).closure = closure
    (!____ptr).callback = callback
    ____ptr
  extension (struct: _GCClosure)
    def closure : GClosure = struct._1
    def closure_=(value: GClosure): Unit = !struct.at1 = value
    def callback : _root_.sn.gnome.glib.internal.gpointer = struct._2
    def callback_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at2 = value

opaque type _GClosure = CStruct13[_root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, CFuncPtr6[Ptr[Byte], Ptr[GValue], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit], _root_.sn.gnome.glib.internal.gpointer, Ptr[Byte]]
object _GClosure:
  given _tag: Tag[_GClosure] = Tag.materializeCStruct13Tag[_root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, CFuncPtr6[Ptr[Byte], Ptr[GValue], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit], _root_.sn.gnome.glib.internal.gpointer, Ptr[Byte]]
  def apply()(using Zone): Ptr[_GClosure] = scala.scalanative.unsafe.alloc[_GClosure](1)
  def apply(ref_count : _root_.sn.gnome.glib.internal.guint, meta_marshal_nouse : _root_.sn.gnome.glib.internal.guint, n_guards : _root_.sn.gnome.glib.internal.guint, n_fnotifiers : _root_.sn.gnome.glib.internal.guint, n_inotifiers : _root_.sn.gnome.glib.internal.guint, in_inotify : _root_.sn.gnome.glib.internal.guint, floating : _root_.sn.gnome.glib.internal.guint, derivative_flag : _root_.sn.gnome.glib.internal.guint, in_marshal : _root_.sn.gnome.glib.internal.guint, is_invalid : _root_.sn.gnome.glib.internal.guint, marshal : CFuncPtr6[Ptr[GClosure], Ptr[GValue], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit], data : _root_.sn.gnome.glib.internal.gpointer, notifiers : Ptr[GClosureNotifyData])(using Zone): Ptr[_GClosure] = 
    val ____ptr = apply()
    (!____ptr).ref_count = ref_count
    (!____ptr).meta_marshal_nouse = meta_marshal_nouse
    (!____ptr).n_guards = n_guards
    (!____ptr).n_fnotifiers = n_fnotifiers
    (!____ptr).n_inotifiers = n_inotifiers
    (!____ptr).in_inotify = in_inotify
    (!____ptr).floating = floating
    (!____ptr).derivative_flag = derivative_flag
    (!____ptr).in_marshal = in_marshal
    (!____ptr).is_invalid = is_invalid
    (!____ptr).marshal = marshal
    (!____ptr).data = data
    (!____ptr).notifiers = notifiers
    ____ptr
  extension (struct: _GClosure)
    def ref_count : _root_.sn.gnome.glib.internal.guint = struct._1
    def ref_count_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at1 = value
    def meta_marshal_nouse : _root_.sn.gnome.glib.internal.guint = struct._2
    def meta_marshal_nouse_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at2 = value
    def n_guards : _root_.sn.gnome.glib.internal.guint = struct._3
    def n_guards_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at3 = value
    def n_fnotifiers : _root_.sn.gnome.glib.internal.guint = struct._4
    def n_fnotifiers_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at4 = value
    def n_inotifiers : _root_.sn.gnome.glib.internal.guint = struct._5
    def n_inotifiers_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at5 = value
    def in_inotify : _root_.sn.gnome.glib.internal.guint = struct._6
    def in_inotify_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at6 = value
    def floating : _root_.sn.gnome.glib.internal.guint = struct._7
    def floating_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at7 = value
    def derivative_flag : _root_.sn.gnome.glib.internal.guint = struct._8
    def derivative_flag_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at8 = value
    def in_marshal : _root_.sn.gnome.glib.internal.guint = struct._9
    def in_marshal_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at9 = value
    def is_invalid : _root_.sn.gnome.glib.internal.guint = struct._10
    def is_invalid_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at10 = value
    def marshal : CFuncPtr6[Ptr[GClosure], Ptr[GValue], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._11.asInstanceOf[CFuncPtr6[Ptr[GClosure], Ptr[GValue], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit]]
    def marshal_=(value: CFuncPtr6[Ptr[GClosure], Ptr[GValue], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at11 = value.asInstanceOf[CFuncPtr6[Ptr[Byte], Ptr[GValue], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit]]
    def data : _root_.sn.gnome.glib.internal.gpointer = struct._12
    def data_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at12 = value
    def notifiers : Ptr[GClosureNotifyData] = struct._13.asInstanceOf[Ptr[GClosureNotifyData]]
    def notifiers_=(value: Ptr[GClosureNotifyData]): Unit = !struct.at13 = value.asInstanceOf[Ptr[Byte]]

opaque type _GClosureNotifyData = CStruct2[_root_.sn.gnome.glib.internal.gpointer, Ptr[Byte]]
object _GClosureNotifyData:
  given _tag: Tag[_GClosureNotifyData] = Tag.materializeCStruct2Tag[_root_.sn.gnome.glib.internal.gpointer, Ptr[Byte]]
  def apply()(using Zone): Ptr[_GClosureNotifyData] = scala.scalanative.unsafe.alloc[_GClosureNotifyData](1)
  def apply(data : _root_.sn.gnome.glib.internal.gpointer, _notify : GClosureNotify)(using Zone): Ptr[_GClosureNotifyData] = 
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr)._notify = _notify
    ____ptr
  extension (struct: _GClosureNotifyData)
    def data : _root_.sn.gnome.glib.internal.gpointer = struct._1
    def data_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at1 = value
    def _notify : GClosureNotify = struct._2.asInstanceOf[GClosureNotify]
    def _notify_=(value: GClosureNotify): Unit = !struct.at2 = value.asInstanceOf[Ptr[Byte]]

/**
 * GEnumClass: _type_class: the parent class : the smallest possible value. : the largest possible value. _values: the number of possible values. : an array of #GEnumValue structs describing the individual values.
*/
opaque type _GEnumClass = CStruct5[GTypeClass, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.guint, Ptr[GEnumValue]]
object _GEnumClass:
  given _tag: Tag[_GEnumClass] = Tag.materializeCStruct5Tag[GTypeClass, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.guint, Ptr[GEnumValue]]
  def apply()(using Zone): Ptr[_GEnumClass] = scala.scalanative.unsafe.alloc[_GEnumClass](1)
  def apply(g_type_class : GTypeClass, minimum : _root_.sn.gnome.glib.internal.gint, maximum : _root_.sn.gnome.glib.internal.gint, n_values : _root_.sn.gnome.glib.internal.guint, values : Ptr[GEnumValue])(using Zone): Ptr[_GEnumClass] = 
    val ____ptr = apply()
    (!____ptr).g_type_class = g_type_class
    (!____ptr).minimum = minimum
    (!____ptr).maximum = maximum
    (!____ptr).n_values = n_values
    (!____ptr).values = values
    ____ptr
  extension (struct: _GEnumClass)
    def g_type_class : GTypeClass = struct._1
    def g_type_class_=(value: GTypeClass): Unit = !struct.at1 = value
    def minimum : _root_.sn.gnome.glib.internal.gint = struct._2
    def minimum_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at2 = value
    def maximum : _root_.sn.gnome.glib.internal.gint = struct._3
    def maximum_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at3 = value
    def n_values : _root_.sn.gnome.glib.internal.guint = struct._4
    def n_values_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at4 = value
    def values : Ptr[GEnumValue] = struct._5
    def values_=(value: Ptr[GEnumValue]): Unit = !struct.at5 = value

/**
 * GEnumValue: : the enum value _name: the name of the value _nick: the nickname of the value
*/
opaque type _GEnumValue = CStruct3[_root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar]]
object _GEnumValue:
  given _tag: Tag[_GEnumValue] = Tag.materializeCStruct3Tag[_root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar]]
  def apply()(using Zone): Ptr[_GEnumValue] = scala.scalanative.unsafe.alloc[_GEnumValue](1)
  def apply(value : _root_.sn.gnome.glib.internal.gint, value_name : Ptr[_root_.sn.gnome.glib.internal.gchar], value_nick : Ptr[_root_.sn.gnome.glib.internal.gchar])(using Zone): Ptr[_GEnumValue] = 
    val ____ptr = apply()
    (!____ptr).value = value
    (!____ptr).value_name = value_name
    (!____ptr).value_nick = value_nick
    ____ptr
  extension (struct: _GEnumValue)
    def value : _root_.sn.gnome.glib.internal.gint = struct._1
    def value_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at1 = value
    def value_name : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
    def value_name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at2 = value
    def value_nick : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._3
    def value_nick_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at3 = value

/**
 * GFlagsClass: _type_class: the parent class : a mask covering all possible values. _values: the number of possible values. : an array of #GFlagsValue structs describing the individual values.
*/
opaque type _GFlagsClass = CStruct4[GTypeClass, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, Ptr[GFlagsValue]]
object _GFlagsClass:
  given _tag: Tag[_GFlagsClass] = Tag.materializeCStruct4Tag[GTypeClass, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, Ptr[GFlagsValue]]
  def apply()(using Zone): Ptr[_GFlagsClass] = scala.scalanative.unsafe.alloc[_GFlagsClass](1)
  def apply(g_type_class : GTypeClass, mask : _root_.sn.gnome.glib.internal.guint, n_values : _root_.sn.gnome.glib.internal.guint, values : Ptr[GFlagsValue])(using Zone): Ptr[_GFlagsClass] = 
    val ____ptr = apply()
    (!____ptr).g_type_class = g_type_class
    (!____ptr).mask = mask
    (!____ptr).n_values = n_values
    (!____ptr).values = values
    ____ptr
  extension (struct: _GFlagsClass)
    def g_type_class : GTypeClass = struct._1
    def g_type_class_=(value: GTypeClass): Unit = !struct.at1 = value
    def mask : _root_.sn.gnome.glib.internal.guint = struct._2
    def mask_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at2 = value
    def n_values : _root_.sn.gnome.glib.internal.guint = struct._3
    def n_values_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at3 = value
    def values : Ptr[GFlagsValue] = struct._4
    def values_=(value: Ptr[GFlagsValue]): Unit = !struct.at4 = value

/**
 * GFlagsValue: : the flags value _name: the name of the value _nick: the nickname of the value
*/
opaque type _GFlagsValue = CStruct3[_root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar]]
object _GFlagsValue:
  given _tag: Tag[_GFlagsValue] = Tag.materializeCStruct3Tag[_root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar]]
  def apply()(using Zone): Ptr[_GFlagsValue] = scala.scalanative.unsafe.alloc[_GFlagsValue](1)
  def apply(value : _root_.sn.gnome.glib.internal.guint, value_name : Ptr[_root_.sn.gnome.glib.internal.gchar], value_nick : Ptr[_root_.sn.gnome.glib.internal.gchar])(using Zone): Ptr[_GFlagsValue] = 
    val ____ptr = apply()
    (!____ptr).value = value
    (!____ptr).value_name = value_name
    (!____ptr).value_nick = value_nick
    ____ptr
  extension (struct: _GFlagsValue)
    def value : _root_.sn.gnome.glib.internal.guint = struct._1
    def value_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at1 = value
    def value_name : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
    def value_name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at2 = value
    def value_nick : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._3
    def value_nick_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at3 = value

/**
 * GInterfaceInfo:
*/
opaque type _GInterfaceInfo = CStruct3[GInterfaceInitFunc, GInterfaceFinalizeFunc, _root_.sn.gnome.glib.internal.gpointer]
object _GInterfaceInfo:
  given _tag: Tag[_GInterfaceInfo] = Tag.materializeCStruct3Tag[GInterfaceInitFunc, GInterfaceFinalizeFunc, _root_.sn.gnome.glib.internal.gpointer]
  def apply()(using Zone): Ptr[_GInterfaceInfo] = scala.scalanative.unsafe.alloc[_GInterfaceInfo](1)
  def apply(interface_init : GInterfaceInitFunc, interface_finalize : GInterfaceFinalizeFunc, interface_data : _root_.sn.gnome.glib.internal.gpointer)(using Zone): Ptr[_GInterfaceInfo] = 
    val ____ptr = apply()
    (!____ptr).interface_init = interface_init
    (!____ptr).interface_finalize = interface_finalize
    (!____ptr).interface_data = interface_data
    ____ptr
  extension (struct: _GInterfaceInfo)
    def interface_init : GInterfaceInitFunc = struct._1
    def interface_init_=(value: GInterfaceInitFunc): Unit = !struct.at1 = value
    def interface_finalize : GInterfaceFinalizeFunc = struct._2
    def interface_finalize_=(value: GInterfaceFinalizeFunc): Unit = !struct.at2 = value
    def interface_data : _root_.sn.gnome.glib.internal.gpointer = struct._3
    def interface_data_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at3 = value

opaque type _GObject = CStruct3[GTypeInstance, _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.GData]]
object _GObject:
  given _tag: Tag[_GObject] = Tag.materializeCStruct3Tag[GTypeInstance, _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.GData]]
  def apply()(using Zone): Ptr[_GObject] = scala.scalanative.unsafe.alloc[_GObject](1)
  def apply(g_type_instance : GTypeInstance, ref_count : _root_.sn.gnome.glib.internal.guint, qdata : Ptr[_root_.sn.gnome.glib.internal.GData])(using Zone): Ptr[_GObject] = 
    val ____ptr = apply()
    (!____ptr).g_type_instance = g_type_instance
    (!____ptr).ref_count = ref_count
    (!____ptr).qdata = qdata
    ____ptr
  extension (struct: _GObject)
    def g_type_instance : GTypeInstance = struct._1
    def g_type_instance_=(value: GTypeInstance): Unit = !struct.at1 = value
    def ref_count : _root_.sn.gnome.glib.internal.guint = struct._2
    def ref_count_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at2 = value
    def qdata : Ptr[_root_.sn.gnome.glib.internal.GData] = struct._3
    def qdata_=(value: Ptr[_root_.sn.gnome.glib.internal.GData]): Unit = !struct.at3 = value

/**
 * GObjectClass: _type_class: the parent class : the function is called by g_object_new () to complete the object initialization after all the construction properties are set. The first thing a implementation must do is chain up to the of the parent class. Overriding should be rarely needed, e.g. to handle construct properties, or to implement singletons.
*/
opaque type _GObjectClass = CStruct15[GTypeClass, Ptr[Byte], CFuncPtr3[GType, _root_.sn.gnome.glib.internal.guint, Ptr[GObjectConstructParam], Ptr[GObject]], CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit], CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit], CFuncPtr1[Ptr[GObject], Unit], CFuncPtr1[Ptr[GObject], Unit], CFuncPtr3[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[Ptr[GParamSpec]], Unit], CFuncPtr2[Ptr[GObject], Ptr[GParamSpec], Unit], CFuncPtr1[Ptr[GObject], Unit], _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gsize, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3]]
object _GObjectClass:
  given _tag: Tag[_GObjectClass] = Tag.materializeCStruct15Tag[GTypeClass, Ptr[Byte], CFuncPtr3[GType, _root_.sn.gnome.glib.internal.guint, Ptr[GObjectConstructParam], Ptr[GObject]], CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit], CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit], CFuncPtr1[Ptr[GObject], Unit], CFuncPtr1[Ptr[GObject], Unit], CFuncPtr3[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[Ptr[GParamSpec]], Unit], CFuncPtr2[Ptr[GObject], Ptr[GParamSpec], Unit], CFuncPtr1[Ptr[GObject], Unit], _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gsize, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3]]
  def apply()(using Zone): Ptr[_GObjectClass] = scala.scalanative.unsafe.alloc[_GObjectClass](1)
  def apply(g_type_class : GTypeClass, construct_properties : Ptr[_root_.sn.gnome.glib.internal.GSList], constructor : CFuncPtr3[GType, _root_.sn.gnome.glib.internal.guint, Ptr[GObjectConstructParam], Ptr[GObject]], set_property : CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit], get_property : CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit], dispose : CFuncPtr1[Ptr[GObject], Unit], finalize : CFuncPtr1[Ptr[GObject], Unit], dispatch_properties_changed : CFuncPtr3[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[Ptr[GParamSpec]], Unit], _notify : CFuncPtr2[Ptr[GObject], Ptr[GParamSpec], Unit], constructed : CFuncPtr1[Ptr[GObject], Unit], flags : _root_.sn.gnome.glib.internal.gsize, n_construct_properties : _root_.sn.gnome.glib.internal.gsize, pspecs : _root_.sn.gnome.glib.internal.gpointer, n_pspecs : _root_.sn.gnome.glib.internal.gsize, pdummy : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3])(using Zone): Ptr[_GObjectClass] = 
    val ____ptr = apply()
    (!____ptr).g_type_class = g_type_class
    (!____ptr).construct_properties = construct_properties
    (!____ptr).constructor = constructor
    (!____ptr).set_property = set_property
    (!____ptr).get_property = get_property
    (!____ptr).dispose = dispose
    (!____ptr).finalize = finalize
    (!____ptr).dispatch_properties_changed = dispatch_properties_changed
    (!____ptr)._notify = _notify
    (!____ptr).constructed = constructed
    (!____ptr).flags = flags
    (!____ptr).n_construct_properties = n_construct_properties
    (!____ptr).pspecs = pspecs
    (!____ptr).n_pspecs = n_pspecs
    (!____ptr).pdummy = pdummy
    ____ptr
  extension (struct: _GObjectClass)
    def g_type_class : GTypeClass = struct._1
    def g_type_class_=(value: GTypeClass): Unit = !struct.at1 = value
    def construct_properties : Ptr[_root_.sn.gnome.glib.internal.GSList] = struct._2.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GSList]]
    def construct_properties_=(value: Ptr[_root_.sn.gnome.glib.internal.GSList]): Unit = !struct.at2 = value.asInstanceOf[Ptr[Byte]]
    def constructor : CFuncPtr3[GType, _root_.sn.gnome.glib.internal.guint, Ptr[GObjectConstructParam], Ptr[GObject]] = struct._3
    def constructor_=(value: CFuncPtr3[GType, _root_.sn.gnome.glib.internal.guint, Ptr[GObjectConstructParam], Ptr[GObject]]): Unit = !struct.at3 = value
    def set_property : CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit] = struct._4
    def set_property_=(value: CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit]): Unit = !struct.at4 = value
    def get_property : CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit] = struct._5
    def get_property_=(value: CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit]): Unit = !struct.at5 = value
    def dispose : CFuncPtr1[Ptr[GObject], Unit] = struct._6
    def dispose_=(value: CFuncPtr1[Ptr[GObject], Unit]): Unit = !struct.at6 = value
    def finalize : CFuncPtr1[Ptr[GObject], Unit] = struct._7
    def finalize_=(value: CFuncPtr1[Ptr[GObject], Unit]): Unit = !struct.at7 = value
    def dispatch_properties_changed : CFuncPtr3[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[Ptr[GParamSpec]], Unit] = struct._8
    def dispatch_properties_changed_=(value: CFuncPtr3[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[Ptr[GParamSpec]], Unit]): Unit = !struct.at8 = value
    def _notify : CFuncPtr2[Ptr[GObject], Ptr[GParamSpec], Unit] = struct._9
    def _notify_=(value: CFuncPtr2[Ptr[GObject], Ptr[GParamSpec], Unit]): Unit = !struct.at9 = value
    def constructed : CFuncPtr1[Ptr[GObject], Unit] = struct._10
    def constructed_=(value: CFuncPtr1[Ptr[GObject], Unit]): Unit = !struct.at10 = value
    def flags : _root_.sn.gnome.glib.internal.gsize = struct._11
    def flags_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = !struct.at11 = value
    def n_construct_properties : _root_.sn.gnome.glib.internal.gsize = struct._12
    def n_construct_properties_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = !struct.at12 = value
    def pspecs : _root_.sn.gnome.glib.internal.gpointer = struct._13
    def pspecs_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at13 = value
    def n_pspecs : _root_.sn.gnome.glib.internal.gsize = struct._14
    def n_pspecs_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = !struct.at14 = value
    def pdummy : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3] = struct._15
    def pdummy_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3]): Unit = !struct.at15 = value

/**
 * GObjectConstructParam: : the #GParamSpec of the construct parameter : the value to set the parameter to
*/
opaque type _GObjectConstructParam = CStruct2[Ptr[GParamSpec], Ptr[GValue]]
object _GObjectConstructParam:
  given _tag: Tag[_GObjectConstructParam] = Tag.materializeCStruct2Tag[Ptr[GParamSpec], Ptr[GValue]]
  def apply()(using Zone): Ptr[_GObjectConstructParam] = scala.scalanative.unsafe.alloc[_GObjectConstructParam](1)
  def apply(pspec : Ptr[GParamSpec], value : Ptr[GValue])(using Zone): Ptr[_GObjectConstructParam] = 
    val ____ptr = apply()
    (!____ptr).pspec = pspec
    (!____ptr).value = value
    ____ptr
  extension (struct: _GObjectConstructParam)
    def pspec : Ptr[GParamSpec] = struct._1
    def pspec_=(value: Ptr[GParamSpec]): Unit = !struct.at1 = value
    def value : Ptr[GValue] = struct._2
    def value_=(value: Ptr[GValue]): Unit = !struct.at2 = value

opaque type _GParamSpec = CStruct10[GTypeInstance, Ptr[_root_.sn.gnome.glib.internal.gchar], GParamFlags, GType, GType, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GData], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
object _GParamSpec:
  given _tag: Tag[_GParamSpec] = Tag.materializeCStruct10Tag[GTypeInstance, Ptr[_root_.sn.gnome.glib.internal.gchar], GParamFlags, GType, GType, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GData], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
  def apply()(using Zone): Ptr[_GParamSpec] = scala.scalanative.unsafe.alloc[_GParamSpec](1)
  def apply(g_type_instance : GTypeInstance, name : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GParamFlags, value_type : GType, owner_type : GType, _nick : Ptr[_root_.sn.gnome.glib.internal.gchar], _blurb : Ptr[_root_.sn.gnome.glib.internal.gchar], qdata : Ptr[_root_.sn.gnome.glib.internal.GData], ref_count : _root_.sn.gnome.glib.internal.guint, param_id : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[_GParamSpec] = 
    val ____ptr = apply()
    (!____ptr).g_type_instance = g_type_instance
    (!____ptr).name = name
    (!____ptr).flags = flags
    (!____ptr).value_type = value_type
    (!____ptr).owner_type = owner_type
    (!____ptr)._nick = _nick
    (!____ptr)._blurb = _blurb
    (!____ptr).qdata = qdata
    (!____ptr).ref_count = ref_count
    (!____ptr).param_id = param_id
    ____ptr
  extension (struct: _GParamSpec)
    def g_type_instance : GTypeInstance = struct._1
    def g_type_instance_=(value: GTypeInstance): Unit = !struct.at1 = value
    def name : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
    def name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at2 = value
    def flags : GParamFlags = struct._3
    def flags_=(value: GParamFlags): Unit = !struct.at3 = value
    def value_type : GType = struct._4
    def value_type_=(value: GType): Unit = !struct.at4 = value
    def owner_type : GType = struct._5
    def owner_type_=(value: GType): Unit = !struct.at5 = value
    def _nick : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._6
    def _nick_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at6 = value
    def _blurb : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._7
    def _blurb_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at7 = value
    def qdata : Ptr[_root_.sn.gnome.glib.internal.GData] = struct._8
    def qdata_=(value: Ptr[_root_.sn.gnome.glib.internal.GData]): Unit = !struct.at8 = value
    def ref_count : _root_.sn.gnome.glib.internal.guint = struct._9
    def ref_count_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at9 = value
    def param_id : _root_.sn.gnome.glib.internal.guint = struct._10
    def param_id_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at10 = value

/**
 * GParamSpecBoolean: _instance: private #GParamSpec portion _value: default value for the property specified
*/
opaque type _GParamSpecBoolean = CStruct2[GParamSpec, _root_.sn.gnome.glib.internal.gboolean]
object _GParamSpecBoolean:
  given _tag: Tag[_GParamSpecBoolean] = Tag.materializeCStruct2Tag[GParamSpec, _root_.sn.gnome.glib.internal.gboolean]
  def apply()(using Zone): Ptr[_GParamSpecBoolean] = scala.scalanative.unsafe.alloc[_GParamSpecBoolean](1)
  def apply(parent_instance : GParamSpec, default_value : _root_.sn.gnome.glib.internal.gboolean)(using Zone): Ptr[_GParamSpecBoolean] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).default_value = default_value
    ____ptr
  extension (struct: _GParamSpecBoolean)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def default_value : _root_.sn.gnome.glib.internal.gboolean = struct._2
    def default_value_=(value: _root_.sn.gnome.glib.internal.gboolean): Unit = !struct.at2 = value

/**
 * GParamSpecBoxed: _instance: private #GParamSpec portion
*/
opaque type _GParamSpecBoxed = CStruct1[GParamSpec]
object _GParamSpecBoxed:
  given _tag: Tag[_GParamSpecBoxed] = Tag.materializeCStruct1Tag[GParamSpec]
  def apply()(using Zone): Ptr[_GParamSpecBoxed] = scala.scalanative.unsafe.alloc[_GParamSpecBoxed](1)
  def apply(parent_instance : GParamSpec)(using Zone): Ptr[_GParamSpecBoxed] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GParamSpecBoxed)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value

/**
 * GParamSpecChar: _instance: private #GParamSpec portion : minimum value for the property specified : maximum value for the property specified _value: default value for the property specified
*/
opaque type _GParamSpecChar = CStruct4[GParamSpec, _root_.sn.gnome.glib.internal.gint8, _root_.sn.gnome.glib.internal.gint8, _root_.sn.gnome.glib.internal.gint8]
object _GParamSpecChar:
  given _tag: Tag[_GParamSpecChar] = Tag.materializeCStruct4Tag[GParamSpec, _root_.sn.gnome.glib.internal.gint8, _root_.sn.gnome.glib.internal.gint8, _root_.sn.gnome.glib.internal.gint8]
  def apply()(using Zone): Ptr[_GParamSpecChar] = scala.scalanative.unsafe.alloc[_GParamSpecChar](1)
  def apply(parent_instance : GParamSpec, minimum : _root_.sn.gnome.glib.internal.gint8, maximum : _root_.sn.gnome.glib.internal.gint8, default_value : _root_.sn.gnome.glib.internal.gint8)(using Zone): Ptr[_GParamSpecChar] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).minimum = minimum
    (!____ptr).maximum = maximum
    (!____ptr).default_value = default_value
    ____ptr
  extension (struct: _GParamSpecChar)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def minimum : _root_.sn.gnome.glib.internal.gint8 = struct._2
    def minimum_=(value: _root_.sn.gnome.glib.internal.gint8): Unit = !struct.at2 = value
    def maximum : _root_.sn.gnome.glib.internal.gint8 = struct._3
    def maximum_=(value: _root_.sn.gnome.glib.internal.gint8): Unit = !struct.at3 = value
    def default_value : _root_.sn.gnome.glib.internal.gint8 = struct._4
    def default_value_=(value: _root_.sn.gnome.glib.internal.gint8): Unit = !struct.at4 = value

/**
 * GParamSpecClass: _type_class: the parent class _type: the #GValue type for this parameter : The instance finalization function (optional), should chain up to the finalize method of the parent class. _set_default: Resets a to the default value for this type (recommended, the default is g_value_reset()), see g_param_value_set_default(). _validate: Ensures that the contents of comply with the specifications set out by this type (optional), see g_param_value_validate(). _cmp: Compares with according to this type (recommended, the default is memcmp()), see g_param_values_cmp(). _is_valid: Checks if contents of comply with the specifications set out by this type, without modifying the value. This vfunc is optional. If it isn't set, GObject will use _validate. Since 2.74
*/
opaque type _GParamSpecClass = CStruct8[GTypeClass, GType, CFuncPtr1[Ptr[GParamSpec], Unit], CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], Unit], CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GParamSpec], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gint], CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3]]
object _GParamSpecClass:
  given _tag: Tag[_GParamSpecClass] = Tag.materializeCStruct8Tag[GTypeClass, GType, CFuncPtr1[Ptr[GParamSpec], Unit], CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], Unit], CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GParamSpec], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gint], CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3]]
  def apply()(using Zone): Ptr[_GParamSpecClass] = scala.scalanative.unsafe.alloc[_GParamSpecClass](1)
  def apply(g_type_class : GTypeClass, value_type : GType, finalize : CFuncPtr1[Ptr[GParamSpec], Unit], value_set_default : CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], Unit], value_validate : CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean], values_cmp : CFuncPtr3[Ptr[GParamSpec], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gint], value_is_valid : CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean], dummy : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3])(using Zone): Ptr[_GParamSpecClass] = 
    val ____ptr = apply()
    (!____ptr).g_type_class = g_type_class
    (!____ptr).value_type = value_type
    (!____ptr).finalize = finalize
    (!____ptr).value_set_default = value_set_default
    (!____ptr).value_validate = value_validate
    (!____ptr).values_cmp = values_cmp
    (!____ptr).value_is_valid = value_is_valid
    (!____ptr).dummy = dummy
    ____ptr
  extension (struct: _GParamSpecClass)
    def g_type_class : GTypeClass = struct._1
    def g_type_class_=(value: GTypeClass): Unit = !struct.at1 = value
    def value_type : GType = struct._2
    def value_type_=(value: GType): Unit = !struct.at2 = value
    def finalize : CFuncPtr1[Ptr[GParamSpec], Unit] = struct._3
    def finalize_=(value: CFuncPtr1[Ptr[GParamSpec], Unit]): Unit = !struct.at3 = value
    def value_set_default : CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], Unit] = struct._4
    def value_set_default_=(value: CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], Unit]): Unit = !struct.at4 = value
    def value_validate : CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean] = struct._5
    def value_validate_=(value: CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at5 = value
    def values_cmp : CFuncPtr3[Ptr[GParamSpec], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gint] = struct._6
    def values_cmp_=(value: CFuncPtr3[Ptr[GParamSpec], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gint]): Unit = !struct.at6 = value
    def value_is_valid : CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean] = struct._7
    def value_is_valid_=(value: CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at7 = value
    def dummy : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3] = struct._8
    def dummy_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3]): Unit = !struct.at8 = value

/**
 * GParamSpecDouble: _instance: private #GParamSpec portion : minimum value for the property specified : maximum value for the property specified _value: default value for the property specified : values closer than will be considered identical by g_param_values_cmp(); the default value is 1e-90.
*/
opaque type _GParamSpecDouble = CStruct5[GParamSpec, _root_.sn.gnome.glib.internal.gdouble, _root_.sn.gnome.glib.internal.gdouble, _root_.sn.gnome.glib.internal.gdouble, _root_.sn.gnome.glib.internal.gdouble]
object _GParamSpecDouble:
  given _tag: Tag[_GParamSpecDouble] = Tag.materializeCStruct5Tag[GParamSpec, _root_.sn.gnome.glib.internal.gdouble, _root_.sn.gnome.glib.internal.gdouble, _root_.sn.gnome.glib.internal.gdouble, _root_.sn.gnome.glib.internal.gdouble]
  def apply()(using Zone): Ptr[_GParamSpecDouble] = scala.scalanative.unsafe.alloc[_GParamSpecDouble](1)
  def apply(parent_instance : GParamSpec, minimum : _root_.sn.gnome.glib.internal.gdouble, maximum : _root_.sn.gnome.glib.internal.gdouble, default_value : _root_.sn.gnome.glib.internal.gdouble, epsilon : _root_.sn.gnome.glib.internal.gdouble)(using Zone): Ptr[_GParamSpecDouble] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).minimum = minimum
    (!____ptr).maximum = maximum
    (!____ptr).default_value = default_value
    (!____ptr).epsilon = epsilon
    ____ptr
  extension (struct: _GParamSpecDouble)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def minimum : _root_.sn.gnome.glib.internal.gdouble = struct._2
    def minimum_=(value: _root_.sn.gnome.glib.internal.gdouble): Unit = !struct.at2 = value
    def maximum : _root_.sn.gnome.glib.internal.gdouble = struct._3
    def maximum_=(value: _root_.sn.gnome.glib.internal.gdouble): Unit = !struct.at3 = value
    def default_value : _root_.sn.gnome.glib.internal.gdouble = struct._4
    def default_value_=(value: _root_.sn.gnome.glib.internal.gdouble): Unit = !struct.at4 = value
    def epsilon : _root_.sn.gnome.glib.internal.gdouble = struct._5
    def epsilon_=(value: _root_.sn.gnome.glib.internal.gdouble): Unit = !struct.at5 = value

/**
 * GParamSpecEnum: _instance: private #GParamSpec portion _value: default value for the property specified
*/
opaque type _GParamSpecEnum = CStruct3[GParamSpec, Ptr[GEnumClass], _root_.sn.gnome.glib.internal.gint]
object _GParamSpecEnum:
  given _tag: Tag[_GParamSpecEnum] = Tag.materializeCStruct3Tag[GParamSpec, Ptr[GEnumClass], _root_.sn.gnome.glib.internal.gint]
  def apply()(using Zone): Ptr[_GParamSpecEnum] = scala.scalanative.unsafe.alloc[_GParamSpecEnum](1)
  def apply(parent_instance : GParamSpec, enum_class : Ptr[GEnumClass], default_value : _root_.sn.gnome.glib.internal.gint)(using Zone): Ptr[_GParamSpecEnum] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).enum_class = enum_class
    (!____ptr).default_value = default_value
    ____ptr
  extension (struct: _GParamSpecEnum)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def enum_class : Ptr[GEnumClass] = struct._2
    def enum_class_=(value: Ptr[GEnumClass]): Unit = !struct.at2 = value
    def default_value : _root_.sn.gnome.glib.internal.gint = struct._3
    def default_value_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at3 = value

/**
 * GParamSpecFlags: _instance: private #GParamSpec portion _class: the #GFlagsClass for the flags _value: default value for the property specified
*/
opaque type _GParamSpecFlags = CStruct3[GParamSpec, Ptr[GFlagsClass], _root_.sn.gnome.glib.internal.guint]
object _GParamSpecFlags:
  given _tag: Tag[_GParamSpecFlags] = Tag.materializeCStruct3Tag[GParamSpec, Ptr[GFlagsClass], _root_.sn.gnome.glib.internal.guint]
  def apply()(using Zone): Ptr[_GParamSpecFlags] = scala.scalanative.unsafe.alloc[_GParamSpecFlags](1)
  def apply(parent_instance : GParamSpec, flags_class : Ptr[GFlagsClass], default_value : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[_GParamSpecFlags] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).flags_class = flags_class
    (!____ptr).default_value = default_value
    ____ptr
  extension (struct: _GParamSpecFlags)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def flags_class : Ptr[GFlagsClass] = struct._2
    def flags_class_=(value: Ptr[GFlagsClass]): Unit = !struct.at2 = value
    def default_value : _root_.sn.gnome.glib.internal.guint = struct._3
    def default_value_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at3 = value

/**
 * GParamSpecFloat: _instance: private #GParamSpec portion : minimum value for the property specified : maximum value for the property specified _value: default value for the property specified : values closer than will be considered identical by g_param_values_cmp(); the default value is 1e-30.
*/
opaque type _GParamSpecFloat = CStruct5[GParamSpec, _root_.sn.gnome.glib.internal.gfloat, _root_.sn.gnome.glib.internal.gfloat, _root_.sn.gnome.glib.internal.gfloat, _root_.sn.gnome.glib.internal.gfloat]
object _GParamSpecFloat:
  given _tag: Tag[_GParamSpecFloat] = Tag.materializeCStruct5Tag[GParamSpec, _root_.sn.gnome.glib.internal.gfloat, _root_.sn.gnome.glib.internal.gfloat, _root_.sn.gnome.glib.internal.gfloat, _root_.sn.gnome.glib.internal.gfloat]
  def apply()(using Zone): Ptr[_GParamSpecFloat] = scala.scalanative.unsafe.alloc[_GParamSpecFloat](1)
  def apply(parent_instance : GParamSpec, minimum : _root_.sn.gnome.glib.internal.gfloat, maximum : _root_.sn.gnome.glib.internal.gfloat, default_value : _root_.sn.gnome.glib.internal.gfloat, epsilon : _root_.sn.gnome.glib.internal.gfloat)(using Zone): Ptr[_GParamSpecFloat] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).minimum = minimum
    (!____ptr).maximum = maximum
    (!____ptr).default_value = default_value
    (!____ptr).epsilon = epsilon
    ____ptr
  extension (struct: _GParamSpecFloat)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def minimum : _root_.sn.gnome.glib.internal.gfloat = struct._2
    def minimum_=(value: _root_.sn.gnome.glib.internal.gfloat): Unit = !struct.at2 = value
    def maximum : _root_.sn.gnome.glib.internal.gfloat = struct._3
    def maximum_=(value: _root_.sn.gnome.glib.internal.gfloat): Unit = !struct.at3 = value
    def default_value : _root_.sn.gnome.glib.internal.gfloat = struct._4
    def default_value_=(value: _root_.sn.gnome.glib.internal.gfloat): Unit = !struct.at4 = value
    def epsilon : _root_.sn.gnome.glib.internal.gfloat = struct._5
    def epsilon_=(value: _root_.sn.gnome.glib.internal.gfloat): Unit = !struct.at5 = value

/**
 * GParamSpecGType: _instance: private #GParamSpec portion
*/
opaque type _GParamSpecGType = CStruct2[GParamSpec, GType]
object _GParamSpecGType:
  given _tag: Tag[_GParamSpecGType] = Tag.materializeCStruct2Tag[GParamSpec, GType]
  def apply()(using Zone): Ptr[_GParamSpecGType] = scala.scalanative.unsafe.alloc[_GParamSpecGType](1)
  def apply(parent_instance : GParamSpec, is_a_type : GType)(using Zone): Ptr[_GParamSpecGType] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).is_a_type = is_a_type
    ____ptr
  extension (struct: _GParamSpecGType)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def is_a_type : GType = struct._2
    def is_a_type_=(value: GType): Unit = !struct.at2 = value

/**
 * GParamSpecInt: _instance: private #GParamSpec portion : minimum value for the property specified : maximum value for the property specified _value: default value for the property specified
*/
opaque type _GParamSpecInt = CStruct4[GParamSpec, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint]
object _GParamSpecInt:
  given _tag: Tag[_GParamSpecInt] = Tag.materializeCStruct4Tag[GParamSpec, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint]
  def apply()(using Zone): Ptr[_GParamSpecInt] = scala.scalanative.unsafe.alloc[_GParamSpecInt](1)
  def apply(parent_instance : GParamSpec, minimum : _root_.sn.gnome.glib.internal.gint, maximum : _root_.sn.gnome.glib.internal.gint, default_value : _root_.sn.gnome.glib.internal.gint)(using Zone): Ptr[_GParamSpecInt] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).minimum = minimum
    (!____ptr).maximum = maximum
    (!____ptr).default_value = default_value
    ____ptr
  extension (struct: _GParamSpecInt)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def minimum : _root_.sn.gnome.glib.internal.gint = struct._2
    def minimum_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at2 = value
    def maximum : _root_.sn.gnome.glib.internal.gint = struct._3
    def maximum_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at3 = value
    def default_value : _root_.sn.gnome.glib.internal.gint = struct._4
    def default_value_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at4 = value

/**
 * GParamSpecInt64: _instance: private #GParamSpec portion : minimum value for the property specified : maximum value for the property specified _value: default value for the property specified
*/
opaque type _GParamSpecInt64 = CStruct4[GParamSpec, _root_.sn.gnome.glib.internal.gint64, _root_.sn.gnome.glib.internal.gint64, _root_.sn.gnome.glib.internal.gint64]
object _GParamSpecInt64:
  given _tag: Tag[_GParamSpecInt64] = Tag.materializeCStruct4Tag[GParamSpec, _root_.sn.gnome.glib.internal.gint64, _root_.sn.gnome.glib.internal.gint64, _root_.sn.gnome.glib.internal.gint64]
  def apply()(using Zone): Ptr[_GParamSpecInt64] = scala.scalanative.unsafe.alloc[_GParamSpecInt64](1)
  def apply(parent_instance : GParamSpec, minimum : _root_.sn.gnome.glib.internal.gint64, maximum : _root_.sn.gnome.glib.internal.gint64, default_value : _root_.sn.gnome.glib.internal.gint64)(using Zone): Ptr[_GParamSpecInt64] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).minimum = minimum
    (!____ptr).maximum = maximum
    (!____ptr).default_value = default_value
    ____ptr
  extension (struct: _GParamSpecInt64)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def minimum : _root_.sn.gnome.glib.internal.gint64 = struct._2
    def minimum_=(value: _root_.sn.gnome.glib.internal.gint64): Unit = !struct.at2 = value
    def maximum : _root_.sn.gnome.glib.internal.gint64 = struct._3
    def maximum_=(value: _root_.sn.gnome.glib.internal.gint64): Unit = !struct.at3 = value
    def default_value : _root_.sn.gnome.glib.internal.gint64 = struct._4
    def default_value_=(value: _root_.sn.gnome.glib.internal.gint64): Unit = !struct.at4 = value

/**
 * GParamSpecLong: _instance: private #GParamSpec portion : minimum value for the property specified : maximum value for the property specified _value: default value for the property specified
*/
opaque type _GParamSpecLong = CStruct4[GParamSpec, _root_.sn.gnome.glib.internal.glong, _root_.sn.gnome.glib.internal.glong, _root_.sn.gnome.glib.internal.glong]
object _GParamSpecLong:
  given _tag: Tag[_GParamSpecLong] = Tag.materializeCStruct4Tag[GParamSpec, _root_.sn.gnome.glib.internal.glong, _root_.sn.gnome.glib.internal.glong, _root_.sn.gnome.glib.internal.glong]
  def apply()(using Zone): Ptr[_GParamSpecLong] = scala.scalanative.unsafe.alloc[_GParamSpecLong](1)
  def apply(parent_instance : GParamSpec, minimum : _root_.sn.gnome.glib.internal.glong, maximum : _root_.sn.gnome.glib.internal.glong, default_value : _root_.sn.gnome.glib.internal.glong)(using Zone): Ptr[_GParamSpecLong] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).minimum = minimum
    (!____ptr).maximum = maximum
    (!____ptr).default_value = default_value
    ____ptr
  extension (struct: _GParamSpecLong)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def minimum : _root_.sn.gnome.glib.internal.glong = struct._2
    def minimum_=(value: _root_.sn.gnome.glib.internal.glong): Unit = !struct.at2 = value
    def maximum : _root_.sn.gnome.glib.internal.glong = struct._3
    def maximum_=(value: _root_.sn.gnome.glib.internal.glong): Unit = !struct.at3 = value
    def default_value : _root_.sn.gnome.glib.internal.glong = struct._4
    def default_value_=(value: _root_.sn.gnome.glib.internal.glong): Unit = !struct.at4 = value

/**
 * GParamSpecObject: _instance: private #GParamSpec portion
*/
opaque type _GParamSpecObject = CStruct1[GParamSpec]
object _GParamSpecObject:
  given _tag: Tag[_GParamSpecObject] = Tag.materializeCStruct1Tag[GParamSpec]
  def apply()(using Zone): Ptr[_GParamSpecObject] = scala.scalanative.unsafe.alloc[_GParamSpecObject](1)
  def apply(parent_instance : GParamSpec)(using Zone): Ptr[_GParamSpecObject] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GParamSpecObject)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value

/**
 * GParamSpecOverride:
*/
opaque type _GParamSpecOverride = CStruct2[GParamSpec, Ptr[GParamSpec]]
object _GParamSpecOverride:
  given _tag: Tag[_GParamSpecOverride] = Tag.materializeCStruct2Tag[GParamSpec, Ptr[GParamSpec]]
  def apply()(using Zone): Ptr[_GParamSpecOverride] = scala.scalanative.unsafe.alloc[_GParamSpecOverride](1)
  def apply(parent_instance : GParamSpec, overridden : Ptr[GParamSpec])(using Zone): Ptr[_GParamSpecOverride] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).overridden = overridden
    ____ptr
  extension (struct: _GParamSpecOverride)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def overridden : Ptr[GParamSpec] = struct._2
    def overridden_=(value: Ptr[GParamSpec]): Unit = !struct.at2 = value

/**
 * GParamSpecParam: _instance: private #GParamSpec portion
*/
opaque type _GParamSpecParam = CStruct1[GParamSpec]
object _GParamSpecParam:
  given _tag: Tag[_GParamSpecParam] = Tag.materializeCStruct1Tag[GParamSpec]
  def apply()(using Zone): Ptr[_GParamSpecParam] = scala.scalanative.unsafe.alloc[_GParamSpecParam](1)
  def apply(parent_instance : GParamSpec)(using Zone): Ptr[_GParamSpecParam] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GParamSpecParam)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value

/**
 * GParamSpecPointer: _instance: private #GParamSpec portion
*/
opaque type _GParamSpecPointer = CStruct1[GParamSpec]
object _GParamSpecPointer:
  given _tag: Tag[_GParamSpecPointer] = Tag.materializeCStruct1Tag[GParamSpec]
  def apply()(using Zone): Ptr[_GParamSpecPointer] = scala.scalanative.unsafe.alloc[_GParamSpecPointer](1)
  def apply(parent_instance : GParamSpec)(using Zone): Ptr[_GParamSpecPointer] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GParamSpecPointer)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value

opaque type _GParamSpecPool = CStruct0
object _GParamSpecPool:
  given _tag: Tag[_GParamSpecPool] = Tag.materializeCStruct0Tag

/**
 * GParamSpecString: _instance: private #GParamSpec portion _value: default value for the property specified _first: a string containing the allowed values for the first byte _nth: a string containing the allowed values for the subsequent bytes : the replacement byte for bytes which don't match _first or _nth. _fold_if_empty: replace empty string by %NULL _non_null: replace %NULL strings by an empty string
*/
opaque type _GParamSpecString = CStruct7[GParamSpec, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gchar, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
object _GParamSpecString:
  given _tag: Tag[_GParamSpecString] = Tag.materializeCStruct7Tag[GParamSpec, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gchar, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
  def apply()(using Zone): Ptr[_GParamSpecString] = scala.scalanative.unsafe.alloc[_GParamSpecString](1)
  def apply(parent_instance : GParamSpec, default_value : Ptr[_root_.sn.gnome.glib.internal.gchar], cset_first : Ptr[_root_.sn.gnome.glib.internal.gchar], cset_nth : Ptr[_root_.sn.gnome.glib.internal.gchar], substitutor : _root_.sn.gnome.glib.internal.gchar, null_fold_if_empty : _root_.sn.gnome.glib.internal.guint, ensure_non_null : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[_GParamSpecString] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).default_value = default_value
    (!____ptr).cset_first = cset_first
    (!____ptr).cset_nth = cset_nth
    (!____ptr).substitutor = substitutor
    (!____ptr).null_fold_if_empty = null_fold_if_empty
    (!____ptr).ensure_non_null = ensure_non_null
    ____ptr
  extension (struct: _GParamSpecString)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def default_value : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
    def default_value_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at2 = value
    def cset_first : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._3
    def cset_first_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at3 = value
    def cset_nth : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._4
    def cset_nth_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at4 = value
    def substitutor : _root_.sn.gnome.glib.internal.gchar = struct._5
    def substitutor_=(value: _root_.sn.gnome.glib.internal.gchar): Unit = !struct.at5 = value
    def null_fold_if_empty : _root_.sn.gnome.glib.internal.guint = struct._6
    def null_fold_if_empty_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at6 = value
    def ensure_non_null : _root_.sn.gnome.glib.internal.guint = struct._7
    def ensure_non_null_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at7 = value

/**
 * GParamSpecTypeInfo: _size: Size of the instance (object) structure. _preallocs: Prior to GLib 2.10, it specified the number of pre-allocated (cached) instances to reserve memory for (0 indicates no caching). Since GLib 2.10, it is ignored, since instances are allocated with the [slice allocator][glib-Memory-Slices] now. _init: Location of the instance initialization function (optional). _type: The #GType of values conforming to this #GParamSpec : The instance finalization function (optional). _set_default: Resets a to the default value for (recommended, the default is g_value_reset()), see g_param_value_set_default(). _validate: Ensures that the contents of comply with the specifications set out by (optional), see g_param_value_validate(). _cmp: Compares with according to (recommended, the default is memcmp()), see g_param_values_cmp().
*/
opaque type _GParamSpecTypeInfo = CStruct8[_root_.sn.gnome.glib.internal.guint16, _root_.sn.gnome.glib.internal.guint16, CFuncPtr1[Ptr[GParamSpec], Unit], GType, CFuncPtr1[Ptr[GParamSpec], Unit], CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], Unit], CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GParamSpec], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gint]]
object _GParamSpecTypeInfo:
  given _tag: Tag[_GParamSpecTypeInfo] = Tag.materializeCStruct8Tag[_root_.sn.gnome.glib.internal.guint16, _root_.sn.gnome.glib.internal.guint16, CFuncPtr1[Ptr[GParamSpec], Unit], GType, CFuncPtr1[Ptr[GParamSpec], Unit], CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], Unit], CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GParamSpec], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gint]]
  def apply()(using Zone): Ptr[_GParamSpecTypeInfo] = scala.scalanative.unsafe.alloc[_GParamSpecTypeInfo](1)
  def apply(instance_size : _root_.sn.gnome.glib.internal.guint16, n_preallocs : _root_.sn.gnome.glib.internal.guint16, instance_init : CFuncPtr1[Ptr[GParamSpec], Unit], value_type : GType, finalize : CFuncPtr1[Ptr[GParamSpec], Unit], value_set_default : CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], Unit], value_validate : CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean], values_cmp : CFuncPtr3[Ptr[GParamSpec], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gint])(using Zone): Ptr[_GParamSpecTypeInfo] = 
    val ____ptr = apply()
    (!____ptr).instance_size = instance_size
    (!____ptr).n_preallocs = n_preallocs
    (!____ptr).instance_init = instance_init
    (!____ptr).value_type = value_type
    (!____ptr).finalize = finalize
    (!____ptr).value_set_default = value_set_default
    (!____ptr).value_validate = value_validate
    (!____ptr).values_cmp = values_cmp
    ____ptr
  extension (struct: _GParamSpecTypeInfo)
    def instance_size : _root_.sn.gnome.glib.internal.guint16 = struct._1
    def instance_size_=(value: _root_.sn.gnome.glib.internal.guint16): Unit = !struct.at1 = value
    def n_preallocs : _root_.sn.gnome.glib.internal.guint16 = struct._2
    def n_preallocs_=(value: _root_.sn.gnome.glib.internal.guint16): Unit = !struct.at2 = value
    def instance_init : CFuncPtr1[Ptr[GParamSpec], Unit] = struct._3
    def instance_init_=(value: CFuncPtr1[Ptr[GParamSpec], Unit]): Unit = !struct.at3 = value
    def value_type : GType = struct._4
    def value_type_=(value: GType): Unit = !struct.at4 = value
    def finalize : CFuncPtr1[Ptr[GParamSpec], Unit] = struct._5
    def finalize_=(value: CFuncPtr1[Ptr[GParamSpec], Unit]): Unit = !struct.at5 = value
    def value_set_default : CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], Unit] = struct._6
    def value_set_default_=(value: CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], Unit]): Unit = !struct.at6 = value
    def value_validate : CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean] = struct._7
    def value_validate_=(value: CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at7 = value
    def values_cmp : CFuncPtr3[Ptr[GParamSpec], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gint] = struct._8
    def values_cmp_=(value: CFuncPtr3[Ptr[GParamSpec], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gint]): Unit = !struct.at8 = value

/**
 * GParamSpecUChar: _instance: private #GParamSpec portion : minimum value for the property specified : maximum value for the property specified _value: default value for the property specified
*/
opaque type _GParamSpecUChar = CStruct4[GParamSpec, _root_.sn.gnome.glib.internal.guint8, _root_.sn.gnome.glib.internal.guint8, _root_.sn.gnome.glib.internal.guint8]
object _GParamSpecUChar:
  given _tag: Tag[_GParamSpecUChar] = Tag.materializeCStruct4Tag[GParamSpec, _root_.sn.gnome.glib.internal.guint8, _root_.sn.gnome.glib.internal.guint8, _root_.sn.gnome.glib.internal.guint8]
  def apply()(using Zone): Ptr[_GParamSpecUChar] = scala.scalanative.unsafe.alloc[_GParamSpecUChar](1)
  def apply(parent_instance : GParamSpec, minimum : _root_.sn.gnome.glib.internal.guint8, maximum : _root_.sn.gnome.glib.internal.guint8, default_value : _root_.sn.gnome.glib.internal.guint8)(using Zone): Ptr[_GParamSpecUChar] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).minimum = minimum
    (!____ptr).maximum = maximum
    (!____ptr).default_value = default_value
    ____ptr
  extension (struct: _GParamSpecUChar)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def minimum : _root_.sn.gnome.glib.internal.guint8 = struct._2
    def minimum_=(value: _root_.sn.gnome.glib.internal.guint8): Unit = !struct.at2 = value
    def maximum : _root_.sn.gnome.glib.internal.guint8 = struct._3
    def maximum_=(value: _root_.sn.gnome.glib.internal.guint8): Unit = !struct.at3 = value
    def default_value : _root_.sn.gnome.glib.internal.guint8 = struct._4
    def default_value_=(value: _root_.sn.gnome.glib.internal.guint8): Unit = !struct.at4 = value

/**
 * GParamSpecUInt: _instance: private #GParamSpec portion : minimum value for the property specified : maximum value for the property specified _value: default value for the property specified
*/
opaque type _GParamSpecUInt = CStruct4[GParamSpec, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
object _GParamSpecUInt:
  given _tag: Tag[_GParamSpecUInt] = Tag.materializeCStruct4Tag[GParamSpec, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
  def apply()(using Zone): Ptr[_GParamSpecUInt] = scala.scalanative.unsafe.alloc[_GParamSpecUInt](1)
  def apply(parent_instance : GParamSpec, minimum : _root_.sn.gnome.glib.internal.guint, maximum : _root_.sn.gnome.glib.internal.guint, default_value : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[_GParamSpecUInt] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).minimum = minimum
    (!____ptr).maximum = maximum
    (!____ptr).default_value = default_value
    ____ptr
  extension (struct: _GParamSpecUInt)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def minimum : _root_.sn.gnome.glib.internal.guint = struct._2
    def minimum_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at2 = value
    def maximum : _root_.sn.gnome.glib.internal.guint = struct._3
    def maximum_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at3 = value
    def default_value : _root_.sn.gnome.glib.internal.guint = struct._4
    def default_value_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at4 = value

/**
 * GParamSpecUInt64: _instance: private #GParamSpec portion : minimum value for the property specified : maximum value for the property specified _value: default value for the property specified
*/
opaque type _GParamSpecUInt64 = CStruct4[GParamSpec, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.guint64]
object _GParamSpecUInt64:
  given _tag: Tag[_GParamSpecUInt64] = Tag.materializeCStruct4Tag[GParamSpec, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.guint64]
  def apply()(using Zone): Ptr[_GParamSpecUInt64] = scala.scalanative.unsafe.alloc[_GParamSpecUInt64](1)
  def apply(parent_instance : GParamSpec, minimum : _root_.sn.gnome.glib.internal.guint64, maximum : _root_.sn.gnome.glib.internal.guint64, default_value : _root_.sn.gnome.glib.internal.guint64)(using Zone): Ptr[_GParamSpecUInt64] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).minimum = minimum
    (!____ptr).maximum = maximum
    (!____ptr).default_value = default_value
    ____ptr
  extension (struct: _GParamSpecUInt64)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def minimum : _root_.sn.gnome.glib.internal.guint64 = struct._2
    def minimum_=(value: _root_.sn.gnome.glib.internal.guint64): Unit = !struct.at2 = value
    def maximum : _root_.sn.gnome.glib.internal.guint64 = struct._3
    def maximum_=(value: _root_.sn.gnome.glib.internal.guint64): Unit = !struct.at3 = value
    def default_value : _root_.sn.gnome.glib.internal.guint64 = struct._4
    def default_value_=(value: _root_.sn.gnome.glib.internal.guint64): Unit = !struct.at4 = value

/**
 * GParamSpecULong: _instance: private #GParamSpec portion : minimum value for the property specified : maximum value for the property specified _value: default value for the property specified
*/
opaque type _GParamSpecULong = CStruct4[GParamSpec, _root_.sn.gnome.glib.internal.gulong, _root_.sn.gnome.glib.internal.gulong, _root_.sn.gnome.glib.internal.gulong]
object _GParamSpecULong:
  given _tag: Tag[_GParamSpecULong] = Tag.materializeCStruct4Tag[GParamSpec, _root_.sn.gnome.glib.internal.gulong, _root_.sn.gnome.glib.internal.gulong, _root_.sn.gnome.glib.internal.gulong]
  def apply()(using Zone): Ptr[_GParamSpecULong] = scala.scalanative.unsafe.alloc[_GParamSpecULong](1)
  def apply(parent_instance : GParamSpec, minimum : _root_.sn.gnome.glib.internal.gulong, maximum : _root_.sn.gnome.glib.internal.gulong, default_value : _root_.sn.gnome.glib.internal.gulong)(using Zone): Ptr[_GParamSpecULong] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).minimum = minimum
    (!____ptr).maximum = maximum
    (!____ptr).default_value = default_value
    ____ptr
  extension (struct: _GParamSpecULong)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def minimum : _root_.sn.gnome.glib.internal.gulong = struct._2
    def minimum_=(value: _root_.sn.gnome.glib.internal.gulong): Unit = !struct.at2 = value
    def maximum : _root_.sn.gnome.glib.internal.gulong = struct._3
    def maximum_=(value: _root_.sn.gnome.glib.internal.gulong): Unit = !struct.at3 = value
    def default_value : _root_.sn.gnome.glib.internal.gulong = struct._4
    def default_value_=(value: _root_.sn.gnome.glib.internal.gulong): Unit = !struct.at4 = value

/**
 * GParamSpecUnichar: _instance: private #GParamSpec portion _value: default value for the property specified
*/
opaque type _GParamSpecUnichar = CStruct2[GParamSpec, _root_.sn.gnome.glib.internal.gunichar]
object _GParamSpecUnichar:
  given _tag: Tag[_GParamSpecUnichar] = Tag.materializeCStruct2Tag[GParamSpec, _root_.sn.gnome.glib.internal.gunichar]
  def apply()(using Zone): Ptr[_GParamSpecUnichar] = scala.scalanative.unsafe.alloc[_GParamSpecUnichar](1)
  def apply(parent_instance : GParamSpec, default_value : _root_.sn.gnome.glib.internal.gunichar)(using Zone): Ptr[_GParamSpecUnichar] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).default_value = default_value
    ____ptr
  extension (struct: _GParamSpecUnichar)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def default_value : _root_.sn.gnome.glib.internal.gunichar = struct._2
    def default_value_=(value: _root_.sn.gnome.glib.internal.gunichar): Unit = !struct.at2 = value

/**
 * GParamSpecValueArray: _instance: private #GParamSpec portion _spec: a #GParamSpec describing the elements contained in arrays of this property, may be %NULL _n_elements: if greater than 0, arrays of this property will always have this many elements
*/
opaque type _GParamSpecValueArray = CStruct3[GParamSpec, Ptr[GParamSpec], _root_.sn.gnome.glib.internal.guint]
object _GParamSpecValueArray:
  given _tag: Tag[_GParamSpecValueArray] = Tag.materializeCStruct3Tag[GParamSpec, Ptr[GParamSpec], _root_.sn.gnome.glib.internal.guint]
  def apply()(using Zone): Ptr[_GParamSpecValueArray] = scala.scalanative.unsafe.alloc[_GParamSpecValueArray](1)
  def apply(parent_instance : GParamSpec, element_spec : Ptr[GParamSpec], fixed_n_elements : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[_GParamSpecValueArray] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).element_spec = element_spec
    (!____ptr).fixed_n_elements = fixed_n_elements
    ____ptr
  extension (struct: _GParamSpecValueArray)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def element_spec : Ptr[GParamSpec] = struct._2
    def element_spec_=(value: Ptr[GParamSpec]): Unit = !struct.at2 = value
    def fixed_n_elements : _root_.sn.gnome.glib.internal.guint = struct._3
    def fixed_n_elements_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at3 = value

/**
 * GParamSpecVariant: _instance: private #GParamSpec portion : a #GVariantType, or %NULL _value: a #GVariant, or %NULL
*/
opaque type _GParamSpecVariant = CStruct4[GParamSpec, Ptr[_root_.sn.gnome.glib.internal.GVariantType], Ptr[_root_.sn.gnome.glib.internal.GVariant], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
object _GParamSpecVariant:
  given _tag: Tag[_GParamSpecVariant] = Tag.materializeCStruct4Tag[GParamSpec, Ptr[_root_.sn.gnome.glib.internal.GVariantType], Ptr[_root_.sn.gnome.glib.internal.GVariant], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[_GParamSpecVariant] = scala.scalanative.unsafe.alloc[_GParamSpecVariant](1)
  def apply(parent_instance : GParamSpec, `type` : Ptr[_root_.sn.gnome.glib.internal.GVariantType], default_value : Ptr[_root_.sn.gnome.glib.internal.GVariant], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[_GParamSpecVariant] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).`type` = `type`
    (!____ptr).default_value = default_value
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GParamSpecVariant)
    def parent_instance : GParamSpec = struct._1
    def parent_instance_=(value: GParamSpec): Unit = !struct.at1 = value
    def `type` : Ptr[_root_.sn.gnome.glib.internal.GVariantType] = struct._2
    def type_=(value: Ptr[_root_.sn.gnome.glib.internal.GVariantType]): Unit = !struct.at2 = value
    def default_value : Ptr[_root_.sn.gnome.glib.internal.GVariant] = struct._3
    def default_value_=(value: Ptr[_root_.sn.gnome.glib.internal.GVariant]): Unit = !struct.at3 = value
    def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._4
    def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = !struct.at4 = value

/**
 * GParameter: : the parameter value
*/
opaque type _GParameter = CStruct2[Ptr[_root_.sn.gnome.glib.internal.gchar], GValue]
object _GParameter:
  given _tag: Tag[_GParameter] = Tag.materializeCStruct2Tag[Ptr[_root_.sn.gnome.glib.internal.gchar], GValue]
  def apply()(using Zone): Ptr[_GParameter] = scala.scalanative.unsafe.alloc[_GParameter](1)
  def apply(name : Ptr[_root_.sn.gnome.glib.internal.gchar], value : GValue)(using Zone): Ptr[_GParameter] = 
    val ____ptr = apply()
    (!____ptr).name = name
    (!____ptr).value = value
    ____ptr
  extension (struct: _GParameter)
    def name : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._1
    def name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at1 = value
    def value : GValue = struct._2
    def value_=(value: GValue): Unit = !struct.at2 = value

opaque type _GSignalGroup = CStruct0
object _GSignalGroup:
  given _tag: Tag[_GSignalGroup] = Tag.materializeCStruct0Tag

/**
 * GSignalInvocationHint: _id: The signal id of the signal invoking the callback
*/
opaque type _GSignalInvocationHint = CStruct3[_root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.GQuark, GSignalFlags]
object _GSignalInvocationHint:
  given _tag: Tag[_GSignalInvocationHint] = Tag.materializeCStruct3Tag[_root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.GQuark, GSignalFlags]
  def apply()(using Zone): Ptr[_GSignalInvocationHint] = scala.scalanative.unsafe.alloc[_GSignalInvocationHint](1)
  def apply(signal_id : _root_.sn.gnome.glib.internal.guint, detail : _root_.sn.gnome.glib.internal.GQuark, run_type : GSignalFlags)(using Zone): Ptr[_GSignalInvocationHint] = 
    val ____ptr = apply()
    (!____ptr).signal_id = signal_id
    (!____ptr).detail = detail
    (!____ptr).run_type = run_type
    ____ptr
  extension (struct: _GSignalInvocationHint)
    def signal_id : _root_.sn.gnome.glib.internal.guint = struct._1
    def signal_id_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at1 = value
    def detail : _root_.sn.gnome.glib.internal.GQuark = struct._2
    def detail_=(value: _root_.sn.gnome.glib.internal.GQuark): Unit = !struct.at2 = value
    def run_type : GSignalFlags = struct._3
    def run_type_=(value: GSignalFlags): Unit = !struct.at3 = value

/**
 * GSignalQuery: _id: The signal id of the signal being queried, or 0 if the signal to be queried was unknown. _name: The signal name. : The interface/instance type that this signal can be emitted for. _flags: The signal flags as passed in to g_signal_new().
*/
opaque type _GSignalQuery = CStruct7[_root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.gchar], GType, GSignalFlags, GType, _root_.sn.gnome.glib.internal.guint, Ptr[GType]]
object _GSignalQuery:
  given _tag: Tag[_GSignalQuery] = Tag.materializeCStruct7Tag[_root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.gchar], GType, GSignalFlags, GType, _root_.sn.gnome.glib.internal.guint, Ptr[GType]]
  def apply()(using Zone): Ptr[_GSignalQuery] = scala.scalanative.unsafe.alloc[_GSignalQuery](1)
  def apply(signal_id : _root_.sn.gnome.glib.internal.guint, signal_name : Ptr[_root_.sn.gnome.glib.internal.gchar], itype : GType, signal_flags : GSignalFlags, return_type : GType, n_params : _root_.sn.gnome.glib.internal.guint, param_types : Ptr[GType])(using Zone): Ptr[_GSignalQuery] = 
    val ____ptr = apply()
    (!____ptr).signal_id = signal_id
    (!____ptr).signal_name = signal_name
    (!____ptr).itype = itype
    (!____ptr).signal_flags = signal_flags
    (!____ptr).return_type = return_type
    (!____ptr).n_params = n_params
    (!____ptr).param_types = param_types
    ____ptr
  extension (struct: _GSignalQuery)
    def signal_id : _root_.sn.gnome.glib.internal.guint = struct._1
    def signal_id_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at1 = value
    def signal_name : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
    def signal_name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at2 = value
    def itype : GType = struct._3
    def itype_=(value: GType): Unit = !struct.at3 = value
    def signal_flags : GSignalFlags = struct._4
    def signal_flags_=(value: GSignalFlags): Unit = !struct.at4 = value
    def return_type : GType = struct._5
    def return_type_=(value: GType): Unit = !struct.at5 = value
    def n_params : _root_.sn.gnome.glib.internal.guint = struct._6
    def n_params_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at6 = value
    def param_types : Ptr[GType] = struct._7
    def param_types_=(value: Ptr[GType]): Unit = !struct.at7 = value

/**
 * GTypeClass:
*/
opaque type _GTypeClass = CStruct1[GType]
object _GTypeClass:
  given _tag: Tag[_GTypeClass] = Tag.materializeCStruct1Tag[GType]
  def apply()(using Zone): Ptr[_GTypeClass] = scala.scalanative.unsafe.alloc[_GTypeClass](1)
  def apply(g_type : GType)(using Zone): Ptr[_GTypeClass] = 
    val ____ptr = apply()
    (!____ptr).g_type = g_type
    ____ptr
  extension (struct: _GTypeClass)
    def g_type : GType = struct._1
    def g_type_=(value: GType): Unit = !struct.at1 = value

/**
 * GTypeFundamentalInfo: _flags: #GTypeFundamentalFlags describing the characteristics of the fundamental type
*/
opaque type _GTypeFundamentalInfo = CStruct1[GTypeFundamentalFlags]
object _GTypeFundamentalInfo:
  given _tag: Tag[_GTypeFundamentalInfo] = Tag.materializeCStruct1Tag[GTypeFundamentalFlags]
  def apply()(using Zone): Ptr[_GTypeFundamentalInfo] = scala.scalanative.unsafe.alloc[_GTypeFundamentalInfo](1)
  def apply(type_flags : GTypeFundamentalFlags)(using Zone): Ptr[_GTypeFundamentalInfo] = 
    val ____ptr = apply()
    (!____ptr).type_flags = type_flags
    ____ptr
  extension (struct: _GTypeFundamentalInfo)
    def type_flags : GTypeFundamentalFlags = struct._1
    def type_flags_=(value: GTypeFundamentalFlags): Unit = !struct.at1 = value

/**
 * GTypeInfo: _init: Location of the base initialization function (optional) _finalize: Location of the base finalization function (optional) classed and instantiatable types. Location of the default vtable inititalization function for interface types. (optional) This function is used both to fill in virtual functions in the class or default vtable, and to do type-specific setup such as registering signals and object properties. classed and instantiatable types. Location of the default vtable finalization function for interface types. (optional) _size: Size of the instance (object) structure (required for instantiatable types only) _preallocs: Prior to GLib 2.10, it specified the number of pre-allocated (cached) instances to reserve memory for (0 indicates no caching). Since GLib 2.10 this field is ignored. _init: Location of the instance initialization function (optional, for instantiatable types only) _table: A #GTypeValueTable function table for generic handling of GValues of this type (usually only useful for fundamental types)
*/
opaque type _GTypeInfo = CStruct10[_root_.sn.gnome.glib.internal.guint16, GBaseInitFunc, GBaseFinalizeFunc, GClassInitFunc, GClassFinalizeFunc, _root_.sn.gnome.glib.internal.gconstpointer, _root_.sn.gnome.glib.internal.guint16, _root_.sn.gnome.glib.internal.guint16, GInstanceInitFunc, Ptr[GTypeValueTable]]
object _GTypeInfo:
  given _tag: Tag[_GTypeInfo] = Tag.materializeCStruct10Tag[_root_.sn.gnome.glib.internal.guint16, GBaseInitFunc, GBaseFinalizeFunc, GClassInitFunc, GClassFinalizeFunc, _root_.sn.gnome.glib.internal.gconstpointer, _root_.sn.gnome.glib.internal.guint16, _root_.sn.gnome.glib.internal.guint16, GInstanceInitFunc, Ptr[GTypeValueTable]]
  def apply()(using Zone): Ptr[_GTypeInfo] = scala.scalanative.unsafe.alloc[_GTypeInfo](1)
  def apply(class_size : _root_.sn.gnome.glib.internal.guint16, base_init : GBaseInitFunc, base_finalize : GBaseFinalizeFunc, class_init : GClassInitFunc, class_finalize : GClassFinalizeFunc, class_data : _root_.sn.gnome.glib.internal.gconstpointer, instance_size : _root_.sn.gnome.glib.internal.guint16, n_preallocs : _root_.sn.gnome.glib.internal.guint16, instance_init : GInstanceInitFunc, value_table : Ptr[GTypeValueTable])(using Zone): Ptr[_GTypeInfo] = 
    val ____ptr = apply()
    (!____ptr).class_size = class_size
    (!____ptr).base_init = base_init
    (!____ptr).base_finalize = base_finalize
    (!____ptr).class_init = class_init
    (!____ptr).class_finalize = class_finalize
    (!____ptr).class_data = class_data
    (!____ptr).instance_size = instance_size
    (!____ptr).n_preallocs = n_preallocs
    (!____ptr).instance_init = instance_init
    (!____ptr).value_table = value_table
    ____ptr
  extension (struct: _GTypeInfo)
    def class_size : _root_.sn.gnome.glib.internal.guint16 = struct._1
    def class_size_=(value: _root_.sn.gnome.glib.internal.guint16): Unit = !struct.at1 = value
    def base_init : GBaseInitFunc = struct._2
    def base_init_=(value: GBaseInitFunc): Unit = !struct.at2 = value
    def base_finalize : GBaseFinalizeFunc = struct._3
    def base_finalize_=(value: GBaseFinalizeFunc): Unit = !struct.at3 = value
    def class_init : GClassInitFunc = struct._4
    def class_init_=(value: GClassInitFunc): Unit = !struct.at4 = value
    def class_finalize : GClassFinalizeFunc = struct._5
    def class_finalize_=(value: GClassFinalizeFunc): Unit = !struct.at5 = value
    def class_data : _root_.sn.gnome.glib.internal.gconstpointer = struct._6
    def class_data_=(value: _root_.sn.gnome.glib.internal.gconstpointer): Unit = !struct.at6 = value
    def instance_size : _root_.sn.gnome.glib.internal.guint16 = struct._7
    def instance_size_=(value: _root_.sn.gnome.glib.internal.guint16): Unit = !struct.at7 = value
    def n_preallocs : _root_.sn.gnome.glib.internal.guint16 = struct._8
    def n_preallocs_=(value: _root_.sn.gnome.glib.internal.guint16): Unit = !struct.at8 = value
    def instance_init : GInstanceInitFunc = struct._9
    def instance_init_=(value: GInstanceInitFunc): Unit = !struct.at9 = value
    def value_table : Ptr[GTypeValueTable] = struct._10
    def value_table_=(value: Ptr[GTypeValueTable]): Unit = !struct.at10 = value

/**
 * GTypeInstance:
*/
opaque type _GTypeInstance = CStruct1[Ptr[GTypeClass]]
object _GTypeInstance:
  given _tag: Tag[_GTypeInstance] = Tag.materializeCStruct1Tag[Ptr[GTypeClass]]
  def apply()(using Zone): Ptr[_GTypeInstance] = scala.scalanative.unsafe.alloc[_GTypeInstance](1)
  def apply(g_class : Ptr[GTypeClass])(using Zone): Ptr[_GTypeInstance] = 
    val ____ptr = apply()
    (!____ptr).g_class = g_class
    ____ptr
  extension (struct: _GTypeInstance)
    def g_class : Ptr[GTypeClass] = struct._1
    def g_class_=(value: Ptr[GTypeClass]): Unit = !struct.at1 = value

/**
 * GTypeInterface:
*/
opaque type _GTypeInterface = CStruct2[GType, GType]
object _GTypeInterface:
  given _tag: Tag[_GTypeInterface] = Tag.materializeCStruct2Tag[GType, GType]
  def apply()(using Zone): Ptr[_GTypeInterface] = scala.scalanative.unsafe.alloc[_GTypeInterface](1)
  def apply(g_type : GType, g_instance_type : GType)(using Zone): Ptr[_GTypeInterface] = 
    val ____ptr = apply()
    (!____ptr).g_type = g_type
    (!____ptr).g_instance_type = g_instance_type
    ____ptr
  extension (struct: _GTypeInterface)
    def g_type : GType = struct._1
    def g_type_=(value: GType): Unit = !struct.at1 = value
    def g_instance_type : GType = struct._2
    def g_instance_type_=(value: GType): Unit = !struct.at2 = value

opaque type _GTypeModule = CStruct5[GObject, _root_.sn.gnome.glib.internal.guint, Ptr[Byte], Ptr[Byte], Ptr[_root_.sn.gnome.glib.internal.gchar]]
object _GTypeModule:
  given _tag: Tag[_GTypeModule] = Tag.materializeCStruct5Tag[GObject, _root_.sn.gnome.glib.internal.guint, Ptr[Byte], Ptr[Byte], Ptr[_root_.sn.gnome.glib.internal.gchar]]
  def apply()(using Zone): Ptr[_GTypeModule] = scala.scalanative.unsafe.alloc[_GTypeModule](1)
  def apply(parent_instance : GObject, use_count : _root_.sn.gnome.glib.internal.guint, type_infos : Ptr[_root_.sn.gnome.glib.internal.GSList], interface_infos : Ptr[_root_.sn.gnome.glib.internal.GSList], name : Ptr[_root_.sn.gnome.glib.internal.gchar])(using Zone): Ptr[_GTypeModule] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).use_count = use_count
    (!____ptr).type_infos = type_infos
    (!____ptr).interface_infos = interface_infos
    (!____ptr).name = name
    ____ptr
  extension (struct: _GTypeModule)
    def parent_instance : GObject = struct._1
    def parent_instance_=(value: GObject): Unit = !struct.at1 = value
    def use_count : _root_.sn.gnome.glib.internal.guint = struct._2
    def use_count_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at2 = value
    def type_infos : Ptr[_root_.sn.gnome.glib.internal.GSList] = struct._3.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GSList]]
    def type_infos_=(value: Ptr[_root_.sn.gnome.glib.internal.GSList]): Unit = !struct.at3 = value.asInstanceOf[Ptr[Byte]]
    def interface_infos : Ptr[_root_.sn.gnome.glib.internal.GSList] = struct._4.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GSList]]
    def interface_infos_=(value: Ptr[_root_.sn.gnome.glib.internal.GSList]): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
    def name : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._5
    def name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at5 = value

/**
 * GTypeModuleClass: _class: the parent class : loads the module and registers one or more types using g_type_module_register_type(). : unloads the module
*/
opaque type _GTypeModuleClass = CStruct7[GObjectClass, CFuncPtr1[Ptr[Byte], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object _GTypeModuleClass:
  given _tag: Tag[_GTypeModuleClass] = Tag.materializeCStruct7Tag[GObjectClass, CFuncPtr1[Ptr[Byte], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[_GTypeModuleClass] = scala.scalanative.unsafe.alloc[_GTypeModuleClass](1)
  def apply(parent_class : GObjectClass, load : CFuncPtr1[Ptr[GTypeModule], _root_.sn.gnome.glib.internal.gboolean], unload : CFuncPtr1[Ptr[GTypeModule], Unit], reserved1 : CFuncPtr0[Unit], reserved2 : CFuncPtr0[Unit], reserved3 : CFuncPtr0[Unit], reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[_GTypeModuleClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).load = load
    (!____ptr).unload = unload
    (!____ptr).reserved1 = reserved1
    (!____ptr).reserved2 = reserved2
    (!____ptr).reserved3 = reserved3
    (!____ptr).reserved4 = reserved4
    ____ptr
  extension (struct: _GTypeModuleClass)
    def parent_class : GObjectClass = struct._1
    def parent_class_=(value: GObjectClass): Unit = !struct.at1 = value
    def load : CFuncPtr1[Ptr[GTypeModule], _root_.sn.gnome.glib.internal.gboolean] = struct._2.asInstanceOf[CFuncPtr1[Ptr[GTypeModule], _root_.sn.gnome.glib.internal.gboolean]]
    def load_=(value: CFuncPtr1[Ptr[GTypeModule], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at2 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], _root_.sn.gnome.glib.internal.gboolean]]
    def unload : CFuncPtr1[Ptr[GTypeModule], Unit] = struct._3.asInstanceOf[CFuncPtr1[Ptr[GTypeModule], Unit]]
    def unload_=(value: CFuncPtr1[Ptr[GTypeModule], Unit]): Unit = !struct.at3 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], Unit]]
    def reserved1 : CFuncPtr0[Unit] = struct._4
    def reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at4 = value
    def reserved2 : CFuncPtr0[Unit] = struct._5
    def reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at5 = value
    def reserved3 : CFuncPtr0[Unit] = struct._6
    def reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at6 = value
    def reserved4 : CFuncPtr0[Unit] = struct._7
    def reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at7 = value

opaque type _GTypePlugin = CStruct0
object _GTypePlugin:
  given _tag: Tag[_GTypePlugin] = Tag.materializeCStruct0Tag

/**
 * GTypePluginClass: _plugin: Increases the use count of the plugin. _plugin: Decreases the use count of the plugin. _type_info: Fills in the #GTypeInfo and #GTypeValueTable structs for the type. The structs are initialized with `memset(s, 0, sizeof (s))` before calling this function. _interface_info: Fills in missing parts of the #GInterfaceInfo for the interface. The structs is initialized with `memset(s, 0, sizeof (s))` before calling this function.
*/
opaque type _GTypePluginClass = CStruct5[GTypeInterface, GTypePluginUse, GTypePluginUnuse, GTypePluginCompleteTypeInfo, GTypePluginCompleteInterfaceInfo]
object _GTypePluginClass:
  given _tag: Tag[_GTypePluginClass] = Tag.materializeCStruct5Tag[GTypeInterface, GTypePluginUse, GTypePluginUnuse, GTypePluginCompleteTypeInfo, GTypePluginCompleteInterfaceInfo]
  def apply()(using Zone): Ptr[_GTypePluginClass] = scala.scalanative.unsafe.alloc[_GTypePluginClass](1)
  def apply(base_iface : GTypeInterface, use_plugin : GTypePluginUse, unuse_plugin : GTypePluginUnuse, complete_type_info : GTypePluginCompleteTypeInfo, complete_interface_info : GTypePluginCompleteInterfaceInfo)(using Zone): Ptr[_GTypePluginClass] = 
    val ____ptr = apply()
    (!____ptr).base_iface = base_iface
    (!____ptr).use_plugin = use_plugin
    (!____ptr).unuse_plugin = unuse_plugin
    (!____ptr).complete_type_info = complete_type_info
    (!____ptr).complete_interface_info = complete_interface_info
    ____ptr
  extension (struct: _GTypePluginClass)
    def base_iface : GTypeInterface = struct._1
    def base_iface_=(value: GTypeInterface): Unit = !struct.at1 = value
    def use_plugin : GTypePluginUse = struct._2
    def use_plugin_=(value: GTypePluginUse): Unit = !struct.at2 = value
    def unuse_plugin : GTypePluginUnuse = struct._3
    def unuse_plugin_=(value: GTypePluginUnuse): Unit = !struct.at3 = value
    def complete_type_info : GTypePluginCompleteTypeInfo = struct._4
    def complete_type_info_=(value: GTypePluginCompleteTypeInfo): Unit = !struct.at4 = value
    def complete_interface_info : GTypePluginCompleteInterfaceInfo = struct._5
    def complete_interface_info_=(value: GTypePluginCompleteInterfaceInfo): Unit = !struct.at5 = value

/**
 * GTypeQuery: : the #GType value of the type _name: the name of the type _size: the size of the instance structure
*/
opaque type _GTypeQuery = CStruct4[GType, Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
object _GTypeQuery:
  given _tag: Tag[_GTypeQuery] = Tag.materializeCStruct4Tag[GType, Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
  def apply()(using Zone): Ptr[_GTypeQuery] = scala.scalanative.unsafe.alloc[_GTypeQuery](1)
  def apply(`type` : GType, type_name : Ptr[_root_.sn.gnome.glib.internal.gchar], class_size : _root_.sn.gnome.glib.internal.guint, instance_size : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[_GTypeQuery] = 
    val ____ptr = apply()
    (!____ptr).`type` = `type`
    (!____ptr).type_name = type_name
    (!____ptr).class_size = class_size
    (!____ptr).instance_size = instance_size
    ____ptr
  extension (struct: _GTypeQuery)
    def `type` : GType = struct._1
    def type_=(value: GType): Unit = !struct.at1 = value
    def type_name : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
    def type_name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at2 = value
    def class_size : _root_.sn.gnome.glib.internal.guint = struct._3
    def class_size_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at3 = value
    def instance_size : _root_.sn.gnome.glib.internal.guint = struct._4
    def instance_size_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at4 = value

/**
 * GTypeValueTable: _init: Function to initialize a GValue _free: Function to free a GValue _copy: Function to copy a GValue _peek_pointer: Function to peek the contents of a GValue if they fit into a pointer _format: A string format describing how to collect the contents of this value bit-by-bit. Each character in the format represents an argument to be collected, and the characters themselves indicate the type of the argument. Currently supported arguments are: - `'i'`: Integers, passed as `collect_values[].v_int` - `'l'`: Longs, passed as `collect_values[].v_long` - `'d'`: Doubles, passed as `collect_values[].v_double` - `'p'`: Pointers, passed as `collect_values[].v_pointer` It should be noted that for variable argument list construction, ANSI C promotes every type smaller than an integer to an int, and floats to doubles. So for collection of short int or char, `'i'` needs to be used, and for collection of floats `'d'`. _value: Function to initialize a GValue from the values collected from variadic arguments _format: Format description of the arguments to collect for _value, analogous to _format. Usually, _format string consists only of `'p'`s to provide lcopy_value() with pointers to storage locations. _value: Function to store the contents of a value into the locations collected from variadic arguments
*/
opaque type _GTypeValueTable = CStruct8[GTypeValueInitFunc, GTypeValueFreeFunc, GTypeValueCopyFunc, GTypeValuePeekPointerFunc, Ptr[_root_.sn.gnome.glib.internal.gchar], GTypeValueCollectFunc, Ptr[_root_.sn.gnome.glib.internal.gchar], GTypeValueLCopyFunc]
object _GTypeValueTable:
  given _tag: Tag[_GTypeValueTable] = Tag.materializeCStruct8Tag[GTypeValueInitFunc, GTypeValueFreeFunc, GTypeValueCopyFunc, GTypeValuePeekPointerFunc, Ptr[_root_.sn.gnome.glib.internal.gchar], GTypeValueCollectFunc, Ptr[_root_.sn.gnome.glib.internal.gchar], GTypeValueLCopyFunc]
  def apply()(using Zone): Ptr[_GTypeValueTable] = scala.scalanative.unsafe.alloc[_GTypeValueTable](1)
  def apply(value_init : GTypeValueInitFunc, value_free : GTypeValueFreeFunc, value_copy : GTypeValueCopyFunc, value_peek_pointer : GTypeValuePeekPointerFunc, collect_format : Ptr[_root_.sn.gnome.glib.internal.gchar], collect_value : GTypeValueCollectFunc, lcopy_format : Ptr[_root_.sn.gnome.glib.internal.gchar], lcopy_value : GTypeValueLCopyFunc)(using Zone): Ptr[_GTypeValueTable] = 
    val ____ptr = apply()
    (!____ptr).value_init = value_init
    (!____ptr).value_free = value_free
    (!____ptr).value_copy = value_copy
    (!____ptr).value_peek_pointer = value_peek_pointer
    (!____ptr).collect_format = collect_format
    (!____ptr).collect_value = collect_value
    (!____ptr).lcopy_format = lcopy_format
    (!____ptr).lcopy_value = lcopy_value
    ____ptr
  extension (struct: _GTypeValueTable)
    def value_init : GTypeValueInitFunc = struct._1
    def value_init_=(value: GTypeValueInitFunc): Unit = !struct.at1 = value
    def value_free : GTypeValueFreeFunc = struct._2
    def value_free_=(value: GTypeValueFreeFunc): Unit = !struct.at2 = value
    def value_copy : GTypeValueCopyFunc = struct._3
    def value_copy_=(value: GTypeValueCopyFunc): Unit = !struct.at3 = value
    def value_peek_pointer : GTypeValuePeekPointerFunc = struct._4
    def value_peek_pointer_=(value: GTypeValuePeekPointerFunc): Unit = !struct.at4 = value
    def collect_format : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._5
    def collect_format_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at5 = value
    def collect_value : GTypeValueCollectFunc = struct._6
    def collect_value_=(value: GTypeValueCollectFunc): Unit = !struct.at6 = value
    def lcopy_format : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._7
    def lcopy_format_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at7 = value
    def lcopy_value : GTypeValueLCopyFunc = struct._8
    def lcopy_value_=(value: GTypeValueLCopyFunc): Unit = !struct.at8 = value

/**
 * GValue:
*/
opaque type _GValue = CStruct2[GType, CArray[_GValue.Union0, Nat._2]]
object _GValue:
  opaque type Union0 = CArray[Byte, Nat._8]
  object Union0:
    given _tag: Tag[Union0] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
    def apply()(using Zone): Ptr[Union0] = 
      val ___ptr = alloc[Union0](1)
      ___ptr
    @scala.annotation.targetName("apply_v_int")
    def apply(v_int: _root_.sn.gnome.glib.internal.gint)(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint]].update(0, v_int)
      ___ptr
    @scala.annotation.targetName("apply_v_uint")
    def apply(v_uint: _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint]].update(0, v_uint)
      ___ptr
    @scala.annotation.targetName("apply_v_long")
    def apply(v_long: _root_.sn.gnome.glib.internal.glong)(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.glong]].update(0, v_long)
      ___ptr
    @scala.annotation.targetName("apply_v_ulong")
    def apply(v_ulong: _root_.sn.gnome.glib.internal.gulong)(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gulong]].update(0, v_ulong)
      ___ptr
    @scala.annotation.targetName("apply_v_int64")
    def apply(v_int64: _root_.sn.gnome.glib.internal.gint64)(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint64]].update(0, v_int64)
      ___ptr
    @scala.annotation.targetName("apply_v_uint64")
    def apply(v_uint64: _root_.sn.gnome.glib.internal.guint64)(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint64]].update(0, v_uint64)
      ___ptr
    @scala.annotation.targetName("apply_v_float")
    def apply(v_float: _root_.sn.gnome.glib.internal.gfloat)(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gfloat]].update(0, v_float)
      ___ptr
    @scala.annotation.targetName("apply_v_double")
    def apply(v_double: _root_.sn.gnome.glib.internal.gdouble)(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gdouble]].update(0, v_double)
      ___ptr
    @scala.annotation.targetName("apply_v_pointer")
    def apply(v_pointer: _root_.sn.gnome.glib.internal.gpointer)(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]].update(0, v_pointer)
      ___ptr
    extension (struct: Union0)
      def v_int : _root_.sn.gnome.glib.internal.gint = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint]]
      def v_int_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint]] = value
      def v_uint : _root_.sn.gnome.glib.internal.guint = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint]]
      def v_uint_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint]] = value
      def v_long : _root_.sn.gnome.glib.internal.glong = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.glong]]
      def v_long_=(value: _root_.sn.gnome.glib.internal.glong): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.glong]] = value
      def v_ulong : _root_.sn.gnome.glib.internal.gulong = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gulong]]
      def v_ulong_=(value: _root_.sn.gnome.glib.internal.gulong): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gulong]] = value
      def v_int64 : _root_.sn.gnome.glib.internal.gint64 = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint64]]
      def v_int64_=(value: _root_.sn.gnome.glib.internal.gint64): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint64]] = value
      def v_uint64 : _root_.sn.gnome.glib.internal.guint64 = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint64]]
      def v_uint64_=(value: _root_.sn.gnome.glib.internal.guint64): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint64]] = value
      def v_float : _root_.sn.gnome.glib.internal.gfloat = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gfloat]]
      def v_float_=(value: _root_.sn.gnome.glib.internal.gfloat): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gfloat]] = value
      def v_double : _root_.sn.gnome.glib.internal.gdouble = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gdouble]]
      def v_double_=(value: _root_.sn.gnome.glib.internal.gdouble): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gdouble]] = value
      def v_pointer : _root_.sn.gnome.glib.internal.gpointer = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]]
      def v_pointer_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]] = value
  given _tag: Tag[_GValue] = Tag.materializeCStruct2Tag[GType, CArray[_GValue.Union0, Nat._2]]
  def apply()(using Zone): Ptr[_GValue] = scala.scalanative.unsafe.alloc[_GValue](1)
  def apply(g_type : GType, data : CArray[_GValue.Union0, Nat._2])(using Zone): Ptr[_GValue] = 
    val ____ptr = apply()
    (!____ptr).g_type = g_type
    (!____ptr).data = data
    ____ptr
  extension (struct: _GValue)
    def g_type : GType = struct._1
    def g_type_=(value: GType): Unit = !struct.at1 = value
    def data : CArray[_GValue.Union0, Nat._2] = struct._2
    def data_=(value: CArray[_GValue.Union0, Nat._2]): Unit = !struct.at2 = value

opaque type _GValueArray = CStruct3[_root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.guint]
object _GValueArray:
  given _tag: Tag[_GValueArray] = Tag.materializeCStruct3Tag[_root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.guint]
  def apply()(using Zone): Ptr[_GValueArray] = scala.scalanative.unsafe.alloc[_GValueArray](1)
  def apply(n_values : _root_.sn.gnome.glib.internal.guint, values : Ptr[GValue], n_prealloced : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[_GValueArray] = 
    val ____ptr = apply()
    (!____ptr).n_values = n_values
    (!____ptr).values = values
    (!____ptr).n_prealloced = n_prealloced
    ____ptr
  extension (struct: _GValueArray)
    def n_values : _root_.sn.gnome.glib.internal.guint = struct._1
    def n_values_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at1 = value
    def values : Ptr[GValue] = struct._2
    def values_=(value: Ptr[GValue]): Unit = !struct.at2 = value
    def n_prealloced : _root_.sn.gnome.glib.internal.guint = struct._3
    def n_prealloced_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at3 = value