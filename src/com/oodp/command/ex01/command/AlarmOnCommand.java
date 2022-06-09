package com.oodp.command.ex01.command;

import com.oodp.command.ex01.Alarm;

public class AlarmOnCommand implements Command {

    private Alarm alarm ;

    public AlarmOnCommand(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public void execute() {
        alarm.start();
    }
}
