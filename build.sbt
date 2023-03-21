import Dependencies._

ThisBuild / scalaVersion     := "2.13.10"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "grader",
    libraryDependencies ++= Seq(
        "org.http4s" %% "http4s-blaze-server" % "1.0.0-M29",
        "org.http4s" %% "http4s-dsl" % "1.0.0-M29",
        "org.http4s" %% "http4s-circe" % "1.0.0-M29",
        "io.circe" %% "circe-generic" % "0.14.1",
        "io.circe" %% "circe-parser" % "0.14.1"
    )
  )

