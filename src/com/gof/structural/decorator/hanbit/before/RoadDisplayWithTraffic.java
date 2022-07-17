package com.gof.structural.decorator.hanbit.before;

public class RoadDisplayWithTraffic extends RoadDisplay {
    public void draw() {
        super.draw();   // 상위 클래스 RoadDisplay의 draw 메서드를 호출해서 기본 도로를 표시함
        drawTraffic();
    }

    public void drawTraffic() {
        System.out.println("교통량 표시");
    }
}
