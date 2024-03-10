import com.indoorvivants.gnome.gir_schema.*

import scala.util.boundary, boundary.break

def filterDefinitions(
    namespace: Option[AugmentedNamespace] = None,
    cls: Option[AugmentedClass] = None,
    iface: Option[AugmentedInterface] = None,
    method: Option[Method] = None,
    constructor: Option[Constructor] = None
): Option[String] =
  def isNamespace(name: String) =
    namespace.exists(_.name.exists(n => n.equalsIgnoreCase(name)))
  def isClass(name: String) =
    cls.exists(_.name.equalsIgnoreCase(name))
  def isMethod(name: String) =
    method.exists(_.name.equalsIgnoreCase(name))

  def isConstructor(name: String) =
    constructor.exists(_.name.equalsIgnoreCase(name))

  def all(b: Boolean*) =
    b.forall(identity)

  boundary[Option[String]]:
    def check(b: Boolean, msg: String) =
      if b then break(Some(msg))

    check(
      all(
        isNamespace("gobject"),
        isClass("SignalGroup"),
        isMethod(
          "connect_closure"
        )
      ),
      "Method connectClosure is not rendered: for some reason g_signal_group_connect_closure is absent from raw bindings"
    )

    def weirdClass(name: String) =
      check(isClass(name), s"Class $name is weird")

    weirdClass("UnixInputStream")
    weirdClass("UnixMountMonitor")
    weirdClass("UnixOutputStream")
    weirdClass("UnixFDMessage")
    weirdClass("DekstopAppInfo")

    None

end filterDefinitions
