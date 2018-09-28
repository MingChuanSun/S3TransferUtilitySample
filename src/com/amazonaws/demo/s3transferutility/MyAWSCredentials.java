package com.amazonaws.demo.s3transferutility;

import com.amazonaws.auth.AWSCredentials;

/**
 * Created by nergal on 2017/5/12.
 */

public class MyAWSCredentials implements AWSCredentials {
    @Override
    public String getAWSAccessKeyId() {
        return Constants.ACCESKEY;
    }

    @Override
    public String getAWSSecretKey() {
        return Constants.SECRETYKEY;
    }
}
