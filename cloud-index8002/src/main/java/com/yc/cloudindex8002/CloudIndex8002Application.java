package com.yc.cloudindex8002;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yc.cloudindex8002.mapper")
public class CloudIndex8002Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudIndex8002Application.class, args);
    }

}
