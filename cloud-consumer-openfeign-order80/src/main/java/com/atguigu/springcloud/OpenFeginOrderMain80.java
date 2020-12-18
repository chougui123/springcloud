package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OpenFeginOrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OpenFeginOrderMain80.class,args);
    }
}
