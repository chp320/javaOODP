package com.oodp.state.ex01;

public class Light {
    // 형광등 상태 표현하는 상수
    private static int ON = 0 ;
    private static int OFF = 1 ;

    // 형광등의 현재 상태
    private int state ;

    public Light() {
        // 형광등 초기 상태는 꺼져 있는 상태
        state = OFF ;
    }

    // 행위를 처리하는 메서드 - on_button_pushed(), off_button_pushed
    public void on_button_pushed() {
        // 현재 ON 상태이면 반응 없음
        if (state == ON) {
            System.out.println("반응 없음");
        } else {
            // 형광등이 OFF 상태이면 ON 버튼 누르면 켜진 상태로 전환됨
            System.out.println("Light ON!");
            state = ON;
        }
    }

    public void off_button_pushed() {
        // 현재 OFF 상태이면 반응 없음
        if (state == OFF) {
            System.out.println("반응 없음");
        } else {
            // 형광등이 ON 상태이면 OFF 버튼 눌렸을 시 꺼진 상태로 전환됨
            System.out.println("Lisght OFF!");
            state = OFF;
        }
    }
}
