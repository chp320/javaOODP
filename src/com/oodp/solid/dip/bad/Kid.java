package com.oodp.solid.dip.bad;

public class Kid {
    private Pororo toy;

    /**
     * @param toy
     * Pororo 타입 외에 Carbot, Juju 등 다른 타입 추가가 필요한 경우 setToy() 메서드도 수정이 필요하다!!
     */
    public void setToy(Pororo toy) {
        this.toy = toy;
    }

    public String play() {
        return toy.play();
    }
}
