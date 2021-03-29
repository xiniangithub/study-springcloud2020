package com.wez.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * NacosOrderMain80
 *
 * @Author wez
 * @Time 2021/3/29 21:15
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosOrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(NacosOrderMain80.class, args);
    }

}
