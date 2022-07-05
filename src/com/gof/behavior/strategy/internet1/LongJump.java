package com.gof.behavior.strategy.internet1;

public class LongJump implements JumpBehavior {
    @Override
    public void jump() {
        System.out.println("Long Jump");
    }
}
