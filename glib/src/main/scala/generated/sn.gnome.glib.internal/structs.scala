package sn.gnome.glib.internal

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GAllocator = CStruct0
object GAllocator:
  given _tag: Tag[GAllocator] = Tag.materializeCStruct0Tag

opaque type GArray = CStruct2[Ptr[gchar], guint]
object GArray:
  given _tag: Tag[GArray] = Tag.materializeCStruct2Tag[Ptr[gchar], guint]
  def apply()(using Zone): Ptr[GArray] = scala.scalanative.unsafe.alloc[GArray](1)
  def apply(data : Ptr[gchar], len : guint)(using Zone): Ptr[GArray] = 
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).len = len
    ____ptr
  extension (struct: GArray)
    def data : Ptr[gchar] = struct._1
    def data_=(value: Ptr[gchar]): Unit = !struct.at1 = value
    def len : guint = struct._2
    def len_=(value: guint): Unit = !struct.at2 = value

opaque type GAsyncQueue = CStruct0
object GAsyncQueue:
  given _tag: Tag[GAsyncQueue] = Tag.materializeCStruct0Tag

opaque type GBookmarkFile = CStruct0
object GBookmarkFile:
  given _tag: Tag[GBookmarkFile] = Tag.materializeCStruct0Tag

opaque type GByteArray = CStruct2[Ptr[guint8], guint]
object GByteArray:
  given _tag: Tag[GByteArray] = Tag.materializeCStruct2Tag[Ptr[guint8], guint]
  def apply()(using Zone): Ptr[GByteArray] = scala.scalanative.unsafe.alloc[GByteArray](1)
  def apply(data : Ptr[guint8], len : guint)(using Zone): Ptr[GByteArray] = 
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).len = len
    ____ptr
  extension (struct: GByteArray)
    def data : Ptr[guint8] = struct._1
    def data_=(value: Ptr[guint8]): Unit = !struct.at1 = value
    def len : guint = struct._2
    def len_=(value: guint): Unit = !struct.at2 = value

opaque type GBytes = CStruct0
object GBytes:
  given _tag: Tag[GBytes] = Tag.materializeCStruct0Tag

opaque type GCache = CStruct0
object GCache:
  given _tag: Tag[GCache] = Tag.materializeCStruct0Tag

opaque type GChecksum = CStruct0
object GChecksum:
  given _tag: Tag[GChecksum] = Tag.materializeCStruct0Tag

opaque type GCompletion = CStruct5[Ptr[Byte], GCompletionFunc, Ptr[gchar], Ptr[Byte], GCompletionStrncmpFunc]
object GCompletion:
  given _tag: Tag[GCompletion] = Tag.materializeCStruct5Tag[Ptr[Byte], GCompletionFunc, Ptr[gchar], Ptr[Byte], GCompletionStrncmpFunc]
  def apply()(using Zone): Ptr[GCompletion] = scala.scalanative.unsafe.alloc[GCompletion](1)
  def apply(items : Ptr[GList], func : GCompletionFunc, prefix : Ptr[gchar], cache : Ptr[GList], strncmp_func : GCompletionStrncmpFunc)(using Zone): Ptr[GCompletion] = 
    val ____ptr = apply()
    (!____ptr).items = items
    (!____ptr).func = func
    (!____ptr).prefix = prefix
    (!____ptr).cache = cache
    (!____ptr).strncmp_func = strncmp_func
    ____ptr
  extension (struct: GCompletion)
    def items : Ptr[GList] = struct._1.asInstanceOf[Ptr[GList]]
    def items_=(value: Ptr[GList]): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
    def func : GCompletionFunc = struct._2
    def func_=(value: GCompletionFunc): Unit = !struct.at2 = value
    def prefix : Ptr[gchar] = struct._3
    def prefix_=(value: Ptr[gchar]): Unit = !struct.at3 = value
    def cache : Ptr[GList] = struct._4.asInstanceOf[Ptr[GList]]
    def cache_=(value: Ptr[GList]): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
    def strncmp_func : GCompletionStrncmpFunc = struct._5
    def strncmp_func_=(value: GCompletionStrncmpFunc): Unit = !struct.at5 = value

opaque type GCond = CStruct2[gpointer, CArray[guint, Nat._2]]
object GCond:
  given _tag: Tag[GCond] = Tag.materializeCStruct2Tag[gpointer, CArray[guint, Nat._2]]
  def apply()(using Zone): Ptr[GCond] = scala.scalanative.unsafe.alloc[GCond](1)
  def apply(p : gpointer, i : CArray[guint, Nat._2])(using Zone): Ptr[GCond] = 
    val ____ptr = apply()
    (!____ptr).p = p
    (!____ptr).i = i
    ____ptr
  extension (struct: GCond)
    def p : gpointer = struct._1
    def p_=(value: gpointer): Unit = !struct.at1 = value
    def i : CArray[guint, Nat._2] = struct._2
    def i_=(value: CArray[guint, Nat._2]): Unit = !struct.at2 = value

opaque type GData = CStruct0
object GData:
  given _tag: Tag[GData] = Tag.materializeCStruct0Tag

opaque type GDate = CStruct6[guint, guint, guint, guint, guint, guint]
object GDate:
  given _tag: Tag[GDate] = Tag.materializeCStruct6Tag[guint, guint, guint, guint, guint, guint]
  def apply()(using Zone): Ptr[GDate] = scala.scalanative.unsafe.alloc[GDate](1)
  def apply(julian_days : guint, julian : guint, dmy : guint, day : guint, month : guint, year : guint)(using Zone): Ptr[GDate] = 
    val ____ptr = apply()
    (!____ptr).julian_days = julian_days
    (!____ptr).julian = julian
    (!____ptr).dmy = dmy
    (!____ptr).day = day
    (!____ptr).month = month
    (!____ptr).year = year
    ____ptr
  extension (struct: GDate)
    def julian_days : guint = struct._1
    def julian_days_=(value: guint): Unit = !struct.at1 = value
    def julian : guint = struct._2
    def julian_=(value: guint): Unit = !struct.at2 = value
    def dmy : guint = struct._3
    def dmy_=(value: guint): Unit = !struct.at3 = value
    def day : guint = struct._4
    def day_=(value: guint): Unit = !struct.at4 = value
    def month : guint = struct._5
    def month_=(value: guint): Unit = !struct.at5 = value
    def year : guint = struct._6
    def year_=(value: guint): Unit = !struct.at6 = value

opaque type GDateTime = CStruct0
object GDateTime:
  given _tag: Tag[GDateTime] = Tag.materializeCStruct0Tag

opaque type GDebugKey = CStruct2[Ptr[gchar], guint]
object GDebugKey:
  given _tag: Tag[GDebugKey] = Tag.materializeCStruct2Tag[Ptr[gchar], guint]
  def apply()(using Zone): Ptr[GDebugKey] = scala.scalanative.unsafe.alloc[GDebugKey](1)
  def apply(key : Ptr[gchar], value : guint)(using Zone): Ptr[GDebugKey] = 
    val ____ptr = apply()
    (!____ptr).key = key
    (!____ptr).value = value
    ____ptr
  extension (struct: GDebugKey)
    def key : Ptr[gchar] = struct._1
    def key_=(value: Ptr[gchar]): Unit = !struct.at1 = value
    def value : guint = struct._2
    def value_=(value: guint): Unit = !struct.at2 = value

opaque type GDir = CStruct0
object GDir:
  given _tag: Tag[GDir] = Tag.materializeCStruct0Tag

opaque type GError = CStruct3[GQuark, gint, Ptr[gchar]]
object GError:
  given _tag: Tag[GError] = Tag.materializeCStruct3Tag[GQuark, gint, Ptr[gchar]]
  def apply()(using Zone): Ptr[GError] = scala.scalanative.unsafe.alloc[GError](1)
  def apply(domain : GQuark, code : gint, message : Ptr[gchar])(using Zone): Ptr[GError] = 
    val ____ptr = apply()
    (!____ptr).domain = domain
    (!____ptr).code = code
    (!____ptr).message = message
    ____ptr
  extension (struct: GError)
    def domain : GQuark = struct._1
    def domain_=(value: GQuark): Unit = !struct.at1 = value
    def code : gint = struct._2
    def code_=(value: gint): Unit = !struct.at2 = value
    def message : Ptr[gchar] = struct._3
    def message_=(value: Ptr[gchar]): Unit = !struct.at3 = value

opaque type GHashTable = CStruct0
object GHashTable:
  given _tag: Tag[GHashTable] = Tag.materializeCStruct0Tag

opaque type GHashTableIter = CStruct6[gpointer, gpointer, gpointer, CInt, gboolean, gpointer]
object GHashTableIter:
  given _tag: Tag[GHashTableIter] = Tag.materializeCStruct6Tag[gpointer, gpointer, gpointer, CInt, gboolean, gpointer]
  def apply()(using Zone): Ptr[GHashTableIter] = scala.scalanative.unsafe.alloc[GHashTableIter](1)
  def apply(dummy1 : gpointer, dummy2 : gpointer, dummy3 : gpointer, dummy4 : CInt, dummy5 : gboolean, dummy6 : gpointer)(using Zone): Ptr[GHashTableIter] = 
    val ____ptr = apply()
    (!____ptr).dummy1 = dummy1
    (!____ptr).dummy2 = dummy2
    (!____ptr).dummy3 = dummy3
    (!____ptr).dummy4 = dummy4
    (!____ptr).dummy5 = dummy5
    (!____ptr).dummy6 = dummy6
    ____ptr
  extension (struct: GHashTableIter)
    def dummy1 : gpointer = struct._1
    def dummy1_=(value: gpointer): Unit = !struct.at1 = value
    def dummy2 : gpointer = struct._2
    def dummy2_=(value: gpointer): Unit = !struct.at2 = value
    def dummy3 : gpointer = struct._3
    def dummy3_=(value: gpointer): Unit = !struct.at3 = value
    def dummy4 : CInt = struct._4
    def dummy4_=(value: CInt): Unit = !struct.at4 = value
    def dummy5 : gboolean = struct._5
    def dummy5_=(value: gboolean): Unit = !struct.at5 = value
    def dummy6 : gpointer = struct._6
    def dummy6_=(value: gpointer): Unit = !struct.at6 = value

opaque type GHmac = CStruct0
object GHmac:
  given _tag: Tag[GHmac] = Tag.materializeCStruct0Tag

opaque type GHook = CStruct8[gpointer, Ptr[Byte], Ptr[Byte], guint, gulong, guint, gpointer, GDestroyNotify]
object GHook:
  given _tag: Tag[GHook] = Tag.materializeCStruct8Tag[gpointer, Ptr[Byte], Ptr[Byte], guint, gulong, guint, gpointer, GDestroyNotify]
  def apply()(using Zone): Ptr[GHook] = scala.scalanative.unsafe.alloc[GHook](1)
  def apply(data : gpointer, next : Ptr[GHook], prev : Ptr[GHook], ref_count : guint, hook_id : gulong, flags : guint, func : gpointer, destroy : GDestroyNotify)(using Zone): Ptr[GHook] = 
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).next = next
    (!____ptr).prev = prev
    (!____ptr).ref_count = ref_count
    (!____ptr).hook_id = hook_id
    (!____ptr).flags = flags
    (!____ptr).func = func
    (!____ptr).destroy = destroy
    ____ptr
  extension (struct: GHook)
    def data : gpointer = struct._1
    def data_=(value: gpointer): Unit = !struct.at1 = value
    def next : Ptr[GHook] = struct._2.asInstanceOf[Ptr[GHook]]
    def next_=(value: Ptr[GHook]): Unit = !struct.at2 = value.asInstanceOf[Ptr[Byte]]
    def prev : Ptr[GHook] = struct._3.asInstanceOf[Ptr[GHook]]
    def prev_=(value: Ptr[GHook]): Unit = !struct.at3 = value.asInstanceOf[Ptr[Byte]]
    def ref_count : guint = struct._4
    def ref_count_=(value: guint): Unit = !struct.at4 = value
    def hook_id : gulong = struct._5
    def hook_id_=(value: gulong): Unit = !struct.at5 = value
    def flags : guint = struct._6
    def flags_=(value: guint): Unit = !struct.at6 = value
    def func : gpointer = struct._7
    def func_=(value: gpointer): Unit = !struct.at7 = value
    def destroy : GDestroyNotify = struct._8
    def destroy_=(value: GDestroyNotify): Unit = !struct.at8 = value

opaque type GHookList = CStruct7[gulong, guint, guint, Ptr[Byte], gpointer, Ptr[Byte], CArray[gpointer, Nat._2]]
object GHookList:
  given _tag: Tag[GHookList] = Tag.materializeCStruct7Tag[gulong, guint, guint, Ptr[Byte], gpointer, Ptr[Byte], CArray[gpointer, Nat._2]]
  def apply()(using Zone): Ptr[GHookList] = scala.scalanative.unsafe.alloc[GHookList](1)
  def apply(seq_id : gulong, hook_size : guint, is_setup : guint, hooks : Ptr[GHook], dummy3 : gpointer, finalize_hook : GHookFinalizeFunc, dummy : CArray[gpointer, Nat._2])(using Zone): Ptr[GHookList] = 
    val ____ptr = apply()
    (!____ptr).seq_id = seq_id
    (!____ptr).hook_size = hook_size
    (!____ptr).is_setup = is_setup
    (!____ptr).hooks = hooks
    (!____ptr).dummy3 = dummy3
    (!____ptr).finalize_hook = finalize_hook
    (!____ptr).dummy = dummy
    ____ptr
  extension (struct: GHookList)
    def seq_id : gulong = struct._1
    def seq_id_=(value: gulong): Unit = !struct.at1 = value
    def hook_size : guint = struct._2
    def hook_size_=(value: guint): Unit = !struct.at2 = value
    def is_setup : guint = struct._3
    def is_setup_=(value: guint): Unit = !struct.at3 = value
    def hooks : Ptr[GHook] = struct._4.asInstanceOf[Ptr[GHook]]
    def hooks_=(value: Ptr[GHook]): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
    def dummy3 : gpointer = struct._5
    def dummy3_=(value: gpointer): Unit = !struct.at5 = value
    def finalize_hook : GHookFinalizeFunc = struct._6.asInstanceOf[GHookFinalizeFunc]
    def finalize_hook_=(value: GHookFinalizeFunc): Unit = !struct.at6 = value.asInstanceOf[Ptr[Byte]]
    def dummy : CArray[gpointer, Nat._2] = struct._7
    def dummy_=(value: CArray[gpointer, Nat._2]): Unit = !struct.at7 = value

opaque type GIOChannel = CStruct20[gint, Ptr[Byte], Ptr[gchar], GIConv, GIConv, Ptr[gchar], guint, gsize, Ptr[GString], Ptr[GString], Ptr[GString], CArray[gchar, Nat._6], guint, guint, guint, guint, guint, guint, gpointer, gpointer]
object GIOChannel:
  given _tag: Tag[GIOChannel] = Tag.materializeCStruct20Tag[gint, Ptr[Byte], Ptr[gchar], GIConv, GIConv, Ptr[gchar], guint, gsize, Ptr[GString], Ptr[GString], Ptr[GString], CArray[gchar, Nat._6], guint, guint, guint, guint, guint, guint, gpointer, gpointer]
  def apply()(using Zone): Ptr[GIOChannel] = scala.scalanative.unsafe.alloc[GIOChannel](1)
  def apply(ref_count : gint, funcs : Ptr[GIOFuncs], encoding : Ptr[gchar], read_cd : GIConv, write_cd : GIConv, line_term : Ptr[gchar], line_term_len : guint, buf_size : gsize, read_buf : Ptr[GString], encoded_read_buf : Ptr[GString], write_buf : Ptr[GString], partial_write_buf : CArray[gchar, Nat._6], use_buffer : guint, do_encode : guint, close_on_unref : guint, is_readable : guint, is_writeable : guint, is_seekable : guint, reserved1 : gpointer, reserved2 : gpointer)(using Zone): Ptr[GIOChannel] = 
    val ____ptr = apply()
    (!____ptr).ref_count = ref_count
    (!____ptr).funcs = funcs
    (!____ptr).encoding = encoding
    (!____ptr).read_cd = read_cd
    (!____ptr).write_cd = write_cd
    (!____ptr).line_term = line_term
    (!____ptr).line_term_len = line_term_len
    (!____ptr).buf_size = buf_size
    (!____ptr).read_buf = read_buf
    (!____ptr).encoded_read_buf = encoded_read_buf
    (!____ptr).write_buf = write_buf
    (!____ptr).partial_write_buf = partial_write_buf
    (!____ptr).use_buffer = use_buffer
    (!____ptr).do_encode = do_encode
    (!____ptr).close_on_unref = close_on_unref
    (!____ptr).is_readable = is_readable
    (!____ptr).is_writeable = is_writeable
    (!____ptr).is_seekable = is_seekable
    (!____ptr).reserved1 = reserved1
    (!____ptr).reserved2 = reserved2
    ____ptr
  extension (struct: GIOChannel)
    def ref_count : gint = struct._1
    def ref_count_=(value: gint): Unit = !struct.at1 = value
    def funcs : Ptr[GIOFuncs] = struct._2.asInstanceOf[Ptr[GIOFuncs]]
    def funcs_=(value: Ptr[GIOFuncs]): Unit = !struct.at2 = value.asInstanceOf[Ptr[Byte]]
    def encoding : Ptr[gchar] = struct._3
    def encoding_=(value: Ptr[gchar]): Unit = !struct.at3 = value
    def read_cd : GIConv = struct._4
    def read_cd_=(value: GIConv): Unit = !struct.at4 = value
    def write_cd : GIConv = struct._5
    def write_cd_=(value: GIConv): Unit = !struct.at5 = value
    def line_term : Ptr[gchar] = struct._6
    def line_term_=(value: Ptr[gchar]): Unit = !struct.at6 = value
    def line_term_len : guint = struct._7
    def line_term_len_=(value: guint): Unit = !struct.at7 = value
    def buf_size : gsize = struct._8
    def buf_size_=(value: gsize): Unit = !struct.at8 = value
    def read_buf : Ptr[GString] = struct._9
    def read_buf_=(value: Ptr[GString]): Unit = !struct.at9 = value
    def encoded_read_buf : Ptr[GString] = struct._10
    def encoded_read_buf_=(value: Ptr[GString]): Unit = !struct.at10 = value
    def write_buf : Ptr[GString] = struct._11
    def write_buf_=(value: Ptr[GString]): Unit = !struct.at11 = value
    def partial_write_buf : CArray[gchar, Nat._6] = struct._12
    def partial_write_buf_=(value: CArray[gchar, Nat._6]): Unit = !struct.at12 = value
    def use_buffer : guint = struct._13
    def use_buffer_=(value: guint): Unit = !struct.at13 = value
    def do_encode : guint = struct._14
    def do_encode_=(value: guint): Unit = !struct.at14 = value
    def close_on_unref : guint = struct._15
    def close_on_unref_=(value: guint): Unit = !struct.at15 = value
    def is_readable : guint = struct._16
    def is_readable_=(value: guint): Unit = !struct.at16 = value
    def is_writeable : guint = struct._17
    def is_writeable_=(value: guint): Unit = !struct.at17 = value
    def is_seekable : guint = struct._18
    def is_seekable_=(value: guint): Unit = !struct.at18 = value
    def reserved1 : gpointer = struct._19
    def reserved1_=(value: gpointer): Unit = !struct.at19 = value
    def reserved2 : gpointer = struct._20
    def reserved2_=(value: gpointer): Unit = !struct.at20 = value

opaque type GIOFuncs = CStruct8[CFuncPtr5[Ptr[Byte], Ptr[gchar], gsize, Ptr[gsize], Ptr[Ptr[GError]], GIOStatus], CFuncPtr5[Ptr[Byte], Ptr[gchar], gsize, Ptr[gsize], Ptr[Ptr[GError]], GIOStatus], CFuncPtr4[Ptr[Byte], gint64, GSeekType, Ptr[Ptr[GError]], GIOStatus], CFuncPtr2[Ptr[Byte], Ptr[Ptr[GError]], GIOStatus], CFuncPtr2[Ptr[Byte], GIOCondition, Ptr[Byte]], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr3[Ptr[Byte], GIOFlags, Ptr[Ptr[GError]], GIOStatus], CFuncPtr1[Ptr[Byte], GIOFlags]]
object GIOFuncs:
  given _tag: Tag[GIOFuncs] = Tag.materializeCStruct8Tag[CFuncPtr5[Ptr[Byte], Ptr[gchar], gsize, Ptr[gsize], Ptr[Ptr[GError]], GIOStatus], CFuncPtr5[Ptr[Byte], Ptr[gchar], gsize, Ptr[gsize], Ptr[Ptr[GError]], GIOStatus], CFuncPtr4[Ptr[Byte], gint64, GSeekType, Ptr[Ptr[GError]], GIOStatus], CFuncPtr2[Ptr[Byte], Ptr[Ptr[GError]], GIOStatus], CFuncPtr2[Ptr[Byte], GIOCondition, Ptr[Byte]], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr3[Ptr[Byte], GIOFlags, Ptr[Ptr[GError]], GIOStatus], CFuncPtr1[Ptr[Byte], GIOFlags]]
  def apply()(using Zone): Ptr[GIOFuncs] = scala.scalanative.unsafe.alloc[GIOFuncs](1)
  def apply(io_read : CFuncPtr5[Ptr[GIOChannel], Ptr[gchar], gsize, Ptr[gsize], Ptr[Ptr[GError]], GIOStatus], io_write : CFuncPtr5[Ptr[GIOChannel], Ptr[gchar], gsize, Ptr[gsize], Ptr[Ptr[GError]], GIOStatus], io_seek : CFuncPtr4[Ptr[GIOChannel], gint64, GSeekType, Ptr[Ptr[GError]], GIOStatus], io_close : CFuncPtr2[Ptr[GIOChannel], Ptr[Ptr[GError]], GIOStatus], io_create_watch : CFuncPtr2[Ptr[GIOChannel], GIOCondition, Ptr[GSource]], io_free : CFuncPtr1[Ptr[GIOChannel], Unit], io_set_flags : CFuncPtr3[Ptr[GIOChannel], GIOFlags, Ptr[Ptr[GError]], GIOStatus], io_get_flags : CFuncPtr1[Ptr[GIOChannel], GIOFlags])(using Zone): Ptr[GIOFuncs] = 
    val ____ptr = apply()
    (!____ptr).io_read = io_read
    (!____ptr).io_write = io_write
    (!____ptr).io_seek = io_seek
    (!____ptr).io_close = io_close
    (!____ptr).io_create_watch = io_create_watch
    (!____ptr).io_free = io_free
    (!____ptr).io_set_flags = io_set_flags
    (!____ptr).io_get_flags = io_get_flags
    ____ptr
  extension (struct: GIOFuncs)
    def io_read : CFuncPtr5[Ptr[GIOChannel], Ptr[gchar], gsize, Ptr[gsize], Ptr[Ptr[GError]], GIOStatus] = struct._1.asInstanceOf[CFuncPtr5[Ptr[GIOChannel], Ptr[gchar], gsize, Ptr[gsize], Ptr[Ptr[GError]], GIOStatus]]
    def io_read_=(value: CFuncPtr5[Ptr[GIOChannel], Ptr[gchar], gsize, Ptr[gsize], Ptr[Ptr[GError]], GIOStatus]): Unit = !struct.at1 = value.asInstanceOf[CFuncPtr5[Ptr[Byte], Ptr[gchar], gsize, Ptr[gsize], Ptr[Ptr[GError]], GIOStatus]]
    def io_write : CFuncPtr5[Ptr[GIOChannel], Ptr[gchar], gsize, Ptr[gsize], Ptr[Ptr[GError]], GIOStatus] = struct._2.asInstanceOf[CFuncPtr5[Ptr[GIOChannel], Ptr[gchar], gsize, Ptr[gsize], Ptr[Ptr[GError]], GIOStatus]]
    def io_write_=(value: CFuncPtr5[Ptr[GIOChannel], Ptr[gchar], gsize, Ptr[gsize], Ptr[Ptr[GError]], GIOStatus]): Unit = !struct.at2 = value.asInstanceOf[CFuncPtr5[Ptr[Byte], Ptr[gchar], gsize, Ptr[gsize], Ptr[Ptr[GError]], GIOStatus]]
    def io_seek : CFuncPtr4[Ptr[GIOChannel], gint64, GSeekType, Ptr[Ptr[GError]], GIOStatus] = struct._3.asInstanceOf[CFuncPtr4[Ptr[GIOChannel], gint64, GSeekType, Ptr[Ptr[GError]], GIOStatus]]
    def io_seek_=(value: CFuncPtr4[Ptr[GIOChannel], gint64, GSeekType, Ptr[Ptr[GError]], GIOStatus]): Unit = !struct.at3 = value.asInstanceOf[CFuncPtr4[Ptr[Byte], gint64, GSeekType, Ptr[Ptr[GError]], GIOStatus]]
    def io_close : CFuncPtr2[Ptr[GIOChannel], Ptr[Ptr[GError]], GIOStatus] = struct._4.asInstanceOf[CFuncPtr2[Ptr[GIOChannel], Ptr[Ptr[GError]], GIOStatus]]
    def io_close_=(value: CFuncPtr2[Ptr[GIOChannel], Ptr[Ptr[GError]], GIOStatus]): Unit = !struct.at4 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], Ptr[Ptr[GError]], GIOStatus]]
    def io_create_watch : CFuncPtr2[Ptr[GIOChannel], GIOCondition, Ptr[GSource]] = struct._5.asInstanceOf[CFuncPtr2[Ptr[GIOChannel], GIOCondition, Ptr[GSource]]]
    def io_create_watch_=(value: CFuncPtr2[Ptr[GIOChannel], GIOCondition, Ptr[GSource]]): Unit = !struct.at5 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], GIOCondition, Ptr[Byte]]]
    def io_free : CFuncPtr1[Ptr[GIOChannel], Unit] = struct._6.asInstanceOf[CFuncPtr1[Ptr[GIOChannel], Unit]]
    def io_free_=(value: CFuncPtr1[Ptr[GIOChannel], Unit]): Unit = !struct.at6 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], Unit]]
    def io_set_flags : CFuncPtr3[Ptr[GIOChannel], GIOFlags, Ptr[Ptr[GError]], GIOStatus] = struct._7.asInstanceOf[CFuncPtr3[Ptr[GIOChannel], GIOFlags, Ptr[Ptr[GError]], GIOStatus]]
    def io_set_flags_=(value: CFuncPtr3[Ptr[GIOChannel], GIOFlags, Ptr[Ptr[GError]], GIOStatus]): Unit = !struct.at7 = value.asInstanceOf[CFuncPtr3[Ptr[Byte], GIOFlags, Ptr[Ptr[GError]], GIOStatus]]
    def io_get_flags : CFuncPtr1[Ptr[GIOChannel], GIOFlags] = struct._8.asInstanceOf[CFuncPtr1[Ptr[GIOChannel], GIOFlags]]
    def io_get_flags_=(value: CFuncPtr1[Ptr[GIOChannel], GIOFlags]): Unit = !struct.at8 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], GIOFlags]]

opaque type GKeyFile = CStruct0
object GKeyFile:
  given _tag: Tag[GKeyFile] = Tag.materializeCStruct0Tag

