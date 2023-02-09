Run a Scala 3 Native Gtk application on linux.

Make sure you have `gtk4` *and* `libgtk-4-dev` installed. To check, run `pkg-config --cflags gtk4` - if it works, you're ready to rock'n'roll.

`sbt run` is all you need.

Bindings generated using [sn-bindgen](https://sn-bindgen.indoorvivants.com/)
