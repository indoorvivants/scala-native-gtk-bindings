# Gtk4 bindings for Scala 3 Native

## Installation

Make sure you have Gtk4 installed:

1. On MacOS, do `brew install gtk4`
2. On Debian-based Linux systems, you can do `sudo apt install libgtk-4-dev`

You can check the installation by running `pkg-config --cflags gtk4` - it should succeed.

The bindings are published to Maven central, with gtk4 specifically being available at the following coordinates:

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
