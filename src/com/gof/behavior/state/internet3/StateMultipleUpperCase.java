package com.gof.behavior.state.internet3;

public class StateMultipleUpperCase implements State {
    @Override
    public void writeName(StateContext context, String name) {
        System.out.println(name.toUpperCase());
        context.setState(new StateLowerCase());
    }
}
