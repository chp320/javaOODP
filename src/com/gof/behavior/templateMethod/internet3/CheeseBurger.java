package com.gof.behavior.templateMethod.internet3;

public class CheeseBurger extends Hamburger {
    @Override
    public void stack_ingredient() {
        System.out.println("치즈를 올린다.");
    }
}
