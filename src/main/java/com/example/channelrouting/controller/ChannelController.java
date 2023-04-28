package com.example.channelrouting.controller;

import com.example.channelrouting.resource.ResourceType;
import com.example.channelrouting.resource.impl.FirstResource;
import com.example.channelrouting.resource.impl.SecondResource;
import com.example.channelrouting.resource.impl.ThirdResource;
import com.example.channelrouting.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("channel/send")
public class ChannelController {

    private final ChannelService channelService;

    @Autowired
    public ChannelController(ChannelService channelService) {
        this.channelService = channelService;
    }

    @PostMapping("first")
    public void sendFirstResource(@RequestBody FirstResource firstResource) {
        channelService.push(firstResource, ResourceType.FIRST, new String[] {"firstChannel", "thirdChannel"});
    }

    @PostMapping("second")
    public void sendFirstResource(@RequestBody SecondResource secondResource) {
        channelService.push(secondResource, ResourceType.FIRST, new String[] {"firstChannel", "secondChannel"});
    }

    @PostMapping("third")
    public void sendThirdResource(@RequestBody ThirdResource thirdResource) {
        channelService.push(thirdResource, ResourceType.FIRST, new String[] {"secondChannel", "thirdChannel"});
    }
}
