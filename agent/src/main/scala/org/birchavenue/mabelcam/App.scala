package org.birchavenue.mabelcam



object App {

  def main(args: Array[String]): Unit = {
    
  println("Mabelcam")
  
  val camConfig = MyAppConfig.CamConfig
  
  val cam1 = new Camera(camConfig.name, camConfig.url, camConfig.path,
                        camConfig.username, camConfig.password)
  
  ImageStore.writeImage(cam1.getImage, "mabel.jpg")
    
  }

}