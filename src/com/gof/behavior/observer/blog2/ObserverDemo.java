package com.gof.behavior.observer.blog2;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        ClientDaemon daemon = new ClientDaemon(subject);

        daemon.start();
    }
}
