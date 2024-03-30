package cairo
package structs

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

import _root_.cairo.enumerations.*
import _root_.cairo.aliases.*
import _root_.cairo.structs.*
import _root_.cairo.unions.*

/**
 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type _cairo = CStruct0
object _cairo:
  given _tag: Tag[_cairo] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type _cairo_device = CStruct0
object _cairo_device:
  given _tag: Tag[_cairo_device] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type _cairo_font_face = CStruct0
object _cairo_font_face:
  given _tag: Tag[_cairo_font_face] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type _cairo_font_options = CStruct0
object _cairo_font_options:
  given _tag: Tag[_cairo_font_options] = Tag.materializeCStruct0Tag

/**
 * cairo_matrix_t: : xx component of the affine transformation : yx component of the affine transformation : xy component of the affine transformation : yy component of the affine transformation : X translation component of the affine transformation : Y translation component of the affine transformation

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type _cairo_matrix = CStruct6[Double, Double, Double, Double, Double, Double]
object _cairo_matrix:
  given _tag: Tag[_cairo_matrix] = Tag.materializeCStruct6Tag[Double, Double, Double, Double, Double, Double]
  def apply()(using Zone): Ptr[_cairo_matrix] = scala.scalanative.unsafe.alloc[_cairo_matrix](1)
  def apply(xx : Double, yx : Double, xy : Double, yy : Double, x0 : Double, y0 : Double)(using Zone): Ptr[_cairo_matrix] = 
    val ____ptr = apply()
    (!____ptr).xx = xx
    (!____ptr).yx = yx
    (!____ptr).xy = xy
    (!____ptr).yy = yy
    (!____ptr).x0 = x0
    (!____ptr).y0 = y0
    ____ptr
  extension (struct: _cairo_matrix)
    def xx : Double = struct._1
    def xx_=(value: Double): Unit = !struct.at1 = value
    def yx : Double = struct._2
    def yx_=(value: Double): Unit = !struct.at2 = value
    def xy : Double = struct._3
    def xy_=(value: Double): Unit = !struct.at3 = value
    def yy : Double = struct._4
    def yy_=(value: Double): Unit = !struct.at4 = value
    def x0 : Double = struct._5
    def x0_=(value: Double): Unit = !struct.at5 = value
    def y0 : Double = struct._6
    def y0_=(value: Double): Unit = !struct.at6 = value

/**
 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type _cairo_pattern = CStruct0
object _cairo_pattern:
  given _tag: Tag[_cairo_pattern] = Tag.materializeCStruct0Tag

/**
 * cairo_rectangle_t: : X coordinate of the left side of the rectangle : Y coordinate of the the top side of the rectangle : width of the rectangle : height of the rectangle

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type _cairo_rectangle = CStruct4[Double, Double, Double, Double]
object _cairo_rectangle:
  given _tag: Tag[_cairo_rectangle] = Tag.materializeCStruct4Tag[Double, Double, Double, Double]
  def apply()(using Zone): Ptr[_cairo_rectangle] = scala.scalanative.unsafe.alloc[_cairo_rectangle](1)
  def apply(x : Double, y : Double, width : Double, height : Double)(using Zone): Ptr[_cairo_rectangle] = 
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).width = width
    (!____ptr).height = height
    ____ptr
  extension (struct: _cairo_rectangle)
    def x : Double = struct._1
    def x_=(value: Double): Unit = !struct.at1 = value
    def y : Double = struct._2
    def y_=(value: Double): Unit = !struct.at2 = value
    def width : Double = struct._3
    def width_=(value: Double): Unit = !struct.at3 = value
    def height : Double = struct._4
    def height_=(value: Double): Unit = !struct.at4 = value

/**
 * cairo_rectangle_int_t: : X coordinate of the left side of the rectangle : Y coordinate of the the top side of the rectangle : width of the rectangle : height of the rectangle

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type _cairo_rectangle_int = CStruct4[CInt, CInt, CInt, CInt]
object _cairo_rectangle_int:
  given _tag: Tag[_cairo_rectangle_int] = Tag.materializeCStruct4Tag[CInt, CInt, CInt, CInt]
  def apply()(using Zone): Ptr[_cairo_rectangle_int] = scala.scalanative.unsafe.alloc[_cairo_rectangle_int](1)
  def apply(x : CInt, y : CInt, width : CInt, height : CInt)(using Zone): Ptr[_cairo_rectangle_int] = 
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).width = width
    (!____ptr).height = height
    ____ptr
  extension (struct: _cairo_rectangle_int)
    def x : CInt = struct._1
    def x_=(value: CInt): Unit = !struct.at1 = value
    def y : CInt = struct._2
    def y_=(value: CInt): Unit = !struct.at2 = value
    def width : CInt = struct._3
    def width_=(value: CInt): Unit = !struct.at3 = value
    def height : CInt = struct._4
    def height_=(value: CInt): Unit = !struct.at4 = value

/**
 * cairo_rectangle_list_t: : Error status of the rectangle list : Array containing the rectangles

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type _cairo_rectangle_list = CStruct3[cairo_status_t, Ptr[cairo_rectangle_t], CInt]
object _cairo_rectangle_list:
  given _tag: Tag[_cairo_rectangle_list] = Tag.materializeCStruct3Tag[cairo_status_t, Ptr[cairo_rectangle_t], CInt]
  def apply()(using Zone): Ptr[_cairo_rectangle_list] = scala.scalanative.unsafe.alloc[_cairo_rectangle_list](1)
  def apply(status : cairo_status_t, rectangles : Ptr[cairo_rectangle_t], num_rectangles : CInt)(using Zone): Ptr[_cairo_rectangle_list] = 
    val ____ptr = apply()
    (!____ptr).status = status
    (!____ptr).rectangles = rectangles
    (!____ptr).num_rectangles = num_rectangles
    ____ptr
  extension (struct: _cairo_rectangle_list)
    def status : cairo_status_t = struct._1
    def status_=(value: cairo_status_t): Unit = !struct.at1 = value
    def rectangles : Ptr[cairo_rectangle_t] = struct._2
    def rectangles_=(value: Ptr[cairo_rectangle_t]): Unit = !struct.at2 = value
    def num_rectangles : CInt = struct._3
    def num_rectangles_=(value: CInt): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type _cairo_region = CStruct0
object _cairo_region:
  given _tag: Tag[_cairo_region] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type _cairo_scaled_font = CStruct0
object _cairo_scaled_font:
  given _tag: Tag[_cairo_scaled_font] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type _cairo_surface = CStruct0
object _cairo_surface:
  given _tag: Tag[_cairo_surface] = Tag.materializeCStruct0Tag

/**
 * cairo_user_data_key_t: : not used; ignore.

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type _cairo_user_data_key = CStruct1[CInt]
object _cairo_user_data_key:
  given _tag: Tag[_cairo_user_data_key] = Tag.materializeCStruct1Tag[CInt]
  def apply()(using Zone): Ptr[_cairo_user_data_key] = scala.scalanative.unsafe.alloc[_cairo_user_data_key](1)
  def apply(unused : CInt)(using Zone): Ptr[_cairo_user_data_key] = 
    val ____ptr = apply()
    (!____ptr).unused = unused
    ____ptr
  extension (struct: _cairo_user_data_key)
    def unused : CInt = struct._1
    def unused_=(value: CInt): Unit = !struct.at1 = value

/**
 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type cairo_device_t = CStruct0
object cairo_device_t:
  given _tag: Tag[cairo_device_t] = Tag.materializeCStruct0Tag

/**
 * cairo_font_extents_t: : the distance that the font extends above the baseline. Note that this is not always exactly equal to the maximum of the extents of all the glyphs in the font, but rather is picked to express the font designer's intent as to how the font should align with elements above it. : the distance that the font extends below the baseline. This value is positive for typical fonts that include portions below the baseline. Note that this is not always exactly equal to the maximum of the extents of all the glyphs in the font, but rather is picked to express the font designer's intent as to how the font should align with elements below it. : the recommended vertical distance between baselines when setting consecutive lines of text with the font. This is greater than + by a quantity known as the <firstterm>line spacing</firstterm> or <firstterm>external leading</firstterm>. When space is at a premium, most fonts can be set with only a distance of + between lines. _x_advance: the maximum distance in the X direction that the origin is advanced for any glyph in the font. _y_advance: the maximum distance in the Y direction that the origin is advanced for any glyph in the font. This will be zero for normal fonts used for horizontal writing. (The scripts of East Asia are sometimes written vertically.)

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type cairo_font_extents_t = CStruct5[Double, Double, Double, Double, Double]
object cairo_font_extents_t:
  given _tag: Tag[cairo_font_extents_t] = Tag.materializeCStruct5Tag[Double, Double, Double, Double, Double]
  def apply()(using Zone): Ptr[cairo_font_extents_t] = scala.scalanative.unsafe.alloc[cairo_font_extents_t](1)
  def apply(ascent : Double, descent : Double, height : Double, max_x_advance : Double, max_y_advance : Double)(using Zone): Ptr[cairo_font_extents_t] = 
    val ____ptr = apply()
    (!____ptr).ascent = ascent
    (!____ptr).descent = descent
    (!____ptr).height = height
    (!____ptr).max_x_advance = max_x_advance
    (!____ptr).max_y_advance = max_y_advance
    ____ptr
  extension (struct: cairo_font_extents_t)
    def ascent : Double = struct._1
    def ascent_=(value: Double): Unit = !struct.at1 = value
    def descent : Double = struct._2
    def descent_=(value: Double): Unit = !struct.at2 = value
    def height : Double = struct._3
    def height_=(value: Double): Unit = !struct.at3 = value
    def max_x_advance : Double = struct._4
    def max_x_advance_=(value: Double): Unit = !struct.at4 = value
    def max_y_advance : Double = struct._5
    def max_y_advance_=(value: Double): Unit = !struct.at5 = value

/**
 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type cairo_font_face_t = CStruct0
object cairo_font_face_t:
  given _tag: Tag[cairo_font_face_t] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type cairo_font_options_t = CStruct0
object cairo_font_options_t:
  given _tag: Tag[cairo_font_options_t] = Tag.materializeCStruct0Tag

/**
 * cairo_glyph_t: : glyph index in the font. The exact interpretation of the glyph index depends on the font technology being used. : the offset in the X direction between the origin used for drawing or measuring the string and the origin of this glyph. : the offset in the Y direction between the origin used for drawing or measuring the string and the origin of this glyph.

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type cairo_glyph_t = CStruct3[CUnsignedLongInt, Double, Double]
object cairo_glyph_t:
  given _tag: Tag[cairo_glyph_t] = Tag.materializeCStruct3Tag[CUnsignedLongInt, Double, Double]
  def apply()(using Zone): Ptr[cairo_glyph_t] = scala.scalanative.unsafe.alloc[cairo_glyph_t](1)
  def apply(index : CUnsignedLongInt, x : Double, y : Double)(using Zone): Ptr[cairo_glyph_t] = 
    val ____ptr = apply()
    (!____ptr).index = index
    (!____ptr).x = x
    (!____ptr).y = y
    ____ptr
  extension (struct: cairo_glyph_t)
    def index : CUnsignedLongInt = struct._1
    def index_=(value: CUnsignedLongInt): Unit = !struct.at1 = value
    def x : Double = struct._2
    def x_=(value: Double): Unit = !struct.at2 = value
    def y : Double = struct._3
    def y_=(value: Double): Unit = !struct.at3 = value

/**
 * cairo_matrix_t: : xx component of the affine transformation : yx component of the affine transformation : xy component of the affine transformation : yy component of the affine transformation : X translation component of the affine transformation : Y translation component of the affine transformation

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type cairo_matrix_t = CStruct6[Double, Double, Double, Double, Double, Double]
object cairo_matrix_t:
  given _tag: Tag[cairo_matrix_t] = Tag.materializeCStruct6Tag[Double, Double, Double, Double, Double, Double]
  def apply()(using Zone): Ptr[cairo_matrix_t] = scala.scalanative.unsafe.alloc[cairo_matrix_t](1)
  def apply(xx : Double, yx : Double, xy : Double, yy : Double, x0 : Double, y0 : Double)(using Zone): Ptr[cairo_matrix_t] = 
    val ____ptr = apply()
    (!____ptr).xx = xx
    (!____ptr).yx = yx
    (!____ptr).xy = xy
    (!____ptr).yy = yy
    (!____ptr).x0 = x0
    (!____ptr).y0 = y0
    ____ptr
  extension (struct: cairo_matrix_t)
    def xx : Double = struct._1
    def xx_=(value: Double): Unit = !struct.at1 = value
    def yx : Double = struct._2
    def yx_=(value: Double): Unit = !struct.at2 = value
    def xy : Double = struct._3
    def xy_=(value: Double): Unit = !struct.at3 = value
    def yy : Double = struct._4
    def yy_=(value: Double): Unit = !struct.at4 = value
    def x0 : Double = struct._5
    def x0_=(value: Double): Unit = !struct.at5 = value
    def y0 : Double = struct._6
    def y0_=(value: Double): Unit = !struct.at6 = value

/**
 * cairo_path_t: : the current error status

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type cairo_path = CStruct3[cairo_status_t, Ptr[cairo_path_data_t], CInt]
object cairo_path:
  given _tag: Tag[cairo_path] = Tag.materializeCStruct3Tag[cairo_status_t, Ptr[cairo_path_data_t], CInt]
  def apply()(using Zone): Ptr[cairo_path] = scala.scalanative.unsafe.alloc[cairo_path](1)
  def apply(status : cairo_status_t, data : Ptr[cairo_path_data_t], num_data : CInt)(using Zone): Ptr[cairo_path] = 
    val ____ptr = apply()
    (!____ptr).status = status
    (!____ptr).data = data
    (!____ptr).num_data = num_data
    ____ptr
  extension (struct: cairo_path)
    def status : cairo_status_t = struct._1
    def status_=(value: cairo_status_t): Unit = !struct.at1 = value
    def data : Ptr[cairo_path_data_t] = struct._2
    def data_=(value: Ptr[cairo_path_data_t]): Unit = !struct.at2 = value
    def num_data : CInt = struct._3
    def num_data_=(value: CInt): Unit = !struct.at3 = value

/**
 * cairo_path_t: : the current error status

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type cairo_path_t = CStruct3[cairo_status_t, Ptr[cairo_path_data_t], CInt]
object cairo_path_t:
  given _tag: Tag[cairo_path_t] = Tag.materializeCStruct3Tag[cairo_status_t, Ptr[cairo_path_data_t], CInt]
  def apply()(using Zone): Ptr[cairo_path_t] = scala.scalanative.unsafe.alloc[cairo_path_t](1)
  def apply(status : cairo_status_t, data : Ptr[cairo_path_data_t], num_data : CInt)(using Zone): Ptr[cairo_path_t] = 
    val ____ptr = apply()
    (!____ptr).status = status
    (!____ptr).data = data
    (!____ptr).num_data = num_data
    ____ptr
  extension (struct: cairo_path_t)
    def status : cairo_status_t = struct._1
    def status_=(value: cairo_status_t): Unit = !struct.at1 = value
    def data : Ptr[cairo_path_data_t] = struct._2
    def data_=(value: Ptr[cairo_path_data_t]): Unit = !struct.at2 = value
    def num_data : CInt = struct._3
    def num_data_=(value: CInt): Unit = !struct.at3 = value

/**
 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type cairo_pattern_t = CStruct0
object cairo_pattern_t:
  given _tag: Tag[cairo_pattern_t] = Tag.materializeCStruct0Tag

/**
 * cairo_rectangle_int_t: : X coordinate of the left side of the rectangle : Y coordinate of the the top side of the rectangle : width of the rectangle : height of the rectangle

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type cairo_rectangle_int_t = CStruct4[CInt, CInt, CInt, CInt]
object cairo_rectangle_int_t:
  given _tag: Tag[cairo_rectangle_int_t] = Tag.materializeCStruct4Tag[CInt, CInt, CInt, CInt]
  def apply()(using Zone): Ptr[cairo_rectangle_int_t] = scala.scalanative.unsafe.alloc[cairo_rectangle_int_t](1)
  def apply(x : CInt, y : CInt, width : CInt, height : CInt)(using Zone): Ptr[cairo_rectangle_int_t] = 
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).width = width
    (!____ptr).height = height
    ____ptr
  extension (struct: cairo_rectangle_int_t)
    def x : CInt = struct._1
    def x_=(value: CInt): Unit = !struct.at1 = value
    def y : CInt = struct._2
    def y_=(value: CInt): Unit = !struct.at2 = value
    def width : CInt = struct._3
    def width_=(value: CInt): Unit = !struct.at3 = value
    def height : CInt = struct._4
    def height_=(value: CInt): Unit = !struct.at4 = value

/**
 * cairo_rectangle_list_t: : Error status of the rectangle list : Array containing the rectangles

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type cairo_rectangle_list_t = CStruct3[cairo_status_t, Ptr[cairo_rectangle_t], CInt]
object cairo_rectangle_list_t:
  given _tag: Tag[cairo_rectangle_list_t] = Tag.materializeCStruct3Tag[cairo_status_t, Ptr[cairo_rectangle_t], CInt]
  def apply()(using Zone): Ptr[cairo_rectangle_list_t] = scala.scalanative.unsafe.alloc[cairo_rectangle_list_t](1)
  def apply(status : cairo_status_t, rectangles : Ptr[cairo_rectangle_t], num_rectangles : CInt)(using Zone): Ptr[cairo_rectangle_list_t] = 
    val ____ptr = apply()
    (!____ptr).status = status
    (!____ptr).rectangles = rectangles
    (!____ptr).num_rectangles = num_rectangles
    ____ptr
  extension (struct: cairo_rectangle_list_t)
    def status : cairo_status_t = struct._1
    def status_=(value: cairo_status_t): Unit = !struct.at1 = value
    def rectangles : Ptr[cairo_rectangle_t] = struct._2
    def rectangles_=(value: Ptr[cairo_rectangle_t]): Unit = !struct.at2 = value
    def num_rectangles : CInt = struct._3
    def num_rectangles_=(value: CInt): Unit = !struct.at3 = value

/**
 * cairo_rectangle_t: : X coordinate of the left side of the rectangle : Y coordinate of the the top side of the rectangle : width of the rectangle : height of the rectangle

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type cairo_rectangle_t = CStruct4[Double, Double, Double, Double]
object cairo_rectangle_t:
  given _tag: Tag[cairo_rectangle_t] = Tag.materializeCStruct4Tag[Double, Double, Double, Double]
  def apply()(using Zone): Ptr[cairo_rectangle_t] = scala.scalanative.unsafe.alloc[cairo_rectangle_t](1)
  def apply(x : Double, y : Double, width : Double, height : Double)(using Zone): Ptr[cairo_rectangle_t] = 
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).width = width
    (!____ptr).height = height
    ____ptr
  extension (struct: cairo_rectangle_t)
    def x : Double = struct._1
    def x_=(value: Double): Unit = !struct.at1 = value
    def y : Double = struct._2
    def y_=(value: Double): Unit = !struct.at2 = value
    def width : Double = struct._3
    def width_=(value: Double): Unit = !struct.at3 = value
    def height : Double = struct._4
    def height_=(value: Double): Unit = !struct.at4 = value

/**
 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type cairo_region_t = CStruct0
object cairo_region_t:
  given _tag: Tag[cairo_region_t] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type cairo_scaled_font_t = CStruct0
object cairo_scaled_font_t:
  given _tag: Tag[cairo_scaled_font_t] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type cairo_surface_t = CStruct0
object cairo_surface_t:
  given _tag: Tag[cairo_surface_t] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type cairo_t = CStruct0
object cairo_t:
  given _tag: Tag[cairo_t] = Tag.materializeCStruct0Tag

/**
 * cairo_text_cluster_t:

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type cairo_text_cluster_t = CStruct2[CInt, CInt]
object cairo_text_cluster_t:
  given _tag: Tag[cairo_text_cluster_t] = Tag.materializeCStruct2Tag[CInt, CInt]
  def apply()(using Zone): Ptr[cairo_text_cluster_t] = scala.scalanative.unsafe.alloc[cairo_text_cluster_t](1)
  def apply(num_bytes : CInt, num_glyphs : CInt)(using Zone): Ptr[cairo_text_cluster_t] = 
    val ____ptr = apply()
    (!____ptr).num_bytes = num_bytes
    (!____ptr).num_glyphs = num_glyphs
    ____ptr
  extension (struct: cairo_text_cluster_t)
    def num_bytes : CInt = struct._1
    def num_bytes_=(value: CInt): Unit = !struct.at1 = value
    def num_glyphs : CInt = struct._2
    def num_glyphs_=(value: CInt): Unit = !struct.at2 = value

/**
 * cairo_text_extents_t: _bearing: the horizontal distance from the origin to the leftmost part of the glyphs as drawn. Positive if the glyphs lie entirely to the right of the origin. _bearing: the vertical distance from the origin to the topmost part of the glyphs as drawn. Positive only if the glyphs lie completely below the origin; will usually be negative. : width of the glyphs as drawn : height of the glyphs as drawn _advance:distance to advance in the X direction after drawing these glyphs _advance: distance to advance in the Y direction after drawing these glyphs. Will typically be zero except for vertical text layout as found in East-Asian languages.

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type cairo_text_extents_t = CStruct6[Double, Double, Double, Double, Double, Double]
object cairo_text_extents_t:
  given _tag: Tag[cairo_text_extents_t] = Tag.materializeCStruct6Tag[Double, Double, Double, Double, Double, Double]
  def apply()(using Zone): Ptr[cairo_text_extents_t] = scala.scalanative.unsafe.alloc[cairo_text_extents_t](1)
  def apply(x_bearing : Double, y_bearing : Double, width : Double, height : Double, x_advance : Double, y_advance : Double)(using Zone): Ptr[cairo_text_extents_t] = 
    val ____ptr = apply()
    (!____ptr).x_bearing = x_bearing
    (!____ptr).y_bearing = y_bearing
    (!____ptr).width = width
    (!____ptr).height = height
    (!____ptr).x_advance = x_advance
    (!____ptr).y_advance = y_advance
    ____ptr
  extension (struct: cairo_text_extents_t)
    def x_bearing : Double = struct._1
    def x_bearing_=(value: Double): Unit = !struct.at1 = value
    def y_bearing : Double = struct._2
    def y_bearing_=(value: Double): Unit = !struct.at2 = value
    def width : Double = struct._3
    def width_=(value: Double): Unit = !struct.at3 = value
    def height : Double = struct._4
    def height_=(value: Double): Unit = !struct.at4 = value
    def x_advance : Double = struct._5
    def x_advance_=(value: Double): Unit = !struct.at5 = value
    def y_advance : Double = struct._6
    def y_advance_=(value: Double): Unit = !struct.at6 = value

/**
 * cairo_user_data_key_t: : not used; ignore.

 * [bindgen] header: /usr/include/cairo/cairo.h
*/
opaque type cairo_user_data_key_t = CStruct1[CInt]
object cairo_user_data_key_t:
  given _tag: Tag[cairo_user_data_key_t] = Tag.materializeCStruct1Tag[CInt]
  def apply()(using Zone): Ptr[cairo_user_data_key_t] = scala.scalanative.unsafe.alloc[cairo_user_data_key_t](1)
  def apply(unused : CInt)(using Zone): Ptr[cairo_user_data_key_t] = 
    val ____ptr = apply()
    (!____ptr).unused = unused
    ____ptr
  extension (struct: cairo_user_data_key_t)
    def unused : CInt = struct._1
    def unused_=(value: CInt): Unit = !struct.at1 = value

