package com.wez.springcloud.controller;

import com.wez.springcloud.entities.CommonResult;
import com.wez.springcloud.service.OpenFeignOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * OrderController
 *
 * @Author wez
 * @Time 2021/3/15 22:41
 */
@RestController
@RequestMapping(value = "/consumer")
public class OrderController {

    @Autowired
    private OpenFeignOrderService openFeignOrderService;

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        return openFeignOrderService.getPaymentById(id);
    }

    @GetMapping("/payment/timeout/get/{id}")
    public CommonResult timeoutGetPaymentById(@PathVariable("id") Long id) {
        return openFeignOrderService.timeoutGetPaymentById(id);
    }

}
