package com.gof.behavior.templateMethod.internet3;

public class BulgogiBurger extends Hamburger {
    @Override
    public void stack_ingredient() {
        System.out.println("양상추를 올린다.");
    }
}
