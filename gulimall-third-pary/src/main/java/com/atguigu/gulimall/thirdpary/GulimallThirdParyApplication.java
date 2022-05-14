package com.atguigu.gulimall.thirdpary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GulimallThirdParyApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallThirdParyApplication.class, args);
    }

}
