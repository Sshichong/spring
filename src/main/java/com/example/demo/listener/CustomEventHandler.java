package com.example.demo.listener;

import org.springframework.context.ApplicationListener;

/**
 * Created by shichong on 2018/7/23.
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        System.out.println(customEvent.toString());
    }
}
