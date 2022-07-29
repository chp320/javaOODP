package com.oodp.wikibooks.expert001_01;

public class Car {
    private Tire tire;

    public Car() {
        // 자동차(Car)가 타이어를 생산(new) => 의존 관계가 일어난다!!
        tire = new KoreaTire();
//        tire = new AmericaTire();
    }

    public String getTireBrand() {
        return "장착된 타이어: " + tire.getBrand();
    }
}
