package sn.gnome.pango.internal

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoAnalysis: _engine: unused, reserved _engine: unused, reserved : the font for this segment. : the bidirectional level for this segment. : the glyph orientation for this segment (A `PangoGravity`). : boolean flags for this segment (Since: 1.16). : the detected script for this segment (A `PangoScript`) (Since: 1.18). : the detected language for this segment. _attrs: extra attributes for this segment.
*/
opaque type PangoAnalysis = CStruct9[Ptr[PangoEngineShape], Ptr[PangoEngineLang], Ptr[PangoFont], _root_.sn.gnome.glib.internal.guint8, _root_.sn.gnome.glib.internal.guint8, _root_.sn.gnome.glib.internal.guint8, _root_.sn.gnome.glib.internal.guint8, Ptr[PangoLanguage], Ptr[Byte]]
object PangoAnalysis:
  given _tag: Tag[PangoAnalysis] = Tag.materializeCStruct9Tag[Ptr[PangoEngineShape], Ptr[PangoEngineLang], Ptr[PangoFont], _root_.sn.gnome.glib.internal.guint8, _root_.sn.gnome.glib.internal.guint8, _root_.sn.gnome.glib.internal.guint8, _root_.sn.gnome.glib.internal.guint8, Ptr[PangoLanguage], Ptr[Byte]]
  def apply()(using Zone): Ptr[PangoAnalysis] = scala.scalanative.unsafe.alloc[PangoAnalysis](1)
  def apply(shape_engine : Ptr[PangoEngineShape], lang_engine : Ptr[PangoEngineLang], font : Ptr[PangoFont], level : _root_.sn.gnome.glib.internal.guint8, gravity : _root_.sn.gnome.glib.internal.guint8, flags : _root_.sn.gnome.glib.internal.guint8, script : _root_.sn.gnome.glib.internal.guint8, language : Ptr[PangoLanguage], extra_attrs : Ptr[_root_.sn.gnome.glib.internal.GSList])(using Zone): Ptr[PangoAnalysis] = 
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
    def level : _root_.sn.gnome.glib.internal.guint8 = struct._4
    def level_=(value: _root_.sn.gnome.glib.internal.guint8): Unit = !struct.at4 = value
    def gravity : _root_.sn.gnome.glib.internal.guint8 = struct._5
    def gravity_=(value: _root_.sn.gnome.glib.internal.guint8): Unit = !struct.at5 = value
    def flags : _root_.sn.gnome.glib.internal.guint8 = struct._6
    def flags_=(value: _root_.sn.gnome.glib.internal.guint8): Unit = !struct.at6 = value
    def script : _root_.sn.gnome.glib.internal.guint8 = struct._7
    def script_=(value: _root_.sn.gnome.glib.internal.guint8): Unit = !struct.at7 = value
    def language : Ptr[PangoLanguage] = struct._8
    def language_=(value: Ptr[PangoLanguage]): Unit = !struct.at8 = value
    def extra_attrs : Ptr[_root_.sn.gnome.glib.internal.GSList] = struct._9.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GSList]]
    def extra_attrs_=(value: Ptr[_root_.sn.gnome.glib.internal.GSList]): Unit = !struct.at9 = value.asInstanceOf[Ptr[Byte]]

/**
 * PangoAttrClass: : the type ID for this attribute : function to duplicate an attribute of this type (see [method.Attribute.copy]) : function to free an attribute of this type (see [method.Attribute.destroy]) : function to check two attributes of this type for equality (see [method.Attribute.equal])
*/
opaque type PangoAttrClass = CStruct4[PangoAttrType, CFuncPtr1[Ptr[Byte], Ptr[Byte]], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr2[Ptr[Byte], Ptr[Byte], _root_.sn.gnome.glib.internal.gboolean]]
object PangoAttrClass:
  given _tag: Tag[PangoAttrClass] = Tag.materializeCStruct4Tag[PangoAttrType, CFuncPtr1[Ptr[Byte], Ptr[Byte]], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr2[Ptr[Byte], Ptr[Byte], _root_.sn.gnome.glib.internal.gboolean]]
  def apply()(using Zone): Ptr[PangoAttrClass] = scala.scalanative.unsafe.alloc[PangoAttrClass](1)
  def apply(`type` : PangoAttrType, copy : CFuncPtr1[Ptr[PangoAttribute], Ptr[PangoAttribute]], destroy : CFuncPtr1[Ptr[PangoAttribute], Unit], equal : CFuncPtr2[Ptr[PangoAttribute], Ptr[PangoAttribute], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[PangoAttrClass] = 
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
    def equal : CFuncPtr2[Ptr[PangoAttribute], Ptr[PangoAttribute], _root_.sn.gnome.glib.internal.gboolean] = struct._4.asInstanceOf[CFuncPtr2[Ptr[PangoAttribute], Ptr[PangoAttribute], _root_.sn.gnome.glib.internal.gboolean]]
    def equal_=(value: CFuncPtr2[Ptr[PangoAttribute], Ptr[PangoAttribute], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at4 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], Ptr[Byte], _root_.sn.gnome.glib.internal.gboolean]]

/**
 * PangoAttrColor: : the common portion of the attribute : the `PangoColor` which is the value of the attribute
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
*/
opaque type PangoAttrFontFeatures = CStruct2[PangoAttribute, Ptr[_root_.sn.gnome.glib.internal.gchar]]
object PangoAttrFontFeatures:
  given _tag: Tag[PangoAttrFontFeatures] = Tag.materializeCStruct2Tag[PangoAttribute, Ptr[_root_.sn.gnome.glib.internal.gchar]]
  def apply()(using Zone): Ptr[PangoAttrFontFeatures] = scala.scalanative.unsafe.alloc[PangoAttrFontFeatures](1)
  def apply(attr : PangoAttribute, features : Ptr[_root_.sn.gnome.glib.internal.gchar])(using Zone): Ptr[PangoAttrFontFeatures] = 
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).features = features
    ____ptr
  extension (struct: PangoAttrFontFeatures)
    def attr : PangoAttribute = struct._1
    def attr_=(value: PangoAttribute): Unit = !struct.at1 = value
    def features : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
    def features_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at2 = value

/**
 * PangoAttrInt: : the common portion of the attribute : the value of the attribute
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

opaque type PangoAttrIterator = CStruct0
object PangoAttrIterator:
  given _tag: Tag[PangoAttrIterator] = Tag.materializeCStruct0Tag

/**
 * PangoAttrLanguage: : the common portion of the attribute : the `PangoLanguage` which is the value of the attribute
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

opaque type PangoAttrList = CStruct0
object PangoAttrList:
  given _tag: Tag[PangoAttrList] = Tag.materializeCStruct0Tag

/**
 * PangoAttrShape: : the common portion of the attribute
*/
opaque type PangoAttrShape = CStruct6[PangoAttribute, PangoRectangle, PangoRectangle, _root_.sn.gnome.glib.internal.gpointer, PangoAttrDataCopyFunc, _root_.sn.gnome.glib.internal.GDestroyNotify]
object PangoAttrShape:
  given _tag: Tag[PangoAttrShape] = Tag.materializeCStruct6Tag[PangoAttribute, PangoRectangle, PangoRectangle, _root_.sn.gnome.glib.internal.gpointer, PangoAttrDataCopyFunc, _root_.sn.gnome.glib.internal.GDestroyNotify]
  def apply()(using Zone): Ptr[PangoAttrShape] = scala.scalanative.unsafe.alloc[PangoAttrShape](1)
  def apply(attr : PangoAttribute, ink_rect : PangoRectangle, logical_rect : PangoRectangle, data : _root_.sn.gnome.glib.internal.gpointer, copy_func : PangoAttrDataCopyFunc, destroy_func : _root_.sn.gnome.glib.internal.GDestroyNotify)(using Zone): Ptr[PangoAttrShape] = 
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
    def data : _root_.sn.gnome.glib.internal.gpointer = struct._4
    def data_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at4 = value
    def copy_func : PangoAttrDataCopyFunc = struct._5
    def copy_func_=(value: PangoAttrDataCopyFunc): Unit = !struct.at5 = value
    def destroy_func : _root_.sn.gnome.glib.internal.GDestroyNotify = struct._6
    def destroy_func_=(value: _root_.sn.gnome.glib.internal.GDestroyNotify): Unit = !struct.at6 = value

/**
 * PangoAttrSize: : the common portion of the attribute : size of font, in units of 1/%PANGO_SCALE of a point (for %PANGO_ATTR_SIZE) or of a device unit (for %PANGO_ATTR_ABSOLUTE_SIZE) : whether the font size is in device units or points. This field is only present for compatibility with Pango-1.8.0 (%PANGO_ATTR_ABSOLUTE_SIZE was added in 1.8.1); and always will be %FALSE for %PANGO_ATTR_SIZE and %TRUE for %PANGO_ATTR_ABSOLUTE_SIZE.
*/
opaque type PangoAttrSize = CStruct3[PangoAttribute, CInt, _root_.sn.gnome.glib.internal.guint]
object PangoAttrSize:
  given _tag: Tag[PangoAttrSize] = Tag.materializeCStruct3Tag[PangoAttribute, CInt, _root_.sn.gnome.glib.internal.guint]
  def apply()(using Zone): Ptr[PangoAttrSize] = scala.scalanative.unsafe.alloc[PangoAttrSize](1)
  def apply(attr : PangoAttribute, size : CInt, absolute : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[PangoAttrSize] = 
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
    def absolute : _root_.sn.gnome.glib.internal.guint = struct._3
    def absolute_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at3 = value

/**
 * PangoAttrString: : the common portion of the attribute : the string which is the value of the attribute
*/
opaque type PangoAttrString = CStruct2[PangoAttribute, Ptr[CUnsignedChar]]
object PangoAttrString:
  given _tag: Tag[PangoAttrString] = Tag.materializeCStruct2Tag[PangoAttribute, Ptr[CUnsignedChar]]
  def apply()(using Zone): Ptr[PangoAttrString] = scala.scalanative.unsafe.alloc[PangoAttrString](1)
  def apply(attr : PangoAttribute, value : Ptr[CUnsignedChar])(using Zone): Ptr[PangoAttrString] = 
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).value = value
    ____ptr
  extension (struct: PangoAttrString)
    def attr : PangoAttribute = struct._1
    def attr_=(value: PangoAttribute): Unit = !struct.at1 = value
    def value : Ptr[CUnsignedChar] = struct._2
    def value_=(value: Ptr[CUnsignedChar]): Unit = !struct.at2 = value

