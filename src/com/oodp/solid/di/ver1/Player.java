package com.oodp.solid.di.ver1;

public class Player {
    Singer singer1 = new IU();
    // 좋아하는 가수가 생기면 계속 추가해야 한다.
    Singer singer2 = new Gfriend();

    public void runIU() {
        singer1.sayHello();
        singer1.playLists();
    }

    public void runGfriend() {
        singer2.sayHello();
        singer2.playLists();
    }
}
