package com.gof.structural.decorator.java_design_patterns;

public class DecoratorMain {
    public static void main(String[] args) {
        System.out.println("A simple looking troll approaches.");
        Troll troll = new SimpleTroll();
        troll.attack();
        troll.fleeBattle();
        System.out.println("Simple troll power: " + troll.getAttackPower());

        System.out.println();

        System.out.println("A troll with huge club surprise you.");
        ClubbedTroll clubbedTroll = new ClubbedTroll(troll);
        clubbedTroll.attack();
        clubbedTroll.fleeBattle();
        System.out.println("Clubbed troll power: " + clubbedTroll.getAttackPower());
    }
}
