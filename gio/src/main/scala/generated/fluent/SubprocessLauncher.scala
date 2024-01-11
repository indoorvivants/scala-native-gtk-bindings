package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class SubprocessLauncher(private[fluent] val raw: Ptr[GSubprocessLauncher]) extends GObject.Object:
  def close(): Unit = g_subprocess_launcher_close(this.raw)

  def getenv(variable : Any /* Some(filename): const gchar**/): Any /* Some(filename): const gchar**/ = g_subprocess_launcher_getenv(this.raw, variable)

  def setChildSetup(child_setup : Any /* Some(GLib.SpawnChildSetupFunc): GSpawnChildSetupFunc*/, user_data : Ptr[Byte], destroy_notify : Any /* Some(GLib.DestroyNotify): GDestroyNotify*/): Unit = g_subprocess_launcher_set_child_setup(this.raw, child_setup, user_data, destroy_notify)

  def setCwd(cwd : Any /* Some(filename): const gchar**/): Unit = g_subprocess_launcher_set_cwd(this.raw, cwd)

  def setEnviron(env : Array[Byte]): Unit = g_subprocess_launcher_set_environ(this.raw, env)

  def setFlags(flags : Any /* Some(SubprocessFlags): GSubprocessFlags*/): Unit = g_subprocess_launcher_set_flags(this.raw, flags)

  def setStderrFilePath(path : Any /* Some(filename): const gchar**/): Unit = g_subprocess_launcher_set_stderr_file_path(this.raw, path)

  def setStdinFilePath(path : String): Unit = g_subprocess_launcher_set_stdin_file_path(this.raw, path)

  def setStdoutFilePath(path : Any /* Some(filename): const gchar**/): Unit = g_subprocess_launcher_set_stdout_file_path(this.raw, path)

  def setenv(variable : Any /* Some(filename): const gchar**/, value : Any /* Some(filename): const gchar**/, overwrite : Boolean): Unit = g_subprocess_launcher_setenv(this.raw, variable, value, overwrite)

  def spawnv(argv : Array[Byte]): sn.gnome.gio.fluent.Subprocess = g_subprocess_launcher_spawnv(this.raw, argv)

  def takeFd(source_fd : Int, target_fd : Int): Unit = g_subprocess_launcher_take_fd(this.raw, source_fd, target_fd)

  def takeStderrFd(fd : Int): Unit = g_subprocess_launcher_take_stderr_fd(this.raw, fd)

  def takeStdinFd(fd : Int): Unit = g_subprocess_launcher_take_stdin_fd(this.raw, fd)

  def takeStdoutFd(fd : Int): Unit = g_subprocess_launcher_take_stdout_fd(this.raw, fd)

  def unsetenv(variable : Any /* Some(filename): const gchar**/): Unit = g_subprocess_launcher_unsetenv(this.raw, variable)

end SubprocessLauncher

object SubprocessLauncher:
  def apply(flags : Any /* Some(SubprocessFlags): GSubprocessFlags*/): SubprocessLauncher = SubprocessLauncher(g_subprocess_launcher_new(flags))

end SubprocessLauncher
