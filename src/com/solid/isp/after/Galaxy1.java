package com.solid.isp.after;

public class Galaxy1 implements SmartPhone, Galaxy1Function {
    @Override
    public String mp3() {
        return "play mp3";
    }

    @Override
    public String telephone() {
        return "ring ring";
    }

    @Override
    public String internet() {
        return "connect complete!";
    }
}
