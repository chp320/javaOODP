package com.gof.behavior.strategy.internet1;

public class ChunLi extends Fighter {

    public ChunLi(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
        super(kickBehavior, jumpBehavior);
    }

    @Override
    public void display() {
        System.out.println("ChunLi");
    }
}
