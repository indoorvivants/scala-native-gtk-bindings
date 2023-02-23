# gir-schema

To update the schema, run

```
# alternatively can be sourced from /usr/share/gir-1.0/gir-1.2.rnc
curl https://gitlab.gnome.org/GNOME/gobject-introspection/-/raw/main/docs/gir-1.2.rnc > gir-schema/src/main/relaxng/gir.rnc
sbt gir-schema/generateXsd
```
