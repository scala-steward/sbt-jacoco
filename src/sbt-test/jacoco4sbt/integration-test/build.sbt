libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.0" % "test,it"

val root = project.in(file(".")).configs(IntegrationTest)
scalaVersion := "2.10.4"

Defaults.itSettings

enablePlugins(JacocoItPlugin)