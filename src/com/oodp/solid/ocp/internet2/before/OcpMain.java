package com.oodp.solid.ocp.internet2.before;

public class OcpMain {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Calculation calculation = new Calculation();
        double result = calculation.calculationCircle(circle);
        System.out.println("result = " + result);

        Rectangle rectangle = new Rectangle(2, 4);
        result = calculation.calculationRectangle(rectangle);   // calculationRectangle() 를 새로 구현 후, main에서 호출 필요!
        System.out.println("result = " + result);
    }
}
