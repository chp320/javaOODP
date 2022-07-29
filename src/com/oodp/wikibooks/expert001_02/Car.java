package com.oodp.wikibooks.expert001_02;

public class Car {
    Tire tire;

    // 생성자 인자가 앞선 소스와 상이하다.
    public Car(Tire tire) {
        this.tire = tire;   // 기존 소스에서 new 를 통해 타이어를 생성하였는데, 인자로 넘어온 tire를 멤버필드에 맵핑한다.
    }

    public String getTireBrand() {
        return "장착된 타이어: " + tire.getBrand();
    }
}
