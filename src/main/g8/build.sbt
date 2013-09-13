name := "$name$"

version := "0.0.1"

organization := "$package$"

scalaVersion := "2.10.2"

resolvers ++= Seq("snapshots"     at "http://oss.sonatype.org/content/repositories/snapshots",
                "releases"        at "http://oss.sonatype.org/content/repositories/releases"
                )

seq(com.github.siasia.WebPlugin.webSettings :_*)

scalacOptions ++= Seq("-deprecation", "-unchecked")

libraryDependencies ++= {
  val liftVersion = "2.5-SNAPSHOT"
  Seq(
    "net.liftweb"       %% "lift-webkit"        % "2.6-SNAPSHOT",
    "net.liftweb"       %% "lift-testkit"        % "2.6-SNAPSHOT",
    "net.liftmodules"   %% "lift-jquery-module" % (liftVersion + "-2.1-SNAPSHOT"),
    "org.eclipse.jetty" % "jetty-webapp"        % "7.5.4.v20111024"  % "container; test",
    "ch.qos.logback"    % "logback-classic"     % "1.0.6",
    "org.specs2"        %% "specs2"             % "1.11"             % "test"
  )
}
