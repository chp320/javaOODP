package com.oodp.solid.di.ver2;

public class Player {
    private Singer singer ;

    public Player(Singer singer) {
        this.singer = singer;
    }

    public void run() {
        singer.sayHello();
        singer.playLists();
    }
}
