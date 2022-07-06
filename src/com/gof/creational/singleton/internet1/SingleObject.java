package com.gof.creational.singleton.internet1;

public class SingleObject {

    // create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    // make constructor private so that this class cannot be instantiated
    private SingleObject(){
        System.out.println("Create Instance!");
    }

    // get the only object available
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }

}
