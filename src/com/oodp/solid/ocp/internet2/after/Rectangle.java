package com.oodp.solid.ocp.internet2.after;

public class Rectangle implements Figure {
    public double width;
    public double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculator() {
        return width * length;
    }
}
