package com.gof.structural.adapter.geeksforgeeks;

public class AdapterMain {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();

        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("ToyDuck...");
        toyDuck.squeak();

        // wrap a bird in birdAdapter
        // so that it behaves like toy duck
        ToyDuck birdAdapter = new BirdAdapter(sparrow);

        // toy duck behaving like a bird
        System.out.println("BirdAdapter...");
        birdAdapter.squeak();

    }
}
