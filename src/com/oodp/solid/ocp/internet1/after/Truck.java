package com.oodp.solid.ocp.internet1.after;

public class Truck extends Car {
    public Truck() {
        setCarType("Truck");
    }

    @Override
    public void drive() {
        super.drive();
    }
}
