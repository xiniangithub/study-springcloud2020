package com.wez.springcloud.controller;

import com.wez.springcloud.entities.CommonResult;
import com.wez.springcloud.entities.Payment;
import com.wez.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author wez
 * @Date 2021/3/10
 */
@Slf4j
@RestController
@RequestMapping(value = "/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment) {
        int affectRow = paymentService.create(payment);
        log.info("插入"+affectRow+"条数据");

        if (affectRow > 0) {
            return new CommonResult(200, "插入成功", affectRow);
        } else {
            return new CommonResult(444, "插入失败");
        }
    }

    @GetMapping("/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);

        if (payment != null) {
            return new CommonResult(200, "查询成功", payment);
        } else {
            return new CommonResult(444, "查询失败");
        }
    }

}
