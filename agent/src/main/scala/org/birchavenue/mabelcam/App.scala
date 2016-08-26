package org.birchavenue.mabelcam

import grizzled.slf4j.Logging
import org.joda.time.LocalDateTime

object App extends Logging {

  def main(args: Array[String]): Unit = {
    
    info("Starting mabelcam")

    while(true) {
      MyAppConfig.cameras.foreach(cam => cam.getImage().foreach(i =>
                           LocalImageStore.writeImage(i, cam.name + " - " + (new LocalDateTime()).toString() + ".jpg")))
      Thread.sleep(10000)
    }
  }

}