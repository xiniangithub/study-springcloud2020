package com.wez.springcloud.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * KafkaProducerServiceImpl
 *
 * @Author wez
 * @Time 2021/3/27 21:40
 */
@EnableBinding(Source.class) // 定义消息推送管道
public class KafkaProducerServiceImpl implements KafkaProducerService {

    @Resource
    private MessageChannel output; // 消息发送管道

    @Override
    public void sendMessage() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build()); // 发送消息

        System.out.println("---> serial: " + serial);
    }

}
