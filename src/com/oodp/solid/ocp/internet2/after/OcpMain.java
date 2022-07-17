package com.oodp.solid.ocp.internet2.after;

public class OcpMain {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        double result = calculation.calculateFigure(new Circle(2));
        System.out.println("result = " + result);

        result = calculation.calculateFigure(new Rectangle(2, 4));
        System.out.println("result = " + result);
    }
}
