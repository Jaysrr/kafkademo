package com.jay.message;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @program: kafkademo
 * @description:
 * @author: Jaysrr
 * @create: 2020-03-02 09:08
 **/
@Data
@Builder
public class Message {
    private Long id;    //id
    private String msg; //消息
    private Date sendTime;  //时间戳
}
