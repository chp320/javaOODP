package com.gof.behavior.strategy.internet1;

// reference - https://www.geeksforgeeks.org/strategy-pattern-set-2/?ref=lbp
public class StreetFighterMain {
    public static void main(String[] args) {
        // let's make some behaviors first
        JumpBehavior shorJump = new ShortJump();
        JumpBehavior longJump = new LongJump();
        KickBehavior tornadoKick = new TornadoKick();

        // make a fighter with desired behaviors
        Fighter ken = new Ken(tornadoKick, shorJump);
        ken.display();

        // test behaviors
        ken.punch();
        ken.kick();
        ken.jump();

        // change behavior dynamically (algorithms are interchangeable)
        ken.setJumpBehavior(longJump);
        ken.jump();
    }
}