/**
 * PangoAttribute: _index: the start index of the range (in bytes). _index: end index of the range (in bytes). The character at this index is not included in the range.
*/
opaque type PangoAttribute = CStruct3[Ptr[Byte], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
object PangoAttribute:
  given _tag: Tag[PangoAttribute] = Tag.materializeCStruct3Tag[Ptr[Byte], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
  def apply()(using Zone): Ptr[PangoAttribute] = scala.scalanative.unsafe.alloc[PangoAttribute](1)
  def apply(klass : Ptr[PangoAttrClass], start_index : _root_.sn.gnome.glib.internal.guint, end_index : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[PangoAttribute] = 
    val ____ptr = apply()
    (!____ptr).klass = klass
    (!____ptr).start_index = start_index
    (!____ptr).end_index = end_index
    ____ptr
  extension (struct: PangoAttribute)
    def klass : Ptr[PangoAttrClass] = struct._1.asInstanceOf[Ptr[PangoAttrClass]]
    def klass_=(value: Ptr[PangoAttrClass]): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
    def start_index : _root_.sn.gnome.glib.internal.guint = struct._2
    def start_index_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at2 = value
    def end_index : _root_.sn.gnome.glib.internal.guint = struct._3
    def end_index_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at3 = value

/**
 * PangoColor: : value of red component : value of green component : value of blue component
*/
opaque type PangoColor = CStruct3[_root_.sn.gnome.glib.internal.guint16, _root_.sn.gnome.glib.internal.guint16, _root_.sn.gnome.glib.internal.guint16]
object PangoColor:
  given _tag: Tag[PangoColor] = Tag.materializeCStruct3Tag[_root_.sn.gnome.glib.internal.guint16, _root_.sn.gnome.glib.internal.guint16, _root_.sn.gnome.glib.internal.guint16]
  def apply()(using Zone): Ptr[PangoColor] = scala.scalanative.unsafe.alloc[PangoColor](1)
  def apply(red : _root_.sn.gnome.glib.internal.guint16, green : _root_.sn.gnome.glib.internal.guint16, blue : _root_.sn.gnome.glib.internal.guint16)(using Zone): Ptr[PangoColor] = 
    val ____ptr = apply()
    (!____ptr).red = red
    (!____ptr).green = green
    (!____ptr).blue = blue
    ____ptr
  extension (struct: PangoColor)
    def red : _root_.sn.gnome.glib.internal.guint16 = struct._1
    def red_=(value: _root_.sn.gnome.glib.internal.guint16): Unit = !struct.at1 = value
    def green : _root_.sn.gnome.glib.internal.guint16 = struct._2
    def green_=(value: _root_.sn.gnome.glib.internal.guint16): Unit = !struct.at2 = value
    def blue : _root_.sn.gnome.glib.internal.guint16 = struct._3
    def blue_=(value: _root_.sn.gnome.glib.internal.guint16): Unit = !struct.at3 = value

opaque type PangoContext = CStruct0
object PangoContext:
  given _tag: Tag[PangoContext] = Tag.materializeCStruct0Tag

opaque type PangoContextClass = CStruct0
object PangoContextClass:
  given _tag: Tag[PangoContextClass] = Tag.materializeCStruct0Tag

opaque type PangoCoverage = CStruct0
object PangoCoverage:
  given _tag: Tag[PangoCoverage] = Tag.materializeCStruct0Tag

/**
 * PangoEngine:
*/
opaque type PangoEngine = CStruct1[_root_.sn.gnome.gobject.internal.GObject]
object PangoEngine:
  given _tag: Tag[PangoEngine] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObject]
  def apply()(using Zone): Ptr[PangoEngine] = scala.scalanative.unsafe.alloc[PangoEngine](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject)(using Zone): Ptr[PangoEngine] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: PangoEngine)
    def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
    def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = !struct.at1 = value

/**
 * PangoEngineClass:
*/
opaque type PangoEngineClass = CStruct1[_root_.sn.gnome.gobject.internal.GObjectClass]
object PangoEngineClass:
  given _tag: Tag[PangoEngineClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObjectClass]
  def apply()(using Zone): Ptr[PangoEngineClass] = scala.scalanative.unsafe.alloc[PangoEngineClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass)(using Zone): Ptr[PangoEngineClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: PangoEngineClass)
    def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at1 = value

/**
 * PangoEngineInfo: _type: a string identifying the engine type. _type: a string identifying the render type. : array of scripts this engine supports. _scripts: number of items in .
*/
opaque type PangoEngineInfo = CStruct5[Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[PangoEngineScriptInfo], _root_.sn.gnome.glib.internal.gint]
object PangoEngineInfo:
  given _tag: Tag[PangoEngineInfo] = Tag.materializeCStruct5Tag[Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[PangoEngineScriptInfo], _root_.sn.gnome.glib.internal.gint]
  def apply()(using Zone): Ptr[PangoEngineInfo] = scala.scalanative.unsafe.alloc[PangoEngineInfo](1)
  def apply(id : Ptr[_root_.sn.gnome.glib.internal.gchar], engine_type : Ptr[_root_.sn.gnome.glib.internal.gchar], render_type : Ptr[_root_.sn.gnome.glib.internal.gchar], scripts : Ptr[PangoEngineScriptInfo], n_scripts : _root_.sn.gnome.glib.internal.gint)(using Zone): Ptr[PangoEngineInfo] = 
    val ____ptr = apply()
    (!____ptr).id = id
    (!____ptr).engine_type = engine_type
    (!____ptr).render_type = render_type
    (!____ptr).scripts = scripts
    (!____ptr).n_scripts = n_scripts
    ____ptr
  extension (struct: PangoEngineInfo)
    def id : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._1
    def id_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at1 = value
    def engine_type : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
    def engine_type_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at2 = value
    def render_type : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._3
    def render_type_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at3 = value
    def scripts : Ptr[PangoEngineScriptInfo] = struct._4
    def scripts_=(value: Ptr[PangoEngineScriptInfo]): Unit = !struct.at4 = value
    def n_scripts : _root_.sn.gnome.glib.internal.gint = struct._5
    def n_scripts_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at5 = value

/**
 * PangoEngineLang:
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
*/
opaque type PangoEngineLangClass = CStruct2[PangoEngineClass, CFuncPtr6[Ptr[PangoEngineLang], Ptr[CUnsignedChar], CInt, Ptr[Byte], Ptr[PangoLogAttr], CInt, Unit]]
object PangoEngineLangClass:
  given _tag: Tag[PangoEngineLangClass] = Tag.materializeCStruct2Tag[PangoEngineClass, CFuncPtr6[Ptr[PangoEngineLang], Ptr[CUnsignedChar], CInt, Ptr[Byte], Ptr[PangoLogAttr], CInt, Unit]]
  def apply()(using Zone): Ptr[PangoEngineLangClass] = scala.scalanative.unsafe.alloc[PangoEngineLangClass](1)
  def apply(parent_class : PangoEngineClass, script_break : CFuncPtr6[Ptr[PangoEngineLang], Ptr[CUnsignedChar], CInt, Ptr[PangoAnalysis], Ptr[PangoLogAttr], CInt, Unit])(using Zone): Ptr[PangoEngineLangClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).script_break = script_break
    ____ptr
  extension (struct: PangoEngineLangClass)
    def parent_class : PangoEngineClass = struct._1
    def parent_class_=(value: PangoEngineClass): Unit = !struct.at1 = value
    def script_break : CFuncPtr6[Ptr[PangoEngineLang], Ptr[CUnsignedChar], CInt, Ptr[PangoAnalysis], Ptr[PangoLogAttr], CInt, Unit] = struct._2.asInstanceOf[CFuncPtr6[Ptr[PangoEngineLang], Ptr[CUnsignedChar], CInt, Ptr[PangoAnalysis], Ptr[PangoLogAttr], CInt, Unit]]
    def script_break_=(value: CFuncPtr6[Ptr[PangoEngineLang], Ptr[CUnsignedChar], CInt, Ptr[PangoAnalysis], Ptr[PangoLogAttr], CInt, Unit]): Unit = !struct.at2 = value.asInstanceOf[CFuncPtr6[Ptr[PangoEngineLang], Ptr[CUnsignedChar], CInt, Ptr[Byte], Ptr[PangoLogAttr], CInt, Unit]]

/**
 * PangoEngineScriptInfo: : a `PangoScript`. The value %PANGO_SCRIPT_COMMON has the special meaning here of "all scripts" : a semicolon separated list of languages that this engine handles for this script. This may be empty, in which case the engine is saying that it is a fallback choice for all languages for this range, but should not be used if another engine indicates that it is specific for the language for a given code point. An entry in this list of "*" indicates that this engine is specific to all languages for this range.
*/
opaque type PangoEngineScriptInfo = CStruct2[PangoScript, Ptr[_root_.sn.gnome.glib.internal.gchar]]
object PangoEngineScriptInfo:
  given _tag: Tag[PangoEngineScriptInfo] = Tag.materializeCStruct2Tag[PangoScript, Ptr[_root_.sn.gnome.glib.internal.gchar]]
  def apply()(using Zone): Ptr[PangoEngineScriptInfo] = scala.scalanative.unsafe.alloc[PangoEngineScriptInfo](1)
  def apply(script : PangoScript, langs : Ptr[_root_.sn.gnome.glib.internal.gchar])(using Zone): Ptr[PangoEngineScriptInfo] = 
    val ____ptr = apply()
    (!____ptr).script = script
    (!____ptr).langs = langs
    ____ptr
  extension (struct: PangoEngineScriptInfo)
    def script : PangoScript = struct._1
    def script_=(value: PangoScript): Unit = !struct.at1 = value
    def langs : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
    def langs_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at2 = value

/**
 * PangoEngineShape:
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
*/
opaque type PangoEngineShapeClass = CStruct3[PangoEngineClass, CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[CUnsignedChar], CUnsignedInt, Ptr[Byte], Ptr[PangoGlyphString], Ptr[CUnsignedChar], CUnsignedInt, Unit], CFuncPtr4[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[PangoLanguage], _root_.sn.gnome.glib.internal.gunichar, PangoCoverageLevel]]
object PangoEngineShapeClass:
  given _tag: Tag[PangoEngineShapeClass] = Tag.materializeCStruct3Tag[PangoEngineClass, CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[CUnsignedChar], CUnsignedInt, Ptr[Byte], Ptr[PangoGlyphString], Ptr[CUnsignedChar], CUnsignedInt, Unit], CFuncPtr4[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[PangoLanguage], _root_.sn.gnome.glib.internal.gunichar, PangoCoverageLevel]]
  def apply()(using Zone): Ptr[PangoEngineShapeClass] = scala.scalanative.unsafe.alloc[PangoEngineShapeClass](1)
  def apply(parent_class : PangoEngineClass, script_shape : CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[CUnsignedChar], CUnsignedInt, Ptr[PangoAnalysis], Ptr[PangoGlyphString], Ptr[CUnsignedChar], CUnsignedInt, Unit], covers : CFuncPtr4[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[PangoLanguage], _root_.sn.gnome.glib.internal.gunichar, PangoCoverageLevel])(using Zone): Ptr[PangoEngineShapeClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).script_shape = script_shape
    (!____ptr).covers = covers
    ____ptr
  extension (struct: PangoEngineShapeClass)
    def parent_class : PangoEngineClass = struct._1
    def parent_class_=(value: PangoEngineClass): Unit = !struct.at1 = value
    def script_shape : CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[CUnsignedChar], CUnsignedInt, Ptr[PangoAnalysis], Ptr[PangoGlyphString], Ptr[CUnsignedChar], CUnsignedInt, Unit] = struct._2.asInstanceOf[CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[CUnsignedChar], CUnsignedInt, Ptr[PangoAnalysis], Ptr[PangoGlyphString], Ptr[CUnsignedChar], CUnsignedInt, Unit]]
    def script_shape_=(value: CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[CUnsignedChar], CUnsignedInt, Ptr[PangoAnalysis], Ptr[PangoGlyphString], Ptr[CUnsignedChar], CUnsignedInt, Unit]): Unit = !struct.at2 = value.asInstanceOf[CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[CUnsignedChar], CUnsignedInt, Ptr[Byte], Ptr[PangoGlyphString], Ptr[CUnsignedChar], CUnsignedInt, Unit]]
    def covers : CFuncPtr4[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[PangoLanguage], _root_.sn.gnome.glib.internal.gunichar, PangoCoverageLevel] = struct._3
    def covers_=(value: CFuncPtr4[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[PangoLanguage], _root_.sn.gnome.glib.internal.gunichar, PangoCoverageLevel]): Unit = !struct.at3 = value

/**
 * PangoFont:
*/
opaque type PangoFont = CStruct1[_root_.sn.gnome.gobject.internal.GObject]
object PangoFont:
  given _tag: Tag[PangoFont] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObject]
  def apply()(using Zone): Ptr[PangoFont] = scala.scalanative.unsafe.alloc[PangoFont](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject)(using Zone): Ptr[PangoFont] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: PangoFont)
    def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
    def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = !struct.at1 = value

opaque type PangoFontClass = CStruct9[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]], CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoCoverage]], CFuncPtr4[Ptr[PangoFont], PangoGlyph, Ptr[PangoRectangle], Ptr[PangoRectangle], Unit], CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoFontMetrics]], CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontMap]], CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]], CFuncPtr4[Ptr[PangoFont], Ptr[_root_.sn.gnome.harfbuzz.internal.hb_feature_t], _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.guint], Unit], CFuncPtr1[Ptr[PangoFont], Ptr[_root_.sn.gnome.harfbuzz.internal.hb_font_t]]]
object PangoFontClass:
  given _tag: Tag[PangoFontClass] = Tag.materializeCStruct9Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]], CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoCoverage]], CFuncPtr4[Ptr[PangoFont], PangoGlyph, Ptr[PangoRectangle], Ptr[PangoRectangle], Unit], CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoFontMetrics]], CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontMap]], CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]], CFuncPtr4[Ptr[PangoFont], Ptr[_root_.sn.gnome.harfbuzz.internal.hb_feature_t], _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.guint], Unit], CFuncPtr1[Ptr[PangoFont], Ptr[_root_.sn.gnome.harfbuzz.internal.hb_font_t]]]
  def apply()(using Zone): Ptr[PangoFontClass] = scala.scalanative.unsafe.alloc[PangoFontClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, describe : CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]], get_coverage : CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoCoverage]], get_glyph_extents : CFuncPtr4[Ptr[PangoFont], PangoGlyph, Ptr[PangoRectangle], Ptr[PangoRectangle], Unit], get_metrics : CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoFontMetrics]], get_font_map : CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontMap]], describe_absolute : CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]], get_features : CFuncPtr4[Ptr[PangoFont], Ptr[_root_.sn.gnome.harfbuzz.internal.hb_feature_t], _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.guint], Unit], create_hb_font : CFuncPtr1[Ptr[PangoFont], Ptr[_root_.sn.gnome.harfbuzz.internal.hb_font_t]])(using Zone): Ptr[PangoFontClass] = 
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
    def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at1 = value
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
    def get_features : CFuncPtr4[Ptr[PangoFont], Ptr[_root_.sn.gnome.harfbuzz.internal.hb_feature_t], _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.guint], Unit] = struct._8
    def get_features_=(value: CFuncPtr4[Ptr[PangoFont], Ptr[_root_.sn.gnome.harfbuzz.internal.hb_feature_t], _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.guint], Unit]): Unit = !struct.at8 = value
    def create_hb_font : CFuncPtr1[Ptr[PangoFont], Ptr[_root_.sn.gnome.harfbuzz.internal.hb_font_t]] = struct._9
    def create_hb_font_=(value: CFuncPtr1[Ptr[PangoFont], Ptr[_root_.sn.gnome.harfbuzz.internal.hb_font_t]]): Unit = !struct.at9 = value

opaque type PangoFontDescription = CStruct0
object PangoFontDescription:
  given _tag: Tag[PangoFontDescription] = Tag.materializeCStruct0Tag

/**
 * PangoFontFace:
*/
opaque type PangoFontFace = CStruct1[_root_.sn.gnome.gobject.internal.GObject]
object PangoFontFace:
  given _tag: Tag[PangoFontFace] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObject]
  def apply()(using Zone): Ptr[PangoFontFace] = scala.scalanative.unsafe.alloc[PangoFontFace](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject)(using Zone): Ptr[PangoFontFace] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: PangoFontFace)
    def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
    def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = !struct.at1 = value

opaque type PangoFontFaceClass = CStruct8[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[PangoFontFace], Ptr[CUnsignedChar]], CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontDescription]], CFuncPtr3[Ptr[PangoFontFace], Ptr[Ptr[CInt]], Ptr[CInt], Unit], CFuncPtr1[Ptr[PangoFontFace], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontFamily]], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object PangoFontFaceClass:
  given _tag: Tag[PangoFontFaceClass] = Tag.materializeCStruct8Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[PangoFontFace], Ptr[CUnsignedChar]], CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontDescription]], CFuncPtr3[Ptr[PangoFontFace], Ptr[Ptr[CInt]], Ptr[CInt], Unit], CFuncPtr1[Ptr[PangoFontFace], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontFamily]], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[PangoFontFaceClass] = scala.scalanative.unsafe.alloc[PangoFontFaceClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, get_face_name : CFuncPtr1[Ptr[PangoFontFace], Ptr[CUnsignedChar]], describe : CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontDescription]], list_sizes : CFuncPtr3[Ptr[PangoFontFace], Ptr[Ptr[CInt]], Ptr[CInt], Unit], is_synthesized : CFuncPtr1[Ptr[PangoFontFace], _root_.sn.gnome.glib.internal.gboolean], get_family : CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontFamily]], _pango_reserved3 : CFuncPtr0[Unit], _pango_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[PangoFontFaceClass] = 
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
    def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at1 = value
    def get_face_name : CFuncPtr1[Ptr[PangoFontFace], Ptr[CUnsignedChar]] = struct._2
    def get_face_name_=(value: CFuncPtr1[Ptr[PangoFontFace], Ptr[CUnsignedChar]]): Unit = !struct.at2 = value
    def describe : CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontDescription]] = struct._3
    def describe_=(value: CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontDescription]]): Unit = !struct.at3 = value
    def list_sizes : CFuncPtr3[Ptr[PangoFontFace], Ptr[Ptr[CInt]], Ptr[CInt], Unit] = struct._4
    def list_sizes_=(value: CFuncPtr3[Ptr[PangoFontFace], Ptr[Ptr[CInt]], Ptr[CInt], Unit]): Unit = !struct.at4 = value
    def is_synthesized : CFuncPtr1[Ptr[PangoFontFace], _root_.sn.gnome.glib.internal.gboolean] = struct._5
    def is_synthesized_=(value: CFuncPtr1[Ptr[PangoFontFace], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at5 = value
    def get_family : CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontFamily]] = struct._6
    def get_family_=(value: CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontFamily]]): Unit = !struct.at6 = value
    def _pango_reserved3 : CFuncPtr0[Unit] = struct._7
    def _pango_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at7 = value
    def _pango_reserved4 : CFuncPtr0[Unit] = struct._8
    def _pango_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at8 = value

/**
 * PangoFontFamily:
*/
opaque type PangoFontFamily = CStruct1[_root_.sn.gnome.gobject.internal.GObject]
object PangoFontFamily:
  given _tag: Tag[PangoFontFamily] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObject]
  def apply()(using Zone): Ptr[PangoFontFamily] = scala.scalanative.unsafe.alloc[PangoFontFamily](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject)(using Zone): Ptr[PangoFontFamily] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: PangoFontFamily)
    def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
    def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = !struct.at1 = value

