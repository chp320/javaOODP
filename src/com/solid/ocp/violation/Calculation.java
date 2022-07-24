package com.solid.ocp.violation;

public class Calculation {

    // calculate circle.
    public double calculationCircle(Circle circle) {
        // 원의 넓이 = 반지름 * 반지름 * 3.14
        return circle.radious * circle.radious * 3.14;
    }

    // Rectangle 클래스 추가됨에 따라 calculationRectangle 클래스 추가됨
    public double calculationRectangle(Rectangle rectangle) {
        // 사각형 넓이 = 가로 * 높이
        return rectangle.width * rectangle.height;
    }
}
