package com.wez.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author wez
 * @Date 2021/3/13
 */
@Slf4j
@RestController
@RequestMapping(value = "/provider")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/zk")
    public String zk() {
        String result = "Provider zookeeper: " + serverPort + "\t" + UUID.randomUUID().toString();
     return result;
    }

}
