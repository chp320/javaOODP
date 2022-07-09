package com.gof.creational.factoryMethod.internet1;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an Push notification");
    }
}
