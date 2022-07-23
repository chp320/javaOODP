package com.gof.behavior.templateMethod.internet3;

public class templateMethodDemo {
    public static void main(String[] args) {
        Hamburger bulgogi = new BulgogiBurger();
        Hamburger cheese = new CheeseBurger();

        bulgogi.cook();
        System.out.println("------------");
        cheese.cook();
    }
}
