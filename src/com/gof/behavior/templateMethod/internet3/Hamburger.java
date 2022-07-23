package com.gof.behavior.templateMethod.internet3;

// abstractClass
public abstract class Hamburger {
    // 비공통화 영역
    public abstract void stack_ingredient();

    // 햄버거 만드는 정형화된 순서
    public void cook() {
        stack_bread();
        stack_patty();
        stack_ingredient();
        stack_bread();
    }

    public void stack_patty() {
        System.out.println("패티를 올린다.");
    }

    public void stack_bread() {
        System.out.println("빵을 깐다.");
    }
}
