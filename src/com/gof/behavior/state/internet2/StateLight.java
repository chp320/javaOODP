package com.gof.behavior.state.internet2;

/**
 * ConcreteState
 */
public class StateLight implements State {
    @Override
    public void toggle(ModeSwitch modeSwitch) {
        System.out.println("Turn off the Switch.");
        modeSwitch.setState(new StateDark());
    }
}
