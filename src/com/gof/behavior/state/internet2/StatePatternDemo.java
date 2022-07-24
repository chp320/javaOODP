package com.gof.behavior.state.internet2;

public class StatePatternDemo {
    public static void main(String[] args) {
        ModeSwitch modeSwitch = new ModeSwitch();

        modeSwitch.onSwitch();
        modeSwitch.onSwitch();
    }
}
