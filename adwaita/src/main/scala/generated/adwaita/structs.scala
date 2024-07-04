package adwaita

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-action-row.h
*/
opaque type AdwActionRow = CStruct1[AdwPreferencesRow]
object AdwActionRow:
  given _tag: Tag[AdwActionRow] = Tag.materializeCStruct1Tag[AdwPreferencesRow]
  def apply()(using Zone): Ptr[AdwActionRow] = scala.scalanative.unsafe.alloc[AdwActionRow](1)
  def apply(parent_instance : AdwPreferencesRow)(using Zone): Ptr[AdwActionRow] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: AdwActionRow)
    def parent_instance : AdwPreferencesRow = struct._1
    def parent_instance_=(value: AdwPreferencesRow): Unit = !struct.at1 = value

/**
 * AdwActionRowClass _class: The parent class : Activates the row to trigger its main action.

 * [bindgen] header: /usr/include/libadwaita-1/adw-action-row.h
*/
opaque type AdwActionRowClass = CStruct3[AdwPreferencesRowClass, CFuncPtr1[Ptr[AdwActionRow], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
object AdwActionRowClass:
  given _tag: Tag[AdwActionRowClass] = Tag.materializeCStruct3Tag[AdwPreferencesRowClass, CFuncPtr1[Ptr[AdwActionRow], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[AdwActionRowClass] = scala.scalanative.unsafe.alloc[AdwActionRowClass](1)
  def apply(parent_class : AdwPreferencesRowClass, activate : CFuncPtr1[Ptr[AdwActionRow], Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[AdwActionRowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).activate = activate
    (!____ptr).padding = padding
    ____ptr
  extension (struct: AdwActionRowClass)
    def parent_class : AdwPreferencesRowClass = struct._1
    def parent_class_=(value: AdwPreferencesRowClass): Unit = !struct.at1 = value
    def activate : CFuncPtr1[Ptr[AdwActionRow], Unit] = struct._2
    def activate_=(value: CFuncPtr1[Ptr[AdwActionRow], Unit]): Unit = !struct.at2 = value
    def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._3
    def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-animation.h
*/
opaque type AdwAnimation = CStruct1[_root_.sn.gnome.gobject.internal.GObject]
object AdwAnimation:
  given _tag: Tag[AdwAnimation] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObject]
  def apply()(using Zone): Ptr[AdwAnimation] = scala.scalanative.unsafe.alloc[AdwAnimation](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject)(using Zone): Ptr[AdwAnimation] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: AdwAnimation)
    def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
    def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = !struct.at1 = value

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
opaque type AdwApplication = CStruct1[_root_.sn.gnome.gtk.internal.GtkApplication]
object AdwApplication:
  given _tag: Tag[AdwApplication] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkApplication]
  def apply()(using Zone): Ptr[AdwApplication] = scala.scalanative.unsafe.alloc[AdwApplication](1)
  def apply(parent_instance : _root_.sn.gnome.gtk.internal.GtkApplication)(using Zone): Ptr[AdwApplication] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: AdwApplication)
    def parent_instance : _root_.sn.gnome.gtk.internal.GtkApplication = struct._1
    def parent_instance_=(value: _root_.sn.gnome.gtk.internal.GtkApplication): Unit = !struct.at1 = value

/**
 * AdwApplicationClass: _class: The parent class

 * [bindgen] header: /usr/include/libadwaita-1/adw-application.h
*/
opaque type AdwApplicationClass = CStruct2[_root_.sn.gnome.gtk.internal.GtkApplicationClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
object AdwApplicationClass:
  given _tag: Tag[AdwApplicationClass] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gtk.internal.GtkApplicationClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[AdwApplicationClass] = scala.scalanative.unsafe.alloc[AdwApplicationClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkApplicationClass, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[AdwApplicationClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: AdwApplicationClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkApplicationClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkApplicationClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._2
    def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-application-window.h
*/
opaque type AdwApplicationWindow = CStruct1[_root_.sn.gnome.gtk.internal.GtkApplicationWindow]
object AdwApplicationWindow:
  given _tag: Tag[AdwApplicationWindow] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkApplicationWindow]
  def apply()(using Zone): Ptr[AdwApplicationWindow] = scala.scalanative.unsafe.alloc[AdwApplicationWindow](1)
  def apply(parent_instance : _root_.sn.gnome.gtk.internal.GtkApplicationWindow)(using Zone): Ptr[AdwApplicationWindow] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: AdwApplicationWindow)
    def parent_instance : _root_.sn.gnome.gtk.internal.GtkApplicationWindow = struct._1
    def parent_instance_=(value: _root_.sn.gnome.gtk.internal.GtkApplicationWindow): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-application-window.h
*/
opaque type AdwApplicationWindowClass = CStruct2[_root_.sn.gnome.gtk.internal.GtkApplicationWindowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
object AdwApplicationWindowClass:
  given _tag: Tag[AdwApplicationWindowClass] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gtk.internal.GtkApplicationWindowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[AdwApplicationWindowClass] = scala.scalanative.unsafe.alloc[AdwApplicationWindowClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkApplicationWindowClass, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[AdwApplicationWindowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: AdwApplicationWindowClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkApplicationWindowClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkApplicationWindowClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._2
    def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-avatar.h
*/
opaque type AdwAvatar = CStruct0
object AdwAvatar:
  given _tag: Tag[AdwAvatar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-avatar.h
*/
opaque type AdwAvatarClass = CStruct1[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
object AdwAvatarClass:
  given _tag: Tag[AdwAvatarClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
  def apply()(using Zone): Ptr[AdwAvatarClass] = scala.scalanative.unsafe.alloc[AdwAvatarClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass)(using Zone): Ptr[AdwAvatarClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwAvatarClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkWidgetClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-bin.h
*/
opaque type AdwBin = CStruct1[_root_.sn.gnome.gtk.internal.GtkWidget]
object AdwBin:
  given _tag: Tag[AdwBin] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWidget]
  def apply()(using Zone): Ptr[AdwBin] = scala.scalanative.unsafe.alloc[AdwBin](1)
  def apply(parent_instance : _root_.sn.gnome.gtk.internal.GtkWidget)(using Zone): Ptr[AdwBin] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: AdwBin)
    def parent_instance : _root_.sn.gnome.gtk.internal.GtkWidget = struct._1
    def parent_instance_=(value: _root_.sn.gnome.gtk.internal.GtkWidget): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-bin.h
*/
opaque type AdwBinClass = CStruct1[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
object AdwBinClass:
  given _tag: Tag[AdwBinClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
  def apply()(using Zone): Ptr[AdwBinClass] = scala.scalanative.unsafe.alloc[AdwBinClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass)(using Zone): Ptr[AdwBinClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwBinClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkWidgetClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-button-content.h
*/
opaque type AdwButtonContent = CStruct0
object AdwButtonContent:
  given _tag: Tag[AdwButtonContent] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-button-content.h
*/
opaque type AdwButtonContentClass = CStruct1[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
object AdwButtonContentClass:
  given _tag: Tag[AdwButtonContentClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
  def apply()(using Zone): Ptr[AdwButtonContentClass] = scala.scalanative.unsafe.alloc[AdwButtonContentClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass)(using Zone): Ptr[AdwButtonContentClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwButtonContentClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkWidgetClass): Unit = !struct.at1 = value

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
opaque type AdwCarouselClass = CStruct1[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
object AdwCarouselClass:
  given _tag: Tag[AdwCarouselClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
  def apply()(using Zone): Ptr[AdwCarouselClass] = scala.scalanative.unsafe.alloc[AdwCarouselClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass)(using Zone): Ptr[AdwCarouselClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwCarouselClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkWidgetClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-carousel-indicator-dots.h
*/
opaque type AdwCarouselIndicatorDots = CStruct0
object AdwCarouselIndicatorDots:
  given _tag: Tag[AdwCarouselIndicatorDots] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-carousel-indicator-dots.h
*/
opaque type AdwCarouselIndicatorDotsClass = CStruct1[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
object AdwCarouselIndicatorDotsClass:
  given _tag: Tag[AdwCarouselIndicatorDotsClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
  def apply()(using Zone): Ptr[AdwCarouselIndicatorDotsClass] = scala.scalanative.unsafe.alloc[AdwCarouselIndicatorDotsClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass)(using Zone): Ptr[AdwCarouselIndicatorDotsClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwCarouselIndicatorDotsClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkWidgetClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-carousel-indicator-lines.h
*/
opaque type AdwCarouselIndicatorLines = CStruct0
object AdwCarouselIndicatorLines:
  given _tag: Tag[AdwCarouselIndicatorLines] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-carousel-indicator-lines.h
*/
opaque type AdwCarouselIndicatorLinesClass = CStruct1[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
object AdwCarouselIndicatorLinesClass:
  given _tag: Tag[AdwCarouselIndicatorLinesClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
  def apply()(using Zone): Ptr[AdwCarouselIndicatorLinesClass] = scala.scalanative.unsafe.alloc[AdwCarouselIndicatorLinesClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass)(using Zone): Ptr[AdwCarouselIndicatorLinesClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwCarouselIndicatorLinesClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkWidgetClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-clamp.h
*/
opaque type AdwClamp = CStruct0
object AdwClamp:
  given _tag: Tag[AdwClamp] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-clamp.h
*/
opaque type AdwClampClass = CStruct1[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
object AdwClampClass:
  given _tag: Tag[AdwClampClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
  def apply()(using Zone): Ptr[AdwClampClass] = scala.scalanative.unsafe.alloc[AdwClampClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass)(using Zone): Ptr[AdwClampClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwClampClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkWidgetClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-clamp-layout.h
*/
opaque type AdwClampLayout = CStruct0
object AdwClampLayout:
  given _tag: Tag[AdwClampLayout] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-clamp-layout.h
*/
opaque type AdwClampLayoutClass = CStruct1[_root_.sn.gnome.gtk.internal.GtkLayoutManagerClass]
object AdwClampLayoutClass:
  given _tag: Tag[AdwClampLayoutClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkLayoutManagerClass]
  def apply()(using Zone): Ptr[AdwClampLayoutClass] = scala.scalanative.unsafe.alloc[AdwClampLayoutClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkLayoutManagerClass)(using Zone): Ptr[AdwClampLayoutClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwClampLayoutClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkLayoutManagerClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkLayoutManagerClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-clamp-scrollable.h
*/
opaque type AdwClampScrollable = CStruct0
object AdwClampScrollable:
  given _tag: Tag[AdwClampScrollable] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-clamp-scrollable.h
*/
opaque type AdwClampScrollableClass = CStruct1[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
object AdwClampScrollableClass:
  given _tag: Tag[AdwClampScrollableClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
  def apply()(using Zone): Ptr[AdwClampScrollableClass] = scala.scalanative.unsafe.alloc[AdwClampScrollableClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass)(using Zone): Ptr[AdwClampScrollableClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwClampScrollableClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkWidgetClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-combo-row.h
*/
opaque type AdwComboRow = CStruct1[AdwActionRow]
object AdwComboRow:
  given _tag: Tag[AdwComboRow] = Tag.materializeCStruct1Tag[AdwActionRow]
  def apply()(using Zone): Ptr[AdwComboRow] = scala.scalanative.unsafe.alloc[AdwComboRow](1)
  def apply(parent_instance : AdwActionRow)(using Zone): Ptr[AdwComboRow] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: AdwComboRow)
    def parent_instance : AdwActionRow = struct._1
    def parent_instance_=(value: AdwActionRow): Unit = !struct.at1 = value

/**
 * AdwComboRowClass _class: The parent class

 * [bindgen] header: /usr/include/libadwaita-1/adw-combo-row.h
*/
opaque type AdwComboRowClass = CStruct2[AdwActionRowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
object AdwComboRowClass:
  given _tag: Tag[AdwComboRowClass] = Tag.materializeCStruct2Tag[AdwActionRowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[AdwComboRowClass] = scala.scalanative.unsafe.alloc[AdwComboRowClass](1)
  def apply(parent_class : AdwActionRowClass, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[AdwComboRowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: AdwComboRowClass)
    def parent_class : AdwActionRowClass = struct._1
    def parent_class_=(value: AdwActionRowClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._2
    def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-enum-list-model.h
*/
opaque type AdwEnumListItem = CStruct0
object AdwEnumListItem:
  given _tag: Tag[AdwEnumListItem] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-enum-list-model.h
*/
opaque type AdwEnumListItemClass = CStruct1[_root_.sn.gnome.gobject.internal.GObjectClass]
object AdwEnumListItemClass:
  given _tag: Tag[AdwEnumListItemClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObjectClass]
  def apply()(using Zone): Ptr[AdwEnumListItemClass] = scala.scalanative.unsafe.alloc[AdwEnumListItemClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass)(using Zone): Ptr[AdwEnumListItemClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwEnumListItemClass)
    def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-enum-list-model.h
*/
opaque type AdwEnumListModel = CStruct0
object AdwEnumListModel:
  given _tag: Tag[AdwEnumListModel] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-enum-list-model.h
*/
opaque type AdwEnumListModelClass = CStruct1[_root_.sn.gnome.gobject.internal.GObjectClass]
object AdwEnumListModelClass:
  given _tag: Tag[AdwEnumListModelClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObjectClass]
  def apply()(using Zone): Ptr[AdwEnumListModelClass] = scala.scalanative.unsafe.alloc[AdwEnumListModelClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass)(using Zone): Ptr[AdwEnumListModelClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwEnumListModelClass)
    def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-expander-row.h
*/
opaque type AdwExpanderRow = CStruct1[AdwPreferencesRow]
object AdwExpanderRow:
  given _tag: Tag[AdwExpanderRow] = Tag.materializeCStruct1Tag[AdwPreferencesRow]
  def apply()(using Zone): Ptr[AdwExpanderRow] = scala.scalanative.unsafe.alloc[AdwExpanderRow](1)
  def apply(parent_instance : AdwPreferencesRow)(using Zone): Ptr[AdwExpanderRow] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: AdwExpanderRow)
    def parent_instance : AdwPreferencesRow = struct._1
    def parent_instance_=(value: AdwPreferencesRow): Unit = !struct.at1 = value

/**
 * AdwExpanderRowClass _class: The parent class

 * [bindgen] header: /usr/include/libadwaita-1/adw-expander-row.h
*/
opaque type AdwExpanderRowClass = CStruct2[AdwPreferencesRowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
object AdwExpanderRowClass:
  given _tag: Tag[AdwExpanderRowClass] = Tag.materializeCStruct2Tag[AdwPreferencesRowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[AdwExpanderRowClass] = scala.scalanative.unsafe.alloc[AdwExpanderRowClass](1)
  def apply(parent_class : AdwPreferencesRowClass, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[AdwExpanderRowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: AdwExpanderRowClass)
    def parent_class : AdwPreferencesRowClass = struct._1
    def parent_class_=(value: AdwPreferencesRowClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._2
    def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-flap.h
*/
opaque type AdwFlap = CStruct0
object AdwFlap:
  given _tag: Tag[AdwFlap] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-flap.h
*/
opaque type AdwFlapClass = CStruct1[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
object AdwFlapClass:
  given _tag: Tag[AdwFlapClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
  def apply()(using Zone): Ptr[AdwFlapClass] = scala.scalanative.unsafe.alloc[AdwFlapClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass)(using Zone): Ptr[AdwFlapClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwFlapClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkWidgetClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-header-bar.h
*/
opaque type AdwHeaderBar = CStruct0
object AdwHeaderBar:
  given _tag: Tag[AdwHeaderBar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-header-bar.h
*/
opaque type AdwHeaderBarClass = CStruct1[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
object AdwHeaderBarClass:
  given _tag: Tag[AdwHeaderBarClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
  def apply()(using Zone): Ptr[AdwHeaderBarClass] = scala.scalanative.unsafe.alloc[AdwHeaderBarClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass)(using Zone): Ptr[AdwHeaderBarClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwHeaderBarClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkWidgetClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-leaflet.h
*/
opaque type AdwLeaflet = CStruct0
object AdwLeaflet:
  given _tag: Tag[AdwLeaflet] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-leaflet.h
*/
opaque type AdwLeafletClass = CStruct1[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
object AdwLeafletClass:
  given _tag: Tag[AdwLeafletClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
  def apply()(using Zone): Ptr[AdwLeafletClass] = scala.scalanative.unsafe.alloc[AdwLeafletClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass)(using Zone): Ptr[AdwLeafletClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwLeafletClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkWidgetClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-leaflet.h
*/
opaque type AdwLeafletPage = CStruct0
object AdwLeafletPage:
  given _tag: Tag[AdwLeafletPage] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-leaflet.h
*/
opaque type AdwLeafletPageClass = CStruct1[_root_.sn.gnome.gobject.internal.GObjectClass]
object AdwLeafletPageClass:
  given _tag: Tag[AdwLeafletPageClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObjectClass]
  def apply()(using Zone): Ptr[AdwLeafletPageClass] = scala.scalanative.unsafe.alloc[AdwLeafletPageClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass)(using Zone): Ptr[AdwLeafletPageClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwLeafletPageClass)
    def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-group.h
*/
opaque type AdwPreferencesGroup = CStruct1[_root_.sn.gnome.gtk.internal.GtkWidget]
object AdwPreferencesGroup:
  given _tag: Tag[AdwPreferencesGroup] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWidget]
  def apply()(using Zone): Ptr[AdwPreferencesGroup] = scala.scalanative.unsafe.alloc[AdwPreferencesGroup](1)
  def apply(parent_instance : _root_.sn.gnome.gtk.internal.GtkWidget)(using Zone): Ptr[AdwPreferencesGroup] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: AdwPreferencesGroup)
    def parent_instance : _root_.sn.gnome.gtk.internal.GtkWidget = struct._1
    def parent_instance_=(value: _root_.sn.gnome.gtk.internal.GtkWidget): Unit = !struct.at1 = value

/**
 * AdwPreferencesGroupClass _class: The parent class

 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-group.h
*/
opaque type AdwPreferencesGroupClass = CStruct2[_root_.sn.gnome.gtk.internal.GtkWidgetClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
object AdwPreferencesGroupClass:
  given _tag: Tag[AdwPreferencesGroupClass] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gtk.internal.GtkWidgetClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[AdwPreferencesGroupClass] = scala.scalanative.unsafe.alloc[AdwPreferencesGroupClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[AdwPreferencesGroupClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: AdwPreferencesGroupClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkWidgetClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._2
    def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-page.h
*/
opaque type AdwPreferencesPage = CStruct1[_root_.sn.gnome.gtk.internal.GtkWidget]
object AdwPreferencesPage:
  given _tag: Tag[AdwPreferencesPage] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWidget]
  def apply()(using Zone): Ptr[AdwPreferencesPage] = scala.scalanative.unsafe.alloc[AdwPreferencesPage](1)
  def apply(parent_instance : _root_.sn.gnome.gtk.internal.GtkWidget)(using Zone): Ptr[AdwPreferencesPage] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: AdwPreferencesPage)
    def parent_instance : _root_.sn.gnome.gtk.internal.GtkWidget = struct._1
    def parent_instance_=(value: _root_.sn.gnome.gtk.internal.GtkWidget): Unit = !struct.at1 = value

/**
 * AdwPreferencesPageClass _class: The parent class

 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-page.h
*/
opaque type AdwPreferencesPageClass = CStruct2[_root_.sn.gnome.gtk.internal.GtkWidgetClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
object AdwPreferencesPageClass:
  given _tag: Tag[AdwPreferencesPageClass] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gtk.internal.GtkWidgetClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[AdwPreferencesPageClass] = scala.scalanative.unsafe.alloc[AdwPreferencesPageClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[AdwPreferencesPageClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: AdwPreferencesPageClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkWidgetClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._2
    def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-row.h
*/
opaque type AdwPreferencesRow = CStruct1[_root_.sn.gnome.gtk.internal.GtkListBoxRow]
object AdwPreferencesRow:
  given _tag: Tag[AdwPreferencesRow] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkListBoxRow]
  def apply()(using Zone): Ptr[AdwPreferencesRow] = scala.scalanative.unsafe.alloc[AdwPreferencesRow](1)
  def apply(parent_instance : _root_.sn.gnome.gtk.internal.GtkListBoxRow)(using Zone): Ptr[AdwPreferencesRow] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: AdwPreferencesRow)
    def parent_instance : _root_.sn.gnome.gtk.internal.GtkListBoxRow = struct._1
    def parent_instance_=(value: _root_.sn.gnome.gtk.internal.GtkListBoxRow): Unit = !struct.at1 = value

/**
 * AdwPreferencesRowClass _class: The parent class

 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-row.h
*/
opaque type AdwPreferencesRowClass = CStruct2[_root_.sn.gnome.gtk.internal.GtkListBoxRowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
object AdwPreferencesRowClass:
  given _tag: Tag[AdwPreferencesRowClass] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gtk.internal.GtkListBoxRowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[AdwPreferencesRowClass] = scala.scalanative.unsafe.alloc[AdwPreferencesRowClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkListBoxRowClass, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[AdwPreferencesRowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: AdwPreferencesRowClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkListBoxRowClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkListBoxRowClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._2
    def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-window.h
*/
opaque type AdwPreferencesWindow = CStruct1[AdwWindow]
object AdwPreferencesWindow:
  given _tag: Tag[AdwPreferencesWindow] = Tag.materializeCStruct1Tag[AdwWindow]
  def apply()(using Zone): Ptr[AdwPreferencesWindow] = scala.scalanative.unsafe.alloc[AdwPreferencesWindow](1)
  def apply(parent_instance : AdwWindow)(using Zone): Ptr[AdwPreferencesWindow] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: AdwPreferencesWindow)
    def parent_instance : AdwWindow = struct._1
    def parent_instance_=(value: AdwWindow): Unit = !struct.at1 = value

/**
 * AdwPreferencesWindowClass _class: The parent class

 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-window.h
*/
opaque type AdwPreferencesWindowClass = CStruct2[AdwWindowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
object AdwPreferencesWindowClass:
  given _tag: Tag[AdwPreferencesWindowClass] = Tag.materializeCStruct2Tag[AdwWindowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[AdwPreferencesWindowClass] = scala.scalanative.unsafe.alloc[AdwPreferencesWindowClass](1)
  def apply(parent_class : AdwWindowClass, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[AdwPreferencesWindowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: AdwPreferencesWindowClass)
    def parent_class : AdwWindowClass = struct._1
    def parent_class_=(value: AdwWindowClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._2
    def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-split-button.h
*/
opaque type AdwSplitButton = CStruct0
object AdwSplitButton:
  given _tag: Tag[AdwSplitButton] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-split-button.h
*/
opaque type AdwSplitButtonClass = CStruct1[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
object AdwSplitButtonClass:
  given _tag: Tag[AdwSplitButtonClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
  def apply()(using Zone): Ptr[AdwSplitButtonClass] = scala.scalanative.unsafe.alloc[AdwSplitButtonClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass)(using Zone): Ptr[AdwSplitButtonClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwSplitButtonClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkWidgetClass): Unit = !struct.at1 = value

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
opaque type AdwSqueezerClass = CStruct1[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
object AdwSqueezerClass:
  given _tag: Tag[AdwSqueezerClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
  def apply()(using Zone): Ptr[AdwSqueezerClass] = scala.scalanative.unsafe.alloc[AdwSqueezerClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass)(using Zone): Ptr[AdwSqueezerClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwSqueezerClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkWidgetClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-squeezer.h
*/
opaque type AdwSqueezerPage = CStruct0
object AdwSqueezerPage:
  given _tag: Tag[AdwSqueezerPage] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-squeezer.h
*/
opaque type AdwSqueezerPageClass = CStruct1[_root_.sn.gnome.gobject.internal.GObjectClass]
object AdwSqueezerPageClass:
  given _tag: Tag[AdwSqueezerPageClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObjectClass]
  def apply()(using Zone): Ptr[AdwSqueezerPageClass] = scala.scalanative.unsafe.alloc[AdwSqueezerPageClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass)(using Zone): Ptr[AdwSqueezerPageClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwSqueezerPageClass)
    def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-status-page.h
*/
opaque type AdwStatusPage = CStruct0
object AdwStatusPage:
  given _tag: Tag[AdwStatusPage] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-status-page.h
*/
opaque type AdwStatusPageClass = CStruct1[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
object AdwStatusPageClass:
  given _tag: Tag[AdwStatusPageClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
  def apply()(using Zone): Ptr[AdwStatusPageClass] = scala.scalanative.unsafe.alloc[AdwStatusPageClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass)(using Zone): Ptr[AdwStatusPageClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwStatusPageClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkWidgetClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-style-manager.h
*/
opaque type AdwStyleManager = CStruct0
object AdwStyleManager:
  given _tag: Tag[AdwStyleManager] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-style-manager.h
*/
opaque type AdwStyleManagerClass = CStruct1[_root_.sn.gnome.gobject.internal.GObjectClass]
object AdwStyleManagerClass:
  given _tag: Tag[AdwStyleManagerClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObjectClass]
  def apply()(using Zone): Ptr[AdwStyleManagerClass] = scala.scalanative.unsafe.alloc[AdwStyleManagerClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass)(using Zone): Ptr[AdwStyleManagerClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwStyleManagerClass)
    def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-swipe-tracker.h
*/
opaque type AdwSwipeTracker = CStruct0
object AdwSwipeTracker:
  given _tag: Tag[AdwSwipeTracker] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-swipe-tracker.h
*/
opaque type AdwSwipeTrackerClass = CStruct1[_root_.sn.gnome.gobject.internal.GObjectClass]
object AdwSwipeTrackerClass:
  given _tag: Tag[AdwSwipeTrackerClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObjectClass]
  def apply()(using Zone): Ptr[AdwSwipeTrackerClass] = scala.scalanative.unsafe.alloc[AdwSwipeTrackerClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass)(using Zone): Ptr[AdwSwipeTrackerClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwSwipeTrackerClass)
    def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at1 = value

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
opaque type AdwSwipeableInterface = CStruct7[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[AdwSwipeable], Double], CFuncPtr2[Ptr[AdwSwipeable], Ptr[CInt], Ptr[Double]], CFuncPtr1[Ptr[AdwSwipeable], Double], CFuncPtr1[Ptr[AdwSwipeable], Double], CFuncPtr4[Ptr[AdwSwipeable], AdwNavigationDirection, _root_.sn.gnome.glib.internal.gboolean, Ptr[_root_.sn.gnome.gtk.internal.GdkRectangle], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
object AdwSwipeableInterface:
  given _tag: Tag[AdwSwipeableInterface] = Tag.materializeCStruct7Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[AdwSwipeable], Double], CFuncPtr2[Ptr[AdwSwipeable], Ptr[CInt], Ptr[Double]], CFuncPtr1[Ptr[AdwSwipeable], Double], CFuncPtr1[Ptr[AdwSwipeable], Double], CFuncPtr4[Ptr[AdwSwipeable], AdwNavigationDirection, _root_.sn.gnome.glib.internal.gboolean, Ptr[_root_.sn.gnome.gtk.internal.GdkRectangle], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[AdwSwipeableInterface] = scala.scalanative.unsafe.alloc[AdwSwipeableInterface](1)
  def apply(parent : _root_.sn.gnome.gobject.internal.GTypeInterface, get_distance : CFuncPtr1[Ptr[AdwSwipeable], Double], get_snap_points : CFuncPtr2[Ptr[AdwSwipeable], Ptr[CInt], Ptr[Double]], get_progress : CFuncPtr1[Ptr[AdwSwipeable], Double], get_cancel_progress : CFuncPtr1[Ptr[AdwSwipeable], Double], get_swipe_area : CFuncPtr4[Ptr[AdwSwipeable], AdwNavigationDirection, _root_.sn.gnome.glib.internal.gboolean, Ptr[_root_.sn.gnome.gtk.internal.GdkRectangle], Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[AdwSwipeableInterface] = 
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
    def parent : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
    def parent_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at1 = value
    def get_distance : CFuncPtr1[Ptr[AdwSwipeable], Double] = struct._2
    def get_distance_=(value: CFuncPtr1[Ptr[AdwSwipeable], Double]): Unit = !struct.at2 = value
    def get_snap_points : CFuncPtr2[Ptr[AdwSwipeable], Ptr[CInt], Ptr[Double]] = struct._3
    def get_snap_points_=(value: CFuncPtr2[Ptr[AdwSwipeable], Ptr[CInt], Ptr[Double]]): Unit = !struct.at3 = value
    def get_progress : CFuncPtr1[Ptr[AdwSwipeable], Double] = struct._4
    def get_progress_=(value: CFuncPtr1[Ptr[AdwSwipeable], Double]): Unit = !struct.at4 = value
    def get_cancel_progress : CFuncPtr1[Ptr[AdwSwipeable], Double] = struct._5
    def get_cancel_progress_=(value: CFuncPtr1[Ptr[AdwSwipeable], Double]): Unit = !struct.at5 = value
    def get_swipe_area : CFuncPtr4[Ptr[AdwSwipeable], AdwNavigationDirection, _root_.sn.gnome.glib.internal.gboolean, Ptr[_root_.sn.gnome.gtk.internal.GdkRectangle], Unit] = struct._6
    def get_swipe_area_=(value: CFuncPtr4[Ptr[AdwSwipeable], AdwNavigationDirection, _root_.sn.gnome.glib.internal.gboolean, Ptr[_root_.sn.gnome.gtk.internal.GdkRectangle], Unit]): Unit = !struct.at6 = value
    def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._7
    def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = !struct.at7 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-tab-bar.h
*/
opaque type AdwTabBar = CStruct0
object AdwTabBar:
  given _tag: Tag[AdwTabBar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-tab-bar.h
*/
opaque type AdwTabBarClass = CStruct1[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
object AdwTabBarClass:
  given _tag: Tag[AdwTabBarClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
  def apply()(using Zone): Ptr[AdwTabBarClass] = scala.scalanative.unsafe.alloc[AdwTabBarClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass)(using Zone): Ptr[AdwTabBarClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwTabBarClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkWidgetClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-tab-view.h
*/
opaque type AdwTabPage = CStruct0
object AdwTabPage:
  given _tag: Tag[AdwTabPage] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-tab-view.h
*/
opaque type AdwTabPageClass = CStruct1[_root_.sn.gnome.gobject.internal.GObjectClass]
object AdwTabPageClass:
  given _tag: Tag[AdwTabPageClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObjectClass]
  def apply()(using Zone): Ptr[AdwTabPageClass] = scala.scalanative.unsafe.alloc[AdwTabPageClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass)(using Zone): Ptr[AdwTabPageClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwTabPageClass)
    def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-tab-view.h
*/
opaque type AdwTabView = CStruct0
object AdwTabView:
  given _tag: Tag[AdwTabView] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-tab-view.h
*/
opaque type AdwTabViewClass = CStruct1[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
object AdwTabViewClass:
  given _tag: Tag[AdwTabViewClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
  def apply()(using Zone): Ptr[AdwTabViewClass] = scala.scalanative.unsafe.alloc[AdwTabViewClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass)(using Zone): Ptr[AdwTabViewClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwTabViewClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkWidgetClass): Unit = !struct.at1 = value

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
opaque type AdwToastClass = CStruct1[_root_.sn.gnome.gobject.internal.GObjectClass]
object AdwToastClass:
  given _tag: Tag[AdwToastClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObjectClass]
  def apply()(using Zone): Ptr[AdwToastClass] = scala.scalanative.unsafe.alloc[AdwToastClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass)(using Zone): Ptr[AdwToastClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwToastClass)
    def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-toast-overlay.h
*/
opaque type AdwToastOverlay = CStruct0
object AdwToastOverlay:
  given _tag: Tag[AdwToastOverlay] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-toast-overlay.h
*/
opaque type AdwToastOverlayClass = CStruct1[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
object AdwToastOverlayClass:
  given _tag: Tag[AdwToastOverlayClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
  def apply()(using Zone): Ptr[AdwToastOverlayClass] = scala.scalanative.unsafe.alloc[AdwToastOverlayClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass)(using Zone): Ptr[AdwToastOverlayClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwToastOverlayClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkWidgetClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-stack.h
*/
opaque type AdwViewStack = CStruct0
object AdwViewStack:
  given _tag: Tag[AdwViewStack] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-stack.h
*/
opaque type AdwViewStackClass = CStruct1[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
object AdwViewStackClass:
  given _tag: Tag[AdwViewStackClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
  def apply()(using Zone): Ptr[AdwViewStackClass] = scala.scalanative.unsafe.alloc[AdwViewStackClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass)(using Zone): Ptr[AdwViewStackClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwViewStackClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkWidgetClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-stack.h
*/
opaque type AdwViewStackPage = CStruct0
object AdwViewStackPage:
  given _tag: Tag[AdwViewStackPage] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-stack.h
*/
opaque type AdwViewStackPageClass = CStruct1[_root_.sn.gnome.gobject.internal.GObjectClass]
object AdwViewStackPageClass:
  given _tag: Tag[AdwViewStackPageClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObjectClass]
  def apply()(using Zone): Ptr[AdwViewStackPageClass] = scala.scalanative.unsafe.alloc[AdwViewStackPageClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass)(using Zone): Ptr[AdwViewStackPageClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwViewStackPageClass)
    def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at1 = value

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
opaque type AdwViewSwitcherBarClass = CStruct1[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
object AdwViewSwitcherBarClass:
  given _tag: Tag[AdwViewSwitcherBarClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
  def apply()(using Zone): Ptr[AdwViewSwitcherBarClass] = scala.scalanative.unsafe.alloc[AdwViewSwitcherBarClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass)(using Zone): Ptr[AdwViewSwitcherBarClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwViewSwitcherBarClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkWidgetClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-switcher.h
*/
opaque type AdwViewSwitcherClass = CStruct1[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
object AdwViewSwitcherClass:
  given _tag: Tag[AdwViewSwitcherClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
  def apply()(using Zone): Ptr[AdwViewSwitcherClass] = scala.scalanative.unsafe.alloc[AdwViewSwitcherClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass)(using Zone): Ptr[AdwViewSwitcherClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwViewSwitcherClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkWidgetClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-switcher-title.h
*/
opaque type AdwViewSwitcherTitle = CStruct0
object AdwViewSwitcherTitle:
  given _tag: Tag[AdwViewSwitcherTitle] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-switcher-title.h
*/
opaque type AdwViewSwitcherTitleClass = CStruct1[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
object AdwViewSwitcherTitleClass:
  given _tag: Tag[AdwViewSwitcherTitleClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
  def apply()(using Zone): Ptr[AdwViewSwitcherTitleClass] = scala.scalanative.unsafe.alloc[AdwViewSwitcherTitleClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass)(using Zone): Ptr[AdwViewSwitcherTitleClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwViewSwitcherTitleClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkWidgetClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-window.h
*/
opaque type AdwWindow = CStruct1[_root_.sn.gnome.gtk.internal.GtkWindow]
object AdwWindow:
  given _tag: Tag[AdwWindow] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWindow]
  def apply()(using Zone): Ptr[AdwWindow] = scala.scalanative.unsafe.alloc[AdwWindow](1)
  def apply(parent_instance : _root_.sn.gnome.gtk.internal.GtkWindow)(using Zone): Ptr[AdwWindow] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: AdwWindow)
    def parent_instance : _root_.sn.gnome.gtk.internal.GtkWindow = struct._1
    def parent_instance_=(value: _root_.sn.gnome.gtk.internal.GtkWindow): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-window.h
*/
opaque type AdwWindowClass = CStruct2[_root_.sn.gnome.gtk.internal.GtkWindowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
object AdwWindowClass:
  given _tag: Tag[AdwWindowClass] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gtk.internal.GtkWindowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[AdwWindowClass] = scala.scalanative.unsafe.alloc[AdwWindowClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkWindowClass, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[AdwWindowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: AdwWindowClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkWindowClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkWindowClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._2
    def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-window-title.h
*/
opaque type AdwWindowTitle = CStruct0
object AdwWindowTitle:
  given _tag: Tag[AdwWindowTitle] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-window-title.h
*/
opaque type AdwWindowTitleClass = CStruct1[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
object AdwWindowTitleClass:
  given _tag: Tag[AdwWindowTitleClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
  def apply()(using Zone): Ptr[AdwWindowTitleClass] = scala.scalanative.unsafe.alloc[AdwWindowTitleClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass)(using Zone): Ptr[AdwWindowTitleClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: AdwWindowTitleClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkWidgetClass): Unit = !struct.at1 = value

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
opaque type _AdwActionRowClass = CStruct3[AdwPreferencesRowClass, CFuncPtr1[Ptr[AdwActionRow], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
object _AdwActionRowClass:
  given _tag: Tag[_AdwActionRowClass] = Tag.materializeCStruct3Tag[AdwPreferencesRowClass, CFuncPtr1[Ptr[AdwActionRow], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[_AdwActionRowClass] = scala.scalanative.unsafe.alloc[_AdwActionRowClass](1)
  def apply(parent_class : AdwPreferencesRowClass, activate : CFuncPtr1[Ptr[AdwActionRow], Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[_AdwActionRowClass] = 
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
    def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._3
    def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-animation.h
*/
opaque type _AdwAnimation = CStruct1[_root_.sn.gnome.gobject.internal.GObject]
object _AdwAnimation:
  given _tag: Tag[_AdwAnimation] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObject]
  def apply()(using Zone): Ptr[_AdwAnimation] = scala.scalanative.unsafe.alloc[_AdwAnimation](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject)(using Zone): Ptr[_AdwAnimation] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _AdwAnimation)
    def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
    def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = !struct.at1 = value

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
opaque type _AdwApplication = CStruct1[_root_.sn.gnome.gtk.internal.GtkApplication]
object _AdwApplication:
  given _tag: Tag[_AdwApplication] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkApplication]
  def apply()(using Zone): Ptr[_AdwApplication] = scala.scalanative.unsafe.alloc[_AdwApplication](1)
  def apply(parent_instance : _root_.sn.gnome.gtk.internal.GtkApplication)(using Zone): Ptr[_AdwApplication] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _AdwApplication)
    def parent_instance : _root_.sn.gnome.gtk.internal.GtkApplication = struct._1
    def parent_instance_=(value: _root_.sn.gnome.gtk.internal.GtkApplication): Unit = !struct.at1 = value

/**
 * AdwApplicationClass: _class: The parent class

 * [bindgen] header: /usr/include/libadwaita-1/adw-application.h
*/
opaque type _AdwApplicationClass = CStruct2[_root_.sn.gnome.gtk.internal.GtkApplicationClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
object _AdwApplicationClass:
  given _tag: Tag[_AdwApplicationClass] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gtk.internal.GtkApplicationClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[_AdwApplicationClass] = scala.scalanative.unsafe.alloc[_AdwApplicationClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkApplicationClass, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[_AdwApplicationClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _AdwApplicationClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkApplicationClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkApplicationClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._2
    def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-application-window.h
*/
opaque type _AdwApplicationWindow = CStruct1[_root_.sn.gnome.gtk.internal.GtkApplicationWindow]
object _AdwApplicationWindow:
  given _tag: Tag[_AdwApplicationWindow] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkApplicationWindow]
  def apply()(using Zone): Ptr[_AdwApplicationWindow] = scala.scalanative.unsafe.alloc[_AdwApplicationWindow](1)
  def apply(parent_instance : _root_.sn.gnome.gtk.internal.GtkApplicationWindow)(using Zone): Ptr[_AdwApplicationWindow] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _AdwApplicationWindow)
    def parent_instance : _root_.sn.gnome.gtk.internal.GtkApplicationWindow = struct._1
    def parent_instance_=(value: _root_.sn.gnome.gtk.internal.GtkApplicationWindow): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-application-window.h
*/
opaque type _AdwApplicationWindowClass = CStruct2[_root_.sn.gnome.gtk.internal.GtkApplicationWindowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
object _AdwApplicationWindowClass:
  given _tag: Tag[_AdwApplicationWindowClass] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gtk.internal.GtkApplicationWindowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[_AdwApplicationWindowClass] = scala.scalanative.unsafe.alloc[_AdwApplicationWindowClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkApplicationWindowClass, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[_AdwApplicationWindowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _AdwApplicationWindowClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkApplicationWindowClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkApplicationWindowClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._2
    def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-avatar.h
*/
opaque type _AdwAvatar = CStruct0
object _AdwAvatar:
  given _tag: Tag[_AdwAvatar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-bin.h
*/
opaque type _AdwBin = CStruct1[_root_.sn.gnome.gtk.internal.GtkWidget]
object _AdwBin:
  given _tag: Tag[_AdwBin] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWidget]
  def apply()(using Zone): Ptr[_AdwBin] = scala.scalanative.unsafe.alloc[_AdwBin](1)
  def apply(parent_instance : _root_.sn.gnome.gtk.internal.GtkWidget)(using Zone): Ptr[_AdwBin] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _AdwBin)
    def parent_instance : _root_.sn.gnome.gtk.internal.GtkWidget = struct._1
    def parent_instance_=(value: _root_.sn.gnome.gtk.internal.GtkWidget): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-bin.h
*/
opaque type _AdwBinClass = CStruct1[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
object _AdwBinClass:
  given _tag: Tag[_AdwBinClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWidgetClass]
  def apply()(using Zone): Ptr[_AdwBinClass] = scala.scalanative.unsafe.alloc[_AdwBinClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass)(using Zone): Ptr[_AdwBinClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: _AdwBinClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkWidgetClass): Unit = !struct.at1 = value

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
opaque type _AdwComboRowClass = CStruct2[AdwActionRowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
object _AdwComboRowClass:
  given _tag: Tag[_AdwComboRowClass] = Tag.materializeCStruct2Tag[AdwActionRowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[_AdwComboRowClass] = scala.scalanative.unsafe.alloc[_AdwComboRowClass](1)
  def apply(parent_class : AdwActionRowClass, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[_AdwComboRowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _AdwComboRowClass)
    def parent_class : AdwActionRowClass = struct._1
    def parent_class_=(value: AdwActionRowClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._2
    def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = !struct.at2 = value

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
opaque type _AdwExpanderRowClass = CStruct2[AdwPreferencesRowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
object _AdwExpanderRowClass:
  given _tag: Tag[_AdwExpanderRowClass] = Tag.materializeCStruct2Tag[AdwPreferencesRowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[_AdwExpanderRowClass] = scala.scalanative.unsafe.alloc[_AdwExpanderRowClass](1)
  def apply(parent_class : AdwPreferencesRowClass, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[_AdwExpanderRowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _AdwExpanderRowClass)
    def parent_class : AdwPreferencesRowClass = struct._1
    def parent_class_=(value: AdwPreferencesRowClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._2
    def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = !struct.at2 = value

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
opaque type _AdwPreferencesGroup = CStruct1[_root_.sn.gnome.gtk.internal.GtkWidget]
object _AdwPreferencesGroup:
  given _tag: Tag[_AdwPreferencesGroup] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWidget]
  def apply()(using Zone): Ptr[_AdwPreferencesGroup] = scala.scalanative.unsafe.alloc[_AdwPreferencesGroup](1)
  def apply(parent_instance : _root_.sn.gnome.gtk.internal.GtkWidget)(using Zone): Ptr[_AdwPreferencesGroup] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _AdwPreferencesGroup)
    def parent_instance : _root_.sn.gnome.gtk.internal.GtkWidget = struct._1
    def parent_instance_=(value: _root_.sn.gnome.gtk.internal.GtkWidget): Unit = !struct.at1 = value

/**
 * AdwPreferencesGroupClass _class: The parent class

 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-group.h
*/
opaque type _AdwPreferencesGroupClass = CStruct2[_root_.sn.gnome.gtk.internal.GtkWidgetClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
object _AdwPreferencesGroupClass:
  given _tag: Tag[_AdwPreferencesGroupClass] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gtk.internal.GtkWidgetClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[_AdwPreferencesGroupClass] = scala.scalanative.unsafe.alloc[_AdwPreferencesGroupClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[_AdwPreferencesGroupClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _AdwPreferencesGroupClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkWidgetClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._2
    def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-page.h
*/
opaque type _AdwPreferencesPage = CStruct1[_root_.sn.gnome.gtk.internal.GtkWidget]
object _AdwPreferencesPage:
  given _tag: Tag[_AdwPreferencesPage] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWidget]
  def apply()(using Zone): Ptr[_AdwPreferencesPage] = scala.scalanative.unsafe.alloc[_AdwPreferencesPage](1)
  def apply(parent_instance : _root_.sn.gnome.gtk.internal.GtkWidget)(using Zone): Ptr[_AdwPreferencesPage] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _AdwPreferencesPage)
    def parent_instance : _root_.sn.gnome.gtk.internal.GtkWidget = struct._1
    def parent_instance_=(value: _root_.sn.gnome.gtk.internal.GtkWidget): Unit = !struct.at1 = value

/**
 * AdwPreferencesPageClass _class: The parent class

 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-page.h
*/
opaque type _AdwPreferencesPageClass = CStruct2[_root_.sn.gnome.gtk.internal.GtkWidgetClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
object _AdwPreferencesPageClass:
  given _tag: Tag[_AdwPreferencesPageClass] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gtk.internal.GtkWidgetClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[_AdwPreferencesPageClass] = scala.scalanative.unsafe.alloc[_AdwPreferencesPageClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[_AdwPreferencesPageClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _AdwPreferencesPageClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkWidgetClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkWidgetClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._2
    def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-row.h
*/
opaque type _AdwPreferencesRow = CStruct1[_root_.sn.gnome.gtk.internal.GtkListBoxRow]
object _AdwPreferencesRow:
  given _tag: Tag[_AdwPreferencesRow] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkListBoxRow]
  def apply()(using Zone): Ptr[_AdwPreferencesRow] = scala.scalanative.unsafe.alloc[_AdwPreferencesRow](1)
  def apply(parent_instance : _root_.sn.gnome.gtk.internal.GtkListBoxRow)(using Zone): Ptr[_AdwPreferencesRow] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _AdwPreferencesRow)
    def parent_instance : _root_.sn.gnome.gtk.internal.GtkListBoxRow = struct._1
    def parent_instance_=(value: _root_.sn.gnome.gtk.internal.GtkListBoxRow): Unit = !struct.at1 = value

/**
 * AdwPreferencesRowClass _class: The parent class

 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-row.h
*/
opaque type _AdwPreferencesRowClass = CStruct2[_root_.sn.gnome.gtk.internal.GtkListBoxRowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
object _AdwPreferencesRowClass:
  given _tag: Tag[_AdwPreferencesRowClass] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gtk.internal.GtkListBoxRowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[_AdwPreferencesRowClass] = scala.scalanative.unsafe.alloc[_AdwPreferencesRowClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkListBoxRowClass, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[_AdwPreferencesRowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _AdwPreferencesRowClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkListBoxRowClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkListBoxRowClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._2
    def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = !struct.at2 = value

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
opaque type _AdwPreferencesWindowClass = CStruct2[AdwWindowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
object _AdwPreferencesWindowClass:
  given _tag: Tag[_AdwPreferencesWindowClass] = Tag.materializeCStruct2Tag[AdwWindowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[_AdwPreferencesWindowClass] = scala.scalanative.unsafe.alloc[_AdwPreferencesWindowClass](1)
  def apply(parent_class : AdwWindowClass, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[_AdwPreferencesWindowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _AdwPreferencesWindowClass)
    def parent_class : AdwWindowClass = struct._1
    def parent_class_=(value: AdwWindowClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._2
    def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = !struct.at2 = value

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
opaque type _AdwSwipeableInterface = CStruct7[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[AdwSwipeable], Double], CFuncPtr2[Ptr[AdwSwipeable], Ptr[CInt], Ptr[Double]], CFuncPtr1[Ptr[AdwSwipeable], Double], CFuncPtr1[Ptr[AdwSwipeable], Double], CFuncPtr4[Ptr[AdwSwipeable], AdwNavigationDirection, _root_.sn.gnome.glib.internal.gboolean, Ptr[_root_.sn.gnome.gtk.internal.GdkRectangle], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
object _AdwSwipeableInterface:
  given _tag: Tag[_AdwSwipeableInterface] = Tag.materializeCStruct7Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[AdwSwipeable], Double], CFuncPtr2[Ptr[AdwSwipeable], Ptr[CInt], Ptr[Double]], CFuncPtr1[Ptr[AdwSwipeable], Double], CFuncPtr1[Ptr[AdwSwipeable], Double], CFuncPtr4[Ptr[AdwSwipeable], AdwNavigationDirection, _root_.sn.gnome.glib.internal.gboolean, Ptr[_root_.sn.gnome.gtk.internal.GdkRectangle], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[_AdwSwipeableInterface] = scala.scalanative.unsafe.alloc[_AdwSwipeableInterface](1)
  def apply(parent : _root_.sn.gnome.gobject.internal.GTypeInterface, get_distance : CFuncPtr1[Ptr[AdwSwipeable], Double], get_snap_points : CFuncPtr2[Ptr[AdwSwipeable], Ptr[CInt], Ptr[Double]], get_progress : CFuncPtr1[Ptr[AdwSwipeable], Double], get_cancel_progress : CFuncPtr1[Ptr[AdwSwipeable], Double], get_swipe_area : CFuncPtr4[Ptr[AdwSwipeable], AdwNavigationDirection, _root_.sn.gnome.glib.internal.gboolean, Ptr[_root_.sn.gnome.gtk.internal.GdkRectangle], Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[_AdwSwipeableInterface] = 
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
    def parent : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
    def parent_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at1 = value
    def get_distance : CFuncPtr1[Ptr[AdwSwipeable], Double] = struct._2
    def get_distance_=(value: CFuncPtr1[Ptr[AdwSwipeable], Double]): Unit = !struct.at2 = value
    def get_snap_points : CFuncPtr2[Ptr[AdwSwipeable], Ptr[CInt], Ptr[Double]] = struct._3
    def get_snap_points_=(value: CFuncPtr2[Ptr[AdwSwipeable], Ptr[CInt], Ptr[Double]]): Unit = !struct.at3 = value
    def get_progress : CFuncPtr1[Ptr[AdwSwipeable], Double] = struct._4
    def get_progress_=(value: CFuncPtr1[Ptr[AdwSwipeable], Double]): Unit = !struct.at4 = value
    def get_cancel_progress : CFuncPtr1[Ptr[AdwSwipeable], Double] = struct._5
    def get_cancel_progress_=(value: CFuncPtr1[Ptr[AdwSwipeable], Double]): Unit = !struct.at5 = value
    def get_swipe_area : CFuncPtr4[Ptr[AdwSwipeable], AdwNavigationDirection, _root_.sn.gnome.glib.internal.gboolean, Ptr[_root_.sn.gnome.gtk.internal.GdkRectangle], Unit] = struct._6
    def get_swipe_area_=(value: CFuncPtr4[Ptr[AdwSwipeable], AdwNavigationDirection, _root_.sn.gnome.glib.internal.gboolean, Ptr[_root_.sn.gnome.gtk.internal.GdkRectangle], Unit]): Unit = !struct.at6 = value
    def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._7
    def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = !struct.at7 = value

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
opaque type _AdwWindow = CStruct1[_root_.sn.gnome.gtk.internal.GtkWindow]
object _AdwWindow:
  given _tag: Tag[_AdwWindow] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk.internal.GtkWindow]
  def apply()(using Zone): Ptr[_AdwWindow] = scala.scalanative.unsafe.alloc[_AdwWindow](1)
  def apply(parent_instance : _root_.sn.gnome.gtk.internal.GtkWindow)(using Zone): Ptr[_AdwWindow] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _AdwWindow)
    def parent_instance : _root_.sn.gnome.gtk.internal.GtkWindow = struct._1
    def parent_instance_=(value: _root_.sn.gnome.gtk.internal.GtkWindow): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-window.h
*/
opaque type _AdwWindowClass = CStruct2[_root_.sn.gnome.gtk.internal.GtkWindowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
object _AdwWindowClass:
  given _tag: Tag[_AdwWindowClass] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gtk.internal.GtkWindowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[_AdwWindowClass] = scala.scalanative.unsafe.alloc[_AdwWindowClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk.internal.GtkWindowClass, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[_AdwWindowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _AdwWindowClass)
    def parent_class : _root_.sn.gnome.gtk.internal.GtkWindowClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gtk.internal.GtkWindowClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._2
    def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-window-title.h
*/
opaque type _AdwWindowTitle = CStruct0
object _AdwWindowTitle:
  given _tag: Tag[_AdwWindowTitle] = Tag.materializeCStruct0Tag