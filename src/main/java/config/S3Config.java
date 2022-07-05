package config;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class S3Config {
//    private final String accessKeyId = "AKIA2S63VQFROYG5XGEU";
//    private final String secretAccessKey = "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";
//    private final String s3RegionName = "ap-south-1";
//
//    @Bean
//    public AmazonS3 getAmazonS3Client() {
//        final BasicAWSCredentials basicAwsCredentials = new BasicAWSCredentials(accessKeyId, secretAccessKey);
//        return AmazonS3ClientBuilder
//                .standard()
//                .withCredentials(new AWSStaticCredentialsProvider(basicAwsCredentials))
//                .withRegion(s3RegionName)
//                .build();
//    }
}
