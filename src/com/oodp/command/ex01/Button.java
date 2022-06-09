package com.oodp.command.ex01;

public class Button {
    private Lamp lamp ;
    private Alarm alarm ;
    private Mode mode ;

    public Button(Lamp lamp) {
        this.lamp = lamp;
    }

    public Button(Lamp lamp, Alarm alarm) {
        this.lamp = lamp;
        this.alarm = alarm;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public void pressed() {
//        lamp.turnOn();
        // OCP위반을 수정..
        /*
        switch (mode) {
            case LAMP:
                lamp.turnOn();
                break;
            case ALARM:
                alarm.start();
                break;
        }
        */

        // Command 추상 객체에 의존하도록 수정

    }
}
