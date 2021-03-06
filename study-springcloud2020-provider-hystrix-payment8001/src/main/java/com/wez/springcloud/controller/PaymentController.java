package com.wez.springcloud.controller;

import com.wez.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * PaymentController
 *
 * @Author wez
 * @Time 2021/3/25 20:27
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    /**
     * 服务降级
     * @param id
     * @return
     */
    @GetMapping("/ok/{id}")
    public String paymentInfoOk(@PathVariable("id") Integer id) {
        return paymentService.paymentInfoOk(id);
    }

    /**
     * 服务降级
     * @param id
     * @return
     */
    @GetMapping("/timeout/{id}")
    public String paymentInfoTimeout(@PathVariable("id") Integer id) {
        return paymentService.paymentInfoTimeout(id);
    }

    /**
     * 服务熔断
     * @param id
     * @return
     */
    @GetMapping("/breakdown/{id}")
    public String paymentInfoBreakdown(@PathVariable("id") Integer id) {
        return paymentService.paymentInfoBreakdown(id);
    }

}
