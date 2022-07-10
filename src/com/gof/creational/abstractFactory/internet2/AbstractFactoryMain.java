package com.gof.creational.abstractFactory.internet2;

import com.gof.creational.factoryMethod.internet2.Shape;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("CIRCLE");
        shape3.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color1 = colorFactory.getColor("YELLOW");
        color1.fill();
        Color color2 = colorFactory.getColor("ORANGE");
        color2.fill();
        Color color3 = colorFactory.getColor("PURPLE");
        color3.fill();
    }
}
