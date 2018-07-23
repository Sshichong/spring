package com.example.demo.helloword;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by shichong on 2018/7/23.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorld.class);

        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

        helloWorld.setMessage("Hello shichong");
        helloWorld.getMessage();
    }
}
