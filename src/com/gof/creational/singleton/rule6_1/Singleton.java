package com.gof.creational.singleton.rule6_1;

public class Singleton {
    private Singleton() {}                                         // 외부에서 생성을 막기 위해 디폴트 생성자의 접근 제한자를 private 으로 지정
//    private static Singleton singleton = null;                     // new 를 통한 객체를 미리 생성하지 않고 null로 초기화 후 필요 시 생성  => Lazy Initialization
    /*
//    public static Singleton getInstance() {                      // 메모리에 올라간 메서드를 외부에서 사용할 수 있게 하기 위함
    public static synchronized Singleton getInstance() {           // 메서드에 synchronized 키워드를 붙혀 동기화 처리
        if (singleton == null) {
            System.out.println("싱글톤 생성...");
            singleton = new Singleton();
        }
        return singleton;
    }
    */

    /*
    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
    */

    public static Singleton getInstance() {
        return LazyHolder.singleton;
    }

    private static class LazyHolder {
        private static final Singleton singleton = new Singleton();
    }
}
