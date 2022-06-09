package com.oodp.command.ex01;

import com.oodp.command.ex01.command.AlarmOnCommand;
import com.oodp.command.ex01.command.Command;
import com.oodp.command.ex01.command.LampOnCommand;

public class Client {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Command lampOnCommand = new LampOnCommand(lamp);

        Alarm alarm = new Alarm();
        Command alarmOnCommand = new AlarmOnCommand(alarm);

        // 램프 켜는 커맨드 설정
        Button button1 = new Button(lampOnCommand);
        button1.pressed();

        // 알람 켜는 커맨드 설정
        Button button2 = new Button(alarmOnCommand);
        button2.pressed();
    }
}
