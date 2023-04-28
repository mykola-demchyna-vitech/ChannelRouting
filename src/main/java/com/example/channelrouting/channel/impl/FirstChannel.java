package com.example.channelrouting.channel.impl;

import com.example.channelrouting.channel.Channel;
import com.example.channelrouting.resource.ResourceType;
import com.example.channelrouting.resource.impl.FirstResource;
import com.example.channelrouting.resource.impl.SecondResource;
import com.example.channelrouting.resource.impl.ThirdResource;
import org.springframework.stereotype.Component;

@Component("firstChannel")
public class FirstChannel implements Channel {

    @Override
    public <T> void send(T resource, ResourceType resourceType) {
        System.out.println("The first channel :");
        if (resourceType.equals(ResourceType.FIRST)) {
            FirstResource firstResource = (FirstResource) resource;
            System.out.println("Resource name : " + firstResource.getName() + ", resource value : " + firstResource.getValue());
        }
        if (resourceType.equals(ResourceType.SECOND)) {
            SecondResource secondResource = (SecondResource) resource;
            System.out.println("Resource name : " + secondResource.getName() + ", resource value : " + secondResource.getValue());
        }
        if (resourceType.equals(ResourceType.THIRD)) {
            ThirdResource thirdResource = (ThirdResource) resource;
            System.out.println("Resource name : " + thirdResource.getName() + ", resource value : " + thirdResource.getValue());
        }
    }
}
