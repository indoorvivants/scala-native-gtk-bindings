package gdkpixbuf
package structs

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

import _root_.gdkpixbuf.enumerations.*
import _root_.gdkpixbuf.aliases.*
import _root_.gdkpixbuf.structs.*

/**
 * [bindgen] header: /usr/include/gdk-pixbuf-2.0/gdk-pixbuf/gdk-pixbuf-core.h
*/
opaque type GdkPixbuf = CStruct0
object GdkPixbuf:
  given _tag: Tag[GdkPixbuf] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gdk-pixbuf-2.0/gdk-pixbuf/gdk-pixbuf-animation.h
*/
opaque type GdkPixbufAnimation = CStruct0
object GdkPixbufAnimation:
  given _tag: Tag[GdkPixbufAnimation] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gdk-pixbuf-2.0/gdk-pixbuf/gdk-pixbuf-animation.h
*/
opaque type GdkPixbufAnimationIter = CStruct0
object GdkPixbufAnimationIter:
  given _tag: Tag[GdkPixbufAnimationIter] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gdk-pixbuf-2.0/gdk-pixbuf/gdk-pixbuf-io.h
*/
opaque type GdkPixbufFormat = CStruct0
object GdkPixbufFormat:
  given _tag: Tag[GdkPixbufFormat] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gdk-pixbuf-2.0/gdk-pixbuf/gdk-pixbuf-loader.h
*/
opaque type GdkPixbufLoader = CStruct2[_root_.gobject.all.GObject, _root_.glib.all.gpointer]
object GdkPixbufLoader:
  given _tag: Tag[GdkPixbufLoader] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObject, _root_.glib.all.gpointer]
  def apply()(using Zone): Ptr[GdkPixbufLoader] = scala.scalanative.unsafe.alloc[GdkPixbufLoader](1)
  def apply(parent_instance : _root_.gobject.all.GObject, priv : _root_.glib.all.gpointer)(using Zone): Ptr[GdkPixbufLoader] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr
  extension (struct: GdkPixbufLoader)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value
    def priv : _root_.glib.all.gpointer = struct._2
    def priv_=(value: _root_.glib.all.gpointer): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gdk-pixbuf-2.0/gdk-pixbuf/gdk-pixbuf-loader.h
