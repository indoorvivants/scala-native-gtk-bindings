case class GnomeVersion(
    major: Int,
    minor: Int
)

object GnomeVersion:
  given Ordering[GnomeVersion] = Ordering.by(gv => (gv.major, gv.minor))

  def parse(s: String) =
    s match
      case s"$major.$minor" => GnomeVersion(major.toInt, minor.toInt)
