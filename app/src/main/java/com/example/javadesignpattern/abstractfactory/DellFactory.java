package com.example.javadesignpattern.abstractfactory;

public class DellFactory extends AbstractFactory{


    @Override
    public Computer creatComputer(Class<?> clz) {
        return new DellComputer();
    }

    @Override
    public NoteComputer creatNote(Class<?> clz) {
        return new DellNoteComputer();
    }
}
