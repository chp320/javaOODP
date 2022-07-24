package com.gof.behavior.state.internet2;

/**
 * Context - 상태(on/off)를 갖는 객체와 실행하는 클라이언트 구현
 */
public class ModeSwitch {
    private State modeState = new StateDark();

    public ModeSwitch() {
        System.out.println("Switch was created.");
    }

    public void setState(State modeState) {
        this.modeState = modeState;
    }

    public void onSwitch() {
        modeState.toggle(this);
    }
}
