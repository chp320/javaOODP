package com.oodp.solid.dip.example;

import org.junit.jupiter.api.Test;

class PayServiceTest {

    private PayService payService = new PayService();

    @Test
    public void 삼성페이_정상_결제_테스트() {
        // given
        Pay samsungPay = new SamsungPay();

        // when
        payService.setPay(samsungPay);

        // then

    }
}