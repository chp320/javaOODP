package com.gof.behavior.observer.internet2;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {

    // 난수 발생
    private Random random = new Random();
    private int number ;

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
