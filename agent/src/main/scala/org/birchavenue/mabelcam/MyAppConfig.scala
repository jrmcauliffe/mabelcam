package org.birchavenue.mabelcam

import com.typesafe.config._

object MyAppConfig {
  private val config =  ConfigFactory.load()
 
  object AWSConfig {
    private val awsConfig = config.getConfig("aws")
 
    lazy val key = awsConfig.getString("key")
    lazy val secret = awsConfig.getString("secret")
    lazy val bucket = awsConfig.getString("bucket")   
  }

  object CamConfig {
    private val camConfig = config.getConfig("camera")
 
    lazy val name = camConfig.getString("name")
    lazy val url = camConfig.getString("url")
    lazy val port = camConfig.getInt("port")
    lazy val path = camConfig.getString("path")
    lazy val username = camConfig.getString("username")
    lazy val password = camConfig.getString("password")
  }

}