package com.gof.structural.adapter.volt;

/**
 * 기존 120V 외에 3V, 12V 객체 생성하는 어댑터 인터페이스
 */
public interface SocketAdapter {
    public Volt get120Volt();

    public Volt get12Volt();

    public Volt get3Volt();
}
