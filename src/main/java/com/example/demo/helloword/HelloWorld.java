package com.example.demo.helloword;

/**
 * Created by shichong on 2018/7/23.
 */
public class HelloWorld {
    private String message;

    public void setMessage(String message){
        this.message=message;
    }
    public void getMessage(){
        System.out.println("Your Message:"+message);
    }
}
