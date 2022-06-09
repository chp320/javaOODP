package com.oodp.strategy;

public class PunchStrategy implements AttackStrategy {
    public void attack() {
        System.out.println("[PunchStrategy] I have strong punch and can attack with it.");
    }
}
