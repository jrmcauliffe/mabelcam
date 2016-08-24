package org.birchavenue.mabelcam

import org.joda.time.LocalDateTime

object App {

  def main(args: Array[String]): Unit = {
    
    println("Mabelcam")
  
    val camConfig = MyAppConfig.CamConfig
    val cam1 = new Camera(camConfig.name, camConfig.url, camConfig.port, camConfig.path,
                        camConfig.username, camConfig.password)

    while(true) {

      cam1.getImage().foreach(i => LocalImageStore.writeImage(i, "cam1 - " + (new LocalDateTime()).toString() + ".jpg"))
      Thread.sleep(10000)
    }
     
  }

}