scalaVersion := "3.3.3"

lazy val dwayne = project
  .in(file("."))
  .settings(
    libraryDependencies += "dev.zio" %% "zio" % "2.0.22"
  )