opaque type PangoFontFamilyClass = CStruct7[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[PangoFontFamily], Ptr[Ptr[Ptr[PangoFontFace]]], Ptr[CInt], Unit], CFuncPtr1[Ptr[PangoFontFamily], Ptr[CUnsignedChar]], CFuncPtr1[Ptr[PangoFontFamily], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[PangoFontFamily], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[PangoFontFamily], Ptr[CUnsignedChar], Ptr[PangoFontFace]], CFuncPtr0[Unit]]
object PangoFontFamilyClass:
  given _tag: Tag[PangoFontFamilyClass] = Tag.materializeCStruct7Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[PangoFontFamily], Ptr[Ptr[Ptr[PangoFontFace]]], Ptr[CInt], Unit], CFuncPtr1[Ptr[PangoFontFamily], Ptr[CUnsignedChar]], CFuncPtr1[Ptr[PangoFontFamily], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[PangoFontFamily], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[PangoFontFamily], Ptr[CUnsignedChar], Ptr[PangoFontFace]], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[PangoFontFamilyClass] = scala.scalanative.unsafe.alloc[PangoFontFamilyClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, list_faces : CFuncPtr3[Ptr[PangoFontFamily], Ptr[Ptr[Ptr[PangoFontFace]]], Ptr[CInt], Unit], get_name : CFuncPtr1[Ptr[PangoFontFamily], Ptr[CUnsignedChar]], is_monospace : CFuncPtr1[Ptr[PangoFontFamily], _root_.sn.gnome.glib.internal.gboolean], is_variable : CFuncPtr1[Ptr[PangoFontFamily], _root_.sn.gnome.glib.internal.gboolean], get_face : CFuncPtr2[Ptr[PangoFontFamily], Ptr[CUnsignedChar], Ptr[PangoFontFace]], _pango_reserved2 : CFuncPtr0[Unit])(using Zone): Ptr[PangoFontFamilyClass] = 
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
    def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at1 = value
    def list_faces : CFuncPtr3[Ptr[PangoFontFamily], Ptr[Ptr[Ptr[PangoFontFace]]], Ptr[CInt], Unit] = struct._2
    def list_faces_=(value: CFuncPtr3[Ptr[PangoFontFamily], Ptr[Ptr[Ptr[PangoFontFace]]], Ptr[CInt], Unit]): Unit = !struct.at2 = value
    def get_name : CFuncPtr1[Ptr[PangoFontFamily], Ptr[CUnsignedChar]] = struct._3
    def get_name_=(value: CFuncPtr1[Ptr[PangoFontFamily], Ptr[CUnsignedChar]]): Unit = !struct.at3 = value
    def is_monospace : CFuncPtr1[Ptr[PangoFontFamily], _root_.sn.gnome.glib.internal.gboolean] = struct._4
    def is_monospace_=(value: CFuncPtr1[Ptr[PangoFontFamily], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at4 = value
    def is_variable : CFuncPtr1[Ptr[PangoFontFamily], _root_.sn.gnome.glib.internal.gboolean] = struct._5
    def is_variable_=(value: CFuncPtr1[Ptr[PangoFontFamily], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at5 = value
    def get_face : CFuncPtr2[Ptr[PangoFontFamily], Ptr[CUnsignedChar], Ptr[PangoFontFace]] = struct._6
    def get_face_=(value: CFuncPtr2[Ptr[PangoFontFamily], Ptr[CUnsignedChar], Ptr[PangoFontFace]]): Unit = !struct.at6 = value
    def _pango_reserved2 : CFuncPtr0[Unit] = struct._7
    def _pango_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at7 = value

/**
 * PangoFontMap:
*/
opaque type PangoFontMap = CStruct1[_root_.sn.gnome.gobject.internal.GObject]
object PangoFontMap:
  given _tag: Tag[PangoFontMap] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObject]
  def apply()(using Zone): Ptr[PangoFontMap] = scala.scalanative.unsafe.alloc[PangoFontMap](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject)(using Zone): Ptr[PangoFontMap] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: PangoFontMap)
    def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
    def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = !struct.at1 = value

/**
 * PangoFontMapClass: _class: parent `GObjectClass` _font: a function to load a font with a given description. See pango_font_map_load_font(). _families: A function to list available font families. See pango_font_map_list_families(). _fontset: a function to load a fontset with a given given description suitable for a particular language. See pango_font_map_load_fontset(). _engine_type: the type of rendering-system-dependent engines that can handle fonts of this fonts loaded with this fontmap. _serial: a function to get the serial number of the fontmap. See pango_font_map_get_serial(). : See pango_font_map_changed()
*/
opaque type PangoFontMapClass = CStruct9[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoFont]], CFuncPtr3[Ptr[PangoFontMap], Ptr[Ptr[Ptr[PangoFontFamily]]], Ptr[CInt], Unit], CFuncPtr4[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoLanguage], Ptr[PangoFontset]], Ptr[CUnsignedChar], CFuncPtr1[Ptr[PangoFontMap], _root_.sn.gnome.glib.internal.guint], CFuncPtr1[Ptr[PangoFontMap], Unit], CFuncPtr2[Ptr[PangoFontMap], Ptr[CUnsignedChar], Ptr[PangoFontFamily]], CFuncPtr2[Ptr[PangoFontMap], Ptr[PangoFont], Ptr[PangoFontFace]]]
object PangoFontMapClass:
  given _tag: Tag[PangoFontMapClass] = Tag.materializeCStruct9Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoFont]], CFuncPtr3[Ptr[PangoFontMap], Ptr[Ptr[Ptr[PangoFontFamily]]], Ptr[CInt], Unit], CFuncPtr4[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoLanguage], Ptr[PangoFontset]], Ptr[CUnsignedChar], CFuncPtr1[Ptr[PangoFontMap], _root_.sn.gnome.glib.internal.guint], CFuncPtr1[Ptr[PangoFontMap], Unit], CFuncPtr2[Ptr[PangoFontMap], Ptr[CUnsignedChar], Ptr[PangoFontFamily]], CFuncPtr2[Ptr[PangoFontMap], Ptr[PangoFont], Ptr[PangoFontFace]]]
  def apply()(using Zone): Ptr[PangoFontMapClass] = scala.scalanative.unsafe.alloc[PangoFontMapClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, load_font : CFuncPtr3[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoFont]], list_families : CFuncPtr3[Ptr[PangoFontMap], Ptr[Ptr[Ptr[PangoFontFamily]]], Ptr[CInt], Unit], load_fontset : CFuncPtr4[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoLanguage], Ptr[PangoFontset]], shape_engine_type : Ptr[CUnsignedChar], get_serial : CFuncPtr1[Ptr[PangoFontMap], _root_.sn.gnome.glib.internal.guint], changed : CFuncPtr1[Ptr[PangoFontMap], Unit], get_family : CFuncPtr2[Ptr[PangoFontMap], Ptr[CUnsignedChar], Ptr[PangoFontFamily]], get_face : CFuncPtr2[Ptr[PangoFontMap], Ptr[PangoFont], Ptr[PangoFontFace]])(using Zone): Ptr[PangoFontMapClass] = 
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
    def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at1 = value
    def load_font : CFuncPtr3[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoFont]] = struct._2
    def load_font_=(value: CFuncPtr3[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoFont]]): Unit = !struct.at2 = value
    def list_families : CFuncPtr3[Ptr[PangoFontMap], Ptr[Ptr[Ptr[PangoFontFamily]]], Ptr[CInt], Unit] = struct._3
    def list_families_=(value: CFuncPtr3[Ptr[PangoFontMap], Ptr[Ptr[Ptr[PangoFontFamily]]], Ptr[CInt], Unit]): Unit = !struct.at3 = value
    def load_fontset : CFuncPtr4[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoLanguage], Ptr[PangoFontset]] = struct._4
    def load_fontset_=(value: CFuncPtr4[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoLanguage], Ptr[PangoFontset]]): Unit = !struct.at4 = value
    def shape_engine_type : Ptr[CUnsignedChar] = struct._5
    def shape_engine_type_=(value: Ptr[CUnsignedChar]): Unit = !struct.at5 = value
    def get_serial : CFuncPtr1[Ptr[PangoFontMap], _root_.sn.gnome.glib.internal.guint] = struct._6
    def get_serial_=(value: CFuncPtr1[Ptr[PangoFontMap], _root_.sn.gnome.glib.internal.guint]): Unit = !struct.at6 = value
    def changed : CFuncPtr1[Ptr[PangoFontMap], Unit] = struct._7
    def changed_=(value: CFuncPtr1[Ptr[PangoFontMap], Unit]): Unit = !struct.at7 = value
    def get_family : CFuncPtr2[Ptr[PangoFontMap], Ptr[CUnsignedChar], Ptr[PangoFontFamily]] = struct._8
    def get_family_=(value: CFuncPtr2[Ptr[PangoFontMap], Ptr[CUnsignedChar], Ptr[PangoFontFamily]]): Unit = !struct.at8 = value
    def get_face : CFuncPtr2[Ptr[PangoFontMap], Ptr[PangoFont], Ptr[PangoFontFace]] = struct._9
    def get_face_=(value: CFuncPtr2[Ptr[PangoFontMap], Ptr[PangoFont], Ptr[PangoFontFace]]): Unit = !struct.at9 = value

opaque type PangoFontMetrics = CStruct10[_root_.sn.gnome.glib.internal.guint, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt]
object PangoFontMetrics:
  given _tag: Tag[PangoFontMetrics] = Tag.materializeCStruct10Tag[_root_.sn.gnome.glib.internal.guint, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt]
  def apply()(using Zone): Ptr[PangoFontMetrics] = scala.scalanative.unsafe.alloc[PangoFontMetrics](1)
  def apply(ref_count : _root_.sn.gnome.glib.internal.guint, ascent : CInt, descent : CInt, height : CInt, approximate_char_width : CInt, approximate_digit_width : CInt, underline_position : CInt, underline_thickness : CInt, strikethrough_position : CInt, strikethrough_thickness : CInt)(using Zone): Ptr[PangoFontMetrics] = 
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
    def ref_count : _root_.sn.gnome.glib.internal.guint = struct._1
    def ref_count_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at1 = value
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
*/
opaque type PangoFontset = CStruct1[_root_.sn.gnome.gobject.internal.GObject]
object PangoFontset:
  given _tag: Tag[PangoFontset] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObject]
  def apply()(using Zone): Ptr[PangoFontset] = scala.scalanative.unsafe.alloc[PangoFontset](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject)(using Zone): Ptr[PangoFontset] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: PangoFontset)
    def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
    def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = !struct.at1 = value

