package com.example.demo.texteditor;

/**
 * Created by shichong on 2018/7/23.
 */
public class TextEditor {
    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor");
        this.spellChecker=spellChecker;
    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
