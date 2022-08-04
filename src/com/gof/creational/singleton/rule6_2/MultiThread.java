package com.gof.creational.singleton.rule6_2;

import com.gof.creational.singleton.rule6_1.Singleton;

public class MultiThread extends Thread {
    private String name;

    public MultiThread(String name) {
        this.name = name;
    }

    public void run() {
        int count = 0 ;
        for (int i = 0; i < 5; i++) {
            count++;
            Singleton singleton = Singleton.getInstance();
            System.out.println(name + "의 " + count + "번째 쓰레드의 singleton 객체: " + singleton.toString());
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
