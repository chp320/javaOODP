package com.gof.creational.singleton.rule6_2;

public class MultiMain {
    public static void main(String[] args) {

        MultiThread AAA = new MultiThread("AAA");
        MultiThread BBB = new MultiThread("BBB");

        AAA.start();
        BBB.start();
    }
}
