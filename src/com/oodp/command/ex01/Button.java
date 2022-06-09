package com.oodp.command.ex01;

import com.oodp.command.ex01.command.Command;

public class Button {

    private Command command ;

    public Button(Command command) {
        setCommand(command);
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressed() {
        command.execute();
    }
}
