package org.birchavenue.mabelcam

import com.amazonaws.auth.BasicAWSCredentials
import com.amazonaws.services.s3.AmazonS3Client
import com.amazonaws.services.s3.model.ObjectMetadata
import grizzled.slf4j.Logging
import java.io.InputStream
import java.nio.file.{Files, Paths}

object ImageStore extends Logging {
  
   private val s3client = new AmazonS3Client(new BasicAWSCredentials(MyAppConfig.awsConfig.key,
                                                                     MyAppConfig.awsConfig.secret))
   private val metaData = new ObjectMetadata
   metaData.setContentType("image/jpeg")
   
   def writeImage(stream: InputStream, filename: String) = {
     info("Writing " + filename + " to S3")
     s3client.putObject(MyAppConfig.awsConfig.bucket, filename, stream, metaData)
   }
}

object LocalImageStore extends Logging {
  def writeImage(stream: InputStream, filename: String) = {
    info("Writing " + filename + " to filesystem")
    Files.copy(stream, Paths.get(filename))
  }
}