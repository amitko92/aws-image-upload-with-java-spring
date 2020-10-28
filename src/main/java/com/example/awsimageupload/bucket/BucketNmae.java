package com.example.awsimageupload.bucket;

public enum BucketNmae {

    PROFILE_IMAGE("amit-database01");

    private final String bucketName;

    BucketNmae(String bucketName){
        this.bucketName = bucketName;
    }

    public String getBucketName(){
        return bucketName;
    }
}
