package com.example.demo.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by shichong on 2018/7/23.
 */
public class MainApp {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ListenerConfig.class);

        CustomEventPublisher cvp = (CustomEventPublisher)context.getBean("customEventPublisher");

        cvp.publish();
        cvp.publish();

    }
}
