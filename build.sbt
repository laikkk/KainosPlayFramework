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
  javaJpa //Added for hibernate
)

val appDependencies = Seq(
  "org.hibernate" % "hibernate-entitymanager" % "4.3.6.Final"
)

//Added for hibernate
libraryDependencies += "org.postgresql" % "postgresql" % "9.3-1102-jdbc41"

//Added for hibernate
libraryDependencies += "org.hibernate" % "hibernate-entitymanager" % "4.3.6.Final"

//Added for bootstrap
libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.3.0",
  "org.webjars" % "bootstrap" % "3.1.1-2"
)