opaque type GList = CStruct3[gpointer, Ptr[Byte], Ptr[Byte]]
object GList:
  given _tag: Tag[GList] = Tag.materializeCStruct3Tag[gpointer, Ptr[Byte], Ptr[Byte]]
  def apply()(using Zone): Ptr[GList] = scala.scalanative.unsafe.alloc[GList](1)
  def apply(data : gpointer, next : Ptr[GList], prev : Ptr[GList])(using Zone): Ptr[GList] = 
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).next = next
    (!____ptr).prev = prev
    ____ptr
  extension (struct: GList)
    def data : gpointer = struct._1
    def data_=(value: gpointer): Unit = !struct.at1 = value
    def next : Ptr[GList] = struct._2.asInstanceOf[Ptr[GList]]
    def next_=(value: Ptr[GList]): Unit = !struct.at2 = value.asInstanceOf[Ptr[Byte]]
    def prev : Ptr[GList] = struct._3.asInstanceOf[Ptr[GList]]
    def prev_=(value: Ptr[GList]): Unit = !struct.at3 = value.asInstanceOf[Ptr[Byte]]

opaque type GLogField = CStruct3[Ptr[gchar], gconstpointer, gssize]
object GLogField:
  given _tag: Tag[GLogField] = Tag.materializeCStruct3Tag[Ptr[gchar], gconstpointer, gssize]
  def apply()(using Zone): Ptr[GLogField] = scala.scalanative.unsafe.alloc[GLogField](1)
  def apply(key : Ptr[gchar], value : gconstpointer, length : gssize)(using Zone): Ptr[GLogField] = 
    val ____ptr = apply()
    (!____ptr).key = key
    (!____ptr).value = value
    (!____ptr).length = length
    ____ptr
  extension (struct: GLogField)
    def key : Ptr[gchar] = struct._1
    def key_=(value: Ptr[gchar]): Unit = !struct.at1 = value
    def value : gconstpointer = struct._2
    def value_=(value: gconstpointer): Unit = !struct.at2 = value
    def length : gssize = struct._3
    def length_=(value: gssize): Unit = !struct.at3 = value

opaque type GMainContext = CStruct0
object GMainContext:
  given _tag: Tag[GMainContext] = Tag.materializeCStruct0Tag

opaque type GMainLoop = CStruct0
object GMainLoop:
  given _tag: Tag[GMainLoop] = Tag.materializeCStruct0Tag

opaque type GMappedFile = CStruct0
object GMappedFile:
  given _tag: Tag[GMappedFile] = Tag.materializeCStruct0Tag

opaque type GMarkupParseContext = CStruct0
object GMarkupParseContext:
  given _tag: Tag[GMarkupParseContext] = Tag.materializeCStruct0Tag

/**
 * GMarkupParser: _element: Callback to invoke when the opening tag of an element is seen. The callback's _names and _values parameters are %NULL-terminated. _element: Callback to invoke when the closing tag of an element is seen. Note that this is also called for empty tags like `<empty/>`.
*/
opaque type GMarkupParser = CStruct5[CFuncPtr6[Ptr[GMarkupParseContext], Ptr[gchar], Ptr[Ptr[gchar]], Ptr[Ptr[gchar]], gpointer, Ptr[Ptr[GError]], Unit], CFuncPtr4[Ptr[GMarkupParseContext], Ptr[gchar], gpointer, Ptr[Ptr[GError]], Unit], CFuncPtr5[Ptr[GMarkupParseContext], Ptr[gchar], gsize, gpointer, Ptr[Ptr[GError]], Unit], CFuncPtr5[Ptr[GMarkupParseContext], Ptr[gchar], gsize, gpointer, Ptr[Ptr[GError]], Unit], CFuncPtr3[Ptr[GMarkupParseContext], Ptr[GError], gpointer, Unit]]
object GMarkupParser:
  given _tag: Tag[GMarkupParser] = Tag.materializeCStruct5Tag[CFuncPtr6[Ptr[GMarkupParseContext], Ptr[gchar], Ptr[Ptr[gchar]], Ptr[Ptr[gchar]], gpointer, Ptr[Ptr[GError]], Unit], CFuncPtr4[Ptr[GMarkupParseContext], Ptr[gchar], gpointer, Ptr[Ptr[GError]], Unit], CFuncPtr5[Ptr[GMarkupParseContext], Ptr[gchar], gsize, gpointer, Ptr[Ptr[GError]], Unit], CFuncPtr5[Ptr[GMarkupParseContext], Ptr[gchar], gsize, gpointer, Ptr[Ptr[GError]], Unit], CFuncPtr3[Ptr[GMarkupParseContext], Ptr[GError], gpointer, Unit]]
  def apply()(using Zone): Ptr[GMarkupParser] = scala.scalanative.unsafe.alloc[GMarkupParser](1)
  def apply(start_element : CFuncPtr6[Ptr[GMarkupParseContext], Ptr[gchar], Ptr[Ptr[gchar]], Ptr[Ptr[gchar]], gpointer, Ptr[Ptr[GError]], Unit], end_element : CFuncPtr4[Ptr[GMarkupParseContext], Ptr[gchar], gpointer, Ptr[Ptr[GError]], Unit], text : CFuncPtr5[Ptr[GMarkupParseContext], Ptr[gchar], gsize, gpointer, Ptr[Ptr[GError]], Unit], passthrough : CFuncPtr5[Ptr[GMarkupParseContext], Ptr[gchar], gsize, gpointer, Ptr[Ptr[GError]], Unit], error : CFuncPtr3[Ptr[GMarkupParseContext], Ptr[GError], gpointer, Unit])(using Zone): Ptr[GMarkupParser] = 
    val ____ptr = apply()
    (!____ptr).start_element = start_element
    (!____ptr).end_element = end_element
    (!____ptr).text = text
    (!____ptr).passthrough = passthrough
    (!____ptr).error = error
    ____ptr
  extension (struct: GMarkupParser)
    def start_element : CFuncPtr6[Ptr[GMarkupParseContext], Ptr[gchar], Ptr[Ptr[gchar]], Ptr[Ptr[gchar]], gpointer, Ptr[Ptr[GError]], Unit] = struct._1
    def start_element_=(value: CFuncPtr6[Ptr[GMarkupParseContext], Ptr[gchar], Ptr[Ptr[gchar]], Ptr[Ptr[gchar]], gpointer, Ptr[Ptr[GError]], Unit]): Unit = !struct.at1 = value
    def end_element : CFuncPtr4[Ptr[GMarkupParseContext], Ptr[gchar], gpointer, Ptr[Ptr[GError]], Unit] = struct._2
    def end_element_=(value: CFuncPtr4[Ptr[GMarkupParseContext], Ptr[gchar], gpointer, Ptr[Ptr[GError]], Unit]): Unit = !struct.at2 = value
    def text : CFuncPtr5[Ptr[GMarkupParseContext], Ptr[gchar], gsize, gpointer, Ptr[Ptr[GError]], Unit] = struct._3
    def text_=(value: CFuncPtr5[Ptr[GMarkupParseContext], Ptr[gchar], gsize, gpointer, Ptr[Ptr[GError]], Unit]): Unit = !struct.at3 = value
    def passthrough : CFuncPtr5[Ptr[GMarkupParseContext], Ptr[gchar], gsize, gpointer, Ptr[Ptr[GError]], Unit] = struct._4
    def passthrough_=(value: CFuncPtr5[Ptr[GMarkupParseContext], Ptr[gchar], gsize, gpointer, Ptr[Ptr[GError]], Unit]): Unit = !struct.at4 = value
    def error : CFuncPtr3[Ptr[GMarkupParseContext], Ptr[GError], gpointer, Unit] = struct._5
    def error_=(value: CFuncPtr3[Ptr[GMarkupParseContext], Ptr[GError], gpointer, Unit]): Unit = !struct.at5 = value

opaque type GMatchInfo = CStruct0
object GMatchInfo:
  given _tag: Tag[GMatchInfo] = Tag.materializeCStruct0Tag

opaque type GMemChunk = CStruct0
object GMemChunk:
  given _tag: Tag[GMemChunk] = Tag.materializeCStruct0Tag

opaque type GMemVTable = CStruct6[CFuncPtr1[gsize, gpointer], CFuncPtr2[gpointer, gsize, gpointer], CFuncPtr1[gpointer, Unit], CFuncPtr2[gsize, gsize, gpointer], CFuncPtr1[gsize, gpointer], CFuncPtr2[gpointer, gsize, gpointer]]
object GMemVTable:
  given _tag: Tag[GMemVTable] = Tag.materializeCStruct6Tag[CFuncPtr1[gsize, gpointer], CFuncPtr2[gpointer, gsize, gpointer], CFuncPtr1[gpointer, Unit], CFuncPtr2[gsize, gsize, gpointer], CFuncPtr1[gsize, gpointer], CFuncPtr2[gpointer, gsize, gpointer]]
  def apply()(using Zone): Ptr[GMemVTable] = scala.scalanative.unsafe.alloc[GMemVTable](1)
  def apply(malloc : CFuncPtr1[gsize, gpointer], realloc : CFuncPtr2[gpointer, gsize, gpointer], free : CFuncPtr1[gpointer, Unit], calloc : CFuncPtr2[gsize, gsize, gpointer], try_malloc : CFuncPtr1[gsize, gpointer], try_realloc : CFuncPtr2[gpointer, gsize, gpointer])(using Zone): Ptr[GMemVTable] = 
    val ____ptr = apply()
    (!____ptr).malloc = malloc
    (!____ptr).realloc = realloc
    (!____ptr).free = free
    (!____ptr).calloc = calloc
    (!____ptr).try_malloc = try_malloc
    (!____ptr).try_realloc = try_realloc
    ____ptr
  extension (struct: GMemVTable)
    def malloc : CFuncPtr1[gsize, gpointer] = struct._1
    def malloc_=(value: CFuncPtr1[gsize, gpointer]): Unit = !struct.at1 = value
    def realloc : CFuncPtr2[gpointer, gsize, gpointer] = struct._2
    def realloc_=(value: CFuncPtr2[gpointer, gsize, gpointer]): Unit = !struct.at2 = value
    def free : CFuncPtr1[gpointer, Unit] = struct._3
    def free_=(value: CFuncPtr1[gpointer, Unit]): Unit = !struct.at3 = value
    def calloc : CFuncPtr2[gsize, gsize, gpointer] = struct._4
    def calloc_=(value: CFuncPtr2[gsize, gsize, gpointer]): Unit = !struct.at4 = value
    def try_malloc : CFuncPtr1[gsize, gpointer] = struct._5
    def try_malloc_=(value: CFuncPtr1[gsize, gpointer]): Unit = !struct.at5 = value
    def try_realloc : CFuncPtr2[gpointer, gsize, gpointer] = struct._6
    def try_realloc_=(value: CFuncPtr2[gpointer, gsize, gpointer]): Unit = !struct.at6 = value

opaque type GNode = CStruct5[gpointer, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte]]
object GNode:
  given _tag: Tag[GNode] = Tag.materializeCStruct5Tag[gpointer, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte]]
  def apply()(using Zone): Ptr[GNode] = scala.scalanative.unsafe.alloc[GNode](1)
  def apply(data : gpointer, next : Ptr[GNode], prev : Ptr[GNode], parent : Ptr[GNode], children : Ptr[GNode])(using Zone): Ptr[GNode] = 
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).next = next
    (!____ptr).prev = prev
    (!____ptr).parent = parent
    (!____ptr).children = children
    ____ptr
  extension (struct: GNode)
    def data : gpointer = struct._1
    def data_=(value: gpointer): Unit = !struct.at1 = value
    def next : Ptr[GNode] = struct._2.asInstanceOf[Ptr[GNode]]
    def next_=(value: Ptr[GNode]): Unit = !struct.at2 = value.asInstanceOf[Ptr[Byte]]
    def prev : Ptr[GNode] = struct._3.asInstanceOf[Ptr[GNode]]
    def prev_=(value: Ptr[GNode]): Unit = !struct.at3 = value.asInstanceOf[Ptr[Byte]]
    def parent : Ptr[GNode] = struct._4.asInstanceOf[Ptr[GNode]]
    def parent_=(value: Ptr[GNode]): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
    def children : Ptr[GNode] = struct._5.asInstanceOf[Ptr[GNode]]
    def children_=(value: Ptr[GNode]): Unit = !struct.at5 = value.asInstanceOf[Ptr[Byte]]

opaque type GOnce = CStruct2[GOnceStatus, gpointer]
object GOnce:
  given _tag: Tag[GOnce] = Tag.materializeCStruct2Tag[GOnceStatus, gpointer]
  def apply()(using Zone): Ptr[GOnce] = scala.scalanative.unsafe.alloc[GOnce](1)
  def apply(status : GOnceStatus, retval : gpointer)(using Zone): Ptr[GOnce] = 
    val ____ptr = apply()
    (!____ptr).status = status
    (!____ptr).retval = retval
    ____ptr
  extension (struct: GOnce)
    def status : GOnceStatus = struct._1
    def status_=(value: GOnceStatus): Unit = !struct.at1 = value
    def retval : gpointer = struct._2
    def retval_=(value: gpointer): Unit = !struct.at2 = value

opaque type GOptionContext = CStruct0
object GOptionContext:
  given _tag: Tag[GOptionContext] = Tag.materializeCStruct0Tag

/**
 * _name must be a printable ASCII character different from '-', or zero if the option has no short name. : Flags from #GOptionFlags
*/
opaque type GOptionEntry = CStruct7[Ptr[gchar], gchar, gint, GOptionArg, gpointer, Ptr[gchar], Ptr[gchar]]
object GOptionEntry:
  given _tag: Tag[GOptionEntry] = Tag.materializeCStruct7Tag[Ptr[gchar], gchar, gint, GOptionArg, gpointer, Ptr[gchar], Ptr[gchar]]
  def apply()(using Zone): Ptr[GOptionEntry] = scala.scalanative.unsafe.alloc[GOptionEntry](1)
  def apply(long_name : Ptr[gchar], short_name : gchar, flags : gint, arg : GOptionArg, arg_data : gpointer, description : Ptr[gchar], arg_description : Ptr[gchar])(using Zone): Ptr[GOptionEntry] = 
    val ____ptr = apply()
    (!____ptr).long_name = long_name
    (!____ptr).short_name = short_name
    (!____ptr).flags = flags
    (!____ptr).arg = arg
    (!____ptr).arg_data = arg_data
    (!____ptr).description = description
    (!____ptr).arg_description = arg_description
    ____ptr
  extension (struct: GOptionEntry)
    def long_name : Ptr[gchar] = struct._1
    def long_name_=(value: Ptr[gchar]): Unit = !struct.at1 = value
    def short_name : gchar = struct._2
    def short_name_=(value: gchar): Unit = !struct.at2 = value
    def flags : gint = struct._3
    def flags_=(value: gint): Unit = !struct.at3 = value
    def arg : GOptionArg = struct._4
    def arg_=(value: GOptionArg): Unit = !struct.at4 = value
    def arg_data : gpointer = struct._5
    def arg_data_=(value: gpointer): Unit = !struct.at5 = value
    def description : Ptr[gchar] = struct._6
    def description_=(value: Ptr[gchar]): Unit = !struct.at6 = value
    def arg_description : Ptr[gchar] = struct._7
    def arg_description_=(value: Ptr[gchar]): Unit = !struct.at7 = value

opaque type GOptionGroup = CStruct0
object GOptionGroup:
  given _tag: Tag[GOptionGroup] = Tag.materializeCStruct0Tag

opaque type GPathBuf = CStruct1[CArray[gpointer, Nat._8]]
object GPathBuf:
  given _tag: Tag[GPathBuf] = Tag.materializeCStruct1Tag[CArray[gpointer, Nat._8]]
  def apply()(using Zone): Ptr[GPathBuf] = scala.scalanative.unsafe.alloc[GPathBuf](1)
  def apply(dummy : CArray[gpointer, Nat._8])(using Zone): Ptr[GPathBuf] = 
    val ____ptr = apply()
    (!____ptr).dummy = dummy
    ____ptr
  extension (struct: GPathBuf)
    def dummy : CArray[gpointer, Nat._8] = struct._1
    def dummy_=(value: CArray[gpointer, Nat._8]): Unit = !struct.at1 = value

opaque type GPatternSpec = CStruct0
object GPatternSpec:
  given _tag: Tag[GPatternSpec] = Tag.materializeCStruct0Tag

/**
 * GPollFD: : the file descriptor to poll (or a HANDLE on Win32) : a bitwise combination from #GIOCondition, specifying which events should be polled for. Typically for reading from a file descriptor you would use %G_IO_IN | %G_IO_HUP | %G_IO_ERR, and for writing you would use %G_IO_OUT | %G_IO_ERR. : a bitwise combination of flags from #GIOCondition, returned from the poll() function to indicate which events occurred.
*/
opaque type GPollFD = CStruct3[gint, gushort, gushort]
object GPollFD:
  given _tag: Tag[GPollFD] = Tag.materializeCStruct3Tag[gint, gushort, gushort]
  def apply()(using Zone): Ptr[GPollFD] = scala.scalanative.unsafe.alloc[GPollFD](1)
  def apply(fd : gint, events : gushort, revents : gushort)(using Zone): Ptr[GPollFD] = 
    val ____ptr = apply()
    (!____ptr).fd = fd
    (!____ptr).events = events
    (!____ptr).revents = revents
    ____ptr
  extension (struct: GPollFD)
    def fd : gint = struct._1
    def fd_=(value: gint): Unit = !struct.at1 = value
    def events : gushort = struct._2
    def events_=(value: gushort): Unit = !struct.at2 = value
    def revents : gushort = struct._3
    def revents_=(value: gushort): Unit = !struct.at3 = value

opaque type GPrivate = CStruct3[gpointer, GDestroyNotify, CArray[gpointer, Nat._2]]
object GPrivate:
  given _tag: Tag[GPrivate] = Tag.materializeCStruct3Tag[gpointer, GDestroyNotify, CArray[gpointer, Nat._2]]
  def apply()(using Zone): Ptr[GPrivate] = scala.scalanative.unsafe.alloc[GPrivate](1)
  def apply(p : gpointer, _notify : GDestroyNotify, future : CArray[gpointer, Nat._2])(using Zone): Ptr[GPrivate] = 
    val ____ptr = apply()
    (!____ptr).p = p
    (!____ptr)._notify = _notify
    (!____ptr).future = future
    ____ptr
  extension (struct: GPrivate)
    def p : gpointer = struct._1
    def p_=(value: gpointer): Unit = !struct.at1 = value
    def _notify : GDestroyNotify = struct._2
    def _notify_=(value: GDestroyNotify): Unit = !struct.at2 = value
    def future : CArray[gpointer, Nat._2] = struct._3
    def future_=(value: CArray[gpointer, Nat._2]): Unit = !struct.at3 = value

opaque type GPtrArray = CStruct2[Ptr[gpointer], guint]
object GPtrArray:
  given _tag: Tag[GPtrArray] = Tag.materializeCStruct2Tag[Ptr[gpointer], guint]
  def apply()(using Zone): Ptr[GPtrArray] = scala.scalanative.unsafe.alloc[GPtrArray](1)
  def apply(pdata : Ptr[gpointer], len : guint)(using Zone): Ptr[GPtrArray] = 
    val ____ptr = apply()
    (!____ptr).pdata = pdata
    (!____ptr).len = len
    ____ptr
  extension (struct: GPtrArray)
    def pdata : Ptr[gpointer] = struct._1
    def pdata_=(value: Ptr[gpointer]): Unit = !struct.at1 = value
    def len : guint = struct._2
    def len_=(value: guint): Unit = !struct.at2 = value

/**
 * GQueue: : a pointer to the first element of the queue : a pointer to the last element of the queue : the number of elements in the queue
*/
opaque type GQueue = CStruct3[Ptr[Byte], Ptr[Byte], guint]
object GQueue:
  given _tag: Tag[GQueue] = Tag.materializeCStruct3Tag[Ptr[Byte], Ptr[Byte], guint]
  def apply()(using Zone): Ptr[GQueue] = scala.scalanative.unsafe.alloc[GQueue](1)
  def apply(head : Ptr[GList], tail : Ptr[GList], length : guint)(using Zone): Ptr[GQueue] = 
    val ____ptr = apply()
    (!____ptr).head = head
    (!____ptr).tail = tail
    (!____ptr).length = length
    ____ptr
  extension (struct: GQueue)
    def head : Ptr[GList] = struct._1.asInstanceOf[Ptr[GList]]
    def head_=(value: Ptr[GList]): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
    def tail : Ptr[GList] = struct._2.asInstanceOf[Ptr[GList]]
    def tail_=(value: Ptr[GList]): Unit = !struct.at2 = value.asInstanceOf[Ptr[Byte]]
    def length : guint = struct._3
    def length_=(value: guint): Unit = !struct.at3 = value

opaque type GRWLock = CStruct2[gpointer, CArray[guint, Nat._2]]
object GRWLock:
  given _tag: Tag[GRWLock] = Tag.materializeCStruct2Tag[gpointer, CArray[guint, Nat._2]]
  def apply()(using Zone): Ptr[GRWLock] = scala.scalanative.unsafe.alloc[GRWLock](1)
  def apply(p : gpointer, i : CArray[guint, Nat._2])(using Zone): Ptr[GRWLock] = 
    val ____ptr = apply()
    (!____ptr).p = p
    (!____ptr).i = i
    ____ptr
  extension (struct: GRWLock)
    def p : gpointer = struct._1
    def p_=(value: gpointer): Unit = !struct.at1 = value
    def i : CArray[guint, Nat._2] = struct._2
    def i_=(value: CArray[guint, Nat._2]): Unit = !struct.at2 = value

opaque type GRand = CStruct0
object GRand:
  given _tag: Tag[GRand] = Tag.materializeCStruct0Tag

opaque type GRecMutex = CStruct2[gpointer, CArray[guint, Nat._2]]
object GRecMutex:
  given _tag: Tag[GRecMutex] = Tag.materializeCStruct2Tag[gpointer, CArray[guint, Nat._2]]
  def apply()(using Zone): Ptr[GRecMutex] = scala.scalanative.unsafe.alloc[GRecMutex](1)
  def apply(p : gpointer, i : CArray[guint, Nat._2])(using Zone): Ptr[GRecMutex] = 
    val ____ptr = apply()
    (!____ptr).p = p
    (!____ptr).i = i
    ____ptr
  extension (struct: GRecMutex)
    def p : gpointer = struct._1
    def p_=(value: gpointer): Unit = !struct.at1 = value
    def i : CArray[guint, Nat._2] = struct._2
    def i_=(value: CArray[guint, Nat._2]): Unit = !struct.at2 = value

opaque type GRegex = CStruct0
object GRegex:
  given _tag: Tag[GRegex] = Tag.materializeCStruct0Tag

opaque type GRelation = CStruct0
object GRelation:
  given _tag: Tag[GRelation] = Tag.materializeCStruct0Tag

opaque type GSList = CStruct2[gpointer, Ptr[Byte]]
object GSList:
  given _tag: Tag[GSList] = Tag.materializeCStruct2Tag[gpointer, Ptr[Byte]]
  def apply()(using Zone): Ptr[GSList] = scala.scalanative.unsafe.alloc[GSList](1)
  def apply(data : gpointer, next : Ptr[GSList])(using Zone): Ptr[GSList] = 
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).next = next
    ____ptr
  extension (struct: GSList)
    def data : gpointer = struct._1
    def data_=(value: gpointer): Unit = !struct.at1 = value
    def next : Ptr[GSList] = struct._2.asInstanceOf[Ptr[GSList]]
    def next_=(value: Ptr[GSList]): Unit = !struct.at2 = value.asInstanceOf[Ptr[Byte]]

opaque type GScanner = CStruct21[gpointer, guint, guint, Ptr[gchar], Ptr[GData], Ptr[GScannerConfig], GTokenType, GTokenValue, guint, guint, GTokenType, GTokenValue, guint, guint, Ptr[GHashTable], gint, Ptr[gchar], Ptr[gchar], Ptr[gchar], guint, Ptr[Byte]]
object GScanner:
  given _tag: Tag[GScanner] = Tag.materializeCStruct21Tag[gpointer, guint, guint, Ptr[gchar], Ptr[GData], Ptr[GScannerConfig], GTokenType, GTokenValue, guint, guint, GTokenType, GTokenValue, guint, guint, Ptr[GHashTable], gint, Ptr[gchar], Ptr[gchar], Ptr[gchar], guint, Ptr[Byte]]
  def apply()(using Zone): Ptr[GScanner] = scala.scalanative.unsafe.alloc[GScanner](1)
  def apply(user_data : gpointer, max_parse_errors : guint, parse_errors : guint, input_name : Ptr[gchar], qdata : Ptr[GData], config : Ptr[GScannerConfig], token : GTokenType, value : GTokenValue, line : guint, position : guint, next_token : GTokenType, next_value : GTokenValue, next_line : guint, next_position : guint, symbol_table : Ptr[GHashTable], input_fd : gint, text : Ptr[gchar], text_end : Ptr[gchar], buffer : Ptr[gchar], scope_id : guint, msg_handler : GScannerMsgFunc)(using Zone): Ptr[GScanner] = 
    val ____ptr = apply()
    (!____ptr).user_data = user_data
    (!____ptr).max_parse_errors = max_parse_errors
    (!____ptr).parse_errors = parse_errors
    (!____ptr).input_name = input_name
    (!____ptr).qdata = qdata
    (!____ptr).config = config
    (!____ptr).token = token
    (!____ptr).value = value
    (!____ptr).line = line
    (!____ptr).position = position
    (!____ptr).next_token = next_token
    (!____ptr).next_value = next_value
    (!____ptr).next_line = next_line
    (!____ptr).next_position = next_position
    (!____ptr).symbol_table = symbol_table
    (!____ptr).input_fd = input_fd
    (!____ptr).text = text
    (!____ptr).text_end = text_end
    (!____ptr).buffer = buffer
    (!____ptr).scope_id = scope_id
    (!____ptr).msg_handler = msg_handler
    ____ptr
  extension (struct: GScanner)
    def user_data : gpointer = struct._1
    def user_data_=(value: gpointer): Unit = !struct.at1 = value
    def max_parse_errors : guint = struct._2
    def max_parse_errors_=(value: guint): Unit = !struct.at2 = value
    def parse_errors : guint = struct._3
    def parse_errors_=(value: guint): Unit = !struct.at3 = value
    def input_name : Ptr[gchar] = struct._4
    def input_name_=(value: Ptr[gchar]): Unit = !struct.at4 = value
    def qdata : Ptr[GData] = struct._5
    def qdata_=(value: Ptr[GData]): Unit = !struct.at5 = value
    def config : Ptr[GScannerConfig] = struct._6
    def config_=(value: Ptr[GScannerConfig]): Unit = !struct.at6 = value
    def token : GTokenType = struct._7
    def token_=(value: GTokenType): Unit = !struct.at7 = value
    def value : GTokenValue = struct._8
    def value_=(value: GTokenValue): Unit = !struct.at8 = value
    def line : guint = struct._9
    def line_=(value: guint): Unit = !struct.at9 = value
    def position : guint = struct._10
    def position_=(value: guint): Unit = !struct.at10 = value
    def next_token : GTokenType = struct._11
    def next_token_=(value: GTokenType): Unit = !struct.at11 = value
    def next_value : GTokenValue = struct._12
    def next_value_=(value: GTokenValue): Unit = !struct.at12 = value
    def next_line : guint = struct._13
    def next_line_=(value: guint): Unit = !struct.at13 = value
    def next_position : guint = struct._14
    def next_position_=(value: guint): Unit = !struct.at14 = value
    def symbol_table : Ptr[GHashTable] = struct._15
    def symbol_table_=(value: Ptr[GHashTable]): Unit = !struct.at15 = value
    def input_fd : gint = struct._16
    def input_fd_=(value: gint): Unit = !struct.at16 = value
    def text : Ptr[gchar] = struct._17
    def text_=(value: Ptr[gchar]): Unit = !struct.at17 = value
    def text_end : Ptr[gchar] = struct._18
    def text_end_=(value: Ptr[gchar]): Unit = !struct.at18 = value
    def buffer : Ptr[gchar] = struct._19
    def buffer_=(value: Ptr[gchar]): Unit = !struct.at19 = value
    def scope_id : guint = struct._20
    def scope_id_=(value: guint): Unit = !struct.at20 = value
    def msg_handler : GScannerMsgFunc = struct._21.asInstanceOf[GScannerMsgFunc]
    def msg_handler_=(value: GScannerMsgFunc): Unit = !struct.at21 = value.asInstanceOf[Ptr[Byte]]

