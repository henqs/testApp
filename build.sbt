import NativePackagerKeys._

herokuAppName in Compile := "morning-wildwood-5483"

name := """Grupp 11 App"""

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.27"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs,
  "org.apache.directory.studio" % "org.apache.commons.io" % "2.4"
)

fork in run := true