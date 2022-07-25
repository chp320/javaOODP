package com.solid.dip.good;

public class KakaoPay implements Pay {
    @Override
    public String payment() {
        return "kakao";
    }
}
