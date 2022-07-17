package com.oodp.solid.ocp.internet1.after;

public class Car {
    public String carType = "" ;

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void drive() {
        System.out.println(carType + " Drive!");
    }
}
