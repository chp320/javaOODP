package com.gof.structural.composite.readystoryTistory;

import java.util.ArrayList;
import java.util.List;

public class CompositePatternDemo {
    public static void main(String[] args) {

        // Initialize the leaf.
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir = new Circle();

        // Initialize the composite.
        Drawing drawing = new Drawing();

        // Compose the composites.
        drawing.add(tri);
        drawing.add(tri1);
        drawing.add(cir);

        drawing.draw("Red");

        List<Shape> shapes = new ArrayList<>();
        shapes.add(drawing);
        shapes.add(new Triangle());
        shapes.add(new Circle());

        for (Shape shape : shapes) {
            shape.draw("Green");
        }
    }
}
