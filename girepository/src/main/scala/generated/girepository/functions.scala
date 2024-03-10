package girepository

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*



@extern def g_arg_info_get_closure(info : Ptr[GIArgInfo]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_arg_info_get_destroy(info : Ptr[GIArgInfo]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_arg_info_get_direction(info : Ptr[GIArgInfo]): GIDirection = extern

@extern def g_arg_info_get_ownership_transfer(info : Ptr[GIArgInfo]): GITransfer = extern

@extern def g_arg_info_get_scope(info : Ptr[GIArgInfo]): GIScopeType = extern

@extern def g_arg_info_get_type(info : Ptr[GIArgInfo]): Ptr[GITypeInfo] = extern

@extern def g_arg_info_is_caller_allocates(info : Ptr[GIArgInfo]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_arg_info_is_optional(info : Ptr[GIArgInfo]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_arg_info_is_return_value(info : Ptr[GIArgInfo]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_arg_info_is_skip(info : Ptr[GIArgInfo]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_arg_info_load_type(info : Ptr[GIArgInfo], `type` : Ptr[GITypeInfo]): Unit = extern

@extern def g_arg_info_may_be_null(info : Ptr[GIArgInfo]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_base_info_equal(info1 : Ptr[GIBaseInfo], info2 : Ptr[GIBaseInfo]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_base_info_get_attribute(info : Ptr[GIBaseInfo], name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_base_info_get_container(info : Ptr[GIBaseInfo]): Ptr[GIBaseInfo] = extern

@extern def g_base_info_get_name(info : Ptr[GIBaseInfo]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_base_info_get_namespace(info : Ptr[GIBaseInfo]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_base_info_get_type(info : Ptr[GIBaseInfo]): GIInfoType = extern

@extern def g_base_info_get_typelib(info : Ptr[GIBaseInfo]): Ptr[GITypelib] = extern

@extern def g_base_info_gtype_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_base_info_is_deprecated(info : Ptr[GIBaseInfo]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_base_info_iterate_attributes(info : Ptr[GIBaseInfo], iterator : Ptr[GIAttributeIter], name : Ptr[CString], value : Ptr[CString]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_base_info_ref(info : Ptr[GIBaseInfo]): Ptr[GIBaseInfo] = extern

@extern def g_base_info_unref(info : Ptr[GIBaseInfo]): Unit = extern

@extern def g_callable_info_can_throw_gerror(info : Ptr[GICallableInfo]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_callable_info_get_arg(info : Ptr[GICallableInfo], n : _root_.sn.gnome.glib.internal.gint): Ptr[GIArgInfo] = extern

@extern def g_callable_info_get_caller_owns(info : Ptr[GICallableInfo]): GITransfer = extern

@extern def g_callable_info_get_instance_ownership_transfer(info : Ptr[GICallableInfo]): GITransfer = extern

@extern def g_callable_info_get_n_args(info : Ptr[GICallableInfo]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_callable_info_get_return_attribute(info : Ptr[GICallableInfo], name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_callable_info_get_return_type(info : Ptr[GICallableInfo]): Ptr[GITypeInfo] = extern

@extern def g_callable_info_invoke(info : Ptr[GICallableInfo], function : _root_.sn.gnome.glib.internal.gpointer, in_args : Ptr[GIArgument], n_in_args : CInt, out_args : Ptr[GIArgument], n_out_args : CInt, return_value : Ptr[GIArgument], is_method : _root_.sn.gnome.glib.internal.gboolean, throws : _root_.sn.gnome.glib.internal.gboolean, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_callable_info_is_method(info : Ptr[GICallableInfo]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_callable_info_iterate_return_attributes(info : Ptr[GICallableInfo], iterator : Ptr[GIAttributeIter], name : Ptr[CString], value : Ptr[CString]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_callable_info_load_arg(info : Ptr[GICallableInfo], n : _root_.sn.gnome.glib.internal.gint, arg : Ptr[GIArgInfo]): Unit = extern

@extern def g_callable_info_load_return_type(info : Ptr[GICallableInfo], `type` : Ptr[GITypeInfo]): Unit = extern

@extern def g_callable_info_may_return_null(info : Ptr[GICallableInfo]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_callable_info_skip_return(info : Ptr[GICallableInfo]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_constant_info_free_value(info : Ptr[GIConstantInfo], value : Ptr[GIArgument]): Unit = extern

@extern def g_constant_info_get_type(info : Ptr[GIConstantInfo]): Ptr[GITypeInfo] = extern

@extern def g_constant_info_get_value(info : Ptr[GIConstantInfo], value : Ptr[GIArgument]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_enum_info_get_error_domain(info : Ptr[GIEnumInfo]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_enum_info_get_method(info : Ptr[GIEnumInfo], n : _root_.sn.gnome.glib.internal.gint): Ptr[GIFunctionInfo] = extern

@extern def g_enum_info_get_n_methods(info : Ptr[GIEnumInfo]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_enum_info_get_n_values(info : Ptr[GIEnumInfo]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_enum_info_get_storage_type(info : Ptr[GIEnumInfo]): GITypeTag = extern

@extern def g_enum_info_get_value(info : Ptr[GIEnumInfo], n : _root_.sn.gnome.glib.internal.gint): Ptr[GIValueInfo] = extern

@extern def g_field_info_get_field(field_info : Ptr[GIFieldInfo], mem : _root_.sn.gnome.glib.internal.gpointer, value : Ptr[GIArgument]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_field_info_get_flags(info : Ptr[GIFieldInfo]): GIFieldInfoFlags = extern

@extern def g_field_info_get_offset(info : Ptr[GIFieldInfo]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_field_info_get_size(info : Ptr[GIFieldInfo]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_field_info_get_type(info : Ptr[GIFieldInfo]): Ptr[GITypeInfo] = extern

@extern def g_field_info_set_field(field_info : Ptr[GIFieldInfo], mem : _root_.sn.gnome.glib.internal.gpointer, value : Ptr[GIArgument]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_function_info_get_flags(info : Ptr[GIFunctionInfo]): GIFunctionInfoFlags = extern

@extern def g_function_info_get_property(info : Ptr[GIFunctionInfo]): Ptr[GIPropertyInfo] = extern

@extern def g_function_info_get_symbol(info : Ptr[GIFunctionInfo]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_function_info_get_vfunc(info : Ptr[GIFunctionInfo]): Ptr[GIVFuncInfo] = extern

@extern def g_function_info_invoke(info : Ptr[GIFunctionInfo], in_args : Ptr[GIArgument], n_in_args : CInt, out_args : Ptr[GIArgument], n_out_args : CInt, return_value : Ptr[GIArgument], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_info_new(`type` : GIInfoType, container : Ptr[GIBaseInfo], typelib : Ptr[GITypelib], offset : _root_.sn.gnome.glib.internal.guint32): Ptr[GIBaseInfo] = extern

@extern def g_info_type_to_string(`type` : GIInfoType): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_interface_info_find_method(info : Ptr[GIInterfaceInfo], name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GIFunctionInfo] = extern

@extern def g_interface_info_find_signal(info : Ptr[GIInterfaceInfo], name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GISignalInfo] = extern

@extern def g_interface_info_find_vfunc(info : Ptr[GIInterfaceInfo], name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GIVFuncInfo] = extern

@extern def g_interface_info_get_constant(info : Ptr[GIInterfaceInfo], n : _root_.sn.gnome.glib.internal.gint): Ptr[GIConstantInfo] = extern

@extern def g_interface_info_get_iface_struct(info : Ptr[GIInterfaceInfo]): Ptr[GIStructInfo] = extern

@extern def g_interface_info_get_method(info : Ptr[GIInterfaceInfo], n : _root_.sn.gnome.glib.internal.gint): Ptr[GIFunctionInfo] = extern

@extern def g_interface_info_get_n_constants(info : Ptr[GIInterfaceInfo]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_interface_info_get_n_methods(info : Ptr[GIInterfaceInfo]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_interface_info_get_n_prerequisites(info : Ptr[GIInterfaceInfo]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_interface_info_get_n_properties(info : Ptr[GIInterfaceInfo]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_interface_info_get_n_signals(info : Ptr[GIInterfaceInfo]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_interface_info_get_n_vfuncs(info : Ptr[GIInterfaceInfo]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_interface_info_get_prerequisite(info : Ptr[GIInterfaceInfo], n : _root_.sn.gnome.glib.internal.gint): Ptr[GIBaseInfo] = extern

@extern def g_interface_info_get_property(info : Ptr[GIInterfaceInfo], n : _root_.sn.gnome.glib.internal.gint): Ptr[GIPropertyInfo] = extern

@extern def g_interface_info_get_signal(info : Ptr[GIInterfaceInfo], n : _root_.sn.gnome.glib.internal.gint): Ptr[GISignalInfo] = extern

@extern def g_interface_info_get_vfunc(info : Ptr[GIInterfaceInfo], n : _root_.sn.gnome.glib.internal.gint): Ptr[GIVFuncInfo] = extern

@extern def g_invoke_error_quark(): _root_.sn.gnome.glib.internal.GQuark = extern

@extern def g_irepository_dump(arg : CString, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_irepository_enumerate_versions(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_irepository_error_quark(): _root_.sn.gnome.glib.internal.GQuark = extern

@extern def g_irepository_find_by_error_domain(repository : Ptr[GIRepository], domain : _root_.sn.gnome.glib.internal.GQuark): Ptr[GIEnumInfo] = extern

@extern def g_irepository_find_by_gtype(repository : Ptr[GIRepository], gtype : _root_.sn.gnome.gobject.internal.GType): Ptr[GIBaseInfo] = extern

@extern def g_irepository_find_by_name(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.sn.gnome.glib.internal.gchar], name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GIBaseInfo] = extern

@extern def g_irepository_get_c_prefix(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_irepository_get_default(): Ptr[GIRepository] = extern

@extern def g_irepository_get_dependencies(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]] = extern

@extern def g_irepository_get_immediate_dependencies(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]] = extern

@extern def g_irepository_get_info(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.sn.gnome.glib.internal.gchar], index : _root_.sn.gnome.glib.internal.gint): Ptr[GIBaseInfo] = extern

@extern def g_irepository_get_loaded_namespaces(repository : Ptr[GIRepository]): Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]] = extern

@extern def g_irepository_get_n_infos(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_irepository_get_object_gtype_interfaces(repository : Ptr[GIRepository], gtype : _root_.sn.gnome.gobject.internal.GType, n_interfaces_out : Ptr[_root_.sn.gnome.glib.internal.guint], interfaces_out : Ptr[Ptr[Ptr[GIInterfaceInfo]]]): Unit = extern

@extern def g_irepository_get_option_group(): Ptr[_root_.sn.gnome.glib.internal.GOptionGroup] = extern

@extern def g_irepository_get_search_path(): Ptr[_root_.sn.gnome.glib.internal.GSList] = extern

@extern def g_irepository_get_shared_library(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_irepository_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_irepository_get_typelib_path(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_irepository_get_version(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_irepository_is_registered(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.sn.gnome.glib.internal.gchar], version : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_irepository_load_typelib(repository : Ptr[GIRepository], typelib : Ptr[GITypelib], flags : GIRepositoryLoadFlags, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): CString = extern

@extern def g_irepository_prepend_library_path(directory : CString): Unit = extern

@extern def g_irepository_prepend_search_path(directory : CString): Unit = extern

@extern def g_irepository_require(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.sn.gnome.glib.internal.gchar], version : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GIRepositoryLoadFlags, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GITypelib] = extern

@extern def g_irepository_require_private(repository : Ptr[GIRepository], typelib_dir : Ptr[_root_.sn.gnome.glib.internal.gchar], `namespace_` : Ptr[_root_.sn.gnome.glib.internal.gchar], version : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GIRepositoryLoadFlags, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GITypelib] = extern

@extern def g_object_info_find_method(info : Ptr[GIObjectInfo], name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GIFunctionInfo] = extern

@extern def g_object_info_find_method_using_interfaces(info : Ptr[GIObjectInfo], name : Ptr[_root_.sn.gnome.glib.internal.gchar], implementor : Ptr[Ptr[GIObjectInfo]]): Ptr[GIFunctionInfo] = extern

@extern def g_object_info_find_signal(info : Ptr[GIObjectInfo], name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GISignalInfo] = extern

@extern def g_object_info_find_vfunc(info : Ptr[GIObjectInfo], name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GIVFuncInfo] = extern

@extern def g_object_info_find_vfunc_using_interfaces(info : Ptr[GIObjectInfo], name : Ptr[_root_.sn.gnome.glib.internal.gchar], implementor : Ptr[Ptr[GIObjectInfo]]): Ptr[GIVFuncInfo] = extern

@extern def g_object_info_get_abstract(info : Ptr[GIObjectInfo]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_object_info_get_class_struct(info : Ptr[GIObjectInfo]): Ptr[GIStructInfo] = extern

@extern def g_object_info_get_constant(info : Ptr[GIObjectInfo], n : _root_.sn.gnome.glib.internal.gint): Ptr[GIConstantInfo] = extern

@extern def g_object_info_get_field(info : Ptr[GIObjectInfo], n : _root_.sn.gnome.glib.internal.gint): Ptr[GIFieldInfo] = extern

@extern def g_object_info_get_final(info : Ptr[GIObjectInfo]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_object_info_get_fundamental(info : Ptr[GIObjectInfo]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_object_info_get_get_value_function(info : Ptr[GIObjectInfo]): CString = extern

@extern def g_object_info_get_get_value_function_pointer(info : Ptr[GIObjectInfo]): GIObjectInfoGetValueFunction = extern

@extern def g_object_info_get_interface(info : Ptr[GIObjectInfo], n : _root_.sn.gnome.glib.internal.gint): Ptr[GIInterfaceInfo] = extern

@extern def g_object_info_get_method(info : Ptr[GIObjectInfo], n : _root_.sn.gnome.glib.internal.gint): Ptr[GIFunctionInfo] = extern

@extern def g_object_info_get_n_constants(info : Ptr[GIObjectInfo]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_object_info_get_n_fields(info : Ptr[GIObjectInfo]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_object_info_get_n_interfaces(info : Ptr[GIObjectInfo]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_object_info_get_n_methods(info : Ptr[GIObjectInfo]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_object_info_get_n_properties(info : Ptr[GIObjectInfo]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_object_info_get_n_signals(info : Ptr[GIObjectInfo]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_object_info_get_n_vfuncs(info : Ptr[GIObjectInfo]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_object_info_get_parent(info : Ptr[GIObjectInfo]): Ptr[GIObjectInfo] = extern

@extern def g_object_info_get_property(info : Ptr[GIObjectInfo], n : _root_.sn.gnome.glib.internal.gint): Ptr[GIPropertyInfo] = extern

@extern def g_object_info_get_ref_function(info : Ptr[GIObjectInfo]): CString = extern

@extern def g_object_info_get_ref_function_pointer(info : Ptr[GIObjectInfo]): GIObjectInfoRefFunction = extern

@extern def g_object_info_get_set_value_function(info : Ptr[GIObjectInfo]): CString = extern

@extern def g_object_info_get_set_value_function_pointer(info : Ptr[GIObjectInfo]): GIObjectInfoSetValueFunction = extern

@extern def g_object_info_get_signal(info : Ptr[GIObjectInfo], n : _root_.sn.gnome.glib.internal.gint): Ptr[GISignalInfo] = extern

@extern def g_object_info_get_type_init(info : Ptr[GIObjectInfo]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_object_info_get_type_name(info : Ptr[GIObjectInfo]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_object_info_get_unref_function(info : Ptr[GIObjectInfo]): CString = extern

@extern def g_object_info_get_unref_function_pointer(info : Ptr[GIObjectInfo]): GIObjectInfoUnrefFunction = extern

@extern def g_object_info_get_vfunc(info : Ptr[GIObjectInfo], n : _root_.sn.gnome.glib.internal.gint): Ptr[GIVFuncInfo] = extern

@extern def g_property_info_get_flags(info : Ptr[GIPropertyInfo]): _root_.sn.gnome.gobject.internal.GParamFlags = extern

@extern def g_property_info_get_getter(info : Ptr[GIPropertyInfo]): Ptr[GIFunctionInfo] = extern

@extern def g_property_info_get_ownership_transfer(info : Ptr[GIPropertyInfo]): GITransfer = extern

@extern def g_property_info_get_setter(info : Ptr[GIPropertyInfo]): Ptr[GIFunctionInfo] = extern

@extern def g_property_info_get_type(info : Ptr[GIPropertyInfo]): Ptr[GITypeInfo] = extern

@extern def g_registered_type_info_get_g_type(info : Ptr[GIRegisteredTypeInfo]): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_registered_type_info_get_type_init(info : Ptr[GIRegisteredTypeInfo]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_registered_type_info_get_type_name(info : Ptr[GIRegisteredTypeInfo]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_signal_info_get_class_closure(info : Ptr[GISignalInfo]): Ptr[GIVFuncInfo] = extern

@extern def g_signal_info_get_flags(info : Ptr[GISignalInfo]): _root_.sn.gnome.gobject.internal.GSignalFlags = extern

@extern def g_signal_info_true_stops_emit(info : Ptr[GISignalInfo]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_struct_info_find_field(info : Ptr[GIStructInfo], name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GIFieldInfo] = extern

@extern def g_struct_info_find_method(info : Ptr[GIStructInfo], name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GIFunctionInfo] = extern

@extern def g_struct_info_get_alignment(info : Ptr[GIStructInfo]): _root_.sn.gnome.glib.internal.gsize = extern

@extern def g_struct_info_get_copy_function(info : Ptr[GIStructInfo]): CString = extern

@extern def g_struct_info_get_field(info : Ptr[GIStructInfo], n : _root_.sn.gnome.glib.internal.gint): Ptr[GIFieldInfo] = extern

@extern def g_struct_info_get_free_function(info : Ptr[GIStructInfo]): CString = extern

@extern def g_struct_info_get_method(info : Ptr[GIStructInfo], n : _root_.sn.gnome.glib.internal.gint): Ptr[GIFunctionInfo] = extern

@extern def g_struct_info_get_n_fields(info : Ptr[GIStructInfo]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_struct_info_get_n_methods(info : Ptr[GIStructInfo]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_struct_info_get_size(info : Ptr[GIStructInfo]): _root_.sn.gnome.glib.internal.gsize = extern

@extern def g_struct_info_is_foreign(info : Ptr[GIStructInfo]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_struct_info_is_gtype_struct(info : Ptr[GIStructInfo]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_type_info_argument_from_hash_pointer(info : Ptr[GITypeInfo], hash_pointer : _root_.sn.gnome.glib.internal.gpointer, arg : Ptr[GIArgument]): Unit = extern

@extern def g_type_info_get_array_fixed_size(info : Ptr[GITypeInfo]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_type_info_get_array_length(info : Ptr[GITypeInfo]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_type_info_get_array_type(info : Ptr[GITypeInfo]): GIArrayType = extern

@extern def g_type_info_get_interface(info : Ptr[GITypeInfo]): Ptr[GIBaseInfo] = extern

@extern def g_type_info_get_param_type(info : Ptr[GITypeInfo], n : _root_.sn.gnome.glib.internal.gint): Ptr[GITypeInfo] = extern

@extern def g_type_info_get_storage_type(info : Ptr[GITypeInfo]): GITypeTag = extern

@extern def g_type_info_get_tag(info : Ptr[GITypeInfo]): GITypeTag = extern

@extern def g_type_info_hash_pointer_from_argument(info : Ptr[GITypeInfo], arg : Ptr[GIArgument]): _root_.sn.gnome.glib.internal.gpointer = extern

@extern def g_type_info_is_pointer(info : Ptr[GITypeInfo]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_type_info_is_zero_terminated(info : Ptr[GITypeInfo]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_type_tag_to_string(`type` : GITypeTag): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_typelib_free(typelib : Ptr[GITypelib]): Unit = extern

@extern def g_typelib_get_namespace(typelib : Ptr[GITypelib]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_typelib_new_from_const_memory(memory : Ptr[_root_.sn.gnome.glib.internal.guint8], len : _root_.sn.gnome.glib.internal.gsize, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GITypelib] = extern

@extern def g_typelib_new_from_mapped_file(mfile : Ptr[_root_.sn.gnome.glib.internal.GMappedFile], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GITypelib] = extern

@extern def g_typelib_new_from_memory(memory : Ptr[_root_.sn.gnome.glib.internal.guint8], len : _root_.sn.gnome.glib.internal.gsize, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GITypelib] = extern

@extern def g_typelib_symbol(typelib : Ptr[GITypelib], symbol_name : Ptr[_root_.sn.gnome.glib.internal.gchar], symbol : Ptr[_root_.sn.gnome.glib.internal.gpointer]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_union_info_find_method(info : Ptr[GIUnionInfo], name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GIFunctionInfo] = extern

@extern def g_union_info_get_alignment(info : Ptr[GIUnionInfo]): _root_.sn.gnome.glib.internal.gsize = extern

@extern def g_union_info_get_copy_function(info : Ptr[GIUnionInfo]): CString = extern

@extern def g_union_info_get_discriminator(info : Ptr[GIUnionInfo], n : _root_.sn.gnome.glib.internal.gint): Ptr[GIConstantInfo] = extern

@extern def g_union_info_get_discriminator_offset(info : Ptr[GIUnionInfo]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_union_info_get_discriminator_type(info : Ptr[GIUnionInfo]): Ptr[GITypeInfo] = extern

@extern def g_union_info_get_field(info : Ptr[GIUnionInfo], n : _root_.sn.gnome.glib.internal.gint): Ptr[GIFieldInfo] = extern

@extern def g_union_info_get_free_function(info : Ptr[GIUnionInfo]): CString = extern

@extern def g_union_info_get_method(info : Ptr[GIUnionInfo], n : _root_.sn.gnome.glib.internal.gint): Ptr[GIFunctionInfo] = extern

@extern def g_union_info_get_n_fields(info : Ptr[GIUnionInfo]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_union_info_get_n_methods(info : Ptr[GIUnionInfo]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_union_info_get_size(info : Ptr[GIUnionInfo]): _root_.sn.gnome.glib.internal.gsize = extern

@extern def g_union_info_is_discriminated(info : Ptr[GIUnionInfo]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_value_info_get_value(info : Ptr[GIValueInfo]): _root_.sn.gnome.glib.internal.gint64 = extern

@extern def g_vfunc_info_get_address(info : Ptr[GIVFuncInfo], implementor_gtype : _root_.sn.gnome.gobject.internal.GType, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gpointer = extern

@extern def g_vfunc_info_get_flags(info : Ptr[GIVFuncInfo]): GIVFuncInfoFlags = extern

@extern def g_vfunc_info_get_invoker(info : Ptr[GIVFuncInfo]): Ptr[GIFunctionInfo] = extern

@extern def g_vfunc_info_get_offset(info : Ptr[GIVFuncInfo]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_vfunc_info_get_signal(info : Ptr[GIVFuncInfo]): Ptr[GISignalInfo] = extern

@extern def g_vfunc_info_invoke(info : Ptr[GIVFuncInfo], implementor : _root_.sn.gnome.gobject.internal.GType, in_args : Ptr[GIArgument], n_in_args : CInt, out_args : Ptr[GIArgument], n_out_args : CInt, return_value : Ptr[GIArgument], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gi_cclosure_marshal_generic(closure : Ptr[_root_.sn.gnome.gobject.internal.GClosure], return_gvalue : Ptr[_root_.sn.gnome.gobject.internal.GValue], n_param_values : _root_.sn.gnome.glib.internal.guint, param_values : Ptr[_root_.sn.gnome.gobject.internal.GValue], invocation_hint : _root_.sn.gnome.glib.internal.gpointer, marshal_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def gi_get_major_version(): _root_.sn.gnome.glib.internal.guint = extern

@extern def gi_get_micro_version(): _root_.sn.gnome.glib.internal.guint = extern

@extern def gi_get_minor_version(): _root_.sn.gnome.glib.internal.guint = extern

@extern def gi_type_tag_argument_from_hash_pointer(storage_type : GITypeTag, hash_pointer : _root_.sn.gnome.glib.internal.gpointer, arg : Ptr[GIArgument]): Unit = extern

@extern def gi_type_tag_hash_pointer_from_argument(storage_type : GITypeTag, arg : Ptr[GIArgument]): _root_.sn.gnome.glib.internal.gpointer = extern