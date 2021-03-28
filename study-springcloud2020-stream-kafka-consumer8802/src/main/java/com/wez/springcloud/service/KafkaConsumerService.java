package com.wez.springcloud.service;

import org.springframework.messaging.Message;

/**
 * KafkaConsumerService
 *
 * @Author wez
 * @Time 2021/3/28 10:00
 */
public interface KafkaConsumerService {

    /**
     * 接收消息
     */
    void receiveMessage(Message<String> message);

}
