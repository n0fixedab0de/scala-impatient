name := "ImpatientScala"

organization := "impatient"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.10.0"

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.10" % "test",
  "org.specs2" %% "specs2" % "1.13" % "test",
  "org.scalatest" %% "scalatest" % "1.9.1" % "test"
)