opaque type GScannerConfig = CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]
object GScannerConfig:
  given _tag: Tag[GScannerConfig] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._0]](Tag.Byte, Tag.Digit2[Nat._4, Nat._0](Tag.Nat4, Tag.Nat0))
  def apply()(using Zone): Ptr[GScannerConfig] = scala.scalanative.unsafe.alloc[GScannerConfig](1)
  def apply(cset_skip_characters : Ptr[gchar], cset_identifier_first : Ptr[gchar], cset_identifier_nth : Ptr[gchar], cpair_comment_single : Ptr[gchar], case_sensitive : guint, skip_comment_multi : guint, skip_comment_single : guint, scan_comment_multi : guint, scan_identifier : guint, scan_identifier_1char : guint, scan_identifier_NULL : guint, scan_symbols : guint, scan_binary : guint, scan_octal : guint, scan_float : guint, scan_hex : guint, scan_hex_dollar : guint, scan_string_sq : guint, scan_string_dq : guint, numbers_2_int : guint, int_2_float : guint, identifier_2_string : guint, char_2_token : guint, symbol_2_token : guint, scope_0_fallback : guint, store_int64 : guint, padding_dummy : guint)(using Zone): Ptr[GScannerConfig] = 
    val ____ptr = apply()
    (!____ptr).cset_skip_characters = cset_skip_characters
    (!____ptr).cset_identifier_first = cset_identifier_first
    (!____ptr).cset_identifier_nth = cset_identifier_nth
    (!____ptr).cpair_comment_single = cpair_comment_single
    (!____ptr).case_sensitive = case_sensitive
    (!____ptr).skip_comment_multi = skip_comment_multi
    (!____ptr).skip_comment_single = skip_comment_single
    (!____ptr).scan_comment_multi = scan_comment_multi
    (!____ptr).scan_identifier = scan_identifier
    (!____ptr).scan_identifier_1char = scan_identifier_1char
    (!____ptr).scan_identifier_NULL = scan_identifier_NULL
    (!____ptr).scan_symbols = scan_symbols
    (!____ptr).scan_binary = scan_binary
    (!____ptr).scan_octal = scan_octal
    (!____ptr).scan_float = scan_float
    (!____ptr).scan_hex = scan_hex
    (!____ptr).scan_hex_dollar = scan_hex_dollar
    (!____ptr).scan_string_sq = scan_string_sq
    (!____ptr).scan_string_dq = scan_string_dq
    (!____ptr).numbers_2_int = numbers_2_int
    (!____ptr).int_2_float = int_2_float
    (!____ptr).identifier_2_string = identifier_2_string
    (!____ptr).char_2_token = char_2_token
    (!____ptr).symbol_2_token = symbol_2_token
    (!____ptr).scope_0_fallback = scope_0_fallback
    (!____ptr).store_int64 = store_int64
    (!____ptr).padding_dummy = padding_dummy
    ____ptr
  extension (struct: GScannerConfig)
    def cset_skip_characters: Ptr[gchar] = !struct.at(offsets(0)).asInstanceOf[Ptr[Ptr[gchar]]]
    def cset_skip_characters_=(value: Ptr[gchar]): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[Ptr[gchar]]] = value
    def cset_identifier_first: Ptr[gchar] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[gchar]]]
    def cset_identifier_first_=(value: Ptr[gchar]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[gchar]]] = value
    def cset_identifier_nth: Ptr[gchar] = !struct.at(offsets(2)).asInstanceOf[Ptr[Ptr[gchar]]]
    def cset_identifier_nth_=(value: Ptr[gchar]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[Ptr[gchar]]] = value
    def cpair_comment_single: Ptr[gchar] = !struct.at(offsets(3)).asInstanceOf[Ptr[Ptr[gchar]]]
    def cpair_comment_single_=(value: Ptr[gchar]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[Ptr[gchar]]] = value
    def case_sensitive: guint = !struct.at(offsets(4)).asInstanceOf[Ptr[guint]]
    def case_sensitive_=(value: guint): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[guint]] = value
    def skip_comment_multi: guint = !struct.at(offsets(5)).asInstanceOf[Ptr[guint]]
    def skip_comment_multi_=(value: guint): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[guint]] = value
    def skip_comment_single: guint = !struct.at(offsets(6)).asInstanceOf[Ptr[guint]]
    def skip_comment_single_=(value: guint): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[guint]] = value
    def scan_comment_multi: guint = !struct.at(offsets(7)).asInstanceOf[Ptr[guint]]
    def scan_comment_multi_=(value: guint): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[guint]] = value
    def scan_identifier: guint = !struct.at(offsets(8)).asInstanceOf[Ptr[guint]]
    def scan_identifier_=(value: guint): Unit = !struct.at(offsets(8)).asInstanceOf[Ptr[guint]] = value
    def scan_identifier_1char: guint = !struct.at(offsets(9)).asInstanceOf[Ptr[guint]]
    def scan_identifier_1char_=(value: guint): Unit = !struct.at(offsets(9)).asInstanceOf[Ptr[guint]] = value
    def scan_identifier_NULL: guint = !struct.at(offsets(10)).asInstanceOf[Ptr[guint]]
    def scan_identifier_NULL_=(value: guint): Unit = !struct.at(offsets(10)).asInstanceOf[Ptr[guint]] = value
    def scan_symbols: guint = !struct.at(offsets(11)).asInstanceOf[Ptr[guint]]
    def scan_symbols_=(value: guint): Unit = !struct.at(offsets(11)).asInstanceOf[Ptr[guint]] = value
    def scan_binary: guint = !struct.at(offsets(12)).asInstanceOf[Ptr[guint]]
    def scan_binary_=(value: guint): Unit = !struct.at(offsets(12)).asInstanceOf[Ptr[guint]] = value
    def scan_octal: guint = !struct.at(offsets(13)).asInstanceOf[Ptr[guint]]
    def scan_octal_=(value: guint): Unit = !struct.at(offsets(13)).asInstanceOf[Ptr[guint]] = value
    def scan_float: guint = !struct.at(offsets(14)).asInstanceOf[Ptr[guint]]
    def scan_float_=(value: guint): Unit = !struct.at(offsets(14)).asInstanceOf[Ptr[guint]] = value
    def scan_hex: guint = !struct.at(offsets(15)).asInstanceOf[Ptr[guint]]
    def scan_hex_=(value: guint): Unit = !struct.at(offsets(15)).asInstanceOf[Ptr[guint]] = value
    def scan_hex_dollar: guint = !struct.at(offsets(16)).asInstanceOf[Ptr[guint]]
    def scan_hex_dollar_=(value: guint): Unit = !struct.at(offsets(16)).asInstanceOf[Ptr[guint]] = value
    def scan_string_sq: guint = !struct.at(offsets(17)).asInstanceOf[Ptr[guint]]
    def scan_string_sq_=(value: guint): Unit = !struct.at(offsets(17)).asInstanceOf[Ptr[guint]] = value
    def scan_string_dq: guint = !struct.at(offsets(18)).asInstanceOf[Ptr[guint]]
    def scan_string_dq_=(value: guint): Unit = !struct.at(offsets(18)).asInstanceOf[Ptr[guint]] = value
    def numbers_2_int: guint = !struct.at(offsets(19)).asInstanceOf[Ptr[guint]]
    def numbers_2_int_=(value: guint): Unit = !struct.at(offsets(19)).asInstanceOf[Ptr[guint]] = value
    def int_2_float: guint = !struct.at(offsets(20)).asInstanceOf[Ptr[guint]]
    def int_2_float_=(value: guint): Unit = !struct.at(offsets(20)).asInstanceOf[Ptr[guint]] = value
    def identifier_2_string: guint = !struct.at(offsets(21)).asInstanceOf[Ptr[guint]]
    def identifier_2_string_=(value: guint): Unit = !struct.at(offsets(21)).asInstanceOf[Ptr[guint]] = value
    def char_2_token: guint = !struct.at(offsets(22)).asInstanceOf[Ptr[guint]]
    def char_2_token_=(value: guint): Unit = !struct.at(offsets(22)).asInstanceOf[Ptr[guint]] = value
    def symbol_2_token: guint = !struct.at(offsets(23)).asInstanceOf[Ptr[guint]]
    def symbol_2_token_=(value: guint): Unit = !struct.at(offsets(23)).asInstanceOf[Ptr[guint]] = value
    def scope_0_fallback: guint = !struct.at(offsets(24)).asInstanceOf[Ptr[guint]]
    def scope_0_fallback_=(value: guint): Unit = !struct.at(offsets(24)).asInstanceOf[Ptr[guint]] = value
    def store_int64: guint = !struct.at(offsets(25)).asInstanceOf[Ptr[guint]]
    def store_int64_=(value: guint): Unit = !struct.at(offsets(25)).asInstanceOf[Ptr[guint]] = value
    def padding_dummy: guint = !struct.at(offsets(26)).asInstanceOf[Ptr[guint]]
    def padding_dummy_=(value: guint): Unit = !struct.at(offsets(26)).asInstanceOf[Ptr[guint]] = value
  val offsets: Array[Int] = 
    val res = Array.ofDim[Int](27)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[Ptr[gchar]].toInt)
    res(1) = align(res(0) + sizeof[Ptr[gchar]].toInt, alignmentof[Ptr[gchar]].toInt)
    res(2) = align(res(1) + sizeof[Ptr[gchar]].toInt, alignmentof[Ptr[gchar]].toInt)
    res(3) = align(res(2) + sizeof[Ptr[gchar]].toInt, alignmentof[Ptr[gchar]].toInt)
    res(4) = align(res(3) + sizeof[Ptr[gchar]].toInt, alignmentof[guint].toInt)
    res(5) = align(res(4) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(6) = align(res(5) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(7) = align(res(6) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(8) = align(res(7) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(9) = align(res(8) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(10) = align(res(9) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(11) = align(res(10) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(12) = align(res(11) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(13) = align(res(12) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(14) = align(res(13) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(15) = align(res(14) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(16) = align(res(15) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(17) = align(res(16) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(18) = align(res(17) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(19) = align(res(18) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(20) = align(res(19) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(21) = align(res(20) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(22) = align(res(21) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(23) = align(res(22) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(24) = align(res(23) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(25) = align(res(24) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(26) = align(res(25) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res
  end offsets

opaque type GSequence = CStruct0
object GSequence:
  given _tag: Tag[GSequence] = Tag.materializeCStruct0Tag

opaque type GSequenceIter = CStruct0
object GSequenceIter:
  given _tag: Tag[GSequenceIter] = Tag.materializeCStruct0Tag

opaque type GSource = CStruct13[gpointer, Ptr[Byte], Ptr[Byte], guint, Ptr[GMainContext], gint, guint, guint, Ptr[Byte], Ptr[Byte], Ptr[Byte], CString, Ptr[GSourcePrivate]]
object GSource:
  given _tag: Tag[GSource] = Tag.materializeCStruct13Tag[gpointer, Ptr[Byte], Ptr[Byte], guint, Ptr[GMainContext], gint, guint, guint, Ptr[Byte], Ptr[Byte], Ptr[Byte], CString, Ptr[GSourcePrivate]]
  def apply()(using Zone): Ptr[GSource] = scala.scalanative.unsafe.alloc[GSource](1)
  def apply(callback_data : gpointer, callback_funcs : Ptr[GSourceCallbackFuncs], source_funcs : Ptr[GSourceFuncs], ref_count : guint, context : Ptr[GMainContext], priority : gint, flags : guint, source_id : guint, poll_fds : Ptr[GSList], prev : Ptr[GSource], next : Ptr[GSource], name : CString, priv : Ptr[GSourcePrivate])(using Zone): Ptr[GSource] = 
    val ____ptr = apply()
    (!____ptr).callback_data = callback_data
    (!____ptr).callback_funcs = callback_funcs
    (!____ptr).source_funcs = source_funcs
    (!____ptr).ref_count = ref_count
    (!____ptr).context = context
    (!____ptr).priority = priority
    (!____ptr).flags = flags
    (!____ptr).source_id = source_id
    (!____ptr).poll_fds = poll_fds
    (!____ptr).prev = prev
    (!____ptr).next = next
    (!____ptr).name = name
    (!____ptr).priv = priv
    ____ptr
  extension (struct: GSource)
    def callback_data : gpointer = struct._1
    def callback_data_=(value: gpointer): Unit = !struct.at1 = value
    def callback_funcs : Ptr[GSourceCallbackFuncs] = struct._2.asInstanceOf[Ptr[GSourceCallbackFuncs]]
    def callback_funcs_=(value: Ptr[GSourceCallbackFuncs]): Unit = !struct.at2 = value.asInstanceOf[Ptr[Byte]]
    def source_funcs : Ptr[GSourceFuncs] = struct._3.asInstanceOf[Ptr[GSourceFuncs]]
    def source_funcs_=(value: Ptr[GSourceFuncs]): Unit = !struct.at3 = value.asInstanceOf[Ptr[Byte]]
    def ref_count : guint = struct._4
    def ref_count_=(value: guint): Unit = !struct.at4 = value
    def context : Ptr[GMainContext] = struct._5
    def context_=(value: Ptr[GMainContext]): Unit = !struct.at5 = value
    def priority : gint = struct._6
    def priority_=(value: gint): Unit = !struct.at6 = value
    def flags : guint = struct._7
    def flags_=(value: guint): Unit = !struct.at7 = value
    def source_id : guint = struct._8
    def source_id_=(value: guint): Unit = !struct.at8 = value
    def poll_fds : Ptr[GSList] = struct._9.asInstanceOf[Ptr[GSList]]
    def poll_fds_=(value: Ptr[GSList]): Unit = !struct.at9 = value.asInstanceOf[Ptr[Byte]]
    def prev : Ptr[GSource] = struct._10.asInstanceOf[Ptr[GSource]]
    def prev_=(value: Ptr[GSource]): Unit = !struct.at10 = value.asInstanceOf[Ptr[Byte]]
    def next : Ptr[GSource] = struct._11.asInstanceOf[Ptr[GSource]]
    def next_=(value: Ptr[GSource]): Unit = !struct.at11 = value.asInstanceOf[Ptr[Byte]]
    def name : CString = struct._12
    def name_=(value: CString): Unit = !struct.at12 = value
    def priv : Ptr[GSourcePrivate] = struct._13
    def priv_=(value: Ptr[GSourcePrivate]): Unit = !struct.at13 = value

opaque type GSourceCallbackFuncs = CStruct3[CFuncPtr1[gpointer, Unit], CFuncPtr1[gpointer, Unit], CFuncPtr4[gpointer, Ptr[Byte], Ptr[GSourceFunc], Ptr[gpointer], Unit]]
object GSourceCallbackFuncs:
  given _tag: Tag[GSourceCallbackFuncs] = Tag.materializeCStruct3Tag[CFuncPtr1[gpointer, Unit], CFuncPtr1[gpointer, Unit], CFuncPtr4[gpointer, Ptr[Byte], Ptr[GSourceFunc], Ptr[gpointer], Unit]]
  def apply()(using Zone): Ptr[GSourceCallbackFuncs] = scala.scalanative.unsafe.alloc[GSourceCallbackFuncs](1)
  def apply(ref : CFuncPtr1[gpointer, Unit], unref : CFuncPtr1[gpointer, Unit], get : CFuncPtr4[gpointer, Ptr[GSource], Ptr[GSourceFunc], Ptr[gpointer], Unit])(using Zone): Ptr[GSourceCallbackFuncs] = 
    val ____ptr = apply()
    (!____ptr).ref = ref
    (!____ptr).unref = unref
    (!____ptr).get = get
    ____ptr
  extension (struct: GSourceCallbackFuncs)
    def ref : CFuncPtr1[gpointer, Unit] = struct._1
    def ref_=(value: CFuncPtr1[gpointer, Unit]): Unit = !struct.at1 = value
    def unref : CFuncPtr1[gpointer, Unit] = struct._2
    def unref_=(value: CFuncPtr1[gpointer, Unit]): Unit = !struct.at2 = value
    def get : CFuncPtr4[gpointer, Ptr[GSource], Ptr[GSourceFunc], Ptr[gpointer], Unit] = struct._3.asInstanceOf[CFuncPtr4[gpointer, Ptr[GSource], Ptr[GSourceFunc], Ptr[gpointer], Unit]]
    def get_=(value: CFuncPtr4[gpointer, Ptr[GSource], Ptr[GSourceFunc], Ptr[gpointer], Unit]): Unit = !struct.at3 = value.asInstanceOf[CFuncPtr4[gpointer, Ptr[Byte], Ptr[GSourceFunc], Ptr[gpointer], Unit]]

opaque type GSourceFuncs = CStruct6[CFuncPtr2[Ptr[Byte], Ptr[gint], gboolean], CFuncPtr1[Ptr[Byte], gboolean], CFuncPtr3[Ptr[Byte], GSourceFunc, gpointer, gboolean], CFuncPtr1[Ptr[Byte], Unit], GSourceFunc, GSourceDummyMarshal]
object GSourceFuncs:
  given _tag: Tag[GSourceFuncs] = Tag.materializeCStruct6Tag[CFuncPtr2[Ptr[Byte], Ptr[gint], gboolean], CFuncPtr1[Ptr[Byte], gboolean], CFuncPtr3[Ptr[Byte], GSourceFunc, gpointer, gboolean], CFuncPtr1[Ptr[Byte], Unit], GSourceFunc, GSourceDummyMarshal]
  def apply()(using Zone): Ptr[GSourceFuncs] = scala.scalanative.unsafe.alloc[GSourceFuncs](1)
  def apply(prepare : CFuncPtr2[Ptr[GSource], Ptr[gint], gboolean], check : CFuncPtr1[Ptr[GSource], gboolean], dispatch : CFuncPtr3[Ptr[GSource], GSourceFunc, gpointer, gboolean], finalize : CFuncPtr1[Ptr[GSource], Unit], closure_callback : GSourceFunc, closure_marshal : GSourceDummyMarshal)(using Zone): Ptr[GSourceFuncs] = 
    val ____ptr = apply()
    (!____ptr).prepare = prepare
    (!____ptr).check = check
    (!____ptr).dispatch = dispatch
    (!____ptr).finalize = finalize
    (!____ptr).closure_callback = closure_callback
    (!____ptr).closure_marshal = closure_marshal
    ____ptr
  extension (struct: GSourceFuncs)
    def prepare : CFuncPtr2[Ptr[GSource], Ptr[gint], gboolean] = struct._1.asInstanceOf[CFuncPtr2[Ptr[GSource], Ptr[gint], gboolean]]
    def prepare_=(value: CFuncPtr2[Ptr[GSource], Ptr[gint], gboolean]): Unit = !struct.at1 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], Ptr[gint], gboolean]]
    def check : CFuncPtr1[Ptr[GSource], gboolean] = struct._2.asInstanceOf[CFuncPtr1[Ptr[GSource], gboolean]]
    def check_=(value: CFuncPtr1[Ptr[GSource], gboolean]): Unit = !struct.at2 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], gboolean]]
    def dispatch : CFuncPtr3[Ptr[GSource], GSourceFunc, gpointer, gboolean] = struct._3.asInstanceOf[CFuncPtr3[Ptr[GSource], GSourceFunc, gpointer, gboolean]]
    def dispatch_=(value: CFuncPtr3[Ptr[GSource], GSourceFunc, gpointer, gboolean]): Unit = !struct.at3 = value.asInstanceOf[CFuncPtr3[Ptr[Byte], GSourceFunc, gpointer, gboolean]]
    def finalize : CFuncPtr1[Ptr[GSource], Unit] = struct._4.asInstanceOf[CFuncPtr1[Ptr[GSource], Unit]]
    def finalize_=(value: CFuncPtr1[Ptr[GSource], Unit]): Unit = !struct.at4 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], Unit]]
    def closure_callback : GSourceFunc = struct._5
    def closure_callback_=(value: GSourceFunc): Unit = !struct.at5 = value
    def closure_marshal : GSourceDummyMarshal = struct._6
    def closure_marshal_=(value: GSourceDummyMarshal): Unit = !struct.at6 = value

opaque type GSourcePrivate = CStruct0
object GSourcePrivate:
  given _tag: Tag[GSourcePrivate] = Tag.materializeCStruct0Tag

opaque type GStaticMutex = CStruct2[Ptr[GMutex], pthread_mutex_t]
object GStaticMutex:
  given _tag: Tag[GStaticMutex] = Tag.materializeCStruct2Tag[Ptr[GMutex], pthread_mutex_t]
  def apply()(using Zone): Ptr[GStaticMutex] = scala.scalanative.unsafe.alloc[GStaticMutex](1)
  def apply(mutex : Ptr[GMutex], unused : pthread_mutex_t)(using Zone): Ptr[GStaticMutex] = 
    val ____ptr = apply()
    (!____ptr).mutex = mutex
    (!____ptr).unused = unused
    ____ptr
  extension (struct: GStaticMutex)
    def mutex : Ptr[GMutex] = struct._1
    def mutex_=(value: Ptr[GMutex]): Unit = !struct.at1 = value
    def unused : pthread_mutex_t = struct._2
    def unused_=(value: pthread_mutex_t): Unit = !struct.at2 = value

opaque type GStaticPrivate = CStruct1[guint]
object GStaticPrivate:
  given _tag: Tag[GStaticPrivate] = Tag.materializeCStruct1Tag[guint]
  def apply()(using Zone): Ptr[GStaticPrivate] = scala.scalanative.unsafe.alloc[GStaticPrivate](1)
  def apply(index : guint)(using Zone): Ptr[GStaticPrivate] = 
    val ____ptr = apply()
    (!____ptr).index = index
    ____ptr
  extension (struct: GStaticPrivate)
    def index : guint = struct._1
    def index_=(value: guint): Unit = !struct.at1 = value

opaque type GStaticRWLock = CStruct7[GStaticMutex, Ptr[GCond], Ptr[GCond], guint, gboolean, guint, guint]
object GStaticRWLock:
  given _tag: Tag[GStaticRWLock] = Tag.materializeCStruct7Tag[GStaticMutex, Ptr[GCond], Ptr[GCond], guint, gboolean, guint, guint]
  def apply()(using Zone): Ptr[GStaticRWLock] = scala.scalanative.unsafe.alloc[GStaticRWLock](1)
  def apply(mutex : GStaticMutex, read_cond : Ptr[GCond], write_cond : Ptr[GCond], read_counter : guint, have_writer : gboolean, want_to_read : guint, want_to_write : guint)(using Zone): Ptr[GStaticRWLock] = 
    val ____ptr = apply()
    (!____ptr).mutex = mutex
    (!____ptr).read_cond = read_cond
    (!____ptr).write_cond = write_cond
    (!____ptr).read_counter = read_counter
    (!____ptr).have_writer = have_writer
    (!____ptr).want_to_read = want_to_read
    (!____ptr).want_to_write = want_to_write
    ____ptr
  extension (struct: GStaticRWLock)
    def mutex : GStaticMutex = struct._1
    def mutex_=(value: GStaticMutex): Unit = !struct.at1 = value
    def read_cond : Ptr[GCond] = struct._2
    def read_cond_=(value: Ptr[GCond]): Unit = !struct.at2 = value
    def write_cond : Ptr[GCond] = struct._3
    def write_cond_=(value: Ptr[GCond]): Unit = !struct.at3 = value
    def read_counter : guint = struct._4
    def read_counter_=(value: guint): Unit = !struct.at4 = value
    def have_writer : gboolean = struct._5
    def have_writer_=(value: gboolean): Unit = !struct.at5 = value
    def want_to_read : guint = struct._6
    def want_to_read_=(value: guint): Unit = !struct.at6 = value
    def want_to_write : guint = struct._7
    def want_to_write_=(value: guint): Unit = !struct.at7 = value

opaque type GStaticRecMutex = CStruct3[GStaticMutex, guint, GStaticRecMutex.Union0]
object GStaticRecMutex:
  opaque type Union0 = CArray[Byte, Nat._8]
  object Union0:
    given _tag: Tag[Union0] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
    def apply()(using Zone): Ptr[Union0] = 
      val ___ptr = alloc[Union0](1)
      ___ptr
    @scala.annotation.targetName("apply_owner")
    def apply(owner: pthread_t)(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[pthread_t]].update(0, owner)
      ___ptr
    @scala.annotation.targetName("apply_dummy")
    def apply(dummy: gdouble)(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[gdouble]].update(0, dummy)
      ___ptr
    extension (struct: Union0)
      def owner : pthread_t = !struct.at(0).asInstanceOf[Ptr[pthread_t]]
      def owner_=(value: pthread_t): Unit = !struct.at(0).asInstanceOf[Ptr[pthread_t]] = value
      def dummy : gdouble = !struct.at(0).asInstanceOf[Ptr[gdouble]]
      def dummy_=(value: gdouble): Unit = !struct.at(0).asInstanceOf[Ptr[gdouble]] = value
  given _tag: Tag[GStaticRecMutex] = Tag.materializeCStruct3Tag[GStaticMutex, guint, GStaticRecMutex.Union0]
  def apply()(using Zone): Ptr[GStaticRecMutex] = scala.scalanative.unsafe.alloc[GStaticRecMutex](1)
  def apply(mutex : GStaticMutex, depth : guint, unused : GStaticRecMutex.Union0)(using Zone): Ptr[GStaticRecMutex] = 
    val ____ptr = apply()
    (!____ptr).mutex = mutex
    (!____ptr).depth = depth
    (!____ptr).unused = unused
    ____ptr
  extension (struct: GStaticRecMutex)
    def mutex : GStaticMutex = struct._1
    def mutex_=(value: GStaticMutex): Unit = !struct.at1 = value
    def depth : guint = struct._2
    def depth_=(value: guint): Unit = !struct.at2 = value
    def unused : GStaticRecMutex.Union0 = struct._3
    def unused_=(value: GStaticRecMutex.Union0): Unit = !struct.at3 = value

opaque type GString = CStruct3[Ptr[gchar], gsize, gsize]
object GString:
  given _tag: Tag[GString] = Tag.materializeCStruct3Tag[Ptr[gchar], gsize, gsize]
  def apply()(using Zone): Ptr[GString] = scala.scalanative.unsafe.alloc[GString](1)
  def apply(str : Ptr[gchar], len : gsize, allocated_len : gsize)(using Zone): Ptr[GString] = 
    val ____ptr = apply()
    (!____ptr).str = str
    (!____ptr).len = len
    (!____ptr).allocated_len = allocated_len
    ____ptr
  extension (struct: GString)
    def str : Ptr[gchar] = struct._1
    def str_=(value: Ptr[gchar]): Unit = !struct.at1 = value
    def len : gsize = struct._2
    def len_=(value: gsize): Unit = !struct.at2 = value
    def allocated_len : gsize = struct._3
    def allocated_len_=(value: gsize): Unit = !struct.at3 = value

opaque type GStringChunk = CStruct0
object GStringChunk:
  given _tag: Tag[GStringChunk] = Tag.materializeCStruct0Tag

opaque type GStrvBuilder = CStruct0
object GStrvBuilder:
  given _tag: Tag[GStrvBuilder] = Tag.materializeCStruct0Tag

opaque type GTestCase = CStruct0
object GTestCase:
  given _tag: Tag[GTestCase] = Tag.materializeCStruct0Tag

opaque type GTestConfig = CStruct6[gboolean, gboolean, gboolean, gboolean, gboolean, gboolean]
object GTestConfig:
  given _tag: Tag[GTestConfig] = Tag.materializeCStruct6Tag[gboolean, gboolean, gboolean, gboolean, gboolean, gboolean]
  def apply()(using Zone): Ptr[GTestConfig] = scala.scalanative.unsafe.alloc[GTestConfig](1)
  def apply(test_initialized : gboolean, test_quick : gboolean, test_perf : gboolean, test_verbose : gboolean, test_quiet : gboolean, test_undefined : gboolean)(using Zone): Ptr[GTestConfig] = 
    val ____ptr = apply()
    (!____ptr).test_initialized = test_initialized
    (!____ptr).test_quick = test_quick
    (!____ptr).test_perf = test_perf
    (!____ptr).test_verbose = test_verbose
    (!____ptr).test_quiet = test_quiet
    (!____ptr).test_undefined = test_undefined
    ____ptr
  extension (struct: GTestConfig)
    def test_initialized : gboolean = struct._1
    def test_initialized_=(value: gboolean): Unit = !struct.at1 = value
    def test_quick : gboolean = struct._2
    def test_quick_=(value: gboolean): Unit = !struct.at2 = value
    def test_perf : gboolean = struct._3
    def test_perf_=(value: gboolean): Unit = !struct.at3 = value
    def test_verbose : gboolean = struct._4
    def test_verbose_=(value: gboolean): Unit = !struct.at4 = value
    def test_quiet : gboolean = struct._5
    def test_quiet_=(value: gboolean): Unit = !struct.at5 = value
    def test_undefined : gboolean = struct._6
    def test_undefined_=(value: gboolean): Unit = !struct.at6 = value

opaque type GTestLogBuffer = CStruct2[Ptr[GString], Ptr[Byte]]
object GTestLogBuffer:
  given _tag: Tag[GTestLogBuffer] = Tag.materializeCStruct2Tag[Ptr[GString], Ptr[Byte]]
  def apply()(using Zone): Ptr[GTestLogBuffer] = scala.scalanative.unsafe.alloc[GTestLogBuffer](1)
  def apply(data : Ptr[GString], msgs : Ptr[GSList])(using Zone): Ptr[GTestLogBuffer] = 
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).msgs = msgs
    ____ptr
  extension (struct: GTestLogBuffer)
    def data : Ptr[GString] = struct._1
    def data_=(value: Ptr[GString]): Unit = !struct.at1 = value
    def msgs : Ptr[GSList] = struct._2.asInstanceOf[Ptr[GSList]]
    def msgs_=(value: Ptr[GSList]): Unit = !struct.at2 = value.asInstanceOf[Ptr[Byte]]

opaque type GTestLogMsg = CStruct5[GTestLogType, guint, Ptr[Ptr[gchar]], guint, Ptr[Double]]
object GTestLogMsg:
  given _tag: Tag[GTestLogMsg] = Tag.materializeCStruct5Tag[GTestLogType, guint, Ptr[Ptr[gchar]], guint, Ptr[Double]]
  def apply()(using Zone): Ptr[GTestLogMsg] = scala.scalanative.unsafe.alloc[GTestLogMsg](1)
  def apply(log_type : GTestLogType, n_strings : guint, strings : Ptr[Ptr[gchar]], n_nums : guint, nums : Ptr[Double])(using Zone): Ptr[GTestLogMsg] = 
    val ____ptr = apply()
    (!____ptr).log_type = log_type
    (!____ptr).n_strings = n_strings
    (!____ptr).strings = strings
    (!____ptr).n_nums = n_nums
    (!____ptr).nums = nums
    ____ptr
  extension (struct: GTestLogMsg)
    def log_type : GTestLogType = struct._1
    def log_type_=(value: GTestLogType): Unit = !struct.at1 = value
    def n_strings : guint = struct._2
    def n_strings_=(value: guint): Unit = !struct.at2 = value
    def strings : Ptr[Ptr[gchar]] = struct._3
    def strings_=(value: Ptr[Ptr[gchar]]): Unit = !struct.at3 = value
    def n_nums : guint = struct._4
    def n_nums_=(value: guint): Unit = !struct.at4 = value
    def nums : Ptr[Double] = struct._5
    def nums_=(value: Ptr[Double]): Unit = !struct.at5 = value

opaque type GTestSuite = CStruct0
object GTestSuite:
  given _tag: Tag[GTestSuite] = Tag.materializeCStruct0Tag

opaque type GThread = CStruct4[GThreadFunc, gpointer, gboolean, GThreadPriority]
object GThread:
  given _tag: Tag[GThread] = Tag.materializeCStruct4Tag[GThreadFunc, gpointer, gboolean, GThreadPriority]
  def apply()(using Zone): Ptr[GThread] = scala.scalanative.unsafe.alloc[GThread](1)
  def apply(func : GThreadFunc, data : gpointer, joinable : gboolean, priority : GThreadPriority)(using Zone): Ptr[GThread] = 
    val ____ptr = apply()
    (!____ptr).func = func
    (!____ptr).data = data
    (!____ptr).joinable = joinable
    (!____ptr).priority = priority
    ____ptr
  extension (struct: GThread)
    def func : GThreadFunc = struct._1
    def func_=(value: GThreadFunc): Unit = !struct.at1 = value
    def data : gpointer = struct._2
    def data_=(value: gpointer): Unit = !struct.at2 = value
    def joinable : gboolean = struct._3
    def joinable_=(value: gboolean): Unit = !struct.at3 = value
    def priority : GThreadPriority = struct._4
    def priority_=(value: GThreadPriority): Unit = !struct.at4 = value

opaque type GThreadFunctions = CStruct21[CFuncPtr0[Ptr[GMutex]], CFuncPtr1[Ptr[GMutex], Unit], CFuncPtr1[Ptr[GMutex], gboolean], CFuncPtr1[Ptr[GMutex], Unit], CFuncPtr1[Ptr[GMutex], Unit], CFuncPtr0[Ptr[GCond]], CFuncPtr1[Ptr[GCond], Unit], CFuncPtr1[Ptr[GCond], Unit], CFuncPtr2[Ptr[GCond], Ptr[GMutex], Unit], CFuncPtr3[Ptr[GCond], Ptr[GMutex], Ptr[GTimeVal], gboolean], CFuncPtr1[Ptr[GCond], Unit], CFuncPtr1[GDestroyNotify, Ptr[GPrivate]], CFuncPtr1[Ptr[GPrivate], gpointer], CFuncPtr2[Ptr[GPrivate], gpointer, Unit], CFuncPtr8[GThreadFunc, gpointer, gulong, gboolean, gboolean, GThreadPriority, gpointer, Ptr[Ptr[GError]], Unit], CFuncPtr0[Unit], CFuncPtr1[gpointer, Unit], CFuncPtr0[Unit], CFuncPtr2[gpointer, GThreadPriority, Unit], CFuncPtr1[gpointer, Unit], CFuncPtr2[gpointer, gpointer, gboolean]]
object GThreadFunctions:
  given _tag: Tag[GThreadFunctions] = Tag.materializeCStruct21Tag[CFuncPtr0[Ptr[GMutex]], CFuncPtr1[Ptr[GMutex], Unit], CFuncPtr1[Ptr[GMutex], gboolean], CFuncPtr1[Ptr[GMutex], Unit], CFuncPtr1[Ptr[GMutex], Unit], CFuncPtr0[Ptr[GCond]], CFuncPtr1[Ptr[GCond], Unit], CFuncPtr1[Ptr[GCond], Unit], CFuncPtr2[Ptr[GCond], Ptr[GMutex], Unit], CFuncPtr3[Ptr[GCond], Ptr[GMutex], Ptr[GTimeVal], gboolean], CFuncPtr1[Ptr[GCond], Unit], CFuncPtr1[GDestroyNotify, Ptr[GPrivate]], CFuncPtr1[Ptr[GPrivate], gpointer], CFuncPtr2[Ptr[GPrivate], gpointer, Unit], CFuncPtr8[GThreadFunc, gpointer, gulong, gboolean, gboolean, GThreadPriority, gpointer, Ptr[Ptr[GError]], Unit], CFuncPtr0[Unit], CFuncPtr1[gpointer, Unit], CFuncPtr0[Unit], CFuncPtr2[gpointer, GThreadPriority, Unit], CFuncPtr1[gpointer, Unit], CFuncPtr2[gpointer, gpointer, gboolean]]
  def apply()(using Zone): Ptr[GThreadFunctions] = scala.scalanative.unsafe.alloc[GThreadFunctions](1)
  def apply(mutex_new : CFuncPtr0[Ptr[GMutex]], mutex_lock : CFuncPtr1[Ptr[GMutex], Unit], mutex_trylock : CFuncPtr1[Ptr[GMutex], gboolean], mutex_unlock : CFuncPtr1[Ptr[GMutex], Unit], mutex_free : CFuncPtr1[Ptr[GMutex], Unit], cond_new : CFuncPtr0[Ptr[GCond]], cond_signal : CFuncPtr1[Ptr[GCond], Unit], cond_broadcast : CFuncPtr1[Ptr[GCond], Unit], cond_wait : CFuncPtr2[Ptr[GCond], Ptr[GMutex], Unit], cond_timed_wait : CFuncPtr3[Ptr[GCond], Ptr[GMutex], Ptr[GTimeVal], gboolean], cond_free : CFuncPtr1[Ptr[GCond], Unit], private_new : CFuncPtr1[GDestroyNotify, Ptr[GPrivate]], private_get : CFuncPtr1[Ptr[GPrivate], gpointer], private_set : CFuncPtr2[Ptr[GPrivate], gpointer, Unit], thread_create : CFuncPtr8[GThreadFunc, gpointer, gulong, gboolean, gboolean, GThreadPriority, gpointer, Ptr[Ptr[GError]], Unit], thread_yield : CFuncPtr0[Unit], thread_join : CFuncPtr1[gpointer, Unit], thread_exit : CFuncPtr0[Unit], thread_set_priority : CFuncPtr2[gpointer, GThreadPriority, Unit], thread_self : CFuncPtr1[gpointer, Unit], thread_equal : CFuncPtr2[gpointer, gpointer, gboolean])(using Zone): Ptr[GThreadFunctions] = 
    val ____ptr = apply()
    (!____ptr).mutex_new = mutex_new
    (!____ptr).mutex_lock = mutex_lock
    (!____ptr).mutex_trylock = mutex_trylock
    (!____ptr).mutex_unlock = mutex_unlock
    (!____ptr).mutex_free = mutex_free
    (!____ptr).cond_new = cond_new
    (!____ptr).cond_signal = cond_signal
    (!____ptr).cond_broadcast = cond_broadcast
    (!____ptr).cond_wait = cond_wait
    (!____ptr).cond_timed_wait = cond_timed_wait
    (!____ptr).cond_free = cond_free
    (!____ptr).private_new = private_new
    (!____ptr).private_get = private_get
    (!____ptr).private_set = private_set
    (!____ptr).thread_create = thread_create
    (!____ptr).thread_yield = thread_yield
    (!____ptr).thread_join = thread_join
    (!____ptr).thread_exit = thread_exit
    (!____ptr).thread_set_priority = thread_set_priority
    (!____ptr).thread_self = thread_self
    (!____ptr).thread_equal = thread_equal
    ____ptr
  extension (struct: GThreadFunctions)
    def mutex_new : CFuncPtr0[Ptr[GMutex]] = struct._1
    def mutex_new_=(value: CFuncPtr0[Ptr[GMutex]]): Unit = !struct.at1 = value
    def mutex_lock : CFuncPtr1[Ptr[GMutex], Unit] = struct._2
    def mutex_lock_=(value: CFuncPtr1[Ptr[GMutex], Unit]): Unit = !struct.at2 = value
    def mutex_trylock : CFuncPtr1[Ptr[GMutex], gboolean] = struct._3
    def mutex_trylock_=(value: CFuncPtr1[Ptr[GMutex], gboolean]): Unit = !struct.at3 = value
    def mutex_unlock : CFuncPtr1[Ptr[GMutex], Unit] = struct._4
    def mutex_unlock_=(value: CFuncPtr1[Ptr[GMutex], Unit]): Unit = !struct.at4 = value
    def mutex_free : CFuncPtr1[Ptr[GMutex], Unit] = struct._5
    def mutex_free_=(value: CFuncPtr1[Ptr[GMutex], Unit]): Unit = !struct.at5 = value
    def cond_new : CFuncPtr0[Ptr[GCond]] = struct._6
    def cond_new_=(value: CFuncPtr0[Ptr[GCond]]): Unit = !struct.at6 = value
    def cond_signal : CFuncPtr1[Ptr[GCond], Unit] = struct._7
    def cond_signal_=(value: CFuncPtr1[Ptr[GCond], Unit]): Unit = !struct.at7 = value
    def cond_broadcast : CFuncPtr1[Ptr[GCond], Unit] = struct._8
    def cond_broadcast_=(value: CFuncPtr1[Ptr[GCond], Unit]): Unit = !struct.at8 = value
    def cond_wait : CFuncPtr2[Ptr[GCond], Ptr[GMutex], Unit] = struct._9
    def cond_wait_=(value: CFuncPtr2[Ptr[GCond], Ptr[GMutex], Unit]): Unit = !struct.at9 = value
    def cond_timed_wait : CFuncPtr3[Ptr[GCond], Ptr[GMutex], Ptr[GTimeVal], gboolean] = struct._10
    def cond_timed_wait_=(value: CFuncPtr3[Ptr[GCond], Ptr[GMutex], Ptr[GTimeVal], gboolean]): Unit = !struct.at10 = value
    def cond_free : CFuncPtr1[Ptr[GCond], Unit] = struct._11
    def cond_free_=(value: CFuncPtr1[Ptr[GCond], Unit]): Unit = !struct.at11 = value
    def private_new : CFuncPtr1[GDestroyNotify, Ptr[GPrivate]] = struct._12
    def private_new_=(value: CFuncPtr1[GDestroyNotify, Ptr[GPrivate]]): Unit = !struct.at12 = value
    def private_get : CFuncPtr1[Ptr[GPrivate], gpointer] = struct._13
    def private_get_=(value: CFuncPtr1[Ptr[GPrivate], gpointer]): Unit = !struct.at13 = value
    def private_set : CFuncPtr2[Ptr[GPrivate], gpointer, Unit] = struct._14
    def private_set_=(value: CFuncPtr2[Ptr[GPrivate], gpointer, Unit]): Unit = !struct.at14 = value
    def thread_create : CFuncPtr8[GThreadFunc, gpointer, gulong, gboolean, gboolean, GThreadPriority, gpointer, Ptr[Ptr[GError]], Unit] = struct._15
    def thread_create_=(value: CFuncPtr8[GThreadFunc, gpointer, gulong, gboolean, gboolean, GThreadPriority, gpointer, Ptr[Ptr[GError]], Unit]): Unit = !struct.at15 = value
    def thread_yield : CFuncPtr0[Unit] = struct._16
    def thread_yield_=(value: CFuncPtr0[Unit]): Unit = !struct.at16 = value
    def thread_join : CFuncPtr1[gpointer, Unit] = struct._17
    def thread_join_=(value: CFuncPtr1[gpointer, Unit]): Unit = !struct.at17 = value
    def thread_exit : CFuncPtr0[Unit] = struct._18
    def thread_exit_=(value: CFuncPtr0[Unit]): Unit = !struct.at18 = value
    def thread_set_priority : CFuncPtr2[gpointer, GThreadPriority, Unit] = struct._19
    def thread_set_priority_=(value: CFuncPtr2[gpointer, GThreadPriority, Unit]): Unit = !struct.at19 = value
    def thread_self : CFuncPtr1[gpointer, Unit] = struct._20
    def thread_self_=(value: CFuncPtr1[gpointer, Unit]): Unit = !struct.at20 = value
    def thread_equal : CFuncPtr2[gpointer, gpointer, gboolean] = struct._21
    def thread_equal_=(value: CFuncPtr2[gpointer, gpointer, gboolean]): Unit = !struct.at21 = value

opaque type GThreadPool = CStruct3[GFunc, gpointer, gboolean]
object GThreadPool:
  given _tag: Tag[GThreadPool] = Tag.materializeCStruct3Tag[GFunc, gpointer, gboolean]
  def apply()(using Zone): Ptr[GThreadPool] = scala.scalanative.unsafe.alloc[GThreadPool](1)
  def apply(func : GFunc, user_data : gpointer, exclusive : gboolean)(using Zone): Ptr[GThreadPool] = 
    val ____ptr = apply()
    (!____ptr).func = func
    (!____ptr).user_data = user_data
    (!____ptr).exclusive = exclusive
    ____ptr
  extension (struct: GThreadPool)
    def func : GFunc = struct._1
    def func_=(value: GFunc): Unit = !struct.at1 = value
    def user_data : gpointer = struct._2
    def user_data_=(value: gpointer): Unit = !struct.at2 = value
    def exclusive : gboolean = struct._3
    def exclusive_=(value: gboolean): Unit = !struct.at3 = value

opaque type GTimeVal = CStruct2[glong, glong]
object GTimeVal:
  given _tag: Tag[GTimeVal] = Tag.materializeCStruct2Tag[glong, glong]
  def apply()(using Zone): Ptr[GTimeVal] = scala.scalanative.unsafe.alloc[GTimeVal](1)
  def apply(tv_sec : glong, tv_usec : glong)(using Zone): Ptr[GTimeVal] = 
    val ____ptr = apply()
    (!____ptr).tv_sec = tv_sec
    (!____ptr).tv_usec = tv_usec
    ____ptr
  extension (struct: GTimeVal)
    def tv_sec : glong = struct._1
    def tv_sec_=(value: glong): Unit = !struct.at1 = value
    def tv_usec : glong = struct._2
    def tv_usec_=(value: glong): Unit = !struct.at2 = value

opaque type GTimeZone = CStruct0
object GTimeZone:
  given _tag: Tag[GTimeZone] = Tag.materializeCStruct0Tag

opaque type GTimer = CStruct0
object GTimer:
  given _tag: Tag[GTimer] = Tag.materializeCStruct0Tag

opaque type GTrashStack = CStruct1[Ptr[Byte]]
object GTrashStack:
  given _tag: Tag[GTrashStack] = Tag.materializeCStruct1Tag[Ptr[Byte]]
  def apply()(using Zone): Ptr[GTrashStack] = scala.scalanative.unsafe.alloc[GTrashStack](1)
  def apply(next : Ptr[GTrashStack])(using Zone): Ptr[GTrashStack] = 
    val ____ptr = apply()
    (!____ptr).next = next
    ____ptr
  extension (struct: GTrashStack)
    def next : Ptr[GTrashStack] = struct._1.asInstanceOf[Ptr[GTrashStack]]
    def next_=(value: Ptr[GTrashStack]): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]

opaque type GTree = CStruct0
object GTree:
  given _tag: Tag[GTree] = Tag.materializeCStruct0Tag

opaque type GTreeNode = CStruct0
object GTreeNode:
  given _tag: Tag[GTreeNode] = Tag.materializeCStruct0Tag

opaque type GTuples = CStruct1[guint]
object GTuples:
  given _tag: Tag[GTuples] = Tag.materializeCStruct1Tag[guint]
  def apply()(using Zone): Ptr[GTuples] = scala.scalanative.unsafe.alloc[GTuples](1)
  def apply(len : guint)(using Zone): Ptr[GTuples] = 
    val ____ptr = apply()
    (!____ptr).len = len
    ____ptr
  extension (struct: GTuples)
    def len : guint = struct._1
    def len_=(value: guint): Unit = !struct.at1 = value

opaque type GUri = CStruct0
object GUri:
  given _tag: Tag[GUri] = Tag.materializeCStruct0Tag

opaque type GUriParamsIter = CStruct4[gint, gpointer, gpointer, CArray[guint8, Nat.Digit3[Nat._2, Nat._5, Nat._6]]]
object GUriParamsIter:
  given _tag: Tag[GUriParamsIter] = Tag.materializeCStruct4Tag[gint, gpointer, gpointer, CArray[guint8, Nat.Digit3[Nat._2, Nat._5, Nat._6]]]
  def apply()(using Zone): Ptr[GUriParamsIter] = scala.scalanative.unsafe.alloc[GUriParamsIter](1)
  def apply(dummy0 : gint, dummy1 : gpointer, dummy2 : gpointer, dummy3 : CArray[guint8, Nat.Digit3[Nat._2, Nat._5, Nat._6]])(using Zone): Ptr[GUriParamsIter] = 
    val ____ptr = apply()
    (!____ptr).dummy0 = dummy0
    (!____ptr).dummy1 = dummy1
    (!____ptr).dummy2 = dummy2
    (!____ptr).dummy3 = dummy3
    ____ptr
  extension (struct: GUriParamsIter)
    def dummy0 : gint = struct._1
    def dummy0_=(value: gint): Unit = !struct.at1 = value
    def dummy1 : gpointer = struct._2
    def dummy1_=(value: gpointer): Unit = !struct.at2 = value
    def dummy2 : gpointer = struct._3
    def dummy2_=(value: gpointer): Unit = !struct.at3 = value
    def dummy3 : CArray[guint8, Nat.Digit3[Nat._2, Nat._5, Nat._6]] = struct._4
    def dummy3_=(value: CArray[guint8, Nat.Digit3[Nat._2, Nat._5, Nat._6]]): Unit = !struct.at4 = value

opaque type GVariant = CStruct0
object GVariant:
  given _tag: Tag[GVariant] = Tag.materializeCStruct0Tag

opaque type GVariantBuilder = CStruct1[GVariantBuilder.Union0]
object GVariantBuilder:
  opaque type Union0 = CArray[Byte, Nat.Digit3[Nat._1, Nat._2, Nat._8]]
  object Union0:
    opaque type Struct0 = CStruct3[gsize, Ptr[GVariantType], CArray[guintptr, Nat.Digit2[Nat._1, Nat._4]]]
    object Struct0:
      given _tag: Tag[Struct0] = Tag.materializeCStruct3Tag[gsize, Ptr[GVariantType], CArray[guintptr, Nat.Digit2[Nat._1, Nat._4]]]
      def apply()(using Zone): Ptr[Struct0] = scala.scalanative.unsafe.alloc[Struct0](1)
      def apply(partial_magic : gsize, `type` : Ptr[GVariantType], y : CArray[guintptr, Nat.Digit2[Nat._1, Nat._4]])(using Zone): Ptr[Struct0] = 
        val ____ptr = apply()
        (!____ptr).partial_magic = partial_magic
        (!____ptr).`type` = `type`
        (!____ptr).y = y
        ____ptr
      extension (struct: Struct0)
        def partial_magic : gsize = struct._1
        def partial_magic_=(value: gsize): Unit = !struct.at1 = value
        def `type` : Ptr[GVariantType] = struct._2
        def type_=(value: Ptr[GVariantType]): Unit = !struct.at2 = value
        def y : CArray[guintptr, Nat.Digit2[Nat._1, Nat._4]] = struct._3
        def y_=(value: CArray[guintptr, Nat.Digit2[Nat._1, Nat._4]]): Unit = !struct.at3 = value
    given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]](Tag.Byte, Tag.Digit3[Nat._1, Nat._2, Nat._8](Tag.Nat1, Tag.Nat2, Tag.Nat8))
    def apply()(using Zone): Ptr[Union0] = 
      val ___ptr = alloc[Union0](1)
      ___ptr
    @scala.annotation.targetName("apply_s")
    def apply(s: GVariantBuilder.Union0.Struct0)(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[GVariantBuilder.Union0.Struct0]].update(0, s)
      ___ptr
    @scala.annotation.targetName("apply_x")
    def apply(x: CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]])(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]]].update(0, x)
      ___ptr
    extension (struct: Union0)
      def s : GVariantBuilder.Union0.Struct0 = !struct.at(0).asInstanceOf[Ptr[GVariantBuilder.Union0.Struct0]]
      def s_=(value: GVariantBuilder.Union0.Struct0): Unit = !struct.at(0).asInstanceOf[Ptr[GVariantBuilder.Union0.Struct0]] = value
      def x : CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]] = !struct.at(0).asInstanceOf[Ptr[CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]]]
      def x_=(value: CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]]] = value
  given _tag: Tag[GVariantBuilder] = Tag.materializeCStruct1Tag[GVariantBuilder.Union0]
  def apply()(using Zone): Ptr[GVariantBuilder] = scala.scalanative.unsafe.alloc[GVariantBuilder](1)
  def apply(u : GVariantBuilder.Union0)(using Zone): Ptr[GVariantBuilder] = 
    val ____ptr = apply()
    (!____ptr).u = u
    ____ptr
  extension (struct: GVariantBuilder)
    def u : GVariantBuilder.Union0 = struct._1
    def u_=(value: GVariantBuilder.Union0): Unit = !struct.at1 = value

