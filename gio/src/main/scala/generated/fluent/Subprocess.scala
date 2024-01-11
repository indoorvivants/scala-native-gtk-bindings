package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class Subprocess(private[fluent] val raw: Ptr[GSubprocess]) extends GObject.Object, Initable:
  def communicate(stdin_buf : Any /* Some(GLib.Bytes): GBytes**/, cancellable : sn.gnome.gio.fluent.Cancellable, stdout_buf : Any /* Some(GLib.Bytes): GBytes***/, stderr_buf : Any /* Some(GLib.Bytes): GBytes***/): Boolean = g_subprocess_communicate(this.raw, stdin_buf, cancellable.raw, stdout_buf, stderr_buf)

  def communicateAsync(stdin_buf : Any /* Some(GLib.Bytes): GBytes**/, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_subprocess_communicate_async(this.raw, stdin_buf, cancellable.raw, callback, user_data)

  def communicateFinish(result : sn.gnome.gio.fluent.AsyncResult, stdout_buf : Any /* Some(GLib.Bytes): GBytes***/, stderr_buf : Any /* Some(GLib.Bytes): GBytes***/): Boolean = g_subprocess_communicate_finish(this.raw, result.raw, stdout_buf, stderr_buf)

  def communicateUtf8(stdin_buf : String, cancellable : sn.gnome.gio.fluent.Cancellable, stdout_buf : Any /* Some(utf8): char***/, stderr_buf : Any /* Some(utf8): char***/): Boolean = g_subprocess_communicate_utf8(this.raw, stdin_buf, cancellable.raw, stdout_buf, stderr_buf)

  def communicateUtf8Async(stdin_buf : String, cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_subprocess_communicate_utf8_async(this.raw, stdin_buf, cancellable.raw, callback, user_data)

  def communicateUtf8Finish(result : sn.gnome.gio.fluent.AsyncResult, stdout_buf : Any /* Some(utf8): char***/, stderr_buf : Any /* Some(utf8): char***/): Boolean = g_subprocess_communicate_utf8_finish(this.raw, result.raw, stdout_buf, stderr_buf)

  def forceExit(): Unit = g_subprocess_force_exit(this.raw)

  def getExitStatus(): Int = g_subprocess_get_exit_status(this.raw)

  def getIdentifier(): String = g_subprocess_get_identifier(this.raw)

  def getIfExited(): Boolean = g_subprocess_get_if_exited(this.raw)

  def getIfSignaled(): Boolean = g_subprocess_get_if_signaled(this.raw)

  def getStatus(): Int = g_subprocess_get_status(this.raw)

  def getStderrPipe(): sn.gnome.gio.fluent.InputStream = g_subprocess_get_stderr_pipe(this.raw)

  def getStdinPipe(): sn.gnome.gio.fluent.OutputStream = g_subprocess_get_stdin_pipe(this.raw)

  def getStdoutPipe(): sn.gnome.gio.fluent.InputStream = g_subprocess_get_stdout_pipe(this.raw)

  def getSuccessful(): Boolean = g_subprocess_get_successful(this.raw)

  def getTermSig(): Int = g_subprocess_get_term_sig(this.raw)

  def sendSignal(signal_num : Int): Unit = g_subprocess_send_signal(this.raw, signal_num)

  def wait(cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_subprocess_wait(this.raw, cancellable.raw)

  def waitAsync(cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_subprocess_wait_async(this.raw, cancellable.raw, callback, user_data)

  def waitCheck(cancellable : sn.gnome.gio.fluent.Cancellable): Boolean = g_subprocess_wait_check(this.raw, cancellable.raw)

  def waitCheckAsync(cancellable : sn.gnome.gio.fluent.Cancellable, callback : Any /* Some(AsyncReadyCallback): GAsyncReadyCallback*/, user_data : Ptr[Byte]): Unit = g_subprocess_wait_check_async(this.raw, cancellable.raw, callback, user_data)

  def waitCheckFinish(result : sn.gnome.gio.fluent.AsyncResult): Boolean = g_subprocess_wait_check_finish(this.raw, result.raw)

  def waitFinish(result : sn.gnome.gio.fluent.AsyncResult): Boolean = g_subprocess_wait_finish(this.raw, result.raw)

end Subprocess

object Subprocess:
