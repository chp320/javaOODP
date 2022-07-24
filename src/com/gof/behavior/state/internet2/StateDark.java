package com.gof.behavior.state.internet2;

/**
 * ConcreteState
 */
public class StateDark implements State {
    @Override
    public void toggle(ModeSwitch modeSwitch) {
        System.out.println("Turn on the Switch.");
        modeSwitch.setState(new StateLight());
    }
}