opaque type GVariantDict = CStruct1[GVariantDict.Union0]
object GVariantDict:
  opaque type Union0 = CArray[Byte, Nat.Digit3[Nat._1, Nat._2, Nat._8]]
  object Union0:
    opaque type Struct0 = CStruct3[Ptr[GVariant], gsize, CArray[guintptr, Nat.Digit2[Nat._1, Nat._4]]]
    object Struct0:
      given _tag: Tag[Struct0] = Tag.materializeCStruct3Tag[Ptr[GVariant], gsize, CArray[guintptr, Nat.Digit2[Nat._1, Nat._4]]]
      def apply()(using Zone): Ptr[Struct0] = scala.scalanative.unsafe.alloc[Struct0](1)
      def apply(asv : Ptr[GVariant], partial_magic : gsize, y : CArray[guintptr, Nat.Digit2[Nat._1, Nat._4]])(using Zone): Ptr[Struct0] = 
        val ____ptr = apply()
        (!____ptr).asv = asv
        (!____ptr).partial_magic = partial_magic
        (!____ptr).y = y
        ____ptr
      extension (struct: Struct0)
        def asv : Ptr[GVariant] = struct._1
        def asv_=(value: Ptr[GVariant]): Unit = !struct.at1 = value
        def partial_magic : gsize = struct._2
        def partial_magic_=(value: gsize): Unit = !struct.at2 = value
        def y : CArray[guintptr, Nat.Digit2[Nat._1, Nat._4]] = struct._3
        def y_=(value: CArray[guintptr, Nat.Digit2[Nat._1, Nat._4]]): Unit = !struct.at3 = value
    given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]](Tag.Byte, Tag.Digit3[Nat._1, Nat._2, Nat._8](Tag.Nat1, Tag.Nat2, Tag.Nat8))
    def apply()(using Zone): Ptr[Union0] = 
      val ___ptr = alloc[Union0](1)
      ___ptr
    @scala.annotation.targetName("apply_s")
    def apply(s: GVariantDict.Union0.Struct0)(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[GVariantDict.Union0.Struct0]].update(0, s)
      ___ptr
    @scala.annotation.targetName("apply_x")
    def apply(x: CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]])(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]]].update(0, x)
      ___ptr
    extension (struct: Union0)
      def s : GVariantDict.Union0.Struct0 = !struct.at(0).asInstanceOf[Ptr[GVariantDict.Union0.Struct0]]
      def s_=(value: GVariantDict.Union0.Struct0): Unit = !struct.at(0).asInstanceOf[Ptr[GVariantDict.Union0.Struct0]] = value
      def x : CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]] = !struct.at(0).asInstanceOf[Ptr[CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]]]
      def x_=(value: CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]]] = value
  given _tag: Tag[GVariantDict] = Tag.materializeCStruct1Tag[GVariantDict.Union0]
  def apply()(using Zone): Ptr[GVariantDict] = scala.scalanative.unsafe.alloc[GVariantDict](1)
  def apply(u : GVariantDict.Union0)(using Zone): Ptr[GVariantDict] = 
    val ____ptr = apply()
    (!____ptr).u = u
    ____ptr
  extension (struct: GVariantDict)
    def u : GVariantDict.Union0 = struct._1
    def u_=(value: GVariantDict.Union0): Unit = !struct.at1 = value

