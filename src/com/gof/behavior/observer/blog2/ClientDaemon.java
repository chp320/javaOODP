package com.gof.behavior.observer.blog2;

import java.util.Random;

public class ClientDaemon extends Thread {
    private Subject subject ;
    Random random = new Random();

    public ClientDaemon(Subject subject) {
        this.subject = subject;
    }

    public void run() {
        int count = 0 ;
        while (true) {
            // 랜덤으로 notify하도록 설정
            if ((random.nextInt(10) + 1) % 3 == 0) {
//                System.out.println("value1: " + random.nextInt(10));
//                System.out.println("value2: " + random.nextInt(10)+1);
//                System.out.println("value3: " + random.nextInt(10)+1%3);
                subject.notifyObserver();
            }

            // 카운트마다 다르게 client를 attach
            if (count % 2 == 0) {
                subject.attach(new Client1(count+""));
            } else {
                subject.attach(new Client2(count+""));
            }
            count++ ;
//            System.out.println("count = " + count);

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
