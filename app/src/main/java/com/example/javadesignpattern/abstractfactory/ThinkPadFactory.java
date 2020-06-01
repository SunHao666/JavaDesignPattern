package com.example.javadesignpattern.abstractfactory;

public class ThinkPadFactory extends AbstractFactory{


    @Override
    public Computer creatComputer(Class<?> clz) {
        return new ThinkPadComputer();
    }

    @Override
    public NoteComputer creatNote(Class<?> clz) {
        return new ThinkPadNoteComputer();
    }
}
