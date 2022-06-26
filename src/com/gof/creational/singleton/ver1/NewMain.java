package com.gof.creational.singleton.ver1;

public class NewMain {
    public static void main(String[] args) {
        int result1 = NewTicketMaker.getNextTicketNumber();
        int result2 = NewTicketMaker.getNextTicketNumber();

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