opaque type GVariantIter = CStruct1[CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]]
object GVariantIter:
  given _tag: Tag[GVariantIter] = Tag.materializeCStruct1Tag[CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]]
  def apply()(using Zone): Ptr[GVariantIter] = scala.scalanative.unsafe.alloc[GVariantIter](1)
  def apply(x : CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]])(using Zone): Ptr[GVariantIter] = 
    val ____ptr = apply()
    (!____ptr).x = x
    ____ptr
  extension (struct: GVariantIter)
    def x : CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]] = struct._1
    def x_=(value: CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]): Unit = !struct.at1 = value

opaque type GVariantType = CStruct0
object GVariantType:
  given _tag: Tag[GVariantType] = Tag.materializeCStruct0Tag

opaque type _GAllocator = CStruct0
object _GAllocator:
  given _tag: Tag[_GAllocator] = Tag.materializeCStruct0Tag

opaque type _GArray = CStruct2[Ptr[gchar], guint]
object _GArray:
  given _tag: Tag[_GArray] = Tag.materializeCStruct2Tag[Ptr[gchar], guint]
  def apply()(using Zone): Ptr[_GArray] = scala.scalanative.unsafe.alloc[_GArray](1)
  def apply(data : Ptr[gchar], len : guint)(using Zone): Ptr[_GArray] = 
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).len = len
    ____ptr
  extension (struct: _GArray)
    def data : Ptr[gchar] = struct._1
    def data_=(value: Ptr[gchar]): Unit = !struct.at1 = value
    def len : guint = struct._2
    def len_=(value: guint): Unit = !struct.at2 = value

opaque type _GAsyncQueue = CStruct0
object _GAsyncQueue:
  given _tag: Tag[_GAsyncQueue] = Tag.materializeCStruct0Tag

opaque type _GBookmarkFile = CStruct0
object _GBookmarkFile:
  given _tag: Tag[_GBookmarkFile] = Tag.materializeCStruct0Tag

opaque type _GByteArray = CStruct2[Ptr[guint8], guint]
object _GByteArray:
  given _tag: Tag[_GByteArray] = Tag.materializeCStruct2Tag[Ptr[guint8], guint]
  def apply()(using Zone): Ptr[_GByteArray] = scala.scalanative.unsafe.alloc[_GByteArray](1)
  def apply(data : Ptr[guint8], len : guint)(using Zone): Ptr[_GByteArray] = 
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).len = len
    ____ptr
  extension (struct: _GByteArray)
    def data : Ptr[guint8] = struct._1
    def data_=(value: Ptr[guint8]): Unit = !struct.at1 = value
    def len : guint = struct._2
    def len_=(value: guint): Unit = !struct.at2 = value

opaque type _GBytes = CStruct0
object _GBytes:
  given _tag: Tag[_GBytes] = Tag.materializeCStruct0Tag

opaque type _GCache = CStruct0
object _GCache:
  given _tag: Tag[_GCache] = Tag.materializeCStruct0Tag

opaque type _GChecksum = CStruct0
object _GChecksum:
  given _tag: Tag[_GChecksum] = Tag.materializeCStruct0Tag

opaque type _GCompletion = CStruct5[Ptr[Byte], GCompletionFunc, Ptr[gchar], Ptr[Byte], GCompletionStrncmpFunc]
object _GCompletion:
  given _tag: Tag[_GCompletion] = Tag.materializeCStruct5Tag[Ptr[Byte], GCompletionFunc, Ptr[gchar], Ptr[Byte], GCompletionStrncmpFunc]
  def apply()(using Zone): Ptr[_GCompletion] = scala.scalanative.unsafe.alloc[_GCompletion](1)
  def apply(items : Ptr[GList], func : GCompletionFunc, prefix : Ptr[gchar], cache : Ptr[GList], strncmp_func : GCompletionStrncmpFunc)(using Zone): Ptr[_GCompletion] = 
    val ____ptr = apply()
    (!____ptr).items = items
    (!____ptr).func = func
    (!____ptr).prefix = prefix
    (!____ptr).cache = cache
    (!____ptr).strncmp_func = strncmp_func
    ____ptr
  extension (struct: _GCompletion)
    def items : Ptr[GList] = struct._1.asInstanceOf[Ptr[GList]]
    def items_=(value: Ptr[GList]): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
    def func : GCompletionFunc = struct._2
    def func_=(value: GCompletionFunc): Unit = !struct.at2 = value
    def prefix : Ptr[gchar] = struct._3
    def prefix_=(value: Ptr[gchar]): Unit = !struct.at3 = value
    def cache : Ptr[GList] = struct._4.asInstanceOf[Ptr[GList]]
    def cache_=(value: Ptr[GList]): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
    def strncmp_func : GCompletionStrncmpFunc = struct._5
    def strncmp_func_=(value: GCompletionStrncmpFunc): Unit = !struct.at5 = value

opaque type _GCond = CStruct2[gpointer, CArray[guint, Nat._2]]
object _GCond:
  given _tag: Tag[_GCond] = Tag.materializeCStruct2Tag[gpointer, CArray[guint, Nat._2]]
  def apply()(using Zone): Ptr[_GCond] = scala.scalanative.unsafe.alloc[_GCond](1)
  def apply(p : gpointer, i : CArray[guint, Nat._2])(using Zone): Ptr[_GCond] = 
    val ____ptr = apply()
    (!____ptr).p = p
    (!____ptr).i = i
    ____ptr
  extension (struct: _GCond)
    def p : gpointer = struct._1
    def p_=(value: gpointer): Unit = !struct.at1 = value
    def i : CArray[guint, Nat._2] = struct._2
    def i_=(value: CArray[guint, Nat._2]): Unit = !struct.at2 = value

opaque type _GData = CStruct0
object _GData:
  given _tag: Tag[_GData] = Tag.materializeCStruct0Tag

opaque type _GDate = CStruct6[guint, guint, guint, guint, guint, guint]
object _GDate:
  given _tag: Tag[_GDate] = Tag.materializeCStruct6Tag[guint, guint, guint, guint, guint, guint]
  def apply()(using Zone): Ptr[_GDate] = scala.scalanative.unsafe.alloc[_GDate](1)
  def apply(julian_days : guint, julian : guint, dmy : guint, day : guint, month : guint, year : guint)(using Zone): Ptr[_GDate] = 
    val ____ptr = apply()
    (!____ptr).julian_days = julian_days
    (!____ptr).julian = julian
    (!____ptr).dmy = dmy
    (!____ptr).day = day
    (!____ptr).month = month
    (!____ptr).year = year
    ____ptr
  extension (struct: _GDate)
    def julian_days : guint = struct._1
    def julian_days_=(value: guint): Unit = !struct.at1 = value
    def julian : guint = struct._2
    def julian_=(value: guint): Unit = !struct.at2 = value
    def dmy : guint = struct._3
    def dmy_=(value: guint): Unit = !struct.at3 = value
    def day : guint = struct._4
    def day_=(value: guint): Unit = !struct.at4 = value
    def month : guint = struct._5
    def month_=(value: guint): Unit = !struct.at5 = value
    def year : guint = struct._6
    def year_=(value: guint): Unit = !struct.at6 = value

opaque type _GDateTime = CStruct0
object _GDateTime:
  given _tag: Tag[_GDateTime] = Tag.materializeCStruct0Tag

opaque type _GDebugKey = CStruct2[Ptr[gchar], guint]
object _GDebugKey:
  given _tag: Tag[_GDebugKey] = Tag.materializeCStruct2Tag[Ptr[gchar], guint]
  def apply()(using Zone): Ptr[_GDebugKey] = scala.scalanative.unsafe.alloc[_GDebugKey](1)
  def apply(key : Ptr[gchar], value : guint)(using Zone): Ptr[_GDebugKey] = 
    val ____ptr = apply()
    (!____ptr).key = key
    (!____ptr).value = value
    ____ptr
  extension (struct: _GDebugKey)
    def key : Ptr[gchar] = struct._1
    def key_=(value: Ptr[gchar]): Unit = !struct.at1 = value
    def value : guint = struct._2
    def value_=(value: guint): Unit = !struct.at2 = value

opaque type _GDir = CStruct0
object _GDir:
  given _tag: Tag[_GDir] = Tag.materializeCStruct0Tag

opaque type _GError = CStruct3[GQuark, gint, Ptr[gchar]]
object _GError:
  given _tag: Tag[_GError] = Tag.materializeCStruct3Tag[GQuark, gint, Ptr[gchar]]
  def apply()(using Zone): Ptr[_GError] = scala.scalanative.unsafe.alloc[_GError](1)
  def apply(domain : GQuark, code : gint, message : Ptr[gchar])(using Zone): Ptr[_GError] = 
    val ____ptr = apply()
    (!____ptr).domain = domain
    (!____ptr).code = code
    (!____ptr).message = message
    ____ptr
  extension (struct: _GError)
    def domain : GQuark = struct._1
    def domain_=(value: GQuark): Unit = !struct.at1 = value
    def code : gint = struct._2
    def code_=(value: gint): Unit = !struct.at2 = value
    def message : Ptr[gchar] = struct._3
    def message_=(value: Ptr[gchar]): Unit = !struct.at3 = value

opaque type _GHashTable = CStruct0
object _GHashTable:
  given _tag: Tag[_GHashTable] = Tag.materializeCStruct0Tag

opaque type _GHashTableIter = CStruct6[gpointer, gpointer, gpointer, CInt, gboolean, gpointer]
object _GHashTableIter:
  given _tag: Tag[_GHashTableIter] = Tag.materializeCStruct6Tag[gpointer, gpointer, gpointer, CInt, gboolean, gpointer]
  def apply()(using Zone): Ptr[_GHashTableIter] = scala.scalanative.unsafe.alloc[_GHashTableIter](1)
  def apply(dummy1 : gpointer, dummy2 : gpointer, dummy3 : gpointer, dummy4 : CInt, dummy5 : gboolean, dummy6 : gpointer)(using Zone): Ptr[_GHashTableIter] = 
    val ____ptr = apply()
    (!____ptr).dummy1 = dummy1
    (!____ptr).dummy2 = dummy2
    (!____ptr).dummy3 = dummy3
    (!____ptr).dummy4 = dummy4
    (!____ptr).dummy5 = dummy5
    (!____ptr).dummy6 = dummy6
    ____ptr
  extension (struct: _GHashTableIter)
    def dummy1 : gpointer = struct._1
    def dummy1_=(value: gpointer): Unit = !struct.at1 = value
    def dummy2 : gpointer = struct._2
    def dummy2_=(value: gpointer): Unit = !struct.at2 = value
    def dummy3 : gpointer = struct._3
    def dummy3_=(value: gpointer): Unit = !struct.at3 = value
    def dummy4 : CInt = struct._4
    def dummy4_=(value: CInt): Unit = !struct.at4 = value
    def dummy5 : gboolean = struct._5
    def dummy5_=(value: gboolean): Unit = !struct.at5 = value
    def dummy6 : gpointer = struct._6
    def dummy6_=(value: gpointer): Unit = !struct.at6 = value

opaque type _GHmac = CStruct0
object _GHmac:
  given _tag: Tag[_GHmac] = Tag.materializeCStruct0Tag

opaque type _GHook = CStruct8[gpointer, Ptr[Byte], Ptr[Byte], guint, gulong, guint, gpointer, GDestroyNotify]
object _GHook:
  given _tag: Tag[_GHook] = Tag.materializeCStruct8Tag[gpointer, Ptr[Byte], Ptr[Byte], guint, gulong, guint, gpointer, GDestroyNotify]
  def apply()(using Zone): Ptr[_GHook] = scala.scalanative.unsafe.alloc[_GHook](1)
  def apply(data : gpointer, next : Ptr[GHook], prev : Ptr[GHook], ref_count : guint, hook_id : gulong, flags : guint, func : gpointer, destroy : GDestroyNotify)(using Zone): Ptr[_GHook] = 
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).next = next
    (!____ptr).prev = prev
    (!____ptr).ref_count = ref_count
    (!____ptr).hook_id = hook_id
    (!____ptr).flags = flags
    (!____ptr).func = func
    (!____ptr).destroy = destroy
    ____ptr
  extension (struct: _GHook)
    def data : gpointer = struct._1
    def data_=(value: gpointer): Unit = !struct.at1 = value
    def next : Ptr[GHook] = struct._2.asInstanceOf[Ptr[GHook]]
    def next_=(value: Ptr[GHook]): Unit = !struct.at2 = value.asInstanceOf[Ptr[Byte]]
    def prev : Ptr[GHook] = struct._3.asInstanceOf[Ptr[GHook]]
    def prev_=(value: Ptr[GHook]): Unit = !struct.at3 = value.asInstanceOf[Ptr[Byte]]
    def ref_count : guint = struct._4
    def ref_count_=(value: guint): Unit = !struct.at4 = value
    def hook_id : gulong = struct._5
    def hook_id_=(value: gulong): Unit = !struct.at5 = value
    def flags : guint = struct._6
    def flags_=(value: guint): Unit = !struct.at6 = value
    def func : gpointer = struct._7
    def func_=(value: gpointer): Unit = !struct.at7 = value
    def destroy : GDestroyNotify = struct._8
    def destroy_=(value: GDestroyNotify): Unit = !struct.at8 = value

opaque type _GHookList = CStruct7[gulong, guint, guint, Ptr[Byte], gpointer, Ptr[Byte], CArray[gpointer, Nat._2]]
object _GHookList:
  given _tag: Tag[_GHookList] = Tag.materializeCStruct7Tag[gulong, guint, guint, Ptr[Byte], gpointer, Ptr[Byte], CArray[gpointer, Nat._2]]
  def apply()(using Zone): Ptr[_GHookList] = scala.scalanative.unsafe.alloc[_GHookList](1)
  def apply(seq_id : gulong, hook_size : guint, is_setup : guint, hooks : Ptr[GHook], dummy3 : gpointer, finalize_hook : GHookFinalizeFunc, dummy : CArray[gpointer, Nat._2])(using Zone): Ptr[_GHookList] = 
    val ____ptr = apply()
    (!____ptr).seq_id = seq_id
    (!____ptr).hook_size = hook_size
    (!____ptr).is_setup = is_setup
    (!____ptr).hooks = hooks
    (!____ptr).dummy3 = dummy3
    (!____ptr).finalize_hook = finalize_hook
    (!____ptr).dummy = dummy
    ____ptr
  extension (struct: _GHookList)
    def seq_id : gulong = struct._1
    def seq_id_=(value: gulong): Unit = !struct.at1 = value
    def hook_size : guint = struct._2
    def hook_size_=(value: guint): Unit = !struct.at2 = value
    def is_setup : guint = struct._3
    def is_setup_=(value: guint): Unit = !struct.at3 = value
    def hooks : Ptr[GHook] = struct._4.asInstanceOf[Ptr[GHook]]
    def hooks_=(value: Ptr[GHook]): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
    def dummy3 : gpointer = struct._5
    def dummy3_=(value: gpointer): Unit = !struct.at5 = value
    def finalize_hook : GHookFinalizeFunc = struct._6.asInstanceOf[GHookFinalizeFunc]
    def finalize_hook_=(value: GHookFinalizeFunc): Unit = !struct.at6 = value.asInstanceOf[Ptr[Byte]]
    def dummy : CArray[gpointer, Nat._2] = struct._7
    def dummy_=(value: CArray[gpointer, Nat._2]): Unit = !struct.at7 = value

opaque type _GIConv = CStruct0
object _GIConv:
  given _tag: Tag[_GIConv] = Tag.materializeCStruct0Tag

opaque type _GIOChannel = CStruct20[gint, Ptr[Byte], Ptr[gchar], GIConv, GIConv, Ptr[gchar], guint, gsize, Ptr[GString], Ptr[GString], Ptr[GString], CArray[gchar, Nat._6], guint, guint, guint, guint, guint, guint, gpointer, gpointer]
object _GIOChannel:
  given _tag: Tag[_GIOChannel] = Tag.materializeCStruct20Tag[gint, Ptr[Byte], Ptr[gchar], GIConv, GIConv, Ptr[gchar], guint, gsize, Ptr[GString], Ptr[GString], Ptr[GString], CArray[gchar, Nat._6], guint, guint, guint, guint, guint, guint, gpointer, gpointer]
  def apply()(using Zone): Ptr[_GIOChannel] = scala.scalanative.unsafe.alloc[_GIOChannel](1)
  def apply(ref_count : gint, funcs : Ptr[GIOFuncs], encoding : Ptr[gchar], read_cd : GIConv, write_cd : GIConv, line_term : Ptr[gchar], line_term_len : guint, buf_size : gsize, read_buf : Ptr[GString], encoded_read_buf : Ptr[GString], write_buf : Ptr[GString], partial_write_buf : CArray[gchar, Nat._6], use_buffer : guint, do_encode : guint, close_on_unref : guint, is_readable : guint, is_writeable : guint, is_seekable : guint, reserved1 : gpointer, reserved2 : gpointer)(using Zone): Ptr[_GIOChannel] = 
    val ____ptr = apply()
    (!____ptr).ref_count = ref_count
    (!____ptr).funcs = funcs
    (!____ptr).encoding = encoding
    (!____ptr).read_cd = read_cd
    (!____ptr).write_cd = write_cd
    (!____ptr).line_term = line_term
    (!____ptr).line_term_len = line_term_len
    (!____ptr).buf_size = buf_size
    (!____ptr).read_buf = read_buf
    (!____ptr).encoded_read_buf = encoded_read_buf
    (!____ptr).write_buf = write_buf
    (!____ptr).partial_write_buf = partial_write_buf
    (!____ptr).use_buffer = use_buffer
    (!____ptr).do_encode = do_encode
    (!____ptr).close_on_unref = close_on_unref
    (!____ptr).is_readable = is_readable
    (!____ptr).is_writeable = is_writeable
    (!____ptr).is_seekable = is_seekable
    (!____ptr).reserved1 = reserved1
    (!____ptr).reserved2 = reserved2
    ____ptr
  extension (struct: _GIOChannel)
    def ref_count : gint = struct._1
    def ref_count_=(value: gint): Unit = !struct.at1 = value
    def funcs : Ptr[GIOFuncs] = struct._2.asInstanceOf[Ptr[GIOFuncs]]
    def funcs_=(value: Ptr[GIOFuncs]): Unit = !struct.at2 = value.asInstanceOf[Ptr[Byte]]
    def encoding : Ptr[gchar] = struct._3
    def encoding_=(value: Ptr[gchar]): Unit = !struct.at3 = value
    def read_cd : GIConv = struct._4
    def read_cd_=(value: GIConv): Unit = !struct.at4 = value
    def write_cd : GIConv = struct._5
    def write_cd_=(value: GIConv): Unit = !struct.at5 = value
    def line_term : Ptr[gchar] = struct._6
    def line_term_=(value: Ptr[gchar]): Unit = !struct.at6 = value
    def line_term_len : guint = struct._7
    def line_term_len_=(value: guint): Unit = !struct.at7 = value
    def buf_size : gsize = struct._8
    def buf_size_=(value: gsize): Unit = !struct.at8 = value
    def read_buf : Ptr[GString] = struct._9
    def read_buf_=(value: Ptr[GString]): Unit = !struct.at9 = value
    def encoded_read_buf : Ptr[GString] = struct._10
    def encoded_read_buf_=(value: Ptr[GString]): Unit = !struct.at10 = value
    def write_buf : Ptr[GString] = struct._11
    def write_buf_=(value: Ptr[GString]): Unit = !struct.at11 = value
    def partial_write_buf : CArray[gchar, Nat._6] = struct._12
    def partial_write_buf_=(value: CArray[gchar, Nat._6]): Unit = !struct.at12 = value
    def use_buffer : guint = struct._13
    def use_buffer_=(value: guint): Unit = !struct.at13 = value
    def do_encode : guint = struct._14
    def do_encode_=(value: guint): Unit = !struct.at14 = value
    def close_on_unref : guint = struct._15
    def close_on_unref_=(value: guint): Unit = !struct.at15 = value
    def is_readable : guint = struct._16
    def is_readable_=(value: guint): Unit = !struct.at16 = value
    def is_writeable : guint = struct._17
    def is_writeable_=(value: guint): Unit = !struct.at17 = value
    def is_seekable : guint = struct._18
    def is_seekable_=(value: guint): Unit = !struct.at18 = value
    def reserved1 : gpointer = struct._19
    def reserved1_=(value: gpointer): Unit = !struct.at19 = value
    def reserved2 : gpointer = struct._20
    def reserved2_=(value: gpointer): Unit = !struct.at20 = value

opaque type _GIOFuncs = CStruct8[CFuncPtr5[Ptr[Byte], Ptr[gchar], gsize, Ptr[gsize], Ptr[Ptr[GError]], GIOStatus], CFuncPtr5[Ptr[Byte], Ptr[gchar], gsize, Ptr[gsize], Ptr[Ptr[GError]], GIOStatus], CFuncPtr4[Ptr[Byte], gint64, GSeekType, Ptr[Ptr[GError]], GIOStatus], CFuncPtr2[Ptr[Byte], Ptr[Ptr[GError]], GIOStatus], CFuncPtr2[Ptr[Byte], GIOCondition, Ptr[Byte]], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr3[Ptr[Byte], GIOFlags, Ptr[Ptr[GError]], GIOStatus], CFuncPtr1[Ptr[Byte], GIOFlags]]
object _GIOFuncs:
  given _tag: Tag[_GIOFuncs] = Tag.materializeCStruct8Tag[CFuncPtr5[Ptr[Byte], Ptr[gchar], gsize, Ptr[gsize], Ptr[Ptr[GError]], GIOStatus], CFuncPtr5[Ptr[Byte], Ptr[gchar], gsize, Ptr[gsize], Ptr[Ptr[GError]], GIOStatus], CFuncPtr4[Ptr[Byte], gint64, GSeekType, Ptr[Ptr[GError]], GIOStatus], CFuncPtr2[Ptr[Byte], Ptr[Ptr[GError]], GIOStatus], CFuncPtr2[Ptr[Byte], GIOCondition, Ptr[Byte]], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr3[Ptr[Byte], GIOFlags, Ptr[Ptr[GError]], GIOStatus], CFuncPtr1[Ptr[Byte], GIOFlags]]
  def apply()(using Zone): Ptr[_GIOFuncs] = scala.scalanative.unsafe.alloc[_GIOFuncs](1)
  def apply(io_read : CFuncPtr5[Ptr[GIOChannel], Ptr[gchar], gsize, Ptr[gsize], Ptr[Ptr[GError]], GIOStatus], io_write : CFuncPtr5[Ptr[GIOChannel], Ptr[gchar], gsize, Ptr[gsize], Ptr[Ptr[GError]], GIOStatus], io_seek : CFuncPtr4[Ptr[GIOChannel], gint64, GSeekType, Ptr[Ptr[GError]], GIOStatus], io_close : CFuncPtr2[Ptr[GIOChannel], Ptr[Ptr[GError]], GIOStatus], io_create_watch : CFuncPtr2[Ptr[GIOChannel], GIOCondition, Ptr[GSource]], io_free : CFuncPtr1[Ptr[GIOChannel], Unit], io_set_flags : CFuncPtr3[Ptr[GIOChannel], GIOFlags, Ptr[Ptr[GError]], GIOStatus], io_get_flags : CFuncPtr1[Ptr[GIOChannel], GIOFlags])(using Zone): Ptr[_GIOFuncs] = 
    val ____ptr = apply()
    (!____ptr).io_read = io_read
    (!____ptr).io_write = io_write
    (!____ptr).io_seek = io_seek
    (!____ptr).io_close = io_close
    (!____ptr).io_create_watch = io_create_watch
    (!____ptr).io_free = io_free
    (!____ptr).io_set_flags = io_set_flags
    (!____ptr).io_get_flags = io_get_flags
    ____ptr
  extension (struct: _GIOFuncs)
    def io_read : CFuncPtr5[Ptr[GIOChannel], Ptr[gchar], gsize, Ptr[gsize], Ptr[Ptr[GError]], GIOStatus] = struct._1.asInstanceOf[CFuncPtr5[Ptr[GIOChannel], Ptr[gchar], gsize, Ptr[gsize], Ptr[Ptr[GError]], GIOStatus]]
    def io_read_=(value: CFuncPtr5[Ptr[GIOChannel], Ptr[gchar], gsize, Ptr[gsize], Ptr[Ptr[GError]], GIOStatus]): Unit = !struct.at1 = value.asInstanceOf[CFuncPtr5[Ptr[Byte], Ptr[gchar], gsize, Ptr[gsize], Ptr[Ptr[GError]], GIOStatus]]
    def io_write : CFuncPtr5[Ptr[GIOChannel], Ptr[gchar], gsize, Ptr[gsize], Ptr[Ptr[GError]], GIOStatus] = struct._2.asInstanceOf[CFuncPtr5[Ptr[GIOChannel], Ptr[gchar], gsize, Ptr[gsize], Ptr[Ptr[GError]], GIOStatus]]
    def io_write_=(value: CFuncPtr5[Ptr[GIOChannel], Ptr[gchar], gsize, Ptr[gsize], Ptr[Ptr[GError]], GIOStatus]): Unit = !struct.at2 = value.asInstanceOf[CFuncPtr5[Ptr[Byte], Ptr[gchar], gsize, Ptr[gsize], Ptr[Ptr[GError]], GIOStatus]]
    def io_seek : CFuncPtr4[Ptr[GIOChannel], gint64, GSeekType, Ptr[Ptr[GError]], GIOStatus] = struct._3.asInstanceOf[CFuncPtr4[Ptr[GIOChannel], gint64, GSeekType, Ptr[Ptr[GError]], GIOStatus]]
    def io_seek_=(value: CFuncPtr4[Ptr[GIOChannel], gint64, GSeekType, Ptr[Ptr[GError]], GIOStatus]): Unit = !struct.at3 = value.asInstanceOf[CFuncPtr4[Ptr[Byte], gint64, GSeekType, Ptr[Ptr[GError]], GIOStatus]]
    def io_close : CFuncPtr2[Ptr[GIOChannel], Ptr[Ptr[GError]], GIOStatus] = struct._4.asInstanceOf[CFuncPtr2[Ptr[GIOChannel], Ptr[Ptr[GError]], GIOStatus]]
    def io_close_=(value: CFuncPtr2[Ptr[GIOChannel], Ptr[Ptr[GError]], GIOStatus]): Unit = !struct.at4 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], Ptr[Ptr[GError]], GIOStatus]]
    def io_create_watch : CFuncPtr2[Ptr[GIOChannel], GIOCondition, Ptr[GSource]] = struct._5.asInstanceOf[CFuncPtr2[Ptr[GIOChannel], GIOCondition, Ptr[GSource]]]
    def io_create_watch_=(value: CFuncPtr2[Ptr[GIOChannel], GIOCondition, Ptr[GSource]]): Unit = !struct.at5 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], GIOCondition, Ptr[Byte]]]
    def io_free : CFuncPtr1[Ptr[GIOChannel], Unit] = struct._6.asInstanceOf[CFuncPtr1[Ptr[GIOChannel], Unit]]
    def io_free_=(value: CFuncPtr1[Ptr[GIOChannel], Unit]): Unit = !struct.at6 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], Unit]]
    def io_set_flags : CFuncPtr3[Ptr[GIOChannel], GIOFlags, Ptr[Ptr[GError]], GIOStatus] = struct._7.asInstanceOf[CFuncPtr3[Ptr[GIOChannel], GIOFlags, Ptr[Ptr[GError]], GIOStatus]]
    def io_set_flags_=(value: CFuncPtr3[Ptr[GIOChannel], GIOFlags, Ptr[Ptr[GError]], GIOStatus]): Unit = !struct.at7 = value.asInstanceOf[CFuncPtr3[Ptr[Byte], GIOFlags, Ptr[Ptr[GError]], GIOStatus]]
    def io_get_flags : CFuncPtr1[Ptr[GIOChannel], GIOFlags] = struct._8.asInstanceOf[CFuncPtr1[Ptr[GIOChannel], GIOFlags]]
    def io_get_flags_=(value: CFuncPtr1[Ptr[GIOChannel], GIOFlags]): Unit = !struct.at8 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], GIOFlags]]

