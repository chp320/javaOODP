package com.solid.isp.bad;

public class Galaxy1 implements SmartPhone {
    @Override
    public String telephone() {
        return "ring ring";
    }

    @Override
    public String mp3() {
        return "play mp3";
    }

    @Override
    public String internet() {
        return "connect complete!";
    }
}
