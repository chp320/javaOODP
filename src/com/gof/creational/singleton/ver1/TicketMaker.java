package com.gof.creational.singleton.ver1;

public class TicketMaker {
    private int ticket = 1000;

    public TicketMaker() {
        System.out.println("인스턴스 생성");
    }

    public int getNextTicketNumber() {
        return ticket++;
    }
}
