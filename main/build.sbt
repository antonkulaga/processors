name := "processors-main"

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % scalaVersion.value,
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.5",
  "org.scalatest" %% "scalatest" % "3.0.1" % Test,
  "org.clulab" % "bioresources" % "1.1.21",
  "com.io7m.xom" % "xom" % "1.2.10",
  "org.json4s" %% "json4s-native" % "3.5.0",
  "ch.qos.logback" % "logback-classic" % "1.1.8",
  "org.slf4j" % "slf4j-api" % "1.7.22",
  "log4j" % "log4j" % "1.2.17", // this is used by our maltparser clone; otherwise not in use
  "de.bwaldvogel" % "liblinear" % "1.95",
  "tw.edu.ntu.csie" % "libsvm" % "3.17",
  "org.yaml" % "snakeyaml" % "1.17",
  "jline" % "jline" % "2.14.3",
  "commons-io" % "commons-io" % "2.5"
)
