package com.wez.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * PaymentServiceImpl
 *
 * @Author wez
 * @Time 2021/3/25 20:24
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public String paymentInfoOk(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + " PaymentInfoOk，id=" + id;
    }

    @HystrixCommand(fallbackMethod = "paymentInfoTimeoutHandler", commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds", value="3000")
    })
    @Override
    public String paymentInfoTimeout(Integer id) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + " PaymentInfoTimeout，id=" + id + "，耗时5s";
    }

    /**
     * 服务降级的兜底方法
     * @param id
     * @return
     */
    public String paymentInfoTimeoutHandler(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + " 【Provider】系统超时或异常，请稍后再试！！！";
    }

    /**
     * 服务熔断
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "paymentInfoBreakdownHandler", commandProperties = {
            @HystrixProperty(name="circuitBreaker.enabled", value="true"), // 开启断路器
            @HystrixProperty(name="circuitBreaker.requestVolumeThreshold", value="10"), // 请求次数
            @HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds", value="10000"), // 时间窗口
            @HystrixProperty(name="circuitBreaker.errorThresholdPercentage", value="60"), // 失败率，百分比
    })
    @Override
    public String paymentInfoBreakdown(Integer id) {
        if (id < 0) {
            throw new IllegalArgumentException("参数不能小于0，id=" + id + "，" + UUID.randomUUID().toString());
        }
        return "线程池：" + Thread.currentThread().getName() + " paymentInfoBreakdown，id=" + id;
    }

    /**
     * 服务熔断的兜底方法
     * @param id
     * @return
     */
    public String paymentInfoBreakdownHandler(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + " 【服务熔断】系统超时或异常，请稍后再试！！！";
    }

}
