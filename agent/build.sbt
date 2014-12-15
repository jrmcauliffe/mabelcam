name := "mabelcam"

version := "0.0.1"

scalaVersion := "2.11.4"

libraryDependencies ++= {
Seq(
  "com.typesafe"		%  "config"		% "1.2.1",
  "com.amazonaws" 		%  "aws-java-sdk-s3" 	% "1.9.10",
  "net.databinder.dispatch" 	%% "dispatch-core" 	% "0.11.2",
  "org.specs2"			%% "specs2" 		% "3.0-M1" % "test"
)}

