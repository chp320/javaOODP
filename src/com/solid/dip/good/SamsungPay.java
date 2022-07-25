package com.solid.dip.good;

public class SamsungPay implements Pay {
    @Override
    public String payment() {
        return "samsung";
    }
}
