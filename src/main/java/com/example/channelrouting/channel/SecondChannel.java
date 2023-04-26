package com.example.channelrouting.channel;

import org.springframework.stereotype.Component;

@Component("secondChannel")
public class SecondChannel implements Channel {
    @Override
    public void send(String message) {
        System.out.println("The second channel : " + message);
    }
}
