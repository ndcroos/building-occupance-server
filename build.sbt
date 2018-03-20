name := "tryakka"

version := "1.0"

scalaVersion := "2.11.1"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.3.4"

libraryDependencies += "com.typesafe.akka" %% "akka-http"   % "10.1.0" 
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.5.11" // or whatever the latest version is
libraryDependencies += "com.typesafe.akka" %% "akka-http-spray-json" % "10.1.0"