/**
 * PangoFontsetClass: _class: parent `GObjectClass` _font: a function to get the font in the fontset that contains the best glyph for the given Unicode character; see [method.Fontset.get_font] _metrics: a function to get overall metric information for the fonts in the fontset; see [method.Fontset.get_metrics] _language: a function to get the language of the fontset. : a function to loop over the fonts in the fontset. See [method.Fontset.foreach]
*/
opaque type PangoFontsetClass = CStruct9[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr2[Ptr[PangoFontset], _root_.sn.gnome.glib.internal.guint, Ptr[PangoFont]], CFuncPtr1[Ptr[PangoFontset], Ptr[PangoFontMetrics]], CFuncPtr1[Ptr[PangoFontset], Ptr[PangoLanguage]], CFuncPtr3[Ptr[PangoFontset], PangoFontsetForeachFunc, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object PangoFontsetClass:
  given _tag: Tag[PangoFontsetClass] = Tag.materializeCStruct9Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr2[Ptr[PangoFontset], _root_.sn.gnome.glib.internal.guint, Ptr[PangoFont]], CFuncPtr1[Ptr[PangoFontset], Ptr[PangoFontMetrics]], CFuncPtr1[Ptr[PangoFontset], Ptr[PangoLanguage]], CFuncPtr3[Ptr[PangoFontset], PangoFontsetForeachFunc, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[PangoFontsetClass] = scala.scalanative.unsafe.alloc[PangoFontsetClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, get_font : CFuncPtr2[Ptr[PangoFontset], _root_.sn.gnome.glib.internal.guint, Ptr[PangoFont]], get_metrics : CFuncPtr1[Ptr[PangoFontset], Ptr[PangoFontMetrics]], get_language : CFuncPtr1[Ptr[PangoFontset], Ptr[PangoLanguage]], foreach : CFuncPtr3[Ptr[PangoFontset], PangoFontsetForeachFunc, _root_.sn.gnome.glib.internal.gpointer, Unit], _pango_reserved1 : CFuncPtr0[Unit], _pango_reserved2 : CFuncPtr0[Unit], _pango_reserved3 : CFuncPtr0[Unit], _pango_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[PangoFontsetClass] = 
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
    def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at1 = value
    def get_font : CFuncPtr2[Ptr[PangoFontset], _root_.sn.gnome.glib.internal.guint, Ptr[PangoFont]] = struct._2
    def get_font_=(value: CFuncPtr2[Ptr[PangoFontset], _root_.sn.gnome.glib.internal.guint, Ptr[PangoFont]]): Unit = !struct.at2 = value
    def get_metrics : CFuncPtr1[Ptr[PangoFontset], Ptr[PangoFontMetrics]] = struct._3
    def get_metrics_=(value: CFuncPtr1[Ptr[PangoFontset], Ptr[PangoFontMetrics]]): Unit = !struct.at3 = value
    def get_language : CFuncPtr1[Ptr[PangoFontset], Ptr[PangoLanguage]] = struct._4
    def get_language_=(value: CFuncPtr1[Ptr[PangoFontset], Ptr[PangoLanguage]]): Unit = !struct.at4 = value
    def foreach : CFuncPtr3[Ptr[PangoFontset], PangoFontsetForeachFunc, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._5
    def foreach_=(value: CFuncPtr3[Ptr[PangoFontset], PangoFontsetForeachFunc, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at5 = value
    def _pango_reserved1 : CFuncPtr0[Unit] = struct._6
    def _pango_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at6 = value
    def _pango_reserved2 : CFuncPtr0[Unit] = struct._7
    def _pango_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at7 = value
    def _pango_reserved3 : CFuncPtr0[Unit] = struct._8
    def _pango_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at8 = value
    def _pango_reserved4 : CFuncPtr0[Unit] = struct._9
    def _pango_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at9 = value

opaque type PangoFontsetSimple = CStruct0
object PangoFontsetSimple:
  given _tag: Tag[PangoFontsetSimple] = Tag.materializeCStruct0Tag

opaque type PangoFontsetSimpleClass = CStruct0
object PangoFontsetSimpleClass:
  given _tag: Tag[PangoFontsetSimpleClass] = Tag.materializeCStruct0Tag

/**
 * PangoGlyphGeometry: : the logical width to use for the the character. _offset: horizontal offset from nominal character position. _offset: vertical offset from nominal character position.
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

opaque type PangoGlyphItemIter = CStruct8[Ptr[Byte], Ptr[_root_.sn.gnome.glib.internal.gchar], CInt, CInt, CInt, CInt, CInt, CInt]
object PangoGlyphItemIter:
  given _tag: Tag[PangoGlyphItemIter] = Tag.materializeCStruct8Tag[Ptr[Byte], Ptr[_root_.sn.gnome.glib.internal.gchar], CInt, CInt, CInt, CInt, CInt, CInt]
  def apply()(using Zone): Ptr[PangoGlyphItemIter] = scala.scalanative.unsafe.alloc[PangoGlyphItemIter](1)
  def apply(glyph_item : Ptr[PangoGlyphItem], text : Ptr[_root_.sn.gnome.glib.internal.gchar], start_glyph : CInt, start_index : CInt, start_char : CInt, end_glyph : CInt, end_index : CInt, end_char : CInt)(using Zone): Ptr[PangoGlyphItemIter] = 
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
    def text : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
    def text_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at2 = value
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
*/
opaque type PangoGlyphVisAttr = CStruct2[_root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
object PangoGlyphVisAttr:
  given _tag: Tag[PangoGlyphVisAttr] = Tag.materializeCStruct2Tag[_root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
  def apply()(using Zone): Ptr[PangoGlyphVisAttr] = scala.scalanative.unsafe.alloc[PangoGlyphVisAttr](1)
  def apply(is_cluster_start : _root_.sn.gnome.glib.internal.guint, is_color : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[PangoGlyphVisAttr] = 
    val ____ptr = apply()
    (!____ptr).is_cluster_start = is_cluster_start
    (!____ptr).is_color = is_color
    ____ptr
  extension (struct: PangoGlyphVisAttr)
    def is_cluster_start : _root_.sn.gnome.glib.internal.guint = struct._1
    def is_cluster_start_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at1 = value
    def is_color : _root_.sn.gnome.glib.internal.guint = struct._2
    def is_color_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at2 = value

/**
 * PangoItem: : byte offset of the start of this item in text. : length of this item in bytes. _offset: character offset of the start of this item in text. Since 1.50 : analysis results for the item.
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

opaque type PangoLanguage = CStruct0
object PangoLanguage:
  given _tag: Tag[PangoLanguage] = Tag.materializeCStruct0Tag

opaque type PangoLayout = CStruct0
object PangoLayout:
  given _tag: Tag[PangoLayout] = Tag.materializeCStruct0Tag

opaque type PangoLayoutClass = CStruct0
object PangoLayoutClass:
  given _tag: Tag[PangoLayoutClass] = Tag.materializeCStruct0Tag

opaque type PangoLayoutIter = CStruct0
object PangoLayoutIter:
  given _tag: Tag[PangoLayoutIter] = Tag.materializeCStruct0Tag

/**
 * PangoLayoutLine: : (nullable): the layout this line belongs to, might be %NULL _index: start of line as byte index into layout->text : length of line in bytes : (nullable) (element-type Pango.LayoutRun): list of runs in the line, from left to right _dir: #Resolved PangoDirection of line
*/
opaque type PangoLayoutLine = CStruct6[Ptr[PangoLayout], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint, Ptr[Byte], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
object PangoLayoutLine:
  given _tag: Tag[PangoLayoutLine] = Tag.materializeCStruct6Tag[Ptr[PangoLayout], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint, Ptr[Byte], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
  def apply()(using Zone): Ptr[PangoLayoutLine] = scala.scalanative.unsafe.alloc[PangoLayoutLine](1)
  def apply(layout : Ptr[PangoLayout], start_index : _root_.sn.gnome.glib.internal.gint, length : _root_.sn.gnome.glib.internal.gint, runs : Ptr[_root_.sn.gnome.glib.internal.GSList], is_paragraph_start : _root_.sn.gnome.glib.internal.guint, resolved_dir : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[PangoLayoutLine] = 
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
    def start_index : _root_.sn.gnome.glib.internal.gint = struct._2
    def start_index_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at2 = value
    def length : _root_.sn.gnome.glib.internal.gint = struct._3
    def length_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at3 = value
    def runs : Ptr[_root_.sn.gnome.glib.internal.GSList] = struct._4.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GSList]]
    def runs_=(value: Ptr[_root_.sn.gnome.glib.internal.GSList]): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
    def is_paragraph_start : _root_.sn.gnome.glib.internal.guint = struct._5
    def is_paragraph_start_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at5 = value
    def resolved_dir : _root_.sn.gnome.glib.internal.guint = struct._6
    def resolved_dir_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at6 = value

/**
 * PangoLogAttr: i.e. this is a grapheme boundary, or the first character in the text. This flag implements Unicode's [Grapheme Cluster Boundaries](http://www.unicode.org/reports/tr29/) semantics. Note that in degenerate cases, you could have both and There are two ways to divide sentences. The first assigns all inter-sentence whitespace/control/format chars to some sentence, so all chars are in some sentence; the boundaries there. The second way doesn't assign between-sentence spaces, etc. to any sentence, so Note that in degenerate cases, you could have both and period, so the next sentence starts right away) _deletes_character: if set, backspace deletes one character rather than the entire grapheme cluster. This field is only meaningful on grapheme boundaries (where the full grapheme (e.g. letter + diacritics) is considered a unit, while in others, each decomposed character in the grapheme is a unit. In the default implementation of [func], this bit is set on all grapheme boundaries except those following Latin, Cyrillic or Greek base characters. expanded for justification purposes. (Since: 1.18) More specifically, means that this is not a position in the middle of a word. For example, both sides of a punctuation mark are considered word boundaries. This flag is particularly useful when selecting text word-by-word. This flag implements Unicode's [Word Boundaries](http://www.unicode.org/reports/tr29/) semantics. (Since: 1.22) _inserts_hyphen: when breaking lines before this char, insert a hyphen. Since: 1.50 _removes_preceding: when breaking lines before this char, remove the preceding char. Since 1.50
*/
opaque type PangoLogAttr = CStruct16[_root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
object PangoLogAttr:
  given _tag: Tag[PangoLogAttr] = Tag.materializeCStruct16Tag[_root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
  def apply()(using Zone): Ptr[PangoLogAttr] = scala.scalanative.unsafe.alloc[PangoLogAttr](1)
  def apply(is_line_break : _root_.sn.gnome.glib.internal.guint, is_mandatory_break : _root_.sn.gnome.glib.internal.guint, is_char_break : _root_.sn.gnome.glib.internal.guint, is_white : _root_.sn.gnome.glib.internal.guint, is_cursor_position : _root_.sn.gnome.glib.internal.guint, is_word_start : _root_.sn.gnome.glib.internal.guint, is_word_end : _root_.sn.gnome.glib.internal.guint, is_sentence_boundary : _root_.sn.gnome.glib.internal.guint, is_sentence_start : _root_.sn.gnome.glib.internal.guint, is_sentence_end : _root_.sn.gnome.glib.internal.guint, backspace_deletes_character : _root_.sn.gnome.glib.internal.guint, is_expandable_space : _root_.sn.gnome.glib.internal.guint, is_word_boundary : _root_.sn.gnome.glib.internal.guint, break_inserts_hyphen : _root_.sn.gnome.glib.internal.guint, break_removes_preceding : _root_.sn.gnome.glib.internal.guint, reserved : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[PangoLogAttr] = 
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
    def is_line_break : _root_.sn.gnome.glib.internal.guint = struct._1
    def is_line_break_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at1 = value
    def is_mandatory_break : _root_.sn.gnome.glib.internal.guint = struct._2
    def is_mandatory_break_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at2 = value
    def is_char_break : _root_.sn.gnome.glib.internal.guint = struct._3
    def is_char_break_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at3 = value
    def is_white : _root_.sn.gnome.glib.internal.guint = struct._4
    def is_white_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at4 = value
    def is_cursor_position : _root_.sn.gnome.glib.internal.guint = struct._5
    def is_cursor_position_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at5 = value
    def is_word_start : _root_.sn.gnome.glib.internal.guint = struct._6
    def is_word_start_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at6 = value
    def is_word_end : _root_.sn.gnome.glib.internal.guint = struct._7
    def is_word_end_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at7 = value
    def is_sentence_boundary : _root_.sn.gnome.glib.internal.guint = struct._8
    def is_sentence_boundary_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at8 = value
    def is_sentence_start : _root_.sn.gnome.glib.internal.guint = struct._9
    def is_sentence_start_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at9 = value
    def is_sentence_end : _root_.sn.gnome.glib.internal.guint = struct._10
    def is_sentence_end_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at10 = value
    def backspace_deletes_character : _root_.sn.gnome.glib.internal.guint = struct._11
    def backspace_deletes_character_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at11 = value
    def is_expandable_space : _root_.sn.gnome.glib.internal.guint = struct._12
    def is_expandable_space_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at12 = value
    def is_word_boundary : _root_.sn.gnome.glib.internal.guint = struct._13
    def is_word_boundary_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at13 = value
    def break_inserts_hyphen : _root_.sn.gnome.glib.internal.guint = struct._14
    def break_inserts_hyphen_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at14 = value
    def break_removes_preceding : _root_.sn.gnome.glib.internal.guint = struct._15
    def break_removes_preceding_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at15 = value
    def reserved : _root_.sn.gnome.glib.internal.guint = struct._16
    def reserved_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at16 = value

/**
 * PangoMatrix: : 1st component of the transformation matrix : 2nd component of the transformation matrix : 3rd component of the transformation matrix : 4th component of the transformation matrix : x translation : y translation
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
*/
opaque type PangoRenderer = CStruct6[_root_.sn.gnome.gobject.internal.GObject, PangoUnderline, _root_.sn.gnome.glib.internal.gboolean, CInt, Ptr[PangoMatrix], Ptr[PangoRendererPrivate]]
object PangoRenderer:
  given _tag: Tag[PangoRenderer] = Tag.materializeCStruct6Tag[_root_.sn.gnome.gobject.internal.GObject, PangoUnderline, _root_.sn.gnome.glib.internal.gboolean, CInt, Ptr[PangoMatrix], Ptr[PangoRendererPrivate]]
  def apply()(using Zone): Ptr[PangoRenderer] = scala.scalanative.unsafe.alloc[PangoRenderer](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject, underline : PangoUnderline, strikethrough : _root_.sn.gnome.glib.internal.gboolean, active_count : CInt, matrix : Ptr[PangoMatrix], priv : Ptr[PangoRendererPrivate])(using Zone): Ptr[PangoRenderer] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).underline = underline
    (!____ptr).strikethrough = strikethrough
    (!____ptr).active_count = active_count
    (!____ptr).matrix = matrix
    (!____ptr).priv = priv
    ____ptr
  extension (struct: PangoRenderer)
    def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
    def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = !struct.at1 = value
    def underline : PangoUnderline = struct._2
    def underline_=(value: PangoUnderline): Unit = !struct.at2 = value
    def strikethrough : _root_.sn.gnome.glib.internal.gboolean = struct._3
    def strikethrough_=(value: _root_.sn.gnome.glib.internal.gboolean): Unit = !struct.at3 = value
    def active_count : CInt = struct._4
    def active_count_=(value: CInt): Unit = !struct.at4 = value
    def matrix : Ptr[PangoMatrix] = struct._5
    def matrix_=(value: Ptr[PangoMatrix]): Unit = !struct.at5 = value
    def priv : Ptr[PangoRendererPrivate] = struct._6
    def priv_=(value: Ptr[PangoRendererPrivate]): Unit = !struct.at6 = value

/**
 * PangoRendererClass: _glyphs: draws a `PangoGlyphString` _rectangle: draws a rectangle _error_underline: draws a squiggly line that approximately covers the given rectangle in the style of an underline used to indicate a spelling error. _shape: draw content for a glyph shaped with `PangoAttrShape` , are the coordinates of the left edge of the baseline, in user coordinates. _trapezoid: draws a trapezoidal filled area _glyph: draws a single glyph
*/
opaque type PangoRendererClass = CStruct15[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], Ptr[PangoGlyphString], CInt, CInt, Unit], CFuncPtr6[Ptr[PangoRenderer], PangoRenderPart, CInt, CInt, CInt, CInt, Unit], CFuncPtr5[Ptr[PangoRenderer], CInt, CInt, CInt, CInt, Unit], CFuncPtr4[Ptr[PangoRenderer], Ptr[Byte], CInt, CInt, Unit], CFuncPtr8[Ptr[PangoRenderer], PangoRenderPart, Double, Double, Double, Double, Double, Double, Unit], CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], PangoGlyph, Double, Double, Unit], CFuncPtr2[Ptr[PangoRenderer], PangoRenderPart, Unit], CFuncPtr1[Ptr[PangoRenderer], Unit], CFuncPtr1[Ptr[PangoRenderer], Unit], CFuncPtr2[Ptr[PangoRenderer], Ptr[Byte], Unit], CFuncPtr5[Ptr[PangoRenderer], Ptr[CUnsignedChar], Ptr[Byte], CInt, CInt, Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object PangoRendererClass:
  given _tag: Tag[PangoRendererClass] = Tag.materializeCStruct15Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], Ptr[PangoGlyphString], CInt, CInt, Unit], CFuncPtr6[Ptr[PangoRenderer], PangoRenderPart, CInt, CInt, CInt, CInt, Unit], CFuncPtr5[Ptr[PangoRenderer], CInt, CInt, CInt, CInt, Unit], CFuncPtr4[Ptr[PangoRenderer], Ptr[Byte], CInt, CInt, Unit], CFuncPtr8[Ptr[PangoRenderer], PangoRenderPart, Double, Double, Double, Double, Double, Double, Unit], CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], PangoGlyph, Double, Double, Unit], CFuncPtr2[Ptr[PangoRenderer], PangoRenderPart, Unit], CFuncPtr1[Ptr[PangoRenderer], Unit], CFuncPtr1[Ptr[PangoRenderer], Unit], CFuncPtr2[Ptr[PangoRenderer], Ptr[Byte], Unit], CFuncPtr5[Ptr[PangoRenderer], Ptr[CUnsignedChar], Ptr[Byte], CInt, CInt, Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[PangoRendererClass] = scala.scalanative.unsafe.alloc[PangoRendererClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, draw_glyphs : CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], Ptr[PangoGlyphString], CInt, CInt, Unit], draw_rectangle : CFuncPtr6[Ptr[PangoRenderer], PangoRenderPart, CInt, CInt, CInt, CInt, Unit], draw_error_underline : CFuncPtr5[Ptr[PangoRenderer], CInt, CInt, CInt, CInt, Unit], draw_shape : CFuncPtr4[Ptr[PangoRenderer], Ptr[PangoAttrShape], CInt, CInt, Unit], draw_trapezoid : CFuncPtr8[Ptr[PangoRenderer], PangoRenderPart, Double, Double, Double, Double, Double, Double, Unit], draw_glyph : CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], PangoGlyph, Double, Double, Unit], part_changed : CFuncPtr2[Ptr[PangoRenderer], PangoRenderPart, Unit], begin : CFuncPtr1[Ptr[PangoRenderer], Unit], end : CFuncPtr1[Ptr[PangoRenderer], Unit], prepare_run : CFuncPtr2[Ptr[PangoRenderer], Ptr[PangoLayoutRun], Unit], draw_glyph_item : CFuncPtr5[Ptr[PangoRenderer], Ptr[CUnsignedChar], Ptr[PangoGlyphItem], CInt, CInt, Unit], _pango_reserved2 : CFuncPtr0[Unit], _pango_reserved3 : CFuncPtr0[Unit], _pango_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[PangoRendererClass] = 
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
    def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at1 = value
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
    def draw_glyph_item : CFuncPtr5[Ptr[PangoRenderer], Ptr[CUnsignedChar], Ptr[PangoGlyphItem], CInt, CInt, Unit] = struct._12.asInstanceOf[CFuncPtr5[Ptr[PangoRenderer], Ptr[CUnsignedChar], Ptr[PangoGlyphItem], CInt, CInt, Unit]]
    def draw_glyph_item_=(value: CFuncPtr5[Ptr[PangoRenderer], Ptr[CUnsignedChar], Ptr[PangoGlyphItem], CInt, CInt, Unit]): Unit = !struct.at12 = value.asInstanceOf[CFuncPtr5[Ptr[PangoRenderer], Ptr[CUnsignedChar], Ptr[Byte], CInt, CInt, Unit]]
    def _pango_reserved2 : CFuncPtr0[Unit] = struct._13
    def _pango_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at13 = value
    def _pango_reserved3 : CFuncPtr0[Unit] = struct._14
    def _pango_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at14 = value
    def _pango_reserved4 : CFuncPtr0[Unit] = struct._15
    def _pango_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at15 = value

opaque type PangoRendererPrivate = CStruct0
object PangoRendererPrivate:
  given _tag: Tag[PangoRendererPrivate] = Tag.materializeCStruct0Tag

opaque type PangoScriptIter = CStruct0
object PangoScriptIter:
  given _tag: Tag[PangoScriptIter] = Tag.materializeCStruct0Tag

opaque type PangoTabArray = CStruct0
object PangoTabArray:
  given _tag: Tag[PangoTabArray] = Tag.materializeCStruct0Tag

/**
 * PangoAnalysis: _engine: unused, reserved _engine: unused, reserved : the font for this segment. : the bidirectional level for this segment. : the glyph orientation for this segment (A `PangoGravity`). : boolean flags for this segment (Since: 1.16). : the detected script for this segment (A `PangoScript`) (Since: 1.18). : the detected language for this segment. _attrs: extra attributes for this segment.
*/
opaque type _PangoAnalysis = CStruct9[Ptr[PangoEngineShape], Ptr[PangoEngineLang], Ptr[PangoFont], _root_.sn.gnome.glib.internal.guint8, _root_.sn.gnome.glib.internal.guint8, _root_.sn.gnome.glib.internal.guint8, _root_.sn.gnome.glib.internal.guint8, Ptr[PangoLanguage], Ptr[Byte]]
object _PangoAnalysis:
  given _tag: Tag[_PangoAnalysis] = Tag.materializeCStruct9Tag[Ptr[PangoEngineShape], Ptr[PangoEngineLang], Ptr[PangoFont], _root_.sn.gnome.glib.internal.guint8, _root_.sn.gnome.glib.internal.guint8, _root_.sn.gnome.glib.internal.guint8, _root_.sn.gnome.glib.internal.guint8, Ptr[PangoLanguage], Ptr[Byte]]
  def apply()(using Zone): Ptr[_PangoAnalysis] = scala.scalanative.unsafe.alloc[_PangoAnalysis](1)
  def apply(shape_engine : Ptr[PangoEngineShape], lang_engine : Ptr[PangoEngineLang], font : Ptr[PangoFont], level : _root_.sn.gnome.glib.internal.guint8, gravity : _root_.sn.gnome.glib.internal.guint8, flags : _root_.sn.gnome.glib.internal.guint8, script : _root_.sn.gnome.glib.internal.guint8, language : Ptr[PangoLanguage], extra_attrs : Ptr[_root_.sn.gnome.glib.internal.GSList])(using Zone): Ptr[_PangoAnalysis] = 
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
    def level : _root_.sn.gnome.glib.internal.guint8 = struct._4
    def level_=(value: _root_.sn.gnome.glib.internal.guint8): Unit = !struct.at4 = value
    def gravity : _root_.sn.gnome.glib.internal.guint8 = struct._5
    def gravity_=(value: _root_.sn.gnome.glib.internal.guint8): Unit = !struct.at5 = value
    def flags : _root_.sn.gnome.glib.internal.guint8 = struct._6
    def flags_=(value: _root_.sn.gnome.glib.internal.guint8): Unit = !struct.at6 = value
    def script : _root_.sn.gnome.glib.internal.guint8 = struct._7
    def script_=(value: _root_.sn.gnome.glib.internal.guint8): Unit = !struct.at7 = value
    def language : Ptr[PangoLanguage] = struct._8
    def language_=(value: Ptr[PangoLanguage]): Unit = !struct.at8 = value
    def extra_attrs : Ptr[_root_.sn.gnome.glib.internal.GSList] = struct._9.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GSList]]
    def extra_attrs_=(value: Ptr[_root_.sn.gnome.glib.internal.GSList]): Unit = !struct.at9 = value.asInstanceOf[Ptr[Byte]]

/**
 * PangoAttrClass: : the type ID for this attribute : function to duplicate an attribute of this type (see [method.Attribute.copy]) : function to free an attribute of this type (see [method.Attribute.destroy]) : function to check two attributes of this type for equality (see [method.Attribute.equal])
*/
opaque type _PangoAttrClass = CStruct4[PangoAttrType, CFuncPtr1[Ptr[Byte], Ptr[Byte]], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr2[Ptr[Byte], Ptr[Byte], _root_.sn.gnome.glib.internal.gboolean]]
object _PangoAttrClass:
  given _tag: Tag[_PangoAttrClass] = Tag.materializeCStruct4Tag[PangoAttrType, CFuncPtr1[Ptr[Byte], Ptr[Byte]], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr2[Ptr[Byte], Ptr[Byte], _root_.sn.gnome.glib.internal.gboolean]]
  def apply()(using Zone): Ptr[_PangoAttrClass] = scala.scalanative.unsafe.alloc[_PangoAttrClass](1)
  def apply(`type` : PangoAttrType, copy : CFuncPtr1[Ptr[PangoAttribute], Ptr[PangoAttribute]], destroy : CFuncPtr1[Ptr[PangoAttribute], Unit], equal : CFuncPtr2[Ptr[PangoAttribute], Ptr[PangoAttribute], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[_PangoAttrClass] = 
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
    def equal : CFuncPtr2[Ptr[PangoAttribute], Ptr[PangoAttribute], _root_.sn.gnome.glib.internal.gboolean] = struct._4.asInstanceOf[CFuncPtr2[Ptr[PangoAttribute], Ptr[PangoAttribute], _root_.sn.gnome.glib.internal.gboolean]]
    def equal_=(value: CFuncPtr2[Ptr[PangoAttribute], Ptr[PangoAttribute], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at4 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], Ptr[Byte], _root_.sn.gnome.glib.internal.gboolean]]

/**
 * PangoAttrColor: : the common portion of the attribute : the `PangoColor` which is the value of the attribute
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
*/
opaque type _PangoAttrFontFeatures = CStruct2[PangoAttribute, Ptr[_root_.sn.gnome.glib.internal.gchar]]
object _PangoAttrFontFeatures:
  given _tag: Tag[_PangoAttrFontFeatures] = Tag.materializeCStruct2Tag[PangoAttribute, Ptr[_root_.sn.gnome.glib.internal.gchar]]
  def apply()(using Zone): Ptr[_PangoAttrFontFeatures] = scala.scalanative.unsafe.alloc[_PangoAttrFontFeatures](1)
  def apply(attr : PangoAttribute, features : Ptr[_root_.sn.gnome.glib.internal.gchar])(using Zone): Ptr[_PangoAttrFontFeatures] = 
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).features = features
    ____ptr
  extension (struct: _PangoAttrFontFeatures)
    def attr : PangoAttribute = struct._1
    def attr_=(value: PangoAttribute): Unit = !struct.at1 = value
    def features : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
    def features_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at2 = value

/**
 * PangoAttrInt: : the common portion of the attribute : the value of the attribute
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

opaque type _PangoAttrIterator = CStruct0
object _PangoAttrIterator:
  given _tag: Tag[_PangoAttrIterator] = Tag.materializeCStruct0Tag

/**
 * PangoAttrLanguage: : the common portion of the attribute : the `PangoLanguage` which is the value of the attribute
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

opaque type _PangoAttrList = CStruct0
object _PangoAttrList:
  given _tag: Tag[_PangoAttrList] = Tag.materializeCStruct0Tag

/**
 * PangoAttrShape: : the common portion of the attribute
*/
opaque type _PangoAttrShape = CStruct6[PangoAttribute, PangoRectangle, PangoRectangle, _root_.sn.gnome.glib.internal.gpointer, PangoAttrDataCopyFunc, _root_.sn.gnome.glib.internal.GDestroyNotify]
object _PangoAttrShape:
  given _tag: Tag[_PangoAttrShape] = Tag.materializeCStruct6Tag[PangoAttribute, PangoRectangle, PangoRectangle, _root_.sn.gnome.glib.internal.gpointer, PangoAttrDataCopyFunc, _root_.sn.gnome.glib.internal.GDestroyNotify]
  def apply()(using Zone): Ptr[_PangoAttrShape] = scala.scalanative.unsafe.alloc[_PangoAttrShape](1)
  def apply(attr : PangoAttribute, ink_rect : PangoRectangle, logical_rect : PangoRectangle, data : _root_.sn.gnome.glib.internal.gpointer, copy_func : PangoAttrDataCopyFunc, destroy_func : _root_.sn.gnome.glib.internal.GDestroyNotify)(using Zone): Ptr[_PangoAttrShape] = 
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
    def data : _root_.sn.gnome.glib.internal.gpointer = struct._4
    def data_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at4 = value
    def copy_func : PangoAttrDataCopyFunc = struct._5
    def copy_func_=(value: PangoAttrDataCopyFunc): Unit = !struct.at5 = value
    def destroy_func : _root_.sn.gnome.glib.internal.GDestroyNotify = struct._6
    def destroy_func_=(value: _root_.sn.gnome.glib.internal.GDestroyNotify): Unit = !struct.at6 = value

/**
 * PangoAttrSize: : the common portion of the attribute : size of font, in units of 1/%PANGO_SCALE of a point (for %PANGO_ATTR_SIZE) or of a device unit (for %PANGO_ATTR_ABSOLUTE_SIZE) : whether the font size is in device units or points. This field is only present for compatibility with Pango-1.8.0 (%PANGO_ATTR_ABSOLUTE_SIZE was added in 1.8.1); and always will be %FALSE for %PANGO_ATTR_SIZE and %TRUE for %PANGO_ATTR_ABSOLUTE_SIZE.
*/
opaque type _PangoAttrSize = CStruct3[PangoAttribute, CInt, _root_.sn.gnome.glib.internal.guint]
object _PangoAttrSize:
  given _tag: Tag[_PangoAttrSize] = Tag.materializeCStruct3Tag[PangoAttribute, CInt, _root_.sn.gnome.glib.internal.guint]
  def apply()(using Zone): Ptr[_PangoAttrSize] = scala.scalanative.unsafe.alloc[_PangoAttrSize](1)
  def apply(attr : PangoAttribute, size : CInt, absolute : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[_PangoAttrSize] = 
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
    def absolute : _root_.sn.gnome.glib.internal.guint = struct._3
    def absolute_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at3 = value

/**
 * PangoAttrString: : the common portion of the attribute : the string which is the value of the attribute
*/
opaque type _PangoAttrString = CStruct2[PangoAttribute, Ptr[CUnsignedChar]]
object _PangoAttrString:
  given _tag: Tag[_PangoAttrString] = Tag.materializeCStruct2Tag[PangoAttribute, Ptr[CUnsignedChar]]
  def apply()(using Zone): Ptr[_PangoAttrString] = scala.scalanative.unsafe.alloc[_PangoAttrString](1)
  def apply(attr : PangoAttribute, value : Ptr[CUnsignedChar])(using Zone): Ptr[_PangoAttrString] = 
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).value = value
    ____ptr
  extension (struct: _PangoAttrString)
    def attr : PangoAttribute = struct._1
    def attr_=(value: PangoAttribute): Unit = !struct.at1 = value
    def value : Ptr[CUnsignedChar] = struct._2
    def value_=(value: Ptr[CUnsignedChar]): Unit = !struct.at2 = value

/**
 * PangoAttribute: _index: the start index of the range (in bytes). _index: end index of the range (in bytes). The character at this index is not included in the range.
*/
opaque type _PangoAttribute = CStruct3[Ptr[Byte], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
object _PangoAttribute:
  given _tag: Tag[_PangoAttribute] = Tag.materializeCStruct3Tag[Ptr[Byte], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
  def apply()(using Zone): Ptr[_PangoAttribute] = scala.scalanative.unsafe.alloc[_PangoAttribute](1)
  def apply(klass : Ptr[PangoAttrClass], start_index : _root_.sn.gnome.glib.internal.guint, end_index : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[_PangoAttribute] = 
    val ____ptr = apply()
    (!____ptr).klass = klass
    (!____ptr).start_index = start_index
    (!____ptr).end_index = end_index
    ____ptr
  extension (struct: _PangoAttribute)
    def klass : Ptr[PangoAttrClass] = struct._1.asInstanceOf[Ptr[PangoAttrClass]]
    def klass_=(value: Ptr[PangoAttrClass]): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
    def start_index : _root_.sn.gnome.glib.internal.guint = struct._2
    def start_index_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at2 = value
    def end_index : _root_.sn.gnome.glib.internal.guint = struct._3
    def end_index_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at3 = value

/**
 * PangoColor: : value of red component : value of green component : value of blue component
*/
opaque type _PangoColor = CStruct3[_root_.sn.gnome.glib.internal.guint16, _root_.sn.gnome.glib.internal.guint16, _root_.sn.gnome.glib.internal.guint16]
object _PangoColor:
  given _tag: Tag[_PangoColor] = Tag.materializeCStruct3Tag[_root_.sn.gnome.glib.internal.guint16, _root_.sn.gnome.glib.internal.guint16, _root_.sn.gnome.glib.internal.guint16]
  def apply()(using Zone): Ptr[_PangoColor] = scala.scalanative.unsafe.alloc[_PangoColor](1)
  def apply(red : _root_.sn.gnome.glib.internal.guint16, green : _root_.sn.gnome.glib.internal.guint16, blue : _root_.sn.gnome.glib.internal.guint16)(using Zone): Ptr[_PangoColor] = 
    val ____ptr = apply()
    (!____ptr).red = red
    (!____ptr).green = green
    (!____ptr).blue = blue
    ____ptr
  extension (struct: _PangoColor)
    def red : _root_.sn.gnome.glib.internal.guint16 = struct._1
    def red_=(value: _root_.sn.gnome.glib.internal.guint16): Unit = !struct.at1 = value
    def green : _root_.sn.gnome.glib.internal.guint16 = struct._2
    def green_=(value: _root_.sn.gnome.glib.internal.guint16): Unit = !struct.at2 = value
    def blue : _root_.sn.gnome.glib.internal.guint16 = struct._3
    def blue_=(value: _root_.sn.gnome.glib.internal.guint16): Unit = !struct.at3 = value

opaque type _PangoContext = CStruct0
object _PangoContext:
  given _tag: Tag[_PangoContext] = Tag.materializeCStruct0Tag

opaque type _PangoContextClass = CStruct0
object _PangoContextClass:
  given _tag: Tag[_PangoContextClass] = Tag.materializeCStruct0Tag

opaque type _PangoCoverage = CStruct0
object _PangoCoverage:
  given _tag: Tag[_PangoCoverage] = Tag.materializeCStruct0Tag

/**
 * PangoEngine:
*/
opaque type _PangoEngine = CStruct1[_root_.sn.gnome.gobject.internal.GObject]
object _PangoEngine:
  given _tag: Tag[_PangoEngine] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObject]
  def apply()(using Zone): Ptr[_PangoEngine] = scala.scalanative.unsafe.alloc[_PangoEngine](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject)(using Zone): Ptr[_PangoEngine] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _PangoEngine)
    def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
    def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = !struct.at1 = value

/**
 * PangoEngineClass:
*/
opaque type _PangoEngineClass = CStruct1[_root_.sn.gnome.gobject.internal.GObjectClass]
object _PangoEngineClass:
  given _tag: Tag[_PangoEngineClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObjectClass]
  def apply()(using Zone): Ptr[_PangoEngineClass] = scala.scalanative.unsafe.alloc[_PangoEngineClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass)(using Zone): Ptr[_PangoEngineClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  extension (struct: _PangoEngineClass)
    def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at1 = value

/**
 * PangoEngineInfo: _type: a string identifying the engine type. _type: a string identifying the render type. : array of scripts this engine supports. _scripts: number of items in .
*/
opaque type _PangoEngineInfo = CStruct5[Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[PangoEngineScriptInfo], _root_.sn.gnome.glib.internal.gint]
object _PangoEngineInfo:
  given _tag: Tag[_PangoEngineInfo] = Tag.materializeCStruct5Tag[Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[PangoEngineScriptInfo], _root_.sn.gnome.glib.internal.gint]
  def apply()(using Zone): Ptr[_PangoEngineInfo] = scala.scalanative.unsafe.alloc[_PangoEngineInfo](1)
  def apply(id : Ptr[_root_.sn.gnome.glib.internal.gchar], engine_type : Ptr[_root_.sn.gnome.glib.internal.gchar], render_type : Ptr[_root_.sn.gnome.glib.internal.gchar], scripts : Ptr[PangoEngineScriptInfo], n_scripts : _root_.sn.gnome.glib.internal.gint)(using Zone): Ptr[_PangoEngineInfo] = 
    val ____ptr = apply()
    (!____ptr).id = id
    (!____ptr).engine_type = engine_type
    (!____ptr).render_type = render_type
    (!____ptr).scripts = scripts
    (!____ptr).n_scripts = n_scripts
    ____ptr
  extension (struct: _PangoEngineInfo)
    def id : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._1
    def id_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at1 = value
    def engine_type : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
    def engine_type_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at2 = value
    def render_type : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._3
    def render_type_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at3 = value
    def scripts : Ptr[PangoEngineScriptInfo] = struct._4
    def scripts_=(value: Ptr[PangoEngineScriptInfo]): Unit = !struct.at4 = value
    def n_scripts : _root_.sn.gnome.glib.internal.gint = struct._5
    def n_scripts_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at5 = value

/**
 * PangoEngineLang:
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
*/
opaque type _PangoEngineLangClass = CStruct2[PangoEngineClass, CFuncPtr6[Ptr[PangoEngineLang], Ptr[CUnsignedChar], CInt, Ptr[Byte], Ptr[PangoLogAttr], CInt, Unit]]
object _PangoEngineLangClass:
  given _tag: Tag[_PangoEngineLangClass] = Tag.materializeCStruct2Tag[PangoEngineClass, CFuncPtr6[Ptr[PangoEngineLang], Ptr[CUnsignedChar], CInt, Ptr[Byte], Ptr[PangoLogAttr], CInt, Unit]]
  def apply()(using Zone): Ptr[_PangoEngineLangClass] = scala.scalanative.unsafe.alloc[_PangoEngineLangClass](1)
  def apply(parent_class : PangoEngineClass, script_break : CFuncPtr6[Ptr[PangoEngineLang], Ptr[CUnsignedChar], CInt, Ptr[PangoAnalysis], Ptr[PangoLogAttr], CInt, Unit])(using Zone): Ptr[_PangoEngineLangClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).script_break = script_break
    ____ptr
  extension (struct: _PangoEngineLangClass)
    def parent_class : PangoEngineClass = struct._1
    def parent_class_=(value: PangoEngineClass): Unit = !struct.at1 = value
    def script_break : CFuncPtr6[Ptr[PangoEngineLang], Ptr[CUnsignedChar], CInt, Ptr[PangoAnalysis], Ptr[PangoLogAttr], CInt, Unit] = struct._2.asInstanceOf[CFuncPtr6[Ptr[PangoEngineLang], Ptr[CUnsignedChar], CInt, Ptr[PangoAnalysis], Ptr[PangoLogAttr], CInt, Unit]]
    def script_break_=(value: CFuncPtr6[Ptr[PangoEngineLang], Ptr[CUnsignedChar], CInt, Ptr[PangoAnalysis], Ptr[PangoLogAttr], CInt, Unit]): Unit = !struct.at2 = value.asInstanceOf[CFuncPtr6[Ptr[PangoEngineLang], Ptr[CUnsignedChar], CInt, Ptr[Byte], Ptr[PangoLogAttr], CInt, Unit]]

/**
 * PangoEngineScriptInfo: : a `PangoScript`. The value %PANGO_SCRIPT_COMMON has the special meaning here of "all scripts" : a semicolon separated list of languages that this engine handles for this script. This may be empty, in which case the engine is saying that it is a fallback choice for all languages for this range, but should not be used if another engine indicates that it is specific for the language for a given code point. An entry in this list of "*" indicates that this engine is specific to all languages for this range.
*/
opaque type _PangoEngineScriptInfo = CStruct2[PangoScript, Ptr[_root_.sn.gnome.glib.internal.gchar]]
object _PangoEngineScriptInfo:
  given _tag: Tag[_PangoEngineScriptInfo] = Tag.materializeCStruct2Tag[PangoScript, Ptr[_root_.sn.gnome.glib.internal.gchar]]
  def apply()(using Zone): Ptr[_PangoEngineScriptInfo] = scala.scalanative.unsafe.alloc[_PangoEngineScriptInfo](1)
  def apply(script : PangoScript, langs : Ptr[_root_.sn.gnome.glib.internal.gchar])(using Zone): Ptr[_PangoEngineScriptInfo] = 
    val ____ptr = apply()
    (!____ptr).script = script
    (!____ptr).langs = langs
    ____ptr
  extension (struct: _PangoEngineScriptInfo)
    def script : PangoScript = struct._1
    def script_=(value: PangoScript): Unit = !struct.at1 = value
    def langs : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
    def langs_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at2 = value

/**
 * PangoEngineShape:
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
*/
opaque type _PangoEngineShapeClass = CStruct3[PangoEngineClass, CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[CUnsignedChar], CUnsignedInt, Ptr[Byte], Ptr[PangoGlyphString], Ptr[CUnsignedChar], CUnsignedInt, Unit], CFuncPtr4[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[PangoLanguage], _root_.sn.gnome.glib.internal.gunichar, PangoCoverageLevel]]
object _PangoEngineShapeClass:
  given _tag: Tag[_PangoEngineShapeClass] = Tag.materializeCStruct3Tag[PangoEngineClass, CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[CUnsignedChar], CUnsignedInt, Ptr[Byte], Ptr[PangoGlyphString], Ptr[CUnsignedChar], CUnsignedInt, Unit], CFuncPtr4[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[PangoLanguage], _root_.sn.gnome.glib.internal.gunichar, PangoCoverageLevel]]
  def apply()(using Zone): Ptr[_PangoEngineShapeClass] = scala.scalanative.unsafe.alloc[_PangoEngineShapeClass](1)
  def apply(parent_class : PangoEngineClass, script_shape : CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[CUnsignedChar], CUnsignedInt, Ptr[PangoAnalysis], Ptr[PangoGlyphString], Ptr[CUnsignedChar], CUnsignedInt, Unit], covers : CFuncPtr4[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[PangoLanguage], _root_.sn.gnome.glib.internal.gunichar, PangoCoverageLevel])(using Zone): Ptr[_PangoEngineShapeClass] = 
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).script_shape = script_shape
    (!____ptr).covers = covers
    ____ptr
  extension (struct: _PangoEngineShapeClass)
    def parent_class : PangoEngineClass = struct._1
    def parent_class_=(value: PangoEngineClass): Unit = !struct.at1 = value
    def script_shape : CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[CUnsignedChar], CUnsignedInt, Ptr[PangoAnalysis], Ptr[PangoGlyphString], Ptr[CUnsignedChar], CUnsignedInt, Unit] = struct._2.asInstanceOf[CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[CUnsignedChar], CUnsignedInt, Ptr[PangoAnalysis], Ptr[PangoGlyphString], Ptr[CUnsignedChar], CUnsignedInt, Unit]]
    def script_shape_=(value: CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[CUnsignedChar], CUnsignedInt, Ptr[PangoAnalysis], Ptr[PangoGlyphString], Ptr[CUnsignedChar], CUnsignedInt, Unit]): Unit = !struct.at2 = value.asInstanceOf[CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[CUnsignedChar], CUnsignedInt, Ptr[Byte], Ptr[PangoGlyphString], Ptr[CUnsignedChar], CUnsignedInt, Unit]]
    def covers : CFuncPtr4[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[PangoLanguage], _root_.sn.gnome.glib.internal.gunichar, PangoCoverageLevel] = struct._3
    def covers_=(value: CFuncPtr4[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[PangoLanguage], _root_.sn.gnome.glib.internal.gunichar, PangoCoverageLevel]): Unit = !struct.at3 = value

