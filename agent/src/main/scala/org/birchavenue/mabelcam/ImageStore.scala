package org.birchavenue.mabelcam


import com.amazonaws.AmazonClientException
import com.amazonaws.AmazonServiceException
import com.amazonaws.auth.profile.ProfileCredentialsProvider
import com.amazonaws.services.s3.AmazonS3
import com.amazonaws.services.s3.AmazonS3Client
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.auth.BasicAWSCredentials

object ImageStore {
  
  
  
   private val s3client = new AmazonS3Client(new BasicAWSCredentials(MyAppConfig.AWSConfig.key, 
                                                                     MyAppConfig.AWSConfig.secret))
   
   
   def test(): String = {
     
     "X"
   }
   
   
}