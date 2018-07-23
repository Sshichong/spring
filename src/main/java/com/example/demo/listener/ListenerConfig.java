package com.example.demo.listener;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by shichong on 2018/7/23.
 */
@Configuration
public class ListenerConfig {
    @Bean
    public CustomEventHandler customEventHandler(){
        return new CustomEventHandler();
    }
    @Bean
    public CustomEventPublisher customEventPublisher(){
        return new CustomEventPublisher();
    }
    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}
