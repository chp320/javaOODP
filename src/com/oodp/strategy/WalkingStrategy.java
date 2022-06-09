package com.oodp.strategy;

public class WalkingStrategy implements MovingStrategy {
    public void move() {
        System.out.println("[WalkingStrategy] I can only walk.");
    }
}