opaque type _GKeyFile = CStruct0
object _GKeyFile:
  given _tag: Tag[_GKeyFile] = Tag.materializeCStruct0Tag

opaque type _GList = CStruct3[gpointer, Ptr[Byte], Ptr[Byte]]
object _GList:
  given _tag: Tag[_GList] = Tag.materializeCStruct3Tag[gpointer, Ptr[Byte], Ptr[Byte]]
  def apply()(using Zone): Ptr[_GList] = scala.scalanative.unsafe.alloc[_GList](1)
  def apply(data : gpointer, next : Ptr[GList], prev : Ptr[GList])(using Zone): Ptr[_GList] = 
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).next = next
    (!____ptr).prev = prev
    ____ptr
  extension (struct: _GList)
    def data : gpointer = struct._1
    def data_=(value: gpointer): Unit = !struct.at1 = value
    def next : Ptr[GList] = struct._2.asInstanceOf[Ptr[GList]]
    def next_=(value: Ptr[GList]): Unit = !struct.at2 = value.asInstanceOf[Ptr[Byte]]
    def prev : Ptr[GList] = struct._3.asInstanceOf[Ptr[GList]]
    def prev_=(value: Ptr[GList]): Unit = !struct.at3 = value.asInstanceOf[Ptr[Byte]]

opaque type _GLogField = CStruct3[Ptr[gchar], gconstpointer, gssize]
object _GLogField:
  given _tag: Tag[_GLogField] = Tag.materializeCStruct3Tag[Ptr[gchar], gconstpointer, gssize]
  def apply()(using Zone): Ptr[_GLogField] = scala.scalanative.unsafe.alloc[_GLogField](1)
  def apply(key : Ptr[gchar], value : gconstpointer, length : gssize)(using Zone): Ptr[_GLogField] = 
    val ____ptr = apply()
    (!____ptr).key = key
    (!____ptr).value = value
    (!____ptr).length = length
    ____ptr
  extension (struct: _GLogField)
    def key : Ptr[gchar] = struct._1
    def key_=(value: Ptr[gchar]): Unit = !struct.at1 = value
    def value : gconstpointer = struct._2
    def value_=(value: gconstpointer): Unit = !struct.at2 = value
    def length : gssize = struct._3
    def length_=(value: gssize): Unit = !struct.at3 = value

opaque type _GMainContext = CStruct0
object _GMainContext:
  given _tag: Tag[_GMainContext] = Tag.materializeCStruct0Tag

opaque type _GMainLoop = CStruct0
object _GMainLoop:
  given _tag: Tag[_GMainLoop] = Tag.materializeCStruct0Tag

opaque type _GMappedFile = CStruct0
object _GMappedFile:
  given _tag: Tag[_GMappedFile] = Tag.materializeCStruct0Tag

opaque type _GMarkupParseContext = CStruct0
object _GMarkupParseContext:
  given _tag: Tag[_GMarkupParseContext] = Tag.materializeCStruct0Tag

/**
 * GMarkupParser: _element: Callback to invoke when the opening tag of an element is seen. The callback's _names and _values parameters are %NULL-terminated. _element: Callback to invoke when the closing tag of an element is seen. Note that this is also called for empty tags like `<empty/>`.
*/
opaque type _GMarkupParser = CStruct5[CFuncPtr6[Ptr[GMarkupParseContext], Ptr[gchar], Ptr[Ptr[gchar]], Ptr[Ptr[gchar]], gpointer, Ptr[Ptr[GError]], Unit], CFuncPtr4[Ptr[GMarkupParseContext], Ptr[gchar], gpointer, Ptr[Ptr[GError]], Unit], CFuncPtr5[Ptr[GMarkupParseContext], Ptr[gchar], gsize, gpointer, Ptr[Ptr[GError]], Unit], CFuncPtr5[Ptr[GMarkupParseContext], Ptr[gchar], gsize, gpointer, Ptr[Ptr[GError]], Unit], CFuncPtr3[Ptr[GMarkupParseContext], Ptr[GError], gpointer, Unit]]
object _GMarkupParser:
  given _tag: Tag[_GMarkupParser] = Tag.materializeCStruct5Tag[CFuncPtr6[Ptr[GMarkupParseContext], Ptr[gchar], Ptr[Ptr[gchar]], Ptr[Ptr[gchar]], gpointer, Ptr[Ptr[GError]], Unit], CFuncPtr4[Ptr[GMarkupParseContext], Ptr[gchar], gpointer, Ptr[Ptr[GError]], Unit], CFuncPtr5[Ptr[GMarkupParseContext], Ptr[gchar], gsize, gpointer, Ptr[Ptr[GError]], Unit], CFuncPtr5[Ptr[GMarkupParseContext], Ptr[gchar], gsize, gpointer, Ptr[Ptr[GError]], Unit], CFuncPtr3[Ptr[GMarkupParseContext], Ptr[GError], gpointer, Unit]]
  def apply()(using Zone): Ptr[_GMarkupParser] = scala.scalanative.unsafe.alloc[_GMarkupParser](1)
  def apply(start_element : CFuncPtr6[Ptr[GMarkupParseContext], Ptr[gchar], Ptr[Ptr[gchar]], Ptr[Ptr[gchar]], gpointer, Ptr[Ptr[GError]], Unit], end_element : CFuncPtr4[Ptr[GMarkupParseContext], Ptr[gchar], gpointer, Ptr[Ptr[GError]], Unit], text : CFuncPtr5[Ptr[GMarkupParseContext], Ptr[gchar], gsize, gpointer, Ptr[Ptr[GError]], Unit], passthrough : CFuncPtr5[Ptr[GMarkupParseContext], Ptr[gchar], gsize, gpointer, Ptr[Ptr[GError]], Unit], error : CFuncPtr3[Ptr[GMarkupParseContext], Ptr[GError], gpointer, Unit])(using Zone): Ptr[_GMarkupParser] = 
    val ____ptr = apply()
    (!____ptr).start_element = start_element
    (!____ptr).end_element = end_element
    (!____ptr).text = text
    (!____ptr).passthrough = passthrough
    (!____ptr).error = error
    ____ptr
  extension (struct: _GMarkupParser)
    def start_element : CFuncPtr6[Ptr[GMarkupParseContext], Ptr[gchar], Ptr[Ptr[gchar]], Ptr[Ptr[gchar]], gpointer, Ptr[Ptr[GError]], Unit] = struct._1
    def start_element_=(value: CFuncPtr6[Ptr[GMarkupParseContext], Ptr[gchar], Ptr[Ptr[gchar]], Ptr[Ptr[gchar]], gpointer, Ptr[Ptr[GError]], Unit]): Unit = !struct.at1 = value
    def end_element : CFuncPtr4[Ptr[GMarkupParseContext], Ptr[gchar], gpointer, Ptr[Ptr[GError]], Unit] = struct._2
    def end_element_=(value: CFuncPtr4[Ptr[GMarkupParseContext], Ptr[gchar], gpointer, Ptr[Ptr[GError]], Unit]): Unit = !struct.at2 = value
    def text : CFuncPtr5[Ptr[GMarkupParseContext], Ptr[gchar], gsize, gpointer, Ptr[Ptr[GError]], Unit] = struct._3
    def text_=(value: CFuncPtr5[Ptr[GMarkupParseContext], Ptr[gchar], gsize, gpointer, Ptr[Ptr[GError]], Unit]): Unit = !struct.at3 = value
    def passthrough : CFuncPtr5[Ptr[GMarkupParseContext], Ptr[gchar], gsize, gpointer, Ptr[Ptr[GError]], Unit] = struct._4
    def passthrough_=(value: CFuncPtr5[Ptr[GMarkupParseContext], Ptr[gchar], gsize, gpointer, Ptr[Ptr[GError]], Unit]): Unit = !struct.at4 = value
    def error : CFuncPtr3[Ptr[GMarkupParseContext], Ptr[GError], gpointer, Unit] = struct._5
    def error_=(value: CFuncPtr3[Ptr[GMarkupParseContext], Ptr[GError], gpointer, Unit]): Unit = !struct.at5 = value

opaque type _GMatchInfo = CStruct0
object _GMatchInfo:
  given _tag: Tag[_GMatchInfo] = Tag.materializeCStruct0Tag

opaque type _GMemChunk = CStruct0
object _GMemChunk:
  given _tag: Tag[_GMemChunk] = Tag.materializeCStruct0Tag

opaque type _GMemVTable = CStruct6[CFuncPtr1[gsize, gpointer], CFuncPtr2[gpointer, gsize, gpointer], CFuncPtr1[gpointer, Unit], CFuncPtr2[gsize, gsize, gpointer], CFuncPtr1[gsize, gpointer], CFuncPtr2[gpointer, gsize, gpointer]]
object _GMemVTable:
  given _tag: Tag[_GMemVTable] = Tag.materializeCStruct6Tag[CFuncPtr1[gsize, gpointer], CFuncPtr2[gpointer, gsize, gpointer], CFuncPtr1[gpointer, Unit], CFuncPtr2[gsize, gsize, gpointer], CFuncPtr1[gsize, gpointer], CFuncPtr2[gpointer, gsize, gpointer]]
  def apply()(using Zone): Ptr[_GMemVTable] = scala.scalanative.unsafe.alloc[_GMemVTable](1)
  def apply(malloc : CFuncPtr1[gsize, gpointer], realloc : CFuncPtr2[gpointer, gsize, gpointer], free : CFuncPtr1[gpointer, Unit], calloc : CFuncPtr2[gsize, gsize, gpointer], try_malloc : CFuncPtr1[gsize, gpointer], try_realloc : CFuncPtr2[gpointer, gsize, gpointer])(using Zone): Ptr[_GMemVTable] = 
    val ____ptr = apply()
    (!____ptr).malloc = malloc
    (!____ptr).realloc = realloc
    (!____ptr).free = free
    (!____ptr).calloc = calloc
    (!____ptr).try_malloc = try_malloc
    (!____ptr).try_realloc = try_realloc
    ____ptr
  extension (struct: _GMemVTable)
    def malloc : CFuncPtr1[gsize, gpointer] = struct._1
    def malloc_=(value: CFuncPtr1[gsize, gpointer]): Unit = !struct.at1 = value
    def realloc : CFuncPtr2[gpointer, gsize, gpointer] = struct._2
    def realloc_=(value: CFuncPtr2[gpointer, gsize, gpointer]): Unit = !struct.at2 = value
    def free : CFuncPtr1[gpointer, Unit] = struct._3
    def free_=(value: CFuncPtr1[gpointer, Unit]): Unit = !struct.at3 = value
    def calloc : CFuncPtr2[gsize, gsize, gpointer] = struct._4
    def calloc_=(value: CFuncPtr2[gsize, gsize, gpointer]): Unit = !struct.at4 = value
    def try_malloc : CFuncPtr1[gsize, gpointer] = struct._5
    def try_malloc_=(value: CFuncPtr1[gsize, gpointer]): Unit = !struct.at5 = value
    def try_realloc : CFuncPtr2[gpointer, gsize, gpointer] = struct._6
    def try_realloc_=(value: CFuncPtr2[gpointer, gsize, gpointer]): Unit = !struct.at6 = value

opaque type _GNode = CStruct5[gpointer, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte]]
object _GNode:
  given _tag: Tag[_GNode] = Tag.materializeCStruct5Tag[gpointer, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte]]
  def apply()(using Zone): Ptr[_GNode] = scala.scalanative.unsafe.alloc[_GNode](1)
  def apply(data : gpointer, next : Ptr[GNode], prev : Ptr[GNode], parent : Ptr[GNode], children : Ptr[GNode])(using Zone): Ptr[_GNode] = 
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).next = next
    (!____ptr).prev = prev
    (!____ptr).parent = parent
    (!____ptr).children = children
    ____ptr
  extension (struct: _GNode)
    def data : gpointer = struct._1
    def data_=(value: gpointer): Unit = !struct.at1 = value
    def next : Ptr[GNode] = struct._2.asInstanceOf[Ptr[GNode]]
    def next_=(value: Ptr[GNode]): Unit = !struct.at2 = value.asInstanceOf[Ptr[Byte]]
    def prev : Ptr[GNode] = struct._3.asInstanceOf[Ptr[GNode]]
    def prev_=(value: Ptr[GNode]): Unit = !struct.at3 = value.asInstanceOf[Ptr[Byte]]
    def parent : Ptr[GNode] = struct._4.asInstanceOf[Ptr[GNode]]
    def parent_=(value: Ptr[GNode]): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
    def children : Ptr[GNode] = struct._5.asInstanceOf[Ptr[GNode]]
    def children_=(value: Ptr[GNode]): Unit = !struct.at5 = value.asInstanceOf[Ptr[Byte]]

opaque type _GOnce = CStruct2[GOnceStatus, gpointer]
object _GOnce:
  given _tag: Tag[_GOnce] = Tag.materializeCStruct2Tag[GOnceStatus, gpointer]
  def apply()(using Zone): Ptr[_GOnce] = scala.scalanative.unsafe.alloc[_GOnce](1)
  def apply(status : GOnceStatus, retval : gpointer)(using Zone): Ptr[_GOnce] = 
    val ____ptr = apply()
    (!____ptr).status = status
    (!____ptr).retval = retval
    ____ptr
  extension (struct: _GOnce)
    def status : GOnceStatus = struct._1
    def status_=(value: GOnceStatus): Unit = !struct.at1 = value
    def retval : gpointer = struct._2
    def retval_=(value: gpointer): Unit = !struct.at2 = value

opaque type _GOptionContext = CStruct0
object _GOptionContext:
  given _tag: Tag[_GOptionContext] = Tag.materializeCStruct0Tag

/**
 * _name must be a printable ASCII character different from '-', or zero if the option has no short name. : Flags from #GOptionFlags
*/
opaque type _GOptionEntry = CStruct7[Ptr[gchar], gchar, gint, GOptionArg, gpointer, Ptr[gchar], Ptr[gchar]]
object _GOptionEntry:
  given _tag: Tag[_GOptionEntry] = Tag.materializeCStruct7Tag[Ptr[gchar], gchar, gint, GOptionArg, gpointer, Ptr[gchar], Ptr[gchar]]
  def apply()(using Zone): Ptr[_GOptionEntry] = scala.scalanative.unsafe.alloc[_GOptionEntry](1)
  def apply(long_name : Ptr[gchar], short_name : gchar, flags : gint, arg : GOptionArg, arg_data : gpointer, description : Ptr[gchar], arg_description : Ptr[gchar])(using Zone): Ptr[_GOptionEntry] = 
    val ____ptr = apply()
    (!____ptr).long_name = long_name
    (!____ptr).short_name = short_name
    (!____ptr).flags = flags
    (!____ptr).arg = arg
    (!____ptr).arg_data = arg_data
    (!____ptr).description = description
    (!____ptr).arg_description = arg_description
    ____ptr
  extension (struct: _GOptionEntry)
    def long_name : Ptr[gchar] = struct._1
    def long_name_=(value: Ptr[gchar]): Unit = !struct.at1 = value
    def short_name : gchar = struct._2
    def short_name_=(value: gchar): Unit = !struct.at2 = value
    def flags : gint = struct._3
    def flags_=(value: gint): Unit = !struct.at3 = value
    def arg : GOptionArg = struct._4
    def arg_=(value: GOptionArg): Unit = !struct.at4 = value
    def arg_data : gpointer = struct._5
    def arg_data_=(value: gpointer): Unit = !struct.at5 = value
    def description : Ptr[gchar] = struct._6
    def description_=(value: Ptr[gchar]): Unit = !struct.at6 = value
    def arg_description : Ptr[gchar] = struct._7
    def arg_description_=(value: Ptr[gchar]): Unit = !struct.at7 = value

opaque type _GOptionGroup = CStruct0
object _GOptionGroup:
  given _tag: Tag[_GOptionGroup] = Tag.materializeCStruct0Tag

opaque type _GPathBuf = CStruct1[CArray[gpointer, Nat._8]]
object _GPathBuf:
  given _tag: Tag[_GPathBuf] = Tag.materializeCStruct1Tag[CArray[gpointer, Nat._8]]
  def apply()(using Zone): Ptr[_GPathBuf] = scala.scalanative.unsafe.alloc[_GPathBuf](1)
  def apply(dummy : CArray[gpointer, Nat._8])(using Zone): Ptr[_GPathBuf] = 
    val ____ptr = apply()
    (!____ptr).dummy = dummy
    ____ptr
  extension (struct: _GPathBuf)
    def dummy : CArray[gpointer, Nat._8] = struct._1
    def dummy_=(value: CArray[gpointer, Nat._8]): Unit = !struct.at1 = value

opaque type _GPatternSpec = CStruct0
object _GPatternSpec:
  given _tag: Tag[_GPatternSpec] = Tag.materializeCStruct0Tag

/**
 * GPollFD: : the file descriptor to poll (or a HANDLE on Win32) : a bitwise combination from #GIOCondition, specifying which events should be polled for. Typically for reading from a file descriptor you would use %G_IO_IN | %G_IO_HUP | %G_IO_ERR, and for writing you would use %G_IO_OUT | %G_IO_ERR. : a bitwise combination of flags from #GIOCondition, returned from the poll() function to indicate which events occurred.
*/
opaque type _GPollFD = CStruct3[gint, gushort, gushort]
object _GPollFD:
  given _tag: Tag[_GPollFD] = Tag.materializeCStruct3Tag[gint, gushort, gushort]
  def apply()(using Zone): Ptr[_GPollFD] = scala.scalanative.unsafe.alloc[_GPollFD](1)
  def apply(fd : gint, events : gushort, revents : gushort)(using Zone): Ptr[_GPollFD] = 
    val ____ptr = apply()
    (!____ptr).fd = fd
    (!____ptr).events = events
    (!____ptr).revents = revents
    ____ptr
  extension (struct: _GPollFD)
    def fd : gint = struct._1
    def fd_=(value: gint): Unit = !struct.at1 = value
    def events : gushort = struct._2
    def events_=(value: gushort): Unit = !struct.at2 = value
    def revents : gushort = struct._3
    def revents_=(value: gushort): Unit = !struct.at3 = value

opaque type _GPrivate = CStruct3[gpointer, GDestroyNotify, CArray[gpointer, Nat._2]]
object _GPrivate:
  given _tag: Tag[_GPrivate] = Tag.materializeCStruct3Tag[gpointer, GDestroyNotify, CArray[gpointer, Nat._2]]
  def apply()(using Zone): Ptr[_GPrivate] = scala.scalanative.unsafe.alloc[_GPrivate](1)
  def apply(p : gpointer, _notify : GDestroyNotify, future : CArray[gpointer, Nat._2])(using Zone): Ptr[_GPrivate] = 
    val ____ptr = apply()
    (!____ptr).p = p
    (!____ptr)._notify = _notify
    (!____ptr).future = future
    ____ptr
  extension (struct: _GPrivate)
    def p : gpointer = struct._1
    def p_=(value: gpointer): Unit = !struct.at1 = value
    def _notify : GDestroyNotify = struct._2
    def _notify_=(value: GDestroyNotify): Unit = !struct.at2 = value
    def future : CArray[gpointer, Nat._2] = struct._3
    def future_=(value: CArray[gpointer, Nat._2]): Unit = !struct.at3 = value

opaque type _GPtrArray = CStruct2[Ptr[gpointer], guint]
object _GPtrArray:
  given _tag: Tag[_GPtrArray] = Tag.materializeCStruct2Tag[Ptr[gpointer], guint]
  def apply()(using Zone): Ptr[_GPtrArray] = scala.scalanative.unsafe.alloc[_GPtrArray](1)
  def apply(pdata : Ptr[gpointer], len : guint)(using Zone): Ptr[_GPtrArray] = 
    val ____ptr = apply()
    (!____ptr).pdata = pdata
    (!____ptr).len = len
    ____ptr
  extension (struct: _GPtrArray)
    def pdata : Ptr[gpointer] = struct._1
    def pdata_=(value: Ptr[gpointer]): Unit = !struct.at1 = value
    def len : guint = struct._2
    def len_=(value: guint): Unit = !struct.at2 = value

/**
 * GQueue: : a pointer to the first element of the queue : a pointer to the last element of the queue : the number of elements in the queue
*/
opaque type _GQueue = CStruct3[Ptr[Byte], Ptr[Byte], guint]
object _GQueue:
  given _tag: Tag[_GQueue] = Tag.materializeCStruct3Tag[Ptr[Byte], Ptr[Byte], guint]
  def apply()(using Zone): Ptr[_GQueue] = scala.scalanative.unsafe.alloc[_GQueue](1)
  def apply(head : Ptr[GList], tail : Ptr[GList], length : guint)(using Zone): Ptr[_GQueue] = 
    val ____ptr = apply()
    (!____ptr).head = head
    (!____ptr).tail = tail
    (!____ptr).length = length
    ____ptr
  extension (struct: _GQueue)
    def head : Ptr[GList] = struct._1.asInstanceOf[Ptr[GList]]
    def head_=(value: Ptr[GList]): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
    def tail : Ptr[GList] = struct._2.asInstanceOf[Ptr[GList]]
    def tail_=(value: Ptr[GList]): Unit = !struct.at2 = value.asInstanceOf[Ptr[Byte]]
    def length : guint = struct._3
    def length_=(value: guint): Unit = !struct.at3 = value

opaque type _GRWLock = CStruct2[gpointer, CArray[guint, Nat._2]]
object _GRWLock:
  given _tag: Tag[_GRWLock] = Tag.materializeCStruct2Tag[gpointer, CArray[guint, Nat._2]]
  def apply()(using Zone): Ptr[_GRWLock] = scala.scalanative.unsafe.alloc[_GRWLock](1)
  def apply(p : gpointer, i : CArray[guint, Nat._2])(using Zone): Ptr[_GRWLock] = 
    val ____ptr = apply()
    (!____ptr).p = p
    (!____ptr).i = i
    ____ptr
  extension (struct: _GRWLock)
    def p : gpointer = struct._1
    def p_=(value: gpointer): Unit = !struct.at1 = value
    def i : CArray[guint, Nat._2] = struct._2
    def i_=(value: CArray[guint, Nat._2]): Unit = !struct.at2 = value

opaque type _GRand = CStruct0
object _GRand:
  given _tag: Tag[_GRand] = Tag.materializeCStruct0Tag

opaque type _GRecMutex = CStruct2[gpointer, CArray[guint, Nat._2]]
object _GRecMutex:
  given _tag: Tag[_GRecMutex] = Tag.materializeCStruct2Tag[gpointer, CArray[guint, Nat._2]]
  def apply()(using Zone): Ptr[_GRecMutex] = scala.scalanative.unsafe.alloc[_GRecMutex](1)
  def apply(p : gpointer, i : CArray[guint, Nat._2])(using Zone): Ptr[_GRecMutex] = 
    val ____ptr = apply()
    (!____ptr).p = p
    (!____ptr).i = i
    ____ptr
  extension (struct: _GRecMutex)
    def p : gpointer = struct._1
    def p_=(value: gpointer): Unit = !struct.at1 = value
    def i : CArray[guint, Nat._2] = struct._2
    def i_=(value: CArray[guint, Nat._2]): Unit = !struct.at2 = value

opaque type _GRegex = CStruct0
object _GRegex:
  given _tag: Tag[_GRegex] = Tag.materializeCStruct0Tag

opaque type _GRelation = CStruct0
object _GRelation:
  given _tag: Tag[_GRelation] = Tag.materializeCStruct0Tag

opaque type _GSList = CStruct2[gpointer, Ptr[Byte]]
object _GSList:
  given _tag: Tag[_GSList] = Tag.materializeCStruct2Tag[gpointer, Ptr[Byte]]
  def apply()(using Zone): Ptr[_GSList] = scala.scalanative.unsafe.alloc[_GSList](1)
  def apply(data : gpointer, next : Ptr[GSList])(using Zone): Ptr[_GSList] = 
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).next = next
    ____ptr
  extension (struct: _GSList)
    def data : gpointer = struct._1
    def data_=(value: gpointer): Unit = !struct.at1 = value
    def next : Ptr[GSList] = struct._2.asInstanceOf[Ptr[GSList]]
    def next_=(value: Ptr[GSList]): Unit = !struct.at2 = value.asInstanceOf[Ptr[Byte]]

