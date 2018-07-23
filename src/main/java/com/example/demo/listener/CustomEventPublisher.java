package com.example.demo.listener;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Created by shichong on 2018/7/23.
 */
public class CustomEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher=publisher;
    }

    public void publish(){
        CustomEvent ce = new CustomEvent(this);
        publisher.publishEvent(ce);
    }
}
