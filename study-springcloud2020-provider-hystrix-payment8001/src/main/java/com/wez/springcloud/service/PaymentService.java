package com.wez.springcloud.service;

/**
 * PaymentService
 *
 * @Author wez
 * @Time 2021/3/25 20:24
 */
public interface PaymentService {

    String paymentInfoOk(Integer id);

    String paymentInfoTimeout(Integer id);

}
