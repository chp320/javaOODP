package com.gof.behavior.observer.blog2;

// ConcreteObserver
public class Client2 implements Observer {

    private String title;

    public Client2(String title) {
        this.title = title;
    }

    @Override
    public void noti() {
        System.out.println("클라이언트 " + title + "에 변경사항이 반영됨.");
    }
}
