package com.gof.structural.decorator.gngsnTistory;

// role: concreteDecorator(1)
public class Reverse extends MessageDecorator {
    public Reverse(Message base) {
        super(base);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("reverse: " + message);
        this.getDecoratedMessage().sendMessage(reverser(message));
    }

    private String reverser(String messageToReverse) {
        return new StringBuilder(messageToReverse).reverse().toString();
    }
}
