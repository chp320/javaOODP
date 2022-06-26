package com.oodp.solid.dip.example;

public class Main {
    public static void main(String[] args) {
        PayService payService = new PayService();
        Pay samsungPay = new SamsungPay();
        payService.setPay(samsungPay);
//        payService.payment();
        System.out.println(payService.payment());

        Pay kakaoPay = new KakaoPay();
        payService.setPay(kakaoPay);
        System.out.println(payService.payment());
    }
}
