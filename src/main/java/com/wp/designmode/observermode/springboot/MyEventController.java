package com.wp.designmode.observermode.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangpeng
 * @description MyEventController
 * @date 2024/8/9 09:35
 **/
@RestController
@RequestMapping("/testMyEvent")
public class MyEventController {
    @Autowired
    private MyEventPublisher myEventPublisher;

    @RequestMapping("publish/{message}")
    public void publishMyEvent(@PathVariable("message") String message) {
        myEventPublisher.publishEvent(message);
    }
}
