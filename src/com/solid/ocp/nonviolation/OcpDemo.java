package com.solid.ocp.nonviolation;

public class OcpDemo {
    public static void main(String[] args) {

        Calculation calculation = new Calculation();
        Figure circle = new Circle(2);
        Figure rectangle = new Rectangle(2, 3);

        System.out.println("circle: " + calculation.calculationFigure(circle));
        System.out.println("rectangle: " + calculation.calculationFigure(rectangle));
    }
}
