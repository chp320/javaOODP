package com.gof.behavior.strategy.internet1;

public class ShortJump implements JumpBehavior {
    @Override
    public void jump() {
        System.out.println("Short Jump");
    }
}
