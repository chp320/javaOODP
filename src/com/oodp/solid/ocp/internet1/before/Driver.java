package com.oodp.solid.ocp.internet1.before;

public class Driver {

    public static void main(String[] args) {

        // 트럭 인스턴스 생성
        Truck truck = new Truck();
        truck.drive();

        // 버스 인스턴스 생성
        Bus bus = new Bus();
        bus.drive();

        // 만일 새로운 운전수단(택시, 전기차, .. )이 추가될 경우, 계속 새로운 drive() 수행 필요!
    }
}
