package com.wez.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * PaymentHystrixService Fallback 类
 *
 * @Author wez
 * @Time 2021/3/26 20:57
 */
@Component
public class PaymentHystrixFallbackService implements PaymentHystrixService {

    /**
     * Hystrix fallback方法
     * @param id
     * @return
     */
    @Override
    public String paymentInfoOk(Integer id) {
        return "【Consumer】：paymentInfoOk 系统超时或异常，请稍后再试！！！";
    }

    /**
     * Hystrix fallback方法
     * @param id
     * @return
     */
    @Override
    public String paymentInfoTimeout(Integer id) {
        return "【Consumer】：paymentInfoTimeout 系统超时或异常，请稍后再试！！！";
    }

}
