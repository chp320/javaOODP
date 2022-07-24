package com.gof.behavior.state.internet2;

/**
 * 상태 패턴의 핵심인, 상태를 처리하는 "인터페이스"
 */
public interface State {
    void toggle(ModeSwitch modeSwitch);
}
