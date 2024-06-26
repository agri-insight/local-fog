ThisBuild / scalaVersion := "2.13.13"

lazy val root = project
  .in(file("."))
  .settings(
    commonSettings,
    name := "agent",
    maintainer := "kivanval@gmail.com",
    version := "0.1.0-SNAPSHOT",
    Universal / packageName := name.value,
    libraryDependencies ++=
      Dependencies.ScalaTest.All ++
        Dependencies.Pekko.All ++
        Dependencies.Logging.All ++
        Dependencies.Json.All
  )
  .enablePlugins(UniversalPlugin, JavaAppPackaging)

val commonSettings = Seq()
