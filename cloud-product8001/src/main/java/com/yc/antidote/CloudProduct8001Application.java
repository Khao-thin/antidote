package com.yc.antidote;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
//服务降级注解
@EnableCircuitBreaker
@SpringBootApplication
@MapperScan("com.yc.antidote.dao")
@EnableFeignClients
public class CloudProduct8001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProduct8001Application.class, args);
    }

}
