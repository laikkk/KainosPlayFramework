import play.PlayJava

name := """KainosPlayFramework"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs,
javaJpa
)

val appDependencies = Seq(
  "org.hibernate" % "hibernate-entitymanager" % "4.3.6.Final"
)

libraryDependencies += "org.postgresql" % "postgresql" % "9.3-1102-jdbc41"

libraryDependencies += "org.hibernate" % "hibernate-entitymanager" % "4.3.6.Final"