package com.gof.behavior.observer.blog2;

public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObserver();
}
