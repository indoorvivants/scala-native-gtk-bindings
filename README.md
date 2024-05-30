# Gtk4 bindings for Scala 3 Native

## Installation

Make sure you have Gtk4 installed:

1. On MacOS, do `brew install gtk4`
2. On Debian-based Linux systems, you can do `sudo apt install libgtk-4-dev`

You can check the installation by running `pkg-config --cflags gtk4` - it should succeed.

The bindings are published to Maven central, with gtk4 specifically being available at the following coordinates:

[![Maven Central](https://img.shields.io/maven-central/v/com.indoorvivants.gnome/gtk4_native0.4_3.svg?label=Maven%20Central)](https://search.maven.org/artifact/com.indoorvivants.gnome/gtk4_native0.4_3/)

```
com.indoorvivants.gnome::gtk4::<version> // Scala CLI/Mill format
"com.indoorvivants.gnome" %%% "gtk4" % "<version>" // SBT format
```

## Usage

This repository contains a very small app you can run.

```bash
$ pkg-config --cflags gtk4 | xargs -n1 > compilationFlags
$ pkg-config --libs gtk4 | xargs -n1 > linkingFlags

$ scala-cli run ./examples/src/main/scala/example.scala --native --native-compile @$PWD/compilationFlags --native-linking @$PWD/linkingFlags --dep com.indoorvivants.gnome::gtk4::0.0.4 # or change the version to latest
```

Bindings generated using [sn-bindgen](https://sn-bindgen.indoorvivants.com/)

![GtkBindingsDemo](https://user-images.githubusercontent.com/1052965/217792578-a4faa191-053b-48a7-aa2a-207709690fa1.gif)

## GIO Resource Integration

[GIO Resource ](https://docs.gtk.org/gio/struct.Resource.html) enables bundling resources, text or binary,
within the executable. The overall process for integration with `scala-native-gtk-bindings` is:

1. Create a `gresource.xml` file. EG: `main.gresource.xml` within the `main/resources` folder.
2. Place other resources (UI definitions, CSS, Icons) included by the `gresource.xml` in the `main/resources`
   folder.
3. Using `glib-compile-resources` to generate `.c` file for the resources into the generated
   `managed_resources/scala-native` folder.
4. This `.c` file will be automatically compiled as part of the scala native build.
5. The application is now ready to access resources using `g_resource_lookup_data` and related APIs.

Aside from the `glib-compile-sources`, the process is automatic: The generated C will be automatically
included in the compile and the resource registration functions in the generated C will be automatically
called.

### Example using `sbt`

Here is an example, using the `sbt` build tool, of the build process and loading a resource.

#### Create the `gresource.xml`

In this example file will be called `main.gresource.xml`:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<gresources>
  <gresource prefix="/com/example/my-scala-native-exe">
    <file>data.txt</file>
  </gresource>
</gresources>
```

With the `data.txt` placed alongside the `main.gresource.xml`. For example:

```
Example text for the data.txt resource.
```

#### Add a `resourceGenerator` task

For the project with the resources, add a task like:

```scala
    Compile / resourceGenerators += Def.task {
      val inputDir = (Compile / resourceDirectory).value
      val input = inputDir / "main.gresource.xml"
      val file = (Compile / resourceManaged).value / "scala-native" / "gresources.c"
      IO.createDirectory(file.getParentFile())
      val processResult = Process(
        Seq(
          "glib-compile-resources",
          "--generate-source",
          "--target",
          file.toString(),
          input.toString()
        ),
        inputDir
      ) ! streams.value.log
      assert(processResult == 0)
      Seq(file)
    }.taskValue
```

This does the following: Creates the generated source target directory; Generates the source; Propagates any
errors as failures.

#### Use the resources

At this point the required steps are done! The resources are compiled into the application and are
available for access. EG:

```scala
val myData =
    g_resources_lookup_data(
        c"/com/example/my-scala-native-exe/data.txt",
        GResourceLookupFlags.G_RESOURCE_LOOKUP_FLAGS_NONE,
        null
    )
val myDataContents: Ptr[Byte] = g_bytes_get_data(myData, null)
```

The bytes from `g_byte_get_data` are always null terminated. In this case, `myDataContents` is a valid
`CString`.

