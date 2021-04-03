package com.wez.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务限流
 * @Author wez
 * @Time 2021/3/31 20:46
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
        log.info("---> TestA");
        return "=========> TestA";
    }

    @GetMapping("/testB")
    public String testB() {
        return "=========> TestB";
    }

    @GetMapping("/testC")
    public String testC() {
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "=========> TestC";
    }

}
