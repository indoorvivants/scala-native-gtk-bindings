package adwaita
package structs

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

import _root_.adwaita.enumerations.*
import _root_.adwaita.aliases.*
import _root_.adwaita.structs.*
import _root_.adwaita.unions.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-action-row.h
*/
opaque type AdwActionRow = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]
object AdwActionRow:
  given _tag: Tag[AdwActionRow] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  def apply()(using Zone): Ptr[AdwActionRow] = scala.scalanative.unsafe.alloc[AdwActionRow](1)
  def apply(parent_instance : AdwPreferencesRow)(using Zone): Ptr[AdwActionRow] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: AdwActionRow)
    def parent_instance: AdwPreferencesRow = !struct.at(0).asInstanceOf[Ptr[AdwPreferencesRow]]
    def parent_instance_=(value: AdwPreferencesRow): Unit = !struct.at(0).asInstanceOf[Ptr[AdwPreferencesRow]] = value

/**
 * AdwActionRowClass _class: The parent class : Activates the row to trigger its main action.

 * [bindgen] header: /usr/include/libadwaita-1/adw-action-row.h
*/
opaque type AdwActionRowClass = CArray[CChar, Nat.Digit3[Nat._5, Nat._5, Nat._2]]
object AdwActionRowClass:
  given _tag: Tag[AdwActionRowClass] = Tag.CArray[CChar, Nat.Digit3[Nat._5, Nat._5, Nat._2]](Tag.Byte, Tag.Digit3[Nat._5, Nat._5, Nat._2](Tag.Nat5, Tag.Nat5, Tag.Nat2))
  def apply()(using Zone): Ptr[AdwActionRowClass] = scala.scalanative.unsafe.alloc[AdwActionRowClass](1)
  def apply(parent_class : AdwPreferencesRowClass, activate : CFuncPtr1[Ptr[AdwActionRow], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._4])(using Zone): Ptr[AdwActionRowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).activate = activate
    (!____ptr).padding = padding
    ____ptr
  extension (struct: AdwActionRowClass)
    def parent_class: AdwPreferencesRowClass = !struct.at(0).asInstanceOf[Ptr[AdwPreferencesRowClass]]
    def parent_class_=(value: AdwPreferencesRowClass): Unit = !struct.at(0).asInstanceOf[Ptr[AdwPreferencesRowClass]] = value
    def activate: CFuncPtr1[Ptr[AdwActionRow], Unit] = !struct.at(512).asInstanceOf[Ptr[CFuncPtr1[Ptr[AdwActionRow], Unit]]]
    def activate_=(value: CFuncPtr1[Ptr[AdwActionRow], Unit]): Unit = !struct.at(512).asInstanceOf[Ptr[CFuncPtr1[Ptr[AdwActionRow], Unit]]] = value
    def padding: CArray[_root_.glib.all.gpointer, Nat._4] = !struct.at(520).asInstanceOf[Ptr[CArray[_root_.glib.all.gpointer, Nat._4]]]
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._4]): Unit = !struct.at(520).asInstanceOf[Ptr[CArray[_root_.glib.all.gpointer, Nat._4]]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-animation.h
*/
opaque type AdwAnimation = CArray[CChar, Nat.Digit2[Nat._2, Nat._4]]
object AdwAnimation:
  given _tag: Tag[AdwAnimation] = Tag.CArray[CChar, Nat.Digit2[Nat._2, Nat._4]](Tag.Byte, Tag.Digit2[Nat._2, Nat._4](Tag.Nat2, Tag.Nat4))
  def apply()(using Zone): Ptr[AdwAnimation] = scala.scalanative.unsafe.alloc[AdwAnimation](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[AdwAnimation] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: AdwAnimation)
    def parent_instance: _root_.gobject.all.GObject = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObject]]
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObject]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-animation.h
*/
opaque type AdwAnimationClass = CStruct0
object AdwAnimationClass:
  given _tag: Tag[AdwAnimationClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-animation-target.h
*/
opaque type AdwAnimationTarget = CStruct0
object AdwAnimationTarget:
  given _tag: Tag[AdwAnimationTarget] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-animation-target.h
*/
opaque type AdwAnimationTargetClass = CStruct0
object AdwAnimationTargetClass:
  given _tag: Tag[AdwAnimationTargetClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-application.h
*/
opaque type AdwApplication = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]
object AdwApplication:
  given _tag: Tag[AdwApplication] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  def apply()(using Zone): Ptr[AdwApplication] = scala.scalanative.unsafe.alloc[AdwApplication](1)
  def apply(parent_instance : _root_.gtk.all.GtkApplication)(using Zone): Ptr[AdwApplication] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: AdwApplication)
    def parent_instance: _root_.gtk.all.GtkApplication = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkApplication]]
    def parent_instance_=(value: _root_.gtk.all.GtkApplication): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkApplication]] = value

/**
 * AdwApplicationClass: _class: The parent class

 * [bindgen] header: /usr/include/libadwaita-1/adw-application.h
*/
opaque type AdwApplicationClass = CArray[CChar, Nat.Digit3[Nat._4, Nat._2, Nat._4]]
object AdwApplicationClass:
  given _tag: Tag[AdwApplicationClass] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._2, Nat._4]](Tag.Byte, Tag.Digit3[Nat._4, Nat._2, Nat._4](Tag.Nat4, Tag.Nat2, Tag.Nat4))
  def apply()(using Zone): Ptr[AdwApplicationClass] = scala.scalanative.unsafe.alloc[AdwApplicationClass](1)
  def apply(parent_class : _root_.gtk.all.GtkApplicationClass, padding : CArray[_root_.glib.all.gpointer, Nat._4])(using Zone): Ptr[AdwApplicationClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: AdwApplicationClass)
    def parent_class: _root_.gtk.all.GtkApplicationClass = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkApplicationClass]]
    def parent_class_=(value: _root_.gtk.all.GtkApplicationClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkApplicationClass]] = value
    def padding: CArray[_root_.glib.all.gpointer, Nat._4] = !struct.at(392).asInstanceOf[Ptr[CArray[_root_.glib.all.gpointer, Nat._4]]]
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._4]): Unit = !struct.at(392).asInstanceOf[Ptr[CArray[_root_.glib.all.gpointer, Nat._4]]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-application-window.h
*/
opaque type AdwApplicationWindow = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]
object AdwApplicationWindow:
  given _tag: Tag[AdwApplicationWindow] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  def apply()(using Zone): Ptr[AdwApplicationWindow] = scala.scalanative.unsafe.alloc[AdwApplicationWindow](1)
  def apply(parent_instance : _root_.gtk.all.GtkApplicationWindow)(using Zone): Ptr[AdwApplicationWindow] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: AdwApplicationWindow)
    def parent_instance: _root_.gtk.all.GtkApplicationWindow = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkApplicationWindow]]
    def parent_instance_=(value: _root_.gtk.all.GtkApplicationWindow): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkApplicationWindow]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-application-window.h
*/
opaque type AdwApplicationWindowClass = CArray[CChar, Nat.Digit3[Nat._6, Nat._0, Nat._8]]
object AdwApplicationWindowClass:
  given _tag: Tag[AdwApplicationWindowClass] = Tag.CArray[CChar, Nat.Digit3[Nat._6, Nat._0, Nat._8]](Tag.Byte, Tag.Digit3[Nat._6, Nat._0, Nat._8](Tag.Nat6, Tag.Nat0, Tag.Nat8))
  def apply()(using Zone): Ptr[AdwApplicationWindowClass] = scala.scalanative.unsafe.alloc[AdwApplicationWindowClass](1)
  def apply(parent_class : _root_.gtk.all.GtkApplicationWindowClass, padding : CArray[_root_.glib.all.gpointer, Nat._4])(using Zone): Ptr[AdwApplicationWindowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: AdwApplicationWindowClass)
    def parent_class: _root_.gtk.all.GtkApplicationWindowClass = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkApplicationWindowClass]]
    def parent_class_=(value: _root_.gtk.all.GtkApplicationWindowClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkApplicationWindowClass]] = value
    def padding: CArray[_root_.glib.all.gpointer, Nat._4] = !struct.at(576).asInstanceOf[Ptr[CArray[_root_.glib.all.gpointer, Nat._4]]]
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._4]): Unit = !struct.at(576).asInstanceOf[Ptr[CArray[_root_.glib.all.gpointer, Nat._4]]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-avatar.h
*/
opaque type AdwAvatar = CStruct0
object AdwAvatar:
  given _tag: Tag[AdwAvatar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-avatar.h
*/
opaque type AdwAvatarClass = CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]]
object AdwAvatarClass:
  given _tag: Tag[AdwAvatarClass] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]](Tag.Byte, Tag.Digit3[Nat._4, Nat._0, Nat._8](Tag.Nat4, Tag.Nat0, Tag.Nat8))
  def apply()(using Zone): Ptr[AdwAvatarClass] = scala.scalanative.unsafe.alloc[AdwAvatarClass](1)
  def apply(parent_class : _root_.gtk.all.GtkWidgetClass)(using Zone): Ptr[AdwAvatarClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwAvatarClass)
    def parent_class: _root_.gtk.all.GtkWidgetClass = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]]
    def parent_class_=(value: _root_.gtk.all.GtkWidgetClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-bin.h
*/
opaque type AdwBin = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]
object AdwBin:
  given _tag: Tag[AdwBin] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  def apply()(using Zone): Ptr[AdwBin] = scala.scalanative.unsafe.alloc[AdwBin](1)
  def apply(parent_instance : _root_.gtk.all.GtkWidget)(using Zone): Ptr[AdwBin] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: AdwBin)
    def parent_instance: _root_.gtk.all.GtkWidget = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidget]]
    def parent_instance_=(value: _root_.gtk.all.GtkWidget): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidget]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-bin.h
*/
opaque type AdwBinClass = CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]]
object AdwBinClass:
  given _tag: Tag[AdwBinClass] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]](Tag.Byte, Tag.Digit3[Nat._4, Nat._0, Nat._8](Tag.Nat4, Tag.Nat0, Tag.Nat8))
  def apply()(using Zone): Ptr[AdwBinClass] = scala.scalanative.unsafe.alloc[AdwBinClass](1)
  def apply(parent_class : _root_.gtk.all.GtkWidgetClass)(using Zone): Ptr[AdwBinClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwBinClass)
    def parent_class: _root_.gtk.all.GtkWidgetClass = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]]
    def parent_class_=(value: _root_.gtk.all.GtkWidgetClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-button-content.h
*/
opaque type AdwButtonContent = CStruct0
object AdwButtonContent:
  given _tag: Tag[AdwButtonContent] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-button-content.h
*/
opaque type AdwButtonContentClass = CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]]
object AdwButtonContentClass:
  given _tag: Tag[AdwButtonContentClass] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]](Tag.Byte, Tag.Digit3[Nat._4, Nat._0, Nat._8](Tag.Nat4, Tag.Nat0, Tag.Nat8))
  def apply()(using Zone): Ptr[AdwButtonContentClass] = scala.scalanative.unsafe.alloc[AdwButtonContentClass](1)
  def apply(parent_class : _root_.gtk.all.GtkWidgetClass)(using Zone): Ptr[AdwButtonContentClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwButtonContentClass)
    def parent_class: _root_.gtk.all.GtkWidgetClass = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]]
    def parent_class_=(value: _root_.gtk.all.GtkWidgetClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-animation-target.h
*/
opaque type AdwCallbackAnimationTarget = CStruct0
object AdwCallbackAnimationTarget:
  given _tag: Tag[AdwCallbackAnimationTarget] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-animation-target.h
*/
opaque type AdwCallbackAnimationTargetClass = CStruct0
object AdwCallbackAnimationTargetClass:
  given _tag: Tag[AdwCallbackAnimationTargetClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-carousel.h
*/
opaque type AdwCarousel = CStruct0
object AdwCarousel:
  given _tag: Tag[AdwCarousel] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-carousel.h
*/
opaque type AdwCarouselClass = CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]]
object AdwCarouselClass:
  given _tag: Tag[AdwCarouselClass] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]](Tag.Byte, Tag.Digit3[Nat._4, Nat._0, Nat._8](Tag.Nat4, Tag.Nat0, Tag.Nat8))
  def apply()(using Zone): Ptr[AdwCarouselClass] = scala.scalanative.unsafe.alloc[AdwCarouselClass](1)
  def apply(parent_class : _root_.gtk.all.GtkWidgetClass)(using Zone): Ptr[AdwCarouselClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwCarouselClass)
    def parent_class: _root_.gtk.all.GtkWidgetClass = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]]
    def parent_class_=(value: _root_.gtk.all.GtkWidgetClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-carousel-indicator-dots.h
*/
opaque type AdwCarouselIndicatorDots = CStruct0
object AdwCarouselIndicatorDots:
  given _tag: Tag[AdwCarouselIndicatorDots] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-carousel-indicator-dots.h
*/
opaque type AdwCarouselIndicatorDotsClass = CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]]
object AdwCarouselIndicatorDotsClass:
  given _tag: Tag[AdwCarouselIndicatorDotsClass] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]](Tag.Byte, Tag.Digit3[Nat._4, Nat._0, Nat._8](Tag.Nat4, Tag.Nat0, Tag.Nat8))
  def apply()(using Zone): Ptr[AdwCarouselIndicatorDotsClass] = scala.scalanative.unsafe.alloc[AdwCarouselIndicatorDotsClass](1)
  def apply(parent_class : _root_.gtk.all.GtkWidgetClass)(using Zone): Ptr[AdwCarouselIndicatorDotsClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwCarouselIndicatorDotsClass)
    def parent_class: _root_.gtk.all.GtkWidgetClass = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]]
    def parent_class_=(value: _root_.gtk.all.GtkWidgetClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-carousel-indicator-lines.h
*/
opaque type AdwCarouselIndicatorLines = CStruct0
object AdwCarouselIndicatorLines:
  given _tag: Tag[AdwCarouselIndicatorLines] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-carousel-indicator-lines.h
*/
opaque type AdwCarouselIndicatorLinesClass = CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]]
object AdwCarouselIndicatorLinesClass:
  given _tag: Tag[AdwCarouselIndicatorLinesClass] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]](Tag.Byte, Tag.Digit3[Nat._4, Nat._0, Nat._8](Tag.Nat4, Tag.Nat0, Tag.Nat8))
  def apply()(using Zone): Ptr[AdwCarouselIndicatorLinesClass] = scala.scalanative.unsafe.alloc[AdwCarouselIndicatorLinesClass](1)
  def apply(parent_class : _root_.gtk.all.GtkWidgetClass)(using Zone): Ptr[AdwCarouselIndicatorLinesClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwCarouselIndicatorLinesClass)
    def parent_class: _root_.gtk.all.GtkWidgetClass = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]]
    def parent_class_=(value: _root_.gtk.all.GtkWidgetClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-clamp.h
*/
opaque type AdwClamp = CStruct0
object AdwClamp:
  given _tag: Tag[AdwClamp] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-clamp.h
*/
opaque type AdwClampClass = CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]]
object AdwClampClass:
  given _tag: Tag[AdwClampClass] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]](Tag.Byte, Tag.Digit3[Nat._4, Nat._0, Nat._8](Tag.Nat4, Tag.Nat0, Tag.Nat8))
  def apply()(using Zone): Ptr[AdwClampClass] = scala.scalanative.unsafe.alloc[AdwClampClass](1)
  def apply(parent_class : _root_.gtk.all.GtkWidgetClass)(using Zone): Ptr[AdwClampClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwClampClass)
    def parent_class: _root_.gtk.all.GtkWidgetClass = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]]
    def parent_class_=(value: _root_.gtk.all.GtkWidgetClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-clamp-layout.h
*/
opaque type AdwClampLayout = CStruct0
object AdwClampLayout:
  given _tag: Tag[AdwClampLayout] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-clamp-layout.h
*/
opaque type AdwClampLayoutClass = CArray[CChar, Nat.Digit3[Nat._3, Nat._2, Nat._0]]
object AdwClampLayoutClass:
  given _tag: Tag[AdwClampLayoutClass] = Tag.CArray[CChar, Nat.Digit3[Nat._3, Nat._2, Nat._0]](Tag.Byte, Tag.Digit3[Nat._3, Nat._2, Nat._0](Tag.Nat3, Tag.Nat2, Tag.Nat0))
  def apply()(using Zone): Ptr[AdwClampLayoutClass] = scala.scalanative.unsafe.alloc[AdwClampLayoutClass](1)
  def apply(parent_class : _root_.gtk.all.GtkLayoutManagerClass)(using Zone): Ptr[AdwClampLayoutClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwClampLayoutClass)
    def parent_class: _root_.gtk.all.GtkLayoutManagerClass = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkLayoutManagerClass]]
    def parent_class_=(value: _root_.gtk.all.GtkLayoutManagerClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkLayoutManagerClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-clamp-scrollable.h
*/
opaque type AdwClampScrollable = CStruct0
object AdwClampScrollable:
  given _tag: Tag[AdwClampScrollable] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-clamp-scrollable.h
*/
opaque type AdwClampScrollableClass = CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]]
object AdwClampScrollableClass:
  given _tag: Tag[AdwClampScrollableClass] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]](Tag.Byte, Tag.Digit3[Nat._4, Nat._0, Nat._8](Tag.Nat4, Tag.Nat0, Tag.Nat8))
  def apply()(using Zone): Ptr[AdwClampScrollableClass] = scala.scalanative.unsafe.alloc[AdwClampScrollableClass](1)
  def apply(parent_class : _root_.gtk.all.GtkWidgetClass)(using Zone): Ptr[AdwClampScrollableClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwClampScrollableClass)
    def parent_class: _root_.gtk.all.GtkWidgetClass = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]]
    def parent_class_=(value: _root_.gtk.all.GtkWidgetClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-combo-row.h
*/
opaque type AdwComboRow = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]
object AdwComboRow:
  given _tag: Tag[AdwComboRow] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  def apply()(using Zone): Ptr[AdwComboRow] = scala.scalanative.unsafe.alloc[AdwComboRow](1)
  def apply(parent_instance : AdwActionRow)(using Zone): Ptr[AdwComboRow] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: AdwComboRow)
    def parent_instance: AdwActionRow = !struct.at(0).asInstanceOf[Ptr[AdwActionRow]]
    def parent_instance_=(value: AdwActionRow): Unit = !struct.at(0).asInstanceOf[Ptr[AdwActionRow]] = value

/**
 * AdwComboRowClass _class: The parent class

 * [bindgen] header: /usr/include/libadwaita-1/adw-combo-row.h
*/
opaque type AdwComboRowClass = CArray[CChar, Nat.Digit3[Nat._5, Nat._8, Nat._4]]
object AdwComboRowClass:
  given _tag: Tag[AdwComboRowClass] = Tag.CArray[CChar, Nat.Digit3[Nat._5, Nat._8, Nat._4]](Tag.Byte, Tag.Digit3[Nat._5, Nat._8, Nat._4](Tag.Nat5, Tag.Nat8, Tag.Nat4))
  def apply()(using Zone): Ptr[AdwComboRowClass] = scala.scalanative.unsafe.alloc[AdwComboRowClass](1)
  def apply(parent_class : AdwActionRowClass, padding : CArray[_root_.glib.all.gpointer, Nat._4])(using Zone): Ptr[AdwComboRowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: AdwComboRowClass)
    def parent_class: AdwActionRowClass = !struct.at(0).asInstanceOf[Ptr[AdwActionRowClass]]
    def parent_class_=(value: AdwActionRowClass): Unit = !struct.at(0).asInstanceOf[Ptr[AdwActionRowClass]] = value
    def padding: CArray[_root_.glib.all.gpointer, Nat._4] = !struct.at(552).asInstanceOf[Ptr[CArray[_root_.glib.all.gpointer, Nat._4]]]
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._4]): Unit = !struct.at(552).asInstanceOf[Ptr[CArray[_root_.glib.all.gpointer, Nat._4]]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-enum-list-model.h
*/
opaque type AdwEnumListItem = CStruct0
object AdwEnumListItem:
  given _tag: Tag[AdwEnumListItem] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-enum-list-model.h
*/
opaque type AdwEnumListItemClass = CArray[CChar, Nat.Digit3[Nat._1, Nat._3, Nat._6]]
object AdwEnumListItemClass:
  given _tag: Tag[AdwEnumListItemClass] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._3, Nat._6]](Tag.Byte, Tag.Digit3[Nat._1, Nat._3, Nat._6](Tag.Nat1, Tag.Nat3, Tag.Nat6))
  def apply()(using Zone): Ptr[AdwEnumListItemClass] = scala.scalanative.unsafe.alloc[AdwEnumListItemClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[AdwEnumListItemClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwEnumListItemClass)
    def parent_class: _root_.gobject.all.GObjectClass = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObjectClass]]
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObjectClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-enum-list-model.h
*/
opaque type AdwEnumListModel = CStruct0
object AdwEnumListModel:
  given _tag: Tag[AdwEnumListModel] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-enum-list-model.h
*/
opaque type AdwEnumListModelClass = CArray[CChar, Nat.Digit3[Nat._1, Nat._3, Nat._6]]
object AdwEnumListModelClass:
  given _tag: Tag[AdwEnumListModelClass] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._3, Nat._6]](Tag.Byte, Tag.Digit3[Nat._1, Nat._3, Nat._6](Tag.Nat1, Tag.Nat3, Tag.Nat6))
  def apply()(using Zone): Ptr[AdwEnumListModelClass] = scala.scalanative.unsafe.alloc[AdwEnumListModelClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[AdwEnumListModelClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwEnumListModelClass)
    def parent_class: _root_.gobject.all.GObjectClass = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObjectClass]]
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObjectClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-expander-row.h
*/
opaque type AdwExpanderRow = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]
object AdwExpanderRow:
  given _tag: Tag[AdwExpanderRow] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  def apply()(using Zone): Ptr[AdwExpanderRow] = scala.scalanative.unsafe.alloc[AdwExpanderRow](1)
  def apply(parent_instance : AdwPreferencesRow)(using Zone): Ptr[AdwExpanderRow] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: AdwExpanderRow)
    def parent_instance: AdwPreferencesRow = !struct.at(0).asInstanceOf[Ptr[AdwPreferencesRow]]
    def parent_instance_=(value: AdwPreferencesRow): Unit = !struct.at(0).asInstanceOf[Ptr[AdwPreferencesRow]] = value

/**
 * AdwExpanderRowClass _class: The parent class

 * [bindgen] header: /usr/include/libadwaita-1/adw-expander-row.h
*/
opaque type AdwExpanderRowClass = CArray[CChar, Nat.Digit3[Nat._5, Nat._4, Nat._4]]
object AdwExpanderRowClass:
  given _tag: Tag[AdwExpanderRowClass] = Tag.CArray[CChar, Nat.Digit3[Nat._5, Nat._4, Nat._4]](Tag.Byte, Tag.Digit3[Nat._5, Nat._4, Nat._4](Tag.Nat5, Tag.Nat4, Tag.Nat4))
  def apply()(using Zone): Ptr[AdwExpanderRowClass] = scala.scalanative.unsafe.alloc[AdwExpanderRowClass](1)
  def apply(parent_class : AdwPreferencesRowClass, padding : CArray[_root_.glib.all.gpointer, Nat._4])(using Zone): Ptr[AdwExpanderRowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: AdwExpanderRowClass)
    def parent_class: AdwPreferencesRowClass = !struct.at(0).asInstanceOf[Ptr[AdwPreferencesRowClass]]
    def parent_class_=(value: AdwPreferencesRowClass): Unit = !struct.at(0).asInstanceOf[Ptr[AdwPreferencesRowClass]] = value
    def padding: CArray[_root_.glib.all.gpointer, Nat._4] = !struct.at(512).asInstanceOf[Ptr[CArray[_root_.glib.all.gpointer, Nat._4]]]
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._4]): Unit = !struct.at(512).asInstanceOf[Ptr[CArray[_root_.glib.all.gpointer, Nat._4]]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-flap.h
*/
opaque type AdwFlap = CStruct0
object AdwFlap:
  given _tag: Tag[AdwFlap] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-flap.h
*/
opaque type AdwFlapClass = CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]]
object AdwFlapClass:
  given _tag: Tag[AdwFlapClass] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]](Tag.Byte, Tag.Digit3[Nat._4, Nat._0, Nat._8](Tag.Nat4, Tag.Nat0, Tag.Nat8))
  def apply()(using Zone): Ptr[AdwFlapClass] = scala.scalanative.unsafe.alloc[AdwFlapClass](1)
  def apply(parent_class : _root_.gtk.all.GtkWidgetClass)(using Zone): Ptr[AdwFlapClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwFlapClass)
    def parent_class: _root_.gtk.all.GtkWidgetClass = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]]
    def parent_class_=(value: _root_.gtk.all.GtkWidgetClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-header-bar.h
*/
opaque type AdwHeaderBar = CStruct0
object AdwHeaderBar:
  given _tag: Tag[AdwHeaderBar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-header-bar.h
*/
opaque type AdwHeaderBarClass = CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]]
object AdwHeaderBarClass:
  given _tag: Tag[AdwHeaderBarClass] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]](Tag.Byte, Tag.Digit3[Nat._4, Nat._0, Nat._8](Tag.Nat4, Tag.Nat0, Tag.Nat8))
  def apply()(using Zone): Ptr[AdwHeaderBarClass] = scala.scalanative.unsafe.alloc[AdwHeaderBarClass](1)
  def apply(parent_class : _root_.gtk.all.GtkWidgetClass)(using Zone): Ptr[AdwHeaderBarClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwHeaderBarClass)
    def parent_class: _root_.gtk.all.GtkWidgetClass = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]]
    def parent_class_=(value: _root_.gtk.all.GtkWidgetClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-leaflet.h
*/
opaque type AdwLeaflet = CStruct0
object AdwLeaflet:
  given _tag: Tag[AdwLeaflet] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-leaflet.h
*/
opaque type AdwLeafletClass = CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]]
object AdwLeafletClass:
  given _tag: Tag[AdwLeafletClass] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]](Tag.Byte, Tag.Digit3[Nat._4, Nat._0, Nat._8](Tag.Nat4, Tag.Nat0, Tag.Nat8))
  def apply()(using Zone): Ptr[AdwLeafletClass] = scala.scalanative.unsafe.alloc[AdwLeafletClass](1)
  def apply(parent_class : _root_.gtk.all.GtkWidgetClass)(using Zone): Ptr[AdwLeafletClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwLeafletClass)
    def parent_class: _root_.gtk.all.GtkWidgetClass = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]]
    def parent_class_=(value: _root_.gtk.all.GtkWidgetClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-leaflet.h
*/
opaque type AdwLeafletPage = CStruct0
object AdwLeafletPage:
  given _tag: Tag[AdwLeafletPage] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-leaflet.h
*/
opaque type AdwLeafletPageClass = CArray[CChar, Nat.Digit3[Nat._1, Nat._3, Nat._6]]
object AdwLeafletPageClass:
  given _tag: Tag[AdwLeafletPageClass] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._3, Nat._6]](Tag.Byte, Tag.Digit3[Nat._1, Nat._3, Nat._6](Tag.Nat1, Tag.Nat3, Tag.Nat6))
  def apply()(using Zone): Ptr[AdwLeafletPageClass] = scala.scalanative.unsafe.alloc[AdwLeafletPageClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[AdwLeafletPageClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwLeafletPageClass)
    def parent_class: _root_.gobject.all.GObjectClass = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObjectClass]]
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObjectClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-group.h
*/
opaque type AdwPreferencesGroup = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]
object AdwPreferencesGroup:
  given _tag: Tag[AdwPreferencesGroup] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  def apply()(using Zone): Ptr[AdwPreferencesGroup] = scala.scalanative.unsafe.alloc[AdwPreferencesGroup](1)
  def apply(parent_instance : _root_.gtk.all.GtkWidget)(using Zone): Ptr[AdwPreferencesGroup] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: AdwPreferencesGroup)
    def parent_instance: _root_.gtk.all.GtkWidget = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidget]]
    def parent_instance_=(value: _root_.gtk.all.GtkWidget): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidget]] = value

/**
 * AdwPreferencesGroupClass _class: The parent class

 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-group.h
*/
opaque type AdwPreferencesGroupClass = CArray[CChar, Nat.Digit3[Nat._4, Nat._4, Nat._0]]
object AdwPreferencesGroupClass:
  given _tag: Tag[AdwPreferencesGroupClass] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._4, Nat._0]](Tag.Byte, Tag.Digit3[Nat._4, Nat._4, Nat._0](Tag.Nat4, Tag.Nat4, Tag.Nat0))
  def apply()(using Zone): Ptr[AdwPreferencesGroupClass] = scala.scalanative.unsafe.alloc[AdwPreferencesGroupClass](1)
  def apply(parent_class : _root_.gtk.all.GtkWidgetClass, padding : CArray[_root_.glib.all.gpointer, Nat._4])(using Zone): Ptr[AdwPreferencesGroupClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: AdwPreferencesGroupClass)
    def parent_class: _root_.gtk.all.GtkWidgetClass = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]]
    def parent_class_=(value: _root_.gtk.all.GtkWidgetClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]] = value
    def padding: CArray[_root_.glib.all.gpointer, Nat._4] = !struct.at(408).asInstanceOf[Ptr[CArray[_root_.glib.all.gpointer, Nat._4]]]
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._4]): Unit = !struct.at(408).asInstanceOf[Ptr[CArray[_root_.glib.all.gpointer, Nat._4]]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-page.h
*/
opaque type AdwPreferencesPage = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]
object AdwPreferencesPage:
  given _tag: Tag[AdwPreferencesPage] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  def apply()(using Zone): Ptr[AdwPreferencesPage] = scala.scalanative.unsafe.alloc[AdwPreferencesPage](1)
  def apply(parent_instance : _root_.gtk.all.GtkWidget)(using Zone): Ptr[AdwPreferencesPage] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: AdwPreferencesPage)
    def parent_instance: _root_.gtk.all.GtkWidget = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidget]]
    def parent_instance_=(value: _root_.gtk.all.GtkWidget): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidget]] = value

/**
 * AdwPreferencesPageClass _class: The parent class

 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-page.h
*/
opaque type AdwPreferencesPageClass = CArray[CChar, Nat.Digit3[Nat._4, Nat._4, Nat._0]]
object AdwPreferencesPageClass:
  given _tag: Tag[AdwPreferencesPageClass] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._4, Nat._0]](Tag.Byte, Tag.Digit3[Nat._4, Nat._4, Nat._0](Tag.Nat4, Tag.Nat4, Tag.Nat0))
  def apply()(using Zone): Ptr[AdwPreferencesPageClass] = scala.scalanative.unsafe.alloc[AdwPreferencesPageClass](1)
  def apply(parent_class : _root_.gtk.all.GtkWidgetClass, padding : CArray[_root_.glib.all.gpointer, Nat._4])(using Zone): Ptr[AdwPreferencesPageClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: AdwPreferencesPageClass)
    def parent_class: _root_.gtk.all.GtkWidgetClass = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]]
    def parent_class_=(value: _root_.gtk.all.GtkWidgetClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]] = value
    def padding: CArray[_root_.glib.all.gpointer, Nat._4] = !struct.at(408).asInstanceOf[Ptr[CArray[_root_.glib.all.gpointer, Nat._4]]]
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._4]): Unit = !struct.at(408).asInstanceOf[Ptr[CArray[_root_.glib.all.gpointer, Nat._4]]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-row.h
*/
opaque type AdwPreferencesRow = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]
object AdwPreferencesRow:
  given _tag: Tag[AdwPreferencesRow] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  def apply()(using Zone): Ptr[AdwPreferencesRow] = scala.scalanative.unsafe.alloc[AdwPreferencesRow](1)
  def apply(parent_instance : _root_.gtk.all.GtkListBoxRow)(using Zone): Ptr[AdwPreferencesRow] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: AdwPreferencesRow)
    def parent_instance: _root_.gtk.all.GtkListBoxRow = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkListBoxRow]]
    def parent_instance_=(value: _root_.gtk.all.GtkListBoxRow): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkListBoxRow]] = value

/**
 * AdwPreferencesRowClass _class: The parent class

 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-row.h
*/
opaque type AdwPreferencesRowClass = CArray[CChar, Nat.Digit3[Nat._5, Nat._1, Nat._2]]
object AdwPreferencesRowClass:
  given _tag: Tag[AdwPreferencesRowClass] = Tag.CArray[CChar, Nat.Digit3[Nat._5, Nat._1, Nat._2]](Tag.Byte, Tag.Digit3[Nat._5, Nat._1, Nat._2](Tag.Nat5, Tag.Nat1, Tag.Nat2))
  def apply()(using Zone): Ptr[AdwPreferencesRowClass] = scala.scalanative.unsafe.alloc[AdwPreferencesRowClass](1)
  def apply(parent_class : _root_.gtk.all.GtkListBoxRowClass, padding : CArray[_root_.glib.all.gpointer, Nat._4])(using Zone): Ptr[AdwPreferencesRowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: AdwPreferencesRowClass)
    def parent_class: _root_.gtk.all.GtkListBoxRowClass = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkListBoxRowClass]]
    def parent_class_=(value: _root_.gtk.all.GtkListBoxRowClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkListBoxRowClass]] = value
    def padding: CArray[_root_.glib.all.gpointer, Nat._4] = !struct.at(480).asInstanceOf[Ptr[CArray[_root_.glib.all.gpointer, Nat._4]]]
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._4]): Unit = !struct.at(480).asInstanceOf[Ptr[CArray[_root_.glib.all.gpointer, Nat._4]]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-window.h
*/
opaque type AdwPreferencesWindow = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]
object AdwPreferencesWindow:
  given _tag: Tag[AdwPreferencesWindow] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  def apply()(using Zone): Ptr[AdwPreferencesWindow] = scala.scalanative.unsafe.alloc[AdwPreferencesWindow](1)
  def apply(parent_instance : AdwWindow)(using Zone): Ptr[AdwPreferencesWindow] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: AdwPreferencesWindow)
    def parent_instance: AdwWindow = !struct.at(0).asInstanceOf[Ptr[AdwWindow]]
    def parent_instance_=(value: AdwWindow): Unit = !struct.at(0).asInstanceOf[Ptr[AdwWindow]] = value

/**
 * AdwPreferencesWindowClass _class: The parent class

 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-window.h
*/
opaque type AdwPreferencesWindowClass = CArray[CChar, Nat.Digit3[Nat._5, Nat._7, Nat._6]]
object AdwPreferencesWindowClass:
  given _tag: Tag[AdwPreferencesWindowClass] = Tag.CArray[CChar, Nat.Digit3[Nat._5, Nat._7, Nat._6]](Tag.Byte, Tag.Digit3[Nat._5, Nat._7, Nat._6](Tag.Nat5, Tag.Nat7, Tag.Nat6))
  def apply()(using Zone): Ptr[AdwPreferencesWindowClass] = scala.scalanative.unsafe.alloc[AdwPreferencesWindowClass](1)
  def apply(parent_class : AdwWindowClass, padding : CArray[_root_.glib.all.gpointer, Nat._4])(using Zone): Ptr[AdwPreferencesWindowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: AdwPreferencesWindowClass)
    def parent_class: AdwWindowClass = !struct.at(0).asInstanceOf[Ptr[AdwWindowClass]]
    def parent_class_=(value: AdwWindowClass): Unit = !struct.at(0).asInstanceOf[Ptr[AdwWindowClass]] = value
    def padding: CArray[_root_.glib.all.gpointer, Nat._4] = !struct.at(544).asInstanceOf[Ptr[CArray[_root_.glib.all.gpointer, Nat._4]]]
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._4]): Unit = !struct.at(544).asInstanceOf[Ptr[CArray[_root_.glib.all.gpointer, Nat._4]]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-split-button.h
*/
opaque type AdwSplitButton = CStruct0
object AdwSplitButton:
  given _tag: Tag[AdwSplitButton] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-split-button.h
*/
opaque type AdwSplitButtonClass = CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]]
object AdwSplitButtonClass:
  given _tag: Tag[AdwSplitButtonClass] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]](Tag.Byte, Tag.Digit3[Nat._4, Nat._0, Nat._8](Tag.Nat4, Tag.Nat0, Tag.Nat8))
  def apply()(using Zone): Ptr[AdwSplitButtonClass] = scala.scalanative.unsafe.alloc[AdwSplitButtonClass](1)
  def apply(parent_class : _root_.gtk.all.GtkWidgetClass)(using Zone): Ptr[AdwSplitButtonClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwSplitButtonClass)
    def parent_class: _root_.gtk.all.GtkWidgetClass = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]]
    def parent_class_=(value: _root_.gtk.all.GtkWidgetClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-spring-animation.h
*/
opaque type AdwSpringAnimation = CStruct0
object AdwSpringAnimation:
  given _tag: Tag[AdwSpringAnimation] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-spring-animation.h
*/
opaque type AdwSpringAnimationClass = CStruct0
object AdwSpringAnimationClass:
  given _tag: Tag[AdwSpringAnimationClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-spring-params.h
*/
opaque type AdwSpringParams = CStruct0
object AdwSpringParams:
  given _tag: Tag[AdwSpringParams] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-squeezer.h
*/
opaque type AdwSqueezer = CStruct0
object AdwSqueezer:
  given _tag: Tag[AdwSqueezer] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-squeezer.h
*/
opaque type AdwSqueezerClass = CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]]
object AdwSqueezerClass:
  given _tag: Tag[AdwSqueezerClass] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]](Tag.Byte, Tag.Digit3[Nat._4, Nat._0, Nat._8](Tag.Nat4, Tag.Nat0, Tag.Nat8))
  def apply()(using Zone): Ptr[AdwSqueezerClass] = scala.scalanative.unsafe.alloc[AdwSqueezerClass](1)
  def apply(parent_class : _root_.gtk.all.GtkWidgetClass)(using Zone): Ptr[AdwSqueezerClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwSqueezerClass)
    def parent_class: _root_.gtk.all.GtkWidgetClass = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]]
    def parent_class_=(value: _root_.gtk.all.GtkWidgetClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-squeezer.h
*/
opaque type AdwSqueezerPage = CStruct0
object AdwSqueezerPage:
  given _tag: Tag[AdwSqueezerPage] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-squeezer.h
*/
opaque type AdwSqueezerPageClass = CArray[CChar, Nat.Digit3[Nat._1, Nat._3, Nat._6]]
object AdwSqueezerPageClass:
  given _tag: Tag[AdwSqueezerPageClass] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._3, Nat._6]](Tag.Byte, Tag.Digit3[Nat._1, Nat._3, Nat._6](Tag.Nat1, Tag.Nat3, Tag.Nat6))
  def apply()(using Zone): Ptr[AdwSqueezerPageClass] = scala.scalanative.unsafe.alloc[AdwSqueezerPageClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[AdwSqueezerPageClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwSqueezerPageClass)
    def parent_class: _root_.gobject.all.GObjectClass = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObjectClass]]
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObjectClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-status-page.h
*/
opaque type AdwStatusPage = CStruct0
object AdwStatusPage:
  given _tag: Tag[AdwStatusPage] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-status-page.h
*/
opaque type AdwStatusPageClass = CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]]
object AdwStatusPageClass:
  given _tag: Tag[AdwStatusPageClass] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]](Tag.Byte, Tag.Digit3[Nat._4, Nat._0, Nat._8](Tag.Nat4, Tag.Nat0, Tag.Nat8))
  def apply()(using Zone): Ptr[AdwStatusPageClass] = scala.scalanative.unsafe.alloc[AdwStatusPageClass](1)
  def apply(parent_class : _root_.gtk.all.GtkWidgetClass)(using Zone): Ptr[AdwStatusPageClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwStatusPageClass)
    def parent_class: _root_.gtk.all.GtkWidgetClass = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]]
    def parent_class_=(value: _root_.gtk.all.GtkWidgetClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-style-manager.h
*/
opaque type AdwStyleManager = CStruct0
object AdwStyleManager:
  given _tag: Tag[AdwStyleManager] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-style-manager.h
*/
opaque type AdwStyleManagerClass = CArray[CChar, Nat.Digit3[Nat._1, Nat._3, Nat._6]]
object AdwStyleManagerClass:
  given _tag: Tag[AdwStyleManagerClass] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._3, Nat._6]](Tag.Byte, Tag.Digit3[Nat._1, Nat._3, Nat._6](Tag.Nat1, Tag.Nat3, Tag.Nat6))
  def apply()(using Zone): Ptr[AdwStyleManagerClass] = scala.scalanative.unsafe.alloc[AdwStyleManagerClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[AdwStyleManagerClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwStyleManagerClass)
    def parent_class: _root_.gobject.all.GObjectClass = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObjectClass]]
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObjectClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-swipe-tracker.h
*/
opaque type AdwSwipeTracker = CStruct0
object AdwSwipeTracker:
  given _tag: Tag[AdwSwipeTracker] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-swipe-tracker.h
*/
opaque type AdwSwipeTrackerClass = CArray[CChar, Nat.Digit3[Nat._1, Nat._3, Nat._6]]
object AdwSwipeTrackerClass:
  given _tag: Tag[AdwSwipeTrackerClass] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._3, Nat._6]](Tag.Byte, Tag.Digit3[Nat._1, Nat._3, Nat._6](Tag.Nat1, Tag.Nat3, Tag.Nat6))
  def apply()(using Zone): Ptr[AdwSwipeTrackerClass] = scala.scalanative.unsafe.alloc[AdwSwipeTrackerClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[AdwSwipeTrackerClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwSwipeTrackerClass)
    def parent_class: _root_.gobject.all.GObjectClass = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObjectClass]]
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObjectClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-swipeable.h
*/
opaque type AdwSwipeable = CStruct0
object AdwSwipeable:
  given _tag: Tag[AdwSwipeable] = Tag.materializeCStruct0Tag

/**
 * AdwSwipeableInterface: : The parent interface. _distance: Gets the swipe distance. _snap_points: Gets the snap points. _progress: Gets the current progress. _cancel_progress: Gets the cancel progress. _swipe_area: Gets the swipeable rectangle.

 * [bindgen] header: /usr/include/libadwaita-1/adw-swipeable.h
*/
opaque type AdwSwipeableInterface = CArray[CChar, Nat.Digit2[Nat._8, Nat._8]]
object AdwSwipeableInterface:
  given _tag: Tag[AdwSwipeableInterface] = Tag.CArray[CChar, Nat.Digit2[Nat._8, Nat._8]](Tag.Byte, Tag.Digit2[Nat._8, Nat._8](Tag.Nat8, Tag.Nat8))
  def apply()(using Zone): Ptr[AdwSwipeableInterface] = scala.scalanative.unsafe.alloc[AdwSwipeableInterface](1)
  def apply(parent : _root_.gobject.all.GTypeInterface, get_distance : CFuncPtr1[Ptr[AdwSwipeable], Double], get_snap_points : CFuncPtr2[Ptr[AdwSwipeable], Ptr[CInt], Ptr[Double]], get_progress : CFuncPtr1[Ptr[AdwSwipeable], Double], get_cancel_progress : CFuncPtr1[Ptr[AdwSwipeable], Double], get_swipe_area : CFuncPtr4[Ptr[AdwSwipeable], AdwNavigationDirection, _root_.glib.all.gboolean, Ptr[GdkRectangle], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._4])(using Zone): Ptr[AdwSwipeableInterface] = 
    val ____ptr = apply()
    (!____ptr).parent = parent
    (!____ptr).get_distance = get_distance
    (!____ptr).get_snap_points = get_snap_points
    (!____ptr).get_progress = get_progress
    (!____ptr).get_cancel_progress = get_cancel_progress
    (!____ptr).get_swipe_area = get_swipe_area
    (!____ptr).padding = padding
    ____ptr
  extension (struct: AdwSwipeableInterface)
    def parent: _root_.gobject.all.GTypeInterface = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GTypeInterface]]
    def parent_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GTypeInterface]] = value
    def get_distance: CFuncPtr1[Ptr[AdwSwipeable], Double] = !struct.at(16).asInstanceOf[Ptr[CFuncPtr1[Ptr[AdwSwipeable], Double]]]
    def get_distance_=(value: CFuncPtr1[Ptr[AdwSwipeable], Double]): Unit = !struct.at(16).asInstanceOf[Ptr[CFuncPtr1[Ptr[AdwSwipeable], Double]]] = value
    def get_snap_points: CFuncPtr2[Ptr[AdwSwipeable], Ptr[CInt], Ptr[Double]] = !struct.at(24).asInstanceOf[Ptr[CFuncPtr2[Ptr[AdwSwipeable], Ptr[CInt], Ptr[Double]]]]
    def get_snap_points_=(value: CFuncPtr2[Ptr[AdwSwipeable], Ptr[CInt], Ptr[Double]]): Unit = !struct.at(24).asInstanceOf[Ptr[CFuncPtr2[Ptr[AdwSwipeable], Ptr[CInt], Ptr[Double]]]] = value
    def get_progress: CFuncPtr1[Ptr[AdwSwipeable], Double] = !struct.at(32).asInstanceOf[Ptr[CFuncPtr1[Ptr[AdwSwipeable], Double]]]
    def get_progress_=(value: CFuncPtr1[Ptr[AdwSwipeable], Double]): Unit = !struct.at(32).asInstanceOf[Ptr[CFuncPtr1[Ptr[AdwSwipeable], Double]]] = value
    def get_cancel_progress: CFuncPtr1[Ptr[AdwSwipeable], Double] = !struct.at(40).asInstanceOf[Ptr[CFuncPtr1[Ptr[AdwSwipeable], Double]]]
    def get_cancel_progress_=(value: CFuncPtr1[Ptr[AdwSwipeable], Double]): Unit = !struct.at(40).asInstanceOf[Ptr[CFuncPtr1[Ptr[AdwSwipeable], Double]]] = value
    def get_swipe_area: CFuncPtr4[Ptr[AdwSwipeable], AdwNavigationDirection, _root_.glib.all.gboolean, Ptr[GdkRectangle], Unit] = !struct.at(48).asInstanceOf[Ptr[CFuncPtr4[Ptr[AdwSwipeable], AdwNavigationDirection, _root_.glib.all.gboolean, Ptr[GdkRectangle], Unit]]]
    def get_swipe_area_=(value: CFuncPtr4[Ptr[AdwSwipeable], AdwNavigationDirection, _root_.glib.all.gboolean, Ptr[GdkRectangle], Unit]): Unit = !struct.at(48).asInstanceOf[Ptr[CFuncPtr4[Ptr[AdwSwipeable], AdwNavigationDirection, _root_.glib.all.gboolean, Ptr[GdkRectangle], Unit]]] = value
    def padding: CArray[_root_.glib.all.gpointer, Nat._4] = !struct.at(56).asInstanceOf[Ptr[CArray[_root_.glib.all.gpointer, Nat._4]]]
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._4]): Unit = !struct.at(56).asInstanceOf[Ptr[CArray[_root_.glib.all.gpointer, Nat._4]]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-tab-bar.h
*/
opaque type AdwTabBar = CStruct0
object AdwTabBar:
  given _tag: Tag[AdwTabBar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-tab-bar.h
*/
opaque type AdwTabBarClass = CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]]
object AdwTabBarClass:
  given _tag: Tag[AdwTabBarClass] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]](Tag.Byte, Tag.Digit3[Nat._4, Nat._0, Nat._8](Tag.Nat4, Tag.Nat0, Tag.Nat8))
  def apply()(using Zone): Ptr[AdwTabBarClass] = scala.scalanative.unsafe.alloc[AdwTabBarClass](1)
  def apply(parent_class : _root_.gtk.all.GtkWidgetClass)(using Zone): Ptr[AdwTabBarClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwTabBarClass)
    def parent_class: _root_.gtk.all.GtkWidgetClass = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]]
    def parent_class_=(value: _root_.gtk.all.GtkWidgetClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-tab-view.h
*/
opaque type AdwTabPage = CStruct0
object AdwTabPage:
  given _tag: Tag[AdwTabPage] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-tab-view.h
*/
opaque type AdwTabPageClass = CArray[CChar, Nat.Digit3[Nat._1, Nat._3, Nat._6]]
object AdwTabPageClass:
  given _tag: Tag[AdwTabPageClass] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._3, Nat._6]](Tag.Byte, Tag.Digit3[Nat._1, Nat._3, Nat._6](Tag.Nat1, Tag.Nat3, Tag.Nat6))
  def apply()(using Zone): Ptr[AdwTabPageClass] = scala.scalanative.unsafe.alloc[AdwTabPageClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[AdwTabPageClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwTabPageClass)
    def parent_class: _root_.gobject.all.GObjectClass = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObjectClass]]
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObjectClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-tab-view.h
*/
opaque type AdwTabView = CStruct0
object AdwTabView:
  given _tag: Tag[AdwTabView] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-tab-view.h
*/
opaque type AdwTabViewClass = CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]]
object AdwTabViewClass:
  given _tag: Tag[AdwTabViewClass] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]](Tag.Byte, Tag.Digit3[Nat._4, Nat._0, Nat._8](Tag.Nat4, Tag.Nat0, Tag.Nat8))
  def apply()(using Zone): Ptr[AdwTabViewClass] = scala.scalanative.unsafe.alloc[AdwTabViewClass](1)
  def apply(parent_class : _root_.gtk.all.GtkWidgetClass)(using Zone): Ptr[AdwTabViewClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwTabViewClass)
    def parent_class: _root_.gtk.all.GtkWidgetClass = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]]
    def parent_class_=(value: _root_.gtk.all.GtkWidgetClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-timed-animation.h
*/
opaque type AdwTimedAnimation = CStruct0
object AdwTimedAnimation:
  given _tag: Tag[AdwTimedAnimation] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-timed-animation.h
*/
opaque type AdwTimedAnimationClass = CStruct0
object AdwTimedAnimationClass:
  given _tag: Tag[AdwTimedAnimationClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-toast.h
*/
opaque type AdwToast = CStruct0
object AdwToast:
  given _tag: Tag[AdwToast] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-toast.h
*/
opaque type AdwToastClass = CArray[CChar, Nat.Digit3[Nat._1, Nat._3, Nat._6]]
object AdwToastClass:
  given _tag: Tag[AdwToastClass] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._3, Nat._6]](Tag.Byte, Tag.Digit3[Nat._1, Nat._3, Nat._6](Tag.Nat1, Tag.Nat3, Tag.Nat6))
  def apply()(using Zone): Ptr[AdwToastClass] = scala.scalanative.unsafe.alloc[AdwToastClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[AdwToastClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwToastClass)
    def parent_class: _root_.gobject.all.GObjectClass = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObjectClass]]
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObjectClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-toast-overlay.h
*/
opaque type AdwToastOverlay = CStruct0
object AdwToastOverlay:
  given _tag: Tag[AdwToastOverlay] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-toast-overlay.h
*/
opaque type AdwToastOverlayClass = CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]]
object AdwToastOverlayClass:
  given _tag: Tag[AdwToastOverlayClass] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]](Tag.Byte, Tag.Digit3[Nat._4, Nat._0, Nat._8](Tag.Nat4, Tag.Nat0, Tag.Nat8))
  def apply()(using Zone): Ptr[AdwToastOverlayClass] = scala.scalanative.unsafe.alloc[AdwToastOverlayClass](1)
  def apply(parent_class : _root_.gtk.all.GtkWidgetClass)(using Zone): Ptr[AdwToastOverlayClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwToastOverlayClass)
    def parent_class: _root_.gtk.all.GtkWidgetClass = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]]
    def parent_class_=(value: _root_.gtk.all.GtkWidgetClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-stack.h
*/
opaque type AdwViewStack = CStruct0
object AdwViewStack:
  given _tag: Tag[AdwViewStack] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-stack.h
*/
opaque type AdwViewStackClass = CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]]
object AdwViewStackClass:
  given _tag: Tag[AdwViewStackClass] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]](Tag.Byte, Tag.Digit3[Nat._4, Nat._0, Nat._8](Tag.Nat4, Tag.Nat0, Tag.Nat8))
  def apply()(using Zone): Ptr[AdwViewStackClass] = scala.scalanative.unsafe.alloc[AdwViewStackClass](1)
  def apply(parent_class : _root_.gtk.all.GtkWidgetClass)(using Zone): Ptr[AdwViewStackClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwViewStackClass)
    def parent_class: _root_.gtk.all.GtkWidgetClass = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]]
    def parent_class_=(value: _root_.gtk.all.GtkWidgetClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-stack.h
*/
opaque type AdwViewStackPage = CStruct0
object AdwViewStackPage:
  given _tag: Tag[AdwViewStackPage] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-stack.h
*/
opaque type AdwViewStackPageClass = CArray[CChar, Nat.Digit3[Nat._1, Nat._3, Nat._6]]
object AdwViewStackPageClass:
  given _tag: Tag[AdwViewStackPageClass] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._3, Nat._6]](Tag.Byte, Tag.Digit3[Nat._1, Nat._3, Nat._6](Tag.Nat1, Tag.Nat3, Tag.Nat6))
  def apply()(using Zone): Ptr[AdwViewStackPageClass] = scala.scalanative.unsafe.alloc[AdwViewStackPageClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[AdwViewStackPageClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwViewStackPageClass)
    def parent_class: _root_.gobject.all.GObjectClass = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObjectClass]]
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObjectClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-switcher.h
*/
opaque type AdwViewSwitcher = CStruct0
object AdwViewSwitcher:
  given _tag: Tag[AdwViewSwitcher] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-switcher-bar.h
*/
opaque type AdwViewSwitcherBar = CStruct0
object AdwViewSwitcherBar:
  given _tag: Tag[AdwViewSwitcherBar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-switcher-bar.h
*/
opaque type AdwViewSwitcherBarClass = CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]]
object AdwViewSwitcherBarClass:
  given _tag: Tag[AdwViewSwitcherBarClass] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]](Tag.Byte, Tag.Digit3[Nat._4, Nat._0, Nat._8](Tag.Nat4, Tag.Nat0, Tag.Nat8))
  def apply()(using Zone): Ptr[AdwViewSwitcherBarClass] = scala.scalanative.unsafe.alloc[AdwViewSwitcherBarClass](1)
  def apply(parent_class : _root_.gtk.all.GtkWidgetClass)(using Zone): Ptr[AdwViewSwitcherBarClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwViewSwitcherBarClass)
    def parent_class: _root_.gtk.all.GtkWidgetClass = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]]
    def parent_class_=(value: _root_.gtk.all.GtkWidgetClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-switcher.h
*/
opaque type AdwViewSwitcherClass = CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]]
object AdwViewSwitcherClass:
  given _tag: Tag[AdwViewSwitcherClass] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]](Tag.Byte, Tag.Digit3[Nat._4, Nat._0, Nat._8](Tag.Nat4, Tag.Nat0, Tag.Nat8))
  def apply()(using Zone): Ptr[AdwViewSwitcherClass] = scala.scalanative.unsafe.alloc[AdwViewSwitcherClass](1)
  def apply(parent_class : _root_.gtk.all.GtkWidgetClass)(using Zone): Ptr[AdwViewSwitcherClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwViewSwitcherClass)
    def parent_class: _root_.gtk.all.GtkWidgetClass = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]]
    def parent_class_=(value: _root_.gtk.all.GtkWidgetClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-switcher-title.h
*/
opaque type AdwViewSwitcherTitle = CStruct0
object AdwViewSwitcherTitle:
  given _tag: Tag[AdwViewSwitcherTitle] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-switcher-title.h
*/
opaque type AdwViewSwitcherTitleClass = CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]]
object AdwViewSwitcherTitleClass:
  given _tag: Tag[AdwViewSwitcherTitleClass] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]](Tag.Byte, Tag.Digit3[Nat._4, Nat._0, Nat._8](Tag.Nat4, Tag.Nat0, Tag.Nat8))
  def apply()(using Zone): Ptr[AdwViewSwitcherTitleClass] = scala.scalanative.unsafe.alloc[AdwViewSwitcherTitleClass](1)
  def apply(parent_class : _root_.gtk.all.GtkWidgetClass)(using Zone): Ptr[AdwViewSwitcherTitleClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwViewSwitcherTitleClass)
    def parent_class: _root_.gtk.all.GtkWidgetClass = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]]
    def parent_class_=(value: _root_.gtk.all.GtkWidgetClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-window.h
*/
opaque type AdwWindow = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]
object AdwWindow:
  given _tag: Tag[AdwWindow] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  def apply()(using Zone): Ptr[AdwWindow] = scala.scalanative.unsafe.alloc[AdwWindow](1)
  def apply(parent_instance : _root_.gtk.all.GtkWindow)(using Zone): Ptr[AdwWindow] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: AdwWindow)
    def parent_instance: _root_.gtk.all.GtkWindow = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWindow]]
    def parent_instance_=(value: _root_.gtk.all.GtkWindow): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWindow]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-window.h
*/
opaque type AdwWindowClass = CArray[CChar, Nat.Digit3[Nat._5, Nat._4, Nat._4]]
object AdwWindowClass:
  given _tag: Tag[AdwWindowClass] = Tag.CArray[CChar, Nat.Digit3[Nat._5, Nat._4, Nat._4]](Tag.Byte, Tag.Digit3[Nat._5, Nat._4, Nat._4](Tag.Nat5, Tag.Nat4, Tag.Nat4))
  def apply()(using Zone): Ptr[AdwWindowClass] = scala.scalanative.unsafe.alloc[AdwWindowClass](1)
  def apply(parent_class : _root_.gtk.all.GtkWindowClass, padding : CArray[_root_.glib.all.gpointer, Nat._4])(using Zone): Ptr[AdwWindowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: AdwWindowClass)
    def parent_class: _root_.gtk.all.GtkWindowClass = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWindowClass]]
    def parent_class_=(value: _root_.gtk.all.GtkWindowClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWindowClass]] = value
    def padding: CArray[_root_.glib.all.gpointer, Nat._4] = !struct.at(512).asInstanceOf[Ptr[CArray[_root_.glib.all.gpointer, Nat._4]]]
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._4]): Unit = !struct.at(512).asInstanceOf[Ptr[CArray[_root_.glib.all.gpointer, Nat._4]]] = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-window-title.h
*/
opaque type AdwWindowTitle = CStruct0
object AdwWindowTitle:
  given _tag: Tag[AdwWindowTitle] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-window-title.h
*/
opaque type AdwWindowTitleClass = CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]]
object AdwWindowTitleClass:
  given _tag: Tag[AdwWindowTitleClass] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]](Tag.Byte, Tag.Digit3[Nat._4, Nat._0, Nat._8](Tag.Nat4, Tag.Nat0, Tag.Nat8))
  def apply()(using Zone): Ptr[AdwWindowTitleClass] = scala.scalanative.unsafe.alloc[AdwWindowTitleClass](1)
  def apply(parent_class : _root_.gtk.all.GtkWidgetClass)(using Zone): Ptr[AdwWindowTitleClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwWindowTitleClass)
    def parent_class: _root_.gtk.all.GtkWidgetClass = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]]
    def parent_class_=(value: _root_.gtk.all.GtkWidgetClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gtk.all.GtkWidgetClass]] = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type GdkAppLaunchContext = CStruct0
object GdkAppLaunchContext:
  given _tag: Tag[GdkAppLaunchContext] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type GdkButtonEvent = CStruct0
object GdkButtonEvent:
  given _tag: Tag[GdkButtonEvent] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type GdkCairoContext = CStruct0
object GdkCairoContext:
  given _tag: Tag[GdkCairoContext] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type GdkClipboard = CStruct0
object GdkClipboard:
  given _tag: Tag[GdkClipboard] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkcontentdeserializer.h
*/
opaque type GdkContentDeserializer = CStruct0
object GdkContentDeserializer:
  given _tag: Tag[GdkContentDeserializer] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type GdkContentFormats = CStruct0
object GdkContentFormats:
  given _tag: Tag[GdkContentFormats] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkcontentformats.h
*/
opaque type GdkContentFormatsBuilder = CStruct0
object GdkContentFormatsBuilder:
  given _tag: Tag[GdkContentFormatsBuilder] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkcontentprovider.h
*/
opaque type GdkContentProvider = CArray[CChar, Nat.Digit2[Nat._2, Nat._4]]
object GdkContentProvider:
  given _tag: Tag[GdkContentProvider] = Tag.CArray[CChar, Nat.Digit2[Nat._2, Nat._4]](Tag.Byte, Tag.Digit2[Nat._2, Nat._4](Tag.Nat2, Tag.Nat4))
  def apply()(using Zone): Ptr[GdkContentProvider] = scala.scalanative.unsafe.alloc[GdkContentProvider](1)
  def apply(parent : _root_.gobject.all.GObject)(using Zone): Ptr[GdkContentProvider] = 
    val ____ptr = apply()
    (!____ptr).parent = parent
    ____ptr
  extension (struct: GdkContentProvider)
    def parent: _root_.gobject.all.GObject = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObject]]
    def parent_=(value: _root_.gobject.all.GObject): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObject]] = value

/**
 * GdkContentProviderClass: _changed: Signal class closure for `GdkContentProvider::content-changed`

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkcontentprovider.h
*/
opaque type GdkContentProviderClass = CArray[CChar, Nat.Digit3[Nat._2, Nat._6, Nat._4]]
object GdkContentProviderClass:
  given _tag: Tag[GdkContentProviderClass] = Tag.CArray[CChar, Nat.Digit3[Nat._2, Nat._6, Nat._4]](Tag.Byte, Tag.Digit3[Nat._2, Nat._6, Nat._4](Tag.Nat2, Tag.Nat6, Tag.Nat4))
  def apply()(using Zone): Ptr[GdkContentProviderClass] = scala.scalanative.unsafe.alloc[GdkContentProviderClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, content_changed : CFuncPtr1[Ptr[GdkContentProvider], Unit], attach_clipboard : CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit], detach_clipboard : CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit], ref_formats : CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]], ref_storable_formats : CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]], write_mime_type_async : CFuncPtr7[Ptr[GdkContentProvider], CString, Ptr[_root_.gio.all.GOutputStream], CInt, Ptr[_root_.gio.all.GCancellable], _root_.gio.all.GAsyncReadyCallback, _root_.glib.all.gpointer, Unit], write_mime_type_finish : CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.gio.all.GAsyncResult], Ptr[Ptr[_root_.glib.all.GError]], _root_.glib.all.gboolean], get_value : CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.gobject.all.GValue], Ptr[Ptr[_root_.glib.all.GError]], _root_.glib.all.gboolean], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GdkContentProviderClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).content_changed = content_changed
    (!____ptr).attach_clipboard = attach_clipboard
    (!____ptr).detach_clipboard = detach_clipboard
    (!____ptr).ref_formats = ref_formats
    (!____ptr).ref_storable_formats = ref_storable_formats
    (!____ptr).write_mime_type_async = write_mime_type_async
    (!____ptr).write_mime_type_finish = write_mime_type_finish
    (!____ptr).get_value = get_value
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GdkContentProviderClass)
    def parent_class: _root_.gobject.all.GObjectClass = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObjectClass]]
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObjectClass]] = value
    def content_changed: CFuncPtr1[Ptr[GdkContentProvider], Unit] = !struct.at(136).asInstanceOf[Ptr[CFuncPtr1[Ptr[GdkContentProvider], Unit]]]
    def content_changed_=(value: CFuncPtr1[Ptr[GdkContentProvider], Unit]): Unit = !struct.at(136).asInstanceOf[Ptr[CFuncPtr1[Ptr[GdkContentProvider], Unit]]] = value
    def attach_clipboard: CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit] = !struct.at(144).asInstanceOf[Ptr[CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit]]]
    def attach_clipboard_=(value: CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit]): Unit = !struct.at(144).asInstanceOf[Ptr[CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit]]] = value
    def detach_clipboard: CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit] = !struct.at(152).asInstanceOf[Ptr[CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit]]]
    def detach_clipboard_=(value: CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit]): Unit = !struct.at(152).asInstanceOf[Ptr[CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit]]] = value
    def ref_formats: CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]] = !struct.at(160).asInstanceOf[Ptr[CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]]]]
    def ref_formats_=(value: CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]]): Unit = !struct.at(160).asInstanceOf[Ptr[CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]]]] = value
    def ref_storable_formats: CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]] = !struct.at(168).asInstanceOf[Ptr[CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]]]]
    def ref_storable_formats_=(value: CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]]): Unit = !struct.at(168).asInstanceOf[Ptr[CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]]]] = value
    def write_mime_type_async: CFuncPtr7[Ptr[GdkContentProvider], CString, Ptr[_root_.gio.all.GOutputStream], CInt, Ptr[_root_.gio.all.GCancellable], _root_.gio.all.GAsyncReadyCallback, _root_.glib.all.gpointer, Unit] = !struct.at(176).asInstanceOf[Ptr[CFuncPtr7[Ptr[GdkContentProvider], CString, Ptr[_root_.gio.all.GOutputStream], CInt, Ptr[_root_.gio.all.GCancellable], _root_.gio.all.GAsyncReadyCallback, _root_.glib.all.gpointer, Unit]]]
    def write_mime_type_async_=(value: CFuncPtr7[Ptr[GdkContentProvider], CString, Ptr[_root_.gio.all.GOutputStream], CInt, Ptr[_root_.gio.all.GCancellable], _root_.gio.all.GAsyncReadyCallback, _root_.glib.all.gpointer, Unit]): Unit = !struct.at(176).asInstanceOf[Ptr[CFuncPtr7[Ptr[GdkContentProvider], CString, Ptr[_root_.gio.all.GOutputStream], CInt, Ptr[_root_.gio.all.GCancellable], _root_.gio.all.GAsyncReadyCallback, _root_.glib.all.gpointer, Unit]]] = value
    def write_mime_type_finish: CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.gio.all.GAsyncResult], Ptr[Ptr[_root_.glib.all.GError]], _root_.glib.all.gboolean] = !struct.at(184).asInstanceOf[Ptr[CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.gio.all.GAsyncResult], Ptr[Ptr[_root_.glib.all.GError]], _root_.glib.all.gboolean]]]
    def write_mime_type_finish_=(value: CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.gio.all.GAsyncResult], Ptr[Ptr[_root_.glib.all.GError]], _root_.glib.all.gboolean]): Unit = !struct.at(184).asInstanceOf[Ptr[CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.gio.all.GAsyncResult], Ptr[Ptr[_root_.glib.all.GError]], _root_.glib.all.gboolean]]] = value
    def get_value: CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.gobject.all.GValue], Ptr[Ptr[_root_.glib.all.GError]], _root_.glib.all.gboolean] = !struct.at(192).asInstanceOf[Ptr[CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.gobject.all.GValue], Ptr[Ptr[_root_.glib.all.GError]], _root_.glib.all.gboolean]]]
    def get_value_=(value: CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.gobject.all.GValue], Ptr[Ptr[_root_.glib.all.GError]], _root_.glib.all.gboolean]): Unit = !struct.at(192).asInstanceOf[Ptr[CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.gobject.all.GValue], Ptr[Ptr[_root_.glib.all.GError]], _root_.glib.all.gboolean]]] = value
    def padding: CArray[_root_.glib.all.gpointer, Nat._8] = !struct.at(200).asInstanceOf[Ptr[CArray[_root_.glib.all.gpointer, Nat._8]]]
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at(200).asInstanceOf[Ptr[CArray[_root_.glib.all.gpointer, Nat._8]]] = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkcontentserializer.h
*/
opaque type GdkContentSerializer = CStruct0
object GdkContentSerializer:
  given _tag: Tag[GdkContentSerializer] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type GdkCrossingEvent = CStruct0
object GdkCrossingEvent:
  given _tag: Tag[GdkCrossingEvent] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type GdkCursor = CStruct0
object GdkCursor:
  given _tag: Tag[GdkCursor] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type GdkDNDEvent = CStruct0
object GdkDNDEvent:
  given _tag: Tag[GdkDNDEvent] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type GdkDeleteEvent = CStruct0
object GdkDeleteEvent:
  given _tag: Tag[GdkDeleteEvent] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type GdkDevice = CStruct0
object GdkDevice:
  given _tag: Tag[GdkDevice] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkdevicepad.h
*/
opaque type GdkDevicePad = CStruct0
object GdkDevicePad:
  given _tag: Tag[GdkDevicePad] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkdevicepad.h
*/
opaque type GdkDevicePadInterface = CStruct0
object GdkDevicePadInterface:
  given _tag: Tag[GdkDevicePadInterface] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkdevicetool.h
*/
opaque type GdkDeviceTool = CStruct0
object GdkDeviceTool:
  given _tag: Tag[GdkDeviceTool] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type GdkDisplay = CStruct0
object GdkDisplay:
  given _tag: Tag[GdkDisplay] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type GdkDisplayManager = CStruct0
object GdkDisplayManager:
  given _tag: Tag[GdkDisplayManager] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type GdkDrag = CStruct0
object GdkDrag:
  given _tag: Tag[GdkDrag] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkdragsurface.h
*/
opaque type GdkDragSurface = CStruct0
object GdkDragSurface:
  given _tag: Tag[GdkDragSurface] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkdragsurface.h
*/
opaque type GdkDragSurfaceInterface = CStruct0
object GdkDragSurfaceInterface:
  given _tag: Tag[GdkDragSurfaceInterface] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type GdkDrawContext = CStruct0
object GdkDrawContext:
  given _tag: Tag[GdkDrawContext] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type GdkDrop = CStruct0
object GdkDrop:
  given _tag: Tag[GdkDrop] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type GdkEvent = CStruct0
object GdkEvent:
  given _tag: Tag[GdkEvent] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type GdkEventSequence = CStruct0
object GdkEventSequence:
  given _tag: Tag[GdkEventSequence] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkcontentformats.h
*/
opaque type GdkFileList = CStruct0
object GdkFileList:
  given _tag: Tag[GdkFileList] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type GdkFocusEvent = CStruct0
object GdkFocusEvent:
  given _tag: Tag[GdkFocusEvent] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkframeclock.h
*/
opaque type GdkFrameClock = CStruct0
object GdkFrameClock:
  given _tag: Tag[GdkFrameClock] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkframeclock.h
*/
opaque type GdkFrameClockClass = CStruct0
object GdkFrameClockClass:
  given _tag: Tag[GdkFrameClockClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkframeclock.h
*/
opaque type GdkFrameClockPrivate = CStruct0
object GdkFrameClockPrivate:
  given _tag: Tag[GdkFrameClockPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkframetimings.h
*/
opaque type GdkFrameTimings = CStruct0
object GdkFrameTimings:
  given _tag: Tag[GdkFrameTimings] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type GdkGLContext = CStruct0
object GdkGLContext:
  given _tag: Tag[GdkGLContext] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkgltexture.h
*/
opaque type GdkGLTexture = CStruct0
object GdkGLTexture:
  given _tag: Tag[GdkGLTexture] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkgltexture.h
*/
opaque type GdkGLTextureClass = CStruct0
object GdkGLTextureClass:
  given _tag: Tag[GdkGLTextureClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type GdkGrabBrokenEvent = CStruct0
object GdkGrabBrokenEvent:
  given _tag: Tag[GdkGrabBrokenEvent] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type GdkKeyEvent = CStruct0
object GdkKeyEvent:
  given _tag: Tag[GdkKeyEvent] = Tag.materializeCStruct0Tag

/**
 * GdkKeymapKey: : the hardware keycode. This is an identifying number for a physical key. : indicates movement in a horizontal direction. Usually groups are used for two different languages. In group 0, a key might have two English characters, and in group 1 it might have two Hebrew characters. The Hebrew characters will be printed on the key next to the English characters. : indicates which symbol on the key will be used, in a vertical direction. So on a standard US keyboard, the key with the number “1” on it also has the exclamation point ("!") character on it. The level indicates whether to use the “1” or the “!” symbol. The letter keys are considered to have a lowercase letter at level 0, and an uppercase letter at level 1, though only the uppercase letter is printed.

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type GdkKeymapKey = CArray[CChar, Nat.Digit2[Nat._1, Nat._2]]
object GdkKeymapKey:
  given _tag: Tag[GdkKeymapKey] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._2]](Tag.Byte, Tag.Digit2[Nat._1, Nat._2](Tag.Nat1, Tag.Nat2))
  def apply()(using Zone): Ptr[GdkKeymapKey] = scala.scalanative.unsafe.alloc[GdkKeymapKey](1)
  def apply(keycode : _root_.glib.all.guint, group : CInt, level : CInt)(using Zone): Ptr[GdkKeymapKey] = 
    val ____ptr = apply()
    (!____ptr).keycode = keycode
    (!____ptr).group = group
    (!____ptr).level = level
    ____ptr
  extension (struct: GdkKeymapKey)
    def keycode: _root_.glib.all.guint = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.guint]]
    def keycode_=(value: _root_.glib.all.guint): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.guint]] = value
    def group: CInt = !struct.at(4).asInstanceOf[Ptr[CInt]]
    def group_=(value: CInt): Unit = !struct.at(4).asInstanceOf[Ptr[CInt]] = value
    def level: CInt = !struct.at(8).asInstanceOf[Ptr[CInt]]
    def level_=(value: CInt): Unit = !struct.at(8).asInstanceOf[Ptr[CInt]] = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkmemorytexture.h
*/
opaque type GdkMemoryTexture = CStruct0
object GdkMemoryTexture:
  given _tag: Tag[GdkMemoryTexture] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkmemorytexture.h
*/
opaque type GdkMemoryTextureClass = CStruct0
object GdkMemoryTextureClass:
  given _tag: Tag[GdkMemoryTextureClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkmonitor.h
*/
opaque type GdkMonitor = CStruct0
object GdkMonitor:
  given _tag: Tag[GdkMonitor] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkmonitor.h
*/
opaque type GdkMonitorClass = CStruct0
object GdkMonitorClass:
  given _tag: Tag[GdkMonitorClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type GdkMotionEvent = CStruct0
object GdkMotionEvent:
  given _tag: Tag[GdkMotionEvent] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type GdkPadEvent = CStruct0
object GdkPadEvent:
  given _tag: Tag[GdkPadEvent] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkpaintable.h
*/
opaque type GdkPaintable = CStruct0
object GdkPaintable:
  given _tag: Tag[GdkPaintable] = Tag.materializeCStruct0Tag

/**
 * GdkPaintableInterface: : Snapshot the paintable. The given and are guaranteed to be larger than 0.0. The resulting snapshot must modify only the area in the rectangle from (0,0) to (width, height). This is the only function that must be implemented for this interface. _current_image: return a `GdkPaintable` that does not change over time. This means the `GDK_PAINTABLE_STATIC_SIZE` and `GDK_PAINTABLE_STATIC_CONTENTS` flag are set. _flags: Get the flags for this instance. See [enum.PaintableFlags] for details. _intrinsic_width: The preferred width for this object to be snapshot at or 0 if none. This is purely a hint. The object must still be able to render at any size. _intrinsic_height: The preferred height for this object to be snapshot at or 0 if none. This is purely a hint. The object must still be able to render at any size. _intrinsic_aspect_ratio: The preferred aspect ratio for this object or 0 if none. If both [vfunc.Paintable.get_intrinsic_width] and [vfunc.Paintable.get_intrinsic_height] return non-zero values, this function should return the aspect ratio computed from those.

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkpaintable.h
*/
opaque type GdkPaintableInterface = CArray[CChar, Nat.Digit2[Nat._6, Nat._4]]
object GdkPaintableInterface:
  given _tag: Tag[GdkPaintableInterface] = Tag.CArray[CChar, Nat.Digit2[Nat._6, Nat._4]](Tag.Byte, Tag.Digit2[Nat._6, Nat._4](Tag.Nat6, Tag.Nat4))
  def apply()(using Zone): Ptr[GdkPaintableInterface] = scala.scalanative.unsafe.alloc[GdkPaintableInterface](1)
  def apply(g_iface : _root_.gobject.all.GTypeInterface, snapshot : CFuncPtr4[Ptr[GdkPaintable], Ptr[GdkSnapshot], Double, Double, Unit], get_current_image : CFuncPtr1[Ptr[GdkPaintable], Ptr[GdkPaintable]], get_flags : CFuncPtr1[Ptr[GdkPaintable], GdkPaintableFlags], get_intrinsic_width : CFuncPtr1[Ptr[GdkPaintable], CInt], get_intrinsic_height : CFuncPtr1[Ptr[GdkPaintable], CInt], get_intrinsic_aspect_ratio : CFuncPtr1[Ptr[GdkPaintable], Double])(using Zone): Ptr[GdkPaintableInterface] = 
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).snapshot = snapshot
    (!____ptr).get_current_image = get_current_image
    (!____ptr).get_flags = get_flags
    (!____ptr).get_intrinsic_width = get_intrinsic_width
    (!____ptr).get_intrinsic_height = get_intrinsic_height
    (!____ptr).get_intrinsic_aspect_ratio = get_intrinsic_aspect_ratio
    ____ptr
  extension (struct: GdkPaintableInterface)
    def g_iface: _root_.gobject.all.GTypeInterface = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GTypeInterface]]
    def g_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GTypeInterface]] = value
    def snapshot: CFuncPtr4[Ptr[GdkPaintable], Ptr[GdkSnapshot], Double, Double, Unit] = !struct.at(16).asInstanceOf[Ptr[CFuncPtr4[Ptr[GdkPaintable], Ptr[GdkSnapshot], Double, Double, Unit]]]
    def snapshot_=(value: CFuncPtr4[Ptr[GdkPaintable], Ptr[GdkSnapshot], Double, Double, Unit]): Unit = !struct.at(16).asInstanceOf[Ptr[CFuncPtr4[Ptr[GdkPaintable], Ptr[GdkSnapshot], Double, Double, Unit]]] = value
    def get_current_image: CFuncPtr1[Ptr[GdkPaintable], Ptr[GdkPaintable]] = !struct.at(24).asInstanceOf[Ptr[CFuncPtr1[Ptr[GdkPaintable], Ptr[GdkPaintable]]]]
    def get_current_image_=(value: CFuncPtr1[Ptr[GdkPaintable], Ptr[GdkPaintable]]): Unit = !struct.at(24).asInstanceOf[Ptr[CFuncPtr1[Ptr[GdkPaintable], Ptr[GdkPaintable]]]] = value
    def get_flags: CFuncPtr1[Ptr[GdkPaintable], GdkPaintableFlags] = !struct.at(32).asInstanceOf[Ptr[CFuncPtr1[Ptr[GdkPaintable], GdkPaintableFlags]]]
    def get_flags_=(value: CFuncPtr1[Ptr[GdkPaintable], GdkPaintableFlags]): Unit = !struct.at(32).asInstanceOf[Ptr[CFuncPtr1[Ptr[GdkPaintable], GdkPaintableFlags]]] = value
    def get_intrinsic_width: CFuncPtr1[Ptr[GdkPaintable], CInt] = !struct.at(40).asInstanceOf[Ptr[CFuncPtr1[Ptr[GdkPaintable], CInt]]]
    def get_intrinsic_width_=(value: CFuncPtr1[Ptr[GdkPaintable], CInt]): Unit = !struct.at(40).asInstanceOf[Ptr[CFuncPtr1[Ptr[GdkPaintable], CInt]]] = value
    def get_intrinsic_height: CFuncPtr1[Ptr[GdkPaintable], CInt] = !struct.at(48).asInstanceOf[Ptr[CFuncPtr1[Ptr[GdkPaintable], CInt]]]
    def get_intrinsic_height_=(value: CFuncPtr1[Ptr[GdkPaintable], CInt]): Unit = !struct.at(48).asInstanceOf[Ptr[CFuncPtr1[Ptr[GdkPaintable], CInt]]] = value
    def get_intrinsic_aspect_ratio: CFuncPtr1[Ptr[GdkPaintable], Double] = !struct.at(56).asInstanceOf[Ptr[CFuncPtr1[Ptr[GdkPaintable], Double]]]
    def get_intrinsic_aspect_ratio_=(value: CFuncPtr1[Ptr[GdkPaintable], Double]): Unit = !struct.at(56).asInstanceOf[Ptr[CFuncPtr1[Ptr[GdkPaintable], Double]]] = value

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
opaque type GdkPixbufLoader = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]
object GdkPixbufLoader:
  given _tag: Tag[GdkPixbufLoader] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  def apply()(using Zone): Ptr[GdkPixbufLoader] = scala.scalanative.unsafe.alloc[GdkPixbufLoader](1)
  def apply(parent_instance : _root_.gobject.all.GObject, priv : _root_.glib.all.gpointer)(using Zone): Ptr[GdkPixbufLoader] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr
  extension (struct: GdkPixbufLoader)
    def parent_instance: _root_.gobject.all.GObject = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObject]]
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObject]] = value
    def priv: _root_.glib.all.gpointer = !struct.at(24).asInstanceOf[Ptr[_root_.glib.all.gpointer]]
    def priv_=(value: _root_.glib.all.gpointer): Unit = !struct.at(24).asInstanceOf[Ptr[_root_.glib.all.gpointer]] = value

/**
 * [bindgen] header: /usr/include/gdk-pixbuf-2.0/gdk-pixbuf/gdk-pixbuf-loader.h
*/
opaque type GdkPixbufLoaderClass = CArray[CChar, Nat.Digit3[Nat._1, Nat._6, Nat._8]]
object GdkPixbufLoaderClass:
  given _tag: Tag[GdkPixbufLoaderClass] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._6, Nat._8]](Tag.Byte, Tag.Digit3[Nat._1, Nat._6, Nat._8](Tag.Nat1, Tag.Nat6, Tag.Nat8))
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
    def parent_class: _root_.gobject.all.GObjectClass = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObjectClass]]
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObjectClass]] = value
    def size_prepared: CFuncPtr3[Ptr[GdkPixbufLoader], CInt, CInt, Unit] = !struct.at(136).asInstanceOf[Ptr[CFuncPtr3[Ptr[GdkPixbufLoader], CInt, CInt, Unit]]]
    def size_prepared_=(value: CFuncPtr3[Ptr[GdkPixbufLoader], CInt, CInt, Unit]): Unit = !struct.at(136).asInstanceOf[Ptr[CFuncPtr3[Ptr[GdkPixbufLoader], CInt, CInt, Unit]]] = value
    def area_prepared: CFuncPtr1[Ptr[GdkPixbufLoader], Unit] = !struct.at(144).asInstanceOf[Ptr[CFuncPtr1[Ptr[GdkPixbufLoader], Unit]]]
    def area_prepared_=(value: CFuncPtr1[Ptr[GdkPixbufLoader], Unit]): Unit = !struct.at(144).asInstanceOf[Ptr[CFuncPtr1[Ptr[GdkPixbufLoader], Unit]]] = value
    def area_updated: CFuncPtr5[Ptr[GdkPixbufLoader], CInt, CInt, CInt, CInt, Unit] = !struct.at(152).asInstanceOf[Ptr[CFuncPtr5[Ptr[GdkPixbufLoader], CInt, CInt, CInt, CInt, Unit]]]
    def area_updated_=(value: CFuncPtr5[Ptr[GdkPixbufLoader], CInt, CInt, CInt, CInt, Unit]): Unit = !struct.at(152).asInstanceOf[Ptr[CFuncPtr5[Ptr[GdkPixbufLoader], CInt, CInt, CInt, CInt, Unit]]] = value
    def closed: CFuncPtr1[Ptr[GdkPixbufLoader], Unit] = !struct.at(160).asInstanceOf[Ptr[CFuncPtr1[Ptr[GdkPixbufLoader], Unit]]]
    def closed_=(value: CFuncPtr1[Ptr[GdkPixbufLoader], Unit]): Unit = !struct.at(160).asInstanceOf[Ptr[CFuncPtr1[Ptr[GdkPixbufLoader], Unit]]] = value

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
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkpopup.h
*/
opaque type GdkPopup = CStruct0
object GdkPopup:
  given _tag: Tag[GdkPopup] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkpopup.h
*/
opaque type GdkPopupInterface = CStruct0
object GdkPopupInterface:
  given _tag: Tag[GdkPopupInterface] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkpopuplayout.h
*/
opaque type GdkPopupLayout = CStruct0
object GdkPopupLayout:
  given _tag: Tag[GdkPopupLayout] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type GdkProximityEvent = CStruct0
object GdkProximityEvent:
  given _tag: Tag[GdkProximityEvent] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkrgba.h
*/
opaque type GdkRGBA = CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]
object GdkRGBA:
  given _tag: Tag[GdkRGBA] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
  def apply()(using Zone): Ptr[GdkRGBA] = scala.scalanative.unsafe.alloc[GdkRGBA](1)
  def apply(red : Float, green : Float, blue : Float, alpha : Float)(using Zone): Ptr[GdkRGBA] = 
    val ____ptr = apply()
    (!____ptr).red = red
    (!____ptr).green = green
    (!____ptr).blue = blue
    (!____ptr).alpha = alpha
    ____ptr
  extension (struct: GdkRGBA)
    def red: Float = !struct.at(0).asInstanceOf[Ptr[Float]]
    def red_=(value: Float): Unit = !struct.at(0).asInstanceOf[Ptr[Float]] = value
    def green: Float = !struct.at(4).asInstanceOf[Ptr[Float]]
    def green_=(value: Float): Unit = !struct.at(4).asInstanceOf[Ptr[Float]] = value
    def blue: Float = !struct.at(8).asInstanceOf[Ptr[Float]]
    def blue_=(value: Float): Unit = !struct.at(8).asInstanceOf[Ptr[Float]] = value
    def alpha: Float = !struct.at(12).asInstanceOf[Ptr[Float]]
    def alpha_=(value: Float): Unit = !struct.at(12).asInstanceOf[Ptr[Float]] = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type GdkScrollEvent = CStruct0
object GdkScrollEvent:
  given _tag: Tag[GdkScrollEvent] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkseat.h
*/
opaque type GdkSeat = CArray[CChar, Nat.Digit2[Nat._2, Nat._4]]
object GdkSeat:
  given _tag: Tag[GdkSeat] = Tag.CArray[CChar, Nat.Digit2[Nat._2, Nat._4]](Tag.Byte, Tag.Digit2[Nat._2, Nat._4](Tag.Nat2, Tag.Nat4))
  def apply()(using Zone): Ptr[GdkSeat] = scala.scalanative.unsafe.alloc[GdkSeat](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[GdkSeat] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GdkSeat)
    def parent_instance: _root_.gobject.all.GObject = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObject]]
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObject]] = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type GdkSnapshot = CStruct0
object GdkSnapshot:
  given _tag: Tag[GdkSnapshot] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdksnapshot.h
*/
opaque type GdkSnapshotClass = CStruct0
object GdkSnapshotClass:
  given _tag: Tag[GdkSnapshotClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type GdkSurface = CStruct0
object GdkSurface:
  given _tag: Tag[GdkSurface] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdksurface.h
*/
opaque type GdkSurfaceClass = CStruct0
object GdkSurfaceClass:
  given _tag: Tag[GdkSurfaceClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type GdkTexture = CStruct0
object GdkTexture:
  given _tag: Tag[GdkTexture] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktexture.h
*/
opaque type GdkTextureClass = CStruct0
object GdkTextureClass:
  given _tag: Tag[GdkTextureClass] = Tag.materializeCStruct0Tag

/**
 * GdkTimeCoord: : The timestamp for this event : Flags indicating what axes are present : (array fixed-size=12): axis values

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkdevice.h
*/
opaque type GdkTimeCoord = CArray[CChar, Nat.Digit3[Nat._1, Nat._0, Nat._4]]
object GdkTimeCoord:
  given _tag: Tag[GdkTimeCoord] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._0, Nat._4]](Tag.Byte, Tag.Digit3[Nat._1, Nat._0, Nat._4](Tag.Nat1, Tag.Nat0, Tag.Nat4))
  def apply()(using Zone): Ptr[GdkTimeCoord] = scala.scalanative.unsafe.alloc[GdkTimeCoord](1)
  def apply(time : _root_.glib.all.guint32, flags : GdkAxisFlags, axes : CArray[Double, Nat.Digit2[Nat._1, Nat._2]])(using Zone): Ptr[GdkTimeCoord] = 
    val ____ptr = apply()
    (!____ptr).time = time
    (!____ptr).flags = flags
    (!____ptr).axes = axes
    ____ptr
  extension (struct: GdkTimeCoord)
    def time: _root_.glib.all.guint32 = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.guint32]]
    def time_=(value: _root_.glib.all.guint32): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.guint32]] = value
    def flags: GdkAxisFlags = !struct.at(4).asInstanceOf[Ptr[GdkAxisFlags]]
    def flags_=(value: GdkAxisFlags): Unit = !struct.at(4).asInstanceOf[Ptr[GdkAxisFlags]] = value
    def axes: CArray[Double, Nat.Digit2[Nat._1, Nat._2]] = !struct.at(8).asInstanceOf[Ptr[CArray[Double, Nat.Digit2[Nat._1, Nat._2]]]]
    def axes_=(value: CArray[Double, Nat.Digit2[Nat._1, Nat._2]]): Unit = !struct.at(8).asInstanceOf[Ptr[CArray[Double, Nat.Digit2[Nat._1, Nat._2]]]] = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktoplevel.h
*/
opaque type GdkToplevel = CStruct0
object GdkToplevel:
  given _tag: Tag[GdkToplevel] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktoplevel.h
*/
opaque type GdkToplevelInterface = CStruct0
object GdkToplevelInterface:
  given _tag: Tag[GdkToplevelInterface] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktoplevellayout.h
*/
opaque type GdkToplevelLayout = CStruct0
object GdkToplevelLayout:
  given _tag: Tag[GdkToplevelLayout] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktoplevelsize.h
*/
opaque type GdkToplevelSize = CStruct0
object GdkToplevelSize:
  given _tag: Tag[GdkToplevelSize] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type GdkTouchEvent = CStruct0
object GdkTouchEvent:
  given _tag: Tag[GdkTouchEvent] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type GdkTouchpadEvent = CStruct0
object GdkTouchpadEvent:
  given _tag: Tag[GdkTouchpadEvent] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type GdkVulkanContext = CStruct0
object GdkVulkanContext:
  given _tag: Tag[GdkVulkanContext] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type GskBlendNode = CStruct0
object GskBlendNode:
  given _tag: Tag[GskBlendNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type GskBlurNode = CStruct0
object GskBlurNode:
  given _tag: Tag[GskBlurNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type GskBorderNode = CStruct0
object GskBorderNode:
  given _tag: Tag[GskBorderNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type GskCairoNode = CStruct0
object GskCairoNode:
  given _tag: Tag[GskCairoNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskcairorenderer.h
*/
opaque type GskCairoRenderer = CStruct0
object GskCairoRenderer:
  given _tag: Tag[GskCairoRenderer] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskcairorenderer.h
*/
opaque type GskCairoRendererClass = CStruct0
object GskCairoRendererClass:
  given _tag: Tag[GskCairoRendererClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type GskClipNode = CStruct0
object GskClipNode:
  given _tag: Tag[GskClipNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type GskColorMatrixNode = CStruct0
object GskColorMatrixNode:
  given _tag: Tag[GskColorMatrixNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type GskColorNode = CStruct0
object GskColorNode:
  given _tag: Tag[GskColorNode] = Tag.materializeCStruct0Tag

/**
 * GskColorStop: : the offset of the color stop : the color at the given offset

 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type GskColorStop = CArray[CChar, Nat.Digit2[Nat._2, Nat._0]]
object GskColorStop:
  given _tag: Tag[GskColorStop] = Tag.CArray[CChar, Nat.Digit2[Nat._2, Nat._0]](Tag.Byte, Tag.Digit2[Nat._2, Nat._0](Tag.Nat2, Tag.Nat0))
  def apply()(using Zone): Ptr[GskColorStop] = scala.scalanative.unsafe.alloc[GskColorStop](1)
  def apply(offset : Float, color : GdkRGBA)(using Zone): Ptr[GskColorStop] = 
    val ____ptr = apply()
    (!____ptr).offset = offset
    (!____ptr).color = color
    ____ptr
  extension (struct: GskColorStop)
    def offset: Float = !struct.at(0).asInstanceOf[Ptr[Float]]
    def offset_=(value: Float): Unit = !struct.at(0).asInstanceOf[Ptr[Float]] = value
    def color: GdkRGBA = !struct.at(4).asInstanceOf[Ptr[GdkRGBA]]
    def color_=(value: GdkRGBA): Unit = !struct.at(4).asInstanceOf[Ptr[GdkRGBA]] = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type GskConicGradientNode = CStruct0
object GskConicGradientNode:
  given _tag: Tag[GskConicGradientNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type GskContainerNode = CStruct0
object GskContainerNode:
  given _tag: Tag[GskContainerNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type GskCrossFadeNode = CStruct0
object GskCrossFadeNode:
  given _tag: Tag[GskCrossFadeNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type GskDebugNode = CStruct0
object GskDebugNode:
  given _tag: Tag[GskDebugNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskglshader.h
*/
opaque type GskGLShader = CStruct0
object GskGLShader:
  given _tag: Tag[GskGLShader] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskglshader.h
*/
opaque type GskGLShaderClass = CArray[CChar, Nat.Digit3[Nat._1, Nat._3, Nat._6]]
object GskGLShaderClass:
  given _tag: Tag[GskGLShaderClass] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._3, Nat._6]](Tag.Byte, Tag.Digit3[Nat._1, Nat._3, Nat._6](Tag.Nat1, Tag.Nat3, Tag.Nat6))
  def apply()(using Zone): Ptr[GskGLShaderClass] = scala.scalanative.unsafe.alloc[GskGLShaderClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[GskGLShaderClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GskGLShaderClass)
    def parent_class: _root_.gobject.all.GObjectClass = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObjectClass]]
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObjectClass]] = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type GskGLShaderNode = CStruct0
object GskGLShaderNode:
  given _tag: Tag[GskGLShaderNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type GskInsetShadowNode = CStruct0
object GskInsetShadowNode:
  given _tag: Tag[GskInsetShadowNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type GskLinearGradientNode = CStruct0
object GskLinearGradientNode:
  given _tag: Tag[GskLinearGradientNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type GskOpacityNode = CStruct0
object GskOpacityNode:
  given _tag: Tag[GskOpacityNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type GskOutsetShadowNode = CStruct0
object GskOutsetShadowNode:
  given _tag: Tag[GskOutsetShadowNode] = Tag.materializeCStruct0Tag

/**
 * GskParseLocation: : the offset of the location in the parse buffer, as bytes : the offset of the location in the parse buffer, as characters

 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type GskParseLocation = CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]
object GskParseLocation:
  given _tag: Tag[GskParseLocation] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._0]](Tag.Byte, Tag.Digit2[Nat._4, Nat._0](Tag.Nat4, Tag.Nat0))
  def apply()(using Zone): Ptr[GskParseLocation] = scala.scalanative.unsafe.alloc[GskParseLocation](1)
  def apply(bytes : _root_.glib.all.gsize, chars : _root_.glib.all.gsize, lines : _root_.glib.all.gsize, line_bytes : _root_.glib.all.gsize, line_chars : _root_.glib.all.gsize)(using Zone): Ptr[GskParseLocation] = 
    val ____ptr = apply()
    (!____ptr).bytes = bytes
    (!____ptr).chars = chars
    (!____ptr).lines = lines
    (!____ptr).line_bytes = line_bytes
    (!____ptr).line_chars = line_chars
    ____ptr
  extension (struct: GskParseLocation)
    def bytes: _root_.glib.all.gsize = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gsize]]
    def bytes_=(value: _root_.glib.all.gsize): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.glib.all.gsize]] = value
    def chars: _root_.glib.all.gsize = !struct.at(8).asInstanceOf[Ptr[_root_.glib.all.gsize]]
    def chars_=(value: _root_.glib.all.gsize): Unit = !struct.at(8).asInstanceOf[Ptr[_root_.glib.all.gsize]] = value
    def lines: _root_.glib.all.gsize = !struct.at(16).asInstanceOf[Ptr[_root_.glib.all.gsize]]
    def lines_=(value: _root_.glib.all.gsize): Unit = !struct.at(16).asInstanceOf[Ptr[_root_.glib.all.gsize]] = value
    def line_bytes: _root_.glib.all.gsize = !struct.at(24).asInstanceOf[Ptr[_root_.glib.all.gsize]]
    def line_bytes_=(value: _root_.glib.all.gsize): Unit = !struct.at(24).asInstanceOf[Ptr[_root_.glib.all.gsize]] = value
    def line_chars: _root_.glib.all.gsize = !struct.at(32).asInstanceOf[Ptr[_root_.glib.all.gsize]]
    def line_chars_=(value: _root_.glib.all.gsize): Unit = !struct.at(32).asInstanceOf[Ptr[_root_.glib.all.gsize]] = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type GskRadialGradientNode = CStruct0
object GskRadialGradientNode:
  given _tag: Tag[GskRadialGradientNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type GskRenderNode = CStruct0
object GskRenderNode:
  given _tag: Tag[GskRenderNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gsktypes.h
*/
opaque type GskRenderer = CStruct0
object GskRenderer:
  given _tag: Tag[GskRenderer] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrenderer.h
*/
opaque type GskRendererClass = CStruct0
object GskRendererClass:
  given _tag: Tag[GskRendererClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type GskRepeatNode = CStruct0
object GskRepeatNode:
  given _tag: Tag[GskRepeatNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type GskRepeatingLinearGradientNode = CStruct0
object GskRepeatingLinearGradientNode:
  given _tag: Tag[GskRepeatingLinearGradientNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type GskRepeatingRadialGradientNode = CStruct0
object GskRepeatingRadialGradientNode:
  given _tag: Tag[GskRepeatingRadialGradientNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type GskRoundedClipNode = CStruct0
object GskRoundedClipNode:
  given _tag: Tag[GskRoundedClipNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskroundedrect.h
*/
opaque type GskRoundedRect = CArray[CChar, Nat.Digit2[Nat._4, Nat._8]]
object GskRoundedRect:
  given _tag: Tag[GskRoundedRect] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._8]](Tag.Byte, Tag.Digit2[Nat._4, Nat._8](Tag.Nat4, Tag.Nat8))
  def apply()(using Zone): Ptr[GskRoundedRect] = scala.scalanative.unsafe.alloc[GskRoundedRect](1)
  def apply(bounds : graphene_rect_t, corner : CArray[graphene_size_t, Nat._4])(using Zone): Ptr[GskRoundedRect] = 
    val ____ptr = apply()
    (!____ptr).bounds = bounds
    (!____ptr).corner = corner
    ____ptr
  extension (struct: GskRoundedRect)
    def bounds: graphene_rect_t = !struct.at(0).asInstanceOf[Ptr[graphene_rect_t]]
    def bounds_=(value: graphene_rect_t): Unit = !struct.at(0).asInstanceOf[Ptr[graphene_rect_t]] = value
    def corner: CArray[graphene_size_t, Nat._4] = !struct.at(16).asInstanceOf[Ptr[CArray[graphene_size_t, Nat._4]]]
    def corner_=(value: CArray[graphene_size_t, Nat._4]): Unit = !struct.at(16).asInstanceOf[Ptr[CArray[graphene_size_t, Nat._4]]] = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskglshader.h
*/
opaque type GskShaderArgsBuilder = CStruct0
object GskShaderArgsBuilder:
  given _tag: Tag[GskShaderArgsBuilder] = Tag.materializeCStruct0Tag

/**
 * GskShadow: : the color of the shadow : the horizontal offset of the shadow : the vertical offset of the shadow : the radius of the shadow

 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type GskShadow = CArray[CChar, Nat.Digit2[Nat._2, Nat._8]]
object GskShadow:
  given _tag: Tag[GskShadow] = Tag.CArray[CChar, Nat.Digit2[Nat._2, Nat._8]](Tag.Byte, Tag.Digit2[Nat._2, Nat._8](Tag.Nat2, Tag.Nat8))
  def apply()(using Zone): Ptr[GskShadow] = scala.scalanative.unsafe.alloc[GskShadow](1)
  def apply(color : GdkRGBA, dx : Float, dy : Float, radius : Float)(using Zone): Ptr[GskShadow] = 
    val ____ptr = apply()
    (!____ptr).color = color
    (!____ptr).dx = dx
    (!____ptr).dy = dy
    (!____ptr).radius = radius
    ____ptr
  extension (struct: GskShadow)
    def color: GdkRGBA = !struct.at(0).asInstanceOf[Ptr[GdkRGBA]]
    def color_=(value: GdkRGBA): Unit = !struct.at(0).asInstanceOf[Ptr[GdkRGBA]] = value
    def dx: Float = !struct.at(16).asInstanceOf[Ptr[Float]]
    def dx_=(value: Float): Unit = !struct.at(16).asInstanceOf[Ptr[Float]] = value
    def dy: Float = !struct.at(20).asInstanceOf[Ptr[Float]]
    def dy_=(value: Float): Unit = !struct.at(20).asInstanceOf[Ptr[Float]] = value
    def radius: Float = !struct.at(24).asInstanceOf[Ptr[Float]]
    def radius_=(value: Float): Unit = !struct.at(24).asInstanceOf[Ptr[Float]] = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type GskShadowNode = CStruct0
object GskShadowNode:
  given _tag: Tag[GskShadowNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type GskTextNode = CStruct0
object GskTextNode:
  given _tag: Tag[GskTextNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type GskTextureNode = CStruct0
object GskTextureNode:
  given _tag: Tag[GskTextureNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gsktypes.h
*/
opaque type GskTransform = CStruct0
object GskTransform:
  given _tag: Tag[GskTransform] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type GskTransformNode = CStruct0
object GskTransformNode:
  given _tag: Tag[GskTransformNode] = Tag.materializeCStruct0Tag

/**
 * PangoAnalysis: _engine: unused, reserved _engine: unused, reserved : the font for this segment. : the bidirectional level for this segment. : the glyph orientation for this segment (A `PangoGravity`). : boolean flags for this segment (Since: 1.16). : the detected script for this segment (A `PangoScript`) (Since: 1.18). : the detected language for this segment. _attrs: extra attributes for this segment.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-item.h
*/
opaque type PangoAnalysis = CStruct9[Ptr[PangoEngineShape], Ptr[PangoEngineLang], Ptr[PangoFont], _root_.glib.all.guint8, _root_.glib.all.guint8, _root_.glib.all.guint8, _root_.glib.all.guint8, Ptr[PangoLanguage], Ptr[Byte]]
object PangoAnalysis:
  given _tag: Tag[PangoAnalysis] = Tag.materializeCStruct9Tag[Ptr[PangoEngineShape], Ptr[PangoEngineLang], Ptr[PangoFont], _root_.glib.all.guint8, _root_.glib.all.guint8, _root_.glib.all.guint8, _root_.glib.all.guint8, Ptr[PangoLanguage], Ptr[Byte]]
  def apply()(using Zone): Ptr[PangoAnalysis] = scala.scalanative.unsafe.alloc[PangoAnalysis](1)
  def apply(shape_engine : Ptr[PangoEngineShape], lang_engine : Ptr[PangoEngineLang], font : Ptr[PangoFont], level : _root_.glib.all.guint8, gravity : _root_.glib.all.guint8, flags : _root_.glib.all.guint8, script : _root_.glib.all.guint8, language : Ptr[PangoLanguage], extra_attrs : Ptr[_root_.glib.all.GSList])(using Zone): Ptr[PangoAnalysis] = 
    val ____ptr = apply()
    (!____ptr).shape_engine = shape_engine
    (!____ptr).lang_engine = lang_engine
    (!____ptr).font = font
    (!____ptr).level = level
    (!____ptr).gravity = gravity
    (!____ptr).flags = flags
    (!____ptr).script = script
    (!____ptr).language = language
    (!____ptr).extra_attrs = extra_attrs
    ____ptr
  extension (struct: PangoAnalysis)
    def shape_engine : Ptr[PangoEngineShape] = struct._1
    def shape_engine_=(value: Ptr[PangoEngineShape]): Unit = !struct.at1 = value
    def lang_engine : Ptr[PangoEngineLang] = struct._2
    def lang_engine_=(value: Ptr[PangoEngineLang]): Unit = !struct.at2 = value
    def font : Ptr[PangoFont] = struct._3
    def font_=(value: Ptr[PangoFont]): Unit = !struct.at3 = value
    def level : _root_.glib.all.guint8 = struct._4
    def level_=(value: _root_.glib.all.guint8): Unit = !struct.at4 = value
    def gravity : _root_.glib.all.guint8 = struct._5
    def gravity_=(value: _root_.glib.all.guint8): Unit = !struct.at5 = value
    def flags : _root_.glib.all.guint8 = struct._6
    def flags_=(value: _root_.glib.all.guint8): Unit = !struct.at6 = value
    def script : _root_.glib.all.guint8 = struct._7
    def script_=(value: _root_.glib.all.guint8): Unit = !struct.at7 = value
    def language : Ptr[PangoLanguage] = struct._8
    def language_=(value: Ptr[PangoLanguage]): Unit = !struct.at8 = value
    def extra_attrs : Ptr[_root_.glib.all.GSList] = struct._9.asInstanceOf[Ptr[_root_.glib.all.GSList]]
    def extra_attrs_=(value: Ptr[_root_.glib.all.GSList]): Unit = !struct.at9 = value.asInstanceOf[Ptr[Byte]]

/**
 * PangoAttrClass: : the type ID for this attribute : function to duplicate an attribute of this type (see [method.Attribute.copy]) : function to free an attribute of this type (see [method.Attribute.destroy]) : function to check two attributes of this type for equality (see [method.Attribute.equal])

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoAttrClass = CStruct4[PangoAttrType, CFuncPtr1[Ptr[Byte], Ptr[Byte]], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr2[Ptr[Byte], Ptr[Byte], _root_.glib.all.gboolean]]
object PangoAttrClass:
  given _tag: Tag[PangoAttrClass] = Tag.materializeCStruct4Tag[PangoAttrType, CFuncPtr1[Ptr[Byte], Ptr[Byte]], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr2[Ptr[Byte], Ptr[Byte], _root_.glib.all.gboolean]]
  def apply()(using Zone): Ptr[PangoAttrClass] = scala.scalanative.unsafe.alloc[PangoAttrClass](1)
  def apply(`type` : PangoAttrType, copy : CFuncPtr1[Ptr[PangoAttribute], Ptr[PangoAttribute]], destroy : CFuncPtr1[Ptr[PangoAttribute], Unit], equal : CFuncPtr2[Ptr[PangoAttribute], Ptr[PangoAttribute], _root_.glib.all.gboolean])(using Zone): Ptr[PangoAttrClass] = 
    val ____ptr = apply()
    (!____ptr).`type` = `type`
    (!____ptr).copy = copy
    (!____ptr).destroy = destroy
    (!____ptr).equal = equal
    ____ptr
  extension (struct: PangoAttrClass)
    def `type` : PangoAttrType = struct._1
    def type_=(value: PangoAttrType): Unit = !struct.at1 = value
    def copy : CFuncPtr1[Ptr[PangoAttribute], Ptr[PangoAttribute]] = struct._2.asInstanceOf[CFuncPtr1[Ptr[PangoAttribute], Ptr[PangoAttribute]]]
    def copy_=(value: CFuncPtr1[Ptr[PangoAttribute], Ptr[PangoAttribute]]): Unit = !struct.at2 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], Ptr[Byte]]]
    def destroy : CFuncPtr1[Ptr[PangoAttribute], Unit] = struct._3.asInstanceOf[CFuncPtr1[Ptr[PangoAttribute], Unit]]
    def destroy_=(value: CFuncPtr1[Ptr[PangoAttribute], Unit]): Unit = !struct.at3 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], Unit]]
    def equal : CFuncPtr2[Ptr[PangoAttribute], Ptr[PangoAttribute], _root_.glib.all.gboolean] = struct._4.asInstanceOf[CFuncPtr2[Ptr[PangoAttribute], Ptr[PangoAttribute], _root_.glib.all.gboolean]]
    def equal_=(value: CFuncPtr2[Ptr[PangoAttribute], Ptr[PangoAttribute], _root_.glib.all.gboolean]): Unit = !struct.at4 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], Ptr[Byte], _root_.glib.all.gboolean]]

/**
 * PangoAttrColor: : the common portion of the attribute : the `PangoColor` which is the value of the attribute

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoAttrColor = CStruct2[PangoAttribute, PangoColor]
object PangoAttrColor:
  given _tag: Tag[PangoAttrColor] = Tag.materializeCStruct2Tag[PangoAttribute, PangoColor]
  def apply()(using Zone): Ptr[PangoAttrColor] = scala.scalanative.unsafe.alloc[PangoAttrColor](1)
  def apply(attr : PangoAttribute, color : PangoColor)(using Zone): Ptr[PangoAttrColor] = 
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).color = color
    ____ptr
  extension (struct: PangoAttrColor)
    def attr : PangoAttribute = struct._1
    def attr_=(value: PangoAttribute): Unit = !struct.at1 = value
    def color : PangoColor = struct._2
    def color_=(value: PangoColor): Unit = !struct.at2 = value

/**
 * PangoAttrFloat: : the common portion of the attribute : the value of the attribute

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoAttrFloat = CStruct2[PangoAttribute, Double]
object PangoAttrFloat:
  given _tag: Tag[PangoAttrFloat] = Tag.materializeCStruct2Tag[PangoAttribute, Double]
  def apply()(using Zone): Ptr[PangoAttrFloat] = scala.scalanative.unsafe.alloc[PangoAttrFloat](1)
  def apply(attr : PangoAttribute, value : Double)(using Zone): Ptr[PangoAttrFloat] = 
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).value = value
    ____ptr
  extension (struct: PangoAttrFloat)
    def attr : PangoAttribute = struct._1
    def attr_=(value: PangoAttribute): Unit = !struct.at1 = value
    def value : Double = struct._2
    def value_=(value: Double): Unit = !struct.at2 = value

/**
 * PangoAttrFontDesc: : the common portion of the attribute : the font description which is the value of this attribute

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoAttrFontDesc = CStruct2[PangoAttribute, Ptr[PangoFontDescription]]
object PangoAttrFontDesc:
  given _tag: Tag[PangoAttrFontDesc] = Tag.materializeCStruct2Tag[PangoAttribute, Ptr[PangoFontDescription]]
  def apply()(using Zone): Ptr[PangoAttrFontDesc] = scala.scalanative.unsafe.alloc[PangoAttrFontDesc](1)
  def apply(attr : PangoAttribute, desc : Ptr[PangoFontDescription])(using Zone): Ptr[PangoAttrFontDesc] = 
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).desc = desc
    ____ptr
  extension (struct: PangoAttrFontDesc)
    def attr : PangoAttribute = struct._1
    def attr_=(value: PangoAttribute): Unit = !struct.at1 = value
    def desc : Ptr[PangoFontDescription] = struct._2
    def desc_=(value: Ptr[PangoFontDescription]): Unit = !struct.at2 = value

/**
 * PangoAttrFontFeatures: : the common portion of the attribute : the features, as a string in CSS syntax

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoAttrFontFeatures = CStruct2[PangoAttribute, Ptr[_root_.glib.all.gchar]]
object PangoAttrFontFeatures:
  given _tag: Tag[PangoAttrFontFeatures] = Tag.materializeCStruct2Tag[PangoAttribute, Ptr[_root_.glib.all.gchar]]
  def apply()(using Zone): Ptr[PangoAttrFontFeatures] = scala.scalanative.unsafe.alloc[PangoAttrFontFeatures](1)
  def apply(attr : PangoAttribute, features : Ptr[_root_.glib.all.gchar])(using Zone): Ptr[PangoAttrFontFeatures] = 
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).features = features
    ____ptr
  extension (struct: PangoAttrFontFeatures)
    def attr : PangoAttribute = struct._1
    def attr_=(value: PangoAttribute): Unit = !struct.at1 = value
    def features : Ptr[_root_.glib.all.gchar] = struct._2
    def features_=(value: Ptr[_root_.glib.all.gchar]): Unit = !struct.at2 = value

/**
 * PangoAttrInt: : the common portion of the attribute : the value of the attribute

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoAttrInt = CStruct2[PangoAttribute, CInt]
object PangoAttrInt:
  given _tag: Tag[PangoAttrInt] = Tag.materializeCStruct2Tag[PangoAttribute, CInt]
  def apply()(using Zone): Ptr[PangoAttrInt] = scala.scalanative.unsafe.alloc[PangoAttrInt](1)
  def apply(attr : PangoAttribute, value : CInt)(using Zone): Ptr[PangoAttrInt] = 
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).value = value
    ____ptr
  extension (struct: PangoAttrInt)
    def attr : PangoAttribute = struct._1
    def attr_=(value: PangoAttribute): Unit = !struct.at1 = value
    def value : CInt = struct._2
    def value_=(value: CInt): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoAttrIterator = CStruct0
object PangoAttrIterator:
  given _tag: Tag[PangoAttrIterator] = Tag.materializeCStruct0Tag

/**
 * PangoAttrLanguage: : the common portion of the attribute : the `PangoLanguage` which is the value of the attribute

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoAttrLanguage = CStruct2[PangoAttribute, Ptr[PangoLanguage]]
object PangoAttrLanguage:
  given _tag: Tag[PangoAttrLanguage] = Tag.materializeCStruct2Tag[PangoAttribute, Ptr[PangoLanguage]]
  def apply()(using Zone): Ptr[PangoAttrLanguage] = scala.scalanative.unsafe.alloc[PangoAttrLanguage](1)
  def apply(attr : PangoAttribute, value : Ptr[PangoLanguage])(using Zone): Ptr[PangoAttrLanguage] = 
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).value = value
    ____ptr
  extension (struct: PangoAttrLanguage)
    def attr : PangoAttribute = struct._1
    def attr_=(value: PangoAttribute): Unit = !struct.at1 = value
    def value : Ptr[PangoLanguage] = struct._2
    def value_=(value: Ptr[PangoLanguage]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoAttrList = CStruct0
object PangoAttrList:
  given _tag: Tag[PangoAttrList] = Tag.materializeCStruct0Tag

/**
 * PangoAttrShape: : the common portion of the attribute

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoAttrShape = CStruct6[PangoAttribute, PangoRectangle, PangoRectangle, _root_.glib.all.gpointer, PangoAttrDataCopyFunc, _root_.glib.all.GDestroyNotify]
object PangoAttrShape:
  given _tag: Tag[PangoAttrShape] = Tag.materializeCStruct6Tag[PangoAttribute, PangoRectangle, PangoRectangle, _root_.glib.all.gpointer, PangoAttrDataCopyFunc, _root_.glib.all.GDestroyNotify]
  def apply()(using Zone): Ptr[PangoAttrShape] = scala.scalanative.unsafe.alloc[PangoAttrShape](1)
  def apply(attr : PangoAttribute, ink_rect : PangoRectangle, logical_rect : PangoRectangle, data : _root_.glib.all.gpointer, copy_func : PangoAttrDataCopyFunc, destroy_func : _root_.glib.all.GDestroyNotify)(using Zone): Ptr[PangoAttrShape] = 
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).ink_rect = ink_rect
    (!____ptr).logical_rect = logical_rect
    (!____ptr).data = data
    (!____ptr).copy_func = copy_func
    (!____ptr).destroy_func = destroy_func
    ____ptr
  extension (struct: PangoAttrShape)
    def attr : PangoAttribute = struct._1
    def attr_=(value: PangoAttribute): Unit = !struct.at1 = value
    def ink_rect : PangoRectangle = struct._2
    def ink_rect_=(value: PangoRectangle): Unit = !struct.at2 = value
    def logical_rect : PangoRectangle = struct._3
    def logical_rect_=(value: PangoRectangle): Unit = !struct.at3 = value
    def data : _root_.glib.all.gpointer = struct._4
    def data_=(value: _root_.glib.all.gpointer): Unit = !struct.at4 = value
    def copy_func : PangoAttrDataCopyFunc = struct._5
    def copy_func_=(value: PangoAttrDataCopyFunc): Unit = !struct.at5 = value
    def destroy_func : _root_.glib.all.GDestroyNotify = struct._6
    def destroy_func_=(value: _root_.glib.all.GDestroyNotify): Unit = !struct.at6 = value

/**
 * PangoAttrSize: : the common portion of the attribute : size of font, in units of 1/%PANGO_SCALE of a point (for %PANGO_ATTR_SIZE) or of a device unit (for %PANGO_ATTR_ABSOLUTE_SIZE) : whether the font size is in device units or points. This field is only present for compatibility with Pango-1.8.0 (%PANGO_ATTR_ABSOLUTE_SIZE was added in 1.8.1); and always will be %FALSE for %PANGO_ATTR_SIZE and %TRUE for %PANGO_ATTR_ABSOLUTE_SIZE.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoAttrSize = CStruct3[PangoAttribute, CInt, _root_.glib.all.guint]
object PangoAttrSize:
  given _tag: Tag[PangoAttrSize] = Tag.materializeCStruct3Tag[PangoAttribute, CInt, _root_.glib.all.guint]
  def apply()(using Zone): Ptr[PangoAttrSize] = scala.scalanative.unsafe.alloc[PangoAttrSize](1)
  def apply(attr : PangoAttribute, size : CInt, absolute : _root_.glib.all.guint)(using Zone): Ptr[PangoAttrSize] = 
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).size = size
    (!____ptr).absolute = absolute
    ____ptr
  extension (struct: PangoAttrSize)
    def attr : PangoAttribute = struct._1
    def attr_=(value: PangoAttribute): Unit = !struct.at1 = value
    def size : CInt = struct._2
    def size_=(value: CInt): Unit = !struct.at2 = value
    def absolute : _root_.glib.all.guint = struct._3
    def absolute_=(value: _root_.glib.all.guint): Unit = !struct.at3 = value

/**
 * PangoAttrString: : the common portion of the attribute : the string which is the value of the attribute

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoAttrString = CStruct2[PangoAttribute, CString]
object PangoAttrString:
  given _tag: Tag[PangoAttrString] = Tag.materializeCStruct2Tag[PangoAttribute, CString]
  def apply()(using Zone): Ptr[PangoAttrString] = scala.scalanative.unsafe.alloc[PangoAttrString](1)
  def apply(attr : PangoAttribute, value : CString)(using Zone): Ptr[PangoAttrString] = 
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).value = value
    ____ptr
  extension (struct: PangoAttrString)
    def attr : PangoAttribute = struct._1
    def attr_=(value: PangoAttribute): Unit = !struct.at1 = value
    def value : CString = struct._2
    def value_=(value: CString): Unit = !struct.at2 = value

/**
 * PangoAttribute: _index: the start index of the range (in bytes). _index: end index of the range (in bytes). The character at this index is not included in the range.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoAttribute = CStruct3[Ptr[Byte], _root_.glib.all.guint, _root_.glib.all.guint]
object PangoAttribute:
  given _tag: Tag[PangoAttribute] = Tag.materializeCStruct3Tag[Ptr[Byte], _root_.glib.all.guint, _root_.glib.all.guint]
  def apply()(using Zone): Ptr[PangoAttribute] = scala.scalanative.unsafe.alloc[PangoAttribute](1)
  def apply(klass : Ptr[PangoAttrClass], start_index : _root_.glib.all.guint, end_index : _root_.glib.all.guint)(using Zone): Ptr[PangoAttribute] = 
    val ____ptr = apply()
    (!____ptr).klass = klass
    (!____ptr).start_index = start_index
    (!____ptr).end_index = end_index
    ____ptr
  extension (struct: PangoAttribute)
    def klass : Ptr[PangoAttrClass] = struct._1.asInstanceOf[Ptr[PangoAttrClass]]
    def klass_=(value: Ptr[PangoAttrClass]): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
    def start_index : _root_.glib.all.guint = struct._2
    def start_index_=(value: _root_.glib.all.guint): Unit = !struct.at2 = value
    def end_index : _root_.glib.all.guint = struct._3
    def end_index_=(value: _root_.glib.all.guint): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pangocairo.h
*/
opaque type PangoCairoFont = CStruct0
object PangoCairoFont:
  given _tag: Tag[PangoCairoFont] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pangocairo.h
*/
opaque type PangoCairoFontMap = CStruct0
object PangoCairoFontMap:
  given _tag: Tag[PangoCairoFontMap] = Tag.materializeCStruct0Tag

/**
 * PangoColor: : value of red component : value of green component : value of blue component

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-color.h
*/
opaque type PangoColor = CStruct3[_root_.glib.all.guint16, _root_.glib.all.guint16, _root_.glib.all.guint16]
object PangoColor:
  given _tag: Tag[PangoColor] = Tag.materializeCStruct3Tag[_root_.glib.all.guint16, _root_.glib.all.guint16, _root_.glib.all.guint16]
  def apply()(using Zone): Ptr[PangoColor] = scala.scalanative.unsafe.alloc[PangoColor](1)
  def apply(red : _root_.glib.all.guint16, green : _root_.glib.all.guint16, blue : _root_.glib.all.guint16)(using Zone): Ptr[PangoColor] = 
    val ____ptr = apply()
    (!____ptr).red = red
    (!____ptr).green = green
    (!____ptr).blue = blue
    ____ptr
  extension (struct: PangoColor)
    def red : _root_.glib.all.guint16 = struct._1
    def red_=(value: _root_.glib.all.guint16): Unit = !struct.at1 = value
    def green : _root_.glib.all.guint16 = struct._2
    def green_=(value: _root_.glib.all.guint16): Unit = !struct.at2 = value
    def blue : _root_.glib.all.guint16 = struct._3
    def blue_=(value: _root_.glib.all.guint16): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-types.h
*/
opaque type PangoContext = CStruct0
object PangoContext:
  given _tag: Tag[PangoContext] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-context.h
*/
opaque type PangoContextClass = CStruct0
object PangoContextClass:
  given _tag: Tag[PangoContextClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-coverage.h
*/
opaque type PangoCoverage = CStruct0
object PangoCoverage:
  given _tag: Tag[PangoCoverage] = Tag.materializeCStruct0Tag

/**
 * PangoEngine:

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-engine.h
*/
opaque type PangoEngine = CStruct1[_root_.gobject.all.GObject]
object PangoEngine:
  given _tag: Tag[PangoEngine] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[PangoEngine] = scala.scalanative.unsafe.alloc[PangoEngine](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[PangoEngine] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: PangoEngine)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * PangoEngineClass:

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-engine.h
*/
opaque type PangoEngineClass = CStruct1[_root_.gobject.all.GObjectClass]
object PangoEngineClass:
  given _tag: Tag[PangoEngineClass] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObjectClass]
  def apply()(using Zone): Ptr[PangoEngineClass] = scala.scalanative.unsafe.alloc[PangoEngineClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[PangoEngineClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: PangoEngineClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value

/**
 * PangoEngineInfo: _type: a string identifying the engine type. _type: a string identifying the render type. : array of scripts this engine supports. _scripts: number of items in .

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-engine.h
*/
opaque type PangoEngineInfo = CStruct5[Ptr[_root_.glib.all.gchar], Ptr[_root_.glib.all.gchar], Ptr[_root_.glib.all.gchar], Ptr[PangoEngineScriptInfo], _root_.glib.all.gint]
object PangoEngineInfo:
  given _tag: Tag[PangoEngineInfo] = Tag.materializeCStruct5Tag[Ptr[_root_.glib.all.gchar], Ptr[_root_.glib.all.gchar], Ptr[_root_.glib.all.gchar], Ptr[PangoEngineScriptInfo], _root_.glib.all.gint]
  def apply()(using Zone): Ptr[PangoEngineInfo] = scala.scalanative.unsafe.alloc[PangoEngineInfo](1)
  def apply(id : Ptr[_root_.glib.all.gchar], engine_type : Ptr[_root_.glib.all.gchar], render_type : Ptr[_root_.glib.all.gchar], scripts : Ptr[PangoEngineScriptInfo], n_scripts : _root_.glib.all.gint)(using Zone): Ptr[PangoEngineInfo] = 
    val ____ptr = apply()
    (!____ptr).id = id
    (!____ptr).engine_type = engine_type
    (!____ptr).render_type = render_type
    (!____ptr).scripts = scripts
    (!____ptr).n_scripts = n_scripts
    ____ptr
  extension (struct: PangoEngineInfo)
    def id : Ptr[_root_.glib.all.gchar] = struct._1
    def id_=(value: Ptr[_root_.glib.all.gchar]): Unit = !struct.at1 = value
    def engine_type : Ptr[_root_.glib.all.gchar] = struct._2
    def engine_type_=(value: Ptr[_root_.glib.all.gchar]): Unit = !struct.at2 = value
    def render_type : Ptr[_root_.glib.all.gchar] = struct._3
    def render_type_=(value: Ptr[_root_.glib.all.gchar]): Unit = !struct.at3 = value
    def scripts : Ptr[PangoEngineScriptInfo] = struct._4
    def scripts_=(value: Ptr[PangoEngineScriptInfo]): Unit = !struct.at4 = value
    def n_scripts : _root_.glib.all.gint = struct._5
    def n_scripts_=(value: _root_.glib.all.gint): Unit = !struct.at5 = value

/**
 * PangoEngineLang:

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-engine.h
*/
opaque type PangoEngineLang = CStruct1[PangoEngine]
object PangoEngineLang:
  given _tag: Tag[PangoEngineLang] = Tag.materializeCStruct1Tag[PangoEngine]
  def apply()(using Zone): Ptr[PangoEngineLang] = scala.scalanative.unsafe.alloc[PangoEngineLang](1)
  def apply(parent_instance : PangoEngine)(using Zone): Ptr[PangoEngineLang] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: PangoEngineLang)
    def parent_instance : PangoEngine = struct._1
    def parent_instance_=(value: PangoEngine): Unit = !struct.at1 = value

/**
 * PangoEngineLangClass: _break: (nullable): Provides a custom implementation of pango_break(). If %NULL, pango_default_break() is used instead. If not %NULL, for Pango versions before 1.16 (module interface version before 1.6.0), this was called instead of pango_default_break(), but in newer versions, pango_default_break() is always called and this is called after that to allow tailoring the breaking results.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-engine.h
*/
opaque type PangoEngineLangClass = CStruct2[PangoEngineClass, CFuncPtr6[Ptr[PangoEngineLang], CString, CInt, Ptr[Byte], Ptr[PangoLogAttr], CInt, Unit]]
object PangoEngineLangClass:
  given _tag: Tag[PangoEngineLangClass] = Tag.materializeCStruct2Tag[PangoEngineClass, CFuncPtr6[Ptr[PangoEngineLang], CString, CInt, Ptr[Byte], Ptr[PangoLogAttr], CInt, Unit]]
  def apply()(using Zone): Ptr[PangoEngineLangClass] = scala.scalanative.unsafe.alloc[PangoEngineLangClass](1)
  def apply(parent_class : PangoEngineClass, script_break : CFuncPtr6[Ptr[PangoEngineLang], CString, CInt, Ptr[PangoAnalysis], Ptr[PangoLogAttr], CInt, Unit])(using Zone): Ptr[PangoEngineLangClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).script_break = script_break
    ____ptr
  extension (struct: PangoEngineLangClass)
    def parent_class : PangoEngineClass = struct._1
    def parent_class_=(value: PangoEngineClass): Unit = !struct.at1 = value
    def script_break : CFuncPtr6[Ptr[PangoEngineLang], CString, CInt, Ptr[PangoAnalysis], Ptr[PangoLogAttr], CInt, Unit] = struct._2.asInstanceOf[CFuncPtr6[Ptr[PangoEngineLang], CString, CInt, Ptr[PangoAnalysis], Ptr[PangoLogAttr], CInt, Unit]]
    def script_break_=(value: CFuncPtr6[Ptr[PangoEngineLang], CString, CInt, Ptr[PangoAnalysis], Ptr[PangoLogAttr], CInt, Unit]): Unit = !struct.at2 = value.asInstanceOf[CFuncPtr6[Ptr[PangoEngineLang], CString, CInt, Ptr[Byte], Ptr[PangoLogAttr], CInt, Unit]]

/**
 * PangoEngineScriptInfo: : a `PangoScript`. The value %PANGO_SCRIPT_COMMON has the special meaning here of "all scripts" : a semicolon separated list of languages that this engine handles for this script. This may be empty, in which case the engine is saying that it is a fallback choice for all languages for this range, but should not be used if another engine indicates that it is specific for the language for a given code point. An entry in this list of "*" indicates that this engine is specific to all languages for this range.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-engine.h
*/
opaque type PangoEngineScriptInfo = CStruct2[PangoScript, Ptr[_root_.glib.all.gchar]]
object PangoEngineScriptInfo:
  given _tag: Tag[PangoEngineScriptInfo] = Tag.materializeCStruct2Tag[PangoScript, Ptr[_root_.glib.all.gchar]]
  def apply()(using Zone): Ptr[PangoEngineScriptInfo] = scala.scalanative.unsafe.alloc[PangoEngineScriptInfo](1)
  def apply(script : PangoScript, langs : Ptr[_root_.glib.all.gchar])(using Zone): Ptr[PangoEngineScriptInfo] = 
    val ____ptr = apply()
    (!____ptr).script = script
    (!____ptr).langs = langs
    ____ptr
  extension (struct: PangoEngineScriptInfo)
    def script : PangoScript = struct._1
    def script_=(value: PangoScript): Unit = !struct.at1 = value
    def langs : Ptr[_root_.glib.all.gchar] = struct._2
    def langs_=(value: Ptr[_root_.glib.all.gchar]): Unit = !struct.at2 = value

/**
 * PangoEngineShape:

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-engine.h
*/
opaque type PangoEngineShape = CStruct1[PangoEngine]
object PangoEngineShape:
  given _tag: Tag[PangoEngineShape] = Tag.materializeCStruct1Tag[PangoEngine]
  def apply()(using Zone): Ptr[PangoEngineShape] = scala.scalanative.unsafe.alloc[PangoEngineShape](1)
  def apply(parent_instance : PangoEngine)(using Zone): Ptr[PangoEngineShape] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: PangoEngineShape)
    def parent_instance : PangoEngine = struct._1
    def parent_instance_=(value: PangoEngine): Unit = !struct.at1 = value

/**
 * PangoEngineShapeClass: _shape: Given a font, a piece of text, and a `PangoAnalysis` structure, converts characters to glyphs and positions the resulting glyphs. The results are stored in the `PangoGlyphString` that is passed in. (The implementation should resize it appropriately using pango_glyph_string_set_size()). All fields of the _clusters and array must be filled in, with the exception that Pango will automatically generate `glyphs->glyphs[i].attr.is_cluster_start` using the _clusters array. Each input character must occur in one of the output logical clusters; if no rendering is desired for a character, this may involve inserting glyphs with the `PangoGlyph` ID %PANGO_GLYPH_EMPTY, which is guaranteed never to render. If the shaping fails for any reason, the shaper should return with an empty (zero-size) glyph string. If the shaper has not set the size on the glyph string yet, simply returning signals the failure too. : Returns the characters that this engine can cover with a given font for a given language. If not overridden, the default implementation simply returns the coverage information for the font itself unmodified.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-engine.h
*/
opaque type PangoEngineShapeClass = CStruct3[PangoEngineClass, CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], CString, CUnsignedInt, Ptr[Byte], Ptr[PangoGlyphString], CString, CUnsignedInt, Unit], CFuncPtr4[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[PangoLanguage], _root_.glib.all.gunichar, PangoCoverageLevel]]
object PangoEngineShapeClass:
  given _tag: Tag[PangoEngineShapeClass] = Tag.materializeCStruct3Tag[PangoEngineClass, CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], CString, CUnsignedInt, Ptr[Byte], Ptr[PangoGlyphString], CString, CUnsignedInt, Unit], CFuncPtr4[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[PangoLanguage], _root_.glib.all.gunichar, PangoCoverageLevel]]
  def apply()(using Zone): Ptr[PangoEngineShapeClass] = scala.scalanative.unsafe.alloc[PangoEngineShapeClass](1)
  def apply(parent_class : PangoEngineClass, script_shape : CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], CString, CUnsignedInt, Ptr[PangoAnalysis], Ptr[PangoGlyphString], CString, CUnsignedInt, Unit], covers : CFuncPtr4[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[PangoLanguage], _root_.glib.all.gunichar, PangoCoverageLevel])(using Zone): Ptr[PangoEngineShapeClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).script_shape = script_shape
    (!____ptr).covers = covers
    ____ptr
  extension (struct: PangoEngineShapeClass)
    def parent_class : PangoEngineClass = struct._1
    def parent_class_=(value: PangoEngineClass): Unit = !struct.at1 = value
    def script_shape : CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], CString, CUnsignedInt, Ptr[PangoAnalysis], Ptr[PangoGlyphString], CString, CUnsignedInt, Unit] = struct._2.asInstanceOf[CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], CString, CUnsignedInt, Ptr[PangoAnalysis], Ptr[PangoGlyphString], CString, CUnsignedInt, Unit]]
    def script_shape_=(value: CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], CString, CUnsignedInt, Ptr[PangoAnalysis], Ptr[PangoGlyphString], CString, CUnsignedInt, Unit]): Unit = !struct.at2 = value.asInstanceOf[CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], CString, CUnsignedInt, Ptr[Byte], Ptr[PangoGlyphString], CString, CUnsignedInt, Unit]]
    def covers : CFuncPtr4[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[PangoLanguage], _root_.glib.all.gunichar, PangoCoverageLevel] = struct._3
    def covers_=(value: CFuncPtr4[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[PangoLanguage], _root_.glib.all.gunichar, PangoCoverageLevel]): Unit = !struct.at3 = value

/**
 * PangoFont:

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
*/
opaque type PangoFont = CStruct1[_root_.gobject.all.GObject]
object PangoFont:
  given _tag: Tag[PangoFont] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[PangoFont] = scala.scalanative.unsafe.alloc[PangoFont](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[PangoFont] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: PangoFont)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
*/
opaque type PangoFontClass = CStruct9[_root_.gobject.all.GObjectClass, CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]], CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoCoverage]], CFuncPtr4[Ptr[PangoFont], PangoGlyph, Ptr[PangoRectangle], Ptr[PangoRectangle], Unit], CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoFontMetrics]], CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontMap]], CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]], CFuncPtr4[Ptr[PangoFont], Ptr[_root_.libharfbuzz.all.hb_feature_t], _root_.glib.all.guint, Ptr[_root_.glib.all.guint], Unit], CFuncPtr1[Ptr[PangoFont], Ptr[_root_.libharfbuzz.all.hb_font_t]]]
object PangoFontClass:
  given _tag: Tag[PangoFontClass] = Tag.materializeCStruct9Tag[_root_.gobject.all.GObjectClass, CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]], CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoCoverage]], CFuncPtr4[Ptr[PangoFont], PangoGlyph, Ptr[PangoRectangle], Ptr[PangoRectangle], Unit], CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoFontMetrics]], CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontMap]], CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]], CFuncPtr4[Ptr[PangoFont], Ptr[_root_.libharfbuzz.all.hb_feature_t], _root_.glib.all.guint, Ptr[_root_.glib.all.guint], Unit], CFuncPtr1[Ptr[PangoFont], Ptr[_root_.libharfbuzz.all.hb_font_t]]]
  def apply()(using Zone): Ptr[PangoFontClass] = scala.scalanative.unsafe.alloc[PangoFontClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, describe : CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]], get_coverage : CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoCoverage]], get_glyph_extents : CFuncPtr4[Ptr[PangoFont], PangoGlyph, Ptr[PangoRectangle], Ptr[PangoRectangle], Unit], get_metrics : CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoFontMetrics]], get_font_map : CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontMap]], describe_absolute : CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]], get_features : CFuncPtr4[Ptr[PangoFont], Ptr[_root_.libharfbuzz.all.hb_feature_t], _root_.glib.all.guint, Ptr[_root_.glib.all.guint], Unit], create_hb_font : CFuncPtr1[Ptr[PangoFont], Ptr[_root_.libharfbuzz.all.hb_font_t]])(using Zone): Ptr[PangoFontClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).describe = describe
    (!____ptr).get_coverage = get_coverage
    (!____ptr).get_glyph_extents = get_glyph_extents
    (!____ptr).get_metrics = get_metrics
    (!____ptr).get_font_map = get_font_map
    (!____ptr).describe_absolute = describe_absolute
    (!____ptr).get_features = get_features
    (!____ptr).create_hb_font = create_hb_font
    ____ptr
  extension (struct: PangoFontClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def describe : CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]] = struct._2
    def describe_=(value: CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]]): Unit = !struct.at2 = value
    def get_coverage : CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoCoverage]] = struct._3
    def get_coverage_=(value: CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoCoverage]]): Unit = !struct.at3 = value
    def get_glyph_extents : CFuncPtr4[Ptr[PangoFont], PangoGlyph, Ptr[PangoRectangle], Ptr[PangoRectangle], Unit] = struct._4
    def get_glyph_extents_=(value: CFuncPtr4[Ptr[PangoFont], PangoGlyph, Ptr[PangoRectangle], Ptr[PangoRectangle], Unit]): Unit = !struct.at4 = value
    def get_metrics : CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoFontMetrics]] = struct._5
    def get_metrics_=(value: CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoFontMetrics]]): Unit = !struct.at5 = value
    def get_font_map : CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontMap]] = struct._6
    def get_font_map_=(value: CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontMap]]): Unit = !struct.at6 = value
    def describe_absolute : CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]] = struct._7
    def describe_absolute_=(value: CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]]): Unit = !struct.at7 = value
    def get_features : CFuncPtr4[Ptr[PangoFont], Ptr[_root_.libharfbuzz.all.hb_feature_t], _root_.glib.all.guint, Ptr[_root_.glib.all.guint], Unit] = struct._8
    def get_features_=(value: CFuncPtr4[Ptr[PangoFont], Ptr[_root_.libharfbuzz.all.hb_feature_t], _root_.glib.all.guint, Ptr[_root_.glib.all.guint], Unit]): Unit = !struct.at8 = value
    def create_hb_font : CFuncPtr1[Ptr[PangoFont], Ptr[_root_.libharfbuzz.all.hb_font_t]] = struct._9
    def create_hb_font_=(value: CFuncPtr1[Ptr[PangoFont], Ptr[_root_.libharfbuzz.all.hb_font_t]]): Unit = !struct.at9 = value

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
*/
opaque type PangoFontDescription = CStruct0
object PangoFontDescription:
  given _tag: Tag[PangoFontDescription] = Tag.materializeCStruct0Tag

/**
 * PangoFontFace:

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
*/
opaque type PangoFontFace = CStruct1[_root_.gobject.all.GObject]
object PangoFontFace:
  given _tag: Tag[PangoFontFace] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[PangoFontFace] = scala.scalanative.unsafe.alloc[PangoFontFace](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[PangoFontFace] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: PangoFontFace)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
*/
opaque type PangoFontFaceClass = CStruct8[_root_.gobject.all.GObjectClass, CFuncPtr1[Ptr[PangoFontFace], CString], CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontDescription]], CFuncPtr3[Ptr[PangoFontFace], Ptr[Ptr[CInt]], Ptr[CInt], Unit], CFuncPtr1[Ptr[PangoFontFace], _root_.glib.all.gboolean], CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontFamily]], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object PangoFontFaceClass:
  given _tag: Tag[PangoFontFaceClass] = Tag.materializeCStruct8Tag[_root_.gobject.all.GObjectClass, CFuncPtr1[Ptr[PangoFontFace], CString], CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontDescription]], CFuncPtr3[Ptr[PangoFontFace], Ptr[Ptr[CInt]], Ptr[CInt], Unit], CFuncPtr1[Ptr[PangoFontFace], _root_.glib.all.gboolean], CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontFamily]], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[PangoFontFaceClass] = scala.scalanative.unsafe.alloc[PangoFontFaceClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, get_face_name : CFuncPtr1[Ptr[PangoFontFace], CString], describe : CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontDescription]], list_sizes : CFuncPtr3[Ptr[PangoFontFace], Ptr[Ptr[CInt]], Ptr[CInt], Unit], is_synthesized : CFuncPtr1[Ptr[PangoFontFace], _root_.glib.all.gboolean], get_family : CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontFamily]], _pango_reserved3 : CFuncPtr0[Unit], _pango_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[PangoFontFaceClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).get_face_name = get_face_name
    (!____ptr).describe = describe
    (!____ptr).list_sizes = list_sizes
    (!____ptr).is_synthesized = is_synthesized
    (!____ptr).get_family = get_family
    (!____ptr)._pango_reserved3 = _pango_reserved3
    (!____ptr)._pango_reserved4 = _pango_reserved4
    ____ptr
  extension (struct: PangoFontFaceClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def get_face_name : CFuncPtr1[Ptr[PangoFontFace], CString] = struct._2
    def get_face_name_=(value: CFuncPtr1[Ptr[PangoFontFace], CString]): Unit = !struct.at2 = value
    def describe : CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontDescription]] = struct._3
    def describe_=(value: CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontDescription]]): Unit = !struct.at3 = value
    def list_sizes : CFuncPtr3[Ptr[PangoFontFace], Ptr[Ptr[CInt]], Ptr[CInt], Unit] = struct._4
    def list_sizes_=(value: CFuncPtr3[Ptr[PangoFontFace], Ptr[Ptr[CInt]], Ptr[CInt], Unit]): Unit = !struct.at4 = value
    def is_synthesized : CFuncPtr1[Ptr[PangoFontFace], _root_.glib.all.gboolean] = struct._5
    def is_synthesized_=(value: CFuncPtr1[Ptr[PangoFontFace], _root_.glib.all.gboolean]): Unit = !struct.at5 = value
    def get_family : CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontFamily]] = struct._6
    def get_family_=(value: CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontFamily]]): Unit = !struct.at6 = value
    def _pango_reserved3 : CFuncPtr0[Unit] = struct._7
    def _pango_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at7 = value
    def _pango_reserved4 : CFuncPtr0[Unit] = struct._8
    def _pango_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at8 = value

/**
 * PangoFontFamily:

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
*/
opaque type PangoFontFamily = CStruct1[_root_.gobject.all.GObject]
object PangoFontFamily:
  given _tag: Tag[PangoFontFamily] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[PangoFontFamily] = scala.scalanative.unsafe.alloc[PangoFontFamily](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[PangoFontFamily] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: PangoFontFamily)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
*/
opaque type PangoFontFamilyClass = CStruct7[_root_.gobject.all.GObjectClass, CFuncPtr3[Ptr[PangoFontFamily], Ptr[Ptr[Ptr[PangoFontFace]]], Ptr[CInt], Unit], CFuncPtr1[Ptr[PangoFontFamily], CString], CFuncPtr1[Ptr[PangoFontFamily], _root_.glib.all.gboolean], CFuncPtr1[Ptr[PangoFontFamily], _root_.glib.all.gboolean], CFuncPtr2[Ptr[PangoFontFamily], CString, Ptr[PangoFontFace]], CFuncPtr0[Unit]]
object PangoFontFamilyClass:
  given _tag: Tag[PangoFontFamilyClass] = Tag.materializeCStruct7Tag[_root_.gobject.all.GObjectClass, CFuncPtr3[Ptr[PangoFontFamily], Ptr[Ptr[Ptr[PangoFontFace]]], Ptr[CInt], Unit], CFuncPtr1[Ptr[PangoFontFamily], CString], CFuncPtr1[Ptr[PangoFontFamily], _root_.glib.all.gboolean], CFuncPtr1[Ptr[PangoFontFamily], _root_.glib.all.gboolean], CFuncPtr2[Ptr[PangoFontFamily], CString, Ptr[PangoFontFace]], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[PangoFontFamilyClass] = scala.scalanative.unsafe.alloc[PangoFontFamilyClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, list_faces : CFuncPtr3[Ptr[PangoFontFamily], Ptr[Ptr[Ptr[PangoFontFace]]], Ptr[CInt], Unit], get_name : CFuncPtr1[Ptr[PangoFontFamily], CString], is_monospace : CFuncPtr1[Ptr[PangoFontFamily], _root_.glib.all.gboolean], is_variable : CFuncPtr1[Ptr[PangoFontFamily], _root_.glib.all.gboolean], get_face : CFuncPtr2[Ptr[PangoFontFamily], CString, Ptr[PangoFontFace]], _pango_reserved2 : CFuncPtr0[Unit])(using Zone): Ptr[PangoFontFamilyClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).list_faces = list_faces
    (!____ptr).get_name = get_name
    (!____ptr).is_monospace = is_monospace
    (!____ptr).is_variable = is_variable
    (!____ptr).get_face = get_face
    (!____ptr)._pango_reserved2 = _pango_reserved2
    ____ptr
  extension (struct: PangoFontFamilyClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def list_faces : CFuncPtr3[Ptr[PangoFontFamily], Ptr[Ptr[Ptr[PangoFontFace]]], Ptr[CInt], Unit] = struct._2
    def list_faces_=(value: CFuncPtr3[Ptr[PangoFontFamily], Ptr[Ptr[Ptr[PangoFontFace]]], Ptr[CInt], Unit]): Unit = !struct.at2 = value
    def get_name : CFuncPtr1[Ptr[PangoFontFamily], CString] = struct._3
    def get_name_=(value: CFuncPtr1[Ptr[PangoFontFamily], CString]): Unit = !struct.at3 = value
    def is_monospace : CFuncPtr1[Ptr[PangoFontFamily], _root_.glib.all.gboolean] = struct._4
    def is_monospace_=(value: CFuncPtr1[Ptr[PangoFontFamily], _root_.glib.all.gboolean]): Unit = !struct.at4 = value
    def is_variable : CFuncPtr1[Ptr[PangoFontFamily], _root_.glib.all.gboolean] = struct._5
    def is_variable_=(value: CFuncPtr1[Ptr[PangoFontFamily], _root_.glib.all.gboolean]): Unit = !struct.at5 = value
    def get_face : CFuncPtr2[Ptr[PangoFontFamily], CString, Ptr[PangoFontFace]] = struct._6
    def get_face_=(value: CFuncPtr2[Ptr[PangoFontFamily], CString, Ptr[PangoFontFace]]): Unit = !struct.at6 = value
    def _pango_reserved2 : CFuncPtr0[Unit] = struct._7
    def _pango_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at7 = value

/**
 * PangoFontMap:

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontmap.h
*/
opaque type PangoFontMap = CStruct1[_root_.gobject.all.GObject]
object PangoFontMap:
  given _tag: Tag[PangoFontMap] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[PangoFontMap] = scala.scalanative.unsafe.alloc[PangoFontMap](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[PangoFontMap] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: PangoFontMap)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * PangoFontMapClass: _class: parent `GObjectClass` _font: a function to load a font with a given description. See pango_font_map_load_font(). _families: A function to list available font families. See pango_font_map_list_families(). _fontset: a function to load a fontset with a given given description suitable for a particular language. See pango_font_map_load_fontset(). _engine_type: the type of rendering-system-dependent engines that can handle fonts of this fonts loaded with this fontmap. _serial: a function to get the serial number of the fontmap. See pango_font_map_get_serial(). : See pango_font_map_changed()

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontmap.h
*/
opaque type PangoFontMapClass = CStruct9[_root_.gobject.all.GObjectClass, CFuncPtr3[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoFont]], CFuncPtr3[Ptr[PangoFontMap], Ptr[Ptr[Ptr[PangoFontFamily]]], Ptr[CInt], Unit], CFuncPtr4[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoLanguage], Ptr[PangoFontset]], CString, CFuncPtr1[Ptr[PangoFontMap], _root_.glib.all.guint], CFuncPtr1[Ptr[PangoFontMap], Unit], CFuncPtr2[Ptr[PangoFontMap], CString, Ptr[PangoFontFamily]], CFuncPtr2[Ptr[PangoFontMap], Ptr[PangoFont], Ptr[PangoFontFace]]]
object PangoFontMapClass:
  given _tag: Tag[PangoFontMapClass] = Tag.materializeCStruct9Tag[_root_.gobject.all.GObjectClass, CFuncPtr3[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoFont]], CFuncPtr3[Ptr[PangoFontMap], Ptr[Ptr[Ptr[PangoFontFamily]]], Ptr[CInt], Unit], CFuncPtr4[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoLanguage], Ptr[PangoFontset]], CString, CFuncPtr1[Ptr[PangoFontMap], _root_.glib.all.guint], CFuncPtr1[Ptr[PangoFontMap], Unit], CFuncPtr2[Ptr[PangoFontMap], CString, Ptr[PangoFontFamily]], CFuncPtr2[Ptr[PangoFontMap], Ptr[PangoFont], Ptr[PangoFontFace]]]
  def apply()(using Zone): Ptr[PangoFontMapClass] = scala.scalanative.unsafe.alloc[PangoFontMapClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, load_font : CFuncPtr3[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoFont]], list_families : CFuncPtr3[Ptr[PangoFontMap], Ptr[Ptr[Ptr[PangoFontFamily]]], Ptr[CInt], Unit], load_fontset : CFuncPtr4[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoLanguage], Ptr[PangoFontset]], shape_engine_type : CString, get_serial : CFuncPtr1[Ptr[PangoFontMap], _root_.glib.all.guint], changed : CFuncPtr1[Ptr[PangoFontMap], Unit], get_family : CFuncPtr2[Ptr[PangoFontMap], CString, Ptr[PangoFontFamily]], get_face : CFuncPtr2[Ptr[PangoFontMap], Ptr[PangoFont], Ptr[PangoFontFace]])(using Zone): Ptr[PangoFontMapClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).load_font = load_font
    (!____ptr).list_families = list_families
    (!____ptr).load_fontset = load_fontset
    (!____ptr).shape_engine_type = shape_engine_type
    (!____ptr).get_serial = get_serial
    (!____ptr).changed = changed
    (!____ptr).get_family = get_family
    (!____ptr).get_face = get_face
    ____ptr
  extension (struct: PangoFontMapClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def load_font : CFuncPtr3[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoFont]] = struct._2
    def load_font_=(value: CFuncPtr3[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoFont]]): Unit = !struct.at2 = value
    def list_families : CFuncPtr3[Ptr[PangoFontMap], Ptr[Ptr[Ptr[PangoFontFamily]]], Ptr[CInt], Unit] = struct._3
    def list_families_=(value: CFuncPtr3[Ptr[PangoFontMap], Ptr[Ptr[Ptr[PangoFontFamily]]], Ptr[CInt], Unit]): Unit = !struct.at3 = value
    def load_fontset : CFuncPtr4[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoLanguage], Ptr[PangoFontset]] = struct._4
    def load_fontset_=(value: CFuncPtr4[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoLanguage], Ptr[PangoFontset]]): Unit = !struct.at4 = value
    def shape_engine_type : CString = struct._5
    def shape_engine_type_=(value: CString): Unit = !struct.at5 = value
    def get_serial : CFuncPtr1[Ptr[PangoFontMap], _root_.glib.all.guint] = struct._6
    def get_serial_=(value: CFuncPtr1[Ptr[PangoFontMap], _root_.glib.all.guint]): Unit = !struct.at6 = value
    def changed : CFuncPtr1[Ptr[PangoFontMap], Unit] = struct._7
    def changed_=(value: CFuncPtr1[Ptr[PangoFontMap], Unit]): Unit = !struct.at7 = value
    def get_family : CFuncPtr2[Ptr[PangoFontMap], CString, Ptr[PangoFontFamily]] = struct._8
    def get_family_=(value: CFuncPtr2[Ptr[PangoFontMap], CString, Ptr[PangoFontFamily]]): Unit = !struct.at8 = value
    def get_face : CFuncPtr2[Ptr[PangoFontMap], Ptr[PangoFont], Ptr[PangoFontFace]] = struct._9
    def get_face_=(value: CFuncPtr2[Ptr[PangoFontMap], Ptr[PangoFont], Ptr[PangoFontFace]]): Unit = !struct.at9 = value

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
*/
opaque type PangoFontMetrics = CStruct10[_root_.glib.all.guint, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt]
object PangoFontMetrics:
  given _tag: Tag[PangoFontMetrics] = Tag.materializeCStruct10Tag[_root_.glib.all.guint, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt]
  def apply()(using Zone): Ptr[PangoFontMetrics] = scala.scalanative.unsafe.alloc[PangoFontMetrics](1)
  def apply(ref_count : _root_.glib.all.guint, ascent : CInt, descent : CInt, height : CInt, approximate_char_width : CInt, approximate_digit_width : CInt, underline_position : CInt, underline_thickness : CInt, strikethrough_position : CInt, strikethrough_thickness : CInt)(using Zone): Ptr[PangoFontMetrics] = 
    val ____ptr = apply()
    (!____ptr).ref_count = ref_count
    (!____ptr).ascent = ascent
    (!____ptr).descent = descent
    (!____ptr).height = height
    (!____ptr).approximate_char_width = approximate_char_width
    (!____ptr).approximate_digit_width = approximate_digit_width
    (!____ptr).underline_position = underline_position
    (!____ptr).underline_thickness = underline_thickness
    (!____ptr).strikethrough_position = strikethrough_position
    (!____ptr).strikethrough_thickness = strikethrough_thickness
    ____ptr
  extension (struct: PangoFontMetrics)
    def ref_count : _root_.glib.all.guint = struct._1
    def ref_count_=(value: _root_.glib.all.guint): Unit = !struct.at1 = value
    def ascent : CInt = struct._2
    def ascent_=(value: CInt): Unit = !struct.at2 = value
    def descent : CInt = struct._3
    def descent_=(value: CInt): Unit = !struct.at3 = value
    def height : CInt = struct._4
    def height_=(value: CInt): Unit = !struct.at4 = value
    def approximate_char_width : CInt = struct._5
    def approximate_char_width_=(value: CInt): Unit = !struct.at5 = value
    def approximate_digit_width : CInt = struct._6
    def approximate_digit_width_=(value: CInt): Unit = !struct.at6 = value
    def underline_position : CInt = struct._7
    def underline_position_=(value: CInt): Unit = !struct.at7 = value
    def underline_thickness : CInt = struct._8
    def underline_thickness_=(value: CInt): Unit = !struct.at8 = value
    def strikethrough_position : CInt = struct._9
    def strikethrough_position_=(value: CInt): Unit = !struct.at9 = value
    def strikethrough_thickness : CInt = struct._10
    def strikethrough_thickness_=(value: CInt): Unit = !struct.at10 = value

/**
 * PangoFontset:

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontset.h
*/
opaque type PangoFontset = CStruct1[_root_.gobject.all.GObject]
object PangoFontset:
  given _tag: Tag[PangoFontset] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[PangoFontset] = scala.scalanative.unsafe.alloc[PangoFontset](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[PangoFontset] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: PangoFontset)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * PangoFontsetClass: _class: parent `GObjectClass` _font: a function to get the font in the fontset that contains the best glyph for the given Unicode character; see [method.Fontset.get_font] _metrics: a function to get overall metric information for the fonts in the fontset; see [method.Fontset.get_metrics] _language: a function to get the language of the fontset. : a function to loop over the fonts in the fontset. See [method.Fontset.foreach]

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontset.h
*/
opaque type PangoFontsetClass = CStruct9[_root_.gobject.all.GObjectClass, CFuncPtr2[Ptr[PangoFontset], _root_.glib.all.guint, Ptr[PangoFont]], CFuncPtr1[Ptr[PangoFontset], Ptr[PangoFontMetrics]], CFuncPtr1[Ptr[PangoFontset], Ptr[PangoLanguage]], CFuncPtr3[Ptr[PangoFontset], PangoFontsetForeachFunc, _root_.glib.all.gpointer, Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object PangoFontsetClass:
  given _tag: Tag[PangoFontsetClass] = Tag.materializeCStruct9Tag[_root_.gobject.all.GObjectClass, CFuncPtr2[Ptr[PangoFontset], _root_.glib.all.guint, Ptr[PangoFont]], CFuncPtr1[Ptr[PangoFontset], Ptr[PangoFontMetrics]], CFuncPtr1[Ptr[PangoFontset], Ptr[PangoLanguage]], CFuncPtr3[Ptr[PangoFontset], PangoFontsetForeachFunc, _root_.glib.all.gpointer, Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[PangoFontsetClass] = scala.scalanative.unsafe.alloc[PangoFontsetClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, get_font : CFuncPtr2[Ptr[PangoFontset], _root_.glib.all.guint, Ptr[PangoFont]], get_metrics : CFuncPtr1[Ptr[PangoFontset], Ptr[PangoFontMetrics]], get_language : CFuncPtr1[Ptr[PangoFontset], Ptr[PangoLanguage]], foreach : CFuncPtr3[Ptr[PangoFontset], PangoFontsetForeachFunc, _root_.glib.all.gpointer, Unit], _pango_reserved1 : CFuncPtr0[Unit], _pango_reserved2 : CFuncPtr0[Unit], _pango_reserved3 : CFuncPtr0[Unit], _pango_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[PangoFontsetClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).get_font = get_font
    (!____ptr).get_metrics = get_metrics
    (!____ptr).get_language = get_language
    (!____ptr).foreach = foreach
    (!____ptr)._pango_reserved1 = _pango_reserved1
    (!____ptr)._pango_reserved2 = _pango_reserved2
    (!____ptr)._pango_reserved3 = _pango_reserved3
    (!____ptr)._pango_reserved4 = _pango_reserved4
    ____ptr
  extension (struct: PangoFontsetClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def get_font : CFuncPtr2[Ptr[PangoFontset], _root_.glib.all.guint, Ptr[PangoFont]] = struct._2
    def get_font_=(value: CFuncPtr2[Ptr[PangoFontset], _root_.glib.all.guint, Ptr[PangoFont]]): Unit = !struct.at2 = value
    def get_metrics : CFuncPtr1[Ptr[PangoFontset], Ptr[PangoFontMetrics]] = struct._3
    def get_metrics_=(value: CFuncPtr1[Ptr[PangoFontset], Ptr[PangoFontMetrics]]): Unit = !struct.at3 = value
    def get_language : CFuncPtr1[Ptr[PangoFontset], Ptr[PangoLanguage]] = struct._4
    def get_language_=(value: CFuncPtr1[Ptr[PangoFontset], Ptr[PangoLanguage]]): Unit = !struct.at4 = value
    def foreach : CFuncPtr3[Ptr[PangoFontset], PangoFontsetForeachFunc, _root_.glib.all.gpointer, Unit] = struct._5
    def foreach_=(value: CFuncPtr3[Ptr[PangoFontset], PangoFontsetForeachFunc, _root_.glib.all.gpointer, Unit]): Unit = !struct.at5 = value
    def _pango_reserved1 : CFuncPtr0[Unit] = struct._6
    def _pango_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at6 = value
    def _pango_reserved2 : CFuncPtr0[Unit] = struct._7
    def _pango_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at7 = value
    def _pango_reserved3 : CFuncPtr0[Unit] = struct._8
    def _pango_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at8 = value
    def _pango_reserved4 : CFuncPtr0[Unit] = struct._9
    def _pango_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at9 = value

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontset-simple.h
*/
opaque type PangoFontsetSimple = CStruct0
object PangoFontsetSimple:
  given _tag: Tag[PangoFontsetSimple] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontset-simple.h
*/
opaque type PangoFontsetSimpleClass = CStruct0
object PangoFontsetSimpleClass:
  given _tag: Tag[PangoFontsetSimpleClass] = Tag.materializeCStruct0Tag

/**
 * PangoGlyphGeometry: : the logical width to use for the the character. _offset: horizontal offset from nominal character position. _offset: vertical offset from nominal character position.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph.h
*/
opaque type PangoGlyphGeometry = CStruct3[PangoGlyphUnit, PangoGlyphUnit, PangoGlyphUnit]
object PangoGlyphGeometry:
  given _tag: Tag[PangoGlyphGeometry] = Tag.materializeCStruct3Tag[PangoGlyphUnit, PangoGlyphUnit, PangoGlyphUnit]
  def apply()(using Zone): Ptr[PangoGlyphGeometry] = scala.scalanative.unsafe.alloc[PangoGlyphGeometry](1)
  def apply(width : PangoGlyphUnit, x_offset : PangoGlyphUnit, y_offset : PangoGlyphUnit)(using Zone): Ptr[PangoGlyphGeometry] = 
    val ____ptr = apply()
    (!____ptr).width = width
    (!____ptr).x_offset = x_offset
    (!____ptr).y_offset = y_offset
    ____ptr
  extension (struct: PangoGlyphGeometry)
    def width : PangoGlyphUnit = struct._1
    def width_=(value: PangoGlyphUnit): Unit = !struct.at1 = value
    def x_offset : PangoGlyphUnit = struct._2
    def x_offset_=(value: PangoGlyphUnit): Unit = !struct.at2 = value
    def y_offset : PangoGlyphUnit = struct._3
    def y_offset_=(value: PangoGlyphUnit): Unit = !struct.at3 = value

/**
 * PangoGlyphInfo: : the glyph itself. : the positional information about the glyph. : the visual attributes of the glyph.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph.h
*/
opaque type PangoGlyphInfo = CStruct3[PangoGlyph, PangoGlyphGeometry, PangoGlyphVisAttr]
object PangoGlyphInfo:
  given _tag: Tag[PangoGlyphInfo] = Tag.materializeCStruct3Tag[PangoGlyph, PangoGlyphGeometry, PangoGlyphVisAttr]
  def apply()(using Zone): Ptr[PangoGlyphInfo] = scala.scalanative.unsafe.alloc[PangoGlyphInfo](1)
  def apply(glyph : PangoGlyph, geometry : PangoGlyphGeometry, attr : PangoGlyphVisAttr)(using Zone): Ptr[PangoGlyphInfo] = 
    val ____ptr = apply()
    (!____ptr).glyph = glyph
    (!____ptr).geometry = geometry
    (!____ptr).attr = attr
    ____ptr
  extension (struct: PangoGlyphInfo)
    def glyph : PangoGlyph = struct._1
    def glyph_=(value: PangoGlyph): Unit = !struct.at1 = value
    def geometry : PangoGlyphGeometry = struct._2
    def geometry_=(value: PangoGlyphGeometry): Unit = !struct.at2 = value
    def attr : PangoGlyphVisAttr = struct._3
    def attr_=(value: PangoGlyphVisAttr): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph-item.h
*/
opaque type PangoGlyphItem = CStruct5[Ptr[Byte], Ptr[PangoGlyphString], CInt, CInt, CInt]
object PangoGlyphItem:
  given _tag: Tag[PangoGlyphItem] = Tag.materializeCStruct5Tag[Ptr[Byte], Ptr[PangoGlyphString], CInt, CInt, CInt]
  def apply()(using Zone): Ptr[PangoGlyphItem] = scala.scalanative.unsafe.alloc[PangoGlyphItem](1)
  def apply(item : Ptr[PangoItem], glyphs : Ptr[PangoGlyphString], y_offset : CInt, start_x_offset : CInt, end_x_offset : CInt)(using Zone): Ptr[PangoGlyphItem] = 
    val ____ptr = apply()
    (!____ptr).item = item
    (!____ptr).glyphs = glyphs
    (!____ptr).y_offset = y_offset
    (!____ptr).start_x_offset = start_x_offset
    (!____ptr).end_x_offset = end_x_offset
    ____ptr
  extension (struct: PangoGlyphItem)
    def item : Ptr[PangoItem] = struct._1.asInstanceOf[Ptr[PangoItem]]
    def item_=(value: Ptr[PangoItem]): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
    def glyphs : Ptr[PangoGlyphString] = struct._2
    def glyphs_=(value: Ptr[PangoGlyphString]): Unit = !struct.at2 = value
    def y_offset : CInt = struct._3
    def y_offset_=(value: CInt): Unit = !struct.at3 = value
    def start_x_offset : CInt = struct._4
    def start_x_offset_=(value: CInt): Unit = !struct.at4 = value
    def end_x_offset : CInt = struct._5
    def end_x_offset_=(value: CInt): Unit = !struct.at5 = value

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph-item.h
*/
opaque type PangoGlyphItemIter = CStruct8[Ptr[Byte], Ptr[_root_.glib.all.gchar], CInt, CInt, CInt, CInt, CInt, CInt]
object PangoGlyphItemIter:
  given _tag: Tag[PangoGlyphItemIter] = Tag.materializeCStruct8Tag[Ptr[Byte], Ptr[_root_.glib.all.gchar], CInt, CInt, CInt, CInt, CInt, CInt]
  def apply()(using Zone): Ptr[PangoGlyphItemIter] = scala.scalanative.unsafe.alloc[PangoGlyphItemIter](1)
  def apply(glyph_item : Ptr[PangoGlyphItem], text : Ptr[_root_.glib.all.gchar], start_glyph : CInt, start_index : CInt, start_char : CInt, end_glyph : CInt, end_index : CInt, end_char : CInt)(using Zone): Ptr[PangoGlyphItemIter] = 
    val ____ptr = apply()
    (!____ptr).glyph_item = glyph_item
    (!____ptr).text = text
    (!____ptr).start_glyph = start_glyph
    (!____ptr).start_index = start_index
    (!____ptr).start_char = start_char
    (!____ptr).end_glyph = end_glyph
    (!____ptr).end_index = end_index
    (!____ptr).end_char = end_char
    ____ptr
  extension (struct: PangoGlyphItemIter)
    def glyph_item : Ptr[PangoGlyphItem] = struct._1.asInstanceOf[Ptr[PangoGlyphItem]]
    def glyph_item_=(value: Ptr[PangoGlyphItem]): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
    def text : Ptr[_root_.glib.all.gchar] = struct._2
    def text_=(value: Ptr[_root_.glib.all.gchar]): Unit = !struct.at2 = value
    def start_glyph : CInt = struct._3
    def start_glyph_=(value: CInt): Unit = !struct.at3 = value
    def start_index : CInt = struct._4
    def start_index_=(value: CInt): Unit = !struct.at4 = value
    def start_char : CInt = struct._5
    def start_char_=(value: CInt): Unit = !struct.at5 = value
    def end_glyph : CInt = struct._6
    def end_glyph_=(value: CInt): Unit = !struct.at6 = value
    def end_index : CInt = struct._7
    def end_index_=(value: CInt): Unit = !struct.at7 = value
    def end_char : CInt = struct._8
    def end_char_=(value: CInt): Unit = !struct.at8 = value

/**
 * PangoGlyphString: : (array length=num_glyphs): array of glyph information _clusters: logical cluster info, indexed by the byte index within the text corresponding to the glyph string

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph.h
*/
opaque type PangoGlyphString = CStruct4[CInt, Ptr[PangoGlyphInfo], Ptr[CInt], CInt]
object PangoGlyphString:
  given _tag: Tag[PangoGlyphString] = Tag.materializeCStruct4Tag[CInt, Ptr[PangoGlyphInfo], Ptr[CInt], CInt]
  def apply()(using Zone): Ptr[PangoGlyphString] = scala.scalanative.unsafe.alloc[PangoGlyphString](1)
  def apply(num_glyphs : CInt, glyphs : Ptr[PangoGlyphInfo], log_clusters : Ptr[CInt], space : CInt)(using Zone): Ptr[PangoGlyphString] = 
    val ____ptr = apply()
    (!____ptr).num_glyphs = num_glyphs
    (!____ptr).glyphs = glyphs
    (!____ptr).log_clusters = log_clusters
    (!____ptr).space = space
    ____ptr
  extension (struct: PangoGlyphString)
    def num_glyphs : CInt = struct._1
    def num_glyphs_=(value: CInt): Unit = !struct.at1 = value
    def glyphs : Ptr[PangoGlyphInfo] = struct._2
    def glyphs_=(value: Ptr[PangoGlyphInfo]): Unit = !struct.at2 = value
    def log_clusters : Ptr[CInt] = struct._3
    def log_clusters_=(value: Ptr[CInt]): Unit = !struct.at3 = value
    def space : CInt = struct._4
    def space_=(value: CInt): Unit = !struct.at4 = value

/**
 * PangoGlyphVisAttr:

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph.h
*/
opaque type PangoGlyphVisAttr = CStruct2[_root_.glib.all.guint, _root_.glib.all.guint]
object PangoGlyphVisAttr:
  given _tag: Tag[PangoGlyphVisAttr] = Tag.materializeCStruct2Tag[_root_.glib.all.guint, _root_.glib.all.guint]
  def apply()(using Zone): Ptr[PangoGlyphVisAttr] = scala.scalanative.unsafe.alloc[PangoGlyphVisAttr](1)
  def apply(is_cluster_start : _root_.glib.all.guint, is_color : _root_.glib.all.guint)(using Zone): Ptr[PangoGlyphVisAttr] = 
    val ____ptr = apply()
    (!____ptr).is_cluster_start = is_cluster_start
    (!____ptr).is_color = is_color
    ____ptr
  extension (struct: PangoGlyphVisAttr)
    def is_cluster_start : _root_.glib.all.guint = struct._1
    def is_cluster_start_=(value: _root_.glib.all.guint): Unit = !struct.at1 = value
    def is_color : _root_.glib.all.guint = struct._2
    def is_color_=(value: _root_.glib.all.guint): Unit = !struct.at2 = value

/**
 * PangoItem: : byte offset of the start of this item in text. : length of this item in bytes. _offset: character offset of the start of this item in text. Since 1.50 : analysis results for the item.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-item.h
*/
opaque type PangoItem = CStruct4[CInt, CInt, CInt, PangoAnalysis]
object PangoItem:
  given _tag: Tag[PangoItem] = Tag.materializeCStruct4Tag[CInt, CInt, CInt, PangoAnalysis]
  def apply()(using Zone): Ptr[PangoItem] = scala.scalanative.unsafe.alloc[PangoItem](1)
  def apply(offset : CInt, length : CInt, num_chars : CInt, analysis : PangoAnalysis)(using Zone): Ptr[PangoItem] = 
    val ____ptr = apply()
    (!____ptr).offset = offset
    (!____ptr).length = length
    (!____ptr).num_chars = num_chars
    (!____ptr).analysis = analysis
    ____ptr
  extension (struct: PangoItem)
    def offset : CInt = struct._1
    def offset_=(value: CInt): Unit = !struct.at1 = value
    def length : CInt = struct._2
    def length_=(value: CInt): Unit = !struct.at2 = value
    def num_chars : CInt = struct._3
    def num_chars_=(value: CInt): Unit = !struct.at3 = value
    def analysis : PangoAnalysis = struct._4
    def analysis_=(value: PangoAnalysis): Unit = !struct.at4 = value

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-types.h
*/
opaque type PangoLanguage = CStruct0
object PangoLanguage:
  given _tag: Tag[PangoLanguage] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
*/
opaque type PangoLayout = CStruct0
object PangoLayout:
  given _tag: Tag[PangoLayout] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
*/
opaque type PangoLayoutClass = CStruct0
object PangoLayoutClass:
  given _tag: Tag[PangoLayoutClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
*/
opaque type PangoLayoutIter = CStruct0
object PangoLayoutIter:
  given _tag: Tag[PangoLayoutIter] = Tag.materializeCStruct0Tag

/**
 * PangoLayoutLine: : (nullable): the layout this line belongs to, might be %NULL _index: start of line as byte index into layout->text : length of line in bytes : (nullable) (element-type Pango.LayoutRun): list of runs in the line, from left to right _dir: #Resolved PangoDirection of line

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
*/
opaque type PangoLayoutLine = CStruct6[Ptr[PangoLayout], _root_.glib.all.gint, _root_.glib.all.gint, Ptr[Byte], _root_.glib.all.guint, _root_.glib.all.guint]
object PangoLayoutLine:
  given _tag: Tag[PangoLayoutLine] = Tag.materializeCStruct6Tag[Ptr[PangoLayout], _root_.glib.all.gint, _root_.glib.all.gint, Ptr[Byte], _root_.glib.all.guint, _root_.glib.all.guint]
  def apply()(using Zone): Ptr[PangoLayoutLine] = scala.scalanative.unsafe.alloc[PangoLayoutLine](1)
  def apply(layout : Ptr[PangoLayout], start_index : _root_.glib.all.gint, length : _root_.glib.all.gint, runs : Ptr[_root_.glib.all.GSList], is_paragraph_start : _root_.glib.all.guint, resolved_dir : _root_.glib.all.guint)(using Zone): Ptr[PangoLayoutLine] = 
    val ____ptr = apply()
    (!____ptr).layout = layout
    (!____ptr).start_index = start_index
    (!____ptr).length = length
    (!____ptr).runs = runs
    (!____ptr).is_paragraph_start = is_paragraph_start
    (!____ptr).resolved_dir = resolved_dir
    ____ptr
  extension (struct: PangoLayoutLine)
    def layout : Ptr[PangoLayout] = struct._1
    def layout_=(value: Ptr[PangoLayout]): Unit = !struct.at1 = value
    def start_index : _root_.glib.all.gint = struct._2
    def start_index_=(value: _root_.glib.all.gint): Unit = !struct.at2 = value
    def length : _root_.glib.all.gint = struct._3
    def length_=(value: _root_.glib.all.gint): Unit = !struct.at3 = value
    def runs : Ptr[_root_.glib.all.GSList] = struct._4.asInstanceOf[Ptr[_root_.glib.all.GSList]]
    def runs_=(value: Ptr[_root_.glib.all.GSList]): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
    def is_paragraph_start : _root_.glib.all.guint = struct._5
    def is_paragraph_start_=(value: _root_.glib.all.guint): Unit = !struct.at5 = value
    def resolved_dir : _root_.glib.all.guint = struct._6
    def resolved_dir_=(value: _root_.glib.all.guint): Unit = !struct.at6 = value

/**
 * PangoLogAttr: i.e. this is a grapheme boundary, or the first character in the text. This flag implements Unicode's [Grapheme Cluster Boundaries](http://www.unicode.org/reports/tr29/) semantics. Note that in degenerate cases, you could have both and There are two ways to divide sentences. The first assigns all inter-sentence whitespace/control/format chars to some sentence, so all chars are in some sentence; the boundaries there. The second way doesn't assign between-sentence spaces, etc. to any sentence, so Note that in degenerate cases, you could have both and period, so the next sentence starts right away) _deletes_character: if set, backspace deletes one character rather than the entire grapheme cluster. This field is only meaningful on grapheme boundaries (where the full grapheme (e.g. letter + diacritics) is considered a unit, while in others, each decomposed character in the grapheme is a unit. In the default implementation of [func], this bit is set on all grapheme boundaries except those following Latin, Cyrillic or Greek base characters. expanded for justification purposes. (Since: 1.18) More specifically, means that this is not a position in the middle of a word. For example, both sides of a punctuation mark are considered word boundaries. This flag is particularly useful when selecting text word-by-word. This flag implements Unicode's [Word Boundaries](http://www.unicode.org/reports/tr29/) semantics. (Since: 1.22) _inserts_hyphen: when breaking lines before this char, insert a hyphen. Since: 1.50 _removes_preceding: when breaking lines before this char, remove the preceding char. Since 1.50

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-break.h
*/
opaque type PangoLogAttr = CStruct16[_root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint]
object PangoLogAttr:
  given _tag: Tag[PangoLogAttr] = Tag.materializeCStruct16Tag[_root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint]
  def apply()(using Zone): Ptr[PangoLogAttr] = scala.scalanative.unsafe.alloc[PangoLogAttr](1)
  def apply(is_line_break : _root_.glib.all.guint, is_mandatory_break : _root_.glib.all.guint, is_char_break : _root_.glib.all.guint, is_white : _root_.glib.all.guint, is_cursor_position : _root_.glib.all.guint, is_word_start : _root_.glib.all.guint, is_word_end : _root_.glib.all.guint, is_sentence_boundary : _root_.glib.all.guint, is_sentence_start : _root_.glib.all.guint, is_sentence_end : _root_.glib.all.guint, backspace_deletes_character : _root_.glib.all.guint, is_expandable_space : _root_.glib.all.guint, is_word_boundary : _root_.glib.all.guint, break_inserts_hyphen : _root_.glib.all.guint, break_removes_preceding : _root_.glib.all.guint, reserved : _root_.glib.all.guint)(using Zone): Ptr[PangoLogAttr] = 
    val ____ptr = apply()
    (!____ptr).is_line_break = is_line_break
    (!____ptr).is_mandatory_break = is_mandatory_break
    (!____ptr).is_char_break = is_char_break
    (!____ptr).is_white = is_white
    (!____ptr).is_cursor_position = is_cursor_position
    (!____ptr).is_word_start = is_word_start
    (!____ptr).is_word_end = is_word_end
    (!____ptr).is_sentence_boundary = is_sentence_boundary
    (!____ptr).is_sentence_start = is_sentence_start
    (!____ptr).is_sentence_end = is_sentence_end
    (!____ptr).backspace_deletes_character = backspace_deletes_character
    (!____ptr).is_expandable_space = is_expandable_space
    (!____ptr).is_word_boundary = is_word_boundary
    (!____ptr).break_inserts_hyphen = break_inserts_hyphen
    (!____ptr).break_removes_preceding = break_removes_preceding
    (!____ptr).reserved = reserved
    ____ptr
  extension (struct: PangoLogAttr)
    def is_line_break : _root_.glib.all.guint = struct._1
    def is_line_break_=(value: _root_.glib.all.guint): Unit = !struct.at1 = value
    def is_mandatory_break : _root_.glib.all.guint = struct._2
    def is_mandatory_break_=(value: _root_.glib.all.guint): Unit = !struct.at2 = value
    def is_char_break : _root_.glib.all.guint = struct._3
    def is_char_break_=(value: _root_.glib.all.guint): Unit = !struct.at3 = value
    def is_white : _root_.glib.all.guint = struct._4
    def is_white_=(value: _root_.glib.all.guint): Unit = !struct.at4 = value
    def is_cursor_position : _root_.glib.all.guint = struct._5
    def is_cursor_position_=(value: _root_.glib.all.guint): Unit = !struct.at5 = value
    def is_word_start : _root_.glib.all.guint = struct._6
    def is_word_start_=(value: _root_.glib.all.guint): Unit = !struct.at6 = value
    def is_word_end : _root_.glib.all.guint = struct._7
    def is_word_end_=(value: _root_.glib.all.guint): Unit = !struct.at7 = value
    def is_sentence_boundary : _root_.glib.all.guint = struct._8
    def is_sentence_boundary_=(value: _root_.glib.all.guint): Unit = !struct.at8 = value
    def is_sentence_start : _root_.glib.all.guint = struct._9
    def is_sentence_start_=(value: _root_.glib.all.guint): Unit = !struct.at9 = value
    def is_sentence_end : _root_.glib.all.guint = struct._10
    def is_sentence_end_=(value: _root_.glib.all.guint): Unit = !struct.at10 = value
    def backspace_deletes_character : _root_.glib.all.guint = struct._11
    def backspace_deletes_character_=(value: _root_.glib.all.guint): Unit = !struct.at11 = value
    def is_expandable_space : _root_.glib.all.guint = struct._12
    def is_expandable_space_=(value: _root_.glib.all.guint): Unit = !struct.at12 = value
    def is_word_boundary : _root_.glib.all.guint = struct._13
    def is_word_boundary_=(value: _root_.glib.all.guint): Unit = !struct.at13 = value
    def break_inserts_hyphen : _root_.glib.all.guint = struct._14
    def break_inserts_hyphen_=(value: _root_.glib.all.guint): Unit = !struct.at14 = value
    def break_removes_preceding : _root_.glib.all.guint = struct._15
    def break_removes_preceding_=(value: _root_.glib.all.guint): Unit = !struct.at15 = value
    def reserved : _root_.glib.all.guint = struct._16
    def reserved_=(value: _root_.glib.all.guint): Unit = !struct.at16 = value

/**
 * PangoMatrix: : 1st component of the transformation matrix : 2nd component of the transformation matrix : 3rd component of the transformation matrix : 4th component of the transformation matrix : x translation : y translation

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-matrix.h
*/
opaque type PangoMatrix = CStruct6[Double, Double, Double, Double, Double, Double]
object PangoMatrix:
  given _tag: Tag[PangoMatrix] = Tag.materializeCStruct6Tag[Double, Double, Double, Double, Double, Double]
  def apply()(using Zone): Ptr[PangoMatrix] = scala.scalanative.unsafe.alloc[PangoMatrix](1)
  def apply(xx : Double, xy : Double, yx : Double, yy : Double, x0 : Double, y0 : Double)(using Zone): Ptr[PangoMatrix] = 
    val ____ptr = apply()
    (!____ptr).xx = xx
    (!____ptr).xy = xy
    (!____ptr).yx = yx
    (!____ptr).yy = yy
    (!____ptr).x0 = x0
    (!____ptr).y0 = y0
    ____ptr
  extension (struct: PangoMatrix)
    def xx : Double = struct._1
    def xx_=(value: Double): Unit = !struct.at1 = value
    def xy : Double = struct._2
    def xy_=(value: Double): Unit = !struct.at2 = value
    def yx : Double = struct._3
    def yx_=(value: Double): Unit = !struct.at3 = value
    def yy : Double = struct._4
    def yy_=(value: Double): Unit = !struct.at4 = value
    def x0 : Double = struct._5
    def x0_=(value: Double): Unit = !struct.at5 = value
    def y0 : Double = struct._6
    def y0_=(value: Double): Unit = !struct.at6 = value

/**
 * PangoRectangle: : X coordinate of the left side of the rectangle. : Y coordinate of the the top side of the rectangle. : width of the rectangle. : height of the rectangle.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-types.h
*/
opaque type PangoRectangle = CStruct4[CInt, CInt, CInt, CInt]
object PangoRectangle:
  given _tag: Tag[PangoRectangle] = Tag.materializeCStruct4Tag[CInt, CInt, CInt, CInt]
  def apply()(using Zone): Ptr[PangoRectangle] = scala.scalanative.unsafe.alloc[PangoRectangle](1)
  def apply(x : CInt, y : CInt, width : CInt, height : CInt)(using Zone): Ptr[PangoRectangle] = 
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).width = width
    (!____ptr).height = height
    ____ptr
  extension (struct: PangoRectangle)
    def x : CInt = struct._1
    def x_=(value: CInt): Unit = !struct.at1 = value
    def y : CInt = struct._2
    def y_=(value: CInt): Unit = !struct.at2 = value
    def width : CInt = struct._3
    def width_=(value: CInt): Unit = !struct.at3 = value
    def height : CInt = struct._4
    def height_=(value: CInt): Unit = !struct.at4 = value

/**
 * PangoRenderer: : (nullable): the current transformation matrix for the Renderer; may be %NULL, which should be treated the same as the identity matrix.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-renderer.h
*/
opaque type PangoRenderer = CStruct6[_root_.gobject.all.GObject, PangoUnderline, _root_.glib.all.gboolean, CInt, Ptr[PangoMatrix], Ptr[PangoRendererPrivate]]
object PangoRenderer:
  given _tag: Tag[PangoRenderer] = Tag.materializeCStruct6Tag[_root_.gobject.all.GObject, PangoUnderline, _root_.glib.all.gboolean, CInt, Ptr[PangoMatrix], Ptr[PangoRendererPrivate]]
  def apply()(using Zone): Ptr[PangoRenderer] = scala.scalanative.unsafe.alloc[PangoRenderer](1)
  def apply(parent_instance : _root_.gobject.all.GObject, underline : PangoUnderline, strikethrough : _root_.glib.all.gboolean, active_count : CInt, matrix : Ptr[PangoMatrix], priv : Ptr[PangoRendererPrivate])(using Zone): Ptr[PangoRenderer] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).underline = underline
    (!____ptr).strikethrough = strikethrough
    (!____ptr).active_count = active_count
    (!____ptr).matrix = matrix
    (!____ptr).priv = priv
    ____ptr
  extension (struct: PangoRenderer)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value
    def underline : PangoUnderline = struct._2
    def underline_=(value: PangoUnderline): Unit = !struct.at2 = value
    def strikethrough : _root_.glib.all.gboolean = struct._3
    def strikethrough_=(value: _root_.glib.all.gboolean): Unit = !struct.at3 = value
    def active_count : CInt = struct._4
    def active_count_=(value: CInt): Unit = !struct.at4 = value
    def matrix : Ptr[PangoMatrix] = struct._5
    def matrix_=(value: Ptr[PangoMatrix]): Unit = !struct.at5 = value
    def priv : Ptr[PangoRendererPrivate] = struct._6
    def priv_=(value: Ptr[PangoRendererPrivate]): Unit = !struct.at6 = value

/**
 * PangoRendererClass: _glyphs: draws a `PangoGlyphString` _rectangle: draws a rectangle _error_underline: draws a squiggly line that approximately covers the given rectangle in the style of an underline used to indicate a spelling error. _shape: draw content for a glyph shaped with `PangoAttrShape` , are the coordinates of the left edge of the baseline, in user coordinates. _trapezoid: draws a trapezoidal filled area _glyph: draws a single glyph

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-renderer.h
*/
opaque type PangoRendererClass = CStruct15[_root_.gobject.all.GObjectClass, CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], Ptr[PangoGlyphString], CInt, CInt, Unit], CFuncPtr6[Ptr[PangoRenderer], PangoRenderPart, CInt, CInt, CInt, CInt, Unit], CFuncPtr5[Ptr[PangoRenderer], CInt, CInt, CInt, CInt, Unit], CFuncPtr4[Ptr[PangoRenderer], Ptr[Byte], CInt, CInt, Unit], CFuncPtr8[Ptr[PangoRenderer], PangoRenderPart, Double, Double, Double, Double, Double, Double, Unit], CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], PangoGlyph, Double, Double, Unit], CFuncPtr2[Ptr[PangoRenderer], PangoRenderPart, Unit], CFuncPtr1[Ptr[PangoRenderer], Unit], CFuncPtr1[Ptr[PangoRenderer], Unit], CFuncPtr2[Ptr[PangoRenderer], Ptr[Byte], Unit], CFuncPtr5[Ptr[PangoRenderer], CString, Ptr[Byte], CInt, CInt, Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object PangoRendererClass:
  given _tag: Tag[PangoRendererClass] = Tag.materializeCStruct15Tag[_root_.gobject.all.GObjectClass, CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], Ptr[PangoGlyphString], CInt, CInt, Unit], CFuncPtr6[Ptr[PangoRenderer], PangoRenderPart, CInt, CInt, CInt, CInt, Unit], CFuncPtr5[Ptr[PangoRenderer], CInt, CInt, CInt, CInt, Unit], CFuncPtr4[Ptr[PangoRenderer], Ptr[Byte], CInt, CInt, Unit], CFuncPtr8[Ptr[PangoRenderer], PangoRenderPart, Double, Double, Double, Double, Double, Double, Unit], CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], PangoGlyph, Double, Double, Unit], CFuncPtr2[Ptr[PangoRenderer], PangoRenderPart, Unit], CFuncPtr1[Ptr[PangoRenderer], Unit], CFuncPtr1[Ptr[PangoRenderer], Unit], CFuncPtr2[Ptr[PangoRenderer], Ptr[Byte], Unit], CFuncPtr5[Ptr[PangoRenderer], CString, Ptr[Byte], CInt, CInt, Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[PangoRendererClass] = scala.scalanative.unsafe.alloc[PangoRendererClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, draw_glyphs : CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], Ptr[PangoGlyphString], CInt, CInt, Unit], draw_rectangle : CFuncPtr6[Ptr[PangoRenderer], PangoRenderPart, CInt, CInt, CInt, CInt, Unit], draw_error_underline : CFuncPtr5[Ptr[PangoRenderer], CInt, CInt, CInt, CInt, Unit], draw_shape : CFuncPtr4[Ptr[PangoRenderer], Ptr[PangoAttrShape], CInt, CInt, Unit], draw_trapezoid : CFuncPtr8[Ptr[PangoRenderer], PangoRenderPart, Double, Double, Double, Double, Double, Double, Unit], draw_glyph : CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], PangoGlyph, Double, Double, Unit], part_changed : CFuncPtr2[Ptr[PangoRenderer], PangoRenderPart, Unit], begin : CFuncPtr1[Ptr[PangoRenderer], Unit], end : CFuncPtr1[Ptr[PangoRenderer], Unit], prepare_run : CFuncPtr2[Ptr[PangoRenderer], Ptr[PangoLayoutRun], Unit], draw_glyph_item : CFuncPtr5[Ptr[PangoRenderer], CString, Ptr[PangoGlyphItem], CInt, CInt, Unit], _pango_reserved2 : CFuncPtr0[Unit], _pango_reserved3 : CFuncPtr0[Unit], _pango_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[PangoRendererClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).draw_glyphs = draw_glyphs
    (!____ptr).draw_rectangle = draw_rectangle
    (!____ptr).draw_error_underline = draw_error_underline
    (!____ptr).draw_shape = draw_shape
    (!____ptr).draw_trapezoid = draw_trapezoid
    (!____ptr).draw_glyph = draw_glyph
    (!____ptr).part_changed = part_changed
    (!____ptr).begin = begin
    (!____ptr).end = end
    (!____ptr).prepare_run = prepare_run
    (!____ptr).draw_glyph_item = draw_glyph_item
    (!____ptr)._pango_reserved2 = _pango_reserved2
    (!____ptr)._pango_reserved3 = _pango_reserved3
    (!____ptr)._pango_reserved4 = _pango_reserved4
    ____ptr
  extension (struct: PangoRendererClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def draw_glyphs : CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], Ptr[PangoGlyphString], CInt, CInt, Unit] = struct._2
    def draw_glyphs_=(value: CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], Ptr[PangoGlyphString], CInt, CInt, Unit]): Unit = !struct.at2 = value
    def draw_rectangle : CFuncPtr6[Ptr[PangoRenderer], PangoRenderPart, CInt, CInt, CInt, CInt, Unit] = struct._3
    def draw_rectangle_=(value: CFuncPtr6[Ptr[PangoRenderer], PangoRenderPart, CInt, CInt, CInt, CInt, Unit]): Unit = !struct.at3 = value
    def draw_error_underline : CFuncPtr5[Ptr[PangoRenderer], CInt, CInt, CInt, CInt, Unit] = struct._4
    def draw_error_underline_=(value: CFuncPtr5[Ptr[PangoRenderer], CInt, CInt, CInt, CInt, Unit]): Unit = !struct.at4 = value
    def draw_shape : CFuncPtr4[Ptr[PangoRenderer], Ptr[PangoAttrShape], CInt, CInt, Unit] = struct._5.asInstanceOf[CFuncPtr4[Ptr[PangoRenderer], Ptr[PangoAttrShape], CInt, CInt, Unit]]
    def draw_shape_=(value: CFuncPtr4[Ptr[PangoRenderer], Ptr[PangoAttrShape], CInt, CInt, Unit]): Unit = !struct.at5 = value.asInstanceOf[CFuncPtr4[Ptr[PangoRenderer], Ptr[Byte], CInt, CInt, Unit]]
    def draw_trapezoid : CFuncPtr8[Ptr[PangoRenderer], PangoRenderPart, Double, Double, Double, Double, Double, Double, Unit] = struct._6
    def draw_trapezoid_=(value: CFuncPtr8[Ptr[PangoRenderer], PangoRenderPart, Double, Double, Double, Double, Double, Double, Unit]): Unit = !struct.at6 = value
    def draw_glyph : CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], PangoGlyph, Double, Double, Unit] = struct._7
    def draw_glyph_=(value: CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], PangoGlyph, Double, Double, Unit]): Unit = !struct.at7 = value
    def part_changed : CFuncPtr2[Ptr[PangoRenderer], PangoRenderPart, Unit] = struct._8
    def part_changed_=(value: CFuncPtr2[Ptr[PangoRenderer], PangoRenderPart, Unit]): Unit = !struct.at8 = value
    def begin : CFuncPtr1[Ptr[PangoRenderer], Unit] = struct._9
    def begin_=(value: CFuncPtr1[Ptr[PangoRenderer], Unit]): Unit = !struct.at9 = value
    def end : CFuncPtr1[Ptr[PangoRenderer], Unit] = struct._10
    def end_=(value: CFuncPtr1[Ptr[PangoRenderer], Unit]): Unit = !struct.at10 = value
    def prepare_run : CFuncPtr2[Ptr[PangoRenderer], Ptr[PangoLayoutRun], Unit] = struct._11.asInstanceOf[CFuncPtr2[Ptr[PangoRenderer], Ptr[PangoLayoutRun], Unit]]
    def prepare_run_=(value: CFuncPtr2[Ptr[PangoRenderer], Ptr[PangoLayoutRun], Unit]): Unit = !struct.at11 = value.asInstanceOf[CFuncPtr2[Ptr[PangoRenderer], Ptr[Byte], Unit]]
    def draw_glyph_item : CFuncPtr5[Ptr[PangoRenderer], CString, Ptr[PangoGlyphItem], CInt, CInt, Unit] = struct._12.asInstanceOf[CFuncPtr5[Ptr[PangoRenderer], CString, Ptr[PangoGlyphItem], CInt, CInt, Unit]]
    def draw_glyph_item_=(value: CFuncPtr5[Ptr[PangoRenderer], CString, Ptr[PangoGlyphItem], CInt, CInt, Unit]): Unit = !struct.at12 = value.asInstanceOf[CFuncPtr5[Ptr[PangoRenderer], CString, Ptr[Byte], CInt, CInt, Unit]]
    def _pango_reserved2 : CFuncPtr0[Unit] = struct._13
    def _pango_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at13 = value
    def _pango_reserved3 : CFuncPtr0[Unit] = struct._14
    def _pango_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at14 = value
    def _pango_reserved4 : CFuncPtr0[Unit] = struct._15
    def _pango_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at15 = value

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-renderer.h
*/
opaque type PangoRendererPrivate = CStruct0
object PangoRendererPrivate:
  given _tag: Tag[PangoRendererPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-script.h
*/
opaque type PangoScriptIter = CStruct0
object PangoScriptIter:
  given _tag: Tag[PangoScriptIter] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-tabs.h
*/
opaque type PangoTabArray = CStruct0
object PangoTabArray:
  given _tag: Tag[PangoTabArray] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-action-row.h
*/
opaque type _AdwActionRow = CStruct1[AdwPreferencesRow]
object _AdwActionRow:
  given _tag: Tag[_AdwActionRow] = Tag.materializeCStruct1Tag[AdwPreferencesRow]
  def apply()(using Zone): Ptr[_AdwActionRow] = scala.scalanative.unsafe.alloc[_AdwActionRow](1)
  def apply(parent_instance : AdwPreferencesRow)(using Zone): Ptr[_AdwActionRow] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _AdwActionRow)
    def parent_instance : AdwPreferencesRow = struct._1
    def parent_instance_=(value: AdwPreferencesRow): Unit = !struct.at1 = value

/**
 * AdwActionRowClass _class: The parent class : Activates the row to trigger its main action.

 * [bindgen] header: /usr/include/libadwaita-1/adw-action-row.h
*/
opaque type _AdwActionRowClass = CStruct3[AdwPreferencesRowClass, CFuncPtr1[Ptr[AdwActionRow], Unit], CArray[_root_.glib.all.gpointer, Nat._4]]
object _AdwActionRowClass:
  given _tag: Tag[_AdwActionRowClass] = Tag.materializeCStruct3Tag[AdwPreferencesRowClass, CFuncPtr1[Ptr[AdwActionRow], Unit], CArray[_root_.glib.all.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[_AdwActionRowClass] = scala.scalanative.unsafe.alloc[_AdwActionRowClass](1)
  def apply(parent_class : AdwPreferencesRowClass, activate : CFuncPtr1[Ptr[AdwActionRow], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._4])(using Zone): Ptr[_AdwActionRowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).activate = activate
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _AdwActionRowClass)
    def parent_class : AdwPreferencesRowClass = struct._1
    def parent_class_=(value: AdwPreferencesRowClass): Unit = !struct.at1 = value
    def activate : CFuncPtr1[Ptr[AdwActionRow], Unit] = struct._2
    def activate_=(value: CFuncPtr1[Ptr[AdwActionRow], Unit]): Unit = !struct.at2 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._4] = struct._3
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._4]): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-animation.h
*/
opaque type _AdwAnimation = CStruct1[_root_.gobject.all.GObject]
object _AdwAnimation:
  given _tag: Tag[_AdwAnimation] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[_AdwAnimation] = scala.scalanative.unsafe.alloc[_AdwAnimation](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[_AdwAnimation] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _AdwAnimation)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-animation.h
*/
opaque type _AdwAnimationClass = CStruct0
object _AdwAnimationClass:
  given _tag: Tag[_AdwAnimationClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-animation-target.h
*/
opaque type _AdwAnimationTarget = CStruct0
object _AdwAnimationTarget:
  given _tag: Tag[_AdwAnimationTarget] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-animation-target.h
*/
opaque type _AdwAnimationTargetClass = CStruct0
object _AdwAnimationTargetClass:
  given _tag: Tag[_AdwAnimationTargetClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-application.h
*/
opaque type _AdwApplication = CStruct1[_root_.gtk.all.GtkApplication]
object _AdwApplication:
  given _tag: Tag[_AdwApplication] = Tag.materializeCStruct1Tag[_root_.gtk.all.GtkApplication]
  def apply()(using Zone): Ptr[_AdwApplication] = scala.scalanative.unsafe.alloc[_AdwApplication](1)
  def apply(parent_instance : _root_.gtk.all.GtkApplication)(using Zone): Ptr[_AdwApplication] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _AdwApplication)
    def parent_instance : _root_.gtk.all.GtkApplication = struct._1
    def parent_instance_=(value: _root_.gtk.all.GtkApplication): Unit = !struct.at1 = value

/**
 * AdwApplicationClass: _class: The parent class

 * [bindgen] header: /usr/include/libadwaita-1/adw-application.h
*/
opaque type _AdwApplicationClass = CStruct2[_root_.gtk.all.GtkApplicationClass, CArray[_root_.glib.all.gpointer, Nat._4]]
object _AdwApplicationClass:
  given _tag: Tag[_AdwApplicationClass] = Tag.materializeCStruct2Tag[_root_.gtk.all.GtkApplicationClass, CArray[_root_.glib.all.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[_AdwApplicationClass] = scala.scalanative.unsafe.alloc[_AdwApplicationClass](1)
  def apply(parent_class : _root_.gtk.all.GtkApplicationClass, padding : CArray[_root_.glib.all.gpointer, Nat._4])(using Zone): Ptr[_AdwApplicationClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _AdwApplicationClass)
    def parent_class : _root_.gtk.all.GtkApplicationClass = struct._1
    def parent_class_=(value: _root_.gtk.all.GtkApplicationClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._4] = struct._2
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._4]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-application-window.h
*/
opaque type _AdwApplicationWindow = CStruct1[_root_.gtk.all.GtkApplicationWindow]
object _AdwApplicationWindow:
  given _tag: Tag[_AdwApplicationWindow] = Tag.materializeCStruct1Tag[_root_.gtk.all.GtkApplicationWindow]
  def apply()(using Zone): Ptr[_AdwApplicationWindow] = scala.scalanative.unsafe.alloc[_AdwApplicationWindow](1)
  def apply(parent_instance : _root_.gtk.all.GtkApplicationWindow)(using Zone): Ptr[_AdwApplicationWindow] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _AdwApplicationWindow)
    def parent_instance : _root_.gtk.all.GtkApplicationWindow = struct._1
    def parent_instance_=(value: _root_.gtk.all.GtkApplicationWindow): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-application-window.h
*/
opaque type _AdwApplicationWindowClass = CStruct2[_root_.gtk.all.GtkApplicationWindowClass, CArray[_root_.glib.all.gpointer, Nat._4]]
object _AdwApplicationWindowClass:
  given _tag: Tag[_AdwApplicationWindowClass] = Tag.materializeCStruct2Tag[_root_.gtk.all.GtkApplicationWindowClass, CArray[_root_.glib.all.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[_AdwApplicationWindowClass] = scala.scalanative.unsafe.alloc[_AdwApplicationWindowClass](1)
  def apply(parent_class : _root_.gtk.all.GtkApplicationWindowClass, padding : CArray[_root_.glib.all.gpointer, Nat._4])(using Zone): Ptr[_AdwApplicationWindowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _AdwApplicationWindowClass)
    def parent_class : _root_.gtk.all.GtkApplicationWindowClass = struct._1
    def parent_class_=(value: _root_.gtk.all.GtkApplicationWindowClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._4] = struct._2
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._4]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-avatar.h
*/
opaque type _AdwAvatar = CStruct0
object _AdwAvatar:
  given _tag: Tag[_AdwAvatar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-bin.h
*/
opaque type _AdwBin = CStruct1[_root_.gtk.all.GtkWidget]
object _AdwBin:
  given _tag: Tag[_AdwBin] = Tag.materializeCStruct1Tag[_root_.gtk.all.GtkWidget]
  def apply()(using Zone): Ptr[_AdwBin] = scala.scalanative.unsafe.alloc[_AdwBin](1)
  def apply(parent_instance : _root_.gtk.all.GtkWidget)(using Zone): Ptr[_AdwBin] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _AdwBin)
    def parent_instance : _root_.gtk.all.GtkWidget = struct._1
    def parent_instance_=(value: _root_.gtk.all.GtkWidget): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-bin.h
*/
opaque type _AdwBinClass = CStruct1[_root_.gtk.all.GtkWidgetClass]
object _AdwBinClass:
  given _tag: Tag[_AdwBinClass] = Tag.materializeCStruct1Tag[_root_.gtk.all.GtkWidgetClass]
  def apply()(using Zone): Ptr[_AdwBinClass] = scala.scalanative.unsafe.alloc[_AdwBinClass](1)
  def apply(parent_class : _root_.gtk.all.GtkWidgetClass)(using Zone): Ptr[_AdwBinClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: _AdwBinClass)
    def parent_class : _root_.gtk.all.GtkWidgetClass = struct._1
    def parent_class_=(value: _root_.gtk.all.GtkWidgetClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-button-content.h
*/
opaque type _AdwButtonContent = CStruct0
object _AdwButtonContent:
  given _tag: Tag[_AdwButtonContent] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-animation-target.h
*/
opaque type _AdwCallbackAnimationTarget = CStruct0
object _AdwCallbackAnimationTarget:
  given _tag: Tag[_AdwCallbackAnimationTarget] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-animation-target.h
*/
opaque type _AdwCallbackAnimationTargetClass = CStruct0
object _AdwCallbackAnimationTargetClass:
  given _tag: Tag[_AdwCallbackAnimationTargetClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-carousel.h
*/
opaque type _AdwCarousel = CStruct0
object _AdwCarousel:
  given _tag: Tag[_AdwCarousel] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-carousel-indicator-dots.h
*/
opaque type _AdwCarouselIndicatorDots = CStruct0
object _AdwCarouselIndicatorDots:
  given _tag: Tag[_AdwCarouselIndicatorDots] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-carousel-indicator-lines.h
*/
opaque type _AdwCarouselIndicatorLines = CStruct0
object _AdwCarouselIndicatorLines:
  given _tag: Tag[_AdwCarouselIndicatorLines] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-clamp.h
*/
opaque type _AdwClamp = CStruct0
object _AdwClamp:
  given _tag: Tag[_AdwClamp] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-clamp-layout.h
*/
opaque type _AdwClampLayout = CStruct0
object _AdwClampLayout:
  given _tag: Tag[_AdwClampLayout] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-clamp-scrollable.h
*/
opaque type _AdwClampScrollable = CStruct0
object _AdwClampScrollable:
  given _tag: Tag[_AdwClampScrollable] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-combo-row.h
*/
opaque type _AdwComboRow = CStruct1[AdwActionRow]
object _AdwComboRow:
  given _tag: Tag[_AdwComboRow] = Tag.materializeCStruct1Tag[AdwActionRow]
  def apply()(using Zone): Ptr[_AdwComboRow] = scala.scalanative.unsafe.alloc[_AdwComboRow](1)
  def apply(parent_instance : AdwActionRow)(using Zone): Ptr[_AdwComboRow] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _AdwComboRow)
    def parent_instance : AdwActionRow = struct._1
    def parent_instance_=(value: AdwActionRow): Unit = !struct.at1 = value

/**
 * AdwComboRowClass _class: The parent class

 * [bindgen] header: /usr/include/libadwaita-1/adw-combo-row.h
*/
opaque type _AdwComboRowClass = CStruct2[AdwActionRowClass, CArray[_root_.glib.all.gpointer, Nat._4]]
object _AdwComboRowClass:
  given _tag: Tag[_AdwComboRowClass] = Tag.materializeCStruct2Tag[AdwActionRowClass, CArray[_root_.glib.all.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[_AdwComboRowClass] = scala.scalanative.unsafe.alloc[_AdwComboRowClass](1)
  def apply(parent_class : AdwActionRowClass, padding : CArray[_root_.glib.all.gpointer, Nat._4])(using Zone): Ptr[_AdwComboRowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _AdwComboRowClass)
    def parent_class : AdwActionRowClass = struct._1
    def parent_class_=(value: AdwActionRowClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._4] = struct._2
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._4]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-enum-list-model.h
*/
opaque type _AdwEnumListItem = CStruct0
object _AdwEnumListItem:
  given _tag: Tag[_AdwEnumListItem] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-enum-list-model.h
*/
opaque type _AdwEnumListModel = CStruct0
object _AdwEnumListModel:
  given _tag: Tag[_AdwEnumListModel] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-expander-row.h
*/
opaque type _AdwExpanderRow = CStruct1[AdwPreferencesRow]
object _AdwExpanderRow:
  given _tag: Tag[_AdwExpanderRow] = Tag.materializeCStruct1Tag[AdwPreferencesRow]
  def apply()(using Zone): Ptr[_AdwExpanderRow] = scala.scalanative.unsafe.alloc[_AdwExpanderRow](1)
  def apply(parent_instance : AdwPreferencesRow)(using Zone): Ptr[_AdwExpanderRow] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _AdwExpanderRow)
    def parent_instance : AdwPreferencesRow = struct._1
    def parent_instance_=(value: AdwPreferencesRow): Unit = !struct.at1 = value

/**
 * AdwExpanderRowClass _class: The parent class

 * [bindgen] header: /usr/include/libadwaita-1/adw-expander-row.h
*/
opaque type _AdwExpanderRowClass = CStruct2[AdwPreferencesRowClass, CArray[_root_.glib.all.gpointer, Nat._4]]
object _AdwExpanderRowClass:
  given _tag: Tag[_AdwExpanderRowClass] = Tag.materializeCStruct2Tag[AdwPreferencesRowClass, CArray[_root_.glib.all.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[_AdwExpanderRowClass] = scala.scalanative.unsafe.alloc[_AdwExpanderRowClass](1)
  def apply(parent_class : AdwPreferencesRowClass, padding : CArray[_root_.glib.all.gpointer, Nat._4])(using Zone): Ptr[_AdwExpanderRowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _AdwExpanderRowClass)
    def parent_class : AdwPreferencesRowClass = struct._1
    def parent_class_=(value: AdwPreferencesRowClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._4] = struct._2
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._4]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-flap.h
*/
opaque type _AdwFlap = CStruct0
object _AdwFlap:
  given _tag: Tag[_AdwFlap] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-header-bar.h
*/
opaque type _AdwHeaderBar = CStruct0
object _AdwHeaderBar:
  given _tag: Tag[_AdwHeaderBar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-leaflet.h
*/
opaque type _AdwLeaflet = CStruct0
object _AdwLeaflet:
  given _tag: Tag[_AdwLeaflet] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-leaflet.h
*/
opaque type _AdwLeafletPage = CStruct0
object _AdwLeafletPage:
  given _tag: Tag[_AdwLeafletPage] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-group.h
*/
opaque type _AdwPreferencesGroup = CStruct1[_root_.gtk.all.GtkWidget]
object _AdwPreferencesGroup:
  given _tag: Tag[_AdwPreferencesGroup] = Tag.materializeCStruct1Tag[_root_.gtk.all.GtkWidget]
  def apply()(using Zone): Ptr[_AdwPreferencesGroup] = scala.scalanative.unsafe.alloc[_AdwPreferencesGroup](1)
  def apply(parent_instance : _root_.gtk.all.GtkWidget)(using Zone): Ptr[_AdwPreferencesGroup] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _AdwPreferencesGroup)
    def parent_instance : _root_.gtk.all.GtkWidget = struct._1
    def parent_instance_=(value: _root_.gtk.all.GtkWidget): Unit = !struct.at1 = value

/**
 * AdwPreferencesGroupClass _class: The parent class

 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-group.h
*/
opaque type _AdwPreferencesGroupClass = CStruct2[_root_.gtk.all.GtkWidgetClass, CArray[_root_.glib.all.gpointer, Nat._4]]
object _AdwPreferencesGroupClass:
  given _tag: Tag[_AdwPreferencesGroupClass] = Tag.materializeCStruct2Tag[_root_.gtk.all.GtkWidgetClass, CArray[_root_.glib.all.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[_AdwPreferencesGroupClass] = scala.scalanative.unsafe.alloc[_AdwPreferencesGroupClass](1)
  def apply(parent_class : _root_.gtk.all.GtkWidgetClass, padding : CArray[_root_.glib.all.gpointer, Nat._4])(using Zone): Ptr[_AdwPreferencesGroupClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _AdwPreferencesGroupClass)
    def parent_class : _root_.gtk.all.GtkWidgetClass = struct._1
    def parent_class_=(value: _root_.gtk.all.GtkWidgetClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._4] = struct._2
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._4]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-page.h
*/
opaque type _AdwPreferencesPage = CStruct1[_root_.gtk.all.GtkWidget]
object _AdwPreferencesPage:
  given _tag: Tag[_AdwPreferencesPage] = Tag.materializeCStruct1Tag[_root_.gtk.all.GtkWidget]
  def apply()(using Zone): Ptr[_AdwPreferencesPage] = scala.scalanative.unsafe.alloc[_AdwPreferencesPage](1)
  def apply(parent_instance : _root_.gtk.all.GtkWidget)(using Zone): Ptr[_AdwPreferencesPage] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _AdwPreferencesPage)
    def parent_instance : _root_.gtk.all.GtkWidget = struct._1
    def parent_instance_=(value: _root_.gtk.all.GtkWidget): Unit = !struct.at1 = value

/**
 * AdwPreferencesPageClass _class: The parent class

 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-page.h
*/
opaque type _AdwPreferencesPageClass = CStruct2[_root_.gtk.all.GtkWidgetClass, CArray[_root_.glib.all.gpointer, Nat._4]]
object _AdwPreferencesPageClass:
  given _tag: Tag[_AdwPreferencesPageClass] = Tag.materializeCStruct2Tag[_root_.gtk.all.GtkWidgetClass, CArray[_root_.glib.all.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[_AdwPreferencesPageClass] = scala.scalanative.unsafe.alloc[_AdwPreferencesPageClass](1)
  def apply(parent_class : _root_.gtk.all.GtkWidgetClass, padding : CArray[_root_.glib.all.gpointer, Nat._4])(using Zone): Ptr[_AdwPreferencesPageClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _AdwPreferencesPageClass)
    def parent_class : _root_.gtk.all.GtkWidgetClass = struct._1
    def parent_class_=(value: _root_.gtk.all.GtkWidgetClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._4] = struct._2
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._4]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-row.h
*/
opaque type _AdwPreferencesRow = CStruct1[_root_.gtk.all.GtkListBoxRow]
object _AdwPreferencesRow:
  given _tag: Tag[_AdwPreferencesRow] = Tag.materializeCStruct1Tag[_root_.gtk.all.GtkListBoxRow]
  def apply()(using Zone): Ptr[_AdwPreferencesRow] = scala.scalanative.unsafe.alloc[_AdwPreferencesRow](1)
  def apply(parent_instance : _root_.gtk.all.GtkListBoxRow)(using Zone): Ptr[_AdwPreferencesRow] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _AdwPreferencesRow)
    def parent_instance : _root_.gtk.all.GtkListBoxRow = struct._1
    def parent_instance_=(value: _root_.gtk.all.GtkListBoxRow): Unit = !struct.at1 = value

/**
 * AdwPreferencesRowClass _class: The parent class

 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-row.h
*/
opaque type _AdwPreferencesRowClass = CStruct2[_root_.gtk.all.GtkListBoxRowClass, CArray[_root_.glib.all.gpointer, Nat._4]]
object _AdwPreferencesRowClass:
  given _tag: Tag[_AdwPreferencesRowClass] = Tag.materializeCStruct2Tag[_root_.gtk.all.GtkListBoxRowClass, CArray[_root_.glib.all.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[_AdwPreferencesRowClass] = scala.scalanative.unsafe.alloc[_AdwPreferencesRowClass](1)
  def apply(parent_class : _root_.gtk.all.GtkListBoxRowClass, padding : CArray[_root_.glib.all.gpointer, Nat._4])(using Zone): Ptr[_AdwPreferencesRowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _AdwPreferencesRowClass)
    def parent_class : _root_.gtk.all.GtkListBoxRowClass = struct._1
    def parent_class_=(value: _root_.gtk.all.GtkListBoxRowClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._4] = struct._2
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._4]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-window.h
*/
opaque type _AdwPreferencesWindow = CStruct1[AdwWindow]
object _AdwPreferencesWindow:
  given _tag: Tag[_AdwPreferencesWindow] = Tag.materializeCStruct1Tag[AdwWindow]
  def apply()(using Zone): Ptr[_AdwPreferencesWindow] = scala.scalanative.unsafe.alloc[_AdwPreferencesWindow](1)
  def apply(parent_instance : AdwWindow)(using Zone): Ptr[_AdwPreferencesWindow] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _AdwPreferencesWindow)
    def parent_instance : AdwWindow = struct._1
    def parent_instance_=(value: AdwWindow): Unit = !struct.at1 = value

/**
 * AdwPreferencesWindowClass _class: The parent class

 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-window.h
*/
opaque type _AdwPreferencesWindowClass = CStruct2[AdwWindowClass, CArray[_root_.glib.all.gpointer, Nat._4]]
object _AdwPreferencesWindowClass:
  given _tag: Tag[_AdwPreferencesWindowClass] = Tag.materializeCStruct2Tag[AdwWindowClass, CArray[_root_.glib.all.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[_AdwPreferencesWindowClass] = scala.scalanative.unsafe.alloc[_AdwPreferencesWindowClass](1)
  def apply(parent_class : AdwWindowClass, padding : CArray[_root_.glib.all.gpointer, Nat._4])(using Zone): Ptr[_AdwPreferencesWindowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _AdwPreferencesWindowClass)
    def parent_class : AdwWindowClass = struct._1
    def parent_class_=(value: AdwWindowClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._4] = struct._2
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._4]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-split-button.h
*/
opaque type _AdwSplitButton = CStruct0
object _AdwSplitButton:
  given _tag: Tag[_AdwSplitButton] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-spring-animation.h
*/
opaque type _AdwSpringAnimation = CStruct0
object _AdwSpringAnimation:
  given _tag: Tag[_AdwSpringAnimation] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-spring-animation.h
*/
opaque type _AdwSpringAnimationClass = CStruct0
object _AdwSpringAnimationClass:
  given _tag: Tag[_AdwSpringAnimationClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-spring-params.h
*/
opaque type _AdwSpringParams = CStruct0
object _AdwSpringParams:
  given _tag: Tag[_AdwSpringParams] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-squeezer.h
*/
opaque type _AdwSqueezer = CStruct0
object _AdwSqueezer:
  given _tag: Tag[_AdwSqueezer] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-squeezer.h
*/
opaque type _AdwSqueezerPage = CStruct0
object _AdwSqueezerPage:
  given _tag: Tag[_AdwSqueezerPage] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-status-page.h
*/
opaque type _AdwStatusPage = CStruct0
object _AdwStatusPage:
  given _tag: Tag[_AdwStatusPage] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-style-manager.h
*/
opaque type _AdwStyleManager = CStruct0
object _AdwStyleManager:
  given _tag: Tag[_AdwStyleManager] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-swipe-tracker.h
*/
opaque type _AdwSwipeTracker = CStruct0
object _AdwSwipeTracker:
  given _tag: Tag[_AdwSwipeTracker] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-swipeable.h
*/
opaque type _AdwSwipeable = CStruct0
object _AdwSwipeable:
  given _tag: Tag[_AdwSwipeable] = Tag.materializeCStruct0Tag

/**
 * AdwSwipeableInterface: : The parent interface. _distance: Gets the swipe distance. _snap_points: Gets the snap points. _progress: Gets the current progress. _cancel_progress: Gets the cancel progress. _swipe_area: Gets the swipeable rectangle.

 * [bindgen] header: /usr/include/libadwaita-1/adw-swipeable.h
*/
opaque type _AdwSwipeableInterface = CStruct7[_root_.gobject.all.GTypeInterface, CFuncPtr1[Ptr[AdwSwipeable], Double], CFuncPtr2[Ptr[AdwSwipeable], Ptr[CInt], Ptr[Double]], CFuncPtr1[Ptr[AdwSwipeable], Double], CFuncPtr1[Ptr[AdwSwipeable], Double], CFuncPtr4[Ptr[AdwSwipeable], AdwNavigationDirection, _root_.glib.all.gboolean, Ptr[GdkRectangle], Unit], CArray[_root_.glib.all.gpointer, Nat._4]]
object _AdwSwipeableInterface:
  given _tag: Tag[_AdwSwipeableInterface] = Tag.materializeCStruct7Tag[_root_.gobject.all.GTypeInterface, CFuncPtr1[Ptr[AdwSwipeable], Double], CFuncPtr2[Ptr[AdwSwipeable], Ptr[CInt], Ptr[Double]], CFuncPtr1[Ptr[AdwSwipeable], Double], CFuncPtr1[Ptr[AdwSwipeable], Double], CFuncPtr4[Ptr[AdwSwipeable], AdwNavigationDirection, _root_.glib.all.gboolean, Ptr[GdkRectangle], Unit], CArray[_root_.glib.all.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[_AdwSwipeableInterface] = scala.scalanative.unsafe.alloc[_AdwSwipeableInterface](1)
  def apply(parent : _root_.gobject.all.GTypeInterface, get_distance : CFuncPtr1[Ptr[AdwSwipeable], Double], get_snap_points : CFuncPtr2[Ptr[AdwSwipeable], Ptr[CInt], Ptr[Double]], get_progress : CFuncPtr1[Ptr[AdwSwipeable], Double], get_cancel_progress : CFuncPtr1[Ptr[AdwSwipeable], Double], get_swipe_area : CFuncPtr4[Ptr[AdwSwipeable], AdwNavigationDirection, _root_.glib.all.gboolean, Ptr[GdkRectangle], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._4])(using Zone): Ptr[_AdwSwipeableInterface] = 
    val ____ptr = apply()
    (!____ptr).parent = parent
    (!____ptr).get_distance = get_distance
    (!____ptr).get_snap_points = get_snap_points
    (!____ptr).get_progress = get_progress
    (!____ptr).get_cancel_progress = get_cancel_progress
    (!____ptr).get_swipe_area = get_swipe_area
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _AdwSwipeableInterface)
    def parent : _root_.gobject.all.GTypeInterface = struct._1
    def parent_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def get_distance : CFuncPtr1[Ptr[AdwSwipeable], Double] = struct._2
    def get_distance_=(value: CFuncPtr1[Ptr[AdwSwipeable], Double]): Unit = !struct.at2 = value
    def get_snap_points : CFuncPtr2[Ptr[AdwSwipeable], Ptr[CInt], Ptr[Double]] = struct._3
    def get_snap_points_=(value: CFuncPtr2[Ptr[AdwSwipeable], Ptr[CInt], Ptr[Double]]): Unit = !struct.at3 = value
    def get_progress : CFuncPtr1[Ptr[AdwSwipeable], Double] = struct._4
    def get_progress_=(value: CFuncPtr1[Ptr[AdwSwipeable], Double]): Unit = !struct.at4 = value
    def get_cancel_progress : CFuncPtr1[Ptr[AdwSwipeable], Double] = struct._5
    def get_cancel_progress_=(value: CFuncPtr1[Ptr[AdwSwipeable], Double]): Unit = !struct.at5 = value
    def get_swipe_area : CFuncPtr4[Ptr[AdwSwipeable], AdwNavigationDirection, _root_.glib.all.gboolean, Ptr[GdkRectangle], Unit] = struct._6
    def get_swipe_area_=(value: CFuncPtr4[Ptr[AdwSwipeable], AdwNavigationDirection, _root_.glib.all.gboolean, Ptr[GdkRectangle], Unit]): Unit = !struct.at6 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._4] = struct._7
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._4]): Unit = !struct.at7 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-tab-bar.h
*/
opaque type _AdwTabBar = CStruct0
object _AdwTabBar:
  given _tag: Tag[_AdwTabBar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-tab-view.h
*/
opaque type _AdwTabPage = CStruct0
object _AdwTabPage:
  given _tag: Tag[_AdwTabPage] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-tab-view.h
*/
opaque type _AdwTabView = CStruct0
object _AdwTabView:
  given _tag: Tag[_AdwTabView] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-timed-animation.h
*/
opaque type _AdwTimedAnimation = CStruct0
object _AdwTimedAnimation:
  given _tag: Tag[_AdwTimedAnimation] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-timed-animation.h
*/
opaque type _AdwTimedAnimationClass = CStruct0
object _AdwTimedAnimationClass:
  given _tag: Tag[_AdwTimedAnimationClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-toast.h
*/
opaque type _AdwToast = CStruct0
object _AdwToast:
  given _tag: Tag[_AdwToast] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-toast-overlay.h
*/
opaque type _AdwToastOverlay = CStruct0
object _AdwToastOverlay:
  given _tag: Tag[_AdwToastOverlay] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-stack.h
*/
opaque type _AdwViewStack = CStruct0
object _AdwViewStack:
  given _tag: Tag[_AdwViewStack] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-stack.h
*/
opaque type _AdwViewStackPage = CStruct0
object _AdwViewStackPage:
  given _tag: Tag[_AdwViewStackPage] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-switcher.h
*/
opaque type _AdwViewSwitcher = CStruct0
object _AdwViewSwitcher:
  given _tag: Tag[_AdwViewSwitcher] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-switcher-bar.h
*/
opaque type _AdwViewSwitcherBar = CStruct0
object _AdwViewSwitcherBar:
  given _tag: Tag[_AdwViewSwitcherBar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-switcher-title.h
*/
opaque type _AdwViewSwitcherTitle = CStruct0
object _AdwViewSwitcherTitle:
  given _tag: Tag[_AdwViewSwitcherTitle] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-window.h
*/
opaque type _AdwWindow = CStruct1[_root_.gtk.all.GtkWindow]
object _AdwWindow:
  given _tag: Tag[_AdwWindow] = Tag.materializeCStruct1Tag[_root_.gtk.all.GtkWindow]
  def apply()(using Zone): Ptr[_AdwWindow] = scala.scalanative.unsafe.alloc[_AdwWindow](1)
  def apply(parent_instance : _root_.gtk.all.GtkWindow)(using Zone): Ptr[_AdwWindow] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _AdwWindow)
    def parent_instance : _root_.gtk.all.GtkWindow = struct._1
    def parent_instance_=(value: _root_.gtk.all.GtkWindow): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-window.h
*/
opaque type _AdwWindowClass = CStruct2[_root_.gtk.all.GtkWindowClass, CArray[_root_.glib.all.gpointer, Nat._4]]
object _AdwWindowClass:
  given _tag: Tag[_AdwWindowClass] = Tag.materializeCStruct2Tag[_root_.gtk.all.GtkWindowClass, CArray[_root_.glib.all.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[_AdwWindowClass] = scala.scalanative.unsafe.alloc[_AdwWindowClass](1)
  def apply(parent_class : _root_.gtk.all.GtkWindowClass, padding : CArray[_root_.glib.all.gpointer, Nat._4])(using Zone): Ptr[_AdwWindowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _AdwWindowClass)
    def parent_class : _root_.gtk.all.GtkWindowClass = struct._1
    def parent_class_=(value: _root_.gtk.all.GtkWindowClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._4] = struct._2
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._4]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-window-title.h
*/
opaque type _AdwWindowTitle = CStruct0
object _AdwWindowTitle:
  given _tag: Tag[_AdwWindowTitle] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type _GdkAppLaunchContext = CStruct0
object _GdkAppLaunchContext:
  given _tag: Tag[_GdkAppLaunchContext] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type _GdkButtonEvent = CStruct0
object _GdkButtonEvent:
  given _tag: Tag[_GdkButtonEvent] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type _GdkCairoContext = CStruct0
object _GdkCairoContext:
  given _tag: Tag[_GdkCairoContext] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type _GdkClipboard = CStruct0
object _GdkClipboard:
  given _tag: Tag[_GdkClipboard] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkcontentdeserializer.h
*/
opaque type _GdkContentDeserializer = CStruct0
object _GdkContentDeserializer:
  given _tag: Tag[_GdkContentDeserializer] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type _GdkContentFormats = CStruct0
object _GdkContentFormats:
  given _tag: Tag[_GdkContentFormats] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkcontentformats.h
*/
opaque type _GdkContentFormatsBuilder = CStruct0
object _GdkContentFormatsBuilder:
  given _tag: Tag[_GdkContentFormatsBuilder] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkcontentprovider.h
*/
opaque type _GdkContentProvider = CStruct1[_root_.gobject.all.GObject]
object _GdkContentProvider:
  given _tag: Tag[_GdkContentProvider] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[_GdkContentProvider] = scala.scalanative.unsafe.alloc[_GdkContentProvider](1)
  def apply(parent : _root_.gobject.all.GObject)(using Zone): Ptr[_GdkContentProvider] = 
    val ____ptr = apply()
    (!____ptr).parent = parent
    ____ptr
  extension (struct: _GdkContentProvider)
    def parent : _root_.gobject.all.GObject = struct._1
    def parent_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * GdkContentProviderClass: _changed: Signal class closure for `GdkContentProvider::content-changed`

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkcontentprovider.h
*/
opaque type _GdkContentProviderClass = CStruct10[_root_.gobject.all.GObjectClass, CFuncPtr1[Ptr[GdkContentProvider], Unit], CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit], CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit], CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]], CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]], CFuncPtr7[Ptr[GdkContentProvider], CString, Ptr[_root_.gio.all.GOutputStream], CInt, Ptr[_root_.gio.all.GCancellable], _root_.gio.all.GAsyncReadyCallback, _root_.glib.all.gpointer, Unit], CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.gio.all.GAsyncResult], Ptr[Ptr[_root_.glib.all.GError]], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.gobject.all.GValue], Ptr[Ptr[_root_.glib.all.GError]], _root_.glib.all.gboolean], CArray[_root_.glib.all.gpointer, Nat._8]]
object _GdkContentProviderClass:
  given _tag: Tag[_GdkContentProviderClass] = Tag.materializeCStruct10Tag[_root_.gobject.all.GObjectClass, CFuncPtr1[Ptr[GdkContentProvider], Unit], CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit], CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit], CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]], CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]], CFuncPtr7[Ptr[GdkContentProvider], CString, Ptr[_root_.gio.all.GOutputStream], CInt, Ptr[_root_.gio.all.GCancellable], _root_.gio.all.GAsyncReadyCallback, _root_.glib.all.gpointer, Unit], CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.gio.all.GAsyncResult], Ptr[Ptr[_root_.glib.all.GError]], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.gobject.all.GValue], Ptr[Ptr[_root_.glib.all.GError]], _root_.glib.all.gboolean], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GdkContentProviderClass] = scala.scalanative.unsafe.alloc[_GdkContentProviderClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, content_changed : CFuncPtr1[Ptr[GdkContentProvider], Unit], attach_clipboard : CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit], detach_clipboard : CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit], ref_formats : CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]], ref_storable_formats : CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]], write_mime_type_async : CFuncPtr7[Ptr[GdkContentProvider], CString, Ptr[_root_.gio.all.GOutputStream], CInt, Ptr[_root_.gio.all.GCancellable], _root_.gio.all.GAsyncReadyCallback, _root_.glib.all.gpointer, Unit], write_mime_type_finish : CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.gio.all.GAsyncResult], Ptr[Ptr[_root_.glib.all.GError]], _root_.glib.all.gboolean], get_value : CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.gobject.all.GValue], Ptr[Ptr[_root_.glib.all.GError]], _root_.glib.all.gboolean], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GdkContentProviderClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).content_changed = content_changed
    (!____ptr).attach_clipboard = attach_clipboard
    (!____ptr).detach_clipboard = detach_clipboard
    (!____ptr).ref_formats = ref_formats
    (!____ptr).ref_storable_formats = ref_storable_formats
    (!____ptr).write_mime_type_async = write_mime_type_async
    (!____ptr).write_mime_type_finish = write_mime_type_finish
    (!____ptr).get_value = get_value
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GdkContentProviderClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def content_changed : CFuncPtr1[Ptr[GdkContentProvider], Unit] = struct._2
    def content_changed_=(value: CFuncPtr1[Ptr[GdkContentProvider], Unit]): Unit = !struct.at2 = value
    def attach_clipboard : CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit] = struct._3
    def attach_clipboard_=(value: CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit]): Unit = !struct.at3 = value
    def detach_clipboard : CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit] = struct._4
    def detach_clipboard_=(value: CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit]): Unit = !struct.at4 = value
    def ref_formats : CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]] = struct._5
    def ref_formats_=(value: CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]]): Unit = !struct.at5 = value
    def ref_storable_formats : CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]] = struct._6
    def ref_storable_formats_=(value: CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]]): Unit = !struct.at6 = value
    def write_mime_type_async : CFuncPtr7[Ptr[GdkContentProvider], CString, Ptr[_root_.gio.all.GOutputStream], CInt, Ptr[_root_.gio.all.GCancellable], _root_.gio.all.GAsyncReadyCallback, _root_.glib.all.gpointer, Unit] = struct._7
    def write_mime_type_async_=(value: CFuncPtr7[Ptr[GdkContentProvider], CString, Ptr[_root_.gio.all.GOutputStream], CInt, Ptr[_root_.gio.all.GCancellable], _root_.gio.all.GAsyncReadyCallback, _root_.glib.all.gpointer, Unit]): Unit = !struct.at7 = value
    def write_mime_type_finish : CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.gio.all.GAsyncResult], Ptr[Ptr[_root_.glib.all.GError]], _root_.glib.all.gboolean] = struct._8
    def write_mime_type_finish_=(value: CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.gio.all.GAsyncResult], Ptr[Ptr[_root_.glib.all.GError]], _root_.glib.all.gboolean]): Unit = !struct.at8 = value
    def get_value : CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.gobject.all.GValue], Ptr[Ptr[_root_.glib.all.GError]], _root_.glib.all.gboolean] = struct._9
    def get_value_=(value: CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.gobject.all.GValue], Ptr[Ptr[_root_.glib.all.GError]], _root_.glib.all.gboolean]): Unit = !struct.at9 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._10
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at10 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkcontentserializer.h
*/
opaque type _GdkContentSerializer = CStruct0
object _GdkContentSerializer:
  given _tag: Tag[_GdkContentSerializer] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type _GdkCrossingEvent = CStruct0
object _GdkCrossingEvent:
  given _tag: Tag[_GdkCrossingEvent] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type _GdkCursor = CStruct0
object _GdkCursor:
  given _tag: Tag[_GdkCursor] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type _GdkDNDEvent = CStruct0
object _GdkDNDEvent:
  given _tag: Tag[_GdkDNDEvent] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type _GdkDeleteEvent = CStruct0
object _GdkDeleteEvent:
  given _tag: Tag[_GdkDeleteEvent] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type _GdkDevice = CStruct0
object _GdkDevice:
  given _tag: Tag[_GdkDevice] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkdevicepad.h
*/
opaque type _GdkDevicePad = CStruct0
object _GdkDevicePad:
  given _tag: Tag[_GdkDevicePad] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkdevicepad.h
*/
opaque type _GdkDevicePadInterface = CStruct0
object _GdkDevicePadInterface:
  given _tag: Tag[_GdkDevicePadInterface] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkdevicetool.h
*/
opaque type _GdkDeviceTool = CStruct0
object _GdkDeviceTool:
  given _tag: Tag[_GdkDeviceTool] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type _GdkDisplay = CStruct0
object _GdkDisplay:
  given _tag: Tag[_GdkDisplay] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type _GdkDisplayManager = CStruct0
object _GdkDisplayManager:
  given _tag: Tag[_GdkDisplayManager] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type _GdkDrag = CStruct0
object _GdkDrag:
  given _tag: Tag[_GdkDrag] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkdragsurface.h
*/
opaque type _GdkDragSurface = CStruct0
object _GdkDragSurface:
  given _tag: Tag[_GdkDragSurface] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkdragsurface.h
*/
opaque type _GdkDragSurfaceInterface = CStruct0
object _GdkDragSurfaceInterface:
  given _tag: Tag[_GdkDragSurfaceInterface] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type _GdkDrawContext = CStruct0
object _GdkDrawContext:
  given _tag: Tag[_GdkDrawContext] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type _GdkDrop = CStruct0
object _GdkDrop:
  given _tag: Tag[_GdkDrop] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type _GdkEvent = CStruct0
object _GdkEvent:
  given _tag: Tag[_GdkEvent] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type _GdkEventSequence = CStruct0
object _GdkEventSequence:
  given _tag: Tag[_GdkEventSequence] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkcontentformats.h
*/
opaque type _GdkFileList = CStruct0
object _GdkFileList:
  given _tag: Tag[_GdkFileList] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type _GdkFocusEvent = CStruct0
object _GdkFocusEvent:
  given _tag: Tag[_GdkFocusEvent] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkframeclock.h
*/
opaque type _GdkFrameClock = CStruct0
object _GdkFrameClock:
  given _tag: Tag[_GdkFrameClock] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkframeclock.h
*/
opaque type _GdkFrameClockClass = CStruct0
object _GdkFrameClockClass:
  given _tag: Tag[_GdkFrameClockClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkframeclock.h
*/
opaque type _GdkFrameClockPrivate = CStruct0
object _GdkFrameClockPrivate:
  given _tag: Tag[_GdkFrameClockPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkframetimings.h
*/
opaque type _GdkFrameTimings = CStruct0
object _GdkFrameTimings:
  given _tag: Tag[_GdkFrameTimings] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type _GdkGLContext = CStruct0
object _GdkGLContext:
  given _tag: Tag[_GdkGLContext] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkgltexture.h
*/
opaque type _GdkGLTexture = CStruct0
object _GdkGLTexture:
  given _tag: Tag[_GdkGLTexture] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkgltexture.h
*/
opaque type _GdkGLTextureClass = CStruct0
object _GdkGLTextureClass:
  given _tag: Tag[_GdkGLTextureClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type _GdkGrabBrokenEvent = CStruct0
object _GdkGrabBrokenEvent:
  given _tag: Tag[_GdkGrabBrokenEvent] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type _GdkKeyEvent = CStruct0
object _GdkKeyEvent:
  given _tag: Tag[_GdkKeyEvent] = Tag.materializeCStruct0Tag

/**
 * GdkKeymapKey: : the hardware keycode. This is an identifying number for a physical key. : indicates movement in a horizontal direction. Usually groups are used for two different languages. In group 0, a key might have two English characters, and in group 1 it might have two Hebrew characters. The Hebrew characters will be printed on the key next to the English characters. : indicates which symbol on the key will be used, in a vertical direction. So on a standard US keyboard, the key with the number “1” on it also has the exclamation point ("!") character on it. The level indicates whether to use the “1” or the “!” symbol. The letter keys are considered to have a lowercase letter at level 0, and an uppercase letter at level 1, though only the uppercase letter is printed.

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type _GdkKeymapKey = CStruct3[_root_.glib.all.guint, CInt, CInt]
object _GdkKeymapKey:
  given _tag: Tag[_GdkKeymapKey] = Tag.materializeCStruct3Tag[_root_.glib.all.guint, CInt, CInt]
  def apply()(using Zone): Ptr[_GdkKeymapKey] = scala.scalanative.unsafe.alloc[_GdkKeymapKey](1)
  def apply(keycode : _root_.glib.all.guint, group : CInt, level : CInt)(using Zone): Ptr[_GdkKeymapKey] = 
    val ____ptr = apply()
    (!____ptr).keycode = keycode
    (!____ptr).group = group
    (!____ptr).level = level
    ____ptr
  extension (struct: _GdkKeymapKey)
    def keycode : _root_.glib.all.guint = struct._1
    def keycode_=(value: _root_.glib.all.guint): Unit = !struct.at1 = value
    def group : CInt = struct._2
    def group_=(value: CInt): Unit = !struct.at2 = value
    def level : CInt = struct._3
    def level_=(value: CInt): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkmemorytexture.h
*/
opaque type _GdkMemoryTexture = CStruct0
object _GdkMemoryTexture:
  given _tag: Tag[_GdkMemoryTexture] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkmemorytexture.h
*/
opaque type _GdkMemoryTextureClass = CStruct0
object _GdkMemoryTextureClass:
  given _tag: Tag[_GdkMemoryTextureClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkmonitor.h
*/
opaque type _GdkMonitor = CStruct0
object _GdkMonitor:
  given _tag: Tag[_GdkMonitor] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkmonitor.h
*/
opaque type _GdkMonitorClass = CStruct0
object _GdkMonitorClass:
  given _tag: Tag[_GdkMonitorClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type _GdkMotionEvent = CStruct0
object _GdkMotionEvent:
  given _tag: Tag[_GdkMotionEvent] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type _GdkPadEvent = CStruct0
object _GdkPadEvent:
  given _tag: Tag[_GdkPadEvent] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkpaintable.h
*/
opaque type _GdkPaintable = CStruct0
object _GdkPaintable:
  given _tag: Tag[_GdkPaintable] = Tag.materializeCStruct0Tag

/**
 * GdkPaintableInterface: : Snapshot the paintable. The given and are guaranteed to be larger than 0.0. The resulting snapshot must modify only the area in the rectangle from (0,0) to (width, height). This is the only function that must be implemented for this interface. _current_image: return a `GdkPaintable` that does not change over time. This means the `GDK_PAINTABLE_STATIC_SIZE` and `GDK_PAINTABLE_STATIC_CONTENTS` flag are set. _flags: Get the flags for this instance. See [enum.PaintableFlags] for details. _intrinsic_width: The preferred width for this object to be snapshot at or 0 if none. This is purely a hint. The object must still be able to render at any size. _intrinsic_height: The preferred height for this object to be snapshot at or 0 if none. This is purely a hint. The object must still be able to render at any size. _intrinsic_aspect_ratio: The preferred aspect ratio for this object or 0 if none. If both [vfunc.Paintable.get_intrinsic_width] and [vfunc.Paintable.get_intrinsic_height] return non-zero values, this function should return the aspect ratio computed from those.

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkpaintable.h
*/
opaque type _GdkPaintableInterface = CStruct7[_root_.gobject.all.GTypeInterface, CFuncPtr4[Ptr[GdkPaintable], Ptr[GdkSnapshot], Double, Double, Unit], CFuncPtr1[Ptr[GdkPaintable], Ptr[GdkPaintable]], CFuncPtr1[Ptr[GdkPaintable], GdkPaintableFlags], CFuncPtr1[Ptr[GdkPaintable], CInt], CFuncPtr1[Ptr[GdkPaintable], CInt], CFuncPtr1[Ptr[GdkPaintable], Double]]
object _GdkPaintableInterface:
  given _tag: Tag[_GdkPaintableInterface] = Tag.materializeCStruct7Tag[_root_.gobject.all.GTypeInterface, CFuncPtr4[Ptr[GdkPaintable], Ptr[GdkSnapshot], Double, Double, Unit], CFuncPtr1[Ptr[GdkPaintable], Ptr[GdkPaintable]], CFuncPtr1[Ptr[GdkPaintable], GdkPaintableFlags], CFuncPtr1[Ptr[GdkPaintable], CInt], CFuncPtr1[Ptr[GdkPaintable], CInt], CFuncPtr1[Ptr[GdkPaintable], Double]]
  def apply()(using Zone): Ptr[_GdkPaintableInterface] = scala.scalanative.unsafe.alloc[_GdkPaintableInterface](1)
  def apply(g_iface : _root_.gobject.all.GTypeInterface, snapshot : CFuncPtr4[Ptr[GdkPaintable], Ptr[GdkSnapshot], Double, Double, Unit], get_current_image : CFuncPtr1[Ptr[GdkPaintable], Ptr[GdkPaintable]], get_flags : CFuncPtr1[Ptr[GdkPaintable], GdkPaintableFlags], get_intrinsic_width : CFuncPtr1[Ptr[GdkPaintable], CInt], get_intrinsic_height : CFuncPtr1[Ptr[GdkPaintable], CInt], get_intrinsic_aspect_ratio : CFuncPtr1[Ptr[GdkPaintable], Double])(using Zone): Ptr[_GdkPaintableInterface] = 
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).snapshot = snapshot
    (!____ptr).get_current_image = get_current_image
    (!____ptr).get_flags = get_flags
    (!____ptr).get_intrinsic_width = get_intrinsic_width
    (!____ptr).get_intrinsic_height = get_intrinsic_height
    (!____ptr).get_intrinsic_aspect_ratio = get_intrinsic_aspect_ratio
    ____ptr
  extension (struct: _GdkPaintableInterface)
    def g_iface : _root_.gobject.all.GTypeInterface = struct._1
    def g_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def snapshot : CFuncPtr4[Ptr[GdkPaintable], Ptr[GdkSnapshot], Double, Double, Unit] = struct._2
    def snapshot_=(value: CFuncPtr4[Ptr[GdkPaintable], Ptr[GdkSnapshot], Double, Double, Unit]): Unit = !struct.at2 = value
    def get_current_image : CFuncPtr1[Ptr[GdkPaintable], Ptr[GdkPaintable]] = struct._3
    def get_current_image_=(value: CFuncPtr1[Ptr[GdkPaintable], Ptr[GdkPaintable]]): Unit = !struct.at3 = value
    def get_flags : CFuncPtr1[Ptr[GdkPaintable], GdkPaintableFlags] = struct._4
    def get_flags_=(value: CFuncPtr1[Ptr[GdkPaintable], GdkPaintableFlags]): Unit = !struct.at4 = value
    def get_intrinsic_width : CFuncPtr1[Ptr[GdkPaintable], CInt] = struct._5
    def get_intrinsic_width_=(value: CFuncPtr1[Ptr[GdkPaintable], CInt]): Unit = !struct.at5 = value
    def get_intrinsic_height : CFuncPtr1[Ptr[GdkPaintable], CInt] = struct._6
    def get_intrinsic_height_=(value: CFuncPtr1[Ptr[GdkPaintable], CInt]): Unit = !struct.at6 = value
    def get_intrinsic_aspect_ratio : CFuncPtr1[Ptr[GdkPaintable], Double] = struct._7
    def get_intrinsic_aspect_ratio_=(value: CFuncPtr1[Ptr[GdkPaintable], Double]): Unit = !struct.at7 = value

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

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkpopup.h
*/
opaque type _GdkPopup = CStruct0
object _GdkPopup:
  given _tag: Tag[_GdkPopup] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkpopup.h
*/
opaque type _GdkPopupInterface = CStruct0
object _GdkPopupInterface:
  given _tag: Tag[_GdkPopupInterface] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkpopuplayout.h
*/
opaque type _GdkPopupLayout = CStruct0
object _GdkPopupLayout:
  given _tag: Tag[_GdkPopupLayout] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type _GdkProximityEvent = CStruct0
object _GdkProximityEvent:
  given _tag: Tag[_GdkProximityEvent] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkrgba.h
*/
opaque type _GdkRGBA = CStruct4[Float, Float, Float, Float]
object _GdkRGBA:
  given _tag: Tag[_GdkRGBA] = Tag.materializeCStruct4Tag[Float, Float, Float, Float]
  def apply()(using Zone): Ptr[_GdkRGBA] = scala.scalanative.unsafe.alloc[_GdkRGBA](1)
  def apply(red : Float, green : Float, blue : Float, alpha : Float)(using Zone): Ptr[_GdkRGBA] = 
    val ____ptr = apply()
    (!____ptr).red = red
    (!____ptr).green = green
    (!____ptr).blue = blue
    (!____ptr).alpha = alpha
    ____ptr
  extension (struct: _GdkRGBA)
    def red : Float = struct._1
    def red_=(value: Float): Unit = !struct.at1 = value
    def green : Float = struct._2
    def green_=(value: Float): Unit = !struct.at2 = value
    def blue : Float = struct._3
    def blue_=(value: Float): Unit = !struct.at3 = value
    def alpha : Float = struct._4
    def alpha_=(value: Float): Unit = !struct.at4 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type _GdkScrollEvent = CStruct0
object _GdkScrollEvent:
  given _tag: Tag[_GdkScrollEvent] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkseat.h
*/
opaque type _GdkSeat = CStruct1[_root_.gobject.all.GObject]
object _GdkSeat:
  given _tag: Tag[_GdkSeat] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[_GdkSeat] = scala.scalanative.unsafe.alloc[_GdkSeat](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[_GdkSeat] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GdkSeat)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type _GdkSnapshot = CStruct0
object _GdkSnapshot:
  given _tag: Tag[_GdkSnapshot] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdksnapshot.h
*/
opaque type _GdkSnapshotClass = CStruct0
object _GdkSnapshotClass:
  given _tag: Tag[_GdkSnapshotClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type _GdkSurface = CStruct0
object _GdkSurface:
  given _tag: Tag[_GdkSurface] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdksurface.h
*/
opaque type _GdkSurfaceClass = CStruct0
object _GdkSurfaceClass:
  given _tag: Tag[_GdkSurfaceClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type _GdkTexture = CStruct0
object _GdkTexture:
  given _tag: Tag[_GdkTexture] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktexture.h
*/
opaque type _GdkTextureClass = CStruct0
object _GdkTextureClass:
  given _tag: Tag[_GdkTextureClass] = Tag.materializeCStruct0Tag

/**
 * GdkTimeCoord: : The timestamp for this event : Flags indicating what axes are present : (array fixed-size=12): axis values

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkdevice.h
*/
opaque type _GdkTimeCoord = CStruct3[_root_.glib.all.guint32, GdkAxisFlags, CArray[Double, Nat.Digit2[Nat._1, Nat._2]]]
object _GdkTimeCoord:
  given _tag: Tag[_GdkTimeCoord] = Tag.materializeCStruct3Tag[_root_.glib.all.guint32, GdkAxisFlags, CArray[Double, Nat.Digit2[Nat._1, Nat._2]]]
  def apply()(using Zone): Ptr[_GdkTimeCoord] = scala.scalanative.unsafe.alloc[_GdkTimeCoord](1)
  def apply(time : _root_.glib.all.guint32, flags : GdkAxisFlags, axes : CArray[Double, Nat.Digit2[Nat._1, Nat._2]])(using Zone): Ptr[_GdkTimeCoord] = 
    val ____ptr = apply()
    (!____ptr).time = time
    (!____ptr).flags = flags
    (!____ptr).axes = axes
    ____ptr
  extension (struct: _GdkTimeCoord)
    def time : _root_.glib.all.guint32 = struct._1
    def time_=(value: _root_.glib.all.guint32): Unit = !struct.at1 = value
    def flags : GdkAxisFlags = struct._2
    def flags_=(value: GdkAxisFlags): Unit = !struct.at2 = value
    def axes : CArray[Double, Nat.Digit2[Nat._1, Nat._2]] = struct._3
    def axes_=(value: CArray[Double, Nat.Digit2[Nat._1, Nat._2]]): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktoplevel.h
*/
opaque type _GdkToplevel = CStruct0
object _GdkToplevel:
  given _tag: Tag[_GdkToplevel] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktoplevel.h
*/
opaque type _GdkToplevelInterface = CStruct0
object _GdkToplevelInterface:
  given _tag: Tag[_GdkToplevelInterface] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktoplevellayout.h
*/
opaque type _GdkToplevelLayout = CStruct0
object _GdkToplevelLayout:
  given _tag: Tag[_GdkToplevelLayout] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktoplevelsize.h
*/
opaque type _GdkToplevelSize = CStruct0
object _GdkToplevelSize:
  given _tag: Tag[_GdkToplevelSize] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type _GdkTouchEvent = CStruct0
object _GdkTouchEvent:
  given _tag: Tag[_GdkTouchEvent] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkevents.h
*/
opaque type _GdkTouchpadEvent = CStruct0
object _GdkTouchpadEvent:
  given _tag: Tag[_GdkTouchpadEvent] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdktypes.h
*/
opaque type _GdkVulkanContext = CStruct0
object _GdkVulkanContext:
  given _tag: Tag[_GdkVulkanContext] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type _GskBlendNode = CStruct0
object _GskBlendNode:
  given _tag: Tag[_GskBlendNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type _GskBlurNode = CStruct0
object _GskBlurNode:
  given _tag: Tag[_GskBlurNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type _GskBorderNode = CStruct0
object _GskBorderNode:
  given _tag: Tag[_GskBorderNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type _GskCairoNode = CStruct0
object _GskCairoNode:
  given _tag: Tag[_GskCairoNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskcairorenderer.h
*/
opaque type _GskCairoRenderer = CStruct0
object _GskCairoRenderer:
  given _tag: Tag[_GskCairoRenderer] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskcairorenderer.h
*/
opaque type _GskCairoRendererClass = CStruct0
object _GskCairoRendererClass:
  given _tag: Tag[_GskCairoRendererClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type _GskClipNode = CStruct0
object _GskClipNode:
  given _tag: Tag[_GskClipNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type _GskColorMatrixNode = CStruct0
object _GskColorMatrixNode:
  given _tag: Tag[_GskColorMatrixNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type _GskColorNode = CStruct0
object _GskColorNode:
  given _tag: Tag[_GskColorNode] = Tag.materializeCStruct0Tag

/**
 * GskColorStop: : the offset of the color stop : the color at the given offset

 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type _GskColorStop = CStruct2[Float, GdkRGBA]
object _GskColorStop:
  given _tag: Tag[_GskColorStop] = Tag.materializeCStruct2Tag[Float, GdkRGBA]
  def apply()(using Zone): Ptr[_GskColorStop] = scala.scalanative.unsafe.alloc[_GskColorStop](1)
  def apply(offset : Float, color : GdkRGBA)(using Zone): Ptr[_GskColorStop] = 
    val ____ptr = apply()
    (!____ptr).offset = offset
    (!____ptr).color = color
    ____ptr
  extension (struct: _GskColorStop)
    def offset : Float = struct._1
    def offset_=(value: Float): Unit = !struct.at1 = value
    def color : GdkRGBA = struct._2
    def color_=(value: GdkRGBA): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type _GskConicGradientNode = CStruct0
object _GskConicGradientNode:
  given _tag: Tag[_GskConicGradientNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type _GskContainerNode = CStruct0
object _GskContainerNode:
  given _tag: Tag[_GskContainerNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type _GskCrossFadeNode = CStruct0
object _GskCrossFadeNode:
  given _tag: Tag[_GskCrossFadeNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type _GskDebugNode = CStruct0
object _GskDebugNode:
  given _tag: Tag[_GskDebugNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskglshader.h
*/
opaque type _GskGLShader = CStruct0
object _GskGLShader:
  given _tag: Tag[_GskGLShader] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type _GskGLShaderNode = CStruct0
object _GskGLShaderNode:
  given _tag: Tag[_GskGLShaderNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type _GskInsetShadowNode = CStruct0
object _GskInsetShadowNode:
  given _tag: Tag[_GskInsetShadowNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type _GskLinearGradientNode = CStruct0
object _GskLinearGradientNode:
  given _tag: Tag[_GskLinearGradientNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type _GskOpacityNode = CStruct0
object _GskOpacityNode:
  given _tag: Tag[_GskOpacityNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type _GskOutsetShadowNode = CStruct0
object _GskOutsetShadowNode:
  given _tag: Tag[_GskOutsetShadowNode] = Tag.materializeCStruct0Tag

/**
 * GskParseLocation: : the offset of the location in the parse buffer, as bytes : the offset of the location in the parse buffer, as characters

 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type _GskParseLocation = CStruct5[_root_.glib.all.gsize, _root_.glib.all.gsize, _root_.glib.all.gsize, _root_.glib.all.gsize, _root_.glib.all.gsize]
object _GskParseLocation:
  given _tag: Tag[_GskParseLocation] = Tag.materializeCStruct5Tag[_root_.glib.all.gsize, _root_.glib.all.gsize, _root_.glib.all.gsize, _root_.glib.all.gsize, _root_.glib.all.gsize]
  def apply()(using Zone): Ptr[_GskParseLocation] = scala.scalanative.unsafe.alloc[_GskParseLocation](1)
  def apply(bytes : _root_.glib.all.gsize, chars : _root_.glib.all.gsize, lines : _root_.glib.all.gsize, line_bytes : _root_.glib.all.gsize, line_chars : _root_.glib.all.gsize)(using Zone): Ptr[_GskParseLocation] = 
    val ____ptr = apply()
    (!____ptr).bytes = bytes
    (!____ptr).chars = chars
    (!____ptr).lines = lines
    (!____ptr).line_bytes = line_bytes
    (!____ptr).line_chars = line_chars
    ____ptr
  extension (struct: _GskParseLocation)
    def bytes : _root_.glib.all.gsize = struct._1
    def bytes_=(value: _root_.glib.all.gsize): Unit = !struct.at1 = value
    def chars : _root_.glib.all.gsize = struct._2
    def chars_=(value: _root_.glib.all.gsize): Unit = !struct.at2 = value
    def lines : _root_.glib.all.gsize = struct._3
    def lines_=(value: _root_.glib.all.gsize): Unit = !struct.at3 = value
    def line_bytes : _root_.glib.all.gsize = struct._4
    def line_bytes_=(value: _root_.glib.all.gsize): Unit = !struct.at4 = value
    def line_chars : _root_.glib.all.gsize = struct._5
    def line_chars_=(value: _root_.glib.all.gsize): Unit = !struct.at5 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type _GskRadialGradientNode = CStruct0
object _GskRadialGradientNode:
  given _tag: Tag[_GskRadialGradientNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type _GskRenderNode = CStruct0
object _GskRenderNode:
  given _tag: Tag[_GskRenderNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gsktypes.h
*/
opaque type _GskRenderer = CStruct0
object _GskRenderer:
  given _tag: Tag[_GskRenderer] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrenderer.h
*/
opaque type _GskRendererClass = CStruct0
object _GskRendererClass:
  given _tag: Tag[_GskRendererClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type _GskRepeatNode = CStruct0
object _GskRepeatNode:
  given _tag: Tag[_GskRepeatNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type _GskRepeatingLinearGradientNode = CStruct0
object _GskRepeatingLinearGradientNode:
  given _tag: Tag[_GskRepeatingLinearGradientNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type _GskRepeatingRadialGradientNode = CStruct0
object _GskRepeatingRadialGradientNode:
  given _tag: Tag[_GskRepeatingRadialGradientNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type _GskRoundedClipNode = CStruct0
object _GskRoundedClipNode:
  given _tag: Tag[_GskRoundedClipNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskroundedrect.h
*/
opaque type _GskRoundedRect = CStruct2[graphene_rect_t, CArray[graphene_size_t, Nat._4]]
object _GskRoundedRect:
  given _tag: Tag[_GskRoundedRect] = Tag.materializeCStruct2Tag[graphene_rect_t, CArray[graphene_size_t, Nat._4]]
  def apply()(using Zone): Ptr[_GskRoundedRect] = scala.scalanative.unsafe.alloc[_GskRoundedRect](1)
  def apply(bounds : graphene_rect_t, corner : CArray[graphene_size_t, Nat._4])(using Zone): Ptr[_GskRoundedRect] = 
    val ____ptr = apply()
    (!____ptr).bounds = bounds
    (!____ptr).corner = corner
    ____ptr
  extension (struct: _GskRoundedRect)
    def bounds : graphene_rect_t = struct._1
    def bounds_=(value: graphene_rect_t): Unit = !struct.at1 = value
    def corner : CArray[graphene_size_t, Nat._4] = struct._2
    def corner_=(value: CArray[graphene_size_t, Nat._4]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskglshader.h
*/
opaque type _GskShaderArgsBuilder = CStruct0
object _GskShaderArgsBuilder:
  given _tag: Tag[_GskShaderArgsBuilder] = Tag.materializeCStruct0Tag

/**
 * GskShadow: : the color of the shadow : the horizontal offset of the shadow : the vertical offset of the shadow : the radius of the shadow

 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type _GskShadow = CStruct4[GdkRGBA, Float, Float, Float]
object _GskShadow:
  given _tag: Tag[_GskShadow] = Tag.materializeCStruct4Tag[GdkRGBA, Float, Float, Float]
  def apply()(using Zone): Ptr[_GskShadow] = scala.scalanative.unsafe.alloc[_GskShadow](1)
  def apply(color : GdkRGBA, dx : Float, dy : Float, radius : Float)(using Zone): Ptr[_GskShadow] = 
    val ____ptr = apply()
    (!____ptr).color = color
    (!____ptr).dx = dx
    (!____ptr).dy = dy
    (!____ptr).radius = radius
    ____ptr
  extension (struct: _GskShadow)
    def color : GdkRGBA = struct._1
    def color_=(value: GdkRGBA): Unit = !struct.at1 = value
    def dx : Float = struct._2
    def dx_=(value: Float): Unit = !struct.at2 = value
    def dy : Float = struct._3
    def dy_=(value: Float): Unit = !struct.at3 = value
    def radius : Float = struct._4
    def radius_=(value: Float): Unit = !struct.at4 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type _GskShadowNode = CStruct0
object _GskShadowNode:
  given _tag: Tag[_GskShadowNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type _GskTextNode = CStruct0
object _GskTextNode:
  given _tag: Tag[_GskTextNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type _GskTextureNode = CStruct0
object _GskTextureNode:
  given _tag: Tag[_GskTextureNode] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gsktypes.h
*/
opaque type _GskTransform = CStruct0
object _GskTransform:
  given _tag: Tag[_GskTransform] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gsk/gskrendernode.h
*/
opaque type _GskTransformNode = CStruct0
object _GskTransformNode:
  given _tag: Tag[_GskTransformNode] = Tag.materializeCStruct0Tag

/**
 * PangoAnalysis: _engine: unused, reserved _engine: unused, reserved : the font for this segment. : the bidirectional level for this segment. : the glyph orientation for this segment (A `PangoGravity`). : boolean flags for this segment (Since: 1.16). : the detected script for this segment (A `PangoScript`) (Since: 1.18). : the detected language for this segment. _attrs: extra attributes for this segment.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-item.h
*/
opaque type _PangoAnalysis = CStruct9[Ptr[PangoEngineShape], Ptr[PangoEngineLang], Ptr[PangoFont], _root_.glib.all.guint8, _root_.glib.all.guint8, _root_.glib.all.guint8, _root_.glib.all.guint8, Ptr[PangoLanguage], Ptr[Byte]]
object _PangoAnalysis:
  given _tag: Tag[_PangoAnalysis] = Tag.materializeCStruct9Tag[Ptr[PangoEngineShape], Ptr[PangoEngineLang], Ptr[PangoFont], _root_.glib.all.guint8, _root_.glib.all.guint8, _root_.glib.all.guint8, _root_.glib.all.guint8, Ptr[PangoLanguage], Ptr[Byte]]
  def apply()(using Zone): Ptr[_PangoAnalysis] = scala.scalanative.unsafe.alloc[_PangoAnalysis](1)
  def apply(shape_engine : Ptr[PangoEngineShape], lang_engine : Ptr[PangoEngineLang], font : Ptr[PangoFont], level : _root_.glib.all.guint8, gravity : _root_.glib.all.guint8, flags : _root_.glib.all.guint8, script : _root_.glib.all.guint8, language : Ptr[PangoLanguage], extra_attrs : Ptr[_root_.glib.all.GSList])(using Zone): Ptr[_PangoAnalysis] = 
    val ____ptr = apply()
    (!____ptr).shape_engine = shape_engine
    (!____ptr).lang_engine = lang_engine
    (!____ptr).font = font
    (!____ptr).level = level
    (!____ptr).gravity = gravity
    (!____ptr).flags = flags
    (!____ptr).script = script
    (!____ptr).language = language
    (!____ptr).extra_attrs = extra_attrs
    ____ptr
  extension (struct: _PangoAnalysis)
    def shape_engine : Ptr[PangoEngineShape] = struct._1
    def shape_engine_=(value: Ptr[PangoEngineShape]): Unit = !struct.at1 = value
    def lang_engine : Ptr[PangoEngineLang] = struct._2
    def lang_engine_=(value: Ptr[PangoEngineLang]): Unit = !struct.at2 = value
    def font : Ptr[PangoFont] = struct._3
    def font_=(value: Ptr[PangoFont]): Unit = !struct.at3 = value
    def level : _root_.glib.all.guint8 = struct._4
    def level_=(value: _root_.glib.all.guint8): Unit = !struct.at4 = value
    def gravity : _root_.glib.all.guint8 = struct._5
    def gravity_=(value: _root_.glib.all.guint8): Unit = !struct.at5 = value
    def flags : _root_.glib.all.guint8 = struct._6
    def flags_=(value: _root_.glib.all.guint8): Unit = !struct.at6 = value
    def script : _root_.glib.all.guint8 = struct._7
    def script_=(value: _root_.glib.all.guint8): Unit = !struct.at7 = value
    def language : Ptr[PangoLanguage] = struct._8
    def language_=(value: Ptr[PangoLanguage]): Unit = !struct.at8 = value
    def extra_attrs : Ptr[_root_.glib.all.GSList] = struct._9.asInstanceOf[Ptr[_root_.glib.all.GSList]]
    def extra_attrs_=(value: Ptr[_root_.glib.all.GSList]): Unit = !struct.at9 = value.asInstanceOf[Ptr[Byte]]

/**
 * PangoAttrClass: : the type ID for this attribute : function to duplicate an attribute of this type (see [method.Attribute.copy]) : function to free an attribute of this type (see [method.Attribute.destroy]) : function to check two attributes of this type for equality (see [method.Attribute.equal])

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type _PangoAttrClass = CStruct4[PangoAttrType, CFuncPtr1[Ptr[Byte], Ptr[Byte]], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr2[Ptr[Byte], Ptr[Byte], _root_.glib.all.gboolean]]
object _PangoAttrClass:
  given _tag: Tag[_PangoAttrClass] = Tag.materializeCStruct4Tag[PangoAttrType, CFuncPtr1[Ptr[Byte], Ptr[Byte]], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr2[Ptr[Byte], Ptr[Byte], _root_.glib.all.gboolean]]
  def apply()(using Zone): Ptr[_PangoAttrClass] = scala.scalanative.unsafe.alloc[_PangoAttrClass](1)
  def apply(`type` : PangoAttrType, copy : CFuncPtr1[Ptr[PangoAttribute], Ptr[PangoAttribute]], destroy : CFuncPtr1[Ptr[PangoAttribute], Unit], equal : CFuncPtr2[Ptr[PangoAttribute], Ptr[PangoAttribute], _root_.glib.all.gboolean])(using Zone): Ptr[_PangoAttrClass] = 
    val ____ptr = apply()
    (!____ptr).`type` = `type`
    (!____ptr).copy = copy
    (!____ptr).destroy = destroy
    (!____ptr).equal = equal
    ____ptr
  extension (struct: _PangoAttrClass)
    def `type` : PangoAttrType = struct._1
    def type_=(value: PangoAttrType): Unit = !struct.at1 = value
    def copy : CFuncPtr1[Ptr[PangoAttribute], Ptr[PangoAttribute]] = struct._2.asInstanceOf[CFuncPtr1[Ptr[PangoAttribute], Ptr[PangoAttribute]]]
    def copy_=(value: CFuncPtr1[Ptr[PangoAttribute], Ptr[PangoAttribute]]): Unit = !struct.at2 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], Ptr[Byte]]]
    def destroy : CFuncPtr1[Ptr[PangoAttribute], Unit] = struct._3.asInstanceOf[CFuncPtr1[Ptr[PangoAttribute], Unit]]
    def destroy_=(value: CFuncPtr1[Ptr[PangoAttribute], Unit]): Unit = !struct.at3 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], Unit]]
    def equal : CFuncPtr2[Ptr[PangoAttribute], Ptr[PangoAttribute], _root_.glib.all.gboolean] = struct._4.asInstanceOf[CFuncPtr2[Ptr[PangoAttribute], Ptr[PangoAttribute], _root_.glib.all.gboolean]]
    def equal_=(value: CFuncPtr2[Ptr[PangoAttribute], Ptr[PangoAttribute], _root_.glib.all.gboolean]): Unit = !struct.at4 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], Ptr[Byte], _root_.glib.all.gboolean]]

/**
 * PangoAttrColor: : the common portion of the attribute : the `PangoColor` which is the value of the attribute

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type _PangoAttrColor = CStruct2[PangoAttribute, PangoColor]
object _PangoAttrColor:
  given _tag: Tag[_PangoAttrColor] = Tag.materializeCStruct2Tag[PangoAttribute, PangoColor]
  def apply()(using Zone): Ptr[_PangoAttrColor] = scala.scalanative.unsafe.alloc[_PangoAttrColor](1)
  def apply(attr : PangoAttribute, color : PangoColor)(using Zone): Ptr[_PangoAttrColor] = 
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).color = color
    ____ptr
  extension (struct: _PangoAttrColor)
    def attr : PangoAttribute = struct._1
    def attr_=(value: PangoAttribute): Unit = !struct.at1 = value
    def color : PangoColor = struct._2
    def color_=(value: PangoColor): Unit = !struct.at2 = value

/**
 * PangoAttrFloat: : the common portion of the attribute : the value of the attribute

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type _PangoAttrFloat = CStruct2[PangoAttribute, Double]
object _PangoAttrFloat:
  given _tag: Tag[_PangoAttrFloat] = Tag.materializeCStruct2Tag[PangoAttribute, Double]
  def apply()(using Zone): Ptr[_PangoAttrFloat] = scala.scalanative.unsafe.alloc[_PangoAttrFloat](1)
  def apply(attr : PangoAttribute, value : Double)(using Zone): Ptr[_PangoAttrFloat] = 
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).value = value
    ____ptr
  extension (struct: _PangoAttrFloat)
    def attr : PangoAttribute = struct._1
    def attr_=(value: PangoAttribute): Unit = !struct.at1 = value
    def value : Double = struct._2
    def value_=(value: Double): Unit = !struct.at2 = value

/**
 * PangoAttrFontDesc: : the common portion of the attribute : the font description which is the value of this attribute

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type _PangoAttrFontDesc = CStruct2[PangoAttribute, Ptr[PangoFontDescription]]
object _PangoAttrFontDesc:
  given _tag: Tag[_PangoAttrFontDesc] = Tag.materializeCStruct2Tag[PangoAttribute, Ptr[PangoFontDescription]]
  def apply()(using Zone): Ptr[_PangoAttrFontDesc] = scala.scalanative.unsafe.alloc[_PangoAttrFontDesc](1)
  def apply(attr : PangoAttribute, desc : Ptr[PangoFontDescription])(using Zone): Ptr[_PangoAttrFontDesc] = 
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).desc = desc
    ____ptr
  extension (struct: _PangoAttrFontDesc)
    def attr : PangoAttribute = struct._1
    def attr_=(value: PangoAttribute): Unit = !struct.at1 = value
    def desc : Ptr[PangoFontDescription] = struct._2
    def desc_=(value: Ptr[PangoFontDescription]): Unit = !struct.at2 = value

/**
 * PangoAttrFontFeatures: : the common portion of the attribute : the features, as a string in CSS syntax

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type _PangoAttrFontFeatures = CStruct2[PangoAttribute, Ptr[_root_.glib.all.gchar]]
object _PangoAttrFontFeatures:
  given _tag: Tag[_PangoAttrFontFeatures] = Tag.materializeCStruct2Tag[PangoAttribute, Ptr[_root_.glib.all.gchar]]
  def apply()(using Zone): Ptr[_PangoAttrFontFeatures] = scala.scalanative.unsafe.alloc[_PangoAttrFontFeatures](1)
  def apply(attr : PangoAttribute, features : Ptr[_root_.glib.all.gchar])(using Zone): Ptr[_PangoAttrFontFeatures] = 
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).features = features
    ____ptr
  extension (struct: _PangoAttrFontFeatures)
    def attr : PangoAttribute = struct._1
    def attr_=(value: PangoAttribute): Unit = !struct.at1 = value
    def features : Ptr[_root_.glib.all.gchar] = struct._2
    def features_=(value: Ptr[_root_.glib.all.gchar]): Unit = !struct.at2 = value

/**
 * PangoAttrInt: : the common portion of the attribute : the value of the attribute

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type _PangoAttrInt = CStruct2[PangoAttribute, CInt]
object _PangoAttrInt:
  given _tag: Tag[_PangoAttrInt] = Tag.materializeCStruct2Tag[PangoAttribute, CInt]
  def apply()(using Zone): Ptr[_PangoAttrInt] = scala.scalanative.unsafe.alloc[_PangoAttrInt](1)
  def apply(attr : PangoAttribute, value : CInt)(using Zone): Ptr[_PangoAttrInt] = 
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).value = value
    ____ptr
  extension (struct: _PangoAttrInt)
    def attr : PangoAttribute = struct._1
    def attr_=(value: PangoAttribute): Unit = !struct.at1 = value
    def value : CInt = struct._2
    def value_=(value: CInt): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type _PangoAttrIterator = CStruct0
object _PangoAttrIterator:
  given _tag: Tag[_PangoAttrIterator] = Tag.materializeCStruct0Tag

/**
 * PangoAttrLanguage: : the common portion of the attribute : the `PangoLanguage` which is the value of the attribute

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type _PangoAttrLanguage = CStruct2[PangoAttribute, Ptr[PangoLanguage]]
object _PangoAttrLanguage:
  given _tag: Tag[_PangoAttrLanguage] = Tag.materializeCStruct2Tag[PangoAttribute, Ptr[PangoLanguage]]
  def apply()(using Zone): Ptr[_PangoAttrLanguage] = scala.scalanative.unsafe.alloc[_PangoAttrLanguage](1)
  def apply(attr : PangoAttribute, value : Ptr[PangoLanguage])(using Zone): Ptr[_PangoAttrLanguage] = 
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).value = value
    ____ptr
  extension (struct: _PangoAttrLanguage)
    def attr : PangoAttribute = struct._1
    def attr_=(value: PangoAttribute): Unit = !struct.at1 = value
    def value : Ptr[PangoLanguage] = struct._2
    def value_=(value: Ptr[PangoLanguage]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type _PangoAttrList = CStruct0
object _PangoAttrList:
  given _tag: Tag[_PangoAttrList] = Tag.materializeCStruct0Tag

/**
 * PangoAttrShape: : the common portion of the attribute

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type _PangoAttrShape = CStruct6[PangoAttribute, PangoRectangle, PangoRectangle, _root_.glib.all.gpointer, PangoAttrDataCopyFunc, _root_.glib.all.GDestroyNotify]
object _PangoAttrShape:
  given _tag: Tag[_PangoAttrShape] = Tag.materializeCStruct6Tag[PangoAttribute, PangoRectangle, PangoRectangle, _root_.glib.all.gpointer, PangoAttrDataCopyFunc, _root_.glib.all.GDestroyNotify]
  def apply()(using Zone): Ptr[_PangoAttrShape] = scala.scalanative.unsafe.alloc[_PangoAttrShape](1)
  def apply(attr : PangoAttribute, ink_rect : PangoRectangle, logical_rect : PangoRectangle, data : _root_.glib.all.gpointer, copy_func : PangoAttrDataCopyFunc, destroy_func : _root_.glib.all.GDestroyNotify)(using Zone): Ptr[_PangoAttrShape] = 
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).ink_rect = ink_rect
    (!____ptr).logical_rect = logical_rect
    (!____ptr).data = data
    (!____ptr).copy_func = copy_func
    (!____ptr).destroy_func = destroy_func
    ____ptr
  extension (struct: _PangoAttrShape)
    def attr : PangoAttribute = struct._1
    def attr_=(value: PangoAttribute): Unit = !struct.at1 = value
    def ink_rect : PangoRectangle = struct._2
    def ink_rect_=(value: PangoRectangle): Unit = !struct.at2 = value
    def logical_rect : PangoRectangle = struct._3
    def logical_rect_=(value: PangoRectangle): Unit = !struct.at3 = value
    def data : _root_.glib.all.gpointer = struct._4
    def data_=(value: _root_.glib.all.gpointer): Unit = !struct.at4 = value
    def copy_func : PangoAttrDataCopyFunc = struct._5
    def copy_func_=(value: PangoAttrDataCopyFunc): Unit = !struct.at5 = value
    def destroy_func : _root_.glib.all.GDestroyNotify = struct._6
    def destroy_func_=(value: _root_.glib.all.GDestroyNotify): Unit = !struct.at6 = value

/**
 * PangoAttrSize: : the common portion of the attribute : size of font, in units of 1/%PANGO_SCALE of a point (for %PANGO_ATTR_SIZE) or of a device unit (for %PANGO_ATTR_ABSOLUTE_SIZE) : whether the font size is in device units or points. This field is only present for compatibility with Pango-1.8.0 (%PANGO_ATTR_ABSOLUTE_SIZE was added in 1.8.1); and always will be %FALSE for %PANGO_ATTR_SIZE and %TRUE for %PANGO_ATTR_ABSOLUTE_SIZE.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type _PangoAttrSize = CStruct3[PangoAttribute, CInt, _root_.glib.all.guint]
object _PangoAttrSize:
  given _tag: Tag[_PangoAttrSize] = Tag.materializeCStruct3Tag[PangoAttribute, CInt, _root_.glib.all.guint]
  def apply()(using Zone): Ptr[_PangoAttrSize] = scala.scalanative.unsafe.alloc[_PangoAttrSize](1)
  def apply(attr : PangoAttribute, size : CInt, absolute : _root_.glib.all.guint)(using Zone): Ptr[_PangoAttrSize] = 
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).size = size
    (!____ptr).absolute = absolute
    ____ptr
  extension (struct: _PangoAttrSize)
    def attr : PangoAttribute = struct._1
    def attr_=(value: PangoAttribute): Unit = !struct.at1 = value
    def size : CInt = struct._2
    def size_=(value: CInt): Unit = !struct.at2 = value
    def absolute : _root_.glib.all.guint = struct._3
    def absolute_=(value: _root_.glib.all.guint): Unit = !struct.at3 = value

/**
 * PangoAttrString: : the common portion of the attribute : the string which is the value of the attribute

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type _PangoAttrString = CStruct2[PangoAttribute, CString]
object _PangoAttrString:
  given _tag: Tag[_PangoAttrString] = Tag.materializeCStruct2Tag[PangoAttribute, CString]
  def apply()(using Zone): Ptr[_PangoAttrString] = scala.scalanative.unsafe.alloc[_PangoAttrString](1)
  def apply(attr : PangoAttribute, value : CString)(using Zone): Ptr[_PangoAttrString] = 
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).value = value
    ____ptr
  extension (struct: _PangoAttrString)
    def attr : PangoAttribute = struct._1
    def attr_=(value: PangoAttribute): Unit = !struct.at1 = value
    def value : CString = struct._2
    def value_=(value: CString): Unit = !struct.at2 = value

/**
 * PangoAttribute: _index: the start index of the range (in bytes). _index: end index of the range (in bytes). The character at this index is not included in the range.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type _PangoAttribute = CStruct3[Ptr[Byte], _root_.glib.all.guint, _root_.glib.all.guint]
object _PangoAttribute:
  given _tag: Tag[_PangoAttribute] = Tag.materializeCStruct3Tag[Ptr[Byte], _root_.glib.all.guint, _root_.glib.all.guint]
  def apply()(using Zone): Ptr[_PangoAttribute] = scala.scalanative.unsafe.alloc[_PangoAttribute](1)
  def apply(klass : Ptr[PangoAttrClass], start_index : _root_.glib.all.guint, end_index : _root_.glib.all.guint)(using Zone): Ptr[_PangoAttribute] = 
    val ____ptr = apply()
    (!____ptr).klass = klass
    (!____ptr).start_index = start_index
    (!____ptr).end_index = end_index
    ____ptr
  extension (struct: _PangoAttribute)
    def klass : Ptr[PangoAttrClass] = struct._1.asInstanceOf[Ptr[PangoAttrClass]]
    def klass_=(value: Ptr[PangoAttrClass]): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
    def start_index : _root_.glib.all.guint = struct._2
    def start_index_=(value: _root_.glib.all.guint): Unit = !struct.at2 = value
    def end_index : _root_.glib.all.guint = struct._3
    def end_index_=(value: _root_.glib.all.guint): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pangocairo.h
*/
opaque type _PangoCairoFont = CStruct0
object _PangoCairoFont:
  given _tag: Tag[_PangoCairoFont] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pangocairo.h
*/
opaque type _PangoCairoFontMap = CStruct0
object _PangoCairoFontMap:
  given _tag: Tag[_PangoCairoFontMap] = Tag.materializeCStruct0Tag

/**
 * PangoColor: : value of red component : value of green component : value of blue component

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-color.h
*/
opaque type _PangoColor = CStruct3[_root_.glib.all.guint16, _root_.glib.all.guint16, _root_.glib.all.guint16]
object _PangoColor:
  given _tag: Tag[_PangoColor] = Tag.materializeCStruct3Tag[_root_.glib.all.guint16, _root_.glib.all.guint16, _root_.glib.all.guint16]
  def apply()(using Zone): Ptr[_PangoColor] = scala.scalanative.unsafe.alloc[_PangoColor](1)
  def apply(red : _root_.glib.all.guint16, green : _root_.glib.all.guint16, blue : _root_.glib.all.guint16)(using Zone): Ptr[_PangoColor] = 
    val ____ptr = apply()
    (!____ptr).red = red
    (!____ptr).green = green
    (!____ptr).blue = blue
    ____ptr
  extension (struct: _PangoColor)
    def red : _root_.glib.all.guint16 = struct._1
    def red_=(value: _root_.glib.all.guint16): Unit = !struct.at1 = value
    def green : _root_.glib.all.guint16 = struct._2
    def green_=(value: _root_.glib.all.guint16): Unit = !struct.at2 = value
    def blue : _root_.glib.all.guint16 = struct._3
    def blue_=(value: _root_.glib.all.guint16): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-types.h
*/
opaque type _PangoContext = CStruct0
object _PangoContext:
  given _tag: Tag[_PangoContext] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-context.h
*/
opaque type _PangoContextClass = CStruct0
object _PangoContextClass:
  given _tag: Tag[_PangoContextClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-coverage.h
*/
opaque type _PangoCoverage = CStruct0
object _PangoCoverage:
  given _tag: Tag[_PangoCoverage] = Tag.materializeCStruct0Tag

/**
 * PangoEngine:

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-engine.h
*/
opaque type _PangoEngine = CStruct1[_root_.gobject.all.GObject]
object _PangoEngine:
  given _tag: Tag[_PangoEngine] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[_PangoEngine] = scala.scalanative.unsafe.alloc[_PangoEngine](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[_PangoEngine] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _PangoEngine)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * PangoEngineClass:

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-engine.h
*/
opaque type _PangoEngineClass = CStruct1[_root_.gobject.all.GObjectClass]
object _PangoEngineClass:
  given _tag: Tag[_PangoEngineClass] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObjectClass]
  def apply()(using Zone): Ptr[_PangoEngineClass] = scala.scalanative.unsafe.alloc[_PangoEngineClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[_PangoEngineClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: _PangoEngineClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value

/**
 * PangoEngineInfo: _type: a string identifying the engine type. _type: a string identifying the render type. : array of scripts this engine supports. _scripts: number of items in .

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-engine.h
*/
opaque type _PangoEngineInfo = CStruct5[Ptr[_root_.glib.all.gchar], Ptr[_root_.glib.all.gchar], Ptr[_root_.glib.all.gchar], Ptr[PangoEngineScriptInfo], _root_.glib.all.gint]
object _PangoEngineInfo:
  given _tag: Tag[_PangoEngineInfo] = Tag.materializeCStruct5Tag[Ptr[_root_.glib.all.gchar], Ptr[_root_.glib.all.gchar], Ptr[_root_.glib.all.gchar], Ptr[PangoEngineScriptInfo], _root_.glib.all.gint]
  def apply()(using Zone): Ptr[_PangoEngineInfo] = scala.scalanative.unsafe.alloc[_PangoEngineInfo](1)
  def apply(id : Ptr[_root_.glib.all.gchar], engine_type : Ptr[_root_.glib.all.gchar], render_type : Ptr[_root_.glib.all.gchar], scripts : Ptr[PangoEngineScriptInfo], n_scripts : _root_.glib.all.gint)(using Zone): Ptr[_PangoEngineInfo] = 
    val ____ptr = apply()
    (!____ptr).id = id
    (!____ptr).engine_type = engine_type
    (!____ptr).render_type = render_type
    (!____ptr).scripts = scripts
    (!____ptr).n_scripts = n_scripts
    ____ptr
  extension (struct: _PangoEngineInfo)
    def id : Ptr[_root_.glib.all.gchar] = struct._1
    def id_=(value: Ptr[_root_.glib.all.gchar]): Unit = !struct.at1 = value
    def engine_type : Ptr[_root_.glib.all.gchar] = struct._2
    def engine_type_=(value: Ptr[_root_.glib.all.gchar]): Unit = !struct.at2 = value
    def render_type : Ptr[_root_.glib.all.gchar] = struct._3
    def render_type_=(value: Ptr[_root_.glib.all.gchar]): Unit = !struct.at3 = value
    def scripts : Ptr[PangoEngineScriptInfo] = struct._4
    def scripts_=(value: Ptr[PangoEngineScriptInfo]): Unit = !struct.at4 = value
    def n_scripts : _root_.glib.all.gint = struct._5
    def n_scripts_=(value: _root_.glib.all.gint): Unit = !struct.at5 = value

/**
 * PangoEngineLang:

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-engine.h
*/
opaque type _PangoEngineLang = CStruct1[PangoEngine]
object _PangoEngineLang:
  given _tag: Tag[_PangoEngineLang] = Tag.materializeCStruct1Tag[PangoEngine]
  def apply()(using Zone): Ptr[_PangoEngineLang] = scala.scalanative.unsafe.alloc[_PangoEngineLang](1)
  def apply(parent_instance : PangoEngine)(using Zone): Ptr[_PangoEngineLang] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _PangoEngineLang)
    def parent_instance : PangoEngine = struct._1
    def parent_instance_=(value: PangoEngine): Unit = !struct.at1 = value

/**
 * PangoEngineLangClass: _break: (nullable): Provides a custom implementation of pango_break(). If %NULL, pango_default_break() is used instead. If not %NULL, for Pango versions before 1.16 (module interface version before 1.6.0), this was called instead of pango_default_break(), but in newer versions, pango_default_break() is always called and this is called after that to allow tailoring the breaking results.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-engine.h
*/
opaque type _PangoEngineLangClass = CStruct2[PangoEngineClass, CFuncPtr6[Ptr[PangoEngineLang], CString, CInt, Ptr[Byte], Ptr[PangoLogAttr], CInt, Unit]]
object _PangoEngineLangClass:
  given _tag: Tag[_PangoEngineLangClass] = Tag.materializeCStruct2Tag[PangoEngineClass, CFuncPtr6[Ptr[PangoEngineLang], CString, CInt, Ptr[Byte], Ptr[PangoLogAttr], CInt, Unit]]
  def apply()(using Zone): Ptr[_PangoEngineLangClass] = scala.scalanative.unsafe.alloc[_PangoEngineLangClass](1)
  def apply(parent_class : PangoEngineClass, script_break : CFuncPtr6[Ptr[PangoEngineLang], CString, CInt, Ptr[PangoAnalysis], Ptr[PangoLogAttr], CInt, Unit])(using Zone): Ptr[_PangoEngineLangClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).script_break = script_break
    ____ptr
  extension (struct: _PangoEngineLangClass)
    def parent_class : PangoEngineClass = struct._1
    def parent_class_=(value: PangoEngineClass): Unit = !struct.at1 = value
    def script_break : CFuncPtr6[Ptr[PangoEngineLang], CString, CInt, Ptr[PangoAnalysis], Ptr[PangoLogAttr], CInt, Unit] = struct._2.asInstanceOf[CFuncPtr6[Ptr[PangoEngineLang], CString, CInt, Ptr[PangoAnalysis], Ptr[PangoLogAttr], CInt, Unit]]
    def script_break_=(value: CFuncPtr6[Ptr[PangoEngineLang], CString, CInt, Ptr[PangoAnalysis], Ptr[PangoLogAttr], CInt, Unit]): Unit = !struct.at2 = value.asInstanceOf[CFuncPtr6[Ptr[PangoEngineLang], CString, CInt, Ptr[Byte], Ptr[PangoLogAttr], CInt, Unit]]

/**
 * PangoEngineScriptInfo: : a `PangoScript`. The value %PANGO_SCRIPT_COMMON has the special meaning here of "all scripts" : a semicolon separated list of languages that this engine handles for this script. This may be empty, in which case the engine is saying that it is a fallback choice for all languages for this range, but should not be used if another engine indicates that it is specific for the language for a given code point. An entry in this list of "*" indicates that this engine is specific to all languages for this range.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-engine.h
*/
opaque type _PangoEngineScriptInfo = CStruct2[PangoScript, Ptr[_root_.glib.all.gchar]]
object _PangoEngineScriptInfo:
  given _tag: Tag[_PangoEngineScriptInfo] = Tag.materializeCStruct2Tag[PangoScript, Ptr[_root_.glib.all.gchar]]
  def apply()(using Zone): Ptr[_PangoEngineScriptInfo] = scala.scalanative.unsafe.alloc[_PangoEngineScriptInfo](1)
  def apply(script : PangoScript, langs : Ptr[_root_.glib.all.gchar])(using Zone): Ptr[_PangoEngineScriptInfo] = 
    val ____ptr = apply()
    (!____ptr).script = script
    (!____ptr).langs = langs
    ____ptr
  extension (struct: _PangoEngineScriptInfo)
    def script : PangoScript = struct._1
    def script_=(value: PangoScript): Unit = !struct.at1 = value
    def langs : Ptr[_root_.glib.all.gchar] = struct._2
    def langs_=(value: Ptr[_root_.glib.all.gchar]): Unit = !struct.at2 = value

/**
 * PangoEngineShape:

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-engine.h
*/
opaque type _PangoEngineShape = CStruct1[PangoEngine]
object _PangoEngineShape:
  given _tag: Tag[_PangoEngineShape] = Tag.materializeCStruct1Tag[PangoEngine]
  def apply()(using Zone): Ptr[_PangoEngineShape] = scala.scalanative.unsafe.alloc[_PangoEngineShape](1)
  def apply(parent_instance : PangoEngine)(using Zone): Ptr[_PangoEngineShape] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _PangoEngineShape)
    def parent_instance : PangoEngine = struct._1
    def parent_instance_=(value: PangoEngine): Unit = !struct.at1 = value

/**
 * PangoEngineShapeClass: _shape: Given a font, a piece of text, and a `PangoAnalysis` structure, converts characters to glyphs and positions the resulting glyphs. The results are stored in the `PangoGlyphString` that is passed in. (The implementation should resize it appropriately using pango_glyph_string_set_size()). All fields of the _clusters and array must be filled in, with the exception that Pango will automatically generate `glyphs->glyphs[i].attr.is_cluster_start` using the _clusters array. Each input character must occur in one of the output logical clusters; if no rendering is desired for a character, this may involve inserting glyphs with the `PangoGlyph` ID %PANGO_GLYPH_EMPTY, which is guaranteed never to render. If the shaping fails for any reason, the shaper should return with an empty (zero-size) glyph string. If the shaper has not set the size on the glyph string yet, simply returning signals the failure too. : Returns the characters that this engine can cover with a given font for a given language. If not overridden, the default implementation simply returns the coverage information for the font itself unmodified.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-engine.h
*/
opaque type _PangoEngineShapeClass = CStruct3[PangoEngineClass, CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], CString, CUnsignedInt, Ptr[Byte], Ptr[PangoGlyphString], CString, CUnsignedInt, Unit], CFuncPtr4[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[PangoLanguage], _root_.glib.all.gunichar, PangoCoverageLevel]]
object _PangoEngineShapeClass:
  given _tag: Tag[_PangoEngineShapeClass] = Tag.materializeCStruct3Tag[PangoEngineClass, CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], CString, CUnsignedInt, Ptr[Byte], Ptr[PangoGlyphString], CString, CUnsignedInt, Unit], CFuncPtr4[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[PangoLanguage], _root_.glib.all.gunichar, PangoCoverageLevel]]
  def apply()(using Zone): Ptr[_PangoEngineShapeClass] = scala.scalanative.unsafe.alloc[_PangoEngineShapeClass](1)
  def apply(parent_class : PangoEngineClass, script_shape : CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], CString, CUnsignedInt, Ptr[PangoAnalysis], Ptr[PangoGlyphString], CString, CUnsignedInt, Unit], covers : CFuncPtr4[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[PangoLanguage], _root_.glib.all.gunichar, PangoCoverageLevel])(using Zone): Ptr[_PangoEngineShapeClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).script_shape = script_shape
    (!____ptr).covers = covers
    ____ptr
  extension (struct: _PangoEngineShapeClass)
    def parent_class : PangoEngineClass = struct._1
    def parent_class_=(value: PangoEngineClass): Unit = !struct.at1 = value
    def script_shape : CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], CString, CUnsignedInt, Ptr[PangoAnalysis], Ptr[PangoGlyphString], CString, CUnsignedInt, Unit] = struct._2.asInstanceOf[CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], CString, CUnsignedInt, Ptr[PangoAnalysis], Ptr[PangoGlyphString], CString, CUnsignedInt, Unit]]
    def script_shape_=(value: CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], CString, CUnsignedInt, Ptr[PangoAnalysis], Ptr[PangoGlyphString], CString, CUnsignedInt, Unit]): Unit = !struct.at2 = value.asInstanceOf[CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], CString, CUnsignedInt, Ptr[Byte], Ptr[PangoGlyphString], CString, CUnsignedInt, Unit]]
    def covers : CFuncPtr4[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[PangoLanguage], _root_.glib.all.gunichar, PangoCoverageLevel] = struct._3
    def covers_=(value: CFuncPtr4[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[PangoLanguage], _root_.glib.all.gunichar, PangoCoverageLevel]): Unit = !struct.at3 = value

/**
 * PangoFont:

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
*/
opaque type _PangoFont = CStruct1[_root_.gobject.all.GObject]
object _PangoFont:
  given _tag: Tag[_PangoFont] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[_PangoFont] = scala.scalanative.unsafe.alloc[_PangoFont](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[_PangoFont] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _PangoFont)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
*/
opaque type _PangoFontClass = CStruct9[_root_.gobject.all.GObjectClass, CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]], CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoCoverage]], CFuncPtr4[Ptr[PangoFont], PangoGlyph, Ptr[PangoRectangle], Ptr[PangoRectangle], Unit], CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoFontMetrics]], CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontMap]], CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]], CFuncPtr4[Ptr[PangoFont], Ptr[_root_.libharfbuzz.all.hb_feature_t], _root_.glib.all.guint, Ptr[_root_.glib.all.guint], Unit], CFuncPtr1[Ptr[PangoFont], Ptr[_root_.libharfbuzz.all.hb_font_t]]]
object _PangoFontClass:
  given _tag: Tag[_PangoFontClass] = Tag.materializeCStruct9Tag[_root_.gobject.all.GObjectClass, CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]], CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoCoverage]], CFuncPtr4[Ptr[PangoFont], PangoGlyph, Ptr[PangoRectangle], Ptr[PangoRectangle], Unit], CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoFontMetrics]], CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontMap]], CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]], CFuncPtr4[Ptr[PangoFont], Ptr[_root_.libharfbuzz.all.hb_feature_t], _root_.glib.all.guint, Ptr[_root_.glib.all.guint], Unit], CFuncPtr1[Ptr[PangoFont], Ptr[_root_.libharfbuzz.all.hb_font_t]]]
  def apply()(using Zone): Ptr[_PangoFontClass] = scala.scalanative.unsafe.alloc[_PangoFontClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, describe : CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]], get_coverage : CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoCoverage]], get_glyph_extents : CFuncPtr4[Ptr[PangoFont], PangoGlyph, Ptr[PangoRectangle], Ptr[PangoRectangle], Unit], get_metrics : CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoFontMetrics]], get_font_map : CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontMap]], describe_absolute : CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]], get_features : CFuncPtr4[Ptr[PangoFont], Ptr[_root_.libharfbuzz.all.hb_feature_t], _root_.glib.all.guint, Ptr[_root_.glib.all.guint], Unit], create_hb_font : CFuncPtr1[Ptr[PangoFont], Ptr[_root_.libharfbuzz.all.hb_font_t]])(using Zone): Ptr[_PangoFontClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).describe = describe
    (!____ptr).get_coverage = get_coverage
    (!____ptr).get_glyph_extents = get_glyph_extents
    (!____ptr).get_metrics = get_metrics
    (!____ptr).get_font_map = get_font_map
    (!____ptr).describe_absolute = describe_absolute
    (!____ptr).get_features = get_features
    (!____ptr).create_hb_font = create_hb_font
    ____ptr
  extension (struct: _PangoFontClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def describe : CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]] = struct._2
    def describe_=(value: CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]]): Unit = !struct.at2 = value
    def get_coverage : CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoCoverage]] = struct._3
    def get_coverage_=(value: CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoCoverage]]): Unit = !struct.at3 = value
    def get_glyph_extents : CFuncPtr4[Ptr[PangoFont], PangoGlyph, Ptr[PangoRectangle], Ptr[PangoRectangle], Unit] = struct._4
    def get_glyph_extents_=(value: CFuncPtr4[Ptr[PangoFont], PangoGlyph, Ptr[PangoRectangle], Ptr[PangoRectangle], Unit]): Unit = !struct.at4 = value
    def get_metrics : CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoFontMetrics]] = struct._5
    def get_metrics_=(value: CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoFontMetrics]]): Unit = !struct.at5 = value
    def get_font_map : CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontMap]] = struct._6
    def get_font_map_=(value: CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontMap]]): Unit = !struct.at6 = value
    def describe_absolute : CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]] = struct._7
    def describe_absolute_=(value: CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]]): Unit = !struct.at7 = value
    def get_features : CFuncPtr4[Ptr[PangoFont], Ptr[_root_.libharfbuzz.all.hb_feature_t], _root_.glib.all.guint, Ptr[_root_.glib.all.guint], Unit] = struct._8
    def get_features_=(value: CFuncPtr4[Ptr[PangoFont], Ptr[_root_.libharfbuzz.all.hb_feature_t], _root_.glib.all.guint, Ptr[_root_.glib.all.guint], Unit]): Unit = !struct.at8 = value
    def create_hb_font : CFuncPtr1[Ptr[PangoFont], Ptr[_root_.libharfbuzz.all.hb_font_t]] = struct._9
    def create_hb_font_=(value: CFuncPtr1[Ptr[PangoFont], Ptr[_root_.libharfbuzz.all.hb_font_t]]): Unit = !struct.at9 = value

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
*/
opaque type _PangoFontDescription = CStruct0
object _PangoFontDescription:
  given _tag: Tag[_PangoFontDescription] = Tag.materializeCStruct0Tag

/**
 * PangoFontFace:

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
*/
opaque type _PangoFontFace = CStruct1[_root_.gobject.all.GObject]
object _PangoFontFace:
  given _tag: Tag[_PangoFontFace] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[_PangoFontFace] = scala.scalanative.unsafe.alloc[_PangoFontFace](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[_PangoFontFace] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _PangoFontFace)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
*/
opaque type _PangoFontFaceClass = CStruct8[_root_.gobject.all.GObjectClass, CFuncPtr1[Ptr[PangoFontFace], CString], CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontDescription]], CFuncPtr3[Ptr[PangoFontFace], Ptr[Ptr[CInt]], Ptr[CInt], Unit], CFuncPtr1[Ptr[PangoFontFace], _root_.glib.all.gboolean], CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontFamily]], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object _PangoFontFaceClass:
  given _tag: Tag[_PangoFontFaceClass] = Tag.materializeCStruct8Tag[_root_.gobject.all.GObjectClass, CFuncPtr1[Ptr[PangoFontFace], CString], CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontDescription]], CFuncPtr3[Ptr[PangoFontFace], Ptr[Ptr[CInt]], Ptr[CInt], Unit], CFuncPtr1[Ptr[PangoFontFace], _root_.glib.all.gboolean], CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontFamily]], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[_PangoFontFaceClass] = scala.scalanative.unsafe.alloc[_PangoFontFaceClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, get_face_name : CFuncPtr1[Ptr[PangoFontFace], CString], describe : CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontDescription]], list_sizes : CFuncPtr3[Ptr[PangoFontFace], Ptr[Ptr[CInt]], Ptr[CInt], Unit], is_synthesized : CFuncPtr1[Ptr[PangoFontFace], _root_.glib.all.gboolean], get_family : CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontFamily]], _pango_reserved3 : CFuncPtr0[Unit], _pango_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[_PangoFontFaceClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).get_face_name = get_face_name
    (!____ptr).describe = describe
    (!____ptr).list_sizes = list_sizes
    (!____ptr).is_synthesized = is_synthesized
    (!____ptr).get_family = get_family
    (!____ptr)._pango_reserved3 = _pango_reserved3
    (!____ptr)._pango_reserved4 = _pango_reserved4
    ____ptr
  extension (struct: _PangoFontFaceClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def get_face_name : CFuncPtr1[Ptr[PangoFontFace], CString] = struct._2
    def get_face_name_=(value: CFuncPtr1[Ptr[PangoFontFace], CString]): Unit = !struct.at2 = value
    def describe : CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontDescription]] = struct._3
    def describe_=(value: CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontDescription]]): Unit = !struct.at3 = value
    def list_sizes : CFuncPtr3[Ptr[PangoFontFace], Ptr[Ptr[CInt]], Ptr[CInt], Unit] = struct._4
    def list_sizes_=(value: CFuncPtr3[Ptr[PangoFontFace], Ptr[Ptr[CInt]], Ptr[CInt], Unit]): Unit = !struct.at4 = value
    def is_synthesized : CFuncPtr1[Ptr[PangoFontFace], _root_.glib.all.gboolean] = struct._5
    def is_synthesized_=(value: CFuncPtr1[Ptr[PangoFontFace], _root_.glib.all.gboolean]): Unit = !struct.at5 = value
    def get_family : CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontFamily]] = struct._6
    def get_family_=(value: CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontFamily]]): Unit = !struct.at6 = value
    def _pango_reserved3 : CFuncPtr0[Unit] = struct._7
    def _pango_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at7 = value
    def _pango_reserved4 : CFuncPtr0[Unit] = struct._8
    def _pango_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at8 = value

/**
 * PangoFontFamily:

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
*/
opaque type _PangoFontFamily = CStruct1[_root_.gobject.all.GObject]
object _PangoFontFamily:
  given _tag: Tag[_PangoFontFamily] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[_PangoFontFamily] = scala.scalanative.unsafe.alloc[_PangoFontFamily](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[_PangoFontFamily] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _PangoFontFamily)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
*/
opaque type _PangoFontFamilyClass = CStruct7[_root_.gobject.all.GObjectClass, CFuncPtr3[Ptr[PangoFontFamily], Ptr[Ptr[Ptr[PangoFontFace]]], Ptr[CInt], Unit], CFuncPtr1[Ptr[PangoFontFamily], CString], CFuncPtr1[Ptr[PangoFontFamily], _root_.glib.all.gboolean], CFuncPtr1[Ptr[PangoFontFamily], _root_.glib.all.gboolean], CFuncPtr2[Ptr[PangoFontFamily], CString, Ptr[PangoFontFace]], CFuncPtr0[Unit]]
object _PangoFontFamilyClass:
  given _tag: Tag[_PangoFontFamilyClass] = Tag.materializeCStruct7Tag[_root_.gobject.all.GObjectClass, CFuncPtr3[Ptr[PangoFontFamily], Ptr[Ptr[Ptr[PangoFontFace]]], Ptr[CInt], Unit], CFuncPtr1[Ptr[PangoFontFamily], CString], CFuncPtr1[Ptr[PangoFontFamily], _root_.glib.all.gboolean], CFuncPtr1[Ptr[PangoFontFamily], _root_.glib.all.gboolean], CFuncPtr2[Ptr[PangoFontFamily], CString, Ptr[PangoFontFace]], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[_PangoFontFamilyClass] = scala.scalanative.unsafe.alloc[_PangoFontFamilyClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, list_faces : CFuncPtr3[Ptr[PangoFontFamily], Ptr[Ptr[Ptr[PangoFontFace]]], Ptr[CInt], Unit], get_name : CFuncPtr1[Ptr[PangoFontFamily], CString], is_monospace : CFuncPtr1[Ptr[PangoFontFamily], _root_.glib.all.gboolean], is_variable : CFuncPtr1[Ptr[PangoFontFamily], _root_.glib.all.gboolean], get_face : CFuncPtr2[Ptr[PangoFontFamily], CString, Ptr[PangoFontFace]], _pango_reserved2 : CFuncPtr0[Unit])(using Zone): Ptr[_PangoFontFamilyClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).list_faces = list_faces
    (!____ptr).get_name = get_name
    (!____ptr).is_monospace = is_monospace
    (!____ptr).is_variable = is_variable
    (!____ptr).get_face = get_face
    (!____ptr)._pango_reserved2 = _pango_reserved2
    ____ptr
  extension (struct: _PangoFontFamilyClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def list_faces : CFuncPtr3[Ptr[PangoFontFamily], Ptr[Ptr[Ptr[PangoFontFace]]], Ptr[CInt], Unit] = struct._2
    def list_faces_=(value: CFuncPtr3[Ptr[PangoFontFamily], Ptr[Ptr[Ptr[PangoFontFace]]], Ptr[CInt], Unit]): Unit = !struct.at2 = value
    def get_name : CFuncPtr1[Ptr[PangoFontFamily], CString] = struct._3
    def get_name_=(value: CFuncPtr1[Ptr[PangoFontFamily], CString]): Unit = !struct.at3 = value
    def is_monospace : CFuncPtr1[Ptr[PangoFontFamily], _root_.glib.all.gboolean] = struct._4
    def is_monospace_=(value: CFuncPtr1[Ptr[PangoFontFamily], _root_.glib.all.gboolean]): Unit = !struct.at4 = value
    def is_variable : CFuncPtr1[Ptr[PangoFontFamily], _root_.glib.all.gboolean] = struct._5
    def is_variable_=(value: CFuncPtr1[Ptr[PangoFontFamily], _root_.glib.all.gboolean]): Unit = !struct.at5 = value
    def get_face : CFuncPtr2[Ptr[PangoFontFamily], CString, Ptr[PangoFontFace]] = struct._6
    def get_face_=(value: CFuncPtr2[Ptr[PangoFontFamily], CString, Ptr[PangoFontFace]]): Unit = !struct.at6 = value
    def _pango_reserved2 : CFuncPtr0[Unit] = struct._7
    def _pango_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at7 = value

/**
 * PangoFontMap:

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontmap.h
*/
opaque type _PangoFontMap = CStruct1[_root_.gobject.all.GObject]
object _PangoFontMap:
  given _tag: Tag[_PangoFontMap] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[_PangoFontMap] = scala.scalanative.unsafe.alloc[_PangoFontMap](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[_PangoFontMap] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _PangoFontMap)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * PangoFontMapClass: _class: parent `GObjectClass` _font: a function to load a font with a given description. See pango_font_map_load_font(). _families: A function to list available font families. See pango_font_map_list_families(). _fontset: a function to load a fontset with a given given description suitable for a particular language. See pango_font_map_load_fontset(). _engine_type: the type of rendering-system-dependent engines that can handle fonts of this fonts loaded with this fontmap. _serial: a function to get the serial number of the fontmap. See pango_font_map_get_serial(). : See pango_font_map_changed()

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontmap.h
*/
opaque type _PangoFontMapClass = CStruct9[_root_.gobject.all.GObjectClass, CFuncPtr3[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoFont]], CFuncPtr3[Ptr[PangoFontMap], Ptr[Ptr[Ptr[PangoFontFamily]]], Ptr[CInt], Unit], CFuncPtr4[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoLanguage], Ptr[PangoFontset]], CString, CFuncPtr1[Ptr[PangoFontMap], _root_.glib.all.guint], CFuncPtr1[Ptr[PangoFontMap], Unit], CFuncPtr2[Ptr[PangoFontMap], CString, Ptr[PangoFontFamily]], CFuncPtr2[Ptr[PangoFontMap], Ptr[PangoFont], Ptr[PangoFontFace]]]
object _PangoFontMapClass:
  given _tag: Tag[_PangoFontMapClass] = Tag.materializeCStruct9Tag[_root_.gobject.all.GObjectClass, CFuncPtr3[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoFont]], CFuncPtr3[Ptr[PangoFontMap], Ptr[Ptr[Ptr[PangoFontFamily]]], Ptr[CInt], Unit], CFuncPtr4[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoLanguage], Ptr[PangoFontset]], CString, CFuncPtr1[Ptr[PangoFontMap], _root_.glib.all.guint], CFuncPtr1[Ptr[PangoFontMap], Unit], CFuncPtr2[Ptr[PangoFontMap], CString, Ptr[PangoFontFamily]], CFuncPtr2[Ptr[PangoFontMap], Ptr[PangoFont], Ptr[PangoFontFace]]]
  def apply()(using Zone): Ptr[_PangoFontMapClass] = scala.scalanative.unsafe.alloc[_PangoFontMapClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, load_font : CFuncPtr3[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoFont]], list_families : CFuncPtr3[Ptr[PangoFontMap], Ptr[Ptr[Ptr[PangoFontFamily]]], Ptr[CInt], Unit], load_fontset : CFuncPtr4[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoLanguage], Ptr[PangoFontset]], shape_engine_type : CString, get_serial : CFuncPtr1[Ptr[PangoFontMap], _root_.glib.all.guint], changed : CFuncPtr1[Ptr[PangoFontMap], Unit], get_family : CFuncPtr2[Ptr[PangoFontMap], CString, Ptr[PangoFontFamily]], get_face : CFuncPtr2[Ptr[PangoFontMap], Ptr[PangoFont], Ptr[PangoFontFace]])(using Zone): Ptr[_PangoFontMapClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).load_font = load_font
    (!____ptr).list_families = list_families
    (!____ptr).load_fontset = load_fontset
    (!____ptr).shape_engine_type = shape_engine_type
    (!____ptr).get_serial = get_serial
    (!____ptr).changed = changed
    (!____ptr).get_family = get_family
    (!____ptr).get_face = get_face
    ____ptr
  extension (struct: _PangoFontMapClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def load_font : CFuncPtr3[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoFont]] = struct._2
    def load_font_=(value: CFuncPtr3[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoFont]]): Unit = !struct.at2 = value
    def list_families : CFuncPtr3[Ptr[PangoFontMap], Ptr[Ptr[Ptr[PangoFontFamily]]], Ptr[CInt], Unit] = struct._3
    def list_families_=(value: CFuncPtr3[Ptr[PangoFontMap], Ptr[Ptr[Ptr[PangoFontFamily]]], Ptr[CInt], Unit]): Unit = !struct.at3 = value
    def load_fontset : CFuncPtr4[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoLanguage], Ptr[PangoFontset]] = struct._4
    def load_fontset_=(value: CFuncPtr4[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoLanguage], Ptr[PangoFontset]]): Unit = !struct.at4 = value
    def shape_engine_type : CString = struct._5
    def shape_engine_type_=(value: CString): Unit = !struct.at5 = value
    def get_serial : CFuncPtr1[Ptr[PangoFontMap], _root_.glib.all.guint] = struct._6
    def get_serial_=(value: CFuncPtr1[Ptr[PangoFontMap], _root_.glib.all.guint]): Unit = !struct.at6 = value
    def changed : CFuncPtr1[Ptr[PangoFontMap], Unit] = struct._7
    def changed_=(value: CFuncPtr1[Ptr[PangoFontMap], Unit]): Unit = !struct.at7 = value
    def get_family : CFuncPtr2[Ptr[PangoFontMap], CString, Ptr[PangoFontFamily]] = struct._8
    def get_family_=(value: CFuncPtr2[Ptr[PangoFontMap], CString, Ptr[PangoFontFamily]]): Unit = !struct.at8 = value
    def get_face : CFuncPtr2[Ptr[PangoFontMap], Ptr[PangoFont], Ptr[PangoFontFace]] = struct._9
    def get_face_=(value: CFuncPtr2[Ptr[PangoFontMap], Ptr[PangoFont], Ptr[PangoFontFace]]): Unit = !struct.at9 = value

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
*/
opaque type _PangoFontMetrics = CStruct10[_root_.glib.all.guint, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt]
object _PangoFontMetrics:
  given _tag: Tag[_PangoFontMetrics] = Tag.materializeCStruct10Tag[_root_.glib.all.guint, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt]
  def apply()(using Zone): Ptr[_PangoFontMetrics] = scala.scalanative.unsafe.alloc[_PangoFontMetrics](1)
  def apply(ref_count : _root_.glib.all.guint, ascent : CInt, descent : CInt, height : CInt, approximate_char_width : CInt, approximate_digit_width : CInt, underline_position : CInt, underline_thickness : CInt, strikethrough_position : CInt, strikethrough_thickness : CInt)(using Zone): Ptr[_PangoFontMetrics] = 
    val ____ptr = apply()
    (!____ptr).ref_count = ref_count
    (!____ptr).ascent = ascent
    (!____ptr).descent = descent
    (!____ptr).height = height
    (!____ptr).approximate_char_width = approximate_char_width
    (!____ptr).approximate_digit_width = approximate_digit_width
    (!____ptr).underline_position = underline_position
    (!____ptr).underline_thickness = underline_thickness
    (!____ptr).strikethrough_position = strikethrough_position
    (!____ptr).strikethrough_thickness = strikethrough_thickness
    ____ptr
  extension (struct: _PangoFontMetrics)
    def ref_count : _root_.glib.all.guint = struct._1
    def ref_count_=(value: _root_.glib.all.guint): Unit = !struct.at1 = value
    def ascent : CInt = struct._2
    def ascent_=(value: CInt): Unit = !struct.at2 = value
    def descent : CInt = struct._3
    def descent_=(value: CInt): Unit = !struct.at3 = value
    def height : CInt = struct._4
    def height_=(value: CInt): Unit = !struct.at4 = value
    def approximate_char_width : CInt = struct._5
    def approximate_char_width_=(value: CInt): Unit = !struct.at5 = value
    def approximate_digit_width : CInt = struct._6
    def approximate_digit_width_=(value: CInt): Unit = !struct.at6 = value
    def underline_position : CInt = struct._7
    def underline_position_=(value: CInt): Unit = !struct.at7 = value
    def underline_thickness : CInt = struct._8
    def underline_thickness_=(value: CInt): Unit = !struct.at8 = value
    def strikethrough_position : CInt = struct._9
    def strikethrough_position_=(value: CInt): Unit = !struct.at9 = value
    def strikethrough_thickness : CInt = struct._10
    def strikethrough_thickness_=(value: CInt): Unit = !struct.at10 = value

/**
 * PangoFontset:

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontset.h
*/
opaque type _PangoFontset = CStruct1[_root_.gobject.all.GObject]
object _PangoFontset:
  given _tag: Tag[_PangoFontset] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[_PangoFontset] = scala.scalanative.unsafe.alloc[_PangoFontset](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[_PangoFontset] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _PangoFontset)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * PangoFontsetClass: _class: parent `GObjectClass` _font: a function to get the font in the fontset that contains the best glyph for the given Unicode character; see [method.Fontset.get_font] _metrics: a function to get overall metric information for the fonts in the fontset; see [method.Fontset.get_metrics] _language: a function to get the language of the fontset. : a function to loop over the fonts in the fontset. See [method.Fontset.foreach]

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontset.h
*/
opaque type _PangoFontsetClass = CStruct9[_root_.gobject.all.GObjectClass, CFuncPtr2[Ptr[PangoFontset], _root_.glib.all.guint, Ptr[PangoFont]], CFuncPtr1[Ptr[PangoFontset], Ptr[PangoFontMetrics]], CFuncPtr1[Ptr[PangoFontset], Ptr[PangoLanguage]], CFuncPtr3[Ptr[PangoFontset], PangoFontsetForeachFunc, _root_.glib.all.gpointer, Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object _PangoFontsetClass:
  given _tag: Tag[_PangoFontsetClass] = Tag.materializeCStruct9Tag[_root_.gobject.all.GObjectClass, CFuncPtr2[Ptr[PangoFontset], _root_.glib.all.guint, Ptr[PangoFont]], CFuncPtr1[Ptr[PangoFontset], Ptr[PangoFontMetrics]], CFuncPtr1[Ptr[PangoFontset], Ptr[PangoLanguage]], CFuncPtr3[Ptr[PangoFontset], PangoFontsetForeachFunc, _root_.glib.all.gpointer, Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[_PangoFontsetClass] = scala.scalanative.unsafe.alloc[_PangoFontsetClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, get_font : CFuncPtr2[Ptr[PangoFontset], _root_.glib.all.guint, Ptr[PangoFont]], get_metrics : CFuncPtr1[Ptr[PangoFontset], Ptr[PangoFontMetrics]], get_language : CFuncPtr1[Ptr[PangoFontset], Ptr[PangoLanguage]], foreach : CFuncPtr3[Ptr[PangoFontset], PangoFontsetForeachFunc, _root_.glib.all.gpointer, Unit], _pango_reserved1 : CFuncPtr0[Unit], _pango_reserved2 : CFuncPtr0[Unit], _pango_reserved3 : CFuncPtr0[Unit], _pango_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[_PangoFontsetClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).get_font = get_font
    (!____ptr).get_metrics = get_metrics
    (!____ptr).get_language = get_language
    (!____ptr).foreach = foreach
    (!____ptr)._pango_reserved1 = _pango_reserved1
    (!____ptr)._pango_reserved2 = _pango_reserved2
    (!____ptr)._pango_reserved3 = _pango_reserved3
    (!____ptr)._pango_reserved4 = _pango_reserved4
    ____ptr
  extension (struct: _PangoFontsetClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def get_font : CFuncPtr2[Ptr[PangoFontset], _root_.glib.all.guint, Ptr[PangoFont]] = struct._2
    def get_font_=(value: CFuncPtr2[Ptr[PangoFontset], _root_.glib.all.guint, Ptr[PangoFont]]): Unit = !struct.at2 = value
    def get_metrics : CFuncPtr1[Ptr[PangoFontset], Ptr[PangoFontMetrics]] = struct._3
    def get_metrics_=(value: CFuncPtr1[Ptr[PangoFontset], Ptr[PangoFontMetrics]]): Unit = !struct.at3 = value
    def get_language : CFuncPtr1[Ptr[PangoFontset], Ptr[PangoLanguage]] = struct._4
    def get_language_=(value: CFuncPtr1[Ptr[PangoFontset], Ptr[PangoLanguage]]): Unit = !struct.at4 = value
    def foreach : CFuncPtr3[Ptr[PangoFontset], PangoFontsetForeachFunc, _root_.glib.all.gpointer, Unit] = struct._5
    def foreach_=(value: CFuncPtr3[Ptr[PangoFontset], PangoFontsetForeachFunc, _root_.glib.all.gpointer, Unit]): Unit = !struct.at5 = value
    def _pango_reserved1 : CFuncPtr0[Unit] = struct._6
    def _pango_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at6 = value
    def _pango_reserved2 : CFuncPtr0[Unit] = struct._7
    def _pango_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at7 = value
    def _pango_reserved3 : CFuncPtr0[Unit] = struct._8
    def _pango_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at8 = value
    def _pango_reserved4 : CFuncPtr0[Unit] = struct._9
    def _pango_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at9 = value

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontset-simple.h
*/
opaque type _PangoFontsetSimple = CStruct0
object _PangoFontsetSimple:
  given _tag: Tag[_PangoFontsetSimple] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-fontset-simple.h
*/
opaque type _PangoFontsetSimpleClass = CStruct0
object _PangoFontsetSimpleClass:
  given _tag: Tag[_PangoFontsetSimpleClass] = Tag.materializeCStruct0Tag

/**
 * PangoGlyphGeometry: : the logical width to use for the the character. _offset: horizontal offset from nominal character position. _offset: vertical offset from nominal character position.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph.h
*/
opaque type _PangoGlyphGeometry = CStruct3[PangoGlyphUnit, PangoGlyphUnit, PangoGlyphUnit]
object _PangoGlyphGeometry:
  given _tag: Tag[_PangoGlyphGeometry] = Tag.materializeCStruct3Tag[PangoGlyphUnit, PangoGlyphUnit, PangoGlyphUnit]
  def apply()(using Zone): Ptr[_PangoGlyphGeometry] = scala.scalanative.unsafe.alloc[_PangoGlyphGeometry](1)
  def apply(width : PangoGlyphUnit, x_offset : PangoGlyphUnit, y_offset : PangoGlyphUnit)(using Zone): Ptr[_PangoGlyphGeometry] = 
    val ____ptr = apply()
    (!____ptr).width = width
    (!____ptr).x_offset = x_offset
    (!____ptr).y_offset = y_offset
    ____ptr
  extension (struct: _PangoGlyphGeometry)
    def width : PangoGlyphUnit = struct._1
    def width_=(value: PangoGlyphUnit): Unit = !struct.at1 = value
    def x_offset : PangoGlyphUnit = struct._2
    def x_offset_=(value: PangoGlyphUnit): Unit = !struct.at2 = value
    def y_offset : PangoGlyphUnit = struct._3
    def y_offset_=(value: PangoGlyphUnit): Unit = !struct.at3 = value

/**
 * PangoGlyphInfo: : the glyph itself. : the positional information about the glyph. : the visual attributes of the glyph.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph.h
*/
opaque type _PangoGlyphInfo = CStruct3[PangoGlyph, PangoGlyphGeometry, PangoGlyphVisAttr]
object _PangoGlyphInfo:
  given _tag: Tag[_PangoGlyphInfo] = Tag.materializeCStruct3Tag[PangoGlyph, PangoGlyphGeometry, PangoGlyphVisAttr]
  def apply()(using Zone): Ptr[_PangoGlyphInfo] = scala.scalanative.unsafe.alloc[_PangoGlyphInfo](1)
  def apply(glyph : PangoGlyph, geometry : PangoGlyphGeometry, attr : PangoGlyphVisAttr)(using Zone): Ptr[_PangoGlyphInfo] = 
    val ____ptr = apply()
    (!____ptr).glyph = glyph
    (!____ptr).geometry = geometry
    (!____ptr).attr = attr
    ____ptr
  extension (struct: _PangoGlyphInfo)
    def glyph : PangoGlyph = struct._1
    def glyph_=(value: PangoGlyph): Unit = !struct.at1 = value
    def geometry : PangoGlyphGeometry = struct._2
    def geometry_=(value: PangoGlyphGeometry): Unit = !struct.at2 = value
    def attr : PangoGlyphVisAttr = struct._3
    def attr_=(value: PangoGlyphVisAttr): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph-item.h
*/
opaque type _PangoGlyphItem = CStruct5[Ptr[Byte], Ptr[PangoGlyphString], CInt, CInt, CInt]
object _PangoGlyphItem:
  given _tag: Tag[_PangoGlyphItem] = Tag.materializeCStruct5Tag[Ptr[Byte], Ptr[PangoGlyphString], CInt, CInt, CInt]
  def apply()(using Zone): Ptr[_PangoGlyphItem] = scala.scalanative.unsafe.alloc[_PangoGlyphItem](1)
  def apply(item : Ptr[PangoItem], glyphs : Ptr[PangoGlyphString], y_offset : CInt, start_x_offset : CInt, end_x_offset : CInt)(using Zone): Ptr[_PangoGlyphItem] = 
    val ____ptr = apply()
    (!____ptr).item = item
    (!____ptr).glyphs = glyphs
    (!____ptr).y_offset = y_offset
    (!____ptr).start_x_offset = start_x_offset
    (!____ptr).end_x_offset = end_x_offset
    ____ptr
  extension (struct: _PangoGlyphItem)
    def item : Ptr[PangoItem] = struct._1.asInstanceOf[Ptr[PangoItem]]
    def item_=(value: Ptr[PangoItem]): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
    def glyphs : Ptr[PangoGlyphString] = struct._2
    def glyphs_=(value: Ptr[PangoGlyphString]): Unit = !struct.at2 = value
    def y_offset : CInt = struct._3
    def y_offset_=(value: CInt): Unit = !struct.at3 = value
    def start_x_offset : CInt = struct._4
    def start_x_offset_=(value: CInt): Unit = !struct.at4 = value
    def end_x_offset : CInt = struct._5
    def end_x_offset_=(value: CInt): Unit = !struct.at5 = value

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph-item.h
*/
opaque type _PangoGlyphItemIter = CStruct8[Ptr[Byte], Ptr[_root_.glib.all.gchar], CInt, CInt, CInt, CInt, CInt, CInt]
object _PangoGlyphItemIter:
  given _tag: Tag[_PangoGlyphItemIter] = Tag.materializeCStruct8Tag[Ptr[Byte], Ptr[_root_.glib.all.gchar], CInt, CInt, CInt, CInt, CInt, CInt]
  def apply()(using Zone): Ptr[_PangoGlyphItemIter] = scala.scalanative.unsafe.alloc[_PangoGlyphItemIter](1)
  def apply(glyph_item : Ptr[PangoGlyphItem], text : Ptr[_root_.glib.all.gchar], start_glyph : CInt, start_index : CInt, start_char : CInt, end_glyph : CInt, end_index : CInt, end_char : CInt)(using Zone): Ptr[_PangoGlyphItemIter] = 
    val ____ptr = apply()
    (!____ptr).glyph_item = glyph_item
    (!____ptr).text = text
    (!____ptr).start_glyph = start_glyph
    (!____ptr).start_index = start_index
    (!____ptr).start_char = start_char
    (!____ptr).end_glyph = end_glyph
    (!____ptr).end_index = end_index
    (!____ptr).end_char = end_char
    ____ptr
  extension (struct: _PangoGlyphItemIter)
    def glyph_item : Ptr[PangoGlyphItem] = struct._1.asInstanceOf[Ptr[PangoGlyphItem]]
    def glyph_item_=(value: Ptr[PangoGlyphItem]): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
    def text : Ptr[_root_.glib.all.gchar] = struct._2
    def text_=(value: Ptr[_root_.glib.all.gchar]): Unit = !struct.at2 = value
    def start_glyph : CInt = struct._3
    def start_glyph_=(value: CInt): Unit = !struct.at3 = value
    def start_index : CInt = struct._4
    def start_index_=(value: CInt): Unit = !struct.at4 = value
    def start_char : CInt = struct._5
    def start_char_=(value: CInt): Unit = !struct.at5 = value
    def end_glyph : CInt = struct._6
    def end_glyph_=(value: CInt): Unit = !struct.at6 = value
    def end_index : CInt = struct._7
    def end_index_=(value: CInt): Unit = !struct.at7 = value
    def end_char : CInt = struct._8
    def end_char_=(value: CInt): Unit = !struct.at8 = value

/**
 * PangoGlyphString: : (array length=num_glyphs): array of glyph information _clusters: logical cluster info, indexed by the byte index within the text corresponding to the glyph string

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph.h
*/
opaque type _PangoGlyphString = CStruct4[CInt, Ptr[PangoGlyphInfo], Ptr[CInt], CInt]
object _PangoGlyphString:
  given _tag: Tag[_PangoGlyphString] = Tag.materializeCStruct4Tag[CInt, Ptr[PangoGlyphInfo], Ptr[CInt], CInt]
  def apply()(using Zone): Ptr[_PangoGlyphString] = scala.scalanative.unsafe.alloc[_PangoGlyphString](1)
  def apply(num_glyphs : CInt, glyphs : Ptr[PangoGlyphInfo], log_clusters : Ptr[CInt], space : CInt)(using Zone): Ptr[_PangoGlyphString] = 
    val ____ptr = apply()
    (!____ptr).num_glyphs = num_glyphs
    (!____ptr).glyphs = glyphs
    (!____ptr).log_clusters = log_clusters
    (!____ptr).space = space
    ____ptr
  extension (struct: _PangoGlyphString)
    def num_glyphs : CInt = struct._1
    def num_glyphs_=(value: CInt): Unit = !struct.at1 = value
    def glyphs : Ptr[PangoGlyphInfo] = struct._2
    def glyphs_=(value: Ptr[PangoGlyphInfo]): Unit = !struct.at2 = value
    def log_clusters : Ptr[CInt] = struct._3
    def log_clusters_=(value: Ptr[CInt]): Unit = !struct.at3 = value
    def space : CInt = struct._4
    def space_=(value: CInt): Unit = !struct.at4 = value

/**
 * PangoGlyphVisAttr:

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph.h
*/
opaque type _PangoGlyphVisAttr = CStruct2[_root_.glib.all.guint, _root_.glib.all.guint]
object _PangoGlyphVisAttr:
  given _tag: Tag[_PangoGlyphVisAttr] = Tag.materializeCStruct2Tag[_root_.glib.all.guint, _root_.glib.all.guint]
  def apply()(using Zone): Ptr[_PangoGlyphVisAttr] = scala.scalanative.unsafe.alloc[_PangoGlyphVisAttr](1)
  def apply(is_cluster_start : _root_.glib.all.guint, is_color : _root_.glib.all.guint)(using Zone): Ptr[_PangoGlyphVisAttr] = 
    val ____ptr = apply()
    (!____ptr).is_cluster_start = is_cluster_start
    (!____ptr).is_color = is_color
    ____ptr
  extension (struct: _PangoGlyphVisAttr)
    def is_cluster_start : _root_.glib.all.guint = struct._1
    def is_cluster_start_=(value: _root_.glib.all.guint): Unit = !struct.at1 = value
    def is_color : _root_.glib.all.guint = struct._2
    def is_color_=(value: _root_.glib.all.guint): Unit = !struct.at2 = value

/**
 * PangoItem: : byte offset of the start of this item in text. : length of this item in bytes. _offset: character offset of the start of this item in text. Since 1.50 : analysis results for the item.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-item.h
*/
opaque type _PangoItem = CStruct4[CInt, CInt, CInt, PangoAnalysis]
object _PangoItem:
  given _tag: Tag[_PangoItem] = Tag.materializeCStruct4Tag[CInt, CInt, CInt, PangoAnalysis]
  def apply()(using Zone): Ptr[_PangoItem] = scala.scalanative.unsafe.alloc[_PangoItem](1)
  def apply(offset : CInt, length : CInt, num_chars : CInt, analysis : PangoAnalysis)(using Zone): Ptr[_PangoItem] = 
    val ____ptr = apply()
    (!____ptr).offset = offset
    (!____ptr).length = length
    (!____ptr).num_chars = num_chars
    (!____ptr).analysis = analysis
    ____ptr
  extension (struct: _PangoItem)
    def offset : CInt = struct._1
    def offset_=(value: CInt): Unit = !struct.at1 = value
    def length : CInt = struct._2
    def length_=(value: CInt): Unit = !struct.at2 = value
    def num_chars : CInt = struct._3
    def num_chars_=(value: CInt): Unit = !struct.at3 = value
    def analysis : PangoAnalysis = struct._4
    def analysis_=(value: PangoAnalysis): Unit = !struct.at4 = value

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-types.h
*/
opaque type _PangoLanguage = CStruct0
object _PangoLanguage:
  given _tag: Tag[_PangoLanguage] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
*/
opaque type _PangoLayout = CStruct0
object _PangoLayout:
  given _tag: Tag[_PangoLayout] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
*/
opaque type _PangoLayoutClass = CStruct0
object _PangoLayoutClass:
  given _tag: Tag[_PangoLayoutClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
*/
opaque type _PangoLayoutIter = CStruct0
object _PangoLayoutIter:
  given _tag: Tag[_PangoLayoutIter] = Tag.materializeCStruct0Tag

/**
 * PangoLayoutLine: : (nullable): the layout this line belongs to, might be %NULL _index: start of line as byte index into layout->text : length of line in bytes : (nullable) (element-type Pango.LayoutRun): list of runs in the line, from left to right _dir: #Resolved PangoDirection of line

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
*/
opaque type _PangoLayoutLine = CStruct6[Ptr[PangoLayout], _root_.glib.all.gint, _root_.glib.all.gint, Ptr[Byte], _root_.glib.all.guint, _root_.glib.all.guint]
object _PangoLayoutLine:
  given _tag: Tag[_PangoLayoutLine] = Tag.materializeCStruct6Tag[Ptr[PangoLayout], _root_.glib.all.gint, _root_.glib.all.gint, Ptr[Byte], _root_.glib.all.guint, _root_.glib.all.guint]
  def apply()(using Zone): Ptr[_PangoLayoutLine] = scala.scalanative.unsafe.alloc[_PangoLayoutLine](1)
  def apply(layout : Ptr[PangoLayout], start_index : _root_.glib.all.gint, length : _root_.glib.all.gint, runs : Ptr[_root_.glib.all.GSList], is_paragraph_start : _root_.glib.all.guint, resolved_dir : _root_.glib.all.guint)(using Zone): Ptr[_PangoLayoutLine] = 
    val ____ptr = apply()
    (!____ptr).layout = layout
    (!____ptr).start_index = start_index
    (!____ptr).length = length
    (!____ptr).runs = runs
    (!____ptr).is_paragraph_start = is_paragraph_start
    (!____ptr).resolved_dir = resolved_dir
    ____ptr
  extension (struct: _PangoLayoutLine)
    def layout : Ptr[PangoLayout] = struct._1
    def layout_=(value: Ptr[PangoLayout]): Unit = !struct.at1 = value
    def start_index : _root_.glib.all.gint = struct._2
    def start_index_=(value: _root_.glib.all.gint): Unit = !struct.at2 = value
    def length : _root_.glib.all.gint = struct._3
    def length_=(value: _root_.glib.all.gint): Unit = !struct.at3 = value
    def runs : Ptr[_root_.glib.all.GSList] = struct._4.asInstanceOf[Ptr[_root_.glib.all.GSList]]
    def runs_=(value: Ptr[_root_.glib.all.GSList]): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
    def is_paragraph_start : _root_.glib.all.guint = struct._5
    def is_paragraph_start_=(value: _root_.glib.all.guint): Unit = !struct.at5 = value
    def resolved_dir : _root_.glib.all.guint = struct._6
    def resolved_dir_=(value: _root_.glib.all.guint): Unit = !struct.at6 = value

/**
 * PangoLogAttr: i.e. this is a grapheme boundary, or the first character in the text. This flag implements Unicode's [Grapheme Cluster Boundaries](http://www.unicode.org/reports/tr29/) semantics. Note that in degenerate cases, you could have both and There are two ways to divide sentences. The first assigns all inter-sentence whitespace/control/format chars to some sentence, so all chars are in some sentence; the boundaries there. The second way doesn't assign between-sentence spaces, etc. to any sentence, so Note that in degenerate cases, you could have both and period, so the next sentence starts right away) _deletes_character: if set, backspace deletes one character rather than the entire grapheme cluster. This field is only meaningful on grapheme boundaries (where the full grapheme (e.g. letter + diacritics) is considered a unit, while in others, each decomposed character in the grapheme is a unit. In the default implementation of [func], this bit is set on all grapheme boundaries except those following Latin, Cyrillic or Greek base characters. expanded for justification purposes. (Since: 1.18) More specifically, means that this is not a position in the middle of a word. For example, both sides of a punctuation mark are considered word boundaries. This flag is particularly useful when selecting text word-by-word. This flag implements Unicode's [Word Boundaries](http://www.unicode.org/reports/tr29/) semantics. (Since: 1.22) _inserts_hyphen: when breaking lines before this char, insert a hyphen. Since: 1.50 _removes_preceding: when breaking lines before this char, remove the preceding char. Since 1.50

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-break.h
*/
opaque type _PangoLogAttr = CStruct16[_root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint]
object _PangoLogAttr:
  given _tag: Tag[_PangoLogAttr] = Tag.materializeCStruct16Tag[_root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint]
  def apply()(using Zone): Ptr[_PangoLogAttr] = scala.scalanative.unsafe.alloc[_PangoLogAttr](1)
  def apply(is_line_break : _root_.glib.all.guint, is_mandatory_break : _root_.glib.all.guint, is_char_break : _root_.glib.all.guint, is_white : _root_.glib.all.guint, is_cursor_position : _root_.glib.all.guint, is_word_start : _root_.glib.all.guint, is_word_end : _root_.glib.all.guint, is_sentence_boundary : _root_.glib.all.guint, is_sentence_start : _root_.glib.all.guint, is_sentence_end : _root_.glib.all.guint, backspace_deletes_character : _root_.glib.all.guint, is_expandable_space : _root_.glib.all.guint, is_word_boundary : _root_.glib.all.guint, break_inserts_hyphen : _root_.glib.all.guint, break_removes_preceding : _root_.glib.all.guint, reserved : _root_.glib.all.guint)(using Zone): Ptr[_PangoLogAttr] = 
    val ____ptr = apply()
    (!____ptr).is_line_break = is_line_break
    (!____ptr).is_mandatory_break = is_mandatory_break
    (!____ptr).is_char_break = is_char_break
    (!____ptr).is_white = is_white
    (!____ptr).is_cursor_position = is_cursor_position
    (!____ptr).is_word_start = is_word_start
    (!____ptr).is_word_end = is_word_end
    (!____ptr).is_sentence_boundary = is_sentence_boundary
    (!____ptr).is_sentence_start = is_sentence_start
    (!____ptr).is_sentence_end = is_sentence_end
    (!____ptr).backspace_deletes_character = backspace_deletes_character
    (!____ptr).is_expandable_space = is_expandable_space
    (!____ptr).is_word_boundary = is_word_boundary
    (!____ptr).break_inserts_hyphen = break_inserts_hyphen
    (!____ptr).break_removes_preceding = break_removes_preceding
    (!____ptr).reserved = reserved
    ____ptr
  extension (struct: _PangoLogAttr)
    def is_line_break : _root_.glib.all.guint = struct._1
    def is_line_break_=(value: _root_.glib.all.guint): Unit = !struct.at1 = value
    def is_mandatory_break : _root_.glib.all.guint = struct._2
    def is_mandatory_break_=(value: _root_.glib.all.guint): Unit = !struct.at2 = value
    def is_char_break : _root_.glib.all.guint = struct._3
    def is_char_break_=(value: _root_.glib.all.guint): Unit = !struct.at3 = value
    def is_white : _root_.glib.all.guint = struct._4
    def is_white_=(value: _root_.glib.all.guint): Unit = !struct.at4 = value
    def is_cursor_position : _root_.glib.all.guint = struct._5
    def is_cursor_position_=(value: _root_.glib.all.guint): Unit = !struct.at5 = value
    def is_word_start : _root_.glib.all.guint = struct._6
    def is_word_start_=(value: _root_.glib.all.guint): Unit = !struct.at6 = value
    def is_word_end : _root_.glib.all.guint = struct._7
    def is_word_end_=(value: _root_.glib.all.guint): Unit = !struct.at7 = value
    def is_sentence_boundary : _root_.glib.all.guint = struct._8
    def is_sentence_boundary_=(value: _root_.glib.all.guint): Unit = !struct.at8 = value
    def is_sentence_start : _root_.glib.all.guint = struct._9
    def is_sentence_start_=(value: _root_.glib.all.guint): Unit = !struct.at9 = value
    def is_sentence_end : _root_.glib.all.guint = struct._10
    def is_sentence_end_=(value: _root_.glib.all.guint): Unit = !struct.at10 = value
    def backspace_deletes_character : _root_.glib.all.guint = struct._11
    def backspace_deletes_character_=(value: _root_.glib.all.guint): Unit = !struct.at11 = value
    def is_expandable_space : _root_.glib.all.guint = struct._12
    def is_expandable_space_=(value: _root_.glib.all.guint): Unit = !struct.at12 = value
    def is_word_boundary : _root_.glib.all.guint = struct._13
    def is_word_boundary_=(value: _root_.glib.all.guint): Unit = !struct.at13 = value
    def break_inserts_hyphen : _root_.glib.all.guint = struct._14
    def break_inserts_hyphen_=(value: _root_.glib.all.guint): Unit = !struct.at14 = value
    def break_removes_preceding : _root_.glib.all.guint = struct._15
    def break_removes_preceding_=(value: _root_.glib.all.guint): Unit = !struct.at15 = value
    def reserved : _root_.glib.all.guint = struct._16
    def reserved_=(value: _root_.glib.all.guint): Unit = !struct.at16 = value

/**
 * PangoMatrix: : 1st component of the transformation matrix : 2nd component of the transformation matrix : 3rd component of the transformation matrix : 4th component of the transformation matrix : x translation : y translation

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-matrix.h
*/
opaque type _PangoMatrix = CStruct6[Double, Double, Double, Double, Double, Double]
object _PangoMatrix:
  given _tag: Tag[_PangoMatrix] = Tag.materializeCStruct6Tag[Double, Double, Double, Double, Double, Double]
  def apply()(using Zone): Ptr[_PangoMatrix] = scala.scalanative.unsafe.alloc[_PangoMatrix](1)
  def apply(xx : Double, xy : Double, yx : Double, yy : Double, x0 : Double, y0 : Double)(using Zone): Ptr[_PangoMatrix] = 
    val ____ptr = apply()
    (!____ptr).xx = xx
    (!____ptr).xy = xy
    (!____ptr).yx = yx
    (!____ptr).yy = yy
    (!____ptr).x0 = x0
    (!____ptr).y0 = y0
    ____ptr
  extension (struct: _PangoMatrix)
    def xx : Double = struct._1
    def xx_=(value: Double): Unit = !struct.at1 = value
    def xy : Double = struct._2
    def xy_=(value: Double): Unit = !struct.at2 = value
    def yx : Double = struct._3
    def yx_=(value: Double): Unit = !struct.at3 = value
    def yy : Double = struct._4
    def yy_=(value: Double): Unit = !struct.at4 = value
    def x0 : Double = struct._5
    def x0_=(value: Double): Unit = !struct.at5 = value
    def y0 : Double = struct._6
    def y0_=(value: Double): Unit = !struct.at6 = value

/**
 * PangoRectangle: : X coordinate of the left side of the rectangle. : Y coordinate of the the top side of the rectangle. : width of the rectangle. : height of the rectangle.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-types.h
*/
opaque type _PangoRectangle = CStruct4[CInt, CInt, CInt, CInt]
object _PangoRectangle:
  given _tag: Tag[_PangoRectangle] = Tag.materializeCStruct4Tag[CInt, CInt, CInt, CInt]
  def apply()(using Zone): Ptr[_PangoRectangle] = scala.scalanative.unsafe.alloc[_PangoRectangle](1)
  def apply(x : CInt, y : CInt, width : CInt, height : CInt)(using Zone): Ptr[_PangoRectangle] = 
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).width = width
    (!____ptr).height = height
    ____ptr
  extension (struct: _PangoRectangle)
    def x : CInt = struct._1
    def x_=(value: CInt): Unit = !struct.at1 = value
    def y : CInt = struct._2
    def y_=(value: CInt): Unit = !struct.at2 = value
    def width : CInt = struct._3
    def width_=(value: CInt): Unit = !struct.at3 = value
    def height : CInt = struct._4
    def height_=(value: CInt): Unit = !struct.at4 = value

/**
 * PangoRenderer: : (nullable): the current transformation matrix for the Renderer; may be %NULL, which should be treated the same as the identity matrix.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-renderer.h
*/
opaque type _PangoRenderer = CStruct6[_root_.gobject.all.GObject, PangoUnderline, _root_.glib.all.gboolean, CInt, Ptr[PangoMatrix], Ptr[PangoRendererPrivate]]
object _PangoRenderer:
  given _tag: Tag[_PangoRenderer] = Tag.materializeCStruct6Tag[_root_.gobject.all.GObject, PangoUnderline, _root_.glib.all.gboolean, CInt, Ptr[PangoMatrix], Ptr[PangoRendererPrivate]]
  def apply()(using Zone): Ptr[_PangoRenderer] = scala.scalanative.unsafe.alloc[_PangoRenderer](1)
  def apply(parent_instance : _root_.gobject.all.GObject, underline : PangoUnderline, strikethrough : _root_.glib.all.gboolean, active_count : CInt, matrix : Ptr[PangoMatrix], priv : Ptr[PangoRendererPrivate])(using Zone): Ptr[_PangoRenderer] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).underline = underline
    (!____ptr).strikethrough = strikethrough
    (!____ptr).active_count = active_count
    (!____ptr).matrix = matrix
    (!____ptr).priv = priv
    ____ptr
  extension (struct: _PangoRenderer)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value
    def underline : PangoUnderline = struct._2
    def underline_=(value: PangoUnderline): Unit = !struct.at2 = value
    def strikethrough : _root_.glib.all.gboolean = struct._3
    def strikethrough_=(value: _root_.glib.all.gboolean): Unit = !struct.at3 = value
    def active_count : CInt = struct._4
    def active_count_=(value: CInt): Unit = !struct.at4 = value
    def matrix : Ptr[PangoMatrix] = struct._5
    def matrix_=(value: Ptr[PangoMatrix]): Unit = !struct.at5 = value
    def priv : Ptr[PangoRendererPrivate] = struct._6
    def priv_=(value: Ptr[PangoRendererPrivate]): Unit = !struct.at6 = value

/**
 * PangoRendererClass: _glyphs: draws a `PangoGlyphString` _rectangle: draws a rectangle _error_underline: draws a squiggly line that approximately covers the given rectangle in the style of an underline used to indicate a spelling error. _shape: draw content for a glyph shaped with `PangoAttrShape` , are the coordinates of the left edge of the baseline, in user coordinates. _trapezoid: draws a trapezoidal filled area _glyph: draws a single glyph

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-renderer.h
*/
opaque type _PangoRendererClass = CStruct15[_root_.gobject.all.GObjectClass, CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], Ptr[PangoGlyphString], CInt, CInt, Unit], CFuncPtr6[Ptr[PangoRenderer], PangoRenderPart, CInt, CInt, CInt, CInt, Unit], CFuncPtr5[Ptr[PangoRenderer], CInt, CInt, CInt, CInt, Unit], CFuncPtr4[Ptr[PangoRenderer], Ptr[Byte], CInt, CInt, Unit], CFuncPtr8[Ptr[PangoRenderer], PangoRenderPart, Double, Double, Double, Double, Double, Double, Unit], CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], PangoGlyph, Double, Double, Unit], CFuncPtr2[Ptr[PangoRenderer], PangoRenderPart, Unit], CFuncPtr1[Ptr[PangoRenderer], Unit], CFuncPtr1[Ptr[PangoRenderer], Unit], CFuncPtr2[Ptr[PangoRenderer], Ptr[Byte], Unit], CFuncPtr5[Ptr[PangoRenderer], CString, Ptr[Byte], CInt, CInt, Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object _PangoRendererClass:
  given _tag: Tag[_PangoRendererClass] = Tag.materializeCStruct15Tag[_root_.gobject.all.GObjectClass, CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], Ptr[PangoGlyphString], CInt, CInt, Unit], CFuncPtr6[Ptr[PangoRenderer], PangoRenderPart, CInt, CInt, CInt, CInt, Unit], CFuncPtr5[Ptr[PangoRenderer], CInt, CInt, CInt, CInt, Unit], CFuncPtr4[Ptr[PangoRenderer], Ptr[Byte], CInt, CInt, Unit], CFuncPtr8[Ptr[PangoRenderer], PangoRenderPart, Double, Double, Double, Double, Double, Double, Unit], CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], PangoGlyph, Double, Double, Unit], CFuncPtr2[Ptr[PangoRenderer], PangoRenderPart, Unit], CFuncPtr1[Ptr[PangoRenderer], Unit], CFuncPtr1[Ptr[PangoRenderer], Unit], CFuncPtr2[Ptr[PangoRenderer], Ptr[Byte], Unit], CFuncPtr5[Ptr[PangoRenderer], CString, Ptr[Byte], CInt, CInt, Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[_PangoRendererClass] = scala.scalanative.unsafe.alloc[_PangoRendererClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, draw_glyphs : CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], Ptr[PangoGlyphString], CInt, CInt, Unit], draw_rectangle : CFuncPtr6[Ptr[PangoRenderer], PangoRenderPart, CInt, CInt, CInt, CInt, Unit], draw_error_underline : CFuncPtr5[Ptr[PangoRenderer], CInt, CInt, CInt, CInt, Unit], draw_shape : CFuncPtr4[Ptr[PangoRenderer], Ptr[PangoAttrShape], CInt, CInt, Unit], draw_trapezoid : CFuncPtr8[Ptr[PangoRenderer], PangoRenderPart, Double, Double, Double, Double, Double, Double, Unit], draw_glyph : CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], PangoGlyph, Double, Double, Unit], part_changed : CFuncPtr2[Ptr[PangoRenderer], PangoRenderPart, Unit], begin : CFuncPtr1[Ptr[PangoRenderer], Unit], end : CFuncPtr1[Ptr[PangoRenderer], Unit], prepare_run : CFuncPtr2[Ptr[PangoRenderer], Ptr[PangoLayoutRun], Unit], draw_glyph_item : CFuncPtr5[Ptr[PangoRenderer], CString, Ptr[PangoGlyphItem], CInt, CInt, Unit], _pango_reserved2 : CFuncPtr0[Unit], _pango_reserved3 : CFuncPtr0[Unit], _pango_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[_PangoRendererClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).draw_glyphs = draw_glyphs
    (!____ptr).draw_rectangle = draw_rectangle
    (!____ptr).draw_error_underline = draw_error_underline
    (!____ptr).draw_shape = draw_shape
    (!____ptr).draw_trapezoid = draw_trapezoid
    (!____ptr).draw_glyph = draw_glyph
    (!____ptr).part_changed = part_changed
    (!____ptr).begin = begin
    (!____ptr).end = end
    (!____ptr).prepare_run = prepare_run
    (!____ptr).draw_glyph_item = draw_glyph_item
    (!____ptr)._pango_reserved2 = _pango_reserved2
    (!____ptr)._pango_reserved3 = _pango_reserved3
    (!____ptr)._pango_reserved4 = _pango_reserved4
    ____ptr
  extension (struct: _PangoRendererClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def draw_glyphs : CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], Ptr[PangoGlyphString], CInt, CInt, Unit] = struct._2
    def draw_glyphs_=(value: CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], Ptr[PangoGlyphString], CInt, CInt, Unit]): Unit = !struct.at2 = value
    def draw_rectangle : CFuncPtr6[Ptr[PangoRenderer], PangoRenderPart, CInt, CInt, CInt, CInt, Unit] = struct._3
    def draw_rectangle_=(value: CFuncPtr6[Ptr[PangoRenderer], PangoRenderPart, CInt, CInt, CInt, CInt, Unit]): Unit = !struct.at3 = value
    def draw_error_underline : CFuncPtr5[Ptr[PangoRenderer], CInt, CInt, CInt, CInt, Unit] = struct._4
    def draw_error_underline_=(value: CFuncPtr5[Ptr[PangoRenderer], CInt, CInt, CInt, CInt, Unit]): Unit = !struct.at4 = value
    def draw_shape : CFuncPtr4[Ptr[PangoRenderer], Ptr[PangoAttrShape], CInt, CInt, Unit] = struct._5.asInstanceOf[CFuncPtr4[Ptr[PangoRenderer], Ptr[PangoAttrShape], CInt, CInt, Unit]]
    def draw_shape_=(value: CFuncPtr4[Ptr[PangoRenderer], Ptr[PangoAttrShape], CInt, CInt, Unit]): Unit = !struct.at5 = value.asInstanceOf[CFuncPtr4[Ptr[PangoRenderer], Ptr[Byte], CInt, CInt, Unit]]
    def draw_trapezoid : CFuncPtr8[Ptr[PangoRenderer], PangoRenderPart, Double, Double, Double, Double, Double, Double, Unit] = struct._6
    def draw_trapezoid_=(value: CFuncPtr8[Ptr[PangoRenderer], PangoRenderPart, Double, Double, Double, Double, Double, Double, Unit]): Unit = !struct.at6 = value
    def draw_glyph : CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], PangoGlyph, Double, Double, Unit] = struct._7
    def draw_glyph_=(value: CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], PangoGlyph, Double, Double, Unit]): Unit = !struct.at7 = value
    def part_changed : CFuncPtr2[Ptr[PangoRenderer], PangoRenderPart, Unit] = struct._8
    def part_changed_=(value: CFuncPtr2[Ptr[PangoRenderer], PangoRenderPart, Unit]): Unit = !struct.at8 = value
    def begin : CFuncPtr1[Ptr[PangoRenderer], Unit] = struct._9
    def begin_=(value: CFuncPtr1[Ptr[PangoRenderer], Unit]): Unit = !struct.at9 = value
    def end : CFuncPtr1[Ptr[PangoRenderer], Unit] = struct._10
    def end_=(value: CFuncPtr1[Ptr[PangoRenderer], Unit]): Unit = !struct.at10 = value
    def prepare_run : CFuncPtr2[Ptr[PangoRenderer], Ptr[PangoLayoutRun], Unit] = struct._11.asInstanceOf[CFuncPtr2[Ptr[PangoRenderer], Ptr[PangoLayoutRun], Unit]]
    def prepare_run_=(value: CFuncPtr2[Ptr[PangoRenderer], Ptr[PangoLayoutRun], Unit]): Unit = !struct.at11 = value.asInstanceOf[CFuncPtr2[Ptr[PangoRenderer], Ptr[Byte], Unit]]
    def draw_glyph_item : CFuncPtr5[Ptr[PangoRenderer], CString, Ptr[PangoGlyphItem], CInt, CInt, Unit] = struct._12.asInstanceOf[CFuncPtr5[Ptr[PangoRenderer], CString, Ptr[PangoGlyphItem], CInt, CInt, Unit]]
    def draw_glyph_item_=(value: CFuncPtr5[Ptr[PangoRenderer], CString, Ptr[PangoGlyphItem], CInt, CInt, Unit]): Unit = !struct.at12 = value.asInstanceOf[CFuncPtr5[Ptr[PangoRenderer], CString, Ptr[Byte], CInt, CInt, Unit]]
    def _pango_reserved2 : CFuncPtr0[Unit] = struct._13
    def _pango_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at13 = value
    def _pango_reserved3 : CFuncPtr0[Unit] = struct._14
    def _pango_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at14 = value
    def _pango_reserved4 : CFuncPtr0[Unit] = struct._15
    def _pango_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at15 = value

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-renderer.h
*/
opaque type _PangoRendererPrivate = CStruct0
object _PangoRendererPrivate:
  given _tag: Tag[_PangoRendererPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-script.h
*/
opaque type _PangoScriptIter = CStruct0
object _PangoScriptIter:
  given _tag: Tag[_PangoScriptIter] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-tabs.h
*/
opaque type _PangoTabArray = CStruct0
object _PangoTabArray:
  given _tag: Tag[_PangoTabArray] = Tag.materializeCStruct0Tag

/**
 * graphene_box_t:

 * [bindgen] header: /usr/include/graphene-1.0/graphene-box.h
*/
opaque type _graphene_box_t = CStruct2[graphene_vec3_t, graphene_vec3_t]
object _graphene_box_t:
  given _tag: Tag[_graphene_box_t] = Tag.materializeCStruct2Tag[graphene_vec3_t, graphene_vec3_t]
  def apply()(using Zone): Ptr[_graphene_box_t] = scala.scalanative.unsafe.alloc[_graphene_box_t](1)
  def apply(__graphene_private_min : graphene_vec3_t, __graphene_private_max : graphene_vec3_t)(using Zone): Ptr[_graphene_box_t] = 
    val ____ptr = apply()
    (!____ptr).__graphene_private_min = __graphene_private_min
    (!____ptr).__graphene_private_max = __graphene_private_max
    ____ptr
  extension (struct: _graphene_box_t)
    def __graphene_private_min : graphene_vec3_t = struct._1
    def __graphene_private_min_=(value: graphene_vec3_t): Unit = !struct.at1 = value
    def __graphene_private_max : graphene_vec3_t = struct._2
    def __graphene_private_max_=(value: graphene_vec3_t): Unit = !struct.at2 = value

/**
 * graphene_euler_t:

 * [bindgen] header: /usr/include/graphene-1.0/graphene-euler.h
*/
opaque type _graphene_euler_t = CStruct2[graphene_vec3_t, graphene_euler_order_t]
object _graphene_euler_t:
  given _tag: Tag[_graphene_euler_t] = Tag.materializeCStruct2Tag[graphene_vec3_t, graphene_euler_order_t]
  def apply()(using Zone): Ptr[_graphene_euler_t] = scala.scalanative.unsafe.alloc[_graphene_euler_t](1)
  def apply(__graphene_private_angles : graphene_vec3_t, __graphene_private_order : graphene_euler_order_t)(using Zone): Ptr[_graphene_euler_t] = 
    val ____ptr = apply()
    (!____ptr).__graphene_private_angles = __graphene_private_angles
    (!____ptr).__graphene_private_order = __graphene_private_order
    ____ptr
  extension (struct: _graphene_euler_t)
    def __graphene_private_angles : graphene_vec3_t = struct._1
    def __graphene_private_angles_=(value: graphene_vec3_t): Unit = !struct.at1 = value
    def __graphene_private_order : graphene_euler_order_t = struct._2
    def __graphene_private_order_=(value: graphene_euler_order_t): Unit = !struct.at2 = value

/**
 * graphene_frustum_t:

 * [bindgen] header: /usr/include/graphene-1.0/graphene-frustum.h
*/
opaque type _graphene_frustum_t = CStruct1[CArray[graphene_plane_t, Nat._6]]
object _graphene_frustum_t:
  given _tag: Tag[_graphene_frustum_t] = Tag.materializeCStruct1Tag[CArray[graphene_plane_t, Nat._6]]
  def apply()(using Zone): Ptr[_graphene_frustum_t] = scala.scalanative.unsafe.alloc[_graphene_frustum_t](1)
  def apply(__graphene_private_planes : CArray[graphene_plane_t, Nat._6])(using Zone): Ptr[_graphene_frustum_t] = 
    val ____ptr = apply()
    (!____ptr).__graphene_private_planes = __graphene_private_planes
    ____ptr
  extension (struct: _graphene_frustum_t)
    def __graphene_private_planes : CArray[graphene_plane_t, Nat._6] = struct._1
    def __graphene_private_planes_=(value: CArray[graphene_plane_t, Nat._6]): Unit = !struct.at1 = value

/**
 * graphene_matrix_t:

 * [bindgen] header: /usr/include/graphene-1.0/graphene-matrix.h
*/
opaque type _graphene_matrix_t = CStruct1[graphene_simd4x4f_t]
object _graphene_matrix_t:
  given _tag: Tag[_graphene_matrix_t] = Tag.materializeCStruct1Tag[graphene_simd4x4f_t]
  def apply()(using Zone): Ptr[_graphene_matrix_t] = scala.scalanative.unsafe.alloc[_graphene_matrix_t](1)
  def apply(__graphene_private_value : graphene_simd4x4f_t)(using Zone): Ptr[_graphene_matrix_t] = 
    val ____ptr = apply()
    (!____ptr).__graphene_private_value = __graphene_private_value
    ____ptr
  extension (struct: _graphene_matrix_t)
    def __graphene_private_value : graphene_simd4x4f_t = struct._1
    def __graphene_private_value_=(value: graphene_simd4x4f_t): Unit = !struct.at1 = value

/**
 * graphene_plane_t:

 * [bindgen] header: /usr/include/graphene-1.0/graphene-plane.h
*/
opaque type _graphene_plane_t = CStruct2[graphene_vec3_t, Float]
object _graphene_plane_t:
  given _tag: Tag[_graphene_plane_t] = Tag.materializeCStruct2Tag[graphene_vec3_t, Float]
  def apply()(using Zone): Ptr[_graphene_plane_t] = scala.scalanative.unsafe.alloc[_graphene_plane_t](1)
  def apply(__graphene_private_normal : graphene_vec3_t, __graphene_private_constant : Float)(using Zone): Ptr[_graphene_plane_t] = 
    val ____ptr = apply()
    (!____ptr).__graphene_private_normal = __graphene_private_normal
    (!____ptr).__graphene_private_constant = __graphene_private_constant
    ____ptr
  extension (struct: _graphene_plane_t)
    def __graphene_private_normal : graphene_vec3_t = struct._1
    def __graphene_private_normal_=(value: graphene_vec3_t): Unit = !struct.at1 = value
    def __graphene_private_constant : Float = struct._2
    def __graphene_private_constant_=(value: Float): Unit = !struct.at2 = value

/**
 * graphene_point3d_t: : the X coordinate : the Y coordinate : the Z coordinate

 * [bindgen] header: /usr/include/graphene-1.0/graphene-point3d.h
*/
opaque type _graphene_point3d_t = CStruct3[Float, Float, Float]
object _graphene_point3d_t:
  given _tag: Tag[_graphene_point3d_t] = Tag.materializeCStruct3Tag[Float, Float, Float]
  def apply()(using Zone): Ptr[_graphene_point3d_t] = scala.scalanative.unsafe.alloc[_graphene_point3d_t](1)
  def apply(x : Float, y : Float, z : Float)(using Zone): Ptr[_graphene_point3d_t] = 
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).z = z
    ____ptr
  extension (struct: _graphene_point3d_t)
    def x : Float = struct._1
    def x_=(value: Float): Unit = !struct.at1 = value
    def y : Float = struct._2
    def y_=(value: Float): Unit = !struct.at2 = value
    def z : Float = struct._3
    def z_=(value: Float): Unit = !struct.at3 = value

/**
 * graphene_point_t: : the X coordinate of the point : the Y coordinate of the point

 * [bindgen] header: /usr/include/graphene-1.0/graphene-point.h
*/
opaque type _graphene_point_t = CStruct2[Float, Float]
object _graphene_point_t:
  given _tag: Tag[_graphene_point_t] = Tag.materializeCStruct2Tag[Float, Float]
  def apply()(using Zone): Ptr[_graphene_point_t] = scala.scalanative.unsafe.alloc[_graphene_point_t](1)
  def apply(x : Float, y : Float)(using Zone): Ptr[_graphene_point_t] = 
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    ____ptr
  extension (struct: _graphene_point_t)
    def x : Float = struct._1
    def x_=(value: Float): Unit = !struct.at1 = value
    def y : Float = struct._2
    def y_=(value: Float): Unit = !struct.at2 = value

/**
 * graphene_quad_t:

 * [bindgen] header: /usr/include/graphene-1.0/graphene-quad.h
*/
opaque type _graphene_quad_t = CStruct1[CArray[graphene_point_t, Nat._4]]
object _graphene_quad_t:
  given _tag: Tag[_graphene_quad_t] = Tag.materializeCStruct1Tag[CArray[graphene_point_t, Nat._4]]
  def apply()(using Zone): Ptr[_graphene_quad_t] = scala.scalanative.unsafe.alloc[_graphene_quad_t](1)
  def apply(__graphene_private_points : CArray[graphene_point_t, Nat._4])(using Zone): Ptr[_graphene_quad_t] = 
    val ____ptr = apply()
    (!____ptr).__graphene_private_points = __graphene_private_points
    ____ptr
  extension (struct: _graphene_quad_t)
    def __graphene_private_points : CArray[graphene_point_t, Nat._4] = struct._1
    def __graphene_private_points_=(value: CArray[graphene_point_t, Nat._4]): Unit = !struct.at1 = value

/**
 * graphene_quaternion_t:

 * [bindgen] header: /usr/include/graphene-1.0/graphene-quaternion.h
*/
opaque type _graphene_quaternion_t = CStruct4[Float, Float, Float, Float]
object _graphene_quaternion_t:
  given _tag: Tag[_graphene_quaternion_t] = Tag.materializeCStruct4Tag[Float, Float, Float, Float]
  def apply()(using Zone): Ptr[_graphene_quaternion_t] = scala.scalanative.unsafe.alloc[_graphene_quaternion_t](1)
  def apply(__graphene_private_x : Float, __graphene_private_y : Float, __graphene_private_z : Float, __graphene_private_w : Float)(using Zone): Ptr[_graphene_quaternion_t] = 
    val ____ptr = apply()
    (!____ptr).__graphene_private_x = __graphene_private_x
    (!____ptr).__graphene_private_y = __graphene_private_y
    (!____ptr).__graphene_private_z = __graphene_private_z
    (!____ptr).__graphene_private_w = __graphene_private_w
    ____ptr
  extension (struct: _graphene_quaternion_t)
    def __graphene_private_x : Float = struct._1
    def __graphene_private_x_=(value: Float): Unit = !struct.at1 = value
    def __graphene_private_y : Float = struct._2
    def __graphene_private_y_=(value: Float): Unit = !struct.at2 = value
    def __graphene_private_z : Float = struct._3
    def __graphene_private_z_=(value: Float): Unit = !struct.at3 = value
    def __graphene_private_w : Float = struct._4
    def __graphene_private_w_=(value: Float): Unit = !struct.at4 = value

/**
 * graphene_ray_t:

 * [bindgen] header: /usr/include/graphene-1.0/graphene-ray.h
*/
opaque type _graphene_ray_t = CStruct2[graphene_vec3_t, graphene_vec3_t]
object _graphene_ray_t:
  given _tag: Tag[_graphene_ray_t] = Tag.materializeCStruct2Tag[graphene_vec3_t, graphene_vec3_t]
  def apply()(using Zone): Ptr[_graphene_ray_t] = scala.scalanative.unsafe.alloc[_graphene_ray_t](1)
  def apply(__graphene_private_origin : graphene_vec3_t, __graphene_private_direction : graphene_vec3_t)(using Zone): Ptr[_graphene_ray_t] = 
    val ____ptr = apply()
    (!____ptr).__graphene_private_origin = __graphene_private_origin
    (!____ptr).__graphene_private_direction = __graphene_private_direction
    ____ptr
  extension (struct: _graphene_ray_t)
    def __graphene_private_origin : graphene_vec3_t = struct._1
    def __graphene_private_origin_=(value: graphene_vec3_t): Unit = !struct.at1 = value
    def __graphene_private_direction : graphene_vec3_t = struct._2
    def __graphene_private_direction_=(value: graphene_vec3_t): Unit = !struct.at2 = value

/**
 * graphene_rect_t: : the coordinates of the origin of the rectangle : the size of the rectangle

 * [bindgen] header: /usr/include/graphene-1.0/graphene-rect.h
*/
opaque type _graphene_rect_t = CStruct2[graphene_point_t, graphene_size_t]
object _graphene_rect_t:
  given _tag: Tag[_graphene_rect_t] = Tag.materializeCStruct2Tag[graphene_point_t, graphene_size_t]
  def apply()(using Zone): Ptr[_graphene_rect_t] = scala.scalanative.unsafe.alloc[_graphene_rect_t](1)
  def apply(origin : graphene_point_t, size : graphene_size_t)(using Zone): Ptr[_graphene_rect_t] = 
    val ____ptr = apply()
    (!____ptr).origin = origin
    (!____ptr).size = size
    ____ptr
  extension (struct: _graphene_rect_t)
    def origin : graphene_point_t = struct._1
    def origin_=(value: graphene_point_t): Unit = !struct.at1 = value
    def size : graphene_size_t = struct._2
    def size_=(value: graphene_size_t): Unit = !struct.at2 = value

/**
 * graphene_size_t: : the width : the height

 * [bindgen] header: /usr/include/graphene-1.0/graphene-size.h
*/
opaque type _graphene_size_t = CStruct2[Float, Float]
object _graphene_size_t:
  given _tag: Tag[_graphene_size_t] = Tag.materializeCStruct2Tag[Float, Float]
  def apply()(using Zone): Ptr[_graphene_size_t] = scala.scalanative.unsafe.alloc[_graphene_size_t](1)
  def apply(width : Float, height : Float)(using Zone): Ptr[_graphene_size_t] = 
    val ____ptr = apply()
    (!____ptr).width = width
    (!____ptr).height = height
    ____ptr
  extension (struct: _graphene_size_t)
    def width : Float = struct._1
    def width_=(value: Float): Unit = !struct.at1 = value
    def height : Float = struct._2
    def height_=(value: Float): Unit = !struct.at2 = value

/**
 * graphene_sphere_t:

 * [bindgen] header: /usr/include/graphene-1.0/graphene-sphere.h
*/
opaque type _graphene_sphere_t = CStruct2[graphene_vec3_t, Float]
object _graphene_sphere_t:
  given _tag: Tag[_graphene_sphere_t] = Tag.materializeCStruct2Tag[graphene_vec3_t, Float]
  def apply()(using Zone): Ptr[_graphene_sphere_t] = scala.scalanative.unsafe.alloc[_graphene_sphere_t](1)
  def apply(__graphene_private_center : graphene_vec3_t, __graphene_private_radius : Float)(using Zone): Ptr[_graphene_sphere_t] = 
    val ____ptr = apply()
    (!____ptr).__graphene_private_center = __graphene_private_center
    (!____ptr).__graphene_private_radius = __graphene_private_radius
    ____ptr
  extension (struct: _graphene_sphere_t)
    def __graphene_private_center : graphene_vec3_t = struct._1
    def __graphene_private_center_=(value: graphene_vec3_t): Unit = !struct.at1 = value
    def __graphene_private_radius : Float = struct._2
    def __graphene_private_radius_=(value: Float): Unit = !struct.at2 = value

/**
 * graphene_triangle_t:

 * [bindgen] header: /usr/include/graphene-1.0/graphene-triangle.h
*/
opaque type _graphene_triangle_t = CStruct3[graphene_vec3_t, graphene_vec3_t, graphene_vec3_t]
object _graphene_triangle_t:
  given _tag: Tag[_graphene_triangle_t] = Tag.materializeCStruct3Tag[graphene_vec3_t, graphene_vec3_t, graphene_vec3_t]
  def apply()(using Zone): Ptr[_graphene_triangle_t] = scala.scalanative.unsafe.alloc[_graphene_triangle_t](1)
  def apply(__graphene_private_a : graphene_vec3_t, __graphene_private_b : graphene_vec3_t, __graphene_private_c : graphene_vec3_t)(using Zone): Ptr[_graphene_triangle_t] = 
    val ____ptr = apply()
    (!____ptr).__graphene_private_a = __graphene_private_a
    (!____ptr).__graphene_private_b = __graphene_private_b
    (!____ptr).__graphene_private_c = __graphene_private_c
    ____ptr
  extension (struct: _graphene_triangle_t)
    def __graphene_private_a : graphene_vec3_t = struct._1
    def __graphene_private_a_=(value: graphene_vec3_t): Unit = !struct.at1 = value
    def __graphene_private_b : graphene_vec3_t = struct._2
    def __graphene_private_b_=(value: graphene_vec3_t): Unit = !struct.at2 = value
    def __graphene_private_c : graphene_vec3_t = struct._3
    def __graphene_private_c_=(value: graphene_vec3_t): Unit = !struct.at3 = value

/**
 * graphene_vec2_t:

 * [bindgen] header: /usr/include/graphene-1.0/graphene-vec2.h
*/
opaque type _graphene_vec2_t = CStruct1[graphene_simd4f_t]
object _graphene_vec2_t:
  given _tag: Tag[_graphene_vec2_t] = Tag.materializeCStruct1Tag[graphene_simd4f_t]
  def apply()(using Zone): Ptr[_graphene_vec2_t] = scala.scalanative.unsafe.alloc[_graphene_vec2_t](1)
  def apply(__graphene_private_value : graphene_simd4f_t)(using Zone): Ptr[_graphene_vec2_t] = 
    val ____ptr = apply()
    (!____ptr).__graphene_private_value = __graphene_private_value
    ____ptr
  extension (struct: _graphene_vec2_t)
    def __graphene_private_value : graphene_simd4f_t = struct._1
    def __graphene_private_value_=(value: graphene_simd4f_t): Unit = !struct.at1 = value

/**
 * graphene_vec3_t:

 * [bindgen] header: /usr/include/graphene-1.0/graphene-vec3.h
*/
opaque type _graphene_vec3_t = CStruct1[graphene_simd4f_t]
object _graphene_vec3_t:
  given _tag: Tag[_graphene_vec3_t] = Tag.materializeCStruct1Tag[graphene_simd4f_t]
  def apply()(using Zone): Ptr[_graphene_vec3_t] = scala.scalanative.unsafe.alloc[_graphene_vec3_t](1)
  def apply(__graphene_private_value : graphene_simd4f_t)(using Zone): Ptr[_graphene_vec3_t] = 
    val ____ptr = apply()
    (!____ptr).__graphene_private_value = __graphene_private_value
    ____ptr
  extension (struct: _graphene_vec3_t)
    def __graphene_private_value : graphene_simd4f_t = struct._1
    def __graphene_private_value_=(value: graphene_simd4f_t): Unit = !struct.at1 = value

/**
 * graphene_vec4_t:

 * [bindgen] header: /usr/include/graphene-1.0/graphene-vec4.h
*/
opaque type _graphene_vec4_t = CStruct1[graphene_simd4f_t]
object _graphene_vec4_t:
  given _tag: Tag[_graphene_vec4_t] = Tag.materializeCStruct1Tag[graphene_simd4f_t]
  def apply()(using Zone): Ptr[_graphene_vec4_t] = scala.scalanative.unsafe.alloc[_graphene_vec4_t](1)
  def apply(__graphene_private_value : graphene_simd4f_t)(using Zone): Ptr[_graphene_vec4_t] = 
    val ____ptr = apply()
    (!____ptr).__graphene_private_value = __graphene_private_value
    ____ptr
  extension (struct: _graphene_vec4_t)
    def __graphene_private_value : graphene_simd4f_t = struct._1
    def __graphene_private_value_=(value: graphene_simd4f_t): Unit = !struct.at1 = value

/**
 * graphene_box_t:

 * [bindgen] header: /usr/include/graphene-1.0/graphene-box.h
*/
opaque type graphene_box_t = CStruct2[graphene_vec3_t, graphene_vec3_t]
object graphene_box_t:
  given _tag: Tag[graphene_box_t] = Tag.materializeCStruct2Tag[graphene_vec3_t, graphene_vec3_t]
  def apply()(using Zone): Ptr[graphene_box_t] = scala.scalanative.unsafe.alloc[graphene_box_t](1)
  def apply(__graphene_private_min : graphene_vec3_t, __graphene_private_max : graphene_vec3_t)(using Zone): Ptr[graphene_box_t] = 
    val ____ptr = apply()
    (!____ptr).__graphene_private_min = __graphene_private_min
    (!____ptr).__graphene_private_max = __graphene_private_max
    ____ptr
  extension (struct: graphene_box_t)
    def __graphene_private_min : graphene_vec3_t = struct._1
    def __graphene_private_min_=(value: graphene_vec3_t): Unit = !struct.at1 = value
    def __graphene_private_max : graphene_vec3_t = struct._2
    def __graphene_private_max_=(value: graphene_vec3_t): Unit = !struct.at2 = value

/**
 * graphene_euler_t:

 * [bindgen] header: /usr/include/graphene-1.0/graphene-euler.h
*/
opaque type graphene_euler_t = CStruct2[graphene_vec3_t, graphene_euler_order_t]
object graphene_euler_t:
  given _tag: Tag[graphene_euler_t] = Tag.materializeCStruct2Tag[graphene_vec3_t, graphene_euler_order_t]
  def apply()(using Zone): Ptr[graphene_euler_t] = scala.scalanative.unsafe.alloc[graphene_euler_t](1)
  def apply(__graphene_private_angles : graphene_vec3_t, __graphene_private_order : graphene_euler_order_t)(using Zone): Ptr[graphene_euler_t] = 
    val ____ptr = apply()
    (!____ptr).__graphene_private_angles = __graphene_private_angles
    (!____ptr).__graphene_private_order = __graphene_private_order
    ____ptr
  extension (struct: graphene_euler_t)
    def __graphene_private_angles : graphene_vec3_t = struct._1
    def __graphene_private_angles_=(value: graphene_vec3_t): Unit = !struct.at1 = value
    def __graphene_private_order : graphene_euler_order_t = struct._2
    def __graphene_private_order_=(value: graphene_euler_order_t): Unit = !struct.at2 = value

/**
 * graphene_frustum_t:

 * [bindgen] header: /usr/include/graphene-1.0/graphene-frustum.h
*/
opaque type graphene_frustum_t = CStruct1[CArray[graphene_plane_t, Nat._6]]
object graphene_frustum_t:
  given _tag: Tag[graphene_frustum_t] = Tag.materializeCStruct1Tag[CArray[graphene_plane_t, Nat._6]]
  def apply()(using Zone): Ptr[graphene_frustum_t] = scala.scalanative.unsafe.alloc[graphene_frustum_t](1)
  def apply(__graphene_private_planes : CArray[graphene_plane_t, Nat._6])(using Zone): Ptr[graphene_frustum_t] = 
    val ____ptr = apply()
    (!____ptr).__graphene_private_planes = __graphene_private_planes
    ____ptr
  extension (struct: graphene_frustum_t)
    def __graphene_private_planes : CArray[graphene_plane_t, Nat._6] = struct._1
    def __graphene_private_planes_=(value: CArray[graphene_plane_t, Nat._6]): Unit = !struct.at1 = value

/**
 * graphene_matrix_t:

 * [bindgen] header: /usr/include/graphene-1.0/graphene-matrix.h
*/
opaque type graphene_matrix_t = CStruct1[graphene_simd4x4f_t]
object graphene_matrix_t:
  given _tag: Tag[graphene_matrix_t] = Tag.materializeCStruct1Tag[graphene_simd4x4f_t]
  def apply()(using Zone): Ptr[graphene_matrix_t] = scala.scalanative.unsafe.alloc[graphene_matrix_t](1)
  def apply(__graphene_private_value : graphene_simd4x4f_t)(using Zone): Ptr[graphene_matrix_t] = 
    val ____ptr = apply()
    (!____ptr).__graphene_private_value = __graphene_private_value
    ____ptr
  extension (struct: graphene_matrix_t)
    def __graphene_private_value : graphene_simd4x4f_t = struct._1
    def __graphene_private_value_=(value: graphene_simd4x4f_t): Unit = !struct.at1 = value

/**
 * graphene_plane_t:

 * [bindgen] header: /usr/include/graphene-1.0/graphene-plane.h
*/
opaque type graphene_plane_t = CStruct2[graphene_vec3_t, Float]
object graphene_plane_t:
  given _tag: Tag[graphene_plane_t] = Tag.materializeCStruct2Tag[graphene_vec3_t, Float]
  def apply()(using Zone): Ptr[graphene_plane_t] = scala.scalanative.unsafe.alloc[graphene_plane_t](1)
  def apply(__graphene_private_normal : graphene_vec3_t, __graphene_private_constant : Float)(using Zone): Ptr[graphene_plane_t] = 
    val ____ptr = apply()
    (!____ptr).__graphene_private_normal = __graphene_private_normal
    (!____ptr).__graphene_private_constant = __graphene_private_constant
    ____ptr
  extension (struct: graphene_plane_t)
    def __graphene_private_normal : graphene_vec3_t = struct._1
    def __graphene_private_normal_=(value: graphene_vec3_t): Unit = !struct.at1 = value
    def __graphene_private_constant : Float = struct._2
    def __graphene_private_constant_=(value: Float): Unit = !struct.at2 = value

/**
 * graphene_point3d_t: : the X coordinate : the Y coordinate : the Z coordinate

 * [bindgen] header: /usr/include/graphene-1.0/graphene-point3d.h
*/
opaque type graphene_point3d_t = CStruct3[Float, Float, Float]
object graphene_point3d_t:
  given _tag: Tag[graphene_point3d_t] = Tag.materializeCStruct3Tag[Float, Float, Float]
  def apply()(using Zone): Ptr[graphene_point3d_t] = scala.scalanative.unsafe.alloc[graphene_point3d_t](1)
  def apply(x : Float, y : Float, z : Float)(using Zone): Ptr[graphene_point3d_t] = 
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).z = z
    ____ptr
  extension (struct: graphene_point3d_t)
    def x : Float = struct._1
    def x_=(value: Float): Unit = !struct.at1 = value
    def y : Float = struct._2
    def y_=(value: Float): Unit = !struct.at2 = value
    def z : Float = struct._3
    def z_=(value: Float): Unit = !struct.at3 = value

/**
 * graphene_point_t: : the X coordinate of the point : the Y coordinate of the point

 * [bindgen] header: /usr/include/graphene-1.0/graphene-point.h
*/
opaque type graphene_point_t = CStruct2[Float, Float]
object graphene_point_t:
  given _tag: Tag[graphene_point_t] = Tag.materializeCStruct2Tag[Float, Float]
  def apply()(using Zone): Ptr[graphene_point_t] = scala.scalanative.unsafe.alloc[graphene_point_t](1)
  def apply(x : Float, y : Float)(using Zone): Ptr[graphene_point_t] = 
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    ____ptr
  extension (struct: graphene_point_t)
    def x : Float = struct._1
    def x_=(value: Float): Unit = !struct.at1 = value
    def y : Float = struct._2
    def y_=(value: Float): Unit = !struct.at2 = value

/**
 * graphene_quad_t:

 * [bindgen] header: /usr/include/graphene-1.0/graphene-quad.h
*/
opaque type graphene_quad_t = CStruct1[CArray[graphene_point_t, Nat._4]]
object graphene_quad_t:
  given _tag: Tag[graphene_quad_t] = Tag.materializeCStruct1Tag[CArray[graphene_point_t, Nat._4]]
  def apply()(using Zone): Ptr[graphene_quad_t] = scala.scalanative.unsafe.alloc[graphene_quad_t](1)
  def apply(__graphene_private_points : CArray[graphene_point_t, Nat._4])(using Zone): Ptr[graphene_quad_t] = 
    val ____ptr = apply()
    (!____ptr).__graphene_private_points = __graphene_private_points
    ____ptr
  extension (struct: graphene_quad_t)
    def __graphene_private_points : CArray[graphene_point_t, Nat._4] = struct._1
    def __graphene_private_points_=(value: CArray[graphene_point_t, Nat._4]): Unit = !struct.at1 = value

/**
 * graphene_quaternion_t:

 * [bindgen] header: /usr/include/graphene-1.0/graphene-quaternion.h
*/
opaque type graphene_quaternion_t = CStruct4[Float, Float, Float, Float]
object graphene_quaternion_t:
  given _tag: Tag[graphene_quaternion_t] = Tag.materializeCStruct4Tag[Float, Float, Float, Float]
  def apply()(using Zone): Ptr[graphene_quaternion_t] = scala.scalanative.unsafe.alloc[graphene_quaternion_t](1)
  def apply(__graphene_private_x : Float, __graphene_private_y : Float, __graphene_private_z : Float, __graphene_private_w : Float)(using Zone): Ptr[graphene_quaternion_t] = 
    val ____ptr = apply()
    (!____ptr).__graphene_private_x = __graphene_private_x
    (!____ptr).__graphene_private_y = __graphene_private_y
    (!____ptr).__graphene_private_z = __graphene_private_z
    (!____ptr).__graphene_private_w = __graphene_private_w
    ____ptr
  extension (struct: graphene_quaternion_t)
    def __graphene_private_x : Float = struct._1
    def __graphene_private_x_=(value: Float): Unit = !struct.at1 = value
    def __graphene_private_y : Float = struct._2
    def __graphene_private_y_=(value: Float): Unit = !struct.at2 = value
    def __graphene_private_z : Float = struct._3
    def __graphene_private_z_=(value: Float): Unit = !struct.at3 = value
    def __graphene_private_w : Float = struct._4
    def __graphene_private_w_=(value: Float): Unit = !struct.at4 = value

/**
 * graphene_ray_t:

 * [bindgen] header: /usr/include/graphene-1.0/graphene-ray.h
*/
opaque type graphene_ray_t = CStruct2[graphene_vec3_t, graphene_vec3_t]
object graphene_ray_t:
  given _tag: Tag[graphene_ray_t] = Tag.materializeCStruct2Tag[graphene_vec3_t, graphene_vec3_t]
  def apply()(using Zone): Ptr[graphene_ray_t] = scala.scalanative.unsafe.alloc[graphene_ray_t](1)
  def apply(__graphene_private_origin : graphene_vec3_t, __graphene_private_direction : graphene_vec3_t)(using Zone): Ptr[graphene_ray_t] = 
    val ____ptr = apply()
    (!____ptr).__graphene_private_origin = __graphene_private_origin
    (!____ptr).__graphene_private_direction = __graphene_private_direction
    ____ptr
  extension (struct: graphene_ray_t)
    def __graphene_private_origin : graphene_vec3_t = struct._1
    def __graphene_private_origin_=(value: graphene_vec3_t): Unit = !struct.at1 = value
    def __graphene_private_direction : graphene_vec3_t = struct._2
    def __graphene_private_direction_=(value: graphene_vec3_t): Unit = !struct.at2 = value

/**
 * graphene_rect_t: : the coordinates of the origin of the rectangle : the size of the rectangle

 * [bindgen] header: /usr/include/graphene-1.0/graphene-rect.h
*/
opaque type graphene_rect_t = CStruct2[graphene_point_t, graphene_size_t]
object graphene_rect_t:
  given _tag: Tag[graphene_rect_t] = Tag.materializeCStruct2Tag[graphene_point_t, graphene_size_t]
  def apply()(using Zone): Ptr[graphene_rect_t] = scala.scalanative.unsafe.alloc[graphene_rect_t](1)
  def apply(origin : graphene_point_t, size : graphene_size_t)(using Zone): Ptr[graphene_rect_t] = 
    val ____ptr = apply()
    (!____ptr).origin = origin
    (!____ptr).size = size
    ____ptr
  extension (struct: graphene_rect_t)
    def origin : graphene_point_t = struct._1
    def origin_=(value: graphene_point_t): Unit = !struct.at1 = value
    def size : graphene_size_t = struct._2
    def size_=(value: graphene_size_t): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/lib/x86_64-linux-gnu/graphene-1.0/include/graphene-config.h
*/
opaque type graphene_simd4x4f_t = CStruct4[graphene_simd4f_t, graphene_simd4f_t, graphene_simd4f_t, graphene_simd4f_t]
object graphene_simd4x4f_t:
  given _tag: Tag[graphene_simd4x4f_t] = Tag.materializeCStruct4Tag[graphene_simd4f_t, graphene_simd4f_t, graphene_simd4f_t, graphene_simd4f_t]
  def apply()(using Zone): Ptr[graphene_simd4x4f_t] = scala.scalanative.unsafe.alloc[graphene_simd4x4f_t](1)
  def apply(x : graphene_simd4f_t, y : graphene_simd4f_t, z : graphene_simd4f_t, w : graphene_simd4f_t)(using Zone): Ptr[graphene_simd4x4f_t] = 
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).z = z
    (!____ptr).w = w
    ____ptr
  extension (struct: graphene_simd4x4f_t)
    def x : graphene_simd4f_t = struct._1
    def x_=(value: graphene_simd4f_t): Unit = !struct.at1 = value
    def y : graphene_simd4f_t = struct._2
    def y_=(value: graphene_simd4f_t): Unit = !struct.at2 = value
    def z : graphene_simd4f_t = struct._3
    def z_=(value: graphene_simd4f_t): Unit = !struct.at3 = value
    def w : graphene_simd4f_t = struct._4
    def w_=(value: graphene_simd4f_t): Unit = !struct.at4 = value

/**
 * graphene_size_t: : the width : the height

 * [bindgen] header: /usr/include/graphene-1.0/graphene-size.h
*/
opaque type graphene_size_t = CStruct2[Float, Float]
object graphene_size_t:
  given _tag: Tag[graphene_size_t] = Tag.materializeCStruct2Tag[Float, Float]
  def apply()(using Zone): Ptr[graphene_size_t] = scala.scalanative.unsafe.alloc[graphene_size_t](1)
  def apply(width : Float, height : Float)(using Zone): Ptr[graphene_size_t] = 
    val ____ptr = apply()
    (!____ptr).width = width
    (!____ptr).height = height
    ____ptr
  extension (struct: graphene_size_t)
    def width : Float = struct._1
    def width_=(value: Float): Unit = !struct.at1 = value
    def height : Float = struct._2
    def height_=(value: Float): Unit = !struct.at2 = value

/**
 * graphene_sphere_t:

 * [bindgen] header: /usr/include/graphene-1.0/graphene-sphere.h
*/
opaque type graphene_sphere_t = CStruct2[graphene_vec3_t, Float]
object graphene_sphere_t:
  given _tag: Tag[graphene_sphere_t] = Tag.materializeCStruct2Tag[graphene_vec3_t, Float]
  def apply()(using Zone): Ptr[graphene_sphere_t] = scala.scalanative.unsafe.alloc[graphene_sphere_t](1)
  def apply(__graphene_private_center : graphene_vec3_t, __graphene_private_radius : Float)(using Zone): Ptr[graphene_sphere_t] = 
    val ____ptr = apply()
    (!____ptr).__graphene_private_center = __graphene_private_center
    (!____ptr).__graphene_private_radius = __graphene_private_radius
    ____ptr
  extension (struct: graphene_sphere_t)
    def __graphene_private_center : graphene_vec3_t = struct._1
    def __graphene_private_center_=(value: graphene_vec3_t): Unit = !struct.at1 = value
    def __graphene_private_radius : Float = struct._2
    def __graphene_private_radius_=(value: Float): Unit = !struct.at2 = value

/**
 * graphene_triangle_t:

 * [bindgen] header: /usr/include/graphene-1.0/graphene-triangle.h
*/
opaque type graphene_triangle_t = CStruct3[graphene_vec3_t, graphene_vec3_t, graphene_vec3_t]
object graphene_triangle_t:
  given _tag: Tag[graphene_triangle_t] = Tag.materializeCStruct3Tag[graphene_vec3_t, graphene_vec3_t, graphene_vec3_t]
  def apply()(using Zone): Ptr[graphene_triangle_t] = scala.scalanative.unsafe.alloc[graphene_triangle_t](1)
  def apply(__graphene_private_a : graphene_vec3_t, __graphene_private_b : graphene_vec3_t, __graphene_private_c : graphene_vec3_t)(using Zone): Ptr[graphene_triangle_t] = 
    val ____ptr = apply()
    (!____ptr).__graphene_private_a = __graphene_private_a
    (!____ptr).__graphene_private_b = __graphene_private_b
    (!____ptr).__graphene_private_c = __graphene_private_c
    ____ptr
  extension (struct: graphene_triangle_t)
    def __graphene_private_a : graphene_vec3_t = struct._1
    def __graphene_private_a_=(value: graphene_vec3_t): Unit = !struct.at1 = value
    def __graphene_private_b : graphene_vec3_t = struct._2
    def __graphene_private_b_=(value: graphene_vec3_t): Unit = !struct.at2 = value
    def __graphene_private_c : graphene_vec3_t = struct._3
    def __graphene_private_c_=(value: graphene_vec3_t): Unit = !struct.at3 = value

/**
 * graphene_vec2_t:

 * [bindgen] header: /usr/include/graphene-1.0/graphene-vec2.h
*/
opaque type graphene_vec2_t = CStruct1[graphene_simd4f_t]
object graphene_vec2_t:
  given _tag: Tag[graphene_vec2_t] = Tag.materializeCStruct1Tag[graphene_simd4f_t]
  def apply()(using Zone): Ptr[graphene_vec2_t] = scala.scalanative.unsafe.alloc[graphene_vec2_t](1)
  def apply(__graphene_private_value : graphene_simd4f_t)(using Zone): Ptr[graphene_vec2_t] = 
    val ____ptr = apply()
    (!____ptr).__graphene_private_value = __graphene_private_value
    ____ptr
  extension (struct: graphene_vec2_t)
    def __graphene_private_value : graphene_simd4f_t = struct._1
    def __graphene_private_value_=(value: graphene_simd4f_t): Unit = !struct.at1 = value

/**
 * graphene_vec3_t:

 * [bindgen] header: /usr/include/graphene-1.0/graphene-vec3.h
*/
opaque type graphene_vec3_t = CStruct1[graphene_simd4f_t]
object graphene_vec3_t:
  given _tag: Tag[graphene_vec3_t] = Tag.materializeCStruct1Tag[graphene_simd4f_t]
  def apply()(using Zone): Ptr[graphene_vec3_t] = scala.scalanative.unsafe.alloc[graphene_vec3_t](1)
  def apply(__graphene_private_value : graphene_simd4f_t)(using Zone): Ptr[graphene_vec3_t] = 
    val ____ptr = apply()
    (!____ptr).__graphene_private_value = __graphene_private_value
    ____ptr
  extension (struct: graphene_vec3_t)
    def __graphene_private_value : graphene_simd4f_t = struct._1
    def __graphene_private_value_=(value: graphene_simd4f_t): Unit = !struct.at1 = value

/**
 * graphene_vec4_t:

 * [bindgen] header: /usr/include/graphene-1.0/graphene-vec4.h
*/
opaque type graphene_vec4_t = CStruct1[graphene_simd4f_t]
object graphene_vec4_t:
  given _tag: Tag[graphene_vec4_t] = Tag.materializeCStruct1Tag[graphene_simd4f_t]
  def apply()(using Zone): Ptr[graphene_vec4_t] = scala.scalanative.unsafe.alloc[graphene_vec4_t](1)
  def apply(__graphene_private_value : graphene_simd4f_t)(using Zone): Ptr[graphene_vec4_t] = 
    val ____ptr = apply()
    (!____ptr).__graphene_private_value = __graphene_private_value
    ____ptr
  extension (struct: graphene_vec4_t)
    def __graphene_private_value : graphene_simd4f_t = struct._1
    def __graphene_private_value_=(value: graphene_simd4f_t): Unit = !struct.at1 = value

