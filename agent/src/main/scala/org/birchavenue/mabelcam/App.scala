package org.birchavenue.mabelcam



object App {

  def main(args: Array[String]): Unit = {
    
    println("Mabelcam")
  
    val camConfig = MyAppConfig.CamConfig
    val cam1 = new Camera(camConfig.name, camConfig.url, camConfig.path,
                        camConfig.username, camConfig.password)

    while(true) {
      
      ImageStore.writeImage(cam1.getImage, "cam1.jpg")
      Thread.sleep(10000)
    }
     
  }

}