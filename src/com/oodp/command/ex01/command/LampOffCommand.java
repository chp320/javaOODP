package com.oodp.command.ex01.command;

import com.oodp.command.ex01.Lamp;
import com.oodp.command.ex01.command.Command;

public class LampOffCommand implements Command {

    private Lamp lamp;

    public LampOffCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turnOff();
    }
}
