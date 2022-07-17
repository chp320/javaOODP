package com.gof.structural.decorator.gngsnTistory;

public class Client {
    public static void main(String[] args) {
        String message = "seCrEtMesSagE";
        System.out.println("Message to Send: " + message);

        Message after = new Reverse(new Encrypt(new BaseMessage()));
        after.sendMessage(message);
    }
}
