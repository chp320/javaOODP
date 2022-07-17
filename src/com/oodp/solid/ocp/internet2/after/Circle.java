package com.oodp.solid.ocp.internet2.after;

public class Circle implements Figure {
    public double radious;

    public Circle(double radious) {
        this.radious = radious;
    }

    @Override
    public double calculator() {
        return radious * radious / 3.14;
    }
}
