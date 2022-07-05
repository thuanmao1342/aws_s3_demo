package com.example.aws_s3_demo;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AwsS3DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwsS3DemoApplication.class, args);
    }

//    private final String accessKeyId = "AKIA2S63VQFROYG5XGEU";
//    private final String secretAccessKey = "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";
//    private final String s3RegionName = "ap-southeast-1";
    private final String accessKeyId = "RXN1CW8XS9TZCKTK6GKV";
    private final String secretAccessKey = "Bf11IKqNhU1aTgjHkQgguYfE0QDIlQve4S2RB9hE";
    private final String s3RegionName = "s3.ap-southeast-1.wasabisys.com";

    @Bean
    public AmazonS3 getAmazonS3Client() {
        final BasicAWSCredentials basicAwsCredentials = new BasicAWSCredentials(accessKeyId, secretAccessKey);
        return AmazonS3ClientBuilder
                .standard()
                .withCredentials(new AWSStaticCredentialsProvider(basicAwsCredentials))
                .withRegion(s3RegionName)
                .build();
    }
}
