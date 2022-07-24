package com.solid.ocp.nonviolation;

public class Rectangle implements Figure {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculator() {
        return width * height;
    }
}
