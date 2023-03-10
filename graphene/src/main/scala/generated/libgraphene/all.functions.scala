package libgraphene
package all

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

export _root_.libgraphene.functions.graphene_box_alloc
export _root_.libgraphene.functions.graphene_box_contains_box
export _root_.libgraphene.functions.graphene_box_contains_point
export _root_.libgraphene.functions.graphene_box_empty
export _root_.libgraphene.functions.graphene_box_equal
export _root_.libgraphene.functions.graphene_box_expand
export _root_.libgraphene.functions.graphene_box_expand_scalar
export _root_.libgraphene.functions.graphene_box_expand_vec3
export _root_.libgraphene.functions.graphene_box_free
export _root_.libgraphene.functions.graphene_box_get_bounding_sphere
export _root_.libgraphene.functions.graphene_box_get_center
export _root_.libgraphene.functions.graphene_box_get_depth
export _root_.libgraphene.functions.graphene_box_get_height
export _root_.libgraphene.functions.graphene_box_get_max
export _root_.libgraphene.functions.graphene_box_get_min
export _root_.libgraphene.functions.graphene_box_get_size
export _root_.libgraphene.functions.graphene_box_get_vertices
export _root_.libgraphene.functions.graphene_box_get_width
export _root_.libgraphene.functions.graphene_box_infinite
export _root_.libgraphene.functions.graphene_box_init
export _root_.libgraphene.functions.graphene_box_init_from_box
export _root_.libgraphene.functions.graphene_box_init_from_points
export _root_.libgraphene.functions.graphene_box_init_from_vec3
export _root_.libgraphene.functions.graphene_box_init_from_vectors
export _root_.libgraphene.functions.graphene_box_intersection
export _root_.libgraphene.functions.graphene_box_minus_one
export _root_.libgraphene.functions.graphene_box_one
export _root_.libgraphene.functions.graphene_box_one_minus_one
export _root_.libgraphene.functions.graphene_box_union
export _root_.libgraphene.functions.graphene_box_zero
export _root_.libgraphene.functions.graphene_euler_alloc
export _root_.libgraphene.functions.graphene_euler_equal
export _root_.libgraphene.functions.graphene_euler_free
export _root_.libgraphene.functions.graphene_euler_get_alpha
export _root_.libgraphene.functions.graphene_euler_get_beta
export _root_.libgraphene.functions.graphene_euler_get_gamma
export _root_.libgraphene.functions.graphene_euler_get_order
export _root_.libgraphene.functions.graphene_euler_get_x
export _root_.libgraphene.functions.graphene_euler_get_y
export _root_.libgraphene.functions.graphene_euler_get_z
export _root_.libgraphene.functions.graphene_euler_init
export _root_.libgraphene.functions.graphene_euler_init_from_euler
export _root_.libgraphene.functions.graphene_euler_init_from_matrix
export _root_.libgraphene.functions.graphene_euler_init_from_quaternion
export _root_.libgraphene.functions.graphene_euler_init_from_radians
export _root_.libgraphene.functions.graphene_euler_init_from_vec3
export _root_.libgraphene.functions.graphene_euler_init_with_order
export _root_.libgraphene.functions.graphene_euler_reorder
export _root_.libgraphene.functions.graphene_euler_to_matrix
export _root_.libgraphene.functions.graphene_euler_to_quaternion
export _root_.libgraphene.functions.graphene_euler_to_vec3
export _root_.libgraphene.functions.graphene_frustum_alloc
export _root_.libgraphene.functions.graphene_frustum_contains_point
export _root_.libgraphene.functions.graphene_frustum_equal
export _root_.libgraphene.functions.graphene_frustum_free
export _root_.libgraphene.functions.graphene_frustum_get_planes
export _root_.libgraphene.functions.graphene_frustum_init
export _root_.libgraphene.functions.graphene_frustum_init_from_frustum
export _root_.libgraphene.functions.graphene_frustum_init_from_matrix
export _root_.libgraphene.functions.graphene_frustum_intersects_box
export _root_.libgraphene.functions.graphene_frustum_intersects_sphere
export _root_.libgraphene.functions.graphene_matrix_alloc
export _root_.libgraphene.functions.graphene_matrix_decompose
export _root_.libgraphene.functions.graphene_matrix_determinant
export _root_.libgraphene.functions.graphene_matrix_equal
export _root_.libgraphene.functions.graphene_matrix_equal_fast
export _root_.libgraphene.functions.graphene_matrix_free
export _root_.libgraphene.functions.graphene_matrix_get_row
export _root_.libgraphene.functions.graphene_matrix_get_value
export _root_.libgraphene.functions.graphene_matrix_get_x_scale
export _root_.libgraphene.functions.graphene_matrix_get_x_translation
export _root_.libgraphene.functions.graphene_matrix_get_y_scale
export _root_.libgraphene.functions.graphene_matrix_get_y_translation
export _root_.libgraphene.functions.graphene_matrix_get_z_scale
export _root_.libgraphene.functions.graphene_matrix_get_z_translation
export _root_.libgraphene.functions.graphene_matrix_init_from_2d
export _root_.libgraphene.functions.graphene_matrix_init_from_float
export _root_.libgraphene.functions.graphene_matrix_init_from_matrix
export _root_.libgraphene.functions.graphene_matrix_init_from_vec4
export _root_.libgraphene.functions.graphene_matrix_init_frustum
export _root_.libgraphene.functions.graphene_matrix_init_identity
export _root_.libgraphene.functions.graphene_matrix_init_look_at
export _root_.libgraphene.functions.graphene_matrix_init_ortho
export _root_.libgraphene.functions.graphene_matrix_init_perspective
export _root_.libgraphene.functions.graphene_matrix_init_rotate
export _root_.libgraphene.functions.graphene_matrix_init_scale
export _root_.libgraphene.functions.graphene_matrix_init_skew
export _root_.libgraphene.functions.graphene_matrix_init_translate
export _root_.libgraphene.functions.graphene_matrix_interpolate
export _root_.libgraphene.functions.graphene_matrix_inverse
export _root_.libgraphene.functions.graphene_matrix_is_2d
export _root_.libgraphene.functions.graphene_matrix_is_backface_visible
export _root_.libgraphene.functions.graphene_matrix_is_identity
export _root_.libgraphene.functions.graphene_matrix_is_singular
export _root_.libgraphene.functions.graphene_matrix_multiply
export _root_.libgraphene.functions.graphene_matrix_near
export _root_.libgraphene.functions.graphene_matrix_normalize
export _root_.libgraphene.functions.graphene_matrix_perspective
export _root_.libgraphene.functions.graphene_matrix_print
export _root_.libgraphene.functions.graphene_matrix_project_point
export _root_.libgraphene.functions.graphene_matrix_project_rect
export _root_.libgraphene.functions.graphene_matrix_project_rect_bounds
export _root_.libgraphene.functions.graphene_matrix_rotate
export _root_.libgraphene.functions.graphene_matrix_rotate_euler
export _root_.libgraphene.functions.graphene_matrix_rotate_quaternion
export _root_.libgraphene.functions.graphene_matrix_rotate_x
export _root_.libgraphene.functions.graphene_matrix_rotate_y
export _root_.libgraphene.functions.graphene_matrix_rotate_z
export _root_.libgraphene.functions.graphene_matrix_scale
export _root_.libgraphene.functions.graphene_matrix_skew_xy
export _root_.libgraphene.functions.graphene_matrix_skew_xz
export _root_.libgraphene.functions.graphene_matrix_skew_yz
export _root_.libgraphene.functions.graphene_matrix_to_2d
export _root_.libgraphene.functions.graphene_matrix_to_float
export _root_.libgraphene.functions.graphene_matrix_transform_bounds
export _root_.libgraphene.functions.graphene_matrix_transform_box
export _root_.libgraphene.functions.graphene_matrix_transform_point
export _root_.libgraphene.functions.graphene_matrix_transform_point3d
export _root_.libgraphene.functions.graphene_matrix_transform_ray
export _root_.libgraphene.functions.graphene_matrix_transform_rect
export _root_.libgraphene.functions.graphene_matrix_transform_sphere
export _root_.libgraphene.functions.graphene_matrix_transform_vec3
export _root_.libgraphene.functions.graphene_matrix_transform_vec4
export _root_.libgraphene.functions.graphene_matrix_translate
export _root_.libgraphene.functions.graphene_matrix_transpose
export _root_.libgraphene.functions.graphene_matrix_unproject_point3d
export _root_.libgraphene.functions.graphene_matrix_untransform_bounds
export _root_.libgraphene.functions.graphene_matrix_untransform_point
export _root_.libgraphene.functions.graphene_plane_alloc
export _root_.libgraphene.functions.graphene_plane_distance
export _root_.libgraphene.functions.graphene_plane_equal
export _root_.libgraphene.functions.graphene_plane_free
export _root_.libgraphene.functions.graphene_plane_get_constant
export _root_.libgraphene.functions.graphene_plane_get_normal
export _root_.libgraphene.functions.graphene_plane_init
export _root_.libgraphene.functions.graphene_plane_init_from_plane
export _root_.libgraphene.functions.graphene_plane_init_from_point
export _root_.libgraphene.functions.graphene_plane_init_from_points
export _root_.libgraphene.functions.graphene_plane_init_from_vec4
export _root_.libgraphene.functions.graphene_plane_negate
export _root_.libgraphene.functions.graphene_plane_normalize
export _root_.libgraphene.functions.graphene_plane_transform
export _root_.libgraphene.functions.graphene_point3d_alloc
export _root_.libgraphene.functions.graphene_point3d_cross
export _root_.libgraphene.functions.graphene_point3d_distance
export _root_.libgraphene.functions.graphene_point3d_dot
export _root_.libgraphene.functions.graphene_point3d_equal
export _root_.libgraphene.functions.graphene_point3d_free
export _root_.libgraphene.functions.graphene_point3d_init
export _root_.libgraphene.functions.graphene_point3d_init_from_point
export _root_.libgraphene.functions.graphene_point3d_init_from_vec3
export _root_.libgraphene.functions.graphene_point3d_interpolate
export _root_.libgraphene.functions.graphene_point3d_length
export _root_.libgraphene.functions.graphene_point3d_near
export _root_.libgraphene.functions.graphene_point3d_normalize
export _root_.libgraphene.functions.graphene_point3d_normalize_viewport
export _root_.libgraphene.functions.graphene_point3d_scale
export _root_.libgraphene.functions.graphene_point3d_to_vec3
export _root_.libgraphene.functions.graphene_point3d_zero
export _root_.libgraphene.functions.graphene_point_alloc
export _root_.libgraphene.functions.graphene_point_distance
export _root_.libgraphene.functions.graphene_point_equal
export _root_.libgraphene.functions.graphene_point_free
export _root_.libgraphene.functions.graphene_point_init
export _root_.libgraphene.functions.graphene_point_init_from_point
export _root_.libgraphene.functions.graphene_point_init_from_vec2
export _root_.libgraphene.functions.graphene_point_interpolate
export _root_.libgraphene.functions.graphene_point_near
export _root_.libgraphene.functions.graphene_point_to_vec2
export _root_.libgraphene.functions.graphene_point_zero
export _root_.libgraphene.functions.graphene_quad_alloc
export _root_.libgraphene.functions.graphene_quad_bounds
export _root_.libgraphene.functions.graphene_quad_contains
export _root_.libgraphene.functions.graphene_quad_free
export _root_.libgraphene.functions.graphene_quad_get_point
export _root_.libgraphene.functions.graphene_quad_init
export _root_.libgraphene.functions.graphene_quad_init_from_points
export _root_.libgraphene.functions.graphene_quad_init_from_rect
export _root_.libgraphene.functions.graphene_quaternion_add
export _root_.libgraphene.functions.graphene_quaternion_alloc
export _root_.libgraphene.functions.graphene_quaternion_dot
export _root_.libgraphene.functions.graphene_quaternion_equal
export _root_.libgraphene.functions.graphene_quaternion_free
export _root_.libgraphene.functions.graphene_quaternion_init
export _root_.libgraphene.functions.graphene_quaternion_init_from_angle_vec3
export _root_.libgraphene.functions.graphene_quaternion_init_from_angles
export _root_.libgraphene.functions.graphene_quaternion_init_from_euler
export _root_.libgraphene.functions.graphene_quaternion_init_from_matrix
export _root_.libgraphene.functions.graphene_quaternion_init_from_quaternion
export _root_.libgraphene.functions.graphene_quaternion_init_from_radians
export _root_.libgraphene.functions.graphene_quaternion_init_from_vec4
export _root_.libgraphene.functions.graphene_quaternion_init_identity
export _root_.libgraphene.functions.graphene_quaternion_invert
export _root_.libgraphene.functions.graphene_quaternion_multiply
export _root_.libgraphene.functions.graphene_quaternion_normalize
export _root_.libgraphene.functions.graphene_quaternion_scale
export _root_.libgraphene.functions.graphene_quaternion_slerp
export _root_.libgraphene.functions.graphene_quaternion_to_angle_vec3
export _root_.libgraphene.functions.graphene_quaternion_to_angles
export _root_.libgraphene.functions.graphene_quaternion_to_matrix
export _root_.libgraphene.functions.graphene_quaternion_to_radians
export _root_.libgraphene.functions.graphene_quaternion_to_vec4
export _root_.libgraphene.functions.graphene_ray_alloc
export _root_.libgraphene.functions.graphene_ray_equal
export _root_.libgraphene.functions.graphene_ray_free
export _root_.libgraphene.functions.graphene_ray_get_closest_point_to_point
export _root_.libgraphene.functions.graphene_ray_get_direction
export _root_.libgraphene.functions.graphene_ray_get_distance_to_plane
export _root_.libgraphene.functions.graphene_ray_get_distance_to_point
export _root_.libgraphene.functions.graphene_ray_get_origin
export _root_.libgraphene.functions.graphene_ray_get_position_at
export _root_.libgraphene.functions.graphene_ray_init
export _root_.libgraphene.functions.graphene_ray_init_from_ray
export _root_.libgraphene.functions.graphene_ray_init_from_vec3
export _root_.libgraphene.functions.graphene_ray_intersect_box
export _root_.libgraphene.functions.graphene_ray_intersect_sphere
export _root_.libgraphene.functions.graphene_ray_intersect_triangle
export _root_.libgraphene.functions.graphene_ray_intersects_box
export _root_.libgraphene.functions.graphene_ray_intersects_sphere
export _root_.libgraphene.functions.graphene_ray_intersects_triangle
export _root_.libgraphene.functions.graphene_rect_alloc
export _root_.libgraphene.functions.graphene_rect_contains_point
export _root_.libgraphene.functions.graphene_rect_contains_rect
export _root_.libgraphene.functions.graphene_rect_equal
export _root_.libgraphene.functions.graphene_rect_expand
export _root_.libgraphene.functions.graphene_rect_free
export _root_.libgraphene.functions.graphene_rect_get_area
export _root_.libgraphene.functions.graphene_rect_get_bottom_left
export _root_.libgraphene.functions.graphene_rect_get_bottom_right
export _root_.libgraphene.functions.graphene_rect_get_center
export _root_.libgraphene.functions.graphene_rect_get_height
export _root_.libgraphene.functions.graphene_rect_get_top_left
export _root_.libgraphene.functions.graphene_rect_get_top_right
export _root_.libgraphene.functions.graphene_rect_get_vertices
export _root_.libgraphene.functions.graphene_rect_get_width
export _root_.libgraphene.functions.graphene_rect_get_x
export _root_.libgraphene.functions.graphene_rect_get_y
export _root_.libgraphene.functions.graphene_rect_init
export _root_.libgraphene.functions.graphene_rect_init_from_rect
export _root_.libgraphene.functions.graphene_rect_inset
export _root_.libgraphene.functions.graphene_rect_inset_r
export _root_.libgraphene.functions.graphene_rect_interpolate
export _root_.libgraphene.functions.graphene_rect_intersection
export _root_.libgraphene.functions.graphene_rect_normalize
export _root_.libgraphene.functions.graphene_rect_normalize_r
export _root_.libgraphene.functions.graphene_rect_offset
export _root_.libgraphene.functions.graphene_rect_offset_r
export _root_.libgraphene.functions.graphene_rect_round
export _root_.libgraphene.functions.graphene_rect_round_extents
export _root_.libgraphene.functions.graphene_rect_round_to_pixel
export _root_.libgraphene.functions.graphene_rect_scale
export _root_.libgraphene.functions.graphene_rect_union
export _root_.libgraphene.functions.graphene_rect_zero
export _root_.libgraphene.functions.graphene_simd4x4f_add
export _root_.libgraphene.functions.graphene_simd4x4f_determinant
export _root_.libgraphene.functions.graphene_simd4x4f_div
export _root_.libgraphene.functions.graphene_simd4x4f_init_from_float
export _root_.libgraphene.functions.graphene_simd4x4f_init_frustum
export _root_.libgraphene.functions.graphene_simd4x4f_init_identity
export _root_.libgraphene.functions.graphene_simd4x4f_init_ortho
export _root_.libgraphene.functions.graphene_simd4x4f_init_perspective
export _root_.libgraphene.functions.graphene_simd4x4f_inv_ortho_point3_mul
export _root_.libgraphene.functions.graphene_simd4x4f_inv_ortho_vec3_mul
export _root_.libgraphene.functions.graphene_simd4x4f_inverse
export _root_.libgraphene.functions.graphene_simd4x4f_is_2d
export _root_.libgraphene.functions.graphene_simd4x4f_is_identity
export _root_.libgraphene.functions.graphene_simd4x4f_matrix_mul
export _root_.libgraphene.functions.graphene_simd4x4f_mul
export _root_.libgraphene.functions.graphene_simd4x4f_perspective
export _root_.libgraphene.functions.graphene_simd4x4f_point3_mul
export _root_.libgraphene.functions.graphene_simd4x4f_scale
export _root_.libgraphene.functions.graphene_simd4x4f_sub
export _root_.libgraphene.functions.graphene_simd4x4f_sum
export _root_.libgraphene.functions.graphene_simd4x4f_to_float
export _root_.libgraphene.functions.graphene_simd4x4f_translation
export _root_.libgraphene.functions.graphene_simd4x4f_transpose
export _root_.libgraphene.functions.graphene_simd4x4f_transpose_in_place
export _root_.libgraphene.functions.graphene_simd4x4f_vec3_mul
export _root_.libgraphene.functions.graphene_simd4x4f_vec4_mul
export _root_.libgraphene.functions.graphene_size_alloc
export _root_.libgraphene.functions.graphene_size_equal
export _root_.libgraphene.functions.graphene_size_free
export _root_.libgraphene.functions.graphene_size_init
export _root_.libgraphene.functions.graphene_size_init_from_size
export _root_.libgraphene.functions.graphene_size_interpolate
export _root_.libgraphene.functions.graphene_size_scale
export _root_.libgraphene.functions.graphene_size_zero
export _root_.libgraphene.functions.graphene_sphere_alloc
export _root_.libgraphene.functions.graphene_sphere_contains_point
export _root_.libgraphene.functions.graphene_sphere_distance
export _root_.libgraphene.functions.graphene_sphere_equal
export _root_.libgraphene.functions.graphene_sphere_free
export _root_.libgraphene.functions.graphene_sphere_get_bounding_box
export _root_.libgraphene.functions.graphene_sphere_get_center
export _root_.libgraphene.functions.graphene_sphere_get_radius
export _root_.libgraphene.functions.graphene_sphere_init
export _root_.libgraphene.functions.graphene_sphere_init_from_points
export _root_.libgraphene.functions.graphene_sphere_init_from_vectors
export _root_.libgraphene.functions.graphene_sphere_is_empty
export _root_.libgraphene.functions.graphene_sphere_translate
export _root_.libgraphene.functions.graphene_triangle_alloc
export _root_.libgraphene.functions.graphene_triangle_contains_point
export _root_.libgraphene.functions.graphene_triangle_equal
export _root_.libgraphene.functions.graphene_triangle_free
export _root_.libgraphene.functions.graphene_triangle_get_area
export _root_.libgraphene.functions.graphene_triangle_get_barycoords
export _root_.libgraphene.functions.graphene_triangle_get_bounding_box
export _root_.libgraphene.functions.graphene_triangle_get_midpoint
export _root_.libgraphene.functions.graphene_triangle_get_normal
export _root_.libgraphene.functions.graphene_triangle_get_plane
export _root_.libgraphene.functions.graphene_triangle_get_points
export _root_.libgraphene.functions.graphene_triangle_get_uv
export _root_.libgraphene.functions.graphene_triangle_get_vertices
export _root_.libgraphene.functions.graphene_triangle_init_from_float
export _root_.libgraphene.functions.graphene_triangle_init_from_point3d
export _root_.libgraphene.functions.graphene_triangle_init_from_vec3
export _root_.libgraphene.functions.graphene_vec2_add
export _root_.libgraphene.functions.graphene_vec2_alloc
export _root_.libgraphene.functions.graphene_vec2_divide
export _root_.libgraphene.functions.graphene_vec2_dot
export _root_.libgraphene.functions.graphene_vec2_equal
export _root_.libgraphene.functions.graphene_vec2_free
export _root_.libgraphene.functions.graphene_vec2_get_x
export _root_.libgraphene.functions.graphene_vec2_get_y
export _root_.libgraphene.functions.graphene_vec2_init
export _root_.libgraphene.functions.graphene_vec2_init_from_float
export _root_.libgraphene.functions.graphene_vec2_init_from_vec2
export _root_.libgraphene.functions.graphene_vec2_interpolate
export _root_.libgraphene.functions.graphene_vec2_length
export _root_.libgraphene.functions.graphene_vec2_max
export _root_.libgraphene.functions.graphene_vec2_min
export _root_.libgraphene.functions.graphene_vec2_multiply
export _root_.libgraphene.functions.graphene_vec2_near
export _root_.libgraphene.functions.graphene_vec2_negate
export _root_.libgraphene.functions.graphene_vec2_normalize
export _root_.libgraphene.functions.graphene_vec2_one
export _root_.libgraphene.functions.graphene_vec2_scale
export _root_.libgraphene.functions.graphene_vec2_subtract
export _root_.libgraphene.functions.graphene_vec2_to_float
export _root_.libgraphene.functions.graphene_vec2_x_axis
export _root_.libgraphene.functions.graphene_vec2_y_axis
export _root_.libgraphene.functions.graphene_vec2_zero
export _root_.libgraphene.functions.graphene_vec3_add
export _root_.libgraphene.functions.graphene_vec3_alloc
export _root_.libgraphene.functions.graphene_vec3_cross
export _root_.libgraphene.functions.graphene_vec3_divide
export _root_.libgraphene.functions.graphene_vec3_dot
export _root_.libgraphene.functions.graphene_vec3_equal
export _root_.libgraphene.functions.graphene_vec3_free
export _root_.libgraphene.functions.graphene_vec3_get_x
export _root_.libgraphene.functions.graphene_vec3_get_xy
export _root_.libgraphene.functions.graphene_vec3_get_xy0
export _root_.libgraphene.functions.graphene_vec3_get_xyz0
export _root_.libgraphene.functions.graphene_vec3_get_xyz1
export _root_.libgraphene.functions.graphene_vec3_get_xyzw
export _root_.libgraphene.functions.graphene_vec3_get_y
export _root_.libgraphene.functions.graphene_vec3_get_z
export _root_.libgraphene.functions.graphene_vec3_init
export _root_.libgraphene.functions.graphene_vec3_init_from_float
export _root_.libgraphene.functions.graphene_vec3_init_from_vec3
export _root_.libgraphene.functions.graphene_vec3_interpolate
export _root_.libgraphene.functions.graphene_vec3_length
export _root_.libgraphene.functions.graphene_vec3_max
export _root_.libgraphene.functions.graphene_vec3_min
export _root_.libgraphene.functions.graphene_vec3_multiply
export _root_.libgraphene.functions.graphene_vec3_near
export _root_.libgraphene.functions.graphene_vec3_negate
export _root_.libgraphene.functions.graphene_vec3_normalize
export _root_.libgraphene.functions.graphene_vec3_one
export _root_.libgraphene.functions.graphene_vec3_scale
export _root_.libgraphene.functions.graphene_vec3_subtract
export _root_.libgraphene.functions.graphene_vec3_to_float
export _root_.libgraphene.functions.graphene_vec3_x_axis
export _root_.libgraphene.functions.graphene_vec3_y_axis
export _root_.libgraphene.functions.graphene_vec3_z_axis
export _root_.libgraphene.functions.graphene_vec3_zero
export _root_.libgraphene.functions.graphene_vec4_add
export _root_.libgraphene.functions.graphene_vec4_alloc
export _root_.libgraphene.functions.graphene_vec4_divide
export _root_.libgraphene.functions.graphene_vec4_dot
export _root_.libgraphene.functions.graphene_vec4_equal
export _root_.libgraphene.functions.graphene_vec4_free
export _root_.libgraphene.functions.graphene_vec4_get_w
export _root_.libgraphene.functions.graphene_vec4_get_x
export _root_.libgraphene.functions.graphene_vec4_get_xy
export _root_.libgraphene.functions.graphene_vec4_get_xyz
export _root_.libgraphene.functions.graphene_vec4_get_y
export _root_.libgraphene.functions.graphene_vec4_get_z
export _root_.libgraphene.functions.graphene_vec4_init
export _root_.libgraphene.functions.graphene_vec4_init_from_float
export _root_.libgraphene.functions.graphene_vec4_init_from_vec2
export _root_.libgraphene.functions.graphene_vec4_init_from_vec3
export _root_.libgraphene.functions.graphene_vec4_init_from_vec4
export _root_.libgraphene.functions.graphene_vec4_interpolate
export _root_.libgraphene.functions.graphene_vec4_length
export _root_.libgraphene.functions.graphene_vec4_max
export _root_.libgraphene.functions.graphene_vec4_min
export _root_.libgraphene.functions.graphene_vec4_multiply
export _root_.libgraphene.functions.graphene_vec4_near
export _root_.libgraphene.functions.graphene_vec4_negate
export _root_.libgraphene.functions.graphene_vec4_normalize
export _root_.libgraphene.functions.graphene_vec4_one
export _root_.libgraphene.functions.graphene_vec4_scale
export _root_.libgraphene.functions.graphene_vec4_subtract
export _root_.libgraphene.functions.graphene_vec4_to_float
export _root_.libgraphene.functions.graphene_vec4_w_axis
export _root_.libgraphene.functions.graphene_vec4_x_axis
export _root_.libgraphene.functions.graphene_vec4_y_axis
export _root_.libgraphene.functions.graphene_vec4_z_axis
export _root_.libgraphene.functions.graphene_vec4_zero
export _root_.libgraphene.functions.graphene_simd4f_add
export _root_.libgraphene.functions.graphene_simd4f_clamp
export _root_.libgraphene.functions.graphene_simd4f_clamp_scalar
export _root_.libgraphene.functions.graphene_simd4f_cmp_eq
export _root_.libgraphene.functions.graphene_simd4f_cmp_ge
export _root_.libgraphene.functions.graphene_simd4f_cmp_gt
export _root_.libgraphene.functions.graphene_simd4f_cmp_le
export _root_.libgraphene.functions.graphene_simd4f_cmp_lt
export _root_.libgraphene.functions.graphene_simd4f_cmp_neq
export _root_.libgraphene.functions.graphene_simd4f_cross3
export _root_.libgraphene.functions.graphene_simd4f_div
export _root_.libgraphene.functions.graphene_simd4f_dot2
export _root_.libgraphene.functions.graphene_simd4f_dot3
export _root_.libgraphene.functions.graphene_simd4f_dot3_scalar
export _root_.libgraphene.functions.graphene_simd4f_dot4
export _root_.libgraphene.functions.graphene_simd4f_dup_2f
export _root_.libgraphene.functions.graphene_simd4f_dup_3f
export _root_.libgraphene.functions.graphene_simd4f_dup_4f
export _root_.libgraphene.functions.graphene_simd4f_flip_sign_0101
export _root_.libgraphene.functions.graphene_simd4f_flip_sign_1010
export _root_.libgraphene.functions.graphene_simd4f_get_w
export _root_.libgraphene.functions.graphene_simd4f_get_x
export _root_.libgraphene.functions.graphene_simd4f_get_y
export _root_.libgraphene.functions.graphene_simd4f_get_z
export _root_.libgraphene.functions.graphene_simd4f_init
export _root_.libgraphene.functions.graphene_simd4f_init_2f
export _root_.libgraphene.functions.graphene_simd4f_init_3f
export _root_.libgraphene.functions.graphene_simd4f_init_4f
export _root_.libgraphene.functions.graphene_simd4f_init_zero
export _root_.libgraphene.functions.graphene_simd4f_interpolate
export _root_.libgraphene.functions.graphene_simd4f_is_zero2
export _root_.libgraphene.functions.graphene_simd4f_is_zero3
export _root_.libgraphene.functions.graphene_simd4f_is_zero4
export _root_.libgraphene.functions.graphene_simd4f_length2
export _root_.libgraphene.functions.graphene_simd4f_length3
export _root_.libgraphene.functions.graphene_simd4f_length4
export _root_.libgraphene.functions.graphene_simd4f_madd
export _root_.libgraphene.functions.graphene_simd4f_max
export _root_.libgraphene.functions.graphene_simd4f_max_val
export _root_.libgraphene.functions.graphene_simd4f_merge_high
export _root_.libgraphene.functions.graphene_simd4f_merge_low
export _root_.libgraphene.functions.graphene_simd4f_merge_w
export _root_.libgraphene.functions.graphene_simd4f_min
export _root_.libgraphene.functions.graphene_simd4f_min_val
export _root_.libgraphene.functions.graphene_simd4f_mul
export _root_.libgraphene.functions.graphene_simd4f_neg
export _root_.libgraphene.functions.graphene_simd4f_normalize2
export _root_.libgraphene.functions.graphene_simd4f_normalize3
export _root_.libgraphene.functions.graphene_simd4f_normalize4
export _root_.libgraphene.functions.graphene_simd4f_reciprocal
export _root_.libgraphene.functions.graphene_simd4f_rsqrt
export _root_.libgraphene.functions.graphene_simd4f_shuffle_wxyz
export _root_.libgraphene.functions.graphene_simd4f_shuffle_yzwx
export _root_.libgraphene.functions.graphene_simd4f_shuffle_zwxy
export _root_.libgraphene.functions.graphene_simd4f_splat
export _root_.libgraphene.functions.graphene_simd4f_splat_w
export _root_.libgraphene.functions.graphene_simd4f_splat_x
export _root_.libgraphene.functions.graphene_simd4f_splat_y
export _root_.libgraphene.functions.graphene_simd4f_splat_z
export _root_.libgraphene.functions.graphene_simd4f_sqrt
export _root_.libgraphene.functions.graphene_simd4f_sub
export _root_.libgraphene.functions.graphene_simd4f_sum
export _root_.libgraphene.functions.graphene_simd4f_sum_scalar
export _root_.libgraphene.functions.graphene_simd4f_zero_w
export _root_.libgraphene.functions.graphene_simd4f_zero_zw
export _root_.libgraphene.functions.graphene_simd4x4f_init
export _root_.libgraphene.functions.graphene_simd4x4f_init_look_at
export _root_.libgraphene.functions.graphene_simd4x4f_rotation
