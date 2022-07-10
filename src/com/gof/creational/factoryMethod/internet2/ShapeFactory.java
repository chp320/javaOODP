package com.gof.creational.factoryMethod.internet2;

public class ShapeFactory {

    public Shape getShape(String shapeType) {

        if (shapeType == null || shapeType.isEmpty()) {
            return null ;
        }

        switch (shapeType) {
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            case "CIRCLE":
                return new Circle();
            default:
                throw new IllegalArgumentException("Unknown shapeType: " + shapeType);
        }
    }
}
