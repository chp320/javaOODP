package com.gof.creational.singleton.internet1;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        // get the only object available
        SingleObject object = SingleObject.getInstance();

        object.showMessage();

    }
}
