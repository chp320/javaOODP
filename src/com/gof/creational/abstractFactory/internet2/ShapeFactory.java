package com.gof.creational.abstractFactory.internet2;

import com.gof.creational.factoryMethod.internet2.Circle;
import com.gof.creational.factoryMethod.internet2.Rectangle;
import com.gof.creational.factoryMethod.internet2.Shape;
import com.gof.creational.factoryMethod.internet2.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if (shape == null || shape.isEmpty()) {
            return null ;
        }

        switch (shape) {
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            case "CIRCLE":
                return new Circle();
            default:
                throw new IllegalArgumentException("Unknown shape: " + shape);
        }
    }
}
