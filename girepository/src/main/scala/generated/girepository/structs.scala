package girepository

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GIAttributeIter:
*/
opaque type GIAttributeIter = CStruct4[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer]
object GIAttributeIter:
  given _tag: Tag[GIAttributeIter] = Tag.materializeCStruct4Tag[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer]
  def apply()(using Zone): Ptr[GIAttributeIter] = scala.scalanative.unsafe.alloc[GIAttributeIter](1)
  def apply(data : _root_.sn.gnome.glib.internal.gpointer, data2 : _root_.sn.gnome.glib.internal.gpointer, data3 : _root_.sn.gnome.glib.internal.gpointer, data4 : _root_.sn.gnome.glib.internal.gpointer)(using Zone): Ptr[GIAttributeIter] = 
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).data2 = data2
    (!____ptr).data3 = data3
    (!____ptr).data4 = data4
    ____ptr
  extension (struct: GIAttributeIter)
    def data : _root_.sn.gnome.glib.internal.gpointer = struct._1
    def data_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at1 = value
    def data2 : _root_.sn.gnome.glib.internal.gpointer = struct._2
    def data2_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at2 = value
    def data3 : _root_.sn.gnome.glib.internal.gpointer = struct._3
    def data3_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at3 = value
    def data4 : _root_.sn.gnome.glib.internal.gpointer = struct._4
    def data4_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at4 = value

