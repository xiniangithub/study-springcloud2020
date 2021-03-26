package com.wez.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * OrderOpenFeignMain80
 *
 * @Author wez
 * @Time 2021/3/15 22:40
 */
@SpringBootApplication
@EnableFeignClients // 启用OpenFeign注解
@EnableEurekaClient
@EnableHystrix
public class OrderOpenFeignHystrixMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderOpenFeignHystrixMain80.class, args);
    }

}
