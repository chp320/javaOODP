package com.solid.isp.ex01.before;

public class ISPDemo {
    public static void main(String[] args) {
        현대복합기 hyundai1 = new 현대복합기();
        hyundai1.인쇄();
        hyundai1.복사();
        hyundai1.팩스();

        현대프린터 hyundai2 = new 현대프린터();
        hyundai2.인쇄();
        hyundai2.복사();
        hyundai2.팩스();
    }
}
