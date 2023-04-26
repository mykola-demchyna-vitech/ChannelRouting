package com.example.channelrouting.channel;

import org.springframework.stereotype.Component;

@Component("thirdChannel")
public class ThirdChannel implements Channel {
    @Override
    public void send(String message) {
        System.out.println("The third channel : " + message);
    }
}
