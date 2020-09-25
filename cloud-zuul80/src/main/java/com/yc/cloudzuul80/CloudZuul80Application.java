package com.yc.cloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class CloudZuul80Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudZuul80Application.class, args);
    }

}
