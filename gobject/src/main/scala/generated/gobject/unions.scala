package gobject
package unions

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

import _root_.gobject.enumerations.*
import _root_.gobject.aliases.*
import _root_.gobject.structs.*
import _root_.gobject.unions.*
/**
 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gobject/gtype.h
*/
opaque type GTypeCValue = CArray[Byte, Nat._1]
object GTypeCValue:
  given _tag: Tag[GTypeCValue] = Tag.CArray[CChar, Nat._1](Tag.Byte, Tag.Nat1)

/**
 * [bindgen] header: /opt/homebrew/Cellar/glib/2.78.3/include/glib-2.0/gobject/gtype.h
*/
opaque type _GTypeCValue = CArray[Byte, Nat._1]
object _GTypeCValue:
  given _tag: Tag[_GTypeCValue] = Tag.CArray[CChar, Nat._1](Tag.Byte, Tag.Nat1)

