package com.gof.structural.facade.tutorialspoint;

/**
 * Step4.
 * Use the facade to draw various types of shapes.
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
