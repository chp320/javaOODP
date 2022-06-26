package com.oodp.solid.ocp.good;

public class Netflix implements OTTService {
    @Override
    public String watch() {
        return "Netflix!";
    }
}
