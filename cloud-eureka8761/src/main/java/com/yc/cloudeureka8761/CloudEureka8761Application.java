package com.yc.cloudeureka8761;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CloudEureka8761Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudEureka8761Application.class, args);
    }

}
