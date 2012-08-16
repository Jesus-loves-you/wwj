import sbt._
import Keys._
import PlayProject._

object Resolvers {
  val all = Seq()
}

object PrayPlatfrom extends Build {

    val appName         = "pray-platform"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA)
    .settings(defaultScalaSettings:_*)
    .settings(
      organization := "com.tapad",
      parallelExecution in Test := false,
      resolvers ++= Resolvers.all,
      credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")
    )       

}
