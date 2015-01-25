
name := "hello-world"

organization := "io.github.davepkennedy"

version := "1.0"

scalaVersion := "2.11.1"

mainClass in assembly := Some("io.github.davepkennedy.helloworld.HelloWorldApplication")

jarName in assembly := { s"${name.value}.jar" }

val jackson_version = "2.2.2"

val dropwizard_version = "0.7.1"

val dropwizard_group = "io.dropwizard"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.1.6" % "test",
  dropwizard_group % "dropwizard-core" % dropwizard_version,
  dropwizard_group % "dropwizard-assets" % dropwizard_version,
  dropwizard_group % "dropwizard-views-mustache" % dropwizard_version,
  dropwizard_group % "dropwizard-db" % dropwizard_version,
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.4.1",
  "org.slf4j" % "slf4j-api" % "1.7.5"
)