/**
 * PangoFont:
*/
opaque type _PangoFont = CStruct1[_root_.sn.gnome.gobject.internal.GObject]
object _PangoFont:
  given _tag: Tag[_PangoFont] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObject]
  def apply()(using Zone): Ptr[_PangoFont] = scala.scalanative.unsafe.alloc[_PangoFont](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject)(using Zone): Ptr[_PangoFont] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _PangoFont)
    def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
    def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = !struct.at1 = value

opaque type _PangoFontClass = CStruct9[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]], CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoCoverage]], CFuncPtr4[Ptr[PangoFont], PangoGlyph, Ptr[PangoRectangle], Ptr[PangoRectangle], Unit], CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoFontMetrics]], CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontMap]], CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]], CFuncPtr4[Ptr[PangoFont], Ptr[_root_.sn.gnome.harfbuzz.internal.hb_feature_t], _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.guint], Unit], CFuncPtr1[Ptr[PangoFont], Ptr[_root_.sn.gnome.harfbuzz.internal.hb_font_t]]]
object _PangoFontClass:
  given _tag: Tag[_PangoFontClass] = Tag.materializeCStruct9Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]], CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoCoverage]], CFuncPtr4[Ptr[PangoFont], PangoGlyph, Ptr[PangoRectangle], Ptr[PangoRectangle], Unit], CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoFontMetrics]], CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontMap]], CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]], CFuncPtr4[Ptr[PangoFont], Ptr[_root_.sn.gnome.harfbuzz.internal.hb_feature_t], _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.guint], Unit], CFuncPtr1[Ptr[PangoFont], Ptr[_root_.sn.gnome.harfbuzz.internal.hb_font_t]]]
  def apply()(using Zone): Ptr[_PangoFontClass] = scala.scalanative.unsafe.alloc[_PangoFontClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, describe : CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]], get_coverage : CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoCoverage]], get_glyph_extents : CFuncPtr4[Ptr[PangoFont], PangoGlyph, Ptr[PangoRectangle], Ptr[PangoRectangle], Unit], get_metrics : CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoFontMetrics]], get_font_map : CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontMap]], describe_absolute : CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]], get_features : CFuncPtr4[Ptr[PangoFont], Ptr[_root_.sn.gnome.harfbuzz.internal.hb_feature_t], _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.guint], Unit], create_hb_font : CFuncPtr1[Ptr[PangoFont], Ptr[_root_.sn.gnome.harfbuzz.internal.hb_font_t]])(using Zone): Ptr[_PangoFontClass] = 
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
    def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at1 = value
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
    def get_features : CFuncPtr4[Ptr[PangoFont], Ptr[_root_.sn.gnome.harfbuzz.internal.hb_feature_t], _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.guint], Unit] = struct._8
    def get_features_=(value: CFuncPtr4[Ptr[PangoFont], Ptr[_root_.sn.gnome.harfbuzz.internal.hb_feature_t], _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.guint], Unit]): Unit = !struct.at8 = value
    def create_hb_font : CFuncPtr1[Ptr[PangoFont], Ptr[_root_.sn.gnome.harfbuzz.internal.hb_font_t]] = struct._9
    def create_hb_font_=(value: CFuncPtr1[Ptr[PangoFont], Ptr[_root_.sn.gnome.harfbuzz.internal.hb_font_t]]): Unit = !struct.at9 = value

