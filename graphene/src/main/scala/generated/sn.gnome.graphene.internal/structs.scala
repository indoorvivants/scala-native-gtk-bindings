package sn.gnome.graphene.internal

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * graphene_box_t:
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