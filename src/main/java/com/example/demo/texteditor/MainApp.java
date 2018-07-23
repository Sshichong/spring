package com.example.demo.texteditor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by shichong on 2018/7/23.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx =new AnnotationConfigApplicationContext(TextEditorConfig.class);

        TextEditor te =ctx.getBean(TextEditor.class);

        te.spellCheck();
    }
}
