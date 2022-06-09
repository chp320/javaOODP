package com.oodp.command.ex01.command;

import com.oodp.command.ex01.Lamp;

public class LampOnCommand implements Command {

    private Lamp lamp ;

    public LampOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turnOn();
    }
}
