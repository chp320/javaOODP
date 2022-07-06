package com.gof.creational.singleton.internet1;

public class SingleObject {

    // create an object of SingleObject (final 키워드를 사용해서 다시 값이 할당 되는 것을 방지, multi-thread 환경..)
    private static final SingleObject instance = new SingleObject();

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
