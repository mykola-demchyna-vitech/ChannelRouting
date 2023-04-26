package com.example.channelrouting.channel;

import org.springframework.stereotype.Component;

@Component("firstChannel")
public class FirstChannel implements Channel {
    @Override
    public void send(String message) {
        System.out.println("The first channel : " + message);
    }
}
