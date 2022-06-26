package com.gof.behavior.observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Subject 역할 수행하는 인터페이스.
 * - Subject : '관찰되는 대상'으로, 관찰자인 Observer 역할을 등록/삭제하는 메소드 존재. '현재 상태 취득' 메소드 존재
 */
public abstract class NumberGenerator {
    // Observer 저장
    private ArrayList observers = new ArrayList();

    // Observer 추가
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Observer 삭제
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    // Observer 에 통지
    public void notifyObservers() {
        Iterator it = observers.iterator();
        while (it.hasNext()) {
            Observer observer = (Observer) it.next();
            observer.update(this);
        }
    }

    // 조회
    public abstract int getNumber();

    // 수행
    public abstract void execute();
}
