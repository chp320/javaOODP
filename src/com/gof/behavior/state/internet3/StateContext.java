package com.gof.behavior.state.internet3;

public class StateContext {
    private State state;

    public StateContext() {
        setState(new StateLowerCase());
    }

    /**
     * Setter method for the state. Normally only called by classes implementing the state interface.
     * @param state -> the new state of this context
     */
    public void setState(State state) {
        this.state = state;
    }

    public void writeName(String name) {
        state.writeName(this, name);
    }
}
