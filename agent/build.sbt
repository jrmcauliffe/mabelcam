name := "mabelcam"

version := "0.0.6"

scalaVersion := "2.11.8"

resolvers += Resolver.jcenterRepo

libraryDependencies ++= {
Seq(
  "com.typesafe"            %  "config"          % "1.3.0",
  "com.amazonaws"           %  "aws-java-sdk-s3" % "1.11.29",
  "org.apache.sanselan"     %  "sanselan"        % "0.97-incubator",
  "joda-time"               %  "joda-time"       % "2.9.4",
  "org.joda"                %  "joda-convert"    % "1.8",
  "ch.qos.logback"          %  "logback-classic" % "1.0.13",
  "com.iheart"              %% "ficus"           % "1.2.3",
  "net.databinder.dispatch" %% "dispatch-core"   % "0.11.2",
  "org.clapper"             %% "grizzled-slf4j"  % "1.0.4",
  "org.scalactic"           %% "scalactic"       % "3.0.0",
  "org.scalatest"           %% "scalatest"       % "3.0.0"  % "test")}

