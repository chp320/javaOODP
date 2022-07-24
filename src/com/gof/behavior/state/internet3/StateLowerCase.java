package com.gof.behavior.state.internet3;

public class StateLowerCase implements State {
    @Override
    public void writeName(StateContext context, String name) {
        System.out.println(name.toLowerCase());
        context.setState(new StateMultipleUpperCase());
    }
}
