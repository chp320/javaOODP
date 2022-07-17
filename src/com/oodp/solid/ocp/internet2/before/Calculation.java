package com.oodp.solid.ocp.internet2.before;

public class Calculation {
    public double calculationCircle(Circle circle) {
        return circle.radious * circle.radious / 3.14;
    }

    // Rectangle이 새로 추가됨에 따라 계산식도 추가되어야 한다. -> extension: open, modificaion: open
    public double calculationRectangle(Rectangle rectangle) {
        return rectangle.width * rectangle.length;
    }
}
