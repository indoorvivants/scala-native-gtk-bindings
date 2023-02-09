resolvers ++= Resolver.sonatypeOssRepos("snapshots")
import bindgen.interface.Binding
import bindgen.plugin.BindgenMode
enablePlugins(ScalaNativePlugin, BindgenPlugin)

scalaVersion := "3.2.2"
scalacOptions += "-Yno-decode-stacktraces"

nativeCompileOptions ++= {
  pkgConfig("gtk4", "cflags")
}

nativeLinkingOptions ++= {
  pkgConfig("gtk4", "libs")
}

bindgenMode := BindgenMode.Manual(
  scalaDir = sourceDirectory.value / "main" / "scala" / "generated",
  cDir = (Compile / resourceDirectory).value / "scala-native" / "generated"
)

bindgenBindings += {
  Binding(
    headerFile = findGtkHeader(),
    packageName = "libgtk",
    clangFlags = pkgConfig("gtk4", "cflags"),
    cImports = List("graphene.h"),
    multiFile = true,
    opaqueStructs = Set("G*")
  )
}

def pkgConfig(pkg: String, arg: String) = {
  import sys.process.*
  s"pkg-config --$arg $pkg".!!.trim.split(" ").toList
}

def findGtkHeader() = {
  val cFlags = pkgConfig("gtk4", "cflags")
    .filter(_.startsWith("-I"))
    .map(_.stripPrefix("-I"))
    .map(new File(_))

  cFlags
    .map(_ / "gtk" / "gtk.h")
    .filter(_.exists())
    .headOption
    .getOrElse(
      throw new sbt.internal.util.MessageOnlyException(
        s"Failed to find gtk header in folders received from pkg: $cFlags"
      )
    )
}
