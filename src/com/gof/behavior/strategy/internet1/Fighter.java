package com.gof.behavior.strategy.internet1;

/**
 * 기본적인 행위(behavior)를 가지고 있는 클래스
 * 특정 행위(behavior)는 전략 인터페이스 클래스에 위임
 */
public abstract class Fighter {
    // field for delegation
    private KickBehavior kickBehavior ;
    private JumpBehavior jumpBehavior ;

    public Fighter(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
        this.kickBehavior = kickBehavior;
        this.jumpBehavior = jumpBehavior;
    }

    public void punch() {
        System.out.println("Default Punch");
    }

    public void kick() {
        // delegate to kick behavior
        kickBehavior.kick();
    }

    public void jump() {
        // delegate to jump behavior
        jumpBehavior.jump();
    }

    public void roll() {
        System.out.println("Default Roll");
    }

    public void setKickBehavior(KickBehavior kickBehavior) {
        this.kickBehavior = kickBehavior;
    }

    public void setJumpBehavior(JumpBehavior jumpBehavior) {
        this.jumpBehavior = jumpBehavior;
    }

    public abstract void display();
}