*/
opaque type GdkPixbufLoaderClass = CStruct5[_root_.gobject.all.GObjectClass, CFuncPtr3[Ptr[GdkPixbufLoader], CInt, CInt, Unit], CFuncPtr1[Ptr[GdkPixbufLoader], Unit], CFuncPtr5[Ptr[GdkPixbufLoader], CInt, CInt, CInt, CInt, Unit], CFuncPtr1[Ptr[GdkPixbufLoader], Unit]]
object GdkPixbufLoaderClass:
  given _tag: Tag[GdkPixbufLoaderClass] = Tag.materializeCStruct5Tag[_root_.gobject.all.GObjectClass, CFuncPtr3[Ptr[GdkPixbufLoader], CInt, CInt, Unit], CFuncPtr1[Ptr[GdkPixbufLoader], Unit], CFuncPtr5[Ptr[GdkPixbufLoader], CInt, CInt, CInt, CInt, Unit], CFuncPtr1[Ptr[GdkPixbufLoader], Unit]]
  def apply()(using Zone): Ptr[GdkPixbufLoaderClass] = scala.scalanative.unsafe.alloc[GdkPixbufLoaderClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, size_prepared : CFuncPtr3[Ptr[GdkPixbufLoader], CInt, CInt, Unit], area_prepared : CFuncPtr1[Ptr[GdkPixbufLoader], Unit], area_updated : CFuncPtr5[Ptr[GdkPixbufLoader], CInt, CInt, CInt, CInt, Unit], closed : CFuncPtr1[Ptr[GdkPixbufLoader], Unit])(using Zone): Ptr[GdkPixbufLoaderClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).size_prepared = size_prepared
    (!____ptr).area_prepared = area_prepared
    (!____ptr).area_updated = area_updated
    (!____ptr).closed = closed
    ____ptr
  extension (struct: GdkPixbufLoaderClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def size_prepared : CFuncPtr3[Ptr[GdkPixbufLoader], CInt, CInt, Unit] = struct._2
    def size_prepared_=(value: CFuncPtr3[Ptr[GdkPixbufLoader], CInt, CInt, Unit]): Unit = !struct.at2 = value
    def area_prepared : CFuncPtr1[Ptr[GdkPixbufLoader], Unit] = struct._3
    def area_prepared_=(value: CFuncPtr1[Ptr[GdkPixbufLoader], Unit]): Unit = !struct.at3 = value
    def area_updated : CFuncPtr5[Ptr[GdkPixbufLoader], CInt, CInt, CInt, CInt, Unit] = struct._4
    def area_updated_=(value: CFuncPtr5[Ptr[GdkPixbufLoader], CInt, CInt, CInt, CInt, Unit]): Unit = !struct.at4 = value
    def closed : CFuncPtr1[Ptr[GdkPixbufLoader], Unit] = struct._5
    def closed_=(value: CFuncPtr1[Ptr[GdkPixbufLoader], Unit]): Unit = !struct.at5 = value

/**
 * [bindgen] header: /usr/include/gdk-pixbuf-2.0/gdk-pixbuf/gdk-pixbuf-simple-anim.h
*/
opaque type GdkPixbufSimpleAnim = CStruct0
object GdkPixbufSimpleAnim:
  given _tag: Tag[GdkPixbufSimpleAnim] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gdk-pixbuf-2.0/gdk-pixbuf/gdk-pixbuf-simple-anim.h
*/
opaque type GdkPixbufSimpleAnimClass = CStruct0
object GdkPixbufSimpleAnimClass:
  given _tag: Tag[GdkPixbufSimpleAnimClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gdk-pixbuf-2.0/gdk-pixbuf/gdk-pixbuf-core.h
*/
opaque type _GdkPixbuf = CStruct0
object _GdkPixbuf:
  given _tag: Tag[_GdkPixbuf] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gdk-pixbuf-2.0/gdk-pixbuf/gdk-pixbuf-animation.h
*/
opaque type _GdkPixbufAnimation = CStruct0
object _GdkPixbufAnimation:
  given _tag: Tag[_GdkPixbufAnimation] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gdk-pixbuf-2.0/gdk-pixbuf/gdk-pixbuf-animation.h
*/
opaque type _GdkPixbufAnimationIter = CStruct0
object _GdkPixbufAnimationIter:
  given _tag: Tag[_GdkPixbufAnimationIter] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gdk-pixbuf-2.0/gdk-pixbuf/gdk-pixbuf-io.h
*/
opaque type _GdkPixbufFormat = CStruct0
object _GdkPixbufFormat:
  given _tag: Tag[_GdkPixbufFormat] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gdk-pixbuf-2.0/gdk-pixbuf/gdk-pixbuf-loader.h
*/
opaque type _GdkPixbufLoader = CStruct2[_root_.gobject.all.GObject, _root_.glib.all.gpointer]
object _GdkPixbufLoader:
  given _tag: Tag[_GdkPixbufLoader] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObject, _root_.glib.all.gpointer]
  def apply()(using Zone): Ptr[_GdkPixbufLoader] = scala.scalanative.unsafe.alloc[_GdkPixbufLoader](1)
  def apply(parent_instance : _root_.gobject.all.GObject, priv : _root_.glib.all.gpointer)(using Zone): Ptr[_GdkPixbufLoader] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr
  extension (struct: _GdkPixbufLoader)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value
    def priv : _root_.glib.all.gpointer = struct._2
    def priv_=(value: _root_.glib.all.gpointer): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gdk-pixbuf-2.0/gdk-pixbuf/gdk-pixbuf-loader.h
*/
opaque type _GdkPixbufLoaderClass = CStruct5[_root_.gobject.all.GObjectClass, CFuncPtr3[Ptr[GdkPixbufLoader], CInt, CInt, Unit], CFuncPtr1[Ptr[GdkPixbufLoader], Unit], CFuncPtr5[Ptr[GdkPixbufLoader], CInt, CInt, CInt, CInt, Unit], CFuncPtr1[Ptr[GdkPixbufLoader], Unit]]
object _GdkPixbufLoaderClass:
  given _tag: Tag[_GdkPixbufLoaderClass] = Tag.materializeCStruct5Tag[_root_.gobject.all.GObjectClass, CFuncPtr3[Ptr[GdkPixbufLoader], CInt, CInt, Unit], CFuncPtr1[Ptr[GdkPixbufLoader], Unit], CFuncPtr5[Ptr[GdkPixbufLoader], CInt, CInt, CInt, CInt, Unit], CFuncPtr1[Ptr[GdkPixbufLoader], Unit]]
  def apply()(using Zone): Ptr[_GdkPixbufLoaderClass] = scala.scalanative.unsafe.alloc[_GdkPixbufLoaderClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, size_prepared : CFuncPtr3[Ptr[GdkPixbufLoader], CInt, CInt, Unit], area_prepared : CFuncPtr1[Ptr[GdkPixbufLoader], Unit], area_updated : CFuncPtr5[Ptr[GdkPixbufLoader], CInt, CInt, CInt, CInt, Unit], closed : CFuncPtr1[Ptr[GdkPixbufLoader], Unit])(using Zone): Ptr[_GdkPixbufLoaderClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).size_prepared = size_prepared
    (!____ptr).area_prepared = area_prepared
    (!____ptr).area_updated = area_updated
    (!____ptr).closed = closed
    ____ptr
  extension (struct: _GdkPixbufLoaderClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def size_prepared : CFuncPtr3[Ptr[GdkPixbufLoader], CInt, CInt, Unit] = struct._2
    def size_prepared_=(value: CFuncPtr3[Ptr[GdkPixbufLoader], CInt, CInt, Unit]): Unit = !struct.at2 = value
    def area_prepared : CFuncPtr1[Ptr[GdkPixbufLoader], Unit] = struct._3
    def area_prepared_=(value: CFuncPtr1[Ptr[GdkPixbufLoader], Unit]): Unit = !struct.at3 = value
    def area_updated : CFuncPtr5[Ptr[GdkPixbufLoader], CInt, CInt, CInt, CInt, Unit] = struct._4
    def area_updated_=(value: CFuncPtr5[Ptr[GdkPixbufLoader], CInt, CInt, CInt, CInt, Unit]): Unit = !struct.at4 = value
    def closed : CFuncPtr1[Ptr[GdkPixbufLoader], Unit] = struct._5
    def closed_=(value: CFuncPtr1[Ptr[GdkPixbufLoader], Unit]): Unit = !struct.at5 = value

/**
 * [bindgen] header: /usr/include/gdk-pixbuf-2.0/gdk-pixbuf/gdk-pixbuf-simple-anim.h
*/
opaque type _GdkPixbufSimpleAnim = CStruct0
object _GdkPixbufSimpleAnim:
  given _tag: Tag[_GdkPixbufSimpleAnim] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gdk-pixbuf-2.0/gdk-pixbuf/gdk-pixbuf-simple-anim.h
*/
opaque type _GdkPixbufSimpleAnimClass = CStruct0
object _GdkPixbufSimpleAnimClass:
  given _tag: Tag[_GdkPixbufSimpleAnimClass] = Tag.materializeCStruct0Tag

