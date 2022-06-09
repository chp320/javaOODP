package com.oodp.strategy;

public class Client {
    public static void main(String[] args) {
        Robot taekwonV = new TaekwonV("TaekwonV");
        Robot atom = new Atom("Atom");

        // 태권V의 이동/공격전략 설정: walking, punch
        taekwonV.setMovingStrategy(new WalkingStrategy());
        taekwonV.setAttackStrategy(new PunchStrategy());

        // Atom의 이동/공격전략 설정: flying, punch
        atom.setMovingStrategy(new FlyingStrategy());
        atom.setAttackStrategy(new PunchStrategy());

        System.out.println("My name is " + taekwonV.getName());
        taekwonV.move();
        taekwonV.attack();

        System.out.println();

        System.out.println("My name is " + atom.getName());
        atom.move();
        atom.attack();
    }
}
