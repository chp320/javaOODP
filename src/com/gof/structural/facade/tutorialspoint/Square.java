package com.gof.structural.facade.tutorialspoint;

/**
 * Step2.
 * Create concrete classes implementing the same interface.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
