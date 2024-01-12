import com.indoorvivants.gnome.gir_schema.*

def filterDefinitions(
    namespace: Option[AugmentedNamespace] = None,
    cls: Option[AugmentedClass] = None,
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
    scribe.info(s"Method: ${method.map(_.name)}: $b")
    b.forall(identity)

  if all(
      isNamespace("gobject"),
      isClass("SignalGroup"),
      isMethod(
        "connect_closure"
      )
    )
  then
    Some(
      "Method connectClosure is not rendered: for some reason g_signal_group_connect_closure is absent from raw bindings"
    )
  else None
  end if
end filterDefinitions
