package com.gof.creational.abstractFactory.internet2;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice == null || choice.isEmpty()) {
            return null ;
        }

        switch (choice) {
            case "SHAPE":
                return new ShapeFactory();
            case "COLOR":
                return new ColorFactory();
            default:
                throw new IllegalArgumentException("Unknown choice: " + choice);
        }
    }
}