opaque type _GScanner = CStruct21[gpointer, guint, guint, Ptr[gchar], Ptr[GData], Ptr[GScannerConfig], GTokenType, GTokenValue, guint, guint, GTokenType, GTokenValue, guint, guint, Ptr[GHashTable], gint, Ptr[gchar], Ptr[gchar], Ptr[gchar], guint, Ptr[Byte]]
object _GScanner:
  given _tag: Tag[_GScanner] = Tag.materializeCStruct21Tag[gpointer, guint, guint, Ptr[gchar], Ptr[GData], Ptr[GScannerConfig], GTokenType, GTokenValue, guint, guint, GTokenType, GTokenValue, guint, guint, Ptr[GHashTable], gint, Ptr[gchar], Ptr[gchar], Ptr[gchar], guint, Ptr[Byte]]
  def apply()(using Zone): Ptr[_GScanner] = scala.scalanative.unsafe.alloc[_GScanner](1)
  def apply(user_data : gpointer, max_parse_errors : guint, parse_errors : guint, input_name : Ptr[gchar], qdata : Ptr[GData], config : Ptr[GScannerConfig], token : GTokenType, value : GTokenValue, line : guint, position : guint, next_token : GTokenType, next_value : GTokenValue, next_line : guint, next_position : guint, symbol_table : Ptr[GHashTable], input_fd : gint, text : Ptr[gchar], text_end : Ptr[gchar], buffer : Ptr[gchar], scope_id : guint, msg_handler : GScannerMsgFunc)(using Zone): Ptr[_GScanner] = 
    val ____ptr = apply()
    (!____ptr).user_data = user_data
    (!____ptr).max_parse_errors = max_parse_errors
    (!____ptr).parse_errors = parse_errors
    (!____ptr).input_name = input_name
    (!____ptr).qdata = qdata
    (!____ptr).config = config
    (!____ptr).token = token
    (!____ptr).value = value
    (!____ptr).line = line
    (!____ptr).position = position
    (!____ptr).next_token = next_token
    (!____ptr).next_value = next_value
    (!____ptr).next_line = next_line
    (!____ptr).next_position = next_position
    (!____ptr).symbol_table = symbol_table
    (!____ptr).input_fd = input_fd
    (!____ptr).text = text
    (!____ptr).text_end = text_end
    (!____ptr).buffer = buffer
    (!____ptr).scope_id = scope_id
    (!____ptr).msg_handler = msg_handler
    ____ptr
  extension (struct: _GScanner)
    def user_data : gpointer = struct._1
    def user_data_=(value: gpointer): Unit = !struct.at1 = value
    def max_parse_errors : guint = struct._2
    def max_parse_errors_=(value: guint): Unit = !struct.at2 = value
    def parse_errors : guint = struct._3
    def parse_errors_=(value: guint): Unit = !struct.at3 = value
    def input_name : Ptr[gchar] = struct._4
    def input_name_=(value: Ptr[gchar]): Unit = !struct.at4 = value
    def qdata : Ptr[GData] = struct._5
    def qdata_=(value: Ptr[GData]): Unit = !struct.at5 = value
    def config : Ptr[GScannerConfig] = struct._6
    def config_=(value: Ptr[GScannerConfig]): Unit = !struct.at6 = value
    def token : GTokenType = struct._7
    def token_=(value: GTokenType): Unit = !struct.at7 = value
    def value : GTokenValue = struct._8
    def value_=(value: GTokenValue): Unit = !struct.at8 = value
    def line : guint = struct._9
    def line_=(value: guint): Unit = !struct.at9 = value
    def position : guint = struct._10
    def position_=(value: guint): Unit = !struct.at10 = value
    def next_token : GTokenType = struct._11
    def next_token_=(value: GTokenType): Unit = !struct.at11 = value
    def next_value : GTokenValue = struct._12
    def next_value_=(value: GTokenValue): Unit = !struct.at12 = value
    def next_line : guint = struct._13
    def next_line_=(value: guint): Unit = !struct.at13 = value
    def next_position : guint = struct._14
    def next_position_=(value: guint): Unit = !struct.at14 = value
    def symbol_table : Ptr[GHashTable] = struct._15
    def symbol_table_=(value: Ptr[GHashTable]): Unit = !struct.at15 = value
    def input_fd : gint = struct._16
    def input_fd_=(value: gint): Unit = !struct.at16 = value
    def text : Ptr[gchar] = struct._17
    def text_=(value: Ptr[gchar]): Unit = !struct.at17 = value
    def text_end : Ptr[gchar] = struct._18
    def text_end_=(value: Ptr[gchar]): Unit = !struct.at18 = value
    def buffer : Ptr[gchar] = struct._19
    def buffer_=(value: Ptr[gchar]): Unit = !struct.at19 = value
    def scope_id : guint = struct._20
    def scope_id_=(value: guint): Unit = !struct.at20 = value
    def msg_handler : GScannerMsgFunc = struct._21.asInstanceOf[GScannerMsgFunc]
    def msg_handler_=(value: GScannerMsgFunc): Unit = !struct.at21 = value.asInstanceOf[Ptr[Byte]]

