package com.wez.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * ApplicationContextConfig
 *
 * @Author wez
 * @Time 2021/3/29 21:18
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced // 支持负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
