package com.oodp.singleton.ex02;

/*
 * 멀티 쓰레드 환경에서 쓰레드 간 '경합조건'이 발생할 경우 인스턴스가 1개가 아니라 2개 이상 생성될 수 있는 문제점 확인
 */

class Printer {
    private static Printer printer = null;
    private int counter = 0 ;
    private Printer() {}

    public static Printer getPrinter() {
        if (printer == null) {
            try {
                Thread.sleep(1);    // 다른 쓰레드를 통한 경합 조건이 발생하지 않도록 1ms sleep 처리
            } catch (InterruptedException e) {}
            printer = new Printer();    // Printer 인스턴스 생성
        }
        return printer;
    }

    public void print(String str) {
        counter++ ;
        System.out.println(str+counter);
    }
}

class UserThread extends Thread {
    public UserThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        Printer printer = Printer.getPrinter();
        printer.print(Thread.currentThread().getName() + " print using " + printer.toString() + ".");
    }
}

public class CheckRaceCondition {
    // 쓰레드 수 설정 : 5
    private static final int THREAD_NUM = 5 ;

    public static void main(String[] args) {
        UserThread[] userThreads = new UserThread[THREAD_NUM];
        for (int i = 0; i < THREAD_NUM; i++) {
            userThreads[i] = new UserThread((i + 1) + "-thread");
            userThreads[i].start();
        }
    }
}
