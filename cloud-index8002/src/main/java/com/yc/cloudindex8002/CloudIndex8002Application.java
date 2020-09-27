package com.yc.cloudindex8002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
// 服务降级注解
@EnableCircuitBreaker
@SpringBootApplication
@EnableFeignClients
public class CloudIndex8002Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudIndex8002Application.class, args);
    }

}
