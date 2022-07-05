package com.gof.behavior.strategy.internet1;

public class Ryu extends Fighter {

    public Ryu(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
        super(kickBehavior, jumpBehavior);
    }

    @Override
    public void display() {
        System.out.println("Ryu");
    }
}
