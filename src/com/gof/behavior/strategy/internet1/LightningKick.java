package com.gof.behavior.strategy.internet1;

public class LightningKick implements KickBehavior {
    @Override
    public void kick() {
        System.out.println("Lightning Kick");
    }
}
