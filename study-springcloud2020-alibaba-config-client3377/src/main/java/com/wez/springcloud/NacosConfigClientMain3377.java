package com.wez.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * NacosConfigClientMain3377
 *
 * @Author wez
 * @Time 2021/3/29 21:59
 */
@SpringBootApplication
@EnableDiscoveryClient // 开启Nacos服务注册
public class NacosConfigClientMain3377 {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientMain3377.class, args);
    }

}
