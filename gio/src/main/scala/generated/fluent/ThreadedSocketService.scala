package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class ThreadedSocketService(private[fluent] val raw: Ptr[GThreadedSocketService]) extends SocketService

object ThreadedSocketService:
  def apply(max_threads : Int): ThreadedSocketService = ThreadedSocketService(g_threaded_socket_service_new(max_threads))

end ThreadedSocketService
