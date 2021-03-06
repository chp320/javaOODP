package com.gof.creational.singleton.ver2;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println("s1: " + s1.hashCode());
        System.out.println("s2: " + s2.hashCode());
        System.out.println("s3: " + s3.hashCode());
    }
}
