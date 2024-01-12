import com.indoorvivants.gnome.gir_schema.*
import java.nio.file.Paths
import scala.xml.XML
import scalaxb.fromXML
import java.nio.file.Path
import java.nio.file.Files
import scala.jdk.CollectionConverters.*
import scala.reflect.ClassTag
import scalaxb.DataRecord

case class AugmentedNamespace(n: Namespace):
  export n.*

  def collect[T: scala.reflect.ClassTag] =
    val ct = summon[ClassTag[T]]
    n.namespaceoption.collect:
      case d if ct.unapply(d.value).isDefined => d.as[T]

  lazy val interfaces: Seq[AugmentedInterface] =
    collect[Interface].map(AugmentedInterface(_))

  lazy val enumerations: Seq[Enumeration] =
    collect[Enumeration]

  lazy val bitfields: Seq[Bitfield] =
    collect[Bitfield]

  lazy val aliases: Seq[Alias] =
    collect[Alias]

  lazy val callbacks: Seq[Callback] =
    collect[Callback]

  lazy val records: Seq[Record] =
    collect[Record]

  lazy val classes: Seq[AugmentedClass] =
    collect[Class].map(AugmentedClass(_))
end AugmentedNamespace

trait ClassLike:
  protected def options: Seq[DataRecord[Any]]
  def collect[T: scala.reflect.ClassTag] =
    val ct = summon[ClassTag[T]]
    options.collect:
      case d if ct.unapply(d.value).isDefined => d.as[T]

  lazy val implements: Seq[Implements] =
    collect[Implements]

  lazy val methods: Seq[Method] =
    collect[Method]

  lazy val constructors: Seq[Constructor] =
    collect[Constructor]
end ClassLike

case class AugmentedInterface(n: Interface) extends ClassLike:
  export n.*

  override protected def options: Seq[DataRecord[Any]] = n.interfaceoption
case class AugmentedClass(n: Class) extends ClassLike:
  export n.*
  override protected def options: Seq[DataRecord[Any]] = n.classoption

end AugmentedClass

private def extractParams(
    c: Seq[DataRecord[Any]]
): Seq[Parameter | Instanceu45parameter] =
  c
    .collect:
      case d if d.value.isInstanceOf[Parameters] =>
        d.as[Parameters]
          .parametersoption
          .collect[Parameter | Instanceu45parameter]:
            case d if d.value.isInstanceOf[Parameter] => d.as[Parameter]
            case d if d.value.isInstanceOf[Instanceu45parameter] =>
              d.as[Instanceu45parameter]
    .flatten

extension (c: Constructor) def parameters = extractParams(c.constructoroption)

extension (c: Method)
  def parameters: Seq[Parameter | Instanceu45parameter] = extractParams(
    c.methodoption
  )
  def instanceParameter: Option[Instanceu45parameter] =
    c.methodoption.collectFirst:
      case d if d.value.isInstanceOf[Instanceu45parameter] =>
        d.as[Instanceu45parameter]

  def returnType: Option[Type | ArrayType] = c.methodoption
    .collectFirst:
      case d if d.value.isInstanceOf[Returnu45value] => d.as[Returnu45value]
    .flatMap: rv =>
      rv.returnu45valueoption.collectFirst:
        case d if d.value.isInstanceOf[Type]      => d.as[Type]
        case d if d.value.isInstanceOf[ArrayType] => d.as[ArrayType]
end extension

extension [T](c: Seq[DataRecord[T]])
  def doc =
    c.collectFirst:
      case d if d.value.isInstanceOf[Doc] => d.as[Doc]

extension (c: Seq[DataRecord[Any]])
  def tpe =
    c.collectFirst:
      case d if d.value.isInstanceOf[Type] => d.as[Type]

extension (c: Parameter | Instanceu45parameter)
  def tpe: Option[Type | ArrayType] =
    val data =
      c match
        case p: Parameter            => p.parameteroption
        case p: Instanceu45parameter => p.instanceu45parameteroption

    data.collectFirst:
      case d if d.value.isInstanceOf[Type]      => d.as[Type]
      case d if d.value.isInstanceOf[ArrayType] => d.as[ArrayType]
