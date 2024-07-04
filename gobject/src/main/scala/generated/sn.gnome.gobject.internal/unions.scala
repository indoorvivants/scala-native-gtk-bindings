package sn.gnome.gobject.internal

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTypeCValue = CArray[Byte, Nat._1]
object GTypeCValue:
  given _tag: Tag[GTypeCValue] = Tag.CArray[CChar, Nat._1](Tag.Byte, Tag.Nat1)

opaque type _GTypeCValue = CArray[Byte, Nat._1]
object _GTypeCValue:
  given _tag: Tag[_GTypeCValue] = Tag.CArray[CChar, Nat._1](Tag.Byte, Tag.Nat1)