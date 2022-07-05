package com.gof.behavior.strategy.internet1;

public class Ken extends Fighter {

    public Ken(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
        super(kickBehavior, jumpBehavior);
    }

    @Override
    public void display() {
        System.out.println("Ken");
    }
}
