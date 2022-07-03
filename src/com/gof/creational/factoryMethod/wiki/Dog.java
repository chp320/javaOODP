package com.gof.creational.factoryMethod.wiki;

public class Dog extends Animal {
    @Override
    AnimalToy getToy() {
        return new DogToy();
    }
}
