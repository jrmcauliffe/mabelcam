package org.birchavenue.mabelcam


import com.amazonaws.AmazonClientException
import com.amazonaws.AmazonServiceException
import com.amazonaws.auth.profile.ProfileCredentialsProvider
import com.amazonaws.services.s3.AmazonS3
import com.amazonaws.services.s3.AmazonS3Client
import com.amazonaws.services.s3.model.PutObjectRequest
import com.amazonaws.auth.BasicAWSCredentials
import java.io.{BufferedOutputStream, FileOutputStream, InputStream}
import java.nio.file.{Files, Paths}

import com.amazonaws.services.s3.model.ObjectMetadata


object ImageStore {
  
   private val s3client = new AmazonS3Client(new BasicAWSCredentials(MyAppConfig.AWSConfig.key, 
                                                                     MyAppConfig.AWSConfig.secret))
   private val metaData = new ObjectMetadata
   metaData.setContentType("image/jpeg")
   
   def writeImage(stream: InputStream, filename: String) = {
     s3client.putObject(MyAppConfig.AWSConfig.bucket, filename, stream, metaData)
   }
   
}

object LocalImageStore{
  def writeImage(stream: InputStream, filename: String) = {

    Files.copy(stream, Paths.get(filename))

  }
}