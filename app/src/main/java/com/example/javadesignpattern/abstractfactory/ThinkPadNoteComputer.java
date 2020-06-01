package com.example.javadesignpattern.abstractfactory;

public class ThinkPadNoteComputer implements NoteComputer{
    @Override
    public void start() {
        System.out.println("ThinkPadNoteComputer 启动了");
    }
}