opaque type GIBaseInfo = CStruct8[_root_.sn.gnome.glib.internal.gint32, _root_.sn.gnome.glib.internal.gint32, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.guint32, _root_.sn.gnome.glib.internal.guint32, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
object GIBaseInfo:
  given _tag: Tag[GIBaseInfo] = Tag.materializeCStruct8Tag[_root_.sn.gnome.glib.internal.gint32, _root_.sn.gnome.glib.internal.gint32, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.guint32, _root_.sn.gnome.glib.internal.guint32, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[GIBaseInfo] = scala.scalanative.unsafe.alloc[GIBaseInfo](1)
  def apply(dummy1 : _root_.sn.gnome.glib.internal.gint32, dummy2 : _root_.sn.gnome.glib.internal.gint32, dummy3 : _root_.sn.gnome.glib.internal.gpointer, dummy4 : _root_.sn.gnome.glib.internal.gpointer, dummy5 : _root_.sn.gnome.glib.internal.gpointer, dummy6 : _root_.sn.gnome.glib.internal.guint32, dummy7 : _root_.sn.gnome.glib.internal.guint32, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[GIBaseInfo] = 
    val ____ptr = apply()
    (!____ptr).dummy1 = dummy1
    (!____ptr).dummy2 = dummy2
    (!____ptr).dummy3 = dummy3
    (!____ptr).dummy4 = dummy4
    (!____ptr).dummy5 = dummy5
    (!____ptr).dummy6 = dummy6
    (!____ptr).dummy7 = dummy7
    (!____ptr).padding = padding
    ____ptr
  extension (struct: GIBaseInfo)
    def dummy1 : _root_.sn.gnome.glib.internal.gint32 = struct._1
    def dummy1_=(value: _root_.sn.gnome.glib.internal.gint32): Unit = !struct.at1 = value
    def dummy2 : _root_.sn.gnome.glib.internal.gint32 = struct._2
    def dummy2_=(value: _root_.sn.gnome.glib.internal.gint32): Unit = !struct.at2 = value
    def dummy3 : _root_.sn.gnome.glib.internal.gpointer = struct._3
    def dummy3_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at3 = value
    def dummy4 : _root_.sn.gnome.glib.internal.gpointer = struct._4
    def dummy4_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at4 = value
    def dummy5 : _root_.sn.gnome.glib.internal.gpointer = struct._5
    def dummy5_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at5 = value
    def dummy6 : _root_.sn.gnome.glib.internal.guint32 = struct._6
    def dummy6_=(value: _root_.sn.gnome.glib.internal.guint32): Unit = !struct.at6 = value
    def dummy7 : _root_.sn.gnome.glib.internal.guint32 = struct._7
    def dummy7_=(value: _root_.sn.gnome.glib.internal.guint32): Unit = !struct.at7 = value
    def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._8
    def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = !struct.at8 = value

opaque type GIRepository = CStruct2[_root_.sn.gnome.gobject.internal.GObject, Ptr[GIRepositoryPrivate]]
object GIRepository:
  given _tag: Tag[GIRepository] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObject, Ptr[GIRepositoryPrivate]]
  def apply()(using Zone): Ptr[GIRepository] = scala.scalanative.unsafe.alloc[GIRepository](1)
  def apply(parent : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[GIRepositoryPrivate])(using Zone): Ptr[GIRepository] = 
    val ____ptr = apply()
    (!____ptr).parent = parent
    (!____ptr).priv = priv
    ____ptr
  extension (struct: GIRepository)
    def parent : _root_.sn.gnome.gobject.internal.GObject = struct._1
    def parent_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = !struct.at1 = value
    def priv : Ptr[GIRepositoryPrivate] = struct._2
    def priv_=(value: Ptr[GIRepositoryPrivate]): Unit = !struct.at2 = value

opaque type GIRepositoryClass = CStruct1[_root_.sn.gnome.gobject.internal.GObjectClass]
object GIRepositoryClass:
  given _tag: Tag[GIRepositoryClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObjectClass]
  def apply()(using Zone): Ptr[GIRepositoryClass] = scala.scalanative.unsafe.alloc[GIRepositoryClass](1)
  def apply(parent : _root_.sn.gnome.gobject.internal.GObjectClass)(using Zone): Ptr[GIRepositoryClass] = 
    val ____ptr = apply()
    (!____ptr).parent = parent
    ____ptr
  extension (struct: GIRepositoryClass)
    def parent : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
    def parent_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at1 = value

opaque type GIRepositoryPrivate = CStruct0
object GIRepositoryPrivate:
  given _tag: Tag[GIRepositoryPrivate] = Tag.materializeCStruct0Tag

opaque type GITypelib = CStruct0
object GITypelib:
  given _tag: Tag[GITypelib] = Tag.materializeCStruct0Tag

opaque type GIUnresolvedInfo = CStruct0
object GIUnresolvedInfo:
  given _tag: Tag[GIUnresolvedInfo] = Tag.materializeCStruct0Tag

opaque type GTypelib = CStruct0
object GTypelib:
  given _tag: Tag[GTypelib] = Tag.materializeCStruct0Tag

opaque type _GIBaseInfoStub = CStruct8[_root_.sn.gnome.glib.internal.gint32, _root_.sn.gnome.glib.internal.gint32, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.guint32, _root_.sn.gnome.glib.internal.guint32, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
object _GIBaseInfoStub:
  given _tag: Tag[_GIBaseInfoStub] = Tag.materializeCStruct8Tag[_root_.sn.gnome.glib.internal.gint32, _root_.sn.gnome.glib.internal.gint32, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.guint32, _root_.sn.gnome.glib.internal.guint32, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  def apply()(using Zone): Ptr[_GIBaseInfoStub] = scala.scalanative.unsafe.alloc[_GIBaseInfoStub](1)
  def apply(dummy1 : _root_.sn.gnome.glib.internal.gint32, dummy2 : _root_.sn.gnome.glib.internal.gint32, dummy3 : _root_.sn.gnome.glib.internal.gpointer, dummy4 : _root_.sn.gnome.glib.internal.gpointer, dummy5 : _root_.sn.gnome.glib.internal.gpointer, dummy6 : _root_.sn.gnome.glib.internal.guint32, dummy7 : _root_.sn.gnome.glib.internal.guint32, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[_GIBaseInfoStub] = 
    val ____ptr = apply()
    (!____ptr).dummy1 = dummy1
    (!____ptr).dummy2 = dummy2
    (!____ptr).dummy3 = dummy3
    (!____ptr).dummy4 = dummy4
    (!____ptr).dummy5 = dummy5
    (!____ptr).dummy6 = dummy6
    (!____ptr).dummy7 = dummy7
    (!____ptr).padding = padding
    ____ptr
  extension (struct: _GIBaseInfoStub)
    def dummy1 : _root_.sn.gnome.glib.internal.gint32 = struct._1
    def dummy1_=(value: _root_.sn.gnome.glib.internal.gint32): Unit = !struct.at1 = value
    def dummy2 : _root_.sn.gnome.glib.internal.gint32 = struct._2
    def dummy2_=(value: _root_.sn.gnome.glib.internal.gint32): Unit = !struct.at2 = value
    def dummy3 : _root_.sn.gnome.glib.internal.gpointer = struct._3
    def dummy3_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at3 = value
    def dummy4 : _root_.sn.gnome.glib.internal.gpointer = struct._4
    def dummy4_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at4 = value
    def dummy5 : _root_.sn.gnome.glib.internal.gpointer = struct._5
    def dummy5_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at5 = value
    def dummy6 : _root_.sn.gnome.glib.internal.guint32 = struct._6
    def dummy6_=(value: _root_.sn.gnome.glib.internal.guint32): Unit = !struct.at6 = value
    def dummy7 : _root_.sn.gnome.glib.internal.guint32 = struct._7
    def dummy7_=(value: _root_.sn.gnome.glib.internal.guint32): Unit = !struct.at7 = value
    def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._8
    def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = !struct.at8 = value

opaque type _GIRepository = CStruct2[_root_.sn.gnome.gobject.internal.GObject, Ptr[GIRepositoryPrivate]]
object _GIRepository:
  given _tag: Tag[_GIRepository] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObject, Ptr[GIRepositoryPrivate]]
  def apply()(using Zone): Ptr[_GIRepository] = scala.scalanative.unsafe.alloc[_GIRepository](1)
  def apply(parent : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[GIRepositoryPrivate])(using Zone): Ptr[_GIRepository] = 
    val ____ptr = apply()
    (!____ptr).parent = parent
    (!____ptr).priv = priv
    ____ptr
  extension (struct: _GIRepository)
    def parent : _root_.sn.gnome.gobject.internal.GObject = struct._1
    def parent_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = !struct.at1 = value
    def priv : Ptr[GIRepositoryPrivate] = struct._2
    def priv_=(value: Ptr[GIRepositoryPrivate]): Unit = !struct.at2 = value

opaque type _GIRepositoryClass = CStruct1[_root_.sn.gnome.gobject.internal.GObjectClass]
object _GIRepositoryClass:
  given _tag: Tag[_GIRepositoryClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObjectClass]
  def apply()(using Zone): Ptr[_GIRepositoryClass] = scala.scalanative.unsafe.alloc[_GIRepositoryClass](1)
  def apply(parent : _root_.sn.gnome.gobject.internal.GObjectClass)(using Zone): Ptr[_GIRepositoryClass] = 
    val ____ptr = apply()
    (!____ptr).parent = parent
    ____ptr
  extension (struct: _GIRepositoryClass)
    def parent : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
    def parent_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at1 = value

opaque type _GIRepositoryPrivate = CStruct0
object _GIRepositoryPrivate:
  given _tag: Tag[_GIRepositoryPrivate] = Tag.materializeCStruct0Tag

opaque type _GITypelib = CStruct0
object _GITypelib:
  given _tag: Tag[_GITypelib] = Tag.materializeCStruct0Tag

opaque type _GIUnresolvedInfo = CStruct0
object _GIUnresolvedInfo:
  given _tag: Tag[_GIUnresolvedInfo] = Tag.materializeCStruct0Tag