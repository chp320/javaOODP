package com.oodp.strategy;

public class FlyingStrategy implements MovingStrategy {
    public void move() {
        System.out.println("[FlyingStrategy] I can fly.");
    }
}
