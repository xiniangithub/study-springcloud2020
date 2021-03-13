package com.wez.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author wez
 * @Date 2021/3/13
 */
@RestController
@RequestMapping(value = "/order")
public class OrderController {

    private static final String PAYMENT_URL = "http://study-springcloud2020-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/zk")
    public String zk() {
        return restTemplate.getForObject(PAYMENT_URL, String.class);
    }

}
