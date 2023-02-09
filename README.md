Run a Scala 3 Native Gtk application on linux.

Make sure you have `gtk4` *and* `libgtk-4-dev` installed. To check, run `pkg-config --cflags gtk4` - if it works, you're ready to rock'n'roll.

`sbt run` is all you need.

Bindings generated using [sn-bindgen](https://sn-bindgen.indoorvivants.com/)

![GtkBindingsDemo](https://user-images.githubusercontent.com/1052965/217792578-a4faa191-053b-48a7-aa2a-207709690fa1.gif)
