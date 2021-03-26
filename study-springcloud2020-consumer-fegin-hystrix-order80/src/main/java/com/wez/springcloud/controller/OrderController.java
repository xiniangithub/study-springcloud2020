package com.wez.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.wez.springcloud.service.PaymentHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * OrderController
 *
 * @Author wez
 * @Time 2021/3/25 21:13
 */
@RestController
@RequestMapping("/consumer")
@DefaultProperties(defaultFallback = "globalHandler")
public class OrderController {

    @Autowired
    private PaymentHystrixService paymentHystrixService;

    @Value("${server.port}")
    private String serverPort;

    @HystrixCommand
    @GetMapping("/payment/ok/{id}")
    public String paymentInfoOk(@PathVariable("id") Integer id) {
        int a = 10/0;
        return paymentHystrixService.paymentInfoOk(id);
    }

    @HystrixCommand(fallbackMethod = "paymentInfoTimeoutHandler", commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds", value="3000")
    })
    @GetMapping("/payment/timeout/{id}")
    public String paymentInfoTimeout(@PathVariable("id") Integer id) {
        return paymentHystrixService.paymentInfoTimeout(id);
    }

    /**
     * 服务降级的兜底方法
     * @param id
     * @return
     */
    public String paymentInfoTimeoutHandler(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + " 【Consumer】：系统超时或异常，请稍后再试！！！";
    }

    /**
     * 全局的服务降级兜底方法
     * @return
     */
    public String globalHandler() {
        return "线程池：" + Thread.currentThread().getName() + " 【Consumer】全局的：系统超时或异常，请稍后再试！！！";
    }

}
