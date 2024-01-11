package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class FilenameCompleter(private[fluent] val raw: Ptr[GFilenameCompleter]) extends GObject.Object:
  def getCompletionSuffix(initial_text : String): Any /* Some(utf8): char**/ = g_filename_completer_get_completion_suffix(this.raw, initial_text)

  def getCompletions(initial_text : String): Array[Byte] = g_filename_completer_get_completions(this.raw, initial_text)

  def setDirsOnly(dirs_only : Boolean): Unit = g_filename_completer_set_dirs_only(this.raw, dirs_only)

end FilenameCompleter

object FilenameCompleter:
  def apply(): FilenameCompleter = FilenameCompleter(g_filename_completer_new())

end FilenameCompleter