opaque type _GScannerConfig = CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]
object _GScannerConfig:
  given _tag: Tag[_GScannerConfig] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._0]](Tag.Byte, Tag.Digit2[Nat._4, Nat._0](Tag.Nat4, Tag.Nat0))
  def apply()(using Zone): Ptr[_GScannerConfig] = scala.scalanative.unsafe.alloc[_GScannerConfig](1)
  def apply(cset_skip_characters : Ptr[gchar], cset_identifier_first : Ptr[gchar], cset_identifier_nth : Ptr[gchar], cpair_comment_single : Ptr[gchar], case_sensitive : guint, skip_comment_multi : guint, skip_comment_single : guint, scan_comment_multi : guint, scan_identifier : guint, scan_identifier_1char : guint, scan_identifier_NULL : guint, scan_symbols : guint, scan_binary : guint, scan_octal : guint, scan_float : guint, scan_hex : guint, scan_hex_dollar : guint, scan_string_sq : guint, scan_string_dq : guint, numbers_2_int : guint, int_2_float : guint, identifier_2_string : guint, char_2_token : guint, symbol_2_token : guint, scope_0_fallback : guint, store_int64 : guint, padding_dummy : guint)(using Zone): Ptr[_GScannerConfig] = 
    val ____ptr = apply()
    (!____ptr).cset_skip_characters = cset_skip_characters
    (!____ptr).cset_identifier_first = cset_identifier_first
    (!____ptr).cset_identifier_nth = cset_identifier_nth
    (!____ptr).cpair_comment_single = cpair_comment_single
    (!____ptr).case_sensitive = case_sensitive
    (!____ptr).skip_comment_multi = skip_comment_multi
    (!____ptr).skip_comment_single = skip_comment_single
    (!____ptr).scan_comment_multi = scan_comment_multi
    (!____ptr).scan_identifier = scan_identifier
    (!____ptr).scan_identifier_1char = scan_identifier_1char
    (!____ptr).scan_identifier_NULL = scan_identifier_NULL
    (!____ptr).scan_symbols = scan_symbols
    (!____ptr).scan_binary = scan_binary
    (!____ptr).scan_octal = scan_octal
    (!____ptr).scan_float = scan_float
    (!____ptr).scan_hex = scan_hex
    (!____ptr).scan_hex_dollar = scan_hex_dollar
    (!____ptr).scan_string_sq = scan_string_sq
    (!____ptr).scan_string_dq = scan_string_dq
    (!____ptr).numbers_2_int = numbers_2_int
    (!____ptr).int_2_float = int_2_float
    (!____ptr).identifier_2_string = identifier_2_string
    (!____ptr).char_2_token = char_2_token
    (!____ptr).symbol_2_token = symbol_2_token
    (!____ptr).scope_0_fallback = scope_0_fallback
    (!____ptr).store_int64 = store_int64
    (!____ptr).padding_dummy = padding_dummy
    ____ptr
  extension (struct: _GScannerConfig)
    def cset_skip_characters: Ptr[gchar] = !struct.at(offsets(0)).asInstanceOf[Ptr[Ptr[gchar]]]
    def cset_skip_characters_=(value: Ptr[gchar]): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[Ptr[gchar]]] = value
    def cset_identifier_first: Ptr[gchar] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[gchar]]]
    def cset_identifier_first_=(value: Ptr[gchar]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[gchar]]] = value
    def cset_identifier_nth: Ptr[gchar] = !struct.at(offsets(2)).asInstanceOf[Ptr[Ptr[gchar]]]
    def cset_identifier_nth_=(value: Ptr[gchar]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[Ptr[gchar]]] = value
    def cpair_comment_single: Ptr[gchar] = !struct.at(offsets(3)).asInstanceOf[Ptr[Ptr[gchar]]]
    def cpair_comment_single_=(value: Ptr[gchar]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[Ptr[gchar]]] = value
    def case_sensitive: guint = !struct.at(offsets(4)).asInstanceOf[Ptr[guint]]
    def case_sensitive_=(value: guint): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[guint]] = value
    def skip_comment_multi: guint = !struct.at(offsets(5)).asInstanceOf[Ptr[guint]]
    def skip_comment_multi_=(value: guint): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[guint]] = value
    def skip_comment_single: guint = !struct.at(offsets(6)).asInstanceOf[Ptr[guint]]
    def skip_comment_single_=(value: guint): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[guint]] = value
    def scan_comment_multi: guint = !struct.at(offsets(7)).asInstanceOf[Ptr[guint]]
    def scan_comment_multi_=(value: guint): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[guint]] = value
    def scan_identifier: guint = !struct.at(offsets(8)).asInstanceOf[Ptr[guint]]
    def scan_identifier_=(value: guint): Unit = !struct.at(offsets(8)).asInstanceOf[Ptr[guint]] = value
    def scan_identifier_1char: guint = !struct.at(offsets(9)).asInstanceOf[Ptr[guint]]
    def scan_identifier_1char_=(value: guint): Unit = !struct.at(offsets(9)).asInstanceOf[Ptr[guint]] = value
    def scan_identifier_NULL: guint = !struct.at(offsets(10)).asInstanceOf[Ptr[guint]]
    def scan_identifier_NULL_=(value: guint): Unit = !struct.at(offsets(10)).asInstanceOf[Ptr[guint]] = value
    def scan_symbols: guint = !struct.at(offsets(11)).asInstanceOf[Ptr[guint]]
    def scan_symbols_=(value: guint): Unit = !struct.at(offsets(11)).asInstanceOf[Ptr[guint]] = value
    def scan_binary: guint = !struct.at(offsets(12)).asInstanceOf[Ptr[guint]]
    def scan_binary_=(value: guint): Unit = !struct.at(offsets(12)).asInstanceOf[Ptr[guint]] = value
    def scan_octal: guint = !struct.at(offsets(13)).asInstanceOf[Ptr[guint]]
    def scan_octal_=(value: guint): Unit = !struct.at(offsets(13)).asInstanceOf[Ptr[guint]] = value
    def scan_float: guint = !struct.at(offsets(14)).asInstanceOf[Ptr[guint]]
    def scan_float_=(value: guint): Unit = !struct.at(offsets(14)).asInstanceOf[Ptr[guint]] = value
    def scan_hex: guint = !struct.at(offsets(15)).asInstanceOf[Ptr[guint]]
    def scan_hex_=(value: guint): Unit = !struct.at(offsets(15)).asInstanceOf[Ptr[guint]] = value
    def scan_hex_dollar: guint = !struct.at(offsets(16)).asInstanceOf[Ptr[guint]]
    def scan_hex_dollar_=(value: guint): Unit = !struct.at(offsets(16)).asInstanceOf[Ptr[guint]] = value
    def scan_string_sq: guint = !struct.at(offsets(17)).asInstanceOf[Ptr[guint]]
    def scan_string_sq_=(value: guint): Unit = !struct.at(offsets(17)).asInstanceOf[Ptr[guint]] = value
    def scan_string_dq: guint = !struct.at(offsets(18)).asInstanceOf[Ptr[guint]]
    def scan_string_dq_=(value: guint): Unit = !struct.at(offsets(18)).asInstanceOf[Ptr[guint]] = value
    def numbers_2_int: guint = !struct.at(offsets(19)).asInstanceOf[Ptr[guint]]
    def numbers_2_int_=(value: guint): Unit = !struct.at(offsets(19)).asInstanceOf[Ptr[guint]] = value
    def int_2_float: guint = !struct.at(offsets(20)).asInstanceOf[Ptr[guint]]
    def int_2_float_=(value: guint): Unit = !struct.at(offsets(20)).asInstanceOf[Ptr[guint]] = value
    def identifier_2_string: guint = !struct.at(offsets(21)).asInstanceOf[Ptr[guint]]
    def identifier_2_string_=(value: guint): Unit = !struct.at(offsets(21)).asInstanceOf[Ptr[guint]] = value
    def char_2_token: guint = !struct.at(offsets(22)).asInstanceOf[Ptr[guint]]
    def char_2_token_=(value: guint): Unit = !struct.at(offsets(22)).asInstanceOf[Ptr[guint]] = value
    def symbol_2_token: guint = !struct.at(offsets(23)).asInstanceOf[Ptr[guint]]
    def symbol_2_token_=(value: guint): Unit = !struct.at(offsets(23)).asInstanceOf[Ptr[guint]] = value
    def scope_0_fallback: guint = !struct.at(offsets(24)).asInstanceOf[Ptr[guint]]
    def scope_0_fallback_=(value: guint): Unit = !struct.at(offsets(24)).asInstanceOf[Ptr[guint]] = value
    def store_int64: guint = !struct.at(offsets(25)).asInstanceOf[Ptr[guint]]
    def store_int64_=(value: guint): Unit = !struct.at(offsets(25)).asInstanceOf[Ptr[guint]] = value
    def padding_dummy: guint = !struct.at(offsets(26)).asInstanceOf[Ptr[guint]]
    def padding_dummy_=(value: guint): Unit = !struct.at(offsets(26)).asInstanceOf[Ptr[guint]] = value
  val offsets: Array[Int] = 
    val res = Array.ofDim[Int](27)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[Ptr[gchar]].toInt)
    res(1) = align(res(0) + sizeof[Ptr[gchar]].toInt, alignmentof[Ptr[gchar]].toInt)
    res(2) = align(res(1) + sizeof[Ptr[gchar]].toInt, alignmentof[Ptr[gchar]].toInt)
    res(3) = align(res(2) + sizeof[Ptr[gchar]].toInt, alignmentof[Ptr[gchar]].toInt)
    res(4) = align(res(3) + sizeof[Ptr[gchar]].toInt, alignmentof[guint].toInt)
    res(5) = align(res(4) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(6) = align(res(5) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(7) = align(res(6) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(8) = align(res(7) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(9) = align(res(8) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(10) = align(res(9) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(11) = align(res(10) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(12) = align(res(11) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(13) = align(res(12) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(14) = align(res(13) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(15) = align(res(14) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(16) = align(res(15) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(17) = align(res(16) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(18) = align(res(17) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(19) = align(res(18) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(20) = align(res(19) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(21) = align(res(20) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(22) = align(res(21) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(23) = align(res(22) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(24) = align(res(23) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(25) = align(res(24) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(26) = align(res(25) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res
  end offsets

opaque type _GSequence = CStruct0
object _GSequence:
  given _tag: Tag[_GSequence] = Tag.materializeCStruct0Tag

opaque type _GSequenceNode = CStruct0
object _GSequenceNode:
  given _tag: Tag[_GSequenceNode] = Tag.materializeCStruct0Tag

opaque type _GSource = CStruct13[gpointer, Ptr[Byte], Ptr[Byte], guint, Ptr[GMainContext], gint, guint, guint, Ptr[Byte], Ptr[Byte], Ptr[Byte], CString, Ptr[GSourcePrivate]]
object _GSource:
  given _tag: Tag[_GSource] = Tag.materializeCStruct13Tag[gpointer, Ptr[Byte], Ptr[Byte], guint, Ptr[GMainContext], gint, guint, guint, Ptr[Byte], Ptr[Byte], Ptr[Byte], CString, Ptr[GSourcePrivate]]
  def apply()(using Zone): Ptr[_GSource] = scala.scalanative.unsafe.alloc[_GSource](1)
  def apply(callback_data : gpointer, callback_funcs : Ptr[GSourceCallbackFuncs], source_funcs : Ptr[GSourceFuncs], ref_count : guint, context : Ptr[GMainContext], priority : gint, flags : guint, source_id : guint, poll_fds : Ptr[GSList], prev : Ptr[GSource], next : Ptr[GSource], name : CString, priv : Ptr[GSourcePrivate])(using Zone): Ptr[_GSource] = 
    val ____ptr = apply()
    (!____ptr).callback_data = callback_data
    (!____ptr).callback_funcs = callback_funcs
    (!____ptr).source_funcs = source_funcs
    (!____ptr).ref_count = ref_count
    (!____ptr).context = context
    (!____ptr).priority = priority
    (!____ptr).flags = flags
    (!____ptr).source_id = source_id
    (!____ptr).poll_fds = poll_fds
    (!____ptr).prev = prev
    (!____ptr).next = next
    (!____ptr).name = name
    (!____ptr).priv = priv
    ____ptr
  extension (struct: _GSource)
    def callback_data : gpointer = struct._1
    def callback_data_=(value: gpointer): Unit = !struct.at1 = value
    def callback_funcs : Ptr[GSourceCallbackFuncs] = struct._2.asInstanceOf[Ptr[GSourceCallbackFuncs]]
    def callback_funcs_=(value: Ptr[GSourceCallbackFuncs]): Unit = !struct.at2 = value.asInstanceOf[Ptr[Byte]]
    def source_funcs : Ptr[GSourceFuncs] = struct._3.asInstanceOf[Ptr[GSourceFuncs]]
    def source_funcs_=(value: Ptr[GSourceFuncs]): Unit = !struct.at3 = value.asInstanceOf[Ptr[Byte]]
    def ref_count : guint = struct._4
    def ref_count_=(value: guint): Unit = !struct.at4 = value
    def context : Ptr[GMainContext] = struct._5
    def context_=(value: Ptr[GMainContext]): Unit = !struct.at5 = value
    def priority : gint = struct._6
    def priority_=(value: gint): Unit = !struct.at6 = value
    def flags : guint = struct._7
    def flags_=(value: guint): Unit = !struct.at7 = value
    def source_id : guint = struct._8
    def source_id_=(value: guint): Unit = !struct.at8 = value
    def poll_fds : Ptr[GSList] = struct._9.asInstanceOf[Ptr[GSList]]
    def poll_fds_=(value: Ptr[GSList]): Unit = !struct.at9 = value.asInstanceOf[Ptr[Byte]]
    def prev : Ptr[GSource] = struct._10.asInstanceOf[Ptr[GSource]]
    def prev_=(value: Ptr[GSource]): Unit = !struct.at10 = value.asInstanceOf[Ptr[Byte]]
    def next : Ptr[GSource] = struct._11.asInstanceOf[Ptr[GSource]]
    def next_=(value: Ptr[GSource]): Unit = !struct.at11 = value.asInstanceOf[Ptr[Byte]]
    def name : CString = struct._12
    def name_=(value: CString): Unit = !struct.at12 = value
    def priv : Ptr[GSourcePrivate] = struct._13
    def priv_=(value: Ptr[GSourcePrivate]): Unit = !struct.at13 = value

opaque type _GSourceCallbackFuncs = CStruct3[CFuncPtr1[gpointer, Unit], CFuncPtr1[gpointer, Unit], CFuncPtr4[gpointer, Ptr[Byte], Ptr[GSourceFunc], Ptr[gpointer], Unit]]
object _GSourceCallbackFuncs:
  given _tag: Tag[_GSourceCallbackFuncs] = Tag.materializeCStruct3Tag[CFuncPtr1[gpointer, Unit], CFuncPtr1[gpointer, Unit], CFuncPtr4[gpointer, Ptr[Byte], Ptr[GSourceFunc], Ptr[gpointer], Unit]]
  def apply()(using Zone): Ptr[_GSourceCallbackFuncs] = scala.scalanative.unsafe.alloc[_GSourceCallbackFuncs](1)
  def apply(ref : CFuncPtr1[gpointer, Unit], unref : CFuncPtr1[gpointer, Unit], get : CFuncPtr4[gpointer, Ptr[GSource], Ptr[GSourceFunc], Ptr[gpointer], Unit])(using Zone): Ptr[_GSourceCallbackFuncs] = 
    val ____ptr = apply()
    (!____ptr).ref = ref
    (!____ptr).unref = unref
    (!____ptr).get = get
    ____ptr
  extension (struct: _GSourceCallbackFuncs)
    def ref : CFuncPtr1[gpointer, Unit] = struct._1
    def ref_=(value: CFuncPtr1[gpointer, Unit]): Unit = !struct.at1 = value
    def unref : CFuncPtr1[gpointer, Unit] = struct._2
    def unref_=(value: CFuncPtr1[gpointer, Unit]): Unit = !struct.at2 = value
    def get : CFuncPtr4[gpointer, Ptr[GSource], Ptr[GSourceFunc], Ptr[gpointer], Unit] = struct._3.asInstanceOf[CFuncPtr4[gpointer, Ptr[GSource], Ptr[GSourceFunc], Ptr[gpointer], Unit]]
    def get_=(value: CFuncPtr4[gpointer, Ptr[GSource], Ptr[GSourceFunc], Ptr[gpointer], Unit]): Unit = !struct.at3 = value.asInstanceOf[CFuncPtr4[gpointer, Ptr[Byte], Ptr[GSourceFunc], Ptr[gpointer], Unit]]

opaque type _GSourceFuncs = CStruct6[CFuncPtr2[Ptr[Byte], Ptr[gint], gboolean], CFuncPtr1[Ptr[Byte], gboolean], CFuncPtr3[Ptr[Byte], GSourceFunc, gpointer, gboolean], CFuncPtr1[Ptr[Byte], Unit], GSourceFunc, GSourceDummyMarshal]
object _GSourceFuncs:
  given _tag: Tag[_GSourceFuncs] = Tag.materializeCStruct6Tag[CFuncPtr2[Ptr[Byte], Ptr[gint], gboolean], CFuncPtr1[Ptr[Byte], gboolean], CFuncPtr3[Ptr[Byte], GSourceFunc, gpointer, gboolean], CFuncPtr1[Ptr[Byte], Unit], GSourceFunc, GSourceDummyMarshal]
  def apply()(using Zone): Ptr[_GSourceFuncs] = scala.scalanative.unsafe.alloc[_GSourceFuncs](1)
  def apply(prepare : CFuncPtr2[Ptr[GSource], Ptr[gint], gboolean], check : CFuncPtr1[Ptr[GSource], gboolean], dispatch : CFuncPtr3[Ptr[GSource], GSourceFunc, gpointer, gboolean], finalize : CFuncPtr1[Ptr[GSource], Unit], closure_callback : GSourceFunc, closure_marshal : GSourceDummyMarshal)(using Zone): Ptr[_GSourceFuncs] = 
    val ____ptr = apply()
    (!____ptr).prepare = prepare
    (!____ptr).check = check
    (!____ptr).dispatch = dispatch
    (!____ptr).finalize = finalize
    (!____ptr).closure_callback = closure_callback
    (!____ptr).closure_marshal = closure_marshal
    ____ptr
  extension (struct: _GSourceFuncs)
    def prepare : CFuncPtr2[Ptr[GSource], Ptr[gint], gboolean] = struct._1.asInstanceOf[CFuncPtr2[Ptr[GSource], Ptr[gint], gboolean]]
    def prepare_=(value: CFuncPtr2[Ptr[GSource], Ptr[gint], gboolean]): Unit = !struct.at1 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], Ptr[gint], gboolean]]
    def check : CFuncPtr1[Ptr[GSource], gboolean] = struct._2.asInstanceOf[CFuncPtr1[Ptr[GSource], gboolean]]
    def check_=(value: CFuncPtr1[Ptr[GSource], gboolean]): Unit = !struct.at2 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], gboolean]]
    def dispatch : CFuncPtr3[Ptr[GSource], GSourceFunc, gpointer, gboolean] = struct._3.asInstanceOf[CFuncPtr3[Ptr[GSource], GSourceFunc, gpointer, gboolean]]
    def dispatch_=(value: CFuncPtr3[Ptr[GSource], GSourceFunc, gpointer, gboolean]): Unit = !struct.at3 = value.asInstanceOf[CFuncPtr3[Ptr[Byte], GSourceFunc, gpointer, gboolean]]
    def finalize : CFuncPtr1[Ptr[GSource], Unit] = struct._4.asInstanceOf[CFuncPtr1[Ptr[GSource], Unit]]
    def finalize_=(value: CFuncPtr1[Ptr[GSource], Unit]): Unit = !struct.at4 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], Unit]]
    def closure_callback : GSourceFunc = struct._5
    def closure_callback_=(value: GSourceFunc): Unit = !struct.at5 = value
    def closure_marshal : GSourceDummyMarshal = struct._6
    def closure_marshal_=(value: GSourceDummyMarshal): Unit = !struct.at6 = value

opaque type _GSourcePrivate = CStruct0
object _GSourcePrivate:
  given _tag: Tag[_GSourcePrivate] = Tag.materializeCStruct0Tag

opaque type _GStaticPrivate = CStruct1[guint]
object _GStaticPrivate:
  given _tag: Tag[_GStaticPrivate] = Tag.materializeCStruct1Tag[guint]
  def apply()(using Zone): Ptr[_GStaticPrivate] = scala.scalanative.unsafe.alloc[_GStaticPrivate](1)
  def apply(index : guint)(using Zone): Ptr[_GStaticPrivate] = 
    val ____ptr = apply()
    (!____ptr).index = index
    ____ptr
  extension (struct: _GStaticPrivate)
    def index : guint = struct._1
    def index_=(value: guint): Unit = !struct.at1 = value

opaque type _GStaticRWLock = CStruct7[GStaticMutex, Ptr[GCond], Ptr[GCond], guint, gboolean, guint, guint]
object _GStaticRWLock:
  given _tag: Tag[_GStaticRWLock] = Tag.materializeCStruct7Tag[GStaticMutex, Ptr[GCond], Ptr[GCond], guint, gboolean, guint, guint]
  def apply()(using Zone): Ptr[_GStaticRWLock] = scala.scalanative.unsafe.alloc[_GStaticRWLock](1)
  def apply(mutex : GStaticMutex, read_cond : Ptr[GCond], write_cond : Ptr[GCond], read_counter : guint, have_writer : gboolean, want_to_read : guint, want_to_write : guint)(using Zone): Ptr[_GStaticRWLock] = 
    val ____ptr = apply()
    (!____ptr).mutex = mutex
    (!____ptr).read_cond = read_cond
    (!____ptr).write_cond = write_cond
    (!____ptr).read_counter = read_counter
    (!____ptr).have_writer = have_writer
    (!____ptr).want_to_read = want_to_read
    (!____ptr).want_to_write = want_to_write
    ____ptr
  extension (struct: _GStaticRWLock)
    def mutex : GStaticMutex = struct._1
    def mutex_=(value: GStaticMutex): Unit = !struct.at1 = value
    def read_cond : Ptr[GCond] = struct._2
    def read_cond_=(value: Ptr[GCond]): Unit = !struct.at2 = value
    def write_cond : Ptr[GCond] = struct._3
    def write_cond_=(value: Ptr[GCond]): Unit = !struct.at3 = value
    def read_counter : guint = struct._4
    def read_counter_=(value: guint): Unit = !struct.at4 = value
    def have_writer : gboolean = struct._5
    def have_writer_=(value: gboolean): Unit = !struct.at5 = value
    def want_to_read : guint = struct._6
    def want_to_read_=(value: guint): Unit = !struct.at6 = value
    def want_to_write : guint = struct._7
    def want_to_write_=(value: guint): Unit = !struct.at7 = value

opaque type _GStaticRecMutex = CStruct3[GStaticMutex, guint, _GStaticRecMutex.Union0]
object _GStaticRecMutex:
  opaque type Union0 = CArray[Byte, Nat._8]
  object Union0:
    given _tag: Tag[Union0] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
    def apply()(using Zone): Ptr[Union0] = 
      val ___ptr = alloc[Union0](1)
      ___ptr
    @scala.annotation.targetName("apply_owner")
    def apply(owner: pthread_t)(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[pthread_t]].update(0, owner)
      ___ptr
    @scala.annotation.targetName("apply_dummy")
    def apply(dummy: gdouble)(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[gdouble]].update(0, dummy)
      ___ptr
    extension (struct: Union0)
      def owner : pthread_t = !struct.at(0).asInstanceOf[Ptr[pthread_t]]
      def owner_=(value: pthread_t): Unit = !struct.at(0).asInstanceOf[Ptr[pthread_t]] = value
      def dummy : gdouble = !struct.at(0).asInstanceOf[Ptr[gdouble]]
      def dummy_=(value: gdouble): Unit = !struct.at(0).asInstanceOf[Ptr[gdouble]] = value
  given _tag: Tag[_GStaticRecMutex] = Tag.materializeCStruct3Tag[GStaticMutex, guint, _GStaticRecMutex.Union0]
  def apply()(using Zone): Ptr[_GStaticRecMutex] = scala.scalanative.unsafe.alloc[_GStaticRecMutex](1)
  def apply(mutex : GStaticMutex, depth : guint, unused : _GStaticRecMutex.Union0)(using Zone): Ptr[_GStaticRecMutex] = 
    val ____ptr = apply()
    (!____ptr).mutex = mutex
    (!____ptr).depth = depth
    (!____ptr).unused = unused
    ____ptr
  extension (struct: _GStaticRecMutex)
    def mutex : GStaticMutex = struct._1
    def mutex_=(value: GStaticMutex): Unit = !struct.at1 = value
    def depth : guint = struct._2
    def depth_=(value: guint): Unit = !struct.at2 = value
    def unused : _GStaticRecMutex.Union0 = struct._3
    def unused_=(value: _GStaticRecMutex.Union0): Unit = !struct.at3 = value

opaque type _GString = CStruct3[Ptr[gchar], gsize, gsize]
object _GString:
  given _tag: Tag[_GString] = Tag.materializeCStruct3Tag[Ptr[gchar], gsize, gsize]
  def apply()(using Zone): Ptr[_GString] = scala.scalanative.unsafe.alloc[_GString](1)
  def apply(str : Ptr[gchar], len : gsize, allocated_len : gsize)(using Zone): Ptr[_GString] = 
    val ____ptr = apply()
    (!____ptr).str = str
    (!____ptr).len = len
    (!____ptr).allocated_len = allocated_len
    ____ptr
  extension (struct: _GString)
    def str : Ptr[gchar] = struct._1
    def str_=(value: Ptr[gchar]): Unit = !struct.at1 = value
    def len : gsize = struct._2
    def len_=(value: gsize): Unit = !struct.at2 = value
    def allocated_len : gsize = struct._3
    def allocated_len_=(value: gsize): Unit = !struct.at3 = value

opaque type _GStringChunk = CStruct0
object _GStringChunk:
  given _tag: Tag[_GStringChunk] = Tag.materializeCStruct0Tag

opaque type _GStrvBuilder = CStruct0
object _GStrvBuilder:
  given _tag: Tag[_GStrvBuilder] = Tag.materializeCStruct0Tag

opaque type _GThread = CStruct4[GThreadFunc, gpointer, gboolean, GThreadPriority]
object _GThread:
  given _tag: Tag[_GThread] = Tag.materializeCStruct4Tag[GThreadFunc, gpointer, gboolean, GThreadPriority]
  def apply()(using Zone): Ptr[_GThread] = scala.scalanative.unsafe.alloc[_GThread](1)
  def apply(func : GThreadFunc, data : gpointer, joinable : gboolean, priority : GThreadPriority)(using Zone): Ptr[_GThread] = 
    val ____ptr = apply()
    (!____ptr).func = func
    (!____ptr).data = data
    (!____ptr).joinable = joinable
    (!____ptr).priority = priority
    ____ptr
  extension (struct: _GThread)
    def func : GThreadFunc = struct._1
    def func_=(value: GThreadFunc): Unit = !struct.at1 = value
    def data : gpointer = struct._2
    def data_=(value: gpointer): Unit = !struct.at2 = value
    def joinable : gboolean = struct._3
    def joinable_=(value: gboolean): Unit = !struct.at3 = value
    def priority : GThreadPriority = struct._4
    def priority_=(value: GThreadPriority): Unit = !struct.at4 = value

opaque type _GThreadFunctions = CStruct21[CFuncPtr0[Ptr[GMutex]], CFuncPtr1[Ptr[GMutex], Unit], CFuncPtr1[Ptr[GMutex], gboolean], CFuncPtr1[Ptr[GMutex], Unit], CFuncPtr1[Ptr[GMutex], Unit], CFuncPtr0[Ptr[GCond]], CFuncPtr1[Ptr[GCond], Unit], CFuncPtr1[Ptr[GCond], Unit], CFuncPtr2[Ptr[GCond], Ptr[GMutex], Unit], CFuncPtr3[Ptr[GCond], Ptr[GMutex], Ptr[GTimeVal], gboolean], CFuncPtr1[Ptr[GCond], Unit], CFuncPtr1[GDestroyNotify, Ptr[GPrivate]], CFuncPtr1[Ptr[GPrivate], gpointer], CFuncPtr2[Ptr[GPrivate], gpointer, Unit], CFuncPtr8[GThreadFunc, gpointer, gulong, gboolean, gboolean, GThreadPriority, gpointer, Ptr[Ptr[GError]], Unit], CFuncPtr0[Unit], CFuncPtr1[gpointer, Unit], CFuncPtr0[Unit], CFuncPtr2[gpointer, GThreadPriority, Unit], CFuncPtr1[gpointer, Unit], CFuncPtr2[gpointer, gpointer, gboolean]]
object _GThreadFunctions:
  given _tag: Tag[_GThreadFunctions] = Tag.materializeCStruct21Tag[CFuncPtr0[Ptr[GMutex]], CFuncPtr1[Ptr[GMutex], Unit], CFuncPtr1[Ptr[GMutex], gboolean], CFuncPtr1[Ptr[GMutex], Unit], CFuncPtr1[Ptr[GMutex], Unit], CFuncPtr0[Ptr[GCond]], CFuncPtr1[Ptr[GCond], Unit], CFuncPtr1[Ptr[GCond], Unit], CFuncPtr2[Ptr[GCond], Ptr[GMutex], Unit], CFuncPtr3[Ptr[GCond], Ptr[GMutex], Ptr[GTimeVal], gboolean], CFuncPtr1[Ptr[GCond], Unit], CFuncPtr1[GDestroyNotify, Ptr[GPrivate]], CFuncPtr1[Ptr[GPrivate], gpointer], CFuncPtr2[Ptr[GPrivate], gpointer, Unit], CFuncPtr8[GThreadFunc, gpointer, gulong, gboolean, gboolean, GThreadPriority, gpointer, Ptr[Ptr[GError]], Unit], CFuncPtr0[Unit], CFuncPtr1[gpointer, Unit], CFuncPtr0[Unit], CFuncPtr2[gpointer, GThreadPriority, Unit], CFuncPtr1[gpointer, Unit], CFuncPtr2[gpointer, gpointer, gboolean]]
  def apply()(using Zone): Ptr[_GThreadFunctions] = scala.scalanative.unsafe.alloc[_GThreadFunctions](1)
  def apply(mutex_new : CFuncPtr0[Ptr[GMutex]], mutex_lock : CFuncPtr1[Ptr[GMutex], Unit], mutex_trylock : CFuncPtr1[Ptr[GMutex], gboolean], mutex_unlock : CFuncPtr1[Ptr[GMutex], Unit], mutex_free : CFuncPtr1[Ptr[GMutex], Unit], cond_new : CFuncPtr0[Ptr[GCond]], cond_signal : CFuncPtr1[Ptr[GCond], Unit], cond_broadcast : CFuncPtr1[Ptr[GCond], Unit], cond_wait : CFuncPtr2[Ptr[GCond], Ptr[GMutex], Unit], cond_timed_wait : CFuncPtr3[Ptr[GCond], Ptr[GMutex], Ptr[GTimeVal], gboolean], cond_free : CFuncPtr1[Ptr[GCond], Unit], private_new : CFuncPtr1[GDestroyNotify, Ptr[GPrivate]], private_get : CFuncPtr1[Ptr[GPrivate], gpointer], private_set : CFuncPtr2[Ptr[GPrivate], gpointer, Unit], thread_create : CFuncPtr8[GThreadFunc, gpointer, gulong, gboolean, gboolean, GThreadPriority, gpointer, Ptr[Ptr[GError]], Unit], thread_yield : CFuncPtr0[Unit], thread_join : CFuncPtr1[gpointer, Unit], thread_exit : CFuncPtr0[Unit], thread_set_priority : CFuncPtr2[gpointer, GThreadPriority, Unit], thread_self : CFuncPtr1[gpointer, Unit], thread_equal : CFuncPtr2[gpointer, gpointer, gboolean])(using Zone): Ptr[_GThreadFunctions] = 
    val ____ptr = apply()
    (!____ptr).mutex_new = mutex_new
    (!____ptr).mutex_lock = mutex_lock
    (!____ptr).mutex_trylock = mutex_trylock
    (!____ptr).mutex_unlock = mutex_unlock
    (!____ptr).mutex_free = mutex_free
    (!____ptr).cond_new = cond_new
    (!____ptr).cond_signal = cond_signal
    (!____ptr).cond_broadcast = cond_broadcast
    (!____ptr).cond_wait = cond_wait
    (!____ptr).cond_timed_wait = cond_timed_wait
    (!____ptr).cond_free = cond_free
    (!____ptr).private_new = private_new
    (!____ptr).private_get = private_get
    (!____ptr).private_set = private_set
    (!____ptr).thread_create = thread_create
    (!____ptr).thread_yield = thread_yield
    (!____ptr).thread_join = thread_join
    (!____ptr).thread_exit = thread_exit
    (!____ptr).thread_set_priority = thread_set_priority
    (!____ptr).thread_self = thread_self
    (!____ptr).thread_equal = thread_equal
    ____ptr
  extension (struct: _GThreadFunctions)
    def mutex_new : CFuncPtr0[Ptr[GMutex]] = struct._1
    def mutex_new_=(value: CFuncPtr0[Ptr[GMutex]]): Unit = !struct.at1 = value
    def mutex_lock : CFuncPtr1[Ptr[GMutex], Unit] = struct._2
    def mutex_lock_=(value: CFuncPtr1[Ptr[GMutex], Unit]): Unit = !struct.at2 = value
    def mutex_trylock : CFuncPtr1[Ptr[GMutex], gboolean] = struct._3
    def mutex_trylock_=(value: CFuncPtr1[Ptr[GMutex], gboolean]): Unit = !struct.at3 = value
    def mutex_unlock : CFuncPtr1[Ptr[GMutex], Unit] = struct._4
    def mutex_unlock_=(value: CFuncPtr1[Ptr[GMutex], Unit]): Unit = !struct.at4 = value
    def mutex_free : CFuncPtr1[Ptr[GMutex], Unit] = struct._5
    def mutex_free_=(value: CFuncPtr1[Ptr[GMutex], Unit]): Unit = !struct.at5 = value
    def cond_new : CFuncPtr0[Ptr[GCond]] = struct._6
    def cond_new_=(value: CFuncPtr0[Ptr[GCond]]): Unit = !struct.at6 = value
    def cond_signal : CFuncPtr1[Ptr[GCond], Unit] = struct._7
    def cond_signal_=(value: CFuncPtr1[Ptr[GCond], Unit]): Unit = !struct.at7 = value
    def cond_broadcast : CFuncPtr1[Ptr[GCond], Unit] = struct._8
    def cond_broadcast_=(value: CFuncPtr1[Ptr[GCond], Unit]): Unit = !struct.at8 = value
    def cond_wait : CFuncPtr2[Ptr[GCond], Ptr[GMutex], Unit] = struct._9
    def cond_wait_=(value: CFuncPtr2[Ptr[GCond], Ptr[GMutex], Unit]): Unit = !struct.at9 = value
    def cond_timed_wait : CFuncPtr3[Ptr[GCond], Ptr[GMutex], Ptr[GTimeVal], gboolean] = struct._10
    def cond_timed_wait_=(value: CFuncPtr3[Ptr[GCond], Ptr[GMutex], Ptr[GTimeVal], gboolean]): Unit = !struct.at10 = value
    def cond_free : CFuncPtr1[Ptr[GCond], Unit] = struct._11
    def cond_free_=(value: CFuncPtr1[Ptr[GCond], Unit]): Unit = !struct.at11 = value
    def private_new : CFuncPtr1[GDestroyNotify, Ptr[GPrivate]] = struct._12
    def private_new_=(value: CFuncPtr1[GDestroyNotify, Ptr[GPrivate]]): Unit = !struct.at12 = value
    def private_get : CFuncPtr1[Ptr[GPrivate], gpointer] = struct._13
    def private_get_=(value: CFuncPtr1[Ptr[GPrivate], gpointer]): Unit = !struct.at13 = value
    def private_set : CFuncPtr2[Ptr[GPrivate], gpointer, Unit] = struct._14
    def private_set_=(value: CFuncPtr2[Ptr[GPrivate], gpointer, Unit]): Unit = !struct.at14 = value
    def thread_create : CFuncPtr8[GThreadFunc, gpointer, gulong, gboolean, gboolean, GThreadPriority, gpointer, Ptr[Ptr[GError]], Unit] = struct._15
    def thread_create_=(value: CFuncPtr8[GThreadFunc, gpointer, gulong, gboolean, gboolean, GThreadPriority, gpointer, Ptr[Ptr[GError]], Unit]): Unit = !struct.at15 = value
    def thread_yield : CFuncPtr0[Unit] = struct._16
    def thread_yield_=(value: CFuncPtr0[Unit]): Unit = !struct.at16 = value
    def thread_join : CFuncPtr1[gpointer, Unit] = struct._17
    def thread_join_=(value: CFuncPtr1[gpointer, Unit]): Unit = !struct.at17 = value
    def thread_exit : CFuncPtr0[Unit] = struct._18
    def thread_exit_=(value: CFuncPtr0[Unit]): Unit = !struct.at18 = value
    def thread_set_priority : CFuncPtr2[gpointer, GThreadPriority, Unit] = struct._19
    def thread_set_priority_=(value: CFuncPtr2[gpointer, GThreadPriority, Unit]): Unit = !struct.at19 = value
    def thread_self : CFuncPtr1[gpointer, Unit] = struct._20
    def thread_self_=(value: CFuncPtr1[gpointer, Unit]): Unit = !struct.at20 = value
    def thread_equal : CFuncPtr2[gpointer, gpointer, gboolean] = struct._21
    def thread_equal_=(value: CFuncPtr2[gpointer, gpointer, gboolean]): Unit = !struct.at21 = value

opaque type _GThreadPool = CStruct3[GFunc, gpointer, gboolean]
object _GThreadPool:
  given _tag: Tag[_GThreadPool] = Tag.materializeCStruct3Tag[GFunc, gpointer, gboolean]
  def apply()(using Zone): Ptr[_GThreadPool] = scala.scalanative.unsafe.alloc[_GThreadPool](1)
  def apply(func : GFunc, user_data : gpointer, exclusive : gboolean)(using Zone): Ptr[_GThreadPool] = 
    val ____ptr = apply()
    (!____ptr).func = func
    (!____ptr).user_data = user_data
    (!____ptr).exclusive = exclusive
    ____ptr
  extension (struct: _GThreadPool)
    def func : GFunc = struct._1
    def func_=(value: GFunc): Unit = !struct.at1 = value
    def user_data : gpointer = struct._2
    def user_data_=(value: gpointer): Unit = !struct.at2 = value
    def exclusive : gboolean = struct._3
    def exclusive_=(value: gboolean): Unit = !struct.at3 = value

opaque type _GTimeVal = CStruct2[glong, glong]
object _GTimeVal:
  given _tag: Tag[_GTimeVal] = Tag.materializeCStruct2Tag[glong, glong]
  def apply()(using Zone): Ptr[_GTimeVal] = scala.scalanative.unsafe.alloc[_GTimeVal](1)
  def apply(tv_sec : glong, tv_usec : glong)(using Zone): Ptr[_GTimeVal] = 
    val ____ptr = apply()
    (!____ptr).tv_sec = tv_sec
    (!____ptr).tv_usec = tv_usec
    ____ptr
  extension (struct: _GTimeVal)
    def tv_sec : glong = struct._1
    def tv_sec_=(value: glong): Unit = !struct.at1 = value
    def tv_usec : glong = struct._2
    def tv_usec_=(value: glong): Unit = !struct.at2 = value

opaque type _GTimeZone = CStruct0
object _GTimeZone:
  given _tag: Tag[_GTimeZone] = Tag.materializeCStruct0Tag

opaque type _GTimer = CStruct0
object _GTimer:
  given _tag: Tag[_GTimer] = Tag.materializeCStruct0Tag

opaque type _GTrashStack = CStruct1[Ptr[Byte]]
object _GTrashStack:
  given _tag: Tag[_GTrashStack] = Tag.materializeCStruct1Tag[Ptr[Byte]]
  def apply()(using Zone): Ptr[_GTrashStack] = scala.scalanative.unsafe.alloc[_GTrashStack](1)
  def apply(next : Ptr[GTrashStack])(using Zone): Ptr[_GTrashStack] = 
    val ____ptr = apply()
    (!____ptr).next = next
    ____ptr
  extension (struct: _GTrashStack)
    def next : Ptr[GTrashStack] = struct._1.asInstanceOf[Ptr[GTrashStack]]
    def next_=(value: Ptr[GTrashStack]): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]

opaque type _GTree = CStruct0
object _GTree:
  given _tag: Tag[_GTree] = Tag.materializeCStruct0Tag

opaque type _GTreeNode = CStruct0
object _GTreeNode:
  given _tag: Tag[_GTreeNode] = Tag.materializeCStruct0Tag

opaque type _GTuples = CStruct1[guint]
object _GTuples:
  given _tag: Tag[_GTuples] = Tag.materializeCStruct1Tag[guint]
  def apply()(using Zone): Ptr[_GTuples] = scala.scalanative.unsafe.alloc[_GTuples](1)
  def apply(len : guint)(using Zone): Ptr[_GTuples] = 
    val ____ptr = apply()
    (!____ptr).len = len
    ____ptr
  extension (struct: _GTuples)
    def len : guint = struct._1
    def len_=(value: guint): Unit = !struct.at1 = value

opaque type _GUri = CStruct0
object _GUri:
  given _tag: Tag[_GUri] = Tag.materializeCStruct0Tag

opaque type _GUriParamsIter = CStruct4[gint, gpointer, gpointer, CArray[guint8, Nat.Digit3[Nat._2, Nat._5, Nat._6]]]
object _GUriParamsIter:
  given _tag: Tag[_GUriParamsIter] = Tag.materializeCStruct4Tag[gint, gpointer, gpointer, CArray[guint8, Nat.Digit3[Nat._2, Nat._5, Nat._6]]]
  def apply()(using Zone): Ptr[_GUriParamsIter] = scala.scalanative.unsafe.alloc[_GUriParamsIter](1)
  def apply(dummy0 : gint, dummy1 : gpointer, dummy2 : gpointer, dummy3 : CArray[guint8, Nat.Digit3[Nat._2, Nat._5, Nat._6]])(using Zone): Ptr[_GUriParamsIter] = 
    val ____ptr = apply()
    (!____ptr).dummy0 = dummy0
    (!____ptr).dummy1 = dummy1
    (!____ptr).dummy2 = dummy2
    (!____ptr).dummy3 = dummy3
    ____ptr
  extension (struct: _GUriParamsIter)
    def dummy0 : gint = struct._1
    def dummy0_=(value: gint): Unit = !struct.at1 = value
    def dummy1 : gpointer = struct._2
    def dummy1_=(value: gpointer): Unit = !struct.at2 = value
    def dummy2 : gpointer = struct._3
    def dummy2_=(value: gpointer): Unit = !struct.at3 = value
    def dummy3 : CArray[guint8, Nat.Digit3[Nat._2, Nat._5, Nat._6]] = struct._4
    def dummy3_=(value: CArray[guint8, Nat.Digit3[Nat._2, Nat._5, Nat._6]]): Unit = !struct.at4 = value

opaque type _GVariant = CStruct0
object _GVariant:
  given _tag: Tag[_GVariant] = Tag.materializeCStruct0Tag

opaque type _GVariantBuilder = CStruct1[_GVariantBuilder.Union0]
object _GVariantBuilder:
  opaque type Union0 = CArray[Byte, Nat.Digit3[Nat._1, Nat._2, Nat._8]]
  object Union0:
    opaque type Struct0 = CStruct3[gsize, Ptr[GVariantType], CArray[guintptr, Nat.Digit2[Nat._1, Nat._4]]]
    object Struct0:
      given _tag: Tag[Struct0] = Tag.materializeCStruct3Tag[gsize, Ptr[GVariantType], CArray[guintptr, Nat.Digit2[Nat._1, Nat._4]]]
      def apply()(using Zone): Ptr[Struct0] = scala.scalanative.unsafe.alloc[Struct0](1)
      def apply(partial_magic : gsize, `type` : Ptr[GVariantType], y : CArray[guintptr, Nat.Digit2[Nat._1, Nat._4]])(using Zone): Ptr[Struct0] = 
        val ____ptr = apply()
        (!____ptr).partial_magic = partial_magic
        (!____ptr).`type` = `type`
        (!____ptr).y = y
        ____ptr
      extension (struct: Struct0)
        def partial_magic : gsize = struct._1
        def partial_magic_=(value: gsize): Unit = !struct.at1 = value
        def `type` : Ptr[GVariantType] = struct._2
        def type_=(value: Ptr[GVariantType]): Unit = !struct.at2 = value
        def y : CArray[guintptr, Nat.Digit2[Nat._1, Nat._4]] = struct._3
        def y_=(value: CArray[guintptr, Nat.Digit2[Nat._1, Nat._4]]): Unit = !struct.at3 = value
    given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]](Tag.Byte, Tag.Digit3[Nat._1, Nat._2, Nat._8](Tag.Nat1, Tag.Nat2, Tag.Nat8))
    def apply()(using Zone): Ptr[Union0] = 
      val ___ptr = alloc[Union0](1)
      ___ptr
    @scala.annotation.targetName("apply_s")
    def apply(s: _GVariantBuilder.Union0.Struct0)(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[_GVariantBuilder.Union0.Struct0]].update(0, s)
      ___ptr
    @scala.annotation.targetName("apply_x")
    def apply(x: CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]])(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]]].update(0, x)
      ___ptr
    extension (struct: Union0)
      def s : _GVariantBuilder.Union0.Struct0 = !struct.at(0).asInstanceOf[Ptr[_GVariantBuilder.Union0.Struct0]]
      def s_=(value: _GVariantBuilder.Union0.Struct0): Unit = !struct.at(0).asInstanceOf[Ptr[_GVariantBuilder.Union0.Struct0]] = value
      def x : CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]] = !struct.at(0).asInstanceOf[Ptr[CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]]]
      def x_=(value: CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]]] = value
  given _tag: Tag[_GVariantBuilder] = Tag.materializeCStruct1Tag[_GVariantBuilder.Union0]
  def apply()(using Zone): Ptr[_GVariantBuilder] = scala.scalanative.unsafe.alloc[_GVariantBuilder](1)
  def apply(u : _GVariantBuilder.Union0)(using Zone): Ptr[_GVariantBuilder] = 
    val ____ptr = apply()
    (!____ptr).u = u
    ____ptr
  extension (struct: _GVariantBuilder)
    def u : _GVariantBuilder.Union0 = struct._1
    def u_=(value: _GVariantBuilder.Union0): Unit = !struct.at1 = value

opaque type _GVariantDict = CStruct1[_GVariantDict.Union0]
object _GVariantDict:
  opaque type Union0 = CArray[Byte, Nat.Digit3[Nat._1, Nat._2, Nat._8]]
  object Union0:
    opaque type Struct0 = CStruct3[Ptr[GVariant], gsize, CArray[guintptr, Nat.Digit2[Nat._1, Nat._4]]]
    object Struct0:
      given _tag: Tag[Struct0] = Tag.materializeCStruct3Tag[Ptr[GVariant], gsize, CArray[guintptr, Nat.Digit2[Nat._1, Nat._4]]]
      def apply()(using Zone): Ptr[Struct0] = scala.scalanative.unsafe.alloc[Struct0](1)
      def apply(asv : Ptr[GVariant], partial_magic : gsize, y : CArray[guintptr, Nat.Digit2[Nat._1, Nat._4]])(using Zone): Ptr[Struct0] = 
        val ____ptr = apply()
        (!____ptr).asv = asv
        (!____ptr).partial_magic = partial_magic
        (!____ptr).y = y
        ____ptr
      extension (struct: Struct0)
        def asv : Ptr[GVariant] = struct._1
        def asv_=(value: Ptr[GVariant]): Unit = !struct.at1 = value
        def partial_magic : gsize = struct._2
        def partial_magic_=(value: gsize): Unit = !struct.at2 = value
        def y : CArray[guintptr, Nat.Digit2[Nat._1, Nat._4]] = struct._3
        def y_=(value: CArray[guintptr, Nat.Digit2[Nat._1, Nat._4]]): Unit = !struct.at3 = value
    given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]](Tag.Byte, Tag.Digit3[Nat._1, Nat._2, Nat._8](Tag.Nat1, Tag.Nat2, Tag.Nat8))
    def apply()(using Zone): Ptr[Union0] = 
      val ___ptr = alloc[Union0](1)
      ___ptr
    @scala.annotation.targetName("apply_s")
    def apply(s: _GVariantDict.Union0.Struct0)(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[_GVariantDict.Union0.Struct0]].update(0, s)
      ___ptr
    @scala.annotation.targetName("apply_x")
    def apply(x: CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]])(using Zone): Ptr[Union0] =
      val ___ptr = alloc[Union0](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]]].update(0, x)
      ___ptr
    extension (struct: Union0)
      def s : _GVariantDict.Union0.Struct0 = !struct.at(0).asInstanceOf[Ptr[_GVariantDict.Union0.Struct0]]
      def s_=(value: _GVariantDict.Union0.Struct0): Unit = !struct.at(0).asInstanceOf[Ptr[_GVariantDict.Union0.Struct0]] = value
      def x : CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]] = !struct.at(0).asInstanceOf[Ptr[CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]]]
      def x_=(value: CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]]] = value
  given _tag: Tag[_GVariantDict] = Tag.materializeCStruct1Tag[_GVariantDict.Union0]
  def apply()(using Zone): Ptr[_GVariantDict] = scala.scalanative.unsafe.alloc[_GVariantDict](1)
  def apply(u : _GVariantDict.Union0)(using Zone): Ptr[_GVariantDict] = 
    val ____ptr = apply()
    (!____ptr).u = u
    ____ptr
  extension (struct: _GVariantDict)
    def u : _GVariantDict.Union0 = struct._1
    def u_=(value: _GVariantDict.Union0): Unit = !struct.at1 = value

opaque type _GVariantIter = CStruct1[CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]]
object _GVariantIter:
  given _tag: Tag[_GVariantIter] = Tag.materializeCStruct1Tag[CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]]
  def apply()(using Zone): Ptr[_GVariantIter] = scala.scalanative.unsafe.alloc[_GVariantIter](1)
  def apply(x : CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]])(using Zone): Ptr[_GVariantIter] = 
    val ____ptr = apply()
    (!____ptr).x = x
    ____ptr
  extension (struct: _GVariantIter)
    def x : CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]] = struct._1
    def x_=(value: CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]): Unit = !struct.at1 = value

opaque type _GVariantType = CStruct0
object _GVariantType:
  given _tag: Tag[_GVariantType] = Tag.materializeCStruct0Tag