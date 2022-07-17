package com.gof.structural.decorator.java_design_patterns;

/**
 * intent - Attach additional responsibilities to an object dynamically.
 * reference - https://java-design-patterns.com/patterns/decorator/
 */
public interface Troll {
    public void attack();

    public int getAttackPower();

    public void fleeBattle();
}
