package com.gof.structural.adapter.volt;

/**
 * 120V를 값으로 가지는 volt 객체 생성
 */
public class Socket {
    public Volt getVolt() {
        return new Volt(120);
    }
}
