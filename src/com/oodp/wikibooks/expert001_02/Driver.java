package com.oodp.wikibooks.expert001_02;

public class Driver {
    public static void main(String[] args) {
        // 기존 Car 클래스에서 생성하던 Tire를 Driver 클래스에서 생성하고, 생성된 tire 객체참조변수를 Car 생성자의 인자로 전달함.
        Tire tire = new KoreaTire();
//        Tire tire = new AmericaTire();

        // Car 입장에서는 단순히 Tire 인터페이스를 구현한 어떤 객체가 넘어오기만 하면 정상 작동한다.
        // 만일 새로운 타이어가 나오더라도 Tire 인터페이스를 구현한다면 Car 클래스를 수정하지 않아도 된다.
        Car car = new Car(tire);

        System.out.println(car.getTireBrand());
    }
}
