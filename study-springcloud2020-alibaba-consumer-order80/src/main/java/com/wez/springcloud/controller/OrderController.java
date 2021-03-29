package com.wez.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * OrderController
 *
 * @Author wez
 * @Time 2021/3/29 21:15
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    private String serverUrl = "http://nacos-provider";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/payment/get/{id}")
    public String getPayment(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(serverUrl+"/payment/get/"+id, String.class);
    }

}
