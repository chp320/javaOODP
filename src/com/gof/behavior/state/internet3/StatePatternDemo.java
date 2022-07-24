package com.gof.behavior.state.internet3;

public class StatePatternDemo {
    public static void main(String[] args) {
        StateContext sc = new StateContext();
        sc.writeName("Monday");
        sc.writeName("Tuesday");
        sc.writeName("Wednesday");
        sc.writeName("Thursday");
        sc.writeName("Friday");
        sc.writeName("Saturday");
        sc.writeName("Sunday");
    }
}
