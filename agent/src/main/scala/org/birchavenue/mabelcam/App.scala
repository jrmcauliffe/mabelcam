package org.birchavenue.mabelcam

import org.joda.time.LocalDateTime

object App {

  def main(args: Array[String]): Unit = {
    
    println("Mabelcam")
  
    val camConfig = MyAppConfig.CamConfig
    val cam1 = new Camera(camConfig.name, camConfig.url, camConfig.port, camConfig.path,
                        camConfig.username, camConfig.password)

    while(true) {
      
      LocalImageStore.writeImage(cam1.getImage(), "cam1 - " + (new LocalDateTime()).toString() + ".jpg")
      Thread.sleep(10000)
    }
     
  }

}