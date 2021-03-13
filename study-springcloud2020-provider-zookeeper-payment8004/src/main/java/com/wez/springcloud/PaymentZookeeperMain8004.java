package com.wez.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author wez
 * @Date 2021/3/13
 */
@SpringBootApplication
@EnableDiscoveryClient // 该注解用于向使用consul或者zookeeper作为注册中心时注册服务
public class PaymentZookeeperMain8004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentZookeeperMain8004.class, args);
    }

}
