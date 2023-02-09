// DO NOT EDIT! This file is auto-generated.

// This plugin enables semantic information to be produced by sbt.
// It also adds support for debugging using the Debug Adapter Protocol
resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
addSbtPlugin("org.scalameta" % "sbt-metals" % "0.11.10+117-476976c1-SNAPSHOT")

// This plugin adds the BSP debug capability to sbt server.

addSbtPlugin("ch.epfl.scala" % "sbt-debug-adapter" % "3.0.4")

