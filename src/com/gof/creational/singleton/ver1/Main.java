package com.gof.creational.singleton.ver1;

public class Main {
    public static void main(String[] args) {
        TicketMaker ticketMaker1 = new TicketMaker();
        int result1 = ticketMaker1.getNextTicketNumber();
        System.out.println("result1 = " + result1);

        TicketMaker ticketMaker2 = new TicketMaker();
        int result2 = ticketMaker2.getNextTicketNumber();
        System.out.println("result2 = " + result2);
    }
}
