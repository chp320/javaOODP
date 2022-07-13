package com.gof.structural.facade.javatpoint;

/**
 * Step3.
 * Create a Samsung implementation class that will implement MobileShop interface.
 */
public class Samsung implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println("Samsung Galaxy S20");
    }

    @Override
    public void price() {
        System.out.println("699999");
    }
}
