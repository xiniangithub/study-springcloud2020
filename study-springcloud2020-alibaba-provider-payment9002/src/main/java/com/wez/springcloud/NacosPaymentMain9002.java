package com.wez.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ProviderPaymentMain9002
 *
 * @Author wez
 * @Time 2021/3/29 20:43
 */
@SpringBootApplication
@EnableDiscoveryClient // 开启Nacos服务注册
public class NacosPaymentMain9002 {

    public static void main(String[] args) {
        SpringApplication.run(NacosPaymentMain9002.class, args);
    }

}