opaque type _PangoFontDescription = CStruct0
object _PangoFontDescription:
  given _tag: Tag[_PangoFontDescription] = Tag.materializeCStruct0Tag

/**
 * PangoFontFace:
*/
opaque type _PangoFontFace = CStruct1[_root_.sn.gnome.gobject.internal.GObject]
object _PangoFontFace:
  given _tag: Tag[_PangoFontFace] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObject]
  def apply()(using Zone): Ptr[_PangoFontFace] = scala.scalanative.unsafe.alloc[_PangoFontFace](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject)(using Zone): Ptr[_PangoFontFace] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _PangoFontFace)
    def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
    def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = !struct.at1 = value

opaque type _PangoFontFaceClass = CStruct8[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[PangoFontFace], Ptr[CUnsignedChar]], CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontDescription]], CFuncPtr3[Ptr[PangoFontFace], Ptr[Ptr[CInt]], Ptr[CInt], Unit], CFuncPtr1[Ptr[PangoFontFace], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontFamily]], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object _PangoFontFaceClass:
  given _tag: Tag[_PangoFontFaceClass] = Tag.materializeCStruct8Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[PangoFontFace], Ptr[CUnsignedChar]], CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontDescription]], CFuncPtr3[Ptr[PangoFontFace], Ptr[Ptr[CInt]], Ptr[CInt], Unit], CFuncPtr1[Ptr[PangoFontFace], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontFamily]], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[_PangoFontFaceClass] = scala.scalanative.unsafe.alloc[_PangoFontFaceClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, get_face_name : CFuncPtr1[Ptr[PangoFontFace], Ptr[CUnsignedChar]], describe : CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontDescription]], list_sizes : CFuncPtr3[Ptr[PangoFontFace], Ptr[Ptr[CInt]], Ptr[CInt], Unit], is_synthesized : CFuncPtr1[Ptr[PangoFontFace], _root_.sn.gnome.glib.internal.gboolean], get_family : CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontFamily]], _pango_reserved3 : CFuncPtr0[Unit], _pango_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[_PangoFontFaceClass] = 
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
    def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at1 = value
    def get_face_name : CFuncPtr1[Ptr[PangoFontFace], Ptr[CUnsignedChar]] = struct._2
    def get_face_name_=(value: CFuncPtr1[Ptr[PangoFontFace], Ptr[CUnsignedChar]]): Unit = !struct.at2 = value
    def describe : CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontDescription]] = struct._3
    def describe_=(value: CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontDescription]]): Unit = !struct.at3 = value
    def list_sizes : CFuncPtr3[Ptr[PangoFontFace], Ptr[Ptr[CInt]], Ptr[CInt], Unit] = struct._4
    def list_sizes_=(value: CFuncPtr3[Ptr[PangoFontFace], Ptr[Ptr[CInt]], Ptr[CInt], Unit]): Unit = !struct.at4 = value
    def is_synthesized : CFuncPtr1[Ptr[PangoFontFace], _root_.sn.gnome.glib.internal.gboolean] = struct._5
    def is_synthesized_=(value: CFuncPtr1[Ptr[PangoFontFace], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at5 = value
    def get_family : CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontFamily]] = struct._6
    def get_family_=(value: CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontFamily]]): Unit = !struct.at6 = value
    def _pango_reserved3 : CFuncPtr0[Unit] = struct._7
    def _pango_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at7 = value
    def _pango_reserved4 : CFuncPtr0[Unit] = struct._8
    def _pango_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at8 = value

/**
 * PangoFontFamily:
*/
opaque type _PangoFontFamily = CStruct1[_root_.sn.gnome.gobject.internal.GObject]
object _PangoFontFamily:
  given _tag: Tag[_PangoFontFamily] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObject]
  def apply()(using Zone): Ptr[_PangoFontFamily] = scala.scalanative.unsafe.alloc[_PangoFontFamily](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject)(using Zone): Ptr[_PangoFontFamily] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _PangoFontFamily)
    def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
    def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = !struct.at1 = value

