package com.gof.structural.decorator.gngsnTistory;

import java.util.Base64;

public class Encrypt extends MessageDecorator {
    public Encrypt(Message base) {
        super(base);
    }

    public String B64Encode(String messageToEncrypt) {
        byte[] bytesEncoded = Base64.getEncoder().encode(messageToEncrypt.getBytes());
        return new String(bytesEncoded);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("encrypt: " + message);
        this.getDecoratedMessage().sendMessage(B64Encode(message));
    }
}
