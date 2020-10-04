package com.yc.antidote;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableEurekaClient
// 服务降级注解
@EnableCircuitBreaker
@SpringBootApplication
// 开启Redis会话共享
@EnableRedisHttpSession
@MapperScan("com.yc.antidote.dao")
public class CloudUser8003Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudUser8003Application.class, args);
    }

}
