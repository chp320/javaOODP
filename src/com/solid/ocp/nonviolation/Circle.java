package com.solid.ocp.nonviolation;

public class Circle implements Figure {

    private double radious;

    public Circle(double radious) {
        this.radious = radious;
    }

    @Override
    public double calculator() {
        return radious * radious * 3.14;
    }
}
