package com.gof.creational.singleton.ver2;

/**
 * 싱글톤 패턴은 3가지 요소가 필요하다.
 * 1. new를 실행할 수 없도록 private 생성자 지정
 * 2. 유일한 단일 객체 반활을 위한 정적 메서드
 * 3. 유일한 단일 객체 참조를 위한 정적 참조 변수
 */
public class Singleton {
    // 정적 참조 변수
    private static Singleton singleton;

    // private 생성자
    private Singleton() {
        System.out.println("인스턴스 생성!");
    }

    // 정적 메서드
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
