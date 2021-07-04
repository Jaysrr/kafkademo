package com.jay.sender;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jay.message.Message;
 import com.jay.utils.JsonUtils;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @program: kafkademo
 * @description:
 * @author: Jaysrr
 * @create: 2020-03-02 09:11
 **/
@Component
public class MessageSender {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send(String topic, Message message) {
//        Topic topic = Topic.builder().id(1L).msg("kobe").sendTime(new Date()).build();
        kafkaTemplate.send("myTopic", JsonUtils.objectToJson(topic));
    }

}
