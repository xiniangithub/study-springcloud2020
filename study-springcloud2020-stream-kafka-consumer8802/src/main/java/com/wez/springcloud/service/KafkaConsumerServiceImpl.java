package com.wez.springcloud.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;

/**
 * KafkaConsumerServiceImpl
 *
 * @Author wez
 * @Time 2021/3/28 10:00
 */
@EnableBinding(Sink.class) // 定义消息接收管道
public class KafkaConsumerServiceImpl implements KafkaConsumerService {

    @Value("${server.port}")
    private String serverPort;

    /**
     * 接收消息
     */
    @StreamListener(Sink.INPUT)
    @Override
    public void receiveMessage(Message<String> message) {
        System.out.println("服务" + serverPort + "接收到消息：" + message.getPayload());
    }

}
