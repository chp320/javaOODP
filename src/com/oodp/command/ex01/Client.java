package com.oodp.command.ex01;

import com.oodp.command.ex01.command.AlarmOnCommand;
import com.oodp.command.ex01.command.Command;
import com.oodp.command.ex01.command.LampOffCommand;
import com.oodp.command.ex01.command.LampOnCommand;

public class Client {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Command lampOnCommand = new LampOnCommand(lamp);
        Command lampOffCommand = new LampOffCommand(lamp);

        // 램프 켜는 커맨드 실행
        Button button = new Button(lampOnCommand);
        button.pressed();

        // 램프 끄는 커맨드 실행
        // 커맨드를 바꿔야 하는데 button 생성자 최초 호출 시 커맨드를 넘겨서 생성했고, 다시 커맨드를 수정해야하므로 setter를 통해 커맨드를 수정한다.
        button.setCommand(lampOffCommand);
        button.pressed();
    }
}
