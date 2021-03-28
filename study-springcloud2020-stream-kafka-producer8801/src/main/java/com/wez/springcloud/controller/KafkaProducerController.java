package com.wez.springcloud.controller;

import com.wez.springcloud.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * KafkaProducerController
 *
 * @Author wez
 * @Time 2021/3/27 21:58
 */
@RestController
@RequestMapping("/kafka_producer")
public class KafkaProducerController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @GetMapping("/send_message")
    public void sendMessage() {
        kafkaProducerService.sendMessage();
    }

}
