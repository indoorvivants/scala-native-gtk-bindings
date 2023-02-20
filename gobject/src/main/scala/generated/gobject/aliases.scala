package gobject
package aliases

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

import _root_.gobject.enumerations.*
import _root_.gobject.aliases.*
import _root_.gobject.structs.*
import _root_.gobject.unions.*

/**
 * GBaseFinalizeFunc: _class: (type GObject.TypeClass): The #GTypeClass structure to finalize

 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
opaque type GBaseFinalizeFunc = CFuncPtr1[_root_.glib.all.gpointer, Unit]
object GBaseFinalizeFunc: 
  given _tag: Tag[GBaseFinalizeFunc] = Tag.materializeCFuncPtr1[_root_.glib.all.gpointer, Unit]
  inline def apply(inline o: CFuncPtr1[_root_.glib.all.gpointer, Unit]): GBaseFinalizeFunc = o
  extension (v: GBaseFinalizeFunc)
    inline def value: CFuncPtr1[_root_.glib.all.gpointer, Unit] = v

/**
 * GBaseInitFunc: _class: (type GObject.TypeClass): The #GTypeClass structure to initialize

 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
opaque type GBaseInitFunc = CFuncPtr1[_root_.glib.all.gpointer, Unit]
object GBaseInitFunc: 
  given _tag: Tag[GBaseInitFunc] = Tag.materializeCFuncPtr1[_root_.glib.all.gpointer, Unit]
  inline def apply(inline o: CFuncPtr1[_root_.glib.all.gpointer, Unit]): GBaseInitFunc = o
  extension (v: GBaseInitFunc)
    inline def value: CFuncPtr1[_root_.glib.all.gpointer, Unit] = v

/**
 * GBindingTransformFunc: : a #GBinding _value: the #GValue containing the value to transform _value: the #GValue in which to store the transformed value _data: data passed to the transform function

 * [bindgen] header: /usr/include/glib-2.0/gobject/gbinding.h
*/
opaque type GBindingTransformFunc = CFuncPtr4[Ptr[GBinding], Ptr[GValue], Ptr[GValue], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
object GBindingTransformFunc: 
  given _tag: Tag[GBindingTransformFunc] = Tag.materializeCFuncPtr4[Ptr[GBinding], Ptr[GValue], Ptr[GValue], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
  inline def apply(inline o: CFuncPtr4[Ptr[GBinding], Ptr[GValue], Ptr[GValue], _root_.glib.all.gpointer, _root_.glib.all.gboolean]): GBindingTransformFunc = o
  extension (v: GBindingTransformFunc)
    inline def value: CFuncPtr4[Ptr[GBinding], Ptr[GValue], Ptr[GValue], _root_.glib.all.gpointer, _root_.glib.all.gboolean] = v

/**
 * GBoxedCopyFunc: : (not nullable): The boxed structure to be copied.

 * [bindgen] header: /usr/include/glib-2.0/gobject/gboxed.h
*/
opaque type GBoxedCopyFunc = CFuncPtr1[_root_.glib.all.gpointer, _root_.glib.all.gpointer]
object GBoxedCopyFunc: 
  given _tag: Tag[GBoxedCopyFunc] = Tag.materializeCFuncPtr1[_root_.glib.all.gpointer, _root_.glib.all.gpointer]
  inline def apply(inline o: CFuncPtr1[_root_.glib.all.gpointer, _root_.glib.all.gpointer]): GBoxedCopyFunc = o
  extension (v: GBoxedCopyFunc)
    inline def value: CFuncPtr1[_root_.glib.all.gpointer, _root_.glib.all.gpointer] = v

/**
 * GBoxedFreeFunc: : (not nullable): The boxed structure to be freed.

 * [bindgen] header: /usr/include/glib-2.0/gobject/gboxed.h
*/
opaque type GBoxedFreeFunc = CFuncPtr1[_root_.glib.all.gpointer, Unit]
object GBoxedFreeFunc: 
  given _tag: Tag[GBoxedFreeFunc] = Tag.materializeCFuncPtr1[_root_.glib.all.gpointer, Unit]
  inline def apply(inline o: CFuncPtr1[_root_.glib.all.gpointer, Unit]): GBoxedFreeFunc = o
  extension (v: GBoxedFreeFunc)
    inline def value: CFuncPtr1[_root_.glib.all.gpointer, Unit] = v

/**
 * GCallback:

 * [bindgen] header: /usr/include/glib-2.0/gobject/gclosure.h
*/
opaque type GCallback = CFuncPtr0[Unit]
object GCallback: 
  given _tag: Tag[GCallback] = Tag.materializeCFuncPtr0[Unit]
  inline def apply(inline o: CFuncPtr0[Unit]): GCallback = o
  extension (v: GCallback)
    inline def value: CFuncPtr0[Unit] = v

/**
 * GClassFinalizeFunc: _class: (type GObject.TypeClass): The #GTypeClass structure to finalize

 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
opaque type GClassFinalizeFunc = CFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Unit]
object GClassFinalizeFunc: 
  given _tag: Tag[GClassFinalizeFunc] = Tag.materializeCFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Unit]
  inline def apply(inline o: CFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Unit]): GClassFinalizeFunc = o
  extension (v: GClassFinalizeFunc)
    inline def value: CFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Unit] = v

/**
 * GClassInitFunc: _class: (type GObject.TypeClass): The #GTypeClass structure to initialize.

 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
opaque type GClassInitFunc = CFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Unit]
object GClassInitFunc: 
  given _tag: Tag[GClassInitFunc] = Tag.materializeCFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Unit]
  inline def apply(inline o: CFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Unit]): GClassInitFunc = o
  extension (v: GClassInitFunc)
    inline def value: CFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Unit] = v

/**
 * GClosureMarshal: : the #GClosure to which the marshaller belongs

 * [bindgen] header: /usr/include/glib-2.0/gobject/gclosure.h
*/
opaque type GClosureMarshal = CFuncPtr6[Ptr[GClosure], Ptr[GValue], _root_.glib.all.guint, Ptr[GValue], _root_.glib.all.gpointer, _root_.glib.all.gpointer, Unit]
object GClosureMarshal: 
  given _tag: Tag[GClosureMarshal] = Tag.materializeCFuncPtr6[Ptr[GClosure], Ptr[GValue], _root_.glib.all.guint, Ptr[GValue], _root_.glib.all.gpointer, _root_.glib.all.gpointer, Unit]
  inline def apply(inline o: CFuncPtr6[Ptr[GClosure], Ptr[GValue], _root_.glib.all.guint, Ptr[GValue], _root_.glib.all.gpointer, _root_.glib.all.gpointer, Unit]): GClosureMarshal = o
  extension (v: GClosureMarshal)
    inline def value: CFuncPtr6[Ptr[GClosure], Ptr[GValue], _root_.glib.all.guint, Ptr[GValue], _root_.glib.all.gpointer, _root_.glib.all.gpointer, Unit] = v

/**
 * GClosureNotify:

 * [bindgen] header: /usr/include/glib-2.0/gobject/gclosure.h
*/
opaque type GClosureNotify = CFuncPtr2[_root_.glib.all.gpointer, Ptr[GClosure], Unit]
object GClosureNotify: 
  given _tag: Tag[GClosureNotify] = Tag.materializeCFuncPtr2[_root_.glib.all.gpointer, Ptr[GClosure], Unit]
  inline def apply(inline o: CFuncPtr2[_root_.glib.all.gpointer, Ptr[GClosure], Unit]): GClosureNotify = o
  extension (v: GClosureNotify)
    inline def value: CFuncPtr2[_root_.glib.all.gpointer, Ptr[GClosure], Unit] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
opaque type GClosure_autoptr = Ptr[GClosure]
object GClosure_autoptr: 
  given _tag: Tag[GClosure_autoptr] = Tag.Ptr[GClosure](GClosure._tag)
  inline def apply(inline o: Ptr[GClosure]): GClosure_autoptr = o
  extension (v: GClosure_autoptr)
    inline def value: Ptr[GClosure] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
opaque type GClosure_listautoptr = Ptr[_root_.glib.all.GList]
object GClosure_listautoptr: 
  given _tag: Tag[GClosure_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GClosure_listautoptr = o
  extension (v: GClosure_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
opaque type GClosure_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GClosure_queueautoptr: 
  given _tag: Tag[GClosure_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GClosure_queueautoptr = o
  extension (v: GClosure_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
opaque type GClosure_slistautoptr = Ptr[_root_.glib.all.GSList]
object GClosure_slistautoptr: 
  given _tag: Tag[GClosure_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GClosure_slistautoptr = o
  extension (v: GClosure_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
opaque type GEnumClass_autoptr = Ptr[GEnumClass]
object GEnumClass_autoptr: 
  given _tag: Tag[GEnumClass_autoptr] = Tag.Ptr[GEnumClass](GEnumClass._tag)
  inline def apply(inline o: Ptr[GEnumClass]): GEnumClass_autoptr = o
  extension (v: GEnumClass_autoptr)
    inline def value: Ptr[GEnumClass] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
opaque type GEnumClass_listautoptr = Ptr[_root_.glib.all.GList]
object GEnumClass_listautoptr: 
  given _tag: Tag[GEnumClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GEnumClass_listautoptr = o
  extension (v: GEnumClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
opaque type GEnumClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GEnumClass_queueautoptr: 
  given _tag: Tag[GEnumClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GEnumClass_queueautoptr = o
  extension (v: GEnumClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
opaque type GEnumClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GEnumClass_slistautoptr: 
  given _tag: Tag[GEnumClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GEnumClass_slistautoptr = o
  extension (v: GEnumClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
opaque type GFlagsClass_autoptr = Ptr[GFlagsClass]
object GFlagsClass_autoptr: 
  given _tag: Tag[GFlagsClass_autoptr] = Tag.Ptr[GFlagsClass](GFlagsClass._tag)
  inline def apply(inline o: Ptr[GFlagsClass]): GFlagsClass_autoptr = o
  extension (v: GFlagsClass_autoptr)
    inline def value: Ptr[GFlagsClass] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
opaque type GFlagsClass_listautoptr = Ptr[_root_.glib.all.GList]
object GFlagsClass_listautoptr: 
  given _tag: Tag[GFlagsClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GFlagsClass_listautoptr = o
  extension (v: GFlagsClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
opaque type GFlagsClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GFlagsClass_queueautoptr: 
  given _tag: Tag[GFlagsClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GFlagsClass_queueautoptr = o
  extension (v: GFlagsClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
opaque type GFlagsClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GFlagsClass_slistautoptr: 
  given _tag: Tag[GFlagsClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GFlagsClass_slistautoptr = o
  extension (v: GFlagsClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
opaque type GInitiallyUnowned_autoptr = Ptr[GInitiallyUnowned]
object GInitiallyUnowned_autoptr: 
  given _tag: Tag[GInitiallyUnowned_autoptr] = Tag.Ptr[GInitiallyUnowned](GInitiallyUnowned._tag)
  inline def apply(inline o: Ptr[GInitiallyUnowned]): GInitiallyUnowned_autoptr = o
  extension (v: GInitiallyUnowned_autoptr)
    inline def value: Ptr[GInitiallyUnowned] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
opaque type GInitiallyUnowned_listautoptr = Ptr[_root_.glib.all.GList]
object GInitiallyUnowned_listautoptr: 
  given _tag: Tag[GInitiallyUnowned_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GInitiallyUnowned_listautoptr = o
  extension (v: GInitiallyUnowned_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
opaque type GInitiallyUnowned_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GInitiallyUnowned_queueautoptr: 
  given _tag: Tag[GInitiallyUnowned_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GInitiallyUnowned_queueautoptr = o
  extension (v: GInitiallyUnowned_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
opaque type GInitiallyUnowned_slistautoptr = Ptr[_root_.glib.all.GSList]
object GInitiallyUnowned_slistautoptr: 
  given _tag: Tag[GInitiallyUnowned_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GInitiallyUnowned_slistautoptr = o
  extension (v: GInitiallyUnowned_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GInstanceInitFunc: : The instance to initialize _class: (type GObject.TypeClass): The class of the type the instance is created for

 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
opaque type GInstanceInitFunc = CFuncPtr2[Ptr[GTypeInstance], _root_.glib.all.gpointer, Unit]
object GInstanceInitFunc: 
  given _tag: Tag[GInstanceInitFunc] = Tag.materializeCFuncPtr2[Ptr[GTypeInstance], _root_.glib.all.gpointer, Unit]
  inline def apply(inline o: CFuncPtr2[Ptr[GTypeInstance], _root_.glib.all.gpointer, Unit]): GInstanceInitFunc = o
  extension (v: GInstanceInitFunc)
    inline def value: CFuncPtr2[Ptr[GTypeInstance], _root_.glib.all.gpointer, Unit] = v

/**
 * GInterfaceFinalizeFunc: _iface: (type GObject.TypeInterface): The interface structure to finalize _data: The

 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
opaque type GInterfaceFinalizeFunc = CFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Unit]
object GInterfaceFinalizeFunc: 
  given _tag: Tag[GInterfaceFinalizeFunc] = Tag.materializeCFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Unit]
  inline def apply(inline o: CFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Unit]): GInterfaceFinalizeFunc = o
  extension (v: GInterfaceFinalizeFunc)
    inline def value: CFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Unit] = v

/**
 * GInterfaceInitFunc: _iface: (type GObject.TypeInterface): The interface structure to initialize _data: The

 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
opaque type GInterfaceInitFunc = CFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Unit]
object GInterfaceInitFunc: 
  given _tag: Tag[GInterfaceInitFunc] = Tag.materializeCFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Unit]
  inline def apply(inline o: CFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Unit]): GInterfaceInitFunc = o
  extension (v: GInterfaceInitFunc)
    inline def value: CFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Unit] = v

/**
 * GObjectFinalizeFunc: : the #GObject being finalized

 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
opaque type GObjectFinalizeFunc = CFuncPtr1[Ptr[GObject], Unit]
object GObjectFinalizeFunc: 
  given _tag: Tag[GObjectFinalizeFunc] = Tag.materializeCFuncPtr1[Ptr[GObject], Unit]
  inline def apply(inline o: CFuncPtr1[Ptr[GObject], Unit]): GObjectFinalizeFunc = o
  extension (v: GObjectFinalizeFunc)
    inline def value: CFuncPtr1[Ptr[GObject], Unit] = v

/**
 * GObjectGetPropertyFunc: : a #GObject g_object_class_install_property(). : a #GValue to return the property value in : the #GParamSpec describing the property

 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
opaque type GObjectGetPropertyFunc = CFuncPtr4[Ptr[GObject], _root_.glib.all.guint, Ptr[GValue], Ptr[GParamSpec], Unit]
object GObjectGetPropertyFunc: 
  given _tag: Tag[GObjectGetPropertyFunc] = Tag.materializeCFuncPtr4[Ptr[GObject], _root_.glib.all.guint, Ptr[GValue], Ptr[GParamSpec], Unit]
  inline def apply(inline o: CFuncPtr4[Ptr[GObject], _root_.glib.all.guint, Ptr[GValue], Ptr[GParamSpec], Unit]): GObjectGetPropertyFunc = o
  extension (v: GObjectGetPropertyFunc)
    inline def value: CFuncPtr4[Ptr[GObject], _root_.glib.all.guint, Ptr[GValue], Ptr[GParamSpec], Unit] = v

/**
 * GObjectSetPropertyFunc: : a #GObject g_object_class_install_property(). : the new value for the property : the #GParamSpec describing the property

 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
opaque type GObjectSetPropertyFunc = CFuncPtr4[Ptr[GObject], _root_.glib.all.guint, Ptr[GValue], Ptr[GParamSpec], Unit]
object GObjectSetPropertyFunc: 
  given _tag: Tag[GObjectSetPropertyFunc] = Tag.materializeCFuncPtr4[Ptr[GObject], _root_.glib.all.guint, Ptr[GValue], Ptr[GParamSpec], Unit]
  inline def apply(inline o: CFuncPtr4[Ptr[GObject], _root_.glib.all.guint, Ptr[GValue], Ptr[GParamSpec], Unit]): GObjectSetPropertyFunc = o
  extension (v: GObjectSetPropertyFunc)
    inline def value: CFuncPtr4[Ptr[GObject], _root_.glib.all.guint, Ptr[GValue], Ptr[GParamSpec], Unit] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
opaque type GObject_autoptr = Ptr[GObject]
object GObject_autoptr: 
  given _tag: Tag[GObject_autoptr] = Tag.Ptr[GObject](GObject._tag)
  inline def apply(inline o: Ptr[GObject]): GObject_autoptr = o
  extension (v: GObject_autoptr)
    inline def value: Ptr[GObject] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
opaque type GObject_listautoptr = Ptr[_root_.glib.all.GList]
object GObject_listautoptr: 
  given _tag: Tag[GObject_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GObject_listautoptr = o
  extension (v: GObject_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
opaque type GObject_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GObject_queueautoptr: 
  given _tag: Tag[GObject_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GObject_queueautoptr = o
  extension (v: GObject_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
opaque type GObject_slistautoptr = Ptr[_root_.glib.all.GSList]
object GObject_slistautoptr: 
  given _tag: Tag[GObject_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GObject_slistautoptr = o
  extension (v: GObject_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
opaque type GParamSpec_autoptr = Ptr[GParamSpec]
object GParamSpec_autoptr: 
  given _tag: Tag[GParamSpec_autoptr] = Tag.Ptr[GParamSpec](GParamSpec._tag)
  inline def apply(inline o: Ptr[GParamSpec]): GParamSpec_autoptr = o
  extension (v: GParamSpec_autoptr)
    inline def value: Ptr[GParamSpec] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
opaque type GParamSpec_listautoptr = Ptr[_root_.glib.all.GList]
object GParamSpec_listautoptr: 
  given _tag: Tag[GParamSpec_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GParamSpec_listautoptr = o
  extension (v: GParamSpec_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
opaque type GParamSpec_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GParamSpec_queueautoptr: 
  given _tag: Tag[GParamSpec_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GParamSpec_queueautoptr = o
  extension (v: GParamSpec_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
opaque type GParamSpec_slistautoptr = Ptr[_root_.glib.all.GSList]
object GParamSpec_slistautoptr: 
  given _tag: Tag[GParamSpec_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GParamSpec_slistautoptr = o
  extension (v: GParamSpec_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GSignalAccumulator: : Signal invocation hint, see #GSignalInvocationHint.

 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
opaque type GSignalAccumulator = CFuncPtr4[Ptr[GSignalInvocationHint], Ptr[GValue], Ptr[GValue], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
object GSignalAccumulator: 
  given _tag: Tag[GSignalAccumulator] = Tag.materializeCFuncPtr4[Ptr[GSignalInvocationHint], Ptr[GValue], Ptr[GValue], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
  inline def apply(inline o: CFuncPtr4[Ptr[GSignalInvocationHint], Ptr[GValue], Ptr[GValue], _root_.glib.all.gpointer, _root_.glib.all.gboolean]): GSignalAccumulator = o
  extension (v: GSignalAccumulator)
    inline def value: CFuncPtr4[Ptr[GSignalInvocationHint], Ptr[GValue], Ptr[GValue], _root_.glib.all.gpointer, _root_.glib.all.gboolean] = v

/**
 * GSignalCMarshaller:

 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
type GSignalCMarshaller = GClosureMarshal
object GSignalCMarshaller: 
  given _tag: Tag[GSignalCMarshaller] = GClosureMarshal._tag
  inline def apply(inline o: GClosureMarshal): GSignalCMarshaller = o
  extension (v: GSignalCMarshaller)
    inline def value: GClosureMarshal = v

/**
 * GSignalCVaMarshaller:

 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
type GSignalCVaMarshaller = GVaClosureMarshal
object GSignalCVaMarshaller: 
  given _tag: Tag[GSignalCVaMarshaller] = GVaClosureMarshal._tag
  inline def apply(inline o: GVaClosureMarshal): GSignalCVaMarshaller = o
  extension (v: GSignalCVaMarshaller)
    inline def value: GVaClosureMarshal = v

/**
 * GSignalEmissionHook: : Signal invocation hint, see #GSignalInvocationHint. _param_values: the number of parameters to the function, including the instance on which the signal was emitted.

 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
opaque type GSignalEmissionHook = CFuncPtr4[Ptr[GSignalInvocationHint], _root_.glib.all.guint, Ptr[GValue], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
object GSignalEmissionHook: 
  given _tag: Tag[GSignalEmissionHook] = Tag.materializeCFuncPtr4[Ptr[GSignalInvocationHint], _root_.glib.all.guint, Ptr[GValue], _root_.glib.all.gpointer, _root_.glib.all.gboolean]
  inline def apply(inline o: CFuncPtr4[Ptr[GSignalInvocationHint], _root_.glib.all.guint, Ptr[GValue], _root_.glib.all.gpointer, _root_.glib.all.gboolean]): GSignalEmissionHook = o
  extension (v: GSignalEmissionHook)
    inline def value: CFuncPtr4[Ptr[GSignalInvocationHint], _root_.glib.all.guint, Ptr[GValue], _root_.glib.all.gpointer, _root_.glib.all.gboolean] = v

/**
 * GToggleNotify:

 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
opaque type GToggleNotify = CFuncPtr3[_root_.glib.all.gpointer, Ptr[GObject], _root_.glib.all.gboolean, Unit]
object GToggleNotify: 
  given _tag: Tag[GToggleNotify] = Tag.materializeCFuncPtr3[_root_.glib.all.gpointer, Ptr[GObject], _root_.glib.all.gboolean, Unit]
  inline def apply(inline o: CFuncPtr3[_root_.glib.all.gpointer, Ptr[GObject], _root_.glib.all.gboolean, Unit]): GToggleNotify = o
  extension (v: GToggleNotify)
    inline def value: CFuncPtr3[_root_.glib.all.gpointer, Ptr[GObject], _root_.glib.all.gboolean, Unit] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
type GType = _root_.glib.all.gsize
object GType: 
  given _tag: Tag[GType] = _root_.glib.all.gsize._tag
  inline def apply(inline o: _root_.glib.all.gsize): GType = o
  extension (v: GType)
    inline def value: _root_.glib.all.gsize = v

/**
 * GTypeClassCacheFunc: _data: data that was given to the g_type_add_class_cache_func() call _class: (type GObject.TypeClass): The #GTypeClass structure which is unreferenced

 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
opaque type GTypeClassCacheFunc = CFuncPtr2[_root_.glib.all.gpointer, Ptr[GTypeClass], _root_.glib.all.gboolean]
object GTypeClassCacheFunc: 
  given _tag: Tag[GTypeClassCacheFunc] = Tag.materializeCFuncPtr2[_root_.glib.all.gpointer, Ptr[GTypeClass], _root_.glib.all.gboolean]
  inline def apply(inline o: CFuncPtr2[_root_.glib.all.gpointer, Ptr[GTypeClass], _root_.glib.all.gboolean]): GTypeClassCacheFunc = o
  extension (v: GTypeClassCacheFunc)
    inline def value: CFuncPtr2[_root_.glib.all.gpointer, Ptr[GTypeClass], _root_.glib.all.gboolean] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
opaque type GTypeClass_autoptr = Ptr[GTypeClass]
object GTypeClass_autoptr: 
  given _tag: Tag[GTypeClass_autoptr] = Tag.Ptr[GTypeClass](GTypeClass._tag)
  inline def apply(inline o: Ptr[GTypeClass]): GTypeClass_autoptr = o
  extension (v: GTypeClass_autoptr)
    inline def value: Ptr[GTypeClass] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
opaque type GTypeClass_listautoptr = Ptr[_root_.glib.all.GList]
object GTypeClass_listautoptr: 
  given _tag: Tag[GTypeClass_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GTypeClass_listautoptr = o
  extension (v: GTypeClass_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
opaque type GTypeClass_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GTypeClass_queueautoptr: 
  given _tag: Tag[GTypeClass_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GTypeClass_queueautoptr = o
  extension (v: GTypeClass_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
opaque type GTypeClass_slistautoptr = Ptr[_root_.glib.all.GSList]
object GTypeClass_slistautoptr: 
  given _tag: Tag[GTypeClass_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GTypeClass_slistautoptr = o
  extension (v: GTypeClass_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GTypeInterfaceCheckFunc: _data: data passed to g_type_add_interface_check() _iface: (type GObject.TypeInterface): the interface that has been initialized

 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
opaque type GTypeInterfaceCheckFunc = CFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Unit]
object GTypeInterfaceCheckFunc: 
  given _tag: Tag[GTypeInterfaceCheckFunc] = Tag.materializeCFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Unit]
  inline def apply(inline o: CFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Unit]): GTypeInterfaceCheckFunc = o
  extension (v: GTypeInterfaceCheckFunc)
    inline def value: CFuncPtr2[_root_.glib.all.gpointer, _root_.glib.all.gpointer, Unit] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtypemodule.h
*/
opaque type GTypeModule_autoptr = Ptr[GTypeModule]
object GTypeModule_autoptr: 
  given _tag: Tag[GTypeModule_autoptr] = Tag.Ptr[GTypeModule](GTypeModule._tag)
  inline def apply(inline o: Ptr[GTypeModule]): GTypeModule_autoptr = o
  extension (v: GTypeModule_autoptr)
    inline def value: Ptr[GTypeModule] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtypemodule.h
*/
opaque type GTypeModule_listautoptr = Ptr[_root_.glib.all.GList]
object GTypeModule_listautoptr: 
  given _tag: Tag[GTypeModule_listautoptr] = Tag.Ptr[_root_.glib.all.GList](_root_.glib.all.GList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GList]): GTypeModule_listautoptr = o
  extension (v: GTypeModule_listautoptr)
    inline def value: Ptr[_root_.glib.all.GList] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtypemodule.h
*/
opaque type GTypeModule_queueautoptr = Ptr[_root_.glib.all.GQueue]
object GTypeModule_queueautoptr: 
  given _tag: Tag[GTypeModule_queueautoptr] = Tag.Ptr[_root_.glib.all.GQueue](_root_.glib.all.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GQueue]): GTypeModule_queueautoptr = o
  extension (v: GTypeModule_queueautoptr)
    inline def value: Ptr[_root_.glib.all.GQueue] = v

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtypemodule.h
*/
opaque type GTypeModule_slistautoptr = Ptr[_root_.glib.all.GSList]
object GTypeModule_slistautoptr: 
  given _tag: Tag[GTypeModule_slistautoptr] = Tag.Ptr[_root_.glib.all.GSList](_root_.glib.all.GSList._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.GSList]): GTypeModule_slistautoptr = o
  extension (v: GTypeModule_slistautoptr)
    inline def value: Ptr[_root_.glib.all.GSList] = v

/**
 * GTypePluginCompleteInterfaceInfo: : the #GTypePlugin _type: the #GType of an instantiatable type to which the interface is added : the #GInterfaceInfo to fill in

 * [bindgen] header: /usr/include/glib-2.0/gobject/gtypeplugin.h
*/
opaque type GTypePluginCompleteInterfaceInfo = CFuncPtr4[Ptr[GTypePlugin], GType, GType, Ptr[GInterfaceInfo], Unit]
object GTypePluginCompleteInterfaceInfo: 
  given _tag: Tag[GTypePluginCompleteInterfaceInfo] = Tag.materializeCFuncPtr4[Ptr[GTypePlugin], GType, GType, Ptr[GInterfaceInfo], Unit]
  inline def apply(inline o: CFuncPtr4[Ptr[GTypePlugin], GType, GType, Ptr[GInterfaceInfo], Unit]): GTypePluginCompleteInterfaceInfo = o
  extension (v: GTypePluginCompleteInterfaceInfo)
    inline def value: CFuncPtr4[Ptr[GTypePlugin], GType, GType, Ptr[GInterfaceInfo], Unit] = v

/**
 * GTypePluginCompleteTypeInfo: : the #GTypePlugin _type: the #GType whose info is completed : the #GTypeInfo struct to fill in _table: the #GTypeValueTable to fill in

 * [bindgen] header: /usr/include/glib-2.0/gobject/gtypeplugin.h
*/
opaque type GTypePluginCompleteTypeInfo = CFuncPtr4[Ptr[GTypePlugin], GType, Ptr[GTypeInfo], Ptr[GTypeValueTable], Unit]
object GTypePluginCompleteTypeInfo: 
  given _tag: Tag[GTypePluginCompleteTypeInfo] = Tag.materializeCFuncPtr4[Ptr[GTypePlugin], GType, Ptr[GTypeInfo], Ptr[GTypeValueTable], Unit]
  inline def apply(inline o: CFuncPtr4[Ptr[GTypePlugin], GType, Ptr[GTypeInfo], Ptr[GTypeValueTable], Unit]): GTypePluginCompleteTypeInfo = o
  extension (v: GTypePluginCompleteTypeInfo)
    inline def value: CFuncPtr4[Ptr[GTypePlugin], GType, Ptr[GTypeInfo], Ptr[GTypeValueTable], Unit] = v

/**
 * GTypePluginUnuse: : the #GTypePlugin whose use count should be decreased

 * [bindgen] header: /usr/include/glib-2.0/gobject/gtypeplugin.h
*/
opaque type GTypePluginUnuse = CFuncPtr1[Ptr[GTypePlugin], Unit]
object GTypePluginUnuse: 
  given _tag: Tag[GTypePluginUnuse] = Tag.materializeCFuncPtr1[Ptr[GTypePlugin], Unit]
  inline def apply(inline o: CFuncPtr1[Ptr[GTypePlugin], Unit]): GTypePluginUnuse = o
  extension (v: GTypePluginUnuse)
    inline def value: CFuncPtr1[Ptr[GTypePlugin], Unit] = v

/**
 * GTypePluginUse: : the #GTypePlugin whose use count should be increased

 * [bindgen] header: /usr/include/glib-2.0/gobject/gtypeplugin.h
*/
opaque type GTypePluginUse = CFuncPtr1[Ptr[GTypePlugin], Unit]
object GTypePluginUse: 
  given _tag: Tag[GTypePluginUse] = Tag.materializeCFuncPtr1[Ptr[GTypePlugin], Unit]
  inline def apply(inline o: CFuncPtr1[Ptr[GTypePlugin], Unit]): GTypePluginUse = o
  extension (v: GTypePluginUse)
    inline def value: CFuncPtr1[Ptr[GTypePlugin], Unit] = v

/**
 * GVaClosureMarshal: : the #GClosure to which the marshaller belongs

 * [bindgen] header: /usr/include/glib-2.0/gobject/gclosure.h
*/
opaque type GVaClosureMarshal = CFuncPtr7[Ptr[GClosure], Ptr[GValue], _root_.glib.all.gpointer, va_list, _root_.glib.all.gpointer, CInt, Ptr[GType], Unit]
object GVaClosureMarshal: 
  given _tag: Tag[GVaClosureMarshal] = Tag.materializeCFuncPtr7[Ptr[GClosure], Ptr[GValue], _root_.glib.all.gpointer, va_list, _root_.glib.all.gpointer, CInt, Ptr[GType], Unit]
  inline def apply(inline o: CFuncPtr7[Ptr[GClosure], Ptr[GValue], _root_.glib.all.gpointer, va_list, _root_.glib.all.gpointer, CInt, Ptr[GType], Unit]): GVaClosureMarshal = o
  extension (v: GVaClosureMarshal)
    inline def value: CFuncPtr7[Ptr[GClosure], Ptr[GValue], _root_.glib.all.gpointer, va_list, _root_.glib.all.gpointer, CInt, Ptr[GType], Unit] = v

/**
 * GValueTransform: _value: Source value.

 * [bindgen] header: /usr/include/glib-2.0/gobject/gvalue.h
*/
opaque type GValueTransform = CFuncPtr2[Ptr[GValue], Ptr[GValue], Unit]
object GValueTransform: 
  given _tag: Tag[GValueTransform] = Tag.materializeCFuncPtr2[Ptr[GValue], Ptr[GValue], Unit]
  inline def apply(inline o: CFuncPtr2[Ptr[GValue], Ptr[GValue], Unit]): GValueTransform = o
  extension (v: GValueTransform)
    inline def value: CFuncPtr2[Ptr[GValue], Ptr[GValue], Unit] = v

/**
 * GWeakNotify:

 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
opaque type GWeakNotify = CFuncPtr2[_root_.glib.all.gpointer, Ptr[GObject], Unit]
object GWeakNotify: 
  given _tag: Tag[GWeakNotify] = Tag.materializeCFuncPtr2[_root_.glib.all.gpointer, Ptr[GObject], Unit]
  inline def apply(inline o: CFuncPtr2[_root_.glib.all.gpointer, Ptr[GObject], Unit]): GWeakNotify = o
  extension (v: GWeakNotify)
    inline def value: CFuncPtr2[_root_.glib.all.gpointer, Ptr[GObject], Unit] = v

/**
 * gchararray:

 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
opaque type gchararray = Ptr[_root_.glib.all.gchar]
object gchararray: 
  given _tag: Tag[gchararray] = Tag.Ptr[_root_.glib.all.gchar](_root_.glib.all.gchar._tag)
  inline def apply(inline o: Ptr[_root_.glib.all.gchar]): gchararray = o
  extension (v: gchararray)
    inline def value: Ptr[_root_.glib.all.gchar] = v

type pthread_mutex_t = posix.sys.types.pthread_mutex_t
object pthread_mutex_t: 
  val _tag: Tag[pthread_mutex_t] = summon[Tag[posix.sys.types.pthread_mutex_t]]
  inline def apply(inline o: posix.sys.types.pthread_mutex_t): pthread_mutex_t = o
  extension (v: pthread_mutex_t)
    inline def value: posix.sys.types.pthread_mutex_t = v

type pthread_t = posix.sys.types.pthread_t
object pthread_t: 
  val _tag: Tag[pthread_t] = summon[Tag[posix.sys.types.pthread_t]]
  inline def apply(inline o: posix.sys.types.pthread_t): pthread_t = o
  extension (v: pthread_t)
    inline def value: posix.sys.types.pthread_t = v

type time_t = posix.sys.types.time_t
object time_t: 
  val _tag: Tag[time_t] = summon[Tag[posix.sys.types.time_t]]
  inline def apply(inline o: posix.sys.types.time_t): time_t = o
  extension (v: time_t)
    inline def value: posix.sys.types.time_t = v

type tm = posix.time.tm
object tm: 
  val _tag: Tag[tm] = summon[Tag[posix.time.tm]]
  inline def apply(inline o: posix.time.tm): tm = o
  extension (v: tm)
    inline def value: posix.time.tm = v

type va_list = unsafe.CVarArgList
object va_list: 
  val _tag: Tag[va_list] = summon[Tag[unsafe.CVarArgList]]
  inline def apply(inline o: unsafe.CVarArgList): va_list = o
  extension (v: va_list)
    inline def value: unsafe.CVarArgList = v

