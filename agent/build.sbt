import com.github.retronym.SbtOneJar._

name := "mabelcam"

version := "0.0.1"

scalaVersion := "2.11.4"

oneJarSettings

libraryDependencies ++= {
Seq(
  "com.typesafe"	%  "config"		% "1.2.1",
  "org.specs2"		%% "specs2" 		% "3.0-M1" % "test"
)}

