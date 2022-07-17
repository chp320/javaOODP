package com.gof.structural.decorator.baeldung;

/**
 * create some decorating element.
 * These decorators will extend our abstract TreeDecorator class and will modify its decorate() method according to our requirement.
 */
public class Lights extends TreeDecorator {
    public Lights(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate() + addLights();
    }

    public String addLights() {
        return " with Lights";
    }
}
