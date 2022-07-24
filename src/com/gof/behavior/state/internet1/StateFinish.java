package com.gof.behavior.state.internet1;

public class StateFinish implements State {
    @Override
    public void process() {
        System.out.println("처리완료");
    }
}
