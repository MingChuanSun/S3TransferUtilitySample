/*
 * Copyright 2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.demo.s3transferutility;

import com.amazonaws.services.s3.model.Region;

public class Constants {

    /*请求服务器地址*/
    public static final String ENDPOINT = "http://10.10.101.80:9000";
    public static final String BASEURL = "http://192.168.88.200:9090";

    public static final String ACCESKEY = "6BVEBRFYWF5XIDHCGZG0";
    public static final String SECRETYKEY = "pGcE+e2f1NNayPtjlGlsi7OmJEmazXhEbyq1uOY6";
    public static final String BUCKET = "bucket01";

    /**/
    public static final String ACCESSKEY = "1NA5K80UU85NMPK4BPEW";

    /**/
    public static final String SecretKey = "yIK7ewMumZ88e6KDb6nBOE4C5k9uNShlbCNWnN8X";

    /*
     * Note, you must first create a bucket before running
     * the sample . After creating a bucket,
     * put it's name in the field below.
     */
    public static final String BUCKET_NAME = "201705";

//------------------------下面参数暂时不用-------------------------------------
    /*
     * You should replace these values with your own. See the README for details
     * on what to fill in.
     */
//    public static final String COGNITO_POOL_ID = "123";

    /*
     * Region of your Cognito identity pool ID.
     */
//    public static final String COGNITO_POOL_REGION = Region.CN_Beijing.toString();

    /*
     * Region of your bucket.
     */
    public static final String BUCKET_REGION = Region.CN_Beijing.toString();


}
