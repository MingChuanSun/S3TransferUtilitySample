Running S3TransferUtility Sample
=============================================
This sample demonstrates how to use the high-level class TransferUtility to perform download and upload tasks and manage the tasks.  You can also follow the tutorial for a step-by-step guide in understanding the S3TransferUtilitySample.

1. Create a identity pool
   * Go to https://console.aws.amazon.com/cognito/ and create a new identity pool. Make sure to enable access to unauthenticated identities and use the default roles.
   * Download the starter code at the last step of the wizard.
   * The starter code, has your Identity Pool ID. Keep this, you will need to add it to the sample later.

2. Set up permissions
   * Go to https://console.aws.amazon.com/iam/home and select "Roles".
   * Select the unauthenticated role you just created in step 1.
   * Select "Attach Policy", then find "AmazonS3FullAccess" and attach it it to the role.
   * Note:  This will grant users in the identity pool full access to all buckets and operations in S3.  In a real app, you should restrict users to only have access to the resources they need.
   
3. Create a bucket
   * Go to https://console.aws.amazon.com/s3/home
   * Create a bucket with a name you want.

4. Import the sample project
   * Import the sample as Android project into your IDE of choice.
   * Open com.amazonaws.demo.s3transferutility.Constants.java.
   * Update "COGNITO_POOL_ID" with the value you got from step 1.
   * Update "COGNITO_POOL_REGION" with the region of your cognito identity pool from step 1. For example, `us-east-1`. 
   * Update "BUCKET_NAME" with the value in step 3.
   * Update "BUCKET_REGION" with the region of your s3 bucket from step 3. For example, `us-east-1`.   

5. Import the AWS SDK for Android
   * You can download the newest AWS Android SDK from http://aws.amazon.com/mobile/sdk/ and copy the jars into libs directory. Include the following jars
      + aws-android-sdk-core-X.X.X.jar
      + extras/aws-android-sdk-cognito-X.X.X.jar
      + aws-android-sdk-s3-X.X.X.jar
   
6. Run the sample

上传下载代码示例（上传两种方式，下载两种方式）
============================================
一、Uploading
To upload an object to Amazon S3, use the AmazonS3EncryptionClient you initialized, and then use either PutObjectRequest or TransferUtility.

1.Using PutObjectRequest
Java:

final PutObjectRequest putObjectRequest = new PutObjectRequest(<bucketName>, <key>, <file>);
final PutObjectResult putObjectResult = s3Client.PutObject(putObjectRequest);

2.Using TransferUtility
Java:

final TransferUtility transferUtility = new TransferUtility(s3Client, <context>);
final TransferObserver transferObserver =  transferUtility
                                                  .upload(<bucketName>, <key>, <file>);
二、Downloading
To download an object from Amazon S3, use the AmazonS3EncryptionClient you initialized earlier, and then use either GetObjectRequest or TransferUtility.

1.Using GetObjectRequest
Java:

final InputStream inputStream = s3Client.getObject(<bucketName>, <key>).getObjectContent();

2.Using TransferUtility:
Java:

final File tempDownloadFile = temp.newFile();
final TransferObserver observer = transferUtility
                                       .download(<bucketName>, <key>, <tempDownloadFile>);
