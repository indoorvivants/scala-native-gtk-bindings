package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class ApplicationCommandLine(private[fluent] val raw: Ptr[GApplicationCommandLine]) extends sn.gnome.gobject.fluent.Object:
  def createFileForArg(arg : Any /* Some(filename): const gchar**/): sn.gnome.gio.fluent.File = g_application_command_line_create_file_for_arg(this.raw, arg)

  def getArguments(argc : Any /* Some(gint): int**/): Array[Byte] = g_application_command_line_get_arguments(this.raw, argc)

  def getCwd(): Any /* Some(filename): const gchar**/ = g_application_command_line_get_cwd(this.raw)

  def getEnviron(): Array[Byte] = g_application_command_line_get_environ(this.raw)

  def getExitStatus(): Int = g_application_command_line_get_exit_status(this.raw)

  def getIsRemote(): Boolean = g_application_command_line_get_is_remote(this.raw)

  def getOptionsDict(): Any /* Some(GLib.VariantDict): GVariantDict**/ = g_application_command_line_get_options_dict(this.raw)

  def getPlatformData(): Any /* Some(GLib.Variant): GVariant**/ = g_application_command_line_get_platform_data(this.raw)

  def getStdin(): sn.gnome.gio.fluent.InputStream = g_application_command_line_get_stdin(this.raw)

  def getenv(name : Any /* Some(filename): const gchar**/): String = g_application_command_line_getenv(this.raw, name)

  def setExitStatus(exit_status : Int): Unit = g_application_command_line_set_exit_status(this.raw, exit_status)

end ApplicationCommandLine

