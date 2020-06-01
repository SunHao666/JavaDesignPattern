package com.example.javadesignpattern.abstractfactory;

public class DellNoteComputer implements NoteComputer{
    @Override
    public void start() {
        System.out.println("DellNoteComputer 启动了");
    }
}
