package com.solid.dip.good;

public class DipDemo {
    public static void main(String[] args) {
        PayService payService = new PayService();

        // 삼성페이가 정상 처리된다.
        Pay samsung = new SamsungPay();
        payService.setPay(samsung);
        if ("samsung".equals(payService.payment())) {
            System.out.println(payService.payment() + ": 맞음");
        } else {
            System.out.println(payService.payment() + ": 아님");
        }

        // 카카오페이가 정상 처리된다.
        Pay kakao = new KakaoPay();
        payService.setPay(kakao);
        if ("kakao".equals(payService.payment())) {
            System.out.println(payService.payment() + ": 맞음");
        } else {
            System.out.println(payService.payment() + ": 아님");
        }
    }
}
