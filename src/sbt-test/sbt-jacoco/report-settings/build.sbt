name := "jacocoTest"
organization := "com.navetas"

scalaVersion := "2.12.15"
scalacOptions ++= Seq("-deprecation", "-optimize", "-unchecked", "-Xlint", "-language:_")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"

Test / jacocoReportSettings := JacocoReportSettings()
  .withFormats(
    JacocoReportFormats.ScalaHTML.withoutBranches,
    JacocoReportFormats.XML,
    JacocoReportFormats.CSV
  )