opaque type _PangoFontFamilyClass = CStruct7[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[PangoFontFamily], Ptr[Ptr[Ptr[PangoFontFace]]], Ptr[CInt], Unit], CFuncPtr1[Ptr[PangoFontFamily], Ptr[CUnsignedChar]], CFuncPtr1[Ptr[PangoFontFamily], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[PangoFontFamily], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[PangoFontFamily], Ptr[CUnsignedChar], Ptr[PangoFontFace]], CFuncPtr0[Unit]]
object _PangoFontFamilyClass:
  given _tag: Tag[_PangoFontFamilyClass] = Tag.materializeCStruct7Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[PangoFontFamily], Ptr[Ptr[Ptr[PangoFontFace]]], Ptr[CInt], Unit], CFuncPtr1[Ptr[PangoFontFamily], Ptr[CUnsignedChar]], CFuncPtr1[Ptr[PangoFontFamily], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[PangoFontFamily], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[PangoFontFamily], Ptr[CUnsignedChar], Ptr[PangoFontFace]], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[_PangoFontFamilyClass] = scala.scalanative.unsafe.alloc[_PangoFontFamilyClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, list_faces : CFuncPtr3[Ptr[PangoFontFamily], Ptr[Ptr[Ptr[PangoFontFace]]], Ptr[CInt], Unit], get_name : CFuncPtr1[Ptr[PangoFontFamily], Ptr[CUnsignedChar]], is_monospace : CFuncPtr1[Ptr[PangoFontFamily], _root_.sn.gnome.glib.internal.gboolean], is_variable : CFuncPtr1[Ptr[PangoFontFamily], _root_.sn.gnome.glib.internal.gboolean], get_face : CFuncPtr2[Ptr[PangoFontFamily], Ptr[CUnsignedChar], Ptr[PangoFontFace]], _pango_reserved2 : CFuncPtr0[Unit])(using Zone): Ptr[_PangoFontFamilyClass] = 
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
    def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at1 = value
    def list_faces : CFuncPtr3[Ptr[PangoFontFamily], Ptr[Ptr[Ptr[PangoFontFace]]], Ptr[CInt], Unit] = struct._2
    def list_faces_=(value: CFuncPtr3[Ptr[PangoFontFamily], Ptr[Ptr[Ptr[PangoFontFace]]], Ptr[CInt], Unit]): Unit = !struct.at2 = value
    def get_name : CFuncPtr1[Ptr[PangoFontFamily], Ptr[CUnsignedChar]] = struct._3
    def get_name_=(value: CFuncPtr1[Ptr[PangoFontFamily], Ptr[CUnsignedChar]]): Unit = !struct.at3 = value
    def is_monospace : CFuncPtr1[Ptr[PangoFontFamily], _root_.sn.gnome.glib.internal.gboolean] = struct._4
    def is_monospace_=(value: CFuncPtr1[Ptr[PangoFontFamily], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at4 = value
    def is_variable : CFuncPtr1[Ptr[PangoFontFamily], _root_.sn.gnome.glib.internal.gboolean] = struct._5
    def is_variable_=(value: CFuncPtr1[Ptr[PangoFontFamily], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at5 = value
    def get_face : CFuncPtr2[Ptr[PangoFontFamily], Ptr[CUnsignedChar], Ptr[PangoFontFace]] = struct._6
    def get_face_=(value: CFuncPtr2[Ptr[PangoFontFamily], Ptr[CUnsignedChar], Ptr[PangoFontFace]]): Unit = !struct.at6 = value
    def _pango_reserved2 : CFuncPtr0[Unit] = struct._7
    def _pango_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at7 = value

/**
 * PangoFontMap:
*/
opaque type _PangoFontMap = CStruct1[_root_.sn.gnome.gobject.internal.GObject]
object _PangoFontMap:
  given _tag: Tag[_PangoFontMap] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObject]
  def apply()(using Zone): Ptr[_PangoFontMap] = scala.scalanative.unsafe.alloc[_PangoFontMap](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject)(using Zone): Ptr[_PangoFontMap] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _PangoFontMap)
    def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
    def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = !struct.at1 = value

/**
 * PangoFontMapClass: _class: parent `GObjectClass` _font: a function to load a font with a given description. See pango_font_map_load_font(). _families: A function to list available font families. See pango_font_map_list_families(). _fontset: a function to load a fontset with a given given description suitable for a particular language. See pango_font_map_load_fontset(). _engine_type: the type of rendering-system-dependent engines that can handle fonts of this fonts loaded with this fontmap. _serial: a function to get the serial number of the fontmap. See pango_font_map_get_serial(). : See pango_font_map_changed()
*/
opaque type _PangoFontMapClass = CStruct9[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoFont]], CFuncPtr3[Ptr[PangoFontMap], Ptr[Ptr[Ptr[PangoFontFamily]]], Ptr[CInt], Unit], CFuncPtr4[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoLanguage], Ptr[PangoFontset]], Ptr[CUnsignedChar], CFuncPtr1[Ptr[PangoFontMap], _root_.sn.gnome.glib.internal.guint], CFuncPtr1[Ptr[PangoFontMap], Unit], CFuncPtr2[Ptr[PangoFontMap], Ptr[CUnsignedChar], Ptr[PangoFontFamily]], CFuncPtr2[Ptr[PangoFontMap], Ptr[PangoFont], Ptr[PangoFontFace]]]
object _PangoFontMapClass:
  given _tag: Tag[_PangoFontMapClass] = Tag.materializeCStruct9Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoFont]], CFuncPtr3[Ptr[PangoFontMap], Ptr[Ptr[Ptr[PangoFontFamily]]], Ptr[CInt], Unit], CFuncPtr4[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoLanguage], Ptr[PangoFontset]], Ptr[CUnsignedChar], CFuncPtr1[Ptr[PangoFontMap], _root_.sn.gnome.glib.internal.guint], CFuncPtr1[Ptr[PangoFontMap], Unit], CFuncPtr2[Ptr[PangoFontMap], Ptr[CUnsignedChar], Ptr[PangoFontFamily]], CFuncPtr2[Ptr[PangoFontMap], Ptr[PangoFont], Ptr[PangoFontFace]]]
  def apply()(using Zone): Ptr[_PangoFontMapClass] = scala.scalanative.unsafe.alloc[_PangoFontMapClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, load_font : CFuncPtr3[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoFont]], list_families : CFuncPtr3[Ptr[PangoFontMap], Ptr[Ptr[Ptr[PangoFontFamily]]], Ptr[CInt], Unit], load_fontset : CFuncPtr4[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoLanguage], Ptr[PangoFontset]], shape_engine_type : Ptr[CUnsignedChar], get_serial : CFuncPtr1[Ptr[PangoFontMap], _root_.sn.gnome.glib.internal.guint], changed : CFuncPtr1[Ptr[PangoFontMap], Unit], get_family : CFuncPtr2[Ptr[PangoFontMap], Ptr[CUnsignedChar], Ptr[PangoFontFamily]], get_face : CFuncPtr2[Ptr[PangoFontMap], Ptr[PangoFont], Ptr[PangoFontFace]])(using Zone): Ptr[_PangoFontMapClass] = 
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
    def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at1 = value
    def load_font : CFuncPtr3[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoFont]] = struct._2
    def load_font_=(value: CFuncPtr3[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoFont]]): Unit = !struct.at2 = value
    def list_families : CFuncPtr3[Ptr[PangoFontMap], Ptr[Ptr[Ptr[PangoFontFamily]]], Ptr[CInt], Unit] = struct._3
    def list_families_=(value: CFuncPtr3[Ptr[PangoFontMap], Ptr[Ptr[Ptr[PangoFontFamily]]], Ptr[CInt], Unit]): Unit = !struct.at3 = value
    def load_fontset : CFuncPtr4[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoLanguage], Ptr[PangoFontset]] = struct._4
    def load_fontset_=(value: CFuncPtr4[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoLanguage], Ptr[PangoFontset]]): Unit = !struct.at4 = value
    def shape_engine_type : Ptr[CUnsignedChar] = struct._5
    def shape_engine_type_=(value: Ptr[CUnsignedChar]): Unit = !struct.at5 = value
    def get_serial : CFuncPtr1[Ptr[PangoFontMap], _root_.sn.gnome.glib.internal.guint] = struct._6
    def get_serial_=(value: CFuncPtr1[Ptr[PangoFontMap], _root_.sn.gnome.glib.internal.guint]): Unit = !struct.at6 = value
    def changed : CFuncPtr1[Ptr[PangoFontMap], Unit] = struct._7
    def changed_=(value: CFuncPtr1[Ptr[PangoFontMap], Unit]): Unit = !struct.at7 = value
    def get_family : CFuncPtr2[Ptr[PangoFontMap], Ptr[CUnsignedChar], Ptr[PangoFontFamily]] = struct._8
    def get_family_=(value: CFuncPtr2[Ptr[PangoFontMap], Ptr[CUnsignedChar], Ptr[PangoFontFamily]]): Unit = !struct.at8 = value
    def get_face : CFuncPtr2[Ptr[PangoFontMap], Ptr[PangoFont], Ptr[PangoFontFace]] = struct._9
    def get_face_=(value: CFuncPtr2[Ptr[PangoFontMap], Ptr[PangoFont], Ptr[PangoFontFace]]): Unit = !struct.at9 = value

opaque type _PangoFontMetrics = CStruct10[_root_.sn.gnome.glib.internal.guint, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt]
object _PangoFontMetrics:
  given _tag: Tag[_PangoFontMetrics] = Tag.materializeCStruct10Tag[_root_.sn.gnome.glib.internal.guint, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt]
  def apply()(using Zone): Ptr[_PangoFontMetrics] = scala.scalanative.unsafe.alloc[_PangoFontMetrics](1)
  def apply(ref_count : _root_.sn.gnome.glib.internal.guint, ascent : CInt, descent : CInt, height : CInt, approximate_char_width : CInt, approximate_digit_width : CInt, underline_position : CInt, underline_thickness : CInt, strikethrough_position : CInt, strikethrough_thickness : CInt)(using Zone): Ptr[_PangoFontMetrics] = 
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
    def ref_count : _root_.sn.gnome.glib.internal.guint = struct._1
    def ref_count_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at1 = value
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
*/
opaque type _PangoFontset = CStruct1[_root_.sn.gnome.gobject.internal.GObject]
object _PangoFontset:
  given _tag: Tag[_PangoFontset] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObject]
  def apply()(using Zone): Ptr[_PangoFontset] = scala.scalanative.unsafe.alloc[_PangoFontset](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject)(using Zone): Ptr[_PangoFontset] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  extension (struct: _PangoFontset)
    def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
    def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = !struct.at1 = value

