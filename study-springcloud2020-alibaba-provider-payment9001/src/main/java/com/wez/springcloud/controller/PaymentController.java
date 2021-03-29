package com.wez.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * PaymentController
 *
 * @Author wez
 * @Time 2021/3/29 21:02
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/get/{id}")
    public String getPayment(@PathVariable("id") Integer id) {
        return "Nacos registry, server port is " + serverPort + ", id=" + id;
    }

}
