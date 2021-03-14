package com.wez.springcloud;

import com.wez.loadbalancer.rule.RandomRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author wez
 * @Date 2021/3/10
 */
@SpringBootApplication
// 指定微服务的负载均衡策略
@RibbonClient(name="STUDY-SPRINGCLOUD2020-PROVIDER-PAYMENT", configuration = RandomRuleConfig.class)
public class OrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }

}
