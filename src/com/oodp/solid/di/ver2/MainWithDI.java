package com.oodp.solid.di.ver2;

public class MainWithDI {
    public static void main(String[] args) {
        // 의존 객체 생성
        Singer singer = new IU();
//        Singer singer = new Gfriend();

        // 생성자를 활용한 DI
        Player player = new Player(singer);
        player.run();
    }
}
