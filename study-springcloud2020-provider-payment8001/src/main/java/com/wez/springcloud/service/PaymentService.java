package com.wez.springcloud.service;

import com.wez.springcloud.entities.Payment;

/**
 * @Author wez
 * @Date 2021/3/10
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(Long id);

}
