package com.gof.behavior.strategy.internet1;

public class TornadoKick implements KickBehavior {
    @Override
    public void kick() {
        System.out.println("Tornado Kick");
    }
}
