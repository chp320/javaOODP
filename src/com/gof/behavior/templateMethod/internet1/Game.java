package com.gof.behavior.templateMethod.internet1;

public abstract class Game {
    // concrete class에서 override 필요한 대상
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    // template method
    public final void play() {
        // initial the game
        initialize();

        // start game
        startPlay();

        // end game
        endPlay();
    }
}
