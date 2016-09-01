package org.birchavenue.mabelcam

import grizzled.slf4j.Logging
import org.joda.time.LocalDateTime
import org.joda.time.format.DateTimeFormat

object App extends Logging {

  def main(args: Array[String]): Unit = {
    
    info("Starting mabelcam")

    val fmt = DateTimeFormat.forPattern(MyAppConfig.dateTimeFormat)

    while(true) {
      MyAppConfig.cameras.foreach(cam => cam.getImage().foreach(i =>
                           LocalImageStore.writeImage(i, cam.name + " - " + fmt.print(new LocalDateTime()) + ".jpg")))
      Thread.sleep(10000)
    }
  }

}