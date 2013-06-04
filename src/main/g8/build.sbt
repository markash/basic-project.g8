name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scalaVersion$"

showSuccess  := true

showTiming   := true

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.9.1" % "test" withSources() withJavadoc()
)

initialCommands := "import $organization$.$name;format="lower,word"$._"
