import bindgen.interface.Binding
import bindgen.plugin.BindgenMode

lazy val examples = project
  .in(file("examples"))
  .dependsOn(gtk)
  .configure(pkgConfigured("gtk4"))

lazy val gio = project
  .in(file("gio"))
  .dependsOn(glib, gobject)
  .configure(pkgConfigured("gio-2.0"))
  .settings(
    bindgenBindings +=
      buildWithDependencies("glib", "gobject") {
        Binding
          .builder(findHeader("gio-2.0", _ / "gio" / "gio.h"), "gio")
          .withClangFlags(pkgConfig("gio-2.0", "cflags"))
          .addCImport("gio.h")
          .withOpaqueStructs(Set("G*"))
          .withMultiFile(true)
      }
  )

lazy val glib = project
  .in(file("glib"))
  .configure(pkgConfigured("glib-2.0"))
  .settings(
    bindgenBindings +=
      Binding
        .builder(findHeader("glib-2.0", _ / "glib.h"), "glib")
        .withClangFlags(pkgConfig("glib-2.0", "cflags"))
        .addCImport("glib.h")
        .withMultiFile(true)
        .build
  )

lazy val gtk = project
  .in(file("gtk"))
  .dependsOn(glib, gio, gobject, cairo, harfbuzz, graphene, pango, gdkpixbuf)
  .configure(pkgConfigured("gtk4"))
  .settings(
    bindgenBindings +=
      buildWithDependencies(
        "gio",
        "glib",
        "gobject",
        "libcairo",
        "libharfbuzz"
      ) {
        Binding
          .builder(findHeader("gtk4", _ / "gtk" / "gtk.h"), "gtk")
          .withClangFlags(pkgConfig("gtk4", "cflags"))
          .addCImport("graphene.h")
          .withMultiFile(true)
          .addExternalPath("*/graphene-1.0/*", "libgraphene")
          .addExternalPath("*/pango-1.0/*", "libpango")
          .addExternalPath("*/gdk-pixbuf-2.0/*", "libgdkpixbuf")
      }
  )

lazy val gobject =
  project
    .in(file("gobject"))
    .dependsOn(glib)
    .configure(pkgConfigured("gobject-2.0"))
    .settings(
      bindgenBindings +=
        buildWithDependencies("glib", "gio") {
          Binding
            .builder(findHeader("gobject-2.0", _ / "glib-object.h"), "gobject")
            .withClangFlags(pkgConfig("gobject-2.0", "cflags"))
            .addCImport("glib-object.h")
            .withMultiFile(true)
        }
    )

lazy val pango =
  project
    .in(file("pango"))
    .dependsOn(glib, cairo, gobject, harfbuzz)
    .configure(pkgConfigured("pango"))
    .settings(
      bindgenBindings +=
        buildWithDependencies("glib", "libcairo", "gobject", "libharfbuzz") {
          Binding
            .builder(findHeader("pango", _ / "pango" / "pango.h"), "libpango")
            .withClangFlags(pkgConfig("pango", "cflags"))
            .addCImport("pango.h")
            .withMultiFile(true)
        }
    )

lazy val gdkpixbuf =
  project
    .in(file("gdkpixbuf"))
    .dependsOn(glib, cairo, gobject, gio)
    .configure(pkgConfigured("gdk-pixbuf-2.0"))
    .settings(
      bindgenBindings +=
        buildWithDependencies("glib", "gobject", "gio", "libcairo") {
          Binding
            .builder(
              findHeader("gdk-pixbuf-2.0", _ / "gdk-pixbuf" / "gdk-pixbuf.h"),
              "libgdkpixbuf"
            )
            .withClangFlags(pkgConfig("gdk-pixbuf-2.0", "cflags"))
            .withMultiFile(true)
        }
    )

lazy val cairo =
  project
    .in(file("cairo"))
    .dependsOn(glib)
    .configure(pkgConfigured("cairo"))
    .settings(
      bindgenBindings +=
        Binding
          .builder(findHeader("cairo", _ / "cairo.h"), "libcairo")
          .withClangFlags(pkgConfig("cairo", "cflags"))
          .addCImport("cairo.h")
          .withMultiFile(true)
          .build
    )

lazy val graphene =
  project
    .in(file("graphene"))
    .dependsOn(glib)
    .configure(pkgConfigured("graphene-1.0"))
    .settings(
      bindgenBindings +=
        Binding
          .builder(findHeader("graphene-1.0", _ / "graphene.h"), "libgraphene")
          .withClangFlags(pkgConfig("graphene-1.0", "cflags"))
          .addCImport("graphene.h")
          .withMultiFile(true)
          .build
    )

lazy val harfbuzz =
  project
    .in(file("harfbuzz"))
    .dependsOn(glib)
    .configure(pkgConfigured("harfbuzz"))
    .settings(
      bindgenBindings +=
        Binding
          .builder(findHeader("harfbuzz", _ / "hb.h"), "libharfbuzz")
          .withClangFlags(pkgConfig("harfbuzz", "cflags"))
          .addCImport("hb.h")
          .withMultiFile(true)
          .build
    )

def pkgConfig(pkg: String, arg: String) = {
  import sys.process.*
  s"pkg-config --$arg $pkg".!!.trim.split(" ").toList
}

def findHeader(pkgName: String, file: java.io.File => java.io.File) = {
  val cFlags = pkgConfig(pkgName, "cflags")
    .filter(_.startsWith("-I"))
    .map(_.stripPrefix("-I"))
    .map(new File(_))

  cFlags
    .map(file)
    .filter(_.exists())
    .headOption
    .getOrElse(
      throw new sbt.internal.util.MessageOnlyException(
        s"Failed to find header in folders received from pkg-config: $cFlags"
      )
    )
}

def pkgConfigured(name: String): Project => Project = { proj =>
  proj
    .enablePlugins(ScalaNativePlugin, BindgenPlugin)
    .settings(
      pushRemoteCacheTo := Some(
        MavenCache(
          "local-cache",
          (ThisBuild / baseDirectory).value / "target" / "remote-cache"
        )
      ),
      resolvers ++= Resolver.sonatypeOssRepos("snapshots"),
      scalaVersion := "3.2.2",
      nativeCompileOptions ++= {
        pkgConfig(name, "cflags")
      },
      nativeLinkingOptions ++= {
        pkgConfig(name, "libs")
      },
      bindgenMode := BindgenMode.Manual(
        scalaDir = sourceDirectory.value / "main" / "scala" / "generated",
        cDir =
          (Compile / resourceDirectory).value / "scala-native" / "generated"
      )
    )
}

def buildWithDependencies(deps: String*)(bb: Binding.Builder) = {
  def extPaths(dep: String) = dep match {
    case "glib" =>
      List(
        "*/glib-2.0/glib/*",
        "*/glib-2.0/glib.h",
        "*/glibconfig.h",
        "*/glib-2.0/gmodule.h"
      )
    case "gio" =>
      List(
        "*/glib-2.0/gio/*"
      )
    case "gobject" =>
      List(
        "*/glib-2.0/gobject/*",
        "*/glib-2.0/gobject.h"
      )
    case "libcairo" =>
      List("*/cairo/*")
    case "libharfbuzz" => List("*/harfbuzz/*")
  }

  val externals =
    deps.flatMap { dep => extPaths(dep).map(_ -> dep).toMap }.toMap

  bb.addExternalPaths(externals).build
}

Global / onChangedBuildSource := ReloadOnSourceChanges

pushRemoteCacheTo := Some(
  MavenCache(
    "local-cache",
    (ThisBuild / baseDirectory).value / "target" / "remote-cache"
  )
)
