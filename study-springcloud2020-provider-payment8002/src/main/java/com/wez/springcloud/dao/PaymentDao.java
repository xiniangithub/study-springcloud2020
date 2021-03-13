package com.wez.springcloud.dao;

import com.wez.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author wez
 * @Date 2021/3/10
 */
@Mapper
public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(Long id);

}
