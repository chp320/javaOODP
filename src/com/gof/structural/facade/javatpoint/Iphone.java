package com.gof.structural.facade.javatpoint;

/**
 * Step2.
 * Create a Iphone implementation class that will implement MobileShop interface.
 */
public class Iphone implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println("iPhone 6");
    }

    @Override
    public void price() {
        System.out.println("599999");
    }
}
