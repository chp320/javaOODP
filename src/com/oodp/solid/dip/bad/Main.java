package com.oodp.solid.dip.bad;

public class Main {
    public static void main(String[] args) {
        Kid kid = new Kid();
        Pororo toy1 = new Pororo();
        kid.setToy(toy1);
        System.out.println(kid.play());

//        Carbot toy2 = new Carbot();
//        kid.setToy(toy2);
    }
}
