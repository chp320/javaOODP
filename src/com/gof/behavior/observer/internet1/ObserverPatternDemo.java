package com.gof.behavior.observer.internet1;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        // create concrete classes
        // subject 객체를 Object의 concrete class의 생성자 인수로 전달하며 동일한 주소를 바라봄
        // 자, 그러면 Subject 클래스는 싱글톤으로 생성해야 하지 않을까??
        Observer observer1 = new HexaObserver(subject);
        Observer observer2 = new OctalObserver(subject);
        Observer observer3 = new BinaryObserver(subject);

        /*
        System.out.println(subject);
        System.out.println(observer1);
        System.out.println(observer1.subject);
        System.out.println(observer2);
        System.out.println(observer2.subject);
        System.out.println(observer3);
        System.out.println(observer3.subject);
        */

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
