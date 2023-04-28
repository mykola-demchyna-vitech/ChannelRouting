package com.example.channelrouting.service;

import com.example.channelrouting.channel.Channel;
import com.example.channelrouting.resource.ResourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ChannelService {
    private final Map<String, Channel> channels;

    @Autowired
    public ChannelService(Map<String, Channel> channels) {
        this.channels = channels;
    }

    public <T> void push(T resource, ResourceType resourceType, String[] channelsName) {
        for (String channelName : channelsName) {
            if (channels.containsKey(channelName)) {
                channels.get(channelName).send(resource, resourceType);
            }
        }
    }
}
