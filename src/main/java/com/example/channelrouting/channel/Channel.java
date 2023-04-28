package com.example.channelrouting.channel;

import com.example.channelrouting.resource.impl.FirstResource;
import com.example.channelrouting.resource.ResourceType;
import com.example.channelrouting.resource.impl.SecondResource;
import com.example.channelrouting.resource.impl.ThirdResource;

public interface Channel {
    <T> void send(T resource, ResourceType resourceType);
}
