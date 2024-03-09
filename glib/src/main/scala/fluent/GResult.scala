package sn.gnome.glib.fluent

import sn.gnome.glib.internal.{GQuark, GError, g_error_free}
import scala.scalanative.unsafe.*

enum GResult[+A]:
  case Error(domain: GQuark, code: Int, message: String)
  case Ok(value: A)

object GResult:
  inline def wrap[A](inline f: Ptr[Ptr[GError]] => A): GResult[A] =
    val st = stackalloc[Ptr[GError]]()
    val raw = f(st)
    val errorPtr = !st

    if errorPtr != null then
      val err = !errorPtr
      val result = GResult.Error(
        err.domain,
        err.code.value,
        fromCString(err.message.asInstanceOf[CString])
      )
      g_error_free(errorPtr)
      result
    else Ok(raw)
    end if
  end wrap
end GResult
