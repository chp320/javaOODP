package com.gof.creational.factoryMethod.wiki;

public class Cat extends Animal {
    @Override
    AnimalToy getToy() {
        return new CatToy();
    }
}
