package com.gof.creational.singleton.rule6_1;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();  // getInstance() 메서드에 바로 접근

        Instance instance = new Instance();             // 객체 생성 후, getInstance() 메서드에 접근
        instance.getInstance();

        System.out.println("----------------------------");

        for (int i = 0; i < 3; i++) {
            Singleton single = Singleton.getInstance();
            System.out.println("singleton: " + single.toString());
        }

        for (int i = 0; i < 3; i++) {
            Instance ins = new Instance();
            ins.getInstance();
            System.out.println("instance: " + ins.toString());
        }
    }
}
