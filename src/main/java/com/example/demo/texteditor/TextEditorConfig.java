package com.example.demo.texteditor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by shichong on 2018/7/23.
 */
@Configuration
public class TextEditorConfig {
    @Bean
    public TextEditor textEditor(){
        return new TextEditor(spellChecker());
    }

    @Bean
    public SpellChecker spellChecker(){
        return new SpellChecker();
    }
}
