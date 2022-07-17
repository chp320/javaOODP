package com.gof.structural.decorator.hanbit.before;

public class Client {
    public static void main(String[] args) {
        RoadDisplay road = new RoadDisplay();
        road.draw();    // 기본 도로만 표시

        RoadDisplayWithLane lane = new RoadDisplayWithLane();
        lane.draw();    // 기본 도로 + 차선 표시
    }
}
