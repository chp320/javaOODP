package com.gof.structural.facade.tutorialspoint;

/**
 * Step2.
 * Create concrete classes implementing the same interface.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
