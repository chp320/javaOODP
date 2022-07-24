package com.gof.behavior.state.internet1;

public class StatePatternDemo {
    public static void main(String[] args) {
        Order order = new Order();

        order.process("ORDER");
        order.process("PAY");
        order.process("ORDERED");
        order.process("FINISH");
    }
}
