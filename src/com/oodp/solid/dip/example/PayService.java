package com.oodp.solid.dip.example;

public class PayService {
    private Pay pay ;

    public void setPay(Pay pay) {
        this.pay = pay;
    }

    public String payment() {
        return pay.payment();
    }
}
