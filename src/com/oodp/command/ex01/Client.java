package com.oodp.command.ex01;

public class Client {
    public static void main(String[] args) {
        // 버튼을 누르는 동작에 따라 다른 기능 실행하기 위한 리팩터링
        /*
        Lamp lamp = new Lamp();
        Button button = new Button(lamp);
        button.pressed();
        */

        Lamp lamp = new Lamp() ;
        Alarm alarm = new Alarm();
        Button button = new Button(lamp, alarm);

        // 모드 설정 - 램프
        button.setMode(Mode.LAMP);
        button.pressed();

        // 모드 설정 - 알람
        button.setMode(Mode.ALARM);
        button.pressed();
    }
}
