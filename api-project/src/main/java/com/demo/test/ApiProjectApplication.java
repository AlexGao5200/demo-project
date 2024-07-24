package com.demo.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
@MapperScan(value = "com.demo.test.mapper")
public class ApiProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiProjectApplication.class, args);
    }

}
