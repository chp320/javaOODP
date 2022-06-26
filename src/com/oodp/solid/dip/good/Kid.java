package com.oodp.solid.dip.good;

public class Kid {
    private Toy toy;

    public void setToy(Toy toy) {
        this.toy = toy;
    }

    public String play() {
        return toy.play();
    }
}
