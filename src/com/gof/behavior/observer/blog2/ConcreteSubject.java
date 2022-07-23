package com.gof.behavior.observer.blog2;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    List<Observer> clients = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        clients.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        clients.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : clients) {
            observer.noti();
        }

        System.out.println("[Subject] 메시지를 전송하였습니다.");
    }
}
