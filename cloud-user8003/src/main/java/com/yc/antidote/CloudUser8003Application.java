package com.yc.antidote;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
// 服务降级注解
@EnableCircuitBreaker
@SpringBootApplication
@MapperScan("com.yc.clouduser8003.dao")
public class CloudUser8003Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudUser8003Application.class, args);
    }

}
