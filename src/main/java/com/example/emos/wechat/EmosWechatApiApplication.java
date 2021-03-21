package com.example.emos.wechat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class EmosWechatApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmosWechatApiApplication.class, args);
    }

}
