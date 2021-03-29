package com.wez.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * NacosConfigClientController
 *
 * @Author wez
 * @Time 2021/3/29 22:02
 */
@RestController
@RequestMapping("/config")
@RefreshScope // 支持Nacos动态刷新
public class NacosConfigClientController {

    // 从Nacos注册中心获取配置
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/get")
    public String getConfigInfo() {
        return configInfo;
    }

}
