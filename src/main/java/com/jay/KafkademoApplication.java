package com.jay;

import com.jay.message.Message;
 import com.jay.sender.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class KafkademoApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(KafkademoApplication.class, args);
    }

    @Autowired
    private MessageSender messageSender;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Message message = Message.builder().id(1L).msg("kobe").sendTime(new Date()).build();

        for (int i = 0; i < 3; i++) {
            //调用消息发送类中的消息发送方法
            messageSender.send("myTopic",message);
//            Thread.sleep(3000);
        }
    }
}
