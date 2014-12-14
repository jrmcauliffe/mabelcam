package org.birchavenue.mabelcam

import com.typesafe.config._

object MyAppConfig {
  private val config =  ConfigFactory.load()
 
  object AWSConfig {
    private val awsConfig = config.getConfig("aws")
 
    lazy val key = awsConfig.getString("key")
    lazy val secret = awsConfig.getInt("secret")
  }
}