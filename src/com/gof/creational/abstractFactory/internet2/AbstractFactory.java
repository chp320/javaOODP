package com.gof.creational.abstractFactory.internet2;

import com.gof.creational.factoryMethod.internet2.Shape;

public abstract class AbstractFactory {
    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
