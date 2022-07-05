package com.example.aws_s3_demo.controller;

import com.amazonaws.HttpMethod;
import com.example.aws_s3_demo.service.S3Service;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin("*")
public class S3Controller {
    private final S3Service s3Service;

    @GetMapping("/url")
    public ResponseEntity<String> generatePreSignedUrl(@RequestParam("fileName") String fileName){
        return ResponseEntity.ok().body(s3Service.generatePreSignedUrl(fileName, "s3-nvt", HttpMethod.PUT));
    }

}
