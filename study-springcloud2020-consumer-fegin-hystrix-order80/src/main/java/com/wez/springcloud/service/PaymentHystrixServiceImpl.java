package com.wez.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * PaymentHystrixServiceImpl
 *
 * @Author wez
 * @Time 2021/3/26 20:57
 */
@Component
public class PaymentHystrixServiceImpl implements PaymentHystrixService {

    /**
     * Hystrix fallback方法
     * @param id
     * @return
     */
    @Override
    public String paymentInfoOk(Integer id) {
        return null;
    }

    /**
     * Hystrix fallback方法
     * @param id
     * @return
     */
    @Override
    public String paymentInfoTimeout(Integer id) {
        return null;
    }

}
