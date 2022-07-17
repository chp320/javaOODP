package com.gof.structural.decorator.baeldung;

public class Flowers extends TreeDecorator {
    public Flowers(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate() + addFlowers();
    }

    public String addFlowers() {
        return " with Flowers";
    }
}
