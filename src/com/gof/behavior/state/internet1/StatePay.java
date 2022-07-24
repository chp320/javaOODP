package com.gof.behavior.state.internet1;

public class StatePay implements State {
    @Override
    public void process() {
        System.out.println("결제중");
    }
}
