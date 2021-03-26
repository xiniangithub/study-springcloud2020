package com.wez.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * PaymentHystrixService
 *
 * @Author wez
 * @Time 2021/3/25 21:10
 */
@FeignClient(value = "STUDY-SPRINGCLOUD2020-PROVIDER-HYSTRIX-PAYMENT") // 服务提供者名称
public interface PaymentHystrixService {

    @GetMapping("/payment/ok/{id}")
    String paymentInfoOk(@PathVariable("id") Integer id);

    @GetMapping("/payment/timeout/{id}")
    String paymentInfoTimeout(@PathVariable("id") Integer id);

}
