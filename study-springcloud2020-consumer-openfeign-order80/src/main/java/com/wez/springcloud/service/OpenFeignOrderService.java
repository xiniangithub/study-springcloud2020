package com.wez.springcloud.service;

import com.wez.springcloud.entities.CommonResult;
import com.wez.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * OpenFeignOrderService
 *
 * @Author wez
 * @Time 2021/3/15 22:43
 */
@FeignClient(value = "STUDY-SPRINGCLOUD2020-PROVIDER-PAYMENT") // 服务提供者名称
public interface OpenFeignOrderService {

    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping("/payment/timeout/get/{id}")
    CommonResult<Payment> timeoutGetPaymentById(@PathVariable("id") Long id);

}
