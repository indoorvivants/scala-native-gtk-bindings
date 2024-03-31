package girepository

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*



/**
 * [bindgen] header: /usr/include/gobject-introspection-1.0/girepository.h
*/
@extern def g_irepository_dump(arg : CString, error : Ptr[Ptr[_root_.glib.GError]]): _root_.glib.gboolean = extern

/**
 * [bindgen] header: /usr/include/gobject-introspection-1.0/girepository.h
*/
@extern def g_irepository_enumerate_versions(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.glib.gchar]): Ptr[_root_.glib.GList] = extern

/**
 * [bindgen] header: /usr/include/gobject-introspection-1.0/girepository.h
*/
@extern def g_irepository_error_quark(): _root_.glib.GQuark = extern

/**
 * [bindgen] header: /usr/include/gobject-introspection-1.0/girepository.h
*/
@extern def g_irepository_find_by_error_domain(repository : Ptr[GIRepository], domain : _root_.glib.GQuark): Ptr[GIEnumInfo] = extern

/**
 * [bindgen] header: /usr/include/gobject-introspection-1.0/girepository.h
*/
@extern def g_irepository_find_by_gtype(repository : Ptr[GIRepository], gtype : _root_.gobject.GType): Ptr[GIBaseInfo] = extern

/**
 * [bindgen] header: /usr/include/gobject-introspection-1.0/girepository.h
*/
@extern def g_irepository_find_by_name(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.glib.gchar], name : Ptr[_root_.glib.gchar]): Ptr[GIBaseInfo] = extern

/**
 * [bindgen] header: /usr/include/gobject-introspection-1.0/girepository.h
*/
@extern def g_irepository_get_c_prefix(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.glib.gchar]): Ptr[_root_.glib.gchar] = extern

/**
 * [bindgen] header: /usr/include/gobject-introspection-1.0/girepository.h
*/
@extern def g_irepository_get_default(): Ptr[GIRepository] = extern

/**
 * [bindgen] header: /usr/include/gobject-introspection-1.0/girepository.h
*/
@extern def g_irepository_get_dependencies(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.glib.gchar]): Ptr[Ptr[_root_.glib.gchar]] = extern

/**
 * [bindgen] header: /usr/include/gobject-introspection-1.0/girepository.h
*/
@extern def g_irepository_get_immediate_dependencies(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.glib.gchar]): Ptr[Ptr[_root_.glib.gchar]] = extern

/**
 * [bindgen] header: /usr/include/gobject-introspection-1.0/girepository.h
*/
@extern def g_irepository_get_info(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.glib.gchar], index : _root_.glib.gint): Ptr[GIBaseInfo] = extern

/**
 * [bindgen] header: /usr/include/gobject-introspection-1.0/girepository.h
*/
@extern def g_irepository_get_loaded_namespaces(repository : Ptr[GIRepository]): Ptr[Ptr[_root_.glib.gchar]] = extern

/**
 * [bindgen] header: /usr/include/gobject-introspection-1.0/girepository.h
*/
@extern def g_irepository_get_n_infos(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.glib.gchar]): _root_.glib.gint = extern

/**
 * [bindgen] header: /usr/include/gobject-introspection-1.0/girepository.h
*/
@extern def g_irepository_get_object_gtype_interfaces(repository : Ptr[GIRepository], gtype : _root_.gobject.GType, n_interfaces_out : Ptr[_root_.glib.guint], interfaces_out : Ptr[Ptr[Ptr[GIInterfaceInfo]]]): Unit = extern

/**
 * [bindgen] header: /usr/include/gobject-introspection-1.0/girepository.h
*/
@extern def g_irepository_get_option_group(): Ptr[_root_.glib.GOptionGroup] = extern

/**
 * [bindgen] header: /usr/include/gobject-introspection-1.0/girepository.h
*/
@extern def g_irepository_get_search_path(): Ptr[_root_.glib.GSList] = extern

/**
 * [bindgen] header: /usr/include/gobject-introspection-1.0/girepository.h
*/
@extern def g_irepository_get_shared_library(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.glib.gchar]): Ptr[_root_.glib.gchar] = extern

/**
 * [bindgen] header: /usr/include/gobject-introspection-1.0/girepository.h
*/
@extern def g_irepository_get_type(): _root_.gobject.GType = extern

/**
 * [bindgen] header: /usr/include/gobject-introspection-1.0/girepository.h
*/
@extern def g_irepository_get_typelib_path(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.glib.gchar]): Ptr[_root_.glib.gchar] = extern

/**
 * [bindgen] header: /usr/include/gobject-introspection-1.0/girepository.h
*/
@extern def g_irepository_get_version(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.glib.gchar]): Ptr[_root_.glib.gchar] = extern

/**
 * [bindgen] header: /usr/include/gobject-introspection-1.0/girepository.h
*/
@extern def g_irepository_is_registered(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.glib.gchar], version : Ptr[_root_.glib.gchar]): _root_.glib.gboolean = extern

/**
 * [bindgen] header: /usr/include/gobject-introspection-1.0/girepository.h
*/
@extern def g_irepository_load_typelib(repository : Ptr[GIRepository], typelib : Ptr[GITypelib], flags : GIRepositoryLoadFlags, error : Ptr[Ptr[_root_.glib.GError]]): CString = extern

/**
 * [bindgen] header: /usr/include/gobject-introspection-1.0/girepository.h
*/
@extern def g_irepository_prepend_library_path(directory : CString): Unit = extern

/**
 * [bindgen] header: /usr/include/gobject-introspection-1.0/girepository.h
*/
@extern def g_irepository_prepend_search_path(directory : CString): Unit = extern

/**
 * [bindgen] header: /usr/include/gobject-introspection-1.0/girepository.h
*/
@extern def g_irepository_require(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.glib.gchar], version : Ptr[_root_.glib.gchar], flags : GIRepositoryLoadFlags, error : Ptr[Ptr[_root_.glib.GError]]): Ptr[GITypelib] = extern

/**
 * [bindgen] header: /usr/include/gobject-introspection-1.0/girepository.h
*/
@extern def g_irepository_require_private(repository : Ptr[GIRepository], typelib_dir : Ptr[_root_.glib.gchar], `namespace_` : Ptr[_root_.glib.gchar], version : Ptr[_root_.glib.gchar], flags : GIRepositoryLoadFlags, error : Ptr[Ptr[_root_.glib.GError]]): Ptr[GITypelib] = extern

/**
 * [bindgen] header: /usr/include/gobject-introspection-1.0/girepository.h
*/
@extern def gi_cclosure_marshal_generic(closure : Ptr[_root_.gobject.GClosure], return_gvalue : Ptr[_root_.gobject.GValue], n_param_values : _root_.glib.guint, param_values : Ptr[_root_.gobject.GValue], invocation_hint : _root_.glib.gpointer, marshal_data : _root_.glib.gpointer): Unit = extern