package com.solid.isp.ex01.before;

public class 현대복합기 implements 복합기 {
    @Override
    public void 인쇄() {
        System.out.println("인쇄!");
    }

    @Override
    public void 복사() {
        System.out.println("복사!");
    }

    @Override
    public void 팩스() {
        System.out.println("팩스!");
    }
}
