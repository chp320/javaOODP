package com.solid.dip.bad;

public class PayService {
    private SamsungPay samsungPay;

    public void setSamsungPay(SamsungPay samsungPay) {
        this.samsungPay = samsungPay;
    }

    public String payment() {
        return samsungPay.payment();
    }
}
