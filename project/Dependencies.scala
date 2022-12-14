import sbt._

object Dependencies {

  lazy val dependencies: Seq[ModuleID] = Seq(
    Seq(betterFiles),
    configDeps,
    loggingDeps,
    graphDeps,
    sparkDeps,
    testingDeps,
    gcp,
    aws,
    hadoopAws,
    Seq(typeSafeConfig)
  ).flatten

  lazy val betterFiles = "com.github.pathikrit" %% "better-files-akka" % "3.9.1"

  lazy val configDeps = Seq(
    "com.github.pureconfig" %% "pureconfig" % "0.14.1"
  )

  lazy val loggingDeps = Seq(
    "ch.qos.logback" % "logback-classic" % "1.2.3",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2"
  )

  lazy val graphDeps = Seq(
    "org.jgrapht" % "jgrapht-core" % "1.4.0"
  )

  lazy val sparkVersion = "3.1.1"
  lazy val sparkDeps = Seq(
    "com.github.fommil.netlib" % "all" % "1.1.2" pomOnly (),
    "com.databricks" %% "spark-xml" % "0.11.0",
    "org.apache.spark" %% "spark-core" % sparkVersion,
    "org.apache.spark" %% "spark-sql" % sparkVersion,
    "org.apache.spark" %% "spark-graphx" % sparkVersion,
    "org.apache.spark" %% "spark-mllib" % sparkVersion  
  )
  lazy val scalaCheck = "org.scalacheck" %% "scalacheck" % "1.14.3"

  lazy val testVersion = "3.2.2"
  lazy val testingDeps = Seq(
    "org.scalactic" %% "scalactic" % testVersion,
    "org.scalatest" %% "scalatest" % testVersion % "test"
  ) :+ scalaCheck

  lazy val typeSafeConfig = "com.typesafe" % "config" % "1.4.1"

  lazy val gcp = Seq(
    "com.google.cloud" % "google-cloud-dataproc" % "2.3.2" % "provided",
    "com.google.cloud" % "google-cloud-storage" % "2.4.2"
  )

  lazy val hadoopAws = Seq(
    "org.apache.hadoop" % "hadoop-common" % "3.1.0",
    "org.apache.hadoop" % "hadoop-client" % "3.1.0",
    "org.apache.hadoop" % "hadoop-mapreduce-client-core" % "3.1.0",
    "org.apache.hadoop" % "hadoop-aws" % "3.1.0"

  )
  lazy val aws = Seq("com.amazonaws" % "aws-java-sdk-bundle" % "1.11.271")
}
