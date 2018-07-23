package com.example.demo.listener;

import org.springframework.context.ApplicationEvent;

/**
 * Created by shichong on 2018/7/23.
 */
public class CustomEvent extends ApplicationEvent {
    public CustomEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "My Custom Event";
    }
}
