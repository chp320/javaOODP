package com.oodp.solid.dip.example;

public class KakaoPay implements Pay {
    @Override
    public String payment() {
        return "kakao";
    }
}
