package org.birchavenue.mabelcam

import java.io.InputStream
import java.io.ByteArrayInputStream
import dispatch._
import Defaults._

case class Camera(name: String, url: String, port: Int, path: String, username: String, password: String) {

  def getImage(): Option[InputStream] = {
    val svc = dispatch.url(url + ":" + port.toString + path).as(username, password)
    val img = Http(svc OK as.Bytes).option()
    img.map(i => new ByteArrayInputStream(i))
  }
  
}