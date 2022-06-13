package com.oodp.observer.ex03;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    // 추상화된 통보 목록
    private List<Observer> observers = new ArrayList<Observer>();

    // 옵저버(통보대상) 추가
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // 옵저버(통보대상) 제거
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // 옵저버(통보대상) 목록 변경을 통보
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
