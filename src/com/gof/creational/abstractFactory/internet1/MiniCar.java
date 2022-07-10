package com.gof.creational.abstractFactory.internet1;

public class MiniCar extends Car {
    public MiniCar(Location location) {
        super(CarType.MINI, location);
        construct();
    }
    @Override
    public void construct() {
        System.out.println("Connecting to Mini Car");
    }
}
