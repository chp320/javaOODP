package com.gof.creational.abstractFactory.internet1;

public class CarFactory {
    private CarFactory() {}

    public static Car buildCar(CarType model) {
        Car car = null ;

        // currently just using INDIA as Location for test
        Location location = Location.INDIA;

        switch (location) {
            case USA:
                car = USACarFactory.buildCar(model);
                break;
            case INDIA:
                car = IndiaCarFactory.buildCar(model);
                break;
            default:
                car = DefaultCarFactory.buildCar(model);
                break;
        }
        return car;
    }
}
