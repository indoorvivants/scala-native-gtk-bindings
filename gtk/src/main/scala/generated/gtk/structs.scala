package gtk
package structs

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

import _root_.gtk.enumerations.*
import _root_.gtk.aliases.*
import _root_.gtk.structs.*

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
opaque type GdkContentProvider = CStruct1[_root_.gobject.all.GObject]
object GdkContentProvider:
  given _tag: Tag[GdkContentProvider] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[GdkContentProvider] = scala.scalanative.unsafe.alloc[GdkContentProvider](1)
  def apply(parent : _root_.gobject.all.GObject)(using Zone): Ptr[GdkContentProvider] = 
    val ____ptr = apply()
    (!____ptr).parent = parent
    ____ptr
  extension (struct: GdkContentProvider)
    def parent : _root_.gobject.all.GObject = struct._1
    def parent_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * GdkContentProviderClass: _changed: Signal class closure for `GdkContentProvider::content-changed`

 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkcontentprovider.h
*/
opaque type GdkContentProviderClass = CStruct10[_root_.gobject.all.GObjectClass, CFuncPtr1[Ptr[GdkContentProvider], Unit], CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit], CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit], CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]], CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]], CFuncPtr7[Ptr[GdkContentProvider], CString, Ptr[_root_.gio.all.GOutputStream], CInt, Ptr[_root_.gio.all.GCancellable], _root_.gio.all.GAsyncReadyCallback, _root_.glib.all.gpointer, Unit], CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.gio.all.GAsyncResult], Ptr[Ptr[_root_.glib.all.GError]], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.gobject.all.GValue], Ptr[Ptr[_root_.glib.all.GError]], _root_.glib.all.gboolean], CArray[_root_.glib.all.gpointer, Nat._8]]
object GdkContentProviderClass:
  given _tag: Tag[GdkContentProviderClass] = Tag.materializeCStruct10Tag[_root_.gobject.all.GObjectClass, CFuncPtr1[Ptr[GdkContentProvider], Unit], CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit], CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit], CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]], CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]], CFuncPtr7[Ptr[GdkContentProvider], CString, Ptr[_root_.gio.all.GOutputStream], CInt, Ptr[_root_.gio.all.GCancellable], _root_.gio.all.GAsyncReadyCallback, _root_.glib.all.gpointer, Unit], CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.gio.all.GAsyncResult], Ptr[Ptr[_root_.glib.all.GError]], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.gobject.all.GValue], Ptr[Ptr[_root_.glib.all.GError]], _root_.glib.all.gboolean], CArray[_root_.glib.all.gpointer, Nat._8]]
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
opaque type GdkKeymapKey = CStruct3[_root_.glib.all.guint, CInt, CInt]
object GdkKeymapKey:
  given _tag: Tag[GdkKeymapKey] = Tag.materializeCStruct3Tag[_root_.glib.all.guint, CInt, CInt]
  def apply()(using Zone): Ptr[GdkKeymapKey] = scala.scalanative.unsafe.alloc[GdkKeymapKey](1)
  def apply(keycode : _root_.glib.all.guint, group : CInt, level : CInt)(using Zone): Ptr[GdkKeymapKey] = 
    val ____ptr = apply()
    (!____ptr).keycode = keycode
    (!____ptr).group = group
    (!____ptr).level = level
    ____ptr
  extension (struct: GdkKeymapKey)
    def keycode : _root_.glib.all.guint = struct._1
    def keycode_=(value: _root_.glib.all.guint): Unit = !struct.at1 = value
    def group : CInt = struct._2
    def group_=(value: CInt): Unit = !struct.at2 = value
    def level : CInt = struct._3
    def level_=(value: CInt): Unit = !struct.at3 = value

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
opaque type GdkPaintableInterface = CStruct7[_root_.gobject.all.GTypeInterface, CFuncPtr4[Ptr[GdkPaintable], Ptr[GdkSnapshot], Double, Double, Unit], CFuncPtr1[Ptr[GdkPaintable], Ptr[GdkPaintable]], CFuncPtr1[Ptr[GdkPaintable], GdkPaintableFlags], CFuncPtr1[Ptr[GdkPaintable], CInt], CFuncPtr1[Ptr[GdkPaintable], CInt], CFuncPtr1[Ptr[GdkPaintable], Double]]
object GdkPaintableInterface:
  given _tag: Tag[GdkPaintableInterface] = Tag.materializeCStruct7Tag[_root_.gobject.all.GTypeInterface, CFuncPtr4[Ptr[GdkPaintable], Ptr[GdkSnapshot], Double, Double, Unit], CFuncPtr1[Ptr[GdkPaintable], Ptr[GdkPaintable]], CFuncPtr1[Ptr[GdkPaintable], GdkPaintableFlags], CFuncPtr1[Ptr[GdkPaintable], CInt], CFuncPtr1[Ptr[GdkPaintable], CInt], CFuncPtr1[Ptr[GdkPaintable], Double]]
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
opaque type GdkRGBA = CStruct4[Float, Float, Float, Float]
object GdkRGBA:
  given _tag: Tag[GdkRGBA] = Tag.materializeCStruct4Tag[Float, Float, Float, Float]
  def apply()(using Zone): Ptr[GdkRGBA] = scala.scalanative.unsafe.alloc[GdkRGBA](1)
  def apply(red : Float, green : Float, blue : Float, alpha : Float)(using Zone): Ptr[GdkRGBA] = 
    val ____ptr = apply()
    (!____ptr).red = red
    (!____ptr).green = green
    (!____ptr).blue = blue
    (!____ptr).alpha = alpha
    ____ptr
  extension (struct: GdkRGBA)
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
opaque type GdkScrollEvent = CStruct0
object GdkScrollEvent:
  given _tag: Tag[GdkScrollEvent] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gdk/gdkseat.h
*/
opaque type GdkSeat = CStruct1[_root_.gobject.all.GObject]
object GdkSeat:
  given _tag: Tag[GdkSeat] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[GdkSeat] = scala.scalanative.unsafe.alloc[GdkSeat](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[GdkSeat] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GdkSeat)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

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
opaque type GdkTimeCoord = CStruct3[_root_.glib.all.guint32, GdkAxisFlags, CArray[Double, Nat.Digit2[Nat._1, Nat._2]]]
object GdkTimeCoord:
  given _tag: Tag[GdkTimeCoord] = Tag.materializeCStruct3Tag[_root_.glib.all.guint32, GdkAxisFlags, CArray[Double, Nat.Digit2[Nat._1, Nat._2]]]
  def apply()(using Zone): Ptr[GdkTimeCoord] = scala.scalanative.unsafe.alloc[GdkTimeCoord](1)
  def apply(time : _root_.glib.all.guint32, flags : GdkAxisFlags, axes : CArray[Double, Nat.Digit2[Nat._1, Nat._2]])(using Zone): Ptr[GdkTimeCoord] = 
    val ____ptr = apply()
    (!____ptr).time = time
    (!____ptr).flags = flags
    (!____ptr).axes = axes
    ____ptr
  extension (struct: GdkTimeCoord)
    def time : _root_.glib.all.guint32 = struct._1
    def time_=(value: _root_.glib.all.guint32): Unit = !struct.at1 = value
    def flags : GdkAxisFlags = struct._2
    def flags_=(value: GdkAxisFlags): Unit = !struct.at2 = value
    def axes : CArray[Double, Nat.Digit2[Nat._1, Nat._2]] = struct._3
    def axes_=(value: CArray[Double, Nat.Digit2[Nat._1, Nat._2]]): Unit = !struct.at3 = value

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
opaque type GskColorStop = CStruct2[Float, GdkRGBA]
object GskColorStop:
  given _tag: Tag[GskColorStop] = Tag.materializeCStruct2Tag[Float, GdkRGBA]
  def apply()(using Zone): Ptr[GskColorStop] = scala.scalanative.unsafe.alloc[GskColorStop](1)
  def apply(offset : Float, color : GdkRGBA)(using Zone): Ptr[GskColorStop] = 
    val ____ptr = apply()
    (!____ptr).offset = offset
    (!____ptr).color = color
    ____ptr
  extension (struct: GskColorStop)
    def offset : Float = struct._1
    def offset_=(value: Float): Unit = !struct.at1 = value
    def color : GdkRGBA = struct._2
    def color_=(value: GdkRGBA): Unit = !struct.at2 = value

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
opaque type GskGLShaderClass = CStruct1[_root_.gobject.all.GObjectClass]
object GskGLShaderClass:
  given _tag: Tag[GskGLShaderClass] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObjectClass]
  def apply()(using Zone): Ptr[GskGLShaderClass] = scala.scalanative.unsafe.alloc[GskGLShaderClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[GskGLShaderClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GskGLShaderClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value

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
opaque type GskParseLocation = CStruct5[_root_.glib.all.gsize, _root_.glib.all.gsize, _root_.glib.all.gsize, _root_.glib.all.gsize, _root_.glib.all.gsize]
object GskParseLocation:
  given _tag: Tag[GskParseLocation] = Tag.materializeCStruct5Tag[_root_.glib.all.gsize, _root_.glib.all.gsize, _root_.glib.all.gsize, _root_.glib.all.gsize, _root_.glib.all.gsize]
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
opaque type GskRoundedRect = CStruct2[_root_.graphene.all.graphene_rect_t, CArray[_root_.graphene.all.graphene_size_t, Nat._4]]
object GskRoundedRect:
  given _tag: Tag[GskRoundedRect] = Tag.materializeCStruct2Tag[_root_.graphene.all.graphene_rect_t, CArray[_root_.graphene.all.graphene_size_t, Nat._4]]
  def apply()(using Zone): Ptr[GskRoundedRect] = scala.scalanative.unsafe.alloc[GskRoundedRect](1)
  def apply(bounds : _root_.graphene.all.graphene_rect_t, corner : CArray[_root_.graphene.all.graphene_size_t, Nat._4])(using Zone): Ptr[GskRoundedRect] = 
    val ____ptr = apply()
    (!____ptr).bounds = bounds
    (!____ptr).corner = corner
    ____ptr
  extension (struct: GskRoundedRect)
    def bounds : _root_.graphene.all.graphene_rect_t = struct._1
    def bounds_=(value: _root_.graphene.all.graphene_rect_t): Unit = !struct.at1 = value
    def corner : CArray[_root_.graphene.all.graphene_size_t, Nat._4] = struct._2
    def corner_=(value: CArray[_root_.graphene.all.graphene_size_t, Nat._4]): Unit = !struct.at2 = value

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
opaque type GskShadow = CStruct4[GdkRGBA, Float, Float, Float]
object GskShadow:
  given _tag: Tag[GskShadow] = Tag.materializeCStruct4Tag[GdkRGBA, Float, Float, Float]
  def apply()(using Zone): Ptr[GskShadow] = scala.scalanative.unsafe.alloc[GskShadow](1)
  def apply(color : GdkRGBA, dx : Float, dy : Float, radius : Float)(using Zone): Ptr[GskShadow] = 
    val ____ptr = apply()
    (!____ptr).color = color
    (!____ptr).dx = dx
    (!____ptr).dy = dy
    (!____ptr).radius = radius
    ____ptr
  extension (struct: GskShadow)
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
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkatcontext.h
*/
opaque type GtkATContext = CStruct0
object GtkATContext:
  given _tag: Tag[GtkATContext] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkatcontext.h
*/
opaque type GtkATContextClass = CStruct0
object GtkATContextClass:
  given _tag: Tag[GtkATContextClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkaboutdialog.h
*/
opaque type GtkAboutDialog = CStruct0
object GtkAboutDialog:
  given _tag: Tag[GtkAboutDialog] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkaccessible.h
*/
opaque type GtkAccessible = CStruct0
object GtkAccessible:
  given _tag: Tag[GtkAccessible] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkaccessible.h
*/
opaque type GtkAccessibleInterface = CStruct0
object GtkAccessibleInterface:
  given _tag: Tag[GtkAccessibleInterface] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkactionbar.h
*/
opaque type GtkActionBar = CStruct0
object GtkActionBar:
  given _tag: Tag[GtkActionBar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkactionable.h
*/
opaque type GtkActionable = CStruct0
object GtkActionable:
  given _tag: Tag[GtkActionable] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkactionable.h
*/
opaque type GtkActionableInterface = CStruct5[_root_.gobject.all.GTypeInterface, CFuncPtr1[Ptr[GtkActionable], CString], CFuncPtr2[Ptr[GtkActionable], CString, Unit], CFuncPtr1[Ptr[GtkActionable], Ptr[_root_.glib.all.GVariant]], CFuncPtr2[Ptr[GtkActionable], Ptr[_root_.glib.all.GVariant], Unit]]
object GtkActionableInterface:
  given _tag: Tag[GtkActionableInterface] = Tag.materializeCStruct5Tag[_root_.gobject.all.GTypeInterface, CFuncPtr1[Ptr[GtkActionable], CString], CFuncPtr2[Ptr[GtkActionable], CString, Unit], CFuncPtr1[Ptr[GtkActionable], Ptr[_root_.glib.all.GVariant]], CFuncPtr2[Ptr[GtkActionable], Ptr[_root_.glib.all.GVariant], Unit]]
  def apply()(using Zone): Ptr[GtkActionableInterface] = scala.scalanative.unsafe.alloc[GtkActionableInterface](1)
  def apply(g_iface : _root_.gobject.all.GTypeInterface, get_action_name : CFuncPtr1[Ptr[GtkActionable], CString], set_action_name : CFuncPtr2[Ptr[GtkActionable], CString, Unit], get_action_target_value : CFuncPtr1[Ptr[GtkActionable], Ptr[_root_.glib.all.GVariant]], set_action_target_value : CFuncPtr2[Ptr[GtkActionable], Ptr[_root_.glib.all.GVariant], Unit])(using Zone): Ptr[GtkActionableInterface] = 
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).get_action_name = get_action_name
    (!____ptr).set_action_name = set_action_name
    (!____ptr).get_action_target_value = get_action_target_value
    (!____ptr).set_action_target_value = set_action_target_value
    ____ptr
  extension (struct: GtkActionableInterface)
    def g_iface : _root_.gobject.all.GTypeInterface = struct._1
    def g_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def get_action_name : CFuncPtr1[Ptr[GtkActionable], CString] = struct._2
    def get_action_name_=(value: CFuncPtr1[Ptr[GtkActionable], CString]): Unit = !struct.at2 = value
    def set_action_name : CFuncPtr2[Ptr[GtkActionable], CString, Unit] = struct._3
    def set_action_name_=(value: CFuncPtr2[Ptr[GtkActionable], CString, Unit]): Unit = !struct.at3 = value
    def get_action_target_value : CFuncPtr1[Ptr[GtkActionable], Ptr[_root_.glib.all.GVariant]] = struct._4
    def get_action_target_value_=(value: CFuncPtr1[Ptr[GtkActionable], Ptr[_root_.glib.all.GVariant]]): Unit = !struct.at4 = value
    def set_action_target_value : CFuncPtr2[Ptr[GtkActionable], Ptr[_root_.glib.all.GVariant], Unit] = struct._5
    def set_action_target_value_=(value: CFuncPtr2[Ptr[GtkActionable], Ptr[_root_.glib.all.GVariant], Unit]): Unit = !struct.at5 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkActivateAction = CStruct0
object GtkActivateAction:
  given _tag: Tag[GtkActivateAction] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkActivateActionClass = CStruct0
object GtkActivateActionClass:
  given _tag: Tag[GtkActivateActionClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkadjustment.h
*/
opaque type GtkAdjustment = CStruct1[_root_.gobject.all.GInitiallyUnowned]
object GtkAdjustment:
  given _tag: Tag[GtkAdjustment] = Tag.materializeCStruct1Tag[_root_.gobject.all.GInitiallyUnowned]
  def apply()(using Zone): Ptr[GtkAdjustment] = scala.scalanative.unsafe.alloc[GtkAdjustment](1)
  def apply(parent_instance : _root_.gobject.all.GInitiallyUnowned)(using Zone): Ptr[GtkAdjustment] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkAdjustment)
    def parent_instance : _root_.gobject.all.GInitiallyUnowned = struct._1
    def parent_instance_=(value: _root_.gobject.all.GInitiallyUnowned): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkadjustment.h
*/
opaque type GtkAdjustmentClass = CStruct7[_root_.gobject.all.GInitiallyUnownedClass, CFuncPtr1[Ptr[GtkAdjustment], Unit], CFuncPtr1[Ptr[GtkAdjustment], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object GtkAdjustmentClass:
  given _tag: Tag[GtkAdjustmentClass] = Tag.materializeCStruct7Tag[_root_.gobject.all.GInitiallyUnownedClass, CFuncPtr1[Ptr[GtkAdjustment], Unit], CFuncPtr1[Ptr[GtkAdjustment], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[GtkAdjustmentClass] = scala.scalanative.unsafe.alloc[GtkAdjustmentClass](1)
  def apply(parent_class : _root_.gobject.all.GInitiallyUnownedClass, changed : CFuncPtr1[Ptr[GtkAdjustment], Unit], value_changed : CFuncPtr1[Ptr[GtkAdjustment], Unit], _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[GtkAdjustmentClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).changed = changed
    (!____ptr).value_changed = value_changed
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    ____ptr
  extension (struct: GtkAdjustmentClass)
    def parent_class : _root_.gobject.all.GInitiallyUnownedClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GInitiallyUnownedClass): Unit = !struct.at1 = value
    def changed : CFuncPtr1[Ptr[GtkAdjustment], Unit] = struct._2
    def changed_=(value: CFuncPtr1[Ptr[GtkAdjustment], Unit]): Unit = !struct.at2 = value
    def value_changed : CFuncPtr1[Ptr[GtkAdjustment], Unit] = struct._3
    def value_changed_=(value: CFuncPtr1[Ptr[GtkAdjustment], Unit]): Unit = !struct.at3 = value
    def _gtk_reserved1 : CFuncPtr0[Unit] = struct._4
    def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at4 = value
    def _gtk_reserved2 : CFuncPtr0[Unit] = struct._5
    def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at5 = value
    def _gtk_reserved3 : CFuncPtr0[Unit] = struct._6
    def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at6 = value
    def _gtk_reserved4 : CFuncPtr0[Unit] = struct._7
    def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at7 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkAlternativeTrigger = CStruct0
object GtkAlternativeTrigger:
  given _tag: Tag[GtkAlternativeTrigger] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkAlternativeTriggerClass = CStruct0
object GtkAlternativeTriggerClass:
  given _tag: Tag[GtkAlternativeTriggerClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type GtkAnyFilter = CStruct0
object GtkAnyFilter:
  given _tag: Tag[GtkAnyFilter] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type GtkAnyFilterClass = CStruct0
object GtkAnyFilterClass:
  given _tag: Tag[GtkAnyFilterClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkappchooser.h
*/
opaque type GtkAppChooser = CStruct0
object GtkAppChooser:
  given _tag: Tag[GtkAppChooser] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkappchooserbutton.h
*/
opaque type GtkAppChooserButton = CStruct0
object GtkAppChooserButton:
  given _tag: Tag[GtkAppChooserButton] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkappchooserdialog.h
*/
opaque type GtkAppChooserDialog = CStruct0
object GtkAppChooserDialog:
  given _tag: Tag[GtkAppChooserDialog] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkappchooserwidget.h
*/
opaque type GtkAppChooserWidget = CStruct0
object GtkAppChooserWidget:
  given _tag: Tag[GtkAppChooserWidget] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkapplication.h
*/
opaque type GtkApplication = CStruct1[_root_.gio.all.GApplication]
object GtkApplication:
  given _tag: Tag[GtkApplication] = Tag.materializeCStruct1Tag[_root_.gio.all.GApplication]
  def apply()(using Zone): Ptr[GtkApplication] = scala.scalanative.unsafe.alloc[GtkApplication](1)
  def apply(parent_instance : _root_.gio.all.GApplication)(using Zone): Ptr[GtkApplication] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkApplication)
    def parent_instance : _root_.gio.all.GApplication = struct._1
    def parent_instance_=(value: _root_.gio.all.GApplication): Unit = !struct.at1 = value

/**
 * GtkApplicationClass: _class: The parent class. _added: Signal emitted when a `GtkWindow` is added to application through gtk_application_add_window(). _removed: Signal emitted when a `GtkWindow` is removed from application, either as a side-effect of being destroyed or explicitly through gtk_application_remove_window().

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkapplication.h
*/
opaque type GtkApplicationClass = CStruct4[_root_.gio.all.GApplicationClass, CFuncPtr2[Ptr[GtkApplication], Ptr[GtkWindow], Unit], CFuncPtr2[Ptr[GtkApplication], Ptr[GtkWindow], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkApplicationClass:
  given _tag: Tag[GtkApplicationClass] = Tag.materializeCStruct4Tag[_root_.gio.all.GApplicationClass, CFuncPtr2[Ptr[GtkApplication], Ptr[GtkWindow], Unit], CFuncPtr2[Ptr[GtkApplication], Ptr[GtkWindow], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkApplicationClass] = scala.scalanative.unsafe.alloc[GtkApplicationClass](1)
  def apply(parent_class : _root_.gio.all.GApplicationClass, window_added : CFuncPtr2[Ptr[GtkApplication], Ptr[GtkWindow], Unit], window_removed : CFuncPtr2[Ptr[GtkApplication], Ptr[GtkWindow], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkApplicationClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).window_added = window_added
    (!____ptr).window_removed = window_removed
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkApplicationClass)
    def parent_class : _root_.gio.all.GApplicationClass = struct._1
    def parent_class_=(value: _root_.gio.all.GApplicationClass): Unit = !struct.at1 = value
    def window_added : CFuncPtr2[Ptr[GtkApplication], Ptr[GtkWindow], Unit] = struct._2
    def window_added_=(value: CFuncPtr2[Ptr[GtkApplication], Ptr[GtkWindow], Unit]): Unit = !struct.at2 = value
    def window_removed : CFuncPtr2[Ptr[GtkApplication], Ptr[GtkWindow], Unit] = struct._3
    def window_removed_=(value: CFuncPtr2[Ptr[GtkApplication], Ptr[GtkWindow], Unit]): Unit = !struct.at3 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._4
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at4 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkapplicationwindow.h
*/
opaque type GtkApplicationWindow = CStruct1[GtkWindow]
object GtkApplicationWindow:
  given _tag: Tag[GtkApplicationWindow] = Tag.materializeCStruct1Tag[GtkWindow]
  def apply()(using Zone): Ptr[GtkApplicationWindow] = scala.scalanative.unsafe.alloc[GtkApplicationWindow](1)
  def apply(parent_instance : GtkWindow)(using Zone): Ptr[GtkApplicationWindow] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkApplicationWindow)
    def parent_instance : GtkWindow = struct._1
    def parent_instance_=(value: GtkWindow): Unit = !struct.at1 = value

/**
 * GtkApplicationWindowClass: _class: The parent class.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkapplicationwindow.h
*/
opaque type GtkApplicationWindowClass = CStruct2[GtkWindowClass, CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkApplicationWindowClass:
  given _tag: Tag[GtkApplicationWindowClass] = Tag.materializeCStruct2Tag[GtkWindowClass, CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkApplicationWindowClass] = scala.scalanative.unsafe.alloc[GtkApplicationWindowClass](1)
  def apply(parent_class : GtkWindowClass, padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkApplicationWindowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkApplicationWindowClass)
    def parent_class : GtkWindowClass = struct._1
    def parent_class_=(value: GtkWindowClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._2
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkaspectframe.h
*/
opaque type GtkAspectFrame = CStruct0
object GtkAspectFrame:
  given _tag: Tag[GtkAspectFrame] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkassistant.h
*/
opaque type GtkAssistant = CStruct0
object GtkAssistant:
  given _tag: Tag[GtkAssistant] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkassistant.h
*/
opaque type GtkAssistantPage = CStruct0
object GtkAssistantPage:
  given _tag: Tag[GtkAssistantPage] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbinlayout.h
*/
opaque type GtkBinLayout = CStruct0
object GtkBinLayout:
  given _tag: Tag[GtkBinLayout] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbinlayout.h
*/
opaque type GtkBinLayoutClass = CStruct1[GtkLayoutManagerClass]
object GtkBinLayoutClass:
  given _tag: Tag[GtkBinLayoutClass] = Tag.materializeCStruct1Tag[GtkLayoutManagerClass]
  def apply()(using Zone): Ptr[GtkBinLayoutClass] = scala.scalanative.unsafe.alloc[GtkBinLayoutClass](1)
  def apply(parent_class : GtkLayoutManagerClass)(using Zone): Ptr[GtkBinLayoutClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkBinLayoutClass)
    def parent_class : GtkLayoutManagerClass = struct._1
    def parent_class_=(value: GtkLayoutManagerClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
opaque type GtkBitset = CStruct0
object GtkBitset:
  given _tag: Tag[GtkBitset] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbitset.h
*/
opaque type GtkBitsetIter = CStruct1[CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._0]]]
object GtkBitsetIter:
  given _tag: Tag[GtkBitsetIter] = Tag.materializeCStruct1Tag[CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._0]]]
  def apply()(using Zone): Ptr[GtkBitsetIter] = scala.scalanative.unsafe.alloc[GtkBitsetIter](1)
  def apply(private_data : CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._0]])(using Zone): Ptr[GtkBitsetIter] = 
    val ____ptr = apply()
    (!____ptr).private_data = private_data
    ____ptr
  extension (struct: GtkBitsetIter)
    def private_data : CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._0]] = struct._1
    def private_data_=(value: CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._0]]): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbookmarklist.h
*/
opaque type GtkBookmarkList = CStruct0
object GtkBookmarkList:
  given _tag: Tag[GtkBookmarkList] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbookmarklist.h
*/
opaque type GtkBookmarkListClass = CStruct1[_root_.gobject.all.GObjectClass]
object GtkBookmarkListClass:
  given _tag: Tag[GtkBookmarkListClass] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObjectClass]
  def apply()(using Zone): Ptr[GtkBookmarkListClass] = scala.scalanative.unsafe.alloc[GtkBookmarkListClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[GtkBookmarkListClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkBookmarkListClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkboolfilter.h
*/
opaque type GtkBoolFilter = CStruct0
object GtkBoolFilter:
  given _tag: Tag[GtkBoolFilter] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkboolfilter.h
*/
opaque type GtkBoolFilterClass = CStruct1[GtkFilterClass]
object GtkBoolFilterClass:
  given _tag: Tag[GtkBoolFilterClass] = Tag.materializeCStruct1Tag[GtkFilterClass]
  def apply()(using Zone): Ptr[GtkBoolFilterClass] = scala.scalanative.unsafe.alloc[GtkBoolFilterClass](1)
  def apply(parent_class : GtkFilterClass)(using Zone): Ptr[GtkBoolFilterClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkBoolFilterClass)
    def parent_class : GtkFilterClass = struct._1
    def parent_class_=(value: GtkFilterClass): Unit = !struct.at1 = value

/**
 * GtkBorder: : The width of the left border : The width of the right border : The width of the top border : The width of the bottom border

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkborder.h
*/
opaque type GtkBorder = CStruct4[_root_.glib.all.gint16, _root_.glib.all.gint16, _root_.glib.all.gint16, _root_.glib.all.gint16]
object GtkBorder:
  given _tag: Tag[GtkBorder] = Tag.materializeCStruct4Tag[_root_.glib.all.gint16, _root_.glib.all.gint16, _root_.glib.all.gint16, _root_.glib.all.gint16]
  def apply()(using Zone): Ptr[GtkBorder] = scala.scalanative.unsafe.alloc[GtkBorder](1)
  def apply(left : _root_.glib.all.gint16, right : _root_.glib.all.gint16, top : _root_.glib.all.gint16, bottom : _root_.glib.all.gint16)(using Zone): Ptr[GtkBorder] = 
    val ____ptr = apply()
    (!____ptr).left = left
    (!____ptr).right = right
    (!____ptr).top = top
    (!____ptr).bottom = bottom
    ____ptr
  extension (struct: GtkBorder)
    def left : _root_.glib.all.gint16 = struct._1
    def left_=(value: _root_.glib.all.gint16): Unit = !struct.at1 = value
    def right : _root_.glib.all.gint16 = struct._2
    def right_=(value: _root_.glib.all.gint16): Unit = !struct.at2 = value
    def top : _root_.glib.all.gint16 = struct._3
    def top_=(value: _root_.glib.all.gint16): Unit = !struct.at3 = value
    def bottom : _root_.glib.all.gint16 = struct._4
    def bottom_=(value: _root_.glib.all.gint16): Unit = !struct.at4 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbox.h
*/
opaque type GtkBox = CStruct1[GtkWidget]
object GtkBox:
  given _tag: Tag[GtkBox] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[GtkBox] = scala.scalanative.unsafe.alloc[GtkBox](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[GtkBox] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkBox)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * GtkBoxClass: _class: The parent class.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbox.h
*/
opaque type GtkBoxClass = CStruct2[GtkWidgetClass, CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkBoxClass:
  given _tag: Tag[GtkBoxClass] = Tag.materializeCStruct2Tag[GtkWidgetClass, CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkBoxClass] = scala.scalanative.unsafe.alloc[GtkBoxClass](1)
  def apply(parent_class : GtkWidgetClass, padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkBoxClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkBoxClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._2
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkboxlayout.h
*/
opaque type GtkBoxLayout = CStruct0
object GtkBoxLayout:
  given _tag: Tag[GtkBoxLayout] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkboxlayout.h
*/
opaque type GtkBoxLayoutClass = CStruct1[GtkLayoutManagerClass]
object GtkBoxLayoutClass:
  given _tag: Tag[GtkBoxLayoutClass] = Tag.materializeCStruct1Tag[GtkLayoutManagerClass]
  def apply()(using Zone): Ptr[GtkBoxLayoutClass] = scala.scalanative.unsafe.alloc[GtkBoxLayoutClass](1)
  def apply(parent_class : GtkLayoutManagerClass)(using Zone): Ptr[GtkBoxLayoutClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkBoxLayoutClass)
    def parent_class : GtkLayoutManagerClass = struct._1
    def parent_class_=(value: GtkLayoutManagerClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuildable.h
*/
opaque type GtkBuildable = CStruct0
object GtkBuildable:
  given _tag: Tag[GtkBuildable] = Tag.materializeCStruct0Tag

/**
 * GtkBuildableIface: _iface: the parent class

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuildable.h
*/
opaque type GtkBuildableIface = CStruct11[_root_.gobject.all.GTypeInterface, CFuncPtr2[Ptr[GtkBuildable], CString, Unit], CFuncPtr1[Ptr[GtkBuildable], CString], CFuncPtr4[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, Unit], CFuncPtr4[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.gobject.all.GValue], Unit], CFuncPtr3[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.gobject.all.GObject]], CFuncPtr6[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, Ptr[GtkBuildableParser], Ptr[_root_.glib.all.gpointer], _root_.glib.all.gboolean], CFuncPtr5[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, _root_.glib.all.gpointer, Unit], CFuncPtr5[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, _root_.glib.all.gpointer, Unit], CFuncPtr2[Ptr[GtkBuildable], Ptr[GtkBuilder], Unit], CFuncPtr3[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.gobject.all.GObject]]]
object GtkBuildableIface:
  given _tag: Tag[GtkBuildableIface] = Tag.materializeCStruct11Tag[_root_.gobject.all.GTypeInterface, CFuncPtr2[Ptr[GtkBuildable], CString, Unit], CFuncPtr1[Ptr[GtkBuildable], CString], CFuncPtr4[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, Unit], CFuncPtr4[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.gobject.all.GValue], Unit], CFuncPtr3[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.gobject.all.GObject]], CFuncPtr6[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, Ptr[GtkBuildableParser], Ptr[_root_.glib.all.gpointer], _root_.glib.all.gboolean], CFuncPtr5[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, _root_.glib.all.gpointer, Unit], CFuncPtr5[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, _root_.glib.all.gpointer, Unit], CFuncPtr2[Ptr[GtkBuildable], Ptr[GtkBuilder], Unit], CFuncPtr3[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.gobject.all.GObject]]]
  def apply()(using Zone): Ptr[GtkBuildableIface] = scala.scalanative.unsafe.alloc[GtkBuildableIface](1)
  def apply(g_iface : _root_.gobject.all.GTypeInterface, set_id : CFuncPtr2[Ptr[GtkBuildable], CString, Unit], get_id : CFuncPtr1[Ptr[GtkBuildable], CString], add_child : CFuncPtr4[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, Unit], set_buildable_property : CFuncPtr4[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.gobject.all.GValue], Unit], construct_child : CFuncPtr3[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.gobject.all.GObject]], custom_tag_start : CFuncPtr6[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, Ptr[GtkBuildableParser], Ptr[_root_.glib.all.gpointer], _root_.glib.all.gboolean], custom_tag_end : CFuncPtr5[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, _root_.glib.all.gpointer, Unit], custom_finished : CFuncPtr5[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, _root_.glib.all.gpointer, Unit], parser_finished : CFuncPtr2[Ptr[GtkBuildable], Ptr[GtkBuilder], Unit], get_internal_child : CFuncPtr3[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.gobject.all.GObject]])(using Zone): Ptr[GtkBuildableIface] = 
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).set_id = set_id
    (!____ptr).get_id = get_id
    (!____ptr).add_child = add_child
    (!____ptr).set_buildable_property = set_buildable_property
    (!____ptr).construct_child = construct_child
    (!____ptr).custom_tag_start = custom_tag_start
    (!____ptr).custom_tag_end = custom_tag_end
    (!____ptr).custom_finished = custom_finished
    (!____ptr).parser_finished = parser_finished
    (!____ptr).get_internal_child = get_internal_child
    ____ptr
  extension (struct: GtkBuildableIface)
    def g_iface : _root_.gobject.all.GTypeInterface = struct._1
    def g_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def set_id : CFuncPtr2[Ptr[GtkBuildable], CString, Unit] = struct._2
    def set_id_=(value: CFuncPtr2[Ptr[GtkBuildable], CString, Unit]): Unit = !struct.at2 = value
    def get_id : CFuncPtr1[Ptr[GtkBuildable], CString] = struct._3
    def get_id_=(value: CFuncPtr1[Ptr[GtkBuildable], CString]): Unit = !struct.at3 = value
    def add_child : CFuncPtr4[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, Unit] = struct._4
    def add_child_=(value: CFuncPtr4[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, Unit]): Unit = !struct.at4 = value
    def set_buildable_property : CFuncPtr4[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.gobject.all.GValue], Unit] = struct._5
    def set_buildable_property_=(value: CFuncPtr4[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.gobject.all.GValue], Unit]): Unit = !struct.at5 = value
    def construct_child : CFuncPtr3[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.gobject.all.GObject]] = struct._6
    def construct_child_=(value: CFuncPtr3[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.gobject.all.GObject]]): Unit = !struct.at6 = value
    def custom_tag_start : CFuncPtr6[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, Ptr[GtkBuildableParser], Ptr[_root_.glib.all.gpointer], _root_.glib.all.gboolean] = struct._7
    def custom_tag_start_=(value: CFuncPtr6[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, Ptr[GtkBuildableParser], Ptr[_root_.glib.all.gpointer], _root_.glib.all.gboolean]): Unit = !struct.at7 = value
    def custom_tag_end : CFuncPtr5[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, _root_.glib.all.gpointer, Unit] = struct._8
    def custom_tag_end_=(value: CFuncPtr5[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, _root_.glib.all.gpointer, Unit]): Unit = !struct.at8 = value
    def custom_finished : CFuncPtr5[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, _root_.glib.all.gpointer, Unit] = struct._9
    def custom_finished_=(value: CFuncPtr5[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, _root_.glib.all.gpointer, Unit]): Unit = !struct.at9 = value
    def parser_finished : CFuncPtr2[Ptr[GtkBuildable], Ptr[GtkBuilder], Unit] = struct._10
    def parser_finished_=(value: CFuncPtr2[Ptr[GtkBuildable], Ptr[GtkBuilder], Unit]): Unit = !struct.at10 = value
    def get_internal_child : CFuncPtr3[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.gobject.all.GObject]] = struct._11
    def get_internal_child_=(value: CFuncPtr3[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.gobject.all.GObject]]): Unit = !struct.at11 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuildable.h
*/
opaque type GtkBuildableParseContext = CStruct0
object GtkBuildableParseContext:
  given _tag: Tag[GtkBuildableParseContext] = Tag.materializeCStruct0Tag

/**
 * GtkBuildableParser: _element: function called for open elements _element: function called for close elements

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuildable.h
*/
opaque type GtkBuildableParser = CStruct5[CFuncPtr6[Ptr[GtkBuildableParseContext], CString, Ptr[CString], Ptr[CString], _root_.glib.all.gpointer, Ptr[Ptr[_root_.glib.all.GError]], Unit], CFuncPtr4[Ptr[GtkBuildableParseContext], CString, _root_.glib.all.gpointer, Ptr[Ptr[_root_.glib.all.GError]], Unit], CFuncPtr5[Ptr[GtkBuildableParseContext], CString, _root_.glib.all.gsize, _root_.glib.all.gpointer, Ptr[Ptr[_root_.glib.all.GError]], Unit], CFuncPtr3[Ptr[GtkBuildableParseContext], Ptr[_root_.glib.all.GError], _root_.glib.all.gpointer, Unit], CArray[_root_.glib.all.gpointer, Nat._4]]
object GtkBuildableParser:
  given _tag: Tag[GtkBuildableParser] = Tag.materializeCStruct5Tag[CFuncPtr6[Ptr[GtkBuildableParseContext], CString, Ptr[CString], Ptr[CString], _root_.glib.all.gpointer, Ptr[Ptr[_root_.glib.all.GError]], Unit], CFuncPtr4[Ptr[GtkBuildableParseContext], CString, _root_.glib.all.gpointer, Ptr[Ptr[_root_.glib.all.GError]], Unit], CFuncPtr5[Ptr[GtkBuildableParseContext], CString, _root_.glib.all.gsize, _root_.glib.all.gpointer, Ptr[Ptr[_root_.glib.all.GError]], Unit], CFuncPtr3[Ptr[GtkBuildableParseContext], Ptr[_root_.glib.all.GError], _root_.glib.all.gpointer, Unit], CArray[_root_.glib.all.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[GtkBuildableParser] = scala.scalanative.unsafe.alloc[GtkBuildableParser](1)
  def apply(start_element : CFuncPtr6[Ptr[GtkBuildableParseContext], CString, Ptr[CString], Ptr[CString], _root_.glib.all.gpointer, Ptr[Ptr[_root_.glib.all.GError]], Unit], end_element : CFuncPtr4[Ptr[GtkBuildableParseContext], CString, _root_.glib.all.gpointer, Ptr[Ptr[_root_.glib.all.GError]], Unit], text : CFuncPtr5[Ptr[GtkBuildableParseContext], CString, _root_.glib.all.gsize, _root_.glib.all.gpointer, Ptr[Ptr[_root_.glib.all.GError]], Unit], error : CFuncPtr3[Ptr[GtkBuildableParseContext], Ptr[_root_.glib.all.GError], _root_.glib.all.gpointer, Unit], padding : CArray[_root_.glib.all.gpointer, Nat._4])(using Zone): Ptr[GtkBuildableParser] = 
    val ____ptr = apply()
    (!____ptr).start_element = start_element
    (!____ptr).end_element = end_element
    (!____ptr).text = text
    (!____ptr).error = error
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkBuildableParser)
    def start_element : CFuncPtr6[Ptr[GtkBuildableParseContext], CString, Ptr[CString], Ptr[CString], _root_.glib.all.gpointer, Ptr[Ptr[_root_.glib.all.GError]], Unit] = struct._1
    def start_element_=(value: CFuncPtr6[Ptr[GtkBuildableParseContext], CString, Ptr[CString], Ptr[CString], _root_.glib.all.gpointer, Ptr[Ptr[_root_.glib.all.GError]], Unit]): Unit = !struct.at1 = value
    def end_element : CFuncPtr4[Ptr[GtkBuildableParseContext], CString, _root_.glib.all.gpointer, Ptr[Ptr[_root_.glib.all.GError]], Unit] = struct._2
    def end_element_=(value: CFuncPtr4[Ptr[GtkBuildableParseContext], CString, _root_.glib.all.gpointer, Ptr[Ptr[_root_.glib.all.GError]], Unit]): Unit = !struct.at2 = value
    def text : CFuncPtr5[Ptr[GtkBuildableParseContext], CString, _root_.glib.all.gsize, _root_.glib.all.gpointer, Ptr[Ptr[_root_.glib.all.GError]], Unit] = struct._3
    def text_=(value: CFuncPtr5[Ptr[GtkBuildableParseContext], CString, _root_.glib.all.gsize, _root_.glib.all.gpointer, Ptr[Ptr[_root_.glib.all.GError]], Unit]): Unit = !struct.at3 = value
    def error : CFuncPtr3[Ptr[GtkBuildableParseContext], Ptr[_root_.glib.all.GError], _root_.glib.all.gpointer, Unit] = struct._4
    def error_=(value: CFuncPtr3[Ptr[GtkBuildableParseContext], Ptr[_root_.glib.all.GError], _root_.glib.all.gpointer, Unit]): Unit = !struct.at4 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._4] = struct._5
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._4]): Unit = !struct.at5 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
opaque type GtkBuilder = CStruct0
object GtkBuilder:
  given _tag: Tag[GtkBuilder] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuilderscope.h
*/
opaque type GtkBuilderCScope = CStruct1[_root_.gobject.all.GObject]
object GtkBuilderCScope:
  given _tag: Tag[GtkBuilderCScope] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[GtkBuilderCScope] = scala.scalanative.unsafe.alloc[GtkBuilderCScope](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[GtkBuilderCScope] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkBuilderCScope)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuilderscope.h
*/
opaque type GtkBuilderCScopeClass = CStruct1[_root_.gobject.all.GObjectClass]
object GtkBuilderCScopeClass:
  given _tag: Tag[GtkBuilderCScopeClass] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObjectClass]
  def apply()(using Zone): Ptr[GtkBuilderCScopeClass] = scala.scalanative.unsafe.alloc[GtkBuilderCScopeClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[GtkBuilderCScopeClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkBuilderCScopeClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuilder.h
*/
opaque type GtkBuilderClass = CStruct0
object GtkBuilderClass:
  given _tag: Tag[GtkBuilderClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuilderlistitemfactory.h
*/
opaque type GtkBuilderListItemFactory = CStruct0
object GtkBuilderListItemFactory:
  given _tag: Tag[GtkBuilderListItemFactory] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuilderlistitemfactory.h
*/
opaque type GtkBuilderListItemFactoryClass = CStruct0
object GtkBuilderListItemFactoryClass:
  given _tag: Tag[GtkBuilderListItemFactoryClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
opaque type GtkBuilderScope = CStruct0
object GtkBuilderScope:
  given _tag: Tag[GtkBuilderScope] = Tag.materializeCStruct0Tag

/**
 * GtkBuilderScopeInterface: _type_from_name: Try to lookup a `GType` via the its name. See gtk_builder_get_type_from_name() for more details. The C implementation will use g_type_from_name() and if that fails try to guess the correct function name for registering the type and then use dlsym() to load it. The default implementation just tries g_type_from_name() and otherwise fails. _type_from_function: Try to lookup a `GType` via the given function name, specified explicitly in a GtkBuilder file, like via the "type-func" attribute in the "<object>" tag. This function is very rarely used. The C implementation will use dlsym() and call the resulting function as a `GTypeFunc`. The default implementation will fail and just return %G_TYPE_INVALID. _closure: Create a closure with the given arguments. See gtk_builder_create_closure() for more details on those. The C implementation will try to use dlsym() to locate the function name and then g_cclosure_new() to create a closure for the symbol. The default implementation just fails and returns %NULL.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuilderscope.h
*/
opaque type GtkBuilderScopeInterface = CStruct4[_root_.gobject.all.GTypeInterface, CFuncPtr3[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, _root_.gobject.all.GType], CFuncPtr3[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, _root_.gobject.all.GType], CFuncPtr6[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, GtkBuilderClosureFlags, Ptr[_root_.gobject.all.GObject], Ptr[Ptr[_root_.glib.all.GError]], Ptr[Byte]]]
object GtkBuilderScopeInterface:
  given _tag: Tag[GtkBuilderScopeInterface] = Tag.materializeCStruct4Tag[_root_.gobject.all.GTypeInterface, CFuncPtr3[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, _root_.gobject.all.GType], CFuncPtr3[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, _root_.gobject.all.GType], CFuncPtr6[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, GtkBuilderClosureFlags, Ptr[_root_.gobject.all.GObject], Ptr[Ptr[_root_.glib.all.GError]], Ptr[Byte]]]
  def apply()(using Zone): Ptr[GtkBuilderScopeInterface] = scala.scalanative.unsafe.alloc[GtkBuilderScopeInterface](1)
  def apply(g_iface : _root_.gobject.all.GTypeInterface, get_type_from_name : CFuncPtr3[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, _root_.gobject.all.GType], get_type_from_function : CFuncPtr3[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, _root_.gobject.all.GType], create_closure : CFuncPtr6[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, GtkBuilderClosureFlags, Ptr[_root_.gobject.all.GObject], Ptr[Ptr[_root_.glib.all.GError]], Ptr[_root_.gobject.all.GClosure]])(using Zone): Ptr[GtkBuilderScopeInterface] = 
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).get_type_from_name = get_type_from_name
    (!____ptr).get_type_from_function = get_type_from_function
    (!____ptr).create_closure = create_closure
    ____ptr
  extension (struct: GtkBuilderScopeInterface)
    def g_iface : _root_.gobject.all.GTypeInterface = struct._1
    def g_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def get_type_from_name : CFuncPtr3[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, _root_.gobject.all.GType] = struct._2
    def get_type_from_name_=(value: CFuncPtr3[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, _root_.gobject.all.GType]): Unit = !struct.at2 = value
    def get_type_from_function : CFuncPtr3[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, _root_.gobject.all.GType] = struct._3
    def get_type_from_function_=(value: CFuncPtr3[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, _root_.gobject.all.GType]): Unit = !struct.at3 = value
    def create_closure : CFuncPtr6[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, GtkBuilderClosureFlags, Ptr[_root_.gobject.all.GObject], Ptr[Ptr[_root_.glib.all.GError]], Ptr[_root_.gobject.all.GClosure]] = struct._4.asInstanceOf[CFuncPtr6[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, GtkBuilderClosureFlags, Ptr[_root_.gobject.all.GObject], Ptr[Ptr[_root_.glib.all.GError]], Ptr[_root_.gobject.all.GClosure]]]
    def create_closure_=(value: CFuncPtr6[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, GtkBuilderClosureFlags, Ptr[_root_.gobject.all.GObject], Ptr[Ptr[_root_.glib.all.GError]], Ptr[_root_.gobject.all.GClosure]]): Unit = !struct.at4 = value.asInstanceOf[CFuncPtr6[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, GtkBuilderClosureFlags, Ptr[_root_.gobject.all.GObject], Ptr[Ptr[_root_.glib.all.GError]], Ptr[Byte]]]

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbutton.h
*/
opaque type GtkButton = CStruct1[GtkWidget]
object GtkButton:
  given _tag: Tag[GtkButton] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[GtkButton] = scala.scalanative.unsafe.alloc[GtkButton](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[GtkButton] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkButton)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * GtkButtonClass: _class: The parent class. : Signal emitted when the button has been activated (pressed and released). : Signal that causes the button to animate press then release. Applications should never connect to this signal, but use the signal.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbutton.h
*/
opaque type GtkButtonClass = CStruct4[GtkWidgetClass, CFuncPtr1[Ptr[GtkButton], Unit], CFuncPtr1[Ptr[GtkButton], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkButtonClass:
  given _tag: Tag[GtkButtonClass] = Tag.materializeCStruct4Tag[GtkWidgetClass, CFuncPtr1[Ptr[GtkButton], Unit], CFuncPtr1[Ptr[GtkButton], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkButtonClass] = scala.scalanative.unsafe.alloc[GtkButtonClass](1)
  def apply(parent_class : GtkWidgetClass, clicked : CFuncPtr1[Ptr[GtkButton], Unit], activate : CFuncPtr1[Ptr[GtkButton], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkButtonClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).clicked = clicked
    (!____ptr).activate = activate
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkButtonClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def clicked : CFuncPtr1[Ptr[GtkButton], Unit] = struct._2
    def clicked_=(value: CFuncPtr1[Ptr[GtkButton], Unit]): Unit = !struct.at2 = value
    def activate : CFuncPtr1[Ptr[GtkButton], Unit] = struct._3
    def activate_=(value: CFuncPtr1[Ptr[GtkButton], Unit]): Unit = !struct.at3 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._4
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at4 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbutton.h
*/
opaque type GtkButtonPrivate = CStruct0
object GtkButtonPrivate:
  given _tag: Tag[GtkButtonPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkexpression.h
*/
opaque type GtkCClosureExpression = CStruct0
object GtkCClosureExpression:
  given _tag: Tag[GtkCClosureExpression] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcalendar.h
*/
opaque type GtkCalendar = CStruct0
object GtkCalendar:
  given _tag: Tag[GtkCalendar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkCallbackAction = CStruct0
object GtkCallbackAction:
  given _tag: Tag[GtkCallbackAction] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkCallbackActionClass = CStruct0
object GtkCallbackActionClass:
  given _tag: Tag[GtkCallbackActionClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellarea.h
*/
opaque type GtkCellArea = CStruct1[_root_.gobject.all.GInitiallyUnowned]
object GtkCellArea:
  given _tag: Tag[GtkCellArea] = Tag.materializeCStruct1Tag[_root_.gobject.all.GInitiallyUnowned]
  def apply()(using Zone): Ptr[GtkCellArea] = scala.scalanative.unsafe.alloc[GtkCellArea](1)
  def apply(parent_instance : _root_.gobject.all.GInitiallyUnowned)(using Zone): Ptr[GtkCellArea] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkCellArea)
    def parent_instance : _root_.gobject.all.GInitiallyUnowned = struct._1
    def parent_instance_=(value: _root_.gobject.all.GInitiallyUnowned): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellareabox.h
*/
opaque type GtkCellAreaBox = CStruct0
object GtkCellAreaBox:
  given _tag: Tag[GtkCellAreaBox] = Tag.materializeCStruct0Tag

/**
 * GtkCellAreaClass: : adds a `GtkCellRenderer` to the area. : removes a `GtkCellRenderer` from the area. : calls the `GtkCellCallback` function on every `GtkCellRenderer` in the area with the provided user data until the callback returns %TRUE. _alloc: Calls the `GtkCellAllocCallback` function on every `GtkCellRenderer` in the area with the allocated area for the cell and the provided user data until the callback returns %TRUE. : Handle an event in the area, this is generally used to activate a cell at the event location for button events but can also be used to generically pass events to `GtkWidget`s drawn onto the area. : Actually snapshot the area’s cells to the specified rectangle, _area should be correctly distributed to the cells corresponding background areas. _attributes: Apply the cell attributes to the cells. This is implemented as a signal and generally `GtkCellArea` subclasses don't need to implement it since it is handled by the base class. _context: Creates and returns a class specific `GtkCellAreaContext` to store cell alignment and allocation details for a said `GtkCellArea` class. _context: Creates a new `GtkCellAreaContext` in the same state as the passed with any cell alignment data and allocations intact. _request_mode: This allows an area to tell its layouting widget whether it prefers to be allocated in %GTK_SIZE_REQUEST_HEIGHT_FOR_WIDTH or %GTK_SIZE_REQUEST_WIDTH_FOR_HEIGHT mode. _preferred_width: Calculates the minimum and natural width of the areas cells with the current attributes applied while considering the particular layouting details of the said `GtkCellArea`. While requests are performed over a series of rows, alignments and overall minimum and natural sizes should be stored in the corresponding `GtkCellAreaContext`. _preferred_height_for_width: Calculates the minimum and natural height for the area if the passed would be allocated the given width. When implementing this virtual method it is safe to assume that has already stored the aligned cell widths for every `GtkTreeModel` row that will be allocated for since this information was stored at `GtkCellAreaClass.get_preferred_width()` time. This virtual method should also store any necessary alignments of cell heights for the case that the context is allocated a height. _preferred_height: Calculates the minimum and natural height of the areas cells with the current attributes applied. Essentially this is the same as `GtkCellAreaClass.get_preferred_width()` only for areas that are being requested as %GTK_SIZE_REQUEST_WIDTH_FOR_HEIGHT. _preferred_width_for_height: Calculates the minimum and natural width for the area if the passed would be allocated the given height. The same as `GtkCellAreaClass.get_preferred_height_for_width()` only for handling requests in the %GTK_SIZE_REQUEST_WIDTH_FOR_HEIGHT mode.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellarea.h
*/
opaque type GtkCellAreaClass = CStruct21[_root_.gobject.all.GInitiallyUnownedClass, CFuncPtr2[Ptr[GtkCellArea], Ptr[GtkCellRenderer], Unit], CFuncPtr2[Ptr[GtkCellArea], Ptr[GtkCellRenderer], Unit], CFuncPtr3[Ptr[GtkCellArea], GtkCellCallback, _root_.glib.all.gpointer, Unit], CFuncPtr7[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellAllocCallback, _root_.glib.all.gpointer, Unit], CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GdkEvent], Ptr[GdkRectangle], GtkCellRendererState, CInt], CFuncPtr8[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GtkSnapshot], Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, _root_.glib.all.gboolean, Unit], CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean, _root_.glib.all.gboolean, Unit], CFuncPtr1[Ptr[GtkCellArea], Ptr[GtkCellAreaContext]], CFuncPtr2[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkCellAreaContext]], CFuncPtr1[Ptr[GtkCellArea], GtkSizeRequestMode], CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit], CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit], CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellRenderer], _root_.glib.all.guint, Ptr[_root_.gobject.all.GValue], Ptr[_root_.gobject.all.GParamSpec], Unit], CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellRenderer], _root_.glib.all.guint, Ptr[_root_.gobject.all.GValue], Ptr[_root_.gobject.all.GParamSpec], Unit], CFuncPtr2[Ptr[GtkCellArea], GtkDirectionType, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkCellArea], _root_.glib.all.gboolean], CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GdkRectangle], GtkCellRendererState, _root_.glib.all.gboolean, _root_.glib.all.gboolean], CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkCellAreaClass:
  given _tag: Tag[GtkCellAreaClass] = Tag.materializeCStruct21Tag[_root_.gobject.all.GInitiallyUnownedClass, CFuncPtr2[Ptr[GtkCellArea], Ptr[GtkCellRenderer], Unit], CFuncPtr2[Ptr[GtkCellArea], Ptr[GtkCellRenderer], Unit], CFuncPtr3[Ptr[GtkCellArea], GtkCellCallback, _root_.glib.all.gpointer, Unit], CFuncPtr7[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellAllocCallback, _root_.glib.all.gpointer, Unit], CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GdkEvent], Ptr[GdkRectangle], GtkCellRendererState, CInt], CFuncPtr8[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GtkSnapshot], Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, _root_.glib.all.gboolean, Unit], CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean, _root_.glib.all.gboolean, Unit], CFuncPtr1[Ptr[GtkCellArea], Ptr[GtkCellAreaContext]], CFuncPtr2[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkCellAreaContext]], CFuncPtr1[Ptr[GtkCellArea], GtkSizeRequestMode], CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit], CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit], CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellRenderer], _root_.glib.all.guint, Ptr[_root_.gobject.all.GValue], Ptr[_root_.gobject.all.GParamSpec], Unit], CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellRenderer], _root_.glib.all.guint, Ptr[_root_.gobject.all.GValue], Ptr[_root_.gobject.all.GParamSpec], Unit], CFuncPtr2[Ptr[GtkCellArea], GtkDirectionType, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkCellArea], _root_.glib.all.gboolean], CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GdkRectangle], GtkCellRendererState, _root_.glib.all.gboolean, _root_.glib.all.gboolean], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkCellAreaClass] = scala.scalanative.unsafe.alloc[GtkCellAreaClass](1)
  def apply(parent_class : _root_.gobject.all.GInitiallyUnownedClass, add : CFuncPtr2[Ptr[GtkCellArea], Ptr[GtkCellRenderer], Unit], remove : CFuncPtr2[Ptr[GtkCellArea], Ptr[GtkCellRenderer], Unit], foreach : CFuncPtr3[Ptr[GtkCellArea], GtkCellCallback, _root_.glib.all.gpointer, Unit], foreach_alloc : CFuncPtr7[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellAllocCallback, _root_.glib.all.gpointer, Unit], event : CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GdkEvent], Ptr[GdkRectangle], GtkCellRendererState, CInt], snapshot : CFuncPtr8[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GtkSnapshot], Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, _root_.glib.all.gboolean, Unit], apply_attributes : CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean, _root_.glib.all.gboolean, Unit], create_context : CFuncPtr1[Ptr[GtkCellArea], Ptr[GtkCellAreaContext]], copy_context : CFuncPtr2[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkCellAreaContext]], get_request_mode : CFuncPtr1[Ptr[GtkCellArea], GtkSizeRequestMode], get_preferred_width : CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit], get_preferred_height_for_width : CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit], get_preferred_height : CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit], get_preferred_width_for_height : CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit], set_cell_property : CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellRenderer], _root_.glib.all.guint, Ptr[_root_.gobject.all.GValue], Ptr[_root_.gobject.all.GParamSpec], Unit], get_cell_property : CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellRenderer], _root_.glib.all.guint, Ptr[_root_.gobject.all.GValue], Ptr[_root_.gobject.all.GParamSpec], Unit], focus : CFuncPtr2[Ptr[GtkCellArea], GtkDirectionType, _root_.glib.all.gboolean], is_activatable : CFuncPtr1[Ptr[GtkCellArea], _root_.glib.all.gboolean], activate : CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GdkRectangle], GtkCellRendererState, _root_.glib.all.gboolean, _root_.glib.all.gboolean], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkCellAreaClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).add = add
    (!____ptr).remove = remove
    (!____ptr).foreach = foreach
    (!____ptr).foreach_alloc = foreach_alloc
    (!____ptr).event = event
    (!____ptr).snapshot = snapshot
    (!____ptr).apply_attributes = apply_attributes
    (!____ptr).create_context = create_context
    (!____ptr).copy_context = copy_context
    (!____ptr).get_request_mode = get_request_mode
    (!____ptr).get_preferred_width = get_preferred_width
    (!____ptr).get_preferred_height_for_width = get_preferred_height_for_width
    (!____ptr).get_preferred_height = get_preferred_height
    (!____ptr).get_preferred_width_for_height = get_preferred_width_for_height
    (!____ptr).set_cell_property = set_cell_property
    (!____ptr).get_cell_property = get_cell_property
    (!____ptr).focus = focus
    (!____ptr).is_activatable = is_activatable
    (!____ptr).activate = activate
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkCellAreaClass)
    def parent_class : _root_.gobject.all.GInitiallyUnownedClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GInitiallyUnownedClass): Unit = !struct.at1 = value
    def add : CFuncPtr2[Ptr[GtkCellArea], Ptr[GtkCellRenderer], Unit] = struct._2
    def add_=(value: CFuncPtr2[Ptr[GtkCellArea], Ptr[GtkCellRenderer], Unit]): Unit = !struct.at2 = value
    def remove : CFuncPtr2[Ptr[GtkCellArea], Ptr[GtkCellRenderer], Unit] = struct._3
    def remove_=(value: CFuncPtr2[Ptr[GtkCellArea], Ptr[GtkCellRenderer], Unit]): Unit = !struct.at3 = value
    def foreach : CFuncPtr3[Ptr[GtkCellArea], GtkCellCallback, _root_.glib.all.gpointer, Unit] = struct._4
    def foreach_=(value: CFuncPtr3[Ptr[GtkCellArea], GtkCellCallback, _root_.glib.all.gpointer, Unit]): Unit = !struct.at4 = value
    def foreach_alloc : CFuncPtr7[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellAllocCallback, _root_.glib.all.gpointer, Unit] = struct._5
    def foreach_alloc_=(value: CFuncPtr7[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellAllocCallback, _root_.glib.all.gpointer, Unit]): Unit = !struct.at5 = value
    def event : CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GdkEvent], Ptr[GdkRectangle], GtkCellRendererState, CInt] = struct._6
    def event_=(value: CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GdkEvent], Ptr[GdkRectangle], GtkCellRendererState, CInt]): Unit = !struct.at6 = value
    def snapshot : CFuncPtr8[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GtkSnapshot], Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, _root_.glib.all.gboolean, Unit] = struct._7
    def snapshot_=(value: CFuncPtr8[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GtkSnapshot], Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, _root_.glib.all.gboolean, Unit]): Unit = !struct.at7 = value
    def apply_attributes : CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean, _root_.glib.all.gboolean, Unit] = struct._8
    def apply_attributes_=(value: CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean, _root_.glib.all.gboolean, Unit]): Unit = !struct.at8 = value
    def create_context : CFuncPtr1[Ptr[GtkCellArea], Ptr[GtkCellAreaContext]] = struct._9
    def create_context_=(value: CFuncPtr1[Ptr[GtkCellArea], Ptr[GtkCellAreaContext]]): Unit = !struct.at9 = value
    def copy_context : CFuncPtr2[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkCellAreaContext]] = struct._10
    def copy_context_=(value: CFuncPtr2[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkCellAreaContext]]): Unit = !struct.at10 = value
    def get_request_mode : CFuncPtr1[Ptr[GtkCellArea], GtkSizeRequestMode] = struct._11
    def get_request_mode_=(value: CFuncPtr1[Ptr[GtkCellArea], GtkSizeRequestMode]): Unit = !struct.at11 = value
    def get_preferred_width : CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit] = struct._12
    def get_preferred_width_=(value: CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit]): Unit = !struct.at12 = value
    def get_preferred_height_for_width : CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit] = struct._13
    def get_preferred_height_for_width_=(value: CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit]): Unit = !struct.at13 = value
    def get_preferred_height : CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit] = struct._14
    def get_preferred_height_=(value: CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit]): Unit = !struct.at14 = value
    def get_preferred_width_for_height : CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit] = struct._15
    def get_preferred_width_for_height_=(value: CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit]): Unit = !struct.at15 = value
    def set_cell_property : CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellRenderer], _root_.glib.all.guint, Ptr[_root_.gobject.all.GValue], Ptr[_root_.gobject.all.GParamSpec], Unit] = struct._16
    def set_cell_property_=(value: CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellRenderer], _root_.glib.all.guint, Ptr[_root_.gobject.all.GValue], Ptr[_root_.gobject.all.GParamSpec], Unit]): Unit = !struct.at16 = value
    def get_cell_property : CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellRenderer], _root_.glib.all.guint, Ptr[_root_.gobject.all.GValue], Ptr[_root_.gobject.all.GParamSpec], Unit] = struct._17
    def get_cell_property_=(value: CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellRenderer], _root_.glib.all.guint, Ptr[_root_.gobject.all.GValue], Ptr[_root_.gobject.all.GParamSpec], Unit]): Unit = !struct.at17 = value
    def focus : CFuncPtr2[Ptr[GtkCellArea], GtkDirectionType, _root_.glib.all.gboolean] = struct._18
    def focus_=(value: CFuncPtr2[Ptr[GtkCellArea], GtkDirectionType, _root_.glib.all.gboolean]): Unit = !struct.at18 = value
    def is_activatable : CFuncPtr1[Ptr[GtkCellArea], _root_.glib.all.gboolean] = struct._19
    def is_activatable_=(value: CFuncPtr1[Ptr[GtkCellArea], _root_.glib.all.gboolean]): Unit = !struct.at19 = value
    def activate : CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GdkRectangle], GtkCellRendererState, _root_.glib.all.gboolean, _root_.glib.all.gboolean] = struct._20
    def activate_=(value: CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GdkRectangle], GtkCellRendererState, _root_.glib.all.gboolean, _root_.glib.all.gboolean]): Unit = !struct.at20 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._21
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at21 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellareacontext.h
*/
opaque type GtkCellAreaContext = CStruct1[_root_.gobject.all.GObject]
object GtkCellAreaContext:
  given _tag: Tag[GtkCellAreaContext] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[GtkCellAreaContext] = scala.scalanative.unsafe.alloc[GtkCellAreaContext](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[GtkCellAreaContext] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkCellAreaContext)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * GtkCellAreaContextClass: : This tells the context that an allocation width or height (or both) have been decided for a group of rows. The context should store any allocations for internally aligned cells at this point so that they dont need to be recalculated at gtk_cell_area_render() time. : Clear any previously stored information about requested and allocated sizes for the context. _preferred_height_for_width: Returns the aligned height for the given width that context must store while collecting sizes for it’s rows. _preferred_width_for_height: Returns the aligned width for the given height that context must store while collecting sizes for it’s rows.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellareacontext.h
*/
opaque type GtkCellAreaContextClass = CStruct6[_root_.gobject.all.GObjectClass, CFuncPtr3[Ptr[GtkCellAreaContext], CInt, CInt, Unit], CFuncPtr1[Ptr[GtkCellAreaContext], Unit], CFuncPtr4[Ptr[GtkCellAreaContext], CInt, Ptr[CInt], Ptr[CInt], Unit], CFuncPtr4[Ptr[GtkCellAreaContext], CInt, Ptr[CInt], Ptr[CInt], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkCellAreaContextClass:
  given _tag: Tag[GtkCellAreaContextClass] = Tag.materializeCStruct6Tag[_root_.gobject.all.GObjectClass, CFuncPtr3[Ptr[GtkCellAreaContext], CInt, CInt, Unit], CFuncPtr1[Ptr[GtkCellAreaContext], Unit], CFuncPtr4[Ptr[GtkCellAreaContext], CInt, Ptr[CInt], Ptr[CInt], Unit], CFuncPtr4[Ptr[GtkCellAreaContext], CInt, Ptr[CInt], Ptr[CInt], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkCellAreaContextClass] = scala.scalanative.unsafe.alloc[GtkCellAreaContextClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, allocate : CFuncPtr3[Ptr[GtkCellAreaContext], CInt, CInt, Unit], reset : CFuncPtr1[Ptr[GtkCellAreaContext], Unit], get_preferred_height_for_width : CFuncPtr4[Ptr[GtkCellAreaContext], CInt, Ptr[CInt], Ptr[CInt], Unit], get_preferred_width_for_height : CFuncPtr4[Ptr[GtkCellAreaContext], CInt, Ptr[CInt], Ptr[CInt], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkCellAreaContextClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).allocate = allocate
    (!____ptr).reset = reset
    (!____ptr).get_preferred_height_for_width = get_preferred_height_for_width
    (!____ptr).get_preferred_width_for_height = get_preferred_width_for_height
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkCellAreaContextClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def allocate : CFuncPtr3[Ptr[GtkCellAreaContext], CInt, CInt, Unit] = struct._2
    def allocate_=(value: CFuncPtr3[Ptr[GtkCellAreaContext], CInt, CInt, Unit]): Unit = !struct.at2 = value
    def reset : CFuncPtr1[Ptr[GtkCellAreaContext], Unit] = struct._3
    def reset_=(value: CFuncPtr1[Ptr[GtkCellAreaContext], Unit]): Unit = !struct.at3 = value
    def get_preferred_height_for_width : CFuncPtr4[Ptr[GtkCellAreaContext], CInt, Ptr[CInt], Ptr[CInt], Unit] = struct._4
    def get_preferred_height_for_width_=(value: CFuncPtr4[Ptr[GtkCellAreaContext], CInt, Ptr[CInt], Ptr[CInt], Unit]): Unit = !struct.at4 = value
    def get_preferred_width_for_height : CFuncPtr4[Ptr[GtkCellAreaContext], CInt, Ptr[CInt], Ptr[CInt], Unit] = struct._5
    def get_preferred_width_for_height_=(value: CFuncPtr4[Ptr[GtkCellAreaContext], CInt, Ptr[CInt], Ptr[CInt], Unit]): Unit = !struct.at5 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._6
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at6 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellareacontext.h
*/
opaque type GtkCellAreaContextPrivate = CStruct0
object GtkCellAreaContextPrivate:
  given _tag: Tag[GtkCellAreaContextPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcelleditable.h
*/
opaque type GtkCellEditable = CStruct0
object GtkCellEditable:
  given _tag: Tag[GtkCellEditable] = Tag.materializeCStruct0Tag

/**
 * GtkCellEditableIface: _done: Signal is a sign for the cell renderer to update its value from the cell_editable. _widget: Signal is meant to indicate that the cell is finished editing, and the widget may now be destroyed. _editing: Begins editing on a cell_editable.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcelleditable.h
*/
opaque type GtkCellEditableIface = CStruct4[_root_.gobject.all.GTypeInterface, CFuncPtr1[Ptr[GtkCellEditable], Unit], CFuncPtr1[Ptr[GtkCellEditable], Unit], CFuncPtr2[Ptr[GtkCellEditable], Ptr[GdkEvent], Unit]]
object GtkCellEditableIface:
  given _tag: Tag[GtkCellEditableIface] = Tag.materializeCStruct4Tag[_root_.gobject.all.GTypeInterface, CFuncPtr1[Ptr[GtkCellEditable], Unit], CFuncPtr1[Ptr[GtkCellEditable], Unit], CFuncPtr2[Ptr[GtkCellEditable], Ptr[GdkEvent], Unit]]
  def apply()(using Zone): Ptr[GtkCellEditableIface] = scala.scalanative.unsafe.alloc[GtkCellEditableIface](1)
  def apply(g_iface : _root_.gobject.all.GTypeInterface, editing_done : CFuncPtr1[Ptr[GtkCellEditable], Unit], remove_widget : CFuncPtr1[Ptr[GtkCellEditable], Unit], start_editing : CFuncPtr2[Ptr[GtkCellEditable], Ptr[GdkEvent], Unit])(using Zone): Ptr[GtkCellEditableIface] = 
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).editing_done = editing_done
    (!____ptr).remove_widget = remove_widget
    (!____ptr).start_editing = start_editing
    ____ptr
  extension (struct: GtkCellEditableIface)
    def g_iface : _root_.gobject.all.GTypeInterface = struct._1
    def g_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def editing_done : CFuncPtr1[Ptr[GtkCellEditable], Unit] = struct._2
    def editing_done_=(value: CFuncPtr1[Ptr[GtkCellEditable], Unit]): Unit = !struct.at2 = value
    def remove_widget : CFuncPtr1[Ptr[GtkCellEditable], Unit] = struct._3
    def remove_widget_=(value: CFuncPtr1[Ptr[GtkCellEditable], Unit]): Unit = !struct.at3 = value
    def start_editing : CFuncPtr2[Ptr[GtkCellEditable], Ptr[GdkEvent], Unit] = struct._4
    def start_editing_=(value: CFuncPtr2[Ptr[GtkCellEditable], Ptr[GdkEvent], Unit]): Unit = !struct.at4 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcelllayout.h
*/
opaque type GtkCellLayout = CStruct0
object GtkCellLayout:
  given _tag: Tag[GtkCellLayout] = Tag.materializeCStruct0Tag

/**
 * GtkCellLayoutIface: _start: Packs the cell into the beginning of cell_layout. _end: Adds the cell to the end of cell_layout. : Unsets all the mappings on all renderers on cell_layout and removes all renderers from cell_layout. _attribute: Adds an attribute mapping to the list in cell_layout.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcelllayout.h
*/
opaque type GtkCellLayoutIface = CStruct10[_root_.gobject.all.GTypeInterface, CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], _root_.glib.all.gboolean, Unit], CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], _root_.glib.all.gboolean, Unit], CFuncPtr1[Ptr[GtkCellLayout], Unit], CFuncPtr4[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], CString, CInt, Unit], CFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], GtkCellLayoutDataFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit], CFuncPtr2[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Unit], CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], CInt, Unit], CFuncPtr1[Ptr[GtkCellLayout], Ptr[Byte]], CFuncPtr1[Ptr[GtkCellLayout], Ptr[GtkCellArea]]]
object GtkCellLayoutIface:
  given _tag: Tag[GtkCellLayoutIface] = Tag.materializeCStruct10Tag[_root_.gobject.all.GTypeInterface, CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], _root_.glib.all.gboolean, Unit], CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], _root_.glib.all.gboolean, Unit], CFuncPtr1[Ptr[GtkCellLayout], Unit], CFuncPtr4[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], CString, CInt, Unit], CFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], GtkCellLayoutDataFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit], CFuncPtr2[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Unit], CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], CInt, Unit], CFuncPtr1[Ptr[GtkCellLayout], Ptr[Byte]], CFuncPtr1[Ptr[GtkCellLayout], Ptr[GtkCellArea]]]
  def apply()(using Zone): Ptr[GtkCellLayoutIface] = scala.scalanative.unsafe.alloc[GtkCellLayoutIface](1)
  def apply(g_iface : _root_.gobject.all.GTypeInterface, pack_start : CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], _root_.glib.all.gboolean, Unit], pack_end : CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], _root_.glib.all.gboolean, Unit], clear : CFuncPtr1[Ptr[GtkCellLayout], Unit], add_attribute : CFuncPtr4[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], CString, CInt, Unit], set_cell_data_func : CFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], GtkCellLayoutDataFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit], clear_attributes : CFuncPtr2[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Unit], reorder : CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], CInt, Unit], get_cells : CFuncPtr1[Ptr[GtkCellLayout], Ptr[_root_.glib.all.GList]], get_area : CFuncPtr1[Ptr[GtkCellLayout], Ptr[GtkCellArea]])(using Zone): Ptr[GtkCellLayoutIface] = 
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).pack_start = pack_start
    (!____ptr).pack_end = pack_end
    (!____ptr).clear = clear
    (!____ptr).add_attribute = add_attribute
    (!____ptr).set_cell_data_func = set_cell_data_func
    (!____ptr).clear_attributes = clear_attributes
    (!____ptr).reorder = reorder
    (!____ptr).get_cells = get_cells
    (!____ptr).get_area = get_area
    ____ptr
  extension (struct: GtkCellLayoutIface)
    def g_iface : _root_.gobject.all.GTypeInterface = struct._1
    def g_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def pack_start : CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], _root_.glib.all.gboolean, Unit] = struct._2
    def pack_start_=(value: CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], _root_.glib.all.gboolean, Unit]): Unit = !struct.at2 = value
    def pack_end : CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], _root_.glib.all.gboolean, Unit] = struct._3
    def pack_end_=(value: CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], _root_.glib.all.gboolean, Unit]): Unit = !struct.at3 = value
    def clear : CFuncPtr1[Ptr[GtkCellLayout], Unit] = struct._4
    def clear_=(value: CFuncPtr1[Ptr[GtkCellLayout], Unit]): Unit = !struct.at4 = value
    def add_attribute : CFuncPtr4[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], CString, CInt, Unit] = struct._5
    def add_attribute_=(value: CFuncPtr4[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], CString, CInt, Unit]): Unit = !struct.at5 = value
    def set_cell_data_func : CFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], GtkCellLayoutDataFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit] = struct._6
    def set_cell_data_func_=(value: CFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], GtkCellLayoutDataFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit]): Unit = !struct.at6 = value
    def clear_attributes : CFuncPtr2[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Unit] = struct._7
    def clear_attributes_=(value: CFuncPtr2[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Unit]): Unit = !struct.at7 = value
    def reorder : CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], CInt, Unit] = struct._8
    def reorder_=(value: CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], CInt, Unit]): Unit = !struct.at8 = value
    def get_cells : CFuncPtr1[Ptr[GtkCellLayout], Ptr[_root_.glib.all.GList]] = struct._9.asInstanceOf[CFuncPtr1[Ptr[GtkCellLayout], Ptr[_root_.glib.all.GList]]]
    def get_cells_=(value: CFuncPtr1[Ptr[GtkCellLayout], Ptr[_root_.glib.all.GList]]): Unit = !struct.at9 = value.asInstanceOf[CFuncPtr1[Ptr[GtkCellLayout], Ptr[Byte]]]
    def get_area : CFuncPtr1[Ptr[GtkCellLayout], Ptr[GtkCellArea]] = struct._10
    def get_area_=(value: CFuncPtr1[Ptr[GtkCellLayout], Ptr[GtkCellArea]]): Unit = !struct.at10 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellrenderer.h
*/
opaque type GtkCellRenderer = CStruct2[_root_.gobject.all.GInitiallyUnowned, Ptr[GtkCellRendererPrivate]]
object GtkCellRenderer:
  given _tag: Tag[GtkCellRenderer] = Tag.materializeCStruct2Tag[_root_.gobject.all.GInitiallyUnowned, Ptr[GtkCellRendererPrivate]]
  def apply()(using Zone): Ptr[GtkCellRenderer] = scala.scalanative.unsafe.alloc[GtkCellRenderer](1)
  def apply(parent_instance : _root_.gobject.all.GInitiallyUnowned, priv : Ptr[GtkCellRendererPrivate])(using Zone): Ptr[GtkCellRenderer] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr
  extension (struct: GtkCellRenderer)
    def parent_instance : _root_.gobject.all.GInitiallyUnowned = struct._1
    def parent_instance_=(value: _root_.gobject.all.GInitiallyUnowned): Unit = !struct.at1 = value
    def priv : Ptr[GtkCellRendererPrivate] = struct._2
    def priv_=(value: Ptr[GtkCellRendererPrivate]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellrendereraccel.h
*/
opaque type GtkCellRendererAccel = CStruct0
object GtkCellRendererAccel:
  given _tag: Tag[GtkCellRendererAccel] = Tag.materializeCStruct0Tag

/**
 * GtkCellRendererClass: _request_mode: Called to gets whether the cell renderer prefers a height-for-width layout or a width-for-height layout. _preferred_width: Called to get a renderer’s natural width. _preferred_height_for_width: Called to get a renderer’s natural height for width. _preferred_height: Called to get a renderer’s natural height. _preferred_width_for_height: Called to get a renderer’s natural width for height. _aligned_area: Called to get the aligned area used by inside _area. : Called to snapshot the content of the `GtkCellRenderer`. : Called to activate the content of the `GtkCellRenderer`. _editing: Called to initiate editing the content of the `GtkCellRenderer`. _canceled: Signal gets emitted when the user cancels the process of editing a cell. _started: Signal gets emitted when a cell starts to be edited.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellrenderer.h
*/
opaque type GtkCellRendererClass = CStruct13[_root_.gobject.all.GInitiallyUnownedClass, CFuncPtr1[Ptr[GtkCellRenderer], GtkSizeRequestMode], CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit], CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], GtkCellRendererState, Ptr[GdkRectangle], Ptr[GdkRectangle], Unit], CFuncPtr6[Ptr[GtkCellRenderer], Ptr[GtkSnapshot], Ptr[GtkWidget], Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, Unit], CFuncPtr7[Ptr[GtkCellRenderer], Ptr[GdkEvent], Ptr[GtkWidget], CString, Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, _root_.glib.all.gboolean], CFuncPtr7[Ptr[GtkCellRenderer], Ptr[GdkEvent], Ptr[GtkWidget], CString, Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, Ptr[GtkCellEditable]], CFuncPtr1[Ptr[GtkCellRenderer], Unit], CFuncPtr3[Ptr[GtkCellRenderer], Ptr[GtkCellEditable], CString, Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkCellRendererClass:
  given _tag: Tag[GtkCellRendererClass] = Tag.materializeCStruct13Tag[_root_.gobject.all.GInitiallyUnownedClass, CFuncPtr1[Ptr[GtkCellRenderer], GtkSizeRequestMode], CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit], CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], GtkCellRendererState, Ptr[GdkRectangle], Ptr[GdkRectangle], Unit], CFuncPtr6[Ptr[GtkCellRenderer], Ptr[GtkSnapshot], Ptr[GtkWidget], Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, Unit], CFuncPtr7[Ptr[GtkCellRenderer], Ptr[GdkEvent], Ptr[GtkWidget], CString, Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, _root_.glib.all.gboolean], CFuncPtr7[Ptr[GtkCellRenderer], Ptr[GdkEvent], Ptr[GtkWidget], CString, Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, Ptr[GtkCellEditable]], CFuncPtr1[Ptr[GtkCellRenderer], Unit], CFuncPtr3[Ptr[GtkCellRenderer], Ptr[GtkCellEditable], CString, Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkCellRendererClass] = scala.scalanative.unsafe.alloc[GtkCellRendererClass](1)
  def apply(parent_class : _root_.gobject.all.GInitiallyUnownedClass, get_request_mode : CFuncPtr1[Ptr[GtkCellRenderer], GtkSizeRequestMode], get_preferred_width : CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit], get_preferred_height_for_width : CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit], get_preferred_height : CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit], get_preferred_width_for_height : CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit], get_aligned_area : CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], GtkCellRendererState, Ptr[GdkRectangle], Ptr[GdkRectangle], Unit], snapshot : CFuncPtr6[Ptr[GtkCellRenderer], Ptr[GtkSnapshot], Ptr[GtkWidget], Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, Unit], activate : CFuncPtr7[Ptr[GtkCellRenderer], Ptr[GdkEvent], Ptr[GtkWidget], CString, Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, _root_.glib.all.gboolean], start_editing : CFuncPtr7[Ptr[GtkCellRenderer], Ptr[GdkEvent], Ptr[GtkWidget], CString, Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, Ptr[GtkCellEditable]], editing_canceled : CFuncPtr1[Ptr[GtkCellRenderer], Unit], editing_started : CFuncPtr3[Ptr[GtkCellRenderer], Ptr[GtkCellEditable], CString, Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkCellRendererClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).get_request_mode = get_request_mode
    (!____ptr).get_preferred_width = get_preferred_width
    (!____ptr).get_preferred_height_for_width = get_preferred_height_for_width
    (!____ptr).get_preferred_height = get_preferred_height
    (!____ptr).get_preferred_width_for_height = get_preferred_width_for_height
    (!____ptr).get_aligned_area = get_aligned_area
    (!____ptr).snapshot = snapshot
    (!____ptr).activate = activate
    (!____ptr).start_editing = start_editing
    (!____ptr).editing_canceled = editing_canceled
    (!____ptr).editing_started = editing_started
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkCellRendererClass)
    def parent_class : _root_.gobject.all.GInitiallyUnownedClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GInitiallyUnownedClass): Unit = !struct.at1 = value
    def get_request_mode : CFuncPtr1[Ptr[GtkCellRenderer], GtkSizeRequestMode] = struct._2
    def get_request_mode_=(value: CFuncPtr1[Ptr[GtkCellRenderer], GtkSizeRequestMode]): Unit = !struct.at2 = value
    def get_preferred_width : CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit] = struct._3
    def get_preferred_width_=(value: CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit]): Unit = !struct.at3 = value
    def get_preferred_height_for_width : CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit] = struct._4
    def get_preferred_height_for_width_=(value: CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit]): Unit = !struct.at4 = value
    def get_preferred_height : CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit] = struct._5
    def get_preferred_height_=(value: CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit]): Unit = !struct.at5 = value
    def get_preferred_width_for_height : CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit] = struct._6
    def get_preferred_width_for_height_=(value: CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit]): Unit = !struct.at6 = value
    def get_aligned_area : CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], GtkCellRendererState, Ptr[GdkRectangle], Ptr[GdkRectangle], Unit] = struct._7
    def get_aligned_area_=(value: CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], GtkCellRendererState, Ptr[GdkRectangle], Ptr[GdkRectangle], Unit]): Unit = !struct.at7 = value
    def snapshot : CFuncPtr6[Ptr[GtkCellRenderer], Ptr[GtkSnapshot], Ptr[GtkWidget], Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, Unit] = struct._8
    def snapshot_=(value: CFuncPtr6[Ptr[GtkCellRenderer], Ptr[GtkSnapshot], Ptr[GtkWidget], Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, Unit]): Unit = !struct.at8 = value
    def activate : CFuncPtr7[Ptr[GtkCellRenderer], Ptr[GdkEvent], Ptr[GtkWidget], CString, Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, _root_.glib.all.gboolean] = struct._9
    def activate_=(value: CFuncPtr7[Ptr[GtkCellRenderer], Ptr[GdkEvent], Ptr[GtkWidget], CString, Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, _root_.glib.all.gboolean]): Unit = !struct.at9 = value
    def start_editing : CFuncPtr7[Ptr[GtkCellRenderer], Ptr[GdkEvent], Ptr[GtkWidget], CString, Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, Ptr[GtkCellEditable]] = struct._10
    def start_editing_=(value: CFuncPtr7[Ptr[GtkCellRenderer], Ptr[GdkEvent], Ptr[GtkWidget], CString, Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, Ptr[GtkCellEditable]]): Unit = !struct.at10 = value
    def editing_canceled : CFuncPtr1[Ptr[GtkCellRenderer], Unit] = struct._11
    def editing_canceled_=(value: CFuncPtr1[Ptr[GtkCellRenderer], Unit]): Unit = !struct.at11 = value
    def editing_started : CFuncPtr3[Ptr[GtkCellRenderer], Ptr[GtkCellEditable], CString, Unit] = struct._12
    def editing_started_=(value: CFuncPtr3[Ptr[GtkCellRenderer], Ptr[GtkCellEditable], CString, Unit]): Unit = !struct.at12 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._13
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at13 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellrenderer.h
*/
opaque type GtkCellRendererClassPrivate = CStruct0
object GtkCellRendererClassPrivate:
  given _tag: Tag[GtkCellRendererClassPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellrenderercombo.h
*/
opaque type GtkCellRendererCombo = CStruct0
object GtkCellRendererCombo:
  given _tag: Tag[GtkCellRendererCombo] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellrendererpixbuf.h
*/
opaque type GtkCellRendererPixbuf = CStruct0
object GtkCellRendererPixbuf:
  given _tag: Tag[GtkCellRendererPixbuf] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellrenderer.h
*/
opaque type GtkCellRendererPrivate = CStruct0
object GtkCellRendererPrivate:
  given _tag: Tag[GtkCellRendererPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellrendererprogress.h
*/
opaque type GtkCellRendererProgress = CStruct0
object GtkCellRendererProgress:
  given _tag: Tag[GtkCellRendererProgress] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellrendererspin.h
*/
opaque type GtkCellRendererSpin = CStruct0
object GtkCellRendererSpin:
  given _tag: Tag[GtkCellRendererSpin] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellrendererspinner.h
*/
opaque type GtkCellRendererSpinner = CStruct0
object GtkCellRendererSpinner:
  given _tag: Tag[GtkCellRendererSpinner] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellrenderertext.h
*/
opaque type GtkCellRendererText = CStruct1[GtkCellRenderer]
object GtkCellRendererText:
  given _tag: Tag[GtkCellRendererText] = Tag.materializeCStruct1Tag[GtkCellRenderer]
  def apply()(using Zone): Ptr[GtkCellRendererText] = scala.scalanative.unsafe.alloc[GtkCellRendererText](1)
  def apply(parent : GtkCellRenderer)(using Zone): Ptr[GtkCellRendererText] = 
    val ____ptr = apply()
    (!____ptr).parent = parent
    ____ptr
  extension (struct: GtkCellRendererText)
    def parent : GtkCellRenderer = struct._1
    def parent_=(value: GtkCellRenderer): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellrenderertext.h
*/
opaque type GtkCellRendererTextClass = CStruct3[GtkCellRendererClass, CFuncPtr3[Ptr[GtkCellRendererText], CString, CString, Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkCellRendererTextClass:
  given _tag: Tag[GtkCellRendererTextClass] = Tag.materializeCStruct3Tag[GtkCellRendererClass, CFuncPtr3[Ptr[GtkCellRendererText], CString, CString, Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkCellRendererTextClass] = scala.scalanative.unsafe.alloc[GtkCellRendererTextClass](1)
  def apply(parent_class : GtkCellRendererClass, edited : CFuncPtr3[Ptr[GtkCellRendererText], CString, CString, Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkCellRendererTextClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).edited = edited
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkCellRendererTextClass)
    def parent_class : GtkCellRendererClass = struct._1
    def parent_class_=(value: GtkCellRendererClass): Unit = !struct.at1 = value
    def edited : CFuncPtr3[Ptr[GtkCellRendererText], CString, CString, Unit] = struct._2
    def edited_=(value: CFuncPtr3[Ptr[GtkCellRendererText], CString, CString, Unit]): Unit = !struct.at2 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._3
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellrenderertoggle.h
*/
opaque type GtkCellRendererToggle = CStruct0
object GtkCellRendererToggle:
  given _tag: Tag[GtkCellRendererToggle] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellview.h
*/
opaque type GtkCellView = CStruct0
object GtkCellView:
  given _tag: Tag[GtkCellView] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcenterbox.h
*/
opaque type GtkCenterBox = CStruct0
object GtkCenterBox:
  given _tag: Tag[GtkCenterBox] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcenterbox.h
*/
opaque type GtkCenterBoxClass = CStruct0
object GtkCenterBoxClass:
  given _tag: Tag[GtkCenterBoxClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcenterlayout.h
*/
opaque type GtkCenterLayout = CStruct0
object GtkCenterLayout:
  given _tag: Tag[GtkCenterLayout] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcenterlayout.h
*/
opaque type GtkCenterLayoutClass = CStruct1[GtkLayoutManagerClass]
object GtkCenterLayoutClass:
  given _tag: Tag[GtkCenterLayoutClass] = Tag.materializeCStruct1Tag[GtkLayoutManagerClass]
  def apply()(using Zone): Ptr[GtkCenterLayoutClass] = scala.scalanative.unsafe.alloc[GtkCenterLayoutClass](1)
  def apply(parent_class : GtkLayoutManagerClass)(using Zone): Ptr[GtkCenterLayoutClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkCenterLayoutClass)
    def parent_class : GtkLayoutManagerClass = struct._1
    def parent_class_=(value: GtkLayoutManagerClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcheckbutton.h
*/
opaque type GtkCheckButton = CStruct1[GtkWidget]
object GtkCheckButton:
  given _tag: Tag[GtkCheckButton] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[GtkCheckButton] = scala.scalanative.unsafe.alloc[GtkCheckButton](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[GtkCheckButton] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkCheckButton)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcheckbutton.h
*/
opaque type GtkCheckButtonClass = CStruct4[GtkWidgetClass, CFuncPtr1[Ptr[GtkCheckButton], Unit], CFuncPtr1[Ptr[GtkCheckButton], Unit], CArray[_root_.glib.all.gpointer, Nat._7]]
object GtkCheckButtonClass:
  given _tag: Tag[GtkCheckButtonClass] = Tag.materializeCStruct4Tag[GtkWidgetClass, CFuncPtr1[Ptr[GtkCheckButton], Unit], CFuncPtr1[Ptr[GtkCheckButton], Unit], CArray[_root_.glib.all.gpointer, Nat._7]]
  def apply()(using Zone): Ptr[GtkCheckButtonClass] = scala.scalanative.unsafe.alloc[GtkCheckButtonClass](1)
  def apply(parent_class : GtkWidgetClass, toggled : CFuncPtr1[Ptr[GtkCheckButton], Unit], activate : CFuncPtr1[Ptr[GtkCheckButton], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._7])(using Zone): Ptr[GtkCheckButtonClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).toggled = toggled
    (!____ptr).activate = activate
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkCheckButtonClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def toggled : CFuncPtr1[Ptr[GtkCheckButton], Unit] = struct._2
    def toggled_=(value: CFuncPtr1[Ptr[GtkCheckButton], Unit]): Unit = !struct.at2 = value
    def activate : CFuncPtr1[Ptr[GtkCheckButton], Unit] = struct._3
    def activate_=(value: CFuncPtr1[Ptr[GtkCheckButton], Unit]): Unit = !struct.at3 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._7] = struct._4
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._7]): Unit = !struct.at4 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkexpression.h
*/
opaque type GtkClosureExpression = CStruct0
object GtkClosureExpression:
  given _tag: Tag[GtkClosureExpression] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcolorbutton.h
*/
opaque type GtkColorButton = CStruct0
object GtkColorButton:
  given _tag: Tag[GtkColorButton] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcolorchooser.h
*/
opaque type GtkColorChooser = CStruct0
object GtkColorChooser:
  given _tag: Tag[GtkColorChooser] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcolorchooserdialog.h
*/
opaque type GtkColorChooserDialog = CStruct0
object GtkColorChooserDialog:
  given _tag: Tag[GtkColorChooserDialog] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcolorchooser.h
*/
opaque type GtkColorChooserInterface = CStruct6[_root_.gobject.all.GTypeInterface, CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit], CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit], CFuncPtr5[Ptr[GtkColorChooser], GtkOrientation, CInt, CInt, Ptr[GdkRGBA], Unit], CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit], CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._2]]]
object GtkColorChooserInterface:
  given _tag: Tag[GtkColorChooserInterface] = Tag.materializeCStruct6Tag[_root_.gobject.all.GTypeInterface, CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit], CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit], CFuncPtr5[Ptr[GtkColorChooser], GtkOrientation, CInt, CInt, Ptr[GdkRGBA], Unit], CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit], CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._2]]]
  def apply()(using Zone): Ptr[GtkColorChooserInterface] = scala.scalanative.unsafe.alloc[GtkColorChooserInterface](1)
  def apply(base_interface : _root_.gobject.all.GTypeInterface, get_rgba : CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit], set_rgba : CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit], add_palette : CFuncPtr5[Ptr[GtkColorChooser], GtkOrientation, CInt, CInt, Ptr[GdkRGBA], Unit], color_activated : CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit], padding : CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._2]])(using Zone): Ptr[GtkColorChooserInterface] = 
    val ____ptr = apply()
    (!____ptr).base_interface = base_interface
    (!____ptr).get_rgba = get_rgba
    (!____ptr).set_rgba = set_rgba
    (!____ptr).add_palette = add_palette
    (!____ptr).color_activated = color_activated
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkColorChooserInterface)
    def base_interface : _root_.gobject.all.GTypeInterface = struct._1
    def base_interface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def get_rgba : CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit] = struct._2
    def get_rgba_=(value: CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit]): Unit = !struct.at2 = value
    def set_rgba : CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit] = struct._3
    def set_rgba_=(value: CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit]): Unit = !struct.at3 = value
    def add_palette : CFuncPtr5[Ptr[GtkColorChooser], GtkOrientation, CInt, CInt, Ptr[GdkRGBA], Unit] = struct._4
    def add_palette_=(value: CFuncPtr5[Ptr[GtkColorChooser], GtkOrientation, CInt, CInt, Ptr[GdkRGBA], Unit]): Unit = !struct.at4 = value
    def color_activated : CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit] = struct._5
    def color_activated_=(value: CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit]): Unit = !struct.at5 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._2]] = struct._6
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._2]]): Unit = !struct.at6 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcolorchooserwidget.h
*/
opaque type GtkColorChooserWidget = CStruct0
object GtkColorChooserWidget:
  given _tag: Tag[GtkColorChooserWidget] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcolumnview.h
*/
opaque type GtkColumnView = CStruct0
object GtkColumnView:
  given _tag: Tag[GtkColumnView] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcolumnview.h
*/
opaque type GtkColumnViewClass = CStruct0
object GtkColumnViewClass:
  given _tag: Tag[GtkColumnViewClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcolumnview.h
*/
opaque type GtkColumnViewColumn = CStruct0
object GtkColumnViewColumn:
  given _tag: Tag[GtkColumnViewColumn] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcolumnviewcolumn.h
*/
opaque type GtkColumnViewColumnClass = CStruct0
object GtkColumnViewColumnClass:
  given _tag: Tag[GtkColumnViewColumnClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcombobox.h
*/
opaque type GtkComboBox = CStruct1[GtkWidget]
object GtkComboBox:
  given _tag: Tag[GtkComboBox] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[GtkComboBox] = scala.scalanative.unsafe.alloc[GtkComboBox](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[GtkComboBox] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkComboBox)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * GtkComboBoxClass: _class: The parent class. : Signal is emitted when the active item is changed. _entry_text: Signal which allows you to change how the text displayed in a combo box’s entry is displayed.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcombobox.h
*/
opaque type GtkComboBoxClass = CStruct5[GtkWidgetClass, CFuncPtr1[Ptr[GtkComboBox], Unit], CFuncPtr2[Ptr[GtkComboBox], CString, CString], CFuncPtr1[Ptr[GtkComboBox], Unit], CArray[_root_.glib.all.gpointer, Nat._7]]
object GtkComboBoxClass:
  given _tag: Tag[GtkComboBoxClass] = Tag.materializeCStruct5Tag[GtkWidgetClass, CFuncPtr1[Ptr[GtkComboBox], Unit], CFuncPtr2[Ptr[GtkComboBox], CString, CString], CFuncPtr1[Ptr[GtkComboBox], Unit], CArray[_root_.glib.all.gpointer, Nat._7]]
  def apply()(using Zone): Ptr[GtkComboBoxClass] = scala.scalanative.unsafe.alloc[GtkComboBoxClass](1)
  def apply(parent_class : GtkWidgetClass, changed : CFuncPtr1[Ptr[GtkComboBox], Unit], format_entry_text : CFuncPtr2[Ptr[GtkComboBox], CString, CString], activate : CFuncPtr1[Ptr[GtkComboBox], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._7])(using Zone): Ptr[GtkComboBoxClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).changed = changed
    (!____ptr).format_entry_text = format_entry_text
    (!____ptr).activate = activate
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkComboBoxClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def changed : CFuncPtr1[Ptr[GtkComboBox], Unit] = struct._2
    def changed_=(value: CFuncPtr1[Ptr[GtkComboBox], Unit]): Unit = !struct.at2 = value
    def format_entry_text : CFuncPtr2[Ptr[GtkComboBox], CString, CString] = struct._3
    def format_entry_text_=(value: CFuncPtr2[Ptr[GtkComboBox], CString, CString]): Unit = !struct.at3 = value
    def activate : CFuncPtr1[Ptr[GtkComboBox], Unit] = struct._4
    def activate_=(value: CFuncPtr1[Ptr[GtkComboBox], Unit]): Unit = !struct.at4 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._7] = struct._5
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._7]): Unit = !struct.at5 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcomboboxtext.h
*/
opaque type GtkComboBoxText = CStruct0
object GtkComboBoxText:
  given _tag: Tag[GtkComboBoxText] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkexpression.h
*/
opaque type GtkConstantExpression = CStruct0
object GtkConstantExpression:
  given _tag: Tag[GtkConstantExpression] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraint.h
*/
opaque type GtkConstraint = CStruct0
object GtkConstraint:
  given _tag: Tag[GtkConstraint] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraint.h
*/
opaque type GtkConstraintClass = CStruct1[_root_.gobject.all.GObjectClass]
object GtkConstraintClass:
  given _tag: Tag[GtkConstraintClass] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObjectClass]
  def apply()(using Zone): Ptr[GtkConstraintClass] = scala.scalanative.unsafe.alloc[GtkConstraintClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[GtkConstraintClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkConstraintClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintguide.h
*/
opaque type GtkConstraintGuide = CStruct0
object GtkConstraintGuide:
  given _tag: Tag[GtkConstraintGuide] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintguide.h
*/
opaque type GtkConstraintGuideClass = CStruct1[_root_.gobject.all.GObjectClass]
object GtkConstraintGuideClass:
  given _tag: Tag[GtkConstraintGuideClass] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObjectClass]
  def apply()(using Zone): Ptr[GtkConstraintGuideClass] = scala.scalanative.unsafe.alloc[GtkConstraintGuideClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[GtkConstraintGuideClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkConstraintGuideClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintlayout.h
*/
opaque type GtkConstraintLayout = CStruct0
object GtkConstraintLayout:
  given _tag: Tag[GtkConstraintLayout] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintlayout.h
*/
opaque type GtkConstraintLayoutChild = CStruct0
object GtkConstraintLayoutChild:
  given _tag: Tag[GtkConstraintLayoutChild] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintlayout.h
*/
opaque type GtkConstraintLayoutChildClass = CStruct1[GtkLayoutChildClass]
object GtkConstraintLayoutChildClass:
  given _tag: Tag[GtkConstraintLayoutChildClass] = Tag.materializeCStruct1Tag[GtkLayoutChildClass]
  def apply()(using Zone): Ptr[GtkConstraintLayoutChildClass] = scala.scalanative.unsafe.alloc[GtkConstraintLayoutChildClass](1)
  def apply(parent_class : GtkLayoutChildClass)(using Zone): Ptr[GtkConstraintLayoutChildClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkConstraintLayoutChildClass)
    def parent_class : GtkLayoutChildClass = struct._1
    def parent_class_=(value: GtkLayoutChildClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintlayout.h
*/
opaque type GtkConstraintLayoutClass = CStruct1[GtkLayoutManagerClass]
object GtkConstraintLayoutClass:
  given _tag: Tag[GtkConstraintLayoutClass] = Tag.materializeCStruct1Tag[GtkLayoutManagerClass]
  def apply()(using Zone): Ptr[GtkConstraintLayoutClass] = scala.scalanative.unsafe.alloc[GtkConstraintLayoutClass](1)
  def apply(parent_class : GtkLayoutManagerClass)(using Zone): Ptr[GtkConstraintLayoutClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkConstraintLayoutClass)
    def parent_class : GtkLayoutManagerClass = struct._1
    def parent_class_=(value: GtkLayoutManagerClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraint.h
*/
opaque type GtkConstraintTarget = CStruct0
object GtkConstraintTarget:
  given _tag: Tag[GtkConstraintTarget] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraint.h
*/
opaque type GtkConstraintTargetInterface = CStruct0
object GtkConstraintTargetInterface:
  given _tag: Tag[GtkConstraintTargetInterface] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/css/gtkcsslocation.h
*/
opaque type GtkCssLocation = CStruct5[_root_.glib.all.gsize, _root_.glib.all.gsize, _root_.glib.all.gsize, _root_.glib.all.gsize, _root_.glib.all.gsize]
object GtkCssLocation:
  given _tag: Tag[GtkCssLocation] = Tag.materializeCStruct5Tag[_root_.glib.all.gsize, _root_.glib.all.gsize, _root_.glib.all.gsize, _root_.glib.all.gsize, _root_.glib.all.gsize]
  def apply()(using Zone): Ptr[GtkCssLocation] = scala.scalanative.unsafe.alloc[GtkCssLocation](1)
  def apply(bytes : _root_.glib.all.gsize, chars : _root_.glib.all.gsize, lines : _root_.glib.all.gsize, line_bytes : _root_.glib.all.gsize, line_chars : _root_.glib.all.gsize)(using Zone): Ptr[GtkCssLocation] = 
    val ____ptr = apply()
    (!____ptr).bytes = bytes
    (!____ptr).chars = chars
    (!____ptr).lines = lines
    (!____ptr).line_bytes = line_bytes
    (!____ptr).line_chars = line_chars
    ____ptr
  extension (struct: GtkCssLocation)
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
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcssprovider.h
*/
opaque type GtkCssProvider = CStruct1[_root_.gobject.all.GObject]
object GtkCssProvider:
  given _tag: Tag[GtkCssProvider] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[GtkCssProvider] = scala.scalanative.unsafe.alloc[GtkCssProvider](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[GtkCssProvider] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkCssProvider)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcssprovider.h
*/
opaque type GtkCssProviderClass = CStruct0
object GtkCssProviderClass:
  given _tag: Tag[GtkCssProviderClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcssprovider.h
*/
opaque type GtkCssProviderPrivate = CStruct0
object GtkCssProviderPrivate:
  given _tag: Tag[GtkCssProviderPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/css/gtkcsssection.h
*/
opaque type GtkCssSection = CStruct0
object GtkCssSection:
  given _tag: Tag[GtkCssSection] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
opaque type GtkCssStyleChange = CStruct0
object GtkCssStyleChange:
  given _tag: Tag[GtkCssStyleChange] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomfilter.h
*/
opaque type GtkCustomFilter = CStruct0
object GtkCustomFilter:
  given _tag: Tag[GtkCustomFilter] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomfilter.h
*/
opaque type GtkCustomFilterClass = CStruct1[GtkFilterClass]
object GtkCustomFilterClass:
  given _tag: Tag[GtkCustomFilterClass] = Tag.materializeCStruct1Tag[GtkFilterClass]
  def apply()(using Zone): Ptr[GtkCustomFilterClass] = scala.scalanative.unsafe.alloc[GtkCustomFilterClass](1)
  def apply(parent_class : GtkFilterClass)(using Zone): Ptr[GtkCustomFilterClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkCustomFilterClass)
    def parent_class : GtkFilterClass = struct._1
    def parent_class_=(value: GtkFilterClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomlayout.h
*/
opaque type GtkCustomLayout = CStruct0
object GtkCustomLayout:
  given _tag: Tag[GtkCustomLayout] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomlayout.h
*/
opaque type GtkCustomLayoutClass = CStruct1[GtkLayoutManagerClass]
object GtkCustomLayoutClass:
  given _tag: Tag[GtkCustomLayoutClass] = Tag.materializeCStruct1Tag[GtkLayoutManagerClass]
  def apply()(using Zone): Ptr[GtkCustomLayoutClass] = scala.scalanative.unsafe.alloc[GtkCustomLayoutClass](1)
  def apply(parent_class : GtkLayoutManagerClass)(using Zone): Ptr[GtkCustomLayoutClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkCustomLayoutClass)
    def parent_class : GtkLayoutManagerClass = struct._1
    def parent_class_=(value: GtkLayoutManagerClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomsorter.h
*/
opaque type GtkCustomSorter = CStruct0
object GtkCustomSorter:
  given _tag: Tag[GtkCustomSorter] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomsorter.h
*/
opaque type GtkCustomSorterClass = CStruct1[GtkSorterClass]
object GtkCustomSorterClass:
  given _tag: Tag[GtkCustomSorterClass] = Tag.materializeCStruct1Tag[GtkSorterClass]
  def apply()(using Zone): Ptr[GtkCustomSorterClass] = scala.scalanative.unsafe.alloc[GtkCustomSorterClass](1)
  def apply(parent_class : GtkSorterClass)(using Zone): Ptr[GtkCustomSorterClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkCustomSorterClass)
    def parent_class : GtkSorterClass = struct._1
    def parent_class_=(value: GtkSorterClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdialog.h
*/
opaque type GtkDialog = CStruct1[GtkWindow]
object GtkDialog:
  given _tag: Tag[GtkDialog] = Tag.materializeCStruct1Tag[GtkWindow]
  def apply()(using Zone): Ptr[GtkDialog] = scala.scalanative.unsafe.alloc[GtkDialog](1)
  def apply(parent_instance : GtkWindow)(using Zone): Ptr[GtkDialog] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkDialog)
    def parent_instance : GtkWindow = struct._1
    def parent_instance_=(value: GtkWindow): Unit = !struct.at1 = value

/**
 * GtkDialogClass: _class: The parent class. : Signal emitted when an action widget is activated. : Signal emitted when the user uses a keybinding to close the dialog.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdialog.h
*/
opaque type GtkDialogClass = CStruct4[GtkWindowClass, CFuncPtr2[Ptr[GtkDialog], CInt, Unit], CFuncPtr1[Ptr[GtkDialog], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkDialogClass:
  given _tag: Tag[GtkDialogClass] = Tag.materializeCStruct4Tag[GtkWindowClass, CFuncPtr2[Ptr[GtkDialog], CInt, Unit], CFuncPtr1[Ptr[GtkDialog], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkDialogClass] = scala.scalanative.unsafe.alloc[GtkDialogClass](1)
  def apply(parent_class : GtkWindowClass, response : CFuncPtr2[Ptr[GtkDialog], CInt, Unit], close : CFuncPtr1[Ptr[GtkDialog], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkDialogClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).response = response
    (!____ptr).close = close
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkDialogClass)
    def parent_class : GtkWindowClass = struct._1
    def parent_class_=(value: GtkWindowClass): Unit = !struct.at1 = value
    def response : CFuncPtr2[Ptr[GtkDialog], CInt, Unit] = struct._2
    def response_=(value: CFuncPtr2[Ptr[GtkDialog], CInt, Unit]): Unit = !struct.at2 = value
    def close : CFuncPtr1[Ptr[GtkDialog], Unit] = struct._3
    def close_=(value: CFuncPtr1[Ptr[GtkDialog], Unit]): Unit = !struct.at3 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._4
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at4 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdirectorylist.h
*/
opaque type GtkDirectoryList = CStruct0
object GtkDirectoryList:
  given _tag: Tag[GtkDirectoryList] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdirectorylist.h
*/
opaque type GtkDirectoryListClass = CStruct1[_root_.gobject.all.GObjectClass]
object GtkDirectoryListClass:
  given _tag: Tag[GtkDirectoryListClass] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObjectClass]
  def apply()(using Zone): Ptr[GtkDirectoryListClass] = scala.scalanative.unsafe.alloc[GtkDirectoryListClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[GtkDirectoryListClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkDirectoryListClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdragicon.h
*/
opaque type GtkDragIcon = CStruct0
object GtkDragIcon:
  given _tag: Tag[GtkDragIcon] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdragicon.h
*/
opaque type GtkDragIconClass = CStruct1[GtkWidgetClass]
object GtkDragIconClass:
  given _tag: Tag[GtkDragIconClass] = Tag.materializeCStruct1Tag[GtkWidgetClass]
  def apply()(using Zone): Ptr[GtkDragIconClass] = scala.scalanative.unsafe.alloc[GtkDragIconClass](1)
  def apply(parent_class : GtkWidgetClass)(using Zone): Ptr[GtkDragIconClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkDragIconClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdragsource.h
*/
opaque type GtkDragSource = CStruct0
object GtkDragSource:
  given _tag: Tag[GtkDragSource] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdragsource.h
*/
opaque type GtkDragSourceClass = CStruct0
object GtkDragSourceClass:
  given _tag: Tag[GtkDragSourceClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdrawingarea.h
*/
opaque type GtkDrawingArea = CStruct1[GtkWidget]
object GtkDrawingArea:
  given _tag: Tag[GtkDrawingArea] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[GtkDrawingArea] = scala.scalanative.unsafe.alloc[GtkDrawingArea](1)
  def apply(widget : GtkWidget)(using Zone): Ptr[GtkDrawingArea] = 
    val ____ptr = apply()
    (!____ptr).widget = widget
    ____ptr
  extension (struct: GtkDrawingArea)
    def widget : GtkWidget = struct._1
    def widget_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdrawingarea.h
*/
opaque type GtkDrawingAreaClass = CStruct3[GtkWidgetClass, CFuncPtr3[Ptr[GtkDrawingArea], CInt, CInt, Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkDrawingAreaClass:
  given _tag: Tag[GtkDrawingAreaClass] = Tag.materializeCStruct3Tag[GtkWidgetClass, CFuncPtr3[Ptr[GtkDrawingArea], CInt, CInt, Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkDrawingAreaClass] = scala.scalanative.unsafe.alloc[GtkDrawingAreaClass](1)
  def apply(parent_class : GtkWidgetClass, resize : CFuncPtr3[Ptr[GtkDrawingArea], CInt, CInt, Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkDrawingAreaClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).resize = resize
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkDrawingAreaClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def resize : CFuncPtr3[Ptr[GtkDrawingArea], CInt, CInt, Unit] = struct._2
    def resize_=(value: CFuncPtr3[Ptr[GtkDrawingArea], CInt, CInt, Unit]): Unit = !struct.at2 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._3
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdropcontrollermotion.h
*/
opaque type GtkDropControllerMotion = CStruct0
object GtkDropControllerMotion:
  given _tag: Tag[GtkDropControllerMotion] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdropcontrollermotion.h
*/
opaque type GtkDropControllerMotionClass = CStruct0
object GtkDropControllerMotionClass:
  given _tag: Tag[GtkDropControllerMotionClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdropdown.h
*/
opaque type GtkDropDown = CStruct0
object GtkDropDown:
  given _tag: Tag[GtkDropDown] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdropdown.h
*/
opaque type GtkDropDownClass = CStruct1[GtkWidgetClass]
object GtkDropDownClass:
  given _tag: Tag[GtkDropDownClass] = Tag.materializeCStruct1Tag[GtkWidgetClass]
  def apply()(using Zone): Ptr[GtkDropDownClass] = scala.scalanative.unsafe.alloc[GtkDropDownClass](1)
  def apply(parent_class : GtkWidgetClass)(using Zone): Ptr[GtkDropDownClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkDropDownClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdroptarget.h
*/
opaque type GtkDropTarget = CStruct0
object GtkDropTarget:
  given _tag: Tag[GtkDropTarget] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdroptargetasync.h
*/
opaque type GtkDropTargetAsync = CStruct0
object GtkDropTargetAsync:
  given _tag: Tag[GtkDropTargetAsync] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdroptargetasync.h
*/
opaque type GtkDropTargetAsyncClass = CStruct0
object GtkDropTargetAsyncClass:
  given _tag: Tag[GtkDropTargetAsyncClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdroptarget.h
*/
opaque type GtkDropTargetClass = CStruct0
object GtkDropTargetClass:
  given _tag: Tag[GtkDropTargetClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeditable.h
*/
opaque type GtkEditable = CStruct0
object GtkEditable:
  given _tag: Tag[GtkEditable] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeditable.h
*/
opaque type GtkEditableInterface = CStruct10[_root_.gobject.all.GTypeInterface, CFuncPtr4[Ptr[GtkEditable], CString, CInt, Ptr[CInt], Unit], CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit], CFuncPtr1[Ptr[GtkEditable], Unit], CFuncPtr1[Ptr[GtkEditable], CString], CFuncPtr4[Ptr[GtkEditable], CString, CInt, Ptr[CInt], Unit], CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit], CFuncPtr3[Ptr[GtkEditable], Ptr[CInt], Ptr[CInt], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit], CFuncPtr1[Ptr[GtkEditable], Ptr[GtkEditable]]]
object GtkEditableInterface:
  given _tag: Tag[GtkEditableInterface] = Tag.materializeCStruct10Tag[_root_.gobject.all.GTypeInterface, CFuncPtr4[Ptr[GtkEditable], CString, CInt, Ptr[CInt], Unit], CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit], CFuncPtr1[Ptr[GtkEditable], Unit], CFuncPtr1[Ptr[GtkEditable], CString], CFuncPtr4[Ptr[GtkEditable], CString, CInt, Ptr[CInt], Unit], CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit], CFuncPtr3[Ptr[GtkEditable], Ptr[CInt], Ptr[CInt], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit], CFuncPtr1[Ptr[GtkEditable], Ptr[GtkEditable]]]
  def apply()(using Zone): Ptr[GtkEditableInterface] = scala.scalanative.unsafe.alloc[GtkEditableInterface](1)
  def apply(base_iface : _root_.gobject.all.GTypeInterface, insert_text : CFuncPtr4[Ptr[GtkEditable], CString, CInt, Ptr[CInt], Unit], delete_text : CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit], changed : CFuncPtr1[Ptr[GtkEditable], Unit], get_text : CFuncPtr1[Ptr[GtkEditable], CString], do_insert_text : CFuncPtr4[Ptr[GtkEditable], CString, CInt, Ptr[CInt], Unit], do_delete_text : CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit], get_selection_bounds : CFuncPtr3[Ptr[GtkEditable], Ptr[CInt], Ptr[CInt], _root_.glib.all.gboolean], set_selection_bounds : CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit], get_delegate : CFuncPtr1[Ptr[GtkEditable], Ptr[GtkEditable]])(using Zone): Ptr[GtkEditableInterface] = 
    val ____ptr = apply()
    (!____ptr).base_iface = base_iface
    (!____ptr).insert_text = insert_text
    (!____ptr).delete_text = delete_text
    (!____ptr).changed = changed
    (!____ptr).get_text = get_text
    (!____ptr).do_insert_text = do_insert_text
    (!____ptr).do_delete_text = do_delete_text
    (!____ptr).get_selection_bounds = get_selection_bounds
    (!____ptr).set_selection_bounds = set_selection_bounds
    (!____ptr).get_delegate = get_delegate
    ____ptr
  extension (struct: GtkEditableInterface)
    def base_iface : _root_.gobject.all.GTypeInterface = struct._1
    def base_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def insert_text : CFuncPtr4[Ptr[GtkEditable], CString, CInt, Ptr[CInt], Unit] = struct._2
    def insert_text_=(value: CFuncPtr4[Ptr[GtkEditable], CString, CInt, Ptr[CInt], Unit]): Unit = !struct.at2 = value
    def delete_text : CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit] = struct._3
    def delete_text_=(value: CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit]): Unit = !struct.at3 = value
    def changed : CFuncPtr1[Ptr[GtkEditable], Unit] = struct._4
    def changed_=(value: CFuncPtr1[Ptr[GtkEditable], Unit]): Unit = !struct.at4 = value
    def get_text : CFuncPtr1[Ptr[GtkEditable], CString] = struct._5
    def get_text_=(value: CFuncPtr1[Ptr[GtkEditable], CString]): Unit = !struct.at5 = value
    def do_insert_text : CFuncPtr4[Ptr[GtkEditable], CString, CInt, Ptr[CInt], Unit] = struct._6
    def do_insert_text_=(value: CFuncPtr4[Ptr[GtkEditable], CString, CInt, Ptr[CInt], Unit]): Unit = !struct.at6 = value
    def do_delete_text : CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit] = struct._7
    def do_delete_text_=(value: CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit]): Unit = !struct.at7 = value
    def get_selection_bounds : CFuncPtr3[Ptr[GtkEditable], Ptr[CInt], Ptr[CInt], _root_.glib.all.gboolean] = struct._8
    def get_selection_bounds_=(value: CFuncPtr3[Ptr[GtkEditable], Ptr[CInt], Ptr[CInt], _root_.glib.all.gboolean]): Unit = !struct.at8 = value
    def set_selection_bounds : CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit] = struct._9
    def set_selection_bounds_=(value: CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit]): Unit = !struct.at9 = value
    def get_delegate : CFuncPtr1[Ptr[GtkEditable], Ptr[GtkEditable]] = struct._10
    def get_delegate_=(value: CFuncPtr1[Ptr[GtkEditable], Ptr[GtkEditable]]): Unit = !struct.at10 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeditablelabel.h
*/
opaque type GtkEditableLabel = CStruct0
object GtkEditableLabel:
  given _tag: Tag[GtkEditableLabel] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeditablelabel.h
*/
opaque type GtkEditableLabelClass = CStruct1[GtkWidgetClass]
object GtkEditableLabelClass:
  given _tag: Tag[GtkEditableLabelClass] = Tag.materializeCStruct1Tag[GtkWidgetClass]
  def apply()(using Zone): Ptr[GtkEditableLabelClass] = scala.scalanative.unsafe.alloc[GtkEditableLabelClass](1)
  def apply(parent_class : GtkWidgetClass)(using Zone): Ptr[GtkEditableLabelClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkEditableLabelClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkemojichooser.h
*/
opaque type GtkEmojiChooser = CStruct0
object GtkEmojiChooser:
  given _tag: Tag[GtkEmojiChooser] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkemojichooser.h
*/
opaque type GtkEmojiChooserClass = CStruct0
object GtkEmojiChooserClass:
  given _tag: Tag[GtkEmojiChooserClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkentry.h
*/
opaque type GtkEntry = CStruct1[GtkWidget]
object GtkEntry:
  given _tag: Tag[GtkEntry] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[GtkEntry] = scala.scalanative.unsafe.alloc[GtkEntry](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[GtkEntry] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkEntry)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkentrybuffer.h
*/
opaque type GtkEntryBuffer = CStruct1[_root_.gobject.all.GObject]
object GtkEntryBuffer:
  given _tag: Tag[GtkEntryBuffer] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[GtkEntryBuffer] = scala.scalanative.unsafe.alloc[GtkEntryBuffer](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[GtkEntryBuffer] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkEntryBuffer)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkentrybuffer.h
*/
opaque type GtkEntryBufferClass = CStruct15[_root_.gobject.all.GObjectClass, CFuncPtr4[Ptr[GtkEntryBuffer], _root_.glib.all.guint, CString, _root_.glib.all.guint, Unit], CFuncPtr3[Ptr[GtkEntryBuffer], _root_.glib.all.guint, _root_.glib.all.guint, Unit], CFuncPtr2[Ptr[GtkEntryBuffer], Ptr[_root_.glib.all.gsize], CString], CFuncPtr1[Ptr[GtkEntryBuffer], _root_.glib.all.guint], CFuncPtr4[Ptr[GtkEntryBuffer], _root_.glib.all.guint, CString, _root_.glib.all.guint, _root_.glib.all.guint], CFuncPtr3[Ptr[GtkEntryBuffer], _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object GtkEntryBufferClass:
  given _tag: Tag[GtkEntryBufferClass] = Tag.materializeCStruct15Tag[_root_.gobject.all.GObjectClass, CFuncPtr4[Ptr[GtkEntryBuffer], _root_.glib.all.guint, CString, _root_.glib.all.guint, Unit], CFuncPtr3[Ptr[GtkEntryBuffer], _root_.glib.all.guint, _root_.glib.all.guint, Unit], CFuncPtr2[Ptr[GtkEntryBuffer], Ptr[_root_.glib.all.gsize], CString], CFuncPtr1[Ptr[GtkEntryBuffer], _root_.glib.all.guint], CFuncPtr4[Ptr[GtkEntryBuffer], _root_.glib.all.guint, CString, _root_.glib.all.guint, _root_.glib.all.guint], CFuncPtr3[Ptr[GtkEntryBuffer], _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[GtkEntryBufferClass] = scala.scalanative.unsafe.alloc[GtkEntryBufferClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, inserted_text : CFuncPtr4[Ptr[GtkEntryBuffer], _root_.glib.all.guint, CString, _root_.glib.all.guint, Unit], deleted_text : CFuncPtr3[Ptr[GtkEntryBuffer], _root_.glib.all.guint, _root_.glib.all.guint, Unit], get_text : CFuncPtr2[Ptr[GtkEntryBuffer], Ptr[_root_.glib.all.gsize], CString], get_length : CFuncPtr1[Ptr[GtkEntryBuffer], _root_.glib.all.guint], insert_text : CFuncPtr4[Ptr[GtkEntryBuffer], _root_.glib.all.guint, CString, _root_.glib.all.guint, _root_.glib.all.guint], delete_text : CFuncPtr3[Ptr[GtkEntryBuffer], _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint], _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit], _gtk_reserved5 : CFuncPtr0[Unit], _gtk_reserved6 : CFuncPtr0[Unit], _gtk_reserved7 : CFuncPtr0[Unit], _gtk_reserved8 : CFuncPtr0[Unit])(using Zone): Ptr[GtkEntryBufferClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).inserted_text = inserted_text
    (!____ptr).deleted_text = deleted_text
    (!____ptr).get_text = get_text
    (!____ptr).get_length = get_length
    (!____ptr).insert_text = insert_text
    (!____ptr).delete_text = delete_text
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    (!____ptr)._gtk_reserved5 = _gtk_reserved5
    (!____ptr)._gtk_reserved6 = _gtk_reserved6
    (!____ptr)._gtk_reserved7 = _gtk_reserved7
    (!____ptr)._gtk_reserved8 = _gtk_reserved8
    ____ptr
  extension (struct: GtkEntryBufferClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def inserted_text : CFuncPtr4[Ptr[GtkEntryBuffer], _root_.glib.all.guint, CString, _root_.glib.all.guint, Unit] = struct._2
    def inserted_text_=(value: CFuncPtr4[Ptr[GtkEntryBuffer], _root_.glib.all.guint, CString, _root_.glib.all.guint, Unit]): Unit = !struct.at2 = value
    def deleted_text : CFuncPtr3[Ptr[GtkEntryBuffer], _root_.glib.all.guint, _root_.glib.all.guint, Unit] = struct._3
    def deleted_text_=(value: CFuncPtr3[Ptr[GtkEntryBuffer], _root_.glib.all.guint, _root_.glib.all.guint, Unit]): Unit = !struct.at3 = value
    def get_text : CFuncPtr2[Ptr[GtkEntryBuffer], Ptr[_root_.glib.all.gsize], CString] = struct._4
    def get_text_=(value: CFuncPtr2[Ptr[GtkEntryBuffer], Ptr[_root_.glib.all.gsize], CString]): Unit = !struct.at4 = value
    def get_length : CFuncPtr1[Ptr[GtkEntryBuffer], _root_.glib.all.guint] = struct._5
    def get_length_=(value: CFuncPtr1[Ptr[GtkEntryBuffer], _root_.glib.all.guint]): Unit = !struct.at5 = value
    def insert_text : CFuncPtr4[Ptr[GtkEntryBuffer], _root_.glib.all.guint, CString, _root_.glib.all.guint, _root_.glib.all.guint] = struct._6
    def insert_text_=(value: CFuncPtr4[Ptr[GtkEntryBuffer], _root_.glib.all.guint, CString, _root_.glib.all.guint, _root_.glib.all.guint]): Unit = !struct.at6 = value
    def delete_text : CFuncPtr3[Ptr[GtkEntryBuffer], _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint] = struct._7
    def delete_text_=(value: CFuncPtr3[Ptr[GtkEntryBuffer], _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint]): Unit = !struct.at7 = value
    def _gtk_reserved1 : CFuncPtr0[Unit] = struct._8
    def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at8 = value
    def _gtk_reserved2 : CFuncPtr0[Unit] = struct._9
    def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at9 = value
    def _gtk_reserved3 : CFuncPtr0[Unit] = struct._10
    def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at10 = value
    def _gtk_reserved4 : CFuncPtr0[Unit] = struct._11
    def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at11 = value
    def _gtk_reserved5 : CFuncPtr0[Unit] = struct._12
    def _gtk_reserved5_=(value: CFuncPtr0[Unit]): Unit = !struct.at12 = value
    def _gtk_reserved6 : CFuncPtr0[Unit] = struct._13
    def _gtk_reserved6_=(value: CFuncPtr0[Unit]): Unit = !struct.at13 = value
    def _gtk_reserved7 : CFuncPtr0[Unit] = struct._14
    def _gtk_reserved7_=(value: CFuncPtr0[Unit]): Unit = !struct.at14 = value
    def _gtk_reserved8 : CFuncPtr0[Unit] = struct._15
    def _gtk_reserved8_=(value: CFuncPtr0[Unit]): Unit = !struct.at15 = value

/**
 * GtkEntryClass: _class: The parent class. : Class handler for the `GtkEntry::activate` signal. The default implementation activates the gtk.activate-default action.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkentry.h
*/
opaque type GtkEntryClass = CStruct3[GtkWidgetClass, CFuncPtr1[Ptr[GtkEntry], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkEntryClass:
  given _tag: Tag[GtkEntryClass] = Tag.materializeCStruct3Tag[GtkWidgetClass, CFuncPtr1[Ptr[GtkEntry], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkEntryClass] = scala.scalanative.unsafe.alloc[GtkEntryClass](1)
  def apply(parent_class : GtkWidgetClass, activate : CFuncPtr1[Ptr[GtkEntry], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkEntryClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).activate = activate
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkEntryClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def activate : CFuncPtr1[Ptr[GtkEntry], Unit] = struct._2
    def activate_=(value: CFuncPtr1[Ptr[GtkEntry], Unit]): Unit = !struct.at2 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._3
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkentrycompletion.h
*/
opaque type GtkEntryCompletion = CStruct0
object GtkEntryCompletion:
  given _tag: Tag[GtkEntryCompletion] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
opaque type GtkEventController = CStruct0
object GtkEventController:
  given _tag: Tag[GtkEventController] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeventcontroller.h
*/
opaque type GtkEventControllerClass = CStruct0
object GtkEventControllerClass:
  given _tag: Tag[GtkEventControllerClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeventcontrollerfocus.h
*/
opaque type GtkEventControllerFocus = CStruct0
object GtkEventControllerFocus:
  given _tag: Tag[GtkEventControllerFocus] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeventcontrollerfocus.h
*/
opaque type GtkEventControllerFocusClass = CStruct0
object GtkEventControllerFocusClass:
  given _tag: Tag[GtkEventControllerFocusClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeventcontrollerkey.h
*/
opaque type GtkEventControllerKey = CStruct0
object GtkEventControllerKey:
  given _tag: Tag[GtkEventControllerKey] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeventcontrollerkey.h
*/
opaque type GtkEventControllerKeyClass = CStruct0
object GtkEventControllerKeyClass:
  given _tag: Tag[GtkEventControllerKeyClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeventcontrollerlegacy.h
*/
opaque type GtkEventControllerLegacy = CStruct0
object GtkEventControllerLegacy:
  given _tag: Tag[GtkEventControllerLegacy] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeventcontrollerlegacy.h
*/
opaque type GtkEventControllerLegacyClass = CStruct0
object GtkEventControllerLegacyClass:
  given _tag: Tag[GtkEventControllerLegacyClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeventcontrollermotion.h
*/
opaque type GtkEventControllerMotion = CStruct0
object GtkEventControllerMotion:
  given _tag: Tag[GtkEventControllerMotion] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeventcontrollermotion.h
*/
opaque type GtkEventControllerMotionClass = CStruct0
object GtkEventControllerMotionClass:
  given _tag: Tag[GtkEventControllerMotionClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeventcontrollerscroll.h
*/
opaque type GtkEventControllerScroll = CStruct0
object GtkEventControllerScroll:
  given _tag: Tag[GtkEventControllerScroll] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeventcontrollerscroll.h
*/
opaque type GtkEventControllerScrollClass = CStruct0
object GtkEventControllerScrollClass:
  given _tag: Tag[GtkEventControllerScrollClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type GtkEveryFilter = CStruct0
object GtkEveryFilter:
  given _tag: Tag[GtkEveryFilter] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type GtkEveryFilterClass = CStruct0
object GtkEveryFilterClass:
  given _tag: Tag[GtkEveryFilterClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkexpander.h
*/
opaque type GtkExpander = CStruct0
object GtkExpander:
  given _tag: Tag[GtkExpander] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkexpression.h
*/
opaque type GtkExpression = CStruct0
object GtkExpression:
  given _tag: Tag[GtkExpression] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkexpression.h
*/
opaque type GtkExpressionWatch = CStruct0
object GtkExpressionWatch:
  given _tag: Tag[GtkExpressionWatch] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilechooser.h
*/
opaque type GtkFileChooser = CStruct0
object GtkFileChooser:
  given _tag: Tag[GtkFileChooser] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilechooserdialog.h
*/
opaque type GtkFileChooserDialog = CStruct0
object GtkFileChooserDialog:
  given _tag: Tag[GtkFileChooserDialog] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilechoosernative.h
*/
opaque type GtkFileChooserNative = CStruct0
object GtkFileChooserNative:
  given _tag: Tag[GtkFileChooserNative] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilechoosernative.h
*/
opaque type GtkFileChooserNativeClass = CStruct1[GtkNativeDialogClass]
object GtkFileChooserNativeClass:
  given _tag: Tag[GtkFileChooserNativeClass] = Tag.materializeCStruct1Tag[GtkNativeDialogClass]
  def apply()(using Zone): Ptr[GtkFileChooserNativeClass] = scala.scalanative.unsafe.alloc[GtkFileChooserNativeClass](1)
  def apply(parent_class : GtkNativeDialogClass)(using Zone): Ptr[GtkFileChooserNativeClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkFileChooserNativeClass)
    def parent_class : GtkNativeDialogClass = struct._1
    def parent_class_=(value: GtkNativeDialogClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilechooserwidget.h
*/
opaque type GtkFileChooserWidget = CStruct0
object GtkFileChooserWidget:
  given _tag: Tag[GtkFileChooserWidget] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilefilter.h
*/
opaque type GtkFileFilter = CStruct0
object GtkFileFilter:
  given _tag: Tag[GtkFileFilter] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilter.h
*/
opaque type GtkFilter = CStruct1[_root_.gobject.all.GObject]
object GtkFilter:
  given _tag: Tag[GtkFilter] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[GtkFilter] = scala.scalanative.unsafe.alloc[GtkFilter](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[GtkFilter] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkFilter)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilter.h
*/
opaque type GtkFilterClass = CStruct11[_root_.gobject.all.GObjectClass, CFuncPtr2[Ptr[GtkFilter], _root_.glib.all.gpointer, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkFilter], GtkFilterMatch], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object GtkFilterClass:
  given _tag: Tag[GtkFilterClass] = Tag.materializeCStruct11Tag[_root_.gobject.all.GObjectClass, CFuncPtr2[Ptr[GtkFilter], _root_.glib.all.gpointer, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkFilter], GtkFilterMatch], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[GtkFilterClass] = scala.scalanative.unsafe.alloc[GtkFilterClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, `match` : CFuncPtr2[Ptr[GtkFilter], _root_.glib.all.gpointer, _root_.glib.all.gboolean], get_strictness : CFuncPtr1[Ptr[GtkFilter], GtkFilterMatch], _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit], _gtk_reserved5 : CFuncPtr0[Unit], _gtk_reserved6 : CFuncPtr0[Unit], _gtk_reserved7 : CFuncPtr0[Unit], _gtk_reserved8 : CFuncPtr0[Unit])(using Zone): Ptr[GtkFilterClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).`match` = `match`
    (!____ptr).get_strictness = get_strictness
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    (!____ptr)._gtk_reserved5 = _gtk_reserved5
    (!____ptr)._gtk_reserved6 = _gtk_reserved6
    (!____ptr)._gtk_reserved7 = _gtk_reserved7
    (!____ptr)._gtk_reserved8 = _gtk_reserved8
    ____ptr
  extension (struct: GtkFilterClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def `match` : CFuncPtr2[Ptr[GtkFilter], _root_.glib.all.gpointer, _root_.glib.all.gboolean] = struct._2
    def match_=(value: CFuncPtr2[Ptr[GtkFilter], _root_.glib.all.gpointer, _root_.glib.all.gboolean]): Unit = !struct.at2 = value
    def get_strictness : CFuncPtr1[Ptr[GtkFilter], GtkFilterMatch] = struct._3
    def get_strictness_=(value: CFuncPtr1[Ptr[GtkFilter], GtkFilterMatch]): Unit = !struct.at3 = value
    def _gtk_reserved1 : CFuncPtr0[Unit] = struct._4
    def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at4 = value
    def _gtk_reserved2 : CFuncPtr0[Unit] = struct._5
    def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at5 = value
    def _gtk_reserved3 : CFuncPtr0[Unit] = struct._6
    def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at6 = value
    def _gtk_reserved4 : CFuncPtr0[Unit] = struct._7
    def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at7 = value
    def _gtk_reserved5 : CFuncPtr0[Unit] = struct._8
    def _gtk_reserved5_=(value: CFuncPtr0[Unit]): Unit = !struct.at8 = value
    def _gtk_reserved6 : CFuncPtr0[Unit] = struct._9
    def _gtk_reserved6_=(value: CFuncPtr0[Unit]): Unit = !struct.at9 = value
    def _gtk_reserved7 : CFuncPtr0[Unit] = struct._10
    def _gtk_reserved7_=(value: CFuncPtr0[Unit]): Unit = !struct.at10 = value
    def _gtk_reserved8 : CFuncPtr0[Unit] = struct._11
    def _gtk_reserved8_=(value: CFuncPtr0[Unit]): Unit = !struct.at11 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilterlistmodel.h
*/
opaque type GtkFilterListModel = CStruct0
object GtkFilterListModel:
  given _tag: Tag[GtkFilterListModel] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilterlistmodel.h
*/
opaque type GtkFilterListModelClass = CStruct1[_root_.gobject.all.GObjectClass]
object GtkFilterListModelClass:
  given _tag: Tag[GtkFilterListModelClass] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObjectClass]
  def apply()(using Zone): Ptr[GtkFilterListModelClass] = scala.scalanative.unsafe.alloc[GtkFilterListModelClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[GtkFilterListModelClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkFilterListModelClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfixed.h
*/
opaque type GtkFixed = CStruct1[GtkWidget]
object GtkFixed:
  given _tag: Tag[GtkFixed] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[GtkFixed] = scala.scalanative.unsafe.alloc[GtkFixed](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[GtkFixed] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkFixed)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfixed.h
*/
opaque type GtkFixedClass = CStruct2[GtkWidgetClass, CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkFixedClass:
  given _tag: Tag[GtkFixedClass] = Tag.materializeCStruct2Tag[GtkWidgetClass, CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkFixedClass] = scala.scalanative.unsafe.alloc[GtkFixedClass](1)
  def apply(parent_class : GtkWidgetClass, padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkFixedClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkFixedClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._2
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfixedlayout.h
*/
opaque type GtkFixedLayout = CStruct0
object GtkFixedLayout:
  given _tag: Tag[GtkFixedLayout] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfixedlayout.h
*/
opaque type GtkFixedLayoutChild = CStruct0
object GtkFixedLayoutChild:
  given _tag: Tag[GtkFixedLayoutChild] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfixedlayout.h
*/
opaque type GtkFixedLayoutChildClass = CStruct1[GtkLayoutChildClass]
object GtkFixedLayoutChildClass:
  given _tag: Tag[GtkFixedLayoutChildClass] = Tag.materializeCStruct1Tag[GtkLayoutChildClass]
  def apply()(using Zone): Ptr[GtkFixedLayoutChildClass] = scala.scalanative.unsafe.alloc[GtkFixedLayoutChildClass](1)
  def apply(parent_class : GtkLayoutChildClass)(using Zone): Ptr[GtkFixedLayoutChildClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkFixedLayoutChildClass)
    def parent_class : GtkLayoutChildClass = struct._1
    def parent_class_=(value: GtkLayoutChildClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfixedlayout.h
*/
opaque type GtkFixedLayoutClass = CStruct1[GtkLayoutManagerClass]
object GtkFixedLayoutClass:
  given _tag: Tag[GtkFixedLayoutClass] = Tag.materializeCStruct1Tag[GtkLayoutManagerClass]
  def apply()(using Zone): Ptr[GtkFixedLayoutClass] = scala.scalanative.unsafe.alloc[GtkFixedLayoutClass](1)
  def apply(parent_class : GtkLayoutManagerClass)(using Zone): Ptr[GtkFixedLayoutClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkFixedLayoutClass)
    def parent_class : GtkLayoutManagerClass = struct._1
    def parent_class_=(value: GtkLayoutManagerClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkflattenlistmodel.h
*/
opaque type GtkFlattenListModel = CStruct0
object GtkFlattenListModel:
  given _tag: Tag[GtkFlattenListModel] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkflattenlistmodel.h
*/
opaque type GtkFlattenListModelClass = CStruct1[_root_.gobject.all.GObjectClass]
object GtkFlattenListModelClass:
  given _tag: Tag[GtkFlattenListModelClass] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObjectClass]
  def apply()(using Zone): Ptr[GtkFlattenListModelClass] = scala.scalanative.unsafe.alloc[GtkFlattenListModelClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[GtkFlattenListModelClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkFlattenListModelClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkflowbox.h
*/
opaque type GtkFlowBox = CStruct0
object GtkFlowBox:
  given _tag: Tag[GtkFlowBox] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkflowbox.h
*/
opaque type GtkFlowBoxChild = CStruct1[GtkWidget]
object GtkFlowBoxChild:
  given _tag: Tag[GtkFlowBoxChild] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[GtkFlowBoxChild] = scala.scalanative.unsafe.alloc[GtkFlowBoxChild](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[GtkFlowBoxChild] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkFlowBoxChild)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkflowbox.h
*/
opaque type GtkFlowBoxChildClass = CStruct3[GtkWidgetClass, CFuncPtr1[Ptr[GtkFlowBoxChild], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkFlowBoxChildClass:
  given _tag: Tag[GtkFlowBoxChildClass] = Tag.materializeCStruct3Tag[GtkWidgetClass, CFuncPtr1[Ptr[GtkFlowBoxChild], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkFlowBoxChildClass] = scala.scalanative.unsafe.alloc[GtkFlowBoxChildClass](1)
  def apply(parent_class : GtkWidgetClass, activate : CFuncPtr1[Ptr[GtkFlowBoxChild], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkFlowBoxChildClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).activate = activate
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkFlowBoxChildClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def activate : CFuncPtr1[Ptr[GtkFlowBoxChild], Unit] = struct._2
    def activate_=(value: CFuncPtr1[Ptr[GtkFlowBoxChild], Unit]): Unit = !struct.at2 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._3
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfontbutton.h
*/
opaque type GtkFontButton = CStruct0
object GtkFontButton:
  given _tag: Tag[GtkFontButton] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfontchooser.h
*/
opaque type GtkFontChooser = CStruct0
object GtkFontChooser:
  given _tag: Tag[GtkFontChooser] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfontchooserdialog.h
*/
opaque type GtkFontChooserDialog = CStruct0
object GtkFontChooserDialog:
  given _tag: Tag[GtkFontChooserDialog] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfontchooser.h
*/
opaque type GtkFontChooserIface = CStruct9[_root_.gobject.all.GTypeInterface, CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontFamily]], CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontFace]], CFuncPtr1[Ptr[GtkFontChooser], CInt], CFuncPtr4[Ptr[GtkFontChooser], GtkFontFilterFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit], CFuncPtr2[Ptr[GtkFontChooser], CString, Unit], CFuncPtr2[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontMap], Unit], CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontMap]], CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._0]]]
object GtkFontChooserIface:
  given _tag: Tag[GtkFontChooserIface] = Tag.materializeCStruct9Tag[_root_.gobject.all.GTypeInterface, CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontFamily]], CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontFace]], CFuncPtr1[Ptr[GtkFontChooser], CInt], CFuncPtr4[Ptr[GtkFontChooser], GtkFontFilterFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit], CFuncPtr2[Ptr[GtkFontChooser], CString, Unit], CFuncPtr2[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontMap], Unit], CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontMap]], CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._0]]]
  def apply()(using Zone): Ptr[GtkFontChooserIface] = scala.scalanative.unsafe.alloc[GtkFontChooserIface](1)
  def apply(base_iface : _root_.gobject.all.GTypeInterface, get_font_family : CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontFamily]], get_font_face : CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontFace]], get_font_size : CFuncPtr1[Ptr[GtkFontChooser], CInt], set_filter_func : CFuncPtr4[Ptr[GtkFontChooser], GtkFontFilterFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit], font_activated : CFuncPtr2[Ptr[GtkFontChooser], CString, Unit], set_font_map : CFuncPtr2[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontMap], Unit], get_font_map : CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontMap]], padding : CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._0]])(using Zone): Ptr[GtkFontChooserIface] = 
    val ____ptr = apply()
    (!____ptr).base_iface = base_iface
    (!____ptr).get_font_family = get_font_family
    (!____ptr).get_font_face = get_font_face
    (!____ptr).get_font_size = get_font_size
    (!____ptr).set_filter_func = set_filter_func
    (!____ptr).font_activated = font_activated
    (!____ptr).set_font_map = set_font_map
    (!____ptr).get_font_map = get_font_map
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkFontChooserIface)
    def base_iface : _root_.gobject.all.GTypeInterface = struct._1
    def base_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def get_font_family : CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontFamily]] = struct._2
    def get_font_family_=(value: CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontFamily]]): Unit = !struct.at2 = value
    def get_font_face : CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontFace]] = struct._3
    def get_font_face_=(value: CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontFace]]): Unit = !struct.at3 = value
    def get_font_size : CFuncPtr1[Ptr[GtkFontChooser], CInt] = struct._4
    def get_font_size_=(value: CFuncPtr1[Ptr[GtkFontChooser], CInt]): Unit = !struct.at4 = value
    def set_filter_func : CFuncPtr4[Ptr[GtkFontChooser], GtkFontFilterFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit] = struct._5
    def set_filter_func_=(value: CFuncPtr4[Ptr[GtkFontChooser], GtkFontFilterFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit]): Unit = !struct.at5 = value
    def font_activated : CFuncPtr2[Ptr[GtkFontChooser], CString, Unit] = struct._6
    def font_activated_=(value: CFuncPtr2[Ptr[GtkFontChooser], CString, Unit]): Unit = !struct.at6 = value
    def set_font_map : CFuncPtr2[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontMap], Unit] = struct._7
    def set_font_map_=(value: CFuncPtr2[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontMap], Unit]): Unit = !struct.at7 = value
    def get_font_map : CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontMap]] = struct._8
    def get_font_map_=(value: CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontMap]]): Unit = !struct.at8 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._0]] = struct._9
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._0]]): Unit = !struct.at9 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfontchooserwidget.h
*/
opaque type GtkFontChooserWidget = CStruct0
object GtkFontChooserWidget:
  given _tag: Tag[GtkFontChooserWidget] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkframe.h
*/
opaque type GtkFrame = CStruct1[GtkWidget]
object GtkFrame:
  given _tag: Tag[GtkFrame] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[GtkFrame] = scala.scalanative.unsafe.alloc[GtkFrame](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[GtkFrame] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkFrame)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * GtkFrameClass: _class: The parent class. _child_allocation:

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkframe.h
*/
opaque type GtkFrameClass = CStruct3[GtkWidgetClass, CFuncPtr2[Ptr[GtkFrame], Ptr[GtkAllocation], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkFrameClass:
  given _tag: Tag[GtkFrameClass] = Tag.materializeCStruct3Tag[GtkWidgetClass, CFuncPtr2[Ptr[GtkFrame], Ptr[GtkAllocation], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkFrameClass] = scala.scalanative.unsafe.alloc[GtkFrameClass](1)
  def apply(parent_class : GtkWidgetClass, compute_child_allocation : CFuncPtr2[Ptr[GtkFrame], Ptr[GtkAllocation], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkFrameClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).compute_child_allocation = compute_child_allocation
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkFrameClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def compute_child_allocation : CFuncPtr2[Ptr[GtkFrame], Ptr[GtkAllocation], Unit] = struct._2
    def compute_child_allocation_=(value: CFuncPtr2[Ptr[GtkFrame], Ptr[GtkAllocation], Unit]): Unit = !struct.at2 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._3
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkglarea.h
*/
opaque type GtkGLArea = CStruct1[GtkWidget]
object GtkGLArea:
  given _tag: Tag[GtkGLArea] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[GtkGLArea] = scala.scalanative.unsafe.alloc[GtkGLArea](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[GtkGLArea] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkGLArea)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * GtkGLAreaClass: : class closure for the `GtkGLArea::render` signal : class closeure for the `GtkGLArea::resize` signal _context: class closure for the `GtkGLArea::create-context` signal

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkglarea.h
*/
opaque type GtkGLAreaClass = CStruct5[GtkWidgetClass, CFuncPtr2[Ptr[GtkGLArea], Ptr[GdkGLContext], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkGLArea], CInt, CInt, Unit], CFuncPtr1[Ptr[GtkGLArea], Ptr[GdkGLContext]], CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkGLAreaClass:
  given _tag: Tag[GtkGLAreaClass] = Tag.materializeCStruct5Tag[GtkWidgetClass, CFuncPtr2[Ptr[GtkGLArea], Ptr[GdkGLContext], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkGLArea], CInt, CInt, Unit], CFuncPtr1[Ptr[GtkGLArea], Ptr[GdkGLContext]], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkGLAreaClass] = scala.scalanative.unsafe.alloc[GtkGLAreaClass](1)
  def apply(parent_class : GtkWidgetClass, render : CFuncPtr2[Ptr[GtkGLArea], Ptr[GdkGLContext], _root_.glib.all.gboolean], resize : CFuncPtr3[Ptr[GtkGLArea], CInt, CInt, Unit], create_context : CFuncPtr1[Ptr[GtkGLArea], Ptr[GdkGLContext]], _padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkGLAreaClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).render = render
    (!____ptr).resize = resize
    (!____ptr).create_context = create_context
    (!____ptr)._padding = _padding
    ____ptr
  extension (struct: GtkGLAreaClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def render : CFuncPtr2[Ptr[GtkGLArea], Ptr[GdkGLContext], _root_.glib.all.gboolean] = struct._2
    def render_=(value: CFuncPtr2[Ptr[GtkGLArea], Ptr[GdkGLContext], _root_.glib.all.gboolean]): Unit = !struct.at2 = value
    def resize : CFuncPtr3[Ptr[GtkGLArea], CInt, CInt, Unit] = struct._3
    def resize_=(value: CFuncPtr3[Ptr[GtkGLArea], CInt, CInt, Unit]): Unit = !struct.at3 = value
    def create_context : CFuncPtr1[Ptr[GtkGLArea], Ptr[GdkGLContext]] = struct._4
    def create_context_=(value: CFuncPtr1[Ptr[GtkGLArea], Ptr[GdkGLContext]]): Unit = !struct.at4 = value
    def _padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._5
    def _padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at5 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
opaque type GtkGesture = CStruct0
object GtkGesture:
  given _tag: Tag[GtkGesture] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgesture.h
*/
opaque type GtkGestureClass = CStruct0
object GtkGestureClass:
  given _tag: Tag[GtkGestureClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgestureclick.h
*/
opaque type GtkGestureClick = CStruct0
object GtkGestureClick:
  given _tag: Tag[GtkGestureClick] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgestureclick.h
*/
opaque type GtkGestureClickClass = CStruct0
object GtkGestureClickClass:
  given _tag: Tag[GtkGestureClickClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgesturedrag.h
*/
opaque type GtkGestureDrag = CStruct0
object GtkGestureDrag:
  given _tag: Tag[GtkGestureDrag] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgesturedrag.h
*/
opaque type GtkGestureDragClass = CStruct0
object GtkGestureDragClass:
  given _tag: Tag[GtkGestureDragClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgesturelongpress.h
*/
opaque type GtkGestureLongPress = CStruct0
object GtkGestureLongPress:
  given _tag: Tag[GtkGestureLongPress] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgesturelongpress.h
*/
opaque type GtkGestureLongPressClass = CStruct0
object GtkGestureLongPressClass:
  given _tag: Tag[GtkGestureLongPressClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgesturepan.h
*/
opaque type GtkGesturePan = CStruct0
object GtkGesturePan:
  given _tag: Tag[GtkGesturePan] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgesturepan.h
*/
opaque type GtkGesturePanClass = CStruct0
object GtkGesturePanClass:
  given _tag: Tag[GtkGesturePanClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgesturerotate.h
*/
opaque type GtkGestureRotate = CStruct0
object GtkGestureRotate:
  given _tag: Tag[GtkGestureRotate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgesturerotate.h
*/
opaque type GtkGestureRotateClass = CStruct0
object GtkGestureRotateClass:
  given _tag: Tag[GtkGestureRotateClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgesturesingle.h
*/
opaque type GtkGestureSingle = CStruct0
object GtkGestureSingle:
  given _tag: Tag[GtkGestureSingle] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgesturesingle.h
*/
opaque type GtkGestureSingleClass = CStruct0
object GtkGestureSingleClass:
  given _tag: Tag[GtkGestureSingleClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgesturestylus.h
*/
opaque type GtkGestureStylus = CStruct0
object GtkGestureStylus:
  given _tag: Tag[GtkGestureStylus] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgesturestylus.h
*/
opaque type GtkGestureStylusClass = CStruct0
object GtkGestureStylusClass:
  given _tag: Tag[GtkGestureStylusClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgestureswipe.h
*/
opaque type GtkGestureSwipe = CStruct0
object GtkGestureSwipe:
  given _tag: Tag[GtkGestureSwipe] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgestureswipe.h
*/
opaque type GtkGestureSwipeClass = CStruct0
object GtkGestureSwipeClass:
  given _tag: Tag[GtkGestureSwipeClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgesturezoom.h
*/
opaque type GtkGestureZoom = CStruct0
object GtkGestureZoom:
  given _tag: Tag[GtkGestureZoom] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgesturezoom.h
*/
opaque type GtkGestureZoomClass = CStruct0
object GtkGestureZoomClass:
  given _tag: Tag[GtkGestureZoomClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgrid.h
*/
opaque type GtkGrid = CStruct1[GtkWidget]
object GtkGrid:
  given _tag: Tag[GtkGrid] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[GtkGrid] = scala.scalanative.unsafe.alloc[GtkGrid](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[GtkGrid] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkGrid)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * GtkGridClass: _class: The parent class.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgrid.h
*/
opaque type GtkGridClass = CStruct2[GtkWidgetClass, CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkGridClass:
  given _tag: Tag[GtkGridClass] = Tag.materializeCStruct2Tag[GtkWidgetClass, CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkGridClass] = scala.scalanative.unsafe.alloc[GtkGridClass](1)
  def apply(parent_class : GtkWidgetClass, padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkGridClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkGridClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._2
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgridlayout.h
*/
opaque type GtkGridLayout = CStruct0
object GtkGridLayout:
  given _tag: Tag[GtkGridLayout] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgridlayout.h
*/
opaque type GtkGridLayoutChild = CStruct0
object GtkGridLayoutChild:
  given _tag: Tag[GtkGridLayoutChild] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgridlayout.h
*/
opaque type GtkGridLayoutChildClass = CStruct1[GtkLayoutChildClass]
object GtkGridLayoutChildClass:
  given _tag: Tag[GtkGridLayoutChildClass] = Tag.materializeCStruct1Tag[GtkLayoutChildClass]
  def apply()(using Zone): Ptr[GtkGridLayoutChildClass] = scala.scalanative.unsafe.alloc[GtkGridLayoutChildClass](1)
  def apply(parent_class : GtkLayoutChildClass)(using Zone): Ptr[GtkGridLayoutChildClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkGridLayoutChildClass)
    def parent_class : GtkLayoutChildClass = struct._1
    def parent_class_=(value: GtkLayoutChildClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgridlayout.h
*/
opaque type GtkGridLayoutClass = CStruct1[GtkLayoutManagerClass]
object GtkGridLayoutClass:
  given _tag: Tag[GtkGridLayoutClass] = Tag.materializeCStruct1Tag[GtkLayoutManagerClass]
  def apply()(using Zone): Ptr[GtkGridLayoutClass] = scala.scalanative.unsafe.alloc[GtkGridLayoutClass](1)
  def apply(parent_class : GtkLayoutManagerClass)(using Zone): Ptr[GtkGridLayoutClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkGridLayoutClass)
    def parent_class : GtkLayoutManagerClass = struct._1
    def parent_class_=(value: GtkLayoutManagerClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgridview.h
*/
opaque type GtkGridView = CStruct0
object GtkGridView:
  given _tag: Tag[GtkGridView] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgridview.h
*/
opaque type GtkGridViewClass = CStruct0
object GtkGridViewClass:
  given _tag: Tag[GtkGridViewClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkheaderbar.h
*/
opaque type GtkHeaderBar = CStruct0
object GtkHeaderBar:
  given _tag: Tag[GtkHeaderBar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkimcontext.h
*/
opaque type GtkIMContext = CStruct1[_root_.gobject.all.GObject]
object GtkIMContext:
  given _tag: Tag[GtkIMContext] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[GtkIMContext] = scala.scalanative.unsafe.alloc[GtkIMContext](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[GtkIMContext] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkIMContext)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkimcontext.h
*/
opaque type GtkIMContextClass = CArray[CChar, Nat.Digit3[Nat._3, Nat._2, Nat._0]]
object GtkIMContextClass:
  given _tag: Tag[GtkIMContextClass] = Tag.CArray[CChar, Nat.Digit3[Nat._3, Nat._2, Nat._0]](Tag.Byte, Tag.Digit3[Nat._3, Nat._2, Nat._0](Tag.Nat3, Tag.Nat2, Tag.Nat0))
  def apply()(using Zone): Ptr[GtkIMContextClass] = scala.scalanative.unsafe.alloc[GtkIMContextClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, preedit_start : CFuncPtr1[Ptr[GtkIMContext], Unit], preedit_end : CFuncPtr1[Ptr[GtkIMContext], Unit], preedit_changed : CFuncPtr1[Ptr[GtkIMContext], Unit], commit : CFuncPtr2[Ptr[GtkIMContext], CString, Unit], retrieve_surrounding : CFuncPtr1[Ptr[GtkIMContext], _root_.glib.all.gboolean], delete_surrounding : CFuncPtr3[Ptr[GtkIMContext], CInt, CInt, _root_.glib.all.gboolean], set_client_widget : CFuncPtr2[Ptr[GtkIMContext], Ptr[GtkWidget], Unit], get_preedit_string : CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[Ptr[_root_.pango.all.PangoAttrList]], Ptr[CInt], Unit], filter_keypress : CFuncPtr2[Ptr[GtkIMContext], Ptr[GdkEvent], _root_.glib.all.gboolean], focus_in : CFuncPtr1[Ptr[GtkIMContext], Unit], focus_out : CFuncPtr1[Ptr[GtkIMContext], Unit], reset : CFuncPtr1[Ptr[GtkIMContext], Unit], set_cursor_location : CFuncPtr2[Ptr[GtkIMContext], Ptr[GdkRectangle], Unit], set_use_preedit : CFuncPtr2[Ptr[GtkIMContext], _root_.glib.all.gboolean, Unit], set_surrounding : CFuncPtr4[Ptr[GtkIMContext], CString, CInt, CInt, Unit], get_surrounding : CFuncPtr3[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], _root_.glib.all.gboolean], set_surrounding_with_selection : CFuncPtr5[Ptr[GtkIMContext], CString, CInt, CInt, CInt, Unit], get_surrounding_with_selection : CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], Ptr[CInt], _root_.glib.all.gboolean], _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit], _gtk_reserved5 : CFuncPtr0[Unit])(using Zone): Ptr[GtkIMContextClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).preedit_start = preedit_start
    (!____ptr).preedit_end = preedit_end
    (!____ptr).preedit_changed = preedit_changed
    (!____ptr).commit = commit
    (!____ptr).retrieve_surrounding = retrieve_surrounding
    (!____ptr).delete_surrounding = delete_surrounding
    (!____ptr).set_client_widget = set_client_widget
    (!____ptr).get_preedit_string = get_preedit_string
    (!____ptr).filter_keypress = filter_keypress
    (!____ptr).focus_in = focus_in
    (!____ptr).focus_out = focus_out
    (!____ptr).reset = reset
    (!____ptr).set_cursor_location = set_cursor_location
    (!____ptr).set_use_preedit = set_use_preedit
    (!____ptr).set_surrounding = set_surrounding
    (!____ptr).get_surrounding = get_surrounding
    (!____ptr).set_surrounding_with_selection = set_surrounding_with_selection
    (!____ptr).get_surrounding_with_selection = get_surrounding_with_selection
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    (!____ptr)._gtk_reserved5 = _gtk_reserved5
    ____ptr
  extension (struct: GtkIMContextClass)
    def parent_class: _root_.gobject.all.GObjectClass = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObjectClass]]
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObjectClass]] = value
    def preedit_start: CFuncPtr1[Ptr[GtkIMContext], Unit] = !struct.at(136).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]]
    def preedit_start_=(value: CFuncPtr1[Ptr[GtkIMContext], Unit]): Unit = !struct.at(136).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]] = value
    def preedit_end: CFuncPtr1[Ptr[GtkIMContext], Unit] = !struct.at(144).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]]
    def preedit_end_=(value: CFuncPtr1[Ptr[GtkIMContext], Unit]): Unit = !struct.at(144).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]] = value
    def preedit_changed: CFuncPtr1[Ptr[GtkIMContext], Unit] = !struct.at(152).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]]
    def preedit_changed_=(value: CFuncPtr1[Ptr[GtkIMContext], Unit]): Unit = !struct.at(152).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]] = value
    def commit: CFuncPtr2[Ptr[GtkIMContext], CString, Unit] = !struct.at(160).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], CString, Unit]]]
    def commit_=(value: CFuncPtr2[Ptr[GtkIMContext], CString, Unit]): Unit = !struct.at(160).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], CString, Unit]]] = value
    def retrieve_surrounding: CFuncPtr1[Ptr[GtkIMContext], _root_.glib.all.gboolean] = !struct.at(168).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], _root_.glib.all.gboolean]]]
    def retrieve_surrounding_=(value: CFuncPtr1[Ptr[GtkIMContext], _root_.glib.all.gboolean]): Unit = !struct.at(168).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], _root_.glib.all.gboolean]]] = value
    def delete_surrounding: CFuncPtr3[Ptr[GtkIMContext], CInt, CInt, _root_.glib.all.gboolean] = !struct.at(176).asInstanceOf[Ptr[CFuncPtr3[Ptr[GtkIMContext], CInt, CInt, _root_.glib.all.gboolean]]]
    def delete_surrounding_=(value: CFuncPtr3[Ptr[GtkIMContext], CInt, CInt, _root_.glib.all.gboolean]): Unit = !struct.at(176).asInstanceOf[Ptr[CFuncPtr3[Ptr[GtkIMContext], CInt, CInt, _root_.glib.all.gboolean]]] = value
    def set_client_widget: CFuncPtr2[Ptr[GtkIMContext], Ptr[GtkWidget], Unit] = !struct.at(184).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], Ptr[GtkWidget], Unit]]]
    def set_client_widget_=(value: CFuncPtr2[Ptr[GtkIMContext], Ptr[GtkWidget], Unit]): Unit = !struct.at(184).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], Ptr[GtkWidget], Unit]]] = value
    def get_preedit_string: CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[Ptr[_root_.pango.all.PangoAttrList]], Ptr[CInt], Unit] = !struct.at(192).asInstanceOf[Ptr[CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[Ptr[_root_.pango.all.PangoAttrList]], Ptr[CInt], Unit]]]
    def get_preedit_string_=(value: CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[Ptr[_root_.pango.all.PangoAttrList]], Ptr[CInt], Unit]): Unit = !struct.at(192).asInstanceOf[Ptr[CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[Ptr[_root_.pango.all.PangoAttrList]], Ptr[CInt], Unit]]] = value
    def filter_keypress: CFuncPtr2[Ptr[GtkIMContext], Ptr[GdkEvent], _root_.glib.all.gboolean] = !struct.at(200).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], Ptr[GdkEvent], _root_.glib.all.gboolean]]]
    def filter_keypress_=(value: CFuncPtr2[Ptr[GtkIMContext], Ptr[GdkEvent], _root_.glib.all.gboolean]): Unit = !struct.at(200).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], Ptr[GdkEvent], _root_.glib.all.gboolean]]] = value
    def focus_in: CFuncPtr1[Ptr[GtkIMContext], Unit] = !struct.at(208).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]]
    def focus_in_=(value: CFuncPtr1[Ptr[GtkIMContext], Unit]): Unit = !struct.at(208).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]] = value
    def focus_out: CFuncPtr1[Ptr[GtkIMContext], Unit] = !struct.at(216).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]]
    def focus_out_=(value: CFuncPtr1[Ptr[GtkIMContext], Unit]): Unit = !struct.at(216).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]] = value
    def reset: CFuncPtr1[Ptr[GtkIMContext], Unit] = !struct.at(224).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]]
    def reset_=(value: CFuncPtr1[Ptr[GtkIMContext], Unit]): Unit = !struct.at(224).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]] = value
    def set_cursor_location: CFuncPtr2[Ptr[GtkIMContext], Ptr[GdkRectangle], Unit] = !struct.at(232).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], Ptr[GdkRectangle], Unit]]]
    def set_cursor_location_=(value: CFuncPtr2[Ptr[GtkIMContext], Ptr[GdkRectangle], Unit]): Unit = !struct.at(232).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], Ptr[GdkRectangle], Unit]]] = value
    def set_use_preedit: CFuncPtr2[Ptr[GtkIMContext], _root_.glib.all.gboolean, Unit] = !struct.at(240).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], _root_.glib.all.gboolean, Unit]]]
    def set_use_preedit_=(value: CFuncPtr2[Ptr[GtkIMContext], _root_.glib.all.gboolean, Unit]): Unit = !struct.at(240).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], _root_.glib.all.gboolean, Unit]]] = value
    def set_surrounding: CFuncPtr4[Ptr[GtkIMContext], CString, CInt, CInt, Unit] = !struct.at(248).asInstanceOf[Ptr[CFuncPtr4[Ptr[GtkIMContext], CString, CInt, CInt, Unit]]]
    def set_surrounding_=(value: CFuncPtr4[Ptr[GtkIMContext], CString, CInt, CInt, Unit]): Unit = !struct.at(248).asInstanceOf[Ptr[CFuncPtr4[Ptr[GtkIMContext], CString, CInt, CInt, Unit]]] = value
    def get_surrounding: CFuncPtr3[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], _root_.glib.all.gboolean] = !struct.at(256).asInstanceOf[Ptr[CFuncPtr3[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], _root_.glib.all.gboolean]]]
    def get_surrounding_=(value: CFuncPtr3[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], _root_.glib.all.gboolean]): Unit = !struct.at(256).asInstanceOf[Ptr[CFuncPtr3[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], _root_.glib.all.gboolean]]] = value
    def set_surrounding_with_selection: CFuncPtr5[Ptr[GtkIMContext], CString, CInt, CInt, CInt, Unit] = !struct.at(264).asInstanceOf[Ptr[CFuncPtr5[Ptr[GtkIMContext], CString, CInt, CInt, CInt, Unit]]]
    def set_surrounding_with_selection_=(value: CFuncPtr5[Ptr[GtkIMContext], CString, CInt, CInt, CInt, Unit]): Unit = !struct.at(264).asInstanceOf[Ptr[CFuncPtr5[Ptr[GtkIMContext], CString, CInt, CInt, CInt, Unit]]] = value
    def get_surrounding_with_selection: CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], Ptr[CInt], _root_.glib.all.gboolean] = !struct.at(272).asInstanceOf[Ptr[CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], Ptr[CInt], _root_.glib.all.gboolean]]]
    def get_surrounding_with_selection_=(value: CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], Ptr[CInt], _root_.glib.all.gboolean]): Unit = !struct.at(272).asInstanceOf[Ptr[CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], Ptr[CInt], _root_.glib.all.gboolean]]] = value
    def _gtk_reserved1: CFuncPtr0[Unit] = !struct.at(280).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
    def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at(280).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
    def _gtk_reserved2: CFuncPtr0[Unit] = !struct.at(288).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
    def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at(288).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
    def _gtk_reserved3: CFuncPtr0[Unit] = !struct.at(296).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
    def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at(296).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
    def _gtk_reserved4: CFuncPtr0[Unit] = !struct.at(304).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
    def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at(304).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
    def _gtk_reserved5: CFuncPtr0[Unit] = !struct.at(312).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
    def _gtk_reserved5_=(value: CFuncPtr0[Unit]): Unit = !struct.at(312).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkimcontextsimple.h
*/
opaque type GtkIMContextSimple = CStruct2[GtkIMContext, Ptr[GtkIMContextSimplePrivate]]
object GtkIMContextSimple:
  given _tag: Tag[GtkIMContextSimple] = Tag.materializeCStruct2Tag[GtkIMContext, Ptr[GtkIMContextSimplePrivate]]
  def apply()(using Zone): Ptr[GtkIMContextSimple] = scala.scalanative.unsafe.alloc[GtkIMContextSimple](1)
  def apply(`object` : GtkIMContext, priv : Ptr[GtkIMContextSimplePrivate])(using Zone): Ptr[GtkIMContextSimple] = 
    val ____ptr = apply()
    (!____ptr).`object` = `object`
    (!____ptr).priv = priv
    ____ptr
  extension (struct: GtkIMContextSimple)
    def `object` : GtkIMContext = struct._1
    def object_=(value: GtkIMContext): Unit = !struct.at1 = value
    def priv : Ptr[GtkIMContextSimplePrivate] = struct._2
    def priv_=(value: Ptr[GtkIMContextSimplePrivate]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkimcontextsimple.h
*/
opaque type GtkIMContextSimpleClass = CStruct1[GtkIMContextClass]
object GtkIMContextSimpleClass:
  given _tag: Tag[GtkIMContextSimpleClass] = Tag.materializeCStruct1Tag[GtkIMContextClass]
  def apply()(using Zone): Ptr[GtkIMContextSimpleClass] = scala.scalanative.unsafe.alloc[GtkIMContextSimpleClass](1)
  def apply(parent_class : GtkIMContextClass)(using Zone): Ptr[GtkIMContextSimpleClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkIMContextSimpleClass)
    def parent_class : GtkIMContextClass = struct._1
    def parent_class_=(value: GtkIMContextClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkimcontextsimple.h
*/
opaque type GtkIMContextSimplePrivate = CStruct0
object GtkIMContextSimplePrivate:
  given _tag: Tag[GtkIMContextSimplePrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkimmulticontext.h
*/
opaque type GtkIMMulticontext = CStruct2[GtkIMContext, Ptr[GtkIMMulticontextPrivate]]
object GtkIMMulticontext:
  given _tag: Tag[GtkIMMulticontext] = Tag.materializeCStruct2Tag[GtkIMContext, Ptr[GtkIMMulticontextPrivate]]
  def apply()(using Zone): Ptr[GtkIMMulticontext] = scala.scalanative.unsafe.alloc[GtkIMMulticontext](1)
  def apply(`object` : GtkIMContext, priv : Ptr[GtkIMMulticontextPrivate])(using Zone): Ptr[GtkIMMulticontext] = 
    val ____ptr = apply()
    (!____ptr).`object` = `object`
    (!____ptr).priv = priv
    ____ptr
  extension (struct: GtkIMMulticontext)
    def `object` : GtkIMContext = struct._1
    def object_=(value: GtkIMContext): Unit = !struct.at1 = value
    def priv : Ptr[GtkIMMulticontextPrivate] = struct._2
    def priv_=(value: Ptr[GtkIMMulticontextPrivate]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkimmulticontext.h
*/
opaque type GtkIMMulticontextClass = CStruct5[GtkIMContextClass, CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object GtkIMMulticontextClass:
  given _tag: Tag[GtkIMMulticontextClass] = Tag.materializeCStruct5Tag[GtkIMContextClass, CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[GtkIMMulticontextClass] = scala.scalanative.unsafe.alloc[GtkIMMulticontextClass](1)
  def apply(parent_class : GtkIMContextClass, _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[GtkIMMulticontextClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    ____ptr
  extension (struct: GtkIMMulticontextClass)
    def parent_class : GtkIMContextClass = struct._1
    def parent_class_=(value: GtkIMContextClass): Unit = !struct.at1 = value
    def _gtk_reserved1 : CFuncPtr0[Unit] = struct._2
    def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at2 = value
    def _gtk_reserved2 : CFuncPtr0[Unit] = struct._3
    def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at3 = value
    def _gtk_reserved3 : CFuncPtr0[Unit] = struct._4
    def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at4 = value
    def _gtk_reserved4 : CFuncPtr0[Unit] = struct._5
    def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at5 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkimmulticontext.h
*/
opaque type GtkIMMulticontextPrivate = CStruct0
object GtkIMMulticontextPrivate:
  given _tag: Tag[GtkIMMulticontextPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkicontheme.h
*/
opaque type GtkIconPaintable = CStruct0
object GtkIconPaintable:
  given _tag: Tag[GtkIconPaintable] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkicontheme.h
*/
opaque type GtkIconTheme = CStruct0
object GtkIconTheme:
  given _tag: Tag[GtkIconTheme] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkiconview.h
*/
opaque type GtkIconView = CStruct0
object GtkIconView:
  given _tag: Tag[GtkIconView] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkimage.h
*/
opaque type GtkImage = CStruct0
object GtkImage:
  given _tag: Tag[GtkImage] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkinfobar.h
*/
opaque type GtkInfoBar = CStruct0
object GtkInfoBar:
  given _tag: Tag[GtkInfoBar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkKeyvalTrigger = CStruct0
object GtkKeyvalTrigger:
  given _tag: Tag[GtkKeyvalTrigger] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkKeyvalTriggerClass = CStruct0
object GtkKeyvalTriggerClass:
  given _tag: Tag[GtkKeyvalTriggerClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklabel.h
*/
opaque type GtkLabel = CStruct0
object GtkLabel:
  given _tag: Tag[GtkLabel] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklayoutchild.h
*/
opaque type GtkLayoutChild = CStruct1[_root_.gobject.all.GObject]
object GtkLayoutChild:
  given _tag: Tag[GtkLayoutChild] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[GtkLayoutChild] = scala.scalanative.unsafe.alloc[GtkLayoutChild](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[GtkLayoutChild] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkLayoutChild)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklayoutchild.h
*/
opaque type GtkLayoutChildClass = CStruct1[_root_.gobject.all.GObjectClass]
object GtkLayoutChildClass:
  given _tag: Tag[GtkLayoutChildClass] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObjectClass]
  def apply()(using Zone): Ptr[GtkLayoutChildClass] = scala.scalanative.unsafe.alloc[GtkLayoutChildClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[GtkLayoutChildClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkLayoutChildClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklayoutmanager.h
*/
opaque type GtkLayoutManager = CStruct1[_root_.gobject.all.GObject]
object GtkLayoutManager:
  given _tag: Tag[GtkLayoutManager] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[GtkLayoutManager] = scala.scalanative.unsafe.alloc[GtkLayoutManager](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[GtkLayoutManager] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkLayoutManager)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * GtkLayoutManagerClass: _request_mode: a virtual function, used to return the preferred request mode for the layout manager; for instance, "width for height" or "height for width"; see `GtkSizeRequestMode` : a virtual function, used to measure the minimum and preferred sizes of the widget using the layout manager for a given orientation : a virtual function, used to allocate the size of the widget using the layout manager _child_type: the type of `GtkLayoutChild` used by this layout manager _layout_child: a virtual function, used to create a `GtkLayoutChild` meta object for the layout properties : a virtual function, called when the widget using the layout manager is attached to a `GtkRoot` : a virtual function, called when the widget using the layout manager is detached from a `GtkRoot`

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklayoutmanager.h
*/
opaque type GtkLayoutManagerClass = CStruct9[_root_.gobject.all.GObjectClass, CFuncPtr2[Ptr[GtkLayoutManager], Ptr[GtkWidget], GtkSizeRequestMode], CFuncPtr8[Ptr[GtkLayoutManager], Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkLayoutManager], Ptr[GtkWidget], CInt, CInt, CInt, Unit], _root_.gobject.all.GType, CFuncPtr3[Ptr[GtkLayoutManager], Ptr[GtkWidget], Ptr[GtkWidget], Ptr[GtkLayoutChild]], CFuncPtr1[Ptr[GtkLayoutManager], Unit], CFuncPtr1[Ptr[GtkLayoutManager], Unit], CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._6]]]
object GtkLayoutManagerClass:
  given _tag: Tag[GtkLayoutManagerClass] = Tag.materializeCStruct9Tag[_root_.gobject.all.GObjectClass, CFuncPtr2[Ptr[GtkLayoutManager], Ptr[GtkWidget], GtkSizeRequestMode], CFuncPtr8[Ptr[GtkLayoutManager], Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkLayoutManager], Ptr[GtkWidget], CInt, CInt, CInt, Unit], _root_.gobject.all.GType, CFuncPtr3[Ptr[GtkLayoutManager], Ptr[GtkWidget], Ptr[GtkWidget], Ptr[GtkLayoutChild]], CFuncPtr1[Ptr[GtkLayoutManager], Unit], CFuncPtr1[Ptr[GtkLayoutManager], Unit], CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._6]]]
  def apply()(using Zone): Ptr[GtkLayoutManagerClass] = scala.scalanative.unsafe.alloc[GtkLayoutManagerClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, get_request_mode : CFuncPtr2[Ptr[GtkLayoutManager], Ptr[GtkWidget], GtkSizeRequestMode], measure : CFuncPtr8[Ptr[GtkLayoutManager], Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit], allocate : CFuncPtr5[Ptr[GtkLayoutManager], Ptr[GtkWidget], CInt, CInt, CInt, Unit], layout_child_type : _root_.gobject.all.GType, create_layout_child : CFuncPtr3[Ptr[GtkLayoutManager], Ptr[GtkWidget], Ptr[GtkWidget], Ptr[GtkLayoutChild]], root : CFuncPtr1[Ptr[GtkLayoutManager], Unit], unroot : CFuncPtr1[Ptr[GtkLayoutManager], Unit], _padding : CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._6]])(using Zone): Ptr[GtkLayoutManagerClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).get_request_mode = get_request_mode
    (!____ptr).measure = measure
    (!____ptr).allocate = allocate
    (!____ptr).layout_child_type = layout_child_type
    (!____ptr).create_layout_child = create_layout_child
    (!____ptr).root = root
    (!____ptr).unroot = unroot
    (!____ptr)._padding = _padding
    ____ptr
  extension (struct: GtkLayoutManagerClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def get_request_mode : CFuncPtr2[Ptr[GtkLayoutManager], Ptr[GtkWidget], GtkSizeRequestMode] = struct._2
    def get_request_mode_=(value: CFuncPtr2[Ptr[GtkLayoutManager], Ptr[GtkWidget], GtkSizeRequestMode]): Unit = !struct.at2 = value
    def measure : CFuncPtr8[Ptr[GtkLayoutManager], Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit] = struct._3
    def measure_=(value: CFuncPtr8[Ptr[GtkLayoutManager], Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit]): Unit = !struct.at3 = value
    def allocate : CFuncPtr5[Ptr[GtkLayoutManager], Ptr[GtkWidget], CInt, CInt, CInt, Unit] = struct._4
    def allocate_=(value: CFuncPtr5[Ptr[GtkLayoutManager], Ptr[GtkWidget], CInt, CInt, CInt, Unit]): Unit = !struct.at4 = value
    def layout_child_type : _root_.gobject.all.GType = struct._5
    def layout_child_type_=(value: _root_.gobject.all.GType): Unit = !struct.at5 = value
    def create_layout_child : CFuncPtr3[Ptr[GtkLayoutManager], Ptr[GtkWidget], Ptr[GtkWidget], Ptr[GtkLayoutChild]] = struct._6
    def create_layout_child_=(value: CFuncPtr3[Ptr[GtkLayoutManager], Ptr[GtkWidget], Ptr[GtkWidget], Ptr[GtkLayoutChild]]): Unit = !struct.at6 = value
    def root : CFuncPtr1[Ptr[GtkLayoutManager], Unit] = struct._7
    def root_=(value: CFuncPtr1[Ptr[GtkLayoutManager], Unit]): Unit = !struct.at7 = value
    def unroot : CFuncPtr1[Ptr[GtkLayoutManager], Unit] = struct._8
    def unroot_=(value: CFuncPtr1[Ptr[GtkLayoutManager], Unit]): Unit = !struct.at8 = value
    def _padding : CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._6]] = struct._9
    def _padding_=(value: CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._6]]): Unit = !struct.at9 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklevelbar.h
*/
opaque type GtkLevelBar = CStruct0
object GtkLevelBar:
  given _tag: Tag[GtkLevelBar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklinkbutton.h
*/
opaque type GtkLinkButton = CStruct0
object GtkLinkButton:
  given _tag: Tag[GtkLinkButton] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistbase.h
*/
opaque type GtkListBase = CStruct0
object GtkListBase:
  given _tag: Tag[GtkListBase] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistbase.h
*/
opaque type GtkListBaseClass = CStruct0
object GtkListBaseClass:
  given _tag: Tag[GtkListBaseClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistbox.h
*/
opaque type GtkListBox = CStruct0
object GtkListBox:
  given _tag: Tag[GtkListBox] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistbox.h
*/
opaque type GtkListBoxRow = CStruct1[GtkWidget]
object GtkListBoxRow:
  given _tag: Tag[GtkListBoxRow] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[GtkListBoxRow] = scala.scalanative.unsafe.alloc[GtkListBoxRow](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[GtkListBoxRow] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkListBoxRow)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * GtkListBoxRowClass: _class: The parent class. :

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistbox.h
*/
opaque type GtkListBoxRowClass = CStruct3[GtkWidgetClass, CFuncPtr1[Ptr[GtkListBoxRow], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkListBoxRowClass:
  given _tag: Tag[GtkListBoxRowClass] = Tag.materializeCStruct3Tag[GtkWidgetClass, CFuncPtr1[Ptr[GtkListBoxRow], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkListBoxRowClass] = scala.scalanative.unsafe.alloc[GtkListBoxRowClass](1)
  def apply(parent_class : GtkWidgetClass, activate : CFuncPtr1[Ptr[GtkListBoxRow], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkListBoxRowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).activate = activate
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkListBoxRowClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def activate : CFuncPtr1[Ptr[GtkListBoxRow], Unit] = struct._2
    def activate_=(value: CFuncPtr1[Ptr[GtkListBoxRow], Unit]): Unit = !struct.at2 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._3
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
opaque type GtkListItem = CStruct0
object GtkListItem:
  given _tag: Tag[GtkListItem] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistitem.h
*/
opaque type GtkListItemClass = CStruct0
object GtkListItemClass:
  given _tag: Tag[GtkListItemClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
opaque type GtkListItemFactory = CStruct0
object GtkListItemFactory:
  given _tag: Tag[GtkListItemFactory] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistitemfactory.h
*/
opaque type GtkListItemFactoryClass = CStruct0
object GtkListItemFactoryClass:
  given _tag: Tag[GtkListItemFactoryClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkliststore.h
*/
opaque type GtkListStore = CStruct2[_root_.gobject.all.GObject, Ptr[GtkListStorePrivate]]
object GtkListStore:
  given _tag: Tag[GtkListStore] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObject, Ptr[GtkListStorePrivate]]
  def apply()(using Zone): Ptr[GtkListStore] = scala.scalanative.unsafe.alloc[GtkListStore](1)
  def apply(parent : _root_.gobject.all.GObject, priv : Ptr[GtkListStorePrivate])(using Zone): Ptr[GtkListStore] = 
    val ____ptr = apply()
    (!____ptr).parent = parent
    (!____ptr).priv = priv
    ____ptr
  extension (struct: GtkListStore)
    def parent : _root_.gobject.all.GObject = struct._1
    def parent_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value
    def priv : Ptr[GtkListStorePrivate] = struct._2
    def priv_=(value: Ptr[GtkListStorePrivate]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkliststore.h
*/
opaque type GtkListStoreClass = CStruct2[_root_.gobject.all.GObjectClass, CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkListStoreClass:
  given _tag: Tag[GtkListStoreClass] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObjectClass, CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkListStoreClass] = scala.scalanative.unsafe.alloc[GtkListStoreClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkListStoreClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkListStoreClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._2
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkliststore.h
*/
opaque type GtkListStorePrivate = CStruct0
object GtkListStorePrivate:
  given _tag: Tag[GtkListStorePrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistview.h
*/
opaque type GtkListView = CStruct0
object GtkListView:
  given _tag: Tag[GtkListView] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistview.h
*/
opaque type GtkListViewClass = CStruct0
object GtkListViewClass:
  given _tag: Tag[GtkListViewClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklockbutton.h
*/
opaque type GtkLockButton = CStruct0
object GtkLockButton:
  given _tag: Tag[GtkLockButton] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmaplistmodel.h
*/
opaque type GtkMapListModel = CStruct0
object GtkMapListModel:
  given _tag: Tag[GtkMapListModel] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmaplistmodel.h
*/
opaque type GtkMapListModelClass = CStruct1[_root_.gobject.all.GObjectClass]
object GtkMapListModelClass:
  given _tag: Tag[GtkMapListModelClass] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObjectClass]
  def apply()(using Zone): Ptr[GtkMapListModelClass] = scala.scalanative.unsafe.alloc[GtkMapListModelClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[GtkMapListModelClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkMapListModelClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediacontrols.h
*/
opaque type GtkMediaControls = CStruct0
object GtkMediaControls:
  given _tag: Tag[GtkMediaControls] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediacontrols.h
*/
opaque type GtkMediaControlsClass = CStruct1[GtkWidgetClass]
object GtkMediaControlsClass:
  given _tag: Tag[GtkMediaControlsClass] = Tag.materializeCStruct1Tag[GtkWidgetClass]
  def apply()(using Zone): Ptr[GtkMediaControlsClass] = scala.scalanative.unsafe.alloc[GtkMediaControlsClass](1)
  def apply(parent_class : GtkWidgetClass)(using Zone): Ptr[GtkMediaControlsClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkMediaControlsClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediafile.h
*/
opaque type GtkMediaFile = CStruct1[GtkMediaStream]
object GtkMediaFile:
  given _tag: Tag[GtkMediaFile] = Tag.materializeCStruct1Tag[GtkMediaStream]
  def apply()(using Zone): Ptr[GtkMediaFile] = scala.scalanative.unsafe.alloc[GtkMediaFile](1)
  def apply(parent_instance : GtkMediaStream)(using Zone): Ptr[GtkMediaFile] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkMediaFile)
    def parent_instance : GtkMediaStream = struct._1
    def parent_instance_=(value: GtkMediaStream): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediafile.h
*/
opaque type GtkMediaFileClass = CStruct7[GtkMediaStreamClass, CFuncPtr1[Ptr[GtkMediaFile], Unit], CFuncPtr1[Ptr[GtkMediaFile], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object GtkMediaFileClass:
  given _tag: Tag[GtkMediaFileClass] = Tag.materializeCStruct7Tag[GtkMediaStreamClass, CFuncPtr1[Ptr[GtkMediaFile], Unit], CFuncPtr1[Ptr[GtkMediaFile], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[GtkMediaFileClass] = scala.scalanative.unsafe.alloc[GtkMediaFileClass](1)
  def apply(parent_class : GtkMediaStreamClass, open : CFuncPtr1[Ptr[GtkMediaFile], Unit], close : CFuncPtr1[Ptr[GtkMediaFile], Unit], _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[GtkMediaFileClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).open = open
    (!____ptr).close = close
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    ____ptr
  extension (struct: GtkMediaFileClass)
    def parent_class : GtkMediaStreamClass = struct._1
    def parent_class_=(value: GtkMediaStreamClass): Unit = !struct.at1 = value
    def open : CFuncPtr1[Ptr[GtkMediaFile], Unit] = struct._2
    def open_=(value: CFuncPtr1[Ptr[GtkMediaFile], Unit]): Unit = !struct.at2 = value
    def close : CFuncPtr1[Ptr[GtkMediaFile], Unit] = struct._3
    def close_=(value: CFuncPtr1[Ptr[GtkMediaFile], Unit]): Unit = !struct.at3 = value
    def _gtk_reserved1 : CFuncPtr0[Unit] = struct._4
    def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at4 = value
    def _gtk_reserved2 : CFuncPtr0[Unit] = struct._5
    def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at5 = value
    def _gtk_reserved3 : CFuncPtr0[Unit] = struct._6
    def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at6 = value
    def _gtk_reserved4 : CFuncPtr0[Unit] = struct._7
    def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at7 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediastream.h
*/
opaque type GtkMediaStream = CStruct1[_root_.gobject.all.GObject]
object GtkMediaStream:
  given _tag: Tag[GtkMediaStream] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[GtkMediaStream] = scala.scalanative.unsafe.alloc[GtkMediaStream](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[GtkMediaStream] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkMediaStream)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediastream.h
*/
opaque type GtkMediaStreamClass = CStruct15[_root_.gobject.all.GObjectClass, CFuncPtr1[Ptr[GtkMediaStream], _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkMediaStream], Unit], CFuncPtr2[Ptr[GtkMediaStream], _root_.glib.all.gint64, Unit], CFuncPtr3[Ptr[GtkMediaStream], _root_.glib.all.gboolean, Double, Unit], CFuncPtr2[Ptr[GtkMediaStream], Ptr[GdkSurface], Unit], CFuncPtr2[Ptr[GtkMediaStream], Ptr[GdkSurface], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object GtkMediaStreamClass:
  given _tag: Tag[GtkMediaStreamClass] = Tag.materializeCStruct15Tag[_root_.gobject.all.GObjectClass, CFuncPtr1[Ptr[GtkMediaStream], _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkMediaStream], Unit], CFuncPtr2[Ptr[GtkMediaStream], _root_.glib.all.gint64, Unit], CFuncPtr3[Ptr[GtkMediaStream], _root_.glib.all.gboolean, Double, Unit], CFuncPtr2[Ptr[GtkMediaStream], Ptr[GdkSurface], Unit], CFuncPtr2[Ptr[GtkMediaStream], Ptr[GdkSurface], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[GtkMediaStreamClass] = scala.scalanative.unsafe.alloc[GtkMediaStreamClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, play : CFuncPtr1[Ptr[GtkMediaStream], _root_.glib.all.gboolean], pause : CFuncPtr1[Ptr[GtkMediaStream], Unit], seek : CFuncPtr2[Ptr[GtkMediaStream], _root_.glib.all.gint64, Unit], update_audio : CFuncPtr3[Ptr[GtkMediaStream], _root_.glib.all.gboolean, Double, Unit], realize : CFuncPtr2[Ptr[GtkMediaStream], Ptr[GdkSurface], Unit], unrealize : CFuncPtr2[Ptr[GtkMediaStream], Ptr[GdkSurface], Unit], _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit], _gtk_reserved5 : CFuncPtr0[Unit], _gtk_reserved6 : CFuncPtr0[Unit], _gtk_reserved7 : CFuncPtr0[Unit], _gtk_reserved8 : CFuncPtr0[Unit])(using Zone): Ptr[GtkMediaStreamClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).play = play
    (!____ptr).pause = pause
    (!____ptr).seek = seek
    (!____ptr).update_audio = update_audio
    (!____ptr).realize = realize
    (!____ptr).unrealize = unrealize
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    (!____ptr)._gtk_reserved5 = _gtk_reserved5
    (!____ptr)._gtk_reserved6 = _gtk_reserved6
    (!____ptr)._gtk_reserved7 = _gtk_reserved7
    (!____ptr)._gtk_reserved8 = _gtk_reserved8
    ____ptr
  extension (struct: GtkMediaStreamClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def play : CFuncPtr1[Ptr[GtkMediaStream], _root_.glib.all.gboolean] = struct._2
    def play_=(value: CFuncPtr1[Ptr[GtkMediaStream], _root_.glib.all.gboolean]): Unit = !struct.at2 = value
    def pause : CFuncPtr1[Ptr[GtkMediaStream], Unit] = struct._3
    def pause_=(value: CFuncPtr1[Ptr[GtkMediaStream], Unit]): Unit = !struct.at3 = value
    def seek : CFuncPtr2[Ptr[GtkMediaStream], _root_.glib.all.gint64, Unit] = struct._4
    def seek_=(value: CFuncPtr2[Ptr[GtkMediaStream], _root_.glib.all.gint64, Unit]): Unit = !struct.at4 = value
    def update_audio : CFuncPtr3[Ptr[GtkMediaStream], _root_.glib.all.gboolean, Double, Unit] = struct._5
    def update_audio_=(value: CFuncPtr3[Ptr[GtkMediaStream], _root_.glib.all.gboolean, Double, Unit]): Unit = !struct.at5 = value
    def realize : CFuncPtr2[Ptr[GtkMediaStream], Ptr[GdkSurface], Unit] = struct._6
    def realize_=(value: CFuncPtr2[Ptr[GtkMediaStream], Ptr[GdkSurface], Unit]): Unit = !struct.at6 = value
    def unrealize : CFuncPtr2[Ptr[GtkMediaStream], Ptr[GdkSurface], Unit] = struct._7
    def unrealize_=(value: CFuncPtr2[Ptr[GtkMediaStream], Ptr[GdkSurface], Unit]): Unit = !struct.at7 = value
    def _gtk_reserved1 : CFuncPtr0[Unit] = struct._8
    def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at8 = value
    def _gtk_reserved2 : CFuncPtr0[Unit] = struct._9
    def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at9 = value
    def _gtk_reserved3 : CFuncPtr0[Unit] = struct._10
    def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at10 = value
    def _gtk_reserved4 : CFuncPtr0[Unit] = struct._11
    def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at11 = value
    def _gtk_reserved5 : CFuncPtr0[Unit] = struct._12
    def _gtk_reserved5_=(value: CFuncPtr0[Unit]): Unit = !struct.at12 = value
    def _gtk_reserved6 : CFuncPtr0[Unit] = struct._13
    def _gtk_reserved6_=(value: CFuncPtr0[Unit]): Unit = !struct.at13 = value
    def _gtk_reserved7 : CFuncPtr0[Unit] = struct._14
    def _gtk_reserved7_=(value: CFuncPtr0[Unit]): Unit = !struct.at14 = value
    def _gtk_reserved8 : CFuncPtr0[Unit] = struct._15
    def _gtk_reserved8_=(value: CFuncPtr0[Unit]): Unit = !struct.at15 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmenubutton.h
*/
opaque type GtkMenuButton = CStruct0
object GtkMenuButton:
  given _tag: Tag[GtkMenuButton] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmessagedialog.h
*/
opaque type GtkMessageDialog = CStruct1[GtkDialog]
object GtkMessageDialog:
  given _tag: Tag[GtkMessageDialog] = Tag.materializeCStruct1Tag[GtkDialog]
  def apply()(using Zone): Ptr[GtkMessageDialog] = scala.scalanative.unsafe.alloc[GtkMessageDialog](1)
  def apply(parent_instance : GtkDialog)(using Zone): Ptr[GtkMessageDialog] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkMessageDialog)
    def parent_instance : GtkDialog = struct._1
    def parent_instance_=(value: GtkDialog): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmessagedialog.h
*/
opaque type GtkMessageDialogClass = CStruct0
object GtkMessageDialogClass:
  given _tag: Tag[GtkMessageDialogClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkMnemonicAction = CStruct0
object GtkMnemonicAction:
  given _tag: Tag[GtkMnemonicAction] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkMnemonicActionClass = CStruct0
object GtkMnemonicActionClass:
  given _tag: Tag[GtkMnemonicActionClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkMnemonicTrigger = CStruct0
object GtkMnemonicTrigger:
  given _tag: Tag[GtkMnemonicTrigger] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkMnemonicTriggerClass = CStruct0
object GtkMnemonicTriggerClass:
  given _tag: Tag[GtkMnemonicTriggerClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmountoperation.h
*/
opaque type GtkMountOperation = CStruct2[_root_.gio.all.GMountOperation, Ptr[GtkMountOperationPrivate]]
object GtkMountOperation:
  given _tag: Tag[GtkMountOperation] = Tag.materializeCStruct2Tag[_root_.gio.all.GMountOperation, Ptr[GtkMountOperationPrivate]]
  def apply()(using Zone): Ptr[GtkMountOperation] = scala.scalanative.unsafe.alloc[GtkMountOperation](1)
  def apply(parent_instance : _root_.gio.all.GMountOperation, priv : Ptr[GtkMountOperationPrivate])(using Zone): Ptr[GtkMountOperation] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr
  extension (struct: GtkMountOperation)
    def parent_instance : _root_.gio.all.GMountOperation = struct._1
    def parent_instance_=(value: _root_.gio.all.GMountOperation): Unit = !struct.at1 = value
    def priv : Ptr[GtkMountOperationPrivate] = struct._2
    def priv_=(value: Ptr[GtkMountOperationPrivate]): Unit = !struct.at2 = value

/**
 * GtkMountOperationClass: _class: The parent class.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmountoperation.h
*/
opaque type GtkMountOperationClass = CStruct5[_root_.gio.all.GMountOperationClass, CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object GtkMountOperationClass:
  given _tag: Tag[GtkMountOperationClass] = Tag.materializeCStruct5Tag[_root_.gio.all.GMountOperationClass, CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[GtkMountOperationClass] = scala.scalanative.unsafe.alloc[GtkMountOperationClass](1)
  def apply(parent_class : _root_.gio.all.GMountOperationClass, _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[GtkMountOperationClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    ____ptr
  extension (struct: GtkMountOperationClass)
    def parent_class : _root_.gio.all.GMountOperationClass = struct._1
    def parent_class_=(value: _root_.gio.all.GMountOperationClass): Unit = !struct.at1 = value
    def _gtk_reserved1 : CFuncPtr0[Unit] = struct._2
    def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at2 = value
    def _gtk_reserved2 : CFuncPtr0[Unit] = struct._3
    def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at3 = value
    def _gtk_reserved3 : CFuncPtr0[Unit] = struct._4
    def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at4 = value
    def _gtk_reserved4 : CFuncPtr0[Unit] = struct._5
    def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at5 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmountoperation.h
*/
opaque type GtkMountOperationPrivate = CStruct0
object GtkMountOperationPrivate:
  given _tag: Tag[GtkMountOperationPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type GtkMultiFilter = CStruct0
object GtkMultiFilter:
  given _tag: Tag[GtkMultiFilter] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type GtkMultiFilterClass = CStruct0
object GtkMultiFilterClass:
  given _tag: Tag[GtkMultiFilterClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultiselection.h
*/
opaque type GtkMultiSelection = CStruct0
object GtkMultiSelection:
  given _tag: Tag[GtkMultiSelection] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultiselection.h
*/
opaque type GtkMultiSelectionClass = CStruct1[_root_.gobject.all.GObjectClass]
object GtkMultiSelectionClass:
  given _tag: Tag[GtkMultiSelectionClass] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObjectClass]
  def apply()(using Zone): Ptr[GtkMultiSelectionClass] = scala.scalanative.unsafe.alloc[GtkMultiSelectionClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[GtkMultiSelectionClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkMultiSelectionClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultisorter.h
*/
opaque type GtkMultiSorter = CStruct0
object GtkMultiSorter:
  given _tag: Tag[GtkMultiSorter] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultisorter.h
*/
opaque type GtkMultiSorterClass = CStruct1[GtkSorterClass]
object GtkMultiSorterClass:
  given _tag: Tag[GtkMultiSorterClass] = Tag.materializeCStruct1Tag[GtkSorterClass]
  def apply()(using Zone): Ptr[GtkMultiSorterClass] = scala.scalanative.unsafe.alloc[GtkMultiSorterClass](1)
  def apply(parent_class : GtkSorterClass)(using Zone): Ptr[GtkMultiSorterClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkMultiSorterClass)
    def parent_class : GtkSorterClass = struct._1
    def parent_class_=(value: GtkSorterClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkNamedAction = CStruct0
object GtkNamedAction:
  given _tag: Tag[GtkNamedAction] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkNamedActionClass = CStruct0
object GtkNamedActionClass:
  given _tag: Tag[GtkNamedActionClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
opaque type GtkNative = CStruct0
object GtkNative:
  given _tag: Tag[GtkNative] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknativedialog.h
*/
opaque type GtkNativeDialog = CStruct1[_root_.gobject.all.GObject]
object GtkNativeDialog:
  given _tag: Tag[GtkNativeDialog] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[GtkNativeDialog] = scala.scalanative.unsafe.alloc[GtkNativeDialog](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[GtkNativeDialog] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkNativeDialog)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * GtkNativeDialogClass: : class handler for the `GtkNativeDialog::response` signal

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknativedialog.h
*/
opaque type GtkNativeDialogClass = CStruct8[_root_.gobject.all.GObjectClass, CFuncPtr2[Ptr[GtkNativeDialog], CInt, Unit], CFuncPtr1[Ptr[GtkNativeDialog], Unit], CFuncPtr1[Ptr[GtkNativeDialog], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object GtkNativeDialogClass:
  given _tag: Tag[GtkNativeDialogClass] = Tag.materializeCStruct8Tag[_root_.gobject.all.GObjectClass, CFuncPtr2[Ptr[GtkNativeDialog], CInt, Unit], CFuncPtr1[Ptr[GtkNativeDialog], Unit], CFuncPtr1[Ptr[GtkNativeDialog], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[GtkNativeDialogClass] = scala.scalanative.unsafe.alloc[GtkNativeDialogClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, response : CFuncPtr2[Ptr[GtkNativeDialog], CInt, Unit], show : CFuncPtr1[Ptr[GtkNativeDialog], Unit], hide : CFuncPtr1[Ptr[GtkNativeDialog], Unit], _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[GtkNativeDialogClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).response = response
    (!____ptr).show = show
    (!____ptr).hide = hide
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    ____ptr
  extension (struct: GtkNativeDialogClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def response : CFuncPtr2[Ptr[GtkNativeDialog], CInt, Unit] = struct._2
    def response_=(value: CFuncPtr2[Ptr[GtkNativeDialog], CInt, Unit]): Unit = !struct.at2 = value
    def show : CFuncPtr1[Ptr[GtkNativeDialog], Unit] = struct._3
    def show_=(value: CFuncPtr1[Ptr[GtkNativeDialog], Unit]): Unit = !struct.at3 = value
    def hide : CFuncPtr1[Ptr[GtkNativeDialog], Unit] = struct._4
    def hide_=(value: CFuncPtr1[Ptr[GtkNativeDialog], Unit]): Unit = !struct.at4 = value
    def _gtk_reserved1 : CFuncPtr0[Unit] = struct._5
    def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at5 = value
    def _gtk_reserved2 : CFuncPtr0[Unit] = struct._6
    def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at6 = value
    def _gtk_reserved3 : CFuncPtr0[Unit] = struct._7
    def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at7 = value
    def _gtk_reserved4 : CFuncPtr0[Unit] = struct._8
    def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at8 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknative.h
*/
opaque type GtkNativeInterface = CStruct0
object GtkNativeInterface:
  given _tag: Tag[GtkNativeInterface] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkNeverTrigger = CStruct0
object GtkNeverTrigger:
  given _tag: Tag[GtkNeverTrigger] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkNeverTriggerClass = CStruct0
object GtkNeverTriggerClass:
  given _tag: Tag[GtkNeverTriggerClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknoselection.h
*/
opaque type GtkNoSelection = CStruct0
object GtkNoSelection:
  given _tag: Tag[GtkNoSelection] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknoselection.h
*/
opaque type GtkNoSelectionClass = CStruct1[_root_.gobject.all.GObjectClass]
object GtkNoSelectionClass:
  given _tag: Tag[GtkNoSelectionClass] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObjectClass]
  def apply()(using Zone): Ptr[GtkNoSelectionClass] = scala.scalanative.unsafe.alloc[GtkNoSelectionClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[GtkNoSelectionClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkNoSelectionClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknotebook.h
*/
opaque type GtkNotebook = CStruct0
object GtkNotebook:
  given _tag: Tag[GtkNotebook] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknotebook.h
*/
opaque type GtkNotebookPage = CStruct0
object GtkNotebookPage:
  given _tag: Tag[GtkNotebookPage] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkNothingAction = CStruct0
object GtkNothingAction:
  given _tag: Tag[GtkNothingAction] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkNothingActionClass = CStruct0
object GtkNothingActionClass:
  given _tag: Tag[GtkNothingActionClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknumericsorter.h
*/
opaque type GtkNumericSorter = CStruct0
object GtkNumericSorter:
  given _tag: Tag[GtkNumericSorter] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknumericsorter.h
*/
opaque type GtkNumericSorterClass = CStruct1[GtkSorterClass]
object GtkNumericSorterClass:
  given _tag: Tag[GtkNumericSorterClass] = Tag.materializeCStruct1Tag[GtkSorterClass]
  def apply()(using Zone): Ptr[GtkNumericSorterClass] = scala.scalanative.unsafe.alloc[GtkNumericSorterClass](1)
  def apply(parent_class : GtkSorterClass)(using Zone): Ptr[GtkNumericSorterClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkNumericSorterClass)
    def parent_class : GtkSorterClass = struct._1
    def parent_class_=(value: GtkSorterClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkexpression.h
*/
opaque type GtkObjectExpression = CStruct0
object GtkObjectExpression:
  given _tag: Tag[GtkObjectExpression] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkorientable.h
*/
opaque type GtkOrientable = CStruct0
object GtkOrientable:
  given _tag: Tag[GtkOrientable] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkorientable.h
*/
opaque type GtkOrientableIface = CStruct1[_root_.gobject.all.GTypeInterface]
object GtkOrientableIface:
  given _tag: Tag[GtkOrientableIface] = Tag.materializeCStruct1Tag[_root_.gobject.all.GTypeInterface]
  def apply()(using Zone): Ptr[GtkOrientableIface] = scala.scalanative.unsafe.alloc[GtkOrientableIface](1)
  def apply(base_iface : _root_.gobject.all.GTypeInterface)(using Zone): Ptr[GtkOrientableIface] = 
    val ____ptr = apply()
    (!____ptr).base_iface = base_iface
    ____ptr
  extension (struct: GtkOrientableIface)
    def base_iface : _root_.gobject.all.GTypeInterface = struct._1
    def base_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkoverlay.h
*/
opaque type GtkOverlay = CStruct0
object GtkOverlay:
  given _tag: Tag[GtkOverlay] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkoverlaylayout.h
*/
opaque type GtkOverlayLayout = CStruct0
object GtkOverlayLayout:
  given _tag: Tag[GtkOverlayLayout] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkoverlaylayout.h
*/
opaque type GtkOverlayLayoutChild = CStruct0
object GtkOverlayLayoutChild:
  given _tag: Tag[GtkOverlayLayoutChild] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkoverlaylayout.h
*/
opaque type GtkOverlayLayoutChildClass = CStruct1[GtkLayoutChildClass]
object GtkOverlayLayoutChildClass:
  given _tag: Tag[GtkOverlayLayoutChildClass] = Tag.materializeCStruct1Tag[GtkLayoutChildClass]
  def apply()(using Zone): Ptr[GtkOverlayLayoutChildClass] = scala.scalanative.unsafe.alloc[GtkOverlayLayoutChildClass](1)
  def apply(parent_class : GtkLayoutChildClass)(using Zone): Ptr[GtkOverlayLayoutChildClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkOverlayLayoutChildClass)
    def parent_class : GtkLayoutChildClass = struct._1
    def parent_class_=(value: GtkLayoutChildClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkoverlaylayout.h
*/
opaque type GtkOverlayLayoutClass = CStruct1[GtkLayoutManagerClass]
object GtkOverlayLayoutClass:
  given _tag: Tag[GtkOverlayLayoutClass] = Tag.materializeCStruct1Tag[GtkLayoutManagerClass]
  def apply()(using Zone): Ptr[GtkOverlayLayoutClass] = scala.scalanative.unsafe.alloc[GtkOverlayLayoutClass](1)
  def apply(parent_class : GtkLayoutManagerClass)(using Zone): Ptr[GtkOverlayLayoutClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkOverlayLayoutClass)
    def parent_class : GtkLayoutManagerClass = struct._1
    def parent_class_=(value: GtkLayoutManagerClass): Unit = !struct.at1 = value

/**
 * GtkPadActionEntry: : the type of pad feature that will trigger this action entry. : the 0-indexed button/ring/strip number that will trigger this action entry.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpadcontroller.h
*/
opaque type GtkPadActionEntry = CStruct5[GtkPadActionType, CInt, CInt, CString, CString]
object GtkPadActionEntry:
  given _tag: Tag[GtkPadActionEntry] = Tag.materializeCStruct5Tag[GtkPadActionType, CInt, CInt, CString, CString]
  def apply()(using Zone): Ptr[GtkPadActionEntry] = scala.scalanative.unsafe.alloc[GtkPadActionEntry](1)
  def apply(`type` : GtkPadActionType, index : CInt, mode : CInt, label : CString, action_name : CString)(using Zone): Ptr[GtkPadActionEntry] = 
    val ____ptr = apply()
    (!____ptr).`type` = `type`
    (!____ptr).index = index
    (!____ptr).mode = mode
    (!____ptr).label = label
    (!____ptr).action_name = action_name
    ____ptr
  extension (struct: GtkPadActionEntry)
    def `type` : GtkPadActionType = struct._1
    def type_=(value: GtkPadActionType): Unit = !struct.at1 = value
    def index : CInt = struct._2
    def index_=(value: CInt): Unit = !struct.at2 = value
    def mode : CInt = struct._3
    def mode_=(value: CInt): Unit = !struct.at3 = value
    def label : CString = struct._4
    def label_=(value: CString): Unit = !struct.at4 = value
    def action_name : CString = struct._5
    def action_name_=(value: CString): Unit = !struct.at5 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpadcontroller.h
*/
opaque type GtkPadController = CStruct0
object GtkPadController:
  given _tag: Tag[GtkPadController] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpadcontroller.h
*/
opaque type GtkPadControllerClass = CStruct0
object GtkPadControllerClass:
  given _tag: Tag[GtkPadControllerClass] = Tag.materializeCStruct0Tag

/**
 * GtkPageRange: : start of page range. : end of page range.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkprintsettings.h
*/
opaque type GtkPageRange = CStruct2[CInt, CInt]
object GtkPageRange:
  given _tag: Tag[GtkPageRange] = Tag.materializeCStruct2Tag[CInt, CInt]
  def apply()(using Zone): Ptr[GtkPageRange] = scala.scalanative.unsafe.alloc[GtkPageRange](1)
  def apply(start : CInt, end : CInt)(using Zone): Ptr[GtkPageRange] = 
    val ____ptr = apply()
    (!____ptr).start = start
    (!____ptr).end = end
    ____ptr
  extension (struct: GtkPageRange)
    def start : CInt = struct._1
    def start_=(value: CInt): Unit = !struct.at1 = value
    def end : CInt = struct._2
    def end_=(value: CInt): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpagesetup.h
*/
opaque type GtkPageSetup = CStruct0
object GtkPageSetup:
  given _tag: Tag[GtkPageSetup] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpaned.h
*/
opaque type GtkPaned = CStruct0
object GtkPaned:
  given _tag: Tag[GtkPaned] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpapersize.h
*/
opaque type GtkPaperSize = CStruct0
object GtkPaperSize:
  given _tag: Tag[GtkPaperSize] = Tag.materializeCStruct0Tag

/**
 * GtkParamSpecExpression:

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkexpression.h
*/
opaque type GtkParamSpecExpression = CStruct1[_root_.gobject.all.GParamSpec]
object GtkParamSpecExpression:
  given _tag: Tag[GtkParamSpecExpression] = Tag.materializeCStruct1Tag[_root_.gobject.all.GParamSpec]
  def apply()(using Zone): Ptr[GtkParamSpecExpression] = scala.scalanative.unsafe.alloc[GtkParamSpecExpression](1)
  def apply(parent_instance : _root_.gobject.all.GParamSpec)(using Zone): Ptr[GtkParamSpecExpression] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkParamSpecExpression)
    def parent_instance : _root_.gobject.all.GParamSpec = struct._1
    def parent_instance_=(value: _root_.gobject.all.GParamSpec): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpasswordentry.h
*/
opaque type GtkPasswordEntry = CStruct0
object GtkPasswordEntry:
  given _tag: Tag[GtkPasswordEntry] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpasswordentrybuffer.h
*/
opaque type GtkPasswordEntryBuffer = CStruct0
object GtkPasswordEntryBuffer:
  given _tag: Tag[GtkPasswordEntryBuffer] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpasswordentrybuffer.h
*/
opaque type GtkPasswordEntryBufferClass = CStruct1[GtkEntryBufferClass]
object GtkPasswordEntryBufferClass:
  given _tag: Tag[GtkPasswordEntryBufferClass] = Tag.materializeCStruct1Tag[GtkEntryBufferClass]
  def apply()(using Zone): Ptr[GtkPasswordEntryBufferClass] = scala.scalanative.unsafe.alloc[GtkPasswordEntryBufferClass](1)
  def apply(parent_class : GtkEntryBufferClass)(using Zone): Ptr[GtkPasswordEntryBufferClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkPasswordEntryBufferClass)
    def parent_class : GtkEntryBufferClass = struct._1
    def parent_class_=(value: GtkEntryBufferClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpasswordentry.h
*/
opaque type GtkPasswordEntryClass = CStruct0
object GtkPasswordEntryClass:
  given _tag: Tag[GtkPasswordEntryClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpicture.h
*/
opaque type GtkPicture = CStruct0
object GtkPicture:
  given _tag: Tag[GtkPicture] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpicture.h
*/
opaque type GtkPictureClass = CStruct1[GtkWidgetClass]
object GtkPictureClass:
  given _tag: Tag[GtkPictureClass] = Tag.materializeCStruct1Tag[GtkWidgetClass]
  def apply()(using Zone): Ptr[GtkPictureClass] = scala.scalanative.unsafe.alloc[GtkPictureClass](1)
  def apply(parent_class : GtkWidgetClass)(using Zone): Ptr[GtkPictureClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkPictureClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpopover.h
*/
opaque type GtkPopover = CStruct1[GtkWidget]
object GtkPopover:
  given _tag: Tag[GtkPopover] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[GtkPopover] = scala.scalanative.unsafe.alloc[GtkPopover](1)
  def apply(parent : GtkWidget)(using Zone): Ptr[GtkPopover] = 
    val ____ptr = apply()
    (!____ptr).parent = parent
    ____ptr
  extension (struct: GtkPopover)
    def parent : GtkWidget = struct._1
    def parent_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpopover.h
*/
opaque type GtkPopoverClass = CStruct4[GtkWidgetClass, CFuncPtr1[Ptr[GtkPopover], Unit], CFuncPtr1[Ptr[GtkPopover], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkPopoverClass:
  given _tag: Tag[GtkPopoverClass] = Tag.materializeCStruct4Tag[GtkWidgetClass, CFuncPtr1[Ptr[GtkPopover], Unit], CFuncPtr1[Ptr[GtkPopover], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkPopoverClass] = scala.scalanative.unsafe.alloc[GtkPopoverClass](1)
  def apply(parent_class : GtkWidgetClass, closed : CFuncPtr1[Ptr[GtkPopover], Unit], activate_default : CFuncPtr1[Ptr[GtkPopover], Unit], reserved : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkPopoverClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).closed = closed
    (!____ptr).activate_default = activate_default
    (!____ptr).reserved = reserved
    ____ptr
  extension (struct: GtkPopoverClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def closed : CFuncPtr1[Ptr[GtkPopover], Unit] = struct._2
    def closed_=(value: CFuncPtr1[Ptr[GtkPopover], Unit]): Unit = !struct.at2 = value
    def activate_default : CFuncPtr1[Ptr[GtkPopover], Unit] = struct._3
    def activate_default_=(value: CFuncPtr1[Ptr[GtkPopover], Unit]): Unit = !struct.at3 = value
    def reserved : CArray[_root_.glib.all.gpointer, Nat._8] = struct._4
    def reserved_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at4 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpopovermenu.h
*/
opaque type GtkPopoverMenu = CStruct0
object GtkPopoverMenu:
  given _tag: Tag[GtkPopoverMenu] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpopovermenubar.h
*/
opaque type GtkPopoverMenuBar = CStruct0
object GtkPopoverMenuBar:
  given _tag: Tag[GtkPopoverMenuBar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkprintcontext.h
*/
opaque type GtkPrintContext = CStruct0
object GtkPrintContext:
  given _tag: Tag[GtkPrintContext] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkprintoperation.h
*/
opaque type GtkPrintOperation = CStruct2[_root_.gobject.all.GObject, Ptr[GtkPrintOperationPrivate]]
object GtkPrintOperation:
  given _tag: Tag[GtkPrintOperation] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObject, Ptr[GtkPrintOperationPrivate]]
  def apply()(using Zone): Ptr[GtkPrintOperation] = scala.scalanative.unsafe.alloc[GtkPrintOperation](1)
  def apply(parent_instance : _root_.gobject.all.GObject, priv : Ptr[GtkPrintOperationPrivate])(using Zone): Ptr[GtkPrintOperation] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr
  extension (struct: GtkPrintOperation)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value
    def priv : Ptr[GtkPrintOperationPrivate] = struct._2
    def priv_=(value: Ptr[GtkPrintOperationPrivate]): Unit = !struct.at2 = value

/**
 * GtkPrintOperationClass: _class: The parent class. : Signal emitted when the print operation run has finished doing everything required for printing. _print: Signal emitted after the user has finished changing print settings in the dialog, before the actual rendering starts. : Signal emitted after the “begin-print” signal, but before the actual rendering starts. _page_setup: Emitted once for every page that is printed, to give the application a chance to modify the page setup. _page: Signal emitted for every page that is printed. _print: Signal emitted after all pages have been rendered. _changed: Emitted at between the various phases of the print operation. _custom_widget: Signal emitted when displaying the print dialog. _widget_apply: Signal emitted right before “begin-print” if you added a custom widget in the “create-custom-widget” handler. : Signal emitted when a preview is requested from the native dialog. _custom_widget: Emitted after change of selected printer.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkprintoperation.h
*/
opaque type GtkPrintOperationClass = CStruct13[_root_.gobject.all.GObjectClass, CFuncPtr2[Ptr[GtkPrintOperation], GtkPrintOperationResult, Unit], CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], Unit], CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], _root_.glib.all.gboolean], CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], CInt, Ptr[GtkPageSetup], Unit], CFuncPtr3[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], CInt, Unit], CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], Unit], CFuncPtr1[Ptr[GtkPrintOperation], Unit], CFuncPtr1[Ptr[GtkPrintOperation], Ptr[GtkWidget]], CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkWidget], Unit], CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Ptr[GtkWindow], _root_.glib.all.gboolean], CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkWidget], Ptr[GtkPageSetup], Ptr[GtkPrintSettings], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkPrintOperationClass:
  given _tag: Tag[GtkPrintOperationClass] = Tag.materializeCStruct13Tag[_root_.gobject.all.GObjectClass, CFuncPtr2[Ptr[GtkPrintOperation], GtkPrintOperationResult, Unit], CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], Unit], CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], _root_.glib.all.gboolean], CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], CInt, Ptr[GtkPageSetup], Unit], CFuncPtr3[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], CInt, Unit], CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], Unit], CFuncPtr1[Ptr[GtkPrintOperation], Unit], CFuncPtr1[Ptr[GtkPrintOperation], Ptr[GtkWidget]], CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkWidget], Unit], CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Ptr[GtkWindow], _root_.glib.all.gboolean], CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkWidget], Ptr[GtkPageSetup], Ptr[GtkPrintSettings], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkPrintOperationClass] = scala.scalanative.unsafe.alloc[GtkPrintOperationClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, done : CFuncPtr2[Ptr[GtkPrintOperation], GtkPrintOperationResult, Unit], begin_print : CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], Unit], paginate : CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], _root_.glib.all.gboolean], request_page_setup : CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], CInt, Ptr[GtkPageSetup], Unit], draw_page : CFuncPtr3[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], CInt, Unit], end_print : CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], Unit], status_changed : CFuncPtr1[Ptr[GtkPrintOperation], Unit], create_custom_widget : CFuncPtr1[Ptr[GtkPrintOperation], Ptr[GtkWidget]], custom_widget_apply : CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkWidget], Unit], preview : CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Ptr[GtkWindow], _root_.glib.all.gboolean], update_custom_widget : CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkWidget], Ptr[GtkPageSetup], Ptr[GtkPrintSettings], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkPrintOperationClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).done = done
    (!____ptr).begin_print = begin_print
    (!____ptr).paginate = paginate
    (!____ptr).request_page_setup = request_page_setup
    (!____ptr).draw_page = draw_page
    (!____ptr).end_print = end_print
    (!____ptr).status_changed = status_changed
    (!____ptr).create_custom_widget = create_custom_widget
    (!____ptr).custom_widget_apply = custom_widget_apply
    (!____ptr).preview = preview
    (!____ptr).update_custom_widget = update_custom_widget
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkPrintOperationClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def done : CFuncPtr2[Ptr[GtkPrintOperation], GtkPrintOperationResult, Unit] = struct._2
    def done_=(value: CFuncPtr2[Ptr[GtkPrintOperation], GtkPrintOperationResult, Unit]): Unit = !struct.at2 = value
    def begin_print : CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], Unit] = struct._3
    def begin_print_=(value: CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], Unit]): Unit = !struct.at3 = value
    def paginate : CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], _root_.glib.all.gboolean] = struct._4
    def paginate_=(value: CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], _root_.glib.all.gboolean]): Unit = !struct.at4 = value
    def request_page_setup : CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], CInt, Ptr[GtkPageSetup], Unit] = struct._5
    def request_page_setup_=(value: CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], CInt, Ptr[GtkPageSetup], Unit]): Unit = !struct.at5 = value
    def draw_page : CFuncPtr3[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], CInt, Unit] = struct._6
    def draw_page_=(value: CFuncPtr3[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], CInt, Unit]): Unit = !struct.at6 = value
    def end_print : CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], Unit] = struct._7
    def end_print_=(value: CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], Unit]): Unit = !struct.at7 = value
    def status_changed : CFuncPtr1[Ptr[GtkPrintOperation], Unit] = struct._8
    def status_changed_=(value: CFuncPtr1[Ptr[GtkPrintOperation], Unit]): Unit = !struct.at8 = value
    def create_custom_widget : CFuncPtr1[Ptr[GtkPrintOperation], Ptr[GtkWidget]] = struct._9
    def create_custom_widget_=(value: CFuncPtr1[Ptr[GtkPrintOperation], Ptr[GtkWidget]]): Unit = !struct.at9 = value
    def custom_widget_apply : CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkWidget], Unit] = struct._10
    def custom_widget_apply_=(value: CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkWidget], Unit]): Unit = !struct.at10 = value
    def preview : CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Ptr[GtkWindow], _root_.glib.all.gboolean] = struct._11
    def preview_=(value: CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Ptr[GtkWindow], _root_.glib.all.gboolean]): Unit = !struct.at11 = value
    def update_custom_widget : CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkWidget], Ptr[GtkPageSetup], Ptr[GtkPrintSettings], Unit] = struct._12
    def update_custom_widget_=(value: CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkWidget], Ptr[GtkPageSetup], Ptr[GtkPrintSettings], Unit]): Unit = !struct.at12 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._13
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at13 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkprintoperationpreview.h
*/
opaque type GtkPrintOperationPreview = CStruct0
object GtkPrintOperationPreview:
  given _tag: Tag[GtkPrintOperationPreview] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkprintoperationpreview.h
*/
opaque type GtkPrintOperationPreviewIface = CStruct14[_root_.gobject.all.GTypeInterface, CFuncPtr2[Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Unit], CFuncPtr3[Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Ptr[GtkPageSetup], Unit], CFuncPtr2[Ptr[GtkPrintOperationPreview], CInt, Unit], CFuncPtr2[Ptr[GtkPrintOperationPreview], CInt, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkPrintOperationPreview], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object GtkPrintOperationPreviewIface:
  given _tag: Tag[GtkPrintOperationPreviewIface] = Tag.materializeCStruct14Tag[_root_.gobject.all.GTypeInterface, CFuncPtr2[Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Unit], CFuncPtr3[Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Ptr[GtkPageSetup], Unit], CFuncPtr2[Ptr[GtkPrintOperationPreview], CInt, Unit], CFuncPtr2[Ptr[GtkPrintOperationPreview], CInt, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkPrintOperationPreview], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[GtkPrintOperationPreviewIface] = scala.scalanative.unsafe.alloc[GtkPrintOperationPreviewIface](1)
  def apply(g_iface : _root_.gobject.all.GTypeInterface, ready : CFuncPtr2[Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Unit], got_page_size : CFuncPtr3[Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Ptr[GtkPageSetup], Unit], render_page : CFuncPtr2[Ptr[GtkPrintOperationPreview], CInt, Unit], is_selected : CFuncPtr2[Ptr[GtkPrintOperationPreview], CInt, _root_.glib.all.gboolean], end_preview : CFuncPtr1[Ptr[GtkPrintOperationPreview], Unit], _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit], _gtk_reserved5 : CFuncPtr0[Unit], _gtk_reserved6 : CFuncPtr0[Unit], _gtk_reserved7 : CFuncPtr0[Unit], _gtk_reserved8 : CFuncPtr0[Unit])(using Zone): Ptr[GtkPrintOperationPreviewIface] = 
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).ready = ready
    (!____ptr).got_page_size = got_page_size
    (!____ptr).render_page = render_page
    (!____ptr).is_selected = is_selected
    (!____ptr).end_preview = end_preview
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    (!____ptr)._gtk_reserved5 = _gtk_reserved5
    (!____ptr)._gtk_reserved6 = _gtk_reserved6
    (!____ptr)._gtk_reserved7 = _gtk_reserved7
    (!____ptr)._gtk_reserved8 = _gtk_reserved8
    ____ptr
  extension (struct: GtkPrintOperationPreviewIface)
    def g_iface : _root_.gobject.all.GTypeInterface = struct._1
    def g_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def ready : CFuncPtr2[Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Unit] = struct._2
    def ready_=(value: CFuncPtr2[Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Unit]): Unit = !struct.at2 = value
    def got_page_size : CFuncPtr3[Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Ptr[GtkPageSetup], Unit] = struct._3
    def got_page_size_=(value: CFuncPtr3[Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Ptr[GtkPageSetup], Unit]): Unit = !struct.at3 = value
    def render_page : CFuncPtr2[Ptr[GtkPrintOperationPreview], CInt, Unit] = struct._4
    def render_page_=(value: CFuncPtr2[Ptr[GtkPrintOperationPreview], CInt, Unit]): Unit = !struct.at4 = value
    def is_selected : CFuncPtr2[Ptr[GtkPrintOperationPreview], CInt, _root_.glib.all.gboolean] = struct._5
    def is_selected_=(value: CFuncPtr2[Ptr[GtkPrintOperationPreview], CInt, _root_.glib.all.gboolean]): Unit = !struct.at5 = value
    def end_preview : CFuncPtr1[Ptr[GtkPrintOperationPreview], Unit] = struct._6
    def end_preview_=(value: CFuncPtr1[Ptr[GtkPrintOperationPreview], Unit]): Unit = !struct.at6 = value
    def _gtk_reserved1 : CFuncPtr0[Unit] = struct._7
    def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at7 = value
    def _gtk_reserved2 : CFuncPtr0[Unit] = struct._8
    def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at8 = value
    def _gtk_reserved3 : CFuncPtr0[Unit] = struct._9
    def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at9 = value
    def _gtk_reserved4 : CFuncPtr0[Unit] = struct._10
    def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at10 = value
    def _gtk_reserved5 : CFuncPtr0[Unit] = struct._11
    def _gtk_reserved5_=(value: CFuncPtr0[Unit]): Unit = !struct.at11 = value
    def _gtk_reserved6 : CFuncPtr0[Unit] = struct._12
    def _gtk_reserved6_=(value: CFuncPtr0[Unit]): Unit = !struct.at12 = value
    def _gtk_reserved7 : CFuncPtr0[Unit] = struct._13
    def _gtk_reserved7_=(value: CFuncPtr0[Unit]): Unit = !struct.at13 = value
    def _gtk_reserved8 : CFuncPtr0[Unit] = struct._14
    def _gtk_reserved8_=(value: CFuncPtr0[Unit]): Unit = !struct.at14 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkprintoperation.h
*/
opaque type GtkPrintOperationPrivate = CStruct0
object GtkPrintOperationPrivate:
  given _tag: Tag[GtkPrintOperationPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkprintsettings.h
*/
opaque type GtkPrintSettings = CStruct0
object GtkPrintSettings:
  given _tag: Tag[GtkPrintSettings] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkprogressbar.h
*/
opaque type GtkProgressBar = CStruct0
object GtkProgressBar:
  given _tag: Tag[GtkProgressBar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkexpression.h
*/
opaque type GtkPropertyExpression = CStruct0
object GtkPropertyExpression:
  given _tag: Tag[GtkPropertyExpression] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkrange.h
*/
opaque type GtkRange = CStruct1[GtkWidget]
object GtkRange:
  given _tag: Tag[GtkRange] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[GtkRange] = scala.scalanative.unsafe.alloc[GtkRange](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[GtkRange] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkRange)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkrange.h
*/
opaque type GtkRangeClass = CStruct7[GtkWidgetClass, CFuncPtr1[Ptr[GtkRange], Unit], CFuncPtr2[Ptr[GtkRange], Double, Unit], CFuncPtr2[Ptr[GtkRange], GtkScrollType, Unit], CFuncPtr2[Ptr[GtkRange], Ptr[GtkBorder], Unit], CFuncPtr3[Ptr[GtkRange], GtkScrollType, Double, _root_.glib.all.gboolean], CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkRangeClass:
  given _tag: Tag[GtkRangeClass] = Tag.materializeCStruct7Tag[GtkWidgetClass, CFuncPtr1[Ptr[GtkRange], Unit], CFuncPtr2[Ptr[GtkRange], Double, Unit], CFuncPtr2[Ptr[GtkRange], GtkScrollType, Unit], CFuncPtr2[Ptr[GtkRange], Ptr[GtkBorder], Unit], CFuncPtr3[Ptr[GtkRange], GtkScrollType, Double, _root_.glib.all.gboolean], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkRangeClass] = scala.scalanative.unsafe.alloc[GtkRangeClass](1)
  def apply(parent_class : GtkWidgetClass, value_changed : CFuncPtr1[Ptr[GtkRange], Unit], adjust_bounds : CFuncPtr2[Ptr[GtkRange], Double, Unit], move_slider : CFuncPtr2[Ptr[GtkRange], GtkScrollType, Unit], get_range_border : CFuncPtr2[Ptr[GtkRange], Ptr[GtkBorder], Unit], change_value : CFuncPtr3[Ptr[GtkRange], GtkScrollType, Double, _root_.glib.all.gboolean], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkRangeClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).value_changed = value_changed
    (!____ptr).adjust_bounds = adjust_bounds
    (!____ptr).move_slider = move_slider
    (!____ptr).get_range_border = get_range_border
    (!____ptr).change_value = change_value
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkRangeClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def value_changed : CFuncPtr1[Ptr[GtkRange], Unit] = struct._2
    def value_changed_=(value: CFuncPtr1[Ptr[GtkRange], Unit]): Unit = !struct.at2 = value
    def adjust_bounds : CFuncPtr2[Ptr[GtkRange], Double, Unit] = struct._3
    def adjust_bounds_=(value: CFuncPtr2[Ptr[GtkRange], Double, Unit]): Unit = !struct.at3 = value
    def move_slider : CFuncPtr2[Ptr[GtkRange], GtkScrollType, Unit] = struct._4
    def move_slider_=(value: CFuncPtr2[Ptr[GtkRange], GtkScrollType, Unit]): Unit = !struct.at4 = value
    def get_range_border : CFuncPtr2[Ptr[GtkRange], Ptr[GtkBorder], Unit] = struct._5
    def get_range_border_=(value: CFuncPtr2[Ptr[GtkRange], Ptr[GtkBorder], Unit]): Unit = !struct.at5 = value
    def change_value : CFuncPtr3[Ptr[GtkRange], GtkScrollType, Double, _root_.glib.all.gboolean] = struct._6
    def change_value_=(value: CFuncPtr3[Ptr[GtkRange], GtkScrollType, Double, _root_.glib.all.gboolean]): Unit = !struct.at6 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._7
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at7 = value

/**
 * GtkRecentData: _name: a UTF-8 encoded string, containing the name of the recently used resource to be displayed, or %NULL; : a UTF-8 encoded string, containing a short description of the resource, or %NULL; _type: the MIME type of the resource; _name: the name of the application that is registering this recently used resource; _exec: command line used to launch this resource; may contain the “%f” and “%u” escape characters which will be expanded to the resource file path and URI respectively when the command line is retrieved; : (array zero-terminated=1): a vector of strings containing groups names; applications that have registered it or not.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkrecentmanager.h
*/
opaque type GtkRecentData = CStruct7[CString, CString, CString, CString, CString, Ptr[CString], _root_.glib.all.gboolean]
object GtkRecentData:
  given _tag: Tag[GtkRecentData] = Tag.materializeCStruct7Tag[CString, CString, CString, CString, CString, Ptr[CString], _root_.glib.all.gboolean]
  def apply()(using Zone): Ptr[GtkRecentData] = scala.scalanative.unsafe.alloc[GtkRecentData](1)
  def apply(display_name : CString, description : CString, mime_type : CString, app_name : CString, app_exec : CString, groups : Ptr[CString], is_private : _root_.glib.all.gboolean)(using Zone): Ptr[GtkRecentData] = 
    val ____ptr = apply()
    (!____ptr).display_name = display_name
    (!____ptr).description = description
    (!____ptr).mime_type = mime_type
    (!____ptr).app_name = app_name
    (!____ptr).app_exec = app_exec
    (!____ptr).groups = groups
    (!____ptr).is_private = is_private
    ____ptr
  extension (struct: GtkRecentData)
    def display_name : CString = struct._1
    def display_name_=(value: CString): Unit = !struct.at1 = value
    def description : CString = struct._2
    def description_=(value: CString): Unit = !struct.at2 = value
    def mime_type : CString = struct._3
    def mime_type_=(value: CString): Unit = !struct.at3 = value
    def app_name : CString = struct._4
    def app_name_=(value: CString): Unit = !struct.at4 = value
    def app_exec : CString = struct._5
    def app_exec_=(value: CString): Unit = !struct.at5 = value
    def groups : Ptr[CString] = struct._6
    def groups_=(value: Ptr[CString]): Unit = !struct.at6 = value
    def is_private : _root_.glib.all.gboolean = struct._7
    def is_private_=(value: _root_.glib.all.gboolean): Unit = !struct.at7 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkrecentmanager.h
*/
opaque type GtkRecentInfo = CStruct0
object GtkRecentInfo:
  given _tag: Tag[GtkRecentInfo] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkrecentmanager.h
*/
opaque type GtkRecentManager = CStruct2[_root_.gobject.all.GObject, Ptr[GtkRecentManagerPrivate]]
object GtkRecentManager:
  given _tag: Tag[GtkRecentManager] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObject, Ptr[GtkRecentManagerPrivate]]
  def apply()(using Zone): Ptr[GtkRecentManager] = scala.scalanative.unsafe.alloc[GtkRecentManager](1)
  def apply(parent_instance : _root_.gobject.all.GObject, priv : Ptr[GtkRecentManagerPrivate])(using Zone): Ptr[GtkRecentManager] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr
  extension (struct: GtkRecentManager)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value
    def priv : Ptr[GtkRecentManagerPrivate] = struct._2
    def priv_=(value: Ptr[GtkRecentManagerPrivate]): Unit = !struct.at2 = value

/**
 * GtkRecentManagerClass:

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkrecentmanager.h
*/
opaque type GtkRecentManagerClass = CStruct6[_root_.gobject.all.GObjectClass, CFuncPtr1[Ptr[GtkRecentManager], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object GtkRecentManagerClass:
  given _tag: Tag[GtkRecentManagerClass] = Tag.materializeCStruct6Tag[_root_.gobject.all.GObjectClass, CFuncPtr1[Ptr[GtkRecentManager], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[GtkRecentManagerClass] = scala.scalanative.unsafe.alloc[GtkRecentManagerClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, changed : CFuncPtr1[Ptr[GtkRecentManager], Unit], _gtk_recent1 : CFuncPtr0[Unit], _gtk_recent2 : CFuncPtr0[Unit], _gtk_recent3 : CFuncPtr0[Unit], _gtk_recent4 : CFuncPtr0[Unit])(using Zone): Ptr[GtkRecentManagerClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).changed = changed
    (!____ptr)._gtk_recent1 = _gtk_recent1
    (!____ptr)._gtk_recent2 = _gtk_recent2
    (!____ptr)._gtk_recent3 = _gtk_recent3
    (!____ptr)._gtk_recent4 = _gtk_recent4
    ____ptr
  extension (struct: GtkRecentManagerClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def changed : CFuncPtr1[Ptr[GtkRecentManager], Unit] = struct._2
    def changed_=(value: CFuncPtr1[Ptr[GtkRecentManager], Unit]): Unit = !struct.at2 = value
    def _gtk_recent1 : CFuncPtr0[Unit] = struct._3
    def _gtk_recent1_=(value: CFuncPtr0[Unit]): Unit = !struct.at3 = value
    def _gtk_recent2 : CFuncPtr0[Unit] = struct._4
    def _gtk_recent2_=(value: CFuncPtr0[Unit]): Unit = !struct.at4 = value
    def _gtk_recent3 : CFuncPtr0[Unit] = struct._5
    def _gtk_recent3_=(value: CFuncPtr0[Unit]): Unit = !struct.at5 = value
    def _gtk_recent4 : CFuncPtr0[Unit] = struct._6
    def _gtk_recent4_=(value: CFuncPtr0[Unit]): Unit = !struct.at6 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkrecentmanager.h
*/
opaque type GtkRecentManagerPrivate = CStruct0
object GtkRecentManagerPrivate:
  given _tag: Tag[GtkRecentManagerPrivate] = Tag.materializeCStruct0Tag

/**
 * GtkRequestedSize:

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksizerequest.h
*/
opaque type GtkRequestedSize = CStruct3[_root_.glib.all.gpointer, CInt, CInt]
object GtkRequestedSize:
  given _tag: Tag[GtkRequestedSize] = Tag.materializeCStruct3Tag[_root_.glib.all.gpointer, CInt, CInt]
  def apply()(using Zone): Ptr[GtkRequestedSize] = scala.scalanative.unsafe.alloc[GtkRequestedSize](1)
  def apply(data : _root_.glib.all.gpointer, minimum_size : CInt, natural_size : CInt)(using Zone): Ptr[GtkRequestedSize] = 
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).minimum_size = minimum_size
    (!____ptr).natural_size = natural_size
    ____ptr
  extension (struct: GtkRequestedSize)
    def data : _root_.glib.all.gpointer = struct._1
    def data_=(value: _root_.glib.all.gpointer): Unit = !struct.at1 = value
    def minimum_size : CInt = struct._2
    def minimum_size_=(value: CInt): Unit = !struct.at2 = value
    def natural_size : CInt = struct._3
    def natural_size_=(value: CInt): Unit = !struct.at3 = value

/**
 * GtkRequisition: : the widget’s desired width : the widget’s desired height

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidget.h
*/
opaque type GtkRequisition = CStruct2[CInt, CInt]
object GtkRequisition:
  given _tag: Tag[GtkRequisition] = Tag.materializeCStruct2Tag[CInt, CInt]
  def apply()(using Zone): Ptr[GtkRequisition] = scala.scalanative.unsafe.alloc[GtkRequisition](1)
  def apply(width : CInt, height : CInt)(using Zone): Ptr[GtkRequisition] = 
    val ____ptr = apply()
    (!____ptr).width = width
    (!____ptr).height = height
    ____ptr
  extension (struct: GtkRequisition)
    def width : CInt = struct._1
    def width_=(value: CInt): Unit = !struct.at1 = value
    def height : CInt = struct._2
    def height_=(value: CInt): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkrevealer.h
*/
opaque type GtkRevealer = CStruct0
object GtkRevealer:
  given _tag: Tag[GtkRevealer] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
opaque type GtkRoot = CStruct0
object GtkRoot:
  given _tag: Tag[GtkRoot] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkroot.h
*/
opaque type GtkRootInterface = CStruct0
object GtkRootInterface:
  given _tag: Tag[GtkRootInterface] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkscale.h
*/
opaque type GtkScale = CStruct1[GtkRange]
object GtkScale:
  given _tag: Tag[GtkScale] = Tag.materializeCStruct1Tag[GtkRange]
  def apply()(using Zone): Ptr[GtkScale] = scala.scalanative.unsafe.alloc[GtkScale](1)
  def apply(parent_instance : GtkRange)(using Zone): Ptr[GtkScale] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkScale)
    def parent_instance : GtkRange = struct._1
    def parent_instance_=(value: GtkRange): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkscalebutton.h
*/
opaque type GtkScaleButton = CStruct1[GtkWidget]
object GtkScaleButton:
  given _tag: Tag[GtkScaleButton] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[GtkScaleButton] = scala.scalanative.unsafe.alloc[GtkScaleButton](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[GtkScaleButton] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkScaleButton)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkscalebutton.h
*/
opaque type GtkScaleButtonClass = CStruct3[GtkWidgetClass, CFuncPtr2[Ptr[GtkScaleButton], Double, Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkScaleButtonClass:
  given _tag: Tag[GtkScaleButtonClass] = Tag.materializeCStruct3Tag[GtkWidgetClass, CFuncPtr2[Ptr[GtkScaleButton], Double, Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkScaleButtonClass] = scala.scalanative.unsafe.alloc[GtkScaleButtonClass](1)
  def apply(parent_class : GtkWidgetClass, value_changed : CFuncPtr2[Ptr[GtkScaleButton], Double, Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkScaleButtonClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).value_changed = value_changed
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkScaleButtonClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def value_changed : CFuncPtr2[Ptr[GtkScaleButton], Double, Unit] = struct._2
    def value_changed_=(value: CFuncPtr2[Ptr[GtkScaleButton], Double, Unit]): Unit = !struct.at2 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._3
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkscale.h
*/
opaque type GtkScaleClass = CStruct3[GtkRangeClass, CFuncPtr3[Ptr[GtkScale], Ptr[CInt], Ptr[CInt], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkScaleClass:
  given _tag: Tag[GtkScaleClass] = Tag.materializeCStruct3Tag[GtkRangeClass, CFuncPtr3[Ptr[GtkScale], Ptr[CInt], Ptr[CInt], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkScaleClass] = scala.scalanative.unsafe.alloc[GtkScaleClass](1)
  def apply(parent_class : GtkRangeClass, get_layout_offsets : CFuncPtr3[Ptr[GtkScale], Ptr[CInt], Ptr[CInt], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkScaleClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).get_layout_offsets = get_layout_offsets
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkScaleClass)
    def parent_class : GtkRangeClass = struct._1
    def parent_class_=(value: GtkRangeClass): Unit = !struct.at1 = value
    def get_layout_offsets : CFuncPtr3[Ptr[GtkScale], Ptr[CInt], Ptr[CInt], Unit] = struct._2
    def get_layout_offsets_=(value: CFuncPtr3[Ptr[GtkScale], Ptr[CInt], Ptr[CInt], Unit]): Unit = !struct.at2 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._3
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkscrollable.h
*/
opaque type GtkScrollable = CStruct0
object GtkScrollable:
  given _tag: Tag[GtkScrollable] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkscrollable.h
*/
opaque type GtkScrollableInterface = CStruct2[_root_.gobject.all.GTypeInterface, CFuncPtr2[Ptr[GtkScrollable], Ptr[GtkBorder], _root_.glib.all.gboolean]]
object GtkScrollableInterface:
  given _tag: Tag[GtkScrollableInterface] = Tag.materializeCStruct2Tag[_root_.gobject.all.GTypeInterface, CFuncPtr2[Ptr[GtkScrollable], Ptr[GtkBorder], _root_.glib.all.gboolean]]
  def apply()(using Zone): Ptr[GtkScrollableInterface] = scala.scalanative.unsafe.alloc[GtkScrollableInterface](1)
  def apply(base_iface : _root_.gobject.all.GTypeInterface, get_border : CFuncPtr2[Ptr[GtkScrollable], Ptr[GtkBorder], _root_.glib.all.gboolean])(using Zone): Ptr[GtkScrollableInterface] = 
    val ____ptr = apply()
    (!____ptr).base_iface = base_iface
    (!____ptr).get_border = get_border
    ____ptr
  extension (struct: GtkScrollableInterface)
    def base_iface : _root_.gobject.all.GTypeInterface = struct._1
    def base_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def get_border : CFuncPtr2[Ptr[GtkScrollable], Ptr[GtkBorder], _root_.glib.all.gboolean] = struct._2
    def get_border_=(value: CFuncPtr2[Ptr[GtkScrollable], Ptr[GtkBorder], _root_.glib.all.gboolean]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkscrollbar.h
*/
opaque type GtkScrollbar = CStruct0
object GtkScrollbar:
  given _tag: Tag[GtkScrollbar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkscrolledwindow.h
*/
opaque type GtkScrolledWindow = CStruct0
object GtkScrolledWindow:
  given _tag: Tag[GtkScrolledWindow] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksearchbar.h
*/
opaque type GtkSearchBar = CStruct0
object GtkSearchBar:
  given _tag: Tag[GtkSearchBar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksearchentry.h
*/
opaque type GtkSearchEntry = CStruct0
object GtkSearchEntry:
  given _tag: Tag[GtkSearchEntry] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkselectionfiltermodel.h
*/
opaque type GtkSelectionFilterModel = CStruct0
object GtkSelectionFilterModel:
  given _tag: Tag[GtkSelectionFilterModel] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkselectionfiltermodel.h
*/
opaque type GtkSelectionFilterModelClass = CStruct1[_root_.gobject.all.GObjectClass]
object GtkSelectionFilterModelClass:
  given _tag: Tag[GtkSelectionFilterModelClass] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObjectClass]
  def apply()(using Zone): Ptr[GtkSelectionFilterModelClass] = scala.scalanative.unsafe.alloc[GtkSelectionFilterModelClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[GtkSelectionFilterModelClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkSelectionFilterModelClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkselectionmodel.h
*/
opaque type GtkSelectionModel = CStruct0
object GtkSelectionModel:
  given _tag: Tag[GtkSelectionModel] = Tag.materializeCStruct0Tag

/**
 * GtkSelectionModelInterface: _selection_in_range: Return a bitset with all currently selected items in the given range. By default, this function will call `GtkSelectionModel::is_selected()` on all items in the given range. _item: Select the item in the given position. If the operation is known to fail, return %FALSE. _item: Unselect the item in the given position. If the operation is known to fail, return %FALSE. _range: Select all items in the given range. If the operation is unsupported or known to fail for all items, return %FALSE. _range: Unselect all items in the given range. If the operation is unsupported or known to fail for all items, return %FALSE. _all: Select all items in the model. If the operation is unsupported or known to fail for all items, return %FALSE. _all: Unselect all items in the model. If the operation is unsupported or known to fail for all items, return %FALSE.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkselectionmodel.h
*/
opaque type GtkSelectionModelInterface = CStruct10[_root_.gobject.all.GTypeInterface, CFuncPtr2[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.guint, Ptr[GtkBitset]], CFuncPtr3[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.gboolean, _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.gboolean], CFuncPtr4[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.gboolean, _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkSelectionModel], _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkSelectionModel], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkSelectionModel], Ptr[GtkBitset], Ptr[GtkBitset], _root_.glib.all.gboolean]]
object GtkSelectionModelInterface:
  given _tag: Tag[GtkSelectionModelInterface] = Tag.materializeCStruct10Tag[_root_.gobject.all.GTypeInterface, CFuncPtr2[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.guint, Ptr[GtkBitset]], CFuncPtr3[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.gboolean, _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.gboolean], CFuncPtr4[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.gboolean, _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkSelectionModel], _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkSelectionModel], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkSelectionModel], Ptr[GtkBitset], Ptr[GtkBitset], _root_.glib.all.gboolean]]
  def apply()(using Zone): Ptr[GtkSelectionModelInterface] = scala.scalanative.unsafe.alloc[GtkSelectionModelInterface](1)
  def apply(g_iface : _root_.gobject.all.GTypeInterface, is_selected : CFuncPtr2[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.gboolean], get_selection_in_range : CFuncPtr3[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.guint, Ptr[GtkBitset]], select_item : CFuncPtr3[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.gboolean, _root_.glib.all.gboolean], unselect_item : CFuncPtr2[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.gboolean], select_range : CFuncPtr4[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.gboolean, _root_.glib.all.gboolean], unselect_range : CFuncPtr3[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.gboolean], select_all : CFuncPtr1[Ptr[GtkSelectionModel], _root_.glib.all.gboolean], unselect_all : CFuncPtr1[Ptr[GtkSelectionModel], _root_.glib.all.gboolean], set_selection : CFuncPtr3[Ptr[GtkSelectionModel], Ptr[GtkBitset], Ptr[GtkBitset], _root_.glib.all.gboolean])(using Zone): Ptr[GtkSelectionModelInterface] = 
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).is_selected = is_selected
    (!____ptr).get_selection_in_range = get_selection_in_range
    (!____ptr).select_item = select_item
    (!____ptr).unselect_item = unselect_item
    (!____ptr).select_range = select_range
    (!____ptr).unselect_range = unselect_range
    (!____ptr).select_all = select_all
    (!____ptr).unselect_all = unselect_all
    (!____ptr).set_selection = set_selection
    ____ptr
  extension (struct: GtkSelectionModelInterface)
    def g_iface : _root_.gobject.all.GTypeInterface = struct._1
    def g_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def is_selected : CFuncPtr2[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.gboolean] = struct._2
    def is_selected_=(value: CFuncPtr2[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.gboolean]): Unit = !struct.at2 = value
    def get_selection_in_range : CFuncPtr3[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.guint, Ptr[GtkBitset]] = struct._3
    def get_selection_in_range_=(value: CFuncPtr3[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.guint, Ptr[GtkBitset]]): Unit = !struct.at3 = value
    def select_item : CFuncPtr3[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.gboolean, _root_.glib.all.gboolean] = struct._4
    def select_item_=(value: CFuncPtr3[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.gboolean, _root_.glib.all.gboolean]): Unit = !struct.at4 = value
    def unselect_item : CFuncPtr2[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.gboolean] = struct._5
    def unselect_item_=(value: CFuncPtr2[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.gboolean]): Unit = !struct.at5 = value
    def select_range : CFuncPtr4[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.gboolean, _root_.glib.all.gboolean] = struct._6
    def select_range_=(value: CFuncPtr4[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.gboolean, _root_.glib.all.gboolean]): Unit = !struct.at6 = value
    def unselect_range : CFuncPtr3[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.gboolean] = struct._7
    def unselect_range_=(value: CFuncPtr3[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.gboolean]): Unit = !struct.at7 = value
    def select_all : CFuncPtr1[Ptr[GtkSelectionModel], _root_.glib.all.gboolean] = struct._8
    def select_all_=(value: CFuncPtr1[Ptr[GtkSelectionModel], _root_.glib.all.gboolean]): Unit = !struct.at8 = value
    def unselect_all : CFuncPtr1[Ptr[GtkSelectionModel], _root_.glib.all.gboolean] = struct._9
    def unselect_all_=(value: CFuncPtr1[Ptr[GtkSelectionModel], _root_.glib.all.gboolean]): Unit = !struct.at9 = value
    def set_selection : CFuncPtr3[Ptr[GtkSelectionModel], Ptr[GtkBitset], Ptr[GtkBitset], _root_.glib.all.gboolean] = struct._10
    def set_selection_=(value: CFuncPtr3[Ptr[GtkSelectionModel], Ptr[GtkBitset], Ptr[GtkBitset], _root_.glib.all.gboolean]): Unit = !struct.at10 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkseparator.h
*/
opaque type GtkSeparator = CStruct0
object GtkSeparator:
  given _tag: Tag[GtkSeparator] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
opaque type GtkSettings = CStruct0
object GtkSettings:
  given _tag: Tag[GtkSettings] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
opaque type GtkShortcut = CStruct0
object GtkShortcut:
  given _tag: Tag[GtkShortcut] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
opaque type GtkShortcutAction = CStruct0
object GtkShortcutAction:
  given _tag: Tag[GtkShortcutAction] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkShortcutActionClass = CStruct0
object GtkShortcutActionClass:
  given _tag: Tag[GtkShortcutActionClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcut.h
*/
opaque type GtkShortcutClass = CStruct1[_root_.gobject.all.GObjectClass]
object GtkShortcutClass:
  given _tag: Tag[GtkShortcutClass] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObjectClass]
  def apply()(using Zone): Ptr[GtkShortcutClass] = scala.scalanative.unsafe.alloc[GtkShortcutClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[GtkShortcutClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkShortcutClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutcontroller.h
*/
opaque type GtkShortcutController = CStruct0
object GtkShortcutController:
  given _tag: Tag[GtkShortcutController] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutcontroller.h
*/
opaque type GtkShortcutControllerClass = CStruct0
object GtkShortcutControllerClass:
  given _tag: Tag[GtkShortcutControllerClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutlabel.h
*/
opaque type GtkShortcutLabel = CStruct0
object GtkShortcutLabel:
  given _tag: Tag[GtkShortcutLabel] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutlabel.h
*/
opaque type GtkShortcutLabelClass = CStruct0
object GtkShortcutLabelClass:
  given _tag: Tag[GtkShortcutLabelClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutmanager.h
*/
opaque type GtkShortcutManager = CStruct0
object GtkShortcutManager:
  given _tag: Tag[GtkShortcutManager] = Tag.materializeCStruct0Tag

/**
 * GtkShortcutManagerInterface: _controller: Add a `GtkShortcutController` to be managed. _controller: Remove a `GtkShortcutController` that had previously been added

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutmanager.h
*/
opaque type GtkShortcutManagerInterface = CStruct3[_root_.gobject.all.GTypeInterface, CFuncPtr2[Ptr[GtkShortcutManager], Ptr[GtkShortcutController], Unit], CFuncPtr2[Ptr[GtkShortcutManager], Ptr[GtkShortcutController], Unit]]
object GtkShortcutManagerInterface:
  given _tag: Tag[GtkShortcutManagerInterface] = Tag.materializeCStruct3Tag[_root_.gobject.all.GTypeInterface, CFuncPtr2[Ptr[GtkShortcutManager], Ptr[GtkShortcutController], Unit], CFuncPtr2[Ptr[GtkShortcutManager], Ptr[GtkShortcutController], Unit]]
  def apply()(using Zone): Ptr[GtkShortcutManagerInterface] = scala.scalanative.unsafe.alloc[GtkShortcutManagerInterface](1)
  def apply(g_iface : _root_.gobject.all.GTypeInterface, add_controller : CFuncPtr2[Ptr[GtkShortcutManager], Ptr[GtkShortcutController], Unit], remove_controller : CFuncPtr2[Ptr[GtkShortcutManager], Ptr[GtkShortcutController], Unit])(using Zone): Ptr[GtkShortcutManagerInterface] = 
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).add_controller = add_controller
    (!____ptr).remove_controller = remove_controller
    ____ptr
  extension (struct: GtkShortcutManagerInterface)
    def g_iface : _root_.gobject.all.GTypeInterface = struct._1
    def g_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def add_controller : CFuncPtr2[Ptr[GtkShortcutManager], Ptr[GtkShortcutController], Unit] = struct._2
    def add_controller_=(value: CFuncPtr2[Ptr[GtkShortcutManager], Ptr[GtkShortcutController], Unit]): Unit = !struct.at2 = value
    def remove_controller : CFuncPtr2[Ptr[GtkShortcutManager], Ptr[GtkShortcutController], Unit] = struct._3
    def remove_controller_=(value: CFuncPtr2[Ptr[GtkShortcutManager], Ptr[GtkShortcutController], Unit]): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
opaque type GtkShortcutTrigger = CStruct0
object GtkShortcutTrigger:
  given _tag: Tag[GtkShortcutTrigger] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type GtkShortcutTriggerClass = CStruct0
object GtkShortcutTriggerClass:
  given _tag: Tag[GtkShortcutTriggerClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutsgroup.h
*/
opaque type GtkShortcutsGroup = CStruct0
object GtkShortcutsGroup:
  given _tag: Tag[GtkShortcutsGroup] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutsgroup.h
*/
opaque type GtkShortcutsGroupClass = CStruct0
object GtkShortcutsGroupClass:
  given _tag: Tag[GtkShortcutsGroupClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutssection.h
*/
opaque type GtkShortcutsSection = CStruct0
object GtkShortcutsSection:
  given _tag: Tag[GtkShortcutsSection] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutssection.h
*/
opaque type GtkShortcutsSectionClass = CStruct0
object GtkShortcutsSectionClass:
  given _tag: Tag[GtkShortcutsSectionClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutsshortcut.h
*/
opaque type GtkShortcutsShortcut = CStruct0
object GtkShortcutsShortcut:
  given _tag: Tag[GtkShortcutsShortcut] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutsshortcut.h
*/
opaque type GtkShortcutsShortcutClass = CStruct0
object GtkShortcutsShortcutClass:
  given _tag: Tag[GtkShortcutsShortcutClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutswindow.h
*/
opaque type GtkShortcutsWindow = CStruct0
object GtkShortcutsWindow:
  given _tag: Tag[GtkShortcutsWindow] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkSignalAction = CStruct0
object GtkSignalAction:
  given _tag: Tag[GtkSignalAction] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type GtkSignalActionClass = CStruct0
object GtkSignalActionClass:
  given _tag: Tag[GtkSignalActionClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksignallistitemfactory.h
*/
opaque type GtkSignalListItemFactory = CStruct0
object GtkSignalListItemFactory:
  given _tag: Tag[GtkSignalListItemFactory] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksignallistitemfactory.h
*/
opaque type GtkSignalListItemFactoryClass = CStruct0
object GtkSignalListItemFactoryClass:
  given _tag: Tag[GtkSignalListItemFactoryClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksingleselection.h
*/
opaque type GtkSingleSelection = CStruct0
object GtkSingleSelection:
  given _tag: Tag[GtkSingleSelection] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksingleselection.h
*/
opaque type GtkSingleSelectionClass = CStruct1[_root_.gobject.all.GObjectClass]
object GtkSingleSelectionClass:
  given _tag: Tag[GtkSingleSelectionClass] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObjectClass]
  def apply()(using Zone): Ptr[GtkSingleSelectionClass] = scala.scalanative.unsafe.alloc[GtkSingleSelectionClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[GtkSingleSelectionClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkSingleSelectionClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksizegroup.h
*/
opaque type GtkSizeGroup = CStruct1[_root_.gobject.all.GObject]
object GtkSizeGroup:
  given _tag: Tag[GtkSizeGroup] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[GtkSizeGroup] = scala.scalanative.unsafe.alloc[GtkSizeGroup](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[GtkSizeGroup] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkSizeGroup)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkslicelistmodel.h
*/
opaque type GtkSliceListModel = CStruct0
object GtkSliceListModel:
  given _tag: Tag[GtkSliceListModel] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkslicelistmodel.h
*/
opaque type GtkSliceListModelClass = CStruct1[_root_.gobject.all.GObjectClass]
object GtkSliceListModelClass:
  given _tag: Tag[GtkSliceListModelClass] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObjectClass]
  def apply()(using Zone): Ptr[GtkSliceListModelClass] = scala.scalanative.unsafe.alloc[GtkSliceListModelClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[GtkSliceListModelClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkSliceListModelClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksnapshot.h
*/
opaque type GtkSnapshotClass = CStruct0
object GtkSnapshotClass:
  given _tag: Tag[GtkSnapshotClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksortlistmodel.h
*/
opaque type GtkSortListModel = CStruct0
object GtkSortListModel:
  given _tag: Tag[GtkSortListModel] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksortlistmodel.h
*/
opaque type GtkSortListModelClass = CStruct1[_root_.gobject.all.GObjectClass]
object GtkSortListModelClass:
  given _tag: Tag[GtkSortListModelClass] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObjectClass]
  def apply()(using Zone): Ptr[GtkSortListModelClass] = scala.scalanative.unsafe.alloc[GtkSortListModelClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[GtkSortListModelClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkSortListModelClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksorter.h
*/
opaque type GtkSorter = CStruct1[_root_.gobject.all.GObject]
object GtkSorter:
  given _tag: Tag[GtkSorter] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[GtkSorter] = scala.scalanative.unsafe.alloc[GtkSorter](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[GtkSorter] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkSorter)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * GtkSorterClass : Compare two items. See gtk_sorter_compare() for details. _order: Get the `GtkSorderOrder` that applies to the current sorter. If unimplemented, it returns %GTK_SORTER_ORDER_PARTIAL.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksorter.h
*/
opaque type GtkSorterClass = CStruct11[_root_.gobject.all.GObjectClass, CFuncPtr3[Ptr[GtkSorter], _root_.glib.all.gpointer, _root_.glib.all.gpointer, GtkOrdering], CFuncPtr1[Ptr[GtkSorter], GtkSorterOrder], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object GtkSorterClass:
  given _tag: Tag[GtkSorterClass] = Tag.materializeCStruct11Tag[_root_.gobject.all.GObjectClass, CFuncPtr3[Ptr[GtkSorter], _root_.glib.all.gpointer, _root_.glib.all.gpointer, GtkOrdering], CFuncPtr1[Ptr[GtkSorter], GtkSorterOrder], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[GtkSorterClass] = scala.scalanative.unsafe.alloc[GtkSorterClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, compare : CFuncPtr3[Ptr[GtkSorter], _root_.glib.all.gpointer, _root_.glib.all.gpointer, GtkOrdering], get_order : CFuncPtr1[Ptr[GtkSorter], GtkSorterOrder], _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit], _gtk_reserved5 : CFuncPtr0[Unit], _gtk_reserved6 : CFuncPtr0[Unit], _gtk_reserved7 : CFuncPtr0[Unit], _gtk_reserved8 : CFuncPtr0[Unit])(using Zone): Ptr[GtkSorterClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).compare = compare
    (!____ptr).get_order = get_order
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    (!____ptr)._gtk_reserved5 = _gtk_reserved5
    (!____ptr)._gtk_reserved6 = _gtk_reserved6
    (!____ptr)._gtk_reserved7 = _gtk_reserved7
    (!____ptr)._gtk_reserved8 = _gtk_reserved8
    ____ptr
  extension (struct: GtkSorterClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def compare : CFuncPtr3[Ptr[GtkSorter], _root_.glib.all.gpointer, _root_.glib.all.gpointer, GtkOrdering] = struct._2
    def compare_=(value: CFuncPtr3[Ptr[GtkSorter], _root_.glib.all.gpointer, _root_.glib.all.gpointer, GtkOrdering]): Unit = !struct.at2 = value
    def get_order : CFuncPtr1[Ptr[GtkSorter], GtkSorterOrder] = struct._3
    def get_order_=(value: CFuncPtr1[Ptr[GtkSorter], GtkSorterOrder]): Unit = !struct.at3 = value
    def _gtk_reserved1 : CFuncPtr0[Unit] = struct._4
    def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at4 = value
    def _gtk_reserved2 : CFuncPtr0[Unit] = struct._5
    def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at5 = value
    def _gtk_reserved3 : CFuncPtr0[Unit] = struct._6
    def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at6 = value
    def _gtk_reserved4 : CFuncPtr0[Unit] = struct._7
    def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at7 = value
    def _gtk_reserved5 : CFuncPtr0[Unit] = struct._8
    def _gtk_reserved5_=(value: CFuncPtr0[Unit]): Unit = !struct.at8 = value
    def _gtk_reserved6 : CFuncPtr0[Unit] = struct._9
    def _gtk_reserved6_=(value: CFuncPtr0[Unit]): Unit = !struct.at9 = value
    def _gtk_reserved7 : CFuncPtr0[Unit] = struct._10
    def _gtk_reserved7_=(value: CFuncPtr0[Unit]): Unit = !struct.at10 = value
    def _gtk_reserved8 : CFuncPtr0[Unit] = struct._11
    def _gtk_reserved8_=(value: CFuncPtr0[Unit]): Unit = !struct.at11 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkspinbutton.h
*/
opaque type GtkSpinButton = CStruct0
object GtkSpinButton:
  given _tag: Tag[GtkSpinButton] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkspinner.h
*/
opaque type GtkSpinner = CStruct0
object GtkSpinner:
  given _tag: Tag[GtkSpinner] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstack.h
*/
opaque type GtkStack = CStruct0
object GtkStack:
  given _tag: Tag[GtkStack] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstack.h
*/
opaque type GtkStackPage = CStruct0
object GtkStackPage:
  given _tag: Tag[GtkStackPage] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstacksidebar.h
*/
opaque type GtkStackSidebar = CStruct0
object GtkStackSidebar:
  given _tag: Tag[GtkStackSidebar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstackswitcher.h
*/
opaque type GtkStackSwitcher = CStruct0
object GtkStackSwitcher:
  given _tag: Tag[GtkStackSwitcher] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstatusbar.h
*/
opaque type GtkStatusbar = CStruct0
object GtkStatusbar:
  given _tag: Tag[GtkStatusbar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringfilter.h
*/
opaque type GtkStringFilter = CStruct0
object GtkStringFilter:
  given _tag: Tag[GtkStringFilter] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringfilter.h
*/
opaque type GtkStringFilterClass = CStruct1[GtkFilterClass]
object GtkStringFilterClass:
  given _tag: Tag[GtkStringFilterClass] = Tag.materializeCStruct1Tag[GtkFilterClass]
  def apply()(using Zone): Ptr[GtkStringFilterClass] = scala.scalanative.unsafe.alloc[GtkStringFilterClass](1)
  def apply(parent_class : GtkFilterClass)(using Zone): Ptr[GtkStringFilterClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkStringFilterClass)
    def parent_class : GtkFilterClass = struct._1
    def parent_class_=(value: GtkFilterClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringlist.h
*/
opaque type GtkStringList = CStruct0
object GtkStringList:
  given _tag: Tag[GtkStringList] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringlist.h
*/
opaque type GtkStringListClass = CStruct1[_root_.gobject.all.GObjectClass]
object GtkStringListClass:
  given _tag: Tag[GtkStringListClass] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObjectClass]
  def apply()(using Zone): Ptr[GtkStringListClass] = scala.scalanative.unsafe.alloc[GtkStringListClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[GtkStringListClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkStringListClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringlist.h
*/
opaque type GtkStringObject = CStruct0
object GtkStringObject:
  given _tag: Tag[GtkStringObject] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringlist.h
*/
opaque type GtkStringObjectClass = CStruct1[_root_.gobject.all.GObjectClass]
object GtkStringObjectClass:
  given _tag: Tag[GtkStringObjectClass] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObjectClass]
  def apply()(using Zone): Ptr[GtkStringObjectClass] = scala.scalanative.unsafe.alloc[GtkStringObjectClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[GtkStringObjectClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkStringObjectClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringsorter.h
*/
opaque type GtkStringSorter = CStruct0
object GtkStringSorter:
  given _tag: Tag[GtkStringSorter] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringsorter.h
*/
opaque type GtkStringSorterClass = CStruct1[GtkSorterClass]
object GtkStringSorterClass:
  given _tag: Tag[GtkStringSorterClass] = Tag.materializeCStruct1Tag[GtkSorterClass]
  def apply()(using Zone): Ptr[GtkStringSorterClass] = scala.scalanative.unsafe.alloc[GtkStringSorterClass](1)
  def apply(parent_class : GtkSorterClass)(using Zone): Ptr[GtkStringSorterClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkStringSorterClass)
    def parent_class : GtkSorterClass = struct._1
    def parent_class_=(value: GtkSorterClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstylecontext.h
*/
opaque type GtkStyleContext = CStruct1[_root_.gobject.all.GObject]
object GtkStyleContext:
  given _tag: Tag[GtkStyleContext] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[GtkStyleContext] = scala.scalanative.unsafe.alloc[GtkStyleContext](1)
  def apply(parent_object : _root_.gobject.all.GObject)(using Zone): Ptr[GtkStyleContext] = 
    val ____ptr = apply()
    (!____ptr).parent_object = parent_object
    ____ptr
  extension (struct: GtkStyleContext)
    def parent_object : _root_.gobject.all.GObject = struct._1
    def parent_object_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstylecontext.h
*/
opaque type GtkStyleContextClass = CStruct6[_root_.gobject.all.GObjectClass, CFuncPtr1[Ptr[GtkStyleContext], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object GtkStyleContextClass:
  given _tag: Tag[GtkStyleContextClass] = Tag.materializeCStruct6Tag[_root_.gobject.all.GObjectClass, CFuncPtr1[Ptr[GtkStyleContext], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[GtkStyleContextClass] = scala.scalanative.unsafe.alloc[GtkStyleContextClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, changed : CFuncPtr1[Ptr[GtkStyleContext], Unit], _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[GtkStyleContextClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).changed = changed
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    ____ptr
  extension (struct: GtkStyleContextClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def changed : CFuncPtr1[Ptr[GtkStyleContext], Unit] = struct._2
    def changed_=(value: CFuncPtr1[Ptr[GtkStyleContext], Unit]): Unit = !struct.at2 = value
    def _gtk_reserved1 : CFuncPtr0[Unit] = struct._3
    def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at3 = value
    def _gtk_reserved2 : CFuncPtr0[Unit] = struct._4
    def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at4 = value
    def _gtk_reserved3 : CFuncPtr0[Unit] = struct._5
    def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at5 = value
    def _gtk_reserved4 : CFuncPtr0[Unit] = struct._6
    def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at6 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstyleprovider.h
*/
opaque type GtkStyleProvider = CStruct0
object GtkStyleProvider:
  given _tag: Tag[GtkStyleProvider] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkswitch.h
*/
opaque type GtkSwitch = CStruct0
object GtkSwitch:
  given _tag: Tag[GtkSwitch] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksymbolicpaintable.h
*/
opaque type GtkSymbolicPaintable = CStruct0
object GtkSymbolicPaintable:
  given _tag: Tag[GtkSymbolicPaintable] = Tag.materializeCStruct0Tag

/**
 * GtkSymbolicPaintableInterface: _symbolic: Snapshot the paintable using the given colors. See `GtkSymbolicPaintable::snapshot_symbolic()` for details. If this function is not implemented, [vfunc.Paintable.snapshot] will be called.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksymbolicpaintable.h
*/
opaque type GtkSymbolicPaintableInterface = CStruct2[_root_.gobject.all.GTypeInterface, CFuncPtr6[Ptr[GtkSymbolicPaintable], Ptr[GdkSnapshot], Double, Double, Ptr[GdkRGBA], _root_.glib.all.gsize, Unit]]
object GtkSymbolicPaintableInterface:
  given _tag: Tag[GtkSymbolicPaintableInterface] = Tag.materializeCStruct2Tag[_root_.gobject.all.GTypeInterface, CFuncPtr6[Ptr[GtkSymbolicPaintable], Ptr[GdkSnapshot], Double, Double, Ptr[GdkRGBA], _root_.glib.all.gsize, Unit]]
  def apply()(using Zone): Ptr[GtkSymbolicPaintableInterface] = scala.scalanative.unsafe.alloc[GtkSymbolicPaintableInterface](1)
  def apply(g_iface : _root_.gobject.all.GTypeInterface, snapshot_symbolic : CFuncPtr6[Ptr[GtkSymbolicPaintable], Ptr[GdkSnapshot], Double, Double, Ptr[GdkRGBA], _root_.glib.all.gsize, Unit])(using Zone): Ptr[GtkSymbolicPaintableInterface] = 
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).snapshot_symbolic = snapshot_symbolic
    ____ptr
  extension (struct: GtkSymbolicPaintableInterface)
    def g_iface : _root_.gobject.all.GTypeInterface = struct._1
    def g_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def snapshot_symbolic : CFuncPtr6[Ptr[GtkSymbolicPaintable], Ptr[GdkSnapshot], Double, Double, Ptr[GdkRGBA], _root_.glib.all.gsize, Unit] = struct._2
    def snapshot_symbolic_=(value: CFuncPtr6[Ptr[GtkSymbolicPaintable], Ptr[GdkSnapshot], Double, Double, Ptr[GdkRGBA], _root_.glib.all.gsize, Unit]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktext.h
*/
opaque type GtkText = CStruct1[GtkWidget]
object GtkText:
  given _tag: Tag[GtkText] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[GtkText] = scala.scalanative.unsafe.alloc[GtkText](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[GtkText] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkText)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktextbuffer.h
*/
opaque type GtkTextBuffer = CStruct2[_root_.gobject.all.GObject, Ptr[GtkTextBufferPrivate]]
object GtkTextBuffer:
  given _tag: Tag[GtkTextBuffer] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObject, Ptr[GtkTextBufferPrivate]]
  def apply()(using Zone): Ptr[GtkTextBuffer] = scala.scalanative.unsafe.alloc[GtkTextBuffer](1)
  def apply(parent_instance : _root_.gobject.all.GObject, priv : Ptr[GtkTextBufferPrivate])(using Zone): Ptr[GtkTextBuffer] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr
  extension (struct: GtkTextBuffer)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value
    def priv : Ptr[GtkTextBufferPrivate] = struct._2
    def priv_=(value: Ptr[GtkTextBufferPrivate]): Unit = !struct.at2 = value

/**
 * GtkTextBufferClass: _class: The object class structure needs to be the first. _text: The class handler for the `GtkTextBuffer::insert-text` signal. _paintable: The class handler for the `GtkTextBuffer::insert-paintable` signal. _child_anchor: The class handler for the `GtkTextBuffer::insert-child-anchor` signal. _range: The class handler for the `GtkTextBuffer::delete-range` signal. : The class handler for the `GtkTextBuffer::changed` signal. _changed: The class handler for the `GtkTextBuffer::modified-changed` signal. _set: The class handler for the `GtkTextBuffer::mark-set` signal. _deleted: The class handler for the `GtkTextBuffer::mark-deleted` signal. _tag: The class handler for the `GtkTextBuffer::apply-tag` signal. _tag: The class handler for the `GtkTextBuffer::remove-tag` signal. _user_action: The class handler for the `GtkTextBuffer::begin-user-action` signal. _user_action: The class handler for the `GtkTextBuffer::end-user-action` signal. _done: The class handler for the `GtkTextBuffer::paste-done` signal. : The class handler for the `GtkTextBuffer::undo` signal : The class handler for the `GtkTextBuffer::redo` signal

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktextbuffer.h
*/
opaque type GtkTextBufferClass = CStruct20[_root_.gobject.all.GObjectClass, CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextIter], CString, CInt, Unit], CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GdkPaintable], Unit], CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextChildAnchor], Unit], CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextMark], Unit], CFuncPtr2[Ptr[GtkTextBuffer], Ptr[GtkTextMark], Unit], CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextTag], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit], CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextTag], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr2[Ptr[GtkTextBuffer], Ptr[GdkClipboard], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object GtkTextBufferClass:
  given _tag: Tag[GtkTextBufferClass] = Tag.materializeCStruct20Tag[_root_.gobject.all.GObjectClass, CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextIter], CString, CInt, Unit], CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GdkPaintable], Unit], CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextChildAnchor], Unit], CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextMark], Unit], CFuncPtr2[Ptr[GtkTextBuffer], Ptr[GtkTextMark], Unit], CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextTag], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit], CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextTag], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr2[Ptr[GtkTextBuffer], Ptr[GdkClipboard], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[GtkTextBufferClass] = scala.scalanative.unsafe.alloc[GtkTextBufferClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, insert_text : CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextIter], CString, CInt, Unit], insert_paintable : CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GdkPaintable], Unit], insert_child_anchor : CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextChildAnchor], Unit], delete_range : CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit], changed : CFuncPtr1[Ptr[GtkTextBuffer], Unit], modified_changed : CFuncPtr1[Ptr[GtkTextBuffer], Unit], mark_set : CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextMark], Unit], mark_deleted : CFuncPtr2[Ptr[GtkTextBuffer], Ptr[GtkTextMark], Unit], apply_tag : CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextTag], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit], remove_tag : CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextTag], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit], begin_user_action : CFuncPtr1[Ptr[GtkTextBuffer], Unit], end_user_action : CFuncPtr1[Ptr[GtkTextBuffer], Unit], paste_done : CFuncPtr2[Ptr[GtkTextBuffer], Ptr[GdkClipboard], Unit], undo : CFuncPtr1[Ptr[GtkTextBuffer], Unit], redo : CFuncPtr1[Ptr[GtkTextBuffer], Unit], _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[GtkTextBufferClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).insert_text = insert_text
    (!____ptr).insert_paintable = insert_paintable
    (!____ptr).insert_child_anchor = insert_child_anchor
    (!____ptr).delete_range = delete_range
    (!____ptr).changed = changed
    (!____ptr).modified_changed = modified_changed
    (!____ptr).mark_set = mark_set
    (!____ptr).mark_deleted = mark_deleted
    (!____ptr).apply_tag = apply_tag
    (!____ptr).remove_tag = remove_tag
    (!____ptr).begin_user_action = begin_user_action
    (!____ptr).end_user_action = end_user_action
    (!____ptr).paste_done = paste_done
    (!____ptr).undo = undo
    (!____ptr).redo = redo
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    ____ptr
  extension (struct: GtkTextBufferClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def insert_text : CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextIter], CString, CInt, Unit] = struct._2
    def insert_text_=(value: CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextIter], CString, CInt, Unit]): Unit = !struct.at2 = value
    def insert_paintable : CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GdkPaintable], Unit] = struct._3
    def insert_paintable_=(value: CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GdkPaintable], Unit]): Unit = !struct.at3 = value
    def insert_child_anchor : CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextChildAnchor], Unit] = struct._4
    def insert_child_anchor_=(value: CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextChildAnchor], Unit]): Unit = !struct.at4 = value
    def delete_range : CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit] = struct._5
    def delete_range_=(value: CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit]): Unit = !struct.at5 = value
    def changed : CFuncPtr1[Ptr[GtkTextBuffer], Unit] = struct._6
    def changed_=(value: CFuncPtr1[Ptr[GtkTextBuffer], Unit]): Unit = !struct.at6 = value
    def modified_changed : CFuncPtr1[Ptr[GtkTextBuffer], Unit] = struct._7
    def modified_changed_=(value: CFuncPtr1[Ptr[GtkTextBuffer], Unit]): Unit = !struct.at7 = value
    def mark_set : CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextMark], Unit] = struct._8
    def mark_set_=(value: CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextMark], Unit]): Unit = !struct.at8 = value
    def mark_deleted : CFuncPtr2[Ptr[GtkTextBuffer], Ptr[GtkTextMark], Unit] = struct._9
    def mark_deleted_=(value: CFuncPtr2[Ptr[GtkTextBuffer], Ptr[GtkTextMark], Unit]): Unit = !struct.at9 = value
    def apply_tag : CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextTag], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit] = struct._10
    def apply_tag_=(value: CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextTag], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit]): Unit = !struct.at10 = value
    def remove_tag : CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextTag], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit] = struct._11
    def remove_tag_=(value: CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextTag], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit]): Unit = !struct.at11 = value
    def begin_user_action : CFuncPtr1[Ptr[GtkTextBuffer], Unit] = struct._12
    def begin_user_action_=(value: CFuncPtr1[Ptr[GtkTextBuffer], Unit]): Unit = !struct.at12 = value
    def end_user_action : CFuncPtr1[Ptr[GtkTextBuffer], Unit] = struct._13
    def end_user_action_=(value: CFuncPtr1[Ptr[GtkTextBuffer], Unit]): Unit = !struct.at13 = value
    def paste_done : CFuncPtr2[Ptr[GtkTextBuffer], Ptr[GdkClipboard], Unit] = struct._14
    def paste_done_=(value: CFuncPtr2[Ptr[GtkTextBuffer], Ptr[GdkClipboard], Unit]): Unit = !struct.at14 = value
    def undo : CFuncPtr1[Ptr[GtkTextBuffer], Unit] = struct._15
    def undo_=(value: CFuncPtr1[Ptr[GtkTextBuffer], Unit]): Unit = !struct.at15 = value
    def redo : CFuncPtr1[Ptr[GtkTextBuffer], Unit] = struct._16
    def redo_=(value: CFuncPtr1[Ptr[GtkTextBuffer], Unit]): Unit = !struct.at16 = value
    def _gtk_reserved1 : CFuncPtr0[Unit] = struct._17
    def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at17 = value
    def _gtk_reserved2 : CFuncPtr0[Unit] = struct._18
    def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at18 = value
    def _gtk_reserved3 : CFuncPtr0[Unit] = struct._19
    def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at19 = value
    def _gtk_reserved4 : CFuncPtr0[Unit] = struct._20
    def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at20 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktextbuffer.h
*/
opaque type GtkTextBufferPrivate = CStruct0
object GtkTextBufferPrivate:
  given _tag: Tag[GtkTextBufferPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktextchild.h
*/
opaque type GtkTextChildAnchor = CStruct2[_root_.gobject.all.GObject, _root_.glib.all.gpointer]
object GtkTextChildAnchor:
  given _tag: Tag[GtkTextChildAnchor] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObject, _root_.glib.all.gpointer]
  def apply()(using Zone): Ptr[GtkTextChildAnchor] = scala.scalanative.unsafe.alloc[GtkTextChildAnchor](1)
  def apply(parent_instance : _root_.gobject.all.GObject, segment : _root_.glib.all.gpointer)(using Zone): Ptr[GtkTextChildAnchor] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).segment = segment
    ____ptr
  extension (struct: GtkTextChildAnchor)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value
    def segment : _root_.glib.all.gpointer = struct._2
    def segment_=(value: _root_.glib.all.gpointer): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktextchild.h
*/
opaque type GtkTextChildAnchorClass = CStruct5[_root_.gobject.all.GObjectClass, CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object GtkTextChildAnchorClass:
  given _tag: Tag[GtkTextChildAnchorClass] = Tag.materializeCStruct5Tag[_root_.gobject.all.GObjectClass, CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[GtkTextChildAnchorClass] = scala.scalanative.unsafe.alloc[GtkTextChildAnchorClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[GtkTextChildAnchorClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    ____ptr
  extension (struct: GtkTextChildAnchorClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def _gtk_reserved1 : CFuncPtr0[Unit] = struct._2
    def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at2 = value
    def _gtk_reserved2 : CFuncPtr0[Unit] = struct._3
    def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at3 = value
    def _gtk_reserved3 : CFuncPtr0[Unit] = struct._4
    def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at4 = value
    def _gtk_reserved4 : CFuncPtr0[Unit] = struct._5
    def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at5 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktextiter.h
*/
opaque type GtkTextIter = CStruct14[_root_.glib.all.gpointer, _root_.glib.all.gpointer, CInt, CInt, CInt, CInt, CInt, CInt, _root_.glib.all.gpointer, _root_.glib.all.gpointer, CInt, CInt, CInt, _root_.glib.all.gpointer]
object GtkTextIter:
  given _tag: Tag[GtkTextIter] = Tag.materializeCStruct14Tag[_root_.glib.all.gpointer, _root_.glib.all.gpointer, CInt, CInt, CInt, CInt, CInt, CInt, _root_.glib.all.gpointer, _root_.glib.all.gpointer, CInt, CInt, CInt, _root_.glib.all.gpointer]
  def apply()(using Zone): Ptr[GtkTextIter] = scala.scalanative.unsafe.alloc[GtkTextIter](1)
  def apply(dummy1 : _root_.glib.all.gpointer, dummy2 : _root_.glib.all.gpointer, dummy3 : CInt, dummy4 : CInt, dummy5 : CInt, dummy6 : CInt, dummy7 : CInt, dummy8 : CInt, dummy9 : _root_.glib.all.gpointer, dummy10 : _root_.glib.all.gpointer, dummy11 : CInt, dummy12 : CInt, dummy13 : CInt, dummy14 : _root_.glib.all.gpointer)(using Zone): Ptr[GtkTextIter] = 
    val ____ptr = apply()
    (!____ptr).dummy1 = dummy1
    (!____ptr).dummy2 = dummy2
    (!____ptr).dummy3 = dummy3
    (!____ptr).dummy4 = dummy4
    (!____ptr).dummy5 = dummy5
    (!____ptr).dummy6 = dummy6
    (!____ptr).dummy7 = dummy7
    (!____ptr).dummy8 = dummy8
    (!____ptr).dummy9 = dummy9
    (!____ptr).dummy10 = dummy10
    (!____ptr).dummy11 = dummy11
    (!____ptr).dummy12 = dummy12
    (!____ptr).dummy13 = dummy13
    (!____ptr).dummy14 = dummy14
    ____ptr
  extension (struct: GtkTextIter)
    def dummy1 : _root_.glib.all.gpointer = struct._1
    def dummy1_=(value: _root_.glib.all.gpointer): Unit = !struct.at1 = value
    def dummy2 : _root_.glib.all.gpointer = struct._2
    def dummy2_=(value: _root_.glib.all.gpointer): Unit = !struct.at2 = value
    def dummy3 : CInt = struct._3
    def dummy3_=(value: CInt): Unit = !struct.at3 = value
    def dummy4 : CInt = struct._4
    def dummy4_=(value: CInt): Unit = !struct.at4 = value
    def dummy5 : CInt = struct._5
    def dummy5_=(value: CInt): Unit = !struct.at5 = value
    def dummy6 : CInt = struct._6
    def dummy6_=(value: CInt): Unit = !struct.at6 = value
    def dummy7 : CInt = struct._7
    def dummy7_=(value: CInt): Unit = !struct.at7 = value
    def dummy8 : CInt = struct._8
    def dummy8_=(value: CInt): Unit = !struct.at8 = value
    def dummy9 : _root_.glib.all.gpointer = struct._9
    def dummy9_=(value: _root_.glib.all.gpointer): Unit = !struct.at9 = value
    def dummy10 : _root_.glib.all.gpointer = struct._10
    def dummy10_=(value: _root_.glib.all.gpointer): Unit = !struct.at10 = value
    def dummy11 : CInt = struct._11
    def dummy11_=(value: CInt): Unit = !struct.at11 = value
    def dummy12 : CInt = struct._12
    def dummy12_=(value: CInt): Unit = !struct.at12 = value
    def dummy13 : CInt = struct._13
    def dummy13_=(value: CInt): Unit = !struct.at13 = value
    def dummy14 : _root_.glib.all.gpointer = struct._14
    def dummy14_=(value: _root_.glib.all.gpointer): Unit = !struct.at14 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktextmark.h
*/
opaque type GtkTextMark = CStruct2[_root_.gobject.all.GObject, _root_.glib.all.gpointer]
object GtkTextMark:
  given _tag: Tag[GtkTextMark] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObject, _root_.glib.all.gpointer]
  def apply()(using Zone): Ptr[GtkTextMark] = scala.scalanative.unsafe.alloc[GtkTextMark](1)
  def apply(parent_instance : _root_.gobject.all.GObject, segment : _root_.glib.all.gpointer)(using Zone): Ptr[GtkTextMark] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).segment = segment
    ____ptr
  extension (struct: GtkTextMark)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value
    def segment : _root_.glib.all.gpointer = struct._2
    def segment_=(value: _root_.glib.all.gpointer): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktextmark.h
*/
opaque type GtkTextMarkClass = CStruct2[_root_.gobject.all.GObjectClass, CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkTextMarkClass:
  given _tag: Tag[GtkTextMarkClass] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObjectClass, CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkTextMarkClass] = scala.scalanative.unsafe.alloc[GtkTextMarkClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkTextMarkClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkTextMarkClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._2
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktexttag.h
*/
opaque type GtkTextTag = CStruct2[_root_.gobject.all.GObject, Ptr[GtkTextTagPrivate]]
object GtkTextTag:
  given _tag: Tag[GtkTextTag] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObject, Ptr[GtkTextTagPrivate]]
  def apply()(using Zone): Ptr[GtkTextTag] = scala.scalanative.unsafe.alloc[GtkTextTag](1)
  def apply(parent_instance : _root_.gobject.all.GObject, priv : Ptr[GtkTextTagPrivate])(using Zone): Ptr[GtkTextTag] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr
  extension (struct: GtkTextTag)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value
    def priv : Ptr[GtkTextTagPrivate] = struct._2
    def priv_=(value: Ptr[GtkTextTagPrivate]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktexttag.h
*/
opaque type GtkTextTagClass = CStruct2[_root_.gobject.all.GObjectClass, CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkTextTagClass:
  given _tag: Tag[GtkTextTagClass] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObjectClass, CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkTextTagClass] = scala.scalanative.unsafe.alloc[GtkTextTagClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkTextTagClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkTextTagClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._2
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktexttag.h
*/
opaque type GtkTextTagPrivate = CStruct0
object GtkTextTagPrivate:
  given _tag: Tag[GtkTextTagPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktexttag.h
*/
opaque type GtkTextTagTable = CStruct0
object GtkTextTagTable:
  given _tag: Tag[GtkTextTagTable] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktextview.h
*/
opaque type GtkTextView = CStruct2[GtkWidget, Ptr[GtkTextViewPrivate]]
object GtkTextView:
  given _tag: Tag[GtkTextView] = Tag.materializeCStruct2Tag[GtkWidget, Ptr[GtkTextViewPrivate]]
  def apply()(using Zone): Ptr[GtkTextView] = scala.scalanative.unsafe.alloc[GtkTextView](1)
  def apply(parent_instance : GtkWidget, priv : Ptr[GtkTextViewPrivate])(using Zone): Ptr[GtkTextView] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr
  extension (struct: GtkTextView)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value
    def priv : Ptr[GtkTextViewPrivate] = struct._2
    def priv_=(value: Ptr[GtkTextViewPrivate]): Unit = !struct.at2 = value

/**
 * GtkTextViewClass: _class: The object class structure needs to be the first _cursor: The class handler for the `GtkTextView::move-cursor` keybinding signal.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktextview.h
*/
opaque type GtkTextViewClass = CStruct15[GtkWidgetClass, CFuncPtr4[Ptr[GtkTextView], GtkMovementStep, CInt, _root_.glib.all.gboolean, Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr2[Ptr[GtkTextView], CString, Unit], CFuncPtr3[Ptr[GtkTextView], GtkDeleteType, CInt, Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr1[Ptr[GtkTextView], Ptr[GtkTextBuffer]], CFuncPtr3[Ptr[GtkTextView], GtkTextViewLayer, Ptr[GtkSnapshot], Unit], CFuncPtr5[Ptr[GtkTextView], GtkTextExtendSelection, Ptr[GtkTextIter], Ptr[GtkTextIter], Ptr[GtkTextIter], _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkTextView], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkTextViewClass:
  given _tag: Tag[GtkTextViewClass] = Tag.materializeCStruct15Tag[GtkWidgetClass, CFuncPtr4[Ptr[GtkTextView], GtkMovementStep, CInt, _root_.glib.all.gboolean, Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr2[Ptr[GtkTextView], CString, Unit], CFuncPtr3[Ptr[GtkTextView], GtkDeleteType, CInt, Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr1[Ptr[GtkTextView], Ptr[GtkTextBuffer]], CFuncPtr3[Ptr[GtkTextView], GtkTextViewLayer, Ptr[GtkSnapshot], Unit], CFuncPtr5[Ptr[GtkTextView], GtkTextExtendSelection, Ptr[GtkTextIter], Ptr[GtkTextIter], Ptr[GtkTextIter], _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkTextView], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkTextViewClass] = scala.scalanative.unsafe.alloc[GtkTextViewClass](1)
  def apply(parent_class : GtkWidgetClass, move_cursor : CFuncPtr4[Ptr[GtkTextView], GtkMovementStep, CInt, _root_.glib.all.gboolean, Unit], set_anchor : CFuncPtr1[Ptr[GtkTextView], Unit], insert_at_cursor : CFuncPtr2[Ptr[GtkTextView], CString, Unit], delete_from_cursor : CFuncPtr3[Ptr[GtkTextView], GtkDeleteType, CInt, Unit], backspace : CFuncPtr1[Ptr[GtkTextView], Unit], cut_clipboard : CFuncPtr1[Ptr[GtkTextView], Unit], copy_clipboard : CFuncPtr1[Ptr[GtkTextView], Unit], paste_clipboard : CFuncPtr1[Ptr[GtkTextView], Unit], toggle_overwrite : CFuncPtr1[Ptr[GtkTextView], Unit], create_buffer : CFuncPtr1[Ptr[GtkTextView], Ptr[GtkTextBuffer]], snapshot_layer : CFuncPtr3[Ptr[GtkTextView], GtkTextViewLayer, Ptr[GtkSnapshot], Unit], extend_selection : CFuncPtr5[Ptr[GtkTextView], GtkTextExtendSelection, Ptr[GtkTextIter], Ptr[GtkTextIter], Ptr[GtkTextIter], _root_.glib.all.gboolean], insert_emoji : CFuncPtr1[Ptr[GtkTextView], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkTextViewClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).move_cursor = move_cursor
    (!____ptr).set_anchor = set_anchor
    (!____ptr).insert_at_cursor = insert_at_cursor
    (!____ptr).delete_from_cursor = delete_from_cursor
    (!____ptr).backspace = backspace
    (!____ptr).cut_clipboard = cut_clipboard
    (!____ptr).copy_clipboard = copy_clipboard
    (!____ptr).paste_clipboard = paste_clipboard
    (!____ptr).toggle_overwrite = toggle_overwrite
    (!____ptr).create_buffer = create_buffer
    (!____ptr).snapshot_layer = snapshot_layer
    (!____ptr).extend_selection = extend_selection
    (!____ptr).insert_emoji = insert_emoji
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkTextViewClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def move_cursor : CFuncPtr4[Ptr[GtkTextView], GtkMovementStep, CInt, _root_.glib.all.gboolean, Unit] = struct._2
    def move_cursor_=(value: CFuncPtr4[Ptr[GtkTextView], GtkMovementStep, CInt, _root_.glib.all.gboolean, Unit]): Unit = !struct.at2 = value
    def set_anchor : CFuncPtr1[Ptr[GtkTextView], Unit] = struct._3
    def set_anchor_=(value: CFuncPtr1[Ptr[GtkTextView], Unit]): Unit = !struct.at3 = value
    def insert_at_cursor : CFuncPtr2[Ptr[GtkTextView], CString, Unit] = struct._4
    def insert_at_cursor_=(value: CFuncPtr2[Ptr[GtkTextView], CString, Unit]): Unit = !struct.at4 = value
    def delete_from_cursor : CFuncPtr3[Ptr[GtkTextView], GtkDeleteType, CInt, Unit] = struct._5
    def delete_from_cursor_=(value: CFuncPtr3[Ptr[GtkTextView], GtkDeleteType, CInt, Unit]): Unit = !struct.at5 = value
    def backspace : CFuncPtr1[Ptr[GtkTextView], Unit] = struct._6
    def backspace_=(value: CFuncPtr1[Ptr[GtkTextView], Unit]): Unit = !struct.at6 = value
    def cut_clipboard : CFuncPtr1[Ptr[GtkTextView], Unit] = struct._7
    def cut_clipboard_=(value: CFuncPtr1[Ptr[GtkTextView], Unit]): Unit = !struct.at7 = value
    def copy_clipboard : CFuncPtr1[Ptr[GtkTextView], Unit] = struct._8
    def copy_clipboard_=(value: CFuncPtr1[Ptr[GtkTextView], Unit]): Unit = !struct.at8 = value
    def paste_clipboard : CFuncPtr1[Ptr[GtkTextView], Unit] = struct._9
    def paste_clipboard_=(value: CFuncPtr1[Ptr[GtkTextView], Unit]): Unit = !struct.at9 = value
    def toggle_overwrite : CFuncPtr1[Ptr[GtkTextView], Unit] = struct._10
    def toggle_overwrite_=(value: CFuncPtr1[Ptr[GtkTextView], Unit]): Unit = !struct.at10 = value
    def create_buffer : CFuncPtr1[Ptr[GtkTextView], Ptr[GtkTextBuffer]] = struct._11
    def create_buffer_=(value: CFuncPtr1[Ptr[GtkTextView], Ptr[GtkTextBuffer]]): Unit = !struct.at11 = value
    def snapshot_layer : CFuncPtr3[Ptr[GtkTextView], GtkTextViewLayer, Ptr[GtkSnapshot], Unit] = struct._12
    def snapshot_layer_=(value: CFuncPtr3[Ptr[GtkTextView], GtkTextViewLayer, Ptr[GtkSnapshot], Unit]): Unit = !struct.at12 = value
    def extend_selection : CFuncPtr5[Ptr[GtkTextView], GtkTextExtendSelection, Ptr[GtkTextIter], Ptr[GtkTextIter], Ptr[GtkTextIter], _root_.glib.all.gboolean] = struct._13
    def extend_selection_=(value: CFuncPtr5[Ptr[GtkTextView], GtkTextExtendSelection, Ptr[GtkTextIter], Ptr[GtkTextIter], Ptr[GtkTextIter], _root_.glib.all.gboolean]): Unit = !struct.at13 = value
    def insert_emoji : CFuncPtr1[Ptr[GtkTextView], Unit] = struct._14
    def insert_emoji_=(value: CFuncPtr1[Ptr[GtkTextView], Unit]): Unit = !struct.at14 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._15
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at15 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktextview.h
*/
opaque type GtkTextViewPrivate = CStruct0
object GtkTextViewPrivate:
  given _tag: Tag[GtkTextViewPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktogglebutton.h
*/
opaque type GtkToggleButton = CStruct1[GtkButton]
object GtkToggleButton:
  given _tag: Tag[GtkToggleButton] = Tag.materializeCStruct1Tag[GtkButton]
  def apply()(using Zone): Ptr[GtkToggleButton] = scala.scalanative.unsafe.alloc[GtkToggleButton](1)
  def apply(button : GtkButton)(using Zone): Ptr[GtkToggleButton] = 
    val ____ptr = apply()
    (!____ptr).button = button
    ____ptr
  extension (struct: GtkToggleButton)
    def button : GtkButton = struct._1
    def button_=(value: GtkButton): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktogglebutton.h
*/
opaque type GtkToggleButtonClass = CStruct3[GtkButtonClass, CFuncPtr1[Ptr[GtkToggleButton], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkToggleButtonClass:
  given _tag: Tag[GtkToggleButtonClass] = Tag.materializeCStruct3Tag[GtkButtonClass, CFuncPtr1[Ptr[GtkToggleButton], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkToggleButtonClass] = scala.scalanative.unsafe.alloc[GtkToggleButtonClass](1)
  def apply(parent_class : GtkButtonClass, toggled : CFuncPtr1[Ptr[GtkToggleButton], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkToggleButtonClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).toggled = toggled
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkToggleButtonClass)
    def parent_class : GtkButtonClass = struct._1
    def parent_class_=(value: GtkButtonClass): Unit = !struct.at1 = value
    def toggled : CFuncPtr1[Ptr[GtkToggleButton], Unit] = struct._2
    def toggled_=(value: CFuncPtr1[Ptr[GtkToggleButton], Unit]): Unit = !struct.at2 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._3
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
opaque type GtkTooltip = CStruct0
object GtkTooltip:
  given _tag: Tag[GtkTooltip] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreednd.h
*/
opaque type GtkTreeDragDest = CStruct0
object GtkTreeDragDest:
  given _tag: Tag[GtkTreeDragDest] = Tag.materializeCStruct0Tag

/**
 * GtkTreeDragDestIface: _data_received: Asks the `GtkTreeDragDest` to insert a row before the path dest, deriving the contents of the row from selection_data. _drop_possible: Determines whether a drop is possible before the given dest_path, at the same depth as dest_path.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreednd.h
*/
opaque type GtkTreeDragDestIface = CStruct3[_root_.gobject.all.GTypeInterface, CFuncPtr3[Ptr[GtkTreeDragDest], Ptr[GtkTreePath], Ptr[_root_.gobject.all.GValue], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkTreeDragDest], Ptr[GtkTreePath], Ptr[_root_.gobject.all.GValue], _root_.glib.all.gboolean]]
object GtkTreeDragDestIface:
  given _tag: Tag[GtkTreeDragDestIface] = Tag.materializeCStruct3Tag[_root_.gobject.all.GTypeInterface, CFuncPtr3[Ptr[GtkTreeDragDest], Ptr[GtkTreePath], Ptr[_root_.gobject.all.GValue], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkTreeDragDest], Ptr[GtkTreePath], Ptr[_root_.gobject.all.GValue], _root_.glib.all.gboolean]]
  def apply()(using Zone): Ptr[GtkTreeDragDestIface] = scala.scalanative.unsafe.alloc[GtkTreeDragDestIface](1)
  def apply(g_iface : _root_.gobject.all.GTypeInterface, drag_data_received : CFuncPtr3[Ptr[GtkTreeDragDest], Ptr[GtkTreePath], Ptr[_root_.gobject.all.GValue], _root_.glib.all.gboolean], row_drop_possible : CFuncPtr3[Ptr[GtkTreeDragDest], Ptr[GtkTreePath], Ptr[_root_.gobject.all.GValue], _root_.glib.all.gboolean])(using Zone): Ptr[GtkTreeDragDestIface] = 
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).drag_data_received = drag_data_received
    (!____ptr).row_drop_possible = row_drop_possible
    ____ptr
  extension (struct: GtkTreeDragDestIface)
    def g_iface : _root_.gobject.all.GTypeInterface = struct._1
    def g_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def drag_data_received : CFuncPtr3[Ptr[GtkTreeDragDest], Ptr[GtkTreePath], Ptr[_root_.gobject.all.GValue], _root_.glib.all.gboolean] = struct._2
    def drag_data_received_=(value: CFuncPtr3[Ptr[GtkTreeDragDest], Ptr[GtkTreePath], Ptr[_root_.gobject.all.GValue], _root_.glib.all.gboolean]): Unit = !struct.at2 = value
    def row_drop_possible : CFuncPtr3[Ptr[GtkTreeDragDest], Ptr[GtkTreePath], Ptr[_root_.gobject.all.GValue], _root_.glib.all.gboolean] = struct._3
    def row_drop_possible_=(value: CFuncPtr3[Ptr[GtkTreeDragDest], Ptr[GtkTreePath], Ptr[_root_.gobject.all.GValue], _root_.glib.all.gboolean]): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreednd.h
*/
opaque type GtkTreeDragSource = CStruct0
object GtkTreeDragSource:
  given _tag: Tag[GtkTreeDragSource] = Tag.materializeCStruct0Tag

/**
 * GtkTreeDragSourceIface: _draggable: Asks the `GtkTreeDragSource` whether a particular row can be used as the source of a DND operation. _data_get: Asks the `GtkTreeDragSource` to fill in selection_data with a representation of the row at path. _data_delete: Asks the `GtkTreeDragSource` to delete the row at path, because it was moved somewhere else via drag-and-drop.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreednd.h
*/
opaque type GtkTreeDragSourceIface = CStruct4[_root_.gobject.all.GTypeInterface, CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], Ptr[GdkContentProvider]], CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], _root_.glib.all.gboolean]]
object GtkTreeDragSourceIface:
  given _tag: Tag[GtkTreeDragSourceIface] = Tag.materializeCStruct4Tag[_root_.gobject.all.GTypeInterface, CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], Ptr[GdkContentProvider]], CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], _root_.glib.all.gboolean]]
  def apply()(using Zone): Ptr[GtkTreeDragSourceIface] = scala.scalanative.unsafe.alloc[GtkTreeDragSourceIface](1)
  def apply(g_iface : _root_.gobject.all.GTypeInterface, row_draggable : CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], _root_.glib.all.gboolean], drag_data_get : CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], Ptr[GdkContentProvider]], drag_data_delete : CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], _root_.glib.all.gboolean])(using Zone): Ptr[GtkTreeDragSourceIface] = 
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).row_draggable = row_draggable
    (!____ptr).drag_data_get = drag_data_get
    (!____ptr).drag_data_delete = drag_data_delete
    ____ptr
  extension (struct: GtkTreeDragSourceIface)
    def g_iface : _root_.gobject.all.GTypeInterface = struct._1
    def g_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def row_draggable : CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], _root_.glib.all.gboolean] = struct._2
    def row_draggable_=(value: CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], _root_.glib.all.gboolean]): Unit = !struct.at2 = value
    def drag_data_get : CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], Ptr[GdkContentProvider]] = struct._3
    def drag_data_get_=(value: CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], Ptr[GdkContentProvider]]): Unit = !struct.at3 = value
    def drag_data_delete : CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], _root_.glib.all.gboolean] = struct._4
    def drag_data_delete_=(value: CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], _root_.glib.all.gboolean]): Unit = !struct.at4 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreeexpander.h
*/
opaque type GtkTreeExpander = CStruct0
object GtkTreeExpander:
  given _tag: Tag[GtkTreeExpander] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreeexpander.h
*/
opaque type GtkTreeExpanderClass = CStruct1[GtkWidgetClass]
object GtkTreeExpanderClass:
  given _tag: Tag[GtkTreeExpanderClass] = Tag.materializeCStruct1Tag[GtkWidgetClass]
  def apply()(using Zone): Ptr[GtkTreeExpanderClass] = scala.scalanative.unsafe.alloc[GtkTreeExpanderClass](1)
  def apply(parent_class : GtkWidgetClass)(using Zone): Ptr[GtkTreeExpanderClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkTreeExpanderClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value

/**
 * GtkTreeIter: : a unique stamp to catch invalid iterators _data: model-specific data _data2: model-specific data _data3: model-specific data

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreemodel.h
*/
opaque type GtkTreeIter = CStruct4[CInt, _root_.glib.all.gpointer, _root_.glib.all.gpointer, _root_.glib.all.gpointer]
object GtkTreeIter:
  given _tag: Tag[GtkTreeIter] = Tag.materializeCStruct4Tag[CInt, _root_.glib.all.gpointer, _root_.glib.all.gpointer, _root_.glib.all.gpointer]
  def apply()(using Zone): Ptr[GtkTreeIter] = scala.scalanative.unsafe.alloc[GtkTreeIter](1)
  def apply(stamp : CInt, user_data : _root_.glib.all.gpointer, user_data2 : _root_.glib.all.gpointer, user_data3 : _root_.glib.all.gpointer)(using Zone): Ptr[GtkTreeIter] = 
    val ____ptr = apply()
    (!____ptr).stamp = stamp
    (!____ptr).user_data = user_data
    (!____ptr).user_data2 = user_data2
    (!____ptr).user_data3 = user_data3
    ____ptr
  extension (struct: GtkTreeIter)
    def stamp : CInt = struct._1
    def stamp_=(value: CInt): Unit = !struct.at1 = value
    def user_data : _root_.glib.all.gpointer = struct._2
    def user_data_=(value: _root_.glib.all.gpointer): Unit = !struct.at2 = value
    def user_data2 : _root_.glib.all.gpointer = struct._3
    def user_data2_=(value: _root_.glib.all.gpointer): Unit = !struct.at3 = value
    def user_data3 : _root_.glib.all.gpointer = struct._4
    def user_data3_=(value: _root_.glib.all.gpointer): Unit = !struct.at4 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistmodel.h
*/
opaque type GtkTreeListModel = CStruct0
object GtkTreeListModel:
  given _tag: Tag[GtkTreeListModel] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistmodel.h
*/
opaque type GtkTreeListModelClass = CStruct1[_root_.gobject.all.GObjectClass]
object GtkTreeListModelClass:
  given _tag: Tag[GtkTreeListModelClass] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObjectClass]
  def apply()(using Zone): Ptr[GtkTreeListModelClass] = scala.scalanative.unsafe.alloc[GtkTreeListModelClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[GtkTreeListModelClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkTreeListModelClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistmodel.h
*/
opaque type GtkTreeListRow = CStruct0
object GtkTreeListRow:
  given _tag: Tag[GtkTreeListRow] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistmodel.h
*/
opaque type GtkTreeListRowClass = CStruct1[_root_.gobject.all.GObjectClass]
object GtkTreeListRowClass:
  given _tag: Tag[GtkTreeListRowClass] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObjectClass]
  def apply()(using Zone): Ptr[GtkTreeListRowClass] = scala.scalanative.unsafe.alloc[GtkTreeListRowClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[GtkTreeListRowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkTreeListRowClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistrowsorter.h
*/
opaque type GtkTreeListRowSorter = CStruct0
object GtkTreeListRowSorter:
  given _tag: Tag[GtkTreeListRowSorter] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistrowsorter.h
*/
opaque type GtkTreeListRowSorterClass = CStruct1[GtkSorterClass]
object GtkTreeListRowSorterClass:
  given _tag: Tag[GtkTreeListRowSorterClass] = Tag.materializeCStruct1Tag[GtkSorterClass]
  def apply()(using Zone): Ptr[GtkTreeListRowSorterClass] = scala.scalanative.unsafe.alloc[GtkTreeListRowSorterClass](1)
  def apply(parent_class : GtkSorterClass)(using Zone): Ptr[GtkTreeListRowSorterClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkTreeListRowSorterClass)
    def parent_class : GtkSorterClass = struct._1
    def parent_class_=(value: GtkSorterClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreemodel.h
*/
opaque type GtkTreeModel = CStruct0
object GtkTreeModel:
  given _tag: Tag[GtkTreeModel] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreemodelfilter.h
*/
opaque type GtkTreeModelFilter = CStruct2[_root_.gobject.all.GObject, Ptr[GtkTreeModelFilterPrivate]]
object GtkTreeModelFilter:
  given _tag: Tag[GtkTreeModelFilter] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObject, Ptr[GtkTreeModelFilterPrivate]]
  def apply()(using Zone): Ptr[GtkTreeModelFilter] = scala.scalanative.unsafe.alloc[GtkTreeModelFilter](1)
  def apply(parent : _root_.gobject.all.GObject, priv : Ptr[GtkTreeModelFilterPrivate])(using Zone): Ptr[GtkTreeModelFilter] = 
    val ____ptr = apply()
    (!____ptr).parent = parent
    (!____ptr).priv = priv
    ____ptr
  extension (struct: GtkTreeModelFilter)
    def parent : _root_.gobject.all.GObject = struct._1
    def parent_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value
    def priv : Ptr[GtkTreeModelFilterPrivate] = struct._2
    def priv_=(value: Ptr[GtkTreeModelFilterPrivate]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreemodelfilter.h
*/
opaque type GtkTreeModelFilterClass = CStruct4[_root_.gobject.all.GObjectClass, CFuncPtr3[Ptr[GtkTreeModelFilter], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean], CFuncPtr5[Ptr[GtkTreeModelFilter], Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[_root_.gobject.all.GValue], CInt, Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkTreeModelFilterClass:
  given _tag: Tag[GtkTreeModelFilterClass] = Tag.materializeCStruct4Tag[_root_.gobject.all.GObjectClass, CFuncPtr3[Ptr[GtkTreeModelFilter], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean], CFuncPtr5[Ptr[GtkTreeModelFilter], Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[_root_.gobject.all.GValue], CInt, Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkTreeModelFilterClass] = scala.scalanative.unsafe.alloc[GtkTreeModelFilterClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, visible : CFuncPtr3[Ptr[GtkTreeModelFilter], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean], modify : CFuncPtr5[Ptr[GtkTreeModelFilter], Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[_root_.gobject.all.GValue], CInt, Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkTreeModelFilterClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).visible = visible
    (!____ptr).modify = modify
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkTreeModelFilterClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def visible : CFuncPtr3[Ptr[GtkTreeModelFilter], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean] = struct._2
    def visible_=(value: CFuncPtr3[Ptr[GtkTreeModelFilter], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean]): Unit = !struct.at2 = value
    def modify : CFuncPtr5[Ptr[GtkTreeModelFilter], Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[_root_.gobject.all.GValue], CInt, Unit] = struct._3
    def modify_=(value: CFuncPtr5[Ptr[GtkTreeModelFilter], Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[_root_.gobject.all.GValue], CInt, Unit]): Unit = !struct.at3 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._4
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at4 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreemodelfilter.h
*/
opaque type GtkTreeModelFilterPrivate = CStruct0
object GtkTreeModelFilterPrivate:
  given _tag: Tag[GtkTreeModelFilterPrivate] = Tag.materializeCStruct0Tag

/**
 * GtkTreeModelIface: _changed: Signal emitted when a row in the model has changed. _inserted: Signal emitted when a new row has been inserted in the model. _has_child_toggled: Signal emitted when a row has gotten the first child row or lost its last child row. _deleted: Signal emitted when a row has been deleted. _reordered: Signal emitted when the children of a node in the GtkTreeModel have been reordered. _flags: Get `GtkTreeModelFlags` supported by this interface. _n_columns: Get the number of columns supported by the model. _column_type: Get the type of the column. _iter: Sets iter to a valid iterator pointing to path. _path: Gets a newly-created `GtkTreePath` referenced by iter. _value: Initializes and sets value to that at column. _next: Sets iter to point to the node following it at the current level. _previous: Sets iter to point to the previous node at the current level. _children: Sets iter to point to the first child of parent. _has_child: %TRUE if iter has children, %FALSE otherwise. _n_children: Gets the number of children that iter has. _nth_child: Sets iter to be the child of parent, using the given index. _parent: Sets iter to be the parent of child. _node: Lets the tree ref the node. _node: Lets the tree unref the node.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreemodel.h
*/
opaque type GtkTreeModelIface = CStruct21[_root_.gobject.all.GTypeInterface, CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit], CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit], CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreePath], Unit], CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Ptr[CInt], Unit], CFuncPtr1[Ptr[GtkTreeModel], GtkTreeModelFlags], CFuncPtr1[Ptr[GtkTreeModel], CInt], CFuncPtr2[Ptr[GtkTreeModel], CInt, _root_.gobject.all.GType], CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreePath]], CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], CInt, Ptr[_root_.gobject.all.GValue], Unit], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], CInt], CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], CInt, _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Unit], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Unit]]
object GtkTreeModelIface:
  given _tag: Tag[GtkTreeModelIface] = Tag.materializeCStruct21Tag[_root_.gobject.all.GTypeInterface, CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit], CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit], CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreePath], Unit], CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Ptr[CInt], Unit], CFuncPtr1[Ptr[GtkTreeModel], GtkTreeModelFlags], CFuncPtr1[Ptr[GtkTreeModel], CInt], CFuncPtr2[Ptr[GtkTreeModel], CInt, _root_.gobject.all.GType], CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreePath]], CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], CInt, Ptr[_root_.gobject.all.GValue], Unit], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], CInt], CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], CInt, _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Unit], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Unit]]
  def apply()(using Zone): Ptr[GtkTreeModelIface] = scala.scalanative.unsafe.alloc[GtkTreeModelIface](1)
  def apply(g_iface : _root_.gobject.all.GTypeInterface, row_changed : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit], row_inserted : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit], row_has_child_toggled : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit], row_deleted : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreePath], Unit], rows_reordered : CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Ptr[CInt], Unit], get_flags : CFuncPtr1[Ptr[GtkTreeModel], GtkTreeModelFlags], get_n_columns : CFuncPtr1[Ptr[GtkTreeModel], CInt], get_column_type : CFuncPtr2[Ptr[GtkTreeModel], CInt, _root_.gobject.all.GType], get_iter : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.glib.all.gboolean], get_path : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreePath]], get_value : CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], CInt, Ptr[_root_.gobject.all.GValue], Unit], iter_next : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean], iter_previous : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean], iter_children : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.glib.all.gboolean], iter_has_child : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean], iter_n_children : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], CInt], iter_nth_child : CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], CInt, _root_.glib.all.gboolean], iter_parent : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.glib.all.gboolean], ref_node : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Unit], unref_node : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Unit])(using Zone): Ptr[GtkTreeModelIface] = 
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).row_changed = row_changed
    (!____ptr).row_inserted = row_inserted
    (!____ptr).row_has_child_toggled = row_has_child_toggled
    (!____ptr).row_deleted = row_deleted
    (!____ptr).rows_reordered = rows_reordered
    (!____ptr).get_flags = get_flags
    (!____ptr).get_n_columns = get_n_columns
    (!____ptr).get_column_type = get_column_type
    (!____ptr).get_iter = get_iter
    (!____ptr).get_path = get_path
    (!____ptr).get_value = get_value
    (!____ptr).iter_next = iter_next
    (!____ptr).iter_previous = iter_previous
    (!____ptr).iter_children = iter_children
    (!____ptr).iter_has_child = iter_has_child
    (!____ptr).iter_n_children = iter_n_children
    (!____ptr).iter_nth_child = iter_nth_child
    (!____ptr).iter_parent = iter_parent
    (!____ptr).ref_node = ref_node
    (!____ptr).unref_node = unref_node
    ____ptr
  extension (struct: GtkTreeModelIface)
    def g_iface : _root_.gobject.all.GTypeInterface = struct._1
    def g_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def row_changed : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit] = struct._2
    def row_changed_=(value: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit]): Unit = !struct.at2 = value
    def row_inserted : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit] = struct._3
    def row_inserted_=(value: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit]): Unit = !struct.at3 = value
    def row_has_child_toggled : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit] = struct._4
    def row_has_child_toggled_=(value: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit]): Unit = !struct.at4 = value
    def row_deleted : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreePath], Unit] = struct._5
    def row_deleted_=(value: CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreePath], Unit]): Unit = !struct.at5 = value
    def rows_reordered : CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Ptr[CInt], Unit] = struct._6
    def rows_reordered_=(value: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Ptr[CInt], Unit]): Unit = !struct.at6 = value
    def get_flags : CFuncPtr1[Ptr[GtkTreeModel], GtkTreeModelFlags] = struct._7
    def get_flags_=(value: CFuncPtr1[Ptr[GtkTreeModel], GtkTreeModelFlags]): Unit = !struct.at7 = value
    def get_n_columns : CFuncPtr1[Ptr[GtkTreeModel], CInt] = struct._8
    def get_n_columns_=(value: CFuncPtr1[Ptr[GtkTreeModel], CInt]): Unit = !struct.at8 = value
    def get_column_type : CFuncPtr2[Ptr[GtkTreeModel], CInt, _root_.gobject.all.GType] = struct._9
    def get_column_type_=(value: CFuncPtr2[Ptr[GtkTreeModel], CInt, _root_.gobject.all.GType]): Unit = !struct.at9 = value
    def get_iter : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.glib.all.gboolean] = struct._10
    def get_iter_=(value: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.glib.all.gboolean]): Unit = !struct.at10 = value
    def get_path : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreePath]] = struct._11
    def get_path_=(value: CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreePath]]): Unit = !struct.at11 = value
    def get_value : CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], CInt, Ptr[_root_.gobject.all.GValue], Unit] = struct._12
    def get_value_=(value: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], CInt, Ptr[_root_.gobject.all.GValue], Unit]): Unit = !struct.at12 = value
    def iter_next : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean] = struct._13
    def iter_next_=(value: CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean]): Unit = !struct.at13 = value
    def iter_previous : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean] = struct._14
    def iter_previous_=(value: CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean]): Unit = !struct.at14 = value
    def iter_children : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.glib.all.gboolean] = struct._15
    def iter_children_=(value: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.glib.all.gboolean]): Unit = !struct.at15 = value
    def iter_has_child : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean] = struct._16
    def iter_has_child_=(value: CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean]): Unit = !struct.at16 = value
    def iter_n_children : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], CInt] = struct._17
    def iter_n_children_=(value: CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], CInt]): Unit = !struct.at17 = value
    def iter_nth_child : CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], CInt, _root_.glib.all.gboolean] = struct._18
    def iter_nth_child_=(value: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], CInt, _root_.glib.all.gboolean]): Unit = !struct.at18 = value
    def iter_parent : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.glib.all.gboolean] = struct._19
    def iter_parent_=(value: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.glib.all.gboolean]): Unit = !struct.at19 = value
    def ref_node : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Unit] = struct._20
    def ref_node_=(value: CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Unit]): Unit = !struct.at20 = value
    def unref_node : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Unit] = struct._21
    def unref_node_=(value: CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Unit]): Unit = !struct.at21 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreemodelsort.h
*/
opaque type GtkTreeModelSort = CStruct2[_root_.gobject.all.GObject, Ptr[GtkTreeModelSortPrivate]]
object GtkTreeModelSort:
  given _tag: Tag[GtkTreeModelSort] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObject, Ptr[GtkTreeModelSortPrivate]]
  def apply()(using Zone): Ptr[GtkTreeModelSort] = scala.scalanative.unsafe.alloc[GtkTreeModelSort](1)
  def apply(parent : _root_.gobject.all.GObject, priv : Ptr[GtkTreeModelSortPrivate])(using Zone): Ptr[GtkTreeModelSort] = 
    val ____ptr = apply()
    (!____ptr).parent = parent
    (!____ptr).priv = priv
    ____ptr
  extension (struct: GtkTreeModelSort)
    def parent : _root_.gobject.all.GObject = struct._1
    def parent_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value
    def priv : Ptr[GtkTreeModelSortPrivate] = struct._2
    def priv_=(value: Ptr[GtkTreeModelSortPrivate]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreemodelsort.h
*/
opaque type GtkTreeModelSortClass = CStruct2[_root_.gobject.all.GObjectClass, CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkTreeModelSortClass:
  given _tag: Tag[GtkTreeModelSortClass] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObjectClass, CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkTreeModelSortClass] = scala.scalanative.unsafe.alloc[GtkTreeModelSortClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkTreeModelSortClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkTreeModelSortClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._2
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreemodelsort.h
*/
opaque type GtkTreeModelSortPrivate = CStruct0
object GtkTreeModelSortPrivate:
  given _tag: Tag[GtkTreeModelSortPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreemodel.h
*/
opaque type GtkTreePath = CStruct0
object GtkTreePath:
  given _tag: Tag[GtkTreePath] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreemodel.h
*/
opaque type GtkTreeRowReference = CStruct0
object GtkTreeRowReference:
  given _tag: Tag[GtkTreeRowReference] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreeview.h
*/
opaque type GtkTreeSelection = CStruct0
object GtkTreeSelection:
  given _tag: Tag[GtkTreeSelection] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreesortable.h
*/
opaque type GtkTreeSortable = CStruct0
object GtkTreeSortable:
  given _tag: Tag[GtkTreeSortable] = Tag.materializeCStruct0Tag

/**
 * _column_changed: Signal emitted when the sort column or sort order of sortable is changed. _sort_column_id: Fills in sort_column_id and order with the current sort column and the order.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreesortable.h
*/
opaque type GtkTreeSortableIface = CStruct7[_root_.gobject.all.GTypeInterface, CFuncPtr1[Ptr[GtkTreeSortable], Unit], CFuncPtr3[Ptr[GtkTreeSortable], Ptr[CInt], Ptr[GtkSortType], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkTreeSortable], CInt, GtkSortType, Unit], CFuncPtr5[Ptr[GtkTreeSortable], CInt, GtkTreeIterCompareFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit], CFuncPtr4[Ptr[GtkTreeSortable], GtkTreeIterCompareFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit], CFuncPtr1[Ptr[GtkTreeSortable], _root_.glib.all.gboolean]]
object GtkTreeSortableIface:
  given _tag: Tag[GtkTreeSortableIface] = Tag.materializeCStruct7Tag[_root_.gobject.all.GTypeInterface, CFuncPtr1[Ptr[GtkTreeSortable], Unit], CFuncPtr3[Ptr[GtkTreeSortable], Ptr[CInt], Ptr[GtkSortType], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkTreeSortable], CInt, GtkSortType, Unit], CFuncPtr5[Ptr[GtkTreeSortable], CInt, GtkTreeIterCompareFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit], CFuncPtr4[Ptr[GtkTreeSortable], GtkTreeIterCompareFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit], CFuncPtr1[Ptr[GtkTreeSortable], _root_.glib.all.gboolean]]
  def apply()(using Zone): Ptr[GtkTreeSortableIface] = scala.scalanative.unsafe.alloc[GtkTreeSortableIface](1)
  def apply(g_iface : _root_.gobject.all.GTypeInterface, sort_column_changed : CFuncPtr1[Ptr[GtkTreeSortable], Unit], get_sort_column_id : CFuncPtr3[Ptr[GtkTreeSortable], Ptr[CInt], Ptr[GtkSortType], _root_.glib.all.gboolean], set_sort_column_id : CFuncPtr3[Ptr[GtkTreeSortable], CInt, GtkSortType, Unit], set_sort_func : CFuncPtr5[Ptr[GtkTreeSortable], CInt, GtkTreeIterCompareFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit], set_default_sort_func : CFuncPtr4[Ptr[GtkTreeSortable], GtkTreeIterCompareFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit], has_default_sort_func : CFuncPtr1[Ptr[GtkTreeSortable], _root_.glib.all.gboolean])(using Zone): Ptr[GtkTreeSortableIface] = 
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).sort_column_changed = sort_column_changed
    (!____ptr).get_sort_column_id = get_sort_column_id
    (!____ptr).set_sort_column_id = set_sort_column_id
    (!____ptr).set_sort_func = set_sort_func
    (!____ptr).set_default_sort_func = set_default_sort_func
    (!____ptr).has_default_sort_func = has_default_sort_func
    ____ptr
  extension (struct: GtkTreeSortableIface)
    def g_iface : _root_.gobject.all.GTypeInterface = struct._1
    def g_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def sort_column_changed : CFuncPtr1[Ptr[GtkTreeSortable], Unit] = struct._2
    def sort_column_changed_=(value: CFuncPtr1[Ptr[GtkTreeSortable], Unit]): Unit = !struct.at2 = value
    def get_sort_column_id : CFuncPtr3[Ptr[GtkTreeSortable], Ptr[CInt], Ptr[GtkSortType], _root_.glib.all.gboolean] = struct._3
    def get_sort_column_id_=(value: CFuncPtr3[Ptr[GtkTreeSortable], Ptr[CInt], Ptr[GtkSortType], _root_.glib.all.gboolean]): Unit = !struct.at3 = value
    def set_sort_column_id : CFuncPtr3[Ptr[GtkTreeSortable], CInt, GtkSortType, Unit] = struct._4
    def set_sort_column_id_=(value: CFuncPtr3[Ptr[GtkTreeSortable], CInt, GtkSortType, Unit]): Unit = !struct.at4 = value
    def set_sort_func : CFuncPtr5[Ptr[GtkTreeSortable], CInt, GtkTreeIterCompareFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit] = struct._5
    def set_sort_func_=(value: CFuncPtr5[Ptr[GtkTreeSortable], CInt, GtkTreeIterCompareFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit]): Unit = !struct.at5 = value
    def set_default_sort_func : CFuncPtr4[Ptr[GtkTreeSortable], GtkTreeIterCompareFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit] = struct._6
    def set_default_sort_func_=(value: CFuncPtr4[Ptr[GtkTreeSortable], GtkTreeIterCompareFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit]): Unit = !struct.at6 = value
    def has_default_sort_func : CFuncPtr1[Ptr[GtkTreeSortable], _root_.glib.all.gboolean] = struct._7
    def has_default_sort_func_=(value: CFuncPtr1[Ptr[GtkTreeSortable], _root_.glib.all.gboolean]): Unit = !struct.at7 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreestore.h
*/
opaque type GtkTreeStore = CStruct2[_root_.gobject.all.GObject, Ptr[GtkTreeStorePrivate]]
object GtkTreeStore:
  given _tag: Tag[GtkTreeStore] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObject, Ptr[GtkTreeStorePrivate]]
  def apply()(using Zone): Ptr[GtkTreeStore] = scala.scalanative.unsafe.alloc[GtkTreeStore](1)
  def apply(parent : _root_.gobject.all.GObject, priv : Ptr[GtkTreeStorePrivate])(using Zone): Ptr[GtkTreeStore] = 
    val ____ptr = apply()
    (!____ptr).parent = parent
    (!____ptr).priv = priv
    ____ptr
  extension (struct: GtkTreeStore)
    def parent : _root_.gobject.all.GObject = struct._1
    def parent_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value
    def priv : Ptr[GtkTreeStorePrivate] = struct._2
    def priv_=(value: Ptr[GtkTreeStorePrivate]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreestore.h
*/
opaque type GtkTreeStoreClass = CStruct2[_root_.gobject.all.GObjectClass, CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkTreeStoreClass:
  given _tag: Tag[GtkTreeStoreClass] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObjectClass, CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkTreeStoreClass] = scala.scalanative.unsafe.alloc[GtkTreeStoreClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkTreeStoreClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkTreeStoreClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._2
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreestore.h
*/
opaque type GtkTreeStorePrivate = CStruct0
object GtkTreeStorePrivate:
  given _tag: Tag[GtkTreeStorePrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreeview.h
*/
opaque type GtkTreeView = CStruct1[GtkWidget]
object GtkTreeView:
  given _tag: Tag[GtkTreeView] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[GtkTreeView] = scala.scalanative.unsafe.alloc[GtkTreeView](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[GtkTreeView] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkTreeView)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreeview.h
*/
opaque type GtkTreeViewClass = CStruct17[GtkWidgetClass, CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], Ptr[GtkTreeViewColumn], Unit], CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], Unit], CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], Unit], CFuncPtr1[Ptr[GtkTreeView], Unit], CFuncPtr1[Ptr[GtkTreeView], Unit], CFuncPtr5[Ptr[GtkTreeView], GtkMovementStep, CInt, _root_.glib.all.gboolean, _root_.glib.all.gboolean, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkTreeView], _root_.glib.all.gboolean, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean], CFuncPtr4[Ptr[GtkTreeView], _root_.glib.all.gboolean, _root_.glib.all.gboolean, _root_.glib.all.gboolean, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean], CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._6]]]
object GtkTreeViewClass:
  given _tag: Tag[GtkTreeViewClass] = Tag.materializeCStruct17Tag[GtkWidgetClass, CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], Ptr[GtkTreeViewColumn], Unit], CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], Unit], CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], Unit], CFuncPtr1[Ptr[GtkTreeView], Unit], CFuncPtr1[Ptr[GtkTreeView], Unit], CFuncPtr5[Ptr[GtkTreeView], GtkMovementStep, CInt, _root_.glib.all.gboolean, _root_.glib.all.gboolean, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkTreeView], _root_.glib.all.gboolean, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean], CFuncPtr4[Ptr[GtkTreeView], _root_.glib.all.gboolean, _root_.glib.all.gboolean, _root_.glib.all.gboolean, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean], CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._6]]]
  def apply()(using Zone): Ptr[GtkTreeViewClass] = scala.scalanative.unsafe.alloc[GtkTreeViewClass](1)
  def apply(parent_class : GtkWidgetClass, row_activated : CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], Ptr[GtkTreeViewColumn], Unit], test_expand_row : CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.glib.all.gboolean], test_collapse_row : CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.glib.all.gboolean], row_expanded : CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], Unit], row_collapsed : CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], Unit], columns_changed : CFuncPtr1[Ptr[GtkTreeView], Unit], cursor_changed : CFuncPtr1[Ptr[GtkTreeView], Unit], move_cursor : CFuncPtr5[Ptr[GtkTreeView], GtkMovementStep, CInt, _root_.glib.all.gboolean, _root_.glib.all.gboolean, _root_.glib.all.gboolean], select_all : CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean], unselect_all : CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean], select_cursor_row : CFuncPtr2[Ptr[GtkTreeView], _root_.glib.all.gboolean, _root_.glib.all.gboolean], toggle_cursor_row : CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean], expand_collapse_cursor_row : CFuncPtr4[Ptr[GtkTreeView], _root_.glib.all.gboolean, _root_.glib.all.gboolean, _root_.glib.all.gboolean, _root_.glib.all.gboolean], select_cursor_parent : CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean], start_interactive_search : CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean], _reserved : CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._6]])(using Zone): Ptr[GtkTreeViewClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).row_activated = row_activated
    (!____ptr).test_expand_row = test_expand_row
    (!____ptr).test_collapse_row = test_collapse_row
    (!____ptr).row_expanded = row_expanded
    (!____ptr).row_collapsed = row_collapsed
    (!____ptr).columns_changed = columns_changed
    (!____ptr).cursor_changed = cursor_changed
    (!____ptr).move_cursor = move_cursor
    (!____ptr).select_all = select_all
    (!____ptr).unselect_all = unselect_all
    (!____ptr).select_cursor_row = select_cursor_row
    (!____ptr).toggle_cursor_row = toggle_cursor_row
    (!____ptr).expand_collapse_cursor_row = expand_collapse_cursor_row
    (!____ptr).select_cursor_parent = select_cursor_parent
    (!____ptr).start_interactive_search = start_interactive_search
    (!____ptr)._reserved = _reserved
    ____ptr
  extension (struct: GtkTreeViewClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def row_activated : CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], Ptr[GtkTreeViewColumn], Unit] = struct._2
    def row_activated_=(value: CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], Ptr[GtkTreeViewColumn], Unit]): Unit = !struct.at2 = value
    def test_expand_row : CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.glib.all.gboolean] = struct._3
    def test_expand_row_=(value: CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.glib.all.gboolean]): Unit = !struct.at3 = value
    def test_collapse_row : CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.glib.all.gboolean] = struct._4
    def test_collapse_row_=(value: CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.glib.all.gboolean]): Unit = !struct.at4 = value
    def row_expanded : CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], Unit] = struct._5
    def row_expanded_=(value: CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], Unit]): Unit = !struct.at5 = value
    def row_collapsed : CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], Unit] = struct._6
    def row_collapsed_=(value: CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], Unit]): Unit = !struct.at6 = value
    def columns_changed : CFuncPtr1[Ptr[GtkTreeView], Unit] = struct._7
    def columns_changed_=(value: CFuncPtr1[Ptr[GtkTreeView], Unit]): Unit = !struct.at7 = value
    def cursor_changed : CFuncPtr1[Ptr[GtkTreeView], Unit] = struct._8
    def cursor_changed_=(value: CFuncPtr1[Ptr[GtkTreeView], Unit]): Unit = !struct.at8 = value
    def move_cursor : CFuncPtr5[Ptr[GtkTreeView], GtkMovementStep, CInt, _root_.glib.all.gboolean, _root_.glib.all.gboolean, _root_.glib.all.gboolean] = struct._9
    def move_cursor_=(value: CFuncPtr5[Ptr[GtkTreeView], GtkMovementStep, CInt, _root_.glib.all.gboolean, _root_.glib.all.gboolean, _root_.glib.all.gboolean]): Unit = !struct.at9 = value
    def select_all : CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean] = struct._10
    def select_all_=(value: CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean]): Unit = !struct.at10 = value
    def unselect_all : CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean] = struct._11
    def unselect_all_=(value: CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean]): Unit = !struct.at11 = value
    def select_cursor_row : CFuncPtr2[Ptr[GtkTreeView], _root_.glib.all.gboolean, _root_.glib.all.gboolean] = struct._12
    def select_cursor_row_=(value: CFuncPtr2[Ptr[GtkTreeView], _root_.glib.all.gboolean, _root_.glib.all.gboolean]): Unit = !struct.at12 = value
    def toggle_cursor_row : CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean] = struct._13
    def toggle_cursor_row_=(value: CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean]): Unit = !struct.at13 = value
    def expand_collapse_cursor_row : CFuncPtr4[Ptr[GtkTreeView], _root_.glib.all.gboolean, _root_.glib.all.gboolean, _root_.glib.all.gboolean, _root_.glib.all.gboolean] = struct._14
    def expand_collapse_cursor_row_=(value: CFuncPtr4[Ptr[GtkTreeView], _root_.glib.all.gboolean, _root_.glib.all.gboolean, _root_.glib.all.gboolean, _root_.glib.all.gboolean]): Unit = !struct.at14 = value
    def select_cursor_parent : CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean] = struct._15
    def select_cursor_parent_=(value: CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean]): Unit = !struct.at15 = value
    def start_interactive_search : CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean] = struct._16
    def start_interactive_search_=(value: CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean]): Unit = !struct.at16 = value
    def _reserved : CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._6]] = struct._17
    def _reserved_=(value: CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._6]]): Unit = !struct.at17 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreeviewcolumn.h
*/
opaque type GtkTreeViewColumn = CStruct0
object GtkTreeViewColumn:
  given _tag: Tag[GtkTreeViewColumn] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkvideo.h
*/
opaque type GtkVideo = CStruct0
object GtkVideo:
  given _tag: Tag[GtkVideo] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkvideo.h
*/
opaque type GtkVideoClass = CStruct1[GtkWidgetClass]
object GtkVideoClass:
  given _tag: Tag[GtkVideoClass] = Tag.materializeCStruct1Tag[GtkWidgetClass]
  def apply()(using Zone): Ptr[GtkVideoClass] = scala.scalanative.unsafe.alloc[GtkVideoClass](1)
  def apply(parent_class : GtkWidgetClass)(using Zone): Ptr[GtkVideoClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkVideoClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkviewport.h
*/
opaque type GtkViewport = CStruct0
object GtkViewport:
  given _tag: Tag[GtkViewport] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkvolumebutton.h
*/
opaque type GtkVolumeButton = CStruct1[GtkScaleButton]
object GtkVolumeButton:
  given _tag: Tag[GtkVolumeButton] = Tag.materializeCStruct1Tag[GtkScaleButton]
  def apply()(using Zone): Ptr[GtkVolumeButton] = scala.scalanative.unsafe.alloc[GtkVolumeButton](1)
  def apply(parent : GtkScaleButton)(using Zone): Ptr[GtkVolumeButton] = 
    val ____ptr = apply()
    (!____ptr).parent = parent
    ____ptr
  extension (struct: GtkVolumeButton)
    def parent : GtkScaleButton = struct._1
    def parent_=(value: GtkScaleButton): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidget.h
*/
opaque type GtkWidget = CStruct2[_root_.gobject.all.GInitiallyUnowned, Ptr[GtkWidgetPrivate]]
object GtkWidget:
  given _tag: Tag[GtkWidget] = Tag.materializeCStruct2Tag[_root_.gobject.all.GInitiallyUnowned, Ptr[GtkWidgetPrivate]]
  def apply()(using Zone): Ptr[GtkWidget] = scala.scalanative.unsafe.alloc[GtkWidget](1)
  def apply(parent_instance : _root_.gobject.all.GInitiallyUnowned, priv : Ptr[GtkWidgetPrivate])(using Zone): Ptr[GtkWidget] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr
  extension (struct: GtkWidget)
    def parent_instance : _root_.gobject.all.GInitiallyUnowned = struct._1
    def parent_instance_=(value: _root_.gobject.all.GInitiallyUnowned): Unit = !struct.at1 = value
    def priv : Ptr[GtkWidgetPrivate] = struct._2
    def priv_=(value: Ptr[GtkWidgetPrivate]): Unit = !struct.at2 = value

/**
 * GtkWidgetClass: _class: The object class structure needs to be the first element in the widget class structure in order for the class mechanism to work correctly. This allows a GtkWidgetClass pointer to be cast to a GObjectClass pointer. : Signal emitted when widget is shown : Signal emitted when widget is hidden. : Signal emitted when widget is going to be mapped, that is when the widget is visible (which is controlled with gtk_widget_set_visible()) and all its parents up to the toplevel widget are also visible. : Signal emitted when widget is going to be unmapped, which means that either it or any of its parents up to the toplevel widget have been set as hidden. : Signal emitted when widget is associated with a `GdkSurface`, which means that gtk_widget_realize() has been called or the widget has been mapped (that is, it is going to be drawn). : Signal emitted when the GdkSurface associated with widget is destroyed, which means that gtk_widget_unrealize() has been called or the widget has been unmapped (that is, it is going to be hidden). : Called when the widget gets added to a `GtkRoot` widget. Must chain up : Called when the widget is about to be removed from its `GtkRoot` widget. Must chain up _allocate: Called to set the allocation, if the widget does not have a layout manager. _flags_changed: Signal emitted when the widget state changes, see gtk_widget_get_state_flags(). _changed: Signal emitted when the text direction of a widget changes. _request_mode: Called to get the request mode, if the widget does not have a layout manager. This allows a widget to tell its parent container whether it prefers to be allocated in %GTK_SIZE_REQUEST_HEIGHT_FOR_WIDTH or %GTK_SIZE_REQUEST_WIDTH_FOR_HEIGHT mode. %GTK_SIZE_REQUEST_HEIGHT_FOR_WIDTH means the widget prefers to have `GtkWidgetClass.measure()` called first to get the default width (passing a for_size of -1), then again to get the height for said default width. %GTK_SIZE_REQUEST_CONSTANT_SIZE disables any height-for-width or width-for-height geometry management for said widget and is the default return. It’s important to note that any widget which trades height-for-width or width-for-height must respond properly to a for_size value >= -1 passed to `GtkWidgetClass.measure`, for both possible orientations. : Called to obtain the minimum and natural size of the widget, if the widget does not have a layout manager. Depending on the orientation parameter, the passed for_size can be interpreted as width or height. A widget will never be allocated less than its minimum size. _activate: Activates the if _cycling is %FALSE, and just grabs the focus if _cycling is %TRUE. _focus: Causes to have the keyboard focus for the `GtkWindow` it’s inside. : Vfunc for gtk_widget_child_focus()

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidget.h
*/
opaque type GtkWidgetClass = CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]]
object GtkWidgetClass:
  given _tag: Tag[GtkWidgetClass] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]](Tag.Byte, Tag.Digit3[Nat._4, Nat._0, Nat._8](Tag.Nat4, Tag.Nat0, Tag.Nat8))
  def apply()(using Zone): Ptr[GtkWidgetClass] = scala.scalanative.unsafe.alloc[GtkWidgetClass](1)
  def apply(parent_class : _root_.gobject.all.GInitiallyUnownedClass, show : CFuncPtr1[Ptr[GtkWidget], Unit], hide : CFuncPtr1[Ptr[GtkWidget], Unit], map : CFuncPtr1[Ptr[GtkWidget], Unit], unmap : CFuncPtr1[Ptr[GtkWidget], Unit], realize : CFuncPtr1[Ptr[GtkWidget], Unit], unrealize : CFuncPtr1[Ptr[GtkWidget], Unit], root : CFuncPtr1[Ptr[GtkWidget], Unit], unroot : CFuncPtr1[Ptr[GtkWidget], Unit], size_allocate : CFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit], state_flags_changed : CFuncPtr2[Ptr[GtkWidget], GtkStateFlags, Unit], direction_changed : CFuncPtr2[Ptr[GtkWidget], GtkTextDirection, Unit], get_request_mode : CFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode], measure : CFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit], mnemonic_activate : CFuncPtr2[Ptr[GtkWidget], _root_.glib.all.gboolean, _root_.glib.all.gboolean], grab_focus : CFuncPtr1[Ptr[GtkWidget], _root_.glib.all.gboolean], focus : CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.glib.all.gboolean], set_focus_child : CFuncPtr2[Ptr[GtkWidget], Ptr[GtkWidget], Unit], move_focus : CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, Unit], keynav_failed : CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.glib.all.gboolean], query_tooltip : CFuncPtr5[Ptr[GtkWidget], CInt, CInt, _root_.glib.all.gboolean, Ptr[GtkTooltip], _root_.glib.all.gboolean], compute_expand : CFuncPtr3[Ptr[GtkWidget], Ptr[_root_.glib.all.gboolean], Ptr[_root_.glib.all.gboolean], Unit], css_changed : CFuncPtr2[Ptr[GtkWidget], Ptr[GtkCssStyleChange], Unit], system_setting_changed : CFuncPtr2[Ptr[GtkWidget], GtkSystemSetting, Unit], snapshot : CFuncPtr2[Ptr[GtkWidget], Ptr[GtkSnapshot], Unit], contains : CFuncPtr3[Ptr[GtkWidget], Double, Double, _root_.glib.all.gboolean], priv : Ptr[GtkWidgetClassPrivate], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkWidgetClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).show = show
    (!____ptr).hide = hide
    (!____ptr).map = map
    (!____ptr).unmap = unmap
    (!____ptr).realize = realize
    (!____ptr).unrealize = unrealize
    (!____ptr).root = root
    (!____ptr).unroot = unroot
    (!____ptr).size_allocate = size_allocate
    (!____ptr).state_flags_changed = state_flags_changed
    (!____ptr).direction_changed = direction_changed
    (!____ptr).get_request_mode = get_request_mode
    (!____ptr).measure = measure
    (!____ptr).mnemonic_activate = mnemonic_activate
    (!____ptr).grab_focus = grab_focus
    (!____ptr).focus = focus
    (!____ptr).set_focus_child = set_focus_child
    (!____ptr).move_focus = move_focus
    (!____ptr).keynav_failed = keynav_failed
    (!____ptr).query_tooltip = query_tooltip
    (!____ptr).compute_expand = compute_expand
    (!____ptr).css_changed = css_changed
    (!____ptr).system_setting_changed = system_setting_changed
    (!____ptr).snapshot = snapshot
    (!____ptr).contains = contains
    (!____ptr).priv = priv
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkWidgetClass)
    def parent_class: _root_.gobject.all.GInitiallyUnownedClass = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GInitiallyUnownedClass]]
    def parent_class_=(value: _root_.gobject.all.GInitiallyUnownedClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GInitiallyUnownedClass]] = value
    def show: CFuncPtr1[Ptr[GtkWidget], Unit] = !struct.at(136).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]]
    def show_=(value: CFuncPtr1[Ptr[GtkWidget], Unit]): Unit = !struct.at(136).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]] = value
    def hide: CFuncPtr1[Ptr[GtkWidget], Unit] = !struct.at(144).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]]
    def hide_=(value: CFuncPtr1[Ptr[GtkWidget], Unit]): Unit = !struct.at(144).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]] = value
    def map: CFuncPtr1[Ptr[GtkWidget], Unit] = !struct.at(152).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]]
    def map_=(value: CFuncPtr1[Ptr[GtkWidget], Unit]): Unit = !struct.at(152).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]] = value
    def unmap: CFuncPtr1[Ptr[GtkWidget], Unit] = !struct.at(160).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]]
    def unmap_=(value: CFuncPtr1[Ptr[GtkWidget], Unit]): Unit = !struct.at(160).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]] = value
    def realize: CFuncPtr1[Ptr[GtkWidget], Unit] = !struct.at(168).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]]
    def realize_=(value: CFuncPtr1[Ptr[GtkWidget], Unit]): Unit = !struct.at(168).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]] = value
    def unrealize: CFuncPtr1[Ptr[GtkWidget], Unit] = !struct.at(176).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]]
    def unrealize_=(value: CFuncPtr1[Ptr[GtkWidget], Unit]): Unit = !struct.at(176).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]] = value
    def root: CFuncPtr1[Ptr[GtkWidget], Unit] = !struct.at(184).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]]
    def root_=(value: CFuncPtr1[Ptr[GtkWidget], Unit]): Unit = !struct.at(184).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]] = value
    def unroot: CFuncPtr1[Ptr[GtkWidget], Unit] = !struct.at(192).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]]
    def unroot_=(value: CFuncPtr1[Ptr[GtkWidget], Unit]): Unit = !struct.at(192).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]] = value
    def size_allocate: CFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit] = !struct.at(200).asInstanceOf[Ptr[CFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit]]]
    def size_allocate_=(value: CFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit]): Unit = !struct.at(200).asInstanceOf[Ptr[CFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit]]] = value
    def state_flags_changed: CFuncPtr2[Ptr[GtkWidget], GtkStateFlags, Unit] = !struct.at(208).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkStateFlags, Unit]]]
    def state_flags_changed_=(value: CFuncPtr2[Ptr[GtkWidget], GtkStateFlags, Unit]): Unit = !struct.at(208).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkStateFlags, Unit]]] = value
    def direction_changed: CFuncPtr2[Ptr[GtkWidget], GtkTextDirection, Unit] = !struct.at(216).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkTextDirection, Unit]]]
    def direction_changed_=(value: CFuncPtr2[Ptr[GtkWidget], GtkTextDirection, Unit]): Unit = !struct.at(216).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkTextDirection, Unit]]] = value
    def get_request_mode: CFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode] = !struct.at(224).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode]]]
    def get_request_mode_=(value: CFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode]): Unit = !struct.at(224).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode]]] = value
    def measure: CFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit] = !struct.at(232).asInstanceOf[Ptr[CFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit]]]
    def measure_=(value: CFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit]): Unit = !struct.at(232).asInstanceOf[Ptr[CFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit]]] = value
    def mnemonic_activate: CFuncPtr2[Ptr[GtkWidget], _root_.glib.all.gboolean, _root_.glib.all.gboolean] = !struct.at(240).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], _root_.glib.all.gboolean, _root_.glib.all.gboolean]]]
    def mnemonic_activate_=(value: CFuncPtr2[Ptr[GtkWidget], _root_.glib.all.gboolean, _root_.glib.all.gboolean]): Unit = !struct.at(240).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], _root_.glib.all.gboolean, _root_.glib.all.gboolean]]] = value
    def grab_focus: CFuncPtr1[Ptr[GtkWidget], _root_.glib.all.gboolean] = !struct.at(248).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], _root_.glib.all.gboolean]]]
    def grab_focus_=(value: CFuncPtr1[Ptr[GtkWidget], _root_.glib.all.gboolean]): Unit = !struct.at(248).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], _root_.glib.all.gboolean]]] = value
    def focus: CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.glib.all.gboolean] = !struct.at(256).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.glib.all.gboolean]]]
    def focus_=(value: CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.glib.all.gboolean]): Unit = !struct.at(256).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.glib.all.gboolean]]] = value
    def set_focus_child: CFuncPtr2[Ptr[GtkWidget], Ptr[GtkWidget], Unit] = !struct.at(264).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], Ptr[GtkWidget], Unit]]]
    def set_focus_child_=(value: CFuncPtr2[Ptr[GtkWidget], Ptr[GtkWidget], Unit]): Unit = !struct.at(264).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], Ptr[GtkWidget], Unit]]] = value
    def move_focus: CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, Unit] = !struct.at(272).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, Unit]]]
    def move_focus_=(value: CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, Unit]): Unit = !struct.at(272).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, Unit]]] = value
    def keynav_failed: CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.glib.all.gboolean] = !struct.at(280).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.glib.all.gboolean]]]
    def keynav_failed_=(value: CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.glib.all.gboolean]): Unit = !struct.at(280).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.glib.all.gboolean]]] = value
    def query_tooltip: CFuncPtr5[Ptr[GtkWidget], CInt, CInt, _root_.glib.all.gboolean, Ptr[GtkTooltip], _root_.glib.all.gboolean] = !struct.at(288).asInstanceOf[Ptr[CFuncPtr5[Ptr[GtkWidget], CInt, CInt, _root_.glib.all.gboolean, Ptr[GtkTooltip], _root_.glib.all.gboolean]]]
    def query_tooltip_=(value: CFuncPtr5[Ptr[GtkWidget], CInt, CInt, _root_.glib.all.gboolean, Ptr[GtkTooltip], _root_.glib.all.gboolean]): Unit = !struct.at(288).asInstanceOf[Ptr[CFuncPtr5[Ptr[GtkWidget], CInt, CInt, _root_.glib.all.gboolean, Ptr[GtkTooltip], _root_.glib.all.gboolean]]] = value
    def compute_expand: CFuncPtr3[Ptr[GtkWidget], Ptr[_root_.glib.all.gboolean], Ptr[_root_.glib.all.gboolean], Unit] = !struct.at(296).asInstanceOf[Ptr[CFuncPtr3[Ptr[GtkWidget], Ptr[_root_.glib.all.gboolean], Ptr[_root_.glib.all.gboolean], Unit]]]
    def compute_expand_=(value: CFuncPtr3[Ptr[GtkWidget], Ptr[_root_.glib.all.gboolean], Ptr[_root_.glib.all.gboolean], Unit]): Unit = !struct.at(296).asInstanceOf[Ptr[CFuncPtr3[Ptr[GtkWidget], Ptr[_root_.glib.all.gboolean], Ptr[_root_.glib.all.gboolean], Unit]]] = value
    def css_changed: CFuncPtr2[Ptr[GtkWidget], Ptr[GtkCssStyleChange], Unit] = !struct.at(304).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], Ptr[GtkCssStyleChange], Unit]]]
    def css_changed_=(value: CFuncPtr2[Ptr[GtkWidget], Ptr[GtkCssStyleChange], Unit]): Unit = !struct.at(304).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], Ptr[GtkCssStyleChange], Unit]]] = value
    def system_setting_changed: CFuncPtr2[Ptr[GtkWidget], GtkSystemSetting, Unit] = !struct.at(312).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkSystemSetting, Unit]]]
    def system_setting_changed_=(value: CFuncPtr2[Ptr[GtkWidget], GtkSystemSetting, Unit]): Unit = !struct.at(312).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkSystemSetting, Unit]]] = value
    def snapshot: CFuncPtr2[Ptr[GtkWidget], Ptr[GtkSnapshot], Unit] = !struct.at(320).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], Ptr[GtkSnapshot], Unit]]]
    def snapshot_=(value: CFuncPtr2[Ptr[GtkWidget], Ptr[GtkSnapshot], Unit]): Unit = !struct.at(320).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], Ptr[GtkSnapshot], Unit]]] = value
    def contains: CFuncPtr3[Ptr[GtkWidget], Double, Double, _root_.glib.all.gboolean] = !struct.at(328).asInstanceOf[Ptr[CFuncPtr3[Ptr[GtkWidget], Double, Double, _root_.glib.all.gboolean]]]
    def contains_=(value: CFuncPtr3[Ptr[GtkWidget], Double, Double, _root_.glib.all.gboolean]): Unit = !struct.at(328).asInstanceOf[Ptr[CFuncPtr3[Ptr[GtkWidget], Double, Double, _root_.glib.all.gboolean]]] = value
    def priv: Ptr[GtkWidgetClassPrivate] = !struct.at(336).asInstanceOf[Ptr[Ptr[GtkWidgetClassPrivate]]]
    def priv_=(value: Ptr[GtkWidgetClassPrivate]): Unit = !struct.at(336).asInstanceOf[Ptr[Ptr[GtkWidgetClassPrivate]]] = value
    def padding: CArray[_root_.glib.all.gpointer, Nat._8] = !struct.at(344).asInstanceOf[Ptr[CArray[_root_.glib.all.gpointer, Nat._8]]]
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at(344).asInstanceOf[Ptr[CArray[_root_.glib.all.gpointer, Nat._8]]] = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidget.h
*/
opaque type GtkWidgetClassPrivate = CStruct0
object GtkWidgetClassPrivate:
  given _tag: Tag[GtkWidgetClassPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidgetpaintable.h
*/
opaque type GtkWidgetPaintable = CStruct0
object GtkWidgetPaintable:
  given _tag: Tag[GtkWidgetPaintable] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidgetpaintable.h
*/
opaque type GtkWidgetPaintableClass = CStruct1[_root_.gobject.all.GObjectClass]
object GtkWidgetPaintableClass:
  given _tag: Tag[GtkWidgetPaintableClass] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObjectClass]
  def apply()(using Zone): Ptr[GtkWidgetPaintableClass] = scala.scalanative.unsafe.alloc[GtkWidgetPaintableClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[GtkWidgetPaintableClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkWidgetPaintableClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidget.h
*/
opaque type GtkWidgetPrivate = CStruct0
object GtkWidgetPrivate:
  given _tag: Tag[GtkWidgetPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindow.h
*/
opaque type GtkWindow = CStruct1[GtkWidget]
object GtkWindow:
  given _tag: Tag[GtkWindow] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[GtkWindow] = scala.scalanative.unsafe.alloc[GtkWindow](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[GtkWindow] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: GtkWindow)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * GtkWindowClass: _class: The parent class. _focus: Activates the current focused widget within the window. _default: Activates the default widget for the window. _changed: Signal gets emitted when the set of accelerators or mnemonics that are associated with window changes. _debugging: Class handler for the `GtkWindow::enable-debugging` keybinding signal. _request: Class handler for the `GtkWindow::close-request` signal.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindow.h
*/
opaque type GtkWindowClass = CStruct7[GtkWidgetClass, CFuncPtr1[Ptr[GtkWindow], Unit], CFuncPtr1[Ptr[GtkWindow], Unit], CFuncPtr1[Ptr[GtkWindow], Unit], CFuncPtr2[Ptr[GtkWindow], _root_.glib.all.gboolean, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkWindow], _root_.glib.all.gboolean], CArray[_root_.glib.all.gpointer, Nat._8]]
object GtkWindowClass:
  given _tag: Tag[GtkWindowClass] = Tag.materializeCStruct7Tag[GtkWidgetClass, CFuncPtr1[Ptr[GtkWindow], Unit], CFuncPtr1[Ptr[GtkWindow], Unit], CFuncPtr1[Ptr[GtkWindow], Unit], CFuncPtr2[Ptr[GtkWindow], _root_.glib.all.gboolean, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkWindow], _root_.glib.all.gboolean], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GtkWindowClass] = scala.scalanative.unsafe.alloc[GtkWindowClass](1)
  def apply(parent_class : GtkWidgetClass, activate_focus : CFuncPtr1[Ptr[GtkWindow], Unit], activate_default : CFuncPtr1[Ptr[GtkWindow], Unit], keys_changed : CFuncPtr1[Ptr[GtkWindow], Unit], enable_debugging : CFuncPtr2[Ptr[GtkWindow], _root_.glib.all.gboolean, _root_.glib.all.gboolean], close_request : CFuncPtr1[Ptr[GtkWindow], _root_.glib.all.gboolean], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[GtkWindowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).activate_focus = activate_focus
    (!____ptr).activate_default = activate_default
    (!____ptr).keys_changed = keys_changed
    (!____ptr).enable_debugging = enable_debugging
    (!____ptr).close_request = close_request
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GtkWindowClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def activate_focus : CFuncPtr1[Ptr[GtkWindow], Unit] = struct._2
    def activate_focus_=(value: CFuncPtr1[Ptr[GtkWindow], Unit]): Unit = !struct.at2 = value
    def activate_default : CFuncPtr1[Ptr[GtkWindow], Unit] = struct._3
    def activate_default_=(value: CFuncPtr1[Ptr[GtkWindow], Unit]): Unit = !struct.at3 = value
    def keys_changed : CFuncPtr1[Ptr[GtkWindow], Unit] = struct._4
    def keys_changed_=(value: CFuncPtr1[Ptr[GtkWindow], Unit]): Unit = !struct.at4 = value
    def enable_debugging : CFuncPtr2[Ptr[GtkWindow], _root_.glib.all.gboolean, _root_.glib.all.gboolean] = struct._5
    def enable_debugging_=(value: CFuncPtr2[Ptr[GtkWindow], _root_.glib.all.gboolean, _root_.glib.all.gboolean]): Unit = !struct.at5 = value
    def close_request : CFuncPtr1[Ptr[GtkWindow], _root_.glib.all.gboolean] = struct._6
    def close_request_=(value: CFuncPtr1[Ptr[GtkWindow], _root_.glib.all.gboolean]): Unit = !struct.at6 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._7
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at7 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindowcontrols.h
*/
opaque type GtkWindowControls = CStruct0
object GtkWindowControls:
  given _tag: Tag[GtkWindowControls] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindowcontrols.h
*/
opaque type GtkWindowControlsClass = CStruct1[GtkWidgetClass]
object GtkWindowControlsClass:
  given _tag: Tag[GtkWindowControlsClass] = Tag.materializeCStruct1Tag[GtkWidgetClass]
  def apply()(using Zone): Ptr[GtkWindowControlsClass] = scala.scalanative.unsafe.alloc[GtkWindowControlsClass](1)
  def apply(parent_class : GtkWidgetClass)(using Zone): Ptr[GtkWindowControlsClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkWindowControlsClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindowgroup.h
*/
opaque type GtkWindowGroup = CStruct2[_root_.gobject.all.GObject, Ptr[GtkWindowGroupPrivate]]
object GtkWindowGroup:
  given _tag: Tag[GtkWindowGroup] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObject, Ptr[GtkWindowGroupPrivate]]
  def apply()(using Zone): Ptr[GtkWindowGroup] = scala.scalanative.unsafe.alloc[GtkWindowGroup](1)
  def apply(parent_instance : _root_.gobject.all.GObject, priv : Ptr[GtkWindowGroupPrivate])(using Zone): Ptr[GtkWindowGroup] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr
  extension (struct: GtkWindowGroup)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value
    def priv : Ptr[GtkWindowGroupPrivate] = struct._2
    def priv_=(value: Ptr[GtkWindowGroupPrivate]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindowgroup.h
*/
opaque type GtkWindowGroupClass = CStruct5[_root_.gobject.all.GObjectClass, CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object GtkWindowGroupClass:
  given _tag: Tag[GtkWindowGroupClass] = Tag.materializeCStruct5Tag[_root_.gobject.all.GObjectClass, CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[GtkWindowGroupClass] = scala.scalanative.unsafe.alloc[GtkWindowGroupClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[GtkWindowGroupClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    ____ptr
  extension (struct: GtkWindowGroupClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def _gtk_reserved1 : CFuncPtr0[Unit] = struct._2
    def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at2 = value
    def _gtk_reserved2 : CFuncPtr0[Unit] = struct._3
    def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at3 = value
    def _gtk_reserved3 : CFuncPtr0[Unit] = struct._4
    def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at4 = value
    def _gtk_reserved4 : CFuncPtr0[Unit] = struct._5
    def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at5 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindow.h
*/
opaque type GtkWindowGroupPrivate = CStruct0
object GtkWindowGroupPrivate:
  given _tag: Tag[GtkWindowGroupPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindowhandle.h
*/
opaque type GtkWindowHandle = CStruct0
object GtkWindowHandle:
  given _tag: Tag[GtkWindowHandle] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindowhandle.h
*/
opaque type GtkWindowHandleClass = CStruct1[GtkWidgetClass]
object GtkWindowHandleClass:
  given _tag: Tag[GtkWindowHandleClass] = Tag.materializeCStruct1Tag[GtkWidgetClass]
  def apply()(using Zone): Ptr[GtkWindowHandleClass] = scala.scalanative.unsafe.alloc[GtkWindowHandleClass](1)
  def apply(parent_class : GtkWidgetClass)(using Zone): Ptr[GtkWindowHandleClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: GtkWindowHandleClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value

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
opaque type _GskRoundedRect = CStruct2[_root_.graphene.all.graphene_rect_t, CArray[_root_.graphene.all.graphene_size_t, Nat._4]]
object _GskRoundedRect:
  given _tag: Tag[_GskRoundedRect] = Tag.materializeCStruct2Tag[_root_.graphene.all.graphene_rect_t, CArray[_root_.graphene.all.graphene_size_t, Nat._4]]
  def apply()(using Zone): Ptr[_GskRoundedRect] = scala.scalanative.unsafe.alloc[_GskRoundedRect](1)
  def apply(bounds : _root_.graphene.all.graphene_rect_t, corner : CArray[_root_.graphene.all.graphene_size_t, Nat._4])(using Zone): Ptr[_GskRoundedRect] = 
    val ____ptr = apply()
    (!____ptr).bounds = bounds
    (!____ptr).corner = corner
    ____ptr
  extension (struct: _GskRoundedRect)
    def bounds : _root_.graphene.all.graphene_rect_t = struct._1
    def bounds_=(value: _root_.graphene.all.graphene_rect_t): Unit = !struct.at1 = value
    def corner : CArray[_root_.graphene.all.graphene_size_t, Nat._4] = struct._2
    def corner_=(value: CArray[_root_.graphene.all.graphene_size_t, Nat._4]): Unit = !struct.at2 = value

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
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkatcontext.h
*/
opaque type _GtkATContext = CStruct0
object _GtkATContext:
  given _tag: Tag[_GtkATContext] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkatcontext.h
*/
opaque type _GtkATContextClass = CStruct0
object _GtkATContextClass:
  given _tag: Tag[_GtkATContextClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkaboutdialog.h
*/
opaque type _GtkAboutDialog = CStruct0
object _GtkAboutDialog:
  given _tag: Tag[_GtkAboutDialog] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkaccessible.h
*/
opaque type _GtkAccessible = CStruct0
object _GtkAccessible:
  given _tag: Tag[_GtkAccessible] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkaccessible.h
*/
opaque type _GtkAccessibleInterface = CStruct0
object _GtkAccessibleInterface:
  given _tag: Tag[_GtkAccessibleInterface] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkactionbar.h
*/
opaque type _GtkActionBar = CStruct0
object _GtkActionBar:
  given _tag: Tag[_GtkActionBar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkactionable.h
*/
opaque type _GtkActionable = CStruct0
object _GtkActionable:
  given _tag: Tag[_GtkActionable] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkactionable.h
*/
opaque type _GtkActionableInterface = CStruct5[_root_.gobject.all.GTypeInterface, CFuncPtr1[Ptr[GtkActionable], CString], CFuncPtr2[Ptr[GtkActionable], CString, Unit], CFuncPtr1[Ptr[GtkActionable], Ptr[_root_.glib.all.GVariant]], CFuncPtr2[Ptr[GtkActionable], Ptr[_root_.glib.all.GVariant], Unit]]
object _GtkActionableInterface:
  given _tag: Tag[_GtkActionableInterface] = Tag.materializeCStruct5Tag[_root_.gobject.all.GTypeInterface, CFuncPtr1[Ptr[GtkActionable], CString], CFuncPtr2[Ptr[GtkActionable], CString, Unit], CFuncPtr1[Ptr[GtkActionable], Ptr[_root_.glib.all.GVariant]], CFuncPtr2[Ptr[GtkActionable], Ptr[_root_.glib.all.GVariant], Unit]]
  def apply()(using Zone): Ptr[_GtkActionableInterface] = scala.scalanative.unsafe.alloc[_GtkActionableInterface](1)
  def apply(g_iface : _root_.gobject.all.GTypeInterface, get_action_name : CFuncPtr1[Ptr[GtkActionable], CString], set_action_name : CFuncPtr2[Ptr[GtkActionable], CString, Unit], get_action_target_value : CFuncPtr1[Ptr[GtkActionable], Ptr[_root_.glib.all.GVariant]], set_action_target_value : CFuncPtr2[Ptr[GtkActionable], Ptr[_root_.glib.all.GVariant], Unit])(using Zone): Ptr[_GtkActionableInterface] = 
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).get_action_name = get_action_name
    (!____ptr).set_action_name = set_action_name
    (!____ptr).get_action_target_value = get_action_target_value
    (!____ptr).set_action_target_value = set_action_target_value
    ____ptr
  extension (struct: _GtkActionableInterface)
    def g_iface : _root_.gobject.all.GTypeInterface = struct._1
    def g_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def get_action_name : CFuncPtr1[Ptr[GtkActionable], CString] = struct._2
    def get_action_name_=(value: CFuncPtr1[Ptr[GtkActionable], CString]): Unit = !struct.at2 = value
    def set_action_name : CFuncPtr2[Ptr[GtkActionable], CString, Unit] = struct._3
    def set_action_name_=(value: CFuncPtr2[Ptr[GtkActionable], CString, Unit]): Unit = !struct.at3 = value
    def get_action_target_value : CFuncPtr1[Ptr[GtkActionable], Ptr[_root_.glib.all.GVariant]] = struct._4
    def get_action_target_value_=(value: CFuncPtr1[Ptr[GtkActionable], Ptr[_root_.glib.all.GVariant]]): Unit = !struct.at4 = value
    def set_action_target_value : CFuncPtr2[Ptr[GtkActionable], Ptr[_root_.glib.all.GVariant], Unit] = struct._5
    def set_action_target_value_=(value: CFuncPtr2[Ptr[GtkActionable], Ptr[_root_.glib.all.GVariant], Unit]): Unit = !struct.at5 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type _GtkActivateAction = CStruct0
object _GtkActivateAction:
  given _tag: Tag[_GtkActivateAction] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type _GtkActivateActionClass = CStruct0
object _GtkActivateActionClass:
  given _tag: Tag[_GtkActivateActionClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkadjustment.h
*/
opaque type _GtkAdjustment = CStruct1[_root_.gobject.all.GInitiallyUnowned]
object _GtkAdjustment:
  given _tag: Tag[_GtkAdjustment] = Tag.materializeCStruct1Tag[_root_.gobject.all.GInitiallyUnowned]
  def apply()(using Zone): Ptr[_GtkAdjustment] = scala.scalanative.unsafe.alloc[_GtkAdjustment](1)
  def apply(parent_instance : _root_.gobject.all.GInitiallyUnowned)(using Zone): Ptr[_GtkAdjustment] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkAdjustment)
    def parent_instance : _root_.gobject.all.GInitiallyUnowned = struct._1
    def parent_instance_=(value: _root_.gobject.all.GInitiallyUnowned): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkadjustment.h
*/
opaque type _GtkAdjustmentClass = CStruct7[_root_.gobject.all.GInitiallyUnownedClass, CFuncPtr1[Ptr[GtkAdjustment], Unit], CFuncPtr1[Ptr[GtkAdjustment], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object _GtkAdjustmentClass:
  given _tag: Tag[_GtkAdjustmentClass] = Tag.materializeCStruct7Tag[_root_.gobject.all.GInitiallyUnownedClass, CFuncPtr1[Ptr[GtkAdjustment], Unit], CFuncPtr1[Ptr[GtkAdjustment], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[_GtkAdjustmentClass] = scala.scalanative.unsafe.alloc[_GtkAdjustmentClass](1)
  def apply(parent_class : _root_.gobject.all.GInitiallyUnownedClass, changed : CFuncPtr1[Ptr[GtkAdjustment], Unit], value_changed : CFuncPtr1[Ptr[GtkAdjustment], Unit], _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[_GtkAdjustmentClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).changed = changed
    (!____ptr).value_changed = value_changed
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    ____ptr
  extension (struct: _GtkAdjustmentClass)
    def parent_class : _root_.gobject.all.GInitiallyUnownedClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GInitiallyUnownedClass): Unit = !struct.at1 = value
    def changed : CFuncPtr1[Ptr[GtkAdjustment], Unit] = struct._2
    def changed_=(value: CFuncPtr1[Ptr[GtkAdjustment], Unit]): Unit = !struct.at2 = value
    def value_changed : CFuncPtr1[Ptr[GtkAdjustment], Unit] = struct._3
    def value_changed_=(value: CFuncPtr1[Ptr[GtkAdjustment], Unit]): Unit = !struct.at3 = value
    def _gtk_reserved1 : CFuncPtr0[Unit] = struct._4
    def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at4 = value
    def _gtk_reserved2 : CFuncPtr0[Unit] = struct._5
    def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at5 = value
    def _gtk_reserved3 : CFuncPtr0[Unit] = struct._6
    def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at6 = value
    def _gtk_reserved4 : CFuncPtr0[Unit] = struct._7
    def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at7 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type _GtkAlternativeTrigger = CStruct0
object _GtkAlternativeTrigger:
  given _tag: Tag[_GtkAlternativeTrigger] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type _GtkAlternativeTriggerClass = CStruct0
object _GtkAlternativeTriggerClass:
  given _tag: Tag[_GtkAlternativeTriggerClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type _GtkAnyFilter = CStruct0
object _GtkAnyFilter:
  given _tag: Tag[_GtkAnyFilter] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type _GtkAnyFilterClass = CStruct0
object _GtkAnyFilterClass:
  given _tag: Tag[_GtkAnyFilterClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkappchooser.h
*/
opaque type _GtkAppChooser = CStruct0
object _GtkAppChooser:
  given _tag: Tag[_GtkAppChooser] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkappchooserbutton.h
*/
opaque type _GtkAppChooserButton = CStruct0
object _GtkAppChooserButton:
  given _tag: Tag[_GtkAppChooserButton] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkappchooserdialog.h
*/
opaque type _GtkAppChooserDialog = CStruct0
object _GtkAppChooserDialog:
  given _tag: Tag[_GtkAppChooserDialog] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkappchooserwidget.h
*/
opaque type _GtkAppChooserWidget = CStruct0
object _GtkAppChooserWidget:
  given _tag: Tag[_GtkAppChooserWidget] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkapplication.h
*/
opaque type _GtkApplication = CStruct1[_root_.gio.all.GApplication]
object _GtkApplication:
  given _tag: Tag[_GtkApplication] = Tag.materializeCStruct1Tag[_root_.gio.all.GApplication]
  def apply()(using Zone): Ptr[_GtkApplication] = scala.scalanative.unsafe.alloc[_GtkApplication](1)
  def apply(parent_instance : _root_.gio.all.GApplication)(using Zone): Ptr[_GtkApplication] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkApplication)
    def parent_instance : _root_.gio.all.GApplication = struct._1
    def parent_instance_=(value: _root_.gio.all.GApplication): Unit = !struct.at1 = value

/**
 * GtkApplicationClass: _class: The parent class. _added: Signal emitted when a `GtkWindow` is added to application through gtk_application_add_window(). _removed: Signal emitted when a `GtkWindow` is removed from application, either as a side-effect of being destroyed or explicitly through gtk_application_remove_window().

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkapplication.h
*/
opaque type _GtkApplicationClass = CStruct4[_root_.gio.all.GApplicationClass, CFuncPtr2[Ptr[GtkApplication], Ptr[GtkWindow], Unit], CFuncPtr2[Ptr[GtkApplication], Ptr[GtkWindow], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkApplicationClass:
  given _tag: Tag[_GtkApplicationClass] = Tag.materializeCStruct4Tag[_root_.gio.all.GApplicationClass, CFuncPtr2[Ptr[GtkApplication], Ptr[GtkWindow], Unit], CFuncPtr2[Ptr[GtkApplication], Ptr[GtkWindow], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkApplicationClass] = scala.scalanative.unsafe.alloc[_GtkApplicationClass](1)
  def apply(parent_class : _root_.gio.all.GApplicationClass, window_added : CFuncPtr2[Ptr[GtkApplication], Ptr[GtkWindow], Unit], window_removed : CFuncPtr2[Ptr[GtkApplication], Ptr[GtkWindow], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkApplicationClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).window_added = window_added
    (!____ptr).window_removed = window_removed
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkApplicationClass)
    def parent_class : _root_.gio.all.GApplicationClass = struct._1
    def parent_class_=(value: _root_.gio.all.GApplicationClass): Unit = !struct.at1 = value
    def window_added : CFuncPtr2[Ptr[GtkApplication], Ptr[GtkWindow], Unit] = struct._2
    def window_added_=(value: CFuncPtr2[Ptr[GtkApplication], Ptr[GtkWindow], Unit]): Unit = !struct.at2 = value
    def window_removed : CFuncPtr2[Ptr[GtkApplication], Ptr[GtkWindow], Unit] = struct._3
    def window_removed_=(value: CFuncPtr2[Ptr[GtkApplication], Ptr[GtkWindow], Unit]): Unit = !struct.at3 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._4
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at4 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkapplicationwindow.h
*/
opaque type _GtkApplicationWindow = CStruct1[GtkWindow]
object _GtkApplicationWindow:
  given _tag: Tag[_GtkApplicationWindow] = Tag.materializeCStruct1Tag[GtkWindow]
  def apply()(using Zone): Ptr[_GtkApplicationWindow] = scala.scalanative.unsafe.alloc[_GtkApplicationWindow](1)
  def apply(parent_instance : GtkWindow)(using Zone): Ptr[_GtkApplicationWindow] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkApplicationWindow)
    def parent_instance : GtkWindow = struct._1
    def parent_instance_=(value: GtkWindow): Unit = !struct.at1 = value

/**
 * GtkApplicationWindowClass: _class: The parent class.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkapplicationwindow.h
*/
opaque type _GtkApplicationWindowClass = CStruct2[GtkWindowClass, CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkApplicationWindowClass:
  given _tag: Tag[_GtkApplicationWindowClass] = Tag.materializeCStruct2Tag[GtkWindowClass, CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkApplicationWindowClass] = scala.scalanative.unsafe.alloc[_GtkApplicationWindowClass](1)
  def apply(parent_class : GtkWindowClass, padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkApplicationWindowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkApplicationWindowClass)
    def parent_class : GtkWindowClass = struct._1
    def parent_class_=(value: GtkWindowClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._2
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkaspectframe.h
*/
opaque type _GtkAspectFrame = CStruct0
object _GtkAspectFrame:
  given _tag: Tag[_GtkAspectFrame] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkassistant.h
*/
opaque type _GtkAssistant = CStruct0
object _GtkAssistant:
  given _tag: Tag[_GtkAssistant] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkassistant.h
*/
opaque type _GtkAssistantPage = CStruct0
object _GtkAssistantPage:
  given _tag: Tag[_GtkAssistantPage] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbinlayout.h
*/
opaque type _GtkBinLayout = CStruct0
object _GtkBinLayout:
  given _tag: Tag[_GtkBinLayout] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
opaque type _GtkBitset = CStruct0
object _GtkBitset:
  given _tag: Tag[_GtkBitset] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbitset.h
*/
opaque type _GtkBitsetIter = CStruct1[CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._0]]]
object _GtkBitsetIter:
  given _tag: Tag[_GtkBitsetIter] = Tag.materializeCStruct1Tag[CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._0]]]
  def apply()(using Zone): Ptr[_GtkBitsetIter] = scala.scalanative.unsafe.alloc[_GtkBitsetIter](1)
  def apply(private_data : CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._0]])(using Zone): Ptr[_GtkBitsetIter] = 
    val ____ptr = apply()
    (!____ptr).private_data = private_data
    ____ptr
  extension (struct: _GtkBitsetIter)
    def private_data : CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._0]] = struct._1
    def private_data_=(value: CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._0]]): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbookmarklist.h
*/
opaque type _GtkBookmarkList = CStruct0
object _GtkBookmarkList:
  given _tag: Tag[_GtkBookmarkList] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkboolfilter.h
*/
opaque type _GtkBoolFilter = CStruct0
object _GtkBoolFilter:
  given _tag: Tag[_GtkBoolFilter] = Tag.materializeCStruct0Tag

/**
 * GtkBorder: : The width of the left border : The width of the right border : The width of the top border : The width of the bottom border

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkborder.h
*/
opaque type _GtkBorder = CStruct4[_root_.glib.all.gint16, _root_.glib.all.gint16, _root_.glib.all.gint16, _root_.glib.all.gint16]
object _GtkBorder:
  given _tag: Tag[_GtkBorder] = Tag.materializeCStruct4Tag[_root_.glib.all.gint16, _root_.glib.all.gint16, _root_.glib.all.gint16, _root_.glib.all.gint16]
  def apply()(using Zone): Ptr[_GtkBorder] = scala.scalanative.unsafe.alloc[_GtkBorder](1)
  def apply(left : _root_.glib.all.gint16, right : _root_.glib.all.gint16, top : _root_.glib.all.gint16, bottom : _root_.glib.all.gint16)(using Zone): Ptr[_GtkBorder] = 
    val ____ptr = apply()
    (!____ptr).left = left
    (!____ptr).right = right
    (!____ptr).top = top
    (!____ptr).bottom = bottom
    ____ptr
  extension (struct: _GtkBorder)
    def left : _root_.glib.all.gint16 = struct._1
    def left_=(value: _root_.glib.all.gint16): Unit = !struct.at1 = value
    def right : _root_.glib.all.gint16 = struct._2
    def right_=(value: _root_.glib.all.gint16): Unit = !struct.at2 = value
    def top : _root_.glib.all.gint16 = struct._3
    def top_=(value: _root_.glib.all.gint16): Unit = !struct.at3 = value
    def bottom : _root_.glib.all.gint16 = struct._4
    def bottom_=(value: _root_.glib.all.gint16): Unit = !struct.at4 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbox.h
*/
opaque type _GtkBox = CStruct1[GtkWidget]
object _GtkBox:
  given _tag: Tag[_GtkBox] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[_GtkBox] = scala.scalanative.unsafe.alloc[_GtkBox](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[_GtkBox] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkBox)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * GtkBoxClass: _class: The parent class.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbox.h
*/
opaque type _GtkBoxClass = CStruct2[GtkWidgetClass, CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkBoxClass:
  given _tag: Tag[_GtkBoxClass] = Tag.materializeCStruct2Tag[GtkWidgetClass, CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkBoxClass] = scala.scalanative.unsafe.alloc[_GtkBoxClass](1)
  def apply(parent_class : GtkWidgetClass, padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkBoxClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkBoxClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._2
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkboxlayout.h
*/
opaque type _GtkBoxLayout = CStruct0
object _GtkBoxLayout:
  given _tag: Tag[_GtkBoxLayout] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuildable.h
*/
opaque type _GtkBuildable = CStruct0
object _GtkBuildable:
  given _tag: Tag[_GtkBuildable] = Tag.materializeCStruct0Tag

/**
 * GtkBuildableIface: _iface: the parent class

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuildable.h
*/
opaque type _GtkBuildableIface = CStruct11[_root_.gobject.all.GTypeInterface, CFuncPtr2[Ptr[GtkBuildable], CString, Unit], CFuncPtr1[Ptr[GtkBuildable], CString], CFuncPtr4[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, Unit], CFuncPtr4[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.gobject.all.GValue], Unit], CFuncPtr3[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.gobject.all.GObject]], CFuncPtr6[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, Ptr[GtkBuildableParser], Ptr[_root_.glib.all.gpointer], _root_.glib.all.gboolean], CFuncPtr5[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, _root_.glib.all.gpointer, Unit], CFuncPtr5[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, _root_.glib.all.gpointer, Unit], CFuncPtr2[Ptr[GtkBuildable], Ptr[GtkBuilder], Unit], CFuncPtr3[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.gobject.all.GObject]]]
object _GtkBuildableIface:
  given _tag: Tag[_GtkBuildableIface] = Tag.materializeCStruct11Tag[_root_.gobject.all.GTypeInterface, CFuncPtr2[Ptr[GtkBuildable], CString, Unit], CFuncPtr1[Ptr[GtkBuildable], CString], CFuncPtr4[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, Unit], CFuncPtr4[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.gobject.all.GValue], Unit], CFuncPtr3[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.gobject.all.GObject]], CFuncPtr6[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, Ptr[GtkBuildableParser], Ptr[_root_.glib.all.gpointer], _root_.glib.all.gboolean], CFuncPtr5[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, _root_.glib.all.gpointer, Unit], CFuncPtr5[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, _root_.glib.all.gpointer, Unit], CFuncPtr2[Ptr[GtkBuildable], Ptr[GtkBuilder], Unit], CFuncPtr3[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.gobject.all.GObject]]]
  def apply()(using Zone): Ptr[_GtkBuildableIface] = scala.scalanative.unsafe.alloc[_GtkBuildableIface](1)
  def apply(g_iface : _root_.gobject.all.GTypeInterface, set_id : CFuncPtr2[Ptr[GtkBuildable], CString, Unit], get_id : CFuncPtr1[Ptr[GtkBuildable], CString], add_child : CFuncPtr4[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, Unit], set_buildable_property : CFuncPtr4[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.gobject.all.GValue], Unit], construct_child : CFuncPtr3[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.gobject.all.GObject]], custom_tag_start : CFuncPtr6[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, Ptr[GtkBuildableParser], Ptr[_root_.glib.all.gpointer], _root_.glib.all.gboolean], custom_tag_end : CFuncPtr5[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, _root_.glib.all.gpointer, Unit], custom_finished : CFuncPtr5[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, _root_.glib.all.gpointer, Unit], parser_finished : CFuncPtr2[Ptr[GtkBuildable], Ptr[GtkBuilder], Unit], get_internal_child : CFuncPtr3[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.gobject.all.GObject]])(using Zone): Ptr[_GtkBuildableIface] = 
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).set_id = set_id
    (!____ptr).get_id = get_id
    (!____ptr).add_child = add_child
    (!____ptr).set_buildable_property = set_buildable_property
    (!____ptr).construct_child = construct_child
    (!____ptr).custom_tag_start = custom_tag_start
    (!____ptr).custom_tag_end = custom_tag_end
    (!____ptr).custom_finished = custom_finished
    (!____ptr).parser_finished = parser_finished
    (!____ptr).get_internal_child = get_internal_child
    ____ptr
  extension (struct: _GtkBuildableIface)
    def g_iface : _root_.gobject.all.GTypeInterface = struct._1
    def g_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def set_id : CFuncPtr2[Ptr[GtkBuildable], CString, Unit] = struct._2
    def set_id_=(value: CFuncPtr2[Ptr[GtkBuildable], CString, Unit]): Unit = !struct.at2 = value
    def get_id : CFuncPtr1[Ptr[GtkBuildable], CString] = struct._3
    def get_id_=(value: CFuncPtr1[Ptr[GtkBuildable], CString]): Unit = !struct.at3 = value
    def add_child : CFuncPtr4[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, Unit] = struct._4
    def add_child_=(value: CFuncPtr4[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, Unit]): Unit = !struct.at4 = value
    def set_buildable_property : CFuncPtr4[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.gobject.all.GValue], Unit] = struct._5
    def set_buildable_property_=(value: CFuncPtr4[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.gobject.all.GValue], Unit]): Unit = !struct.at5 = value
    def construct_child : CFuncPtr3[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.gobject.all.GObject]] = struct._6
    def construct_child_=(value: CFuncPtr3[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.gobject.all.GObject]]): Unit = !struct.at6 = value
    def custom_tag_start : CFuncPtr6[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, Ptr[GtkBuildableParser], Ptr[_root_.glib.all.gpointer], _root_.glib.all.gboolean] = struct._7
    def custom_tag_start_=(value: CFuncPtr6[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, Ptr[GtkBuildableParser], Ptr[_root_.glib.all.gpointer], _root_.glib.all.gboolean]): Unit = !struct.at7 = value
    def custom_tag_end : CFuncPtr5[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, _root_.glib.all.gpointer, Unit] = struct._8
    def custom_tag_end_=(value: CFuncPtr5[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, _root_.glib.all.gpointer, Unit]): Unit = !struct.at8 = value
    def custom_finished : CFuncPtr5[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, _root_.glib.all.gpointer, Unit] = struct._9
    def custom_finished_=(value: CFuncPtr5[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.gobject.all.GObject], CString, _root_.glib.all.gpointer, Unit]): Unit = !struct.at9 = value
    def parser_finished : CFuncPtr2[Ptr[GtkBuildable], Ptr[GtkBuilder], Unit] = struct._10
    def parser_finished_=(value: CFuncPtr2[Ptr[GtkBuildable], Ptr[GtkBuilder], Unit]): Unit = !struct.at10 = value
    def get_internal_child : CFuncPtr3[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.gobject.all.GObject]] = struct._11
    def get_internal_child_=(value: CFuncPtr3[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.gobject.all.GObject]]): Unit = !struct.at11 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuildable.h
*/
opaque type _GtkBuildableParseContext = CStruct0
object _GtkBuildableParseContext:
  given _tag: Tag[_GtkBuildableParseContext] = Tag.materializeCStruct0Tag

/**
 * GtkBuildableParser: _element: function called for open elements _element: function called for close elements

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuildable.h
*/
opaque type _GtkBuildableParser = CStruct5[CFuncPtr6[Ptr[GtkBuildableParseContext], CString, Ptr[CString], Ptr[CString], _root_.glib.all.gpointer, Ptr[Ptr[_root_.glib.all.GError]], Unit], CFuncPtr4[Ptr[GtkBuildableParseContext], CString, _root_.glib.all.gpointer, Ptr[Ptr[_root_.glib.all.GError]], Unit], CFuncPtr5[Ptr[GtkBuildableParseContext], CString, _root_.glib.all.gsize, _root_.glib.all.gpointer, Ptr[Ptr[_root_.glib.all.GError]], Unit], CFuncPtr3[Ptr[GtkBuildableParseContext], Ptr[_root_.glib.all.GError], _root_.glib.all.gpointer, Unit], CArray[_root_.glib.all.gpointer, Nat._4]]
object _GtkBuildableParser:
  given _tag: Tag[_GtkBuildableParser] = Tag.materializeCStruct5Tag[CFuncPtr6[Ptr[GtkBuildableParseContext], CString, Ptr[CString], Ptr[CString], _root_.glib.all.gpointer, Ptr[Ptr[_root_.glib.all.GError]], Unit], CFuncPtr4[Ptr[GtkBuildableParseContext], CString, _root_.glib.all.gpointer, Ptr[Ptr[_root_.glib.all.GError]], Unit], CFuncPtr5[Ptr[GtkBuildableParseContext], CString, _root_.glib.all.gsize, _root_.glib.all.gpointer, Ptr[Ptr[_root_.glib.all.GError]], Unit], CFuncPtr3[Ptr[GtkBuildableParseContext], Ptr[_root_.glib.all.GError], _root_.glib.all.gpointer, Unit], CArray[_root_.glib.all.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[_GtkBuildableParser] = scala.scalanative.unsafe.alloc[_GtkBuildableParser](1)
  def apply(start_element : CFuncPtr6[Ptr[GtkBuildableParseContext], CString, Ptr[CString], Ptr[CString], _root_.glib.all.gpointer, Ptr[Ptr[_root_.glib.all.GError]], Unit], end_element : CFuncPtr4[Ptr[GtkBuildableParseContext], CString, _root_.glib.all.gpointer, Ptr[Ptr[_root_.glib.all.GError]], Unit], text : CFuncPtr5[Ptr[GtkBuildableParseContext], CString, _root_.glib.all.gsize, _root_.glib.all.gpointer, Ptr[Ptr[_root_.glib.all.GError]], Unit], error : CFuncPtr3[Ptr[GtkBuildableParseContext], Ptr[_root_.glib.all.GError], _root_.glib.all.gpointer, Unit], padding : CArray[_root_.glib.all.gpointer, Nat._4])(using Zone): Ptr[_GtkBuildableParser] = 
    val ____ptr = apply()
    (!____ptr).start_element = start_element
    (!____ptr).end_element = end_element
    (!____ptr).text = text
    (!____ptr).error = error
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkBuildableParser)
    def start_element : CFuncPtr6[Ptr[GtkBuildableParseContext], CString, Ptr[CString], Ptr[CString], _root_.glib.all.gpointer, Ptr[Ptr[_root_.glib.all.GError]], Unit] = struct._1
    def start_element_=(value: CFuncPtr6[Ptr[GtkBuildableParseContext], CString, Ptr[CString], Ptr[CString], _root_.glib.all.gpointer, Ptr[Ptr[_root_.glib.all.GError]], Unit]): Unit = !struct.at1 = value
    def end_element : CFuncPtr4[Ptr[GtkBuildableParseContext], CString, _root_.glib.all.gpointer, Ptr[Ptr[_root_.glib.all.GError]], Unit] = struct._2
    def end_element_=(value: CFuncPtr4[Ptr[GtkBuildableParseContext], CString, _root_.glib.all.gpointer, Ptr[Ptr[_root_.glib.all.GError]], Unit]): Unit = !struct.at2 = value
    def text : CFuncPtr5[Ptr[GtkBuildableParseContext], CString, _root_.glib.all.gsize, _root_.glib.all.gpointer, Ptr[Ptr[_root_.glib.all.GError]], Unit] = struct._3
    def text_=(value: CFuncPtr5[Ptr[GtkBuildableParseContext], CString, _root_.glib.all.gsize, _root_.glib.all.gpointer, Ptr[Ptr[_root_.glib.all.GError]], Unit]): Unit = !struct.at3 = value
    def error : CFuncPtr3[Ptr[GtkBuildableParseContext], Ptr[_root_.glib.all.GError], _root_.glib.all.gpointer, Unit] = struct._4
    def error_=(value: CFuncPtr3[Ptr[GtkBuildableParseContext], Ptr[_root_.glib.all.GError], _root_.glib.all.gpointer, Unit]): Unit = !struct.at4 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._4] = struct._5
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._4]): Unit = !struct.at5 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
opaque type _GtkBuilder = CStruct0
object _GtkBuilder:
  given _tag: Tag[_GtkBuilder] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuilderscope.h
*/
opaque type _GtkBuilderCScope = CStruct1[_root_.gobject.all.GObject]
object _GtkBuilderCScope:
  given _tag: Tag[_GtkBuilderCScope] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[_GtkBuilderCScope] = scala.scalanative.unsafe.alloc[_GtkBuilderCScope](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[_GtkBuilderCScope] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkBuilderCScope)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuilderscope.h
*/
opaque type _GtkBuilderCScopeClass = CStruct1[_root_.gobject.all.GObjectClass]
object _GtkBuilderCScopeClass:
  given _tag: Tag[_GtkBuilderCScopeClass] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObjectClass]
  def apply()(using Zone): Ptr[_GtkBuilderCScopeClass] = scala.scalanative.unsafe.alloc[_GtkBuilderCScopeClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[_GtkBuilderCScopeClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: _GtkBuilderCScopeClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuilder.h
*/
opaque type _GtkBuilderClass = CStruct0
object _GtkBuilderClass:
  given _tag: Tag[_GtkBuilderClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuilderlistitemfactory.h
*/
opaque type _GtkBuilderListItemFactory = CStruct0
object _GtkBuilderListItemFactory:
  given _tag: Tag[_GtkBuilderListItemFactory] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuilderlistitemfactory.h
*/
opaque type _GtkBuilderListItemFactoryClass = CStruct0
object _GtkBuilderListItemFactoryClass:
  given _tag: Tag[_GtkBuilderListItemFactoryClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
opaque type _GtkBuilderScope = CStruct0
object _GtkBuilderScope:
  given _tag: Tag[_GtkBuilderScope] = Tag.materializeCStruct0Tag

/**
 * GtkBuilderScopeInterface: _type_from_name: Try to lookup a `GType` via the its name. See gtk_builder_get_type_from_name() for more details. The C implementation will use g_type_from_name() and if that fails try to guess the correct function name for registering the type and then use dlsym() to load it. The default implementation just tries g_type_from_name() and otherwise fails. _type_from_function: Try to lookup a `GType` via the given function name, specified explicitly in a GtkBuilder file, like via the "type-func" attribute in the "<object>" tag. This function is very rarely used. The C implementation will use dlsym() and call the resulting function as a `GTypeFunc`. The default implementation will fail and just return %G_TYPE_INVALID. _closure: Create a closure with the given arguments. See gtk_builder_create_closure() for more details on those. The C implementation will try to use dlsym() to locate the function name and then g_cclosure_new() to create a closure for the symbol. The default implementation just fails and returns %NULL.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbuilderscope.h
*/
opaque type _GtkBuilderScopeInterface = CStruct4[_root_.gobject.all.GTypeInterface, CFuncPtr3[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, _root_.gobject.all.GType], CFuncPtr3[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, _root_.gobject.all.GType], CFuncPtr6[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, GtkBuilderClosureFlags, Ptr[_root_.gobject.all.GObject], Ptr[Ptr[_root_.glib.all.GError]], Ptr[Byte]]]
object _GtkBuilderScopeInterface:
  given _tag: Tag[_GtkBuilderScopeInterface] = Tag.materializeCStruct4Tag[_root_.gobject.all.GTypeInterface, CFuncPtr3[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, _root_.gobject.all.GType], CFuncPtr3[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, _root_.gobject.all.GType], CFuncPtr6[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, GtkBuilderClosureFlags, Ptr[_root_.gobject.all.GObject], Ptr[Ptr[_root_.glib.all.GError]], Ptr[Byte]]]
  def apply()(using Zone): Ptr[_GtkBuilderScopeInterface] = scala.scalanative.unsafe.alloc[_GtkBuilderScopeInterface](1)
  def apply(g_iface : _root_.gobject.all.GTypeInterface, get_type_from_name : CFuncPtr3[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, _root_.gobject.all.GType], get_type_from_function : CFuncPtr3[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, _root_.gobject.all.GType], create_closure : CFuncPtr6[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, GtkBuilderClosureFlags, Ptr[_root_.gobject.all.GObject], Ptr[Ptr[_root_.glib.all.GError]], Ptr[_root_.gobject.all.GClosure]])(using Zone): Ptr[_GtkBuilderScopeInterface] = 
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).get_type_from_name = get_type_from_name
    (!____ptr).get_type_from_function = get_type_from_function
    (!____ptr).create_closure = create_closure
    ____ptr
  extension (struct: _GtkBuilderScopeInterface)
    def g_iface : _root_.gobject.all.GTypeInterface = struct._1
    def g_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def get_type_from_name : CFuncPtr3[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, _root_.gobject.all.GType] = struct._2
    def get_type_from_name_=(value: CFuncPtr3[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, _root_.gobject.all.GType]): Unit = !struct.at2 = value
    def get_type_from_function : CFuncPtr3[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, _root_.gobject.all.GType] = struct._3
    def get_type_from_function_=(value: CFuncPtr3[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, _root_.gobject.all.GType]): Unit = !struct.at3 = value
    def create_closure : CFuncPtr6[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, GtkBuilderClosureFlags, Ptr[_root_.gobject.all.GObject], Ptr[Ptr[_root_.glib.all.GError]], Ptr[_root_.gobject.all.GClosure]] = struct._4.asInstanceOf[CFuncPtr6[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, GtkBuilderClosureFlags, Ptr[_root_.gobject.all.GObject], Ptr[Ptr[_root_.glib.all.GError]], Ptr[_root_.gobject.all.GClosure]]]
    def create_closure_=(value: CFuncPtr6[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, GtkBuilderClosureFlags, Ptr[_root_.gobject.all.GObject], Ptr[Ptr[_root_.glib.all.GError]], Ptr[_root_.gobject.all.GClosure]]): Unit = !struct.at4 = value.asInstanceOf[CFuncPtr6[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, GtkBuilderClosureFlags, Ptr[_root_.gobject.all.GObject], Ptr[Ptr[_root_.glib.all.GError]], Ptr[Byte]]]

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbutton.h
*/
opaque type _GtkButton = CStruct1[GtkWidget]
object _GtkButton:
  given _tag: Tag[_GtkButton] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[_GtkButton] = scala.scalanative.unsafe.alloc[_GtkButton](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[_GtkButton] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkButton)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * GtkButtonClass: _class: The parent class. : Signal emitted when the button has been activated (pressed and released). : Signal that causes the button to animate press then release. Applications should never connect to this signal, but use the signal.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbutton.h
*/
opaque type _GtkButtonClass = CStruct4[GtkWidgetClass, CFuncPtr1[Ptr[GtkButton], Unit], CFuncPtr1[Ptr[GtkButton], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkButtonClass:
  given _tag: Tag[_GtkButtonClass] = Tag.materializeCStruct4Tag[GtkWidgetClass, CFuncPtr1[Ptr[GtkButton], Unit], CFuncPtr1[Ptr[GtkButton], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkButtonClass] = scala.scalanative.unsafe.alloc[_GtkButtonClass](1)
  def apply(parent_class : GtkWidgetClass, clicked : CFuncPtr1[Ptr[GtkButton], Unit], activate : CFuncPtr1[Ptr[GtkButton], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkButtonClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).clicked = clicked
    (!____ptr).activate = activate
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkButtonClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def clicked : CFuncPtr1[Ptr[GtkButton], Unit] = struct._2
    def clicked_=(value: CFuncPtr1[Ptr[GtkButton], Unit]): Unit = !struct.at2 = value
    def activate : CFuncPtr1[Ptr[GtkButton], Unit] = struct._3
    def activate_=(value: CFuncPtr1[Ptr[GtkButton], Unit]): Unit = !struct.at3 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._4
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at4 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkbutton.h
*/
opaque type _GtkButtonPrivate = CStruct0
object _GtkButtonPrivate:
  given _tag: Tag[_GtkButtonPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkexpression.h
*/
opaque type _GtkCClosureExpression = CStruct0
object _GtkCClosureExpression:
  given _tag: Tag[_GtkCClosureExpression] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcalendar.h
*/
opaque type _GtkCalendar = CStruct0
object _GtkCalendar:
  given _tag: Tag[_GtkCalendar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type _GtkCallbackAction = CStruct0
object _GtkCallbackAction:
  given _tag: Tag[_GtkCallbackAction] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type _GtkCallbackActionClass = CStruct0
object _GtkCallbackActionClass:
  given _tag: Tag[_GtkCallbackActionClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellarea.h
*/
opaque type _GtkCellArea = CStruct1[_root_.gobject.all.GInitiallyUnowned]
object _GtkCellArea:
  given _tag: Tag[_GtkCellArea] = Tag.materializeCStruct1Tag[_root_.gobject.all.GInitiallyUnowned]
  def apply()(using Zone): Ptr[_GtkCellArea] = scala.scalanative.unsafe.alloc[_GtkCellArea](1)
  def apply(parent_instance : _root_.gobject.all.GInitiallyUnowned)(using Zone): Ptr[_GtkCellArea] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkCellArea)
    def parent_instance : _root_.gobject.all.GInitiallyUnowned = struct._1
    def parent_instance_=(value: _root_.gobject.all.GInitiallyUnowned): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellareabox.h
*/
opaque type _GtkCellAreaBox = CStruct0
object _GtkCellAreaBox:
  given _tag: Tag[_GtkCellAreaBox] = Tag.materializeCStruct0Tag

/**
 * GtkCellAreaClass: : adds a `GtkCellRenderer` to the area. : removes a `GtkCellRenderer` from the area. : calls the `GtkCellCallback` function on every `GtkCellRenderer` in the area with the provided user data until the callback returns %TRUE. _alloc: Calls the `GtkCellAllocCallback` function on every `GtkCellRenderer` in the area with the allocated area for the cell and the provided user data until the callback returns %TRUE. : Handle an event in the area, this is generally used to activate a cell at the event location for button events but can also be used to generically pass events to `GtkWidget`s drawn onto the area. : Actually snapshot the area’s cells to the specified rectangle, _area should be correctly distributed to the cells corresponding background areas. _attributes: Apply the cell attributes to the cells. This is implemented as a signal and generally `GtkCellArea` subclasses don't need to implement it since it is handled by the base class. _context: Creates and returns a class specific `GtkCellAreaContext` to store cell alignment and allocation details for a said `GtkCellArea` class. _context: Creates a new `GtkCellAreaContext` in the same state as the passed with any cell alignment data and allocations intact. _request_mode: This allows an area to tell its layouting widget whether it prefers to be allocated in %GTK_SIZE_REQUEST_HEIGHT_FOR_WIDTH or %GTK_SIZE_REQUEST_WIDTH_FOR_HEIGHT mode. _preferred_width: Calculates the minimum and natural width of the areas cells with the current attributes applied while considering the particular layouting details of the said `GtkCellArea`. While requests are performed over a series of rows, alignments and overall minimum and natural sizes should be stored in the corresponding `GtkCellAreaContext`. _preferred_height_for_width: Calculates the minimum and natural height for the area if the passed would be allocated the given width. When implementing this virtual method it is safe to assume that has already stored the aligned cell widths for every `GtkTreeModel` row that will be allocated for since this information was stored at `GtkCellAreaClass.get_preferred_width()` time. This virtual method should also store any necessary alignments of cell heights for the case that the context is allocated a height. _preferred_height: Calculates the minimum and natural height of the areas cells with the current attributes applied. Essentially this is the same as `GtkCellAreaClass.get_preferred_width()` only for areas that are being requested as %GTK_SIZE_REQUEST_WIDTH_FOR_HEIGHT. _preferred_width_for_height: Calculates the minimum and natural width for the area if the passed would be allocated the given height. The same as `GtkCellAreaClass.get_preferred_height_for_width()` only for handling requests in the %GTK_SIZE_REQUEST_WIDTH_FOR_HEIGHT mode.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellarea.h
*/
opaque type _GtkCellAreaClass = CStruct21[_root_.gobject.all.GInitiallyUnownedClass, CFuncPtr2[Ptr[GtkCellArea], Ptr[GtkCellRenderer], Unit], CFuncPtr2[Ptr[GtkCellArea], Ptr[GtkCellRenderer], Unit], CFuncPtr3[Ptr[GtkCellArea], GtkCellCallback, _root_.glib.all.gpointer, Unit], CFuncPtr7[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellAllocCallback, _root_.glib.all.gpointer, Unit], CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GdkEvent], Ptr[GdkRectangle], GtkCellRendererState, CInt], CFuncPtr8[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GtkSnapshot], Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, _root_.glib.all.gboolean, Unit], CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean, _root_.glib.all.gboolean, Unit], CFuncPtr1[Ptr[GtkCellArea], Ptr[GtkCellAreaContext]], CFuncPtr2[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkCellAreaContext]], CFuncPtr1[Ptr[GtkCellArea], GtkSizeRequestMode], CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit], CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit], CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellRenderer], _root_.glib.all.guint, Ptr[_root_.gobject.all.GValue], Ptr[_root_.gobject.all.GParamSpec], Unit], CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellRenderer], _root_.glib.all.guint, Ptr[_root_.gobject.all.GValue], Ptr[_root_.gobject.all.GParamSpec], Unit], CFuncPtr2[Ptr[GtkCellArea], GtkDirectionType, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkCellArea], _root_.glib.all.gboolean], CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GdkRectangle], GtkCellRendererState, _root_.glib.all.gboolean, _root_.glib.all.gboolean], CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkCellAreaClass:
  given _tag: Tag[_GtkCellAreaClass] = Tag.materializeCStruct21Tag[_root_.gobject.all.GInitiallyUnownedClass, CFuncPtr2[Ptr[GtkCellArea], Ptr[GtkCellRenderer], Unit], CFuncPtr2[Ptr[GtkCellArea], Ptr[GtkCellRenderer], Unit], CFuncPtr3[Ptr[GtkCellArea], GtkCellCallback, _root_.glib.all.gpointer, Unit], CFuncPtr7[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellAllocCallback, _root_.glib.all.gpointer, Unit], CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GdkEvent], Ptr[GdkRectangle], GtkCellRendererState, CInt], CFuncPtr8[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GtkSnapshot], Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, _root_.glib.all.gboolean, Unit], CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean, _root_.glib.all.gboolean, Unit], CFuncPtr1[Ptr[GtkCellArea], Ptr[GtkCellAreaContext]], CFuncPtr2[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkCellAreaContext]], CFuncPtr1[Ptr[GtkCellArea], GtkSizeRequestMode], CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit], CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit], CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellRenderer], _root_.glib.all.guint, Ptr[_root_.gobject.all.GValue], Ptr[_root_.gobject.all.GParamSpec], Unit], CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellRenderer], _root_.glib.all.guint, Ptr[_root_.gobject.all.GValue], Ptr[_root_.gobject.all.GParamSpec], Unit], CFuncPtr2[Ptr[GtkCellArea], GtkDirectionType, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkCellArea], _root_.glib.all.gboolean], CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GdkRectangle], GtkCellRendererState, _root_.glib.all.gboolean, _root_.glib.all.gboolean], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkCellAreaClass] = scala.scalanative.unsafe.alloc[_GtkCellAreaClass](1)
  def apply(parent_class : _root_.gobject.all.GInitiallyUnownedClass, add : CFuncPtr2[Ptr[GtkCellArea], Ptr[GtkCellRenderer], Unit], remove : CFuncPtr2[Ptr[GtkCellArea], Ptr[GtkCellRenderer], Unit], foreach : CFuncPtr3[Ptr[GtkCellArea], GtkCellCallback, _root_.glib.all.gpointer, Unit], foreach_alloc : CFuncPtr7[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellAllocCallback, _root_.glib.all.gpointer, Unit], event : CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GdkEvent], Ptr[GdkRectangle], GtkCellRendererState, CInt], snapshot : CFuncPtr8[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GtkSnapshot], Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, _root_.glib.all.gboolean, Unit], apply_attributes : CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean, _root_.glib.all.gboolean, Unit], create_context : CFuncPtr1[Ptr[GtkCellArea], Ptr[GtkCellAreaContext]], copy_context : CFuncPtr2[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkCellAreaContext]], get_request_mode : CFuncPtr1[Ptr[GtkCellArea], GtkSizeRequestMode], get_preferred_width : CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit], get_preferred_height_for_width : CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit], get_preferred_height : CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit], get_preferred_width_for_height : CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit], set_cell_property : CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellRenderer], _root_.glib.all.guint, Ptr[_root_.gobject.all.GValue], Ptr[_root_.gobject.all.GParamSpec], Unit], get_cell_property : CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellRenderer], _root_.glib.all.guint, Ptr[_root_.gobject.all.GValue], Ptr[_root_.gobject.all.GParamSpec], Unit], focus : CFuncPtr2[Ptr[GtkCellArea], GtkDirectionType, _root_.glib.all.gboolean], is_activatable : CFuncPtr1[Ptr[GtkCellArea], _root_.glib.all.gboolean], activate : CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GdkRectangle], GtkCellRendererState, _root_.glib.all.gboolean, _root_.glib.all.gboolean], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkCellAreaClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).add = add
    (!____ptr).remove = remove
    (!____ptr).foreach = foreach
    (!____ptr).foreach_alloc = foreach_alloc
    (!____ptr).event = event
    (!____ptr).snapshot = snapshot
    (!____ptr).apply_attributes = apply_attributes
    (!____ptr).create_context = create_context
    (!____ptr).copy_context = copy_context
    (!____ptr).get_request_mode = get_request_mode
    (!____ptr).get_preferred_width = get_preferred_width
    (!____ptr).get_preferred_height_for_width = get_preferred_height_for_width
    (!____ptr).get_preferred_height = get_preferred_height
    (!____ptr).get_preferred_width_for_height = get_preferred_width_for_height
    (!____ptr).set_cell_property = set_cell_property
    (!____ptr).get_cell_property = get_cell_property
    (!____ptr).focus = focus
    (!____ptr).is_activatable = is_activatable
    (!____ptr).activate = activate
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkCellAreaClass)
    def parent_class : _root_.gobject.all.GInitiallyUnownedClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GInitiallyUnownedClass): Unit = !struct.at1 = value
    def add : CFuncPtr2[Ptr[GtkCellArea], Ptr[GtkCellRenderer], Unit] = struct._2
    def add_=(value: CFuncPtr2[Ptr[GtkCellArea], Ptr[GtkCellRenderer], Unit]): Unit = !struct.at2 = value
    def remove : CFuncPtr2[Ptr[GtkCellArea], Ptr[GtkCellRenderer], Unit] = struct._3
    def remove_=(value: CFuncPtr2[Ptr[GtkCellArea], Ptr[GtkCellRenderer], Unit]): Unit = !struct.at3 = value
    def foreach : CFuncPtr3[Ptr[GtkCellArea], GtkCellCallback, _root_.glib.all.gpointer, Unit] = struct._4
    def foreach_=(value: CFuncPtr3[Ptr[GtkCellArea], GtkCellCallback, _root_.glib.all.gpointer, Unit]): Unit = !struct.at4 = value
    def foreach_alloc : CFuncPtr7[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellAllocCallback, _root_.glib.all.gpointer, Unit] = struct._5
    def foreach_alloc_=(value: CFuncPtr7[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellAllocCallback, _root_.glib.all.gpointer, Unit]): Unit = !struct.at5 = value
    def event : CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GdkEvent], Ptr[GdkRectangle], GtkCellRendererState, CInt] = struct._6
    def event_=(value: CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GdkEvent], Ptr[GdkRectangle], GtkCellRendererState, CInt]): Unit = !struct.at6 = value
    def snapshot : CFuncPtr8[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GtkSnapshot], Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, _root_.glib.all.gboolean, Unit] = struct._7
    def snapshot_=(value: CFuncPtr8[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GtkSnapshot], Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, _root_.glib.all.gboolean, Unit]): Unit = !struct.at7 = value
    def apply_attributes : CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean, _root_.glib.all.gboolean, Unit] = struct._8
    def apply_attributes_=(value: CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean, _root_.glib.all.gboolean, Unit]): Unit = !struct.at8 = value
    def create_context : CFuncPtr1[Ptr[GtkCellArea], Ptr[GtkCellAreaContext]] = struct._9
    def create_context_=(value: CFuncPtr1[Ptr[GtkCellArea], Ptr[GtkCellAreaContext]]): Unit = !struct.at9 = value
    def copy_context : CFuncPtr2[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkCellAreaContext]] = struct._10
    def copy_context_=(value: CFuncPtr2[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkCellAreaContext]]): Unit = !struct.at10 = value
    def get_request_mode : CFuncPtr1[Ptr[GtkCellArea], GtkSizeRequestMode] = struct._11
    def get_request_mode_=(value: CFuncPtr1[Ptr[GtkCellArea], GtkSizeRequestMode]): Unit = !struct.at11 = value
    def get_preferred_width : CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit] = struct._12
    def get_preferred_width_=(value: CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit]): Unit = !struct.at12 = value
    def get_preferred_height_for_width : CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit] = struct._13
    def get_preferred_height_for_width_=(value: CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit]): Unit = !struct.at13 = value
    def get_preferred_height : CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit] = struct._14
    def get_preferred_height_=(value: CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit]): Unit = !struct.at14 = value
    def get_preferred_width_for_height : CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit] = struct._15
    def get_preferred_width_for_height_=(value: CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit]): Unit = !struct.at15 = value
    def set_cell_property : CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellRenderer], _root_.glib.all.guint, Ptr[_root_.gobject.all.GValue], Ptr[_root_.gobject.all.GParamSpec], Unit] = struct._16
    def set_cell_property_=(value: CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellRenderer], _root_.glib.all.guint, Ptr[_root_.gobject.all.GValue], Ptr[_root_.gobject.all.GParamSpec], Unit]): Unit = !struct.at16 = value
    def get_cell_property : CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellRenderer], _root_.glib.all.guint, Ptr[_root_.gobject.all.GValue], Ptr[_root_.gobject.all.GParamSpec], Unit] = struct._17
    def get_cell_property_=(value: CFuncPtr5[Ptr[GtkCellArea], Ptr[GtkCellRenderer], _root_.glib.all.guint, Ptr[_root_.gobject.all.GValue], Ptr[_root_.gobject.all.GParamSpec], Unit]): Unit = !struct.at17 = value
    def focus : CFuncPtr2[Ptr[GtkCellArea], GtkDirectionType, _root_.glib.all.gboolean] = struct._18
    def focus_=(value: CFuncPtr2[Ptr[GtkCellArea], GtkDirectionType, _root_.glib.all.gboolean]): Unit = !struct.at18 = value
    def is_activatable : CFuncPtr1[Ptr[GtkCellArea], _root_.glib.all.gboolean] = struct._19
    def is_activatable_=(value: CFuncPtr1[Ptr[GtkCellArea], _root_.glib.all.gboolean]): Unit = !struct.at19 = value
    def activate : CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GdkRectangle], GtkCellRendererState, _root_.glib.all.gboolean, _root_.glib.all.gboolean] = struct._20
    def activate_=(value: CFuncPtr6[Ptr[GtkCellArea], Ptr[GtkCellAreaContext], Ptr[GtkWidget], Ptr[GdkRectangle], GtkCellRendererState, _root_.glib.all.gboolean, _root_.glib.all.gboolean]): Unit = !struct.at20 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._21
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at21 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellareacontext.h
*/
opaque type _GtkCellAreaContext = CStruct1[_root_.gobject.all.GObject]
object _GtkCellAreaContext:
  given _tag: Tag[_GtkCellAreaContext] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[_GtkCellAreaContext] = scala.scalanative.unsafe.alloc[_GtkCellAreaContext](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[_GtkCellAreaContext] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkCellAreaContext)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * GtkCellAreaContextClass: : This tells the context that an allocation width or height (or both) have been decided for a group of rows. The context should store any allocations for internally aligned cells at this point so that they dont need to be recalculated at gtk_cell_area_render() time. : Clear any previously stored information about requested and allocated sizes for the context. _preferred_height_for_width: Returns the aligned height for the given width that context must store while collecting sizes for it’s rows. _preferred_width_for_height: Returns the aligned width for the given height that context must store while collecting sizes for it’s rows.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellareacontext.h
*/
opaque type _GtkCellAreaContextClass = CStruct6[_root_.gobject.all.GObjectClass, CFuncPtr3[Ptr[GtkCellAreaContext], CInt, CInt, Unit], CFuncPtr1[Ptr[GtkCellAreaContext], Unit], CFuncPtr4[Ptr[GtkCellAreaContext], CInt, Ptr[CInt], Ptr[CInt], Unit], CFuncPtr4[Ptr[GtkCellAreaContext], CInt, Ptr[CInt], Ptr[CInt], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkCellAreaContextClass:
  given _tag: Tag[_GtkCellAreaContextClass] = Tag.materializeCStruct6Tag[_root_.gobject.all.GObjectClass, CFuncPtr3[Ptr[GtkCellAreaContext], CInt, CInt, Unit], CFuncPtr1[Ptr[GtkCellAreaContext], Unit], CFuncPtr4[Ptr[GtkCellAreaContext], CInt, Ptr[CInt], Ptr[CInt], Unit], CFuncPtr4[Ptr[GtkCellAreaContext], CInt, Ptr[CInt], Ptr[CInt], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkCellAreaContextClass] = scala.scalanative.unsafe.alloc[_GtkCellAreaContextClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, allocate : CFuncPtr3[Ptr[GtkCellAreaContext], CInt, CInt, Unit], reset : CFuncPtr1[Ptr[GtkCellAreaContext], Unit], get_preferred_height_for_width : CFuncPtr4[Ptr[GtkCellAreaContext], CInt, Ptr[CInt], Ptr[CInt], Unit], get_preferred_width_for_height : CFuncPtr4[Ptr[GtkCellAreaContext], CInt, Ptr[CInt], Ptr[CInt], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkCellAreaContextClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).allocate = allocate
    (!____ptr).reset = reset
    (!____ptr).get_preferred_height_for_width = get_preferred_height_for_width
    (!____ptr).get_preferred_width_for_height = get_preferred_width_for_height
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkCellAreaContextClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def allocate : CFuncPtr3[Ptr[GtkCellAreaContext], CInt, CInt, Unit] = struct._2
    def allocate_=(value: CFuncPtr3[Ptr[GtkCellAreaContext], CInt, CInt, Unit]): Unit = !struct.at2 = value
    def reset : CFuncPtr1[Ptr[GtkCellAreaContext], Unit] = struct._3
    def reset_=(value: CFuncPtr1[Ptr[GtkCellAreaContext], Unit]): Unit = !struct.at3 = value
    def get_preferred_height_for_width : CFuncPtr4[Ptr[GtkCellAreaContext], CInt, Ptr[CInt], Ptr[CInt], Unit] = struct._4
    def get_preferred_height_for_width_=(value: CFuncPtr4[Ptr[GtkCellAreaContext], CInt, Ptr[CInt], Ptr[CInt], Unit]): Unit = !struct.at4 = value
    def get_preferred_width_for_height : CFuncPtr4[Ptr[GtkCellAreaContext], CInt, Ptr[CInt], Ptr[CInt], Unit] = struct._5
    def get_preferred_width_for_height_=(value: CFuncPtr4[Ptr[GtkCellAreaContext], CInt, Ptr[CInt], Ptr[CInt], Unit]): Unit = !struct.at5 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._6
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at6 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellareacontext.h
*/
opaque type _GtkCellAreaContextPrivate = CStruct0
object _GtkCellAreaContextPrivate:
  given _tag: Tag[_GtkCellAreaContextPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcelleditable.h
*/
opaque type _GtkCellEditable = CStruct0
object _GtkCellEditable:
  given _tag: Tag[_GtkCellEditable] = Tag.materializeCStruct0Tag

/**
 * GtkCellEditableIface: _done: Signal is a sign for the cell renderer to update its value from the cell_editable. _widget: Signal is meant to indicate that the cell is finished editing, and the widget may now be destroyed. _editing: Begins editing on a cell_editable.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcelleditable.h
*/
opaque type _GtkCellEditableIface = CStruct4[_root_.gobject.all.GTypeInterface, CFuncPtr1[Ptr[GtkCellEditable], Unit], CFuncPtr1[Ptr[GtkCellEditable], Unit], CFuncPtr2[Ptr[GtkCellEditable], Ptr[GdkEvent], Unit]]
object _GtkCellEditableIface:
  given _tag: Tag[_GtkCellEditableIface] = Tag.materializeCStruct4Tag[_root_.gobject.all.GTypeInterface, CFuncPtr1[Ptr[GtkCellEditable], Unit], CFuncPtr1[Ptr[GtkCellEditable], Unit], CFuncPtr2[Ptr[GtkCellEditable], Ptr[GdkEvent], Unit]]
  def apply()(using Zone): Ptr[_GtkCellEditableIface] = scala.scalanative.unsafe.alloc[_GtkCellEditableIface](1)
  def apply(g_iface : _root_.gobject.all.GTypeInterface, editing_done : CFuncPtr1[Ptr[GtkCellEditable], Unit], remove_widget : CFuncPtr1[Ptr[GtkCellEditable], Unit], start_editing : CFuncPtr2[Ptr[GtkCellEditable], Ptr[GdkEvent], Unit])(using Zone): Ptr[_GtkCellEditableIface] = 
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).editing_done = editing_done
    (!____ptr).remove_widget = remove_widget
    (!____ptr).start_editing = start_editing
    ____ptr
  extension (struct: _GtkCellEditableIface)
    def g_iface : _root_.gobject.all.GTypeInterface = struct._1
    def g_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def editing_done : CFuncPtr1[Ptr[GtkCellEditable], Unit] = struct._2
    def editing_done_=(value: CFuncPtr1[Ptr[GtkCellEditable], Unit]): Unit = !struct.at2 = value
    def remove_widget : CFuncPtr1[Ptr[GtkCellEditable], Unit] = struct._3
    def remove_widget_=(value: CFuncPtr1[Ptr[GtkCellEditable], Unit]): Unit = !struct.at3 = value
    def start_editing : CFuncPtr2[Ptr[GtkCellEditable], Ptr[GdkEvent], Unit] = struct._4
    def start_editing_=(value: CFuncPtr2[Ptr[GtkCellEditable], Ptr[GdkEvent], Unit]): Unit = !struct.at4 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcelllayout.h
*/
opaque type _GtkCellLayout = CStruct0
object _GtkCellLayout:
  given _tag: Tag[_GtkCellLayout] = Tag.materializeCStruct0Tag

/**
 * GtkCellLayoutIface: _start: Packs the cell into the beginning of cell_layout. _end: Adds the cell to the end of cell_layout. : Unsets all the mappings on all renderers on cell_layout and removes all renderers from cell_layout. _attribute: Adds an attribute mapping to the list in cell_layout.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcelllayout.h
*/
opaque type _GtkCellLayoutIface = CStruct10[_root_.gobject.all.GTypeInterface, CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], _root_.glib.all.gboolean, Unit], CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], _root_.glib.all.gboolean, Unit], CFuncPtr1[Ptr[GtkCellLayout], Unit], CFuncPtr4[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], CString, CInt, Unit], CFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], GtkCellLayoutDataFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit], CFuncPtr2[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Unit], CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], CInt, Unit], CFuncPtr1[Ptr[GtkCellLayout], Ptr[Byte]], CFuncPtr1[Ptr[GtkCellLayout], Ptr[GtkCellArea]]]
object _GtkCellLayoutIface:
  given _tag: Tag[_GtkCellLayoutIface] = Tag.materializeCStruct10Tag[_root_.gobject.all.GTypeInterface, CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], _root_.glib.all.gboolean, Unit], CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], _root_.glib.all.gboolean, Unit], CFuncPtr1[Ptr[GtkCellLayout], Unit], CFuncPtr4[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], CString, CInt, Unit], CFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], GtkCellLayoutDataFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit], CFuncPtr2[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Unit], CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], CInt, Unit], CFuncPtr1[Ptr[GtkCellLayout], Ptr[Byte]], CFuncPtr1[Ptr[GtkCellLayout], Ptr[GtkCellArea]]]
  def apply()(using Zone): Ptr[_GtkCellLayoutIface] = scala.scalanative.unsafe.alloc[_GtkCellLayoutIface](1)
  def apply(g_iface : _root_.gobject.all.GTypeInterface, pack_start : CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], _root_.glib.all.gboolean, Unit], pack_end : CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], _root_.glib.all.gboolean, Unit], clear : CFuncPtr1[Ptr[GtkCellLayout], Unit], add_attribute : CFuncPtr4[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], CString, CInt, Unit], set_cell_data_func : CFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], GtkCellLayoutDataFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit], clear_attributes : CFuncPtr2[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Unit], reorder : CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], CInt, Unit], get_cells : CFuncPtr1[Ptr[GtkCellLayout], Ptr[_root_.glib.all.GList]], get_area : CFuncPtr1[Ptr[GtkCellLayout], Ptr[GtkCellArea]])(using Zone): Ptr[_GtkCellLayoutIface] = 
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).pack_start = pack_start
    (!____ptr).pack_end = pack_end
    (!____ptr).clear = clear
    (!____ptr).add_attribute = add_attribute
    (!____ptr).set_cell_data_func = set_cell_data_func
    (!____ptr).clear_attributes = clear_attributes
    (!____ptr).reorder = reorder
    (!____ptr).get_cells = get_cells
    (!____ptr).get_area = get_area
    ____ptr
  extension (struct: _GtkCellLayoutIface)
    def g_iface : _root_.gobject.all.GTypeInterface = struct._1
    def g_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def pack_start : CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], _root_.glib.all.gboolean, Unit] = struct._2
    def pack_start_=(value: CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], _root_.glib.all.gboolean, Unit]): Unit = !struct.at2 = value
    def pack_end : CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], _root_.glib.all.gboolean, Unit] = struct._3
    def pack_end_=(value: CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], _root_.glib.all.gboolean, Unit]): Unit = !struct.at3 = value
    def clear : CFuncPtr1[Ptr[GtkCellLayout], Unit] = struct._4
    def clear_=(value: CFuncPtr1[Ptr[GtkCellLayout], Unit]): Unit = !struct.at4 = value
    def add_attribute : CFuncPtr4[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], CString, CInt, Unit] = struct._5
    def add_attribute_=(value: CFuncPtr4[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], CString, CInt, Unit]): Unit = !struct.at5 = value
    def set_cell_data_func : CFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], GtkCellLayoutDataFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit] = struct._6
    def set_cell_data_func_=(value: CFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], GtkCellLayoutDataFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit]): Unit = !struct.at6 = value
    def clear_attributes : CFuncPtr2[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Unit] = struct._7
    def clear_attributes_=(value: CFuncPtr2[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Unit]): Unit = !struct.at7 = value
    def reorder : CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], CInt, Unit] = struct._8
    def reorder_=(value: CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], CInt, Unit]): Unit = !struct.at8 = value
    def get_cells : CFuncPtr1[Ptr[GtkCellLayout], Ptr[_root_.glib.all.GList]] = struct._9.asInstanceOf[CFuncPtr1[Ptr[GtkCellLayout], Ptr[_root_.glib.all.GList]]]
    def get_cells_=(value: CFuncPtr1[Ptr[GtkCellLayout], Ptr[_root_.glib.all.GList]]): Unit = !struct.at9 = value.asInstanceOf[CFuncPtr1[Ptr[GtkCellLayout], Ptr[Byte]]]
    def get_area : CFuncPtr1[Ptr[GtkCellLayout], Ptr[GtkCellArea]] = struct._10
    def get_area_=(value: CFuncPtr1[Ptr[GtkCellLayout], Ptr[GtkCellArea]]): Unit = !struct.at10 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellrenderer.h
*/
opaque type _GtkCellRenderer = CStruct2[_root_.gobject.all.GInitiallyUnowned, Ptr[GtkCellRendererPrivate]]
object _GtkCellRenderer:
  given _tag: Tag[_GtkCellRenderer] = Tag.materializeCStruct2Tag[_root_.gobject.all.GInitiallyUnowned, Ptr[GtkCellRendererPrivate]]
  def apply()(using Zone): Ptr[_GtkCellRenderer] = scala.scalanative.unsafe.alloc[_GtkCellRenderer](1)
  def apply(parent_instance : _root_.gobject.all.GInitiallyUnowned, priv : Ptr[GtkCellRendererPrivate])(using Zone): Ptr[_GtkCellRenderer] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr
  extension (struct: _GtkCellRenderer)
    def parent_instance : _root_.gobject.all.GInitiallyUnowned = struct._1
    def parent_instance_=(value: _root_.gobject.all.GInitiallyUnowned): Unit = !struct.at1 = value
    def priv : Ptr[GtkCellRendererPrivate] = struct._2
    def priv_=(value: Ptr[GtkCellRendererPrivate]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellrendereraccel.h
*/
opaque type _GtkCellRendererAccel = CStruct0
object _GtkCellRendererAccel:
  given _tag: Tag[_GtkCellRendererAccel] = Tag.materializeCStruct0Tag

/**
 * GtkCellRendererClass: _request_mode: Called to gets whether the cell renderer prefers a height-for-width layout or a width-for-height layout. _preferred_width: Called to get a renderer’s natural width. _preferred_height_for_width: Called to get a renderer’s natural height for width. _preferred_height: Called to get a renderer’s natural height. _preferred_width_for_height: Called to get a renderer’s natural width for height. _aligned_area: Called to get the aligned area used by inside _area. : Called to snapshot the content of the `GtkCellRenderer`. : Called to activate the content of the `GtkCellRenderer`. _editing: Called to initiate editing the content of the `GtkCellRenderer`. _canceled: Signal gets emitted when the user cancels the process of editing a cell. _started: Signal gets emitted when a cell starts to be edited.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellrenderer.h
*/
opaque type _GtkCellRendererClass = CStruct13[_root_.gobject.all.GInitiallyUnownedClass, CFuncPtr1[Ptr[GtkCellRenderer], GtkSizeRequestMode], CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit], CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], GtkCellRendererState, Ptr[GdkRectangle], Ptr[GdkRectangle], Unit], CFuncPtr6[Ptr[GtkCellRenderer], Ptr[GtkSnapshot], Ptr[GtkWidget], Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, Unit], CFuncPtr7[Ptr[GtkCellRenderer], Ptr[GdkEvent], Ptr[GtkWidget], CString, Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, _root_.glib.all.gboolean], CFuncPtr7[Ptr[GtkCellRenderer], Ptr[GdkEvent], Ptr[GtkWidget], CString, Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, Ptr[GtkCellEditable]], CFuncPtr1[Ptr[GtkCellRenderer], Unit], CFuncPtr3[Ptr[GtkCellRenderer], Ptr[GtkCellEditable], CString, Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkCellRendererClass:
  given _tag: Tag[_GtkCellRendererClass] = Tag.materializeCStruct13Tag[_root_.gobject.all.GInitiallyUnownedClass, CFuncPtr1[Ptr[GtkCellRenderer], GtkSizeRequestMode], CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit], CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], GtkCellRendererState, Ptr[GdkRectangle], Ptr[GdkRectangle], Unit], CFuncPtr6[Ptr[GtkCellRenderer], Ptr[GtkSnapshot], Ptr[GtkWidget], Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, Unit], CFuncPtr7[Ptr[GtkCellRenderer], Ptr[GdkEvent], Ptr[GtkWidget], CString, Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, _root_.glib.all.gboolean], CFuncPtr7[Ptr[GtkCellRenderer], Ptr[GdkEvent], Ptr[GtkWidget], CString, Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, Ptr[GtkCellEditable]], CFuncPtr1[Ptr[GtkCellRenderer], Unit], CFuncPtr3[Ptr[GtkCellRenderer], Ptr[GtkCellEditable], CString, Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkCellRendererClass] = scala.scalanative.unsafe.alloc[_GtkCellRendererClass](1)
  def apply(parent_class : _root_.gobject.all.GInitiallyUnownedClass, get_request_mode : CFuncPtr1[Ptr[GtkCellRenderer], GtkSizeRequestMode], get_preferred_width : CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit], get_preferred_height_for_width : CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit], get_preferred_height : CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit], get_preferred_width_for_height : CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit], get_aligned_area : CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], GtkCellRendererState, Ptr[GdkRectangle], Ptr[GdkRectangle], Unit], snapshot : CFuncPtr6[Ptr[GtkCellRenderer], Ptr[GtkSnapshot], Ptr[GtkWidget], Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, Unit], activate : CFuncPtr7[Ptr[GtkCellRenderer], Ptr[GdkEvent], Ptr[GtkWidget], CString, Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, _root_.glib.all.gboolean], start_editing : CFuncPtr7[Ptr[GtkCellRenderer], Ptr[GdkEvent], Ptr[GtkWidget], CString, Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, Ptr[GtkCellEditable]], editing_canceled : CFuncPtr1[Ptr[GtkCellRenderer], Unit], editing_started : CFuncPtr3[Ptr[GtkCellRenderer], Ptr[GtkCellEditable], CString, Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkCellRendererClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).get_request_mode = get_request_mode
    (!____ptr).get_preferred_width = get_preferred_width
    (!____ptr).get_preferred_height_for_width = get_preferred_height_for_width
    (!____ptr).get_preferred_height = get_preferred_height
    (!____ptr).get_preferred_width_for_height = get_preferred_width_for_height
    (!____ptr).get_aligned_area = get_aligned_area
    (!____ptr).snapshot = snapshot
    (!____ptr).activate = activate
    (!____ptr).start_editing = start_editing
    (!____ptr).editing_canceled = editing_canceled
    (!____ptr).editing_started = editing_started
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkCellRendererClass)
    def parent_class : _root_.gobject.all.GInitiallyUnownedClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GInitiallyUnownedClass): Unit = !struct.at1 = value
    def get_request_mode : CFuncPtr1[Ptr[GtkCellRenderer], GtkSizeRequestMode] = struct._2
    def get_request_mode_=(value: CFuncPtr1[Ptr[GtkCellRenderer], GtkSizeRequestMode]): Unit = !struct.at2 = value
    def get_preferred_width : CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit] = struct._3
    def get_preferred_width_=(value: CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit]): Unit = !struct.at3 = value
    def get_preferred_height_for_width : CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit] = struct._4
    def get_preferred_height_for_width_=(value: CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit]): Unit = !struct.at4 = value
    def get_preferred_height : CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit] = struct._5
    def get_preferred_height_=(value: CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit]): Unit = !struct.at5 = value
    def get_preferred_width_for_height : CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit] = struct._6
    def get_preferred_width_for_height_=(value: CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit]): Unit = !struct.at6 = value
    def get_aligned_area : CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], GtkCellRendererState, Ptr[GdkRectangle], Ptr[GdkRectangle], Unit] = struct._7
    def get_aligned_area_=(value: CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], GtkCellRendererState, Ptr[GdkRectangle], Ptr[GdkRectangle], Unit]): Unit = !struct.at7 = value
    def snapshot : CFuncPtr6[Ptr[GtkCellRenderer], Ptr[GtkSnapshot], Ptr[GtkWidget], Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, Unit] = struct._8
    def snapshot_=(value: CFuncPtr6[Ptr[GtkCellRenderer], Ptr[GtkSnapshot], Ptr[GtkWidget], Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, Unit]): Unit = !struct.at8 = value
    def activate : CFuncPtr7[Ptr[GtkCellRenderer], Ptr[GdkEvent], Ptr[GtkWidget], CString, Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, _root_.glib.all.gboolean] = struct._9
    def activate_=(value: CFuncPtr7[Ptr[GtkCellRenderer], Ptr[GdkEvent], Ptr[GtkWidget], CString, Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, _root_.glib.all.gboolean]): Unit = !struct.at9 = value
    def start_editing : CFuncPtr7[Ptr[GtkCellRenderer], Ptr[GdkEvent], Ptr[GtkWidget], CString, Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, Ptr[GtkCellEditable]] = struct._10
    def start_editing_=(value: CFuncPtr7[Ptr[GtkCellRenderer], Ptr[GdkEvent], Ptr[GtkWidget], CString, Ptr[GdkRectangle], Ptr[GdkRectangle], GtkCellRendererState, Ptr[GtkCellEditable]]): Unit = !struct.at10 = value
    def editing_canceled : CFuncPtr1[Ptr[GtkCellRenderer], Unit] = struct._11
    def editing_canceled_=(value: CFuncPtr1[Ptr[GtkCellRenderer], Unit]): Unit = !struct.at11 = value
    def editing_started : CFuncPtr3[Ptr[GtkCellRenderer], Ptr[GtkCellEditable], CString, Unit] = struct._12
    def editing_started_=(value: CFuncPtr3[Ptr[GtkCellRenderer], Ptr[GtkCellEditable], CString, Unit]): Unit = !struct.at12 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._13
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at13 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellrenderer.h
*/
opaque type _GtkCellRendererClassPrivate = CStruct0
object _GtkCellRendererClassPrivate:
  given _tag: Tag[_GtkCellRendererClassPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellrenderercombo.h
*/
opaque type _GtkCellRendererCombo = CStruct0
object _GtkCellRendererCombo:
  given _tag: Tag[_GtkCellRendererCombo] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellrendererpixbuf.h
*/
opaque type _GtkCellRendererPixbuf = CStruct0
object _GtkCellRendererPixbuf:
  given _tag: Tag[_GtkCellRendererPixbuf] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellrenderer.h
*/
opaque type _GtkCellRendererPrivate = CStruct0
object _GtkCellRendererPrivate:
  given _tag: Tag[_GtkCellRendererPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellrendererprogress.h
*/
opaque type _GtkCellRendererProgress = CStruct0
object _GtkCellRendererProgress:
  given _tag: Tag[_GtkCellRendererProgress] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellrendererspin.h
*/
opaque type _GtkCellRendererSpin = CStruct0
object _GtkCellRendererSpin:
  given _tag: Tag[_GtkCellRendererSpin] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellrendererspinner.h
*/
opaque type _GtkCellRendererSpinner = CStruct0
object _GtkCellRendererSpinner:
  given _tag: Tag[_GtkCellRendererSpinner] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellrenderertext.h
*/
opaque type _GtkCellRendererText = CStruct1[GtkCellRenderer]
object _GtkCellRendererText:
  given _tag: Tag[_GtkCellRendererText] = Tag.materializeCStruct1Tag[GtkCellRenderer]
  def apply()(using Zone): Ptr[_GtkCellRendererText] = scala.scalanative.unsafe.alloc[_GtkCellRendererText](1)
  def apply(parent : GtkCellRenderer)(using Zone): Ptr[_GtkCellRendererText] = 
    val ____ptr = apply()
    (!____ptr).parent = parent
    ____ptr
  extension (struct: _GtkCellRendererText)
    def parent : GtkCellRenderer = struct._1
    def parent_=(value: GtkCellRenderer): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellrenderertext.h
*/
opaque type _GtkCellRendererTextClass = CStruct3[GtkCellRendererClass, CFuncPtr3[Ptr[GtkCellRendererText], CString, CString, Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkCellRendererTextClass:
  given _tag: Tag[_GtkCellRendererTextClass] = Tag.materializeCStruct3Tag[GtkCellRendererClass, CFuncPtr3[Ptr[GtkCellRendererText], CString, CString, Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkCellRendererTextClass] = scala.scalanative.unsafe.alloc[_GtkCellRendererTextClass](1)
  def apply(parent_class : GtkCellRendererClass, edited : CFuncPtr3[Ptr[GtkCellRendererText], CString, CString, Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkCellRendererTextClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).edited = edited
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkCellRendererTextClass)
    def parent_class : GtkCellRendererClass = struct._1
    def parent_class_=(value: GtkCellRendererClass): Unit = !struct.at1 = value
    def edited : CFuncPtr3[Ptr[GtkCellRendererText], CString, CString, Unit] = struct._2
    def edited_=(value: CFuncPtr3[Ptr[GtkCellRendererText], CString, CString, Unit]): Unit = !struct.at2 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._3
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellrenderertoggle.h
*/
opaque type _GtkCellRendererToggle = CStruct0
object _GtkCellRendererToggle:
  given _tag: Tag[_GtkCellRendererToggle] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcellview.h
*/
opaque type _GtkCellView = CStruct0
object _GtkCellView:
  given _tag: Tag[_GtkCellView] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcenterbox.h
*/
opaque type _GtkCenterBox = CStruct0
object _GtkCenterBox:
  given _tag: Tag[_GtkCenterBox] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcenterbox.h
*/
opaque type _GtkCenterBoxClass = CStruct0
object _GtkCenterBoxClass:
  given _tag: Tag[_GtkCenterBoxClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcenterlayout.h
*/
opaque type _GtkCenterLayout = CStruct0
object _GtkCenterLayout:
  given _tag: Tag[_GtkCenterLayout] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcheckbutton.h
*/
opaque type _GtkCheckButton = CStruct1[GtkWidget]
object _GtkCheckButton:
  given _tag: Tag[_GtkCheckButton] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[_GtkCheckButton] = scala.scalanative.unsafe.alloc[_GtkCheckButton](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[_GtkCheckButton] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkCheckButton)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcheckbutton.h
*/
opaque type _GtkCheckButtonClass = CStruct4[GtkWidgetClass, CFuncPtr1[Ptr[GtkCheckButton], Unit], CFuncPtr1[Ptr[GtkCheckButton], Unit], CArray[_root_.glib.all.gpointer, Nat._7]]
object _GtkCheckButtonClass:
  given _tag: Tag[_GtkCheckButtonClass] = Tag.materializeCStruct4Tag[GtkWidgetClass, CFuncPtr1[Ptr[GtkCheckButton], Unit], CFuncPtr1[Ptr[GtkCheckButton], Unit], CArray[_root_.glib.all.gpointer, Nat._7]]
  def apply()(using Zone): Ptr[_GtkCheckButtonClass] = scala.scalanative.unsafe.alloc[_GtkCheckButtonClass](1)
  def apply(parent_class : GtkWidgetClass, toggled : CFuncPtr1[Ptr[GtkCheckButton], Unit], activate : CFuncPtr1[Ptr[GtkCheckButton], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._7])(using Zone): Ptr[_GtkCheckButtonClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).toggled = toggled
    (!____ptr).activate = activate
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkCheckButtonClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def toggled : CFuncPtr1[Ptr[GtkCheckButton], Unit] = struct._2
    def toggled_=(value: CFuncPtr1[Ptr[GtkCheckButton], Unit]): Unit = !struct.at2 = value
    def activate : CFuncPtr1[Ptr[GtkCheckButton], Unit] = struct._3
    def activate_=(value: CFuncPtr1[Ptr[GtkCheckButton], Unit]): Unit = !struct.at3 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._7] = struct._4
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._7]): Unit = !struct.at4 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkexpression.h
*/
opaque type _GtkClosureExpression = CStruct0
object _GtkClosureExpression:
  given _tag: Tag[_GtkClosureExpression] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcolorbutton.h
*/
opaque type _GtkColorButton = CStruct0
object _GtkColorButton:
  given _tag: Tag[_GtkColorButton] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcolorchooser.h
*/
opaque type _GtkColorChooser = CStruct0
object _GtkColorChooser:
  given _tag: Tag[_GtkColorChooser] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcolorchooserdialog.h
*/
opaque type _GtkColorChooserDialog = CStruct0
object _GtkColorChooserDialog:
  given _tag: Tag[_GtkColorChooserDialog] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcolorchooser.h
*/
opaque type _GtkColorChooserInterface = CStruct6[_root_.gobject.all.GTypeInterface, CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit], CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit], CFuncPtr5[Ptr[GtkColorChooser], GtkOrientation, CInt, CInt, Ptr[GdkRGBA], Unit], CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit], CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._2]]]
object _GtkColorChooserInterface:
  given _tag: Tag[_GtkColorChooserInterface] = Tag.materializeCStruct6Tag[_root_.gobject.all.GTypeInterface, CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit], CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit], CFuncPtr5[Ptr[GtkColorChooser], GtkOrientation, CInt, CInt, Ptr[GdkRGBA], Unit], CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit], CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._2]]]
  def apply()(using Zone): Ptr[_GtkColorChooserInterface] = scala.scalanative.unsafe.alloc[_GtkColorChooserInterface](1)
  def apply(base_interface : _root_.gobject.all.GTypeInterface, get_rgba : CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit], set_rgba : CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit], add_palette : CFuncPtr5[Ptr[GtkColorChooser], GtkOrientation, CInt, CInt, Ptr[GdkRGBA], Unit], color_activated : CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit], padding : CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._2]])(using Zone): Ptr[_GtkColorChooserInterface] = 
    val ____ptr = apply()
    (!____ptr).base_interface = base_interface
    (!____ptr).get_rgba = get_rgba
    (!____ptr).set_rgba = set_rgba
    (!____ptr).add_palette = add_palette
    (!____ptr).color_activated = color_activated
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkColorChooserInterface)
    def base_interface : _root_.gobject.all.GTypeInterface = struct._1
    def base_interface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def get_rgba : CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit] = struct._2
    def get_rgba_=(value: CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit]): Unit = !struct.at2 = value
    def set_rgba : CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit] = struct._3
    def set_rgba_=(value: CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit]): Unit = !struct.at3 = value
    def add_palette : CFuncPtr5[Ptr[GtkColorChooser], GtkOrientation, CInt, CInt, Ptr[GdkRGBA], Unit] = struct._4
    def add_palette_=(value: CFuncPtr5[Ptr[GtkColorChooser], GtkOrientation, CInt, CInt, Ptr[GdkRGBA], Unit]): Unit = !struct.at4 = value
    def color_activated : CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit] = struct._5
    def color_activated_=(value: CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit]): Unit = !struct.at5 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._2]] = struct._6
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._2]]): Unit = !struct.at6 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcolorchooserwidget.h
*/
opaque type _GtkColorChooserWidget = CStruct0
object _GtkColorChooserWidget:
  given _tag: Tag[_GtkColorChooserWidget] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcolumnview.h
*/
opaque type _GtkColumnView = CStruct0
object _GtkColumnView:
  given _tag: Tag[_GtkColumnView] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcolumnview.h
*/
opaque type _GtkColumnViewClass = CStruct0
object _GtkColumnViewClass:
  given _tag: Tag[_GtkColumnViewClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcolumnview.h
*/
opaque type _GtkColumnViewColumn = CStruct0
object _GtkColumnViewColumn:
  given _tag: Tag[_GtkColumnViewColumn] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcolumnviewcolumn.h
*/
opaque type _GtkColumnViewColumnClass = CStruct0
object _GtkColumnViewColumnClass:
  given _tag: Tag[_GtkColumnViewColumnClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcombobox.h
*/
opaque type _GtkComboBox = CStruct1[GtkWidget]
object _GtkComboBox:
  given _tag: Tag[_GtkComboBox] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[_GtkComboBox] = scala.scalanative.unsafe.alloc[_GtkComboBox](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[_GtkComboBox] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkComboBox)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * GtkComboBoxClass: _class: The parent class. : Signal is emitted when the active item is changed. _entry_text: Signal which allows you to change how the text displayed in a combo box’s entry is displayed.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcombobox.h
*/
opaque type _GtkComboBoxClass = CStruct5[GtkWidgetClass, CFuncPtr1[Ptr[GtkComboBox], Unit], CFuncPtr2[Ptr[GtkComboBox], CString, CString], CFuncPtr1[Ptr[GtkComboBox], Unit], CArray[_root_.glib.all.gpointer, Nat._7]]
object _GtkComboBoxClass:
  given _tag: Tag[_GtkComboBoxClass] = Tag.materializeCStruct5Tag[GtkWidgetClass, CFuncPtr1[Ptr[GtkComboBox], Unit], CFuncPtr2[Ptr[GtkComboBox], CString, CString], CFuncPtr1[Ptr[GtkComboBox], Unit], CArray[_root_.glib.all.gpointer, Nat._7]]
  def apply()(using Zone): Ptr[_GtkComboBoxClass] = scala.scalanative.unsafe.alloc[_GtkComboBoxClass](1)
  def apply(parent_class : GtkWidgetClass, changed : CFuncPtr1[Ptr[GtkComboBox], Unit], format_entry_text : CFuncPtr2[Ptr[GtkComboBox], CString, CString], activate : CFuncPtr1[Ptr[GtkComboBox], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._7])(using Zone): Ptr[_GtkComboBoxClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).changed = changed
    (!____ptr).format_entry_text = format_entry_text
    (!____ptr).activate = activate
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkComboBoxClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def changed : CFuncPtr1[Ptr[GtkComboBox], Unit] = struct._2
    def changed_=(value: CFuncPtr1[Ptr[GtkComboBox], Unit]): Unit = !struct.at2 = value
    def format_entry_text : CFuncPtr2[Ptr[GtkComboBox], CString, CString] = struct._3
    def format_entry_text_=(value: CFuncPtr2[Ptr[GtkComboBox], CString, CString]): Unit = !struct.at3 = value
    def activate : CFuncPtr1[Ptr[GtkComboBox], Unit] = struct._4
    def activate_=(value: CFuncPtr1[Ptr[GtkComboBox], Unit]): Unit = !struct.at4 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._7] = struct._5
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._7]): Unit = !struct.at5 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcomboboxtext.h
*/
opaque type _GtkComboBoxText = CStruct0
object _GtkComboBoxText:
  given _tag: Tag[_GtkComboBoxText] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkexpression.h
*/
opaque type _GtkConstantExpression = CStruct0
object _GtkConstantExpression:
  given _tag: Tag[_GtkConstantExpression] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraint.h
*/
opaque type _GtkConstraint = CStruct0
object _GtkConstraint:
  given _tag: Tag[_GtkConstraint] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintguide.h
*/
opaque type _GtkConstraintGuide = CStruct0
object _GtkConstraintGuide:
  given _tag: Tag[_GtkConstraintGuide] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintlayout.h
*/
opaque type _GtkConstraintLayout = CStruct0
object _GtkConstraintLayout:
  given _tag: Tag[_GtkConstraintLayout] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraintlayout.h
*/
opaque type _GtkConstraintLayoutChild = CStruct0
object _GtkConstraintLayoutChild:
  given _tag: Tag[_GtkConstraintLayoutChild] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraint.h
*/
opaque type _GtkConstraintTarget = CStruct0
object _GtkConstraintTarget:
  given _tag: Tag[_GtkConstraintTarget] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkconstraint.h
*/
opaque type _GtkConstraintTargetInterface = CStruct0
object _GtkConstraintTargetInterface:
  given _tag: Tag[_GtkConstraintTargetInterface] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/css/gtkcsslocation.h
*/
opaque type _GtkCssLocation = CStruct5[_root_.glib.all.gsize, _root_.glib.all.gsize, _root_.glib.all.gsize, _root_.glib.all.gsize, _root_.glib.all.gsize]
object _GtkCssLocation:
  given _tag: Tag[_GtkCssLocation] = Tag.materializeCStruct5Tag[_root_.glib.all.gsize, _root_.glib.all.gsize, _root_.glib.all.gsize, _root_.glib.all.gsize, _root_.glib.all.gsize]
  def apply()(using Zone): Ptr[_GtkCssLocation] = scala.scalanative.unsafe.alloc[_GtkCssLocation](1)
  def apply(bytes : _root_.glib.all.gsize, chars : _root_.glib.all.gsize, lines : _root_.glib.all.gsize, line_bytes : _root_.glib.all.gsize, line_chars : _root_.glib.all.gsize)(using Zone): Ptr[_GtkCssLocation] = 
    val ____ptr = apply()
    (!____ptr).bytes = bytes
    (!____ptr).chars = chars
    (!____ptr).lines = lines
    (!____ptr).line_bytes = line_bytes
    (!____ptr).line_chars = line_chars
    ____ptr
  extension (struct: _GtkCssLocation)
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
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcssprovider.h
*/
opaque type _GtkCssProvider = CStruct1[_root_.gobject.all.GObject]
object _GtkCssProvider:
  given _tag: Tag[_GtkCssProvider] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[_GtkCssProvider] = scala.scalanative.unsafe.alloc[_GtkCssProvider](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[_GtkCssProvider] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkCssProvider)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcssprovider.h
*/
opaque type _GtkCssProviderClass = CStruct0
object _GtkCssProviderClass:
  given _tag: Tag[_GtkCssProviderClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcssprovider.h
*/
opaque type _GtkCssProviderPrivate = CStruct0
object _GtkCssProviderPrivate:
  given _tag: Tag[_GtkCssProviderPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/css/gtkcsssection.h
*/
opaque type _GtkCssSection = CStruct0
object _GtkCssSection:
  given _tag: Tag[_GtkCssSection] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
opaque type _GtkCssStyleChange = CStruct0
object _GtkCssStyleChange:
  given _tag: Tag[_GtkCssStyleChange] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomfilter.h
*/
opaque type _GtkCustomFilter = CStruct0
object _GtkCustomFilter:
  given _tag: Tag[_GtkCustomFilter] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomlayout.h
*/
opaque type _GtkCustomLayout = CStruct0
object _GtkCustomLayout:
  given _tag: Tag[_GtkCustomLayout] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkcustomsorter.h
*/
opaque type _GtkCustomSorter = CStruct0
object _GtkCustomSorter:
  given _tag: Tag[_GtkCustomSorter] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdialog.h
*/
opaque type _GtkDialog = CStruct1[GtkWindow]
object _GtkDialog:
  given _tag: Tag[_GtkDialog] = Tag.materializeCStruct1Tag[GtkWindow]
  def apply()(using Zone): Ptr[_GtkDialog] = scala.scalanative.unsafe.alloc[_GtkDialog](1)
  def apply(parent_instance : GtkWindow)(using Zone): Ptr[_GtkDialog] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkDialog)
    def parent_instance : GtkWindow = struct._1
    def parent_instance_=(value: GtkWindow): Unit = !struct.at1 = value

/**
 * GtkDialogClass: _class: The parent class. : Signal emitted when an action widget is activated. : Signal emitted when the user uses a keybinding to close the dialog.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdialog.h
*/
opaque type _GtkDialogClass = CStruct4[GtkWindowClass, CFuncPtr2[Ptr[GtkDialog], CInt, Unit], CFuncPtr1[Ptr[GtkDialog], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkDialogClass:
  given _tag: Tag[_GtkDialogClass] = Tag.materializeCStruct4Tag[GtkWindowClass, CFuncPtr2[Ptr[GtkDialog], CInt, Unit], CFuncPtr1[Ptr[GtkDialog], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkDialogClass] = scala.scalanative.unsafe.alloc[_GtkDialogClass](1)
  def apply(parent_class : GtkWindowClass, response : CFuncPtr2[Ptr[GtkDialog], CInt, Unit], close : CFuncPtr1[Ptr[GtkDialog], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkDialogClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).response = response
    (!____ptr).close = close
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkDialogClass)
    def parent_class : GtkWindowClass = struct._1
    def parent_class_=(value: GtkWindowClass): Unit = !struct.at1 = value
    def response : CFuncPtr2[Ptr[GtkDialog], CInt, Unit] = struct._2
    def response_=(value: CFuncPtr2[Ptr[GtkDialog], CInt, Unit]): Unit = !struct.at2 = value
    def close : CFuncPtr1[Ptr[GtkDialog], Unit] = struct._3
    def close_=(value: CFuncPtr1[Ptr[GtkDialog], Unit]): Unit = !struct.at3 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._4
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at4 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdirectorylist.h
*/
opaque type _GtkDirectoryList = CStruct0
object _GtkDirectoryList:
  given _tag: Tag[_GtkDirectoryList] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdragicon.h
*/
opaque type _GtkDragIcon = CStruct0
object _GtkDragIcon:
  given _tag: Tag[_GtkDragIcon] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdragsource.h
*/
opaque type _GtkDragSource = CStruct0
object _GtkDragSource:
  given _tag: Tag[_GtkDragSource] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdragsource.h
*/
opaque type _GtkDragSourceClass = CStruct0
object _GtkDragSourceClass:
  given _tag: Tag[_GtkDragSourceClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdrawingarea.h
*/
opaque type _GtkDrawingArea = CStruct1[GtkWidget]
object _GtkDrawingArea:
  given _tag: Tag[_GtkDrawingArea] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[_GtkDrawingArea] = scala.scalanative.unsafe.alloc[_GtkDrawingArea](1)
  def apply(widget : GtkWidget)(using Zone): Ptr[_GtkDrawingArea] = 
    val ____ptr = apply()
    (!____ptr).widget = widget
    ____ptr
  extension (struct: _GtkDrawingArea)
    def widget : GtkWidget = struct._1
    def widget_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdrawingarea.h
*/
opaque type _GtkDrawingAreaClass = CStruct3[GtkWidgetClass, CFuncPtr3[Ptr[GtkDrawingArea], CInt, CInt, Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkDrawingAreaClass:
  given _tag: Tag[_GtkDrawingAreaClass] = Tag.materializeCStruct3Tag[GtkWidgetClass, CFuncPtr3[Ptr[GtkDrawingArea], CInt, CInt, Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkDrawingAreaClass] = scala.scalanative.unsafe.alloc[_GtkDrawingAreaClass](1)
  def apply(parent_class : GtkWidgetClass, resize : CFuncPtr3[Ptr[GtkDrawingArea], CInt, CInt, Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkDrawingAreaClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).resize = resize
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkDrawingAreaClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def resize : CFuncPtr3[Ptr[GtkDrawingArea], CInt, CInt, Unit] = struct._2
    def resize_=(value: CFuncPtr3[Ptr[GtkDrawingArea], CInt, CInt, Unit]): Unit = !struct.at2 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._3
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdropcontrollermotion.h
*/
opaque type _GtkDropControllerMotion = CStruct0
object _GtkDropControllerMotion:
  given _tag: Tag[_GtkDropControllerMotion] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdropcontrollermotion.h
*/
opaque type _GtkDropControllerMotionClass = CStruct0
object _GtkDropControllerMotionClass:
  given _tag: Tag[_GtkDropControllerMotionClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdropdown.h
*/
opaque type _GtkDropDown = CStruct0
object _GtkDropDown:
  given _tag: Tag[_GtkDropDown] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdroptarget.h
*/
opaque type _GtkDropTarget = CStruct0
object _GtkDropTarget:
  given _tag: Tag[_GtkDropTarget] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdroptargetasync.h
*/
opaque type _GtkDropTargetAsync = CStruct0
object _GtkDropTargetAsync:
  given _tag: Tag[_GtkDropTargetAsync] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdroptargetasync.h
*/
opaque type _GtkDropTargetAsyncClass = CStruct0
object _GtkDropTargetAsyncClass:
  given _tag: Tag[_GtkDropTargetAsyncClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkdroptarget.h
*/
opaque type _GtkDropTargetClass = CStruct0
object _GtkDropTargetClass:
  given _tag: Tag[_GtkDropTargetClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeditable.h
*/
opaque type _GtkEditable = CStruct0
object _GtkEditable:
  given _tag: Tag[_GtkEditable] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeditable.h
*/
opaque type _GtkEditableInterface = CStruct10[_root_.gobject.all.GTypeInterface, CFuncPtr4[Ptr[GtkEditable], CString, CInt, Ptr[CInt], Unit], CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit], CFuncPtr1[Ptr[GtkEditable], Unit], CFuncPtr1[Ptr[GtkEditable], CString], CFuncPtr4[Ptr[GtkEditable], CString, CInt, Ptr[CInt], Unit], CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit], CFuncPtr3[Ptr[GtkEditable], Ptr[CInt], Ptr[CInt], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit], CFuncPtr1[Ptr[GtkEditable], Ptr[GtkEditable]]]
object _GtkEditableInterface:
  given _tag: Tag[_GtkEditableInterface] = Tag.materializeCStruct10Tag[_root_.gobject.all.GTypeInterface, CFuncPtr4[Ptr[GtkEditable], CString, CInt, Ptr[CInt], Unit], CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit], CFuncPtr1[Ptr[GtkEditable], Unit], CFuncPtr1[Ptr[GtkEditable], CString], CFuncPtr4[Ptr[GtkEditable], CString, CInt, Ptr[CInt], Unit], CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit], CFuncPtr3[Ptr[GtkEditable], Ptr[CInt], Ptr[CInt], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit], CFuncPtr1[Ptr[GtkEditable], Ptr[GtkEditable]]]
  def apply()(using Zone): Ptr[_GtkEditableInterface] = scala.scalanative.unsafe.alloc[_GtkEditableInterface](1)
  def apply(base_iface : _root_.gobject.all.GTypeInterface, insert_text : CFuncPtr4[Ptr[GtkEditable], CString, CInt, Ptr[CInt], Unit], delete_text : CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit], changed : CFuncPtr1[Ptr[GtkEditable], Unit], get_text : CFuncPtr1[Ptr[GtkEditable], CString], do_insert_text : CFuncPtr4[Ptr[GtkEditable], CString, CInt, Ptr[CInt], Unit], do_delete_text : CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit], get_selection_bounds : CFuncPtr3[Ptr[GtkEditable], Ptr[CInt], Ptr[CInt], _root_.glib.all.gboolean], set_selection_bounds : CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit], get_delegate : CFuncPtr1[Ptr[GtkEditable], Ptr[GtkEditable]])(using Zone): Ptr[_GtkEditableInterface] = 
    val ____ptr = apply()
    (!____ptr).base_iface = base_iface
    (!____ptr).insert_text = insert_text
    (!____ptr).delete_text = delete_text
    (!____ptr).changed = changed
    (!____ptr).get_text = get_text
    (!____ptr).do_insert_text = do_insert_text
    (!____ptr).do_delete_text = do_delete_text
    (!____ptr).get_selection_bounds = get_selection_bounds
    (!____ptr).set_selection_bounds = set_selection_bounds
    (!____ptr).get_delegate = get_delegate
    ____ptr
  extension (struct: _GtkEditableInterface)
    def base_iface : _root_.gobject.all.GTypeInterface = struct._1
    def base_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def insert_text : CFuncPtr4[Ptr[GtkEditable], CString, CInt, Ptr[CInt], Unit] = struct._2
    def insert_text_=(value: CFuncPtr4[Ptr[GtkEditable], CString, CInt, Ptr[CInt], Unit]): Unit = !struct.at2 = value
    def delete_text : CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit] = struct._3
    def delete_text_=(value: CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit]): Unit = !struct.at3 = value
    def changed : CFuncPtr1[Ptr[GtkEditable], Unit] = struct._4
    def changed_=(value: CFuncPtr1[Ptr[GtkEditable], Unit]): Unit = !struct.at4 = value
    def get_text : CFuncPtr1[Ptr[GtkEditable], CString] = struct._5
    def get_text_=(value: CFuncPtr1[Ptr[GtkEditable], CString]): Unit = !struct.at5 = value
    def do_insert_text : CFuncPtr4[Ptr[GtkEditable], CString, CInt, Ptr[CInt], Unit] = struct._6
    def do_insert_text_=(value: CFuncPtr4[Ptr[GtkEditable], CString, CInt, Ptr[CInt], Unit]): Unit = !struct.at6 = value
    def do_delete_text : CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit] = struct._7
    def do_delete_text_=(value: CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit]): Unit = !struct.at7 = value
    def get_selection_bounds : CFuncPtr3[Ptr[GtkEditable], Ptr[CInt], Ptr[CInt], _root_.glib.all.gboolean] = struct._8
    def get_selection_bounds_=(value: CFuncPtr3[Ptr[GtkEditable], Ptr[CInt], Ptr[CInt], _root_.glib.all.gboolean]): Unit = !struct.at8 = value
    def set_selection_bounds : CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit] = struct._9
    def set_selection_bounds_=(value: CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit]): Unit = !struct.at9 = value
    def get_delegate : CFuncPtr1[Ptr[GtkEditable], Ptr[GtkEditable]] = struct._10
    def get_delegate_=(value: CFuncPtr1[Ptr[GtkEditable], Ptr[GtkEditable]]): Unit = !struct.at10 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeditablelabel.h
*/
opaque type _GtkEditableLabel = CStruct0
object _GtkEditableLabel:
  given _tag: Tag[_GtkEditableLabel] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkemojichooser.h
*/
opaque type _GtkEmojiChooser = CStruct0
object _GtkEmojiChooser:
  given _tag: Tag[_GtkEmojiChooser] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkemojichooser.h
*/
opaque type _GtkEmojiChooserClass = CStruct0
object _GtkEmojiChooserClass:
  given _tag: Tag[_GtkEmojiChooserClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkentry.h
*/
opaque type _GtkEntry = CStruct1[GtkWidget]
object _GtkEntry:
  given _tag: Tag[_GtkEntry] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[_GtkEntry] = scala.scalanative.unsafe.alloc[_GtkEntry](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[_GtkEntry] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkEntry)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkentrybuffer.h
*/
opaque type _GtkEntryBuffer = CStruct1[_root_.gobject.all.GObject]
object _GtkEntryBuffer:
  given _tag: Tag[_GtkEntryBuffer] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[_GtkEntryBuffer] = scala.scalanative.unsafe.alloc[_GtkEntryBuffer](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[_GtkEntryBuffer] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkEntryBuffer)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkentrybuffer.h
*/
opaque type _GtkEntryBufferClass = CStruct15[_root_.gobject.all.GObjectClass, CFuncPtr4[Ptr[GtkEntryBuffer], _root_.glib.all.guint, CString, _root_.glib.all.guint, Unit], CFuncPtr3[Ptr[GtkEntryBuffer], _root_.glib.all.guint, _root_.glib.all.guint, Unit], CFuncPtr2[Ptr[GtkEntryBuffer], Ptr[_root_.glib.all.gsize], CString], CFuncPtr1[Ptr[GtkEntryBuffer], _root_.glib.all.guint], CFuncPtr4[Ptr[GtkEntryBuffer], _root_.glib.all.guint, CString, _root_.glib.all.guint, _root_.glib.all.guint], CFuncPtr3[Ptr[GtkEntryBuffer], _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object _GtkEntryBufferClass:
  given _tag: Tag[_GtkEntryBufferClass] = Tag.materializeCStruct15Tag[_root_.gobject.all.GObjectClass, CFuncPtr4[Ptr[GtkEntryBuffer], _root_.glib.all.guint, CString, _root_.glib.all.guint, Unit], CFuncPtr3[Ptr[GtkEntryBuffer], _root_.glib.all.guint, _root_.glib.all.guint, Unit], CFuncPtr2[Ptr[GtkEntryBuffer], Ptr[_root_.glib.all.gsize], CString], CFuncPtr1[Ptr[GtkEntryBuffer], _root_.glib.all.guint], CFuncPtr4[Ptr[GtkEntryBuffer], _root_.glib.all.guint, CString, _root_.glib.all.guint, _root_.glib.all.guint], CFuncPtr3[Ptr[GtkEntryBuffer], _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[_GtkEntryBufferClass] = scala.scalanative.unsafe.alloc[_GtkEntryBufferClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, inserted_text : CFuncPtr4[Ptr[GtkEntryBuffer], _root_.glib.all.guint, CString, _root_.glib.all.guint, Unit], deleted_text : CFuncPtr3[Ptr[GtkEntryBuffer], _root_.glib.all.guint, _root_.glib.all.guint, Unit], get_text : CFuncPtr2[Ptr[GtkEntryBuffer], Ptr[_root_.glib.all.gsize], CString], get_length : CFuncPtr1[Ptr[GtkEntryBuffer], _root_.glib.all.guint], insert_text : CFuncPtr4[Ptr[GtkEntryBuffer], _root_.glib.all.guint, CString, _root_.glib.all.guint, _root_.glib.all.guint], delete_text : CFuncPtr3[Ptr[GtkEntryBuffer], _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint], _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit], _gtk_reserved5 : CFuncPtr0[Unit], _gtk_reserved6 : CFuncPtr0[Unit], _gtk_reserved7 : CFuncPtr0[Unit], _gtk_reserved8 : CFuncPtr0[Unit])(using Zone): Ptr[_GtkEntryBufferClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).inserted_text = inserted_text
    (!____ptr).deleted_text = deleted_text
    (!____ptr).get_text = get_text
    (!____ptr).get_length = get_length
    (!____ptr).insert_text = insert_text
    (!____ptr).delete_text = delete_text
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    (!____ptr)._gtk_reserved5 = _gtk_reserved5
    (!____ptr)._gtk_reserved6 = _gtk_reserved6
    (!____ptr)._gtk_reserved7 = _gtk_reserved7
    (!____ptr)._gtk_reserved8 = _gtk_reserved8
    ____ptr
  extension (struct: _GtkEntryBufferClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def inserted_text : CFuncPtr4[Ptr[GtkEntryBuffer], _root_.glib.all.guint, CString, _root_.glib.all.guint, Unit] = struct._2
    def inserted_text_=(value: CFuncPtr4[Ptr[GtkEntryBuffer], _root_.glib.all.guint, CString, _root_.glib.all.guint, Unit]): Unit = !struct.at2 = value
    def deleted_text : CFuncPtr3[Ptr[GtkEntryBuffer], _root_.glib.all.guint, _root_.glib.all.guint, Unit] = struct._3
    def deleted_text_=(value: CFuncPtr3[Ptr[GtkEntryBuffer], _root_.glib.all.guint, _root_.glib.all.guint, Unit]): Unit = !struct.at3 = value
    def get_text : CFuncPtr2[Ptr[GtkEntryBuffer], Ptr[_root_.glib.all.gsize], CString] = struct._4
    def get_text_=(value: CFuncPtr2[Ptr[GtkEntryBuffer], Ptr[_root_.glib.all.gsize], CString]): Unit = !struct.at4 = value
    def get_length : CFuncPtr1[Ptr[GtkEntryBuffer], _root_.glib.all.guint] = struct._5
    def get_length_=(value: CFuncPtr1[Ptr[GtkEntryBuffer], _root_.glib.all.guint]): Unit = !struct.at5 = value
    def insert_text : CFuncPtr4[Ptr[GtkEntryBuffer], _root_.glib.all.guint, CString, _root_.glib.all.guint, _root_.glib.all.guint] = struct._6
    def insert_text_=(value: CFuncPtr4[Ptr[GtkEntryBuffer], _root_.glib.all.guint, CString, _root_.glib.all.guint, _root_.glib.all.guint]): Unit = !struct.at6 = value
    def delete_text : CFuncPtr3[Ptr[GtkEntryBuffer], _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint] = struct._7
    def delete_text_=(value: CFuncPtr3[Ptr[GtkEntryBuffer], _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.guint]): Unit = !struct.at7 = value
    def _gtk_reserved1 : CFuncPtr0[Unit] = struct._8
    def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at8 = value
    def _gtk_reserved2 : CFuncPtr0[Unit] = struct._9
    def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at9 = value
    def _gtk_reserved3 : CFuncPtr0[Unit] = struct._10
    def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at10 = value
    def _gtk_reserved4 : CFuncPtr0[Unit] = struct._11
    def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at11 = value
    def _gtk_reserved5 : CFuncPtr0[Unit] = struct._12
    def _gtk_reserved5_=(value: CFuncPtr0[Unit]): Unit = !struct.at12 = value
    def _gtk_reserved6 : CFuncPtr0[Unit] = struct._13
    def _gtk_reserved6_=(value: CFuncPtr0[Unit]): Unit = !struct.at13 = value
    def _gtk_reserved7 : CFuncPtr0[Unit] = struct._14
    def _gtk_reserved7_=(value: CFuncPtr0[Unit]): Unit = !struct.at14 = value
    def _gtk_reserved8 : CFuncPtr0[Unit] = struct._15
    def _gtk_reserved8_=(value: CFuncPtr0[Unit]): Unit = !struct.at15 = value

/**
 * GtkEntryClass: _class: The parent class. : Class handler for the `GtkEntry::activate` signal. The default implementation activates the gtk.activate-default action.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkentry.h
*/
opaque type _GtkEntryClass = CStruct3[GtkWidgetClass, CFuncPtr1[Ptr[GtkEntry], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkEntryClass:
  given _tag: Tag[_GtkEntryClass] = Tag.materializeCStruct3Tag[GtkWidgetClass, CFuncPtr1[Ptr[GtkEntry], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkEntryClass] = scala.scalanative.unsafe.alloc[_GtkEntryClass](1)
  def apply(parent_class : GtkWidgetClass, activate : CFuncPtr1[Ptr[GtkEntry], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkEntryClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).activate = activate
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkEntryClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def activate : CFuncPtr1[Ptr[GtkEntry], Unit] = struct._2
    def activate_=(value: CFuncPtr1[Ptr[GtkEntry], Unit]): Unit = !struct.at2 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._3
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkentrycompletion.h
*/
opaque type _GtkEntryCompletion = CStruct0
object _GtkEntryCompletion:
  given _tag: Tag[_GtkEntryCompletion] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
opaque type _GtkEventController = CStruct0
object _GtkEventController:
  given _tag: Tag[_GtkEventController] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeventcontroller.h
*/
opaque type _GtkEventControllerClass = CStruct0
object _GtkEventControllerClass:
  given _tag: Tag[_GtkEventControllerClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeventcontrollerfocus.h
*/
opaque type _GtkEventControllerFocus = CStruct0
object _GtkEventControllerFocus:
  given _tag: Tag[_GtkEventControllerFocus] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeventcontrollerfocus.h
*/
opaque type _GtkEventControllerFocusClass = CStruct0
object _GtkEventControllerFocusClass:
  given _tag: Tag[_GtkEventControllerFocusClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeventcontrollerkey.h
*/
opaque type _GtkEventControllerKey = CStruct0
object _GtkEventControllerKey:
  given _tag: Tag[_GtkEventControllerKey] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeventcontrollerkey.h
*/
opaque type _GtkEventControllerKeyClass = CStruct0
object _GtkEventControllerKeyClass:
  given _tag: Tag[_GtkEventControllerKeyClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeventcontrollerlegacy.h
*/
opaque type _GtkEventControllerLegacy = CStruct0
object _GtkEventControllerLegacy:
  given _tag: Tag[_GtkEventControllerLegacy] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeventcontrollerlegacy.h
*/
opaque type _GtkEventControllerLegacyClass = CStruct0
object _GtkEventControllerLegacyClass:
  given _tag: Tag[_GtkEventControllerLegacyClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeventcontrollermotion.h
*/
opaque type _GtkEventControllerMotion = CStruct0
object _GtkEventControllerMotion:
  given _tag: Tag[_GtkEventControllerMotion] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeventcontrollermotion.h
*/
opaque type _GtkEventControllerMotionClass = CStruct0
object _GtkEventControllerMotionClass:
  given _tag: Tag[_GtkEventControllerMotionClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeventcontrollerscroll.h
*/
opaque type _GtkEventControllerScroll = CStruct0
object _GtkEventControllerScroll:
  given _tag: Tag[_GtkEventControllerScroll] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkeventcontrollerscroll.h
*/
opaque type _GtkEventControllerScrollClass = CStruct0
object _GtkEventControllerScrollClass:
  given _tag: Tag[_GtkEventControllerScrollClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type _GtkEveryFilter = CStruct0
object _GtkEveryFilter:
  given _tag: Tag[_GtkEveryFilter] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type _GtkEveryFilterClass = CStruct0
object _GtkEveryFilterClass:
  given _tag: Tag[_GtkEveryFilterClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkexpander.h
*/
opaque type _GtkExpander = CStruct0
object _GtkExpander:
  given _tag: Tag[_GtkExpander] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkexpression.h
*/
opaque type _GtkExpression = CStruct0
object _GtkExpression:
  given _tag: Tag[_GtkExpression] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkexpression.h
*/
opaque type _GtkExpressionWatch = CStruct0
object _GtkExpressionWatch:
  given _tag: Tag[_GtkExpressionWatch] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilechooser.h
*/
opaque type _GtkFileChooser = CStruct0
object _GtkFileChooser:
  given _tag: Tag[_GtkFileChooser] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilechooserdialog.h
*/
opaque type _GtkFileChooserDialog = CStruct0
object _GtkFileChooserDialog:
  given _tag: Tag[_GtkFileChooserDialog] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilechoosernative.h
*/
opaque type _GtkFileChooserNative = CStruct0
object _GtkFileChooserNative:
  given _tag: Tag[_GtkFileChooserNative] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilechooserwidget.h
*/
opaque type _GtkFileChooserWidget = CStruct0
object _GtkFileChooserWidget:
  given _tag: Tag[_GtkFileChooserWidget] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilefilter.h
*/
opaque type _GtkFileFilter = CStruct0
object _GtkFileFilter:
  given _tag: Tag[_GtkFileFilter] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilter.h
*/
opaque type _GtkFilter = CStruct1[_root_.gobject.all.GObject]
object _GtkFilter:
  given _tag: Tag[_GtkFilter] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[_GtkFilter] = scala.scalanative.unsafe.alloc[_GtkFilter](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[_GtkFilter] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkFilter)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilter.h
*/
opaque type _GtkFilterClass = CStruct11[_root_.gobject.all.GObjectClass, CFuncPtr2[Ptr[GtkFilter], _root_.glib.all.gpointer, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkFilter], GtkFilterMatch], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object _GtkFilterClass:
  given _tag: Tag[_GtkFilterClass] = Tag.materializeCStruct11Tag[_root_.gobject.all.GObjectClass, CFuncPtr2[Ptr[GtkFilter], _root_.glib.all.gpointer, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkFilter], GtkFilterMatch], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[_GtkFilterClass] = scala.scalanative.unsafe.alloc[_GtkFilterClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, `match` : CFuncPtr2[Ptr[GtkFilter], _root_.glib.all.gpointer, _root_.glib.all.gboolean], get_strictness : CFuncPtr1[Ptr[GtkFilter], GtkFilterMatch], _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit], _gtk_reserved5 : CFuncPtr0[Unit], _gtk_reserved6 : CFuncPtr0[Unit], _gtk_reserved7 : CFuncPtr0[Unit], _gtk_reserved8 : CFuncPtr0[Unit])(using Zone): Ptr[_GtkFilterClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).`match` = `match`
    (!____ptr).get_strictness = get_strictness
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    (!____ptr)._gtk_reserved5 = _gtk_reserved5
    (!____ptr)._gtk_reserved6 = _gtk_reserved6
    (!____ptr)._gtk_reserved7 = _gtk_reserved7
    (!____ptr)._gtk_reserved8 = _gtk_reserved8
    ____ptr
  extension (struct: _GtkFilterClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def `match` : CFuncPtr2[Ptr[GtkFilter], _root_.glib.all.gpointer, _root_.glib.all.gboolean] = struct._2
    def match_=(value: CFuncPtr2[Ptr[GtkFilter], _root_.glib.all.gpointer, _root_.glib.all.gboolean]): Unit = !struct.at2 = value
    def get_strictness : CFuncPtr1[Ptr[GtkFilter], GtkFilterMatch] = struct._3
    def get_strictness_=(value: CFuncPtr1[Ptr[GtkFilter], GtkFilterMatch]): Unit = !struct.at3 = value
    def _gtk_reserved1 : CFuncPtr0[Unit] = struct._4
    def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at4 = value
    def _gtk_reserved2 : CFuncPtr0[Unit] = struct._5
    def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at5 = value
    def _gtk_reserved3 : CFuncPtr0[Unit] = struct._6
    def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at6 = value
    def _gtk_reserved4 : CFuncPtr0[Unit] = struct._7
    def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at7 = value
    def _gtk_reserved5 : CFuncPtr0[Unit] = struct._8
    def _gtk_reserved5_=(value: CFuncPtr0[Unit]): Unit = !struct.at8 = value
    def _gtk_reserved6 : CFuncPtr0[Unit] = struct._9
    def _gtk_reserved6_=(value: CFuncPtr0[Unit]): Unit = !struct.at9 = value
    def _gtk_reserved7 : CFuncPtr0[Unit] = struct._10
    def _gtk_reserved7_=(value: CFuncPtr0[Unit]): Unit = !struct.at10 = value
    def _gtk_reserved8 : CFuncPtr0[Unit] = struct._11
    def _gtk_reserved8_=(value: CFuncPtr0[Unit]): Unit = !struct.at11 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfilterlistmodel.h
*/
opaque type _GtkFilterListModel = CStruct0
object _GtkFilterListModel:
  given _tag: Tag[_GtkFilterListModel] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfixed.h
*/
opaque type _GtkFixed = CStruct1[GtkWidget]
object _GtkFixed:
  given _tag: Tag[_GtkFixed] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[_GtkFixed] = scala.scalanative.unsafe.alloc[_GtkFixed](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[_GtkFixed] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkFixed)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfixed.h
*/
opaque type _GtkFixedClass = CStruct2[GtkWidgetClass, CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkFixedClass:
  given _tag: Tag[_GtkFixedClass] = Tag.materializeCStruct2Tag[GtkWidgetClass, CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkFixedClass] = scala.scalanative.unsafe.alloc[_GtkFixedClass](1)
  def apply(parent_class : GtkWidgetClass, padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkFixedClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkFixedClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._2
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfixedlayout.h
*/
opaque type _GtkFixedLayout = CStruct0
object _GtkFixedLayout:
  given _tag: Tag[_GtkFixedLayout] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfixedlayout.h
*/
opaque type _GtkFixedLayoutChild = CStruct0
object _GtkFixedLayoutChild:
  given _tag: Tag[_GtkFixedLayoutChild] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkflattenlistmodel.h
*/
opaque type _GtkFlattenListModel = CStruct0
object _GtkFlattenListModel:
  given _tag: Tag[_GtkFlattenListModel] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkflowbox.h
*/
opaque type _GtkFlowBox = CStruct0
object _GtkFlowBox:
  given _tag: Tag[_GtkFlowBox] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkflowbox.h
*/
opaque type _GtkFlowBoxChild = CStruct1[GtkWidget]
object _GtkFlowBoxChild:
  given _tag: Tag[_GtkFlowBoxChild] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[_GtkFlowBoxChild] = scala.scalanative.unsafe.alloc[_GtkFlowBoxChild](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[_GtkFlowBoxChild] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkFlowBoxChild)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkflowbox.h
*/
opaque type _GtkFlowBoxChildClass = CStruct3[GtkWidgetClass, CFuncPtr1[Ptr[GtkFlowBoxChild], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkFlowBoxChildClass:
  given _tag: Tag[_GtkFlowBoxChildClass] = Tag.materializeCStruct3Tag[GtkWidgetClass, CFuncPtr1[Ptr[GtkFlowBoxChild], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkFlowBoxChildClass] = scala.scalanative.unsafe.alloc[_GtkFlowBoxChildClass](1)
  def apply(parent_class : GtkWidgetClass, activate : CFuncPtr1[Ptr[GtkFlowBoxChild], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkFlowBoxChildClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).activate = activate
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkFlowBoxChildClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def activate : CFuncPtr1[Ptr[GtkFlowBoxChild], Unit] = struct._2
    def activate_=(value: CFuncPtr1[Ptr[GtkFlowBoxChild], Unit]): Unit = !struct.at2 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._3
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfontbutton.h
*/
opaque type _GtkFontButton = CStruct0
object _GtkFontButton:
  given _tag: Tag[_GtkFontButton] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfontchooser.h
*/
opaque type _GtkFontChooser = CStruct0
object _GtkFontChooser:
  given _tag: Tag[_GtkFontChooser] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfontchooserdialog.h
*/
opaque type _GtkFontChooserDialog = CStruct0
object _GtkFontChooserDialog:
  given _tag: Tag[_GtkFontChooserDialog] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfontchooser.h
*/
opaque type _GtkFontChooserIface = CStruct9[_root_.gobject.all.GTypeInterface, CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontFamily]], CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontFace]], CFuncPtr1[Ptr[GtkFontChooser], CInt], CFuncPtr4[Ptr[GtkFontChooser], GtkFontFilterFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit], CFuncPtr2[Ptr[GtkFontChooser], CString, Unit], CFuncPtr2[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontMap], Unit], CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontMap]], CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._0]]]
object _GtkFontChooserIface:
  given _tag: Tag[_GtkFontChooserIface] = Tag.materializeCStruct9Tag[_root_.gobject.all.GTypeInterface, CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontFamily]], CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontFace]], CFuncPtr1[Ptr[GtkFontChooser], CInt], CFuncPtr4[Ptr[GtkFontChooser], GtkFontFilterFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit], CFuncPtr2[Ptr[GtkFontChooser], CString, Unit], CFuncPtr2[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontMap], Unit], CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontMap]], CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._0]]]
  def apply()(using Zone): Ptr[_GtkFontChooserIface] = scala.scalanative.unsafe.alloc[_GtkFontChooserIface](1)
  def apply(base_iface : _root_.gobject.all.GTypeInterface, get_font_family : CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontFamily]], get_font_face : CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontFace]], get_font_size : CFuncPtr1[Ptr[GtkFontChooser], CInt], set_filter_func : CFuncPtr4[Ptr[GtkFontChooser], GtkFontFilterFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit], font_activated : CFuncPtr2[Ptr[GtkFontChooser], CString, Unit], set_font_map : CFuncPtr2[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontMap], Unit], get_font_map : CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontMap]], padding : CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._0]])(using Zone): Ptr[_GtkFontChooserIface] = 
    val ____ptr = apply()
    (!____ptr).base_iface = base_iface
    (!____ptr).get_font_family = get_font_family
    (!____ptr).get_font_face = get_font_face
    (!____ptr).get_font_size = get_font_size
    (!____ptr).set_filter_func = set_filter_func
    (!____ptr).font_activated = font_activated
    (!____ptr).set_font_map = set_font_map
    (!____ptr).get_font_map = get_font_map
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkFontChooserIface)
    def base_iface : _root_.gobject.all.GTypeInterface = struct._1
    def base_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def get_font_family : CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontFamily]] = struct._2
    def get_font_family_=(value: CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontFamily]]): Unit = !struct.at2 = value
    def get_font_face : CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontFace]] = struct._3
    def get_font_face_=(value: CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontFace]]): Unit = !struct.at3 = value
    def get_font_size : CFuncPtr1[Ptr[GtkFontChooser], CInt] = struct._4
    def get_font_size_=(value: CFuncPtr1[Ptr[GtkFontChooser], CInt]): Unit = !struct.at4 = value
    def set_filter_func : CFuncPtr4[Ptr[GtkFontChooser], GtkFontFilterFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit] = struct._5
    def set_filter_func_=(value: CFuncPtr4[Ptr[GtkFontChooser], GtkFontFilterFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit]): Unit = !struct.at5 = value
    def font_activated : CFuncPtr2[Ptr[GtkFontChooser], CString, Unit] = struct._6
    def font_activated_=(value: CFuncPtr2[Ptr[GtkFontChooser], CString, Unit]): Unit = !struct.at6 = value
    def set_font_map : CFuncPtr2[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontMap], Unit] = struct._7
    def set_font_map_=(value: CFuncPtr2[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontMap], Unit]): Unit = !struct.at7 = value
    def get_font_map : CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontMap]] = struct._8
    def get_font_map_=(value: CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.pango.all.PangoFontMap]]): Unit = !struct.at8 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._0]] = struct._9
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._0]]): Unit = !struct.at9 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkfontchooserwidget.h
*/
opaque type _GtkFontChooserWidget = CStruct0
object _GtkFontChooserWidget:
  given _tag: Tag[_GtkFontChooserWidget] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkframe.h
*/
opaque type _GtkFrame = CStruct1[GtkWidget]
object _GtkFrame:
  given _tag: Tag[_GtkFrame] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[_GtkFrame] = scala.scalanative.unsafe.alloc[_GtkFrame](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[_GtkFrame] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkFrame)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * GtkFrameClass: _class: The parent class. _child_allocation:

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkframe.h
*/
opaque type _GtkFrameClass = CStruct3[GtkWidgetClass, CFuncPtr2[Ptr[GtkFrame], Ptr[GtkAllocation], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkFrameClass:
  given _tag: Tag[_GtkFrameClass] = Tag.materializeCStruct3Tag[GtkWidgetClass, CFuncPtr2[Ptr[GtkFrame], Ptr[GtkAllocation], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkFrameClass] = scala.scalanative.unsafe.alloc[_GtkFrameClass](1)
  def apply(parent_class : GtkWidgetClass, compute_child_allocation : CFuncPtr2[Ptr[GtkFrame], Ptr[GtkAllocation], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkFrameClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).compute_child_allocation = compute_child_allocation
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkFrameClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def compute_child_allocation : CFuncPtr2[Ptr[GtkFrame], Ptr[GtkAllocation], Unit] = struct._2
    def compute_child_allocation_=(value: CFuncPtr2[Ptr[GtkFrame], Ptr[GtkAllocation], Unit]): Unit = !struct.at2 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._3
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkglarea.h
*/
opaque type _GtkGLArea = CStruct1[GtkWidget]
object _GtkGLArea:
  given _tag: Tag[_GtkGLArea] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[_GtkGLArea] = scala.scalanative.unsafe.alloc[_GtkGLArea](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[_GtkGLArea] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkGLArea)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * GtkGLAreaClass: : class closure for the `GtkGLArea::render` signal : class closeure for the `GtkGLArea::resize` signal _context: class closure for the `GtkGLArea::create-context` signal

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkglarea.h
*/
opaque type _GtkGLAreaClass = CStruct5[GtkWidgetClass, CFuncPtr2[Ptr[GtkGLArea], Ptr[GdkGLContext], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkGLArea], CInt, CInt, Unit], CFuncPtr1[Ptr[GtkGLArea], Ptr[GdkGLContext]], CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkGLAreaClass:
  given _tag: Tag[_GtkGLAreaClass] = Tag.materializeCStruct5Tag[GtkWidgetClass, CFuncPtr2[Ptr[GtkGLArea], Ptr[GdkGLContext], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkGLArea], CInt, CInt, Unit], CFuncPtr1[Ptr[GtkGLArea], Ptr[GdkGLContext]], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkGLAreaClass] = scala.scalanative.unsafe.alloc[_GtkGLAreaClass](1)
  def apply(parent_class : GtkWidgetClass, render : CFuncPtr2[Ptr[GtkGLArea], Ptr[GdkGLContext], _root_.glib.all.gboolean], resize : CFuncPtr3[Ptr[GtkGLArea], CInt, CInt, Unit], create_context : CFuncPtr1[Ptr[GtkGLArea], Ptr[GdkGLContext]], _padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkGLAreaClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).render = render
    (!____ptr).resize = resize
    (!____ptr).create_context = create_context
    (!____ptr)._padding = _padding
    ____ptr
  extension (struct: _GtkGLAreaClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def render : CFuncPtr2[Ptr[GtkGLArea], Ptr[GdkGLContext], _root_.glib.all.gboolean] = struct._2
    def render_=(value: CFuncPtr2[Ptr[GtkGLArea], Ptr[GdkGLContext], _root_.glib.all.gboolean]): Unit = !struct.at2 = value
    def resize : CFuncPtr3[Ptr[GtkGLArea], CInt, CInt, Unit] = struct._3
    def resize_=(value: CFuncPtr3[Ptr[GtkGLArea], CInt, CInt, Unit]): Unit = !struct.at3 = value
    def create_context : CFuncPtr1[Ptr[GtkGLArea], Ptr[GdkGLContext]] = struct._4
    def create_context_=(value: CFuncPtr1[Ptr[GtkGLArea], Ptr[GdkGLContext]]): Unit = !struct.at4 = value
    def _padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._5
    def _padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at5 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
opaque type _GtkGesture = CStruct0
object _GtkGesture:
  given _tag: Tag[_GtkGesture] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgesture.h
*/
opaque type _GtkGestureClass = CStruct0
object _GtkGestureClass:
  given _tag: Tag[_GtkGestureClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgestureclick.h
*/
opaque type _GtkGestureClick = CStruct0
object _GtkGestureClick:
  given _tag: Tag[_GtkGestureClick] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgestureclick.h
*/
opaque type _GtkGestureClickClass = CStruct0
object _GtkGestureClickClass:
  given _tag: Tag[_GtkGestureClickClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgesturedrag.h
*/
opaque type _GtkGestureDrag = CStruct0
object _GtkGestureDrag:
  given _tag: Tag[_GtkGestureDrag] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgesturedrag.h
*/
opaque type _GtkGestureDragClass = CStruct0
object _GtkGestureDragClass:
  given _tag: Tag[_GtkGestureDragClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgesturelongpress.h
*/
opaque type _GtkGestureLongPress = CStruct0
object _GtkGestureLongPress:
  given _tag: Tag[_GtkGestureLongPress] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgesturelongpress.h
*/
opaque type _GtkGestureLongPressClass = CStruct0
object _GtkGestureLongPressClass:
  given _tag: Tag[_GtkGestureLongPressClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgesturepan.h
*/
opaque type _GtkGesturePan = CStruct0
object _GtkGesturePan:
  given _tag: Tag[_GtkGesturePan] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgesturepan.h
*/
opaque type _GtkGesturePanClass = CStruct0
object _GtkGesturePanClass:
  given _tag: Tag[_GtkGesturePanClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgesturerotate.h
*/
opaque type _GtkGestureRotate = CStruct0
object _GtkGestureRotate:
  given _tag: Tag[_GtkGestureRotate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgesturerotate.h
*/
opaque type _GtkGestureRotateClass = CStruct0
object _GtkGestureRotateClass:
  given _tag: Tag[_GtkGestureRotateClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgesturesingle.h
*/
opaque type _GtkGestureSingle = CStruct0
object _GtkGestureSingle:
  given _tag: Tag[_GtkGestureSingle] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgesturesingle.h
*/
opaque type _GtkGestureSingleClass = CStruct0
object _GtkGestureSingleClass:
  given _tag: Tag[_GtkGestureSingleClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgesturestylus.h
*/
opaque type _GtkGestureStylus = CStruct0
object _GtkGestureStylus:
  given _tag: Tag[_GtkGestureStylus] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgesturestylus.h
*/
opaque type _GtkGestureStylusClass = CStruct0
object _GtkGestureStylusClass:
  given _tag: Tag[_GtkGestureStylusClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgestureswipe.h
*/
opaque type _GtkGestureSwipe = CStruct0
object _GtkGestureSwipe:
  given _tag: Tag[_GtkGestureSwipe] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgestureswipe.h
*/
opaque type _GtkGestureSwipeClass = CStruct0
object _GtkGestureSwipeClass:
  given _tag: Tag[_GtkGestureSwipeClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgesturezoom.h
*/
opaque type _GtkGestureZoom = CStruct0
object _GtkGestureZoom:
  given _tag: Tag[_GtkGestureZoom] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgesturezoom.h
*/
opaque type _GtkGestureZoomClass = CStruct0
object _GtkGestureZoomClass:
  given _tag: Tag[_GtkGestureZoomClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgrid.h
*/
opaque type _GtkGrid = CStruct1[GtkWidget]
object _GtkGrid:
  given _tag: Tag[_GtkGrid] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[_GtkGrid] = scala.scalanative.unsafe.alloc[_GtkGrid](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[_GtkGrid] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkGrid)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * GtkGridClass: _class: The parent class.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgrid.h
*/
opaque type _GtkGridClass = CStruct2[GtkWidgetClass, CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkGridClass:
  given _tag: Tag[_GtkGridClass] = Tag.materializeCStruct2Tag[GtkWidgetClass, CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkGridClass] = scala.scalanative.unsafe.alloc[_GtkGridClass](1)
  def apply(parent_class : GtkWidgetClass, padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkGridClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkGridClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._2
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgridlayout.h
*/
opaque type _GtkGridLayout = CStruct0
object _GtkGridLayout:
  given _tag: Tag[_GtkGridLayout] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgridlayout.h
*/
opaque type _GtkGridLayoutChild = CStruct0
object _GtkGridLayoutChild:
  given _tag: Tag[_GtkGridLayoutChild] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgridview.h
*/
opaque type _GtkGridView = CStruct0
object _GtkGridView:
  given _tag: Tag[_GtkGridView] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkgridview.h
*/
opaque type _GtkGridViewClass = CStruct0
object _GtkGridViewClass:
  given _tag: Tag[_GtkGridViewClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkheaderbar.h
*/
opaque type _GtkHeaderBar = CStruct0
object _GtkHeaderBar:
  given _tag: Tag[_GtkHeaderBar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkimcontext.h
*/
opaque type _GtkIMContext = CStruct1[_root_.gobject.all.GObject]
object _GtkIMContext:
  given _tag: Tag[_GtkIMContext] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[_GtkIMContext] = scala.scalanative.unsafe.alloc[_GtkIMContext](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[_GtkIMContext] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkIMContext)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkimcontext.h
*/
opaque type _GtkIMContextClass = CArray[CChar, Nat.Digit3[Nat._3, Nat._2, Nat._0]]
object _GtkIMContextClass:
  given _tag: Tag[_GtkIMContextClass] = Tag.CArray[CChar, Nat.Digit3[Nat._3, Nat._2, Nat._0]](Tag.Byte, Tag.Digit3[Nat._3, Nat._2, Nat._0](Tag.Nat3, Tag.Nat2, Tag.Nat0))
  def apply()(using Zone): Ptr[_GtkIMContextClass] = scala.scalanative.unsafe.alloc[_GtkIMContextClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, preedit_start : CFuncPtr1[Ptr[GtkIMContext], Unit], preedit_end : CFuncPtr1[Ptr[GtkIMContext], Unit], preedit_changed : CFuncPtr1[Ptr[GtkIMContext], Unit], commit : CFuncPtr2[Ptr[GtkIMContext], CString, Unit], retrieve_surrounding : CFuncPtr1[Ptr[GtkIMContext], _root_.glib.all.gboolean], delete_surrounding : CFuncPtr3[Ptr[GtkIMContext], CInt, CInt, _root_.glib.all.gboolean], set_client_widget : CFuncPtr2[Ptr[GtkIMContext], Ptr[GtkWidget], Unit], get_preedit_string : CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[Ptr[_root_.pango.all.PangoAttrList]], Ptr[CInt], Unit], filter_keypress : CFuncPtr2[Ptr[GtkIMContext], Ptr[GdkEvent], _root_.glib.all.gboolean], focus_in : CFuncPtr1[Ptr[GtkIMContext], Unit], focus_out : CFuncPtr1[Ptr[GtkIMContext], Unit], reset : CFuncPtr1[Ptr[GtkIMContext], Unit], set_cursor_location : CFuncPtr2[Ptr[GtkIMContext], Ptr[GdkRectangle], Unit], set_use_preedit : CFuncPtr2[Ptr[GtkIMContext], _root_.glib.all.gboolean, Unit], set_surrounding : CFuncPtr4[Ptr[GtkIMContext], CString, CInt, CInt, Unit], get_surrounding : CFuncPtr3[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], _root_.glib.all.gboolean], set_surrounding_with_selection : CFuncPtr5[Ptr[GtkIMContext], CString, CInt, CInt, CInt, Unit], get_surrounding_with_selection : CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], Ptr[CInt], _root_.glib.all.gboolean], _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit], _gtk_reserved5 : CFuncPtr0[Unit])(using Zone): Ptr[_GtkIMContextClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).preedit_start = preedit_start
    (!____ptr).preedit_end = preedit_end
    (!____ptr).preedit_changed = preedit_changed
    (!____ptr).commit = commit
    (!____ptr).retrieve_surrounding = retrieve_surrounding
    (!____ptr).delete_surrounding = delete_surrounding
    (!____ptr).set_client_widget = set_client_widget
    (!____ptr).get_preedit_string = get_preedit_string
    (!____ptr).filter_keypress = filter_keypress
    (!____ptr).focus_in = focus_in
    (!____ptr).focus_out = focus_out
    (!____ptr).reset = reset
    (!____ptr).set_cursor_location = set_cursor_location
    (!____ptr).set_use_preedit = set_use_preedit
    (!____ptr).set_surrounding = set_surrounding
    (!____ptr).get_surrounding = get_surrounding
    (!____ptr).set_surrounding_with_selection = set_surrounding_with_selection
    (!____ptr).get_surrounding_with_selection = get_surrounding_with_selection
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    (!____ptr)._gtk_reserved5 = _gtk_reserved5
    ____ptr
  extension (struct: _GtkIMContextClass)
    def parent_class: _root_.gobject.all.GObjectClass = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObjectClass]]
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GObjectClass]] = value
    def preedit_start: CFuncPtr1[Ptr[GtkIMContext], Unit] = !struct.at(136).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]]
    def preedit_start_=(value: CFuncPtr1[Ptr[GtkIMContext], Unit]): Unit = !struct.at(136).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]] = value
    def preedit_end: CFuncPtr1[Ptr[GtkIMContext], Unit] = !struct.at(144).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]]
    def preedit_end_=(value: CFuncPtr1[Ptr[GtkIMContext], Unit]): Unit = !struct.at(144).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]] = value
    def preedit_changed: CFuncPtr1[Ptr[GtkIMContext], Unit] = !struct.at(152).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]]
    def preedit_changed_=(value: CFuncPtr1[Ptr[GtkIMContext], Unit]): Unit = !struct.at(152).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]] = value
    def commit: CFuncPtr2[Ptr[GtkIMContext], CString, Unit] = !struct.at(160).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], CString, Unit]]]
    def commit_=(value: CFuncPtr2[Ptr[GtkIMContext], CString, Unit]): Unit = !struct.at(160).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], CString, Unit]]] = value
    def retrieve_surrounding: CFuncPtr1[Ptr[GtkIMContext], _root_.glib.all.gboolean] = !struct.at(168).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], _root_.glib.all.gboolean]]]
    def retrieve_surrounding_=(value: CFuncPtr1[Ptr[GtkIMContext], _root_.glib.all.gboolean]): Unit = !struct.at(168).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], _root_.glib.all.gboolean]]] = value
    def delete_surrounding: CFuncPtr3[Ptr[GtkIMContext], CInt, CInt, _root_.glib.all.gboolean] = !struct.at(176).asInstanceOf[Ptr[CFuncPtr3[Ptr[GtkIMContext], CInt, CInt, _root_.glib.all.gboolean]]]
    def delete_surrounding_=(value: CFuncPtr3[Ptr[GtkIMContext], CInt, CInt, _root_.glib.all.gboolean]): Unit = !struct.at(176).asInstanceOf[Ptr[CFuncPtr3[Ptr[GtkIMContext], CInt, CInt, _root_.glib.all.gboolean]]] = value
    def set_client_widget: CFuncPtr2[Ptr[GtkIMContext], Ptr[GtkWidget], Unit] = !struct.at(184).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], Ptr[GtkWidget], Unit]]]
    def set_client_widget_=(value: CFuncPtr2[Ptr[GtkIMContext], Ptr[GtkWidget], Unit]): Unit = !struct.at(184).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], Ptr[GtkWidget], Unit]]] = value
    def get_preedit_string: CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[Ptr[_root_.pango.all.PangoAttrList]], Ptr[CInt], Unit] = !struct.at(192).asInstanceOf[Ptr[CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[Ptr[_root_.pango.all.PangoAttrList]], Ptr[CInt], Unit]]]
    def get_preedit_string_=(value: CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[Ptr[_root_.pango.all.PangoAttrList]], Ptr[CInt], Unit]): Unit = !struct.at(192).asInstanceOf[Ptr[CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[Ptr[_root_.pango.all.PangoAttrList]], Ptr[CInt], Unit]]] = value
    def filter_keypress: CFuncPtr2[Ptr[GtkIMContext], Ptr[GdkEvent], _root_.glib.all.gboolean] = !struct.at(200).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], Ptr[GdkEvent], _root_.glib.all.gboolean]]]
    def filter_keypress_=(value: CFuncPtr2[Ptr[GtkIMContext], Ptr[GdkEvent], _root_.glib.all.gboolean]): Unit = !struct.at(200).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], Ptr[GdkEvent], _root_.glib.all.gboolean]]] = value
    def focus_in: CFuncPtr1[Ptr[GtkIMContext], Unit] = !struct.at(208).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]]
    def focus_in_=(value: CFuncPtr1[Ptr[GtkIMContext], Unit]): Unit = !struct.at(208).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]] = value
    def focus_out: CFuncPtr1[Ptr[GtkIMContext], Unit] = !struct.at(216).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]]
    def focus_out_=(value: CFuncPtr1[Ptr[GtkIMContext], Unit]): Unit = !struct.at(216).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]] = value
    def reset: CFuncPtr1[Ptr[GtkIMContext], Unit] = !struct.at(224).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]]
    def reset_=(value: CFuncPtr1[Ptr[GtkIMContext], Unit]): Unit = !struct.at(224).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]] = value
    def set_cursor_location: CFuncPtr2[Ptr[GtkIMContext], Ptr[GdkRectangle], Unit] = !struct.at(232).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], Ptr[GdkRectangle], Unit]]]
    def set_cursor_location_=(value: CFuncPtr2[Ptr[GtkIMContext], Ptr[GdkRectangle], Unit]): Unit = !struct.at(232).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], Ptr[GdkRectangle], Unit]]] = value
    def set_use_preedit: CFuncPtr2[Ptr[GtkIMContext], _root_.glib.all.gboolean, Unit] = !struct.at(240).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], _root_.glib.all.gboolean, Unit]]]
    def set_use_preedit_=(value: CFuncPtr2[Ptr[GtkIMContext], _root_.glib.all.gboolean, Unit]): Unit = !struct.at(240).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], _root_.glib.all.gboolean, Unit]]] = value
    def set_surrounding: CFuncPtr4[Ptr[GtkIMContext], CString, CInt, CInt, Unit] = !struct.at(248).asInstanceOf[Ptr[CFuncPtr4[Ptr[GtkIMContext], CString, CInt, CInt, Unit]]]
    def set_surrounding_=(value: CFuncPtr4[Ptr[GtkIMContext], CString, CInt, CInt, Unit]): Unit = !struct.at(248).asInstanceOf[Ptr[CFuncPtr4[Ptr[GtkIMContext], CString, CInt, CInt, Unit]]] = value
    def get_surrounding: CFuncPtr3[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], _root_.glib.all.gboolean] = !struct.at(256).asInstanceOf[Ptr[CFuncPtr3[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], _root_.glib.all.gboolean]]]
    def get_surrounding_=(value: CFuncPtr3[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], _root_.glib.all.gboolean]): Unit = !struct.at(256).asInstanceOf[Ptr[CFuncPtr3[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], _root_.glib.all.gboolean]]] = value
    def set_surrounding_with_selection: CFuncPtr5[Ptr[GtkIMContext], CString, CInt, CInt, CInt, Unit] = !struct.at(264).asInstanceOf[Ptr[CFuncPtr5[Ptr[GtkIMContext], CString, CInt, CInt, CInt, Unit]]]
    def set_surrounding_with_selection_=(value: CFuncPtr5[Ptr[GtkIMContext], CString, CInt, CInt, CInt, Unit]): Unit = !struct.at(264).asInstanceOf[Ptr[CFuncPtr5[Ptr[GtkIMContext], CString, CInt, CInt, CInt, Unit]]] = value
    def get_surrounding_with_selection: CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], Ptr[CInt], _root_.glib.all.gboolean] = !struct.at(272).asInstanceOf[Ptr[CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], Ptr[CInt], _root_.glib.all.gboolean]]]
    def get_surrounding_with_selection_=(value: CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], Ptr[CInt], _root_.glib.all.gboolean]): Unit = !struct.at(272).asInstanceOf[Ptr[CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], Ptr[CInt], _root_.glib.all.gboolean]]] = value
    def _gtk_reserved1: CFuncPtr0[Unit] = !struct.at(280).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
    def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at(280).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
    def _gtk_reserved2: CFuncPtr0[Unit] = !struct.at(288).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
    def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at(288).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
    def _gtk_reserved3: CFuncPtr0[Unit] = !struct.at(296).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
    def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at(296).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
    def _gtk_reserved4: CFuncPtr0[Unit] = !struct.at(304).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
    def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at(304).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
    def _gtk_reserved5: CFuncPtr0[Unit] = !struct.at(312).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
    def _gtk_reserved5_=(value: CFuncPtr0[Unit]): Unit = !struct.at(312).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkimcontextsimple.h
*/
opaque type _GtkIMContextSimple = CStruct2[GtkIMContext, Ptr[GtkIMContextSimplePrivate]]
object _GtkIMContextSimple:
  given _tag: Tag[_GtkIMContextSimple] = Tag.materializeCStruct2Tag[GtkIMContext, Ptr[GtkIMContextSimplePrivate]]
  def apply()(using Zone): Ptr[_GtkIMContextSimple] = scala.scalanative.unsafe.alloc[_GtkIMContextSimple](1)
  def apply(`object` : GtkIMContext, priv : Ptr[GtkIMContextSimplePrivate])(using Zone): Ptr[_GtkIMContextSimple] = 
    val ____ptr = apply()
    (!____ptr).`object` = `object`
    (!____ptr).priv = priv
    ____ptr
  extension (struct: _GtkIMContextSimple)
    def `object` : GtkIMContext = struct._1
    def object_=(value: GtkIMContext): Unit = !struct.at1 = value
    def priv : Ptr[GtkIMContextSimplePrivate] = struct._2
    def priv_=(value: Ptr[GtkIMContextSimplePrivate]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkimcontextsimple.h
*/
opaque type _GtkIMContextSimpleClass = CStruct1[GtkIMContextClass]
object _GtkIMContextSimpleClass:
  given _tag: Tag[_GtkIMContextSimpleClass] = Tag.materializeCStruct1Tag[GtkIMContextClass]
  def apply()(using Zone): Ptr[_GtkIMContextSimpleClass] = scala.scalanative.unsafe.alloc[_GtkIMContextSimpleClass](1)
  def apply(parent_class : GtkIMContextClass)(using Zone): Ptr[_GtkIMContextSimpleClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: _GtkIMContextSimpleClass)
    def parent_class : GtkIMContextClass = struct._1
    def parent_class_=(value: GtkIMContextClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkimcontextsimple.h
*/
opaque type _GtkIMContextSimplePrivate = CStruct0
object _GtkIMContextSimplePrivate:
  given _tag: Tag[_GtkIMContextSimplePrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkimmulticontext.h
*/
opaque type _GtkIMMulticontext = CStruct2[GtkIMContext, Ptr[GtkIMMulticontextPrivate]]
object _GtkIMMulticontext:
  given _tag: Tag[_GtkIMMulticontext] = Tag.materializeCStruct2Tag[GtkIMContext, Ptr[GtkIMMulticontextPrivate]]
  def apply()(using Zone): Ptr[_GtkIMMulticontext] = scala.scalanative.unsafe.alloc[_GtkIMMulticontext](1)
  def apply(`object` : GtkIMContext, priv : Ptr[GtkIMMulticontextPrivate])(using Zone): Ptr[_GtkIMMulticontext] = 
    val ____ptr = apply()
    (!____ptr).`object` = `object`
    (!____ptr).priv = priv
    ____ptr
  extension (struct: _GtkIMMulticontext)
    def `object` : GtkIMContext = struct._1
    def object_=(value: GtkIMContext): Unit = !struct.at1 = value
    def priv : Ptr[GtkIMMulticontextPrivate] = struct._2
    def priv_=(value: Ptr[GtkIMMulticontextPrivate]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkimmulticontext.h
*/
opaque type _GtkIMMulticontextClass = CStruct5[GtkIMContextClass, CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object _GtkIMMulticontextClass:
  given _tag: Tag[_GtkIMMulticontextClass] = Tag.materializeCStruct5Tag[GtkIMContextClass, CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[_GtkIMMulticontextClass] = scala.scalanative.unsafe.alloc[_GtkIMMulticontextClass](1)
  def apply(parent_class : GtkIMContextClass, _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[_GtkIMMulticontextClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    ____ptr
  extension (struct: _GtkIMMulticontextClass)
    def parent_class : GtkIMContextClass = struct._1
    def parent_class_=(value: GtkIMContextClass): Unit = !struct.at1 = value
    def _gtk_reserved1 : CFuncPtr0[Unit] = struct._2
    def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at2 = value
    def _gtk_reserved2 : CFuncPtr0[Unit] = struct._3
    def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at3 = value
    def _gtk_reserved3 : CFuncPtr0[Unit] = struct._4
    def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at4 = value
    def _gtk_reserved4 : CFuncPtr0[Unit] = struct._5
    def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at5 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkimmulticontext.h
*/
opaque type _GtkIMMulticontextPrivate = CStruct0
object _GtkIMMulticontextPrivate:
  given _tag: Tag[_GtkIMMulticontextPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkicontheme.h
*/
opaque type _GtkIconPaintable = CStruct0
object _GtkIconPaintable:
  given _tag: Tag[_GtkIconPaintable] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkicontheme.h
*/
opaque type _GtkIconTheme = CStruct0
object _GtkIconTheme:
  given _tag: Tag[_GtkIconTheme] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkiconview.h
*/
opaque type _GtkIconView = CStruct0
object _GtkIconView:
  given _tag: Tag[_GtkIconView] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkimage.h
*/
opaque type _GtkImage = CStruct0
object _GtkImage:
  given _tag: Tag[_GtkImage] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkinfobar.h
*/
opaque type _GtkInfoBar = CStruct0
object _GtkInfoBar:
  given _tag: Tag[_GtkInfoBar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type _GtkKeyvalTrigger = CStruct0
object _GtkKeyvalTrigger:
  given _tag: Tag[_GtkKeyvalTrigger] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type _GtkKeyvalTriggerClass = CStruct0
object _GtkKeyvalTriggerClass:
  given _tag: Tag[_GtkKeyvalTriggerClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklabel.h
*/
opaque type _GtkLabel = CStruct0
object _GtkLabel:
  given _tag: Tag[_GtkLabel] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklayoutchild.h
*/
opaque type _GtkLayoutChild = CStruct1[_root_.gobject.all.GObject]
object _GtkLayoutChild:
  given _tag: Tag[_GtkLayoutChild] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[_GtkLayoutChild] = scala.scalanative.unsafe.alloc[_GtkLayoutChild](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[_GtkLayoutChild] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkLayoutChild)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklayoutchild.h
*/
opaque type _GtkLayoutChildClass = CStruct1[_root_.gobject.all.GObjectClass]
object _GtkLayoutChildClass:
  given _tag: Tag[_GtkLayoutChildClass] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObjectClass]
  def apply()(using Zone): Ptr[_GtkLayoutChildClass] = scala.scalanative.unsafe.alloc[_GtkLayoutChildClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass)(using Zone): Ptr[_GtkLayoutChildClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: _GtkLayoutChildClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklayoutmanager.h
*/
opaque type _GtkLayoutManager = CStruct1[_root_.gobject.all.GObject]
object _GtkLayoutManager:
  given _tag: Tag[_GtkLayoutManager] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[_GtkLayoutManager] = scala.scalanative.unsafe.alloc[_GtkLayoutManager](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[_GtkLayoutManager] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkLayoutManager)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * GtkLayoutManagerClass: _request_mode: a virtual function, used to return the preferred request mode for the layout manager; for instance, "width for height" or "height for width"; see `GtkSizeRequestMode` : a virtual function, used to measure the minimum and preferred sizes of the widget using the layout manager for a given orientation : a virtual function, used to allocate the size of the widget using the layout manager _child_type: the type of `GtkLayoutChild` used by this layout manager _layout_child: a virtual function, used to create a `GtkLayoutChild` meta object for the layout properties : a virtual function, called when the widget using the layout manager is attached to a `GtkRoot` : a virtual function, called when the widget using the layout manager is detached from a `GtkRoot`

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklayoutmanager.h
*/
opaque type _GtkLayoutManagerClass = CStruct9[_root_.gobject.all.GObjectClass, CFuncPtr2[Ptr[GtkLayoutManager], Ptr[GtkWidget], GtkSizeRequestMode], CFuncPtr8[Ptr[GtkLayoutManager], Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkLayoutManager], Ptr[GtkWidget], CInt, CInt, CInt, Unit], _root_.gobject.all.GType, CFuncPtr3[Ptr[GtkLayoutManager], Ptr[GtkWidget], Ptr[GtkWidget], Ptr[GtkLayoutChild]], CFuncPtr1[Ptr[GtkLayoutManager], Unit], CFuncPtr1[Ptr[GtkLayoutManager], Unit], CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._6]]]
object _GtkLayoutManagerClass:
  given _tag: Tag[_GtkLayoutManagerClass] = Tag.materializeCStruct9Tag[_root_.gobject.all.GObjectClass, CFuncPtr2[Ptr[GtkLayoutManager], Ptr[GtkWidget], GtkSizeRequestMode], CFuncPtr8[Ptr[GtkLayoutManager], Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkLayoutManager], Ptr[GtkWidget], CInt, CInt, CInt, Unit], _root_.gobject.all.GType, CFuncPtr3[Ptr[GtkLayoutManager], Ptr[GtkWidget], Ptr[GtkWidget], Ptr[GtkLayoutChild]], CFuncPtr1[Ptr[GtkLayoutManager], Unit], CFuncPtr1[Ptr[GtkLayoutManager], Unit], CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._6]]]
  def apply()(using Zone): Ptr[_GtkLayoutManagerClass] = scala.scalanative.unsafe.alloc[_GtkLayoutManagerClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, get_request_mode : CFuncPtr2[Ptr[GtkLayoutManager], Ptr[GtkWidget], GtkSizeRequestMode], measure : CFuncPtr8[Ptr[GtkLayoutManager], Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit], allocate : CFuncPtr5[Ptr[GtkLayoutManager], Ptr[GtkWidget], CInt, CInt, CInt, Unit], layout_child_type : _root_.gobject.all.GType, create_layout_child : CFuncPtr3[Ptr[GtkLayoutManager], Ptr[GtkWidget], Ptr[GtkWidget], Ptr[GtkLayoutChild]], root : CFuncPtr1[Ptr[GtkLayoutManager], Unit], unroot : CFuncPtr1[Ptr[GtkLayoutManager], Unit], _padding : CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._6]])(using Zone): Ptr[_GtkLayoutManagerClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).get_request_mode = get_request_mode
    (!____ptr).measure = measure
    (!____ptr).allocate = allocate
    (!____ptr).layout_child_type = layout_child_type
    (!____ptr).create_layout_child = create_layout_child
    (!____ptr).root = root
    (!____ptr).unroot = unroot
    (!____ptr)._padding = _padding
    ____ptr
  extension (struct: _GtkLayoutManagerClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def get_request_mode : CFuncPtr2[Ptr[GtkLayoutManager], Ptr[GtkWidget], GtkSizeRequestMode] = struct._2
    def get_request_mode_=(value: CFuncPtr2[Ptr[GtkLayoutManager], Ptr[GtkWidget], GtkSizeRequestMode]): Unit = !struct.at2 = value
    def measure : CFuncPtr8[Ptr[GtkLayoutManager], Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit] = struct._3
    def measure_=(value: CFuncPtr8[Ptr[GtkLayoutManager], Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit]): Unit = !struct.at3 = value
    def allocate : CFuncPtr5[Ptr[GtkLayoutManager], Ptr[GtkWidget], CInt, CInt, CInt, Unit] = struct._4
    def allocate_=(value: CFuncPtr5[Ptr[GtkLayoutManager], Ptr[GtkWidget], CInt, CInt, CInt, Unit]): Unit = !struct.at4 = value
    def layout_child_type : _root_.gobject.all.GType = struct._5
    def layout_child_type_=(value: _root_.gobject.all.GType): Unit = !struct.at5 = value
    def create_layout_child : CFuncPtr3[Ptr[GtkLayoutManager], Ptr[GtkWidget], Ptr[GtkWidget], Ptr[GtkLayoutChild]] = struct._6
    def create_layout_child_=(value: CFuncPtr3[Ptr[GtkLayoutManager], Ptr[GtkWidget], Ptr[GtkWidget], Ptr[GtkLayoutChild]]): Unit = !struct.at6 = value
    def root : CFuncPtr1[Ptr[GtkLayoutManager], Unit] = struct._7
    def root_=(value: CFuncPtr1[Ptr[GtkLayoutManager], Unit]): Unit = !struct.at7 = value
    def unroot : CFuncPtr1[Ptr[GtkLayoutManager], Unit] = struct._8
    def unroot_=(value: CFuncPtr1[Ptr[GtkLayoutManager], Unit]): Unit = !struct.at8 = value
    def _padding : CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._6]] = struct._9
    def _padding_=(value: CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._6]]): Unit = !struct.at9 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklevelbar.h
*/
opaque type _GtkLevelBar = CStruct0
object _GtkLevelBar:
  given _tag: Tag[_GtkLevelBar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklinkbutton.h
*/
opaque type _GtkLinkButton = CStruct0
object _GtkLinkButton:
  given _tag: Tag[_GtkLinkButton] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistbase.h
*/
opaque type _GtkListBase = CStruct0
object _GtkListBase:
  given _tag: Tag[_GtkListBase] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistbase.h
*/
opaque type _GtkListBaseClass = CStruct0
object _GtkListBaseClass:
  given _tag: Tag[_GtkListBaseClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistbox.h
*/
opaque type _GtkListBox = CStruct0
object _GtkListBox:
  given _tag: Tag[_GtkListBox] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistbox.h
*/
opaque type _GtkListBoxRow = CStruct1[GtkWidget]
object _GtkListBoxRow:
  given _tag: Tag[_GtkListBoxRow] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[_GtkListBoxRow] = scala.scalanative.unsafe.alloc[_GtkListBoxRow](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[_GtkListBoxRow] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkListBoxRow)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * GtkListBoxRowClass: _class: The parent class. :

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistbox.h
*/
opaque type _GtkListBoxRowClass = CStruct3[GtkWidgetClass, CFuncPtr1[Ptr[GtkListBoxRow], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkListBoxRowClass:
  given _tag: Tag[_GtkListBoxRowClass] = Tag.materializeCStruct3Tag[GtkWidgetClass, CFuncPtr1[Ptr[GtkListBoxRow], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkListBoxRowClass] = scala.scalanative.unsafe.alloc[_GtkListBoxRowClass](1)
  def apply(parent_class : GtkWidgetClass, activate : CFuncPtr1[Ptr[GtkListBoxRow], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkListBoxRowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).activate = activate
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkListBoxRowClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def activate : CFuncPtr1[Ptr[GtkListBoxRow], Unit] = struct._2
    def activate_=(value: CFuncPtr1[Ptr[GtkListBoxRow], Unit]): Unit = !struct.at2 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._3
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
opaque type _GtkListItem = CStruct0
object _GtkListItem:
  given _tag: Tag[_GtkListItem] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistitem.h
*/
opaque type _GtkListItemClass = CStruct0
object _GtkListItemClass:
  given _tag: Tag[_GtkListItemClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
opaque type _GtkListItemFactory = CStruct0
object _GtkListItemFactory:
  given _tag: Tag[_GtkListItemFactory] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistitemfactory.h
*/
opaque type _GtkListItemFactoryClass = CStruct0
object _GtkListItemFactoryClass:
  given _tag: Tag[_GtkListItemFactoryClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkliststore.h
*/
opaque type _GtkListStore = CStruct2[_root_.gobject.all.GObject, Ptr[GtkListStorePrivate]]
object _GtkListStore:
  given _tag: Tag[_GtkListStore] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObject, Ptr[GtkListStorePrivate]]
  def apply()(using Zone): Ptr[_GtkListStore] = scala.scalanative.unsafe.alloc[_GtkListStore](1)
  def apply(parent : _root_.gobject.all.GObject, priv : Ptr[GtkListStorePrivate])(using Zone): Ptr[_GtkListStore] = 
    val ____ptr = apply()
    (!____ptr).parent = parent
    (!____ptr).priv = priv
    ____ptr
  extension (struct: _GtkListStore)
    def parent : _root_.gobject.all.GObject = struct._1
    def parent_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value
    def priv : Ptr[GtkListStorePrivate] = struct._2
    def priv_=(value: Ptr[GtkListStorePrivate]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkliststore.h
*/
opaque type _GtkListStoreClass = CStruct2[_root_.gobject.all.GObjectClass, CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkListStoreClass:
  given _tag: Tag[_GtkListStoreClass] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObjectClass, CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkListStoreClass] = scala.scalanative.unsafe.alloc[_GtkListStoreClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkListStoreClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkListStoreClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._2
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkliststore.h
*/
opaque type _GtkListStorePrivate = CStruct0
object _GtkListStorePrivate:
  given _tag: Tag[_GtkListStorePrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistview.h
*/
opaque type _GtkListView = CStruct0
object _GtkListView:
  given _tag: Tag[_GtkListView] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklistview.h
*/
opaque type _GtkListViewClass = CStruct0
object _GtkListViewClass:
  given _tag: Tag[_GtkListViewClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtklockbutton.h
*/
opaque type _GtkLockButton = CStruct0
object _GtkLockButton:
  given _tag: Tag[_GtkLockButton] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmaplistmodel.h
*/
opaque type _GtkMapListModel = CStruct0
object _GtkMapListModel:
  given _tag: Tag[_GtkMapListModel] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediacontrols.h
*/
opaque type _GtkMediaControls = CStruct0
object _GtkMediaControls:
  given _tag: Tag[_GtkMediaControls] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediafile.h
*/
opaque type _GtkMediaFile = CStruct1[GtkMediaStream]
object _GtkMediaFile:
  given _tag: Tag[_GtkMediaFile] = Tag.materializeCStruct1Tag[GtkMediaStream]
  def apply()(using Zone): Ptr[_GtkMediaFile] = scala.scalanative.unsafe.alloc[_GtkMediaFile](1)
  def apply(parent_instance : GtkMediaStream)(using Zone): Ptr[_GtkMediaFile] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkMediaFile)
    def parent_instance : GtkMediaStream = struct._1
    def parent_instance_=(value: GtkMediaStream): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediafile.h
*/
opaque type _GtkMediaFileClass = CStruct7[GtkMediaStreamClass, CFuncPtr1[Ptr[GtkMediaFile], Unit], CFuncPtr1[Ptr[GtkMediaFile], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object _GtkMediaFileClass:
  given _tag: Tag[_GtkMediaFileClass] = Tag.materializeCStruct7Tag[GtkMediaStreamClass, CFuncPtr1[Ptr[GtkMediaFile], Unit], CFuncPtr1[Ptr[GtkMediaFile], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[_GtkMediaFileClass] = scala.scalanative.unsafe.alloc[_GtkMediaFileClass](1)
  def apply(parent_class : GtkMediaStreamClass, open : CFuncPtr1[Ptr[GtkMediaFile], Unit], close : CFuncPtr1[Ptr[GtkMediaFile], Unit], _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[_GtkMediaFileClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).open = open
    (!____ptr).close = close
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    ____ptr
  extension (struct: _GtkMediaFileClass)
    def parent_class : GtkMediaStreamClass = struct._1
    def parent_class_=(value: GtkMediaStreamClass): Unit = !struct.at1 = value
    def open : CFuncPtr1[Ptr[GtkMediaFile], Unit] = struct._2
    def open_=(value: CFuncPtr1[Ptr[GtkMediaFile], Unit]): Unit = !struct.at2 = value
    def close : CFuncPtr1[Ptr[GtkMediaFile], Unit] = struct._3
    def close_=(value: CFuncPtr1[Ptr[GtkMediaFile], Unit]): Unit = !struct.at3 = value
    def _gtk_reserved1 : CFuncPtr0[Unit] = struct._4
    def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at4 = value
    def _gtk_reserved2 : CFuncPtr0[Unit] = struct._5
    def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at5 = value
    def _gtk_reserved3 : CFuncPtr0[Unit] = struct._6
    def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at6 = value
    def _gtk_reserved4 : CFuncPtr0[Unit] = struct._7
    def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at7 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediastream.h
*/
opaque type _GtkMediaStream = CStruct1[_root_.gobject.all.GObject]
object _GtkMediaStream:
  given _tag: Tag[_GtkMediaStream] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[_GtkMediaStream] = scala.scalanative.unsafe.alloc[_GtkMediaStream](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[_GtkMediaStream] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkMediaStream)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmediastream.h
*/
opaque type _GtkMediaStreamClass = CStruct15[_root_.gobject.all.GObjectClass, CFuncPtr1[Ptr[GtkMediaStream], _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkMediaStream], Unit], CFuncPtr2[Ptr[GtkMediaStream], _root_.glib.all.gint64, Unit], CFuncPtr3[Ptr[GtkMediaStream], _root_.glib.all.gboolean, Double, Unit], CFuncPtr2[Ptr[GtkMediaStream], Ptr[GdkSurface], Unit], CFuncPtr2[Ptr[GtkMediaStream], Ptr[GdkSurface], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object _GtkMediaStreamClass:
  given _tag: Tag[_GtkMediaStreamClass] = Tag.materializeCStruct15Tag[_root_.gobject.all.GObjectClass, CFuncPtr1[Ptr[GtkMediaStream], _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkMediaStream], Unit], CFuncPtr2[Ptr[GtkMediaStream], _root_.glib.all.gint64, Unit], CFuncPtr3[Ptr[GtkMediaStream], _root_.glib.all.gboolean, Double, Unit], CFuncPtr2[Ptr[GtkMediaStream], Ptr[GdkSurface], Unit], CFuncPtr2[Ptr[GtkMediaStream], Ptr[GdkSurface], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[_GtkMediaStreamClass] = scala.scalanative.unsafe.alloc[_GtkMediaStreamClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, play : CFuncPtr1[Ptr[GtkMediaStream], _root_.glib.all.gboolean], pause : CFuncPtr1[Ptr[GtkMediaStream], Unit], seek : CFuncPtr2[Ptr[GtkMediaStream], _root_.glib.all.gint64, Unit], update_audio : CFuncPtr3[Ptr[GtkMediaStream], _root_.glib.all.gboolean, Double, Unit], realize : CFuncPtr2[Ptr[GtkMediaStream], Ptr[GdkSurface], Unit], unrealize : CFuncPtr2[Ptr[GtkMediaStream], Ptr[GdkSurface], Unit], _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit], _gtk_reserved5 : CFuncPtr0[Unit], _gtk_reserved6 : CFuncPtr0[Unit], _gtk_reserved7 : CFuncPtr0[Unit], _gtk_reserved8 : CFuncPtr0[Unit])(using Zone): Ptr[_GtkMediaStreamClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).play = play
    (!____ptr).pause = pause
    (!____ptr).seek = seek
    (!____ptr).update_audio = update_audio
    (!____ptr).realize = realize
    (!____ptr).unrealize = unrealize
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    (!____ptr)._gtk_reserved5 = _gtk_reserved5
    (!____ptr)._gtk_reserved6 = _gtk_reserved6
    (!____ptr)._gtk_reserved7 = _gtk_reserved7
    (!____ptr)._gtk_reserved8 = _gtk_reserved8
    ____ptr
  extension (struct: _GtkMediaStreamClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def play : CFuncPtr1[Ptr[GtkMediaStream], _root_.glib.all.gboolean] = struct._2
    def play_=(value: CFuncPtr1[Ptr[GtkMediaStream], _root_.glib.all.gboolean]): Unit = !struct.at2 = value
    def pause : CFuncPtr1[Ptr[GtkMediaStream], Unit] = struct._3
    def pause_=(value: CFuncPtr1[Ptr[GtkMediaStream], Unit]): Unit = !struct.at3 = value
    def seek : CFuncPtr2[Ptr[GtkMediaStream], _root_.glib.all.gint64, Unit] = struct._4
    def seek_=(value: CFuncPtr2[Ptr[GtkMediaStream], _root_.glib.all.gint64, Unit]): Unit = !struct.at4 = value
    def update_audio : CFuncPtr3[Ptr[GtkMediaStream], _root_.glib.all.gboolean, Double, Unit] = struct._5
    def update_audio_=(value: CFuncPtr3[Ptr[GtkMediaStream], _root_.glib.all.gboolean, Double, Unit]): Unit = !struct.at5 = value
    def realize : CFuncPtr2[Ptr[GtkMediaStream], Ptr[GdkSurface], Unit] = struct._6
    def realize_=(value: CFuncPtr2[Ptr[GtkMediaStream], Ptr[GdkSurface], Unit]): Unit = !struct.at6 = value
    def unrealize : CFuncPtr2[Ptr[GtkMediaStream], Ptr[GdkSurface], Unit] = struct._7
    def unrealize_=(value: CFuncPtr2[Ptr[GtkMediaStream], Ptr[GdkSurface], Unit]): Unit = !struct.at7 = value
    def _gtk_reserved1 : CFuncPtr0[Unit] = struct._8
    def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at8 = value
    def _gtk_reserved2 : CFuncPtr0[Unit] = struct._9
    def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at9 = value
    def _gtk_reserved3 : CFuncPtr0[Unit] = struct._10
    def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at10 = value
    def _gtk_reserved4 : CFuncPtr0[Unit] = struct._11
    def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at11 = value
    def _gtk_reserved5 : CFuncPtr0[Unit] = struct._12
    def _gtk_reserved5_=(value: CFuncPtr0[Unit]): Unit = !struct.at12 = value
    def _gtk_reserved6 : CFuncPtr0[Unit] = struct._13
    def _gtk_reserved6_=(value: CFuncPtr0[Unit]): Unit = !struct.at13 = value
    def _gtk_reserved7 : CFuncPtr0[Unit] = struct._14
    def _gtk_reserved7_=(value: CFuncPtr0[Unit]): Unit = !struct.at14 = value
    def _gtk_reserved8 : CFuncPtr0[Unit] = struct._15
    def _gtk_reserved8_=(value: CFuncPtr0[Unit]): Unit = !struct.at15 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmenubutton.h
*/
opaque type _GtkMenuButton = CStruct0
object _GtkMenuButton:
  given _tag: Tag[_GtkMenuButton] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmessagedialog.h
*/
opaque type _GtkMessageDialog = CStruct1[GtkDialog]
object _GtkMessageDialog:
  given _tag: Tag[_GtkMessageDialog] = Tag.materializeCStruct1Tag[GtkDialog]
  def apply()(using Zone): Ptr[_GtkMessageDialog] = scala.scalanative.unsafe.alloc[_GtkMessageDialog](1)
  def apply(parent_instance : GtkDialog)(using Zone): Ptr[_GtkMessageDialog] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkMessageDialog)
    def parent_instance : GtkDialog = struct._1
    def parent_instance_=(value: GtkDialog): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmessagedialog.h
*/
opaque type _GtkMessageDialogClass = CStruct0
object _GtkMessageDialogClass:
  given _tag: Tag[_GtkMessageDialogClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type _GtkMnemonicAction = CStruct0
object _GtkMnemonicAction:
  given _tag: Tag[_GtkMnemonicAction] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type _GtkMnemonicActionClass = CStruct0
object _GtkMnemonicActionClass:
  given _tag: Tag[_GtkMnemonicActionClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type _GtkMnemonicTrigger = CStruct0
object _GtkMnemonicTrigger:
  given _tag: Tag[_GtkMnemonicTrigger] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type _GtkMnemonicTriggerClass = CStruct0
object _GtkMnemonicTriggerClass:
  given _tag: Tag[_GtkMnemonicTriggerClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmountoperation.h
*/
opaque type _GtkMountOperation = CStruct2[_root_.gio.all.GMountOperation, Ptr[GtkMountOperationPrivate]]
object _GtkMountOperation:
  given _tag: Tag[_GtkMountOperation] = Tag.materializeCStruct2Tag[_root_.gio.all.GMountOperation, Ptr[GtkMountOperationPrivate]]
  def apply()(using Zone): Ptr[_GtkMountOperation] = scala.scalanative.unsafe.alloc[_GtkMountOperation](1)
  def apply(parent_instance : _root_.gio.all.GMountOperation, priv : Ptr[GtkMountOperationPrivate])(using Zone): Ptr[_GtkMountOperation] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr
  extension (struct: _GtkMountOperation)
    def parent_instance : _root_.gio.all.GMountOperation = struct._1
    def parent_instance_=(value: _root_.gio.all.GMountOperation): Unit = !struct.at1 = value
    def priv : Ptr[GtkMountOperationPrivate] = struct._2
    def priv_=(value: Ptr[GtkMountOperationPrivate]): Unit = !struct.at2 = value

/**
 * GtkMountOperationClass: _class: The parent class.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmountoperation.h
*/
opaque type _GtkMountOperationClass = CStruct5[_root_.gio.all.GMountOperationClass, CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object _GtkMountOperationClass:
  given _tag: Tag[_GtkMountOperationClass] = Tag.materializeCStruct5Tag[_root_.gio.all.GMountOperationClass, CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[_GtkMountOperationClass] = scala.scalanative.unsafe.alloc[_GtkMountOperationClass](1)
  def apply(parent_class : _root_.gio.all.GMountOperationClass, _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[_GtkMountOperationClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    ____ptr
  extension (struct: _GtkMountOperationClass)
    def parent_class : _root_.gio.all.GMountOperationClass = struct._1
    def parent_class_=(value: _root_.gio.all.GMountOperationClass): Unit = !struct.at1 = value
    def _gtk_reserved1 : CFuncPtr0[Unit] = struct._2
    def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at2 = value
    def _gtk_reserved2 : CFuncPtr0[Unit] = struct._3
    def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at3 = value
    def _gtk_reserved3 : CFuncPtr0[Unit] = struct._4
    def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at4 = value
    def _gtk_reserved4 : CFuncPtr0[Unit] = struct._5
    def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at5 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmountoperation.h
*/
opaque type _GtkMountOperationPrivate = CStruct0
object _GtkMountOperationPrivate:
  given _tag: Tag[_GtkMountOperationPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type _GtkMultiFilter = CStruct0
object _GtkMultiFilter:
  given _tag: Tag[_GtkMultiFilter] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultifilter.h
*/
opaque type _GtkMultiFilterClass = CStruct0
object _GtkMultiFilterClass:
  given _tag: Tag[_GtkMultiFilterClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultiselection.h
*/
opaque type _GtkMultiSelection = CStruct0
object _GtkMultiSelection:
  given _tag: Tag[_GtkMultiSelection] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkmultisorter.h
*/
opaque type _GtkMultiSorter = CStruct0
object _GtkMultiSorter:
  given _tag: Tag[_GtkMultiSorter] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type _GtkNamedAction = CStruct0
object _GtkNamedAction:
  given _tag: Tag[_GtkNamedAction] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type _GtkNamedActionClass = CStruct0
object _GtkNamedActionClass:
  given _tag: Tag[_GtkNamedActionClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
opaque type _GtkNative = CStruct0
object _GtkNative:
  given _tag: Tag[_GtkNative] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknativedialog.h
*/
opaque type _GtkNativeDialog = CStruct1[_root_.gobject.all.GObject]
object _GtkNativeDialog:
  given _tag: Tag[_GtkNativeDialog] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[_GtkNativeDialog] = scala.scalanative.unsafe.alloc[_GtkNativeDialog](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[_GtkNativeDialog] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkNativeDialog)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * GtkNativeDialogClass: : class handler for the `GtkNativeDialog::response` signal

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknativedialog.h
*/
opaque type _GtkNativeDialogClass = CStruct8[_root_.gobject.all.GObjectClass, CFuncPtr2[Ptr[GtkNativeDialog], CInt, Unit], CFuncPtr1[Ptr[GtkNativeDialog], Unit], CFuncPtr1[Ptr[GtkNativeDialog], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object _GtkNativeDialogClass:
  given _tag: Tag[_GtkNativeDialogClass] = Tag.materializeCStruct8Tag[_root_.gobject.all.GObjectClass, CFuncPtr2[Ptr[GtkNativeDialog], CInt, Unit], CFuncPtr1[Ptr[GtkNativeDialog], Unit], CFuncPtr1[Ptr[GtkNativeDialog], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[_GtkNativeDialogClass] = scala.scalanative.unsafe.alloc[_GtkNativeDialogClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, response : CFuncPtr2[Ptr[GtkNativeDialog], CInt, Unit], show : CFuncPtr1[Ptr[GtkNativeDialog], Unit], hide : CFuncPtr1[Ptr[GtkNativeDialog], Unit], _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[_GtkNativeDialogClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).response = response
    (!____ptr).show = show
    (!____ptr).hide = hide
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    ____ptr
  extension (struct: _GtkNativeDialogClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def response : CFuncPtr2[Ptr[GtkNativeDialog], CInt, Unit] = struct._2
    def response_=(value: CFuncPtr2[Ptr[GtkNativeDialog], CInt, Unit]): Unit = !struct.at2 = value
    def show : CFuncPtr1[Ptr[GtkNativeDialog], Unit] = struct._3
    def show_=(value: CFuncPtr1[Ptr[GtkNativeDialog], Unit]): Unit = !struct.at3 = value
    def hide : CFuncPtr1[Ptr[GtkNativeDialog], Unit] = struct._4
    def hide_=(value: CFuncPtr1[Ptr[GtkNativeDialog], Unit]): Unit = !struct.at4 = value
    def _gtk_reserved1 : CFuncPtr0[Unit] = struct._5
    def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at5 = value
    def _gtk_reserved2 : CFuncPtr0[Unit] = struct._6
    def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at6 = value
    def _gtk_reserved3 : CFuncPtr0[Unit] = struct._7
    def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at7 = value
    def _gtk_reserved4 : CFuncPtr0[Unit] = struct._8
    def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at8 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknative.h
*/
opaque type _GtkNativeInterface = CStruct0
object _GtkNativeInterface:
  given _tag: Tag[_GtkNativeInterface] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type _GtkNeverTrigger = CStruct0
object _GtkNeverTrigger:
  given _tag: Tag[_GtkNeverTrigger] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type _GtkNeverTriggerClass = CStruct0
object _GtkNeverTriggerClass:
  given _tag: Tag[_GtkNeverTriggerClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknoselection.h
*/
opaque type _GtkNoSelection = CStruct0
object _GtkNoSelection:
  given _tag: Tag[_GtkNoSelection] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknotebook.h
*/
opaque type _GtkNotebook = CStruct0
object _GtkNotebook:
  given _tag: Tag[_GtkNotebook] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknotebook.h
*/
opaque type _GtkNotebookPage = CStruct0
object _GtkNotebookPage:
  given _tag: Tag[_GtkNotebookPage] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type _GtkNothingAction = CStruct0
object _GtkNothingAction:
  given _tag: Tag[_GtkNothingAction] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type _GtkNothingActionClass = CStruct0
object _GtkNothingActionClass:
  given _tag: Tag[_GtkNothingActionClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtknumericsorter.h
*/
opaque type _GtkNumericSorter = CStruct0
object _GtkNumericSorter:
  given _tag: Tag[_GtkNumericSorter] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkexpression.h
*/
opaque type _GtkObjectExpression = CStruct0
object _GtkObjectExpression:
  given _tag: Tag[_GtkObjectExpression] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkorientable.h
*/
opaque type _GtkOrientable = CStruct0
object _GtkOrientable:
  given _tag: Tag[_GtkOrientable] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkorientable.h
*/
opaque type _GtkOrientableIface = CStruct1[_root_.gobject.all.GTypeInterface]
object _GtkOrientableIface:
  given _tag: Tag[_GtkOrientableIface] = Tag.materializeCStruct1Tag[_root_.gobject.all.GTypeInterface]
  def apply()(using Zone): Ptr[_GtkOrientableIface] = scala.scalanative.unsafe.alloc[_GtkOrientableIface](1)
  def apply(base_iface : _root_.gobject.all.GTypeInterface)(using Zone): Ptr[_GtkOrientableIface] = 
    val ____ptr = apply()
    (!____ptr).base_iface = base_iface
    ____ptr
  extension (struct: _GtkOrientableIface)
    def base_iface : _root_.gobject.all.GTypeInterface = struct._1
    def base_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkoverlay.h
*/
opaque type _GtkOverlay = CStruct0
object _GtkOverlay:
  given _tag: Tag[_GtkOverlay] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkoverlaylayout.h
*/
opaque type _GtkOverlayLayout = CStruct0
object _GtkOverlayLayout:
  given _tag: Tag[_GtkOverlayLayout] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkoverlaylayout.h
*/
opaque type _GtkOverlayLayoutChild = CStruct0
object _GtkOverlayLayoutChild:
  given _tag: Tag[_GtkOverlayLayoutChild] = Tag.materializeCStruct0Tag

/**
 * GtkPadActionEntry: : the type of pad feature that will trigger this action entry. : the 0-indexed button/ring/strip number that will trigger this action entry.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpadcontroller.h
*/
opaque type _GtkPadActionEntry = CStruct5[GtkPadActionType, CInt, CInt, CString, CString]
object _GtkPadActionEntry:
  given _tag: Tag[_GtkPadActionEntry] = Tag.materializeCStruct5Tag[GtkPadActionType, CInt, CInt, CString, CString]
  def apply()(using Zone): Ptr[_GtkPadActionEntry] = scala.scalanative.unsafe.alloc[_GtkPadActionEntry](1)
  def apply(`type` : GtkPadActionType, index : CInt, mode : CInt, label : CString, action_name : CString)(using Zone): Ptr[_GtkPadActionEntry] = 
    val ____ptr = apply()
    (!____ptr).`type` = `type`
    (!____ptr).index = index
    (!____ptr).mode = mode
    (!____ptr).label = label
    (!____ptr).action_name = action_name
    ____ptr
  extension (struct: _GtkPadActionEntry)
    def `type` : GtkPadActionType = struct._1
    def type_=(value: GtkPadActionType): Unit = !struct.at1 = value
    def index : CInt = struct._2
    def index_=(value: CInt): Unit = !struct.at2 = value
    def mode : CInt = struct._3
    def mode_=(value: CInt): Unit = !struct.at3 = value
    def label : CString = struct._4
    def label_=(value: CString): Unit = !struct.at4 = value
    def action_name : CString = struct._5
    def action_name_=(value: CString): Unit = !struct.at5 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpadcontroller.h
*/
opaque type _GtkPadController = CStruct0
object _GtkPadController:
  given _tag: Tag[_GtkPadController] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpadcontroller.h
*/
opaque type _GtkPadControllerClass = CStruct0
object _GtkPadControllerClass:
  given _tag: Tag[_GtkPadControllerClass] = Tag.materializeCStruct0Tag

/**
 * GtkPageRange: : start of page range. : end of page range.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkprintsettings.h
*/
opaque type _GtkPageRange = CStruct2[CInt, CInt]
object _GtkPageRange:
  given _tag: Tag[_GtkPageRange] = Tag.materializeCStruct2Tag[CInt, CInt]
  def apply()(using Zone): Ptr[_GtkPageRange] = scala.scalanative.unsafe.alloc[_GtkPageRange](1)
  def apply(start : CInt, end : CInt)(using Zone): Ptr[_GtkPageRange] = 
    val ____ptr = apply()
    (!____ptr).start = start
    (!____ptr).end = end
    ____ptr
  extension (struct: _GtkPageRange)
    def start : CInt = struct._1
    def start_=(value: CInt): Unit = !struct.at1 = value
    def end : CInt = struct._2
    def end_=(value: CInt): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpagesetup.h
*/
opaque type _GtkPageSetup = CStruct0
object _GtkPageSetup:
  given _tag: Tag[_GtkPageSetup] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpaned.h
*/
opaque type _GtkPaned = CStruct0
object _GtkPaned:
  given _tag: Tag[_GtkPaned] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpapersize.h
*/
opaque type _GtkPaperSize = CStruct0
object _GtkPaperSize:
  given _tag: Tag[_GtkPaperSize] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpasswordentry.h
*/
opaque type _GtkPasswordEntry = CStruct0
object _GtkPasswordEntry:
  given _tag: Tag[_GtkPasswordEntry] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpasswordentrybuffer.h
*/
opaque type _GtkPasswordEntryBuffer = CStruct0
object _GtkPasswordEntryBuffer:
  given _tag: Tag[_GtkPasswordEntryBuffer] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpasswordentry.h
*/
opaque type _GtkPasswordEntryClass = CStruct0
object _GtkPasswordEntryClass:
  given _tag: Tag[_GtkPasswordEntryClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpicture.h
*/
opaque type _GtkPicture = CStruct0
object _GtkPicture:
  given _tag: Tag[_GtkPicture] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpopover.h
*/
opaque type _GtkPopover = CStruct1[GtkWidget]
object _GtkPopover:
  given _tag: Tag[_GtkPopover] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[_GtkPopover] = scala.scalanative.unsafe.alloc[_GtkPopover](1)
  def apply(parent : GtkWidget)(using Zone): Ptr[_GtkPopover] = 
    val ____ptr = apply()
    (!____ptr).parent = parent
    ____ptr
  extension (struct: _GtkPopover)
    def parent : GtkWidget = struct._1
    def parent_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpopover.h
*/
opaque type _GtkPopoverClass = CStruct4[GtkWidgetClass, CFuncPtr1[Ptr[GtkPopover], Unit], CFuncPtr1[Ptr[GtkPopover], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkPopoverClass:
  given _tag: Tag[_GtkPopoverClass] = Tag.materializeCStruct4Tag[GtkWidgetClass, CFuncPtr1[Ptr[GtkPopover], Unit], CFuncPtr1[Ptr[GtkPopover], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkPopoverClass] = scala.scalanative.unsafe.alloc[_GtkPopoverClass](1)
  def apply(parent_class : GtkWidgetClass, closed : CFuncPtr1[Ptr[GtkPopover], Unit], activate_default : CFuncPtr1[Ptr[GtkPopover], Unit], reserved : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkPopoverClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).closed = closed
    (!____ptr).activate_default = activate_default
    (!____ptr).reserved = reserved
    ____ptr
  extension (struct: _GtkPopoverClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def closed : CFuncPtr1[Ptr[GtkPopover], Unit] = struct._2
    def closed_=(value: CFuncPtr1[Ptr[GtkPopover], Unit]): Unit = !struct.at2 = value
    def activate_default : CFuncPtr1[Ptr[GtkPopover], Unit] = struct._3
    def activate_default_=(value: CFuncPtr1[Ptr[GtkPopover], Unit]): Unit = !struct.at3 = value
    def reserved : CArray[_root_.glib.all.gpointer, Nat._8] = struct._4
    def reserved_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at4 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpopovermenu.h
*/
opaque type _GtkPopoverMenu = CStruct0
object _GtkPopoverMenu:
  given _tag: Tag[_GtkPopoverMenu] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkpopovermenubar.h
*/
opaque type _GtkPopoverMenuBar = CStruct0
object _GtkPopoverMenuBar:
  given _tag: Tag[_GtkPopoverMenuBar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkprintcontext.h
*/
opaque type _GtkPrintContext = CStruct0
object _GtkPrintContext:
  given _tag: Tag[_GtkPrintContext] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkprintoperation.h
*/
opaque type _GtkPrintOperation = CStruct2[_root_.gobject.all.GObject, Ptr[GtkPrintOperationPrivate]]
object _GtkPrintOperation:
  given _tag: Tag[_GtkPrintOperation] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObject, Ptr[GtkPrintOperationPrivate]]
  def apply()(using Zone): Ptr[_GtkPrintOperation] = scala.scalanative.unsafe.alloc[_GtkPrintOperation](1)
  def apply(parent_instance : _root_.gobject.all.GObject, priv : Ptr[GtkPrintOperationPrivate])(using Zone): Ptr[_GtkPrintOperation] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr
  extension (struct: _GtkPrintOperation)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value
    def priv : Ptr[GtkPrintOperationPrivate] = struct._2
    def priv_=(value: Ptr[GtkPrintOperationPrivate]): Unit = !struct.at2 = value

/**
 * GtkPrintOperationClass: _class: The parent class. : Signal emitted when the print operation run has finished doing everything required for printing. _print: Signal emitted after the user has finished changing print settings in the dialog, before the actual rendering starts. : Signal emitted after the “begin-print” signal, but before the actual rendering starts. _page_setup: Emitted once for every page that is printed, to give the application a chance to modify the page setup. _page: Signal emitted for every page that is printed. _print: Signal emitted after all pages have been rendered. _changed: Emitted at between the various phases of the print operation. _custom_widget: Signal emitted when displaying the print dialog. _widget_apply: Signal emitted right before “begin-print” if you added a custom widget in the “create-custom-widget” handler. : Signal emitted when a preview is requested from the native dialog. _custom_widget: Emitted after change of selected printer.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkprintoperation.h
*/
opaque type _GtkPrintOperationClass = CStruct13[_root_.gobject.all.GObjectClass, CFuncPtr2[Ptr[GtkPrintOperation], GtkPrintOperationResult, Unit], CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], Unit], CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], _root_.glib.all.gboolean], CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], CInt, Ptr[GtkPageSetup], Unit], CFuncPtr3[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], CInt, Unit], CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], Unit], CFuncPtr1[Ptr[GtkPrintOperation], Unit], CFuncPtr1[Ptr[GtkPrintOperation], Ptr[GtkWidget]], CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkWidget], Unit], CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Ptr[GtkWindow], _root_.glib.all.gboolean], CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkWidget], Ptr[GtkPageSetup], Ptr[GtkPrintSettings], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkPrintOperationClass:
  given _tag: Tag[_GtkPrintOperationClass] = Tag.materializeCStruct13Tag[_root_.gobject.all.GObjectClass, CFuncPtr2[Ptr[GtkPrintOperation], GtkPrintOperationResult, Unit], CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], Unit], CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], _root_.glib.all.gboolean], CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], CInt, Ptr[GtkPageSetup], Unit], CFuncPtr3[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], CInt, Unit], CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], Unit], CFuncPtr1[Ptr[GtkPrintOperation], Unit], CFuncPtr1[Ptr[GtkPrintOperation], Ptr[GtkWidget]], CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkWidget], Unit], CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Ptr[GtkWindow], _root_.glib.all.gboolean], CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkWidget], Ptr[GtkPageSetup], Ptr[GtkPrintSettings], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkPrintOperationClass] = scala.scalanative.unsafe.alloc[_GtkPrintOperationClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, done : CFuncPtr2[Ptr[GtkPrintOperation], GtkPrintOperationResult, Unit], begin_print : CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], Unit], paginate : CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], _root_.glib.all.gboolean], request_page_setup : CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], CInt, Ptr[GtkPageSetup], Unit], draw_page : CFuncPtr3[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], CInt, Unit], end_print : CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], Unit], status_changed : CFuncPtr1[Ptr[GtkPrintOperation], Unit], create_custom_widget : CFuncPtr1[Ptr[GtkPrintOperation], Ptr[GtkWidget]], custom_widget_apply : CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkWidget], Unit], preview : CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Ptr[GtkWindow], _root_.glib.all.gboolean], update_custom_widget : CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkWidget], Ptr[GtkPageSetup], Ptr[GtkPrintSettings], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkPrintOperationClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).done = done
    (!____ptr).begin_print = begin_print
    (!____ptr).paginate = paginate
    (!____ptr).request_page_setup = request_page_setup
    (!____ptr).draw_page = draw_page
    (!____ptr).end_print = end_print
    (!____ptr).status_changed = status_changed
    (!____ptr).create_custom_widget = create_custom_widget
    (!____ptr).custom_widget_apply = custom_widget_apply
    (!____ptr).preview = preview
    (!____ptr).update_custom_widget = update_custom_widget
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkPrintOperationClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def done : CFuncPtr2[Ptr[GtkPrintOperation], GtkPrintOperationResult, Unit] = struct._2
    def done_=(value: CFuncPtr2[Ptr[GtkPrintOperation], GtkPrintOperationResult, Unit]): Unit = !struct.at2 = value
    def begin_print : CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], Unit] = struct._3
    def begin_print_=(value: CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], Unit]): Unit = !struct.at3 = value
    def paginate : CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], _root_.glib.all.gboolean] = struct._4
    def paginate_=(value: CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], _root_.glib.all.gboolean]): Unit = !struct.at4 = value
    def request_page_setup : CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], CInt, Ptr[GtkPageSetup], Unit] = struct._5
    def request_page_setup_=(value: CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], CInt, Ptr[GtkPageSetup], Unit]): Unit = !struct.at5 = value
    def draw_page : CFuncPtr3[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], CInt, Unit] = struct._6
    def draw_page_=(value: CFuncPtr3[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], CInt, Unit]): Unit = !struct.at6 = value
    def end_print : CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], Unit] = struct._7
    def end_print_=(value: CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], Unit]): Unit = !struct.at7 = value
    def status_changed : CFuncPtr1[Ptr[GtkPrintOperation], Unit] = struct._8
    def status_changed_=(value: CFuncPtr1[Ptr[GtkPrintOperation], Unit]): Unit = !struct.at8 = value
    def create_custom_widget : CFuncPtr1[Ptr[GtkPrintOperation], Ptr[GtkWidget]] = struct._9
    def create_custom_widget_=(value: CFuncPtr1[Ptr[GtkPrintOperation], Ptr[GtkWidget]]): Unit = !struct.at9 = value
    def custom_widget_apply : CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkWidget], Unit] = struct._10
    def custom_widget_apply_=(value: CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkWidget], Unit]): Unit = !struct.at10 = value
    def preview : CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Ptr[GtkWindow], _root_.glib.all.gboolean] = struct._11
    def preview_=(value: CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Ptr[GtkWindow], _root_.glib.all.gboolean]): Unit = !struct.at11 = value
    def update_custom_widget : CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkWidget], Ptr[GtkPageSetup], Ptr[GtkPrintSettings], Unit] = struct._12
    def update_custom_widget_=(value: CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkWidget], Ptr[GtkPageSetup], Ptr[GtkPrintSettings], Unit]): Unit = !struct.at12 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._13
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at13 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkprintoperationpreview.h
*/
opaque type _GtkPrintOperationPreview = CStruct0
object _GtkPrintOperationPreview:
  given _tag: Tag[_GtkPrintOperationPreview] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkprintoperationpreview.h
*/
opaque type _GtkPrintOperationPreviewIface = CStruct14[_root_.gobject.all.GTypeInterface, CFuncPtr2[Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Unit], CFuncPtr3[Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Ptr[GtkPageSetup], Unit], CFuncPtr2[Ptr[GtkPrintOperationPreview], CInt, Unit], CFuncPtr2[Ptr[GtkPrintOperationPreview], CInt, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkPrintOperationPreview], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object _GtkPrintOperationPreviewIface:
  given _tag: Tag[_GtkPrintOperationPreviewIface] = Tag.materializeCStruct14Tag[_root_.gobject.all.GTypeInterface, CFuncPtr2[Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Unit], CFuncPtr3[Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Ptr[GtkPageSetup], Unit], CFuncPtr2[Ptr[GtkPrintOperationPreview], CInt, Unit], CFuncPtr2[Ptr[GtkPrintOperationPreview], CInt, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkPrintOperationPreview], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[_GtkPrintOperationPreviewIface] = scala.scalanative.unsafe.alloc[_GtkPrintOperationPreviewIface](1)
  def apply(g_iface : _root_.gobject.all.GTypeInterface, ready : CFuncPtr2[Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Unit], got_page_size : CFuncPtr3[Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Ptr[GtkPageSetup], Unit], render_page : CFuncPtr2[Ptr[GtkPrintOperationPreview], CInt, Unit], is_selected : CFuncPtr2[Ptr[GtkPrintOperationPreview], CInt, _root_.glib.all.gboolean], end_preview : CFuncPtr1[Ptr[GtkPrintOperationPreview], Unit], _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit], _gtk_reserved5 : CFuncPtr0[Unit], _gtk_reserved6 : CFuncPtr0[Unit], _gtk_reserved7 : CFuncPtr0[Unit], _gtk_reserved8 : CFuncPtr0[Unit])(using Zone): Ptr[_GtkPrintOperationPreviewIface] = 
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).ready = ready
    (!____ptr).got_page_size = got_page_size
    (!____ptr).render_page = render_page
    (!____ptr).is_selected = is_selected
    (!____ptr).end_preview = end_preview
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    (!____ptr)._gtk_reserved5 = _gtk_reserved5
    (!____ptr)._gtk_reserved6 = _gtk_reserved6
    (!____ptr)._gtk_reserved7 = _gtk_reserved7
    (!____ptr)._gtk_reserved8 = _gtk_reserved8
    ____ptr
  extension (struct: _GtkPrintOperationPreviewIface)
    def g_iface : _root_.gobject.all.GTypeInterface = struct._1
    def g_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def ready : CFuncPtr2[Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Unit] = struct._2
    def ready_=(value: CFuncPtr2[Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Unit]): Unit = !struct.at2 = value
    def got_page_size : CFuncPtr3[Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Ptr[GtkPageSetup], Unit] = struct._3
    def got_page_size_=(value: CFuncPtr3[Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Ptr[GtkPageSetup], Unit]): Unit = !struct.at3 = value
    def render_page : CFuncPtr2[Ptr[GtkPrintOperationPreview], CInt, Unit] = struct._4
    def render_page_=(value: CFuncPtr2[Ptr[GtkPrintOperationPreview], CInt, Unit]): Unit = !struct.at4 = value
    def is_selected : CFuncPtr2[Ptr[GtkPrintOperationPreview], CInt, _root_.glib.all.gboolean] = struct._5
    def is_selected_=(value: CFuncPtr2[Ptr[GtkPrintOperationPreview], CInt, _root_.glib.all.gboolean]): Unit = !struct.at5 = value
    def end_preview : CFuncPtr1[Ptr[GtkPrintOperationPreview], Unit] = struct._6
    def end_preview_=(value: CFuncPtr1[Ptr[GtkPrintOperationPreview], Unit]): Unit = !struct.at6 = value
    def _gtk_reserved1 : CFuncPtr0[Unit] = struct._7
    def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at7 = value
    def _gtk_reserved2 : CFuncPtr0[Unit] = struct._8
    def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at8 = value
    def _gtk_reserved3 : CFuncPtr0[Unit] = struct._9
    def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at9 = value
    def _gtk_reserved4 : CFuncPtr0[Unit] = struct._10
    def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at10 = value
    def _gtk_reserved5 : CFuncPtr0[Unit] = struct._11
    def _gtk_reserved5_=(value: CFuncPtr0[Unit]): Unit = !struct.at11 = value
    def _gtk_reserved6 : CFuncPtr0[Unit] = struct._12
    def _gtk_reserved6_=(value: CFuncPtr0[Unit]): Unit = !struct.at12 = value
    def _gtk_reserved7 : CFuncPtr0[Unit] = struct._13
    def _gtk_reserved7_=(value: CFuncPtr0[Unit]): Unit = !struct.at13 = value
    def _gtk_reserved8 : CFuncPtr0[Unit] = struct._14
    def _gtk_reserved8_=(value: CFuncPtr0[Unit]): Unit = !struct.at14 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkprintoperation.h
*/
opaque type _GtkPrintOperationPrivate = CStruct0
object _GtkPrintOperationPrivate:
  given _tag: Tag[_GtkPrintOperationPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkprintsettings.h
*/
opaque type _GtkPrintSettings = CStruct0
object _GtkPrintSettings:
  given _tag: Tag[_GtkPrintSettings] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkprogressbar.h
*/
opaque type _GtkProgressBar = CStruct0
object _GtkProgressBar:
  given _tag: Tag[_GtkProgressBar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkexpression.h
*/
opaque type _GtkPropertyExpression = CStruct0
object _GtkPropertyExpression:
  given _tag: Tag[_GtkPropertyExpression] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkrange.h
*/
opaque type _GtkRange = CStruct1[GtkWidget]
object _GtkRange:
  given _tag: Tag[_GtkRange] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[_GtkRange] = scala.scalanative.unsafe.alloc[_GtkRange](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[_GtkRange] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkRange)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkrange.h
*/
opaque type _GtkRangeClass = CStruct7[GtkWidgetClass, CFuncPtr1[Ptr[GtkRange], Unit], CFuncPtr2[Ptr[GtkRange], Double, Unit], CFuncPtr2[Ptr[GtkRange], GtkScrollType, Unit], CFuncPtr2[Ptr[GtkRange], Ptr[GtkBorder], Unit], CFuncPtr3[Ptr[GtkRange], GtkScrollType, Double, _root_.glib.all.gboolean], CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkRangeClass:
  given _tag: Tag[_GtkRangeClass] = Tag.materializeCStruct7Tag[GtkWidgetClass, CFuncPtr1[Ptr[GtkRange], Unit], CFuncPtr2[Ptr[GtkRange], Double, Unit], CFuncPtr2[Ptr[GtkRange], GtkScrollType, Unit], CFuncPtr2[Ptr[GtkRange], Ptr[GtkBorder], Unit], CFuncPtr3[Ptr[GtkRange], GtkScrollType, Double, _root_.glib.all.gboolean], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkRangeClass] = scala.scalanative.unsafe.alloc[_GtkRangeClass](1)
  def apply(parent_class : GtkWidgetClass, value_changed : CFuncPtr1[Ptr[GtkRange], Unit], adjust_bounds : CFuncPtr2[Ptr[GtkRange], Double, Unit], move_slider : CFuncPtr2[Ptr[GtkRange], GtkScrollType, Unit], get_range_border : CFuncPtr2[Ptr[GtkRange], Ptr[GtkBorder], Unit], change_value : CFuncPtr3[Ptr[GtkRange], GtkScrollType, Double, _root_.glib.all.gboolean], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkRangeClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).value_changed = value_changed
    (!____ptr).adjust_bounds = adjust_bounds
    (!____ptr).move_slider = move_slider
    (!____ptr).get_range_border = get_range_border
    (!____ptr).change_value = change_value
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkRangeClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def value_changed : CFuncPtr1[Ptr[GtkRange], Unit] = struct._2
    def value_changed_=(value: CFuncPtr1[Ptr[GtkRange], Unit]): Unit = !struct.at2 = value
    def adjust_bounds : CFuncPtr2[Ptr[GtkRange], Double, Unit] = struct._3
    def adjust_bounds_=(value: CFuncPtr2[Ptr[GtkRange], Double, Unit]): Unit = !struct.at3 = value
    def move_slider : CFuncPtr2[Ptr[GtkRange], GtkScrollType, Unit] = struct._4
    def move_slider_=(value: CFuncPtr2[Ptr[GtkRange], GtkScrollType, Unit]): Unit = !struct.at4 = value
    def get_range_border : CFuncPtr2[Ptr[GtkRange], Ptr[GtkBorder], Unit] = struct._5
    def get_range_border_=(value: CFuncPtr2[Ptr[GtkRange], Ptr[GtkBorder], Unit]): Unit = !struct.at5 = value
    def change_value : CFuncPtr3[Ptr[GtkRange], GtkScrollType, Double, _root_.glib.all.gboolean] = struct._6
    def change_value_=(value: CFuncPtr3[Ptr[GtkRange], GtkScrollType, Double, _root_.glib.all.gboolean]): Unit = !struct.at6 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._7
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at7 = value

/**
 * GtkRecentData: _name: a UTF-8 encoded string, containing the name of the recently used resource to be displayed, or %NULL; : a UTF-8 encoded string, containing a short description of the resource, or %NULL; _type: the MIME type of the resource; _name: the name of the application that is registering this recently used resource; _exec: command line used to launch this resource; may contain the “%f” and “%u” escape characters which will be expanded to the resource file path and URI respectively when the command line is retrieved; : (array zero-terminated=1): a vector of strings containing groups names; applications that have registered it or not.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkrecentmanager.h
*/
opaque type _GtkRecentData = CStruct7[CString, CString, CString, CString, CString, Ptr[CString], _root_.glib.all.gboolean]
object _GtkRecentData:
  given _tag: Tag[_GtkRecentData] = Tag.materializeCStruct7Tag[CString, CString, CString, CString, CString, Ptr[CString], _root_.glib.all.gboolean]
  def apply()(using Zone): Ptr[_GtkRecentData] = scala.scalanative.unsafe.alloc[_GtkRecentData](1)
  def apply(display_name : CString, description : CString, mime_type : CString, app_name : CString, app_exec : CString, groups : Ptr[CString], is_private : _root_.glib.all.gboolean)(using Zone): Ptr[_GtkRecentData] = 
    val ____ptr = apply()
    (!____ptr).display_name = display_name
    (!____ptr).description = description
    (!____ptr).mime_type = mime_type
    (!____ptr).app_name = app_name
    (!____ptr).app_exec = app_exec
    (!____ptr).groups = groups
    (!____ptr).is_private = is_private
    ____ptr
  extension (struct: _GtkRecentData)
    def display_name : CString = struct._1
    def display_name_=(value: CString): Unit = !struct.at1 = value
    def description : CString = struct._2
    def description_=(value: CString): Unit = !struct.at2 = value
    def mime_type : CString = struct._3
    def mime_type_=(value: CString): Unit = !struct.at3 = value
    def app_name : CString = struct._4
    def app_name_=(value: CString): Unit = !struct.at4 = value
    def app_exec : CString = struct._5
    def app_exec_=(value: CString): Unit = !struct.at5 = value
    def groups : Ptr[CString] = struct._6
    def groups_=(value: Ptr[CString]): Unit = !struct.at6 = value
    def is_private : _root_.glib.all.gboolean = struct._7
    def is_private_=(value: _root_.glib.all.gboolean): Unit = !struct.at7 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkrecentmanager.h
*/
opaque type _GtkRecentInfo = CStruct0
object _GtkRecentInfo:
  given _tag: Tag[_GtkRecentInfo] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkrecentmanager.h
*/
opaque type _GtkRecentManager = CStruct2[_root_.gobject.all.GObject, Ptr[GtkRecentManagerPrivate]]
object _GtkRecentManager:
  given _tag: Tag[_GtkRecentManager] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObject, Ptr[GtkRecentManagerPrivate]]
  def apply()(using Zone): Ptr[_GtkRecentManager] = scala.scalanative.unsafe.alloc[_GtkRecentManager](1)
  def apply(parent_instance : _root_.gobject.all.GObject, priv : Ptr[GtkRecentManagerPrivate])(using Zone): Ptr[_GtkRecentManager] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr
  extension (struct: _GtkRecentManager)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value
    def priv : Ptr[GtkRecentManagerPrivate] = struct._2
    def priv_=(value: Ptr[GtkRecentManagerPrivate]): Unit = !struct.at2 = value

/**
 * GtkRecentManagerClass:

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkrecentmanager.h
*/
opaque type _GtkRecentManagerClass = CStruct6[_root_.gobject.all.GObjectClass, CFuncPtr1[Ptr[GtkRecentManager], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object _GtkRecentManagerClass:
  given _tag: Tag[_GtkRecentManagerClass] = Tag.materializeCStruct6Tag[_root_.gobject.all.GObjectClass, CFuncPtr1[Ptr[GtkRecentManager], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[_GtkRecentManagerClass] = scala.scalanative.unsafe.alloc[_GtkRecentManagerClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, changed : CFuncPtr1[Ptr[GtkRecentManager], Unit], _gtk_recent1 : CFuncPtr0[Unit], _gtk_recent2 : CFuncPtr0[Unit], _gtk_recent3 : CFuncPtr0[Unit], _gtk_recent4 : CFuncPtr0[Unit])(using Zone): Ptr[_GtkRecentManagerClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).changed = changed
    (!____ptr)._gtk_recent1 = _gtk_recent1
    (!____ptr)._gtk_recent2 = _gtk_recent2
    (!____ptr)._gtk_recent3 = _gtk_recent3
    (!____ptr)._gtk_recent4 = _gtk_recent4
    ____ptr
  extension (struct: _GtkRecentManagerClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def changed : CFuncPtr1[Ptr[GtkRecentManager], Unit] = struct._2
    def changed_=(value: CFuncPtr1[Ptr[GtkRecentManager], Unit]): Unit = !struct.at2 = value
    def _gtk_recent1 : CFuncPtr0[Unit] = struct._3
    def _gtk_recent1_=(value: CFuncPtr0[Unit]): Unit = !struct.at3 = value
    def _gtk_recent2 : CFuncPtr0[Unit] = struct._4
    def _gtk_recent2_=(value: CFuncPtr0[Unit]): Unit = !struct.at4 = value
    def _gtk_recent3 : CFuncPtr0[Unit] = struct._5
    def _gtk_recent3_=(value: CFuncPtr0[Unit]): Unit = !struct.at5 = value
    def _gtk_recent4 : CFuncPtr0[Unit] = struct._6
    def _gtk_recent4_=(value: CFuncPtr0[Unit]): Unit = !struct.at6 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkrecentmanager.h
*/
opaque type _GtkRecentManagerPrivate = CStruct0
object _GtkRecentManagerPrivate:
  given _tag: Tag[_GtkRecentManagerPrivate] = Tag.materializeCStruct0Tag

/**
 * GtkRequestedSize:

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksizerequest.h
*/
opaque type _GtkRequestedSize = CStruct3[_root_.glib.all.gpointer, CInt, CInt]
object _GtkRequestedSize:
  given _tag: Tag[_GtkRequestedSize] = Tag.materializeCStruct3Tag[_root_.glib.all.gpointer, CInt, CInt]
  def apply()(using Zone): Ptr[_GtkRequestedSize] = scala.scalanative.unsafe.alloc[_GtkRequestedSize](1)
  def apply(data : _root_.glib.all.gpointer, minimum_size : CInt, natural_size : CInt)(using Zone): Ptr[_GtkRequestedSize] = 
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).minimum_size = minimum_size
    (!____ptr).natural_size = natural_size
    ____ptr
  extension (struct: _GtkRequestedSize)
    def data : _root_.glib.all.gpointer = struct._1
    def data_=(value: _root_.glib.all.gpointer): Unit = !struct.at1 = value
    def minimum_size : CInt = struct._2
    def minimum_size_=(value: CInt): Unit = !struct.at2 = value
    def natural_size : CInt = struct._3
    def natural_size_=(value: CInt): Unit = !struct.at3 = value

/**
 * GtkRequisition: : the widget’s desired width : the widget’s desired height

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidget.h
*/
opaque type _GtkRequisition = CStruct2[CInt, CInt]
object _GtkRequisition:
  given _tag: Tag[_GtkRequisition] = Tag.materializeCStruct2Tag[CInt, CInt]
  def apply()(using Zone): Ptr[_GtkRequisition] = scala.scalanative.unsafe.alloc[_GtkRequisition](1)
  def apply(width : CInt, height : CInt)(using Zone): Ptr[_GtkRequisition] = 
    val ____ptr = apply()
    (!____ptr).width = width
    (!____ptr).height = height
    ____ptr
  extension (struct: _GtkRequisition)
    def width : CInt = struct._1
    def width_=(value: CInt): Unit = !struct.at1 = value
    def height : CInt = struct._2
    def height_=(value: CInt): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkrevealer.h
*/
opaque type _GtkRevealer = CStruct0
object _GtkRevealer:
  given _tag: Tag[_GtkRevealer] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
opaque type _GtkRoot = CStruct0
object _GtkRoot:
  given _tag: Tag[_GtkRoot] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkroot.h
*/
opaque type _GtkRootInterface = CStruct0
object _GtkRootInterface:
  given _tag: Tag[_GtkRootInterface] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkscale.h
*/
opaque type _GtkScale = CStruct1[GtkRange]
object _GtkScale:
  given _tag: Tag[_GtkScale] = Tag.materializeCStruct1Tag[GtkRange]
  def apply()(using Zone): Ptr[_GtkScale] = scala.scalanative.unsafe.alloc[_GtkScale](1)
  def apply(parent_instance : GtkRange)(using Zone): Ptr[_GtkScale] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkScale)
    def parent_instance : GtkRange = struct._1
    def parent_instance_=(value: GtkRange): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkscalebutton.h
*/
opaque type _GtkScaleButton = CStruct1[GtkWidget]
object _GtkScaleButton:
  given _tag: Tag[_GtkScaleButton] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[_GtkScaleButton] = scala.scalanative.unsafe.alloc[_GtkScaleButton](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[_GtkScaleButton] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkScaleButton)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkscalebutton.h
*/
opaque type _GtkScaleButtonClass = CStruct3[GtkWidgetClass, CFuncPtr2[Ptr[GtkScaleButton], Double, Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkScaleButtonClass:
  given _tag: Tag[_GtkScaleButtonClass] = Tag.materializeCStruct3Tag[GtkWidgetClass, CFuncPtr2[Ptr[GtkScaleButton], Double, Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkScaleButtonClass] = scala.scalanative.unsafe.alloc[_GtkScaleButtonClass](1)
  def apply(parent_class : GtkWidgetClass, value_changed : CFuncPtr2[Ptr[GtkScaleButton], Double, Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkScaleButtonClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).value_changed = value_changed
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkScaleButtonClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def value_changed : CFuncPtr2[Ptr[GtkScaleButton], Double, Unit] = struct._2
    def value_changed_=(value: CFuncPtr2[Ptr[GtkScaleButton], Double, Unit]): Unit = !struct.at2 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._3
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkscale.h
*/
opaque type _GtkScaleClass = CStruct3[GtkRangeClass, CFuncPtr3[Ptr[GtkScale], Ptr[CInt], Ptr[CInt], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkScaleClass:
  given _tag: Tag[_GtkScaleClass] = Tag.materializeCStruct3Tag[GtkRangeClass, CFuncPtr3[Ptr[GtkScale], Ptr[CInt], Ptr[CInt], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkScaleClass] = scala.scalanative.unsafe.alloc[_GtkScaleClass](1)
  def apply(parent_class : GtkRangeClass, get_layout_offsets : CFuncPtr3[Ptr[GtkScale], Ptr[CInt], Ptr[CInt], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkScaleClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).get_layout_offsets = get_layout_offsets
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkScaleClass)
    def parent_class : GtkRangeClass = struct._1
    def parent_class_=(value: GtkRangeClass): Unit = !struct.at1 = value
    def get_layout_offsets : CFuncPtr3[Ptr[GtkScale], Ptr[CInt], Ptr[CInt], Unit] = struct._2
    def get_layout_offsets_=(value: CFuncPtr3[Ptr[GtkScale], Ptr[CInt], Ptr[CInt], Unit]): Unit = !struct.at2 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._3
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkscrollable.h
*/
opaque type _GtkScrollable = CStruct0
object _GtkScrollable:
  given _tag: Tag[_GtkScrollable] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkscrollable.h
*/
opaque type _GtkScrollableInterface = CStruct2[_root_.gobject.all.GTypeInterface, CFuncPtr2[Ptr[GtkScrollable], Ptr[GtkBorder], _root_.glib.all.gboolean]]
object _GtkScrollableInterface:
  given _tag: Tag[_GtkScrollableInterface] = Tag.materializeCStruct2Tag[_root_.gobject.all.GTypeInterface, CFuncPtr2[Ptr[GtkScrollable], Ptr[GtkBorder], _root_.glib.all.gboolean]]
  def apply()(using Zone): Ptr[_GtkScrollableInterface] = scala.scalanative.unsafe.alloc[_GtkScrollableInterface](1)
  def apply(base_iface : _root_.gobject.all.GTypeInterface, get_border : CFuncPtr2[Ptr[GtkScrollable], Ptr[GtkBorder], _root_.glib.all.gboolean])(using Zone): Ptr[_GtkScrollableInterface] = 
    val ____ptr = apply()
    (!____ptr).base_iface = base_iface
    (!____ptr).get_border = get_border
    ____ptr
  extension (struct: _GtkScrollableInterface)
    def base_iface : _root_.gobject.all.GTypeInterface = struct._1
    def base_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def get_border : CFuncPtr2[Ptr[GtkScrollable], Ptr[GtkBorder], _root_.glib.all.gboolean] = struct._2
    def get_border_=(value: CFuncPtr2[Ptr[GtkScrollable], Ptr[GtkBorder], _root_.glib.all.gboolean]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkscrollbar.h
*/
opaque type _GtkScrollbar = CStruct0
object _GtkScrollbar:
  given _tag: Tag[_GtkScrollbar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkscrolledwindow.h
*/
opaque type _GtkScrolledWindow = CStruct0
object _GtkScrolledWindow:
  given _tag: Tag[_GtkScrolledWindow] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksearchbar.h
*/
opaque type _GtkSearchBar = CStruct0
object _GtkSearchBar:
  given _tag: Tag[_GtkSearchBar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksearchentry.h
*/
opaque type _GtkSearchEntry = CStruct0
object _GtkSearchEntry:
  given _tag: Tag[_GtkSearchEntry] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkselectionfiltermodel.h
*/
opaque type _GtkSelectionFilterModel = CStruct0
object _GtkSelectionFilterModel:
  given _tag: Tag[_GtkSelectionFilterModel] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkselectionmodel.h
*/
opaque type _GtkSelectionModel = CStruct0
object _GtkSelectionModel:
  given _tag: Tag[_GtkSelectionModel] = Tag.materializeCStruct0Tag

/**
 * GtkSelectionModelInterface: _selection_in_range: Return a bitset with all currently selected items in the given range. By default, this function will call `GtkSelectionModel::is_selected()` on all items in the given range. _item: Select the item in the given position. If the operation is known to fail, return %FALSE. _item: Unselect the item in the given position. If the operation is known to fail, return %FALSE. _range: Select all items in the given range. If the operation is unsupported or known to fail for all items, return %FALSE. _range: Unselect all items in the given range. If the operation is unsupported or known to fail for all items, return %FALSE. _all: Select all items in the model. If the operation is unsupported or known to fail for all items, return %FALSE. _all: Unselect all items in the model. If the operation is unsupported or known to fail for all items, return %FALSE.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkselectionmodel.h
*/
opaque type _GtkSelectionModelInterface = CStruct10[_root_.gobject.all.GTypeInterface, CFuncPtr2[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.guint, Ptr[GtkBitset]], CFuncPtr3[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.gboolean, _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.gboolean], CFuncPtr4[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.gboolean, _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkSelectionModel], _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkSelectionModel], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkSelectionModel], Ptr[GtkBitset], Ptr[GtkBitset], _root_.glib.all.gboolean]]
object _GtkSelectionModelInterface:
  given _tag: Tag[_GtkSelectionModelInterface] = Tag.materializeCStruct10Tag[_root_.gobject.all.GTypeInterface, CFuncPtr2[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.guint, Ptr[GtkBitset]], CFuncPtr3[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.gboolean, _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.gboolean], CFuncPtr4[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.gboolean, _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkSelectionModel], _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkSelectionModel], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkSelectionModel], Ptr[GtkBitset], Ptr[GtkBitset], _root_.glib.all.gboolean]]
  def apply()(using Zone): Ptr[_GtkSelectionModelInterface] = scala.scalanative.unsafe.alloc[_GtkSelectionModelInterface](1)
  def apply(g_iface : _root_.gobject.all.GTypeInterface, is_selected : CFuncPtr2[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.gboolean], get_selection_in_range : CFuncPtr3[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.guint, Ptr[GtkBitset]], select_item : CFuncPtr3[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.gboolean, _root_.glib.all.gboolean], unselect_item : CFuncPtr2[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.gboolean], select_range : CFuncPtr4[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.gboolean, _root_.glib.all.gboolean], unselect_range : CFuncPtr3[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.gboolean], select_all : CFuncPtr1[Ptr[GtkSelectionModel], _root_.glib.all.gboolean], unselect_all : CFuncPtr1[Ptr[GtkSelectionModel], _root_.glib.all.gboolean], set_selection : CFuncPtr3[Ptr[GtkSelectionModel], Ptr[GtkBitset], Ptr[GtkBitset], _root_.glib.all.gboolean])(using Zone): Ptr[_GtkSelectionModelInterface] = 
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).is_selected = is_selected
    (!____ptr).get_selection_in_range = get_selection_in_range
    (!____ptr).select_item = select_item
    (!____ptr).unselect_item = unselect_item
    (!____ptr).select_range = select_range
    (!____ptr).unselect_range = unselect_range
    (!____ptr).select_all = select_all
    (!____ptr).unselect_all = unselect_all
    (!____ptr).set_selection = set_selection
    ____ptr
  extension (struct: _GtkSelectionModelInterface)
    def g_iface : _root_.gobject.all.GTypeInterface = struct._1
    def g_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def is_selected : CFuncPtr2[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.gboolean] = struct._2
    def is_selected_=(value: CFuncPtr2[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.gboolean]): Unit = !struct.at2 = value
    def get_selection_in_range : CFuncPtr3[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.guint, Ptr[GtkBitset]] = struct._3
    def get_selection_in_range_=(value: CFuncPtr3[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.guint, Ptr[GtkBitset]]): Unit = !struct.at3 = value
    def select_item : CFuncPtr3[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.gboolean, _root_.glib.all.gboolean] = struct._4
    def select_item_=(value: CFuncPtr3[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.gboolean, _root_.glib.all.gboolean]): Unit = !struct.at4 = value
    def unselect_item : CFuncPtr2[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.gboolean] = struct._5
    def unselect_item_=(value: CFuncPtr2[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.gboolean]): Unit = !struct.at5 = value
    def select_range : CFuncPtr4[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.gboolean, _root_.glib.all.gboolean] = struct._6
    def select_range_=(value: CFuncPtr4[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.gboolean, _root_.glib.all.gboolean]): Unit = !struct.at6 = value
    def unselect_range : CFuncPtr3[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.gboolean] = struct._7
    def unselect_range_=(value: CFuncPtr3[Ptr[GtkSelectionModel], _root_.glib.all.guint, _root_.glib.all.guint, _root_.glib.all.gboolean]): Unit = !struct.at7 = value
    def select_all : CFuncPtr1[Ptr[GtkSelectionModel], _root_.glib.all.gboolean] = struct._8
    def select_all_=(value: CFuncPtr1[Ptr[GtkSelectionModel], _root_.glib.all.gboolean]): Unit = !struct.at8 = value
    def unselect_all : CFuncPtr1[Ptr[GtkSelectionModel], _root_.glib.all.gboolean] = struct._9
    def unselect_all_=(value: CFuncPtr1[Ptr[GtkSelectionModel], _root_.glib.all.gboolean]): Unit = !struct.at9 = value
    def set_selection : CFuncPtr3[Ptr[GtkSelectionModel], Ptr[GtkBitset], Ptr[GtkBitset], _root_.glib.all.gboolean] = struct._10
    def set_selection_=(value: CFuncPtr3[Ptr[GtkSelectionModel], Ptr[GtkBitset], Ptr[GtkBitset], _root_.glib.all.gboolean]): Unit = !struct.at10 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkseparator.h
*/
opaque type _GtkSeparator = CStruct0
object _GtkSeparator:
  given _tag: Tag[_GtkSeparator] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
opaque type _GtkSettings = CStruct0
object _GtkSettings:
  given _tag: Tag[_GtkSettings] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
opaque type _GtkShortcut = CStruct0
object _GtkShortcut:
  given _tag: Tag[_GtkShortcut] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
opaque type _GtkShortcutAction = CStruct0
object _GtkShortcutAction:
  given _tag: Tag[_GtkShortcutAction] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type _GtkShortcutActionClass = CStruct0
object _GtkShortcutActionClass:
  given _tag: Tag[_GtkShortcutActionClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutcontroller.h
*/
opaque type _GtkShortcutController = CStruct0
object _GtkShortcutController:
  given _tag: Tag[_GtkShortcutController] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutcontroller.h
*/
opaque type _GtkShortcutControllerClass = CStruct0
object _GtkShortcutControllerClass:
  given _tag: Tag[_GtkShortcutControllerClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutlabel.h
*/
opaque type _GtkShortcutLabel = CStruct0
object _GtkShortcutLabel:
  given _tag: Tag[_GtkShortcutLabel] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutlabel.h
*/
opaque type _GtkShortcutLabelClass = CStruct0
object _GtkShortcutLabelClass:
  given _tag: Tag[_GtkShortcutLabelClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutmanager.h
*/
opaque type _GtkShortcutManager = CStruct0
object _GtkShortcutManager:
  given _tag: Tag[_GtkShortcutManager] = Tag.materializeCStruct0Tag

/**
 * GtkShortcutManagerInterface: _controller: Add a `GtkShortcutController` to be managed. _controller: Remove a `GtkShortcutController` that had previously been added

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutmanager.h
*/
opaque type _GtkShortcutManagerInterface = CStruct3[_root_.gobject.all.GTypeInterface, CFuncPtr2[Ptr[GtkShortcutManager], Ptr[GtkShortcutController], Unit], CFuncPtr2[Ptr[GtkShortcutManager], Ptr[GtkShortcutController], Unit]]
object _GtkShortcutManagerInterface:
  given _tag: Tag[_GtkShortcutManagerInterface] = Tag.materializeCStruct3Tag[_root_.gobject.all.GTypeInterface, CFuncPtr2[Ptr[GtkShortcutManager], Ptr[GtkShortcutController], Unit], CFuncPtr2[Ptr[GtkShortcutManager], Ptr[GtkShortcutController], Unit]]
  def apply()(using Zone): Ptr[_GtkShortcutManagerInterface] = scala.scalanative.unsafe.alloc[_GtkShortcutManagerInterface](1)
  def apply(g_iface : _root_.gobject.all.GTypeInterface, add_controller : CFuncPtr2[Ptr[GtkShortcutManager], Ptr[GtkShortcutController], Unit], remove_controller : CFuncPtr2[Ptr[GtkShortcutManager], Ptr[GtkShortcutController], Unit])(using Zone): Ptr[_GtkShortcutManagerInterface] = 
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).add_controller = add_controller
    (!____ptr).remove_controller = remove_controller
    ____ptr
  extension (struct: _GtkShortcutManagerInterface)
    def g_iface : _root_.gobject.all.GTypeInterface = struct._1
    def g_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def add_controller : CFuncPtr2[Ptr[GtkShortcutManager], Ptr[GtkShortcutController], Unit] = struct._2
    def add_controller_=(value: CFuncPtr2[Ptr[GtkShortcutManager], Ptr[GtkShortcutController], Unit]): Unit = !struct.at2 = value
    def remove_controller : CFuncPtr2[Ptr[GtkShortcutManager], Ptr[GtkShortcutController], Unit] = struct._3
    def remove_controller_=(value: CFuncPtr2[Ptr[GtkShortcutManager], Ptr[GtkShortcutController], Unit]): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
opaque type _GtkShortcutTrigger = CStruct0
object _GtkShortcutTrigger:
  given _tag: Tag[_GtkShortcutTrigger] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcuttrigger.h
*/
opaque type _GtkShortcutTriggerClass = CStruct0
object _GtkShortcutTriggerClass:
  given _tag: Tag[_GtkShortcutTriggerClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutsgroup.h
*/
opaque type _GtkShortcutsGroup = CStruct0
object _GtkShortcutsGroup:
  given _tag: Tag[_GtkShortcutsGroup] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutsgroup.h
*/
opaque type _GtkShortcutsGroupClass = CStruct0
object _GtkShortcutsGroupClass:
  given _tag: Tag[_GtkShortcutsGroupClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutssection.h
*/
opaque type _GtkShortcutsSection = CStruct0
object _GtkShortcutsSection:
  given _tag: Tag[_GtkShortcutsSection] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutssection.h
*/
opaque type _GtkShortcutsSectionClass = CStruct0
object _GtkShortcutsSectionClass:
  given _tag: Tag[_GtkShortcutsSectionClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutsshortcut.h
*/
opaque type _GtkShortcutsShortcut = CStruct0
object _GtkShortcutsShortcut:
  given _tag: Tag[_GtkShortcutsShortcut] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutsshortcut.h
*/
opaque type _GtkShortcutsShortcutClass = CStruct0
object _GtkShortcutsShortcutClass:
  given _tag: Tag[_GtkShortcutsShortcutClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutswindow.h
*/
opaque type _GtkShortcutsWindow = CStruct0
object _GtkShortcutsWindow:
  given _tag: Tag[_GtkShortcutsWindow] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type _GtkSignalAction = CStruct0
object _GtkSignalAction:
  given _tag: Tag[_GtkSignalAction] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkshortcutaction.h
*/
opaque type _GtkSignalActionClass = CStruct0
object _GtkSignalActionClass:
  given _tag: Tag[_GtkSignalActionClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksignallistitemfactory.h
*/
opaque type _GtkSignalListItemFactory = CStruct0
object _GtkSignalListItemFactory:
  given _tag: Tag[_GtkSignalListItemFactory] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksignallistitemfactory.h
*/
opaque type _GtkSignalListItemFactoryClass = CStruct0
object _GtkSignalListItemFactoryClass:
  given _tag: Tag[_GtkSignalListItemFactoryClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksingleselection.h
*/
opaque type _GtkSingleSelection = CStruct0
object _GtkSingleSelection:
  given _tag: Tag[_GtkSingleSelection] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksizegroup.h
*/
opaque type _GtkSizeGroup = CStruct1[_root_.gobject.all.GObject]
object _GtkSizeGroup:
  given _tag: Tag[_GtkSizeGroup] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[_GtkSizeGroup] = scala.scalanative.unsafe.alloc[_GtkSizeGroup](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[_GtkSizeGroup] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkSizeGroup)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkslicelistmodel.h
*/
opaque type _GtkSliceListModel = CStruct0
object _GtkSliceListModel:
  given _tag: Tag[_GtkSliceListModel] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksnapshot.h
*/
opaque type _GtkSnapshotClass = CStruct0
object _GtkSnapshotClass:
  given _tag: Tag[_GtkSnapshotClass] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksortlistmodel.h
*/
opaque type _GtkSortListModel = CStruct0
object _GtkSortListModel:
  given _tag: Tag[_GtkSortListModel] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksorter.h
*/
opaque type _GtkSorter = CStruct1[_root_.gobject.all.GObject]
object _GtkSorter:
  given _tag: Tag[_GtkSorter] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[_GtkSorter] = scala.scalanative.unsafe.alloc[_GtkSorter](1)
  def apply(parent_instance : _root_.gobject.all.GObject)(using Zone): Ptr[_GtkSorter] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkSorter)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * GtkSorterClass : Compare two items. See gtk_sorter_compare() for details. _order: Get the `GtkSorderOrder` that applies to the current sorter. If unimplemented, it returns %GTK_SORTER_ORDER_PARTIAL.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksorter.h
*/
opaque type _GtkSorterClass = CStruct11[_root_.gobject.all.GObjectClass, CFuncPtr3[Ptr[GtkSorter], _root_.glib.all.gpointer, _root_.glib.all.gpointer, GtkOrdering], CFuncPtr1[Ptr[GtkSorter], GtkSorterOrder], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object _GtkSorterClass:
  given _tag: Tag[_GtkSorterClass] = Tag.materializeCStruct11Tag[_root_.gobject.all.GObjectClass, CFuncPtr3[Ptr[GtkSorter], _root_.glib.all.gpointer, _root_.glib.all.gpointer, GtkOrdering], CFuncPtr1[Ptr[GtkSorter], GtkSorterOrder], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[_GtkSorterClass] = scala.scalanative.unsafe.alloc[_GtkSorterClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, compare : CFuncPtr3[Ptr[GtkSorter], _root_.glib.all.gpointer, _root_.glib.all.gpointer, GtkOrdering], get_order : CFuncPtr1[Ptr[GtkSorter], GtkSorterOrder], _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit], _gtk_reserved5 : CFuncPtr0[Unit], _gtk_reserved6 : CFuncPtr0[Unit], _gtk_reserved7 : CFuncPtr0[Unit], _gtk_reserved8 : CFuncPtr0[Unit])(using Zone): Ptr[_GtkSorterClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).compare = compare
    (!____ptr).get_order = get_order
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    (!____ptr)._gtk_reserved5 = _gtk_reserved5
    (!____ptr)._gtk_reserved6 = _gtk_reserved6
    (!____ptr)._gtk_reserved7 = _gtk_reserved7
    (!____ptr)._gtk_reserved8 = _gtk_reserved8
    ____ptr
  extension (struct: _GtkSorterClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def compare : CFuncPtr3[Ptr[GtkSorter], _root_.glib.all.gpointer, _root_.glib.all.gpointer, GtkOrdering] = struct._2
    def compare_=(value: CFuncPtr3[Ptr[GtkSorter], _root_.glib.all.gpointer, _root_.glib.all.gpointer, GtkOrdering]): Unit = !struct.at2 = value
    def get_order : CFuncPtr1[Ptr[GtkSorter], GtkSorterOrder] = struct._3
    def get_order_=(value: CFuncPtr1[Ptr[GtkSorter], GtkSorterOrder]): Unit = !struct.at3 = value
    def _gtk_reserved1 : CFuncPtr0[Unit] = struct._4
    def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at4 = value
    def _gtk_reserved2 : CFuncPtr0[Unit] = struct._5
    def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at5 = value
    def _gtk_reserved3 : CFuncPtr0[Unit] = struct._6
    def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at6 = value
    def _gtk_reserved4 : CFuncPtr0[Unit] = struct._7
    def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at7 = value
    def _gtk_reserved5 : CFuncPtr0[Unit] = struct._8
    def _gtk_reserved5_=(value: CFuncPtr0[Unit]): Unit = !struct.at8 = value
    def _gtk_reserved6 : CFuncPtr0[Unit] = struct._9
    def _gtk_reserved6_=(value: CFuncPtr0[Unit]): Unit = !struct.at9 = value
    def _gtk_reserved7 : CFuncPtr0[Unit] = struct._10
    def _gtk_reserved7_=(value: CFuncPtr0[Unit]): Unit = !struct.at10 = value
    def _gtk_reserved8 : CFuncPtr0[Unit] = struct._11
    def _gtk_reserved8_=(value: CFuncPtr0[Unit]): Unit = !struct.at11 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkspinbutton.h
*/
opaque type _GtkSpinButton = CStruct0
object _GtkSpinButton:
  given _tag: Tag[_GtkSpinButton] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkspinner.h
*/
opaque type _GtkSpinner = CStruct0
object _GtkSpinner:
  given _tag: Tag[_GtkSpinner] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstack.h
*/
opaque type _GtkStack = CStruct0
object _GtkStack:
  given _tag: Tag[_GtkStack] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstack.h
*/
opaque type _GtkStackPage = CStruct0
object _GtkStackPage:
  given _tag: Tag[_GtkStackPage] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstacksidebar.h
*/
opaque type _GtkStackSidebar = CStruct0
object _GtkStackSidebar:
  given _tag: Tag[_GtkStackSidebar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstackswitcher.h
*/
opaque type _GtkStackSwitcher = CStruct0
object _GtkStackSwitcher:
  given _tag: Tag[_GtkStackSwitcher] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstatusbar.h
*/
opaque type _GtkStatusbar = CStruct0
object _GtkStatusbar:
  given _tag: Tag[_GtkStatusbar] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringfilter.h
*/
opaque type _GtkStringFilter = CStruct0
object _GtkStringFilter:
  given _tag: Tag[_GtkStringFilter] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringlist.h
*/
opaque type _GtkStringList = CStruct0
object _GtkStringList:
  given _tag: Tag[_GtkStringList] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringlist.h
*/
opaque type _GtkStringObject = CStruct0
object _GtkStringObject:
  given _tag: Tag[_GtkStringObject] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstringsorter.h
*/
opaque type _GtkStringSorter = CStruct0
object _GtkStringSorter:
  given _tag: Tag[_GtkStringSorter] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstylecontext.h
*/
opaque type _GtkStyleContext = CStruct1[_root_.gobject.all.GObject]
object _GtkStyleContext:
  given _tag: Tag[_GtkStyleContext] = Tag.materializeCStruct1Tag[_root_.gobject.all.GObject]
  def apply()(using Zone): Ptr[_GtkStyleContext] = scala.scalanative.unsafe.alloc[_GtkStyleContext](1)
  def apply(parent_object : _root_.gobject.all.GObject)(using Zone): Ptr[_GtkStyleContext] = 
    val ____ptr = apply()
    (!____ptr).parent_object = parent_object
    ____ptr
  extension (struct: _GtkStyleContext)
    def parent_object : _root_.gobject.all.GObject = struct._1
    def parent_object_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstylecontext.h
*/
opaque type _GtkStyleContextClass = CStruct6[_root_.gobject.all.GObjectClass, CFuncPtr1[Ptr[GtkStyleContext], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object _GtkStyleContextClass:
  given _tag: Tag[_GtkStyleContextClass] = Tag.materializeCStruct6Tag[_root_.gobject.all.GObjectClass, CFuncPtr1[Ptr[GtkStyleContext], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[_GtkStyleContextClass] = scala.scalanative.unsafe.alloc[_GtkStyleContextClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, changed : CFuncPtr1[Ptr[GtkStyleContext], Unit], _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[_GtkStyleContextClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).changed = changed
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    ____ptr
  extension (struct: _GtkStyleContextClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def changed : CFuncPtr1[Ptr[GtkStyleContext], Unit] = struct._2
    def changed_=(value: CFuncPtr1[Ptr[GtkStyleContext], Unit]): Unit = !struct.at2 = value
    def _gtk_reserved1 : CFuncPtr0[Unit] = struct._3
    def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at3 = value
    def _gtk_reserved2 : CFuncPtr0[Unit] = struct._4
    def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at4 = value
    def _gtk_reserved3 : CFuncPtr0[Unit] = struct._5
    def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at5 = value
    def _gtk_reserved4 : CFuncPtr0[Unit] = struct._6
    def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at6 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkstyleprovider.h
*/
opaque type _GtkStyleProvider = CStruct0
object _GtkStyleProvider:
  given _tag: Tag[_GtkStyleProvider] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkswitch.h
*/
opaque type _GtkSwitch = CStruct0
object _GtkSwitch:
  given _tag: Tag[_GtkSwitch] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksymbolicpaintable.h
*/
opaque type _GtkSymbolicPaintable = CStruct0
object _GtkSymbolicPaintable:
  given _tag: Tag[_GtkSymbolicPaintable] = Tag.materializeCStruct0Tag

/**
 * GtkSymbolicPaintableInterface: _symbolic: Snapshot the paintable using the given colors. See `GtkSymbolicPaintable::snapshot_symbolic()` for details. If this function is not implemented, [vfunc.Paintable.snapshot] will be called.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtksymbolicpaintable.h
*/
opaque type _GtkSymbolicPaintableInterface = CStruct2[_root_.gobject.all.GTypeInterface, CFuncPtr6[Ptr[GtkSymbolicPaintable], Ptr[GdkSnapshot], Double, Double, Ptr[GdkRGBA], _root_.glib.all.gsize, Unit]]
object _GtkSymbolicPaintableInterface:
  given _tag: Tag[_GtkSymbolicPaintableInterface] = Tag.materializeCStruct2Tag[_root_.gobject.all.GTypeInterface, CFuncPtr6[Ptr[GtkSymbolicPaintable], Ptr[GdkSnapshot], Double, Double, Ptr[GdkRGBA], _root_.glib.all.gsize, Unit]]
  def apply()(using Zone): Ptr[_GtkSymbolicPaintableInterface] = scala.scalanative.unsafe.alloc[_GtkSymbolicPaintableInterface](1)
  def apply(g_iface : _root_.gobject.all.GTypeInterface, snapshot_symbolic : CFuncPtr6[Ptr[GtkSymbolicPaintable], Ptr[GdkSnapshot], Double, Double, Ptr[GdkRGBA], _root_.glib.all.gsize, Unit])(using Zone): Ptr[_GtkSymbolicPaintableInterface] = 
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).snapshot_symbolic = snapshot_symbolic
    ____ptr
  extension (struct: _GtkSymbolicPaintableInterface)
    def g_iface : _root_.gobject.all.GTypeInterface = struct._1
    def g_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def snapshot_symbolic : CFuncPtr6[Ptr[GtkSymbolicPaintable], Ptr[GdkSnapshot], Double, Double, Ptr[GdkRGBA], _root_.glib.all.gsize, Unit] = struct._2
    def snapshot_symbolic_=(value: CFuncPtr6[Ptr[GtkSymbolicPaintable], Ptr[GdkSnapshot], Double, Double, Ptr[GdkRGBA], _root_.glib.all.gsize, Unit]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktext.h
*/
opaque type _GtkText = CStruct1[GtkWidget]
object _GtkText:
  given _tag: Tag[_GtkText] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[_GtkText] = scala.scalanative.unsafe.alloc[_GtkText](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[_GtkText] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkText)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktextbuffer.h
*/
opaque type _GtkTextBuffer = CStruct2[_root_.gobject.all.GObject, Ptr[GtkTextBufferPrivate]]
object _GtkTextBuffer:
  given _tag: Tag[_GtkTextBuffer] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObject, Ptr[GtkTextBufferPrivate]]
  def apply()(using Zone): Ptr[_GtkTextBuffer] = scala.scalanative.unsafe.alloc[_GtkTextBuffer](1)
  def apply(parent_instance : _root_.gobject.all.GObject, priv : Ptr[GtkTextBufferPrivate])(using Zone): Ptr[_GtkTextBuffer] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr
  extension (struct: _GtkTextBuffer)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value
    def priv : Ptr[GtkTextBufferPrivate] = struct._2
    def priv_=(value: Ptr[GtkTextBufferPrivate]): Unit = !struct.at2 = value

/**
 * GtkTextBufferClass: _class: The object class structure needs to be the first. _text: The class handler for the `GtkTextBuffer::insert-text` signal. _paintable: The class handler for the `GtkTextBuffer::insert-paintable` signal. _child_anchor: The class handler for the `GtkTextBuffer::insert-child-anchor` signal. _range: The class handler for the `GtkTextBuffer::delete-range` signal. : The class handler for the `GtkTextBuffer::changed` signal. _changed: The class handler for the `GtkTextBuffer::modified-changed` signal. _set: The class handler for the `GtkTextBuffer::mark-set` signal. _deleted: The class handler for the `GtkTextBuffer::mark-deleted` signal. _tag: The class handler for the `GtkTextBuffer::apply-tag` signal. _tag: The class handler for the `GtkTextBuffer::remove-tag` signal. _user_action: The class handler for the `GtkTextBuffer::begin-user-action` signal. _user_action: The class handler for the `GtkTextBuffer::end-user-action` signal. _done: The class handler for the `GtkTextBuffer::paste-done` signal. : The class handler for the `GtkTextBuffer::undo` signal : The class handler for the `GtkTextBuffer::redo` signal

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktextbuffer.h
*/
opaque type _GtkTextBufferClass = CStruct20[_root_.gobject.all.GObjectClass, CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextIter], CString, CInt, Unit], CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GdkPaintable], Unit], CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextChildAnchor], Unit], CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextMark], Unit], CFuncPtr2[Ptr[GtkTextBuffer], Ptr[GtkTextMark], Unit], CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextTag], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit], CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextTag], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr2[Ptr[GtkTextBuffer], Ptr[GdkClipboard], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object _GtkTextBufferClass:
  given _tag: Tag[_GtkTextBufferClass] = Tag.materializeCStruct20Tag[_root_.gobject.all.GObjectClass, CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextIter], CString, CInt, Unit], CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GdkPaintable], Unit], CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextChildAnchor], Unit], CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextMark], Unit], CFuncPtr2[Ptr[GtkTextBuffer], Ptr[GtkTextMark], Unit], CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextTag], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit], CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextTag], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr2[Ptr[GtkTextBuffer], Ptr[GdkClipboard], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[_GtkTextBufferClass] = scala.scalanative.unsafe.alloc[_GtkTextBufferClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, insert_text : CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextIter], CString, CInt, Unit], insert_paintable : CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GdkPaintable], Unit], insert_child_anchor : CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextChildAnchor], Unit], delete_range : CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit], changed : CFuncPtr1[Ptr[GtkTextBuffer], Unit], modified_changed : CFuncPtr1[Ptr[GtkTextBuffer], Unit], mark_set : CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextMark], Unit], mark_deleted : CFuncPtr2[Ptr[GtkTextBuffer], Ptr[GtkTextMark], Unit], apply_tag : CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextTag], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit], remove_tag : CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextTag], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit], begin_user_action : CFuncPtr1[Ptr[GtkTextBuffer], Unit], end_user_action : CFuncPtr1[Ptr[GtkTextBuffer], Unit], paste_done : CFuncPtr2[Ptr[GtkTextBuffer], Ptr[GdkClipboard], Unit], undo : CFuncPtr1[Ptr[GtkTextBuffer], Unit], redo : CFuncPtr1[Ptr[GtkTextBuffer], Unit], _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[_GtkTextBufferClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).insert_text = insert_text
    (!____ptr).insert_paintable = insert_paintable
    (!____ptr).insert_child_anchor = insert_child_anchor
    (!____ptr).delete_range = delete_range
    (!____ptr).changed = changed
    (!____ptr).modified_changed = modified_changed
    (!____ptr).mark_set = mark_set
    (!____ptr).mark_deleted = mark_deleted
    (!____ptr).apply_tag = apply_tag
    (!____ptr).remove_tag = remove_tag
    (!____ptr).begin_user_action = begin_user_action
    (!____ptr).end_user_action = end_user_action
    (!____ptr).paste_done = paste_done
    (!____ptr).undo = undo
    (!____ptr).redo = redo
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    ____ptr
  extension (struct: _GtkTextBufferClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def insert_text : CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextIter], CString, CInt, Unit] = struct._2
    def insert_text_=(value: CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextIter], CString, CInt, Unit]): Unit = !struct.at2 = value
    def insert_paintable : CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GdkPaintable], Unit] = struct._3
    def insert_paintable_=(value: CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GdkPaintable], Unit]): Unit = !struct.at3 = value
    def insert_child_anchor : CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextChildAnchor], Unit] = struct._4
    def insert_child_anchor_=(value: CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextChildAnchor], Unit]): Unit = !struct.at4 = value
    def delete_range : CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit] = struct._5
    def delete_range_=(value: CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit]): Unit = !struct.at5 = value
    def changed : CFuncPtr1[Ptr[GtkTextBuffer], Unit] = struct._6
    def changed_=(value: CFuncPtr1[Ptr[GtkTextBuffer], Unit]): Unit = !struct.at6 = value
    def modified_changed : CFuncPtr1[Ptr[GtkTextBuffer], Unit] = struct._7
    def modified_changed_=(value: CFuncPtr1[Ptr[GtkTextBuffer], Unit]): Unit = !struct.at7 = value
    def mark_set : CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextMark], Unit] = struct._8
    def mark_set_=(value: CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextMark], Unit]): Unit = !struct.at8 = value
    def mark_deleted : CFuncPtr2[Ptr[GtkTextBuffer], Ptr[GtkTextMark], Unit] = struct._9
    def mark_deleted_=(value: CFuncPtr2[Ptr[GtkTextBuffer], Ptr[GtkTextMark], Unit]): Unit = !struct.at9 = value
    def apply_tag : CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextTag], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit] = struct._10
    def apply_tag_=(value: CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextTag], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit]): Unit = !struct.at10 = value
    def remove_tag : CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextTag], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit] = struct._11
    def remove_tag_=(value: CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextTag], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit]): Unit = !struct.at11 = value
    def begin_user_action : CFuncPtr1[Ptr[GtkTextBuffer], Unit] = struct._12
    def begin_user_action_=(value: CFuncPtr1[Ptr[GtkTextBuffer], Unit]): Unit = !struct.at12 = value
    def end_user_action : CFuncPtr1[Ptr[GtkTextBuffer], Unit] = struct._13
    def end_user_action_=(value: CFuncPtr1[Ptr[GtkTextBuffer], Unit]): Unit = !struct.at13 = value
    def paste_done : CFuncPtr2[Ptr[GtkTextBuffer], Ptr[GdkClipboard], Unit] = struct._14
    def paste_done_=(value: CFuncPtr2[Ptr[GtkTextBuffer], Ptr[GdkClipboard], Unit]): Unit = !struct.at14 = value
    def undo : CFuncPtr1[Ptr[GtkTextBuffer], Unit] = struct._15
    def undo_=(value: CFuncPtr1[Ptr[GtkTextBuffer], Unit]): Unit = !struct.at15 = value
    def redo : CFuncPtr1[Ptr[GtkTextBuffer], Unit] = struct._16
    def redo_=(value: CFuncPtr1[Ptr[GtkTextBuffer], Unit]): Unit = !struct.at16 = value
    def _gtk_reserved1 : CFuncPtr0[Unit] = struct._17
    def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at17 = value
    def _gtk_reserved2 : CFuncPtr0[Unit] = struct._18
    def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at18 = value
    def _gtk_reserved3 : CFuncPtr0[Unit] = struct._19
    def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at19 = value
    def _gtk_reserved4 : CFuncPtr0[Unit] = struct._20
    def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at20 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktextbuffer.h
*/
opaque type _GtkTextBufferPrivate = CStruct0
object _GtkTextBufferPrivate:
  given _tag: Tag[_GtkTextBufferPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktextchild.h
*/
opaque type _GtkTextChildAnchor = CStruct2[_root_.gobject.all.GObject, _root_.glib.all.gpointer]
object _GtkTextChildAnchor:
  given _tag: Tag[_GtkTextChildAnchor] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObject, _root_.glib.all.gpointer]
  def apply()(using Zone): Ptr[_GtkTextChildAnchor] = scala.scalanative.unsafe.alloc[_GtkTextChildAnchor](1)
  def apply(parent_instance : _root_.gobject.all.GObject, segment : _root_.glib.all.gpointer)(using Zone): Ptr[_GtkTextChildAnchor] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).segment = segment
    ____ptr
  extension (struct: _GtkTextChildAnchor)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value
    def segment : _root_.glib.all.gpointer = struct._2
    def segment_=(value: _root_.glib.all.gpointer): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktextchild.h
*/
opaque type _GtkTextChildAnchorClass = CStruct5[_root_.gobject.all.GObjectClass, CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object _GtkTextChildAnchorClass:
  given _tag: Tag[_GtkTextChildAnchorClass] = Tag.materializeCStruct5Tag[_root_.gobject.all.GObjectClass, CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[_GtkTextChildAnchorClass] = scala.scalanative.unsafe.alloc[_GtkTextChildAnchorClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[_GtkTextChildAnchorClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    ____ptr
  extension (struct: _GtkTextChildAnchorClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def _gtk_reserved1 : CFuncPtr0[Unit] = struct._2
    def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at2 = value
    def _gtk_reserved2 : CFuncPtr0[Unit] = struct._3
    def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at3 = value
    def _gtk_reserved3 : CFuncPtr0[Unit] = struct._4
    def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at4 = value
    def _gtk_reserved4 : CFuncPtr0[Unit] = struct._5
    def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at5 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktextiter.h
*/
opaque type _GtkTextIter = CStruct14[_root_.glib.all.gpointer, _root_.glib.all.gpointer, CInt, CInt, CInt, CInt, CInt, CInt, _root_.glib.all.gpointer, _root_.glib.all.gpointer, CInt, CInt, CInt, _root_.glib.all.gpointer]
object _GtkTextIter:
  given _tag: Tag[_GtkTextIter] = Tag.materializeCStruct14Tag[_root_.glib.all.gpointer, _root_.glib.all.gpointer, CInt, CInt, CInt, CInt, CInt, CInt, _root_.glib.all.gpointer, _root_.glib.all.gpointer, CInt, CInt, CInt, _root_.glib.all.gpointer]
  def apply()(using Zone): Ptr[_GtkTextIter] = scala.scalanative.unsafe.alloc[_GtkTextIter](1)
  def apply(dummy1 : _root_.glib.all.gpointer, dummy2 : _root_.glib.all.gpointer, dummy3 : CInt, dummy4 : CInt, dummy5 : CInt, dummy6 : CInt, dummy7 : CInt, dummy8 : CInt, dummy9 : _root_.glib.all.gpointer, dummy10 : _root_.glib.all.gpointer, dummy11 : CInt, dummy12 : CInt, dummy13 : CInt, dummy14 : _root_.glib.all.gpointer)(using Zone): Ptr[_GtkTextIter] = 
    val ____ptr = apply()
    (!____ptr).dummy1 = dummy1
    (!____ptr).dummy2 = dummy2
    (!____ptr).dummy3 = dummy3
    (!____ptr).dummy4 = dummy4
    (!____ptr).dummy5 = dummy5
    (!____ptr).dummy6 = dummy6
    (!____ptr).dummy7 = dummy7
    (!____ptr).dummy8 = dummy8
    (!____ptr).dummy9 = dummy9
    (!____ptr).dummy10 = dummy10
    (!____ptr).dummy11 = dummy11
    (!____ptr).dummy12 = dummy12
    (!____ptr).dummy13 = dummy13
    (!____ptr).dummy14 = dummy14
    ____ptr
  extension (struct: _GtkTextIter)
    def dummy1 : _root_.glib.all.gpointer = struct._1
    def dummy1_=(value: _root_.glib.all.gpointer): Unit = !struct.at1 = value
    def dummy2 : _root_.glib.all.gpointer = struct._2
    def dummy2_=(value: _root_.glib.all.gpointer): Unit = !struct.at2 = value
    def dummy3 : CInt = struct._3
    def dummy3_=(value: CInt): Unit = !struct.at3 = value
    def dummy4 : CInt = struct._4
    def dummy4_=(value: CInt): Unit = !struct.at4 = value
    def dummy5 : CInt = struct._5
    def dummy5_=(value: CInt): Unit = !struct.at5 = value
    def dummy6 : CInt = struct._6
    def dummy6_=(value: CInt): Unit = !struct.at6 = value
    def dummy7 : CInt = struct._7
    def dummy7_=(value: CInt): Unit = !struct.at7 = value
    def dummy8 : CInt = struct._8
    def dummy8_=(value: CInt): Unit = !struct.at8 = value
    def dummy9 : _root_.glib.all.gpointer = struct._9
    def dummy9_=(value: _root_.glib.all.gpointer): Unit = !struct.at9 = value
    def dummy10 : _root_.glib.all.gpointer = struct._10
    def dummy10_=(value: _root_.glib.all.gpointer): Unit = !struct.at10 = value
    def dummy11 : CInt = struct._11
    def dummy11_=(value: CInt): Unit = !struct.at11 = value
    def dummy12 : CInt = struct._12
    def dummy12_=(value: CInt): Unit = !struct.at12 = value
    def dummy13 : CInt = struct._13
    def dummy13_=(value: CInt): Unit = !struct.at13 = value
    def dummy14 : _root_.glib.all.gpointer = struct._14
    def dummy14_=(value: _root_.glib.all.gpointer): Unit = !struct.at14 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktextmark.h
*/
opaque type _GtkTextMark = CStruct2[_root_.gobject.all.GObject, _root_.glib.all.gpointer]
object _GtkTextMark:
  given _tag: Tag[_GtkTextMark] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObject, _root_.glib.all.gpointer]
  def apply()(using Zone): Ptr[_GtkTextMark] = scala.scalanative.unsafe.alloc[_GtkTextMark](1)
  def apply(parent_instance : _root_.gobject.all.GObject, segment : _root_.glib.all.gpointer)(using Zone): Ptr[_GtkTextMark] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).segment = segment
    ____ptr
  extension (struct: _GtkTextMark)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value
    def segment : _root_.glib.all.gpointer = struct._2
    def segment_=(value: _root_.glib.all.gpointer): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktextmark.h
*/
opaque type _GtkTextMarkClass = CStruct2[_root_.gobject.all.GObjectClass, CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkTextMarkClass:
  given _tag: Tag[_GtkTextMarkClass] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObjectClass, CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkTextMarkClass] = scala.scalanative.unsafe.alloc[_GtkTextMarkClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkTextMarkClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkTextMarkClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._2
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktexttag.h
*/
opaque type _GtkTextTag = CStruct2[_root_.gobject.all.GObject, Ptr[GtkTextTagPrivate]]
object _GtkTextTag:
  given _tag: Tag[_GtkTextTag] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObject, Ptr[GtkTextTagPrivate]]
  def apply()(using Zone): Ptr[_GtkTextTag] = scala.scalanative.unsafe.alloc[_GtkTextTag](1)
  def apply(parent_instance : _root_.gobject.all.GObject, priv : Ptr[GtkTextTagPrivate])(using Zone): Ptr[_GtkTextTag] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr
  extension (struct: _GtkTextTag)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value
    def priv : Ptr[GtkTextTagPrivate] = struct._2
    def priv_=(value: Ptr[GtkTextTagPrivate]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktexttag.h
*/
opaque type _GtkTextTagClass = CStruct2[_root_.gobject.all.GObjectClass, CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkTextTagClass:
  given _tag: Tag[_GtkTextTagClass] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObjectClass, CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkTextTagClass] = scala.scalanative.unsafe.alloc[_GtkTextTagClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkTextTagClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkTextTagClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._2
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktexttag.h
*/
opaque type _GtkTextTagPrivate = CStruct0
object _GtkTextTagPrivate:
  given _tag: Tag[_GtkTextTagPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktexttag.h
*/
opaque type _GtkTextTagTable = CStruct0
object _GtkTextTagTable:
  given _tag: Tag[_GtkTextTagTable] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktextview.h
*/
opaque type _GtkTextView = CStruct2[GtkWidget, Ptr[GtkTextViewPrivate]]
object _GtkTextView:
  given _tag: Tag[_GtkTextView] = Tag.materializeCStruct2Tag[GtkWidget, Ptr[GtkTextViewPrivate]]
  def apply()(using Zone): Ptr[_GtkTextView] = scala.scalanative.unsafe.alloc[_GtkTextView](1)
  def apply(parent_instance : GtkWidget, priv : Ptr[GtkTextViewPrivate])(using Zone): Ptr[_GtkTextView] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr
  extension (struct: _GtkTextView)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value
    def priv : Ptr[GtkTextViewPrivate] = struct._2
    def priv_=(value: Ptr[GtkTextViewPrivate]): Unit = !struct.at2 = value

/**
 * GtkTextViewClass: _class: The object class structure needs to be the first _cursor: The class handler for the `GtkTextView::move-cursor` keybinding signal.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktextview.h
*/
opaque type _GtkTextViewClass = CStruct15[GtkWidgetClass, CFuncPtr4[Ptr[GtkTextView], GtkMovementStep, CInt, _root_.glib.all.gboolean, Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr2[Ptr[GtkTextView], CString, Unit], CFuncPtr3[Ptr[GtkTextView], GtkDeleteType, CInt, Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr1[Ptr[GtkTextView], Ptr[GtkTextBuffer]], CFuncPtr3[Ptr[GtkTextView], GtkTextViewLayer, Ptr[GtkSnapshot], Unit], CFuncPtr5[Ptr[GtkTextView], GtkTextExtendSelection, Ptr[GtkTextIter], Ptr[GtkTextIter], Ptr[GtkTextIter], _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkTextView], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkTextViewClass:
  given _tag: Tag[_GtkTextViewClass] = Tag.materializeCStruct15Tag[GtkWidgetClass, CFuncPtr4[Ptr[GtkTextView], GtkMovementStep, CInt, _root_.glib.all.gboolean, Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr2[Ptr[GtkTextView], CString, Unit], CFuncPtr3[Ptr[GtkTextView], GtkDeleteType, CInt, Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr1[Ptr[GtkTextView], Ptr[GtkTextBuffer]], CFuncPtr3[Ptr[GtkTextView], GtkTextViewLayer, Ptr[GtkSnapshot], Unit], CFuncPtr5[Ptr[GtkTextView], GtkTextExtendSelection, Ptr[GtkTextIter], Ptr[GtkTextIter], Ptr[GtkTextIter], _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkTextView], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkTextViewClass] = scala.scalanative.unsafe.alloc[_GtkTextViewClass](1)
  def apply(parent_class : GtkWidgetClass, move_cursor : CFuncPtr4[Ptr[GtkTextView], GtkMovementStep, CInt, _root_.glib.all.gboolean, Unit], set_anchor : CFuncPtr1[Ptr[GtkTextView], Unit], insert_at_cursor : CFuncPtr2[Ptr[GtkTextView], CString, Unit], delete_from_cursor : CFuncPtr3[Ptr[GtkTextView], GtkDeleteType, CInt, Unit], backspace : CFuncPtr1[Ptr[GtkTextView], Unit], cut_clipboard : CFuncPtr1[Ptr[GtkTextView], Unit], copy_clipboard : CFuncPtr1[Ptr[GtkTextView], Unit], paste_clipboard : CFuncPtr1[Ptr[GtkTextView], Unit], toggle_overwrite : CFuncPtr1[Ptr[GtkTextView], Unit], create_buffer : CFuncPtr1[Ptr[GtkTextView], Ptr[GtkTextBuffer]], snapshot_layer : CFuncPtr3[Ptr[GtkTextView], GtkTextViewLayer, Ptr[GtkSnapshot], Unit], extend_selection : CFuncPtr5[Ptr[GtkTextView], GtkTextExtendSelection, Ptr[GtkTextIter], Ptr[GtkTextIter], Ptr[GtkTextIter], _root_.glib.all.gboolean], insert_emoji : CFuncPtr1[Ptr[GtkTextView], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkTextViewClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).move_cursor = move_cursor
    (!____ptr).set_anchor = set_anchor
    (!____ptr).insert_at_cursor = insert_at_cursor
    (!____ptr).delete_from_cursor = delete_from_cursor
    (!____ptr).backspace = backspace
    (!____ptr).cut_clipboard = cut_clipboard
    (!____ptr).copy_clipboard = copy_clipboard
    (!____ptr).paste_clipboard = paste_clipboard
    (!____ptr).toggle_overwrite = toggle_overwrite
    (!____ptr).create_buffer = create_buffer
    (!____ptr).snapshot_layer = snapshot_layer
    (!____ptr).extend_selection = extend_selection
    (!____ptr).insert_emoji = insert_emoji
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkTextViewClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def move_cursor : CFuncPtr4[Ptr[GtkTextView], GtkMovementStep, CInt, _root_.glib.all.gboolean, Unit] = struct._2
    def move_cursor_=(value: CFuncPtr4[Ptr[GtkTextView], GtkMovementStep, CInt, _root_.glib.all.gboolean, Unit]): Unit = !struct.at2 = value
    def set_anchor : CFuncPtr1[Ptr[GtkTextView], Unit] = struct._3
    def set_anchor_=(value: CFuncPtr1[Ptr[GtkTextView], Unit]): Unit = !struct.at3 = value
    def insert_at_cursor : CFuncPtr2[Ptr[GtkTextView], CString, Unit] = struct._4
    def insert_at_cursor_=(value: CFuncPtr2[Ptr[GtkTextView], CString, Unit]): Unit = !struct.at4 = value
    def delete_from_cursor : CFuncPtr3[Ptr[GtkTextView], GtkDeleteType, CInt, Unit] = struct._5
    def delete_from_cursor_=(value: CFuncPtr3[Ptr[GtkTextView], GtkDeleteType, CInt, Unit]): Unit = !struct.at5 = value
    def backspace : CFuncPtr1[Ptr[GtkTextView], Unit] = struct._6
    def backspace_=(value: CFuncPtr1[Ptr[GtkTextView], Unit]): Unit = !struct.at6 = value
    def cut_clipboard : CFuncPtr1[Ptr[GtkTextView], Unit] = struct._7
    def cut_clipboard_=(value: CFuncPtr1[Ptr[GtkTextView], Unit]): Unit = !struct.at7 = value
    def copy_clipboard : CFuncPtr1[Ptr[GtkTextView], Unit] = struct._8
    def copy_clipboard_=(value: CFuncPtr1[Ptr[GtkTextView], Unit]): Unit = !struct.at8 = value
    def paste_clipboard : CFuncPtr1[Ptr[GtkTextView], Unit] = struct._9
    def paste_clipboard_=(value: CFuncPtr1[Ptr[GtkTextView], Unit]): Unit = !struct.at9 = value
    def toggle_overwrite : CFuncPtr1[Ptr[GtkTextView], Unit] = struct._10
    def toggle_overwrite_=(value: CFuncPtr1[Ptr[GtkTextView], Unit]): Unit = !struct.at10 = value
    def create_buffer : CFuncPtr1[Ptr[GtkTextView], Ptr[GtkTextBuffer]] = struct._11
    def create_buffer_=(value: CFuncPtr1[Ptr[GtkTextView], Ptr[GtkTextBuffer]]): Unit = !struct.at11 = value
    def snapshot_layer : CFuncPtr3[Ptr[GtkTextView], GtkTextViewLayer, Ptr[GtkSnapshot], Unit] = struct._12
    def snapshot_layer_=(value: CFuncPtr3[Ptr[GtkTextView], GtkTextViewLayer, Ptr[GtkSnapshot], Unit]): Unit = !struct.at12 = value
    def extend_selection : CFuncPtr5[Ptr[GtkTextView], GtkTextExtendSelection, Ptr[GtkTextIter], Ptr[GtkTextIter], Ptr[GtkTextIter], _root_.glib.all.gboolean] = struct._13
    def extend_selection_=(value: CFuncPtr5[Ptr[GtkTextView], GtkTextExtendSelection, Ptr[GtkTextIter], Ptr[GtkTextIter], Ptr[GtkTextIter], _root_.glib.all.gboolean]): Unit = !struct.at13 = value
    def insert_emoji : CFuncPtr1[Ptr[GtkTextView], Unit] = struct._14
    def insert_emoji_=(value: CFuncPtr1[Ptr[GtkTextView], Unit]): Unit = !struct.at14 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._15
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at15 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktextview.h
*/
opaque type _GtkTextViewPrivate = CStruct0
object _GtkTextViewPrivate:
  given _tag: Tag[_GtkTextViewPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktogglebutton.h
*/
opaque type _GtkToggleButton = CStruct1[GtkButton]
object _GtkToggleButton:
  given _tag: Tag[_GtkToggleButton] = Tag.materializeCStruct1Tag[GtkButton]
  def apply()(using Zone): Ptr[_GtkToggleButton] = scala.scalanative.unsafe.alloc[_GtkToggleButton](1)
  def apply(button : GtkButton)(using Zone): Ptr[_GtkToggleButton] = 
    val ____ptr = apply()
    (!____ptr).button = button
    ____ptr
  extension (struct: _GtkToggleButton)
    def button : GtkButton = struct._1
    def button_=(value: GtkButton): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktogglebutton.h
*/
opaque type _GtkToggleButtonClass = CStruct3[GtkButtonClass, CFuncPtr1[Ptr[GtkToggleButton], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkToggleButtonClass:
  given _tag: Tag[_GtkToggleButtonClass] = Tag.materializeCStruct3Tag[GtkButtonClass, CFuncPtr1[Ptr[GtkToggleButton], Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkToggleButtonClass] = scala.scalanative.unsafe.alloc[_GtkToggleButtonClass](1)
  def apply(parent_class : GtkButtonClass, toggled : CFuncPtr1[Ptr[GtkToggleButton], Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkToggleButtonClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).toggled = toggled
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkToggleButtonClass)
    def parent_class : GtkButtonClass = struct._1
    def parent_class_=(value: GtkButtonClass): Unit = !struct.at1 = value
    def toggled : CFuncPtr1[Ptr[GtkToggleButton], Unit] = struct._2
    def toggled_=(value: CFuncPtr1[Ptr[GtkToggleButton], Unit]): Unit = !struct.at2 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._3
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktypes.h
*/
opaque type _GtkTooltip = CStruct0
object _GtkTooltip:
  given _tag: Tag[_GtkTooltip] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreednd.h
*/
opaque type _GtkTreeDragDest = CStruct0
object _GtkTreeDragDest:
  given _tag: Tag[_GtkTreeDragDest] = Tag.materializeCStruct0Tag

/**
 * GtkTreeDragDestIface: _data_received: Asks the `GtkTreeDragDest` to insert a row before the path dest, deriving the contents of the row from selection_data. _drop_possible: Determines whether a drop is possible before the given dest_path, at the same depth as dest_path.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreednd.h
*/
opaque type _GtkTreeDragDestIface = CStruct3[_root_.gobject.all.GTypeInterface, CFuncPtr3[Ptr[GtkTreeDragDest], Ptr[GtkTreePath], Ptr[_root_.gobject.all.GValue], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkTreeDragDest], Ptr[GtkTreePath], Ptr[_root_.gobject.all.GValue], _root_.glib.all.gboolean]]
object _GtkTreeDragDestIface:
  given _tag: Tag[_GtkTreeDragDestIface] = Tag.materializeCStruct3Tag[_root_.gobject.all.GTypeInterface, CFuncPtr3[Ptr[GtkTreeDragDest], Ptr[GtkTreePath], Ptr[_root_.gobject.all.GValue], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkTreeDragDest], Ptr[GtkTreePath], Ptr[_root_.gobject.all.GValue], _root_.glib.all.gboolean]]
  def apply()(using Zone): Ptr[_GtkTreeDragDestIface] = scala.scalanative.unsafe.alloc[_GtkTreeDragDestIface](1)
  def apply(g_iface : _root_.gobject.all.GTypeInterface, drag_data_received : CFuncPtr3[Ptr[GtkTreeDragDest], Ptr[GtkTreePath], Ptr[_root_.gobject.all.GValue], _root_.glib.all.gboolean], row_drop_possible : CFuncPtr3[Ptr[GtkTreeDragDest], Ptr[GtkTreePath], Ptr[_root_.gobject.all.GValue], _root_.glib.all.gboolean])(using Zone): Ptr[_GtkTreeDragDestIface] = 
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).drag_data_received = drag_data_received
    (!____ptr).row_drop_possible = row_drop_possible
    ____ptr
  extension (struct: _GtkTreeDragDestIface)
    def g_iface : _root_.gobject.all.GTypeInterface = struct._1
    def g_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def drag_data_received : CFuncPtr3[Ptr[GtkTreeDragDest], Ptr[GtkTreePath], Ptr[_root_.gobject.all.GValue], _root_.glib.all.gboolean] = struct._2
    def drag_data_received_=(value: CFuncPtr3[Ptr[GtkTreeDragDest], Ptr[GtkTreePath], Ptr[_root_.gobject.all.GValue], _root_.glib.all.gboolean]): Unit = !struct.at2 = value
    def row_drop_possible : CFuncPtr3[Ptr[GtkTreeDragDest], Ptr[GtkTreePath], Ptr[_root_.gobject.all.GValue], _root_.glib.all.gboolean] = struct._3
    def row_drop_possible_=(value: CFuncPtr3[Ptr[GtkTreeDragDest], Ptr[GtkTreePath], Ptr[_root_.gobject.all.GValue], _root_.glib.all.gboolean]): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreednd.h
*/
opaque type _GtkTreeDragSource = CStruct0
object _GtkTreeDragSource:
  given _tag: Tag[_GtkTreeDragSource] = Tag.materializeCStruct0Tag

/**
 * GtkTreeDragSourceIface: _draggable: Asks the `GtkTreeDragSource` whether a particular row can be used as the source of a DND operation. _data_get: Asks the `GtkTreeDragSource` to fill in selection_data with a representation of the row at path. _data_delete: Asks the `GtkTreeDragSource` to delete the row at path, because it was moved somewhere else via drag-and-drop.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreednd.h
*/
opaque type _GtkTreeDragSourceIface = CStruct4[_root_.gobject.all.GTypeInterface, CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], Ptr[GdkContentProvider]], CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], _root_.glib.all.gboolean]]
object _GtkTreeDragSourceIface:
  given _tag: Tag[_GtkTreeDragSourceIface] = Tag.materializeCStruct4Tag[_root_.gobject.all.GTypeInterface, CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], Ptr[GdkContentProvider]], CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], _root_.glib.all.gboolean]]
  def apply()(using Zone): Ptr[_GtkTreeDragSourceIface] = scala.scalanative.unsafe.alloc[_GtkTreeDragSourceIface](1)
  def apply(g_iface : _root_.gobject.all.GTypeInterface, row_draggable : CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], _root_.glib.all.gboolean], drag_data_get : CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], Ptr[GdkContentProvider]], drag_data_delete : CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], _root_.glib.all.gboolean])(using Zone): Ptr[_GtkTreeDragSourceIface] = 
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).row_draggable = row_draggable
    (!____ptr).drag_data_get = drag_data_get
    (!____ptr).drag_data_delete = drag_data_delete
    ____ptr
  extension (struct: _GtkTreeDragSourceIface)
    def g_iface : _root_.gobject.all.GTypeInterface = struct._1
    def g_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def row_draggable : CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], _root_.glib.all.gboolean] = struct._2
    def row_draggable_=(value: CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], _root_.glib.all.gboolean]): Unit = !struct.at2 = value
    def drag_data_get : CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], Ptr[GdkContentProvider]] = struct._3
    def drag_data_get_=(value: CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], Ptr[GdkContentProvider]]): Unit = !struct.at3 = value
    def drag_data_delete : CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], _root_.glib.all.gboolean] = struct._4
    def drag_data_delete_=(value: CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], _root_.glib.all.gboolean]): Unit = !struct.at4 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreeexpander.h
*/
opaque type _GtkTreeExpander = CStruct0
object _GtkTreeExpander:
  given _tag: Tag[_GtkTreeExpander] = Tag.materializeCStruct0Tag

/**
 * GtkTreeIter: : a unique stamp to catch invalid iterators _data: model-specific data _data2: model-specific data _data3: model-specific data

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreemodel.h
*/
opaque type _GtkTreeIter = CStruct4[CInt, _root_.glib.all.gpointer, _root_.glib.all.gpointer, _root_.glib.all.gpointer]
object _GtkTreeIter:
  given _tag: Tag[_GtkTreeIter] = Tag.materializeCStruct4Tag[CInt, _root_.glib.all.gpointer, _root_.glib.all.gpointer, _root_.glib.all.gpointer]
  def apply()(using Zone): Ptr[_GtkTreeIter] = scala.scalanative.unsafe.alloc[_GtkTreeIter](1)
  def apply(stamp : CInt, user_data : _root_.glib.all.gpointer, user_data2 : _root_.glib.all.gpointer, user_data3 : _root_.glib.all.gpointer)(using Zone): Ptr[_GtkTreeIter] = 
    val ____ptr = apply()
    (!____ptr).stamp = stamp
    (!____ptr).user_data = user_data
    (!____ptr).user_data2 = user_data2
    (!____ptr).user_data3 = user_data3
    ____ptr
  extension (struct: _GtkTreeIter)
    def stamp : CInt = struct._1
    def stamp_=(value: CInt): Unit = !struct.at1 = value
    def user_data : _root_.glib.all.gpointer = struct._2
    def user_data_=(value: _root_.glib.all.gpointer): Unit = !struct.at2 = value
    def user_data2 : _root_.glib.all.gpointer = struct._3
    def user_data2_=(value: _root_.glib.all.gpointer): Unit = !struct.at3 = value
    def user_data3 : _root_.glib.all.gpointer = struct._4
    def user_data3_=(value: _root_.glib.all.gpointer): Unit = !struct.at4 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistmodel.h
*/
opaque type _GtkTreeListModel = CStruct0
object _GtkTreeListModel:
  given _tag: Tag[_GtkTreeListModel] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistmodel.h
*/
opaque type _GtkTreeListRow = CStruct0
object _GtkTreeListRow:
  given _tag: Tag[_GtkTreeListRow] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreelistrowsorter.h
*/
opaque type _GtkTreeListRowSorter = CStruct0
object _GtkTreeListRowSorter:
  given _tag: Tag[_GtkTreeListRowSorter] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreemodel.h
*/
opaque type _GtkTreeModel = CStruct0
object _GtkTreeModel:
  given _tag: Tag[_GtkTreeModel] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreemodelfilter.h
*/
opaque type _GtkTreeModelFilter = CStruct2[_root_.gobject.all.GObject, Ptr[GtkTreeModelFilterPrivate]]
object _GtkTreeModelFilter:
  given _tag: Tag[_GtkTreeModelFilter] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObject, Ptr[GtkTreeModelFilterPrivate]]
  def apply()(using Zone): Ptr[_GtkTreeModelFilter] = scala.scalanative.unsafe.alloc[_GtkTreeModelFilter](1)
  def apply(parent : _root_.gobject.all.GObject, priv : Ptr[GtkTreeModelFilterPrivate])(using Zone): Ptr[_GtkTreeModelFilter] = 
    val ____ptr = apply()
    (!____ptr).parent = parent
    (!____ptr).priv = priv
    ____ptr
  extension (struct: _GtkTreeModelFilter)
    def parent : _root_.gobject.all.GObject = struct._1
    def parent_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value
    def priv : Ptr[GtkTreeModelFilterPrivate] = struct._2
    def priv_=(value: Ptr[GtkTreeModelFilterPrivate]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreemodelfilter.h
*/
opaque type _GtkTreeModelFilterClass = CStruct4[_root_.gobject.all.GObjectClass, CFuncPtr3[Ptr[GtkTreeModelFilter], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean], CFuncPtr5[Ptr[GtkTreeModelFilter], Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[_root_.gobject.all.GValue], CInt, Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkTreeModelFilterClass:
  given _tag: Tag[_GtkTreeModelFilterClass] = Tag.materializeCStruct4Tag[_root_.gobject.all.GObjectClass, CFuncPtr3[Ptr[GtkTreeModelFilter], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean], CFuncPtr5[Ptr[GtkTreeModelFilter], Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[_root_.gobject.all.GValue], CInt, Unit], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkTreeModelFilterClass] = scala.scalanative.unsafe.alloc[_GtkTreeModelFilterClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, visible : CFuncPtr3[Ptr[GtkTreeModelFilter], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean], modify : CFuncPtr5[Ptr[GtkTreeModelFilter], Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[_root_.gobject.all.GValue], CInt, Unit], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkTreeModelFilterClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).visible = visible
    (!____ptr).modify = modify
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkTreeModelFilterClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def visible : CFuncPtr3[Ptr[GtkTreeModelFilter], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean] = struct._2
    def visible_=(value: CFuncPtr3[Ptr[GtkTreeModelFilter], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean]): Unit = !struct.at2 = value
    def modify : CFuncPtr5[Ptr[GtkTreeModelFilter], Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[_root_.gobject.all.GValue], CInt, Unit] = struct._3
    def modify_=(value: CFuncPtr5[Ptr[GtkTreeModelFilter], Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[_root_.gobject.all.GValue], CInt, Unit]): Unit = !struct.at3 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._4
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at4 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreemodelfilter.h
*/
opaque type _GtkTreeModelFilterPrivate = CStruct0
object _GtkTreeModelFilterPrivate:
  given _tag: Tag[_GtkTreeModelFilterPrivate] = Tag.materializeCStruct0Tag

/**
 * GtkTreeModelIface: _changed: Signal emitted when a row in the model has changed. _inserted: Signal emitted when a new row has been inserted in the model. _has_child_toggled: Signal emitted when a row has gotten the first child row or lost its last child row. _deleted: Signal emitted when a row has been deleted. _reordered: Signal emitted when the children of a node in the GtkTreeModel have been reordered. _flags: Get `GtkTreeModelFlags` supported by this interface. _n_columns: Get the number of columns supported by the model. _column_type: Get the type of the column. _iter: Sets iter to a valid iterator pointing to path. _path: Gets a newly-created `GtkTreePath` referenced by iter. _value: Initializes and sets value to that at column. _next: Sets iter to point to the node following it at the current level. _previous: Sets iter to point to the previous node at the current level. _children: Sets iter to point to the first child of parent. _has_child: %TRUE if iter has children, %FALSE otherwise. _n_children: Gets the number of children that iter has. _nth_child: Sets iter to be the child of parent, using the given index. _parent: Sets iter to be the parent of child. _node: Lets the tree ref the node. _node: Lets the tree unref the node.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreemodel.h
*/
opaque type _GtkTreeModelIface = CStruct21[_root_.gobject.all.GTypeInterface, CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit], CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit], CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreePath], Unit], CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Ptr[CInt], Unit], CFuncPtr1[Ptr[GtkTreeModel], GtkTreeModelFlags], CFuncPtr1[Ptr[GtkTreeModel], CInt], CFuncPtr2[Ptr[GtkTreeModel], CInt, _root_.gobject.all.GType], CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreePath]], CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], CInt, Ptr[_root_.gobject.all.GValue], Unit], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], CInt], CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], CInt, _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Unit], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Unit]]
object _GtkTreeModelIface:
  given _tag: Tag[_GtkTreeModelIface] = Tag.materializeCStruct21Tag[_root_.gobject.all.GTypeInterface, CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit], CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit], CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreePath], Unit], CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Ptr[CInt], Unit], CFuncPtr1[Ptr[GtkTreeModel], GtkTreeModelFlags], CFuncPtr1[Ptr[GtkTreeModel], CInt], CFuncPtr2[Ptr[GtkTreeModel], CInt, _root_.gobject.all.GType], CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreePath]], CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], CInt, Ptr[_root_.gobject.all.GValue], Unit], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], CInt], CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], CInt, _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Unit], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Unit]]
  def apply()(using Zone): Ptr[_GtkTreeModelIface] = scala.scalanative.unsafe.alloc[_GtkTreeModelIface](1)
  def apply(g_iface : _root_.gobject.all.GTypeInterface, row_changed : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit], row_inserted : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit], row_has_child_toggled : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit], row_deleted : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreePath], Unit], rows_reordered : CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Ptr[CInt], Unit], get_flags : CFuncPtr1[Ptr[GtkTreeModel], GtkTreeModelFlags], get_n_columns : CFuncPtr1[Ptr[GtkTreeModel], CInt], get_column_type : CFuncPtr2[Ptr[GtkTreeModel], CInt, _root_.gobject.all.GType], get_iter : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.glib.all.gboolean], get_path : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreePath]], get_value : CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], CInt, Ptr[_root_.gobject.all.GValue], Unit], iter_next : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean], iter_previous : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean], iter_children : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.glib.all.gboolean], iter_has_child : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean], iter_n_children : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], CInt], iter_nth_child : CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], CInt, _root_.glib.all.gboolean], iter_parent : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.glib.all.gboolean], ref_node : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Unit], unref_node : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Unit])(using Zone): Ptr[_GtkTreeModelIface] = 
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).row_changed = row_changed
    (!____ptr).row_inserted = row_inserted
    (!____ptr).row_has_child_toggled = row_has_child_toggled
    (!____ptr).row_deleted = row_deleted
    (!____ptr).rows_reordered = rows_reordered
    (!____ptr).get_flags = get_flags
    (!____ptr).get_n_columns = get_n_columns
    (!____ptr).get_column_type = get_column_type
    (!____ptr).get_iter = get_iter
    (!____ptr).get_path = get_path
    (!____ptr).get_value = get_value
    (!____ptr).iter_next = iter_next
    (!____ptr).iter_previous = iter_previous
    (!____ptr).iter_children = iter_children
    (!____ptr).iter_has_child = iter_has_child
    (!____ptr).iter_n_children = iter_n_children
    (!____ptr).iter_nth_child = iter_nth_child
    (!____ptr).iter_parent = iter_parent
    (!____ptr).ref_node = ref_node
    (!____ptr).unref_node = unref_node
    ____ptr
  extension (struct: _GtkTreeModelIface)
    def g_iface : _root_.gobject.all.GTypeInterface = struct._1
    def g_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def row_changed : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit] = struct._2
    def row_changed_=(value: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit]): Unit = !struct.at2 = value
    def row_inserted : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit] = struct._3
    def row_inserted_=(value: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit]): Unit = !struct.at3 = value
    def row_has_child_toggled : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit] = struct._4
    def row_has_child_toggled_=(value: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit]): Unit = !struct.at4 = value
    def row_deleted : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreePath], Unit] = struct._5
    def row_deleted_=(value: CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreePath], Unit]): Unit = !struct.at5 = value
    def rows_reordered : CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Ptr[CInt], Unit] = struct._6
    def rows_reordered_=(value: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Ptr[CInt], Unit]): Unit = !struct.at6 = value
    def get_flags : CFuncPtr1[Ptr[GtkTreeModel], GtkTreeModelFlags] = struct._7
    def get_flags_=(value: CFuncPtr1[Ptr[GtkTreeModel], GtkTreeModelFlags]): Unit = !struct.at7 = value
    def get_n_columns : CFuncPtr1[Ptr[GtkTreeModel], CInt] = struct._8
    def get_n_columns_=(value: CFuncPtr1[Ptr[GtkTreeModel], CInt]): Unit = !struct.at8 = value
    def get_column_type : CFuncPtr2[Ptr[GtkTreeModel], CInt, _root_.gobject.all.GType] = struct._9
    def get_column_type_=(value: CFuncPtr2[Ptr[GtkTreeModel], CInt, _root_.gobject.all.GType]): Unit = !struct.at9 = value
    def get_iter : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.glib.all.gboolean] = struct._10
    def get_iter_=(value: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.glib.all.gboolean]): Unit = !struct.at10 = value
    def get_path : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreePath]] = struct._11
    def get_path_=(value: CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreePath]]): Unit = !struct.at11 = value
    def get_value : CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], CInt, Ptr[_root_.gobject.all.GValue], Unit] = struct._12
    def get_value_=(value: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], CInt, Ptr[_root_.gobject.all.GValue], Unit]): Unit = !struct.at12 = value
    def iter_next : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean] = struct._13
    def iter_next_=(value: CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean]): Unit = !struct.at13 = value
    def iter_previous : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean] = struct._14
    def iter_previous_=(value: CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean]): Unit = !struct.at14 = value
    def iter_children : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.glib.all.gboolean] = struct._15
    def iter_children_=(value: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.glib.all.gboolean]): Unit = !struct.at15 = value
    def iter_has_child : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean] = struct._16
    def iter_has_child_=(value: CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.glib.all.gboolean]): Unit = !struct.at16 = value
    def iter_n_children : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], CInt] = struct._17
    def iter_n_children_=(value: CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], CInt]): Unit = !struct.at17 = value
    def iter_nth_child : CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], CInt, _root_.glib.all.gboolean] = struct._18
    def iter_nth_child_=(value: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], CInt, _root_.glib.all.gboolean]): Unit = !struct.at18 = value
    def iter_parent : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.glib.all.gboolean] = struct._19
    def iter_parent_=(value: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.glib.all.gboolean]): Unit = !struct.at19 = value
    def ref_node : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Unit] = struct._20
    def ref_node_=(value: CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Unit]): Unit = !struct.at20 = value
    def unref_node : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Unit] = struct._21
    def unref_node_=(value: CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Unit]): Unit = !struct.at21 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreemodelsort.h
*/
opaque type _GtkTreeModelSort = CStruct2[_root_.gobject.all.GObject, Ptr[GtkTreeModelSortPrivate]]
object _GtkTreeModelSort:
  given _tag: Tag[_GtkTreeModelSort] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObject, Ptr[GtkTreeModelSortPrivate]]
  def apply()(using Zone): Ptr[_GtkTreeModelSort] = scala.scalanative.unsafe.alloc[_GtkTreeModelSort](1)
  def apply(parent : _root_.gobject.all.GObject, priv : Ptr[GtkTreeModelSortPrivate])(using Zone): Ptr[_GtkTreeModelSort] = 
    val ____ptr = apply()
    (!____ptr).parent = parent
    (!____ptr).priv = priv
    ____ptr
  extension (struct: _GtkTreeModelSort)
    def parent : _root_.gobject.all.GObject = struct._1
    def parent_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value
    def priv : Ptr[GtkTreeModelSortPrivate] = struct._2
    def priv_=(value: Ptr[GtkTreeModelSortPrivate]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreemodelsort.h
*/
opaque type _GtkTreeModelSortClass = CStruct2[_root_.gobject.all.GObjectClass, CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkTreeModelSortClass:
  given _tag: Tag[_GtkTreeModelSortClass] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObjectClass, CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkTreeModelSortClass] = scala.scalanative.unsafe.alloc[_GtkTreeModelSortClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkTreeModelSortClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkTreeModelSortClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._2
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreemodelsort.h
*/
opaque type _GtkTreeModelSortPrivate = CStruct0
object _GtkTreeModelSortPrivate:
  given _tag: Tag[_GtkTreeModelSortPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreemodel.h
*/
opaque type _GtkTreePath = CStruct0
object _GtkTreePath:
  given _tag: Tag[_GtkTreePath] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreemodel.h
*/
opaque type _GtkTreeRowReference = CStruct0
object _GtkTreeRowReference:
  given _tag: Tag[_GtkTreeRowReference] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreeview.h
*/
opaque type _GtkTreeSelection = CStruct0
object _GtkTreeSelection:
  given _tag: Tag[_GtkTreeSelection] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreesortable.h
*/
opaque type _GtkTreeSortable = CStruct0
object _GtkTreeSortable:
  given _tag: Tag[_GtkTreeSortable] = Tag.materializeCStruct0Tag

/**
 * _column_changed: Signal emitted when the sort column or sort order of sortable is changed. _sort_column_id: Fills in sort_column_id and order with the current sort column and the order.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreesortable.h
*/
opaque type _GtkTreeSortableIface = CStruct7[_root_.gobject.all.GTypeInterface, CFuncPtr1[Ptr[GtkTreeSortable], Unit], CFuncPtr3[Ptr[GtkTreeSortable], Ptr[CInt], Ptr[GtkSortType], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkTreeSortable], CInt, GtkSortType, Unit], CFuncPtr5[Ptr[GtkTreeSortable], CInt, GtkTreeIterCompareFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit], CFuncPtr4[Ptr[GtkTreeSortable], GtkTreeIterCompareFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit], CFuncPtr1[Ptr[GtkTreeSortable], _root_.glib.all.gboolean]]
object _GtkTreeSortableIface:
  given _tag: Tag[_GtkTreeSortableIface] = Tag.materializeCStruct7Tag[_root_.gobject.all.GTypeInterface, CFuncPtr1[Ptr[GtkTreeSortable], Unit], CFuncPtr3[Ptr[GtkTreeSortable], Ptr[CInt], Ptr[GtkSortType], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkTreeSortable], CInt, GtkSortType, Unit], CFuncPtr5[Ptr[GtkTreeSortable], CInt, GtkTreeIterCompareFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit], CFuncPtr4[Ptr[GtkTreeSortable], GtkTreeIterCompareFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit], CFuncPtr1[Ptr[GtkTreeSortable], _root_.glib.all.gboolean]]
  def apply()(using Zone): Ptr[_GtkTreeSortableIface] = scala.scalanative.unsafe.alloc[_GtkTreeSortableIface](1)
  def apply(g_iface : _root_.gobject.all.GTypeInterface, sort_column_changed : CFuncPtr1[Ptr[GtkTreeSortable], Unit], get_sort_column_id : CFuncPtr3[Ptr[GtkTreeSortable], Ptr[CInt], Ptr[GtkSortType], _root_.glib.all.gboolean], set_sort_column_id : CFuncPtr3[Ptr[GtkTreeSortable], CInt, GtkSortType, Unit], set_sort_func : CFuncPtr5[Ptr[GtkTreeSortable], CInt, GtkTreeIterCompareFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit], set_default_sort_func : CFuncPtr4[Ptr[GtkTreeSortable], GtkTreeIterCompareFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit], has_default_sort_func : CFuncPtr1[Ptr[GtkTreeSortable], _root_.glib.all.gboolean])(using Zone): Ptr[_GtkTreeSortableIface] = 
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).sort_column_changed = sort_column_changed
    (!____ptr).get_sort_column_id = get_sort_column_id
    (!____ptr).set_sort_column_id = set_sort_column_id
    (!____ptr).set_sort_func = set_sort_func
    (!____ptr).set_default_sort_func = set_default_sort_func
    (!____ptr).has_default_sort_func = has_default_sort_func
    ____ptr
  extension (struct: _GtkTreeSortableIface)
    def g_iface : _root_.gobject.all.GTypeInterface = struct._1
    def g_iface_=(value: _root_.gobject.all.GTypeInterface): Unit = !struct.at1 = value
    def sort_column_changed : CFuncPtr1[Ptr[GtkTreeSortable], Unit] = struct._2
    def sort_column_changed_=(value: CFuncPtr1[Ptr[GtkTreeSortable], Unit]): Unit = !struct.at2 = value
    def get_sort_column_id : CFuncPtr3[Ptr[GtkTreeSortable], Ptr[CInt], Ptr[GtkSortType], _root_.glib.all.gboolean] = struct._3
    def get_sort_column_id_=(value: CFuncPtr3[Ptr[GtkTreeSortable], Ptr[CInt], Ptr[GtkSortType], _root_.glib.all.gboolean]): Unit = !struct.at3 = value
    def set_sort_column_id : CFuncPtr3[Ptr[GtkTreeSortable], CInt, GtkSortType, Unit] = struct._4
    def set_sort_column_id_=(value: CFuncPtr3[Ptr[GtkTreeSortable], CInt, GtkSortType, Unit]): Unit = !struct.at4 = value
    def set_sort_func : CFuncPtr5[Ptr[GtkTreeSortable], CInt, GtkTreeIterCompareFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit] = struct._5
    def set_sort_func_=(value: CFuncPtr5[Ptr[GtkTreeSortable], CInt, GtkTreeIterCompareFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit]): Unit = !struct.at5 = value
    def set_default_sort_func : CFuncPtr4[Ptr[GtkTreeSortable], GtkTreeIterCompareFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit] = struct._6
    def set_default_sort_func_=(value: CFuncPtr4[Ptr[GtkTreeSortable], GtkTreeIterCompareFunc, _root_.glib.all.gpointer, _root_.glib.all.GDestroyNotify, Unit]): Unit = !struct.at6 = value
    def has_default_sort_func : CFuncPtr1[Ptr[GtkTreeSortable], _root_.glib.all.gboolean] = struct._7
    def has_default_sort_func_=(value: CFuncPtr1[Ptr[GtkTreeSortable], _root_.glib.all.gboolean]): Unit = !struct.at7 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreestore.h
*/
opaque type _GtkTreeStore = CStruct2[_root_.gobject.all.GObject, Ptr[GtkTreeStorePrivate]]
object _GtkTreeStore:
  given _tag: Tag[_GtkTreeStore] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObject, Ptr[GtkTreeStorePrivate]]
  def apply()(using Zone): Ptr[_GtkTreeStore] = scala.scalanative.unsafe.alloc[_GtkTreeStore](1)
  def apply(parent : _root_.gobject.all.GObject, priv : Ptr[GtkTreeStorePrivate])(using Zone): Ptr[_GtkTreeStore] = 
    val ____ptr = apply()
    (!____ptr).parent = parent
    (!____ptr).priv = priv
    ____ptr
  extension (struct: _GtkTreeStore)
    def parent : _root_.gobject.all.GObject = struct._1
    def parent_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value
    def priv : Ptr[GtkTreeStorePrivate] = struct._2
    def priv_=(value: Ptr[GtkTreeStorePrivate]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreestore.h
*/
opaque type _GtkTreeStoreClass = CStruct2[_root_.gobject.all.GObjectClass, CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkTreeStoreClass:
  given _tag: Tag[_GtkTreeStoreClass] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObjectClass, CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkTreeStoreClass] = scala.scalanative.unsafe.alloc[_GtkTreeStoreClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkTreeStoreClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkTreeStoreClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._2
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreestore.h
*/
opaque type _GtkTreeStorePrivate = CStruct0
object _GtkTreeStorePrivate:
  given _tag: Tag[_GtkTreeStorePrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreeview.h
*/
opaque type _GtkTreeView = CStruct1[GtkWidget]
object _GtkTreeView:
  given _tag: Tag[_GtkTreeView] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[_GtkTreeView] = scala.scalanative.unsafe.alloc[_GtkTreeView](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[_GtkTreeView] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkTreeView)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreeview.h
*/
opaque type _GtkTreeViewClass = CStruct17[GtkWidgetClass, CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], Ptr[GtkTreeViewColumn], Unit], CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], Unit], CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], Unit], CFuncPtr1[Ptr[GtkTreeView], Unit], CFuncPtr1[Ptr[GtkTreeView], Unit], CFuncPtr5[Ptr[GtkTreeView], GtkMovementStep, CInt, _root_.glib.all.gboolean, _root_.glib.all.gboolean, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkTreeView], _root_.glib.all.gboolean, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean], CFuncPtr4[Ptr[GtkTreeView], _root_.glib.all.gboolean, _root_.glib.all.gboolean, _root_.glib.all.gboolean, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean], CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._6]]]
object _GtkTreeViewClass:
  given _tag: Tag[_GtkTreeViewClass] = Tag.materializeCStruct17Tag[GtkWidgetClass, CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], Ptr[GtkTreeViewColumn], Unit], CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.glib.all.gboolean], CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], Unit], CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], Unit], CFuncPtr1[Ptr[GtkTreeView], Unit], CFuncPtr1[Ptr[GtkTreeView], Unit], CFuncPtr5[Ptr[GtkTreeView], GtkMovementStep, CInt, _root_.glib.all.gboolean, _root_.glib.all.gboolean, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean], CFuncPtr2[Ptr[GtkTreeView], _root_.glib.all.gboolean, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean], CFuncPtr4[Ptr[GtkTreeView], _root_.glib.all.gboolean, _root_.glib.all.gboolean, _root_.glib.all.gboolean, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean], CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._6]]]
  def apply()(using Zone): Ptr[_GtkTreeViewClass] = scala.scalanative.unsafe.alloc[_GtkTreeViewClass](1)
  def apply(parent_class : GtkWidgetClass, row_activated : CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], Ptr[GtkTreeViewColumn], Unit], test_expand_row : CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.glib.all.gboolean], test_collapse_row : CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.glib.all.gboolean], row_expanded : CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], Unit], row_collapsed : CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], Unit], columns_changed : CFuncPtr1[Ptr[GtkTreeView], Unit], cursor_changed : CFuncPtr1[Ptr[GtkTreeView], Unit], move_cursor : CFuncPtr5[Ptr[GtkTreeView], GtkMovementStep, CInt, _root_.glib.all.gboolean, _root_.glib.all.gboolean, _root_.glib.all.gboolean], select_all : CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean], unselect_all : CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean], select_cursor_row : CFuncPtr2[Ptr[GtkTreeView], _root_.glib.all.gboolean, _root_.glib.all.gboolean], toggle_cursor_row : CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean], expand_collapse_cursor_row : CFuncPtr4[Ptr[GtkTreeView], _root_.glib.all.gboolean, _root_.glib.all.gboolean, _root_.glib.all.gboolean, _root_.glib.all.gboolean], select_cursor_parent : CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean], start_interactive_search : CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean], _reserved : CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._6]])(using Zone): Ptr[_GtkTreeViewClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).row_activated = row_activated
    (!____ptr).test_expand_row = test_expand_row
    (!____ptr).test_collapse_row = test_collapse_row
    (!____ptr).row_expanded = row_expanded
    (!____ptr).row_collapsed = row_collapsed
    (!____ptr).columns_changed = columns_changed
    (!____ptr).cursor_changed = cursor_changed
    (!____ptr).move_cursor = move_cursor
    (!____ptr).select_all = select_all
    (!____ptr).unselect_all = unselect_all
    (!____ptr).select_cursor_row = select_cursor_row
    (!____ptr).toggle_cursor_row = toggle_cursor_row
    (!____ptr).expand_collapse_cursor_row = expand_collapse_cursor_row
    (!____ptr).select_cursor_parent = select_cursor_parent
    (!____ptr).start_interactive_search = start_interactive_search
    (!____ptr)._reserved = _reserved
    ____ptr
  extension (struct: _GtkTreeViewClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def row_activated : CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], Ptr[GtkTreeViewColumn], Unit] = struct._2
    def row_activated_=(value: CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], Ptr[GtkTreeViewColumn], Unit]): Unit = !struct.at2 = value
    def test_expand_row : CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.glib.all.gboolean] = struct._3
    def test_expand_row_=(value: CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.glib.all.gboolean]): Unit = !struct.at3 = value
    def test_collapse_row : CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.glib.all.gboolean] = struct._4
    def test_collapse_row_=(value: CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.glib.all.gboolean]): Unit = !struct.at4 = value
    def row_expanded : CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], Unit] = struct._5
    def row_expanded_=(value: CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], Unit]): Unit = !struct.at5 = value
    def row_collapsed : CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], Unit] = struct._6
    def row_collapsed_=(value: CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], Unit]): Unit = !struct.at6 = value
    def columns_changed : CFuncPtr1[Ptr[GtkTreeView], Unit] = struct._7
    def columns_changed_=(value: CFuncPtr1[Ptr[GtkTreeView], Unit]): Unit = !struct.at7 = value
    def cursor_changed : CFuncPtr1[Ptr[GtkTreeView], Unit] = struct._8
    def cursor_changed_=(value: CFuncPtr1[Ptr[GtkTreeView], Unit]): Unit = !struct.at8 = value
    def move_cursor : CFuncPtr5[Ptr[GtkTreeView], GtkMovementStep, CInt, _root_.glib.all.gboolean, _root_.glib.all.gboolean, _root_.glib.all.gboolean] = struct._9
    def move_cursor_=(value: CFuncPtr5[Ptr[GtkTreeView], GtkMovementStep, CInt, _root_.glib.all.gboolean, _root_.glib.all.gboolean, _root_.glib.all.gboolean]): Unit = !struct.at9 = value
    def select_all : CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean] = struct._10
    def select_all_=(value: CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean]): Unit = !struct.at10 = value
    def unselect_all : CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean] = struct._11
    def unselect_all_=(value: CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean]): Unit = !struct.at11 = value
    def select_cursor_row : CFuncPtr2[Ptr[GtkTreeView], _root_.glib.all.gboolean, _root_.glib.all.gboolean] = struct._12
    def select_cursor_row_=(value: CFuncPtr2[Ptr[GtkTreeView], _root_.glib.all.gboolean, _root_.glib.all.gboolean]): Unit = !struct.at12 = value
    def toggle_cursor_row : CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean] = struct._13
    def toggle_cursor_row_=(value: CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean]): Unit = !struct.at13 = value
    def expand_collapse_cursor_row : CFuncPtr4[Ptr[GtkTreeView], _root_.glib.all.gboolean, _root_.glib.all.gboolean, _root_.glib.all.gboolean, _root_.glib.all.gboolean] = struct._14
    def expand_collapse_cursor_row_=(value: CFuncPtr4[Ptr[GtkTreeView], _root_.glib.all.gboolean, _root_.glib.all.gboolean, _root_.glib.all.gboolean, _root_.glib.all.gboolean]): Unit = !struct.at14 = value
    def select_cursor_parent : CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean] = struct._15
    def select_cursor_parent_=(value: CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean]): Unit = !struct.at15 = value
    def start_interactive_search : CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean] = struct._16
    def start_interactive_search_=(value: CFuncPtr1[Ptr[GtkTreeView], _root_.glib.all.gboolean]): Unit = !struct.at16 = value
    def _reserved : CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._6]] = struct._17
    def _reserved_=(value: CArray[_root_.glib.all.gpointer, Nat.Digit2[Nat._1, Nat._6]]): Unit = !struct.at17 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtktreeviewcolumn.h
*/
opaque type _GtkTreeViewColumn = CStruct0
object _GtkTreeViewColumn:
  given _tag: Tag[_GtkTreeViewColumn] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkvideo.h
*/
opaque type _GtkVideo = CStruct0
object _GtkVideo:
  given _tag: Tag[_GtkVideo] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkviewport.h
*/
opaque type _GtkViewport = CStruct0
object _GtkViewport:
  given _tag: Tag[_GtkViewport] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkvolumebutton.h
*/
opaque type _GtkVolumeButton = CStruct1[GtkScaleButton]
object _GtkVolumeButton:
  given _tag: Tag[_GtkVolumeButton] = Tag.materializeCStruct1Tag[GtkScaleButton]
  def apply()(using Zone): Ptr[_GtkVolumeButton] = scala.scalanative.unsafe.alloc[_GtkVolumeButton](1)
  def apply(parent : GtkScaleButton)(using Zone): Ptr[_GtkVolumeButton] = 
    val ____ptr = apply()
    (!____ptr).parent = parent
    ____ptr
  extension (struct: _GtkVolumeButton)
    def parent : GtkScaleButton = struct._1
    def parent_=(value: GtkScaleButton): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidget.h
*/
opaque type _GtkWidget = CStruct2[_root_.gobject.all.GInitiallyUnowned, Ptr[GtkWidgetPrivate]]
object _GtkWidget:
  given _tag: Tag[_GtkWidget] = Tag.materializeCStruct2Tag[_root_.gobject.all.GInitiallyUnowned, Ptr[GtkWidgetPrivate]]
  def apply()(using Zone): Ptr[_GtkWidget] = scala.scalanative.unsafe.alloc[_GtkWidget](1)
  def apply(parent_instance : _root_.gobject.all.GInitiallyUnowned, priv : Ptr[GtkWidgetPrivate])(using Zone): Ptr[_GtkWidget] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr
  extension (struct: _GtkWidget)
    def parent_instance : _root_.gobject.all.GInitiallyUnowned = struct._1
    def parent_instance_=(value: _root_.gobject.all.GInitiallyUnowned): Unit = !struct.at1 = value
    def priv : Ptr[GtkWidgetPrivate] = struct._2
    def priv_=(value: Ptr[GtkWidgetPrivate]): Unit = !struct.at2 = value

/**
 * GtkWidgetClass: _class: The object class structure needs to be the first element in the widget class structure in order for the class mechanism to work correctly. This allows a GtkWidgetClass pointer to be cast to a GObjectClass pointer. : Signal emitted when widget is shown : Signal emitted when widget is hidden. : Signal emitted when widget is going to be mapped, that is when the widget is visible (which is controlled with gtk_widget_set_visible()) and all its parents up to the toplevel widget are also visible. : Signal emitted when widget is going to be unmapped, which means that either it or any of its parents up to the toplevel widget have been set as hidden. : Signal emitted when widget is associated with a `GdkSurface`, which means that gtk_widget_realize() has been called or the widget has been mapped (that is, it is going to be drawn). : Signal emitted when the GdkSurface associated with widget is destroyed, which means that gtk_widget_unrealize() has been called or the widget has been unmapped (that is, it is going to be hidden). : Called when the widget gets added to a `GtkRoot` widget. Must chain up : Called when the widget is about to be removed from its `GtkRoot` widget. Must chain up _allocate: Called to set the allocation, if the widget does not have a layout manager. _flags_changed: Signal emitted when the widget state changes, see gtk_widget_get_state_flags(). _changed: Signal emitted when the text direction of a widget changes. _request_mode: Called to get the request mode, if the widget does not have a layout manager. This allows a widget to tell its parent container whether it prefers to be allocated in %GTK_SIZE_REQUEST_HEIGHT_FOR_WIDTH or %GTK_SIZE_REQUEST_WIDTH_FOR_HEIGHT mode. %GTK_SIZE_REQUEST_HEIGHT_FOR_WIDTH means the widget prefers to have `GtkWidgetClass.measure()` called first to get the default width (passing a for_size of -1), then again to get the height for said default width. %GTK_SIZE_REQUEST_CONSTANT_SIZE disables any height-for-width or width-for-height geometry management for said widget and is the default return. It’s important to note that any widget which trades height-for-width or width-for-height must respond properly to a for_size value >= -1 passed to `GtkWidgetClass.measure`, for both possible orientations. : Called to obtain the minimum and natural size of the widget, if the widget does not have a layout manager. Depending on the orientation parameter, the passed for_size can be interpreted as width or height. A widget will never be allocated less than its minimum size. _activate: Activates the if _cycling is %FALSE, and just grabs the focus if _cycling is %TRUE. _focus: Causes to have the keyboard focus for the `GtkWindow` it’s inside. : Vfunc for gtk_widget_child_focus()

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidget.h
*/
opaque type _GtkWidgetClass = CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]]
object _GtkWidgetClass:
  given _tag: Tag[_GtkWidgetClass] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]](Tag.Byte, Tag.Digit3[Nat._4, Nat._0, Nat._8](Tag.Nat4, Tag.Nat0, Tag.Nat8))
  def apply()(using Zone): Ptr[_GtkWidgetClass] = scala.scalanative.unsafe.alloc[_GtkWidgetClass](1)
  def apply(parent_class : _root_.gobject.all.GInitiallyUnownedClass, show : CFuncPtr1[Ptr[GtkWidget], Unit], hide : CFuncPtr1[Ptr[GtkWidget], Unit], map : CFuncPtr1[Ptr[GtkWidget], Unit], unmap : CFuncPtr1[Ptr[GtkWidget], Unit], realize : CFuncPtr1[Ptr[GtkWidget], Unit], unrealize : CFuncPtr1[Ptr[GtkWidget], Unit], root : CFuncPtr1[Ptr[GtkWidget], Unit], unroot : CFuncPtr1[Ptr[GtkWidget], Unit], size_allocate : CFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit], state_flags_changed : CFuncPtr2[Ptr[GtkWidget], GtkStateFlags, Unit], direction_changed : CFuncPtr2[Ptr[GtkWidget], GtkTextDirection, Unit], get_request_mode : CFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode], measure : CFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit], mnemonic_activate : CFuncPtr2[Ptr[GtkWidget], _root_.glib.all.gboolean, _root_.glib.all.gboolean], grab_focus : CFuncPtr1[Ptr[GtkWidget], _root_.glib.all.gboolean], focus : CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.glib.all.gboolean], set_focus_child : CFuncPtr2[Ptr[GtkWidget], Ptr[GtkWidget], Unit], move_focus : CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, Unit], keynav_failed : CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.glib.all.gboolean], query_tooltip : CFuncPtr5[Ptr[GtkWidget], CInt, CInt, _root_.glib.all.gboolean, Ptr[GtkTooltip], _root_.glib.all.gboolean], compute_expand : CFuncPtr3[Ptr[GtkWidget], Ptr[_root_.glib.all.gboolean], Ptr[_root_.glib.all.gboolean], Unit], css_changed : CFuncPtr2[Ptr[GtkWidget], Ptr[GtkCssStyleChange], Unit], system_setting_changed : CFuncPtr2[Ptr[GtkWidget], GtkSystemSetting, Unit], snapshot : CFuncPtr2[Ptr[GtkWidget], Ptr[GtkSnapshot], Unit], contains : CFuncPtr3[Ptr[GtkWidget], Double, Double, _root_.glib.all.gboolean], priv : Ptr[GtkWidgetClassPrivate], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkWidgetClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).show = show
    (!____ptr).hide = hide
    (!____ptr).map = map
    (!____ptr).unmap = unmap
    (!____ptr).realize = realize
    (!____ptr).unrealize = unrealize
    (!____ptr).root = root
    (!____ptr).unroot = unroot
    (!____ptr).size_allocate = size_allocate
    (!____ptr).state_flags_changed = state_flags_changed
    (!____ptr).direction_changed = direction_changed
    (!____ptr).get_request_mode = get_request_mode
    (!____ptr).measure = measure
    (!____ptr).mnemonic_activate = mnemonic_activate
    (!____ptr).grab_focus = grab_focus
    (!____ptr).focus = focus
    (!____ptr).set_focus_child = set_focus_child
    (!____ptr).move_focus = move_focus
    (!____ptr).keynav_failed = keynav_failed
    (!____ptr).query_tooltip = query_tooltip
    (!____ptr).compute_expand = compute_expand
    (!____ptr).css_changed = css_changed
    (!____ptr).system_setting_changed = system_setting_changed
    (!____ptr).snapshot = snapshot
    (!____ptr).contains = contains
    (!____ptr).priv = priv
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkWidgetClass)
    def parent_class: _root_.gobject.all.GInitiallyUnownedClass = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GInitiallyUnownedClass]]
    def parent_class_=(value: _root_.gobject.all.GInitiallyUnownedClass): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.gobject.all.GInitiallyUnownedClass]] = value
    def show: CFuncPtr1[Ptr[GtkWidget], Unit] = !struct.at(136).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]]
    def show_=(value: CFuncPtr1[Ptr[GtkWidget], Unit]): Unit = !struct.at(136).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]] = value
    def hide: CFuncPtr1[Ptr[GtkWidget], Unit] = !struct.at(144).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]]
    def hide_=(value: CFuncPtr1[Ptr[GtkWidget], Unit]): Unit = !struct.at(144).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]] = value
    def map: CFuncPtr1[Ptr[GtkWidget], Unit] = !struct.at(152).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]]
    def map_=(value: CFuncPtr1[Ptr[GtkWidget], Unit]): Unit = !struct.at(152).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]] = value
    def unmap: CFuncPtr1[Ptr[GtkWidget], Unit] = !struct.at(160).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]]
    def unmap_=(value: CFuncPtr1[Ptr[GtkWidget], Unit]): Unit = !struct.at(160).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]] = value
    def realize: CFuncPtr1[Ptr[GtkWidget], Unit] = !struct.at(168).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]]
    def realize_=(value: CFuncPtr1[Ptr[GtkWidget], Unit]): Unit = !struct.at(168).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]] = value
    def unrealize: CFuncPtr1[Ptr[GtkWidget], Unit] = !struct.at(176).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]]
    def unrealize_=(value: CFuncPtr1[Ptr[GtkWidget], Unit]): Unit = !struct.at(176).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]] = value
    def root: CFuncPtr1[Ptr[GtkWidget], Unit] = !struct.at(184).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]]
    def root_=(value: CFuncPtr1[Ptr[GtkWidget], Unit]): Unit = !struct.at(184).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]] = value
    def unroot: CFuncPtr1[Ptr[GtkWidget], Unit] = !struct.at(192).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]]
    def unroot_=(value: CFuncPtr1[Ptr[GtkWidget], Unit]): Unit = !struct.at(192).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]] = value
    def size_allocate: CFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit] = !struct.at(200).asInstanceOf[Ptr[CFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit]]]
    def size_allocate_=(value: CFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit]): Unit = !struct.at(200).asInstanceOf[Ptr[CFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit]]] = value
    def state_flags_changed: CFuncPtr2[Ptr[GtkWidget], GtkStateFlags, Unit] = !struct.at(208).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkStateFlags, Unit]]]
    def state_flags_changed_=(value: CFuncPtr2[Ptr[GtkWidget], GtkStateFlags, Unit]): Unit = !struct.at(208).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkStateFlags, Unit]]] = value
    def direction_changed: CFuncPtr2[Ptr[GtkWidget], GtkTextDirection, Unit] = !struct.at(216).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkTextDirection, Unit]]]
    def direction_changed_=(value: CFuncPtr2[Ptr[GtkWidget], GtkTextDirection, Unit]): Unit = !struct.at(216).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkTextDirection, Unit]]] = value
    def get_request_mode: CFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode] = !struct.at(224).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode]]]
    def get_request_mode_=(value: CFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode]): Unit = !struct.at(224).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode]]] = value
    def measure: CFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit] = !struct.at(232).asInstanceOf[Ptr[CFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit]]]
    def measure_=(value: CFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit]): Unit = !struct.at(232).asInstanceOf[Ptr[CFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit]]] = value
    def mnemonic_activate: CFuncPtr2[Ptr[GtkWidget], _root_.glib.all.gboolean, _root_.glib.all.gboolean] = !struct.at(240).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], _root_.glib.all.gboolean, _root_.glib.all.gboolean]]]
    def mnemonic_activate_=(value: CFuncPtr2[Ptr[GtkWidget], _root_.glib.all.gboolean, _root_.glib.all.gboolean]): Unit = !struct.at(240).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], _root_.glib.all.gboolean, _root_.glib.all.gboolean]]] = value
    def grab_focus: CFuncPtr1[Ptr[GtkWidget], _root_.glib.all.gboolean] = !struct.at(248).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], _root_.glib.all.gboolean]]]
    def grab_focus_=(value: CFuncPtr1[Ptr[GtkWidget], _root_.glib.all.gboolean]): Unit = !struct.at(248).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], _root_.glib.all.gboolean]]] = value
    def focus: CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.glib.all.gboolean] = !struct.at(256).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.glib.all.gboolean]]]
    def focus_=(value: CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.glib.all.gboolean]): Unit = !struct.at(256).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.glib.all.gboolean]]] = value
    def set_focus_child: CFuncPtr2[Ptr[GtkWidget], Ptr[GtkWidget], Unit] = !struct.at(264).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], Ptr[GtkWidget], Unit]]]
    def set_focus_child_=(value: CFuncPtr2[Ptr[GtkWidget], Ptr[GtkWidget], Unit]): Unit = !struct.at(264).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], Ptr[GtkWidget], Unit]]] = value
    def move_focus: CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, Unit] = !struct.at(272).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, Unit]]]
    def move_focus_=(value: CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, Unit]): Unit = !struct.at(272).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, Unit]]] = value
    def keynav_failed: CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.glib.all.gboolean] = !struct.at(280).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.glib.all.gboolean]]]
    def keynav_failed_=(value: CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.glib.all.gboolean]): Unit = !struct.at(280).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.glib.all.gboolean]]] = value
    def query_tooltip: CFuncPtr5[Ptr[GtkWidget], CInt, CInt, _root_.glib.all.gboolean, Ptr[GtkTooltip], _root_.glib.all.gboolean] = !struct.at(288).asInstanceOf[Ptr[CFuncPtr5[Ptr[GtkWidget], CInt, CInt, _root_.glib.all.gboolean, Ptr[GtkTooltip], _root_.glib.all.gboolean]]]
    def query_tooltip_=(value: CFuncPtr5[Ptr[GtkWidget], CInt, CInt, _root_.glib.all.gboolean, Ptr[GtkTooltip], _root_.glib.all.gboolean]): Unit = !struct.at(288).asInstanceOf[Ptr[CFuncPtr5[Ptr[GtkWidget], CInt, CInt, _root_.glib.all.gboolean, Ptr[GtkTooltip], _root_.glib.all.gboolean]]] = value
    def compute_expand: CFuncPtr3[Ptr[GtkWidget], Ptr[_root_.glib.all.gboolean], Ptr[_root_.glib.all.gboolean], Unit] = !struct.at(296).asInstanceOf[Ptr[CFuncPtr3[Ptr[GtkWidget], Ptr[_root_.glib.all.gboolean], Ptr[_root_.glib.all.gboolean], Unit]]]
    def compute_expand_=(value: CFuncPtr3[Ptr[GtkWidget], Ptr[_root_.glib.all.gboolean], Ptr[_root_.glib.all.gboolean], Unit]): Unit = !struct.at(296).asInstanceOf[Ptr[CFuncPtr3[Ptr[GtkWidget], Ptr[_root_.glib.all.gboolean], Ptr[_root_.glib.all.gboolean], Unit]]] = value
    def css_changed: CFuncPtr2[Ptr[GtkWidget], Ptr[GtkCssStyleChange], Unit] = !struct.at(304).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], Ptr[GtkCssStyleChange], Unit]]]
    def css_changed_=(value: CFuncPtr2[Ptr[GtkWidget], Ptr[GtkCssStyleChange], Unit]): Unit = !struct.at(304).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], Ptr[GtkCssStyleChange], Unit]]] = value
    def system_setting_changed: CFuncPtr2[Ptr[GtkWidget], GtkSystemSetting, Unit] = !struct.at(312).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkSystemSetting, Unit]]]
    def system_setting_changed_=(value: CFuncPtr2[Ptr[GtkWidget], GtkSystemSetting, Unit]): Unit = !struct.at(312).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkSystemSetting, Unit]]] = value
    def snapshot: CFuncPtr2[Ptr[GtkWidget], Ptr[GtkSnapshot], Unit] = !struct.at(320).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], Ptr[GtkSnapshot], Unit]]]
    def snapshot_=(value: CFuncPtr2[Ptr[GtkWidget], Ptr[GtkSnapshot], Unit]): Unit = !struct.at(320).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], Ptr[GtkSnapshot], Unit]]] = value
    def contains: CFuncPtr3[Ptr[GtkWidget], Double, Double, _root_.glib.all.gboolean] = !struct.at(328).asInstanceOf[Ptr[CFuncPtr3[Ptr[GtkWidget], Double, Double, _root_.glib.all.gboolean]]]
    def contains_=(value: CFuncPtr3[Ptr[GtkWidget], Double, Double, _root_.glib.all.gboolean]): Unit = !struct.at(328).asInstanceOf[Ptr[CFuncPtr3[Ptr[GtkWidget], Double, Double, _root_.glib.all.gboolean]]] = value
    def priv: Ptr[GtkWidgetClassPrivate] = !struct.at(336).asInstanceOf[Ptr[Ptr[GtkWidgetClassPrivate]]]
    def priv_=(value: Ptr[GtkWidgetClassPrivate]): Unit = !struct.at(336).asInstanceOf[Ptr[Ptr[GtkWidgetClassPrivate]]] = value
    def padding: CArray[_root_.glib.all.gpointer, Nat._8] = !struct.at(344).asInstanceOf[Ptr[CArray[_root_.glib.all.gpointer, Nat._8]]]
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at(344).asInstanceOf[Ptr[CArray[_root_.glib.all.gpointer, Nat._8]]] = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidget.h
*/
opaque type _GtkWidgetClassPrivate = CStruct0
object _GtkWidgetClassPrivate:
  given _tag: Tag[_GtkWidgetClassPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidgetpaintable.h
*/
opaque type _GtkWidgetPaintable = CStruct0
object _GtkWidgetPaintable:
  given _tag: Tag[_GtkWidgetPaintable] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwidget.h
*/
opaque type _GtkWidgetPrivate = CStruct0
object _GtkWidgetPrivate:
  given _tag: Tag[_GtkWidgetPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindow.h
*/
opaque type _GtkWindow = CStruct1[GtkWidget]
object _GtkWindow:
  given _tag: Tag[_GtkWindow] = Tag.materializeCStruct1Tag[GtkWidget]
  def apply()(using Zone): Ptr[_GtkWindow] = scala.scalanative.unsafe.alloc[_GtkWindow](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[_GtkWindow] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _GtkWindow)
    def parent_instance : GtkWidget = struct._1
    def parent_instance_=(value: GtkWidget): Unit = !struct.at1 = value

/**
 * GtkWindowClass: _class: The parent class. _focus: Activates the current focused widget within the window. _default: Activates the default widget for the window. _changed: Signal gets emitted when the set of accelerators or mnemonics that are associated with window changes. _debugging: Class handler for the `GtkWindow::enable-debugging` keybinding signal. _request: Class handler for the `GtkWindow::close-request` signal.

 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindow.h
*/
opaque type _GtkWindowClass = CStruct7[GtkWidgetClass, CFuncPtr1[Ptr[GtkWindow], Unit], CFuncPtr1[Ptr[GtkWindow], Unit], CFuncPtr1[Ptr[GtkWindow], Unit], CFuncPtr2[Ptr[GtkWindow], _root_.glib.all.gboolean, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkWindow], _root_.glib.all.gboolean], CArray[_root_.glib.all.gpointer, Nat._8]]
object _GtkWindowClass:
  given _tag: Tag[_GtkWindowClass] = Tag.materializeCStruct7Tag[GtkWidgetClass, CFuncPtr1[Ptr[GtkWindow], Unit], CFuncPtr1[Ptr[GtkWindow], Unit], CFuncPtr1[Ptr[GtkWindow], Unit], CFuncPtr2[Ptr[GtkWindow], _root_.glib.all.gboolean, _root_.glib.all.gboolean], CFuncPtr1[Ptr[GtkWindow], _root_.glib.all.gboolean], CArray[_root_.glib.all.gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GtkWindowClass] = scala.scalanative.unsafe.alloc[_GtkWindowClass](1)
  def apply(parent_class : GtkWidgetClass, activate_focus : CFuncPtr1[Ptr[GtkWindow], Unit], activate_default : CFuncPtr1[Ptr[GtkWindow], Unit], keys_changed : CFuncPtr1[Ptr[GtkWindow], Unit], enable_debugging : CFuncPtr2[Ptr[GtkWindow], _root_.glib.all.gboolean, _root_.glib.all.gboolean], close_request : CFuncPtr1[Ptr[GtkWindow], _root_.glib.all.gboolean], padding : CArray[_root_.glib.all.gpointer, Nat._8])(using Zone): Ptr[_GtkWindowClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).activate_focus = activate_focus
    (!____ptr).activate_default = activate_default
    (!____ptr).keys_changed = keys_changed
    (!____ptr).enable_debugging = enable_debugging
    (!____ptr).close_request = close_request
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GtkWindowClass)
    def parent_class : GtkWidgetClass = struct._1
    def parent_class_=(value: GtkWidgetClass): Unit = !struct.at1 = value
    def activate_focus : CFuncPtr1[Ptr[GtkWindow], Unit] = struct._2
    def activate_focus_=(value: CFuncPtr1[Ptr[GtkWindow], Unit]): Unit = !struct.at2 = value
    def activate_default : CFuncPtr1[Ptr[GtkWindow], Unit] = struct._3
    def activate_default_=(value: CFuncPtr1[Ptr[GtkWindow], Unit]): Unit = !struct.at3 = value
    def keys_changed : CFuncPtr1[Ptr[GtkWindow], Unit] = struct._4
    def keys_changed_=(value: CFuncPtr1[Ptr[GtkWindow], Unit]): Unit = !struct.at4 = value
    def enable_debugging : CFuncPtr2[Ptr[GtkWindow], _root_.glib.all.gboolean, _root_.glib.all.gboolean] = struct._5
    def enable_debugging_=(value: CFuncPtr2[Ptr[GtkWindow], _root_.glib.all.gboolean, _root_.glib.all.gboolean]): Unit = !struct.at5 = value
    def close_request : CFuncPtr1[Ptr[GtkWindow], _root_.glib.all.gboolean] = struct._6
    def close_request_=(value: CFuncPtr1[Ptr[GtkWindow], _root_.glib.all.gboolean]): Unit = !struct.at6 = value
    def padding : CArray[_root_.glib.all.gpointer, Nat._8] = struct._7
    def padding_=(value: CArray[_root_.glib.all.gpointer, Nat._8]): Unit = !struct.at7 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindowcontrols.h
*/
opaque type _GtkWindowControls = CStruct0
object _GtkWindowControls:
  given _tag: Tag[_GtkWindowControls] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindowgroup.h
*/
opaque type _GtkWindowGroup = CStruct2[_root_.gobject.all.GObject, Ptr[GtkWindowGroupPrivate]]
object _GtkWindowGroup:
  given _tag: Tag[_GtkWindowGroup] = Tag.materializeCStruct2Tag[_root_.gobject.all.GObject, Ptr[GtkWindowGroupPrivate]]
  def apply()(using Zone): Ptr[_GtkWindowGroup] = scala.scalanative.unsafe.alloc[_GtkWindowGroup](1)
  def apply(parent_instance : _root_.gobject.all.GObject, priv : Ptr[GtkWindowGroupPrivate])(using Zone): Ptr[_GtkWindowGroup] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr
  extension (struct: _GtkWindowGroup)
    def parent_instance : _root_.gobject.all.GObject = struct._1
    def parent_instance_=(value: _root_.gobject.all.GObject): Unit = !struct.at1 = value
    def priv : Ptr[GtkWindowGroupPrivate] = struct._2
    def priv_=(value: Ptr[GtkWindowGroupPrivate]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindowgroup.h
*/
opaque type _GtkWindowGroupClass = CStruct5[_root_.gobject.all.GObjectClass, CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object _GtkWindowGroupClass:
  given _tag: Tag[_GtkWindowGroupClass] = Tag.materializeCStruct5Tag[_root_.gobject.all.GObjectClass, CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[_GtkWindowGroupClass] = scala.scalanative.unsafe.alloc[_GtkWindowGroupClass](1)
  def apply(parent_class : _root_.gobject.all.GObjectClass, _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[_GtkWindowGroupClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    ____ptr
  extension (struct: _GtkWindowGroupClass)
    def parent_class : _root_.gobject.all.GObjectClass = struct._1
    def parent_class_=(value: _root_.gobject.all.GObjectClass): Unit = !struct.at1 = value
    def _gtk_reserved1 : CFuncPtr0[Unit] = struct._2
    def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at2 = value
    def _gtk_reserved2 : CFuncPtr0[Unit] = struct._3
    def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at3 = value
    def _gtk_reserved3 : CFuncPtr0[Unit] = struct._4
    def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at4 = value
    def _gtk_reserved4 : CFuncPtr0[Unit] = struct._5
    def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at5 = value

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindow.h
*/
opaque type _GtkWindowGroupPrivate = CStruct0
object _GtkWindowGroupPrivate:
  given _tag: Tag[_GtkWindowGroupPrivate] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/gtk-4.0/gtk/gtkwindowhandle.h
*/
opaque type _GtkWindowHandle = CStruct0
object _GtkWindowHandle:
  given _tag: Tag[_GtkWindowHandle] = Tag.materializeCStruct0Tag

