package com.oodp.strategy;

public class MissileStrategy implements AttackStrategy {
    public void attack() {
        System.out.println("[MissileStrategy] I have Missile and can attack with it.");
    }
}
