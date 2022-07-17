package com.gof.structural.decorator.baeldung;

public class DecorateDemo {

    public static void main(String[] args) {
        // 기본 트리스마스 트리만 존재
        ChristmasTree tree = new DefaultChristmasTree();
        System.out.println(tree.decorate());

        // christmas tree + lights
        ChristmasTree treeWithLights = new Lights(new DefaultChristmasTree());
        System.out.println(treeWithLights.decorate());

        // christmas tree + lights + flowers
        ChristmasTree treeWithLightsAndFlowers = new Flowers(new Lights(new DefaultChristmasTree()));
        System.out.println(treeWithLightsAndFlowers.decorate());
    }
}
