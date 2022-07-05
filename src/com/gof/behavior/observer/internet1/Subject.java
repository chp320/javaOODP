package com.gof.behavior.observer.internet1;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state ;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    // observer 추가
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // 변경사항 통지
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
