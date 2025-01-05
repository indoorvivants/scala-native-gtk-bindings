package sn.gnome.gtk4.internal

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

type GdkRectangle = _root_.sn.gnome.cairo.internal.cairo_rectangle_int_t
object GdkRectangle: 
  given _tag: Tag[GdkRectangle] = _root_.sn.gnome.cairo.internal.cairo_rectangle_int_t._tag
  inline def apply(inline o: _root_.sn.gnome.cairo.internal.cairo_rectangle_int_t): GdkRectangle = o
  extension (v: GdkRectangle)
    inline def value: _root_.sn.gnome.cairo.internal.cairo_rectangle_int_t = v

opaque type GtkATContextClass_autoptr = Ptr[GtkATContextClass]
object GtkATContextClass_autoptr: 
  given _tag: Tag[GtkATContextClass_autoptr] = Tag.Ptr[GtkATContextClass](GtkATContextClass._tag)
  inline def apply(inline o: Ptr[GtkATContextClass]): GtkATContextClass_autoptr = o
  extension (v: GtkATContextClass_autoptr)
    inline def value: Ptr[GtkATContextClass] = v

opaque type GtkATContextClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkATContextClass_listautoptr: 
  given _tag: Tag[GtkATContextClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkATContextClass_listautoptr = o
  extension (v: GtkATContextClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkATContextClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkATContextClass_queueautoptr: 
  given _tag: Tag[GtkATContextClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkATContextClass_queueautoptr = o
  extension (v: GtkATContextClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkATContextClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkATContextClass_slistautoptr: 
  given _tag: Tag[GtkATContextClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkATContextClass_slistautoptr = o
  extension (v: GtkATContextClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkATContext_autoptr = Ptr[GtkATContext]
object GtkATContext_autoptr: 
  given _tag: Tag[GtkATContext_autoptr] = Tag.Ptr[GtkATContext](GtkATContext._tag)
  inline def apply(inline o: Ptr[GtkATContext]): GtkATContext_autoptr = o
  extension (v: GtkATContext_autoptr)
    inline def value: Ptr[GtkATContext] = v

opaque type GtkATContext_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkATContext_listautoptr: 
  given _tag: Tag[GtkATContext_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkATContext_listautoptr = o
  extension (v: GtkATContext_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkATContext_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkATContext_queueautoptr: 
  given _tag: Tag[GtkATContext_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkATContext_queueautoptr = o
  extension (v: GtkATContext_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkATContext_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkATContext_slistautoptr: 
  given _tag: Tag[GtkATContext_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkATContext_slistautoptr = o
  extension (v: GtkATContext_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkAboutDialog_autoptr = Ptr[GtkAboutDialog]
object GtkAboutDialog_autoptr: 
  given _tag: Tag[GtkAboutDialog_autoptr] = Tag.Ptr[GtkAboutDialog](GtkAboutDialog._tag)
  inline def apply(inline o: Ptr[GtkAboutDialog]): GtkAboutDialog_autoptr = o
  extension (v: GtkAboutDialog_autoptr)
    inline def value: Ptr[GtkAboutDialog] = v

opaque type GtkAboutDialog_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkAboutDialog_listautoptr: 
  given _tag: Tag[GtkAboutDialog_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkAboutDialog_listautoptr = o
  extension (v: GtkAboutDialog_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkAboutDialog_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkAboutDialog_queueautoptr: 
  given _tag: Tag[GtkAboutDialog_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkAboutDialog_queueautoptr = o
  extension (v: GtkAboutDialog_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkAboutDialog_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkAboutDialog_slistautoptr: 
  given _tag: Tag[GtkAboutDialog_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkAboutDialog_slistautoptr = o
  extension (v: GtkAboutDialog_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkAccessibleRange_autoptr = Ptr[GtkAccessibleRange]
object GtkAccessibleRange_autoptr: 
  given _tag: Tag[GtkAccessibleRange_autoptr] = Tag.Ptr[GtkAccessibleRange](GtkAccessibleRange._tag)
  inline def apply(inline o: Ptr[GtkAccessibleRange]): GtkAccessibleRange_autoptr = o
  extension (v: GtkAccessibleRange_autoptr)
    inline def value: Ptr[GtkAccessibleRange] = v

opaque type GtkAccessibleRange_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkAccessibleRange_listautoptr: 
  given _tag: Tag[GtkAccessibleRange_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkAccessibleRange_listautoptr = o
  extension (v: GtkAccessibleRange_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkAccessibleRange_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkAccessibleRange_queueautoptr: 
  given _tag: Tag[GtkAccessibleRange_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkAccessibleRange_queueautoptr = o
  extension (v: GtkAccessibleRange_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkAccessibleRange_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkAccessibleRange_slistautoptr: 
  given _tag: Tag[GtkAccessibleRange_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkAccessibleRange_slistautoptr = o
  extension (v: GtkAccessibleRange_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkAccessibleText_autoptr = Ptr[GtkAccessibleText]
object GtkAccessibleText_autoptr: 
  given _tag: Tag[GtkAccessibleText_autoptr] = Tag.Ptr[GtkAccessibleText](GtkAccessibleText._tag)
  inline def apply(inline o: Ptr[GtkAccessibleText]): GtkAccessibleText_autoptr = o
  extension (v: GtkAccessibleText_autoptr)
    inline def value: Ptr[GtkAccessibleText] = v

opaque type GtkAccessibleText_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkAccessibleText_listautoptr: 
  given _tag: Tag[GtkAccessibleText_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkAccessibleText_listautoptr = o
  extension (v: GtkAccessibleText_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkAccessibleText_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkAccessibleText_queueautoptr: 
  given _tag: Tag[GtkAccessibleText_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkAccessibleText_queueautoptr = o
  extension (v: GtkAccessibleText_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkAccessibleText_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkAccessibleText_slistautoptr: 
  given _tag: Tag[GtkAccessibleText_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkAccessibleText_slistautoptr = o
  extension (v: GtkAccessibleText_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkAccessible_autoptr = Ptr[GtkAccessible]
object GtkAccessible_autoptr: 
  given _tag: Tag[GtkAccessible_autoptr] = Tag.Ptr[GtkAccessible](GtkAccessible._tag)
  inline def apply(inline o: Ptr[GtkAccessible]): GtkAccessible_autoptr = o
  extension (v: GtkAccessible_autoptr)
    inline def value: Ptr[GtkAccessible] = v

opaque type GtkAccessible_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkAccessible_listautoptr: 
  given _tag: Tag[GtkAccessible_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkAccessible_listautoptr = o
  extension (v: GtkAccessible_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkAccessible_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkAccessible_queueautoptr: 
  given _tag: Tag[GtkAccessible_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkAccessible_queueautoptr = o
  extension (v: GtkAccessible_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkAccessible_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkAccessible_slistautoptr: 
  given _tag: Tag[GtkAccessible_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkAccessible_slistautoptr = o
  extension (v: GtkAccessible_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkActionBar_autoptr = Ptr[GtkActionBar]
object GtkActionBar_autoptr: 
  given _tag: Tag[GtkActionBar_autoptr] = Tag.Ptr[GtkActionBar](GtkActionBar._tag)
  inline def apply(inline o: Ptr[GtkActionBar]): GtkActionBar_autoptr = o
  extension (v: GtkActionBar_autoptr)
    inline def value: Ptr[GtkActionBar] = v

opaque type GtkActionBar_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkActionBar_listautoptr: 
  given _tag: Tag[GtkActionBar_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkActionBar_listautoptr = o
  extension (v: GtkActionBar_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkActionBar_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkActionBar_queueautoptr: 
  given _tag: Tag[GtkActionBar_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkActionBar_queueautoptr = o
  extension (v: GtkActionBar_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkActionBar_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkActionBar_slistautoptr: 
  given _tag: Tag[GtkActionBar_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkActionBar_slistautoptr = o
  extension (v: GtkActionBar_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkActionable_autoptr = Ptr[GtkActionable]
object GtkActionable_autoptr: 
  given _tag: Tag[GtkActionable_autoptr] = Tag.Ptr[GtkActionable](GtkActionable._tag)
  inline def apply(inline o: Ptr[GtkActionable]): GtkActionable_autoptr = o
  extension (v: GtkActionable_autoptr)
    inline def value: Ptr[GtkActionable] = v

opaque type GtkActionable_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkActionable_listautoptr: 
  given _tag: Tag[GtkActionable_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkActionable_listautoptr = o
  extension (v: GtkActionable_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkActionable_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkActionable_queueautoptr: 
  given _tag: Tag[GtkActionable_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkActionable_queueautoptr = o
  extension (v: GtkActionable_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkActionable_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkActionable_slistautoptr: 
  given _tag: Tag[GtkActionable_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkActionable_slistautoptr = o
  extension (v: GtkActionable_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkActivateActionClass_autoptr = Ptr[GtkActivateActionClass]
object GtkActivateActionClass_autoptr: 
  given _tag: Tag[GtkActivateActionClass_autoptr] = Tag.Ptr[GtkActivateActionClass](GtkActivateActionClass._tag)
  inline def apply(inline o: Ptr[GtkActivateActionClass]): GtkActivateActionClass_autoptr = o
  extension (v: GtkActivateActionClass_autoptr)
    inline def value: Ptr[GtkActivateActionClass] = v

opaque type GtkActivateActionClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkActivateActionClass_listautoptr: 
  given _tag: Tag[GtkActivateActionClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkActivateActionClass_listautoptr = o
  extension (v: GtkActivateActionClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkActivateActionClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkActivateActionClass_queueautoptr: 
  given _tag: Tag[GtkActivateActionClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkActivateActionClass_queueautoptr = o
  extension (v: GtkActivateActionClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkActivateActionClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkActivateActionClass_slistautoptr: 
  given _tag: Tag[GtkActivateActionClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkActivateActionClass_slistautoptr = o
  extension (v: GtkActivateActionClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkActivateAction_autoptr = Ptr[GtkActivateAction]
object GtkActivateAction_autoptr: 
  given _tag: Tag[GtkActivateAction_autoptr] = Tag.Ptr[GtkActivateAction](GtkActivateAction._tag)
  inline def apply(inline o: Ptr[GtkActivateAction]): GtkActivateAction_autoptr = o
  extension (v: GtkActivateAction_autoptr)
    inline def value: Ptr[GtkActivateAction] = v

opaque type GtkActivateAction_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkActivateAction_listautoptr: 
  given _tag: Tag[GtkActivateAction_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkActivateAction_listautoptr = o
  extension (v: GtkActivateAction_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkActivateAction_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkActivateAction_queueautoptr: 
  given _tag: Tag[GtkActivateAction_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkActivateAction_queueautoptr = o
  extension (v: GtkActivateAction_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkActivateAction_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkActivateAction_slistautoptr: 
  given _tag: Tag[GtkActivateAction_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkActivateAction_slistautoptr = o
  extension (v: GtkActivateAction_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkAdjustment_autoptr = Ptr[GtkAdjustment]
object GtkAdjustment_autoptr: 
  given _tag: Tag[GtkAdjustment_autoptr] = Tag.Ptr[GtkAdjustment](GtkAdjustment._tag)
  inline def apply(inline o: Ptr[GtkAdjustment]): GtkAdjustment_autoptr = o
  extension (v: GtkAdjustment_autoptr)
    inline def value: Ptr[GtkAdjustment] = v

opaque type GtkAdjustment_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkAdjustment_listautoptr: 
  given _tag: Tag[GtkAdjustment_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkAdjustment_listautoptr = o
  extension (v: GtkAdjustment_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkAdjustment_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkAdjustment_queueautoptr: 
  given _tag: Tag[GtkAdjustment_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkAdjustment_queueautoptr = o
  extension (v: GtkAdjustment_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkAdjustment_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkAdjustment_slistautoptr: 
  given _tag: Tag[GtkAdjustment_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkAdjustment_slistautoptr = o
  extension (v: GtkAdjustment_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkAlertDialogClass_autoptr = Ptr[GtkAlertDialogClass]
object GtkAlertDialogClass_autoptr: 
  given _tag: Tag[GtkAlertDialogClass_autoptr] = Tag.Ptr[GtkAlertDialogClass](GtkAlertDialogClass._tag)
  inline def apply(inline o: Ptr[GtkAlertDialogClass]): GtkAlertDialogClass_autoptr = o
  extension (v: GtkAlertDialogClass_autoptr)
    inline def value: Ptr[GtkAlertDialogClass] = v

opaque type GtkAlertDialogClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkAlertDialogClass_listautoptr: 
  given _tag: Tag[GtkAlertDialogClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkAlertDialogClass_listautoptr = o
  extension (v: GtkAlertDialogClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkAlertDialogClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkAlertDialogClass_queueautoptr: 
  given _tag: Tag[GtkAlertDialogClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkAlertDialogClass_queueautoptr = o
  extension (v: GtkAlertDialogClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkAlertDialogClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkAlertDialogClass_slistautoptr: 
  given _tag: Tag[GtkAlertDialogClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkAlertDialogClass_slistautoptr = o
  extension (v: GtkAlertDialogClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkAlertDialog_autoptr = Ptr[GtkAlertDialog]
object GtkAlertDialog_autoptr: 
  given _tag: Tag[GtkAlertDialog_autoptr] = Tag.Ptr[GtkAlertDialog](GtkAlertDialog._tag)
  inline def apply(inline o: Ptr[GtkAlertDialog]): GtkAlertDialog_autoptr = o
  extension (v: GtkAlertDialog_autoptr)
    inline def value: Ptr[GtkAlertDialog] = v

opaque type GtkAlertDialog_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkAlertDialog_listautoptr: 
  given _tag: Tag[GtkAlertDialog_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkAlertDialog_listautoptr = o
  extension (v: GtkAlertDialog_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkAlertDialog_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkAlertDialog_queueautoptr: 
  given _tag: Tag[GtkAlertDialog_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkAlertDialog_queueautoptr = o
  extension (v: GtkAlertDialog_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkAlertDialog_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkAlertDialog_slistautoptr: 
  given _tag: Tag[GtkAlertDialog_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkAlertDialog_slistautoptr = o
  extension (v: GtkAlertDialog_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkAllocation: : the X position of the widget’s area relative to its parents allocation. : the Y position of the widget’s area relative to its parents allocation. : the width of the widget’s allocated area. : the height of the widget’s allocated area.
*/
type GtkAllocation = GdkRectangle
object GtkAllocation: 
  given _tag: Tag[GtkAllocation] = GdkRectangle._tag
  inline def apply(inline o: GdkRectangle): GtkAllocation = o
  extension (v: GtkAllocation)
    inline def value: GdkRectangle = v

opaque type GtkAlternativeTriggerClass_autoptr = Ptr[GtkAlternativeTriggerClass]
object GtkAlternativeTriggerClass_autoptr: 
  given _tag: Tag[GtkAlternativeTriggerClass_autoptr] = Tag.Ptr[GtkAlternativeTriggerClass](GtkAlternativeTriggerClass._tag)
  inline def apply(inline o: Ptr[GtkAlternativeTriggerClass]): GtkAlternativeTriggerClass_autoptr = o
  extension (v: GtkAlternativeTriggerClass_autoptr)
    inline def value: Ptr[GtkAlternativeTriggerClass] = v

opaque type GtkAlternativeTriggerClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkAlternativeTriggerClass_listautoptr: 
  given _tag: Tag[GtkAlternativeTriggerClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkAlternativeTriggerClass_listautoptr = o
  extension (v: GtkAlternativeTriggerClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkAlternativeTriggerClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkAlternativeTriggerClass_queueautoptr: 
  given _tag: Tag[GtkAlternativeTriggerClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkAlternativeTriggerClass_queueautoptr = o
  extension (v: GtkAlternativeTriggerClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkAlternativeTriggerClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkAlternativeTriggerClass_slistautoptr: 
  given _tag: Tag[GtkAlternativeTriggerClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkAlternativeTriggerClass_slistautoptr = o
  extension (v: GtkAlternativeTriggerClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkAlternativeTrigger_autoptr = Ptr[GtkAlternativeTrigger]
object GtkAlternativeTrigger_autoptr: 
  given _tag: Tag[GtkAlternativeTrigger_autoptr] = Tag.Ptr[GtkAlternativeTrigger](GtkAlternativeTrigger._tag)
  inline def apply(inline o: Ptr[GtkAlternativeTrigger]): GtkAlternativeTrigger_autoptr = o
  extension (v: GtkAlternativeTrigger_autoptr)
    inline def value: Ptr[GtkAlternativeTrigger] = v

opaque type GtkAlternativeTrigger_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkAlternativeTrigger_listautoptr: 
  given _tag: Tag[GtkAlternativeTrigger_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkAlternativeTrigger_listautoptr = o
  extension (v: GtkAlternativeTrigger_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkAlternativeTrigger_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkAlternativeTrigger_queueautoptr: 
  given _tag: Tag[GtkAlternativeTrigger_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkAlternativeTrigger_queueautoptr = o
  extension (v: GtkAlternativeTrigger_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkAlternativeTrigger_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkAlternativeTrigger_slistautoptr: 
  given _tag: Tag[GtkAlternativeTrigger_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkAlternativeTrigger_slistautoptr = o
  extension (v: GtkAlternativeTrigger_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkAnyFilterClass_autoptr = Ptr[GtkAnyFilterClass]
object GtkAnyFilterClass_autoptr: 
  given _tag: Tag[GtkAnyFilterClass_autoptr] = Tag.Ptr[GtkAnyFilterClass](GtkAnyFilterClass._tag)
  inline def apply(inline o: Ptr[GtkAnyFilterClass]): GtkAnyFilterClass_autoptr = o
  extension (v: GtkAnyFilterClass_autoptr)
    inline def value: Ptr[GtkAnyFilterClass] = v

opaque type GtkAnyFilterClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkAnyFilterClass_listautoptr: 
  given _tag: Tag[GtkAnyFilterClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkAnyFilterClass_listautoptr = o
  extension (v: GtkAnyFilterClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkAnyFilterClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkAnyFilterClass_queueautoptr: 
  given _tag: Tag[GtkAnyFilterClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkAnyFilterClass_queueautoptr = o
  extension (v: GtkAnyFilterClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkAnyFilterClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkAnyFilterClass_slistautoptr: 
  given _tag: Tag[GtkAnyFilterClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkAnyFilterClass_slistautoptr = o
  extension (v: GtkAnyFilterClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkAnyFilter_autoptr = Ptr[GtkAnyFilter]
object GtkAnyFilter_autoptr: 
  given _tag: Tag[GtkAnyFilter_autoptr] = Tag.Ptr[GtkAnyFilter](GtkAnyFilter._tag)
  inline def apply(inline o: Ptr[GtkAnyFilter]): GtkAnyFilter_autoptr = o
  extension (v: GtkAnyFilter_autoptr)
    inline def value: Ptr[GtkAnyFilter] = v

opaque type GtkAnyFilter_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkAnyFilter_listautoptr: 
  given _tag: Tag[GtkAnyFilter_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkAnyFilter_listautoptr = o
  extension (v: GtkAnyFilter_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkAnyFilter_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkAnyFilter_queueautoptr: 
  given _tag: Tag[GtkAnyFilter_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkAnyFilter_queueautoptr = o
  extension (v: GtkAnyFilter_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkAnyFilter_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkAnyFilter_slistautoptr: 
  given _tag: Tag[GtkAnyFilter_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkAnyFilter_slistautoptr = o
  extension (v: GtkAnyFilter_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkAppChooserButton_autoptr = Ptr[GtkAppChooserButton]
object GtkAppChooserButton_autoptr: 
  given _tag: Tag[GtkAppChooserButton_autoptr] = Tag.Ptr[GtkAppChooserButton](GtkAppChooserButton._tag)
  inline def apply(inline o: Ptr[GtkAppChooserButton]): GtkAppChooserButton_autoptr = o
  extension (v: GtkAppChooserButton_autoptr)
    inline def value: Ptr[GtkAppChooserButton] = v

opaque type GtkAppChooserButton_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkAppChooserButton_listautoptr: 
  given _tag: Tag[GtkAppChooserButton_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkAppChooserButton_listautoptr = o
  extension (v: GtkAppChooserButton_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkAppChooserButton_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkAppChooserButton_queueautoptr: 
  given _tag: Tag[GtkAppChooserButton_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkAppChooserButton_queueautoptr = o
  extension (v: GtkAppChooserButton_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkAppChooserButton_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkAppChooserButton_slistautoptr: 
  given _tag: Tag[GtkAppChooserButton_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkAppChooserButton_slistautoptr = o
  extension (v: GtkAppChooserButton_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkAppChooserDialog_autoptr = Ptr[GtkAppChooserDialog]
object GtkAppChooserDialog_autoptr: 
  given _tag: Tag[GtkAppChooserDialog_autoptr] = Tag.Ptr[GtkAppChooserDialog](GtkAppChooserDialog._tag)
  inline def apply(inline o: Ptr[GtkAppChooserDialog]): GtkAppChooserDialog_autoptr = o
  extension (v: GtkAppChooserDialog_autoptr)
    inline def value: Ptr[GtkAppChooserDialog] = v

opaque type GtkAppChooserDialog_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkAppChooserDialog_listautoptr: 
  given _tag: Tag[GtkAppChooserDialog_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkAppChooserDialog_listautoptr = o
  extension (v: GtkAppChooserDialog_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkAppChooserDialog_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkAppChooserDialog_queueautoptr: 
  given _tag: Tag[GtkAppChooserDialog_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkAppChooserDialog_queueautoptr = o
  extension (v: GtkAppChooserDialog_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkAppChooserDialog_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkAppChooserDialog_slistautoptr: 
  given _tag: Tag[GtkAppChooserDialog_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkAppChooserDialog_slistautoptr = o
  extension (v: GtkAppChooserDialog_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkAppChooserWidget_autoptr = Ptr[GtkAppChooserWidget]
object GtkAppChooserWidget_autoptr: 
  given _tag: Tag[GtkAppChooserWidget_autoptr] = Tag.Ptr[GtkAppChooserWidget](GtkAppChooserWidget._tag)
  inline def apply(inline o: Ptr[GtkAppChooserWidget]): GtkAppChooserWidget_autoptr = o
  extension (v: GtkAppChooserWidget_autoptr)
    inline def value: Ptr[GtkAppChooserWidget] = v

opaque type GtkAppChooserWidget_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkAppChooserWidget_listautoptr: 
  given _tag: Tag[GtkAppChooserWidget_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkAppChooserWidget_listautoptr = o
  extension (v: GtkAppChooserWidget_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkAppChooserWidget_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkAppChooserWidget_queueautoptr: 
  given _tag: Tag[GtkAppChooserWidget_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkAppChooserWidget_queueautoptr = o
  extension (v: GtkAppChooserWidget_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkAppChooserWidget_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkAppChooserWidget_slistautoptr: 
  given _tag: Tag[GtkAppChooserWidget_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkAppChooserWidget_slistautoptr = o
  extension (v: GtkAppChooserWidget_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkAppChooser_autoptr = Ptr[GtkAppChooser]
object GtkAppChooser_autoptr: 
  given _tag: Tag[GtkAppChooser_autoptr] = Tag.Ptr[GtkAppChooser](GtkAppChooser._tag)
  inline def apply(inline o: Ptr[GtkAppChooser]): GtkAppChooser_autoptr = o
  extension (v: GtkAppChooser_autoptr)
    inline def value: Ptr[GtkAppChooser] = v

opaque type GtkAppChooser_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkAppChooser_listautoptr: 
  given _tag: Tag[GtkAppChooser_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkAppChooser_listautoptr = o
  extension (v: GtkAppChooser_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkAppChooser_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkAppChooser_queueautoptr: 
  given _tag: Tag[GtkAppChooser_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkAppChooser_queueautoptr = o
  extension (v: GtkAppChooser_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkAppChooser_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkAppChooser_slistautoptr: 
  given _tag: Tag[GtkAppChooser_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkAppChooser_slistautoptr = o
  extension (v: GtkAppChooser_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkApplicationWindow_autoptr = Ptr[GtkApplicationWindow]
object GtkApplicationWindow_autoptr: 
  given _tag: Tag[GtkApplicationWindow_autoptr] = Tag.Ptr[GtkApplicationWindow](GtkApplicationWindow._tag)
  inline def apply(inline o: Ptr[GtkApplicationWindow]): GtkApplicationWindow_autoptr = o
  extension (v: GtkApplicationWindow_autoptr)
    inline def value: Ptr[GtkApplicationWindow] = v

opaque type GtkApplicationWindow_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkApplicationWindow_listautoptr: 
  given _tag: Tag[GtkApplicationWindow_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkApplicationWindow_listautoptr = o
  extension (v: GtkApplicationWindow_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkApplicationWindow_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkApplicationWindow_queueautoptr: 
  given _tag: Tag[GtkApplicationWindow_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkApplicationWindow_queueautoptr = o
  extension (v: GtkApplicationWindow_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkApplicationWindow_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkApplicationWindow_slistautoptr: 
  given _tag: Tag[GtkApplicationWindow_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkApplicationWindow_slistautoptr = o
  extension (v: GtkApplicationWindow_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkApplication_autoptr = Ptr[GtkApplication]
object GtkApplication_autoptr: 
  given _tag: Tag[GtkApplication_autoptr] = Tag.Ptr[GtkApplication](GtkApplication._tag)
  inline def apply(inline o: Ptr[GtkApplication]): GtkApplication_autoptr = o
  extension (v: GtkApplication_autoptr)
    inline def value: Ptr[GtkApplication] = v

opaque type GtkApplication_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkApplication_listautoptr: 
  given _tag: Tag[GtkApplication_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkApplication_listautoptr = o
  extension (v: GtkApplication_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkApplication_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkApplication_queueautoptr: 
  given _tag: Tag[GtkApplication_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkApplication_queueautoptr = o
  extension (v: GtkApplication_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkApplication_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkApplication_slistautoptr: 
  given _tag: Tag[GtkApplication_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkApplication_slistautoptr = o
  extension (v: GtkApplication_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkAspectFrame_autoptr = Ptr[GtkAspectFrame]
object GtkAspectFrame_autoptr: 
  given _tag: Tag[GtkAspectFrame_autoptr] = Tag.Ptr[GtkAspectFrame](GtkAspectFrame._tag)
  inline def apply(inline o: Ptr[GtkAspectFrame]): GtkAspectFrame_autoptr = o
  extension (v: GtkAspectFrame_autoptr)
    inline def value: Ptr[GtkAspectFrame] = v

opaque type GtkAspectFrame_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkAspectFrame_listautoptr: 
  given _tag: Tag[GtkAspectFrame_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkAspectFrame_listautoptr = o
  extension (v: GtkAspectFrame_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkAspectFrame_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkAspectFrame_queueautoptr: 
  given _tag: Tag[GtkAspectFrame_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkAspectFrame_queueautoptr = o
  extension (v: GtkAspectFrame_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkAspectFrame_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkAspectFrame_slistautoptr: 
  given _tag: Tag[GtkAspectFrame_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkAspectFrame_slistautoptr = o
  extension (v: GtkAspectFrame_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkAssistantPageFunc: _page: The page number used to calculate the next page.
*/
opaque type GtkAssistantPageFunc = CFuncPtr2[CInt, _root_.sn.gnome.glib.internal.gpointer, CInt]
object GtkAssistantPageFunc: 
  given _tag: Tag[GtkAssistantPageFunc] = Tag.materializeCFuncPtr2[CInt, _root_.sn.gnome.glib.internal.gpointer, CInt]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkAssistantPageFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[CInt, _root_.sn.gnome.glib.internal.gpointer, CInt]): GtkAssistantPageFunc = o
  extension (v: GtkAssistantPageFunc)
    inline def value: CFuncPtr2[CInt, _root_.sn.gnome.glib.internal.gpointer, CInt] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkAssistant_autoptr = Ptr[GtkAssistant]
object GtkAssistant_autoptr: 
  given _tag: Tag[GtkAssistant_autoptr] = Tag.Ptr[GtkAssistant](GtkAssistant._tag)
  inline def apply(inline o: Ptr[GtkAssistant]): GtkAssistant_autoptr = o
  extension (v: GtkAssistant_autoptr)
    inline def value: Ptr[GtkAssistant] = v

opaque type GtkAssistant_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkAssistant_listautoptr: 
  given _tag: Tag[GtkAssistant_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkAssistant_listautoptr = o
  extension (v: GtkAssistant_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkAssistant_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkAssistant_queueautoptr: 
  given _tag: Tag[GtkAssistant_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkAssistant_queueautoptr = o
  extension (v: GtkAssistant_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkAssistant_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkAssistant_slistautoptr: 
  given _tag: Tag[GtkAssistant_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkAssistant_slistautoptr = o
  extension (v: GtkAssistant_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkBinLayoutClass_autoptr = Ptr[GtkBinLayoutClass]
object GtkBinLayoutClass_autoptr: 
  given _tag: Tag[GtkBinLayoutClass_autoptr] = Tag.Ptr[GtkBinLayoutClass](GtkBinLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkBinLayoutClass]): GtkBinLayoutClass_autoptr = o
  extension (v: GtkBinLayoutClass_autoptr)
    inline def value: Ptr[GtkBinLayoutClass] = v

opaque type GtkBinLayoutClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkBinLayoutClass_listautoptr: 
  given _tag: Tag[GtkBinLayoutClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkBinLayoutClass_listautoptr = o
  extension (v: GtkBinLayoutClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkBinLayoutClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkBinLayoutClass_queueautoptr: 
  given _tag: Tag[GtkBinLayoutClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkBinLayoutClass_queueautoptr = o
  extension (v: GtkBinLayoutClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkBinLayoutClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkBinLayoutClass_slistautoptr: 
  given _tag: Tag[GtkBinLayoutClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkBinLayoutClass_slistautoptr = o
  extension (v: GtkBinLayoutClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkBinLayout_autoptr = Ptr[GtkBinLayout]
object GtkBinLayout_autoptr: 
  given _tag: Tag[GtkBinLayout_autoptr] = Tag.Ptr[GtkBinLayout](GtkBinLayout._tag)
  inline def apply(inline o: Ptr[GtkBinLayout]): GtkBinLayout_autoptr = o
  extension (v: GtkBinLayout_autoptr)
    inline def value: Ptr[GtkBinLayout] = v

opaque type GtkBinLayout_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkBinLayout_listautoptr: 
  given _tag: Tag[GtkBinLayout_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkBinLayout_listautoptr = o
  extension (v: GtkBinLayout_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkBinLayout_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkBinLayout_queueautoptr: 
  given _tag: Tag[GtkBinLayout_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkBinLayout_queueautoptr = o
  extension (v: GtkBinLayout_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkBinLayout_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkBinLayout_slistautoptr: 
  given _tag: Tag[GtkBinLayout_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkBinLayout_slistautoptr = o
  extension (v: GtkBinLayout_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkBitset_autoptr = Ptr[GtkBitset]
object GtkBitset_autoptr: 
  given _tag: Tag[GtkBitset_autoptr] = Tag.Ptr[GtkBitset](GtkBitset._tag)
  inline def apply(inline o: Ptr[GtkBitset]): GtkBitset_autoptr = o
  extension (v: GtkBitset_autoptr)
    inline def value: Ptr[GtkBitset] = v

opaque type GtkBitset_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkBitset_listautoptr: 
  given _tag: Tag[GtkBitset_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkBitset_listautoptr = o
  extension (v: GtkBitset_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkBitset_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkBitset_queueautoptr: 
  given _tag: Tag[GtkBitset_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkBitset_queueautoptr = o
  extension (v: GtkBitset_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkBitset_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkBitset_slistautoptr: 
  given _tag: Tag[GtkBitset_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkBitset_slistautoptr = o
  extension (v: GtkBitset_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkBookmarkListClass_autoptr = Ptr[GtkBookmarkListClass]
object GtkBookmarkListClass_autoptr: 
  given _tag: Tag[GtkBookmarkListClass_autoptr] = Tag.Ptr[GtkBookmarkListClass](GtkBookmarkListClass._tag)
  inline def apply(inline o: Ptr[GtkBookmarkListClass]): GtkBookmarkListClass_autoptr = o
  extension (v: GtkBookmarkListClass_autoptr)
    inline def value: Ptr[GtkBookmarkListClass] = v

opaque type GtkBookmarkListClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkBookmarkListClass_listautoptr: 
  given _tag: Tag[GtkBookmarkListClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkBookmarkListClass_listautoptr = o
  extension (v: GtkBookmarkListClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkBookmarkListClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkBookmarkListClass_queueautoptr: 
  given _tag: Tag[GtkBookmarkListClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkBookmarkListClass_queueautoptr = o
  extension (v: GtkBookmarkListClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkBookmarkListClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkBookmarkListClass_slistautoptr: 
  given _tag: Tag[GtkBookmarkListClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkBookmarkListClass_slistautoptr = o
  extension (v: GtkBookmarkListClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkBookmarkList_autoptr = Ptr[GtkBookmarkList]
object GtkBookmarkList_autoptr: 
  given _tag: Tag[GtkBookmarkList_autoptr] = Tag.Ptr[GtkBookmarkList](GtkBookmarkList._tag)
  inline def apply(inline o: Ptr[GtkBookmarkList]): GtkBookmarkList_autoptr = o
  extension (v: GtkBookmarkList_autoptr)
    inline def value: Ptr[GtkBookmarkList] = v

opaque type GtkBookmarkList_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkBookmarkList_listautoptr: 
  given _tag: Tag[GtkBookmarkList_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkBookmarkList_listautoptr = o
  extension (v: GtkBookmarkList_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkBookmarkList_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkBookmarkList_queueautoptr: 
  given _tag: Tag[GtkBookmarkList_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkBookmarkList_queueautoptr = o
  extension (v: GtkBookmarkList_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkBookmarkList_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkBookmarkList_slistautoptr: 
  given _tag: Tag[GtkBookmarkList_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkBookmarkList_slistautoptr = o
  extension (v: GtkBookmarkList_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkBoolFilterClass_autoptr = Ptr[GtkBoolFilterClass]
object GtkBoolFilterClass_autoptr: 
  given _tag: Tag[GtkBoolFilterClass_autoptr] = Tag.Ptr[GtkBoolFilterClass](GtkBoolFilterClass._tag)
  inline def apply(inline o: Ptr[GtkBoolFilterClass]): GtkBoolFilterClass_autoptr = o
  extension (v: GtkBoolFilterClass_autoptr)
    inline def value: Ptr[GtkBoolFilterClass] = v

opaque type GtkBoolFilterClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkBoolFilterClass_listautoptr: 
  given _tag: Tag[GtkBoolFilterClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkBoolFilterClass_listautoptr = o
  extension (v: GtkBoolFilterClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkBoolFilterClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkBoolFilterClass_queueautoptr: 
  given _tag: Tag[GtkBoolFilterClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkBoolFilterClass_queueautoptr = o
  extension (v: GtkBoolFilterClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkBoolFilterClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkBoolFilterClass_slistautoptr: 
  given _tag: Tag[GtkBoolFilterClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkBoolFilterClass_slistautoptr = o
  extension (v: GtkBoolFilterClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkBoolFilter_autoptr = Ptr[GtkBoolFilter]
object GtkBoolFilter_autoptr: 
  given _tag: Tag[GtkBoolFilter_autoptr] = Tag.Ptr[GtkBoolFilter](GtkBoolFilter._tag)
  inline def apply(inline o: Ptr[GtkBoolFilter]): GtkBoolFilter_autoptr = o
  extension (v: GtkBoolFilter_autoptr)
    inline def value: Ptr[GtkBoolFilter] = v

opaque type GtkBoolFilter_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkBoolFilter_listautoptr: 
  given _tag: Tag[GtkBoolFilter_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkBoolFilter_listautoptr = o
  extension (v: GtkBoolFilter_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkBoolFilter_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkBoolFilter_queueautoptr: 
  given _tag: Tag[GtkBoolFilter_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkBoolFilter_queueautoptr = o
  extension (v: GtkBoolFilter_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkBoolFilter_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkBoolFilter_slistautoptr: 
  given _tag: Tag[GtkBoolFilter_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkBoolFilter_slistautoptr = o
  extension (v: GtkBoolFilter_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkBorder_autoptr = Ptr[GtkBorder]
object GtkBorder_autoptr: 
  given _tag: Tag[GtkBorder_autoptr] = Tag.Ptr[GtkBorder](GtkBorder._tag)
  inline def apply(inline o: Ptr[GtkBorder]): GtkBorder_autoptr = o
  extension (v: GtkBorder_autoptr)
    inline def value: Ptr[GtkBorder] = v

opaque type GtkBorder_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkBorder_listautoptr: 
  given _tag: Tag[GtkBorder_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkBorder_listautoptr = o
  extension (v: GtkBorder_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkBorder_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkBorder_queueautoptr: 
  given _tag: Tag[GtkBorder_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkBorder_queueautoptr = o
  extension (v: GtkBorder_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkBorder_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkBorder_slistautoptr: 
  given _tag: Tag[GtkBorder_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkBorder_slistautoptr = o
  extension (v: GtkBorder_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkBoxLayoutClass_autoptr = Ptr[GtkBoxLayoutClass]
object GtkBoxLayoutClass_autoptr: 
  given _tag: Tag[GtkBoxLayoutClass_autoptr] = Tag.Ptr[GtkBoxLayoutClass](GtkBoxLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkBoxLayoutClass]): GtkBoxLayoutClass_autoptr = o
  extension (v: GtkBoxLayoutClass_autoptr)
    inline def value: Ptr[GtkBoxLayoutClass] = v

opaque type GtkBoxLayoutClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkBoxLayoutClass_listautoptr: 
  given _tag: Tag[GtkBoxLayoutClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkBoxLayoutClass_listautoptr = o
  extension (v: GtkBoxLayoutClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkBoxLayoutClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkBoxLayoutClass_queueautoptr: 
  given _tag: Tag[GtkBoxLayoutClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkBoxLayoutClass_queueautoptr = o
  extension (v: GtkBoxLayoutClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkBoxLayoutClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkBoxLayoutClass_slistautoptr: 
  given _tag: Tag[GtkBoxLayoutClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkBoxLayoutClass_slistautoptr = o
  extension (v: GtkBoxLayoutClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkBoxLayout_autoptr = Ptr[GtkBoxLayout]
object GtkBoxLayout_autoptr: 
  given _tag: Tag[GtkBoxLayout_autoptr] = Tag.Ptr[GtkBoxLayout](GtkBoxLayout._tag)
  inline def apply(inline o: Ptr[GtkBoxLayout]): GtkBoxLayout_autoptr = o
  extension (v: GtkBoxLayout_autoptr)
    inline def value: Ptr[GtkBoxLayout] = v

opaque type GtkBoxLayout_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkBoxLayout_listautoptr: 
  given _tag: Tag[GtkBoxLayout_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkBoxLayout_listautoptr = o
  extension (v: GtkBoxLayout_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkBoxLayout_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkBoxLayout_queueautoptr: 
  given _tag: Tag[GtkBoxLayout_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkBoxLayout_queueautoptr = o
  extension (v: GtkBoxLayout_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkBoxLayout_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkBoxLayout_slistautoptr: 
  given _tag: Tag[GtkBoxLayout_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkBoxLayout_slistautoptr = o
  extension (v: GtkBoxLayout_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkBox_autoptr = Ptr[GtkBox]
object GtkBox_autoptr: 
  given _tag: Tag[GtkBox_autoptr] = Tag.Ptr[GtkBox](GtkBox._tag)
  inline def apply(inline o: Ptr[GtkBox]): GtkBox_autoptr = o
  extension (v: GtkBox_autoptr)
    inline def value: Ptr[GtkBox] = v

opaque type GtkBox_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkBox_listautoptr: 
  given _tag: Tag[GtkBox_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkBox_listautoptr = o
  extension (v: GtkBox_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkBox_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkBox_queueautoptr: 
  given _tag: Tag[GtkBox_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkBox_queueautoptr = o
  extension (v: GtkBox_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkBox_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkBox_slistautoptr: 
  given _tag: Tag[GtkBox_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkBox_slistautoptr = o
  extension (v: GtkBox_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkBuildable_autoptr = Ptr[GtkBuildable]
object GtkBuildable_autoptr: 
  given _tag: Tag[GtkBuildable_autoptr] = Tag.Ptr[GtkBuildable](GtkBuildable._tag)
  inline def apply(inline o: Ptr[GtkBuildable]): GtkBuildable_autoptr = o
  extension (v: GtkBuildable_autoptr)
    inline def value: Ptr[GtkBuildable] = v

opaque type GtkBuildable_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkBuildable_listautoptr: 
  given _tag: Tag[GtkBuildable_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkBuildable_listautoptr = o
  extension (v: GtkBuildable_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkBuildable_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkBuildable_queueautoptr: 
  given _tag: Tag[GtkBuildable_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkBuildable_queueautoptr = o
  extension (v: GtkBuildable_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkBuildable_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkBuildable_slistautoptr: 
  given _tag: Tag[GtkBuildable_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkBuildable_slistautoptr = o
  extension (v: GtkBuildable_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkBuilderCScopeClass_autoptr = Ptr[GtkBuilderCScopeClass]
object GtkBuilderCScopeClass_autoptr: 
  given _tag: Tag[GtkBuilderCScopeClass_autoptr] = Tag.Ptr[GtkBuilderCScopeClass](GtkBuilderCScopeClass._tag)
  inline def apply(inline o: Ptr[GtkBuilderCScopeClass]): GtkBuilderCScopeClass_autoptr = o
  extension (v: GtkBuilderCScopeClass_autoptr)
    inline def value: Ptr[GtkBuilderCScopeClass] = v

opaque type GtkBuilderCScopeClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkBuilderCScopeClass_listautoptr: 
  given _tag: Tag[GtkBuilderCScopeClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkBuilderCScopeClass_listautoptr = o
  extension (v: GtkBuilderCScopeClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkBuilderCScopeClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkBuilderCScopeClass_queueautoptr: 
  given _tag: Tag[GtkBuilderCScopeClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkBuilderCScopeClass_queueautoptr = o
  extension (v: GtkBuilderCScopeClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkBuilderCScopeClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkBuilderCScopeClass_slistautoptr: 
  given _tag: Tag[GtkBuilderCScopeClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkBuilderCScopeClass_slistautoptr = o
  extension (v: GtkBuilderCScopeClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkBuilderCScope_autoptr = Ptr[GtkBuilderCScope]
object GtkBuilderCScope_autoptr: 
  given _tag: Tag[GtkBuilderCScope_autoptr] = Tag.Ptr[GtkBuilderCScope](GtkBuilderCScope._tag)
  inline def apply(inline o: Ptr[GtkBuilderCScope]): GtkBuilderCScope_autoptr = o
  extension (v: GtkBuilderCScope_autoptr)
    inline def value: Ptr[GtkBuilderCScope] = v

opaque type GtkBuilderCScope_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkBuilderCScope_listautoptr: 
  given _tag: Tag[GtkBuilderCScope_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkBuilderCScope_listautoptr = o
  extension (v: GtkBuilderCScope_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkBuilderCScope_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkBuilderCScope_queueautoptr: 
  given _tag: Tag[GtkBuilderCScope_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkBuilderCScope_queueautoptr = o
  extension (v: GtkBuilderCScope_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkBuilderCScope_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkBuilderCScope_slistautoptr: 
  given _tag: Tag[GtkBuilderCScope_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkBuilderCScope_slistautoptr = o
  extension (v: GtkBuilderCScope_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkBuilderScope_autoptr = Ptr[GtkBuilderScope]
object GtkBuilderScope_autoptr: 
  given _tag: Tag[GtkBuilderScope_autoptr] = Tag.Ptr[GtkBuilderScope](GtkBuilderScope._tag)
  inline def apply(inline o: Ptr[GtkBuilderScope]): GtkBuilderScope_autoptr = o
  extension (v: GtkBuilderScope_autoptr)
    inline def value: Ptr[GtkBuilderScope] = v

opaque type GtkBuilderScope_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkBuilderScope_listautoptr: 
  given _tag: Tag[GtkBuilderScope_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkBuilderScope_listautoptr = o
  extension (v: GtkBuilderScope_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkBuilderScope_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkBuilderScope_queueautoptr: 
  given _tag: Tag[GtkBuilderScope_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkBuilderScope_queueautoptr = o
  extension (v: GtkBuilderScope_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkBuilderScope_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkBuilderScope_slistautoptr: 
  given _tag: Tag[GtkBuilderScope_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkBuilderScope_slistautoptr = o
  extension (v: GtkBuilderScope_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkBuilder_autoptr = Ptr[GtkBuilder]
object GtkBuilder_autoptr: 
  given _tag: Tag[GtkBuilder_autoptr] = Tag.Ptr[GtkBuilder](GtkBuilder._tag)
  inline def apply(inline o: Ptr[GtkBuilder]): GtkBuilder_autoptr = o
  extension (v: GtkBuilder_autoptr)
    inline def value: Ptr[GtkBuilder] = v

opaque type GtkBuilder_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkBuilder_listautoptr: 
  given _tag: Tag[GtkBuilder_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkBuilder_listautoptr = o
  extension (v: GtkBuilder_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkBuilder_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkBuilder_queueautoptr: 
  given _tag: Tag[GtkBuilder_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkBuilder_queueautoptr = o
  extension (v: GtkBuilder_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkBuilder_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkBuilder_slistautoptr: 
  given _tag: Tag[GtkBuilder_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkBuilder_slistautoptr = o
  extension (v: GtkBuilder_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkButton_autoptr = Ptr[GtkButton]
object GtkButton_autoptr: 
  given _tag: Tag[GtkButton_autoptr] = Tag.Ptr[GtkButton](GtkButton._tag)
  inline def apply(inline o: Ptr[GtkButton]): GtkButton_autoptr = o
  extension (v: GtkButton_autoptr)
    inline def value: Ptr[GtkButton] = v

opaque type GtkButton_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkButton_listautoptr: 
  given _tag: Tag[GtkButton_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkButton_listautoptr = o
  extension (v: GtkButton_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkButton_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkButton_queueautoptr: 
  given _tag: Tag[GtkButton_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkButton_queueautoptr = o
  extension (v: GtkButton_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkButton_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkButton_slistautoptr: 
  given _tag: Tag[GtkButton_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkButton_slistautoptr = o
  extension (v: GtkButton_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkCalendar_autoptr = Ptr[GtkCalendar]
object GtkCalendar_autoptr: 
  given _tag: Tag[GtkCalendar_autoptr] = Tag.Ptr[GtkCalendar](GtkCalendar._tag)
  inline def apply(inline o: Ptr[GtkCalendar]): GtkCalendar_autoptr = o
  extension (v: GtkCalendar_autoptr)
    inline def value: Ptr[GtkCalendar] = v

opaque type GtkCalendar_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkCalendar_listautoptr: 
  given _tag: Tag[GtkCalendar_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkCalendar_listautoptr = o
  extension (v: GtkCalendar_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkCalendar_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkCalendar_queueautoptr: 
  given _tag: Tag[GtkCalendar_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkCalendar_queueautoptr = o
  extension (v: GtkCalendar_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkCalendar_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkCalendar_slistautoptr: 
  given _tag: Tag[GtkCalendar_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkCalendar_slistautoptr = o
  extension (v: GtkCalendar_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkCallbackActionClass_autoptr = Ptr[GtkCallbackActionClass]
object GtkCallbackActionClass_autoptr: 
  given _tag: Tag[GtkCallbackActionClass_autoptr] = Tag.Ptr[GtkCallbackActionClass](GtkCallbackActionClass._tag)
  inline def apply(inline o: Ptr[GtkCallbackActionClass]): GtkCallbackActionClass_autoptr = o
  extension (v: GtkCallbackActionClass_autoptr)
    inline def value: Ptr[GtkCallbackActionClass] = v

opaque type GtkCallbackActionClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkCallbackActionClass_listautoptr: 
  given _tag: Tag[GtkCallbackActionClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkCallbackActionClass_listautoptr = o
  extension (v: GtkCallbackActionClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkCallbackActionClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkCallbackActionClass_queueautoptr: 
  given _tag: Tag[GtkCallbackActionClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkCallbackActionClass_queueautoptr = o
  extension (v: GtkCallbackActionClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkCallbackActionClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkCallbackActionClass_slistautoptr: 
  given _tag: Tag[GtkCallbackActionClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkCallbackActionClass_slistautoptr = o
  extension (v: GtkCallbackActionClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkCallbackAction_autoptr = Ptr[GtkCallbackAction]
object GtkCallbackAction_autoptr: 
  given _tag: Tag[GtkCallbackAction_autoptr] = Tag.Ptr[GtkCallbackAction](GtkCallbackAction._tag)
  inline def apply(inline o: Ptr[GtkCallbackAction]): GtkCallbackAction_autoptr = o
  extension (v: GtkCallbackAction_autoptr)
    inline def value: Ptr[GtkCallbackAction] = v

opaque type GtkCallbackAction_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkCallbackAction_listautoptr: 
  given _tag: Tag[GtkCallbackAction_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkCallbackAction_listautoptr = o
  extension (v: GtkCallbackAction_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkCallbackAction_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkCallbackAction_queueautoptr: 
  given _tag: Tag[GtkCallbackAction_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkCallbackAction_queueautoptr = o
  extension (v: GtkCallbackAction_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkCallbackAction_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkCallbackAction_slistautoptr: 
  given _tag: Tag[GtkCallbackAction_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkCallbackAction_slistautoptr = o
  extension (v: GtkCallbackAction_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkCellAllocCallback: : the cell renderer to operate on _area: the area allocated to inside the rectangle provided to gtk_cell_area_foreach_alloc(). _background: the background area for inside the background area provided to gtk_cell_area_foreach_alloc().
*/
opaque type GtkCellAllocCallback = CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GdkRectangle], Ptr[GdkRectangle], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GtkCellAllocCallback: 
  given _tag: Tag[GtkCellAllocCallback] = Tag.materializeCFuncPtr4[Ptr[GtkCellRenderer], Ptr[GdkRectangle], Ptr[GdkRectangle], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkCellAllocCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GdkRectangle], Ptr[GdkRectangle], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GtkCellAllocCallback = o
  extension (v: GtkCellAllocCallback)
    inline def value: CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GdkRectangle], Ptr[GdkRectangle], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkCellAreaBox_autoptr = Ptr[GtkCellAreaBox]
object GtkCellAreaBox_autoptr: 
  given _tag: Tag[GtkCellAreaBox_autoptr] = Tag.Ptr[GtkCellAreaBox](GtkCellAreaBox._tag)
  inline def apply(inline o: Ptr[GtkCellAreaBox]): GtkCellAreaBox_autoptr = o
  extension (v: GtkCellAreaBox_autoptr)
    inline def value: Ptr[GtkCellAreaBox] = v

opaque type GtkCellAreaBox_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkCellAreaBox_listautoptr: 
  given _tag: Tag[GtkCellAreaBox_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkCellAreaBox_listautoptr = o
  extension (v: GtkCellAreaBox_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkCellAreaBox_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkCellAreaBox_queueautoptr: 
  given _tag: Tag[GtkCellAreaBox_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkCellAreaBox_queueautoptr = o
  extension (v: GtkCellAreaBox_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkCellAreaBox_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkCellAreaBox_slistautoptr: 
  given _tag: Tag[GtkCellAreaBox_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkCellAreaBox_slistautoptr = o
  extension (v: GtkCellAreaBox_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkCellAreaContext_autoptr = Ptr[GtkCellAreaContext]
object GtkCellAreaContext_autoptr: 
  given _tag: Tag[GtkCellAreaContext_autoptr] = Tag.Ptr[GtkCellAreaContext](GtkCellAreaContext._tag)
  inline def apply(inline o: Ptr[GtkCellAreaContext]): GtkCellAreaContext_autoptr = o
  extension (v: GtkCellAreaContext_autoptr)
    inline def value: Ptr[GtkCellAreaContext] = v

opaque type GtkCellAreaContext_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkCellAreaContext_listautoptr: 
  given _tag: Tag[GtkCellAreaContext_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkCellAreaContext_listautoptr = o
  extension (v: GtkCellAreaContext_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkCellAreaContext_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkCellAreaContext_queueautoptr: 
  given _tag: Tag[GtkCellAreaContext_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkCellAreaContext_queueautoptr = o
  extension (v: GtkCellAreaContext_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkCellAreaContext_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkCellAreaContext_slistautoptr: 
  given _tag: Tag[GtkCellAreaContext_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkCellAreaContext_slistautoptr = o
  extension (v: GtkCellAreaContext_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkCellArea_autoptr = Ptr[GtkCellArea]
object GtkCellArea_autoptr: 
  given _tag: Tag[GtkCellArea_autoptr] = Tag.Ptr[GtkCellArea](GtkCellArea._tag)
  inline def apply(inline o: Ptr[GtkCellArea]): GtkCellArea_autoptr = o
  extension (v: GtkCellArea_autoptr)
    inline def value: Ptr[GtkCellArea] = v

opaque type GtkCellArea_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkCellArea_listautoptr: 
  given _tag: Tag[GtkCellArea_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkCellArea_listautoptr = o
  extension (v: GtkCellArea_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkCellArea_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkCellArea_queueautoptr: 
  given _tag: Tag[GtkCellArea_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkCellArea_queueautoptr = o
  extension (v: GtkCellArea_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkCellArea_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkCellArea_slistautoptr: 
  given _tag: Tag[GtkCellArea_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkCellArea_slistautoptr = o
  extension (v: GtkCellArea_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkCellCallback: : the cell renderer to operate on
*/
opaque type GtkCellCallback = CFuncPtr2[Ptr[GtkCellRenderer], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GtkCellCallback: 
  given _tag: Tag[GtkCellCallback] = Tag.materializeCFuncPtr2[Ptr[GtkCellRenderer], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkCellCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GtkCellRenderer], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GtkCellCallback = o
  extension (v: GtkCellCallback)
    inline def value: CFuncPtr2[Ptr[GtkCellRenderer], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkCellEditable_autoptr = Ptr[GtkCellEditable]
object GtkCellEditable_autoptr: 
  given _tag: Tag[GtkCellEditable_autoptr] = Tag.Ptr[GtkCellEditable](GtkCellEditable._tag)
  inline def apply(inline o: Ptr[GtkCellEditable]): GtkCellEditable_autoptr = o
  extension (v: GtkCellEditable_autoptr)
    inline def value: Ptr[GtkCellEditable] = v

opaque type GtkCellEditable_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkCellEditable_listautoptr: 
  given _tag: Tag[GtkCellEditable_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkCellEditable_listautoptr = o
  extension (v: GtkCellEditable_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkCellEditable_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkCellEditable_queueautoptr: 
  given _tag: Tag[GtkCellEditable_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkCellEditable_queueautoptr = o
  extension (v: GtkCellEditable_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkCellEditable_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkCellEditable_slistautoptr: 
  given _tag: Tag[GtkCellEditable_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkCellEditable_slistautoptr = o
  extension (v: GtkCellEditable_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkCellLayoutDataFunc: _layout: a `GtkCellLayout` : the cell renderer whose value is to be set _model: the model : a `GtkTreeIter` indicating the row to set the value for
*/
opaque type GtkCellLayoutDataFunc = CFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GtkCellLayoutDataFunc: 
  given _tag: Tag[GtkCellLayoutDataFunc] = Tag.materializeCFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkCellLayoutDataFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, Unit]): GtkCellLayoutDataFunc = o
  extension (v: GtkCellLayoutDataFunc)
    inline def value: CFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkCellLayout_autoptr = Ptr[GtkCellLayout]
object GtkCellLayout_autoptr: 
  given _tag: Tag[GtkCellLayout_autoptr] = Tag.Ptr[GtkCellLayout](GtkCellLayout._tag)
  inline def apply(inline o: Ptr[GtkCellLayout]): GtkCellLayout_autoptr = o
  extension (v: GtkCellLayout_autoptr)
    inline def value: Ptr[GtkCellLayout] = v

opaque type GtkCellLayout_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkCellLayout_listautoptr: 
  given _tag: Tag[GtkCellLayout_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkCellLayout_listautoptr = o
  extension (v: GtkCellLayout_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkCellLayout_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkCellLayout_queueautoptr: 
  given _tag: Tag[GtkCellLayout_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkCellLayout_queueautoptr = o
  extension (v: GtkCellLayout_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkCellLayout_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkCellLayout_slistautoptr: 
  given _tag: Tag[GtkCellLayout_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkCellLayout_slistautoptr = o
  extension (v: GtkCellLayout_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkCellRendererAccel_autoptr = Ptr[GtkCellRendererAccel]
object GtkCellRendererAccel_autoptr: 
  given _tag: Tag[GtkCellRendererAccel_autoptr] = Tag.Ptr[GtkCellRendererAccel](GtkCellRendererAccel._tag)
  inline def apply(inline o: Ptr[GtkCellRendererAccel]): GtkCellRendererAccel_autoptr = o
  extension (v: GtkCellRendererAccel_autoptr)
    inline def value: Ptr[GtkCellRendererAccel] = v

opaque type GtkCellRendererAccel_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkCellRendererAccel_listautoptr: 
  given _tag: Tag[GtkCellRendererAccel_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkCellRendererAccel_listautoptr = o
  extension (v: GtkCellRendererAccel_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkCellRendererAccel_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkCellRendererAccel_queueautoptr: 
  given _tag: Tag[GtkCellRendererAccel_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkCellRendererAccel_queueautoptr = o
  extension (v: GtkCellRendererAccel_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkCellRendererAccel_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkCellRendererAccel_slistautoptr: 
  given _tag: Tag[GtkCellRendererAccel_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkCellRendererAccel_slistautoptr = o
  extension (v: GtkCellRendererAccel_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkCellRendererCombo_autoptr = Ptr[GtkCellRendererCombo]
object GtkCellRendererCombo_autoptr: 
  given _tag: Tag[GtkCellRendererCombo_autoptr] = Tag.Ptr[GtkCellRendererCombo](GtkCellRendererCombo._tag)
  inline def apply(inline o: Ptr[GtkCellRendererCombo]): GtkCellRendererCombo_autoptr = o
  extension (v: GtkCellRendererCombo_autoptr)
    inline def value: Ptr[GtkCellRendererCombo] = v

opaque type GtkCellRendererCombo_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkCellRendererCombo_listautoptr: 
  given _tag: Tag[GtkCellRendererCombo_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkCellRendererCombo_listautoptr = o
  extension (v: GtkCellRendererCombo_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkCellRendererCombo_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkCellRendererCombo_queueautoptr: 
  given _tag: Tag[GtkCellRendererCombo_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkCellRendererCombo_queueautoptr = o
  extension (v: GtkCellRendererCombo_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkCellRendererCombo_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkCellRendererCombo_slistautoptr: 
  given _tag: Tag[GtkCellRendererCombo_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkCellRendererCombo_slistautoptr = o
  extension (v: GtkCellRendererCombo_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkCellRendererPixbuf_autoptr = Ptr[GtkCellRendererPixbuf]
object GtkCellRendererPixbuf_autoptr: 
  given _tag: Tag[GtkCellRendererPixbuf_autoptr] = Tag.Ptr[GtkCellRendererPixbuf](GtkCellRendererPixbuf._tag)
  inline def apply(inline o: Ptr[GtkCellRendererPixbuf]): GtkCellRendererPixbuf_autoptr = o
  extension (v: GtkCellRendererPixbuf_autoptr)
    inline def value: Ptr[GtkCellRendererPixbuf] = v

opaque type GtkCellRendererPixbuf_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkCellRendererPixbuf_listautoptr: 
  given _tag: Tag[GtkCellRendererPixbuf_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkCellRendererPixbuf_listautoptr = o
  extension (v: GtkCellRendererPixbuf_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkCellRendererPixbuf_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkCellRendererPixbuf_queueautoptr: 
  given _tag: Tag[GtkCellRendererPixbuf_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkCellRendererPixbuf_queueautoptr = o
  extension (v: GtkCellRendererPixbuf_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkCellRendererPixbuf_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkCellRendererPixbuf_slistautoptr: 
  given _tag: Tag[GtkCellRendererPixbuf_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkCellRendererPixbuf_slistautoptr = o
  extension (v: GtkCellRendererPixbuf_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkCellRendererProgress_autoptr = Ptr[GtkCellRendererProgress]
object GtkCellRendererProgress_autoptr: 
  given _tag: Tag[GtkCellRendererProgress_autoptr] = Tag.Ptr[GtkCellRendererProgress](GtkCellRendererProgress._tag)
  inline def apply(inline o: Ptr[GtkCellRendererProgress]): GtkCellRendererProgress_autoptr = o
  extension (v: GtkCellRendererProgress_autoptr)
    inline def value: Ptr[GtkCellRendererProgress] = v

opaque type GtkCellRendererProgress_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkCellRendererProgress_listautoptr: 
  given _tag: Tag[GtkCellRendererProgress_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkCellRendererProgress_listautoptr = o
  extension (v: GtkCellRendererProgress_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkCellRendererProgress_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkCellRendererProgress_queueautoptr: 
  given _tag: Tag[GtkCellRendererProgress_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkCellRendererProgress_queueautoptr = o
  extension (v: GtkCellRendererProgress_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkCellRendererProgress_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkCellRendererProgress_slistautoptr: 
  given _tag: Tag[GtkCellRendererProgress_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkCellRendererProgress_slistautoptr = o
  extension (v: GtkCellRendererProgress_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkCellRendererSpin_autoptr = Ptr[GtkCellRendererSpin]
object GtkCellRendererSpin_autoptr: 
  given _tag: Tag[GtkCellRendererSpin_autoptr] = Tag.Ptr[GtkCellRendererSpin](GtkCellRendererSpin._tag)
  inline def apply(inline o: Ptr[GtkCellRendererSpin]): GtkCellRendererSpin_autoptr = o
  extension (v: GtkCellRendererSpin_autoptr)
    inline def value: Ptr[GtkCellRendererSpin] = v

opaque type GtkCellRendererSpin_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkCellRendererSpin_listautoptr: 
  given _tag: Tag[GtkCellRendererSpin_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkCellRendererSpin_listautoptr = o
  extension (v: GtkCellRendererSpin_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkCellRendererSpin_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkCellRendererSpin_queueautoptr: 
  given _tag: Tag[GtkCellRendererSpin_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkCellRendererSpin_queueautoptr = o
  extension (v: GtkCellRendererSpin_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkCellRendererSpin_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkCellRendererSpin_slistautoptr: 
  given _tag: Tag[GtkCellRendererSpin_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkCellRendererSpin_slistautoptr = o
  extension (v: GtkCellRendererSpin_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkCellRendererSpinner_autoptr = Ptr[GtkCellRendererSpinner]
object GtkCellRendererSpinner_autoptr: 
  given _tag: Tag[GtkCellRendererSpinner_autoptr] = Tag.Ptr[GtkCellRendererSpinner](GtkCellRendererSpinner._tag)
  inline def apply(inline o: Ptr[GtkCellRendererSpinner]): GtkCellRendererSpinner_autoptr = o
  extension (v: GtkCellRendererSpinner_autoptr)
    inline def value: Ptr[GtkCellRendererSpinner] = v

opaque type GtkCellRendererSpinner_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkCellRendererSpinner_listautoptr: 
  given _tag: Tag[GtkCellRendererSpinner_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkCellRendererSpinner_listautoptr = o
  extension (v: GtkCellRendererSpinner_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkCellRendererSpinner_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkCellRendererSpinner_queueautoptr: 
  given _tag: Tag[GtkCellRendererSpinner_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkCellRendererSpinner_queueautoptr = o
  extension (v: GtkCellRendererSpinner_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkCellRendererSpinner_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkCellRendererSpinner_slistautoptr: 
  given _tag: Tag[GtkCellRendererSpinner_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkCellRendererSpinner_slistautoptr = o
  extension (v: GtkCellRendererSpinner_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkCellRendererText_autoptr = Ptr[GtkCellRendererText]
object GtkCellRendererText_autoptr: 
  given _tag: Tag[GtkCellRendererText_autoptr] = Tag.Ptr[GtkCellRendererText](GtkCellRendererText._tag)
  inline def apply(inline o: Ptr[GtkCellRendererText]): GtkCellRendererText_autoptr = o
  extension (v: GtkCellRendererText_autoptr)
    inline def value: Ptr[GtkCellRendererText] = v

opaque type GtkCellRendererText_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkCellRendererText_listautoptr: 
  given _tag: Tag[GtkCellRendererText_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkCellRendererText_listautoptr = o
  extension (v: GtkCellRendererText_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkCellRendererText_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkCellRendererText_queueautoptr: 
  given _tag: Tag[GtkCellRendererText_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkCellRendererText_queueautoptr = o
  extension (v: GtkCellRendererText_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkCellRendererText_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkCellRendererText_slistautoptr: 
  given _tag: Tag[GtkCellRendererText_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkCellRendererText_slistautoptr = o
  extension (v: GtkCellRendererText_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkCellRendererToggle_autoptr = Ptr[GtkCellRendererToggle]
object GtkCellRendererToggle_autoptr: 
  given _tag: Tag[GtkCellRendererToggle_autoptr] = Tag.Ptr[GtkCellRendererToggle](GtkCellRendererToggle._tag)
  inline def apply(inline o: Ptr[GtkCellRendererToggle]): GtkCellRendererToggle_autoptr = o
  extension (v: GtkCellRendererToggle_autoptr)
    inline def value: Ptr[GtkCellRendererToggle] = v

opaque type GtkCellRendererToggle_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkCellRendererToggle_listautoptr: 
  given _tag: Tag[GtkCellRendererToggle_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkCellRendererToggle_listautoptr = o
  extension (v: GtkCellRendererToggle_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkCellRendererToggle_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkCellRendererToggle_queueautoptr: 
  given _tag: Tag[GtkCellRendererToggle_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkCellRendererToggle_queueautoptr = o
  extension (v: GtkCellRendererToggle_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkCellRendererToggle_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkCellRendererToggle_slistautoptr: 
  given _tag: Tag[GtkCellRendererToggle_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkCellRendererToggle_slistautoptr = o
  extension (v: GtkCellRendererToggle_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkCellRenderer_autoptr = Ptr[GtkCellRenderer]
object GtkCellRenderer_autoptr: 
  given _tag: Tag[GtkCellRenderer_autoptr] = Tag.Ptr[GtkCellRenderer](GtkCellRenderer._tag)
  inline def apply(inline o: Ptr[GtkCellRenderer]): GtkCellRenderer_autoptr = o
  extension (v: GtkCellRenderer_autoptr)
    inline def value: Ptr[GtkCellRenderer] = v

opaque type GtkCellRenderer_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkCellRenderer_listautoptr: 
  given _tag: Tag[GtkCellRenderer_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkCellRenderer_listautoptr = o
  extension (v: GtkCellRenderer_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkCellRenderer_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkCellRenderer_queueautoptr: 
  given _tag: Tag[GtkCellRenderer_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkCellRenderer_queueautoptr = o
  extension (v: GtkCellRenderer_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkCellRenderer_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkCellRenderer_slistautoptr: 
  given _tag: Tag[GtkCellRenderer_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkCellRenderer_slistautoptr = o
  extension (v: GtkCellRenderer_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkCellView_autoptr = Ptr[GtkCellView]
object GtkCellView_autoptr: 
  given _tag: Tag[GtkCellView_autoptr] = Tag.Ptr[GtkCellView](GtkCellView._tag)
  inline def apply(inline o: Ptr[GtkCellView]): GtkCellView_autoptr = o
  extension (v: GtkCellView_autoptr)
    inline def value: Ptr[GtkCellView] = v

opaque type GtkCellView_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkCellView_listautoptr: 
  given _tag: Tag[GtkCellView_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkCellView_listautoptr = o
  extension (v: GtkCellView_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkCellView_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkCellView_queueautoptr: 
  given _tag: Tag[GtkCellView_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkCellView_queueautoptr = o
  extension (v: GtkCellView_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkCellView_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkCellView_slistautoptr: 
  given _tag: Tag[GtkCellView_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkCellView_slistautoptr = o
  extension (v: GtkCellView_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkCenterLayoutClass_autoptr = Ptr[GtkCenterLayoutClass]
object GtkCenterLayoutClass_autoptr: 
  given _tag: Tag[GtkCenterLayoutClass_autoptr] = Tag.Ptr[GtkCenterLayoutClass](GtkCenterLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkCenterLayoutClass]): GtkCenterLayoutClass_autoptr = o
  extension (v: GtkCenterLayoutClass_autoptr)
    inline def value: Ptr[GtkCenterLayoutClass] = v

opaque type GtkCenterLayoutClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkCenterLayoutClass_listautoptr: 
  given _tag: Tag[GtkCenterLayoutClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkCenterLayoutClass_listautoptr = o
  extension (v: GtkCenterLayoutClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkCenterLayoutClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkCenterLayoutClass_queueautoptr: 
  given _tag: Tag[GtkCenterLayoutClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkCenterLayoutClass_queueautoptr = o
  extension (v: GtkCenterLayoutClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkCenterLayoutClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkCenterLayoutClass_slistautoptr: 
  given _tag: Tag[GtkCenterLayoutClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkCenterLayoutClass_slistautoptr = o
  extension (v: GtkCenterLayoutClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkCenterLayout_autoptr = Ptr[GtkCenterLayout]
object GtkCenterLayout_autoptr: 
  given _tag: Tag[GtkCenterLayout_autoptr] = Tag.Ptr[GtkCenterLayout](GtkCenterLayout._tag)
  inline def apply(inline o: Ptr[GtkCenterLayout]): GtkCenterLayout_autoptr = o
  extension (v: GtkCenterLayout_autoptr)
    inline def value: Ptr[GtkCenterLayout] = v

opaque type GtkCenterLayout_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkCenterLayout_listautoptr: 
  given _tag: Tag[GtkCenterLayout_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkCenterLayout_listautoptr = o
  extension (v: GtkCenterLayout_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkCenterLayout_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkCenterLayout_queueautoptr: 
  given _tag: Tag[GtkCenterLayout_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkCenterLayout_queueautoptr = o
  extension (v: GtkCenterLayout_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkCenterLayout_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkCenterLayout_slistautoptr: 
  given _tag: Tag[GtkCenterLayout_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkCenterLayout_slistautoptr = o
  extension (v: GtkCenterLayout_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkCheckButton_autoptr = Ptr[GtkCheckButton]
object GtkCheckButton_autoptr: 
  given _tag: Tag[GtkCheckButton_autoptr] = Tag.Ptr[GtkCheckButton](GtkCheckButton._tag)
  inline def apply(inline o: Ptr[GtkCheckButton]): GtkCheckButton_autoptr = o
  extension (v: GtkCheckButton_autoptr)
    inline def value: Ptr[GtkCheckButton] = v

opaque type GtkCheckButton_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkCheckButton_listautoptr: 
  given _tag: Tag[GtkCheckButton_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkCheckButton_listautoptr = o
  extension (v: GtkCheckButton_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkCheckButton_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkCheckButton_queueautoptr: 
  given _tag: Tag[GtkCheckButton_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkCheckButton_queueautoptr = o
  extension (v: GtkCheckButton_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkCheckButton_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkCheckButton_slistautoptr: 
  given _tag: Tag[GtkCheckButton_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkCheckButton_slistautoptr = o
  extension (v: GtkCheckButton_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkColorButton_autoptr = Ptr[GtkColorButton]
object GtkColorButton_autoptr: 
  given _tag: Tag[GtkColorButton_autoptr] = Tag.Ptr[GtkColorButton](GtkColorButton._tag)
  inline def apply(inline o: Ptr[GtkColorButton]): GtkColorButton_autoptr = o
  extension (v: GtkColorButton_autoptr)
    inline def value: Ptr[GtkColorButton] = v

opaque type GtkColorButton_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkColorButton_listautoptr: 
  given _tag: Tag[GtkColorButton_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkColorButton_listautoptr = o
  extension (v: GtkColorButton_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkColorButton_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkColorButton_queueautoptr: 
  given _tag: Tag[GtkColorButton_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkColorButton_queueautoptr = o
  extension (v: GtkColorButton_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkColorButton_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkColorButton_slistautoptr: 
  given _tag: Tag[GtkColorButton_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkColorButton_slistautoptr = o
  extension (v: GtkColorButton_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkColorChooserDialog_autoptr = Ptr[GtkColorChooserDialog]
object GtkColorChooserDialog_autoptr: 
  given _tag: Tag[GtkColorChooserDialog_autoptr] = Tag.Ptr[GtkColorChooserDialog](GtkColorChooserDialog._tag)
  inline def apply(inline o: Ptr[GtkColorChooserDialog]): GtkColorChooserDialog_autoptr = o
  extension (v: GtkColorChooserDialog_autoptr)
    inline def value: Ptr[GtkColorChooserDialog] = v

opaque type GtkColorChooserDialog_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkColorChooserDialog_listautoptr: 
  given _tag: Tag[GtkColorChooserDialog_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkColorChooserDialog_listautoptr = o
  extension (v: GtkColorChooserDialog_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkColorChooserDialog_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkColorChooserDialog_queueautoptr: 
  given _tag: Tag[GtkColorChooserDialog_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkColorChooserDialog_queueautoptr = o
  extension (v: GtkColorChooserDialog_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkColorChooserDialog_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkColorChooserDialog_slistautoptr: 
  given _tag: Tag[GtkColorChooserDialog_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkColorChooserDialog_slistautoptr = o
  extension (v: GtkColorChooserDialog_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkColorChooserWidget_autoptr = Ptr[GtkColorChooserWidget]
object GtkColorChooserWidget_autoptr: 
  given _tag: Tag[GtkColorChooserWidget_autoptr] = Tag.Ptr[GtkColorChooserWidget](GtkColorChooserWidget._tag)
  inline def apply(inline o: Ptr[GtkColorChooserWidget]): GtkColorChooserWidget_autoptr = o
  extension (v: GtkColorChooserWidget_autoptr)
    inline def value: Ptr[GtkColorChooserWidget] = v

opaque type GtkColorChooserWidget_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkColorChooserWidget_listautoptr: 
  given _tag: Tag[GtkColorChooserWidget_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkColorChooserWidget_listautoptr = o
  extension (v: GtkColorChooserWidget_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkColorChooserWidget_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkColorChooserWidget_queueautoptr: 
  given _tag: Tag[GtkColorChooserWidget_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkColorChooserWidget_queueautoptr = o
  extension (v: GtkColorChooserWidget_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkColorChooserWidget_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkColorChooserWidget_slistautoptr: 
  given _tag: Tag[GtkColorChooserWidget_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkColorChooserWidget_slistautoptr = o
  extension (v: GtkColorChooserWidget_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkColorChooser_autoptr = Ptr[GtkColorChooser]
object GtkColorChooser_autoptr: 
  given _tag: Tag[GtkColorChooser_autoptr] = Tag.Ptr[GtkColorChooser](GtkColorChooser._tag)
  inline def apply(inline o: Ptr[GtkColorChooser]): GtkColorChooser_autoptr = o
  extension (v: GtkColorChooser_autoptr)
    inline def value: Ptr[GtkColorChooser] = v

opaque type GtkColorChooser_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkColorChooser_listautoptr: 
  given _tag: Tag[GtkColorChooser_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkColorChooser_listautoptr = o
  extension (v: GtkColorChooser_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkColorChooser_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkColorChooser_queueautoptr: 
  given _tag: Tag[GtkColorChooser_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkColorChooser_queueautoptr = o
  extension (v: GtkColorChooser_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkColorChooser_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkColorChooser_slistautoptr: 
  given _tag: Tag[GtkColorChooser_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkColorChooser_slistautoptr = o
  extension (v: GtkColorChooser_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkColorDialogButtonClass_autoptr = Ptr[GtkColorDialogButtonClass]
object GtkColorDialogButtonClass_autoptr: 
  given _tag: Tag[GtkColorDialogButtonClass_autoptr] = Tag.Ptr[GtkColorDialogButtonClass](GtkColorDialogButtonClass._tag)
  inline def apply(inline o: Ptr[GtkColorDialogButtonClass]): GtkColorDialogButtonClass_autoptr = o
  extension (v: GtkColorDialogButtonClass_autoptr)
    inline def value: Ptr[GtkColorDialogButtonClass] = v

opaque type GtkColorDialogButtonClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkColorDialogButtonClass_listautoptr: 
  given _tag: Tag[GtkColorDialogButtonClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkColorDialogButtonClass_listautoptr = o
  extension (v: GtkColorDialogButtonClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkColorDialogButtonClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkColorDialogButtonClass_queueautoptr: 
  given _tag: Tag[GtkColorDialogButtonClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkColorDialogButtonClass_queueautoptr = o
  extension (v: GtkColorDialogButtonClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkColorDialogButtonClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkColorDialogButtonClass_slistautoptr: 
  given _tag: Tag[GtkColorDialogButtonClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkColorDialogButtonClass_slistautoptr = o
  extension (v: GtkColorDialogButtonClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkColorDialogButton_autoptr = Ptr[GtkColorDialogButton]
object GtkColorDialogButton_autoptr: 
  given _tag: Tag[GtkColorDialogButton_autoptr] = Tag.Ptr[GtkColorDialogButton](GtkColorDialogButton._tag)
  inline def apply(inline o: Ptr[GtkColorDialogButton]): GtkColorDialogButton_autoptr = o
  extension (v: GtkColorDialogButton_autoptr)
    inline def value: Ptr[GtkColorDialogButton] = v

opaque type GtkColorDialogButton_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkColorDialogButton_listautoptr: 
  given _tag: Tag[GtkColorDialogButton_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkColorDialogButton_listautoptr = o
  extension (v: GtkColorDialogButton_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkColorDialogButton_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkColorDialogButton_queueautoptr: 
  given _tag: Tag[GtkColorDialogButton_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkColorDialogButton_queueautoptr = o
  extension (v: GtkColorDialogButton_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkColorDialogButton_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkColorDialogButton_slistautoptr: 
  given _tag: Tag[GtkColorDialogButton_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkColorDialogButton_slistautoptr = o
  extension (v: GtkColorDialogButton_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkColorDialogClass_autoptr = Ptr[GtkColorDialogClass]
object GtkColorDialogClass_autoptr: 
  given _tag: Tag[GtkColorDialogClass_autoptr] = Tag.Ptr[GtkColorDialogClass](GtkColorDialogClass._tag)
  inline def apply(inline o: Ptr[GtkColorDialogClass]): GtkColorDialogClass_autoptr = o
  extension (v: GtkColorDialogClass_autoptr)
    inline def value: Ptr[GtkColorDialogClass] = v

opaque type GtkColorDialogClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkColorDialogClass_listautoptr: 
  given _tag: Tag[GtkColorDialogClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkColorDialogClass_listautoptr = o
  extension (v: GtkColorDialogClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkColorDialogClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkColorDialogClass_queueautoptr: 
  given _tag: Tag[GtkColorDialogClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkColorDialogClass_queueautoptr = o
  extension (v: GtkColorDialogClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkColorDialogClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkColorDialogClass_slistautoptr: 
  given _tag: Tag[GtkColorDialogClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkColorDialogClass_slistautoptr = o
  extension (v: GtkColorDialogClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkColorDialog_autoptr = Ptr[GtkColorDialog]
object GtkColorDialog_autoptr: 
  given _tag: Tag[GtkColorDialog_autoptr] = Tag.Ptr[GtkColorDialog](GtkColorDialog._tag)
  inline def apply(inline o: Ptr[GtkColorDialog]): GtkColorDialog_autoptr = o
  extension (v: GtkColorDialog_autoptr)
    inline def value: Ptr[GtkColorDialog] = v

opaque type GtkColorDialog_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkColorDialog_listautoptr: 
  given _tag: Tag[GtkColorDialog_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkColorDialog_listautoptr = o
  extension (v: GtkColorDialog_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkColorDialog_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkColorDialog_queueautoptr: 
  given _tag: Tag[GtkColorDialog_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkColorDialog_queueautoptr = o
  extension (v: GtkColorDialog_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkColorDialog_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkColorDialog_slistautoptr: 
  given _tag: Tag[GtkColorDialog_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkColorDialog_slistautoptr = o
  extension (v: GtkColorDialog_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkColumnViewCellClass_autoptr = Ptr[GtkColumnViewCellClass]
object GtkColumnViewCellClass_autoptr: 
  given _tag: Tag[GtkColumnViewCellClass_autoptr] = Tag.Ptr[GtkColumnViewCellClass](GtkColumnViewCellClass._tag)
  inline def apply(inline o: Ptr[GtkColumnViewCellClass]): GtkColumnViewCellClass_autoptr = o
  extension (v: GtkColumnViewCellClass_autoptr)
    inline def value: Ptr[GtkColumnViewCellClass] = v

opaque type GtkColumnViewCellClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkColumnViewCellClass_listautoptr: 
  given _tag: Tag[GtkColumnViewCellClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkColumnViewCellClass_listautoptr = o
  extension (v: GtkColumnViewCellClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkColumnViewCellClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkColumnViewCellClass_queueautoptr: 
  given _tag: Tag[GtkColumnViewCellClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkColumnViewCellClass_queueautoptr = o
  extension (v: GtkColumnViewCellClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkColumnViewCellClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkColumnViewCellClass_slistautoptr: 
  given _tag: Tag[GtkColumnViewCellClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkColumnViewCellClass_slistautoptr = o
  extension (v: GtkColumnViewCellClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkColumnViewCell_autoptr = Ptr[GtkColumnViewCell]
object GtkColumnViewCell_autoptr: 
  given _tag: Tag[GtkColumnViewCell_autoptr] = Tag.Ptr[GtkColumnViewCell](GtkColumnViewCell._tag)
  inline def apply(inline o: Ptr[GtkColumnViewCell]): GtkColumnViewCell_autoptr = o
  extension (v: GtkColumnViewCell_autoptr)
    inline def value: Ptr[GtkColumnViewCell] = v

opaque type GtkColumnViewCell_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkColumnViewCell_listautoptr: 
  given _tag: Tag[GtkColumnViewCell_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkColumnViewCell_listautoptr = o
  extension (v: GtkColumnViewCell_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkColumnViewCell_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkColumnViewCell_queueautoptr: 
  given _tag: Tag[GtkColumnViewCell_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkColumnViewCell_queueautoptr = o
  extension (v: GtkColumnViewCell_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkColumnViewCell_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkColumnViewCell_slistautoptr: 
  given _tag: Tag[GtkColumnViewCell_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkColumnViewCell_slistautoptr = o
  extension (v: GtkColumnViewCell_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkColumnViewColumn_autoptr = Ptr[GtkColumnViewColumn]
object GtkColumnViewColumn_autoptr: 
  given _tag: Tag[GtkColumnViewColumn_autoptr] = Tag.Ptr[GtkColumnViewColumn](GtkColumnViewColumn._tag)
  inline def apply(inline o: Ptr[GtkColumnViewColumn]): GtkColumnViewColumn_autoptr = o
  extension (v: GtkColumnViewColumn_autoptr)
    inline def value: Ptr[GtkColumnViewColumn] = v

opaque type GtkColumnViewColumn_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkColumnViewColumn_listautoptr: 
  given _tag: Tag[GtkColumnViewColumn_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkColumnViewColumn_listautoptr = o
  extension (v: GtkColumnViewColumn_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkColumnViewColumn_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkColumnViewColumn_queueautoptr: 
  given _tag: Tag[GtkColumnViewColumn_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkColumnViewColumn_queueautoptr = o
  extension (v: GtkColumnViewColumn_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkColumnViewColumn_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkColumnViewColumn_slistautoptr: 
  given _tag: Tag[GtkColumnViewColumn_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkColumnViewColumn_slistautoptr = o
  extension (v: GtkColumnViewColumn_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkColumnViewRowClass_autoptr = Ptr[GtkColumnViewRowClass]
object GtkColumnViewRowClass_autoptr: 
  given _tag: Tag[GtkColumnViewRowClass_autoptr] = Tag.Ptr[GtkColumnViewRowClass](GtkColumnViewRowClass._tag)
  inline def apply(inline o: Ptr[GtkColumnViewRowClass]): GtkColumnViewRowClass_autoptr = o
  extension (v: GtkColumnViewRowClass_autoptr)
    inline def value: Ptr[GtkColumnViewRowClass] = v

opaque type GtkColumnViewRowClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkColumnViewRowClass_listautoptr: 
  given _tag: Tag[GtkColumnViewRowClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkColumnViewRowClass_listautoptr = o
  extension (v: GtkColumnViewRowClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkColumnViewRowClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkColumnViewRowClass_queueautoptr: 
  given _tag: Tag[GtkColumnViewRowClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkColumnViewRowClass_queueautoptr = o
  extension (v: GtkColumnViewRowClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkColumnViewRowClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkColumnViewRowClass_slistautoptr: 
  given _tag: Tag[GtkColumnViewRowClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkColumnViewRowClass_slistautoptr = o
  extension (v: GtkColumnViewRowClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkColumnViewRow_autoptr = Ptr[GtkColumnViewRow]
object GtkColumnViewRow_autoptr: 
  given _tag: Tag[GtkColumnViewRow_autoptr] = Tag.Ptr[GtkColumnViewRow](GtkColumnViewRow._tag)
  inline def apply(inline o: Ptr[GtkColumnViewRow]): GtkColumnViewRow_autoptr = o
  extension (v: GtkColumnViewRow_autoptr)
    inline def value: Ptr[GtkColumnViewRow] = v

opaque type GtkColumnViewRow_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkColumnViewRow_listautoptr: 
  given _tag: Tag[GtkColumnViewRow_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkColumnViewRow_listautoptr = o
  extension (v: GtkColumnViewRow_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkColumnViewRow_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkColumnViewRow_queueautoptr: 
  given _tag: Tag[GtkColumnViewRow_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkColumnViewRow_queueautoptr = o
  extension (v: GtkColumnViewRow_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkColumnViewRow_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkColumnViewRow_slistautoptr: 
  given _tag: Tag[GtkColumnViewRow_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkColumnViewRow_slistautoptr = o
  extension (v: GtkColumnViewRow_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkColumnViewSorterClass_autoptr = Ptr[GtkColumnViewSorterClass]
object GtkColumnViewSorterClass_autoptr: 
  given _tag: Tag[GtkColumnViewSorterClass_autoptr] = Tag.Ptr[GtkColumnViewSorterClass](GtkColumnViewSorterClass._tag)
  inline def apply(inline o: Ptr[GtkColumnViewSorterClass]): GtkColumnViewSorterClass_autoptr = o
  extension (v: GtkColumnViewSorterClass_autoptr)
    inline def value: Ptr[GtkColumnViewSorterClass] = v

opaque type GtkColumnViewSorterClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkColumnViewSorterClass_listautoptr: 
  given _tag: Tag[GtkColumnViewSorterClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkColumnViewSorterClass_listautoptr = o
  extension (v: GtkColumnViewSorterClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkColumnViewSorterClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkColumnViewSorterClass_queueautoptr: 
  given _tag: Tag[GtkColumnViewSorterClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkColumnViewSorterClass_queueautoptr = o
  extension (v: GtkColumnViewSorterClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkColumnViewSorterClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkColumnViewSorterClass_slistautoptr: 
  given _tag: Tag[GtkColumnViewSorterClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkColumnViewSorterClass_slistautoptr = o
  extension (v: GtkColumnViewSorterClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkColumnViewSorter_autoptr = Ptr[GtkColumnViewSorter]
object GtkColumnViewSorter_autoptr: 
  given _tag: Tag[GtkColumnViewSorter_autoptr] = Tag.Ptr[GtkColumnViewSorter](GtkColumnViewSorter._tag)
  inline def apply(inline o: Ptr[GtkColumnViewSorter]): GtkColumnViewSorter_autoptr = o
  extension (v: GtkColumnViewSorter_autoptr)
    inline def value: Ptr[GtkColumnViewSorter] = v

opaque type GtkColumnViewSorter_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkColumnViewSorter_listautoptr: 
  given _tag: Tag[GtkColumnViewSorter_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkColumnViewSorter_listautoptr = o
  extension (v: GtkColumnViewSorter_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkColumnViewSorter_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkColumnViewSorter_queueautoptr: 
  given _tag: Tag[GtkColumnViewSorter_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkColumnViewSorter_queueautoptr = o
  extension (v: GtkColumnViewSorter_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkColumnViewSorter_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkColumnViewSorter_slistautoptr: 
  given _tag: Tag[GtkColumnViewSorter_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkColumnViewSorter_slistautoptr = o
  extension (v: GtkColumnViewSorter_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkComboBoxText_autoptr = Ptr[GtkComboBoxText]
object GtkComboBoxText_autoptr: 
  given _tag: Tag[GtkComboBoxText_autoptr] = Tag.Ptr[GtkComboBoxText](GtkComboBoxText._tag)
  inline def apply(inline o: Ptr[GtkComboBoxText]): GtkComboBoxText_autoptr = o
  extension (v: GtkComboBoxText_autoptr)
    inline def value: Ptr[GtkComboBoxText] = v

opaque type GtkComboBoxText_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkComboBoxText_listautoptr: 
  given _tag: Tag[GtkComboBoxText_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkComboBoxText_listautoptr = o
  extension (v: GtkComboBoxText_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkComboBoxText_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkComboBoxText_queueautoptr: 
  given _tag: Tag[GtkComboBoxText_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkComboBoxText_queueautoptr = o
  extension (v: GtkComboBoxText_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkComboBoxText_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkComboBoxText_slistautoptr: 
  given _tag: Tag[GtkComboBoxText_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkComboBoxText_slistautoptr = o
  extension (v: GtkComboBoxText_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkComboBox_autoptr = Ptr[GtkComboBox]
object GtkComboBox_autoptr: 
  given _tag: Tag[GtkComboBox_autoptr] = Tag.Ptr[GtkComboBox](GtkComboBox._tag)
  inline def apply(inline o: Ptr[GtkComboBox]): GtkComboBox_autoptr = o
  extension (v: GtkComboBox_autoptr)
    inline def value: Ptr[GtkComboBox] = v

opaque type GtkComboBox_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkComboBox_listautoptr: 
  given _tag: Tag[GtkComboBox_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkComboBox_listautoptr = o
  extension (v: GtkComboBox_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkComboBox_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkComboBox_queueautoptr: 
  given _tag: Tag[GtkComboBox_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkComboBox_queueautoptr = o
  extension (v: GtkComboBox_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkComboBox_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkComboBox_slistautoptr: 
  given _tag: Tag[GtkComboBox_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkComboBox_slistautoptr = o
  extension (v: GtkComboBox_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkConstraintClass_autoptr = Ptr[GtkConstraintClass]
object GtkConstraintClass_autoptr: 
  given _tag: Tag[GtkConstraintClass_autoptr] = Tag.Ptr[GtkConstraintClass](GtkConstraintClass._tag)
  inline def apply(inline o: Ptr[GtkConstraintClass]): GtkConstraintClass_autoptr = o
  extension (v: GtkConstraintClass_autoptr)
    inline def value: Ptr[GtkConstraintClass] = v

opaque type GtkConstraintClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkConstraintClass_listautoptr: 
  given _tag: Tag[GtkConstraintClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkConstraintClass_listautoptr = o
  extension (v: GtkConstraintClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkConstraintClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkConstraintClass_queueautoptr: 
  given _tag: Tag[GtkConstraintClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkConstraintClass_queueautoptr = o
  extension (v: GtkConstraintClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkConstraintClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkConstraintClass_slistautoptr: 
  given _tag: Tag[GtkConstraintClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkConstraintClass_slistautoptr = o
  extension (v: GtkConstraintClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkConstraintGuideClass_autoptr = Ptr[GtkConstraintGuideClass]
object GtkConstraintGuideClass_autoptr: 
  given _tag: Tag[GtkConstraintGuideClass_autoptr] = Tag.Ptr[GtkConstraintGuideClass](GtkConstraintGuideClass._tag)
  inline def apply(inline o: Ptr[GtkConstraintGuideClass]): GtkConstraintGuideClass_autoptr = o
  extension (v: GtkConstraintGuideClass_autoptr)
    inline def value: Ptr[GtkConstraintGuideClass] = v

opaque type GtkConstraintGuideClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkConstraintGuideClass_listautoptr: 
  given _tag: Tag[GtkConstraintGuideClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkConstraintGuideClass_listautoptr = o
  extension (v: GtkConstraintGuideClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkConstraintGuideClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkConstraintGuideClass_queueautoptr: 
  given _tag: Tag[GtkConstraintGuideClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkConstraintGuideClass_queueautoptr = o
  extension (v: GtkConstraintGuideClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkConstraintGuideClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkConstraintGuideClass_slistautoptr: 
  given _tag: Tag[GtkConstraintGuideClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkConstraintGuideClass_slistautoptr = o
  extension (v: GtkConstraintGuideClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkConstraintGuide_autoptr = Ptr[GtkConstraintGuide]
object GtkConstraintGuide_autoptr: 
  given _tag: Tag[GtkConstraintGuide_autoptr] = Tag.Ptr[GtkConstraintGuide](GtkConstraintGuide._tag)
  inline def apply(inline o: Ptr[GtkConstraintGuide]): GtkConstraintGuide_autoptr = o
  extension (v: GtkConstraintGuide_autoptr)
    inline def value: Ptr[GtkConstraintGuide] = v

opaque type GtkConstraintGuide_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkConstraintGuide_listautoptr: 
  given _tag: Tag[GtkConstraintGuide_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkConstraintGuide_listautoptr = o
  extension (v: GtkConstraintGuide_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkConstraintGuide_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkConstraintGuide_queueautoptr: 
  given _tag: Tag[GtkConstraintGuide_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkConstraintGuide_queueautoptr = o
  extension (v: GtkConstraintGuide_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkConstraintGuide_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkConstraintGuide_slistautoptr: 
  given _tag: Tag[GtkConstraintGuide_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkConstraintGuide_slistautoptr = o
  extension (v: GtkConstraintGuide_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkConstraintLayoutChildClass_autoptr = Ptr[GtkConstraintLayoutChildClass]
object GtkConstraintLayoutChildClass_autoptr: 
  given _tag: Tag[GtkConstraintLayoutChildClass_autoptr] = Tag.Ptr[GtkConstraintLayoutChildClass](GtkConstraintLayoutChildClass._tag)
  inline def apply(inline o: Ptr[GtkConstraintLayoutChildClass]): GtkConstraintLayoutChildClass_autoptr = o
  extension (v: GtkConstraintLayoutChildClass_autoptr)
    inline def value: Ptr[GtkConstraintLayoutChildClass] = v

opaque type GtkConstraintLayoutChildClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkConstraintLayoutChildClass_listautoptr: 
  given _tag: Tag[GtkConstraintLayoutChildClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkConstraintLayoutChildClass_listautoptr = o
  extension (v: GtkConstraintLayoutChildClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkConstraintLayoutChildClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkConstraintLayoutChildClass_queueautoptr: 
  given _tag: Tag[GtkConstraintLayoutChildClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkConstraintLayoutChildClass_queueautoptr = o
  extension (v: GtkConstraintLayoutChildClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkConstraintLayoutChildClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkConstraintLayoutChildClass_slistautoptr: 
  given _tag: Tag[GtkConstraintLayoutChildClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkConstraintLayoutChildClass_slistautoptr = o
  extension (v: GtkConstraintLayoutChildClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkConstraintLayoutChild_autoptr = Ptr[GtkConstraintLayoutChild]
object GtkConstraintLayoutChild_autoptr: 
  given _tag: Tag[GtkConstraintLayoutChild_autoptr] = Tag.Ptr[GtkConstraintLayoutChild](GtkConstraintLayoutChild._tag)
  inline def apply(inline o: Ptr[GtkConstraintLayoutChild]): GtkConstraintLayoutChild_autoptr = o
  extension (v: GtkConstraintLayoutChild_autoptr)
    inline def value: Ptr[GtkConstraintLayoutChild] = v

opaque type GtkConstraintLayoutChild_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkConstraintLayoutChild_listautoptr: 
  given _tag: Tag[GtkConstraintLayoutChild_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkConstraintLayoutChild_listautoptr = o
  extension (v: GtkConstraintLayoutChild_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkConstraintLayoutChild_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkConstraintLayoutChild_queueautoptr: 
  given _tag: Tag[GtkConstraintLayoutChild_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkConstraintLayoutChild_queueautoptr = o
  extension (v: GtkConstraintLayoutChild_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkConstraintLayoutChild_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkConstraintLayoutChild_slistautoptr: 
  given _tag: Tag[GtkConstraintLayoutChild_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkConstraintLayoutChild_slistautoptr = o
  extension (v: GtkConstraintLayoutChild_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkConstraintLayoutClass_autoptr = Ptr[GtkConstraintLayoutClass]
object GtkConstraintLayoutClass_autoptr: 
  given _tag: Tag[GtkConstraintLayoutClass_autoptr] = Tag.Ptr[GtkConstraintLayoutClass](GtkConstraintLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkConstraintLayoutClass]): GtkConstraintLayoutClass_autoptr = o
  extension (v: GtkConstraintLayoutClass_autoptr)
    inline def value: Ptr[GtkConstraintLayoutClass] = v

opaque type GtkConstraintLayoutClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkConstraintLayoutClass_listautoptr: 
  given _tag: Tag[GtkConstraintLayoutClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkConstraintLayoutClass_listautoptr = o
  extension (v: GtkConstraintLayoutClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkConstraintLayoutClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkConstraintLayoutClass_queueautoptr: 
  given _tag: Tag[GtkConstraintLayoutClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkConstraintLayoutClass_queueautoptr = o
  extension (v: GtkConstraintLayoutClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkConstraintLayoutClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkConstraintLayoutClass_slistautoptr: 
  given _tag: Tag[GtkConstraintLayoutClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkConstraintLayoutClass_slistautoptr = o
  extension (v: GtkConstraintLayoutClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkConstraintLayout_autoptr = Ptr[GtkConstraintLayout]
object GtkConstraintLayout_autoptr: 
  given _tag: Tag[GtkConstraintLayout_autoptr] = Tag.Ptr[GtkConstraintLayout](GtkConstraintLayout._tag)
  inline def apply(inline o: Ptr[GtkConstraintLayout]): GtkConstraintLayout_autoptr = o
  extension (v: GtkConstraintLayout_autoptr)
    inline def value: Ptr[GtkConstraintLayout] = v

opaque type GtkConstraintLayout_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkConstraintLayout_listautoptr: 
  given _tag: Tag[GtkConstraintLayout_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkConstraintLayout_listautoptr = o
  extension (v: GtkConstraintLayout_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkConstraintLayout_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkConstraintLayout_queueautoptr: 
  given _tag: Tag[GtkConstraintLayout_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkConstraintLayout_queueautoptr = o
  extension (v: GtkConstraintLayout_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkConstraintLayout_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkConstraintLayout_slistautoptr: 
  given _tag: Tag[GtkConstraintLayout_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkConstraintLayout_slistautoptr = o
  extension (v: GtkConstraintLayout_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkConstraintTarget_autoptr = Ptr[GtkConstraintTarget]
object GtkConstraintTarget_autoptr: 
  given _tag: Tag[GtkConstraintTarget_autoptr] = Tag.Ptr[GtkConstraintTarget](GtkConstraintTarget._tag)
  inline def apply(inline o: Ptr[GtkConstraintTarget]): GtkConstraintTarget_autoptr = o
  extension (v: GtkConstraintTarget_autoptr)
    inline def value: Ptr[GtkConstraintTarget] = v

opaque type GtkConstraintTarget_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkConstraintTarget_listautoptr: 
  given _tag: Tag[GtkConstraintTarget_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkConstraintTarget_listautoptr = o
  extension (v: GtkConstraintTarget_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkConstraintTarget_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkConstraintTarget_queueautoptr: 
  given _tag: Tag[GtkConstraintTarget_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkConstraintTarget_queueautoptr = o
  extension (v: GtkConstraintTarget_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkConstraintTarget_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkConstraintTarget_slistautoptr: 
  given _tag: Tag[GtkConstraintTarget_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkConstraintTarget_slistautoptr = o
  extension (v: GtkConstraintTarget_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkConstraint_autoptr = Ptr[GtkConstraint]
object GtkConstraint_autoptr: 
  given _tag: Tag[GtkConstraint_autoptr] = Tag.Ptr[GtkConstraint](GtkConstraint._tag)
  inline def apply(inline o: Ptr[GtkConstraint]): GtkConstraint_autoptr = o
  extension (v: GtkConstraint_autoptr)
    inline def value: Ptr[GtkConstraint] = v

opaque type GtkConstraint_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkConstraint_listautoptr: 
  given _tag: Tag[GtkConstraint_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkConstraint_listautoptr = o
  extension (v: GtkConstraint_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkConstraint_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkConstraint_queueautoptr: 
  given _tag: Tag[GtkConstraint_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkConstraint_queueautoptr = o
  extension (v: GtkConstraint_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkConstraint_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkConstraint_slistautoptr: 
  given _tag: Tag[GtkConstraint_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkConstraint_slistautoptr = o
  extension (v: GtkConstraint_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkCssProvider_autoptr = Ptr[GtkCssProvider]
object GtkCssProvider_autoptr: 
  given _tag: Tag[GtkCssProvider_autoptr] = Tag.Ptr[GtkCssProvider](GtkCssProvider._tag)
  inline def apply(inline o: Ptr[GtkCssProvider]): GtkCssProvider_autoptr = o
  extension (v: GtkCssProvider_autoptr)
    inline def value: Ptr[GtkCssProvider] = v

opaque type GtkCssProvider_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkCssProvider_listautoptr: 
  given _tag: Tag[GtkCssProvider_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkCssProvider_listautoptr = o
  extension (v: GtkCssProvider_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkCssProvider_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkCssProvider_queueautoptr: 
  given _tag: Tag[GtkCssProvider_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkCssProvider_queueautoptr = o
  extension (v: GtkCssProvider_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkCssProvider_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkCssProvider_slistautoptr: 
  given _tag: Tag[GtkCssProvider_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkCssProvider_slistautoptr = o
  extension (v: GtkCssProvider_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkCustomAllocateFunc: : the widget to allocate : the new width of the widget : the new height of the widget : the new baseline of the widget, or -1
*/
opaque type GtkCustomAllocateFunc = CFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit]
object GtkCustomAllocateFunc: 
  given _tag: Tag[GtkCustomAllocateFunc] = Tag.materializeCFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkCustomAllocateFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit]): GtkCustomAllocateFunc = o
  extension (v: GtkCustomAllocateFunc)
    inline def value: CFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkCustomFilterClass_autoptr = Ptr[GtkCustomFilterClass]
object GtkCustomFilterClass_autoptr: 
  given _tag: Tag[GtkCustomFilterClass_autoptr] = Tag.Ptr[GtkCustomFilterClass](GtkCustomFilterClass._tag)
  inline def apply(inline o: Ptr[GtkCustomFilterClass]): GtkCustomFilterClass_autoptr = o
  extension (v: GtkCustomFilterClass_autoptr)
    inline def value: Ptr[GtkCustomFilterClass] = v

opaque type GtkCustomFilterClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkCustomFilterClass_listautoptr: 
  given _tag: Tag[GtkCustomFilterClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkCustomFilterClass_listautoptr = o
  extension (v: GtkCustomFilterClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkCustomFilterClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkCustomFilterClass_queueautoptr: 
  given _tag: Tag[GtkCustomFilterClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkCustomFilterClass_queueautoptr = o
  extension (v: GtkCustomFilterClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkCustomFilterClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkCustomFilterClass_slistautoptr: 
  given _tag: Tag[GtkCustomFilterClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkCustomFilterClass_slistautoptr = o
  extension (v: GtkCustomFilterClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkCustomFilterFunc: : (type GObject): The item to be matched _data: user data
*/
opaque type GtkCustomFilterFunc = CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GtkCustomFilterFunc: 
  given _tag: Tag[GtkCustomFilterFunc] = Tag.materializeCFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkCustomFilterFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GtkCustomFilterFunc = o
  extension (v: GtkCustomFilterFunc)
    inline def value: CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkCustomFilter_autoptr = Ptr[GtkCustomFilter]
object GtkCustomFilter_autoptr: 
  given _tag: Tag[GtkCustomFilter_autoptr] = Tag.Ptr[GtkCustomFilter](GtkCustomFilter._tag)
  inline def apply(inline o: Ptr[GtkCustomFilter]): GtkCustomFilter_autoptr = o
  extension (v: GtkCustomFilter_autoptr)
    inline def value: Ptr[GtkCustomFilter] = v

opaque type GtkCustomFilter_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkCustomFilter_listautoptr: 
  given _tag: Tag[GtkCustomFilter_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkCustomFilter_listautoptr = o
  extension (v: GtkCustomFilter_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkCustomFilter_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkCustomFilter_queueautoptr: 
  given _tag: Tag[GtkCustomFilter_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkCustomFilter_queueautoptr = o
  extension (v: GtkCustomFilter_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkCustomFilter_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkCustomFilter_slistautoptr: 
  given _tag: Tag[GtkCustomFilter_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkCustomFilter_slistautoptr = o
  extension (v: GtkCustomFilter_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkCustomLayoutClass_autoptr = Ptr[GtkCustomLayoutClass]
object GtkCustomLayoutClass_autoptr: 
  given _tag: Tag[GtkCustomLayoutClass_autoptr] = Tag.Ptr[GtkCustomLayoutClass](GtkCustomLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkCustomLayoutClass]): GtkCustomLayoutClass_autoptr = o
  extension (v: GtkCustomLayoutClass_autoptr)
    inline def value: Ptr[GtkCustomLayoutClass] = v

opaque type GtkCustomLayoutClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkCustomLayoutClass_listautoptr: 
  given _tag: Tag[GtkCustomLayoutClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkCustomLayoutClass_listautoptr = o
  extension (v: GtkCustomLayoutClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkCustomLayoutClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkCustomLayoutClass_queueautoptr: 
  given _tag: Tag[GtkCustomLayoutClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkCustomLayoutClass_queueautoptr = o
  extension (v: GtkCustomLayoutClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkCustomLayoutClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkCustomLayoutClass_slistautoptr: 
  given _tag: Tag[GtkCustomLayoutClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkCustomLayoutClass_slistautoptr = o
  extension (v: GtkCustomLayoutClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkCustomLayout_autoptr = Ptr[GtkCustomLayout]
object GtkCustomLayout_autoptr: 
  given _tag: Tag[GtkCustomLayout_autoptr] = Tag.Ptr[GtkCustomLayout](GtkCustomLayout._tag)
  inline def apply(inline o: Ptr[GtkCustomLayout]): GtkCustomLayout_autoptr = o
  extension (v: GtkCustomLayout_autoptr)
    inline def value: Ptr[GtkCustomLayout] = v

opaque type GtkCustomLayout_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkCustomLayout_listautoptr: 
  given _tag: Tag[GtkCustomLayout_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkCustomLayout_listautoptr = o
  extension (v: GtkCustomLayout_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkCustomLayout_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkCustomLayout_queueautoptr: 
  given _tag: Tag[GtkCustomLayout_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkCustomLayout_queueautoptr = o
  extension (v: GtkCustomLayout_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkCustomLayout_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkCustomLayout_slistautoptr: 
  given _tag: Tag[GtkCustomLayout_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkCustomLayout_slistautoptr = o
  extension (v: GtkCustomLayout_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkCustomMeasureFunc: : the widget to be measured : the direction to be measured _size: the size to be measured for : (out): the measured minimum size of the widget : (out): the measured natural size of the widget _baseline: (out): the measured minimum baseline of the widget _baseline: (out): the measured natural baseline of the widget
*/
opaque type GtkCustomMeasureFunc = CFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit]
object GtkCustomMeasureFunc: 
  given _tag: Tag[GtkCustomMeasureFunc] = Tag.materializeCFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkCustomMeasureFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit]): GtkCustomMeasureFunc = o
  extension (v: GtkCustomMeasureFunc)
    inline def value: CFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * GtkCustomRequestModeFunc: : the widget to be queried
*/
opaque type GtkCustomRequestModeFunc = CFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode]
object GtkCustomRequestModeFunc: 
  given _tag: Tag[GtkCustomRequestModeFunc] = Tag.materializeCFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkCustomRequestModeFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode]): GtkCustomRequestModeFunc = o
  extension (v: GtkCustomRequestModeFunc)
    inline def value: CFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkCustomSorterClass_autoptr = Ptr[GtkCustomSorterClass]
object GtkCustomSorterClass_autoptr: 
  given _tag: Tag[GtkCustomSorterClass_autoptr] = Tag.Ptr[GtkCustomSorterClass](GtkCustomSorterClass._tag)
  inline def apply(inline o: Ptr[GtkCustomSorterClass]): GtkCustomSorterClass_autoptr = o
  extension (v: GtkCustomSorterClass_autoptr)
    inline def value: Ptr[GtkCustomSorterClass] = v

opaque type GtkCustomSorterClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkCustomSorterClass_listautoptr: 
  given _tag: Tag[GtkCustomSorterClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkCustomSorterClass_listautoptr = o
  extension (v: GtkCustomSorterClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkCustomSorterClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkCustomSorterClass_queueautoptr: 
  given _tag: Tag[GtkCustomSorterClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkCustomSorterClass_queueautoptr = o
  extension (v: GtkCustomSorterClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkCustomSorterClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkCustomSorterClass_slistautoptr: 
  given _tag: Tag[GtkCustomSorterClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkCustomSorterClass_slistautoptr = o
  extension (v: GtkCustomSorterClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkCustomSorter_autoptr = Ptr[GtkCustomSorter]
object GtkCustomSorter_autoptr: 
  given _tag: Tag[GtkCustomSorter_autoptr] = Tag.Ptr[GtkCustomSorter](GtkCustomSorter._tag)
  inline def apply(inline o: Ptr[GtkCustomSorter]): GtkCustomSorter_autoptr = o
  extension (v: GtkCustomSorter_autoptr)
    inline def value: Ptr[GtkCustomSorter] = v

opaque type GtkCustomSorter_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkCustomSorter_listautoptr: 
  given _tag: Tag[GtkCustomSorter_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkCustomSorter_listautoptr = o
  extension (v: GtkCustomSorter_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkCustomSorter_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkCustomSorter_queueautoptr: 
  given _tag: Tag[GtkCustomSorter_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkCustomSorter_queueautoptr = o
  extension (v: GtkCustomSorter_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkCustomSorter_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkCustomSorter_slistautoptr: 
  given _tag: Tag[GtkCustomSorter_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkCustomSorter_slistautoptr = o
  extension (v: GtkCustomSorter_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkDialog_autoptr = Ptr[GtkDialog]
object GtkDialog_autoptr: 
  given _tag: Tag[GtkDialog_autoptr] = Tag.Ptr[GtkDialog](GtkDialog._tag)
  inline def apply(inline o: Ptr[GtkDialog]): GtkDialog_autoptr = o
  extension (v: GtkDialog_autoptr)
    inline def value: Ptr[GtkDialog] = v

opaque type GtkDialog_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkDialog_listautoptr: 
  given _tag: Tag[GtkDialog_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkDialog_listautoptr = o
  extension (v: GtkDialog_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkDialog_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkDialog_queueautoptr: 
  given _tag: Tag[GtkDialog_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkDialog_queueautoptr = o
  extension (v: GtkDialog_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkDialog_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkDialog_slistautoptr: 
  given _tag: Tag[GtkDialog_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkDialog_slistautoptr = o
  extension (v: GtkDialog_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkDirectoryListClass_autoptr = Ptr[GtkDirectoryListClass]
object GtkDirectoryListClass_autoptr: 
  given _tag: Tag[GtkDirectoryListClass_autoptr] = Tag.Ptr[GtkDirectoryListClass](GtkDirectoryListClass._tag)
  inline def apply(inline o: Ptr[GtkDirectoryListClass]): GtkDirectoryListClass_autoptr = o
  extension (v: GtkDirectoryListClass_autoptr)
    inline def value: Ptr[GtkDirectoryListClass] = v

opaque type GtkDirectoryListClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkDirectoryListClass_listautoptr: 
  given _tag: Tag[GtkDirectoryListClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkDirectoryListClass_listautoptr = o
  extension (v: GtkDirectoryListClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkDirectoryListClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkDirectoryListClass_queueautoptr: 
  given _tag: Tag[GtkDirectoryListClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkDirectoryListClass_queueautoptr = o
  extension (v: GtkDirectoryListClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkDirectoryListClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkDirectoryListClass_slistautoptr: 
  given _tag: Tag[GtkDirectoryListClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkDirectoryListClass_slistautoptr = o
  extension (v: GtkDirectoryListClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkDirectoryList_autoptr = Ptr[GtkDirectoryList]
object GtkDirectoryList_autoptr: 
  given _tag: Tag[GtkDirectoryList_autoptr] = Tag.Ptr[GtkDirectoryList](GtkDirectoryList._tag)
  inline def apply(inline o: Ptr[GtkDirectoryList]): GtkDirectoryList_autoptr = o
  extension (v: GtkDirectoryList_autoptr)
    inline def value: Ptr[GtkDirectoryList] = v

opaque type GtkDirectoryList_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkDirectoryList_listautoptr: 
  given _tag: Tag[GtkDirectoryList_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkDirectoryList_listautoptr = o
  extension (v: GtkDirectoryList_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkDirectoryList_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkDirectoryList_queueautoptr: 
  given _tag: Tag[GtkDirectoryList_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkDirectoryList_queueautoptr = o
  extension (v: GtkDirectoryList_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkDirectoryList_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkDirectoryList_slistautoptr: 
  given _tag: Tag[GtkDirectoryList_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkDirectoryList_slistautoptr = o
  extension (v: GtkDirectoryList_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkDragIconClass_autoptr = Ptr[GtkDragIconClass]
object GtkDragIconClass_autoptr: 
  given _tag: Tag[GtkDragIconClass_autoptr] = Tag.Ptr[GtkDragIconClass](GtkDragIconClass._tag)
  inline def apply(inline o: Ptr[GtkDragIconClass]): GtkDragIconClass_autoptr = o
  extension (v: GtkDragIconClass_autoptr)
    inline def value: Ptr[GtkDragIconClass] = v

opaque type GtkDragIconClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkDragIconClass_listautoptr: 
  given _tag: Tag[GtkDragIconClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkDragIconClass_listautoptr = o
  extension (v: GtkDragIconClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkDragIconClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkDragIconClass_queueautoptr: 
  given _tag: Tag[GtkDragIconClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkDragIconClass_queueautoptr = o
  extension (v: GtkDragIconClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkDragIconClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkDragIconClass_slistautoptr: 
  given _tag: Tag[GtkDragIconClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkDragIconClass_slistautoptr = o
  extension (v: GtkDragIconClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkDragIcon_autoptr = Ptr[GtkDragIcon]
object GtkDragIcon_autoptr: 
  given _tag: Tag[GtkDragIcon_autoptr] = Tag.Ptr[GtkDragIcon](GtkDragIcon._tag)
  inline def apply(inline o: Ptr[GtkDragIcon]): GtkDragIcon_autoptr = o
  extension (v: GtkDragIcon_autoptr)
    inline def value: Ptr[GtkDragIcon] = v

opaque type GtkDragIcon_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkDragIcon_listautoptr: 
  given _tag: Tag[GtkDragIcon_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkDragIcon_listautoptr = o
  extension (v: GtkDragIcon_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkDragIcon_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkDragIcon_queueautoptr: 
  given _tag: Tag[GtkDragIcon_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkDragIcon_queueautoptr = o
  extension (v: GtkDragIcon_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkDragIcon_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkDragIcon_slistautoptr: 
  given _tag: Tag[GtkDragIcon_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkDragIcon_slistautoptr = o
  extension (v: GtkDragIcon_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkDrawingAreaDrawFunc: _area: the `GtkDrawingArea` to redraw : the context to draw to : the actual width of the contents. This value will be at least as wide as GtkDrawingArea:width. : the actual height of the contents. This value will be at least as wide as GtkDrawingArea:height. _data: (closure): user data
*/
opaque type GtkDrawingAreaDrawFunc = CFuncPtr5[Ptr[GtkDrawingArea], Ptr[_root_.sn.gnome.cairo.internal.cairo_t], CInt, CInt, _root_.sn.gnome.glib.internal.gpointer, Unit]
object GtkDrawingAreaDrawFunc: 
  given _tag: Tag[GtkDrawingAreaDrawFunc] = Tag.materializeCFuncPtr5[Ptr[GtkDrawingArea], Ptr[_root_.sn.gnome.cairo.internal.cairo_t], CInt, CInt, _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkDrawingAreaDrawFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[Ptr[GtkDrawingArea], Ptr[_root_.sn.gnome.cairo.internal.cairo_t], CInt, CInt, _root_.sn.gnome.glib.internal.gpointer, Unit]): GtkDrawingAreaDrawFunc = o
  extension (v: GtkDrawingAreaDrawFunc)
    inline def value: CFuncPtr5[Ptr[GtkDrawingArea], Ptr[_root_.sn.gnome.cairo.internal.cairo_t], CInt, CInt, _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkDrawingArea_autoptr = Ptr[GtkDrawingArea]
object GtkDrawingArea_autoptr: 
  given _tag: Tag[GtkDrawingArea_autoptr] = Tag.Ptr[GtkDrawingArea](GtkDrawingArea._tag)
  inline def apply(inline o: Ptr[GtkDrawingArea]): GtkDrawingArea_autoptr = o
  extension (v: GtkDrawingArea_autoptr)
    inline def value: Ptr[GtkDrawingArea] = v

opaque type GtkDrawingArea_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkDrawingArea_listautoptr: 
  given _tag: Tag[GtkDrawingArea_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkDrawingArea_listautoptr = o
  extension (v: GtkDrawingArea_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkDrawingArea_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkDrawingArea_queueautoptr: 
  given _tag: Tag[GtkDrawingArea_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkDrawingArea_queueautoptr = o
  extension (v: GtkDrawingArea_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkDrawingArea_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkDrawingArea_slistautoptr: 
  given _tag: Tag[GtkDrawingArea_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkDrawingArea_slistautoptr = o
  extension (v: GtkDrawingArea_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkDropDownClass_autoptr = Ptr[GtkDropDownClass]
object GtkDropDownClass_autoptr: 
  given _tag: Tag[GtkDropDownClass_autoptr] = Tag.Ptr[GtkDropDownClass](GtkDropDownClass._tag)
  inline def apply(inline o: Ptr[GtkDropDownClass]): GtkDropDownClass_autoptr = o
  extension (v: GtkDropDownClass_autoptr)
    inline def value: Ptr[GtkDropDownClass] = v

opaque type GtkDropDownClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkDropDownClass_listautoptr: 
  given _tag: Tag[GtkDropDownClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkDropDownClass_listautoptr = o
  extension (v: GtkDropDownClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkDropDownClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkDropDownClass_queueautoptr: 
  given _tag: Tag[GtkDropDownClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkDropDownClass_queueautoptr = o
  extension (v: GtkDropDownClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkDropDownClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkDropDownClass_slistautoptr: 
  given _tag: Tag[GtkDropDownClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkDropDownClass_slistautoptr = o
  extension (v: GtkDropDownClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkDropDown_autoptr = Ptr[GtkDropDown]
object GtkDropDown_autoptr: 
  given _tag: Tag[GtkDropDown_autoptr] = Tag.Ptr[GtkDropDown](GtkDropDown._tag)
  inline def apply(inline o: Ptr[GtkDropDown]): GtkDropDown_autoptr = o
  extension (v: GtkDropDown_autoptr)
    inline def value: Ptr[GtkDropDown] = v

opaque type GtkDropDown_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkDropDown_listautoptr: 
  given _tag: Tag[GtkDropDown_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkDropDown_listautoptr = o
  extension (v: GtkDropDown_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkDropDown_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkDropDown_queueautoptr: 
  given _tag: Tag[GtkDropDown_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkDropDown_queueautoptr = o
  extension (v: GtkDropDown_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkDropDown_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkDropDown_slistautoptr: 
  given _tag: Tag[GtkDropDown_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkDropDown_slistautoptr = o
  extension (v: GtkDropDown_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkEditableLabelClass_autoptr = Ptr[GtkEditableLabelClass]
object GtkEditableLabelClass_autoptr: 
  given _tag: Tag[GtkEditableLabelClass_autoptr] = Tag.Ptr[GtkEditableLabelClass](GtkEditableLabelClass._tag)
  inline def apply(inline o: Ptr[GtkEditableLabelClass]): GtkEditableLabelClass_autoptr = o
  extension (v: GtkEditableLabelClass_autoptr)
    inline def value: Ptr[GtkEditableLabelClass] = v

opaque type GtkEditableLabelClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkEditableLabelClass_listautoptr: 
  given _tag: Tag[GtkEditableLabelClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkEditableLabelClass_listautoptr = o
  extension (v: GtkEditableLabelClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkEditableLabelClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkEditableLabelClass_queueautoptr: 
  given _tag: Tag[GtkEditableLabelClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkEditableLabelClass_queueautoptr = o
  extension (v: GtkEditableLabelClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkEditableLabelClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkEditableLabelClass_slistautoptr: 
  given _tag: Tag[GtkEditableLabelClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkEditableLabelClass_slistautoptr = o
  extension (v: GtkEditableLabelClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkEditableLabel_autoptr = Ptr[GtkEditableLabel]
object GtkEditableLabel_autoptr: 
  given _tag: Tag[GtkEditableLabel_autoptr] = Tag.Ptr[GtkEditableLabel](GtkEditableLabel._tag)
  inline def apply(inline o: Ptr[GtkEditableLabel]): GtkEditableLabel_autoptr = o
  extension (v: GtkEditableLabel_autoptr)
    inline def value: Ptr[GtkEditableLabel] = v

opaque type GtkEditableLabel_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkEditableLabel_listautoptr: 
  given _tag: Tag[GtkEditableLabel_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkEditableLabel_listautoptr = o
  extension (v: GtkEditableLabel_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkEditableLabel_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkEditableLabel_queueautoptr: 
  given _tag: Tag[GtkEditableLabel_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkEditableLabel_queueautoptr = o
  extension (v: GtkEditableLabel_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkEditableLabel_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkEditableLabel_slistautoptr: 
  given _tag: Tag[GtkEditableLabel_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkEditableLabel_slistautoptr = o
  extension (v: GtkEditableLabel_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkEditable_autoptr = Ptr[GtkEditable]
object GtkEditable_autoptr: 
  given _tag: Tag[GtkEditable_autoptr] = Tag.Ptr[GtkEditable](GtkEditable._tag)
  inline def apply(inline o: Ptr[GtkEditable]): GtkEditable_autoptr = o
  extension (v: GtkEditable_autoptr)
    inline def value: Ptr[GtkEditable] = v

opaque type GtkEditable_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkEditable_listautoptr: 
  given _tag: Tag[GtkEditable_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkEditable_listautoptr = o
  extension (v: GtkEditable_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkEditable_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkEditable_queueautoptr: 
  given _tag: Tag[GtkEditable_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkEditable_queueautoptr = o
  extension (v: GtkEditable_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkEditable_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkEditable_slistautoptr: 
  given _tag: Tag[GtkEditable_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkEditable_slistautoptr = o
  extension (v: GtkEditable_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkEntryBuffer_autoptr = Ptr[GtkEntryBuffer]
object GtkEntryBuffer_autoptr: 
  given _tag: Tag[GtkEntryBuffer_autoptr] = Tag.Ptr[GtkEntryBuffer](GtkEntryBuffer._tag)
  inline def apply(inline o: Ptr[GtkEntryBuffer]): GtkEntryBuffer_autoptr = o
  extension (v: GtkEntryBuffer_autoptr)
    inline def value: Ptr[GtkEntryBuffer] = v

opaque type GtkEntryBuffer_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkEntryBuffer_listautoptr: 
  given _tag: Tag[GtkEntryBuffer_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkEntryBuffer_listautoptr = o
  extension (v: GtkEntryBuffer_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkEntryBuffer_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkEntryBuffer_queueautoptr: 
  given _tag: Tag[GtkEntryBuffer_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkEntryBuffer_queueautoptr = o
  extension (v: GtkEntryBuffer_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkEntryBuffer_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkEntryBuffer_slistautoptr: 
  given _tag: Tag[GtkEntryBuffer_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkEntryBuffer_slistautoptr = o
  extension (v: GtkEntryBuffer_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkEntryCompletionMatchFunc: : the `GtkEntryCompletion` : the string to match, normalized and case-folded : a `GtkTreeIter` indicating the row to match _data: user data given to gtk_entry_completion_set_match_func()
*/
opaque type GtkEntryCompletionMatchFunc = CFuncPtr4[Ptr[GtkEntryCompletion], Ptr[CUnsignedChar], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GtkEntryCompletionMatchFunc: 
  given _tag: Tag[GtkEntryCompletionMatchFunc] = Tag.materializeCFuncPtr4[Ptr[GtkEntryCompletion], Ptr[CUnsignedChar], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkEntryCompletionMatchFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GtkEntryCompletion], Ptr[CUnsignedChar], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GtkEntryCompletionMatchFunc = o
  extension (v: GtkEntryCompletionMatchFunc)
    inline def value: CFuncPtr4[Ptr[GtkEntryCompletion], Ptr[CUnsignedChar], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkEntryCompletion_autoptr = Ptr[GtkEntryCompletion]
object GtkEntryCompletion_autoptr: 
  given _tag: Tag[GtkEntryCompletion_autoptr] = Tag.Ptr[GtkEntryCompletion](GtkEntryCompletion._tag)
  inline def apply(inline o: Ptr[GtkEntryCompletion]): GtkEntryCompletion_autoptr = o
  extension (v: GtkEntryCompletion_autoptr)
    inline def value: Ptr[GtkEntryCompletion] = v

opaque type GtkEntryCompletion_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkEntryCompletion_listautoptr: 
  given _tag: Tag[GtkEntryCompletion_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkEntryCompletion_listautoptr = o
  extension (v: GtkEntryCompletion_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkEntryCompletion_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkEntryCompletion_queueautoptr: 
  given _tag: Tag[GtkEntryCompletion_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkEntryCompletion_queueautoptr = o
  extension (v: GtkEntryCompletion_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkEntryCompletion_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkEntryCompletion_slistautoptr: 
  given _tag: Tag[GtkEntryCompletion_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkEntryCompletion_slistautoptr = o
  extension (v: GtkEntryCompletion_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkEntry_autoptr = Ptr[GtkEntry]
object GtkEntry_autoptr: 
  given _tag: Tag[GtkEntry_autoptr] = Tag.Ptr[GtkEntry](GtkEntry._tag)
  inline def apply(inline o: Ptr[GtkEntry]): GtkEntry_autoptr = o
  extension (v: GtkEntry_autoptr)
    inline def value: Ptr[GtkEntry] = v

opaque type GtkEntry_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkEntry_listautoptr: 
  given _tag: Tag[GtkEntry_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkEntry_listautoptr = o
  extension (v: GtkEntry_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkEntry_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkEntry_queueautoptr: 
  given _tag: Tag[GtkEntry_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkEntry_queueautoptr = o
  extension (v: GtkEntry_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkEntry_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkEntry_slistautoptr: 
  given _tag: Tag[GtkEntry_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkEntry_slistautoptr = o
  extension (v: GtkEntry_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkEventController_autoptr = Ptr[GtkEventController]
object GtkEventController_autoptr: 
  given _tag: Tag[GtkEventController_autoptr] = Tag.Ptr[GtkEventController](GtkEventController._tag)
  inline def apply(inline o: Ptr[GtkEventController]): GtkEventController_autoptr = o
  extension (v: GtkEventController_autoptr)
    inline def value: Ptr[GtkEventController] = v

opaque type GtkEventController_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkEventController_listautoptr: 
  given _tag: Tag[GtkEventController_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkEventController_listautoptr = o
  extension (v: GtkEventController_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkEventController_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkEventController_queueautoptr: 
  given _tag: Tag[GtkEventController_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkEventController_queueautoptr = o
  extension (v: GtkEventController_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkEventController_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkEventController_slistautoptr: 
  given _tag: Tag[GtkEventController_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkEventController_slistautoptr = o
  extension (v: GtkEventController_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkEveryFilterClass_autoptr = Ptr[GtkEveryFilterClass]
object GtkEveryFilterClass_autoptr: 
  given _tag: Tag[GtkEveryFilterClass_autoptr] = Tag.Ptr[GtkEveryFilterClass](GtkEveryFilterClass._tag)
  inline def apply(inline o: Ptr[GtkEveryFilterClass]): GtkEveryFilterClass_autoptr = o
  extension (v: GtkEveryFilterClass_autoptr)
    inline def value: Ptr[GtkEveryFilterClass] = v

opaque type GtkEveryFilterClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkEveryFilterClass_listautoptr: 
  given _tag: Tag[GtkEveryFilterClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkEveryFilterClass_listautoptr = o
  extension (v: GtkEveryFilterClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkEveryFilterClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkEveryFilterClass_queueautoptr: 
  given _tag: Tag[GtkEveryFilterClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkEveryFilterClass_queueautoptr = o
  extension (v: GtkEveryFilterClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkEveryFilterClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkEveryFilterClass_slistautoptr: 
  given _tag: Tag[GtkEveryFilterClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkEveryFilterClass_slistautoptr = o
  extension (v: GtkEveryFilterClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkEveryFilter_autoptr = Ptr[GtkEveryFilter]
object GtkEveryFilter_autoptr: 
  given _tag: Tag[GtkEveryFilter_autoptr] = Tag.Ptr[GtkEveryFilter](GtkEveryFilter._tag)
  inline def apply(inline o: Ptr[GtkEveryFilter]): GtkEveryFilter_autoptr = o
  extension (v: GtkEveryFilter_autoptr)
    inline def value: Ptr[GtkEveryFilter] = v

opaque type GtkEveryFilter_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkEveryFilter_listautoptr: 
  given _tag: Tag[GtkEveryFilter_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkEveryFilter_listautoptr = o
  extension (v: GtkEveryFilter_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkEveryFilter_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkEveryFilter_queueautoptr: 
  given _tag: Tag[GtkEveryFilter_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkEveryFilter_queueautoptr = o
  extension (v: GtkEveryFilter_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkEveryFilter_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkEveryFilter_slistautoptr: 
  given _tag: Tag[GtkEveryFilter_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkEveryFilter_slistautoptr = o
  extension (v: GtkEveryFilter_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkExpander_autoptr = Ptr[GtkExpander]
object GtkExpander_autoptr: 
  given _tag: Tag[GtkExpander_autoptr] = Tag.Ptr[GtkExpander](GtkExpander._tag)
  inline def apply(inline o: Ptr[GtkExpander]): GtkExpander_autoptr = o
  extension (v: GtkExpander_autoptr)
    inline def value: Ptr[GtkExpander] = v

opaque type GtkExpander_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkExpander_listautoptr: 
  given _tag: Tag[GtkExpander_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkExpander_listautoptr = o
  extension (v: GtkExpander_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkExpander_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkExpander_queueautoptr: 
  given _tag: Tag[GtkExpander_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkExpander_queueautoptr = o
  extension (v: GtkExpander_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkExpander_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkExpander_slistautoptr: 
  given _tag: Tag[GtkExpander_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkExpander_slistautoptr = o
  extension (v: GtkExpander_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkExpressionNotify: _data: data passed to gtk_expression_watch()
*/
opaque type GtkExpressionNotify = CFuncPtr1[_root_.sn.gnome.glib.internal.gpointer, Unit]
object GtkExpressionNotify: 
  given _tag: Tag[GtkExpressionNotify] = Tag.materializeCFuncPtr1[_root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkExpressionNotify = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[_root_.sn.gnome.glib.internal.gpointer, Unit]): GtkExpressionNotify = o
  extension (v: GtkExpressionNotify)
    inline def value: CFuncPtr1[_root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkExpression_autoptr = Ptr[GtkExpression]
object GtkExpression_autoptr: 
  given _tag: Tag[GtkExpression_autoptr] = Tag.Ptr[GtkExpression](GtkExpression._tag)
  inline def apply(inline o: Ptr[GtkExpression]): GtkExpression_autoptr = o
  extension (v: GtkExpression_autoptr)
    inline def value: Ptr[GtkExpression] = v

opaque type GtkExpression_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkExpression_listautoptr: 
  given _tag: Tag[GtkExpression_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkExpression_listautoptr = o
  extension (v: GtkExpression_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkExpression_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkExpression_queueautoptr: 
  given _tag: Tag[GtkExpression_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkExpression_queueautoptr = o
  extension (v: GtkExpression_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkExpression_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkExpression_slistautoptr: 
  given _tag: Tag[GtkExpression_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkExpression_slistautoptr = o
  extension (v: GtkExpression_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkFileChooserDialog_autoptr = Ptr[GtkFileChooserDialog]
object GtkFileChooserDialog_autoptr: 
  given _tag: Tag[GtkFileChooserDialog_autoptr] = Tag.Ptr[GtkFileChooserDialog](GtkFileChooserDialog._tag)
  inline def apply(inline o: Ptr[GtkFileChooserDialog]): GtkFileChooserDialog_autoptr = o
  extension (v: GtkFileChooserDialog_autoptr)
    inline def value: Ptr[GtkFileChooserDialog] = v

opaque type GtkFileChooserDialog_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFileChooserDialog_listautoptr: 
  given _tag: Tag[GtkFileChooserDialog_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFileChooserDialog_listautoptr = o
  extension (v: GtkFileChooserDialog_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFileChooserDialog_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFileChooserDialog_queueautoptr: 
  given _tag: Tag[GtkFileChooserDialog_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFileChooserDialog_queueautoptr = o
  extension (v: GtkFileChooserDialog_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFileChooserDialog_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFileChooserDialog_slistautoptr: 
  given _tag: Tag[GtkFileChooserDialog_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFileChooserDialog_slistautoptr = o
  extension (v: GtkFileChooserDialog_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkFileChooserNativeClass_autoptr = Ptr[GtkFileChooserNativeClass]
object GtkFileChooserNativeClass_autoptr: 
  given _tag: Tag[GtkFileChooserNativeClass_autoptr] = Tag.Ptr[GtkFileChooserNativeClass](GtkFileChooserNativeClass._tag)
  inline def apply(inline o: Ptr[GtkFileChooserNativeClass]): GtkFileChooserNativeClass_autoptr = o
  extension (v: GtkFileChooserNativeClass_autoptr)
    inline def value: Ptr[GtkFileChooserNativeClass] = v

opaque type GtkFileChooserNativeClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFileChooserNativeClass_listautoptr: 
  given _tag: Tag[GtkFileChooserNativeClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFileChooserNativeClass_listautoptr = o
  extension (v: GtkFileChooserNativeClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFileChooserNativeClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFileChooserNativeClass_queueautoptr: 
  given _tag: Tag[GtkFileChooserNativeClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFileChooserNativeClass_queueautoptr = o
  extension (v: GtkFileChooserNativeClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFileChooserNativeClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFileChooserNativeClass_slistautoptr: 
  given _tag: Tag[GtkFileChooserNativeClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFileChooserNativeClass_slistautoptr = o
  extension (v: GtkFileChooserNativeClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkFileChooserNative_autoptr = Ptr[GtkFileChooserNative]
object GtkFileChooserNative_autoptr: 
  given _tag: Tag[GtkFileChooserNative_autoptr] = Tag.Ptr[GtkFileChooserNative](GtkFileChooserNative._tag)
  inline def apply(inline o: Ptr[GtkFileChooserNative]): GtkFileChooserNative_autoptr = o
  extension (v: GtkFileChooserNative_autoptr)
    inline def value: Ptr[GtkFileChooserNative] = v

opaque type GtkFileChooserNative_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFileChooserNative_listautoptr: 
  given _tag: Tag[GtkFileChooserNative_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFileChooserNative_listautoptr = o
  extension (v: GtkFileChooserNative_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFileChooserNative_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFileChooserNative_queueautoptr: 
  given _tag: Tag[GtkFileChooserNative_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFileChooserNative_queueautoptr = o
  extension (v: GtkFileChooserNative_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFileChooserNative_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFileChooserNative_slistautoptr: 
  given _tag: Tag[GtkFileChooserNative_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFileChooserNative_slistautoptr = o
  extension (v: GtkFileChooserNative_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkFileChooserWidget_autoptr = Ptr[GtkFileChooserWidget]
object GtkFileChooserWidget_autoptr: 
  given _tag: Tag[GtkFileChooserWidget_autoptr] = Tag.Ptr[GtkFileChooserWidget](GtkFileChooserWidget._tag)
  inline def apply(inline o: Ptr[GtkFileChooserWidget]): GtkFileChooserWidget_autoptr = o
  extension (v: GtkFileChooserWidget_autoptr)
    inline def value: Ptr[GtkFileChooserWidget] = v

opaque type GtkFileChooserWidget_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFileChooserWidget_listautoptr: 
  given _tag: Tag[GtkFileChooserWidget_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFileChooserWidget_listautoptr = o
  extension (v: GtkFileChooserWidget_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFileChooserWidget_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFileChooserWidget_queueautoptr: 
  given _tag: Tag[GtkFileChooserWidget_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFileChooserWidget_queueautoptr = o
  extension (v: GtkFileChooserWidget_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFileChooserWidget_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFileChooserWidget_slistautoptr: 
  given _tag: Tag[GtkFileChooserWidget_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFileChooserWidget_slistautoptr = o
  extension (v: GtkFileChooserWidget_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkFileDialogClass_autoptr = Ptr[GtkFileDialogClass]
object GtkFileDialogClass_autoptr: 
  given _tag: Tag[GtkFileDialogClass_autoptr] = Tag.Ptr[GtkFileDialogClass](GtkFileDialogClass._tag)
  inline def apply(inline o: Ptr[GtkFileDialogClass]): GtkFileDialogClass_autoptr = o
  extension (v: GtkFileDialogClass_autoptr)
    inline def value: Ptr[GtkFileDialogClass] = v

opaque type GtkFileDialogClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFileDialogClass_listautoptr: 
  given _tag: Tag[GtkFileDialogClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFileDialogClass_listautoptr = o
  extension (v: GtkFileDialogClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFileDialogClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFileDialogClass_queueautoptr: 
  given _tag: Tag[GtkFileDialogClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFileDialogClass_queueautoptr = o
  extension (v: GtkFileDialogClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFileDialogClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFileDialogClass_slistautoptr: 
  given _tag: Tag[GtkFileDialogClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFileDialogClass_slistautoptr = o
  extension (v: GtkFileDialogClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkFileDialog_autoptr = Ptr[GtkFileDialog]
object GtkFileDialog_autoptr: 
  given _tag: Tag[GtkFileDialog_autoptr] = Tag.Ptr[GtkFileDialog](GtkFileDialog._tag)
  inline def apply(inline o: Ptr[GtkFileDialog]): GtkFileDialog_autoptr = o
  extension (v: GtkFileDialog_autoptr)
    inline def value: Ptr[GtkFileDialog] = v

opaque type GtkFileDialog_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFileDialog_listautoptr: 
  given _tag: Tag[GtkFileDialog_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFileDialog_listautoptr = o
  extension (v: GtkFileDialog_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFileDialog_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFileDialog_queueautoptr: 
  given _tag: Tag[GtkFileDialog_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFileDialog_queueautoptr = o
  extension (v: GtkFileDialog_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFileDialog_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFileDialog_slistautoptr: 
  given _tag: Tag[GtkFileDialog_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFileDialog_slistautoptr = o
  extension (v: GtkFileDialog_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkFileFilter_autoptr = Ptr[GtkFileFilter]
object GtkFileFilter_autoptr: 
  given _tag: Tag[GtkFileFilter_autoptr] = Tag.Ptr[GtkFileFilter](GtkFileFilter._tag)
  inline def apply(inline o: Ptr[GtkFileFilter]): GtkFileFilter_autoptr = o
  extension (v: GtkFileFilter_autoptr)
    inline def value: Ptr[GtkFileFilter] = v

opaque type GtkFileFilter_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFileFilter_listautoptr: 
  given _tag: Tag[GtkFileFilter_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFileFilter_listautoptr = o
  extension (v: GtkFileFilter_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFileFilter_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFileFilter_queueautoptr: 
  given _tag: Tag[GtkFileFilter_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFileFilter_queueautoptr = o
  extension (v: GtkFileFilter_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFileFilter_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFileFilter_slistautoptr: 
  given _tag: Tag[GtkFileFilter_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFileFilter_slistautoptr = o
  extension (v: GtkFileFilter_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkFileLauncherClass_autoptr = Ptr[GtkFileLauncherClass]
object GtkFileLauncherClass_autoptr: 
  given _tag: Tag[GtkFileLauncherClass_autoptr] = Tag.Ptr[GtkFileLauncherClass](GtkFileLauncherClass._tag)
  inline def apply(inline o: Ptr[GtkFileLauncherClass]): GtkFileLauncherClass_autoptr = o
  extension (v: GtkFileLauncherClass_autoptr)
    inline def value: Ptr[GtkFileLauncherClass] = v

opaque type GtkFileLauncherClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFileLauncherClass_listautoptr: 
  given _tag: Tag[GtkFileLauncherClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFileLauncherClass_listautoptr = o
  extension (v: GtkFileLauncherClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFileLauncherClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFileLauncherClass_queueautoptr: 
  given _tag: Tag[GtkFileLauncherClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFileLauncherClass_queueautoptr = o
  extension (v: GtkFileLauncherClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFileLauncherClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFileLauncherClass_slistautoptr: 
  given _tag: Tag[GtkFileLauncherClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFileLauncherClass_slistautoptr = o
  extension (v: GtkFileLauncherClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkFileLauncher_autoptr = Ptr[GtkFileLauncher]
object GtkFileLauncher_autoptr: 
  given _tag: Tag[GtkFileLauncher_autoptr] = Tag.Ptr[GtkFileLauncher](GtkFileLauncher._tag)
  inline def apply(inline o: Ptr[GtkFileLauncher]): GtkFileLauncher_autoptr = o
  extension (v: GtkFileLauncher_autoptr)
    inline def value: Ptr[GtkFileLauncher] = v

opaque type GtkFileLauncher_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFileLauncher_listautoptr: 
  given _tag: Tag[GtkFileLauncher_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFileLauncher_listautoptr = o
  extension (v: GtkFileLauncher_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFileLauncher_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFileLauncher_queueautoptr: 
  given _tag: Tag[GtkFileLauncher_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFileLauncher_queueautoptr = o
  extension (v: GtkFileLauncher_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFileLauncher_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFileLauncher_slistautoptr: 
  given _tag: Tag[GtkFileLauncher_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFileLauncher_slistautoptr = o
  extension (v: GtkFileLauncher_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkFilterClass_autoptr = Ptr[GtkFilterClass]
object GtkFilterClass_autoptr: 
  given _tag: Tag[GtkFilterClass_autoptr] = Tag.Ptr[GtkFilterClass](GtkFilterClass._tag)
  inline def apply(inline o: Ptr[GtkFilterClass]): GtkFilterClass_autoptr = o
  extension (v: GtkFilterClass_autoptr)
    inline def value: Ptr[GtkFilterClass] = v

opaque type GtkFilterClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFilterClass_listautoptr: 
  given _tag: Tag[GtkFilterClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFilterClass_listautoptr = o
  extension (v: GtkFilterClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFilterClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFilterClass_queueautoptr: 
  given _tag: Tag[GtkFilterClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFilterClass_queueautoptr = o
  extension (v: GtkFilterClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFilterClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFilterClass_slistautoptr: 
  given _tag: Tag[GtkFilterClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFilterClass_slistautoptr = o
  extension (v: GtkFilterClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkFilterListModelClass_autoptr = Ptr[GtkFilterListModelClass]
object GtkFilterListModelClass_autoptr: 
  given _tag: Tag[GtkFilterListModelClass_autoptr] = Tag.Ptr[GtkFilterListModelClass](GtkFilterListModelClass._tag)
  inline def apply(inline o: Ptr[GtkFilterListModelClass]): GtkFilterListModelClass_autoptr = o
  extension (v: GtkFilterListModelClass_autoptr)
    inline def value: Ptr[GtkFilterListModelClass] = v

opaque type GtkFilterListModelClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFilterListModelClass_listautoptr: 
  given _tag: Tag[GtkFilterListModelClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFilterListModelClass_listautoptr = o
  extension (v: GtkFilterListModelClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFilterListModelClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFilterListModelClass_queueautoptr: 
  given _tag: Tag[GtkFilterListModelClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFilterListModelClass_queueautoptr = o
  extension (v: GtkFilterListModelClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFilterListModelClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFilterListModelClass_slistautoptr: 
  given _tag: Tag[GtkFilterListModelClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFilterListModelClass_slistautoptr = o
  extension (v: GtkFilterListModelClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkFilterListModel_autoptr = Ptr[GtkFilterListModel]
object GtkFilterListModel_autoptr: 
  given _tag: Tag[GtkFilterListModel_autoptr] = Tag.Ptr[GtkFilterListModel](GtkFilterListModel._tag)
  inline def apply(inline o: Ptr[GtkFilterListModel]): GtkFilterListModel_autoptr = o
  extension (v: GtkFilterListModel_autoptr)
    inline def value: Ptr[GtkFilterListModel] = v

opaque type GtkFilterListModel_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFilterListModel_listautoptr: 
  given _tag: Tag[GtkFilterListModel_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFilterListModel_listautoptr = o
  extension (v: GtkFilterListModel_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFilterListModel_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFilterListModel_queueautoptr: 
  given _tag: Tag[GtkFilterListModel_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFilterListModel_queueautoptr = o
  extension (v: GtkFilterListModel_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFilterListModel_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFilterListModel_slistautoptr: 
  given _tag: Tag[GtkFilterListModel_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFilterListModel_slistautoptr = o
  extension (v: GtkFilterListModel_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkFilter_autoptr = Ptr[GtkFilter]
object GtkFilter_autoptr: 
  given _tag: Tag[GtkFilter_autoptr] = Tag.Ptr[GtkFilter](GtkFilter._tag)
  inline def apply(inline o: Ptr[GtkFilter]): GtkFilter_autoptr = o
  extension (v: GtkFilter_autoptr)
    inline def value: Ptr[GtkFilter] = v

opaque type GtkFilter_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFilter_listautoptr: 
  given _tag: Tag[GtkFilter_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFilter_listautoptr = o
  extension (v: GtkFilter_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFilter_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFilter_queueautoptr: 
  given _tag: Tag[GtkFilter_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFilter_queueautoptr = o
  extension (v: GtkFilter_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFilter_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFilter_slistautoptr: 
  given _tag: Tag[GtkFilter_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFilter_slistautoptr = o
  extension (v: GtkFilter_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkFixedLayoutChildClass_autoptr = Ptr[GtkFixedLayoutChildClass]
object GtkFixedLayoutChildClass_autoptr: 
  given _tag: Tag[GtkFixedLayoutChildClass_autoptr] = Tag.Ptr[GtkFixedLayoutChildClass](GtkFixedLayoutChildClass._tag)
  inline def apply(inline o: Ptr[GtkFixedLayoutChildClass]): GtkFixedLayoutChildClass_autoptr = o
  extension (v: GtkFixedLayoutChildClass_autoptr)
    inline def value: Ptr[GtkFixedLayoutChildClass] = v

opaque type GtkFixedLayoutChildClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFixedLayoutChildClass_listautoptr: 
  given _tag: Tag[GtkFixedLayoutChildClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFixedLayoutChildClass_listautoptr = o
  extension (v: GtkFixedLayoutChildClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFixedLayoutChildClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFixedLayoutChildClass_queueautoptr: 
  given _tag: Tag[GtkFixedLayoutChildClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFixedLayoutChildClass_queueautoptr = o
  extension (v: GtkFixedLayoutChildClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFixedLayoutChildClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFixedLayoutChildClass_slistautoptr: 
  given _tag: Tag[GtkFixedLayoutChildClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFixedLayoutChildClass_slistautoptr = o
  extension (v: GtkFixedLayoutChildClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkFixedLayoutChild_autoptr = Ptr[GtkFixedLayoutChild]
object GtkFixedLayoutChild_autoptr: 
  given _tag: Tag[GtkFixedLayoutChild_autoptr] = Tag.Ptr[GtkFixedLayoutChild](GtkFixedLayoutChild._tag)
  inline def apply(inline o: Ptr[GtkFixedLayoutChild]): GtkFixedLayoutChild_autoptr = o
  extension (v: GtkFixedLayoutChild_autoptr)
    inline def value: Ptr[GtkFixedLayoutChild] = v

opaque type GtkFixedLayoutChild_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFixedLayoutChild_listautoptr: 
  given _tag: Tag[GtkFixedLayoutChild_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFixedLayoutChild_listautoptr = o
  extension (v: GtkFixedLayoutChild_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFixedLayoutChild_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFixedLayoutChild_queueautoptr: 
  given _tag: Tag[GtkFixedLayoutChild_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFixedLayoutChild_queueautoptr = o
  extension (v: GtkFixedLayoutChild_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFixedLayoutChild_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFixedLayoutChild_slistautoptr: 
  given _tag: Tag[GtkFixedLayoutChild_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFixedLayoutChild_slistautoptr = o
  extension (v: GtkFixedLayoutChild_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkFixedLayoutClass_autoptr = Ptr[GtkFixedLayoutClass]
object GtkFixedLayoutClass_autoptr: 
  given _tag: Tag[GtkFixedLayoutClass_autoptr] = Tag.Ptr[GtkFixedLayoutClass](GtkFixedLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkFixedLayoutClass]): GtkFixedLayoutClass_autoptr = o
  extension (v: GtkFixedLayoutClass_autoptr)
    inline def value: Ptr[GtkFixedLayoutClass] = v

opaque type GtkFixedLayoutClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFixedLayoutClass_listautoptr: 
  given _tag: Tag[GtkFixedLayoutClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFixedLayoutClass_listautoptr = o
  extension (v: GtkFixedLayoutClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFixedLayoutClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFixedLayoutClass_queueautoptr: 
  given _tag: Tag[GtkFixedLayoutClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFixedLayoutClass_queueautoptr = o
  extension (v: GtkFixedLayoutClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFixedLayoutClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFixedLayoutClass_slistautoptr: 
  given _tag: Tag[GtkFixedLayoutClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFixedLayoutClass_slistautoptr = o
  extension (v: GtkFixedLayoutClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkFixedLayout_autoptr = Ptr[GtkFixedLayout]
object GtkFixedLayout_autoptr: 
  given _tag: Tag[GtkFixedLayout_autoptr] = Tag.Ptr[GtkFixedLayout](GtkFixedLayout._tag)
  inline def apply(inline o: Ptr[GtkFixedLayout]): GtkFixedLayout_autoptr = o
  extension (v: GtkFixedLayout_autoptr)
    inline def value: Ptr[GtkFixedLayout] = v

opaque type GtkFixedLayout_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFixedLayout_listautoptr: 
  given _tag: Tag[GtkFixedLayout_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFixedLayout_listautoptr = o
  extension (v: GtkFixedLayout_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFixedLayout_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFixedLayout_queueautoptr: 
  given _tag: Tag[GtkFixedLayout_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFixedLayout_queueautoptr = o
  extension (v: GtkFixedLayout_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFixedLayout_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFixedLayout_slistautoptr: 
  given _tag: Tag[GtkFixedLayout_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFixedLayout_slistautoptr = o
  extension (v: GtkFixedLayout_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkFixed_autoptr = Ptr[GtkFixed]
object GtkFixed_autoptr: 
  given _tag: Tag[GtkFixed_autoptr] = Tag.Ptr[GtkFixed](GtkFixed._tag)
  inline def apply(inline o: Ptr[GtkFixed]): GtkFixed_autoptr = o
  extension (v: GtkFixed_autoptr)
    inline def value: Ptr[GtkFixed] = v

opaque type GtkFixed_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFixed_listautoptr: 
  given _tag: Tag[GtkFixed_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFixed_listautoptr = o
  extension (v: GtkFixed_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFixed_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFixed_queueautoptr: 
  given _tag: Tag[GtkFixed_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFixed_queueautoptr = o
  extension (v: GtkFixed_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFixed_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFixed_slistautoptr: 
  given _tag: Tag[GtkFixed_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFixed_slistautoptr = o
  extension (v: GtkFixed_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkFlattenListModelClass_autoptr = Ptr[GtkFlattenListModelClass]
object GtkFlattenListModelClass_autoptr: 
  given _tag: Tag[GtkFlattenListModelClass_autoptr] = Tag.Ptr[GtkFlattenListModelClass](GtkFlattenListModelClass._tag)
  inline def apply(inline o: Ptr[GtkFlattenListModelClass]): GtkFlattenListModelClass_autoptr = o
  extension (v: GtkFlattenListModelClass_autoptr)
    inline def value: Ptr[GtkFlattenListModelClass] = v

opaque type GtkFlattenListModelClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFlattenListModelClass_listautoptr: 
  given _tag: Tag[GtkFlattenListModelClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFlattenListModelClass_listautoptr = o
  extension (v: GtkFlattenListModelClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFlattenListModelClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFlattenListModelClass_queueautoptr: 
  given _tag: Tag[GtkFlattenListModelClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFlattenListModelClass_queueautoptr = o
  extension (v: GtkFlattenListModelClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFlattenListModelClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFlattenListModelClass_slistautoptr: 
  given _tag: Tag[GtkFlattenListModelClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFlattenListModelClass_slistautoptr = o
  extension (v: GtkFlattenListModelClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkFlattenListModel_autoptr = Ptr[GtkFlattenListModel]
object GtkFlattenListModel_autoptr: 
  given _tag: Tag[GtkFlattenListModel_autoptr] = Tag.Ptr[GtkFlattenListModel](GtkFlattenListModel._tag)
  inline def apply(inline o: Ptr[GtkFlattenListModel]): GtkFlattenListModel_autoptr = o
  extension (v: GtkFlattenListModel_autoptr)
    inline def value: Ptr[GtkFlattenListModel] = v

opaque type GtkFlattenListModel_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFlattenListModel_listautoptr: 
  given _tag: Tag[GtkFlattenListModel_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFlattenListModel_listautoptr = o
  extension (v: GtkFlattenListModel_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFlattenListModel_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFlattenListModel_queueautoptr: 
  given _tag: Tag[GtkFlattenListModel_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFlattenListModel_queueautoptr = o
  extension (v: GtkFlattenListModel_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFlattenListModel_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFlattenListModel_slistautoptr: 
  given _tag: Tag[GtkFlattenListModel_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFlattenListModel_slistautoptr = o
  extension (v: GtkFlattenListModel_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkFlowBoxChild_autoptr = Ptr[GtkFlowBoxChild]
object GtkFlowBoxChild_autoptr: 
  given _tag: Tag[GtkFlowBoxChild_autoptr] = Tag.Ptr[GtkFlowBoxChild](GtkFlowBoxChild._tag)
  inline def apply(inline o: Ptr[GtkFlowBoxChild]): GtkFlowBoxChild_autoptr = o
  extension (v: GtkFlowBoxChild_autoptr)
    inline def value: Ptr[GtkFlowBoxChild] = v

opaque type GtkFlowBoxChild_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFlowBoxChild_listautoptr: 
  given _tag: Tag[GtkFlowBoxChild_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFlowBoxChild_listautoptr = o
  extension (v: GtkFlowBoxChild_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFlowBoxChild_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFlowBoxChild_queueautoptr: 
  given _tag: Tag[GtkFlowBoxChild_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFlowBoxChild_queueautoptr = o
  extension (v: GtkFlowBoxChild_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFlowBoxChild_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFlowBoxChild_slistautoptr: 
  given _tag: Tag[GtkFlowBoxChild_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFlowBoxChild_slistautoptr = o
  extension (v: GtkFlowBoxChild_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkFlowBoxCreateWidgetFunc: : (type GObject): the item from the model for which to create a widget for _data: (closure): user data from gtk_flow_box_bind_model()
*/
opaque type GtkFlowBoxCreateWidgetFunc = CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[GtkWidget]]
object GtkFlowBoxCreateWidgetFunc: 
  given _tag: Tag[GtkFlowBoxCreateWidgetFunc] = Tag.materializeCFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[GtkWidget]]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkFlowBoxCreateWidgetFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[GtkWidget]]): GtkFlowBoxCreateWidgetFunc = o
  extension (v: GtkFlowBoxCreateWidgetFunc)
    inline def value: CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[GtkWidget]] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkFlowBoxFilterFunc = CFuncPtr2[Ptr[GtkFlowBoxChild], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GtkFlowBoxFilterFunc: 
  given _tag: Tag[GtkFlowBoxFilterFunc] = Tag.materializeCFuncPtr2[Ptr[GtkFlowBoxChild], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkFlowBoxFilterFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GtkFlowBoxChild], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GtkFlowBoxFilterFunc = o
  extension (v: GtkFlowBoxFilterFunc)
    inline def value: CFuncPtr2[Ptr[GtkFlowBoxChild], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkFlowBoxForeachFunc = CFuncPtr3[Ptr[GtkFlowBox], Ptr[GtkFlowBoxChild], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GtkFlowBoxForeachFunc: 
  given _tag: Tag[GtkFlowBoxForeachFunc] = Tag.materializeCFuncPtr3[Ptr[GtkFlowBox], Ptr[GtkFlowBoxChild], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkFlowBoxForeachFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GtkFlowBox], Ptr[GtkFlowBoxChild], _root_.sn.gnome.glib.internal.gpointer, Unit]): GtkFlowBoxForeachFunc = o
  extension (v: GtkFlowBoxForeachFunc)
    inline def value: CFuncPtr3[Ptr[GtkFlowBox], Ptr[GtkFlowBoxChild], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkFlowBoxSortFunc = CFuncPtr3[Ptr[GtkFlowBoxChild], Ptr[GtkFlowBoxChild], _root_.sn.gnome.glib.internal.gpointer, CInt]
object GtkFlowBoxSortFunc: 
  given _tag: Tag[GtkFlowBoxSortFunc] = Tag.materializeCFuncPtr3[Ptr[GtkFlowBoxChild], Ptr[GtkFlowBoxChild], _root_.sn.gnome.glib.internal.gpointer, CInt]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkFlowBoxSortFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GtkFlowBoxChild], Ptr[GtkFlowBoxChild], _root_.sn.gnome.glib.internal.gpointer, CInt]): GtkFlowBoxSortFunc = o
  extension (v: GtkFlowBoxSortFunc)
    inline def value: CFuncPtr3[Ptr[GtkFlowBoxChild], Ptr[GtkFlowBoxChild], _root_.sn.gnome.glib.internal.gpointer, CInt] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkFlowBox_autoptr = Ptr[GtkFlowBox]
object GtkFlowBox_autoptr: 
  given _tag: Tag[GtkFlowBox_autoptr] = Tag.Ptr[GtkFlowBox](GtkFlowBox._tag)
  inline def apply(inline o: Ptr[GtkFlowBox]): GtkFlowBox_autoptr = o
  extension (v: GtkFlowBox_autoptr)
    inline def value: Ptr[GtkFlowBox] = v

opaque type GtkFlowBox_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFlowBox_listautoptr: 
  given _tag: Tag[GtkFlowBox_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFlowBox_listautoptr = o
  extension (v: GtkFlowBox_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFlowBox_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFlowBox_queueautoptr: 
  given _tag: Tag[GtkFlowBox_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFlowBox_queueautoptr = o
  extension (v: GtkFlowBox_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFlowBox_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFlowBox_slistautoptr: 
  given _tag: Tag[GtkFlowBox_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFlowBox_slistautoptr = o
  extension (v: GtkFlowBox_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkFontButton_autoptr = Ptr[GtkFontButton]
object GtkFontButton_autoptr: 
  given _tag: Tag[GtkFontButton_autoptr] = Tag.Ptr[GtkFontButton](GtkFontButton._tag)
  inline def apply(inline o: Ptr[GtkFontButton]): GtkFontButton_autoptr = o
  extension (v: GtkFontButton_autoptr)
    inline def value: Ptr[GtkFontButton] = v

opaque type GtkFontButton_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFontButton_listautoptr: 
  given _tag: Tag[GtkFontButton_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFontButton_listautoptr = o
  extension (v: GtkFontButton_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFontButton_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFontButton_queueautoptr: 
  given _tag: Tag[GtkFontButton_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFontButton_queueautoptr = o
  extension (v: GtkFontButton_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFontButton_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFontButton_slistautoptr: 
  given _tag: Tag[GtkFontButton_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFontButton_slistautoptr = o
  extension (v: GtkFontButton_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkFontChooserDialog_autoptr = Ptr[GtkFontChooserDialog]
object GtkFontChooserDialog_autoptr: 
  given _tag: Tag[GtkFontChooserDialog_autoptr] = Tag.Ptr[GtkFontChooserDialog](GtkFontChooserDialog._tag)
  inline def apply(inline o: Ptr[GtkFontChooserDialog]): GtkFontChooserDialog_autoptr = o
  extension (v: GtkFontChooserDialog_autoptr)
    inline def value: Ptr[GtkFontChooserDialog] = v

opaque type GtkFontChooserDialog_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFontChooserDialog_listautoptr: 
  given _tag: Tag[GtkFontChooserDialog_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFontChooserDialog_listautoptr = o
  extension (v: GtkFontChooserDialog_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFontChooserDialog_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFontChooserDialog_queueautoptr: 
  given _tag: Tag[GtkFontChooserDialog_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFontChooserDialog_queueautoptr = o
  extension (v: GtkFontChooserDialog_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFontChooserDialog_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFontChooserDialog_slistautoptr: 
  given _tag: Tag[GtkFontChooserDialog_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFontChooserDialog_slistautoptr = o
  extension (v: GtkFontChooserDialog_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkFontChooserWidget_autoptr = Ptr[GtkFontChooserWidget]
object GtkFontChooserWidget_autoptr: 
  given _tag: Tag[GtkFontChooserWidget_autoptr] = Tag.Ptr[GtkFontChooserWidget](GtkFontChooserWidget._tag)
  inline def apply(inline o: Ptr[GtkFontChooserWidget]): GtkFontChooserWidget_autoptr = o
  extension (v: GtkFontChooserWidget_autoptr)
    inline def value: Ptr[GtkFontChooserWidget] = v

opaque type GtkFontChooserWidget_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFontChooserWidget_listautoptr: 
  given _tag: Tag[GtkFontChooserWidget_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFontChooserWidget_listautoptr = o
  extension (v: GtkFontChooserWidget_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFontChooserWidget_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFontChooserWidget_queueautoptr: 
  given _tag: Tag[GtkFontChooserWidget_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFontChooserWidget_queueautoptr = o
  extension (v: GtkFontChooserWidget_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFontChooserWidget_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFontChooserWidget_slistautoptr: 
  given _tag: Tag[GtkFontChooserWidget_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFontChooserWidget_slistautoptr = o
  extension (v: GtkFontChooserWidget_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkFontChooser_autoptr = Ptr[GtkFontChooser]
object GtkFontChooser_autoptr: 
  given _tag: Tag[GtkFontChooser_autoptr] = Tag.Ptr[GtkFontChooser](GtkFontChooser._tag)
  inline def apply(inline o: Ptr[GtkFontChooser]): GtkFontChooser_autoptr = o
  extension (v: GtkFontChooser_autoptr)
    inline def value: Ptr[GtkFontChooser] = v

opaque type GtkFontChooser_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFontChooser_listautoptr: 
  given _tag: Tag[GtkFontChooser_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFontChooser_listautoptr = o
  extension (v: GtkFontChooser_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFontChooser_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFontChooser_queueautoptr: 
  given _tag: Tag[GtkFontChooser_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFontChooser_queueautoptr = o
  extension (v: GtkFontChooser_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFontChooser_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFontChooser_slistautoptr: 
  given _tag: Tag[GtkFontChooser_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFontChooser_slistautoptr = o
  extension (v: GtkFontChooser_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkFontDialogButtonClass_autoptr = Ptr[GtkFontDialogButtonClass]
object GtkFontDialogButtonClass_autoptr: 
  given _tag: Tag[GtkFontDialogButtonClass_autoptr] = Tag.Ptr[GtkFontDialogButtonClass](GtkFontDialogButtonClass._tag)
  inline def apply(inline o: Ptr[GtkFontDialogButtonClass]): GtkFontDialogButtonClass_autoptr = o
  extension (v: GtkFontDialogButtonClass_autoptr)
    inline def value: Ptr[GtkFontDialogButtonClass] = v

opaque type GtkFontDialogButtonClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFontDialogButtonClass_listautoptr: 
  given _tag: Tag[GtkFontDialogButtonClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFontDialogButtonClass_listautoptr = o
  extension (v: GtkFontDialogButtonClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFontDialogButtonClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFontDialogButtonClass_queueautoptr: 
  given _tag: Tag[GtkFontDialogButtonClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFontDialogButtonClass_queueautoptr = o
  extension (v: GtkFontDialogButtonClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFontDialogButtonClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFontDialogButtonClass_slistautoptr: 
  given _tag: Tag[GtkFontDialogButtonClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFontDialogButtonClass_slistautoptr = o
  extension (v: GtkFontDialogButtonClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkFontDialogButton_autoptr = Ptr[GtkFontDialogButton]
object GtkFontDialogButton_autoptr: 
  given _tag: Tag[GtkFontDialogButton_autoptr] = Tag.Ptr[GtkFontDialogButton](GtkFontDialogButton._tag)
  inline def apply(inline o: Ptr[GtkFontDialogButton]): GtkFontDialogButton_autoptr = o
  extension (v: GtkFontDialogButton_autoptr)
    inline def value: Ptr[GtkFontDialogButton] = v

opaque type GtkFontDialogButton_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFontDialogButton_listautoptr: 
  given _tag: Tag[GtkFontDialogButton_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFontDialogButton_listautoptr = o
  extension (v: GtkFontDialogButton_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFontDialogButton_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFontDialogButton_queueautoptr: 
  given _tag: Tag[GtkFontDialogButton_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFontDialogButton_queueautoptr = o
  extension (v: GtkFontDialogButton_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFontDialogButton_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFontDialogButton_slistautoptr: 
  given _tag: Tag[GtkFontDialogButton_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFontDialogButton_slistautoptr = o
  extension (v: GtkFontDialogButton_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkFontDialogClass_autoptr = Ptr[GtkFontDialogClass]
object GtkFontDialogClass_autoptr: 
  given _tag: Tag[GtkFontDialogClass_autoptr] = Tag.Ptr[GtkFontDialogClass](GtkFontDialogClass._tag)
  inline def apply(inline o: Ptr[GtkFontDialogClass]): GtkFontDialogClass_autoptr = o
  extension (v: GtkFontDialogClass_autoptr)
    inline def value: Ptr[GtkFontDialogClass] = v

opaque type GtkFontDialogClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFontDialogClass_listautoptr: 
  given _tag: Tag[GtkFontDialogClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFontDialogClass_listautoptr = o
  extension (v: GtkFontDialogClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFontDialogClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFontDialogClass_queueautoptr: 
  given _tag: Tag[GtkFontDialogClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFontDialogClass_queueautoptr = o
  extension (v: GtkFontDialogClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFontDialogClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFontDialogClass_slistautoptr: 
  given _tag: Tag[GtkFontDialogClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFontDialogClass_slistautoptr = o
  extension (v: GtkFontDialogClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkFontDialog_autoptr = Ptr[GtkFontDialog]
object GtkFontDialog_autoptr: 
  given _tag: Tag[GtkFontDialog_autoptr] = Tag.Ptr[GtkFontDialog](GtkFontDialog._tag)
  inline def apply(inline o: Ptr[GtkFontDialog]): GtkFontDialog_autoptr = o
  extension (v: GtkFontDialog_autoptr)
    inline def value: Ptr[GtkFontDialog] = v

opaque type GtkFontDialog_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFontDialog_listautoptr: 
  given _tag: Tag[GtkFontDialog_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFontDialog_listautoptr = o
  extension (v: GtkFontDialog_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFontDialog_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFontDialog_queueautoptr: 
  given _tag: Tag[GtkFontDialog_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFontDialog_queueautoptr = o
  extension (v: GtkFontDialog_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFontDialog_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFontDialog_slistautoptr: 
  given _tag: Tag[GtkFontDialog_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFontDialog_slistautoptr = o
  extension (v: GtkFontDialog_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkFontFilterFunc: : a `PangoFontFamily` : a `PangoFontFace` belonging to
*/
opaque type GtkFontFilterFunc = CFuncPtr3[Ptr[_root_.sn.gnome.pango.internal.PangoFontFamily], Ptr[_root_.sn.gnome.pango.internal.PangoFontFace], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GtkFontFilterFunc: 
  given _tag: Tag[GtkFontFilterFunc] = Tag.materializeCFuncPtr3[Ptr[_root_.sn.gnome.pango.internal.PangoFontFamily], Ptr[_root_.sn.gnome.pango.internal.PangoFontFace], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkFontFilterFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[_root_.sn.gnome.pango.internal.PangoFontFamily], Ptr[_root_.sn.gnome.pango.internal.PangoFontFace], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GtkFontFilterFunc = o
  extension (v: GtkFontFilterFunc)
    inline def value: CFuncPtr3[Ptr[_root_.sn.gnome.pango.internal.PangoFontFamily], Ptr[_root_.sn.gnome.pango.internal.PangoFontFace], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkFrame_autoptr = Ptr[GtkFrame]
object GtkFrame_autoptr: 
  given _tag: Tag[GtkFrame_autoptr] = Tag.Ptr[GtkFrame](GtkFrame._tag)
  inline def apply(inline o: Ptr[GtkFrame]): GtkFrame_autoptr = o
  extension (v: GtkFrame_autoptr)
    inline def value: Ptr[GtkFrame] = v

opaque type GtkFrame_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFrame_listautoptr: 
  given _tag: Tag[GtkFrame_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFrame_listautoptr = o
  extension (v: GtkFrame_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkFrame_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFrame_queueautoptr: 
  given _tag: Tag[GtkFrame_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFrame_queueautoptr = o
  extension (v: GtkFrame_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkFrame_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkFrame_slistautoptr: 
  given _tag: Tag[GtkFrame_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkFrame_slistautoptr = o
  extension (v: GtkFrame_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkGLArea_autoptr = Ptr[GtkGLArea]
object GtkGLArea_autoptr: 
  given _tag: Tag[GtkGLArea_autoptr] = Tag.Ptr[GtkGLArea](GtkGLArea._tag)
  inline def apply(inline o: Ptr[GtkGLArea]): GtkGLArea_autoptr = o
  extension (v: GtkGLArea_autoptr)
    inline def value: Ptr[GtkGLArea] = v

opaque type GtkGLArea_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkGLArea_listautoptr: 
  given _tag: Tag[GtkGLArea_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkGLArea_listautoptr = o
  extension (v: GtkGLArea_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkGLArea_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkGLArea_queueautoptr: 
  given _tag: Tag[GtkGLArea_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkGLArea_queueautoptr = o
  extension (v: GtkGLArea_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkGLArea_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkGLArea_slistautoptr: 
  given _tag: Tag[GtkGLArea_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkGLArea_slistautoptr = o
  extension (v: GtkGLArea_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkGestureClick_autoptr = Ptr[GtkGestureClick]
object GtkGestureClick_autoptr: 
  given _tag: Tag[GtkGestureClick_autoptr] = Tag.Ptr[GtkGestureClick](GtkGestureClick._tag)
  inline def apply(inline o: Ptr[GtkGestureClick]): GtkGestureClick_autoptr = o
  extension (v: GtkGestureClick_autoptr)
    inline def value: Ptr[GtkGestureClick] = v

opaque type GtkGestureClick_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkGestureClick_listautoptr: 
  given _tag: Tag[GtkGestureClick_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkGestureClick_listautoptr = o
  extension (v: GtkGestureClick_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkGestureClick_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkGestureClick_queueautoptr: 
  given _tag: Tag[GtkGestureClick_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkGestureClick_queueautoptr = o
  extension (v: GtkGestureClick_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkGestureClick_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkGestureClick_slistautoptr: 
  given _tag: Tag[GtkGestureClick_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkGestureClick_slistautoptr = o
  extension (v: GtkGestureClick_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkGestureDrag_autoptr = Ptr[GtkGestureDrag]
object GtkGestureDrag_autoptr: 
  given _tag: Tag[GtkGestureDrag_autoptr] = Tag.Ptr[GtkGestureDrag](GtkGestureDrag._tag)
  inline def apply(inline o: Ptr[GtkGestureDrag]): GtkGestureDrag_autoptr = o
  extension (v: GtkGestureDrag_autoptr)
    inline def value: Ptr[GtkGestureDrag] = v

opaque type GtkGestureDrag_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkGestureDrag_listautoptr: 
  given _tag: Tag[GtkGestureDrag_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkGestureDrag_listautoptr = o
  extension (v: GtkGestureDrag_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkGestureDrag_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkGestureDrag_queueautoptr: 
  given _tag: Tag[GtkGestureDrag_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkGestureDrag_queueautoptr = o
  extension (v: GtkGestureDrag_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkGestureDrag_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkGestureDrag_slistautoptr: 
  given _tag: Tag[GtkGestureDrag_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkGestureDrag_slistautoptr = o
  extension (v: GtkGestureDrag_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkGestureLongPress_autoptr = Ptr[GtkGestureLongPress]
object GtkGestureLongPress_autoptr: 
  given _tag: Tag[GtkGestureLongPress_autoptr] = Tag.Ptr[GtkGestureLongPress](GtkGestureLongPress._tag)
  inline def apply(inline o: Ptr[GtkGestureLongPress]): GtkGestureLongPress_autoptr = o
  extension (v: GtkGestureLongPress_autoptr)
    inline def value: Ptr[GtkGestureLongPress] = v

opaque type GtkGestureLongPress_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkGestureLongPress_listautoptr: 
  given _tag: Tag[GtkGestureLongPress_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkGestureLongPress_listautoptr = o
  extension (v: GtkGestureLongPress_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkGestureLongPress_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkGestureLongPress_queueautoptr: 
  given _tag: Tag[GtkGestureLongPress_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkGestureLongPress_queueautoptr = o
  extension (v: GtkGestureLongPress_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkGestureLongPress_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkGestureLongPress_slistautoptr: 
  given _tag: Tag[GtkGestureLongPress_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkGestureLongPress_slistautoptr = o
  extension (v: GtkGestureLongPress_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkGesturePan_autoptr = Ptr[GtkGesturePan]
object GtkGesturePan_autoptr: 
  given _tag: Tag[GtkGesturePan_autoptr] = Tag.Ptr[GtkGesturePan](GtkGesturePan._tag)
  inline def apply(inline o: Ptr[GtkGesturePan]): GtkGesturePan_autoptr = o
  extension (v: GtkGesturePan_autoptr)
    inline def value: Ptr[GtkGesturePan] = v

opaque type GtkGesturePan_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkGesturePan_listautoptr: 
  given _tag: Tag[GtkGesturePan_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkGesturePan_listautoptr = o
  extension (v: GtkGesturePan_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkGesturePan_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkGesturePan_queueautoptr: 
  given _tag: Tag[GtkGesturePan_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkGesturePan_queueautoptr = o
  extension (v: GtkGesturePan_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkGesturePan_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkGesturePan_slistautoptr: 
  given _tag: Tag[GtkGesturePan_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkGesturePan_slistautoptr = o
  extension (v: GtkGesturePan_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkGestureRotate_autoptr = Ptr[GtkGestureRotate]
object GtkGestureRotate_autoptr: 
  given _tag: Tag[GtkGestureRotate_autoptr] = Tag.Ptr[GtkGestureRotate](GtkGestureRotate._tag)
  inline def apply(inline o: Ptr[GtkGestureRotate]): GtkGestureRotate_autoptr = o
  extension (v: GtkGestureRotate_autoptr)
    inline def value: Ptr[GtkGestureRotate] = v

opaque type GtkGestureRotate_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkGestureRotate_listautoptr: 
  given _tag: Tag[GtkGestureRotate_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkGestureRotate_listautoptr = o
  extension (v: GtkGestureRotate_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkGestureRotate_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkGestureRotate_queueautoptr: 
  given _tag: Tag[GtkGestureRotate_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkGestureRotate_queueautoptr = o
  extension (v: GtkGestureRotate_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkGestureRotate_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkGestureRotate_slistautoptr: 
  given _tag: Tag[GtkGestureRotate_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkGestureRotate_slistautoptr = o
  extension (v: GtkGestureRotate_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkGestureSingle_autoptr = Ptr[GtkGestureSingle]
object GtkGestureSingle_autoptr: 
  given _tag: Tag[GtkGestureSingle_autoptr] = Tag.Ptr[GtkGestureSingle](GtkGestureSingle._tag)
  inline def apply(inline o: Ptr[GtkGestureSingle]): GtkGestureSingle_autoptr = o
  extension (v: GtkGestureSingle_autoptr)
    inline def value: Ptr[GtkGestureSingle] = v

opaque type GtkGestureSingle_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkGestureSingle_listautoptr: 
  given _tag: Tag[GtkGestureSingle_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkGestureSingle_listautoptr = o
  extension (v: GtkGestureSingle_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkGestureSingle_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkGestureSingle_queueautoptr: 
  given _tag: Tag[GtkGestureSingle_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkGestureSingle_queueautoptr = o
  extension (v: GtkGestureSingle_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkGestureSingle_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkGestureSingle_slistautoptr: 
  given _tag: Tag[GtkGestureSingle_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkGestureSingle_slistautoptr = o
  extension (v: GtkGestureSingle_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkGestureSwipe_autoptr = Ptr[GtkGestureSwipe]
object GtkGestureSwipe_autoptr: 
  given _tag: Tag[GtkGestureSwipe_autoptr] = Tag.Ptr[GtkGestureSwipe](GtkGestureSwipe._tag)
  inline def apply(inline o: Ptr[GtkGestureSwipe]): GtkGestureSwipe_autoptr = o
  extension (v: GtkGestureSwipe_autoptr)
    inline def value: Ptr[GtkGestureSwipe] = v

opaque type GtkGestureSwipe_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkGestureSwipe_listautoptr: 
  given _tag: Tag[GtkGestureSwipe_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkGestureSwipe_listautoptr = o
  extension (v: GtkGestureSwipe_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkGestureSwipe_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkGestureSwipe_queueautoptr: 
  given _tag: Tag[GtkGestureSwipe_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkGestureSwipe_queueautoptr = o
  extension (v: GtkGestureSwipe_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkGestureSwipe_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkGestureSwipe_slistautoptr: 
  given _tag: Tag[GtkGestureSwipe_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkGestureSwipe_slistautoptr = o
  extension (v: GtkGestureSwipe_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkGestureZoom_autoptr = Ptr[GtkGestureZoom]
object GtkGestureZoom_autoptr: 
  given _tag: Tag[GtkGestureZoom_autoptr] = Tag.Ptr[GtkGestureZoom](GtkGestureZoom._tag)
  inline def apply(inline o: Ptr[GtkGestureZoom]): GtkGestureZoom_autoptr = o
  extension (v: GtkGestureZoom_autoptr)
    inline def value: Ptr[GtkGestureZoom] = v

opaque type GtkGestureZoom_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkGestureZoom_listautoptr: 
  given _tag: Tag[GtkGestureZoom_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkGestureZoom_listautoptr = o
  extension (v: GtkGestureZoom_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkGestureZoom_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkGestureZoom_queueautoptr: 
  given _tag: Tag[GtkGestureZoom_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkGestureZoom_queueautoptr = o
  extension (v: GtkGestureZoom_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkGestureZoom_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkGestureZoom_slistautoptr: 
  given _tag: Tag[GtkGestureZoom_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkGestureZoom_slistautoptr = o
  extension (v: GtkGestureZoom_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkGesture_autoptr = Ptr[GtkGesture]
object GtkGesture_autoptr: 
  given _tag: Tag[GtkGesture_autoptr] = Tag.Ptr[GtkGesture](GtkGesture._tag)
  inline def apply(inline o: Ptr[GtkGesture]): GtkGesture_autoptr = o
  extension (v: GtkGesture_autoptr)
    inline def value: Ptr[GtkGesture] = v

opaque type GtkGesture_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkGesture_listautoptr: 
  given _tag: Tag[GtkGesture_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkGesture_listautoptr = o
  extension (v: GtkGesture_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkGesture_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkGesture_queueautoptr: 
  given _tag: Tag[GtkGesture_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkGesture_queueautoptr = o
  extension (v: GtkGesture_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkGesture_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkGesture_slistautoptr: 
  given _tag: Tag[GtkGesture_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkGesture_slistautoptr = o
  extension (v: GtkGesture_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkGraphicsOffloadClass_autoptr = Ptr[GtkGraphicsOffloadClass]
object GtkGraphicsOffloadClass_autoptr: 
  given _tag: Tag[GtkGraphicsOffloadClass_autoptr] = Tag.Ptr[GtkGraphicsOffloadClass](GtkGraphicsOffloadClass._tag)
  inline def apply(inline o: Ptr[GtkGraphicsOffloadClass]): GtkGraphicsOffloadClass_autoptr = o
  extension (v: GtkGraphicsOffloadClass_autoptr)
    inline def value: Ptr[GtkGraphicsOffloadClass] = v

opaque type GtkGraphicsOffloadClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkGraphicsOffloadClass_listautoptr: 
  given _tag: Tag[GtkGraphicsOffloadClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkGraphicsOffloadClass_listautoptr = o
  extension (v: GtkGraphicsOffloadClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkGraphicsOffloadClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkGraphicsOffloadClass_queueautoptr: 
  given _tag: Tag[GtkGraphicsOffloadClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkGraphicsOffloadClass_queueautoptr = o
  extension (v: GtkGraphicsOffloadClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkGraphicsOffloadClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkGraphicsOffloadClass_slistautoptr: 
  given _tag: Tag[GtkGraphicsOffloadClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkGraphicsOffloadClass_slistautoptr = o
  extension (v: GtkGraphicsOffloadClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkGraphicsOffload_autoptr = Ptr[GtkGraphicsOffload]
object GtkGraphicsOffload_autoptr: 
  given _tag: Tag[GtkGraphicsOffload_autoptr] = Tag.Ptr[GtkGraphicsOffload](GtkGraphicsOffload._tag)
  inline def apply(inline o: Ptr[GtkGraphicsOffload]): GtkGraphicsOffload_autoptr = o
  extension (v: GtkGraphicsOffload_autoptr)
    inline def value: Ptr[GtkGraphicsOffload] = v

opaque type GtkGraphicsOffload_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkGraphicsOffload_listautoptr: 
  given _tag: Tag[GtkGraphicsOffload_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkGraphicsOffload_listautoptr = o
  extension (v: GtkGraphicsOffload_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkGraphicsOffload_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkGraphicsOffload_queueautoptr: 
  given _tag: Tag[GtkGraphicsOffload_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkGraphicsOffload_queueautoptr = o
  extension (v: GtkGraphicsOffload_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkGraphicsOffload_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkGraphicsOffload_slistautoptr: 
  given _tag: Tag[GtkGraphicsOffload_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkGraphicsOffload_slistautoptr = o
  extension (v: GtkGraphicsOffload_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkGridLayoutChildClass_autoptr = Ptr[GtkGridLayoutChildClass]
object GtkGridLayoutChildClass_autoptr: 
  given _tag: Tag[GtkGridLayoutChildClass_autoptr] = Tag.Ptr[GtkGridLayoutChildClass](GtkGridLayoutChildClass._tag)
  inline def apply(inline o: Ptr[GtkGridLayoutChildClass]): GtkGridLayoutChildClass_autoptr = o
  extension (v: GtkGridLayoutChildClass_autoptr)
    inline def value: Ptr[GtkGridLayoutChildClass] = v

opaque type GtkGridLayoutChildClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkGridLayoutChildClass_listautoptr: 
  given _tag: Tag[GtkGridLayoutChildClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkGridLayoutChildClass_listautoptr = o
  extension (v: GtkGridLayoutChildClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkGridLayoutChildClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkGridLayoutChildClass_queueautoptr: 
  given _tag: Tag[GtkGridLayoutChildClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkGridLayoutChildClass_queueautoptr = o
  extension (v: GtkGridLayoutChildClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkGridLayoutChildClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkGridLayoutChildClass_slistautoptr: 
  given _tag: Tag[GtkGridLayoutChildClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkGridLayoutChildClass_slistautoptr = o
  extension (v: GtkGridLayoutChildClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkGridLayoutChild_autoptr = Ptr[GtkGridLayoutChild]
object GtkGridLayoutChild_autoptr: 
  given _tag: Tag[GtkGridLayoutChild_autoptr] = Tag.Ptr[GtkGridLayoutChild](GtkGridLayoutChild._tag)
  inline def apply(inline o: Ptr[GtkGridLayoutChild]): GtkGridLayoutChild_autoptr = o
  extension (v: GtkGridLayoutChild_autoptr)
    inline def value: Ptr[GtkGridLayoutChild] = v

opaque type GtkGridLayoutChild_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkGridLayoutChild_listautoptr: 
  given _tag: Tag[GtkGridLayoutChild_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkGridLayoutChild_listautoptr = o
  extension (v: GtkGridLayoutChild_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkGridLayoutChild_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkGridLayoutChild_queueautoptr: 
  given _tag: Tag[GtkGridLayoutChild_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkGridLayoutChild_queueautoptr = o
  extension (v: GtkGridLayoutChild_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkGridLayoutChild_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkGridLayoutChild_slistautoptr: 
  given _tag: Tag[GtkGridLayoutChild_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkGridLayoutChild_slistautoptr = o
  extension (v: GtkGridLayoutChild_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkGridLayoutClass_autoptr = Ptr[GtkGridLayoutClass]
object GtkGridLayoutClass_autoptr: 
  given _tag: Tag[GtkGridLayoutClass_autoptr] = Tag.Ptr[GtkGridLayoutClass](GtkGridLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkGridLayoutClass]): GtkGridLayoutClass_autoptr = o
  extension (v: GtkGridLayoutClass_autoptr)
    inline def value: Ptr[GtkGridLayoutClass] = v

opaque type GtkGridLayoutClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkGridLayoutClass_listautoptr: 
  given _tag: Tag[GtkGridLayoutClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkGridLayoutClass_listautoptr = o
  extension (v: GtkGridLayoutClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkGridLayoutClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkGridLayoutClass_queueautoptr: 
  given _tag: Tag[GtkGridLayoutClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkGridLayoutClass_queueautoptr = o
  extension (v: GtkGridLayoutClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkGridLayoutClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkGridLayoutClass_slistautoptr: 
  given _tag: Tag[GtkGridLayoutClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkGridLayoutClass_slistautoptr = o
  extension (v: GtkGridLayoutClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkGridLayout_autoptr = Ptr[GtkGridLayout]
object GtkGridLayout_autoptr: 
  given _tag: Tag[GtkGridLayout_autoptr] = Tag.Ptr[GtkGridLayout](GtkGridLayout._tag)
  inline def apply(inline o: Ptr[GtkGridLayout]): GtkGridLayout_autoptr = o
  extension (v: GtkGridLayout_autoptr)
    inline def value: Ptr[GtkGridLayout] = v

opaque type GtkGridLayout_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkGridLayout_listautoptr: 
  given _tag: Tag[GtkGridLayout_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkGridLayout_listautoptr = o
  extension (v: GtkGridLayout_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkGridLayout_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkGridLayout_queueautoptr: 
  given _tag: Tag[GtkGridLayout_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkGridLayout_queueautoptr = o
  extension (v: GtkGridLayout_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkGridLayout_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkGridLayout_slistautoptr: 
  given _tag: Tag[GtkGridLayout_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkGridLayout_slistautoptr = o
  extension (v: GtkGridLayout_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkGridView_autoptr = Ptr[GtkGridView]
object GtkGridView_autoptr: 
  given _tag: Tag[GtkGridView_autoptr] = Tag.Ptr[GtkGridView](GtkGridView._tag)
  inline def apply(inline o: Ptr[GtkGridView]): GtkGridView_autoptr = o
  extension (v: GtkGridView_autoptr)
    inline def value: Ptr[GtkGridView] = v

opaque type GtkGridView_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkGridView_listautoptr: 
  given _tag: Tag[GtkGridView_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkGridView_listautoptr = o
  extension (v: GtkGridView_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkGridView_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkGridView_queueautoptr: 
  given _tag: Tag[GtkGridView_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkGridView_queueautoptr = o
  extension (v: GtkGridView_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkGridView_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkGridView_slistautoptr: 
  given _tag: Tag[GtkGridView_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkGridView_slistautoptr = o
  extension (v: GtkGridView_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkGrid_autoptr = Ptr[GtkGrid]
object GtkGrid_autoptr: 
  given _tag: Tag[GtkGrid_autoptr] = Tag.Ptr[GtkGrid](GtkGrid._tag)
  inline def apply(inline o: Ptr[GtkGrid]): GtkGrid_autoptr = o
  extension (v: GtkGrid_autoptr)
    inline def value: Ptr[GtkGrid] = v

opaque type GtkGrid_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkGrid_listautoptr: 
  given _tag: Tag[GtkGrid_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkGrid_listautoptr = o
  extension (v: GtkGrid_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkGrid_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkGrid_queueautoptr: 
  given _tag: Tag[GtkGrid_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkGrid_queueautoptr = o
  extension (v: GtkGrid_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkGrid_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkGrid_slistautoptr: 
  given _tag: Tag[GtkGrid_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkGrid_slistautoptr = o
  extension (v: GtkGrid_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkHeaderBar_autoptr = Ptr[GtkHeaderBar]
object GtkHeaderBar_autoptr: 
  given _tag: Tag[GtkHeaderBar_autoptr] = Tag.Ptr[GtkHeaderBar](GtkHeaderBar._tag)
  inline def apply(inline o: Ptr[GtkHeaderBar]): GtkHeaderBar_autoptr = o
  extension (v: GtkHeaderBar_autoptr)
    inline def value: Ptr[GtkHeaderBar] = v

opaque type GtkHeaderBar_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkHeaderBar_listautoptr: 
  given _tag: Tag[GtkHeaderBar_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkHeaderBar_listautoptr = o
  extension (v: GtkHeaderBar_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkHeaderBar_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkHeaderBar_queueautoptr: 
  given _tag: Tag[GtkHeaderBar_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkHeaderBar_queueautoptr = o
  extension (v: GtkHeaderBar_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkHeaderBar_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkHeaderBar_slistautoptr: 
  given _tag: Tag[GtkHeaderBar_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkHeaderBar_slistautoptr = o
  extension (v: GtkHeaderBar_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkIMContextSimple_autoptr = Ptr[GtkIMContextSimple]
object GtkIMContextSimple_autoptr: 
  given _tag: Tag[GtkIMContextSimple_autoptr] = Tag.Ptr[GtkIMContextSimple](GtkIMContextSimple._tag)
  inline def apply(inline o: Ptr[GtkIMContextSimple]): GtkIMContextSimple_autoptr = o
  extension (v: GtkIMContextSimple_autoptr)
    inline def value: Ptr[GtkIMContextSimple] = v

opaque type GtkIMContextSimple_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkIMContextSimple_listautoptr: 
  given _tag: Tag[GtkIMContextSimple_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkIMContextSimple_listautoptr = o
  extension (v: GtkIMContextSimple_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkIMContextSimple_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkIMContextSimple_queueautoptr: 
  given _tag: Tag[GtkIMContextSimple_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkIMContextSimple_queueautoptr = o
  extension (v: GtkIMContextSimple_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkIMContextSimple_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkIMContextSimple_slistautoptr: 
  given _tag: Tag[GtkIMContextSimple_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkIMContextSimple_slistautoptr = o
  extension (v: GtkIMContextSimple_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkIMContext_autoptr = Ptr[GtkIMContext]
object GtkIMContext_autoptr: 
  given _tag: Tag[GtkIMContext_autoptr] = Tag.Ptr[GtkIMContext](GtkIMContext._tag)
  inline def apply(inline o: Ptr[GtkIMContext]): GtkIMContext_autoptr = o
  extension (v: GtkIMContext_autoptr)
    inline def value: Ptr[GtkIMContext] = v

opaque type GtkIMContext_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkIMContext_listautoptr: 
  given _tag: Tag[GtkIMContext_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkIMContext_listautoptr = o
  extension (v: GtkIMContext_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkIMContext_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkIMContext_queueautoptr: 
  given _tag: Tag[GtkIMContext_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkIMContext_queueautoptr = o
  extension (v: GtkIMContext_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkIMContext_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkIMContext_slistautoptr: 
  given _tag: Tag[GtkIMContext_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkIMContext_slistautoptr = o
  extension (v: GtkIMContext_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkIMMulticontext_autoptr = Ptr[GtkIMMulticontext]
object GtkIMMulticontext_autoptr: 
  given _tag: Tag[GtkIMMulticontext_autoptr] = Tag.Ptr[GtkIMMulticontext](GtkIMMulticontext._tag)
  inline def apply(inline o: Ptr[GtkIMMulticontext]): GtkIMMulticontext_autoptr = o
  extension (v: GtkIMMulticontext_autoptr)
    inline def value: Ptr[GtkIMMulticontext] = v

opaque type GtkIMMulticontext_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkIMMulticontext_listautoptr: 
  given _tag: Tag[GtkIMMulticontext_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkIMMulticontext_listautoptr = o
  extension (v: GtkIMMulticontext_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkIMMulticontext_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkIMMulticontext_queueautoptr: 
  given _tag: Tag[GtkIMMulticontext_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkIMMulticontext_queueautoptr = o
  extension (v: GtkIMMulticontext_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkIMMulticontext_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkIMMulticontext_slistautoptr: 
  given _tag: Tag[GtkIMMulticontext_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkIMMulticontext_slistautoptr = o
  extension (v: GtkIMMulticontext_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkIconPaintable_autoptr = Ptr[GtkIconPaintable]
object GtkIconPaintable_autoptr: 
  given _tag: Tag[GtkIconPaintable_autoptr] = Tag.Ptr[GtkIconPaintable](GtkIconPaintable._tag)
  inline def apply(inline o: Ptr[GtkIconPaintable]): GtkIconPaintable_autoptr = o
  extension (v: GtkIconPaintable_autoptr)
    inline def value: Ptr[GtkIconPaintable] = v

opaque type GtkIconPaintable_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkIconPaintable_listautoptr: 
  given _tag: Tag[GtkIconPaintable_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkIconPaintable_listautoptr = o
  extension (v: GtkIconPaintable_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkIconPaintable_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkIconPaintable_queueautoptr: 
  given _tag: Tag[GtkIconPaintable_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkIconPaintable_queueautoptr = o
  extension (v: GtkIconPaintable_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkIconPaintable_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkIconPaintable_slistautoptr: 
  given _tag: Tag[GtkIconPaintable_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkIconPaintable_slistautoptr = o
  extension (v: GtkIconPaintable_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkIconTheme_autoptr = Ptr[GtkIconTheme]
object GtkIconTheme_autoptr: 
  given _tag: Tag[GtkIconTheme_autoptr] = Tag.Ptr[GtkIconTheme](GtkIconTheme._tag)
  inline def apply(inline o: Ptr[GtkIconTheme]): GtkIconTheme_autoptr = o
  extension (v: GtkIconTheme_autoptr)
    inline def value: Ptr[GtkIconTheme] = v

opaque type GtkIconTheme_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkIconTheme_listautoptr: 
  given _tag: Tag[GtkIconTheme_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkIconTheme_listautoptr = o
  extension (v: GtkIconTheme_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkIconTheme_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkIconTheme_queueautoptr: 
  given _tag: Tag[GtkIconTheme_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkIconTheme_queueautoptr = o
  extension (v: GtkIconTheme_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkIconTheme_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkIconTheme_slistautoptr: 
  given _tag: Tag[GtkIconTheme_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkIconTheme_slistautoptr = o
  extension (v: GtkIconTheme_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkIconViewForeachFunc: _view: a `GtkIconView` : The `GtkTreePath` of a selected row
*/
opaque type GtkIconViewForeachFunc = CFuncPtr3[Ptr[GtkIconView], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GtkIconViewForeachFunc: 
  given _tag: Tag[GtkIconViewForeachFunc] = Tag.materializeCFuncPtr3[Ptr[GtkIconView], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkIconViewForeachFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GtkIconView], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gpointer, Unit]): GtkIconViewForeachFunc = o
  extension (v: GtkIconViewForeachFunc)
    inline def value: CFuncPtr3[Ptr[GtkIconView], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkIconView_autoptr = Ptr[GtkIconView]
object GtkIconView_autoptr: 
  given _tag: Tag[GtkIconView_autoptr] = Tag.Ptr[GtkIconView](GtkIconView._tag)
  inline def apply(inline o: Ptr[GtkIconView]): GtkIconView_autoptr = o
  extension (v: GtkIconView_autoptr)
    inline def value: Ptr[GtkIconView] = v

opaque type GtkIconView_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkIconView_listautoptr: 
  given _tag: Tag[GtkIconView_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkIconView_listautoptr = o
  extension (v: GtkIconView_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkIconView_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkIconView_queueautoptr: 
  given _tag: Tag[GtkIconView_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkIconView_queueautoptr = o
  extension (v: GtkIconView_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkIconView_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkIconView_slistautoptr: 
  given _tag: Tag[GtkIconView_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkIconView_slistautoptr = o
  extension (v: GtkIconView_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkImage_autoptr = Ptr[GtkImage]
object GtkImage_autoptr: 
  given _tag: Tag[GtkImage_autoptr] = Tag.Ptr[GtkImage](GtkImage._tag)
  inline def apply(inline o: Ptr[GtkImage]): GtkImage_autoptr = o
  extension (v: GtkImage_autoptr)
    inline def value: Ptr[GtkImage] = v

opaque type GtkImage_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkImage_listautoptr: 
  given _tag: Tag[GtkImage_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkImage_listautoptr = o
  extension (v: GtkImage_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkImage_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkImage_queueautoptr: 
  given _tag: Tag[GtkImage_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkImage_queueautoptr = o
  extension (v: GtkImage_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkImage_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkImage_slistautoptr: 
  given _tag: Tag[GtkImage_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkImage_slistautoptr = o
  extension (v: GtkImage_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkInfoBar_autoptr = Ptr[GtkInfoBar]
object GtkInfoBar_autoptr: 
  given _tag: Tag[GtkInfoBar_autoptr] = Tag.Ptr[GtkInfoBar](GtkInfoBar._tag)
  inline def apply(inline o: Ptr[GtkInfoBar]): GtkInfoBar_autoptr = o
  extension (v: GtkInfoBar_autoptr)
    inline def value: Ptr[GtkInfoBar] = v

opaque type GtkInfoBar_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkInfoBar_listautoptr: 
  given _tag: Tag[GtkInfoBar_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkInfoBar_listautoptr = o
  extension (v: GtkInfoBar_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkInfoBar_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkInfoBar_queueautoptr: 
  given _tag: Tag[GtkInfoBar_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkInfoBar_queueautoptr = o
  extension (v: GtkInfoBar_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkInfoBar_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkInfoBar_slistautoptr: 
  given _tag: Tag[GtkInfoBar_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkInfoBar_slistautoptr = o
  extension (v: GtkInfoBar_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkInscriptionClass_autoptr = Ptr[GtkInscriptionClass]
object GtkInscriptionClass_autoptr: 
  given _tag: Tag[GtkInscriptionClass_autoptr] = Tag.Ptr[GtkInscriptionClass](GtkInscriptionClass._tag)
  inline def apply(inline o: Ptr[GtkInscriptionClass]): GtkInscriptionClass_autoptr = o
  extension (v: GtkInscriptionClass_autoptr)
    inline def value: Ptr[GtkInscriptionClass] = v

opaque type GtkInscriptionClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkInscriptionClass_listautoptr: 
  given _tag: Tag[GtkInscriptionClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkInscriptionClass_listautoptr = o
  extension (v: GtkInscriptionClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkInscriptionClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkInscriptionClass_queueautoptr: 
  given _tag: Tag[GtkInscriptionClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkInscriptionClass_queueautoptr = o
  extension (v: GtkInscriptionClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkInscriptionClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkInscriptionClass_slistautoptr: 
  given _tag: Tag[GtkInscriptionClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkInscriptionClass_slistautoptr = o
  extension (v: GtkInscriptionClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkInscription_autoptr = Ptr[GtkInscription]
object GtkInscription_autoptr: 
  given _tag: Tag[GtkInscription_autoptr] = Tag.Ptr[GtkInscription](GtkInscription._tag)
  inline def apply(inline o: Ptr[GtkInscription]): GtkInscription_autoptr = o
  extension (v: GtkInscription_autoptr)
    inline def value: Ptr[GtkInscription] = v

opaque type GtkInscription_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkInscription_listautoptr: 
  given _tag: Tag[GtkInscription_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkInscription_listautoptr = o
  extension (v: GtkInscription_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkInscription_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkInscription_queueautoptr: 
  given _tag: Tag[GtkInscription_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkInscription_queueautoptr = o
  extension (v: GtkInscription_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkInscription_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkInscription_slistautoptr: 
  given _tag: Tag[GtkInscription_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkInscription_slistautoptr = o
  extension (v: GtkInscription_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkKeyvalTriggerClass_autoptr = Ptr[GtkKeyvalTriggerClass]
object GtkKeyvalTriggerClass_autoptr: 
  given _tag: Tag[GtkKeyvalTriggerClass_autoptr] = Tag.Ptr[GtkKeyvalTriggerClass](GtkKeyvalTriggerClass._tag)
  inline def apply(inline o: Ptr[GtkKeyvalTriggerClass]): GtkKeyvalTriggerClass_autoptr = o
  extension (v: GtkKeyvalTriggerClass_autoptr)
    inline def value: Ptr[GtkKeyvalTriggerClass] = v

opaque type GtkKeyvalTriggerClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkKeyvalTriggerClass_listautoptr: 
  given _tag: Tag[GtkKeyvalTriggerClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkKeyvalTriggerClass_listautoptr = o
  extension (v: GtkKeyvalTriggerClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkKeyvalTriggerClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkKeyvalTriggerClass_queueautoptr: 
  given _tag: Tag[GtkKeyvalTriggerClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkKeyvalTriggerClass_queueautoptr = o
  extension (v: GtkKeyvalTriggerClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkKeyvalTriggerClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkKeyvalTriggerClass_slistautoptr: 
  given _tag: Tag[GtkKeyvalTriggerClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkKeyvalTriggerClass_slistautoptr = o
  extension (v: GtkKeyvalTriggerClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkKeyvalTrigger_autoptr = Ptr[GtkKeyvalTrigger]
object GtkKeyvalTrigger_autoptr: 
  given _tag: Tag[GtkKeyvalTrigger_autoptr] = Tag.Ptr[GtkKeyvalTrigger](GtkKeyvalTrigger._tag)
  inline def apply(inline o: Ptr[GtkKeyvalTrigger]): GtkKeyvalTrigger_autoptr = o
  extension (v: GtkKeyvalTrigger_autoptr)
    inline def value: Ptr[GtkKeyvalTrigger] = v

opaque type GtkKeyvalTrigger_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkKeyvalTrigger_listautoptr: 
  given _tag: Tag[GtkKeyvalTrigger_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkKeyvalTrigger_listautoptr = o
  extension (v: GtkKeyvalTrigger_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkKeyvalTrigger_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkKeyvalTrigger_queueautoptr: 
  given _tag: Tag[GtkKeyvalTrigger_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkKeyvalTrigger_queueautoptr = o
  extension (v: GtkKeyvalTrigger_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkKeyvalTrigger_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkKeyvalTrigger_slistautoptr: 
  given _tag: Tag[GtkKeyvalTrigger_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkKeyvalTrigger_slistautoptr = o
  extension (v: GtkKeyvalTrigger_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkLabel_autoptr = Ptr[GtkLabel]
object GtkLabel_autoptr: 
  given _tag: Tag[GtkLabel_autoptr] = Tag.Ptr[GtkLabel](GtkLabel._tag)
  inline def apply(inline o: Ptr[GtkLabel]): GtkLabel_autoptr = o
  extension (v: GtkLabel_autoptr)
    inline def value: Ptr[GtkLabel] = v

opaque type GtkLabel_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkLabel_listautoptr: 
  given _tag: Tag[GtkLabel_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkLabel_listautoptr = o
  extension (v: GtkLabel_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkLabel_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkLabel_queueautoptr: 
  given _tag: Tag[GtkLabel_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkLabel_queueautoptr = o
  extension (v: GtkLabel_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkLabel_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkLabel_slistautoptr: 
  given _tag: Tag[GtkLabel_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkLabel_slistautoptr = o
  extension (v: GtkLabel_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkLayoutChildClass_autoptr = Ptr[GtkLayoutChildClass]
object GtkLayoutChildClass_autoptr: 
  given _tag: Tag[GtkLayoutChildClass_autoptr] = Tag.Ptr[GtkLayoutChildClass](GtkLayoutChildClass._tag)
  inline def apply(inline o: Ptr[GtkLayoutChildClass]): GtkLayoutChildClass_autoptr = o
  extension (v: GtkLayoutChildClass_autoptr)
    inline def value: Ptr[GtkLayoutChildClass] = v

opaque type GtkLayoutChildClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkLayoutChildClass_listautoptr: 
  given _tag: Tag[GtkLayoutChildClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkLayoutChildClass_listautoptr = o
  extension (v: GtkLayoutChildClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkLayoutChildClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkLayoutChildClass_queueautoptr: 
  given _tag: Tag[GtkLayoutChildClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkLayoutChildClass_queueautoptr = o
  extension (v: GtkLayoutChildClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkLayoutChildClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkLayoutChildClass_slistautoptr: 
  given _tag: Tag[GtkLayoutChildClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkLayoutChildClass_slistautoptr = o
  extension (v: GtkLayoutChildClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkLayoutChild_autoptr = Ptr[GtkLayoutChild]
object GtkLayoutChild_autoptr: 
  given _tag: Tag[GtkLayoutChild_autoptr] = Tag.Ptr[GtkLayoutChild](GtkLayoutChild._tag)
  inline def apply(inline o: Ptr[GtkLayoutChild]): GtkLayoutChild_autoptr = o
  extension (v: GtkLayoutChild_autoptr)
    inline def value: Ptr[GtkLayoutChild] = v

opaque type GtkLayoutChild_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkLayoutChild_listautoptr: 
  given _tag: Tag[GtkLayoutChild_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkLayoutChild_listautoptr = o
  extension (v: GtkLayoutChild_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkLayoutChild_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkLayoutChild_queueautoptr: 
  given _tag: Tag[GtkLayoutChild_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkLayoutChild_queueautoptr = o
  extension (v: GtkLayoutChild_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkLayoutChild_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkLayoutChild_slistautoptr: 
  given _tag: Tag[GtkLayoutChild_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkLayoutChild_slistautoptr = o
  extension (v: GtkLayoutChild_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkLayoutManagerClass_autoptr = Ptr[GtkLayoutManagerClass]
object GtkLayoutManagerClass_autoptr: 
  given _tag: Tag[GtkLayoutManagerClass_autoptr] = Tag.Ptr[GtkLayoutManagerClass](GtkLayoutManagerClass._tag)
  inline def apply(inline o: Ptr[GtkLayoutManagerClass]): GtkLayoutManagerClass_autoptr = o
  extension (v: GtkLayoutManagerClass_autoptr)
    inline def value: Ptr[GtkLayoutManagerClass] = v

opaque type GtkLayoutManagerClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkLayoutManagerClass_listautoptr: 
  given _tag: Tag[GtkLayoutManagerClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkLayoutManagerClass_listautoptr = o
  extension (v: GtkLayoutManagerClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkLayoutManagerClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkLayoutManagerClass_queueautoptr: 
  given _tag: Tag[GtkLayoutManagerClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkLayoutManagerClass_queueautoptr = o
  extension (v: GtkLayoutManagerClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkLayoutManagerClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkLayoutManagerClass_slistautoptr: 
  given _tag: Tag[GtkLayoutManagerClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkLayoutManagerClass_slistautoptr = o
  extension (v: GtkLayoutManagerClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkLayoutManager_autoptr = Ptr[GtkLayoutManager]
object GtkLayoutManager_autoptr: 
  given _tag: Tag[GtkLayoutManager_autoptr] = Tag.Ptr[GtkLayoutManager](GtkLayoutManager._tag)
  inline def apply(inline o: Ptr[GtkLayoutManager]): GtkLayoutManager_autoptr = o
  extension (v: GtkLayoutManager_autoptr)
    inline def value: Ptr[GtkLayoutManager] = v

opaque type GtkLayoutManager_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkLayoutManager_listautoptr: 
  given _tag: Tag[GtkLayoutManager_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkLayoutManager_listautoptr = o
  extension (v: GtkLayoutManager_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkLayoutManager_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkLayoutManager_queueautoptr: 
  given _tag: Tag[GtkLayoutManager_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkLayoutManager_queueautoptr = o
  extension (v: GtkLayoutManager_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkLayoutManager_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkLayoutManager_slistautoptr: 
  given _tag: Tag[GtkLayoutManager_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkLayoutManager_slistautoptr = o
  extension (v: GtkLayoutManager_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkLevelBar_autoptr = Ptr[GtkLevelBar]
object GtkLevelBar_autoptr: 
  given _tag: Tag[GtkLevelBar_autoptr] = Tag.Ptr[GtkLevelBar](GtkLevelBar._tag)
  inline def apply(inline o: Ptr[GtkLevelBar]): GtkLevelBar_autoptr = o
  extension (v: GtkLevelBar_autoptr)
    inline def value: Ptr[GtkLevelBar] = v

opaque type GtkLevelBar_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkLevelBar_listautoptr: 
  given _tag: Tag[GtkLevelBar_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkLevelBar_listautoptr = o
  extension (v: GtkLevelBar_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkLevelBar_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkLevelBar_queueautoptr: 
  given _tag: Tag[GtkLevelBar_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkLevelBar_queueautoptr = o
  extension (v: GtkLevelBar_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkLevelBar_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkLevelBar_slistautoptr: 
  given _tag: Tag[GtkLevelBar_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkLevelBar_slistautoptr = o
  extension (v: GtkLevelBar_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkLinkButton_autoptr = Ptr[GtkLinkButton]
object GtkLinkButton_autoptr: 
  given _tag: Tag[GtkLinkButton_autoptr] = Tag.Ptr[GtkLinkButton](GtkLinkButton._tag)
  inline def apply(inline o: Ptr[GtkLinkButton]): GtkLinkButton_autoptr = o
  extension (v: GtkLinkButton_autoptr)
    inline def value: Ptr[GtkLinkButton] = v

opaque type GtkLinkButton_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkLinkButton_listautoptr: 
  given _tag: Tag[GtkLinkButton_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkLinkButton_listautoptr = o
  extension (v: GtkLinkButton_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkLinkButton_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkLinkButton_queueautoptr: 
  given _tag: Tag[GtkLinkButton_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkLinkButton_queueautoptr = o
  extension (v: GtkLinkButton_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkLinkButton_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkLinkButton_slistautoptr: 
  given _tag: Tag[GtkLinkButton_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkLinkButton_slistautoptr = o
  extension (v: GtkLinkButton_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkListBoxCreateWidgetFunc: : (type GObject): the item from the model for which to create a widget for _data: (closure): user data
*/
opaque type GtkListBoxCreateWidgetFunc = CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[GtkWidget]]
object GtkListBoxCreateWidgetFunc: 
  given _tag: Tag[GtkListBoxCreateWidgetFunc] = Tag.materializeCFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[GtkWidget]]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkListBoxCreateWidgetFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[GtkWidget]]): GtkListBoxCreateWidgetFunc = o
  extension (v: GtkListBoxCreateWidgetFunc)
    inline def value: CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[GtkWidget]] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * GtkListBoxFilterFunc: : the row that may be filtered _data: (closure): user data
*/
opaque type GtkListBoxFilterFunc = CFuncPtr2[Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GtkListBoxFilterFunc: 
  given _tag: Tag[GtkListBoxFilterFunc] = Tag.materializeCFuncPtr2[Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkListBoxFilterFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GtkListBoxFilterFunc = o
  extension (v: GtkListBoxFilterFunc)
    inline def value: CFuncPtr2[Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkListBoxForeachFunc = CFuncPtr3[Ptr[GtkListBox], Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GtkListBoxForeachFunc: 
  given _tag: Tag[GtkListBoxForeachFunc] = Tag.materializeCFuncPtr3[Ptr[GtkListBox], Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkListBoxForeachFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GtkListBox], Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, Unit]): GtkListBoxForeachFunc = o
  extension (v: GtkListBoxForeachFunc)
    inline def value: CFuncPtr3[Ptr[GtkListBox], Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkListBoxRow_autoptr = Ptr[GtkListBoxRow]
object GtkListBoxRow_autoptr: 
  given _tag: Tag[GtkListBoxRow_autoptr] = Tag.Ptr[GtkListBoxRow](GtkListBoxRow._tag)
  inline def apply(inline o: Ptr[GtkListBoxRow]): GtkListBoxRow_autoptr = o
  extension (v: GtkListBoxRow_autoptr)
    inline def value: Ptr[GtkListBoxRow] = v

opaque type GtkListBoxRow_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkListBoxRow_listautoptr: 
  given _tag: Tag[GtkListBoxRow_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkListBoxRow_listautoptr = o
  extension (v: GtkListBoxRow_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkListBoxRow_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkListBoxRow_queueautoptr: 
  given _tag: Tag[GtkListBoxRow_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkListBoxRow_queueautoptr = o
  extension (v: GtkListBoxRow_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkListBoxRow_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkListBoxRow_slistautoptr: 
  given _tag: Tag[GtkListBoxRow_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkListBoxRow_slistautoptr = o
  extension (v: GtkListBoxRow_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkListBoxSortFunc: : the first row : the second row _data: (closure): user data
*/
opaque type GtkListBoxSortFunc = CFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, CInt]
object GtkListBoxSortFunc: 
  given _tag: Tag[GtkListBoxSortFunc] = Tag.materializeCFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, CInt]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkListBoxSortFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, CInt]): GtkListBoxSortFunc = o
  extension (v: GtkListBoxSortFunc)
    inline def value: CFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, CInt] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * GtkListBoxUpdateHeaderFunc: : the row to update : (nullable): the row before , or %NULL if it is first _data: (closure): user data
*/
opaque type GtkListBoxUpdateHeaderFunc = CFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GtkListBoxUpdateHeaderFunc: 
  given _tag: Tag[GtkListBoxUpdateHeaderFunc] = Tag.materializeCFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkListBoxUpdateHeaderFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, Unit]): GtkListBoxUpdateHeaderFunc = o
  extension (v: GtkListBoxUpdateHeaderFunc)
    inline def value: CFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkListBox_autoptr = Ptr[GtkListBox]
object GtkListBox_autoptr: 
  given _tag: Tag[GtkListBox_autoptr] = Tag.Ptr[GtkListBox](GtkListBox._tag)
  inline def apply(inline o: Ptr[GtkListBox]): GtkListBox_autoptr = o
  extension (v: GtkListBox_autoptr)
    inline def value: Ptr[GtkListBox] = v

opaque type GtkListBox_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkListBox_listautoptr: 
  given _tag: Tag[GtkListBox_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkListBox_listautoptr = o
  extension (v: GtkListBox_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkListBox_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkListBox_queueautoptr: 
  given _tag: Tag[GtkListBox_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkListBox_queueautoptr = o
  extension (v: GtkListBox_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkListBox_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkListBox_slistautoptr: 
  given _tag: Tag[GtkListBox_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkListBox_slistautoptr = o
  extension (v: GtkListBox_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkListHeaderClass_autoptr = Ptr[GtkListHeaderClass]
object GtkListHeaderClass_autoptr: 
  given _tag: Tag[GtkListHeaderClass_autoptr] = Tag.Ptr[GtkListHeaderClass](GtkListHeaderClass._tag)
  inline def apply(inline o: Ptr[GtkListHeaderClass]): GtkListHeaderClass_autoptr = o
  extension (v: GtkListHeaderClass_autoptr)
    inline def value: Ptr[GtkListHeaderClass] = v

opaque type GtkListHeaderClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkListHeaderClass_listautoptr: 
  given _tag: Tag[GtkListHeaderClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkListHeaderClass_listautoptr = o
  extension (v: GtkListHeaderClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkListHeaderClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkListHeaderClass_queueautoptr: 
  given _tag: Tag[GtkListHeaderClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkListHeaderClass_queueautoptr = o
  extension (v: GtkListHeaderClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkListHeaderClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkListHeaderClass_slistautoptr: 
  given _tag: Tag[GtkListHeaderClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkListHeaderClass_slistautoptr = o
  extension (v: GtkListHeaderClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkListHeader_autoptr = Ptr[GtkListHeader]
object GtkListHeader_autoptr: 
  given _tag: Tag[GtkListHeader_autoptr] = Tag.Ptr[GtkListHeader](GtkListHeader._tag)
  inline def apply(inline o: Ptr[GtkListHeader]): GtkListHeader_autoptr = o
  extension (v: GtkListHeader_autoptr)
    inline def value: Ptr[GtkListHeader] = v

opaque type GtkListHeader_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkListHeader_listautoptr: 
  given _tag: Tag[GtkListHeader_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkListHeader_listautoptr = o
  extension (v: GtkListHeader_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkListHeader_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkListHeader_queueautoptr: 
  given _tag: Tag[GtkListHeader_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkListHeader_queueautoptr = o
  extension (v: GtkListHeader_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkListHeader_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkListHeader_slistautoptr: 
  given _tag: Tag[GtkListHeader_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkListHeader_slistautoptr = o
  extension (v: GtkListHeader_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkListItemClass_autoptr = Ptr[GtkListItemClass]
object GtkListItemClass_autoptr: 
  given _tag: Tag[GtkListItemClass_autoptr] = Tag.Ptr[GtkListItemClass](GtkListItemClass._tag)
  inline def apply(inline o: Ptr[GtkListItemClass]): GtkListItemClass_autoptr = o
  extension (v: GtkListItemClass_autoptr)
    inline def value: Ptr[GtkListItemClass] = v

opaque type GtkListItemClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkListItemClass_listautoptr: 
  given _tag: Tag[GtkListItemClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkListItemClass_listautoptr = o
  extension (v: GtkListItemClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkListItemClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkListItemClass_queueautoptr: 
  given _tag: Tag[GtkListItemClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkListItemClass_queueautoptr = o
  extension (v: GtkListItemClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkListItemClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkListItemClass_slistautoptr: 
  given _tag: Tag[GtkListItemClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkListItemClass_slistautoptr = o
  extension (v: GtkListItemClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkListItemFactory_autoptr = Ptr[GtkListItemFactory]
object GtkListItemFactory_autoptr: 
  given _tag: Tag[GtkListItemFactory_autoptr] = Tag.Ptr[GtkListItemFactory](GtkListItemFactory._tag)
  inline def apply(inline o: Ptr[GtkListItemFactory]): GtkListItemFactory_autoptr = o
  extension (v: GtkListItemFactory_autoptr)
    inline def value: Ptr[GtkListItemFactory] = v

opaque type GtkListItemFactory_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkListItemFactory_listautoptr: 
  given _tag: Tag[GtkListItemFactory_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkListItemFactory_listautoptr = o
  extension (v: GtkListItemFactory_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkListItemFactory_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkListItemFactory_queueautoptr: 
  given _tag: Tag[GtkListItemFactory_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkListItemFactory_queueautoptr = o
  extension (v: GtkListItemFactory_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkListItemFactory_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkListItemFactory_slistautoptr: 
  given _tag: Tag[GtkListItemFactory_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkListItemFactory_slistautoptr = o
  extension (v: GtkListItemFactory_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkListItem_autoptr = Ptr[GtkListItem]
object GtkListItem_autoptr: 
  given _tag: Tag[GtkListItem_autoptr] = Tag.Ptr[GtkListItem](GtkListItem._tag)
  inline def apply(inline o: Ptr[GtkListItem]): GtkListItem_autoptr = o
  extension (v: GtkListItem_autoptr)
    inline def value: Ptr[GtkListItem] = v

opaque type GtkListItem_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkListItem_listautoptr: 
  given _tag: Tag[GtkListItem_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkListItem_listautoptr = o
  extension (v: GtkListItem_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkListItem_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkListItem_queueautoptr: 
  given _tag: Tag[GtkListItem_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkListItem_queueautoptr = o
  extension (v: GtkListItem_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkListItem_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkListItem_slistautoptr: 
  given _tag: Tag[GtkListItem_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkListItem_slistautoptr = o
  extension (v: GtkListItem_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkListStore_autoptr = Ptr[GtkListStore]
object GtkListStore_autoptr: 
  given _tag: Tag[GtkListStore_autoptr] = Tag.Ptr[GtkListStore](GtkListStore._tag)
  inline def apply(inline o: Ptr[GtkListStore]): GtkListStore_autoptr = o
  extension (v: GtkListStore_autoptr)
    inline def value: Ptr[GtkListStore] = v

opaque type GtkListStore_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkListStore_listautoptr: 
  given _tag: Tag[GtkListStore_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkListStore_listautoptr = o
  extension (v: GtkListStore_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkListStore_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkListStore_queueautoptr: 
  given _tag: Tag[GtkListStore_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkListStore_queueautoptr = o
  extension (v: GtkListStore_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkListStore_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkListStore_slistautoptr: 
  given _tag: Tag[GtkListStore_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkListStore_slistautoptr = o
  extension (v: GtkListStore_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkListView_autoptr = Ptr[GtkListView]
object GtkListView_autoptr: 
  given _tag: Tag[GtkListView_autoptr] = Tag.Ptr[GtkListView](GtkListView._tag)
  inline def apply(inline o: Ptr[GtkListView]): GtkListView_autoptr = o
  extension (v: GtkListView_autoptr)
    inline def value: Ptr[GtkListView] = v

opaque type GtkListView_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkListView_listautoptr: 
  given _tag: Tag[GtkListView_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkListView_listautoptr = o
  extension (v: GtkListView_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkListView_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkListView_queueautoptr: 
  given _tag: Tag[GtkListView_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkListView_queueautoptr = o
  extension (v: GtkListView_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkListView_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkListView_slistautoptr: 
  given _tag: Tag[GtkListView_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkListView_slistautoptr = o
  extension (v: GtkListView_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkLockButton_autoptr = Ptr[GtkLockButton]
object GtkLockButton_autoptr: 
  given _tag: Tag[GtkLockButton_autoptr] = Tag.Ptr[GtkLockButton](GtkLockButton._tag)
  inline def apply(inline o: Ptr[GtkLockButton]): GtkLockButton_autoptr = o
  extension (v: GtkLockButton_autoptr)
    inline def value: Ptr[GtkLockButton] = v

opaque type GtkLockButton_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkLockButton_listautoptr: 
  given _tag: Tag[GtkLockButton_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkLockButton_listautoptr = o
  extension (v: GtkLockButton_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkLockButton_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkLockButton_queueautoptr: 
  given _tag: Tag[GtkLockButton_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkLockButton_queueautoptr = o
  extension (v: GtkLockButton_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkLockButton_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkLockButton_slistautoptr: 
  given _tag: Tag[GtkLockButton_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkLockButton_slistautoptr = o
  extension (v: GtkLockButton_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkMapListModelClass_autoptr = Ptr[GtkMapListModelClass]
object GtkMapListModelClass_autoptr: 
  given _tag: Tag[GtkMapListModelClass_autoptr] = Tag.Ptr[GtkMapListModelClass](GtkMapListModelClass._tag)
  inline def apply(inline o: Ptr[GtkMapListModelClass]): GtkMapListModelClass_autoptr = o
  extension (v: GtkMapListModelClass_autoptr)
    inline def value: Ptr[GtkMapListModelClass] = v

opaque type GtkMapListModelClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkMapListModelClass_listautoptr: 
  given _tag: Tag[GtkMapListModelClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkMapListModelClass_listautoptr = o
  extension (v: GtkMapListModelClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkMapListModelClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkMapListModelClass_queueautoptr: 
  given _tag: Tag[GtkMapListModelClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkMapListModelClass_queueautoptr = o
  extension (v: GtkMapListModelClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkMapListModelClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkMapListModelClass_slistautoptr: 
  given _tag: Tag[GtkMapListModelClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkMapListModelClass_slistautoptr = o
  extension (v: GtkMapListModelClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkMapListModelMapFunc: : (type GObject) (transfer full): The item to map _data: user data
*/
opaque type GtkMapListModelMapFunc = CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer]
object GtkMapListModelMapFunc: 
  given _tag: Tag[GtkMapListModelMapFunc] = Tag.materializeCFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkMapListModelMapFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer]): GtkMapListModelMapFunc = o
  extension (v: GtkMapListModelMapFunc)
    inline def value: CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkMapListModel_autoptr = Ptr[GtkMapListModel]
object GtkMapListModel_autoptr: 
  given _tag: Tag[GtkMapListModel_autoptr] = Tag.Ptr[GtkMapListModel](GtkMapListModel._tag)
  inline def apply(inline o: Ptr[GtkMapListModel]): GtkMapListModel_autoptr = o
  extension (v: GtkMapListModel_autoptr)
    inline def value: Ptr[GtkMapListModel] = v

opaque type GtkMapListModel_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkMapListModel_listautoptr: 
  given _tag: Tag[GtkMapListModel_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkMapListModel_listautoptr = o
  extension (v: GtkMapListModel_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkMapListModel_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkMapListModel_queueautoptr: 
  given _tag: Tag[GtkMapListModel_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkMapListModel_queueautoptr = o
  extension (v: GtkMapListModel_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkMapListModel_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkMapListModel_slistautoptr: 
  given _tag: Tag[GtkMapListModel_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkMapListModel_slistautoptr = o
  extension (v: GtkMapListModel_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkMediaControlsClass_autoptr = Ptr[GtkMediaControlsClass]
object GtkMediaControlsClass_autoptr: 
  given _tag: Tag[GtkMediaControlsClass_autoptr] = Tag.Ptr[GtkMediaControlsClass](GtkMediaControlsClass._tag)
  inline def apply(inline o: Ptr[GtkMediaControlsClass]): GtkMediaControlsClass_autoptr = o
  extension (v: GtkMediaControlsClass_autoptr)
    inline def value: Ptr[GtkMediaControlsClass] = v

opaque type GtkMediaControlsClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkMediaControlsClass_listautoptr: 
  given _tag: Tag[GtkMediaControlsClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkMediaControlsClass_listautoptr = o
  extension (v: GtkMediaControlsClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkMediaControlsClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkMediaControlsClass_queueautoptr: 
  given _tag: Tag[GtkMediaControlsClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkMediaControlsClass_queueautoptr = o
  extension (v: GtkMediaControlsClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkMediaControlsClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkMediaControlsClass_slistautoptr: 
  given _tag: Tag[GtkMediaControlsClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkMediaControlsClass_slistautoptr = o
  extension (v: GtkMediaControlsClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkMediaControls_autoptr = Ptr[GtkMediaControls]
object GtkMediaControls_autoptr: 
  given _tag: Tag[GtkMediaControls_autoptr] = Tag.Ptr[GtkMediaControls](GtkMediaControls._tag)
  inline def apply(inline o: Ptr[GtkMediaControls]): GtkMediaControls_autoptr = o
  extension (v: GtkMediaControls_autoptr)
    inline def value: Ptr[GtkMediaControls] = v

opaque type GtkMediaControls_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkMediaControls_listautoptr: 
  given _tag: Tag[GtkMediaControls_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkMediaControls_listautoptr = o
  extension (v: GtkMediaControls_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkMediaControls_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkMediaControls_queueautoptr: 
  given _tag: Tag[GtkMediaControls_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkMediaControls_queueautoptr = o
  extension (v: GtkMediaControls_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkMediaControls_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkMediaControls_slistautoptr: 
  given _tag: Tag[GtkMediaControls_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkMediaControls_slistautoptr = o
  extension (v: GtkMediaControls_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkMediaFileClass_autoptr = Ptr[GtkMediaFileClass]
object GtkMediaFileClass_autoptr: 
  given _tag: Tag[GtkMediaFileClass_autoptr] = Tag.Ptr[GtkMediaFileClass](GtkMediaFileClass._tag)
  inline def apply(inline o: Ptr[GtkMediaFileClass]): GtkMediaFileClass_autoptr = o
  extension (v: GtkMediaFileClass_autoptr)
    inline def value: Ptr[GtkMediaFileClass] = v

opaque type GtkMediaFileClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkMediaFileClass_listautoptr: 
  given _tag: Tag[GtkMediaFileClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkMediaFileClass_listautoptr = o
  extension (v: GtkMediaFileClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkMediaFileClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkMediaFileClass_queueautoptr: 
  given _tag: Tag[GtkMediaFileClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkMediaFileClass_queueautoptr = o
  extension (v: GtkMediaFileClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkMediaFileClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkMediaFileClass_slistautoptr: 
  given _tag: Tag[GtkMediaFileClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkMediaFileClass_slistautoptr = o
  extension (v: GtkMediaFileClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkMediaFile_autoptr = Ptr[GtkMediaFile]
object GtkMediaFile_autoptr: 
  given _tag: Tag[GtkMediaFile_autoptr] = Tag.Ptr[GtkMediaFile](GtkMediaFile._tag)
  inline def apply(inline o: Ptr[GtkMediaFile]): GtkMediaFile_autoptr = o
  extension (v: GtkMediaFile_autoptr)
    inline def value: Ptr[GtkMediaFile] = v

opaque type GtkMediaFile_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkMediaFile_listautoptr: 
  given _tag: Tag[GtkMediaFile_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkMediaFile_listautoptr = o
  extension (v: GtkMediaFile_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkMediaFile_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkMediaFile_queueautoptr: 
  given _tag: Tag[GtkMediaFile_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkMediaFile_queueautoptr = o
  extension (v: GtkMediaFile_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkMediaFile_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkMediaFile_slistautoptr: 
  given _tag: Tag[GtkMediaFile_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkMediaFile_slistautoptr = o
  extension (v: GtkMediaFile_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkMediaStreamClass_autoptr = Ptr[GtkMediaStreamClass]
object GtkMediaStreamClass_autoptr: 
  given _tag: Tag[GtkMediaStreamClass_autoptr] = Tag.Ptr[GtkMediaStreamClass](GtkMediaStreamClass._tag)
  inline def apply(inline o: Ptr[GtkMediaStreamClass]): GtkMediaStreamClass_autoptr = o
  extension (v: GtkMediaStreamClass_autoptr)
    inline def value: Ptr[GtkMediaStreamClass] = v

opaque type GtkMediaStreamClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkMediaStreamClass_listautoptr: 
  given _tag: Tag[GtkMediaStreamClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkMediaStreamClass_listautoptr = o
  extension (v: GtkMediaStreamClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkMediaStreamClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkMediaStreamClass_queueautoptr: 
  given _tag: Tag[GtkMediaStreamClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkMediaStreamClass_queueautoptr = o
  extension (v: GtkMediaStreamClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkMediaStreamClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkMediaStreamClass_slistautoptr: 
  given _tag: Tag[GtkMediaStreamClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkMediaStreamClass_slistautoptr = o
  extension (v: GtkMediaStreamClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkMediaStream_autoptr = Ptr[GtkMediaStream]
object GtkMediaStream_autoptr: 
  given _tag: Tag[GtkMediaStream_autoptr] = Tag.Ptr[GtkMediaStream](GtkMediaStream._tag)
  inline def apply(inline o: Ptr[GtkMediaStream]): GtkMediaStream_autoptr = o
  extension (v: GtkMediaStream_autoptr)
    inline def value: Ptr[GtkMediaStream] = v

opaque type GtkMediaStream_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkMediaStream_listautoptr: 
  given _tag: Tag[GtkMediaStream_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkMediaStream_listautoptr = o
  extension (v: GtkMediaStream_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkMediaStream_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkMediaStream_queueautoptr: 
  given _tag: Tag[GtkMediaStream_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkMediaStream_queueautoptr = o
  extension (v: GtkMediaStream_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkMediaStream_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkMediaStream_slistautoptr: 
  given _tag: Tag[GtkMediaStream_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkMediaStream_slistautoptr = o
  extension (v: GtkMediaStream_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkMenuButtonCreatePopupFunc: _button: the `GtkMenuButton` _data: User data passed to gtk_menu_button_set_create_popup_func()
*/
opaque type GtkMenuButtonCreatePopupFunc = CFuncPtr2[Ptr[GtkMenuButton], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GtkMenuButtonCreatePopupFunc: 
  given _tag: Tag[GtkMenuButtonCreatePopupFunc] = Tag.materializeCFuncPtr2[Ptr[GtkMenuButton], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkMenuButtonCreatePopupFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GtkMenuButton], _root_.sn.gnome.glib.internal.gpointer, Unit]): GtkMenuButtonCreatePopupFunc = o
  extension (v: GtkMenuButtonCreatePopupFunc)
    inline def value: CFuncPtr2[Ptr[GtkMenuButton], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkMenuButton_autoptr = Ptr[GtkMenuButton]
object GtkMenuButton_autoptr: 
  given _tag: Tag[GtkMenuButton_autoptr] = Tag.Ptr[GtkMenuButton](GtkMenuButton._tag)
  inline def apply(inline o: Ptr[GtkMenuButton]): GtkMenuButton_autoptr = o
  extension (v: GtkMenuButton_autoptr)
    inline def value: Ptr[GtkMenuButton] = v

opaque type GtkMenuButton_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkMenuButton_listautoptr: 
  given _tag: Tag[GtkMenuButton_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkMenuButton_listautoptr = o
  extension (v: GtkMenuButton_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkMenuButton_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkMenuButton_queueautoptr: 
  given _tag: Tag[GtkMenuButton_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkMenuButton_queueautoptr = o
  extension (v: GtkMenuButton_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkMenuButton_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkMenuButton_slistautoptr: 
  given _tag: Tag[GtkMenuButton_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkMenuButton_slistautoptr = o
  extension (v: GtkMenuButton_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkMessageDialog_autoptr = Ptr[GtkMessageDialog]
object GtkMessageDialog_autoptr: 
  given _tag: Tag[GtkMessageDialog_autoptr] = Tag.Ptr[GtkMessageDialog](GtkMessageDialog._tag)
  inline def apply(inline o: Ptr[GtkMessageDialog]): GtkMessageDialog_autoptr = o
  extension (v: GtkMessageDialog_autoptr)
    inline def value: Ptr[GtkMessageDialog] = v

opaque type GtkMessageDialog_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkMessageDialog_listautoptr: 
  given _tag: Tag[GtkMessageDialog_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkMessageDialog_listautoptr = o
  extension (v: GtkMessageDialog_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkMessageDialog_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkMessageDialog_queueautoptr: 
  given _tag: Tag[GtkMessageDialog_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkMessageDialog_queueautoptr = o
  extension (v: GtkMessageDialog_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkMessageDialog_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkMessageDialog_slistautoptr: 
  given _tag: Tag[GtkMessageDialog_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkMessageDialog_slistautoptr = o
  extension (v: GtkMessageDialog_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkMnemonicActionClass_autoptr = Ptr[GtkMnemonicActionClass]
object GtkMnemonicActionClass_autoptr: 
  given _tag: Tag[GtkMnemonicActionClass_autoptr] = Tag.Ptr[GtkMnemonicActionClass](GtkMnemonicActionClass._tag)
  inline def apply(inline o: Ptr[GtkMnemonicActionClass]): GtkMnemonicActionClass_autoptr = o
  extension (v: GtkMnemonicActionClass_autoptr)
    inline def value: Ptr[GtkMnemonicActionClass] = v

opaque type GtkMnemonicActionClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkMnemonicActionClass_listautoptr: 
  given _tag: Tag[GtkMnemonicActionClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkMnemonicActionClass_listautoptr = o
  extension (v: GtkMnemonicActionClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkMnemonicActionClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkMnemonicActionClass_queueautoptr: 
  given _tag: Tag[GtkMnemonicActionClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkMnemonicActionClass_queueautoptr = o
  extension (v: GtkMnemonicActionClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkMnemonicActionClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkMnemonicActionClass_slistautoptr: 
  given _tag: Tag[GtkMnemonicActionClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkMnemonicActionClass_slistautoptr = o
  extension (v: GtkMnemonicActionClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkMnemonicAction_autoptr = Ptr[GtkMnemonicAction]
object GtkMnemonicAction_autoptr: 
  given _tag: Tag[GtkMnemonicAction_autoptr] = Tag.Ptr[GtkMnemonicAction](GtkMnemonicAction._tag)
  inline def apply(inline o: Ptr[GtkMnemonicAction]): GtkMnemonicAction_autoptr = o
  extension (v: GtkMnemonicAction_autoptr)
    inline def value: Ptr[GtkMnemonicAction] = v

opaque type GtkMnemonicAction_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkMnemonicAction_listautoptr: 
  given _tag: Tag[GtkMnemonicAction_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkMnemonicAction_listautoptr = o
  extension (v: GtkMnemonicAction_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkMnemonicAction_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkMnemonicAction_queueautoptr: 
  given _tag: Tag[GtkMnemonicAction_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkMnemonicAction_queueautoptr = o
  extension (v: GtkMnemonicAction_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkMnemonicAction_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkMnemonicAction_slistautoptr: 
  given _tag: Tag[GtkMnemonicAction_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkMnemonicAction_slistautoptr = o
  extension (v: GtkMnemonicAction_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkMnemonicTriggerClass_autoptr = Ptr[GtkMnemonicTriggerClass]
object GtkMnemonicTriggerClass_autoptr: 
  given _tag: Tag[GtkMnemonicTriggerClass_autoptr] = Tag.Ptr[GtkMnemonicTriggerClass](GtkMnemonicTriggerClass._tag)
  inline def apply(inline o: Ptr[GtkMnemonicTriggerClass]): GtkMnemonicTriggerClass_autoptr = o
  extension (v: GtkMnemonicTriggerClass_autoptr)
    inline def value: Ptr[GtkMnemonicTriggerClass] = v

opaque type GtkMnemonicTriggerClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkMnemonicTriggerClass_listautoptr: 
  given _tag: Tag[GtkMnemonicTriggerClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkMnemonicTriggerClass_listautoptr = o
  extension (v: GtkMnemonicTriggerClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkMnemonicTriggerClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkMnemonicTriggerClass_queueautoptr: 
  given _tag: Tag[GtkMnemonicTriggerClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkMnemonicTriggerClass_queueautoptr = o
  extension (v: GtkMnemonicTriggerClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkMnemonicTriggerClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkMnemonicTriggerClass_slistautoptr: 
  given _tag: Tag[GtkMnemonicTriggerClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkMnemonicTriggerClass_slistautoptr = o
  extension (v: GtkMnemonicTriggerClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkMnemonicTrigger_autoptr = Ptr[GtkMnemonicTrigger]
object GtkMnemonicTrigger_autoptr: 
  given _tag: Tag[GtkMnemonicTrigger_autoptr] = Tag.Ptr[GtkMnemonicTrigger](GtkMnemonicTrigger._tag)
  inline def apply(inline o: Ptr[GtkMnemonicTrigger]): GtkMnemonicTrigger_autoptr = o
  extension (v: GtkMnemonicTrigger_autoptr)
    inline def value: Ptr[GtkMnemonicTrigger] = v

opaque type GtkMnemonicTrigger_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkMnemonicTrigger_listautoptr: 
  given _tag: Tag[GtkMnemonicTrigger_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkMnemonicTrigger_listautoptr = o
  extension (v: GtkMnemonicTrigger_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkMnemonicTrigger_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkMnemonicTrigger_queueautoptr: 
  given _tag: Tag[GtkMnemonicTrigger_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkMnemonicTrigger_queueautoptr = o
  extension (v: GtkMnemonicTrigger_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkMnemonicTrigger_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkMnemonicTrigger_slistautoptr: 
  given _tag: Tag[GtkMnemonicTrigger_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkMnemonicTrigger_slistautoptr = o
  extension (v: GtkMnemonicTrigger_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkMountOperation_autoptr = Ptr[GtkMountOperation]
object GtkMountOperation_autoptr: 
  given _tag: Tag[GtkMountOperation_autoptr] = Tag.Ptr[GtkMountOperation](GtkMountOperation._tag)
  inline def apply(inline o: Ptr[GtkMountOperation]): GtkMountOperation_autoptr = o
  extension (v: GtkMountOperation_autoptr)
    inline def value: Ptr[GtkMountOperation] = v

opaque type GtkMountOperation_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkMountOperation_listautoptr: 
  given _tag: Tag[GtkMountOperation_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkMountOperation_listautoptr = o
  extension (v: GtkMountOperation_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkMountOperation_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkMountOperation_queueautoptr: 
  given _tag: Tag[GtkMountOperation_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkMountOperation_queueautoptr = o
  extension (v: GtkMountOperation_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkMountOperation_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkMountOperation_slistautoptr: 
  given _tag: Tag[GtkMountOperation_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkMountOperation_slistautoptr = o
  extension (v: GtkMountOperation_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkMultiFilterClass_autoptr = Ptr[GtkMultiFilterClass]
object GtkMultiFilterClass_autoptr: 
  given _tag: Tag[GtkMultiFilterClass_autoptr] = Tag.Ptr[GtkMultiFilterClass](GtkMultiFilterClass._tag)
  inline def apply(inline o: Ptr[GtkMultiFilterClass]): GtkMultiFilterClass_autoptr = o
  extension (v: GtkMultiFilterClass_autoptr)
    inline def value: Ptr[GtkMultiFilterClass] = v

opaque type GtkMultiFilterClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkMultiFilterClass_listautoptr: 
  given _tag: Tag[GtkMultiFilterClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkMultiFilterClass_listautoptr = o
  extension (v: GtkMultiFilterClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkMultiFilterClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkMultiFilterClass_queueautoptr: 
  given _tag: Tag[GtkMultiFilterClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkMultiFilterClass_queueautoptr = o
  extension (v: GtkMultiFilterClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkMultiFilterClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkMultiFilterClass_slistautoptr: 
  given _tag: Tag[GtkMultiFilterClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkMultiFilterClass_slistautoptr = o
  extension (v: GtkMultiFilterClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkMultiFilter_autoptr = Ptr[GtkMultiFilter]
object GtkMultiFilter_autoptr: 
  given _tag: Tag[GtkMultiFilter_autoptr] = Tag.Ptr[GtkMultiFilter](GtkMultiFilter._tag)
  inline def apply(inline o: Ptr[GtkMultiFilter]): GtkMultiFilter_autoptr = o
  extension (v: GtkMultiFilter_autoptr)
    inline def value: Ptr[GtkMultiFilter] = v

opaque type GtkMultiFilter_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkMultiFilter_listautoptr: 
  given _tag: Tag[GtkMultiFilter_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkMultiFilter_listautoptr = o
  extension (v: GtkMultiFilter_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkMultiFilter_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkMultiFilter_queueautoptr: 
  given _tag: Tag[GtkMultiFilter_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkMultiFilter_queueautoptr = o
  extension (v: GtkMultiFilter_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkMultiFilter_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkMultiFilter_slistautoptr: 
  given _tag: Tag[GtkMultiFilter_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkMultiFilter_slistautoptr = o
  extension (v: GtkMultiFilter_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkMultiSelectionClass_autoptr = Ptr[GtkMultiSelectionClass]
object GtkMultiSelectionClass_autoptr: 
  given _tag: Tag[GtkMultiSelectionClass_autoptr] = Tag.Ptr[GtkMultiSelectionClass](GtkMultiSelectionClass._tag)
  inline def apply(inline o: Ptr[GtkMultiSelectionClass]): GtkMultiSelectionClass_autoptr = o
  extension (v: GtkMultiSelectionClass_autoptr)
    inline def value: Ptr[GtkMultiSelectionClass] = v

opaque type GtkMultiSelectionClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkMultiSelectionClass_listautoptr: 
  given _tag: Tag[GtkMultiSelectionClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkMultiSelectionClass_listautoptr = o
  extension (v: GtkMultiSelectionClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkMultiSelectionClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkMultiSelectionClass_queueautoptr: 
  given _tag: Tag[GtkMultiSelectionClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkMultiSelectionClass_queueautoptr = o
  extension (v: GtkMultiSelectionClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkMultiSelectionClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkMultiSelectionClass_slistautoptr: 
  given _tag: Tag[GtkMultiSelectionClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkMultiSelectionClass_slistautoptr = o
  extension (v: GtkMultiSelectionClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkMultiSelection_autoptr = Ptr[GtkMultiSelection]
object GtkMultiSelection_autoptr: 
  given _tag: Tag[GtkMultiSelection_autoptr] = Tag.Ptr[GtkMultiSelection](GtkMultiSelection._tag)
  inline def apply(inline o: Ptr[GtkMultiSelection]): GtkMultiSelection_autoptr = o
  extension (v: GtkMultiSelection_autoptr)
    inline def value: Ptr[GtkMultiSelection] = v

opaque type GtkMultiSelection_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkMultiSelection_listautoptr: 
  given _tag: Tag[GtkMultiSelection_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkMultiSelection_listautoptr = o
  extension (v: GtkMultiSelection_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkMultiSelection_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkMultiSelection_queueautoptr: 
  given _tag: Tag[GtkMultiSelection_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkMultiSelection_queueautoptr = o
  extension (v: GtkMultiSelection_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkMultiSelection_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkMultiSelection_slistautoptr: 
  given _tag: Tag[GtkMultiSelection_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkMultiSelection_slistautoptr = o
  extension (v: GtkMultiSelection_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkMultiSorterClass_autoptr = Ptr[GtkMultiSorterClass]
object GtkMultiSorterClass_autoptr: 
  given _tag: Tag[GtkMultiSorterClass_autoptr] = Tag.Ptr[GtkMultiSorterClass](GtkMultiSorterClass._tag)
  inline def apply(inline o: Ptr[GtkMultiSorterClass]): GtkMultiSorterClass_autoptr = o
  extension (v: GtkMultiSorterClass_autoptr)
    inline def value: Ptr[GtkMultiSorterClass] = v

opaque type GtkMultiSorterClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkMultiSorterClass_listautoptr: 
  given _tag: Tag[GtkMultiSorterClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkMultiSorterClass_listautoptr = o
  extension (v: GtkMultiSorterClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkMultiSorterClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkMultiSorterClass_queueautoptr: 
  given _tag: Tag[GtkMultiSorterClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkMultiSorterClass_queueautoptr = o
  extension (v: GtkMultiSorterClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkMultiSorterClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkMultiSorterClass_slistautoptr: 
  given _tag: Tag[GtkMultiSorterClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkMultiSorterClass_slistautoptr = o
  extension (v: GtkMultiSorterClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkMultiSorter_autoptr = Ptr[GtkMultiSorter]
object GtkMultiSorter_autoptr: 
  given _tag: Tag[GtkMultiSorter_autoptr] = Tag.Ptr[GtkMultiSorter](GtkMultiSorter._tag)
  inline def apply(inline o: Ptr[GtkMultiSorter]): GtkMultiSorter_autoptr = o
  extension (v: GtkMultiSorter_autoptr)
    inline def value: Ptr[GtkMultiSorter] = v

opaque type GtkMultiSorter_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkMultiSorter_listautoptr: 
  given _tag: Tag[GtkMultiSorter_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkMultiSorter_listautoptr = o
  extension (v: GtkMultiSorter_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkMultiSorter_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkMultiSorter_queueautoptr: 
  given _tag: Tag[GtkMultiSorter_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkMultiSorter_queueautoptr = o
  extension (v: GtkMultiSorter_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkMultiSorter_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkMultiSorter_slistautoptr: 
  given _tag: Tag[GtkMultiSorter_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkMultiSorter_slistautoptr = o
  extension (v: GtkMultiSorter_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkNamedActionClass_autoptr = Ptr[GtkNamedActionClass]
object GtkNamedActionClass_autoptr: 
  given _tag: Tag[GtkNamedActionClass_autoptr] = Tag.Ptr[GtkNamedActionClass](GtkNamedActionClass._tag)
  inline def apply(inline o: Ptr[GtkNamedActionClass]): GtkNamedActionClass_autoptr = o
  extension (v: GtkNamedActionClass_autoptr)
    inline def value: Ptr[GtkNamedActionClass] = v

opaque type GtkNamedActionClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkNamedActionClass_listautoptr: 
  given _tag: Tag[GtkNamedActionClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkNamedActionClass_listautoptr = o
  extension (v: GtkNamedActionClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkNamedActionClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkNamedActionClass_queueautoptr: 
  given _tag: Tag[GtkNamedActionClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkNamedActionClass_queueautoptr = o
  extension (v: GtkNamedActionClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkNamedActionClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkNamedActionClass_slistautoptr: 
  given _tag: Tag[GtkNamedActionClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkNamedActionClass_slistautoptr = o
  extension (v: GtkNamedActionClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkNamedAction_autoptr = Ptr[GtkNamedAction]
object GtkNamedAction_autoptr: 
  given _tag: Tag[GtkNamedAction_autoptr] = Tag.Ptr[GtkNamedAction](GtkNamedAction._tag)
  inline def apply(inline o: Ptr[GtkNamedAction]): GtkNamedAction_autoptr = o
  extension (v: GtkNamedAction_autoptr)
    inline def value: Ptr[GtkNamedAction] = v

opaque type GtkNamedAction_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkNamedAction_listautoptr: 
  given _tag: Tag[GtkNamedAction_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkNamedAction_listautoptr = o
  extension (v: GtkNamedAction_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkNamedAction_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkNamedAction_queueautoptr: 
  given _tag: Tag[GtkNamedAction_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkNamedAction_queueautoptr = o
  extension (v: GtkNamedAction_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkNamedAction_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkNamedAction_slistautoptr: 
  given _tag: Tag[GtkNamedAction_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkNamedAction_slistautoptr = o
  extension (v: GtkNamedAction_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkNativeDialogClass_autoptr = Ptr[GtkNativeDialogClass]
object GtkNativeDialogClass_autoptr: 
  given _tag: Tag[GtkNativeDialogClass_autoptr] = Tag.Ptr[GtkNativeDialogClass](GtkNativeDialogClass._tag)
  inline def apply(inline o: Ptr[GtkNativeDialogClass]): GtkNativeDialogClass_autoptr = o
  extension (v: GtkNativeDialogClass_autoptr)
    inline def value: Ptr[GtkNativeDialogClass] = v

opaque type GtkNativeDialogClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkNativeDialogClass_listautoptr: 
  given _tag: Tag[GtkNativeDialogClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkNativeDialogClass_listautoptr = o
  extension (v: GtkNativeDialogClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkNativeDialogClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkNativeDialogClass_queueautoptr: 
  given _tag: Tag[GtkNativeDialogClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkNativeDialogClass_queueautoptr = o
  extension (v: GtkNativeDialogClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkNativeDialogClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkNativeDialogClass_slistautoptr: 
  given _tag: Tag[GtkNativeDialogClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkNativeDialogClass_slistautoptr = o
  extension (v: GtkNativeDialogClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkNativeDialog_autoptr = Ptr[GtkNativeDialog]
object GtkNativeDialog_autoptr: 
  given _tag: Tag[GtkNativeDialog_autoptr] = Tag.Ptr[GtkNativeDialog](GtkNativeDialog._tag)
  inline def apply(inline o: Ptr[GtkNativeDialog]): GtkNativeDialog_autoptr = o
  extension (v: GtkNativeDialog_autoptr)
    inline def value: Ptr[GtkNativeDialog] = v

opaque type GtkNativeDialog_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkNativeDialog_listautoptr: 
  given _tag: Tag[GtkNativeDialog_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkNativeDialog_listautoptr = o
  extension (v: GtkNativeDialog_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkNativeDialog_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkNativeDialog_queueautoptr: 
  given _tag: Tag[GtkNativeDialog_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkNativeDialog_queueautoptr = o
  extension (v: GtkNativeDialog_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkNativeDialog_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkNativeDialog_slistautoptr: 
  given _tag: Tag[GtkNativeDialog_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkNativeDialog_slistautoptr = o
  extension (v: GtkNativeDialog_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkNative_autoptr = Ptr[GtkNative]
object GtkNative_autoptr: 
  given _tag: Tag[GtkNative_autoptr] = Tag.Ptr[GtkNative](GtkNative._tag)
  inline def apply(inline o: Ptr[GtkNative]): GtkNative_autoptr = o
  extension (v: GtkNative_autoptr)
    inline def value: Ptr[GtkNative] = v

opaque type GtkNative_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkNative_listautoptr: 
  given _tag: Tag[GtkNative_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkNative_listautoptr = o
  extension (v: GtkNative_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkNative_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkNative_queueautoptr: 
  given _tag: Tag[GtkNative_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkNative_queueautoptr = o
  extension (v: GtkNative_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkNative_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkNative_slistautoptr: 
  given _tag: Tag[GtkNative_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkNative_slistautoptr = o
  extension (v: GtkNative_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkNeverTriggerClass_autoptr = Ptr[GtkNeverTriggerClass]
object GtkNeverTriggerClass_autoptr: 
  given _tag: Tag[GtkNeverTriggerClass_autoptr] = Tag.Ptr[GtkNeverTriggerClass](GtkNeverTriggerClass._tag)
  inline def apply(inline o: Ptr[GtkNeverTriggerClass]): GtkNeverTriggerClass_autoptr = o
  extension (v: GtkNeverTriggerClass_autoptr)
    inline def value: Ptr[GtkNeverTriggerClass] = v

opaque type GtkNeverTriggerClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkNeverTriggerClass_listautoptr: 
  given _tag: Tag[GtkNeverTriggerClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkNeverTriggerClass_listautoptr = o
  extension (v: GtkNeverTriggerClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkNeverTriggerClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkNeverTriggerClass_queueautoptr: 
  given _tag: Tag[GtkNeverTriggerClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkNeverTriggerClass_queueautoptr = o
  extension (v: GtkNeverTriggerClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkNeverTriggerClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkNeverTriggerClass_slistautoptr: 
  given _tag: Tag[GtkNeverTriggerClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkNeverTriggerClass_slistautoptr = o
  extension (v: GtkNeverTriggerClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkNeverTrigger_autoptr = Ptr[GtkNeverTrigger]
object GtkNeverTrigger_autoptr: 
  given _tag: Tag[GtkNeverTrigger_autoptr] = Tag.Ptr[GtkNeverTrigger](GtkNeverTrigger._tag)
  inline def apply(inline o: Ptr[GtkNeverTrigger]): GtkNeverTrigger_autoptr = o
  extension (v: GtkNeverTrigger_autoptr)
    inline def value: Ptr[GtkNeverTrigger] = v

opaque type GtkNeverTrigger_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkNeverTrigger_listautoptr: 
  given _tag: Tag[GtkNeverTrigger_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkNeverTrigger_listautoptr = o
  extension (v: GtkNeverTrigger_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkNeverTrigger_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkNeverTrigger_queueautoptr: 
  given _tag: Tag[GtkNeverTrigger_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkNeverTrigger_queueautoptr = o
  extension (v: GtkNeverTrigger_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkNeverTrigger_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkNeverTrigger_slistautoptr: 
  given _tag: Tag[GtkNeverTrigger_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkNeverTrigger_slistautoptr = o
  extension (v: GtkNeverTrigger_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkNoSelectionClass_autoptr = Ptr[GtkNoSelectionClass]
object GtkNoSelectionClass_autoptr: 
  given _tag: Tag[GtkNoSelectionClass_autoptr] = Tag.Ptr[GtkNoSelectionClass](GtkNoSelectionClass._tag)
  inline def apply(inline o: Ptr[GtkNoSelectionClass]): GtkNoSelectionClass_autoptr = o
  extension (v: GtkNoSelectionClass_autoptr)
    inline def value: Ptr[GtkNoSelectionClass] = v

opaque type GtkNoSelectionClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkNoSelectionClass_listautoptr: 
  given _tag: Tag[GtkNoSelectionClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkNoSelectionClass_listautoptr = o
  extension (v: GtkNoSelectionClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkNoSelectionClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkNoSelectionClass_queueautoptr: 
  given _tag: Tag[GtkNoSelectionClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkNoSelectionClass_queueautoptr = o
  extension (v: GtkNoSelectionClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkNoSelectionClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkNoSelectionClass_slistautoptr: 
  given _tag: Tag[GtkNoSelectionClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkNoSelectionClass_slistautoptr = o
  extension (v: GtkNoSelectionClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkNoSelection_autoptr = Ptr[GtkNoSelection]
object GtkNoSelection_autoptr: 
  given _tag: Tag[GtkNoSelection_autoptr] = Tag.Ptr[GtkNoSelection](GtkNoSelection._tag)
  inline def apply(inline o: Ptr[GtkNoSelection]): GtkNoSelection_autoptr = o
  extension (v: GtkNoSelection_autoptr)
    inline def value: Ptr[GtkNoSelection] = v

opaque type GtkNoSelection_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkNoSelection_listautoptr: 
  given _tag: Tag[GtkNoSelection_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkNoSelection_listautoptr = o
  extension (v: GtkNoSelection_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkNoSelection_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkNoSelection_queueautoptr: 
  given _tag: Tag[GtkNoSelection_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkNoSelection_queueautoptr = o
  extension (v: GtkNoSelection_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkNoSelection_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkNoSelection_slistautoptr: 
  given _tag: Tag[GtkNoSelection_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkNoSelection_slistautoptr = o
  extension (v: GtkNoSelection_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkNotebook_autoptr = Ptr[GtkNotebook]
object GtkNotebook_autoptr: 
  given _tag: Tag[GtkNotebook_autoptr] = Tag.Ptr[GtkNotebook](GtkNotebook._tag)
  inline def apply(inline o: Ptr[GtkNotebook]): GtkNotebook_autoptr = o
  extension (v: GtkNotebook_autoptr)
    inline def value: Ptr[GtkNotebook] = v

opaque type GtkNotebook_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkNotebook_listautoptr: 
  given _tag: Tag[GtkNotebook_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkNotebook_listautoptr = o
  extension (v: GtkNotebook_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkNotebook_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkNotebook_queueautoptr: 
  given _tag: Tag[GtkNotebook_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkNotebook_queueautoptr = o
  extension (v: GtkNotebook_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkNotebook_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkNotebook_slistautoptr: 
  given _tag: Tag[GtkNotebook_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkNotebook_slistautoptr = o
  extension (v: GtkNotebook_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkNothingActionClass_autoptr = Ptr[GtkNothingActionClass]
object GtkNothingActionClass_autoptr: 
  given _tag: Tag[GtkNothingActionClass_autoptr] = Tag.Ptr[GtkNothingActionClass](GtkNothingActionClass._tag)
  inline def apply(inline o: Ptr[GtkNothingActionClass]): GtkNothingActionClass_autoptr = o
  extension (v: GtkNothingActionClass_autoptr)
    inline def value: Ptr[GtkNothingActionClass] = v

opaque type GtkNothingActionClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkNothingActionClass_listautoptr: 
  given _tag: Tag[GtkNothingActionClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkNothingActionClass_listautoptr = o
  extension (v: GtkNothingActionClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkNothingActionClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkNothingActionClass_queueautoptr: 
  given _tag: Tag[GtkNothingActionClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkNothingActionClass_queueautoptr = o
  extension (v: GtkNothingActionClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkNothingActionClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkNothingActionClass_slistautoptr: 
  given _tag: Tag[GtkNothingActionClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkNothingActionClass_slistautoptr = o
  extension (v: GtkNothingActionClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkNothingAction_autoptr = Ptr[GtkNothingAction]
object GtkNothingAction_autoptr: 
  given _tag: Tag[GtkNothingAction_autoptr] = Tag.Ptr[GtkNothingAction](GtkNothingAction._tag)
  inline def apply(inline o: Ptr[GtkNothingAction]): GtkNothingAction_autoptr = o
  extension (v: GtkNothingAction_autoptr)
    inline def value: Ptr[GtkNothingAction] = v

opaque type GtkNothingAction_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkNothingAction_listautoptr: 
  given _tag: Tag[GtkNothingAction_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkNothingAction_listautoptr = o
  extension (v: GtkNothingAction_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkNothingAction_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkNothingAction_queueautoptr: 
  given _tag: Tag[GtkNothingAction_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkNothingAction_queueautoptr = o
  extension (v: GtkNothingAction_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkNothingAction_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkNothingAction_slistautoptr: 
  given _tag: Tag[GtkNothingAction_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkNothingAction_slistautoptr = o
  extension (v: GtkNothingAction_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkNumericSorterClass_autoptr = Ptr[GtkNumericSorterClass]
object GtkNumericSorterClass_autoptr: 
  given _tag: Tag[GtkNumericSorterClass_autoptr] = Tag.Ptr[GtkNumericSorterClass](GtkNumericSorterClass._tag)
  inline def apply(inline o: Ptr[GtkNumericSorterClass]): GtkNumericSorterClass_autoptr = o
  extension (v: GtkNumericSorterClass_autoptr)
    inline def value: Ptr[GtkNumericSorterClass] = v

opaque type GtkNumericSorterClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkNumericSorterClass_listautoptr: 
  given _tag: Tag[GtkNumericSorterClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkNumericSorterClass_listautoptr = o
  extension (v: GtkNumericSorterClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkNumericSorterClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkNumericSorterClass_queueautoptr: 
  given _tag: Tag[GtkNumericSorterClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkNumericSorterClass_queueautoptr = o
  extension (v: GtkNumericSorterClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkNumericSorterClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkNumericSorterClass_slistautoptr: 
  given _tag: Tag[GtkNumericSorterClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkNumericSorterClass_slistautoptr = o
  extension (v: GtkNumericSorterClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkNumericSorter_autoptr = Ptr[GtkNumericSorter]
object GtkNumericSorter_autoptr: 
  given _tag: Tag[GtkNumericSorter_autoptr] = Tag.Ptr[GtkNumericSorter](GtkNumericSorter._tag)
  inline def apply(inline o: Ptr[GtkNumericSorter]): GtkNumericSorter_autoptr = o
  extension (v: GtkNumericSorter_autoptr)
    inline def value: Ptr[GtkNumericSorter] = v

opaque type GtkNumericSorter_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkNumericSorter_listautoptr: 
  given _tag: Tag[GtkNumericSorter_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkNumericSorter_listautoptr = o
  extension (v: GtkNumericSorter_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkNumericSorter_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkNumericSorter_queueautoptr: 
  given _tag: Tag[GtkNumericSorter_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkNumericSorter_queueautoptr = o
  extension (v: GtkNumericSorter_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkNumericSorter_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkNumericSorter_slistautoptr: 
  given _tag: Tag[GtkNumericSorter_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkNumericSorter_slistautoptr = o
  extension (v: GtkNumericSorter_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkOrientable_autoptr = Ptr[GtkOrientable]
object GtkOrientable_autoptr: 
  given _tag: Tag[GtkOrientable_autoptr] = Tag.Ptr[GtkOrientable](GtkOrientable._tag)
  inline def apply(inline o: Ptr[GtkOrientable]): GtkOrientable_autoptr = o
  extension (v: GtkOrientable_autoptr)
    inline def value: Ptr[GtkOrientable] = v

opaque type GtkOrientable_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkOrientable_listautoptr: 
  given _tag: Tag[GtkOrientable_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkOrientable_listautoptr = o
  extension (v: GtkOrientable_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkOrientable_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkOrientable_queueautoptr: 
  given _tag: Tag[GtkOrientable_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkOrientable_queueautoptr = o
  extension (v: GtkOrientable_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkOrientable_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkOrientable_slistautoptr: 
  given _tag: Tag[GtkOrientable_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkOrientable_slistautoptr = o
  extension (v: GtkOrientable_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkOverlayLayoutChildClass_autoptr = Ptr[GtkOverlayLayoutChildClass]
object GtkOverlayLayoutChildClass_autoptr: 
  given _tag: Tag[GtkOverlayLayoutChildClass_autoptr] = Tag.Ptr[GtkOverlayLayoutChildClass](GtkOverlayLayoutChildClass._tag)
  inline def apply(inline o: Ptr[GtkOverlayLayoutChildClass]): GtkOverlayLayoutChildClass_autoptr = o
  extension (v: GtkOverlayLayoutChildClass_autoptr)
    inline def value: Ptr[GtkOverlayLayoutChildClass] = v

opaque type GtkOverlayLayoutChildClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkOverlayLayoutChildClass_listautoptr: 
  given _tag: Tag[GtkOverlayLayoutChildClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkOverlayLayoutChildClass_listautoptr = o
  extension (v: GtkOverlayLayoutChildClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkOverlayLayoutChildClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkOverlayLayoutChildClass_queueautoptr: 
  given _tag: Tag[GtkOverlayLayoutChildClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkOverlayLayoutChildClass_queueautoptr = o
  extension (v: GtkOverlayLayoutChildClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkOverlayLayoutChildClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkOverlayLayoutChildClass_slistautoptr: 
  given _tag: Tag[GtkOverlayLayoutChildClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkOverlayLayoutChildClass_slistautoptr = o
  extension (v: GtkOverlayLayoutChildClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkOverlayLayoutChild_autoptr = Ptr[GtkOverlayLayoutChild]
object GtkOverlayLayoutChild_autoptr: 
  given _tag: Tag[GtkOverlayLayoutChild_autoptr] = Tag.Ptr[GtkOverlayLayoutChild](GtkOverlayLayoutChild._tag)
  inline def apply(inline o: Ptr[GtkOverlayLayoutChild]): GtkOverlayLayoutChild_autoptr = o
  extension (v: GtkOverlayLayoutChild_autoptr)
    inline def value: Ptr[GtkOverlayLayoutChild] = v

opaque type GtkOverlayLayoutChild_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkOverlayLayoutChild_listautoptr: 
  given _tag: Tag[GtkOverlayLayoutChild_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkOverlayLayoutChild_listautoptr = o
  extension (v: GtkOverlayLayoutChild_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkOverlayLayoutChild_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkOverlayLayoutChild_queueautoptr: 
  given _tag: Tag[GtkOverlayLayoutChild_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkOverlayLayoutChild_queueautoptr = o
  extension (v: GtkOverlayLayoutChild_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkOverlayLayoutChild_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkOverlayLayoutChild_slistautoptr: 
  given _tag: Tag[GtkOverlayLayoutChild_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkOverlayLayoutChild_slistautoptr = o
  extension (v: GtkOverlayLayoutChild_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkOverlayLayoutClass_autoptr = Ptr[GtkOverlayLayoutClass]
object GtkOverlayLayoutClass_autoptr: 
  given _tag: Tag[GtkOverlayLayoutClass_autoptr] = Tag.Ptr[GtkOverlayLayoutClass](GtkOverlayLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkOverlayLayoutClass]): GtkOverlayLayoutClass_autoptr = o
  extension (v: GtkOverlayLayoutClass_autoptr)
    inline def value: Ptr[GtkOverlayLayoutClass] = v

opaque type GtkOverlayLayoutClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkOverlayLayoutClass_listautoptr: 
  given _tag: Tag[GtkOverlayLayoutClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkOverlayLayoutClass_listautoptr = o
  extension (v: GtkOverlayLayoutClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkOverlayLayoutClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkOverlayLayoutClass_queueautoptr: 
  given _tag: Tag[GtkOverlayLayoutClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkOverlayLayoutClass_queueautoptr = o
  extension (v: GtkOverlayLayoutClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkOverlayLayoutClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkOverlayLayoutClass_slistautoptr: 
  given _tag: Tag[GtkOverlayLayoutClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkOverlayLayoutClass_slistautoptr = o
  extension (v: GtkOverlayLayoutClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkOverlayLayout_autoptr = Ptr[GtkOverlayLayout]
object GtkOverlayLayout_autoptr: 
  given _tag: Tag[GtkOverlayLayout_autoptr] = Tag.Ptr[GtkOverlayLayout](GtkOverlayLayout._tag)
  inline def apply(inline o: Ptr[GtkOverlayLayout]): GtkOverlayLayout_autoptr = o
  extension (v: GtkOverlayLayout_autoptr)
    inline def value: Ptr[GtkOverlayLayout] = v

opaque type GtkOverlayLayout_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkOverlayLayout_listautoptr: 
  given _tag: Tag[GtkOverlayLayout_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkOverlayLayout_listautoptr = o
  extension (v: GtkOverlayLayout_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkOverlayLayout_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkOverlayLayout_queueautoptr: 
  given _tag: Tag[GtkOverlayLayout_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkOverlayLayout_queueautoptr = o
  extension (v: GtkOverlayLayout_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkOverlayLayout_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkOverlayLayout_slistautoptr: 
  given _tag: Tag[GtkOverlayLayout_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkOverlayLayout_slistautoptr = o
  extension (v: GtkOverlayLayout_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkOverlay_autoptr = Ptr[GtkOverlay]
object GtkOverlay_autoptr: 
  given _tag: Tag[GtkOverlay_autoptr] = Tag.Ptr[GtkOverlay](GtkOverlay._tag)
  inline def apply(inline o: Ptr[GtkOverlay]): GtkOverlay_autoptr = o
  extension (v: GtkOverlay_autoptr)
    inline def value: Ptr[GtkOverlay] = v

opaque type GtkOverlay_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkOverlay_listautoptr: 
  given _tag: Tag[GtkOverlay_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkOverlay_listautoptr = o
  extension (v: GtkOverlay_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkOverlay_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkOverlay_queueautoptr: 
  given _tag: Tag[GtkOverlay_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkOverlay_queueautoptr = o
  extension (v: GtkOverlay_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkOverlay_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkOverlay_slistautoptr: 
  given _tag: Tag[GtkOverlay_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkOverlay_slistautoptr = o
  extension (v: GtkOverlay_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkPageSetupDoneFunc: gtk_print_run_page_setup_dialog_async()
*/
opaque type GtkPageSetupDoneFunc = CFuncPtr2[Ptr[GtkPageSetup], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GtkPageSetupDoneFunc: 
  given _tag: Tag[GtkPageSetupDoneFunc] = Tag.materializeCFuncPtr2[Ptr[GtkPageSetup], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkPageSetupDoneFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GtkPageSetup], _root_.sn.gnome.glib.internal.gpointer, Unit]): GtkPageSetupDoneFunc = o
  extension (v: GtkPageSetupDoneFunc)
    inline def value: CFuncPtr2[Ptr[GtkPageSetup], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkPageSetup_autoptr = Ptr[GtkPageSetup]
object GtkPageSetup_autoptr: 
  given _tag: Tag[GtkPageSetup_autoptr] = Tag.Ptr[GtkPageSetup](GtkPageSetup._tag)
  inline def apply(inline o: Ptr[GtkPageSetup]): GtkPageSetup_autoptr = o
  extension (v: GtkPageSetup_autoptr)
    inline def value: Ptr[GtkPageSetup] = v

opaque type GtkPageSetup_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkPageSetup_listautoptr: 
  given _tag: Tag[GtkPageSetup_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkPageSetup_listautoptr = o
  extension (v: GtkPageSetup_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkPageSetup_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkPageSetup_queueautoptr: 
  given _tag: Tag[GtkPageSetup_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkPageSetup_queueautoptr = o
  extension (v: GtkPageSetup_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkPageSetup_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkPageSetup_slistautoptr: 
  given _tag: Tag[GtkPageSetup_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkPageSetup_slistautoptr = o
  extension (v: GtkPageSetup_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkPaned_autoptr = Ptr[GtkPaned]
object GtkPaned_autoptr: 
  given _tag: Tag[GtkPaned_autoptr] = Tag.Ptr[GtkPaned](GtkPaned._tag)
  inline def apply(inline o: Ptr[GtkPaned]): GtkPaned_autoptr = o
  extension (v: GtkPaned_autoptr)
    inline def value: Ptr[GtkPaned] = v

opaque type GtkPaned_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkPaned_listautoptr: 
  given _tag: Tag[GtkPaned_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkPaned_listautoptr = o
  extension (v: GtkPaned_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkPaned_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkPaned_queueautoptr: 
  given _tag: Tag[GtkPaned_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkPaned_queueautoptr = o
  extension (v: GtkPaned_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkPaned_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkPaned_slistautoptr: 
  given _tag: Tag[GtkPaned_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkPaned_slistautoptr = o
  extension (v: GtkPaned_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkPaperSize_autoptr = Ptr[GtkPaperSize]
object GtkPaperSize_autoptr: 
  given _tag: Tag[GtkPaperSize_autoptr] = Tag.Ptr[GtkPaperSize](GtkPaperSize._tag)
  inline def apply(inline o: Ptr[GtkPaperSize]): GtkPaperSize_autoptr = o
  extension (v: GtkPaperSize_autoptr)
    inline def value: Ptr[GtkPaperSize] = v

opaque type GtkPaperSize_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkPaperSize_listautoptr: 
  given _tag: Tag[GtkPaperSize_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkPaperSize_listautoptr = o
  extension (v: GtkPaperSize_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkPaperSize_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkPaperSize_queueautoptr: 
  given _tag: Tag[GtkPaperSize_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkPaperSize_queueautoptr = o
  extension (v: GtkPaperSize_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkPaperSize_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkPaperSize_slistautoptr: 
  given _tag: Tag[GtkPaperSize_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkPaperSize_slistautoptr = o
  extension (v: GtkPaperSize_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkPasswordEntryBufferClass_autoptr = Ptr[GtkPasswordEntryBufferClass]
object GtkPasswordEntryBufferClass_autoptr: 
  given _tag: Tag[GtkPasswordEntryBufferClass_autoptr] = Tag.Ptr[GtkPasswordEntryBufferClass](GtkPasswordEntryBufferClass._tag)
  inline def apply(inline o: Ptr[GtkPasswordEntryBufferClass]): GtkPasswordEntryBufferClass_autoptr = o
  extension (v: GtkPasswordEntryBufferClass_autoptr)
    inline def value: Ptr[GtkPasswordEntryBufferClass] = v

opaque type GtkPasswordEntryBufferClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkPasswordEntryBufferClass_listautoptr: 
  given _tag: Tag[GtkPasswordEntryBufferClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkPasswordEntryBufferClass_listautoptr = o
  extension (v: GtkPasswordEntryBufferClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkPasswordEntryBufferClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkPasswordEntryBufferClass_queueautoptr: 
  given _tag: Tag[GtkPasswordEntryBufferClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkPasswordEntryBufferClass_queueautoptr = o
  extension (v: GtkPasswordEntryBufferClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkPasswordEntryBufferClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkPasswordEntryBufferClass_slistautoptr: 
  given _tag: Tag[GtkPasswordEntryBufferClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkPasswordEntryBufferClass_slistautoptr = o
  extension (v: GtkPasswordEntryBufferClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkPasswordEntryBuffer_autoptr = Ptr[GtkPasswordEntryBuffer]
object GtkPasswordEntryBuffer_autoptr: 
  given _tag: Tag[GtkPasswordEntryBuffer_autoptr] = Tag.Ptr[GtkPasswordEntryBuffer](GtkPasswordEntryBuffer._tag)
  inline def apply(inline o: Ptr[GtkPasswordEntryBuffer]): GtkPasswordEntryBuffer_autoptr = o
  extension (v: GtkPasswordEntryBuffer_autoptr)
    inline def value: Ptr[GtkPasswordEntryBuffer] = v

opaque type GtkPasswordEntryBuffer_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkPasswordEntryBuffer_listautoptr: 
  given _tag: Tag[GtkPasswordEntryBuffer_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkPasswordEntryBuffer_listautoptr = o
  extension (v: GtkPasswordEntryBuffer_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkPasswordEntryBuffer_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkPasswordEntryBuffer_queueautoptr: 
  given _tag: Tag[GtkPasswordEntryBuffer_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkPasswordEntryBuffer_queueautoptr = o
  extension (v: GtkPasswordEntryBuffer_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkPasswordEntryBuffer_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkPasswordEntryBuffer_slistautoptr: 
  given _tag: Tag[GtkPasswordEntryBuffer_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkPasswordEntryBuffer_slistautoptr = o
  extension (v: GtkPasswordEntryBuffer_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkPictureClass_autoptr = Ptr[GtkPictureClass]
object GtkPictureClass_autoptr: 
  given _tag: Tag[GtkPictureClass_autoptr] = Tag.Ptr[GtkPictureClass](GtkPictureClass._tag)
  inline def apply(inline o: Ptr[GtkPictureClass]): GtkPictureClass_autoptr = o
  extension (v: GtkPictureClass_autoptr)
    inline def value: Ptr[GtkPictureClass] = v

opaque type GtkPictureClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkPictureClass_listautoptr: 
  given _tag: Tag[GtkPictureClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkPictureClass_listautoptr = o
  extension (v: GtkPictureClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkPictureClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkPictureClass_queueautoptr: 
  given _tag: Tag[GtkPictureClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkPictureClass_queueautoptr = o
  extension (v: GtkPictureClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkPictureClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkPictureClass_slistautoptr: 
  given _tag: Tag[GtkPictureClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkPictureClass_slistautoptr = o
  extension (v: GtkPictureClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkPicture_autoptr = Ptr[GtkPicture]
object GtkPicture_autoptr: 
  given _tag: Tag[GtkPicture_autoptr] = Tag.Ptr[GtkPicture](GtkPicture._tag)
  inline def apply(inline o: Ptr[GtkPicture]): GtkPicture_autoptr = o
  extension (v: GtkPicture_autoptr)
    inline def value: Ptr[GtkPicture] = v

opaque type GtkPicture_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkPicture_listautoptr: 
  given _tag: Tag[GtkPicture_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkPicture_listautoptr = o
  extension (v: GtkPicture_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkPicture_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkPicture_queueautoptr: 
  given _tag: Tag[GtkPicture_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkPicture_queueautoptr = o
  extension (v: GtkPicture_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkPicture_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkPicture_slistautoptr: 
  given _tag: Tag[GtkPicture_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkPicture_slistautoptr = o
  extension (v: GtkPicture_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkPopoverMenuBar_autoptr = Ptr[GtkPopoverMenuBar]
object GtkPopoverMenuBar_autoptr: 
  given _tag: Tag[GtkPopoverMenuBar_autoptr] = Tag.Ptr[GtkPopoverMenuBar](GtkPopoverMenuBar._tag)
  inline def apply(inline o: Ptr[GtkPopoverMenuBar]): GtkPopoverMenuBar_autoptr = o
  extension (v: GtkPopoverMenuBar_autoptr)
    inline def value: Ptr[GtkPopoverMenuBar] = v

opaque type GtkPopoverMenuBar_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkPopoverMenuBar_listautoptr: 
  given _tag: Tag[GtkPopoverMenuBar_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkPopoverMenuBar_listautoptr = o
  extension (v: GtkPopoverMenuBar_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkPopoverMenuBar_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkPopoverMenuBar_queueautoptr: 
  given _tag: Tag[GtkPopoverMenuBar_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkPopoverMenuBar_queueautoptr = o
  extension (v: GtkPopoverMenuBar_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkPopoverMenuBar_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkPopoverMenuBar_slistautoptr: 
  given _tag: Tag[GtkPopoverMenuBar_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkPopoverMenuBar_slistautoptr = o
  extension (v: GtkPopoverMenuBar_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkPopoverMenu_autoptr = Ptr[GtkPopoverMenu]
object GtkPopoverMenu_autoptr: 
  given _tag: Tag[GtkPopoverMenu_autoptr] = Tag.Ptr[GtkPopoverMenu](GtkPopoverMenu._tag)
  inline def apply(inline o: Ptr[GtkPopoverMenu]): GtkPopoverMenu_autoptr = o
  extension (v: GtkPopoverMenu_autoptr)
    inline def value: Ptr[GtkPopoverMenu] = v

opaque type GtkPopoverMenu_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkPopoverMenu_listautoptr: 
  given _tag: Tag[GtkPopoverMenu_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkPopoverMenu_listautoptr = o
  extension (v: GtkPopoverMenu_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkPopoverMenu_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkPopoverMenu_queueautoptr: 
  given _tag: Tag[GtkPopoverMenu_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkPopoverMenu_queueautoptr = o
  extension (v: GtkPopoverMenu_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkPopoverMenu_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkPopoverMenu_slistautoptr: 
  given _tag: Tag[GtkPopoverMenu_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkPopoverMenu_slistautoptr = o
  extension (v: GtkPopoverMenu_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkPopover_autoptr = Ptr[GtkPopover]
object GtkPopover_autoptr: 
  given _tag: Tag[GtkPopover_autoptr] = Tag.Ptr[GtkPopover](GtkPopover._tag)
  inline def apply(inline o: Ptr[GtkPopover]): GtkPopover_autoptr = o
  extension (v: GtkPopover_autoptr)
    inline def value: Ptr[GtkPopover] = v

opaque type GtkPopover_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkPopover_listautoptr: 
  given _tag: Tag[GtkPopover_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkPopover_listautoptr = o
  extension (v: GtkPopover_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkPopover_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkPopover_queueautoptr: 
  given _tag: Tag[GtkPopover_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkPopover_queueautoptr = o
  extension (v: GtkPopover_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkPopover_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkPopover_slistautoptr: 
  given _tag: Tag[GtkPopover_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkPopover_slistautoptr = o
  extension (v: GtkPopover_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkPrintContext_autoptr = Ptr[GtkPrintContext]
object GtkPrintContext_autoptr: 
  given _tag: Tag[GtkPrintContext_autoptr] = Tag.Ptr[GtkPrintContext](GtkPrintContext._tag)
  inline def apply(inline o: Ptr[GtkPrintContext]): GtkPrintContext_autoptr = o
  extension (v: GtkPrintContext_autoptr)
    inline def value: Ptr[GtkPrintContext] = v

opaque type GtkPrintContext_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkPrintContext_listautoptr: 
  given _tag: Tag[GtkPrintContext_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkPrintContext_listautoptr = o
  extension (v: GtkPrintContext_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkPrintContext_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkPrintContext_queueautoptr: 
  given _tag: Tag[GtkPrintContext_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkPrintContext_queueautoptr = o
  extension (v: GtkPrintContext_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkPrintContext_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkPrintContext_slistautoptr: 
  given _tag: Tag[GtkPrintContext_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkPrintContext_slistautoptr = o
  extension (v: GtkPrintContext_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkPrintDialogClass_autoptr = Ptr[GtkPrintDialogClass]
object GtkPrintDialogClass_autoptr: 
  given _tag: Tag[GtkPrintDialogClass_autoptr] = Tag.Ptr[GtkPrintDialogClass](GtkPrintDialogClass._tag)
  inline def apply(inline o: Ptr[GtkPrintDialogClass]): GtkPrintDialogClass_autoptr = o
  extension (v: GtkPrintDialogClass_autoptr)
    inline def value: Ptr[GtkPrintDialogClass] = v

opaque type GtkPrintDialogClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkPrintDialogClass_listautoptr: 
  given _tag: Tag[GtkPrintDialogClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkPrintDialogClass_listautoptr = o
  extension (v: GtkPrintDialogClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkPrintDialogClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkPrintDialogClass_queueautoptr: 
  given _tag: Tag[GtkPrintDialogClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkPrintDialogClass_queueautoptr = o
  extension (v: GtkPrintDialogClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkPrintDialogClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkPrintDialogClass_slistautoptr: 
  given _tag: Tag[GtkPrintDialogClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkPrintDialogClass_slistautoptr = o
  extension (v: GtkPrintDialogClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkPrintDialog_autoptr = Ptr[GtkPrintDialog]
object GtkPrintDialog_autoptr: 
  given _tag: Tag[GtkPrintDialog_autoptr] = Tag.Ptr[GtkPrintDialog](GtkPrintDialog._tag)
  inline def apply(inline o: Ptr[GtkPrintDialog]): GtkPrintDialog_autoptr = o
  extension (v: GtkPrintDialog_autoptr)
    inline def value: Ptr[GtkPrintDialog] = v

opaque type GtkPrintDialog_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkPrintDialog_listautoptr: 
  given _tag: Tag[GtkPrintDialog_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkPrintDialog_listautoptr = o
  extension (v: GtkPrintDialog_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkPrintDialog_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkPrintDialog_queueautoptr: 
  given _tag: Tag[GtkPrintDialog_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkPrintDialog_queueautoptr = o
  extension (v: GtkPrintDialog_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkPrintDialog_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkPrintDialog_slistautoptr: 
  given _tag: Tag[GtkPrintDialog_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkPrintDialog_slistautoptr = o
  extension (v: GtkPrintDialog_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkPrintOperationPreview_autoptr = Ptr[GtkPrintOperationPreview]
object GtkPrintOperationPreview_autoptr: 
  given _tag: Tag[GtkPrintOperationPreview_autoptr] = Tag.Ptr[GtkPrintOperationPreview](GtkPrintOperationPreview._tag)
  inline def apply(inline o: Ptr[GtkPrintOperationPreview]): GtkPrintOperationPreview_autoptr = o
  extension (v: GtkPrintOperationPreview_autoptr)
    inline def value: Ptr[GtkPrintOperationPreview] = v

opaque type GtkPrintOperationPreview_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkPrintOperationPreview_listautoptr: 
  given _tag: Tag[GtkPrintOperationPreview_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkPrintOperationPreview_listautoptr = o
  extension (v: GtkPrintOperationPreview_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkPrintOperationPreview_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkPrintOperationPreview_queueautoptr: 
  given _tag: Tag[GtkPrintOperationPreview_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkPrintOperationPreview_queueautoptr = o
  extension (v: GtkPrintOperationPreview_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkPrintOperationPreview_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkPrintOperationPreview_slistautoptr: 
  given _tag: Tag[GtkPrintOperationPreview_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkPrintOperationPreview_slistautoptr = o
  extension (v: GtkPrintOperationPreview_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkPrintOperation_autoptr = Ptr[GtkPrintOperation]
object GtkPrintOperation_autoptr: 
  given _tag: Tag[GtkPrintOperation_autoptr] = Tag.Ptr[GtkPrintOperation](GtkPrintOperation._tag)
  inline def apply(inline o: Ptr[GtkPrintOperation]): GtkPrintOperation_autoptr = o
  extension (v: GtkPrintOperation_autoptr)
    inline def value: Ptr[GtkPrintOperation] = v

opaque type GtkPrintOperation_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkPrintOperation_listautoptr: 
  given _tag: Tag[GtkPrintOperation_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkPrintOperation_listautoptr = o
  extension (v: GtkPrintOperation_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkPrintOperation_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkPrintOperation_queueautoptr: 
  given _tag: Tag[GtkPrintOperation_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkPrintOperation_queueautoptr = o
  extension (v: GtkPrintOperation_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkPrintOperation_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkPrintOperation_slistautoptr: 
  given _tag: Tag[GtkPrintOperation_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkPrintOperation_slistautoptr = o
  extension (v: GtkPrintOperation_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkPrintSettingsFunc = CFuncPtr3[Ptr[CUnsignedChar], Ptr[CUnsignedChar], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GtkPrintSettingsFunc: 
  given _tag: Tag[GtkPrintSettingsFunc] = Tag.materializeCFuncPtr3[Ptr[CUnsignedChar], Ptr[CUnsignedChar], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkPrintSettingsFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[CUnsignedChar], Ptr[CUnsignedChar], _root_.sn.gnome.glib.internal.gpointer, Unit]): GtkPrintSettingsFunc = o
  extension (v: GtkPrintSettingsFunc)
    inline def value: CFuncPtr3[Ptr[CUnsignedChar], Ptr[CUnsignedChar], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkPrintSettings_autoptr = Ptr[GtkPrintSettings]
object GtkPrintSettings_autoptr: 
  given _tag: Tag[GtkPrintSettings_autoptr] = Tag.Ptr[GtkPrintSettings](GtkPrintSettings._tag)
  inline def apply(inline o: Ptr[GtkPrintSettings]): GtkPrintSettings_autoptr = o
  extension (v: GtkPrintSettings_autoptr)
    inline def value: Ptr[GtkPrintSettings] = v

opaque type GtkPrintSettings_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkPrintSettings_listautoptr: 
  given _tag: Tag[GtkPrintSettings_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkPrintSettings_listautoptr = o
  extension (v: GtkPrintSettings_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkPrintSettings_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkPrintSettings_queueautoptr: 
  given _tag: Tag[GtkPrintSettings_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkPrintSettings_queueautoptr = o
  extension (v: GtkPrintSettings_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkPrintSettings_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkPrintSettings_slistautoptr: 
  given _tag: Tag[GtkPrintSettings_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkPrintSettings_slistautoptr = o
  extension (v: GtkPrintSettings_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkProgressBar_autoptr = Ptr[GtkProgressBar]
object GtkProgressBar_autoptr: 
  given _tag: Tag[GtkProgressBar_autoptr] = Tag.Ptr[GtkProgressBar](GtkProgressBar._tag)
  inline def apply(inline o: Ptr[GtkProgressBar]): GtkProgressBar_autoptr = o
  extension (v: GtkProgressBar_autoptr)
    inline def value: Ptr[GtkProgressBar] = v

opaque type GtkProgressBar_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkProgressBar_listautoptr: 
  given _tag: Tag[GtkProgressBar_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkProgressBar_listautoptr = o
  extension (v: GtkProgressBar_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkProgressBar_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkProgressBar_queueautoptr: 
  given _tag: Tag[GtkProgressBar_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkProgressBar_queueautoptr = o
  extension (v: GtkProgressBar_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkProgressBar_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkProgressBar_slistautoptr: 
  given _tag: Tag[GtkProgressBar_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkProgressBar_slistautoptr = o
  extension (v: GtkProgressBar_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkRange_autoptr = Ptr[GtkRange]
object GtkRange_autoptr: 
  given _tag: Tag[GtkRange_autoptr] = Tag.Ptr[GtkRange](GtkRange._tag)
  inline def apply(inline o: Ptr[GtkRange]): GtkRange_autoptr = o
  extension (v: GtkRange_autoptr)
    inline def value: Ptr[GtkRange] = v

opaque type GtkRange_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkRange_listautoptr: 
  given _tag: Tag[GtkRange_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkRange_listautoptr = o
  extension (v: GtkRange_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkRange_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkRange_queueautoptr: 
  given _tag: Tag[GtkRange_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkRange_queueautoptr = o
  extension (v: GtkRange_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkRange_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkRange_slistautoptr: 
  given _tag: Tag[GtkRange_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkRange_slistautoptr = o
  extension (v: GtkRange_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkRecentInfo_autoptr = Ptr[GtkRecentInfo]
object GtkRecentInfo_autoptr: 
  given _tag: Tag[GtkRecentInfo_autoptr] = Tag.Ptr[GtkRecentInfo](GtkRecentInfo._tag)
  inline def apply(inline o: Ptr[GtkRecentInfo]): GtkRecentInfo_autoptr = o
  extension (v: GtkRecentInfo_autoptr)
    inline def value: Ptr[GtkRecentInfo] = v

opaque type GtkRecentInfo_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkRecentInfo_listautoptr: 
  given _tag: Tag[GtkRecentInfo_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkRecentInfo_listautoptr = o
  extension (v: GtkRecentInfo_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkRecentInfo_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkRecentInfo_queueautoptr: 
  given _tag: Tag[GtkRecentInfo_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkRecentInfo_queueautoptr = o
  extension (v: GtkRecentInfo_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkRecentInfo_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkRecentInfo_slistautoptr: 
  given _tag: Tag[GtkRecentInfo_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkRecentInfo_slistautoptr = o
  extension (v: GtkRecentInfo_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkRecentManager_autoptr = Ptr[GtkRecentManager]
object GtkRecentManager_autoptr: 
  given _tag: Tag[GtkRecentManager_autoptr] = Tag.Ptr[GtkRecentManager](GtkRecentManager._tag)
  inline def apply(inline o: Ptr[GtkRecentManager]): GtkRecentManager_autoptr = o
  extension (v: GtkRecentManager_autoptr)
    inline def value: Ptr[GtkRecentManager] = v

opaque type GtkRecentManager_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkRecentManager_listautoptr: 
  given _tag: Tag[GtkRecentManager_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkRecentManager_listautoptr = o
  extension (v: GtkRecentManager_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkRecentManager_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkRecentManager_queueautoptr: 
  given _tag: Tag[GtkRecentManager_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkRecentManager_queueautoptr = o
  extension (v: GtkRecentManager_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkRecentManager_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkRecentManager_slistautoptr: 
  given _tag: Tag[GtkRecentManager_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkRecentManager_slistautoptr = o
  extension (v: GtkRecentManager_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkRequisition_autoptr = Ptr[GtkRequisition]
object GtkRequisition_autoptr: 
  given _tag: Tag[GtkRequisition_autoptr] = Tag.Ptr[GtkRequisition](GtkRequisition._tag)
  inline def apply(inline o: Ptr[GtkRequisition]): GtkRequisition_autoptr = o
  extension (v: GtkRequisition_autoptr)
    inline def value: Ptr[GtkRequisition] = v

opaque type GtkRequisition_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkRequisition_listautoptr: 
  given _tag: Tag[GtkRequisition_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkRequisition_listautoptr = o
  extension (v: GtkRequisition_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkRequisition_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkRequisition_queueautoptr: 
  given _tag: Tag[GtkRequisition_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkRequisition_queueautoptr = o
  extension (v: GtkRequisition_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkRequisition_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkRequisition_slistautoptr: 
  given _tag: Tag[GtkRequisition_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkRequisition_slistautoptr = o
  extension (v: GtkRequisition_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkRevealer_autoptr = Ptr[GtkRevealer]
object GtkRevealer_autoptr: 
  given _tag: Tag[GtkRevealer_autoptr] = Tag.Ptr[GtkRevealer](GtkRevealer._tag)
  inline def apply(inline o: Ptr[GtkRevealer]): GtkRevealer_autoptr = o
  extension (v: GtkRevealer_autoptr)
    inline def value: Ptr[GtkRevealer] = v

opaque type GtkRevealer_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkRevealer_listautoptr: 
  given _tag: Tag[GtkRevealer_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkRevealer_listautoptr = o
  extension (v: GtkRevealer_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkRevealer_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkRevealer_queueautoptr: 
  given _tag: Tag[GtkRevealer_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkRevealer_queueautoptr = o
  extension (v: GtkRevealer_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkRevealer_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkRevealer_slistautoptr: 
  given _tag: Tag[GtkRevealer_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkRevealer_slistautoptr = o
  extension (v: GtkRevealer_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkRoot_autoptr = Ptr[GtkRoot]
object GtkRoot_autoptr: 
  given _tag: Tag[GtkRoot_autoptr] = Tag.Ptr[GtkRoot](GtkRoot._tag)
  inline def apply(inline o: Ptr[GtkRoot]): GtkRoot_autoptr = o
  extension (v: GtkRoot_autoptr)
    inline def value: Ptr[GtkRoot] = v

opaque type GtkRoot_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkRoot_listautoptr: 
  given _tag: Tag[GtkRoot_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkRoot_listautoptr = o
  extension (v: GtkRoot_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkRoot_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkRoot_queueautoptr: 
  given _tag: Tag[GtkRoot_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkRoot_queueautoptr = o
  extension (v: GtkRoot_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkRoot_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkRoot_slistautoptr: 
  given _tag: Tag[GtkRoot_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkRoot_slistautoptr = o
  extension (v: GtkRoot_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkScaleButton_autoptr = Ptr[GtkScaleButton]
object GtkScaleButton_autoptr: 
  given _tag: Tag[GtkScaleButton_autoptr] = Tag.Ptr[GtkScaleButton](GtkScaleButton._tag)
  inline def apply(inline o: Ptr[GtkScaleButton]): GtkScaleButton_autoptr = o
  extension (v: GtkScaleButton_autoptr)
    inline def value: Ptr[GtkScaleButton] = v

opaque type GtkScaleButton_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkScaleButton_listautoptr: 
  given _tag: Tag[GtkScaleButton_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkScaleButton_listautoptr = o
  extension (v: GtkScaleButton_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkScaleButton_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkScaleButton_queueautoptr: 
  given _tag: Tag[GtkScaleButton_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkScaleButton_queueautoptr = o
  extension (v: GtkScaleButton_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkScaleButton_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkScaleButton_slistautoptr: 
  given _tag: Tag[GtkScaleButton_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkScaleButton_slistautoptr = o
  extension (v: GtkScaleButton_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkScaleFormatValueFunc: : The `GtkScale` : The numeric value to format _data: (closure): user data
*/
opaque type GtkScaleFormatValueFunc = CFuncPtr3[Ptr[GtkScale], Double, _root_.sn.gnome.glib.internal.gpointer, Ptr[CUnsignedChar]]
object GtkScaleFormatValueFunc: 
  given _tag: Tag[GtkScaleFormatValueFunc] = Tag.materializeCFuncPtr3[Ptr[GtkScale], Double, _root_.sn.gnome.glib.internal.gpointer, Ptr[CUnsignedChar]]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkScaleFormatValueFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GtkScale], Double, _root_.sn.gnome.glib.internal.gpointer, Ptr[CUnsignedChar]]): GtkScaleFormatValueFunc = o
  extension (v: GtkScaleFormatValueFunc)
    inline def value: CFuncPtr3[Ptr[GtkScale], Double, _root_.sn.gnome.glib.internal.gpointer, Ptr[CUnsignedChar]] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkScale_autoptr = Ptr[GtkScale]
object GtkScale_autoptr: 
  given _tag: Tag[GtkScale_autoptr] = Tag.Ptr[GtkScale](GtkScale._tag)
  inline def apply(inline o: Ptr[GtkScale]): GtkScale_autoptr = o
  extension (v: GtkScale_autoptr)
    inline def value: Ptr[GtkScale] = v

opaque type GtkScale_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkScale_listautoptr: 
  given _tag: Tag[GtkScale_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkScale_listautoptr = o
  extension (v: GtkScale_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkScale_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkScale_queueautoptr: 
  given _tag: Tag[GtkScale_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkScale_queueautoptr = o
  extension (v: GtkScale_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkScale_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkScale_slistautoptr: 
  given _tag: Tag[GtkScale_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkScale_slistautoptr = o
  extension (v: GtkScale_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkScrollInfo_autoptr = Ptr[GtkScrollInfo]
object GtkScrollInfo_autoptr: 
  given _tag: Tag[GtkScrollInfo_autoptr] = Tag.Ptr[GtkScrollInfo](GtkScrollInfo._tag)
  inline def apply(inline o: Ptr[GtkScrollInfo]): GtkScrollInfo_autoptr = o
  extension (v: GtkScrollInfo_autoptr)
    inline def value: Ptr[GtkScrollInfo] = v

opaque type GtkScrollInfo_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkScrollInfo_listautoptr: 
  given _tag: Tag[GtkScrollInfo_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkScrollInfo_listautoptr = o
  extension (v: GtkScrollInfo_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkScrollInfo_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkScrollInfo_queueautoptr: 
  given _tag: Tag[GtkScrollInfo_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkScrollInfo_queueautoptr = o
  extension (v: GtkScrollInfo_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkScrollInfo_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkScrollInfo_slistautoptr: 
  given _tag: Tag[GtkScrollInfo_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkScrollInfo_slistautoptr = o
  extension (v: GtkScrollInfo_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkScrollable_autoptr = Ptr[GtkScrollable]
object GtkScrollable_autoptr: 
  given _tag: Tag[GtkScrollable_autoptr] = Tag.Ptr[GtkScrollable](GtkScrollable._tag)
  inline def apply(inline o: Ptr[GtkScrollable]): GtkScrollable_autoptr = o
  extension (v: GtkScrollable_autoptr)
    inline def value: Ptr[GtkScrollable] = v

opaque type GtkScrollable_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkScrollable_listautoptr: 
  given _tag: Tag[GtkScrollable_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkScrollable_listautoptr = o
  extension (v: GtkScrollable_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkScrollable_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkScrollable_queueautoptr: 
  given _tag: Tag[GtkScrollable_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkScrollable_queueautoptr = o
  extension (v: GtkScrollable_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkScrollable_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkScrollable_slistautoptr: 
  given _tag: Tag[GtkScrollable_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkScrollable_slistautoptr = o
  extension (v: GtkScrollable_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkScrollbar_autoptr = Ptr[GtkScrollbar]
object GtkScrollbar_autoptr: 
  given _tag: Tag[GtkScrollbar_autoptr] = Tag.Ptr[GtkScrollbar](GtkScrollbar._tag)
  inline def apply(inline o: Ptr[GtkScrollbar]): GtkScrollbar_autoptr = o
  extension (v: GtkScrollbar_autoptr)
    inline def value: Ptr[GtkScrollbar] = v

opaque type GtkScrollbar_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkScrollbar_listautoptr: 
  given _tag: Tag[GtkScrollbar_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkScrollbar_listautoptr = o
  extension (v: GtkScrollbar_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkScrollbar_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkScrollbar_queueautoptr: 
  given _tag: Tag[GtkScrollbar_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkScrollbar_queueautoptr = o
  extension (v: GtkScrollbar_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkScrollbar_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkScrollbar_slistautoptr: 
  given _tag: Tag[GtkScrollbar_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkScrollbar_slistautoptr = o
  extension (v: GtkScrollbar_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkScrolledWindow_autoptr = Ptr[GtkScrolledWindow]
object GtkScrolledWindow_autoptr: 
  given _tag: Tag[GtkScrolledWindow_autoptr] = Tag.Ptr[GtkScrolledWindow](GtkScrolledWindow._tag)
  inline def apply(inline o: Ptr[GtkScrolledWindow]): GtkScrolledWindow_autoptr = o
  extension (v: GtkScrolledWindow_autoptr)
    inline def value: Ptr[GtkScrolledWindow] = v

opaque type GtkScrolledWindow_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkScrolledWindow_listautoptr: 
  given _tag: Tag[GtkScrolledWindow_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkScrolledWindow_listautoptr = o
  extension (v: GtkScrolledWindow_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkScrolledWindow_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkScrolledWindow_queueautoptr: 
  given _tag: Tag[GtkScrolledWindow_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkScrolledWindow_queueautoptr = o
  extension (v: GtkScrolledWindow_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkScrolledWindow_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkScrolledWindow_slistautoptr: 
  given _tag: Tag[GtkScrolledWindow_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkScrolledWindow_slistautoptr = o
  extension (v: GtkScrolledWindow_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkSearchBar_autoptr = Ptr[GtkSearchBar]
object GtkSearchBar_autoptr: 
  given _tag: Tag[GtkSearchBar_autoptr] = Tag.Ptr[GtkSearchBar](GtkSearchBar._tag)
  inline def apply(inline o: Ptr[GtkSearchBar]): GtkSearchBar_autoptr = o
  extension (v: GtkSearchBar_autoptr)
    inline def value: Ptr[GtkSearchBar] = v

opaque type GtkSearchBar_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkSearchBar_listautoptr: 
  given _tag: Tag[GtkSearchBar_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkSearchBar_listautoptr = o
  extension (v: GtkSearchBar_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkSearchBar_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkSearchBar_queueautoptr: 
  given _tag: Tag[GtkSearchBar_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkSearchBar_queueautoptr = o
  extension (v: GtkSearchBar_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkSearchBar_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkSearchBar_slistautoptr: 
  given _tag: Tag[GtkSearchBar_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkSearchBar_slistautoptr = o
  extension (v: GtkSearchBar_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkSearchEntry_autoptr = Ptr[GtkSearchEntry]
object GtkSearchEntry_autoptr: 
  given _tag: Tag[GtkSearchEntry_autoptr] = Tag.Ptr[GtkSearchEntry](GtkSearchEntry._tag)
  inline def apply(inline o: Ptr[GtkSearchEntry]): GtkSearchEntry_autoptr = o
  extension (v: GtkSearchEntry_autoptr)
    inline def value: Ptr[GtkSearchEntry] = v

opaque type GtkSearchEntry_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkSearchEntry_listautoptr: 
  given _tag: Tag[GtkSearchEntry_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkSearchEntry_listautoptr = o
  extension (v: GtkSearchEntry_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkSearchEntry_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkSearchEntry_queueautoptr: 
  given _tag: Tag[GtkSearchEntry_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkSearchEntry_queueautoptr = o
  extension (v: GtkSearchEntry_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkSearchEntry_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkSearchEntry_slistautoptr: 
  given _tag: Tag[GtkSearchEntry_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkSearchEntry_slistautoptr = o
  extension (v: GtkSearchEntry_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkSectionModel_autoptr = Ptr[GtkSectionModel]
object GtkSectionModel_autoptr: 
  given _tag: Tag[GtkSectionModel_autoptr] = Tag.Ptr[GtkSectionModel](GtkSectionModel._tag)
  inline def apply(inline o: Ptr[GtkSectionModel]): GtkSectionModel_autoptr = o
  extension (v: GtkSectionModel_autoptr)
    inline def value: Ptr[GtkSectionModel] = v

opaque type GtkSectionModel_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkSectionModel_listautoptr: 
  given _tag: Tag[GtkSectionModel_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkSectionModel_listautoptr = o
  extension (v: GtkSectionModel_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkSectionModel_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkSectionModel_queueautoptr: 
  given _tag: Tag[GtkSectionModel_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkSectionModel_queueautoptr = o
  extension (v: GtkSectionModel_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkSectionModel_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkSectionModel_slistautoptr: 
  given _tag: Tag[GtkSectionModel_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkSectionModel_slistautoptr = o
  extension (v: GtkSectionModel_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkSelectionFilterModelClass_autoptr = Ptr[GtkSelectionFilterModelClass]
object GtkSelectionFilterModelClass_autoptr: 
  given _tag: Tag[GtkSelectionFilterModelClass_autoptr] = Tag.Ptr[GtkSelectionFilterModelClass](GtkSelectionFilterModelClass._tag)
  inline def apply(inline o: Ptr[GtkSelectionFilterModelClass]): GtkSelectionFilterModelClass_autoptr = o
  extension (v: GtkSelectionFilterModelClass_autoptr)
    inline def value: Ptr[GtkSelectionFilterModelClass] = v

opaque type GtkSelectionFilterModelClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkSelectionFilterModelClass_listautoptr: 
  given _tag: Tag[GtkSelectionFilterModelClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkSelectionFilterModelClass_listautoptr = o
  extension (v: GtkSelectionFilterModelClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkSelectionFilterModelClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkSelectionFilterModelClass_queueautoptr: 
  given _tag: Tag[GtkSelectionFilterModelClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkSelectionFilterModelClass_queueautoptr = o
  extension (v: GtkSelectionFilterModelClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkSelectionFilterModelClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkSelectionFilterModelClass_slistautoptr: 
  given _tag: Tag[GtkSelectionFilterModelClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkSelectionFilterModelClass_slistautoptr = o
  extension (v: GtkSelectionFilterModelClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkSelectionFilterModel_autoptr = Ptr[GtkSelectionFilterModel]
object GtkSelectionFilterModel_autoptr: 
  given _tag: Tag[GtkSelectionFilterModel_autoptr] = Tag.Ptr[GtkSelectionFilterModel](GtkSelectionFilterModel._tag)
  inline def apply(inline o: Ptr[GtkSelectionFilterModel]): GtkSelectionFilterModel_autoptr = o
  extension (v: GtkSelectionFilterModel_autoptr)
    inline def value: Ptr[GtkSelectionFilterModel] = v

opaque type GtkSelectionFilterModel_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkSelectionFilterModel_listautoptr: 
  given _tag: Tag[GtkSelectionFilterModel_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkSelectionFilterModel_listautoptr = o
  extension (v: GtkSelectionFilterModel_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkSelectionFilterModel_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkSelectionFilterModel_queueautoptr: 
  given _tag: Tag[GtkSelectionFilterModel_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkSelectionFilterModel_queueautoptr = o
  extension (v: GtkSelectionFilterModel_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkSelectionFilterModel_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkSelectionFilterModel_slistautoptr: 
  given _tag: Tag[GtkSelectionFilterModel_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkSelectionFilterModel_slistautoptr = o
  extension (v: GtkSelectionFilterModel_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkSelectionModel_autoptr = Ptr[GtkSelectionModel]
object GtkSelectionModel_autoptr: 
  given _tag: Tag[GtkSelectionModel_autoptr] = Tag.Ptr[GtkSelectionModel](GtkSelectionModel._tag)
  inline def apply(inline o: Ptr[GtkSelectionModel]): GtkSelectionModel_autoptr = o
  extension (v: GtkSelectionModel_autoptr)
    inline def value: Ptr[GtkSelectionModel] = v

opaque type GtkSelectionModel_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkSelectionModel_listautoptr: 
  given _tag: Tag[GtkSelectionModel_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkSelectionModel_listautoptr = o
  extension (v: GtkSelectionModel_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkSelectionModel_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkSelectionModel_queueautoptr: 
  given _tag: Tag[GtkSelectionModel_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkSelectionModel_queueautoptr = o
  extension (v: GtkSelectionModel_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkSelectionModel_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkSelectionModel_slistautoptr: 
  given _tag: Tag[GtkSelectionModel_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkSelectionModel_slistautoptr = o
  extension (v: GtkSelectionModel_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkSeparator_autoptr = Ptr[GtkSeparator]
object GtkSeparator_autoptr: 
  given _tag: Tag[GtkSeparator_autoptr] = Tag.Ptr[GtkSeparator](GtkSeparator._tag)
  inline def apply(inline o: Ptr[GtkSeparator]): GtkSeparator_autoptr = o
  extension (v: GtkSeparator_autoptr)
    inline def value: Ptr[GtkSeparator] = v

opaque type GtkSeparator_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkSeparator_listautoptr: 
  given _tag: Tag[GtkSeparator_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkSeparator_listautoptr = o
  extension (v: GtkSeparator_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkSeparator_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkSeparator_queueautoptr: 
  given _tag: Tag[GtkSeparator_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkSeparator_queueautoptr = o
  extension (v: GtkSeparator_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkSeparator_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkSeparator_slistautoptr: 
  given _tag: Tag[GtkSeparator_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkSeparator_slistautoptr = o
  extension (v: GtkSeparator_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkSettings_autoptr = Ptr[GtkSettings]
object GtkSettings_autoptr: 
  given _tag: Tag[GtkSettings_autoptr] = Tag.Ptr[GtkSettings](GtkSettings._tag)
  inline def apply(inline o: Ptr[GtkSettings]): GtkSettings_autoptr = o
  extension (v: GtkSettings_autoptr)
    inline def value: Ptr[GtkSettings] = v

opaque type GtkSettings_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkSettings_listautoptr: 
  given _tag: Tag[GtkSettings_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkSettings_listautoptr = o
  extension (v: GtkSettings_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkSettings_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkSettings_queueautoptr: 
  given _tag: Tag[GtkSettings_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkSettings_queueautoptr = o
  extension (v: GtkSettings_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkSettings_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkSettings_slistautoptr: 
  given _tag: Tag[GtkSettings_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkSettings_slistautoptr = o
  extension (v: GtkSettings_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkShortcutActionClass_autoptr = Ptr[GtkShortcutActionClass]
object GtkShortcutActionClass_autoptr: 
  given _tag: Tag[GtkShortcutActionClass_autoptr] = Tag.Ptr[GtkShortcutActionClass](GtkShortcutActionClass._tag)
  inline def apply(inline o: Ptr[GtkShortcutActionClass]): GtkShortcutActionClass_autoptr = o
  extension (v: GtkShortcutActionClass_autoptr)
    inline def value: Ptr[GtkShortcutActionClass] = v

opaque type GtkShortcutActionClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkShortcutActionClass_listautoptr: 
  given _tag: Tag[GtkShortcutActionClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkShortcutActionClass_listautoptr = o
  extension (v: GtkShortcutActionClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkShortcutActionClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkShortcutActionClass_queueautoptr: 
  given _tag: Tag[GtkShortcutActionClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkShortcutActionClass_queueautoptr = o
  extension (v: GtkShortcutActionClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkShortcutActionClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkShortcutActionClass_slistautoptr: 
  given _tag: Tag[GtkShortcutActionClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkShortcutActionClass_slistautoptr = o
  extension (v: GtkShortcutActionClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkShortcutAction_autoptr = Ptr[GtkShortcutAction]
object GtkShortcutAction_autoptr: 
  given _tag: Tag[GtkShortcutAction_autoptr] = Tag.Ptr[GtkShortcutAction](GtkShortcutAction._tag)
  inline def apply(inline o: Ptr[GtkShortcutAction]): GtkShortcutAction_autoptr = o
  extension (v: GtkShortcutAction_autoptr)
    inline def value: Ptr[GtkShortcutAction] = v

opaque type GtkShortcutAction_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkShortcutAction_listautoptr: 
  given _tag: Tag[GtkShortcutAction_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkShortcutAction_listautoptr = o
  extension (v: GtkShortcutAction_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkShortcutAction_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkShortcutAction_queueautoptr: 
  given _tag: Tag[GtkShortcutAction_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkShortcutAction_queueautoptr = o
  extension (v: GtkShortcutAction_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkShortcutAction_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkShortcutAction_slistautoptr: 
  given _tag: Tag[GtkShortcutAction_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkShortcutAction_slistautoptr = o
  extension (v: GtkShortcutAction_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkShortcutClass_autoptr = Ptr[GtkShortcutClass]
object GtkShortcutClass_autoptr: 
  given _tag: Tag[GtkShortcutClass_autoptr] = Tag.Ptr[GtkShortcutClass](GtkShortcutClass._tag)
  inline def apply(inline o: Ptr[GtkShortcutClass]): GtkShortcutClass_autoptr = o
  extension (v: GtkShortcutClass_autoptr)
    inline def value: Ptr[GtkShortcutClass] = v

opaque type GtkShortcutClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkShortcutClass_listautoptr: 
  given _tag: Tag[GtkShortcutClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkShortcutClass_listautoptr = o
  extension (v: GtkShortcutClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkShortcutClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkShortcutClass_queueautoptr: 
  given _tag: Tag[GtkShortcutClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkShortcutClass_queueautoptr = o
  extension (v: GtkShortcutClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkShortcutClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkShortcutClass_slistautoptr: 
  given _tag: Tag[GtkShortcutClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkShortcutClass_slistautoptr = o
  extension (v: GtkShortcutClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkShortcutFunc: : The widget passed to the activation
*/
opaque type GtkShortcutFunc = CFuncPtr3[Ptr[GtkWidget], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GtkShortcutFunc: 
  given _tag: Tag[GtkShortcutFunc] = Tag.materializeCFuncPtr3[Ptr[GtkWidget], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkShortcutFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GtkWidget], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GtkShortcutFunc = o
  extension (v: GtkShortcutFunc)
    inline def value: CFuncPtr3[Ptr[GtkWidget], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkShortcutManager_autoptr = Ptr[GtkShortcutManager]
object GtkShortcutManager_autoptr: 
  given _tag: Tag[GtkShortcutManager_autoptr] = Tag.Ptr[GtkShortcutManager](GtkShortcutManager._tag)
  inline def apply(inline o: Ptr[GtkShortcutManager]): GtkShortcutManager_autoptr = o
  extension (v: GtkShortcutManager_autoptr)
    inline def value: Ptr[GtkShortcutManager] = v

opaque type GtkShortcutManager_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkShortcutManager_listautoptr: 
  given _tag: Tag[GtkShortcutManager_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkShortcutManager_listautoptr = o
  extension (v: GtkShortcutManager_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkShortcutManager_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkShortcutManager_queueautoptr: 
  given _tag: Tag[GtkShortcutManager_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkShortcutManager_queueautoptr = o
  extension (v: GtkShortcutManager_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkShortcutManager_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkShortcutManager_slistautoptr: 
  given _tag: Tag[GtkShortcutManager_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkShortcutManager_slistautoptr = o
  extension (v: GtkShortcutManager_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkShortcutTriggerClass_autoptr = Ptr[GtkShortcutTriggerClass]
object GtkShortcutTriggerClass_autoptr: 
  given _tag: Tag[GtkShortcutTriggerClass_autoptr] = Tag.Ptr[GtkShortcutTriggerClass](GtkShortcutTriggerClass._tag)
  inline def apply(inline o: Ptr[GtkShortcutTriggerClass]): GtkShortcutTriggerClass_autoptr = o
  extension (v: GtkShortcutTriggerClass_autoptr)
    inline def value: Ptr[GtkShortcutTriggerClass] = v

opaque type GtkShortcutTriggerClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkShortcutTriggerClass_listautoptr: 
  given _tag: Tag[GtkShortcutTriggerClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkShortcutTriggerClass_listautoptr = o
  extension (v: GtkShortcutTriggerClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkShortcutTriggerClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkShortcutTriggerClass_queueautoptr: 
  given _tag: Tag[GtkShortcutTriggerClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkShortcutTriggerClass_queueautoptr = o
  extension (v: GtkShortcutTriggerClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkShortcutTriggerClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkShortcutTriggerClass_slistautoptr: 
  given _tag: Tag[GtkShortcutTriggerClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkShortcutTriggerClass_slistautoptr = o
  extension (v: GtkShortcutTriggerClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkShortcutTrigger_autoptr = Ptr[GtkShortcutTrigger]
object GtkShortcutTrigger_autoptr: 
  given _tag: Tag[GtkShortcutTrigger_autoptr] = Tag.Ptr[GtkShortcutTrigger](GtkShortcutTrigger._tag)
  inline def apply(inline o: Ptr[GtkShortcutTrigger]): GtkShortcutTrigger_autoptr = o
  extension (v: GtkShortcutTrigger_autoptr)
    inline def value: Ptr[GtkShortcutTrigger] = v

opaque type GtkShortcutTrigger_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkShortcutTrigger_listautoptr: 
  given _tag: Tag[GtkShortcutTrigger_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkShortcutTrigger_listautoptr = o
  extension (v: GtkShortcutTrigger_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkShortcutTrigger_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkShortcutTrigger_queueautoptr: 
  given _tag: Tag[GtkShortcutTrigger_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkShortcutTrigger_queueautoptr = o
  extension (v: GtkShortcutTrigger_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkShortcutTrigger_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkShortcutTrigger_slistautoptr: 
  given _tag: Tag[GtkShortcutTrigger_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkShortcutTrigger_slistautoptr = o
  extension (v: GtkShortcutTrigger_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkShortcut_autoptr = Ptr[GtkShortcut]
object GtkShortcut_autoptr: 
  given _tag: Tag[GtkShortcut_autoptr] = Tag.Ptr[GtkShortcut](GtkShortcut._tag)
  inline def apply(inline o: Ptr[GtkShortcut]): GtkShortcut_autoptr = o
  extension (v: GtkShortcut_autoptr)
    inline def value: Ptr[GtkShortcut] = v

opaque type GtkShortcut_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkShortcut_listautoptr: 
  given _tag: Tag[GtkShortcut_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkShortcut_listautoptr = o
  extension (v: GtkShortcut_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkShortcut_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkShortcut_queueautoptr: 
  given _tag: Tag[GtkShortcut_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkShortcut_queueautoptr = o
  extension (v: GtkShortcut_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkShortcut_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkShortcut_slistautoptr: 
  given _tag: Tag[GtkShortcut_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkShortcut_slistautoptr = o
  extension (v: GtkShortcut_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkShortcutsWindow_autoptr = Ptr[GtkShortcutsWindow]
object GtkShortcutsWindow_autoptr: 
  given _tag: Tag[GtkShortcutsWindow_autoptr] = Tag.Ptr[GtkShortcutsWindow](GtkShortcutsWindow._tag)
  inline def apply(inline o: Ptr[GtkShortcutsWindow]): GtkShortcutsWindow_autoptr = o
  extension (v: GtkShortcutsWindow_autoptr)
    inline def value: Ptr[GtkShortcutsWindow] = v

opaque type GtkShortcutsWindow_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkShortcutsWindow_listautoptr: 
  given _tag: Tag[GtkShortcutsWindow_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkShortcutsWindow_listautoptr = o
  extension (v: GtkShortcutsWindow_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkShortcutsWindow_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkShortcutsWindow_queueautoptr: 
  given _tag: Tag[GtkShortcutsWindow_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkShortcutsWindow_queueautoptr = o
  extension (v: GtkShortcutsWindow_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkShortcutsWindow_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkShortcutsWindow_slistautoptr: 
  given _tag: Tag[GtkShortcutsWindow_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkShortcutsWindow_slistautoptr = o
  extension (v: GtkShortcutsWindow_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkSignalActionClass_autoptr = Ptr[GtkSignalActionClass]
object GtkSignalActionClass_autoptr: 
  given _tag: Tag[GtkSignalActionClass_autoptr] = Tag.Ptr[GtkSignalActionClass](GtkSignalActionClass._tag)
  inline def apply(inline o: Ptr[GtkSignalActionClass]): GtkSignalActionClass_autoptr = o
  extension (v: GtkSignalActionClass_autoptr)
    inline def value: Ptr[GtkSignalActionClass] = v

opaque type GtkSignalActionClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkSignalActionClass_listautoptr: 
  given _tag: Tag[GtkSignalActionClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkSignalActionClass_listautoptr = o
  extension (v: GtkSignalActionClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkSignalActionClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkSignalActionClass_queueautoptr: 
  given _tag: Tag[GtkSignalActionClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkSignalActionClass_queueautoptr = o
  extension (v: GtkSignalActionClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkSignalActionClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkSignalActionClass_slistautoptr: 
  given _tag: Tag[GtkSignalActionClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkSignalActionClass_slistautoptr = o
  extension (v: GtkSignalActionClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkSignalAction_autoptr = Ptr[GtkSignalAction]
object GtkSignalAction_autoptr: 
  given _tag: Tag[GtkSignalAction_autoptr] = Tag.Ptr[GtkSignalAction](GtkSignalAction._tag)
  inline def apply(inline o: Ptr[GtkSignalAction]): GtkSignalAction_autoptr = o
  extension (v: GtkSignalAction_autoptr)
    inline def value: Ptr[GtkSignalAction] = v

opaque type GtkSignalAction_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkSignalAction_listautoptr: 
  given _tag: Tag[GtkSignalAction_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkSignalAction_listautoptr = o
  extension (v: GtkSignalAction_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkSignalAction_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkSignalAction_queueautoptr: 
  given _tag: Tag[GtkSignalAction_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkSignalAction_queueautoptr = o
  extension (v: GtkSignalAction_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkSignalAction_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkSignalAction_slistautoptr: 
  given _tag: Tag[GtkSignalAction_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkSignalAction_slistautoptr = o
  extension (v: GtkSignalAction_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkSingleSelectionClass_autoptr = Ptr[GtkSingleSelectionClass]
object GtkSingleSelectionClass_autoptr: 
  given _tag: Tag[GtkSingleSelectionClass_autoptr] = Tag.Ptr[GtkSingleSelectionClass](GtkSingleSelectionClass._tag)
  inline def apply(inline o: Ptr[GtkSingleSelectionClass]): GtkSingleSelectionClass_autoptr = o
  extension (v: GtkSingleSelectionClass_autoptr)
    inline def value: Ptr[GtkSingleSelectionClass] = v

opaque type GtkSingleSelectionClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkSingleSelectionClass_listautoptr: 
  given _tag: Tag[GtkSingleSelectionClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkSingleSelectionClass_listautoptr = o
  extension (v: GtkSingleSelectionClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkSingleSelectionClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkSingleSelectionClass_queueautoptr: 
  given _tag: Tag[GtkSingleSelectionClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkSingleSelectionClass_queueautoptr = o
  extension (v: GtkSingleSelectionClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkSingleSelectionClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkSingleSelectionClass_slistautoptr: 
  given _tag: Tag[GtkSingleSelectionClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkSingleSelectionClass_slistautoptr = o
  extension (v: GtkSingleSelectionClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkSingleSelection_autoptr = Ptr[GtkSingleSelection]
object GtkSingleSelection_autoptr: 
  given _tag: Tag[GtkSingleSelection_autoptr] = Tag.Ptr[GtkSingleSelection](GtkSingleSelection._tag)
  inline def apply(inline o: Ptr[GtkSingleSelection]): GtkSingleSelection_autoptr = o
  extension (v: GtkSingleSelection_autoptr)
    inline def value: Ptr[GtkSingleSelection] = v

opaque type GtkSingleSelection_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkSingleSelection_listautoptr: 
  given _tag: Tag[GtkSingleSelection_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkSingleSelection_listautoptr = o
  extension (v: GtkSingleSelection_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkSingleSelection_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkSingleSelection_queueautoptr: 
  given _tag: Tag[GtkSingleSelection_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkSingleSelection_queueautoptr = o
  extension (v: GtkSingleSelection_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkSingleSelection_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkSingleSelection_slistautoptr: 
  given _tag: Tag[GtkSingleSelection_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkSingleSelection_slistautoptr = o
  extension (v: GtkSingleSelection_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkSizeGroup_autoptr = Ptr[GtkSizeGroup]
object GtkSizeGroup_autoptr: 
  given _tag: Tag[GtkSizeGroup_autoptr] = Tag.Ptr[GtkSizeGroup](GtkSizeGroup._tag)
  inline def apply(inline o: Ptr[GtkSizeGroup]): GtkSizeGroup_autoptr = o
  extension (v: GtkSizeGroup_autoptr)
    inline def value: Ptr[GtkSizeGroup] = v

opaque type GtkSizeGroup_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkSizeGroup_listautoptr: 
  given _tag: Tag[GtkSizeGroup_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkSizeGroup_listautoptr = o
  extension (v: GtkSizeGroup_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkSizeGroup_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkSizeGroup_queueautoptr: 
  given _tag: Tag[GtkSizeGroup_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkSizeGroup_queueautoptr = o
  extension (v: GtkSizeGroup_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkSizeGroup_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkSizeGroup_slistautoptr: 
  given _tag: Tag[GtkSizeGroup_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkSizeGroup_slistautoptr = o
  extension (v: GtkSizeGroup_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkSliceListModelClass_autoptr = Ptr[GtkSliceListModelClass]
object GtkSliceListModelClass_autoptr: 
  given _tag: Tag[GtkSliceListModelClass_autoptr] = Tag.Ptr[GtkSliceListModelClass](GtkSliceListModelClass._tag)
  inline def apply(inline o: Ptr[GtkSliceListModelClass]): GtkSliceListModelClass_autoptr = o
  extension (v: GtkSliceListModelClass_autoptr)
    inline def value: Ptr[GtkSliceListModelClass] = v

opaque type GtkSliceListModelClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkSliceListModelClass_listautoptr: 
  given _tag: Tag[GtkSliceListModelClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkSliceListModelClass_listautoptr = o
  extension (v: GtkSliceListModelClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkSliceListModelClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkSliceListModelClass_queueautoptr: 
  given _tag: Tag[GtkSliceListModelClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkSliceListModelClass_queueautoptr = o
  extension (v: GtkSliceListModelClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkSliceListModelClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkSliceListModelClass_slistautoptr: 
  given _tag: Tag[GtkSliceListModelClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkSliceListModelClass_slistautoptr = o
  extension (v: GtkSliceListModelClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkSliceListModel_autoptr = Ptr[GtkSliceListModel]
object GtkSliceListModel_autoptr: 
  given _tag: Tag[GtkSliceListModel_autoptr] = Tag.Ptr[GtkSliceListModel](GtkSliceListModel._tag)
  inline def apply(inline o: Ptr[GtkSliceListModel]): GtkSliceListModel_autoptr = o
  extension (v: GtkSliceListModel_autoptr)
    inline def value: Ptr[GtkSliceListModel] = v

opaque type GtkSliceListModel_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkSliceListModel_listautoptr: 
  given _tag: Tag[GtkSliceListModel_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkSliceListModel_listautoptr = o
  extension (v: GtkSliceListModel_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkSliceListModel_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkSliceListModel_queueautoptr: 
  given _tag: Tag[GtkSliceListModel_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkSliceListModel_queueautoptr = o
  extension (v: GtkSliceListModel_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkSliceListModel_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkSliceListModel_slistautoptr: 
  given _tag: Tag[GtkSliceListModel_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkSliceListModel_slistautoptr = o
  extension (v: GtkSliceListModel_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

type GtkSnapshot = GdkSnapshot
object GtkSnapshot: 
  given _tag: Tag[GtkSnapshot] = GdkSnapshot._tag
  inline def apply(inline o: GdkSnapshot): GtkSnapshot = o
  extension (v: GtkSnapshot)
    inline def value: GdkSnapshot = v

opaque type GtkSnapshot_autoptr = Ptr[GtkSnapshot]
object GtkSnapshot_autoptr: 
  given _tag: Tag[GtkSnapshot_autoptr] = Tag.Ptr[GtkSnapshot](GtkSnapshot._tag)
  inline def apply(inline o: Ptr[GtkSnapshot]): GtkSnapshot_autoptr = o
  extension (v: GtkSnapshot_autoptr)
    inline def value: Ptr[GtkSnapshot] = v

opaque type GtkSnapshot_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkSnapshot_listautoptr: 
  given _tag: Tag[GtkSnapshot_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkSnapshot_listautoptr = o
  extension (v: GtkSnapshot_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkSnapshot_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkSnapshot_queueautoptr: 
  given _tag: Tag[GtkSnapshot_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkSnapshot_queueautoptr = o
  extension (v: GtkSnapshot_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkSnapshot_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkSnapshot_slistautoptr: 
  given _tag: Tag[GtkSnapshot_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkSnapshot_slistautoptr = o
  extension (v: GtkSnapshot_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkSortListModelClass_autoptr = Ptr[GtkSortListModelClass]
object GtkSortListModelClass_autoptr: 
  given _tag: Tag[GtkSortListModelClass_autoptr] = Tag.Ptr[GtkSortListModelClass](GtkSortListModelClass._tag)
  inline def apply(inline o: Ptr[GtkSortListModelClass]): GtkSortListModelClass_autoptr = o
  extension (v: GtkSortListModelClass_autoptr)
    inline def value: Ptr[GtkSortListModelClass] = v

opaque type GtkSortListModelClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkSortListModelClass_listautoptr: 
  given _tag: Tag[GtkSortListModelClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkSortListModelClass_listautoptr = o
  extension (v: GtkSortListModelClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkSortListModelClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkSortListModelClass_queueautoptr: 
  given _tag: Tag[GtkSortListModelClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkSortListModelClass_queueautoptr = o
  extension (v: GtkSortListModelClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkSortListModelClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkSortListModelClass_slistautoptr: 
  given _tag: Tag[GtkSortListModelClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkSortListModelClass_slistautoptr = o
  extension (v: GtkSortListModelClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkSortListModel_autoptr = Ptr[GtkSortListModel]
object GtkSortListModel_autoptr: 
  given _tag: Tag[GtkSortListModel_autoptr] = Tag.Ptr[GtkSortListModel](GtkSortListModel._tag)
  inline def apply(inline o: Ptr[GtkSortListModel]): GtkSortListModel_autoptr = o
  extension (v: GtkSortListModel_autoptr)
    inline def value: Ptr[GtkSortListModel] = v

opaque type GtkSortListModel_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkSortListModel_listautoptr: 
  given _tag: Tag[GtkSortListModel_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkSortListModel_listautoptr = o
  extension (v: GtkSortListModel_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkSortListModel_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkSortListModel_queueautoptr: 
  given _tag: Tag[GtkSortListModel_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkSortListModel_queueautoptr = o
  extension (v: GtkSortListModel_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkSortListModel_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkSortListModel_slistautoptr: 
  given _tag: Tag[GtkSortListModel_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkSortListModel_slistautoptr = o
  extension (v: GtkSortListModel_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkSorterClass_autoptr = Ptr[GtkSorterClass]
object GtkSorterClass_autoptr: 
  given _tag: Tag[GtkSorterClass_autoptr] = Tag.Ptr[GtkSorterClass](GtkSorterClass._tag)
  inline def apply(inline o: Ptr[GtkSorterClass]): GtkSorterClass_autoptr = o
  extension (v: GtkSorterClass_autoptr)
    inline def value: Ptr[GtkSorterClass] = v

opaque type GtkSorterClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkSorterClass_listautoptr: 
  given _tag: Tag[GtkSorterClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkSorterClass_listautoptr = o
  extension (v: GtkSorterClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkSorterClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkSorterClass_queueautoptr: 
  given _tag: Tag[GtkSorterClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkSorterClass_queueautoptr = o
  extension (v: GtkSorterClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkSorterClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkSorterClass_slistautoptr: 
  given _tag: Tag[GtkSorterClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkSorterClass_slistautoptr = o
  extension (v: GtkSorterClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkSorter_autoptr = Ptr[GtkSorter]
object GtkSorter_autoptr: 
  given _tag: Tag[GtkSorter_autoptr] = Tag.Ptr[GtkSorter](GtkSorter._tag)
  inline def apply(inline o: Ptr[GtkSorter]): GtkSorter_autoptr = o
  extension (v: GtkSorter_autoptr)
    inline def value: Ptr[GtkSorter] = v

opaque type GtkSorter_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkSorter_listautoptr: 
  given _tag: Tag[GtkSorter_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkSorter_listautoptr = o
  extension (v: GtkSorter_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkSorter_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkSorter_queueautoptr: 
  given _tag: Tag[GtkSorter_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkSorter_queueautoptr = o
  extension (v: GtkSorter_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkSorter_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkSorter_slistautoptr: 
  given _tag: Tag[GtkSorter_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkSorter_slistautoptr = o
  extension (v: GtkSorter_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkSpinButton_autoptr = Ptr[GtkSpinButton]
object GtkSpinButton_autoptr: 
  given _tag: Tag[GtkSpinButton_autoptr] = Tag.Ptr[GtkSpinButton](GtkSpinButton._tag)
  inline def apply(inline o: Ptr[GtkSpinButton]): GtkSpinButton_autoptr = o
  extension (v: GtkSpinButton_autoptr)
    inline def value: Ptr[GtkSpinButton] = v

opaque type GtkSpinButton_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkSpinButton_listautoptr: 
  given _tag: Tag[GtkSpinButton_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkSpinButton_listautoptr = o
  extension (v: GtkSpinButton_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkSpinButton_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkSpinButton_queueautoptr: 
  given _tag: Tag[GtkSpinButton_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkSpinButton_queueautoptr = o
  extension (v: GtkSpinButton_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkSpinButton_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkSpinButton_slistautoptr: 
  given _tag: Tag[GtkSpinButton_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkSpinButton_slistautoptr = o
  extension (v: GtkSpinButton_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkSpinner_autoptr = Ptr[GtkSpinner]
object GtkSpinner_autoptr: 
  given _tag: Tag[GtkSpinner_autoptr] = Tag.Ptr[GtkSpinner](GtkSpinner._tag)
  inline def apply(inline o: Ptr[GtkSpinner]): GtkSpinner_autoptr = o
  extension (v: GtkSpinner_autoptr)
    inline def value: Ptr[GtkSpinner] = v

opaque type GtkSpinner_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkSpinner_listautoptr: 
  given _tag: Tag[GtkSpinner_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkSpinner_listautoptr = o
  extension (v: GtkSpinner_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkSpinner_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkSpinner_queueautoptr: 
  given _tag: Tag[GtkSpinner_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkSpinner_queueautoptr = o
  extension (v: GtkSpinner_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkSpinner_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkSpinner_slistautoptr: 
  given _tag: Tag[GtkSpinner_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkSpinner_slistautoptr = o
  extension (v: GtkSpinner_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkStackPage_autoptr = Ptr[GtkStackPage]
object GtkStackPage_autoptr: 
  given _tag: Tag[GtkStackPage_autoptr] = Tag.Ptr[GtkStackPage](GtkStackPage._tag)
  inline def apply(inline o: Ptr[GtkStackPage]): GtkStackPage_autoptr = o
  extension (v: GtkStackPage_autoptr)
    inline def value: Ptr[GtkStackPage] = v

opaque type GtkStackPage_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkStackPage_listautoptr: 
  given _tag: Tag[GtkStackPage_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkStackPage_listautoptr = o
  extension (v: GtkStackPage_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkStackPage_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkStackPage_queueautoptr: 
  given _tag: Tag[GtkStackPage_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkStackPage_queueautoptr = o
  extension (v: GtkStackPage_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkStackPage_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkStackPage_slistautoptr: 
  given _tag: Tag[GtkStackPage_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkStackPage_slistautoptr = o
  extension (v: GtkStackPage_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkStackSidebar_autoptr = Ptr[GtkStackSidebar]
object GtkStackSidebar_autoptr: 
  given _tag: Tag[GtkStackSidebar_autoptr] = Tag.Ptr[GtkStackSidebar](GtkStackSidebar._tag)
  inline def apply(inline o: Ptr[GtkStackSidebar]): GtkStackSidebar_autoptr = o
  extension (v: GtkStackSidebar_autoptr)
    inline def value: Ptr[GtkStackSidebar] = v

opaque type GtkStackSidebar_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkStackSidebar_listautoptr: 
  given _tag: Tag[GtkStackSidebar_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkStackSidebar_listautoptr = o
  extension (v: GtkStackSidebar_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkStackSidebar_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkStackSidebar_queueautoptr: 
  given _tag: Tag[GtkStackSidebar_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkStackSidebar_queueautoptr = o
  extension (v: GtkStackSidebar_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkStackSidebar_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkStackSidebar_slistautoptr: 
  given _tag: Tag[GtkStackSidebar_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkStackSidebar_slistautoptr = o
  extension (v: GtkStackSidebar_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkStackSwitcher_autoptr = Ptr[GtkStackSwitcher]
object GtkStackSwitcher_autoptr: 
  given _tag: Tag[GtkStackSwitcher_autoptr] = Tag.Ptr[GtkStackSwitcher](GtkStackSwitcher._tag)
  inline def apply(inline o: Ptr[GtkStackSwitcher]): GtkStackSwitcher_autoptr = o
  extension (v: GtkStackSwitcher_autoptr)
    inline def value: Ptr[GtkStackSwitcher] = v

opaque type GtkStackSwitcher_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkStackSwitcher_listautoptr: 
  given _tag: Tag[GtkStackSwitcher_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkStackSwitcher_listautoptr = o
  extension (v: GtkStackSwitcher_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkStackSwitcher_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkStackSwitcher_queueautoptr: 
  given _tag: Tag[GtkStackSwitcher_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkStackSwitcher_queueautoptr = o
  extension (v: GtkStackSwitcher_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkStackSwitcher_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkStackSwitcher_slistautoptr: 
  given _tag: Tag[GtkStackSwitcher_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkStackSwitcher_slistautoptr = o
  extension (v: GtkStackSwitcher_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkStack_autoptr = Ptr[GtkStack]
object GtkStack_autoptr: 
  given _tag: Tag[GtkStack_autoptr] = Tag.Ptr[GtkStack](GtkStack._tag)
  inline def apply(inline o: Ptr[GtkStack]): GtkStack_autoptr = o
  extension (v: GtkStack_autoptr)
    inline def value: Ptr[GtkStack] = v

opaque type GtkStack_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkStack_listautoptr: 
  given _tag: Tag[GtkStack_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkStack_listautoptr = o
  extension (v: GtkStack_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkStack_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkStack_queueautoptr: 
  given _tag: Tag[GtkStack_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkStack_queueautoptr = o
  extension (v: GtkStack_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkStack_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkStack_slistautoptr: 
  given _tag: Tag[GtkStack_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkStack_slistautoptr = o
  extension (v: GtkStack_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkStatusbar_autoptr = Ptr[GtkStatusbar]
object GtkStatusbar_autoptr: 
  given _tag: Tag[GtkStatusbar_autoptr] = Tag.Ptr[GtkStatusbar](GtkStatusbar._tag)
  inline def apply(inline o: Ptr[GtkStatusbar]): GtkStatusbar_autoptr = o
  extension (v: GtkStatusbar_autoptr)
    inline def value: Ptr[GtkStatusbar] = v

opaque type GtkStatusbar_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkStatusbar_listautoptr: 
  given _tag: Tag[GtkStatusbar_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkStatusbar_listautoptr = o
  extension (v: GtkStatusbar_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkStatusbar_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkStatusbar_queueautoptr: 
  given _tag: Tag[GtkStatusbar_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkStatusbar_queueautoptr = o
  extension (v: GtkStatusbar_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkStatusbar_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkStatusbar_slistautoptr: 
  given _tag: Tag[GtkStatusbar_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkStatusbar_slistautoptr = o
  extension (v: GtkStatusbar_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkStringFilterClass_autoptr = Ptr[GtkStringFilterClass]
object GtkStringFilterClass_autoptr: 
  given _tag: Tag[GtkStringFilterClass_autoptr] = Tag.Ptr[GtkStringFilterClass](GtkStringFilterClass._tag)
  inline def apply(inline o: Ptr[GtkStringFilterClass]): GtkStringFilterClass_autoptr = o
  extension (v: GtkStringFilterClass_autoptr)
    inline def value: Ptr[GtkStringFilterClass] = v

opaque type GtkStringFilterClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkStringFilterClass_listautoptr: 
  given _tag: Tag[GtkStringFilterClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkStringFilterClass_listautoptr = o
  extension (v: GtkStringFilterClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkStringFilterClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkStringFilterClass_queueautoptr: 
  given _tag: Tag[GtkStringFilterClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkStringFilterClass_queueautoptr = o
  extension (v: GtkStringFilterClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkStringFilterClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkStringFilterClass_slistautoptr: 
  given _tag: Tag[GtkStringFilterClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkStringFilterClass_slistautoptr = o
  extension (v: GtkStringFilterClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkStringFilter_autoptr = Ptr[GtkStringFilter]
object GtkStringFilter_autoptr: 
  given _tag: Tag[GtkStringFilter_autoptr] = Tag.Ptr[GtkStringFilter](GtkStringFilter._tag)
  inline def apply(inline o: Ptr[GtkStringFilter]): GtkStringFilter_autoptr = o
  extension (v: GtkStringFilter_autoptr)
    inline def value: Ptr[GtkStringFilter] = v

opaque type GtkStringFilter_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkStringFilter_listautoptr: 
  given _tag: Tag[GtkStringFilter_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkStringFilter_listautoptr = o
  extension (v: GtkStringFilter_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkStringFilter_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkStringFilter_queueautoptr: 
  given _tag: Tag[GtkStringFilter_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkStringFilter_queueautoptr = o
  extension (v: GtkStringFilter_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkStringFilter_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkStringFilter_slistautoptr: 
  given _tag: Tag[GtkStringFilter_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkStringFilter_slistautoptr = o
  extension (v: GtkStringFilter_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkStringListClass_autoptr = Ptr[GtkStringListClass]
object GtkStringListClass_autoptr: 
  given _tag: Tag[GtkStringListClass_autoptr] = Tag.Ptr[GtkStringListClass](GtkStringListClass._tag)
  inline def apply(inline o: Ptr[GtkStringListClass]): GtkStringListClass_autoptr = o
  extension (v: GtkStringListClass_autoptr)
    inline def value: Ptr[GtkStringListClass] = v

opaque type GtkStringListClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkStringListClass_listautoptr: 
  given _tag: Tag[GtkStringListClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkStringListClass_listautoptr = o
  extension (v: GtkStringListClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkStringListClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkStringListClass_queueautoptr: 
  given _tag: Tag[GtkStringListClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkStringListClass_queueautoptr = o
  extension (v: GtkStringListClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkStringListClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkStringListClass_slistautoptr: 
  given _tag: Tag[GtkStringListClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkStringListClass_slistautoptr = o
  extension (v: GtkStringListClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkStringList_autoptr = Ptr[GtkStringList]
object GtkStringList_autoptr: 
  given _tag: Tag[GtkStringList_autoptr] = Tag.Ptr[GtkStringList](GtkStringList._tag)
  inline def apply(inline o: Ptr[GtkStringList]): GtkStringList_autoptr = o
  extension (v: GtkStringList_autoptr)
    inline def value: Ptr[GtkStringList] = v

opaque type GtkStringList_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkStringList_listautoptr: 
  given _tag: Tag[GtkStringList_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkStringList_listautoptr = o
  extension (v: GtkStringList_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkStringList_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkStringList_queueautoptr: 
  given _tag: Tag[GtkStringList_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkStringList_queueautoptr = o
  extension (v: GtkStringList_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkStringList_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkStringList_slistautoptr: 
  given _tag: Tag[GtkStringList_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkStringList_slistautoptr = o
  extension (v: GtkStringList_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkStringObjectClass_autoptr = Ptr[GtkStringObjectClass]
object GtkStringObjectClass_autoptr: 
  given _tag: Tag[GtkStringObjectClass_autoptr] = Tag.Ptr[GtkStringObjectClass](GtkStringObjectClass._tag)
  inline def apply(inline o: Ptr[GtkStringObjectClass]): GtkStringObjectClass_autoptr = o
  extension (v: GtkStringObjectClass_autoptr)
    inline def value: Ptr[GtkStringObjectClass] = v

opaque type GtkStringObjectClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkStringObjectClass_listautoptr: 
  given _tag: Tag[GtkStringObjectClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkStringObjectClass_listautoptr = o
  extension (v: GtkStringObjectClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkStringObjectClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkStringObjectClass_queueautoptr: 
  given _tag: Tag[GtkStringObjectClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkStringObjectClass_queueautoptr = o
  extension (v: GtkStringObjectClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkStringObjectClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkStringObjectClass_slistautoptr: 
  given _tag: Tag[GtkStringObjectClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkStringObjectClass_slistautoptr = o
  extension (v: GtkStringObjectClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkStringObject_autoptr = Ptr[GtkStringObject]
object GtkStringObject_autoptr: 
  given _tag: Tag[GtkStringObject_autoptr] = Tag.Ptr[GtkStringObject](GtkStringObject._tag)
  inline def apply(inline o: Ptr[GtkStringObject]): GtkStringObject_autoptr = o
  extension (v: GtkStringObject_autoptr)
    inline def value: Ptr[GtkStringObject] = v

opaque type GtkStringObject_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkStringObject_listautoptr: 
  given _tag: Tag[GtkStringObject_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkStringObject_listautoptr = o
  extension (v: GtkStringObject_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkStringObject_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkStringObject_queueautoptr: 
  given _tag: Tag[GtkStringObject_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkStringObject_queueautoptr = o
  extension (v: GtkStringObject_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkStringObject_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkStringObject_slistautoptr: 
  given _tag: Tag[GtkStringObject_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkStringObject_slistautoptr = o
  extension (v: GtkStringObject_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkStringSorterClass_autoptr = Ptr[GtkStringSorterClass]
object GtkStringSorterClass_autoptr: 
  given _tag: Tag[GtkStringSorterClass_autoptr] = Tag.Ptr[GtkStringSorterClass](GtkStringSorterClass._tag)
  inline def apply(inline o: Ptr[GtkStringSorterClass]): GtkStringSorterClass_autoptr = o
  extension (v: GtkStringSorterClass_autoptr)
    inline def value: Ptr[GtkStringSorterClass] = v

opaque type GtkStringSorterClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkStringSorterClass_listautoptr: 
  given _tag: Tag[GtkStringSorterClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkStringSorterClass_listautoptr = o
  extension (v: GtkStringSorterClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkStringSorterClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkStringSorterClass_queueautoptr: 
  given _tag: Tag[GtkStringSorterClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkStringSorterClass_queueautoptr = o
  extension (v: GtkStringSorterClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkStringSorterClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkStringSorterClass_slistautoptr: 
  given _tag: Tag[GtkStringSorterClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkStringSorterClass_slistautoptr = o
  extension (v: GtkStringSorterClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkStringSorter_autoptr = Ptr[GtkStringSorter]
object GtkStringSorter_autoptr: 
  given _tag: Tag[GtkStringSorter_autoptr] = Tag.Ptr[GtkStringSorter](GtkStringSorter._tag)
  inline def apply(inline o: Ptr[GtkStringSorter]): GtkStringSorter_autoptr = o
  extension (v: GtkStringSorter_autoptr)
    inline def value: Ptr[GtkStringSorter] = v

opaque type GtkStringSorter_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkStringSorter_listautoptr: 
  given _tag: Tag[GtkStringSorter_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkStringSorter_listautoptr = o
  extension (v: GtkStringSorter_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkStringSorter_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkStringSorter_queueautoptr: 
  given _tag: Tag[GtkStringSorter_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkStringSorter_queueautoptr = o
  extension (v: GtkStringSorter_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkStringSorter_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkStringSorter_slistautoptr: 
  given _tag: Tag[GtkStringSorter_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkStringSorter_slistautoptr = o
  extension (v: GtkStringSorter_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkStyleContext_autoptr = Ptr[GtkStyleContext]
object GtkStyleContext_autoptr: 
  given _tag: Tag[GtkStyleContext_autoptr] = Tag.Ptr[GtkStyleContext](GtkStyleContext._tag)
  inline def apply(inline o: Ptr[GtkStyleContext]): GtkStyleContext_autoptr = o
  extension (v: GtkStyleContext_autoptr)
    inline def value: Ptr[GtkStyleContext] = v

opaque type GtkStyleContext_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkStyleContext_listautoptr: 
  given _tag: Tag[GtkStyleContext_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkStyleContext_listautoptr = o
  extension (v: GtkStyleContext_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkStyleContext_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkStyleContext_queueautoptr: 
  given _tag: Tag[GtkStyleContext_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkStyleContext_queueautoptr = o
  extension (v: GtkStyleContext_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkStyleContext_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkStyleContext_slistautoptr: 
  given _tag: Tag[GtkStyleContext_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkStyleContext_slistautoptr = o
  extension (v: GtkStyleContext_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkStyleProvider_autoptr = Ptr[GtkStyleProvider]
object GtkStyleProvider_autoptr: 
  given _tag: Tag[GtkStyleProvider_autoptr] = Tag.Ptr[GtkStyleProvider](GtkStyleProvider._tag)
  inline def apply(inline o: Ptr[GtkStyleProvider]): GtkStyleProvider_autoptr = o
  extension (v: GtkStyleProvider_autoptr)
    inline def value: Ptr[GtkStyleProvider] = v

opaque type GtkStyleProvider_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkStyleProvider_listautoptr: 
  given _tag: Tag[GtkStyleProvider_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkStyleProvider_listautoptr = o
  extension (v: GtkStyleProvider_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkStyleProvider_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkStyleProvider_queueautoptr: 
  given _tag: Tag[GtkStyleProvider_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkStyleProvider_queueautoptr = o
  extension (v: GtkStyleProvider_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkStyleProvider_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkStyleProvider_slistautoptr: 
  given _tag: Tag[GtkStyleProvider_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkStyleProvider_slistautoptr = o
  extension (v: GtkStyleProvider_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkSwitch_autoptr = Ptr[GtkSwitch]
object GtkSwitch_autoptr: 
  given _tag: Tag[GtkSwitch_autoptr] = Tag.Ptr[GtkSwitch](GtkSwitch._tag)
  inline def apply(inline o: Ptr[GtkSwitch]): GtkSwitch_autoptr = o
  extension (v: GtkSwitch_autoptr)
    inline def value: Ptr[GtkSwitch] = v

opaque type GtkSwitch_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkSwitch_listautoptr: 
  given _tag: Tag[GtkSwitch_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkSwitch_listautoptr = o
  extension (v: GtkSwitch_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkSwitch_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkSwitch_queueautoptr: 
  given _tag: Tag[GtkSwitch_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkSwitch_queueautoptr = o
  extension (v: GtkSwitch_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkSwitch_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkSwitch_slistautoptr: 
  given _tag: Tag[GtkSwitch_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkSwitch_slistautoptr = o
  extension (v: GtkSwitch_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkSymbolicPaintable_autoptr = Ptr[GtkSymbolicPaintable]
object GtkSymbolicPaintable_autoptr: 
  given _tag: Tag[GtkSymbolicPaintable_autoptr] = Tag.Ptr[GtkSymbolicPaintable](GtkSymbolicPaintable._tag)
  inline def apply(inline o: Ptr[GtkSymbolicPaintable]): GtkSymbolicPaintable_autoptr = o
  extension (v: GtkSymbolicPaintable_autoptr)
    inline def value: Ptr[GtkSymbolicPaintable] = v

opaque type GtkSymbolicPaintable_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkSymbolicPaintable_listautoptr: 
  given _tag: Tag[GtkSymbolicPaintable_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkSymbolicPaintable_listautoptr = o
  extension (v: GtkSymbolicPaintable_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkSymbolicPaintable_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkSymbolicPaintable_queueautoptr: 
  given _tag: Tag[GtkSymbolicPaintable_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkSymbolicPaintable_queueautoptr = o
  extension (v: GtkSymbolicPaintable_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkSymbolicPaintable_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkSymbolicPaintable_slistautoptr: 
  given _tag: Tag[GtkSymbolicPaintable_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkSymbolicPaintable_slistautoptr = o
  extension (v: GtkSymbolicPaintable_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkTextBuffer_autoptr = Ptr[GtkTextBuffer]
object GtkTextBuffer_autoptr: 
  given _tag: Tag[GtkTextBuffer_autoptr] = Tag.Ptr[GtkTextBuffer](GtkTextBuffer._tag)
  inline def apply(inline o: Ptr[GtkTextBuffer]): GtkTextBuffer_autoptr = o
  extension (v: GtkTextBuffer_autoptr)
    inline def value: Ptr[GtkTextBuffer] = v

opaque type GtkTextBuffer_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkTextBuffer_listautoptr: 
  given _tag: Tag[GtkTextBuffer_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkTextBuffer_listautoptr = o
  extension (v: GtkTextBuffer_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkTextBuffer_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkTextBuffer_queueautoptr: 
  given _tag: Tag[GtkTextBuffer_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkTextBuffer_queueautoptr = o
  extension (v: GtkTextBuffer_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkTextBuffer_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkTextBuffer_slistautoptr: 
  given _tag: Tag[GtkTextBuffer_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkTextBuffer_slistautoptr = o
  extension (v: GtkTextBuffer_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkTextCharPredicate: : a Unicode code point _data: data passed to the callback
*/
opaque type GtkTextCharPredicate = CFuncPtr2[_root_.sn.gnome.glib.internal.gunichar, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GtkTextCharPredicate: 
  given _tag: Tag[GtkTextCharPredicate] = Tag.materializeCFuncPtr2[_root_.sn.gnome.glib.internal.gunichar, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkTextCharPredicate = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[_root_.sn.gnome.glib.internal.gunichar, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GtkTextCharPredicate = o
  extension (v: GtkTextCharPredicate)
    inline def value: CFuncPtr2[_root_.sn.gnome.glib.internal.gunichar, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkTextChildAnchor_autoptr = Ptr[GtkTextChildAnchor]
object GtkTextChildAnchor_autoptr: 
  given _tag: Tag[GtkTextChildAnchor_autoptr] = Tag.Ptr[GtkTextChildAnchor](GtkTextChildAnchor._tag)
  inline def apply(inline o: Ptr[GtkTextChildAnchor]): GtkTextChildAnchor_autoptr = o
  extension (v: GtkTextChildAnchor_autoptr)
    inline def value: Ptr[GtkTextChildAnchor] = v

opaque type GtkTextChildAnchor_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkTextChildAnchor_listautoptr: 
  given _tag: Tag[GtkTextChildAnchor_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkTextChildAnchor_listautoptr = o
  extension (v: GtkTextChildAnchor_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkTextChildAnchor_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkTextChildAnchor_queueautoptr: 
  given _tag: Tag[GtkTextChildAnchor_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkTextChildAnchor_queueautoptr = o
  extension (v: GtkTextChildAnchor_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkTextChildAnchor_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkTextChildAnchor_slistautoptr: 
  given _tag: Tag[GtkTextChildAnchor_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkTextChildAnchor_slistautoptr = o
  extension (v: GtkTextChildAnchor_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkTextIter_autoptr = Ptr[GtkTextIter]
object GtkTextIter_autoptr: 
  given _tag: Tag[GtkTextIter_autoptr] = Tag.Ptr[GtkTextIter](GtkTextIter._tag)
  inline def apply(inline o: Ptr[GtkTextIter]): GtkTextIter_autoptr = o
  extension (v: GtkTextIter_autoptr)
    inline def value: Ptr[GtkTextIter] = v

opaque type GtkTextIter_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkTextIter_listautoptr: 
  given _tag: Tag[GtkTextIter_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkTextIter_listautoptr = o
  extension (v: GtkTextIter_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkTextIter_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkTextIter_queueautoptr: 
  given _tag: Tag[GtkTextIter_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkTextIter_queueautoptr = o
  extension (v: GtkTextIter_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkTextIter_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkTextIter_slistautoptr: 
  given _tag: Tag[GtkTextIter_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkTextIter_slistautoptr = o
  extension (v: GtkTextIter_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkTextMark_autoptr = Ptr[GtkTextMark]
object GtkTextMark_autoptr: 
  given _tag: Tag[GtkTextMark_autoptr] = Tag.Ptr[GtkTextMark](GtkTextMark._tag)
  inline def apply(inline o: Ptr[GtkTextMark]): GtkTextMark_autoptr = o
  extension (v: GtkTextMark_autoptr)
    inline def value: Ptr[GtkTextMark] = v

opaque type GtkTextMark_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkTextMark_listautoptr: 
  given _tag: Tag[GtkTextMark_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkTextMark_listautoptr = o
  extension (v: GtkTextMark_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkTextMark_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkTextMark_queueautoptr: 
  given _tag: Tag[GtkTextMark_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkTextMark_queueautoptr = o
  extension (v: GtkTextMark_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkTextMark_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkTextMark_slistautoptr: 
  given _tag: Tag[GtkTextMark_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkTextMark_slistautoptr = o
  extension (v: GtkTextMark_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkTextTagTableForeach: : the `GtkTextTag`
*/
opaque type GtkTextTagTableForeach = CFuncPtr2[Ptr[GtkTextTag], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GtkTextTagTableForeach: 
  given _tag: Tag[GtkTextTagTableForeach] = Tag.materializeCFuncPtr2[Ptr[GtkTextTag], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkTextTagTableForeach = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GtkTextTag], _root_.sn.gnome.glib.internal.gpointer, Unit]): GtkTextTagTableForeach = o
  extension (v: GtkTextTagTableForeach)
    inline def value: CFuncPtr2[Ptr[GtkTextTag], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkTextTagTable_autoptr = Ptr[GtkTextTagTable]
object GtkTextTagTable_autoptr: 
  given _tag: Tag[GtkTextTagTable_autoptr] = Tag.Ptr[GtkTextTagTable](GtkTextTagTable._tag)
  inline def apply(inline o: Ptr[GtkTextTagTable]): GtkTextTagTable_autoptr = o
  extension (v: GtkTextTagTable_autoptr)
    inline def value: Ptr[GtkTextTagTable] = v

opaque type GtkTextTagTable_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkTextTagTable_listautoptr: 
  given _tag: Tag[GtkTextTagTable_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkTextTagTable_listautoptr = o
  extension (v: GtkTextTagTable_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkTextTagTable_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkTextTagTable_queueautoptr: 
  given _tag: Tag[GtkTextTagTable_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkTextTagTable_queueautoptr = o
  extension (v: GtkTextTagTable_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkTextTagTable_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkTextTagTable_slistautoptr: 
  given _tag: Tag[GtkTextTagTable_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkTextTagTable_slistautoptr = o
  extension (v: GtkTextTagTable_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkTextTag_autoptr = Ptr[GtkTextTag]
object GtkTextTag_autoptr: 
  given _tag: Tag[GtkTextTag_autoptr] = Tag.Ptr[GtkTextTag](GtkTextTag._tag)
  inline def apply(inline o: Ptr[GtkTextTag]): GtkTextTag_autoptr = o
  extension (v: GtkTextTag_autoptr)
    inline def value: Ptr[GtkTextTag] = v

opaque type GtkTextTag_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkTextTag_listautoptr: 
  given _tag: Tag[GtkTextTag_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkTextTag_listautoptr = o
  extension (v: GtkTextTag_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkTextTag_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkTextTag_queueautoptr: 
  given _tag: Tag[GtkTextTag_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkTextTag_queueautoptr = o
  extension (v: GtkTextTag_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkTextTag_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkTextTag_slistautoptr: 
  given _tag: Tag[GtkTextTag_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkTextTag_slistautoptr = o
  extension (v: GtkTextTag_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkTextView_autoptr = Ptr[GtkTextView]
object GtkTextView_autoptr: 
  given _tag: Tag[GtkTextView_autoptr] = Tag.Ptr[GtkTextView](GtkTextView._tag)
  inline def apply(inline o: Ptr[GtkTextView]): GtkTextView_autoptr = o
  extension (v: GtkTextView_autoptr)
    inline def value: Ptr[GtkTextView] = v

opaque type GtkTextView_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkTextView_listautoptr: 
  given _tag: Tag[GtkTextView_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkTextView_listautoptr = o
  extension (v: GtkTextView_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkTextView_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkTextView_queueautoptr: 
  given _tag: Tag[GtkTextView_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkTextView_queueautoptr = o
  extension (v: GtkTextView_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkTextView_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkTextView_slistautoptr: 
  given _tag: Tag[GtkTextView_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkTextView_slistautoptr = o
  extension (v: GtkTextView_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkTickCallback: : the widget _clock: the frame clock for the widget (same as calling gtk_widget_get_frame_clock()) _data: user data passed to gtk_widget_add_tick_callback().
*/
opaque type GtkTickCallback = CFuncPtr3[Ptr[GtkWidget], Ptr[GdkFrameClock], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GtkTickCallback: 
  given _tag: Tag[GtkTickCallback] = Tag.materializeCFuncPtr3[Ptr[GtkWidget], Ptr[GdkFrameClock], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkTickCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GtkWidget], Ptr[GdkFrameClock], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GtkTickCallback = o
  extension (v: GtkTickCallback)
    inline def value: CFuncPtr3[Ptr[GtkWidget], Ptr[GdkFrameClock], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkToggleButton_autoptr = Ptr[GtkToggleButton]
object GtkToggleButton_autoptr: 
  given _tag: Tag[GtkToggleButton_autoptr] = Tag.Ptr[GtkToggleButton](GtkToggleButton._tag)
  inline def apply(inline o: Ptr[GtkToggleButton]): GtkToggleButton_autoptr = o
  extension (v: GtkToggleButton_autoptr)
    inline def value: Ptr[GtkToggleButton] = v

opaque type GtkToggleButton_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkToggleButton_listautoptr: 
  given _tag: Tag[GtkToggleButton_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkToggleButton_listautoptr = o
  extension (v: GtkToggleButton_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkToggleButton_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkToggleButton_queueautoptr: 
  given _tag: Tag[GtkToggleButton_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkToggleButton_queueautoptr = o
  extension (v: GtkToggleButton_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkToggleButton_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkToggleButton_slistautoptr: 
  given _tag: Tag[GtkToggleButton_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkToggleButton_slistautoptr = o
  extension (v: GtkToggleButton_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkTooltip_autoptr = Ptr[GtkTooltip]
object GtkTooltip_autoptr: 
  given _tag: Tag[GtkTooltip_autoptr] = Tag.Ptr[GtkTooltip](GtkTooltip._tag)
  inline def apply(inline o: Ptr[GtkTooltip]): GtkTooltip_autoptr = o
  extension (v: GtkTooltip_autoptr)
    inline def value: Ptr[GtkTooltip] = v

opaque type GtkTooltip_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkTooltip_listautoptr: 
  given _tag: Tag[GtkTooltip_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkTooltip_listautoptr = o
  extension (v: GtkTooltip_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkTooltip_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkTooltip_queueautoptr: 
  given _tag: Tag[GtkTooltip_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkTooltip_queueautoptr = o
  extension (v: GtkTooltip_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkTooltip_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkTooltip_slistautoptr: 
  given _tag: Tag[GtkTooltip_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkTooltip_slistautoptr = o
  extension (v: GtkTooltip_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkTreeCellDataFunc: _column: A `GtkTreeViewColumn` : The `GtkCellRenderer` that is being rendered by _column _model: The `GtkTreeModel` being rendered : A `GtkTreeIter` of the current row rendered
*/
opaque type GtkTreeCellDataFunc = CFuncPtr5[Ptr[GtkTreeViewColumn], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GtkTreeCellDataFunc: 
  given _tag: Tag[GtkTreeCellDataFunc] = Tag.materializeCFuncPtr5[Ptr[GtkTreeViewColumn], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkTreeCellDataFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[Ptr[GtkTreeViewColumn], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, Unit]): GtkTreeCellDataFunc = o
  extension (v: GtkTreeCellDataFunc)
    inline def value: CFuncPtr5[Ptr[GtkTreeViewColumn], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkTreeDragDest_autoptr = Ptr[GtkTreeDragDest]
object GtkTreeDragDest_autoptr: 
  given _tag: Tag[GtkTreeDragDest_autoptr] = Tag.Ptr[GtkTreeDragDest](GtkTreeDragDest._tag)
  inline def apply(inline o: Ptr[GtkTreeDragDest]): GtkTreeDragDest_autoptr = o
  extension (v: GtkTreeDragDest_autoptr)
    inline def value: Ptr[GtkTreeDragDest] = v

opaque type GtkTreeDragDest_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkTreeDragDest_listautoptr: 
  given _tag: Tag[GtkTreeDragDest_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkTreeDragDest_listautoptr = o
  extension (v: GtkTreeDragDest_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkTreeDragDest_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkTreeDragDest_queueautoptr: 
  given _tag: Tag[GtkTreeDragDest_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkTreeDragDest_queueautoptr = o
  extension (v: GtkTreeDragDest_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkTreeDragDest_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkTreeDragDest_slistautoptr: 
  given _tag: Tag[GtkTreeDragDest_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkTreeDragDest_slistautoptr = o
  extension (v: GtkTreeDragDest_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkTreeDragSource_autoptr = Ptr[GtkTreeDragSource]
object GtkTreeDragSource_autoptr: 
  given _tag: Tag[GtkTreeDragSource_autoptr] = Tag.Ptr[GtkTreeDragSource](GtkTreeDragSource._tag)
  inline def apply(inline o: Ptr[GtkTreeDragSource]): GtkTreeDragSource_autoptr = o
  extension (v: GtkTreeDragSource_autoptr)
    inline def value: Ptr[GtkTreeDragSource] = v

opaque type GtkTreeDragSource_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkTreeDragSource_listautoptr: 
  given _tag: Tag[GtkTreeDragSource_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkTreeDragSource_listautoptr = o
  extension (v: GtkTreeDragSource_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkTreeDragSource_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkTreeDragSource_queueautoptr: 
  given _tag: Tag[GtkTreeDragSource_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkTreeDragSource_queueautoptr = o
  extension (v: GtkTreeDragSource_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkTreeDragSource_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkTreeDragSource_slistautoptr: 
  given _tag: Tag[GtkTreeDragSource_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkTreeDragSource_slistautoptr = o
  extension (v: GtkTreeDragSource_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkTreeExpanderClass_autoptr = Ptr[GtkTreeExpanderClass]
object GtkTreeExpanderClass_autoptr: 
  given _tag: Tag[GtkTreeExpanderClass_autoptr] = Tag.Ptr[GtkTreeExpanderClass](GtkTreeExpanderClass._tag)
  inline def apply(inline o: Ptr[GtkTreeExpanderClass]): GtkTreeExpanderClass_autoptr = o
  extension (v: GtkTreeExpanderClass_autoptr)
    inline def value: Ptr[GtkTreeExpanderClass] = v

opaque type GtkTreeExpanderClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkTreeExpanderClass_listautoptr: 
  given _tag: Tag[GtkTreeExpanderClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkTreeExpanderClass_listautoptr = o
  extension (v: GtkTreeExpanderClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkTreeExpanderClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkTreeExpanderClass_queueautoptr: 
  given _tag: Tag[GtkTreeExpanderClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkTreeExpanderClass_queueautoptr = o
  extension (v: GtkTreeExpanderClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkTreeExpanderClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkTreeExpanderClass_slistautoptr: 
  given _tag: Tag[GtkTreeExpanderClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkTreeExpanderClass_slistautoptr = o
  extension (v: GtkTreeExpanderClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkTreeExpander_autoptr = Ptr[GtkTreeExpander]
object GtkTreeExpander_autoptr: 
  given _tag: Tag[GtkTreeExpander_autoptr] = Tag.Ptr[GtkTreeExpander](GtkTreeExpander._tag)
  inline def apply(inline o: Ptr[GtkTreeExpander]): GtkTreeExpander_autoptr = o
  extension (v: GtkTreeExpander_autoptr)
    inline def value: Ptr[GtkTreeExpander] = v

opaque type GtkTreeExpander_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkTreeExpander_listautoptr: 
  given _tag: Tag[GtkTreeExpander_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkTreeExpander_listautoptr = o
  extension (v: GtkTreeExpander_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkTreeExpander_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkTreeExpander_queueautoptr: 
  given _tag: Tag[GtkTreeExpander_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkTreeExpander_queueautoptr = o
  extension (v: GtkTreeExpander_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkTreeExpander_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkTreeExpander_slistautoptr: 
  given _tag: Tag[GtkTreeExpander_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkTreeExpander_slistautoptr = o
  extension (v: GtkTreeExpander_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkTreeIterCompareFunc: : The `GtkTreeModel` the comparison is within : A `GtkTreeIter` in : Another `GtkTreeIter` in _data: Data passed when the compare func is assigned e.g. by gtk_tree_sortable_set_sort_func()
*/
opaque type GtkTreeIterCompareFunc = CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, CInt]
object GtkTreeIterCompareFunc: 
  given _tag: Tag[GtkTreeIterCompareFunc] = Tag.materializeCFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, CInt]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkTreeIterCompareFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, CInt]): GtkTreeIterCompareFunc = o
  extension (v: GtkTreeIterCompareFunc)
    inline def value: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, CInt] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkTreeIter_autoptr = Ptr[GtkTreeIter]
object GtkTreeIter_autoptr: 
  given _tag: Tag[GtkTreeIter_autoptr] = Tag.Ptr[GtkTreeIter](GtkTreeIter._tag)
  inline def apply(inline o: Ptr[GtkTreeIter]): GtkTreeIter_autoptr = o
  extension (v: GtkTreeIter_autoptr)
    inline def value: Ptr[GtkTreeIter] = v

opaque type GtkTreeIter_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkTreeIter_listautoptr: 
  given _tag: Tag[GtkTreeIter_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkTreeIter_listautoptr = o
  extension (v: GtkTreeIter_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkTreeIter_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkTreeIter_queueautoptr: 
  given _tag: Tag[GtkTreeIter_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkTreeIter_queueautoptr = o
  extension (v: GtkTreeIter_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkTreeIter_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkTreeIter_slistautoptr: 
  given _tag: Tag[GtkTreeIter_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkTreeIter_slistautoptr = o
  extension (v: GtkTreeIter_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkTreeListModelClass_autoptr = Ptr[GtkTreeListModelClass]
object GtkTreeListModelClass_autoptr: 
  given _tag: Tag[GtkTreeListModelClass_autoptr] = Tag.Ptr[GtkTreeListModelClass](GtkTreeListModelClass._tag)
  inline def apply(inline o: Ptr[GtkTreeListModelClass]): GtkTreeListModelClass_autoptr = o
  extension (v: GtkTreeListModelClass_autoptr)
    inline def value: Ptr[GtkTreeListModelClass] = v

opaque type GtkTreeListModelClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkTreeListModelClass_listautoptr: 
  given _tag: Tag[GtkTreeListModelClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkTreeListModelClass_listautoptr = o
  extension (v: GtkTreeListModelClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkTreeListModelClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkTreeListModelClass_queueautoptr: 
  given _tag: Tag[GtkTreeListModelClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkTreeListModelClass_queueautoptr = o
  extension (v: GtkTreeListModelClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkTreeListModelClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkTreeListModelClass_slistautoptr: 
  given _tag: Tag[GtkTreeListModelClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkTreeListModelClass_slistautoptr = o
  extension (v: GtkTreeListModelClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkTreeListModelCreateModelFunc: : (type GObject): The item that is being expanded _data: User data passed when registering the function
*/
opaque type GtkTreeListModelCreateModelFunc = CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[_root_.sn.gnome.gio.internal.GListModel]]
object GtkTreeListModelCreateModelFunc: 
  given _tag: Tag[GtkTreeListModelCreateModelFunc] = Tag.materializeCFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[_root_.sn.gnome.gio.internal.GListModel]]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkTreeListModelCreateModelFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[_root_.sn.gnome.gio.internal.GListModel]]): GtkTreeListModelCreateModelFunc = o
  extension (v: GtkTreeListModelCreateModelFunc)
    inline def value: CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[_root_.sn.gnome.gio.internal.GListModel]] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkTreeListModel_autoptr = Ptr[GtkTreeListModel]
object GtkTreeListModel_autoptr: 
  given _tag: Tag[GtkTreeListModel_autoptr] = Tag.Ptr[GtkTreeListModel](GtkTreeListModel._tag)
  inline def apply(inline o: Ptr[GtkTreeListModel]): GtkTreeListModel_autoptr = o
  extension (v: GtkTreeListModel_autoptr)
    inline def value: Ptr[GtkTreeListModel] = v

opaque type GtkTreeListModel_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkTreeListModel_listautoptr: 
  given _tag: Tag[GtkTreeListModel_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkTreeListModel_listautoptr = o
  extension (v: GtkTreeListModel_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkTreeListModel_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkTreeListModel_queueautoptr: 
  given _tag: Tag[GtkTreeListModel_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkTreeListModel_queueautoptr = o
  extension (v: GtkTreeListModel_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkTreeListModel_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkTreeListModel_slistautoptr: 
  given _tag: Tag[GtkTreeListModel_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkTreeListModel_slistautoptr = o
  extension (v: GtkTreeListModel_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkTreeListRowClass_autoptr = Ptr[GtkTreeListRowClass]
object GtkTreeListRowClass_autoptr: 
  given _tag: Tag[GtkTreeListRowClass_autoptr] = Tag.Ptr[GtkTreeListRowClass](GtkTreeListRowClass._tag)
  inline def apply(inline o: Ptr[GtkTreeListRowClass]): GtkTreeListRowClass_autoptr = o
  extension (v: GtkTreeListRowClass_autoptr)
    inline def value: Ptr[GtkTreeListRowClass] = v

opaque type GtkTreeListRowClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkTreeListRowClass_listautoptr: 
  given _tag: Tag[GtkTreeListRowClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkTreeListRowClass_listautoptr = o
  extension (v: GtkTreeListRowClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkTreeListRowClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkTreeListRowClass_queueautoptr: 
  given _tag: Tag[GtkTreeListRowClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkTreeListRowClass_queueautoptr = o
  extension (v: GtkTreeListRowClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkTreeListRowClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkTreeListRowClass_slistautoptr: 
  given _tag: Tag[GtkTreeListRowClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkTreeListRowClass_slistautoptr = o
  extension (v: GtkTreeListRowClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkTreeListRowSorterClass_autoptr = Ptr[GtkTreeListRowSorterClass]
object GtkTreeListRowSorterClass_autoptr: 
  given _tag: Tag[GtkTreeListRowSorterClass_autoptr] = Tag.Ptr[GtkTreeListRowSorterClass](GtkTreeListRowSorterClass._tag)
  inline def apply(inline o: Ptr[GtkTreeListRowSorterClass]): GtkTreeListRowSorterClass_autoptr = o
  extension (v: GtkTreeListRowSorterClass_autoptr)
    inline def value: Ptr[GtkTreeListRowSorterClass] = v

opaque type GtkTreeListRowSorterClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkTreeListRowSorterClass_listautoptr: 
  given _tag: Tag[GtkTreeListRowSorterClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkTreeListRowSorterClass_listautoptr = o
  extension (v: GtkTreeListRowSorterClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkTreeListRowSorterClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkTreeListRowSorterClass_queueautoptr: 
  given _tag: Tag[GtkTreeListRowSorterClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkTreeListRowSorterClass_queueautoptr = o
  extension (v: GtkTreeListRowSorterClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkTreeListRowSorterClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkTreeListRowSorterClass_slistautoptr: 
  given _tag: Tag[GtkTreeListRowSorterClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkTreeListRowSorterClass_slistautoptr = o
  extension (v: GtkTreeListRowSorterClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkTreeListRowSorter_autoptr = Ptr[GtkTreeListRowSorter]
object GtkTreeListRowSorter_autoptr: 
  given _tag: Tag[GtkTreeListRowSorter_autoptr] = Tag.Ptr[GtkTreeListRowSorter](GtkTreeListRowSorter._tag)
  inline def apply(inline o: Ptr[GtkTreeListRowSorter]): GtkTreeListRowSorter_autoptr = o
  extension (v: GtkTreeListRowSorter_autoptr)
    inline def value: Ptr[GtkTreeListRowSorter] = v

opaque type GtkTreeListRowSorter_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkTreeListRowSorter_listautoptr: 
  given _tag: Tag[GtkTreeListRowSorter_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkTreeListRowSorter_listautoptr = o
  extension (v: GtkTreeListRowSorter_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkTreeListRowSorter_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkTreeListRowSorter_queueautoptr: 
  given _tag: Tag[GtkTreeListRowSorter_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkTreeListRowSorter_queueautoptr = o
  extension (v: GtkTreeListRowSorter_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkTreeListRowSorter_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkTreeListRowSorter_slistautoptr: 
  given _tag: Tag[GtkTreeListRowSorter_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkTreeListRowSorter_slistautoptr = o
  extension (v: GtkTreeListRowSorter_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkTreeListRow_autoptr = Ptr[GtkTreeListRow]
object GtkTreeListRow_autoptr: 
  given _tag: Tag[GtkTreeListRow_autoptr] = Tag.Ptr[GtkTreeListRow](GtkTreeListRow._tag)
  inline def apply(inline o: Ptr[GtkTreeListRow]): GtkTreeListRow_autoptr = o
  extension (v: GtkTreeListRow_autoptr)
    inline def value: Ptr[GtkTreeListRow] = v

opaque type GtkTreeListRow_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkTreeListRow_listautoptr: 
  given _tag: Tag[GtkTreeListRow_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkTreeListRow_listautoptr = o
  extension (v: GtkTreeListRow_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkTreeListRow_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkTreeListRow_queueautoptr: 
  given _tag: Tag[GtkTreeListRow_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkTreeListRow_queueautoptr = o
  extension (v: GtkTreeListRow_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkTreeListRow_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkTreeListRow_slistautoptr: 
  given _tag: Tag[GtkTreeListRow_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkTreeListRow_slistautoptr = o
  extension (v: GtkTreeListRow_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkTreeModelFilterModifyFunc: : the `GtkTreeModelFilter` : a `GtkTreeIter` pointing to the row whose display values are determined : (out caller-allocates): A `GValue` which is already initialized for with the correct type for the column . : the column whose display value is determined
*/
opaque type GtkTreeModelFilterModifyFunc = CFuncPtr5[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[_root_.sn.gnome.gobject.internal.GValue], CInt, _root_.sn.gnome.glib.internal.gpointer, Unit]
object GtkTreeModelFilterModifyFunc: 
  given _tag: Tag[GtkTreeModelFilterModifyFunc] = Tag.materializeCFuncPtr5[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[_root_.sn.gnome.gobject.internal.GValue], CInt, _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkTreeModelFilterModifyFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[_root_.sn.gnome.gobject.internal.GValue], CInt, _root_.sn.gnome.glib.internal.gpointer, Unit]): GtkTreeModelFilterModifyFunc = o
  extension (v: GtkTreeModelFilterModifyFunc)
    inline def value: CFuncPtr5[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[_root_.sn.gnome.gobject.internal.GValue], CInt, _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * GtkTreeModelFilterVisibleFunc: : the child model of the `GtkTreeModelFilter` : a `GtkTreeIter` pointing to the row in whose visibility is determined
*/
opaque type GtkTreeModelFilterVisibleFunc = CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GtkTreeModelFilterVisibleFunc: 
  given _tag: Tag[GtkTreeModelFilterVisibleFunc] = Tag.materializeCFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkTreeModelFilterVisibleFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GtkTreeModelFilterVisibleFunc = o
  extension (v: GtkTreeModelFilterVisibleFunc)
    inline def value: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkTreeModelFilter_autoptr = Ptr[GtkTreeModelFilter]
object GtkTreeModelFilter_autoptr: 
  given _tag: Tag[GtkTreeModelFilter_autoptr] = Tag.Ptr[GtkTreeModelFilter](GtkTreeModelFilter._tag)
  inline def apply(inline o: Ptr[GtkTreeModelFilter]): GtkTreeModelFilter_autoptr = o
  extension (v: GtkTreeModelFilter_autoptr)
    inline def value: Ptr[GtkTreeModelFilter] = v

opaque type GtkTreeModelFilter_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkTreeModelFilter_listautoptr: 
  given _tag: Tag[GtkTreeModelFilter_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkTreeModelFilter_listautoptr = o
  extension (v: GtkTreeModelFilter_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkTreeModelFilter_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkTreeModelFilter_queueautoptr: 
  given _tag: Tag[GtkTreeModelFilter_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkTreeModelFilter_queueautoptr = o
  extension (v: GtkTreeModelFilter_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkTreeModelFilter_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkTreeModelFilter_slistautoptr: 
  given _tag: Tag[GtkTreeModelFilter_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkTreeModelFilter_slistautoptr = o
  extension (v: GtkTreeModelFilter_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkTreeModelForeachFunc: : the `GtkTreeModel` being iterated : the current `GtkTreePath` : the current `GtkTreeIter`
*/
opaque type GtkTreeModelForeachFunc = CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GtkTreeModelForeachFunc: 
  given _tag: Tag[GtkTreeModelForeachFunc] = Tag.materializeCFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkTreeModelForeachFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GtkTreeModelForeachFunc = o
  extension (v: GtkTreeModelForeachFunc)
    inline def value: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkTreeModelSort_autoptr = Ptr[GtkTreeModelSort]
object GtkTreeModelSort_autoptr: 
  given _tag: Tag[GtkTreeModelSort_autoptr] = Tag.Ptr[GtkTreeModelSort](GtkTreeModelSort._tag)
  inline def apply(inline o: Ptr[GtkTreeModelSort]): GtkTreeModelSort_autoptr = o
  extension (v: GtkTreeModelSort_autoptr)
    inline def value: Ptr[GtkTreeModelSort] = v

opaque type GtkTreeModelSort_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkTreeModelSort_listautoptr: 
  given _tag: Tag[GtkTreeModelSort_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkTreeModelSort_listautoptr = o
  extension (v: GtkTreeModelSort_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkTreeModelSort_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkTreeModelSort_queueautoptr: 
  given _tag: Tag[GtkTreeModelSort_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkTreeModelSort_queueautoptr = o
  extension (v: GtkTreeModelSort_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkTreeModelSort_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkTreeModelSort_slistautoptr: 
  given _tag: Tag[GtkTreeModelSort_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkTreeModelSort_slistautoptr = o
  extension (v: GtkTreeModelSort_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkTreeModel_autoptr = Ptr[GtkTreeModel]
object GtkTreeModel_autoptr: 
  given _tag: Tag[GtkTreeModel_autoptr] = Tag.Ptr[GtkTreeModel](GtkTreeModel._tag)
  inline def apply(inline o: Ptr[GtkTreeModel]): GtkTreeModel_autoptr = o
  extension (v: GtkTreeModel_autoptr)
    inline def value: Ptr[GtkTreeModel] = v

opaque type GtkTreeModel_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkTreeModel_listautoptr: 
  given _tag: Tag[GtkTreeModel_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkTreeModel_listautoptr = o
  extension (v: GtkTreeModel_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkTreeModel_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkTreeModel_queueautoptr: 
  given _tag: Tag[GtkTreeModel_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkTreeModel_queueautoptr = o
  extension (v: GtkTreeModel_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkTreeModel_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkTreeModel_slistautoptr: 
  given _tag: Tag[GtkTreeModel_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkTreeModel_slistautoptr = o
  extension (v: GtkTreeModel_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkTreePath_autoptr = Ptr[GtkTreePath]
object GtkTreePath_autoptr: 
  given _tag: Tag[GtkTreePath_autoptr] = Tag.Ptr[GtkTreePath](GtkTreePath._tag)
  inline def apply(inline o: Ptr[GtkTreePath]): GtkTreePath_autoptr = o
  extension (v: GtkTreePath_autoptr)
    inline def value: Ptr[GtkTreePath] = v

opaque type GtkTreePath_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkTreePath_listautoptr: 
  given _tag: Tag[GtkTreePath_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkTreePath_listautoptr = o
  extension (v: GtkTreePath_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkTreePath_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkTreePath_queueautoptr: 
  given _tag: Tag[GtkTreePath_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkTreePath_queueautoptr = o
  extension (v: GtkTreePath_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkTreePath_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkTreePath_slistautoptr: 
  given _tag: Tag[GtkTreePath_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkTreePath_slistautoptr = o
  extension (v: GtkTreePath_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkTreeRowReference_autoptr = Ptr[GtkTreeRowReference]
object GtkTreeRowReference_autoptr: 
  given _tag: Tag[GtkTreeRowReference_autoptr] = Tag.Ptr[GtkTreeRowReference](GtkTreeRowReference._tag)
  inline def apply(inline o: Ptr[GtkTreeRowReference]): GtkTreeRowReference_autoptr = o
  extension (v: GtkTreeRowReference_autoptr)
    inline def value: Ptr[GtkTreeRowReference] = v

opaque type GtkTreeRowReference_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkTreeRowReference_listautoptr: 
  given _tag: Tag[GtkTreeRowReference_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkTreeRowReference_listautoptr = o
  extension (v: GtkTreeRowReference_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkTreeRowReference_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkTreeRowReference_queueautoptr: 
  given _tag: Tag[GtkTreeRowReference_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkTreeRowReference_queueautoptr = o
  extension (v: GtkTreeRowReference_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkTreeRowReference_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkTreeRowReference_slistautoptr: 
  given _tag: Tag[GtkTreeRowReference_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkTreeRowReference_slistautoptr = o
  extension (v: GtkTreeRowReference_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkTreeSelectionForeachFunc: : The `GtkTreeModel` being viewed : The `GtkTreePath` of a selected row : A `GtkTreeIter` pointing to a selected row
*/
opaque type GtkTreeSelectionForeachFunc = CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GtkTreeSelectionForeachFunc: 
  given _tag: Tag[GtkTreeSelectionForeachFunc] = Tag.materializeCFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkTreeSelectionForeachFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, Unit]): GtkTreeSelectionForeachFunc = o
  extension (v: GtkTreeSelectionForeachFunc)
    inline def value: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * GtkTreeSelectionFunc: : A `GtkTreeSelection` : A `GtkTreeModel` being viewed : The `GtkTreePath` of the row in question _currently_selected: %TRUE, if the path is currently selected
*/
opaque type GtkTreeSelectionFunc = CFuncPtr5[Ptr[GtkTreeSelection], Ptr[GtkTreeModel], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GtkTreeSelectionFunc: 
  given _tag: Tag[GtkTreeSelectionFunc] = Tag.materializeCFuncPtr5[Ptr[GtkTreeSelection], Ptr[GtkTreeModel], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkTreeSelectionFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[Ptr[GtkTreeSelection], Ptr[GtkTreeModel], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GtkTreeSelectionFunc = o
  extension (v: GtkTreeSelectionFunc)
    inline def value: CFuncPtr5[Ptr[GtkTreeSelection], Ptr[GtkTreeModel], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkTreeSelection_autoptr = Ptr[GtkTreeSelection]
object GtkTreeSelection_autoptr: 
  given _tag: Tag[GtkTreeSelection_autoptr] = Tag.Ptr[GtkTreeSelection](GtkTreeSelection._tag)
  inline def apply(inline o: Ptr[GtkTreeSelection]): GtkTreeSelection_autoptr = o
  extension (v: GtkTreeSelection_autoptr)
    inline def value: Ptr[GtkTreeSelection] = v

opaque type GtkTreeSelection_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkTreeSelection_listautoptr: 
  given _tag: Tag[GtkTreeSelection_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkTreeSelection_listautoptr = o
  extension (v: GtkTreeSelection_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkTreeSelection_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkTreeSelection_queueautoptr: 
  given _tag: Tag[GtkTreeSelection_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkTreeSelection_queueautoptr = o
  extension (v: GtkTreeSelection_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkTreeSelection_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkTreeSelection_slistautoptr: 
  given _tag: Tag[GtkTreeSelection_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkTreeSelection_slistautoptr = o
  extension (v: GtkTreeSelection_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkTreeSortable_autoptr = Ptr[GtkTreeSortable]
object GtkTreeSortable_autoptr: 
  given _tag: Tag[GtkTreeSortable_autoptr] = Tag.Ptr[GtkTreeSortable](GtkTreeSortable._tag)
  inline def apply(inline o: Ptr[GtkTreeSortable]): GtkTreeSortable_autoptr = o
  extension (v: GtkTreeSortable_autoptr)
    inline def value: Ptr[GtkTreeSortable] = v

opaque type GtkTreeSortable_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkTreeSortable_listautoptr: 
  given _tag: Tag[GtkTreeSortable_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkTreeSortable_listautoptr = o
  extension (v: GtkTreeSortable_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkTreeSortable_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkTreeSortable_queueautoptr: 
  given _tag: Tag[GtkTreeSortable_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkTreeSortable_queueautoptr = o
  extension (v: GtkTreeSortable_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkTreeSortable_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkTreeSortable_slistautoptr: 
  given _tag: Tag[GtkTreeSortable_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkTreeSortable_slistautoptr = o
  extension (v: GtkTreeSortable_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkTreeStore_autoptr = Ptr[GtkTreeStore]
object GtkTreeStore_autoptr: 
  given _tag: Tag[GtkTreeStore_autoptr] = Tag.Ptr[GtkTreeStore](GtkTreeStore._tag)
  inline def apply(inline o: Ptr[GtkTreeStore]): GtkTreeStore_autoptr = o
  extension (v: GtkTreeStore_autoptr)
    inline def value: Ptr[GtkTreeStore] = v

opaque type GtkTreeStore_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkTreeStore_listautoptr: 
  given _tag: Tag[GtkTreeStore_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkTreeStore_listautoptr = o
  extension (v: GtkTreeStore_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkTreeStore_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkTreeStore_queueautoptr: 
  given _tag: Tag[GtkTreeStore_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkTreeStore_queueautoptr = o
  extension (v: GtkTreeStore_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkTreeStore_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkTreeStore_slistautoptr: 
  given _tag: Tag[GtkTreeStore_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkTreeStore_slistautoptr = o
  extension (v: GtkTreeStore_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkTreeViewColumnDropFunc: _view: A `GtkTreeView` : The `GtkTreeViewColumn` being dragged
*/
opaque type GtkTreeViewColumnDropFunc = CFuncPtr5[Ptr[GtkTreeView], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GtkTreeViewColumnDropFunc: 
  given _tag: Tag[GtkTreeViewColumnDropFunc] = Tag.materializeCFuncPtr5[Ptr[GtkTreeView], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkTreeViewColumnDropFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[Ptr[GtkTreeView], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GtkTreeViewColumnDropFunc = o
  extension (v: GtkTreeViewColumnDropFunc)
    inline def value: CFuncPtr5[Ptr[GtkTreeView], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkTreeViewColumn_autoptr = Ptr[GtkTreeViewColumn]
object GtkTreeViewColumn_autoptr: 
  given _tag: Tag[GtkTreeViewColumn_autoptr] = Tag.Ptr[GtkTreeViewColumn](GtkTreeViewColumn._tag)
  inline def apply(inline o: Ptr[GtkTreeViewColumn]): GtkTreeViewColumn_autoptr = o
  extension (v: GtkTreeViewColumn_autoptr)
    inline def value: Ptr[GtkTreeViewColumn] = v

opaque type GtkTreeViewColumn_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkTreeViewColumn_listautoptr: 
  given _tag: Tag[GtkTreeViewColumn_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkTreeViewColumn_listautoptr = o
  extension (v: GtkTreeViewColumn_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkTreeViewColumn_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkTreeViewColumn_queueautoptr: 
  given _tag: Tag[GtkTreeViewColumn_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkTreeViewColumn_queueautoptr = o
  extension (v: GtkTreeViewColumn_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkTreeViewColumn_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkTreeViewColumn_slistautoptr: 
  given _tag: Tag[GtkTreeViewColumn_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkTreeViewColumn_slistautoptr = o
  extension (v: GtkTreeViewColumn_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkTreeViewMappingFunc: _view: A `GtkTreeView` : The path that’s expanded _data: user data
*/
opaque type GtkTreeViewMappingFunc = CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GtkTreeViewMappingFunc: 
  given _tag: Tag[GtkTreeViewMappingFunc] = Tag.materializeCFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkTreeViewMappingFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gpointer, Unit]): GtkTreeViewMappingFunc = o
  extension (v: GtkTreeViewMappingFunc)
    inline def value: CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * GtkTreeViewRowSeparatorFunc: : the `GtkTreeModel` : a `GtkTreeIter` pointing at a row in
*/
opaque type GtkTreeViewRowSeparatorFunc = CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GtkTreeViewRowSeparatorFunc: 
  given _tag: Tag[GtkTreeViewRowSeparatorFunc] = Tag.materializeCFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkTreeViewRowSeparatorFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GtkTreeViewRowSeparatorFunc = o
  extension (v: GtkTreeViewRowSeparatorFunc)
    inline def value: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * GtkTreeViewSearchEqualFunc: : the `GtkTreeModel` being searched : the search column set by gtk_tree_view_set_search_column() : the key string to compare with : a `GtkTreeIter` pointing the row of that should be compared with . _data: (closure): user data from gtk_tree_view_set_search_equal_func()
*/
opaque type GtkTreeViewSearchEqualFunc = CFuncPtr5[Ptr[GtkTreeModel], CInt, Ptr[CUnsignedChar], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GtkTreeViewSearchEqualFunc: 
  given _tag: Tag[GtkTreeViewSearchEqualFunc] = Tag.materializeCFuncPtr5[Ptr[GtkTreeModel], CInt, Ptr[CUnsignedChar], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkTreeViewSearchEqualFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[Ptr[GtkTreeModel], CInt, Ptr[CUnsignedChar], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GtkTreeViewSearchEqualFunc = o
  extension (v: GtkTreeViewSearchEqualFunc)
    inline def value: CFuncPtr5[Ptr[GtkTreeModel], CInt, Ptr[CUnsignedChar], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkTreeView_autoptr = Ptr[GtkTreeView]
object GtkTreeView_autoptr: 
  given _tag: Tag[GtkTreeView_autoptr] = Tag.Ptr[GtkTreeView](GtkTreeView._tag)
  inline def apply(inline o: Ptr[GtkTreeView]): GtkTreeView_autoptr = o
  extension (v: GtkTreeView_autoptr)
    inline def value: Ptr[GtkTreeView] = v

opaque type GtkTreeView_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkTreeView_listautoptr: 
  given _tag: Tag[GtkTreeView_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkTreeView_listautoptr = o
  extension (v: GtkTreeView_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkTreeView_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkTreeView_queueautoptr: 
  given _tag: Tag[GtkTreeView_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkTreeView_queueautoptr = o
  extension (v: GtkTreeView_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkTreeView_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkTreeView_slistautoptr: 
  given _tag: Tag[GtkTreeView_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkTreeView_slistautoptr = o
  extension (v: GtkTreeView_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkUriLauncherClass_autoptr = Ptr[GtkUriLauncherClass]
object GtkUriLauncherClass_autoptr: 
  given _tag: Tag[GtkUriLauncherClass_autoptr] = Tag.Ptr[GtkUriLauncherClass](GtkUriLauncherClass._tag)
  inline def apply(inline o: Ptr[GtkUriLauncherClass]): GtkUriLauncherClass_autoptr = o
  extension (v: GtkUriLauncherClass_autoptr)
    inline def value: Ptr[GtkUriLauncherClass] = v

opaque type GtkUriLauncherClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkUriLauncherClass_listautoptr: 
  given _tag: Tag[GtkUriLauncherClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkUriLauncherClass_listautoptr = o
  extension (v: GtkUriLauncherClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkUriLauncherClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkUriLauncherClass_queueautoptr: 
  given _tag: Tag[GtkUriLauncherClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkUriLauncherClass_queueautoptr = o
  extension (v: GtkUriLauncherClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkUriLauncherClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkUriLauncherClass_slistautoptr: 
  given _tag: Tag[GtkUriLauncherClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkUriLauncherClass_slistautoptr = o
  extension (v: GtkUriLauncherClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkUriLauncher_autoptr = Ptr[GtkUriLauncher]
object GtkUriLauncher_autoptr: 
  given _tag: Tag[GtkUriLauncher_autoptr] = Tag.Ptr[GtkUriLauncher](GtkUriLauncher._tag)
  inline def apply(inline o: Ptr[GtkUriLauncher]): GtkUriLauncher_autoptr = o
  extension (v: GtkUriLauncher_autoptr)
    inline def value: Ptr[GtkUriLauncher] = v

opaque type GtkUriLauncher_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkUriLauncher_listautoptr: 
  given _tag: Tag[GtkUriLauncher_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkUriLauncher_listautoptr = o
  extension (v: GtkUriLauncher_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkUriLauncher_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkUriLauncher_queueautoptr: 
  given _tag: Tag[GtkUriLauncher_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkUriLauncher_queueautoptr = o
  extension (v: GtkUriLauncher_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkUriLauncher_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkUriLauncher_slistautoptr: 
  given _tag: Tag[GtkUriLauncher_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkUriLauncher_slistautoptr = o
  extension (v: GtkUriLauncher_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkVideoClass_autoptr = Ptr[GtkVideoClass]
object GtkVideoClass_autoptr: 
  given _tag: Tag[GtkVideoClass_autoptr] = Tag.Ptr[GtkVideoClass](GtkVideoClass._tag)
  inline def apply(inline o: Ptr[GtkVideoClass]): GtkVideoClass_autoptr = o
  extension (v: GtkVideoClass_autoptr)
    inline def value: Ptr[GtkVideoClass] = v

opaque type GtkVideoClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkVideoClass_listautoptr: 
  given _tag: Tag[GtkVideoClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkVideoClass_listautoptr = o
  extension (v: GtkVideoClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkVideoClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkVideoClass_queueautoptr: 
  given _tag: Tag[GtkVideoClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkVideoClass_queueautoptr = o
  extension (v: GtkVideoClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkVideoClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkVideoClass_slistautoptr: 
  given _tag: Tag[GtkVideoClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkVideoClass_slistautoptr = o
  extension (v: GtkVideoClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkVideo_autoptr = Ptr[GtkVideo]
object GtkVideo_autoptr: 
  given _tag: Tag[GtkVideo_autoptr] = Tag.Ptr[GtkVideo](GtkVideo._tag)
  inline def apply(inline o: Ptr[GtkVideo]): GtkVideo_autoptr = o
  extension (v: GtkVideo_autoptr)
    inline def value: Ptr[GtkVideo] = v

opaque type GtkVideo_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkVideo_listautoptr: 
  given _tag: Tag[GtkVideo_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkVideo_listautoptr = o
  extension (v: GtkVideo_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkVideo_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkVideo_queueautoptr: 
  given _tag: Tag[GtkVideo_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkVideo_queueautoptr = o
  extension (v: GtkVideo_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkVideo_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkVideo_slistautoptr: 
  given _tag: Tag[GtkVideo_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkVideo_slistautoptr = o
  extension (v: GtkVideo_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkViewport_autoptr = Ptr[GtkViewport]
object GtkViewport_autoptr: 
  given _tag: Tag[GtkViewport_autoptr] = Tag.Ptr[GtkViewport](GtkViewport._tag)
  inline def apply(inline o: Ptr[GtkViewport]): GtkViewport_autoptr = o
  extension (v: GtkViewport_autoptr)
    inline def value: Ptr[GtkViewport] = v

opaque type GtkViewport_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkViewport_listautoptr: 
  given _tag: Tag[GtkViewport_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkViewport_listautoptr = o
  extension (v: GtkViewport_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkViewport_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkViewport_queueautoptr: 
  given _tag: Tag[GtkViewport_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkViewport_queueautoptr = o
  extension (v: GtkViewport_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkViewport_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkViewport_slistautoptr: 
  given _tag: Tag[GtkViewport_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkViewport_slistautoptr = o
  extension (v: GtkViewport_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkVolumeButton_autoptr = Ptr[GtkVolumeButton]
object GtkVolumeButton_autoptr: 
  given _tag: Tag[GtkVolumeButton_autoptr] = Tag.Ptr[GtkVolumeButton](GtkVolumeButton._tag)
  inline def apply(inline o: Ptr[GtkVolumeButton]): GtkVolumeButton_autoptr = o
  extension (v: GtkVolumeButton_autoptr)
    inline def value: Ptr[GtkVolumeButton] = v

opaque type GtkVolumeButton_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkVolumeButton_listautoptr: 
  given _tag: Tag[GtkVolumeButton_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkVolumeButton_listautoptr = o
  extension (v: GtkVolumeButton_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkVolumeButton_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkVolumeButton_queueautoptr: 
  given _tag: Tag[GtkVolumeButton_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkVolumeButton_queueautoptr = o
  extension (v: GtkVolumeButton_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkVolumeButton_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkVolumeButton_slistautoptr: 
  given _tag: Tag[GtkVolumeButton_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkVolumeButton_slistautoptr = o
  extension (v: GtkVolumeButton_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

/**
 * GtkWidgetActionActivateFunc: : the widget to which the action belongs _name: the action name : (nullable): parameter for activation
*/
opaque type GtkWidgetActionActivateFunc = CFuncPtr3[Ptr[GtkWidget], Ptr[CUnsignedChar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]
object GtkWidgetActionActivateFunc: 
  given _tag: Tag[GtkWidgetActionActivateFunc] = Tag.materializeCFuncPtr3[Ptr[GtkWidget], Ptr[CUnsignedChar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkWidgetActionActivateFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GtkWidget], Ptr[CUnsignedChar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]): GtkWidgetActionActivateFunc = o
  extension (v: GtkWidgetActionActivateFunc)
    inline def value: CFuncPtr3[Ptr[GtkWidget], Ptr[CUnsignedChar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

opaque type GtkWidgetPaintableClass_autoptr = Ptr[GtkWidgetPaintableClass]
object GtkWidgetPaintableClass_autoptr: 
  given _tag: Tag[GtkWidgetPaintableClass_autoptr] = Tag.Ptr[GtkWidgetPaintableClass](GtkWidgetPaintableClass._tag)
  inline def apply(inline o: Ptr[GtkWidgetPaintableClass]): GtkWidgetPaintableClass_autoptr = o
  extension (v: GtkWidgetPaintableClass_autoptr)
    inline def value: Ptr[GtkWidgetPaintableClass] = v

opaque type GtkWidgetPaintableClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkWidgetPaintableClass_listautoptr: 
  given _tag: Tag[GtkWidgetPaintableClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkWidgetPaintableClass_listautoptr = o
  extension (v: GtkWidgetPaintableClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkWidgetPaintableClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkWidgetPaintableClass_queueautoptr: 
  given _tag: Tag[GtkWidgetPaintableClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkWidgetPaintableClass_queueautoptr = o
  extension (v: GtkWidgetPaintableClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkWidgetPaintableClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkWidgetPaintableClass_slistautoptr: 
  given _tag: Tag[GtkWidgetPaintableClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkWidgetPaintableClass_slistautoptr = o
  extension (v: GtkWidgetPaintableClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkWidgetPaintable_autoptr = Ptr[GtkWidgetPaintable]
object GtkWidgetPaintable_autoptr: 
  given _tag: Tag[GtkWidgetPaintable_autoptr] = Tag.Ptr[GtkWidgetPaintable](GtkWidgetPaintable._tag)
  inline def apply(inline o: Ptr[GtkWidgetPaintable]): GtkWidgetPaintable_autoptr = o
  extension (v: GtkWidgetPaintable_autoptr)
    inline def value: Ptr[GtkWidgetPaintable] = v

opaque type GtkWidgetPaintable_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkWidgetPaintable_listautoptr: 
  given _tag: Tag[GtkWidgetPaintable_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkWidgetPaintable_listautoptr = o
  extension (v: GtkWidgetPaintable_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkWidgetPaintable_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkWidgetPaintable_queueautoptr: 
  given _tag: Tag[GtkWidgetPaintable_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkWidgetPaintable_queueautoptr = o
  extension (v: GtkWidgetPaintable_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkWidgetPaintable_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkWidgetPaintable_slistautoptr: 
  given _tag: Tag[GtkWidgetPaintable_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkWidgetPaintable_slistautoptr = o
  extension (v: GtkWidgetPaintable_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkWidget_autoptr = Ptr[GtkWidget]
object GtkWidget_autoptr: 
  given _tag: Tag[GtkWidget_autoptr] = Tag.Ptr[GtkWidget](GtkWidget._tag)
  inline def apply(inline o: Ptr[GtkWidget]): GtkWidget_autoptr = o
  extension (v: GtkWidget_autoptr)
    inline def value: Ptr[GtkWidget] = v

opaque type GtkWidget_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkWidget_listautoptr: 
  given _tag: Tag[GtkWidget_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkWidget_listautoptr = o
  extension (v: GtkWidget_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkWidget_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkWidget_queueautoptr: 
  given _tag: Tag[GtkWidget_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkWidget_queueautoptr = o
  extension (v: GtkWidget_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkWidget_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkWidget_slistautoptr: 
  given _tag: Tag[GtkWidget_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkWidget_slistautoptr = o
  extension (v: GtkWidget_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkWindowControlsClass_autoptr = Ptr[GtkWindowControlsClass]
object GtkWindowControlsClass_autoptr: 
  given _tag: Tag[GtkWindowControlsClass_autoptr] = Tag.Ptr[GtkWindowControlsClass](GtkWindowControlsClass._tag)
  inline def apply(inline o: Ptr[GtkWindowControlsClass]): GtkWindowControlsClass_autoptr = o
  extension (v: GtkWindowControlsClass_autoptr)
    inline def value: Ptr[GtkWindowControlsClass] = v

opaque type GtkWindowControlsClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkWindowControlsClass_listautoptr: 
  given _tag: Tag[GtkWindowControlsClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkWindowControlsClass_listautoptr = o
  extension (v: GtkWindowControlsClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkWindowControlsClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkWindowControlsClass_queueautoptr: 
  given _tag: Tag[GtkWindowControlsClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkWindowControlsClass_queueautoptr = o
  extension (v: GtkWindowControlsClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkWindowControlsClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkWindowControlsClass_slistautoptr: 
  given _tag: Tag[GtkWindowControlsClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkWindowControlsClass_slistautoptr = o
  extension (v: GtkWindowControlsClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkWindowControls_autoptr = Ptr[GtkWindowControls]
object GtkWindowControls_autoptr: 
  given _tag: Tag[GtkWindowControls_autoptr] = Tag.Ptr[GtkWindowControls](GtkWindowControls._tag)
  inline def apply(inline o: Ptr[GtkWindowControls]): GtkWindowControls_autoptr = o
  extension (v: GtkWindowControls_autoptr)
    inline def value: Ptr[GtkWindowControls] = v

opaque type GtkWindowControls_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkWindowControls_listautoptr: 
  given _tag: Tag[GtkWindowControls_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkWindowControls_listautoptr = o
  extension (v: GtkWindowControls_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkWindowControls_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkWindowControls_queueautoptr: 
  given _tag: Tag[GtkWindowControls_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkWindowControls_queueautoptr = o
  extension (v: GtkWindowControls_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkWindowControls_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkWindowControls_slistautoptr: 
  given _tag: Tag[GtkWindowControls_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkWindowControls_slistautoptr = o
  extension (v: GtkWindowControls_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkWindowGroup_autoptr = Ptr[GtkWindowGroup]
object GtkWindowGroup_autoptr: 
  given _tag: Tag[GtkWindowGroup_autoptr] = Tag.Ptr[GtkWindowGroup](GtkWindowGroup._tag)
  inline def apply(inline o: Ptr[GtkWindowGroup]): GtkWindowGroup_autoptr = o
  extension (v: GtkWindowGroup_autoptr)
    inline def value: Ptr[GtkWindowGroup] = v

opaque type GtkWindowGroup_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkWindowGroup_listautoptr: 
  given _tag: Tag[GtkWindowGroup_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkWindowGroup_listautoptr = o
  extension (v: GtkWindowGroup_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkWindowGroup_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkWindowGroup_queueautoptr: 
  given _tag: Tag[GtkWindowGroup_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkWindowGroup_queueautoptr = o
  extension (v: GtkWindowGroup_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkWindowGroup_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkWindowGroup_slistautoptr: 
  given _tag: Tag[GtkWindowGroup_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkWindowGroup_slistautoptr = o
  extension (v: GtkWindowGroup_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkWindowHandleClass_autoptr = Ptr[GtkWindowHandleClass]
object GtkWindowHandleClass_autoptr: 
  given _tag: Tag[GtkWindowHandleClass_autoptr] = Tag.Ptr[GtkWindowHandleClass](GtkWindowHandleClass._tag)
  inline def apply(inline o: Ptr[GtkWindowHandleClass]): GtkWindowHandleClass_autoptr = o
  extension (v: GtkWindowHandleClass_autoptr)
    inline def value: Ptr[GtkWindowHandleClass] = v

opaque type GtkWindowHandleClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkWindowHandleClass_listautoptr: 
  given _tag: Tag[GtkWindowHandleClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkWindowHandleClass_listautoptr = o
  extension (v: GtkWindowHandleClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkWindowHandleClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkWindowHandleClass_queueautoptr: 
  given _tag: Tag[GtkWindowHandleClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkWindowHandleClass_queueautoptr = o
  extension (v: GtkWindowHandleClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkWindowHandleClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkWindowHandleClass_slistautoptr: 
  given _tag: Tag[GtkWindowHandleClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkWindowHandleClass_slistautoptr = o
  extension (v: GtkWindowHandleClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkWindowHandle_autoptr = Ptr[GtkWindowHandle]
object GtkWindowHandle_autoptr: 
  given _tag: Tag[GtkWindowHandle_autoptr] = Tag.Ptr[GtkWindowHandle](GtkWindowHandle._tag)
  inline def apply(inline o: Ptr[GtkWindowHandle]): GtkWindowHandle_autoptr = o
  extension (v: GtkWindowHandle_autoptr)
    inline def value: Ptr[GtkWindowHandle] = v

opaque type GtkWindowHandle_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkWindowHandle_listautoptr: 
  given _tag: Tag[GtkWindowHandle_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkWindowHandle_listautoptr = o
  extension (v: GtkWindowHandle_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkWindowHandle_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkWindowHandle_queueautoptr: 
  given _tag: Tag[GtkWindowHandle_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkWindowHandle_queueautoptr = o
  extension (v: GtkWindowHandle_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkWindowHandle_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkWindowHandle_slistautoptr: 
  given _tag: Tag[GtkWindowHandle_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkWindowHandle_slistautoptr = o
  extension (v: GtkWindowHandle_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type GtkWindow_autoptr = Ptr[GtkWindow]
object GtkWindow_autoptr: 
  given _tag: Tag[GtkWindow_autoptr] = Tag.Ptr[GtkWindow](GtkWindow._tag)
  inline def apply(inline o: Ptr[GtkWindow]): GtkWindow_autoptr = o
  extension (v: GtkWindow_autoptr)
    inline def value: Ptr[GtkWindow] = v

opaque type GtkWindow_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkWindow_listautoptr: 
  given _tag: Tag[GtkWindow_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkWindow_listautoptr = o
  extension (v: GtkWindow_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v

opaque type GtkWindow_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkWindow_queueautoptr: 
  given _tag: Tag[GtkWindow_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkWindow_queueautoptr = o
  extension (v: GtkWindow_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v

opaque type GtkWindow_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkWindow_slistautoptr: 
  given _tag: Tag[GtkWindow_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkWindow_slistautoptr = o
  extension (v: GtkWindow_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v

opaque type float32_t = Float
object float32_t: 
  given _tag: Tag[float32_t] = Tag.Float
  inline def apply(inline o: Float): float32_t = o
  extension (v: float32_t)
    inline def value: Float = v

opaque type float32x4_t = CStruct4[float32_t, float32_t, float32_t, float32_t]
object float32x4_t: 
  given _tag: Tag[float32x4_t] = Tag.materializeCStruct4Tag[float32_t, float32_t, float32_t, float32_t]
  inline def apply(inline o: CStruct4[float32_t, float32_t, float32_t, float32_t]): float32x4_t = o
  extension (v: float32x4_t)
    inline def value: CStruct4[float32_t, float32_t, float32_t, float32_t] = v

type va_list = unsafe.CVarArgList
object va_list: 
  val _tag: Tag[va_list] = summon[Tag[unsafe.CVarArgList]]
  inline def apply(inline o: unsafe.CVarArgList): va_list = o
  extension (v: va_list)
    inline def value: unsafe.CVarArgList = v