package com.gof.creational.abstractFactory.internet2;

import com.gof.creational.factoryMethod.internet2.Circle;
import com.gof.creational.factoryMethod.internet2.Rectangle;
import com.gof.creational.factoryMethod.internet2.Shape;
import com.gof.creational.factoryMethod.internet2.Square;

public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if (color == null || color.isEmpty()) {
            return null ;
        }

        switch (color) {
            case "YELLOW":
                return new Yellow();
            case "ORANGE":
                return new Orange();
            case "PURPLE":
                return new Purple();
            default:
                throw new IllegalArgumentException("Unknown color: " + color);
        }
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
