package org.birchavenue.mabelcam

import com.typesafe.config._
import net.ceedubs.ficus.Ficus.toFicusConfig
import net.ceedubs.ficus.readers.AllValueReaderInstances

object MyAppConfig extends AllValueReaderInstances {
  private val config =  ConfigFactory.load()

  val awsConfig = config.as[AWSConfig]("aws")
  val cameras = config.as[List[Camera]]("cameras")
  val dateTimeFormat = config.as[String]("dateTimeFormat")
}
