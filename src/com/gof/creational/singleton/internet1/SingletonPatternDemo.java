package com.gof.creational.singleton.internet1;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        // get the only object available
        SingleObject object1 = SingleObject.getInstance();
        SingleObject object2 = SingleObject.getInstance();
        SingleObject object3 = SingleObject.getInstance();


        System.out.println(object1.hashCode());
        System.out.println(object2.hashCode());
        System.out.println(object3.hashCode());
    }
}