/**
 * PangoFontsetClass: _class: parent `GObjectClass` _font: a function to get the font in the fontset that contains the best glyph for the given Unicode character; see [method.Fontset.get_font] _metrics: a function to get overall metric information for the fonts in the fontset; see [method.Fontset.get_metrics] _language: a function to get the language of the fontset. : a function to loop over the fonts in the fontset. See [method.Fontset.foreach]
*/
opaque type _PangoFontsetClass = CStruct9[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr2[Ptr[PangoFontset], _root_.sn.gnome.glib.internal.guint, Ptr[PangoFont]], CFuncPtr1[Ptr[PangoFontset], Ptr[PangoFontMetrics]], CFuncPtr1[Ptr[PangoFontset], Ptr[PangoLanguage]], CFuncPtr3[Ptr[PangoFontset], PangoFontsetForeachFunc, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object _PangoFontsetClass:
  given _tag: Tag[_PangoFontsetClass] = Tag.materializeCStruct9Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr2[Ptr[PangoFontset], _root_.sn.gnome.glib.internal.guint, Ptr[PangoFont]], CFuncPtr1[Ptr[PangoFontset], Ptr[PangoFontMetrics]], CFuncPtr1[Ptr[PangoFontset], Ptr[PangoLanguage]], CFuncPtr3[Ptr[PangoFontset], PangoFontsetForeachFunc, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[_PangoFontsetClass] = scala.scalanative.unsafe.alloc[_PangoFontsetClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, get_font : CFuncPtr2[Ptr[PangoFontset], _root_.sn.gnome.glib.internal.guint, Ptr[PangoFont]], get_metrics : CFuncPtr1[Ptr[PangoFontset], Ptr[PangoFontMetrics]], get_language : CFuncPtr1[Ptr[PangoFontset], Ptr[PangoLanguage]], foreach : CFuncPtr3[Ptr[PangoFontset], PangoFontsetForeachFunc, _root_.sn.gnome.glib.internal.gpointer, Unit], _pango_reserved1 : CFuncPtr0[Unit], _pango_reserved2 : CFuncPtr0[Unit], _pango_reserved3 : CFuncPtr0[Unit], _pango_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[_PangoFontsetClass] = 
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
    def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at1 = value
    def get_font : CFuncPtr2[Ptr[PangoFontset], _root_.sn.gnome.glib.internal.guint, Ptr[PangoFont]] = struct._2
    def get_font_=(value: CFuncPtr2[Ptr[PangoFontset], _root_.sn.gnome.glib.internal.guint, Ptr[PangoFont]]): Unit = !struct.at2 = value
    def get_metrics : CFuncPtr1[Ptr[PangoFontset], Ptr[PangoFontMetrics]] = struct._3
    def get_metrics_=(value: CFuncPtr1[Ptr[PangoFontset], Ptr[PangoFontMetrics]]): Unit = !struct.at3 = value
    def get_language : CFuncPtr1[Ptr[PangoFontset], Ptr[PangoLanguage]] = struct._4
    def get_language_=(value: CFuncPtr1[Ptr[PangoFontset], Ptr[PangoLanguage]]): Unit = !struct.at4 = value
    def foreach : CFuncPtr3[Ptr[PangoFontset], PangoFontsetForeachFunc, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._5
    def foreach_=(value: CFuncPtr3[Ptr[PangoFontset], PangoFontsetForeachFunc, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at5 = value
    def _pango_reserved1 : CFuncPtr0[Unit] = struct._6
    def _pango_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at6 = value
    def _pango_reserved2 : CFuncPtr0[Unit] = struct._7
    def _pango_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at7 = value
    def _pango_reserved3 : CFuncPtr0[Unit] = struct._8
    def _pango_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at8 = value
    def _pango_reserved4 : CFuncPtr0[Unit] = struct._9
    def _pango_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at9 = value

opaque type _PangoFontsetSimple = CStruct0
object _PangoFontsetSimple:
  given _tag: Tag[_PangoFontsetSimple] = Tag.materializeCStruct0Tag

opaque type _PangoFontsetSimpleClass = CStruct0
object _PangoFontsetSimpleClass:
  given _tag: Tag[_PangoFontsetSimpleClass] = Tag.materializeCStruct0Tag

/**
 * PangoGlyphGeometry: : the logical width to use for the the character. _offset: horizontal offset from nominal character position. _offset: vertical offset from nominal character position.
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

opaque type _PangoGlyphItemIter = CStruct8[Ptr[Byte], Ptr[_root_.sn.gnome.glib.internal.gchar], CInt, CInt, CInt, CInt, CInt, CInt]
object _PangoGlyphItemIter:
  given _tag: Tag[_PangoGlyphItemIter] = Tag.materializeCStruct8Tag[Ptr[Byte], Ptr[_root_.sn.gnome.glib.internal.gchar], CInt, CInt, CInt, CInt, CInt, CInt]
  def apply()(using Zone): Ptr[_PangoGlyphItemIter] = scala.scalanative.unsafe.alloc[_PangoGlyphItemIter](1)
  def apply(glyph_item : Ptr[PangoGlyphItem], text : Ptr[_root_.sn.gnome.glib.internal.gchar], start_glyph : CInt, start_index : CInt, start_char : CInt, end_glyph : CInt, end_index : CInt, end_char : CInt)(using Zone): Ptr[_PangoGlyphItemIter] = 
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
    def text : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
    def text_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at2 = value
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
*/
opaque type _PangoGlyphVisAttr = CStruct2[_root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
object _PangoGlyphVisAttr:
  given _tag: Tag[_PangoGlyphVisAttr] = Tag.materializeCStruct2Tag[_root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
  def apply()(using Zone): Ptr[_PangoGlyphVisAttr] = scala.scalanative.unsafe.alloc[_PangoGlyphVisAttr](1)
  def apply(is_cluster_start : _root_.sn.gnome.glib.internal.guint, is_color : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[_PangoGlyphVisAttr] = 
    val ____ptr = apply()
    (!____ptr).is_cluster_start = is_cluster_start
    (!____ptr).is_color = is_color
    ____ptr
  extension (struct: _PangoGlyphVisAttr)
    def is_cluster_start : _root_.sn.gnome.glib.internal.guint = struct._1
    def is_cluster_start_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at1 = value
    def is_color : _root_.sn.gnome.glib.internal.guint = struct._2
    def is_color_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at2 = value

/**
 * PangoItem: : byte offset of the start of this item in text. : length of this item in bytes. _offset: character offset of the start of this item in text. Since 1.50 : analysis results for the item.
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

opaque type _PangoLanguage = CStruct0
object _PangoLanguage:
  given _tag: Tag[_PangoLanguage] = Tag.materializeCStruct0Tag

opaque type _PangoLayout = CStruct0
object _PangoLayout:
  given _tag: Tag[_PangoLayout] = Tag.materializeCStruct0Tag

opaque type _PangoLayoutClass = CStruct0
object _PangoLayoutClass:
  given _tag: Tag[_PangoLayoutClass] = Tag.materializeCStruct0Tag

opaque type _PangoLayoutIter = CStruct0
object _PangoLayoutIter:
  given _tag: Tag[_PangoLayoutIter] = Tag.materializeCStruct0Tag

/**
 * PangoLayoutLine: : (nullable): the layout this line belongs to, might be %NULL _index: start of line as byte index into layout->text : length of line in bytes : (nullable) (element-type Pango.LayoutRun): list of runs in the line, from left to right _dir: #Resolved PangoDirection of line
*/
opaque type _PangoLayoutLine = CStruct6[Ptr[PangoLayout], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint, Ptr[Byte], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
object _PangoLayoutLine:
  given _tag: Tag[_PangoLayoutLine] = Tag.materializeCStruct6Tag[Ptr[PangoLayout], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint, Ptr[Byte], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
  def apply()(using Zone): Ptr[_PangoLayoutLine] = scala.scalanative.unsafe.alloc[_PangoLayoutLine](1)
  def apply(layout : Ptr[PangoLayout], start_index : _root_.sn.gnome.glib.internal.gint, length : _root_.sn.gnome.glib.internal.gint, runs : Ptr[_root_.sn.gnome.glib.internal.GSList], is_paragraph_start : _root_.sn.gnome.glib.internal.guint, resolved_dir : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[_PangoLayoutLine] = 
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
    def start_index : _root_.sn.gnome.glib.internal.gint = struct._2
    def start_index_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at2 = value
    def length : _root_.sn.gnome.glib.internal.gint = struct._3
    def length_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at3 = value
    def runs : Ptr[_root_.sn.gnome.glib.internal.GSList] = struct._4.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GSList]]
    def runs_=(value: Ptr[_root_.sn.gnome.glib.internal.GSList]): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
    def is_paragraph_start : _root_.sn.gnome.glib.internal.guint = struct._5
    def is_paragraph_start_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at5 = value
    def resolved_dir : _root_.sn.gnome.glib.internal.guint = struct._6
    def resolved_dir_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at6 = value

/**
 * PangoLogAttr: i.e. this is a grapheme boundary, or the first character in the text. This flag implements Unicode's [Grapheme Cluster Boundaries](http://www.unicode.org/reports/tr29/) semantics. Note that in degenerate cases, you could have both and There are two ways to divide sentences. The first assigns all inter-sentence whitespace/control/format chars to some sentence, so all chars are in some sentence; the boundaries there. The second way doesn't assign between-sentence spaces, etc. to any sentence, so Note that in degenerate cases, you could have both and period, so the next sentence starts right away) _deletes_character: if set, backspace deletes one character rather than the entire grapheme cluster. This field is only meaningful on grapheme boundaries (where the full grapheme (e.g. letter + diacritics) is considered a unit, while in others, each decomposed character in the grapheme is a unit. In the default implementation of [func], this bit is set on all grapheme boundaries except those following Latin, Cyrillic or Greek base characters. expanded for justification purposes. (Since: 1.18) More specifically, means that this is not a position in the middle of a word. For example, both sides of a punctuation mark are considered word boundaries. This flag is particularly useful when selecting text word-by-word. This flag implements Unicode's [Word Boundaries](http://www.unicode.org/reports/tr29/) semantics. (Since: 1.22) _inserts_hyphen: when breaking lines before this char, insert a hyphen. Since: 1.50 _removes_preceding: when breaking lines before this char, remove the preceding char. Since 1.50
*/
opaque type _PangoLogAttr = CStruct16[_root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
object _PangoLogAttr:
  given _tag: Tag[_PangoLogAttr] = Tag.materializeCStruct16Tag[_root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
  def apply()(using Zone): Ptr[_PangoLogAttr] = scala.scalanative.unsafe.alloc[_PangoLogAttr](1)
  def apply(is_line_break : _root_.sn.gnome.glib.internal.guint, is_mandatory_break : _root_.sn.gnome.glib.internal.guint, is_char_break : _root_.sn.gnome.glib.internal.guint, is_white : _root_.sn.gnome.glib.internal.guint, is_cursor_position : _root_.sn.gnome.glib.internal.guint, is_word_start : _root_.sn.gnome.glib.internal.guint, is_word_end : _root_.sn.gnome.glib.internal.guint, is_sentence_boundary : _root_.sn.gnome.glib.internal.guint, is_sentence_start : _root_.sn.gnome.glib.internal.guint, is_sentence_end : _root_.sn.gnome.glib.internal.guint, backspace_deletes_character : _root_.sn.gnome.glib.internal.guint, is_expandable_space : _root_.sn.gnome.glib.internal.guint, is_word_boundary : _root_.sn.gnome.glib.internal.guint, break_inserts_hyphen : _root_.sn.gnome.glib.internal.guint, break_removes_preceding : _root_.sn.gnome.glib.internal.guint, reserved : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[_PangoLogAttr] = 
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
    def is_line_break : _root_.sn.gnome.glib.internal.guint = struct._1
    def is_line_break_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at1 = value
    def is_mandatory_break : _root_.sn.gnome.glib.internal.guint = struct._2
    def is_mandatory_break_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at2 = value
    def is_char_break : _root_.sn.gnome.glib.internal.guint = struct._3
    def is_char_break_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at3 = value
    def is_white : _root_.sn.gnome.glib.internal.guint = struct._4
    def is_white_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at4 = value
    def is_cursor_position : _root_.sn.gnome.glib.internal.guint = struct._5
    def is_cursor_position_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at5 = value
    def is_word_start : _root_.sn.gnome.glib.internal.guint = struct._6
    def is_word_start_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at6 = value
    def is_word_end : _root_.sn.gnome.glib.internal.guint = struct._7
    def is_word_end_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at7 = value
    def is_sentence_boundary : _root_.sn.gnome.glib.internal.guint = struct._8
    def is_sentence_boundary_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at8 = value
    def is_sentence_start : _root_.sn.gnome.glib.internal.guint = struct._9
    def is_sentence_start_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at9 = value
    def is_sentence_end : _root_.sn.gnome.glib.internal.guint = struct._10
    def is_sentence_end_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at10 = value
    def backspace_deletes_character : _root_.sn.gnome.glib.internal.guint = struct._11
    def backspace_deletes_character_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at11 = value
    def is_expandable_space : _root_.sn.gnome.glib.internal.guint = struct._12
    def is_expandable_space_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at12 = value
    def is_word_boundary : _root_.sn.gnome.glib.internal.guint = struct._13
    def is_word_boundary_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at13 = value
    def break_inserts_hyphen : _root_.sn.gnome.glib.internal.guint = struct._14
    def break_inserts_hyphen_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at14 = value
    def break_removes_preceding : _root_.sn.gnome.glib.internal.guint = struct._15
    def break_removes_preceding_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at15 = value
    def reserved : _root_.sn.gnome.glib.internal.guint = struct._16
    def reserved_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at16 = value

/**
 * PangoMatrix: : 1st component of the transformation matrix : 2nd component of the transformation matrix : 3rd component of the transformation matrix : 4th component of the transformation matrix : x translation : y translation
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
*/
opaque type _PangoRenderer = CStruct6[_root_.sn.gnome.gobject.internal.GObject, PangoUnderline, _root_.sn.gnome.glib.internal.gboolean, CInt, Ptr[PangoMatrix], Ptr[PangoRendererPrivate]]
object _PangoRenderer:
  given _tag: Tag[_PangoRenderer] = Tag.materializeCStruct6Tag[_root_.sn.gnome.gobject.internal.GObject, PangoUnderline, _root_.sn.gnome.glib.internal.gboolean, CInt, Ptr[PangoMatrix], Ptr[PangoRendererPrivate]]
  def apply()(using Zone): Ptr[_PangoRenderer] = scala.scalanative.unsafe.alloc[_PangoRenderer](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject, underline : PangoUnderline, strikethrough : _root_.sn.gnome.glib.internal.gboolean, active_count : CInt, matrix : Ptr[PangoMatrix], priv : Ptr[PangoRendererPrivate])(using Zone): Ptr[_PangoRenderer] = 
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).underline = underline
    (!____ptr).strikethrough = strikethrough
    (!____ptr).active_count = active_count
    (!____ptr).matrix = matrix
    (!____ptr).priv = priv
    ____ptr
  extension (struct: _PangoRenderer)
    def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
    def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = !struct.at1 = value
    def underline : PangoUnderline = struct._2
    def underline_=(value: PangoUnderline): Unit = !struct.at2 = value
    def strikethrough : _root_.sn.gnome.glib.internal.gboolean = struct._3
    def strikethrough_=(value: _root_.sn.gnome.glib.internal.gboolean): Unit = !struct.at3 = value
    def active_count : CInt = struct._4
    def active_count_=(value: CInt): Unit = !struct.at4 = value
    def matrix : Ptr[PangoMatrix] = struct._5
    def matrix_=(value: Ptr[PangoMatrix]): Unit = !struct.at5 = value
    def priv : Ptr[PangoRendererPrivate] = struct._6
    def priv_=(value: Ptr[PangoRendererPrivate]): Unit = !struct.at6 = value

/**
 * PangoRendererClass: _glyphs: draws a `PangoGlyphString` _rectangle: draws a rectangle _error_underline: draws a squiggly line that approximately covers the given rectangle in the style of an underline used to indicate a spelling error. _shape: draw content for a glyph shaped with `PangoAttrShape` , are the coordinates of the left edge of the baseline, in user coordinates. _trapezoid: draws a trapezoidal filled area _glyph: draws a single glyph
*/
opaque type _PangoRendererClass = CStruct15[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], Ptr[PangoGlyphString], CInt, CInt, Unit], CFuncPtr6[Ptr[PangoRenderer], PangoRenderPart, CInt, CInt, CInt, CInt, Unit], CFuncPtr5[Ptr[PangoRenderer], CInt, CInt, CInt, CInt, Unit], CFuncPtr4[Ptr[PangoRenderer], Ptr[Byte], CInt, CInt, Unit], CFuncPtr8[Ptr[PangoRenderer], PangoRenderPart, Double, Double, Double, Double, Double, Double, Unit], CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], PangoGlyph, Double, Double, Unit], CFuncPtr2[Ptr[PangoRenderer], PangoRenderPart, Unit], CFuncPtr1[Ptr[PangoRenderer], Unit], CFuncPtr1[Ptr[PangoRenderer], Unit], CFuncPtr2[Ptr[PangoRenderer], Ptr[Byte], Unit], CFuncPtr5[Ptr[PangoRenderer], Ptr[CUnsignedChar], Ptr[Byte], CInt, CInt, Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
object _PangoRendererClass:
  given _tag: Tag[_PangoRendererClass] = Tag.materializeCStruct15Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], Ptr[PangoGlyphString], CInt, CInt, Unit], CFuncPtr6[Ptr[PangoRenderer], PangoRenderPart, CInt, CInt, CInt, CInt, Unit], CFuncPtr5[Ptr[PangoRenderer], CInt, CInt, CInt, CInt, Unit], CFuncPtr4[Ptr[PangoRenderer], Ptr[Byte], CInt, CInt, Unit], CFuncPtr8[Ptr[PangoRenderer], PangoRenderPart, Double, Double, Double, Double, Double, Double, Unit], CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], PangoGlyph, Double, Double, Unit], CFuncPtr2[Ptr[PangoRenderer], PangoRenderPart, Unit], CFuncPtr1[Ptr[PangoRenderer], Unit], CFuncPtr1[Ptr[PangoRenderer], Unit], CFuncPtr2[Ptr[PangoRenderer], Ptr[Byte], Unit], CFuncPtr5[Ptr[PangoRenderer], Ptr[CUnsignedChar], Ptr[Byte], CInt, CInt, Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  def apply()(using Zone): Ptr[_PangoRendererClass] = scala.scalanative.unsafe.alloc[_PangoRendererClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, draw_glyphs : CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], Ptr[PangoGlyphString], CInt, CInt, Unit], draw_rectangle : CFuncPtr6[Ptr[PangoRenderer], PangoRenderPart, CInt, CInt, CInt, CInt, Unit], draw_error_underline : CFuncPtr5[Ptr[PangoRenderer], CInt, CInt, CInt, CInt, Unit], draw_shape : CFuncPtr4[Ptr[PangoRenderer], Ptr[PangoAttrShape], CInt, CInt, Unit], draw_trapezoid : CFuncPtr8[Ptr[PangoRenderer], PangoRenderPart, Double, Double, Double, Double, Double, Double, Unit], draw_glyph : CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], PangoGlyph, Double, Double, Unit], part_changed : CFuncPtr2[Ptr[PangoRenderer], PangoRenderPart, Unit], begin : CFuncPtr1[Ptr[PangoRenderer], Unit], end : CFuncPtr1[Ptr[PangoRenderer], Unit], prepare_run : CFuncPtr2[Ptr[PangoRenderer], Ptr[PangoLayoutRun], Unit], draw_glyph_item : CFuncPtr5[Ptr[PangoRenderer], Ptr[CUnsignedChar], Ptr[PangoGlyphItem], CInt, CInt, Unit], _pango_reserved2 : CFuncPtr0[Unit], _pango_reserved3 : CFuncPtr0[Unit], _pango_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[_PangoRendererClass] = 
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
    def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
    def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at1 = value
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
    def draw_glyph_item : CFuncPtr5[Ptr[PangoRenderer], Ptr[CUnsignedChar], Ptr[PangoGlyphItem], CInt, CInt, Unit] = struct._12.asInstanceOf[CFuncPtr5[Ptr[PangoRenderer], Ptr[CUnsignedChar], Ptr[PangoGlyphItem], CInt, CInt, Unit]]
    def draw_glyph_item_=(value: CFuncPtr5[Ptr[PangoRenderer], Ptr[CUnsignedChar], Ptr[PangoGlyphItem], CInt, CInt, Unit]): Unit = !struct.at12 = value.asInstanceOf[CFuncPtr5[Ptr[PangoRenderer], Ptr[CUnsignedChar], Ptr[Byte], CInt, CInt, Unit]]
    def _pango_reserved2 : CFuncPtr0[Unit] = struct._13
    def _pango_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at13 = value
    def _pango_reserved3 : CFuncPtr0[Unit] = struct._14
    def _pango_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at14 = value
    def _pango_reserved4 : CFuncPtr0[Unit] = struct._15
    def _pango_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at15 = value

opaque type _PangoRendererPrivate = CStruct0
object _PangoRendererPrivate:
  given _tag: Tag[_PangoRendererPrivate] = Tag.materializeCStruct0Tag

opaque type _PangoScriptIter = CStruct0
object _PangoScriptIter:
  given _tag: Tag[_PangoScriptIter] = Tag.materializeCStruct0Tag

opaque type _PangoTabArray = CStruct0
object _PangoTabArray:
  given _tag: Tag[_PangoTabArray] = Tag.materializeCStruct0Tag