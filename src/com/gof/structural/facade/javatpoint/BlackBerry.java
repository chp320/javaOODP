package com.gof.structural.facade.javatpoint;

/**
 * Step4.
 * Create a BlackBerry implementation class that will implement MobileShop interface.
 */
public class BlackBerry implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println("BlackBerry Z10");
    }

    @Override
    public void price() {
        System.out.println("799999");
    }
}
