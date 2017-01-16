name := "processors-corenlp"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % Test,
  "org.clulab" % "bioresources" % "1.1.21",
  "com.io7m.xom" % "xom" % "1.2.10",
  "org.json4s" %% "json4s-native" % "3.5.0",
  "edu.stanford.nlp" % "stanford-corenlp" % "3.5.2",
  "edu.stanford.nlp" % "stanford-corenlp" % "3.5.2" classifier "models",
  "ch.qos.logback" % "logback-classic" % "1.1.8",
  "org.slf4j" % "slf4j-api" % "1.7.22"
)
