package com.oodp.solid.dip.example;

public class SamsungPay implements Pay {
    @Override
    public String payment() {
        return "samsung";
    }
}
