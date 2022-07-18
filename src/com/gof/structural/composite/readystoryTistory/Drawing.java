package com.gof.structural.composite.readystoryTistory;

import java.util.ArrayList;
import java.util.List;

/** Composite
 * - Leaf 객체를 포함
 * - Component 를 구현
 * - Leaf 그룹에 대해 add, remove 가능한 메서드를 제공
 * */
public class Drawing implements Shape {

    // Collection of Shapes
    private List<Shape> shapes = new ArrayList<Shape>();

    @Override
    public void draw(String fillColor) {
        for (Shape shape : shapes) {
            shape.draw(fillColor);
        }
    }

    // adding shape to drawing
    public void add(Shape shape) {
        this.shapes.add(shape);
    }

    // removing shape to drawing
    public void remove(Shape shape) {
        this.shapes.remove(shape);
    }

    // removing all the shapes
    public void clear() {
        System.out.println("Cleaning all the shapes from drawing");
        this.shapes.clear();
    }
}
