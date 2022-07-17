package com.gof.structural.decorator.gngsnTistory;

// role: Decorator
public abstract class MessageDecorator implements Message {
    protected Message base ;

    public MessageDecorator(Message base) {
        this.base = base;
    }

    @Override
    public abstract void sendMessage(String message) ;

    public Message getDecoratedMessage() {
        return this.base;
    }
}
