package com.gof.structural.proxy.ver1.before;

public class MainWithNoProxy {
    public static void main(String[] args) {
        // 프록시를 이용하지 않은 호출
        Service service = new Service();
        System.out.println(service.runSomething());
    }
}
