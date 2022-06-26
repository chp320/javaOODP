package com.gof.creational.singleton.ver1;

public class NewTicketMaker {
    private static int ticket = 1000;

    private NewTicketMaker() {
        System.out.println("인스턴스 생성!");
    }

    public static int getNextTicketNumber() {
        return ticket++;
    }
}
