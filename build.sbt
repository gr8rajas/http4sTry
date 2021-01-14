name := "httpTry"

version := "0.1"

scalaVersion := "2.13.4"

val  Http4sVersion  =  "0.21.0"
val  LogbackVersion  =  "1.2.3"
val  scalaLogging  = "3.9.2"
val  swagger =  "1.0.6"
val ScalatraVersion = "2.7.1"
val tapirVersion = "0.17.3"

libraryDependencies  ++=  Seq(
  "org.http4s"            %%  "http4s-blaze-server"  %  Http4sVersion,
  "org.http4s"            %%  "http4s-dsl"                    %  Http4sVersion,
  "com.typesafe.scala-logging" %% "scala-logging" % scalaLogging,
  "io.swagger" %% "swagger-scala-module" % swagger,
  "org.scalatra" %% "scalatra-swagger" % ScalatraVersion,
  "com.softwaremill.sttp.tapir" %% "tapir-core" % tapirVersion,
  "com.softwaremill.sttp.tapir" %% "tapir-http4s-server" % tapirVersion,
  "ch.qos.logback"    %    "logback-classic"          %  LogbackVersion

)
