package com.oodp.solid.ocp.internet1.after;

public class Driver {

    public static void main(String[] args) {
        //
        Car[] driver = new Car[2];
        driver[0] = new Truck();
        driver[1] = new Bus();

        for (Car car : driver) {
            car.drive();
        }
    }
}
