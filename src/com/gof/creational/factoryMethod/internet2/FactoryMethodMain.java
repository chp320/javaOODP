package com.gof.creational.factoryMethod.internet2;

public class FactoryMethodMain {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Shape 인터페이스를 구현한 Shape 타입의 RECTANGLE, SQUARE, CIRCLE 클래스 생성
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
    }
}
