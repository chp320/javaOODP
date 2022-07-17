package com.gof.structural.decorator.baeldung;

public class DefaultChristmasTree implements ChristmasTree {
    @Override
    public String decorate() {
        return "Default Christmas Tree";
    }
}
