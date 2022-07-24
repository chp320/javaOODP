package com.gof.behavior.state.internet1;

public class StateOrder implements State {
    @Override
    public void process() {
        System.out.println("주문");
    }
}
